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
import org.eclipse.modisco.java.InterfaceDeclaration;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Property;

import org.gravity.modisco.MFieldDefinition;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.FieldDec2Property4Interface;
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
 * An implementation of the model object '<em><b>Field Dec2 Property4 Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldDec2Property4InterfaceImpl extends AbstractRuleImpl implements FieldDec2Property4Interface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldDec2Property4InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldDec2Property4Interface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, InterfaceDeclaration jOwnerType, MFieldDefinition bodyDeclaration) {

		Object[] result1_black = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_0_1_initialbindings_blackBBBB(this, match, jOwnerType,
						bodyDeclaration);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jOwnerType] = " + jOwnerType + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ".");
		}

		Object[] result2_bindingAndBlack = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, jOwnerType,
						bodyDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jOwnerType] = " + jOwnerType + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldDec2Property4InterfaceImpl
					.pattern_FieldDec2Property4Interface_0_4_collectelementstobetranslated_blackBBB(match, jOwnerType,
							bodyDeclaration);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jOwnerType] = " + jOwnerType + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			FieldDec2Property4InterfaceImpl
					.pattern_FieldDec2Property4Interface_0_4_collectelementstobetranslated_greenBBBFF(match, jOwnerType,
							bodyDeclaration);
			//nothing EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = FieldDec2Property4InterfaceImpl
					.pattern_FieldDec2Property4Interface_0_5_collectcontextelements_blackBBB(match, jOwnerType,
							bodyDeclaration);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jOwnerType] = " + jOwnerType + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_0_5_collectcontextelements_greenBBB(
					match, jOwnerType, bodyDeclaration);

			// 
			FieldDec2Property4InterfaceImpl
					.pattern_FieldDec2Property4Interface_0_6_registerobjectstomatch_expressionBBBB(this, match,
							jOwnerType, bodyDeclaration);
			return FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_0_7_expressionF();
		} else {
			return FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		InterfaceDeclaration jOwnerType = (InterfaceDeclaration) result1_bindingAndBlack[0];
		Property feature = (Property) result1_bindingAndBlack[1];
		Interface uOwnerType = (Interface) result1_bindingAndBlack[2];
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result1_bindingAndBlack[3];
		ASTNode2Element jo2uo = (ASTNode2Element) result1_bindingAndBlack[4];
		ASTNode2Element nd2ne = (ASTNode2Element) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_1_1_performtransformation_greenBB(feature,
				uOwnerType);

		Object[] result2_green = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, jOwnerType,
						feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[jOwnerType] = " + jOwnerType + ", " + "[feature] = " + feature + ", " + "[uOwnerType] = "
					+ uOwnerType + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jo2uo] = " + jo2uo + ", "
					+ "[nd2ne] = " + nd2ne + ".");
		}
		FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_1_3_bookkeepingforedges_greenBBBBBFFFF(
				ruleresult, jOwnerType, feature, uOwnerType, bodyDeclaration);
		//nothing EMoflonEdge uOwnerType__feature____ownedAttribute = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge feature__uOwnerType____interface = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = (EMoflonEdge) result3_green[8];

		// 
		// 
		FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne);
		return FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		InterfaceDeclaration jOwnerType = (InterfaceDeclaration) result2_binding[0];
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_binding[1];
		for (Object[] result2_black : FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_2_2_corematch_blackBFFBFFB(jOwnerType, bodyDeclaration, match)) {
			Property feature = (Property) result2_black[1];
			Interface uOwnerType = (Interface) result2_black[2];
			ASTNode2Element jo2uo = (ASTNode2Element) result2_black[4];
			ASTNode2Element nd2ne = (ASTNode2Element) result2_black[5];
			// ForEach 
			for (Object[] result3_black : FieldDec2Property4InterfaceImpl
					.pattern_FieldDec2Property4Interface_2_3_findcontext_blackBBBBBB(jOwnerType, feature, uOwnerType,
							bodyDeclaration, jo2uo, nd2ne)) {
				Object[] result3_green = FieldDec2Property4InterfaceImpl
						.pattern_FieldDec2Property4Interface_2_3_findcontext_greenBBBBBBFFFFFFF(jOwnerType, feature,
								uOwnerType, bodyDeclaration, jo2uo, nd2ne);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge jo2uo__jOwnerType____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge jo2uo__uOwnerType____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge nd2ne__feature____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge nd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = FieldDec2Property4InterfaceImpl
						.pattern_FieldDec2Property4Interface_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jOwnerType] = " + jOwnerType
							+ ", " + "[feature] = " + feature + ", " + "[uOwnerType] = " + uOwnerType + ", "
							+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jo2uo] = " + jo2uo + ", "
							+ "[nd2ne] = " + nd2ne + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = FieldDec2Property4InterfaceImpl
							.pattern_FieldDec2Property4Interface_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldDec2Property4InterfaceImpl
							.pattern_FieldDec2Property4Interface_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, InterfaceDeclaration jOwnerType,
			MFieldDefinition bodyDeclaration) {
		match.registerObject("jOwnerType", jOwnerType);
		match.registerObject("bodyDeclaration", bodyDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, InterfaceDeclaration jOwnerType,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, InterfaceDeclaration jOwnerType,
			Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration, ASTNode2Element jo2uo,
			ASTNode2Element nd2ne) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jOwnerType", jOwnerType);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("uOwnerType", uOwnerType);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("jo2uo", jo2uo);
		isApplicableMatch.registerObject("nd2ne", nd2ne);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject jOwnerType, EObject feature,
			EObject uOwnerType, EObject bodyDeclaration, EObject jo2uo, EObject nd2ne) {
		ruleresult.registerObject("jOwnerType", jOwnerType);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("uOwnerType", uOwnerType);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("jo2uo", jo2uo);
		ruleresult.registerObject("nd2ne", nd2ne);

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
	public boolean isAppropriate_BWD(Match match, Property feature, Interface uOwnerType) {

		Object[] result1_black = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_10_1_initialbindings_blackBBBB(this, match, feature, uOwnerType);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[uOwnerType] = " + uOwnerType + ".");
		}

		Object[] result2_bindingAndBlack = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, feature,
						uOwnerType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[uOwnerType] = " + uOwnerType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = FieldDec2Property4InterfaceImpl
					.pattern_FieldDec2Property4Interface_10_4_collectelementstobetranslated_blackBBB(match, feature,
							uOwnerType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uOwnerType] = " + uOwnerType + ".");
			}
			FieldDec2Property4InterfaceImpl
					.pattern_FieldDec2Property4Interface_10_4_collectelementstobetranslated_greenBBBFF(match, feature,
							uOwnerType);
			//nothing EMoflonEdge uOwnerType__feature____ownedAttribute = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge feature__uOwnerType____interface = (EMoflonEdge) result4_green[4];

			Object[] result5_black = FieldDec2Property4InterfaceImpl
					.pattern_FieldDec2Property4Interface_10_5_collectcontextelements_blackBBB(match, feature,
							uOwnerType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uOwnerType] = " + uOwnerType + ".");
			}
			FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_10_5_collectcontextelements_greenBBB(
					match, feature, uOwnerType);

			// 
			FieldDec2Property4InterfaceImpl
					.pattern_FieldDec2Property4Interface_10_6_registerobjectstomatch_expressionBBBB(this, match,
							feature, uOwnerType);
			return FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_10_7_expressionF();
		} else {
			return FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		InterfaceDeclaration jOwnerType = (InterfaceDeclaration) result1_bindingAndBlack[0];
		Property feature = (Property) result1_bindingAndBlack[1];
		Interface uOwnerType = (Interface) result1_bindingAndBlack[2];
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result1_bindingAndBlack[3];
		ASTNode2Element jo2uo = (ASTNode2Element) result1_bindingAndBlack[4];
		ASTNode2Element nd2ne = (ASTNode2Element) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_11_1_performtransformation_greenBB(jOwnerType, bodyDeclaration);

		Object[] result2_green = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, jOwnerType,
						feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[jOwnerType] = " + jOwnerType + ", " + "[feature] = " + feature + ", " + "[uOwnerType] = "
					+ uOwnerType + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jo2uo] = " + jo2uo + ", "
					+ "[nd2ne] = " + nd2ne + ".");
		}
		FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_11_3_bookkeepingforedges_greenBBBBBFFFF(
				ruleresult, jOwnerType, feature, uOwnerType, bodyDeclaration);
		//nothing EMoflonEdge uOwnerType__feature____ownedAttribute = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge feature__uOwnerType____interface = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = (EMoflonEdge) result3_green[8];

		// 
		// 
		FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_11_5_registerobjects_expressionBBBBBBBB(
				this, ruleresult, jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne);
		return FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Property feature = (Property) result2_binding[0];
		Interface uOwnerType = (Interface) result2_binding[1];
		for (Object[] result2_black : FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_12_2_corematch_blackFBBFFFB(feature, uOwnerType, match)) {
			InterfaceDeclaration jOwnerType = (InterfaceDeclaration) result2_black[0];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_black[3];
			ASTNode2Element jo2uo = (ASTNode2Element) result2_black[4];
			ASTNode2Element nd2ne = (ASTNode2Element) result2_black[5];
			// ForEach 
			for (Object[] result3_black : FieldDec2Property4InterfaceImpl
					.pattern_FieldDec2Property4Interface_12_3_findcontext_blackBBBBBB(jOwnerType, feature, uOwnerType,
							bodyDeclaration, jo2uo, nd2ne)) {
				Object[] result3_green = FieldDec2Property4InterfaceImpl
						.pattern_FieldDec2Property4Interface_12_3_findcontext_greenBBBBBBFFFFFFF(jOwnerType, feature,
								uOwnerType, bodyDeclaration, jo2uo, nd2ne);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge uOwnerType__feature____ownedAttribute = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge feature__uOwnerType____interface = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge jo2uo__jOwnerType____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge jo2uo__uOwnerType____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge nd2ne__feature____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge nd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = FieldDec2Property4InterfaceImpl
						.pattern_FieldDec2Property4Interface_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jOwnerType] = " + jOwnerType
							+ ", " + "[feature] = " + feature + ", " + "[uOwnerType] = " + uOwnerType + ", "
							+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jo2uo] = " + jo2uo + ", "
							+ "[nd2ne] = " + nd2ne + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldDec2Property4InterfaceImpl
						.pattern_FieldDec2Property4Interface_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FieldDec2Property4InterfaceImpl
							.pattern_FieldDec2Property4Interface_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldDec2Property4InterfaceImpl
							.pattern_FieldDec2Property4Interface_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Property feature, Interface uOwnerType) {
		match.registerObject("feature", feature);
		match.registerObject("uOwnerType", uOwnerType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Property feature, Interface uOwnerType) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, InterfaceDeclaration jOwnerType,
			Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration, ASTNode2Element jo2uo,
			ASTNode2Element nd2ne) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jOwnerType", jOwnerType);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("uOwnerType", uOwnerType);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("jo2uo", jo2uo);
		isApplicableMatch.registerObject("nd2ne", nd2ne);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject jOwnerType, EObject feature,
			EObject uOwnerType, EObject bodyDeclaration, EObject jo2uo, EObject nd2ne) {
		ruleresult.registerObject("jOwnerType", jOwnerType);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("uOwnerType", uOwnerType);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("jo2uo", jo2uo);
		ruleresult.registerObject("nd2ne", nd2ne);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_103(EMoflonEdge _edge_ownedAttribute) {

		Object[] result1_bindingAndBlack = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_20_2_testcorematchandDECs_blackFFB(_edge_ownedAttribute)) {
			Property feature = (Property) result2_black[0];
			Interface uOwnerType = (Interface) result2_black[1];
			Object[] result2_green = FieldDec2Property4InterfaceImpl
					.pattern_FieldDec2Property4Interface_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldDec2Property4InterfaceImpl
					.pattern_FieldDec2Property4Interface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, feature, uOwnerType)) {
				// 
				if (FieldDec2Property4InterfaceImpl
						.pattern_FieldDec2Property4Interface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = FieldDec2Property4InterfaceImpl
							.pattern_FieldDec2Property4Interface_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldDec2Property4InterfaceImpl
							.pattern_FieldDec2Property4Interface_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_112(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_21_2_testcorematchandDECs_blackFFB(_edge_bodyDeclarations)) {
			InterfaceDeclaration jOwnerType = (InterfaceDeclaration) result2_black[0];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_black[1];
			Object[] result2_green = FieldDec2Property4InterfaceImpl
					.pattern_FieldDec2Property4Interface_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldDec2Property4InterfaceImpl
					.pattern_FieldDec2Property4Interface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, jOwnerType, bodyDeclaration)) {
				// 
				if (FieldDec2Property4InterfaceImpl
						.pattern_FieldDec2Property4Interface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = FieldDec2Property4InterfaceImpl
							.pattern_FieldDec2Property4Interface_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldDec2Property4InterfaceImpl
							.pattern_FieldDec2Property4Interface_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FieldDec2Property4Interface");
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
		ruleResult.setRule("FieldDec2Property4Interface");
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

		Object[] result1_black = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		InterfaceDeclaration jOwnerType = (InterfaceDeclaration) result2_bindingAndBlack[0];
		Property feature = (Property) result2_bindingAndBlack[1];
		Interface uOwnerType = (Interface) result2_bindingAndBlack[2];
		MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, jOwnerType, feature,
						uOwnerType, bodyDeclaration, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[jOwnerType] = " + jOwnerType + ", " + "[feature] = " + feature + ", " + "[uOwnerType] = "
					+ uOwnerType + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : FieldDec2Property4InterfaceImpl
					.pattern_FieldDec2Property4Interface_24_5_matchcorrcontext_blackBBBBFFBB(jOwnerType, feature,
							uOwnerType, bodyDeclaration, sourceMatch, targetMatch)) {
				ASTNode2Element jo2uo = (ASTNode2Element) result5_black[4];
				ASTNode2Element nd2ne = (ASTNode2Element) result5_black[5];
				Object[] result5_green = FieldDec2Property4InterfaceImpl
						.pattern_FieldDec2Property4Interface_24_5_matchcorrcontext_greenBBBBF(jo2uo, nd2ne, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = FieldDec2Property4InterfaceImpl
						.pattern_FieldDec2Property4Interface_24_6_createcorrespondence_blackBBBBB(jOwnerType, feature,
								uOwnerType, bodyDeclaration, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[jOwnerType] = "
							+ jOwnerType + ", " + "[feature] = " + feature + ", " + "[uOwnerType] = " + uOwnerType
							+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = FieldDec2Property4InterfaceImpl
						.pattern_FieldDec2Property4Interface_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldDec2Property4InterfaceImpl
						.pattern_FieldDec2Property4Interface_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(InterfaceDeclaration jOwnerType, Property feature, Interface uOwnerType,
			MFieldDefinition bodyDeclaration, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(InterfaceDeclaration jOwnerType, MFieldDefinition bodyDeclaration) {// 
		Object[] result1_black = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_27_1_matchtggpattern_blackBB(jOwnerType, bodyDeclaration);
		if (result1_black != null) {
			return FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_27_2_expressionF();
		} else {
			return FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Property feature, Interface uOwnerType) {// 
		Object[] result1_black = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_28_1_matchtggpattern_blackBB(feature, uOwnerType);
		if (result1_black != null) {
			return FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_28_2_expressionF();
		} else {
			return FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element jo2uoParameter,
			ASTNode2Element nd2neParameter) {

		Object[] result1_black = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : FieldDec2Property4InterfaceImpl
				.pattern_FieldDec2Property4Interface_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList jo2uoList = (RuleEntryList) result2_black[0];
			InterfaceDeclaration jOwnerType = (InterfaceDeclaration) result2_black[1];
			ASTNode2Element jo2uo = (ASTNode2Element) result2_black[2];
			Interface uOwnerType = (Interface) result2_black[3];
			//nothing RuleEntryList nd2neList = (RuleEntryList) result2_black[4];
			Property feature = (Property) result2_black[5];
			ASTNode2Element nd2ne = (ASTNode2Element) result2_black[6];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result2_black[7];

			Object[] result3_bindingAndBlack = FieldDec2Property4InterfaceImpl
					.pattern_FieldDec2Property4Interface_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jOwnerType] = " + jOwnerType + ", "
						+ "[feature] = " + feature + ", " + "[uOwnerType] = " + uOwnerType + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jo2uo] = " + jo2uo + ", " + "[nd2ne] = "
						+ nd2ne + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = FieldDec2Property4InterfaceImpl
						.pattern_FieldDec2Property4Interface_29_5_checknacs_blackBBBBBB(jOwnerType, feature, uOwnerType,
								bodyDeclaration, jo2uo, nd2ne);
				if (result5_black != null) {

					Object[] result6_black = FieldDec2Property4InterfaceImpl
							.pattern_FieldDec2Property4Interface_29_6_perform_blackBBBBBBB(jOwnerType, feature,
									uOwnerType, bodyDeclaration, jo2uo, nd2ne, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[jOwnerType] = "
								+ jOwnerType + ", " + "[feature] = " + feature + ", " + "[uOwnerType] = " + uOwnerType
								+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jo2uo] = " + jo2uo + ", "
								+ "[nd2ne] = " + nd2ne + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_29_6_perform_greenBBBBB(
							jOwnerType, feature, uOwnerType, bodyDeclaration, ruleResult);

				} else {
				}

			} else {
			}

		}
		return FieldDec2Property4InterfaceImpl.pattern_FieldDec2Property4Interface_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, InterfaceDeclaration jOwnerType,
			Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration, ASTNode2Element jo2uo,
			ASTNode2Element nd2ne, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jOwnerType", jOwnerType);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("uOwnerType", uOwnerType);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("jo2uo", jo2uo);
		isApplicableMatch.registerObject("nd2ne", nd2ne);
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
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___IS_APPROPRIATE_FWD__MATCH_INTERFACEDECLARATION_MFIELDDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(MFieldDefinition) arguments.get(2));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_INTERFACEDECLARATION_MFIELDDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(MFieldDefinition) arguments.get(2));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_INTERFACEDECLARATION_MFIELDDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(MFieldDefinition) arguments.get(2));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERFACEDECLARATION_PROPERTY_INTERFACE_MFIELDDEFINITION_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(InterfaceDeclaration) arguments.get(1), (Property) arguments.get(2), (Interface) arguments.get(3),
					(MFieldDefinition) arguments.get(4), (ASTNode2Element) arguments.get(5),
					(ASTNode2Element) arguments.get(6));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___IS_APPROPRIATE_BWD__MATCH_PROPERTY_INTERFACE:
			return isAppropriate_BWD((Match) arguments.get(0), (Property) arguments.get(1),
					(Interface) arguments.get(2));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PROPERTY_INTERFACE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Property) arguments.get(1),
					(Interface) arguments.get(2));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PROPERTY_INTERFACE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Property) arguments.get(1),
					(Interface) arguments.get(2));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERFACEDECLARATION_PROPERTY_INTERFACE_MFIELDDEFINITION_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(InterfaceDeclaration) arguments.get(1), (Property) arguments.get(2), (Interface) arguments.get(3),
					(MFieldDefinition) arguments.get(4), (ASTNode2Element) arguments.get(5),
					(ASTNode2Element) arguments.get(6));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_103__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_103((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_112__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_112((EMoflonEdge) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___IS_APPLICABLE_SOLVE_CSP_CC__INTERFACEDECLARATION_PROPERTY_INTERFACE_MFIELDDEFINITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((InterfaceDeclaration) arguments.get(0), (Property) arguments.get(1),
					(Interface) arguments.get(2), (MFieldDefinition) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___CHECK_DEC_FWD__INTERFACEDECLARATION_MFIELDDEFINITION:
			return checkDEC_FWD((InterfaceDeclaration) arguments.get(0), (MFieldDefinition) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___CHECK_DEC_BWD__PROPERTY_INTERFACE:
			return checkDEC_BWD((Property) arguments.get(0), (Interface) arguments.get(1));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERFACEDECLARATION_PROPERTY_INTERFACE_MFIELDDEFINITION_ASTNODE2ELEMENT_ASTNODE2ELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(InterfaceDeclaration) arguments.get(1), (Property) arguments.get(2), (Interface) arguments.get(3),
					(MFieldDefinition) arguments.get(4), (ASTNode2Element) arguments.get(5),
					(ASTNode2Element) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.FIELD_DEC2_PROPERTY4_INTERFACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldDec2Property4Interface_0_1_initialbindings_blackBBBB(
			FieldDec2Property4Interface _this, Match match, InterfaceDeclaration jOwnerType,
			MFieldDefinition bodyDeclaration) {
		return new Object[] { _this, match, jOwnerType, bodyDeclaration };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_0_2_SolveCSP_bindingFBBBB(
			FieldDec2Property4Interface _this, Match match, InterfaceDeclaration jOwnerType,
			MFieldDefinition bodyDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jOwnerType, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jOwnerType, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_0_2_SolveCSP_bindingAndBlackFBBBB(
			FieldDec2Property4Interface _this, Match match, InterfaceDeclaration jOwnerType,
			MFieldDefinition bodyDeclaration) {
		Object[] result_pattern_FieldDec2Property4Interface_0_2_SolveCSP_binding = pattern_FieldDec2Property4Interface_0_2_SolveCSP_bindingFBBBB(
				_this, match, jOwnerType, bodyDeclaration);
		if (result_pattern_FieldDec2Property4Interface_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Interface_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property4Interface_0_2_SolveCSP_black = pattern_FieldDec2Property4Interface_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Interface_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, jOwnerType, bodyDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Interface_0_3_CheckCSP_expressionFBB(
			FieldDec2Property4Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_0_4_collectelementstobetranslated_blackBBB(
			Match match, InterfaceDeclaration jOwnerType, MFieldDefinition bodyDeclaration) {
		return new Object[] { match, jOwnerType, bodyDeclaration };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, InterfaceDeclaration jOwnerType, MFieldDefinition bodyDeclaration) {
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
		return new Object[] { match, jOwnerType, bodyDeclaration, jOwnerType__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jOwnerType____abstractTypeDeclaration };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_0_5_collectcontextelements_blackBBB(Match match,
			InterfaceDeclaration jOwnerType, MFieldDefinition bodyDeclaration) {
		return new Object[] { match, jOwnerType, bodyDeclaration };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_0_5_collectcontextelements_greenBBB(Match match,
			InterfaceDeclaration jOwnerType, MFieldDefinition bodyDeclaration) {
		match.getContextNodes().add(jOwnerType);
		match.getContextNodes().add(bodyDeclaration);
		return new Object[] { match, jOwnerType, bodyDeclaration };
	}

	public static final void pattern_FieldDec2Property4Interface_0_6_registerobjectstomatch_expressionBBBB(
			FieldDec2Property4Interface _this, Match match, InterfaceDeclaration jOwnerType,
			MFieldDefinition bodyDeclaration) {
		_this.registerObjectsToMatch_FWD(match, jOwnerType, bodyDeclaration);

	}

	public static final boolean pattern_FieldDec2Property4Interface_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Interface_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jOwnerType");
		EObject _localVariable_1 = isApplicableMatch.getObject("feature");
		EObject _localVariable_2 = isApplicableMatch.getObject("uOwnerType");
		EObject _localVariable_3 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_4 = isApplicableMatch.getObject("jo2uo");
		EObject _localVariable_5 = isApplicableMatch.getObject("nd2ne");
		EObject tmpJOwnerType = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		EObject tmpUOwnerType = _localVariable_2;
		EObject tmpBodyDeclaration = _localVariable_3;
		EObject tmpJo2uo = _localVariable_4;
		EObject tmpNd2ne = _localVariable_5;
		if (tmpJOwnerType instanceof InterfaceDeclaration) {
			InterfaceDeclaration jOwnerType = (InterfaceDeclaration) tmpJOwnerType;
			if (tmpFeature instanceof Property) {
				Property feature = (Property) tmpFeature;
				if (tmpUOwnerType instanceof Interface) {
					Interface uOwnerType = (Interface) tmpUOwnerType;
					if (tmpBodyDeclaration instanceof MFieldDefinition) {
						MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
						if (tmpJo2uo instanceof ASTNode2Element) {
							ASTNode2Element jo2uo = (ASTNode2Element) tmpJo2uo;
							if (tmpNd2ne instanceof ASTNode2Element) {
								ASTNode2Element nd2ne = (ASTNode2Element) tmpNd2ne;
								return new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_1_1_performtransformation_blackBBBBBBFBB(
			InterfaceDeclaration jOwnerType, Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration,
			ASTNode2Element jo2uo, ASTNode2Element nd2ne, FieldDec2Property4Interface _this,
			IsApplicableMatch isApplicableMatch) {
		if (!jo2uo.equals(nd2ne)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			FieldDec2Property4Interface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldDec2Property4Interface_1_1_performtransformation_binding = pattern_FieldDec2Property4Interface_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldDec2Property4Interface_1_1_performtransformation_binding != null) {
			InterfaceDeclaration jOwnerType = (InterfaceDeclaration) result_pattern_FieldDec2Property4Interface_1_1_performtransformation_binding[0];
			Property feature = (Property) result_pattern_FieldDec2Property4Interface_1_1_performtransformation_binding[1];
			Interface uOwnerType = (Interface) result_pattern_FieldDec2Property4Interface_1_1_performtransformation_binding[2];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result_pattern_FieldDec2Property4Interface_1_1_performtransformation_binding[3];
			ASTNode2Element jo2uo = (ASTNode2Element) result_pattern_FieldDec2Property4Interface_1_1_performtransformation_binding[4];
			ASTNode2Element nd2ne = (ASTNode2Element) result_pattern_FieldDec2Property4Interface_1_1_performtransformation_binding[5];

			Object[] result_pattern_FieldDec2Property4Interface_1_1_performtransformation_black = pattern_FieldDec2Property4Interface_1_1_performtransformation_blackBBBBBBFBB(
					jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne, _this, isApplicableMatch);
			if (result_pattern_FieldDec2Property4Interface_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldDec2Property4Interface_1_1_performtransformation_black[6];

				return new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_1_1_performtransformation_greenBB(Property feature,
			Interface uOwnerType) {
		uOwnerType.getOwnedAttributes().add(feature);
		return new Object[] { feature, uOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject jOwnerType, EObject feature, EObject uOwnerType,
			EObject bodyDeclaration, EObject jo2uo, EObject nd2ne) {
		if (!jOwnerType.equals(uOwnerType)) {
			if (!jOwnerType.equals(jo2uo)) {
				if (!jOwnerType.equals(nd2ne)) {
					if (!feature.equals(jOwnerType)) {
						if (!feature.equals(uOwnerType)) {
							if (!feature.equals(jo2uo)) {
								if (!feature.equals(nd2ne)) {
									if (!bodyDeclaration.equals(jOwnerType)) {
										if (!bodyDeclaration.equals(feature)) {
											if (!bodyDeclaration.equals(uOwnerType)) {
												if (!bodyDeclaration.equals(jo2uo)) {
													if (!bodyDeclaration.equals(nd2ne)) {
														if (!jo2uo.equals(uOwnerType)) {
															if (!jo2uo.equals(nd2ne)) {
																if (!nd2ne.equals(uOwnerType)) {
																	return new Object[] { ruleresult, jOwnerType,
																			feature, uOwnerType, bodyDeclaration, jo2uo,
																			nd2ne };
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

	public static final Object[] pattern_FieldDec2Property4Interface_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject jOwnerType, EObject feature, EObject uOwnerType,
			EObject bodyDeclaration) {
		EMoflonEdge uOwnerType__feature____ownedAttribute = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__uOwnerType____interface = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldDec2Property4Interface";
		String uOwnerType__feature____ownedAttribute_name_prime = "ownedAttribute";
		String feature__uOwnerType____interface_name_prime = "interface";
		String jOwnerType__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		uOwnerType__feature____ownedAttribute.setSrc(uOwnerType);
		uOwnerType__feature____ownedAttribute.setTrg(feature);
		ruleresult.getCreatedEdges().add(uOwnerType__feature____ownedAttribute);
		feature__uOwnerType____interface.setSrc(feature);
		feature__uOwnerType____interface.setTrg(uOwnerType);
		ruleresult.getCreatedEdges().add(feature__uOwnerType____interface);
		jOwnerType__bodyDeclaration____bodyDeclarations.setSrc(jOwnerType);
		jOwnerType__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(jOwnerType__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setTrg(jOwnerType);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__jOwnerType____abstractTypeDeclaration);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		uOwnerType__feature____ownedAttribute.setName(uOwnerType__feature____ownedAttribute_name_prime);
		feature__uOwnerType____interface.setName(feature__uOwnerType____interface_name_prime);
		jOwnerType__bodyDeclaration____bodyDeclarations
				.setName(jOwnerType__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration
				.setName(bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime);
		return new Object[] { ruleresult, jOwnerType, feature, uOwnerType, bodyDeclaration,
				uOwnerType__feature____ownedAttribute, feature__uOwnerType____interface,
				jOwnerType__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jOwnerType____abstractTypeDeclaration };
	}

	public static final void pattern_FieldDec2Property4Interface_1_5_registerobjects_expressionBBBBBBBB(
			FieldDec2Property4Interface _this, PerformRuleResult ruleresult, EObject jOwnerType, EObject feature,
			EObject uOwnerType, EObject bodyDeclaration, EObject jo2uo, EObject nd2ne) {
		_this.registerObjects_FWD(ruleresult, jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne);

	}

	public static final PerformRuleResult pattern_FieldDec2Property4Interface_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_2_1_preparereturnvalue_bindingFB(
			FieldDec2Property4Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_2_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldDec2Property4Interface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_2_1_preparereturnvalue_bindingAndBlackFFB(
			FieldDec2Property4Interface _this) {
		Object[] result_pattern_FieldDec2Property4Interface_2_1_preparereturnvalue_binding = pattern_FieldDec2Property4Interface_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property4Interface_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldDec2Property4Interface_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property4Interface_2_1_preparereturnvalue_black = pattern_FieldDec2Property4Interface_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldDec2Property4Interface_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldDec2Property4Interface_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldDec2Property4Interface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("jOwnerType");
		EObject _localVariable_1 = match.getObject("bodyDeclaration");
		EObject tmpJOwnerType = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		if (tmpJOwnerType instanceof InterfaceDeclaration) {
			InterfaceDeclaration jOwnerType = (InterfaceDeclaration) tmpJOwnerType;
			if (tmpBodyDeclaration instanceof MFieldDefinition) {
				MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
				return new Object[] { jOwnerType, bodyDeclaration, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Interface_2_2_corematch_blackBFFBFFB(
			InterfaceDeclaration jOwnerType, MFieldDefinition bodyDeclaration, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element jo2uo : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jOwnerType,
				ASTNode2Element.class, "source")) {
			Element tmpUOwnerType = jo2uo.getTarget();
			if (tmpUOwnerType instanceof Interface) {
				Interface uOwnerType = (Interface) tmpUOwnerType;
				for (ASTNode2Element nd2ne : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(bodyDeclaration, ASTNode2Element.class, "source")) {
					if (!jo2uo.equals(nd2ne)) {
						Element tmpFeature = nd2ne.getTarget();
						if (tmpFeature instanceof Property) {
							Property feature = (Property) tmpFeature;
							_result.add(new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne,
									match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Interface_2_3_findcontext_blackBBBBBB(
			InterfaceDeclaration jOwnerType, Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration,
			ASTNode2Element jo2uo, ASTNode2Element nd2ne) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jo2uo.equals(nd2ne)) {
			if (jOwnerType.getBodyDeclarations().contains(bodyDeclaration)) {
				if (jOwnerType.equals(jo2uo.getSource())) {
					if (uOwnerType.equals(jo2uo.getTarget())) {
						if (feature.equals(nd2ne.getTarget())) {
							if (bodyDeclaration.equals(nd2ne.getSource())) {
								_result.add(new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo,
										nd2ne });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_2_3_findcontext_greenBBBBBBFFFFFFF(
			InterfaceDeclaration jOwnerType, Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration,
			ASTNode2Element jo2uo, ASTNode2Element nd2ne) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jo2uo__jOwnerType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jo2uo__uOwnerType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String jOwnerType__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String jo2uo__jOwnerType____source_name_prime = "source";
		String jo2uo__uOwnerType____target_name_prime = "target";
		String nd2ne__feature____target_name_prime = "target";
		String nd2ne__bodyDeclaration____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(jOwnerType);
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(uOwnerType);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jo2uo);
		isApplicableMatch.getAllContextElements().add(nd2ne);
		jOwnerType__bodyDeclaration____bodyDeclarations.setSrc(jOwnerType);
		jOwnerType__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jOwnerType__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setTrg(jOwnerType);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__jOwnerType____abstractTypeDeclaration);
		jo2uo__jOwnerType____source.setSrc(jo2uo);
		jo2uo__jOwnerType____source.setTrg(jOwnerType);
		isApplicableMatch.getAllContextElements().add(jo2uo__jOwnerType____source);
		jo2uo__uOwnerType____target.setSrc(jo2uo);
		jo2uo__uOwnerType____target.setTrg(uOwnerType);
		isApplicableMatch.getAllContextElements().add(jo2uo__uOwnerType____target);
		nd2ne__feature____target.setSrc(nd2ne);
		nd2ne__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(nd2ne__feature____target);
		nd2ne__bodyDeclaration____source.setSrc(nd2ne);
		nd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(nd2ne__bodyDeclaration____source);
		jOwnerType__bodyDeclaration____bodyDeclarations
				.setName(jOwnerType__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration
				.setName(bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime);
		jo2uo__jOwnerType____source.setName(jo2uo__jOwnerType____source_name_prime);
		jo2uo__uOwnerType____target.setName(jo2uo__uOwnerType____target_name_prime);
		nd2ne__feature____target.setName(nd2ne__feature____target_name_prime);
		nd2ne__bodyDeclaration____source.setName(nd2ne__bodyDeclaration____source_name_prime);
		return new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne, isApplicableMatch,
				jOwnerType__bodyDeclaration____bodyDeclarations, bodyDeclaration__jOwnerType____abstractTypeDeclaration,
				jo2uo__jOwnerType____source, jo2uo__uOwnerType____target, nd2ne__feature____target,
				nd2ne__bodyDeclaration____source };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_2_4_solveCSP_bindingFBBBBBBBB(
			FieldDec2Property4Interface _this, IsApplicableMatch isApplicableMatch, InterfaceDeclaration jOwnerType,
			Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration, ASTNode2Element jo2uo,
			ASTNode2Element nd2ne) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, jOwnerType, feature, uOwnerType,
				bodyDeclaration, jo2uo, nd2ne);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jOwnerType, feature, uOwnerType, bodyDeclaration,
					jo2uo, nd2ne };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			FieldDec2Property4Interface _this, IsApplicableMatch isApplicableMatch, InterfaceDeclaration jOwnerType,
			Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration, ASTNode2Element jo2uo,
			ASTNode2Element nd2ne) {
		Object[] result_pattern_FieldDec2Property4Interface_2_4_solveCSP_binding = pattern_FieldDec2Property4Interface_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne);
		if (result_pattern_FieldDec2Property4Interface_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Interface_2_4_solveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property4Interface_2_4_solveCSP_black = pattern_FieldDec2Property4Interface_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Interface_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jOwnerType, feature, uOwnerType, bodyDeclaration,
						jo2uo, nd2ne };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Interface_2_5_checkCSP_expressionFBB(
			FieldDec2Property4Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldDec2Property4Interface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDec2Property4Interface_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_10_1_initialbindings_blackBBBB(
			FieldDec2Property4Interface _this, Match match, Property feature, Interface uOwnerType) {
		return new Object[] { _this, match, feature, uOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_10_2_SolveCSP_bindingFBBBB(
			FieldDec2Property4Interface _this, Match match, Property feature, Interface uOwnerType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, uOwnerType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, uOwnerType };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_10_2_SolveCSP_bindingAndBlackFBBBB(
			FieldDec2Property4Interface _this, Match match, Property feature, Interface uOwnerType) {
		Object[] result_pattern_FieldDec2Property4Interface_10_2_SolveCSP_binding = pattern_FieldDec2Property4Interface_10_2_SolveCSP_bindingFBBBB(
				_this, match, feature, uOwnerType);
		if (result_pattern_FieldDec2Property4Interface_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Interface_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property4Interface_10_2_SolveCSP_black = pattern_FieldDec2Property4Interface_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Interface_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, uOwnerType };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Interface_10_3_CheckCSP_expressionFBB(
			FieldDec2Property4Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_10_4_collectelementstobetranslated_blackBBB(
			Match match, Property feature, Interface uOwnerType) {
		return new Object[] { match, feature, uOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, Property feature, Interface uOwnerType) {
		EMoflonEdge uOwnerType__feature____ownedAttribute = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__uOwnerType____interface = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String uOwnerType__feature____ownedAttribute_name_prime = "ownedAttribute";
		String feature__uOwnerType____interface_name_prime = "interface";
		uOwnerType__feature____ownedAttribute.setSrc(uOwnerType);
		uOwnerType__feature____ownedAttribute.setTrg(feature);
		match.getToBeTranslatedEdges().add(uOwnerType__feature____ownedAttribute);
		feature__uOwnerType____interface.setSrc(feature);
		feature__uOwnerType____interface.setTrg(uOwnerType);
		match.getToBeTranslatedEdges().add(feature__uOwnerType____interface);
		uOwnerType__feature____ownedAttribute.setName(uOwnerType__feature____ownedAttribute_name_prime);
		feature__uOwnerType____interface.setName(feature__uOwnerType____interface_name_prime);
		return new Object[] { match, feature, uOwnerType, uOwnerType__feature____ownedAttribute,
				feature__uOwnerType____interface };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_10_5_collectcontextelements_blackBBB(Match match,
			Property feature, Interface uOwnerType) {
		return new Object[] { match, feature, uOwnerType };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_10_5_collectcontextelements_greenBBB(Match match,
			Property feature, Interface uOwnerType) {
		match.getContextNodes().add(feature);
		match.getContextNodes().add(uOwnerType);
		return new Object[] { match, feature, uOwnerType };
	}

	public static final void pattern_FieldDec2Property4Interface_10_6_registerobjectstomatch_expressionBBBB(
			FieldDec2Property4Interface _this, Match match, Property feature, Interface uOwnerType) {
		_this.registerObjectsToMatch_BWD(match, feature, uOwnerType);

	}

	public static final boolean pattern_FieldDec2Property4Interface_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Interface_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jOwnerType");
		EObject _localVariable_1 = isApplicableMatch.getObject("feature");
		EObject _localVariable_2 = isApplicableMatch.getObject("uOwnerType");
		EObject _localVariable_3 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_4 = isApplicableMatch.getObject("jo2uo");
		EObject _localVariable_5 = isApplicableMatch.getObject("nd2ne");
		EObject tmpJOwnerType = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		EObject tmpUOwnerType = _localVariable_2;
		EObject tmpBodyDeclaration = _localVariable_3;
		EObject tmpJo2uo = _localVariable_4;
		EObject tmpNd2ne = _localVariable_5;
		if (tmpJOwnerType instanceof InterfaceDeclaration) {
			InterfaceDeclaration jOwnerType = (InterfaceDeclaration) tmpJOwnerType;
			if (tmpFeature instanceof Property) {
				Property feature = (Property) tmpFeature;
				if (tmpUOwnerType instanceof Interface) {
					Interface uOwnerType = (Interface) tmpUOwnerType;
					if (tmpBodyDeclaration instanceof MFieldDefinition) {
						MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
						if (tmpJo2uo instanceof ASTNode2Element) {
							ASTNode2Element jo2uo = (ASTNode2Element) tmpJo2uo;
							if (tmpNd2ne instanceof ASTNode2Element) {
								ASTNode2Element nd2ne = (ASTNode2Element) tmpNd2ne;
								return new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_11_1_performtransformation_blackBBBBBBFBB(
			InterfaceDeclaration jOwnerType, Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration,
			ASTNode2Element jo2uo, ASTNode2Element nd2ne, FieldDec2Property4Interface _this,
			IsApplicableMatch isApplicableMatch) {
		if (!jo2uo.equals(nd2ne)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			FieldDec2Property4Interface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldDec2Property4Interface_11_1_performtransformation_binding = pattern_FieldDec2Property4Interface_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldDec2Property4Interface_11_1_performtransformation_binding != null) {
			InterfaceDeclaration jOwnerType = (InterfaceDeclaration) result_pattern_FieldDec2Property4Interface_11_1_performtransformation_binding[0];
			Property feature = (Property) result_pattern_FieldDec2Property4Interface_11_1_performtransformation_binding[1];
			Interface uOwnerType = (Interface) result_pattern_FieldDec2Property4Interface_11_1_performtransformation_binding[2];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result_pattern_FieldDec2Property4Interface_11_1_performtransformation_binding[3];
			ASTNode2Element jo2uo = (ASTNode2Element) result_pattern_FieldDec2Property4Interface_11_1_performtransformation_binding[4];
			ASTNode2Element nd2ne = (ASTNode2Element) result_pattern_FieldDec2Property4Interface_11_1_performtransformation_binding[5];

			Object[] result_pattern_FieldDec2Property4Interface_11_1_performtransformation_black = pattern_FieldDec2Property4Interface_11_1_performtransformation_blackBBBBBBFBB(
					jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne, _this, isApplicableMatch);
			if (result_pattern_FieldDec2Property4Interface_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldDec2Property4Interface_11_1_performtransformation_black[6];

				return new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_11_1_performtransformation_greenBB(
			InterfaceDeclaration jOwnerType, MFieldDefinition bodyDeclaration) {
		jOwnerType.getBodyDeclarations().add(bodyDeclaration);
		return new Object[] { jOwnerType, bodyDeclaration };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject jOwnerType, EObject feature, EObject uOwnerType,
			EObject bodyDeclaration, EObject jo2uo, EObject nd2ne) {
		if (!jOwnerType.equals(uOwnerType)) {
			if (!jOwnerType.equals(jo2uo)) {
				if (!jOwnerType.equals(nd2ne)) {
					if (!feature.equals(jOwnerType)) {
						if (!feature.equals(uOwnerType)) {
							if (!feature.equals(jo2uo)) {
								if (!feature.equals(nd2ne)) {
									if (!bodyDeclaration.equals(jOwnerType)) {
										if (!bodyDeclaration.equals(feature)) {
											if (!bodyDeclaration.equals(uOwnerType)) {
												if (!bodyDeclaration.equals(jo2uo)) {
													if (!bodyDeclaration.equals(nd2ne)) {
														if (!jo2uo.equals(uOwnerType)) {
															if (!jo2uo.equals(nd2ne)) {
																if (!nd2ne.equals(uOwnerType)) {
																	return new Object[] { ruleresult, jOwnerType,
																			feature, uOwnerType, bodyDeclaration, jo2uo,
																			nd2ne };
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

	public static final Object[] pattern_FieldDec2Property4Interface_11_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject jOwnerType, EObject feature, EObject uOwnerType,
			EObject bodyDeclaration) {
		EMoflonEdge uOwnerType__feature____ownedAttribute = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__uOwnerType____interface = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jOwnerType__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jOwnerType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldDec2Property4Interface";
		String uOwnerType__feature____ownedAttribute_name_prime = "ownedAttribute";
		String feature__uOwnerType____interface_name_prime = "interface";
		String jOwnerType__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		uOwnerType__feature____ownedAttribute.setSrc(uOwnerType);
		uOwnerType__feature____ownedAttribute.setTrg(feature);
		ruleresult.getTranslatedEdges().add(uOwnerType__feature____ownedAttribute);
		feature__uOwnerType____interface.setSrc(feature);
		feature__uOwnerType____interface.setTrg(uOwnerType);
		ruleresult.getTranslatedEdges().add(feature__uOwnerType____interface);
		jOwnerType__bodyDeclaration____bodyDeclarations.setSrc(jOwnerType);
		jOwnerType__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(jOwnerType__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration.setTrg(jOwnerType);
		ruleresult.getCreatedEdges().add(bodyDeclaration__jOwnerType____abstractTypeDeclaration);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		uOwnerType__feature____ownedAttribute.setName(uOwnerType__feature____ownedAttribute_name_prime);
		feature__uOwnerType____interface.setName(feature__uOwnerType____interface_name_prime);
		jOwnerType__bodyDeclaration____bodyDeclarations
				.setName(jOwnerType__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jOwnerType____abstractTypeDeclaration
				.setName(bodyDeclaration__jOwnerType____abstractTypeDeclaration_name_prime);
		return new Object[] { ruleresult, jOwnerType, feature, uOwnerType, bodyDeclaration,
				uOwnerType__feature____ownedAttribute, feature__uOwnerType____interface,
				jOwnerType__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jOwnerType____abstractTypeDeclaration };
	}

	public static final void pattern_FieldDec2Property4Interface_11_5_registerobjects_expressionBBBBBBBB(
			FieldDec2Property4Interface _this, PerformRuleResult ruleresult, EObject jOwnerType, EObject feature,
			EObject uOwnerType, EObject bodyDeclaration, EObject jo2uo, EObject nd2ne) {
		_this.registerObjects_BWD(ruleresult, jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne);

	}

	public static final PerformRuleResult pattern_FieldDec2Property4Interface_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_12_1_preparereturnvalue_bindingFB(
			FieldDec2Property4Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_12_1_preparereturnvalue_blackFBB(EClass eClass,
			FieldDec2Property4Interface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_12_1_preparereturnvalue_bindingAndBlackFFB(
			FieldDec2Property4Interface _this) {
		Object[] result_pattern_FieldDec2Property4Interface_12_1_preparereturnvalue_binding = pattern_FieldDec2Property4Interface_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property4Interface_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldDec2Property4Interface_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property4Interface_12_1_preparereturnvalue_black = pattern_FieldDec2Property4Interface_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldDec2Property4Interface_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldDec2Property4Interface_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldDec2Property4Interface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("uOwnerType");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUOwnerType = _localVariable_1;
		if (tmpFeature instanceof Property) {
			Property feature = (Property) tmpFeature;
			if (tmpUOwnerType instanceof Interface) {
				Interface uOwnerType = (Interface) tmpUOwnerType;
				return new Object[] { feature, uOwnerType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Interface_12_2_corematch_blackFBBFFFB(
			Property feature, Interface uOwnerType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element jo2uo : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(uOwnerType,
				ASTNode2Element.class, "target")) {
			ASTNode tmpJOwnerType = jo2uo.getSource();
			if (tmpJOwnerType instanceof InterfaceDeclaration) {
				InterfaceDeclaration jOwnerType = (InterfaceDeclaration) tmpJOwnerType;
				for (ASTNode2Element nd2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(feature,
						ASTNode2Element.class, "target")) {
					if (!jo2uo.equals(nd2ne)) {
						ASTNode tmpBodyDeclaration = nd2ne.getSource();
						if (tmpBodyDeclaration instanceof MFieldDefinition) {
							MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
							_result.add(new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne,
									match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Interface_12_3_findcontext_blackBBBBBB(
			InterfaceDeclaration jOwnerType, Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration,
			ASTNode2Element jo2uo, ASTNode2Element nd2ne) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jo2uo.equals(nd2ne)) {
			if (uOwnerType.getOwnedAttributes().contains(feature)) {
				if (jOwnerType.equals(jo2uo.getSource())) {
					if (uOwnerType.equals(jo2uo.getTarget())) {
						if (feature.equals(nd2ne.getTarget())) {
							if (bodyDeclaration.equals(nd2ne.getSource())) {
								_result.add(new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo,
										nd2ne });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_12_3_findcontext_greenBBBBBBFFFFFFF(
			InterfaceDeclaration jOwnerType, Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration,
			ASTNode2Element jo2uo, ASTNode2Element nd2ne) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge uOwnerType__feature____ownedAttribute = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__uOwnerType____interface = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jo2uo__jOwnerType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jo2uo__uOwnerType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String uOwnerType__feature____ownedAttribute_name_prime = "ownedAttribute";
		String feature__uOwnerType____interface_name_prime = "interface";
		String jo2uo__jOwnerType____source_name_prime = "source";
		String jo2uo__uOwnerType____target_name_prime = "target";
		String nd2ne__feature____target_name_prime = "target";
		String nd2ne__bodyDeclaration____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(jOwnerType);
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(uOwnerType);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jo2uo);
		isApplicableMatch.getAllContextElements().add(nd2ne);
		uOwnerType__feature____ownedAttribute.setSrc(uOwnerType);
		uOwnerType__feature____ownedAttribute.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(uOwnerType__feature____ownedAttribute);
		feature__uOwnerType____interface.setSrc(feature);
		feature__uOwnerType____interface.setTrg(uOwnerType);
		isApplicableMatch.getAllContextElements().add(feature__uOwnerType____interface);
		jo2uo__jOwnerType____source.setSrc(jo2uo);
		jo2uo__jOwnerType____source.setTrg(jOwnerType);
		isApplicableMatch.getAllContextElements().add(jo2uo__jOwnerType____source);
		jo2uo__uOwnerType____target.setSrc(jo2uo);
		jo2uo__uOwnerType____target.setTrg(uOwnerType);
		isApplicableMatch.getAllContextElements().add(jo2uo__uOwnerType____target);
		nd2ne__feature____target.setSrc(nd2ne);
		nd2ne__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(nd2ne__feature____target);
		nd2ne__bodyDeclaration____source.setSrc(nd2ne);
		nd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(nd2ne__bodyDeclaration____source);
		uOwnerType__feature____ownedAttribute.setName(uOwnerType__feature____ownedAttribute_name_prime);
		feature__uOwnerType____interface.setName(feature__uOwnerType____interface_name_prime);
		jo2uo__jOwnerType____source.setName(jo2uo__jOwnerType____source_name_prime);
		jo2uo__uOwnerType____target.setName(jo2uo__uOwnerType____target_name_prime);
		nd2ne__feature____target.setName(nd2ne__feature____target_name_prime);
		nd2ne__bodyDeclaration____source.setName(nd2ne__bodyDeclaration____source_name_prime);
		return new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne, isApplicableMatch,
				uOwnerType__feature____ownedAttribute, feature__uOwnerType____interface, jo2uo__jOwnerType____source,
				jo2uo__uOwnerType____target, nd2ne__feature____target, nd2ne__bodyDeclaration____source };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_12_4_solveCSP_bindingFBBBBBBBB(
			FieldDec2Property4Interface _this, IsApplicableMatch isApplicableMatch, InterfaceDeclaration jOwnerType,
			Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration, ASTNode2Element jo2uo,
			ASTNode2Element nd2ne) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, jOwnerType, feature, uOwnerType,
				bodyDeclaration, jo2uo, nd2ne);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jOwnerType, feature, uOwnerType, bodyDeclaration,
					jo2uo, nd2ne };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			FieldDec2Property4Interface _this, IsApplicableMatch isApplicableMatch, InterfaceDeclaration jOwnerType,
			Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration, ASTNode2Element jo2uo,
			ASTNode2Element nd2ne) {
		Object[] result_pattern_FieldDec2Property4Interface_12_4_solveCSP_binding = pattern_FieldDec2Property4Interface_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne);
		if (result_pattern_FieldDec2Property4Interface_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Interface_12_4_solveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property4Interface_12_4_solveCSP_black = pattern_FieldDec2Property4Interface_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Interface_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jOwnerType, feature, uOwnerType, bodyDeclaration,
						jo2uo, nd2ne };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Interface_12_5_checkCSP_expressionFBB(
			FieldDec2Property4Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldDec2Property4Interface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDec2Property4Interface_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_20_1_preparereturnvalue_bindingFB(
			FieldDec2Property4Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldDec2Property4Interface _this) {
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

	public static final Object[] pattern_FieldDec2Property4Interface_20_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldDec2Property4Interface _this) {
		Object[] result_pattern_FieldDec2Property4Interface_20_1_preparereturnvalue_binding = pattern_FieldDec2Property4Interface_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property4Interface_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldDec2Property4Interface_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property4Interface_20_1_preparereturnvalue_black = pattern_FieldDec2Property4Interface_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldDec2Property4Interface_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldDec2Property4Interface_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldDec2Property4Interface_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Interface_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedAttribute) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUOwnerType = _edge_ownedAttribute.getSrc();
		if (tmpUOwnerType instanceof Interface) {
			Interface uOwnerType = (Interface) tmpUOwnerType;
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

	public static final Object[] pattern_FieldDec2Property4Interface_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldDec2Property4Interface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldDec2Property4Interface _this, Match match, Property feature, Interface uOwnerType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, uOwnerType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Interface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldDec2Property4Interface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldDec2Property4Interface_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_21_1_preparereturnvalue_bindingFB(
			FieldDec2Property4Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			FieldDec2Property4Interface _this) {
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

	public static final Object[] pattern_FieldDec2Property4Interface_21_1_preparereturnvalue_bindingAndBlackFFBF(
			FieldDec2Property4Interface _this) {
		Object[] result_pattern_FieldDec2Property4Interface_21_1_preparereturnvalue_binding = pattern_FieldDec2Property4Interface_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldDec2Property4Interface_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldDec2Property4Interface_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldDec2Property4Interface_21_1_preparereturnvalue_black = pattern_FieldDec2Property4Interface_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldDec2Property4Interface_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldDec2Property4Interface_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldDec2Property4Interface_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Interface_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJOwnerType = _edge_bodyDeclarations.getSrc();
		if (tmpJOwnerType instanceof InterfaceDeclaration) {
			InterfaceDeclaration jOwnerType = (InterfaceDeclaration) tmpJOwnerType;
			EObject tmpBodyDeclaration = _edge_bodyDeclarations.getTrg();
			if (tmpBodyDeclaration instanceof MFieldDefinition) {
				MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
				if (jOwnerType.getBodyDeclarations().contains(bodyDeclaration)) {
					_result.add(new Object[] { jOwnerType, bodyDeclaration, _edge_bodyDeclarations });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldDec2Property4Interface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldDec2Property4Interface _this, Match match, InterfaceDeclaration jOwnerType,
			MFieldDefinition bodyDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jOwnerType, bodyDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Interface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldDec2Property4Interface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldDec2Property4Interface_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_24_1_prepare_blackB(
			FieldDec2Property4Interface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("jOwnerType");
		EObject _localVariable_1 = targetMatch.getObject("feature");
		EObject _localVariable_2 = targetMatch.getObject("uOwnerType");
		EObject _localVariable_3 = sourceMatch.getObject("bodyDeclaration");
		EObject tmpJOwnerType = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		EObject tmpUOwnerType = _localVariable_2;
		EObject tmpBodyDeclaration = _localVariable_3;
		if (tmpJOwnerType instanceof InterfaceDeclaration) {
			InterfaceDeclaration jOwnerType = (InterfaceDeclaration) tmpJOwnerType;
			if (tmpFeature instanceof Property) {
				Property feature = (Property) tmpFeature;
				if (tmpUOwnerType instanceof Interface) {
					Interface uOwnerType = (Interface) tmpUOwnerType;
					if (tmpBodyDeclaration instanceof MFieldDefinition) {
						MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
						return new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, sourceMatch,
								targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_24_2_matchsrctrgcontext_blackBBBBBB(
			InterfaceDeclaration jOwnerType, Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldDec2Property4Interface_24_2_matchsrctrgcontext_binding = pattern_FieldDec2Property4Interface_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_FieldDec2Property4Interface_24_2_matchsrctrgcontext_binding != null) {
			InterfaceDeclaration jOwnerType = (InterfaceDeclaration) result_pattern_FieldDec2Property4Interface_24_2_matchsrctrgcontext_binding[0];
			Property feature = (Property) result_pattern_FieldDec2Property4Interface_24_2_matchsrctrgcontext_binding[1];
			Interface uOwnerType = (Interface) result_pattern_FieldDec2Property4Interface_24_2_matchsrctrgcontext_binding[2];
			MFieldDefinition bodyDeclaration = (MFieldDefinition) result_pattern_FieldDec2Property4Interface_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_FieldDec2Property4Interface_24_2_matchsrctrgcontext_black = pattern_FieldDec2Property4Interface_24_2_matchsrctrgcontext_blackBBBBBB(
					jOwnerType, feature, uOwnerType, bodyDeclaration, sourceMatch, targetMatch);
			if (result_pattern_FieldDec2Property4Interface_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_24_3_solvecsp_bindingFBBBBBBB(
			FieldDec2Property4Interface _this, InterfaceDeclaration jOwnerType, Property feature, Interface uOwnerType,
			MFieldDefinition bodyDeclaration, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(jOwnerType, feature, uOwnerType, bodyDeclaration,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, jOwnerType, feature, uOwnerType, bodyDeclaration, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			FieldDec2Property4Interface _this, InterfaceDeclaration jOwnerType, Property feature, Interface uOwnerType,
			MFieldDefinition bodyDeclaration, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_FieldDec2Property4Interface_24_3_solvecsp_binding = pattern_FieldDec2Property4Interface_24_3_solvecsp_bindingFBBBBBBB(
				_this, jOwnerType, feature, uOwnerType, bodyDeclaration, sourceMatch, targetMatch);
		if (result_pattern_FieldDec2Property4Interface_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Interface_24_3_solvecsp_binding[0];

			Object[] result_pattern_FieldDec2Property4Interface_24_3_solvecsp_black = pattern_FieldDec2Property4Interface_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Interface_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, jOwnerType, feature, uOwnerType, bodyDeclaration, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Interface_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Interface_24_5_matchcorrcontext_blackBBBBFFBB(
			InterfaceDeclaration jOwnerType, Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element jo2uo : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jOwnerType,
					ASTNode2Element.class, "source")) {
				if (uOwnerType.equals(jo2uo.getTarget())) {
					for (ASTNode2Element nd2ne : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(feature, ASTNode2Element.class, "target")) {
						if (!jo2uo.equals(nd2ne)) {
							if (bodyDeclaration.equals(nd2ne.getSource())) {
								_result.add(new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo,
										nd2ne, sourceMatch, targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_24_5_matchcorrcontext_greenBBBBF(
			ASTNode2Element jo2uo, ASTNode2Element nd2ne, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "FieldDec2Property4Interface";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(jo2uo);
		ccMatch.getAllContextElements().add(nd2ne);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { jo2uo, nd2ne, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_24_6_createcorrespondence_blackBBBBB(
			InterfaceDeclaration jOwnerType, Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration,
			CCMatch ccMatch) {
		return new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "FieldDec2Property4Interface";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldDec2Property4Interface_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_27_1_matchtggpattern_blackBB(
			InterfaceDeclaration jOwnerType, MFieldDefinition bodyDeclaration) {
		if (jOwnerType.getBodyDeclarations().contains(bodyDeclaration)) {
			return new Object[] { jOwnerType, bodyDeclaration };
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Interface_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Interface_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_28_1_matchtggpattern_blackBB(Property feature,
			Interface uOwnerType) {
		if (uOwnerType.getOwnedAttributes().contains(feature)) {
			return new Object[] { feature, uOwnerType };
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Interface_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldDec2Property4Interface_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_29_1_createresult_blackB(
			FieldDec2Property4Interface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, InterfaceDeclaration jOwnerType) {
		if (ruleResult.getSourceObjects().contains(jOwnerType)) {
			return new Object[] { ruleResult, jOwnerType };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element jo2uo) {
		if (ruleResult.getCorrObjects().contains(jo2uo)) {
			return new Object[] { ruleResult, jo2uo };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Interface uOwnerType) {
		if (ruleResult.getTargetObjects().contains(uOwnerType)) {
			return new Object[] { ruleResult, uOwnerType };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Property feature) {
		if (ruleResult.getTargetObjects().contains(feature)) {
			return new Object[] { ruleResult, feature };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element nd2ne) {
		if (ruleResult.getCorrObjects().contains(nd2ne)) {
			return new Object[] { ruleResult, nd2ne };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MFieldDefinition bodyDeclaration) {
		if (ruleResult.getSourceObjects().contains(bodyDeclaration)) {
			return new Object[] { ruleResult, bodyDeclaration };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldDec2Property4Interface_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList jo2uoList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList nd2neList : ruleEntryContainer.getRuleEntryList()) {
				if (!jo2uoList.equals(nd2neList)) {
					for (EObject tmpJo2uo : jo2uoList.getEntryObjects()) {
						if (tmpJo2uo instanceof ASTNode2Element) {
							ASTNode2Element jo2uo = (ASTNode2Element) tmpJo2uo;
							ASTNode tmpJOwnerType = jo2uo.getSource();
							if (tmpJOwnerType instanceof InterfaceDeclaration) {
								InterfaceDeclaration jOwnerType = (InterfaceDeclaration) tmpJOwnerType;
								Element tmpUOwnerType = jo2uo.getTarget();
								if (tmpUOwnerType instanceof Interface) {
									Interface uOwnerType = (Interface) tmpUOwnerType;
									if (pattern_FieldDec2Property4Interface_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, jo2uo) == null) {
										if (pattern_FieldDec2Property4Interface_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, jOwnerType) == null) {
											if (pattern_FieldDec2Property4Interface_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, uOwnerType) == null) {
												for (EObject tmpNd2ne : nd2neList.getEntryObjects()) {
													if (tmpNd2ne instanceof ASTNode2Element) {
														ASTNode2Element nd2ne = (ASTNode2Element) tmpNd2ne;
														if (!jo2uo.equals(nd2ne)) {
															Element tmpFeature = nd2ne.getTarget();
															if (tmpFeature instanceof Property) {
																Property feature = (Property) tmpFeature;
																ASTNode tmpBodyDeclaration = nd2ne.getSource();
																if (tmpBodyDeclaration instanceof MFieldDefinition) {
																	MFieldDefinition bodyDeclaration = (MFieldDefinition) tmpBodyDeclaration;
																	if (pattern_FieldDec2Property4Interface_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, nd2ne) == null) {
																		if (pattern_FieldDec2Property4Interface_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, feature) == null) {
																			if (pattern_FieldDec2Property4Interface_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult,
																					bodyDeclaration) == null) {
																				_result.add(new Object[] { jo2uoList,
																						jOwnerType, jo2uo, uOwnerType,
																						nd2neList, feature, nd2ne,
																						bodyDeclaration,
																						ruleEntryContainer,
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

	public static final Object[] pattern_FieldDec2Property4Interface_29_3_solveCSP_bindingFBBBBBBBBB(
			FieldDec2Property4Interface _this, IsApplicableMatch isApplicableMatch, InterfaceDeclaration jOwnerType,
			Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration, ASTNode2Element jo2uo,
			ASTNode2Element nd2ne, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, jOwnerType, feature, uOwnerType,
				bodyDeclaration, jo2uo, nd2ne, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jOwnerType, feature, uOwnerType, bodyDeclaration,
					jo2uo, nd2ne, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldDec2Property4Interface_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			FieldDec2Property4Interface _this, IsApplicableMatch isApplicableMatch, InterfaceDeclaration jOwnerType,
			Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration, ASTNode2Element jo2uo,
			ASTNode2Element nd2ne, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FieldDec2Property4Interface_29_3_solveCSP_binding = pattern_FieldDec2Property4Interface_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne, ruleResult);
		if (result_pattern_FieldDec2Property4Interface_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldDec2Property4Interface_29_3_solveCSP_binding[0];

			Object[] result_pattern_FieldDec2Property4Interface_29_3_solveCSP_black = pattern_FieldDec2Property4Interface_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_FieldDec2Property4Interface_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jOwnerType, feature, uOwnerType, bodyDeclaration,
						jo2uo, nd2ne, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldDec2Property4Interface_29_4_checkCSP_expressionFBB(
			FieldDec2Property4Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_29_5_checknacs_blackBBBBBB(
			InterfaceDeclaration jOwnerType, Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration,
			ASTNode2Element jo2uo, ASTNode2Element nd2ne) {
		if (!jo2uo.equals(nd2ne)) {
			return new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_29_6_perform_blackBBBBBBB(
			InterfaceDeclaration jOwnerType, Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration,
			ASTNode2Element jo2uo, ASTNode2Element nd2ne, ModelgeneratorRuleResult ruleResult) {
		if (!jo2uo.equals(nd2ne)) {
			return new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, jo2uo, nd2ne, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldDec2Property4Interface_29_6_perform_greenBBBBB(
			InterfaceDeclaration jOwnerType, Property feature, Interface uOwnerType, MFieldDefinition bodyDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		uOwnerType.getOwnedAttributes().add(feature);
		jOwnerType.getBodyDeclarations().add(bodyDeclaration);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { jOwnerType, feature, uOwnerType, bodyDeclaration, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_FieldDec2Property4Interface_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldDec2Property4InterfaceImpl
