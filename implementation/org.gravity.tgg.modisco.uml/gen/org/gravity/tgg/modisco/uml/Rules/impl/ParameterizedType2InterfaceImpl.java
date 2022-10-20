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

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage;

import org.gravity.tgg.modisco.uml.Rules.ParameterizedType2Interface;
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
 * An implementation of the model object '<em><b>Parameterized Type2 Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParameterizedType2InterfaceImpl extends AbstractRuleImpl implements ParameterizedType2Interface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedType2InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParameterizedType2Interface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess) {

		Object[] result1_black = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_0_1_initialbindings_blackBBBBBB(this, match, nonParamType,
						nonParamPackage, parameterizedType, typeTypeAccess);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[nonParamType] = " + nonParamType + ", " + "[nonParamPackage] = "
					+ nonParamPackage + ", " + "[parameterizedType] = " + parameterizedType + ", "
					+ "[typeTypeAccess] = " + typeTypeAccess + ".");
		}

		Object[] result2_bindingAndBlack = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, nonParamType,
						nonParamPackage, parameterizedType, typeTypeAccess);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[nonParamType] = " + nonParamType + ", " + "[nonParamPackage] = "
					+ nonParamPackage + ", " + "[parameterizedType] = " + parameterizedType + ", "
					+ "[typeTypeAccess] = " + typeTypeAccess + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ParameterizedType2InterfaceImpl
					.pattern_ParameterizedType2Interface_0_4_collectelementstobetranslated_blackBBBBB(match,
							nonParamType, nonParamPackage, parameterizedType, typeTypeAccess);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[nonParamType] = " + nonParamType + ", " + "[nonParamPackage] = " + nonParamPackage + ", "
						+ "[parameterizedType] = " + parameterizedType + ", " + "[typeTypeAccess] = " + typeTypeAccess
						+ ".");
			}
			ParameterizedType2InterfaceImpl
					.pattern_ParameterizedType2Interface_0_4_collectelementstobetranslated_greenBBBBFFF(match,
							nonParamType, parameterizedType, typeTypeAccess);
			//nothing EMoflonEdge parameterizedType__typeTypeAccess____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge typeTypeAccess__nonParamType____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge nonParamType__typeTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[6];

			Object[] result5_black = ParameterizedType2InterfaceImpl
					.pattern_ParameterizedType2Interface_0_5_collectcontextelements_blackBBBBB(match, nonParamType,
							nonParamPackage, parameterizedType, typeTypeAccess);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[nonParamType] = " + nonParamType + ", " + "[nonParamPackage] = " + nonParamPackage + ", "
						+ "[parameterizedType] = " + parameterizedType + ", " + "[typeTypeAccess] = " + typeTypeAccess
						+ ".");
			}
			ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_0_5_collectcontextelements_greenBBBFF(
					match, nonParamType, nonParamPackage);
			//nothing EMoflonEdge nonParamPackage__nonParamType____ownedElements = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge nonParamType__nonParamPackage____package = (EMoflonEdge) result5_green[4];

			// 
			ParameterizedType2InterfaceImpl
					.pattern_ParameterizedType2Interface_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
							nonParamType, nonParamPackage, parameterizedType, typeTypeAccess);
			return ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_0_7_expressionF();
		} else {
			return ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[0];
		Interface nonParamElement = (Interface) result1_bindingAndBlack[1];
		ASTNode2Element ne2neNonParam = (ASTNode2Element) result1_bindingAndBlack[2];
		AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result1_bindingAndBlack[3];
		org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[4];
		ParameterizedType parameterizedType = (ParameterizedType) result1_bindingAndBlack[5];
		JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result1_bindingAndBlack[6];
		TypeAccess typeTypeAccess = (TypeAccess) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_1_1_performtransformation_greenBFBFB(umlPackage, parameterizedType,
						csp);
		Interface parameterizedClassifier = (Interface) result1_green[1];
		ASTNode2Element ne2ne = (ASTNode2Element) result1_green[3];

		Object[] result2_black = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_1_2_collecttranslatedelements_blackBBBB(parameterizedClassifier,
						parameterizedType, ne2ne, typeTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[parameterizedClassifier] = "
					+ parameterizedClassifier + ", " + "[parameterizedType] = " + parameterizedType + ", "
					+ "[ne2ne] = " + ne2ne + ", " + "[typeTypeAccess] = " + typeTypeAccess + ".");
		}
		Object[] result2_green = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_1_2_collecttranslatedelements_greenFBBBB(parameterizedClassifier,
						parameterizedType, ne2ne, typeTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, umlPackage,
						nonParamElement, ne2neNonParam, parameterizedClassifier, nonParamType, nonParamPackage,
						parameterizedType, ne2ne, jp2up, typeTypeAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[umlPackage] = " + umlPackage + ", " + "[nonParamElement] = " + nonParamElement + ", "
					+ "[ne2neNonParam] = " + ne2neNonParam + ", " + "[parameterizedClassifier] = "
					+ parameterizedClassifier + ", " + "[nonParamType] = " + nonParamType + ", "
					+ "[nonParamPackage] = " + nonParamPackage + ", " + "[parameterizedType] = " + parameterizedType
					+ ", " + "[ne2ne] = " + ne2ne + ", " + "[jp2up] = " + jp2up + ", " + "[typeTypeAccess] = "
					+ typeTypeAccess + ".");
		}
		ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
				ruleresult, umlPackage, parameterizedClassifier, nonParamType, parameterizedType, ne2ne,
				typeTypeAccess);
		//nothing EMoflonEdge umlPackage__parameterizedClassifier____packagedElement = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge parameterizedType__typeTypeAccess____type = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge ne2ne__parameterizedType____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge ne2ne__parameterizedClassifier____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge typeTypeAccess__nonParamType____type = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge nonParamType__typeTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[12];

		// 
		// 
		ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_1_5_registerobjects_expressionBBBBBBBBBBBB(
				this, ruleresult, umlPackage, nonParamElement, ne2neNonParam, parameterizedClassifier, nonParamType,
				nonParamPackage, parameterizedType, ne2ne, jp2up, typeTypeAccess);
		return ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result2_binding[0];
		org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result2_binding[1];
		ParameterizedType parameterizedType = (ParameterizedType) result2_binding[2];
		TypeAccess typeTypeAccess = (TypeAccess) result2_binding[3];
		for (Object[] result2_black : ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_2_2_corematch_blackFFFBBBFBB(nonParamType, nonParamPackage,
						parameterizedType, typeTypeAccess, match)) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_black[0];
			Interface nonParamElement = (Interface) result2_black[1];
			ASTNode2Element ne2neNonParam = (ASTNode2Element) result2_black[2];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result2_black[6];
			// ForEach 
			for (Object[] result3_black : ParameterizedType2InterfaceImpl
					.pattern_ParameterizedType2Interface_2_3_findcontext_blackBBBBBBBB(umlPackage, nonParamElement,
							ne2neNonParam, nonParamType, nonParamPackage, parameterizedType, jp2up, typeTypeAccess)) {
				Object[] result3_green = ParameterizedType2InterfaceImpl
						.pattern_ParameterizedType2Interface_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(umlPackage,
								nonParamElement, ne2neNonParam, nonParamType, nonParamPackage, parameterizedType, jp2up,
								typeTypeAccess);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge umlPackage__nonParamElement____packagedElement = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge ne2neNonParam__nonParamType____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge ne2neNonParam__nonParamElement____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge parameterizedType__typeTypeAccess____type = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge jp2up__nonParamPackage____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge jp2up__umlPackage____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge typeTypeAccess__nonParamType____type = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge nonParamType__typeTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge nonParamPackage__nonParamType____ownedElements = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge nonParamType__nonParamPackage____package = (EMoflonEdge) result3_green[18];

				Object[] result4_bindingAndBlack = ParameterizedType2InterfaceImpl
						.pattern_ParameterizedType2Interface_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, umlPackage, nonParamElement, ne2neNonParam, nonParamType,
								nonParamPackage, parameterizedType, jp2up, typeTypeAccess);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[umlPackage] = " + umlPackage
							+ ", " + "[nonParamElement] = " + nonParamElement + ", " + "[ne2neNonParam] = "
							+ ne2neNonParam + ", " + "[nonParamType] = " + nonParamType + ", " + "[nonParamPackage] = "
							+ nonParamPackage + ", " + "[parameterizedType] = " + parameterizedType + ", "
							+ "[jp2up] = " + jp2up + ", " + "[typeTypeAccess] = " + typeTypeAccess + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = ParameterizedType2InterfaceImpl
							.pattern_ParameterizedType2Interface_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ParameterizedType2InterfaceImpl
							.pattern_ParameterizedType2Interface_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess) {
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
	public CSP isAppropriate_solveCsp_FWD(Match match, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess) {// Create CSP
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
			Interface nonParamElement, ASTNode2Element ne2neNonParam, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			JavaPackage2UmlPackage jp2up, TypeAccess typeTypeAccess) {// Create CSP
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
		isApplicableMatch.registerObject("nonParamElement", nonParamElement);
		isApplicableMatch.registerObject("ne2neNonParam", ne2neNonParam);
		isApplicableMatch.registerObject("nonParamType", nonParamType);
		isApplicableMatch.registerObject("nonParamPackage", nonParamPackage);
		isApplicableMatch.registerObject("parameterizedType", parameterizedType);
		isApplicableMatch.registerObject("jp2up", jp2up);
		isApplicableMatch.registerObject("typeTypeAccess", typeTypeAccess);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject umlPackage, EObject nonParamElement,
			EObject ne2neNonParam, EObject parameterizedClassifier, EObject nonParamType, EObject nonParamPackage,
			EObject parameterizedType, EObject ne2ne, EObject jp2up, EObject typeTypeAccess) {
		ruleresult.registerObject("umlPackage", umlPackage);
		ruleresult.registerObject("nonParamElement", nonParamElement);
		ruleresult.registerObject("ne2neNonParam", ne2neNonParam);
		ruleresult.registerObject("parameterizedClassifier", parameterizedClassifier);
		ruleresult.registerObject("nonParamType", nonParamType);
		ruleresult.registerObject("nonParamPackage", nonParamPackage);
		ruleresult.registerObject("parameterizedType", parameterizedType);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("jp2up", jp2up);
		ruleresult.registerObject("typeTypeAccess", typeTypeAccess);

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
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement,
			Interface parameterizedClassifier) {

		Object[] result1_black = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_10_1_initialbindings_blackBBBBB(this, match, umlPackage,
						nonParamElement, parameterizedClassifier);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[umlPackage] = " + umlPackage + ", " + "[nonParamElement] = "
					+ nonParamElement + ", " + "[parameterizedClassifier] = " + parameterizedClassifier + ".");
		}

		Object[] result2_bindingAndBlack = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, umlPackage,
						nonParamElement, parameterizedClassifier);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[umlPackage] = " + umlPackage + ", " + "[nonParamElement] = "
					+ nonParamElement + ", " + "[parameterizedClassifier] = " + parameterizedClassifier + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = ParameterizedType2InterfaceImpl
					.pattern_ParameterizedType2Interface_10_4_collectelementstobetranslated_blackBBBB(match, umlPackage,
							nonParamElement, parameterizedClassifier);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[umlPackage] = " + umlPackage + ", " + "[nonParamElement] = " + nonParamElement + ", "
						+ "[parameterizedClassifier] = " + parameterizedClassifier + ".");
			}
			ParameterizedType2InterfaceImpl
					.pattern_ParameterizedType2Interface_10_4_collectelementstobetranslated_greenBBBF(match, umlPackage,
							parameterizedClassifier);
			//nothing EMoflonEdge umlPackage__parameterizedClassifier____packagedElement = (EMoflonEdge) result4_green[3];

			Object[] result5_black = ParameterizedType2InterfaceImpl
					.pattern_ParameterizedType2Interface_10_5_collectcontextelements_blackBBBB(match, umlPackage,
							nonParamElement, parameterizedClassifier);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[umlPackage] = " + umlPackage + ", " + "[nonParamElement] = " + nonParamElement + ", "
						+ "[parameterizedClassifier] = " + parameterizedClassifier + ".");
			}
			ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_10_5_collectcontextelements_greenBBBF(
					match, umlPackage, nonParamElement);
			//nothing EMoflonEdge umlPackage__nonParamElement____packagedElement = (EMoflonEdge) result5_green[3];

			// 
			ParameterizedType2InterfaceImpl
					.pattern_ParameterizedType2Interface_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							umlPackage, nonParamElement, parameterizedClassifier);
			return ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_10_7_expressionF();
		} else {
			return ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[0];
		Interface nonParamElement = (Interface) result1_bindingAndBlack[1];
		ASTNode2Element ne2neNonParam = (ASTNode2Element) result1_bindingAndBlack[2];
		Interface parameterizedClassifier = (Interface) result1_bindingAndBlack[3];
		AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[5];
		JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_11_1_performtransformation_greenBBFFFB(parameterizedClassifier,
						nonParamType, csp);
		ParameterizedType parameterizedType = (ParameterizedType) result1_green[2];
		ASTNode2Element ne2ne = (ASTNode2Element) result1_green[3];
		TypeAccess typeTypeAccess = (TypeAccess) result1_green[4];

		Object[] result2_black = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_11_2_collecttranslatedelements_blackBBBB(parameterizedClassifier,
						parameterizedType, ne2ne, typeTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[parameterizedClassifier] = "
					+ parameterizedClassifier + ", " + "[parameterizedType] = " + parameterizedType + ", "
					+ "[ne2ne] = " + ne2ne + ", " + "[typeTypeAccess] = " + typeTypeAccess + ".");
		}
		Object[] result2_green = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_11_2_collecttranslatedelements_greenFBBBB(parameterizedClassifier,
						parameterizedType, ne2ne, typeTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, umlPackage,
						nonParamElement, ne2neNonParam, parameterizedClassifier, nonParamType, nonParamPackage,
						parameterizedType, ne2ne, jp2up, typeTypeAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[umlPackage] = " + umlPackage + ", " + "[nonParamElement] = " + nonParamElement + ", "
					+ "[ne2neNonParam] = " + ne2neNonParam + ", " + "[parameterizedClassifier] = "
					+ parameterizedClassifier + ", " + "[nonParamType] = " + nonParamType + ", "
					+ "[nonParamPackage] = " + nonParamPackage + ", " + "[parameterizedType] = " + parameterizedType
					+ ", " + "[ne2ne] = " + ne2ne + ", " + "[jp2up] = " + jp2up + ", " + "[typeTypeAccess] = "
					+ typeTypeAccess + ".");
		}
		ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
				ruleresult, umlPackage, parameterizedClassifier, nonParamType, parameterizedType, ne2ne,
				typeTypeAccess);
		//nothing EMoflonEdge umlPackage__parameterizedClassifier____packagedElement = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge parameterizedType__typeTypeAccess____type = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge ne2ne__parameterizedType____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge ne2ne__parameterizedClassifier____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge typeTypeAccess__nonParamType____type = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge nonParamType__typeTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[12];

		// 
		// 
		ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_11_5_registerobjects_expressionBBBBBBBBBBBB(
				this, ruleresult, umlPackage, nonParamElement, ne2neNonParam, parameterizedClassifier, nonParamType,
				nonParamPackage, parameterizedType, ne2ne, jp2up, typeTypeAccess);
		return ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_binding[0];
		Interface nonParamElement = (Interface) result2_binding[1];
		Interface parameterizedClassifier = (Interface) result2_binding[2];
		for (Object[] result2_black : ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_12_2_corematch_blackBBFBFFFB(umlPackage, nonParamElement,
						parameterizedClassifier, match)) {
			ASTNode2Element ne2neNonParam = (ASTNode2Element) result2_black[2];
			AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result2_black[4];
			org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result2_black[5];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result2_black[6];
			// ForEach 
			for (Object[] result3_black : ParameterizedType2InterfaceImpl
					.pattern_ParameterizedType2Interface_12_3_findcontext_blackBBBBBBB(umlPackage, nonParamElement,
							ne2neNonParam, parameterizedClassifier, nonParamType, nonParamPackage, jp2up)) {
				Object[] result3_green = ParameterizedType2InterfaceImpl
						.pattern_ParameterizedType2Interface_12_3_findcontext_greenBBBBBBBFFFFFFFFF(umlPackage,
								nonParamElement, ne2neNonParam, parameterizedClassifier, nonParamType, nonParamPackage,
								jp2up);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge umlPackage__nonParamElement____packagedElement = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge umlPackage__parameterizedClassifier____packagedElement = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge ne2neNonParam__nonParamType____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge ne2neNonParam__nonParamElement____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge jp2up__nonParamPackage____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge jp2up__umlPackage____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge nonParamPackage__nonParamType____ownedElements = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge nonParamType__nonParamPackage____package = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = ParameterizedType2InterfaceImpl
						.pattern_ParameterizedType2Interface_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, umlPackage, nonParamElement, ne2neNonParam, parameterizedClassifier,
								nonParamType, nonParamPackage, jp2up);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[umlPackage] = " + umlPackage
							+ ", " + "[nonParamElement] = " + nonParamElement + ", " + "[ne2neNonParam] = "
							+ ne2neNonParam + ", " + "[parameterizedClassifier] = " + parameterizedClassifier + ", "
							+ "[nonParamType] = " + nonParamType + ", " + "[nonParamPackage] = " + nonParamPackage
							+ ", " + "[jp2up] = " + jp2up + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ParameterizedType2InterfaceImpl
						.pattern_ParameterizedType2Interface_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ParameterizedType2InterfaceImpl
							.pattern_ParameterizedType2Interface_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ParameterizedType2InterfaceImpl
							.pattern_ParameterizedType2Interface_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Package umlPackage,
			Interface nonParamElement, Interface parameterizedClassifier) {
		match.registerObject("umlPackage", umlPackage);
		match.registerObject("nonParamElement", nonParamElement);
		match.registerObject("parameterizedClassifier", parameterizedClassifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Package umlPackage,
			Interface nonParamElement, Interface parameterizedClassifier) {// Create CSP
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
			Interface nonParamElement, ASTNode2Element ne2neNonParam, Interface parameterizedClassifier,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			JavaPackage2UmlPackage jp2up) {// Create CSP
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
		isApplicableMatch.registerObject("nonParamElement", nonParamElement);
		isApplicableMatch.registerObject("ne2neNonParam", ne2neNonParam);
		isApplicableMatch.registerObject("parameterizedClassifier", parameterizedClassifier);
		isApplicableMatch.registerObject("nonParamType", nonParamType);
		isApplicableMatch.registerObject("nonParamPackage", nonParamPackage);
		isApplicableMatch.registerObject("jp2up", jp2up);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject umlPackage, EObject nonParamElement,
			EObject ne2neNonParam, EObject parameterizedClassifier, EObject nonParamType, EObject nonParamPackage,
			EObject parameterizedType, EObject ne2ne, EObject jp2up, EObject typeTypeAccess) {
		ruleresult.registerObject("umlPackage", umlPackage);
		ruleresult.registerObject("nonParamElement", nonParamElement);
		ruleresult.registerObject("ne2neNonParam", ne2neNonParam);
		ruleresult.registerObject("parameterizedClassifier", parameterizedClassifier);
		ruleresult.registerObject("nonParamType", nonParamType);
		ruleresult.registerObject("nonParamPackage", nonParamPackage);
		ruleresult.registerObject("parameterizedType", parameterizedType);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("jp2up", jp2up);
		ruleresult.registerObject("typeTypeAccess", typeTypeAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("parameterizedClassifier").eClass())
				.equals("uml.Interface.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_143(EMoflonEdge _edge_packagedElement) {

		Object[] result1_bindingAndBlack = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_20_2_testcorematchandDECs_blackFFFB(_edge_packagedElement)) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_black[0];
			Interface nonParamElement = (Interface) result2_black[1];
			Interface parameterizedClassifier = (Interface) result2_black[2];
			Object[] result2_green = ParameterizedType2InterfaceImpl
					.pattern_ParameterizedType2Interface_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ParameterizedType2InterfaceImpl
					.pattern_ParameterizedType2Interface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, umlPackage, nonParamElement, parameterizedClassifier)) {
				// 
				if (ParameterizedType2InterfaceImpl
						.pattern_ParameterizedType2Interface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ParameterizedType2InterfaceImpl
							.pattern_ParameterizedType2Interface_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ParameterizedType2InterfaceImpl
							.pattern_ParameterizedType2Interface_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_155(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_blackFFFFB(_edge_type)) {
			AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result2_black[0];
			org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result2_black[1];
			ParameterizedType parameterizedType = (ParameterizedType) result2_black[2];
			TypeAccess typeTypeAccess = (TypeAccess) result2_black[3];
			Object[] result2_green = ParameterizedType2InterfaceImpl
					.pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ParameterizedType2InterfaceImpl
					.pattern_ParameterizedType2Interface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, nonParamType, nonParamPackage, parameterizedType, typeTypeAccess)) {
				// 
				if (ParameterizedType2InterfaceImpl
						.pattern_ParameterizedType2Interface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ParameterizedType2InterfaceImpl
							.pattern_ParameterizedType2Interface_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ParameterizedType2InterfaceImpl
							.pattern_ParameterizedType2Interface_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ParameterizedType2Interface");
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

		eq0.setRuleName("ParameterizedType2Interface");
		eq0.solve(var_parameterizedType_name, var_parameterizedClassifier_name);

		parameterizedNameFitsNonParameterizedName1.setRuleName("ParameterizedType2Interface");
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
		ruleResult.setRule("ParameterizedType2Interface");
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

		parameterizedNameFitsNonParameterizedName0.setRuleName("ParameterizedType2Interface");
		parameterizedNameFitsNonParameterizedName0.solve(var_parameterizedClassifier_name, var_nonParamElement_name);

		eq1.setRuleName("ParameterizedType2Interface");
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

		Object[] result1_black = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_bindingAndBlack[0];
		Interface nonParamElement = (Interface) result2_bindingAndBlack[1];
		Interface parameterizedClassifier = (Interface) result2_bindingAndBlack[2];
		AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result2_bindingAndBlack[3];
		org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[4];
		ParameterizedType parameterizedType = (ParameterizedType) result2_bindingAndBlack[5];
		TypeAccess typeTypeAccess = (TypeAccess) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, umlPackage,
						nonParamElement, parameterizedClassifier, nonParamType, nonParamPackage, parameterizedType,
						typeTypeAccess, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[umlPackage] = " + umlPackage + ", " + "[nonParamElement] = " + nonParamElement + ", "
					+ "[parameterizedClassifier] = " + parameterizedClassifier + ", " + "[nonParamType] = "
					+ nonParamType + ", " + "[nonParamPackage] = " + nonParamPackage + ", " + "[parameterizedType] = "
					+ parameterizedType + ", " + "[typeTypeAccess] = " + typeTypeAccess + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ParameterizedType2InterfaceImpl
					.pattern_ParameterizedType2Interface_24_5_matchcorrcontext_blackBBFBBFBB(umlPackage,
							nonParamElement, nonParamType, nonParamPackage, sourceMatch, targetMatch)) {
				ASTNode2Element ne2neNonParam = (ASTNode2Element) result5_black[2];
				JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result5_black[5];
				Object[] result5_green = ParameterizedType2InterfaceImpl
						.pattern_ParameterizedType2Interface_24_5_matchcorrcontext_greenBBBBF(ne2neNonParam, jp2up,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = ParameterizedType2InterfaceImpl
						.pattern_ParameterizedType2Interface_24_6_createcorrespondence_blackBBBBBBBB(umlPackage,
								nonParamElement, parameterizedClassifier, nonParamType, nonParamPackage,
								parameterizedType, typeTypeAccess, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[umlPackage] = "
							+ umlPackage + ", " + "[nonParamElement] = " + nonParamElement + ", "
							+ "[parameterizedClassifier] = " + parameterizedClassifier + ", " + "[nonParamType] = "
							+ nonParamType + ", " + "[nonParamPackage] = " + nonParamPackage + ", "
							+ "[parameterizedType] = " + parameterizedType + ", " + "[typeTypeAccess] = "
							+ typeTypeAccess + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_24_6_createcorrespondence_greenBBFB(
						parameterizedClassifier, parameterizedType, ccMatch);
				//nothing ASTNode2Element ne2ne = (ASTNode2Element) result6_green[2];

				Object[] result7_black = ParameterizedType2InterfaceImpl
						.pattern_ParameterizedType2Interface_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ParameterizedType2InterfaceImpl
						.pattern_ParameterizedType2Interface_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement,
			Interface parameterizedClassifier, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, TypeAccess typeTypeAccess) {// 
		Object[] result1_black = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_27_1_matchtggpattern_blackBBBB(nonParamType, nonParamPackage,
						parameterizedType, typeTypeAccess);
		if (result1_black != null) {
			return ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_27_2_expressionF();
		} else {
			return ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement,
			Interface parameterizedClassifier) {// 
		Object[] result1_black = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_28_1_matchtggpattern_blackBBB(umlPackage, nonParamElement,
						parameterizedClassifier);
		if (result1_black != null) {
			return ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_28_2_expressionF();
		} else {
			return ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ASTNode2Element ne2neNonParamParameter) {

		Object[] result1_black = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ParameterizedType2InterfaceImpl
				.pattern_ParameterizedType2Interface_29_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList ne2neNonParamList = (RuleEntryList) result2_black[0];
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result2_black[1];
			Interface nonParamElement = (Interface) result2_black[2];
			ASTNode2Element ne2neNonParam = (ASTNode2Element) result2_black[3];
			AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result2_black[4];
			org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result2_black[5];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result2_black[6];

			Object[] result3_bindingAndBlack = ParameterizedType2InterfaceImpl
					.pattern_ParameterizedType2Interface_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, umlPackage, nonParamElement, ne2neNonParam, nonParamType,
							nonParamPackage, jp2up, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[umlPackage] = " + umlPackage + ", "
						+ "[nonParamElement] = " + nonParamElement + ", " + "[ne2neNonParam] = " + ne2neNonParam + ", "
						+ "[nonParamType] = " + nonParamType + ", " + "[nonParamPackage] = " + nonParamPackage + ", "
						+ "[jp2up] = " + jp2up + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = ParameterizedType2InterfaceImpl
						.pattern_ParameterizedType2Interface_29_5_checknacs_blackBBBBBB(umlPackage, nonParamElement,
								ne2neNonParam, nonParamType, nonParamPackage, jp2up);
				if (result5_black != null) {

					Object[] result6_black = ParameterizedType2InterfaceImpl
							.pattern_ParameterizedType2Interface_29_6_perform_blackBBBBBBB(umlPackage, nonParamElement,
									ne2neNonParam, nonParamType, nonParamPackage, jp2up, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[umlPackage] = "
								+ umlPackage + ", " + "[nonParamElement] = " + nonParamElement + ", "
								+ "[ne2neNonParam] = " + ne2neNonParam + ", " + "[nonParamType] = " + nonParamType
								+ ", " + "[nonParamPackage] = " + nonParamPackage + ", " + "[jp2up] = " + jp2up + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_29_6_perform_greenBFBFFFBB(
							umlPackage, nonParamType, ruleResult, csp);
					//nothing Interface parameterizedClassifier = (Interface) result6_green[1];
					//nothing ParameterizedType parameterizedType = (ParameterizedType) result6_green[3];
					//nothing ASTNode2Element ne2ne = (ASTNode2Element) result6_green[4];
					//nothing TypeAccess typeTypeAccess = (TypeAccess) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return ParameterizedType2InterfaceImpl.pattern_ParameterizedType2Interface_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Package umlPackage,
			Interface nonParamElement, ASTNode2Element ne2neNonParam, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, JavaPackage2UmlPackage jp2up,
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
		isApplicableMatch.registerObject("nonParamElement", nonParamElement);
		isApplicableMatch.registerObject("ne2neNonParam", ne2neNonParam);
		isApplicableMatch.registerObject("nonParamType", nonParamType);
		isApplicableMatch.registerObject("nonParamPackage", nonParamPackage);
		isApplicableMatch.registerObject("jp2up", jp2up);
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
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___IS_APPROPRIATE_FWD__MATCH_ABSTRACTTYPEDECLARATION_PACKAGE_PARAMETERIZEDTYPE_TYPEACCESS:
			return isAppropriate_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2), (ParameterizedType) arguments.get(3),
					(TypeAccess) arguments.get(4));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ABSTRACTTYPEDECLARATION_PACKAGE_PARAMETERIZEDTYPE_TYPEACCESS:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2), (ParameterizedType) arguments.get(3),
					(TypeAccess) arguments.get(4));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ABSTRACTTYPEDECLARATION_PACKAGE_PARAMETERIZEDTYPE_TYPEACCESS:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2), (ParameterizedType) arguments.get(3),
					(TypeAccess) arguments.get(4));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGE_INTERFACE_ASTNODE2ELEMENT_ABSTRACTTYPEDECLARATION_PACKAGE_PARAMETERIZEDTYPE_JAVAPACKAGE2UMLPACKAGE_TYPEACCESS:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Package) arguments.get(1), (Interface) arguments.get(2),
					(ASTNode2Element) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4),
					(org.eclipse.modisco.java.Package) arguments.get(5), (ParameterizedType) arguments.get(6),
					(JavaPackage2UmlPackage) arguments.get(7), (TypeAccess) arguments.get(8));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___IS_APPROPRIATE_BWD__MATCH_PACKAGE_INTERFACE_INTERFACE:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1),
					(Interface) arguments.get(2), (Interface) arguments.get(3));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PACKAGE_INTERFACE_INTERFACE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1),
					(Interface) arguments.get(2), (Interface) arguments.get(3));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PACKAGE_INTERFACE_INTERFACE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1),
					(Interface) arguments.get(2), (Interface) arguments.get(3));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGE_INTERFACE_ASTNODE2ELEMENT_INTERFACE_ABSTRACTTYPEDECLARATION_PACKAGE_JAVAPACKAGE2UMLPACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Package) arguments.get(1), (Interface) arguments.get(2),
					(ASTNode2Element) arguments.get(3), (Interface) arguments.get(4),
					(AbstractTypeDeclaration) arguments.get(5), (org.eclipse.modisco.java.Package) arguments.get(6),
					(JavaPackage2UmlPackage) arguments.get(7));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_143__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_143((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_155__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_155((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___IS_APPLICABLE_SOLVE_CSP_CC__PACKAGE_INTERFACE_INTERFACE_ABSTRACTTYPEDECLARATION_PACKAGE_PARAMETERIZEDTYPE_TYPEACCESS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.uml2.uml.Package) arguments.get(0),
					(Interface) arguments.get(1), (Interface) arguments.get(2),
					(AbstractTypeDeclaration) arguments.get(3), (org.eclipse.modisco.java.Package) arguments.get(4),
					(ParameterizedType) arguments.get(5), (TypeAccess) arguments.get(6), (Match) arguments.get(7),
					(Match) arguments.get(8));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___CHECK_DEC_FWD__ABSTRACTTYPEDECLARATION_PACKAGE_PARAMETERIZEDTYPE_TYPEACCESS:
			return checkDEC_FWD((AbstractTypeDeclaration) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (ParameterizedType) arguments.get(2),
					(TypeAccess) arguments.get(3));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___CHECK_DEC_BWD__PACKAGE_INTERFACE_INTERFACE:
			return checkDEC_BWD((org.eclipse.uml2.uml.Package) arguments.get(0), (Interface) arguments.get(1),
					(Interface) arguments.get(2));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGE_INTERFACE_ASTNODE2ELEMENT_ABSTRACTTYPEDECLARATION_PACKAGE_JAVAPACKAGE2UMLPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Package) arguments.get(1), (Interface) arguments.get(2),
					(ASTNode2Element) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4),
					(org.eclipse.modisco.java.Package) arguments.get(5), (JavaPackage2UmlPackage) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.PARAMETERIZED_TYPE2_INTERFACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParameterizedType2Interface_0_1_initialbindings_blackBBBBBB(
			ParameterizedType2Interface _this, Match match, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess) {
		return new Object[] { _this, match, nonParamType, nonParamPackage, parameterizedType, typeTypeAccess };
	}

	public static final Object[] pattern_ParameterizedType2Interface_0_2_SolveCSP_bindingFBBBBBB(
			ParameterizedType2Interface _this, Match match, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, nonParamType, nonParamPackage, parameterizedType,
				typeTypeAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, nonParamType, nonParamPackage, parameterizedType, typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedType2Interface_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			ParameterizedType2Interface _this, Match match, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess) {
		Object[] result_pattern_ParameterizedType2Interface_0_2_SolveCSP_binding = pattern_ParameterizedType2Interface_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, nonParamType, nonParamPackage, parameterizedType, typeTypeAccess);
		if (result_pattern_ParameterizedType2Interface_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedType2Interface_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ParameterizedType2Interface_0_2_SolveCSP_black = pattern_ParameterizedType2Interface_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedType2Interface_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, nonParamType, nonParamPackage, parameterizedType,
						typeTypeAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedType2Interface_0_3_CheckCSP_expressionFBB(
			ParameterizedType2Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, TypeAccess typeTypeAccess) {
		return new Object[] { match, nonParamType, nonParamPackage, parameterizedType, typeTypeAccess };
	}

	public static final Object[] pattern_ParameterizedType2Interface_0_4_collectelementstobetranslated_greenBBBBFFF(
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

	public static final Object[] pattern_ParameterizedType2Interface_0_5_collectcontextelements_blackBBBBB(Match match,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, TypeAccess typeTypeAccess) {
		return new Object[] { match, nonParamType, nonParamPackage, parameterizedType, typeTypeAccess };
	}

	public static final Object[] pattern_ParameterizedType2Interface_0_5_collectcontextelements_greenBBBFF(Match match,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage) {
		EMoflonEdge nonParamPackage__nonParamType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nonParamType__nonParamPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(nonParamType);
		match.getContextNodes().add(nonParamPackage);
		String nonParamPackage__nonParamType____ownedElements_name_prime = "ownedElements";
		String nonParamType__nonParamPackage____package_name_prime = "package";
		nonParamPackage__nonParamType____ownedElements.setSrc(nonParamPackage);
		nonParamPackage__nonParamType____ownedElements.setTrg(nonParamType);
		match.getContextEdges().add(nonParamPackage__nonParamType____ownedElements);
		nonParamType__nonParamPackage____package.setSrc(nonParamType);
		nonParamType__nonParamPackage____package.setTrg(nonParamPackage);
		match.getContextEdges().add(nonParamType__nonParamPackage____package);
		nonParamPackage__nonParamType____ownedElements
				.setName(nonParamPackage__nonParamType____ownedElements_name_prime);
		nonParamType__nonParamPackage____package.setName(nonParamType__nonParamPackage____package_name_prime);
		return new Object[] { match, nonParamType, nonParamPackage, nonParamPackage__nonParamType____ownedElements,
				nonParamType__nonParamPackage____package };
	}

	public static final void pattern_ParameterizedType2Interface_0_6_registerobjectstomatch_expressionBBBBBB(
			ParameterizedType2Interface _this, Match match, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess) {
		_this.registerObjectsToMatch_FWD(match, nonParamType, nonParamPackage, parameterizedType, typeTypeAccess);

	}

	public static final boolean pattern_ParameterizedType2Interface_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedType2Interface_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("umlPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("nonParamElement");
		EObject _localVariable_2 = isApplicableMatch.getObject("ne2neNonParam");
		EObject _localVariable_3 = isApplicableMatch.getObject("nonParamType");
		EObject _localVariable_4 = isApplicableMatch.getObject("nonParamPackage");
		EObject _localVariable_5 = isApplicableMatch.getObject("parameterizedType");
		EObject _localVariable_6 = isApplicableMatch.getObject("jp2up");
		EObject _localVariable_7 = isApplicableMatch.getObject("typeTypeAccess");
		EObject tmpUmlPackage = _localVariable_0;
		EObject tmpNonParamElement = _localVariable_1;
		EObject tmpNe2neNonParam = _localVariable_2;
		EObject tmpNonParamType = _localVariable_3;
		EObject tmpNonParamPackage = _localVariable_4;
		EObject tmpParameterizedType = _localVariable_5;
		EObject tmpJp2up = _localVariable_6;
		EObject tmpTypeTypeAccess = _localVariable_7;
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
			if (tmpNonParamElement instanceof Interface) {
				Interface nonParamElement = (Interface) tmpNonParamElement;
				if (tmpNe2neNonParam instanceof ASTNode2Element) {
					ASTNode2Element ne2neNonParam = (ASTNode2Element) tmpNe2neNonParam;
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
										return new Object[] { umlPackage, nonParamElement, ne2neNonParam, nonParamType,
												nonParamPackage, parameterizedType, jp2up, typeTypeAccess,
												isApplicableMatch };
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

	public static final Object[] pattern_ParameterizedType2Interface_1_1_performtransformation_blackBBBBBBBBFBB(
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, ASTNode2Element ne2neNonParam,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, JavaPackage2UmlPackage jp2up, TypeAccess typeTypeAccess,
			ParameterizedType2Interface _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { umlPackage, nonParamElement, ne2neNonParam, nonParamType, nonParamPackage,
						parameterizedType, jp2up, typeTypeAccess, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			ParameterizedType2Interface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterizedType2Interface_1_1_performtransformation_binding = pattern_ParameterizedType2Interface_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ParameterizedType2Interface_1_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result_pattern_ParameterizedType2Interface_1_1_performtransformation_binding[0];
			Interface nonParamElement = (Interface) result_pattern_ParameterizedType2Interface_1_1_performtransformation_binding[1];
			ASTNode2Element ne2neNonParam = (ASTNode2Element) result_pattern_ParameterizedType2Interface_1_1_performtransformation_binding[2];
			AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result_pattern_ParameterizedType2Interface_1_1_performtransformation_binding[3];
			org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result_pattern_ParameterizedType2Interface_1_1_performtransformation_binding[4];
			ParameterizedType parameterizedType = (ParameterizedType) result_pattern_ParameterizedType2Interface_1_1_performtransformation_binding[5];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result_pattern_ParameterizedType2Interface_1_1_performtransformation_binding[6];
			TypeAccess typeTypeAccess = (TypeAccess) result_pattern_ParameterizedType2Interface_1_1_performtransformation_binding[7];

			Object[] result_pattern_ParameterizedType2Interface_1_1_performtransformation_black = pattern_ParameterizedType2Interface_1_1_performtransformation_blackBBBBBBBBFBB(
					umlPackage, nonParamElement, ne2neNonParam, nonParamType, nonParamPackage, parameterizedType, jp2up,
					typeTypeAccess, _this, isApplicableMatch);
			if (result_pattern_ParameterizedType2Interface_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ParameterizedType2Interface_1_1_performtransformation_black[8];

				return new Object[] { umlPackage, nonParamElement, ne2neNonParam, nonParamType, nonParamPackage,
						parameterizedType, jp2up, typeTypeAccess, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_1_1_performtransformation_greenBFBFB(
			org.eclipse.uml2.uml.Package umlPackage, ParameterizedType parameterizedType, CSP csp) {
		Interface parameterizedClassifier = UMLFactory.eINSTANCE.createInterface();
		ASTNode2Element ne2ne = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("parameterizedClassifier", "name");
		umlPackage.getPackagedElements().add(parameterizedClassifier);
		ne2ne.setSource(parameterizedType);
		ne2ne.setTarget(parameterizedClassifier);
		String parameterizedClassifier_name_prime = (String) _localVariable_0;
		parameterizedClassifier.setName(parameterizedClassifier_name_prime);
		return new Object[] { umlPackage, parameterizedClassifier, parameterizedType, ne2ne, csp };
	}

	public static final Object[] pattern_ParameterizedType2Interface_1_2_collecttranslatedelements_blackBBBB(
			Interface parameterizedClassifier, ParameterizedType parameterizedType, ASTNode2Element ne2ne,
			TypeAccess typeTypeAccess) {
		return new Object[] { parameterizedClassifier, parameterizedType, ne2ne, typeTypeAccess };
	}

	public static final Object[] pattern_ParameterizedType2Interface_1_2_collecttranslatedelements_greenFBBBB(
			Interface parameterizedClassifier, ParameterizedType parameterizedType, ASTNode2Element ne2ne,
			TypeAccess typeTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(parameterizedClassifier);
		ruleresult.getTranslatedElements().add(parameterizedType);
		ruleresult.getCreatedLinkElements().add(ne2ne);
		ruleresult.getTranslatedElements().add(typeTypeAccess);
		return new Object[] { ruleresult, parameterizedClassifier, parameterizedType, ne2ne, typeTypeAccess };
	}

	public static final Object[] pattern_ParameterizedType2Interface_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject umlPackage, EObject nonParamElement, EObject ne2neNonParam,
			EObject parameterizedClassifier, EObject nonParamType, EObject nonParamPackage, EObject parameterizedType,
			EObject ne2ne, EObject jp2up, EObject typeTypeAccess) {
		if (!nonParamElement.equals(umlPackage)) {
			if (!nonParamElement.equals(parameterizedClassifier)) {
				if (!nonParamElement.equals(nonParamType)) {
					if (!nonParamElement.equals(nonParamPackage)) {
						if (!nonParamElement.equals(parameterizedType)) {
							if (!nonParamElement.equals(typeTypeAccess)) {
								if (!ne2neNonParam.equals(umlPackage)) {
									if (!ne2neNonParam.equals(nonParamElement)) {
										if (!ne2neNonParam.equals(parameterizedClassifier)) {
											if (!ne2neNonParam.equals(nonParamType)) {
												if (!ne2neNonParam.equals(nonParamPackage)) {
													if (!ne2neNonParam.equals(parameterizedType)) {
														if (!ne2neNonParam.equals(typeTypeAccess)) {
															if (!parameterizedClassifier.equals(umlPackage)) {
																if (!parameterizedClassifier
																		.equals(parameterizedType)) {
																	if (!parameterizedClassifier
																			.equals(typeTypeAccess)) {
																		if (!nonParamType.equals(umlPackage)) {
																			if (!nonParamType
																					.equals(parameterizedClassifier)) {
																				if (!nonParamType
																						.equals(parameterizedType)) {
																					if (!nonParamType
																							.equals(typeTypeAccess)) {
																						if (!nonParamPackage
																								.equals(umlPackage)) {
																							if (!nonParamPackage.equals(
																									parameterizedClassifier)) {
																								if (!nonParamPackage
																										.equals(nonParamType)) {
																									if (!nonParamPackage
																											.equals(parameterizedType)) {
																										if (!nonParamPackage
																												.equals(typeTypeAccess)) {
																											if (!parameterizedType
																													.equals(umlPackage)) {
																												if (!parameterizedType
																														.equals(typeTypeAccess)) {
																													if (!ne2ne
																															.equals(umlPackage)) {
																														if (!ne2ne
																																.equals(nonParamElement)) {
																															if (!ne2ne
																																	.equals(ne2neNonParam)) {
																																if (!ne2ne
																																		.equals(parameterizedClassifier)) {
																																	if (!ne2ne
																																			.equals(nonParamType)) {
																																		if (!ne2ne
																																				.equals(nonParamPackage)) {
																																			if (!ne2ne
																																					.equals(parameterizedType)) {
																																				if (!ne2ne
																																						.equals(typeTypeAccess)) {
																																					if (!jp2up
																																							.equals(umlPackage)) {
																																						if (!jp2up
																																								.equals(nonParamElement)) {
																																							if (!jp2up
																																									.equals(ne2neNonParam)) {
																																								if (!jp2up
																																										.equals(parameterizedClassifier)) {
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
																																														if (!typeTypeAccess
																																																.equals(umlPackage)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	umlPackage,
																																																	nonParamElement,
																																																	ne2neNonParam,
																																																	parameterizedClassifier,
																																																	nonParamType,
																																																	nonParamPackage,
																																																	parameterizedType,
																																																	ne2ne,
																																																	jp2up,
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
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterizedType2Interface_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject umlPackage, EObject parameterizedClassifier, EObject nonParamType,
			EObject parameterizedType, EObject ne2ne, EObject typeTypeAccess) {
		EMoflonEdge umlPackage__parameterizedClassifier____packagedElement = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parameterizedType__typeTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__parameterizedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__parameterizedClassifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeTypeAccess__nonParamType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nonParamType__typeTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterizedType2Interface";
		String umlPackage__parameterizedClassifier____packagedElement_name_prime = "packagedElement";
		String parameterizedType__typeTypeAccess____type_name_prime = "type";
		String ne2ne__parameterizedType____source_name_prime = "source";
		String ne2ne__parameterizedClassifier____target_name_prime = "target";
		String typeTypeAccess__nonParamType____type_name_prime = "type";
		String nonParamType__typeTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		umlPackage__parameterizedClassifier____packagedElement.setSrc(umlPackage);
		umlPackage__parameterizedClassifier____packagedElement.setTrg(parameterizedClassifier);
		ruleresult.getCreatedEdges().add(umlPackage__parameterizedClassifier____packagedElement);
		parameterizedType__typeTypeAccess____type.setSrc(parameterizedType);
		parameterizedType__typeTypeAccess____type.setTrg(typeTypeAccess);
		ruleresult.getTranslatedEdges().add(parameterizedType__typeTypeAccess____type);
		ne2ne__parameterizedType____source.setSrc(ne2ne);
		ne2ne__parameterizedType____source.setTrg(parameterizedType);
		ruleresult.getCreatedEdges().add(ne2ne__parameterizedType____source);
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
		umlPackage__parameterizedClassifier____packagedElement
				.setName(umlPackage__parameterizedClassifier____packagedElement_name_prime);
		parameterizedType__typeTypeAccess____type.setName(parameterizedType__typeTypeAccess____type_name_prime);
		ne2ne__parameterizedType____source.setName(ne2ne__parameterizedType____source_name_prime);
		ne2ne__parameterizedClassifier____target.setName(ne2ne__parameterizedClassifier____target_name_prime);
		typeTypeAccess__nonParamType____type.setName(typeTypeAccess__nonParamType____type_name_prime);
		nonParamType__typeTypeAccess____usagesInTypeAccess
				.setName(nonParamType__typeTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { ruleresult, umlPackage, parameterizedClassifier, nonParamType, parameterizedType, ne2ne,
				typeTypeAccess, umlPackage__parameterizedClassifier____packagedElement,
				parameterizedType__typeTypeAccess____type, ne2ne__parameterizedType____source,
				ne2ne__parameterizedClassifier____target, typeTypeAccess__nonParamType____type,
				nonParamType__typeTypeAccess____usagesInTypeAccess };
	}

	public static final void pattern_ParameterizedType2Interface_1_5_registerobjects_expressionBBBBBBBBBBBB(
			ParameterizedType2Interface _this, PerformRuleResult ruleresult, EObject umlPackage,
			EObject nonParamElement, EObject ne2neNonParam, EObject parameterizedClassifier, EObject nonParamType,
			EObject nonParamPackage, EObject parameterizedType, EObject ne2ne, EObject jp2up, EObject typeTypeAccess) {
		_this.registerObjects_FWD(ruleresult, umlPackage, nonParamElement, ne2neNonParam, parameterizedClassifier,
				nonParamType, nonParamPackage, parameterizedType, ne2ne, jp2up, typeTypeAccess);

	}

	public static final PerformRuleResult pattern_ParameterizedType2Interface_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_2_1_preparereturnvalue_bindingFB(
			ParameterizedType2Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ParameterizedType2Interface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_2_1_preparereturnvalue_bindingAndBlackFFB(
			ParameterizedType2Interface _this) {
		Object[] result_pattern_ParameterizedType2Interface_2_1_preparereturnvalue_binding = pattern_ParameterizedType2Interface_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedType2Interface_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterizedType2Interface_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedType2Interface_2_1_preparereturnvalue_black = pattern_ParameterizedType2Interface_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterizedType2Interface_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterizedType2Interface_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ParameterizedType2Interface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterizedType2Interface_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("nonParamType");
		EObject _localVariable_1 = match.getObject("nonParamPackage");
		EObject _localVariable_2 = match.getObject("parameterizedType");
		EObject _localVariable_3 = match.getObject("typeTypeAccess");
		EObject tmpNonParamType = _localVariable_0;
		EObject tmpNonParamPackage = _localVariable_1;
		EObject tmpParameterizedType = _localVariable_2;
		EObject tmpTypeTypeAccess = _localVariable_3;
		if (tmpNonParamType instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) tmpNonParamType;
			if (tmpNonParamPackage instanceof org.eclipse.modisco.java.Package) {
				org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) tmpNonParamPackage;
				if (tmpParameterizedType instanceof ParameterizedType) {
					ParameterizedType parameterizedType = (ParameterizedType) tmpParameterizedType;
					if (tmpTypeTypeAccess instanceof TypeAccess) {
						TypeAccess typeTypeAccess = (TypeAccess) tmpTypeTypeAccess;
						return new Object[] { nonParamType, nonParamPackage, parameterizedType, typeTypeAccess, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedType2Interface_2_2_corematch_blackFFFBBBFBB(
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, TypeAccess typeTypeAccess, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element ne2neNonParam : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(nonParamType, ASTNode2Element.class, "source")) {
			Element tmpNonParamElement = ne2neNonParam.getTarget();
			if (tmpNonParamElement instanceof Interface) {
				Interface nonParamElement = (Interface) tmpNonParamElement;
				for (JavaPackage2UmlPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(nonParamPackage, JavaPackage2UmlPackage.class, "source")) {
					org.eclipse.uml2.uml.Package umlPackage = jp2up.getTarget();
					if (umlPackage != null) {
						_result.add(new Object[] { umlPackage, nonParamElement, ne2neNonParam, nonParamType,
								nonParamPackage, parameterizedType, jp2up, typeTypeAccess, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterizedType2Interface_2_3_findcontext_blackBBBBBBBB(
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, ASTNode2Element ne2neNonParam,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, JavaPackage2UmlPackage jp2up, TypeAccess typeTypeAccess) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (umlPackage.getPackagedElements().contains(nonParamElement)) {
			if (nonParamType.equals(ne2neNonParam.getSource())) {
				if (nonParamElement.equals(ne2neNonParam.getTarget())) {
					if (typeTypeAccess.equals(parameterizedType.getType())) {
						if (nonParamPackage.equals(jp2up.getSource())) {
							if (umlPackage.equals(jp2up.getTarget())) {
								if (nonParamType.equals(typeTypeAccess.getType())) {
									if (nonParamPackage.getOwnedElements().contains(nonParamType)) {
										_result.add(
												new Object[] { umlPackage, nonParamElement, ne2neNonParam, nonParamType,
														nonParamPackage, parameterizedType, jp2up, typeTypeAccess });
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

	public static final Object[] pattern_ParameterizedType2Interface_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, ASTNode2Element ne2neNonParam,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, JavaPackage2UmlPackage jp2up, TypeAccess typeTypeAccess) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge umlPackage__nonParamElement____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2neNonParam__nonParamType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2neNonParam__nonParamElement____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge parameterizedType__typeTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__nonParamPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__umlPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeTypeAccess__nonParamType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nonParamType__typeTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nonParamPackage__nonParamType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nonParamType__nonParamPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String umlPackage__nonParamElement____packagedElement_name_prime = "packagedElement";
		String ne2neNonParam__nonParamType____source_name_prime = "source";
		String ne2neNonParam__nonParamElement____target_name_prime = "target";
		String parameterizedType__typeTypeAccess____type_name_prime = "type";
		String jp2up__nonParamPackage____source_name_prime = "source";
		String jp2up__umlPackage____target_name_prime = "target";
		String typeTypeAccess__nonParamType____type_name_prime = "type";
		String nonParamType__typeTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String nonParamPackage__nonParamType____ownedElements_name_prime = "ownedElements";
		String nonParamType__nonParamPackage____package_name_prime = "package";
		isApplicableMatch.getAllContextElements().add(umlPackage);
		isApplicableMatch.getAllContextElements().add(nonParamElement);
		isApplicableMatch.getAllContextElements().add(ne2neNonParam);
		isApplicableMatch.getAllContextElements().add(nonParamType);
		isApplicableMatch.getAllContextElements().add(nonParamPackage);
		isApplicableMatch.getAllContextElements().add(parameterizedType);
		isApplicableMatch.getAllContextElements().add(jp2up);
		isApplicableMatch.getAllContextElements().add(typeTypeAccess);
		umlPackage__nonParamElement____packagedElement.setSrc(umlPackage);
		umlPackage__nonParamElement____packagedElement.setTrg(nonParamElement);
		isApplicableMatch.getAllContextElements().add(umlPackage__nonParamElement____packagedElement);
		ne2neNonParam__nonParamType____source.setSrc(ne2neNonParam);
		ne2neNonParam__nonParamType____source.setTrg(nonParamType);
		isApplicableMatch.getAllContextElements().add(ne2neNonParam__nonParamType____source);
		ne2neNonParam__nonParamElement____target.setSrc(ne2neNonParam);
		ne2neNonParam__nonParamElement____target.setTrg(nonParamElement);
		isApplicableMatch.getAllContextElements().add(ne2neNonParam__nonParamElement____target);
		parameterizedType__typeTypeAccess____type.setSrc(parameterizedType);
		parameterizedType__typeTypeAccess____type.setTrg(typeTypeAccess);
		isApplicableMatch.getAllContextElements().add(parameterizedType__typeTypeAccess____type);
		jp2up__nonParamPackage____source.setSrc(jp2up);
		jp2up__nonParamPackage____source.setTrg(nonParamPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__nonParamPackage____source);
		jp2up__umlPackage____target.setSrc(jp2up);
		jp2up__umlPackage____target.setTrg(umlPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__umlPackage____target);
		typeTypeAccess__nonParamType____type.setSrc(typeTypeAccess);
		typeTypeAccess__nonParamType____type.setTrg(nonParamType);
		isApplicableMatch.getAllContextElements().add(typeTypeAccess__nonParamType____type);
		nonParamType__typeTypeAccess____usagesInTypeAccess.setSrc(nonParamType);
		nonParamType__typeTypeAccess____usagesInTypeAccess.setTrg(typeTypeAccess);
		isApplicableMatch.getAllContextElements().add(nonParamType__typeTypeAccess____usagesInTypeAccess);
		nonParamPackage__nonParamType____ownedElements.setSrc(nonParamPackage);
		nonParamPackage__nonParamType____ownedElements.setTrg(nonParamType);
		isApplicableMatch.getAllContextElements().add(nonParamPackage__nonParamType____ownedElements);
		nonParamType__nonParamPackage____package.setSrc(nonParamType);
		nonParamType__nonParamPackage____package.setTrg(nonParamPackage);
		isApplicableMatch.getAllContextElements().add(nonParamType__nonParamPackage____package);
		umlPackage__nonParamElement____packagedElement
				.setName(umlPackage__nonParamElement____packagedElement_name_prime);
		ne2neNonParam__nonParamType____source.setName(ne2neNonParam__nonParamType____source_name_prime);
		ne2neNonParam__nonParamElement____target.setName(ne2neNonParam__nonParamElement____target_name_prime);
		parameterizedType__typeTypeAccess____type.setName(parameterizedType__typeTypeAccess____type_name_prime);
		jp2up__nonParamPackage____source.setName(jp2up__nonParamPackage____source_name_prime);
		jp2up__umlPackage____target.setName(jp2up__umlPackage____target_name_prime);
		typeTypeAccess__nonParamType____type.setName(typeTypeAccess__nonParamType____type_name_prime);
		nonParamType__typeTypeAccess____usagesInTypeAccess
				.setName(nonParamType__typeTypeAccess____usagesInTypeAccess_name_prime);
		nonParamPackage__nonParamType____ownedElements
				.setName(nonParamPackage__nonParamType____ownedElements_name_prime);
		nonParamType__nonParamPackage____package.setName(nonParamType__nonParamPackage____package_name_prime);
		return new Object[] { umlPackage, nonParamElement, ne2neNonParam, nonParamType, nonParamPackage,
				parameterizedType, jp2up, typeTypeAccess, isApplicableMatch,
				umlPackage__nonParamElement____packagedElement, ne2neNonParam__nonParamType____source,
				ne2neNonParam__nonParamElement____target, parameterizedType__typeTypeAccess____type,
				jp2up__nonParamPackage____source, jp2up__umlPackage____target, typeTypeAccess__nonParamType____type,
				nonParamType__typeTypeAccess____usagesInTypeAccess, nonParamPackage__nonParamType____ownedElements,
				nonParamType__nonParamPackage____package };
	}

	public static final Object[] pattern_ParameterizedType2Interface_2_4_solveCSP_bindingFBBBBBBBBBB(
			ParameterizedType2Interface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, ASTNode2Element ne2neNonParam,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, JavaPackage2UmlPackage jp2up, TypeAccess typeTypeAccess) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, umlPackage, nonParamElement,
				ne2neNonParam, nonParamType, nonParamPackage, parameterizedType, jp2up, typeTypeAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, umlPackage, nonParamElement, ne2neNonParam,
					nonParamType, nonParamPackage, parameterizedType, jp2up, typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedType2Interface_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			ParameterizedType2Interface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, ASTNode2Element ne2neNonParam,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, JavaPackage2UmlPackage jp2up, TypeAccess typeTypeAccess) {
		Object[] result_pattern_ParameterizedType2Interface_2_4_solveCSP_binding = pattern_ParameterizedType2Interface_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, umlPackage, nonParamElement, ne2neNonParam, nonParamType, nonParamPackage,
				parameterizedType, jp2up, typeTypeAccess);
		if (result_pattern_ParameterizedType2Interface_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedType2Interface_2_4_solveCSP_binding[0];

			Object[] result_pattern_ParameterizedType2Interface_2_4_solveCSP_black = pattern_ParameterizedType2Interface_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedType2Interface_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, umlPackage, nonParamElement, ne2neNonParam,
						nonParamType, nonParamPackage, parameterizedType, jp2up, typeTypeAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedType2Interface_2_5_checkCSP_expressionFBB(
			ParameterizedType2Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterizedType2Interface_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterizedType2Interface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterizedType2Interface_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_10_1_initialbindings_blackBBBBB(
			ParameterizedType2Interface _this, Match match, org.eclipse.uml2.uml.Package umlPackage,
			Interface nonParamElement, Interface parameterizedClassifier) {
		if (!nonParamElement.equals(parameterizedClassifier)) {
			return new Object[] { _this, match, umlPackage, nonParamElement, parameterizedClassifier };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_10_2_SolveCSP_bindingFBBBBB(
			ParameterizedType2Interface _this, Match match, org.eclipse.uml2.uml.Package umlPackage,
			Interface nonParamElement, Interface parameterizedClassifier) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, umlPackage, nonParamElement,
				parameterizedClassifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, umlPackage, nonParamElement, parameterizedClassifier };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedType2Interface_10_2_SolveCSP_bindingAndBlackFBBBBB(
			ParameterizedType2Interface _this, Match match, org.eclipse.uml2.uml.Package umlPackage,
			Interface nonParamElement, Interface parameterizedClassifier) {
		Object[] result_pattern_ParameterizedType2Interface_10_2_SolveCSP_binding = pattern_ParameterizedType2Interface_10_2_SolveCSP_bindingFBBBBB(
				_this, match, umlPackage, nonParamElement, parameterizedClassifier);
		if (result_pattern_ParameterizedType2Interface_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedType2Interface_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ParameterizedType2Interface_10_2_SolveCSP_black = pattern_ParameterizedType2Interface_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedType2Interface_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, umlPackage, nonParamElement, parameterizedClassifier };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedType2Interface_10_3_CheckCSP_expressionFBB(
			ParameterizedType2Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_10_4_collectelementstobetranslated_blackBBBB(
			Match match, org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement,
			Interface parameterizedClassifier) {
		if (!nonParamElement.equals(parameterizedClassifier)) {
			return new Object[] { match, umlPackage, nonParamElement, parameterizedClassifier };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_10_4_collectelementstobetranslated_greenBBBF(
			Match match, org.eclipse.uml2.uml.Package umlPackage, Interface parameterizedClassifier) {
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

	public static final Object[] pattern_ParameterizedType2Interface_10_5_collectcontextelements_blackBBBB(Match match,
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, Interface parameterizedClassifier) {
		if (!nonParamElement.equals(parameterizedClassifier)) {
			return new Object[] { match, umlPackage, nonParamElement, parameterizedClassifier };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_10_5_collectcontextelements_greenBBBF(Match match,
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement) {
		EMoflonEdge umlPackage__nonParamElement____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(umlPackage);
		match.getContextNodes().add(nonParamElement);
		String umlPackage__nonParamElement____packagedElement_name_prime = "packagedElement";
		umlPackage__nonParamElement____packagedElement.setSrc(umlPackage);
		umlPackage__nonParamElement____packagedElement.setTrg(nonParamElement);
		match.getContextEdges().add(umlPackage__nonParamElement____packagedElement);
		umlPackage__nonParamElement____packagedElement
				.setName(umlPackage__nonParamElement____packagedElement_name_prime);
		return new Object[] { match, umlPackage, nonParamElement, umlPackage__nonParamElement____packagedElement };
	}

	public static final void pattern_ParameterizedType2Interface_10_6_registerobjectstomatch_expressionBBBBB(
			ParameterizedType2Interface _this, Match match, org.eclipse.uml2.uml.Package umlPackage,
			Interface nonParamElement, Interface parameterizedClassifier) {
		_this.registerObjectsToMatch_BWD(match, umlPackage, nonParamElement, parameterizedClassifier);

	}

	public static final boolean pattern_ParameterizedType2Interface_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedType2Interface_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("umlPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("nonParamElement");
		EObject _localVariable_2 = isApplicableMatch.getObject("ne2neNonParam");
		EObject _localVariable_3 = isApplicableMatch.getObject("parameterizedClassifier");
		EObject _localVariable_4 = isApplicableMatch.getObject("nonParamType");
		EObject _localVariable_5 = isApplicableMatch.getObject("nonParamPackage");
		EObject _localVariable_6 = isApplicableMatch.getObject("jp2up");
		EObject tmpUmlPackage = _localVariable_0;
		EObject tmpNonParamElement = _localVariable_1;
		EObject tmpNe2neNonParam = _localVariable_2;
		EObject tmpParameterizedClassifier = _localVariable_3;
		EObject tmpNonParamType = _localVariable_4;
		EObject tmpNonParamPackage = _localVariable_5;
		EObject tmpJp2up = _localVariable_6;
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
			if (tmpNonParamElement instanceof Interface) {
				Interface nonParamElement = (Interface) tmpNonParamElement;
				if (tmpNe2neNonParam instanceof ASTNode2Element) {
					ASTNode2Element ne2neNonParam = (ASTNode2Element) tmpNe2neNonParam;
					if (tmpParameterizedClassifier instanceof Interface) {
						Interface parameterizedClassifier = (Interface) tmpParameterizedClassifier;
						if (tmpNonParamType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) tmpNonParamType;
							if (tmpNonParamPackage instanceof org.eclipse.modisco.java.Package) {
								org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) tmpNonParamPackage;
								if (tmpJp2up instanceof JavaPackage2UmlPackage) {
									JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) tmpJp2up;
									return new Object[] { umlPackage, nonParamElement, ne2neNonParam,
											parameterizedClassifier, nonParamType, nonParamPackage, jp2up,
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

	public static final Object[] pattern_ParameterizedType2Interface_11_1_performtransformation_blackBBBBBBBFBB(
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, ASTNode2Element ne2neNonParam,
			Interface parameterizedClassifier, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, JavaPackage2UmlPackage jp2up,
			ParameterizedType2Interface _this, IsApplicableMatch isApplicableMatch) {
		if (!nonParamElement.equals(parameterizedClassifier)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { umlPackage, nonParamElement, ne2neNonParam, parameterizedClassifier,
							nonParamType, nonParamPackage, jp2up, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			ParameterizedType2Interface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterizedType2Interface_11_1_performtransformation_binding = pattern_ParameterizedType2Interface_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ParameterizedType2Interface_11_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result_pattern_ParameterizedType2Interface_11_1_performtransformation_binding[0];
			Interface nonParamElement = (Interface) result_pattern_ParameterizedType2Interface_11_1_performtransformation_binding[1];
			ASTNode2Element ne2neNonParam = (ASTNode2Element) result_pattern_ParameterizedType2Interface_11_1_performtransformation_binding[2];
			Interface parameterizedClassifier = (Interface) result_pattern_ParameterizedType2Interface_11_1_performtransformation_binding[3];
			AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result_pattern_ParameterizedType2Interface_11_1_performtransformation_binding[4];
			org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result_pattern_ParameterizedType2Interface_11_1_performtransformation_binding[5];
			JavaPackage2UmlPackage jp2up = (JavaPackage2UmlPackage) result_pattern_ParameterizedType2Interface_11_1_performtransformation_binding[6];

			Object[] result_pattern_ParameterizedType2Interface_11_1_performtransformation_black = pattern_ParameterizedType2Interface_11_1_performtransformation_blackBBBBBBBFBB(
					umlPackage, nonParamElement, ne2neNonParam, parameterizedClassifier, nonParamType, nonParamPackage,
					jp2up, _this, isApplicableMatch);
			if (result_pattern_ParameterizedType2Interface_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ParameterizedType2Interface_11_1_performtransformation_black[7];

				return new Object[] { umlPackage, nonParamElement, ne2neNonParam, parameterizedClassifier, nonParamType,
						nonParamPackage, jp2up, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_11_1_performtransformation_greenBBFFFB(
			Interface parameterizedClassifier, AbstractTypeDeclaration nonParamType, CSP csp) {
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
		return new Object[] { parameterizedClassifier, nonParamType, parameterizedType, ne2ne, typeTypeAccess, csp };
	}

	public static final Object[] pattern_ParameterizedType2Interface_11_2_collecttranslatedelements_blackBBBB(
			Interface parameterizedClassifier, ParameterizedType parameterizedType, ASTNode2Element ne2ne,
			TypeAccess typeTypeAccess) {
		return new Object[] { parameterizedClassifier, parameterizedType, ne2ne, typeTypeAccess };
	}

	public static final Object[] pattern_ParameterizedType2Interface_11_2_collecttranslatedelements_greenFBBBB(
			Interface parameterizedClassifier, ParameterizedType parameterizedType, ASTNode2Element ne2ne,
			TypeAccess typeTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(parameterizedClassifier);
		ruleresult.getCreatedElements().add(parameterizedType);
		ruleresult.getCreatedLinkElements().add(ne2ne);
		ruleresult.getCreatedElements().add(typeTypeAccess);
		return new Object[] { ruleresult, parameterizedClassifier, parameterizedType, ne2ne, typeTypeAccess };
	}

	public static final Object[] pattern_ParameterizedType2Interface_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject umlPackage, EObject nonParamElement, EObject ne2neNonParam,
			EObject parameterizedClassifier, EObject nonParamType, EObject nonParamPackage, EObject parameterizedType,
			EObject ne2ne, EObject jp2up, EObject typeTypeAccess) {
		if (!nonParamElement.equals(umlPackage)) {
			if (!nonParamElement.equals(parameterizedClassifier)) {
				if (!nonParamElement.equals(nonParamType)) {
					if (!nonParamElement.equals(nonParamPackage)) {
						if (!nonParamElement.equals(parameterizedType)) {
							if (!nonParamElement.equals(typeTypeAccess)) {
								if (!ne2neNonParam.equals(umlPackage)) {
									if (!ne2neNonParam.equals(nonParamElement)) {
										if (!ne2neNonParam.equals(parameterizedClassifier)) {
											if (!ne2neNonParam.equals(nonParamType)) {
												if (!ne2neNonParam.equals(nonParamPackage)) {
													if (!ne2neNonParam.equals(parameterizedType)) {
														if (!ne2neNonParam.equals(typeTypeAccess)) {
															if (!parameterizedClassifier.equals(umlPackage)) {
																if (!parameterizedClassifier
																		.equals(parameterizedType)) {
																	if (!parameterizedClassifier
																			.equals(typeTypeAccess)) {
																		if (!nonParamType.equals(umlPackage)) {
																			if (!nonParamType
																					.equals(parameterizedClassifier)) {
																				if (!nonParamType
																						.equals(parameterizedType)) {
																					if (!nonParamType
																							.equals(typeTypeAccess)) {
																						if (!nonParamPackage
																								.equals(umlPackage)) {
																							if (!nonParamPackage.equals(
																									parameterizedClassifier)) {
																								if (!nonParamPackage
																										.equals(nonParamType)) {
																									if (!nonParamPackage
																											.equals(parameterizedType)) {
																										if (!nonParamPackage
																												.equals(typeTypeAccess)) {
																											if (!parameterizedType
																													.equals(umlPackage)) {
																												if (!parameterizedType
																														.equals(typeTypeAccess)) {
																													if (!ne2ne
																															.equals(umlPackage)) {
																														if (!ne2ne
																																.equals(nonParamElement)) {
																															if (!ne2ne
																																	.equals(ne2neNonParam)) {
																																if (!ne2ne
																																		.equals(parameterizedClassifier)) {
																																	if (!ne2ne
																																			.equals(nonParamType)) {
																																		if (!ne2ne
																																				.equals(nonParamPackage)) {
																																			if (!ne2ne
																																					.equals(parameterizedType)) {
																																				if (!ne2ne
																																						.equals(typeTypeAccess)) {
																																					if (!jp2up
																																							.equals(umlPackage)) {
																																						if (!jp2up
																																								.equals(nonParamElement)) {
																																							if (!jp2up
																																									.equals(ne2neNonParam)) {
																																								if (!jp2up
																																										.equals(parameterizedClassifier)) {
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
																																														if (!typeTypeAccess
																																																.equals(umlPackage)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	umlPackage,
																																																	nonParamElement,
																																																	ne2neNonParam,
																																																	parameterizedClassifier,
																																																	nonParamType,
																																																	nonParamPackage,
																																																	parameterizedType,
																																																	ne2ne,
																																																	jp2up,
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
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterizedType2Interface_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject umlPackage, EObject parameterizedClassifier, EObject nonParamType,
			EObject parameterizedType, EObject ne2ne, EObject typeTypeAccess) {
		EMoflonEdge umlPackage__parameterizedClassifier____packagedElement = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parameterizedType__typeTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__parameterizedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__parameterizedClassifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeTypeAccess__nonParamType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nonParamType__typeTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterizedType2Interface";
		String umlPackage__parameterizedClassifier____packagedElement_name_prime = "packagedElement";
		String parameterizedType__typeTypeAccess____type_name_prime = "type";
		String ne2ne__parameterizedType____source_name_prime = "source";
		String ne2ne__parameterizedClassifier____target_name_prime = "target";
		String typeTypeAccess__nonParamType____type_name_prime = "type";
		String nonParamType__typeTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		umlPackage__parameterizedClassifier____packagedElement.setSrc(umlPackage);
		umlPackage__parameterizedClassifier____packagedElement.setTrg(parameterizedClassifier);
		ruleresult.getTranslatedEdges().add(umlPackage__parameterizedClassifier____packagedElement);
		parameterizedType__typeTypeAccess____type.setSrc(parameterizedType);
		parameterizedType__typeTypeAccess____type.setTrg(typeTypeAccess);
		ruleresult.getCreatedEdges().add(parameterizedType__typeTypeAccess____type);
		ne2ne__parameterizedType____source.setSrc(ne2ne);
		ne2ne__parameterizedType____source.setTrg(parameterizedType);
		ruleresult.getCreatedEdges().add(ne2ne__parameterizedType____source);
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
		umlPackage__parameterizedClassifier____packagedElement
				.setName(umlPackage__parameterizedClassifier____packagedElement_name_prime);
		parameterizedType__typeTypeAccess____type.setName(parameterizedType__typeTypeAccess____type_name_prime);
		ne2ne__parameterizedType____source.setName(ne2ne__parameterizedType____source_name_prime);
		ne2ne__parameterizedClassifier____target.setName(ne2ne__parameterizedClassifier____target_name_prime);
		typeTypeAccess__nonParamType____type.setName(typeTypeAccess__nonParamType____type_name_prime);
		nonParamType__typeTypeAccess____usagesInTypeAccess
				.setName(nonParamType__typeTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { ruleresult, umlPackage, parameterizedClassifier, nonParamType, parameterizedType, ne2ne,
				typeTypeAccess, umlPackage__parameterizedClassifier____packagedElement,
				parameterizedType__typeTypeAccess____type, ne2ne__parameterizedType____source,
				ne2ne__parameterizedClassifier____target, typeTypeAccess__nonParamType____type,
				nonParamType__typeTypeAccess____usagesInTypeAccess };
	}

	public static final void pattern_ParameterizedType2Interface_11_5_registerobjects_expressionBBBBBBBBBBBB(
			ParameterizedType2Interface _this, PerformRuleResult ruleresult, EObject umlPackage,
			EObject nonParamElement, EObject ne2neNonParam, EObject parameterizedClassifier, EObject nonParamType,
			EObject nonParamPackage, EObject parameterizedType, EObject ne2ne, EObject jp2up, EObject typeTypeAccess) {
		_this.registerObjects_BWD(ruleresult, umlPackage, nonParamElement, ne2neNonParam, parameterizedClassifier,
				nonParamType, nonParamPackage, parameterizedType, ne2ne, jp2up, typeTypeAccess);

	}

	public static final PerformRuleResult pattern_ParameterizedType2Interface_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_12_1_preparereturnvalue_bindingFB(
			ParameterizedType2Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_12_1_preparereturnvalue_blackFBB(EClass eClass,
			ParameterizedType2Interface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_12_1_preparereturnvalue_bindingAndBlackFFB(
			ParameterizedType2Interface _this) {
		Object[] result_pattern_ParameterizedType2Interface_12_1_preparereturnvalue_binding = pattern_ParameterizedType2Interface_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedType2Interface_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterizedType2Interface_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedType2Interface_12_1_preparereturnvalue_black = pattern_ParameterizedType2Interface_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterizedType2Interface_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterizedType2Interface_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ParameterizedType2Interface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterizedType2Interface_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("umlPackage");
		EObject _localVariable_1 = match.getObject("nonParamElement");
		EObject _localVariable_2 = match.getObject("parameterizedClassifier");
		EObject tmpUmlPackage = _localVariable_0;
		EObject tmpNonParamElement = _localVariable_1;
		EObject tmpParameterizedClassifier = _localVariable_2;
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
			if (tmpNonParamElement instanceof Interface) {
				Interface nonParamElement = (Interface) tmpNonParamElement;
				if (tmpParameterizedClassifier instanceof Interface) {
					Interface parameterizedClassifier = (Interface) tmpParameterizedClassifier;
					return new Object[] { umlPackage, nonParamElement, parameterizedClassifier, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedType2Interface_12_2_corematch_blackBBFBFFFB(
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, Interface parameterizedClassifier,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!nonParamElement.equals(parameterizedClassifier)) {
			for (ASTNode2Element ne2neNonParam : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(nonParamElement, ASTNode2Element.class, "target")) {
				ASTNode tmpNonParamType = ne2neNonParam.getSource();
				if (tmpNonParamType instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) tmpNonParamType;
					for (JavaPackage2UmlPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(umlPackage, JavaPackage2UmlPackage.class, "target")) {
						org.eclipse.modisco.java.Package nonParamPackage = jp2up.getSource();
						if (nonParamPackage != null) {
							_result.add(new Object[] { umlPackage, nonParamElement, ne2neNonParam,
									parameterizedClassifier, nonParamType, nonParamPackage, jp2up, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterizedType2Interface_12_3_findcontext_blackBBBBBBB(
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, ASTNode2Element ne2neNonParam,
			Interface parameterizedClassifier, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, JavaPackage2UmlPackage jp2up) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!nonParamElement.equals(parameterizedClassifier)) {
			if (umlPackage.getPackagedElements().contains(nonParamElement)) {
				if (umlPackage.getPackagedElements().contains(parameterizedClassifier)) {
					if (nonParamType.equals(ne2neNonParam.getSource())) {
						if (nonParamElement.equals(ne2neNonParam.getTarget())) {
							if (nonParamPackage.equals(jp2up.getSource())) {
								if (umlPackage.equals(jp2up.getTarget())) {
									if (nonParamPackage.getOwnedElements().contains(nonParamType)) {
										_result.add(new Object[] { umlPackage, nonParamElement, ne2neNonParam,
												parameterizedClassifier, nonParamType, nonParamPackage, jp2up });
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

	public static final Object[] pattern_ParameterizedType2Interface_12_3_findcontext_greenBBBBBBBFFFFFFFFF(
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, ASTNode2Element ne2neNonParam,
			Interface parameterizedClassifier, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, JavaPackage2UmlPackage jp2up) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge umlPackage__nonParamElement____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__parameterizedClassifier____packagedElement = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ne2neNonParam__nonParamType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2neNonParam__nonParamElement____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__nonParamPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__umlPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nonParamPackage__nonParamType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge nonParamType__nonParamPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String umlPackage__nonParamElement____packagedElement_name_prime = "packagedElement";
		String umlPackage__parameterizedClassifier____packagedElement_name_prime = "packagedElement";
		String ne2neNonParam__nonParamType____source_name_prime = "source";
		String ne2neNonParam__nonParamElement____target_name_prime = "target";
		String jp2up__nonParamPackage____source_name_prime = "source";
		String jp2up__umlPackage____target_name_prime = "target";
		String nonParamPackage__nonParamType____ownedElements_name_prime = "ownedElements";
		String nonParamType__nonParamPackage____package_name_prime = "package";
		isApplicableMatch.getAllContextElements().add(umlPackage);
		isApplicableMatch.getAllContextElements().add(nonParamElement);
		isApplicableMatch.getAllContextElements().add(ne2neNonParam);
		isApplicableMatch.getAllContextElements().add(parameterizedClassifier);
		isApplicableMatch.getAllContextElements().add(nonParamType);
		isApplicableMatch.getAllContextElements().add(nonParamPackage);
		isApplicableMatch.getAllContextElements().add(jp2up);
		umlPackage__nonParamElement____packagedElement.setSrc(umlPackage);
		umlPackage__nonParamElement____packagedElement.setTrg(nonParamElement);
		isApplicableMatch.getAllContextElements().add(umlPackage__nonParamElement____packagedElement);
		umlPackage__parameterizedClassifier____packagedElement.setSrc(umlPackage);
		umlPackage__parameterizedClassifier____packagedElement.setTrg(parameterizedClassifier);
		isApplicableMatch.getAllContextElements().add(umlPackage__parameterizedClassifier____packagedElement);
		ne2neNonParam__nonParamType____source.setSrc(ne2neNonParam);
		ne2neNonParam__nonParamType____source.setTrg(nonParamType);
		isApplicableMatch.getAllContextElements().add(ne2neNonParam__nonParamType____source);
		ne2neNonParam__nonParamElement____target.setSrc(ne2neNonParam);
		ne2neNonParam__nonParamElement____target.setTrg(nonParamElement);
		isApplicableMatch.getAllContextElements().add(ne2neNonParam__nonParamElement____target);
		jp2up__nonParamPackage____source.setSrc(jp2up);
		jp2up__nonParamPackage____source.setTrg(nonParamPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__nonParamPackage____source);
		jp2up__umlPackage____target.setSrc(jp2up);
		jp2up__umlPackage____target.setTrg(umlPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__umlPackage____target);
		nonParamPackage__nonParamType____ownedElements.setSrc(nonParamPackage);
		nonParamPackage__nonParamType____ownedElements.setTrg(nonParamType);
		isApplicableMatch.getAllContextElements().add(nonParamPackage__nonParamType____ownedElements);
		nonParamType__nonParamPackage____package.setSrc(nonParamType);
		nonParamType__nonParamPackage____package.setTrg(nonParamPackage);
		isApplicableMatch.getAllContextElements().add(nonParamType__nonParamPackage____package);
		umlPackage__nonParamElement____packagedElement
				.setName(umlPackage__nonParamElement____packagedElement_name_prime);
		umlPackage__parameterizedClassifier____packagedElement
				.setName(umlPackage__parameterizedClassifier____packagedElement_name_prime);
		ne2neNonParam__nonParamType____source.setName(ne2neNonParam__nonParamType____source_name_prime);
		ne2neNonParam__nonParamElement____target.setName(ne2neNonParam__nonParamElement____target_name_prime);
		jp2up__nonParamPackage____source.setName(jp2up__nonParamPackage____source_name_prime);
		jp2up__umlPackage____target.setName(jp2up__umlPackage____target_name_prime);
		nonParamPackage__nonParamType____ownedElements
				.setName(nonParamPackage__nonParamType____ownedElements_name_prime);
		nonParamType__nonParamPackage____package.setName(nonParamType__nonParamPackage____package_name_prime);
		return new Object[] { umlPackage, nonParamElement, ne2neNonParam, parameterizedClassifier, nonParamType,
				nonParamPackage, jp2up, isApplicableMatch, umlPackage__nonParamElement____packagedElement,
				umlPackage__parameterizedClassifier____packagedElement, ne2neNonParam__nonParamType____source,
				ne2neNonParam__nonParamElement____target, jp2up__nonParamPackage____source, jp2up__umlPackage____target,
				nonParamPackage__nonParamType____ownedElements, nonParamType__nonParamPackage____package };
	}

	public static final Object[] pattern_ParameterizedType2Interface_12_4_solveCSP_bindingFBBBBBBBBB(
			ParameterizedType2Interface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, ASTNode2Element ne2neNonParam,
			Interface parameterizedClassifier, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, JavaPackage2UmlPackage jp2up) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, umlPackage, nonParamElement,
				ne2neNonParam, parameterizedClassifier, nonParamType, nonParamPackage, jp2up);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, umlPackage, nonParamElement, ne2neNonParam,
					parameterizedClassifier, nonParamType, nonParamPackage, jp2up };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedType2Interface_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			ParameterizedType2Interface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, ASTNode2Element ne2neNonParam,
			Interface parameterizedClassifier, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, JavaPackage2UmlPackage jp2up) {
		Object[] result_pattern_ParameterizedType2Interface_12_4_solveCSP_binding = pattern_ParameterizedType2Interface_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, umlPackage, nonParamElement, ne2neNonParam, parameterizedClassifier,
				nonParamType, nonParamPackage, jp2up);
		if (result_pattern_ParameterizedType2Interface_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedType2Interface_12_4_solveCSP_binding[0];

			Object[] result_pattern_ParameterizedType2Interface_12_4_solveCSP_black = pattern_ParameterizedType2Interface_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedType2Interface_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, umlPackage, nonParamElement, ne2neNonParam,
						parameterizedClassifier, nonParamType, nonParamPackage, jp2up };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedType2Interface_12_5_checkCSP_expressionFBB(
			ParameterizedType2Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterizedType2Interface_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterizedType2Interface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterizedType2Interface_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_20_1_preparereturnvalue_bindingFB(
			ParameterizedType2Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ParameterizedType2Interface _this) {
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

	public static final Object[] pattern_ParameterizedType2Interface_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ParameterizedType2Interface _this) {
		Object[] result_pattern_ParameterizedType2Interface_20_1_preparereturnvalue_binding = pattern_ParameterizedType2Interface_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedType2Interface_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterizedType2Interface_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedType2Interface_20_1_preparereturnvalue_black = pattern_ParameterizedType2Interface_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ParameterizedType2Interface_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterizedType2Interface_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ParameterizedType2Interface_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParameterizedType2Interface_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_packagedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUmlPackage = _edge_packagedElement.getSrc();
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
			EObject tmpParameterizedClassifier = _edge_packagedElement.getTrg();
			if (tmpParameterizedClassifier instanceof Interface) {
				Interface parameterizedClassifier = (Interface) tmpParameterizedClassifier;
				if (umlPackage.getPackagedElements().contains(parameterizedClassifier)) {
					for (PackageableElement tmpNonParamElement : umlPackage.getPackagedElements()) {
						if (tmpNonParamElement instanceof Interface) {
							Interface nonParamElement = (Interface) tmpNonParamElement;
							if (!nonParamElement.equals(parameterizedClassifier)) {
								_result.add(new Object[] { umlPackage, nonParamElement, parameterizedClassifier,
										_edge_packagedElement });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterizedType2Interface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			ParameterizedType2Interface _this, Match match, org.eclipse.uml2.uml.Package umlPackage,
			Interface nonParamElement, Interface parameterizedClassifier) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, umlPackage, nonParamElement, parameterizedClassifier);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterizedType2Interface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ParameterizedType2Interface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ParameterizedType2Interface_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_21_1_preparereturnvalue_bindingFB(
			ParameterizedType2Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ParameterizedType2Interface _this) {
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

	public static final Object[] pattern_ParameterizedType2Interface_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ParameterizedType2Interface _this) {
		Object[] result_pattern_ParameterizedType2Interface_21_1_preparereturnvalue_binding = pattern_ParameterizedType2Interface_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedType2Interface_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterizedType2Interface_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedType2Interface_21_1_preparereturnvalue_black = pattern_ParameterizedType2Interface_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ParameterizedType2Interface_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterizedType2Interface_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ParameterizedType2Interface_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_black_nac_0BB(
			TypeAccess typeTypeAccess, AbstractTypeDeclaration nonParamType) {
		for (AbstractTypeDeclaration __DEC_typeTypeAccess_superInterfaces_480272 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!nonParamType.equals(__DEC_typeTypeAccess_superInterfaces_480272)) {
				return new Object[] { typeTypeAccess, nonParamType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess typeTypeAccess) {
		for (Annotation __DEC_typeTypeAccess_type_950331 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, Annotation.class, "type")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_black_nac_2B(
			TypeAccess typeTypeAccess) {
		for (ArrayType __DEC_typeTypeAccess_elementType_11182 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, ArrayType.class, "elementType")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_black_nac_3BB(
			TypeAccess typeTypeAccess, AbstractTypeDeclaration nonParamType) {
		for (ClassDeclaration __DEC_typeTypeAccess_superClass_463348 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!nonParamType.equals(__DEC_typeTypeAccess_superClass_463348)) {
				return new Object[] { typeTypeAccess, nonParamType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_black_nac_4B(
			TypeAccess typeTypeAccess) {
		for (MethodDeclaration __DEC_typeTypeAccess_returnType_823507 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess typeTypeAccess) {
		for (SingleVariableDeclaration __DEC_typeTypeAccess_type_920006 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess typeTypeAccess) {
		for (AnnotationMemberValuePair __DEC_typeTypeAccess_value_258396 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_black_nac_7BB(
			AbstractTypeDeclaration nonParamType, TypeAccess typeTypeAccess) {
		if (nonParamType.getSuperInterfaces().contains(typeTypeAccess)) {
			return new Object[] { nonParamType, typeTypeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_blackFFFFB(
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
						org.eclipse.modisco.java.Package nonParamPackage = nonParamType.getPackage();
						if (nonParamPackage != null) {
							if (pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_black_nac_1B(
									typeTypeAccess) == null) {
								if (pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_black_nac_2B(
										typeTypeAccess) == null) {
									if (pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_black_nac_4B(
											typeTypeAccess) == null) {
										if (pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_black_nac_5B(
												typeTypeAccess) == null) {
											if (pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_black_nac_6B(
													typeTypeAccess) == null) {
												if (pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_black_nac_0BB(
														typeTypeAccess, nonParamType) == null) {
													if (pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_black_nac_3BB(
															typeTypeAccess, nonParamType) == null) {
														if (pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_black_nac_7BB(
																nonParamType, typeTypeAccess) == null) {
															_result.add(new Object[] { nonParamType, nonParamPackage,
																	parameterizedType, typeTypeAccess, _edge_type });
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterizedType2Interface_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterizedType2Interface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			ParameterizedType2Interface _this, Match match, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, nonParamType, nonParamPackage, parameterizedType,
				typeTypeAccess);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterizedType2Interface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ParameterizedType2Interface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ParameterizedType2Interface_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_24_1_prepare_blackB(
			ParameterizedType2Interface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParameterizedType2Interface_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ParameterizedType2Interface_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("umlPackage");
		EObject _localVariable_1 = targetMatch.getObject("nonParamElement");
		EObject _localVariable_2 = targetMatch.getObject("parameterizedClassifier");
		EObject _localVariable_3 = sourceMatch.getObject("nonParamType");
		EObject _localVariable_4 = sourceMatch.getObject("nonParamPackage");
		EObject _localVariable_5 = sourceMatch.getObject("parameterizedType");
		EObject _localVariable_6 = sourceMatch.getObject("typeTypeAccess");
		EObject tmpUmlPackage = _localVariable_0;
		EObject tmpNonParamElement = _localVariable_1;
		EObject tmpParameterizedClassifier = _localVariable_2;
		EObject tmpNonParamType = _localVariable_3;
		EObject tmpNonParamPackage = _localVariable_4;
		EObject tmpParameterizedType = _localVariable_5;
		EObject tmpTypeTypeAccess = _localVariable_6;
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) tmpUmlPackage;
			if (tmpNonParamElement instanceof Interface) {
				Interface nonParamElement = (Interface) tmpNonParamElement;
				if (tmpParameterizedClassifier instanceof Interface) {
					Interface parameterizedClassifier = (Interface) tmpParameterizedClassifier;
					if (tmpNonParamType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) tmpNonParamType;
						if (tmpNonParamPackage instanceof org.eclipse.modisco.java.Package) {
							org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) tmpNonParamPackage;
							if (tmpParameterizedType instanceof ParameterizedType) {
								ParameterizedType parameterizedType = (ParameterizedType) tmpParameterizedType;
								if (tmpTypeTypeAccess instanceof TypeAccess) {
									TypeAccess typeTypeAccess = (TypeAccess) tmpTypeTypeAccess;
									return new Object[] { umlPackage, nonParamElement, parameterizedClassifier,
											nonParamType, nonParamPackage, parameterizedType, typeTypeAccess,
											targetMatch, sourceMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, Interface parameterizedClassifier,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, TypeAccess typeTypeAccess, Match sourceMatch, Match targetMatch) {
		if (!nonParamElement.equals(parameterizedClassifier)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { umlPackage, nonParamElement, parameterizedClassifier, nonParamType,
						nonParamPackage, parameterizedType, typeTypeAccess, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ParameterizedType2Interface_24_2_matchsrctrgcontext_binding = pattern_ParameterizedType2Interface_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_ParameterizedType2Interface_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.uml2.uml.Package umlPackage = (org.eclipse.uml2.uml.Package) result_pattern_ParameterizedType2Interface_24_2_matchsrctrgcontext_binding[0];
			Interface nonParamElement = (Interface) result_pattern_ParameterizedType2Interface_24_2_matchsrctrgcontext_binding[1];
			Interface parameterizedClassifier = (Interface) result_pattern_ParameterizedType2Interface_24_2_matchsrctrgcontext_binding[2];
			AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) result_pattern_ParameterizedType2Interface_24_2_matchsrctrgcontext_binding[3];
			org.eclipse.modisco.java.Package nonParamPackage = (org.eclipse.modisco.java.Package) result_pattern_ParameterizedType2Interface_24_2_matchsrctrgcontext_binding[4];
			ParameterizedType parameterizedType = (ParameterizedType) result_pattern_ParameterizedType2Interface_24_2_matchsrctrgcontext_binding[5];
			TypeAccess typeTypeAccess = (TypeAccess) result_pattern_ParameterizedType2Interface_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_ParameterizedType2Interface_24_2_matchsrctrgcontext_black = pattern_ParameterizedType2Interface_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					umlPackage, nonParamElement, parameterizedClassifier, nonParamType, nonParamPackage,
					parameterizedType, typeTypeAccess, sourceMatch, targetMatch);
			if (result_pattern_ParameterizedType2Interface_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { umlPackage, nonParamElement, parameterizedClassifier, nonParamType,
						nonParamPackage, parameterizedType, typeTypeAccess, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_24_3_solvecsp_bindingFBBBBBBBBBB(
			ParameterizedType2Interface _this, org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement,
			Interface parameterizedClassifier, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(umlPackage, nonParamElement, parameterizedClassifier,
				nonParamType, nonParamPackage, parameterizedType, typeTypeAccess, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, umlPackage, nonParamElement, parameterizedClassifier, nonParamType,
					nonParamPackage, parameterizedType, typeTypeAccess, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedType2Interface_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			ParameterizedType2Interface _this, org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement,
			Interface parameterizedClassifier, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, ParameterizedType parameterizedType,
			TypeAccess typeTypeAccess, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ParameterizedType2Interface_24_3_solvecsp_binding = pattern_ParameterizedType2Interface_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, umlPackage, nonParamElement, parameterizedClassifier, nonParamType, nonParamPackage,
				parameterizedType, typeTypeAccess, sourceMatch, targetMatch);
		if (result_pattern_ParameterizedType2Interface_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedType2Interface_24_3_solvecsp_binding[0];

			Object[] result_pattern_ParameterizedType2Interface_24_3_solvecsp_black = pattern_ParameterizedType2Interface_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ParameterizedType2Interface_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, umlPackage, nonParamElement, parameterizedClassifier, nonParamType,
						nonParamPackage, parameterizedType, typeTypeAccess, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedType2Interface_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterizedType2Interface_24_5_matchcorrcontext_blackBBFBBFBB(
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, AbstractTypeDeclaration nonParamType,
			org.eclipse.modisco.java.Package nonParamPackage, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element ne2neNonParam : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(nonParamType, ASTNode2Element.class, "source")) {
				if (nonParamElement.equals(ne2neNonParam.getTarget())) {
					for (JavaPackage2UmlPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(nonParamPackage, JavaPackage2UmlPackage.class, "source")) {
						if (umlPackage.equals(jp2up.getTarget())) {
							_result.add(new Object[] { umlPackage, nonParamElement, ne2neNonParam, nonParamType,
									nonParamPackage, jp2up, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_24_5_matchcorrcontext_greenBBBBF(
			ASTNode2Element ne2neNonParam, JavaPackage2UmlPackage jp2up, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ParameterizedType2Interface";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(ne2neNonParam);
		ccMatch.getAllContextElements().add(jp2up);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { ne2neNonParam, jp2up, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ParameterizedType2Interface_24_6_createcorrespondence_blackBBBBBBBB(
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, Interface parameterizedClassifier,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, TypeAccess typeTypeAccess, CCMatch ccMatch) {
		if (!nonParamElement.equals(parameterizedClassifier)) {
			return new Object[] { umlPackage, nonParamElement, parameterizedClassifier, nonParamType, nonParamPackage,
					parameterizedType, typeTypeAccess, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_24_6_createcorrespondence_greenBBFB(
			Interface parameterizedClassifier, ParameterizedType parameterizedType, CCMatch ccMatch) {
		ASTNode2Element ne2ne = UmlFactory.eINSTANCE.createASTNode2Element();
		ne2ne.setSource(parameterizedType);
		ne2ne.setTarget(parameterizedClassifier);
		ccMatch.getCreateCorr().add(ne2ne);
		return new Object[] { parameterizedClassifier, parameterizedType, ne2ne, ccMatch };
	}

	public static final Object[] pattern_ParameterizedType2Interface_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ParameterizedType2Interface_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ParameterizedType2Interface";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterizedType2Interface_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_27_1_matchtggpattern_black_nac_0BB(
			TypeAccess typeTypeAccess, AbstractTypeDeclaration nonParamType) {
		for (AbstractTypeDeclaration __DEC_typeTypeAccess_superInterfaces_993040 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!nonParamType.equals(__DEC_typeTypeAccess_superInterfaces_993040)) {
				return new Object[] { typeTypeAccess, nonParamType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_27_1_matchtggpattern_black_nac_1B(
			TypeAccess typeTypeAccess) {
		for (Annotation __DEC_typeTypeAccess_type_597127 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, Annotation.class, "type")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_27_1_matchtggpattern_black_nac_2B(
			TypeAccess typeTypeAccess) {
		for (ArrayType __DEC_typeTypeAccess_elementType_811489 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, ArrayType.class, "elementType")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_27_1_matchtggpattern_black_nac_3BB(
			TypeAccess typeTypeAccess, AbstractTypeDeclaration nonParamType) {
		for (ClassDeclaration __DEC_typeTypeAccess_superClass_423920 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!nonParamType.equals(__DEC_typeTypeAccess_superClass_423920)) {
				return new Object[] { typeTypeAccess, nonParamType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_27_1_matchtggpattern_black_nac_4B(
			TypeAccess typeTypeAccess) {
		for (MethodDeclaration __DEC_typeTypeAccess_returnType_882265 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_27_1_matchtggpattern_black_nac_5B(
			TypeAccess typeTypeAccess) {
		for (SingleVariableDeclaration __DEC_typeTypeAccess_type_580916 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_27_1_matchtggpattern_black_nac_6B(
			TypeAccess typeTypeAccess) {
		for (AnnotationMemberValuePair __DEC_typeTypeAccess_value_73939 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_27_1_matchtggpattern_black_nac_7BB(
			AbstractTypeDeclaration nonParamType, TypeAccess typeTypeAccess) {
		if (nonParamType.getSuperInterfaces().contains(typeTypeAccess)) {
			return new Object[] { nonParamType, typeTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_27_1_matchtggpattern_blackBBBB(
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			ParameterizedType parameterizedType, TypeAccess typeTypeAccess) {
		if (typeTypeAccess.equals(parameterizedType.getType())) {
			if (nonParamType.equals(typeTypeAccess.getType())) {
				if (nonParamPackage.getOwnedElements().contains(nonParamType)) {
					if (pattern_ParameterizedType2Interface_27_1_matchtggpattern_black_nac_0BB(typeTypeAccess,
							nonParamType) == null) {
						if (pattern_ParameterizedType2Interface_27_1_matchtggpattern_black_nac_1B(
								typeTypeAccess) == null) {
							if (pattern_ParameterizedType2Interface_27_1_matchtggpattern_black_nac_2B(
									typeTypeAccess) == null) {
								if (pattern_ParameterizedType2Interface_27_1_matchtggpattern_black_nac_3BB(
										typeTypeAccess, nonParamType) == null) {
									if (pattern_ParameterizedType2Interface_27_1_matchtggpattern_black_nac_4B(
											typeTypeAccess) == null) {
										if (pattern_ParameterizedType2Interface_27_1_matchtggpattern_black_nac_5B(
												typeTypeAccess) == null) {
											if (pattern_ParameterizedType2Interface_27_1_matchtggpattern_black_nac_6B(
													typeTypeAccess) == null) {
												if (pattern_ParameterizedType2Interface_27_1_matchtggpattern_black_nac_7BB(
														nonParamType, typeTypeAccess) == null) {
													return new Object[] { nonParamType, nonParamPackage,
															parameterizedType, typeTypeAccess };
												}
											}
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

	public static final boolean pattern_ParameterizedType2Interface_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedType2Interface_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_28_1_matchtggpattern_blackBBB(
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, Interface parameterizedClassifier) {
		if (!nonParamElement.equals(parameterizedClassifier)) {
			if (umlPackage.getPackagedElements().contains(nonParamElement)) {
				if (umlPackage.getPackagedElements().contains(parameterizedClassifier)) {
					return new Object[] { umlPackage, nonParamElement, parameterizedClassifier };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedType2Interface_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedType2Interface_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_29_1_createresult_blackB(
			ParameterizedType2Interface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParameterizedType2Interface_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ParameterizedType2Interface_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Package umlPackage) {
		if (ruleResult.getTargetObjects().contains(umlPackage)) {
			return new Object[] { ruleResult, umlPackage };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Interface nonParamElement) {
		if (ruleResult.getTargetObjects().contains(nonParamElement)) {
			return new Object[] { ruleResult, nonParamElement };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element ne2neNonParam) {
		if (ruleResult.getCorrObjects().contains(ne2neNonParam)) {
			return new Object[] { ruleResult, ne2neNonParam };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration nonParamType) {
		if (ruleResult.getSourceObjects().contains(nonParamType)) {
			return new Object[] { ruleResult, nonParamType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.modisco.java.Package nonParamPackage) {
		if (ruleResult.getSourceObjects().contains(nonParamPackage)) {
			return new Object[] { ruleResult, nonParamPackage };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, JavaPackage2UmlPackage jp2up) {
		if (ruleResult.getCorrObjects().contains(jp2up)) {
			return new Object[] { ruleResult, jp2up };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedType2Interface_29_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList ne2neNonParamList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpNe2neNonParam : ne2neNonParamList.getEntryObjects()) {
				if (tmpNe2neNonParam instanceof ASTNode2Element) {
					ASTNode2Element ne2neNonParam = (ASTNode2Element) tmpNe2neNonParam;
					Element tmpNonParamElement = ne2neNonParam.getTarget();
					if (tmpNonParamElement instanceof Interface) {
						Interface nonParamElement = (Interface) tmpNonParamElement;
						ASTNode tmpNonParamType = ne2neNonParam.getSource();
						if (tmpNonParamType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration nonParamType = (AbstractTypeDeclaration) tmpNonParamType;
							org.eclipse.modisco.java.Package nonParamPackage = nonParamType.getPackage();
							if (nonParamPackage != null) {
								if (pattern_ParameterizedType2Interface_29_2_isapplicablecore_black_nac_2BB(ruleResult,
										ne2neNonParam) == null) {
									if (pattern_ParameterizedType2Interface_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, nonParamElement) == null) {
										if (pattern_ParameterizedType2Interface_29_2_isapplicablecore_black_nac_3BB(
												ruleResult, nonParamType) == null) {
											if (pattern_ParameterizedType2Interface_29_2_isapplicablecore_black_nac_4BB(
													ruleResult, nonParamPackage) == null) {
												for (org.eclipse.uml2.uml.Package umlPackage : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(nonParamElement,
																org.eclipse.uml2.uml.Package.class,
																"packagedElement")) {
													if (pattern_ParameterizedType2Interface_29_2_isapplicablecore_black_nac_0BB(
															ruleResult, umlPackage) == null) {
														for (JavaPackage2UmlPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(nonParamPackage,
																		JavaPackage2UmlPackage.class, "source")) {
															if (umlPackage.equals(jp2up.getTarget())) {
																if (pattern_ParameterizedType2Interface_29_2_isapplicablecore_black_nac_5BB(
																		ruleResult, jp2up) == null) {
																	_result.add(new Object[] { ne2neNonParamList,
																			umlPackage, nonParamElement, ne2neNonParam,
																			nonParamType, nonParamPackage, jp2up,
																			ruleEntryContainer, ruleResult });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterizedType2Interface_29_3_solveCSP_bindingFBBBBBBBBB(
			ParameterizedType2Interface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, ASTNode2Element ne2neNonParam,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			JavaPackage2UmlPackage jp2up, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, umlPackage, nonParamElement,
				ne2neNonParam, nonParamType, nonParamPackage, jp2up, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, umlPackage, nonParamElement, ne2neNonParam,
					nonParamType, nonParamPackage, jp2up, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedType2Interface_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedType2Interface_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			ParameterizedType2Interface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, ASTNode2Element ne2neNonParam,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			JavaPackage2UmlPackage jp2up, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ParameterizedType2Interface_29_3_solveCSP_binding = pattern_ParameterizedType2Interface_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, umlPackage, nonParamElement, ne2neNonParam, nonParamType, nonParamPackage,
				jp2up, ruleResult);
		if (result_pattern_ParameterizedType2Interface_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedType2Interface_29_3_solveCSP_binding[0];

			Object[] result_pattern_ParameterizedType2Interface_29_3_solveCSP_black = pattern_ParameterizedType2Interface_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedType2Interface_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, umlPackage, nonParamElement, ne2neNonParam,
						nonParamType, nonParamPackage, jp2up, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedType2Interface_29_4_checkCSP_expressionFBB(
			ParameterizedType2Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedType2Interface_29_5_checknacs_blackBBBBBB(
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, ASTNode2Element ne2neNonParam,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			JavaPackage2UmlPackage jp2up) {
		return new Object[] { umlPackage, nonParamElement, ne2neNonParam, nonParamType, nonParamPackage, jp2up };
	}

	public static final Object[] pattern_ParameterizedType2Interface_29_6_perform_blackBBBBBBB(
			org.eclipse.uml2.uml.Package umlPackage, Interface nonParamElement, ASTNode2Element ne2neNonParam,
			AbstractTypeDeclaration nonParamType, org.eclipse.modisco.java.Package nonParamPackage,
			JavaPackage2UmlPackage jp2up, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { umlPackage, nonParamElement, ne2neNonParam, nonParamType, nonParamPackage, jp2up,
				ruleResult };
	}

	public static final Object[] pattern_ParameterizedType2Interface_29_6_perform_greenBFBFFFBB(
			org.eclipse.uml2.uml.Package umlPackage, AbstractTypeDeclaration nonParamType,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Interface parameterizedClassifier = UMLFactory.eINSTANCE.createInterface();
		ParameterizedType parameterizedType = JavaFactory.eINSTANCE.createParameterizedType();
		ASTNode2Element ne2ne = UmlFactory.eINSTANCE.createASTNode2Element();
		TypeAccess typeTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		Object _localVariable_0 = csp.getValue("parameterizedClassifier", "name");
		Object _localVariable_1 = csp.getValue("parameterizedType", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		umlPackage.getPackagedElements().add(parameterizedClassifier);
		ruleResult.getTargetObjects().add(parameterizedClassifier);
		ruleResult.getSourceObjects().add(parameterizedType);
		ne2ne.setSource(parameterizedType);
		ne2ne.setTarget(parameterizedClassifier);
		ruleResult.getCorrObjects().add(ne2ne);
		parameterizedType.setType(typeTypeAccess);
		typeTypeAccess.setType(nonParamType);
		ruleResult.getSourceObjects().add(typeTypeAccess);
		String parameterizedClassifier_name_prime = (String) _localVariable_0;
		String parameterizedType_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		parameterizedClassifier.setName(parameterizedClassifier_name_prime);
		parameterizedType.setName(parameterizedType_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { umlPackage, parameterizedClassifier, nonParamType, parameterizedType, ne2ne,
				typeTypeAccess, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ParameterizedType2Interface_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParameterizedType2InterfaceImpl
