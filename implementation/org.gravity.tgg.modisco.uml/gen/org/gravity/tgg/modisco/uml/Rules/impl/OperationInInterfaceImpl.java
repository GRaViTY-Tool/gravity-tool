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
import org.eclipse.uml2.uml.Operation;

import org.gravity.modisco.MAbstractMethodDefinition;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.OperationInInterface;
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
 * An implementation of the model object '<em><b>Operation In Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OperationInInterfaceImpl extends AbstractRuleImpl implements OperationInInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationInInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getOperationInInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MAbstractMethodDefinition bodyDeclaration,
			InterfaceDeclaration classDec) {

		Object[] result1_black = OperationInInterfaceImpl
				.pattern_OperationInInterface_0_1_initialbindings_blackBBBB(this, match, bodyDeclaration, classDec);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = "
					+ classDec + ".");
		}

		Object[] result2_bindingAndBlack = OperationInInterfaceImpl
				.pattern_OperationInInterface_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, bodyDeclaration, classDec);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = "
					+ classDec + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (OperationInInterfaceImpl.pattern_OperationInInterface_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = OperationInInterfaceImpl
					.pattern_OperationInInterface_0_4_collectelementstobetranslated_blackBBB(match, bodyDeclaration,
							classDec);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = " + classDec + ".");
			}
			OperationInInterfaceImpl.pattern_OperationInInterface_0_4_collectelementstobetranslated_greenBBBFF(match,
					bodyDeclaration, classDec);
			//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = OperationInInterfaceImpl
					.pattern_OperationInInterface_0_5_collectcontextelements_blackBBB(match, bodyDeclaration, classDec);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = " + classDec + ".");
			}
			OperationInInterfaceImpl.pattern_OperationInInterface_0_5_collectcontextelements_greenBBB(match,
					bodyDeclaration, classDec);

			// 
			OperationInInterfaceImpl.pattern_OperationInInterface_0_6_registerobjectstomatch_expressionBBBB(this, match,
					bodyDeclaration, classDec);
			return OperationInInterfaceImpl.pattern_OperationInInterface_0_7_expressionF();
		} else {
			return OperationInInterfaceImpl.pattern_OperationInInterface_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = OperationInInterfaceImpl
				.pattern_OperationInInterface_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Operation feature = (Operation) result1_bindingAndBlack[0];
		MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result1_bindingAndBlack[1];
		ASTNode2Element c2c = (ASTNode2Element) result1_bindingAndBlack[2];
		InterfaceDeclaration classDec = (InterfaceDeclaration) result1_bindingAndBlack[3];
		ASTNode2Element bd2ne = (ASTNode2Element) result1_bindingAndBlack[4];
		Interface umlClass = (Interface) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		OperationInInterfaceImpl.pattern_OperationInInterface_1_1_performtransformation_greenBB(feature, umlClass);

		Object[] result2_green = OperationInInterfaceImpl
				.pattern_OperationInInterface_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = OperationInInterfaceImpl
				.pattern_OperationInInterface_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, feature, bodyDeclaration,
						c2c, classDec, bd2ne, umlClass);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[feature] = " + feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
					+ "[c2c] = " + c2c + ", " + "[classDec] = " + classDec + ", " + "[bd2ne] = " + bd2ne + ", "
					+ "[umlClass] = " + umlClass + ".");
		}
		OperationInInterfaceImpl.pattern_OperationInInterface_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
				feature, bodyDeclaration, classDec, umlClass);
		//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge feature__umlClass____interface = (EMoflonEdge) result3_green[8];

		// 
		// 
		OperationInInterfaceImpl.pattern_OperationInInterface_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass);
		return OperationInInterfaceImpl.pattern_OperationInInterface_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = OperationInInterfaceImpl
				.pattern_OperationInInterface_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = OperationInInterfaceImpl
				.pattern_OperationInInterface_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = OperationInInterfaceImpl
				.pattern_OperationInInterface_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_binding[0];
		InterfaceDeclaration classDec = (InterfaceDeclaration) result2_binding[1];
		for (Object[] result2_black : OperationInInterfaceImpl
				.pattern_OperationInInterface_2_2_corematch_blackFBFBFFB(bodyDeclaration, classDec, match)) {
			Operation feature = (Operation) result2_black[0];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[2];
			ASTNode2Element bd2ne = (ASTNode2Element) result2_black[4];
			Interface umlClass = (Interface) result2_black[5];
			// ForEach 
			for (Object[] result3_black : OperationInInterfaceImpl
					.pattern_OperationInInterface_2_3_findcontext_blackBBBBBB(feature, bodyDeclaration, c2c, classDec,
							bd2ne, umlClass)) {
				Object[] result3_green = OperationInInterfaceImpl
						.pattern_OperationInInterface_2_3_findcontext_greenBBBBBBFFFFFFF(feature, bodyDeclaration, c2c,
								classDec, bd2ne, umlClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge c2c__classDec____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge c2c__umlClass____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = OperationInInterfaceImpl
						.pattern_OperationInInterface_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[c2c] = " + c2c + ", "
							+ "[classDec] = " + classDec + ", " + "[bd2ne] = " + bd2ne + ", " + "[umlClass] = "
							+ umlClass + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (OperationInInterfaceImpl.pattern_OperationInInterface_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = OperationInInterfaceImpl
							.pattern_OperationInInterface_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					OperationInInterfaceImpl.pattern_OperationInInterface_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return OperationInInterfaceImpl.pattern_OperationInInterface_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MAbstractMethodDefinition bodyDeclaration,
			InterfaceDeclaration classDec) {
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("classDec", classDec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MAbstractMethodDefinition bodyDeclaration,
			InterfaceDeclaration classDec) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, ASTNode2Element c2c, InterfaceDeclaration classDec,
			ASTNode2Element bd2ne, Interface umlClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("c2c", c2c);
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("bd2ne", bd2ne);
		isApplicableMatch.registerObject("umlClass", umlClass);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject feature, EObject bodyDeclaration, EObject c2c,
			EObject classDec, EObject bd2ne, EObject umlClass) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("c2c", c2c);
		ruleresult.registerObject("classDec", classDec);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("umlClass", umlClass);

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
	public boolean isAppropriate_BWD(Match match, Operation feature, Interface umlClass) {

		Object[] result1_black = OperationInInterfaceImpl
				.pattern_OperationInInterface_10_1_initialbindings_blackBBBB(this, match, feature, umlClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[umlClass] = " + umlClass + ".");
		}

		Object[] result2_bindingAndBlack = OperationInInterfaceImpl
				.pattern_OperationInInterface_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, feature, umlClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[umlClass] = " + umlClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (OperationInInterfaceImpl.pattern_OperationInInterface_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = OperationInInterfaceImpl
					.pattern_OperationInInterface_10_4_collectelementstobetranslated_blackBBB(match, feature, umlClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[umlClass] = " + umlClass + ".");
			}
			OperationInInterfaceImpl.pattern_OperationInInterface_10_4_collectelementstobetranslated_greenBBBFF(match,
					feature, umlClass);
			//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge feature__umlClass____interface = (EMoflonEdge) result4_green[4];

			Object[] result5_black = OperationInInterfaceImpl
					.pattern_OperationInInterface_10_5_collectcontextelements_blackBBB(match, feature, umlClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[umlClass] = " + umlClass + ".");
			}
			OperationInInterfaceImpl.pattern_OperationInInterface_10_5_collectcontextelements_greenBBB(match, feature,
					umlClass);

			// 
			OperationInInterfaceImpl.pattern_OperationInInterface_10_6_registerobjectstomatch_expressionBBBB(this,
					match, feature, umlClass);
			return OperationInInterfaceImpl.pattern_OperationInInterface_10_7_expressionF();
		} else {
			return OperationInInterfaceImpl.pattern_OperationInInterface_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = OperationInInterfaceImpl
				.pattern_OperationInInterface_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Operation feature = (Operation) result1_bindingAndBlack[0];
		MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result1_bindingAndBlack[1];
		ASTNode2Element c2c = (ASTNode2Element) result1_bindingAndBlack[2];
		InterfaceDeclaration classDec = (InterfaceDeclaration) result1_bindingAndBlack[3];
		ASTNode2Element bd2ne = (ASTNode2Element) result1_bindingAndBlack[4];
		Interface umlClass = (Interface) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		OperationInInterfaceImpl.pattern_OperationInInterface_11_1_performtransformation_greenBB(bodyDeclaration,
				classDec);

		Object[] result2_green = OperationInInterfaceImpl
				.pattern_OperationInInterface_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = OperationInInterfaceImpl
				.pattern_OperationInInterface_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, feature,
						bodyDeclaration, c2c, classDec, bd2ne, umlClass);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[feature] = " + feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
					+ "[c2c] = " + c2c + ", " + "[classDec] = " + classDec + ", " + "[bd2ne] = " + bd2ne + ", "
					+ "[umlClass] = " + umlClass + ".");
		}
		OperationInInterfaceImpl.pattern_OperationInInterface_11_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
				feature, bodyDeclaration, classDec, umlClass);
		//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge feature__umlClass____interface = (EMoflonEdge) result3_green[8];

		// 
		// 
		OperationInInterfaceImpl.pattern_OperationInInterface_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass);
		return OperationInInterfaceImpl.pattern_OperationInInterface_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = OperationInInterfaceImpl
				.pattern_OperationInInterface_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = OperationInInterfaceImpl
				.pattern_OperationInInterface_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = OperationInInterfaceImpl
				.pattern_OperationInInterface_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Operation feature = (Operation) result2_binding[0];
		Interface umlClass = (Interface) result2_binding[1];
		for (Object[] result2_black : OperationInInterfaceImpl
				.pattern_OperationInInterface_12_2_corematch_blackBFFFFBB(feature, umlClass, match)) {
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_black[1];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[2];
			InterfaceDeclaration classDec = (InterfaceDeclaration) result2_black[3];
			ASTNode2Element bd2ne = (ASTNode2Element) result2_black[4];
			// ForEach 
			for (Object[] result3_black : OperationInInterfaceImpl
					.pattern_OperationInInterface_12_3_findcontext_blackBBBBBB(feature, bodyDeclaration, c2c, classDec,
							bd2ne, umlClass)) {
				Object[] result3_green = OperationInInterfaceImpl
						.pattern_OperationInInterface_12_3_findcontext_greenBBBBBBFFFFFFF(feature, bodyDeclaration, c2c,
								classDec, bd2ne, umlClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c2c__classDec____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge feature__umlClass____interface = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge c2c__umlClass____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = OperationInInterfaceImpl
						.pattern_OperationInInterface_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[c2c] = " + c2c + ", "
							+ "[classDec] = " + classDec + ", " + "[bd2ne] = " + bd2ne + ", " + "[umlClass] = "
							+ umlClass + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (OperationInInterfaceImpl.pattern_OperationInInterface_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = OperationInInterfaceImpl
							.pattern_OperationInInterface_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					OperationInInterfaceImpl.pattern_OperationInInterface_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return OperationInInterfaceImpl.pattern_OperationInInterface_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Operation feature, Interface umlClass) {
		match.registerObject("feature", feature);
		match.registerObject("umlClass", umlClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Operation feature, Interface umlClass) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, ASTNode2Element c2c, InterfaceDeclaration classDec,
			ASTNode2Element bd2ne, Interface umlClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("c2c", c2c);
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("bd2ne", bd2ne);
		isApplicableMatch.registerObject("umlClass", umlClass);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject feature, EObject bodyDeclaration, EObject c2c,
			EObject classDec, EObject bd2ne, EObject umlClass) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("c2c", c2c);
		ruleresult.registerObject("classDec", classDec);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("umlClass", umlClass);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_1040(EMoflonEdge _edge_ownedOperation) {

		Object[] result1_bindingAndBlack = OperationInInterfaceImpl
				.pattern_OperationInInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = OperationInInterfaceImpl.pattern_OperationInInterface_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : OperationInInterfaceImpl
				.pattern_OperationInInterface_20_2_testcorematchandDECs_blackFFB(_edge_ownedOperation)) {
			Operation feature = (Operation) result2_black[0];
			Interface umlClass = (Interface) result2_black[1];
			Object[] result2_green = OperationInInterfaceImpl
					.pattern_OperationInInterface_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (OperationInInterfaceImpl
					.pattern_OperationInInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, feature, umlClass)) {
				// 
				if (OperationInInterfaceImpl
						.pattern_OperationInInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = OperationInInterfaceImpl
							.pattern_OperationInInterface_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					OperationInInterfaceImpl.pattern_OperationInInterface_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return OperationInInterfaceImpl.pattern_OperationInInterface_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1139(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = OperationInInterfaceImpl
				.pattern_OperationInInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = OperationInInterfaceImpl.pattern_OperationInInterface_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : OperationInInterfaceImpl
				.pattern_OperationInInterface_21_2_testcorematchandDECs_blackFFB(_edge_bodyDeclarations)) {
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_black[0];
			InterfaceDeclaration classDec = (InterfaceDeclaration) result2_black[1];
			Object[] result2_green = OperationInInterfaceImpl
					.pattern_OperationInInterface_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (OperationInInterfaceImpl
					.pattern_OperationInInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, bodyDeclaration, classDec)) {
				// 
				if (OperationInInterfaceImpl
						.pattern_OperationInInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = OperationInInterfaceImpl
							.pattern_OperationInInterface_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					OperationInInterfaceImpl.pattern_OperationInInterface_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return OperationInInterfaceImpl.pattern_OperationInInterface_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("OperationInInterface");
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
		ruleResult.setRule("OperationInInterface");
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

		Object[] result1_black = OperationInInterfaceImpl.pattern_OperationInInterface_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = OperationInInterfaceImpl.pattern_OperationInInterface_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = OperationInInterfaceImpl
				.pattern_OperationInInterface_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Operation feature = (Operation) result2_bindingAndBlack[0];
		MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_bindingAndBlack[1];
		InterfaceDeclaration classDec = (InterfaceDeclaration) result2_bindingAndBlack[2];
		Interface umlClass = (Interface) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = OperationInInterfaceImpl
				.pattern_OperationInInterface_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, feature, bodyDeclaration,
						classDec, umlClass, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[feature] = " + feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
					+ "[classDec] = " + classDec + ", " + "[umlClass] = " + umlClass + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (OperationInInterfaceImpl.pattern_OperationInInterface_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : OperationInInterfaceImpl
					.pattern_OperationInInterface_24_5_matchcorrcontext_blackBBFBFBBB(feature, bodyDeclaration,
							classDec, umlClass, sourceMatch, targetMatch)) {
				ASTNode2Element c2c = (ASTNode2Element) result5_black[2];
				ASTNode2Element bd2ne = (ASTNode2Element) result5_black[4];
				Object[] result5_green = OperationInInterfaceImpl
						.pattern_OperationInInterface_24_5_matchcorrcontext_greenBBBBF(c2c, bd2ne, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = OperationInInterfaceImpl
						.pattern_OperationInInterface_24_6_createcorrespondence_blackBBBBB(feature, bodyDeclaration,
								classDec, umlClass, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = " + classDec + ", "
							+ "[umlClass] = " + umlClass + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = OperationInInterfaceImpl
						.pattern_OperationInInterface_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				OperationInInterfaceImpl.pattern_OperationInInterface_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return OperationInInterfaceImpl.pattern_OperationInInterface_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Operation feature, MAbstractMethodDefinition bodyDeclaration,
			InterfaceDeclaration classDec, Interface umlClass, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MAbstractMethodDefinition bodyDeclaration, InterfaceDeclaration classDec) {// 
		Object[] result1_black = OperationInInterfaceImpl
				.pattern_OperationInInterface_27_1_matchtggpattern_blackBB(bodyDeclaration, classDec);
		if (result1_black != null) {
			return OperationInInterfaceImpl.pattern_OperationInInterface_27_2_expressionF();
		} else {
			return OperationInInterfaceImpl.pattern_OperationInInterface_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Operation feature, Interface umlClass) {// 
		Object[] result1_black = OperationInInterfaceImpl
				.pattern_OperationInInterface_28_1_matchtggpattern_blackBB(feature, umlClass);
		if (result1_black != null) {
			return OperationInInterfaceImpl.pattern_OperationInInterface_28_2_expressionF();
		} else {
			return OperationInInterfaceImpl.pattern_OperationInInterface_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element bd2neParameter,
			ASTNode2Element c2cParameter) {

		Object[] result1_black = OperationInInterfaceImpl.pattern_OperationInInterface_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = OperationInInterfaceImpl.pattern_OperationInInterface_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : OperationInInterfaceImpl
				.pattern_OperationInInterface_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList bd2neList = (RuleEntryList) result2_black[0];
			Operation feature = (Operation) result2_black[1];
			ASTNode2Element bd2ne = (ASTNode2Element) result2_black[2];
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_black[3];
			//nothing RuleEntryList c2cList = (RuleEntryList) result2_black[4];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[5];
			InterfaceDeclaration classDec = (InterfaceDeclaration) result2_black[6];
			Interface umlClass = (Interface) result2_black[7];

			Object[] result3_bindingAndBlack = OperationInInterfaceImpl
					.pattern_OperationInInterface_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[c2c] = " + c2c + ", " + "[classDec] = "
						+ classDec + ", " + "[bd2ne] = " + bd2ne + ", " + "[umlClass] = " + umlClass + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (OperationInInterfaceImpl.pattern_OperationInInterface_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = OperationInInterfaceImpl
						.pattern_OperationInInterface_29_5_checknacs_blackBBBBBB(feature, bodyDeclaration, c2c,
								classDec, bd2ne, umlClass);
				if (result5_black != null) {

					Object[] result6_black = OperationInInterfaceImpl
							.pattern_OperationInInterface_29_6_perform_blackBBBBBBB(feature, bodyDeclaration, c2c,
									classDec, bd2ne, umlClass, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = "
								+ feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[c2c] = " + c2c
								+ ", " + "[classDec] = " + classDec + ", " + "[bd2ne] = " + bd2ne + ", "
								+ "[umlClass] = " + umlClass + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					OperationInInterfaceImpl.pattern_OperationInInterface_29_6_perform_greenBBBBB(feature,
							bodyDeclaration, classDec, umlClass, ruleResult);

				} else {
				}

			} else {
			}

		}
		return OperationInInterfaceImpl.pattern_OperationInInterface_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, ASTNode2Element c2c, InterfaceDeclaration classDec,
			ASTNode2Element bd2ne, Interface umlClass, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("c2c", c2c);
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("bd2ne", bd2ne);
		isApplicableMatch.registerObject("umlClass", umlClass);
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
			case RulesPackage.OPERATION_IN_INTERFACE___IS_APPROPRIATE_FWD__MATCH_MABSTRACTMETHODDEFINITION_INTERFACEDECLARATION:
				return isAppropriate_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
						(InterfaceDeclaration) arguments.get(2));
			case RulesPackage.OPERATION_IN_INTERFACE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.OPERATION_IN_INTERFACE___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.OPERATION_IN_INTERFACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MABSTRACTMETHODDEFINITION_INTERFACEDECLARATION:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
						(InterfaceDeclaration) arguments.get(2));
				return null;
			case RulesPackage.OPERATION_IN_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MABSTRACTMETHODDEFINITION_INTERFACEDECLARATION:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
						(MAbstractMethodDefinition) arguments.get(1), (InterfaceDeclaration) arguments.get(2));
			case RulesPackage.OPERATION_IN_INTERFACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.OPERATION_IN_INTERFACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_OPERATION_MABSTRACTMETHODDEFINITION_ASTNODE2ELEMENT_INTERFACEDECLARATION_ASTNODE2ELEMENT_INTERFACE:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Operation) arguments.get(1),
						(MAbstractMethodDefinition) arguments.get(2), (ASTNode2Element) arguments.get(3),
						(InterfaceDeclaration) arguments.get(4), (ASTNode2Element) arguments.get(5),
						(Interface) arguments.get(6));
			case RulesPackage.OPERATION_IN_INTERFACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.OPERATION_IN_INTERFACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6));
				return null;
			case RulesPackage.OPERATION_IN_INTERFACE___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.OPERATION_IN_INTERFACE___IS_APPROPRIATE_BWD__MATCH_OPERATION_INTERFACE:
				return isAppropriate_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
						(Interface) arguments.get(2));
			case RulesPackage.OPERATION_IN_INTERFACE___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.OPERATION_IN_INTERFACE___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.OPERATION_IN_INTERFACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_OPERATION_INTERFACE:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
						(Interface) arguments.get(2));
				return null;
			case RulesPackage.OPERATION_IN_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_OPERATION_INTERFACE:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
						(Interface) arguments.get(2));
			case RulesPackage.OPERATION_IN_INTERFACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.OPERATION_IN_INTERFACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_OPERATION_MABSTRACTMETHODDEFINITION_ASTNODE2ELEMENT_INTERFACEDECLARATION_ASTNODE2ELEMENT_INTERFACE:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Operation) arguments.get(1),
						(MAbstractMethodDefinition) arguments.get(2), (ASTNode2Element) arguments.get(3),
						(InterfaceDeclaration) arguments.get(4), (ASTNode2Element) arguments.get(5),
						(Interface) arguments.get(6));
			case RulesPackage.OPERATION_IN_INTERFACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.OPERATION_IN_INTERFACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6));
				return null;
			case RulesPackage.OPERATION_IN_INTERFACE___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.OPERATION_IN_INTERFACE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1040__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_1040((EMoflonEdge) arguments.get(0));
			case RulesPackage.OPERATION_IN_INTERFACE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1139__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_1139((EMoflonEdge) arguments.get(0));
			case RulesPackage.OPERATION_IN_INTERFACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.OPERATION_IN_INTERFACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.OPERATION_IN_INTERFACE___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.OPERATION_IN_INTERFACE___IS_APPLICABLE_SOLVE_CSP_CC__OPERATION_MABSTRACTMETHODDEFINITION_INTERFACEDECLARATION_INTERFACE_MATCH_MATCH:
				return isApplicable_solveCsp_CC((Operation) arguments.get(0),
						(MAbstractMethodDefinition) arguments.get(1), (InterfaceDeclaration) arguments.get(2),
						(Interface) arguments.get(3), (Match) arguments.get(4), (Match) arguments.get(5));
			case RulesPackage.OPERATION_IN_INTERFACE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.OPERATION_IN_INTERFACE___CHECK_DEC_FWD__MABSTRACTMETHODDEFINITION_INTERFACEDECLARATION:
				return checkDEC_FWD((MAbstractMethodDefinition) arguments.get(0),
						(InterfaceDeclaration) arguments.get(1));
			case RulesPackage.OPERATION_IN_INTERFACE___CHECK_DEC_BWD__OPERATION_INTERFACE:
				return checkDEC_BWD((Operation) arguments.get(0), (Interface) arguments.get(1));
			case RulesPackage.OPERATION_IN_INTERFACE___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
				return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
						(ASTNode2Element) arguments.get(2));
			case RulesPackage.OPERATION_IN_INTERFACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_OPERATION_MABSTRACTMETHODDEFINITION_ASTNODE2ELEMENT_INTERFACEDECLARATION_ASTNODE2ELEMENT_INTERFACE_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Operation) arguments.get(1),
						(MAbstractMethodDefinition) arguments.get(2), (ASTNode2Element) arguments.get(3),
						(InterfaceDeclaration) arguments.get(4), (ASTNode2Element) arguments.get(5),
						(Interface) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
			case RulesPackage.OPERATION_IN_INTERFACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_OperationInInterface_0_1_initialbindings_blackBBBB(OperationInInterface _this,
			Match match, MAbstractMethodDefinition bodyDeclaration, InterfaceDeclaration classDec) {
		return new Object[] { _this, match, bodyDeclaration, classDec };
	}

	public static final Object[] pattern_OperationInInterface_0_2_SolveCSP_bindingFBBBB(OperationInInterface _this,
			Match match, MAbstractMethodDefinition bodyDeclaration, InterfaceDeclaration classDec) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, bodyDeclaration, classDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, bodyDeclaration, classDec };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInInterface_0_2_SolveCSP_bindingAndBlackFBBBB(
			OperationInInterface _this, Match match, MAbstractMethodDefinition bodyDeclaration,
			InterfaceDeclaration classDec) {
		Object[] result_pattern_OperationInInterface_0_2_SolveCSP_binding = pattern_OperationInInterface_0_2_SolveCSP_bindingFBBBB(
				_this, match, bodyDeclaration, classDec);
		if (result_pattern_OperationInInterface_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInInterface_0_2_SolveCSP_binding[0];

			Object[] result_pattern_OperationInInterface_0_2_SolveCSP_black = pattern_OperationInInterface_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_OperationInInterface_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, bodyDeclaration, classDec };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInInterface_0_3_CheckCSP_expressionFBB(OperationInInterface _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_0_4_collectelementstobetranslated_blackBBB(Match match,
			MAbstractMethodDefinition bodyDeclaration, InterfaceDeclaration classDec) {
		return new Object[] { match, bodyDeclaration, classDec };
	}

	public static final Object[] pattern_OperationInInterface_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			MAbstractMethodDefinition bodyDeclaration, InterfaceDeclaration classDec) {
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
		return new Object[] { match, bodyDeclaration, classDec, classDec__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__classDec____abstractTypeDeclaration };
	}

	public static final Object[] pattern_OperationInInterface_0_5_collectcontextelements_blackBBB(Match match,
			MAbstractMethodDefinition bodyDeclaration, InterfaceDeclaration classDec) {
		return new Object[] { match, bodyDeclaration, classDec };
	}

	public static final Object[] pattern_OperationInInterface_0_5_collectcontextelements_greenBBB(Match match,
			MAbstractMethodDefinition bodyDeclaration, InterfaceDeclaration classDec) {
		match.getContextNodes().add(bodyDeclaration);
		match.getContextNodes().add(classDec);
		return new Object[] { match, bodyDeclaration, classDec };
	}

	public static final void pattern_OperationInInterface_0_6_registerobjectstomatch_expressionBBBB(
			OperationInInterface _this, Match match, MAbstractMethodDefinition bodyDeclaration,
			InterfaceDeclaration classDec) {
		_this.registerObjectsToMatch_FWD(match, bodyDeclaration, classDec);

	}

	public static final boolean pattern_OperationInInterface_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OperationInInterface_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject _localVariable_1 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_2 = isApplicableMatch.getObject("c2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("classDec");
		EObject _localVariable_4 = isApplicableMatch.getObject("bd2ne");
		EObject _localVariable_5 = isApplicableMatch.getObject("umlClass");
		EObject tmpFeature = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpC2c = _localVariable_2;
		EObject tmpClassDec = _localVariable_3;
		EObject tmpBd2ne = _localVariable_4;
		EObject tmpUmlClass = _localVariable_5;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
				MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
				if (tmpC2c instanceof ASTNode2Element) {
					ASTNode2Element c2c = (ASTNode2Element) tmpC2c;
					if (tmpClassDec instanceof InterfaceDeclaration) {
						InterfaceDeclaration classDec = (InterfaceDeclaration) tmpClassDec;
						if (tmpBd2ne instanceof ASTNode2Element) {
							ASTNode2Element bd2ne = (ASTNode2Element) tmpBd2ne;
							if (tmpUmlClass instanceof Interface) {
								Interface umlClass = (Interface) tmpUmlClass;
								return new Object[] { feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_1_1_performtransformation_blackBBBBBBFBB(
			Operation feature, MAbstractMethodDefinition bodyDeclaration, ASTNode2Element c2c,
			InterfaceDeclaration classDec, ASTNode2Element bd2ne, Interface umlClass, OperationInInterface _this,
			IsApplicableMatch isApplicableMatch) {
		if (!bd2ne.equals(c2c)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			OperationInInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_OperationInInterface_1_1_performtransformation_binding = pattern_OperationInInterface_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_OperationInInterface_1_1_performtransformation_binding != null) {
			Operation feature = (Operation) result_pattern_OperationInInterface_1_1_performtransformation_binding[0];
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result_pattern_OperationInInterface_1_1_performtransformation_binding[1];
			ASTNode2Element c2c = (ASTNode2Element) result_pattern_OperationInInterface_1_1_performtransformation_binding[2];
			InterfaceDeclaration classDec = (InterfaceDeclaration) result_pattern_OperationInInterface_1_1_performtransformation_binding[3];
			ASTNode2Element bd2ne = (ASTNode2Element) result_pattern_OperationInInterface_1_1_performtransformation_binding[4];
			Interface umlClass = (Interface) result_pattern_OperationInInterface_1_1_performtransformation_binding[5];

			Object[] result_pattern_OperationInInterface_1_1_performtransformation_black = pattern_OperationInInterface_1_1_performtransformation_blackBBBBBBFBB(
					feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass, _this, isApplicableMatch);
			if (result_pattern_OperationInInterface_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_OperationInInterface_1_1_performtransformation_black[6];

				return new Object[] { feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_1_1_performtransformation_greenBB(Operation feature,
			Interface umlClass) {
		umlClass.getOwnedOperations().add(feature);
		return new Object[] { feature, umlClass };
	}

	public static final Object[] pattern_OperationInInterface_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_OperationInInterface_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject feature, EObject bodyDeclaration, EObject c2c, EObject classDec,
			EObject bd2ne, EObject umlClass) {
		if (!feature.equals(umlClass)) {
			if (!bodyDeclaration.equals(feature)) {
				if (!bodyDeclaration.equals(c2c)) {
					if (!bodyDeclaration.equals(classDec)) {
						if (!bodyDeclaration.equals(umlClass)) {
							if (!c2c.equals(feature)) {
								if (!c2c.equals(classDec)) {
									if (!c2c.equals(umlClass)) {
										if (!classDec.equals(feature)) {
											if (!classDec.equals(umlClass)) {
												if (!bd2ne.equals(feature)) {
													if (!bd2ne.equals(bodyDeclaration)) {
														if (!bd2ne.equals(c2c)) {
															if (!bd2ne.equals(classDec)) {
																if (!bd2ne.equals(umlClass)) {
																	return new Object[] { ruleresult, feature,
																			bodyDeclaration, c2c, classDec, bd2ne,
																			umlClass };
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

	public static final Object[] pattern_OperationInInterface_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject feature, EObject bodyDeclaration, EObject classDec,
			EObject umlClass) {
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____interface = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "OperationInInterface";
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____interface_name_prime = "interface";
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		ruleresult.getCreatedEdges().add(umlClass__feature____ownedOperation);
		feature__umlClass____interface.setSrc(feature);
		feature__umlClass____interface.setTrg(umlClass);
		ruleresult.getCreatedEdges().add(feature__umlClass____interface);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____interface.setName(feature__umlClass____interface_name_prime);
		return new Object[] { ruleresult, feature, bodyDeclaration, classDec, umlClass,
				classDec__bodyDeclaration____bodyDeclarations, bodyDeclaration__classDec____abstractTypeDeclaration,
				umlClass__feature____ownedOperation, feature__umlClass____interface };
	}

	public static final void pattern_OperationInInterface_1_5_registerobjects_expressionBBBBBBBB(
			OperationInInterface _this, PerformRuleResult ruleresult, EObject feature, EObject bodyDeclaration,
			EObject c2c, EObject classDec, EObject bd2ne, EObject umlClass) {
		_this.registerObjects_FWD(ruleresult, feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass);

	}

	public static final PerformRuleResult pattern_OperationInInterface_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_2_1_preparereturnvalue_bindingFB(
			OperationInInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_2_1_preparereturnvalue_blackFBB(EClass eClass,
			OperationInInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_2_1_preparereturnvalue_bindingAndBlackFFB(
			OperationInInterface _this) {
		Object[] result_pattern_OperationInInterface_2_1_preparereturnvalue_binding = pattern_OperationInInterface_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OperationInInterface_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_OperationInInterface_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OperationInInterface_2_1_preparereturnvalue_black = pattern_OperationInInterface_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_OperationInInterface_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_OperationInInterface_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "OperationInInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_OperationInInterface_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("bodyDeclaration");
		EObject _localVariable_1 = match.getObject("classDec");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpClassDec = _localVariable_1;
		if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
			if (tmpClassDec instanceof InterfaceDeclaration) {
				InterfaceDeclaration classDec = (InterfaceDeclaration) tmpClassDec;
				return new Object[] { bodyDeclaration, classDec, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OperationInInterface_2_2_corematch_blackFBFBFFB(
			MAbstractMethodDefinition bodyDeclaration, InterfaceDeclaration classDec, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element bd2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(bodyDeclaration,
				ASTNode2Element.class, "source")) {
			Element tmpFeature = bd2ne.getTarget();
			if (tmpFeature instanceof Operation) {
				Operation feature = (Operation) tmpFeature;
				for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(classDec,
						ASTNode2Element.class, "source")) {
					if (!bd2ne.equals(c2c)) {
						Element tmpUmlClass = c2c.getTarget();
						if (tmpUmlClass instanceof Interface) {
							Interface umlClass = (Interface) tmpUmlClass;
							_result.add(
									new Object[] { feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_OperationInInterface_2_3_findcontext_blackBBBBBB(Operation feature,
			MAbstractMethodDefinition bodyDeclaration, ASTNode2Element c2c, InterfaceDeclaration classDec,
			ASTNode2Element bd2ne, Interface umlClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!bd2ne.equals(c2c)) {
			if (classDec.getBodyDeclarations().contains(bodyDeclaration)) {
				if (bodyDeclaration.equals(bd2ne.getSource())) {
					if (feature.equals(bd2ne.getTarget())) {
						if (classDec.equals(c2c.getSource())) {
							if (umlClass.equals(c2c.getTarget())) {
								_result.add(new Object[] { feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_2_3_findcontext_greenBBBBBBFFFFFFF(Operation feature,
			MAbstractMethodDefinition bodyDeclaration, ASTNode2Element c2c, InterfaceDeclaration classDec,
			ASTNode2Element bd2ne, Interface umlClass) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String bd2ne__feature____target_name_prime = "target";
		String c2c__classDec____source_name_prime = "source";
		String c2c__umlClass____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(c2c);
		isApplicableMatch.getAllContextElements().add(classDec);
		isApplicableMatch.getAllContextElements().add(bd2ne);
		isApplicableMatch.getAllContextElements().add(umlClass);
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(bd2ne__bodyDeclaration____source);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(bd2ne__feature____target);
		c2c__classDec____source.setSrc(c2c);
		c2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(c2c__classDec____source);
		c2c__umlClass____target.setSrc(c2c);
		c2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(c2c__umlClass____target);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		c2c__classDec____source.setName(c2c__classDec____source_name_prime);
		c2c__umlClass____target.setName(c2c__umlClass____target_name_prime);
		return new Object[] { feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass, isApplicableMatch,
				classDec__bodyDeclaration____bodyDeclarations, bodyDeclaration__classDec____abstractTypeDeclaration,
				bd2ne__bodyDeclaration____source, bd2ne__feature____target, c2c__classDec____source,
				c2c__umlClass____target };
	}

	public static final Object[] pattern_OperationInInterface_2_4_solveCSP_bindingFBBBBBBBB(OperationInInterface _this,
			IsApplicableMatch isApplicableMatch, Operation feature, MAbstractMethodDefinition bodyDeclaration,
			ASTNode2Element c2c, InterfaceDeclaration classDec, ASTNode2Element bd2ne, Interface umlClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, feature, bodyDeclaration, c2c,
				classDec, bd2ne, umlClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, bodyDeclaration, c2c, classDec, bd2ne,
					umlClass };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInInterface_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			OperationInInterface _this, IsApplicableMatch isApplicableMatch, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, ASTNode2Element c2c, InterfaceDeclaration classDec,
			ASTNode2Element bd2ne, Interface umlClass) {
		Object[] result_pattern_OperationInInterface_2_4_solveCSP_binding = pattern_OperationInInterface_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass);
		if (result_pattern_OperationInInterface_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInInterface_2_4_solveCSP_binding[0];

			Object[] result_pattern_OperationInInterface_2_4_solveCSP_black = pattern_OperationInInterface_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_OperationInInterface_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, bodyDeclaration, c2c, classDec, bd2ne,
						umlClass };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInInterface_2_5_checkCSP_expressionFBB(OperationInInterface _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_OperationInInterface_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "OperationInInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_OperationInInterface_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_10_1_initialbindings_blackBBBB(OperationInInterface _this,
			Match match, Operation feature, Interface umlClass) {
		return new Object[] { _this, match, feature, umlClass };
	}

	public static final Object[] pattern_OperationInInterface_10_2_SolveCSP_bindingFBBBB(OperationInInterface _this,
			Match match, Operation feature, Interface umlClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, umlClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, umlClass };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInInterface_10_2_SolveCSP_bindingAndBlackFBBBB(
			OperationInInterface _this, Match match, Operation feature, Interface umlClass) {
		Object[] result_pattern_OperationInInterface_10_2_SolveCSP_binding = pattern_OperationInInterface_10_2_SolveCSP_bindingFBBBB(
				_this, match, feature, umlClass);
		if (result_pattern_OperationInInterface_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInInterface_10_2_SolveCSP_binding[0];

			Object[] result_pattern_OperationInInterface_10_2_SolveCSP_black = pattern_OperationInInterface_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_OperationInInterface_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, umlClass };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInInterface_10_3_CheckCSP_expressionFBB(OperationInInterface _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_10_4_collectelementstobetranslated_blackBBB(Match match,
			Operation feature, Interface umlClass) {
		return new Object[] { match, feature, umlClass };
	}

	public static final Object[] pattern_OperationInInterface_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			Operation feature, Interface umlClass) {
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____interface = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____interface_name_prime = "interface";
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		match.getToBeTranslatedEdges().add(umlClass__feature____ownedOperation);
		feature__umlClass____interface.setSrc(feature);
		feature__umlClass____interface.setTrg(umlClass);
		match.getToBeTranslatedEdges().add(feature__umlClass____interface);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____interface.setName(feature__umlClass____interface_name_prime);
		return new Object[] { match, feature, umlClass, umlClass__feature____ownedOperation,
				feature__umlClass____interface };
	}

	public static final Object[] pattern_OperationInInterface_10_5_collectcontextelements_blackBBB(Match match,
			Operation feature, Interface umlClass) {
		return new Object[] { match, feature, umlClass };
	}

	public static final Object[] pattern_OperationInInterface_10_5_collectcontextelements_greenBBB(Match match,
			Operation feature, Interface umlClass) {
		match.getContextNodes().add(feature);
		match.getContextNodes().add(umlClass);
		return new Object[] { match, feature, umlClass };
	}

	public static final void pattern_OperationInInterface_10_6_registerobjectstomatch_expressionBBBB(
			OperationInInterface _this, Match match, Operation feature, Interface umlClass) {
		_this.registerObjectsToMatch_BWD(match, feature, umlClass);

	}

	public static final boolean pattern_OperationInInterface_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OperationInInterface_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject _localVariable_1 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_2 = isApplicableMatch.getObject("c2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("classDec");
		EObject _localVariable_4 = isApplicableMatch.getObject("bd2ne");
		EObject _localVariable_5 = isApplicableMatch.getObject("umlClass");
		EObject tmpFeature = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpC2c = _localVariable_2;
		EObject tmpClassDec = _localVariable_3;
		EObject tmpBd2ne = _localVariable_4;
		EObject tmpUmlClass = _localVariable_5;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
				MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
				if (tmpC2c instanceof ASTNode2Element) {
					ASTNode2Element c2c = (ASTNode2Element) tmpC2c;
					if (tmpClassDec instanceof InterfaceDeclaration) {
						InterfaceDeclaration classDec = (InterfaceDeclaration) tmpClassDec;
						if (tmpBd2ne instanceof ASTNode2Element) {
							ASTNode2Element bd2ne = (ASTNode2Element) tmpBd2ne;
							if (tmpUmlClass instanceof Interface) {
								Interface umlClass = (Interface) tmpUmlClass;
								return new Object[] { feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_11_1_performtransformation_blackBBBBBBFBB(
			Operation feature, MAbstractMethodDefinition bodyDeclaration, ASTNode2Element c2c,
			InterfaceDeclaration classDec, ASTNode2Element bd2ne, Interface umlClass, OperationInInterface _this,
			IsApplicableMatch isApplicableMatch) {
		if (!bd2ne.equals(c2c)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			OperationInInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_OperationInInterface_11_1_performtransformation_binding = pattern_OperationInInterface_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_OperationInInterface_11_1_performtransformation_binding != null) {
			Operation feature = (Operation) result_pattern_OperationInInterface_11_1_performtransformation_binding[0];
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result_pattern_OperationInInterface_11_1_performtransformation_binding[1];
			ASTNode2Element c2c = (ASTNode2Element) result_pattern_OperationInInterface_11_1_performtransformation_binding[2];
			InterfaceDeclaration classDec = (InterfaceDeclaration) result_pattern_OperationInInterface_11_1_performtransformation_binding[3];
			ASTNode2Element bd2ne = (ASTNode2Element) result_pattern_OperationInInterface_11_1_performtransformation_binding[4];
			Interface umlClass = (Interface) result_pattern_OperationInInterface_11_1_performtransformation_binding[5];

			Object[] result_pattern_OperationInInterface_11_1_performtransformation_black = pattern_OperationInInterface_11_1_performtransformation_blackBBBBBBFBB(
					feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass, _this, isApplicableMatch);
			if (result_pattern_OperationInInterface_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_OperationInInterface_11_1_performtransformation_black[6];

				return new Object[] { feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_11_1_performtransformation_greenBB(
			MAbstractMethodDefinition bodyDeclaration, InterfaceDeclaration classDec) {
		classDec.getBodyDeclarations().add(bodyDeclaration);
		return new Object[] { bodyDeclaration, classDec };
	}

	public static final Object[] pattern_OperationInInterface_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_OperationInInterface_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject feature, EObject bodyDeclaration, EObject c2c, EObject classDec,
			EObject bd2ne, EObject umlClass) {
		if (!feature.equals(umlClass)) {
			if (!bodyDeclaration.equals(feature)) {
				if (!bodyDeclaration.equals(c2c)) {
					if (!bodyDeclaration.equals(classDec)) {
						if (!bodyDeclaration.equals(umlClass)) {
							if (!c2c.equals(feature)) {
								if (!c2c.equals(classDec)) {
									if (!c2c.equals(umlClass)) {
										if (!classDec.equals(feature)) {
											if (!classDec.equals(umlClass)) {
												if (!bd2ne.equals(feature)) {
													if (!bd2ne.equals(bodyDeclaration)) {
														if (!bd2ne.equals(c2c)) {
															if (!bd2ne.equals(classDec)) {
																if (!bd2ne.equals(umlClass)) {
																	return new Object[] { ruleresult, feature,
																			bodyDeclaration, c2c, classDec, bd2ne,
																			umlClass };
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

	public static final Object[] pattern_OperationInInterface_11_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject feature, EObject bodyDeclaration, EObject classDec,
			EObject umlClass) {
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____interface = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "OperationInInterface";
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____interface_name_prime = "interface";
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		ruleresult.getCreatedEdges().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		ruleresult.getTranslatedEdges().add(umlClass__feature____ownedOperation);
		feature__umlClass____interface.setSrc(feature);
		feature__umlClass____interface.setTrg(umlClass);
		ruleresult.getTranslatedEdges().add(feature__umlClass____interface);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____interface.setName(feature__umlClass____interface_name_prime);
		return new Object[] { ruleresult, feature, bodyDeclaration, classDec, umlClass,
				classDec__bodyDeclaration____bodyDeclarations, bodyDeclaration__classDec____abstractTypeDeclaration,
				umlClass__feature____ownedOperation, feature__umlClass____interface };
	}

	public static final void pattern_OperationInInterface_11_5_registerobjects_expressionBBBBBBBB(
			OperationInInterface _this, PerformRuleResult ruleresult, EObject feature, EObject bodyDeclaration,
			EObject c2c, EObject classDec, EObject bd2ne, EObject umlClass) {
		_this.registerObjects_BWD(ruleresult, feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass);

	}

	public static final PerformRuleResult pattern_OperationInInterface_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_12_1_preparereturnvalue_bindingFB(
			OperationInInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_12_1_preparereturnvalue_blackFBB(EClass eClass,
			OperationInInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_12_1_preparereturnvalue_bindingAndBlackFFB(
			OperationInInterface _this) {
		Object[] result_pattern_OperationInInterface_12_1_preparereturnvalue_binding = pattern_OperationInInterface_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OperationInInterface_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_OperationInInterface_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OperationInInterface_12_1_preparereturnvalue_black = pattern_OperationInInterface_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_OperationInInterface_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_OperationInInterface_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "OperationInInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_OperationInInterface_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("umlClass");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUmlClass = _localVariable_1;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			if (tmpUmlClass instanceof Interface) {
				Interface umlClass = (Interface) tmpUmlClass;
				return new Object[] { feature, umlClass, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OperationInInterface_12_2_corematch_blackBFFFFBB(Operation feature,
			Interface umlClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element bd2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(feature,
				ASTNode2Element.class, "target")) {
			ASTNode tmpBodyDeclaration = bd2ne.getSource();
			if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
				MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
				for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(umlClass,
						ASTNode2Element.class, "target")) {
					if (!bd2ne.equals(c2c)) {
						ASTNode tmpClassDec = c2c.getSource();
						if (tmpClassDec instanceof InterfaceDeclaration) {
							InterfaceDeclaration classDec = (InterfaceDeclaration) tmpClassDec;
							_result.add(
									new Object[] { feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_OperationInInterface_12_3_findcontext_blackBBBBBB(Operation feature,
			MAbstractMethodDefinition bodyDeclaration, ASTNode2Element c2c, InterfaceDeclaration classDec,
			ASTNode2Element bd2ne, Interface umlClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!bd2ne.equals(c2c)) {
			if (bodyDeclaration.equals(bd2ne.getSource())) {
				if (feature.equals(bd2ne.getTarget())) {
					if (classDec.equals(c2c.getSource())) {
						if (umlClass.getOwnedOperations().contains(feature)) {
							if (umlClass.equals(c2c.getTarget())) {
								_result.add(new Object[] { feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_12_3_findcontext_greenBBBBBBFFFFFFF(Operation feature,
			MAbstractMethodDefinition bodyDeclaration, ASTNode2Element c2c, InterfaceDeclaration classDec,
			ASTNode2Element bd2ne, Interface umlClass) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____interface = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String bd2ne__feature____target_name_prime = "target";
		String c2c__classDec____source_name_prime = "source";
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____interface_name_prime = "interface";
		String c2c__umlClass____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(c2c);
		isApplicableMatch.getAllContextElements().add(classDec);
		isApplicableMatch.getAllContextElements().add(bd2ne);
		isApplicableMatch.getAllContextElements().add(umlClass);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(bd2ne__bodyDeclaration____source);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(bd2ne__feature____target);
		c2c__classDec____source.setSrc(c2c);
		c2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(c2c__classDec____source);
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(umlClass__feature____ownedOperation);
		feature__umlClass____interface.setSrc(feature);
		feature__umlClass____interface.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(feature__umlClass____interface);
		c2c__umlClass____target.setSrc(c2c);
		c2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(c2c__umlClass____target);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		c2c__classDec____source.setName(c2c__classDec____source_name_prime);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____interface.setName(feature__umlClass____interface_name_prime);
		c2c__umlClass____target.setName(c2c__umlClass____target_name_prime);
		return new Object[] { feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass, isApplicableMatch,
				bd2ne__bodyDeclaration____source, bd2ne__feature____target, c2c__classDec____source,
				umlClass__feature____ownedOperation, feature__umlClass____interface, c2c__umlClass____target };
	}

	public static final Object[] pattern_OperationInInterface_12_4_solveCSP_bindingFBBBBBBBB(OperationInInterface _this,
			IsApplicableMatch isApplicableMatch, Operation feature, MAbstractMethodDefinition bodyDeclaration,
			ASTNode2Element c2c, InterfaceDeclaration classDec, ASTNode2Element bd2ne, Interface umlClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature, bodyDeclaration, c2c,
				classDec, bd2ne, umlClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, bodyDeclaration, c2c, classDec, bd2ne,
					umlClass };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInInterface_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			OperationInInterface _this, IsApplicableMatch isApplicableMatch, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, ASTNode2Element c2c, InterfaceDeclaration classDec,
			ASTNode2Element bd2ne, Interface umlClass) {
		Object[] result_pattern_OperationInInterface_12_4_solveCSP_binding = pattern_OperationInInterface_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass);
		if (result_pattern_OperationInInterface_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInInterface_12_4_solveCSP_binding[0];

			Object[] result_pattern_OperationInInterface_12_4_solveCSP_black = pattern_OperationInInterface_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_OperationInInterface_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, bodyDeclaration, c2c, classDec, bd2ne,
						umlClass };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInInterface_12_5_checkCSP_expressionFBB(OperationInInterface _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_OperationInInterface_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "OperationInInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_OperationInInterface_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_20_1_preparereturnvalue_bindingFB(
			OperationInInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			OperationInInterface _this) {
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

	public static final Object[] pattern_OperationInInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(
			OperationInInterface _this) {
		Object[] result_pattern_OperationInInterface_20_1_preparereturnvalue_binding = pattern_OperationInInterface_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OperationInInterface_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_OperationInInterface_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OperationInInterface_20_1_preparereturnvalue_black = pattern_OperationInInterface_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_OperationInInterface_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_OperationInInterface_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_OperationInInterface_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_OperationInInterface_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedOperation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUmlClass = _edge_ownedOperation.getSrc();
		if (tmpUmlClass instanceof Interface) {
			Interface umlClass = (Interface) tmpUmlClass;
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

	public static final Object[] pattern_OperationInInterface_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_OperationInInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			OperationInInterface _this, Match match, Operation feature, Interface umlClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, umlClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_OperationInInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			OperationInInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_OperationInInterface_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_21_1_preparereturnvalue_bindingFB(
			OperationInInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			OperationInInterface _this) {
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

	public static final Object[] pattern_OperationInInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(
			OperationInInterface _this) {
		Object[] result_pattern_OperationInInterface_21_1_preparereturnvalue_binding = pattern_OperationInInterface_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OperationInInterface_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_OperationInInterface_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OperationInInterface_21_1_preparereturnvalue_black = pattern_OperationInInterface_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_OperationInInterface_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_OperationInInterface_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_OperationInInterface_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_OperationInInterface_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpClassDec = _edge_bodyDeclarations.getSrc();
		if (tmpClassDec instanceof InterfaceDeclaration) {
			InterfaceDeclaration classDec = (InterfaceDeclaration) tmpClassDec;
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

	public static final Object[] pattern_OperationInInterface_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_OperationInInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			OperationInInterface _this, Match match, MAbstractMethodDefinition bodyDeclaration,
			InterfaceDeclaration classDec) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, bodyDeclaration, classDec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_OperationInInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			OperationInInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_OperationInInterface_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_24_1_prepare_blackB(OperationInInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_OperationInInterface_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_OperationInInterface_24_2_matchsrctrgcontext_bindingFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_2 = sourceMatch.getObject("classDec");
		EObject _localVariable_3 = targetMatch.getObject("umlClass");
		EObject tmpFeature = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpClassDec = _localVariable_2;
		EObject tmpUmlClass = _localVariable_3;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
				MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
				if (tmpClassDec instanceof InterfaceDeclaration) {
					InterfaceDeclaration classDec = (InterfaceDeclaration) tmpClassDec;
					if (tmpUmlClass instanceof Interface) {
						Interface umlClass = (Interface) tmpUmlClass;
						return new Object[] { feature, bodyDeclaration, classDec, umlClass, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_24_2_matchsrctrgcontext_blackBBBBBB(Operation feature,
			MAbstractMethodDefinition bodyDeclaration, InterfaceDeclaration classDec, Interface umlClass,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { feature, bodyDeclaration, classDec, umlClass, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_OperationInInterface_24_2_matchsrctrgcontext_binding = pattern_OperationInInterface_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_OperationInInterface_24_2_matchsrctrgcontext_binding != null) {
			Operation feature = (Operation) result_pattern_OperationInInterface_24_2_matchsrctrgcontext_binding[0];
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result_pattern_OperationInInterface_24_2_matchsrctrgcontext_binding[1];
			InterfaceDeclaration classDec = (InterfaceDeclaration) result_pattern_OperationInInterface_24_2_matchsrctrgcontext_binding[2];
			Interface umlClass = (Interface) result_pattern_OperationInInterface_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_OperationInInterface_24_2_matchsrctrgcontext_black = pattern_OperationInInterface_24_2_matchsrctrgcontext_blackBBBBBB(
					feature, bodyDeclaration, classDec, umlClass, sourceMatch, targetMatch);
			if (result_pattern_OperationInInterface_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, bodyDeclaration, classDec, umlClass, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_24_3_solvecsp_bindingFBBBBBBB(OperationInInterface _this,
			Operation feature, MAbstractMethodDefinition bodyDeclaration, InterfaceDeclaration classDec,
			Interface umlClass, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(feature, bodyDeclaration, classDec, umlClass, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, feature, bodyDeclaration, classDec, umlClass, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInInterface_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			OperationInInterface _this, Operation feature, MAbstractMethodDefinition bodyDeclaration,
			InterfaceDeclaration classDec, Interface umlClass, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_OperationInInterface_24_3_solvecsp_binding = pattern_OperationInInterface_24_3_solvecsp_bindingFBBBBBBB(
				_this, feature, bodyDeclaration, classDec, umlClass, sourceMatch, targetMatch);
		if (result_pattern_OperationInInterface_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInInterface_24_3_solvecsp_binding[0];

			Object[] result_pattern_OperationInInterface_24_3_solvecsp_black = pattern_OperationInInterface_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_OperationInInterface_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, bodyDeclaration, classDec, umlClass, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInInterface_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_OperationInInterface_24_5_matchcorrcontext_blackBBFBFBBB(
			Operation feature, MAbstractMethodDefinition bodyDeclaration, InterfaceDeclaration classDec,
			Interface umlClass, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element bd2ne : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(bodyDeclaration, ASTNode2Element.class, "source")) {
				if (feature.equals(bd2ne.getTarget())) {
					for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(classDec, ASTNode2Element.class, "source")) {
						if (!bd2ne.equals(c2c)) {
							if (umlClass.equals(c2c.getTarget())) {
								_result.add(new Object[] { feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass,
										sourceMatch, targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_24_5_matchcorrcontext_greenBBBBF(ASTNode2Element c2c,
			ASTNode2Element bd2ne, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "OperationInInterface";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(c2c);
		ccMatch.getAllContextElements().add(bd2ne);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { c2c, bd2ne, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_OperationInInterface_24_6_createcorrespondence_blackBBBBB(Operation feature,
			MAbstractMethodDefinition bodyDeclaration, InterfaceDeclaration classDec, Interface umlClass,
			CCMatch ccMatch) {
		return new Object[] { feature, bodyDeclaration, classDec, umlClass, ccMatch };
	}

	public static final Object[] pattern_OperationInInterface_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_OperationInInterface_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "OperationInInterface";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_OperationInInterface_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_27_1_matchtggpattern_blackBB(
			MAbstractMethodDefinition bodyDeclaration, InterfaceDeclaration classDec) {
		if (classDec.getBodyDeclarations().contains(bodyDeclaration)) {
			return new Object[] { bodyDeclaration, classDec };
		}
		return null;
	}

	public static final boolean pattern_OperationInInterface_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OperationInInterface_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_28_1_matchtggpattern_blackBB(Operation feature,
			Interface umlClass) {
		if (umlClass.getOwnedOperations().contains(feature)) {
			return new Object[] { feature, umlClass };
		}
		return null;
	}

	public static final boolean pattern_OperationInInterface_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OperationInInterface_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_29_1_createresult_blackB(OperationInInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_OperationInInterface_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_OperationInInterface_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Operation feature) {
		if (ruleResult.getTargetObjects().contains(feature)) {
			return new Object[] { ruleResult, feature };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element bd2ne) {
		if (ruleResult.getCorrObjects().contains(bd2ne)) {
			return new Object[] { ruleResult, bd2ne };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MAbstractMethodDefinition bodyDeclaration) {
		if (ruleResult.getSourceObjects().contains(bodyDeclaration)) {
			return new Object[] { ruleResult, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element c2c) {
		if (ruleResult.getCorrObjects().contains(c2c)) {
			return new Object[] { ruleResult, c2c };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, InterfaceDeclaration classDec) {
		if (ruleResult.getSourceObjects().contains(classDec)) {
			return new Object[] { ruleResult, classDec };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Interface umlClass) {
		if (ruleResult.getTargetObjects().contains(umlClass)) {
			return new Object[] { ruleResult, umlClass };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OperationInInterface_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList bd2neList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList c2cList : ruleEntryContainer.getRuleEntryList()) {
				if (!bd2neList.equals(c2cList)) {
					for (EObject tmpBd2ne : bd2neList.getEntryObjects()) {
						if (tmpBd2ne instanceof ASTNode2Element) {
							ASTNode2Element bd2ne = (ASTNode2Element) tmpBd2ne;
							Element tmpFeature = bd2ne.getTarget();
							if (tmpFeature instanceof Operation) {
								Operation feature = (Operation) tmpFeature;
								ASTNode tmpBodyDeclaration = bd2ne.getSource();
								if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
									MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
									if (pattern_OperationInInterface_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											bd2ne) == null) {
										if (pattern_OperationInInterface_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												feature) == null) {
											if (pattern_OperationInInterface_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, bodyDeclaration) == null) {
												for (EObject tmpC2c : c2cList.getEntryObjects()) {
													if (tmpC2c instanceof ASTNode2Element) {
														ASTNode2Element c2c = (ASTNode2Element) tmpC2c;
														if (!bd2ne.equals(c2c)) {
															ASTNode tmpClassDec = c2c.getSource();
															if (tmpClassDec instanceof InterfaceDeclaration) {
																InterfaceDeclaration classDec = (InterfaceDeclaration) tmpClassDec;
																Element tmpUmlClass = c2c.getTarget();
																if (tmpUmlClass instanceof Interface) {
																	Interface umlClass = (Interface) tmpUmlClass;
																	if (pattern_OperationInInterface_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, c2c) == null) {
																		if (pattern_OperationInInterface_29_2_isapplicablecore_black_nac_4BB(
																				ruleResult, classDec) == null) {
																			if (pattern_OperationInInterface_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult, umlClass) == null) {
																				_result.add(new Object[] { bd2neList,
																						feature, bd2ne, bodyDeclaration,
																						c2cList, c2c, classDec,
																						umlClass, ruleEntryContainer,
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

	public static final Object[] pattern_OperationInInterface_29_3_solveCSP_bindingFBBBBBBBBB(
			OperationInInterface _this, IsApplicableMatch isApplicableMatch, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, ASTNode2Element c2c, InterfaceDeclaration classDec,
			ASTNode2Element bd2ne, Interface umlClass, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, feature, bodyDeclaration, c2c,
				classDec, bd2ne, umlClass, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, bodyDeclaration, c2c, classDec, bd2ne,
					umlClass, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInInterface_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			OperationInInterface _this, IsApplicableMatch isApplicableMatch, Operation feature,
			MAbstractMethodDefinition bodyDeclaration, ASTNode2Element c2c, InterfaceDeclaration classDec,
			ASTNode2Element bd2ne, Interface umlClass, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_OperationInInterface_29_3_solveCSP_binding = pattern_OperationInInterface_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass, ruleResult);
		if (result_pattern_OperationInInterface_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInInterface_29_3_solveCSP_binding[0];

			Object[] result_pattern_OperationInInterface_29_3_solveCSP_black = pattern_OperationInInterface_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_OperationInInterface_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, bodyDeclaration, c2c, classDec, bd2ne,
						umlClass, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInInterface_29_4_checkCSP_expressionFBB(OperationInInterface _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInInterface_29_5_checknacs_blackBBBBBB(Operation feature,
			MAbstractMethodDefinition bodyDeclaration, ASTNode2Element c2c, InterfaceDeclaration classDec,
			ASTNode2Element bd2ne, Interface umlClass) {
		if (!bd2ne.equals(c2c)) {
			return new Object[] { feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_29_6_perform_blackBBBBBBB(Operation feature,
			MAbstractMethodDefinition bodyDeclaration, ASTNode2Element c2c, InterfaceDeclaration classDec,
			ASTNode2Element bd2ne, Interface umlClass, ModelgeneratorRuleResult ruleResult) {
		if (!bd2ne.equals(c2c)) {
			return new Object[] { feature, bodyDeclaration, c2c, classDec, bd2ne, umlClass, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_OperationInInterface_29_6_perform_greenBBBBB(Operation feature,
			MAbstractMethodDefinition bodyDeclaration, InterfaceDeclaration classDec, Interface umlClass,
			ModelgeneratorRuleResult ruleResult) {
		classDec.getBodyDeclarations().add(bodyDeclaration);
		umlClass.getOwnedOperations().add(feature);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { feature, bodyDeclaration, classDec, umlClass, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_OperationInInterface_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //OperationInInterfaceImpl
