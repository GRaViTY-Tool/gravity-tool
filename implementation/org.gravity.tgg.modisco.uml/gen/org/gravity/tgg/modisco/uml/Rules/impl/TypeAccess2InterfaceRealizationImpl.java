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
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.RulesPackage;
import org.gravity.tgg.modisco.uml.Rules.TypeAccess2InterfaceRealization;

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
 * An implementation of the model object '<em><b>Type Access2 Interface Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypeAccess2InterfaceRealizationImpl extends AbstractRuleImpl implements TypeAccess2InterfaceRealization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAccess2InterfaceRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTypeAccess2InterfaceRealization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, TypeAccess typeAcc, ClassDeclaration classDec,
			InterfaceDeclaration superInterfaceDec) {

		Object[] result1_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_0_1_initialbindings_blackBBBBB(this, match, typeAcc, classDec,
						superInterfaceDec);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeAcc] = " + typeAcc + ", " + "[classDec] = " + classDec + ", "
					+ "[superInterfaceDec] = " + superInterfaceDec + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, typeAcc,
						classDec, superInterfaceDec);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeAcc] = " + typeAcc + ", " + "[classDec] = " + classDec + ", "
					+ "[superInterfaceDec] = " + superInterfaceDec + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccess2InterfaceRealizationImpl.pattern_TypeAccess2InterfaceRealization_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_0_4_collectelementstobetranslated_blackBBBB(match, typeAcc,
							classDec, superInterfaceDec);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeAcc] = " + typeAcc + ", " + "[classDec] = " + classDec + ", " + "[superInterfaceDec] = "
						+ superInterfaceDec + ".");
			}
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_0_4_collectelementstobetranslated_greenBBBBFFF(match,
							typeAcc, classDec, superInterfaceDec);
			//nothing EMoflonEdge typeAcc__superInterfaceDec____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge classDec__typeAcc____superInterfaces = (EMoflonEdge) result4_green[6];

			Object[] result5_black = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_0_5_collectcontextelements_blackBBBB(match, typeAcc,
							classDec, superInterfaceDec);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeAcc] = " + typeAcc + ", " + "[classDec] = " + classDec + ", " + "[superInterfaceDec] = "
						+ superInterfaceDec + ".");
			}
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_0_5_collectcontextelements_greenBBB(match, classDec,
							superInterfaceDec);

			// 
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_0_6_registerobjectstomatch_expressionBBBBB(this, match,
							typeAcc, classDec, superInterfaceDec);
			return TypeAccess2InterfaceRealizationImpl.pattern_TypeAccess2InterfaceRealization_0_7_expressionF();
		} else {
			return TypeAccess2InterfaceRealizationImpl.pattern_TypeAccess2InterfaceRealization_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeAccess typeAcc = (TypeAccess) result1_bindingAndBlack[0];
		Interface superInterface = (Interface) result1_bindingAndBlack[1];
		ClassDeclaration classDec = (ClassDeclaration) result1_bindingAndBlack[2];
		ASTNode2Element cd2c2 = (ASTNode2Element) result1_bindingAndBlack[3];
		BehavioredClassifier umlClass = (BehavioredClassifier) result1_bindingAndBlack[4];
		InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result1_bindingAndBlack[5];
		ASTNode2Element cd2c = (ASTNode2Element) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_greenBBFFB(typeAcc, superInterface,
						umlClass);
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization) result1_green[2];
		InterfaceRealization interfaceRealization = (InterfaceRealization) result1_green[3];

		Object[] result2_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_2_collecttranslatedelements_blackBBB(typeAcc, ta2g,
						interfaceRealization);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[typeAcc] = " + typeAcc + ", "
					+ "[ta2g] = " + ta2g + ", " + "[interfaceRealization] = " + interfaceRealization + ".");
		}
		Object[] result2_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_2_collecttranslatedelements_greenFBBB(typeAcc, ta2g,
						interfaceRealization);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, typeAcc,
						superInterface, ta2g, classDec, cd2c2, interfaceRealization, umlClass, superInterfaceDec, cd2c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[typeAcc] = " + typeAcc + ", " + "[superInterface] = " + superInterface + ", "
					+ "[ta2g] = " + ta2g + ", " + "[classDec] = " + classDec + ", " + "[cd2c2] = " + cd2c2 + ", "
					+ "[interfaceRealization] = " + interfaceRealization + ", " + "[umlClass] = " + umlClass + ", "
					+ "[superInterfaceDec] = " + superInterfaceDec + ", " + "[cd2c] = " + cd2c + ".");
		}
		TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFF(ruleresult,
						typeAcc, superInterface, ta2g, classDec, interfaceRealization, umlClass, superInterfaceDec);
		//nothing EMoflonEdge typeAcc__superInterfaceDec____type = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge ta2g__typeAcc____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge classDec__typeAcc____superInterfaces = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge ta2g__interfaceRealization____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge interfaceRealization__superInterface____contract = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge umlClass__interfaceRealization____interfaceRealization = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge interfaceRealization__umlClass____implementingClassifier = (EMoflonEdge) result3_green[15];

		// 
		// 
		TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
						typeAcc, superInterface, ta2g, classDec, cd2c2, interfaceRealization, umlClass,
						superInterfaceDec, cd2c);
		return TypeAccess2InterfaceRealizationImpl.pattern_TypeAccess2InterfaceRealization_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeAccess typeAcc = (TypeAccess) result2_binding[0];
		ClassDeclaration classDec = (ClassDeclaration) result2_binding[1];
		InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_binding[2];
		for (Object[] result2_black : TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_2_2_corematch_blackBFBFFBFB(typeAcc, classDec,
						superInterfaceDec, match)) {
			Interface superInterface = (Interface) result2_black[1];
			ASTNode2Element cd2c2 = (ASTNode2Element) result2_black[3];
			BehavioredClassifier umlClass = (BehavioredClassifier) result2_black[4];
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[6];
			// ForEach 
			for (Object[] result3_black : TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_2_3_findcontext_blackBBBBBBB(typeAcc, superInterface,
							classDec, cd2c2, umlClass, superInterfaceDec, cd2c)) {
				Object[] result3_green = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_2_3_findcontext_greenBBBBBBBFFFFFFFF(typeAcc,
								superInterface, classDec, cd2c2, umlClass, superInterfaceDec, cd2c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge typeAcc__superInterfaceDec____type = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge cd2c2__superInterface____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge classDec__typeAcc____superInterfaces = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge cd2c2__superInterfaceDec____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge cd2c__classDec____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge cd2c__umlClass____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, typeAcc, superInterface, classDec, cd2c2, umlClass,
								superInterfaceDec, cd2c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[typeAcc] = " + typeAcc + ", "
							+ "[superInterface] = " + superInterface + ", " + "[classDec] = " + classDec + ", "
							+ "[cd2c2] = " + cd2c2 + ", " + "[umlClass] = " + umlClass + ", " + "[superInterfaceDec] = "
							+ superInterfaceDec + ", " + "[cd2c] = " + cd2c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeAccess2InterfaceRealizationImpl
							.pattern_TypeAccess2InterfaceRealization_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeAccess2InterfaceRealizationImpl
							.pattern_TypeAccess2InterfaceRealization_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return TypeAccess2InterfaceRealizationImpl.pattern_TypeAccess2InterfaceRealization_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, TypeAccess typeAcc, ClassDeclaration classDec,
			InterfaceDeclaration superInterfaceDec) {
		match.registerObject("typeAcc", typeAcc);
		match.registerObject("classDec", classDec);
		match.registerObject("superInterfaceDec", superInterfaceDec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, TypeAccess typeAcc, ClassDeclaration classDec,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeAccess typeAcc,
			Interface superInterface, ClassDeclaration classDec, ASTNode2Element cd2c2, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, ASTNode2Element cd2c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("typeAcc", typeAcc);
		isApplicableMatch.registerObject("superInterface", superInterface);
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("cd2c2", cd2c2);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("superInterfaceDec", superInterfaceDec);
		isApplicableMatch.registerObject("cd2c", cd2c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject typeAcc, EObject superInterface, EObject ta2g,
			EObject classDec, EObject cd2c2, EObject interfaceRealization, EObject umlClass, EObject superInterfaceDec,
			EObject cd2c) {
		ruleresult.registerObject("typeAcc", typeAcc);
		ruleresult.registerObject("superInterface", superInterface);
		ruleresult.registerObject("ta2g", ta2g);
		ruleresult.registerObject("classDec", classDec);
		ruleresult.registerObject("cd2c2", cd2c2);
		ruleresult.registerObject("interfaceRealization", interfaceRealization);
		ruleresult.registerObject("umlClass", umlClass);
		ruleresult.registerObject("superInterfaceDec", superInterfaceDec);
		ruleresult.registerObject("cd2c", cd2c);

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
	public boolean isAppropriate_BWD(Match match, Interface superInterface, InterfaceRealization interfaceRealization,
			BehavioredClassifier umlClass) {

		Object[] result1_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_10_1_initialbindings_blackBBBBB(this, match, superInterface,
						interfaceRealization, umlClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[superInterface] = " + superInterface + ", "
					+ "[interfaceRealization] = " + interfaceRealization + ", " + "[umlClass] = " + umlClass + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
						superInterface, interfaceRealization, umlClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[superInterface] = " + superInterface + ", "
					+ "[interfaceRealization] = " + interfaceRealization + ", " + "[umlClass] = " + umlClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_10_4_collectelementstobetranslated_blackBBBB(match,
							superInterface, interfaceRealization, umlClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[superInterface] = " + superInterface + ", " + "[interfaceRealization] = "
						+ interfaceRealization + ", " + "[umlClass] = " + umlClass + ".");
			}
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_10_4_collectelementstobetranslated_greenBBBBFFF(match,
							superInterface, interfaceRealization, umlClass);
			//nothing EMoflonEdge interfaceRealization__superInterface____contract = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge umlClass__interfaceRealization____interfaceRealization = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge interfaceRealization__umlClass____implementingClassifier = (EMoflonEdge) result4_green[6];

			Object[] result5_black = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_10_5_collectcontextelements_blackBBBB(match,
							superInterface, interfaceRealization, umlClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[superInterface] = " + superInterface + ", " + "[interfaceRealization] = "
						+ interfaceRealization + ", " + "[umlClass] = " + umlClass + ".");
			}
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_10_5_collectcontextelements_greenBBB(match, superInterface,
							umlClass);

			// 
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							superInterface, interfaceRealization, umlClass);
			return TypeAccess2InterfaceRealizationImpl.pattern_TypeAccess2InterfaceRealization_10_7_expressionF();
		} else {
			return TypeAccess2InterfaceRealizationImpl.pattern_TypeAccess2InterfaceRealization_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Interface superInterface = (Interface) result1_bindingAndBlack[0];
		ClassDeclaration classDec = (ClassDeclaration) result1_bindingAndBlack[1];
		ASTNode2Element cd2c2 = (ASTNode2Element) result1_bindingAndBlack[2];
		InterfaceRealization interfaceRealization = (InterfaceRealization) result1_bindingAndBlack[3];
		BehavioredClassifier umlClass = (BehavioredClassifier) result1_bindingAndBlack[4];
		InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result1_bindingAndBlack[5];
		ASTNode2Element cd2c = (ASTNode2Element) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_greenFFBBB(classDec,
						interfaceRealization, superInterfaceDec);
		TypeAccess typeAcc = (TypeAccess) result1_green[0];
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization) result1_green[1];

		Object[] result2_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_2_collecttranslatedelements_blackBBB(typeAcc, ta2g,
						interfaceRealization);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[typeAcc] = " + typeAcc + ", "
					+ "[ta2g] = " + ta2g + ", " + "[interfaceRealization] = " + interfaceRealization + ".");
		}
		Object[] result2_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_2_collecttranslatedelements_greenFBBB(typeAcc, ta2g,
						interfaceRealization);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, typeAcc,
						superInterface, ta2g, classDec, cd2c2, interfaceRealization, umlClass, superInterfaceDec, cd2c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[typeAcc] = " + typeAcc + ", " + "[superInterface] = " + superInterface + ", "
					+ "[ta2g] = " + ta2g + ", " + "[classDec] = " + classDec + ", " + "[cd2c2] = " + cd2c2 + ", "
					+ "[interfaceRealization] = " + interfaceRealization + ", " + "[umlClass] = " + umlClass + ", "
					+ "[superInterfaceDec] = " + superInterfaceDec + ", " + "[cd2c] = " + cd2c + ".");
		}
		TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFF(ruleresult,
						typeAcc, superInterface, ta2g, classDec, interfaceRealization, umlClass, superInterfaceDec);
		//nothing EMoflonEdge typeAcc__superInterfaceDec____type = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge ta2g__typeAcc____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge classDec__typeAcc____superInterfaces = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge ta2g__interfaceRealization____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge interfaceRealization__superInterface____contract = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge umlClass__interfaceRealization____interfaceRealization = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge interfaceRealization__umlClass____implementingClassifier = (EMoflonEdge) result3_green[15];

		// 
		// 
		TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
						typeAcc, superInterface, ta2g, classDec, cd2c2, interfaceRealization, umlClass,
						superInterfaceDec, cd2c);
		return TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Interface superInterface = (Interface) result2_binding[0];
		InterfaceRealization interfaceRealization = (InterfaceRealization) result2_binding[1];
		BehavioredClassifier umlClass = (BehavioredClassifier) result2_binding[2];
		for (Object[] result2_black : TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_12_2_corematch_blackBFFBBFFB(superInterface,
						interfaceRealization, umlClass, match)) {
			ClassDeclaration classDec = (ClassDeclaration) result2_black[1];
			ASTNode2Element cd2c2 = (ASTNode2Element) result2_black[2];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_black[5];
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[6];
			// ForEach 
			for (Object[] result3_black : TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_12_3_findcontext_blackBBBBBBB(superInterface, classDec,
							cd2c2, interfaceRealization, umlClass, superInterfaceDec, cd2c)) {
				Object[] result3_green = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_12_3_findcontext_greenBBBBBBBFFFFFFFF(superInterface,
								classDec, cd2c2, interfaceRealization, umlClass, superInterfaceDec, cd2c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge cd2c2__superInterface____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge interfaceRealization__superInterface____contract = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge cd2c2__superInterfaceDec____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge cd2c__classDec____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge cd2c__umlClass____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge umlClass__interfaceRealization____interfaceRealization = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge interfaceRealization__umlClass____implementingClassifier = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, superInterface, classDec, cd2c2, interfaceRealization, umlClass,
								superInterfaceDec, cd2c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[superInterface] = "
							+ superInterface + ", " + "[classDec] = " + classDec + ", " + "[cd2c2] = " + cd2c2 + ", "
							+ "[interfaceRealization] = " + interfaceRealization + ", " + "[umlClass] = " + umlClass
							+ ", " + "[superInterfaceDec] = " + superInterfaceDec + ", " + "[cd2c] = " + cd2c + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeAccess2InterfaceRealizationImpl
							.pattern_TypeAccess2InterfaceRealization_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeAccess2InterfaceRealizationImpl
							.pattern_TypeAccess2InterfaceRealization_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Interface superInterface,
			InterfaceRealization interfaceRealization, BehavioredClassifier umlClass) {
		match.registerObject("superInterface", superInterface);
		match.registerObject("interfaceRealization", interfaceRealization);
		match.registerObject("umlClass", umlClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Interface superInterface,
			InterfaceRealization interfaceRealization, BehavioredClassifier umlClass) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Interface superInterface,
			ClassDeclaration classDec, ASTNode2Element cd2c2, InterfaceRealization interfaceRealization,
			BehavioredClassifier umlClass, InterfaceDeclaration superInterfaceDec, ASTNode2Element cd2c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("superInterface", superInterface);
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("cd2c2", cd2c2);
		isApplicableMatch.registerObject("interfaceRealization", interfaceRealization);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("superInterfaceDec", superInterfaceDec);
		isApplicableMatch.registerObject("cd2c", cd2c);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject typeAcc, EObject superInterface, EObject ta2g,
			EObject classDec, EObject cd2c2, EObject interfaceRealization, EObject umlClass, EObject superInterfaceDec,
			EObject cd2c) {
		ruleresult.registerObject("typeAcc", typeAcc);
		ruleresult.registerObject("superInterface", superInterface);
		ruleresult.registerObject("ta2g", ta2g);
		ruleresult.registerObject("classDec", classDec);
		ruleresult.registerObject("cd2c2", cd2c2);
		ruleresult.registerObject("interfaceRealization", interfaceRealization);
		ruleresult.registerObject("umlClass", umlClass);
		ruleresult.registerObject("superInterfaceDec", superInterfaceDec);
		ruleresult.registerObject("cd2c", cd2c);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("interfaceRealization").eClass())
				.equals("uml.InterfaceRealization.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_153(EMoflonEdge _edge_contract) {

		Object[] result1_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_blackFFFB(_edge_contract)) {
			Interface superInterface = (Interface) result2_black[0];
			InterfaceRealization interfaceRealization = (InterfaceRealization) result2_black[1];
			BehavioredClassifier umlClass = (BehavioredClassifier) result2_black[2];
			Object[] result2_green = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, superInterface, interfaceRealization, umlClass)) {
				// 
				if (TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeAccess2InterfaceRealizationImpl
							.pattern_TypeAccess2InterfaceRealization_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeAccess2InterfaceRealizationImpl
							.pattern_TypeAccess2InterfaceRealization_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeAccess2InterfaceRealizationImpl.pattern_TypeAccess2InterfaceRealization_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_165(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_blackFFFB(_edge_type)) {
			TypeAccess typeAcc = (TypeAccess) result2_black[0];
			ClassDeclaration classDec = (ClassDeclaration) result2_black[1];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_black[2];
			Object[] result2_green = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, typeAcc, classDec, superInterfaceDec)) {
				// 
				if (TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeAccess2InterfaceRealizationImpl
							.pattern_TypeAccess2InterfaceRealization_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeAccess2InterfaceRealizationImpl
							.pattern_TypeAccess2InterfaceRealization_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeAccess2InterfaceRealizationImpl.pattern_TypeAccess2InterfaceRealization_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TypeAccess2InterfaceRealization");
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
		ruleResult.setRule("TypeAccess2InterfaceRealization");
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

		Object[] result1_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TypeAccess typeAcc = (TypeAccess) result2_bindingAndBlack[0];
		Interface superInterface = (Interface) result2_bindingAndBlack[1];
		ClassDeclaration classDec = (ClassDeclaration) result2_bindingAndBlack[2];
		InterfaceRealization interfaceRealization = (InterfaceRealization) result2_bindingAndBlack[3];
		BehavioredClassifier umlClass = (BehavioredClassifier) result2_bindingAndBlack[4];
		InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, typeAcc,
						superInterface, classDec, interfaceRealization, umlClass, superInterfaceDec, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[typeAcc] = " + typeAcc + ", " + "[superInterface] = " + superInterface + ", " + "[classDec] = "
					+ classDec + ", " + "[interfaceRealization] = " + interfaceRealization + ", " + "[umlClass] = "
					+ umlClass + ", " + "[superInterfaceDec] = " + superInterfaceDec + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_24_5_matchcorrcontext_blackBBFBBFBB(superInterface,
							classDec, umlClass, superInterfaceDec, sourceMatch, targetMatch)) {
				ASTNode2Element cd2c2 = (ASTNode2Element) result5_black[2];
				ASTNode2Element cd2c = (ASTNode2Element) result5_black[5];
				Object[] result5_green = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_24_5_matchcorrcontext_greenBBBBF(cd2c2, cd2c,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_24_6_createcorrespondence_blackBBBBBBB(typeAcc,
								superInterface, classDec, interfaceRealization, umlClass, superInterfaceDec, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[typeAcc] = " + typeAcc
							+ ", " + "[superInterface] = " + superInterface + ", " + "[classDec] = " + classDec + ", "
							+ "[interfaceRealization] = " + interfaceRealization + ", " + "[umlClass] = " + umlClass
							+ ", " + "[superInterfaceDec] = " + superInterfaceDec + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_24_6_createcorrespondence_greenBFBB(typeAcc,
								interfaceRealization, ccMatch);
				//nothing org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization) result6_green[1];

				Object[] result7_black = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return TypeAccess2InterfaceRealizationImpl.pattern_TypeAccess2InterfaceRealization_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TypeAccess typeAcc, Interface superInterface, ClassDeclaration classDec,
			InterfaceRealization interfaceRealization, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(TypeAccess typeAcc, ClassDeclaration classDec, InterfaceDeclaration superInterfaceDec) {// 
		Object[] result1_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_blackBBB(typeAcc, classDec,
						superInterfaceDec);
		if (result1_black != null) {
			return TypeAccess2InterfaceRealizationImpl.pattern_TypeAccess2InterfaceRealization_27_2_expressionF();
		} else {
			return TypeAccess2InterfaceRealizationImpl.pattern_TypeAccess2InterfaceRealization_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Interface superInterface, InterfaceRealization interfaceRealization,
			BehavioredClassifier umlClass) {// 
		Object[] result1_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_blackBBB(superInterface,
						interfaceRealization, umlClass);
		if (result1_black != null) {
			return TypeAccess2InterfaceRealizationImpl.pattern_TypeAccess2InterfaceRealization_28_2_expressionF();
		} else {
			return TypeAccess2InterfaceRealizationImpl.pattern_TypeAccess2InterfaceRealization_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element cd2c2Parameter,
			ASTNode2Element cd2cParameter) {

		Object[] result1_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList cd2c2List = (RuleEntryList) result2_black[0];
			Interface superInterface = (Interface) result2_black[1];
			ASTNode2Element cd2c2 = (ASTNode2Element) result2_black[2];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_black[3];
			//nothing RuleEntryList cd2cList = (RuleEntryList) result2_black[4];
			ClassDeclaration classDec = (ClassDeclaration) result2_black[5];
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[6];
			BehavioredClassifier umlClass = (BehavioredClassifier) result2_black[7];

			Object[] result3_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, superInterface, classDec, cd2c2, umlClass, superInterfaceDec, cd2c,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[superInterface] = " + superInterface
						+ ", " + "[classDec] = " + classDec + ", " + "[cd2c2] = " + cd2c2 + ", " + "[umlClass] = "
						+ umlClass + ", " + "[superInterfaceDec] = " + superInterfaceDec + ", " + "[cd2c] = " + cd2c
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_29_5_checknacs_blackBBBBBB(superInterface, classDec,
								cd2c2, umlClass, superInterfaceDec, cd2c);
				if (result5_black != null) {

					Object[] result6_black = TypeAccess2InterfaceRealizationImpl
							.pattern_TypeAccess2InterfaceRealization_29_6_perform_blackBBBBBBB(superInterface, classDec,
									cd2c2, umlClass, superInterfaceDec, cd2c, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[superInterface] = "
								+ superInterface + ", " + "[classDec] = " + classDec + ", " + "[cd2c2] = " + cd2c2
								+ ", " + "[umlClass] = " + umlClass + ", " + "[superInterfaceDec] = "
								+ superInterfaceDec + ", " + "[cd2c] = " + cd2c + ", " + "[ruleResult] = " + ruleResult
								+ ".");
					}
					TypeAccess2InterfaceRealizationImpl
							.pattern_TypeAccess2InterfaceRealization_29_6_perform_greenFBFBFBBB(superInterface,
									classDec, umlClass, superInterfaceDec, ruleResult);
					//nothing TypeAccess typeAcc = (TypeAccess) result6_green[0];
					//nothing org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization) result6_green[2];
					//nothing InterfaceRealization interfaceRealization = (InterfaceRealization) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Interface superInterface,
			ClassDeclaration classDec, ASTNode2Element cd2c2, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, ASTNode2Element cd2c, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("superInterface", superInterface);
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("cd2c2", cd2c2);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("superInterfaceDec", superInterfaceDec);
		isApplicableMatch.registerObject("cd2c", cd2c);
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
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_FWD__MATCH_TYPEACCESS_CLASSDECLARATION_INTERFACEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPEACCESS_CLASSDECLARATION_INTERFACEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
			return null;
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPEACCESS_CLASSDECLARATION_INTERFACEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPEACCESS_INTERFACE_CLASSDECLARATION_ASTNODE2ELEMENT_BEHAVIOREDCLASSIFIER_INTERFACEDECLARATION_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TypeAccess) arguments.get(1),
					(Interface) arguments.get(2), (ClassDeclaration) arguments.get(3),
					(ASTNode2Element) arguments.get(4), (BehavioredClassifier) arguments.get(5),
					(InterfaceDeclaration) arguments.get(6), (ASTNode2Element) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_BWD__MATCH_INTERFACE_INTERFACEREALIZATION_BEHAVIOREDCLASSIFIER:
			return isAppropriate_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
					(InterfaceRealization) arguments.get(2), (BehavioredClassifier) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERFACE_INTERFACEREALIZATION_BEHAVIOREDCLASSIFIER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
					(InterfaceRealization) arguments.get(2), (BehavioredClassifier) arguments.get(3));
			return null;
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERFACE_INTERFACEREALIZATION_BEHAVIOREDCLASSIFIER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
					(InterfaceRealization) arguments.get(2), (BehavioredClassifier) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERFACE_CLASSDECLARATION_ASTNODE2ELEMENT_INTERFACEREALIZATION_BEHAVIOREDCLASSIFIER_INTERFACEDECLARATION_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Interface) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (ASTNode2Element) arguments.get(3),
					(InterfaceRealization) arguments.get(4), (BehavioredClassifier) arguments.get(5),
					(InterfaceDeclaration) arguments.get(6), (ASTNode2Element) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_153__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_153((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_165__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_165((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_SOLVE_CSP_CC__TYPEACCESS_INTERFACE_CLASSDECLARATION_INTERFACEREALIZATION_BEHAVIOREDCLASSIFIER_INTERFACEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TypeAccess) arguments.get(0), (Interface) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (InterfaceRealization) arguments.get(3),
					(BehavioredClassifier) arguments.get(4), (InterfaceDeclaration) arguments.get(5),
					(Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___CHECK_DEC_FWD__TYPEACCESS_CLASSDECLARATION_INTERFACEDECLARATION:
			return checkDEC_FWD((TypeAccess) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___CHECK_DEC_BWD__INTERFACE_INTERFACEREALIZATION_BEHAVIOREDCLASSIFIER:
			return checkDEC_BWD((Interface) arguments.get(0), (InterfaceRealization) arguments.get(1),
					(BehavioredClassifier) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERFACE_CLASSDECLARATION_ASTNODE2ELEMENT_BEHAVIOREDCLASSIFIER_INTERFACEDECLARATION_ASTNODE2ELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Interface) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (ASTNode2Element) arguments.get(3),
					(BehavioredClassifier) arguments.get(4), (InterfaceDeclaration) arguments.get(5),
					(ASTNode2Element) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_1_initialbindings_blackBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, TypeAccess typeAcc, ClassDeclaration classDec,
			InterfaceDeclaration superInterfaceDec) {
		return new Object[] { _this, match, typeAcc, classDec, superInterfaceDec };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_bindingFBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, TypeAccess typeAcc, ClassDeclaration classDec,
			InterfaceDeclaration superInterfaceDec) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, typeAcc, classDec, superInterfaceDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, typeAcc, classDec, superInterfaceDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_bindingAndBlackFBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, TypeAccess typeAcc, ClassDeclaration classDec,
			InterfaceDeclaration superInterfaceDec) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_binding = pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_bindingFBBBBB(
				_this, match, typeAcc, classDec, superInterfaceDec);
		if (result_pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_black = pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, typeAcc, classDec, superInterfaceDec };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_0_3_CheckCSP_expressionFBB(
			TypeAccess2InterfaceRealization _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_4_collectelementstobetranslated_blackBBBB(
			Match match, TypeAccess typeAcc, ClassDeclaration classDec, InterfaceDeclaration superInterfaceDec) {
		return new Object[] { match, typeAcc, classDec, superInterfaceDec };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, TypeAccess typeAcc, ClassDeclaration classDec, InterfaceDeclaration superInterfaceDec) {
		EMoflonEdge typeAcc__superInterfaceDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__typeAcc____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(typeAcc);
		String typeAcc__superInterfaceDec____type_name_prime = "type";
		String superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String classDec__typeAcc____superInterfaces_name_prime = "superInterfaces";
		typeAcc__superInterfaceDec____type.setSrc(typeAcc);
		typeAcc__superInterfaceDec____type.setTrg(superInterfaceDec);
		match.getToBeTranslatedEdges().add(typeAcc__superInterfaceDec____type);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setSrc(superInterfaceDec);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		match.getToBeTranslatedEdges().add(superInterfaceDec__typeAcc____usagesInTypeAccess);
		classDec__typeAcc____superInterfaces.setSrc(classDec);
		classDec__typeAcc____superInterfaces.setTrg(typeAcc);
		match.getToBeTranslatedEdges().add(classDec__typeAcc____superInterfaces);
		typeAcc__superInterfaceDec____type.setName(typeAcc__superInterfaceDec____type_name_prime);
		superInterfaceDec__typeAcc____usagesInTypeAccess
				.setName(superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime);
		classDec__typeAcc____superInterfaces.setName(classDec__typeAcc____superInterfaces_name_prime);
		return new Object[] { match, typeAcc, classDec, superInterfaceDec, typeAcc__superInterfaceDec____type,
				superInterfaceDec__typeAcc____usagesInTypeAccess, classDec__typeAcc____superInterfaces };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_5_collectcontextelements_blackBBBB(
			Match match, TypeAccess typeAcc, ClassDeclaration classDec, InterfaceDeclaration superInterfaceDec) {
		return new Object[] { match, typeAcc, classDec, superInterfaceDec };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_5_collectcontextelements_greenBBB(
			Match match, ClassDeclaration classDec, InterfaceDeclaration superInterfaceDec) {
		match.getContextNodes().add(classDec);
		match.getContextNodes().add(superInterfaceDec);
		return new Object[] { match, classDec, superInterfaceDec };
	}

	public static final void pattern_TypeAccess2InterfaceRealization_0_6_registerobjectstomatch_expressionBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, TypeAccess typeAcc, ClassDeclaration classDec,
			InterfaceDeclaration superInterfaceDec) {
		_this.registerObjectsToMatch_FWD(match, typeAcc, classDec, superInterfaceDec);

	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("typeAcc");
		EObject _localVariable_1 = isApplicableMatch.getObject("superInterface");
		EObject _localVariable_2 = isApplicableMatch.getObject("classDec");
		EObject _localVariable_3 = isApplicableMatch.getObject("cd2c2");
		EObject _localVariable_4 = isApplicableMatch.getObject("umlClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("superInterfaceDec");
		EObject _localVariable_6 = isApplicableMatch.getObject("cd2c");
		EObject tmpTypeAcc = _localVariable_0;
		EObject tmpSuperInterface = _localVariable_1;
		EObject tmpClassDec = _localVariable_2;
		EObject tmpCd2c2 = _localVariable_3;
		EObject tmpUmlClass = _localVariable_4;
		EObject tmpSuperInterfaceDec = _localVariable_5;
		EObject tmpCd2c = _localVariable_6;
		if (tmpTypeAcc instanceof TypeAccess) {
			TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
			if (tmpSuperInterface instanceof Interface) {
				Interface superInterface = (Interface) tmpSuperInterface;
				if (tmpClassDec instanceof ClassDeclaration) {
					ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
					if (tmpCd2c2 instanceof ASTNode2Element) {
						ASTNode2Element cd2c2 = (ASTNode2Element) tmpCd2c2;
						if (tmpUmlClass instanceof BehavioredClassifier) {
							BehavioredClassifier umlClass = (BehavioredClassifier) tmpUmlClass;
							if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
								InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
								if (tmpCd2c instanceof ASTNode2Element) {
									ASTNode2Element cd2c = (ASTNode2Element) tmpCd2c;
									return new Object[] { typeAcc, superInterface, classDec, cd2c2, umlClass,
											superInterfaceDec, cd2c, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_blackBBBBBBBFBB(
			TypeAccess typeAcc, Interface superInterface, ClassDeclaration classDec, ASTNode2Element cd2c2,
			BehavioredClassifier umlClass, InterfaceDeclaration superInterfaceDec, ASTNode2Element cd2c,
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch) {
		if (!cd2c.equals(cd2c2)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { typeAcc, superInterface, classDec, cd2c2, umlClass, superInterfaceDec, cd2c,
							csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding = pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding != null) {
			TypeAccess typeAcc = (TypeAccess) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[0];
			Interface superInterface = (Interface) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[1];
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[2];
			ASTNode2Element cd2c2 = (ASTNode2Element) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[3];
			BehavioredClassifier umlClass = (BehavioredClassifier) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[4];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[5];
			ASTNode2Element cd2c = (ASTNode2Element) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[6];

			Object[] result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_black = pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_blackBBBBBBBFBB(
					typeAcc, superInterface, classDec, cd2c2, umlClass, superInterfaceDec, cd2c, _this,
					isApplicableMatch);
			if (result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_black[7];

				return new Object[] { typeAcc, superInterface, classDec, cd2c2, umlClass, superInterfaceDec, cd2c, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_greenBBFFB(
			TypeAccess typeAcc, Interface superInterface, BehavioredClassifier umlClass) {
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2InterfaceRealization();
		InterfaceRealization interfaceRealization = UMLFactory.eINSTANCE.createInterfaceRealization();
		ta2g.setSource(typeAcc);
		ta2g.setTarget(interfaceRealization);
		interfaceRealization.setContract(superInterface);
		umlClass.getInterfaceRealizations().add(interfaceRealization);
		return new Object[] { typeAcc, superInterface, ta2g, interfaceRealization, umlClass };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_1_2_collecttranslatedelements_blackBBB(
			TypeAccess typeAcc, org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g,
			InterfaceRealization interfaceRealization) {
		return new Object[] { typeAcc, ta2g, interfaceRealization };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_1_2_collecttranslatedelements_greenFBBB(
			TypeAccess typeAcc, org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g,
			InterfaceRealization interfaceRealization) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(typeAcc);
		ruleresult.getCreatedLinkElements().add(ta2g);
		ruleresult.getCreatedElements().add(interfaceRealization);
		return new Object[] { ruleresult, typeAcc, ta2g, interfaceRealization };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject typeAcc, EObject superInterface, EObject ta2g, EObject classDec,
			EObject cd2c2, EObject interfaceRealization, EObject umlClass, EObject superInterfaceDec, EObject cd2c) {
		if (!typeAcc.equals(umlClass)) {
			if (!superInterface.equals(typeAcc)) {
				if (!superInterface.equals(ta2g)) {
					if (!superInterface.equals(umlClass)) {
						if (!superInterface.equals(superInterfaceDec)) {
							if (!ta2g.equals(typeAcc)) {
								if (!ta2g.equals(umlClass)) {
									if (!classDec.equals(typeAcc)) {
										if (!classDec.equals(superInterface)) {
											if (!classDec.equals(ta2g)) {
												if (!classDec.equals(interfaceRealization)) {
													if (!classDec.equals(umlClass)) {
														if (!classDec.equals(superInterfaceDec)) {
															if (!cd2c2.equals(typeAcc)) {
																if (!cd2c2.equals(superInterface)) {
																	if (!cd2c2.equals(ta2g)) {
																		if (!cd2c2.equals(classDec)) {
																			if (!cd2c2.equals(interfaceRealization)) {
																				if (!cd2c2.equals(umlClass)) {
																					if (!cd2c2.equals(
																							superInterfaceDec)) {
																						if (!interfaceRealization
																								.equals(typeAcc)) {
																							if (!interfaceRealization
																									.equals(superInterface)) {
																								if (!interfaceRealization
																										.equals(ta2g)) {
																									if (!interfaceRealization
																											.equals(umlClass)) {
																										if (!interfaceRealization
																												.equals(superInterfaceDec)) {
																											if (!superInterfaceDec
																													.equals(typeAcc)) {
																												if (!superInterfaceDec
																														.equals(ta2g)) {
																													if (!superInterfaceDec
																															.equals(umlClass)) {
																														if (!cd2c
																																.equals(typeAcc)) {
																															if (!cd2c
																																	.equals(superInterface)) {
																																if (!cd2c
																																		.equals(ta2g)) {
																																	if (!cd2c
																																			.equals(classDec)) {
																																		if (!cd2c
																																				.equals(cd2c2)) {
																																			if (!cd2c
																																					.equals(interfaceRealization)) {
																																				if (!cd2c
																																						.equals(umlClass)) {
																																					if (!cd2c
																																							.equals(superInterfaceDec)) {
																																						return new Object[] {
																																								ruleresult,
																																								typeAcc,
																																								superInterface,
																																								ta2g,
																																								classDec,
																																								cd2c2,
																																								interfaceRealization,
																																								umlClass,
																																								superInterfaceDec,
																																								cd2c };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeAccess2InterfaceRealization_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject typeAcc, EObject superInterface, EObject ta2g, EObject classDec,
			EObject interfaceRealization, EObject umlClass, EObject superInterfaceDec) {
		EMoflonEdge typeAcc__superInterfaceDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__typeAcc____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__typeAcc____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__interfaceRealization____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge interfaceRealization__superInterface____contract = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClass__interfaceRealization____interfaceRealization = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interfaceRealization__umlClass____implementingClassifier = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccess2InterfaceRealization";
		String typeAcc__superInterfaceDec____type_name_prime = "type";
		String superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String ta2g__typeAcc____source_name_prime = "source";
		String classDec__typeAcc____superInterfaces_name_prime = "superInterfaces";
		String ta2g__interfaceRealization____target_name_prime = "target";
		String interfaceRealization__superInterface____contract_name_prime = "contract";
		String umlClass__interfaceRealization____interfaceRealization_name_prime = "interfaceRealization";
		String interfaceRealization__umlClass____implementingClassifier_name_prime = "implementingClassifier";
		typeAcc__superInterfaceDec____type.setSrc(typeAcc);
		typeAcc__superInterfaceDec____type.setTrg(superInterfaceDec);
		ruleresult.getTranslatedEdges().add(typeAcc__superInterfaceDec____type);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setSrc(superInterfaceDec);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		ruleresult.getTranslatedEdges().add(superInterfaceDec__typeAcc____usagesInTypeAccess);
		ta2g__typeAcc____source.setSrc(ta2g);
		ta2g__typeAcc____source.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(ta2g__typeAcc____source);
		classDec__typeAcc____superInterfaces.setSrc(classDec);
		classDec__typeAcc____superInterfaces.setTrg(typeAcc);
		ruleresult.getTranslatedEdges().add(classDec__typeAcc____superInterfaces);
		ta2g__interfaceRealization____target.setSrc(ta2g);
		ta2g__interfaceRealization____target.setTrg(interfaceRealization);
		ruleresult.getCreatedEdges().add(ta2g__interfaceRealization____target);
		interfaceRealization__superInterface____contract.setSrc(interfaceRealization);
		interfaceRealization__superInterface____contract.setTrg(superInterface);
		ruleresult.getCreatedEdges().add(interfaceRealization__superInterface____contract);
		umlClass__interfaceRealization____interfaceRealization.setSrc(umlClass);
		umlClass__interfaceRealization____interfaceRealization.setTrg(interfaceRealization);
		ruleresult.getCreatedEdges().add(umlClass__interfaceRealization____interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setSrc(interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setTrg(umlClass);
		ruleresult.getCreatedEdges().add(interfaceRealization__umlClass____implementingClassifier);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		typeAcc__superInterfaceDec____type.setName(typeAcc__superInterfaceDec____type_name_prime);
		superInterfaceDec__typeAcc____usagesInTypeAccess
				.setName(superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime);
		ta2g__typeAcc____source.setName(ta2g__typeAcc____source_name_prime);
		classDec__typeAcc____superInterfaces.setName(classDec__typeAcc____superInterfaces_name_prime);
		ta2g__interfaceRealization____target.setName(ta2g__interfaceRealization____target_name_prime);
		interfaceRealization__superInterface____contract
				.setName(interfaceRealization__superInterface____contract_name_prime);
		umlClass__interfaceRealization____interfaceRealization
				.setName(umlClass__interfaceRealization____interfaceRealization_name_prime);
		interfaceRealization__umlClass____implementingClassifier
				.setName(interfaceRealization__umlClass____implementingClassifier_name_prime);
		return new Object[] { ruleresult, typeAcc, superInterface, ta2g, classDec, interfaceRealization, umlClass,
				superInterfaceDec, typeAcc__superInterfaceDec____type, superInterfaceDec__typeAcc____usagesInTypeAccess,
				ta2g__typeAcc____source, classDec__typeAcc____superInterfaces, ta2g__interfaceRealization____target,
				interfaceRealization__superInterface____contract,
				umlClass__interfaceRealization____interfaceRealization,
				interfaceRealization__umlClass____implementingClassifier };
	}

	public static final void pattern_TypeAccess2InterfaceRealization_1_5_registerobjects_expressionBBBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, PerformRuleResult ruleresult, EObject typeAcc,
			EObject superInterface, EObject ta2g, EObject classDec, EObject cd2c2, EObject interfaceRealization,
			EObject umlClass, EObject superInterfaceDec, EObject cd2c) {
		_this.registerObjects_FWD(ruleresult, typeAcc, superInterface, ta2g, classDec, cd2c2, interfaceRealization,
				umlClass, superInterfaceDec, cd2c);

	}

	public static final PerformRuleResult pattern_TypeAccess2InterfaceRealization_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_2_1_preparereturnvalue_bindingFB(
			TypeAccess2InterfaceRealization _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_2_1_preparereturnvalue_blackFBB(EClass eClass,
			TypeAccess2InterfaceRealization _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_2_1_preparereturnvalue_bindingAndBlackFFB(
			TypeAccess2InterfaceRealization _this) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_2_1_preparereturnvalue_binding = pattern_TypeAccess2InterfaceRealization_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2InterfaceRealization_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeAccess2InterfaceRealization_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_2_1_preparereturnvalue_black = pattern_TypeAccess2InterfaceRealization_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeAccess2InterfaceRealization_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeAccess2InterfaceRealization_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeAccess2InterfaceRealization";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("typeAcc");
		EObject _localVariable_1 = match.getObject("classDec");
		EObject _localVariable_2 = match.getObject("superInterfaceDec");
		EObject tmpTypeAcc = _localVariable_0;
		EObject tmpClassDec = _localVariable_1;
		EObject tmpSuperInterfaceDec = _localVariable_2;
		if (tmpTypeAcc instanceof TypeAccess) {
			TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
			if (tmpClassDec instanceof ClassDeclaration) {
				ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
				if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
					InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
					return new Object[] { typeAcc, classDec, superInterfaceDec, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_2_2_corematch_blackBFBFFBFB(
			TypeAccess typeAcc, ClassDeclaration classDec, InterfaceDeclaration superInterfaceDec, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element cd2c2 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(superInterfaceDec, ASTNode2Element.class, "source")) {
			Element tmpSuperInterface = cd2c2.getTarget();
			if (tmpSuperInterface instanceof Interface) {
				Interface superInterface = (Interface) tmpSuperInterface;
				for (ASTNode2Element cd2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(classDec,
						ASTNode2Element.class, "source")) {
					if (!cd2c.equals(cd2c2)) {
						Element tmpUmlClass = cd2c.getTarget();
						if (tmpUmlClass instanceof BehavioredClassifier) {
							BehavioredClassifier umlClass = (BehavioredClassifier) tmpUmlClass;
							_result.add(new Object[] { typeAcc, superInterface, classDec, cd2c2, umlClass,
									superInterfaceDec, cd2c, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_2_3_findcontext_blackBBBBBBB(
			TypeAccess typeAcc, Interface superInterface, ClassDeclaration classDec, ASTNode2Element cd2c2,
			BehavioredClassifier umlClass, InterfaceDeclaration superInterfaceDec, ASTNode2Element cd2c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!cd2c.equals(cd2c2)) {
			if (superInterfaceDec.equals(typeAcc.getType())) {
				if (superInterface.equals(cd2c2.getTarget())) {
					if (classDec.getSuperInterfaces().contains(typeAcc)) {
						if (superInterfaceDec.equals(cd2c2.getSource())) {
							if (classDec.equals(cd2c.getSource())) {
								if (umlClass.equals(cd2c.getTarget())) {
									_result.add(new Object[] { typeAcc, superInterface, classDec, cd2c2, umlClass,
											superInterfaceDec, cd2c });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_2_3_findcontext_greenBBBBBBBFFFFFFFF(
			TypeAccess typeAcc, Interface superInterface, ClassDeclaration classDec, ASTNode2Element cd2c2,
			BehavioredClassifier umlClass, InterfaceDeclaration superInterfaceDec, ASTNode2Element cd2c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge typeAcc__superInterfaceDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superInterface____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__typeAcc____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superInterfaceDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String typeAcc__superInterfaceDec____type_name_prime = "type";
		String superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String cd2c2__superInterface____target_name_prime = "target";
		String classDec__typeAcc____superInterfaces_name_prime = "superInterfaces";
		String cd2c2__superInterfaceDec____source_name_prime = "source";
		String cd2c__classDec____source_name_prime = "source";
		String cd2c__umlClass____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(typeAcc);
		isApplicableMatch.getAllContextElements().add(superInterface);
		isApplicableMatch.getAllContextElements().add(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c2);
		isApplicableMatch.getAllContextElements().add(umlClass);
		isApplicableMatch.getAllContextElements().add(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(cd2c);
		typeAcc__superInterfaceDec____type.setSrc(typeAcc);
		typeAcc__superInterfaceDec____type.setTrg(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(typeAcc__superInterfaceDec____type);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setSrc(superInterfaceDec);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		isApplicableMatch.getAllContextElements().add(superInterfaceDec__typeAcc____usagesInTypeAccess);
		cd2c2__superInterface____target.setSrc(cd2c2);
		cd2c2__superInterface____target.setTrg(superInterface);
		isApplicableMatch.getAllContextElements().add(cd2c2__superInterface____target);
		classDec__typeAcc____superInterfaces.setSrc(classDec);
		classDec__typeAcc____superInterfaces.setTrg(typeAcc);
		isApplicableMatch.getAllContextElements().add(classDec__typeAcc____superInterfaces);
		cd2c2__superInterfaceDec____source.setSrc(cd2c2);
		cd2c2__superInterfaceDec____source.setTrg(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(cd2c2__superInterfaceDec____source);
		cd2c__classDec____source.setSrc(cd2c);
		cd2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c__classDec____source);
		cd2c__umlClass____target.setSrc(cd2c);
		cd2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c__umlClass____target);
		typeAcc__superInterfaceDec____type.setName(typeAcc__superInterfaceDec____type_name_prime);
		superInterfaceDec__typeAcc____usagesInTypeAccess
				.setName(superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime);
		cd2c2__superInterface____target.setName(cd2c2__superInterface____target_name_prime);
		classDec__typeAcc____superInterfaces.setName(classDec__typeAcc____superInterfaces_name_prime);
		cd2c2__superInterfaceDec____source.setName(cd2c2__superInterfaceDec____source_name_prime);
		cd2c__classDec____source.setName(cd2c__classDec____source_name_prime);
		cd2c__umlClass____target.setName(cd2c__umlClass____target_name_prime);
		return new Object[] { typeAcc, superInterface, classDec, cd2c2, umlClass, superInterfaceDec, cd2c,
				isApplicableMatch, typeAcc__superInterfaceDec____type, superInterfaceDec__typeAcc____usagesInTypeAccess,
				cd2c2__superInterface____target, classDec__typeAcc____superInterfaces,
				cd2c2__superInterfaceDec____source, cd2c__classDec____source, cd2c__umlClass____target };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch, TypeAccess typeAcc,
			Interface superInterface, ClassDeclaration classDec, ASTNode2Element cd2c2, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, ASTNode2Element cd2c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, typeAcc, superInterface, classDec,
				cd2c2, umlClass, superInterfaceDec, cd2c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, typeAcc, superInterface, classDec, cd2c2, umlClass,
					superInterfaceDec, cd2c };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch, TypeAccess typeAcc,
			Interface superInterface, ClassDeclaration classDec, ASTNode2Element cd2c2, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, ASTNode2Element cd2c) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_binding = pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, typeAcc, superInterface, classDec, cd2c2, umlClass, superInterfaceDec, cd2c);
		if (result_pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_black = pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, typeAcc, superInterface, classDec, cd2c2, umlClass,
						superInterfaceDec, cd2c };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_2_5_checkCSP_expressionFBB(
			TypeAccess2InterfaceRealization _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeAccess2InterfaceRealization";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccess2InterfaceRealization_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_1_initialbindings_blackBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, Interface superInterface,
			InterfaceRealization interfaceRealization, BehavioredClassifier umlClass) {
		return new Object[] { _this, match, superInterface, interfaceRealization, umlClass };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_bindingFBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, Interface superInterface,
			InterfaceRealization interfaceRealization, BehavioredClassifier umlClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, superInterface, interfaceRealization, umlClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, superInterface, interfaceRealization, umlClass };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_bindingAndBlackFBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, Interface superInterface,
			InterfaceRealization interfaceRealization, BehavioredClassifier umlClass) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_binding = pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_bindingFBBBBB(
				_this, match, superInterface, interfaceRealization, umlClass);
		if (result_pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_black = pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, superInterface, interfaceRealization, umlClass };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_10_3_CheckCSP_expressionFBB(
			TypeAccess2InterfaceRealization _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_4_collectelementstobetranslated_blackBBBB(
			Match match, Interface superInterface, InterfaceRealization interfaceRealization,
			BehavioredClassifier umlClass) {
		return new Object[] { match, superInterface, interfaceRealization, umlClass };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, Interface superInterface, InterfaceRealization interfaceRealization,
			BehavioredClassifier umlClass) {
		EMoflonEdge interfaceRealization__superInterface____contract = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClass__interfaceRealization____interfaceRealization = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interfaceRealization__umlClass____implementingClassifier = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(interfaceRealization);
		String interfaceRealization__superInterface____contract_name_prime = "contract";
		String umlClass__interfaceRealization____interfaceRealization_name_prime = "interfaceRealization";
		String interfaceRealization__umlClass____implementingClassifier_name_prime = "implementingClassifier";
		interfaceRealization__superInterface____contract.setSrc(interfaceRealization);
		interfaceRealization__superInterface____contract.setTrg(superInterface);
		match.getToBeTranslatedEdges().add(interfaceRealization__superInterface____contract);
		umlClass__interfaceRealization____interfaceRealization.setSrc(umlClass);
		umlClass__interfaceRealization____interfaceRealization.setTrg(interfaceRealization);
		match.getToBeTranslatedEdges().add(umlClass__interfaceRealization____interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setSrc(interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setTrg(umlClass);
		match.getToBeTranslatedEdges().add(interfaceRealization__umlClass____implementingClassifier);
		interfaceRealization__superInterface____contract
				.setName(interfaceRealization__superInterface____contract_name_prime);
		umlClass__interfaceRealization____interfaceRealization
				.setName(umlClass__interfaceRealization____interfaceRealization_name_prime);
		interfaceRealization__umlClass____implementingClassifier
				.setName(interfaceRealization__umlClass____implementingClassifier_name_prime);
		return new Object[] { match, superInterface, interfaceRealization, umlClass,
				interfaceRealization__superInterface____contract,
				umlClass__interfaceRealization____interfaceRealization,
				interfaceRealization__umlClass____implementingClassifier };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_5_collectcontextelements_blackBBBB(
			Match match, Interface superInterface, InterfaceRealization interfaceRealization,
			BehavioredClassifier umlClass) {
		return new Object[] { match, superInterface, interfaceRealization, umlClass };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_5_collectcontextelements_greenBBB(
			Match match, Interface superInterface, BehavioredClassifier umlClass) {
		match.getContextNodes().add(superInterface);
		match.getContextNodes().add(umlClass);
		return new Object[] { match, superInterface, umlClass };
	}

	public static final void pattern_TypeAccess2InterfaceRealization_10_6_registerobjectstomatch_expressionBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, Interface superInterface,
			InterfaceRealization interfaceRealization, BehavioredClassifier umlClass) {
		_this.registerObjectsToMatch_BWD(match, superInterface, interfaceRealization, umlClass);

	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("superInterface");
		EObject _localVariable_1 = isApplicableMatch.getObject("classDec");
		EObject _localVariable_2 = isApplicableMatch.getObject("cd2c2");
		EObject _localVariable_3 = isApplicableMatch.getObject("interfaceRealization");
		EObject _localVariable_4 = isApplicableMatch.getObject("umlClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("superInterfaceDec");
		EObject _localVariable_6 = isApplicableMatch.getObject("cd2c");
		EObject tmpSuperInterface = _localVariable_0;
		EObject tmpClassDec = _localVariable_1;
		EObject tmpCd2c2 = _localVariable_2;
		EObject tmpInterfaceRealization = _localVariable_3;
		EObject tmpUmlClass = _localVariable_4;
		EObject tmpSuperInterfaceDec = _localVariable_5;
		EObject tmpCd2c = _localVariable_6;
		if (tmpSuperInterface instanceof Interface) {
			Interface superInterface = (Interface) tmpSuperInterface;
			if (tmpClassDec instanceof ClassDeclaration) {
				ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
				if (tmpCd2c2 instanceof ASTNode2Element) {
					ASTNode2Element cd2c2 = (ASTNode2Element) tmpCd2c2;
					if (tmpInterfaceRealization instanceof InterfaceRealization) {
						InterfaceRealization interfaceRealization = (InterfaceRealization) tmpInterfaceRealization;
						if (tmpUmlClass instanceof BehavioredClassifier) {
							BehavioredClassifier umlClass = (BehavioredClassifier) tmpUmlClass;
							if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
								InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
								if (tmpCd2c instanceof ASTNode2Element) {
									ASTNode2Element cd2c = (ASTNode2Element) tmpCd2c;
									return new Object[] { superInterface, classDec, cd2c2, interfaceRealization,
											umlClass, superInterfaceDec, cd2c, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_blackBBBBBBBFBB(
			Interface superInterface, ClassDeclaration classDec, ASTNode2Element cd2c2,
			InterfaceRealization interfaceRealization, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, ASTNode2Element cd2c, TypeAccess2InterfaceRealization _this,
			IsApplicableMatch isApplicableMatch) {
		if (!cd2c.equals(cd2c2)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { superInterface, classDec, cd2c2, interfaceRealization, umlClass,
							superInterfaceDec, cd2c, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding = pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding != null) {
			Interface superInterface = (Interface) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[0];
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[1];
			ASTNode2Element cd2c2 = (ASTNode2Element) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[2];
			InterfaceRealization interfaceRealization = (InterfaceRealization) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[3];
			BehavioredClassifier umlClass = (BehavioredClassifier) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[4];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[5];
			ASTNode2Element cd2c = (ASTNode2Element) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[6];

			Object[] result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_black = pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_blackBBBBBBBFBB(
					superInterface, classDec, cd2c2, interfaceRealization, umlClass, superInterfaceDec, cd2c, _this,
					isApplicableMatch);
			if (result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_black[7];

				return new Object[] { superInterface, classDec, cd2c2, interfaceRealization, umlClass,
						superInterfaceDec, cd2c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_greenFFBBB(
			ClassDeclaration classDec, InterfaceRealization interfaceRealization,
			InterfaceDeclaration superInterfaceDec) {
		TypeAccess typeAcc = JavaFactory.eINSTANCE.createTypeAccess();
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2InterfaceRealization();
		typeAcc.setType(superInterfaceDec);
		classDec.getSuperInterfaces().add(typeAcc);
		ta2g.setSource(typeAcc);
		ta2g.setTarget(interfaceRealization);
		return new Object[] { typeAcc, ta2g, classDec, interfaceRealization, superInterfaceDec };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_11_2_collecttranslatedelements_blackBBB(
			TypeAccess typeAcc, org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g,
			InterfaceRealization interfaceRealization) {
		return new Object[] { typeAcc, ta2g, interfaceRealization };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_11_2_collecttranslatedelements_greenFBBB(
			TypeAccess typeAcc, org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g,
			InterfaceRealization interfaceRealization) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(typeAcc);
		ruleresult.getCreatedLinkElements().add(ta2g);
		ruleresult.getTranslatedElements().add(interfaceRealization);
		return new Object[] { ruleresult, typeAcc, ta2g, interfaceRealization };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject typeAcc, EObject superInterface, EObject ta2g, EObject classDec,
			EObject cd2c2, EObject interfaceRealization, EObject umlClass, EObject superInterfaceDec, EObject cd2c) {
		if (!typeAcc.equals(umlClass)) {
			if (!superInterface.equals(typeAcc)) {
				if (!superInterface.equals(ta2g)) {
					if (!superInterface.equals(umlClass)) {
						if (!superInterface.equals(superInterfaceDec)) {
							if (!ta2g.equals(typeAcc)) {
								if (!ta2g.equals(umlClass)) {
									if (!classDec.equals(typeAcc)) {
										if (!classDec.equals(superInterface)) {
											if (!classDec.equals(ta2g)) {
												if (!classDec.equals(interfaceRealization)) {
													if (!classDec.equals(umlClass)) {
														if (!classDec.equals(superInterfaceDec)) {
															if (!cd2c2.equals(typeAcc)) {
																if (!cd2c2.equals(superInterface)) {
																	if (!cd2c2.equals(ta2g)) {
																		if (!cd2c2.equals(classDec)) {
																			if (!cd2c2.equals(interfaceRealization)) {
																				if (!cd2c2.equals(umlClass)) {
																					if (!cd2c2.equals(
																							superInterfaceDec)) {
																						if (!interfaceRealization
																								.equals(typeAcc)) {
																							if (!interfaceRealization
																									.equals(superInterface)) {
																								if (!interfaceRealization
																										.equals(ta2g)) {
																									if (!interfaceRealization
																											.equals(umlClass)) {
																										if (!interfaceRealization
																												.equals(superInterfaceDec)) {
																											if (!superInterfaceDec
																													.equals(typeAcc)) {
																												if (!superInterfaceDec
																														.equals(ta2g)) {
																													if (!superInterfaceDec
																															.equals(umlClass)) {
																														if (!cd2c
																																.equals(typeAcc)) {
																															if (!cd2c
																																	.equals(superInterface)) {
																																if (!cd2c
																																		.equals(ta2g)) {
																																	if (!cd2c
																																			.equals(classDec)) {
																																		if (!cd2c
																																				.equals(cd2c2)) {
																																			if (!cd2c
																																					.equals(interfaceRealization)) {
																																				if (!cd2c
																																						.equals(umlClass)) {
																																					if (!cd2c
																																							.equals(superInterfaceDec)) {
																																						return new Object[] {
																																								ruleresult,
																																								typeAcc,
																																								superInterface,
																																								ta2g,
																																								classDec,
																																								cd2c2,
																																								interfaceRealization,
																																								umlClass,
																																								superInterfaceDec,
																																								cd2c };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeAccess2InterfaceRealization_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject typeAcc, EObject superInterface, EObject ta2g, EObject classDec,
			EObject interfaceRealization, EObject umlClass, EObject superInterfaceDec) {
		EMoflonEdge typeAcc__superInterfaceDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__typeAcc____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__typeAcc____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__interfaceRealization____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge interfaceRealization__superInterface____contract = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClass__interfaceRealization____interfaceRealization = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interfaceRealization__umlClass____implementingClassifier = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccess2InterfaceRealization";
		String typeAcc__superInterfaceDec____type_name_prime = "type";
		String superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String ta2g__typeAcc____source_name_prime = "source";
		String classDec__typeAcc____superInterfaces_name_prime = "superInterfaces";
		String ta2g__interfaceRealization____target_name_prime = "target";
		String interfaceRealization__superInterface____contract_name_prime = "contract";
		String umlClass__interfaceRealization____interfaceRealization_name_prime = "interfaceRealization";
		String interfaceRealization__umlClass____implementingClassifier_name_prime = "implementingClassifier";
		typeAcc__superInterfaceDec____type.setSrc(typeAcc);
		typeAcc__superInterfaceDec____type.setTrg(superInterfaceDec);
		ruleresult.getCreatedEdges().add(typeAcc__superInterfaceDec____type);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setSrc(superInterfaceDec);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(superInterfaceDec__typeAcc____usagesInTypeAccess);
		ta2g__typeAcc____source.setSrc(ta2g);
		ta2g__typeAcc____source.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(ta2g__typeAcc____source);
		classDec__typeAcc____superInterfaces.setSrc(classDec);
		classDec__typeAcc____superInterfaces.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(classDec__typeAcc____superInterfaces);
		ta2g__interfaceRealization____target.setSrc(ta2g);
		ta2g__interfaceRealization____target.setTrg(interfaceRealization);
		ruleresult.getCreatedEdges().add(ta2g__interfaceRealization____target);
		interfaceRealization__superInterface____contract.setSrc(interfaceRealization);
		interfaceRealization__superInterface____contract.setTrg(superInterface);
		ruleresult.getTranslatedEdges().add(interfaceRealization__superInterface____contract);
		umlClass__interfaceRealization____interfaceRealization.setSrc(umlClass);
		umlClass__interfaceRealization____interfaceRealization.setTrg(interfaceRealization);
		ruleresult.getTranslatedEdges().add(umlClass__interfaceRealization____interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setSrc(interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setTrg(umlClass);
		ruleresult.getTranslatedEdges().add(interfaceRealization__umlClass____implementingClassifier);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		typeAcc__superInterfaceDec____type.setName(typeAcc__superInterfaceDec____type_name_prime);
		superInterfaceDec__typeAcc____usagesInTypeAccess
				.setName(superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime);
		ta2g__typeAcc____source.setName(ta2g__typeAcc____source_name_prime);
		classDec__typeAcc____superInterfaces.setName(classDec__typeAcc____superInterfaces_name_prime);
		ta2g__interfaceRealization____target.setName(ta2g__interfaceRealization____target_name_prime);
		interfaceRealization__superInterface____contract
				.setName(interfaceRealization__superInterface____contract_name_prime);
		umlClass__interfaceRealization____interfaceRealization
				.setName(umlClass__interfaceRealization____interfaceRealization_name_prime);
		interfaceRealization__umlClass____implementingClassifier
				.setName(interfaceRealization__umlClass____implementingClassifier_name_prime);
		return new Object[] { ruleresult, typeAcc, superInterface, ta2g, classDec, interfaceRealization, umlClass,
				superInterfaceDec, typeAcc__superInterfaceDec____type, superInterfaceDec__typeAcc____usagesInTypeAccess,
				ta2g__typeAcc____source, classDec__typeAcc____superInterfaces, ta2g__interfaceRealization____target,
				interfaceRealization__superInterface____contract,
				umlClass__interfaceRealization____interfaceRealization,
				interfaceRealization__umlClass____implementingClassifier };
	}

	public static final void pattern_TypeAccess2InterfaceRealization_11_5_registerobjects_expressionBBBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, PerformRuleResult ruleresult, EObject typeAcc,
			EObject superInterface, EObject ta2g, EObject classDec, EObject cd2c2, EObject interfaceRealization,
			EObject umlClass, EObject superInterfaceDec, EObject cd2c) {
		_this.registerObjects_BWD(ruleresult, typeAcc, superInterface, ta2g, classDec, cd2c2, interfaceRealization,
				umlClass, superInterfaceDec, cd2c);

	}

	public static final PerformRuleResult pattern_TypeAccess2InterfaceRealization_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_12_1_preparereturnvalue_bindingFB(
			TypeAccess2InterfaceRealization _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_12_1_preparereturnvalue_blackFBB(EClass eClass,
			TypeAccess2InterfaceRealization _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_12_1_preparereturnvalue_bindingAndBlackFFB(
			TypeAccess2InterfaceRealization _this) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_12_1_preparereturnvalue_binding = pattern_TypeAccess2InterfaceRealization_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2InterfaceRealization_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeAccess2InterfaceRealization_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_12_1_preparereturnvalue_black = pattern_TypeAccess2InterfaceRealization_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeAccess2InterfaceRealization_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeAccess2InterfaceRealization_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeAccess2InterfaceRealization";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("superInterface");
		EObject _localVariable_1 = match.getObject("interfaceRealization");
		EObject _localVariable_2 = match.getObject("umlClass");
		EObject tmpSuperInterface = _localVariable_0;
		EObject tmpInterfaceRealization = _localVariable_1;
		EObject tmpUmlClass = _localVariable_2;
		if (tmpSuperInterface instanceof Interface) {
			Interface superInterface = (Interface) tmpSuperInterface;
			if (tmpInterfaceRealization instanceof InterfaceRealization) {
				InterfaceRealization interfaceRealization = (InterfaceRealization) tmpInterfaceRealization;
				if (tmpUmlClass instanceof BehavioredClassifier) {
					BehavioredClassifier umlClass = (BehavioredClassifier) tmpUmlClass;
					return new Object[] { superInterface, interfaceRealization, umlClass, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_12_2_corematch_blackBFFBBFFB(
			Interface superInterface, InterfaceRealization interfaceRealization, BehavioredClassifier umlClass,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element cd2c2 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(superInterface,
				ASTNode2Element.class, "target")) {
			ASTNode tmpSuperInterfaceDec = cd2c2.getSource();
			if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
				InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
				for (ASTNode2Element cd2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(umlClass,
						ASTNode2Element.class, "target")) {
					if (!cd2c.equals(cd2c2)) {
						ASTNode tmpClassDec = cd2c.getSource();
						if (tmpClassDec instanceof ClassDeclaration) {
							ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
							_result.add(new Object[] { superInterface, classDec, cd2c2, interfaceRealization, umlClass,
									superInterfaceDec, cd2c, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_12_3_findcontext_blackBBBBBBB(
			Interface superInterface, ClassDeclaration classDec, ASTNode2Element cd2c2,
			InterfaceRealization interfaceRealization, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, ASTNode2Element cd2c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!cd2c.equals(cd2c2)) {
			if (superInterface.equals(cd2c2.getTarget())) {
				if (superInterface.equals(interfaceRealization.getContract())) {
					if (superInterfaceDec.equals(cd2c2.getSource())) {
						if (classDec.equals(cd2c.getSource())) {
							if (umlClass.equals(cd2c.getTarget())) {
								if (umlClass.getInterfaceRealizations().contains(interfaceRealization)) {
									_result.add(new Object[] { superInterface, classDec, cd2c2, interfaceRealization,
											umlClass, superInterfaceDec, cd2c });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_12_3_findcontext_greenBBBBBBBFFFFFFFF(
			Interface superInterface, ClassDeclaration classDec, ASTNode2Element cd2c2,
			InterfaceRealization interfaceRealization, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, ASTNode2Element cd2c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge cd2c2__superInterface____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge interfaceRealization__superInterface____contract = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superInterfaceDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClass__interfaceRealization____interfaceRealization = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interfaceRealization__umlClass____implementingClassifier = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String cd2c2__superInterface____target_name_prime = "target";
		String interfaceRealization__superInterface____contract_name_prime = "contract";
		String cd2c2__superInterfaceDec____source_name_prime = "source";
		String cd2c__classDec____source_name_prime = "source";
		String cd2c__umlClass____target_name_prime = "target";
		String umlClass__interfaceRealization____interfaceRealization_name_prime = "interfaceRealization";
		String interfaceRealization__umlClass____implementingClassifier_name_prime = "implementingClassifier";
		isApplicableMatch.getAllContextElements().add(superInterface);
		isApplicableMatch.getAllContextElements().add(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c2);
		isApplicableMatch.getAllContextElements().add(interfaceRealization);
		isApplicableMatch.getAllContextElements().add(umlClass);
		isApplicableMatch.getAllContextElements().add(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(cd2c);
		cd2c2__superInterface____target.setSrc(cd2c2);
		cd2c2__superInterface____target.setTrg(superInterface);
		isApplicableMatch.getAllContextElements().add(cd2c2__superInterface____target);
		interfaceRealization__superInterface____contract.setSrc(interfaceRealization);
		interfaceRealization__superInterface____contract.setTrg(superInterface);
		isApplicableMatch.getAllContextElements().add(interfaceRealization__superInterface____contract);
		cd2c2__superInterfaceDec____source.setSrc(cd2c2);
		cd2c2__superInterfaceDec____source.setTrg(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(cd2c2__superInterfaceDec____source);
		cd2c__classDec____source.setSrc(cd2c);
		cd2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c__classDec____source);
		cd2c__umlClass____target.setSrc(cd2c);
		cd2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c__umlClass____target);
		umlClass__interfaceRealization____interfaceRealization.setSrc(umlClass);
		umlClass__interfaceRealization____interfaceRealization.setTrg(interfaceRealization);
		isApplicableMatch.getAllContextElements().add(umlClass__interfaceRealization____interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setSrc(interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(interfaceRealization__umlClass____implementingClassifier);
		cd2c2__superInterface____target.setName(cd2c2__superInterface____target_name_prime);
		interfaceRealization__superInterface____contract
				.setName(interfaceRealization__superInterface____contract_name_prime);
		cd2c2__superInterfaceDec____source.setName(cd2c2__superInterfaceDec____source_name_prime);
		cd2c__classDec____source.setName(cd2c__classDec____source_name_prime);
		cd2c__umlClass____target.setName(cd2c__umlClass____target_name_prime);
		umlClass__interfaceRealization____interfaceRealization
				.setName(umlClass__interfaceRealization____interfaceRealization_name_prime);
		interfaceRealization__umlClass____implementingClassifier
				.setName(interfaceRealization__umlClass____implementingClassifier_name_prime);
		return new Object[] { superInterface, classDec, cd2c2, interfaceRealization, umlClass, superInterfaceDec, cd2c,
				isApplicableMatch, cd2c2__superInterface____target, interfaceRealization__superInterface____contract,
				cd2c2__superInterfaceDec____source, cd2c__classDec____source, cd2c__umlClass____target,
				umlClass__interfaceRealization____interfaceRealization,
				interfaceRealization__umlClass____implementingClassifier };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch, Interface superInterface,
			ClassDeclaration classDec, ASTNode2Element cd2c2, InterfaceRealization interfaceRealization,
			BehavioredClassifier umlClass, InterfaceDeclaration superInterfaceDec, ASTNode2Element cd2c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, superInterface, classDec, cd2c2,
				interfaceRealization, umlClass, superInterfaceDec, cd2c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, superInterface, classDec, cd2c2, interfaceRealization,
					umlClass, superInterfaceDec, cd2c };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch, Interface superInterface,
			ClassDeclaration classDec, ASTNode2Element cd2c2, InterfaceRealization interfaceRealization,
			BehavioredClassifier umlClass, InterfaceDeclaration superInterfaceDec, ASTNode2Element cd2c) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_binding = pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, superInterface, classDec, cd2c2, interfaceRealization, umlClass,
				superInterfaceDec, cd2c);
		if (result_pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_black = pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, superInterface, classDec, cd2c2,
						interfaceRealization, umlClass, superInterfaceDec, cd2c };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_12_5_checkCSP_expressionFBB(
			TypeAccess2InterfaceRealization _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeAccess2InterfaceRealization";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccess2InterfaceRealization_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_20_1_preparereturnvalue_bindingFB(
			TypeAccess2InterfaceRealization _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, TypeAccess2InterfaceRealization _this) {
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

	public static final Object[] pattern_TypeAccess2InterfaceRealization_20_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeAccess2InterfaceRealization _this) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_20_1_preparereturnvalue_binding = pattern_TypeAccess2InterfaceRealization_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2InterfaceRealization_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeAccess2InterfaceRealization_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_20_1_preparereturnvalue_black = pattern_TypeAccess2InterfaceRealization_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeAccess2InterfaceRealization_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeAccess2InterfaceRealization_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeAccess2InterfaceRealization_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_0BBB(
			InterfaceRealization interfaceRealization, Interface superInterface, BehavioredClassifier umlClass) {
		for (NamedElement __DEC_interfaceRealization_client_354184 : interfaceRealization.getClients()) {
			if (!interfaceRealization.equals(__DEC_interfaceRealization_client_354184)) {
				if (!superInterface.equals(__DEC_interfaceRealization_client_354184)) {
					if (!umlClass.equals(__DEC_interfaceRealization_client_354184)) {
						return new Object[] { interfaceRealization, superInterface, umlClass };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_1BBB(
			InterfaceRealization interfaceRealization, Interface superInterface, BehavioredClassifier umlClass) {
		for (NamedElement __DEC_interfaceRealization_supplier_652313 : interfaceRealization.getSuppliers()) {
			if (!interfaceRealization.equals(__DEC_interfaceRealization_supplier_652313)) {
				if (!superInterface.equals(__DEC_interfaceRealization_supplier_652313)) {
					if (!umlClass.equals(__DEC_interfaceRealization_supplier_652313)) {
						return new Object[] { interfaceRealization, superInterface, umlClass };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_2BB(
			InterfaceRealization interfaceRealization, Interface superInterface) {
		if (interfaceRealization.getClients().contains(superInterface)) {
			return new Object[] { interfaceRealization, superInterface };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_3BB(
			InterfaceRealization interfaceRealization, BehavioredClassifier umlClass) {
		if (interfaceRealization.getClients().contains(umlClass)) {
			return new Object[] { interfaceRealization, umlClass };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_4BB(
			InterfaceRealization interfaceRealization, Interface superInterface) {
		if (interfaceRealization.getSuppliers().contains(superInterface)) {
			return new Object[] { interfaceRealization, superInterface };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_5BB(
			InterfaceRealization interfaceRealization, BehavioredClassifier umlClass) {
		if (interfaceRealization.getSuppliers().contains(umlClass)) {
			return new Object[] { interfaceRealization, umlClass };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_contract) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInterfaceRealization = _edge_contract.getSrc();
		if (tmpInterfaceRealization instanceof InterfaceRealization) {
			InterfaceRealization interfaceRealization = (InterfaceRealization) tmpInterfaceRealization;
			EObject tmpSuperInterface = _edge_contract.getTrg();
			if (tmpSuperInterface instanceof Interface) {
				Interface superInterface = (Interface) tmpSuperInterface;
				if (superInterface.equals(interfaceRealization.getContract())) {
					BehavioredClassifier umlClass = interfaceRealization.getImplementingClassifier();
					if (umlClass != null) {
						if (pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_2BB(
								interfaceRealization, superInterface) == null) {
							if (pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_4BB(
									interfaceRealization, superInterface) == null) {
								if (pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_0BBB(
										interfaceRealization, superInterface, umlClass) == null) {
									if (pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_1BBB(
											interfaceRealization, superInterface, umlClass) == null) {
										if (pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_3BB(
												interfaceRealization, umlClass) == null) {
											if (pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_5BB(
													interfaceRealization, umlClass) == null) {
												_result.add(new Object[] { superInterface, interfaceRealization,
														umlClass, _edge_contract });
											}
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

	public static final Object[] pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, Interface superInterface,
			InterfaceRealization interfaceRealization, BehavioredClassifier umlClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, superInterface, interfaceRealization, umlClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeAccess2InterfaceRealization _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeAccess2InterfaceRealization_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_1_preparereturnvalue_bindingFB(
			TypeAccess2InterfaceRealization _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, TypeAccess2InterfaceRealization _this) {
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

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeAccess2InterfaceRealization _this) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_21_1_preparereturnvalue_binding = pattern_TypeAccess2InterfaceRealization_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2InterfaceRealization_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeAccess2InterfaceRealization_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_21_1_preparereturnvalue_black = pattern_TypeAccess2InterfaceRealization_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeAccess2InterfaceRealization_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeAccess2InterfaceRealization_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeAccess2InterfaceRealization_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_0B(
			TypeAccess typeAcc) {
		for (Annotation __DEC_typeAcc_type_999653 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, Annotation.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess typeAcc) {
		for (ArrayType __DEC_typeAcc_elementType_682212 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ArrayType.class, "elementType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_2BB(
			TypeAccess typeAcc, ClassDeclaration classDec) {
		for (ClassDeclaration __DEC_typeAcc_superClass_361298 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ClassDeclaration.class, "superClass")) {
			if (!classDec.equals(__DEC_typeAcc_superClass_361298)) {
				return new Object[] { typeAcc, classDec };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess typeAcc) {
		for (MethodDeclaration __DEC_typeAcc_returnType_678131 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_4B(
			TypeAccess typeAcc) {
		for (ParameterizedType __DEC_typeAcc_type_972539 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ParameterizedType.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess typeAcc) {
		for (SingleVariableDeclaration __DEC_typeAcc_type_94126 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess typeAcc) {
		for (AnnotationMemberValuePair __DEC_typeAcc_value_588832 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_7BB(
			ClassDeclaration classDec, TypeAccess typeAcc) {
		if (typeAcc.equals(classDec.getSuperClass())) {
			return new Object[] { classDec, typeAcc };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTypeAcc = _edge_type.getSrc();
		if (tmpTypeAcc instanceof TypeAccess) {
			TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
			EObject tmpSuperInterfaceDec = _edge_type.getTrg();
			if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
				InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
				if (superInterfaceDec.equals(typeAcc.getType())) {
					if (pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_0B(
							typeAcc) == null) {
						if (pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_1B(
								typeAcc) == null) {
							if (pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_3B(
									typeAcc) == null) {
								if (pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_4B(
										typeAcc) == null) {
									if (pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_5B(
											typeAcc) == null) {
										if (pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_6B(
												typeAcc) == null) {
											for (AbstractTypeDeclaration tmpClassDec : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(typeAcc, AbstractTypeDeclaration.class,
															"superInterfaces")) {
												if (tmpClassDec instanceof ClassDeclaration) {
													ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
													if (pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_2BB(
															typeAcc, classDec) == null) {
														if (pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_7BB(
																classDec, typeAcc) == null) {
															_result.add(new Object[] { typeAcc, classDec,
																	superInterfaceDec, _edge_type });
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, TypeAccess typeAcc, ClassDeclaration classDec,
			InterfaceDeclaration superInterfaceDec) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, typeAcc, classDec, superInterfaceDec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeAccess2InterfaceRealization _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeAccess2InterfaceRealization_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_1_prepare_blackB(
			TypeAccess2InterfaceRealization _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("typeAcc");
		EObject _localVariable_1 = targetMatch.getObject("superInterface");
		EObject _localVariable_2 = sourceMatch.getObject("classDec");
		EObject _localVariable_3 = targetMatch.getObject("interfaceRealization");
		EObject _localVariable_4 = targetMatch.getObject("umlClass");
		EObject _localVariable_5 = sourceMatch.getObject("superInterfaceDec");
		EObject tmpTypeAcc = _localVariable_0;
		EObject tmpSuperInterface = _localVariable_1;
		EObject tmpClassDec = _localVariable_2;
		EObject tmpInterfaceRealization = _localVariable_3;
		EObject tmpUmlClass = _localVariable_4;
		EObject tmpSuperInterfaceDec = _localVariable_5;
		if (tmpTypeAcc instanceof TypeAccess) {
			TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
			if (tmpSuperInterface instanceof Interface) {
				Interface superInterface = (Interface) tmpSuperInterface;
				if (tmpClassDec instanceof ClassDeclaration) {
					ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
					if (tmpInterfaceRealization instanceof InterfaceRealization) {
						InterfaceRealization interfaceRealization = (InterfaceRealization) tmpInterfaceRealization;
						if (tmpUmlClass instanceof BehavioredClassifier) {
							BehavioredClassifier umlClass = (BehavioredClassifier) tmpUmlClass;
							if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
								InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
								return new Object[] { typeAcc, superInterface, classDec, interfaceRealization, umlClass,
										superInterfaceDec, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_blackBBBBBBBB(
			TypeAccess typeAcc, Interface superInterface, ClassDeclaration classDec,
			InterfaceRealization interfaceRealization, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { typeAcc, superInterface, classDec, interfaceRealization, umlClass, superInterfaceDec,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding = pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding != null) {
			TypeAccess typeAcc = (TypeAccess) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[0];
			Interface superInterface = (Interface) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[1];
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[2];
			InterfaceRealization interfaceRealization = (InterfaceRealization) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[3];
			BehavioredClassifier umlClass = (BehavioredClassifier) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[4];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_black = pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_blackBBBBBBBB(
					typeAcc, superInterface, classDec, interfaceRealization, umlClass, superInterfaceDec, sourceMatch,
					targetMatch);
			if (result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { typeAcc, superInterface, classDec, interfaceRealization, umlClass,
						superInterfaceDec, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_bindingFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, TypeAccess typeAcc, Interface superInterface,
			ClassDeclaration classDec, InterfaceRealization interfaceRealization, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(typeAcc, superInterface, classDec, interfaceRealization,
				umlClass, superInterfaceDec, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, typeAcc, superInterface, classDec, interfaceRealization, umlClass,
					superInterfaceDec, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, TypeAccess typeAcc, Interface superInterface,
			ClassDeclaration classDec, InterfaceRealization interfaceRealization, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_binding = pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, typeAcc, superInterface, classDec, interfaceRealization, umlClass, superInterfaceDec,
				sourceMatch, targetMatch);
		if (result_pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_black = pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, typeAcc, superInterface, classDec, interfaceRealization, umlClass,
						superInterfaceDec, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_24_5_matchcorrcontext_blackBBFBBFBB(
			Interface superInterface, ClassDeclaration classDec, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element cd2c2 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(superInterface, ASTNode2Element.class, "target")) {
				if (superInterfaceDec.equals(cd2c2.getSource())) {
					for (ASTNode2Element cd2c : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(classDec, ASTNode2Element.class, "source")) {
						if (!cd2c.equals(cd2c2)) {
							if (umlClass.equals(cd2c.getTarget())) {
								_result.add(new Object[] { superInterface, classDec, cd2c2, umlClass, superInterfaceDec,
										cd2c, sourceMatch, targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_5_matchcorrcontext_greenBBBBF(
			ASTNode2Element cd2c2, ASTNode2Element cd2c, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "TypeAccess2InterfaceRealization";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(cd2c2);
		ccMatch.getAllContextElements().add(cd2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { cd2c2, cd2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_6_createcorrespondence_blackBBBBBBB(
			TypeAccess typeAcc, Interface superInterface, ClassDeclaration classDec,
			InterfaceRealization interfaceRealization, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, CCMatch ccMatch) {
		return new Object[] { typeAcc, superInterface, classDec, interfaceRealization, umlClass, superInterfaceDec,
				ccMatch };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_6_createcorrespondence_greenBFBB(
			TypeAccess typeAcc, InterfaceRealization interfaceRealization, CCMatch ccMatch) {
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2InterfaceRealization();
		ta2g.setSource(typeAcc);
		ta2g.setTarget(interfaceRealization);
		ccMatch.getCreateCorr().add(ta2g);
		return new Object[] { typeAcc, ta2g, interfaceRealization, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "TypeAccess2InterfaceRealization";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccess2InterfaceRealization_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_0B(
			TypeAccess typeAcc) {
		for (Annotation __DEC_typeAcc_type_466527 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, Annotation.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_1B(
			TypeAccess typeAcc) {
		for (ArrayType __DEC_typeAcc_elementType_600140 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ArrayType.class, "elementType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_2BB(
			TypeAccess typeAcc, ClassDeclaration classDec) {
		for (ClassDeclaration __DEC_typeAcc_superClass_885721 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ClassDeclaration.class, "superClass")) {
			if (!classDec.equals(__DEC_typeAcc_superClass_885721)) {
				return new Object[] { typeAcc, classDec };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_3B(
			TypeAccess typeAcc) {
		for (MethodDeclaration __DEC_typeAcc_returnType_72711 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_4B(
			TypeAccess typeAcc) {
		for (ParameterizedType __DEC_typeAcc_type_400436 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ParameterizedType.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_5B(
			TypeAccess typeAcc) {
		for (SingleVariableDeclaration __DEC_typeAcc_type_113704 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_6B(
			TypeAccess typeAcc) {
		for (AnnotationMemberValuePair __DEC_typeAcc_value_262501 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_7BB(
			ClassDeclaration classDec, TypeAccess typeAcc) {
		if (typeAcc.equals(classDec.getSuperClass())) {
			return new Object[] { classDec, typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_blackBBB(
			TypeAccess typeAcc, ClassDeclaration classDec, InterfaceDeclaration superInterfaceDec) {
		if (superInterfaceDec.equals(typeAcc.getType())) {
			if (classDec.getSuperInterfaces().contains(typeAcc)) {
				if (pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_0B(typeAcc) == null) {
					if (pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_1B(typeAcc) == null) {
						if (pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_2BB(typeAcc,
								classDec) == null) {
							if (pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_3B(
									typeAcc) == null) {
								if (pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_4B(
										typeAcc) == null) {
									if (pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_5B(
											typeAcc) == null) {
										if (pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_6B(
												typeAcc) == null) {
											if (pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_7BB(
													classDec, typeAcc) == null) {
												return new Object[] { typeAcc, classDec, superInterfaceDec };
											}
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

	public static final boolean pattern_TypeAccess2InterfaceRealization_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_black_nac_0BBB(
			InterfaceRealization interfaceRealization, Interface superInterface, BehavioredClassifier umlClass) {
		for (NamedElement __DEC_interfaceRealization_client_35395 : interfaceRealization.getClients()) {
			if (!interfaceRealization.equals(__DEC_interfaceRealization_client_35395)) {
				if (!superInterface.equals(__DEC_interfaceRealization_client_35395)) {
					if (!umlClass.equals(__DEC_interfaceRealization_client_35395)) {
						return new Object[] { interfaceRealization, superInterface, umlClass };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_black_nac_1BBB(
			InterfaceRealization interfaceRealization, Interface superInterface, BehavioredClassifier umlClass) {
		for (NamedElement __DEC_interfaceRealization_supplier_287381 : interfaceRealization.getSuppliers()) {
			if (!interfaceRealization.equals(__DEC_interfaceRealization_supplier_287381)) {
				if (!superInterface.equals(__DEC_interfaceRealization_supplier_287381)) {
					if (!umlClass.equals(__DEC_interfaceRealization_supplier_287381)) {
						return new Object[] { interfaceRealization, superInterface, umlClass };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_black_nac_2BB(
			InterfaceRealization interfaceRealization, Interface superInterface) {
		if (interfaceRealization.getClients().contains(superInterface)) {
			return new Object[] { interfaceRealization, superInterface };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_black_nac_3BB(
			InterfaceRealization interfaceRealization, BehavioredClassifier umlClass) {
		if (interfaceRealization.getClients().contains(umlClass)) {
			return new Object[] { interfaceRealization, umlClass };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_black_nac_4BB(
			InterfaceRealization interfaceRealization, Interface superInterface) {
		if (interfaceRealization.getSuppliers().contains(superInterface)) {
			return new Object[] { interfaceRealization, superInterface };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_black_nac_5BB(
			InterfaceRealization interfaceRealization, BehavioredClassifier umlClass) {
		if (interfaceRealization.getSuppliers().contains(umlClass)) {
			return new Object[] { interfaceRealization, umlClass };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_blackBBB(
			Interface superInterface, InterfaceRealization interfaceRealization, BehavioredClassifier umlClass) {
		if (superInterface.equals(interfaceRealization.getContract())) {
			if (umlClass.getInterfaceRealizations().contains(interfaceRealization)) {
				if (pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_black_nac_0BBB(interfaceRealization,
						superInterface, umlClass) == null) {
					if (pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_black_nac_1BBB(
							interfaceRealization, superInterface, umlClass) == null) {
						if (pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_black_nac_2BB(
								interfaceRealization, superInterface) == null) {
							if (pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_black_nac_3BB(
									interfaceRealization, umlClass) == null) {
								if (pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_black_nac_4BB(
										interfaceRealization, superInterface) == null) {
									if (pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_black_nac_5BB(
											interfaceRealization, umlClass) == null) {
										return new Object[] { superInterface, interfaceRealization, umlClass };
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

	public static final boolean pattern_TypeAccess2InterfaceRealization_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_1_createresult_blackB(
			TypeAccess2InterfaceRealization _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Interface superInterface) {
		if (ruleResult.getTargetObjects().contains(superInterface)) {
			return new Object[] { ruleResult, superInterface };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element cd2c2) {
		if (ruleResult.getCorrObjects().contains(cd2c2)) {
			return new Object[] { ruleResult, cd2c2 };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, InterfaceDeclaration superInterfaceDec) {
		if (ruleResult.getSourceObjects().contains(superInterfaceDec)) {
			return new Object[] { ruleResult, superInterfaceDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ClassDeclaration classDec) {
		if (ruleResult.getSourceObjects().contains(classDec)) {
			return new Object[] { ruleResult, classDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element cd2c) {
		if (ruleResult.getCorrObjects().contains(cd2c)) {
			return new Object[] { ruleResult, cd2c };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, BehavioredClassifier umlClass) {
		if (ruleResult.getTargetObjects().contains(umlClass)) {
			return new Object[] { ruleResult, umlClass };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList cd2c2List : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList cd2cList : ruleEntryContainer.getRuleEntryList()) {
				if (!cd2c2List.equals(cd2cList)) {
					for (EObject tmpCd2c2 : cd2c2List.getEntryObjects()) {
						if (tmpCd2c2 instanceof ASTNode2Element) {
							ASTNode2Element cd2c2 = (ASTNode2Element) tmpCd2c2;
							Element tmpSuperInterface = cd2c2.getTarget();
							if (tmpSuperInterface instanceof Interface) {
								Interface superInterface = (Interface) tmpSuperInterface;
								ASTNode tmpSuperInterfaceDec = cd2c2.getSource();
								if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
									InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
									if (pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, cd2c2) == null) {
										if (pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, superInterface) == null) {
											if (pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, superInterfaceDec) == null) {
												for (EObject tmpCd2c : cd2cList.getEntryObjects()) {
													if (tmpCd2c instanceof ASTNode2Element) {
														ASTNode2Element cd2c = (ASTNode2Element) tmpCd2c;
														if (!cd2c.equals(cd2c2)) {
															ASTNode tmpClassDec = cd2c.getSource();
															if (tmpClassDec instanceof ClassDeclaration) {
																ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
																Element tmpUmlClass = cd2c.getTarget();
																if (tmpUmlClass instanceof BehavioredClassifier) {
																	BehavioredClassifier umlClass = (BehavioredClassifier) tmpUmlClass;
																	if (pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, cd2c) == null) {
																		if (pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, classDec) == null) {
																			if (pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult, umlClass) == null) {
																				_result.add(new Object[] { cd2c2List,
																						superInterface, cd2c2,
																						superInterfaceDec, cd2cList,
																						classDec, cd2c, umlClass,
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

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch, Interface superInterface,
			ClassDeclaration classDec, ASTNode2Element cd2c2, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, ASTNode2Element cd2c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, superInterface, classDec, cd2c2,
				umlClass, superInterfaceDec, cd2c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, superInterface, classDec, cd2c2, umlClass,
					superInterfaceDec, cd2c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch, Interface superInterface,
			ClassDeclaration classDec, ASTNode2Element cd2c2, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, ASTNode2Element cd2c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_binding = pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, superInterface, classDec, cd2c2, umlClass, superInterfaceDec, cd2c,
				ruleResult);
		if (result_pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_black = pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, superInterface, classDec, cd2c2, umlClass,
						superInterfaceDec, cd2c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_29_4_checkCSP_expressionFBB(
			TypeAccess2InterfaceRealization _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_5_checknacs_blackBBBBBB(
			Interface superInterface, ClassDeclaration classDec, ASTNode2Element cd2c2, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, ASTNode2Element cd2c) {
		if (!cd2c.equals(cd2c2)) {
			return new Object[] { superInterface, classDec, cd2c2, umlClass, superInterfaceDec, cd2c };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_6_perform_blackBBBBBBB(
			Interface superInterface, ClassDeclaration classDec, ASTNode2Element cd2c2, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, ASTNode2Element cd2c, ModelgeneratorRuleResult ruleResult) {
		if (!cd2c.equals(cd2c2)) {
			return new Object[] { superInterface, classDec, cd2c2, umlClass, superInterfaceDec, cd2c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_6_perform_greenFBFBFBBB(
			Interface superInterface, ClassDeclaration classDec, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, ModelgeneratorRuleResult ruleResult) {
		TypeAccess typeAcc = JavaFactory.eINSTANCE.createTypeAccess();
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2InterfaceRealization();
		InterfaceRealization interfaceRealization = UMLFactory.eINSTANCE.createInterfaceRealization();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		typeAcc.setType(superInterfaceDec);
		classDec.getSuperInterfaces().add(typeAcc);
		ruleResult.getSourceObjects().add(typeAcc);
		ta2g.setSource(typeAcc);
		ruleResult.getCorrObjects().add(ta2g);
		ta2g.setTarget(interfaceRealization);
		interfaceRealization.setContract(superInterface);
		umlClass.getInterfaceRealizations().add(interfaceRealization);
		ruleResult.getTargetObjects().add(interfaceRealization);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { typeAcc, superInterface, ta2g, classDec, interfaceRealization, umlClass,
				superInterfaceDec, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_TypeAccess2InterfaceRealization_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypeAccess2InterfaceRealizationImpl
