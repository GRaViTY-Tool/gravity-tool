/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.AnnotationTypeMemberDeclaration;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.Rules.ClassExtendsClass;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;

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
 * An implementation of the model object '<em><b>Class Extends Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClassExtendsClassImpl extends AbstractRuleImpl implements ClassExtendsClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassExtendsClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getClassExtendsClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			ClassDeclaration eExtendedClass) {

		Object[] result1_black = ClassExtendsClassImpl.pattern_ClassExtendsClass_0_1_initialbindings_blackBBBBB(this,
				match, eClassDeclaration, eTypeAccess, eExtendedClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eExtendedClass] = " + eExtendedClass + ".");
		}

		Object[] result2_bindingAndBlack = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, eClassDeclaration,
						eTypeAccess, eExtendedClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eExtendedClass] = " + eExtendedClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassExtendsClassImpl.pattern_ClassExtendsClass_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassExtendsClassImpl
					.pattern_ClassExtendsClass_0_4_collectelementstobetranslated_blackBBBB(match, eClassDeclaration,
							eTypeAccess, eExtendedClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
						+ "[eExtendedClass] = " + eExtendedClass + ".");
			}
			ClassExtendsClassImpl.pattern_ClassExtendsClass_0_4_collectelementstobetranslated_greenBBBBFFF(match,
					eClassDeclaration, eTypeAccess, eExtendedClass);
			//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superClass = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge eTypeAccess__eExtendedClass____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge eExtendedClass__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[6];

			Object[] result5_black = ClassExtendsClassImpl
					.pattern_ClassExtendsClass_0_5_collectcontextelements_blackBBBB(match, eClassDeclaration,
							eTypeAccess, eExtendedClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
						+ "[eExtendedClass] = " + eExtendedClass + ".");
			}
			ClassExtendsClassImpl.pattern_ClassExtendsClass_0_5_collectcontextelements_greenBBB(match,
					eClassDeclaration, eExtendedClass);

			// 
			ClassExtendsClassImpl.pattern_ClassExtendsClass_0_6_registerobjectstomatch_expressionBBBBB(this, match,
					eClassDeclaration, eTypeAccess, eExtendedClass);
			return ClassExtendsClassImpl.pattern_ClassExtendsClass_0_7_expressionF();
		} else {
			return ClassExtendsClassImpl.pattern_ClassExtendsClass_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result1_bindingAndBlack[0];
		TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TClass tClass = (TClass) result1_bindingAndBlack[2];
		TClass tExtendedClass = (TClass) result1_bindingAndBlack[3];
		TypeAccess eTypeAccess = (TypeAccess) result1_bindingAndBlack[4];
		ClassDeclaration eExtendedClass = (ClassDeclaration) result1_bindingAndBlack[5];
		TypeToTAbstractType eExtendedClassToTExtendedClass = (TypeToTAbstractType) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		ClassExtendsClassImpl.pattern_ClassExtendsClass_1_1_performtransformation_greenBB(tClass, tExtendedClass);

		Object[] result2_black = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_1_2_collecttranslatedelements_blackB(eTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[eTypeAccess] = " + eTypeAccess + ".");
		}
		Object[] result2_green = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_1_2_collecttranslatedelements_greenFB(eTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassExtendsClassImpl.pattern_ClassExtendsClass_1_3_bookkeepingforedges_blackBBBBBBBB(
				ruleresult, eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass, eTypeAccess,
				eExtendedClass, eExtendedClassToTExtendedClass);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eClassDeclaration] = " + eClassDeclaration + ", " + "[eClassDeclarationToTClass] = "
					+ eClassDeclarationToTClass + ", " + "[tClass] = " + tClass + ", " + "[tExtendedClass] = "
					+ tExtendedClass + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eExtendedClass] = "
					+ eExtendedClass + ", " + "[eExtendedClassToTExtendedClass] = " + eExtendedClassToTExtendedClass
					+ ".");
		}
		ClassExtendsClassImpl.pattern_ClassExtendsClass_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				eClassDeclaration, tClass, tExtendedClass, eTypeAccess, eExtendedClass);
		//nothing EMoflonEdge tClass__tExtendedClass____parentClasses = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tExtendedClass__tClass____childClasses = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superClass = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge eTypeAccess__eExtendedClass____type = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eExtendedClass__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[10];

		// 
		// 
		ClassExtendsClassImpl.pattern_ClassExtendsClass_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
				eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass, eTypeAccess, eExtendedClass,
				eExtendedClassToTExtendedClass);
		return ClassExtendsClassImpl.pattern_ClassExtendsClass_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassExtendsClassImpl.pattern_ClassExtendsClass_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_binding[0];
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[1];
		ClassDeclaration eExtendedClass = (ClassDeclaration) result2_binding[2];
		for (Object[] result2_black : ClassExtendsClassImpl.pattern_ClassExtendsClass_2_2_corematch_blackBFFFBBFB(
				eClassDeclaration, eTypeAccess, eExtendedClass, match)) {
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result2_black[1];
			TClass tClass = (TClass) result2_black[2];
			TClass tExtendedClass = (TClass) result2_black[3];
			TypeToTAbstractType eExtendedClassToTExtendedClass = (TypeToTAbstractType) result2_black[6];
			// ForEach 
			for (Object[] result3_black : ClassExtendsClassImpl.pattern_ClassExtendsClass_2_3_findcontext_blackBBBBBBB(
					eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass, eTypeAccess, eExtendedClass,
					eExtendedClassToTExtendedClass)) {
				Object[] result3_green = ClassExtendsClassImpl
						.pattern_ClassExtendsClass_2_3_findcontext_greenBBBBBBBFFFFFFFF(eClassDeclaration,
								eClassDeclarationToTClass, tClass, tExtendedClass, eTypeAccess, eExtendedClass,
								eExtendedClassToTExtendedClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge eClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superClass = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eTypeAccess__eExtendedClass____type = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eExtendedClass__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge eExtendedClassToTExtendedClass__tExtendedClass____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge eExtendedClassToTExtendedClass__eExtendedClass____source = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = ClassExtendsClassImpl
						.pattern_ClassExtendsClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass, eTypeAccess,
								eExtendedClass, eExtendedClassToTExtendedClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eClassDeclaration] = "
							+ eClassDeclaration + ", " + "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass
							+ ", " + "[tClass] = " + tClass + ", " + "[tExtendedClass] = " + tExtendedClass + ", "
							+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eExtendedClass] = " + eExtendedClass + ", "
							+ "[eExtendedClassToTExtendedClass] = " + eExtendedClassToTExtendedClass + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassExtendsClassImpl.pattern_ClassExtendsClass_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ClassExtendsClassImpl
							.pattern_ClassExtendsClass_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassExtendsClassImpl.pattern_ClassExtendsClass_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ClassExtendsClassImpl.pattern_ClassExtendsClass_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			ClassDeclaration eExtendedClass) {
		match.registerObject("eClassDeclaration", eClassDeclaration);
		match.registerObject("eTypeAccess", eTypeAccess);
		match.registerObject("eExtendedClass", eExtendedClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			ClassDeclaration eExtendedClass) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eClassDeclarationToTClass, TClass tClass, TClass tExtendedClass, TypeAccess eTypeAccess,
			ClassDeclaration eExtendedClass, TypeToTAbstractType eExtendedClassToTExtendedClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eClassDeclaration", eClassDeclaration);
		isApplicableMatch.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("tExtendedClass", tExtendedClass);
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
		isApplicableMatch.registerObject("eExtendedClass", eExtendedClass);
		isApplicableMatch.registerObject("eExtendedClassToTExtendedClass", eExtendedClassToTExtendedClass);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eClassDeclaration,
			EObject eClassDeclarationToTClass, EObject tClass, EObject tExtendedClass, EObject eTypeAccess,
			EObject eExtendedClass, EObject eExtendedClassToTExtendedClass) {
		ruleresult.registerObject("eClassDeclaration", eClassDeclaration);
		ruleresult.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("tExtendedClass", tExtendedClass);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("eExtendedClass", eExtendedClass);
		ruleresult.registerObject("eExtendedClassToTExtendedClass", eExtendedClassToTExtendedClass);

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
	public boolean isAppropriate_BWD(Match match, TClass tClass, TClass tExtendedClass) {

		Object[] result1_black = ClassExtendsClassImpl.pattern_ClassExtendsClass_10_1_initialbindings_blackBBBB(this,
				match, tClass, tExtendedClass);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tClass] = " + tClass + ", " + "[tExtendedClass] = " + tExtendedClass + ".");
		}

		Object[] result2_bindingAndBlack = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tClass, tExtendedClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tClass] = " + tClass + ", " + "[tExtendedClass] = " + tExtendedClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassExtendsClassImpl.pattern_ClassExtendsClass_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassExtendsClassImpl
					.pattern_ClassExtendsClass_10_4_collectelementstobetranslated_blackBBB(match, tClass,
							tExtendedClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[tExtendedClass] = " + tExtendedClass + ".");
			}
			ClassExtendsClassImpl.pattern_ClassExtendsClass_10_4_collectelementstobetranslated_greenBBBFF(match, tClass,
					tExtendedClass);
			//nothing EMoflonEdge tClass__tExtendedClass____parentClasses = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tExtendedClass__tClass____childClasses = (EMoflonEdge) result4_green[4];

			Object[] result5_black = ClassExtendsClassImpl
					.pattern_ClassExtendsClass_10_5_collectcontextelements_blackBBB(match, tClass, tExtendedClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[tExtendedClass] = " + tExtendedClass + ".");
			}
			ClassExtendsClassImpl.pattern_ClassExtendsClass_10_5_collectcontextelements_greenBBB(match, tClass,
					tExtendedClass);

			// 
			ClassExtendsClassImpl.pattern_ClassExtendsClass_10_6_registerobjectstomatch_expressionBBBB(this, match,
					tClass, tExtendedClass);
			return ClassExtendsClassImpl.pattern_ClassExtendsClass_10_7_expressionF();
		} else {
			return ClassExtendsClassImpl.pattern_ClassExtendsClass_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result1_bindingAndBlack[0];
		TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TClass tClass = (TClass) result1_bindingAndBlack[2];
		TClass tExtendedClass = (TClass) result1_bindingAndBlack[3];
		ClassDeclaration eExtendedClass = (ClassDeclaration) result1_bindingAndBlack[4];
		TypeToTAbstractType eExtendedClassToTExtendedClass = (TypeToTAbstractType) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_11_1_performtransformation_greenBFB(eClassDeclaration, eExtendedClass);
		TypeAccess eTypeAccess = (TypeAccess) result1_green[1];

		Object[] result2_black = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_11_2_collecttranslatedelements_blackB(eTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[eTypeAccess] = " + eTypeAccess + ".");
		}
		Object[] result2_green = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_11_2_collecttranslatedelements_greenFB(eTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassExtendsClassImpl.pattern_ClassExtendsClass_11_3_bookkeepingforedges_blackBBBBBBBB(
				ruleresult, eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass, eTypeAccess,
				eExtendedClass, eExtendedClassToTExtendedClass);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eClassDeclaration] = " + eClassDeclaration + ", " + "[eClassDeclarationToTClass] = "
					+ eClassDeclarationToTClass + ", " + "[tClass] = " + tClass + ", " + "[tExtendedClass] = "
					+ tExtendedClass + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eExtendedClass] = "
					+ eExtendedClass + ", " + "[eExtendedClassToTExtendedClass] = " + eExtendedClassToTExtendedClass
					+ ".");
		}
		ClassExtendsClassImpl.pattern_ClassExtendsClass_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				eClassDeclaration, tClass, tExtendedClass, eTypeAccess, eExtendedClass);
		//nothing EMoflonEdge tClass__tExtendedClass____parentClasses = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tExtendedClass__tClass____childClasses = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superClass = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge eTypeAccess__eExtendedClass____type = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eExtendedClass__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[10];

		// 
		// 
		ClassExtendsClassImpl.pattern_ClassExtendsClass_11_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
				eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass, eTypeAccess, eExtendedClass,
				eExtendedClassToTExtendedClass);
		return ClassExtendsClassImpl.pattern_ClassExtendsClass_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassExtendsClassImpl.pattern_ClassExtendsClass_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tClass = (TClass) result2_binding[0];
		TClass tExtendedClass = (TClass) result2_binding[1];
		for (Object[] result2_black : ClassExtendsClassImpl
				.pattern_ClassExtendsClass_12_2_corematch_blackFFBBFFB(tClass, tExtendedClass, match)) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_black[0];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result2_black[1];
			ClassDeclaration eExtendedClass = (ClassDeclaration) result2_black[4];
			TypeToTAbstractType eExtendedClassToTExtendedClass = (TypeToTAbstractType) result2_black[5];
			// ForEach 
			for (Object[] result3_black : ClassExtendsClassImpl.pattern_ClassExtendsClass_12_3_findcontext_blackBBBBBB(
					eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass, eExtendedClass,
					eExtendedClassToTExtendedClass)) {
				Object[] result3_green = ClassExtendsClassImpl
						.pattern_ClassExtendsClass_12_3_findcontext_greenBBBBBBFFFFFFF(eClassDeclaration,
								eClassDeclarationToTClass, tClass, tExtendedClass, eExtendedClass,
								eExtendedClassToTExtendedClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge tClass__tExtendedClass____parentClasses = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge tExtendedClass__tClass____childClasses = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eExtendedClassToTExtendedClass__tExtendedClass____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eExtendedClassToTExtendedClass__eExtendedClass____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = ClassExtendsClassImpl
						.pattern_ClassExtendsClass_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass, eExtendedClass,
								eExtendedClassToTExtendedClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eClassDeclaration] = "
							+ eClassDeclaration + ", " + "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass
							+ ", " + "[tClass] = " + tClass + ", " + "[tExtendedClass] = " + tExtendedClass + ", "
							+ "[eExtendedClass] = " + eExtendedClass + ", " + "[eExtendedClassToTExtendedClass] = "
							+ eExtendedClassToTExtendedClass + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassExtendsClassImpl.pattern_ClassExtendsClass_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ClassExtendsClassImpl
							.pattern_ClassExtendsClass_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassExtendsClassImpl.pattern_ClassExtendsClass_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ClassExtendsClassImpl.pattern_ClassExtendsClass_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tClass, TClass tExtendedClass) {
		match.registerObject("tClass", tClass);
		match.registerObject("tExtendedClass", tExtendedClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tClass, TClass tExtendedClass) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eClassDeclarationToTClass, TClass tClass, TClass tExtendedClass,
			ClassDeclaration eExtendedClass, TypeToTAbstractType eExtendedClassToTExtendedClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eClassDeclaration", eClassDeclaration);
		isApplicableMatch.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("tExtendedClass", tExtendedClass);
		isApplicableMatch.registerObject("eExtendedClass", eExtendedClass);
		isApplicableMatch.registerObject("eExtendedClassToTExtendedClass", eExtendedClassToTExtendedClass);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject eClassDeclaration,
			EObject eClassDeclarationToTClass, EObject tClass, EObject tExtendedClass, EObject eTypeAccess,
			EObject eExtendedClass, EObject eExtendedClassToTExtendedClass) {
		ruleresult.registerObject("eClassDeclaration", eClassDeclaration);
		ruleresult.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("tExtendedClass", tExtendedClass);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("eExtendedClass", eExtendedClass);
		ruleresult.registerObject("eExtendedClassToTExtendedClass", eExtendedClassToTExtendedClass);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_44(EMoflonEdge _edge_parentClasses) {

		Object[] result1_bindingAndBlack = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassExtendsClassImpl.pattern_ClassExtendsClass_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassExtendsClassImpl
				.pattern_ClassExtendsClass_20_2_testcorematchandDECs_blackFFB(_edge_parentClasses)) {
			TClass tClass = (TClass) result2_black[0];
			TClass tExtendedClass = (TClass) result2_black[1];
			Object[] result2_green = ClassExtendsClassImpl
					.pattern_ClassExtendsClass_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassExtendsClassImpl
					.pattern_ClassExtendsClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, tClass, tExtendedClass)) {
				// 
				if (ClassExtendsClassImpl
						.pattern_ClassExtendsClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ClassExtendsClassImpl
							.pattern_ClassExtendsClass_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassExtendsClassImpl.pattern_ClassExtendsClass_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassExtendsClassImpl.pattern_ClassExtendsClass_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_47(EMoflonEdge _edge_superClass) {

		Object[] result1_bindingAndBlack = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassExtendsClassImpl.pattern_ClassExtendsClass_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassExtendsClassImpl
				.pattern_ClassExtendsClass_21_2_testcorematchandDECs_blackFFFB(_edge_superClass)) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_black[0];
			TypeAccess eTypeAccess = (TypeAccess) result2_black[1];
			ClassDeclaration eExtendedClass = (ClassDeclaration) result2_black[2];
			Object[] result2_green = ClassExtendsClassImpl
					.pattern_ClassExtendsClass_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassExtendsClassImpl
					.pattern_ClassExtendsClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, eClassDeclaration, eTypeAccess, eExtendedClass)) {
				// 
				if (ClassExtendsClassImpl
						.pattern_ClassExtendsClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ClassExtendsClassImpl
							.pattern_ClassExtendsClass_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassExtendsClassImpl.pattern_ClassExtendsClass_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassExtendsClassImpl.pattern_ClassExtendsClass_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ClassExtendsClass");
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
		ruleResult.setRule("ClassExtendsClass");
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

		Object[] result1_black = ClassExtendsClassImpl.pattern_ClassExtendsClass_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassExtendsClassImpl.pattern_ClassExtendsClass_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_bindingAndBlack[0];
		TClass tClass = (TClass) result2_bindingAndBlack[1];
		TClass tExtendedClass = (TClass) result2_bindingAndBlack[2];
		TypeAccess eTypeAccess = (TypeAccess) result2_bindingAndBlack[3];
		ClassDeclaration eExtendedClass = (ClassDeclaration) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, eClassDeclaration, tClass,
						tExtendedClass, eTypeAccess, eExtendedClass, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[tClass] = " + tClass + ", "
					+ "[tExtendedClass] = " + tExtendedClass + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
					+ "[eExtendedClass] = " + eExtendedClass + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ClassExtendsClassImpl.pattern_ClassExtendsClass_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ClassExtendsClassImpl
					.pattern_ClassExtendsClass_24_5_matchcorrcontext_blackBFBBBFBB(eClassDeclaration, tClass,
							tExtendedClass, eExtendedClass, sourceMatch, targetMatch)) {
				TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result5_black[1];
				TypeToTAbstractType eExtendedClassToTExtendedClass = (TypeToTAbstractType) result5_black[5];
				Object[] result5_green = ClassExtendsClassImpl
						.pattern_ClassExtendsClass_24_5_matchcorrcontext_greenBBBBF(eClassDeclarationToTClass,
								eExtendedClassToTExtendedClass, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = ClassExtendsClassImpl
						.pattern_ClassExtendsClass_24_6_createcorrespondence_blackBBBBBB(eClassDeclaration, tClass,
								tExtendedClass, eTypeAccess, eExtendedClass, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eClassDeclaration] = "
							+ eClassDeclaration + ", " + "[tClass] = " + tClass + ", " + "[tExtendedClass] = "
							+ tExtendedClass + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eExtendedClass] = "
							+ eExtendedClass + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = ClassExtendsClassImpl
						.pattern_ClassExtendsClass_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ClassExtendsClassImpl.pattern_ClassExtendsClass_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return ClassExtendsClassImpl.pattern_ClassExtendsClass_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(ClassDeclaration eClassDeclaration, TClass tClass, TClass tExtendedClass,
			TypeAccess eTypeAccess, ClassDeclaration eExtendedClass, Match sourceMatch, Match targetMatch) {// Create CSP
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
			ClassDeclaration eExtendedClass) {// 
		Object[] result1_black = ClassExtendsClassImpl.pattern_ClassExtendsClass_27_1_matchtggpattern_blackBBB(
				eClassDeclaration, eTypeAccess, eExtendedClass);
		if (result1_black != null) {
			return ClassExtendsClassImpl.pattern_ClassExtendsClass_27_2_expressionF();
		} else {
			return ClassExtendsClassImpl.pattern_ClassExtendsClass_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tClass, TClass tExtendedClass) {// 
		Object[] result1_black = ClassExtendsClassImpl.pattern_ClassExtendsClass_28_1_matchtggpattern_blackBB(tClass,
				tExtendedClass);
		if (result1_black != null) {
			return ClassExtendsClassImpl.pattern_ClassExtendsClass_28_2_expressionF();
		} else {
			return ClassExtendsClassImpl.pattern_ClassExtendsClass_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType eClassDeclarationToTClassParameter,
			TypeToTAbstractType eExtendedClassToTExtendedClassParameter) {

		Object[] result1_black = ClassExtendsClassImpl.pattern_ClassExtendsClass_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassExtendsClassImpl.pattern_ClassExtendsClass_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ClassExtendsClassImpl
				.pattern_ClassExtendsClass_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList eClassDeclarationToTClassList = (RuleEntryList) result2_black[0];
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_black[1];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result2_black[2];
			TClass tClass = (TClass) result2_black[3];
			//nothing RuleEntryList eExtendedClassToTExtendedClassList = (RuleEntryList) result2_black[4];
			TClass tExtendedClass = (TClass) result2_black[5];
			TypeToTAbstractType eExtendedClassToTExtendedClass = (TypeToTAbstractType) result2_black[6];
			ClassDeclaration eExtendedClass = (ClassDeclaration) result2_black[7];

			Object[] result3_bindingAndBlack = ClassExtendsClassImpl
					.pattern_ClassExtendsClass_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass, eExtendedClass,
							eExtendedClassToTExtendedClass, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eClassDeclaration] = "
						+ eClassDeclaration + ", " + "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass + ", "
						+ "[tClass] = " + tClass + ", " + "[tExtendedClass] = " + tExtendedClass + ", "
						+ "[eExtendedClass] = " + eExtendedClass + ", " + "[eExtendedClassToTExtendedClass] = "
						+ eExtendedClassToTExtendedClass + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ClassExtendsClassImpl.pattern_ClassExtendsClass_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ClassExtendsClassImpl.pattern_ClassExtendsClass_29_5_checknacs_blackBBBBBB(
						eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass, eExtendedClass,
						eExtendedClassToTExtendedClass);
				if (result5_black != null) {

					Object[] result6_black = ClassExtendsClassImpl.pattern_ClassExtendsClass_29_6_perform_blackBBBBBBB(
							eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass, eExtendedClass,
							eExtendedClassToTExtendedClass, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[eClassDeclarationToTClass] = "
								+ eClassDeclarationToTClass + ", " + "[tClass] = " + tClass + ", "
								+ "[tExtendedClass] = " + tExtendedClass + ", " + "[eExtendedClass] = " + eExtendedClass
								+ ", " + "[eExtendedClassToTExtendedClass] = " + eExtendedClassToTExtendedClass + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					ClassExtendsClassImpl.pattern_ClassExtendsClass_29_6_perform_greenBBBFBB(eClassDeclaration, tClass,
							tExtendedClass, eExtendedClass, ruleResult);
					//nothing TypeAccess eTypeAccess = (TypeAccess) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return ClassExtendsClassImpl.pattern_ClassExtendsClass_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eClassDeclarationToTClass, TClass tClass, TClass tExtendedClass,
			ClassDeclaration eExtendedClass, TypeToTAbstractType eExtendedClassToTExtendedClass,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eClassDeclaration", eClassDeclaration);
		isApplicableMatch.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("tExtendedClass", tExtendedClass);
		isApplicableMatch.registerObject("eExtendedClass", eExtendedClass);
		isApplicableMatch.registerObject("eExtendedClassToTExtendedClass", eExtendedClassToTExtendedClass);
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
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPROPRIATE_FWD__MATCH_CLASSDECLARATION_TYPEACCESS_CLASSDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (ClassDeclaration) arguments.get(3));
		case RulesPackage.CLASS_EXTENDS_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSDECLARATION_TYPEACCESS_CLASSDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (ClassDeclaration) arguments.get(3));
			return null;
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSDECLARATION_TYPEACCESS_CLASSDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (ClassDeclaration) arguments.get(3));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASSDECLARATION_TYPETOTABSTRACTTYPE_TCLASS_TCLASS_TYPEACCESS_CLASSDECLARATION_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TClass) arguments.get(3), (TClass) arguments.get(4),
					(TypeAccess) arguments.get(5), (ClassDeclaration) arguments.get(6),
					(TypeToTAbstractType) arguments.get(7));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.CLASS_EXTENDS_CLASS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPROPRIATE_BWD__MATCH_TCLASS_TCLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TClass) arguments.get(2));
		case RulesPackage.CLASS_EXTENDS_CLASS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TCLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TClass) arguments.get(2));
			return null;
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TCLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TClass) arguments.get(2));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDECLARATION_TYPETOTABSTRACTTYPE_TCLASS_TCLASS_CLASSDECLARATION_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TClass) arguments.get(3), (TClass) arguments.get(4),
					(ClassDeclaration) arguments.get(5), (TypeToTAbstractType) arguments.get(6));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.CLASS_EXTENDS_CLASS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_44__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_44((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_47__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_47((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__CLASSDECLARATION_TCLASS_TCLASS_TYPEACCESS_CLASSDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((ClassDeclaration) arguments.get(0), (TClass) arguments.get(1),
					(TClass) arguments.get(2), (TypeAccess) arguments.get(3), (ClassDeclaration) arguments.get(4),
					(Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___CHECK_DEC_FWD__CLASSDECLARATION_TYPEACCESS_CLASSDECLARATION:
			return checkDEC_FWD((ClassDeclaration) arguments.get(0), (TypeAccess) arguments.get(1),
					(ClassDeclaration) arguments.get(2));
		case RulesPackage.CLASS_EXTENDS_CLASS___CHECK_DEC_BWD__TCLASS_TCLASS:
			return checkDEC_BWD((TClass) arguments.get(0), (TClass) arguments.get(1));
		case RulesPackage.CLASS_EXTENDS_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.CLASS_EXTENDS_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDECLARATION_TYPETOTABSTRACTTYPE_TCLASS_TCLASS_CLASSDECLARATION_TYPETOTABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TClass) arguments.get(3), (TClass) arguments.get(4),
					(ClassDeclaration) arguments.get(5), (TypeToTAbstractType) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.CLASS_EXTENDS_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ClassExtendsClass_0_1_initialbindings_blackBBBBB(ClassExtendsClass _this,
			Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, ClassDeclaration eExtendedClass) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			return new Object[] { _this, match, eClassDeclaration, eTypeAccess, eExtendedClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_0_2_SolveCSP_bindingFBBBBB(ClassExtendsClass _this,
			Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, ClassDeclaration eExtendedClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eClassDeclaration, eTypeAccess, eExtendedClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eClassDeclaration, eTypeAccess, eExtendedClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassExtendsClass_0_2_SolveCSP_bindingAndBlackFBBBBB(ClassExtendsClass _this,
			Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, ClassDeclaration eExtendedClass) {
		Object[] result_pattern_ClassExtendsClass_0_2_SolveCSP_binding = pattern_ClassExtendsClass_0_2_SolveCSP_bindingFBBBBB(
				_this, match, eClassDeclaration, eTypeAccess, eExtendedClass);
		if (result_pattern_ClassExtendsClass_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassExtendsClass_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassExtendsClass_0_2_SolveCSP_black = pattern_ClassExtendsClass_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassExtendsClass_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eClassDeclaration, eTypeAccess, eExtendedClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassExtendsClass_0_3_CheckCSP_expressionFBB(ClassExtendsClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_0_4_collectelementstobetranslated_blackBBBB(Match match,
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, ClassDeclaration eExtendedClass) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			return new Object[] { match, eClassDeclaration, eTypeAccess, eExtendedClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_0_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, ClassDeclaration eExtendedClass) {
		EMoflonEdge eClassDeclaration__eTypeAccess____superClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eExtendedClass____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eExtendedClass__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eTypeAccess);
		String eClassDeclaration__eTypeAccess____superClass_name_prime = "superClass";
		String eTypeAccess__eExtendedClass____type_name_prime = "type";
		String eExtendedClass__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		eClassDeclaration__eTypeAccess____superClass.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superClass.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eClassDeclaration__eTypeAccess____superClass);
		eTypeAccess__eExtendedClass____type.setSrc(eTypeAccess);
		eTypeAccess__eExtendedClass____type.setTrg(eExtendedClass);
		match.getToBeTranslatedEdges().add(eTypeAccess__eExtendedClass____type);
		eExtendedClass__eTypeAccess____usagesInTypeAccess.setSrc(eExtendedClass);
		eExtendedClass__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eExtendedClass__eTypeAccess____usagesInTypeAccess);
		eClassDeclaration__eTypeAccess____superClass.setName(eClassDeclaration__eTypeAccess____superClass_name_prime);
		eTypeAccess__eExtendedClass____type.setName(eTypeAccess__eExtendedClass____type_name_prime);
		eExtendedClass__eTypeAccess____usagesInTypeAccess
				.setName(eExtendedClass__eTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { match, eClassDeclaration, eTypeAccess, eExtendedClass,
				eClassDeclaration__eTypeAccess____superClass, eTypeAccess__eExtendedClass____type,
				eExtendedClass__eTypeAccess____usagesInTypeAccess };
	}

	public static final Object[] pattern_ClassExtendsClass_0_5_collectcontextelements_blackBBBB(Match match,
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, ClassDeclaration eExtendedClass) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			return new Object[] { match, eClassDeclaration, eTypeAccess, eExtendedClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_0_5_collectcontextelements_greenBBB(Match match,
			ClassDeclaration eClassDeclaration, ClassDeclaration eExtendedClass) {
		match.getContextNodes().add(eClassDeclaration);
		match.getContextNodes().add(eExtendedClass);
		return new Object[] { match, eClassDeclaration, eExtendedClass };
	}

	public static final void pattern_ClassExtendsClass_0_6_registerobjectstomatch_expressionBBBBB(
			ClassExtendsClass _this, Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			ClassDeclaration eExtendedClass) {
		_this.registerObjectsToMatch_FWD(match, eClassDeclaration, eTypeAccess, eExtendedClass);

	}

	public static final boolean pattern_ClassExtendsClass_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassExtendsClass_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eClassDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("eClassDeclarationToTClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("tExtendedClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("eTypeAccess");
		EObject _localVariable_5 = isApplicableMatch.getObject("eExtendedClass");
		EObject _localVariable_6 = isApplicableMatch.getObject("eExtendedClassToTExtendedClass");
		EObject tmpEClassDeclaration = _localVariable_0;
		EObject tmpEClassDeclarationToTClass = _localVariable_1;
		EObject tmpTClass = _localVariable_2;
		EObject tmpTExtendedClass = _localVariable_3;
		EObject tmpETypeAccess = _localVariable_4;
		EObject tmpEExtendedClass = _localVariable_5;
		EObject tmpEExtendedClassToTExtendedClass = _localVariable_6;
		if (tmpEClassDeclaration instanceof ClassDeclaration) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
			if (tmpEClassDeclarationToTClass instanceof TypeToTAbstractType) {
				TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) tmpEClassDeclarationToTClass;
				if (tmpTClass instanceof TClass) {
					TClass tClass = (TClass) tmpTClass;
					if (tmpTExtendedClass instanceof TClass) {
						TClass tExtendedClass = (TClass) tmpTExtendedClass;
						if (tmpETypeAccess instanceof TypeAccess) {
							TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
							if (tmpEExtendedClass instanceof ClassDeclaration) {
								ClassDeclaration eExtendedClass = (ClassDeclaration) tmpEExtendedClass;
								if (tmpEExtendedClassToTExtendedClass instanceof TypeToTAbstractType) {
									TypeToTAbstractType eExtendedClassToTExtendedClass = (TypeToTAbstractType) tmpEExtendedClassToTExtendedClass;
									return new Object[] { eClassDeclaration, eClassDeclarationToTClass, tClass,
											tExtendedClass, eTypeAccess, eExtendedClass, eExtendedClassToTExtendedClass,
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

	public static final Object[] pattern_ClassExtendsClass_1_1_performtransformation_blackBBBBBBBFBB(
			ClassDeclaration eClassDeclaration, TypeToTAbstractType eClassDeclarationToTClass, TClass tClass,
			TClass tExtendedClass, TypeAccess eTypeAccess, ClassDeclaration eExtendedClass,
			TypeToTAbstractType eExtendedClassToTExtendedClass, ClassExtendsClass _this,
			IsApplicableMatch isApplicableMatch) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
				if (!tClass.equals(tExtendedClass)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass,
									eTypeAccess, eExtendedClass, eExtendedClassToTExtendedClass, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			ClassExtendsClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassExtendsClass_1_1_performtransformation_binding = pattern_ClassExtendsClass_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassExtendsClass_1_1_performtransformation_binding != null) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result_pattern_ClassExtendsClass_1_1_performtransformation_binding[0];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result_pattern_ClassExtendsClass_1_1_performtransformation_binding[1];
			TClass tClass = (TClass) result_pattern_ClassExtendsClass_1_1_performtransformation_binding[2];
			TClass tExtendedClass = (TClass) result_pattern_ClassExtendsClass_1_1_performtransformation_binding[3];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ClassExtendsClass_1_1_performtransformation_binding[4];
			ClassDeclaration eExtendedClass = (ClassDeclaration) result_pattern_ClassExtendsClass_1_1_performtransformation_binding[5];
			TypeToTAbstractType eExtendedClassToTExtendedClass = (TypeToTAbstractType) result_pattern_ClassExtendsClass_1_1_performtransformation_binding[6];

			Object[] result_pattern_ClassExtendsClass_1_1_performtransformation_black = pattern_ClassExtendsClass_1_1_performtransformation_blackBBBBBBBFBB(
					eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass, eTypeAccess, eExtendedClass,
					eExtendedClassToTExtendedClass, _this, isApplicableMatch);
			if (result_pattern_ClassExtendsClass_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassExtendsClass_1_1_performtransformation_black[7];

				return new Object[] { eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass, eTypeAccess,
						eExtendedClass, eExtendedClassToTExtendedClass, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_1_1_performtransformation_greenBB(TClass tClass,
			TClass tExtendedClass) {
		tClass.getParentClasses().add(tExtendedClass);
		return new Object[] { tClass, tExtendedClass };
	}

	public static final Object[] pattern_ClassExtendsClass_1_2_collecttranslatedelements_blackB(
			TypeAccess eTypeAccess) {
		return new Object[] { eTypeAccess };
	}

	public static final Object[] pattern_ClassExtendsClass_1_2_collecttranslatedelements_greenFB(
			TypeAccess eTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(eTypeAccess);
		return new Object[] { ruleresult, eTypeAccess };
	}

	public static final Object[] pattern_ClassExtendsClass_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject eClassDeclaration, EObject eClassDeclarationToTClass, EObject tClass,
			EObject tExtendedClass, EObject eTypeAccess, EObject eExtendedClass,
			EObject eExtendedClassToTExtendedClass) {
		if (!eClassDeclaration.equals(eClassDeclarationToTClass)) {
			if (!eClassDeclaration.equals(tClass)) {
				if (!eClassDeclaration.equals(tExtendedClass)) {
					if (!eClassDeclaration.equals(eTypeAccess)) {
						if (!eClassDeclaration.equals(eExtendedClass)) {
							if (!eClassDeclaration.equals(eExtendedClassToTExtendedClass)) {
								if (!eClassDeclarationToTClass.equals(tClass)) {
									if (!eClassDeclarationToTClass.equals(tExtendedClass)) {
										if (!eClassDeclarationToTClass.equals(eTypeAccess)) {
											if (!eClassDeclarationToTClass.equals(eExtendedClass)) {
												if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
													if (!tClass.equals(tExtendedClass)) {
														if (!eTypeAccess.equals(tClass)) {
															if (!eTypeAccess.equals(tExtendedClass)) {
																if (!eExtendedClass.equals(tClass)) {
																	if (!eExtendedClass.equals(tExtendedClass)) {
																		if (!eExtendedClass.equals(eTypeAccess)) {
																			if (!eExtendedClass.equals(
																					eExtendedClassToTExtendedClass)) {
																				if (!eExtendedClassToTExtendedClass
																						.equals(tClass)) {
																					if (!eExtendedClassToTExtendedClass
																							.equals(tExtendedClass)) {
																						if (!eExtendedClassToTExtendedClass
																								.equals(eTypeAccess)) {
																							return new Object[] {
																									ruleresult,
																									eClassDeclaration,
																									eClassDeclarationToTClass,
																									tClass,
																									tExtendedClass,
																									eTypeAccess,
																									eExtendedClass,
																									eExtendedClassToTExtendedClass };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassExtendsClass_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject eClassDeclaration, EObject tClass, EObject tExtendedClass,
			EObject eTypeAccess, EObject eExtendedClass) {
		EMoflonEdge tClass__tExtendedClass____parentClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tExtendedClass__tClass____childClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclaration__eTypeAccess____superClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eExtendedClass____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eExtendedClass__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassExtendsClass";
		String tClass__tExtendedClass____parentClasses_name_prime = "parentClasses";
		String tExtendedClass__tClass____childClasses_name_prime = "childClasses";
		String eClassDeclaration__eTypeAccess____superClass_name_prime = "superClass";
		String eTypeAccess__eExtendedClass____type_name_prime = "type";
		String eExtendedClass__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		tClass__tExtendedClass____parentClasses.setSrc(tClass);
		tClass__tExtendedClass____parentClasses.setTrg(tExtendedClass);
		ruleresult.getCreatedEdges().add(tClass__tExtendedClass____parentClasses);
		tExtendedClass__tClass____childClasses.setSrc(tExtendedClass);
		tExtendedClass__tClass____childClasses.setTrg(tClass);
		ruleresult.getCreatedEdges().add(tExtendedClass__tClass____childClasses);
		eClassDeclaration__eTypeAccess____superClass.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superClass.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eClassDeclaration__eTypeAccess____superClass);
		eTypeAccess__eExtendedClass____type.setSrc(eTypeAccess);
		eTypeAccess__eExtendedClass____type.setTrg(eExtendedClass);
		ruleresult.getTranslatedEdges().add(eTypeAccess__eExtendedClass____type);
		eExtendedClass__eTypeAccess____usagesInTypeAccess.setSrc(eExtendedClass);
		eExtendedClass__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eExtendedClass__eTypeAccess____usagesInTypeAccess);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tClass__tExtendedClass____parentClasses.setName(tClass__tExtendedClass____parentClasses_name_prime);
		tExtendedClass__tClass____childClasses.setName(tExtendedClass__tClass____childClasses_name_prime);
		eClassDeclaration__eTypeAccess____superClass.setName(eClassDeclaration__eTypeAccess____superClass_name_prime);
		eTypeAccess__eExtendedClass____type.setName(eTypeAccess__eExtendedClass____type_name_prime);
		eExtendedClass__eTypeAccess____usagesInTypeAccess
				.setName(eExtendedClass__eTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { ruleresult, eClassDeclaration, tClass, tExtendedClass, eTypeAccess, eExtendedClass,
				tClass__tExtendedClass____parentClasses, tExtendedClass__tClass____childClasses,
				eClassDeclaration__eTypeAccess____superClass, eTypeAccess__eExtendedClass____type,
				eExtendedClass__eTypeAccess____usagesInTypeAccess };
	}

	public static final void pattern_ClassExtendsClass_1_5_registerobjects_expressionBBBBBBBBB(ClassExtendsClass _this,
			PerformRuleResult ruleresult, EObject eClassDeclaration, EObject eClassDeclarationToTClass, EObject tClass,
			EObject tExtendedClass, EObject eTypeAccess, EObject eExtendedClass,
			EObject eExtendedClassToTExtendedClass) {
		_this.registerObjects_FWD(ruleresult, eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass,
				eTypeAccess, eExtendedClass, eExtendedClassToTExtendedClass);

	}

	public static final PerformRuleResult pattern_ClassExtendsClass_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_2_1_preparereturnvalue_bindingFB(ClassExtendsClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassExtendsClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_2_1_preparereturnvalue_bindingAndBlackFFB(
			ClassExtendsClass _this) {
		Object[] result_pattern_ClassExtendsClass_2_1_preparereturnvalue_binding = pattern_ClassExtendsClass_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassExtendsClass_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassExtendsClass_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassExtendsClass_2_1_preparereturnvalue_black = pattern_ClassExtendsClass_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassExtendsClass_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassExtendsClass_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassExtendsClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassExtendsClass_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eClassDeclaration");
		EObject _localVariable_1 = match.getObject("eTypeAccess");
		EObject _localVariable_2 = match.getObject("eExtendedClass");
		EObject tmpEClassDeclaration = _localVariable_0;
		EObject tmpETypeAccess = _localVariable_1;
		EObject tmpEExtendedClass = _localVariable_2;
		if (tmpEClassDeclaration instanceof ClassDeclaration) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
			if (tmpETypeAccess instanceof TypeAccess) {
				TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
				if (tmpEExtendedClass instanceof ClassDeclaration) {
					ClassDeclaration eExtendedClass = (ClassDeclaration) tmpEExtendedClass;
					return new Object[] { eClassDeclaration, eTypeAccess, eExtendedClass, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassExtendsClass_2_2_corematch_blackBFFFBBFB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, ClassDeclaration eExtendedClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eClassDeclaration.equals(eExtendedClass)) {
			for (TypeToTAbstractType eClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eClassDeclaration, TypeToTAbstractType.class, "source")) {
				TAbstractType tmpTClass = eClassDeclarationToTClass.getTarget();
				if (tmpTClass instanceof TClass) {
					TClass tClass = (TClass) tmpTClass;
					for (TypeToTAbstractType eExtendedClassToTExtendedClass : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(eExtendedClass, TypeToTAbstractType.class, "source")) {
						if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
							TAbstractType tmpTExtendedClass = eExtendedClassToTExtendedClass.getTarget();
							if (tmpTExtendedClass instanceof TClass) {
								TClass tExtendedClass = (TClass) tmpTExtendedClass;
								if (!tClass.equals(tExtendedClass)) {
									_result.add(new Object[] { eClassDeclaration, eClassDeclarationToTClass, tClass,
											tExtendedClass, eTypeAccess, eExtendedClass, eExtendedClassToTExtendedClass,
											match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassExtendsClass_2_3_findcontext_blackBBBBBBB(
			ClassDeclaration eClassDeclaration, TypeToTAbstractType eClassDeclarationToTClass, TClass tClass,
			TClass tExtendedClass, TypeAccess eTypeAccess, ClassDeclaration eExtendedClass,
			TypeToTAbstractType eExtendedClassToTExtendedClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
				if (!tClass.equals(tExtendedClass)) {
					if (tClass.equals(eClassDeclarationToTClass.getTarget())) {
						if (eTypeAccess.equals(eClassDeclaration.getSuperClass())) {
							if (eExtendedClass.equals(eTypeAccess.getType())) {
								if (eClassDeclaration.equals(eClassDeclarationToTClass.getSource())) {
									if (tExtendedClass.equals(eExtendedClassToTExtendedClass.getTarget())) {
										if (eExtendedClass.equals(eExtendedClassToTExtendedClass.getSource())) {
											_result.add(new Object[] { eClassDeclaration, eClassDeclarationToTClass,
													tClass, tExtendedClass, eTypeAccess, eExtendedClass,
													eExtendedClassToTExtendedClass });
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

	public static final Object[] pattern_ClassExtendsClass_2_3_findcontext_greenBBBBBBBFFFFFFFF(
			ClassDeclaration eClassDeclaration, TypeToTAbstractType eClassDeclarationToTClass, TClass tClass,
			TClass tExtendedClass, TypeAccess eTypeAccess, ClassDeclaration eExtendedClass,
			TypeToTAbstractType eExtendedClassToTExtendedClass) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclaration__eTypeAccess____superClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eExtendedClass____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eExtendedClass__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eExtendedClassToTExtendedClass__tExtendedClass____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eExtendedClassToTExtendedClass__eExtendedClass____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String eClassDeclarationToTClass__tClass____target_name_prime = "target";
		String eClassDeclaration__eTypeAccess____superClass_name_prime = "superClass";
		String eTypeAccess__eExtendedClass____type_name_prime = "type";
		String eExtendedClass__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eClassDeclarationToTClass__eClassDeclaration____source_name_prime = "source";
		String eExtendedClassToTExtendedClass__tExtendedClass____target_name_prime = "target";
		String eExtendedClassToTExtendedClass__eExtendedClass____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(tExtendedClass);
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eExtendedClass);
		isApplicableMatch.getAllContextElements().add(eExtendedClassToTExtendedClass);
		eClassDeclarationToTClass__tClass____target.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__tClass____target);
		eClassDeclaration__eTypeAccess____superClass.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superClass.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eClassDeclaration__eTypeAccess____superClass);
		eTypeAccess__eExtendedClass____type.setSrc(eTypeAccess);
		eTypeAccess__eExtendedClass____type.setTrg(eExtendedClass);
		isApplicableMatch.getAllContextElements().add(eTypeAccess__eExtendedClass____type);
		eExtendedClass__eTypeAccess____usagesInTypeAccess.setSrc(eExtendedClass);
		eExtendedClass__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eExtendedClass__eTypeAccess____usagesInTypeAccess);
		eClassDeclarationToTClass__eClassDeclaration____source.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__eClassDeclaration____source.setTrg(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__eClassDeclaration____source);
		eExtendedClassToTExtendedClass__tExtendedClass____target.setSrc(eExtendedClassToTExtendedClass);
		eExtendedClassToTExtendedClass__tExtendedClass____target.setTrg(tExtendedClass);
		isApplicableMatch.getAllContextElements().add(eExtendedClassToTExtendedClass__tExtendedClass____target);
		eExtendedClassToTExtendedClass__eExtendedClass____source.setSrc(eExtendedClassToTExtendedClass);
		eExtendedClassToTExtendedClass__eExtendedClass____source.setTrg(eExtendedClass);
		isApplicableMatch.getAllContextElements().add(eExtendedClassToTExtendedClass__eExtendedClass____source);
		eClassDeclarationToTClass__tClass____target.setName(eClassDeclarationToTClass__tClass____target_name_prime);
		eClassDeclaration__eTypeAccess____superClass.setName(eClassDeclaration__eTypeAccess____superClass_name_prime);
		eTypeAccess__eExtendedClass____type.setName(eTypeAccess__eExtendedClass____type_name_prime);
		eExtendedClass__eTypeAccess____usagesInTypeAccess
				.setName(eExtendedClass__eTypeAccess____usagesInTypeAccess_name_prime);
		eClassDeclarationToTClass__eClassDeclaration____source
				.setName(eClassDeclarationToTClass__eClassDeclaration____source_name_prime);
		eExtendedClassToTExtendedClass__tExtendedClass____target
				.setName(eExtendedClassToTExtendedClass__tExtendedClass____target_name_prime);
		eExtendedClassToTExtendedClass__eExtendedClass____source
				.setName(eExtendedClassToTExtendedClass__eExtendedClass____source_name_prime);
		return new Object[] { eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass, eTypeAccess,
				eExtendedClass, eExtendedClassToTExtendedClass, isApplicableMatch,
				eClassDeclarationToTClass__tClass____target, eClassDeclaration__eTypeAccess____superClass,
				eTypeAccess__eExtendedClass____type, eExtendedClass__eTypeAccess____usagesInTypeAccess,
				eClassDeclarationToTClass__eClassDeclaration____source,
				eExtendedClassToTExtendedClass__tExtendedClass____target,
				eExtendedClassToTExtendedClass__eExtendedClass____source };
	}

	public static final Object[] pattern_ClassExtendsClass_2_4_solveCSP_bindingFBBBBBBBBB(ClassExtendsClass _this,
			IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eClassDeclarationToTClass, TClass tClass, TClass tExtendedClass, TypeAccess eTypeAccess,
			ClassDeclaration eExtendedClass, TypeToTAbstractType eExtendedClassToTExtendedClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eClassDeclaration,
				eClassDeclarationToTClass, tClass, tExtendedClass, eTypeAccess, eExtendedClass,
				eExtendedClassToTExtendedClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eClassDeclaration, eClassDeclarationToTClass, tClass,
					tExtendedClass, eTypeAccess, eExtendedClass, eExtendedClassToTExtendedClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassExtendsClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			ClassExtendsClass _this, IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eClassDeclarationToTClass, TClass tClass, TClass tExtendedClass, TypeAccess eTypeAccess,
			ClassDeclaration eExtendedClass, TypeToTAbstractType eExtendedClassToTExtendedClass) {
		Object[] result_pattern_ClassExtendsClass_2_4_solveCSP_binding = pattern_ClassExtendsClass_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass,
				eTypeAccess, eExtendedClass, eExtendedClassToTExtendedClass);
		if (result_pattern_ClassExtendsClass_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassExtendsClass_2_4_solveCSP_binding[0];

			Object[] result_pattern_ClassExtendsClass_2_4_solveCSP_black = pattern_ClassExtendsClass_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassExtendsClass_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eClassDeclaration, eClassDeclarationToTClass,
						tClass, tExtendedClass, eTypeAccess, eExtendedClass, eExtendedClassToTExtendedClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassExtendsClass_2_5_checkCSP_expressionFBB(ClassExtendsClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassExtendsClass_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassExtendsClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassExtendsClass_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_10_1_initialbindings_blackBBBB(ClassExtendsClass _this,
			Match match, TClass tClass, TClass tExtendedClass) {
		if (!tClass.equals(tExtendedClass)) {
			return new Object[] { _this, match, tClass, tExtendedClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_10_2_SolveCSP_bindingFBBBB(ClassExtendsClass _this,
			Match match, TClass tClass, TClass tExtendedClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tClass, tExtendedClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tClass, tExtendedClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassExtendsClass_10_2_SolveCSP_bindingAndBlackFBBBB(ClassExtendsClass _this,
			Match match, TClass tClass, TClass tExtendedClass) {
		Object[] result_pattern_ClassExtendsClass_10_2_SolveCSP_binding = pattern_ClassExtendsClass_10_2_SolveCSP_bindingFBBBB(
				_this, match, tClass, tExtendedClass);
		if (result_pattern_ClassExtendsClass_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassExtendsClass_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassExtendsClass_10_2_SolveCSP_black = pattern_ClassExtendsClass_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassExtendsClass_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tClass, tExtendedClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassExtendsClass_10_3_CheckCSP_expressionFBB(ClassExtendsClass _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_10_4_collectelementstobetranslated_blackBBB(Match match,
			TClass tClass, TClass tExtendedClass) {
		if (!tClass.equals(tExtendedClass)) {
			return new Object[] { match, tClass, tExtendedClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TClass tClass, TClass tExtendedClass) {
		EMoflonEdge tClass__tExtendedClass____parentClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tExtendedClass__tClass____childClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tClass__tExtendedClass____parentClasses_name_prime = "parentClasses";
		String tExtendedClass__tClass____childClasses_name_prime = "childClasses";
		tClass__tExtendedClass____parentClasses.setSrc(tClass);
		tClass__tExtendedClass____parentClasses.setTrg(tExtendedClass);
		match.getToBeTranslatedEdges().add(tClass__tExtendedClass____parentClasses);
		tExtendedClass__tClass____childClasses.setSrc(tExtendedClass);
		tExtendedClass__tClass____childClasses.setTrg(tClass);
		match.getToBeTranslatedEdges().add(tExtendedClass__tClass____childClasses);
		tClass__tExtendedClass____parentClasses.setName(tClass__tExtendedClass____parentClasses_name_prime);
		tExtendedClass__tClass____childClasses.setName(tExtendedClass__tClass____childClasses_name_prime);
		return new Object[] { match, tClass, tExtendedClass, tClass__tExtendedClass____parentClasses,
				tExtendedClass__tClass____childClasses };
	}

	public static final Object[] pattern_ClassExtendsClass_10_5_collectcontextelements_blackBBB(Match match,
			TClass tClass, TClass tExtendedClass) {
		if (!tClass.equals(tExtendedClass)) {
			return new Object[] { match, tClass, tExtendedClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_10_5_collectcontextelements_greenBBB(Match match,
			TClass tClass, TClass tExtendedClass) {
		match.getContextNodes().add(tClass);
		match.getContextNodes().add(tExtendedClass);
		return new Object[] { match, tClass, tExtendedClass };
	}

	public static final void pattern_ClassExtendsClass_10_6_registerobjectstomatch_expressionBBBB(
			ClassExtendsClass _this, Match match, TClass tClass, TClass tExtendedClass) {
		_this.registerObjectsToMatch_BWD(match, tClass, tExtendedClass);

	}

	public static final boolean pattern_ClassExtendsClass_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassExtendsClass_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eClassDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("eClassDeclarationToTClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("tExtendedClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("eExtendedClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("eExtendedClassToTExtendedClass");
		EObject tmpEClassDeclaration = _localVariable_0;
		EObject tmpEClassDeclarationToTClass = _localVariable_1;
		EObject tmpTClass = _localVariable_2;
		EObject tmpTExtendedClass = _localVariable_3;
		EObject tmpEExtendedClass = _localVariable_4;
		EObject tmpEExtendedClassToTExtendedClass = _localVariable_5;
		if (tmpEClassDeclaration instanceof ClassDeclaration) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
			if (tmpEClassDeclarationToTClass instanceof TypeToTAbstractType) {
				TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) tmpEClassDeclarationToTClass;
				if (tmpTClass instanceof TClass) {
					TClass tClass = (TClass) tmpTClass;
					if (tmpTExtendedClass instanceof TClass) {
						TClass tExtendedClass = (TClass) tmpTExtendedClass;
						if (tmpEExtendedClass instanceof ClassDeclaration) {
							ClassDeclaration eExtendedClass = (ClassDeclaration) tmpEExtendedClass;
							if (tmpEExtendedClassToTExtendedClass instanceof TypeToTAbstractType) {
								TypeToTAbstractType eExtendedClassToTExtendedClass = (TypeToTAbstractType) tmpEExtendedClassToTExtendedClass;
								return new Object[] { eClassDeclaration, eClassDeclarationToTClass, tClass,
										tExtendedClass, eExtendedClass, eExtendedClassToTExtendedClass,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_11_1_performtransformation_blackBBBBBBFBB(
			ClassDeclaration eClassDeclaration, TypeToTAbstractType eClassDeclarationToTClass, TClass tClass,
			TClass tExtendedClass, ClassDeclaration eExtendedClass, TypeToTAbstractType eExtendedClassToTExtendedClass,
			ClassExtendsClass _this, IsApplicableMatch isApplicableMatch) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
				if (!tClass.equals(tExtendedClass)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass,
									eExtendedClass, eExtendedClassToTExtendedClass, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			ClassExtendsClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassExtendsClass_11_1_performtransformation_binding = pattern_ClassExtendsClass_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassExtendsClass_11_1_performtransformation_binding != null) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result_pattern_ClassExtendsClass_11_1_performtransformation_binding[0];
			TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) result_pattern_ClassExtendsClass_11_1_performtransformation_binding[1];
			TClass tClass = (TClass) result_pattern_ClassExtendsClass_11_1_performtransformation_binding[2];
			TClass tExtendedClass = (TClass) result_pattern_ClassExtendsClass_11_1_performtransformation_binding[3];
			ClassDeclaration eExtendedClass = (ClassDeclaration) result_pattern_ClassExtendsClass_11_1_performtransformation_binding[4];
			TypeToTAbstractType eExtendedClassToTExtendedClass = (TypeToTAbstractType) result_pattern_ClassExtendsClass_11_1_performtransformation_binding[5];

			Object[] result_pattern_ClassExtendsClass_11_1_performtransformation_black = pattern_ClassExtendsClass_11_1_performtransformation_blackBBBBBBFBB(
					eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass, eExtendedClass,
					eExtendedClassToTExtendedClass, _this, isApplicableMatch);
			if (result_pattern_ClassExtendsClass_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassExtendsClass_11_1_performtransformation_black[6];

				return new Object[] { eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass,
						eExtendedClass, eExtendedClassToTExtendedClass, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_11_1_performtransformation_greenBFB(
			ClassDeclaration eClassDeclaration, ClassDeclaration eExtendedClass) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		eClassDeclaration.setSuperClass(eTypeAccess);
		eTypeAccess.setType(eExtendedClass);
		return new Object[] { eClassDeclaration, eTypeAccess, eExtendedClass };
	}

	public static final Object[] pattern_ClassExtendsClass_11_2_collecttranslatedelements_blackB(
			TypeAccess eTypeAccess) {
		return new Object[] { eTypeAccess };
	}

	public static final Object[] pattern_ClassExtendsClass_11_2_collecttranslatedelements_greenFB(
			TypeAccess eTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(eTypeAccess);
		return new Object[] { ruleresult, eTypeAccess };
	}

	public static final Object[] pattern_ClassExtendsClass_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject eClassDeclaration, EObject eClassDeclarationToTClass, EObject tClass,
			EObject tExtendedClass, EObject eTypeAccess, EObject eExtendedClass,
			EObject eExtendedClassToTExtendedClass) {
		if (!eClassDeclaration.equals(eClassDeclarationToTClass)) {
			if (!eClassDeclaration.equals(tClass)) {
				if (!eClassDeclaration.equals(tExtendedClass)) {
					if (!eClassDeclaration.equals(eTypeAccess)) {
						if (!eClassDeclaration.equals(eExtendedClass)) {
							if (!eClassDeclaration.equals(eExtendedClassToTExtendedClass)) {
								if (!eClassDeclarationToTClass.equals(tClass)) {
									if (!eClassDeclarationToTClass.equals(tExtendedClass)) {
										if (!eClassDeclarationToTClass.equals(eTypeAccess)) {
											if (!eClassDeclarationToTClass.equals(eExtendedClass)) {
												if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
													if (!tClass.equals(tExtendedClass)) {
														if (!eTypeAccess.equals(tClass)) {
															if (!eTypeAccess.equals(tExtendedClass)) {
																if (!eExtendedClass.equals(tClass)) {
																	if (!eExtendedClass.equals(tExtendedClass)) {
																		if (!eExtendedClass.equals(eTypeAccess)) {
																			if (!eExtendedClass.equals(
																					eExtendedClassToTExtendedClass)) {
																				if (!eExtendedClassToTExtendedClass
																						.equals(tClass)) {
																					if (!eExtendedClassToTExtendedClass
																							.equals(tExtendedClass)) {
																						if (!eExtendedClassToTExtendedClass
																								.equals(eTypeAccess)) {
																							return new Object[] {
																									ruleresult,
																									eClassDeclaration,
																									eClassDeclarationToTClass,
																									tClass,
																									tExtendedClass,
																									eTypeAccess,
																									eExtendedClass,
																									eExtendedClassToTExtendedClass };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassExtendsClass_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject eClassDeclaration, EObject tClass, EObject tExtendedClass,
			EObject eTypeAccess, EObject eExtendedClass) {
		EMoflonEdge tClass__tExtendedClass____parentClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tExtendedClass__tClass____childClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclaration__eTypeAccess____superClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eExtendedClass____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eExtendedClass__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassExtendsClass";
		String tClass__tExtendedClass____parentClasses_name_prime = "parentClasses";
		String tExtendedClass__tClass____childClasses_name_prime = "childClasses";
		String eClassDeclaration__eTypeAccess____superClass_name_prime = "superClass";
		String eTypeAccess__eExtendedClass____type_name_prime = "type";
		String eExtendedClass__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		tClass__tExtendedClass____parentClasses.setSrc(tClass);
		tClass__tExtendedClass____parentClasses.setTrg(tExtendedClass);
		ruleresult.getTranslatedEdges().add(tClass__tExtendedClass____parentClasses);
		tExtendedClass__tClass____childClasses.setSrc(tExtendedClass);
		tExtendedClass__tClass____childClasses.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(tExtendedClass__tClass____childClasses);
		eClassDeclaration__eTypeAccess____superClass.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superClass.setTrg(eTypeAccess);
		ruleresult.getCreatedEdges().add(eClassDeclaration__eTypeAccess____superClass);
		eTypeAccess__eExtendedClass____type.setSrc(eTypeAccess);
		eTypeAccess__eExtendedClass____type.setTrg(eExtendedClass);
		ruleresult.getCreatedEdges().add(eTypeAccess__eExtendedClass____type);
		eExtendedClass__eTypeAccess____usagesInTypeAccess.setSrc(eExtendedClass);
		eExtendedClass__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getCreatedEdges().add(eExtendedClass__eTypeAccess____usagesInTypeAccess);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tClass__tExtendedClass____parentClasses.setName(tClass__tExtendedClass____parentClasses_name_prime);
		tExtendedClass__tClass____childClasses.setName(tExtendedClass__tClass____childClasses_name_prime);
		eClassDeclaration__eTypeAccess____superClass.setName(eClassDeclaration__eTypeAccess____superClass_name_prime);
		eTypeAccess__eExtendedClass____type.setName(eTypeAccess__eExtendedClass____type_name_prime);
		eExtendedClass__eTypeAccess____usagesInTypeAccess
				.setName(eExtendedClass__eTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { ruleresult, eClassDeclaration, tClass, tExtendedClass, eTypeAccess, eExtendedClass,
				tClass__tExtendedClass____parentClasses, tExtendedClass__tClass____childClasses,
				eClassDeclaration__eTypeAccess____superClass, eTypeAccess__eExtendedClass____type,
				eExtendedClass__eTypeAccess____usagesInTypeAccess };
	}

	public static final void pattern_ClassExtendsClass_11_5_registerobjects_expressionBBBBBBBBB(ClassExtendsClass _this,
			PerformRuleResult ruleresult, EObject eClassDeclaration, EObject eClassDeclarationToTClass, EObject tClass,
			EObject tExtendedClass, EObject eTypeAccess, EObject eExtendedClass,
			EObject eExtendedClassToTExtendedClass) {
		_this.registerObjects_BWD(ruleresult, eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass,
				eTypeAccess, eExtendedClass, eExtendedClassToTExtendedClass);

	}

	public static final PerformRuleResult pattern_ClassExtendsClass_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_12_1_preparereturnvalue_bindingFB(ClassExtendsClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_12_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassExtendsClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_12_1_preparereturnvalue_bindingAndBlackFFB(
			ClassExtendsClass _this) {
		Object[] result_pattern_ClassExtendsClass_12_1_preparereturnvalue_binding = pattern_ClassExtendsClass_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassExtendsClass_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassExtendsClass_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassExtendsClass_12_1_preparereturnvalue_black = pattern_ClassExtendsClass_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassExtendsClass_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassExtendsClass_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassExtendsClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassExtendsClass_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tClass");
		EObject _localVariable_1 = match.getObject("tExtendedClass");
		EObject tmpTClass = _localVariable_0;
		EObject tmpTExtendedClass = _localVariable_1;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpTExtendedClass instanceof TClass) {
				TClass tExtendedClass = (TClass) tmpTExtendedClass;
				return new Object[] { tClass, tExtendedClass, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassExtendsClass_12_2_corematch_blackFFBBFFB(TClass tClass,
			TClass tExtendedClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tClass.equals(tExtendedClass)) {
			for (TypeToTAbstractType eClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tClass, TypeToTAbstractType.class, "target")) {
				Type tmpEClassDeclaration = eClassDeclarationToTClass.getSource();
				if (tmpEClassDeclaration instanceof ClassDeclaration) {
					ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
					for (TypeToTAbstractType eExtendedClassToTExtendedClass : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tExtendedClass, TypeToTAbstractType.class, "target")) {
						if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
							Type tmpEExtendedClass = eExtendedClassToTExtendedClass.getSource();
							if (tmpEExtendedClass instanceof ClassDeclaration) {
								ClassDeclaration eExtendedClass = (ClassDeclaration) tmpEExtendedClass;
								if (!eClassDeclaration.equals(eExtendedClass)) {
									_result.add(new Object[] { eClassDeclaration, eClassDeclarationToTClass, tClass,
											tExtendedClass, eExtendedClass, eExtendedClassToTExtendedClass, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassExtendsClass_12_3_findcontext_blackBBBBBB(
			ClassDeclaration eClassDeclaration, TypeToTAbstractType eClassDeclarationToTClass, TClass tClass,
			TClass tExtendedClass, ClassDeclaration eExtendedClass,
			TypeToTAbstractType eExtendedClassToTExtendedClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
				if (!tClass.equals(tExtendedClass)) {
					if (tClass.getParentClasses().contains(tExtendedClass)) {
						if (tClass.equals(eClassDeclarationToTClass.getTarget())) {
							if (eClassDeclaration.equals(eClassDeclarationToTClass.getSource())) {
								if (tExtendedClass.equals(eExtendedClassToTExtendedClass.getTarget())) {
									if (eExtendedClass.equals(eExtendedClassToTExtendedClass.getSource())) {
										_result.add(new Object[] { eClassDeclaration, eClassDeclarationToTClass, tClass,
												tExtendedClass, eExtendedClass, eExtendedClassToTExtendedClass });
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

	public static final Object[] pattern_ClassExtendsClass_12_3_findcontext_greenBBBBBBFFFFFFF(
			ClassDeclaration eClassDeclaration, TypeToTAbstractType eClassDeclarationToTClass, TClass tClass,
			TClass tExtendedClass, ClassDeclaration eExtendedClass,
			TypeToTAbstractType eExtendedClassToTExtendedClass) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tClass__tExtendedClass____parentClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tExtendedClass__tClass____childClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eExtendedClassToTExtendedClass__tExtendedClass____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eExtendedClassToTExtendedClass__eExtendedClass____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String tClass__tExtendedClass____parentClasses_name_prime = "parentClasses";
		String tExtendedClass__tClass____childClasses_name_prime = "childClasses";
		String eClassDeclarationToTClass__tClass____target_name_prime = "target";
		String eClassDeclarationToTClass__eClassDeclaration____source_name_prime = "source";
		String eExtendedClassToTExtendedClass__tExtendedClass____target_name_prime = "target";
		String eExtendedClassToTExtendedClass__eExtendedClass____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(tExtendedClass);
		isApplicableMatch.getAllContextElements().add(eExtendedClass);
		isApplicableMatch.getAllContextElements().add(eExtendedClassToTExtendedClass);
		tClass__tExtendedClass____parentClasses.setSrc(tClass);
		tClass__tExtendedClass____parentClasses.setTrg(tExtendedClass);
		isApplicableMatch.getAllContextElements().add(tClass__tExtendedClass____parentClasses);
		tExtendedClass__tClass____childClasses.setSrc(tExtendedClass);
		tExtendedClass__tClass____childClasses.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(tExtendedClass__tClass____childClasses);
		eClassDeclarationToTClass__tClass____target.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__tClass____target);
		eClassDeclarationToTClass__eClassDeclaration____source.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__eClassDeclaration____source.setTrg(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__eClassDeclaration____source);
		eExtendedClassToTExtendedClass__tExtendedClass____target.setSrc(eExtendedClassToTExtendedClass);
		eExtendedClassToTExtendedClass__tExtendedClass____target.setTrg(tExtendedClass);
		isApplicableMatch.getAllContextElements().add(eExtendedClassToTExtendedClass__tExtendedClass____target);
		eExtendedClassToTExtendedClass__eExtendedClass____source.setSrc(eExtendedClassToTExtendedClass);
		eExtendedClassToTExtendedClass__eExtendedClass____source.setTrg(eExtendedClass);
		isApplicableMatch.getAllContextElements().add(eExtendedClassToTExtendedClass__eExtendedClass____source);
		tClass__tExtendedClass____parentClasses.setName(tClass__tExtendedClass____parentClasses_name_prime);
		tExtendedClass__tClass____childClasses.setName(tExtendedClass__tClass____childClasses_name_prime);
		eClassDeclarationToTClass__tClass____target.setName(eClassDeclarationToTClass__tClass____target_name_prime);
		eClassDeclarationToTClass__eClassDeclaration____source
				.setName(eClassDeclarationToTClass__eClassDeclaration____source_name_prime);
		eExtendedClassToTExtendedClass__tExtendedClass____target
				.setName(eExtendedClassToTExtendedClass__tExtendedClass____target_name_prime);
		eExtendedClassToTExtendedClass__eExtendedClass____source
				.setName(eExtendedClassToTExtendedClass__eExtendedClass____source_name_prime);
		return new Object[] { eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass, eExtendedClass,
				eExtendedClassToTExtendedClass, isApplicableMatch, tClass__tExtendedClass____parentClasses,
				tExtendedClass__tClass____childClasses, eClassDeclarationToTClass__tClass____target,
				eClassDeclarationToTClass__eClassDeclaration____source,
				eExtendedClassToTExtendedClass__tExtendedClass____target,
				eExtendedClassToTExtendedClass__eExtendedClass____source };
	}

	public static final Object[] pattern_ClassExtendsClass_12_4_solveCSP_bindingFBBBBBBBB(ClassExtendsClass _this,
			IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eClassDeclarationToTClass, TClass tClass, TClass tExtendedClass,
			ClassDeclaration eExtendedClass, TypeToTAbstractType eExtendedClassToTExtendedClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, eClassDeclaration,
				eClassDeclarationToTClass, tClass, tExtendedClass, eExtendedClass, eExtendedClassToTExtendedClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eClassDeclaration, eClassDeclarationToTClass, tClass,
					tExtendedClass, eExtendedClass, eExtendedClassToTExtendedClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassExtendsClass_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			ClassExtendsClass _this, IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eClassDeclarationToTClass, TClass tClass, TClass tExtendedClass,
			ClassDeclaration eExtendedClass, TypeToTAbstractType eExtendedClassToTExtendedClass) {
		Object[] result_pattern_ClassExtendsClass_12_4_solveCSP_binding = pattern_ClassExtendsClass_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass,
				eExtendedClass, eExtendedClassToTExtendedClass);
		if (result_pattern_ClassExtendsClass_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassExtendsClass_12_4_solveCSP_binding[0];

			Object[] result_pattern_ClassExtendsClass_12_4_solveCSP_black = pattern_ClassExtendsClass_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassExtendsClass_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eClassDeclaration, eClassDeclarationToTClass,
						tClass, tExtendedClass, eExtendedClass, eExtendedClassToTExtendedClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassExtendsClass_12_5_checkCSP_expressionFBB(ClassExtendsClass _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassExtendsClass_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassExtendsClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassExtendsClass_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_20_1_preparereturnvalue_bindingFB(ClassExtendsClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassExtendsClass _this) {
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

	public static final Object[] pattern_ClassExtendsClass_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassExtendsClass _this) {
		Object[] result_pattern_ClassExtendsClass_20_1_preparereturnvalue_binding = pattern_ClassExtendsClass_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassExtendsClass_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassExtendsClass_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassExtendsClass_20_1_preparereturnvalue_black = pattern_ClassExtendsClass_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassExtendsClass_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassExtendsClass_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassExtendsClass_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ClassExtendsClass_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_parentClasses) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTClass = _edge_parentClasses.getSrc();
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			EObject tmpTExtendedClass = _edge_parentClasses.getTrg();
			if (tmpTExtendedClass instanceof TClass) {
				TClass tExtendedClass = (TClass) tmpTExtendedClass;
				if (!tClass.equals(tExtendedClass)) {
					if (tClass.getParentClasses().contains(tExtendedClass)) {
						_result.add(new Object[] { tClass, tExtendedClass, _edge_parentClasses });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassExtendsClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ClassExtendsClass _this, Match match, TClass tClass, TClass tExtendedClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tClass, tExtendedClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassExtendsClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassExtendsClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassExtendsClass_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_21_1_preparereturnvalue_bindingFB(ClassExtendsClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassExtendsClass _this) {
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

	public static final Object[] pattern_ClassExtendsClass_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassExtendsClass _this) {
		Object[] result_pattern_ClassExtendsClass_21_1_preparereturnvalue_binding = pattern_ClassExtendsClass_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassExtendsClass_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassExtendsClass_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassExtendsClass_21_1_preparereturnvalue_black = pattern_ClassExtendsClass_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassExtendsClass_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassExtendsClass_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassExtendsClass_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_0BBB(
			TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration, ClassDeclaration eExtendedClass) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			for (AbstractTypeDeclaration __DEC_eTypeAccess_superInterfaces_850378 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
				if (!eClassDeclaration.equals(__DEC_eTypeAccess_superInterfaces_850378)) {
					if (!eExtendedClass.equals(__DEC_eTypeAccess_superInterfaces_850378)) {
						return new Object[] { eTypeAccess, eClassDeclaration, eExtendedClass };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_691622 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_2B(
			TypeAccess eTypeAccess) {
		for (AnnotationTypeMemberDeclaration __DEC_eTypeAccess_type_736735 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess eTypeAccess) {
		for (ArrayType __DEC_eTypeAccess_elementType_151451 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_4B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_712479 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_360008 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess eTypeAccess) {
		for (ParameterizedType __DEC_eTypeAccess_type_806724 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ParameterizedType.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_574549 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_8B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_357438 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_9BB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess) {
		if (eClassDeclaration.getSuperInterfaces().contains(eTypeAccess)) {
			return new Object[] { eClassDeclaration, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_10BB(
			ClassDeclaration eExtendedClass, TypeAccess eTypeAccess) {
		if (eExtendedClass.getSuperInterfaces().contains(eTypeAccess)) {
			return new Object[] { eExtendedClass, eTypeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassExtendsClass_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_superClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEClassDeclaration = _edge_superClass.getSrc();
		if (tmpEClassDeclaration instanceof ClassDeclaration) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
			EObject tmpETypeAccess = _edge_superClass.getTrg();
			if (tmpETypeAccess instanceof TypeAccess) {
				TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
				if (eTypeAccess.equals(eClassDeclaration.getSuperClass())) {
					Type tmpEExtendedClass = eTypeAccess.getType();
					if (tmpEExtendedClass instanceof ClassDeclaration) {
						ClassDeclaration eExtendedClass = (ClassDeclaration) tmpEExtendedClass;
						if (!eClassDeclaration.equals(eExtendedClass)) {
							if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_1B(eTypeAccess) == null) {
								if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_2B(
										eTypeAccess) == null) {
									if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_3B(
											eTypeAccess) == null) {
										if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_4B(
												eTypeAccess) == null) {
											if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_5B(
													eTypeAccess) == null) {
												if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_6B(
														eTypeAccess) == null) {
													if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_7B(
															eTypeAccess) == null) {
														if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_8B(
																eTypeAccess) == null) {
															if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_9BB(
																	eClassDeclaration, eTypeAccess) == null) {
																if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_0BBB(
																		eTypeAccess, eClassDeclaration,
																		eExtendedClass) == null) {
																	if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_10BB(
																			eExtendedClass, eTypeAccess) == null) {
																		_result.add(new Object[] { eClassDeclaration,
																				eTypeAccess, eExtendedClass,
																				_edge_superClass });
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassExtendsClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			ClassExtendsClass _this, Match match, ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess,
			ClassDeclaration eExtendedClass) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eClassDeclaration, eTypeAccess, eExtendedClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassExtendsClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassExtendsClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassExtendsClass_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_24_1_prepare_blackB(ClassExtendsClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassExtendsClass_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ClassExtendsClass_24_2_matchsrctrgcontext_bindingFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("eClassDeclaration");
		EObject _localVariable_1 = targetMatch.getObject("tClass");
		EObject _localVariable_2 = targetMatch.getObject("tExtendedClass");
		EObject _localVariable_3 = sourceMatch.getObject("eTypeAccess");
		EObject _localVariable_4 = sourceMatch.getObject("eExtendedClass");
		EObject tmpEClassDeclaration = _localVariable_0;
		EObject tmpTClass = _localVariable_1;
		EObject tmpTExtendedClass = _localVariable_2;
		EObject tmpETypeAccess = _localVariable_3;
		EObject tmpEExtendedClass = _localVariable_4;
		if (tmpEClassDeclaration instanceof ClassDeclaration) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (tmpTExtendedClass instanceof TClass) {
					TClass tExtendedClass = (TClass) tmpTExtendedClass;
					if (tmpETypeAccess instanceof TypeAccess) {
						TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
						if (tmpEExtendedClass instanceof ClassDeclaration) {
							ClassDeclaration eExtendedClass = (ClassDeclaration) tmpEExtendedClass;
							return new Object[] { eClassDeclaration, tClass, tExtendedClass, eTypeAccess,
									eExtendedClass, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_24_2_matchsrctrgcontext_blackBBBBBBB(
			ClassDeclaration eClassDeclaration, TClass tClass, TClass tExtendedClass, TypeAccess eTypeAccess,
			ClassDeclaration eExtendedClass, Match sourceMatch, Match targetMatch) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!tClass.equals(tExtendedClass)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { eClassDeclaration, tClass, tExtendedClass, eTypeAccess, eExtendedClass,
							sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ClassExtendsClass_24_2_matchsrctrgcontext_binding = pattern_ClassExtendsClass_24_2_matchsrctrgcontext_bindingFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_ClassExtendsClass_24_2_matchsrctrgcontext_binding != null) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result_pattern_ClassExtendsClass_24_2_matchsrctrgcontext_binding[0];
			TClass tClass = (TClass) result_pattern_ClassExtendsClass_24_2_matchsrctrgcontext_binding[1];
			TClass tExtendedClass = (TClass) result_pattern_ClassExtendsClass_24_2_matchsrctrgcontext_binding[2];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ClassExtendsClass_24_2_matchsrctrgcontext_binding[3];
			ClassDeclaration eExtendedClass = (ClassDeclaration) result_pattern_ClassExtendsClass_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_ClassExtendsClass_24_2_matchsrctrgcontext_black = pattern_ClassExtendsClass_24_2_matchsrctrgcontext_blackBBBBBBB(
					eClassDeclaration, tClass, tExtendedClass, eTypeAccess, eExtendedClass, sourceMatch, targetMatch);
			if (result_pattern_ClassExtendsClass_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { eClassDeclaration, tClass, tExtendedClass, eTypeAccess, eExtendedClass,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_24_3_solvecsp_bindingFBBBBBBBB(ClassExtendsClass _this,
			ClassDeclaration eClassDeclaration, TClass tClass, TClass tExtendedClass, TypeAccess eTypeAccess,
			ClassDeclaration eExtendedClass, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(eClassDeclaration, tClass, tExtendedClass, eTypeAccess,
				eExtendedClass, sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, eClassDeclaration, tClass, tExtendedClass, eTypeAccess, eExtendedClass,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassExtendsClass_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			ClassExtendsClass _this, ClassDeclaration eClassDeclaration, TClass tClass, TClass tExtendedClass,
			TypeAccess eTypeAccess, ClassDeclaration eExtendedClass, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ClassExtendsClass_24_3_solvecsp_binding = pattern_ClassExtendsClass_24_3_solvecsp_bindingFBBBBBBBB(
				_this, eClassDeclaration, tClass, tExtendedClass, eTypeAccess, eExtendedClass, sourceMatch,
				targetMatch);
		if (result_pattern_ClassExtendsClass_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ClassExtendsClass_24_3_solvecsp_binding[0];

			Object[] result_pattern_ClassExtendsClass_24_3_solvecsp_black = pattern_ClassExtendsClass_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ClassExtendsClass_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, eClassDeclaration, tClass, tExtendedClass, eTypeAccess,
						eExtendedClass, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassExtendsClass_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassExtendsClass_24_5_matchcorrcontext_blackBFBBBFBB(
			ClassDeclaration eClassDeclaration, TClass tClass, TClass tExtendedClass, ClassDeclaration eExtendedClass,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!tClass.equals(tExtendedClass)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (TypeToTAbstractType eClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tClass, TypeToTAbstractType.class, "target")) {
						if (eClassDeclaration.equals(eClassDeclarationToTClass.getSource())) {
							for (TypeToTAbstractType eExtendedClassToTExtendedClass : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(tExtendedClass, TypeToTAbstractType.class, "target")) {
								if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
									if (eExtendedClass.equals(eExtendedClassToTExtendedClass.getSource())) {
										_result.add(new Object[] { eClassDeclaration, eClassDeclarationToTClass, tClass,
												tExtendedClass, eExtendedClass, eExtendedClassToTExtendedClass,
												sourceMatch, targetMatch });
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

	public static final Object[] pattern_ClassExtendsClass_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType eClassDeclarationToTClass, TypeToTAbstractType eExtendedClassToTExtendedClass,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ClassExtendsClass";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eClassDeclarationToTClass);
		ccMatch.getAllContextElements().add(eExtendedClassToTExtendedClass);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eClassDeclarationToTClass, eExtendedClassToTExtendedClass, sourceMatch, targetMatch,
				ccMatch };
	}

	public static final Object[] pattern_ClassExtendsClass_24_6_createcorrespondence_blackBBBBBB(
			ClassDeclaration eClassDeclaration, TClass tClass, TClass tExtendedClass, TypeAccess eTypeAccess,
			ClassDeclaration eExtendedClass, CCMatch ccMatch) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!tClass.equals(tExtendedClass)) {
				return new Object[] { eClassDeclaration, tClass, tExtendedClass, eTypeAccess, eExtendedClass, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ClassExtendsClass_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ClassExtendsClass";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassExtendsClass_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_0BBB(TypeAccess eTypeAccess,
			ClassDeclaration eClassDeclaration, ClassDeclaration eExtendedClass) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			for (AbstractTypeDeclaration __DEC_eTypeAccess_superInterfaces_886624 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
				if (!eClassDeclaration.equals(__DEC_eTypeAccess_superInterfaces_886624)) {
					if (!eExtendedClass.equals(__DEC_eTypeAccess_superInterfaces_886624)) {
						return new Object[] { eTypeAccess, eClassDeclaration, eExtendedClass };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_1B(TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_687225 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_2B(TypeAccess eTypeAccess) {
		for (AnnotationTypeMemberDeclaration __DEC_eTypeAccess_type_96730 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_3B(TypeAccess eTypeAccess) {
		for (ArrayType __DEC_eTypeAccess_elementType_104810 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_4B(TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_92790 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_5B(TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_951557 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_6B(TypeAccess eTypeAccess) {
		for (ParameterizedType __DEC_eTypeAccess_type_495504 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ParameterizedType.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_7B(TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_128511 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_8B(TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_558527 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_9BB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess) {
		if (eClassDeclaration.getSuperInterfaces().contains(eTypeAccess)) {
			return new Object[] { eClassDeclaration, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_10BB(
			ClassDeclaration eExtendedClass, TypeAccess eTypeAccess) {
		if (eExtendedClass.getSuperInterfaces().contains(eTypeAccess)) {
			return new Object[] { eExtendedClass, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_blackBBB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess, ClassDeclaration eExtendedClass) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (eTypeAccess.equals(eClassDeclaration.getSuperClass())) {
				if (eExtendedClass.equals(eTypeAccess.getType())) {
					if (pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_0BBB(eTypeAccess, eClassDeclaration,
							eExtendedClass) == null) {
						if (pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_1B(eTypeAccess) == null) {
							if (pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_2B(eTypeAccess) == null) {
								if (pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_3B(eTypeAccess) == null) {
									if (pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_4B(
											eTypeAccess) == null) {
										if (pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_5B(
												eTypeAccess) == null) {
											if (pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_6B(
													eTypeAccess) == null) {
												if (pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_7B(
														eTypeAccess) == null) {
													if (pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_8B(
															eTypeAccess) == null) {
														if (pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_9BB(
																eClassDeclaration, eTypeAccess) == null) {
															if (pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_10BB(
																	eExtendedClass, eTypeAccess) == null) {
																return new Object[] { eClassDeclaration, eTypeAccess,
																		eExtendedClass };
															}
														}
													}
												}
											}
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

	public static final boolean pattern_ClassExtendsClass_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassExtendsClass_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_28_1_matchtggpattern_blackBB(TClass tClass,
			TClass tExtendedClass) {
		if (!tClass.equals(tExtendedClass)) {
			if (tClass.getParentClasses().contains(tExtendedClass)) {
				return new Object[] { tClass, tExtendedClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassExtendsClass_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassExtendsClass_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_29_1_createresult_blackB(ClassExtendsClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassExtendsClass_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ClassDeclaration eClassDeclaration) {
		if (ruleResult.getSourceObjects().contains(eClassDeclaration)) {
			return new Object[] { ruleResult, eClassDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eClassDeclarationToTClass) {
		if (ruleResult.getCorrObjects().contains(eClassDeclarationToTClass)) {
			return new Object[] { ruleResult, eClassDeclarationToTClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TClass tClass) {
		if (ruleResult.getTargetObjects().contains(tClass)) {
			return new Object[] { ruleResult, tClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TClass tExtendedClass) {
		if (ruleResult.getTargetObjects().contains(tExtendedClass)) {
			return new Object[] { ruleResult, tExtendedClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eExtendedClassToTExtendedClass) {
		if (ruleResult.getCorrObjects().contains(eExtendedClassToTExtendedClass)) {
			return new Object[] { ruleResult, eExtendedClassToTExtendedClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, ClassDeclaration eExtendedClass) {
		if (ruleResult.getSourceObjects().contains(eExtendedClass)) {
			return new Object[] { ruleResult, eExtendedClass };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassExtendsClass_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eClassDeclarationToTClassList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList eExtendedClassToTExtendedClassList : ruleEntryContainer.getRuleEntryList()) {
				if (!eClassDeclarationToTClassList.equals(eExtendedClassToTExtendedClassList)) {
					for (EObject tmpEClassDeclarationToTClass : eClassDeclarationToTClassList.getEntryObjects()) {
						if (tmpEClassDeclarationToTClass instanceof TypeToTAbstractType) {
							TypeToTAbstractType eClassDeclarationToTClass = (TypeToTAbstractType) tmpEClassDeclarationToTClass;
							Type tmpEClassDeclaration = eClassDeclarationToTClass.getSource();
							if (tmpEClassDeclaration instanceof ClassDeclaration) {
								ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
								TAbstractType tmpTClass = eClassDeclarationToTClass.getTarget();
								if (tmpTClass instanceof TClass) {
									TClass tClass = (TClass) tmpTClass;
									if (pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											eClassDeclarationToTClass) == null) {
										if (pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												eClassDeclaration) == null) {
											if (pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tClass) == null) {
												for (EObject tmpEExtendedClassToTExtendedClass : eExtendedClassToTExtendedClassList
														.getEntryObjects()) {
													if (tmpEExtendedClassToTExtendedClass instanceof TypeToTAbstractType) {
														TypeToTAbstractType eExtendedClassToTExtendedClass = (TypeToTAbstractType) tmpEExtendedClassToTExtendedClass;
														if (!eClassDeclarationToTClass
																.equals(eExtendedClassToTExtendedClass)) {
															TAbstractType tmpTExtendedClass = eExtendedClassToTExtendedClass
																	.getTarget();
															if (tmpTExtendedClass instanceof TClass) {
																TClass tExtendedClass = (TClass) tmpTExtendedClass;
																if (!tClass.equals(tExtendedClass)) {
																	Type tmpEExtendedClass = eExtendedClassToTExtendedClass
																			.getSource();
																	if (tmpEExtendedClass instanceof ClassDeclaration) {
																		ClassDeclaration eExtendedClass = (ClassDeclaration) tmpEExtendedClass;
																		if (!eClassDeclaration.equals(eExtendedClass)) {
																			if (pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_4BB(
																					ruleResult,
																					eExtendedClassToTExtendedClass) == null) {
																				if (pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_3BB(
																						ruleResult,
																						tExtendedClass) == null) {
																					if (pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_5BB(
																							ruleResult,
																							eExtendedClass) == null) {
																						_result.add(new Object[] {
																								eClassDeclarationToTClassList,
																								eClassDeclaration,
																								eClassDeclarationToTClass,
																								tClass,
																								eExtendedClassToTExtendedClassList,
																								tExtendedClass,
																								eExtendedClassToTExtendedClass,
																								eExtendedClass,
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

	public static final Object[] pattern_ClassExtendsClass_29_3_solveCSP_bindingFBBBBBBBBB(ClassExtendsClass _this,
			IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eClassDeclarationToTClass, TClass tClass, TClass tExtendedClass,
			ClassDeclaration eExtendedClass, TypeToTAbstractType eExtendedClassToTExtendedClass,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eClassDeclaration,
				eClassDeclarationToTClass, tClass, tExtendedClass, eExtendedClass, eExtendedClassToTExtendedClass,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eClassDeclaration, eClassDeclarationToTClass, tClass,
					tExtendedClass, eExtendedClass, eExtendedClassToTExtendedClass, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassExtendsClass_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			ClassExtendsClass _this, IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eClassDeclarationToTClass, TClass tClass, TClass tExtendedClass,
			ClassDeclaration eExtendedClass, TypeToTAbstractType eExtendedClassToTExtendedClass,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ClassExtendsClass_29_3_solveCSP_binding = pattern_ClassExtendsClass_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass,
				eExtendedClass, eExtendedClassToTExtendedClass, ruleResult);
		if (result_pattern_ClassExtendsClass_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassExtendsClass_29_3_solveCSP_binding[0];

			Object[] result_pattern_ClassExtendsClass_29_3_solveCSP_black = pattern_ClassExtendsClass_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ClassExtendsClass_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eClassDeclaration, eClassDeclarationToTClass,
						tClass, tExtendedClass, eExtendedClass, eExtendedClassToTExtendedClass, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassExtendsClass_29_4_checkCSP_expressionFBB(ClassExtendsClass _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassExtendsClass_29_5_checknacs_blackBBBBBB(
			ClassDeclaration eClassDeclaration, TypeToTAbstractType eClassDeclarationToTClass, TClass tClass,
			TClass tExtendedClass, ClassDeclaration eExtendedClass,
			TypeToTAbstractType eExtendedClassToTExtendedClass) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
				if (!tClass.equals(tExtendedClass)) {
					return new Object[] { eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass,
							eExtendedClass, eExtendedClassToTExtendedClass };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_29_6_perform_blackBBBBBBB(ClassDeclaration eClassDeclaration,
			TypeToTAbstractType eClassDeclarationToTClass, TClass tClass, TClass tExtendedClass,
			ClassDeclaration eExtendedClass, TypeToTAbstractType eExtendedClassToTExtendedClass,
			ModelgeneratorRuleResult ruleResult) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
				if (!tClass.equals(tExtendedClass)) {
					return new Object[] { eClassDeclaration, eClassDeclarationToTClass, tClass, tExtendedClass,
							eExtendedClass, eExtendedClassToTExtendedClass, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_29_6_perform_greenBBBFBB(ClassDeclaration eClassDeclaration,
			TClass tClass, TClass tExtendedClass, ClassDeclaration eExtendedClass,
			ModelgeneratorRuleResult ruleResult) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		tClass.getParentClasses().add(tExtendedClass);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		eClassDeclaration.setSuperClass(eTypeAccess);
		eTypeAccess.setType(eExtendedClass);
		ruleResult.getSourceObjects().add(eTypeAccess);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eClassDeclaration, tClass, tExtendedClass, eTypeAccess, eExtendedClass, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ClassExtendsClass_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ClassExtendsClassImpl
