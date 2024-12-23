/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.AnnotationTypeMemberDeclaration;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.Rules.ClassImplementsPatrameterizedInterface;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TInterface;

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
import org.gravity.tgg.modisco.pm.csp.constraints.*;
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
 * An implementation of the model object '<em><b>Class Implements Patrameterized Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClassImplementsPatrameterizedInterfaceImpl extends AbstractRuleImpl
		implements ClassImplementsPatrameterizedInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImplementsPatrameterizedInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getClassImplementsPatrameterizedInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			ParameterizedType eType, InterfaceDeclaration eSuperInterface, TypeAccess eParameterTypeAccess) {

		Object[] result1_black = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_0_1_initialbindings_blackBBBBBBB(this, match,
						eClassDeclaration, eTypeAccess, eType, eSuperInterface, eParameterTypeAccess);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = " + eType + ", " + "[eSuperInterface] = "
					+ eSuperInterface + ", " + "[eParameterTypeAccess] = " + eParameterTypeAccess + ".");
		}

		Object[] result2_bindingAndBlack = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match,
						eClassDeclaration, eTypeAccess, eType, eSuperInterface, eParameterTypeAccess);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = " + eType + ", " + "[eSuperInterface] = "
					+ eSuperInterface + ", " + "[eParameterTypeAccess] = " + eParameterTypeAccess + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_0_4_collectelementstobetranslated_blackBBBBBB(match,
							eClassDeclaration, eTypeAccess, eType, eSuperInterface, eParameterTypeAccess);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
						+ "[eType] = " + eType + ", " + "[eSuperInterface] = " + eSuperInterface + ", "
						+ "[eParameterTypeAccess] = " + eParameterTypeAccess + ".");
			}
			ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_0_4_collectelementstobetranslated_greenBBBBFFF(
							match, eClassDeclaration, eTypeAccess, eType);
			//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[6];

			Object[] result5_black = ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_0_5_collectcontextelements_blackBBBBBB(match,
							eClassDeclaration, eTypeAccess, eType, eSuperInterface, eParameterTypeAccess);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
						+ "[eType] = " + eType + ", " + "[eSuperInterface] = " + eSuperInterface + ", "
						+ "[eParameterTypeAccess] = " + eParameterTypeAccess + ".");
			}
			ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_0_5_collectcontextelements_greenBBBBBFFF(match,
							eClassDeclaration, eType, eSuperInterface, eParameterTypeAccess);
			//nothing EMoflonEdge eType__eParameterTypeAccess____type = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge eParameterTypeAccess__eSuperInterface____type = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge eSuperInterface__eParameterTypeAccess____usagesInTypeAccess = (EMoflonEdge) result5_green[7];

			// 
			ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_0_6_registerobjectstomatch_expressionBBBBBBB(this,
							match, eClassDeclaration, eTypeAccess, eType, eSuperInterface, eParameterTypeAccess);
			return ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_0_7_expressionF();
		} else {
			return ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TClass tClass = (TClass) result1_bindingAndBlack[0];
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result1_bindingAndBlack[1];
		TypeAccess eTypeAccess = (TypeAccess) result1_bindingAndBlack[2];
		TInterface tSuperInterface = (TInterface) result1_bindingAndBlack[3];
		ParameterizedType eType = (ParameterizedType) result1_bindingAndBlack[4];
		InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result1_bindingAndBlack[5];
		TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result1_bindingAndBlack[6];
		TypeAccess eParameterTypeAccess = (TypeAccess) result1_bindingAndBlack[7];
		TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_greenBB(tClass,
						tSuperInterface);

		Object[] result2_black = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_1_2_collecttranslatedelements_blackB(eTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[eTypeAccess] = " + eTypeAccess + ".");
		}
		Object[] result2_green = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_1_2_collecttranslatedelements_greenFB(eTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType, eSuperInterface,
						eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tClass] = " + tClass + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[tSuperInterface] = " + tSuperInterface + ", "
					+ "[eType] = " + eType + ", " + "[eSuperInterface] = " + eSuperInterface + ", "
					+ "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass + ", " + "[eParameterTypeAccess] = "
					+ eParameterTypeAccess + ", " + "[eSuperInterfaceToTSuperInterface] = "
					+ eSuperInterfaceToTSuperInterface + ".");
		}
		ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
						tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType);
		//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tClass__tSuperInterface____implements = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tSuperInterface__tClass____implementedBy = (EMoflonEdge) result3_green[10];

		// 
		// 
		ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_1_5_registerobjects_expressionBBBBBBBBBBB(this,
						ruleresult, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType, eSuperInterface,
						eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface);
		return ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_binding[0];
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[1];
		ParameterizedType eType = (ParameterizedType) result2_binding[2];
		InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_binding[3];
		TypeAccess eParameterTypeAccess = (TypeAccess) result2_binding[4];
		for (Object[] result2_black : ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_2_2_corematch_blackFBBFBBFBFB(eClassDeclaration,
						eTypeAccess, eType, eSuperInterface, eParameterTypeAccess, match)) {
			TClass tClass = (TClass) result2_black[0];
			TInterface tSuperInterface = (TInterface) result2_black[3];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result2_black[6];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result2_black[8];
			// ForEach 
			for (Object[] result3_black : ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_2_3_findcontext_blackBBBBBBBBB(tClass,
							eClassDeclaration, eTypeAccess, tSuperInterface, eType, eSuperInterface,
							eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface)) {
				Object[] result3_green = ClassImplementsPatrameterizedInterfaceImpl
						.pattern_ClassImplementsPatrameterizedInterface_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFF(
								tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType, eSuperInterface,
								eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge eType__eParameterTypeAccess____type = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge eClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge eParameterTypeAccess__eSuperInterface____type = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge eSuperInterface__eParameterTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[19];

				Object[] result4_bindingAndBlack = ClassImplementsPatrameterizedInterfaceImpl
						.pattern_ClassImplementsPatrameterizedInterface_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType,
								eSuperInterface, eClassDeclarationToTClass, eParameterTypeAccess,
								eSuperInterfaceToTSuperInterface);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tClass] = " + tClass + ", "
							+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[eTypeAccess] = " + eTypeAccess
							+ ", " + "[tSuperInterface] = " + tSuperInterface + ", " + "[eType] = " + eType + ", "
							+ "[eSuperInterface] = " + eSuperInterface + ", " + "[eClassDeclarationToTClass] = "
							+ eClassDeclarationToTClass + ", " + "[eParameterTypeAccess] = " + eParameterTypeAccess
							+ ", " + "[eSuperInterfaceToTSuperInterface] = " + eSuperInterfaceToTSuperInterface + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassImplementsPatrameterizedInterfaceImpl
						.pattern_ClassImplementsPatrameterizedInterface_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ClassImplementsPatrameterizedInterfaceImpl
							.pattern_ClassImplementsPatrameterizedInterface_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassImplementsPatrameterizedInterfaceImpl
							.pattern_ClassImplementsPatrameterizedInterface_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			ParameterizedType eType, InterfaceDeclaration eSuperInterface, TypeAccess eParameterTypeAccess) {
		match.registerObject("eClassDeclaration", eClassDeclaration);
		match.registerObject("eTypeAccess", eTypeAccess);
		match.registerObject("eType", eType);
		match.registerObject("eSuperInterface", eSuperInterface);
		match.registerObject("eParameterTypeAccess", eParameterTypeAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			ParameterizedType eType, InterfaceDeclaration eSuperInterface, TypeAccess eParameterTypeAccess) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TClass tClass,
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			ParameterizedType eType, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, TypeAccess eParameterTypeAccess,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("eClassDeclaration", eClassDeclaration);
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
		isApplicableMatch.registerObject("tSuperInterface", tSuperInterface);
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("eSuperInterface", eSuperInterface);
		isApplicableMatch.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		isApplicableMatch.registerObject("eParameterTypeAccess", eParameterTypeAccess);
		isApplicableMatch.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tClass, EObject eClassDeclaration,
			EObject eTypeAccess, EObject tSuperInterface, EObject eType, EObject eSuperInterface,
			EObject eClassDeclarationToTClass, EObject eParameterTypeAccess, EObject eSuperInterfaceToTSuperInterface) {
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("eClassDeclaration", eClassDeclaration);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("tSuperInterface", tSuperInterface);
		ruleresult.registerObject("eType", eType);
		ruleresult.registerObject("eSuperInterface", eSuperInterface);
		ruleresult.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		ruleresult.registerObject("eParameterTypeAccess", eParameterTypeAccess);
		ruleresult.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eTypeAccess").eClass())
				.equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TClass tClass, TInterface tSuperInterface) {

		Object[] result1_black = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_10_1_initialbindings_blackBBBB(this, match, tClass,
						tSuperInterface);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tClass] = " + tClass + ", " + "[tSuperInterface] = " + tSuperInterface + ".");
		}

		Object[] result2_bindingAndBlack = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tClass,
						tSuperInterface);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tClass] = " + tClass + ", " + "[tSuperInterface] = " + tSuperInterface + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_10_4_collectelementstobetranslated_blackBBB(match,
							tClass, tSuperInterface);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[tSuperInterface] = " + tSuperInterface + ".");
			}
			ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_10_4_collectelementstobetranslated_greenBBBFF(match,
							tClass, tSuperInterface);
			//nothing EMoflonEdge tClass__tSuperInterface____implements = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tSuperInterface__tClass____implementedBy = (EMoflonEdge) result4_green[4];

			Object[] result5_black = ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_10_5_collectcontextelements_blackBBB(match, tClass,
							tSuperInterface);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[tSuperInterface] = " + tSuperInterface + ".");
			}
			ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_10_5_collectcontextelements_greenBBB(match, tClass,
							tSuperInterface);

			// 
			ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_10_6_registerobjectstomatch_expressionBBBB(this,
							match, tClass, tSuperInterface);
			return ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_10_7_expressionF();
		} else {
			return ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TClass tClass = (TClass) result1_bindingAndBlack[0];
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result1_bindingAndBlack[1];
		TInterface tSuperInterface = (TInterface) result1_bindingAndBlack[2];
		ParameterizedType eType = (ParameterizedType) result1_bindingAndBlack[3];
		InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result1_bindingAndBlack[4];
		TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result1_bindingAndBlack[5];
		TypeAccess eParameterTypeAccess = (TypeAccess) result1_bindingAndBlack[6];
		TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_greenBFB(eClassDeclaration,
						eType);
		TypeAccess eTypeAccess = (TypeAccess) result1_green[1];

		Object[] result2_black = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_11_2_collecttranslatedelements_blackB(eTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[eTypeAccess] = " + eTypeAccess + ".");
		}
		Object[] result2_green = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_11_2_collecttranslatedelements_greenFB(eTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType, eSuperInterface,
						eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tClass] = " + tClass + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[tSuperInterface] = " + tSuperInterface + ", "
					+ "[eType] = " + eType + ", " + "[eSuperInterface] = " + eSuperInterface + ", "
					+ "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass + ", " + "[eParameterTypeAccess] = "
					+ eParameterTypeAccess + ", " + "[eSuperInterfaceToTSuperInterface] = "
					+ eSuperInterfaceToTSuperInterface + ".");
		}
		ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
						tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType);
		//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tClass__tSuperInterface____implements = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tSuperInterface__tClass____implementedBy = (EMoflonEdge) result3_green[10];

		// 
		// 
		ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_11_5_registerobjects_expressionBBBBBBBBBBB(this,
						ruleresult, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType, eSuperInterface,
						eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface);
		return ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tClass = (TClass) result2_binding[0];
		TInterface tSuperInterface = (TInterface) result2_binding[1];
		for (Object[] result2_black : ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_12_2_corematch_blackBFBFFFB(tClass, tSuperInterface,
						match)) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_black[1];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_black[3];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result2_black[4];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result2_black[5];
			// ForEach 
			for (Object[] result3_black : ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_12_3_findcontext_blackBBBFBBFB(tClass,
							eClassDeclaration, tSuperInterface, eSuperInterface, eClassDeclarationToTClass,
							eSuperInterfaceToTSuperInterface)) {
				ParameterizedType eType = (ParameterizedType) result3_black[3];
				TypeAccess eParameterTypeAccess = (TypeAccess) result3_black[6];
				Object[] result3_green = ClassImplementsPatrameterizedInterfaceImpl
						.pattern_ClassImplementsPatrameterizedInterface_12_3_findcontext_greenBBBBBBBBFFFFFFFFFF(tClass,
								eClassDeclaration, tSuperInterface, eType, eSuperInterface, eClassDeclarationToTClass,
								eParameterTypeAccess, eSuperInterfaceToTSuperInterface);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge eType__eParameterTypeAccess____type = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge eClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge eParameterTypeAccess__eSuperInterface____type = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge eSuperInterface__eParameterTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tClass__tSuperInterface____implements = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tSuperInterface__tClass____implementedBy = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = ClassImplementsPatrameterizedInterfaceImpl
						.pattern_ClassImplementsPatrameterizedInterface_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, tClass, eClassDeclaration, tSuperInterface, eType, eSuperInterface,
								eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tClass] = " + tClass + ", "
							+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[tSuperInterface] = "
							+ tSuperInterface + ", " + "[eType] = " + eType + ", " + "[eSuperInterface] = "
							+ eSuperInterface + ", " + "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass
							+ ", " + "[eParameterTypeAccess] = " + eParameterTypeAccess + ", "
							+ "[eSuperInterfaceToTSuperInterface] = " + eSuperInterfaceToTSuperInterface + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassImplementsPatrameterizedInterfaceImpl
						.pattern_ClassImplementsPatrameterizedInterface_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ClassImplementsPatrameterizedInterfaceImpl
							.pattern_ClassImplementsPatrameterizedInterface_12_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassImplementsPatrameterizedInterfaceImpl
							.pattern_ClassImplementsPatrameterizedInterface_12_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tClass, TInterface tSuperInterface) {
		match.registerObject("tClass", tClass);
		match.registerObject("tSuperInterface", tSuperInterface);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tClass, TInterface tSuperInterface) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TClass tClass,
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			TypeAccess eParameterTypeAccess, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("eClassDeclaration", eClassDeclaration);
		isApplicableMatch.registerObject("tSuperInterface", tSuperInterface);
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("eSuperInterface", eSuperInterface);
		isApplicableMatch.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		isApplicableMatch.registerObject("eParameterTypeAccess", eParameterTypeAccess);
		isApplicableMatch.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tClass, EObject eClassDeclaration,
			EObject eTypeAccess, EObject tSuperInterface, EObject eType, EObject eSuperInterface,
			EObject eClassDeclarationToTClass, EObject eParameterTypeAccess, EObject eSuperInterfaceToTSuperInterface) {
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("eClassDeclaration", eClassDeclaration);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("tSuperInterface", tSuperInterface);
		ruleresult.registerObject("eType", eType);
		ruleresult.registerObject("eSuperInterface", eSuperInterface);
		ruleresult.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		ruleresult.registerObject("eParameterTypeAccess", eParameterTypeAccess);
		ruleresult.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_1002(EMoflonEdge _edge_implements) {

		Object[] result1_bindingAndBlack = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_20_2_testcorematchandDECs_blackFFB(_edge_implements)) {
			TClass tClass = (TClass) result2_black[0];
			TInterface tSuperInterface = (TInterface) result2_black[1];
			Object[] result2_green = ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tClass, tSuperInterface)) {
				// 
				if (ClassImplementsPatrameterizedInterfaceImpl
						.pattern_ClassImplementsPatrameterizedInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ClassImplementsPatrameterizedInterfaceImpl
							.pattern_ClassImplementsPatrameterizedInterface_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassImplementsPatrameterizedInterfaceImpl
							.pattern_ClassImplementsPatrameterizedInterface_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1098(EMoflonEdge _edge_superInterfaces) {

		Object[] result1_bindingAndBlack = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_blackFFFFFB(
						_edge_superInterfaces)) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_black[0];
			TypeAccess eTypeAccess = (TypeAccess) result2_black[1];
			ParameterizedType eType = (ParameterizedType) result2_black[2];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_black[3];
			TypeAccess eParameterTypeAccess = (TypeAccess) result2_black[4];
			Object[] result2_green = ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, eClassDeclaration, eTypeAccess, eType, eSuperInterface,
							eParameterTypeAccess)) {
				// 
				if (ClassImplementsPatrameterizedInterfaceImpl
						.pattern_ClassImplementsPatrameterizedInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ClassImplementsPatrameterizedInterfaceImpl
							.pattern_ClassImplementsPatrameterizedInterface_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassImplementsPatrameterizedInterfaceImpl
							.pattern_ClassImplementsPatrameterizedInterface_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ClassImplementsPatrameterizedInterface");
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
		ruleResult.setRule("ClassImplementsPatrameterizedInterface");
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

		Object[] result1_black = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TClass tClass = (TClass) result2_bindingAndBlack[0];
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_bindingAndBlack[1];
		TypeAccess eTypeAccess = (TypeAccess) result2_bindingAndBlack[2];
		TInterface tSuperInterface = (TInterface) result2_bindingAndBlack[3];
		ParameterizedType eType = (ParameterizedType) result2_bindingAndBlack[4];
		InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_bindingAndBlack[5];
		TypeAccess eParameterTypeAccess = (TypeAccess) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, tClass,
						eClassDeclaration, eTypeAccess, tSuperInterface, eType, eSuperInterface, eParameterTypeAccess,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[tSuperInterface] = " + tSuperInterface + ", "
					+ "[eType] = " + eType + ", " + "[eSuperInterface] = " + eSuperInterface + ", "
					+ "[eParameterTypeAccess] = " + eParameterTypeAccess + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_24_5_matchcorrcontext_blackBBBBFFBB(tClass,
							eClassDeclaration, tSuperInterface, eSuperInterface, sourceMatch, targetMatch)) {
				TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result5_black[4];
				TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result5_black[5];
				Object[] result5_green = ClassImplementsPatrameterizedInterfaceImpl
						.pattern_ClassImplementsPatrameterizedInterface_24_5_matchcorrcontext_greenBBBBF(
								eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = ClassImplementsPatrameterizedInterfaceImpl
						.pattern_ClassImplementsPatrameterizedInterface_24_6_createcorrespondence_blackBBBBBBBB(tClass,
								eClassDeclaration, eTypeAccess, tSuperInterface, eType, eSuperInterface,
								eParameterTypeAccess, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass
							+ ", " + "[eClassDeclaration] = " + eClassDeclaration + ", " + "[eTypeAccess] = "
							+ eTypeAccess + ", " + "[tSuperInterface] = " + tSuperInterface + ", " + "[eType] = "
							+ eType + ", " + "[eSuperInterface] = " + eSuperInterface + ", "
							+ "[eParameterTypeAccess] = " + eParameterTypeAccess + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}

				Object[] result7_black = ClassImplementsPatrameterizedInterfaceImpl
						.pattern_ClassImplementsPatrameterizedInterface_24_7_addtoreturnedresult_blackBB(result,
								ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ClassImplementsPatrameterizedInterfaceImpl
						.pattern_ClassImplementsPatrameterizedInterface_24_7_addtoreturnedresult_greenBB(result,
								ccMatch);

			}

		} else {
		}
		return ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TClass tClass, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			TInterface tSuperInterface, ParameterizedType eType, InterfaceDeclaration eSuperInterface,
			TypeAccess eParameterTypeAccess, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeAccess eParameterTypeAccess) {// 
		Object[] result1_black = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_blackBBBBB(eClassDeclaration,
						eTypeAccess, eType, eSuperInterface, eParameterTypeAccess);
		if (result1_black != null) {
			return ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_27_2_expressionF();
		} else {
			return ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tClass, TInterface tSuperInterface) {// 
		Object[] result1_black = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_28_1_matchtggpattern_blackBB(tClass, tSuperInterface);
		if (result1_black != null) {
			return ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_28_2_expressionF();
		} else {
			return ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType eClassDeclarationToTClassParameter,
			TypeToTAbstractType eSuperInterfaceToTSuperInterfaceParameter) {

		Object[] result1_black = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_blackFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList eClassDeclarationToTClassList = (RuleEntryList) result2_black[0];
			TClass tClass = (TClass) result2_black[1];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result2_black[2];
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_black[3];
			//nothing RuleEntryList eSuperInterfaceToTSuperInterfaceList = (RuleEntryList) result2_black[4];
			TInterface tSuperInterface = (TInterface) result2_black[5];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result2_black[6];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_black[7];
			TypeAccess eParameterTypeAccess = (TypeAccess) result2_black[8];
			ParameterizedType eType = (ParameterizedType) result2_black[9];

			Object[] result3_bindingAndBlack = ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
							isApplicableMatch, tClass, eClassDeclaration, tSuperInterface, eType, eSuperInterface,
							eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tClass] = " + tClass + ", "
						+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[tSuperInterface] = " + tSuperInterface
						+ ", " + "[eType] = " + eType + ", " + "[eSuperInterface] = " + eSuperInterface + ", "
						+ "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass + ", "
						+ "[eParameterTypeAccess] = " + eParameterTypeAccess + ", "
						+ "[eSuperInterfaceToTSuperInterface] = " + eSuperInterfaceToTSuperInterface + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ClassImplementsPatrameterizedInterfaceImpl
					.pattern_ClassImplementsPatrameterizedInterface_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ClassImplementsPatrameterizedInterfaceImpl
						.pattern_ClassImplementsPatrameterizedInterface_29_5_checknacs_blackBBBBBBBB(tClass,
								eClassDeclaration, tSuperInterface, eType, eSuperInterface, eClassDeclarationToTClass,
								eParameterTypeAccess, eSuperInterfaceToTSuperInterface);
				if (result5_black != null) {

					Object[] result6_black = ClassImplementsPatrameterizedInterfaceImpl
							.pattern_ClassImplementsPatrameterizedInterface_29_6_perform_blackBBBBBBBBB(tClass,
									eClassDeclaration, tSuperInterface, eType, eSuperInterface,
									eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass
								+ ", " + "[eClassDeclaration] = " + eClassDeclaration + ", " + "[tSuperInterface] = "
								+ tSuperInterface + ", " + "[eType] = " + eType + ", " + "[eSuperInterface] = "
								+ eSuperInterface + ", " + "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass
								+ ", " + "[eParameterTypeAccess] = " + eParameterTypeAccess + ", "
								+ "[eSuperInterfaceToTSuperInterface] = " + eSuperInterfaceToTSuperInterface + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					ClassImplementsPatrameterizedInterfaceImpl
							.pattern_ClassImplementsPatrameterizedInterface_29_6_perform_greenBBFBBB(tClass,
									eClassDeclaration, tSuperInterface, eType, ruleResult);
					//nothing TypeAccess eTypeAccess = (TypeAccess) result6_green[2];

				} else {
				}

			} else {
			}

		}
		return ClassImplementsPatrameterizedInterfaceImpl
				.pattern_ClassImplementsPatrameterizedInterface_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TClass tClass,
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			TypeAccess eParameterTypeAccess, TypeToTAbstractType eSuperInterfaceToTSuperInterface,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("eClassDeclaration", eClassDeclaration);
		isApplicableMatch.registerObject("tSuperInterface", tSuperInterface);
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("eSuperInterface", eSuperInterface);
		isApplicableMatch.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		isApplicableMatch.registerObject("eParameterTypeAccess", eParameterTypeAccess);
		isApplicableMatch.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);
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
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___IS_APPROPRIATE_FWD__MATCH_CLASSDECLARATION_TYPEACCESS_PARAMETERIZEDTYPE_INTERFACEDECLARATION_TYPEACCESS:
				return isAppropriate_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
						(TypeAccess) arguments.get(2), (ParameterizedType) arguments.get(3),
						(InterfaceDeclaration) arguments.get(4), (TypeAccess) arguments.get(5));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSDECLARATION_TYPEACCESS_PARAMETERIZEDTYPE_INTERFACEDECLARATION_TYPEACCESS:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
						(TypeAccess) arguments.get(2), (ParameterizedType) arguments.get(3),
						(InterfaceDeclaration) arguments.get(4), (TypeAccess) arguments.get(5));
				return null;
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSDECLARATION_TYPEACCESS_PARAMETERIZEDTYPE_INTERFACEDECLARATION_TYPEACCESS:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
						(TypeAccess) arguments.get(2), (ParameterizedType) arguments.get(3),
						(InterfaceDeclaration) arguments.get(4), (TypeAccess) arguments.get(5));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TCLASS_CLASSDECLARATION_TYPEACCESS_TINTERFACE_PARAMETERIZEDTYPE_INTERFACEDECLARATION_TYPETOTABSTRACTTYPE_TYPEACCESS_TYPETOTABSTRACTTYPE:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
						(ClassDeclaration) arguments.get(2), (TypeAccess) arguments.get(3),
						(TInterface) arguments.get(4), (ParameterizedType) arguments.get(5),
						(InterfaceDeclaration) arguments.get(6), (TypeToTAbstractType) arguments.get(7),
						(TypeAccess) arguments.get(8), (TypeToTAbstractType) arguments.get(9));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8), (EObject) arguments.get(9));
				return null;
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___IS_APPROPRIATE_BWD__MATCH_TCLASS_TINTERFACE:
				return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
						(TInterface) arguments.get(2));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TINTERFACE:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
						(TInterface) arguments.get(2));
				return null;
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TINTERFACE:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
						(TInterface) arguments.get(2));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCLASS_CLASSDECLARATION_TINTERFACE_PARAMETERIZEDTYPE_INTERFACEDECLARATION_TYPETOTABSTRACTTYPE_TYPEACCESS_TYPETOTABSTRACTTYPE:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
						(ClassDeclaration) arguments.get(2), (TInterface) arguments.get(3),
						(ParameterizedType) arguments.get(4), (InterfaceDeclaration) arguments.get(5),
						(TypeToTAbstractType) arguments.get(6), (TypeAccess) arguments.get(7),
						(TypeToTAbstractType) arguments.get(8));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8), (EObject) arguments.get(9));
				return null;
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1002__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_1002((EMoflonEdge) arguments.get(0));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1098__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_1098((EMoflonEdge) arguments.get(0));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___IS_APPLICABLE_SOLVE_CSP_CC__TCLASS_CLASSDECLARATION_TYPEACCESS_TINTERFACE_PARAMETERIZEDTYPE_INTERFACEDECLARATION_TYPEACCESS_MATCH_MATCH:
				return isApplicable_solveCsp_CC((TClass) arguments.get(0), (ClassDeclaration) arguments.get(1),
						(TypeAccess) arguments.get(2), (TInterface) arguments.get(3),
						(ParameterizedType) arguments.get(4), (InterfaceDeclaration) arguments.get(5),
						(TypeAccess) arguments.get(6), (Match) arguments.get(7), (Match) arguments.get(8));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___CHECK_DEC_FWD__CLASSDECLARATION_TYPEACCESS_PARAMETERIZEDTYPE_INTERFACEDECLARATION_TYPEACCESS:
				return checkDEC_FWD((ClassDeclaration) arguments.get(0), (TypeAccess) arguments.get(1),
						(ParameterizedType) arguments.get(2), (InterfaceDeclaration) arguments.get(3),
						(TypeAccess) arguments.get(4));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___CHECK_DEC_BWD__TCLASS_TINTERFACE:
				return checkDEC_BWD((TClass) arguments.get(0), (TInterface) arguments.get(1));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_TYPETOTABSTRACTTYPE:
				return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
						(TypeToTAbstractType) arguments.get(2));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCLASS_CLASSDECLARATION_TINTERFACE_PARAMETERIZEDTYPE_INTERFACEDECLARATION_TYPETOTABSTRACTTYPE_TYPEACCESS_TYPETOTABSTRACTTYPE_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
						(ClassDeclaration) arguments.get(2), (TInterface) arguments.get(3),
						(ParameterizedType) arguments.get(4), (InterfaceDeclaration) arguments.get(5),
						(TypeToTAbstractType) arguments.get(6), (TypeAccess) arguments.get(7),
						(TypeToTAbstractType) arguments.get(8), (ModelgeneratorRuleResult) arguments.get(9));
			case RulesPackage.CLASS_IMPLEMENTS_PATRAMETERIZED_INTERFACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_0_1_initialbindings_blackBBBBBBB(
			ClassImplementsPatrameterizedInterface _this, Match match, ClassDeclaration eClassDeclaration,
			TypeAccess eTypeAccess, ParameterizedType eType, InterfaceDeclaration eSuperInterface,
			TypeAccess eParameterTypeAccess) {
		if (!eParameterTypeAccess.equals(eTypeAccess)) {
			return new Object[] { _this, match, eClassDeclaration, eTypeAccess, eType, eSuperInterface,
					eParameterTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_0_2_SolveCSP_bindingFBBBBBBB(
			ClassImplementsPatrameterizedInterface _this, Match match, ClassDeclaration eClassDeclaration,
			TypeAccess eTypeAccess, ParameterizedType eType, InterfaceDeclaration eSuperInterface,
			TypeAccess eParameterTypeAccess) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eClassDeclaration, eTypeAccess, eType,
				eSuperInterface, eParameterTypeAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eClassDeclaration, eTypeAccess, eType, eSuperInterface,
					eParameterTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			ClassImplementsPatrameterizedInterface _this, Match match, ClassDeclaration eClassDeclaration,
			TypeAccess eTypeAccess, ParameterizedType eType, InterfaceDeclaration eSuperInterface,
			TypeAccess eParameterTypeAccess) {
		Object[] result_pattern_ClassImplementsPatrameterizedInterface_0_2_SolveCSP_binding = pattern_ClassImplementsPatrameterizedInterface_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, eClassDeclaration, eTypeAccess, eType, eSuperInterface, eParameterTypeAccess);
		if (result_pattern_ClassImplementsPatrameterizedInterface_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsPatrameterizedInterface_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassImplementsPatrameterizedInterface_0_2_SolveCSP_black = pattern_ClassImplementsPatrameterizedInterface_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassImplementsPatrameterizedInterface_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eClassDeclaration, eTypeAccess, eType, eSuperInterface,
						eParameterTypeAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_0_3_CheckCSP_expressionFBB(
			ClassImplementsPatrameterizedInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_0_4_collectelementstobetranslated_blackBBBBBB(
			Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeAccess eParameterTypeAccess) {
		if (!eParameterTypeAccess.equals(eTypeAccess)) {
			return new Object[] { match, eClassDeclaration, eTypeAccess, eType, eSuperInterface, eParameterTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, ParameterizedType eType) {
		EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eTypeAccess);
		String eClassDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		eClassDeclaration__eTypeAccess____superInterfaces.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eClassDeclaration__eTypeAccess____superInterfaces);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		match.getToBeTranslatedEdges().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eType__eTypeAccess____usagesInTypeAccess);
		eClassDeclaration__eTypeAccess____superInterfaces
				.setName(eClassDeclaration__eTypeAccess____superInterfaces_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { match, eClassDeclaration, eTypeAccess, eType,
				eClassDeclaration__eTypeAccess____superInterfaces, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_0_5_collectcontextelements_blackBBBBBB(
			Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeAccess eParameterTypeAccess) {
		if (!eParameterTypeAccess.equals(eTypeAccess)) {
			return new Object[] { match, eClassDeclaration, eTypeAccess, eType, eSuperInterface, eParameterTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_0_5_collectcontextelements_greenBBBBBFFF(
			Match match, ClassDeclaration eClassDeclaration, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeAccess eParameterTypeAccess) {
		EMoflonEdge eType__eParameterTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eParameterTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(eClassDeclaration);
		match.getContextNodes().add(eType);
		match.getContextNodes().add(eSuperInterface);
		match.getContextNodes().add(eParameterTypeAccess);
		String eType__eParameterTypeAccess____type_name_prime = "type";
		String eParameterTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eParameterTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		eType__eParameterTypeAccess____type.setSrc(eType);
		eType__eParameterTypeAccess____type.setTrg(eParameterTypeAccess);
		match.getContextEdges().add(eType__eParameterTypeAccess____type);
		eParameterTypeAccess__eSuperInterface____type.setSrc(eParameterTypeAccess);
		eParameterTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		match.getContextEdges().add(eParameterTypeAccess__eSuperInterface____type);
		eSuperInterface__eParameterTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eParameterTypeAccess____usagesInTypeAccess.setTrg(eParameterTypeAccess);
		match.getContextEdges().add(eSuperInterface__eParameterTypeAccess____usagesInTypeAccess);
		eType__eParameterTypeAccess____type.setName(eType__eParameterTypeAccess____type_name_prime);
		eParameterTypeAccess__eSuperInterface____type.setName(eParameterTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eParameterTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eParameterTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { match, eClassDeclaration, eType, eSuperInterface, eParameterTypeAccess,
				eType__eParameterTypeAccess____type, eParameterTypeAccess__eSuperInterface____type,
				eSuperInterface__eParameterTypeAccess____usagesInTypeAccess };
	}

	public static final void pattern_ClassImplementsPatrameterizedInterface_0_6_registerobjectstomatch_expressionBBBBBBB(
			ClassImplementsPatrameterizedInterface _this, Match match, ClassDeclaration eClassDeclaration,
			TypeAccess eTypeAccess, ParameterizedType eType, InterfaceDeclaration eSuperInterface,
			TypeAccess eParameterTypeAccess) {
		_this.registerObjectsToMatch_FWD(match, eClassDeclaration, eTypeAccess, eType, eSuperInterface,
				eParameterTypeAccess);

	}

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("eClassDeclaration");
		EObject _localVariable_2 = isApplicableMatch.getObject("eTypeAccess");
		EObject _localVariable_3 = isApplicableMatch.getObject("tSuperInterface");
		EObject _localVariable_4 = isApplicableMatch.getObject("eType");
		EObject _localVariable_5 = isApplicableMatch.getObject("eSuperInterface");
		EObject _localVariable_6 = isApplicableMatch.getObject("eClassDeclarationToTClass");
		EObject _localVariable_7 = isApplicableMatch.getObject("eParameterTypeAccess");
		EObject _localVariable_8 = isApplicableMatch.getObject("eSuperInterfaceToTSuperInterface");
		EObject tmpTClass = _localVariable_0;
		EObject tmpEClassDeclaration = _localVariable_1;
		EObject tmpETypeAccess = _localVariable_2;
		EObject tmpTSuperInterface = _localVariable_3;
		EObject tmpEType = _localVariable_4;
		EObject tmpESuperInterface = _localVariable_5;
		EObject tmpEClassDeclarationToTClass = _localVariable_6;
		EObject tmpEParameterTypeAccess = _localVariable_7;
		EObject tmpESuperInterfaceToTSuperInterface = _localVariable_8;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpEClassDeclaration instanceof ClassDeclaration) {
				ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
				if (tmpETypeAccess instanceof TypeAccess) {
					TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
					if (tmpTSuperInterface instanceof TInterface) {
						TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
						if (tmpEType instanceof ParameterizedType) {
							ParameterizedType eType = (ParameterizedType) tmpEType;
							if (tmpESuperInterface instanceof InterfaceDeclaration) {
								InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
								if (tmpEClassDeclarationToTClass instanceof TypeToTAbstractType) {
									TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) tmpEClassDeclarationToTClass;
									if (tmpEParameterTypeAccess instanceof TypeAccess) {
										TypeAccess eParameterTypeAccess = (TypeAccess) tmpEParameterTypeAccess;
										if (tmpESuperInterfaceToTSuperInterface instanceof TypeToTAbstractType) {
											TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) tmpESuperInterfaceToTSuperInterface;
											return new Object[] { tClass, eClassDeclaration, eTypeAccess,
													tSuperInterface, eType, eSuperInterface, eClassDeclarationToTClass,
													eParameterTypeAccess, eSuperInterfaceToTSuperInterface,
													isApplicableMatch };
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

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_blackBBBBBBBBBFBB(
			TClass tClass, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			ParameterizedType eType, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, TypeAccess eParameterTypeAccess,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, ClassImplementsPatrameterizedInterface _this,
			IsApplicableMatch isApplicableMatch) {
		if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
			if (!eParameterTypeAccess.equals(eTypeAccess)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType,
								eSuperInterface, eClassDeclarationToTClass, eParameterTypeAccess,
								eSuperInterfaceToTSuperInterface, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			ClassImplementsPatrameterizedInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_binding = pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_binding != null) {
			TClass tClass = (TClass) result_pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_binding[0];
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result_pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_binding[1];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_binding[2];
			TInterface tSuperInterface = (TInterface) result_pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_binding[3];
			ParameterizedType eType = (ParameterizedType) result_pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_binding[4];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result_pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_binding[5];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result_pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_binding[6];
			TypeAccess eParameterTypeAccess = (TypeAccess) result_pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_binding[7];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result_pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_binding[8];

			Object[] result_pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_black = pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_blackBBBBBBBBBFBB(
					tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType, eSuperInterface,
					eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface, _this,
					isApplicableMatch);
			if (result_pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_black[9];

				return new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType, eSuperInterface,
						eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_1_1_performtransformation_greenBB(
			TClass tClass, TInterface tSuperInterface) {
		tClass.getImplements().add(tSuperInterface);
		return new Object[] { tClass, tSuperInterface };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_1_2_collecttranslatedelements_blackB(
			TypeAccess eTypeAccess) {
		return new Object[] { eTypeAccess };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_1_2_collecttranslatedelements_greenFB(
			TypeAccess eTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(eTypeAccess);
		return new Object[] { ruleresult, eTypeAccess };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tClass, EObject eClassDeclaration, EObject eTypeAccess,
			EObject tSuperInterface, EObject eType, EObject eSuperInterface, EObject eClassDeclarationToTClass,
			EObject eParameterTypeAccess, EObject eSuperInterfaceToTSuperInterface) {
		if (!tClass.equals(tSuperInterface)) {
			if (!eClassDeclaration.equals(tClass)) {
				if (!eClassDeclaration.equals(eTypeAccess)) {
					if (!eClassDeclaration.equals(tSuperInterface)) {
						if (!eClassDeclaration.equals(eType)) {
							if (!eClassDeclaration.equals(eSuperInterface)) {
								if (!eClassDeclaration.equals(eClassDeclarationToTClass)) {
									if (!eClassDeclaration.equals(eParameterTypeAccess)) {
										if (!eClassDeclaration.equals(eSuperInterfaceToTSuperInterface)) {
											if (!eTypeAccess.equals(tClass)) {
												if (!eTypeAccess.equals(tSuperInterface)) {
													if (!eType.equals(tClass)) {
														if (!eType.equals(eTypeAccess)) {
															if (!eType.equals(tSuperInterface)) {
																if (!eSuperInterface.equals(tClass)) {
																	if (!eSuperInterface.equals(eTypeAccess)) {
																		if (!eSuperInterface.equals(tSuperInterface)) {
																			if (!eSuperInterface.equals(eType)) {
																				if (!eSuperInterface.equals(
																						eSuperInterfaceToTSuperInterface)) {
																					if (!eClassDeclarationToTClass
																							.equals(tClass)) {
																						if (!eClassDeclarationToTClass
																								.equals(eTypeAccess)) {
																							if (!eClassDeclarationToTClass
																									.equals(tSuperInterface)) {
																								if (!eClassDeclarationToTClass
																										.equals(eType)) {
																									if (!eClassDeclarationToTClass
																											.equals(eSuperInterface)) {
																										if (!eClassDeclarationToTClass
																												.equals(eParameterTypeAccess)) {
																											if (!eClassDeclarationToTClass
																													.equals(eSuperInterfaceToTSuperInterface)) {
																												if (!eParameterTypeAccess
																														.equals(tClass)) {
																													if (!eParameterTypeAccess
																															.equals(eTypeAccess)) {
																														if (!eParameterTypeAccess
																																.equals(tSuperInterface)) {
																															if (!eParameterTypeAccess
																																	.equals(eType)) {
																																if (!eParameterTypeAccess
																																		.equals(eSuperInterface)) {
																																	if (!eParameterTypeAccess
																																			.equals(eSuperInterfaceToTSuperInterface)) {
																																		if (!eSuperInterfaceToTSuperInterface
																																				.equals(tClass)) {
																																			if (!eSuperInterfaceToTSuperInterface
																																					.equals(eTypeAccess)) {
																																				if (!eSuperInterfaceToTSuperInterface
																																						.equals(tSuperInterface)) {
																																					if (!eSuperInterfaceToTSuperInterface
																																							.equals(eType)) {
																																						return new Object[] {
																																								ruleresult,
																																								tClass,
																																								eClassDeclaration,
																																								eTypeAccess,
																																								tSuperInterface,
																																								eType,
																																								eSuperInterface,
																																								eClassDeclarationToTClass,
																																								eParameterTypeAccess,
																																								eSuperInterfaceToTSuperInterface };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tClass, EObject eClassDeclaration, EObject eTypeAccess,
			EObject tSuperInterface, EObject eType) {
		EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tSuperInterface____implements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tClass____implementedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassImplementsPatrameterizedInterface";
		String eClassDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String tClass__tSuperInterface____implements_name_prime = "implements";
		String tSuperInterface__tClass____implementedBy_name_prime = "implementedBy";
		eClassDeclaration__eTypeAccess____superInterfaces.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eClassDeclaration__eTypeAccess____superInterfaces);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		ruleresult.getTranslatedEdges().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eType__eTypeAccess____usagesInTypeAccess);
		tClass__tSuperInterface____implements.setSrc(tClass);
		tClass__tSuperInterface____implements.setTrg(tSuperInterface);
		ruleresult.getCreatedEdges().add(tClass__tSuperInterface____implements);
		tSuperInterface__tClass____implementedBy.setSrc(tSuperInterface);
		tSuperInterface__tClass____implementedBy.setTrg(tClass);
		ruleresult.getCreatedEdges().add(tSuperInterface__tClass____implementedBy);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eClassDeclaration__eTypeAccess____superInterfaces
				.setName(eClassDeclaration__eTypeAccess____superInterfaces_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		tClass__tSuperInterface____implements.setName(tClass__tSuperInterface____implements_name_prime);
		tSuperInterface__tClass____implementedBy.setName(tSuperInterface__tClass____implementedBy_name_prime);
		return new Object[] { ruleresult, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType,
				eClassDeclaration__eTypeAccess____superInterfaces, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess, tClass__tSuperInterface____implements,
				tSuperInterface__tClass____implementedBy };
	}

	public static final void pattern_ClassImplementsPatrameterizedInterface_1_5_registerobjects_expressionBBBBBBBBBBB(
			ClassImplementsPatrameterizedInterface _this, PerformRuleResult ruleresult, EObject tClass,
			EObject eClassDeclaration, EObject eTypeAccess, EObject tSuperInterface, EObject eType,
			EObject eSuperInterface, EObject eClassDeclarationToTClass, EObject eParameterTypeAccess,
			EObject eSuperInterfaceToTSuperInterface) {
		_this.registerObjects_FWD(ruleresult, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType,
				eSuperInterface, eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface);

	}

	public static final PerformRuleResult pattern_ClassImplementsPatrameterizedInterface_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_2_1_preparereturnvalue_bindingFB(
			ClassImplementsPatrameterizedInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_2_1_preparereturnvalue_blackFBB(
			EClass eClass, ClassImplementsPatrameterizedInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_2_1_preparereturnvalue_bindingAndBlackFFB(
			ClassImplementsPatrameterizedInterface _this) {
		Object[] result_pattern_ClassImplementsPatrameterizedInterface_2_1_preparereturnvalue_binding = pattern_ClassImplementsPatrameterizedInterface_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassImplementsPatrameterizedInterface_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassImplementsPatrameterizedInterface_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassImplementsPatrameterizedInterface_2_1_preparereturnvalue_black = pattern_ClassImplementsPatrameterizedInterface_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassImplementsPatrameterizedInterface_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassImplementsPatrameterizedInterface_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassImplementsPatrameterizedInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_2_2_corematch_bindingFFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("eClassDeclaration");
		EObject _localVariable_1 = match.getObject("eTypeAccess");
		EObject _localVariable_2 = match.getObject("eType");
		EObject _localVariable_3 = match.getObject("eSuperInterface");
		EObject _localVariable_4 = match.getObject("eParameterTypeAccess");
		EObject tmpEClassDeclaration = _localVariable_0;
		EObject tmpETypeAccess = _localVariable_1;
		EObject tmpEType = _localVariable_2;
		EObject tmpESuperInterface = _localVariable_3;
		EObject tmpEParameterTypeAccess = _localVariable_4;
		if (tmpEClassDeclaration instanceof ClassDeclaration) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
			if (tmpETypeAccess instanceof TypeAccess) {
				TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
				if (tmpEType instanceof ParameterizedType) {
					ParameterizedType eType = (ParameterizedType) tmpEType;
					if (tmpESuperInterface instanceof InterfaceDeclaration) {
						InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
						if (tmpEParameterTypeAccess instanceof TypeAccess) {
							TypeAccess eParameterTypeAccess = (TypeAccess) tmpEParameterTypeAccess;
							return new Object[] { eClassDeclaration, eTypeAccess, eType, eSuperInterface,
									eParameterTypeAccess, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsPatrameterizedInterface_2_2_corematch_blackFBBFBBFBFB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeAccess eParameterTypeAccess, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eParameterTypeAccess.equals(eTypeAccess)) {
			for (TypeToTAbstractType eSuperInterfaceToTSuperInterface : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eSuperInterface, TypeToTAbstractType.class, "source")) {
				TAbstractType tmpTSuperInterface = eSuperInterfaceToTSuperInterface.getTarget();
				if (tmpTSuperInterface instanceof TInterface) {
					TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
					for (TypeToTAbstractType eClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(eClassDeclaration, TypeToTAbstractType.class, "source")) {
						if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
							TAbstractType tmpTClass = eClassDeclarationToTClass.getTarget();
							if (tmpTClass instanceof TClass) {
								TClass tClass = (TClass) tmpTClass;
								_result.add(new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface,
										eType, eSuperInterface, eClassDeclarationToTClass, eParameterTypeAccess,
										eSuperInterfaceToTSuperInterface, match });
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsPatrameterizedInterface_2_3_findcontext_blackBBBBBBBBB(
			TClass tClass, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			ParameterizedType eType, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, TypeAccess eParameterTypeAccess,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
			if (!eParameterTypeAccess.equals(eTypeAccess)) {
				if (eParameterTypeAccess.equals(eType.getType())) {
					if (eClassDeclaration.getSuperInterfaces().contains(eTypeAccess)) {
						if (tSuperInterface.equals(eSuperInterfaceToTSuperInterface.getTarget())) {
							if (eSuperInterface.equals(eSuperInterfaceToTSuperInterface.getSource())) {
								if (eClassDeclaration.equals(eClassDeclarationToTClass.getSource())) {
									if (eType.equals(eTypeAccess.getType())) {
										if (tClass.equals(eClassDeclarationToTClass.getTarget())) {
											if (eSuperInterface.equals(eParameterTypeAccess.getType())) {
												_result.add(new Object[] { tClass, eClassDeclaration, eTypeAccess,
														tSuperInterface, eType, eSuperInterface,
														eClassDeclarationToTClass, eParameterTypeAccess,
														eSuperInterfaceToTSuperInterface });
											}
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

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFF(
			TClass tClass, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			ParameterizedType eType, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, TypeAccess eParameterTypeAccess,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eType__eParameterTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eParameterTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String eType__eParameterTypeAccess____type_name_prime = "type";
		String eClassDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		String eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime = "target";
		String eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime = "source";
		String eClassDeclarationToTClass__eClassDeclaration____source_name_prime = "source";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eClassDeclarationToTClass__tClass____target_name_prime = "target";
		String eParameterTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eParameterTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eType);
		isApplicableMatch.getAllContextElements().add(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass);
		isApplicableMatch.getAllContextElements().add(eParameterTypeAccess);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface);
		eType__eParameterTypeAccess____type.setSrc(eType);
		eType__eParameterTypeAccess____type.setTrg(eParameterTypeAccess);
		isApplicableMatch.getAllContextElements().add(eType__eParameterTypeAccess____type);
		eClassDeclaration__eTypeAccess____superInterfaces.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eClassDeclaration__eTypeAccess____superInterfaces);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setTrg(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__tSuperInterface____target);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setTrg(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__eSuperInterface____source);
		eClassDeclarationToTClass__eClassDeclaration____source.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__eClassDeclaration____source.setTrg(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__eClassDeclaration____source);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		isApplicableMatch.getAllContextElements().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eType__eTypeAccess____usagesInTypeAccess);
		eClassDeclarationToTClass__tClass____target.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__tClass____target);
		eParameterTypeAccess__eSuperInterface____type.setSrc(eParameterTypeAccess);
		eParameterTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eParameterTypeAccess__eSuperInterface____type);
		eSuperInterface__eParameterTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eParameterTypeAccess____usagesInTypeAccess.setTrg(eParameterTypeAccess);
		isApplicableMatch.getAllContextElements().add(eSuperInterface__eParameterTypeAccess____usagesInTypeAccess);
		eType__eParameterTypeAccess____type.setName(eType__eParameterTypeAccess____type_name_prime);
		eClassDeclaration__eTypeAccess____superInterfaces
				.setName(eClassDeclaration__eTypeAccess____superInterfaces_name_prime);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target
				.setName(eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source
				.setName(eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime);
		eClassDeclarationToTClass__eClassDeclaration____source
				.setName(eClassDeclarationToTClass__eClassDeclaration____source_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		eClassDeclarationToTClass__tClass____target.setName(eClassDeclarationToTClass__tClass____target_name_prime);
		eParameterTypeAccess__eSuperInterface____type.setName(eParameterTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eParameterTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eParameterTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType, eSuperInterface,
				eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface, isApplicableMatch,
				eType__eParameterTypeAccess____type, eClassDeclaration__eTypeAccess____superInterfaces,
				eSuperInterfaceToTSuperInterface__tSuperInterface____target,
				eSuperInterfaceToTSuperInterface__eSuperInterface____source,
				eClassDeclarationToTClass__eClassDeclaration____source, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess, eClassDeclarationToTClass__tClass____target,
				eParameterTypeAccess__eSuperInterface____type,
				eSuperInterface__eParameterTypeAccess____usagesInTypeAccess };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_2_4_solveCSP_bindingFBBBBBBBBBBB(
			ClassImplementsPatrameterizedInterface _this, IsApplicableMatch isApplicableMatch, TClass tClass,
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			ParameterizedType eType, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, TypeAccess eParameterTypeAccess,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tClass, eClassDeclaration,
				eTypeAccess, tSuperInterface, eType, eSuperInterface, eClassDeclarationToTClass, eParameterTypeAccess,
				eSuperInterfaceToTSuperInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass, eClassDeclaration, eTypeAccess,
					tSuperInterface, eType, eSuperInterface, eClassDeclarationToTClass, eParameterTypeAccess,
					eSuperInterfaceToTSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			ClassImplementsPatrameterizedInterface _this, IsApplicableMatch isApplicableMatch, TClass tClass,
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			ParameterizedType eType, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, TypeAccess eParameterTypeAccess,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		Object[] result_pattern_ClassImplementsPatrameterizedInterface_2_4_solveCSP_binding = pattern_ClassImplementsPatrameterizedInterface_2_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType,
				eSuperInterface, eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface);
		if (result_pattern_ClassImplementsPatrameterizedInterface_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsPatrameterizedInterface_2_4_solveCSP_binding[0];

			Object[] result_pattern_ClassImplementsPatrameterizedInterface_2_4_solveCSP_black = pattern_ClassImplementsPatrameterizedInterface_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassImplementsPatrameterizedInterface_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass, eClassDeclaration, eTypeAccess,
						tSuperInterface, eType, eSuperInterface, eClassDeclarationToTClass, eParameterTypeAccess,
						eSuperInterfaceToTSuperInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_2_5_checkCSP_expressionFBB(
			ClassImplementsPatrameterizedInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassImplementsPatrameterizedInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassImplementsPatrameterizedInterface_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_10_1_initialbindings_blackBBBB(
			ClassImplementsPatrameterizedInterface _this, Match match, TClass tClass, TInterface tSuperInterface) {
		return new Object[] { _this, match, tClass, tSuperInterface };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_10_2_SolveCSP_bindingFBBBB(
			ClassImplementsPatrameterizedInterface _this, Match match, TClass tClass, TInterface tSuperInterface) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tClass, tSuperInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tClass, tSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_10_2_SolveCSP_bindingAndBlackFBBBB(
			ClassImplementsPatrameterizedInterface _this, Match match, TClass tClass, TInterface tSuperInterface) {
		Object[] result_pattern_ClassImplementsPatrameterizedInterface_10_2_SolveCSP_binding = pattern_ClassImplementsPatrameterizedInterface_10_2_SolveCSP_bindingFBBBB(
				_this, match, tClass, tSuperInterface);
		if (result_pattern_ClassImplementsPatrameterizedInterface_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsPatrameterizedInterface_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassImplementsPatrameterizedInterface_10_2_SolveCSP_black = pattern_ClassImplementsPatrameterizedInterface_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassImplementsPatrameterizedInterface_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tClass, tSuperInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_10_3_CheckCSP_expressionFBB(
			ClassImplementsPatrameterizedInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_10_4_collectelementstobetranslated_blackBBB(
			Match match, TClass tClass, TInterface tSuperInterface) {
		return new Object[] { match, tClass, tSuperInterface };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, TClass tClass, TInterface tSuperInterface) {
		EMoflonEdge tClass__tSuperInterface____implements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tClass____implementedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tClass__tSuperInterface____implements_name_prime = "implements";
		String tSuperInterface__tClass____implementedBy_name_prime = "implementedBy";
		tClass__tSuperInterface____implements.setSrc(tClass);
		tClass__tSuperInterface____implements.setTrg(tSuperInterface);
		match.getToBeTranslatedEdges().add(tClass__tSuperInterface____implements);
		tSuperInterface__tClass____implementedBy.setSrc(tSuperInterface);
		tSuperInterface__tClass____implementedBy.setTrg(tClass);
		match.getToBeTranslatedEdges().add(tSuperInterface__tClass____implementedBy);
		tClass__tSuperInterface____implements.setName(tClass__tSuperInterface____implements_name_prime);
		tSuperInterface__tClass____implementedBy.setName(tSuperInterface__tClass____implementedBy_name_prime);
		return new Object[] { match, tClass, tSuperInterface, tClass__tSuperInterface____implements,
				tSuperInterface__tClass____implementedBy };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_10_5_collectcontextelements_blackBBB(
			Match match, TClass tClass, TInterface tSuperInterface) {
		return new Object[] { match, tClass, tSuperInterface };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_10_5_collectcontextelements_greenBBB(
			Match match, TClass tClass, TInterface tSuperInterface) {
		match.getContextNodes().add(tClass);
		match.getContextNodes().add(tSuperInterface);
		return new Object[] { match, tClass, tSuperInterface };
	}

	public static final void pattern_ClassImplementsPatrameterizedInterface_10_6_registerobjectstomatch_expressionBBBB(
			ClassImplementsPatrameterizedInterface _this, Match match, TClass tClass, TInterface tSuperInterface) {
		_this.registerObjectsToMatch_BWD(match, tClass, tSuperInterface);

	}

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("eClassDeclaration");
		EObject _localVariable_2 = isApplicableMatch.getObject("tSuperInterface");
		EObject _localVariable_3 = isApplicableMatch.getObject("eType");
		EObject _localVariable_4 = isApplicableMatch.getObject("eSuperInterface");
		EObject _localVariable_5 = isApplicableMatch.getObject("eClassDeclarationToTClass");
		EObject _localVariable_6 = isApplicableMatch.getObject("eParameterTypeAccess");
		EObject _localVariable_7 = isApplicableMatch.getObject("eSuperInterfaceToTSuperInterface");
		EObject tmpTClass = _localVariable_0;
		EObject tmpEClassDeclaration = _localVariable_1;
		EObject tmpTSuperInterface = _localVariable_2;
		EObject tmpEType = _localVariable_3;
		EObject tmpESuperInterface = _localVariable_4;
		EObject tmpEClassDeclarationToTClass = _localVariable_5;
		EObject tmpEParameterTypeAccess = _localVariable_6;
		EObject tmpESuperInterfaceToTSuperInterface = _localVariable_7;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpEClassDeclaration instanceof ClassDeclaration) {
				ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
				if (tmpTSuperInterface instanceof TInterface) {
					TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
					if (tmpEType instanceof ParameterizedType) {
						ParameterizedType eType = (ParameterizedType) tmpEType;
						if (tmpESuperInterface instanceof InterfaceDeclaration) {
							InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
							if (tmpEClassDeclarationToTClass instanceof TypeToTAbstractType) {
								TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) tmpEClassDeclarationToTClass;
								if (tmpEParameterTypeAccess instanceof TypeAccess) {
									TypeAccess eParameterTypeAccess = (TypeAccess) tmpEParameterTypeAccess;
									if (tmpESuperInterfaceToTSuperInterface instanceof TypeToTAbstractType) {
										TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) tmpESuperInterfaceToTSuperInterface;
										return new Object[] { tClass, eClassDeclaration, tSuperInterface, eType,
												eSuperInterface, eClassDeclarationToTClass, eParameterTypeAccess,
												eSuperInterfaceToTSuperInterface, isApplicableMatch };
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

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_blackBBBBBBBBFBB(
			TClass tClass, ClassDeclaration eClassDeclaration, TInterface tSuperInterface, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			TypeAccess eParameterTypeAccess, TypeToTAbstractType eSuperInterfaceToTSuperInterface,
			ClassImplementsPatrameterizedInterface _this, IsApplicableMatch isApplicableMatch) {
		if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { tClass, eClassDeclaration, tSuperInterface, eType, eSuperInterface,
							eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface, csp,
							_this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			ClassImplementsPatrameterizedInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_binding = pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_binding != null) {
			TClass tClass = (TClass) result_pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_binding[0];
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result_pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_binding[1];
			TInterface tSuperInterface = (TInterface) result_pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_binding[2];
			ParameterizedType eType = (ParameterizedType) result_pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_binding[3];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result_pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_binding[4];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result_pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_binding[5];
			TypeAccess eParameterTypeAccess = (TypeAccess) result_pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_binding[6];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result_pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_binding[7];

			Object[] result_pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_black = pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_blackBBBBBBBBFBB(
					tClass, eClassDeclaration, tSuperInterface, eType, eSuperInterface, eClassDeclarationToTClass,
					eParameterTypeAccess, eSuperInterfaceToTSuperInterface, _this, isApplicableMatch);
			if (result_pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_black[8];

				return new Object[] { tClass, eClassDeclaration, tSuperInterface, eType, eSuperInterface,
						eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_11_1_performtransformation_greenBFB(
			ClassDeclaration eClassDeclaration, ParameterizedType eType) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		eClassDeclaration.getSuperInterfaces().add(eTypeAccess);
		eTypeAccess.setType(eType);
		return new Object[] { eClassDeclaration, eTypeAccess, eType };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_11_2_collecttranslatedelements_blackB(
			TypeAccess eTypeAccess) {
		return new Object[] { eTypeAccess };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_11_2_collecttranslatedelements_greenFB(
			TypeAccess eTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(eTypeAccess);
		return new Object[] { ruleresult, eTypeAccess };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tClass, EObject eClassDeclaration, EObject eTypeAccess,
			EObject tSuperInterface, EObject eType, EObject eSuperInterface, EObject eClassDeclarationToTClass,
			EObject eParameterTypeAccess, EObject eSuperInterfaceToTSuperInterface) {
		if (!tClass.equals(tSuperInterface)) {
			if (!eClassDeclaration.equals(tClass)) {
				if (!eClassDeclaration.equals(eTypeAccess)) {
					if (!eClassDeclaration.equals(tSuperInterface)) {
						if (!eClassDeclaration.equals(eType)) {
							if (!eClassDeclaration.equals(eSuperInterface)) {
								if (!eClassDeclaration.equals(eClassDeclarationToTClass)) {
									if (!eClassDeclaration.equals(eParameterTypeAccess)) {
										if (!eClassDeclaration.equals(eSuperInterfaceToTSuperInterface)) {
											if (!eTypeAccess.equals(tClass)) {
												if (!eTypeAccess.equals(tSuperInterface)) {
													if (!eType.equals(tClass)) {
														if (!eType.equals(eTypeAccess)) {
															if (!eType.equals(tSuperInterface)) {
																if (!eSuperInterface.equals(tClass)) {
																	if (!eSuperInterface.equals(eTypeAccess)) {
																		if (!eSuperInterface.equals(tSuperInterface)) {
																			if (!eSuperInterface.equals(eType)) {
																				if (!eSuperInterface.equals(
																						eSuperInterfaceToTSuperInterface)) {
																					if (!eClassDeclarationToTClass
																							.equals(tClass)) {
																						if (!eClassDeclarationToTClass
																								.equals(eTypeAccess)) {
																							if (!eClassDeclarationToTClass
																									.equals(tSuperInterface)) {
																								if (!eClassDeclarationToTClass
																										.equals(eType)) {
																									if (!eClassDeclarationToTClass
																											.equals(eSuperInterface)) {
																										if (!eClassDeclarationToTClass
																												.equals(eParameterTypeAccess)) {
																											if (!eClassDeclarationToTClass
																													.equals(eSuperInterfaceToTSuperInterface)) {
																												if (!eParameterTypeAccess
																														.equals(tClass)) {
																													if (!eParameterTypeAccess
																															.equals(eTypeAccess)) {
																														if (!eParameterTypeAccess
																																.equals(tSuperInterface)) {
																															if (!eParameterTypeAccess
																																	.equals(eType)) {
																																if (!eParameterTypeAccess
																																		.equals(eSuperInterface)) {
																																	if (!eParameterTypeAccess
																																			.equals(eSuperInterfaceToTSuperInterface)) {
																																		if (!eSuperInterfaceToTSuperInterface
																																				.equals(tClass)) {
																																			if (!eSuperInterfaceToTSuperInterface
																																					.equals(eTypeAccess)) {
																																				if (!eSuperInterfaceToTSuperInterface
																																						.equals(tSuperInterface)) {
																																					if (!eSuperInterfaceToTSuperInterface
																																							.equals(eType)) {
																																						return new Object[] {
																																								ruleresult,
																																								tClass,
																																								eClassDeclaration,
																																								eTypeAccess,
																																								tSuperInterface,
																																								eType,
																																								eSuperInterface,
																																								eClassDeclarationToTClass,
																																								eParameterTypeAccess,
																																								eSuperInterfaceToTSuperInterface };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tClass, EObject eClassDeclaration, EObject eTypeAccess,
			EObject tSuperInterface, EObject eType) {
		EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tSuperInterface____implements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tClass____implementedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassImplementsPatrameterizedInterface";
		String eClassDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String tClass__tSuperInterface____implements_name_prime = "implements";
		String tSuperInterface__tClass____implementedBy_name_prime = "implementedBy";
		eClassDeclaration__eTypeAccess____superInterfaces.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		ruleresult.getCreatedEdges().add(eClassDeclaration__eTypeAccess____superInterfaces);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		ruleresult.getCreatedEdges().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getCreatedEdges().add(eType__eTypeAccess____usagesInTypeAccess);
		tClass__tSuperInterface____implements.setSrc(tClass);
		tClass__tSuperInterface____implements.setTrg(tSuperInterface);
		ruleresult.getTranslatedEdges().add(tClass__tSuperInterface____implements);
		tSuperInterface__tClass____implementedBy.setSrc(tSuperInterface);
		tSuperInterface__tClass____implementedBy.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(tSuperInterface__tClass____implementedBy);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eClassDeclaration__eTypeAccess____superInterfaces
				.setName(eClassDeclaration__eTypeAccess____superInterfaces_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		tClass__tSuperInterface____implements.setName(tClass__tSuperInterface____implements_name_prime);
		tSuperInterface__tClass____implementedBy.setName(tSuperInterface__tClass____implementedBy_name_prime);
		return new Object[] { ruleresult, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType,
				eClassDeclaration__eTypeAccess____superInterfaces, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess, tClass__tSuperInterface____implements,
				tSuperInterface__tClass____implementedBy };
	}

	public static final void pattern_ClassImplementsPatrameterizedInterface_11_5_registerobjects_expressionBBBBBBBBBBB(
			ClassImplementsPatrameterizedInterface _this, PerformRuleResult ruleresult, EObject tClass,
			EObject eClassDeclaration, EObject eTypeAccess, EObject tSuperInterface, EObject eType,
			EObject eSuperInterface, EObject eClassDeclarationToTClass, EObject eParameterTypeAccess,
			EObject eSuperInterfaceToTSuperInterface) {
		_this.registerObjects_BWD(ruleresult, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType,
				eSuperInterface, eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface);

	}

	public static final PerformRuleResult pattern_ClassImplementsPatrameterizedInterface_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_12_1_preparereturnvalue_bindingFB(
			ClassImplementsPatrameterizedInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_12_1_preparereturnvalue_blackFBB(
			EClass eClass, ClassImplementsPatrameterizedInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_12_1_preparereturnvalue_bindingAndBlackFFB(
			ClassImplementsPatrameterizedInterface _this) {
		Object[] result_pattern_ClassImplementsPatrameterizedInterface_12_1_preparereturnvalue_binding = pattern_ClassImplementsPatrameterizedInterface_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassImplementsPatrameterizedInterface_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassImplementsPatrameterizedInterface_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassImplementsPatrameterizedInterface_12_1_preparereturnvalue_black = pattern_ClassImplementsPatrameterizedInterface_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassImplementsPatrameterizedInterface_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassImplementsPatrameterizedInterface_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassImplementsPatrameterizedInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tClass");
		EObject _localVariable_1 = match.getObject("tSuperInterface");
		EObject tmpTClass = _localVariable_0;
		EObject tmpTSuperInterface = _localVariable_1;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpTSuperInterface instanceof TInterface) {
				TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
				return new Object[] { tClass, tSuperInterface, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsPatrameterizedInterface_12_2_corematch_blackBFBFFFB(
			TClass tClass, TInterface tSuperInterface, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType eSuperInterfaceToTSuperInterface : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tSuperInterface, TypeToTAbstractType.class, "target")) {
			Type tmpESuperInterface = eSuperInterfaceToTSuperInterface.getSource();
			if (tmpESuperInterface instanceof InterfaceDeclaration) {
				InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
				for (TypeToTAbstractType eClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tClass, TypeToTAbstractType.class, "target")) {
					if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
						Type tmpEClassDeclaration = eClassDeclarationToTClass.getSource();
						if (tmpEClassDeclaration instanceof ClassDeclaration) {
							ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
							_result.add(new Object[] { tClass, eClassDeclaration, tSuperInterface, eSuperInterface,
									eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsPatrameterizedInterface_12_3_findcontext_blackBBBFBBFB(
			TClass tClass, ClassDeclaration eClassDeclaration, TInterface tSuperInterface,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
			if (tSuperInterface.equals(eSuperInterfaceToTSuperInterface.getTarget())) {
				if (eSuperInterface.equals(eSuperInterfaceToTSuperInterface.getSource())) {
					if (eClassDeclaration.equals(eClassDeclarationToTClass.getSource())) {
						if (tClass.equals(eClassDeclarationToTClass.getTarget())) {
							if (tClass.getImplements().contains(tSuperInterface)) {
								for (TypeAccess eParameterTypeAccess : eSuperInterface.getUsagesInTypeAccess()) {
									for (ParameterizedType eType : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(eParameterTypeAccess, ParameterizedType.class,
													"type")) {
										_result.add(new Object[] { tClass, eClassDeclaration, tSuperInterface, eType,
												eSuperInterface, eClassDeclarationToTClass, eParameterTypeAccess,
												eSuperInterfaceToTSuperInterface });
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

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_12_3_findcontext_greenBBBBBBBBFFFFFFFFFF(
			TClass tClass, ClassDeclaration eClassDeclaration, TInterface tSuperInterface, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			TypeAccess eParameterTypeAccess, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eType__eParameterTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eParameterTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tSuperInterface____implements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tClass____implementedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eType__eParameterTypeAccess____type_name_prime = "type";
		String eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime = "target";
		String eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime = "source";
		String eClassDeclarationToTClass__eClassDeclaration____source_name_prime = "source";
		String eClassDeclarationToTClass__tClass____target_name_prime = "target";
		String eParameterTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eParameterTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String tClass__tSuperInterface____implements_name_prime = "implements";
		String tSuperInterface__tClass____implementedBy_name_prime = "implementedBy";
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eType);
		isApplicableMatch.getAllContextElements().add(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass);
		isApplicableMatch.getAllContextElements().add(eParameterTypeAccess);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface);
		eType__eParameterTypeAccess____type.setSrc(eType);
		eType__eParameterTypeAccess____type.setTrg(eParameterTypeAccess);
		isApplicableMatch.getAllContextElements().add(eType__eParameterTypeAccess____type);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setTrg(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__tSuperInterface____target);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setTrg(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__eSuperInterface____source);
		eClassDeclarationToTClass__eClassDeclaration____source.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__eClassDeclaration____source.setTrg(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__eClassDeclaration____source);
		eClassDeclarationToTClass__tClass____target.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__tClass____target);
		eParameterTypeAccess__eSuperInterface____type.setSrc(eParameterTypeAccess);
		eParameterTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eParameterTypeAccess__eSuperInterface____type);
		eSuperInterface__eParameterTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eParameterTypeAccess____usagesInTypeAccess.setTrg(eParameterTypeAccess);
		isApplicableMatch.getAllContextElements().add(eSuperInterface__eParameterTypeAccess____usagesInTypeAccess);
		tClass__tSuperInterface____implements.setSrc(tClass);
		tClass__tSuperInterface____implements.setTrg(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(tClass__tSuperInterface____implements);
		tSuperInterface__tClass____implementedBy.setSrc(tSuperInterface);
		tSuperInterface__tClass____implementedBy.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(tSuperInterface__tClass____implementedBy);
		eType__eParameterTypeAccess____type.setName(eType__eParameterTypeAccess____type_name_prime);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target
				.setName(eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source
				.setName(eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime);
		eClassDeclarationToTClass__eClassDeclaration____source
				.setName(eClassDeclarationToTClass__eClassDeclaration____source_name_prime);
		eClassDeclarationToTClass__tClass____target.setName(eClassDeclarationToTClass__tClass____target_name_prime);
		eParameterTypeAccess__eSuperInterface____type.setName(eParameterTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eParameterTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eParameterTypeAccess____usagesInTypeAccess_name_prime);
		tClass__tSuperInterface____implements.setName(tClass__tSuperInterface____implements_name_prime);
		tSuperInterface__tClass____implementedBy.setName(tSuperInterface__tClass____implementedBy_name_prime);
		return new Object[] { tClass, eClassDeclaration, tSuperInterface, eType, eSuperInterface,
				eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface, isApplicableMatch,
				eType__eParameterTypeAccess____type, eSuperInterfaceToTSuperInterface__tSuperInterface____target,
				eSuperInterfaceToTSuperInterface__eSuperInterface____source,
				eClassDeclarationToTClass__eClassDeclaration____source, eClassDeclarationToTClass__tClass____target,
				eParameterTypeAccess__eSuperInterface____type,
				eSuperInterface__eParameterTypeAccess____usagesInTypeAccess, tClass__tSuperInterface____implements,
				tSuperInterface__tClass____implementedBy };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_12_4_solveCSP_bindingFBBBBBBBBBB(
			ClassImplementsPatrameterizedInterface _this, IsApplicableMatch isApplicableMatch, TClass tClass,
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			TypeAccess eParameterTypeAccess, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tClass, eClassDeclaration,
				tSuperInterface, eType, eSuperInterface, eClassDeclarationToTClass, eParameterTypeAccess,
				eSuperInterfaceToTSuperInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass, eClassDeclaration, tSuperInterface, eType,
					eSuperInterface, eClassDeclarationToTClass, eParameterTypeAccess,
					eSuperInterfaceToTSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			ClassImplementsPatrameterizedInterface _this, IsApplicableMatch isApplicableMatch, TClass tClass,
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			TypeAccess eParameterTypeAccess, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		Object[] result_pattern_ClassImplementsPatrameterizedInterface_12_4_solveCSP_binding = pattern_ClassImplementsPatrameterizedInterface_12_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, tClass, eClassDeclaration, tSuperInterface, eType, eSuperInterface,
				eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface);
		if (result_pattern_ClassImplementsPatrameterizedInterface_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsPatrameterizedInterface_12_4_solveCSP_binding[0];

			Object[] result_pattern_ClassImplementsPatrameterizedInterface_12_4_solveCSP_black = pattern_ClassImplementsPatrameterizedInterface_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassImplementsPatrameterizedInterface_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass, eClassDeclaration, tSuperInterface, eType,
						eSuperInterface, eClassDeclarationToTClass, eParameterTypeAccess,
						eSuperInterfaceToTSuperInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_12_5_checkCSP_expressionFBB(
			ClassImplementsPatrameterizedInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassImplementsPatrameterizedInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassImplementsPatrameterizedInterface_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_20_1_preparereturnvalue_bindingFB(
			ClassImplementsPatrameterizedInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, ClassImplementsPatrameterizedInterface _this) {
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

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassImplementsPatrameterizedInterface _this) {
		Object[] result_pattern_ClassImplementsPatrameterizedInterface_20_1_preparereturnvalue_binding = pattern_ClassImplementsPatrameterizedInterface_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassImplementsPatrameterizedInterface_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassImplementsPatrameterizedInterface_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassImplementsPatrameterizedInterface_20_1_preparereturnvalue_black = pattern_ClassImplementsPatrameterizedInterface_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassImplementsPatrameterizedInterface_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassImplementsPatrameterizedInterface_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassImplementsPatrameterizedInterface_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ClassImplementsPatrameterizedInterface_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_implements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTClass = _edge_implements.getSrc();
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			EObject tmpTSuperInterface = _edge_implements.getTrg();
			if (tmpTSuperInterface instanceof TInterface) {
				TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
				if (tClass.getImplements().contains(tSuperInterface)) {
					_result.add(new Object[] { tClass, tSuperInterface, _edge_implements });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ClassImplementsPatrameterizedInterface _this, Match match, TClass tClass, TInterface tSuperInterface) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tClass, tSuperInterface);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassImplementsPatrameterizedInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassImplementsPatrameterizedInterface_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_1_preparereturnvalue_bindingFB(
			ClassImplementsPatrameterizedInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, ClassImplementsPatrameterizedInterface _this) {
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

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassImplementsPatrameterizedInterface _this) {
		Object[] result_pattern_ClassImplementsPatrameterizedInterface_21_1_preparereturnvalue_binding = pattern_ClassImplementsPatrameterizedInterface_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassImplementsPatrameterizedInterface_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassImplementsPatrameterizedInterface_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassImplementsPatrameterizedInterface_21_1_preparereturnvalue_black = pattern_ClassImplementsPatrameterizedInterface_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassImplementsPatrameterizedInterface_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassImplementsPatrameterizedInterface_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassImplementsPatrameterizedInterface_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_0B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_230780 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess eTypeAccess) {
		for (AnnotationTypeMemberDeclaration __DEC_eTypeAccess_type_336469 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_2B(
			TypeAccess eTypeAccess) {
		for (ArrayType __DEC_eTypeAccess_elementType_905676 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_993081 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_4BB(
			TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration) {
		for (ClassDeclaration __DEC_eTypeAccess_superClass_775567 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!eClassDeclaration.equals(__DEC_eTypeAccess_superClass_775567)) {
				return new Object[] { eTypeAccess, eClassDeclaration };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_131688 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_6BB(
			TypeAccess eTypeAccess, ParameterizedType eType) {
		for (ParameterizedType __DEC_eTypeAccess_type_180970 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ParameterizedType.class, "type")) {
			if (!eType.equals(__DEC_eTypeAccess_type_180970)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_658705 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_8B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_532457 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_9BB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess) {
		if (eTypeAccess.equals(eClassDeclaration.getSuperClass())) {
			return new Object[] { eClassDeclaration, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_10BB(
			ParameterizedType eType, TypeAccess eTypeAccess) {
		if (eTypeAccess.equals(eType.getType())) {
			return new Object[] { eType, eTypeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_superInterfaces) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEClassDeclaration = _edge_superInterfaces.getSrc();
		if (tmpEClassDeclaration instanceof ClassDeclaration) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
			EObject tmpETypeAccess = _edge_superInterfaces.getTrg();
			if (tmpETypeAccess instanceof TypeAccess) {
				TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
				if (eClassDeclaration.getSuperInterfaces().contains(eTypeAccess)) {
					Type tmpEType = eTypeAccess.getType();
					if (tmpEType instanceof ParameterizedType) {
						ParameterizedType eType = (ParameterizedType) tmpEType;
						TypeAccess eParameterTypeAccess = eType.getType();
						if (eParameterTypeAccess != null) {
							if (!eParameterTypeAccess.equals(eTypeAccess)) {
								Type tmpESuperInterface = eParameterTypeAccess.getType();
								if (tmpESuperInterface instanceof InterfaceDeclaration) {
									InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
									if (pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_0B(
											eTypeAccess) == null) {
										if (pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_1B(
												eTypeAccess) == null) {
											if (pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_2B(
													eTypeAccess) == null) {
												if (pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_3B(
														eTypeAccess) == null) {
													if (pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_4BB(
															eTypeAccess, eClassDeclaration) == null) {
														if (pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_5B(
																eTypeAccess) == null) {
															if (pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_7B(
																	eTypeAccess) == null) {
																if (pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_8B(
																		eTypeAccess) == null) {
																	if (pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_9BB(
																			eClassDeclaration, eTypeAccess) == null) {
																		if (pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_6BB(
																				eTypeAccess, eType) == null) {
																			if (pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_black_nac_10BB(
																					eType, eTypeAccess) == null) {
																				_result.add(new Object[] {
																						eClassDeclaration, eTypeAccess,
																						eType, eSuperInterface,
																						eParameterTypeAccess,
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

							}
						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			ClassImplementsPatrameterizedInterface _this, Match match, ClassDeclaration eClassDeclaration,
			TypeAccess eTypeAccess, ParameterizedType eType, InterfaceDeclaration eSuperInterface,
			TypeAccess eParameterTypeAccess) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eClassDeclaration, eTypeAccess, eType,
				eSuperInterface, eParameterTypeAccess);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassImplementsPatrameterizedInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassImplementsPatrameterizedInterface_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_24_1_prepare_blackB(
			ClassImplementsPatrameterizedInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tClass");
		EObject _localVariable_1 = sourceMatch.getObject("eClassDeclaration");
		EObject _localVariable_2 = sourceMatch.getObject("eTypeAccess");
		EObject _localVariable_3 = targetMatch.getObject("tSuperInterface");
		EObject _localVariable_4 = sourceMatch.getObject("eType");
		EObject _localVariable_5 = sourceMatch.getObject("eSuperInterface");
		EObject _localVariable_6 = sourceMatch.getObject("eParameterTypeAccess");
		EObject tmpTClass = _localVariable_0;
		EObject tmpEClassDeclaration = _localVariable_1;
		EObject tmpETypeAccess = _localVariable_2;
		EObject tmpTSuperInterface = _localVariable_3;
		EObject tmpEType = _localVariable_4;
		EObject tmpESuperInterface = _localVariable_5;
		EObject tmpEParameterTypeAccess = _localVariable_6;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpEClassDeclaration instanceof ClassDeclaration) {
				ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
				if (tmpETypeAccess instanceof TypeAccess) {
					TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
					if (tmpTSuperInterface instanceof TInterface) {
						TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
						if (tmpEType instanceof ParameterizedType) {
							ParameterizedType eType = (ParameterizedType) tmpEType;
							if (tmpESuperInterface instanceof InterfaceDeclaration) {
								InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
								if (tmpEParameterTypeAccess instanceof TypeAccess) {
									TypeAccess eParameterTypeAccess = (TypeAccess) tmpEParameterTypeAccess;
									return new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface,
											eType, eSuperInterface, eParameterTypeAccess, targetMatch, sourceMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			TClass tClass, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			ParameterizedType eType, InterfaceDeclaration eSuperInterface, TypeAccess eParameterTypeAccess,
			Match sourceMatch, Match targetMatch) {
		if (!eParameterTypeAccess.equals(eTypeAccess)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType, eSuperInterface,
						eParameterTypeAccess, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ClassImplementsPatrameterizedInterface_24_2_matchsrctrgcontext_binding = pattern_ClassImplementsPatrameterizedInterface_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_ClassImplementsPatrameterizedInterface_24_2_matchsrctrgcontext_binding != null) {
			TClass tClass = (TClass) result_pattern_ClassImplementsPatrameterizedInterface_24_2_matchsrctrgcontext_binding[0];
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result_pattern_ClassImplementsPatrameterizedInterface_24_2_matchsrctrgcontext_binding[1];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ClassImplementsPatrameterizedInterface_24_2_matchsrctrgcontext_binding[2];
			TInterface tSuperInterface = (TInterface) result_pattern_ClassImplementsPatrameterizedInterface_24_2_matchsrctrgcontext_binding[3];
			ParameterizedType eType = (ParameterizedType) result_pattern_ClassImplementsPatrameterizedInterface_24_2_matchsrctrgcontext_binding[4];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result_pattern_ClassImplementsPatrameterizedInterface_24_2_matchsrctrgcontext_binding[5];
			TypeAccess eParameterTypeAccess = (TypeAccess) result_pattern_ClassImplementsPatrameterizedInterface_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_ClassImplementsPatrameterizedInterface_24_2_matchsrctrgcontext_black = pattern_ClassImplementsPatrameterizedInterface_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType, eSuperInterface,
					eParameterTypeAccess, sourceMatch, targetMatch);
			if (result_pattern_ClassImplementsPatrameterizedInterface_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType, eSuperInterface,
						eParameterTypeAccess, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_24_3_solvecsp_bindingFBBBBBBBBBB(
			ClassImplementsPatrameterizedInterface _this, TClass tClass, ClassDeclaration eClassDeclaration,
			TypeAccess eTypeAccess, TInterface tSuperInterface, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeAccess eParameterTypeAccess, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(tClass, eClassDeclaration, eTypeAccess, tSuperInterface,
				eType, eSuperInterface, eParameterTypeAccess, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType,
					eSuperInterface, eParameterTypeAccess, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			ClassImplementsPatrameterizedInterface _this, TClass tClass, ClassDeclaration eClassDeclaration,
			TypeAccess eTypeAccess, TInterface tSuperInterface, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeAccess eParameterTypeAccess, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_ClassImplementsPatrameterizedInterface_24_3_solvecsp_binding = pattern_ClassImplementsPatrameterizedInterface_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType, eSuperInterface,
				eParameterTypeAccess, sourceMatch, targetMatch);
		if (result_pattern_ClassImplementsPatrameterizedInterface_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsPatrameterizedInterface_24_3_solvecsp_binding[0];

			Object[] result_pattern_ClassImplementsPatrameterizedInterface_24_3_solvecsp_black = pattern_ClassImplementsPatrameterizedInterface_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ClassImplementsPatrameterizedInterface_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType,
						eSuperInterface, eParameterTypeAccess, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsPatrameterizedInterface_24_5_matchcorrcontext_blackBBBBFFBB(
			TClass tClass, ClassDeclaration eClassDeclaration, TInterface tSuperInterface,
			InterfaceDeclaration eSuperInterface, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType eSuperInterfaceToTSuperInterface : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tSuperInterface, TypeToTAbstractType.class, "target")) {
				if (eSuperInterface.equals(eSuperInterfaceToTSuperInterface.getSource())) {
					for (TypeToTAbstractType eClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(eClassDeclaration, TypeToTAbstractType.class, "source")) {
						if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
							if (tClass.equals(eClassDeclarationToTClass.getTarget())) {
								_result.add(new Object[] { tClass, eClassDeclaration, tSuperInterface, eSuperInterface,
										eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface, sourceMatch,
										targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType eClassDeclarationToTClass, TypeToTAbstractType eSuperInterfaceToTSuperInterface,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ClassImplementsPatrameterizedInterface";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eClassDeclarationToTClass);
		ccMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface, sourceMatch, targetMatch,
				ccMatch };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_24_6_createcorrespondence_blackBBBBBBBB(
			TClass tClass, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			ParameterizedType eType, InterfaceDeclaration eSuperInterface, TypeAccess eParameterTypeAccess,
			CCMatch ccMatch) {
		if (!eParameterTypeAccess.equals(eTypeAccess)) {
			return new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType, eSuperInterface,
					eParameterTypeAccess, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ClassImplementsPatrameterizedInterface";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassImplementsPatrameterizedInterface_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_0B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_999776 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_1B(
			TypeAccess eTypeAccess) {
		for (AnnotationTypeMemberDeclaration __DEC_eTypeAccess_type_739711 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_2B(
			TypeAccess eTypeAccess) {
		for (ArrayType __DEC_eTypeAccess_elementType_555175 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_3B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_831165 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_4BB(
			TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration) {
		for (ClassDeclaration __DEC_eTypeAccess_superClass_746798 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!eClassDeclaration.equals(__DEC_eTypeAccess_superClass_746798)) {
				return new Object[] { eTypeAccess, eClassDeclaration };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_5B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_223538 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_6BB(
			TypeAccess eTypeAccess, ParameterizedType eType) {
		for (ParameterizedType __DEC_eTypeAccess_type_875342 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ParameterizedType.class, "type")) {
			if (!eType.equals(__DEC_eTypeAccess_type_875342)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_229529 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_8B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_923855 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_9BB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess) {
		if (eTypeAccess.equals(eClassDeclaration.getSuperClass())) {
			return new Object[] { eClassDeclaration, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_10BB(
			ParameterizedType eType, TypeAccess eTypeAccess) {
		if (eTypeAccess.equals(eType.getType())) {
			return new Object[] { eType, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_blackBBBBB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeAccess eParameterTypeAccess) {
		if (!eParameterTypeAccess.equals(eTypeAccess)) {
			if (eParameterTypeAccess.equals(eType.getType())) {
				if (eClassDeclaration.getSuperInterfaces().contains(eTypeAccess)) {
					if (eType.equals(eTypeAccess.getType())) {
						if (eSuperInterface.equals(eParameterTypeAccess.getType())) {
							if (pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_0B(
									eTypeAccess) == null) {
								if (pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_1B(
										eTypeAccess) == null) {
									if (pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_2B(
											eTypeAccess) == null) {
										if (pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_3B(
												eTypeAccess) == null) {
											if (pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_4BB(
													eTypeAccess, eClassDeclaration) == null) {
												if (pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_5B(
														eTypeAccess) == null) {
													if (pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_6BB(
															eTypeAccess, eType) == null) {
														if (pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_7B(
																eTypeAccess) == null) {
															if (pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_8B(
																	eTypeAccess) == null) {
																if (pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_9BB(
																		eClassDeclaration, eTypeAccess) == null) {
																	if (pattern_ClassImplementsPatrameterizedInterface_27_1_matchtggpattern_black_nac_10BB(
																			eType, eTypeAccess) == null) {
																		return new Object[] { eClassDeclaration,
																				eTypeAccess, eType, eSuperInterface,
																				eParameterTypeAccess };
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_28_1_matchtggpattern_blackBB(
			TClass tClass, TInterface tSuperInterface) {
		if (tClass.getImplements().contains(tSuperInterface)) {
			return new Object[] { tClass, tSuperInterface };
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_29_1_createresult_blackB(
			ClassImplementsPatrameterizedInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TClass tClass) {
		if (ruleResult.getTargetObjects().contains(tClass)) {
			return new Object[] { ruleResult, tClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eClassDeclarationToTClass) {
		if (ruleResult.getCorrObjects().contains(eClassDeclarationToTClass)) {
			return new Object[] { ruleResult, eClassDeclarationToTClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ClassDeclaration eClassDeclaration) {
		if (ruleResult.getSourceObjects().contains(eClassDeclaration)) {
			return new Object[] { ruleResult, eClassDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TInterface tSuperInterface) {
		if (ruleResult.getTargetObjects().contains(tSuperInterface)) {
			return new Object[] { ruleResult, tSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		if (ruleResult.getCorrObjects().contains(eSuperInterfaceToTSuperInterface)) {
			return new Object[] { ruleResult, eSuperInterfaceToTSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, InterfaceDeclaration eSuperInterface) {
		if (ruleResult.getSourceObjects().contains(eSuperInterface)) {
			return new Object[] { ruleResult, eSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, TypeAccess eParameterTypeAccess) {
		if (ruleResult.getSourceObjects().contains(eParameterTypeAccess)) {
			return new Object[] { ruleResult, eParameterTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, ParameterizedType eType) {
		if (ruleResult.getSourceObjects().contains(eType)) {
			return new Object[] { ruleResult, eType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_blackFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eClassDeclarationToTClassList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList eSuperInterfaceToTSuperInterfaceList : ruleEntryContainer.getRuleEntryList()) {
				if (!eClassDeclarationToTClassList.equals(eSuperInterfaceToTSuperInterfaceList)) {
					for (EObject tmpEClassDeclarationToTClass : eClassDeclarationToTClassList.getEntryObjects()) {
						if (tmpEClassDeclarationToTClass instanceof TypeToTAbstractType) {
							TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) tmpEClassDeclarationToTClass;
							TAbstractType tmpTClass = eClassDeclarationToTClass.getTarget();
							if (tmpTClass instanceof TClass) {
								TClass tClass = (TClass) tmpTClass;
								Type tmpEClassDeclaration = eClassDeclarationToTClass.getSource();
								if (tmpEClassDeclaration instanceof ClassDeclaration) {
									ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
									if (pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, eClassDeclarationToTClass) == null) {
										if (pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, tClass) == null) {
											if (pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, eClassDeclaration) == null) {
												for (EObject tmpESuperInterfaceToTSuperInterface : eSuperInterfaceToTSuperInterfaceList
														.getEntryObjects()) {
													if (tmpESuperInterfaceToTSuperInterface instanceof TypeToTAbstractType) {
														TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) tmpESuperInterfaceToTSuperInterface;
														if (!eClassDeclarationToTClass
																.equals(eSuperInterfaceToTSuperInterface)) {
															TAbstractType tmpTSuperInterface = eSuperInterfaceToTSuperInterface
																	.getTarget();
															if (tmpTSuperInterface instanceof TInterface) {
																TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
																Type tmpESuperInterface = eSuperInterfaceToTSuperInterface
																		.getSource();
																if (tmpESuperInterface instanceof InterfaceDeclaration) {
																	InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
																	if (pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult,
																			eSuperInterfaceToTSuperInterface) == null) {
																		if (pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, tSuperInterface) == null) {
																			if (pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult,
																					eSuperInterface) == null) {
																				for (TypeAccess eParameterTypeAccess : eSuperInterface
																						.getUsagesInTypeAccess()) {
																					if (pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_black_nac_6BB(
																							ruleResult,
																							eParameterTypeAccess) == null) {
																						for (ParameterizedType eType : org.moflon.core.utilities.eMoflonEMFUtil
																								.getOppositeReferenceTyped(
																										eParameterTypeAccess,
																										ParameterizedType.class,
																										"type")) {
																							if (pattern_ClassImplementsPatrameterizedInterface_29_2_isapplicablecore_black_nac_7BB(
																									ruleResult,
																									eType) == null) {
																								_result.add(
																										new Object[] {
																												eClassDeclarationToTClassList,
																												tClass,
																												eClassDeclarationToTClass,
																												eClassDeclaration,
																												eSuperInterfaceToTSuperInterfaceList,
																												tSuperInterface,
																												eSuperInterfaceToTSuperInterface,
																												eSuperInterface,
																												eParameterTypeAccess,
																												eType,
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
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_29_3_solveCSP_bindingFBBBBBBBBBBB(
			ClassImplementsPatrameterizedInterface _this, IsApplicableMatch isApplicableMatch, TClass tClass,
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			TypeAccess eParameterTypeAccess, TypeToTAbstractType eSuperInterfaceToTSuperInterface,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tClass, eClassDeclaration,
				tSuperInterface, eType, eSuperInterface, eClassDeclarationToTClass, eParameterTypeAccess,
				eSuperInterfaceToTSuperInterface, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass, eClassDeclaration, tSuperInterface, eType,
					eSuperInterface, eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			ClassImplementsPatrameterizedInterface _this, IsApplicableMatch isApplicableMatch, TClass tClass,
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			TypeAccess eParameterTypeAccess, TypeToTAbstractType eSuperInterfaceToTSuperInterface,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ClassImplementsPatrameterizedInterface_29_3_solveCSP_binding = pattern_ClassImplementsPatrameterizedInterface_29_3_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, tClass, eClassDeclaration, tSuperInterface, eType, eSuperInterface,
				eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface, ruleResult);
		if (result_pattern_ClassImplementsPatrameterizedInterface_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsPatrameterizedInterface_29_3_solveCSP_binding[0];

			Object[] result_pattern_ClassImplementsPatrameterizedInterface_29_3_solveCSP_black = pattern_ClassImplementsPatrameterizedInterface_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ClassImplementsPatrameterizedInterface_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass, eClassDeclaration, tSuperInterface, eType,
						eSuperInterface, eClassDeclarationToTClass, eParameterTypeAccess,
						eSuperInterfaceToTSuperInterface, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsPatrameterizedInterface_29_4_checkCSP_expressionFBB(
			ClassImplementsPatrameterizedInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_29_5_checknacs_blackBBBBBBBB(
			TClass tClass, ClassDeclaration eClassDeclaration, TInterface tSuperInterface, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			TypeAccess eParameterTypeAccess, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
			return new Object[] { tClass, eClassDeclaration, tSuperInterface, eType, eSuperInterface,
					eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_29_6_perform_blackBBBBBBBBB(
			TClass tClass, ClassDeclaration eClassDeclaration, TInterface tSuperInterface, ParameterizedType eType,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			TypeAccess eParameterTypeAccess, TypeToTAbstractType eSuperInterfaceToTSuperInterface,
			ModelgeneratorRuleResult ruleResult) {
		if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
			return new Object[] { tClass, eClassDeclaration, tSuperInterface, eType, eSuperInterface,
					eClassDeclarationToTClass, eParameterTypeAccess, eSuperInterfaceToTSuperInterface, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsPatrameterizedInterface_29_6_perform_greenBBFBBB(TClass tClass,
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, ParameterizedType eType,
			ModelgeneratorRuleResult ruleResult) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		tClass.getImplements().add(tSuperInterface);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		eClassDeclaration.getSuperInterfaces().add(eTypeAccess);
		eTypeAccess.setType(eType);
		ruleResult.getSourceObjects().add(eTypeAccess);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ClassImplementsPatrameterizedInterface_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ClassImplementsPatrameterizedInterfaceImpl
