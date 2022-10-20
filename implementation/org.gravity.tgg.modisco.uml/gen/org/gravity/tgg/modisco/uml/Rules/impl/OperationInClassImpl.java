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
import org.eclipse.uml2.uml.Operation;

import org.gravity.modisco.MAbstractMethodDefinition;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.OperationInClass;
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
 * An implementation of the model object '<em><b>Operation In Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OperationInClassImpl extends AbstractRuleImpl implements OperationInClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationInClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getOperationInClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ClassDeclaration classDec,
			MAbstractMethodDefinition bodyDeclaration) {

		Object[] result1_black = OperationInClassImpl.pattern_OperationInClass_0_1_initialbindings_blackBBBB(this,
				match, classDec, bodyDeclaration);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[classDec] = " + classDec + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ".");
		}

		Object[] result2_bindingAndBlack = OperationInClassImpl
				.pattern_OperationInClass_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, classDec, bodyDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[classDec] = " + classDec + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (OperationInClassImpl.pattern_OperationInClass_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = OperationInClassImpl
					.pattern_OperationInClass_0_4_collectelementstobetranslated_blackBBB(match, classDec,
							bodyDeclaration);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[classDec] = " + classDec + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			OperationInClassImpl.pattern_OperationInClass_0_4_collectelementstobetranslated_greenBBBFF(match, classDec,
					bodyDeclaration);
			//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = OperationInClassImpl
					.pattern_OperationInClass_0_5_collectcontextelements_blackBBB(match, classDec, bodyDeclaration);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[classDec] = " + classDec + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			OperationInClassImpl.pattern_OperationInClass_0_5_collectcontextelements_greenBBB(match, classDec,
					bodyDeclaration);

			// 
			OperationInClassImpl.pattern_OperationInClass_0_6_registerobjectstomatch_expressionBBBB(this, match,
					classDec, bodyDeclaration);
			return OperationInClassImpl.pattern_OperationInClass_0_7_expressionF();
		} else {
			return OperationInClassImpl.pattern_OperationInClass_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = OperationInClassImpl
				.pattern_OperationInClass_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ClassDeclaration classDec = (ClassDeclaration) result1_bindingAndBlack[0];
		Operation feature = (Operation) result1_bindingAndBlack[1];
		ASTNode2Element c2c = (ASTNode2Element) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[3];
		ASTNode2Element bd2ne = (ASTNode2Element) result1_bindingAndBlack[4];
		MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		OperationInClassImpl.pattern_OperationInClass_1_1_performtransformation_greenBB(feature, umlClass);

		Object[] result2_green = OperationInClassImpl.pattern_OperationInClass_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = OperationInClassImpl.pattern_OperationInClass_1_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[classDec] = " + classDec + ", " + "[feature] = " + feature + ", " + "[c2c] = " + c2c
					+ ", " + "[umlClass] = " + umlClass + ", " + "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ".");
		}
		OperationInClassImpl.pattern_OperationInClass_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult, classDec,
				feature, umlClass, bodyDeclaration);
		//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge feature__umlClass____class = (EMoflonEdge) result3_green[8];

		// 
		// 
		OperationInClassImpl.pattern_OperationInClass_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, classDec,
				feature, c2c, umlClass, bd2ne, bodyDeclaration);
		return OperationInClassImpl.pattern_OperationInClass_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = OperationInClassImpl
				.pattern_OperationInClass_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = OperationInClassImpl
				.pattern_OperationInClass_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = OperationInClassImpl.pattern_OperationInClass_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ClassDeclaration classDec = (ClassDeclaration) result2_binding[0];
		MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_binding[1];
		for (Object[] result2_black : OperationInClassImpl.pattern_OperationInClass_2_2_corematch_blackBFFFFBB(classDec,
				bodyDeclaration, match)) {
			Operation feature = (Operation) result2_black[1];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[2];
			org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result2_black[3];
			ASTNode2Element bd2ne = (ASTNode2Element) result2_black[4];
			// ForEach 
			for (Object[] result3_black : OperationInClassImpl.pattern_OperationInClass_2_3_findcontext_blackBBBBBB(
					classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration)) {
				Object[] result3_green = OperationInClassImpl
						.pattern_OperationInClass_2_3_findcontext_greenBBBBBBFFFFFFF(classDec, feature, c2c, umlClass,
								bd2ne, bodyDeclaration);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c2c__umlClass____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge c2c__classDec____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = OperationInClassImpl
						.pattern_OperationInClass_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[classDec] = " + classDec + ", "
							+ "[feature] = " + feature + ", " + "[c2c] = " + c2c + ", " + "[umlClass] = " + umlClass
							+ ", " + "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (OperationInClassImpl.pattern_OperationInClass_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = OperationInClassImpl
							.pattern_OperationInClass_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					OperationInClassImpl.pattern_OperationInClass_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return OperationInClassImpl.pattern_OperationInClass_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ClassDeclaration classDec,
			MAbstractMethodDefinition bodyDeclaration) {
		match.registerObject("classDec", classDec);
		match.registerObject("bodyDeclaration", bodyDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassDeclaration classDec,
			MAbstractMethodDefinition bodyDeclaration) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ClassDeclaration classDec,
			Operation feature, ASTNode2Element c2c, org.eclipse.uml2.uml.Class umlClass, ASTNode2Element bd2ne,
			MAbstractMethodDefinition bodyDeclaration) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("c2c", c2c);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("bd2ne", bd2ne);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject classDec, EObject feature, EObject c2c,
			EObject umlClass, EObject bd2ne, EObject bodyDeclaration) {
		ruleresult.registerObject("classDec", classDec);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("c2c", c2c);
		ruleresult.registerObject("umlClass", umlClass);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);

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
	public boolean isAppropriate_BWD(Match match, Operation feature, org.eclipse.uml2.uml.Class umlClass) {

		Object[] result1_black = OperationInClassImpl.pattern_OperationInClass_10_1_initialbindings_blackBBBB(this,
				match, feature, umlClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[umlClass] = " + umlClass + ".");
		}

		Object[] result2_bindingAndBlack = OperationInClassImpl
				.pattern_OperationInClass_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, feature, umlClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[umlClass] = " + umlClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (OperationInClassImpl.pattern_OperationInClass_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = OperationInClassImpl
					.pattern_OperationInClass_10_4_collectelementstobetranslated_blackBBB(match, feature, umlClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[umlClass] = " + umlClass + ".");
			}
			OperationInClassImpl.pattern_OperationInClass_10_4_collectelementstobetranslated_greenBBBFF(match, feature,
					umlClass);
			//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge feature__umlClass____class = (EMoflonEdge) result4_green[4];

			Object[] result5_black = OperationInClassImpl
					.pattern_OperationInClass_10_5_collectcontextelements_blackBBB(match, feature, umlClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[umlClass] = " + umlClass + ".");
			}
			OperationInClassImpl.pattern_OperationInClass_10_5_collectcontextelements_greenBBB(match, feature,
					umlClass);

			// 
			OperationInClassImpl.pattern_OperationInClass_10_6_registerobjectstomatch_expressionBBBB(this, match,
					feature, umlClass);
			return OperationInClassImpl.pattern_OperationInClass_10_7_expressionF();
		} else {
			return OperationInClassImpl.pattern_OperationInClass_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = OperationInClassImpl
				.pattern_OperationInClass_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ClassDeclaration classDec = (ClassDeclaration) result1_bindingAndBlack[0];
		Operation feature = (Operation) result1_bindingAndBlack[1];
		ASTNode2Element c2c = (ASTNode2Element) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[3];
		ASTNode2Element bd2ne = (ASTNode2Element) result1_bindingAndBlack[4];
		MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		OperationInClassImpl.pattern_OperationInClass_11_1_performtransformation_greenBB(classDec, bodyDeclaration);

		Object[] result2_green = OperationInClassImpl.pattern_OperationInClass_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = OperationInClassImpl.pattern_OperationInClass_11_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[classDec] = " + classDec + ", " + "[feature] = " + feature + ", " + "[c2c] = " + c2c
					+ ", " + "[umlClass] = " + umlClass + ", " + "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ".");
		}
		OperationInClassImpl.pattern_OperationInClass_11_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult, classDec,
				feature, umlClass, bodyDeclaration);
		//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge feature__umlClass____class = (EMoflonEdge) result3_green[8];

		// 
		// 
		OperationInClassImpl.pattern_OperationInClass_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration);
		return OperationInClassImpl.pattern_OperationInClass_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = OperationInClassImpl
				.pattern_OperationInClass_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = OperationInClassImpl
				.pattern_OperationInClass_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = OperationInClassImpl.pattern_OperationInClass_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Operation feature = (Operation) result2_binding[0];
		org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result2_binding[1];
		for (Object[] result2_black : OperationInClassImpl.pattern_OperationInClass_12_2_corematch_blackFBFBFFB(feature,
				umlClass, match)) {
			ClassDeclaration classDec = (ClassDeclaration) result2_black[0];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[2];
			ASTNode2Element bd2ne = (ASTNode2Element) result2_black[4];
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_black[5];
			// ForEach 
			for (Object[] result3_black : OperationInClassImpl.pattern_OperationInClass_12_3_findcontext_blackBBBBBB(
					classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration)) {
				Object[] result3_green = OperationInClassImpl
						.pattern_OperationInClass_12_3_findcontext_greenBBBBBBFFFFFFF(classDec, feature, c2c, umlClass,
								bd2ne, bodyDeclaration);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge c2c__umlClass____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge c2c__classDec____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge feature__umlClass____class = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = OperationInClassImpl
						.pattern_OperationInClass_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[classDec] = " + classDec + ", "
							+ "[feature] = " + feature + ", " + "[c2c] = " + c2c + ", " + "[umlClass] = " + umlClass
							+ ", " + "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (OperationInClassImpl.pattern_OperationInClass_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = OperationInClassImpl
							.pattern_OperationInClass_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					OperationInClassImpl.pattern_OperationInClass_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return OperationInClassImpl.pattern_OperationInClass_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Operation feature, org.eclipse.uml2.uml.Class umlClass) {
		match.registerObject("feature", feature);
		match.registerObject("umlClass", umlClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Operation feature, org.eclipse.uml2.uml.Class umlClass) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassDeclaration classDec,
			Operation feature, ASTNode2Element c2c, org.eclipse.uml2.uml.Class umlClass, ASTNode2Element bd2ne,
			MAbstractMethodDefinition bodyDeclaration) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("c2c", c2c);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("bd2ne", bd2ne);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject classDec, EObject feature, EObject c2c,
			EObject umlClass, EObject bd2ne, EObject bodyDeclaration) {
		ruleresult.registerObject("classDec", classDec);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("c2c", c2c);
		ruleresult.registerObject("umlClass", umlClass);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_118(EMoflonEdge _edge_ownedOperation) {

		Object[] result1_bindingAndBlack = OperationInClassImpl
				.pattern_OperationInClass_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = OperationInClassImpl.pattern_OperationInClass_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : OperationInClassImpl
				.pattern_OperationInClass_20_2_testcorematchandDECs_blackFFB(_edge_ownedOperation)) {
			Operation feature = (Operation) result2_black[0];
			org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result2_black[1];
			Object[] result2_green = OperationInClassImpl
					.pattern_OperationInClass_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (OperationInClassImpl
					.pattern_OperationInClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, feature, umlClass)) {
				// 
				if (OperationInClassImpl
						.pattern_OperationInClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = OperationInClassImpl
							.pattern_OperationInClass_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					OperationInClassImpl.pattern_OperationInClass_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return OperationInClassImpl.pattern_OperationInClass_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_122(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = OperationInClassImpl
				.pattern_OperationInClass_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = OperationInClassImpl.pattern_OperationInClass_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : OperationInClassImpl
				.pattern_OperationInClass_21_2_testcorematchandDECs_blackFFB(_edge_bodyDeclarations)) {
			ClassDeclaration classDec = (ClassDeclaration) result2_black[0];
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_black[1];
			Object[] result2_green = OperationInClassImpl
					.pattern_OperationInClass_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (OperationInClassImpl
					.pattern_OperationInClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, classDec, bodyDeclaration)) {
				// 
				if (OperationInClassImpl
						.pattern_OperationInClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = OperationInClassImpl
							.pattern_OperationInClass_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					OperationInClassImpl.pattern_OperationInClass_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return OperationInClassImpl.pattern_OperationInClass_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("OperationInClass");
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
		ruleResult.setRule("OperationInClass");
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

		Object[] result1_black = OperationInClassImpl.pattern_OperationInClass_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = OperationInClassImpl.pattern_OperationInClass_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = OperationInClassImpl
				.pattern_OperationInClass_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		ClassDeclaration classDec = (ClassDeclaration) result2_bindingAndBlack[0];
		Operation feature = (Operation) result2_bindingAndBlack[1];
		org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[2];
		MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = OperationInClassImpl
				.pattern_OperationInClass_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, classDec, feature, umlClass,
						bodyDeclaration, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[classDec] = " + classDec + ", " + "[feature] = " + feature + ", " + "[umlClass] = " + umlClass
					+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (OperationInClassImpl.pattern_OperationInClass_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : OperationInClassImpl
					.pattern_OperationInClass_24_5_matchcorrcontext_blackBBFBFBBB(classDec, feature, umlClass,
							bodyDeclaration, sourceMatch, targetMatch)) {
				ASTNode2Element c2c = (ASTNode2Element) result5_black[2];
				ASTNode2Element bd2ne = (ASTNode2Element) result5_black[4];
				Object[] result5_green = OperationInClassImpl.pattern_OperationInClass_24_5_matchcorrcontext_greenBBBBF(
						c2c, bd2ne, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = OperationInClassImpl
						.pattern_OperationInClass_24_6_createcorrespondence_blackBBBBB(classDec, feature, umlClass,
								bodyDeclaration, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[classDec] = " + classDec
							+ ", " + "[feature] = " + feature + ", " + "[umlClass] = " + umlClass + ", "
							+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = OperationInClassImpl
						.pattern_OperationInClass_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				OperationInClassImpl.pattern_OperationInClass_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return OperationInClassImpl.pattern_OperationInClass_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(ClassDeclaration classDec, Operation feature,
			org.eclipse.uml2.uml.Class umlClass, MAbstractMethodDefinition bodyDeclaration, Match sourceMatch,
			Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(ClassDeclaration classDec, MAbstractMethodDefinition bodyDeclaration) {// 
		Object[] result1_black = OperationInClassImpl.pattern_OperationInClass_27_1_matchtggpattern_blackBB(classDec,
				bodyDeclaration);
		if (result1_black != null) {
			return OperationInClassImpl.pattern_OperationInClass_27_2_expressionF();
		} else {
			return OperationInClassImpl.pattern_OperationInClass_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Operation feature, org.eclipse.uml2.uml.Class umlClass) {// 
		Object[] result1_black = OperationInClassImpl.pattern_OperationInClass_28_1_matchtggpattern_blackBB(feature,
				umlClass);
		if (result1_black != null) {
			return OperationInClassImpl.pattern_OperationInClass_28_2_expressionF();
		} else {
			return OperationInClassImpl.pattern_OperationInClass_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element c2cParameter,
			ASTNode2Element bd2neParameter) {

		Object[] result1_black = OperationInClassImpl.pattern_OperationInClass_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = OperationInClassImpl.pattern_OperationInClass_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : OperationInClassImpl
				.pattern_OperationInClass_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList c2cList = (RuleEntryList) result2_black[0];
			ClassDeclaration classDec = (ClassDeclaration) result2_black[1];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[2];
			org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result2_black[3];
			//nothing RuleEntryList bd2neList = (RuleEntryList) result2_black[4];
			Operation feature = (Operation) result2_black[5];
			ASTNode2Element bd2ne = (ASTNode2Element) result2_black[6];
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_black[7];

			Object[] result3_bindingAndBlack = OperationInClassImpl
					.pattern_OperationInClass_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, classDec,
							feature, c2c, umlClass, bd2ne, bodyDeclaration, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[classDec] = " + classDec + ", "
						+ "[feature] = " + feature + ", " + "[c2c] = " + c2c + ", " + "[umlClass] = " + umlClass + ", "
						+ "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (OperationInClassImpl.pattern_OperationInClass_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = OperationInClassImpl.pattern_OperationInClass_29_5_checknacs_blackBBBBBB(
						classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration);
				if (result5_black != null) {

					Object[] result6_black = OperationInClassImpl.pattern_OperationInClass_29_6_perform_blackBBBBBBB(
							classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[classDec] = " + classDec + ", "
										+ "[feature] = " + feature + ", " + "[c2c] = " + c2c + ", " + "[umlClass] = "
										+ umlClass + ", " + "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = "
										+ bodyDeclaration + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					OperationInClassImpl.pattern_OperationInClass_29_6_perform_greenBBBBB(classDec, feature, umlClass,
							bodyDeclaration, ruleResult);

				} else {
				}

			} else {
			}

		}
		return OperationInClassImpl.pattern_OperationInClass_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassDeclaration classDec,
			Operation feature, ASTNode2Element c2c, org.eclipse.uml2.uml.Class umlClass, ASTNode2Element bd2ne,
			MAbstractMethodDefinition bodyDeclaration, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("c2c", c2c);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("bd2ne", bd2ne);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
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
		case RulesPackage.OPERATION_IN_CLASS___IS_APPROPRIATE_FWD__MATCH_CLASSDECLARATION_MABSTRACTMETHODDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(MAbstractMethodDefinition) arguments.get(2));
		case RulesPackage.OPERATION_IN_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.OPERATION_IN_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.OPERATION_IN_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSDECLARATION_MABSTRACTMETHODDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(MAbstractMethodDefinition) arguments.get(2));
			return null;
		case RulesPackage.OPERATION_IN_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSDECLARATION_MABSTRACTMETHODDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(MAbstractMethodDefinition) arguments.get(2));
		case RulesPackage.OPERATION_IN_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.OPERATION_IN_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASSDECLARATION_OPERATION_ASTNODE2ELEMENT_CLASS_ASTNODE2ELEMENT_MABSTRACTMETHODDEFINITION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(Operation) arguments.get(2), (ASTNode2Element) arguments.get(3),
					(org.eclipse.uml2.uml.Class) arguments.get(4), (ASTNode2Element) arguments.get(5),
					(MAbstractMethodDefinition) arguments.get(6));
		case RulesPackage.OPERATION_IN_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.OPERATION_IN_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.OPERATION_IN_CLASS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.OPERATION_IN_CLASS___IS_APPROPRIATE_BWD__MATCH_OPERATION_CLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
		case RulesPackage.OPERATION_IN_CLASS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.OPERATION_IN_CLASS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.OPERATION_IN_CLASS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_OPERATION_CLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
			return null;
		case RulesPackage.OPERATION_IN_CLASS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_OPERATION_CLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
		case RulesPackage.OPERATION_IN_CLASS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.OPERATION_IN_CLASS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDECLARATION_OPERATION_ASTNODE2ELEMENT_CLASS_ASTNODE2ELEMENT_MABSTRACTMETHODDEFINITION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(Operation) arguments.get(2), (ASTNode2Element) arguments.get(3),
					(org.eclipse.uml2.uml.Class) arguments.get(4), (ASTNode2Element) arguments.get(5),
					(MAbstractMethodDefinition) arguments.get(6));
		case RulesPackage.OPERATION_IN_CLASS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.OPERATION_IN_CLASS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.OPERATION_IN_CLASS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.OPERATION_IN_CLASS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_118__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_118((EMoflonEdge) arguments.get(0));
		case RulesPackage.OPERATION_IN_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_122__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_122((EMoflonEdge) arguments.get(0));
		case RulesPackage.OPERATION_IN_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.OPERATION_IN_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.OPERATION_IN_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.OPERATION_IN_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__CLASSDECLARATION_OPERATION_CLASS_MABSTRACTMETHODDEFINITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((ClassDeclaration) arguments.get(0), (Operation) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (MAbstractMethodDefinition) arguments.get(3),
					(Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.OPERATION_IN_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.OPERATION_IN_CLASS___CHECK_DEC_FWD__CLASSDECLARATION_MABSTRACTMETHODDEFINITION:
			return checkDEC_FWD((ClassDeclaration) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1));
		case RulesPackage.OPERATION_IN_CLASS___CHECK_DEC_BWD__OPERATION_CLASS:
			return checkDEC_BWD((Operation) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1));
		case RulesPackage.OPERATION_IN_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.OPERATION_IN_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDECLARATION_OPERATION_ASTNODE2ELEMENT_CLASS_ASTNODE2ELEMENT_MABSTRACTMETHODDEFINITION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(Operation) arguments.get(2), (ASTNode2Element) arguments.get(3),
					(org.eclipse.uml2.uml.Class) arguments.get(4), (ASTNode2Element) arguments.get(5),
					(MAbstractMethodDefinition) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.OPERATION_IN_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_OperationInClass_0_1_initialbindings_blackBBBB(OperationInClass _this,
			Match match, ClassDeclaration classDec, MAbstractMethodDefinition bodyDeclaration) {
		return new Object[] { _this, match, classDec, bodyDeclaration };
	}

	public static final Object[] pattern_OperationInClass_0_2_SolveCSP_bindingFBBBB(OperationInClass _this, Match match,
			ClassDeclaration classDec, MAbstractMethodDefinition bodyDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, classDec, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, classDec, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInClass_0_2_SolveCSP_bindingAndBlackFBBBB(OperationInClass _this,
			Match match, ClassDeclaration classDec, MAbstractMethodDefinition bodyDeclaration) {
		Object[] result_pattern_OperationInClass_0_2_SolveCSP_binding = pattern_OperationInClass_0_2_SolveCSP_bindingFBBBB(
				_this, match, classDec, bodyDeclaration);
		if (result_pattern_OperationInClass_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInClass_0_2_SolveCSP_binding[0];

			Object[] result_pattern_OperationInClass_0_2_SolveCSP_black = pattern_OperationInClass_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_OperationInClass_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, classDec, bodyDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInClass_0_3_CheckCSP_expressionFBB(OperationInClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInClass_0_4_collectelementstobetranslated_blackBBB(Match match,
			ClassDeclaration classDec, MAbstractMethodDefinition bodyDeclaration) {
		return new Object[] { match, classDec, bodyDeclaration };
	}

	public static final Object[] pattern_OperationInClass_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			ClassDeclaration classDec, MAbstractMethodDefinition bodyDeclaration) {
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		match.getToBeTranslatedEdges().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		return new Object[] { match, classDec, bodyDeclaration, classDec__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__classDec____abstractTypeDeclaration };
	}

	public static final Object[] pattern_OperationInClass_0_5_collectcontextelements_blackBBB(Match match,
			ClassDeclaration classDec, MAbstractMethodDefinition bodyDeclaration) {
		return new Object[] { match, classDec, bodyDeclaration };
	}

	public static final Object[] pattern_OperationInClass_0_5_collectcontextelements_greenBBB(Match match,
			ClassDeclaration classDec, MAbstractMethodDefinition bodyDeclaration) {
		match.getContextNodes().add(classDec);
		match.getContextNodes().add(bodyDeclaration);
		return new Object[] { match, classDec, bodyDeclaration };
	}

	public static final void pattern_OperationInClass_0_6_registerobjectstomatch_expressionBBBB(OperationInClass _this,
			Match match, ClassDeclaration classDec, MAbstractMethodDefinition bodyDeclaration) {
		_this.registerObjectsToMatch_FWD(match, classDec, bodyDeclaration);

	}

	public static final boolean pattern_OperationInClass_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OperationInClass_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OperationInClass_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("classDec");
		EObject _localVariable_1 = isApplicableMatch.getObject("feature");
		EObject _localVariable_2 = isApplicableMatch.getObject("c2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("umlClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("bd2ne");
		EObject _localVariable_5 = isApplicableMatch.getObject("bodyDeclaration");
		EObject tmpClassDec = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		EObject tmpC2c = _localVariable_2;
		EObject tmpUmlClass = _localVariable_3;
		EObject tmpBd2ne = _localVariable_4;
		EObject tmpBodyDeclaration = _localVariable_5;
		if (tmpClassDec instanceof ClassDeclaration) {
			ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
			if (tmpFeature instanceof Operation) {
				Operation feature = (Operation) tmpFeature;
				if (tmpC2c instanceof ASTNode2Element) {
					ASTNode2Element c2c = (ASTNode2Element) tmpC2c;
					if (tmpUmlClass instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) tmpUmlClass;
						if (tmpBd2ne instanceof ASTNode2Element) {
							ASTNode2Element bd2ne = (ASTNode2Element) tmpBd2ne;
							if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
								MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
								return new Object[] { classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_1_1_performtransformation_blackBBBBBBFBB(
			ClassDeclaration classDec, Operation feature, ASTNode2Element c2c, org.eclipse.uml2.uml.Class umlClass,
			ASTNode2Element bd2ne, MAbstractMethodDefinition bodyDeclaration, OperationInClass _this,
			IsApplicableMatch isApplicableMatch) {
		if (!bd2ne.equals(c2c)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			OperationInClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_OperationInClass_1_1_performtransformation_binding = pattern_OperationInClass_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_OperationInClass_1_1_performtransformation_binding != null) {
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_OperationInClass_1_1_performtransformation_binding[0];
			Operation feature = (Operation) result_pattern_OperationInClass_1_1_performtransformation_binding[1];
			ASTNode2Element c2c = (ASTNode2Element) result_pattern_OperationInClass_1_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result_pattern_OperationInClass_1_1_performtransformation_binding[3];
			ASTNode2Element bd2ne = (ASTNode2Element) result_pattern_OperationInClass_1_1_performtransformation_binding[4];
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result_pattern_OperationInClass_1_1_performtransformation_binding[5];

			Object[] result_pattern_OperationInClass_1_1_performtransformation_black = pattern_OperationInClass_1_1_performtransformation_blackBBBBBBFBB(
					classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration, _this, isApplicableMatch);
			if (result_pattern_OperationInClass_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_OperationInClass_1_1_performtransformation_black[6];

				return new Object[] { classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_1_1_performtransformation_greenBB(Operation feature,
			org.eclipse.uml2.uml.Class umlClass) {
		umlClass.getOwnedOperations().add(feature);
		return new Object[] { feature, umlClass };
	}

	public static final Object[] pattern_OperationInClass_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_OperationInClass_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject classDec, EObject feature, EObject c2c, EObject umlClass,
			EObject bd2ne, EObject bodyDeclaration) {
		if (!classDec.equals(feature)) {
			if (!classDec.equals(umlClass)) {
				if (!feature.equals(umlClass)) {
					if (!c2c.equals(classDec)) {
						if (!c2c.equals(feature)) {
							if (!c2c.equals(umlClass)) {
								if (!bd2ne.equals(classDec)) {
									if (!bd2ne.equals(feature)) {
										if (!bd2ne.equals(c2c)) {
											if (!bd2ne.equals(umlClass)) {
												if (!bd2ne.equals(bodyDeclaration)) {
													if (!bodyDeclaration.equals(classDec)) {
														if (!bodyDeclaration.equals(feature)) {
															if (!bodyDeclaration.equals(c2c)) {
																if (!bodyDeclaration.equals(umlClass)) {
																	return new Object[] { ruleresult, classDec, feature,
																			c2c, umlClass, bd2ne, bodyDeclaration };
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

	public static final Object[] pattern_OperationInClass_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject classDec, EObject feature, EObject umlClass,
			EObject bodyDeclaration) {
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "OperationInClass";
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____class_name_prime = "class";
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		ruleresult.getCreatedEdges().add(umlClass__feature____ownedOperation);
		feature__umlClass____class.setSrc(feature);
		feature__umlClass____class.setTrg(umlClass);
		ruleresult.getCreatedEdges().add(feature__umlClass____class);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____class.setName(feature__umlClass____class_name_prime);
		return new Object[] { ruleresult, classDec, feature, umlClass, bodyDeclaration,
				classDec__bodyDeclaration____bodyDeclarations, bodyDeclaration__classDec____abstractTypeDeclaration,
				umlClass__feature____ownedOperation, feature__umlClass____class };
	}

	public static final void pattern_OperationInClass_1_5_registerobjects_expressionBBBBBBBB(OperationInClass _this,
			PerformRuleResult ruleresult, EObject classDec, EObject feature, EObject c2c, EObject umlClass,
			EObject bd2ne, EObject bodyDeclaration) {
		_this.registerObjects_FWD(ruleresult, classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration);

	}

	public static final PerformRuleResult pattern_OperationInClass_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OperationInClass_2_1_preparereturnvalue_bindingFB(OperationInClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_2_1_preparereturnvalue_blackFBB(EClass eClass,
			OperationInClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_2_1_preparereturnvalue_bindingAndBlackFFB(
			OperationInClass _this) {
		Object[] result_pattern_OperationInClass_2_1_preparereturnvalue_binding = pattern_OperationInClass_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OperationInClass_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_OperationInClass_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OperationInClass_2_1_preparereturnvalue_black = pattern_OperationInClass_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_OperationInClass_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_OperationInClass_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "OperationInClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_OperationInClass_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("classDec");
		EObject _localVariable_1 = match.getObject("bodyDeclaration");
		EObject tmpClassDec = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		if (tmpClassDec instanceof ClassDeclaration) {
			ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
			if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
				MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
				return new Object[] { classDec, bodyDeclaration, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OperationInClass_2_2_corematch_blackBFFFFBB(
			ClassDeclaration classDec, MAbstractMethodDefinition bodyDeclaration, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(classDec,
				ASTNode2Element.class, "source")) {
			Element tmpUmlClass = c2c.getTarget();
			if (tmpUmlClass instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) tmpUmlClass;
				for (ASTNode2Element bd2ne : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(bodyDeclaration, ASTNode2Element.class, "source")) {
					if (!bd2ne.equals(c2c)) {
						Element tmpFeature = bd2ne.getTarget();
						if (tmpFeature instanceof Operation) {
							Operation feature = (Operation) tmpFeature;
							_result.add(
									new Object[] { classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_OperationInClass_2_3_findcontext_blackBBBBBB(
			ClassDeclaration classDec, Operation feature, ASTNode2Element c2c, org.eclipse.uml2.uml.Class umlClass,
			ASTNode2Element bd2ne, MAbstractMethodDefinition bodyDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!bd2ne.equals(c2c)) {
			if (classDec.getBodyDeclarations().contains(bodyDeclaration)) {
				if (umlClass.equals(c2c.getTarget())) {
					if (classDec.equals(c2c.getSource())) {
						if (feature.equals(bd2ne.getTarget())) {
							if (bodyDeclaration.equals(bd2ne.getSource())) {
								_result.add(new Object[] { classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OperationInClass_2_3_findcontext_greenBBBBBBFFFFFFF(ClassDeclaration classDec,
			Operation feature, ASTNode2Element c2c, org.eclipse.uml2.uml.Class umlClass, ASTNode2Element bd2ne,
			MAbstractMethodDefinition bodyDeclaration) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String c2c__umlClass____target_name_prime = "target";
		String c2c__classDec____source_name_prime = "source";
		String bd2ne__feature____target_name_prime = "target";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(classDec);
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(c2c);
		isApplicableMatch.getAllContextElements().add(umlClass);
		isApplicableMatch.getAllContextElements().add(bd2ne);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		c2c__umlClass____target.setSrc(c2c);
		c2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(c2c__umlClass____target);
		c2c__classDec____source.setSrc(c2c);
		c2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(c2c__classDec____source);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(bd2ne__feature____target);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(bd2ne__bodyDeclaration____source);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		c2c__umlClass____target.setName(c2c__umlClass____target_name_prime);
		c2c__classDec____source.setName(c2c__classDec____source_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		return new Object[] { classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration, isApplicableMatch,
				classDec__bodyDeclaration____bodyDeclarations, bodyDeclaration__classDec____abstractTypeDeclaration,
				c2c__umlClass____target, c2c__classDec____source, bd2ne__feature____target,
				bd2ne__bodyDeclaration____source };
	}

	public static final Object[] pattern_OperationInClass_2_4_solveCSP_bindingFBBBBBBBB(OperationInClass _this,
			IsApplicableMatch isApplicableMatch, ClassDeclaration classDec, Operation feature, ASTNode2Element c2c,
			org.eclipse.uml2.uml.Class umlClass, ASTNode2Element bd2ne, MAbstractMethodDefinition bodyDeclaration) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, classDec, feature, c2c, umlClass,
				bd2ne, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, classDec, feature, c2c, umlClass, bd2ne,
					bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInClass_2_4_solveCSP_bindingAndBlackFBBBBBBBB(OperationInClass _this,
			IsApplicableMatch isApplicableMatch, ClassDeclaration classDec, Operation feature, ASTNode2Element c2c,
			org.eclipse.uml2.uml.Class umlClass, ASTNode2Element bd2ne, MAbstractMethodDefinition bodyDeclaration) {
		Object[] result_pattern_OperationInClass_2_4_solveCSP_binding = pattern_OperationInClass_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration);
		if (result_pattern_OperationInClass_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInClass_2_4_solveCSP_binding[0];

			Object[] result_pattern_OperationInClass_2_4_solveCSP_black = pattern_OperationInClass_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_OperationInClass_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, classDec, feature, c2c, umlClass, bd2ne,
						bodyDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInClass_2_5_checkCSP_expressionFBB(OperationInClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInClass_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_OperationInClass_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "OperationInClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_OperationInClass_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OperationInClass_10_1_initialbindings_blackBBBB(OperationInClass _this,
			Match match, Operation feature, org.eclipse.uml2.uml.Class umlClass) {
		return new Object[] { _this, match, feature, umlClass };
	}

	public static final Object[] pattern_OperationInClass_10_2_SolveCSP_bindingFBBBB(OperationInClass _this,
			Match match, Operation feature, org.eclipse.uml2.uml.Class umlClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, umlClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, umlClass };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInClass_10_2_SolveCSP_bindingAndBlackFBBBB(OperationInClass _this,
			Match match, Operation feature, org.eclipse.uml2.uml.Class umlClass) {
		Object[] result_pattern_OperationInClass_10_2_SolveCSP_binding = pattern_OperationInClass_10_2_SolveCSP_bindingFBBBB(
				_this, match, feature, umlClass);
		if (result_pattern_OperationInClass_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInClass_10_2_SolveCSP_binding[0];

			Object[] result_pattern_OperationInClass_10_2_SolveCSP_black = pattern_OperationInClass_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_OperationInClass_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, umlClass };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInClass_10_3_CheckCSP_expressionFBB(OperationInClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInClass_10_4_collectelementstobetranslated_blackBBB(Match match,
			Operation feature, org.eclipse.uml2.uml.Class umlClass) {
		return new Object[] { match, feature, umlClass };
	}

	public static final Object[] pattern_OperationInClass_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			Operation feature, org.eclipse.uml2.uml.Class umlClass) {
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____class_name_prime = "class";
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		match.getToBeTranslatedEdges().add(umlClass__feature____ownedOperation);
		feature__umlClass____class.setSrc(feature);
		feature__umlClass____class.setTrg(umlClass);
		match.getToBeTranslatedEdges().add(feature__umlClass____class);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____class.setName(feature__umlClass____class_name_prime);
		return new Object[] { match, feature, umlClass, umlClass__feature____ownedOperation,
				feature__umlClass____class };
	}

	public static final Object[] pattern_OperationInClass_10_5_collectcontextelements_blackBBB(Match match,
			Operation feature, org.eclipse.uml2.uml.Class umlClass) {
		return new Object[] { match, feature, umlClass };
	}

	public static final Object[] pattern_OperationInClass_10_5_collectcontextelements_greenBBB(Match match,
			Operation feature, org.eclipse.uml2.uml.Class umlClass) {
		match.getContextNodes().add(feature);
		match.getContextNodes().add(umlClass);
		return new Object[] { match, feature, umlClass };
	}

	public static final void pattern_OperationInClass_10_6_registerobjectstomatch_expressionBBBB(OperationInClass _this,
			Match match, Operation feature, org.eclipse.uml2.uml.Class umlClass) {
		_this.registerObjectsToMatch_BWD(match, feature, umlClass);

	}

	public static final boolean pattern_OperationInClass_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OperationInClass_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OperationInClass_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("classDec");
		EObject _localVariable_1 = isApplicableMatch.getObject("feature");
		EObject _localVariable_2 = isApplicableMatch.getObject("c2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("umlClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("bd2ne");
		EObject _localVariable_5 = isApplicableMatch.getObject("bodyDeclaration");
		EObject tmpClassDec = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		EObject tmpC2c = _localVariable_2;
		EObject tmpUmlClass = _localVariable_3;
		EObject tmpBd2ne = _localVariable_4;
		EObject tmpBodyDeclaration = _localVariable_5;
		if (tmpClassDec instanceof ClassDeclaration) {
			ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
			if (tmpFeature instanceof Operation) {
				Operation feature = (Operation) tmpFeature;
				if (tmpC2c instanceof ASTNode2Element) {
					ASTNode2Element c2c = (ASTNode2Element) tmpC2c;
					if (tmpUmlClass instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) tmpUmlClass;
						if (tmpBd2ne instanceof ASTNode2Element) {
							ASTNode2Element bd2ne = (ASTNode2Element) tmpBd2ne;
							if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
								MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
								return new Object[] { classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_11_1_performtransformation_blackBBBBBBFBB(
			ClassDeclaration classDec, Operation feature, ASTNode2Element c2c, org.eclipse.uml2.uml.Class umlClass,
			ASTNode2Element bd2ne, MAbstractMethodDefinition bodyDeclaration, OperationInClass _this,
			IsApplicableMatch isApplicableMatch) {
		if (!bd2ne.equals(c2c)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			OperationInClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_OperationInClass_11_1_performtransformation_binding = pattern_OperationInClass_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_OperationInClass_11_1_performtransformation_binding != null) {
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_OperationInClass_11_1_performtransformation_binding[0];
			Operation feature = (Operation) result_pattern_OperationInClass_11_1_performtransformation_binding[1];
			ASTNode2Element c2c = (ASTNode2Element) result_pattern_OperationInClass_11_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result_pattern_OperationInClass_11_1_performtransformation_binding[3];
			ASTNode2Element bd2ne = (ASTNode2Element) result_pattern_OperationInClass_11_1_performtransformation_binding[4];
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result_pattern_OperationInClass_11_1_performtransformation_binding[5];

			Object[] result_pattern_OperationInClass_11_1_performtransformation_black = pattern_OperationInClass_11_1_performtransformation_blackBBBBBBFBB(
					classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration, _this, isApplicableMatch);
			if (result_pattern_OperationInClass_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_OperationInClass_11_1_performtransformation_black[6];

				return new Object[] { classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_11_1_performtransformation_greenBB(ClassDeclaration classDec,
			MAbstractMethodDefinition bodyDeclaration) {
		classDec.getBodyDeclarations().add(bodyDeclaration);
		return new Object[] { classDec, bodyDeclaration };
	}

	public static final Object[] pattern_OperationInClass_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_OperationInClass_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject classDec, EObject feature, EObject c2c, EObject umlClass,
			EObject bd2ne, EObject bodyDeclaration) {
		if (!classDec.equals(feature)) {
			if (!classDec.equals(umlClass)) {
				if (!feature.equals(umlClass)) {
					if (!c2c.equals(classDec)) {
						if (!c2c.equals(feature)) {
							if (!c2c.equals(umlClass)) {
								if (!bd2ne.equals(classDec)) {
									if (!bd2ne.equals(feature)) {
										if (!bd2ne.equals(c2c)) {
											if (!bd2ne.equals(umlClass)) {
												if (!bd2ne.equals(bodyDeclaration)) {
													if (!bodyDeclaration.equals(classDec)) {
														if (!bodyDeclaration.equals(feature)) {
															if (!bodyDeclaration.equals(c2c)) {
																if (!bodyDeclaration.equals(umlClass)) {
																	return new Object[] { ruleresult, classDec, feature,
																			c2c, umlClass, bd2ne, bodyDeclaration };
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

	public static final Object[] pattern_OperationInClass_11_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject classDec, EObject feature, EObject umlClass,
			EObject bodyDeclaration) {
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "OperationInClass";
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____class_name_prime = "class";
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		ruleresult.getCreatedEdges().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		ruleresult.getTranslatedEdges().add(umlClass__feature____ownedOperation);
		feature__umlClass____class.setSrc(feature);
		feature__umlClass____class.setTrg(umlClass);
		ruleresult.getTranslatedEdges().add(feature__umlClass____class);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____class.setName(feature__umlClass____class_name_prime);
		return new Object[] { ruleresult, classDec, feature, umlClass, bodyDeclaration,
				classDec__bodyDeclaration____bodyDeclarations, bodyDeclaration__classDec____abstractTypeDeclaration,
				umlClass__feature____ownedOperation, feature__umlClass____class };
	}

	public static final void pattern_OperationInClass_11_5_registerobjects_expressionBBBBBBBB(OperationInClass _this,
			PerformRuleResult ruleresult, EObject classDec, EObject feature, EObject c2c, EObject umlClass,
			EObject bd2ne, EObject bodyDeclaration) {
		_this.registerObjects_BWD(ruleresult, classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration);

	}

	public static final PerformRuleResult pattern_OperationInClass_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OperationInClass_12_1_preparereturnvalue_bindingFB(OperationInClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_12_1_preparereturnvalue_blackFBB(EClass eClass,
			OperationInClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_12_1_preparereturnvalue_bindingAndBlackFFB(
			OperationInClass _this) {
		Object[] result_pattern_OperationInClass_12_1_preparereturnvalue_binding = pattern_OperationInClass_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OperationInClass_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_OperationInClass_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OperationInClass_12_1_preparereturnvalue_black = pattern_OperationInClass_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_OperationInClass_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_OperationInClass_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "OperationInClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_OperationInClass_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("umlClass");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUmlClass = _localVariable_1;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			if (tmpUmlClass instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) tmpUmlClass;
				return new Object[] { feature, umlClass, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OperationInClass_12_2_corematch_blackFBFBFFB(Operation feature,
			org.eclipse.uml2.uml.Class umlClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(umlClass,
				ASTNode2Element.class, "target")) {
			ASTNode tmpClassDec = c2c.getSource();
			if (tmpClassDec instanceof ClassDeclaration) {
				ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
				for (ASTNode2Element bd2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(feature,
						ASTNode2Element.class, "target")) {
					if (!bd2ne.equals(c2c)) {
						ASTNode tmpBodyDeclaration = bd2ne.getSource();
						if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
							MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
							_result.add(
									new Object[] { classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_OperationInClass_12_3_findcontext_blackBBBBBB(
			ClassDeclaration classDec, Operation feature, ASTNode2Element c2c, org.eclipse.uml2.uml.Class umlClass,
			ASTNode2Element bd2ne, MAbstractMethodDefinition bodyDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!bd2ne.equals(c2c)) {
			if (umlClass.equals(c2c.getTarget())) {
				if (classDec.equals(c2c.getSource())) {
					if (feature.equals(bd2ne.getTarget())) {
						if (umlClass.getOwnedOperations().contains(feature)) {
							if (bodyDeclaration.equals(bd2ne.getSource())) {
								_result.add(new Object[] { classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OperationInClass_12_3_findcontext_greenBBBBBBFFFFFFF(ClassDeclaration classDec,
			Operation feature, ASTNode2Element c2c, org.eclipse.uml2.uml.Class umlClass, ASTNode2Element bd2ne,
			MAbstractMethodDefinition bodyDeclaration) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c2c__umlClass____target_name_prime = "target";
		String c2c__classDec____source_name_prime = "source";
		String bd2ne__feature____target_name_prime = "target";
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____class_name_prime = "class";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(classDec);
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(c2c);
		isApplicableMatch.getAllContextElements().add(umlClass);
		isApplicableMatch.getAllContextElements().add(bd2ne);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		c2c__umlClass____target.setSrc(c2c);
		c2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(c2c__umlClass____target);
		c2c__classDec____source.setSrc(c2c);
		c2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(c2c__classDec____source);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(bd2ne__feature____target);
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(umlClass__feature____ownedOperation);
		feature__umlClass____class.setSrc(feature);
		feature__umlClass____class.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(feature__umlClass____class);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(bd2ne__bodyDeclaration____source);
		c2c__umlClass____target.setName(c2c__umlClass____target_name_prime);
		c2c__classDec____source.setName(c2c__classDec____source_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____class.setName(feature__umlClass____class_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		return new Object[] { classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration, isApplicableMatch,
				c2c__umlClass____target, c2c__classDec____source, bd2ne__feature____target,
				umlClass__feature____ownedOperation, feature__umlClass____class, bd2ne__bodyDeclaration____source };
	}

	public static final Object[] pattern_OperationInClass_12_4_solveCSP_bindingFBBBBBBBB(OperationInClass _this,
			IsApplicableMatch isApplicableMatch, ClassDeclaration classDec, Operation feature, ASTNode2Element c2c,
			org.eclipse.uml2.uml.Class umlClass, ASTNode2Element bd2ne, MAbstractMethodDefinition bodyDeclaration) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, classDec, feature, c2c, umlClass,
				bd2ne, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, classDec, feature, c2c, umlClass, bd2ne,
					bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInClass_12_4_solveCSP_bindingAndBlackFBBBBBBBB(OperationInClass _this,
			IsApplicableMatch isApplicableMatch, ClassDeclaration classDec, Operation feature, ASTNode2Element c2c,
			org.eclipse.uml2.uml.Class umlClass, ASTNode2Element bd2ne, MAbstractMethodDefinition bodyDeclaration) {
		Object[] result_pattern_OperationInClass_12_4_solveCSP_binding = pattern_OperationInClass_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration);
		if (result_pattern_OperationInClass_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInClass_12_4_solveCSP_binding[0];

			Object[] result_pattern_OperationInClass_12_4_solveCSP_black = pattern_OperationInClass_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_OperationInClass_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, classDec, feature, c2c, umlClass, bd2ne,
						bodyDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInClass_12_5_checkCSP_expressionFBB(OperationInClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInClass_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_OperationInClass_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "OperationInClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_OperationInClass_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OperationInClass_20_1_preparereturnvalue_bindingFB(OperationInClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			OperationInClass _this) {
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

	public static final Object[] pattern_OperationInClass_20_1_preparereturnvalue_bindingAndBlackFFBF(
			OperationInClass _this) {
		Object[] result_pattern_OperationInClass_20_1_preparereturnvalue_binding = pattern_OperationInClass_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OperationInClass_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_OperationInClass_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OperationInClass_20_1_preparereturnvalue_black = pattern_OperationInClass_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_OperationInClass_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_OperationInClass_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_OperationInClass_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_OperationInClass_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedOperation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUmlClass = _edge_ownedOperation.getSrc();
		if (tmpUmlClass instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) tmpUmlClass;
			EObject tmpFeature = _edge_ownedOperation.getTrg();
			if (tmpFeature instanceof Operation) {
				Operation feature = (Operation) tmpFeature;
				if (umlClass.getOwnedOperations().contains(feature)) {
					_result.add(new Object[] { feature, umlClass, _edge_ownedOperation });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_OperationInClass_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_OperationInClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			OperationInClass _this, Match match, Operation feature, org.eclipse.uml2.uml.Class umlClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, umlClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_OperationInClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			OperationInClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInClass_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_OperationInClass_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_OperationInClass_21_1_preparereturnvalue_bindingFB(OperationInClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			OperationInClass _this) {
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

	public static final Object[] pattern_OperationInClass_21_1_preparereturnvalue_bindingAndBlackFFBF(
			OperationInClass _this) {
		Object[] result_pattern_OperationInClass_21_1_preparereturnvalue_binding = pattern_OperationInClass_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OperationInClass_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_OperationInClass_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OperationInClass_21_1_preparereturnvalue_black = pattern_OperationInClass_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_OperationInClass_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_OperationInClass_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_OperationInClass_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_OperationInClass_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpClassDec = _edge_bodyDeclarations.getSrc();
		if (tmpClassDec instanceof ClassDeclaration) {
			ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
			EObject tmpBodyDeclaration = _edge_bodyDeclarations.getTrg();
			if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
				MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
				if (classDec.getBodyDeclarations().contains(bodyDeclaration)) {
					_result.add(new Object[] { classDec, bodyDeclaration, _edge_bodyDeclarations });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_OperationInClass_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_OperationInClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			OperationInClass _this, Match match, ClassDeclaration classDec, MAbstractMethodDefinition bodyDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, classDec, bodyDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_OperationInClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			OperationInClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInClass_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_OperationInClass_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_OperationInClass_24_1_prepare_blackB(OperationInClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_OperationInClass_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_OperationInClass_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("classDec");
		EObject _localVariable_1 = targetMatch.getObject("feature");
		EObject _localVariable_2 = targetMatch.getObject("umlClass");
		EObject _localVariable_3 = sourceMatch.getObject("bodyDeclaration");
		EObject tmpClassDec = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		EObject tmpUmlClass = _localVariable_2;
		EObject tmpBodyDeclaration = _localVariable_3;
		if (tmpClassDec instanceof ClassDeclaration) {
			ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
			if (tmpFeature instanceof Operation) {
				Operation feature = (Operation) tmpFeature;
				if (tmpUmlClass instanceof org.eclipse.uml2.uml.Class) {
					org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) tmpUmlClass;
					if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
						MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
						return new Object[] { classDec, feature, umlClass, bodyDeclaration, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_24_2_matchsrctrgcontext_blackBBBBBB(ClassDeclaration classDec,
			Operation feature, org.eclipse.uml2.uml.Class umlClass, MAbstractMethodDefinition bodyDeclaration,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { classDec, feature, umlClass, bodyDeclaration, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_OperationInClass_24_2_matchsrctrgcontext_binding = pattern_OperationInClass_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_OperationInClass_24_2_matchsrctrgcontext_binding != null) {
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_OperationInClass_24_2_matchsrctrgcontext_binding[0];
			Operation feature = (Operation) result_pattern_OperationInClass_24_2_matchsrctrgcontext_binding[1];
			org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result_pattern_OperationInClass_24_2_matchsrctrgcontext_binding[2];
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result_pattern_OperationInClass_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_OperationInClass_24_2_matchsrctrgcontext_black = pattern_OperationInClass_24_2_matchsrctrgcontext_blackBBBBBB(
					classDec, feature, umlClass, bodyDeclaration, sourceMatch, targetMatch);
			if (result_pattern_OperationInClass_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { classDec, feature, umlClass, bodyDeclaration, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_24_3_solvecsp_bindingFBBBBBBB(OperationInClass _this,
			ClassDeclaration classDec, Operation feature, org.eclipse.uml2.uml.Class umlClass,
			MAbstractMethodDefinition bodyDeclaration, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(classDec, feature, umlClass, bodyDeclaration, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, classDec, feature, umlClass, bodyDeclaration, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInClass_24_3_solvecsp_bindingAndBlackFBBBBBBB(OperationInClass _this,
			ClassDeclaration classDec, Operation feature, org.eclipse.uml2.uml.Class umlClass,
			MAbstractMethodDefinition bodyDeclaration, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_OperationInClass_24_3_solvecsp_binding = pattern_OperationInClass_24_3_solvecsp_bindingFBBBBBBB(
				_this, classDec, feature, umlClass, bodyDeclaration, sourceMatch, targetMatch);
		if (result_pattern_OperationInClass_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInClass_24_3_solvecsp_binding[0];

			Object[] result_pattern_OperationInClass_24_3_solvecsp_black = pattern_OperationInClass_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_OperationInClass_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, classDec, feature, umlClass, bodyDeclaration, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInClass_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_OperationInClass_24_5_matchcorrcontext_blackBBFBFBBB(
			ClassDeclaration classDec, Operation feature, org.eclipse.uml2.uml.Class umlClass,
			MAbstractMethodDefinition bodyDeclaration, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(umlClass,
					ASTNode2Element.class, "target")) {
				if (classDec.equals(c2c.getSource())) {
					for (ASTNode2Element bd2ne : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(feature, ASTNode2Element.class, "target")) {
						if (!bd2ne.equals(c2c)) {
							if (bodyDeclaration.equals(bd2ne.getSource())) {
								_result.add(new Object[] { classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration,
										sourceMatch, targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OperationInClass_24_5_matchcorrcontext_greenBBBBF(ASTNode2Element c2c,
			ASTNode2Element bd2ne, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "OperationInClass";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(c2c);
		ccMatch.getAllContextElements().add(bd2ne);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { c2c, bd2ne, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_OperationInClass_24_6_createcorrespondence_blackBBBBB(
			ClassDeclaration classDec, Operation feature, org.eclipse.uml2.uml.Class umlClass,
			MAbstractMethodDefinition bodyDeclaration, CCMatch ccMatch) {
		return new Object[] { classDec, feature, umlClass, bodyDeclaration, ccMatch };
	}

	public static final Object[] pattern_OperationInClass_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_OperationInClass_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "OperationInClass";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_OperationInClass_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_OperationInClass_27_1_matchtggpattern_blackBB(ClassDeclaration classDec,
			MAbstractMethodDefinition bodyDeclaration) {
		if (classDec.getBodyDeclarations().contains(bodyDeclaration)) {
			return new Object[] { classDec, bodyDeclaration };
		}
		return null;
	}

	public static final boolean pattern_OperationInClass_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OperationInClass_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OperationInClass_28_1_matchtggpattern_blackBB(Operation feature,
			org.eclipse.uml2.uml.Class umlClass) {
		if (umlClass.getOwnedOperations().contains(feature)) {
			return new Object[] { feature, umlClass };
		}
		return null;
	}

	public static final boolean pattern_OperationInClass_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OperationInClass_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OperationInClass_29_1_createresult_blackB(OperationInClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_OperationInClass_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_OperationInClass_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ClassDeclaration classDec) {
		if (ruleResult.getSourceObjects().contains(classDec)) {
			return new Object[] { ruleResult, classDec };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element c2c) {
		if (ruleResult.getCorrObjects().contains(c2c)) {
			return new Object[] { ruleResult, c2c };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Class umlClass) {
		if (ruleResult.getTargetObjects().contains(umlClass)) {
			return new Object[] { ruleResult, umlClass };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Operation feature) {
		if (ruleResult.getTargetObjects().contains(feature)) {
			return new Object[] { ruleResult, feature };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element bd2ne) {
		if (ruleResult.getCorrObjects().contains(bd2ne)) {
			return new Object[] { ruleResult, bd2ne };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MAbstractMethodDefinition bodyDeclaration) {
		if (ruleResult.getSourceObjects().contains(bodyDeclaration)) {
			return new Object[] { ruleResult, bodyDeclaration };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OperationInClass_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList c2cList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList bd2neList : ruleEntryContainer.getRuleEntryList()) {
				if (!bd2neList.equals(c2cList)) {
					for (EObject tmpC2c : c2cList.getEntryObjects()) {
						if (tmpC2c instanceof ASTNode2Element) {
							ASTNode2Element c2c = (ASTNode2Element) tmpC2c;
							ASTNode tmpClassDec = c2c.getSource();
							if (tmpClassDec instanceof ClassDeclaration) {
								ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
								Element tmpUmlClass = c2c.getTarget();
								if (tmpUmlClass instanceof org.eclipse.uml2.uml.Class) {
									org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) tmpUmlClass;
									if (pattern_OperationInClass_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											c2c) == null) {
										if (pattern_OperationInClass_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												classDec) == null) {
											if (pattern_OperationInClass_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													umlClass) == null) {
												for (EObject tmpBd2ne : bd2neList.getEntryObjects()) {
													if (tmpBd2ne instanceof ASTNode2Element) {
														ASTNode2Element bd2ne = (ASTNode2Element) tmpBd2ne;
														if (!bd2ne.equals(c2c)) {
															Element tmpFeature = bd2ne.getTarget();
															if (tmpFeature instanceof Operation) {
																Operation feature = (Operation) tmpFeature;
																ASTNode tmpBodyDeclaration = bd2ne.getSource();
																if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
																	MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
																	if (pattern_OperationInClass_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, bd2ne) == null) {
																		if (pattern_OperationInClass_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, feature) == null) {
																			if (pattern_OperationInClass_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult,
																					bodyDeclaration) == null) {
																				_result.add(new Object[] { c2cList,
																						classDec, c2c, umlClass,
																						bd2neList, feature, bd2ne,
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

	public static final Object[] pattern_OperationInClass_29_3_solveCSP_bindingFBBBBBBBBB(OperationInClass _this,
			IsApplicableMatch isApplicableMatch, ClassDeclaration classDec, Operation feature, ASTNode2Element c2c,
			org.eclipse.uml2.uml.Class umlClass, ASTNode2Element bd2ne, MAbstractMethodDefinition bodyDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, classDec, feature, c2c, umlClass,
				bd2ne, bodyDeclaration, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, classDec, feature, c2c, umlClass, bd2ne,
					bodyDeclaration, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInClass_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			OperationInClass _this, IsApplicableMatch isApplicableMatch, ClassDeclaration classDec, Operation feature,
			ASTNode2Element c2c, org.eclipse.uml2.uml.Class umlClass, ASTNode2Element bd2ne,
			MAbstractMethodDefinition bodyDeclaration, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_OperationInClass_29_3_solveCSP_binding = pattern_OperationInClass_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration, ruleResult);
		if (result_pattern_OperationInClass_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInClass_29_3_solveCSP_binding[0];

			Object[] result_pattern_OperationInClass_29_3_solveCSP_black = pattern_OperationInClass_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_OperationInClass_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, classDec, feature, c2c, umlClass, bd2ne,
						bodyDeclaration, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInClass_29_4_checkCSP_expressionFBB(OperationInClass _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInClass_29_5_checknacs_blackBBBBBB(ClassDeclaration classDec,
			Operation feature, ASTNode2Element c2c, org.eclipse.uml2.uml.Class umlClass, ASTNode2Element bd2ne,
			MAbstractMethodDefinition bodyDeclaration) {
		if (!bd2ne.equals(c2c)) {
			return new Object[] { classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_29_6_perform_blackBBBBBBB(ClassDeclaration classDec,
			Operation feature, ASTNode2Element c2c, org.eclipse.uml2.uml.Class umlClass, ASTNode2Element bd2ne,
			MAbstractMethodDefinition bodyDeclaration, ModelgeneratorRuleResult ruleResult) {
		if (!bd2ne.equals(c2c)) {
			return new Object[] { classDec, feature, c2c, umlClass, bd2ne, bodyDeclaration, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_OperationInClass_29_6_perform_greenBBBBB(ClassDeclaration classDec,
			Operation feature, org.eclipse.uml2.uml.Class umlClass, MAbstractMethodDefinition bodyDeclaration,
			ModelgeneratorRuleResult ruleResult) {
		classDec.getBodyDeclarations().add(bodyDeclaration);
		umlClass.getOwnedOperations().add(feature);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { classDec, feature, umlClass, bodyDeclaration, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_OperationInClass_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //OperationInClassImpl
