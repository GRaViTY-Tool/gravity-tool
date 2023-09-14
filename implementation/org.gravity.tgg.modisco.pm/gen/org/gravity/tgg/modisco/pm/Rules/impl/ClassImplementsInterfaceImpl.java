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

import org.gravity.tgg.modisco.pm.Rules.ClassImplementsInterface;
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
 * An implementation of the model object '<em><b>Class Implements Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClassImplementsInterfaceImpl extends AbstractRuleImpl implements ClassImplementsInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImplementsInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getClassImplementsInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			InterfaceDeclaration eSuperInterface) {

		Object[] result1_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_0_1_initialbindings_blackBBBBB(this, match, eClassDeclaration,
						eTypeAccess, eSuperInterface);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eSuperInterface] = " + eSuperInterface + ".");
		}

		Object[] result2_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, eClassDeclaration,
						eTypeAccess, eSuperInterface);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eSuperInterface] = " + eSuperInterface + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_0_4_collectelementstobetranslated_blackBBBB(match,
							eClassDeclaration, eTypeAccess, eSuperInterface);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
						+ "[eSuperInterface] = " + eSuperInterface + ".");
			}
			ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_0_4_collectelementstobetranslated_greenBBBBFFF(match,
							eClassDeclaration, eTypeAccess, eSuperInterface);
			//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge eTypeAccess__eSuperInterface____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[6];

			Object[] result5_black = ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_0_5_collectcontextelements_blackBBBB(match, eClassDeclaration,
							eTypeAccess, eSuperInterface);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
						+ "[eSuperInterface] = " + eSuperInterface + ".");
			}
			ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_0_5_collectcontextelements_greenBBB(match,
					eClassDeclaration, eSuperInterface);

			// 
			ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_0_6_registerobjectstomatch_expressionBBBBB(
					this, match, eClassDeclaration, eTypeAccess, eSuperInterface);
			return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_0_7_expressionF();
		} else {
			return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TClass tClass = (TClass) result1_bindingAndBlack[0];
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result1_bindingAndBlack[1];
		TypeAccess eTypeAccess = (TypeAccess) result1_bindingAndBlack[2];
		TInterface tSuperInterface = (TInterface) result1_bindingAndBlack[3];
		InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result1_bindingAndBlack[4];
		TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result1_bindingAndBlack[5];
		TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_1_1_performtransformation_greenBB(tClass,
				tSuperInterface);

		Object[] result2_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_1_2_collecttranslatedelements_blackB(eTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[eTypeAccess] = " + eTypeAccess + ".");
		}
		Object[] result2_green = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_1_2_collecttranslatedelements_greenFB(eTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, tClass,
						eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface, eClassDeclarationToTClass,
						eSuperInterfaceToTSuperInterface);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tClass] = " + tClass + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[tSuperInterface] = " + tSuperInterface + ", "
					+ "[eSuperInterface] = " + eSuperInterface + ", " + "[eClassDeclarationToTClass] = "
					+ eClassDeclarationToTClass + ", " + "[eSuperInterfaceToTSuperInterface] = "
					+ eSuperInterfaceToTSuperInterface + ".");
		}
		ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface);
		//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge eTypeAccess__eSuperInterface____type = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tClass__tSuperInterface____implements = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tSuperInterface__tClass____implementedBy = (EMoflonEdge) result3_green[10];

		// 
		// 
		ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_1_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface,
				eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface);
		return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_binding[0];
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[1];
		InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_binding[2];
		for (Object[] result2_black : ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_2_2_corematch_blackFBBFBFFB(eClassDeclaration, eTypeAccess,
						eSuperInterface, match)) {
			TClass tClass = (TClass) result2_black[0];
			TInterface tSuperInterface = (TInterface) result2_black[3];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result2_black[5];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result2_black[6];
			// ForEach 
			for (Object[] result3_black : ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_2_3_findcontext_blackBBBBBBB(tClass, eClassDeclaration,
							eTypeAccess, tSuperInterface, eSuperInterface, eClassDeclarationToTClass,
							eSuperInterfaceToTSuperInterface)) {
				Object[] result3_green = ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_2_3_findcontext_greenBBBBBBBFFFFFFFF(tClass,
								eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface,
								eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eTypeAccess__eSuperInterface____type = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge eClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, tClass, eClassDeclaration, eTypeAccess, tSuperInterface,
								eSuperInterface, eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tClass] = " + tClass + ", "
							+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[eTypeAccess] = " + eTypeAccess
							+ ", " + "[tSuperInterface] = " + tSuperInterface + ", " + "[eSuperInterface] = "
							+ eSuperInterface + ", " + "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass
							+ ", " + "[eSuperInterfaceToTSuperInterface] = " + eSuperInterfaceToTSuperInterface + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = ClassImplementsInterfaceImpl
							.pattern_ClassImplementsInterface_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			InterfaceDeclaration eSuperInterface) {
		match.registerObject("eClassDeclaration", eClassDeclaration);
		match.registerObject("eTypeAccess", eTypeAccess);
		match.registerObject("eSuperInterface", eSuperInterface);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			InterfaceDeclaration eSuperInterface) {// Create CSP
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
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
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
		isApplicableMatch.registerObject("eSuperInterface", eSuperInterface);
		isApplicableMatch.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
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
			EObject eTypeAccess, EObject tSuperInterface, EObject eSuperInterface, EObject eClassDeclarationToTClass,
			EObject eSuperInterfaceToTSuperInterface) {
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("eClassDeclaration", eClassDeclaration);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("tSuperInterface", tSuperInterface);
		ruleresult.registerObject("eSuperInterface", eSuperInterface);
		ruleresult.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
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

		Object[] result1_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_10_1_initialbindings_blackBBBB(this, match, tClass, tSuperInterface);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tClass] = " + tClass + ", " + "[tSuperInterface] = " + tSuperInterface + ".");
		}

		Object[] result2_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tClass,
						tSuperInterface);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tClass] = " + tClass + ", " + "[tSuperInterface] = " + tSuperInterface + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_10_4_collectelementstobetranslated_blackBBB(match, tClass,
							tSuperInterface);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[tSuperInterface] = " + tSuperInterface + ".");
			}
			ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_10_4_collectelementstobetranslated_greenBBBFF(
					match, tClass, tSuperInterface);
			//nothing EMoflonEdge tClass__tSuperInterface____implements = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tSuperInterface__tClass____implementedBy = (EMoflonEdge) result4_green[4];

			Object[] result5_black = ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_10_5_collectcontextelements_blackBBB(match, tClass,
							tSuperInterface);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[tSuperInterface] = " + tSuperInterface + ".");
			}
			ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_10_5_collectcontextelements_greenBBB(match,
					tClass, tSuperInterface);

			// 
			ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_10_6_registerobjectstomatch_expressionBBBB(
					this, match, tClass, tSuperInterface);
			return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_10_7_expressionF();
		} else {
			return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TClass tClass = (TClass) result1_bindingAndBlack[0];
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result1_bindingAndBlack[1];
		TInterface tSuperInterface = (TInterface) result1_bindingAndBlack[2];
		InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result1_bindingAndBlack[3];
		TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result1_bindingAndBlack[4];
		TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_11_1_performtransformation_greenBFB(eClassDeclaration,
						eSuperInterface);
		TypeAccess eTypeAccess = (TypeAccess) result1_green[1];

		Object[] result2_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_11_2_collecttranslatedelements_blackB(eTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[eTypeAccess] = " + eTypeAccess + ".");
		}
		Object[] result2_green = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_11_2_collecttranslatedelements_greenFB(eTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, tClass,
						eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface, eClassDeclarationToTClass,
						eSuperInterfaceToTSuperInterface);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tClass] = " + tClass + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[tSuperInterface] = " + tSuperInterface + ", "
					+ "[eSuperInterface] = " + eSuperInterface + ", " + "[eClassDeclarationToTClass] = "
					+ eClassDeclarationToTClass + ", " + "[eSuperInterfaceToTSuperInterface] = "
					+ eSuperInterfaceToTSuperInterface + ".");
		}
		ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface);
		//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge eTypeAccess__eSuperInterface____type = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tClass__tSuperInterface____implements = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tSuperInterface__tClass____implementedBy = (EMoflonEdge) result3_green[10];

		// 
		// 
		ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_11_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface,
				eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface);
		return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tClass = (TClass) result2_binding[0];
		TInterface tSuperInterface = (TInterface) result2_binding[1];
		for (Object[] result2_black : ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_12_2_corematch_blackBFBFFFB(tClass, tSuperInterface, match)) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_black[1];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_black[3];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result2_black[4];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result2_black[5];
			// ForEach 
			for (Object[] result3_black : ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_12_3_findcontext_blackBBBBBB(tClass, eClassDeclaration,
							tSuperInterface, eSuperInterface, eClassDeclarationToTClass,
							eSuperInterfaceToTSuperInterface)) {
				Object[] result3_green = ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_12_3_findcontext_greenBBBBBBFFFFFFF(tClass, eClassDeclaration,
								tSuperInterface, eSuperInterface, eClassDeclarationToTClass,
								eSuperInterfaceToTSuperInterface);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tClass__tSuperInterface____implements = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tSuperInterface__tClass____implementedBy = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, tClass, eClassDeclaration, tSuperInterface, eSuperInterface,
								eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tClass] = " + tClass + ", "
							+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[tSuperInterface] = "
							+ tSuperInterface + ", " + "[eSuperInterface] = " + eSuperInterface + ", "
							+ "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass + ", "
							+ "[eSuperInterfaceToTSuperInterface] = " + eSuperInterfaceToTSuperInterface + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = ClassImplementsInterfaceImpl
							.pattern_ClassImplementsInterface_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_12_7_expressionFB(ruleresult);
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
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {// Create CSP
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
		isApplicableMatch.registerObject("eSuperInterface", eSuperInterface);
		isApplicableMatch.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
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
			EObject eTypeAccess, EObject tSuperInterface, EObject eSuperInterface, EObject eClassDeclarationToTClass,
			EObject eSuperInterfaceToTSuperInterface) {
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("eClassDeclaration", eClassDeclaration);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("tSuperInterface", tSuperInterface);
		ruleresult.registerObject("eSuperInterface", eSuperInterface);
		ruleresult.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_31(EMoflonEdge _edge_implements) {

		Object[] result1_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_20_2_testcorematchandDECs_blackFFB(_edge_implements)) {
			TClass tClass = (TClass) result2_black[0];
			TInterface tSuperInterface = (TInterface) result2_black[1];
			Object[] result2_green = ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tClass, tSuperInterface)) {
				// 
				if (ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ClassImplementsInterfaceImpl
							.pattern_ClassImplementsInterface_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_33(EMoflonEdge _edge_superInterfaces) {

		Object[] result1_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_21_2_testcorematchandDECs_blackFFFB(_edge_superInterfaces)) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_black[0];
			TypeAccess eTypeAccess = (TypeAccess) result2_black[1];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_black[2];
			Object[] result2_green = ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, eClassDeclaration, eTypeAccess, eSuperInterface)) {
				// 
				if (ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ClassImplementsInterfaceImpl
							.pattern_ClassImplementsInterface_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ClassImplementsInterface");
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
		ruleResult.setRule("ClassImplementsInterface");
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

		Object[] result1_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TClass tClass = (TClass) result2_bindingAndBlack[0];
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_bindingAndBlack[1];
		TypeAccess eTypeAccess = (TypeAccess) result2_bindingAndBlack[2];
		TInterface tSuperInterface = (TInterface) result2_bindingAndBlack[3];
		InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, tClass,
						eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[tSuperInterface] = " + tSuperInterface + ", "
					+ "[eSuperInterface] = " + eSuperInterface + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_24_5_matchcorrcontext_blackBBBBFFBB(tClass, eClassDeclaration,
							tSuperInterface, eSuperInterface, sourceMatch, targetMatch)) {
				TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result5_black[4];
				TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result5_black[5];
				Object[] result5_green = ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_24_5_matchcorrcontext_greenBBBBF(eClassDeclarationToTClass,
								eSuperInterfaceToTSuperInterface, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_24_6_createcorrespondence_blackBBBBBB(tClass,
								eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass
							+ ", " + "[eClassDeclaration] = " + eClassDeclaration + ", " + "[eTypeAccess] = "
							+ eTypeAccess + ", " + "[tSuperInterface] = " + tSuperInterface + ", "
							+ "[eSuperInterface] = " + eSuperInterface + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TClass tClass, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			TInterface tSuperInterface, InterfaceDeclaration eSuperInterface, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			InterfaceDeclaration eSuperInterface) {// 
		Object[] result1_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_27_1_matchtggpattern_blackBBB(eClassDeclaration, eTypeAccess,
						eSuperInterface);
		if (result1_black != null) {
			return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_27_2_expressionF();
		} else {
			return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tClass, TInterface tSuperInterface) {// 
		Object[] result1_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_28_1_matchtggpattern_blackBB(tClass, tSuperInterface);
		if (result1_black != null) {
			return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_28_2_expressionF();
		} else {
			return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_28_3_expressionF();
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

		Object[] result1_black = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ClassImplementsInterfaceImpl
				.pattern_ClassImplementsInterface_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList eClassDeclarationToTClassList = (RuleEntryList) result2_black[0];
			TClass tClass = (TClass) result2_black[1];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result2_black[2];
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_black[3];
			//nothing RuleEntryList eSuperInterfaceToTSuperInterfaceList = (RuleEntryList) result2_black[4];
			TInterface tSuperInterface = (TInterface) result2_black[5];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result2_black[6];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_black[7];

			Object[] result3_bindingAndBlack = ClassImplementsInterfaceImpl
					.pattern_ClassImplementsInterface_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							tClass, eClassDeclaration, tSuperInterface, eSuperInterface, eClassDeclarationToTClass,
							eSuperInterfaceToTSuperInterface, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tClass] = " + tClass + ", "
						+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[tSuperInterface] = " + tSuperInterface
						+ ", " + "[eSuperInterface] = " + eSuperInterface + ", " + "[eClassDeclarationToTClass] = "
						+ eClassDeclarationToTClass + ", " + "[eSuperInterfaceToTSuperInterface] = "
						+ eSuperInterfaceToTSuperInterface + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ClassImplementsInterfaceImpl
						.pattern_ClassImplementsInterface_29_5_checknacs_blackBBBBBB(tClass, eClassDeclaration,
								tSuperInterface, eSuperInterface, eClassDeclarationToTClass,
								eSuperInterfaceToTSuperInterface);
				if (result5_black != null) {

					Object[] result6_black = ClassImplementsInterfaceImpl
							.pattern_ClassImplementsInterface_29_6_perform_blackBBBBBBB(tClass, eClassDeclaration,
									tSuperInterface, eSuperInterface, eClassDeclarationToTClass,
									eSuperInterfaceToTSuperInterface, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass
								+ ", " + "[eClassDeclaration] = " + eClassDeclaration + ", " + "[tSuperInterface] = "
								+ tSuperInterface + ", " + "[eSuperInterface] = " + eSuperInterface + ", "
								+ "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass + ", "
								+ "[eSuperInterfaceToTSuperInterface] = " + eSuperInterfaceToTSuperInterface + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_29_6_perform_greenBBFBBB(tClass,
							eClassDeclaration, tSuperInterface, eSuperInterface, ruleResult);
					//nothing TypeAccess eTypeAccess = (TypeAccess) result6_green[2];

				} else {
				}

			} else {
			}

		}
		return ClassImplementsInterfaceImpl.pattern_ClassImplementsInterface_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TClass tClass,
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, TypeToTAbstractType eSuperInterfaceToTSuperInterface,
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
		isApplicableMatch.registerObject("eSuperInterface", eSuperInterface);
		isApplicableMatch.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
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
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPROPRIATE_FWD__MATCH_CLASSDECLARATION_TYPEACCESS_INTERFACEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSDECLARATION_TYPEACCESS_INTERFACEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
			return null;
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSDECLARATION_TYPEACCESS_INTERFACEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TCLASS_CLASSDECLARATION_TYPEACCESS_TINTERFACE_INTERFACEDECLARATION_TYPETOTABSTRACTTYPE_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (TypeAccess) arguments.get(3), (TInterface) arguments.get(4),
					(InterfaceDeclaration) arguments.get(5), (TypeToTAbstractType) arguments.get(6),
					(TypeToTAbstractType) arguments.get(7));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPROPRIATE_BWD__MATCH_TCLASS_TINTERFACE:
			return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TInterface) arguments.get(2));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TINTERFACE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TInterface) arguments.get(2));
			return null;
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TINTERFACE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TInterface) arguments.get(2));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCLASS_CLASSDECLARATION_TINTERFACE_INTERFACEDECLARATION_TYPETOTABSTRACTTYPE_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (TInterface) arguments.get(3),
					(InterfaceDeclaration) arguments.get(4), (TypeToTAbstractType) arguments.get(5),
					(TypeToTAbstractType) arguments.get(6));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_31__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_31((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_33__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_33((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_SOLVE_CSP_CC__TCLASS_CLASSDECLARATION_TYPEACCESS_TINTERFACE_INTERFACEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TClass) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (TInterface) arguments.get(3),
					(InterfaceDeclaration) arguments.get(4), (Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___CHECK_DEC_FWD__CLASSDECLARATION_TYPEACCESS_INTERFACEDECLARATION:
			return checkDEC_FWD((ClassDeclaration) arguments.get(0), (TypeAccess) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___CHECK_DEC_BWD__TCLASS_TINTERFACE:
			return checkDEC_BWD((TClass) arguments.get(0), (TInterface) arguments.get(1));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCLASS_CLASSDECLARATION_TINTERFACE_INTERFACEDECLARATION_TYPETOTABSTRACTTYPE_TYPETOTABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (TInterface) arguments.get(3),
					(InterfaceDeclaration) arguments.get(4), (TypeToTAbstractType) arguments.get(5),
					(TypeToTAbstractType) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.CLASS_IMPLEMENTS_INTERFACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ClassImplementsInterface_0_1_initialbindings_blackBBBBB(
			ClassImplementsInterface _this, Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			InterfaceDeclaration eSuperInterface) {
		return new Object[] { _this, match, eClassDeclaration, eTypeAccess, eSuperInterface };
	}

	public static final Object[] pattern_ClassImplementsInterface_0_2_SolveCSP_bindingFBBBBB(
			ClassImplementsInterface _this, Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			InterfaceDeclaration eSuperInterface) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eClassDeclaration, eTypeAccess, eSuperInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eClassDeclaration, eTypeAccess, eSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsInterface_0_2_SolveCSP_bindingAndBlackFBBBBB(
			ClassImplementsInterface _this, Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			InterfaceDeclaration eSuperInterface) {
		Object[] result_pattern_ClassImplementsInterface_0_2_SolveCSP_binding = pattern_ClassImplementsInterface_0_2_SolveCSP_bindingFBBBBB(
				_this, match, eClassDeclaration, eTypeAccess, eSuperInterface);
		if (result_pattern_ClassImplementsInterface_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsInterface_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassImplementsInterface_0_2_SolveCSP_black = pattern_ClassImplementsInterface_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassImplementsInterface_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eClassDeclaration, eTypeAccess, eSuperInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsInterface_0_3_CheckCSP_expressionFBB(
			ClassImplementsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_0_4_collectelementstobetranslated_blackBBBB(
			Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			InterfaceDeclaration eSuperInterface) {
		return new Object[] { match, eClassDeclaration, eTypeAccess, eSuperInterface };
	}

	public static final Object[] pattern_ClassImplementsInterface_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			InterfaceDeclaration eSuperInterface) {
		EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eTypeAccess);
		String eClassDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		String eTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		eClassDeclaration__eTypeAccess____superInterfaces.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eClassDeclaration__eTypeAccess____superInterfaces);
		eTypeAccess__eSuperInterface____type.setSrc(eTypeAccess);
		eTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		match.getToBeTranslatedEdges().add(eTypeAccess__eSuperInterface____type);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eSuperInterface__eTypeAccess____usagesInTypeAccess);
		eClassDeclaration__eTypeAccess____superInterfaces
				.setName(eClassDeclaration__eTypeAccess____superInterfaces_name_prime);
		eTypeAccess__eSuperInterface____type.setName(eTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { match, eClassDeclaration, eTypeAccess, eSuperInterface,
				eClassDeclaration__eTypeAccess____superInterfaces, eTypeAccess__eSuperInterface____type,
				eSuperInterface__eTypeAccess____usagesInTypeAccess };
	}

	public static final Object[] pattern_ClassImplementsInterface_0_5_collectcontextelements_blackBBBB(Match match,
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, InterfaceDeclaration eSuperInterface) {
		return new Object[] { match, eClassDeclaration, eTypeAccess, eSuperInterface };
	}

	public static final Object[] pattern_ClassImplementsInterface_0_5_collectcontextelements_greenBBB(Match match,
			ClassDeclaration eClassDeclaration, InterfaceDeclaration eSuperInterface) {
		match.getContextNodes().add(eClassDeclaration);
		match.getContextNodes().add(eSuperInterface);
		return new Object[] { match, eClassDeclaration, eSuperInterface };
	}

	public static final void pattern_ClassImplementsInterface_0_6_registerobjectstomatch_expressionBBBBB(
			ClassImplementsInterface _this, Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			InterfaceDeclaration eSuperInterface) {
		_this.registerObjectsToMatch_FWD(match, eClassDeclaration, eTypeAccess, eSuperInterface);

	}

	public static final boolean pattern_ClassImplementsInterface_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassImplementsInterface_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("eClassDeclaration");
		EObject _localVariable_2 = isApplicableMatch.getObject("eTypeAccess");
		EObject _localVariable_3 = isApplicableMatch.getObject("tSuperInterface");
		EObject _localVariable_4 = isApplicableMatch.getObject("eSuperInterface");
		EObject _localVariable_5 = isApplicableMatch.getObject("eClassDeclarationToTClass");
		EObject _localVariable_6 = isApplicableMatch.getObject("eSuperInterfaceToTSuperInterface");
		EObject tmpTClass = _localVariable_0;
		EObject tmpEClassDeclaration = _localVariable_1;
		EObject tmpETypeAccess = _localVariable_2;
		EObject tmpTSuperInterface = _localVariable_3;
		EObject tmpESuperInterface = _localVariable_4;
		EObject tmpEClassDeclarationToTClass = _localVariable_5;
		EObject tmpESuperInterfaceToTSuperInterface = _localVariable_6;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpEClassDeclaration instanceof ClassDeclaration) {
				ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
				if (tmpETypeAccess instanceof TypeAccess) {
					TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
					if (tmpTSuperInterface instanceof TInterface) {
						TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
						if (tmpESuperInterface instanceof InterfaceDeclaration) {
							InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
							if (tmpEClassDeclarationToTClass instanceof TypeToTAbstractType) {
								TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) tmpEClassDeclarationToTClass;
								if (tmpESuperInterfaceToTSuperInterface instanceof TypeToTAbstractType) {
									TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) tmpESuperInterfaceToTSuperInterface;
									return new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface,
											eSuperInterface, eClassDeclarationToTClass,
											eSuperInterfaceToTSuperInterface, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_1_1_performtransformation_blackBBBBBBBFBB(
			TClass tClass, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, ClassImplementsInterface _this,
			IsApplicableMatch isApplicableMatch) {
		if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface,
							eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassImplementsInterface_1_1_performtransformation_binding = pattern_ClassImplementsInterface_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassImplementsInterface_1_1_performtransformation_binding != null) {
			TClass tClass = (TClass) result_pattern_ClassImplementsInterface_1_1_performtransformation_binding[0];
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result_pattern_ClassImplementsInterface_1_1_performtransformation_binding[1];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ClassImplementsInterface_1_1_performtransformation_binding[2];
			TInterface tSuperInterface = (TInterface) result_pattern_ClassImplementsInterface_1_1_performtransformation_binding[3];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result_pattern_ClassImplementsInterface_1_1_performtransformation_binding[4];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result_pattern_ClassImplementsInterface_1_1_performtransformation_binding[5];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result_pattern_ClassImplementsInterface_1_1_performtransformation_binding[6];

			Object[] result_pattern_ClassImplementsInterface_1_1_performtransformation_black = pattern_ClassImplementsInterface_1_1_performtransformation_blackBBBBBBBFBB(
					tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface, eClassDeclarationToTClass,
					eSuperInterfaceToTSuperInterface, _this, isApplicableMatch);
			if (result_pattern_ClassImplementsInterface_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassImplementsInterface_1_1_performtransformation_black[7];

				return new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface,
						eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_1_1_performtransformation_greenBB(TClass tClass,
			TInterface tSuperInterface) {
		tClass.getImplements().add(tSuperInterface);
		return new Object[] { tClass, tSuperInterface };
	}

	public static final Object[] pattern_ClassImplementsInterface_1_2_collecttranslatedelements_blackB(
			TypeAccess eTypeAccess) {
		return new Object[] { eTypeAccess };
	}

	public static final Object[] pattern_ClassImplementsInterface_1_2_collecttranslatedelements_greenFB(
			TypeAccess eTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(eTypeAccess);
		return new Object[] { ruleresult, eTypeAccess };
	}

	public static final Object[] pattern_ClassImplementsInterface_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject tClass, EObject eClassDeclaration, EObject eTypeAccess,
			EObject tSuperInterface, EObject eSuperInterface, EObject eClassDeclarationToTClass,
			EObject eSuperInterfaceToTSuperInterface) {
		if (!tClass.equals(tSuperInterface)) {
			if (!eClassDeclaration.equals(tClass)) {
				if (!eClassDeclaration.equals(eTypeAccess)) {
					if (!eClassDeclaration.equals(tSuperInterface)) {
						if (!eClassDeclaration.equals(eSuperInterface)) {
							if (!eClassDeclaration.equals(eClassDeclarationToTClass)) {
								if (!eClassDeclaration.equals(eSuperInterfaceToTSuperInterface)) {
									if (!eTypeAccess.equals(tClass)) {
										if (!eTypeAccess.equals(tSuperInterface)) {
											if (!eSuperInterface.equals(tClass)) {
												if (!eSuperInterface.equals(eTypeAccess)) {
													if (!eSuperInterface.equals(tSuperInterface)) {
														if (!eSuperInterface.equals(eSuperInterfaceToTSuperInterface)) {
															if (!eClassDeclarationToTClass.equals(tClass)) {
																if (!eClassDeclarationToTClass.equals(eTypeAccess)) {
																	if (!eClassDeclarationToTClass
																			.equals(tSuperInterface)) {
																		if (!eClassDeclarationToTClass
																				.equals(eSuperInterface)) {
																			if (!eClassDeclarationToTClass.equals(
																					eSuperInterfaceToTSuperInterface)) {
																				if (!eSuperInterfaceToTSuperInterface
																						.equals(tClass)) {
																					if (!eSuperInterfaceToTSuperInterface
																							.equals(eTypeAccess)) {
																						if (!eSuperInterfaceToTSuperInterface
																								.equals(tSuperInterface)) {
																							return new Object[] {
																									ruleresult, tClass,
																									eClassDeclaration,
																									eTypeAccess,
																									tSuperInterface,
																									eSuperInterface,
																									eClassDeclarationToTClass,
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
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tClass, EObject eClassDeclaration, EObject eTypeAccess,
			EObject tSuperInterface, EObject eSuperInterface) {
		EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tSuperInterface____implements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tClass____implementedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassImplementsInterface";
		String eClassDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		String eTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String tClass__tSuperInterface____implements_name_prime = "implements";
		String tSuperInterface__tClass____implementedBy_name_prime = "implementedBy";
		eClassDeclaration__eTypeAccess____superInterfaces.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eClassDeclaration__eTypeAccess____superInterfaces);
		eTypeAccess__eSuperInterface____type.setSrc(eTypeAccess);
		eTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		ruleresult.getTranslatedEdges().add(eTypeAccess__eSuperInterface____type);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eSuperInterface__eTypeAccess____usagesInTypeAccess);
		tClass__tSuperInterface____implements.setSrc(tClass);
		tClass__tSuperInterface____implements.setTrg(tSuperInterface);
		ruleresult.getCreatedEdges().add(tClass__tSuperInterface____implements);
		tSuperInterface__tClass____implementedBy.setSrc(tSuperInterface);
		tSuperInterface__tClass____implementedBy.setTrg(tClass);
		ruleresult.getCreatedEdges().add(tSuperInterface__tClass____implementedBy);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eClassDeclaration__eTypeAccess____superInterfaces
				.setName(eClassDeclaration__eTypeAccess____superInterfaces_name_prime);
		eTypeAccess__eSuperInterface____type.setName(eTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime);
		tClass__tSuperInterface____implements.setName(tClass__tSuperInterface____implements_name_prime);
		tSuperInterface__tClass____implementedBy.setName(tSuperInterface__tClass____implementedBy_name_prime);
		return new Object[] { ruleresult, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface,
				eClassDeclaration__eTypeAccess____superInterfaces, eTypeAccess__eSuperInterface____type,
				eSuperInterface__eTypeAccess____usagesInTypeAccess, tClass__tSuperInterface____implements,
				tSuperInterface__tClass____implementedBy };
	}

	public static final void pattern_ClassImplementsInterface_1_5_registerobjects_expressionBBBBBBBBB(
			ClassImplementsInterface _this, PerformRuleResult ruleresult, EObject tClass, EObject eClassDeclaration,
			EObject eTypeAccess, EObject tSuperInterface, EObject eSuperInterface, EObject eClassDeclarationToTClass,
			EObject eSuperInterfaceToTSuperInterface) {
		_this.registerObjects_FWD(ruleresult, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface,
				eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface);

	}

	public static final PerformRuleResult pattern_ClassImplementsInterface_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_2_1_preparereturnvalue_bindingFB(
			ClassImplementsInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassImplementsInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_2_1_preparereturnvalue_bindingAndBlackFFB(
			ClassImplementsInterface _this) {
		Object[] result_pattern_ClassImplementsInterface_2_1_preparereturnvalue_binding = pattern_ClassImplementsInterface_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassImplementsInterface_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassImplementsInterface_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassImplementsInterface_2_1_preparereturnvalue_black = pattern_ClassImplementsInterface_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassImplementsInterface_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassImplementsInterface_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassImplementsInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassImplementsInterface_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eClassDeclaration");
		EObject _localVariable_1 = match.getObject("eTypeAccess");
		EObject _localVariable_2 = match.getObject("eSuperInterface");
		EObject tmpEClassDeclaration = _localVariable_0;
		EObject tmpETypeAccess = _localVariable_1;
		EObject tmpESuperInterface = _localVariable_2;
		if (tmpEClassDeclaration instanceof ClassDeclaration) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
			if (tmpETypeAccess instanceof TypeAccess) {
				TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
				if (tmpESuperInterface instanceof InterfaceDeclaration) {
					InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
					return new Object[] { eClassDeclaration, eTypeAccess, eSuperInterface, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsInterface_2_2_corematch_blackFBBFBFFB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, InterfaceDeclaration eSuperInterface,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType eClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eClassDeclaration, TypeToTAbstractType.class, "source")) {
			TAbstractType tmpTClass = eClassDeclarationToTClass.getTarget();
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				for (TypeToTAbstractType eSuperInterfaceToTSuperInterface : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(eSuperInterface, TypeToTAbstractType.class, "source")) {
					if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
						TAbstractType tmpTSuperInterface = eSuperInterfaceToTSuperInterface.getTarget();
						if (tmpTSuperInterface instanceof TInterface) {
							TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
							_result.add(new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface,
									eSuperInterface, eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface,
									match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsInterface_2_3_findcontext_blackBBBBBBB(TClass tClass,
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
			if (eClassDeclaration.getSuperInterfaces().contains(eTypeAccess)) {
				if (tSuperInterface.equals(eSuperInterfaceToTSuperInterface.getTarget())) {
					if (eSuperInterface.equals(eTypeAccess.getType())) {
						if (eClassDeclaration.equals(eClassDeclarationToTClass.getSource())) {
							if (eSuperInterface.equals(eSuperInterfaceToTSuperInterface.getSource())) {
								if (tClass.equals(eClassDeclarationToTClass.getTarget())) {
									_result.add(new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface,
											eSuperInterface, eClassDeclarationToTClass,
											eSuperInterfaceToTSuperInterface });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_2_3_findcontext_greenBBBBBBBFFFFFFFF(TClass tClass,
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eClassDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		String eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime = "target";
		String eTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eClassDeclarationToTClass__eClassDeclaration____source_name_prime = "source";
		String eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime = "source";
		String eClassDeclarationToTClass__tClass____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface);
		eClassDeclaration__eTypeAccess____superInterfaces.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eClassDeclaration__eTypeAccess____superInterfaces);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setTrg(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__tSuperInterface____target);
		eTypeAccess__eSuperInterface____type.setSrc(eTypeAccess);
		eTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eTypeAccess__eSuperInterface____type);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eSuperInterface__eTypeAccess____usagesInTypeAccess);
		eClassDeclarationToTClass__eClassDeclaration____source.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__eClassDeclaration____source.setTrg(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__eClassDeclaration____source);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setTrg(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__eSuperInterface____source);
		eClassDeclarationToTClass__tClass____target.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__tClass____target);
		eClassDeclaration__eTypeAccess____superInterfaces
				.setName(eClassDeclaration__eTypeAccess____superInterfaces_name_prime);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target
				.setName(eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime);
		eTypeAccess__eSuperInterface____type.setName(eTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime);
		eClassDeclarationToTClass__eClassDeclaration____source
				.setName(eClassDeclarationToTClass__eClassDeclaration____source_name_prime);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source
				.setName(eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime);
		eClassDeclarationToTClass__tClass____target.setName(eClassDeclarationToTClass__tClass____target_name_prime);
		return new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface,
				eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface, isApplicableMatch,
				eClassDeclaration__eTypeAccess____superInterfaces,
				eSuperInterfaceToTSuperInterface__tSuperInterface____target, eTypeAccess__eSuperInterface____type,
				eSuperInterface__eTypeAccess____usagesInTypeAccess,
				eClassDeclarationToTClass__eClassDeclaration____source,
				eSuperInterfaceToTSuperInterface__eSuperInterface____source,
				eClassDeclarationToTClass__tClass____target };
	}

	public static final Object[] pattern_ClassImplementsInterface_2_4_solveCSP_bindingFBBBBBBBBB(
			ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch, TClass tClass,
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tClass, eClassDeclaration,
				eTypeAccess, tSuperInterface, eSuperInterface, eClassDeclarationToTClass,
				eSuperInterfaceToTSuperInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass, eClassDeclaration, eTypeAccess,
					tSuperInterface, eSuperInterface, eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsInterface_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch, TClass tClass,
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		Object[] result_pattern_ClassImplementsInterface_2_4_solveCSP_binding = pattern_ClassImplementsInterface_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface,
				eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface);
		if (result_pattern_ClassImplementsInterface_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsInterface_2_4_solveCSP_binding[0];

			Object[] result_pattern_ClassImplementsInterface_2_4_solveCSP_black = pattern_ClassImplementsInterface_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassImplementsInterface_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass, eClassDeclaration, eTypeAccess,
						tSuperInterface, eSuperInterface, eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsInterface_2_5_checkCSP_expressionFBB(
			ClassImplementsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassImplementsInterface_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassImplementsInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassImplementsInterface_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_10_1_initialbindings_blackBBBB(
			ClassImplementsInterface _this, Match match, TClass tClass, TInterface tSuperInterface) {
		return new Object[] { _this, match, tClass, tSuperInterface };
	}

	public static final Object[] pattern_ClassImplementsInterface_10_2_SolveCSP_bindingFBBBB(
			ClassImplementsInterface _this, Match match, TClass tClass, TInterface tSuperInterface) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tClass, tSuperInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tClass, tSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsInterface_10_2_SolveCSP_bindingAndBlackFBBBB(
			ClassImplementsInterface _this, Match match, TClass tClass, TInterface tSuperInterface) {
		Object[] result_pattern_ClassImplementsInterface_10_2_SolveCSP_binding = pattern_ClassImplementsInterface_10_2_SolveCSP_bindingFBBBB(
				_this, match, tClass, tSuperInterface);
		if (result_pattern_ClassImplementsInterface_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsInterface_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassImplementsInterface_10_2_SolveCSP_black = pattern_ClassImplementsInterface_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassImplementsInterface_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tClass, tSuperInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsInterface_10_3_CheckCSP_expressionFBB(
			ClassImplementsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_10_4_collectelementstobetranslated_blackBBB(
			Match match, TClass tClass, TInterface tSuperInterface) {
		return new Object[] { match, tClass, tSuperInterface };
	}

	public static final Object[] pattern_ClassImplementsInterface_10_4_collectelementstobetranslated_greenBBBFF(
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

	public static final Object[] pattern_ClassImplementsInterface_10_5_collectcontextelements_blackBBB(Match match,
			TClass tClass, TInterface tSuperInterface) {
		return new Object[] { match, tClass, tSuperInterface };
	}

	public static final Object[] pattern_ClassImplementsInterface_10_5_collectcontextelements_greenBBB(Match match,
			TClass tClass, TInterface tSuperInterface) {
		match.getContextNodes().add(tClass);
		match.getContextNodes().add(tSuperInterface);
		return new Object[] { match, tClass, tSuperInterface };
	}

	public static final void pattern_ClassImplementsInterface_10_6_registerobjectstomatch_expressionBBBB(
			ClassImplementsInterface _this, Match match, TClass tClass, TInterface tSuperInterface) {
		_this.registerObjectsToMatch_BWD(match, tClass, tSuperInterface);

	}

	public static final boolean pattern_ClassImplementsInterface_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassImplementsInterface_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("eClassDeclaration");
		EObject _localVariable_2 = isApplicableMatch.getObject("tSuperInterface");
		EObject _localVariable_3 = isApplicableMatch.getObject("eSuperInterface");
		EObject _localVariable_4 = isApplicableMatch.getObject("eClassDeclarationToTClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("eSuperInterfaceToTSuperInterface");
		EObject tmpTClass = _localVariable_0;
		EObject tmpEClassDeclaration = _localVariable_1;
		EObject tmpTSuperInterface = _localVariable_2;
		EObject tmpESuperInterface = _localVariable_3;
		EObject tmpEClassDeclarationToTClass = _localVariable_4;
		EObject tmpESuperInterfaceToTSuperInterface = _localVariable_5;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpEClassDeclaration instanceof ClassDeclaration) {
				ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
				if (tmpTSuperInterface instanceof TInterface) {
					TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
					if (tmpESuperInterface instanceof InterfaceDeclaration) {
						InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
						if (tmpEClassDeclarationToTClass instanceof TypeToTAbstractType) {
							TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) tmpEClassDeclarationToTClass;
							if (tmpESuperInterfaceToTSuperInterface instanceof TypeToTAbstractType) {
								TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) tmpESuperInterfaceToTSuperInterface;
								return new Object[] { tClass, eClassDeclaration, tSuperInterface, eSuperInterface,
										eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_11_1_performtransformation_blackBBBBBBFBB(
			TClass tClass, ClassDeclaration eClassDeclaration, TInterface tSuperInterface,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eClassDeclarationToTClass,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, ClassImplementsInterface _this,
			IsApplicableMatch isApplicableMatch) {
		if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { tClass, eClassDeclaration, tSuperInterface, eSuperInterface,
							eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassImplementsInterface_11_1_performtransformation_binding = pattern_ClassImplementsInterface_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassImplementsInterface_11_1_performtransformation_binding != null) {
			TClass tClass = (TClass) result_pattern_ClassImplementsInterface_11_1_performtransformation_binding[0];
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result_pattern_ClassImplementsInterface_11_1_performtransformation_binding[1];
			TInterface tSuperInterface = (TInterface) result_pattern_ClassImplementsInterface_11_1_performtransformation_binding[2];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result_pattern_ClassImplementsInterface_11_1_performtransformation_binding[3];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result_pattern_ClassImplementsInterface_11_1_performtransformation_binding[4];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result_pattern_ClassImplementsInterface_11_1_performtransformation_binding[5];

			Object[] result_pattern_ClassImplementsInterface_11_1_performtransformation_black = pattern_ClassImplementsInterface_11_1_performtransformation_blackBBBBBBFBB(
					tClass, eClassDeclaration, tSuperInterface, eSuperInterface, eClassDeclarationToTClass,
					eSuperInterfaceToTSuperInterface, _this, isApplicableMatch);
			if (result_pattern_ClassImplementsInterface_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassImplementsInterface_11_1_performtransformation_black[6];

				return new Object[] { tClass, eClassDeclaration, tSuperInterface, eSuperInterface,
						eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_11_1_performtransformation_greenBFB(
			ClassDeclaration eClassDeclaration, InterfaceDeclaration eSuperInterface) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		eClassDeclaration.getSuperInterfaces().add(eTypeAccess);
		eTypeAccess.setType(eSuperInterface);
		return new Object[] { eClassDeclaration, eTypeAccess, eSuperInterface };
	}

	public static final Object[] pattern_ClassImplementsInterface_11_2_collecttranslatedelements_blackB(
			TypeAccess eTypeAccess) {
		return new Object[] { eTypeAccess };
	}

	public static final Object[] pattern_ClassImplementsInterface_11_2_collecttranslatedelements_greenFB(
			TypeAccess eTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(eTypeAccess);
		return new Object[] { ruleresult, eTypeAccess };
	}

	public static final Object[] pattern_ClassImplementsInterface_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject tClass, EObject eClassDeclaration, EObject eTypeAccess,
			EObject tSuperInterface, EObject eSuperInterface, EObject eClassDeclarationToTClass,
			EObject eSuperInterfaceToTSuperInterface) {
		if (!tClass.equals(tSuperInterface)) {
			if (!eClassDeclaration.equals(tClass)) {
				if (!eClassDeclaration.equals(eTypeAccess)) {
					if (!eClassDeclaration.equals(tSuperInterface)) {
						if (!eClassDeclaration.equals(eSuperInterface)) {
							if (!eClassDeclaration.equals(eClassDeclarationToTClass)) {
								if (!eClassDeclaration.equals(eSuperInterfaceToTSuperInterface)) {
									if (!eTypeAccess.equals(tClass)) {
										if (!eTypeAccess.equals(tSuperInterface)) {
											if (!eSuperInterface.equals(tClass)) {
												if (!eSuperInterface.equals(eTypeAccess)) {
													if (!eSuperInterface.equals(tSuperInterface)) {
														if (!eSuperInterface.equals(eSuperInterfaceToTSuperInterface)) {
															if (!eClassDeclarationToTClass.equals(tClass)) {
																if (!eClassDeclarationToTClass.equals(eTypeAccess)) {
																	if (!eClassDeclarationToTClass
																			.equals(tSuperInterface)) {
																		if (!eClassDeclarationToTClass
																				.equals(eSuperInterface)) {
																			if (!eClassDeclarationToTClass.equals(
																					eSuperInterfaceToTSuperInterface)) {
																				if (!eSuperInterfaceToTSuperInterface
																						.equals(tClass)) {
																					if (!eSuperInterfaceToTSuperInterface
																							.equals(eTypeAccess)) {
																						if (!eSuperInterfaceToTSuperInterface
																								.equals(tSuperInterface)) {
																							return new Object[] {
																									ruleresult, tClass,
																									eClassDeclaration,
																									eTypeAccess,
																									tSuperInterface,
																									eSuperInterface,
																									eClassDeclarationToTClass,
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
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tClass, EObject eClassDeclaration, EObject eTypeAccess,
			EObject tSuperInterface, EObject eSuperInterface) {
		EMoflonEdge eClassDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tSuperInterface____implements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tClass____implementedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassImplementsInterface";
		String eClassDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		String eTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String tClass__tSuperInterface____implements_name_prime = "implements";
		String tSuperInterface__tClass____implementedBy_name_prime = "implementedBy";
		eClassDeclaration__eTypeAccess____superInterfaces.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		ruleresult.getCreatedEdges().add(eClassDeclaration__eTypeAccess____superInterfaces);
		eTypeAccess__eSuperInterface____type.setSrc(eTypeAccess);
		eTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		ruleresult.getCreatedEdges().add(eTypeAccess__eSuperInterface____type);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getCreatedEdges().add(eSuperInterface__eTypeAccess____usagesInTypeAccess);
		tClass__tSuperInterface____implements.setSrc(tClass);
		tClass__tSuperInterface____implements.setTrg(tSuperInterface);
		ruleresult.getTranslatedEdges().add(tClass__tSuperInterface____implements);
		tSuperInterface__tClass____implementedBy.setSrc(tSuperInterface);
		tSuperInterface__tClass____implementedBy.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(tSuperInterface__tClass____implementedBy);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eClassDeclaration__eTypeAccess____superInterfaces
				.setName(eClassDeclaration__eTypeAccess____superInterfaces_name_prime);
		eTypeAccess__eSuperInterface____type.setName(eTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime);
		tClass__tSuperInterface____implements.setName(tClass__tSuperInterface____implements_name_prime);
		tSuperInterface__tClass____implementedBy.setName(tSuperInterface__tClass____implementedBy_name_prime);
		return new Object[] { ruleresult, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface,
				eClassDeclaration__eTypeAccess____superInterfaces, eTypeAccess__eSuperInterface____type,
				eSuperInterface__eTypeAccess____usagesInTypeAccess, tClass__tSuperInterface____implements,
				tSuperInterface__tClass____implementedBy };
	}

	public static final void pattern_ClassImplementsInterface_11_5_registerobjects_expressionBBBBBBBBB(
			ClassImplementsInterface _this, PerformRuleResult ruleresult, EObject tClass, EObject eClassDeclaration,
			EObject eTypeAccess, EObject tSuperInterface, EObject eSuperInterface, EObject eClassDeclarationToTClass,
			EObject eSuperInterfaceToTSuperInterface) {
		_this.registerObjects_BWD(ruleresult, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface,
				eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface);

	}

	public static final PerformRuleResult pattern_ClassImplementsInterface_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_12_1_preparereturnvalue_bindingFB(
			ClassImplementsInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_12_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassImplementsInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_12_1_preparereturnvalue_bindingAndBlackFFB(
			ClassImplementsInterface _this) {
		Object[] result_pattern_ClassImplementsInterface_12_1_preparereturnvalue_binding = pattern_ClassImplementsInterface_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassImplementsInterface_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassImplementsInterface_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassImplementsInterface_12_1_preparereturnvalue_black = pattern_ClassImplementsInterface_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassImplementsInterface_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassImplementsInterface_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassImplementsInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassImplementsInterface_12_2_corematch_bindingFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_ClassImplementsInterface_12_2_corematch_blackBFBFFFB(TClass tClass,
			TInterface tSuperInterface, Match match) {
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

	public static final Iterable<Object[]> pattern_ClassImplementsInterface_12_3_findcontext_blackBBBBBB(TClass tClass,
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
			if (tSuperInterface.equals(eSuperInterfaceToTSuperInterface.getTarget())) {
				if (eClassDeclaration.equals(eClassDeclarationToTClass.getSource())) {
					if (eSuperInterface.equals(eSuperInterfaceToTSuperInterface.getSource())) {
						if (tClass.equals(eClassDeclarationToTClass.getTarget())) {
							if (tClass.getImplements().contains(tSuperInterface)) {
								_result.add(new Object[] { tClass, eClassDeclaration, tSuperInterface, eSuperInterface,
										eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_12_3_findcontext_greenBBBBBBFFFFFFF(TClass tClass,
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tSuperInterface____implements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tClass____implementedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime = "target";
		String eClassDeclarationToTClass__eClassDeclaration____source_name_prime = "source";
		String eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime = "source";
		String eClassDeclarationToTClass__tClass____target_name_prime = "target";
		String tClass__tSuperInterface____implements_name_prime = "implements";
		String tSuperInterface__tClass____implementedBy_name_prime = "implementedBy";
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setTrg(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__tSuperInterface____target);
		eClassDeclarationToTClass__eClassDeclaration____source.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__eClassDeclaration____source.setTrg(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__eClassDeclaration____source);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setTrg(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__eSuperInterface____source);
		eClassDeclarationToTClass__tClass____target.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__tClass____target);
		tClass__tSuperInterface____implements.setSrc(tClass);
		tClass__tSuperInterface____implements.setTrg(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(tClass__tSuperInterface____implements);
		tSuperInterface__tClass____implementedBy.setSrc(tSuperInterface);
		tSuperInterface__tClass____implementedBy.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(tSuperInterface__tClass____implementedBy);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target
				.setName(eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime);
		eClassDeclarationToTClass__eClassDeclaration____source
				.setName(eClassDeclarationToTClass__eClassDeclaration____source_name_prime);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source
				.setName(eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime);
		eClassDeclarationToTClass__tClass____target.setName(eClassDeclarationToTClass__tClass____target_name_prime);
		tClass__tSuperInterface____implements.setName(tClass__tSuperInterface____implements_name_prime);
		tSuperInterface__tClass____implementedBy.setName(tSuperInterface__tClass____implementedBy_name_prime);
		return new Object[] { tClass, eClassDeclaration, tSuperInterface, eSuperInterface, eClassDeclarationToTClass,
				eSuperInterfaceToTSuperInterface, isApplicableMatch,
				eSuperInterfaceToTSuperInterface__tSuperInterface____target,
				eClassDeclarationToTClass__eClassDeclaration____source,
				eSuperInterfaceToTSuperInterface__eSuperInterface____source,
				eClassDeclarationToTClass__tClass____target, tClass__tSuperInterface____implements,
				tSuperInterface__tClass____implementedBy };
	}

	public static final Object[] pattern_ClassImplementsInterface_12_4_solveCSP_bindingFBBBBBBBB(
			ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch, TClass tClass,
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tClass, eClassDeclaration,
				tSuperInterface, eSuperInterface, eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass, eClassDeclaration, tSuperInterface,
					eSuperInterface, eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsInterface_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch, TClass tClass,
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		Object[] result_pattern_ClassImplementsInterface_12_4_solveCSP_binding = pattern_ClassImplementsInterface_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, tClass, eClassDeclaration, tSuperInterface, eSuperInterface,
				eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface);
		if (result_pattern_ClassImplementsInterface_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsInterface_12_4_solveCSP_binding[0];

			Object[] result_pattern_ClassImplementsInterface_12_4_solveCSP_black = pattern_ClassImplementsInterface_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassImplementsInterface_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass, eClassDeclaration, tSuperInterface,
						eSuperInterface, eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsInterface_12_5_checkCSP_expressionFBB(
			ClassImplementsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassImplementsInterface_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassImplementsInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassImplementsInterface_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_20_1_preparereturnvalue_bindingFB(
			ClassImplementsInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassImplementsInterface _this) {
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

	public static final Object[] pattern_ClassImplementsInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassImplementsInterface _this) {
		Object[] result_pattern_ClassImplementsInterface_20_1_preparereturnvalue_binding = pattern_ClassImplementsInterface_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassImplementsInterface_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassImplementsInterface_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassImplementsInterface_20_1_preparereturnvalue_black = pattern_ClassImplementsInterface_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassImplementsInterface_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassImplementsInterface_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassImplementsInterface_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ClassImplementsInterface_20_2_testcorematchandDECs_blackFFB(
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

	public static final Object[] pattern_ClassImplementsInterface_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassImplementsInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ClassImplementsInterface _this, Match match, TClass tClass, TInterface tSuperInterface) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tClass, tSuperInterface);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassImplementsInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassImplementsInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassImplementsInterface_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_1_preparereturnvalue_bindingFB(
			ClassImplementsInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassImplementsInterface _this) {
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

	public static final Object[] pattern_ClassImplementsInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassImplementsInterface _this) {
		Object[] result_pattern_ClassImplementsInterface_21_1_preparereturnvalue_binding = pattern_ClassImplementsInterface_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassImplementsInterface_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassImplementsInterface_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassImplementsInterface_21_1_preparereturnvalue_black = pattern_ClassImplementsInterface_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassImplementsInterface_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassImplementsInterface_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassImplementsInterface_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_0B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_333017 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess eTypeAccess) {
		for (AnnotationTypeMemberDeclaration __DEC_eTypeAccess_type_564067 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_2B(
			TypeAccess eTypeAccess) {
		for (ArrayType __DEC_eTypeAccess_elementType_22888 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_800615 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_4BB(
			TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration) {
		for (ClassDeclaration __DEC_eTypeAccess_superClass_854231 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!eClassDeclaration.equals(__DEC_eTypeAccess_superClass_854231)) {
				return new Object[] { eTypeAccess, eClassDeclaration };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_22382 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess eTypeAccess) {
		for (ParameterizedType __DEC_eTypeAccess_type_551427 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ParameterizedType.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_553591 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_8B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_426475 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_9BB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess) {
		if (eTypeAccess.equals(eClassDeclaration.getSuperClass())) {
			return new Object[] { eClassDeclaration, eTypeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsInterface_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_superInterfaces) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEClassDeclaration = _edge_superInterfaces.getSrc();
		if (tmpEClassDeclaration instanceof ClassDeclaration) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
			EObject tmpETypeAccess = _edge_superInterfaces.getTrg();
			if (tmpETypeAccess instanceof TypeAccess) {
				TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
				if (eClassDeclaration.getSuperInterfaces().contains(eTypeAccess)) {
					Type tmpESuperInterface = eTypeAccess.getType();
					if (tmpESuperInterface instanceof InterfaceDeclaration) {
						InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
						if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_0B(
								eTypeAccess) == null) {
							if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_1B(
									eTypeAccess) == null) {
								if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_2B(
										eTypeAccess) == null) {
									if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_3B(
											eTypeAccess) == null) {
										if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_4BB(
												eTypeAccess, eClassDeclaration) == null) {
											if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_5B(
													eTypeAccess) == null) {
												if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_6B(
														eTypeAccess) == null) {
													if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_7B(
															eTypeAccess) == null) {
														if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_8B(
																eTypeAccess) == null) {
															if (pattern_ClassImplementsInterface_21_2_testcorematchandDECs_black_nac_9BB(
																	eClassDeclaration, eTypeAccess) == null) {
																_result.add(new Object[] { eClassDeclaration,
																		eTypeAccess, eSuperInterface,
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

		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassImplementsInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			ClassImplementsInterface _this, Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			InterfaceDeclaration eSuperInterface) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eClassDeclaration, eTypeAccess, eSuperInterface);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassImplementsInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassImplementsInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassImplementsInterface_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_24_1_prepare_blackB(ClassImplementsInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassImplementsInterface_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_bindingFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tClass");
		EObject _localVariable_1 = sourceMatch.getObject("eClassDeclaration");
		EObject _localVariable_2 = sourceMatch.getObject("eTypeAccess");
		EObject _localVariable_3 = targetMatch.getObject("tSuperInterface");
		EObject _localVariable_4 = sourceMatch.getObject("eSuperInterface");
		EObject tmpTClass = _localVariable_0;
		EObject tmpEClassDeclaration = _localVariable_1;
		EObject tmpETypeAccess = _localVariable_2;
		EObject tmpTSuperInterface = _localVariable_3;
		EObject tmpESuperInterface = _localVariable_4;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpEClassDeclaration instanceof ClassDeclaration) {
				ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
				if (tmpETypeAccess instanceof TypeAccess) {
					TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
					if (tmpTSuperInterface instanceof TInterface) {
						TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
						if (tmpESuperInterface instanceof InterfaceDeclaration) {
							InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
							return new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface,
									eSuperInterface, targetMatch, sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_blackBBBBBBB(TClass tClass,
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			InterfaceDeclaration eSuperInterface, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_binding = pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_bindingFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_binding != null) {
			TClass tClass = (TClass) result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_binding[0];
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_binding[1];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_binding[2];
			TInterface tSuperInterface = (TInterface) result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_binding[3];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_black = pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_blackBBBBBBB(
					tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface, sourceMatch, targetMatch);
			if (result_pattern_ClassImplementsInterface_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_24_3_solvecsp_bindingFBBBBBBBB(
			ClassImplementsInterface _this, TClass tClass, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			TInterface tSuperInterface, InterfaceDeclaration eSuperInterface, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(tClass, eClassDeclaration, eTypeAccess, tSuperInterface,
				eSuperInterface, sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsInterface_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			ClassImplementsInterface _this, TClass tClass, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			TInterface tSuperInterface, InterfaceDeclaration eSuperInterface, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ClassImplementsInterface_24_3_solvecsp_binding = pattern_ClassImplementsInterface_24_3_solvecsp_bindingFBBBBBBBB(
				_this, tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface, sourceMatch,
				targetMatch);
		if (result_pattern_ClassImplementsInterface_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsInterface_24_3_solvecsp_binding[0];

			Object[] result_pattern_ClassImplementsInterface_24_3_solvecsp_black = pattern_ClassImplementsInterface_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ClassImplementsInterface_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tClass, eClassDeclaration, eTypeAccess, tSuperInterface,
						eSuperInterface, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsInterface_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsInterface_24_5_matchcorrcontext_blackBBBBFFBB(
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

	public static final Object[] pattern_ClassImplementsInterface_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType eClassDeclarationToTClass, TypeToTAbstractType eSuperInterfaceToTSuperInterface,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ClassImplementsInterface";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eClassDeclarationToTClass);
		ccMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface, sourceMatch, targetMatch,
				ccMatch };
	}

	public static final Object[] pattern_ClassImplementsInterface_24_6_createcorrespondence_blackBBBBBB(TClass tClass,
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			InterfaceDeclaration eSuperInterface, CCMatch ccMatch) {
		return new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface, ccMatch };
	}

	public static final Object[] pattern_ClassImplementsInterface_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ClassImplementsInterface_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ClassImplementsInterface";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassImplementsInterface_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_0B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_794555 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_1B(
			TypeAccess eTypeAccess) {
		for (AnnotationTypeMemberDeclaration __DEC_eTypeAccess_type_972990 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_2B(
			TypeAccess eTypeAccess) {
		for (ArrayType __DEC_eTypeAccess_elementType_745765 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_3B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_186073 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_4BB(
			TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration) {
		for (ClassDeclaration __DEC_eTypeAccess_superClass_320301 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!eClassDeclaration.equals(__DEC_eTypeAccess_superClass_320301)) {
				return new Object[] { eTypeAccess, eClassDeclaration };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_5B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_649330 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_6B(
			TypeAccess eTypeAccess) {
		for (ParameterizedType __DEC_eTypeAccess_type_637377 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ParameterizedType.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_667611 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_8B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_243053 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_9BB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess) {
		if (eTypeAccess.equals(eClassDeclaration.getSuperClass())) {
			return new Object[] { eClassDeclaration, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_27_1_matchtggpattern_blackBBB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, InterfaceDeclaration eSuperInterface) {
		if (eClassDeclaration.getSuperInterfaces().contains(eTypeAccess)) {
			if (eSuperInterface.equals(eTypeAccess.getType())) {
				if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_0B(eTypeAccess) == null) {
					if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_1B(eTypeAccess) == null) {
						if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_2B(eTypeAccess) == null) {
							if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_3B(
									eTypeAccess) == null) {
								if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_4BB(eTypeAccess,
										eClassDeclaration) == null) {
									if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_5B(
											eTypeAccess) == null) {
										if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_6B(
												eTypeAccess) == null) {
											if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_7B(
													eTypeAccess) == null) {
												if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_8B(
														eTypeAccess) == null) {
													if (pattern_ClassImplementsInterface_27_1_matchtggpattern_black_nac_9BB(
															eClassDeclaration, eTypeAccess) == null) {
														return new Object[] { eClassDeclaration, eTypeAccess,
																eSuperInterface };
													}
												}
											}
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

	public static final boolean pattern_ClassImplementsInterface_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassImplementsInterface_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_28_1_matchtggpattern_blackBB(TClass tClass,
			TInterface tSuperInterface) {
		if (tClass.getImplements().contains(tSuperInterface)) {
			return new Object[] { tClass, tSuperInterface };
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsInterface_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassImplementsInterface_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_1_createresult_blackB(
			ClassImplementsInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassImplementsInterface_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TClass tClass) {
		if (ruleResult.getTargetObjects().contains(tClass)) {
			return new Object[] { ruleResult, tClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eClassDeclarationToTClass) {
		if (ruleResult.getCorrObjects().contains(eClassDeclarationToTClass)) {
			return new Object[] { ruleResult, eClassDeclarationToTClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ClassDeclaration eClassDeclaration) {
		if (ruleResult.getSourceObjects().contains(eClassDeclaration)) {
			return new Object[] { ruleResult, eClassDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TInterface tSuperInterface) {
		if (ruleResult.getTargetObjects().contains(tSuperInterface)) {
			return new Object[] { ruleResult, tSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		if (ruleResult.getCorrObjects().contains(eSuperInterfaceToTSuperInterface)) {
			return new Object[] { ruleResult, eSuperInterfaceToTSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, InterfaceDeclaration eSuperInterface) {
		if (ruleResult.getSourceObjects().contains(eSuperInterface)) {
			return new Object[] { ruleResult, eSuperInterface };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassImplementsInterface_29_2_isapplicablecore_blackFFFFFFFFBB(
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
									if (pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											eClassDeclarationToTClass) == null) {
										if (pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, tClass) == null) {
											if (pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_2BB(
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
																	if (pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult,
																			eSuperInterfaceToTSuperInterface) == null) {
																		if (pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, tSuperInterface) == null) {
																			if (pattern_ClassImplementsInterface_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult,
																					eSuperInterface) == null) {
																				_result.add(new Object[] {
																						eClassDeclarationToTClassList,
																						tClass,
																						eClassDeclarationToTClass,
																						eClassDeclaration,
																						eSuperInterfaceToTSuperInterfaceList,
																						tSuperInterface,
																						eSuperInterfaceToTSuperInterface,
																						eSuperInterface,
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

	public static final Object[] pattern_ClassImplementsInterface_29_3_solveCSP_bindingFBBBBBBBBB(
			ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch, TClass tClass,
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, TypeToTAbstractType eSuperInterfaceToTSuperInterface,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tClass, eClassDeclaration,
				tSuperInterface, eSuperInterface, eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass, eClassDeclaration, tSuperInterface,
					eSuperInterface, eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassImplementsInterface_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			ClassImplementsInterface _this, IsApplicableMatch isApplicableMatch, TClass tClass,
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, TypeToTAbstractType eSuperInterfaceToTSuperInterface,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ClassImplementsInterface_29_3_solveCSP_binding = pattern_ClassImplementsInterface_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tClass, eClassDeclaration, tSuperInterface, eSuperInterface,
				eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface, ruleResult);
		if (result_pattern_ClassImplementsInterface_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassImplementsInterface_29_3_solveCSP_binding[0];

			Object[] result_pattern_ClassImplementsInterface_29_3_solveCSP_black = pattern_ClassImplementsInterface_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ClassImplementsInterface_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass, eClassDeclaration, tSuperInterface,
						eSuperInterface, eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassImplementsInterface_29_4_checkCSP_expressionFBB(
			ClassImplementsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_5_checknacs_blackBBBBBB(TClass tClass,
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
			return new Object[] { tClass, eClassDeclaration, tSuperInterface, eSuperInterface,
					eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_6_perform_blackBBBBBBB(TClass tClass,
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eClassDeclarationToTClass, TypeToTAbstractType eSuperInterfaceToTSuperInterface,
			ModelgeneratorRuleResult ruleResult) {
		if (!eClassDeclarationToTClass.equals(eSuperInterfaceToTSuperInterface)) {
			return new Object[] { tClass, eClassDeclaration, tSuperInterface, eSuperInterface,
					eClassDeclarationToTClass, eSuperInterfaceToTSuperInterface, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ClassImplementsInterface_29_6_perform_greenBBFBBB(TClass tClass,
			ClassDeclaration eClassDeclaration, TInterface tSuperInterface, InterfaceDeclaration eSuperInterface,
			ModelgeneratorRuleResult ruleResult) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		tClass.getImplements().add(tSuperInterface);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		eClassDeclaration.getSuperInterfaces().add(eTypeAccess);
		eTypeAccess.setType(eSuperInterface);
		ruleResult.getSourceObjects().add(eTypeAccess);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tClass, eClassDeclaration, eTypeAccess, tSuperInterface, eSuperInterface, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ClassImplementsInterface_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ClassImplementsInterfaceImpl
