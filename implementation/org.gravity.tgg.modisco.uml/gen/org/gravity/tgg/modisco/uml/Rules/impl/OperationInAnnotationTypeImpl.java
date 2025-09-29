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
import org.eclipse.modisco.java.AnnotationTypeDeclaration;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;

import org.gravity.modisco.MAbstractMethodDefinition;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.OperationInAnnotationType;
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
 * An implementation of the model object '<em><b>Operation In Annotation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OperationInAnnotationTypeImpl extends AbstractRuleImpl implements OperationInAnnotationType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationInAnnotationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getOperationInAnnotationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MAbstractMethodDefinition bodyDeclaration,
			AnnotationTypeDeclaration classDec) {

		Object[] result1_black = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_0_1_initialbindings_blackBBBB(this, match, bodyDeclaration,
						classDec);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = "
					+ classDec + ".");
		}

		Object[] result2_bindingAndBlack = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, bodyDeclaration,
						classDec);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = "
					+ classDec + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = OperationInAnnotationTypeImpl
					.pattern_OperationInAnnotationType_0_4_collectelementstobetranslated_blackBBB(match,
							bodyDeclaration, classDec);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = " + classDec + ".");
			}
			OperationInAnnotationTypeImpl
					.pattern_OperationInAnnotationType_0_4_collectelementstobetranslated_greenBBBFF(match,
							bodyDeclaration, classDec);
			//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = OperationInAnnotationTypeImpl
					.pattern_OperationInAnnotationType_0_5_collectcontextelements_blackBBB(match, bodyDeclaration,
							classDec);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = " + classDec + ".");
			}
			OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_0_5_collectcontextelements_greenBBB(match,
					bodyDeclaration, classDec);

			// 
			OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_0_6_registerobjectstomatch_expressionBBBB(
					this, match, bodyDeclaration, classDec);
			return OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_0_7_expressionF();
		} else {
			return OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result1_bindingAndBlack[0];
		Interface umlClass = (Interface) result1_bindingAndBlack[1];
		ASTNode2Element bd2ne = (ASTNode2Element) result1_bindingAndBlack[2];
		Operation feature = (Operation) result1_bindingAndBlack[3];
		ASTNode2Element c2c = (ASTNode2Element) result1_bindingAndBlack[4];
		AnnotationTypeDeclaration classDec = (AnnotationTypeDeclaration) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_1_1_performtransformation_greenBB(umlClass,
				feature);

		Object[] result2_green = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, bodyDeclaration,
						umlClass, bd2ne, feature, c2c, classDec);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[umlClass] = " + umlClass + ", "
					+ "[bd2ne] = " + bd2ne + ", " + "[feature] = " + feature + ", " + "[c2c] = " + c2c + ", "
					+ "[classDec] = " + classDec + ".");
		}
		OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_1_3_bookkeepingforedges_greenBBBBBFFFF(
				ruleresult, bodyDeclaration, umlClass, feature, classDec);
		//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge feature__umlClass____interface = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result3_green[8];

		// 
		// 
		OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec);
		return OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_binding[0];
		AnnotationTypeDeclaration classDec = (AnnotationTypeDeclaration) result2_binding[1];
		for (Object[] result2_black : OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_2_2_corematch_blackBFFFFBB(bodyDeclaration, classDec, match)) {
			Interface umlClass = (Interface) result2_black[1];
			ASTNode2Element bd2ne = (ASTNode2Element) result2_black[2];
			Operation feature = (Operation) result2_black[3];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[4];
			// ForEach 
			for (Object[] result3_black : OperationInAnnotationTypeImpl
					.pattern_OperationInAnnotationType_2_3_findcontext_blackBBBBBB(bodyDeclaration, umlClass, bd2ne,
							feature, c2c, classDec)) {
				Object[] result3_green = OperationInAnnotationTypeImpl
						.pattern_OperationInAnnotationType_2_3_findcontext_greenBBBBBBFFFFFFF(bodyDeclaration, umlClass,
								bd2ne, feature, c2c, classDec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge c2c__classDec____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge c2c__umlClass____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = OperationInAnnotationTypeImpl
						.pattern_OperationInAnnotationType_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[umlClass] = " + umlClass + ", " + "[bd2ne] = " + bd2ne + ", "
							+ "[feature] = " + feature + ", " + "[c2c] = " + c2c + ", " + "[classDec] = " + classDec
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = OperationInAnnotationTypeImpl
							.pattern_OperationInAnnotationType_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MAbstractMethodDefinition bodyDeclaration,
			AnnotationTypeDeclaration classDec) {
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("classDec", classDec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MAbstractMethodDefinition bodyDeclaration,
			AnnotationTypeDeclaration classDec) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MAbstractMethodDefinition bodyDeclaration,
			Interface umlClass, ASTNode2Element bd2ne, Operation feature, ASTNode2Element c2c,
			AnnotationTypeDeclaration classDec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("bd2ne", bd2ne);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("c2c", c2c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject bodyDeclaration, EObject umlClass,
			EObject bd2ne, EObject feature, EObject c2c, EObject classDec) {
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("umlClass", umlClass);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("c2c", c2c);
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
	public boolean isAppropriate_BWD(Match match, Interface umlClass, Operation feature) {

		Object[] result1_black = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_10_1_initialbindings_blackBBBB(this, match, umlClass, feature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[umlClass] = " + umlClass + ", " + "[feature] = " + feature + ".");
		}

		Object[] result2_bindingAndBlack = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, umlClass, feature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[umlClass] = " + umlClass + ", " + "[feature] = " + feature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = OperationInAnnotationTypeImpl
					.pattern_OperationInAnnotationType_10_4_collectelementstobetranslated_blackBBB(match, umlClass,
							feature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[umlClass] = " + umlClass + ", " + "[feature] = " + feature + ".");
			}
			OperationInAnnotationTypeImpl
					.pattern_OperationInAnnotationType_10_4_collectelementstobetranslated_greenBBBFF(match, umlClass,
							feature);
			//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge feature__umlClass____interface = (EMoflonEdge) result4_green[4];

			Object[] result5_black = OperationInAnnotationTypeImpl
					.pattern_OperationInAnnotationType_10_5_collectcontextelements_blackBBB(match, umlClass, feature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[umlClass] = " + umlClass + ", " + "[feature] = " + feature + ".");
			}
			OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_10_5_collectcontextelements_greenBBB(match,
					umlClass, feature);

			// 
			OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_10_6_registerobjectstomatch_expressionBBBB(
					this, match, umlClass, feature);
			return OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_10_7_expressionF();
		} else {
			return OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result1_bindingAndBlack[0];
		Interface umlClass = (Interface) result1_bindingAndBlack[1];
		ASTNode2Element bd2ne = (ASTNode2Element) result1_bindingAndBlack[2];
		Operation feature = (Operation) result1_bindingAndBlack[3];
		ASTNode2Element c2c = (ASTNode2Element) result1_bindingAndBlack[4];
		AnnotationTypeDeclaration classDec = (AnnotationTypeDeclaration) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_11_1_performtransformation_greenBB(bodyDeclaration, classDec);

		Object[] result2_green = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, bodyDeclaration,
						umlClass, bd2ne, feature, c2c, classDec);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[umlClass] = " + umlClass + ", "
					+ "[bd2ne] = " + bd2ne + ", " + "[feature] = " + feature + ", " + "[c2c] = " + c2c + ", "
					+ "[classDec] = " + classDec + ".");
		}
		OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_11_3_bookkeepingforedges_greenBBBBBFFFF(
				ruleresult, bodyDeclaration, umlClass, feature, classDec);
		//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge feature__umlClass____interface = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result3_green[8];

		// 
		// 
		OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_11_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec);
		return OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Interface umlClass = (Interface) result2_binding[0];
		Operation feature = (Operation) result2_binding[1];
		for (Object[] result2_black : OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_12_2_corematch_blackFBFBFFB(umlClass, feature, match)) {
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_black[0];
			ASTNode2Element bd2ne = (ASTNode2Element) result2_black[2];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[4];
			AnnotationTypeDeclaration classDec = (AnnotationTypeDeclaration) result2_black[5];
			// ForEach 
			for (Object[] result3_black : OperationInAnnotationTypeImpl
					.pattern_OperationInAnnotationType_12_3_findcontext_blackBBBBBB(bodyDeclaration, umlClass, bd2ne,
							feature, c2c, classDec)) {
				Object[] result3_green = OperationInAnnotationTypeImpl
						.pattern_OperationInAnnotationType_12_3_findcontext_greenBBBBBBFFFFFFF(bodyDeclaration,
								umlClass, bd2ne, feature, c2c, classDec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge feature__umlClass____interface = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge c2c__classDec____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge c2c__umlClass____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = OperationInAnnotationTypeImpl
						.pattern_OperationInAnnotationType_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[umlClass] = " + umlClass + ", " + "[bd2ne] = " + bd2ne + ", "
							+ "[feature] = " + feature + ", " + "[c2c] = " + c2c + ", " + "[classDec] = " + classDec
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = OperationInAnnotationTypeImpl
							.pattern_OperationInAnnotationType_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Interface umlClass, Operation feature) {
		match.registerObject("umlClass", umlClass);
		match.registerObject("feature", feature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Interface umlClass, Operation feature) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MAbstractMethodDefinition bodyDeclaration,
			Interface umlClass, ASTNode2Element bd2ne, Operation feature, ASTNode2Element c2c,
			AnnotationTypeDeclaration classDec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("bd2ne", bd2ne);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("c2c", c2c);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject bodyDeclaration, EObject umlClass,
			EObject bd2ne, EObject feature, EObject c2c, EObject classDec) {
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("umlClass", umlClass);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("c2c", c2c);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_127(EMoflonEdge _edge_ownedOperation) {

		Object[] result1_bindingAndBlack = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_20_2_testcorematchandDECs_blackFFB(_edge_ownedOperation)) {
			Interface umlClass = (Interface) result2_black[0];
			Operation feature = (Operation) result2_black[1];
			Object[] result2_green = OperationInAnnotationTypeImpl
					.pattern_OperationInAnnotationType_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (OperationInAnnotationTypeImpl
					.pattern_OperationInAnnotationType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, umlClass, feature)) {
				// 
				if (OperationInAnnotationTypeImpl
						.pattern_OperationInAnnotationType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = OperationInAnnotationTypeImpl
							.pattern_OperationInAnnotationType_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_138(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_21_2_testcorematchandDECs_blackFFB(_edge_bodyDeclarations)) {
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_black[0];
			AnnotationTypeDeclaration classDec = (AnnotationTypeDeclaration) result2_black[1];
			Object[] result2_green = OperationInAnnotationTypeImpl
					.pattern_OperationInAnnotationType_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (OperationInAnnotationTypeImpl
					.pattern_OperationInAnnotationType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, bodyDeclaration, classDec)) {
				// 
				if (OperationInAnnotationTypeImpl
						.pattern_OperationInAnnotationType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = OperationInAnnotationTypeImpl
							.pattern_OperationInAnnotationType_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("OperationInAnnotationType");
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
		ruleResult.setRule("OperationInAnnotationType");
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

		Object[] result1_black = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_bindingAndBlack[0];
		Interface umlClass = (Interface) result2_bindingAndBlack[1];
		Operation feature = (Operation) result2_bindingAndBlack[2];
		AnnotationTypeDeclaration classDec = (AnnotationTypeDeclaration) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, bodyDeclaration,
						umlClass, feature, classDec, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[umlClass] = " + umlClass + ", "
					+ "[feature] = " + feature + ", " + "[classDec] = " + classDec + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : OperationInAnnotationTypeImpl
					.pattern_OperationInAnnotationType_24_5_matchcorrcontext_blackBBFBFBBB(bodyDeclaration, umlClass,
							feature, classDec, sourceMatch, targetMatch)) {
				ASTNode2Element bd2ne = (ASTNode2Element) result5_black[2];
				ASTNode2Element c2c = (ASTNode2Element) result5_black[4];
				Object[] result5_green = OperationInAnnotationTypeImpl
						.pattern_OperationInAnnotationType_24_5_matchcorrcontext_greenBBBBF(bd2ne, c2c, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = OperationInAnnotationTypeImpl
						.pattern_OperationInAnnotationType_24_6_createcorrespondence_blackBBBBB(bodyDeclaration,
								umlClass, feature, classDec, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[umlClass] = " + umlClass + ", " + "[feature] = " + feature
							+ ", " + "[classDec] = " + classDec + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = OperationInAnnotationTypeImpl
						.pattern_OperationInAnnotationType_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MAbstractMethodDefinition bodyDeclaration, Interface umlClass,
			Operation feature, AnnotationTypeDeclaration classDec, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MAbstractMethodDefinition bodyDeclaration, AnnotationTypeDeclaration classDec) {// 
		Object[] result1_black = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_27_1_matchtggpattern_blackBB(bodyDeclaration, classDec);
		if (result1_black != null) {
			return OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_27_2_expressionF();
		} else {
			return OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Interface umlClass, Operation feature) {// 
		Object[] result1_black = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_28_1_matchtggpattern_blackBB(umlClass, feature);
		if (result1_black != null) {
			return OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_28_2_expressionF();
		} else {
			return OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element bd2neParameter,
			ASTNode2Element c2cParameter) {

		Object[] result1_black = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : OperationInAnnotationTypeImpl
				.pattern_OperationInAnnotationType_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList bd2neList = (RuleEntryList) result2_black[0];
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result2_black[1];
			ASTNode2Element bd2ne = (ASTNode2Element) result2_black[2];
			Operation feature = (Operation) result2_black[3];
			//nothing RuleEntryList c2cList = (RuleEntryList) result2_black[4];
			Interface umlClass = (Interface) result2_black[5];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[6];
			AnnotationTypeDeclaration classDec = (AnnotationTypeDeclaration) result2_black[7];

			Object[] result3_bindingAndBlack = OperationInAnnotationTypeImpl
					.pattern_OperationInAnnotationType_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bodyDeclaration] = " + bodyDeclaration
						+ ", " + "[umlClass] = " + umlClass + ", " + "[bd2ne] = " + bd2ne + ", " + "[feature] = "
						+ feature + ", " + "[c2c] = " + c2c + ", " + "[classDec] = " + classDec + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = OperationInAnnotationTypeImpl
						.pattern_OperationInAnnotationType_29_5_checknacs_blackBBBBBB(bodyDeclaration, umlClass, bd2ne,
								feature, c2c, classDec);
				if (result5_black != null) {

					Object[] result6_black = OperationInAnnotationTypeImpl
							.pattern_OperationInAnnotationType_29_6_perform_blackBBBBBBB(bodyDeclaration, umlClass,
									bd2ne, feature, c2c, classDec, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[bodyDeclaration] = "
								+ bodyDeclaration + ", " + "[umlClass] = " + umlClass + ", " + "[bd2ne] = " + bd2ne
								+ ", " + "[feature] = " + feature + ", " + "[c2c] = " + c2c + ", " + "[classDec] = "
								+ classDec + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_29_6_perform_greenBBBBB(
							bodyDeclaration, umlClass, feature, classDec, ruleResult);

				} else {
				}

			} else {
			}

		}
		return OperationInAnnotationTypeImpl.pattern_OperationInAnnotationType_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, ASTNode2Element bd2ne, Operation feature,
			ASTNode2Element c2c, AnnotationTypeDeclaration classDec, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("bd2ne", bd2ne);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("c2c", c2c);
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
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___IS_APPROPRIATE_FWD__MATCH_MABSTRACTMETHODDEFINITION_ANNOTATIONTYPEDECLARATION:
				return isAppropriate_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
						(AnnotationTypeDeclaration) arguments.get(2));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MABSTRACTMETHODDEFINITION_ANNOTATIONTYPEDECLARATION:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
						(AnnotationTypeDeclaration) arguments.get(2));
				return null;
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MABSTRACTMETHODDEFINITION_ANNOTATIONTYPEDECLARATION:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
						(MAbstractMethodDefinition) arguments.get(1), (AnnotationTypeDeclaration) arguments.get(2));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MABSTRACTMETHODDEFINITION_INTERFACE_ASTNODE2ELEMENT_OPERATION_ASTNODE2ELEMENT_ANNOTATIONTYPEDECLARATION:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
						(MAbstractMethodDefinition) arguments.get(1), (Interface) arguments.get(2),
						(ASTNode2Element) arguments.get(3), (Operation) arguments.get(4),
						(ASTNode2Element) arguments.get(5), (AnnotationTypeDeclaration) arguments.get(6));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6));
				return null;
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___IS_APPROPRIATE_BWD__MATCH_INTERFACE_OPERATION:
				return isAppropriate_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
						(Operation) arguments.get(2));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERFACE_OPERATION:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
						(Operation) arguments.get(2));
				return null;
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERFACE_OPERATION:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
						(Operation) arguments.get(2));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MABSTRACTMETHODDEFINITION_INTERFACE_ASTNODE2ELEMENT_OPERATION_ASTNODE2ELEMENT_ANNOTATIONTYPEDECLARATION:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(MAbstractMethodDefinition) arguments.get(1), (Interface) arguments.get(2),
						(ASTNode2Element) arguments.get(3), (Operation) arguments.get(4),
						(ASTNode2Element) arguments.get(5), (AnnotationTypeDeclaration) arguments.get(6));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6));
				return null;
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_127__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_127((EMoflonEdge) arguments.get(0));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_138__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_138((EMoflonEdge) arguments.get(0));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__MABSTRACTMETHODDEFINITION_INTERFACE_OPERATION_ANNOTATIONTYPEDECLARATION_MATCH_MATCH:
				return isApplicable_solveCsp_CC((MAbstractMethodDefinition) arguments.get(0),
						(Interface) arguments.get(1), (Operation) arguments.get(2),
						(AnnotationTypeDeclaration) arguments.get(3), (Match) arguments.get(4),
						(Match) arguments.get(5));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___CHECK_DEC_FWD__MABSTRACTMETHODDEFINITION_ANNOTATIONTYPEDECLARATION:
				return checkDEC_FWD((MAbstractMethodDefinition) arguments.get(0),
						(AnnotationTypeDeclaration) arguments.get(1));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___CHECK_DEC_BWD__INTERFACE_OPERATION:
				return checkDEC_BWD((Interface) arguments.get(0), (Operation) arguments.get(1));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
				return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
						(ASTNode2Element) arguments.get(2));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MABSTRACTMETHODDEFINITION_INTERFACE_ASTNODE2ELEMENT_OPERATION_ASTNODE2ELEMENT_ANNOTATIONTYPEDECLARATION_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(MAbstractMethodDefinition) arguments.get(1), (Interface) arguments.get(2),
						(ASTNode2Element) arguments.get(3), (Operation) arguments.get(4),
						(ASTNode2Element) arguments.get(5), (AnnotationTypeDeclaration) arguments.get(6),
						(ModelgeneratorRuleResult) arguments.get(7));
			case RulesPackage.OPERATION_IN_ANNOTATION_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_OperationInAnnotationType_0_1_initialbindings_blackBBBB(
			OperationInAnnotationType _this, Match match, MAbstractMethodDefinition bodyDeclaration,
			AnnotationTypeDeclaration classDec) {
		return new Object[] { _this, match, bodyDeclaration, classDec };
	}

	public static final Object[] pattern_OperationInAnnotationType_0_2_SolveCSP_bindingFBBBB(
			OperationInAnnotationType _this, Match match, MAbstractMethodDefinition bodyDeclaration,
			AnnotationTypeDeclaration classDec) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, bodyDeclaration, classDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, bodyDeclaration, classDec };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInAnnotationType_0_2_SolveCSP_bindingAndBlackFBBBB(
			OperationInAnnotationType _this, Match match, MAbstractMethodDefinition bodyDeclaration,
			AnnotationTypeDeclaration classDec) {
		Object[] result_pattern_OperationInAnnotationType_0_2_SolveCSP_binding = pattern_OperationInAnnotationType_0_2_SolveCSP_bindingFBBBB(
				_this, match, bodyDeclaration, classDec);
		if (result_pattern_OperationInAnnotationType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInAnnotationType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_OperationInAnnotationType_0_2_SolveCSP_black = pattern_OperationInAnnotationType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_OperationInAnnotationType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, bodyDeclaration, classDec };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInAnnotationType_0_3_CheckCSP_expressionFBB(
			OperationInAnnotationType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_0_4_collectelementstobetranslated_blackBBB(
			Match match, MAbstractMethodDefinition bodyDeclaration, AnnotationTypeDeclaration classDec) {
		return new Object[] { match, bodyDeclaration, classDec };
	}

	public static final Object[] pattern_OperationInAnnotationType_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, MAbstractMethodDefinition bodyDeclaration, AnnotationTypeDeclaration classDec) {
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

	public static final Object[] pattern_OperationInAnnotationType_0_5_collectcontextelements_blackBBB(Match match,
			MAbstractMethodDefinition bodyDeclaration, AnnotationTypeDeclaration classDec) {
		return new Object[] { match, bodyDeclaration, classDec };
	}

	public static final Object[] pattern_OperationInAnnotationType_0_5_collectcontextelements_greenBBB(Match match,
			MAbstractMethodDefinition bodyDeclaration, AnnotationTypeDeclaration classDec) {
		match.getContextNodes().add(bodyDeclaration);
		match.getContextNodes().add(classDec);
		return new Object[] { match, bodyDeclaration, classDec };
	}

	public static final void pattern_OperationInAnnotationType_0_6_registerobjectstomatch_expressionBBBB(
			OperationInAnnotationType _this, Match match, MAbstractMethodDefinition bodyDeclaration,
			AnnotationTypeDeclaration classDec) {
		_this.registerObjectsToMatch_FWD(match, bodyDeclaration, classDec);

	}

	public static final boolean pattern_OperationInAnnotationType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OperationInAnnotationType_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("umlClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("bd2ne");
		EObject _localVariable_3 = isApplicableMatch.getObject("feature");
		EObject _localVariable_4 = isApplicableMatch.getObject("c2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("classDec");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpUmlClass = _localVariable_1;
		EObject tmpBd2ne = _localVariable_2;
		EObject tmpFeature = _localVariable_3;
		EObject tmpC2c = _localVariable_4;
		EObject tmpClassDec = _localVariable_5;
		if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
			if (tmpUmlClass instanceof Interface) {
				Interface umlClass = (Interface) tmpUmlClass;
				if (tmpBd2ne instanceof ASTNode2Element) {
					ASTNode2Element bd2ne = (ASTNode2Element) tmpBd2ne;
					if (tmpFeature instanceof Operation) {
						Operation feature = (Operation) tmpFeature;
						if (tmpC2c instanceof ASTNode2Element) {
							ASTNode2Element c2c = (ASTNode2Element) tmpC2c;
							if (tmpClassDec instanceof AnnotationTypeDeclaration) {
								AnnotationTypeDeclaration classDec = (AnnotationTypeDeclaration) tmpClassDec;
								return new Object[] { bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_1_1_performtransformation_blackBBBBBBFBB(
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, ASTNode2Element bd2ne, Operation feature,
			ASTNode2Element c2c, AnnotationTypeDeclaration classDec, OperationInAnnotationType _this,
			IsApplicableMatch isApplicableMatch) {
		if (!bd2ne.equals(c2c)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			OperationInAnnotationType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_OperationInAnnotationType_1_1_performtransformation_binding = pattern_OperationInAnnotationType_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_OperationInAnnotationType_1_1_performtransformation_binding != null) {
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result_pattern_OperationInAnnotationType_1_1_performtransformation_binding[0];
			Interface umlClass = (Interface) result_pattern_OperationInAnnotationType_1_1_performtransformation_binding[1];
			ASTNode2Element bd2ne = (ASTNode2Element) result_pattern_OperationInAnnotationType_1_1_performtransformation_binding[2];
			Operation feature = (Operation) result_pattern_OperationInAnnotationType_1_1_performtransformation_binding[3];
			ASTNode2Element c2c = (ASTNode2Element) result_pattern_OperationInAnnotationType_1_1_performtransformation_binding[4];
			AnnotationTypeDeclaration classDec = (AnnotationTypeDeclaration) result_pattern_OperationInAnnotationType_1_1_performtransformation_binding[5];

			Object[] result_pattern_OperationInAnnotationType_1_1_performtransformation_black = pattern_OperationInAnnotationType_1_1_performtransformation_blackBBBBBBFBB(
					bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec, _this, isApplicableMatch);
			if (result_pattern_OperationInAnnotationType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_OperationInAnnotationType_1_1_performtransformation_black[6];

				return new Object[] { bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_1_1_performtransformation_greenBB(Interface umlClass,
			Operation feature) {
		umlClass.getOwnedOperations().add(feature);
		return new Object[] { umlClass, feature };
	}

	public static final Object[] pattern_OperationInAnnotationType_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_OperationInAnnotationType_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject bodyDeclaration, EObject umlClass, EObject bd2ne, EObject feature,
			EObject c2c, EObject classDec) {
		if (!bodyDeclaration.equals(umlClass)) {
			if (!bodyDeclaration.equals(feature)) {
				if (!bodyDeclaration.equals(c2c)) {
					if (!bodyDeclaration.equals(classDec)) {
						if (!bd2ne.equals(bodyDeclaration)) {
							if (!bd2ne.equals(umlClass)) {
								if (!bd2ne.equals(feature)) {
									if (!bd2ne.equals(c2c)) {
										if (!bd2ne.equals(classDec)) {
											if (!feature.equals(umlClass)) {
												if (!c2c.equals(umlClass)) {
													if (!c2c.equals(feature)) {
														if (!c2c.equals(classDec)) {
															if (!classDec.equals(umlClass)) {
																if (!classDec.equals(feature)) {
																	return new Object[] { ruleresult, bodyDeclaration,
																			umlClass, bd2ne, feature, c2c, classDec };
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

	public static final Object[] pattern_OperationInAnnotationType_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject bodyDeclaration, EObject umlClass, EObject feature,
			EObject classDec) {
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____interface = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "OperationInAnnotationType";
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____interface_name_prime = "interface";
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		ruleresult.getCreatedEdges().add(umlClass__feature____ownedOperation);
		feature__umlClass____interface.setSrc(feature);
		feature__umlClass____interface.setTrg(umlClass);
		ruleresult.getCreatedEdges().add(feature__umlClass____interface);
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____interface.setName(feature__umlClass____interface_name_prime);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		return new Object[] { ruleresult, bodyDeclaration, umlClass, feature, classDec,
				umlClass__feature____ownedOperation, feature__umlClass____interface,
				classDec__bodyDeclaration____bodyDeclarations, bodyDeclaration__classDec____abstractTypeDeclaration };
	}

	public static final void pattern_OperationInAnnotationType_1_5_registerobjects_expressionBBBBBBBB(
			OperationInAnnotationType _this, PerformRuleResult ruleresult, EObject bodyDeclaration, EObject umlClass,
			EObject bd2ne, EObject feature, EObject c2c, EObject classDec) {
		_this.registerObjects_FWD(ruleresult, bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec);

	}

	public static final PerformRuleResult pattern_OperationInAnnotationType_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_2_1_preparereturnvalue_bindingFB(
			OperationInAnnotationType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			OperationInAnnotationType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_2_1_preparereturnvalue_bindingAndBlackFFB(
			OperationInAnnotationType _this) {
		Object[] result_pattern_OperationInAnnotationType_2_1_preparereturnvalue_binding = pattern_OperationInAnnotationType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OperationInAnnotationType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_OperationInAnnotationType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OperationInAnnotationType_2_1_preparereturnvalue_black = pattern_OperationInAnnotationType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_OperationInAnnotationType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_OperationInAnnotationType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "OperationInAnnotationType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_OperationInAnnotationType_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("bodyDeclaration");
		EObject _localVariable_1 = match.getObject("classDec");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpClassDec = _localVariable_1;
		if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
			if (tmpClassDec instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration classDec = (AnnotationTypeDeclaration) tmpClassDec;
				return new Object[] { bodyDeclaration, classDec, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OperationInAnnotationType_2_2_corematch_blackBFFFFBB(
			MAbstractMethodDefinition bodyDeclaration, AnnotationTypeDeclaration classDec, Match match) {
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
									new Object[] { bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_OperationInAnnotationType_2_3_findcontext_blackBBBBBB(
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, ASTNode2Element bd2ne, Operation feature,
			ASTNode2Element c2c, AnnotationTypeDeclaration classDec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!bd2ne.equals(c2c)) {
			if (bodyDeclaration.equals(bd2ne.getSource())) {
				if (feature.equals(bd2ne.getTarget())) {
					if (classDec.getBodyDeclarations().contains(bodyDeclaration)) {
						if (classDec.equals(c2c.getSource())) {
							if (umlClass.equals(c2c.getTarget())) {
								_result.add(new Object[] { bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_2_3_findcontext_greenBBBBBBFFFFFFF(
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, ASTNode2Element bd2ne, Operation feature,
			ASTNode2Element c2c, AnnotationTypeDeclaration classDec) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String bd2ne__feature____target_name_prime = "target";
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String c2c__classDec____source_name_prime = "source";
		String c2c__umlClass____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(umlClass);
		isApplicableMatch.getAllContextElements().add(bd2ne);
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(c2c);
		isApplicableMatch.getAllContextElements().add(classDec);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(bd2ne__bodyDeclaration____source);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(bd2ne__feature____target);
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		c2c__classDec____source.setSrc(c2c);
		c2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(c2c__classDec____source);
		c2c__umlClass____target.setSrc(c2c);
		c2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(c2c__umlClass____target);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		c2c__classDec____source.setName(c2c__classDec____source_name_prime);
		c2c__umlClass____target.setName(c2c__umlClass____target_name_prime);
		return new Object[] { bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec, isApplicableMatch,
				bd2ne__bodyDeclaration____source, bd2ne__feature____target,
				classDec__bodyDeclaration____bodyDeclarations, bodyDeclaration__classDec____abstractTypeDeclaration,
				c2c__classDec____source, c2c__umlClass____target };
	}

	public static final Object[] pattern_OperationInAnnotationType_2_4_solveCSP_bindingFBBBBBBBB(
			OperationInAnnotationType _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, ASTNode2Element bd2ne, Operation feature,
			ASTNode2Element c2c, AnnotationTypeDeclaration classDec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, bodyDeclaration, umlClass, bd2ne,
				feature, c2c, classDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, umlClass, bd2ne, feature, c2c,
					classDec };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInAnnotationType_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			OperationInAnnotationType _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, ASTNode2Element bd2ne, Operation feature,
			ASTNode2Element c2c, AnnotationTypeDeclaration classDec) {
		Object[] result_pattern_OperationInAnnotationType_2_4_solveCSP_binding = pattern_OperationInAnnotationType_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec);
		if (result_pattern_OperationInAnnotationType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInAnnotationType_2_4_solveCSP_binding[0];

			Object[] result_pattern_OperationInAnnotationType_2_4_solveCSP_black = pattern_OperationInAnnotationType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_OperationInAnnotationType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, umlClass, bd2ne, feature, c2c,
						classDec };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInAnnotationType_2_5_checkCSP_expressionFBB(
			OperationInAnnotationType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_OperationInAnnotationType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "OperationInAnnotationType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_OperationInAnnotationType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_10_1_initialbindings_blackBBBB(
			OperationInAnnotationType _this, Match match, Interface umlClass, Operation feature) {
		return new Object[] { _this, match, umlClass, feature };
	}

	public static final Object[] pattern_OperationInAnnotationType_10_2_SolveCSP_bindingFBBBB(
			OperationInAnnotationType _this, Match match, Interface umlClass, Operation feature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, umlClass, feature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, umlClass, feature };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInAnnotationType_10_2_SolveCSP_bindingAndBlackFBBBB(
			OperationInAnnotationType _this, Match match, Interface umlClass, Operation feature) {
		Object[] result_pattern_OperationInAnnotationType_10_2_SolveCSP_binding = pattern_OperationInAnnotationType_10_2_SolveCSP_bindingFBBBB(
				_this, match, umlClass, feature);
		if (result_pattern_OperationInAnnotationType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInAnnotationType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_OperationInAnnotationType_10_2_SolveCSP_black = pattern_OperationInAnnotationType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_OperationInAnnotationType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, umlClass, feature };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInAnnotationType_10_3_CheckCSP_expressionFBB(
			OperationInAnnotationType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_10_4_collectelementstobetranslated_blackBBB(
			Match match, Interface umlClass, Operation feature) {
		return new Object[] { match, umlClass, feature };
	}

	public static final Object[] pattern_OperationInAnnotationType_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, Interface umlClass, Operation feature) {
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
		return new Object[] { match, umlClass, feature, umlClass__feature____ownedOperation,
				feature__umlClass____interface };
	}

	public static final Object[] pattern_OperationInAnnotationType_10_5_collectcontextelements_blackBBB(Match match,
			Interface umlClass, Operation feature) {
		return new Object[] { match, umlClass, feature };
	}

	public static final Object[] pattern_OperationInAnnotationType_10_5_collectcontextelements_greenBBB(Match match,
			Interface umlClass, Operation feature) {
		match.getContextNodes().add(umlClass);
		match.getContextNodes().add(feature);
		return new Object[] { match, umlClass, feature };
	}

	public static final void pattern_OperationInAnnotationType_10_6_registerobjectstomatch_expressionBBBB(
			OperationInAnnotationType _this, Match match, Interface umlClass, Operation feature) {
		_this.registerObjectsToMatch_BWD(match, umlClass, feature);

	}

	public static final boolean pattern_OperationInAnnotationType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OperationInAnnotationType_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("umlClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("bd2ne");
		EObject _localVariable_3 = isApplicableMatch.getObject("feature");
		EObject _localVariable_4 = isApplicableMatch.getObject("c2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("classDec");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpUmlClass = _localVariable_1;
		EObject tmpBd2ne = _localVariable_2;
		EObject tmpFeature = _localVariable_3;
		EObject tmpC2c = _localVariable_4;
		EObject tmpClassDec = _localVariable_5;
		if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
			if (tmpUmlClass instanceof Interface) {
				Interface umlClass = (Interface) tmpUmlClass;
				if (tmpBd2ne instanceof ASTNode2Element) {
					ASTNode2Element bd2ne = (ASTNode2Element) tmpBd2ne;
					if (tmpFeature instanceof Operation) {
						Operation feature = (Operation) tmpFeature;
						if (tmpC2c instanceof ASTNode2Element) {
							ASTNode2Element c2c = (ASTNode2Element) tmpC2c;
							if (tmpClassDec instanceof AnnotationTypeDeclaration) {
								AnnotationTypeDeclaration classDec = (AnnotationTypeDeclaration) tmpClassDec;
								return new Object[] { bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_11_1_performtransformation_blackBBBBBBFBB(
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, ASTNode2Element bd2ne, Operation feature,
			ASTNode2Element c2c, AnnotationTypeDeclaration classDec, OperationInAnnotationType _this,
			IsApplicableMatch isApplicableMatch) {
		if (!bd2ne.equals(c2c)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			OperationInAnnotationType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_OperationInAnnotationType_11_1_performtransformation_binding = pattern_OperationInAnnotationType_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_OperationInAnnotationType_11_1_performtransformation_binding != null) {
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result_pattern_OperationInAnnotationType_11_1_performtransformation_binding[0];
			Interface umlClass = (Interface) result_pattern_OperationInAnnotationType_11_1_performtransformation_binding[1];
			ASTNode2Element bd2ne = (ASTNode2Element) result_pattern_OperationInAnnotationType_11_1_performtransformation_binding[2];
			Operation feature = (Operation) result_pattern_OperationInAnnotationType_11_1_performtransformation_binding[3];
			ASTNode2Element c2c = (ASTNode2Element) result_pattern_OperationInAnnotationType_11_1_performtransformation_binding[4];
			AnnotationTypeDeclaration classDec = (AnnotationTypeDeclaration) result_pattern_OperationInAnnotationType_11_1_performtransformation_binding[5];

			Object[] result_pattern_OperationInAnnotationType_11_1_performtransformation_black = pattern_OperationInAnnotationType_11_1_performtransformation_blackBBBBBBFBB(
					bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec, _this, isApplicableMatch);
			if (result_pattern_OperationInAnnotationType_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_OperationInAnnotationType_11_1_performtransformation_black[6];

				return new Object[] { bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_11_1_performtransformation_greenBB(
			MAbstractMethodDefinition bodyDeclaration, AnnotationTypeDeclaration classDec) {
		classDec.getBodyDeclarations().add(bodyDeclaration);
		return new Object[] { bodyDeclaration, classDec };
	}

	public static final Object[] pattern_OperationInAnnotationType_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_OperationInAnnotationType_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject bodyDeclaration, EObject umlClass, EObject bd2ne, EObject feature,
			EObject c2c, EObject classDec) {
		if (!bodyDeclaration.equals(umlClass)) {
			if (!bodyDeclaration.equals(feature)) {
				if (!bodyDeclaration.equals(c2c)) {
					if (!bodyDeclaration.equals(classDec)) {
						if (!bd2ne.equals(bodyDeclaration)) {
							if (!bd2ne.equals(umlClass)) {
								if (!bd2ne.equals(feature)) {
									if (!bd2ne.equals(c2c)) {
										if (!bd2ne.equals(classDec)) {
											if (!feature.equals(umlClass)) {
												if (!c2c.equals(umlClass)) {
													if (!c2c.equals(feature)) {
														if (!c2c.equals(classDec)) {
															if (!classDec.equals(umlClass)) {
																if (!classDec.equals(feature)) {
																	return new Object[] { ruleresult, bodyDeclaration,
																			umlClass, bd2ne, feature, c2c, classDec };
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

	public static final Object[] pattern_OperationInAnnotationType_11_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject bodyDeclaration, EObject umlClass, EObject feature,
			EObject classDec) {
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____interface = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "OperationInAnnotationType";
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____interface_name_prime = "interface";
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		ruleresult.getTranslatedEdges().add(umlClass__feature____ownedOperation);
		feature__umlClass____interface.setSrc(feature);
		feature__umlClass____interface.setTrg(umlClass);
		ruleresult.getTranslatedEdges().add(feature__umlClass____interface);
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		ruleresult.getCreatedEdges().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____interface.setName(feature__umlClass____interface_name_prime);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		return new Object[] { ruleresult, bodyDeclaration, umlClass, feature, classDec,
				umlClass__feature____ownedOperation, feature__umlClass____interface,
				classDec__bodyDeclaration____bodyDeclarations, bodyDeclaration__classDec____abstractTypeDeclaration };
	}

	public static final void pattern_OperationInAnnotationType_11_5_registerobjects_expressionBBBBBBBB(
			OperationInAnnotationType _this, PerformRuleResult ruleresult, EObject bodyDeclaration, EObject umlClass,
			EObject bd2ne, EObject feature, EObject c2c, EObject classDec) {
		_this.registerObjects_BWD(ruleresult, bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec);

	}

	public static final PerformRuleResult pattern_OperationInAnnotationType_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_12_1_preparereturnvalue_bindingFB(
			OperationInAnnotationType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_12_1_preparereturnvalue_blackFBB(EClass eClass,
			OperationInAnnotationType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_12_1_preparereturnvalue_bindingAndBlackFFB(
			OperationInAnnotationType _this) {
		Object[] result_pattern_OperationInAnnotationType_12_1_preparereturnvalue_binding = pattern_OperationInAnnotationType_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OperationInAnnotationType_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_OperationInAnnotationType_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OperationInAnnotationType_12_1_preparereturnvalue_black = pattern_OperationInAnnotationType_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_OperationInAnnotationType_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_OperationInAnnotationType_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "OperationInAnnotationType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_OperationInAnnotationType_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("umlClass");
		EObject _localVariable_1 = match.getObject("feature");
		EObject tmpUmlClass = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		if (tmpUmlClass instanceof Interface) {
			Interface umlClass = (Interface) tmpUmlClass;
			if (tmpFeature instanceof Operation) {
				Operation feature = (Operation) tmpFeature;
				return new Object[] { umlClass, feature, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OperationInAnnotationType_12_2_corematch_blackFBFBFFB(
			Interface umlClass, Operation feature, Match match) {
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
						if (tmpClassDec instanceof AnnotationTypeDeclaration) {
							AnnotationTypeDeclaration classDec = (AnnotationTypeDeclaration) tmpClassDec;
							_result.add(
									new Object[] { bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_OperationInAnnotationType_12_3_findcontext_blackBBBBBB(
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, ASTNode2Element bd2ne, Operation feature,
			ASTNode2Element c2c, AnnotationTypeDeclaration classDec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!bd2ne.equals(c2c)) {
			if (bodyDeclaration.equals(bd2ne.getSource())) {
				if (umlClass.getOwnedOperations().contains(feature)) {
					if (feature.equals(bd2ne.getTarget())) {
						if (classDec.equals(c2c.getSource())) {
							if (umlClass.equals(c2c.getTarget())) {
								_result.add(new Object[] { bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_12_3_findcontext_greenBBBBBBFFFFFFF(
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, ASTNode2Element bd2ne, Operation feature,
			ASTNode2Element c2c, AnnotationTypeDeclaration classDec) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____interface = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____interface_name_prime = "interface";
		String bd2ne__feature____target_name_prime = "target";
		String c2c__classDec____source_name_prime = "source";
		String c2c__umlClass____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(umlClass);
		isApplicableMatch.getAllContextElements().add(bd2ne);
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(c2c);
		isApplicableMatch.getAllContextElements().add(classDec);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(bd2ne__bodyDeclaration____source);
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(umlClass__feature____ownedOperation);
		feature__umlClass____interface.setSrc(feature);
		feature__umlClass____interface.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(feature__umlClass____interface);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(bd2ne__feature____target);
		c2c__classDec____source.setSrc(c2c);
		c2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(c2c__classDec____source);
		c2c__umlClass____target.setSrc(c2c);
		c2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(c2c__umlClass____target);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____interface.setName(feature__umlClass____interface_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		c2c__classDec____source.setName(c2c__classDec____source_name_prime);
		c2c__umlClass____target.setName(c2c__umlClass____target_name_prime);
		return new Object[] { bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec, isApplicableMatch,
				bd2ne__bodyDeclaration____source, umlClass__feature____ownedOperation, feature__umlClass____interface,
				bd2ne__feature____target, c2c__classDec____source, c2c__umlClass____target };
	}

	public static final Object[] pattern_OperationInAnnotationType_12_4_solveCSP_bindingFBBBBBBBB(
			OperationInAnnotationType _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, ASTNode2Element bd2ne, Operation feature,
			ASTNode2Element c2c, AnnotationTypeDeclaration classDec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, bodyDeclaration, umlClass, bd2ne,
				feature, c2c, classDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, umlClass, bd2ne, feature, c2c,
					classDec };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInAnnotationType_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			OperationInAnnotationType _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, ASTNode2Element bd2ne, Operation feature,
			ASTNode2Element c2c, AnnotationTypeDeclaration classDec) {
		Object[] result_pattern_OperationInAnnotationType_12_4_solveCSP_binding = pattern_OperationInAnnotationType_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec);
		if (result_pattern_OperationInAnnotationType_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInAnnotationType_12_4_solveCSP_binding[0];

			Object[] result_pattern_OperationInAnnotationType_12_4_solveCSP_black = pattern_OperationInAnnotationType_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_OperationInAnnotationType_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, umlClass, bd2ne, feature, c2c,
						classDec };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInAnnotationType_12_5_checkCSP_expressionFBB(
			OperationInAnnotationType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_OperationInAnnotationType_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "OperationInAnnotationType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_OperationInAnnotationType_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_20_1_preparereturnvalue_bindingFB(
			OperationInAnnotationType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			OperationInAnnotationType _this) {
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

	public static final Object[] pattern_OperationInAnnotationType_20_1_preparereturnvalue_bindingAndBlackFFBF(
			OperationInAnnotationType _this) {
		Object[] result_pattern_OperationInAnnotationType_20_1_preparereturnvalue_binding = pattern_OperationInAnnotationType_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OperationInAnnotationType_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_OperationInAnnotationType_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OperationInAnnotationType_20_1_preparereturnvalue_black = pattern_OperationInAnnotationType_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_OperationInAnnotationType_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_OperationInAnnotationType_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_OperationInAnnotationType_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_OperationInAnnotationType_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedOperation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUmlClass = _edge_ownedOperation.getSrc();
		if (tmpUmlClass instanceof Interface) {
			Interface umlClass = (Interface) tmpUmlClass;
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

	public static final Object[] pattern_OperationInAnnotationType_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_OperationInAnnotationType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			OperationInAnnotationType _this, Match match, Interface umlClass, Operation feature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, umlClass, feature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_OperationInAnnotationType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			OperationInAnnotationType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_OperationInAnnotationType_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_21_1_preparereturnvalue_bindingFB(
			OperationInAnnotationType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			OperationInAnnotationType _this) {
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

	public static final Object[] pattern_OperationInAnnotationType_21_1_preparereturnvalue_bindingAndBlackFFBF(
			OperationInAnnotationType _this) {
		Object[] result_pattern_OperationInAnnotationType_21_1_preparereturnvalue_binding = pattern_OperationInAnnotationType_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OperationInAnnotationType_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_OperationInAnnotationType_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OperationInAnnotationType_21_1_preparereturnvalue_black = pattern_OperationInAnnotationType_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_OperationInAnnotationType_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_OperationInAnnotationType_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_OperationInAnnotationType_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_OperationInAnnotationType_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpClassDec = _edge_bodyDeclarations.getSrc();
		if (tmpClassDec instanceof AnnotationTypeDeclaration) {
			AnnotationTypeDeclaration classDec = (AnnotationTypeDeclaration) tmpClassDec;
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

	public static final Object[] pattern_OperationInAnnotationType_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_OperationInAnnotationType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			OperationInAnnotationType _this, Match match, MAbstractMethodDefinition bodyDeclaration,
			AnnotationTypeDeclaration classDec) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, bodyDeclaration, classDec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_OperationInAnnotationType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			OperationInAnnotationType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_OperationInAnnotationType_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_24_1_prepare_blackB(
			OperationInAnnotationType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_OperationInAnnotationType_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_OperationInAnnotationType_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_1 = targetMatch.getObject("umlClass");
		EObject _localVariable_2 = targetMatch.getObject("feature");
		EObject _localVariable_3 = sourceMatch.getObject("classDec");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpUmlClass = _localVariable_1;
		EObject tmpFeature = _localVariable_2;
		EObject tmpClassDec = _localVariable_3;
		if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
			if (tmpUmlClass instanceof Interface) {
				Interface umlClass = (Interface) tmpUmlClass;
				if (tmpFeature instanceof Operation) {
					Operation feature = (Operation) tmpFeature;
					if (tmpClassDec instanceof AnnotationTypeDeclaration) {
						AnnotationTypeDeclaration classDec = (AnnotationTypeDeclaration) tmpClassDec;
						return new Object[] { bodyDeclaration, umlClass, feature, classDec, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_24_2_matchsrctrgcontext_blackBBBBBB(
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, Operation feature,
			AnnotationTypeDeclaration classDec, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { bodyDeclaration, umlClass, feature, classDec, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_OperationInAnnotationType_24_2_matchsrctrgcontext_binding = pattern_OperationInAnnotationType_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_OperationInAnnotationType_24_2_matchsrctrgcontext_binding != null) {
			MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) result_pattern_OperationInAnnotationType_24_2_matchsrctrgcontext_binding[0];
			Interface umlClass = (Interface) result_pattern_OperationInAnnotationType_24_2_matchsrctrgcontext_binding[1];
			Operation feature = (Operation) result_pattern_OperationInAnnotationType_24_2_matchsrctrgcontext_binding[2];
			AnnotationTypeDeclaration classDec = (AnnotationTypeDeclaration) result_pattern_OperationInAnnotationType_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_OperationInAnnotationType_24_2_matchsrctrgcontext_black = pattern_OperationInAnnotationType_24_2_matchsrctrgcontext_blackBBBBBB(
					bodyDeclaration, umlClass, feature, classDec, sourceMatch, targetMatch);
			if (result_pattern_OperationInAnnotationType_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { bodyDeclaration, umlClass, feature, classDec, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_24_3_solvecsp_bindingFBBBBBBB(
			OperationInAnnotationType _this, MAbstractMethodDefinition bodyDeclaration, Interface umlClass,
			Operation feature, AnnotationTypeDeclaration classDec, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(bodyDeclaration, umlClass, feature, classDec, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, bodyDeclaration, umlClass, feature, classDec, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInAnnotationType_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			OperationInAnnotationType _this, MAbstractMethodDefinition bodyDeclaration, Interface umlClass,
			Operation feature, AnnotationTypeDeclaration classDec, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_OperationInAnnotationType_24_3_solvecsp_binding = pattern_OperationInAnnotationType_24_3_solvecsp_bindingFBBBBBBB(
				_this, bodyDeclaration, umlClass, feature, classDec, sourceMatch, targetMatch);
		if (result_pattern_OperationInAnnotationType_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInAnnotationType_24_3_solvecsp_binding[0];

			Object[] result_pattern_OperationInAnnotationType_24_3_solvecsp_black = pattern_OperationInAnnotationType_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_OperationInAnnotationType_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, bodyDeclaration, umlClass, feature, classDec, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInAnnotationType_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_OperationInAnnotationType_24_5_matchcorrcontext_blackBBFBFBBB(
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, Operation feature,
			AnnotationTypeDeclaration classDec, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element bd2ne : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(bodyDeclaration, ASTNode2Element.class, "source")) {
				if (feature.equals(bd2ne.getTarget())) {
					for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(classDec, ASTNode2Element.class, "source")) {
						if (!bd2ne.equals(c2c)) {
							if (umlClass.equals(c2c.getTarget())) {
								_result.add(new Object[] { bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec,
										sourceMatch, targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_24_5_matchcorrcontext_greenBBBBF(
			ASTNode2Element bd2ne, ASTNode2Element c2c, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "OperationInAnnotationType";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(bd2ne);
		ccMatch.getAllContextElements().add(c2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { bd2ne, c2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_OperationInAnnotationType_24_6_createcorrespondence_blackBBBBB(
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, Operation feature,
			AnnotationTypeDeclaration classDec, CCMatch ccMatch) {
		return new Object[] { bodyDeclaration, umlClass, feature, classDec, ccMatch };
	}

	public static final Object[] pattern_OperationInAnnotationType_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_OperationInAnnotationType_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "OperationInAnnotationType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_OperationInAnnotationType_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_27_1_matchtggpattern_blackBB(
			MAbstractMethodDefinition bodyDeclaration, AnnotationTypeDeclaration classDec) {
		if (classDec.getBodyDeclarations().contains(bodyDeclaration)) {
			return new Object[] { bodyDeclaration, classDec };
		}
		return null;
	}

	public static final boolean pattern_OperationInAnnotationType_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OperationInAnnotationType_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_28_1_matchtggpattern_blackBB(Interface umlClass,
			Operation feature) {
		if (umlClass.getOwnedOperations().contains(feature)) {
			return new Object[] { umlClass, feature };
		}
		return null;
	}

	public static final boolean pattern_OperationInAnnotationType_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OperationInAnnotationType_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_29_1_createresult_blackB(
			OperationInAnnotationType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_OperationInAnnotationType_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_OperationInAnnotationType_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MAbstractMethodDefinition bodyDeclaration) {
		if (ruleResult.getSourceObjects().contains(bodyDeclaration)) {
			return new Object[] { ruleResult, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element bd2ne) {
		if (ruleResult.getCorrObjects().contains(bd2ne)) {
			return new Object[] { ruleResult, bd2ne };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Operation feature) {
		if (ruleResult.getTargetObjects().contains(feature)) {
			return new Object[] { ruleResult, feature };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Interface umlClass) {
		if (ruleResult.getTargetObjects().contains(umlClass)) {
			return new Object[] { ruleResult, umlClass };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element c2c) {
		if (ruleResult.getCorrObjects().contains(c2c)) {
			return new Object[] { ruleResult, c2c };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, AnnotationTypeDeclaration classDec) {
		if (ruleResult.getSourceObjects().contains(classDec)) {
			return new Object[] { ruleResult, classDec };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OperationInAnnotationType_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList bd2neList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList c2cList : ruleEntryContainer.getRuleEntryList()) {
				if (!bd2neList.equals(c2cList)) {
					for (EObject tmpBd2ne : bd2neList.getEntryObjects()) {
						if (tmpBd2ne instanceof ASTNode2Element) {
							ASTNode2Element bd2ne = (ASTNode2Element) tmpBd2ne;
							ASTNode tmpBodyDeclaration = bd2ne.getSource();
							if (tmpBodyDeclaration instanceof MAbstractMethodDefinition) {
								MAbstractMethodDefinition bodyDeclaration = (MAbstractMethodDefinition) tmpBodyDeclaration;
								Element tmpFeature = bd2ne.getTarget();
								if (tmpFeature instanceof Operation) {
									Operation feature = (Operation) tmpFeature;
									if (pattern_OperationInAnnotationType_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, bd2ne) == null) {
										if (pattern_OperationInAnnotationType_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, bodyDeclaration) == null) {
											if (pattern_OperationInAnnotationType_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, feature) == null) {
												for (EObject tmpC2c : c2cList.getEntryObjects()) {
													if (tmpC2c instanceof ASTNode2Element) {
														ASTNode2Element c2c = (ASTNode2Element) tmpC2c;
														if (!bd2ne.equals(c2c)) {
															Element tmpUmlClass = c2c.getTarget();
															if (tmpUmlClass instanceof Interface) {
																Interface umlClass = (Interface) tmpUmlClass;
																ASTNode tmpClassDec = c2c.getSource();
																if (tmpClassDec instanceof AnnotationTypeDeclaration) {
																	AnnotationTypeDeclaration classDec = (AnnotationTypeDeclaration) tmpClassDec;
																	if (pattern_OperationInAnnotationType_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, c2c) == null) {
																		if (pattern_OperationInAnnotationType_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, umlClass) == null) {
																			if (pattern_OperationInAnnotationType_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult, classDec) == null) {
																				_result.add(new Object[] { bd2neList,
																						bodyDeclaration, bd2ne, feature,
																						c2cList, umlClass, c2c,
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

	public static final Object[] pattern_OperationInAnnotationType_29_3_solveCSP_bindingFBBBBBBBBB(
			OperationInAnnotationType _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, ASTNode2Element bd2ne, Operation feature,
			ASTNode2Element c2c, AnnotationTypeDeclaration classDec, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, bodyDeclaration, umlClass, bd2ne,
				feature, c2c, classDec, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, umlClass, bd2ne, feature, c2c,
					classDec, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OperationInAnnotationType_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			OperationInAnnotationType _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, ASTNode2Element bd2ne, Operation feature,
			ASTNode2Element c2c, AnnotationTypeDeclaration classDec, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_OperationInAnnotationType_29_3_solveCSP_binding = pattern_OperationInAnnotationType_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec, ruleResult);
		if (result_pattern_OperationInAnnotationType_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OperationInAnnotationType_29_3_solveCSP_binding[0];

			Object[] result_pattern_OperationInAnnotationType_29_3_solveCSP_black = pattern_OperationInAnnotationType_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_OperationInAnnotationType_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, umlClass, bd2ne, feature, c2c,
						classDec, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_OperationInAnnotationType_29_4_checkCSP_expressionFBB(
			OperationInAnnotationType _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OperationInAnnotationType_29_5_checknacs_blackBBBBBB(
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, ASTNode2Element bd2ne, Operation feature,
			ASTNode2Element c2c, AnnotationTypeDeclaration classDec) {
		if (!bd2ne.equals(c2c)) {
			return new Object[] { bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_29_6_perform_blackBBBBBBB(
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, ASTNode2Element bd2ne, Operation feature,
			ASTNode2Element c2c, AnnotationTypeDeclaration classDec, ModelgeneratorRuleResult ruleResult) {
		if (!bd2ne.equals(c2c)) {
			return new Object[] { bodyDeclaration, umlClass, bd2ne, feature, c2c, classDec, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_OperationInAnnotationType_29_6_perform_greenBBBBB(
			MAbstractMethodDefinition bodyDeclaration, Interface umlClass, Operation feature,
			AnnotationTypeDeclaration classDec, ModelgeneratorRuleResult ruleResult) {
		umlClass.getOwnedOperations().add(feature);
		classDec.getBodyDeclarations().add(bodyDeclaration);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { bodyDeclaration, umlClass, feature, classDec, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_OperationInAnnotationType_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //OperationInAnnotationTypeImpl
