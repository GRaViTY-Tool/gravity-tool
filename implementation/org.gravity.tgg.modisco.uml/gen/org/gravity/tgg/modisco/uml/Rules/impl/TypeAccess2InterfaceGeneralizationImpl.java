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
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.RulesPackage;
import org.gravity.tgg.modisco.uml.Rules.TypeAccess2InterfaceGeneralization;

import org.gravity.tgg.modisco.uml.TypeAccess2Generalization;
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
 * An implementation of the model object '<em><b>Type Access2 Interface Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypeAccess2InterfaceGeneralizationImpl extends AbstractRuleImpl
		implements TypeAccess2InterfaceGeneralization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAccess2InterfaceGeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTypeAccess2InterfaceGeneralization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, InterfaceDeclaration classDec, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec) {

		Object[] result1_black = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_0_1_initialbindings_blackBBBBB(this, match, classDec,
						typeAcc, superInterfaceDec);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[classDec] = " + classDec + ", " + "[typeAcc] = " + typeAcc + ", "
					+ "[superInterfaceDec] = " + superInterfaceDec + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, classDec,
						typeAcc, superInterfaceDec);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[classDec] = " + classDec + ", " + "[typeAcc] = " + typeAcc + ", "
					+ "[superInterfaceDec] = " + superInterfaceDec + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_0_4_collectelementstobetranslated_blackBBBB(match,
							classDec, typeAcc, superInterfaceDec);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[classDec] = " + classDec + ", " + "[typeAcc] = " + typeAcc + ", " + "[superInterfaceDec] = "
						+ superInterfaceDec + ".");
			}
			TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_0_4_collectelementstobetranslated_greenBBBBFFF(match,
							classDec, typeAcc, superInterfaceDec);
			//nothing EMoflonEdge classDec__typeAcc____superInterfaces = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge typeAcc__superInterfaceDec____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result4_green[6];

			Object[] result5_black = TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_0_5_collectcontextelements_blackBBBB(match, classDec,
							typeAcc, superInterfaceDec);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[classDec] = " + classDec + ", " + "[typeAcc] = " + typeAcc + ", " + "[superInterfaceDec] = "
						+ superInterfaceDec + ".");
			}
			TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_0_5_collectcontextelements_greenBBB(match, classDec,
							superInterfaceDec);

			// 
			TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_0_6_registerobjectstomatch_expressionBBBBB(this, match,
							classDec, typeAcc, superInterfaceDec);
			return TypeAccess2InterfaceGeneralizationImpl.pattern_TypeAccess2InterfaceGeneralization_0_7_expressionF();
		} else {
			return TypeAccess2InterfaceGeneralizationImpl.pattern_TypeAccess2InterfaceGeneralization_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Interface childInterface = (Interface) result1_bindingAndBlack[0];
		ASTNode2Element cd2c2 = (ASTNode2Element) result1_bindingAndBlack[1];
		InterfaceDeclaration classDec = (InterfaceDeclaration) result1_bindingAndBlack[2];
		ASTNode2Element cd2c = (ASTNode2Element) result1_bindingAndBlack[3];
		TypeAccess typeAcc = (TypeAccess) result1_bindingAndBlack[4];
		InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result1_bindingAndBlack[5];
		Interface superInterface = (Interface) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_greenBFBFB(childInterface,
						typeAcc, superInterface);
		TypeAccess2Generalization ta2g = (TypeAccess2Generalization) result1_green[1];
		Generalization interfaceGeneralization = (Generalization) result1_green[3];

		Object[] result2_black = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_1_2_collecttranslatedelements_blackBBB(ta2g, typeAcc,
						interfaceGeneralization);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ta2g] = " + ta2g + ", "
					+ "[typeAcc] = " + typeAcc + ", " + "[interfaceGeneralization] = " + interfaceGeneralization + ".");
		}
		Object[] result2_green = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_1_2_collecttranslatedelements_greenFBBB(ta2g, typeAcc,
						interfaceGeneralization);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						childInterface, ta2g, cd2c2, classDec, cd2c, typeAcc, interfaceGeneralization,
						superInterfaceDec, superInterface);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[childInterface] = " + childInterface + ", " + "[ta2g] = " + ta2g + ", " + "[cd2c2] = "
					+ cd2c2 + ", " + "[classDec] = " + classDec + ", " + "[cd2c] = " + cd2c + ", " + "[typeAcc] = "
					+ typeAcc + ", " + "[interfaceGeneralization] = " + interfaceGeneralization + ", "
					+ "[superInterfaceDec] = " + superInterfaceDec + ", " + "[superInterface] = " + superInterface
					+ ".");
		}
		TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFF(ruleresult,
						childInterface, ta2g, classDec, typeAcc, interfaceGeneralization, superInterfaceDec,
						superInterface);
		//nothing EMoflonEdge childInterface__interfaceGeneralization____generalization = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge interfaceGeneralization__childInterface____specific = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge classDec__typeAcc____superInterfaces = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge ta2g__interfaceGeneralization____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge typeAcc__superInterfaceDec____type = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge ta2g__typeAcc____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge interfaceGeneralization__superInterface____general = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge childInterface__superInterface____general = (EMoflonEdge) result3_green[16];

		// 
		// 
		TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
						childInterface, ta2g, cd2c2, classDec, cd2c, typeAcc, interfaceGeneralization,
						superInterfaceDec, superInterface);
		return TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		InterfaceDeclaration classDec = (InterfaceDeclaration) result2_binding[0];
		TypeAccess typeAcc = (TypeAccess) result2_binding[1];
		InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_binding[2];
		for (Object[] result2_black : TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_2_2_corematch_blackFFBFBBFB(classDec, typeAcc,
						superInterfaceDec, match)) {
			Interface childInterface = (Interface) result2_black[0];
			ASTNode2Element cd2c2 = (ASTNode2Element) result2_black[1];
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[3];
			Interface superInterface = (Interface) result2_black[6];
			// ForEach 
			for (Object[] result3_black : TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_2_3_findcontext_blackBBBBBBB(childInterface, cd2c2,
							classDec, cd2c, typeAcc, superInterfaceDec, superInterface)) {
				Object[] result3_green = TypeAccess2InterfaceGeneralizationImpl
						.pattern_TypeAccess2InterfaceGeneralization_2_3_findcontext_greenBBBBBBBFFFFFFFF(childInterface,
								cd2c2, classDec, cd2c, typeAcc, superInterfaceDec, superInterface);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge classDec__typeAcc____superInterfaces = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge cd2c__childInterface____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge typeAcc__superInterfaceDec____type = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge cd2c__classDec____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge cd2c2__superInterface____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge cd2c2__superInterfaceDec____source = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = TypeAccess2InterfaceGeneralizationImpl
						.pattern_TypeAccess2InterfaceGeneralization_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, childInterface, cd2c2, classDec, cd2c, typeAcc, superInterfaceDec,
								superInterface);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[childInterface] = "
							+ childInterface + ", " + "[cd2c2] = " + cd2c2 + ", " + "[classDec] = " + classDec + ", "
							+ "[cd2c] = " + cd2c + ", " + "[typeAcc] = " + typeAcc + ", " + "[superInterfaceDec] = "
							+ superInterfaceDec + ", " + "[superInterface] = " + superInterface + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeAccess2InterfaceGeneralizationImpl
						.pattern_TypeAccess2InterfaceGeneralization_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeAccess2InterfaceGeneralizationImpl
							.pattern_TypeAccess2InterfaceGeneralization_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeAccess2InterfaceGeneralizationImpl
							.pattern_TypeAccess2InterfaceGeneralization_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, InterfaceDeclaration classDec, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec) {
		match.registerObject("classDec", classDec);
		match.registerObject("typeAcc", typeAcc);
		match.registerObject("superInterfaceDec", superInterfaceDec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, InterfaceDeclaration classDec, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Interface childInterface,
			ASTNode2Element cd2c2, InterfaceDeclaration classDec, ASTNode2Element cd2c, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec, Interface superInterface) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("childInterface", childInterface);
		isApplicableMatch.registerObject("cd2c2", cd2c2);
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("typeAcc", typeAcc);
		isApplicableMatch.registerObject("superInterfaceDec", superInterfaceDec);
		isApplicableMatch.registerObject("superInterface", superInterface);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject childInterface, EObject ta2g, EObject cd2c2,
			EObject classDec, EObject cd2c, EObject typeAcc, EObject interfaceGeneralization, EObject superInterfaceDec,
			EObject superInterface) {
		ruleresult.registerObject("childInterface", childInterface);
		ruleresult.registerObject("ta2g", ta2g);
		ruleresult.registerObject("cd2c2", cd2c2);
		ruleresult.registerObject("classDec", classDec);
		ruleresult.registerObject("cd2c", cd2c);
		ruleresult.registerObject("typeAcc", typeAcc);
		ruleresult.registerObject("interfaceGeneralization", interfaceGeneralization);
		ruleresult.registerObject("superInterfaceDec", superInterfaceDec);
		ruleresult.registerObject("superInterface", superInterface);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("typeAcc").eClass())
				.equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Interface childInterface, Generalization interfaceGeneralization,
			Interface superInterface) {

		Object[] result1_black = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_10_1_initialbindings_blackBBBBB(this, match, childInterface,
						interfaceGeneralization, superInterface);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[childInterface] = " + childInterface + ", " + "[interfaceGeneralization] = "
							+ interfaceGeneralization + ", " + "[superInterface] = " + superInterface + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
						childInterface, interfaceGeneralization, superInterface);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[childInterface] = " + childInterface + ", " + "[interfaceGeneralization] = "
							+ interfaceGeneralization + ", " + "[superInterface] = " + superInterface + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_10_4_collectelementstobetranslated_blackBBBB(match,
							childInterface, interfaceGeneralization, superInterface);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[childInterface] = " + childInterface + ", " + "[interfaceGeneralization] = "
						+ interfaceGeneralization + ", " + "[superInterface] = " + superInterface + ".");
			}
			TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_10_4_collectelementstobetranslated_greenBBBBFFFF(match,
							childInterface, interfaceGeneralization, superInterface);
			//nothing EMoflonEdge childInterface__interfaceGeneralization____generalization = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge interfaceGeneralization__childInterface____specific = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge interfaceGeneralization__superInterface____general = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge childInterface__superInterface____general = (EMoflonEdge) result4_green[7];

			Object[] result5_black = TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_10_5_collectcontextelements_blackBBBB(match,
							childInterface, interfaceGeneralization, superInterface);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[childInterface] = " + childInterface + ", " + "[interfaceGeneralization] = "
						+ interfaceGeneralization + ", " + "[superInterface] = " + superInterface + ".");
			}
			TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_10_5_collectcontextelements_greenBBB(match,
							childInterface, superInterface);

			// 
			TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							childInterface, interfaceGeneralization, superInterface);
			return TypeAccess2InterfaceGeneralizationImpl.pattern_TypeAccess2InterfaceGeneralization_10_7_expressionF();
		} else {
			return TypeAccess2InterfaceGeneralizationImpl.pattern_TypeAccess2InterfaceGeneralization_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Interface childInterface = (Interface) result1_bindingAndBlack[0];
		ASTNode2Element cd2c2 = (ASTNode2Element) result1_bindingAndBlack[1];
		InterfaceDeclaration classDec = (InterfaceDeclaration) result1_bindingAndBlack[2];
		ASTNode2Element cd2c = (ASTNode2Element) result1_bindingAndBlack[3];
		Generalization interfaceGeneralization = (Generalization) result1_bindingAndBlack[4];
		InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result1_bindingAndBlack[5];
		Interface superInterface = (Interface) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_greenFBFBB(classDec,
						interfaceGeneralization, superInterfaceDec);
		TypeAccess2Generalization ta2g = (TypeAccess2Generalization) result1_green[0];
		TypeAccess typeAcc = (TypeAccess) result1_green[2];

		Object[] result2_black = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_11_2_collecttranslatedelements_blackBBB(ta2g, typeAcc,
						interfaceGeneralization);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ta2g] = " + ta2g + ", "
					+ "[typeAcc] = " + typeAcc + ", " + "[interfaceGeneralization] = " + interfaceGeneralization + ".");
		}
		Object[] result2_green = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_11_2_collecttranslatedelements_greenFBBB(ta2g, typeAcc,
						interfaceGeneralization);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						childInterface, ta2g, cd2c2, classDec, cd2c, typeAcc, interfaceGeneralization,
						superInterfaceDec, superInterface);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[childInterface] = " + childInterface + ", " + "[ta2g] = " + ta2g + ", " + "[cd2c2] = "
					+ cd2c2 + ", " + "[classDec] = " + classDec + ", " + "[cd2c] = " + cd2c + ", " + "[typeAcc] = "
					+ typeAcc + ", " + "[interfaceGeneralization] = " + interfaceGeneralization + ", "
					+ "[superInterfaceDec] = " + superInterfaceDec + ", " + "[superInterface] = " + superInterface
					+ ".");
		}
		TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFF(ruleresult,
						childInterface, ta2g, classDec, typeAcc, interfaceGeneralization, superInterfaceDec,
						superInterface);
		//nothing EMoflonEdge childInterface__interfaceGeneralization____generalization = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge interfaceGeneralization__childInterface____specific = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge classDec__typeAcc____superInterfaces = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge ta2g__interfaceGeneralization____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge typeAcc__superInterfaceDec____type = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge ta2g__typeAcc____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge interfaceGeneralization__superInterface____general = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge childInterface__superInterface____general = (EMoflonEdge) result3_green[16];

		// 
		// 
		TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
						childInterface, ta2g, cd2c2, classDec, cd2c, typeAcc, interfaceGeneralization,
						superInterfaceDec, superInterface);
		return TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Interface childInterface = (Interface) result2_binding[0];
		Generalization interfaceGeneralization = (Generalization) result2_binding[1];
		Interface superInterface = (Interface) result2_binding[2];
		for (Object[] result2_black : TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_12_2_corematch_blackBFFFBFBB(childInterface,
						interfaceGeneralization, superInterface, match)) {
			ASTNode2Element cd2c2 = (ASTNode2Element) result2_black[1];
			InterfaceDeclaration classDec = (InterfaceDeclaration) result2_black[2];
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[3];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_black[5];
			// ForEach 
			for (Object[] result3_black : TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_12_3_findcontext_blackBBBBBBB(childInterface, cd2c2,
							classDec, cd2c, interfaceGeneralization, superInterfaceDec, superInterface)) {
				Object[] result3_green = TypeAccess2InterfaceGeneralizationImpl
						.pattern_TypeAccess2InterfaceGeneralization_12_3_findcontext_greenBBBBBBBFFFFFFFFF(
								childInterface, cd2c2, classDec, cd2c, interfaceGeneralization, superInterfaceDec,
								superInterface);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge childInterface__interfaceGeneralization____generalization = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge interfaceGeneralization__childInterface____specific = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge cd2c__childInterface____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge cd2c__classDec____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge cd2c2__superInterface____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge cd2c2__superInterfaceDec____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge interfaceGeneralization__superInterface____general = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge childInterface__superInterface____general = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = TypeAccess2InterfaceGeneralizationImpl
						.pattern_TypeAccess2InterfaceGeneralization_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, childInterface, cd2c2, classDec, cd2c, interfaceGeneralization,
								superInterfaceDec, superInterface);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[childInterface] = "
							+ childInterface + ", " + "[cd2c2] = " + cd2c2 + ", " + "[classDec] = " + classDec + ", "
							+ "[cd2c] = " + cd2c + ", " + "[interfaceGeneralization] = " + interfaceGeneralization
							+ ", " + "[superInterfaceDec] = " + superInterfaceDec + ", " + "[superInterface] = "
							+ superInterface + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeAccess2InterfaceGeneralizationImpl
						.pattern_TypeAccess2InterfaceGeneralization_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeAccess2InterfaceGeneralizationImpl
							.pattern_TypeAccess2InterfaceGeneralization_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeAccess2InterfaceGeneralizationImpl
							.pattern_TypeAccess2InterfaceGeneralization_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Interface childInterface,
			Generalization interfaceGeneralization, Interface superInterface) {
		match.registerObject("childInterface", childInterface);
		match.registerObject("interfaceGeneralization", interfaceGeneralization);
		match.registerObject("superInterface", superInterface);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Interface childInterface, Generalization interfaceGeneralization,
			Interface superInterface) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Interface childInterface,
			ASTNode2Element cd2c2, InterfaceDeclaration classDec, ASTNode2Element cd2c,
			Generalization interfaceGeneralization, InterfaceDeclaration superInterfaceDec, Interface superInterface) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("childInterface", childInterface);
		isApplicableMatch.registerObject("cd2c2", cd2c2);
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("interfaceGeneralization", interfaceGeneralization);
		isApplicableMatch.registerObject("superInterfaceDec", superInterfaceDec);
		isApplicableMatch.registerObject("superInterface", superInterface);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject childInterface, EObject ta2g, EObject cd2c2,
			EObject classDec, EObject cd2c, EObject typeAcc, EObject interfaceGeneralization, EObject superInterfaceDec,
			EObject superInterface) {
		ruleresult.registerObject("childInterface", childInterface);
		ruleresult.registerObject("ta2g", ta2g);
		ruleresult.registerObject("cd2c2", cd2c2);
		ruleresult.registerObject("classDec", classDec);
		ruleresult.registerObject("cd2c", cd2c);
		ruleresult.registerObject("typeAcc", typeAcc);
		ruleresult.registerObject("interfaceGeneralization", interfaceGeneralization);
		ruleresult.registerObject("superInterfaceDec", superInterfaceDec);
		ruleresult.registerObject("superInterface", superInterface);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("interfaceGeneralization").eClass())
				.equals("uml.Generalization.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_99(EMoflonEdge _edge_generalization) {

		Object[] result1_bindingAndBlack = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_20_2_testcorematchandDECs_blackFFFB(_edge_generalization)) {
			Interface childInterface = (Interface) result2_black[0];
			Generalization interfaceGeneralization = (Generalization) result2_black[1];
			Interface superInterface = (Interface) result2_black[2];
			Object[] result2_green = TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, childInterface, interfaceGeneralization, superInterface)) {
				// 
				if (TypeAccess2InterfaceGeneralizationImpl
						.pattern_TypeAccess2InterfaceGeneralization_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeAccess2InterfaceGeneralizationImpl
							.pattern_TypeAccess2InterfaceGeneralization_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeAccess2InterfaceGeneralizationImpl
							.pattern_TypeAccess2InterfaceGeneralization_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_106(EMoflonEdge _edge_superInterfaces) {

		Object[] result1_bindingAndBlack = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_blackFFFB(
						_edge_superInterfaces)) {
			InterfaceDeclaration classDec = (InterfaceDeclaration) result2_black[0];
			TypeAccess typeAcc = (TypeAccess) result2_black[1];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_black[2];
			Object[] result2_green = TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, classDec, typeAcc, superInterfaceDec)) {
				// 
				if (TypeAccess2InterfaceGeneralizationImpl
						.pattern_TypeAccess2InterfaceGeneralization_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeAccess2InterfaceGeneralizationImpl
							.pattern_TypeAccess2InterfaceGeneralization_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeAccess2InterfaceGeneralizationImpl
							.pattern_TypeAccess2InterfaceGeneralization_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TypeAccess2InterfaceGeneralization");
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
		ruleResult.setRule("TypeAccess2InterfaceGeneralization");
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

		Object[] result1_black = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Interface childInterface = (Interface) result2_bindingAndBlack[0];
		InterfaceDeclaration classDec = (InterfaceDeclaration) result2_bindingAndBlack[1];
		TypeAccess typeAcc = (TypeAccess) result2_bindingAndBlack[2];
		Generalization interfaceGeneralization = (Generalization) result2_bindingAndBlack[3];
		InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_bindingAndBlack[4];
		Interface superInterface = (Interface) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this,
						childInterface, classDec, typeAcc, interfaceGeneralization, superInterfaceDec, superInterface,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[childInterface] = " + childInterface + ", " + "[classDec] = " + classDec + ", " + "[typeAcc] = "
					+ typeAcc + ", " + "[interfaceGeneralization] = " + interfaceGeneralization + ", "
					+ "[superInterfaceDec] = " + superInterfaceDec + ", " + "[superInterface] = " + superInterface
					+ ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_24_5_matchcorrcontext_blackBFBFBBBB(childInterface,
							classDec, superInterfaceDec, superInterface, sourceMatch, targetMatch)) {
				ASTNode2Element cd2c2 = (ASTNode2Element) result5_black[1];
				ASTNode2Element cd2c = (ASTNode2Element) result5_black[3];
				Object[] result5_green = TypeAccess2InterfaceGeneralizationImpl
						.pattern_TypeAccess2InterfaceGeneralization_24_5_matchcorrcontext_greenBBBBF(cd2c2, cd2c,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = TypeAccess2InterfaceGeneralizationImpl
						.pattern_TypeAccess2InterfaceGeneralization_24_6_createcorrespondence_blackBBBBBBB(
								childInterface, classDec, typeAcc, interfaceGeneralization, superInterfaceDec,
								superInterface, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[childInterface] = "
							+ childInterface + ", " + "[classDec] = " + classDec + ", " + "[typeAcc] = " + typeAcc
							+ ", " + "[interfaceGeneralization] = " + interfaceGeneralization + ", "
							+ "[superInterfaceDec] = " + superInterfaceDec + ", " + "[superInterface] = "
							+ superInterface + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeAccess2InterfaceGeneralizationImpl
						.pattern_TypeAccess2InterfaceGeneralization_24_6_createcorrespondence_greenFBBB(typeAcc,
								interfaceGeneralization, ccMatch);
				//nothing TypeAccess2Generalization ta2g = (TypeAccess2Generalization) result6_green[0];

				Object[] result7_black = TypeAccess2InterfaceGeneralizationImpl
						.pattern_TypeAccess2InterfaceGeneralization_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeAccess2InterfaceGeneralizationImpl
						.pattern_TypeAccess2InterfaceGeneralization_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Interface childInterface, InterfaceDeclaration classDec, TypeAccess typeAcc,
			Generalization interfaceGeneralization, InterfaceDeclaration superInterfaceDec, Interface superInterface,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(InterfaceDeclaration classDec, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec) {// 
		Object[] result1_black = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_27_1_matchtggpattern_blackBBB(classDec, typeAcc,
						superInterfaceDec);
		if (result1_black != null) {
			return TypeAccess2InterfaceGeneralizationImpl.pattern_TypeAccess2InterfaceGeneralization_27_2_expressionF();
		} else {
			return TypeAccess2InterfaceGeneralizationImpl.pattern_TypeAccess2InterfaceGeneralization_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Interface childInterface, Generalization interfaceGeneralization,
			Interface superInterface) {// 
		Object[] result1_black = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_28_1_matchtggpattern_blackBBB(childInterface,
						interfaceGeneralization, superInterface);
		if (result1_black != null) {
			return TypeAccess2InterfaceGeneralizationImpl.pattern_TypeAccess2InterfaceGeneralization_28_2_expressionF();
		} else {
			return TypeAccess2InterfaceGeneralizationImpl.pattern_TypeAccess2InterfaceGeneralization_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element cd2cParameter,
			ASTNode2Element cd2c2Parameter) {

		Object[] result1_black = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList cd2cList = (RuleEntryList) result2_black[0];
			Interface childInterface = (Interface) result2_black[1];
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[2];
			InterfaceDeclaration classDec = (InterfaceDeclaration) result2_black[3];
			//nothing RuleEntryList cd2c2List = (RuleEntryList) result2_black[4];
			ASTNode2Element cd2c2 = (ASTNode2Element) result2_black[5];
			Interface superInterface = (Interface) result2_black[6];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_black[7];

			Object[] result3_bindingAndBlack = TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, childInterface, cd2c2, classDec, cd2c, superInterfaceDec, superInterface,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[childInterface] = " + childInterface
						+ ", " + "[cd2c2] = " + cd2c2 + ", " + "[classDec] = " + classDec + ", " + "[cd2c] = " + cd2c
						+ ", " + "[superInterfaceDec] = " + superInterfaceDec + ", " + "[superInterface] = "
						+ superInterface + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypeAccess2InterfaceGeneralizationImpl
					.pattern_TypeAccess2InterfaceGeneralization_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = TypeAccess2InterfaceGeneralizationImpl
						.pattern_TypeAccess2InterfaceGeneralization_29_5_checknacs_blackBBBBBB(childInterface, cd2c2,
								classDec, cd2c, superInterfaceDec, superInterface);
				if (result5_black != null) {

					Object[] result6_black = TypeAccess2InterfaceGeneralizationImpl
							.pattern_TypeAccess2InterfaceGeneralization_29_6_perform_blackBBBBBBB(childInterface, cd2c2,
									classDec, cd2c, superInterfaceDec, superInterface, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[childInterface] = "
								+ childInterface + ", " + "[cd2c2] = " + cd2c2 + ", " + "[classDec] = " + classDec
								+ ", " + "[cd2c] = " + cd2c + ", " + "[superInterfaceDec] = " + superInterfaceDec + ", "
								+ "[superInterface] = " + superInterface + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					TypeAccess2InterfaceGeneralizationImpl
							.pattern_TypeAccess2InterfaceGeneralization_29_6_perform_greenBFBFFBBB(childInterface,
									classDec, superInterfaceDec, superInterface, ruleResult);
					//nothing TypeAccess2Generalization ta2g = (TypeAccess2Generalization) result6_green[1];
					//nothing TypeAccess typeAcc = (TypeAccess) result6_green[3];
					//nothing Generalization interfaceGeneralization = (Generalization) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return TypeAccess2InterfaceGeneralizationImpl
				.pattern_TypeAccess2InterfaceGeneralization_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Interface childInterface,
			ASTNode2Element cd2c2, InterfaceDeclaration classDec, ASTNode2Element cd2c,
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("childInterface", childInterface);
		isApplicableMatch.registerObject("cd2c2", cd2c2);
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("superInterfaceDec", superInterfaceDec);
		isApplicableMatch.registerObject("superInterface", superInterface);
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
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___IS_APPROPRIATE_FWD__MATCH_INTERFACEDECLARATION_TYPEACCESS_INTERFACEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_INTERFACEDECLARATION_TYPEACCESS_INTERFACEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
			return null;
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_INTERFACEDECLARATION_TYPEACCESS_INTERFACEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERFACE_ASTNODE2ELEMENT_INTERFACEDECLARATION_ASTNODE2ELEMENT_TYPEACCESS_INTERFACEDECLARATION_INTERFACE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Interface) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (InterfaceDeclaration) arguments.get(3),
					(ASTNode2Element) arguments.get(4), (TypeAccess) arguments.get(5),
					(InterfaceDeclaration) arguments.get(6), (Interface) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___IS_APPROPRIATE_BWD__MATCH_INTERFACE_GENERALIZATION_INTERFACE:
			return isAppropriate_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
					(Generalization) arguments.get(2), (Interface) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERFACE_GENERALIZATION_INTERFACE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
					(Generalization) arguments.get(2), (Interface) arguments.get(3));
			return null;
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERFACE_GENERALIZATION_INTERFACE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
					(Generalization) arguments.get(2), (Interface) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERFACE_ASTNODE2ELEMENT_INTERFACEDECLARATION_ASTNODE2ELEMENT_GENERALIZATION_INTERFACEDECLARATION_INTERFACE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Interface) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (InterfaceDeclaration) arguments.get(3),
					(ASTNode2Element) arguments.get(4), (Generalization) arguments.get(5),
					(InterfaceDeclaration) arguments.get(6), (Interface) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_99__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_99((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_106__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_106((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___IS_APPLICABLE_SOLVE_CSP_CC__INTERFACE_INTERFACEDECLARATION_TYPEACCESS_GENERALIZATION_INTERFACEDECLARATION_INTERFACE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Interface) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (Generalization) arguments.get(3),
					(InterfaceDeclaration) arguments.get(4), (Interface) arguments.get(5), (Match) arguments.get(6),
					(Match) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___CHECK_DEC_FWD__INTERFACEDECLARATION_TYPEACCESS_INTERFACEDECLARATION:
			return checkDEC_FWD((InterfaceDeclaration) arguments.get(0), (TypeAccess) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___CHECK_DEC_BWD__INTERFACE_GENERALIZATION_INTERFACE:
			return checkDEC_BWD((Interface) arguments.get(0), (Generalization) arguments.get(1),
					(Interface) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERFACE_ASTNODE2ELEMENT_INTERFACEDECLARATION_ASTNODE2ELEMENT_INTERFACEDECLARATION_INTERFACE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Interface) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (InterfaceDeclaration) arguments.get(3),
					(ASTNode2Element) arguments.get(4), (InterfaceDeclaration) arguments.get(5),
					(Interface) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_GENERALIZATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_0_1_initialbindings_blackBBBBB(
			TypeAccess2InterfaceGeneralization _this, Match match, InterfaceDeclaration classDec, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec) {
		if (!classDec.equals(superInterfaceDec)) {
			return new Object[] { _this, match, classDec, typeAcc, superInterfaceDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_0_2_SolveCSP_bindingFBBBBB(
			TypeAccess2InterfaceGeneralization _this, Match match, InterfaceDeclaration classDec, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, classDec, typeAcc, superInterfaceDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, classDec, typeAcc, superInterfaceDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_0_2_SolveCSP_bindingAndBlackFBBBBB(
			TypeAccess2InterfaceGeneralization _this, Match match, InterfaceDeclaration classDec, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec) {
		Object[] result_pattern_TypeAccess2InterfaceGeneralization_0_2_SolveCSP_binding = pattern_TypeAccess2InterfaceGeneralization_0_2_SolveCSP_bindingFBBBBB(
				_this, match, classDec, typeAcc, superInterfaceDec);
		if (result_pattern_TypeAccess2InterfaceGeneralization_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceGeneralization_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceGeneralization_0_2_SolveCSP_black = pattern_TypeAccess2InterfaceGeneralization_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceGeneralization_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, classDec, typeAcc, superInterfaceDec };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_0_3_CheckCSP_expressionFBB(
			TypeAccess2InterfaceGeneralization _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_0_4_collectelementstobetranslated_blackBBBB(
			Match match, InterfaceDeclaration classDec, TypeAccess typeAcc, InterfaceDeclaration superInterfaceDec) {
		if (!classDec.equals(superInterfaceDec)) {
			return new Object[] { match, classDec, typeAcc, superInterfaceDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, InterfaceDeclaration classDec, TypeAccess typeAcc, InterfaceDeclaration superInterfaceDec) {
		EMoflonEdge classDec__typeAcc____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAcc__superInterfaceDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(typeAcc);
		String classDec__typeAcc____superInterfaces_name_prime = "superInterfaces";
		String typeAcc__superInterfaceDec____type_name_prime = "type";
		String superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		classDec__typeAcc____superInterfaces.setSrc(classDec);
		classDec__typeAcc____superInterfaces.setTrg(typeAcc);
		match.getToBeTranslatedEdges().add(classDec__typeAcc____superInterfaces);
		typeAcc__superInterfaceDec____type.setSrc(typeAcc);
		typeAcc__superInterfaceDec____type.setTrg(superInterfaceDec);
		match.getToBeTranslatedEdges().add(typeAcc__superInterfaceDec____type);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setSrc(superInterfaceDec);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		match.getToBeTranslatedEdges().add(superInterfaceDec__typeAcc____usagesInTypeAccess);
		classDec__typeAcc____superInterfaces.setName(classDec__typeAcc____superInterfaces_name_prime);
		typeAcc__superInterfaceDec____type.setName(typeAcc__superInterfaceDec____type_name_prime);
		superInterfaceDec__typeAcc____usagesInTypeAccess
				.setName(superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime);
		return new Object[] { match, classDec, typeAcc, superInterfaceDec, classDec__typeAcc____superInterfaces,
				typeAcc__superInterfaceDec____type, superInterfaceDec__typeAcc____usagesInTypeAccess };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_0_5_collectcontextelements_blackBBBB(
			Match match, InterfaceDeclaration classDec, TypeAccess typeAcc, InterfaceDeclaration superInterfaceDec) {
		if (!classDec.equals(superInterfaceDec)) {
			return new Object[] { match, classDec, typeAcc, superInterfaceDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_0_5_collectcontextelements_greenBBB(
			Match match, InterfaceDeclaration classDec, InterfaceDeclaration superInterfaceDec) {
		match.getContextNodes().add(classDec);
		match.getContextNodes().add(superInterfaceDec);
		return new Object[] { match, classDec, superInterfaceDec };
	}

	public static final void pattern_TypeAccess2InterfaceGeneralization_0_6_registerobjectstomatch_expressionBBBBB(
			TypeAccess2InterfaceGeneralization _this, Match match, InterfaceDeclaration classDec, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec) {
		_this.registerObjectsToMatch_FWD(match, classDec, typeAcc, superInterfaceDec);

	}

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("childInterface");
		EObject _localVariable_1 = isApplicableMatch.getObject("cd2c2");
		EObject _localVariable_2 = isApplicableMatch.getObject("classDec");
		EObject _localVariable_3 = isApplicableMatch.getObject("cd2c");
		EObject _localVariable_4 = isApplicableMatch.getObject("typeAcc");
		EObject _localVariable_5 = isApplicableMatch.getObject("superInterfaceDec");
		EObject _localVariable_6 = isApplicableMatch.getObject("superInterface");
		EObject tmpChildInterface = _localVariable_0;
		EObject tmpCd2c2 = _localVariable_1;
		EObject tmpClassDec = _localVariable_2;
		EObject tmpCd2c = _localVariable_3;
		EObject tmpTypeAcc = _localVariable_4;
		EObject tmpSuperInterfaceDec = _localVariable_5;
		EObject tmpSuperInterface = _localVariable_6;
		if (tmpChildInterface instanceof Interface) {
			Interface childInterface = (Interface) tmpChildInterface;
			if (tmpCd2c2 instanceof ASTNode2Element) {
				ASTNode2Element cd2c2 = (ASTNode2Element) tmpCd2c2;
				if (tmpClassDec instanceof InterfaceDeclaration) {
					InterfaceDeclaration classDec = (InterfaceDeclaration) tmpClassDec;
					if (tmpCd2c instanceof ASTNode2Element) {
						ASTNode2Element cd2c = (ASTNode2Element) tmpCd2c;
						if (tmpTypeAcc instanceof TypeAccess) {
							TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
							if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
								InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
								if (tmpSuperInterface instanceof Interface) {
									Interface superInterface = (Interface) tmpSuperInterface;
									return new Object[] { childInterface, cd2c2, classDec, cd2c, typeAcc,
											superInterfaceDec, superInterface, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_blackBBBBBBBFBB(
			Interface childInterface, ASTNode2Element cd2c2, InterfaceDeclaration classDec, ASTNode2Element cd2c,
			TypeAccess typeAcc, InterfaceDeclaration superInterfaceDec, Interface superInterface,
			TypeAccess2InterfaceGeneralization _this, IsApplicableMatch isApplicableMatch) {
		if (!childInterface.equals(superInterface)) {
			if (!classDec.equals(superInterfaceDec)) {
				if (!cd2c.equals(cd2c2)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { childInterface, cd2c2, classDec, cd2c, typeAcc, superInterfaceDec,
									superInterface, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			TypeAccess2InterfaceGeneralization _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_binding = pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_binding != null) {
			Interface childInterface = (Interface) result_pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_binding[0];
			ASTNode2Element cd2c2 = (ASTNode2Element) result_pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_binding[1];
			InterfaceDeclaration classDec = (InterfaceDeclaration) result_pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_binding[2];
			ASTNode2Element cd2c = (ASTNode2Element) result_pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_binding[3];
			TypeAccess typeAcc = (TypeAccess) result_pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_binding[4];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result_pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_binding[5];
			Interface superInterface = (Interface) result_pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_binding[6];

			Object[] result_pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_black = pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_blackBBBBBBBFBB(
					childInterface, cd2c2, classDec, cd2c, typeAcc, superInterfaceDec, superInterface, _this,
					isApplicableMatch);
			if (result_pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_black[7];

				return new Object[] { childInterface, cd2c2, classDec, cd2c, typeAcc, superInterfaceDec, superInterface,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_1_1_performtransformation_greenBFBFB(
			Interface childInterface, TypeAccess typeAcc, Interface superInterface) {
		TypeAccess2Generalization ta2g = UmlFactory.eINSTANCE.createTypeAccess2Generalization();
		Generalization interfaceGeneralization = UMLFactory.eINSTANCE.createGeneralization();
		childInterface.getGenerals().add(superInterface);
		ta2g.setSource(typeAcc);
		childInterface.getGeneralizations().add(interfaceGeneralization);
		ta2g.setTarget(interfaceGeneralization);
		interfaceGeneralization.setGeneral(superInterface);
		return new Object[] { childInterface, ta2g, typeAcc, interfaceGeneralization, superInterface };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_1_2_collecttranslatedelements_blackBBB(
			TypeAccess2Generalization ta2g, TypeAccess typeAcc, Generalization interfaceGeneralization) {
		return new Object[] { ta2g, typeAcc, interfaceGeneralization };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_1_2_collecttranslatedelements_greenFBBB(
			TypeAccess2Generalization ta2g, TypeAccess typeAcc, Generalization interfaceGeneralization) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(ta2g);
		ruleresult.getTranslatedElements().add(typeAcc);
		ruleresult.getCreatedElements().add(interfaceGeneralization);
		return new Object[] { ruleresult, ta2g, typeAcc, interfaceGeneralization };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject childInterface, EObject ta2g, EObject cd2c2, EObject classDec,
			EObject cd2c, EObject typeAcc, EObject interfaceGeneralization, EObject superInterfaceDec,
			EObject superInterface) {
		if (!childInterface.equals(ta2g)) {
			if (!childInterface.equals(classDec)) {
				if (!childInterface.equals(typeAcc)) {
					if (!childInterface.equals(interfaceGeneralization)) {
						if (!childInterface.equals(superInterfaceDec)) {
							if (!childInterface.equals(superInterface)) {
								if (!ta2g.equals(typeAcc)) {
									if (!cd2c2.equals(childInterface)) {
										if (!cd2c2.equals(ta2g)) {
											if (!cd2c2.equals(classDec)) {
												if (!cd2c2.equals(typeAcc)) {
													if (!cd2c2.equals(interfaceGeneralization)) {
														if (!cd2c2.equals(superInterfaceDec)) {
															if (!cd2c2.equals(superInterface)) {
																if (!classDec.equals(ta2g)) {
																	if (!classDec.equals(typeAcc)) {
																		if (!classDec.equals(interfaceGeneralization)) {
																			if (!classDec.equals(superInterfaceDec)) {
																				if (!classDec.equals(superInterface)) {
																					if (!cd2c.equals(childInterface)) {
																						if (!cd2c.equals(ta2g)) {
																							if (!cd2c.equals(cd2c2)) {
																								if (!cd2c.equals(
																										classDec)) {
																									if (!cd2c.equals(
																											typeAcc)) {
																										if (!cd2c
																												.equals(interfaceGeneralization)) {
																											if (!cd2c
																													.equals(superInterfaceDec)) {
																												if (!cd2c
																														.equals(superInterface)) {
																													if (!interfaceGeneralization
																															.equals(ta2g)) {
																														if (!interfaceGeneralization
																																.equals(typeAcc)) {
																															if (!interfaceGeneralization
																																	.equals(superInterfaceDec)) {
																																if (!interfaceGeneralization
																																		.equals(superInterface)) {
																																	if (!superInterfaceDec
																																			.equals(ta2g)) {
																																		if (!superInterfaceDec
																																				.equals(typeAcc)) {
																																			if (!superInterface
																																					.equals(ta2g)) {
																																				if (!superInterface
																																						.equals(typeAcc)) {
																																					if (!superInterface
																																							.equals(superInterfaceDec)) {
																																						return new Object[] {
																																								ruleresult,
																																								childInterface,
																																								ta2g,
																																								cd2c2,
																																								classDec,
																																								cd2c,
																																								typeAcc,
																																								interfaceGeneralization,
																																								superInterfaceDec,
																																								superInterface };
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

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject childInterface, EObject ta2g, EObject classDec, EObject typeAcc,
			EObject interfaceGeneralization, EObject superInterfaceDec, EObject superInterface) {
		EMoflonEdge childInterface__interfaceGeneralization____generalization = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interfaceGeneralization__childInterface____specific = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__typeAcc____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__interfaceGeneralization____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAcc__superInterfaceDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__typeAcc____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge interfaceGeneralization__superInterface____general = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge childInterface__superInterface____general = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccess2InterfaceGeneralization";
		String childInterface__interfaceGeneralization____generalization_name_prime = "generalization";
		String interfaceGeneralization__childInterface____specific_name_prime = "specific";
		String classDec__typeAcc____superInterfaces_name_prime = "superInterfaces";
		String ta2g__interfaceGeneralization____target_name_prime = "target";
		String typeAcc__superInterfaceDec____type_name_prime = "type";
		String superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String ta2g__typeAcc____source_name_prime = "source";
		String interfaceGeneralization__superInterface____general_name_prime = "general";
		String childInterface__superInterface____general_name_prime = "general";
		childInterface__interfaceGeneralization____generalization.setSrc(childInterface);
		childInterface__interfaceGeneralization____generalization.setTrg(interfaceGeneralization);
		ruleresult.getCreatedEdges().add(childInterface__interfaceGeneralization____generalization);
		interfaceGeneralization__childInterface____specific.setSrc(interfaceGeneralization);
		interfaceGeneralization__childInterface____specific.setTrg(childInterface);
		ruleresult.getCreatedEdges().add(interfaceGeneralization__childInterface____specific);
		classDec__typeAcc____superInterfaces.setSrc(classDec);
		classDec__typeAcc____superInterfaces.setTrg(typeAcc);
		ruleresult.getTranslatedEdges().add(classDec__typeAcc____superInterfaces);
		ta2g__interfaceGeneralization____target.setSrc(ta2g);
		ta2g__interfaceGeneralization____target.setTrg(interfaceGeneralization);
		ruleresult.getCreatedEdges().add(ta2g__interfaceGeneralization____target);
		typeAcc__superInterfaceDec____type.setSrc(typeAcc);
		typeAcc__superInterfaceDec____type.setTrg(superInterfaceDec);
		ruleresult.getTranslatedEdges().add(typeAcc__superInterfaceDec____type);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setSrc(superInterfaceDec);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		ruleresult.getTranslatedEdges().add(superInterfaceDec__typeAcc____usagesInTypeAccess);
		ta2g__typeAcc____source.setSrc(ta2g);
		ta2g__typeAcc____source.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(ta2g__typeAcc____source);
		interfaceGeneralization__superInterface____general.setSrc(interfaceGeneralization);
		interfaceGeneralization__superInterface____general.setTrg(superInterface);
		ruleresult.getCreatedEdges().add(interfaceGeneralization__superInterface____general);
		childInterface__superInterface____general.setSrc(childInterface);
		childInterface__superInterface____general.setTrg(superInterface);
		ruleresult.getCreatedEdges().add(childInterface__superInterface____general);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		childInterface__interfaceGeneralization____generalization
				.setName(childInterface__interfaceGeneralization____generalization_name_prime);
		interfaceGeneralization__childInterface____specific
				.setName(interfaceGeneralization__childInterface____specific_name_prime);
		classDec__typeAcc____superInterfaces.setName(classDec__typeAcc____superInterfaces_name_prime);
		ta2g__interfaceGeneralization____target.setName(ta2g__interfaceGeneralization____target_name_prime);
		typeAcc__superInterfaceDec____type.setName(typeAcc__superInterfaceDec____type_name_prime);
		superInterfaceDec__typeAcc____usagesInTypeAccess
				.setName(superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime);
		ta2g__typeAcc____source.setName(ta2g__typeAcc____source_name_prime);
		interfaceGeneralization__superInterface____general
				.setName(interfaceGeneralization__superInterface____general_name_prime);
		childInterface__superInterface____general.setName(childInterface__superInterface____general_name_prime);
		return new Object[] { ruleresult, childInterface, ta2g, classDec, typeAcc, interfaceGeneralization,
				superInterfaceDec, superInterface, childInterface__interfaceGeneralization____generalization,
				interfaceGeneralization__childInterface____specific, classDec__typeAcc____superInterfaces,
				ta2g__interfaceGeneralization____target, typeAcc__superInterfaceDec____type,
				superInterfaceDec__typeAcc____usagesInTypeAccess, ta2g__typeAcc____source,
				interfaceGeneralization__superInterface____general, childInterface__superInterface____general };
	}

	public static final void pattern_TypeAccess2InterfaceGeneralization_1_5_registerobjects_expressionBBBBBBBBBBB(
			TypeAccess2InterfaceGeneralization _this, PerformRuleResult ruleresult, EObject childInterface,
			EObject ta2g, EObject cd2c2, EObject classDec, EObject cd2c, EObject typeAcc,
			EObject interfaceGeneralization, EObject superInterfaceDec, EObject superInterface) {
		_this.registerObjects_FWD(ruleresult, childInterface, ta2g, cd2c2, classDec, cd2c, typeAcc,
				interfaceGeneralization, superInterfaceDec, superInterface);

	}

	public static final PerformRuleResult pattern_TypeAccess2InterfaceGeneralization_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_2_1_preparereturnvalue_bindingFB(
			TypeAccess2InterfaceGeneralization _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_2_1_preparereturnvalue_blackFBB(
			EClass eClass, TypeAccess2InterfaceGeneralization _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_2_1_preparereturnvalue_bindingAndBlackFFB(
			TypeAccess2InterfaceGeneralization _this) {
		Object[] result_pattern_TypeAccess2InterfaceGeneralization_2_1_preparereturnvalue_binding = pattern_TypeAccess2InterfaceGeneralization_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2InterfaceGeneralization_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeAccess2InterfaceGeneralization_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceGeneralization_2_1_preparereturnvalue_black = pattern_TypeAccess2InterfaceGeneralization_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeAccess2InterfaceGeneralization_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeAccess2InterfaceGeneralization_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeAccess2InterfaceGeneralization";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("classDec");
		EObject _localVariable_1 = match.getObject("typeAcc");
		EObject _localVariable_2 = match.getObject("superInterfaceDec");
		EObject tmpClassDec = _localVariable_0;
		EObject tmpTypeAcc = _localVariable_1;
		EObject tmpSuperInterfaceDec = _localVariable_2;
		if (tmpClassDec instanceof InterfaceDeclaration) {
			InterfaceDeclaration classDec = (InterfaceDeclaration) tmpClassDec;
			if (tmpTypeAcc instanceof TypeAccess) {
				TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
				if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
					InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
					return new Object[] { classDec, typeAcc, superInterfaceDec, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceGeneralization_2_2_corematch_blackFFBFBBFB(
			InterfaceDeclaration classDec, TypeAccess typeAcc, InterfaceDeclaration superInterfaceDec, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!classDec.equals(superInterfaceDec)) {
			for (ASTNode2Element cd2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(classDec,
					ASTNode2Element.class, "source")) {
				Element tmpChildInterface = cd2c.getTarget();
				if (tmpChildInterface instanceof Interface) {
					Interface childInterface = (Interface) tmpChildInterface;
					for (ASTNode2Element cd2c2 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(superInterfaceDec, ASTNode2Element.class, "source")) {
						if (!cd2c.equals(cd2c2)) {
							Element tmpSuperInterface = cd2c2.getTarget();
							if (tmpSuperInterface instanceof Interface) {
								Interface superInterface = (Interface) tmpSuperInterface;
								if (!childInterface.equals(superInterface)) {
									_result.add(new Object[] { childInterface, cd2c2, classDec, cd2c, typeAcc,
											superInterfaceDec, superInterface, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceGeneralization_2_3_findcontext_blackBBBBBBB(
			Interface childInterface, ASTNode2Element cd2c2, InterfaceDeclaration classDec, ASTNode2Element cd2c,
			TypeAccess typeAcc, InterfaceDeclaration superInterfaceDec, Interface superInterface) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!childInterface.equals(superInterface)) {
			if (!classDec.equals(superInterfaceDec)) {
				if (!cd2c.equals(cd2c2)) {
					if (classDec.getSuperInterfaces().contains(typeAcc)) {
						if (childInterface.equals(cd2c.getTarget())) {
							if (superInterfaceDec.equals(typeAcc.getType())) {
								if (classDec.equals(cd2c.getSource())) {
									if (superInterface.equals(cd2c2.getTarget())) {
										if (superInterfaceDec.equals(cd2c2.getSource())) {
											_result.add(new Object[] { childInterface, cd2c2, classDec, cd2c, typeAcc,
													superInterfaceDec, superInterface });
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

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_2_3_findcontext_greenBBBBBBBFFFFFFFF(
			Interface childInterface, ASTNode2Element cd2c2, InterfaceDeclaration classDec, ASTNode2Element cd2c,
			TypeAccess typeAcc, InterfaceDeclaration superInterfaceDec, Interface superInterface) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge classDec__typeAcc____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__childInterface____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAcc__superInterfaceDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superInterface____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superInterfaceDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String classDec__typeAcc____superInterfaces_name_prime = "superInterfaces";
		String cd2c__childInterface____target_name_prime = "target";
		String typeAcc__superInterfaceDec____type_name_prime = "type";
		String superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String cd2c__classDec____source_name_prime = "source";
		String cd2c2__superInterface____target_name_prime = "target";
		String cd2c2__superInterfaceDec____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(childInterface);
		isApplicableMatch.getAllContextElements().add(cd2c2);
		isApplicableMatch.getAllContextElements().add(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c);
		isApplicableMatch.getAllContextElements().add(typeAcc);
		isApplicableMatch.getAllContextElements().add(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(superInterface);
		classDec__typeAcc____superInterfaces.setSrc(classDec);
		classDec__typeAcc____superInterfaces.setTrg(typeAcc);
		isApplicableMatch.getAllContextElements().add(classDec__typeAcc____superInterfaces);
		cd2c__childInterface____target.setSrc(cd2c);
		cd2c__childInterface____target.setTrg(childInterface);
		isApplicableMatch.getAllContextElements().add(cd2c__childInterface____target);
		typeAcc__superInterfaceDec____type.setSrc(typeAcc);
		typeAcc__superInterfaceDec____type.setTrg(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(typeAcc__superInterfaceDec____type);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setSrc(superInterfaceDec);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		isApplicableMatch.getAllContextElements().add(superInterfaceDec__typeAcc____usagesInTypeAccess);
		cd2c__classDec____source.setSrc(cd2c);
		cd2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c__classDec____source);
		cd2c2__superInterface____target.setSrc(cd2c2);
		cd2c2__superInterface____target.setTrg(superInterface);
		isApplicableMatch.getAllContextElements().add(cd2c2__superInterface____target);
		cd2c2__superInterfaceDec____source.setSrc(cd2c2);
		cd2c2__superInterfaceDec____source.setTrg(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(cd2c2__superInterfaceDec____source);
		classDec__typeAcc____superInterfaces.setName(classDec__typeAcc____superInterfaces_name_prime);
		cd2c__childInterface____target.setName(cd2c__childInterface____target_name_prime);
		typeAcc__superInterfaceDec____type.setName(typeAcc__superInterfaceDec____type_name_prime);
		superInterfaceDec__typeAcc____usagesInTypeAccess
				.setName(superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime);
		cd2c__classDec____source.setName(cd2c__classDec____source_name_prime);
		cd2c2__superInterface____target.setName(cd2c2__superInterface____target_name_prime);
		cd2c2__superInterfaceDec____source.setName(cd2c2__superInterfaceDec____source_name_prime);
		return new Object[] { childInterface, cd2c2, classDec, cd2c, typeAcc, superInterfaceDec, superInterface,
				isApplicableMatch, classDec__typeAcc____superInterfaces, cd2c__childInterface____target,
				typeAcc__superInterfaceDec____type, superInterfaceDec__typeAcc____usagesInTypeAccess,
				cd2c__classDec____source, cd2c2__superInterface____target, cd2c2__superInterfaceDec____source };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_2_4_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2InterfaceGeneralization _this, IsApplicableMatch isApplicableMatch, Interface childInterface,
			ASTNode2Element cd2c2, InterfaceDeclaration classDec, ASTNode2Element cd2c, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec, Interface superInterface) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, childInterface, cd2c2, classDec, cd2c,
				typeAcc, superInterfaceDec, superInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, childInterface, cd2c2, classDec, cd2c, typeAcc,
					superInterfaceDec, superInterface };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2InterfaceGeneralization _this, IsApplicableMatch isApplicableMatch, Interface childInterface,
			ASTNode2Element cd2c2, InterfaceDeclaration classDec, ASTNode2Element cd2c, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec, Interface superInterface) {
		Object[] result_pattern_TypeAccess2InterfaceGeneralization_2_4_solveCSP_binding = pattern_TypeAccess2InterfaceGeneralization_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, childInterface, cd2c2, classDec, cd2c, typeAcc, superInterfaceDec,
				superInterface);
		if (result_pattern_TypeAccess2InterfaceGeneralization_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceGeneralization_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceGeneralization_2_4_solveCSP_black = pattern_TypeAccess2InterfaceGeneralization_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceGeneralization_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, childInterface, cd2c2, classDec, cd2c, typeAcc,
						superInterfaceDec, superInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_2_5_checkCSP_expressionFBB(
			TypeAccess2InterfaceGeneralization _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeAccess2InterfaceGeneralization";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccess2InterfaceGeneralization_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_10_1_initialbindings_blackBBBBB(
			TypeAccess2InterfaceGeneralization _this, Match match, Interface childInterface,
			Generalization interfaceGeneralization, Interface superInterface) {
		if (!childInterface.equals(superInterface)) {
			return new Object[] { _this, match, childInterface, interfaceGeneralization, superInterface };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_10_2_SolveCSP_bindingFBBBBB(
			TypeAccess2InterfaceGeneralization _this, Match match, Interface childInterface,
			Generalization interfaceGeneralization, Interface superInterface) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, childInterface, interfaceGeneralization,
				superInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, childInterface, interfaceGeneralization, superInterface };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_10_2_SolveCSP_bindingAndBlackFBBBBB(
			TypeAccess2InterfaceGeneralization _this, Match match, Interface childInterface,
			Generalization interfaceGeneralization, Interface superInterface) {
		Object[] result_pattern_TypeAccess2InterfaceGeneralization_10_2_SolveCSP_binding = pattern_TypeAccess2InterfaceGeneralization_10_2_SolveCSP_bindingFBBBBB(
				_this, match, childInterface, interfaceGeneralization, superInterface);
		if (result_pattern_TypeAccess2InterfaceGeneralization_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceGeneralization_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceGeneralization_10_2_SolveCSP_black = pattern_TypeAccess2InterfaceGeneralization_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceGeneralization_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, childInterface, interfaceGeneralization, superInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_10_3_CheckCSP_expressionFBB(
			TypeAccess2InterfaceGeneralization _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_10_4_collectelementstobetranslated_blackBBBB(
			Match match, Interface childInterface, Generalization interfaceGeneralization, Interface superInterface) {
		if (!childInterface.equals(superInterface)) {
			return new Object[] { match, childInterface, interfaceGeneralization, superInterface };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_10_4_collectelementstobetranslated_greenBBBBFFFF(
			Match match, Interface childInterface, Generalization interfaceGeneralization, Interface superInterface) {
		EMoflonEdge childInterface__interfaceGeneralization____generalization = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interfaceGeneralization__childInterface____specific = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge interfaceGeneralization__superInterface____general = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge childInterface__superInterface____general = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(interfaceGeneralization);
		String childInterface__interfaceGeneralization____generalization_name_prime = "generalization";
		String interfaceGeneralization__childInterface____specific_name_prime = "specific";
		String interfaceGeneralization__superInterface____general_name_prime = "general";
		String childInterface__superInterface____general_name_prime = "general";
		childInterface__interfaceGeneralization____generalization.setSrc(childInterface);
		childInterface__interfaceGeneralization____generalization.setTrg(interfaceGeneralization);
		match.getToBeTranslatedEdges().add(childInterface__interfaceGeneralization____generalization);
		interfaceGeneralization__childInterface____specific.setSrc(interfaceGeneralization);
		interfaceGeneralization__childInterface____specific.setTrg(childInterface);
		match.getToBeTranslatedEdges().add(interfaceGeneralization__childInterface____specific);
		interfaceGeneralization__superInterface____general.setSrc(interfaceGeneralization);
		interfaceGeneralization__superInterface____general.setTrg(superInterface);
		match.getToBeTranslatedEdges().add(interfaceGeneralization__superInterface____general);
		childInterface__superInterface____general.setSrc(childInterface);
		childInterface__superInterface____general.setTrg(superInterface);
		match.getToBeTranslatedEdges().add(childInterface__superInterface____general);
		childInterface__interfaceGeneralization____generalization
				.setName(childInterface__interfaceGeneralization____generalization_name_prime);
		interfaceGeneralization__childInterface____specific
				.setName(interfaceGeneralization__childInterface____specific_name_prime);
		interfaceGeneralization__superInterface____general
				.setName(interfaceGeneralization__superInterface____general_name_prime);
		childInterface__superInterface____general.setName(childInterface__superInterface____general_name_prime);
		return new Object[] { match, childInterface, interfaceGeneralization, superInterface,
				childInterface__interfaceGeneralization____generalization,
				interfaceGeneralization__childInterface____specific, interfaceGeneralization__superInterface____general,
				childInterface__superInterface____general };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_10_5_collectcontextelements_blackBBBB(
			Match match, Interface childInterface, Generalization interfaceGeneralization, Interface superInterface) {
		if (!childInterface.equals(superInterface)) {
			return new Object[] { match, childInterface, interfaceGeneralization, superInterface };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_10_5_collectcontextelements_greenBBB(
			Match match, Interface childInterface, Interface superInterface) {
		match.getContextNodes().add(childInterface);
		match.getContextNodes().add(superInterface);
		return new Object[] { match, childInterface, superInterface };
	}

	public static final void pattern_TypeAccess2InterfaceGeneralization_10_6_registerobjectstomatch_expressionBBBBB(
			TypeAccess2InterfaceGeneralization _this, Match match, Interface childInterface,
			Generalization interfaceGeneralization, Interface superInterface) {
		_this.registerObjectsToMatch_BWD(match, childInterface, interfaceGeneralization, superInterface);

	}

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("childInterface");
		EObject _localVariable_1 = isApplicableMatch.getObject("cd2c2");
		EObject _localVariable_2 = isApplicableMatch.getObject("classDec");
		EObject _localVariable_3 = isApplicableMatch.getObject("cd2c");
		EObject _localVariable_4 = isApplicableMatch.getObject("interfaceGeneralization");
		EObject _localVariable_5 = isApplicableMatch.getObject("superInterfaceDec");
		EObject _localVariable_6 = isApplicableMatch.getObject("superInterface");
		EObject tmpChildInterface = _localVariable_0;
		EObject tmpCd2c2 = _localVariable_1;
		EObject tmpClassDec = _localVariable_2;
		EObject tmpCd2c = _localVariable_3;
		EObject tmpInterfaceGeneralization = _localVariable_4;
		EObject tmpSuperInterfaceDec = _localVariable_5;
		EObject tmpSuperInterface = _localVariable_6;
		if (tmpChildInterface instanceof Interface) {
			Interface childInterface = (Interface) tmpChildInterface;
			if (tmpCd2c2 instanceof ASTNode2Element) {
				ASTNode2Element cd2c2 = (ASTNode2Element) tmpCd2c2;
				if (tmpClassDec instanceof InterfaceDeclaration) {
					InterfaceDeclaration classDec = (InterfaceDeclaration) tmpClassDec;
					if (tmpCd2c instanceof ASTNode2Element) {
						ASTNode2Element cd2c = (ASTNode2Element) tmpCd2c;
						if (tmpInterfaceGeneralization instanceof Generalization) {
							Generalization interfaceGeneralization = (Generalization) tmpInterfaceGeneralization;
							if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
								InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
								if (tmpSuperInterface instanceof Interface) {
									Interface superInterface = (Interface) tmpSuperInterface;
									return new Object[] { childInterface, cd2c2, classDec, cd2c,
											interfaceGeneralization, superInterfaceDec, superInterface,
											isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_blackBBBBBBBFBB(
			Interface childInterface, ASTNode2Element cd2c2, InterfaceDeclaration classDec, ASTNode2Element cd2c,
			Generalization interfaceGeneralization, InterfaceDeclaration superInterfaceDec, Interface superInterface,
			TypeAccess2InterfaceGeneralization _this, IsApplicableMatch isApplicableMatch) {
		if (!childInterface.equals(superInterface)) {
			if (!classDec.equals(superInterfaceDec)) {
				if (!cd2c.equals(cd2c2)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { childInterface, cd2c2, classDec, cd2c, interfaceGeneralization,
									superInterfaceDec, superInterface, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			TypeAccess2InterfaceGeneralization _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_binding = pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_binding != null) {
			Interface childInterface = (Interface) result_pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_binding[0];
			ASTNode2Element cd2c2 = (ASTNode2Element) result_pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_binding[1];
			InterfaceDeclaration classDec = (InterfaceDeclaration) result_pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_binding[2];
			ASTNode2Element cd2c = (ASTNode2Element) result_pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_binding[3];
			Generalization interfaceGeneralization = (Generalization) result_pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_binding[4];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result_pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_binding[5];
			Interface superInterface = (Interface) result_pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_binding[6];

			Object[] result_pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_black = pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_blackBBBBBBBFBB(
					childInterface, cd2c2, classDec, cd2c, interfaceGeneralization, superInterfaceDec, superInterface,
					_this, isApplicableMatch);
			if (result_pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_black[7];

				return new Object[] { childInterface, cd2c2, classDec, cd2c, interfaceGeneralization, superInterfaceDec,
						superInterface, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_11_1_performtransformation_greenFBFBB(
			InterfaceDeclaration classDec, Generalization interfaceGeneralization,
			InterfaceDeclaration superInterfaceDec) {
		TypeAccess2Generalization ta2g = UmlFactory.eINSTANCE.createTypeAccess2Generalization();
		TypeAccess typeAcc = JavaFactory.eINSTANCE.createTypeAccess();
		ta2g.setTarget(interfaceGeneralization);
		classDec.getSuperInterfaces().add(typeAcc);
		typeAcc.setType(superInterfaceDec);
		ta2g.setSource(typeAcc);
		return new Object[] { ta2g, classDec, typeAcc, interfaceGeneralization, superInterfaceDec };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_11_2_collecttranslatedelements_blackBBB(
			TypeAccess2Generalization ta2g, TypeAccess typeAcc, Generalization interfaceGeneralization) {
		return new Object[] { ta2g, typeAcc, interfaceGeneralization };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_11_2_collecttranslatedelements_greenFBBB(
			TypeAccess2Generalization ta2g, TypeAccess typeAcc, Generalization interfaceGeneralization) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(ta2g);
		ruleresult.getCreatedElements().add(typeAcc);
		ruleresult.getTranslatedElements().add(interfaceGeneralization);
		return new Object[] { ruleresult, ta2g, typeAcc, interfaceGeneralization };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject childInterface, EObject ta2g, EObject cd2c2, EObject classDec,
			EObject cd2c, EObject typeAcc, EObject interfaceGeneralization, EObject superInterfaceDec,
			EObject superInterface) {
		if (!childInterface.equals(ta2g)) {
			if (!childInterface.equals(classDec)) {
				if (!childInterface.equals(typeAcc)) {
					if (!childInterface.equals(interfaceGeneralization)) {
						if (!childInterface.equals(superInterfaceDec)) {
							if (!childInterface.equals(superInterface)) {
								if (!ta2g.equals(typeAcc)) {
									if (!cd2c2.equals(childInterface)) {
										if (!cd2c2.equals(ta2g)) {
											if (!cd2c2.equals(classDec)) {
												if (!cd2c2.equals(typeAcc)) {
													if (!cd2c2.equals(interfaceGeneralization)) {
														if (!cd2c2.equals(superInterfaceDec)) {
															if (!cd2c2.equals(superInterface)) {
																if (!classDec.equals(ta2g)) {
																	if (!classDec.equals(typeAcc)) {
																		if (!classDec.equals(interfaceGeneralization)) {
																			if (!classDec.equals(superInterfaceDec)) {
																				if (!classDec.equals(superInterface)) {
																					if (!cd2c.equals(childInterface)) {
																						if (!cd2c.equals(ta2g)) {
																							if (!cd2c.equals(cd2c2)) {
																								if (!cd2c.equals(
																										classDec)) {
																									if (!cd2c.equals(
																											typeAcc)) {
																										if (!cd2c
																												.equals(interfaceGeneralization)) {
																											if (!cd2c
																													.equals(superInterfaceDec)) {
																												if (!cd2c
																														.equals(superInterface)) {
																													if (!interfaceGeneralization
																															.equals(ta2g)) {
																														if (!interfaceGeneralization
																																.equals(typeAcc)) {
																															if (!interfaceGeneralization
																																	.equals(superInterfaceDec)) {
																																if (!interfaceGeneralization
																																		.equals(superInterface)) {
																																	if (!superInterfaceDec
																																			.equals(ta2g)) {
																																		if (!superInterfaceDec
																																				.equals(typeAcc)) {
																																			if (!superInterface
																																					.equals(ta2g)) {
																																				if (!superInterface
																																						.equals(typeAcc)) {
																																					if (!superInterface
																																							.equals(superInterfaceDec)) {
																																						return new Object[] {
																																								ruleresult,
																																								childInterface,
																																								ta2g,
																																								cd2c2,
																																								classDec,
																																								cd2c,
																																								typeAcc,
																																								interfaceGeneralization,
																																								superInterfaceDec,
																																								superInterface };
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

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject childInterface, EObject ta2g, EObject classDec, EObject typeAcc,
			EObject interfaceGeneralization, EObject superInterfaceDec, EObject superInterface) {
		EMoflonEdge childInterface__interfaceGeneralization____generalization = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interfaceGeneralization__childInterface____specific = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__typeAcc____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__interfaceGeneralization____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAcc__superInterfaceDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__typeAcc____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge interfaceGeneralization__superInterface____general = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge childInterface__superInterface____general = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccess2InterfaceGeneralization";
		String childInterface__interfaceGeneralization____generalization_name_prime = "generalization";
		String interfaceGeneralization__childInterface____specific_name_prime = "specific";
		String classDec__typeAcc____superInterfaces_name_prime = "superInterfaces";
		String ta2g__interfaceGeneralization____target_name_prime = "target";
		String typeAcc__superInterfaceDec____type_name_prime = "type";
		String superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String ta2g__typeAcc____source_name_prime = "source";
		String interfaceGeneralization__superInterface____general_name_prime = "general";
		String childInterface__superInterface____general_name_prime = "general";
		childInterface__interfaceGeneralization____generalization.setSrc(childInterface);
		childInterface__interfaceGeneralization____generalization.setTrg(interfaceGeneralization);
		ruleresult.getTranslatedEdges().add(childInterface__interfaceGeneralization____generalization);
		interfaceGeneralization__childInterface____specific.setSrc(interfaceGeneralization);
		interfaceGeneralization__childInterface____specific.setTrg(childInterface);
		ruleresult.getTranslatedEdges().add(interfaceGeneralization__childInterface____specific);
		classDec__typeAcc____superInterfaces.setSrc(classDec);
		classDec__typeAcc____superInterfaces.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(classDec__typeAcc____superInterfaces);
		ta2g__interfaceGeneralization____target.setSrc(ta2g);
		ta2g__interfaceGeneralization____target.setTrg(interfaceGeneralization);
		ruleresult.getCreatedEdges().add(ta2g__interfaceGeneralization____target);
		typeAcc__superInterfaceDec____type.setSrc(typeAcc);
		typeAcc__superInterfaceDec____type.setTrg(superInterfaceDec);
		ruleresult.getCreatedEdges().add(typeAcc__superInterfaceDec____type);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setSrc(superInterfaceDec);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(superInterfaceDec__typeAcc____usagesInTypeAccess);
		ta2g__typeAcc____source.setSrc(ta2g);
		ta2g__typeAcc____source.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(ta2g__typeAcc____source);
		interfaceGeneralization__superInterface____general.setSrc(interfaceGeneralization);
		interfaceGeneralization__superInterface____general.setTrg(superInterface);
		ruleresult.getTranslatedEdges().add(interfaceGeneralization__superInterface____general);
		childInterface__superInterface____general.setSrc(childInterface);
		childInterface__superInterface____general.setTrg(superInterface);
		ruleresult.getTranslatedEdges().add(childInterface__superInterface____general);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		childInterface__interfaceGeneralization____generalization
				.setName(childInterface__interfaceGeneralization____generalization_name_prime);
		interfaceGeneralization__childInterface____specific
				.setName(interfaceGeneralization__childInterface____specific_name_prime);
		classDec__typeAcc____superInterfaces.setName(classDec__typeAcc____superInterfaces_name_prime);
		ta2g__interfaceGeneralization____target.setName(ta2g__interfaceGeneralization____target_name_prime);
		typeAcc__superInterfaceDec____type.setName(typeAcc__superInterfaceDec____type_name_prime);
		superInterfaceDec__typeAcc____usagesInTypeAccess
				.setName(superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime);
		ta2g__typeAcc____source.setName(ta2g__typeAcc____source_name_prime);
		interfaceGeneralization__superInterface____general
				.setName(interfaceGeneralization__superInterface____general_name_prime);
		childInterface__superInterface____general.setName(childInterface__superInterface____general_name_prime);
		return new Object[] { ruleresult, childInterface, ta2g, classDec, typeAcc, interfaceGeneralization,
				superInterfaceDec, superInterface, childInterface__interfaceGeneralization____generalization,
				interfaceGeneralization__childInterface____specific, classDec__typeAcc____superInterfaces,
				ta2g__interfaceGeneralization____target, typeAcc__superInterfaceDec____type,
				superInterfaceDec__typeAcc____usagesInTypeAccess, ta2g__typeAcc____source,
				interfaceGeneralization__superInterface____general, childInterface__superInterface____general };
	}

	public static final void pattern_TypeAccess2InterfaceGeneralization_11_5_registerobjects_expressionBBBBBBBBBBB(
			TypeAccess2InterfaceGeneralization _this, PerformRuleResult ruleresult, EObject childInterface,
			EObject ta2g, EObject cd2c2, EObject classDec, EObject cd2c, EObject typeAcc,
			EObject interfaceGeneralization, EObject superInterfaceDec, EObject superInterface) {
		_this.registerObjects_BWD(ruleresult, childInterface, ta2g, cd2c2, classDec, cd2c, typeAcc,
				interfaceGeneralization, superInterfaceDec, superInterface);

	}

	public static final PerformRuleResult pattern_TypeAccess2InterfaceGeneralization_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_12_1_preparereturnvalue_bindingFB(
			TypeAccess2InterfaceGeneralization _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_12_1_preparereturnvalue_blackFBB(
			EClass eClass, TypeAccess2InterfaceGeneralization _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_12_1_preparereturnvalue_bindingAndBlackFFB(
			TypeAccess2InterfaceGeneralization _this) {
		Object[] result_pattern_TypeAccess2InterfaceGeneralization_12_1_preparereturnvalue_binding = pattern_TypeAccess2InterfaceGeneralization_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2InterfaceGeneralization_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeAccess2InterfaceGeneralization_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceGeneralization_12_1_preparereturnvalue_black = pattern_TypeAccess2InterfaceGeneralization_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeAccess2InterfaceGeneralization_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeAccess2InterfaceGeneralization_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeAccess2InterfaceGeneralization";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("childInterface");
		EObject _localVariable_1 = match.getObject("interfaceGeneralization");
		EObject _localVariable_2 = match.getObject("superInterface");
		EObject tmpChildInterface = _localVariable_0;
		EObject tmpInterfaceGeneralization = _localVariable_1;
		EObject tmpSuperInterface = _localVariable_2;
		if (tmpChildInterface instanceof Interface) {
			Interface childInterface = (Interface) tmpChildInterface;
			if (tmpInterfaceGeneralization instanceof Generalization) {
				Generalization interfaceGeneralization = (Generalization) tmpInterfaceGeneralization;
				if (tmpSuperInterface instanceof Interface) {
					Interface superInterface = (Interface) tmpSuperInterface;
					return new Object[] { childInterface, interfaceGeneralization, superInterface, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceGeneralization_12_2_corematch_blackBFFFBFBB(
			Interface childInterface, Generalization interfaceGeneralization, Interface superInterface, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!childInterface.equals(superInterface)) {
			for (ASTNode2Element cd2c : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(childInterface, ASTNode2Element.class, "target")) {
				ASTNode tmpClassDec = cd2c.getSource();
				if (tmpClassDec instanceof InterfaceDeclaration) {
					InterfaceDeclaration classDec = (InterfaceDeclaration) tmpClassDec;
					for (ASTNode2Element cd2c2 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(superInterface, ASTNode2Element.class, "target")) {
						if (!cd2c.equals(cd2c2)) {
							ASTNode tmpSuperInterfaceDec = cd2c2.getSource();
							if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
								InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
								if (!classDec.equals(superInterfaceDec)) {
									_result.add(new Object[] { childInterface, cd2c2, classDec, cd2c,
											interfaceGeneralization, superInterfaceDec, superInterface, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceGeneralization_12_3_findcontext_blackBBBBBBB(
			Interface childInterface, ASTNode2Element cd2c2, InterfaceDeclaration classDec, ASTNode2Element cd2c,
			Generalization interfaceGeneralization, InterfaceDeclaration superInterfaceDec, Interface superInterface) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!childInterface.equals(superInterface)) {
			if (!classDec.equals(superInterfaceDec)) {
				if (!cd2c.equals(cd2c2)) {
					if (childInterface.getGeneralizations().contains(interfaceGeneralization)) {
						if (childInterface.equals(cd2c.getTarget())) {
							if (classDec.equals(cd2c.getSource())) {
								if (superInterface.equals(cd2c2.getTarget())) {
									if (superInterfaceDec.equals(cd2c2.getSource())) {
										if (superInterface.equals(interfaceGeneralization.getGeneral())) {
											if (childInterface.getGenerals().contains(superInterface)) {
												_result.add(new Object[] { childInterface, cd2c2, classDec, cd2c,
														interfaceGeneralization, superInterfaceDec, superInterface });
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

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_12_3_findcontext_greenBBBBBBBFFFFFFFFF(
			Interface childInterface, ASTNode2Element cd2c2, InterfaceDeclaration classDec, ASTNode2Element cd2c,
			Generalization interfaceGeneralization, InterfaceDeclaration superInterfaceDec, Interface superInterface) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge childInterface__interfaceGeneralization____generalization = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interfaceGeneralization__childInterface____specific = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__childInterface____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superInterface____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superInterfaceDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge interfaceGeneralization__superInterface____general = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge childInterface__superInterface____general = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String childInterface__interfaceGeneralization____generalization_name_prime = "generalization";
		String interfaceGeneralization__childInterface____specific_name_prime = "specific";
		String cd2c__childInterface____target_name_prime = "target";
		String cd2c__classDec____source_name_prime = "source";
		String cd2c2__superInterface____target_name_prime = "target";
		String cd2c2__superInterfaceDec____source_name_prime = "source";
		String interfaceGeneralization__superInterface____general_name_prime = "general";
		String childInterface__superInterface____general_name_prime = "general";
		isApplicableMatch.getAllContextElements().add(childInterface);
		isApplicableMatch.getAllContextElements().add(cd2c2);
		isApplicableMatch.getAllContextElements().add(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c);
		isApplicableMatch.getAllContextElements().add(interfaceGeneralization);
		isApplicableMatch.getAllContextElements().add(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(superInterface);
		childInterface__interfaceGeneralization____generalization.setSrc(childInterface);
		childInterface__interfaceGeneralization____generalization.setTrg(interfaceGeneralization);
		isApplicableMatch.getAllContextElements().add(childInterface__interfaceGeneralization____generalization);
		interfaceGeneralization__childInterface____specific.setSrc(interfaceGeneralization);
		interfaceGeneralization__childInterface____specific.setTrg(childInterface);
		isApplicableMatch.getAllContextElements().add(interfaceGeneralization__childInterface____specific);
		cd2c__childInterface____target.setSrc(cd2c);
		cd2c__childInterface____target.setTrg(childInterface);
		isApplicableMatch.getAllContextElements().add(cd2c__childInterface____target);
		cd2c__classDec____source.setSrc(cd2c);
		cd2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c__classDec____source);
		cd2c2__superInterface____target.setSrc(cd2c2);
		cd2c2__superInterface____target.setTrg(superInterface);
		isApplicableMatch.getAllContextElements().add(cd2c2__superInterface____target);
		cd2c2__superInterfaceDec____source.setSrc(cd2c2);
		cd2c2__superInterfaceDec____source.setTrg(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(cd2c2__superInterfaceDec____source);
		interfaceGeneralization__superInterface____general.setSrc(interfaceGeneralization);
		interfaceGeneralization__superInterface____general.setTrg(superInterface);
		isApplicableMatch.getAllContextElements().add(interfaceGeneralization__superInterface____general);
		childInterface__superInterface____general.setSrc(childInterface);
		childInterface__superInterface____general.setTrg(superInterface);
		isApplicableMatch.getAllContextElements().add(childInterface__superInterface____general);
		childInterface__interfaceGeneralization____generalization
				.setName(childInterface__interfaceGeneralization____generalization_name_prime);
		interfaceGeneralization__childInterface____specific
				.setName(interfaceGeneralization__childInterface____specific_name_prime);
		cd2c__childInterface____target.setName(cd2c__childInterface____target_name_prime);
		cd2c__classDec____source.setName(cd2c__classDec____source_name_prime);
		cd2c2__superInterface____target.setName(cd2c2__superInterface____target_name_prime);
		cd2c2__superInterfaceDec____source.setName(cd2c2__superInterfaceDec____source_name_prime);
		interfaceGeneralization__superInterface____general
				.setName(interfaceGeneralization__superInterface____general_name_prime);
		childInterface__superInterface____general.setName(childInterface__superInterface____general_name_prime);
		return new Object[] { childInterface, cd2c2, classDec, cd2c, interfaceGeneralization, superInterfaceDec,
				superInterface, isApplicableMatch, childInterface__interfaceGeneralization____generalization,
				interfaceGeneralization__childInterface____specific, cd2c__childInterface____target,
				cd2c__classDec____source, cd2c2__superInterface____target, cd2c2__superInterfaceDec____source,
				interfaceGeneralization__superInterface____general, childInterface__superInterface____general };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_12_4_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2InterfaceGeneralization _this, IsApplicableMatch isApplicableMatch, Interface childInterface,
			ASTNode2Element cd2c2, InterfaceDeclaration classDec, ASTNode2Element cd2c,
			Generalization interfaceGeneralization, InterfaceDeclaration superInterfaceDec, Interface superInterface) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, childInterface, cd2c2, classDec, cd2c,
				interfaceGeneralization, superInterfaceDec, superInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, childInterface, cd2c2, classDec, cd2c,
					interfaceGeneralization, superInterfaceDec, superInterface };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2InterfaceGeneralization _this, IsApplicableMatch isApplicableMatch, Interface childInterface,
			ASTNode2Element cd2c2, InterfaceDeclaration classDec, ASTNode2Element cd2c,
			Generalization interfaceGeneralization, InterfaceDeclaration superInterfaceDec, Interface superInterface) {
		Object[] result_pattern_TypeAccess2InterfaceGeneralization_12_4_solveCSP_binding = pattern_TypeAccess2InterfaceGeneralization_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, childInterface, cd2c2, classDec, cd2c, interfaceGeneralization,
				superInterfaceDec, superInterface);
		if (result_pattern_TypeAccess2InterfaceGeneralization_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceGeneralization_12_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceGeneralization_12_4_solveCSP_black = pattern_TypeAccess2InterfaceGeneralization_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceGeneralization_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, childInterface, cd2c2, classDec, cd2c,
						interfaceGeneralization, superInterfaceDec, superInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_12_5_checkCSP_expressionFBB(
			TypeAccess2InterfaceGeneralization _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeAccess2InterfaceGeneralization";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccess2InterfaceGeneralization_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_20_1_preparereturnvalue_bindingFB(
			TypeAccess2InterfaceGeneralization _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, TypeAccess2InterfaceGeneralization _this) {
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

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_20_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeAccess2InterfaceGeneralization _this) {
		Object[] result_pattern_TypeAccess2InterfaceGeneralization_20_1_preparereturnvalue_binding = pattern_TypeAccess2InterfaceGeneralization_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2InterfaceGeneralization_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeAccess2InterfaceGeneralization_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceGeneralization_20_1_preparereturnvalue_black = pattern_TypeAccess2InterfaceGeneralization_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeAccess2InterfaceGeneralization_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeAccess2InterfaceGeneralization_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeAccess2InterfaceGeneralization_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceGeneralization_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_generalization) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpChildInterface = _edge_generalization.getSrc();
		if (tmpChildInterface instanceof Interface) {
			Interface childInterface = (Interface) tmpChildInterface;
			EObject tmpInterfaceGeneralization = _edge_generalization.getTrg();
			if (tmpInterfaceGeneralization instanceof Generalization) {
				Generalization interfaceGeneralization = (Generalization) tmpInterfaceGeneralization;
				if (childInterface.getGeneralizations().contains(interfaceGeneralization)) {
					Classifier tmpSuperInterface = interfaceGeneralization.getGeneral();
					if (tmpSuperInterface instanceof Interface) {
						Interface superInterface = (Interface) tmpSuperInterface;
						if (!childInterface.equals(superInterface)) {
							if (childInterface.getGenerals().contains(superInterface)) {
								_result.add(new Object[] { childInterface, interfaceGeneralization, superInterface,
										_edge_generalization });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			TypeAccess2InterfaceGeneralization _this, Match match, Interface childInterface,
			Generalization interfaceGeneralization, Interface superInterface) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, childInterface, interfaceGeneralization,
				superInterface);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeAccess2InterfaceGeneralization _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeAccess2InterfaceGeneralization_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_21_1_preparereturnvalue_bindingFB(
			TypeAccess2InterfaceGeneralization _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, TypeAccess2InterfaceGeneralization _this) {
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

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_21_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeAccess2InterfaceGeneralization _this) {
		Object[] result_pattern_TypeAccess2InterfaceGeneralization_21_1_preparereturnvalue_binding = pattern_TypeAccess2InterfaceGeneralization_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2InterfaceGeneralization_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeAccess2InterfaceGeneralization_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceGeneralization_21_1_preparereturnvalue_black = pattern_TypeAccess2InterfaceGeneralization_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeAccess2InterfaceGeneralization_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeAccess2InterfaceGeneralization_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeAccess2InterfaceGeneralization_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_black_nac_0B(
			TypeAccess typeAcc) {
		for (Annotation __DEC_typeAcc_type_209013 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, Annotation.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess typeAcc) {
		for (ArrayType __DEC_typeAcc_elementType_290286 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ArrayType.class, "elementType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_black_nac_2B(
			TypeAccess typeAcc) {
		for (ClassDeclaration __DEC_typeAcc_superClass_820740 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ClassDeclaration.class, "superClass")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess typeAcc) {
		for (MethodDeclaration __DEC_typeAcc_returnType_217471 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_black_nac_4B(
			TypeAccess typeAcc) {
		for (ParameterizedType __DEC_typeAcc_type_744070 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ParameterizedType.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess typeAcc) {
		for (SingleVariableDeclaration __DEC_typeAcc_type_117316 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess typeAcc) {
		for (AnnotationMemberValuePair __DEC_typeAcc_value_894518 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_superInterfaces) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpClassDec = _edge_superInterfaces.getSrc();
		if (tmpClassDec instanceof InterfaceDeclaration) {
			InterfaceDeclaration classDec = (InterfaceDeclaration) tmpClassDec;
			EObject tmpTypeAcc = _edge_superInterfaces.getTrg();
			if (tmpTypeAcc instanceof TypeAccess) {
				TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
				if (classDec.getSuperInterfaces().contains(typeAcc)) {
					Type tmpSuperInterfaceDec = typeAcc.getType();
					if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
						InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
						if (!classDec.equals(superInterfaceDec)) {
							if (pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_black_nac_0B(
									typeAcc) == null) {
								if (pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_black_nac_1B(
										typeAcc) == null) {
									if (pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_black_nac_2B(
											typeAcc) == null) {
										if (pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_black_nac_3B(
												typeAcc) == null) {
											if (pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_black_nac_4B(
													typeAcc) == null) {
												if (pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_black_nac_5B(
														typeAcc) == null) {
													if (pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_black_nac_6B(
															typeAcc) == null) {
														_result.add(new Object[] { classDec, typeAcc, superInterfaceDec,
																_edge_superInterfaces });
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

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			TypeAccess2InterfaceGeneralization _this, Match match, InterfaceDeclaration classDec, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, classDec, typeAcc, superInterfaceDec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeAccess2InterfaceGeneralization _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeAccess2InterfaceGeneralization_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_24_1_prepare_blackB(
			TypeAccess2InterfaceGeneralization _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("childInterface");
		EObject _localVariable_1 = sourceMatch.getObject("classDec");
		EObject _localVariable_2 = sourceMatch.getObject("typeAcc");
		EObject _localVariable_3 = targetMatch.getObject("interfaceGeneralization");
		EObject _localVariable_4 = sourceMatch.getObject("superInterfaceDec");
		EObject _localVariable_5 = targetMatch.getObject("superInterface");
		EObject tmpChildInterface = _localVariable_0;
		EObject tmpClassDec = _localVariable_1;
		EObject tmpTypeAcc = _localVariable_2;
		EObject tmpInterfaceGeneralization = _localVariable_3;
		EObject tmpSuperInterfaceDec = _localVariable_4;
		EObject tmpSuperInterface = _localVariable_5;
		if (tmpChildInterface instanceof Interface) {
			Interface childInterface = (Interface) tmpChildInterface;
			if (tmpClassDec instanceof InterfaceDeclaration) {
				InterfaceDeclaration classDec = (InterfaceDeclaration) tmpClassDec;
				if (tmpTypeAcc instanceof TypeAccess) {
					TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
					if (tmpInterfaceGeneralization instanceof Generalization) {
						Generalization interfaceGeneralization = (Generalization) tmpInterfaceGeneralization;
						if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
							InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
							if (tmpSuperInterface instanceof Interface) {
								Interface superInterface = (Interface) tmpSuperInterface;
								return new Object[] { childInterface, classDec, typeAcc, interfaceGeneralization,
										superInterfaceDec, superInterface, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_24_2_matchsrctrgcontext_blackBBBBBBBB(
			Interface childInterface, InterfaceDeclaration classDec, TypeAccess typeAcc,
			Generalization interfaceGeneralization, InterfaceDeclaration superInterfaceDec, Interface superInterface,
			Match sourceMatch, Match targetMatch) {
		if (!childInterface.equals(superInterface)) {
			if (!classDec.equals(superInterfaceDec)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { childInterface, classDec, typeAcc, interfaceGeneralization, superInterfaceDec,
							superInterface, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeAccess2InterfaceGeneralization_24_2_matchsrctrgcontext_binding = pattern_TypeAccess2InterfaceGeneralization_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_TypeAccess2InterfaceGeneralization_24_2_matchsrctrgcontext_binding != null) {
			Interface childInterface = (Interface) result_pattern_TypeAccess2InterfaceGeneralization_24_2_matchsrctrgcontext_binding[0];
			InterfaceDeclaration classDec = (InterfaceDeclaration) result_pattern_TypeAccess2InterfaceGeneralization_24_2_matchsrctrgcontext_binding[1];
			TypeAccess typeAcc = (TypeAccess) result_pattern_TypeAccess2InterfaceGeneralization_24_2_matchsrctrgcontext_binding[2];
			Generalization interfaceGeneralization = (Generalization) result_pattern_TypeAccess2InterfaceGeneralization_24_2_matchsrctrgcontext_binding[3];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result_pattern_TypeAccess2InterfaceGeneralization_24_2_matchsrctrgcontext_binding[4];
			Interface superInterface = (Interface) result_pattern_TypeAccess2InterfaceGeneralization_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_TypeAccess2InterfaceGeneralization_24_2_matchsrctrgcontext_black = pattern_TypeAccess2InterfaceGeneralization_24_2_matchsrctrgcontext_blackBBBBBBBB(
					childInterface, classDec, typeAcc, interfaceGeneralization, superInterfaceDec, superInterface,
					sourceMatch, targetMatch);
			if (result_pattern_TypeAccess2InterfaceGeneralization_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { childInterface, classDec, typeAcc, interfaceGeneralization, superInterfaceDec,
						superInterface, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_24_3_solvecsp_bindingFBBBBBBBBB(
			TypeAccess2InterfaceGeneralization _this, Interface childInterface, InterfaceDeclaration classDec,
			TypeAccess typeAcc, Generalization interfaceGeneralization, InterfaceDeclaration superInterfaceDec,
			Interface superInterface, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(childInterface, classDec, typeAcc,
				interfaceGeneralization, superInterfaceDec, superInterface, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, childInterface, classDec, typeAcc, interfaceGeneralization,
					superInterfaceDec, superInterface, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			TypeAccess2InterfaceGeneralization _this, Interface childInterface, InterfaceDeclaration classDec,
			TypeAccess typeAcc, Generalization interfaceGeneralization, InterfaceDeclaration superInterfaceDec,
			Interface superInterface, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeAccess2InterfaceGeneralization_24_3_solvecsp_binding = pattern_TypeAccess2InterfaceGeneralization_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, childInterface, classDec, typeAcc, interfaceGeneralization, superInterfaceDec, superInterface,
				sourceMatch, targetMatch);
		if (result_pattern_TypeAccess2InterfaceGeneralization_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceGeneralization_24_3_solvecsp_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceGeneralization_24_3_solvecsp_black = pattern_TypeAccess2InterfaceGeneralization_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceGeneralization_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, childInterface, classDec, typeAcc, interfaceGeneralization,
						superInterfaceDec, superInterface, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceGeneralization_24_5_matchcorrcontext_blackBFBFBBBB(
			Interface childInterface, InterfaceDeclaration classDec, InterfaceDeclaration superInterfaceDec,
			Interface superInterface, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!childInterface.equals(superInterface)) {
			if (!classDec.equals(superInterfaceDec)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (ASTNode2Element cd2c : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(childInterface, ASTNode2Element.class, "target")) {
						if (classDec.equals(cd2c.getSource())) {
							for (ASTNode2Element cd2c2 : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(superInterface, ASTNode2Element.class, "target")) {
								if (!cd2c.equals(cd2c2)) {
									if (superInterfaceDec.equals(cd2c2.getSource())) {
										_result.add(new Object[] { childInterface, cd2c2, classDec, cd2c,
												superInterfaceDec, superInterface, sourceMatch, targetMatch });
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

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_24_5_matchcorrcontext_greenBBBBF(
			ASTNode2Element cd2c2, ASTNode2Element cd2c, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "TypeAccess2InterfaceGeneralization";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(cd2c2);
		ccMatch.getAllContextElements().add(cd2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { cd2c2, cd2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_24_6_createcorrespondence_blackBBBBBBB(
			Interface childInterface, InterfaceDeclaration classDec, TypeAccess typeAcc,
			Generalization interfaceGeneralization, InterfaceDeclaration superInterfaceDec, Interface superInterface,
			CCMatch ccMatch) {
		if (!childInterface.equals(superInterface)) {
			if (!classDec.equals(superInterfaceDec)) {
				return new Object[] { childInterface, classDec, typeAcc, interfaceGeneralization, superInterfaceDec,
						superInterface, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_24_6_createcorrespondence_greenFBBB(
			TypeAccess typeAcc, Generalization interfaceGeneralization, CCMatch ccMatch) {
		TypeAccess2Generalization ta2g = UmlFactory.eINSTANCE.createTypeAccess2Generalization();
		ta2g.setTarget(interfaceGeneralization);
		ta2g.setSource(typeAcc);
		ccMatch.getCreateCorr().add(ta2g);
		return new Object[] { ta2g, typeAcc, interfaceGeneralization, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "TypeAccess2InterfaceGeneralization";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccess2InterfaceGeneralization_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_27_1_matchtggpattern_black_nac_0B(
			TypeAccess typeAcc) {
		for (Annotation __DEC_typeAcc_type_15372 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, Annotation.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_27_1_matchtggpattern_black_nac_1B(
			TypeAccess typeAcc) {
		for (ArrayType __DEC_typeAcc_elementType_89157 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ArrayType.class, "elementType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_27_1_matchtggpattern_black_nac_2B(
			TypeAccess typeAcc) {
		for (ClassDeclaration __DEC_typeAcc_superClass_777895 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ClassDeclaration.class, "superClass")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_27_1_matchtggpattern_black_nac_3B(
			TypeAccess typeAcc) {
		for (MethodDeclaration __DEC_typeAcc_returnType_706287 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_27_1_matchtggpattern_black_nac_4B(
			TypeAccess typeAcc) {
		for (ParameterizedType __DEC_typeAcc_type_213144 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ParameterizedType.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_27_1_matchtggpattern_black_nac_5B(
			TypeAccess typeAcc) {
		for (SingleVariableDeclaration __DEC_typeAcc_type_765118 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_27_1_matchtggpattern_black_nac_6B(
			TypeAccess typeAcc) {
		for (AnnotationMemberValuePair __DEC_typeAcc_value_374248 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_27_1_matchtggpattern_blackBBB(
			InterfaceDeclaration classDec, TypeAccess typeAcc, InterfaceDeclaration superInterfaceDec) {
		if (!classDec.equals(superInterfaceDec)) {
			if (classDec.getSuperInterfaces().contains(typeAcc)) {
				if (superInterfaceDec.equals(typeAcc.getType())) {
					if (pattern_TypeAccess2InterfaceGeneralization_27_1_matchtggpattern_black_nac_0B(typeAcc) == null) {
						if (pattern_TypeAccess2InterfaceGeneralization_27_1_matchtggpattern_black_nac_1B(
								typeAcc) == null) {
							if (pattern_TypeAccess2InterfaceGeneralization_27_1_matchtggpattern_black_nac_2B(
									typeAcc) == null) {
								if (pattern_TypeAccess2InterfaceGeneralization_27_1_matchtggpattern_black_nac_3B(
										typeAcc) == null) {
									if (pattern_TypeAccess2InterfaceGeneralization_27_1_matchtggpattern_black_nac_4B(
											typeAcc) == null) {
										if (pattern_TypeAccess2InterfaceGeneralization_27_1_matchtggpattern_black_nac_5B(
												typeAcc) == null) {
											if (pattern_TypeAccess2InterfaceGeneralization_27_1_matchtggpattern_black_nac_6B(
													typeAcc) == null) {
												return new Object[] { classDec, typeAcc, superInterfaceDec };
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

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_28_1_matchtggpattern_blackBBB(
			Interface childInterface, Generalization interfaceGeneralization, Interface superInterface) {
		if (!childInterface.equals(superInterface)) {
			if (childInterface.getGeneralizations().contains(interfaceGeneralization)) {
				if (superInterface.equals(interfaceGeneralization.getGeneral())) {
					if (childInterface.getGenerals().contains(superInterface)) {
						return new Object[] { childInterface, interfaceGeneralization, superInterface };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_29_1_createresult_blackB(
			TypeAccess2InterfaceGeneralization _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Interface childInterface) {
		if (ruleResult.getTargetObjects().contains(childInterface)) {
			return new Object[] { ruleResult, childInterface };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element cd2c) {
		if (ruleResult.getCorrObjects().contains(cd2c)) {
			return new Object[] { ruleResult, cd2c };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, InterfaceDeclaration classDec) {
		if (ruleResult.getSourceObjects().contains(classDec)) {
			return new Object[] { ruleResult, classDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element cd2c2) {
		if (ruleResult.getCorrObjects().contains(cd2c2)) {
			return new Object[] { ruleResult, cd2c2 };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Interface superInterface) {
		if (ruleResult.getTargetObjects().contains(superInterface)) {
			return new Object[] { ruleResult, superInterface };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, InterfaceDeclaration superInterfaceDec) {
		if (ruleResult.getSourceObjects().contains(superInterfaceDec)) {
			return new Object[] { ruleResult, superInterfaceDec };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceGeneralization_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList cd2cList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList cd2c2List : ruleEntryContainer.getRuleEntryList()) {
				if (!cd2c2List.equals(cd2cList)) {
					for (EObject tmpCd2c : cd2cList.getEntryObjects()) {
						if (tmpCd2c instanceof ASTNode2Element) {
							ASTNode2Element cd2c = (ASTNode2Element) tmpCd2c;
							Element tmpChildInterface = cd2c.getTarget();
							if (tmpChildInterface instanceof Interface) {
								Interface childInterface = (Interface) tmpChildInterface;
								ASTNode tmpClassDec = cd2c.getSource();
								if (tmpClassDec instanceof InterfaceDeclaration) {
									InterfaceDeclaration classDec = (InterfaceDeclaration) tmpClassDec;
									if (pattern_TypeAccess2InterfaceGeneralization_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, cd2c) == null) {
										if (pattern_TypeAccess2InterfaceGeneralization_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, childInterface) == null) {
											if (pattern_TypeAccess2InterfaceGeneralization_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, classDec) == null) {
												for (EObject tmpCd2c2 : cd2c2List.getEntryObjects()) {
													if (tmpCd2c2 instanceof ASTNode2Element) {
														ASTNode2Element cd2c2 = (ASTNode2Element) tmpCd2c2;
														if (!cd2c.equals(cd2c2)) {
															Element tmpSuperInterface = cd2c2.getTarget();
															if (tmpSuperInterface instanceof Interface) {
																Interface superInterface = (Interface) tmpSuperInterface;
																if (!childInterface.equals(superInterface)) {
																	ASTNode tmpSuperInterfaceDec = cd2c2.getSource();
																	if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
																		InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
																		if (!classDec.equals(superInterfaceDec)) {
																			if (pattern_TypeAccess2InterfaceGeneralization_29_2_isapplicablecore_black_nac_3BB(
																					ruleResult, cd2c2) == null) {
																				if (pattern_TypeAccess2InterfaceGeneralization_29_2_isapplicablecore_black_nac_4BB(
																						ruleResult,
																						superInterface) == null) {
																					if (pattern_TypeAccess2InterfaceGeneralization_29_2_isapplicablecore_black_nac_5BB(
																							ruleResult,
																							superInterfaceDec) == null) {
																						_result.add(new Object[] {
																								cd2cList,
																								childInterface, cd2c,
																								classDec, cd2c2List,
																								cd2c2, superInterface,
																								superInterfaceDec,
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
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_29_3_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2InterfaceGeneralization _this, IsApplicableMatch isApplicableMatch, Interface childInterface,
			ASTNode2Element cd2c2, InterfaceDeclaration classDec, ASTNode2Element cd2c,
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, childInterface, cd2c2, classDec,
				cd2c, superInterfaceDec, superInterface, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, childInterface, cd2c2, classDec, cd2c,
					superInterfaceDec, superInterface, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2InterfaceGeneralization _this, IsApplicableMatch isApplicableMatch, Interface childInterface,
			ASTNode2Element cd2c2, InterfaceDeclaration classDec, ASTNode2Element cd2c,
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypeAccess2InterfaceGeneralization_29_3_solveCSP_binding = pattern_TypeAccess2InterfaceGeneralization_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, childInterface, cd2c2, classDec, cd2c, superInterfaceDec, superInterface,
				ruleResult);
		if (result_pattern_TypeAccess2InterfaceGeneralization_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceGeneralization_29_3_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceGeneralization_29_3_solveCSP_black = pattern_TypeAccess2InterfaceGeneralization_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceGeneralization_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, childInterface, cd2c2, classDec, cd2c,
						superInterfaceDec, superInterface, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2InterfaceGeneralization_29_4_checkCSP_expressionFBB(
			TypeAccess2InterfaceGeneralization _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_29_5_checknacs_blackBBBBBB(
			Interface childInterface, ASTNode2Element cd2c2, InterfaceDeclaration classDec, ASTNode2Element cd2c,
			InterfaceDeclaration superInterfaceDec, Interface superInterface) {
		if (!childInterface.equals(superInterface)) {
			if (!classDec.equals(superInterfaceDec)) {
				if (!cd2c.equals(cd2c2)) {
					return new Object[] { childInterface, cd2c2, classDec, cd2c, superInterfaceDec, superInterface };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_29_6_perform_blackBBBBBBB(
			Interface childInterface, ASTNode2Element cd2c2, InterfaceDeclaration classDec, ASTNode2Element cd2c,
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ModelgeneratorRuleResult ruleResult) {
		if (!childInterface.equals(superInterface)) {
			if (!classDec.equals(superInterfaceDec)) {
				if (!cd2c.equals(cd2c2)) {
					return new Object[] { childInterface, cd2c2, classDec, cd2c, superInterfaceDec, superInterface,
							ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceGeneralization_29_6_perform_greenBFBFFBBB(
			Interface childInterface, InterfaceDeclaration classDec, InterfaceDeclaration superInterfaceDec,
			Interface superInterface, ModelgeneratorRuleResult ruleResult) {
		TypeAccess2Generalization ta2g = UmlFactory.eINSTANCE.createTypeAccess2Generalization();
		TypeAccess typeAcc = JavaFactory.eINSTANCE.createTypeAccess();
		Generalization interfaceGeneralization = UMLFactory.eINSTANCE.createGeneralization();
		childInterface.getGenerals().add(superInterface);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(ta2g);
		classDec.getSuperInterfaces().add(typeAcc);
		typeAcc.setType(superInterfaceDec);
		ta2g.setSource(typeAcc);
		ruleResult.getSourceObjects().add(typeAcc);
		childInterface.getGeneralizations().add(interfaceGeneralization);
		ta2g.setTarget(interfaceGeneralization);
		interfaceGeneralization.setGeneral(superInterface);
		ruleResult.getTargetObjects().add(interfaceGeneralization);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { childInterface, ta2g, classDec, typeAcc, interfaceGeneralization, superInterfaceDec,
				superInterface, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_TypeAccess2InterfaceGeneralization_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypeAccess2InterfaceGeneralizationImpl
