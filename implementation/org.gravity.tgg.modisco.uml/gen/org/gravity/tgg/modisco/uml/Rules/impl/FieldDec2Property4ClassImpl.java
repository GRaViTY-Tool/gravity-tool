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
import org.eclipse.modisco.java.ClassDeclaration;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;

import org.gravity.modisco.MFieldDefinition;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4Class;
import org.gravity.tgg.modisco.uml.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Field Dec2 Property4 Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldDec2Property4ClassImpl extends AbstractRuleImpl implements FieldDec2Property4Class {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldDec2Property4ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldDec2Property4Class();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MFieldDefinition bodyDeclaration, ClassDeclaration jOwnerType) {

		Object[] result1_black = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_0_1_initialbindings_blackBBBB(this, match, bodyDeclaration,
						jOwnerType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jOwnerType] = "
					+ jOwnerType + ".");
		}

		Object[] result2_bindingAndBlack = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, bodyDeclaration,
						jOwnerType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jOwnerType] = "
					+ jOwnerType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldDec2Property4ClassImpl
					.pattern_FieldDec2Property4Class_0_4_collectelementstobetranslated_blackBBB(match, bodyDeclaration,
							jOwnerType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jOwnerType] = " + jOwnerType + ".");
			}
			FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_0_4_collectelementstobetranslated_greenBBBFF(
					match, bodyDeclaration, jOwnerType);
			//nothing EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = FieldDec2Property4ClassImpl
					.pattern_FieldDec2Property4Class_0_5_collectcontextelements_blackBBB(match, bodyDeclaration,
							jOwnerType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jOwnerType] = " + jOwnerType + ".");
			}
			FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_0_5_collectcontextelements_greenBBB(match,
					bodyDeclaration, jOwnerType);

			// 
			FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_0_6_registerobjectstomatch_expressionBBBB(this,
					match, bodyDeclaration, jOwnerType);
			return FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_0_7_expressionF();
		} else {
			return FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Property feature = (Property) result1_bindingAndBlack[0];
		ASTNode2Element nd2ne = (ASTNode2Element) result1_bindingAndBlack[1];
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class uOwnerType = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[3];
		ClassDeclaration jOwnerType = (ClassDeclaration) result1_bindingAndBlack[4];
		ASTNode2Element jo2uo = (ASTNode2Element) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_1_1_performtransformation_greenBB(feature,
				uOwnerType);

		Object[] result2_green = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, feature, nd2ne,
						bodyDeclaration, uOwnerType, jOwnerType, jo2uo);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[feature] = " + feature + ", " + "[nd2ne] = " + nd2ne + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[uOwnerType] = " + uOwnerType + ", " + "[jOwnerType] = " + jOwnerType
					+ ", " + "[jo2uo] = " + jo2uo + ".");
		}
		FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_1_3_bookkeepingforedges_greenBBBBBFFF(ruleresult,
				feature, bodyDeclaration, uOwnerType, jOwnerType);
		//nothing EMoflonEdge uOwnerType__feature____ownedAttribute = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = (EMoflonEdge) result3_green[7];

		// 
		// 
		FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo);
		return FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_binding[0];
		ClassDeclaration jOwnerType = (ClassDeclaration) result2_binding[1];
		for (Object[] result2_black : FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_2_2_corematch_blackFFBFBFB(bodyDeclaration, jOwnerType, match)) {
			Property feature = (Property) result2_black[0];
			ASTNode2Element nd2ne = (ASTNode2Element) result2_black[1];
			org.eclipse.uml2.uml.Class uOwnerType = (org.eclipse.uml2.uml.Class) result2_black[3];
			ASTNode2Element jo2uo = (ASTNode2Element) result2_black[5];
			// ForEach 
			for (Object[] result3_black : FieldDec2Property4ClassImpl
					.pattern_FieldDec2Property4Class_2_3_findcontext_blackBBBBBB(feature, nd2ne, bodyDeclaration,
							uOwnerType, jOwnerType, jo2uo)) {
				Object[] result3_green = FieldDec2Property4ClassImpl
						.pattern_FieldDec2Property4Class_2_3_findcontext_greenBBBBBBFFFFFFF(feature, nd2ne,
								bodyDeclaration, uOwnerType, jOwnerType, jo2uo);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge nd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge nd2ne__feature____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge jo2uo__uOwnerType____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge jo2uo__jOwnerType____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = FieldDec2Property4ClassImpl
						.pattern_FieldDec2Property4Class_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[nd2ne] = " + nd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[uOwnerType] = " + uOwnerType + ", " + "[jOwnerType] = " + jOwnerType + ", "
							+ "[jo2uo] = " + jo2uo + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FieldDec2Property4ClassImpl
							.pattern_FieldDec2Property4Class_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MFieldDefinition bodyDeclaration, ClassDeclaration jOwnerType) {
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("jOwnerType", jOwnerType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MFieldDefinition bodyDeclaration, ClassDeclaration jOwnerType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Property feature, ASTNode2Element nd2ne,
			MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType,
			ASTNode2Element jo2uo) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("nd2ne", nd2ne);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
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
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject feature, EObject nd2ne,
			EObject bodyDeclaration, EObject uOwnerType, EObject jOwnerType, EObject jo2uo) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("nd2ne", nd2ne);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("uOwnerType", uOwnerType);
		ruleresult.registerObject("jOwnerType", jOwnerType);
		ruleresult.registerObject("jo2uo", jo2uo);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Property feature, org.eclipse.uml2.uml.Class uOwnerType) {

		Object[] result1_black = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_10_1_initialbindings_blackBBBB(this, match, feature, uOwnerType);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[uOwnerType] = " + uOwnerType + ".");
		}

		Object[] result2_bindingAndBlack = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, feature, uOwnerType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[uOwnerType] = " + uOwnerType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldDec2Property4ClassImpl
					.pattern_FieldDec2Property4Class_10_4_collectelementstobetranslated_blackBBB(match, feature,
							uOwnerType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uOwnerType] = " + uOwnerType + ".");
			}
			FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_10_4_collectelementstobetranslated_greenBBBF(
					match, feature, uOwnerType);
			//nothing EMoflonEdge uOwnerType__feature____ownedAttribute = (EMoflonEdge) result4_green[3];

			Object[] result5_black = FieldDec2Property4ClassImpl
					.pattern_FieldDec2Property4Class_10_5_collectcontextelements_blackBBB(match, feature, uOwnerType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uOwnerType] = " + uOwnerType + ".");
			}
			FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_10_5_collectcontextelements_greenBBB(match,
					feature, uOwnerType);

			// 
			FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_10_6_registerobjectstomatch_expressionBBBB(this,
					match, feature, uOwnerType);
			return FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_10_7_expressionF();
		} else {
			return FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Property feature = (Property) result1_bindingAndBlack[0];
		ASTNode2Element nd2ne = (ASTNode2Element) result1_bindingAndBlack[1];
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class uOwnerType = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[3];
		ClassDeclaration jOwnerType = (ClassDeclaration) result1_bindingAndBlack[4];
		ASTNode2Element jo2uo = (ASTNode2Element) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_11_1_performtransformation_greenBB(bodyDeclaration,
				jOwnerType);

		Object[] result2_green = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, feature, nd2ne,
						bodyDeclaration, uOwnerType, jOwnerType, jo2uo);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[feature] = " + feature + ", " + "[nd2ne] = " + nd2ne + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[uOwnerType] = " + uOwnerType + ", " + "[jOwnerType] = " + jOwnerType
					+ ", " + "[jo2uo] = " + jo2uo + ".");
		}
		FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_11_3_bookkeepingforedges_greenBBBBBFFF(ruleresult,
				feature, bodyDeclaration, uOwnerType, jOwnerType);
		//nothing EMoflonEdge uOwnerType__feature____ownedAttribute = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = (EMoflonEdge) result3_green[7];

		// 
		// 
		FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_11_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo);
		return FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Property feature = (Property) result2_binding[0];
		org.eclipse.uml2.uml.Class uOwnerType = (org.eclipse.uml2.uml.Class) result2_binding[1];
		for (Object[] result2_black : FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_12_2_corematch_blackBFFBFFB(feature, uOwnerType, match)) {
			ASTNode2Element nd2ne = (ASTNode2Element) result2_black[1];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_black[2];
			ClassDeclaration jOwnerType = (ClassDeclaration) result2_black[4];
			ASTNode2Element jo2uo = (ASTNode2Element) result2_black[5];
			// ForEach 
			for (Object[] result3_black : FieldDec2Property4ClassImpl
					.pattern_FieldDec2Property4Class_12_3_findcontext_blackBBBBBB(feature, nd2ne, bodyDeclaration,
							uOwnerType, jOwnerType, jo2uo)) {
				Object[] result3_green = FieldDec2Property4ClassImpl
						.pattern_FieldDec2Property4Class_12_3_findcontext_greenBBBBBBFFFFFF(feature, nd2ne,
								bodyDeclaration, uOwnerType, jOwnerType, jo2uo);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge uOwnerType__feature____ownedAttribute = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge nd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge nd2ne__feature____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge jo2uo__uOwnerType____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge jo2uo__jOwnerType____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = FieldDec2Property4ClassImpl
						.pattern_FieldDec2Property4Class_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[nd2ne] = " + nd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[uOwnerType] = " + uOwnerType + ", " + "[jOwnerType] = " + jOwnerType + ", "
							+ "[jo2uo] = " + jo2uo + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = FieldDec2Property4ClassImpl
							.pattern_FieldDec2Property4Class_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Property feature, org.eclipse.uml2.uml.Class uOwnerType) {
		match.registerObject("feature", feature);
		match.registerObject("uOwnerType", uOwnerType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Property feature, org.eclipse.uml2.uml.Class uOwnerType) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Property feature, ASTNode2Element nd2ne,
			MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType,
			ASTNode2Element jo2uo) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("nd2ne", nd2ne);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject feature, EObject nd2ne,
			EObject bodyDeclaration, EObject uOwnerType, EObject jOwnerType, EObject jo2uo) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("nd2ne", nd2ne);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("uOwnerType", uOwnerType);
		ruleresult.registerObject("jOwnerType", jOwnerType);
		ruleresult.registerObject("jo2uo", jo2uo);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_117(EMoflonEdge _edge_ownedAttribute) {

		Object[] result1_bindingAndBlack = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_20_2_testcorematchandDECs_blackFFB(_edge_ownedAttribute)) {
			Property feature = (Property) result2_black[0];
			org.eclipse.uml2.uml.Class uOwnerType = (org.eclipse.uml2.uml.Class) result2_black[1];
			Object[] result2_green = FieldDec2Property4ClassImpl
					.pattern_FieldDec2Property4Class_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldDec2Property4ClassImpl
					.pattern_FieldDec2Property4Class_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, feature, uOwnerType)) {
				// 
				if (FieldDec2Property4ClassImpl
						.pattern_FieldDec2Property4Class_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = FieldDec2Property4ClassImpl
							.pattern_FieldDec2Property4Class_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_121(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_21_2_testcorematchandDECs_blackFFB(_edge_bodyDeclarations)) {
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_black[0];
			ClassDeclaration jOwnerType = (ClassDeclaration) result2_black[1];
			Object[] result2_green = FieldDec2Property4ClassImpl
					.pattern_FieldDec2Property4Class_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldDec2Property4ClassImpl
					.pattern_FieldDec2Property4Class_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, bodyDeclaration, jOwnerType)) {
				// 
				if (FieldDec2Property4ClassImpl
						.pattern_FieldDec2Property4Class_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = FieldDec2Property4ClassImpl
							.pattern_FieldDec2Property4Class_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FieldDec2Property4Class");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

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
		ruleResult.setRule("FieldDec2Property4Class");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

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

		Object[] result1_black = FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Property feature = (Property) result2_bindingAndBlack[0];
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_bindingAndBlack[1];
		org.eclipse.uml2.uml.Class uOwnerType = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[2];
		ClassDeclaration jOwnerType = (ClassDeclaration) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, feature, bodyDeclaration,
						uOwnerType, jOwnerType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[feature] = " + feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
					+ "[uOwnerType] = " + uOwnerType + ", " + "[jOwnerType] = " + jOwnerType + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : FieldDec2Property4ClassImpl
					.pattern_FieldDec2Property4Class_24_5_matchcorrcontext_blackBFBBBFBB(feature, bodyDeclaration,
							uOwnerType, jOwnerType, sourceMatch, targetMatch)) {
				ASTNode2Element nd2ne = (ASTNode2Element) result5_black[1];
				ASTNode2Element jo2uo = (ASTNode2Element) result5_black[5];
				Object[] result5_green = FieldDec2Property4ClassImpl
						.pattern_FieldDec2Property4Class_24_5_matchcorrcontext_greenBBBBF(nd2ne, jo2uo, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = FieldDec2Property4ClassImpl
						.pattern_FieldDec2Property4Class_24_6_createcorrespondence_blackBBBBB(feature, bodyDeclaration,
								uOwnerType, jOwnerType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[uOwnerType] = " + uOwnerType
							+ ", " + "[jOwnerType] = " + jOwnerType + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = FieldDec2Property4ClassImpl
						.pattern_FieldDec2Property4Class_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Property feature, MFieldDefinition bodyDeclaration,
			org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MFieldDefinition bodyDeclaration, ClassDeclaration jOwnerType) {// 
		Object[] result1_black = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_27_1_matchtggpattern_blackBB(bodyDeclaration, jOwnerType);
		if (result1_black != null) {
			return FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_27_2_expressionF();
		} else {
			return FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Property feature, org.eclipse.uml2.uml.Class uOwnerType) {// 
		Object[] result1_black = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_28_1_matchtggpattern_blackBB(feature, uOwnerType);
		if (result1_black != null) {
			return FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_28_2_expressionF();
		} else {
			return FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element nd2neParameter,
			ASTNode2Element jo2uoParameter) {

		Object[] result1_black = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : FieldDec2Property4ClassImpl
				.pattern_FieldDec2Property4Class_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList nd2neList = (RuleEntryList) result2_black[0];
			Property feature = (Property) result2_black[1];
			ASTNode2Element nd2ne = (ASTNode2Element) result2_black[2];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_black[3];
			//nothing RuleEntryList jo2uoList = (RuleEntryList) result2_black[4];
			org.eclipse.uml2.uml.Class uOwnerType = (org.eclipse.uml2.uml.Class) result2_black[5];
			ASTNode2Element jo2uo = (ASTNode2Element) result2_black[6];
			ClassDeclaration jOwnerType = (ClassDeclaration) result2_black[7];

			Object[] result3_bindingAndBlack = FieldDec2Property4ClassImpl
					.pattern_FieldDec2Property4Class_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
						+ "[nd2ne] = " + nd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
						+ "[uOwnerType] = " + uOwnerType + ", " + "[jOwnerType] = " + jOwnerType + ", " + "[jo2uo] = "
						+ jo2uo + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = FieldDec2Property4ClassImpl
						.pattern_FieldDec2Property4Class_29_5_checknacs_blackBBBBBB(feature, nd2ne, bodyDeclaration,
								uOwnerType, jOwnerType, jo2uo);
				if (result5_black != null) {

					Object[] result6_black = FieldDec2Property4ClassImpl
							.pattern_FieldDec2Property4Class_29_6_perform_blackBBBBBBB(feature, nd2ne, bodyDeclaration,
									uOwnerType, jOwnerType, jo2uo, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[feature] = " + feature + ", "
										+ "[nd2ne] = " + nd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
										+ "[uOwnerType] = " + uOwnerType + ", " + "[jOwnerType] = " + jOwnerType + ", "
										+ "[jo2uo] = " + jo2uo + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_29_6_perform_greenBBBBB(feature,
							bodyDeclaration, uOwnerType, jOwnerType, ruleResult);

				} else {
				}

			} else {
			}

		}
		return FieldDec2Property4ClassImpl.pattern_FieldDec2Property4Class_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Property feature, ASTNode2Element nd2ne,
			MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType,
			ASTNode2Element jo2uo, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("nd2ne", nd2ne);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
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
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___IS_APPROPRIATE_FWD__MATCH_MFIELDDEFINITION_CLASSDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MFieldDefinition) arguments.get(1),
					(ClassDeclaration) arguments.get(2));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MFIELDDEFINITION_CLASSDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MFieldDefinition) arguments.get(1),
					(ClassDeclaration) arguments.get(2));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MFIELDDEFINITION_CLASSDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MFieldDefinition) arguments.get(1),
					(ClassDeclaration) arguments.get(2));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PROPERTY_ASTNODE2ELEMENT_MFIELDDEFINITION_CLASS_CLASSDECLARATION_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Property) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (MFieldDefinition) arguments.get(3),
					(org.eclipse.uml2.uml.Class) arguments.get(4), (ClassDeclaration) arguments.get(5),
					(ASTNode2Element) arguments.get(6));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___IS_APPROPRIATE_BWD__MATCH_PROPERTY_CLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (Property) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PROPERTY_CLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Property) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PROPERTY_CLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Property) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROPERTY_ASTNODE2ELEMENT_MFIELDDEFINITION_CLASS_CLASSDECLARATION_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Property) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (MFieldDefinition) arguments.get(3),
					(org.eclipse.uml2.uml.Class) arguments.get(4), (ClassDeclaration) arguments.get(5),
					(ASTNode2Element) arguments.get(6));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_117__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_117((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_121__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_121((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__PROPERTY_MFIELDDEFINITION_CLASS_CLASSDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Property) arguments.get(0), (MFieldDefinition) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (ClassDeclaration) arguments.get(3),
					(Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___CHECK_DEC_FWD__MFIELDDEFINITION_CLASSDECLARATION:
			return checkDEC_FWD((MFieldDefinition) arguments.get(0), (ClassDeclaration) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___CHECK_DEC_BWD__PROPERTY_CLASS:
			return checkDEC_BWD((Property) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PROPERTY_ASTNODE2ELEMENT_MFIELDDEFINITION_CLASS_CLASSDECLARATION_ASTNODE2ELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Property) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (MFieldDefinition) arguments.get(3),
					(org.eclipse.uml2.uml.Class) arguments.get(4), (ClassDeclaration) arguments.get(5),
					(ASTNode2Element) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.FIELD_DEC2_PROPERTY4_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldDec2Property4Class_0_1_initialbindings_blackBBBB(
			FieldDec2Property4Class _this, Match match, MFieldDefinition bodyDeclaration, ClassDeclaration jOwnerType) {
		return new Object[] { _this, match, bodyDeclaration, jOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Class_0_2_SolveCSP_bindingFBBBB(
			FieldDec2Property4Class _this, Match match, MFieldDefinition bodyDeclaration, ClassDeclaration jOwnerType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, bodyDeclaration, jOwnerType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, bodyDeclaration, jOwnerType };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Class_0_2_SolveCSP_bindingAndBlackFBBBB(
			FieldDec2Property4Class _this, Match match, MFieldDefinition bodyDeclaration, ClassDeclaration jOwnerType) {
		Object[] result_pattern_FieldDec2Property4Class_0_2_SolveCSP_binding = pattern_FieldDec2Property4Class_0_2_SolveCSP_bindingFBBBB(
				_this, match, bodyDeclaration, jOwnerType);
		if (result_pattern_FieldDec2Property4Class_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Class_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property4Class_0_2_SolveCSP_black = pattern_FieldDec2Property4Class_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Class_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, bodyDeclaration, jOwnerType };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Class_0_3_CheckCSP_expressionFBB(
			FieldDec2Property4Class _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_0_4_collectelementstobetranslated_blackBBB(Match match,
			MFieldDefinition bodyDeclaration, ClassDeclaration jOwnerType) {
		return new Object[] { match, bodyDeclaration, jOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Class_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, MFieldDefinition bodyDeclaration, ClassDeclaration jOwnerType) {
		EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jOwnerType__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		jOwnerType__bodyDeclaration____bodyDeclarations.setSrc(jOwnerType);
		jOwnerType__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(jOwnerType__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setTrg(jOwnerType);
		match.getToBeTranslatedEdges().add(bodyDeclaration__jOwnerType____abstractTypeDeclaration);
		jOwnerType__bodyDeclaration____bodyDeclarations
				.setName(jOwnerType__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration
				.setName(bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime);
		return new Object[] { match, bodyDeclaration, jOwnerType, jOwnerType__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jOwnerType____abstractTypeDeclaration };
	}

	public static final Object[] pattern_FieldDec2Property4Class_0_5_collectcontextelements_blackBBB(Match match,
			MFieldDefinition bodyDeclaration, ClassDeclaration jOwnerType) {
		return new Object[] { match, bodyDeclaration, jOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Class_0_5_collectcontextelements_greenBBB(Match match,
			MFieldDefinition bodyDeclaration, ClassDeclaration jOwnerType) {
		match.getContextNodes().add(bodyDeclaration);
		match.getContextNodes().add(jOwnerType);
		return new Object[] { match, bodyDeclaration, jOwnerType };
	}

	public static final void pattern_FieldDec2Property4Class_0_6_registerobjectstomatch_expressionBBBB(
			FieldDec2Property4Class _this, Match match, MFieldDefinition bodyDeclaration, ClassDeclaration jOwnerType) {
		_this.registerObjectsToMatch_FWD(match, bodyDeclaration, jOwnerType);

	}

	public static final boolean pattern_FieldDec2Property4Class_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Class_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject _localVariable_1 = isApplicableMatch.getObject("nd2ne");
		EObject _localVariable_2 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_3 = isApplicableMatch.getObject("uOwnerType");
		EObject _localVariable_4 = isApplicableMatch.getObject("jOwnerType");
		EObject _localVariable_5 = isApplicableMatch.getObject("jo2uo");
		EObject tmpFeature = _localVariable_0;
		EObject tmpNd2ne = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		EObject tmpUOwnerType = _localVariable_3;
		EObject tmpJOwnerType = _localVariable_4;
		EObject tmpJo2uo = _localVariable_5;
		if (tmpFeature instanceof Property) {
			Property feature = (Property) tmpFeature;
			if (tmpNd2ne instanceof ASTNode2Element) {
				ASTNode2Element nd2ne = (ASTNode2Element) tmpNd2ne;
				if (tmpBodyDeclaration instanceof MFieldDefinition) {
					MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
					if (tmpUOwnerType instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class uOwnerType = (org.eclipse.uml2.uml.Class) tmpUOwnerType;
						if (tmpJOwnerType instanceof ClassDeclaration) {
							ClassDeclaration jOwnerType = (ClassDeclaration) tmpJOwnerType;
							if (tmpJo2uo instanceof ASTNode2Element) {
								ASTNode2Element jo2uo = (ASTNode2Element) tmpJo2uo;
								return new Object[] { feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_1_1_performtransformation_blackBBBBBBFBB(
			Property feature, ASTNode2Element nd2ne, MFieldDefinition bodyDeclaration,
			org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType, ASTNode2Element jo2uo,
			FieldDec2Property4Class _this, IsApplicableMatch isApplicableMatch) {
		if (!jo2uo.equals(nd2ne)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			FieldDec2Property4Class _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldDec2Property4Class_1_1_performtransformation_binding = pattern_FieldDec2Property4Class_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldDec2Property4Class_1_1_performtransformation_binding != null) {
			Property feature = (Property) result_pattern_FieldDec2Property4Class_1_1_performtransformation_binding[0];
			ASTNode2Element nd2ne = (ASTNode2Element) result_pattern_FieldDec2Property4Class_1_1_performtransformation_binding[1];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result_pattern_FieldDec2Property4Class_1_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Class uOwnerType = (org.eclipse.uml2.uml.Class) result_pattern_FieldDec2Property4Class_1_1_performtransformation_binding[3];
			ClassDeclaration jOwnerType = (ClassDeclaration) result_pattern_FieldDec2Property4Class_1_1_performtransformation_binding[4];
			ASTNode2Element jo2uo = (ASTNode2Element) result_pattern_FieldDec2Property4Class_1_1_performtransformation_binding[5];

			Object[] result_pattern_FieldDec2Property4Class_1_1_performtransformation_black = pattern_FieldDec2Property4Class_1_1_performtransformation_blackBBBBBBFBB(
					feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo, _this, isApplicableMatch);
			if (result_pattern_FieldDec2Property4Class_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldDec2Property4Class_1_1_performtransformation_black[6];

				return new Object[] { feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_1_1_performtransformation_greenBB(Property feature,
			org.eclipse.uml2.uml.Class uOwnerType) {
		uOwnerType.getOwnedAttributes().add(feature);
		return new Object[] { feature, uOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Class_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_FieldDec2Property4Class_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject feature, EObject nd2ne, EObject bodyDeclaration, EObject uOwnerType,
			EObject jOwnerType, EObject jo2uo) {
		if (!feature.equals(nd2ne)) {
			if (!feature.equals(uOwnerType)) {
				if (!feature.equals(jOwnerType)) {
					if (!feature.equals(jo2uo)) {
						if (!nd2ne.equals(uOwnerType)) {
							if (!bodyDeclaration.equals(feature)) {
								if (!bodyDeclaration.equals(nd2ne)) {
									if (!bodyDeclaration.equals(uOwnerType)) {
										if (!bodyDeclaration.equals(jOwnerType)) {
											if (!bodyDeclaration.equals(jo2uo)) {
												if (!jOwnerType.equals(nd2ne)) {
													if (!jOwnerType.equals(uOwnerType)) {
														if (!jOwnerType.equals(jo2uo)) {
															if (!jo2uo.equals(nd2ne)) {
																if (!jo2uo.equals(uOwnerType)) {
																	return new Object[] { ruleresult, feature, nd2ne,
																			bodyDeclaration, uOwnerType, jOwnerType,
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
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_1_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject feature, EObject bodyDeclaration, EObject uOwnerType,
			EObject jOwnerType) {
		EMoflonEdge uOwnerType__feature____ownedAttribute = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldDec2Property4Class";
		String uOwnerType__feature____ownedAttribute_name_prime = "ownedAttribute";
		String jOwnerType__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		uOwnerType__feature____ownedAttribute.setSrc(uOwnerType);
		uOwnerType__feature____ownedAttribute.setTrg(feature);
		ruleresult.getCreatedEdges().add(uOwnerType__feature____ownedAttribute);
		jOwnerType__bodyDeclaration____bodyDeclarations.setSrc(jOwnerType);
		jOwnerType__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(jOwnerType__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setTrg(jOwnerType);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__jOwnerType____abstractTypeDeclaration);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		uOwnerType__feature____ownedAttribute.setName(uOwnerType__feature____ownedAttribute_name_prime);
		jOwnerType__bodyDeclaration____bodyDeclarations
				.setName(jOwnerType__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration
				.setName(bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime);
		return new Object[] { ruleresult, feature, bodyDeclaration, uOwnerType, jOwnerType,
				uOwnerType__feature____ownedAttribute, jOwnerType__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jOwnerType____abstractTypeDeclaration };
	}

	public static final void pattern_FieldDec2Property4Class_1_5_registerobjects_expressionBBBBBBBB(
			FieldDec2Property4Class _this, PerformRuleResult ruleresult, EObject feature, EObject nd2ne,
			EObject bodyDeclaration, EObject uOwnerType, EObject jOwnerType, EObject jo2uo) {
		_this.registerObjects_FWD(ruleresult, feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo);

	}

	public static final PerformRuleResult pattern_FieldDec2Property4Class_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_2_1_preparereturnvalue_bindingFB(
			FieldDec2Property4Class _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_2_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldDec2Property4Class _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_2_1_preparereturnvalue_bindingAndBlackFFB(
			FieldDec2Property4Class _this) {
		Object[] result_pattern_FieldDec2Property4Class_2_1_preparereturnvalue_binding = pattern_FieldDec2Property4Class_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property4Class_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldDec2Property4Class_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property4Class_2_1_preparereturnvalue_black = pattern_FieldDec2Property4Class_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldDec2Property4Class_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldDec2Property4Class_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldDec2Property4Class";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldDec2Property4Class_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("bodyDeclaration");
		EObject _localVariable_1 = match.getObject("jOwnerType");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpJOwnerType = _localVariable_1;
		if (tmpBodyDeclaration instanceof MFieldDefinition) {
			MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
			if (tmpJOwnerType instanceof ClassDeclaration) {
				ClassDeclaration jOwnerType = (ClassDeclaration) tmpJOwnerType;
				return new Object[] { bodyDeclaration, jOwnerType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Class_2_2_corematch_blackFFBFBFB(
			MFieldDefinition bodyDeclaration, ClassDeclaration jOwnerType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element nd2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(bodyDeclaration,
				ASTNode2Element.class, "source")) {
			Element tmpFeature = nd2ne.getTarget();
			if (tmpFeature instanceof Property) {
				Property feature = (Property) tmpFeature;
				for (ASTNode2Element jo2uo : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(jOwnerType, ASTNode2Element.class, "source")) {
					if (!jo2uo.equals(nd2ne)) {
						Element tmpUOwnerType = jo2uo.getTarget();
						if (tmpUOwnerType instanceof org.eclipse.uml2.uml.Class) {
							org.eclipse.uml2.uml.Class uOwnerType = (org.eclipse.uml2.uml.Class) tmpUOwnerType;
							_result.add(new Object[] { feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo,
									match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Class_2_3_findcontext_blackBBBBBB(Property feature,
			ASTNode2Element nd2ne, MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType,
			ClassDeclaration jOwnerType, ASTNode2Element jo2uo) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jo2uo.equals(nd2ne)) {
			if (bodyDeclaration.equals(nd2ne.getSource())) {
				if (feature.equals(nd2ne.getTarget())) {
					if (jOwnerType.getBodyDeclarations().contains(bodyDeclaration)) {
						if (uOwnerType.equals(jo2uo.getTarget())) {
							if (jOwnerType.equals(jo2uo.getSource())) {
								_result.add(new Object[] { feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType,
										jo2uo });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_2_3_findcontext_greenBBBBBBFFFFFFF(Property feature,
			ASTNode2Element nd2ne, MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType,
			ClassDeclaration jOwnerType, ASTNode2Element jo2uo) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge nd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jo2uo__uOwnerType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jo2uo__jOwnerType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String nd2ne__bodyDeclaration____source_name_prime = "source";
		String nd2ne__feature____target_name_prime = "target";
		String jOwnerType__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String jo2uo__uOwnerType____target_name_prime = "target";
		String jo2uo__jOwnerType____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(nd2ne);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(uOwnerType);
		isApplicableMatch.getAllContextElements().add(jOwnerType);
		isApplicableMatch.getAllContextElements().add(jo2uo);
		nd2ne__bodyDeclaration____source.setSrc(nd2ne);
		nd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(nd2ne__bodyDeclaration____source);
		nd2ne__feature____target.setSrc(nd2ne);
		nd2ne__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(nd2ne__feature____target);
		jOwnerType__bodyDeclaration____bodyDeclarations.setSrc(jOwnerType);
		jOwnerType__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jOwnerType__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setTrg(jOwnerType);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__jOwnerType____abstractTypeDeclaration);
		jo2uo__uOwnerType____target.setSrc(jo2uo);
		jo2uo__uOwnerType____target.setTrg(uOwnerType);
		isApplicableMatch.getAllContextElements().add(jo2uo__uOwnerType____target);
		jo2uo__jOwnerType____source.setSrc(jo2uo);
		jo2uo__jOwnerType____source.setTrg(jOwnerType);
		isApplicableMatch.getAllContextElements().add(jo2uo__jOwnerType____source);
		nd2ne__bodyDeclaration____source.setName(nd2ne__bodyDeclaration____source_name_prime);
		nd2ne__feature____target.setName(nd2ne__feature____target_name_prime);
		jOwnerType__bodyDeclaration____bodyDeclarations
				.setName(jOwnerType__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration
				.setName(bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime);
		jo2uo__uOwnerType____target.setName(jo2uo__uOwnerType____target_name_prime);
		jo2uo__jOwnerType____source.setName(jo2uo__jOwnerType____source_name_prime);
		return new Object[] { feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo, isApplicableMatch,
				nd2ne__bodyDeclaration____source, nd2ne__feature____target,
				jOwnerType__bodyDeclaration____bodyDeclarations, bodyDeclaration__jOwnerType____abstractTypeDeclaration,
				jo2uo__uOwnerType____target, jo2uo__jOwnerType____source };
	}

	public static final Object[] pattern_FieldDec2Property4Class_2_4_solveCSP_bindingFBBBBBBBB(
			FieldDec2Property4Class _this, IsApplicableMatch isApplicableMatch, Property feature, ASTNode2Element nd2ne,
			MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType,
			ASTNode2Element jo2uo) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, feature, nd2ne, bodyDeclaration,
				uOwnerType, jOwnerType, jo2uo);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, nd2ne, bodyDeclaration, uOwnerType,
					jOwnerType, jo2uo };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Class_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			FieldDec2Property4Class _this, IsApplicableMatch isApplicableMatch, Property feature, ASTNode2Element nd2ne,
			MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType,
			ASTNode2Element jo2uo) {
		Object[] result_pattern_FieldDec2Property4Class_2_4_solveCSP_binding = pattern_FieldDec2Property4Class_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo);
		if (result_pattern_FieldDec2Property4Class_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Class_2_4_solveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property4Class_2_4_solveCSP_black = pattern_FieldDec2Property4Class_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Class_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, nd2ne, bodyDeclaration, uOwnerType,
						jOwnerType, jo2uo };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Class_2_5_checkCSP_expressionFBB(
			FieldDec2Property4Class _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDec2Property4Class_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldDec2Property4Class";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDec2Property4Class_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_10_1_initialbindings_blackBBBB(
			FieldDec2Property4Class _this, Match match, Property feature, org.eclipse.uml2.uml.Class uOwnerType) {
		return new Object[] { _this, match, feature, uOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Class_10_2_SolveCSP_bindingFBBBB(
			FieldDec2Property4Class _this, Match match, Property feature, org.eclipse.uml2.uml.Class uOwnerType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, uOwnerType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, uOwnerType };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Class_10_2_SolveCSP_bindingAndBlackFBBBB(
			FieldDec2Property4Class _this, Match match, Property feature, org.eclipse.uml2.uml.Class uOwnerType) {
		Object[] result_pattern_FieldDec2Property4Class_10_2_SolveCSP_binding = pattern_FieldDec2Property4Class_10_2_SolveCSP_bindingFBBBB(
				_this, match, feature, uOwnerType);
		if (result_pattern_FieldDec2Property4Class_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Class_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property4Class_10_2_SolveCSP_black = pattern_FieldDec2Property4Class_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Class_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, uOwnerType };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Class_10_3_CheckCSP_expressionFBB(
			FieldDec2Property4Class _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_10_4_collectelementstobetranslated_blackBBB(
			Match match, Property feature, org.eclipse.uml2.uml.Class uOwnerType) {
		return new Object[] { match, feature, uOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Class_10_4_collectelementstobetranslated_greenBBBF(
			Match match, Property feature, org.eclipse.uml2.uml.Class uOwnerType) {
		EMoflonEdge uOwnerType__feature____ownedAttribute = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String uOwnerType__feature____ownedAttribute_name_prime = "ownedAttribute";
		uOwnerType__feature____ownedAttribute.setSrc(uOwnerType);
		uOwnerType__feature____ownedAttribute.setTrg(feature);
		match.getToBeTranslatedEdges().add(uOwnerType__feature____ownedAttribute);
		uOwnerType__feature____ownedAttribute.setName(uOwnerType__feature____ownedAttribute_name_prime);
		return new Object[] { match, feature, uOwnerType, uOwnerType__feature____ownedAttribute };
	}

	public static final Object[] pattern_FieldDec2Property4Class_10_5_collectcontextelements_blackBBB(Match match,
			Property feature, org.eclipse.uml2.uml.Class uOwnerType) {
		return new Object[] { match, feature, uOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Class_10_5_collectcontextelements_greenBBB(Match match,
			Property feature, org.eclipse.uml2.uml.Class uOwnerType) {
		match.getContextNodes().add(feature);
		match.getContextNodes().add(uOwnerType);
		return new Object[] { match, feature, uOwnerType };
	}

	public static final void pattern_FieldDec2Property4Class_10_6_registerobjectstomatch_expressionBBBB(
			FieldDec2Property4Class _this, Match match, Property feature, org.eclipse.uml2.uml.Class uOwnerType) {
		_this.registerObjectsToMatch_BWD(match, feature, uOwnerType);

	}

	public static final boolean pattern_FieldDec2Property4Class_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Class_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject _localVariable_1 = isApplicableMatch.getObject("nd2ne");
		EObject _localVariable_2 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_3 = isApplicableMatch.getObject("uOwnerType");
		EObject _localVariable_4 = isApplicableMatch.getObject("jOwnerType");
		EObject _localVariable_5 = isApplicableMatch.getObject("jo2uo");
		EObject tmpFeature = _localVariable_0;
		EObject tmpNd2ne = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		EObject tmpUOwnerType = _localVariable_3;
		EObject tmpJOwnerType = _localVariable_4;
		EObject tmpJo2uo = _localVariable_5;
		if (tmpFeature instanceof Property) {
			Property feature = (Property) tmpFeature;
			if (tmpNd2ne instanceof ASTNode2Element) {
				ASTNode2Element nd2ne = (ASTNode2Element) tmpNd2ne;
				if (tmpBodyDeclaration instanceof MFieldDefinition) {
					MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
					if (tmpUOwnerType instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class uOwnerType = (org.eclipse.uml2.uml.Class) tmpUOwnerType;
						if (tmpJOwnerType instanceof ClassDeclaration) {
							ClassDeclaration jOwnerType = (ClassDeclaration) tmpJOwnerType;
							if (tmpJo2uo instanceof ASTNode2Element) {
								ASTNode2Element jo2uo = (ASTNode2Element) tmpJo2uo;
								return new Object[] { feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_11_1_performtransformation_blackBBBBBBFBB(
			Property feature, ASTNode2Element nd2ne, MFieldDefinition bodyDeclaration,
			org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType, ASTNode2Element jo2uo,
			FieldDec2Property4Class _this, IsApplicableMatch isApplicableMatch) {
		if (!jo2uo.equals(nd2ne)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			FieldDec2Property4Class _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldDec2Property4Class_11_1_performtransformation_binding = pattern_FieldDec2Property4Class_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldDec2Property4Class_11_1_performtransformation_binding != null) {
			Property feature = (Property) result_pattern_FieldDec2Property4Class_11_1_performtransformation_binding[0];
			ASTNode2Element nd2ne = (ASTNode2Element) result_pattern_FieldDec2Property4Class_11_1_performtransformation_binding[1];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result_pattern_FieldDec2Property4Class_11_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Class uOwnerType = (org.eclipse.uml2.uml.Class) result_pattern_FieldDec2Property4Class_11_1_performtransformation_binding[3];
			ClassDeclaration jOwnerType = (ClassDeclaration) result_pattern_FieldDec2Property4Class_11_1_performtransformation_binding[4];
			ASTNode2Element jo2uo = (ASTNode2Element) result_pattern_FieldDec2Property4Class_11_1_performtransformation_binding[5];

			Object[] result_pattern_FieldDec2Property4Class_11_1_performtransformation_black = pattern_FieldDec2Property4Class_11_1_performtransformation_blackBBBBBBFBB(
					feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo, _this, isApplicableMatch);
			if (result_pattern_FieldDec2Property4Class_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldDec2Property4Class_11_1_performtransformation_black[6];

				return new Object[] { feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_11_1_performtransformation_greenBB(
			MFieldDefinition bodyDeclaration, ClassDeclaration jOwnerType) {
		jOwnerType.getBodyDeclarations().add(bodyDeclaration);
		return new Object[] { bodyDeclaration, jOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Class_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_FieldDec2Property4Class_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject feature, EObject nd2ne, EObject bodyDeclaration, EObject uOwnerType,
			EObject jOwnerType, EObject jo2uo) {
		if (!feature.equals(nd2ne)) {
			if (!feature.equals(uOwnerType)) {
				if (!feature.equals(jOwnerType)) {
					if (!feature.equals(jo2uo)) {
						if (!nd2ne.equals(uOwnerType)) {
							if (!bodyDeclaration.equals(feature)) {
								if (!bodyDeclaration.equals(nd2ne)) {
									if (!bodyDeclaration.equals(uOwnerType)) {
										if (!bodyDeclaration.equals(jOwnerType)) {
											if (!bodyDeclaration.equals(jo2uo)) {
												if (!jOwnerType.equals(nd2ne)) {
													if (!jOwnerType.equals(uOwnerType)) {
														if (!jOwnerType.equals(jo2uo)) {
															if (!jo2uo.equals(nd2ne)) {
																if (!jo2uo.equals(uOwnerType)) {
																	return new Object[] { ruleresult, feature, nd2ne,
																			bodyDeclaration, uOwnerType, jOwnerType,
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
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_11_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject feature, EObject bodyDeclaration, EObject uOwnerType,
			EObject jOwnerType) {
		EMoflonEdge uOwnerType__feature____ownedAttribute = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldDec2Property4Class";
		String uOwnerType__feature____ownedAttribute_name_prime = "ownedAttribute";
		String jOwnerType__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		uOwnerType__feature____ownedAttribute.setSrc(uOwnerType);
		uOwnerType__feature____ownedAttribute.setTrg(feature);
		ruleresult.getTranslatedEdges().add(uOwnerType__feature____ownedAttribute);
		jOwnerType__bodyDeclaration____bodyDeclarations.setSrc(jOwnerType);
		jOwnerType__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(jOwnerType__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setTrg(jOwnerType);
		ruleresult.getCreatedEdges().add(bodyDeclaration__jOwnerType____abstractTypeDeclaration);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		uOwnerType__feature____ownedAttribute.setName(uOwnerType__feature____ownedAttribute_name_prime);
		jOwnerType__bodyDeclaration____bodyDeclarations
				.setName(jOwnerType__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration
				.setName(bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime);
		return new Object[] { ruleresult, feature, bodyDeclaration, uOwnerType, jOwnerType,
				uOwnerType__feature____ownedAttribute, jOwnerType__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jOwnerType____abstractTypeDeclaration };
	}

	public static final void pattern_FieldDec2Property4Class_11_5_registerobjects_expressionBBBBBBBB(
			FieldDec2Property4Class _this, PerformRuleResult ruleresult, EObject feature, EObject nd2ne,
			EObject bodyDeclaration, EObject uOwnerType, EObject jOwnerType, EObject jo2uo) {
		_this.registerObjects_BWD(ruleresult, feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo);

	}

	public static final PerformRuleResult pattern_FieldDec2Property4Class_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_12_1_preparereturnvalue_bindingFB(
			FieldDec2Property4Class _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_12_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldDec2Property4Class _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_12_1_preparereturnvalue_bindingAndBlackFFB(
			FieldDec2Property4Class _this) {
		Object[] result_pattern_FieldDec2Property4Class_12_1_preparereturnvalue_binding = pattern_FieldDec2Property4Class_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property4Class_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldDec2Property4Class_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property4Class_12_1_preparereturnvalue_black = pattern_FieldDec2Property4Class_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldDec2Property4Class_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldDec2Property4Class_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldDec2Property4Class";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldDec2Property4Class_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("uOwnerType");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUOwnerType = _localVariable_1;
		if (tmpFeature instanceof Property) {
			Property feature = (Property) tmpFeature;
			if (tmpUOwnerType instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uOwnerType = (org.eclipse.uml2.uml.Class) tmpUOwnerType;
				return new Object[] { feature, uOwnerType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Class_12_2_corematch_blackBFFBFFB(Property feature,
			org.eclipse.uml2.uml.Class uOwnerType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element nd2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(feature,
				ASTNode2Element.class, "target")) {
			ASTNode tmpBodyDeclaration = nd2ne.getSource();
			if (tmpBodyDeclaration instanceof MFieldDefinition) {
				MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
				for (ASTNode2Element jo2uo : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(uOwnerType, ASTNode2Element.class, "target")) {
					if (!jo2uo.equals(nd2ne)) {
						ASTNode tmpJOwnerType = jo2uo.getSource();
						if (tmpJOwnerType instanceof ClassDeclaration) {
							ClassDeclaration jOwnerType = (ClassDeclaration) tmpJOwnerType;
							_result.add(new Object[] { feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo,
									match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Class_12_3_findcontext_blackBBBBBB(
			Property feature, ASTNode2Element nd2ne, MFieldDefinition bodyDeclaration,
			org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType, ASTNode2Element jo2uo) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jo2uo.equals(nd2ne)) {
			if (uOwnerType.getOwnedAttributes().contains(feature)) {
				if (bodyDeclaration.equals(nd2ne.getSource())) {
					if (feature.equals(nd2ne.getTarget())) {
						if (uOwnerType.equals(jo2uo.getTarget())) {
							if (jOwnerType.equals(jo2uo.getSource())) {
								_result.add(new Object[] { feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType,
										jo2uo });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_12_3_findcontext_greenBBBBBBFFFFFF(Property feature,
			ASTNode2Element nd2ne, MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType,
			ClassDeclaration jOwnerType, ASTNode2Element jo2uo) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge uOwnerType__feature____ownedAttribute = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jo2uo__uOwnerType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jo2uo__jOwnerType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String uOwnerType__feature____ownedAttribute_name_prime = "ownedAttribute";
		String nd2ne__bodyDeclaration____source_name_prime = "source";
		String nd2ne__feature____target_name_prime = "target";
		String jo2uo__uOwnerType____target_name_prime = "target";
		String jo2uo__jOwnerType____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(nd2ne);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(uOwnerType);
		isApplicableMatch.getAllContextElements().add(jOwnerType);
		isApplicableMatch.getAllContextElements().add(jo2uo);
		uOwnerType__feature____ownedAttribute.setSrc(uOwnerType);
		uOwnerType__feature____ownedAttribute.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(uOwnerType__feature____ownedAttribute);
		nd2ne__bodyDeclaration____source.setSrc(nd2ne);
		nd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(nd2ne__bodyDeclaration____source);
		nd2ne__feature____target.setSrc(nd2ne);
		nd2ne__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(nd2ne__feature____target);
		jo2uo__uOwnerType____target.setSrc(jo2uo);
		jo2uo__uOwnerType____target.setTrg(uOwnerType);
		isApplicableMatch.getAllContextElements().add(jo2uo__uOwnerType____target);
		jo2uo__jOwnerType____source.setSrc(jo2uo);
		jo2uo__jOwnerType____source.setTrg(jOwnerType);
		isApplicableMatch.getAllContextElements().add(jo2uo__jOwnerType____source);
		uOwnerType__feature____ownedAttribute.setName(uOwnerType__feature____ownedAttribute_name_prime);
		nd2ne__bodyDeclaration____source.setName(nd2ne__bodyDeclaration____source_name_prime);
		nd2ne__feature____target.setName(nd2ne__feature____target_name_prime);
		jo2uo__uOwnerType____target.setName(jo2uo__uOwnerType____target_name_prime);
		jo2uo__jOwnerType____source.setName(jo2uo__jOwnerType____source_name_prime);
		return new Object[] { feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo, isApplicableMatch,
				uOwnerType__feature____ownedAttribute, nd2ne__bodyDeclaration____source, nd2ne__feature____target,
				jo2uo__uOwnerType____target, jo2uo__jOwnerType____source };
	}

	public static final Object[] pattern_FieldDec2Property4Class_12_4_solveCSP_bindingFBBBBBBBB(
			FieldDec2Property4Class _this, IsApplicableMatch isApplicableMatch, Property feature, ASTNode2Element nd2ne,
			MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType,
			ASTNode2Element jo2uo) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature, nd2ne, bodyDeclaration,
				uOwnerType, jOwnerType, jo2uo);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, nd2ne, bodyDeclaration, uOwnerType,
					jOwnerType, jo2uo };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Class_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			FieldDec2Property4Class _this, IsApplicableMatch isApplicableMatch, Property feature, ASTNode2Element nd2ne,
			MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType,
			ASTNode2Element jo2uo) {
		Object[] result_pattern_FieldDec2Property4Class_12_4_solveCSP_binding = pattern_FieldDec2Property4Class_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo);
		if (result_pattern_FieldDec2Property4Class_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Class_12_4_solveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property4Class_12_4_solveCSP_black = pattern_FieldDec2Property4Class_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Class_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, nd2ne, bodyDeclaration, uOwnerType,
						jOwnerType, jo2uo };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Class_12_5_checkCSP_expressionFBB(
			FieldDec2Property4Class _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDec2Property4Class_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldDec2Property4Class";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDec2Property4Class_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_20_1_preparereturnvalue_bindingFB(
			FieldDec2Property4Class _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldDec2Property4Class _this) {
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

	public static final Object[] pattern_FieldDec2Property4Class_20_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldDec2Property4Class _this) {
		Object[] result_pattern_FieldDec2Property4Class_20_1_preparereturnvalue_binding = pattern_FieldDec2Property4Class_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property4Class_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldDec2Property4Class_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property4Class_20_1_preparereturnvalue_black = pattern_FieldDec2Property4Class_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldDec2Property4Class_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldDec2Property4Class_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldDec2Property4Class_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Class_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedAttribute) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUOwnerType = _edge_ownedAttribute.getSrc();
		if (tmpUOwnerType instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uOwnerType = (org.eclipse.uml2.uml.Class) tmpUOwnerType;
			EObject tmpFeature = _edge_ownedAttribute.getTrg();
			if (tmpFeature instanceof Property) {
				Property feature = (Property) tmpFeature;
				if (uOwnerType.getOwnedAttributes().contains(feature)) {
					_result.add(new Object[] { feature, uOwnerType, _edge_ownedAttribute });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldDec2Property4Class_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldDec2Property4Class _this, Match match, Property feature, org.eclipse.uml2.uml.Class uOwnerType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, uOwnerType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Class_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldDec2Property4Class _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldDec2Property4Class_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_21_1_preparereturnvalue_bindingFB(
			FieldDec2Property4Class _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldDec2Property4Class _this) {
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

	public static final Object[] pattern_FieldDec2Property4Class_21_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldDec2Property4Class _this) {
		Object[] result_pattern_FieldDec2Property4Class_21_1_preparereturnvalue_binding = pattern_FieldDec2Property4Class_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property4Class_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldDec2Property4Class_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property4Class_21_1_preparereturnvalue_black = pattern_FieldDec2Property4Class_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldDec2Property4Class_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldDec2Property4Class_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldDec2Property4Class_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Class_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJOwnerType = _edge_bodyDeclarations.getSrc();
		if (tmpJOwnerType instanceof ClassDeclaration) {
			ClassDeclaration jOwnerType = (ClassDeclaration) tmpJOwnerType;
			EObject tmpBodyDeclaration = _edge_bodyDeclarations.getTrg();
			if (tmpBodyDeclaration instanceof MFieldDefinition) {
				MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
				if (jOwnerType.getBodyDeclarations().contains(bodyDeclaration)) {
					_result.add(new Object[] { bodyDeclaration, jOwnerType, _edge_bodyDeclarations });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldDec2Property4Class_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldDec2Property4Class _this, Match match, MFieldDefinition bodyDeclaration, ClassDeclaration jOwnerType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, bodyDeclaration, jOwnerType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Class_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldDec2Property4Class _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldDec2Property4Class_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_24_1_prepare_blackB(FieldDec2Property4Class _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldDec2Property4Class_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_FieldDec2Property4Class_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_2 = targetMatch.getObject("uOwnerType");
		EObject _localVariable_3 = sourceMatch.getObject("jOwnerType");
		EObject tmpFeature = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpUOwnerType = _localVariable_2;
		EObject tmpJOwnerType = _localVariable_3;
		if (tmpFeature instanceof Property) {
			Property feature = (Property) tmpFeature;
			if (tmpBodyDeclaration instanceof MFieldDefinition) {
				MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
				if (tmpUOwnerType instanceof org.eclipse.uml2.uml.Class) {
					org.eclipse.uml2.uml.Class uOwnerType = (org.eclipse.uml2.uml.Class) tmpUOwnerType;
					if (tmpJOwnerType instanceof ClassDeclaration) {
						ClassDeclaration jOwnerType = (ClassDeclaration) tmpJOwnerType;
						return new Object[] { feature, bodyDeclaration, uOwnerType, jOwnerType, targetMatch,
								sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_24_2_matchsrctrgcontext_blackBBBBBB(Property feature,
			MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { feature, bodyDeclaration, uOwnerType, jOwnerType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldDec2Property4Class_24_2_matchsrctrgcontext_binding = pattern_FieldDec2Property4Class_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_FieldDec2Property4Class_24_2_matchsrctrgcontext_binding != null) {
			Property feature = (Property) result_pattern_FieldDec2Property4Class_24_2_matchsrctrgcontext_binding[0];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result_pattern_FieldDec2Property4Class_24_2_matchsrctrgcontext_binding[1];
			org.eclipse.uml2.uml.Class uOwnerType = (org.eclipse.uml2.uml.Class) result_pattern_FieldDec2Property4Class_24_2_matchsrctrgcontext_binding[2];
			ClassDeclaration jOwnerType = (ClassDeclaration) result_pattern_FieldDec2Property4Class_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_FieldDec2Property4Class_24_2_matchsrctrgcontext_black = pattern_FieldDec2Property4Class_24_2_matchsrctrgcontext_blackBBBBBB(
					feature, bodyDeclaration, uOwnerType, jOwnerType, sourceMatch, targetMatch);
			if (result_pattern_FieldDec2Property4Class_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, bodyDeclaration, uOwnerType, jOwnerType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_24_3_solvecsp_bindingFBBBBBBB(
			FieldDec2Property4Class _this, Property feature, MFieldDefinition bodyDeclaration,
			org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(feature, bodyDeclaration, uOwnerType, jOwnerType,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, feature, bodyDeclaration, uOwnerType, jOwnerType, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Class_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			FieldDec2Property4Class _this, Property feature, MFieldDefinition bodyDeclaration,
			org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldDec2Property4Class_24_3_solvecsp_binding = pattern_FieldDec2Property4Class_24_3_solvecsp_bindingFBBBBBBB(
				_this, feature, bodyDeclaration, uOwnerType, jOwnerType, sourceMatch, targetMatch);
		if (result_pattern_FieldDec2Property4Class_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Class_24_3_solvecsp_binding[0];

			Object[] result_pattern_FieldDec2Property4Class_24_3_solvecsp_black = pattern_FieldDec2Property4Class_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Class_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, bodyDeclaration, uOwnerType, jOwnerType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Class_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Class_24_5_matchcorrcontext_blackBFBBBFBB(
			Property feature, MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType,
			ClassDeclaration jOwnerType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element nd2ne : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(bodyDeclaration, ASTNode2Element.class, "source")) {
				if (feature.equals(nd2ne.getTarget())) {
					for (ASTNode2Element jo2uo : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(uOwnerType, ASTNode2Element.class, "target")) {
						if (!jo2uo.equals(nd2ne)) {
							if (jOwnerType.equals(jo2uo.getSource())) {
								_result.add(new Object[] { feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType,
										jo2uo, sourceMatch, targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_24_5_matchcorrcontext_greenBBBBF(ASTNode2Element nd2ne,
			ASTNode2Element jo2uo, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "FieldDec2Property4Class";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(nd2ne);
		ccMatch.getAllContextElements().add(jo2uo);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { nd2ne, jo2uo, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property4Class_24_6_createcorrespondence_blackBBBBB(Property feature,
			MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType,
			CCMatch ccMatch) {
		return new Object[] { feature, bodyDeclaration, uOwnerType, jOwnerType, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property4Class_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property4Class_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "FieldDec2Property4Class";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDec2Property4Class_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_27_1_matchtggpattern_blackBB(
			MFieldDefinition bodyDeclaration, ClassDeclaration jOwnerType) {
		if (jOwnerType.getBodyDeclarations().contains(bodyDeclaration)) {
			return new Object[] { bodyDeclaration, jOwnerType };
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Class_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Class_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_28_1_matchtggpattern_blackBB(Property feature,
			org.eclipse.uml2.uml.Class uOwnerType) {
		if (uOwnerType.getOwnedAttributes().contains(feature)) {
			return new Object[] { feature, uOwnerType };
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Class_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Class_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_29_1_createresult_blackB(
			FieldDec2Property4Class _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldDec2Property4Class_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_FieldDec2Property4Class_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Property feature) {
		if (ruleResult.getTargetObjects().contains(feature)) {
			return new Object[] { ruleResult, feature };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element nd2ne) {
		if (ruleResult.getCorrObjects().contains(nd2ne)) {
			return new Object[] { ruleResult, nd2ne };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MFieldDefinition bodyDeclaration) {
		if (ruleResult.getSourceObjects().contains(bodyDeclaration)) {
			return new Object[] { ruleResult, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Class uOwnerType) {
		if (ruleResult.getTargetObjects().contains(uOwnerType)) {
			return new Object[] { ruleResult, uOwnerType };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element jo2uo) {
		if (ruleResult.getCorrObjects().contains(jo2uo)) {
			return new Object[] { ruleResult, jo2uo };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, ClassDeclaration jOwnerType) {
		if (ruleResult.getSourceObjects().contains(jOwnerType)) {
			return new Object[] { ruleResult, jOwnerType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Class_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList nd2neList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList jo2uoList : ruleEntryContainer.getRuleEntryList()) {
				if (!jo2uoList.equals(nd2neList)) {
					for (EObject tmpNd2ne : nd2neList.getEntryObjects()) {
						if (tmpNd2ne instanceof ASTNode2Element) {
							ASTNode2Element nd2ne = (ASTNode2Element) tmpNd2ne;
							Element tmpFeature = nd2ne.getTarget();
							if (tmpFeature instanceof Property) {
								Property feature = (Property) tmpFeature;
								ASTNode tmpBodyDeclaration = nd2ne.getSource();
								if (tmpBodyDeclaration instanceof MFieldDefinition) {
									MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
									if (pattern_FieldDec2Property4Class_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											nd2ne) == null) {
										if (pattern_FieldDec2Property4Class_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, feature) == null) {
											if (pattern_FieldDec2Property4Class_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, bodyDeclaration) == null) {
												for (EObject tmpJo2uo : jo2uoList.getEntryObjects()) {
													if (tmpJo2uo instanceof ASTNode2Element) {
														ASTNode2Element jo2uo = (ASTNode2Element) tmpJo2uo;
														if (!jo2uo.equals(nd2ne)) {
															Element tmpUOwnerType = jo2uo.getTarget();
															if (tmpUOwnerType instanceof org.eclipse.uml2.uml.Class) {
																org.eclipse.uml2.uml.Class uOwnerType = (org.eclipse.uml2.uml.Class) tmpUOwnerType;
																ASTNode tmpJOwnerType = jo2uo.getSource();
																if (tmpJOwnerType instanceof ClassDeclaration) {
																	ClassDeclaration jOwnerType = (ClassDeclaration) tmpJOwnerType;
																	if (pattern_FieldDec2Property4Class_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, jo2uo) == null) {
																		if (pattern_FieldDec2Property4Class_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, uOwnerType) == null) {
																			if (pattern_FieldDec2Property4Class_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult, jOwnerType) == null) {
																				_result.add(new Object[] { nd2neList,
																						feature, nd2ne, bodyDeclaration,
																						jo2uoList, uOwnerType, jo2uo,
																						jOwnerType, ruleEntryContainer,
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

	public static final Object[] pattern_FieldDec2Property4Class_29_3_solveCSP_bindingFBBBBBBBBB(
			FieldDec2Property4Class _this, IsApplicableMatch isApplicableMatch, Property feature, ASTNode2Element nd2ne,
			MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType,
			ASTNode2Element jo2uo, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, feature, nd2ne, bodyDeclaration,
				uOwnerType, jOwnerType, jo2uo, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, nd2ne, bodyDeclaration, uOwnerType,
					jOwnerType, jo2uo, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Class_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			FieldDec2Property4Class _this, IsApplicableMatch isApplicableMatch, Property feature, ASTNode2Element nd2ne,
			MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType,
			ASTNode2Element jo2uo, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FieldDec2Property4Class_29_3_solveCSP_binding = pattern_FieldDec2Property4Class_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo, ruleResult);
		if (result_pattern_FieldDec2Property4Class_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Class_29_3_solveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property4Class_29_3_solveCSP_black = pattern_FieldDec2Property4Class_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Class_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, nd2ne, bodyDeclaration, uOwnerType,
						jOwnerType, jo2uo, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Class_29_4_checkCSP_expressionFBB(
			FieldDec2Property4Class _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Class_29_5_checknacs_blackBBBBBB(Property feature,
			ASTNode2Element nd2ne, MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType,
			ClassDeclaration jOwnerType, ASTNode2Element jo2uo) {
		if (!jo2uo.equals(nd2ne)) {
			return new Object[] { feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_29_6_perform_blackBBBBBBB(Property feature,
			ASTNode2Element nd2ne, MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType,
			ClassDeclaration jOwnerType, ASTNode2Element jo2uo, ModelgeneratorRuleResult ruleResult) {
		if (!jo2uo.equals(nd2ne)) {
			return new Object[] { feature, nd2ne, bodyDeclaration, uOwnerType, jOwnerType, jo2uo, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Class_29_6_perform_greenBBBBB(Property feature,
			MFieldDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uOwnerType, ClassDeclaration jOwnerType,
			ModelgeneratorRuleResult ruleResult) {
		uOwnerType.getOwnedAttributes().add(feature);
		jOwnerType.getBodyDeclarations().add(bodyDeclaration);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { feature, bodyDeclaration, uOwnerType, jOwnerType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_FieldDec2Property4Class_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldDec2Property4ClassImpl
