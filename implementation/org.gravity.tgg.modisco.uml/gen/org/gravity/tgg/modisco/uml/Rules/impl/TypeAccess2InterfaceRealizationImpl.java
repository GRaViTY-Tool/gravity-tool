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
	public boolean isAppropriate_FWD(Match match, ClassDeclaration classDec, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec) {

		Object[] result1_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_0_1_initialbindings_blackBBBBB(this, match, classDec, typeAcc,
						superInterfaceDec);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[classDec] = " + classDec + ", " + "[typeAcc] = " + typeAcc + ", "
					+ "[superInterfaceDec] = " + superInterfaceDec + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, classDec,
						typeAcc, superInterfaceDec);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[classDec] = " + classDec + ", " + "[typeAcc] = " + typeAcc + ", "
					+ "[superInterfaceDec] = " + superInterfaceDec + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccess2InterfaceRealizationImpl.pattern_TypeAccess2InterfaceRealization_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_0_4_collectelementstobetranslated_blackBBBB(match,
							classDec, typeAcc, superInterfaceDec);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[classDec] = " + classDec + ", " + "[typeAcc] = " + typeAcc + ", " + "[superInterfaceDec] = "
						+ superInterfaceDec + ".");
			}
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_0_4_collectelementstobetranslated_greenBBBBFFF(match,
							classDec, typeAcc, superInterfaceDec);
			//nothing EMoflonEdge classDec__typeAcc____superInterfaces = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge typeAcc__superInterfaceDec____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result4_green[6];

			Object[] result5_black = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_0_5_collectcontextelements_blackBBBB(match, classDec,
							typeAcc, superInterfaceDec);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[classDec] = " + classDec + ", " + "[typeAcc] = " + typeAcc + ", " + "[superInterfaceDec] = "
						+ superInterfaceDec + ".");
			}
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_0_5_collectcontextelements_greenBBB(match, classDec,
							superInterfaceDec);

			// 
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_0_6_registerobjectstomatch_expressionBBBBB(this, match,
							classDec, typeAcc, superInterfaceDec);
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
		ClassDeclaration classDec = (ClassDeclaration) result1_bindingAndBlack[0];
		ASTNode2Element cd2c2 = (ASTNode2Element) result1_bindingAndBlack[1];
		Interface superInterface = (Interface) result1_bindingAndBlack[2];
		TypeAccess typeAcc = (TypeAccess) result1_bindingAndBlack[3];
		BehavioredClassifier umlClass = (BehavioredClassifier) result1_bindingAndBlack[4];
		ASTNode2Element cd2c = (ASTNode2Element) result1_bindingAndBlack[5];
		InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_greenFBBBF(superInterface, typeAcc,
						umlClass);
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization) result1_green[0];
		InterfaceRealization interfaceRealization = (InterfaceRealization) result1_green[4];

		Object[] result2_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_2_collecttranslatedelements_blackBBB(ta2g, typeAcc,
						interfaceRealization);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ta2g] = " + ta2g + ", "
					+ "[typeAcc] = " + typeAcc + ", " + "[interfaceRealization] = " + interfaceRealization + ".");
		}
		Object[] result2_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_2_collecttranslatedelements_greenFBBB(ta2g, typeAcc,
						interfaceRealization);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, ta2g,
						classDec, cd2c2, superInterface, typeAcc, umlClass, cd2c, interfaceRealization,
						superInterfaceDec);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[ta2g] = " + ta2g + ", " + "[classDec] = " + classDec + ", " + "[cd2c2] = " + cd2c2 + ", "
					+ "[superInterface] = " + superInterface + ", " + "[typeAcc] = " + typeAcc + ", " + "[umlClass] = "
					+ umlClass + ", " + "[cd2c] = " + cd2c + ", " + "[interfaceRealization] = " + interfaceRealization
					+ ", " + "[superInterfaceDec] = " + superInterfaceDec + ".");
		}
		TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFF(ruleresult, ta2g,
						classDec, superInterface, typeAcc, umlClass, interfaceRealization, superInterfaceDec);
		//nothing EMoflonEdge classDec__typeAcc____superInterfaces = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge ta2g__typeAcc____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge umlClass__interfaceRealization____interfaceRealization = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge interfaceRealization__umlClass____implementingClassifier = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge typeAcc__superInterfaceDec____type = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge ta2g__interfaceRealization____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge interfaceRealization__superInterface____contract = (EMoflonEdge) result3_green[15];

		// 
		// 
		TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
						ta2g, classDec, cd2c2, superInterface, typeAcc, umlClass, cd2c, interfaceRealization,
						superInterfaceDec);
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
		ClassDeclaration classDec = (ClassDeclaration) result2_binding[0];
		TypeAccess typeAcc = (TypeAccess) result2_binding[1];
		InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_binding[2];
		for (Object[] result2_black : TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_2_2_corematch_blackBFFBFFBB(classDec, typeAcc,
						superInterfaceDec, match)) {
			ASTNode2Element cd2c2 = (ASTNode2Element) result2_black[1];
			Interface superInterface = (Interface) result2_black[2];
			BehavioredClassifier umlClass = (BehavioredClassifier) result2_black[4];
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[5];
			// ForEach 
			for (Object[] result3_black : TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_2_3_findcontext_blackBBBBBBB(classDec, cd2c2,
							superInterface, typeAcc, umlClass, cd2c, superInterfaceDec)) {
				Object[] result3_green = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_2_3_findcontext_greenBBBBBBBFFFFFFFF(classDec, cd2c2,
								superInterface, typeAcc, umlClass, cd2c, superInterfaceDec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge classDec__typeAcc____superInterfaces = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge cd2c2__superInterface____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge typeAcc__superInterfaceDec____type = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge cd2c__classDec____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge cd2c__umlClass____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge cd2c2__superInterfaceDec____source = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, classDec, cd2c2, superInterface, typeAcc, umlClass, cd2c,
								superInterfaceDec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[classDec] = " + classDec + ", "
							+ "[cd2c2] = " + cd2c2 + ", " + "[superInterface] = " + superInterface + ", "
							+ "[typeAcc] = " + typeAcc + ", " + "[umlClass] = " + umlClass + ", " + "[cd2c] = " + cd2c
							+ ", " + "[superInterfaceDec] = " + superInterfaceDec + ".");
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
	public void registerObjectsToMatch_FWD(Match match, ClassDeclaration classDec, TypeAccess typeAcc,
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
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassDeclaration classDec, TypeAccess typeAcc,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ClassDeclaration classDec,
			ASTNode2Element cd2c2, Interface superInterface, TypeAccess typeAcc, BehavioredClassifier umlClass,
			ASTNode2Element cd2c, InterfaceDeclaration superInterfaceDec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("cd2c2", cd2c2);
		isApplicableMatch.registerObject("superInterface", superInterface);
		isApplicableMatch.registerObject("typeAcc", typeAcc);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("superInterfaceDec", superInterfaceDec);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject ta2g, EObject classDec, EObject cd2c2,
			EObject superInterface, EObject typeAcc, EObject umlClass, EObject cd2c, EObject interfaceRealization,
			EObject superInterfaceDec) {
		ruleresult.registerObject("ta2g", ta2g);
		ruleresult.registerObject("classDec", classDec);
		ruleresult.registerObject("cd2c2", cd2c2);
		ruleresult.registerObject("superInterface", superInterface);
		ruleresult.registerObject("typeAcc", typeAcc);
		ruleresult.registerObject("umlClass", umlClass);
		ruleresult.registerObject("cd2c", cd2c);
		ruleresult.registerObject("interfaceRealization", interfaceRealization);
		ruleresult.registerObject("superInterfaceDec", superInterfaceDec);

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
	public boolean isAppropriate_BWD(Match match, Interface superInterface, BehavioredClassifier umlClass,
			InterfaceRealization interfaceRealization) {

		Object[] result1_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_10_1_initialbindings_blackBBBBB(this, match, superInterface,
						umlClass, interfaceRealization);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[superInterface] = " + superInterface + ", " + "[umlClass] = "
					+ umlClass + ", " + "[interfaceRealization] = " + interfaceRealization + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
						superInterface, umlClass, interfaceRealization);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[superInterface] = " + superInterface + ", " + "[umlClass] = "
					+ umlClass + ", " + "[interfaceRealization] = " + interfaceRealization + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_10_4_collectelementstobetranslated_blackBBBB(match,
							superInterface, umlClass, interfaceRealization);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[superInterface] = " + superInterface + ", " + "[umlClass] = " + umlClass + ", "
						+ "[interfaceRealization] = " + interfaceRealization + ".");
			}
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_10_4_collectelementstobetranslated_greenBBBBFFF(match,
							superInterface, umlClass, interfaceRealization);
			//nothing EMoflonEdge umlClass__interfaceRealization____interfaceRealization = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge interfaceRealization__umlClass____implementingClassifier = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge interfaceRealization__superInterface____contract = (EMoflonEdge) result4_green[6];

			Object[] result5_black = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_10_5_collectcontextelements_blackBBBB(match,
							superInterface, umlClass, interfaceRealization);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[superInterface] = " + superInterface + ", " + "[umlClass] = " + umlClass + ", "
						+ "[interfaceRealization] = " + interfaceRealization + ".");
			}
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_10_5_collectcontextelements_greenBBB(match, superInterface,
							umlClass);

			// 
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							superInterface, umlClass, interfaceRealization);
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
		ClassDeclaration classDec = (ClassDeclaration) result1_bindingAndBlack[0];
		ASTNode2Element cd2c2 = (ASTNode2Element) result1_bindingAndBlack[1];
		Interface superInterface = (Interface) result1_bindingAndBlack[2];
		BehavioredClassifier umlClass = (BehavioredClassifier) result1_bindingAndBlack[3];
		ASTNode2Element cd2c = (ASTNode2Element) result1_bindingAndBlack[4];
		InterfaceRealization interfaceRealization = (InterfaceRealization) result1_bindingAndBlack[5];
		InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_greenFBFBB(classDec,
						interfaceRealization, superInterfaceDec);
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization) result1_green[0];
		TypeAccess typeAcc = (TypeAccess) result1_green[2];

		Object[] result2_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_2_collecttranslatedelements_blackBBB(ta2g, typeAcc,
						interfaceRealization);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ta2g] = " + ta2g + ", "
					+ "[typeAcc] = " + typeAcc + ", " + "[interfaceRealization] = " + interfaceRealization + ".");
		}
		Object[] result2_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_2_collecttranslatedelements_greenFBBB(ta2g, typeAcc,
						interfaceRealization);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, ta2g,
						classDec, cd2c2, superInterface, typeAcc, umlClass, cd2c, interfaceRealization,
						superInterfaceDec);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[ta2g] = " + ta2g + ", " + "[classDec] = " + classDec + ", " + "[cd2c2] = " + cd2c2 + ", "
					+ "[superInterface] = " + superInterface + ", " + "[typeAcc] = " + typeAcc + ", " + "[umlClass] = "
					+ umlClass + ", " + "[cd2c] = " + cd2c + ", " + "[interfaceRealization] = " + interfaceRealization
					+ ", " + "[superInterfaceDec] = " + superInterfaceDec + ".");
		}
		TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFF(ruleresult,
						ta2g, classDec, superInterface, typeAcc, umlClass, interfaceRealization, superInterfaceDec);
		//nothing EMoflonEdge classDec__typeAcc____superInterfaces = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge ta2g__typeAcc____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge umlClass__interfaceRealization____interfaceRealization = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge interfaceRealization__umlClass____implementingClassifier = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge typeAcc__superInterfaceDec____type = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge ta2g__interfaceRealization____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge interfaceRealization__superInterface____contract = (EMoflonEdge) result3_green[15];

		// 
		// 
		TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
						ta2g, classDec, cd2c2, superInterface, typeAcc, umlClass, cd2c, interfaceRealization,
						superInterfaceDec);
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
		BehavioredClassifier umlClass = (BehavioredClassifier) result2_binding[1];
		InterfaceRealization interfaceRealization = (InterfaceRealization) result2_binding[2];
		for (Object[] result2_black : TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_12_2_corematch_blackFFBBFBFB(superInterface, umlClass,
						interfaceRealization, match)) {
			ClassDeclaration classDec = (ClassDeclaration) result2_black[0];
			ASTNode2Element cd2c2 = (ASTNode2Element) result2_black[1];
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[4];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_black[6];
			// ForEach 
			for (Object[] result3_black : TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_12_3_findcontext_blackBBBBBBB(classDec, cd2c2,
							superInterface, umlClass, cd2c, interfaceRealization, superInterfaceDec)) {
				Object[] result3_green = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_12_3_findcontext_greenBBBBBBBFFFFFFFF(classDec, cd2c2,
								superInterface, umlClass, cd2c, interfaceRealization, superInterfaceDec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge cd2c2__superInterface____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge umlClass__interfaceRealization____interfaceRealization = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge interfaceRealization__umlClass____implementingClassifier = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge cd2c__classDec____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge interfaceRealization__superInterface____contract = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge cd2c__umlClass____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge cd2c2__superInterfaceDec____source = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, classDec, cd2c2, superInterface, umlClass, cd2c,
								interfaceRealization, superInterfaceDec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[classDec] = " + classDec + ", "
							+ "[cd2c2] = " + cd2c2 + ", " + "[superInterface] = " + superInterface + ", "
							+ "[umlClass] = " + umlClass + ", " + "[cd2c] = " + cd2c + ", "
							+ "[interfaceRealization] = " + interfaceRealization + ", " + "[superInterfaceDec] = "
							+ superInterfaceDec + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Interface superInterface, BehavioredClassifier umlClass,
			InterfaceRealization interfaceRealization) {
		match.registerObject("superInterface", superInterface);
		match.registerObject("umlClass", umlClass);
		match.registerObject("interfaceRealization", interfaceRealization);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Interface superInterface, BehavioredClassifier umlClass,
			InterfaceRealization interfaceRealization) {// Create CSP
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
			ASTNode2Element cd2c2, Interface superInterface, BehavioredClassifier umlClass, ASTNode2Element cd2c,
			InterfaceRealization interfaceRealization, InterfaceDeclaration superInterfaceDec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("cd2c2", cd2c2);
		isApplicableMatch.registerObject("superInterface", superInterface);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("interfaceRealization", interfaceRealization);
		isApplicableMatch.registerObject("superInterfaceDec", superInterfaceDec);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject ta2g, EObject classDec, EObject cd2c2,
			EObject superInterface, EObject typeAcc, EObject umlClass, EObject cd2c, EObject interfaceRealization,
			EObject superInterfaceDec) {
		ruleresult.registerObject("ta2g", ta2g);
		ruleresult.registerObject("classDec", classDec);
		ruleresult.registerObject("cd2c2", cd2c2);
		ruleresult.registerObject("superInterface", superInterface);
		ruleresult.registerObject("typeAcc", typeAcc);
		ruleresult.registerObject("umlClass", umlClass);
		ruleresult.registerObject("cd2c", cd2c);
		ruleresult.registerObject("interfaceRealization", interfaceRealization);
		ruleresult.registerObject("superInterfaceDec", superInterfaceDec);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_143(EMoflonEdge _edge_interfaceRealization) {

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
				.pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_blackFFFB(
						_edge_interfaceRealization)) {
			Interface superInterface = (Interface) result2_black[0];
			BehavioredClassifier umlClass = (BehavioredClassifier) result2_black[1];
			InterfaceRealization interfaceRealization = (InterfaceRealization) result2_black[2];
			Object[] result2_green = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, superInterface, umlClass, interfaceRealization)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_154(EMoflonEdge _edge_superInterfaces) {

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
				.pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_blackFFFB(_edge_superInterfaces)) {
			ClassDeclaration classDec = (ClassDeclaration) result2_black[0];
			TypeAccess typeAcc = (TypeAccess) result2_black[1];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_black[2];
			Object[] result2_green = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, classDec, typeAcc, superInterfaceDec)) {
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
		ClassDeclaration classDec = (ClassDeclaration) result2_bindingAndBlack[0];
		Interface superInterface = (Interface) result2_bindingAndBlack[1];
		TypeAccess typeAcc = (TypeAccess) result2_bindingAndBlack[2];
		BehavioredClassifier umlClass = (BehavioredClassifier) result2_bindingAndBlack[3];
		InterfaceRealization interfaceRealization = (InterfaceRealization) result2_bindingAndBlack[4];
		InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, classDec,
						superInterface, typeAcc, umlClass, interfaceRealization, superInterfaceDec, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[classDec] = " + classDec + ", " + "[superInterface] = " + superInterface + ", " + "[typeAcc] = "
					+ typeAcc + ", " + "[umlClass] = " + umlClass + ", " + "[interfaceRealization] = "
					+ interfaceRealization + ", " + "[superInterfaceDec] = " + superInterfaceDec + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_24_5_matchcorrcontext_blackBFBBFBBB(classDec,
							superInterface, umlClass, superInterfaceDec, sourceMatch, targetMatch)) {
				ASTNode2Element cd2c2 = (ASTNode2Element) result5_black[1];
				ASTNode2Element cd2c = (ASTNode2Element) result5_black[4];
				Object[] result5_green = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_24_5_matchcorrcontext_greenBBBBF(cd2c2, cd2c,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_24_6_createcorrespondence_blackBBBBBBB(classDec,
								superInterface, typeAcc, umlClass, interfaceRealization, superInterfaceDec, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[classDec] = " + classDec
							+ ", " + "[superInterface] = " + superInterface + ", " + "[typeAcc] = " + typeAcc + ", "
							+ "[umlClass] = " + umlClass + ", " + "[interfaceRealization] = " + interfaceRealization
							+ ", " + "[superInterfaceDec] = " + superInterfaceDec + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_24_6_createcorrespondence_greenFBBB(typeAcc,
								interfaceRealization, ccMatch);
				//nothing org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization) result6_green[0];

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
	public CSP isApplicable_solveCsp_CC(ClassDeclaration classDec, Interface superInterface, TypeAccess typeAcc,
			BehavioredClassifier umlClass, InterfaceRealization interfaceRealization,
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
	public boolean checkDEC_FWD(ClassDeclaration classDec, TypeAccess typeAcc, InterfaceDeclaration superInterfaceDec) {// 
		Object[] result1_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_blackBBB(classDec, typeAcc,
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
	public boolean checkDEC_BWD(Interface superInterface, BehavioredClassifier umlClass,
			InterfaceRealization interfaceRealization) {// 
		Object[] result1_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_blackBBB(superInterface, umlClass,
						interfaceRealization);
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
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element cd2cParameter,
			ASTNode2Element cd2c2Parameter) {

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
			//nothing RuleEntryList cd2cList = (RuleEntryList) result2_black[0];
			ClassDeclaration classDec = (ClassDeclaration) result2_black[1];
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[2];
			BehavioredClassifier umlClass = (BehavioredClassifier) result2_black[3];
			//nothing RuleEntryList cd2c2List = (RuleEntryList) result2_black[4];
			ASTNode2Element cd2c2 = (ASTNode2Element) result2_black[5];
			Interface superInterface = (Interface) result2_black[6];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_black[7];

			Object[] result3_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, classDec, cd2c2, superInterface, umlClass, cd2c, superInterfaceDec,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[classDec] = " + classDec + ", "
						+ "[cd2c2] = " + cd2c2 + ", " + "[superInterface] = " + superInterface + ", " + "[umlClass] = "
						+ umlClass + ", " + "[cd2c] = " + cd2c + ", " + "[superInterfaceDec] = " + superInterfaceDec
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_29_5_checknacs_blackBBBBBB(classDec, cd2c2,
								superInterface, umlClass, cd2c, superInterfaceDec);
				if (result5_black != null) {

					Object[] result6_black = TypeAccess2InterfaceRealizationImpl
							.pattern_TypeAccess2InterfaceRealization_29_6_perform_blackBBBBBBB(classDec, cd2c2,
									superInterface, umlClass, cd2c, superInterfaceDec, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[classDec] = "
								+ classDec + ", " + "[cd2c2] = " + cd2c2 + ", " + "[superInterface] = " + superInterface
								+ ", " + "[umlClass] = " + umlClass + ", " + "[cd2c] = " + cd2c + ", "
								+ "[superInterfaceDec] = " + superInterfaceDec + ", " + "[ruleResult] = " + ruleResult
								+ ".");
					}
					TypeAccess2InterfaceRealizationImpl
							.pattern_TypeAccess2InterfaceRealization_29_6_perform_greenFBBFBFBB(classDec,
									superInterface, umlClass, superInterfaceDec, ruleResult);
					//nothing org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization) result6_green[0];
					//nothing TypeAccess typeAcc = (TypeAccess) result6_green[3];
					//nothing InterfaceRealization interfaceRealization = (InterfaceRealization) result6_green[5];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassDeclaration classDec,
			ASTNode2Element cd2c2, Interface superInterface, BehavioredClassifier umlClass, ASTNode2Element cd2c,
			InterfaceDeclaration superInterfaceDec, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("cd2c2", cd2c2);
		isApplicableMatch.registerObject("superInterface", superInterface);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("superInterfaceDec", superInterfaceDec);
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
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_FWD__MATCH_CLASSDECLARATION_TYPEACCESS_INTERFACEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSDECLARATION_TYPEACCESS_INTERFACEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
			return null;
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSDECLARATION_TYPEACCESS_INTERFACEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASSDECLARATION_ASTNODE2ELEMENT_INTERFACE_TYPEACCESS_BEHAVIOREDCLASSIFIER_ASTNODE2ELEMENT_INTERFACEDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (Interface) arguments.get(3), (TypeAccess) arguments.get(4),
					(BehavioredClassifier) arguments.get(5), (ASTNode2Element) arguments.get(6),
					(InterfaceDeclaration) arguments.get(7));
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
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_BWD__MATCH_INTERFACE_BEHAVIOREDCLASSIFIER_INTERFACEREALIZATION:
			return isAppropriate_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
					(BehavioredClassifier) arguments.get(2), (InterfaceRealization) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERFACE_BEHAVIOREDCLASSIFIER_INTERFACEREALIZATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
					(BehavioredClassifier) arguments.get(2), (InterfaceRealization) arguments.get(3));
			return null;
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERFACE_BEHAVIOREDCLASSIFIER_INTERFACEREALIZATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
					(BehavioredClassifier) arguments.get(2), (InterfaceRealization) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDECLARATION_ASTNODE2ELEMENT_INTERFACE_BEHAVIOREDCLASSIFIER_ASTNODE2ELEMENT_INTERFACEREALIZATION_INTERFACEDECLARATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (Interface) arguments.get(3),
					(BehavioredClassifier) arguments.get(4), (ASTNode2Element) arguments.get(5),
					(InterfaceRealization) arguments.get(6), (InterfaceDeclaration) arguments.get(7));
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
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_143__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_143((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_154__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_154((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_SOLVE_CSP_CC__CLASSDECLARATION_INTERFACE_TYPEACCESS_BEHAVIOREDCLASSIFIER_INTERFACEREALIZATION_INTERFACEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((ClassDeclaration) arguments.get(0), (Interface) arguments.get(1),
					(TypeAccess) arguments.get(2), (BehavioredClassifier) arguments.get(3),
					(InterfaceRealization) arguments.get(4), (InterfaceDeclaration) arguments.get(5),
					(Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___CHECK_DEC_FWD__CLASSDECLARATION_TYPEACCESS_INTERFACEDECLARATION:
			return checkDEC_FWD((ClassDeclaration) arguments.get(0), (TypeAccess) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___CHECK_DEC_BWD__INTERFACE_BEHAVIOREDCLASSIFIER_INTERFACEREALIZATION:
			return checkDEC_BWD((Interface) arguments.get(0), (BehavioredClassifier) arguments.get(1),
					(InterfaceRealization) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDECLARATION_ASTNODE2ELEMENT_INTERFACE_BEHAVIOREDCLASSIFIER_ASTNODE2ELEMENT_INTERFACEDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (Interface) arguments.get(3),
					(BehavioredClassifier) arguments.get(4), (ASTNode2Element) arguments.get(5),
					(InterfaceDeclaration) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_1_initialbindings_blackBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, ClassDeclaration classDec, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec) {
		return new Object[] { _this, match, classDec, typeAcc, superInterfaceDec };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_bindingFBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, ClassDeclaration classDec, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, classDec, typeAcc, superInterfaceDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, classDec, typeAcc, superInterfaceDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_bindingAndBlackFBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, ClassDeclaration classDec, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_binding = pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_bindingFBBBBB(
				_this, match, classDec, typeAcc, superInterfaceDec);
		if (result_pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_black = pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, classDec, typeAcc, superInterfaceDec };
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
			Match match, ClassDeclaration classDec, TypeAccess typeAcc, InterfaceDeclaration superInterfaceDec) {
		return new Object[] { match, classDec, typeAcc, superInterfaceDec };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, ClassDeclaration classDec, TypeAccess typeAcc, InterfaceDeclaration superInterfaceDec) {
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

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_5_collectcontextelements_blackBBBB(
			Match match, ClassDeclaration classDec, TypeAccess typeAcc, InterfaceDeclaration superInterfaceDec) {
		return new Object[] { match, classDec, typeAcc, superInterfaceDec };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_5_collectcontextelements_greenBBB(
			Match match, ClassDeclaration classDec, InterfaceDeclaration superInterfaceDec) {
		match.getContextNodes().add(classDec);
		match.getContextNodes().add(superInterfaceDec);
		return new Object[] { match, classDec, superInterfaceDec };
	}

	public static final void pattern_TypeAccess2InterfaceRealization_0_6_registerobjectstomatch_expressionBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, ClassDeclaration classDec, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec) {
		_this.registerObjectsToMatch_FWD(match, classDec, typeAcc, superInterfaceDec);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("classDec");
		EObject _localVariable_1 = isApplicableMatch.getObject("cd2c2");
		EObject _localVariable_2 = isApplicableMatch.getObject("superInterface");
		EObject _localVariable_3 = isApplicableMatch.getObject("typeAcc");
		EObject _localVariable_4 = isApplicableMatch.getObject("umlClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("cd2c");
		EObject _localVariable_6 = isApplicableMatch.getObject("superInterfaceDec");
		EObject tmpClassDec = _localVariable_0;
		EObject tmpCd2c2 = _localVariable_1;
		EObject tmpSuperInterface = _localVariable_2;
		EObject tmpTypeAcc = _localVariable_3;
		EObject tmpUmlClass = _localVariable_4;
		EObject tmpCd2c = _localVariable_5;
		EObject tmpSuperInterfaceDec = _localVariable_6;
		if (tmpClassDec instanceof ClassDeclaration) {
			ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
			if (tmpCd2c2 instanceof ASTNode2Element) {
				ASTNode2Element cd2c2 = (ASTNode2Element) tmpCd2c2;
				if (tmpSuperInterface instanceof Interface) {
					Interface superInterface = (Interface) tmpSuperInterface;
					if (tmpTypeAcc instanceof TypeAccess) {
						TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
						if (tmpUmlClass instanceof BehavioredClassifier) {
							BehavioredClassifier umlClass = (BehavioredClassifier) tmpUmlClass;
							if (tmpCd2c instanceof ASTNode2Element) {
								ASTNode2Element cd2c = (ASTNode2Element) tmpCd2c;
								if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
									InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
									return new Object[] { classDec, cd2c2, superInterface, typeAcc, umlClass, cd2c,
											superInterfaceDec, isApplicableMatch };
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
			ClassDeclaration classDec, ASTNode2Element cd2c2, Interface superInterface, TypeAccess typeAcc,
			BehavioredClassifier umlClass, ASTNode2Element cd2c, InterfaceDeclaration superInterfaceDec,
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch) {
		if (!cd2c.equals(cd2c2)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { classDec, cd2c2, superInterface, typeAcc, umlClass, cd2c, superInterfaceDec,
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
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[0];
			ASTNode2Element cd2c2 = (ASTNode2Element) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[1];
			Interface superInterface = (Interface) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[2];
			TypeAccess typeAcc = (TypeAccess) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[3];
			BehavioredClassifier umlClass = (BehavioredClassifier) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[4];
			ASTNode2Element cd2c = (ASTNode2Element) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[5];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[6];

			Object[] result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_black = pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_blackBBBBBBBFBB(
					classDec, cd2c2, superInterface, typeAcc, umlClass, cd2c, superInterfaceDec, _this,
					isApplicableMatch);
			if (result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_black[7];

				return new Object[] { classDec, cd2c2, superInterface, typeAcc, umlClass, cd2c, superInterfaceDec, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_greenFBBBF(
			Interface superInterface, TypeAccess typeAcc, BehavioredClassifier umlClass) {
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2InterfaceRealization();
		InterfaceRealization interfaceRealization = UMLFactory.eINSTANCE.createInterfaceRealization();
		ta2g.setSource(typeAcc);
		umlClass.getInterfaceRealizations().add(interfaceRealization);
		ta2g.setTarget(interfaceRealization);
		interfaceRealization.setContract(superInterface);
		return new Object[] { ta2g, superInterface, typeAcc, umlClass, interfaceRealization };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_1_2_collecttranslatedelements_blackBBB(
			org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g, TypeAccess typeAcc,
			InterfaceRealization interfaceRealization) {
		return new Object[] { ta2g, typeAcc, interfaceRealization };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_1_2_collecttranslatedelements_greenFBBB(
			org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g, TypeAccess typeAcc,
			InterfaceRealization interfaceRealization) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(ta2g);
		ruleresult.getTranslatedElements().add(typeAcc);
		ruleresult.getCreatedElements().add(interfaceRealization);
		return new Object[] { ruleresult, ta2g, typeAcc, interfaceRealization };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject ta2g, EObject classDec, EObject cd2c2, EObject superInterface,
			EObject typeAcc, EObject umlClass, EObject cd2c, EObject interfaceRealization, EObject superInterfaceDec) {
		if (!ta2g.equals(typeAcc)) {
			if (!ta2g.equals(umlClass)) {
				if (!classDec.equals(ta2g)) {
					if (!classDec.equals(superInterface)) {
						if (!classDec.equals(typeAcc)) {
							if (!classDec.equals(umlClass)) {
								if (!classDec.equals(interfaceRealization)) {
									if (!classDec.equals(superInterfaceDec)) {
										if (!cd2c2.equals(ta2g)) {
											if (!cd2c2.equals(classDec)) {
												if (!cd2c2.equals(superInterface)) {
													if (!cd2c2.equals(typeAcc)) {
														if (!cd2c2.equals(umlClass)) {
															if (!cd2c2.equals(interfaceRealization)) {
																if (!cd2c2.equals(superInterfaceDec)) {
																	if (!superInterface.equals(ta2g)) {
																		if (!superInterface.equals(typeAcc)) {
																			if (!superInterface.equals(umlClass)) {
																				if (!superInterface
																						.equals(superInterfaceDec)) {
																					if (!typeAcc.equals(umlClass)) {
																						if (!cd2c.equals(ta2g)) {
																							if (!cd2c
																									.equals(classDec)) {
																								if (!cd2c.equals(
																										cd2c2)) {
																									if (!cd2c.equals(
																											superInterface)) {
																										if (!cd2c
																												.equals(typeAcc)) {
																											if (!cd2c
																													.equals(umlClass)) {
																												if (!cd2c
																														.equals(interfaceRealization)) {
																													if (!cd2c
																															.equals(superInterfaceDec)) {
																														if (!interfaceRealization
																																.equals(ta2g)) {
																															if (!interfaceRealization
																																	.equals(superInterface)) {
																																if (!interfaceRealization
																																		.equals(typeAcc)) {
																																	if (!interfaceRealization
																																			.equals(umlClass)) {
																																		if (!interfaceRealization
																																				.equals(superInterfaceDec)) {
																																			if (!superInterfaceDec
																																					.equals(ta2g)) {
																																				if (!superInterfaceDec
																																						.equals(typeAcc)) {
																																					if (!superInterfaceDec
																																							.equals(umlClass)) {
																																						return new Object[] {
																																								ruleresult,
																																								ta2g,
																																								classDec,
																																								cd2c2,
																																								superInterface,
																																								typeAcc,
																																								umlClass,
																																								cd2c,
																																								interfaceRealization,
																																								superInterfaceDec };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject ta2g, EObject classDec, EObject superInterface, EObject typeAcc,
			EObject umlClass, EObject interfaceRealization, EObject superInterfaceDec) {
		EMoflonEdge classDec__typeAcc____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__typeAcc____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClass__interfaceRealization____interfaceRealization = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interfaceRealization__umlClass____implementingClassifier = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeAcc__superInterfaceDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__interfaceRealization____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge interfaceRealization__superInterface____contract = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccess2InterfaceRealization";
		String classDec__typeAcc____superInterfaces_name_prime = "superInterfaces";
		String ta2g__typeAcc____source_name_prime = "source";
		String umlClass__interfaceRealization____interfaceRealization_name_prime = "interfaceRealization";
		String interfaceRealization__umlClass____implementingClassifier_name_prime = "implementingClassifier";
		String typeAcc__superInterfaceDec____type_name_prime = "type";
		String superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String ta2g__interfaceRealization____target_name_prime = "target";
		String interfaceRealization__superInterface____contract_name_prime = "contract";
		classDec__typeAcc____superInterfaces.setSrc(classDec);
		classDec__typeAcc____superInterfaces.setTrg(typeAcc);
		ruleresult.getTranslatedEdges().add(classDec__typeAcc____superInterfaces);
		ta2g__typeAcc____source.setSrc(ta2g);
		ta2g__typeAcc____source.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(ta2g__typeAcc____source);
		umlClass__interfaceRealization____interfaceRealization.setSrc(umlClass);
		umlClass__interfaceRealization____interfaceRealization.setTrg(interfaceRealization);
		ruleresult.getCreatedEdges().add(umlClass__interfaceRealization____interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setSrc(interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setTrg(umlClass);
		ruleresult.getCreatedEdges().add(interfaceRealization__umlClass____implementingClassifier);
		typeAcc__superInterfaceDec____type.setSrc(typeAcc);
		typeAcc__superInterfaceDec____type.setTrg(superInterfaceDec);
		ruleresult.getTranslatedEdges().add(typeAcc__superInterfaceDec____type);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setSrc(superInterfaceDec);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		ruleresult.getTranslatedEdges().add(superInterfaceDec__typeAcc____usagesInTypeAccess);
		ta2g__interfaceRealization____target.setSrc(ta2g);
		ta2g__interfaceRealization____target.setTrg(interfaceRealization);
		ruleresult.getCreatedEdges().add(ta2g__interfaceRealization____target);
		interfaceRealization__superInterface____contract.setSrc(interfaceRealization);
		interfaceRealization__superInterface____contract.setTrg(superInterface);
		ruleresult.getCreatedEdges().add(interfaceRealization__superInterface____contract);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		classDec__typeAcc____superInterfaces.setName(classDec__typeAcc____superInterfaces_name_prime);
		ta2g__typeAcc____source.setName(ta2g__typeAcc____source_name_prime);
		umlClass__interfaceRealization____interfaceRealization
				.setName(umlClass__interfaceRealization____interfaceRealization_name_prime);
		interfaceRealization__umlClass____implementingClassifier
				.setName(interfaceRealization__umlClass____implementingClassifier_name_prime);
		typeAcc__superInterfaceDec____type.setName(typeAcc__superInterfaceDec____type_name_prime);
		superInterfaceDec__typeAcc____usagesInTypeAccess
				.setName(superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime);
		ta2g__interfaceRealization____target.setName(ta2g__interfaceRealization____target_name_prime);
		interfaceRealization__superInterface____contract
				.setName(interfaceRealization__superInterface____contract_name_prime);
		return new Object[] { ruleresult, ta2g, classDec, superInterface, typeAcc, umlClass, interfaceRealization,
				superInterfaceDec, classDec__typeAcc____superInterfaces, ta2g__typeAcc____source,
				umlClass__interfaceRealization____interfaceRealization,
				interfaceRealization__umlClass____implementingClassifier, typeAcc__superInterfaceDec____type,
				superInterfaceDec__typeAcc____usagesInTypeAccess, ta2g__interfaceRealization____target,
				interfaceRealization__superInterface____contract };
	}

	public static final void pattern_TypeAccess2InterfaceRealization_1_5_registerobjects_expressionBBBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, PerformRuleResult ruleresult, EObject ta2g, EObject classDec,
			EObject cd2c2, EObject superInterface, EObject typeAcc, EObject umlClass, EObject cd2c,
			EObject interfaceRealization, EObject superInterfaceDec) {
		_this.registerObjects_FWD(ruleresult, ta2g, classDec, cd2c2, superInterface, typeAcc, umlClass, cd2c,
				interfaceRealization, superInterfaceDec);

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
		EObject _localVariable_0 = match.getObject("classDec");
		EObject _localVariable_1 = match.getObject("typeAcc");
		EObject _localVariable_2 = match.getObject("superInterfaceDec");
		EObject tmpClassDec = _localVariable_0;
		EObject tmpTypeAcc = _localVariable_1;
		EObject tmpSuperInterfaceDec = _localVariable_2;
		if (tmpClassDec instanceof ClassDeclaration) {
			ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
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

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_2_2_corematch_blackBFFBFFBB(
			ClassDeclaration classDec, TypeAccess typeAcc, InterfaceDeclaration superInterfaceDec, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element cd2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(classDec,
				ASTNode2Element.class, "source")) {
			Element tmpUmlClass = cd2c.getTarget();
			if (tmpUmlClass instanceof BehavioredClassifier) {
				BehavioredClassifier umlClass = (BehavioredClassifier) tmpUmlClass;
				for (ASTNode2Element cd2c2 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(superInterfaceDec, ASTNode2Element.class, "source")) {
					if (!cd2c.equals(cd2c2)) {
						Element tmpSuperInterface = cd2c2.getTarget();
						if (tmpSuperInterface instanceof Interface) {
							Interface superInterface = (Interface) tmpSuperInterface;
							_result.add(new Object[] { classDec, cd2c2, superInterface, typeAcc, umlClass, cd2c,
									superInterfaceDec, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_2_3_findcontext_blackBBBBBBB(
			ClassDeclaration classDec, ASTNode2Element cd2c2, Interface superInterface, TypeAccess typeAcc,
			BehavioredClassifier umlClass, ASTNode2Element cd2c, InterfaceDeclaration superInterfaceDec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!cd2c.equals(cd2c2)) {
			if (classDec.getSuperInterfaces().contains(typeAcc)) {
				if (superInterface.equals(cd2c2.getTarget())) {
					if (superInterfaceDec.equals(typeAcc.getType())) {
						if (classDec.equals(cd2c.getSource())) {
							if (umlClass.equals(cd2c.getTarget())) {
								if (superInterfaceDec.equals(cd2c2.getSource())) {
									_result.add(new Object[] { classDec, cd2c2, superInterface, typeAcc, umlClass, cd2c,
											superInterfaceDec });
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
			ClassDeclaration classDec, ASTNode2Element cd2c2, Interface superInterface, TypeAccess typeAcc,
			BehavioredClassifier umlClass, ASTNode2Element cd2c, InterfaceDeclaration superInterfaceDec) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge classDec__typeAcc____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superInterface____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAcc__superInterfaceDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superInterfaceDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String classDec__typeAcc____superInterfaces_name_prime = "superInterfaces";
		String cd2c2__superInterface____target_name_prime = "target";
		String typeAcc__superInterfaceDec____type_name_prime = "type";
		String superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String cd2c__classDec____source_name_prime = "source";
		String cd2c__umlClass____target_name_prime = "target";
		String cd2c2__superInterfaceDec____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c2);
		isApplicableMatch.getAllContextElements().add(superInterface);
		isApplicableMatch.getAllContextElements().add(typeAcc);
		isApplicableMatch.getAllContextElements().add(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c);
		isApplicableMatch.getAllContextElements().add(superInterfaceDec);
		classDec__typeAcc____superInterfaces.setSrc(classDec);
		classDec__typeAcc____superInterfaces.setTrg(typeAcc);
		isApplicableMatch.getAllContextElements().add(classDec__typeAcc____superInterfaces);
		cd2c2__superInterface____target.setSrc(cd2c2);
		cd2c2__superInterface____target.setTrg(superInterface);
		isApplicableMatch.getAllContextElements().add(cd2c2__superInterface____target);
		typeAcc__superInterfaceDec____type.setSrc(typeAcc);
		typeAcc__superInterfaceDec____type.setTrg(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(typeAcc__superInterfaceDec____type);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setSrc(superInterfaceDec);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		isApplicableMatch.getAllContextElements().add(superInterfaceDec__typeAcc____usagesInTypeAccess);
		cd2c__classDec____source.setSrc(cd2c);
		cd2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c__classDec____source);
		cd2c__umlClass____target.setSrc(cd2c);
		cd2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c__umlClass____target);
		cd2c2__superInterfaceDec____source.setSrc(cd2c2);
		cd2c2__superInterfaceDec____source.setTrg(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(cd2c2__superInterfaceDec____source);
		classDec__typeAcc____superInterfaces.setName(classDec__typeAcc____superInterfaces_name_prime);
		cd2c2__superInterface____target.setName(cd2c2__superInterface____target_name_prime);
		typeAcc__superInterfaceDec____type.setName(typeAcc__superInterfaceDec____type_name_prime);
		superInterfaceDec__typeAcc____usagesInTypeAccess
				.setName(superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime);
		cd2c__classDec____source.setName(cd2c__classDec____source_name_prime);
		cd2c__umlClass____target.setName(cd2c__umlClass____target_name_prime);
		cd2c2__superInterfaceDec____source.setName(cd2c2__superInterfaceDec____source_name_prime);
		return new Object[] { classDec, cd2c2, superInterface, typeAcc, umlClass, cd2c, superInterfaceDec,
				isApplicableMatch, classDec__typeAcc____superInterfaces, cd2c2__superInterface____target,
				typeAcc__superInterfaceDec____type, superInterfaceDec__typeAcc____usagesInTypeAccess,
				cd2c__classDec____source, cd2c__umlClass____target, cd2c2__superInterfaceDec____source };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch, ClassDeclaration classDec,
			ASTNode2Element cd2c2, Interface superInterface, TypeAccess typeAcc, BehavioredClassifier umlClass,
			ASTNode2Element cd2c, InterfaceDeclaration superInterfaceDec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, classDec, cd2c2, superInterface,
				typeAcc, umlClass, cd2c, superInterfaceDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, classDec, cd2c2, superInterface, typeAcc, umlClass,
					cd2c, superInterfaceDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch, ClassDeclaration classDec,
			ASTNode2Element cd2c2, Interface superInterface, TypeAccess typeAcc, BehavioredClassifier umlClass,
			ASTNode2Element cd2c, InterfaceDeclaration superInterfaceDec) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_binding = pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, classDec, cd2c2, superInterface, typeAcc, umlClass, cd2c, superInterfaceDec);
		if (result_pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_black = pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, classDec, cd2c2, superInterface, typeAcc, umlClass,
						cd2c, superInterfaceDec };
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
			TypeAccess2InterfaceRealization _this, Match match, Interface superInterface, BehavioredClassifier umlClass,
			InterfaceRealization interfaceRealization) {
		return new Object[] { _this, match, superInterface, umlClass, interfaceRealization };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_bindingFBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, Interface superInterface, BehavioredClassifier umlClass,
			InterfaceRealization interfaceRealization) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, superInterface, umlClass, interfaceRealization);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, superInterface, umlClass, interfaceRealization };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_bindingAndBlackFBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, Interface superInterface, BehavioredClassifier umlClass,
			InterfaceRealization interfaceRealization) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_binding = pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_bindingFBBBBB(
				_this, match, superInterface, umlClass, interfaceRealization);
		if (result_pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_black = pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, superInterface, umlClass, interfaceRealization };
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
			Match match, Interface superInterface, BehavioredClassifier umlClass,
			InterfaceRealization interfaceRealization) {
		return new Object[] { match, superInterface, umlClass, interfaceRealization };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, Interface superInterface, BehavioredClassifier umlClass,
			InterfaceRealization interfaceRealization) {
		EMoflonEdge umlClass__interfaceRealization____interfaceRealization = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interfaceRealization__umlClass____implementingClassifier = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interfaceRealization__superInterface____contract = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(interfaceRealization);
		String umlClass__interfaceRealization____interfaceRealization_name_prime = "interfaceRealization";
		String interfaceRealization__umlClass____implementingClassifier_name_prime = "implementingClassifier";
		String interfaceRealization__superInterface____contract_name_prime = "contract";
		umlClass__interfaceRealization____interfaceRealization.setSrc(umlClass);
		umlClass__interfaceRealization____interfaceRealization.setTrg(interfaceRealization);
		match.getToBeTranslatedEdges().add(umlClass__interfaceRealization____interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setSrc(interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setTrg(umlClass);
		match.getToBeTranslatedEdges().add(interfaceRealization__umlClass____implementingClassifier);
		interfaceRealization__superInterface____contract.setSrc(interfaceRealization);
		interfaceRealization__superInterface____contract.setTrg(superInterface);
		match.getToBeTranslatedEdges().add(interfaceRealization__superInterface____contract);
		umlClass__interfaceRealization____interfaceRealization
				.setName(umlClass__interfaceRealization____interfaceRealization_name_prime);
		interfaceRealization__umlClass____implementingClassifier
				.setName(interfaceRealization__umlClass____implementingClassifier_name_prime);
		interfaceRealization__superInterface____contract
				.setName(interfaceRealization__superInterface____contract_name_prime);
		return new Object[] { match, superInterface, umlClass, interfaceRealization,
				umlClass__interfaceRealization____interfaceRealization,
				interfaceRealization__umlClass____implementingClassifier,
				interfaceRealization__superInterface____contract };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_5_collectcontextelements_blackBBBB(
			Match match, Interface superInterface, BehavioredClassifier umlClass,
			InterfaceRealization interfaceRealization) {
		return new Object[] { match, superInterface, umlClass, interfaceRealization };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_5_collectcontextelements_greenBBB(
			Match match, Interface superInterface, BehavioredClassifier umlClass) {
		match.getContextNodes().add(superInterface);
		match.getContextNodes().add(umlClass);
		return new Object[] { match, superInterface, umlClass };
	}

	public static final void pattern_TypeAccess2InterfaceRealization_10_6_registerobjectstomatch_expressionBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, Interface superInterface, BehavioredClassifier umlClass,
			InterfaceRealization interfaceRealization) {
		_this.registerObjectsToMatch_BWD(match, superInterface, umlClass, interfaceRealization);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("classDec");
		EObject _localVariable_1 = isApplicableMatch.getObject("cd2c2");
		EObject _localVariable_2 = isApplicableMatch.getObject("superInterface");
		EObject _localVariable_3 = isApplicableMatch.getObject("umlClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("cd2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("interfaceRealization");
		EObject _localVariable_6 = isApplicableMatch.getObject("superInterfaceDec");
		EObject tmpClassDec = _localVariable_0;
		EObject tmpCd2c2 = _localVariable_1;
		EObject tmpSuperInterface = _localVariable_2;
		EObject tmpUmlClass = _localVariable_3;
		EObject tmpCd2c = _localVariable_4;
		EObject tmpInterfaceRealization = _localVariable_5;
		EObject tmpSuperInterfaceDec = _localVariable_6;
		if (tmpClassDec instanceof ClassDeclaration) {
			ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
			if (tmpCd2c2 instanceof ASTNode2Element) {
				ASTNode2Element cd2c2 = (ASTNode2Element) tmpCd2c2;
				if (tmpSuperInterface instanceof Interface) {
					Interface superInterface = (Interface) tmpSuperInterface;
					if (tmpUmlClass instanceof BehavioredClassifier) {
						BehavioredClassifier umlClass = (BehavioredClassifier) tmpUmlClass;
						if (tmpCd2c instanceof ASTNode2Element) {
							ASTNode2Element cd2c = (ASTNode2Element) tmpCd2c;
							if (tmpInterfaceRealization instanceof InterfaceRealization) {
								InterfaceRealization interfaceRealization = (InterfaceRealization) tmpInterfaceRealization;
								if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
									InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
									return new Object[] { classDec, cd2c2, superInterface, umlClass, cd2c,
											interfaceRealization, superInterfaceDec, isApplicableMatch };
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
			ClassDeclaration classDec, ASTNode2Element cd2c2, Interface superInterface, BehavioredClassifier umlClass,
			ASTNode2Element cd2c, InterfaceRealization interfaceRealization, InterfaceDeclaration superInterfaceDec,
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch) {
		if (!cd2c.equals(cd2c2)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { classDec, cd2c2, superInterface, umlClass, cd2c, interfaceRealization,
							superInterfaceDec, csp, _this, isApplicableMatch };
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
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[0];
			ASTNode2Element cd2c2 = (ASTNode2Element) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[1];
			Interface superInterface = (Interface) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[2];
			BehavioredClassifier umlClass = (BehavioredClassifier) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[3];
			ASTNode2Element cd2c = (ASTNode2Element) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[4];
			InterfaceRealization interfaceRealization = (InterfaceRealization) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[5];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[6];

			Object[] result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_black = pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_blackBBBBBBBFBB(
					classDec, cd2c2, superInterface, umlClass, cd2c, interfaceRealization, superInterfaceDec, _this,
					isApplicableMatch);
			if (result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_black[7];

				return new Object[] { classDec, cd2c2, superInterface, umlClass, cd2c, interfaceRealization,
						superInterfaceDec, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_greenFBFBB(
			ClassDeclaration classDec, InterfaceRealization interfaceRealization,
			InterfaceDeclaration superInterfaceDec) {
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2InterfaceRealization();
		TypeAccess typeAcc = JavaFactory.eINSTANCE.createTypeAccess();
		ta2g.setTarget(interfaceRealization);
		classDec.getSuperInterfaces().add(typeAcc);
		ta2g.setSource(typeAcc);
		typeAcc.setType(superInterfaceDec);
		return new Object[] { ta2g, classDec, typeAcc, interfaceRealization, superInterfaceDec };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_11_2_collecttranslatedelements_blackBBB(
			org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g, TypeAccess typeAcc,
			InterfaceRealization interfaceRealization) {
		return new Object[] { ta2g, typeAcc, interfaceRealization };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_11_2_collecttranslatedelements_greenFBBB(
			org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g, TypeAccess typeAcc,
			InterfaceRealization interfaceRealization) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(ta2g);
		ruleresult.getCreatedElements().add(typeAcc);
		ruleresult.getTranslatedElements().add(interfaceRealization);
		return new Object[] { ruleresult, ta2g, typeAcc, interfaceRealization };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject ta2g, EObject classDec, EObject cd2c2, EObject superInterface,
			EObject typeAcc, EObject umlClass, EObject cd2c, EObject interfaceRealization, EObject superInterfaceDec) {
		if (!ta2g.equals(typeAcc)) {
			if (!ta2g.equals(umlClass)) {
				if (!classDec.equals(ta2g)) {
					if (!classDec.equals(superInterface)) {
						if (!classDec.equals(typeAcc)) {
							if (!classDec.equals(umlClass)) {
								if (!classDec.equals(interfaceRealization)) {
									if (!classDec.equals(superInterfaceDec)) {
										if (!cd2c2.equals(ta2g)) {
											if (!cd2c2.equals(classDec)) {
												if (!cd2c2.equals(superInterface)) {
													if (!cd2c2.equals(typeAcc)) {
														if (!cd2c2.equals(umlClass)) {
															if (!cd2c2.equals(interfaceRealization)) {
																if (!cd2c2.equals(superInterfaceDec)) {
																	if (!superInterface.equals(ta2g)) {
																		if (!superInterface.equals(typeAcc)) {
																			if (!superInterface.equals(umlClass)) {
																				if (!superInterface
																						.equals(superInterfaceDec)) {
																					if (!typeAcc.equals(umlClass)) {
																						if (!cd2c.equals(ta2g)) {
																							if (!cd2c
																									.equals(classDec)) {
																								if (!cd2c.equals(
																										cd2c2)) {
																									if (!cd2c.equals(
																											superInterface)) {
																										if (!cd2c
																												.equals(typeAcc)) {
																											if (!cd2c
																													.equals(umlClass)) {
																												if (!cd2c
																														.equals(interfaceRealization)) {
																													if (!cd2c
																															.equals(superInterfaceDec)) {
																														if (!interfaceRealization
																																.equals(ta2g)) {
																															if (!interfaceRealization
																																	.equals(superInterface)) {
																																if (!interfaceRealization
																																		.equals(typeAcc)) {
																																	if (!interfaceRealization
																																			.equals(umlClass)) {
																																		if (!interfaceRealization
																																				.equals(superInterfaceDec)) {
																																			if (!superInterfaceDec
																																					.equals(ta2g)) {
																																				if (!superInterfaceDec
																																						.equals(typeAcc)) {
																																					if (!superInterfaceDec
																																							.equals(umlClass)) {
																																						return new Object[] {
																																								ruleresult,
																																								ta2g,
																																								classDec,
																																								cd2c2,
																																								superInterface,
																																								typeAcc,
																																								umlClass,
																																								cd2c,
																																								interfaceRealization,
																																								superInterfaceDec };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject ta2g, EObject classDec, EObject superInterface, EObject typeAcc,
			EObject umlClass, EObject interfaceRealization, EObject superInterfaceDec) {
		EMoflonEdge classDec__typeAcc____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__typeAcc____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClass__interfaceRealization____interfaceRealization = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interfaceRealization__umlClass____implementingClassifier = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge typeAcc__superInterfaceDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__interfaceRealization____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge interfaceRealization__superInterface____contract = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccess2InterfaceRealization";
		String classDec__typeAcc____superInterfaces_name_prime = "superInterfaces";
		String ta2g__typeAcc____source_name_prime = "source";
		String umlClass__interfaceRealization____interfaceRealization_name_prime = "interfaceRealization";
		String interfaceRealization__umlClass____implementingClassifier_name_prime = "implementingClassifier";
		String typeAcc__superInterfaceDec____type_name_prime = "type";
		String superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String ta2g__interfaceRealization____target_name_prime = "target";
		String interfaceRealization__superInterface____contract_name_prime = "contract";
		classDec__typeAcc____superInterfaces.setSrc(classDec);
		classDec__typeAcc____superInterfaces.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(classDec__typeAcc____superInterfaces);
		ta2g__typeAcc____source.setSrc(ta2g);
		ta2g__typeAcc____source.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(ta2g__typeAcc____source);
		umlClass__interfaceRealization____interfaceRealization.setSrc(umlClass);
		umlClass__interfaceRealization____interfaceRealization.setTrg(interfaceRealization);
		ruleresult.getTranslatedEdges().add(umlClass__interfaceRealization____interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setSrc(interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setTrg(umlClass);
		ruleresult.getTranslatedEdges().add(interfaceRealization__umlClass____implementingClassifier);
		typeAcc__superInterfaceDec____type.setSrc(typeAcc);
		typeAcc__superInterfaceDec____type.setTrg(superInterfaceDec);
		ruleresult.getCreatedEdges().add(typeAcc__superInterfaceDec____type);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setSrc(superInterfaceDec);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(superInterfaceDec__typeAcc____usagesInTypeAccess);
		ta2g__interfaceRealization____target.setSrc(ta2g);
		ta2g__interfaceRealization____target.setTrg(interfaceRealization);
		ruleresult.getCreatedEdges().add(ta2g__interfaceRealization____target);
		interfaceRealization__superInterface____contract.setSrc(interfaceRealization);
		interfaceRealization__superInterface____contract.setTrg(superInterface);
		ruleresult.getTranslatedEdges().add(interfaceRealization__superInterface____contract);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		classDec__typeAcc____superInterfaces.setName(classDec__typeAcc____superInterfaces_name_prime);
		ta2g__typeAcc____source.setName(ta2g__typeAcc____source_name_prime);
		umlClass__interfaceRealization____interfaceRealization
				.setName(umlClass__interfaceRealization____interfaceRealization_name_prime);
		interfaceRealization__umlClass____implementingClassifier
				.setName(interfaceRealization__umlClass____implementingClassifier_name_prime);
		typeAcc__superInterfaceDec____type.setName(typeAcc__superInterfaceDec____type_name_prime);
		superInterfaceDec__typeAcc____usagesInTypeAccess
				.setName(superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime);
		ta2g__interfaceRealization____target.setName(ta2g__interfaceRealization____target_name_prime);
		interfaceRealization__superInterface____contract
				.setName(interfaceRealization__superInterface____contract_name_prime);
		return new Object[] { ruleresult, ta2g, classDec, superInterface, typeAcc, umlClass, interfaceRealization,
				superInterfaceDec, classDec__typeAcc____superInterfaces, ta2g__typeAcc____source,
				umlClass__interfaceRealization____interfaceRealization,
				interfaceRealization__umlClass____implementingClassifier, typeAcc__superInterfaceDec____type,
				superInterfaceDec__typeAcc____usagesInTypeAccess, ta2g__interfaceRealization____target,
				interfaceRealization__superInterface____contract };
	}

	public static final void pattern_TypeAccess2InterfaceRealization_11_5_registerobjects_expressionBBBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, PerformRuleResult ruleresult, EObject ta2g, EObject classDec,
			EObject cd2c2, EObject superInterface, EObject typeAcc, EObject umlClass, EObject cd2c,
			EObject interfaceRealization, EObject superInterfaceDec) {
		_this.registerObjects_BWD(ruleresult, ta2g, classDec, cd2c2, superInterface, typeAcc, umlClass, cd2c,
				interfaceRealization, superInterfaceDec);

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
		EObject _localVariable_1 = match.getObject("umlClass");
		EObject _localVariable_2 = match.getObject("interfaceRealization");
		EObject tmpSuperInterface = _localVariable_0;
		EObject tmpUmlClass = _localVariable_1;
		EObject tmpInterfaceRealization = _localVariable_2;
		if (tmpSuperInterface instanceof Interface) {
			Interface superInterface = (Interface) tmpSuperInterface;
			if (tmpUmlClass instanceof BehavioredClassifier) {
				BehavioredClassifier umlClass = (BehavioredClassifier) tmpUmlClass;
				if (tmpInterfaceRealization instanceof InterfaceRealization) {
					InterfaceRealization interfaceRealization = (InterfaceRealization) tmpInterfaceRealization;
					return new Object[] { superInterface, umlClass, interfaceRealization, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_12_2_corematch_blackFFBBFBFB(
			Interface superInterface, BehavioredClassifier umlClass, InterfaceRealization interfaceRealization,
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
							_result.add(new Object[] { classDec, cd2c2, superInterface, umlClass, cd2c,
									interfaceRealization, superInterfaceDec, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_12_3_findcontext_blackBBBBBBB(
			ClassDeclaration classDec, ASTNode2Element cd2c2, Interface superInterface, BehavioredClassifier umlClass,
			ASTNode2Element cd2c, InterfaceRealization interfaceRealization, InterfaceDeclaration superInterfaceDec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!cd2c.equals(cd2c2)) {
			if (superInterface.equals(cd2c2.getTarget())) {
				if (umlClass.getInterfaceRealizations().contains(interfaceRealization)) {
					if (classDec.equals(cd2c.getSource())) {
						if (superInterface.equals(interfaceRealization.getContract())) {
							if (umlClass.equals(cd2c.getTarget())) {
								if (superInterfaceDec.equals(cd2c2.getSource())) {
									_result.add(new Object[] { classDec, cd2c2, superInterface, umlClass, cd2c,
											interfaceRealization, superInterfaceDec });
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
			ClassDeclaration classDec, ASTNode2Element cd2c2, Interface superInterface, BehavioredClassifier umlClass,
			ASTNode2Element cd2c, InterfaceRealization interfaceRealization, InterfaceDeclaration superInterfaceDec) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge cd2c2__superInterface____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClass__interfaceRealization____interfaceRealization = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interfaceRealization__umlClass____implementingClassifier = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge cd2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge interfaceRealization__superInterface____contract = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superInterfaceDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cd2c2__superInterface____target_name_prime = "target";
		String umlClass__interfaceRealization____interfaceRealization_name_prime = "interfaceRealization";
		String interfaceRealization__umlClass____implementingClassifier_name_prime = "implementingClassifier";
		String cd2c__classDec____source_name_prime = "source";
		String interfaceRealization__superInterface____contract_name_prime = "contract";
		String cd2c__umlClass____target_name_prime = "target";
		String cd2c2__superInterfaceDec____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c2);
		isApplicableMatch.getAllContextElements().add(superInterface);
		isApplicableMatch.getAllContextElements().add(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c);
		isApplicableMatch.getAllContextElements().add(interfaceRealization);
		isApplicableMatch.getAllContextElements().add(superInterfaceDec);
		cd2c2__superInterface____target.setSrc(cd2c2);
		cd2c2__superInterface____target.setTrg(superInterface);
		isApplicableMatch.getAllContextElements().add(cd2c2__superInterface____target);
		umlClass__interfaceRealization____interfaceRealization.setSrc(umlClass);
		umlClass__interfaceRealization____interfaceRealization.setTrg(interfaceRealization);
		isApplicableMatch.getAllContextElements().add(umlClass__interfaceRealization____interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setSrc(interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(interfaceRealization__umlClass____implementingClassifier);
		cd2c__classDec____source.setSrc(cd2c);
		cd2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c__classDec____source);
		interfaceRealization__superInterface____contract.setSrc(interfaceRealization);
		interfaceRealization__superInterface____contract.setTrg(superInterface);
		isApplicableMatch.getAllContextElements().add(interfaceRealization__superInterface____contract);
		cd2c__umlClass____target.setSrc(cd2c);
		cd2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c__umlClass____target);
		cd2c2__superInterfaceDec____source.setSrc(cd2c2);
		cd2c2__superInterfaceDec____source.setTrg(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(cd2c2__superInterfaceDec____source);
		cd2c2__superInterface____target.setName(cd2c2__superInterface____target_name_prime);
		umlClass__interfaceRealization____interfaceRealization
				.setName(umlClass__interfaceRealization____interfaceRealization_name_prime);
		interfaceRealization__umlClass____implementingClassifier
				.setName(interfaceRealization__umlClass____implementingClassifier_name_prime);
		cd2c__classDec____source.setName(cd2c__classDec____source_name_prime);
		interfaceRealization__superInterface____contract
				.setName(interfaceRealization__superInterface____contract_name_prime);
		cd2c__umlClass____target.setName(cd2c__umlClass____target_name_prime);
		cd2c2__superInterfaceDec____source.setName(cd2c2__superInterfaceDec____source_name_prime);
		return new Object[] { classDec, cd2c2, superInterface, umlClass, cd2c, interfaceRealization, superInterfaceDec,
				isApplicableMatch, cd2c2__superInterface____target,
				umlClass__interfaceRealization____interfaceRealization,
				interfaceRealization__umlClass____implementingClassifier, cd2c__classDec____source,
				interfaceRealization__superInterface____contract, cd2c__umlClass____target,
				cd2c2__superInterfaceDec____source };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch, ClassDeclaration classDec,
			ASTNode2Element cd2c2, Interface superInterface, BehavioredClassifier umlClass, ASTNode2Element cd2c,
			InterfaceRealization interfaceRealization, InterfaceDeclaration superInterfaceDec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, classDec, cd2c2, superInterface,
				umlClass, cd2c, interfaceRealization, superInterfaceDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, classDec, cd2c2, superInterface, umlClass, cd2c,
					interfaceRealization, superInterfaceDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch, ClassDeclaration classDec,
			ASTNode2Element cd2c2, Interface superInterface, BehavioredClassifier umlClass, ASTNode2Element cd2c,
			InterfaceRealization interfaceRealization, InterfaceDeclaration superInterfaceDec) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_binding = pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, classDec, cd2c2, superInterface, umlClass, cd2c, interfaceRealization,
				superInterfaceDec);
		if (result_pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_black = pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, classDec, cd2c2, superInterface, umlClass, cd2c,
						interfaceRealization, superInterfaceDec };
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
		for (NamedElement __DEC_interfaceRealization_client_842441 : interfaceRealization.getClients()) {
			if (!interfaceRealization.equals(__DEC_interfaceRealization_client_842441)) {
				if (!superInterface.equals(__DEC_interfaceRealization_client_842441)) {
					if (!umlClass.equals(__DEC_interfaceRealization_client_842441)) {
						return new Object[] { interfaceRealization, superInterface, umlClass };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_1BBB(
			InterfaceRealization interfaceRealization, Interface superInterface, BehavioredClassifier umlClass) {
		for (NamedElement __DEC_interfaceRealization_supplier_88178 : interfaceRealization.getSuppliers()) {
			if (!interfaceRealization.equals(__DEC_interfaceRealization_supplier_88178)) {
				if (!superInterface.equals(__DEC_interfaceRealization_supplier_88178)) {
					if (!umlClass.equals(__DEC_interfaceRealization_supplier_88178)) {
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
			EMoflonEdge _edge_interfaceRealization) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUmlClass = _edge_interfaceRealization.getSrc();
		if (tmpUmlClass instanceof BehavioredClassifier) {
			BehavioredClassifier umlClass = (BehavioredClassifier) tmpUmlClass;
			EObject tmpInterfaceRealization = _edge_interfaceRealization.getTrg();
			if (tmpInterfaceRealization instanceof InterfaceRealization) {
				InterfaceRealization interfaceRealization = (InterfaceRealization) tmpInterfaceRealization;
				if (umlClass.getInterfaceRealizations().contains(interfaceRealization)) {
					Interface superInterface = interfaceRealization.getContract();
					if (superInterface != null) {
						if (pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_3BB(
								interfaceRealization, umlClass) == null) {
							if (pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_5BB(
									interfaceRealization, umlClass) == null) {
								if (pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_0BBB(
										interfaceRealization, superInterface, umlClass) == null) {
									if (pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_1BBB(
											interfaceRealization, superInterface, umlClass) == null) {
										if (pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_2BB(
												interfaceRealization, superInterface) == null) {
											if (pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_4BB(
													interfaceRealization, superInterface) == null) {
												_result.add(new Object[] { superInterface, umlClass,
														interfaceRealization, _edge_interfaceRealization });
											}
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
			TypeAccess2InterfaceRealization _this, Match match, Interface superInterface, BehavioredClassifier umlClass,
			InterfaceRealization interfaceRealization) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, superInterface, umlClass, interfaceRealization);
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
		for (Annotation __DEC_typeAcc_type_541900 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, Annotation.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess typeAcc) {
		for (ArrayType __DEC_typeAcc_elementType_145734 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ArrayType.class, "elementType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_2BB(
			TypeAccess typeAcc, ClassDeclaration classDec) {
		for (ClassDeclaration __DEC_typeAcc_superClass_980811 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ClassDeclaration.class, "superClass")) {
			if (!classDec.equals(__DEC_typeAcc_superClass_980811)) {
				return new Object[] { typeAcc, classDec };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess typeAcc) {
		for (MethodDeclaration __DEC_typeAcc_returnType_828217 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_4B(
			TypeAccess typeAcc) {
		for (ParameterizedType __DEC_typeAcc_type_863985 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ParameterizedType.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess typeAcc) {
		for (SingleVariableDeclaration __DEC_typeAcc_type_319648 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess typeAcc) {
		for (AnnotationMemberValuePair __DEC_typeAcc_value_390370 : org.moflon.core.utilities.eMoflonEMFUtil
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
			EMoflonEdge _edge_superInterfaces) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpClassDec = _edge_superInterfaces.getSrc();
		if (tmpClassDec instanceof ClassDeclaration) {
			ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
			EObject tmpTypeAcc = _edge_superInterfaces.getTrg();
			if (tmpTypeAcc instanceof TypeAccess) {
				TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
				if (classDec.getSuperInterfaces().contains(typeAcc)) {
					Type tmpSuperInterfaceDec = typeAcc.getType();
					if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
						InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
						if (pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_0B(
								typeAcc) == null) {
							if (pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_1B(
									typeAcc) == null) {
								if (pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_2BB(
										typeAcc, classDec) == null) {
									if (pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_3B(
											typeAcc) == null) {
										if (pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_4B(
												typeAcc) == null) {
											if (pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_5B(
													typeAcc) == null) {
												if (pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_6B(
														typeAcc) == null) {
													if (pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_7BB(
															classDec, typeAcc) == null) {
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

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, ClassDeclaration classDec, TypeAccess typeAcc,
			InterfaceDeclaration superInterfaceDec) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, classDec, typeAcc, superInterfaceDec);
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
		EObject _localVariable_0 = sourceMatch.getObject("classDec");
		EObject _localVariable_1 = targetMatch.getObject("superInterface");
		EObject _localVariable_2 = sourceMatch.getObject("typeAcc");
		EObject _localVariable_3 = targetMatch.getObject("umlClass");
		EObject _localVariable_4 = targetMatch.getObject("interfaceRealization");
		EObject _localVariable_5 = sourceMatch.getObject("superInterfaceDec");
		EObject tmpClassDec = _localVariable_0;
		EObject tmpSuperInterface = _localVariable_1;
		EObject tmpTypeAcc = _localVariable_2;
		EObject tmpUmlClass = _localVariable_3;
		EObject tmpInterfaceRealization = _localVariable_4;
		EObject tmpSuperInterfaceDec = _localVariable_5;
		if (tmpClassDec instanceof ClassDeclaration) {
			ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
			if (tmpSuperInterface instanceof Interface) {
				Interface superInterface = (Interface) tmpSuperInterface;
				if (tmpTypeAcc instanceof TypeAccess) {
					TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
					if (tmpUmlClass instanceof BehavioredClassifier) {
						BehavioredClassifier umlClass = (BehavioredClassifier) tmpUmlClass;
						if (tmpInterfaceRealization instanceof InterfaceRealization) {
							InterfaceRealization interfaceRealization = (InterfaceRealization) tmpInterfaceRealization;
							if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
								InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
								return new Object[] { classDec, superInterface, typeAcc, umlClass, interfaceRealization,
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
			ClassDeclaration classDec, Interface superInterface, TypeAccess typeAcc, BehavioredClassifier umlClass,
			InterfaceRealization interfaceRealization, InterfaceDeclaration superInterfaceDec, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { classDec, superInterface, typeAcc, umlClass, interfaceRealization, superInterfaceDec,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding = pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding != null) {
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[0];
			Interface superInterface = (Interface) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[1];
			TypeAccess typeAcc = (TypeAccess) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[2];
			BehavioredClassifier umlClass = (BehavioredClassifier) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[3];
			InterfaceRealization interfaceRealization = (InterfaceRealization) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[4];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_black = pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_blackBBBBBBBB(
					classDec, superInterface, typeAcc, umlClass, interfaceRealization, superInterfaceDec, sourceMatch,
					targetMatch);
			if (result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { classDec, superInterface, typeAcc, umlClass, interfaceRealization,
						superInterfaceDec, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_bindingFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, ClassDeclaration classDec, Interface superInterface,
			TypeAccess typeAcc, BehavioredClassifier umlClass, InterfaceRealization interfaceRealization,
			InterfaceDeclaration superInterfaceDec, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(classDec, superInterface, typeAcc, umlClass,
				interfaceRealization, superInterfaceDec, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, classDec, superInterface, typeAcc, umlClass, interfaceRealization,
					superInterfaceDec, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, ClassDeclaration classDec, Interface superInterface,
			TypeAccess typeAcc, BehavioredClassifier umlClass, InterfaceRealization interfaceRealization,
			InterfaceDeclaration superInterfaceDec, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_binding = pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, classDec, superInterface, typeAcc, umlClass, interfaceRealization, superInterfaceDec,
				sourceMatch, targetMatch);
		if (result_pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_black = pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, classDec, superInterface, typeAcc, umlClass, interfaceRealization,
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

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_24_5_matchcorrcontext_blackBFBBFBBB(
			ClassDeclaration classDec, Interface superInterface, BehavioredClassifier umlClass,
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
								_result.add(new Object[] { classDec, cd2c2, superInterface, umlClass, cd2c,
										superInterfaceDec, sourceMatch, targetMatch });
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
			ClassDeclaration classDec, Interface superInterface, TypeAccess typeAcc, BehavioredClassifier umlClass,
			InterfaceRealization interfaceRealization, InterfaceDeclaration superInterfaceDec, CCMatch ccMatch) {
		return new Object[] { classDec, superInterface, typeAcc, umlClass, interfaceRealization, superInterfaceDec,
				ccMatch };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_6_createcorrespondence_greenFBBB(
			TypeAccess typeAcc, InterfaceRealization interfaceRealization, CCMatch ccMatch) {
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2InterfaceRealization();
		ta2g.setSource(typeAcc);
		ta2g.setTarget(interfaceRealization);
		ccMatch.getCreateCorr().add(ta2g);
		return new Object[] { ta2g, typeAcc, interfaceRealization, ccMatch };
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
		for (Annotation __DEC_typeAcc_type_105856 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, Annotation.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_1B(
			TypeAccess typeAcc) {
		for (ArrayType __DEC_typeAcc_elementType_835441 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ArrayType.class, "elementType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_2BB(
			TypeAccess typeAcc, ClassDeclaration classDec) {
		for (ClassDeclaration __DEC_typeAcc_superClass_610787 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ClassDeclaration.class, "superClass")) {
			if (!classDec.equals(__DEC_typeAcc_superClass_610787)) {
				return new Object[] { typeAcc, classDec };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_3B(
			TypeAccess typeAcc) {
		for (MethodDeclaration __DEC_typeAcc_returnType_48649 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_4B(
			TypeAccess typeAcc) {
		for (ParameterizedType __DEC_typeAcc_type_71777 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ParameterizedType.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_5B(
			TypeAccess typeAcc) {
		for (SingleVariableDeclaration __DEC_typeAcc_type_55912 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_6B(
			TypeAccess typeAcc) {
		for (AnnotationMemberValuePair __DEC_typeAcc_value_561279 : org.moflon.core.utilities.eMoflonEMFUtil
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
			ClassDeclaration classDec, TypeAccess typeAcc, InterfaceDeclaration superInterfaceDec) {
		if (classDec.getSuperInterfaces().contains(typeAcc)) {
			if (superInterfaceDec.equals(typeAcc.getType())) {
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
		for (NamedElement __DEC_interfaceRealization_client_888042 : interfaceRealization.getClients()) {
			if (!interfaceRealization.equals(__DEC_interfaceRealization_client_888042)) {
				if (!superInterface.equals(__DEC_interfaceRealization_client_888042)) {
					if (!umlClass.equals(__DEC_interfaceRealization_client_888042)) {
						return new Object[] { interfaceRealization, superInterface, umlClass };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_black_nac_1BBB(
			InterfaceRealization interfaceRealization, Interface superInterface, BehavioredClassifier umlClass) {
		for (NamedElement __DEC_interfaceRealization_supplier_402671 : interfaceRealization.getSuppliers()) {
			if (!interfaceRealization.equals(__DEC_interfaceRealization_supplier_402671)) {
				if (!superInterface.equals(__DEC_interfaceRealization_supplier_402671)) {
					if (!umlClass.equals(__DEC_interfaceRealization_supplier_402671)) {
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
			Interface superInterface, BehavioredClassifier umlClass, InterfaceRealization interfaceRealization) {
		if (umlClass.getInterfaceRealizations().contains(interfaceRealization)) {
			if (superInterface.equals(interfaceRealization.getContract())) {
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
										return new Object[] { superInterface, umlClass, interfaceRealization };
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
			ModelgeneratorRuleResult ruleResult, ClassDeclaration classDec) {
		if (ruleResult.getSourceObjects().contains(classDec)) {
			return new Object[] { ruleResult, classDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element cd2c) {
		if (ruleResult.getCorrObjects().contains(cd2c)) {
			return new Object[] { ruleResult, cd2c };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, BehavioredClassifier umlClass) {
		if (ruleResult.getTargetObjects().contains(umlClass)) {
			return new Object[] { ruleResult, umlClass };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element cd2c2) {
		if (ruleResult.getCorrObjects().contains(cd2c2)) {
			return new Object[] { ruleResult, cd2c2 };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Interface superInterface) {
		if (ruleResult.getTargetObjects().contains(superInterface)) {
			return new Object[] { ruleResult, superInterface };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, InterfaceDeclaration superInterfaceDec) {
		if (ruleResult.getSourceObjects().contains(superInterfaceDec)) {
			return new Object[] { ruleResult, superInterfaceDec };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList cd2cList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList cd2c2List : ruleEntryContainer.getRuleEntryList()) {
				if (!cd2c2List.equals(cd2cList)) {
					for (EObject tmpCd2c : cd2cList.getEntryObjects()) {
						if (tmpCd2c instanceof ASTNode2Element) {
							ASTNode2Element cd2c = (ASTNode2Element) tmpCd2c;
							ASTNode tmpClassDec = cd2c.getSource();
							if (tmpClassDec instanceof ClassDeclaration) {
								ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
								Element tmpUmlClass = cd2c.getTarget();
								if (tmpUmlClass instanceof BehavioredClassifier) {
									BehavioredClassifier umlClass = (BehavioredClassifier) tmpUmlClass;
									if (pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, cd2c) == null) {
										if (pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, classDec) == null) {
											if (pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, umlClass) == null) {
												for (EObject tmpCd2c2 : cd2c2List.getEntryObjects()) {
													if (tmpCd2c2 instanceof ASTNode2Element) {
														ASTNode2Element cd2c2 = (ASTNode2Element) tmpCd2c2;
														if (!cd2c.equals(cd2c2)) {
															Element tmpSuperInterface = cd2c2.getTarget();
															if (tmpSuperInterface instanceof Interface) {
																Interface superInterface = (Interface) tmpSuperInterface;
																ASTNode tmpSuperInterfaceDec = cd2c2.getSource();
																if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
																	InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
																	if (pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, cd2c2) == null) {
																		if (pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_4BB(
																				ruleResult, superInterface) == null) {
																			if (pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult,
																					superInterfaceDec) == null) {
																				_result.add(new Object[] { cd2cList,
																						classDec, cd2c, umlClass,
																						cd2c2List, cd2c2,
																						superInterface,
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
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch, ClassDeclaration classDec,
			ASTNode2Element cd2c2, Interface superInterface, BehavioredClassifier umlClass, ASTNode2Element cd2c,
			InterfaceDeclaration superInterfaceDec, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, classDec, cd2c2, superInterface,
				umlClass, cd2c, superInterfaceDec, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, classDec, cd2c2, superInterface, umlClass, cd2c,
					superInterfaceDec, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch, ClassDeclaration classDec,
			ASTNode2Element cd2c2, Interface superInterface, BehavioredClassifier umlClass, ASTNode2Element cd2c,
			InterfaceDeclaration superInterfaceDec, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_binding = pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, classDec, cd2c2, superInterface, umlClass, cd2c, superInterfaceDec,
				ruleResult);
		if (result_pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_black = pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, classDec, cd2c2, superInterface, umlClass, cd2c,
						superInterfaceDec, ruleResult };
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
			ClassDeclaration classDec, ASTNode2Element cd2c2, Interface superInterface, BehavioredClassifier umlClass,
			ASTNode2Element cd2c, InterfaceDeclaration superInterfaceDec) {
		if (!cd2c.equals(cd2c2)) {
			return new Object[] { classDec, cd2c2, superInterface, umlClass, cd2c, superInterfaceDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_6_perform_blackBBBBBBB(
			ClassDeclaration classDec, ASTNode2Element cd2c2, Interface superInterface, BehavioredClassifier umlClass,
			ASTNode2Element cd2c, InterfaceDeclaration superInterfaceDec, ModelgeneratorRuleResult ruleResult) {
		if (!cd2c.equals(cd2c2)) {
			return new Object[] { classDec, cd2c2, superInterface, umlClass, cd2c, superInterfaceDec, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_6_perform_greenFBBFBFBB(
			ClassDeclaration classDec, Interface superInterface, BehavioredClassifier umlClass,
			InterfaceDeclaration superInterfaceDec, ModelgeneratorRuleResult ruleResult) {
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2InterfaceRealization();
		TypeAccess typeAcc = JavaFactory.eINSTANCE.createTypeAccess();
		InterfaceRealization interfaceRealization = UMLFactory.eINSTANCE.createInterfaceRealization();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(ta2g);
		classDec.getSuperInterfaces().add(typeAcc);
		ta2g.setSource(typeAcc);
		typeAcc.setType(superInterfaceDec);
		ruleResult.getSourceObjects().add(typeAcc);
		umlClass.getInterfaceRealizations().add(interfaceRealization);
		ta2g.setTarget(interfaceRealization);
		interfaceRealization.setContract(superInterface);
		ruleResult.getTargetObjects().add(interfaceRealization);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { ta2g, classDec, superInterface, typeAcc, umlClass, interfaceRealization,
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
