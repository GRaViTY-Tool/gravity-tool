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
	public boolean isAppropriate_FWD(Match match, InterfaceDeclaration superInterfaceDec, ClassDeclaration classDec,
			TypeAccess typeAcc) {

		Object[] result1_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_0_1_initialbindings_blackBBBBB(this, match, superInterfaceDec,
						classDec, typeAcc);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[superInterfaceDec] = " + superInterfaceDec + ", "
					+ "[classDec] = " + classDec + ", " + "[typeAcc] = " + typeAcc + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
						superInterfaceDec, classDec, typeAcc);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[superInterfaceDec] = " + superInterfaceDec + ", "
					+ "[classDec] = " + classDec + ", " + "[typeAcc] = " + typeAcc + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccess2InterfaceRealizationImpl.pattern_TypeAccess2InterfaceRealization_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_0_4_collectelementstobetranslated_blackBBBB(match,
							superInterfaceDec, classDec, typeAcc);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[superInterfaceDec] = " + superInterfaceDec + ", " + "[classDec] = " + classDec + ", "
						+ "[typeAcc] = " + typeAcc + ".");
			}
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_0_4_collectelementstobetranslated_greenBBBBFFF(match,
							superInterfaceDec, classDec, typeAcc);
			//nothing EMoflonEdge classDec__typeAcc____superInterfaces = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge typeAcc__superInterfaceDec____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result4_green[6];

			Object[] result5_black = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_0_5_collectcontextelements_blackBBBB(match,
							superInterfaceDec, classDec, typeAcc);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[superInterfaceDec] = " + superInterfaceDec + ", " + "[classDec] = " + classDec + ", "
						+ "[typeAcc] = " + typeAcc + ".");
			}
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_0_5_collectcontextelements_greenBBB(match,
							superInterfaceDec, classDec);

			// 
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_0_6_registerobjectstomatch_expressionBBBBB(this, match,
							superInterfaceDec, classDec, typeAcc);
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
		InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result1_bindingAndBlack[0];
		Interface superInterface = (Interface) result1_bindingAndBlack[1];
		ClassDeclaration classDec = (ClassDeclaration) result1_bindingAndBlack[2];
		TypeAccess typeAcc = (TypeAccess) result1_bindingAndBlack[3];
		BehavioredClassifier umlClass = (BehavioredClassifier) result1_bindingAndBlack[4];
		ASTNode2Element cd2c = (ASTNode2Element) result1_bindingAndBlack[5];
		ASTNode2Element cd2c2 = (ASTNode2Element) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_greenFBBBF(superInterface, typeAcc,
						umlClass);
		InterfaceRealization interfaceRealization = (InterfaceRealization) result1_green[0];
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization) result1_green[4];

		Object[] result2_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_2_collecttranslatedelements_blackBBB(interfaceRealization,
						typeAcc, ta2g);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[interfaceRealization] = "
					+ interfaceRealization + ", " + "[typeAcc] = " + typeAcc + ", " + "[ta2g] = " + ta2g + ".");
		}
		Object[] result2_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_2_collecttranslatedelements_greenFBBB(interfaceRealization,
						typeAcc, ta2g);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						interfaceRealization, superInterfaceDec, superInterface, classDec, typeAcc, umlClass, ta2g,
						cd2c, cd2c2);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[interfaceRealization] = " + interfaceRealization + ", " + "[superInterfaceDec] = "
					+ superInterfaceDec + ", " + "[superInterface] = " + superInterface + ", " + "[classDec] = "
					+ classDec + ", " + "[typeAcc] = " + typeAcc + ", " + "[umlClass] = " + umlClass + ", "
					+ "[ta2g] = " + ta2g + ", " + "[cd2c] = " + cd2c + ", " + "[cd2c2] = " + cd2c2 + ".");
		}
		TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFF(ruleresult,
						interfaceRealization, superInterfaceDec, superInterface, classDec, typeAcc, umlClass, ta2g);
		//nothing EMoflonEdge umlClass__interfaceRealization____interfaceRealization = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge interfaceRealization__umlClass____implementingClassifier = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge ta2g__typeAcc____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge classDec__typeAcc____superInterfaces = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge ta2g__interfaceRealization____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge interfaceRealization__superInterface____contract = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge typeAcc__superInterfaceDec____type = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[15];

		// 
		// 
		TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
						interfaceRealization, superInterfaceDec, superInterface, classDec, typeAcc, umlClass, ta2g,
						cd2c, cd2c2);
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
		InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_binding[0];
		ClassDeclaration classDec = (ClassDeclaration) result2_binding[1];
		TypeAccess typeAcc = (TypeAccess) result2_binding[2];
		for (Object[] result2_black : TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_2_2_corematch_blackBFBBFFFB(superInterfaceDec, classDec,
						typeAcc, match)) {
			Interface superInterface = (Interface) result2_black[1];
			BehavioredClassifier umlClass = (BehavioredClassifier) result2_black[4];
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[5];
			ASTNode2Element cd2c2 = (ASTNode2Element) result2_black[6];
			// ForEach 
			for (Object[] result3_black : TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_2_3_findcontext_blackBBBBBBB(superInterfaceDec,
							superInterface, classDec, typeAcc, umlClass, cd2c, cd2c2)) {
				Object[] result3_green = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_2_3_findcontext_greenBBBBBBBFFFFFFFF(superInterfaceDec,
								superInterface, classDec, typeAcc, umlClass, cd2c, cd2c2);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge classDec__typeAcc____superInterfaces = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge cd2c__umlClass____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge cd2c2__superInterface____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge cd2c2__superInterfaceDec____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge cd2c__classDec____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge typeAcc__superInterfaceDec____type = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, superInterfaceDec, superInterface, classDec, typeAcc, umlClass, cd2c,
								cd2c2);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[superInterfaceDec] = "
							+ superInterfaceDec + ", " + "[superInterface] = " + superInterface + ", " + "[classDec] = "
							+ classDec + ", " + "[typeAcc] = " + typeAcc + ", " + "[umlClass] = " + umlClass + ", "
							+ "[cd2c] = " + cd2c + ", " + "[cd2c2] = " + cd2c2 + ".");
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
	public void registerObjectsToMatch_FWD(Match match, InterfaceDeclaration superInterfaceDec,
			ClassDeclaration classDec, TypeAccess typeAcc) {
		match.registerObject("superInterfaceDec", superInterfaceDec);
		match.registerObject("classDec", classDec);
		match.registerObject("typeAcc", typeAcc);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, InterfaceDeclaration superInterfaceDec,
			ClassDeclaration classDec, TypeAccess typeAcc) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, InterfaceDeclaration superInterfaceDec,
			Interface superInterface, ClassDeclaration classDec, TypeAccess typeAcc, BehavioredClassifier umlClass,
			ASTNode2Element cd2c, ASTNode2Element cd2c2) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("superInterfaceDec", superInterfaceDec);
		isApplicableMatch.registerObject("superInterface", superInterface);
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("typeAcc", typeAcc);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("cd2c2", cd2c2);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject interfaceRealization,
			EObject superInterfaceDec, EObject superInterface, EObject classDec, EObject typeAcc, EObject umlClass,
			EObject ta2g, EObject cd2c, EObject cd2c2) {
		ruleresult.registerObject("interfaceRealization", interfaceRealization);
		ruleresult.registerObject("superInterfaceDec", superInterfaceDec);
		ruleresult.registerObject("superInterface", superInterface);
		ruleresult.registerObject("classDec", classDec);
		ruleresult.registerObject("typeAcc", typeAcc);
		ruleresult.registerObject("umlClass", umlClass);
		ruleresult.registerObject("ta2g", ta2g);
		ruleresult.registerObject("cd2c", cd2c);
		ruleresult.registerObject("cd2c2", cd2c2);

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
	public boolean isAppropriate_BWD(Match match, InterfaceRealization interfaceRealization, Interface superInterface,
			BehavioredClassifier umlClass) {

		Object[] result1_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_10_1_initialbindings_blackBBBBB(this, match,
						interfaceRealization, superInterface, umlClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[interfaceRealization] = " + interfaceRealization + ", "
					+ "[superInterface] = " + superInterface + ", " + "[umlClass] = " + umlClass + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
						interfaceRealization, superInterface, umlClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[interfaceRealization] = " + interfaceRealization + ", "
					+ "[superInterface] = " + superInterface + ", " + "[umlClass] = " + umlClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_10_4_collectelementstobetranslated_blackBBBB(match,
							interfaceRealization, superInterface, umlClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[interfaceRealization] = " + interfaceRealization + ", " + "[superInterface] = "
						+ superInterface + ", " + "[umlClass] = " + umlClass + ".");
			}
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_10_4_collectelementstobetranslated_greenBBBBFFF(match,
							interfaceRealization, superInterface, umlClass);
			//nothing EMoflonEdge umlClass__interfaceRealization____interfaceRealization = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge interfaceRealization__umlClass____implementingClassifier = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge interfaceRealization__superInterface____contract = (EMoflonEdge) result4_green[6];

			Object[] result5_black = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_10_5_collectcontextelements_blackBBBB(match,
							interfaceRealization, superInterface, umlClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[interfaceRealization] = " + interfaceRealization + ", " + "[superInterface] = "
						+ superInterface + ", " + "[umlClass] = " + umlClass + ".");
			}
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_10_5_collectcontextelements_greenBBB(match, superInterface,
							umlClass);

			// 
			TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							interfaceRealization, superInterface, umlClass);
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
		InterfaceRealization interfaceRealization = (InterfaceRealization) result1_bindingAndBlack[0];
		InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result1_bindingAndBlack[1];
		Interface superInterface = (Interface) result1_bindingAndBlack[2];
		ClassDeclaration classDec = (ClassDeclaration) result1_bindingAndBlack[3];
		BehavioredClassifier umlClass = (BehavioredClassifier) result1_bindingAndBlack[4];
		ASTNode2Element cd2c = (ASTNode2Element) result1_bindingAndBlack[5];
		ASTNode2Element cd2c2 = (ASTNode2Element) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_greenBBBFF(interfaceRealization,
						superInterfaceDec, classDec);
		TypeAccess typeAcc = (TypeAccess) result1_green[3];
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization) result1_green[4];

		Object[] result2_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_2_collecttranslatedelements_blackBBB(interfaceRealization,
						typeAcc, ta2g);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[interfaceRealization] = "
					+ interfaceRealization + ", " + "[typeAcc] = " + typeAcc + ", " + "[ta2g] = " + ta2g + ".");
		}
		Object[] result2_green = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_2_collecttranslatedelements_greenFBBB(interfaceRealization,
						typeAcc, ta2g);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						interfaceRealization, superInterfaceDec, superInterface, classDec, typeAcc, umlClass, ta2g,
						cd2c, cd2c2);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[interfaceRealization] = " + interfaceRealization + ", " + "[superInterfaceDec] = "
					+ superInterfaceDec + ", " + "[superInterface] = " + superInterface + ", " + "[classDec] = "
					+ classDec + ", " + "[typeAcc] = " + typeAcc + ", " + "[umlClass] = " + umlClass + ", "
					+ "[ta2g] = " + ta2g + ", " + "[cd2c] = " + cd2c + ", " + "[cd2c2] = " + cd2c2 + ".");
		}
		TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFF(ruleresult,
						interfaceRealization, superInterfaceDec, superInterface, classDec, typeAcc, umlClass, ta2g);
		//nothing EMoflonEdge umlClass__interfaceRealization____interfaceRealization = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge interfaceRealization__umlClass____implementingClassifier = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge ta2g__typeAcc____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge classDec__typeAcc____superInterfaces = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge ta2g__interfaceRealization____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge interfaceRealization__superInterface____contract = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge typeAcc__superInterfaceDec____type = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[15];

		// 
		// 
		TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
						interfaceRealization, superInterfaceDec, superInterface, classDec, typeAcc, umlClass, ta2g,
						cd2c, cd2c2);
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
		InterfaceRealization interfaceRealization = (InterfaceRealization) result2_binding[0];
		Interface superInterface = (Interface) result2_binding[1];
		BehavioredClassifier umlClass = (BehavioredClassifier) result2_binding[2];
		for (Object[] result2_black : TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_12_2_corematch_blackBFBFBFFB(interfaceRealization,
						superInterface, umlClass, match)) {
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_black[1];
			ClassDeclaration classDec = (ClassDeclaration) result2_black[3];
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[5];
			ASTNode2Element cd2c2 = (ASTNode2Element) result2_black[6];
			// ForEach 
			for (Object[] result3_black : TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_12_3_findcontext_blackBBBBBBB(interfaceRealization,
							superInterfaceDec, superInterface, classDec, umlClass, cd2c, cd2c2)) {
				Object[] result3_green = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_12_3_findcontext_greenBBBBBBBFFFFFFFF(
								interfaceRealization, superInterfaceDec, superInterface, classDec, umlClass, cd2c,
								cd2c2);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge umlClass__interfaceRealization____interfaceRealization = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge interfaceRealization__umlClass____implementingClassifier = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge cd2c__umlClass____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge cd2c2__superInterface____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge cd2c2__superInterfaceDec____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge cd2c__classDec____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge interfaceRealization__superInterface____contract = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, interfaceRealization, superInterfaceDec, superInterface, classDec,
								umlClass, cd2c, cd2c2);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[interfaceRealization] = "
							+ interfaceRealization + ", " + "[superInterfaceDec] = " + superInterfaceDec + ", "
							+ "[superInterface] = " + superInterface + ", " + "[classDec] = " + classDec + ", "
							+ "[umlClass] = " + umlClass + ", " + "[cd2c] = " + cd2c + ", " + "[cd2c2] = " + cd2c2
							+ ".");
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
	public void registerObjectsToMatch_BWD(Match match, InterfaceRealization interfaceRealization,
			Interface superInterface, BehavioredClassifier umlClass) {
		match.registerObject("interfaceRealization", interfaceRealization);
		match.registerObject("superInterface", superInterface);
		match.registerObject("umlClass", umlClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, InterfaceRealization interfaceRealization,
			Interface superInterface, BehavioredClassifier umlClass) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, InterfaceRealization interfaceRealization,
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ClassDeclaration classDec,
			BehavioredClassifier umlClass, ASTNode2Element cd2c, ASTNode2Element cd2c2) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("interfaceRealization", interfaceRealization);
		isApplicableMatch.registerObject("superInterfaceDec", superInterfaceDec);
		isApplicableMatch.registerObject("superInterface", superInterface);
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("cd2c2", cd2c2);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject interfaceRealization,
			EObject superInterfaceDec, EObject superInterface, EObject classDec, EObject typeAcc, EObject umlClass,
			EObject ta2g, EObject cd2c, EObject cd2c2) {
		ruleresult.registerObject("interfaceRealization", interfaceRealization);
		ruleresult.registerObject("superInterfaceDec", superInterfaceDec);
		ruleresult.registerObject("superInterface", superInterface);
		ruleresult.registerObject("classDec", classDec);
		ruleresult.registerObject("typeAcc", typeAcc);
		ruleresult.registerObject("umlClass", umlClass);
		ruleresult.registerObject("ta2g", ta2g);
		ruleresult.registerObject("cd2c", cd2c);
		ruleresult.registerObject("cd2c2", cd2c2);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_66(EMoflonEdge _edge_interfaceRealization) {

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
			InterfaceRealization interfaceRealization = (InterfaceRealization) result2_black[0];
			Interface superInterface = (Interface) result2_black[1];
			BehavioredClassifier umlClass = (BehavioredClassifier) result2_black[2];
			Object[] result2_green = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, interfaceRealization, superInterface, umlClass)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_82(EMoflonEdge _edge_superInterfaces) {

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
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_black[0];
			ClassDeclaration classDec = (ClassDeclaration) result2_black[1];
			TypeAccess typeAcc = (TypeAccess) result2_black[2];
			Object[] result2_green = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, superInterfaceDec, classDec, typeAcc)) {
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
		InterfaceRealization interfaceRealization = (InterfaceRealization) result2_bindingAndBlack[0];
		InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_bindingAndBlack[1];
		Interface superInterface = (Interface) result2_bindingAndBlack[2];
		ClassDeclaration classDec = (ClassDeclaration) result2_bindingAndBlack[3];
		TypeAccess typeAcc = (TypeAccess) result2_bindingAndBlack[4];
		BehavioredClassifier umlClass = (BehavioredClassifier) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this,
						interfaceRealization, superInterfaceDec, superInterface, classDec, typeAcc, umlClass,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[interfaceRealization] = " + interfaceRealization + ", " + "[superInterfaceDec] = "
					+ superInterfaceDec + ", " + "[superInterface] = " + superInterface + ", " + "[classDec] = "
					+ classDec + ", " + "[typeAcc] = " + typeAcc + ", " + "[umlClass] = " + umlClass + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_24_5_matchcorrcontext_blackBBBBFFBB(superInterfaceDec,
							superInterface, classDec, umlClass, sourceMatch, targetMatch)) {
				ASTNode2Element cd2c = (ASTNode2Element) result5_black[4];
				ASTNode2Element cd2c2 = (ASTNode2Element) result5_black[5];
				Object[] result5_green = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_24_5_matchcorrcontext_greenBBBBF(cd2c, cd2c2,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_24_6_createcorrespondence_blackBBBBBBB(
								interfaceRealization, superInterfaceDec, superInterface, classDec, typeAcc, umlClass,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[interfaceRealization] = "
							+ interfaceRealization + ", " + "[superInterfaceDec] = " + superInterfaceDec + ", "
							+ "[superInterface] = " + superInterface + ", " + "[classDec] = " + classDec + ", "
							+ "[typeAcc] = " + typeAcc + ", " + "[umlClass] = " + umlClass + ", " + "[ccMatch] = "
							+ ccMatch + ".");
				}
				TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_24_6_createcorrespondence_greenBBFB(
								interfaceRealization, typeAcc, ccMatch);
				//nothing org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization) result6_green[2];

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
	public CSP isApplicable_solveCsp_CC(InterfaceRealization interfaceRealization,
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ClassDeclaration classDec,
			TypeAccess typeAcc, BehavioredClassifier umlClass, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(InterfaceDeclaration superInterfaceDec, ClassDeclaration classDec, TypeAccess typeAcc) {// 
		Object[] result1_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_blackBBB(superInterfaceDec, classDec,
						typeAcc);
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
	public boolean checkDEC_BWD(InterfaceRealization interfaceRealization, Interface superInterface,
			BehavioredClassifier umlClass) {// 
		Object[] result1_black = TypeAccess2InterfaceRealizationImpl
				.pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_blackBBB(interfaceRealization,
						superInterface, umlClass);
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
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result2_black[1];
			ASTNode2Element cd2c2 = (ASTNode2Element) result2_black[2];
			Interface superInterface = (Interface) result2_black[3];
			//nothing RuleEntryList cd2cList = (RuleEntryList) result2_black[4];
			ClassDeclaration classDec = (ClassDeclaration) result2_black[5];
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[6];
			BehavioredClassifier umlClass = (BehavioredClassifier) result2_black[7];

			Object[] result3_bindingAndBlack = TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, superInterfaceDec, superInterface, classDec, umlClass, cd2c, cd2c2,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[superInterfaceDec] = "
						+ superInterfaceDec + ", " + "[superInterface] = " + superInterface + ", " + "[classDec] = "
						+ classDec + ", " + "[umlClass] = " + umlClass + ", " + "[cd2c] = " + cd2c + ", " + "[cd2c2] = "
						+ cd2c2 + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypeAccess2InterfaceRealizationImpl
					.pattern_TypeAccess2InterfaceRealization_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = TypeAccess2InterfaceRealizationImpl
						.pattern_TypeAccess2InterfaceRealization_29_5_checknacs_blackBBBBBB(superInterfaceDec,
								superInterface, classDec, umlClass, cd2c, cd2c2);
				if (result5_black != null) {

					Object[] result6_black = TypeAccess2InterfaceRealizationImpl
							.pattern_TypeAccess2InterfaceRealization_29_6_perform_blackBBBBBBB(superInterfaceDec,
									superInterface, classDec, umlClass, cd2c, cd2c2, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[superInterfaceDec] = " + superInterfaceDec + ", " + "[superInterface] = "
								+ superInterface + ", " + "[classDec] = " + classDec + ", " + "[umlClass] = " + umlClass
								+ ", " + "[cd2c] = " + cd2c + ", " + "[cd2c2] = " + cd2c2 + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					TypeAccess2InterfaceRealizationImpl
							.pattern_TypeAccess2InterfaceRealization_29_6_perform_greenFBBBFBFB(superInterfaceDec,
									superInterface, classDec, umlClass, ruleResult);
					//nothing InterfaceRealization interfaceRealization = (InterfaceRealization) result6_green[0];
					//nothing TypeAccess typeAcc = (TypeAccess) result6_green[4];
					//nothing org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization) result6_green[6];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, InterfaceDeclaration superInterfaceDec,
			Interface superInterface, ClassDeclaration classDec, BehavioredClassifier umlClass, ASTNode2Element cd2c,
			ASTNode2Element cd2c2, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("superInterfaceDec", superInterfaceDec);
		isApplicableMatch.registerObject("superInterface", superInterface);
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("cd2c2", cd2c2);
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
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_FWD__MATCH_INTERFACEDECLARATION_CLASSDECLARATION_TYPEACCESS:
			return isAppropriate_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (TypeAccess) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_INTERFACEDECLARATION_CLASSDECLARATION_TYPEACCESS:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (TypeAccess) arguments.get(3));
			return null;
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_INTERFACEDECLARATION_CLASSDECLARATION_TYPEACCESS:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (TypeAccess) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERFACEDECLARATION_INTERFACE_CLASSDECLARATION_TYPEACCESS_BEHAVIOREDCLASSIFIER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(InterfaceDeclaration) arguments.get(1), (Interface) arguments.get(2),
					(ClassDeclaration) arguments.get(3), (TypeAccess) arguments.get(4),
					(BehavioredClassifier) arguments.get(5), (ASTNode2Element) arguments.get(6),
					(ASTNode2Element) arguments.get(7));
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
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_BWD__MATCH_INTERFACEREALIZATION_INTERFACE_BEHAVIOREDCLASSIFIER:
			return isAppropriate_BWD((Match) arguments.get(0), (InterfaceRealization) arguments.get(1),
					(Interface) arguments.get(2), (BehavioredClassifier) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERFACEREALIZATION_INTERFACE_BEHAVIOREDCLASSIFIER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (InterfaceRealization) arguments.get(1),
					(Interface) arguments.get(2), (BehavioredClassifier) arguments.get(3));
			return null;
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERFACEREALIZATION_INTERFACE_BEHAVIOREDCLASSIFIER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (InterfaceRealization) arguments.get(1),
					(Interface) arguments.get(2), (BehavioredClassifier) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERFACEREALIZATION_INTERFACEDECLARATION_INTERFACE_CLASSDECLARATION_BEHAVIOREDCLASSIFIER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(InterfaceRealization) arguments.get(1), (InterfaceDeclaration) arguments.get(2),
					(Interface) arguments.get(3), (ClassDeclaration) arguments.get(4),
					(BehavioredClassifier) arguments.get(5), (ASTNode2Element) arguments.get(6),
					(ASTNode2Element) arguments.get(7));
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
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_66__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_66((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_82__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_82((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_SOLVE_CSP_CC__INTERFACEREALIZATION_INTERFACEDECLARATION_INTERFACE_CLASSDECLARATION_TYPEACCESS_BEHAVIOREDCLASSIFIER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((InterfaceRealization) arguments.get(0),
					(InterfaceDeclaration) arguments.get(1), (Interface) arguments.get(2),
					(ClassDeclaration) arguments.get(3), (TypeAccess) arguments.get(4),
					(BehavioredClassifier) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___CHECK_DEC_FWD__INTERFACEDECLARATION_CLASSDECLARATION_TYPEACCESS:
			return checkDEC_FWD((InterfaceDeclaration) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___CHECK_DEC_BWD__INTERFACEREALIZATION_INTERFACE_BEHAVIOREDCLASSIFIER:
			return checkDEC_BWD((InterfaceRealization) arguments.get(0), (Interface) arguments.get(1),
					(BehavioredClassifier) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERFACEDECLARATION_INTERFACE_CLASSDECLARATION_BEHAVIOREDCLASSIFIER_ASTNODE2ELEMENT_ASTNODE2ELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(InterfaceDeclaration) arguments.get(1), (Interface) arguments.get(2),
					(ClassDeclaration) arguments.get(3), (BehavioredClassifier) arguments.get(4),
					(ASTNode2Element) arguments.get(5), (ASTNode2Element) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_INTERFACE_REALIZATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_1_initialbindings_blackBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, InterfaceDeclaration superInterfaceDec,
			ClassDeclaration classDec, TypeAccess typeAcc) {
		return new Object[] { _this, match, superInterfaceDec, classDec, typeAcc };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_bindingFBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, InterfaceDeclaration superInterfaceDec,
			ClassDeclaration classDec, TypeAccess typeAcc) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, superInterfaceDec, classDec, typeAcc);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, superInterfaceDec, classDec, typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_bindingAndBlackFBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, InterfaceDeclaration superInterfaceDec,
			ClassDeclaration classDec, TypeAccess typeAcc) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_binding = pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_bindingFBBBBB(
				_this, match, superInterfaceDec, classDec, typeAcc);
		if (result_pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_black = pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, superInterfaceDec, classDec, typeAcc };
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
			Match match, InterfaceDeclaration superInterfaceDec, ClassDeclaration classDec, TypeAccess typeAcc) {
		return new Object[] { match, superInterfaceDec, classDec, typeAcc };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, InterfaceDeclaration superInterfaceDec, ClassDeclaration classDec, TypeAccess typeAcc) {
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
		return new Object[] { match, superInterfaceDec, classDec, typeAcc, classDec__typeAcc____superInterfaces,
				typeAcc__superInterfaceDec____type, superInterfaceDec__typeAcc____usagesInTypeAccess };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_5_collectcontextelements_blackBBBB(
			Match match, InterfaceDeclaration superInterfaceDec, ClassDeclaration classDec, TypeAccess typeAcc) {
		return new Object[] { match, superInterfaceDec, classDec, typeAcc };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_0_5_collectcontextelements_greenBBB(
			Match match, InterfaceDeclaration superInterfaceDec, ClassDeclaration classDec) {
		match.getContextNodes().add(superInterfaceDec);
		match.getContextNodes().add(classDec);
		return new Object[] { match, superInterfaceDec, classDec };
	}

	public static final void pattern_TypeAccess2InterfaceRealization_0_6_registerobjectstomatch_expressionBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, InterfaceDeclaration superInterfaceDec,
			ClassDeclaration classDec, TypeAccess typeAcc) {
		_this.registerObjectsToMatch_FWD(match, superInterfaceDec, classDec, typeAcc);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("superInterfaceDec");
		EObject _localVariable_1 = isApplicableMatch.getObject("superInterface");
		EObject _localVariable_2 = isApplicableMatch.getObject("classDec");
		EObject _localVariable_3 = isApplicableMatch.getObject("typeAcc");
		EObject _localVariable_4 = isApplicableMatch.getObject("umlClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("cd2c");
		EObject _localVariable_6 = isApplicableMatch.getObject("cd2c2");
		EObject tmpSuperInterfaceDec = _localVariable_0;
		EObject tmpSuperInterface = _localVariable_1;
		EObject tmpClassDec = _localVariable_2;
		EObject tmpTypeAcc = _localVariable_3;
		EObject tmpUmlClass = _localVariable_4;
		EObject tmpCd2c = _localVariable_5;
		EObject tmpCd2c2 = _localVariable_6;
		if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
			if (tmpSuperInterface instanceof Interface) {
				Interface superInterface = (Interface) tmpSuperInterface;
				if (tmpClassDec instanceof ClassDeclaration) {
					ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
					if (tmpTypeAcc instanceof TypeAccess) {
						TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
						if (tmpUmlClass instanceof BehavioredClassifier) {
							BehavioredClassifier umlClass = (BehavioredClassifier) tmpUmlClass;
							if (tmpCd2c instanceof ASTNode2Element) {
								ASTNode2Element cd2c = (ASTNode2Element) tmpCd2c;
								if (tmpCd2c2 instanceof ASTNode2Element) {
									ASTNode2Element cd2c2 = (ASTNode2Element) tmpCd2c2;
									return new Object[] { superInterfaceDec, superInterface, classDec, typeAcc,
											umlClass, cd2c, cd2c2, isApplicableMatch };
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
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ClassDeclaration classDec,
			TypeAccess typeAcc, BehavioredClassifier umlClass, ASTNode2Element cd2c, ASTNode2Element cd2c2,
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch) {
		if (!cd2c.equals(cd2c2)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { superInterfaceDec, superInterface, classDec, typeAcc, umlClass, cd2c, cd2c2,
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
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[0];
			Interface superInterface = (Interface) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[1];
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[2];
			TypeAccess typeAcc = (TypeAccess) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[3];
			BehavioredClassifier umlClass = (BehavioredClassifier) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[4];
			ASTNode2Element cd2c = (ASTNode2Element) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[5];
			ASTNode2Element cd2c2 = (ASTNode2Element) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_binding[6];

			Object[] result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_black = pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_blackBBBBBBBFBB(
					superInterfaceDec, superInterface, classDec, typeAcc, umlClass, cd2c, cd2c2, _this,
					isApplicableMatch);
			if (result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_black[7];

				return new Object[] { superInterfaceDec, superInterface, classDec, typeAcc, umlClass, cd2c, cd2c2, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_1_1_performtransformation_greenFBBBF(
			Interface superInterface, TypeAccess typeAcc, BehavioredClassifier umlClass) {
		InterfaceRealization interfaceRealization = UMLFactory.eINSTANCE.createInterfaceRealization();
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2InterfaceRealization();
		umlClass.getInterfaceRealizations().add(interfaceRealization);
		interfaceRealization.setContract(superInterface);
		ta2g.setSource(typeAcc);
		ta2g.setTarget(interfaceRealization);
		return new Object[] { interfaceRealization, superInterface, typeAcc, umlClass, ta2g };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_1_2_collecttranslatedelements_blackBBB(
			InterfaceRealization interfaceRealization, TypeAccess typeAcc,
			org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g) {
		return new Object[] { interfaceRealization, typeAcc, ta2g };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_1_2_collecttranslatedelements_greenFBBB(
			InterfaceRealization interfaceRealization, TypeAccess typeAcc,
			org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(interfaceRealization);
		ruleresult.getTranslatedElements().add(typeAcc);
		ruleresult.getCreatedLinkElements().add(ta2g);
		return new Object[] { ruleresult, interfaceRealization, typeAcc, ta2g };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject interfaceRealization, EObject superInterfaceDec,
			EObject superInterface, EObject classDec, EObject typeAcc, EObject umlClass, EObject ta2g, EObject cd2c,
			EObject cd2c2) {
		if (!interfaceRealization.equals(superInterfaceDec)) {
			if (!interfaceRealization.equals(superInterface)) {
				if (!interfaceRealization.equals(typeAcc)) {
					if (!interfaceRealization.equals(umlClass)) {
						if (!interfaceRealization.equals(ta2g)) {
							if (!superInterfaceDec.equals(typeAcc)) {
								if (!superInterfaceDec.equals(umlClass)) {
									if (!superInterfaceDec.equals(ta2g)) {
										if (!superInterface.equals(superInterfaceDec)) {
											if (!superInterface.equals(typeAcc)) {
												if (!superInterface.equals(umlClass)) {
													if (!superInterface.equals(ta2g)) {
														if (!classDec.equals(interfaceRealization)) {
															if (!classDec.equals(superInterfaceDec)) {
																if (!classDec.equals(superInterface)) {
																	if (!classDec.equals(typeAcc)) {
																		if (!classDec.equals(umlClass)) {
																			if (!classDec.equals(ta2g)) {
																				if (!typeAcc.equals(umlClass)) {
																					if (!ta2g.equals(typeAcc)) {
																						if (!ta2g.equals(umlClass)) {
																							if (!cd2c.equals(
																									interfaceRealization)) {
																								if (!cd2c.equals(
																										superInterfaceDec)) {
																									if (!cd2c.equals(
																											superInterface)) {
																										if (!cd2c
																												.equals(classDec)) {
																											if (!cd2c
																													.equals(typeAcc)) {
																												if (!cd2c
																														.equals(umlClass)) {
																													if (!cd2c
																															.equals(ta2g)) {
																														if (!cd2c
																																.equals(cd2c2)) {
																															if (!cd2c2
																																	.equals(interfaceRealization)) {
																																if (!cd2c2
																																		.equals(superInterfaceDec)) {
																																	if (!cd2c2
																																			.equals(superInterface)) {
																																		if (!cd2c2
																																				.equals(classDec)) {
																																			if (!cd2c2
																																					.equals(typeAcc)) {
																																				if (!cd2c2
																																						.equals(umlClass)) {
																																					if (!cd2c2
																																							.equals(ta2g)) {
																																						return new Object[] {
																																								ruleresult,
																																								interfaceRealization,
																																								superInterfaceDec,
																																								superInterface,
																																								classDec,
																																								typeAcc,
																																								umlClass,
																																								ta2g,
																																								cd2c,
																																								cd2c2 };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject interfaceRealization, EObject superInterfaceDec,
			EObject superInterface, EObject classDec, EObject typeAcc, EObject umlClass, EObject ta2g) {
		EMoflonEdge umlClass__interfaceRealization____interfaceRealization = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interfaceRealization__umlClass____implementingClassifier = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ta2g__typeAcc____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__typeAcc____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__interfaceRealization____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge interfaceRealization__superInterface____contract = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAcc__superInterfaceDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccess2InterfaceRealization";
		String umlClass__interfaceRealization____interfaceRealization_name_prime = "interfaceRealization";
		String interfaceRealization__umlClass____implementingClassifier_name_prime = "implementingClassifier";
		String ta2g__typeAcc____source_name_prime = "source";
		String classDec__typeAcc____superInterfaces_name_prime = "superInterfaces";
		String ta2g__interfaceRealization____target_name_prime = "target";
		String interfaceRealization__superInterface____contract_name_prime = "contract";
		String typeAcc__superInterfaceDec____type_name_prime = "type";
		String superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		umlClass__interfaceRealization____interfaceRealization.setSrc(umlClass);
		umlClass__interfaceRealization____interfaceRealization.setTrg(interfaceRealization);
		ruleresult.getCreatedEdges().add(umlClass__interfaceRealization____interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setSrc(interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setTrg(umlClass);
		ruleresult.getCreatedEdges().add(interfaceRealization__umlClass____implementingClassifier);
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
		typeAcc__superInterfaceDec____type.setSrc(typeAcc);
		typeAcc__superInterfaceDec____type.setTrg(superInterfaceDec);
		ruleresult.getTranslatedEdges().add(typeAcc__superInterfaceDec____type);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setSrc(superInterfaceDec);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		ruleresult.getTranslatedEdges().add(superInterfaceDec__typeAcc____usagesInTypeAccess);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		umlClass__interfaceRealization____interfaceRealization
				.setName(umlClass__interfaceRealization____interfaceRealization_name_prime);
		interfaceRealization__umlClass____implementingClassifier
				.setName(interfaceRealization__umlClass____implementingClassifier_name_prime);
		ta2g__typeAcc____source.setName(ta2g__typeAcc____source_name_prime);
		classDec__typeAcc____superInterfaces.setName(classDec__typeAcc____superInterfaces_name_prime);
		ta2g__interfaceRealization____target.setName(ta2g__interfaceRealization____target_name_prime);
		interfaceRealization__superInterface____contract
				.setName(interfaceRealization__superInterface____contract_name_prime);
		typeAcc__superInterfaceDec____type.setName(typeAcc__superInterfaceDec____type_name_prime);
		superInterfaceDec__typeAcc____usagesInTypeAccess
				.setName(superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime);
		return new Object[] { ruleresult, interfaceRealization, superInterfaceDec, superInterface, classDec, typeAcc,
				umlClass, ta2g, umlClass__interfaceRealization____interfaceRealization,
				interfaceRealization__umlClass____implementingClassifier, ta2g__typeAcc____source,
				classDec__typeAcc____superInterfaces, ta2g__interfaceRealization____target,
				interfaceRealization__superInterface____contract, typeAcc__superInterfaceDec____type,
				superInterfaceDec__typeAcc____usagesInTypeAccess };
	}

	public static final void pattern_TypeAccess2InterfaceRealization_1_5_registerobjects_expressionBBBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, PerformRuleResult ruleresult, EObject interfaceRealization,
			EObject superInterfaceDec, EObject superInterface, EObject classDec, EObject typeAcc, EObject umlClass,
			EObject ta2g, EObject cd2c, EObject cd2c2) {
		_this.registerObjects_FWD(ruleresult, interfaceRealization, superInterfaceDec, superInterface, classDec,
				typeAcc, umlClass, ta2g, cd2c, cd2c2);

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
		EObject _localVariable_0 = match.getObject("superInterfaceDec");
		EObject _localVariable_1 = match.getObject("classDec");
		EObject _localVariable_2 = match.getObject("typeAcc");
		EObject tmpSuperInterfaceDec = _localVariable_0;
		EObject tmpClassDec = _localVariable_1;
		EObject tmpTypeAcc = _localVariable_2;
		if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
			if (tmpClassDec instanceof ClassDeclaration) {
				ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
				if (tmpTypeAcc instanceof TypeAccess) {
					TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
					return new Object[] { superInterfaceDec, classDec, typeAcc, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_2_2_corematch_blackBFBBFFFB(
			InterfaceDeclaration superInterfaceDec, ClassDeclaration classDec, TypeAccess typeAcc, Match match) {
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
							_result.add(new Object[] { superInterfaceDec, superInterface, classDec, typeAcc, umlClass,
									cd2c, cd2c2, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_2_3_findcontext_blackBBBBBBB(
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ClassDeclaration classDec,
			TypeAccess typeAcc, BehavioredClassifier umlClass, ASTNode2Element cd2c, ASTNode2Element cd2c2) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!cd2c.equals(cd2c2)) {
			if (classDec.getSuperInterfaces().contains(typeAcc)) {
				if (umlClass.equals(cd2c.getTarget())) {
					if (superInterface.equals(cd2c2.getTarget())) {
						if (superInterfaceDec.equals(cd2c2.getSource())) {
							if (classDec.equals(cd2c.getSource())) {
								if (superInterfaceDec.equals(typeAcc.getType())) {
									_result.add(new Object[] { superInterfaceDec, superInterface, classDec, typeAcc,
											umlClass, cd2c, cd2c2 });
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
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ClassDeclaration classDec,
			TypeAccess typeAcc, BehavioredClassifier umlClass, ASTNode2Element cd2c, ASTNode2Element cd2c2) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge classDec__typeAcc____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superInterface____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superInterfaceDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAcc__superInterfaceDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String classDec__typeAcc____superInterfaces_name_prime = "superInterfaces";
		String cd2c__umlClass____target_name_prime = "target";
		String cd2c2__superInterface____target_name_prime = "target";
		String cd2c2__superInterfaceDec____source_name_prime = "source";
		String cd2c__classDec____source_name_prime = "source";
		String typeAcc__superInterfaceDec____type_name_prime = "type";
		String superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		isApplicableMatch.getAllContextElements().add(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(superInterface);
		isApplicableMatch.getAllContextElements().add(classDec);
		isApplicableMatch.getAllContextElements().add(typeAcc);
		isApplicableMatch.getAllContextElements().add(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c);
		isApplicableMatch.getAllContextElements().add(cd2c2);
		classDec__typeAcc____superInterfaces.setSrc(classDec);
		classDec__typeAcc____superInterfaces.setTrg(typeAcc);
		isApplicableMatch.getAllContextElements().add(classDec__typeAcc____superInterfaces);
		cd2c__umlClass____target.setSrc(cd2c);
		cd2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c__umlClass____target);
		cd2c2__superInterface____target.setSrc(cd2c2);
		cd2c2__superInterface____target.setTrg(superInterface);
		isApplicableMatch.getAllContextElements().add(cd2c2__superInterface____target);
		cd2c2__superInterfaceDec____source.setSrc(cd2c2);
		cd2c2__superInterfaceDec____source.setTrg(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(cd2c2__superInterfaceDec____source);
		cd2c__classDec____source.setSrc(cd2c);
		cd2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c__classDec____source);
		typeAcc__superInterfaceDec____type.setSrc(typeAcc);
		typeAcc__superInterfaceDec____type.setTrg(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(typeAcc__superInterfaceDec____type);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setSrc(superInterfaceDec);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		isApplicableMatch.getAllContextElements().add(superInterfaceDec__typeAcc____usagesInTypeAccess);
		classDec__typeAcc____superInterfaces.setName(classDec__typeAcc____superInterfaces_name_prime);
		cd2c__umlClass____target.setName(cd2c__umlClass____target_name_prime);
		cd2c2__superInterface____target.setName(cd2c2__superInterface____target_name_prime);
		cd2c2__superInterfaceDec____source.setName(cd2c2__superInterfaceDec____source_name_prime);
		cd2c__classDec____source.setName(cd2c__classDec____source_name_prime);
		typeAcc__superInterfaceDec____type.setName(typeAcc__superInterfaceDec____type_name_prime);
		superInterfaceDec__typeAcc____usagesInTypeAccess
				.setName(superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime);
		return new Object[] { superInterfaceDec, superInterface, classDec, typeAcc, umlClass, cd2c, cd2c2,
				isApplicableMatch, classDec__typeAcc____superInterfaces, cd2c__umlClass____target,
				cd2c2__superInterface____target, cd2c2__superInterfaceDec____source, cd2c__classDec____source,
				typeAcc__superInterfaceDec____type, superInterfaceDec__typeAcc____usagesInTypeAccess };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch,
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ClassDeclaration classDec,
			TypeAccess typeAcc, BehavioredClassifier umlClass, ASTNode2Element cd2c, ASTNode2Element cd2c2) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, superInterfaceDec, superInterface,
				classDec, typeAcc, umlClass, cd2c, cd2c2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, superInterfaceDec, superInterface, classDec, typeAcc,
					umlClass, cd2c, cd2c2 };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch,
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ClassDeclaration classDec,
			TypeAccess typeAcc, BehavioredClassifier umlClass, ASTNode2Element cd2c, ASTNode2Element cd2c2) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_binding = pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, superInterfaceDec, superInterface, classDec, typeAcc, umlClass, cd2c, cd2c2);
		if (result_pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_black = pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, superInterfaceDec, superInterface, classDec,
						typeAcc, umlClass, cd2c, cd2c2 };
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
			TypeAccess2InterfaceRealization _this, Match match, InterfaceRealization interfaceRealization,
			Interface superInterface, BehavioredClassifier umlClass) {
		return new Object[] { _this, match, interfaceRealization, superInterface, umlClass };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_bindingFBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, InterfaceRealization interfaceRealization,
			Interface superInterface, BehavioredClassifier umlClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, interfaceRealization, superInterface, umlClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, interfaceRealization, superInterface, umlClass };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_bindingAndBlackFBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, InterfaceRealization interfaceRealization,
			Interface superInterface, BehavioredClassifier umlClass) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_binding = pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_bindingFBBBBB(
				_this, match, interfaceRealization, superInterface, umlClass);
		if (result_pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_black = pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, interfaceRealization, superInterface, umlClass };
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
			Match match, InterfaceRealization interfaceRealization, Interface superInterface,
			BehavioredClassifier umlClass) {
		return new Object[] { match, interfaceRealization, superInterface, umlClass };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, InterfaceRealization interfaceRealization, Interface superInterface,
			BehavioredClassifier umlClass) {
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
		return new Object[] { match, interfaceRealization, superInterface, umlClass,
				umlClass__interfaceRealization____interfaceRealization,
				interfaceRealization__umlClass____implementingClassifier,
				interfaceRealization__superInterface____contract };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_5_collectcontextelements_blackBBBB(
			Match match, InterfaceRealization interfaceRealization, Interface superInterface,
			BehavioredClassifier umlClass) {
		return new Object[] { match, interfaceRealization, superInterface, umlClass };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_10_5_collectcontextelements_greenBBB(
			Match match, Interface superInterface, BehavioredClassifier umlClass) {
		match.getContextNodes().add(superInterface);
		match.getContextNodes().add(umlClass);
		return new Object[] { match, superInterface, umlClass };
	}

	public static final void pattern_TypeAccess2InterfaceRealization_10_6_registerobjectstomatch_expressionBBBBB(
			TypeAccess2InterfaceRealization _this, Match match, InterfaceRealization interfaceRealization,
			Interface superInterface, BehavioredClassifier umlClass) {
		_this.registerObjectsToMatch_BWD(match, interfaceRealization, superInterface, umlClass);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("interfaceRealization");
		EObject _localVariable_1 = isApplicableMatch.getObject("superInterfaceDec");
		EObject _localVariable_2 = isApplicableMatch.getObject("superInterface");
		EObject _localVariable_3 = isApplicableMatch.getObject("classDec");
		EObject _localVariable_4 = isApplicableMatch.getObject("umlClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("cd2c");
		EObject _localVariable_6 = isApplicableMatch.getObject("cd2c2");
		EObject tmpInterfaceRealization = _localVariable_0;
		EObject tmpSuperInterfaceDec = _localVariable_1;
		EObject tmpSuperInterface = _localVariable_2;
		EObject tmpClassDec = _localVariable_3;
		EObject tmpUmlClass = _localVariable_4;
		EObject tmpCd2c = _localVariable_5;
		EObject tmpCd2c2 = _localVariable_6;
		if (tmpInterfaceRealization instanceof InterfaceRealization) {
			InterfaceRealization interfaceRealization = (InterfaceRealization) tmpInterfaceRealization;
			if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
				InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
				if (tmpSuperInterface instanceof Interface) {
					Interface superInterface = (Interface) tmpSuperInterface;
					if (tmpClassDec instanceof ClassDeclaration) {
						ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
						if (tmpUmlClass instanceof BehavioredClassifier) {
							BehavioredClassifier umlClass = (BehavioredClassifier) tmpUmlClass;
							if (tmpCd2c instanceof ASTNode2Element) {
								ASTNode2Element cd2c = (ASTNode2Element) tmpCd2c;
								if (tmpCd2c2 instanceof ASTNode2Element) {
									ASTNode2Element cd2c2 = (ASTNode2Element) tmpCd2c2;
									return new Object[] { interfaceRealization, superInterfaceDec, superInterface,
											classDec, umlClass, cd2c, cd2c2, isApplicableMatch };
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
			InterfaceRealization interfaceRealization, InterfaceDeclaration superInterfaceDec, Interface superInterface,
			ClassDeclaration classDec, BehavioredClassifier umlClass, ASTNode2Element cd2c, ASTNode2Element cd2c2,
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch) {
		if (!cd2c.equals(cd2c2)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { interfaceRealization, superInterfaceDec, superInterface, classDec, umlClass,
							cd2c, cd2c2, csp, _this, isApplicableMatch };
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
			InterfaceRealization interfaceRealization = (InterfaceRealization) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[0];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[1];
			Interface superInterface = (Interface) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[2];
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[3];
			BehavioredClassifier umlClass = (BehavioredClassifier) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[4];
			ASTNode2Element cd2c = (ASTNode2Element) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[5];
			ASTNode2Element cd2c2 = (ASTNode2Element) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_binding[6];

			Object[] result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_black = pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_blackBBBBBBBFBB(
					interfaceRealization, superInterfaceDec, superInterface, classDec, umlClass, cd2c, cd2c2, _this,
					isApplicableMatch);
			if (result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_black[7];

				return new Object[] { interfaceRealization, superInterfaceDec, superInterface, classDec, umlClass, cd2c,
						cd2c2, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_11_1_performtransformation_greenBBBFF(
			InterfaceRealization interfaceRealization, InterfaceDeclaration superInterfaceDec,
			ClassDeclaration classDec) {
		TypeAccess typeAcc = JavaFactory.eINSTANCE.createTypeAccess();
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2InterfaceRealization();
		classDec.getSuperInterfaces().add(typeAcc);
		typeAcc.setType(superInterfaceDec);
		ta2g.setSource(typeAcc);
		ta2g.setTarget(interfaceRealization);
		return new Object[] { interfaceRealization, superInterfaceDec, classDec, typeAcc, ta2g };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_11_2_collecttranslatedelements_blackBBB(
			InterfaceRealization interfaceRealization, TypeAccess typeAcc,
			org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g) {
		return new Object[] { interfaceRealization, typeAcc, ta2g };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_11_2_collecttranslatedelements_greenFBBB(
			InterfaceRealization interfaceRealization, TypeAccess typeAcc,
			org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(interfaceRealization);
		ruleresult.getCreatedElements().add(typeAcc);
		ruleresult.getCreatedLinkElements().add(ta2g);
		return new Object[] { ruleresult, interfaceRealization, typeAcc, ta2g };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject interfaceRealization, EObject superInterfaceDec,
			EObject superInterface, EObject classDec, EObject typeAcc, EObject umlClass, EObject ta2g, EObject cd2c,
			EObject cd2c2) {
		if (!interfaceRealization.equals(superInterfaceDec)) {
			if (!interfaceRealization.equals(superInterface)) {
				if (!interfaceRealization.equals(typeAcc)) {
					if (!interfaceRealization.equals(umlClass)) {
						if (!interfaceRealization.equals(ta2g)) {
							if (!superInterfaceDec.equals(typeAcc)) {
								if (!superInterfaceDec.equals(umlClass)) {
									if (!superInterfaceDec.equals(ta2g)) {
										if (!superInterface.equals(superInterfaceDec)) {
											if (!superInterface.equals(typeAcc)) {
												if (!superInterface.equals(umlClass)) {
													if (!superInterface.equals(ta2g)) {
														if (!classDec.equals(interfaceRealization)) {
															if (!classDec.equals(superInterfaceDec)) {
																if (!classDec.equals(superInterface)) {
																	if (!classDec.equals(typeAcc)) {
																		if (!classDec.equals(umlClass)) {
																			if (!classDec.equals(ta2g)) {
																				if (!typeAcc.equals(umlClass)) {
																					if (!ta2g.equals(typeAcc)) {
																						if (!ta2g.equals(umlClass)) {
																							if (!cd2c.equals(
																									interfaceRealization)) {
																								if (!cd2c.equals(
																										superInterfaceDec)) {
																									if (!cd2c.equals(
																											superInterface)) {
																										if (!cd2c
																												.equals(classDec)) {
																											if (!cd2c
																													.equals(typeAcc)) {
																												if (!cd2c
																														.equals(umlClass)) {
																													if (!cd2c
																															.equals(ta2g)) {
																														if (!cd2c
																																.equals(cd2c2)) {
																															if (!cd2c2
																																	.equals(interfaceRealization)) {
																																if (!cd2c2
																																		.equals(superInterfaceDec)) {
																																	if (!cd2c2
																																			.equals(superInterface)) {
																																		if (!cd2c2
																																				.equals(classDec)) {
																																			if (!cd2c2
																																					.equals(typeAcc)) {
																																				if (!cd2c2
																																						.equals(umlClass)) {
																																					if (!cd2c2
																																							.equals(ta2g)) {
																																						return new Object[] {
																																								ruleresult,
																																								interfaceRealization,
																																								superInterfaceDec,
																																								superInterface,
																																								classDec,
																																								typeAcc,
																																								umlClass,
																																								ta2g,
																																								cd2c,
																																								cd2c2 };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject interfaceRealization, EObject superInterfaceDec,
			EObject superInterface, EObject classDec, EObject typeAcc, EObject umlClass, EObject ta2g) {
		EMoflonEdge umlClass__interfaceRealization____interfaceRealization = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interfaceRealization__umlClass____implementingClassifier = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ta2g__typeAcc____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__typeAcc____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__interfaceRealization____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge interfaceRealization__superInterface____contract = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAcc__superInterfaceDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superInterfaceDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccess2InterfaceRealization";
		String umlClass__interfaceRealization____interfaceRealization_name_prime = "interfaceRealization";
		String interfaceRealization__umlClass____implementingClassifier_name_prime = "implementingClassifier";
		String ta2g__typeAcc____source_name_prime = "source";
		String classDec__typeAcc____superInterfaces_name_prime = "superInterfaces";
		String ta2g__interfaceRealization____target_name_prime = "target";
		String interfaceRealization__superInterface____contract_name_prime = "contract";
		String typeAcc__superInterfaceDec____type_name_prime = "type";
		String superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		umlClass__interfaceRealization____interfaceRealization.setSrc(umlClass);
		umlClass__interfaceRealization____interfaceRealization.setTrg(interfaceRealization);
		ruleresult.getTranslatedEdges().add(umlClass__interfaceRealization____interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setSrc(interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setTrg(umlClass);
		ruleresult.getTranslatedEdges().add(interfaceRealization__umlClass____implementingClassifier);
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
		typeAcc__superInterfaceDec____type.setSrc(typeAcc);
		typeAcc__superInterfaceDec____type.setTrg(superInterfaceDec);
		ruleresult.getCreatedEdges().add(typeAcc__superInterfaceDec____type);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setSrc(superInterfaceDec);
		superInterfaceDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(superInterfaceDec__typeAcc____usagesInTypeAccess);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		umlClass__interfaceRealization____interfaceRealization
				.setName(umlClass__interfaceRealization____interfaceRealization_name_prime);
		interfaceRealization__umlClass____implementingClassifier
				.setName(interfaceRealization__umlClass____implementingClassifier_name_prime);
		ta2g__typeAcc____source.setName(ta2g__typeAcc____source_name_prime);
		classDec__typeAcc____superInterfaces.setName(classDec__typeAcc____superInterfaces_name_prime);
		ta2g__interfaceRealization____target.setName(ta2g__interfaceRealization____target_name_prime);
		interfaceRealization__superInterface____contract
				.setName(interfaceRealization__superInterface____contract_name_prime);
		typeAcc__superInterfaceDec____type.setName(typeAcc__superInterfaceDec____type_name_prime);
		superInterfaceDec__typeAcc____usagesInTypeAccess
				.setName(superInterfaceDec__typeAcc____usagesInTypeAccess_name_prime);
		return new Object[] { ruleresult, interfaceRealization, superInterfaceDec, superInterface, classDec, typeAcc,
				umlClass, ta2g, umlClass__interfaceRealization____interfaceRealization,
				interfaceRealization__umlClass____implementingClassifier, ta2g__typeAcc____source,
				classDec__typeAcc____superInterfaces, ta2g__interfaceRealization____target,
				interfaceRealization__superInterface____contract, typeAcc__superInterfaceDec____type,
				superInterfaceDec__typeAcc____usagesInTypeAccess };
	}

	public static final void pattern_TypeAccess2InterfaceRealization_11_5_registerobjects_expressionBBBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, PerformRuleResult ruleresult, EObject interfaceRealization,
			EObject superInterfaceDec, EObject superInterface, EObject classDec, EObject typeAcc, EObject umlClass,
			EObject ta2g, EObject cd2c, EObject cd2c2) {
		_this.registerObjects_BWD(ruleresult, interfaceRealization, superInterfaceDec, superInterface, classDec,
				typeAcc, umlClass, ta2g, cd2c, cd2c2);

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
		EObject _localVariable_0 = match.getObject("interfaceRealization");
		EObject _localVariable_1 = match.getObject("superInterface");
		EObject _localVariable_2 = match.getObject("umlClass");
		EObject tmpInterfaceRealization = _localVariable_0;
		EObject tmpSuperInterface = _localVariable_1;
		EObject tmpUmlClass = _localVariable_2;
		if (tmpInterfaceRealization instanceof InterfaceRealization) {
			InterfaceRealization interfaceRealization = (InterfaceRealization) tmpInterfaceRealization;
			if (tmpSuperInterface instanceof Interface) {
				Interface superInterface = (Interface) tmpSuperInterface;
				if (tmpUmlClass instanceof BehavioredClassifier) {
					BehavioredClassifier umlClass = (BehavioredClassifier) tmpUmlClass;
					return new Object[] { interfaceRealization, superInterface, umlClass, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_12_2_corematch_blackBFBFBFFB(
			InterfaceRealization interfaceRealization, Interface superInterface, BehavioredClassifier umlClass,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element cd2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(umlClass,
				ASTNode2Element.class, "target")) {
			ASTNode tmpClassDec = cd2c.getSource();
			if (tmpClassDec instanceof ClassDeclaration) {
				ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
				for (ASTNode2Element cd2c2 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(superInterface, ASTNode2Element.class, "target")) {
					if (!cd2c.equals(cd2c2)) {
						ASTNode tmpSuperInterfaceDec = cd2c2.getSource();
						if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
							InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
							_result.add(new Object[] { interfaceRealization, superInterfaceDec, superInterface,
									classDec, umlClass, cd2c, cd2c2, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_12_3_findcontext_blackBBBBBBB(
			InterfaceRealization interfaceRealization, InterfaceDeclaration superInterfaceDec, Interface superInterface,
			ClassDeclaration classDec, BehavioredClassifier umlClass, ASTNode2Element cd2c, ASTNode2Element cd2c2) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!cd2c.equals(cd2c2)) {
			if (umlClass.getInterfaceRealizations().contains(interfaceRealization)) {
				if (umlClass.equals(cd2c.getTarget())) {
					if (superInterface.equals(cd2c2.getTarget())) {
						if (superInterfaceDec.equals(cd2c2.getSource())) {
							if (classDec.equals(cd2c.getSource())) {
								if (superInterface.equals(interfaceRealization.getContract())) {
									_result.add(new Object[] { interfaceRealization, superInterfaceDec, superInterface,
											classDec, umlClass, cd2c, cd2c2 });
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
			InterfaceRealization interfaceRealization, InterfaceDeclaration superInterfaceDec, Interface superInterface,
			ClassDeclaration classDec, BehavioredClassifier umlClass, ASTNode2Element cd2c, ASTNode2Element cd2c2) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge umlClass__interfaceRealization____interfaceRealization = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge interfaceRealization__umlClass____implementingClassifier = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge cd2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superInterface____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superInterfaceDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge interfaceRealization__superInterface____contract = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String umlClass__interfaceRealization____interfaceRealization_name_prime = "interfaceRealization";
		String interfaceRealization__umlClass____implementingClassifier_name_prime = "implementingClassifier";
		String cd2c__umlClass____target_name_prime = "target";
		String cd2c2__superInterface____target_name_prime = "target";
		String cd2c2__superInterfaceDec____source_name_prime = "source";
		String cd2c__classDec____source_name_prime = "source";
		String interfaceRealization__superInterface____contract_name_prime = "contract";
		isApplicableMatch.getAllContextElements().add(interfaceRealization);
		isApplicableMatch.getAllContextElements().add(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(superInterface);
		isApplicableMatch.getAllContextElements().add(classDec);
		isApplicableMatch.getAllContextElements().add(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c);
		isApplicableMatch.getAllContextElements().add(cd2c2);
		umlClass__interfaceRealization____interfaceRealization.setSrc(umlClass);
		umlClass__interfaceRealization____interfaceRealization.setTrg(interfaceRealization);
		isApplicableMatch.getAllContextElements().add(umlClass__interfaceRealization____interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setSrc(interfaceRealization);
		interfaceRealization__umlClass____implementingClassifier.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(interfaceRealization__umlClass____implementingClassifier);
		cd2c__umlClass____target.setSrc(cd2c);
		cd2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c__umlClass____target);
		cd2c2__superInterface____target.setSrc(cd2c2);
		cd2c2__superInterface____target.setTrg(superInterface);
		isApplicableMatch.getAllContextElements().add(cd2c2__superInterface____target);
		cd2c2__superInterfaceDec____source.setSrc(cd2c2);
		cd2c2__superInterfaceDec____source.setTrg(superInterfaceDec);
		isApplicableMatch.getAllContextElements().add(cd2c2__superInterfaceDec____source);
		cd2c__classDec____source.setSrc(cd2c);
		cd2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c__classDec____source);
		interfaceRealization__superInterface____contract.setSrc(interfaceRealization);
		interfaceRealization__superInterface____contract.setTrg(superInterface);
		isApplicableMatch.getAllContextElements().add(interfaceRealization__superInterface____contract);
		umlClass__interfaceRealization____interfaceRealization
				.setName(umlClass__interfaceRealization____interfaceRealization_name_prime);
		interfaceRealization__umlClass____implementingClassifier
				.setName(interfaceRealization__umlClass____implementingClassifier_name_prime);
		cd2c__umlClass____target.setName(cd2c__umlClass____target_name_prime);
		cd2c2__superInterface____target.setName(cd2c2__superInterface____target_name_prime);
		cd2c2__superInterfaceDec____source.setName(cd2c2__superInterfaceDec____source_name_prime);
		cd2c__classDec____source.setName(cd2c__classDec____source_name_prime);
		interfaceRealization__superInterface____contract
				.setName(interfaceRealization__superInterface____contract_name_prime);
		return new Object[] { interfaceRealization, superInterfaceDec, superInterface, classDec, umlClass, cd2c, cd2c2,
				isApplicableMatch, umlClass__interfaceRealization____interfaceRealization,
				interfaceRealization__umlClass____implementingClassifier, cd2c__umlClass____target,
				cd2c2__superInterface____target, cd2c2__superInterfaceDec____source, cd2c__classDec____source,
				interfaceRealization__superInterface____contract };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch,
			InterfaceRealization interfaceRealization, InterfaceDeclaration superInterfaceDec, Interface superInterface,
			ClassDeclaration classDec, BehavioredClassifier umlClass, ASTNode2Element cd2c, ASTNode2Element cd2c2) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, interfaceRealization,
				superInterfaceDec, superInterface, classDec, umlClass, cd2c, cd2c2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, interfaceRealization, superInterfaceDec,
					superInterface, classDec, umlClass, cd2c, cd2c2 };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch,
			InterfaceRealization interfaceRealization, InterfaceDeclaration superInterfaceDec, Interface superInterface,
			ClassDeclaration classDec, BehavioredClassifier umlClass, ASTNode2Element cd2c, ASTNode2Element cd2c2) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_binding = pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, interfaceRealization, superInterfaceDec, superInterface, classDec, umlClass,
				cd2c, cd2c2);
		if (result_pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_black = pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, interfaceRealization, superInterfaceDec,
						superInterface, classDec, umlClass, cd2c, cd2c2 };
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
		for (NamedElement __DEC_interfaceRealization_client_544354 : interfaceRealization.getClients()) {
			if (!interfaceRealization.equals(__DEC_interfaceRealization_client_544354)) {
				if (!superInterface.equals(__DEC_interfaceRealization_client_544354)) {
					if (!umlClass.equals(__DEC_interfaceRealization_client_544354)) {
						return new Object[] { interfaceRealization, superInterface, umlClass };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_20_2_testcorematchandDECs_black_nac_1BBB(
			InterfaceRealization interfaceRealization, Interface superInterface, BehavioredClassifier umlClass) {
		for (NamedElement __DEC_interfaceRealization_supplier_217288 : interfaceRealization.getSuppliers()) {
			if (!interfaceRealization.equals(__DEC_interfaceRealization_supplier_217288)) {
				if (!superInterface.equals(__DEC_interfaceRealization_supplier_217288)) {
					if (!umlClass.equals(__DEC_interfaceRealization_supplier_217288)) {
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
												_result.add(new Object[] { interfaceRealization, superInterface,
														umlClass, _edge_interfaceRealization });
											}
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
			TypeAccess2InterfaceRealization _this, Match match, InterfaceRealization interfaceRealization,
			Interface superInterface, BehavioredClassifier umlClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, interfaceRealization, superInterface, umlClass);
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
		for (Annotation __DEC_typeAcc_type_821430 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, Annotation.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess typeAcc) {
		for (ArrayType __DEC_typeAcc_elementType_850730 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ArrayType.class, "elementType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_2BB(
			TypeAccess typeAcc, ClassDeclaration classDec) {
		for (ClassDeclaration __DEC_typeAcc_superClass_223802 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ClassDeclaration.class, "superClass")) {
			if (!classDec.equals(__DEC_typeAcc_superClass_223802)) {
				return new Object[] { typeAcc, classDec };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess typeAcc) {
		for (MethodDeclaration __DEC_typeAcc_returnType_254925 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_4B(
			TypeAccess typeAcc) {
		for (ParameterizedType __DEC_typeAcc_type_186889 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ParameterizedType.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess typeAcc) {
		for (SingleVariableDeclaration __DEC_typeAcc_type_453298 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess typeAcc) {
		for (AnnotationMemberValuePair __DEC_typeAcc_value_247158 : org.moflon.core.utilities.eMoflonEMFUtil
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
														_result.add(new Object[] { superInterfaceDec, classDec, typeAcc,
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
			TypeAccess2InterfaceRealization _this, Match match, InterfaceDeclaration superInterfaceDec,
			ClassDeclaration classDec, TypeAccess typeAcc) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, superInterfaceDec, classDec, typeAcc);
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
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("interfaceRealization");
		EObject _localVariable_1 = sourceMatch.getObject("superInterfaceDec");
		EObject _localVariable_2 = targetMatch.getObject("superInterface");
		EObject _localVariable_3 = sourceMatch.getObject("classDec");
		EObject _localVariable_4 = sourceMatch.getObject("typeAcc");
		EObject _localVariable_5 = targetMatch.getObject("umlClass");
		EObject tmpInterfaceRealization = _localVariable_0;
		EObject tmpSuperInterfaceDec = _localVariable_1;
		EObject tmpSuperInterface = _localVariable_2;
		EObject tmpClassDec = _localVariable_3;
		EObject tmpTypeAcc = _localVariable_4;
		EObject tmpUmlClass = _localVariable_5;
		if (tmpInterfaceRealization instanceof InterfaceRealization) {
			InterfaceRealization interfaceRealization = (InterfaceRealization) tmpInterfaceRealization;
			if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
				InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
				if (tmpSuperInterface instanceof Interface) {
					Interface superInterface = (Interface) tmpSuperInterface;
					if (tmpClassDec instanceof ClassDeclaration) {
						ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
						if (tmpTypeAcc instanceof TypeAccess) {
							TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
							if (tmpUmlClass instanceof BehavioredClassifier) {
								BehavioredClassifier umlClass = (BehavioredClassifier) tmpUmlClass;
								return new Object[] { interfaceRealization, superInterfaceDec, superInterface, classDec,
										typeAcc, umlClass, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_blackBBBBBBBB(
			InterfaceRealization interfaceRealization, InterfaceDeclaration superInterfaceDec, Interface superInterface,
			ClassDeclaration classDec, TypeAccess typeAcc, BehavioredClassifier umlClass, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { interfaceRealization, superInterfaceDec, superInterface, classDec, typeAcc, umlClass,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding = pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding != null) {
			InterfaceRealization interfaceRealization = (InterfaceRealization) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[0];
			InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[1];
			Interface superInterface = (Interface) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[2];
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[3];
			TypeAccess typeAcc = (TypeAccess) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[4];
			BehavioredClassifier umlClass = (BehavioredClassifier) result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_black = pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_blackBBBBBBBB(
					interfaceRealization, superInterfaceDec, superInterface, classDec, typeAcc, umlClass, sourceMatch,
					targetMatch);
			if (result_pattern_TypeAccess2InterfaceRealization_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { interfaceRealization, superInterfaceDec, superInterface, classDec, typeAcc,
						umlClass, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_bindingFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, InterfaceRealization interfaceRealization,
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ClassDeclaration classDec,
			TypeAccess typeAcc, BehavioredClassifier umlClass, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(interfaceRealization, superInterfaceDec, superInterface,
				classDec, typeAcc, umlClass, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, interfaceRealization, superInterfaceDec, superInterface, classDec,
					typeAcc, umlClass, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, InterfaceRealization interfaceRealization,
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ClassDeclaration classDec,
			TypeAccess typeAcc, BehavioredClassifier umlClass, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_binding = pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, interfaceRealization, superInterfaceDec, superInterface, classDec, typeAcc, umlClass,
				sourceMatch, targetMatch);
		if (result_pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_black = pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, interfaceRealization, superInterfaceDec, superInterface, classDec,
						typeAcc, umlClass, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2InterfaceRealization_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2InterfaceRealization_24_5_matchcorrcontext_blackBBBBFFBB(
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ClassDeclaration classDec,
			BehavioredClassifier umlClass, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element cd2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(umlClass,
					ASTNode2Element.class, "target")) {
				if (classDec.equals(cd2c.getSource())) {
					for (ASTNode2Element cd2c2 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(superInterface, ASTNode2Element.class, "target")) {
						if (!cd2c.equals(cd2c2)) {
							if (superInterfaceDec.equals(cd2c2.getSource())) {
								_result.add(new Object[] { superInterfaceDec, superInterface, classDec, umlClass, cd2c,
										cd2c2, sourceMatch, targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_5_matchcorrcontext_greenBBBBF(
			ASTNode2Element cd2c, ASTNode2Element cd2c2, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "TypeAccess2InterfaceRealization";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(cd2c);
		ccMatch.getAllContextElements().add(cd2c2);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { cd2c, cd2c2, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_6_createcorrespondence_blackBBBBBBB(
			InterfaceRealization interfaceRealization, InterfaceDeclaration superInterfaceDec, Interface superInterface,
			ClassDeclaration classDec, TypeAccess typeAcc, BehavioredClassifier umlClass, CCMatch ccMatch) {
		return new Object[] { interfaceRealization, superInterfaceDec, superInterface, classDec, typeAcc, umlClass,
				ccMatch };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_24_6_createcorrespondence_greenBBFB(
			InterfaceRealization interfaceRealization, TypeAccess typeAcc, CCMatch ccMatch) {
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2InterfaceRealization();
		ta2g.setSource(typeAcc);
		ta2g.setTarget(interfaceRealization);
		ccMatch.getCreateCorr().add(ta2g);
		return new Object[] { interfaceRealization, typeAcc, ta2g, ccMatch };
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
		for (Annotation __DEC_typeAcc_type_225918 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, Annotation.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_1B(
			TypeAccess typeAcc) {
		for (ArrayType __DEC_typeAcc_elementType_70883 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ArrayType.class, "elementType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_2BB(
			TypeAccess typeAcc, ClassDeclaration classDec) {
		for (ClassDeclaration __DEC_typeAcc_superClass_787483 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ClassDeclaration.class, "superClass")) {
			if (!classDec.equals(__DEC_typeAcc_superClass_787483)) {
				return new Object[] { typeAcc, classDec };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_3B(
			TypeAccess typeAcc) {
		for (MethodDeclaration __DEC_typeAcc_returnType_810762 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_4B(
			TypeAccess typeAcc) {
		for (ParameterizedType __DEC_typeAcc_type_311840 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ParameterizedType.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_5B(
			TypeAccess typeAcc) {
		for (SingleVariableDeclaration __DEC_typeAcc_type_956007 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_27_1_matchtggpattern_black_nac_6B(
			TypeAccess typeAcc) {
		for (AnnotationMemberValuePair __DEC_typeAcc_value_180069 : org.moflon.core.utilities.eMoflonEMFUtil
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
			InterfaceDeclaration superInterfaceDec, ClassDeclaration classDec, TypeAccess typeAcc) {
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
												return new Object[] { superInterfaceDec, classDec, typeAcc };
											}
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
		for (NamedElement __DEC_interfaceRealization_client_862864 : interfaceRealization.getClients()) {
			if (!interfaceRealization.equals(__DEC_interfaceRealization_client_862864)) {
				if (!superInterface.equals(__DEC_interfaceRealization_client_862864)) {
					if (!umlClass.equals(__DEC_interfaceRealization_client_862864)) {
						return new Object[] { interfaceRealization, superInterface, umlClass };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_28_1_matchtggpattern_black_nac_1BBB(
			InterfaceRealization interfaceRealization, Interface superInterface, BehavioredClassifier umlClass) {
		for (NamedElement __DEC_interfaceRealization_supplier_88390 : interfaceRealization.getSuppliers()) {
			if (!interfaceRealization.equals(__DEC_interfaceRealization_supplier_88390)) {
				if (!superInterface.equals(__DEC_interfaceRealization_supplier_88390)) {
					if (!umlClass.equals(__DEC_interfaceRealization_supplier_88390)) {
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
			InterfaceRealization interfaceRealization, Interface superInterface, BehavioredClassifier umlClass) {
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
										return new Object[] { interfaceRealization, superInterface, umlClass };
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
			ModelgeneratorRuleResult ruleResult, InterfaceDeclaration superInterfaceDec) {
		if (ruleResult.getSourceObjects().contains(superInterfaceDec)) {
			return new Object[] { ruleResult, superInterfaceDec };
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
			ModelgeneratorRuleResult ruleResult, Interface superInterface) {
		if (ruleResult.getTargetObjects().contains(superInterface)) {
			return new Object[] { ruleResult, superInterface };
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
							ASTNode tmpSuperInterfaceDec = cd2c2.getSource();
							if (tmpSuperInterfaceDec instanceof InterfaceDeclaration) {
								InterfaceDeclaration superInterfaceDec = (InterfaceDeclaration) tmpSuperInterfaceDec;
								Element tmpSuperInterface = cd2c2.getTarget();
								if (tmpSuperInterface instanceof Interface) {
									Interface superInterface = (Interface) tmpSuperInterface;
									if (pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, cd2c2) == null) {
										if (pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, superInterfaceDec) == null) {
											if (pattern_TypeAccess2InterfaceRealization_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, superInterface) == null) {
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
																						superInterfaceDec, cd2c2,
																						superInterface, cd2cList,
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
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch,
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ClassDeclaration classDec,
			BehavioredClassifier umlClass, ASTNode2Element cd2c, ASTNode2Element cd2c2,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, superInterfaceDec, superInterface,
				classDec, umlClass, cd2c, cd2c2, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, superInterfaceDec, superInterface, classDec, umlClass,
					cd2c, cd2c2, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2InterfaceRealization _this, IsApplicableMatch isApplicableMatch,
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ClassDeclaration classDec,
			BehavioredClassifier umlClass, ASTNode2Element cd2c, ASTNode2Element cd2c2,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_binding = pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, superInterfaceDec, superInterface, classDec, umlClass, cd2c, cd2c2,
				ruleResult);
		if (result_pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_black = pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2InterfaceRealization_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, superInterfaceDec, superInterface, classDec,
						umlClass, cd2c, cd2c2, ruleResult };
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
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ClassDeclaration classDec,
			BehavioredClassifier umlClass, ASTNode2Element cd2c, ASTNode2Element cd2c2) {
		if (!cd2c.equals(cd2c2)) {
			return new Object[] { superInterfaceDec, superInterface, classDec, umlClass, cd2c, cd2c2 };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_6_perform_blackBBBBBBB(
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ClassDeclaration classDec,
			BehavioredClassifier umlClass, ASTNode2Element cd2c, ASTNode2Element cd2c2,
			ModelgeneratorRuleResult ruleResult) {
		if (!cd2c.equals(cd2c2)) {
			return new Object[] { superInterfaceDec, superInterface, classDec, umlClass, cd2c, cd2c2, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2InterfaceRealization_29_6_perform_greenFBBBFBFB(
			InterfaceDeclaration superInterfaceDec, Interface superInterface, ClassDeclaration classDec,
			BehavioredClassifier umlClass, ModelgeneratorRuleResult ruleResult) {
		InterfaceRealization interfaceRealization = UMLFactory.eINSTANCE.createInterfaceRealization();
		TypeAccess typeAcc = JavaFactory.eINSTANCE.createTypeAccess();
		org.gravity.tgg.modisco.uml.TypeAccess2InterfaceRealization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2InterfaceRealization();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		umlClass.getInterfaceRealizations().add(interfaceRealization);
		interfaceRealization.setContract(superInterface);
		ruleResult.getTargetObjects().add(interfaceRealization);
		classDec.getSuperInterfaces().add(typeAcc);
		typeAcc.setType(superInterfaceDec);
		ruleResult.getSourceObjects().add(typeAcc);
		ta2g.setSource(typeAcc);
		ta2g.setTarget(interfaceRealization);
		ruleResult.getCorrObjects().add(ta2g);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { interfaceRealization, superInterfaceDec, superInterface, classDec, typeAcc, umlClass,
				ta2g, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_TypeAccess2InterfaceRealization_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypeAccess2InterfaceRealizationImpl
