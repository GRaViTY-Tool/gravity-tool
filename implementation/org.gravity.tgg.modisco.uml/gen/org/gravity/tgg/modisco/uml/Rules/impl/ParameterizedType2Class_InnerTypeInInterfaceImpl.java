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
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage;

import org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Class_InnerTypeInInterface;
import org.gravity.tgg.modisco.uml.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Parameterized Type2 Class Inner Type In Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParameterizedType2Class_InnerTypeInInterfaceImpl extends AbstractRuleImpl
		implements ParameterizedType2Class_InnerTypeInInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedType2Class_InnerTypeInInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParameterizedType2Class_InnerTypeInInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AbstractTypeDeclaration jContainer,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, TypeAccess typeTypeAccess) {

		Object[] result1_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_0_1_initialbindings_blackBBBBBBB(this, match,
						jContainer, nonParamType, nonParamPackage, parameterizedType, typeTypeAccess);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jContainer] = " + jContainer + ", " + "[nonParamType] = "
					+ nonParamType + ", " + "[nonParamPackage] = " + nonParamPackage + ", " + "[parameterizedType] = "
					+ parameterizedType + ", " + "[typeTypeAccess] = " + typeTypeAccess + ".");
		}

		Object[] result2_bindingAndBlack = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match,
						jContainer, nonParamType, nonParamPackage, parameterizedType, typeTypeAccess);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jContainer] = " + jContainer + ", " + "[nonParamType] = "
					+ nonParamType + ", " + "[nonParamPackage] = " + nonParamPackage + ", " + "[parameterizedType] = "
					+ parameterizedType + ", " + "[typeTypeAccess] = " + typeTypeAccess + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_0_4_collectelementstobetranslated_blackBBBBBB(
							match, jContainer, nonParamType, nonParamPackage, parameterizedType, typeTypeAccess);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jContainer] = " + jContainer + ", " + "[nonParamType] = " + nonParamType + ", "
						+ "[nonParamPackage] = " + nonParamPackage + ", " + "[parameterizedType] = " + parameterizedType
						+ ", " + "[typeTypeAccess] = " + typeTypeAccess + ".");
			}
			ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_0_4_collectelementstobetranslated_greenBBBBFFF(
							match, nonParamType, parameterizedType, typeTypeAccess);
			//nothing EMoflonEdge parameterizedType__typeTypeAccess____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge typeTypeAccess__nonParamType____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge nonParamType__typeTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[6];

			Object[] result5_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_0_5_collectcontextelements_blackBBBBBB(match,
							jContainer, nonParamType, nonParamPackage, parameterizedType, typeTypeAccess);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jContainer] = " + jContainer + ", " + "[nonParamType] = " + nonParamType + ", "
						+ "[nonParamPackage] = " + nonParamPackage + ", " + "[parameterizedType] = " + parameterizedType
						+ ", " + "[typeTypeAccess] = " + typeTypeAccess + ".");
			}
			ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_0_5_collectcontextelements_greenBBBBFFFF(
							match, jContainer, nonParamType, nonParamPackage);
			//nothing EMoflonEdge nonParamPackage__jContainer____ownedElements = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge jContainer__nonParamPackage____package = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge jContainer__nonParamType____bodyDeclarations = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge nonParamType__jContainer____abstractTypeDeclaration = (EMoflonEdge) result5_green[7];

			// 
			ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_0_6_registerobjectstomatch_expressionBBBBBBB(
							this, match, jContainer, nonParamType, nonParamPackage, parameterizedType, typeTypeAccess);
			return ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_0_7_expressionF();
		} else {
			return ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[0];
		ASTNode2Element ne2neNonParam = (ASTNode2Element) result1_bindingAndBlack[1];
		Interface uContainer = (Interface) result1_bindingAndBlack[2];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result1_bindingAndBlack[3];
		AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[5];
		ParameterizedType parameterizedType = (ParameterizedType) result1_bindingAndBlack[6];
		JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result1_bindingAndBlack[7];
		TypeAccess typeTypeAccess = (TypeAccess) result1_bindingAndBlack[8];
		org.eclipse.uml2.uml.Class nonParamElement = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[9];
		ASTNode2Element c2c = (ASTNode2Element) result1_bindingAndBlack[10];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_greenBBFFB(umlPackage,
						parameterizedType, csp);
		ASTNode2Element ne2ne = (ASTNode2Element) result1_green[2];
		org.eclipse.uml2.uml.Class parameterizedClassifier = (org.eclipse.uml2.uml.Class) result1_green[3];

		Object[] result2_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_1_2_collecttranslatedelements_blackBBBB(
						parameterizedType, ne2ne, typeTypeAccess, parameterizedClassifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[parameterizedType] = "
					+ parameterizedType + ", " + "[ne2ne] = " + ne2ne + ", " + "[typeTypeAccess] = " + typeTypeAccess
					+ ", " + "[parameterizedClassifier] = " + parameterizedClassifier + ".");
		}
		Object[] result2_green = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_1_2_collecttranslatedelements_greenFBBBB(
						parameterizedType, ne2ne, typeTypeAccess, parameterizedClassifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
						ruleresult, umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType, nonParamPackage,
						parameterizedType, jp2up, ne2ne, typeTypeAccess, nonParamElement, c2c, parameterizedClassifier);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[umlPackage] = " + umlPackage + ", " + "[ne2neNonParam] = " + ne2neNonParam + ", "
					+ "[uContainer] = " + uContainer + ", " + "[jContainer] = " + jContainer + ", "
					+ "[nonParamType] = " + nonParamType + ", " + "[nonParamPackage] = " + nonParamPackage + ", "
					+ "[parameterizedType] = " + parameterizedType + ", " + "[jp2up] = " + jp2up + ", " + "[ne2ne] = "
					+ ne2ne + ", " + "[typeTypeAccess] = " + typeTypeAccess + ", " + "[nonParamElement] = "
					+ nonParamElement + ", " + "[c2c] = " + c2c + ", " + "[parameterizedClassifier] = "
					+ parameterizedClassifier + ".");
		}
		ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
						ruleresult, umlPackage, nonParamType, parameterizedType, ne2ne, typeTypeAccess,
						parameterizedClassifier);
		//nothing EMoflonEdge ne2ne__parameterizedType____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge parameterizedType__typeTypeAccess____type = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge umlPackage__parameterizedClassifier____packagedElement = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge ne2ne__parameterizedClassifier____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge typeTypeAccess__nonParamType____type = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge nonParamType__typeTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[12];

		// 
		// 
		ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_1_5_registerobjects_expressionBBBBBBBBBBBBBBB(
						this, ruleresult, umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType,
						nonParamPackage, parameterizedType, jp2up, ne2ne, typeTypeAccess, nonParamElement, c2c,
						parameterizedClassifier);
		return ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_binding[0];
		AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result2_binding[1];
		org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result2_binding[2];
		ParameterizedType parameterizedType = (ParameterizedType) result2_binding[3];
		TypeAccess typeTypeAccess = (TypeAccess) result2_binding[4];
		for (Object[] result2_black : ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_2_2_corematch_blackFFFBBBBFBFFB(jContainer,
						nonParamType, nonParamPackage, parameterizedType, typeTypeAccess, match)) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_black[0];
			ASTNode2Element ne2neNonParam = (ASTNode2Element) result2_black[1];
			Interface uContainer = (Interface) result2_black[2];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result2_black[7];
			org.eclipse.uml2.uml.Class nonParamElement = (org.eclipse.uml2.uml.Class) result2_black[9];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[10];
			// ForEach 
			for (Object[] result3_black : ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_2_3_findcontext_blackBBBBBBBBBBB(umlPackage,
							ne2neNonParam, uContainer, jContainer, nonParamType, nonParamPackage, parameterizedType,
							jp2up, typeTypeAccess, nonParamElement, c2c)) {
				Object[] result3_green = ParameterizedType2Class_InnerTypeInInterfaceImpl
						.pattern_ParameterizedType2Class_InnerTypeInInterface_2_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(
								umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType, nonParamPackage,
								parameterizedType, jp2up, typeTypeAccess, nonParamElement, c2c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				//nothing EMoflonEdge ne2neNonParam__nonParamType____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge nonParamPackage__jContainer____ownedElements = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge jContainer__nonParamPackage____package = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge parameterizedType__typeTypeAccess____type = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge jp2up__umlPackage____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge uContainer__nonParamElement____nestedClassifier = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge jContainer__nonParamType____bodyDeclarations = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge nonParamType__jContainer____abstractTypeDeclaration = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge umlPackage__uContainer____packagedElement = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge c2c__uContainer____target = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge ne2neNonParam__nonParamElement____target = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge c2c__jContainer____source = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge jp2up__nonParamPackage____source = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge typeTypeAccess__nonParamType____type = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge nonParamType__typeTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[26];

				Object[] result4_bindingAndBlack = ParameterizedType2Class_InnerTypeInInterfaceImpl
						.pattern_ParameterizedType2Class_InnerTypeInInterface_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(
								this, isApplicableMatch, umlPackage, ne2neNonParam, uContainer, jContainer,
								nonParamType, nonParamPackage, parameterizedType, jp2up, typeTypeAccess,
								nonParamElement, c2c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[umlPackage] = " + umlPackage
							+ ", " + "[ne2neNonParam] = " + ne2neNonParam + ", " + "[uContainer] = " + uContainer + ", "
							+ "[jContainer] = " + jContainer + ", " + "[nonParamType] = " + nonParamType + ", "
							+ "[nonParamPackage] = " + nonParamPackage + ", " + "[parameterizedType] = "
							+ parameterizedType + ", " + "[jp2up] = " + jp2up + ", " + "[typeTypeAccess] = "
							+ typeTypeAccess + ", " + "[nonParamElement] = " + nonParamElement + ", " + "[c2c] = " + c2c
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ParameterizedType2Class_InnerTypeInInterfaceImpl
						.pattern_ParameterizedType2Class_InnerTypeInInterface_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
							.pattern_ParameterizedType2Class_InnerTypeInInterface_2_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ParameterizedType2Class_InnerTypeInInterfaceImpl
							.pattern_ParameterizedType2Class_InnerTypeInInterface_2_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AbstractTypeDeclaration jContainer,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, TypeAccess typeTypeAccess) {
		match.registerObject("jContainer", jContainer);
		match.registerObject("nonParamType", nonParamType);
		match.registerObject("nonParamPackage", nonParamPackage);
		match.registerObject("parameterizedType", parameterizedType);
		match.registerObject("typeTypeAccess", typeTypeAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AbstractTypeDeclaration jContainer,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, TypeAccess typeTypeAccess) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Package umlPackage,
			ASTNode2Element ne2neNonParam, Interface uContainer, AbstractTypeDeclaration jContainer,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, JavaPackage2UmlPackage jp2up, TypeAccess typeTypeAccess,
			org.eclipse.uml2.uml.Class nonParamElement, ASTNode2Element c2c) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_parameterizedType_name = CSPFactoryHelper.eINSTANCE.createVariable("parameterizedType.name", true,
				csp);
		var_parameterizedType_name.setValue(parameterizedType.getName());
		var_parameterizedType_name.setType("String");
		Variable var_nonParamElement_name = CSPFactoryHelper.eINSTANCE.createVariable("nonParamElement.name", true,
				csp);
		var_nonParamElement_name.setValue(nonParamElement.getName());
		var_nonParamElement_name.setType("String");

		// Create unbound variables
		Variable var_parameterizedClassifier_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parameterizedClassifier.name", csp);
		var_parameterizedClassifier_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		ParameterizedNameFitsNonParameterizedName parameterizedNameFitsNonParameterizedName = new ParameterizedNameFitsNonParameterizedName();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(parameterizedNameFitsNonParameterizedName);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_parameterizedType_name, var_parameterizedClassifier_name);
		parameterizedNameFitsNonParameterizedName.setRuleName("NoRuleName");
		parameterizedNameFitsNonParameterizedName.solve(var_parameterizedClassifier_name, var_nonParamElement_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("umlPackage", umlPackage);
		isApplicableMatch.registerObject("ne2neNonParam", ne2neNonParam);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("nonParamType", nonParamType);
		isApplicableMatch.registerObject("nonParamPackage", nonParamPackage);
		isApplicableMatch.registerObject("parameterizedType", parameterizedType);
		isApplicableMatch.registerObject("jp2up", jp2up);
		isApplicableMatch.registerObject("typeTypeAccess", typeTypeAccess);
		isApplicableMatch.registerObject("nonParamElement", nonParamElement);
		isApplicableMatch.registerObject("c2c", c2c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject umlPackage, EObject ne2neNonParam,
			EObject uContainer, EObject jContainer, EObject nonParamType, EObject nonParamPackage,
			EObject parameterizedType, EObject jp2up, EObject ne2ne, EObject typeTypeAccess, EObject nonParamElement,
			EObject c2c, EObject parameterizedClassifier) {
		ruleresult.registerObject("umlPackage", umlPackage);
		ruleresult.registerObject("ne2neNonParam", ne2neNonParam);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("nonParamType", nonParamType);
		ruleresult.registerObject("nonParamPackage", nonParamPackage);
		ruleresult.registerObject("parameterizedType", parameterizedType);
		ruleresult.registerObject("jp2up", jp2up);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("typeTypeAccess", typeTypeAccess);
		ruleresult.registerObject("nonParamElement", nonParamElement);
		ruleresult.registerObject("c2c", c2c);
		ruleresult.registerObject("parameterizedClassifier", parameterizedClassifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("parameterizedType").eClass())
						.equals("java.ParameterizedType.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("typeTypeAccess").eClass())
						.equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Package umlPackage, Interface uContainer,
			org.eclipse.uml2.uml.Class nonParamElement, org.eclipse.uml2.uml.Class parameterizedClassifier) {

		Object[] result1_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_10_1_initialbindings_blackBBBBBB(this, match,
						umlPackage, uContainer, nonParamElement, parameterizedClassifier);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[umlPackage] = " + umlPackage + ", " + "[uContainer] = "
					+ uContainer + ", " + "[nonParamElement] = " + nonParamElement + ", "
					+ "[parameterizedClassifier] = " + parameterizedClassifier + ".");
		}

		Object[] result2_bindingAndBlack = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match,
						umlPackage, uContainer, nonParamElement, parameterizedClassifier);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[umlPackage] = " + umlPackage + ", " + "[uContainer] = "
					+ uContainer + ", " + "[nonParamElement] = " + nonParamElement + ", "
					+ "[parameterizedClassifier] = " + parameterizedClassifier + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_10_4_collectelementstobetranslated_blackBBBBB(
							match, umlPackage, uContainer, nonParamElement, parameterizedClassifier);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[umlPackage] = " + umlPackage + ", " + "[uContainer] = " + uContainer + ", "
						+ "[nonParamElement] = " + nonParamElement + ", " + "[parameterizedClassifier] = "
						+ parameterizedClassifier + ".");
			}
			ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_10_4_collectelementstobetranslated_greenBBBF(
							match, umlPackage, parameterizedClassifier);
			//nothing EMoflonEdge umlPackage__parameterizedClassifier____packagedElement = (EMoflonEdge) result4_green[3];

			Object[] result5_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_10_5_collectcontextelements_blackBBBBB(match,
							umlPackage, uContainer, nonParamElement, parameterizedClassifier);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[umlPackage] = " + umlPackage + ", " + "[uContainer] = " + uContainer + ", "
						+ "[nonParamElement] = " + nonParamElement + ", " + "[parameterizedClassifier] = "
						+ parameterizedClassifier + ".");
			}
			ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_10_5_collectcontextelements_greenBBBBFF(match,
							umlPackage, uContainer, nonParamElement);
			//nothing EMoflonEdge uContainer__nonParamElement____nestedClassifier = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge umlPackage__uContainer____packagedElement = (EMoflonEdge) result5_green[5];

			// 
			ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_10_6_registerobjectstomatch_expressionBBBBBB(
							this, match, umlPackage, uContainer, nonParamElement, parameterizedClassifier);
			return ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_10_7_expressionF();
		} else {
			return ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[0];
		ASTNode2Element ne2neNonParam = (ASTNode2Element) result1_bindingAndBlack[1];
		Interface uContainer = (Interface) result1_bindingAndBlack[2];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result1_bindingAndBlack[3];
		AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[5];
		JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result1_bindingAndBlack[6];
		org.eclipse.uml2.uml.Class nonParamElement = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[7];
		ASTNode2Element c2c = (ASTNode2Element) result1_bindingAndBlack[8];
		org.eclipse.uml2.uml.Class parameterizedClassifier = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_greenBFFFBB(
						nonParamType, parameterizedClassifier, csp);
		ParameterizedType parameterizedType = (ParameterizedType) result1_green[1];
		ASTNode2Element ne2ne = (ASTNode2Element) result1_green[2];
		TypeAccess typeTypeAccess = (TypeAccess) result1_green[3];

		Object[] result2_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_11_2_collecttranslatedelements_blackBBBB(
						parameterizedType, ne2ne, typeTypeAccess, parameterizedClassifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[parameterizedType] = "
					+ parameterizedType + ", " + "[ne2ne] = " + ne2ne + ", " + "[typeTypeAccess] = " + typeTypeAccess
					+ ", " + "[parameterizedClassifier] = " + parameterizedClassifier + ".");
		}
		Object[] result2_green = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_11_2_collecttranslatedelements_greenFBBBB(
						parameterizedType, ne2ne, typeTypeAccess, parameterizedClassifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
						ruleresult, umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType, nonParamPackage,
						parameterizedType, jp2up, ne2ne, typeTypeAccess, nonParamElement, c2c, parameterizedClassifier);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[umlPackage] = " + umlPackage + ", " + "[ne2neNonParam] = " + ne2neNonParam + ", "
					+ "[uContainer] = " + uContainer + ", " + "[jContainer] = " + jContainer + ", "
					+ "[nonParamType] = " + nonParamType + ", " + "[nonParamPackage] = " + nonParamPackage + ", "
					+ "[parameterizedType] = " + parameterizedType + ", " + "[jp2up] = " + jp2up + ", " + "[ne2ne] = "
					+ ne2ne + ", " + "[typeTypeAccess] = " + typeTypeAccess + ", " + "[nonParamElement] = "
					+ nonParamElement + ", " + "[c2c] = " + c2c + ", " + "[parameterizedClassifier] = "
					+ parameterizedClassifier + ".");
		}
		ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
						ruleresult, umlPackage, nonParamType, parameterizedType, ne2ne, typeTypeAccess,
						parameterizedClassifier);
		//nothing EMoflonEdge ne2ne__parameterizedType____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge parameterizedType__typeTypeAccess____type = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge umlPackage__parameterizedClassifier____packagedElement = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge ne2ne__parameterizedClassifier____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge typeTypeAccess__nonParamType____type = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge nonParamType__typeTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[12];

		// 
		// 
		ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_11_5_registerobjects_expressionBBBBBBBBBBBBBBB(
						this, ruleresult, umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType,
						nonParamPackage, parameterizedType, jp2up, ne2ne, typeTypeAccess, nonParamElement, c2c,
						parameterizedClassifier);
		return ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_binding[0];
		Interface uContainer = (Interface) result2_binding[1];
		org.eclipse.uml2.uml.Class nonParamElement = (org.eclipse.uml2.uml.Class) result2_binding[2];
		org.eclipse.uml2.uml.Class parameterizedClassifier = (org.eclipse.uml2.uml.Class) result2_binding[3];
		for (Object[] result2_black : ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_12_2_corematch_blackBFBFFFFBFBB(umlPackage,
						uContainer, nonParamElement, parameterizedClassifier, match)) {
			ASTNode2Element ne2neNonParam = (ASTNode2Element) result2_black[1];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_black[3];
			AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result2_black[4];
			org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result2_black[5];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result2_black[6];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[8];
			// ForEach 
			for (Object[] result3_black : ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_12_3_findcontext_blackBBBBBBBBBB(umlPackage,
							ne2neNonParam, uContainer, jContainer, nonParamType, nonParamPackage, jp2up,
							nonParamElement, c2c, parameterizedClassifier)) {
				Object[] result3_green = ParameterizedType2Class_InnerTypeInInterfaceImpl
						.pattern_ParameterizedType2Class_InnerTypeInInterface_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFF(
								umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType, nonParamPackage, jp2up,
								nonParamElement, c2c, parameterizedClassifier);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge ne2neNonParam__nonParamType____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge nonParamPackage__jContainer____ownedElements = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge jContainer__nonParamPackage____package = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge jp2up__umlPackage____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge uContainer__nonParamElement____nestedClassifier = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge umlPackage__parameterizedClassifier____packagedElement = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge jContainer__nonParamType____bodyDeclarations = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge nonParamType__jContainer____abstractTypeDeclaration = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge umlPackage__uContainer____packagedElement = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge c2c__uContainer____target = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge ne2neNonParam__nonParamElement____target = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge c2c__jContainer____source = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge jp2up__nonParamPackage____source = (EMoflonEdge) result3_green[23];

				Object[] result4_bindingAndBlack = ParameterizedType2Class_InnerTypeInInterfaceImpl
						.pattern_ParameterizedType2Class_InnerTypeInInterface_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
								this, isApplicableMatch, umlPackage, ne2neNonParam, uContainer, jContainer,
								nonParamType, nonParamPackage, jp2up, nonParamElement, c2c, parameterizedClassifier);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[umlPackage] = " + umlPackage
							+ ", " + "[ne2neNonParam] = " + ne2neNonParam + ", " + "[uContainer] = " + uContainer + ", "
							+ "[jContainer] = " + jContainer + ", " + "[nonParamType] = " + nonParamType + ", "
							+ "[nonParamPackage] = " + nonParamPackage + ", " + "[jp2up] = " + jp2up + ", "
							+ "[nonParamElement] = " + nonParamElement + ", " + "[c2c] = " + c2c + ", "
							+ "[parameterizedClassifier] = " + parameterizedClassifier + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ParameterizedType2Class_InnerTypeInInterfaceImpl
						.pattern_ParameterizedType2Class_InnerTypeInInterface_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
							.pattern_ParameterizedType2Class_InnerTypeInInterface_12_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ParameterizedType2Class_InnerTypeInInterfaceImpl
							.pattern_ParameterizedType2Class_InnerTypeInInterface_12_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Package umlPackage, Interface uContainer,
			org.eclipse.uml2.uml.Class nonParamElement, org.eclipse.uml2.uml.Class parameterizedClassifier) {
		match.registerObject("umlPackage", umlPackage);
		match.registerObject("uContainer", uContainer);
		match.registerObject("nonParamElement", nonParamElement);
		match.registerObject("parameterizedClassifier", parameterizedClassifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Package umlPackage, Interface uContainer,
			org.eclipse.uml2.uml.Class nonParamElement, org.eclipse.uml2.uml.Class parameterizedClassifier) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_parameterizedClassifier_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parameterizedClassifier.name", true, csp);
		var_parameterizedClassifier_name.setValue(parameterizedClassifier.getName());
		var_parameterizedClassifier_name.setType("String");
		Variable var_nonParamElement_name = CSPFactoryHelper.eINSTANCE.createVariable("nonParamElement.name", true,
				csp);
		var_nonParamElement_name.setValue(nonParamElement.getName());
		var_nonParamElement_name.setType("String");

		// Create unbound variables

		// Create constraints
		ParameterizedNameFitsNonParameterizedName parameterizedNameFitsNonParameterizedName = new ParameterizedNameFitsNonParameterizedName();

		csp.getConstraints().add(parameterizedNameFitsNonParameterizedName);

		// Solve CSP
		parameterizedNameFitsNonParameterizedName.setRuleName("NoRuleName");
		parameterizedNameFitsNonParameterizedName.solve(var_parameterizedClassifier_name, var_nonParamElement_name);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Package umlPackage,
			ASTNode2Element ne2neNonParam, Interface uContainer, AbstractTypeDeclaration jContainer,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			JavaPackage2UmlPackage jp2up, org.eclipse.uml2.uml.Class nonParamElement, ASTNode2Element c2c,
			org.eclipse.uml2.uml.Class parameterizedClassifier) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_parameterizedClassifier_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parameterizedClassifier.name", true, csp);
		var_parameterizedClassifier_name.setValue(parameterizedClassifier.getName());
		var_parameterizedClassifier_name.setType("String");

		// Create unbound variables
		Variable var_parameterizedType_name = CSPFactoryHelper.eINSTANCE.createVariable("parameterizedType.name", csp);
		var_parameterizedType_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_parameterizedType_name, var_parameterizedClassifier_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("umlPackage", umlPackage);
		isApplicableMatch.registerObject("ne2neNonParam", ne2neNonParam);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("nonParamType", nonParamType);
		isApplicableMatch.registerObject("nonParamPackage", nonParamPackage);
		isApplicableMatch.registerObject("jp2up", jp2up);
		isApplicableMatch.registerObject("nonParamElement", nonParamElement);
		isApplicableMatch.registerObject("c2c", c2c);
		isApplicableMatch.registerObject("parameterizedClassifier", parameterizedClassifier);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject umlPackage, EObject ne2neNonParam,
			EObject uContainer, EObject jContainer, EObject nonParamType, EObject nonParamPackage,
			EObject parameterizedType, EObject jp2up, EObject ne2ne, EObject typeTypeAccess, EObject nonParamElement,
			EObject c2c, EObject parameterizedClassifier) {
		ruleresult.registerObject("umlPackage", umlPackage);
		ruleresult.registerObject("ne2neNonParam", ne2neNonParam);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("nonParamType", nonParamType);
		ruleresult.registerObject("nonParamPackage", nonParamPackage);
		ruleresult.registerObject("parameterizedType", parameterizedType);
		ruleresult.registerObject("jp2up", jp2up);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("typeTypeAccess", typeTypeAccess);
		ruleresult.registerObject("nonParamElement", nonParamElement);
		ruleresult.registerObject("c2c", c2c);
		ruleresult.registerObject("parameterizedClassifier", parameterizedClassifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("parameterizedClassifier").eClass())
				.equals("uml.Class.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_136(EMoflonEdge _edge_packagedElement) {

		Object[] result1_bindingAndBlack = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_20_2_testcorematchandDECs_blackFFFFB(
						_edge_packagedElement)) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_black[0];
			Interface uContainer = (Interface) result2_black[1];
			org.eclipse.uml2.uml.Class nonParamElement = (org.eclipse.uml2.uml.Class) result2_black[2];
			org.eclipse.uml2.uml.Class parameterizedClassifier = (org.eclipse.uml2.uml.Class) result2_black[3];
			Object[] result2_green = ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, umlPackage, uContainer, nonParamElement, parameterizedClassifier)) {
				// 
				if (ParameterizedType2Class_InnerTypeInInterfaceImpl
						.pattern_ParameterizedType2Class_InnerTypeInInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
							.pattern_ParameterizedType2Class_InnerTypeInInterface_20_5_Addmatchtoruleresult_blackBBBB(
									match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ParameterizedType2Class_InnerTypeInInterfaceImpl
							.pattern_ParameterizedType2Class_InnerTypeInInterface_20_5_Addmatchtoruleresult_greenBBBB(
									match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_147(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_blackFFFFFB(
						_edge_type)) {
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_black[0];
			AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result2_black[1];
			org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result2_black[2];
			ParameterizedType parameterizedType = (ParameterizedType) result2_black[3];
			TypeAccess typeTypeAccess = (TypeAccess) result2_black[4];
			Object[] result2_green = ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, jContainer, nonParamType, nonParamPackage, parameterizedType,
							typeTypeAccess)) {
				// 
				if (ParameterizedType2Class_InnerTypeInInterfaceImpl
						.pattern_ParameterizedType2Class_InnerTypeInInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
							.pattern_ParameterizedType2Class_InnerTypeInInterface_21_5_Addmatchtoruleresult_blackBBBB(
									match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ParameterizedType2Class_InnerTypeInInterfaceImpl
							.pattern_ParameterizedType2Class_InnerTypeInInterface_21_5_Addmatchtoruleresult_greenBBBB(
									match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ParameterizedType2Class_InnerTypeInInterface");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_parameterizedClassifier_name = CSPFactoryHelper.eINSTANCE.createVariable("parameterizedClassifier",
				true, csp);
		var_parameterizedClassifier_name.setValue(__helper.getValue("parameterizedClassifier", "name"));
		var_parameterizedClassifier_name.setType("String");

		Variable var_parameterizedType_name = CSPFactoryHelper.eINSTANCE.createVariable("parameterizedType", true, csp);
		var_parameterizedType_name.setValue(__helper.getValue("parameterizedType", "name"));
		var_parameterizedType_name.setType("String");

		Variable var_nonParamElement_name = CSPFactoryHelper.eINSTANCE.createVariable("nonParamElement", true, csp);
		var_nonParamElement_name.setValue(__helper.getValue("nonParamElement", "name"));
		var_nonParamElement_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		ParameterizedNameFitsNonParameterizedName parameterizedNameFitsNonParameterizedName1 = new ParameterizedNameFitsNonParameterizedName();
		csp.getConstraints().add(parameterizedNameFitsNonParameterizedName1);

		eq0.setRuleName("ParameterizedType2Class_InnerTypeInInterface");
		eq0.solve(var_parameterizedType_name, var_parameterizedClassifier_name);

		parameterizedNameFitsNonParameterizedName1.setRuleName("ParameterizedType2Class_InnerTypeInInterface");
		parameterizedNameFitsNonParameterizedName1.solve(var_parameterizedClassifier_name, var_nonParamElement_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_parameterizedClassifier_name.setBound(false);
			var_parameterizedClassifier_name.setBound(false);
			eq0.solve(var_parameterizedType_name, var_parameterizedClassifier_name);
			parameterizedNameFitsNonParameterizedName1.solve(var_parameterizedClassifier_name,
					var_nonParamElement_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("parameterizedClassifier", "name", var_parameterizedClassifier_name.getValue());
				__helper.setValue("parameterizedClassifier", "name", var_parameterizedClassifier_name.getValue());
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
		ruleResult.setRule("ParameterizedType2Class_InnerTypeInInterface");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_parameterizedClassifier_name = CSPFactoryHelper.eINSTANCE.createVariable("parameterizedClassifier",
				true, csp);
		var_parameterizedClassifier_name.setValue(__helper.getValue("parameterizedClassifier", "name"));
		var_parameterizedClassifier_name.setType("String");

		Variable var_parameterizedType_name = CSPFactoryHelper.eINSTANCE.createVariable("parameterizedType", true, csp);
		var_parameterizedType_name.setValue(__helper.getValue("parameterizedType", "name"));
		var_parameterizedType_name.setType("String");

		Variable var_nonParamElement_name = CSPFactoryHelper.eINSTANCE.createVariable("nonParamElement", true, csp);
		var_nonParamElement_name.setValue(__helper.getValue("nonParamElement", "name"));
		var_nonParamElement_name.setType("String");

		ParameterizedNameFitsNonParameterizedName parameterizedNameFitsNonParameterizedName0 = new ParameterizedNameFitsNonParameterizedName();
		csp.getConstraints().add(parameterizedNameFitsNonParameterizedName0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		parameterizedNameFitsNonParameterizedName0.setRuleName("ParameterizedType2Class_InnerTypeInInterface");
		parameterizedNameFitsNonParameterizedName0.solve(var_parameterizedClassifier_name, var_nonParamElement_name);

		eq1.setRuleName("ParameterizedType2Class_InnerTypeInInterface");
		eq1.solve(var_parameterizedType_name, var_parameterizedClassifier_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_parameterizedType_name.setBound(false);
			parameterizedNameFitsNonParameterizedName0.solve(var_parameterizedClassifier_name,
					var_nonParamElement_name);
			eq1.solve(var_parameterizedType_name, var_parameterizedClassifier_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("parameterizedType", "name", var_parameterizedType_name.getValue());
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

		Object[] result1_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_bindingAndBlack[0];
		Interface uContainer = (Interface) result2_bindingAndBlack[1];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_bindingAndBlack[2];
		AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result2_bindingAndBlack[3];
		org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[4];
		ParameterizedType parameterizedType = (ParameterizedType) result2_bindingAndBlack[5];
		TypeAccess typeTypeAccess = (TypeAccess) result2_bindingAndBlack[6];
		org.eclipse.uml2.uml.Class nonParamElement = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[7];
		org.eclipse.uml2.uml.Class parameterizedClassifier = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[8];

		Object[] result3_bindingAndBlack = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBB(this,
						umlPackage, uContainer, jContainer, nonParamType, nonParamPackage, parameterizedType,
						typeTypeAccess, nonParamElement, parameterizedClassifier, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[umlPackage] = " + umlPackage + ", " + "[uContainer] = " + uContainer + ", " + "[jContainer] = "
					+ jContainer + ", " + "[nonParamType] = " + nonParamType + ", " + "[nonParamPackage] = "
					+ nonParamPackage + ", " + "[parameterizedType] = " + parameterizedType + ", "
					+ "[typeTypeAccess] = " + typeTypeAccess + ", " + "[nonParamElement] = " + nonParamElement + ", "
					+ "[parameterizedClassifier] = " + parameterizedClassifier + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_24_5_matchcorrcontext_blackBFBBBBFBFBB(
							umlPackage, uContainer, jContainer, nonParamType, nonParamPackage, nonParamElement,
							sourceMatch, targetMatch)) {
				ASTNode2Element ne2neNonParam = (ASTNode2Element) result5_black[1];
				JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result5_black[6];
				ASTNode2Element c2c = (ASTNode2Element) result5_black[8];
				Object[] result5_green = ParameterizedType2Class_InnerTypeInInterfaceImpl
						.pattern_ParameterizedType2Class_InnerTypeInInterface_24_5_matchcorrcontext_greenBBBBBF(
								ne2neNonParam, jp2up, c2c, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[5];

				Object[] result6_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
						.pattern_ParameterizedType2Class_InnerTypeInInterface_24_6_createcorrespondence_blackBBBBBBBBBB(
								umlPackage, uContainer, jContainer, nonParamType, nonParamPackage, parameterizedType,
								typeTypeAccess, nonParamElement, parameterizedClassifier, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[umlPackage] = "
							+ umlPackage + ", " + "[uContainer] = " + uContainer + ", " + "[jContainer] = " + jContainer
							+ ", " + "[nonParamType] = " + nonParamType + ", " + "[nonParamPackage] = "
							+ nonParamPackage + ", " + "[parameterizedType] = " + parameterizedType + ", "
							+ "[typeTypeAccess] = " + typeTypeAccess + ", " + "[nonParamElement] = " + nonParamElement
							+ ", " + "[parameterizedClassifier] = " + parameterizedClassifier + ", " + "[ccMatch] = "
							+ ccMatch + ".");
				}
				ParameterizedType2Class_InnerTypeInInterfaceImpl
						.pattern_ParameterizedType2Class_InnerTypeInInterface_24_6_createcorrespondence_greenBFBB(
								parameterizedType, parameterizedClassifier, ccMatch);
				//nothing ASTNode2Element ne2ne = (ASTNode2Element) result6_green[1];

				Object[] result7_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
						.pattern_ParameterizedType2Class_InnerTypeInInterface_24_7_addtoreturnedresult_blackBB(result,
								ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ParameterizedType2Class_InnerTypeInInterfaceImpl
						.pattern_ParameterizedType2Class_InnerTypeInInterface_24_7_addtoreturnedresult_greenBB(result,
								ccMatch);

			}

		} else {
		}
		return ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Package umlPackage, Interface uContainer,
			AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess, org.eclipse.uml2.uml.Class nonParamElement,
			org.eclipse.uml2.uml.Class parameterizedClassifier, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_parameterizedType_name = CSPFactoryHelper.eINSTANCE.createVariable("parameterizedType.name", true,
				csp);
		var_parameterizedType_name.setValue(parameterizedType.getName());
		var_parameterizedType_name.setType("String");
		Variable var_parameterizedClassifier_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parameterizedClassifier.name", true, csp);
		var_parameterizedClassifier_name.setValue(parameterizedClassifier.getName());
		var_parameterizedClassifier_name.setType("String");
		Variable var_nonParamElement_name = CSPFactoryHelper.eINSTANCE.createVariable("nonParamElement.name", true,
				csp);
		var_nonParamElement_name.setValue(nonParamElement.getName());
		var_nonParamElement_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		ParameterizedNameFitsNonParameterizedName parameterizedNameFitsNonParameterizedName = new ParameterizedNameFitsNonParameterizedName();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(parameterizedNameFitsNonParameterizedName);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_parameterizedType_name, var_parameterizedClassifier_name);
		parameterizedNameFitsNonParameterizedName.setRuleName("NoRuleName");
		parameterizedNameFitsNonParameterizedName.solve(var_parameterizedClassifier_name, var_nonParamElement_name);
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
	public boolean checkDEC_FWD(AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess) {// 
		Object[] result1_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_blackBBBBB(jContainer,
						nonParamType, nonParamPackage, parameterizedType, typeTypeAccess);
		if (result1_black != null) {
			return ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_27_2_expressionF();
		} else {
			return ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Package umlPackage, Interface uContainer,
			org.eclipse.uml2.uml.Class nonParamElement, org.eclipse.uml2.uml.Class parameterizedClassifier) {// 
		Object[] result1_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_28_1_matchtggpattern_blackBBBB(umlPackage,
						uContainer, nonParamElement, parameterizedClassifier);
		if (result1_black != null) {
			return ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_28_2_expressionF();
		} else {
			return ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ASTNode2Element ne2neNonParamParameter) {

		Object[] result1_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_blackFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList ne2neNonParamList = (RuleEntryList) result2_black[0];
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_black[1];
			Interface uContainer = (Interface) result2_black[2];
			org.eclipse.uml2.uml.Class nonParamElement = (org.eclipse.uml2.uml.Class) result2_black[3];
			ASTNode2Element ne2neNonParam = (ASTNode2Element) result2_black[4];
			AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result2_black[5];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_black[6];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[7];
			org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result2_black[8];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result2_black[9];

			Object[] result3_bindingAndBlack = ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
							this, isApplicableMatch, umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType,
							nonParamPackage, jp2up, nonParamElement, c2c, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[umlPackage] = " + umlPackage + ", "
						+ "[ne2neNonParam] = " + ne2neNonParam + ", " + "[uContainer] = " + uContainer + ", "
						+ "[jContainer] = " + jContainer + ", " + "[nonParamType] = " + nonParamType + ", "
						+ "[nonParamPackage] = " + nonParamPackage + ", " + "[jp2up] = " + jp2up + ", "
						+ "[nonParamElement] = " + nonParamElement + ", " + "[c2c] = " + c2c + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ParameterizedType2Class_InnerTypeInInterfaceImpl
					.pattern_ParameterizedType2Class_InnerTypeInInterface_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
						.pattern_ParameterizedType2Class_InnerTypeInInterface_29_5_checknacs_blackBBBBBBBBB(umlPackage,
								ne2neNonParam, uContainer, jContainer, nonParamType, nonParamPackage, jp2up,
								nonParamElement, c2c);
				if (result5_black != null) {

					Object[] result6_black = ParameterizedType2Class_InnerTypeInInterfaceImpl
							.pattern_ParameterizedType2Class_InnerTypeInInterface_29_6_perform_blackBBBBBBBBBB(
									umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType, nonParamPackage,
									jp2up, nonParamElement, c2c, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[umlPackage] = "
								+ umlPackage + ", " + "[ne2neNonParam] = " + ne2neNonParam + ", " + "[uContainer] = "
								+ uContainer + ", " + "[jContainer] = " + jContainer + ", " + "[nonParamType] = "
								+ nonParamType + ", " + "[nonParamPackage] = " + nonParamPackage + ", " + "[jp2up] = "
								+ jp2up + ", " + "[nonParamElement] = " + nonParamElement + ", " + "[c2c] = " + c2c
								+ ", " + "[ruleResult] = " + ruleResult + ".");
					}
					ParameterizedType2Class_InnerTypeInInterfaceImpl
							.pattern_ParameterizedType2Class_InnerTypeInInterface_29_6_perform_greenBBFFFFBB(umlPackage,
									nonParamType, ruleResult, csp);
					//nothing ParameterizedType parameterizedType = (ParameterizedType) result6_green[2];
					//nothing ASTNode2Element ne2ne = (ASTNode2Element) result6_green[3];
					//nothing TypeAccess typeTypeAccess = (TypeAccess) result6_green[4];
					//nothing org.eclipse.uml2.uml.Class parameterizedClassifier = (org.eclipse.uml2.uml.Class) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return ParameterizedType2Class_InnerTypeInInterfaceImpl
				.pattern_ParameterizedType2Class_InnerTypeInInterface_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Package umlPackage,
			ASTNode2Element ne2neNonParam, Interface uContainer, AbstractTypeDeclaration jContainer,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			JavaPackage2UmlPackage jp2up, org.eclipse.uml2.uml.Class nonParamElement, ASTNode2Element c2c,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_nonParamElement_name = CSPFactoryHelper.eINSTANCE.createVariable("nonParamElement.name", true,
				csp);
		var_nonParamElement_name.setValue(nonParamElement.getName());
		var_nonParamElement_name.setType("String");

		// Create unbound variables
		Variable var_parameterizedType_name = CSPFactoryHelper.eINSTANCE.createVariable("parameterizedType.name", csp);
		var_parameterizedType_name.setType("String");
		Variable var_parameterizedClassifier_name = CSPFactoryHelper.eINSTANCE
				.createVariable("parameterizedClassifier.name", csp);
		var_parameterizedClassifier_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		ParameterizedNameFitsNonParameterizedName parameterizedNameFitsNonParameterizedName = new ParameterizedNameFitsNonParameterizedName();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(parameterizedNameFitsNonParameterizedName);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_parameterizedType_name, var_parameterizedClassifier_name);
		parameterizedNameFitsNonParameterizedName.setRuleName("NoRuleName");
		parameterizedNameFitsNonParameterizedName.solve(var_parameterizedClassifier_name, var_nonParamElement_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("umlPackage", umlPackage);
		isApplicableMatch.registerObject("ne2neNonParam", ne2neNonParam);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("nonParamType", nonParamType);
		isApplicableMatch.registerObject("nonParamPackage", nonParamPackage);
		isApplicableMatch.registerObject("jp2up", jp2up);
		isApplicableMatch.registerObject("nonParamElement", nonParamElement);
		isApplicableMatch.registerObject("c2c", c2c);
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
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___IS_APPROPRIATE_FWD__MATCH_ABSTRACTTYPEDECLARATION_ABSTRACTTYPEDECLARATION_PACKAGE_PARAMETERIZEDTYPE_TYPEACCESS:
			return isAppropriate_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (org.eclipse.modisco.java.Package) arguments.get(3),
					(ParameterizedType) arguments.get(4), (TypeAccess) arguments.get(5));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ABSTRACTTYPEDECLARATION_ABSTRACTTYPEDECLARATION_PACKAGE_PARAMETERIZEDTYPE_TYPEACCESS:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (org.eclipse.modisco.java.Package) arguments.get(3),
					(ParameterizedType) arguments.get(4), (TypeAccess) arguments.get(5));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ABSTRACTTYPEDECLARATION_ABSTRACTTYPEDECLARATION_PACKAGE_PARAMETERIZEDTYPE_TYPEACCESS:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (org.eclipse.modisco.java.Package) arguments.get(3),
					(ParameterizedType) arguments.get(4), (TypeAccess) arguments.get(5));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGE_ASTNODE2ELEMENT_INTERFACE_ABSTRACTTYPEDECLARATION_ABSTRACTTYPEDECLARATION_PACKAGE_PARAMETERIZEDTYPE_JAVAPACKAGE2UMLPACKAGE_TYPEACCESS_CLASS_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Package) arguments.get(1), (ASTNode2Element) arguments.get(2),
					(Interface) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4),
					(AbstractTypeDeclaration) arguments.get(5), (org.eclipse.modisco.java.Package) arguments.get(6),
					(ParameterizedType) arguments.get(7), (JavaPackage2UmlPackage) arguments.get(8),
					(TypeAccess) arguments.get(9), (org.eclipse.uml2.uml.Class) arguments.get(10),
					(ASTNode2Element) arguments.get(11));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___IS_APPROPRIATE_BWD__MATCH_PACKAGE_INTERFACE_CLASS_CLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1),
					(Interface) arguments.get(2), (org.eclipse.uml2.uml.Class) arguments.get(3),
					(org.eclipse.uml2.uml.Class) arguments.get(4));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_INTERFACE_CLASS_CLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1),
					(Interface) arguments.get(2), (org.eclipse.uml2.uml.Class) arguments.get(3),
					(org.eclipse.uml2.uml.Class) arguments.get(4));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_INTERFACE_CLASS_CLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1),
					(Interface) arguments.get(2), (org.eclipse.uml2.uml.Class) arguments.get(3),
					(org.eclipse.uml2.uml.Class) arguments.get(4));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGE_ASTNODE2ELEMENT_INTERFACE_ABSTRACTTYPEDECLARATION_ABSTRACTTYPEDECLARATION_PACKAGE_JAVAPACKAGE2UMLPACKAGE_CLASS_ASTNODE2ELEMENT_CLASS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Package) arguments.get(1), (ASTNode2Element) arguments.get(2),
					(Interface) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4),
					(AbstractTypeDeclaration) arguments.get(5), (org.eclipse.modisco.java.Package) arguments.get(6),
					(JavaPackage2UmlPackage) arguments.get(7), (org.eclipse.uml2.uml.Class) arguments.get(8),
					(ASTNode2Element) arguments.get(9), (org.eclipse.uml2.uml.Class) arguments.get(10));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_136__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_136((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_147__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_147((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___IS_APPLICABLE_SOLVE_CSP_CC__PACKAGE_INTERFACE_ABSTRACTTYPEDECLARATION_ABSTRACTTYPEDECLARATION_PACKAGE_PARAMETERIZEDTYPE_TYPEACCESS_CLASS_CLASS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.uml2.uml.Package) arguments.get(0),
					(Interface) arguments.get(1), (AbstractTypeDeclaration) arguments.get(2),
					(AbstractTypeDeclaration) arguments.get(3), (org.eclipse.modisco.java.Package) arguments.get(4),
					(ParameterizedType) arguments.get(5), (TypeAccess) arguments.get(6),
					(org.eclipse.uml2.uml.Class) arguments.get(7), (org.eclipse.uml2.uml.Class) arguments.get(8),
					(Match) arguments.get(9), (Match) arguments.get(10));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___CHECK_DEC_FWD__ABSTRACTTYPEDECLARATION_ABSTRACTTYPEDECLARATION_PACKAGE_PARAMETERIZEDTYPE_TYPEACCESS:
			return checkDEC_FWD((AbstractTypeDeclaration) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2), (ParameterizedType) arguments.get(3),
					(TypeAccess) arguments.get(4));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___CHECK_DEC_BWD__PACKAGE_INTERFACE_CLASS_CLASS:
			return checkDEC_BWD((org.eclipse.uml2.uml.Package) arguments.get(0), (Interface) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (org.eclipse.uml2.uml.Class) arguments.get(3));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGE_ASTNODE2ELEMENT_INTERFACE_ABSTRACTTYPEDECLARATION_ABSTRACTTYPEDECLARATION_PACKAGE_JAVAPACKAGE2UMLPACKAGE_CLASS_ASTNODE2ELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Package) arguments.get(1), (ASTNode2Element) arguments.get(2),
					(Interface) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4),
					(AbstractTypeDeclaration) arguments.get(5), (org.eclipse.modisco.java.Package) arguments.get(6),
					(JavaPackage2UmlPackage) arguments.get(7), (org.eclipse.uml2.uml.Class) arguments.get(8),
					(ASTNode2Element) arguments.get(9), (ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.PARAMETERIZED_TYPE2_CLASS_INNER_TYPE_IN_INTERFACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_0_1_initialbindings_blackBBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, Match match, AbstractTypeDeclaration jContainer,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, TypeAccess typeTypeAccess) {
		if (!jContainer.equals(nonParamType)) {
			return new Object[] { _this, match, jContainer, nonParamType, nonParamPackage, parameterizedType,
					typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_0_2_SolveCSP_bindingFBBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, Match match, AbstractTypeDeclaration jContainer,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, TypeAccess typeTypeAccess) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jContainer, nonParamType, nonParamPackage,
				parameterizedType, typeTypeAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jContainer, nonParamType, nonParamPackage, parameterizedType,
					typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, Match match, AbstractTypeDeclaration jContainer,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, TypeAccess typeTypeAccess) {
		Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_0_2_SolveCSP_binding = pattern_ParameterizedType2Class_InnerTypeInInterface_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, jContainer, nonParamType, nonParamPackage, parameterizedType, typeTypeAccess);
		if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedType2Class_InnerTypeInInterface_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_0_2_SolveCSP_black = pattern_ParameterizedType2Class_InnerTypeInInterface_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, jContainer, nonParamType, nonParamPackage, parameterizedType,
						typeTypeAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_0_3_CheckCSP_expressionFBB(
			ParameterizedType2Class_InnerTypeInInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_0_4_collectelementstobetranslated_blackBBBBBB(
			Match match, AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess) {
		if (!jContainer.equals(nonParamType)) {
			return new Object[] { match, jContainer, nonParamType, nonParamPackage, parameterizedType, typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, AbstractTypeDeclaration nonParamType, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess) {
		EMoflonEdge parameterizedType__typeTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeTypeAccess__nonParamType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nonParamType__typeTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(parameterizedType);
		match.getToBeTranslatedNodes().add(typeTypeAccess);
		String parameterizedType__typeTypeAccess____type_name_prime = "type";
		String typeTypeAccess__nonParamType____type_name_prime = "type";
		String nonParamType__typeTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		parameterizedType__typeTypeAccess____type.setSrc(parameterizedType);
		parameterizedType__typeTypeAccess____type.setTrg(typeTypeAccess);
		match.getToBeTranslatedEdges().add(parameterizedType__typeTypeAccess____type);
		typeTypeAccess__nonParamType____type.setSrc(typeTypeAccess);
		typeTypeAccess__nonParamType____type.setTrg(nonParamType);
		match.getToBeTranslatedEdges().add(typeTypeAccess__nonParamType____type);
		nonParamType__typeTypeAccess____usagesInTypeAccess.setSrc(nonParamType);
		nonParamType__typeTypeAccess____usagesInTypeAccess.setTrg(typeTypeAccess);
		match.getToBeTranslatedEdges().add(nonParamType__typeTypeAccess____usagesInTypeAccess);
		parameterizedType__typeTypeAccess____type.setName(parameterizedType__typeTypeAccess____type_name_prime);
		typeTypeAccess__nonParamType____type.setName(typeTypeAccess__nonParamType____type_name_prime);
		nonParamType__typeTypeAccess____usagesInTypeAccess
				.setName(nonParamType__typeTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { match, nonParamType, parameterizedType, typeTypeAccess,
				parameterizedType__typeTypeAccess____type, typeTypeAccess__nonParamType____type,
				nonParamType__typeTypeAccess____usagesInTypeAccess };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_0_5_collectcontextelements_blackBBBBBB(
			Match match, AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess) {
		if (!jContainer.equals(nonParamType)) {
			return new Object[] { match, jContainer, nonParamType, nonParamPackage, parameterizedType, typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_0_5_collectcontextelements_greenBBBBFFFF(
			Match match, AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage) {
		EMoflonEdge nonParamPackage__jContainer____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__nonParamPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__nonParamType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nonParamType__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(jContainer);
		match.getContextNodes().add(nonParamType);
		match.getContextNodes().add(nonParamPackage);
		String nonParamPackage__jContainer____ownedElements_name_prime = "ownedElements";
		String jContainer__nonParamPackage____package_name_prime = "package";
		String jContainer__nonParamType____bodyDeclarations_name_prime = "bodyDeclarations";
		String nonParamType__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		nonParamPackage__jContainer____ownedElements.setSrc(nonParamPackage);
		nonParamPackage__jContainer____ownedElements.setTrg(jContainer);
		match.getContextEdges().add(nonParamPackage__jContainer____ownedElements);
		jContainer__nonParamPackage____package.setSrc(jContainer);
		jContainer__nonParamPackage____package.setTrg(nonParamPackage);
		match.getContextEdges().add(jContainer__nonParamPackage____package);
		jContainer__nonParamType____bodyDeclarations.setSrc(jContainer);
		jContainer__nonParamType____bodyDeclarations.setTrg(nonParamType);
		match.getContextEdges().add(jContainer__nonParamType____bodyDeclarations);
		nonParamType__jContainer____abstractTypeDeclaration.setSrc(nonParamType);
		nonParamType__jContainer____abstractTypeDeclaration.setTrg(jContainer);
		match.getContextEdges().add(nonParamType__jContainer____abstractTypeDeclaration);
		nonParamPackage__jContainer____ownedElements.setName(nonParamPackage__jContainer____ownedElements_name_prime);
		jContainer__nonParamPackage____package.setName(jContainer__nonParamPackage____package_name_prime);
		jContainer__nonParamType____bodyDeclarations.setName(jContainer__nonParamType____bodyDeclarations_name_prime);
		nonParamType__jContainer____abstractTypeDeclaration
				.setName(nonParamType__jContainer____abstractTypeDeclaration_name_prime);
		return new Object[] { match, jContainer, nonParamType, nonParamPackage,
				nonParamPackage__jContainer____ownedElements, jContainer__nonParamPackage____package,
				jContainer__nonParamType____bodyDeclarations, nonParamType__jContainer____abstractTypeDeclaration };
	}

	public static final void pattern_ParameterizedType2Class_InnerTypeInInterface_0_6_registerobjectstomatch_expressionBBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, Match match, AbstractTypeDeclaration jContainer,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, TypeAccess typeTypeAccess) {
		_this.registerObjectsToMatch_FWD(match, jContainer, nonParamType, nonParamPackage, parameterizedType,
				typeTypeAccess);

	}

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("umlPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("ne2neNonParam");
		EObject _localVariable_2 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_4 = isApplicableMatch.getObject("nonParamType");
		EObject _localVariable_5 = isApplicableMatch.getObject("nonParamPackage");
		EObject _localVariable_6 = isApplicableMatch.getObject("parameterizedType");
		EObject _localVariable_7 = isApplicableMatch.getObject("jp2up");
		EObject _localVariable_8 = isApplicableMatch.getObject("typeTypeAccess");
		EObject _localVariable_9 = isApplicableMatch.getObject("nonParamElement");
		EObject _localVariable_10 = isApplicableMatch.getObject("c2c");
		EObject tmpUmlPackage = _localVariable_0;
		EObject tmpNe2neNonParam = _localVariable_1;
		EObject tmpUContainer = _localVariable_2;
		EObject tmpJContainer = _localVariable_3;
		EObject tmpNonParamType = _localVariable_4;
		EObject tmpNonParamPackage = _localVariable_5;
		EObject tmpParameterizedType = _localVariable_6;
		EObject tmpJp2up = _localVariable_7;
		EObject tmpTypeTypeAccess = _localVariable_8;
		EObject tmpNonParamElement = _localVariable_9;
		EObject tmpC2c = _localVariable_10;
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
			if (tmpNe2neNonParam instanceof ASTNode2Element) {
				ASTNode2Element ne2neNonParam = (ASTNode2Element) tmpNe2neNonParam;
				if (tmpUContainer instanceof Interface) {
					Interface uContainer = (Interface) tmpUContainer;
					if (tmpJContainer instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
						if (tmpNonParamType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) tmpNonParamType;
							if (tmpNonParamPackage instanceof org.eclipse.modisco.java.Package) {
								org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) tmpNonParamPackage;
								if (tmpParameterizedType instanceof ParameterizedType) {
									ParameterizedType parameterizedType = (ParameterizedType) tmpParameterizedType;
									if (tmpJp2up instanceof JavaPackage2UmlPackage) {
										JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) tmpJp2up;
										if (tmpTypeTypeAccess instanceof TypeAccess) {
											TypeAccess typeTypeAccess = (TypeAccess) tmpTypeTypeAccess;
											if (tmpNonParamElement instanceof org.eclipse.uml2.uml.Class) {
												org.eclipse.uml2.uml.Class nonParamElement = (org.eclipse.uml2.uml.Class) tmpNonParamElement;
												if (tmpC2c instanceof ASTNode2Element) {
													ASTNode2Element c2c = (ASTNode2Element) tmpC2c;
													return new Object[] { umlPackage, ne2neNonParam, uContainer,
															jContainer, nonParamType, nonParamPackage,
															parameterizedType, jp2up, typeTypeAccess, nonParamElement,
															c2c, isApplicableMatch };
												}
											}
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

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_blackBBBBBBBBBBBFBB(
			org.eclipse.uml2.uml.Package umlPackage, ASTNode2Element ne2neNonParam, Interface uContainer,
			AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			JavaPackage2UmlPackage jp2up, TypeAccess typeTypeAccess, org.eclipse.uml2.uml.Class nonParamElement,
			ASTNode2Element c2c, ParameterizedType2Class_InnerTypeInInterface _this,
			IsApplicableMatch isApplicableMatch) {
		if (!jContainer.equals(nonParamType)) {
			if (!c2c.equals(ne2neNonParam)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType,
								nonParamPackage, parameterizedType, jp2up, typeTypeAccess, nonParamElement, c2c, csp,
								_this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(
			ParameterizedType2Class_InnerTypeInInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_binding = pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_bindingFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result_pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_binding[0];
			ASTNode2Element ne2neNonParam = (ASTNode2Element) result_pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_binding[1];
			Interface uContainer = (Interface) result_pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_binding[2];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result_pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_binding[3];
			AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result_pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_binding[4];
			org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result_pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_binding[5];
			ParameterizedType parameterizedType = (ParameterizedType) result_pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_binding[6];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result_pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_binding[7];
			TypeAccess typeTypeAccess = (TypeAccess) result_pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_binding[8];
			org.eclipse.uml2.uml.Class nonParamElement = (org.eclipse.uml2.uml.Class) result_pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_binding[9];
			ASTNode2Element c2c = (ASTNode2Element) result_pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_binding[10];

			Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_black = pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_blackBBBBBBBBBBBFBB(
					umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType, nonParamPackage, parameterizedType,
					jp2up, typeTypeAccess, nonParamElement, c2c, _this, isApplicableMatch);
			if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_black[11];

				return new Object[] { umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType, nonParamPackage,
						parameterizedType, jp2up, typeTypeAccess, nonParamElement, c2c, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_1_1_performtransformation_greenBBFFB(
			org.eclipse.uml2.uml.Package umlPackage, ParameterizedType parameterizedType, CSP csp) {
		ASTNode2Element ne2ne = UmlFactory.eINSTANCE.createASTNode2Element();
		org.eclipse.uml2.uml.Class parameterizedClassifier = UMLFactory.eINSTANCE.createClass();
		Object _localVariable_0 = csp.getValue("parameterizedClassifier", "name");
		ne2ne.setSource(parameterizedType);
		umlPackage.getPackagedElements().add(parameterizedClassifier);
		ne2ne.setTarget(parameterizedClassifier);
		String parameterizedClassifier_name_prime = (String) _localVariable_0;
		parameterizedClassifier.setName(parameterizedClassifier_name_prime);
		return new Object[] { umlPackage, parameterizedType, ne2ne, parameterizedClassifier, csp };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_1_2_collecttranslatedelements_blackBBBB(
			ParameterizedType parameterizedType, ASTNode2Element ne2ne, TypeAccess typeTypeAccess,
			org.eclipse.uml2.uml.Class parameterizedClassifier) {
		return new Object[] { parameterizedType, ne2ne, typeTypeAccess, parameterizedClassifier };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_1_2_collecttranslatedelements_greenFBBBB(
			ParameterizedType parameterizedType, ASTNode2Element ne2ne, TypeAccess typeTypeAccess,
			org.eclipse.uml2.uml.Class parameterizedClassifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(parameterizedType);
		ruleresult.getCreatedLinkElements().add(ne2ne);
		ruleresult.getTranslatedElements().add(typeTypeAccess);
		ruleresult.getCreatedElements().add(parameterizedClassifier);
		return new Object[] { ruleresult, parameterizedType, ne2ne, typeTypeAccess, parameterizedClassifier };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject umlPackage, EObject ne2neNonParam, EObject uContainer,
			EObject jContainer, EObject nonParamType, EObject nonParamPackage, EObject parameterizedType, EObject jp2up,
			EObject ne2ne, EObject typeTypeAccess, EObject nonParamElement, EObject c2c,
			EObject parameterizedClassifier) {
		if (!ne2neNonParam.equals(umlPackage)) {
			if (!ne2neNonParam.equals(uContainer)) {
				if (!ne2neNonParam.equals(nonParamType)) {
					if (!ne2neNonParam.equals(nonParamPackage)) {
						if (!ne2neNonParam.equals(parameterizedType)) {
							if (!ne2neNonParam.equals(typeTypeAccess)) {
								if (!ne2neNonParam.equals(nonParamElement)) {
									if (!ne2neNonParam.equals(parameterizedClassifier)) {
										if (!uContainer.equals(umlPackage)) {
											if (!jContainer.equals(umlPackage)) {
												if (!jContainer.equals(ne2neNonParam)) {
													if (!jContainer.equals(uContainer)) {
														if (!jContainer.equals(nonParamType)) {
															if (!jContainer.equals(nonParamPackage)) {
																if (!jContainer.equals(parameterizedType)) {
																	if (!jContainer.equals(jp2up)) {
																		if (!jContainer.equals(ne2ne)) {
																			if (!jContainer.equals(typeTypeAccess)) {
																				if (!jContainer
																						.equals(nonParamElement)) {
																					if (!jContainer.equals(
																							parameterizedClassifier)) {
																						if (!nonParamType
																								.equals(umlPackage)) {
																							if (!nonParamType.equals(
																									uContainer)) {
																								if (!nonParamType
																										.equals(parameterizedType)) {
																									if (!nonParamType
																											.equals(typeTypeAccess)) {
																										if (!nonParamType
																												.equals(parameterizedClassifier)) {
																											if (!nonParamPackage
																													.equals(umlPackage)) {
																												if (!nonParamPackage
																														.equals(uContainer)) {
																													if (!nonParamPackage
																															.equals(nonParamType)) {
																														if (!nonParamPackage
																																.equals(parameterizedType)) {
																															if (!nonParamPackage
																																	.equals(typeTypeAccess)) {
																																if (!nonParamPackage
																																		.equals(parameterizedClassifier)) {
																																	if (!parameterizedType
																																			.equals(umlPackage)) {
																																		if (!parameterizedType
																																				.equals(uContainer)) {
																																			if (!parameterizedType
																																					.equals(typeTypeAccess)) {
																																				if (!jp2up
																																						.equals(umlPackage)) {
																																					if (!jp2up
																																							.equals(ne2neNonParam)) {
																																						if (!jp2up
																																								.equals(uContainer)) {
																																							if (!jp2up
																																									.equals(nonParamType)) {
																																								if (!jp2up
																																										.equals(nonParamPackage)) {
																																									if (!jp2up
																																											.equals(parameterizedType)) {
																																										if (!jp2up
																																												.equals(ne2ne)) {
																																											if (!jp2up
																																													.equals(typeTypeAccess)) {
																																												if (!jp2up
																																														.equals(nonParamElement)) {
																																													if (!jp2up
																																															.equals(parameterizedClassifier)) {
																																														if (!ne2ne
																																																.equals(umlPackage)) {
																																															if (!ne2ne
																																																	.equals(ne2neNonParam)) {
																																																if (!ne2ne
																																																		.equals(uContainer)) {
																																																	if (!ne2ne
																																																			.equals(nonParamType)) {
																																																		if (!ne2ne
																																																				.equals(nonParamPackage)) {
																																																			if (!ne2ne
																																																					.equals(parameterizedType)) {
																																																				if (!ne2ne
																																																						.equals(typeTypeAccess)) {
																																																					if (!ne2ne
																																																							.equals(nonParamElement)) {
																																																						if (!ne2ne
																																																								.equals(parameterizedClassifier)) {
																																																							if (!typeTypeAccess
																																																									.equals(umlPackage)) {
																																																								if (!typeTypeAccess
																																																										.equals(uContainer)) {
																																																									if (!nonParamElement
																																																											.equals(umlPackage)) {
																																																										if (!nonParamElement
																																																												.equals(uContainer)) {
																																																											if (!nonParamElement
																																																													.equals(nonParamType)) {
																																																												if (!nonParamElement
																																																														.equals(nonParamPackage)) {
																																																													if (!nonParamElement
																																																															.equals(parameterizedType)) {
																																																														if (!nonParamElement
																																																																.equals(typeTypeAccess)) {
																																																															if (!nonParamElement
																																																																	.equals(parameterizedClassifier)) {
																																																																if (!c2c.equals(
																																																																		umlPackage)) {
																																																																	if (!c2c.equals(
																																																																			ne2neNonParam)) {
																																																																		if (!c2c.equals(
																																																																				uContainer)) {
																																																																			if (!c2c.equals(
																																																																					jContainer)) {
																																																																				if (!c2c.equals(
																																																																						nonParamType)) {
																																																																					if (!c2c.equals(
																																																																							nonParamPackage)) {
																																																																						if (!c2c.equals(
																																																																								parameterizedType)) {
																																																																							if (!c2c.equals(
																																																																									jp2up)) {
																																																																								if (!c2c.equals(
																																																																										ne2ne)) {
																																																																									if (!c2c.equals(
																																																																											typeTypeAccess)) {
																																																																										if (!c2c.equals(
																																																																												nonParamElement)) {
																																																																											if (!c2c.equals(
																																																																													parameterizedClassifier)) {
																																																																												if (!parameterizedClassifier
																																																																														.equals(umlPackage)) {
																																																																													if (!parameterizedClassifier
																																																																															.equals(uContainer)) {
																																																																														if (!parameterizedClassifier
																																																																																.equals(parameterizedType)) {
																																																																															if (!parameterizedClassifier
																																																																																	.equals(typeTypeAccess)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		umlPackage,
																																																																																		ne2neNonParam,
																																																																																		uContainer,
																																																																																		jContainer,
																																																																																		nonParamType,
																																																																																		nonParamPackage,
																																																																																		parameterizedType,
																																																																																		jp2up,
																																																																																		ne2ne,
																																																																																		typeTypeAccess,
																																																																																		nonParamElement,
																																																																																		c2c,
																																																																																		parameterizedClassifier };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject umlPackage, EObject nonParamType, EObject parameterizedType,
			EObject ne2ne, EObject typeTypeAccess, EObject parameterizedClassifier) {
		EMoflonEdge ne2ne__parameterizedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge parameterizedType__typeTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__parameterizedClassifier____packagedElement = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ne2ne__parameterizedClassifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeTypeAccess__nonParamType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nonParamType__typeTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterizedType2Class_InnerTypeInInterface";
		String ne2ne__parameterizedType____source_name_prime = "source";
		String parameterizedType__typeTypeAccess____type_name_prime = "type";
		String umlPackage__parameterizedClassifier____packagedElement_name_prime = "packagedElement";
		String ne2ne__parameterizedClassifier____target_name_prime = "target";
		String typeTypeAccess__nonParamType____type_name_prime = "type";
		String nonParamType__typeTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		ne2ne__parameterizedType____source.setSrc(ne2ne);
		ne2ne__parameterizedType____source.setTrg(parameterizedType);
		ruleresult.getCreatedEdges().add(ne2ne__parameterizedType____source);
		parameterizedType__typeTypeAccess____type.setSrc(parameterizedType);
		parameterizedType__typeTypeAccess____type.setTrg(typeTypeAccess);
		ruleresult.getTranslatedEdges().add(parameterizedType__typeTypeAccess____type);
		umlPackage__parameterizedClassifier____packagedElement.setSrc(umlPackage);
		umlPackage__parameterizedClassifier____packagedElement.setTrg(parameterizedClassifier);
		ruleresult.getCreatedEdges().add(umlPackage__parameterizedClassifier____packagedElement);
		ne2ne__parameterizedClassifier____target.setSrc(ne2ne);
		ne2ne__parameterizedClassifier____target.setTrg(parameterizedClassifier);
		ruleresult.getCreatedEdges().add(ne2ne__parameterizedClassifier____target);
		typeTypeAccess__nonParamType____type.setSrc(typeTypeAccess);
		typeTypeAccess__nonParamType____type.setTrg(nonParamType);
		ruleresult.getTranslatedEdges().add(typeTypeAccess__nonParamType____type);
		nonParamType__typeTypeAccess____usagesInTypeAccess.setSrc(nonParamType);
		nonParamType__typeTypeAccess____usagesInTypeAccess.setTrg(typeTypeAccess);
		ruleresult.getTranslatedEdges().add(nonParamType__typeTypeAccess____usagesInTypeAccess);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		ne2ne__parameterizedType____source.setName(ne2ne__parameterizedType____source_name_prime);
		parameterizedType__typeTypeAccess____type.setName(parameterizedType__typeTypeAccess____type_name_prime);
		umlPackage__parameterizedClassifier____packagedElement
				.setName(umlPackage__parameterizedClassifier____packagedElement_name_prime);
		ne2ne__parameterizedClassifier____target.setName(ne2ne__parameterizedClassifier____target_name_prime);
		typeTypeAccess__nonParamType____type.setName(typeTypeAccess__nonParamType____type_name_prime);
		nonParamType__typeTypeAccess____usagesInTypeAccess
				.setName(nonParamType__typeTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { ruleresult, umlPackage, nonParamType, parameterizedType, ne2ne, typeTypeAccess,
				parameterizedClassifier, ne2ne__parameterizedType____source, parameterizedType__typeTypeAccess____type,
				umlPackage__parameterizedClassifier____packagedElement, ne2ne__parameterizedClassifier____target,
				typeTypeAccess__nonParamType____type, nonParamType__typeTypeAccess____usagesInTypeAccess };
	}

	public static final void pattern_ParameterizedType2Class_InnerTypeInInterface_1_5_registerobjects_expressionBBBBBBBBBBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, PerformRuleResult ruleresult, EObject umlPackage,
			EObject ne2neNonParam, EObject uContainer, EObject jContainer, EObject nonParamType,
			EObject nonParamPackage, EObject parameterizedType, EObject jp2up, EObject ne2ne, EObject typeTypeAccess,
			EObject nonParamElement, EObject c2c, EObject parameterizedClassifier) {
		_this.registerObjects_FWD(ruleresult, umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType,
				nonParamPackage, parameterizedType, jp2up, ne2ne, typeTypeAccess, nonParamElement, c2c,
				parameterizedClassifier);

	}

	public static final PerformRuleResult pattern_ParameterizedType2Class_InnerTypeInInterface_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_2_1_preparereturnvalue_bindingFB(
			ParameterizedType2Class_InnerTypeInInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_2_1_preparereturnvalue_blackFBB(
			EClass eClass, ParameterizedType2Class_InnerTypeInInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_2_1_preparereturnvalue_bindingAndBlackFFB(
			ParameterizedType2Class_InnerTypeInInterface _this) {
		Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_2_1_preparereturnvalue_binding = pattern_ParameterizedType2Class_InnerTypeInInterface_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterizedType2Class_InnerTypeInInterface_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_2_1_preparereturnvalue_black = pattern_ParameterizedType2Class_InnerTypeInInterface_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterizedType2Class_InnerTypeInInterface_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ParameterizedType2Class_InnerTypeInInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_2_2_corematch_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("jContainer");
		EObject _localVariable_1 = match.getObject("nonParamType");
		EObject _localVariable_2 = match.getObject("nonParamPackage");
		EObject _localVariable_3 = match.getObject("parameterizedType");
		EObject _localVariable_4 = match.getObject("typeTypeAccess");
		EObject tmpJContainer = _localVariable_0;
		EObject tmpNonParamType = _localVariable_1;
		EObject tmpNonParamPackage = _localVariable_2;
		EObject tmpParameterizedType = _localVariable_3;
		EObject tmpTypeTypeAccess = _localVariable_4;
		if (tmpJContainer instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
			if (tmpNonParamType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) tmpNonParamType;
				if (tmpNonParamPackage instanceof org.eclipse.modisco.java.Package) {
					org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) tmpNonParamPackage;
					if (tmpParameterizedType instanceof ParameterizedType) {
						ParameterizedType parameterizedType = (ParameterizedType) tmpParameterizedType;
						if (tmpTypeTypeAccess instanceof TypeAccess) {
							TypeAccess typeTypeAccess = (TypeAccess) tmpTypeTypeAccess;
							return new Object[] { jContainer, nonParamType, nonParamPackage, parameterizedType,
									typeTypeAccess, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedType2Class_InnerTypeInInterface_2_2_corematch_blackFFFBBBBFBFFB(
			AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jContainer.equals(nonParamType)) {
			for (ASTNode2Element ne2neNonParam : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(nonParamType, ASTNode2Element.class, "source")) {
				Element tmpNonParamElement = ne2neNonParam.getTarget();
				if (tmpNonParamElement instanceof org.eclipse.uml2.uml.Class) {
					org.eclipse.uml2.uml.Class nonParamElement = (org.eclipse.uml2.uml.Class) tmpNonParamElement;
					for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(jContainer, ASTNode2Element.class, "source")) {
						if (!c2c.equals(ne2neNonParam)) {
							Element tmpUContainer = c2c.getTarget();
							if (tmpUContainer instanceof Interface) {
								Interface uContainer = (Interface) tmpUContainer;
								for (JavaPackage2UmlPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(nonParamPackage, JavaPackage2UmlPackage.class,
												"source")) {
									org.eclipse.uml2.uml.Package umlPackage = jp2up.getTarget();
									if (umlPackage != null) {
										_result.add(new Object[] { umlPackage, ne2neNonParam, uContainer, jContainer,
												nonParamType, nonParamPackage, parameterizedType, jp2up, typeTypeAccess,
												nonParamElement, c2c, match });
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

	public static final Iterable<Object[]> pattern_ParameterizedType2Class_InnerTypeInInterface_2_3_findcontext_blackBBBBBBBBBBB(
			org.eclipse.uml2.uml.Package umlPackage, ASTNode2Element ne2neNonParam, Interface uContainer,
			AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			JavaPackage2UmlPackage jp2up, TypeAccess typeTypeAccess, org.eclipse.uml2.uml.Class nonParamElement,
			ASTNode2Element c2c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jContainer.equals(nonParamType)) {
			if (!c2c.equals(ne2neNonParam)) {
				if (nonParamType.equals(ne2neNonParam.getSource())) {
					if (nonParamPackage.getOwnedElements().contains(jContainer)) {
						if (typeTypeAccess.equals(parameterizedType.getType())) {
							if (umlPackage.equals(jp2up.getTarget())) {
								if (uContainer.getNestedClassifiers().contains(nonParamElement)) {
									if (jContainer.getBodyDeclarations().contains(nonParamType)) {
										if (umlPackage.getPackagedElements().contains(uContainer)) {
											if (uContainer.equals(c2c.getTarget())) {
												if (nonParamElement.equals(ne2neNonParam.getTarget())) {
													if (jContainer.equals(c2c.getSource())) {
														if (nonParamPackage.equals(jp2up.getSource())) {
															if (nonParamType.equals(typeTypeAccess.getType())) {
																_result.add(new Object[] { umlPackage, ne2neNonParam,
																		uContainer, jContainer, nonParamType,
																		nonParamPackage, parameterizedType, jp2up,
																		typeTypeAccess, nonParamElement, c2c });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_2_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			org.eclipse.uml2.uml.Package umlPackage, ASTNode2Element ne2neNonParam, Interface uContainer,
			AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			JavaPackage2UmlPackage jp2up, TypeAccess typeTypeAccess, org.eclipse.uml2.uml.Class nonParamElement,
			ASTNode2Element c2c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ne2neNonParam__nonParamType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nonParamPackage__jContainer____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__nonParamPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge parameterizedType__typeTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__umlPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__nonParamElement____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__nonParamType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nonParamType__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__uContainer____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2neNonParam__nonParamElement____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__nonParamPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeTypeAccess__nonParamType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nonParamType__typeTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ne2neNonParam__nonParamType____source_name_prime = "source";
		String nonParamPackage__jContainer____ownedElements_name_prime = "ownedElements";
		String jContainer__nonParamPackage____package_name_prime = "package";
		String parameterizedType__typeTypeAccess____type_name_prime = "type";
		String jp2up__umlPackage____target_name_prime = "target";
		String uContainer__nonParamElement____nestedClassifier_name_prime = "nestedClassifier";
		String jContainer__nonParamType____bodyDeclarations_name_prime = "bodyDeclarations";
		String nonParamType__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String umlPackage__uContainer____packagedElement_name_prime = "packagedElement";
		String c2c__uContainer____target_name_prime = "target";
		String ne2neNonParam__nonParamElement____target_name_prime = "target";
		String c2c__jContainer____source_name_prime = "source";
		String jp2up__nonParamPackage____source_name_prime = "source";
		String typeTypeAccess__nonParamType____type_name_prime = "type";
		String nonParamType__typeTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		isApplicableMatch.getAllContextElements().add(umlPackage);
		isApplicableMatch.getAllContextElements().add(ne2neNonParam);
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(nonParamType);
		isApplicableMatch.getAllContextElements().add(nonParamPackage);
		isApplicableMatch.getAllContextElements().add(parameterizedType);
		isApplicableMatch.getAllContextElements().add(jp2up);
		isApplicableMatch.getAllContextElements().add(typeTypeAccess);
		isApplicableMatch.getAllContextElements().add(nonParamElement);
		isApplicableMatch.getAllContextElements().add(c2c);
		ne2neNonParam__nonParamType____source.setSrc(ne2neNonParam);
		ne2neNonParam__nonParamType____source.setTrg(nonParamType);
		isApplicableMatch.getAllContextElements().add(ne2neNonParam__nonParamType____source);
		nonParamPackage__jContainer____ownedElements.setSrc(nonParamPackage);
		nonParamPackage__jContainer____ownedElements.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(nonParamPackage__jContainer____ownedElements);
		jContainer__nonParamPackage____package.setSrc(jContainer);
		jContainer__nonParamPackage____package.setTrg(nonParamPackage);
		isApplicableMatch.getAllContextElements().add(jContainer__nonParamPackage____package);
		parameterizedType__typeTypeAccess____type.setSrc(parameterizedType);
		parameterizedType__typeTypeAccess____type.setTrg(typeTypeAccess);
		isApplicableMatch.getAllContextElements().add(parameterizedType__typeTypeAccess____type);
		jp2up__umlPackage____target.setSrc(jp2up);
		jp2up__umlPackage____target.setTrg(umlPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__umlPackage____target);
		uContainer__nonParamElement____nestedClassifier.setSrc(uContainer);
		uContainer__nonParamElement____nestedClassifier.setTrg(nonParamElement);
		isApplicableMatch.getAllContextElements().add(uContainer__nonParamElement____nestedClassifier);
		jContainer__nonParamType____bodyDeclarations.setSrc(jContainer);
		jContainer__nonParamType____bodyDeclarations.setTrg(nonParamType);
		isApplicableMatch.getAllContextElements().add(jContainer__nonParamType____bodyDeclarations);
		nonParamType__jContainer____abstractTypeDeclaration.setSrc(nonParamType);
		nonParamType__jContainer____abstractTypeDeclaration.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(nonParamType__jContainer____abstractTypeDeclaration);
		umlPackage__uContainer____packagedElement.setSrc(umlPackage);
		umlPackage__uContainer____packagedElement.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(umlPackage__uContainer____packagedElement);
		c2c__uContainer____target.setSrc(c2c);
		c2c__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(c2c__uContainer____target);
		ne2neNonParam__nonParamElement____target.setSrc(ne2neNonParam);
		ne2neNonParam__nonParamElement____target.setTrg(nonParamElement);
		isApplicableMatch.getAllContextElements().add(ne2neNonParam__nonParamElement____target);
		c2c__jContainer____source.setSrc(c2c);
		c2c__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(c2c__jContainer____source);
		jp2up__nonParamPackage____source.setSrc(jp2up);
		jp2up__nonParamPackage____source.setTrg(nonParamPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__nonParamPackage____source);
		typeTypeAccess__nonParamType____type.setSrc(typeTypeAccess);
		typeTypeAccess__nonParamType____type.setTrg(nonParamType);
		isApplicableMatch.getAllContextElements().add(typeTypeAccess__nonParamType____type);
		nonParamType__typeTypeAccess____usagesInTypeAccess.setSrc(nonParamType);
		nonParamType__typeTypeAccess____usagesInTypeAccess.setTrg(typeTypeAccess);
		isApplicableMatch.getAllContextElements().add(nonParamType__typeTypeAccess____usagesInTypeAccess);
		ne2neNonParam__nonParamType____source.setName(ne2neNonParam__nonParamType____source_name_prime);
		nonParamPackage__jContainer____ownedElements.setName(nonParamPackage__jContainer____ownedElements_name_prime);
		jContainer__nonParamPackage____package.setName(jContainer__nonParamPackage____package_name_prime);
		parameterizedType__typeTypeAccess____type.setName(parameterizedType__typeTypeAccess____type_name_prime);
		jp2up__umlPackage____target.setName(jp2up__umlPackage____target_name_prime);
		uContainer__nonParamElement____nestedClassifier
				.setName(uContainer__nonParamElement____nestedClassifier_name_prime);
		jContainer__nonParamType____bodyDeclarations.setName(jContainer__nonParamType____bodyDeclarations_name_prime);
		nonParamType__jContainer____abstractTypeDeclaration
				.setName(nonParamType__jContainer____abstractTypeDeclaration_name_prime);
		umlPackage__uContainer____packagedElement.setName(umlPackage__uContainer____packagedElement_name_prime);
		c2c__uContainer____target.setName(c2c__uContainer____target_name_prime);
		ne2neNonParam__nonParamElement____target.setName(ne2neNonParam__nonParamElement____target_name_prime);
		c2c__jContainer____source.setName(c2c__jContainer____source_name_prime);
		jp2up__nonParamPackage____source.setName(jp2up__nonParamPackage____source_name_prime);
		typeTypeAccess__nonParamType____type.setName(typeTypeAccess__nonParamType____type_name_prime);
		nonParamType__typeTypeAccess____usagesInTypeAccess
				.setName(nonParamType__typeTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType, nonParamPackage,
				parameterizedType, jp2up, typeTypeAccess, nonParamElement, c2c, isApplicableMatch,
				ne2neNonParam__nonParamType____source, nonParamPackage__jContainer____ownedElements,
				jContainer__nonParamPackage____package, parameterizedType__typeTypeAccess____type,
				jp2up__umlPackage____target, uContainer__nonParamElement____nestedClassifier,
				jContainer__nonParamType____bodyDeclarations, nonParamType__jContainer____abstractTypeDeclaration,
				umlPackage__uContainer____packagedElement, c2c__uContainer____target,
				ne2neNonParam__nonParamElement____target, c2c__jContainer____source, jp2up__nonParamPackage____source,
				typeTypeAccess__nonParamType____type, nonParamType__typeTypeAccess____usagesInTypeAccess };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_2_4_solveCSP_bindingFBBBBBBBBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, ASTNode2Element ne2neNonParam, Interface uContainer,
			AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			JavaPackage2UmlPackage jp2up, TypeAccess typeTypeAccess, org.eclipse.uml2.uml.Class nonParamElement,
			ASTNode2Element c2c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, umlPackage, ne2neNonParam, uContainer,
				jContainer, nonParamType, nonParamPackage, parameterizedType, jp2up, typeTypeAccess, nonParamElement,
				c2c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, umlPackage, ne2neNonParam, uContainer, jContainer,
					nonParamType, nonParamPackage, parameterizedType, jp2up, typeTypeAccess, nonParamElement, c2c };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, ASTNode2Element ne2neNonParam, Interface uContainer,
			AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			JavaPackage2UmlPackage jp2up, TypeAccess typeTypeAccess, org.eclipse.uml2.uml.Class nonParamElement,
			ASTNode2Element c2c) {
		Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_2_4_solveCSP_binding = pattern_ParameterizedType2Class_InnerTypeInInterface_2_4_solveCSP_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType,
				nonParamPackage, parameterizedType, jp2up, typeTypeAccess, nonParamElement, c2c);
		if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedType2Class_InnerTypeInInterface_2_4_solveCSP_binding[0];

			Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_2_4_solveCSP_black = pattern_ParameterizedType2Class_InnerTypeInInterface_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, umlPackage, ne2neNonParam, uContainer, jContainer,
						nonParamType, nonParamPackage, parameterizedType, jp2up, typeTypeAccess, nonParamElement, c2c };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_2_5_checkCSP_expressionFBB(
			ParameterizedType2Class_InnerTypeInInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterizedType2Class_InnerTypeInInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterizedType2Class_InnerTypeInInterface_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_10_1_initialbindings_blackBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, Match match, org.eclipse.uml2.uml.Package umlPackage,
			Interface uContainer, org.eclipse.uml2.uml.Class nonParamElement,
			org.eclipse.uml2.uml.Class parameterizedClassifier) {
		if (!nonParamElement.equals(parameterizedClassifier)) {
			return new Object[] { _this, match, umlPackage, uContainer, nonParamElement, parameterizedClassifier };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_10_2_SolveCSP_bindingFBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, Match match, org.eclipse.uml2.uml.Package umlPackage,
			Interface uContainer, org.eclipse.uml2.uml.Class nonParamElement,
			org.eclipse.uml2.uml.Class parameterizedClassifier) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, umlPackage, uContainer, nonParamElement,
				parameterizedClassifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, umlPackage, uContainer, nonParamElement, parameterizedClassifier };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, Match match, org.eclipse.uml2.uml.Package umlPackage,
			Interface uContainer, org.eclipse.uml2.uml.Class nonParamElement,
			org.eclipse.uml2.uml.Class parameterizedClassifier) {
		Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_10_2_SolveCSP_binding = pattern_ParameterizedType2Class_InnerTypeInInterface_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, umlPackage, uContainer, nonParamElement, parameterizedClassifier);
		if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedType2Class_InnerTypeInInterface_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_10_2_SolveCSP_black = pattern_ParameterizedType2Class_InnerTypeInInterface_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, umlPackage, uContainer, nonParamElement,
						parameterizedClassifier };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_10_3_CheckCSP_expressionFBB(
			ParameterizedType2Class_InnerTypeInInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_10_4_collectelementstobetranslated_blackBBBBB(
			Match match, org.eclipse.uml2.uml.Package umlPackage, Interface uContainer,
			org.eclipse.uml2.uml.Class nonParamElement, org.eclipse.uml2.uml.Class parameterizedClassifier) {
		if (!nonParamElement.equals(parameterizedClassifier)) {
			return new Object[] { match, umlPackage, uContainer, nonParamElement, parameterizedClassifier };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_10_4_collectelementstobetranslated_greenBBBF(
			Match match, org.eclipse.uml2.uml.Package umlPackage, org.eclipse.uml2.uml.Class parameterizedClassifier) {
		EMoflonEdge umlPackage__parameterizedClassifier____packagedElement = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(parameterizedClassifier);
		String umlPackage__parameterizedClassifier____packagedElement_name_prime = "packagedElement";
		umlPackage__parameterizedClassifier____packagedElement.setSrc(umlPackage);
		umlPackage__parameterizedClassifier____packagedElement.setTrg(parameterizedClassifier);
		match.getToBeTranslatedEdges().add(umlPackage__parameterizedClassifier____packagedElement);
		umlPackage__parameterizedClassifier____packagedElement
				.setName(umlPackage__parameterizedClassifier____packagedElement_name_prime);
		return new Object[] { match, umlPackage, parameterizedClassifier,
				umlPackage__parameterizedClassifier____packagedElement };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_10_5_collectcontextelements_blackBBBBB(
			Match match, org.eclipse.uml2.uml.Package umlPackage, Interface uContainer,
			org.eclipse.uml2.uml.Class nonParamElement, org.eclipse.uml2.uml.Class parameterizedClassifier) {
		if (!nonParamElement.equals(parameterizedClassifier)) {
			return new Object[] { match, umlPackage, uContainer, nonParamElement, parameterizedClassifier };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_10_5_collectcontextelements_greenBBBBFF(
			Match match, org.eclipse.uml2.uml.Package umlPackage, Interface uContainer,
			org.eclipse.uml2.uml.Class nonParamElement) {
		EMoflonEdge uContainer__nonParamElement____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__uContainer____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(umlPackage);
		match.getContextNodes().add(uContainer);
		match.getContextNodes().add(nonParamElement);
		String uContainer__nonParamElement____nestedClassifier_name_prime = "nestedClassifier";
		String umlPackage__uContainer____packagedElement_name_prime = "packagedElement";
		uContainer__nonParamElement____nestedClassifier.setSrc(uContainer);
		uContainer__nonParamElement____nestedClassifier.setTrg(nonParamElement);
		match.getContextEdges().add(uContainer__nonParamElement____nestedClassifier);
		umlPackage__uContainer____packagedElement.setSrc(umlPackage);
		umlPackage__uContainer____packagedElement.setTrg(uContainer);
		match.getContextEdges().add(umlPackage__uContainer____packagedElement);
		uContainer__nonParamElement____nestedClassifier
				.setName(uContainer__nonParamElement____nestedClassifier_name_prime);
		umlPackage__uContainer____packagedElement.setName(umlPackage__uContainer____packagedElement_name_prime);
		return new Object[] { match, umlPackage, uContainer, nonParamElement,
				uContainer__nonParamElement____nestedClassifier, umlPackage__uContainer____packagedElement };
	}

	public static final void pattern_ParameterizedType2Class_InnerTypeInInterface_10_6_registerobjectstomatch_expressionBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, Match match, org.eclipse.uml2.uml.Package umlPackage,
			Interface uContainer, org.eclipse.uml2.uml.Class nonParamElement,
			org.eclipse.uml2.uml.Class parameterizedClassifier) {
		_this.registerObjectsToMatch_BWD(match, umlPackage, uContainer, nonParamElement, parameterizedClassifier);

	}

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("umlPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("ne2neNonParam");
		EObject _localVariable_2 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_4 = isApplicableMatch.getObject("nonParamType");
		EObject _localVariable_5 = isApplicableMatch.getObject("nonParamPackage");
		EObject _localVariable_6 = isApplicableMatch.getObject("jp2up");
		EObject _localVariable_7 = isApplicableMatch.getObject("nonParamElement");
		EObject _localVariable_8 = isApplicableMatch.getObject("c2c");
		EObject _localVariable_9 = isApplicableMatch.getObject("parameterizedClassifier");
		EObject tmpUmlPackage = _localVariable_0;
		EObject tmpNe2neNonParam = _localVariable_1;
		EObject tmpUContainer = _localVariable_2;
		EObject tmpJContainer = _localVariable_3;
		EObject tmpNonParamType = _localVariable_4;
		EObject tmpNonParamPackage = _localVariable_5;
		EObject tmpJp2up = _localVariable_6;
		EObject tmpNonParamElement = _localVariable_7;
		EObject tmpC2c = _localVariable_8;
		EObject tmpParameterizedClassifier = _localVariable_9;
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
			if (tmpNe2neNonParam instanceof ASTNode2Element) {
				ASTNode2Element ne2neNonParam = (ASTNode2Element) tmpNe2neNonParam;
				if (tmpUContainer instanceof Interface) {
					Interface uContainer = (Interface) tmpUContainer;
					if (tmpJContainer instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
						if (tmpNonParamType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) tmpNonParamType;
							if (tmpNonParamPackage instanceof org.eclipse.modisco.java.Package) {
								org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) tmpNonParamPackage;
								if (tmpJp2up instanceof JavaPackage2UmlPackage) {
									JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) tmpJp2up;
									if (tmpNonParamElement instanceof org.eclipse.uml2.uml.Class) {
										org.eclipse.uml2.uml.Class nonParamElement = (org.eclipse.uml2.uml.Class) tmpNonParamElement;
										if (tmpC2c instanceof ASTNode2Element) {
											ASTNode2Element c2c = (ASTNode2Element) tmpC2c;
											if (tmpParameterizedClassifier instanceof org.eclipse.uml2.uml.Class) {
												org.eclipse.uml2.uml.Class parameterizedClassifier = (org.eclipse.uml2.uml.Class) tmpParameterizedClassifier;
												return new Object[] { umlPackage, ne2neNonParam, uContainer, jContainer,
														nonParamType, nonParamPackage, jp2up, nonParamElement, c2c,
														parameterizedClassifier, isApplicableMatch };
											}
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

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_blackBBBBBBBBBBFBB(
			org.eclipse.uml2.uml.Package umlPackage, ASTNode2Element ne2neNonParam, Interface uContainer,
			AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, JavaPackage2UmlPackage jp2up,
			org.eclipse.uml2.uml.Class nonParamElement, ASTNode2Element c2c,
			org.eclipse.uml2.uml.Class parameterizedClassifier, ParameterizedType2Class_InnerTypeInInterface _this,
			IsApplicableMatch isApplicableMatch) {
		if (!jContainer.equals(nonParamType)) {
			if (!nonParamElement.equals(parameterizedClassifier)) {
				if (!c2c.equals(ne2neNonParam)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType,
									nonParamPackage, jp2up, nonParamElement, c2c, parameterizedClassifier, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			ParameterizedType2Class_InnerTypeInInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_binding = pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result_pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_binding[0];
			ASTNode2Element ne2neNonParam = (ASTNode2Element) result_pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_binding[1];
			Interface uContainer = (Interface) result_pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_binding[2];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result_pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_binding[3];
			AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result_pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_binding[4];
			org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result_pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_binding[5];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result_pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_binding[6];
			org.eclipse.uml2.uml.Class nonParamElement = (org.eclipse.uml2.uml.Class) result_pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_binding[7];
			ASTNode2Element c2c = (ASTNode2Element) result_pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_binding[8];
			org.eclipse.uml2.uml.Class parameterizedClassifier = (org.eclipse.uml2.uml.Class) result_pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_binding[9];

			Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_black = pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_blackBBBBBBBBBBFBB(
					umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType, nonParamPackage, jp2up,
					nonParamElement, c2c, parameterizedClassifier, _this, isApplicableMatch);
			if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_black[10];

				return new Object[] { umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType, nonParamPackage,
						jp2up, nonParamElement, c2c, parameterizedClassifier, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_11_1_performtransformation_greenBFFFBB(
			AbstractTypeDeclaration nonParamType, org.eclipse.uml2.uml.Class parameterizedClassifier, CSP csp) {
		ParameterizedType parameterizedType = JavaFactory.eINSTANCE.createParameterizedType();
		ASTNode2Element ne2ne = UmlFactory.eINSTANCE.createASTNode2Element();
		TypeAccess typeTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		Object _localVariable_0 = csp.getValue("parameterizedType", "name");
		ne2ne.setSource(parameterizedType);
		ne2ne.setTarget(parameterizedClassifier);
		parameterizedType.setType(typeTypeAccess);
		typeTypeAccess.setType(nonParamType);
		String parameterizedType_name_prime = (String) _localVariable_0;
		parameterizedType.setName(parameterizedType_name_prime);
		return new Object[] { nonParamType, parameterizedType, ne2ne, typeTypeAccess, parameterizedClassifier, csp };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_11_2_collecttranslatedelements_blackBBBB(
			ParameterizedType parameterizedType, ASTNode2Element ne2ne, TypeAccess typeTypeAccess,
			org.eclipse.uml2.uml.Class parameterizedClassifier) {
		return new Object[] { parameterizedType, ne2ne, typeTypeAccess, parameterizedClassifier };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_11_2_collecttranslatedelements_greenFBBBB(
			ParameterizedType parameterizedType, ASTNode2Element ne2ne, TypeAccess typeTypeAccess,
			org.eclipse.uml2.uml.Class parameterizedClassifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(parameterizedType);
		ruleresult.getCreatedLinkElements().add(ne2ne);
		ruleresult.getCreatedElements().add(typeTypeAccess);
		ruleresult.getTranslatedElements().add(parameterizedClassifier);
		return new Object[] { ruleresult, parameterizedType, ne2ne, typeTypeAccess, parameterizedClassifier };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject umlPackage, EObject ne2neNonParam, EObject uContainer,
			EObject jContainer, EObject nonParamType, EObject nonParamPackage, EObject parameterizedType, EObject jp2up,
			EObject ne2ne, EObject typeTypeAccess, EObject nonParamElement, EObject c2c,
			EObject parameterizedClassifier) {
		if (!ne2neNonParam.equals(umlPackage)) {
			if (!ne2neNonParam.equals(uContainer)) {
				if (!ne2neNonParam.equals(nonParamType)) {
					if (!ne2neNonParam.equals(nonParamPackage)) {
						if (!ne2neNonParam.equals(parameterizedType)) {
							if (!ne2neNonParam.equals(typeTypeAccess)) {
								if (!ne2neNonParam.equals(nonParamElement)) {
									if (!ne2neNonParam.equals(parameterizedClassifier)) {
										if (!uContainer.equals(umlPackage)) {
											if (!jContainer.equals(umlPackage)) {
												if (!jContainer.equals(ne2neNonParam)) {
													if (!jContainer.equals(uContainer)) {
														if (!jContainer.equals(nonParamType)) {
															if (!jContainer.equals(nonParamPackage)) {
																if (!jContainer.equals(parameterizedType)) {
																	if (!jContainer.equals(jp2up)) {
																		if (!jContainer.equals(ne2ne)) {
																			if (!jContainer.equals(typeTypeAccess)) {
																				if (!jContainer
																						.equals(nonParamElement)) {
																					if (!jContainer.equals(
																							parameterizedClassifier)) {
																						if (!nonParamType
																								.equals(umlPackage)) {
																							if (!nonParamType.equals(
																									uContainer)) {
																								if (!nonParamType
																										.equals(parameterizedType)) {
																									if (!nonParamType
																											.equals(typeTypeAccess)) {
																										if (!nonParamType
																												.equals(parameterizedClassifier)) {
																											if (!nonParamPackage
																													.equals(umlPackage)) {
																												if (!nonParamPackage
																														.equals(uContainer)) {
																													if (!nonParamPackage
																															.equals(nonParamType)) {
																														if (!nonParamPackage
																																.equals(parameterizedType)) {
																															if (!nonParamPackage
																																	.equals(typeTypeAccess)) {
																																if (!nonParamPackage
																																		.equals(parameterizedClassifier)) {
																																	if (!parameterizedType
																																			.equals(umlPackage)) {
																																		if (!parameterizedType
																																				.equals(uContainer)) {
																																			if (!parameterizedType
																																					.equals(typeTypeAccess)) {
																																				if (!jp2up
																																						.equals(umlPackage)) {
																																					if (!jp2up
																																							.equals(ne2neNonParam)) {
																																						if (!jp2up
																																								.equals(uContainer)) {
																																							if (!jp2up
																																									.equals(nonParamType)) {
																																								if (!jp2up
																																										.equals(nonParamPackage)) {
																																									if (!jp2up
																																											.equals(parameterizedType)) {
																																										if (!jp2up
																																												.equals(ne2ne)) {
																																											if (!jp2up
																																													.equals(typeTypeAccess)) {
																																												if (!jp2up
																																														.equals(nonParamElement)) {
																																													if (!jp2up
																																															.equals(parameterizedClassifier)) {
																																														if (!ne2ne
																																																.equals(umlPackage)) {
																																															if (!ne2ne
																																																	.equals(ne2neNonParam)) {
																																																if (!ne2ne
																																																		.equals(uContainer)) {
																																																	if (!ne2ne
																																																			.equals(nonParamType)) {
																																																		if (!ne2ne
																																																				.equals(nonParamPackage)) {
																																																			if (!ne2ne
																																																					.equals(parameterizedType)) {
																																																				if (!ne2ne
																																																						.equals(typeTypeAccess)) {
																																																					if (!ne2ne
																																																							.equals(nonParamElement)) {
																																																						if (!ne2ne
																																																								.equals(parameterizedClassifier)) {
																																																							if (!typeTypeAccess
																																																									.equals(umlPackage)) {
																																																								if (!typeTypeAccess
																																																										.equals(uContainer)) {
																																																									if (!nonParamElement
																																																											.equals(umlPackage)) {
																																																										if (!nonParamElement
																																																												.equals(uContainer)) {
																																																											if (!nonParamElement
																																																													.equals(nonParamType)) {
																																																												if (!nonParamElement
																																																														.equals(nonParamPackage)) {
																																																													if (!nonParamElement
																																																															.equals(parameterizedType)) {
																																																														if (!nonParamElement
																																																																.equals(typeTypeAccess)) {
																																																															if (!nonParamElement
																																																																	.equals(parameterizedClassifier)) {
																																																																if (!c2c.equals(
																																																																		umlPackage)) {
																																																																	if (!c2c.equals(
																																																																			ne2neNonParam)) {
																																																																		if (!c2c.equals(
																																																																				uContainer)) {
																																																																			if (!c2c.equals(
																																																																					jContainer)) {
																																																																				if (!c2c.equals(
																																																																						nonParamType)) {
																																																																					if (!c2c.equals(
																																																																							nonParamPackage)) {
																																																																						if (!c2c.equals(
																																																																								parameterizedType)) {
																																																																							if (!c2c.equals(
																																																																									jp2up)) {
																																																																								if (!c2c.equals(
																																																																										ne2ne)) {
																																																																									if (!c2c.equals(
																																																																											typeTypeAccess)) {
																																																																										if (!c2c.equals(
																																																																												nonParamElement)) {
																																																																											if (!c2c.equals(
																																																																													parameterizedClassifier)) {
																																																																												if (!parameterizedClassifier
																																																																														.equals(umlPackage)) {
																																																																													if (!parameterizedClassifier
																																																																															.equals(uContainer)) {
																																																																														if (!parameterizedClassifier
																																																																																.equals(parameterizedType)) {
																																																																															if (!parameterizedClassifier
																																																																																	.equals(typeTypeAccess)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		umlPackage,
																																																																																		ne2neNonParam,
																																																																																		uContainer,
																																																																																		jContainer,
																																																																																		nonParamType,
																																																																																		nonParamPackage,
																																																																																		parameterizedType,
																																																																																		jp2up,
																																																																																		ne2ne,
																																																																																		typeTypeAccess,
																																																																																		nonParamElement,
																																																																																		c2c,
																																																																																		parameterizedClassifier };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject umlPackage, EObject nonParamType, EObject parameterizedType,
			EObject ne2ne, EObject typeTypeAccess, EObject parameterizedClassifier) {
		EMoflonEdge ne2ne__parameterizedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge parameterizedType__typeTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__parameterizedClassifier____packagedElement = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ne2ne__parameterizedClassifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeTypeAccess__nonParamType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nonParamType__typeTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterizedType2Class_InnerTypeInInterface";
		String ne2ne__parameterizedType____source_name_prime = "source";
		String parameterizedType__typeTypeAccess____type_name_prime = "type";
		String umlPackage__parameterizedClassifier____packagedElement_name_prime = "packagedElement";
		String ne2ne__parameterizedClassifier____target_name_prime = "target";
		String typeTypeAccess__nonParamType____type_name_prime = "type";
		String nonParamType__typeTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		ne2ne__parameterizedType____source.setSrc(ne2ne);
		ne2ne__parameterizedType____source.setTrg(parameterizedType);
		ruleresult.getCreatedEdges().add(ne2ne__parameterizedType____source);
		parameterizedType__typeTypeAccess____type.setSrc(parameterizedType);
		parameterizedType__typeTypeAccess____type.setTrg(typeTypeAccess);
		ruleresult.getCreatedEdges().add(parameterizedType__typeTypeAccess____type);
		umlPackage__parameterizedClassifier____packagedElement.setSrc(umlPackage);
		umlPackage__parameterizedClassifier____packagedElement.setTrg(parameterizedClassifier);
		ruleresult.getTranslatedEdges().add(umlPackage__parameterizedClassifier____packagedElement);
		ne2ne__parameterizedClassifier____target.setSrc(ne2ne);
		ne2ne__parameterizedClassifier____target.setTrg(parameterizedClassifier);
		ruleresult.getCreatedEdges().add(ne2ne__parameterizedClassifier____target);
		typeTypeAccess__nonParamType____type.setSrc(typeTypeAccess);
		typeTypeAccess__nonParamType____type.setTrg(nonParamType);
		ruleresult.getCreatedEdges().add(typeTypeAccess__nonParamType____type);
		nonParamType__typeTypeAccess____usagesInTypeAccess.setSrc(nonParamType);
		nonParamType__typeTypeAccess____usagesInTypeAccess.setTrg(typeTypeAccess);
		ruleresult.getCreatedEdges().add(nonParamType__typeTypeAccess____usagesInTypeAccess);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		ne2ne__parameterizedType____source.setName(ne2ne__parameterizedType____source_name_prime);
		parameterizedType__typeTypeAccess____type.setName(parameterizedType__typeTypeAccess____type_name_prime);
		umlPackage__parameterizedClassifier____packagedElement
				.setName(umlPackage__parameterizedClassifier____packagedElement_name_prime);
		ne2ne__parameterizedClassifier____target.setName(ne2ne__parameterizedClassifier____target_name_prime);
		typeTypeAccess__nonParamType____type.setName(typeTypeAccess__nonParamType____type_name_prime);
		nonParamType__typeTypeAccess____usagesInTypeAccess
				.setName(nonParamType__typeTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { ruleresult, umlPackage, nonParamType, parameterizedType, ne2ne, typeTypeAccess,
				parameterizedClassifier, ne2ne__parameterizedType____source, parameterizedType__typeTypeAccess____type,
				umlPackage__parameterizedClassifier____packagedElement, ne2ne__parameterizedClassifier____target,
				typeTypeAccess__nonParamType____type, nonParamType__typeTypeAccess____usagesInTypeAccess };
	}

	public static final void pattern_ParameterizedType2Class_InnerTypeInInterface_11_5_registerobjects_expressionBBBBBBBBBBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, PerformRuleResult ruleresult, EObject umlPackage,
			EObject ne2neNonParam, EObject uContainer, EObject jContainer, EObject nonParamType,
			EObject nonParamPackage, EObject parameterizedType, EObject jp2up, EObject ne2ne, EObject typeTypeAccess,
			EObject nonParamElement, EObject c2c, EObject parameterizedClassifier) {
		_this.registerObjects_BWD(ruleresult, umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType,
				nonParamPackage, parameterizedType, jp2up, ne2ne, typeTypeAccess, nonParamElement, c2c,
				parameterizedClassifier);

	}

	public static final PerformRuleResult pattern_ParameterizedType2Class_InnerTypeInInterface_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_12_1_preparereturnvalue_bindingFB(
			ParameterizedType2Class_InnerTypeInInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_12_1_preparereturnvalue_blackFBB(
			EClass eClass, ParameterizedType2Class_InnerTypeInInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_12_1_preparereturnvalue_bindingAndBlackFFB(
			ParameterizedType2Class_InnerTypeInInterface _this) {
		Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_12_1_preparereturnvalue_binding = pattern_ParameterizedType2Class_InnerTypeInInterface_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterizedType2Class_InnerTypeInInterface_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_12_1_preparereturnvalue_black = pattern_ParameterizedType2Class_InnerTypeInInterface_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterizedType2Class_InnerTypeInInterface_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ParameterizedType2Class_InnerTypeInInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_12_2_corematch_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("umlPackage");
		EObject _localVariable_1 = match.getObject("uContainer");
		EObject _localVariable_2 = match.getObject("nonParamElement");
		EObject _localVariable_3 = match.getObject("parameterizedClassifier");
		EObject tmpUmlPackage = _localVariable_0;
		EObject tmpUContainer = _localVariable_1;
		EObject tmpNonParamElement = _localVariable_2;
		EObject tmpParameterizedClassifier = _localVariable_3;
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
			if (tmpUContainer instanceof Interface) {
				Interface uContainer = (Interface) tmpUContainer;
				if (tmpNonParamElement instanceof org.eclipse.uml2.uml.Class) {
					org.eclipse.uml2.uml.Class nonParamElement = (org.eclipse.uml2.uml.Class) tmpNonParamElement;
					if (tmpParameterizedClassifier instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class parameterizedClassifier = (org.eclipse.uml2.uml.Class) tmpParameterizedClassifier;
						return new Object[] { umlPackage, uContainer, nonParamElement, parameterizedClassifier, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedType2Class_InnerTypeInInterface_12_2_corematch_blackBFBFFFFBFBB(
			org.eclipse.uml2.uml.Package umlPackage, Interface uContainer, org.eclipse.uml2.uml.Class nonParamElement,
			org.eclipse.uml2.uml.Class parameterizedClassifier, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!nonParamElement.equals(parameterizedClassifier)) {
			for (JavaPackage2UmlPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(umlPackage, JavaPackage2UmlPackage.class, "target")) {
				org.eclipse.modisco.java.Package nonParamPackage = jp2up.getSource();
				if (nonParamPackage != null) {
					for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(uContainer, ASTNode2Element.class, "target")) {
						ASTNode tmpJContainer = c2c.getSource();
						if (tmpJContainer instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
							for (ASTNode2Element ne2neNonParam : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(nonParamElement, ASTNode2Element.class, "target")) {
								if (!c2c.equals(ne2neNonParam)) {
									ASTNode tmpNonParamType = ne2neNonParam.getSource();
									if (tmpNonParamType instanceof AbstractTypeDeclaration) {
										AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) tmpNonParamType;
										if (!jContainer.equals(nonParamType)) {
											_result.add(new Object[] { umlPackage, ne2neNonParam, uContainer,
													jContainer, nonParamType, nonParamPackage, jp2up, nonParamElement,
													c2c, parameterizedClassifier, match });
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

	public static final Iterable<Object[]> pattern_ParameterizedType2Class_InnerTypeInInterface_12_3_findcontext_blackBBBBBBBBBB(
			org.eclipse.uml2.uml.Package umlPackage, ASTNode2Element ne2neNonParam, Interface uContainer,
			AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, JavaPackage2UmlPackage jp2up,
			org.eclipse.uml2.uml.Class nonParamElement, ASTNode2Element c2c,
			org.eclipse.uml2.uml.Class parameterizedClassifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jContainer.equals(nonParamType)) {
			if (!nonParamElement.equals(parameterizedClassifier)) {
				if (!c2c.equals(ne2neNonParam)) {
					if (nonParamType.equals(ne2neNonParam.getSource())) {
						if (nonParamPackage.getOwnedElements().contains(jContainer)) {
							if (umlPackage.equals(jp2up.getTarget())) {
								if (uContainer.getNestedClassifiers().contains(nonParamElement)) {
									if (umlPackage.getPackagedElements().contains(parameterizedClassifier)) {
										if (jContainer.getBodyDeclarations().contains(nonParamType)) {
											if (umlPackage.getPackagedElements().contains(uContainer)) {
												if (uContainer.equals(c2c.getTarget())) {
													if (nonParamElement.equals(ne2neNonParam.getTarget())) {
														if (jContainer.equals(c2c.getSource())) {
															if (nonParamPackage.equals(jp2up.getSource())) {
																_result.add(new Object[] { umlPackage, ne2neNonParam,
																		uContainer, jContainer, nonParamType,
																		nonParamPackage, jp2up, nonParamElement, c2c,
																		parameterizedClassifier });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFF(
			org.eclipse.uml2.uml.Package umlPackage, ASTNode2Element ne2neNonParam, Interface uContainer,
			AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, JavaPackage2UmlPackage jp2up,
			org.eclipse.uml2.uml.Class nonParamElement, ASTNode2Element c2c,
			org.eclipse.uml2.uml.Class parameterizedClassifier) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ne2neNonParam__nonParamType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nonParamPackage__jContainer____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__nonParamPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__umlPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__nonParamElement____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__parameterizedClassifier____packagedElement = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jContainer__nonParamType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nonParamType__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__uContainer____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2neNonParam__nonParamElement____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__nonParamPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ne2neNonParam__nonParamType____source_name_prime = "source";
		String nonParamPackage__jContainer____ownedElements_name_prime = "ownedElements";
		String jContainer__nonParamPackage____package_name_prime = "package";
		String jp2up__umlPackage____target_name_prime = "target";
		String uContainer__nonParamElement____nestedClassifier_name_prime = "nestedClassifier";
		String umlPackage__parameterizedClassifier____packagedElement_name_prime = "packagedElement";
		String jContainer__nonParamType____bodyDeclarations_name_prime = "bodyDeclarations";
		String nonParamType__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String umlPackage__uContainer____packagedElement_name_prime = "packagedElement";
		String c2c__uContainer____target_name_prime = "target";
		String ne2neNonParam__nonParamElement____target_name_prime = "target";
		String c2c__jContainer____source_name_prime = "source";
		String jp2up__nonParamPackage____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(umlPackage);
		isApplicableMatch.getAllContextElements().add(ne2neNonParam);
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(nonParamType);
		isApplicableMatch.getAllContextElements().add(nonParamPackage);
		isApplicableMatch.getAllContextElements().add(jp2up);
		isApplicableMatch.getAllContextElements().add(nonParamElement);
		isApplicableMatch.getAllContextElements().add(c2c);
		isApplicableMatch.getAllContextElements().add(parameterizedClassifier);
		ne2neNonParam__nonParamType____source.setSrc(ne2neNonParam);
		ne2neNonParam__nonParamType____source.setTrg(nonParamType);
		isApplicableMatch.getAllContextElements().add(ne2neNonParam__nonParamType____source);
		nonParamPackage__jContainer____ownedElements.setSrc(nonParamPackage);
		nonParamPackage__jContainer____ownedElements.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(nonParamPackage__jContainer____ownedElements);
		jContainer__nonParamPackage____package.setSrc(jContainer);
		jContainer__nonParamPackage____package.setTrg(nonParamPackage);
		isApplicableMatch.getAllContextElements().add(jContainer__nonParamPackage____package);
		jp2up__umlPackage____target.setSrc(jp2up);
		jp2up__umlPackage____target.setTrg(umlPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__umlPackage____target);
		uContainer__nonParamElement____nestedClassifier.setSrc(uContainer);
		uContainer__nonParamElement____nestedClassifier.setTrg(nonParamElement);
		isApplicableMatch.getAllContextElements().add(uContainer__nonParamElement____nestedClassifier);
		umlPackage__parameterizedClassifier____packagedElement.setSrc(umlPackage);
		umlPackage__parameterizedClassifier____packagedElement.setTrg(parameterizedClassifier);
		isApplicableMatch.getAllContextElements().add(umlPackage__parameterizedClassifier____packagedElement);
		jContainer__nonParamType____bodyDeclarations.setSrc(jContainer);
		jContainer__nonParamType____bodyDeclarations.setTrg(nonParamType);
		isApplicableMatch.getAllContextElements().add(jContainer__nonParamType____bodyDeclarations);
		nonParamType__jContainer____abstractTypeDeclaration.setSrc(nonParamType);
		nonParamType__jContainer____abstractTypeDeclaration.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(nonParamType__jContainer____abstractTypeDeclaration);
		umlPackage__uContainer____packagedElement.setSrc(umlPackage);
		umlPackage__uContainer____packagedElement.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(umlPackage__uContainer____packagedElement);
		c2c__uContainer____target.setSrc(c2c);
		c2c__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(c2c__uContainer____target);
		ne2neNonParam__nonParamElement____target.setSrc(ne2neNonParam);
		ne2neNonParam__nonParamElement____target.setTrg(nonParamElement);
		isApplicableMatch.getAllContextElements().add(ne2neNonParam__nonParamElement____target);
		c2c__jContainer____source.setSrc(c2c);
		c2c__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(c2c__jContainer____source);
		jp2up__nonParamPackage____source.setSrc(jp2up);
		jp2up__nonParamPackage____source.setTrg(nonParamPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__nonParamPackage____source);
		ne2neNonParam__nonParamType____source.setName(ne2neNonParam__nonParamType____source_name_prime);
		nonParamPackage__jContainer____ownedElements.setName(nonParamPackage__jContainer____ownedElements_name_prime);
		jContainer__nonParamPackage____package.setName(jContainer__nonParamPackage____package_name_prime);
		jp2up__umlPackage____target.setName(jp2up__umlPackage____target_name_prime);
		uContainer__nonParamElement____nestedClassifier
				.setName(uContainer__nonParamElement____nestedClassifier_name_prime);
		umlPackage__parameterizedClassifier____packagedElement
				.setName(umlPackage__parameterizedClassifier____packagedElement_name_prime);
		jContainer__nonParamType____bodyDeclarations.setName(jContainer__nonParamType____bodyDeclarations_name_prime);
		nonParamType__jContainer____abstractTypeDeclaration
				.setName(nonParamType__jContainer____abstractTypeDeclaration_name_prime);
		umlPackage__uContainer____packagedElement.setName(umlPackage__uContainer____packagedElement_name_prime);
		c2c__uContainer____target.setName(c2c__uContainer____target_name_prime);
		ne2neNonParam__nonParamElement____target.setName(ne2neNonParam__nonParamElement____target_name_prime);
		c2c__jContainer____source.setName(c2c__jContainer____source_name_prime);
		jp2up__nonParamPackage____source.setName(jp2up__nonParamPackage____source_name_prime);
		return new Object[] { umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType, nonParamPackage, jp2up,
				nonParamElement, c2c, parameterizedClassifier, isApplicableMatch, ne2neNonParam__nonParamType____source,
				nonParamPackage__jContainer____ownedElements, jContainer__nonParamPackage____package,
				jp2up__umlPackage____target, uContainer__nonParamElement____nestedClassifier,
				umlPackage__parameterizedClassifier____packagedElement, jContainer__nonParamType____bodyDeclarations,
				nonParamType__jContainer____abstractTypeDeclaration, umlPackage__uContainer____packagedElement,
				c2c__uContainer____target, ne2neNonParam__nonParamElement____target, c2c__jContainer____source,
				jp2up__nonParamPackage____source };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_12_4_solveCSP_bindingFBBBBBBBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, ASTNode2Element ne2neNonParam, Interface uContainer,
			AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, JavaPackage2UmlPackage jp2up,
			org.eclipse.uml2.uml.Class nonParamElement, ASTNode2Element c2c,
			org.eclipse.uml2.uml.Class parameterizedClassifier) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, umlPackage, ne2neNonParam, uContainer,
				jContainer, nonParamType, nonParamPackage, jp2up, nonParamElement, c2c, parameterizedClassifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, umlPackage, ne2neNonParam, uContainer, jContainer,
					nonParamType, nonParamPackage, jp2up, nonParamElement, c2c, parameterizedClassifier };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, ASTNode2Element ne2neNonParam, Interface uContainer,
			AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, JavaPackage2UmlPackage jp2up,
			org.eclipse.uml2.uml.Class nonParamElement, ASTNode2Element c2c,
			org.eclipse.uml2.uml.Class parameterizedClassifier) {
		Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_12_4_solveCSP_binding = pattern_ParameterizedType2Class_InnerTypeInInterface_12_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType,
				nonParamPackage, jp2up, nonParamElement, c2c, parameterizedClassifier);
		if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedType2Class_InnerTypeInInterface_12_4_solveCSP_binding[0];

			Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_12_4_solveCSP_black = pattern_ParameterizedType2Class_InnerTypeInInterface_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, umlPackage, ne2neNonParam, uContainer, jContainer,
						nonParamType, nonParamPackage, jp2up, nonParamElement, c2c, parameterizedClassifier };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_12_5_checkCSP_expressionFBB(
			ParameterizedType2Class_InnerTypeInInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterizedType2Class_InnerTypeInInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterizedType2Class_InnerTypeInInterface_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_20_1_preparereturnvalue_bindingFB(
			ParameterizedType2Class_InnerTypeInInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, ParameterizedType2Class_InnerTypeInInterface _this) {
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

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ParameterizedType2Class_InnerTypeInInterface _this) {
		Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_20_1_preparereturnvalue_binding = pattern_ParameterizedType2Class_InnerTypeInInterface_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterizedType2Class_InnerTypeInInterface_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_20_1_preparereturnvalue_black = pattern_ParameterizedType2Class_InnerTypeInInterface_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterizedType2Class_InnerTypeInInterface_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ParameterizedType2Class_InnerTypeInInterface_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParameterizedType2Class_InnerTypeInInterface_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_packagedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUmlPackage = _edge_packagedElement.getSrc();
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
			EObject tmpParameterizedClassifier = _edge_packagedElement.getTrg();
			if (tmpParameterizedClassifier instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class parameterizedClassifier = (org.eclipse.uml2.uml.Class) tmpParameterizedClassifier;
				if (umlPackage.getPackagedElements().contains(parameterizedClassifier)) {
					for (PackageableElement tmpUContainer : umlPackage.getPackagedElements()) {
						if (tmpUContainer instanceof Interface) {
							Interface uContainer = (Interface) tmpUContainer;
							for (Classifier tmpNonParamElement : uContainer.getNestedClassifiers()) {
								if (tmpNonParamElement instanceof org.eclipse.uml2.uml.Class) {
									org.eclipse.uml2.uml.Class nonParamElement = (org.eclipse.uml2.uml.Class) tmpNonParamElement;
									if (!nonParamElement.equals(parameterizedClassifier)) {
										_result.add(new Object[] { umlPackage, uContainer, nonParamElement,
												parameterizedClassifier, _edge_packagedElement });
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

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, Match match, org.eclipse.uml2.uml.Package umlPackage,
			Interface uContainer, org.eclipse.uml2.uml.Class nonParamElement,
			org.eclipse.uml2.uml.Class parameterizedClassifier) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, umlPackage, uContainer, nonParamElement,
				parameterizedClassifier);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ParameterizedType2Class_InnerTypeInInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ParameterizedType2Class_InnerTypeInInterface_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_21_1_preparereturnvalue_bindingFB(
			ParameterizedType2Class_InnerTypeInInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, ParameterizedType2Class_InnerTypeInInterface _this) {
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

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ParameterizedType2Class_InnerTypeInInterface _this) {
		Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_21_1_preparereturnvalue_binding = pattern_ParameterizedType2Class_InnerTypeInInterface_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterizedType2Class_InnerTypeInInterface_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_21_1_preparereturnvalue_black = pattern_ParameterizedType2Class_InnerTypeInInterface_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterizedType2Class_InnerTypeInInterface_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ParameterizedType2Class_InnerTypeInInterface_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_0BBB(
			TypeAccess typeTypeAccess, AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType) {
		if (!jContainer.equals(nonParamType)) {
			for (AbstractTypeDeclaration __DEC_typeTypeAccess_superInterfaces_168511 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(typeTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
				if (!jContainer.equals(__DEC_typeTypeAccess_superInterfaces_168511)) {
					if (!nonParamType.equals(__DEC_typeTypeAccess_superInterfaces_168511)) {
						return new Object[] { typeTypeAccess, jContainer, nonParamType };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess typeTypeAccess) {
		for (Annotation __DEC_typeTypeAccess_type_983073 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, Annotation.class, "type")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_2B(
			TypeAccess typeTypeAccess) {
		for (ArrayType __DEC_typeTypeAccess_elementType_365310 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, ArrayType.class, "elementType")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_3BBB(
			TypeAccess typeTypeAccess, AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType) {
		if (!jContainer.equals(nonParamType)) {
			for (ClassDeclaration __DEC_typeTypeAccess_superClass_406686 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(typeTypeAccess, ClassDeclaration.class, "superClass")) {
				if (!jContainer.equals(__DEC_typeTypeAccess_superClass_406686)) {
					if (!nonParamType.equals(__DEC_typeTypeAccess_superClass_406686)) {
						return new Object[] { typeTypeAccess, jContainer, nonParamType };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_4B(
			TypeAccess typeTypeAccess) {
		for (MethodDeclaration __DEC_typeTypeAccess_returnType_165596 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess typeTypeAccess) {
		for (SingleVariableDeclaration __DEC_typeTypeAccess_type_856943 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess typeTypeAccess) {
		for (AnnotationMemberValuePair __DEC_typeTypeAccess_value_438476 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_7BB(
			AbstractTypeDeclaration jContainer, TypeAccess typeTypeAccess) {
		if (jContainer.getSuperInterfaces().contains(typeTypeAccess)) {
			return new Object[] { jContainer, typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_8BB(
			AbstractTypeDeclaration nonParamType, TypeAccess typeTypeAccess) {
		if (nonParamType.getSuperInterfaces().contains(typeTypeAccess)) {
			return new Object[] { nonParamType, typeTypeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpParameterizedType = _edge_type.getSrc();
		if (tmpParameterizedType instanceof ParameterizedType) {
			ParameterizedType parameterizedType = (ParameterizedType) tmpParameterizedType;
			EObject tmpTypeTypeAccess = _edge_type.getTrg();
			if (tmpTypeTypeAccess instanceof TypeAccess) {
				TypeAccess typeTypeAccess = (TypeAccess) tmpTypeTypeAccess;
				if (typeTypeAccess.equals(parameterizedType.getType())) {
					Type tmpNonParamType = typeTypeAccess.getType();
					if (tmpNonParamType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) tmpNonParamType;
						AbstractTypeDeclaration jContainer = nonParamType.getAbstractTypeDeclaration();
						if (jContainer != null) {
							if (!jContainer.equals(nonParamType)) {
								org.eclipse.modisco.java.Package nonParamPackage = jContainer.getPackage();
								if (nonParamPackage != null) {
									if (pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_1B(
											typeTypeAccess) == null) {
										if (pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_2B(
												typeTypeAccess) == null) {
											if (pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_4B(
													typeTypeAccess) == null) {
												if (pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_5B(
														typeTypeAccess) == null) {
													if (pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_6B(
															typeTypeAccess) == null) {
														if (pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_8BB(
																nonParamType, typeTypeAccess) == null) {
															if (pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_0BBB(
																	typeTypeAccess, jContainer, nonParamType) == null) {
																if (pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_3BBB(
																		typeTypeAccess, jContainer,
																		nonParamType) == null) {
																	if (pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_black_nac_7BB(
																			jContainer, typeTypeAccess) == null) {
																		_result.add(new Object[] { jContainer,
																				nonParamType, nonParamPackage,
																				parameterizedType, typeTypeAccess,
																				_edge_type });
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, Match match, AbstractTypeDeclaration jContainer,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, TypeAccess typeTypeAccess) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jContainer, nonParamType, nonParamPackage,
				parameterizedType, typeTypeAccess);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ParameterizedType2Class_InnerTypeInInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ParameterizedType2Class_InnerTypeInInterface_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_24_1_prepare_blackB(
			ParameterizedType2Class_InnerTypeInInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_bindingFFFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("umlPackage");
		EObject _localVariable_1 = targetMatch.getObject("uContainer");
		EObject _localVariable_2 = sourceMatch.getObject("jContainer");
		EObject _localVariable_3 = sourceMatch.getObject("nonParamType");
		EObject _localVariable_4 = sourceMatch.getObject("nonParamPackage");
		EObject _localVariable_5 = sourceMatch.getObject("parameterizedType");
		EObject _localVariable_6 = sourceMatch.getObject("typeTypeAccess");
		EObject _localVariable_7 = targetMatch.getObject("nonParamElement");
		EObject _localVariable_8 = targetMatch.getObject("parameterizedClassifier");
		EObject tmpUmlPackage = _localVariable_0;
		EObject tmpUContainer = _localVariable_1;
		EObject tmpJContainer = _localVariable_2;
		EObject tmpNonParamType = _localVariable_3;
		EObject tmpNonParamPackage = _localVariable_4;
		EObject tmpParameterizedType = _localVariable_5;
		EObject tmpTypeTypeAccess = _localVariable_6;
		EObject tmpNonParamElement = _localVariable_7;
		EObject tmpParameterizedClassifier = _localVariable_8;
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
			if (tmpUContainer instanceof Interface) {
				Interface uContainer = (Interface) tmpUContainer;
				if (tmpJContainer instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
					if (tmpNonParamType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) tmpNonParamType;
						if (tmpNonParamPackage instanceof org.eclipse.modisco.java.Package) {
							org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) tmpNonParamPackage;
							if (tmpParameterizedType instanceof ParameterizedType) {
								ParameterizedType parameterizedType = (ParameterizedType) tmpParameterizedType;
								if (tmpTypeTypeAccess instanceof TypeAccess) {
									TypeAccess typeTypeAccess = (TypeAccess) tmpTypeTypeAccess;
									if (tmpNonParamElement instanceof org.eclipse.uml2.uml.Class) {
										org.eclipse.uml2.uml.Class nonParamElement = (org.eclipse.uml2.uml.Class) tmpNonParamElement;
										if (tmpParameterizedClassifier instanceof org.eclipse.uml2.uml.Class) {
											org.eclipse.uml2.uml.Class parameterizedClassifier = (org.eclipse.uml2.uml.Class) tmpParameterizedClassifier;
											return new Object[] { umlPackage, uContainer, jContainer, nonParamType,
													nonParamPackage, parameterizedType, typeTypeAccess, nonParamElement,
													parameterizedClassifier, targetMatch, sourceMatch };
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

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_blackBBBBBBBBBBB(
			org.eclipse.uml2.uml.Package umlPackage, Interface uContainer, AbstractTypeDeclaration jContainer,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, TypeAccess typeTypeAccess, org.eclipse.uml2.uml.Class nonParamElement,
			org.eclipse.uml2.uml.Class parameterizedClassifier, Match sourceMatch, Match targetMatch) {
		if (!jContainer.equals(nonParamType)) {
			if (!nonParamElement.equals(parameterizedClassifier)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { umlPackage, uContainer, jContainer, nonParamType, nonParamPackage,
							parameterizedType, typeTypeAccess, nonParamElement, parameterizedClassifier, sourceMatch,
							targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_binding = pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_bindingFFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_binding[0];
			Interface uContainer = (Interface) result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_binding[1];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_binding[2];
			AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_binding[3];
			org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_binding[4];
			ParameterizedType parameterizedType = (ParameterizedType) result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_binding[5];
			TypeAccess typeTypeAccess = (TypeAccess) result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_binding[6];
			org.eclipse.uml2.uml.Class nonParamElement = (org.eclipse.uml2.uml.Class) result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_binding[7];
			org.eclipse.uml2.uml.Class parameterizedClassifier = (org.eclipse.uml2.uml.Class) result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_binding[8];

			Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_black = pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_blackBBBBBBBBBBB(
					umlPackage, uContainer, jContainer, nonParamType, nonParamPackage, parameterizedType,
					typeTypeAccess, nonParamElement, parameterizedClassifier, sourceMatch, targetMatch);
			if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { umlPackage, uContainer, jContainer, nonParamType, nonParamPackage,
						parameterizedType, typeTypeAccess, nonParamElement, parameterizedClassifier, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_24_3_solvecsp_bindingFBBBBBBBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, org.eclipse.uml2.uml.Package umlPackage,
			Interface uContainer, AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess, org.eclipse.uml2.uml.Class nonParamElement,
			org.eclipse.uml2.uml.Class parameterizedClassifier, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_9 = _this.isApplicable_solveCsp_CC(umlPackage, uContainer, jContainer, nonParamType,
				nonParamPackage, parameterizedType, typeTypeAccess, nonParamElement, parameterizedClassifier,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_9;
		if (csp != null) {
			return new Object[] { csp, _this, umlPackage, uContainer, jContainer, nonParamType, nonParamPackage,
					parameterizedType, typeTypeAccess, nonParamElement, parameterizedClassifier, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, org.eclipse.uml2.uml.Package umlPackage,
			Interface uContainer, AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess, org.eclipse.uml2.uml.Class nonParamElement,
			org.eclipse.uml2.uml.Class parameterizedClassifier, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_3_solvecsp_binding = pattern_ParameterizedType2Class_InnerTypeInInterface_24_3_solvecsp_bindingFBBBBBBBBBBBB(
				_this, umlPackage, uContainer, jContainer, nonParamType, nonParamPackage, parameterizedType,
				typeTypeAccess, nonParamElement, parameterizedClassifier, sourceMatch, targetMatch);
		if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_3_solvecsp_binding[0];

			Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_3_solvecsp_black = pattern_ParameterizedType2Class_InnerTypeInInterface_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, umlPackage, uContainer, jContainer, nonParamType, nonParamPackage,
						parameterizedType, typeTypeAccess, nonParamElement, parameterizedClassifier, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_24_4_checkCSP_expressionFB(
			CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterizedType2Class_InnerTypeInInterface_24_5_matchcorrcontext_blackBFBBBBFBFBB(
			org.eclipse.uml2.uml.Package umlPackage, Interface uContainer, AbstractTypeDeclaration jContainer,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			org.eclipse.uml2.uml.Class nonParamElement, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jContainer.equals(nonParamType)) {
			if (!sourceMatch.equals(targetMatch)) {
				for (ASTNode2Element ne2neNonParam : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(nonParamType, ASTNode2Element.class, "source")) {
					if (nonParamElement.equals(ne2neNonParam.getTarget())) {
						for (JavaPackage2UmlPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(umlPackage, JavaPackage2UmlPackage.class, "target")) {
							if (nonParamPackage.equals(jp2up.getSource())) {
								for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(uContainer, ASTNode2Element.class, "target")) {
									if (!c2c.equals(ne2neNonParam)) {
										if (jContainer.equals(c2c.getSource())) {
											_result.add(new Object[] { umlPackage, ne2neNonParam, uContainer,
													jContainer, nonParamType, nonParamPackage, jp2up, nonParamElement,
													c2c, sourceMatch, targetMatch });
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

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_24_5_matchcorrcontext_greenBBBBBF(
			ASTNode2Element ne2neNonParam, JavaPackage2UmlPackage jp2up, ASTNode2Element c2c, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ParameterizedType2Class_InnerTypeInInterface";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(ne2neNonParam);
		ccMatch.getAllContextElements().add(jp2up);
		ccMatch.getAllContextElements().add(c2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { ne2neNonParam, jp2up, c2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_24_6_createcorrespondence_blackBBBBBBBBBB(
			org.eclipse.uml2.uml.Package umlPackage, Interface uContainer, AbstractTypeDeclaration jContainer,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, TypeAccess typeTypeAccess, org.eclipse.uml2.uml.Class nonParamElement,
			org.eclipse.uml2.uml.Class parameterizedClassifier, CCMatch ccMatch) {
		if (!jContainer.equals(nonParamType)) {
			if (!nonParamElement.equals(parameterizedClassifier)) {
				return new Object[] { umlPackage, uContainer, jContainer, nonParamType, nonParamPackage,
						parameterizedType, typeTypeAccess, nonParamElement, parameterizedClassifier, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_24_6_createcorrespondence_greenBFBB(
			ParameterizedType parameterizedType, org.eclipse.uml2.uml.Class parameterizedClassifier, CCMatch ccMatch) {
		ASTNode2Element ne2ne = UmlFactory.eINSTANCE.createASTNode2Element();
		ne2ne.setSource(parameterizedType);
		ne2ne.setTarget(parameterizedClassifier);
		ccMatch.getCreateCorr().add(ne2ne);
		return new Object[] { parameterizedType, ne2ne, parameterizedClassifier, ccMatch };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ParameterizedType2Class_InnerTypeInInterface";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterizedType2Class_InnerTypeInInterface_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_0BBB(
			TypeAccess typeTypeAccess, AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType) {
		if (!jContainer.equals(nonParamType)) {
			for (AbstractTypeDeclaration __DEC_typeTypeAccess_superInterfaces_594086 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(typeTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
				if (!jContainer.equals(__DEC_typeTypeAccess_superInterfaces_594086)) {
					if (!nonParamType.equals(__DEC_typeTypeAccess_superInterfaces_594086)) {
						return new Object[] { typeTypeAccess, jContainer, nonParamType };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_1B(
			TypeAccess typeTypeAccess) {
		for (Annotation __DEC_typeTypeAccess_type_665087 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, Annotation.class, "type")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_2B(
			TypeAccess typeTypeAccess) {
		for (ArrayType __DEC_typeTypeAccess_elementType_366441 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, ArrayType.class, "elementType")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_3BBB(
			TypeAccess typeTypeAccess, AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType) {
		if (!jContainer.equals(nonParamType)) {
			for (ClassDeclaration __DEC_typeTypeAccess_superClass_810024 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(typeTypeAccess, ClassDeclaration.class, "superClass")) {
				if (!jContainer.equals(__DEC_typeTypeAccess_superClass_810024)) {
					if (!nonParamType.equals(__DEC_typeTypeAccess_superClass_810024)) {
						return new Object[] { typeTypeAccess, jContainer, nonParamType };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_4B(
			TypeAccess typeTypeAccess) {
		for (MethodDeclaration __DEC_typeTypeAccess_returnType_846348 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_5B(
			TypeAccess typeTypeAccess) {
		for (SingleVariableDeclaration __DEC_typeTypeAccess_type_773437 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_6B(
			TypeAccess typeTypeAccess) {
		for (AnnotationMemberValuePair __DEC_typeTypeAccess_value_995625 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_7BB(
			AbstractTypeDeclaration jContainer, TypeAccess typeTypeAccess) {
		if (jContainer.getSuperInterfaces().contains(typeTypeAccess)) {
			return new Object[] { jContainer, typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_8BB(
			AbstractTypeDeclaration nonParamType, TypeAccess typeTypeAccess) {
		if (nonParamType.getSuperInterfaces().contains(typeTypeAccess)) {
			return new Object[] { nonParamType, typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_blackBBBBB(
			AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess) {
		if (!jContainer.equals(nonParamType)) {
			if (nonParamPackage.getOwnedElements().contains(jContainer)) {
				if (typeTypeAccess.equals(parameterizedType.getType())) {
					if (jContainer.getBodyDeclarations().contains(nonParamType)) {
						if (nonParamType.equals(typeTypeAccess.getType())) {
							if (pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_0BBB(
									typeTypeAccess, jContainer, nonParamType) == null) {
								if (pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_1B(
										typeTypeAccess) == null) {
									if (pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_2B(
											typeTypeAccess) == null) {
										if (pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_3BBB(
												typeTypeAccess, jContainer, nonParamType) == null) {
											if (pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_4B(
													typeTypeAccess) == null) {
												if (pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_5B(
														typeTypeAccess) == null) {
													if (pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_6B(
															typeTypeAccess) == null) {
														if (pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_7BB(
																jContainer, typeTypeAccess) == null) {
															if (pattern_ParameterizedType2Class_InnerTypeInInterface_27_1_matchtggpattern_black_nac_8BB(
																	nonParamType, typeTypeAccess) == null) {
																return new Object[] { jContainer, nonParamType,
																		nonParamPackage, parameterizedType,
																		typeTypeAccess };
															}
														}
													}
												}
											}
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

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_28_1_matchtggpattern_blackBBBB(
			org.eclipse.uml2.uml.Package umlPackage, Interface uContainer, org.eclipse.uml2.uml.Class nonParamElement,
			org.eclipse.uml2.uml.Class parameterizedClassifier) {
		if (!nonParamElement.equals(parameterizedClassifier)) {
			if (uContainer.getNestedClassifiers().contains(nonParamElement)) {
				if (umlPackage.getPackagedElements().contains(parameterizedClassifier)) {
					if (umlPackage.getPackagedElements().contains(uContainer)) {
						return new Object[] { umlPackage, uContainer, nonParamElement, parameterizedClassifier };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_29_1_createresult_blackB(
			ParameterizedType2Class_InnerTypeInInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Package umlPackage) {
		if (ruleResult.getTargetObjects().contains(umlPackage)) {
			return new Object[] { ruleResult, umlPackage };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Interface uContainer) {
		if (ruleResult.getTargetObjects().contains(uContainer)) {
			return new Object[] { ruleResult, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Class nonParamElement) {
		if (ruleResult.getTargetObjects().contains(nonParamElement)) {
			return new Object[] { ruleResult, nonParamElement };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element ne2neNonParam) {
		if (ruleResult.getCorrObjects().contains(ne2neNonParam)) {
			return new Object[] { ruleResult, ne2neNonParam };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration nonParamType) {
		if (ruleResult.getSourceObjects().contains(nonParamType)) {
			return new Object[] { ruleResult, nonParamType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration jContainer) {
		if (ruleResult.getSourceObjects().contains(jContainer)) {
			return new Object[] { ruleResult, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element c2c) {
		if (ruleResult.getCorrObjects().contains(c2c)) {
			return new Object[] { ruleResult, c2c };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.modisco.java.Package nonParamPackage) {
		if (ruleResult.getSourceObjects().contains(nonParamPackage)) {
			return new Object[] { ruleResult, nonParamPackage };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, JavaPackage2UmlPackage jp2up) {
		if (ruleResult.getCorrObjects().contains(jp2up)) {
			return new Object[] { ruleResult, jp2up };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_blackFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList ne2neNonParamList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpNe2neNonParam : ne2neNonParamList.getEntryObjects()) {
				if (tmpNe2neNonParam instanceof ASTNode2Element) {
					ASTNode2Element ne2neNonParam = (ASTNode2Element) tmpNe2neNonParam;
					Element tmpNonParamElement = ne2neNonParam.getTarget();
					if (tmpNonParamElement instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class nonParamElement = (org.eclipse.uml2.uml.Class) tmpNonParamElement;
						ASTNode tmpNonParamType = ne2neNonParam.getSource();
						if (tmpNonParamType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) tmpNonParamType;
							AbstractTypeDeclaration jContainer = nonParamType.getAbstractTypeDeclaration();
							if (jContainer != null) {
								if (!jContainer.equals(nonParamType)) {
									org.eclipse.modisco.java.Package nonParamPackage = jContainer.getPackage();
									if (nonParamPackage != null) {
										if (pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_3BB(
												ruleResult, ne2neNonParam) == null) {
											if (pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, nonParamElement) == null) {
												if (pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_4BB(
														ruleResult, nonParamType) == null) {
													if (pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_5BB(
															ruleResult, jContainer) == null) {
														if (pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_7BB(
																ruleResult, nonParamPackage) == null) {
															for (Interface uContainer : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(nonParamElement,
																			Interface.class, "nestedClassifier")) {
																if (pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_1BB(
																		ruleResult, uContainer) == null) {
																	for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil
																			.getOppositeReferenceTyped(jContainer,
																					ASTNode2Element.class, "source")) {
																		if (!c2c.equals(ne2neNonParam)) {
																			if (uContainer.equals(c2c.getTarget())) {
																				if (pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_6BB(
																						ruleResult, c2c) == null) {
																					for (JavaPackage2UmlPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
																							.getOppositeReferenceTyped(
																									nonParamPackage,
																									JavaPackage2UmlPackage.class,
																									"source")) {
																						org.eclipse.uml2.uml.Package umlPackage = jp2up
																								.getTarget();
																						if (umlPackage != null) {
																							if (umlPackage
																									.getPackagedElements()
																									.contains(
																											uContainer)) {
																								if (pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_8BB(
																										ruleResult,
																										jp2up) == null) {
																									if (pattern_ParameterizedType2Class_InnerTypeInInterface_29_2_isapplicablecore_black_nac_0BB(
																											ruleResult,
																											umlPackage) == null) {
																										_result.add(
																												new Object[] {
																														ne2neNonParamList,
																														umlPackage,
																														uContainer,
																														nonParamElement,
																														ne2neNonParam,
																														nonParamType,
																														jContainer,
																														c2c,
																														nonParamPackage,
																														jp2up,
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

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_29_3_solveCSP_bindingFBBBBBBBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, ASTNode2Element ne2neNonParam, Interface uContainer,
			AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, JavaPackage2UmlPackage jp2up,
			org.eclipse.uml2.uml.Class nonParamElement, ASTNode2Element c2c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, umlPackage, ne2neNonParam,
				uContainer, jContainer, nonParamType, nonParamPackage, jp2up, nonParamElement, c2c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, umlPackage, ne2neNonParam, uContainer, jContainer,
					nonParamType, nonParamPackage, jp2up, nonParamElement, c2c, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			ParameterizedType2Class_InnerTypeInInterface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, ASTNode2Element ne2neNonParam, Interface uContainer,
			AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, JavaPackage2UmlPackage jp2up,
			org.eclipse.uml2.uml.Class nonParamElement, ASTNode2Element c2c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_29_3_solveCSP_binding = pattern_ParameterizedType2Class_InnerTypeInInterface_29_3_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType,
				nonParamPackage, jp2up, nonParamElement, c2c, ruleResult);
		if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedType2Class_InnerTypeInInterface_29_3_solveCSP_binding[0];

			Object[] result_pattern_ParameterizedType2Class_InnerTypeInInterface_29_3_solveCSP_black = pattern_ParameterizedType2Class_InnerTypeInInterface_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedType2Class_InnerTypeInInterface_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, umlPackage, ne2neNonParam, uContainer, jContainer,
						nonParamType, nonParamPackage, jp2up, nonParamElement, c2c, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedType2Class_InnerTypeInInterface_29_4_checkCSP_expressionFBB(
			ParameterizedType2Class_InnerTypeInInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_29_5_checknacs_blackBBBBBBBBB(
			org.eclipse.uml2.uml.Package umlPackage, ASTNode2Element ne2neNonParam, Interface uContainer,
			AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, JavaPackage2UmlPackage jp2up,
			org.eclipse.uml2.uml.Class nonParamElement, ASTNode2Element c2c) {
		if (!jContainer.equals(nonParamType)) {
			if (!c2c.equals(ne2neNonParam)) {
				return new Object[] { umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType, nonParamPackage,
						jp2up, nonParamElement, c2c };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_29_6_perform_blackBBBBBBBBBB(
			org.eclipse.uml2.uml.Package umlPackage, ASTNode2Element ne2neNonParam, Interface uContainer,
			AbstractTypeDeclaration jContainer, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, JavaPackage2UmlPackage jp2up,
			org.eclipse.uml2.uml.Class nonParamElement, ASTNode2Element c2c, ModelgeneratorRuleResult ruleResult) {
		if (!jContainer.equals(nonParamType)) {
			if (!c2c.equals(ne2neNonParam)) {
				return new Object[] { umlPackage, ne2neNonParam, uContainer, jContainer, nonParamType, nonParamPackage,
						jp2up, nonParamElement, c2c, ruleResult };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Class_InnerTypeInInterface_29_6_perform_greenBBFFFFBB(
			org.eclipse.uml2.uml.Package umlPackage, AbstractTypeDeclaration nonParamType,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		ParameterizedType parameterizedType = JavaFactory.eINSTANCE.createParameterizedType();
		ASTNode2Element ne2ne = UmlFactory.eINSTANCE.createASTNode2Element();
		TypeAccess typeTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		org.eclipse.uml2.uml.Class parameterizedClassifier = UMLFactory.eINSTANCE.createClass();
		Object _localVariable_0 = csp.getValue("parameterizedType", "name");
		Object _localVariable_1 = csp.getValue("parameterizedClassifier", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(parameterizedType);
		ne2ne.setSource(parameterizedType);
		ruleResult.getCorrObjects().add(ne2ne);
		parameterizedType.setType(typeTypeAccess);
		typeTypeAccess.setType(nonParamType);
		ruleResult.getSourceObjects().add(typeTypeAccess);
		umlPackage.getPackagedElements().add(parameterizedClassifier);
		ne2ne.setTarget(parameterizedClassifier);
		ruleResult.getTargetObjects().add(parameterizedClassifier);
		String parameterizedType_name_prime = (String) _localVariable_0;
		String parameterizedClassifier_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		parameterizedType.setName(parameterizedType_name_prime);
		parameterizedClassifier.setName(parameterizedClassifier_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { umlPackage, nonParamType, parameterizedType, ne2ne, typeTypeAccess,
				parameterizedClassifier, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ParameterizedType2Class_InnerTypeInInterface_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParameterizedType2Class_InnerTypeInInterfaceImpl
