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
import org.eclipse.modisco.java.AnonymousClassDeclaration;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Operation;

import org.gravity.modisco.MAbstractMethodDefinition;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.OperationInAnonymous;
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
 * An implementation of the model object '<em><b>Operation In Anonymous</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OperationInAnonymousImpl extends AbstractRuleImpl implements OperationInAnonymous {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationInAnonymousImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getOperationInAnonymous();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MAbstractMethodDefinition bodyDeclaration,
			AnonymousClassDeclaration classDec) {

		Object[] result1_black = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_0_1_initialbindings_blackBBBB(this, match, bodyDeclaration, classDec);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = "
					+ classDec + ".");
		}

		Object[] result2_bindingAndBlack = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, bodyDeclaration, classDec);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = "
					+ classDec + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (OperationInAnonymousImpl.pattern_OperationInAnonymous_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = OperationInAnonymousImpl
					.pattern_OperationInAnonymous_0_4_collectelementstobetranslated_blackBBB(match, bodyDeclaration,
							classDec);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = " + classDec + ".");
			}
			OperationInAnonymousImpl.pattern_OperationInAnonymous_0_4_collectelementstobetranslated_greenBBBFF(match,
					bodyDeclaration, classDec);
			//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge bodyDeclaration__classDec____anonymousClassDeclarationOwner = (EMoflonEdge) result4_green[4];

			Object[] result5_black = OperationInAnonymousImpl
					.pattern_OperationInAnonymous_0_5_collectcontextelements_blackBBB(match, bodyDeclaration, classDec);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = " + classDec + ".");
			}
			OperationInAnonymousImpl.pattern_OperationInAnonymous_0_5_collectcontextelements_greenBBB(match,
					bodyDeclaration, classDec);

			// 
			OperationInAnonymousImpl.pattern_OperationInAnonymous_0_6_registerobjectstomatch_expressionBBBB(this, match,
					bodyDeclaration, classDec);
			return OperationInAnonymousImpl.pattern_OperationInAnonymous_0_7_expressionF();
		} else {
			return OperationInAnonymousImpl.pattern_OperationInAnonymous_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ASTNode2Element bd2ne = (ASTNode2Element) result1_bindingAndBlack[0];
		ASTNode2Element a2c = (ASTNode2Element) result1_bindingAndBlack[1];
		org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[2];
		Operation feature = (Operation) result1_bindingAndBlack[3];
		MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result1_bindingAndBlack[4];
		AnonymousClassDeclaration classDec = (AnonymousClassDeclaration) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		OperationInAnonymousImpl.pattern_OperationInAnonymous_1_1_performtransformation_greenBB(umlClass, feature);

		Object[] result2_green = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, bd2ne, a2c, umlClass,
						feature, bodyDeclaration, classDec);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[bd2ne] = " + bd2ne + ", " + "[a2c] = " + a2c + ", " + "[umlClass] = " + umlClass + ", "
					+ "[feature] = " + feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
					+ "[classDec] = " + classDec + ".");
		}
		OperationInAnonymousImpl.pattern_OperationInAnonymous_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
				umlClass, feature, bodyDeclaration, classDec);
		//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge feature__umlClass____class = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bodyDeclaration__classDec____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[8];

		// 
		// 
		OperationInAnonymousImpl.pattern_OperationInAnonymous_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec);
		return OperationInAnonymousImpl.pattern_OperationInAnonymous_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_binding[0];
		AnonymousClassDeclaration classDec = (AnonymousClassDeclaration) result2_binding[1];
		for (Object[] result2_black : OperationInAnonymousImpl
				.pattern_OperationInAnonymous_2_2_corematch_blackFFFFBBB(bodyDeclaration, classDec, match)) {
			ASTNode2Element bd2ne = (ASTNode2Element) result2_black[0];
			ASTNode2Element a2c = (ASTNode2Element) result2_black[1];
			org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result2_black[2];
			Operation feature = (Operation) result2_black[3];
			// ForEach 
			for (Object[] result3_black : OperationInAnonymousImpl
					.pattern_OperationInAnonymous_2_3_findcontext_blackBBBBBB(bd2ne, a2c, umlClass, feature,
							bodyDeclaration, classDec)) {
				Object[] result3_green = OperationInAnonymousImpl
						.pattern_OperationInAnonymous_2_3_findcontext_greenBBBBBBFFFFFFF(bd2ne, a2c, umlClass, feature,
								bodyDeclaration, classDec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge a2c__umlClass____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge bodyDeclaration__classDec____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge a2c__classDec____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = OperationInAnonymousImpl
						.pattern_OperationInAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bd2ne] = " + bd2ne + ", "
							+ "[a2c] = " + a2c + ", " + "[umlClass] = " + umlClass + ", " + "[feature] = " + feature
							+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = " + classDec
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (OperationInAnonymousImpl.pattern_OperationInAnonymous_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = OperationInAnonymousImpl
							.pattern_OperationInAnonymous_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					OperationInAnonymousImpl.pattern_OperationInAnonymous_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return OperationInAnonymousImpl.pattern_OperationInAnonymous_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MAbstractMethodDefinition bodyDeclaration,
			AnonymousClassDeclaration classDec) {
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("classDec", classDec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MAbstractMethodDefinition bodyDeclaration,
			AnonymousClassDeclaration classDec) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ASTNode2Element bd2ne,
			ASTNode2Element a2c, org.eclipse.uml2.uml.Class umlClass, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("bd2ne", bd2ne);
		isApplicableMatch.registerObject("a2c", a2c);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("classDec", classDec);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject bd2ne, EObject a2c, EObject umlClass,
			EObject feature, EObject bodyDeclaration, EObject classDec) {
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("a2c", a2c);
		ruleresult.registerObject("umlClass", umlClass);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("classDec", classDec);

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
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Class umlClass, Operation feature) {

		Object[] result1_black = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_10_1_initialbindings_blackBBBB(this, match, umlClass, feature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[umlClass] = " + umlClass + ", " + "[feature] = " + feature + ".");
		}

		Object[] result2_bindingAndBlack = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, umlClass, feature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[umlClass] = " + umlClass + ", " + "[feature] = " + feature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (OperationInAnonymousImpl.pattern_OperationInAnonymous_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = OperationInAnonymousImpl
					.pattern_OperationInAnonymous_10_4_collectelementstobetranslated_blackBBB(match, umlClass, feature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[umlClass] = " + umlClass + ", " + "[feature] = " + feature + ".");
			}
			OperationInAnonymousImpl.pattern_OperationInAnonymous_10_4_collectelementstobetranslated_greenBBBFF(match,
					umlClass, feature);
			//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge feature__umlClass____class = (EMoflonEdge) result4_green[4];

			Object[] result5_black = OperationInAnonymousImpl
					.pattern_OperationInAnonymous_10_5_collectcontextelements_blackBBB(match, umlClass, feature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[umlClass] = " + umlClass + ", " + "[feature] = " + feature + ".");
			}
			OperationInAnonymousImpl.pattern_OperationInAnonymous_10_5_collectcontextelements_greenBBB(match, umlClass,
					feature);

			// 
			OperationInAnonymousImpl.pattern_OperationInAnonymous_10_6_registerobjectstomatch_expressionBBBB(this,
					match, umlClass, feature);
			return OperationInAnonymousImpl.pattern_OperationInAnonymous_10_7_expressionF();
		} else {
			return OperationInAnonymousImpl.pattern_OperationInAnonymous_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ASTNode2Element bd2ne = (ASTNode2Element) result1_bindingAndBlack[0];
		ASTNode2Element a2c = (ASTNode2Element) result1_bindingAndBlack[1];
		org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[2];
		Operation feature = (Operation) result1_bindingAndBlack[3];
		MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result1_bindingAndBlack[4];
		AnonymousClassDeclaration classDec = (AnonymousClassDeclaration) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		OperationInAnonymousImpl.pattern_OperationInAnonymous_11_1_performtransformation_greenBB(bodyDeclaration,
				classDec);

		Object[] result2_green = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, bd2ne, a2c, umlClass,
						feature, bodyDeclaration, classDec);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[bd2ne] = " + bd2ne + ", " + "[a2c] = " + a2c + ", " + "[umlClass] = " + umlClass + ", "
					+ "[feature] = " + feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
					+ "[classDec] = " + classDec + ".");
		}
		OperationInAnonymousImpl.pattern_OperationInAnonymous_11_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
				umlClass, feature, bodyDeclaration, classDec);
		//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge feature__umlClass____class = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bodyDeclaration__classDec____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[8];

		// 
		// 
		OperationInAnonymousImpl.pattern_OperationInAnonymous_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec);
		return OperationInAnonymousImpl.pattern_OperationInAnonymous_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result2_binding[0];
		Operation feature = (Operation) result2_binding[1];
		for (Object[] result2_black : OperationInAnonymousImpl
				.pattern_OperationInAnonymous_12_2_corematch_blackFFBBFFB(umlClass, feature, match)) {
			ASTNode2Element bd2ne = (ASTNode2Element) result2_black[0];
			ASTNode2Element a2c = (ASTNode2Element) result2_black[1];
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_black[4];
			AnonymousClassDeclaration classDec = (AnonymousClassDeclaration) result2_black[5];
			// ForEach 
			for (Object[] result3_black : OperationInAnonymousImpl
					.pattern_OperationInAnonymous_12_3_findcontext_blackBBBBBB(bd2ne, a2c, umlClass, feature,
							bodyDeclaration, classDec)) {
				Object[] result3_green = OperationInAnonymousImpl
						.pattern_OperationInAnonymous_12_3_findcontext_greenBBBBBBFFFFFFF(bd2ne, a2c, umlClass, feature,
								bodyDeclaration, classDec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge a2c__umlClass____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge feature__umlClass____class = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge a2c__classDec____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = OperationInAnonymousImpl
						.pattern_OperationInAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bd2ne] = " + bd2ne + ", "
							+ "[a2c] = " + a2c + ", " + "[umlClass] = " + umlClass + ", " + "[feature] = " + feature
							+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = " + classDec
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (OperationInAnonymousImpl.pattern_OperationInAnonymous_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = OperationInAnonymousImpl
							.pattern_OperationInAnonymous_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					OperationInAnonymousImpl.pattern_OperationInAnonymous_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return OperationInAnonymousImpl.pattern_OperationInAnonymous_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Class umlClass, Operation feature) {
		match.registerObject("umlClass", umlClass);
		match.registerObject("feature", feature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Class umlClass, Operation feature) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ASTNode2Element bd2ne,
			ASTNode2Element a2c, org.eclipse.uml2.uml.Class umlClass, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("bd2ne", bd2ne);
		isApplicableMatch.registerObject("a2c", a2c);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("classDec", classDec);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject bd2ne, EObject a2c, EObject umlClass,
			EObject feature, EObject bodyDeclaration, EObject classDec) {
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("a2c", a2c);
		ruleresult.registerObject("umlClass", umlClass);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("classDec", classDec);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_125(EMoflonEdge _edge_ownedOperation) {

		Object[] result1_bindingAndBlack = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = OperationInAnonymousImpl.pattern_OperationInAnonymous_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : OperationInAnonymousImpl
				.pattern_OperationInAnonymous_20_2_testcorematchandDECs_blackFFB(_edge_ownedOperation)) {
			org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result2_black[0];
			Operation feature = (Operation) result2_black[1];
			Object[] result2_green = OperationInAnonymousImpl
					.pattern_OperationInAnonymous_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (OperationInAnonymousImpl
					.pattern_OperationInAnonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, umlClass, feature)) {
				// 
				if (OperationInAnonymousImpl
						.pattern_OperationInAnonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = OperationInAnonymousImpl
							.pattern_OperationInAnonymous_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					OperationInAnonymousImpl.pattern_OperationInAnonymous_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return OperationInAnonymousImpl.pattern_OperationInAnonymous_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_131(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = OperationInAnonymousImpl.pattern_OperationInAnonymous_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : OperationInAnonymousImpl
				.pattern_OperationInAnonymous_21_2_testcorematchandDECs_blackFFB(_edge_bodyDeclarations)) {
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_black[0];
			AnonymousClassDeclaration classDec = (AnonymousClassDeclaration) result2_black[1];
			Object[] result2_green = OperationInAnonymousImpl
					.pattern_OperationInAnonymous_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (OperationInAnonymousImpl
					.pattern_OperationInAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, bodyDeclaration, classDec)) {
				// 
				if (OperationInAnonymousImpl
						.pattern_OperationInAnonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = OperationInAnonymousImpl
							.pattern_OperationInAnonymous_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					OperationInAnonymousImpl.pattern_OperationInAnonymous_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return OperationInAnonymousImpl.pattern_OperationInAnonymous_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("OperationInAnonymous");
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
		ruleResult.setRule("OperationInAnonymous");
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

		Object[] result1_black = OperationInAnonymousImpl.pattern_OperationInAnonymous_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = OperationInAnonymousImpl.pattern_OperationInAnonymous_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[0];
		Operation feature = (Operation) result2_bindingAndBlack[1];
		MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_bindingAndBlack[2];
		AnonymousClassDeclaration classDec = (AnonymousClassDeclaration) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, umlClass, feature,
						bodyDeclaration, classDec, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[umlClass] = " + umlClass + ", " + "[feature] = " + feature + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[classDec] = " + classDec + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (OperationInAnonymousImpl.pattern_OperationInAnonymous_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : OperationInAnonymousImpl
					.pattern_OperationInAnonymous_24_5_matchcorrcontext_blackFFBBBBBB(umlClass, feature,
							bodyDeclaration, classDec, sourceMatch, targetMatch)) {
				ASTNode2Element bd2ne = (ASTNode2Element) result5_black[0];
				ASTNode2Element a2c = (ASTNode2Element) result5_black[1];
				Object[] result5_green = OperationInAnonymousImpl
						.pattern_OperationInAnonymous_24_5_matchcorrcontext_greenBBBBF(bd2ne, a2c, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = OperationInAnonymousImpl
						.pattern_OperationInAnonymous_24_6_createcorrespondence_blackBBBBB(umlClass, feature,
								bodyDeclaration, classDec, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[umlClass] = " + umlClass
							+ ", " + "[feature] = " + feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[classDec] = " + classDec + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = OperationInAnonymousImpl
						.pattern_OperationInAnonymous_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				OperationInAnonymousImpl.pattern_OperationInAnonymous_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return OperationInAnonymousImpl.pattern_OperationInAnonymous_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Class umlClass, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec, Match sourceMatch,
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
	public boolean checkDEC_FWD(MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec) {// 
		Object[] result1_black = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_27_1_matchtggpattern_blackBB(bodyDeclaration, classDec);
		if (result1_black != null) {
			return OperationInAnonymousImpl.pattern_OperationInAnonymous_27_2_expressionF();
		} else {
			return OperationInAnonymousImpl.pattern_OperationInAnonymous_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Class umlClass, Operation feature) {// 
		Object[] result1_black = OperationInAnonymousImpl
				.pattern_OperationInAnonymous_28_1_matchtggpattern_blackBB(umlClass, feature);
		if (result1_black != null) {
			return OperationInAnonymousImpl.pattern_OperationInAnonymous_28_2_expressionF();
		} else {
			return OperationInAnonymousImpl.pattern_OperationInAnonymous_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element bd2neParameter,
			ASTNode2Element a2cParameter) {

		Object[] result1_black = OperationInAnonymousImpl.pattern_OperationInAnonymous_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = OperationInAnonymousImpl.pattern_OperationInAnonymous_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : OperationInAnonymousImpl
				.pattern_OperationInAnonymous_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList bd2neList = (RuleEntryList) result2_black[0];
			ASTNode2Element bd2ne = (ASTNode2Element) result2_black[1];
			Operation feature = (Operation) result2_black[2];
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_black[3];
			//nothing RuleEntryList a2cList = (RuleEntryList) result2_black[4];
			ASTNode2Element a2c = (ASTNode2Element) result2_black[5];
			org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result2_black[6];
			AnonymousClassDeclaration classDec = (AnonymousClassDeclaration) result2_black[7];

			Object[] result3_bindingAndBlack = OperationInAnonymousImpl
					.pattern_OperationInAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bd2ne] = " + bd2ne + ", " + "[a2c] = "
						+ a2c + ", " + "[umlClass] = " + umlClass + ", " + "[feature] = " + feature + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = " + classDec + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (OperationInAnonymousImpl.pattern_OperationInAnonymous_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = OperationInAnonymousImpl
						.pattern_OperationInAnonymous_29_5_checknacs_blackBBBBBB(bd2ne, a2c, umlClass, feature,
								bodyDeclaration, classDec);
				if (result5_black != null) {

					Object[] result6_black = OperationInAnonymousImpl
							.pattern_OperationInAnonymous_29_6_perform_blackBBBBBBB(bd2ne, a2c, umlClass, feature,
									bodyDeclaration, classDec, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[bd2ne] = " + bd2ne
								+ ", " + "[a2c] = " + a2c + ", " + "[umlClass] = " + umlClass + ", " + "[feature] = "
								+ feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = "
								+ classDec + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					OperationInAnonymousImpl.pattern_OperationInAnonymous_29_6_perform_greenBBBBB(umlClass, feature,
							bodyDeclaration, classDec, ruleResult);

				} else {
				}

			} else {
			}

		}
		return OperationInAnonymousImpl.pattern_OperationInAnonymous_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ASTNode2Element bd2ne,
			ASTNode2Element a2c, org.eclipse.uml2.uml.Class umlClass, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("bd2ne", bd2ne);
		isApplicableMatch.registerObject("a2c", a2c);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("classDec", classDec);
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
		case RulesPackage.OPERATION_IN_ANONYMOUS___IS_APPROPRIATE_FWD__MATCH_MABSTRACTMETHODDEFINITION_ANONYMOUSCLASSDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2));
		case RulesPackage.OPERATION_IN_ANONYMOUS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.OPERATION_IN_ANONYMOUS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.OPERATION_IN_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MABSTRACTMETHODDEFINITION_ANONYMOUSCLASSDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2));
			return null;
		case RulesPackage.OPERATION_IN_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MABSTRACTMETHODDEFINITION_ANONYMOUSCLASSDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2));
		case RulesPackage.OPERATION_IN_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.OPERATION_IN_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASTNODE2ELEMENT_ASTNODE2ELEMENT_CLASS_OPERATION_MABSTRACTMETHODDEFINITION_ANONYMOUSCLASSDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (org.eclipse.uml2.uml.Class) arguments.get(3),
					(Operation) arguments.get(4), (MAbstractMethodDefinition) arguments.get(5),
					(AnonymousClassDeclaration) arguments.get(6));
		case RulesPackage.OPERATION_IN_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.OPERATION_IN_ANONYMOUS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.OPERATION_IN_ANONYMOUS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.OPERATION_IN_ANONYMOUS___IS_APPROPRIATE_BWD__MATCH_CLASS_OPERATION:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(Operation) arguments.get(2));
		case RulesPackage.OPERATION_IN_ANONYMOUS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.OPERATION_IN_ANONYMOUS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.OPERATION_IN_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CLASS_OPERATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(Operation) arguments.get(2));
			return null;
		case RulesPackage.OPERATION_IN_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CLASS_OPERATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(Operation) arguments.get(2));
		case RulesPackage.OPERATION_IN_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.OPERATION_IN_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ASTNODE2ELEMENT_ASTNODE2ELEMENT_CLASS_OPERATION_MABSTRACTMETHODDEFINITION_ANONYMOUSCLASSDECLARATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (org.eclipse.uml2.uml.Class) arguments.get(3),
					(Operation) arguments.get(4), (MAbstractMethodDefinition) arguments.get(5),
					(AnonymousClassDeclaration) arguments.get(6));
		case RulesPackage.OPERATION_IN_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.OPERATION_IN_ANONYMOUS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.OPERATION_IN_ANONYMOUS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.OPERATION_IN_ANONYMOUS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_125__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_125((EMoflonEdge) arguments.get(0));
		case RulesPackage.OPERATION_IN_ANONYMOUS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_131__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_131((EMoflonEdge) arguments.get(0));
		case RulesPackage.OPERATION_IN_ANONYMOUS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.OPERATION_IN_ANONYMOUS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.OPERATION_IN_ANONYMOUS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.OPERATION_IN_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_CC__CLASS_OPERATION_MABSTRACTMETHODDEFINITION_ANONYMOUSCLASSDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.uml2.uml.Class) arguments.get(0), (Operation) arguments.get(1),
					(MAbstractMethodDefinition) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
					(Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.OPERATION_IN_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.OPERATION_IN_ANONYMOUS___CHECK_DEC_FWD__MABSTRACTMETHODDEFINITION_ANONYMOUSCLASSDECLARATION:
			return checkDEC_FWD((MAbstractMethodDefinition) arguments.get(0),
					(AnonymousClassDeclaration) arguments.get(1));
		case RulesPackage.OPERATION_IN_ANONYMOUS___CHECK_DEC_BWD__CLASS_OPERATION:
			return checkDEC_BWD((org.eclipse.uml2.uml.Class) arguments.get(0), (Operation) arguments.get(1));
		case RulesPackage.OPERATION_IN_ANONYMOUS___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.OPERATION_IN_ANONYMOUS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ASTNODE2ELEMENT_ASTNODE2ELEMENT_CLASS_OPERATION_MABSTRACTMETHODDEFINITION_ANONYMOUSCLASSDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (org.eclipse.uml2.uml.Class) arguments.get(3),
					(Operation) arguments.get(4), (MAbstractMethodDefinition) arguments.get(5),
					(AnonymousClassDeclaration) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.OPERATION_IN_ANONYMOUS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_OperationInAnonymous_0_1_initialbindings_blackBBBB(OperationInAnonymous _this,
			Match match, MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec) {
		return new Object[] { _this, match, bodyDeclaration, classDec };
	}

	public static final Object[] pattern_OperationInAnonymous_0_2_SolveCSP_bindingFBBBB(OperationInAnonymous _this,
			Match match, MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, bodyDeclaration, classDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, bodyDeclaration, classDec };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInAnonymous_0_2_SolveCSP_bindingAndBlackFBBBB(
			OperationInAnonymous _this, Match match, MAbstractMethodDefinition bodyDeclaration,
			AnonymousClassDeclaration classDec) {
		Object[] result_pattern_OperationInAnonymous_0_2_SolveCSP_binding = pattern_OperationInAnonymous_0_2_SolveCSP_bindingFBBBB(
				_this, match, bodyDeclaration, classDec);
		if (result_pattern_OperationInAnonymous_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInAnonymous_0_2_SolveCSP_binding[0];

			Object[] result_pattern_OperationInAnonymous_0_2_SolveCSP_black = pattern_OperationInAnonymous_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_OperationInAnonymous_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, bodyDeclaration, classDec };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInAnonymous_0_3_CheckCSP_expressionFBB(OperationInAnonymous _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_0_4_collectelementstobetranslated_blackBBB(Match match,
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec) {
		return new Object[] { match, bodyDeclaration, classDec };
	}

	public static final Object[] pattern_OperationInAnonymous_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec) {
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____anonymousClassDeclarationOwner.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____anonymousClassDeclarationOwner.setTrg(classDec);
		match.getToBeTranslatedEdges().add(bodyDeclaration__classDec____anonymousClassDeclarationOwner);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____anonymousClassDeclarationOwner
				.setName(bodyDeclaration__classDec____anonymousClassDeclarationOwner_name_prime);
		return new Object[] { match, bodyDeclaration, classDec, classDec__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__classDec____anonymousClassDeclarationOwner };
	}

	public static final Object[] pattern_OperationInAnonymous_0_5_collectcontextelements_blackBBB(Match match,
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec) {
		return new Object[] { match, bodyDeclaration, classDec };
	}

	public static final Object[] pattern_OperationInAnonymous_0_5_collectcontextelements_greenBBB(Match match,
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec) {
		match.getContextNodes().add(bodyDeclaration);
		match.getContextNodes().add(classDec);
		return new Object[] { match, bodyDeclaration, classDec };
	}

	public static final void pattern_OperationInAnonymous_0_6_registerobjectstomatch_expressionBBBB(
			OperationInAnonymous _this, Match match, MAbstractMethodDefinition bodyDeclaration,
			AnonymousClassDeclaration classDec) {
		_this.registerObjectsToMatch_FWD(match, bodyDeclaration, classDec);

	}

	public static final boolean pattern_OperationInAnonymous_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OperationInAnonymous_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("bd2ne");
		EObject _localVariable_1 = isApplicableMatch.getObject("a2c");
		EObject _localVariable_2 = isApplicableMatch.getObject("umlClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("feature");
		EObject _localVariable_4 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_5 = isApplicableMatch.getObject("classDec");
		EObject tmpBd2ne = _localVariable_0;
		EObject tmpA2c = _localVariable_1;
		EObject tmpUmlClass = _localVariable_2;
		EObject tmpFeature = _localVariable_3;
		EObject tmpBodyDeclaration = _localVariable_4;
		EObject tmpClassDec = _localVariable_5;
		if (tmpBd2ne instanceof ASTNode2Element) {
			ASTNode2Element bd2ne = (ASTNode2Element) tmpBd2ne;
			if (tmpA2c instanceof ASTNode2Element) {
				ASTNode2Element a2c = (ASTNode2Element) tmpA2c;
				if (tmpUmlClass instanceof org.eclipse.uml2.uml.Class) {
					org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) tmpUmlClass;
					if (tmpFeature instanceof Operation) {
						Operation feature = (Operation) tmpFeature;
						if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
							MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
							if (tmpClassDec instanceof AnonymousClassDeclaration) {
								AnonymousClassDeclaration classDec = (AnonymousClassDeclaration) tmpClassDec;
								return new Object[] { bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_1_1_performtransformation_blackBBBBBBFBB(
			ASTNode2Element bd2ne, ASTNode2Element a2c, org.eclipse.uml2.uml.Class umlClass, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec, OperationInAnonymous _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a2c.equals(bd2ne)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			OperationInAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_OperationInAnonymous_1_1_performtransformation_binding = pattern_OperationInAnonymous_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_OperationInAnonymous_1_1_performtransformation_binding != null) {
			ASTNode2Element bd2ne = (ASTNode2Element) result_pattern_OperationInAnonymous_1_1_performtransformation_binding[0];
			ASTNode2Element a2c = (ASTNode2Element) result_pattern_OperationInAnonymous_1_1_performtransformation_binding[1];
			org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result_pattern_OperationInAnonymous_1_1_performtransformation_binding[2];
			Operation feature = (Operation) result_pattern_OperationInAnonymous_1_1_performtransformation_binding[3];
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result_pattern_OperationInAnonymous_1_1_performtransformation_binding[4];
			AnonymousClassDeclaration classDec = (AnonymousClassDeclaration) result_pattern_OperationInAnonymous_1_1_performtransformation_binding[5];

			Object[] result_pattern_OperationInAnonymous_1_1_performtransformation_black = pattern_OperationInAnonymous_1_1_performtransformation_blackBBBBBBFBB(
					bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec, _this, isApplicableMatch);
			if (result_pattern_OperationInAnonymous_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_OperationInAnonymous_1_1_performtransformation_black[6];

				return new Object[] { bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_1_1_performtransformation_greenBB(
			org.eclipse.uml2.uml.Class umlClass, Operation feature) {
		umlClass.getOwnedOperations().add(feature);
		return new Object[] { umlClass, feature };
	}

	public static final Object[] pattern_OperationInAnonymous_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_OperationInAnonymous_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject bd2ne, EObject a2c, EObject umlClass, EObject feature,
			EObject bodyDeclaration, EObject classDec) {
		if (!bd2ne.equals(umlClass)) {
			if (!bd2ne.equals(feature)) {
				if (!bd2ne.equals(bodyDeclaration)) {
					if (!bd2ne.equals(classDec)) {
						if (!a2c.equals(bd2ne)) {
							if (!a2c.equals(umlClass)) {
								if (!a2c.equals(feature)) {
									if (!a2c.equals(bodyDeclaration)) {
										if (!a2c.equals(classDec)) {
											if (!feature.equals(umlClass)) {
												if (!bodyDeclaration.equals(umlClass)) {
													if (!bodyDeclaration.equals(feature)) {
														if (!bodyDeclaration.equals(classDec)) {
															if (!classDec.equals(umlClass)) {
																if (!classDec.equals(feature)) {
																	return new Object[] { ruleresult, bd2ne, a2c,
																			umlClass, feature, bodyDeclaration,
																			classDec };
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

	public static final Object[] pattern_OperationInAnonymous_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject umlClass, EObject feature, EObject bodyDeclaration,
			EObject classDec) {
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "OperationInAnonymous";
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____class_name_prime = "class";
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		ruleresult.getCreatedEdges().add(umlClass__feature____ownedOperation);
		feature__umlClass____class.setSrc(feature);
		feature__umlClass____class.setTrg(umlClass);
		ruleresult.getCreatedEdges().add(feature__umlClass____class);
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____anonymousClassDeclarationOwner.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____anonymousClassDeclarationOwner.setTrg(classDec);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__classDec____anonymousClassDeclarationOwner);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____class.setName(feature__umlClass____class_name_prime);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____anonymousClassDeclarationOwner
				.setName(bodyDeclaration__classDec____anonymousClassDeclarationOwner_name_prime);
		return new Object[] { ruleresult, umlClass, feature, bodyDeclaration, classDec,
				umlClass__feature____ownedOperation, feature__umlClass____class,
				classDec__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__classDec____anonymousClassDeclarationOwner };
	}

	public static final void pattern_OperationInAnonymous_1_5_registerobjects_expressionBBBBBBBB(
			OperationInAnonymous _this, PerformRuleResult ruleresult, EObject bd2ne, EObject a2c, EObject umlClass,
			EObject feature, EObject bodyDeclaration, EObject classDec) {
		_this.registerObjects_FWD(ruleresult, bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec);

	}

	public static final PerformRuleResult pattern_OperationInAnonymous_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_2_1_preparereturnvalue_bindingFB(
			OperationInAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_2_1_preparereturnvalue_blackFBB(EClass eClass,
			OperationInAnonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_2_1_preparereturnvalue_bindingAndBlackFFB(
			OperationInAnonymous _this) {
		Object[] result_pattern_OperationInAnonymous_2_1_preparereturnvalue_binding = pattern_OperationInAnonymous_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OperationInAnonymous_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_OperationInAnonymous_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OperationInAnonymous_2_1_preparereturnvalue_black = pattern_OperationInAnonymous_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_OperationInAnonymous_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_OperationInAnonymous_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "OperationInAnonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_OperationInAnonymous_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("bodyDeclaration");
		EObject _localVariable_1 = match.getObject("classDec");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpClassDec = _localVariable_1;
		if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
			if (tmpClassDec instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration classDec = (AnonymousClassDeclaration) tmpClassDec;
				return new Object[] { bodyDeclaration, classDec, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OperationInAnonymous_2_2_corematch_blackFFFFBBB(
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element bd2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(bodyDeclaration,
				ASTNode2Element.class, "source")) {
			Element tmpFeature = bd2ne.getTarget();
			if (tmpFeature instanceof Operation) {
				Operation feature = (Operation) tmpFeature;
				for (ASTNode2Element a2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(classDec,
						ASTNode2Element.class, "source")) {
					if (!a2c.equals(bd2ne)) {
						Element tmpUmlClass = a2c.getTarget();
						if (tmpUmlClass instanceof org.eclipse.uml2.uml.Class) {
							org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) tmpUmlClass;
							_result.add(
									new Object[] { bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_OperationInAnonymous_2_3_findcontext_blackBBBBBB(
			ASTNode2Element bd2ne, ASTNode2Element a2c, org.eclipse.uml2.uml.Class umlClass, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a2c.equals(bd2ne)) {
			if (umlClass.equals(a2c.getTarget())) {
				if (feature.equals(bd2ne.getTarget())) {
					if (bodyDeclaration.equals(bd2ne.getSource())) {
						if (classDec.getBodyDeclarations().contains(bodyDeclaration)) {
							if (classDec.equals(a2c.getSource())) {
								_result.add(new Object[] { bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_2_3_findcontext_greenBBBBBBFFFFFFF(ASTNode2Element bd2ne,
			ASTNode2Element a2c, org.eclipse.uml2.uml.Class umlClass, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge a2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge a2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String a2c__umlClass____target_name_prime = "target";
		String bd2ne__feature____target_name_prime = "target";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String a2c__classDec____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(bd2ne);
		isApplicableMatch.getAllContextElements().add(a2c);
		isApplicableMatch.getAllContextElements().add(umlClass);
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(classDec);
		a2c__umlClass____target.setSrc(a2c);
		a2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(a2c__umlClass____target);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(bd2ne__feature____target);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(bd2ne__bodyDeclaration____source);
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____anonymousClassDeclarationOwner.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____anonymousClassDeclarationOwner.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__classDec____anonymousClassDeclarationOwner);
		a2c__classDec____source.setSrc(a2c);
		a2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(a2c__classDec____source);
		a2c__umlClass____target.setName(a2c__umlClass____target_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____anonymousClassDeclarationOwner
				.setName(bodyDeclaration__classDec____anonymousClassDeclarationOwner_name_prime);
		a2c__classDec____source.setName(a2c__classDec____source_name_prime);
		return new Object[] { bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec, isApplicableMatch,
				a2c__umlClass____target, bd2ne__feature____target, bd2ne__bodyDeclaration____source,
				classDec__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__classDec____anonymousClassDeclarationOwner, a2c__classDec____source };
	}

	public static final Object[] pattern_OperationInAnonymous_2_4_solveCSP_bindingFBBBBBBBB(OperationInAnonymous _this,
			IsApplicableMatch isApplicableMatch, ASTNode2Element bd2ne, ASTNode2Element a2c,
			org.eclipse.uml2.uml.Class umlClass, Operation feature, MAbstractMethodDefinition bodyDeclaration,
			AnonymousClassDeclaration classDec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, bd2ne, a2c, umlClass, feature,
				bodyDeclaration, classDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bd2ne, a2c, umlClass, feature, bodyDeclaration,
					classDec };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			OperationInAnonymous _this, IsApplicableMatch isApplicableMatch, ASTNode2Element bd2ne, ASTNode2Element a2c,
			org.eclipse.uml2.uml.Class umlClass, Operation feature, MAbstractMethodDefinition bodyDeclaration,
			AnonymousClassDeclaration classDec) {
		Object[] result_pattern_OperationInAnonymous_2_4_solveCSP_binding = pattern_OperationInAnonymous_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec);
		if (result_pattern_OperationInAnonymous_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInAnonymous_2_4_solveCSP_binding[0];

			Object[] result_pattern_OperationInAnonymous_2_4_solveCSP_black = pattern_OperationInAnonymous_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_OperationInAnonymous_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bd2ne, a2c, umlClass, feature, bodyDeclaration,
						classDec };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInAnonymous_2_5_checkCSP_expressionFBB(OperationInAnonymous _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_OperationInAnonymous_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "OperationInAnonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_OperationInAnonymous_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_10_1_initialbindings_blackBBBB(OperationInAnonymous _this,
			Match match, org.eclipse.uml2.uml.Class umlClass, Operation feature) {
		return new Object[] { _this, match, umlClass, feature };
	}

	public static final Object[] pattern_OperationInAnonymous_10_2_SolveCSP_bindingFBBBB(OperationInAnonymous _this,
			Match match, org.eclipse.uml2.uml.Class umlClass, Operation feature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, umlClass, feature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, umlClass, feature };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInAnonymous_10_2_SolveCSP_bindingAndBlackFBBBB(
			OperationInAnonymous _this, Match match, org.eclipse.uml2.uml.Class umlClass, Operation feature) {
		Object[] result_pattern_OperationInAnonymous_10_2_SolveCSP_binding = pattern_OperationInAnonymous_10_2_SolveCSP_bindingFBBBB(
				_this, match, umlClass, feature);
		if (result_pattern_OperationInAnonymous_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInAnonymous_10_2_SolveCSP_binding[0];

			Object[] result_pattern_OperationInAnonymous_10_2_SolveCSP_black = pattern_OperationInAnonymous_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_OperationInAnonymous_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, umlClass, feature };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInAnonymous_10_3_CheckCSP_expressionFBB(OperationInAnonymous _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_10_4_collectelementstobetranslated_blackBBB(Match match,
			org.eclipse.uml2.uml.Class umlClass, Operation feature) {
		return new Object[] { match, umlClass, feature };
	}

	public static final Object[] pattern_OperationInAnonymous_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			org.eclipse.uml2.uml.Class umlClass, Operation feature) {
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
		return new Object[] { match, umlClass, feature, umlClass__feature____ownedOperation,
				feature__umlClass____class };
	}

	public static final Object[] pattern_OperationInAnonymous_10_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.uml2.uml.Class umlClass, Operation feature) {
		return new Object[] { match, umlClass, feature };
	}

	public static final Object[] pattern_OperationInAnonymous_10_5_collectcontextelements_greenBBB(Match match,
			org.eclipse.uml2.uml.Class umlClass, Operation feature) {
		match.getContextNodes().add(umlClass);
		match.getContextNodes().add(feature);
		return new Object[] { match, umlClass, feature };
	}

	public static final void pattern_OperationInAnonymous_10_6_registerobjectstomatch_expressionBBBB(
			OperationInAnonymous _this, Match match, org.eclipse.uml2.uml.Class umlClass, Operation feature) {
		_this.registerObjectsToMatch_BWD(match, umlClass, feature);

	}

	public static final boolean pattern_OperationInAnonymous_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OperationInAnonymous_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("bd2ne");
		EObject _localVariable_1 = isApplicableMatch.getObject("a2c");
		EObject _localVariable_2 = isApplicableMatch.getObject("umlClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("feature");
		EObject _localVariable_4 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_5 = isApplicableMatch.getObject("classDec");
		EObject tmpBd2ne = _localVariable_0;
		EObject tmpA2c = _localVariable_1;
		EObject tmpUmlClass = _localVariable_2;
		EObject tmpFeature = _localVariable_3;
		EObject tmpBodyDeclaration = _localVariable_4;
		EObject tmpClassDec = _localVariable_5;
		if (tmpBd2ne instanceof ASTNode2Element) {
			ASTNode2Element bd2ne = (ASTNode2Element) tmpBd2ne;
			if (tmpA2c instanceof ASTNode2Element) {
				ASTNode2Element a2c = (ASTNode2Element) tmpA2c;
				if (tmpUmlClass instanceof org.eclipse.uml2.uml.Class) {
					org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) tmpUmlClass;
					if (tmpFeature instanceof Operation) {
						Operation feature = (Operation) tmpFeature;
						if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
							MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
							if (tmpClassDec instanceof AnonymousClassDeclaration) {
								AnonymousClassDeclaration classDec = (AnonymousClassDeclaration) tmpClassDec;
								return new Object[] { bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_11_1_performtransformation_blackBBBBBBFBB(
			ASTNode2Element bd2ne, ASTNode2Element a2c, org.eclipse.uml2.uml.Class umlClass, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec, OperationInAnonymous _this,
			IsApplicableMatch isApplicableMatch) {
		if (!a2c.equals(bd2ne)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			OperationInAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_OperationInAnonymous_11_1_performtransformation_binding = pattern_OperationInAnonymous_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_OperationInAnonymous_11_1_performtransformation_binding != null) {
			ASTNode2Element bd2ne = (ASTNode2Element) result_pattern_OperationInAnonymous_11_1_performtransformation_binding[0];
			ASTNode2Element a2c = (ASTNode2Element) result_pattern_OperationInAnonymous_11_1_performtransformation_binding[1];
			org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result_pattern_OperationInAnonymous_11_1_performtransformation_binding[2];
			Operation feature = (Operation) result_pattern_OperationInAnonymous_11_1_performtransformation_binding[3];
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result_pattern_OperationInAnonymous_11_1_performtransformation_binding[4];
			AnonymousClassDeclaration classDec = (AnonymousClassDeclaration) result_pattern_OperationInAnonymous_11_1_performtransformation_binding[5];

			Object[] result_pattern_OperationInAnonymous_11_1_performtransformation_black = pattern_OperationInAnonymous_11_1_performtransformation_blackBBBBBBFBB(
					bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec, _this, isApplicableMatch);
			if (result_pattern_OperationInAnonymous_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_OperationInAnonymous_11_1_performtransformation_black[6];

				return new Object[] { bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_11_1_performtransformation_greenBB(
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec) {
		classDec.getBodyDeclarations().add(bodyDeclaration);
		return new Object[] { bodyDeclaration, classDec };
	}

	public static final Object[] pattern_OperationInAnonymous_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_OperationInAnonymous_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject bd2ne, EObject a2c, EObject umlClass, EObject feature,
			EObject bodyDeclaration, EObject classDec) {
		if (!bd2ne.equals(umlClass)) {
			if (!bd2ne.equals(feature)) {
				if (!bd2ne.equals(bodyDeclaration)) {
					if (!bd2ne.equals(classDec)) {
						if (!a2c.equals(bd2ne)) {
							if (!a2c.equals(umlClass)) {
								if (!a2c.equals(feature)) {
									if (!a2c.equals(bodyDeclaration)) {
										if (!a2c.equals(classDec)) {
											if (!feature.equals(umlClass)) {
												if (!bodyDeclaration.equals(umlClass)) {
													if (!bodyDeclaration.equals(feature)) {
														if (!bodyDeclaration.equals(classDec)) {
															if (!classDec.equals(umlClass)) {
																if (!classDec.equals(feature)) {
																	return new Object[] { ruleresult, bd2ne, a2c,
																			umlClass, feature, bodyDeclaration,
																			classDec };
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

	public static final Object[] pattern_OperationInAnonymous_11_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject umlClass, EObject feature, EObject bodyDeclaration,
			EObject classDec) {
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "OperationInAnonymous";
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____class_name_prime = "class";
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		ruleresult.getTranslatedEdges().add(umlClass__feature____ownedOperation);
		feature__umlClass____class.setSrc(feature);
		feature__umlClass____class.setTrg(umlClass);
		ruleresult.getTranslatedEdges().add(feature__umlClass____class);
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____anonymousClassDeclarationOwner.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____anonymousClassDeclarationOwner.setTrg(classDec);
		ruleresult.getCreatedEdges().add(bodyDeclaration__classDec____anonymousClassDeclarationOwner);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____class.setName(feature__umlClass____class_name_prime);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____anonymousClassDeclarationOwner
				.setName(bodyDeclaration__classDec____anonymousClassDeclarationOwner_name_prime);
		return new Object[] { ruleresult, umlClass, feature, bodyDeclaration, classDec,
				umlClass__feature____ownedOperation, feature__umlClass____class,
				classDec__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__classDec____anonymousClassDeclarationOwner };
	}

	public static final void pattern_OperationInAnonymous_11_5_registerobjects_expressionBBBBBBBB(
			OperationInAnonymous _this, PerformRuleResult ruleresult, EObject bd2ne, EObject a2c, EObject umlClass,
			EObject feature, EObject bodyDeclaration, EObject classDec) {
		_this.registerObjects_BWD(ruleresult, bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec);

	}

	public static final PerformRuleResult pattern_OperationInAnonymous_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_12_1_preparereturnvalue_bindingFB(
			OperationInAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_12_1_preparereturnvalue_blackFBB(EClass eClass,
			OperationInAnonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_12_1_preparereturnvalue_bindingAndBlackFFB(
			OperationInAnonymous _this) {
		Object[] result_pattern_OperationInAnonymous_12_1_preparereturnvalue_binding = pattern_OperationInAnonymous_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OperationInAnonymous_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_OperationInAnonymous_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OperationInAnonymous_12_1_preparereturnvalue_black = pattern_OperationInAnonymous_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_OperationInAnonymous_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_OperationInAnonymous_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "OperationInAnonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_OperationInAnonymous_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("umlClass");
		EObject _localVariable_1 = match.getObject("feature");
		EObject tmpUmlClass = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		if (tmpUmlClass instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) tmpUmlClass;
			if (tmpFeature instanceof Operation) {
				Operation feature = (Operation) tmpFeature;
				return new Object[] { umlClass, feature, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OperationInAnonymous_12_2_corematch_blackFFBBFFB(
			org.eclipse.uml2.uml.Class umlClass, Operation feature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element a2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(umlClass,
				ASTNode2Element.class, "target")) {
			ASTNode tmpClassDec = a2c.getSource();
			if (tmpClassDec instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration classDec = (AnonymousClassDeclaration) tmpClassDec;
				for (ASTNode2Element bd2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(feature,
						ASTNode2Element.class, "target")) {
					if (!a2c.equals(bd2ne)) {
						ASTNode tmpBodyDeclaration = bd2ne.getSource();
						if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
							MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
							_result.add(
									new Object[] { bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_OperationInAnonymous_12_3_findcontext_blackBBBBBB(
			ASTNode2Element bd2ne, ASTNode2Element a2c, org.eclipse.uml2.uml.Class umlClass, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!a2c.equals(bd2ne)) {
			if (umlClass.equals(a2c.getTarget())) {
				if (umlClass.getOwnedOperations().contains(feature)) {
					if (feature.equals(bd2ne.getTarget())) {
						if (bodyDeclaration.equals(bd2ne.getSource())) {
							if (classDec.equals(a2c.getSource())) {
								_result.add(new Object[] { bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_12_3_findcontext_greenBBBBBBFFFFFFF(ASTNode2Element bd2ne,
			ASTNode2Element a2c, org.eclipse.uml2.uml.Class umlClass, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge a2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String a2c__umlClass____target_name_prime = "target";
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____class_name_prime = "class";
		String bd2ne__feature____target_name_prime = "target";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String a2c__classDec____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(bd2ne);
		isApplicableMatch.getAllContextElements().add(a2c);
		isApplicableMatch.getAllContextElements().add(umlClass);
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(classDec);
		a2c__umlClass____target.setSrc(a2c);
		a2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(a2c__umlClass____target);
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(umlClass__feature____ownedOperation);
		feature__umlClass____class.setSrc(feature);
		feature__umlClass____class.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(feature__umlClass____class);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(bd2ne__feature____target);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(bd2ne__bodyDeclaration____source);
		a2c__classDec____source.setSrc(a2c);
		a2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(a2c__classDec____source);
		a2c__umlClass____target.setName(a2c__umlClass____target_name_prime);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____class.setName(feature__umlClass____class_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		a2c__classDec____source.setName(a2c__classDec____source_name_prime);
		return new Object[] { bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec, isApplicableMatch,
				a2c__umlClass____target, umlClass__feature____ownedOperation, feature__umlClass____class,
				bd2ne__feature____target, bd2ne__bodyDeclaration____source, a2c__classDec____source };
	}

	public static final Object[] pattern_OperationInAnonymous_12_4_solveCSP_bindingFBBBBBBBB(OperationInAnonymous _this,
			IsApplicableMatch isApplicableMatch, ASTNode2Element bd2ne, ASTNode2Element a2c,
			org.eclipse.uml2.uml.Class umlClass, Operation feature, MAbstractMethodDefinition bodyDeclaration,
			AnonymousClassDeclaration classDec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, bd2ne, a2c, umlClass, feature,
				bodyDeclaration, classDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bd2ne, a2c, umlClass, feature, bodyDeclaration,
					classDec };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			OperationInAnonymous _this, IsApplicableMatch isApplicableMatch, ASTNode2Element bd2ne, ASTNode2Element a2c,
			org.eclipse.uml2.uml.Class umlClass, Operation feature, MAbstractMethodDefinition bodyDeclaration,
			AnonymousClassDeclaration classDec) {
		Object[] result_pattern_OperationInAnonymous_12_4_solveCSP_binding = pattern_OperationInAnonymous_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec);
		if (result_pattern_OperationInAnonymous_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInAnonymous_12_4_solveCSP_binding[0];

			Object[] result_pattern_OperationInAnonymous_12_4_solveCSP_black = pattern_OperationInAnonymous_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_OperationInAnonymous_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bd2ne, a2c, umlClass, feature, bodyDeclaration,
						classDec };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInAnonymous_12_5_checkCSP_expressionFBB(OperationInAnonymous _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_OperationInAnonymous_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "OperationInAnonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_OperationInAnonymous_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_20_1_preparereturnvalue_bindingFB(
			OperationInAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			OperationInAnonymous _this) {
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

	public static final Object[] pattern_OperationInAnonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(
			OperationInAnonymous _this) {
		Object[] result_pattern_OperationInAnonymous_20_1_preparereturnvalue_binding = pattern_OperationInAnonymous_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OperationInAnonymous_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_OperationInAnonymous_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OperationInAnonymous_20_1_preparereturnvalue_black = pattern_OperationInAnonymous_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_OperationInAnonymous_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_OperationInAnonymous_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_OperationInAnonymous_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_OperationInAnonymous_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedOperation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUmlClass = _edge_ownedOperation.getSrc();
		if (tmpUmlClass instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) tmpUmlClass;
			EObject tmpFeature = _edge_ownedOperation.getTrg();
			if (tmpFeature instanceof Operation) {
				Operation feature = (Operation) tmpFeature;
				if (umlClass.getOwnedOperations().contains(feature)) {
					_result.add(new Object[] { umlClass, feature, _edge_ownedOperation });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_OperationInAnonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			OperationInAnonymous _this, Match match, org.eclipse.uml2.uml.Class umlClass, Operation feature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, umlClass, feature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_OperationInAnonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			OperationInAnonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_OperationInAnonymous_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_21_1_preparereturnvalue_bindingFB(
			OperationInAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			OperationInAnonymous _this) {
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

	public static final Object[] pattern_OperationInAnonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(
			OperationInAnonymous _this) {
		Object[] result_pattern_OperationInAnonymous_21_1_preparereturnvalue_binding = pattern_OperationInAnonymous_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OperationInAnonymous_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_OperationInAnonymous_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OperationInAnonymous_21_1_preparereturnvalue_black = pattern_OperationInAnonymous_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_OperationInAnonymous_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_OperationInAnonymous_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_OperationInAnonymous_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_OperationInAnonymous_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpClassDec = _edge_bodyDeclarations.getSrc();
		if (tmpClassDec instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration classDec = (AnonymousClassDeclaration) tmpClassDec;
			EObject tmpBodyDeclaration = _edge_bodyDeclarations.getTrg();
			if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
				MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
				if (classDec.getBodyDeclarations().contains(bodyDeclaration)) {
					_result.add(new Object[] { bodyDeclaration, classDec, _edge_bodyDeclarations });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_OperationInAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			OperationInAnonymous _this, Match match, MAbstractMethodDefinition bodyDeclaration,
			AnonymousClassDeclaration classDec) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, bodyDeclaration, classDec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_OperationInAnonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			OperationInAnonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_OperationInAnonymous_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_24_1_prepare_blackB(OperationInAnonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_OperationInAnonymous_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_OperationInAnonymous_24_2_matchsrctrgcontext_bindingFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("umlClass");
		EObject _localVariable_1 = targetMatch.getObject("feature");
		EObject _localVariable_2 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_3 = sourceMatch.getObject("classDec");
		EObject tmpUmlClass = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		EObject tmpClassDec = _localVariable_3;
		if (tmpUmlClass instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) tmpUmlClass;
			if (tmpFeature instanceof Operation) {
				Operation feature = (Operation) tmpFeature;
				if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
					MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
					if (tmpClassDec instanceof AnonymousClassDeclaration) {
						AnonymousClassDeclaration classDec = (AnonymousClassDeclaration) tmpClassDec;
						return new Object[] { umlClass, feature, bodyDeclaration, classDec, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_24_2_matchsrctrgcontext_blackBBBBBB(
			org.eclipse.uml2.uml.Class umlClass, Operation feature, MAbstractMethodDefinition bodyDeclaration,
			AnonymousClassDeclaration classDec, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { umlClass, feature, bodyDeclaration, classDec, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_OperationInAnonymous_24_2_matchsrctrgcontext_binding = pattern_OperationInAnonymous_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_OperationInAnonymous_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) result_pattern_OperationInAnonymous_24_2_matchsrctrgcontext_binding[0];
			Operation feature = (Operation) result_pattern_OperationInAnonymous_24_2_matchsrctrgcontext_binding[1];
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result_pattern_OperationInAnonymous_24_2_matchsrctrgcontext_binding[2];
			AnonymousClassDeclaration classDec = (AnonymousClassDeclaration) result_pattern_OperationInAnonymous_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_OperationInAnonymous_24_2_matchsrctrgcontext_black = pattern_OperationInAnonymous_24_2_matchsrctrgcontext_blackBBBBBB(
					umlClass, feature, bodyDeclaration, classDec, sourceMatch, targetMatch);
			if (result_pattern_OperationInAnonymous_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { umlClass, feature, bodyDeclaration, classDec, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_24_3_solvecsp_bindingFBBBBBBB(OperationInAnonymous _this,
			org.eclipse.uml2.uml.Class umlClass, Operation feature, MAbstractMethodDefinition bodyDeclaration,
			AnonymousClassDeclaration classDec, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(umlClass, feature, bodyDeclaration, classDec, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, umlClass, feature, bodyDeclaration, classDec, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			OperationInAnonymous _this, org.eclipse.uml2.uml.Class umlClass, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_OperationInAnonymous_24_3_solvecsp_binding = pattern_OperationInAnonymous_24_3_solvecsp_bindingFBBBBBBB(
				_this, umlClass, feature, bodyDeclaration, classDec, sourceMatch, targetMatch);
		if (result_pattern_OperationInAnonymous_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInAnonymous_24_3_solvecsp_binding[0];

			Object[] result_pattern_OperationInAnonymous_24_3_solvecsp_black = pattern_OperationInAnonymous_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_OperationInAnonymous_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, umlClass, feature, bodyDeclaration, classDec, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInAnonymous_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_OperationInAnonymous_24_5_matchcorrcontext_blackFFBBBBBB(
			org.eclipse.uml2.uml.Class umlClass, Operation feature, MAbstractMethodDefinition bodyDeclaration,
			AnonymousClassDeclaration classDec, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element a2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(umlClass,
					ASTNode2Element.class, "target")) {
				if (classDec.equals(a2c.getSource())) {
					for (ASTNode2Element bd2ne : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(feature, ASTNode2Element.class, "target")) {
						if (!a2c.equals(bd2ne)) {
							if (bodyDeclaration.equals(bd2ne.getSource())) {
								_result.add(new Object[] { bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec,
										sourceMatch, targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_24_5_matchcorrcontext_greenBBBBF(ASTNode2Element bd2ne,
			ASTNode2Element a2c, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "OperationInAnonymous";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(bd2ne);
		ccMatch.getAllContextElements().add(a2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { bd2ne, a2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_OperationInAnonymous_24_6_createcorrespondence_blackBBBBB(
			org.eclipse.uml2.uml.Class umlClass, Operation feature, MAbstractMethodDefinition bodyDeclaration,
			AnonymousClassDeclaration classDec, CCMatch ccMatch) {
		return new Object[] { umlClass, feature, bodyDeclaration, classDec, ccMatch };
	}

	public static final Object[] pattern_OperationInAnonymous_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_OperationInAnonymous_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "OperationInAnonymous";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_OperationInAnonymous_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_27_1_matchtggpattern_blackBB(
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec) {
		if (classDec.getBodyDeclarations().contains(bodyDeclaration)) {
			return new Object[] { bodyDeclaration, classDec };
		}
		return null;
	}

	public static final boolean pattern_OperationInAnonymous_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OperationInAnonymous_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_28_1_matchtggpattern_blackBB(
			org.eclipse.uml2.uml.Class umlClass, Operation feature) {
		if (umlClass.getOwnedOperations().contains(feature)) {
			return new Object[] { umlClass, feature };
		}
		return null;
	}

	public static final boolean pattern_OperationInAnonymous_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OperationInAnonymous_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_29_1_createresult_blackB(OperationInAnonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_OperationInAnonymous_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_OperationInAnonymous_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element bd2ne) {
		if (ruleResult.getCorrObjects().contains(bd2ne)) {
			return new Object[] { ruleResult, bd2ne };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Operation feature) {
		if (ruleResult.getTargetObjects().contains(feature)) {
			return new Object[] { ruleResult, feature };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MAbstractMethodDefinition bodyDeclaration) {
		if (ruleResult.getSourceObjects().contains(bodyDeclaration)) {
			return new Object[] { ruleResult, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element a2c) {
		if (ruleResult.getCorrObjects().contains(a2c)) {
			return new Object[] { ruleResult, a2c };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Class umlClass) {
		if (ruleResult.getTargetObjects().contains(umlClass)) {
			return new Object[] { ruleResult, umlClass };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclaration classDec) {
		if (ruleResult.getSourceObjects().contains(classDec)) {
			return new Object[] { ruleResult, classDec };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OperationInAnonymous_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList bd2neList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList a2cList : ruleEntryContainer.getRuleEntryList()) {
				if (!a2cList.equals(bd2neList)) {
					for (EObject tmpBd2ne : bd2neList.getEntryObjects()) {
						if (tmpBd2ne instanceof ASTNode2Element) {
							ASTNode2Element bd2ne = (ASTNode2Element) tmpBd2ne;
							Element tmpFeature = bd2ne.getTarget();
							if (tmpFeature instanceof Operation) {
								Operation feature = (Operation) tmpFeature;
								ASTNode tmpBodyDeclaration = bd2ne.getSource();
								if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
									MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
									if (pattern_OperationInAnonymous_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											bd2ne) == null) {
										if (pattern_OperationInAnonymous_29_2_isapplicablecore_black_nac_1BB(ruleResult,
												feature) == null) {
											if (pattern_OperationInAnonymous_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, bodyDeclaration) == null) {
												for (EObject tmpA2c : a2cList.getEntryObjects()) {
													if (tmpA2c instanceof ASTNode2Element) {
														ASTNode2Element a2c = (ASTNode2Element) tmpA2c;
														if (!a2c.equals(bd2ne)) {
															Element tmpUmlClass = a2c.getTarget();
															if (tmpUmlClass instanceof org.eclipse.uml2.uml.Class) {
																org.eclipse.uml2.uml.Class umlClass = (org.eclipse.uml2.uml.Class) tmpUmlClass;
																ASTNode tmpClassDec = a2c.getSource();
																if (tmpClassDec instanceof AnonymousClassDeclaration) {
																	AnonymousClassDeclaration classDec = (AnonymousClassDeclaration) tmpClassDec;
																	if (pattern_OperationInAnonymous_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, a2c) == null) {
																		if (pattern_OperationInAnonymous_29_2_isapplicablecore_black_nac_4BB(
																				ruleResult, umlClass) == null) {
																			if (pattern_OperationInAnonymous_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult, classDec) == null) {
																				_result.add(new Object[] { bd2neList,
																						bd2ne, feature, bodyDeclaration,
																						a2cList, a2c, umlClass,
																						classDec, ruleEntryContainer,
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

	public static final Object[] pattern_OperationInAnonymous_29_3_solveCSP_bindingFBBBBBBBBB(
			OperationInAnonymous _this, IsApplicableMatch isApplicableMatch, ASTNode2Element bd2ne, ASTNode2Element a2c,
			org.eclipse.uml2.uml.Class umlClass, Operation feature, MAbstractMethodDefinition bodyDeclaration,
			AnonymousClassDeclaration classDec, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, bd2ne, a2c, umlClass, feature,
				bodyDeclaration, classDec, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bd2ne, a2c, umlClass, feature, bodyDeclaration,
					classDec, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			OperationInAnonymous _this, IsApplicableMatch isApplicableMatch, ASTNode2Element bd2ne, ASTNode2Element a2c,
			org.eclipse.uml2.uml.Class umlClass, Operation feature, MAbstractMethodDefinition bodyDeclaration,
			AnonymousClassDeclaration classDec, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_OperationInAnonymous_29_3_solveCSP_binding = pattern_OperationInAnonymous_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec, ruleResult);
		if (result_pattern_OperationInAnonymous_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInAnonymous_29_3_solveCSP_binding[0];

			Object[] result_pattern_OperationInAnonymous_29_3_solveCSP_black = pattern_OperationInAnonymous_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_OperationInAnonymous_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bd2ne, a2c, umlClass, feature, bodyDeclaration,
						classDec, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInAnonymous_29_4_checkCSP_expressionFBB(OperationInAnonymous _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInAnonymous_29_5_checknacs_blackBBBBBB(ASTNode2Element bd2ne,
			ASTNode2Element a2c, org.eclipse.uml2.uml.Class umlClass, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec) {
		if (!a2c.equals(bd2ne)) {
			return new Object[] { bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_29_6_perform_blackBBBBBBB(ASTNode2Element bd2ne,
			ASTNode2Element a2c, org.eclipse.uml2.uml.Class umlClass, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, AnonymousClassDeclaration classDec,
			ModelgeneratorRuleResult ruleResult) {
		if (!a2c.equals(bd2ne)) {
			return new Object[] { bd2ne, a2c, umlClass, feature, bodyDeclaration, classDec, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnonymous_29_6_perform_greenBBBBB(
			org.eclipse.uml2.uml.Class umlClass, Operation feature, MAbstractMethodDefinition bodyDeclaration,
			AnonymousClassDeclaration classDec, ModelgeneratorRuleResult ruleResult) {
		umlClass.getOwnedOperations().add(feature);
		classDec.getBodyDeclarations().add(bodyDeclaration);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { umlClass, feature, bodyDeclaration, classDec, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_OperationInAnonymous_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //OperationInAnonymousImpl
