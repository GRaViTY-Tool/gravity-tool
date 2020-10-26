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
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.ClassDeclarationToTClass;

import org.gravity.tgg.modisco.pm.Rules.ClassExtendsClass;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

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
	public boolean isAppropriate_FWD(Match match, TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration,
			ClassDeclaration eExtendedClass) {

		Object[] result1_black = ClassExtendsClassImpl.pattern_ClassExtendsClass_0_1_initialbindings_blackBBBBB(this,
				match, eTypeAccess, eClassDeclaration, eExtendedClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eClassDeclaration] = "
					+ eClassDeclaration + ", " + "[eExtendedClass] = " + eExtendedClass + ".");
		}

		Object[] result2_bindingAndBlack = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, eTypeAccess,
						eClassDeclaration, eExtendedClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eClassDeclaration] = "
					+ eClassDeclaration + ", " + "[eExtendedClass] = " + eExtendedClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassExtendsClassImpl.pattern_ClassExtendsClass_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassExtendsClassImpl
					.pattern_ClassExtendsClass_0_4_collectelementstobetranslated_blackBBBB(match, eTypeAccess,
							eClassDeclaration, eExtendedClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
						+ "[eExtendedClass] = " + eExtendedClass + ".");
			}
			ClassExtendsClassImpl.pattern_ClassExtendsClass_0_4_collectelementstobetranslated_greenBBBBFFF(match,
					eTypeAccess, eClassDeclaration, eExtendedClass);
			//nothing EMoflonEdge eTypeAccess__eExtendedClass____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge eExtendedClass__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superClass = (EMoflonEdge) result4_green[6];

			Object[] result5_black = ClassExtendsClassImpl
					.pattern_ClassExtendsClass_0_5_collectcontextelements_blackBBBB(match, eTypeAccess,
							eClassDeclaration, eExtendedClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
						+ "[eExtendedClass] = " + eExtendedClass + ".");
			}
			ClassExtendsClassImpl.pattern_ClassExtendsClass_0_5_collectcontextelements_greenBBB(match,
					eClassDeclaration, eExtendedClass);

			// 
			ClassExtendsClassImpl.pattern_ClassExtendsClass_0_6_registerobjectstomatch_expressionBBBBB(this, match,
					eTypeAccess, eClassDeclaration, eExtendedClass);
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
		TypeAccess eTypeAccess = (TypeAccess) result1_bindingAndBlack[0];
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result1_bindingAndBlack[1];
		ClassDeclarationToTClass eClassDeclarationToTClass = (ClassDeclarationToTClass) result1_bindingAndBlack[2];
		ClassDeclarationToTClass eExtendedClassToTExtendedClass = (ClassDeclarationToTClass) result1_bindingAndBlack[3];
		ClassDeclaration eExtendedClass = (ClassDeclaration) result1_bindingAndBlack[4];
		TClass tExtendedClass = (TClass) result1_bindingAndBlack[5];
		TClass tClass = (TClass) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		ClassExtendsClassImpl.pattern_ClassExtendsClass_1_1_performtransformation_greenBB(tExtendedClass, tClass);

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
				ruleresult, eTypeAccess, eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass,
				eExtendedClass, tExtendedClass, tClass);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eClassDeclaration] = " + eClassDeclaration
					+ ", " + "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass + ", "
					+ "[eExtendedClassToTExtendedClass] = " + eExtendedClassToTExtendedClass + ", "
					+ "[eExtendedClass] = " + eExtendedClass + ", " + "[tExtendedClass] = " + tExtendedClass + ", "
					+ "[tClass] = " + tClass + ".");
		}
		ClassExtendsClassImpl.pattern_ClassExtendsClass_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				eTypeAccess, eClassDeclaration, eExtendedClass, tExtendedClass, tClass);
		//nothing EMoflonEdge eTypeAccess__eExtendedClass____type = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge eExtendedClass__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tClass__tExtendedClass____parentClass = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tExtendedClass__tClass____childClasses = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superClass = (EMoflonEdge) result3_green[10];

		// 
		// 
		ClassExtendsClassImpl.pattern_ClassExtendsClass_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
				eTypeAccess, eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass,
				eExtendedClass, tExtendedClass, tClass);
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
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[0];
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_binding[1];
		ClassDeclaration eExtendedClass = (ClassDeclaration) result2_binding[2];
		for (Object[] result2_black : ClassExtendsClassImpl.pattern_ClassExtendsClass_2_2_corematch_blackBBFFBFFB(
				eTypeAccess, eClassDeclaration, eExtendedClass, match)) {
			ClassDeclarationToTClass eClassDeclarationToTClass = (ClassDeclarationToTClass) result2_black[2];
			ClassDeclarationToTClass eExtendedClassToTExtendedClass = (ClassDeclarationToTClass) result2_black[3];
			TClass tExtendedClass = (TClass) result2_black[5];
			TClass tClass = (TClass) result2_black[6];
			// ForEach 
			for (Object[] result3_black : ClassExtendsClassImpl.pattern_ClassExtendsClass_2_3_findcontext_blackBBBBBBB(
					eTypeAccess, eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass,
					eExtendedClass, tExtendedClass, tClass)) {
				Object[] result3_green = ClassExtendsClassImpl
						.pattern_ClassExtendsClass_2_3_findcontext_greenBBBBBBBFFFFFFFF(eTypeAccess, eClassDeclaration,
								eClassDeclarationToTClass, eExtendedClassToTExtendedClass, eExtendedClass,
								tExtendedClass, tClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge eTypeAccess__eExtendedClass____type = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eExtendedClass__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eExtendedClassToTExtendedClass__tExtendedClass____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superClass = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge eExtendedClassToTExtendedClass__eExtendedClass____source = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = ClassExtendsClassImpl
						.pattern_ClassExtendsClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								eTypeAccess, eClassDeclaration, eClassDeclarationToTClass,
								eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eTypeAccess] = " + eTypeAccess
							+ ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
							+ "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass + ", "
							+ "[eExtendedClassToTExtendedClass] = " + eExtendedClassToTExtendedClass + ", "
							+ "[eExtendedClass] = " + eExtendedClass + ", " + "[tExtendedClass] = " + tExtendedClass
							+ ", " + "[tClass] = " + tClass + ".");
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
	public void registerObjectsToMatch_FWD(Match match, TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration,
			ClassDeclaration eExtendedClass) {
		match.registerObject("eTypeAccess", eTypeAccess);
		match.registerObject("eClassDeclaration", eClassDeclaration);
		match.registerObject("eExtendedClass", eExtendedClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeAccess eTypeAccess,
			ClassDeclaration eClassDeclaration, ClassDeclarationToTClass eClassDeclarationToTClass,
			ClassDeclarationToTClass eExtendedClassToTExtendedClass, ClassDeclaration eExtendedClass,
			TClass tExtendedClass, TClass tClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
		isApplicableMatch.registerObject("eClassDeclaration", eClassDeclaration);
		isApplicableMatch.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		isApplicableMatch.registerObject("eExtendedClassToTExtendedClass", eExtendedClassToTExtendedClass);
		isApplicableMatch.registerObject("eExtendedClass", eExtendedClass);
		isApplicableMatch.registerObject("tExtendedClass", tExtendedClass);
		isApplicableMatch.registerObject("tClass", tClass);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eTypeAccess, EObject eClassDeclaration,
			EObject eClassDeclarationToTClass, EObject eExtendedClassToTExtendedClass, EObject eExtendedClass,
			EObject tExtendedClass, EObject tClass) {
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("eClassDeclaration", eClassDeclaration);
		ruleresult.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		ruleresult.registerObject("eExtendedClassToTExtendedClass", eExtendedClassToTExtendedClass);
		ruleresult.registerObject("eExtendedClass", eExtendedClass);
		ruleresult.registerObject("tExtendedClass", tExtendedClass);
		ruleresult.registerObject("tClass", tClass);

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
	public boolean isAppropriate_BWD(Match match, TClass tExtendedClass, TClass tClass) {

		Object[] result1_black = ClassExtendsClassImpl.pattern_ClassExtendsClass_10_1_initialbindings_blackBBBB(this,
				match, tExtendedClass, tClass);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tExtendedClass] = " + tExtendedClass + ", " + "[tClass] = " + tClass + ".");
		}

		Object[] result2_bindingAndBlack = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tExtendedClass, tClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tExtendedClass] = " + tExtendedClass + ", " + "[tClass] = " + tClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassExtendsClassImpl.pattern_ClassExtendsClass_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassExtendsClassImpl
					.pattern_ClassExtendsClass_10_4_collectelementstobetranslated_blackBBB(match, tExtendedClass,
							tClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tExtendedClass] = " + tExtendedClass + ", " + "[tClass] = " + tClass + ".");
			}
			ClassExtendsClassImpl.pattern_ClassExtendsClass_10_4_collectelementstobetranslated_greenBBBFF(match,
					tExtendedClass, tClass);
			//nothing EMoflonEdge tClass__tExtendedClass____parentClass = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tExtendedClass__tClass____childClasses = (EMoflonEdge) result4_green[4];

			Object[] result5_black = ClassExtendsClassImpl
					.pattern_ClassExtendsClass_10_5_collectcontextelements_blackBBB(match, tExtendedClass, tClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tExtendedClass] = " + tExtendedClass + ", " + "[tClass] = " + tClass + ".");
			}
			ClassExtendsClassImpl.pattern_ClassExtendsClass_10_5_collectcontextelements_greenBBB(match, tExtendedClass,
					tClass);

			// 
			ClassExtendsClassImpl.pattern_ClassExtendsClass_10_6_registerobjectstomatch_expressionBBBB(this, match,
					tExtendedClass, tClass);
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
		ClassDeclarationToTClass eClassDeclarationToTClass = (ClassDeclarationToTClass) result1_bindingAndBlack[1];
		ClassDeclarationToTClass eExtendedClassToTExtendedClass = (ClassDeclarationToTClass) result1_bindingAndBlack[2];
		ClassDeclaration eExtendedClass = (ClassDeclaration) result1_bindingAndBlack[3];
		TClass tExtendedClass = (TClass) result1_bindingAndBlack[4];
		TClass tClass = (TClass) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_11_1_performtransformation_greenFBB(eClassDeclaration, eExtendedClass);
		TypeAccess eTypeAccess = (TypeAccess) result1_green[0];

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
				ruleresult, eTypeAccess, eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass,
				eExtendedClass, tExtendedClass, tClass);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eClassDeclaration] = " + eClassDeclaration
					+ ", " + "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass + ", "
					+ "[eExtendedClassToTExtendedClass] = " + eExtendedClassToTExtendedClass + ", "
					+ "[eExtendedClass] = " + eExtendedClass + ", " + "[tExtendedClass] = " + tExtendedClass + ", "
					+ "[tClass] = " + tClass + ".");
		}
		ClassExtendsClassImpl.pattern_ClassExtendsClass_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				eTypeAccess, eClassDeclaration, eExtendedClass, tExtendedClass, tClass);
		//nothing EMoflonEdge eTypeAccess__eExtendedClass____type = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge eExtendedClass__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tClass__tExtendedClass____parentClass = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tExtendedClass__tClass____childClasses = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eClassDeclaration__eTypeAccess____superClass = (EMoflonEdge) result3_green[10];

		// 
		// 
		ClassExtendsClassImpl.pattern_ClassExtendsClass_11_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
				eTypeAccess, eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass,
				eExtendedClass, tExtendedClass, tClass);
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
		TClass tExtendedClass = (TClass) result2_binding[0];
		TClass tClass = (TClass) result2_binding[1];
		for (Object[] result2_black : ClassExtendsClassImpl
				.pattern_ClassExtendsClass_12_2_corematch_blackFFFFBBB(tExtendedClass, tClass, match)) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_black[0];
			ClassDeclarationToTClass eClassDeclarationToTClass = (ClassDeclarationToTClass) result2_black[1];
			ClassDeclarationToTClass eExtendedClassToTExtendedClass = (ClassDeclarationToTClass) result2_black[2];
			ClassDeclaration eExtendedClass = (ClassDeclaration) result2_black[3];
			// ForEach 
			for (Object[] result3_black : ClassExtendsClassImpl.pattern_ClassExtendsClass_12_3_findcontext_blackBBBBBB(
					eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass, eExtendedClass,
					tExtendedClass, tClass)) {
				Object[] result3_green = ClassExtendsClassImpl
						.pattern_ClassExtendsClass_12_3_findcontext_greenBBBBBBFFFFFFF(eClassDeclaration,
								eClassDeclarationToTClass, eExtendedClassToTExtendedClass, eExtendedClass,
								tExtendedClass, tClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge eExtendedClassToTExtendedClass__tExtendedClass____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tClass__tExtendedClass____parentClass = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tExtendedClass__tClass____childClasses = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eExtendedClassToTExtendedClass__eExtendedClass____source = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = ClassExtendsClassImpl
						.pattern_ClassExtendsClass_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass,
								eExtendedClass, tExtendedClass, tClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eClassDeclaration] = "
							+ eClassDeclaration + ", " + "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass
							+ ", " + "[eExtendedClassToTExtendedClass] = " + eExtendedClassToTExtendedClass + ", "
							+ "[eExtendedClass] = " + eExtendedClass + ", " + "[tExtendedClass] = " + tExtendedClass
							+ ", " + "[tClass] = " + tClass + ".");
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
	public void registerObjectsToMatch_BWD(Match match, TClass tExtendedClass, TClass tClass) {
		match.registerObject("tExtendedClass", tExtendedClass);
		match.registerObject("tClass", tClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tExtendedClass, TClass tClass) {// Create CSP
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
			ClassDeclarationToTClass eClassDeclarationToTClass, ClassDeclarationToTClass eExtendedClassToTExtendedClass,
			ClassDeclaration eExtendedClass, TClass tExtendedClass, TClass tClass) {// Create CSP
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
		isApplicableMatch.registerObject("eExtendedClassToTExtendedClass", eExtendedClassToTExtendedClass);
		isApplicableMatch.registerObject("eExtendedClass", eExtendedClass);
		isApplicableMatch.registerObject("tExtendedClass", tExtendedClass);
		isApplicableMatch.registerObject("tClass", tClass);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject eTypeAccess, EObject eClassDeclaration,
			EObject eClassDeclarationToTClass, EObject eExtendedClassToTExtendedClass, EObject eExtendedClass,
			EObject tExtendedClass, EObject tClass) {
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("eClassDeclaration", eClassDeclaration);
		ruleresult.registerObject("eClassDeclarationToTClass", eClassDeclarationToTClass);
		ruleresult.registerObject("eExtendedClassToTExtendedClass", eExtendedClassToTExtendedClass);
		ruleresult.registerObject("eExtendedClass", eExtendedClass);
		ruleresult.registerObject("tExtendedClass", tExtendedClass);
		ruleresult.registerObject("tClass", tClass);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_83(EMoflonEdge _edge_parentClass) {

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
				.pattern_ClassExtendsClass_20_2_testcorematchandDECs_blackFFB(_edge_parentClass)) {
			TClass tExtendedClass = (TClass) result2_black[0];
			TClass tClass = (TClass) result2_black[1];
			Object[] result2_green = ClassExtendsClassImpl
					.pattern_ClassExtendsClass_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassExtendsClassImpl
					.pattern_ClassExtendsClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, tExtendedClass, tClass)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_85(EMoflonEdge _edge_type) {

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
				.pattern_ClassExtendsClass_21_2_testcorematchandDECs_blackFFFB(_edge_type)) {
			TypeAccess eTypeAccess = (TypeAccess) result2_black[0];
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_black[1];
			ClassDeclaration eExtendedClass = (ClassDeclaration) result2_black[2];
			Object[] result2_green = ClassExtendsClassImpl
					.pattern_ClassExtendsClass_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassExtendsClassImpl
					.pattern_ClassExtendsClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, eTypeAccess, eClassDeclaration, eExtendedClass)) {
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
		TypeAccess eTypeAccess = (TypeAccess) result2_bindingAndBlack[0];
		ClassDeclaration eClassDeclaration = (ClassDeclaration) result2_bindingAndBlack[1];
		ClassDeclaration eExtendedClass = (ClassDeclaration) result2_bindingAndBlack[2];
		TClass tExtendedClass = (TClass) result2_bindingAndBlack[3];
		TClass tClass = (TClass) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, eTypeAccess, eClassDeclaration,
						eExtendedClass, tExtendedClass, tClass, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
					+ "[eExtendedClass] = " + eExtendedClass + ", " + "[tExtendedClass] = " + tExtendedClass + ", "
					+ "[tClass] = " + tClass + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ClassExtendsClassImpl.pattern_ClassExtendsClass_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ClassExtendsClassImpl
					.pattern_ClassExtendsClass_24_5_matchcorrcontext_blackBFFBBBBB(eClassDeclaration, eExtendedClass,
							tExtendedClass, tClass, sourceMatch, targetMatch)) {
				ClassDeclarationToTClass eClassDeclarationToTClass = (ClassDeclarationToTClass) result5_black[1];
				ClassDeclarationToTClass eExtendedClassToTExtendedClass = (ClassDeclarationToTClass) result5_black[2];
				Object[] result5_green = ClassExtendsClassImpl
						.pattern_ClassExtendsClass_24_5_matchcorrcontext_greenBBBBF(eClassDeclarationToTClass,
								eExtendedClassToTExtendedClass, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = ClassExtendsClassImpl
						.pattern_ClassExtendsClass_24_6_createcorrespondence_blackBBBBBB(eTypeAccess, eClassDeclaration,
								eExtendedClass, tExtendedClass, tClass, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eTypeAccess] = "
							+ eTypeAccess + ", " + "[eClassDeclaration] = " + eClassDeclaration + ", "
							+ "[eExtendedClass] = " + eExtendedClass + ", " + "[tExtendedClass] = " + tExtendedClass
							+ ", " + "[tClass] = " + tClass + ", " + "[ccMatch] = " + ccMatch + ".");
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
	public CSP isApplicable_solveCsp_CC(TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration,
			ClassDeclaration eExtendedClass, TClass tExtendedClass, TClass tClass, Match sourceMatch,
			Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration,
			ClassDeclaration eExtendedClass) {// 
		Object[] result1_black = ClassExtendsClassImpl.pattern_ClassExtendsClass_27_1_matchtggpattern_blackBBB(
				eTypeAccess, eClassDeclaration, eExtendedClass);
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
	public boolean checkDEC_BWD(TClass tExtendedClass, TClass tClass) {// 
		Object[] result1_black = ClassExtendsClassImpl
				.pattern_ClassExtendsClass_28_1_matchtggpattern_blackBB(tExtendedClass, tClass);
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
			ClassDeclarationToTClass eClassDeclarationToTClassParameter,
			ClassDeclarationToTClass eExtendedClassToTExtendedClassParameter) {

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
			ClassDeclarationToTClass eClassDeclarationToTClass = (ClassDeclarationToTClass) result2_black[2];
			TClass tClass = (TClass) result2_black[3];
			//nothing RuleEntryList eExtendedClassToTExtendedClassList = (RuleEntryList) result2_black[4];
			ClassDeclarationToTClass eExtendedClassToTExtendedClass = (ClassDeclarationToTClass) result2_black[5];
			TClass tExtendedClass = (TClass) result2_black[6];
			ClassDeclaration eExtendedClass = (ClassDeclaration) result2_black[7];

			Object[] result3_bindingAndBlack = ClassExtendsClassImpl
					.pattern_ClassExtendsClass_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass,
							eExtendedClass, tExtendedClass, tClass, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eClassDeclaration] = "
						+ eClassDeclaration + ", " + "[eClassDeclarationToTClass] = " + eClassDeclarationToTClass + ", "
						+ "[eExtendedClassToTExtendedClass] = " + eExtendedClassToTExtendedClass + ", "
						+ "[eExtendedClass] = " + eExtendedClass + ", " + "[tExtendedClass] = " + tExtendedClass + ", "
						+ "[tClass] = " + tClass + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ClassExtendsClassImpl.pattern_ClassExtendsClass_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ClassExtendsClassImpl.pattern_ClassExtendsClass_29_5_checknacs_blackBBBBBB(
						eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass, eExtendedClass,
						tExtendedClass, tClass);
				if (result5_black != null) {

					Object[] result6_black = ClassExtendsClassImpl.pattern_ClassExtendsClass_29_6_perform_blackBBBBBBB(
							eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass,
							eExtendedClass, tExtendedClass, tClass, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[eClassDeclaration] = " + eClassDeclaration + ", " + "[eClassDeclarationToTClass] = "
								+ eClassDeclarationToTClass + ", " + "[eExtendedClassToTExtendedClass] = "
								+ eExtendedClassToTExtendedClass + ", " + "[eExtendedClass] = " + eExtendedClass + ", "
								+ "[tExtendedClass] = " + tExtendedClass + ", " + "[tClass] = " + tClass + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					ClassExtendsClassImpl.pattern_ClassExtendsClass_29_6_perform_greenFBBBBB(eClassDeclaration,
							eExtendedClass, tExtendedClass, tClass, ruleResult);
					//nothing TypeAccess eTypeAccess = (TypeAccess) result6_green[0];

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
			ClassDeclarationToTClass eClassDeclarationToTClass, ClassDeclarationToTClass eExtendedClassToTExtendedClass,
			ClassDeclaration eExtendedClass, TClass tExtendedClass, TClass tClass,
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
		isApplicableMatch.registerObject("eExtendedClassToTExtendedClass", eExtendedClassToTExtendedClass);
		isApplicableMatch.registerObject("eExtendedClass", eExtendedClass);
		isApplicableMatch.registerObject("tExtendedClass", tExtendedClass);
		isApplicableMatch.registerObject("tClass", tClass);
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
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPROPRIATE_FWD__MATCH_TYPEACCESS_CLASSDECLARATION_CLASSDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (ClassDeclaration) arguments.get(3));
		case RulesPackage.CLASS_EXTENDS_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPEACCESS_CLASSDECLARATION_CLASSDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (ClassDeclaration) arguments.get(3));
			return null;
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPEACCESS_CLASSDECLARATION_CLASSDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (ClassDeclaration) arguments.get(3));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPEACCESS_CLASSDECLARATION_CLASSDECLARATIONTOTCLASS_CLASSDECLARATIONTOTCLASS_CLASSDECLARATION_TCLASS_TCLASS:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TypeAccess) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (ClassDeclarationToTClass) arguments.get(3),
					(ClassDeclarationToTClass) arguments.get(4), (ClassDeclaration) arguments.get(5),
					(TClass) arguments.get(6), (TClass) arguments.get(7));
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
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDECLARATION_CLASSDECLARATIONTOTCLASS_CLASSDECLARATIONTOTCLASS_CLASSDECLARATION_TCLASS_TCLASS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(ClassDeclarationToTClass) arguments.get(2), (ClassDeclarationToTClass) arguments.get(3),
					(ClassDeclaration) arguments.get(4), (TClass) arguments.get(5), (TClass) arguments.get(6));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.CLASS_EXTENDS_CLASS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_83__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_83((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_85__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_85((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__TYPEACCESS_CLASSDECLARATION_CLASSDECLARATION_TCLASS_TCLASS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TypeAccess) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (TClass) arguments.get(3), (TClass) arguments.get(4),
					(Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.CLASS_EXTENDS_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CLASS_EXTENDS_CLASS___CHECK_DEC_FWD__TYPEACCESS_CLASSDECLARATION_CLASSDECLARATION:
			return checkDEC_FWD((TypeAccess) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(ClassDeclaration) arguments.get(2));
		case RulesPackage.CLASS_EXTENDS_CLASS___CHECK_DEC_BWD__TCLASS_TCLASS:
			return checkDEC_BWD((TClass) arguments.get(0), (TClass) arguments.get(1));
		case RulesPackage.CLASS_EXTENDS_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER_CLASSDECLARATIONTOTCLASS_CLASSDECLARATIONTOTCLASS:
			return generateModel((RuleEntryContainer) arguments.get(0), (ClassDeclarationToTClass) arguments.get(1),
					(ClassDeclarationToTClass) arguments.get(2));
		case RulesPackage.CLASS_EXTENDS_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSDECLARATION_CLASSDECLARATIONTOTCLASS_CLASSDECLARATIONTOTCLASS_CLASSDECLARATION_TCLASS_TCLASS_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(ClassDeclarationToTClass) arguments.get(2), (ClassDeclarationToTClass) arguments.get(3),
					(ClassDeclaration) arguments.get(4), (TClass) arguments.get(5), (TClass) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.CLASS_EXTENDS_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ClassExtendsClass_0_1_initialbindings_blackBBBBB(ClassExtendsClass _this,
			Match match, TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration, ClassDeclaration eExtendedClass) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			return new Object[] { _this, match, eTypeAccess, eClassDeclaration, eExtendedClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_0_2_SolveCSP_bindingFBBBBB(ClassExtendsClass _this,
			Match match, TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration, ClassDeclaration eExtendedClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eTypeAccess, eClassDeclaration, eExtendedClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eTypeAccess, eClassDeclaration, eExtendedClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassExtendsClass_0_2_SolveCSP_bindingAndBlackFBBBBB(ClassExtendsClass _this,
			Match match, TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration, ClassDeclaration eExtendedClass) {
		Object[] result_pattern_ClassExtendsClass_0_2_SolveCSP_binding = pattern_ClassExtendsClass_0_2_SolveCSP_bindingFBBBBB(
				_this, match, eTypeAccess, eClassDeclaration, eExtendedClass);
		if (result_pattern_ClassExtendsClass_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassExtendsClass_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassExtendsClass_0_2_SolveCSP_black = pattern_ClassExtendsClass_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassExtendsClass_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eTypeAccess, eClassDeclaration, eExtendedClass };
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
			TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration, ClassDeclaration eExtendedClass) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			return new Object[] { match, eTypeAccess, eClassDeclaration, eExtendedClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_0_4_collectelementstobetranslated_greenBBBBFFF(Match match,
			TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration, ClassDeclaration eExtendedClass) {
		EMoflonEdge eTypeAccess__eExtendedClass____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eExtendedClass__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclaration__eTypeAccess____superClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eTypeAccess);
		String eTypeAccess__eExtendedClass____type_name_prime = "type";
		String eExtendedClass__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eClassDeclaration__eTypeAccess____superClass_name_prime = "superClass";
		eTypeAccess__eExtendedClass____type.setSrc(eTypeAccess);
		eTypeAccess__eExtendedClass____type.setTrg(eExtendedClass);
		match.getToBeTranslatedEdges().add(eTypeAccess__eExtendedClass____type);
		eExtendedClass__eTypeAccess____usagesInTypeAccess.setSrc(eExtendedClass);
		eExtendedClass__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eExtendedClass__eTypeAccess____usagesInTypeAccess);
		eClassDeclaration__eTypeAccess____superClass.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superClass.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eClassDeclaration__eTypeAccess____superClass);
		eTypeAccess__eExtendedClass____type.setName(eTypeAccess__eExtendedClass____type_name_prime);
		eExtendedClass__eTypeAccess____usagesInTypeAccess
				.setName(eExtendedClass__eTypeAccess____usagesInTypeAccess_name_prime);
		eClassDeclaration__eTypeAccess____superClass.setName(eClassDeclaration__eTypeAccess____superClass_name_prime);
		return new Object[] { match, eTypeAccess, eClassDeclaration, eExtendedClass,
				eTypeAccess__eExtendedClass____type, eExtendedClass__eTypeAccess____usagesInTypeAccess,
				eClassDeclaration__eTypeAccess____superClass };
	}

	public static final Object[] pattern_ClassExtendsClass_0_5_collectcontextelements_blackBBBB(Match match,
			TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration, ClassDeclaration eExtendedClass) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			return new Object[] { match, eTypeAccess, eClassDeclaration, eExtendedClass };
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
			ClassExtendsClass _this, Match match, TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration,
			ClassDeclaration eExtendedClass) {
		_this.registerObjectsToMatch_FWD(match, eTypeAccess, eClassDeclaration, eExtendedClass);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("eTypeAccess");
		EObject _localVariable_1 = isApplicableMatch.getObject("eClassDeclaration");
		EObject _localVariable_2 = isApplicableMatch.getObject("eClassDeclarationToTClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("eExtendedClassToTExtendedClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("eExtendedClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("tExtendedClass");
		EObject _localVariable_6 = isApplicableMatch.getObject("tClass");
		EObject tmpETypeAccess = _localVariable_0;
		EObject tmpEClassDeclaration = _localVariable_1;
		EObject tmpEClassDeclarationToTClass = _localVariable_2;
		EObject tmpEExtendedClassToTExtendedClass = _localVariable_3;
		EObject tmpEExtendedClass = _localVariable_4;
		EObject tmpTExtendedClass = _localVariable_5;
		EObject tmpTClass = _localVariable_6;
		if (tmpETypeAccess instanceof TypeAccess) {
			TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
			if (tmpEClassDeclaration instanceof ClassDeclaration) {
				ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
				if (tmpEClassDeclarationToTClass instanceof ClassDeclarationToTClass) {
					ClassDeclarationToTClass eClassDeclarationToTClass = (ClassDeclarationToTClass) tmpEClassDeclarationToTClass;
					if (tmpEExtendedClassToTExtendedClass instanceof ClassDeclarationToTClass) {
						ClassDeclarationToTClass eExtendedClassToTExtendedClass = (ClassDeclarationToTClass) tmpEExtendedClassToTExtendedClass;
						if (tmpEExtendedClass instanceof ClassDeclaration) {
							ClassDeclaration eExtendedClass = (ClassDeclaration) tmpEExtendedClass;
							if (tmpTExtendedClass instanceof TClass) {
								TClass tExtendedClass = (TClass) tmpTExtendedClass;
								if (tmpTClass instanceof TClass) {
									TClass tClass = (TClass) tmpTClass;
									return new Object[] { eTypeAccess, eClassDeclaration, eClassDeclarationToTClass,
											eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass,
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
			TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration,
			ClassDeclarationToTClass eClassDeclarationToTClass, ClassDeclarationToTClass eExtendedClassToTExtendedClass,
			ClassDeclaration eExtendedClass, TClass tExtendedClass, TClass tClass, ClassExtendsClass _this,
			IsApplicableMatch isApplicableMatch) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
				if (!tClass.equals(tExtendedClass)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { eTypeAccess, eClassDeclaration, eClassDeclarationToTClass,
									eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass, csp, _this,
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
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ClassExtendsClass_1_1_performtransformation_binding[0];
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result_pattern_ClassExtendsClass_1_1_performtransformation_binding[1];
			ClassDeclarationToTClass eClassDeclarationToTClass = (ClassDeclarationToTClass) result_pattern_ClassExtendsClass_1_1_performtransformation_binding[2];
			ClassDeclarationToTClass eExtendedClassToTExtendedClass = (ClassDeclarationToTClass) result_pattern_ClassExtendsClass_1_1_performtransformation_binding[3];
			ClassDeclaration eExtendedClass = (ClassDeclaration) result_pattern_ClassExtendsClass_1_1_performtransformation_binding[4];
			TClass tExtendedClass = (TClass) result_pattern_ClassExtendsClass_1_1_performtransformation_binding[5];
			TClass tClass = (TClass) result_pattern_ClassExtendsClass_1_1_performtransformation_binding[6];

			Object[] result_pattern_ClassExtendsClass_1_1_performtransformation_black = pattern_ClassExtendsClass_1_1_performtransformation_blackBBBBBBBFBB(
					eTypeAccess, eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass,
					eExtendedClass, tExtendedClass, tClass, _this, isApplicableMatch);
			if (result_pattern_ClassExtendsClass_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassExtendsClass_1_1_performtransformation_black[7];

				return new Object[] { eTypeAccess, eClassDeclaration, eClassDeclarationToTClass,
						eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_1_1_performtransformation_greenBB(TClass tExtendedClass,
			TClass tClass) {
		tClass.setParentClass(tExtendedClass);
		return new Object[] { tExtendedClass, tClass };
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
			PerformRuleResult ruleresult, EObject eTypeAccess, EObject eClassDeclaration,
			EObject eClassDeclarationToTClass, EObject eExtendedClassToTExtendedClass, EObject eExtendedClass,
			EObject tExtendedClass, EObject tClass) {
		if (!eTypeAccess.equals(tExtendedClass)) {
			if (!eTypeAccess.equals(tClass)) {
				if (!eClassDeclaration.equals(eTypeAccess)) {
					if (!eClassDeclaration.equals(eClassDeclarationToTClass)) {
						if (!eClassDeclaration.equals(eExtendedClassToTExtendedClass)) {
							if (!eClassDeclaration.equals(eExtendedClass)) {
								if (!eClassDeclaration.equals(tExtendedClass)) {
									if (!eClassDeclaration.equals(tClass)) {
										if (!eClassDeclarationToTClass.equals(eTypeAccess)) {
											if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
												if (!eClassDeclarationToTClass.equals(eExtendedClass)) {
													if (!eClassDeclarationToTClass.equals(tExtendedClass)) {
														if (!eClassDeclarationToTClass.equals(tClass)) {
															if (!eExtendedClassToTExtendedClass.equals(eTypeAccess)) {
																if (!eExtendedClassToTExtendedClass
																		.equals(tExtendedClass)) {
																	if (!eExtendedClassToTExtendedClass
																			.equals(tClass)) {
																		if (!eExtendedClass.equals(eTypeAccess)) {
																			if (!eExtendedClass.equals(
																					eExtendedClassToTExtendedClass)) {
																				if (!eExtendedClass
																						.equals(tExtendedClass)) {
																					if (!eExtendedClass
																							.equals(tClass)) {
																						if (!tClass.equals(
																								tExtendedClass)) {
																							return new Object[] {
																									ruleresult,
																									eTypeAccess,
																									eClassDeclaration,
																									eClassDeclarationToTClass,
																									eExtendedClassToTExtendedClass,
																									eExtendedClass,
																									tExtendedClass,
																									tClass };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject eTypeAccess, EObject eClassDeclaration, EObject eExtendedClass,
			EObject tExtendedClass, EObject tClass) {
		EMoflonEdge eTypeAccess__eExtendedClass____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eExtendedClass__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tExtendedClass____parentClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tExtendedClass__tClass____childClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclaration__eTypeAccess____superClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassExtendsClass";
		String eTypeAccess__eExtendedClass____type_name_prime = "type";
		String eExtendedClass__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String tClass__tExtendedClass____parentClass_name_prime = "parentClass";
		String tExtendedClass__tClass____childClasses_name_prime = "childClasses";
		String eClassDeclaration__eTypeAccess____superClass_name_prime = "superClass";
		eTypeAccess__eExtendedClass____type.setSrc(eTypeAccess);
		eTypeAccess__eExtendedClass____type.setTrg(eExtendedClass);
		ruleresult.getTranslatedEdges().add(eTypeAccess__eExtendedClass____type);
		eExtendedClass__eTypeAccess____usagesInTypeAccess.setSrc(eExtendedClass);
		eExtendedClass__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eExtendedClass__eTypeAccess____usagesInTypeAccess);
		tClass__tExtendedClass____parentClass.setSrc(tClass);
		tClass__tExtendedClass____parentClass.setTrg(tExtendedClass);
		ruleresult.getCreatedEdges().add(tClass__tExtendedClass____parentClass);
		tExtendedClass__tClass____childClasses.setSrc(tExtendedClass);
		tExtendedClass__tClass____childClasses.setTrg(tClass);
		ruleresult.getCreatedEdges().add(tExtendedClass__tClass____childClasses);
		eClassDeclaration__eTypeAccess____superClass.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superClass.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eClassDeclaration__eTypeAccess____superClass);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eTypeAccess__eExtendedClass____type.setName(eTypeAccess__eExtendedClass____type_name_prime);
		eExtendedClass__eTypeAccess____usagesInTypeAccess
				.setName(eExtendedClass__eTypeAccess____usagesInTypeAccess_name_prime);
		tClass__tExtendedClass____parentClass.setName(tClass__tExtendedClass____parentClass_name_prime);
		tExtendedClass__tClass____childClasses.setName(tExtendedClass__tClass____childClasses_name_prime);
		eClassDeclaration__eTypeAccess____superClass.setName(eClassDeclaration__eTypeAccess____superClass_name_prime);
		return new Object[] { ruleresult, eTypeAccess, eClassDeclaration, eExtendedClass, tExtendedClass, tClass,
				eTypeAccess__eExtendedClass____type, eExtendedClass__eTypeAccess____usagesInTypeAccess,
				tClass__tExtendedClass____parentClass, tExtendedClass__tClass____childClasses,
				eClassDeclaration__eTypeAccess____superClass };
	}

	public static final void pattern_ClassExtendsClass_1_5_registerobjects_expressionBBBBBBBBB(ClassExtendsClass _this,
			PerformRuleResult ruleresult, EObject eTypeAccess, EObject eClassDeclaration,
			EObject eClassDeclarationToTClass, EObject eExtendedClassToTExtendedClass, EObject eExtendedClass,
			EObject tExtendedClass, EObject tClass) {
		_this.registerObjects_FWD(ruleresult, eTypeAccess, eClassDeclaration, eClassDeclarationToTClass,
				eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass);

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
		EObject _localVariable_0 = match.getObject("eTypeAccess");
		EObject _localVariable_1 = match.getObject("eClassDeclaration");
		EObject _localVariable_2 = match.getObject("eExtendedClass");
		EObject tmpETypeAccess = _localVariable_0;
		EObject tmpEClassDeclaration = _localVariable_1;
		EObject tmpEExtendedClass = _localVariable_2;
		if (tmpETypeAccess instanceof TypeAccess) {
			TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
			if (tmpEClassDeclaration instanceof ClassDeclaration) {
				ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
				if (tmpEExtendedClass instanceof ClassDeclaration) {
					ClassDeclaration eExtendedClass = (ClassDeclaration) tmpEExtendedClass;
					return new Object[] { eTypeAccess, eClassDeclaration, eExtendedClass, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassExtendsClass_2_2_corematch_blackBBFFBFFB(TypeAccess eTypeAccess,
			ClassDeclaration eClassDeclaration, ClassDeclaration eExtendedClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eClassDeclaration.equals(eExtendedClass)) {
			for (ClassDeclarationToTClass eClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eClassDeclaration, ClassDeclarationToTClass.class, "source")) {
				TClass tClass = eClassDeclarationToTClass.getTarget();
				if (tClass != null) {
					for (ClassDeclarationToTClass eExtendedClassToTExtendedClass : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(eExtendedClass, ClassDeclarationToTClass.class, "source")) {
						if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
							TClass tExtendedClass = eExtendedClassToTExtendedClass.getTarget();
							if (tExtendedClass != null) {
								if (!tClass.equals(tExtendedClass)) {
									_result.add(new Object[] { eTypeAccess, eClassDeclaration,
											eClassDeclarationToTClass, eExtendedClassToTExtendedClass, eExtendedClass,
											tExtendedClass, tClass, match });
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
			TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration,
			ClassDeclarationToTClass eClassDeclarationToTClass, ClassDeclarationToTClass eExtendedClassToTExtendedClass,
			ClassDeclaration eExtendedClass, TClass tExtendedClass, TClass tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
				if (!tClass.equals(tExtendedClass)) {
					if (eExtendedClass.equals(eTypeAccess.getType())) {
						if (tExtendedClass.equals(eExtendedClassToTExtendedClass.getTarget())) {
							if (eClassDeclaration.equals(eClassDeclarationToTClass.getSource())) {
								if (tClass.equals(eClassDeclarationToTClass.getTarget())) {
									if (eTypeAccess.equals(eClassDeclaration.getSuperClass())) {
										if (eExtendedClass.equals(eExtendedClassToTExtendedClass.getSource())) {
											_result.add(new Object[] { eTypeAccess, eClassDeclaration,
													eClassDeclarationToTClass, eExtendedClassToTExtendedClass,
													eExtendedClass, tExtendedClass, tClass });
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

	public static final Object[] pattern_ClassExtendsClass_2_3_findcontext_greenBBBBBBBFFFFFFFF(TypeAccess eTypeAccess,
			ClassDeclaration eClassDeclaration, ClassDeclarationToTClass eClassDeclarationToTClass,
			ClassDeclarationToTClass eExtendedClassToTExtendedClass, ClassDeclaration eExtendedClass,
			TClass tExtendedClass, TClass tClass) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eTypeAccess__eExtendedClass____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eExtendedClass__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eExtendedClassToTExtendedClass__tExtendedClass____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclaration__eTypeAccess____superClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eExtendedClassToTExtendedClass__eExtendedClass____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String eTypeAccess__eExtendedClass____type_name_prime = "type";
		String eExtendedClass__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eExtendedClassToTExtendedClass__tExtendedClass____target_name_prime = "target";
		String eClassDeclarationToTClass__eClassDeclaration____source_name_prime = "source";
		String eClassDeclarationToTClass__tClass____target_name_prime = "target";
		String eClassDeclaration__eTypeAccess____superClass_name_prime = "superClass";
		String eExtendedClassToTExtendedClass__eExtendedClass____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass);
		isApplicableMatch.getAllContextElements().add(eExtendedClassToTExtendedClass);
		isApplicableMatch.getAllContextElements().add(eExtendedClass);
		isApplicableMatch.getAllContextElements().add(tExtendedClass);
		isApplicableMatch.getAllContextElements().add(tClass);
		eTypeAccess__eExtendedClass____type.setSrc(eTypeAccess);
		eTypeAccess__eExtendedClass____type.setTrg(eExtendedClass);
		isApplicableMatch.getAllContextElements().add(eTypeAccess__eExtendedClass____type);
		eExtendedClass__eTypeAccess____usagesInTypeAccess.setSrc(eExtendedClass);
		eExtendedClass__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eExtendedClass__eTypeAccess____usagesInTypeAccess);
		eExtendedClassToTExtendedClass__tExtendedClass____target.setSrc(eExtendedClassToTExtendedClass);
		eExtendedClassToTExtendedClass__tExtendedClass____target.setTrg(tExtendedClass);
		isApplicableMatch.getAllContextElements().add(eExtendedClassToTExtendedClass__tExtendedClass____target);
		eClassDeclarationToTClass__eClassDeclaration____source.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__eClassDeclaration____source.setTrg(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__eClassDeclaration____source);
		eClassDeclarationToTClass__tClass____target.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__tClass____target);
		eClassDeclaration__eTypeAccess____superClass.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superClass.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eClassDeclaration__eTypeAccess____superClass);
		eExtendedClassToTExtendedClass__eExtendedClass____source.setSrc(eExtendedClassToTExtendedClass);
		eExtendedClassToTExtendedClass__eExtendedClass____source.setTrg(eExtendedClass);
		isApplicableMatch.getAllContextElements().add(eExtendedClassToTExtendedClass__eExtendedClass____source);
		eTypeAccess__eExtendedClass____type.setName(eTypeAccess__eExtendedClass____type_name_prime);
		eExtendedClass__eTypeAccess____usagesInTypeAccess
				.setName(eExtendedClass__eTypeAccess____usagesInTypeAccess_name_prime);
		eExtendedClassToTExtendedClass__tExtendedClass____target
				.setName(eExtendedClassToTExtendedClass__tExtendedClass____target_name_prime);
		eClassDeclarationToTClass__eClassDeclaration____source
				.setName(eClassDeclarationToTClass__eClassDeclaration____source_name_prime);
		eClassDeclarationToTClass__tClass____target.setName(eClassDeclarationToTClass__tClass____target_name_prime);
		eClassDeclaration__eTypeAccess____superClass.setName(eClassDeclaration__eTypeAccess____superClass_name_prime);
		eExtendedClassToTExtendedClass__eExtendedClass____source
				.setName(eExtendedClassToTExtendedClass__eExtendedClass____source_name_prime);
		return new Object[] { eTypeAccess, eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass,
				eExtendedClass, tExtendedClass, tClass, isApplicableMatch, eTypeAccess__eExtendedClass____type,
				eExtendedClass__eTypeAccess____usagesInTypeAccess,
				eExtendedClassToTExtendedClass__tExtendedClass____target,
				eClassDeclarationToTClass__eClassDeclaration____source, eClassDeclarationToTClass__tClass____target,
				eClassDeclaration__eTypeAccess____superClass,
				eExtendedClassToTExtendedClass__eExtendedClass____source };
	}

	public static final Object[] pattern_ClassExtendsClass_2_4_solveCSP_bindingFBBBBBBBBB(ClassExtendsClass _this,
			IsApplicableMatch isApplicableMatch, TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration,
			ClassDeclarationToTClass eClassDeclarationToTClass, ClassDeclarationToTClass eExtendedClassToTExtendedClass,
			ClassDeclaration eExtendedClass, TClass tExtendedClass, TClass tClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eTypeAccess, eClassDeclaration,
				eClassDeclarationToTClass, eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eTypeAccess, eClassDeclaration,
					eClassDeclarationToTClass, eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassExtendsClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			ClassExtendsClass _this, IsApplicableMatch isApplicableMatch, TypeAccess eTypeAccess,
			ClassDeclaration eClassDeclaration, ClassDeclarationToTClass eClassDeclarationToTClass,
			ClassDeclarationToTClass eExtendedClassToTExtendedClass, ClassDeclaration eExtendedClass,
			TClass tExtendedClass, TClass tClass) {
		Object[] result_pattern_ClassExtendsClass_2_4_solveCSP_binding = pattern_ClassExtendsClass_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, eTypeAccess, eClassDeclaration, eClassDeclarationToTClass,
				eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass);
		if (result_pattern_ClassExtendsClass_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassExtendsClass_2_4_solveCSP_binding[0];

			Object[] result_pattern_ClassExtendsClass_2_4_solveCSP_black = pattern_ClassExtendsClass_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassExtendsClass_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eTypeAccess, eClassDeclaration,
						eClassDeclarationToTClass, eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass,
						tClass };
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
			Match match, TClass tExtendedClass, TClass tClass) {
		if (!tClass.equals(tExtendedClass)) {
			return new Object[] { _this, match, tExtendedClass, tClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_10_2_SolveCSP_bindingFBBBB(ClassExtendsClass _this,
			Match match, TClass tExtendedClass, TClass tClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tExtendedClass, tClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tExtendedClass, tClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassExtendsClass_10_2_SolveCSP_bindingAndBlackFBBBB(ClassExtendsClass _this,
			Match match, TClass tExtendedClass, TClass tClass) {
		Object[] result_pattern_ClassExtendsClass_10_2_SolveCSP_binding = pattern_ClassExtendsClass_10_2_SolveCSP_bindingFBBBB(
				_this, match, tExtendedClass, tClass);
		if (result_pattern_ClassExtendsClass_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassExtendsClass_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassExtendsClass_10_2_SolveCSP_black = pattern_ClassExtendsClass_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassExtendsClass_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tExtendedClass, tClass };
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
			TClass tExtendedClass, TClass tClass) {
		if (!tClass.equals(tExtendedClass)) {
			return new Object[] { match, tExtendedClass, tClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TClass tExtendedClass, TClass tClass) {
		EMoflonEdge tClass__tExtendedClass____parentClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tExtendedClass__tClass____childClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tClass__tExtendedClass____parentClass_name_prime = "parentClass";
		String tExtendedClass__tClass____childClasses_name_prime = "childClasses";
		tClass__tExtendedClass____parentClass.setSrc(tClass);
		tClass__tExtendedClass____parentClass.setTrg(tExtendedClass);
		match.getToBeTranslatedEdges().add(tClass__tExtendedClass____parentClass);
		tExtendedClass__tClass____childClasses.setSrc(tExtendedClass);
		tExtendedClass__tClass____childClasses.setTrg(tClass);
		match.getToBeTranslatedEdges().add(tExtendedClass__tClass____childClasses);
		tClass__tExtendedClass____parentClass.setName(tClass__tExtendedClass____parentClass_name_prime);
		tExtendedClass__tClass____childClasses.setName(tExtendedClass__tClass____childClasses_name_prime);
		return new Object[] { match, tExtendedClass, tClass, tClass__tExtendedClass____parentClass,
				tExtendedClass__tClass____childClasses };
	}

	public static final Object[] pattern_ClassExtendsClass_10_5_collectcontextelements_blackBBB(Match match,
			TClass tExtendedClass, TClass tClass) {
		if (!tClass.equals(tExtendedClass)) {
			return new Object[] { match, tExtendedClass, tClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_10_5_collectcontextelements_greenBBB(Match match,
			TClass tExtendedClass, TClass tClass) {
		match.getContextNodes().add(tExtendedClass);
		match.getContextNodes().add(tClass);
		return new Object[] { match, tExtendedClass, tClass };
	}

	public static final void pattern_ClassExtendsClass_10_6_registerobjectstomatch_expressionBBBB(
			ClassExtendsClass _this, Match match, TClass tExtendedClass, TClass tClass) {
		_this.registerObjectsToMatch_BWD(match, tExtendedClass, tClass);

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
		EObject _localVariable_2 = isApplicableMatch.getObject("eExtendedClassToTExtendedClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("eExtendedClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("tExtendedClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("tClass");
		EObject tmpEClassDeclaration = _localVariable_0;
		EObject tmpEClassDeclarationToTClass = _localVariable_1;
		EObject tmpEExtendedClassToTExtendedClass = _localVariable_2;
		EObject tmpEExtendedClass = _localVariable_3;
		EObject tmpTExtendedClass = _localVariable_4;
		EObject tmpTClass = _localVariable_5;
		if (tmpEClassDeclaration instanceof ClassDeclaration) {
			ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
			if (tmpEClassDeclarationToTClass instanceof ClassDeclarationToTClass) {
				ClassDeclarationToTClass eClassDeclarationToTClass = (ClassDeclarationToTClass) tmpEClassDeclarationToTClass;
				if (tmpEExtendedClassToTExtendedClass instanceof ClassDeclarationToTClass) {
					ClassDeclarationToTClass eExtendedClassToTExtendedClass = (ClassDeclarationToTClass) tmpEExtendedClassToTExtendedClass;
					if (tmpEExtendedClass instanceof ClassDeclaration) {
						ClassDeclaration eExtendedClass = (ClassDeclaration) tmpEExtendedClass;
						if (tmpTExtendedClass instanceof TClass) {
							TClass tExtendedClass = (TClass) tmpTExtendedClass;
							if (tmpTClass instanceof TClass) {
								TClass tClass = (TClass) tmpTClass;
								return new Object[] { eClassDeclaration, eClassDeclarationToTClass,
										eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass,
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
			ClassDeclaration eClassDeclaration, ClassDeclarationToTClass eClassDeclarationToTClass,
			ClassDeclarationToTClass eExtendedClassToTExtendedClass, ClassDeclaration eExtendedClass,
			TClass tExtendedClass, TClass tClass, ClassExtendsClass _this, IsApplicableMatch isApplicableMatch) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
				if (!tClass.equals(tExtendedClass)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { eClassDeclaration, eClassDeclarationToTClass,
									eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass, csp, _this,
									isApplicableMatch };
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
			ClassDeclarationToTClass eClassDeclarationToTClass = (ClassDeclarationToTClass) result_pattern_ClassExtendsClass_11_1_performtransformation_binding[1];
			ClassDeclarationToTClass eExtendedClassToTExtendedClass = (ClassDeclarationToTClass) result_pattern_ClassExtendsClass_11_1_performtransformation_binding[2];
			ClassDeclaration eExtendedClass = (ClassDeclaration) result_pattern_ClassExtendsClass_11_1_performtransformation_binding[3];
			TClass tExtendedClass = (TClass) result_pattern_ClassExtendsClass_11_1_performtransformation_binding[4];
			TClass tClass = (TClass) result_pattern_ClassExtendsClass_11_1_performtransformation_binding[5];

			Object[] result_pattern_ClassExtendsClass_11_1_performtransformation_black = pattern_ClassExtendsClass_11_1_performtransformation_blackBBBBBBFBB(
					eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass, eExtendedClass,
					tExtendedClass, tClass, _this, isApplicableMatch);
			if (result_pattern_ClassExtendsClass_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassExtendsClass_11_1_performtransformation_black[6];

				return new Object[] { eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass,
						eExtendedClass, tExtendedClass, tClass, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_11_1_performtransformation_greenFBB(
			ClassDeclaration eClassDeclaration, ClassDeclaration eExtendedClass) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		eTypeAccess.setType(eExtendedClass);
		eClassDeclaration.setSuperClass(eTypeAccess);
		return new Object[] { eTypeAccess, eClassDeclaration, eExtendedClass };
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
			PerformRuleResult ruleresult, EObject eTypeAccess, EObject eClassDeclaration,
			EObject eClassDeclarationToTClass, EObject eExtendedClassToTExtendedClass, EObject eExtendedClass,
			EObject tExtendedClass, EObject tClass) {
		if (!eTypeAccess.equals(tExtendedClass)) {
			if (!eTypeAccess.equals(tClass)) {
				if (!eClassDeclaration.equals(eTypeAccess)) {
					if (!eClassDeclaration.equals(eClassDeclarationToTClass)) {
						if (!eClassDeclaration.equals(eExtendedClassToTExtendedClass)) {
							if (!eClassDeclaration.equals(eExtendedClass)) {
								if (!eClassDeclaration.equals(tExtendedClass)) {
									if (!eClassDeclaration.equals(tClass)) {
										if (!eClassDeclarationToTClass.equals(eTypeAccess)) {
											if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
												if (!eClassDeclarationToTClass.equals(eExtendedClass)) {
													if (!eClassDeclarationToTClass.equals(tExtendedClass)) {
														if (!eClassDeclarationToTClass.equals(tClass)) {
															if (!eExtendedClassToTExtendedClass.equals(eTypeAccess)) {
																if (!eExtendedClassToTExtendedClass
																		.equals(tExtendedClass)) {
																	if (!eExtendedClassToTExtendedClass
																			.equals(tClass)) {
																		if (!eExtendedClass.equals(eTypeAccess)) {
																			if (!eExtendedClass.equals(
																					eExtendedClassToTExtendedClass)) {
																				if (!eExtendedClass
																						.equals(tExtendedClass)) {
																					if (!eExtendedClass
																							.equals(tClass)) {
																						if (!tClass.equals(
																								tExtendedClass)) {
																							return new Object[] {
																									ruleresult,
																									eTypeAccess,
																									eClassDeclaration,
																									eClassDeclarationToTClass,
																									eExtendedClassToTExtendedClass,
																									eExtendedClass,
																									tExtendedClass,
																									tClass };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject eTypeAccess, EObject eClassDeclaration, EObject eExtendedClass,
			EObject tExtendedClass, EObject tClass) {
		EMoflonEdge eTypeAccess__eExtendedClass____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eExtendedClass__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tExtendedClass____parentClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tExtendedClass__tClass____childClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclaration__eTypeAccess____superClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassExtendsClass";
		String eTypeAccess__eExtendedClass____type_name_prime = "type";
		String eExtendedClass__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String tClass__tExtendedClass____parentClass_name_prime = "parentClass";
		String tExtendedClass__tClass____childClasses_name_prime = "childClasses";
		String eClassDeclaration__eTypeAccess____superClass_name_prime = "superClass";
		eTypeAccess__eExtendedClass____type.setSrc(eTypeAccess);
		eTypeAccess__eExtendedClass____type.setTrg(eExtendedClass);
		ruleresult.getCreatedEdges().add(eTypeAccess__eExtendedClass____type);
		eExtendedClass__eTypeAccess____usagesInTypeAccess.setSrc(eExtendedClass);
		eExtendedClass__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getCreatedEdges().add(eExtendedClass__eTypeAccess____usagesInTypeAccess);
		tClass__tExtendedClass____parentClass.setSrc(tClass);
		tClass__tExtendedClass____parentClass.setTrg(tExtendedClass);
		ruleresult.getTranslatedEdges().add(tClass__tExtendedClass____parentClass);
		tExtendedClass__tClass____childClasses.setSrc(tExtendedClass);
		tExtendedClass__tClass____childClasses.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(tExtendedClass__tClass____childClasses);
		eClassDeclaration__eTypeAccess____superClass.setSrc(eClassDeclaration);
		eClassDeclaration__eTypeAccess____superClass.setTrg(eTypeAccess);
		ruleresult.getCreatedEdges().add(eClassDeclaration__eTypeAccess____superClass);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eTypeAccess__eExtendedClass____type.setName(eTypeAccess__eExtendedClass____type_name_prime);
		eExtendedClass__eTypeAccess____usagesInTypeAccess
				.setName(eExtendedClass__eTypeAccess____usagesInTypeAccess_name_prime);
		tClass__tExtendedClass____parentClass.setName(tClass__tExtendedClass____parentClass_name_prime);
		tExtendedClass__tClass____childClasses.setName(tExtendedClass__tClass____childClasses_name_prime);
		eClassDeclaration__eTypeAccess____superClass.setName(eClassDeclaration__eTypeAccess____superClass_name_prime);
		return new Object[] { ruleresult, eTypeAccess, eClassDeclaration, eExtendedClass, tExtendedClass, tClass,
				eTypeAccess__eExtendedClass____type, eExtendedClass__eTypeAccess____usagesInTypeAccess,
				tClass__tExtendedClass____parentClass, tExtendedClass__tClass____childClasses,
				eClassDeclaration__eTypeAccess____superClass };
	}

	public static final void pattern_ClassExtendsClass_11_5_registerobjects_expressionBBBBBBBBB(ClassExtendsClass _this,
			PerformRuleResult ruleresult, EObject eTypeAccess, EObject eClassDeclaration,
			EObject eClassDeclarationToTClass, EObject eExtendedClassToTExtendedClass, EObject eExtendedClass,
			EObject tExtendedClass, EObject tClass) {
		_this.registerObjects_BWD(ruleresult, eTypeAccess, eClassDeclaration, eClassDeclarationToTClass,
				eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass);

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
		EObject _localVariable_0 = match.getObject("tExtendedClass");
		EObject _localVariable_1 = match.getObject("tClass");
		EObject tmpTExtendedClass = _localVariable_0;
		EObject tmpTClass = _localVariable_1;
		if (tmpTExtendedClass instanceof TClass) {
			TClass tExtendedClass = (TClass) tmpTExtendedClass;
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				return new Object[] { tExtendedClass, tClass, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassExtendsClass_12_2_corematch_blackFFFFBBB(TClass tExtendedClass,
			TClass tClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tClass.equals(tExtendedClass)) {
			for (ClassDeclarationToTClass eExtendedClassToTExtendedClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tExtendedClass, ClassDeclarationToTClass.class, "target")) {
				ClassDeclaration eExtendedClass = eExtendedClassToTExtendedClass.getSource();
				if (eExtendedClass != null) {
					for (ClassDeclarationToTClass eClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tClass, ClassDeclarationToTClass.class, "target")) {
						if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
							ClassDeclaration eClassDeclaration = eClassDeclarationToTClass.getSource();
							if (eClassDeclaration != null) {
								if (!eClassDeclaration.equals(eExtendedClass)) {
									_result.add(new Object[] { eClassDeclaration, eClassDeclarationToTClass,
											eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass,
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

	public static final Iterable<Object[]> pattern_ClassExtendsClass_12_3_findcontext_blackBBBBBB(
			ClassDeclaration eClassDeclaration, ClassDeclarationToTClass eClassDeclarationToTClass,
			ClassDeclarationToTClass eExtendedClassToTExtendedClass, ClassDeclaration eExtendedClass,
			TClass tExtendedClass, TClass tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
				if (!tClass.equals(tExtendedClass)) {
					if (tExtendedClass.equals(eExtendedClassToTExtendedClass.getTarget())) {
						if (eClassDeclaration.equals(eClassDeclarationToTClass.getSource())) {
							if (tExtendedClass.equals(tClass.getParentClass())) {
								if (tClass.equals(eClassDeclarationToTClass.getTarget())) {
									if (eExtendedClass.equals(eExtendedClassToTExtendedClass.getSource())) {
										_result.add(new Object[] { eClassDeclaration, eClassDeclarationToTClass,
												eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass,
												tClass });
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
			ClassDeclaration eClassDeclaration, ClassDeclarationToTClass eClassDeclarationToTClass,
			ClassDeclarationToTClass eExtendedClassToTExtendedClass, ClassDeclaration eExtendedClass,
			TClass tExtendedClass, TClass tClass) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eExtendedClassToTExtendedClass__tExtendedClass____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__eClassDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tExtendedClass____parentClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tExtendedClass__tClass____childClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eExtendedClassToTExtendedClass__eExtendedClass____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String eExtendedClassToTExtendedClass__tExtendedClass____target_name_prime = "target";
		String eClassDeclarationToTClass__eClassDeclaration____source_name_prime = "source";
		String tClass__tExtendedClass____parentClass_name_prime = "parentClass";
		String tExtendedClass__tClass____childClasses_name_prime = "childClasses";
		String eClassDeclarationToTClass__tClass____target_name_prime = "target";
		String eExtendedClassToTExtendedClass__eExtendedClass____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass);
		isApplicableMatch.getAllContextElements().add(eExtendedClassToTExtendedClass);
		isApplicableMatch.getAllContextElements().add(eExtendedClass);
		isApplicableMatch.getAllContextElements().add(tExtendedClass);
		isApplicableMatch.getAllContextElements().add(tClass);
		eExtendedClassToTExtendedClass__tExtendedClass____target.setSrc(eExtendedClassToTExtendedClass);
		eExtendedClassToTExtendedClass__tExtendedClass____target.setTrg(tExtendedClass);
		isApplicableMatch.getAllContextElements().add(eExtendedClassToTExtendedClass__tExtendedClass____target);
		eClassDeclarationToTClass__eClassDeclaration____source.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__eClassDeclaration____source.setTrg(eClassDeclaration);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__eClassDeclaration____source);
		tClass__tExtendedClass____parentClass.setSrc(tClass);
		tClass__tExtendedClass____parentClass.setTrg(tExtendedClass);
		isApplicableMatch.getAllContextElements().add(tClass__tExtendedClass____parentClass);
		tExtendedClass__tClass____childClasses.setSrc(tExtendedClass);
		tExtendedClass__tClass____childClasses.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(tExtendedClass__tClass____childClasses);
		eClassDeclarationToTClass__tClass____target.setSrc(eClassDeclarationToTClass);
		eClassDeclarationToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(eClassDeclarationToTClass__tClass____target);
		eExtendedClassToTExtendedClass__eExtendedClass____source.setSrc(eExtendedClassToTExtendedClass);
		eExtendedClassToTExtendedClass__eExtendedClass____source.setTrg(eExtendedClass);
		isApplicableMatch.getAllContextElements().add(eExtendedClassToTExtendedClass__eExtendedClass____source);
		eExtendedClassToTExtendedClass__tExtendedClass____target
				.setName(eExtendedClassToTExtendedClass__tExtendedClass____target_name_prime);
		eClassDeclarationToTClass__eClassDeclaration____source
				.setName(eClassDeclarationToTClass__eClassDeclaration____source_name_prime);
		tClass__tExtendedClass____parentClass.setName(tClass__tExtendedClass____parentClass_name_prime);
		tExtendedClass__tClass____childClasses.setName(tExtendedClass__tClass____childClasses_name_prime);
		eClassDeclarationToTClass__tClass____target.setName(eClassDeclarationToTClass__tClass____target_name_prime);
		eExtendedClassToTExtendedClass__eExtendedClass____source
				.setName(eExtendedClassToTExtendedClass__eExtendedClass____source_name_prime);
		return new Object[] { eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass,
				eExtendedClass, tExtendedClass, tClass, isApplicableMatch,
				eExtendedClassToTExtendedClass__tExtendedClass____target,
				eClassDeclarationToTClass__eClassDeclaration____source, tClass__tExtendedClass____parentClass,
				tExtendedClass__tClass____childClasses, eClassDeclarationToTClass__tClass____target,
				eExtendedClassToTExtendedClass__eExtendedClass____source };
	}

	public static final Object[] pattern_ClassExtendsClass_12_4_solveCSP_bindingFBBBBBBBB(ClassExtendsClass _this,
			IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			ClassDeclarationToTClass eClassDeclarationToTClass, ClassDeclarationToTClass eExtendedClassToTExtendedClass,
			ClassDeclaration eExtendedClass, TClass tExtendedClass, TClass tClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, eClassDeclaration,
				eClassDeclarationToTClass, eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eClassDeclaration, eClassDeclarationToTClass,
					eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassExtendsClass_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			ClassExtendsClass _this, IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			ClassDeclarationToTClass eClassDeclarationToTClass, ClassDeclarationToTClass eExtendedClassToTExtendedClass,
			ClassDeclaration eExtendedClass, TClass tExtendedClass, TClass tClass) {
		Object[] result_pattern_ClassExtendsClass_12_4_solveCSP_binding = pattern_ClassExtendsClass_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass,
				eExtendedClass, tExtendedClass, tClass);
		if (result_pattern_ClassExtendsClass_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassExtendsClass_12_4_solveCSP_binding[0];

			Object[] result_pattern_ClassExtendsClass_12_4_solveCSP_black = pattern_ClassExtendsClass_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassExtendsClass_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eClassDeclaration, eClassDeclarationToTClass,
						eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass };
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
			EMoflonEdge _edge_parentClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTClass = _edge_parentClass.getSrc();
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			EObject tmpTExtendedClass = _edge_parentClass.getTrg();
			if (tmpTExtendedClass instanceof TClass) {
				TClass tExtendedClass = (TClass) tmpTExtendedClass;
				if (!tClass.equals(tExtendedClass)) {
					if (tExtendedClass.equals(tClass.getParentClass())) {
						_result.add(new Object[] { tExtendedClass, tClass, _edge_parentClass });
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
			ClassExtendsClass _this, Match match, TClass tExtendedClass, TClass tClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tExtendedClass, tClass);
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
			for (AbstractTypeDeclaration __DEC_eTypeAccess_superInterfaces_538932 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
				if (!eClassDeclaration.equals(__DEC_eTypeAccess_superInterfaces_538932)) {
					if (!eExtendedClass.equals(__DEC_eTypeAccess_superInterfaces_538932)) {
						return new Object[] { eTypeAccess, eClassDeclaration, eExtendedClass };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_231630 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_2B(
			TypeAccess eTypeAccess) {
		for (ArrayType __DEC_eTypeAccess_elementType_11584 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_761127 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_4B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_410933 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess eTypeAccess) {
		for (ParameterizedType __DEC_eTypeAccess_type_59342 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ParameterizedType.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_564190 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_843671 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_8BB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess) {
		if (eClassDeclaration.getSuperInterfaces().contains(eTypeAccess)) {
			return new Object[] { eClassDeclaration, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_9BB(
			ClassDeclaration eExtendedClass, TypeAccess eTypeAccess) {
		if (eExtendedClass.getSuperInterfaces().contains(eTypeAccess)) {
			return new Object[] { eExtendedClass, eTypeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassExtendsClass_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpETypeAccess = _edge_type.getSrc();
		if (tmpETypeAccess instanceof TypeAccess) {
			TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
			EObject tmpEExtendedClass = _edge_type.getTrg();
			if (tmpEExtendedClass instanceof ClassDeclaration) {
				ClassDeclaration eExtendedClass = (ClassDeclaration) tmpEExtendedClass;
				if (eExtendedClass.equals(eTypeAccess.getType())) {
					if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_1B(eTypeAccess) == null) {
						if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_2B(eTypeAccess) == null) {
							if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_3B(eTypeAccess) == null) {
								if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_4B(
										eTypeAccess) == null) {
									if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_5B(
											eTypeAccess) == null) {
										if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_6B(
												eTypeAccess) == null) {
											if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_7B(
													eTypeAccess) == null) {
												if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_9BB(
														eExtendedClass, eTypeAccess) == null) {
													for (ClassDeclaration eClassDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(eTypeAccess,
																	ClassDeclaration.class, "superClass")) {
														if (!eClassDeclaration.equals(eExtendedClass)) {
															if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_0BBB(
																	eTypeAccess, eClassDeclaration,
																	eExtendedClass) == null) {
																if (pattern_ClassExtendsClass_21_2_testcorematchandDECs_black_nac_8BB(
																		eClassDeclaration, eTypeAccess) == null) {
																	_result.add(new Object[] { eTypeAccess,
																			eClassDeclaration, eExtendedClass,
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
			ClassExtendsClass _this, Match match, TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration,
			ClassDeclaration eExtendedClass) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eTypeAccess, eClassDeclaration, eExtendedClass);
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
		EObject _localVariable_0 = sourceMatch.getObject("eTypeAccess");
		EObject _localVariable_1 = sourceMatch.getObject("eClassDeclaration");
		EObject _localVariable_2 = sourceMatch.getObject("eExtendedClass");
		EObject _localVariable_3 = targetMatch.getObject("tExtendedClass");
		EObject _localVariable_4 = targetMatch.getObject("tClass");
		EObject tmpETypeAccess = _localVariable_0;
		EObject tmpEClassDeclaration = _localVariable_1;
		EObject tmpEExtendedClass = _localVariable_2;
		EObject tmpTExtendedClass = _localVariable_3;
		EObject tmpTClass = _localVariable_4;
		if (tmpETypeAccess instanceof TypeAccess) {
			TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
			if (tmpEClassDeclaration instanceof ClassDeclaration) {
				ClassDeclaration eClassDeclaration = (ClassDeclaration) tmpEClassDeclaration;
				if (tmpEExtendedClass instanceof ClassDeclaration) {
					ClassDeclaration eExtendedClass = (ClassDeclaration) tmpEExtendedClass;
					if (tmpTExtendedClass instanceof TClass) {
						TClass tExtendedClass = (TClass) tmpTExtendedClass;
						if (tmpTClass instanceof TClass) {
							TClass tClass = (TClass) tmpTClass;
							return new Object[] { eTypeAccess, eClassDeclaration, eExtendedClass, tExtendedClass,
									tClass, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_24_2_matchsrctrgcontext_blackBBBBBBB(TypeAccess eTypeAccess,
			ClassDeclaration eClassDeclaration, ClassDeclaration eExtendedClass, TClass tExtendedClass, TClass tClass,
			Match sourceMatch, Match targetMatch) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!tClass.equals(tExtendedClass)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { eTypeAccess, eClassDeclaration, eExtendedClass, tExtendedClass, tClass,
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
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ClassExtendsClass_24_2_matchsrctrgcontext_binding[0];
			ClassDeclaration eClassDeclaration = (ClassDeclaration) result_pattern_ClassExtendsClass_24_2_matchsrctrgcontext_binding[1];
			ClassDeclaration eExtendedClass = (ClassDeclaration) result_pattern_ClassExtendsClass_24_2_matchsrctrgcontext_binding[2];
			TClass tExtendedClass = (TClass) result_pattern_ClassExtendsClass_24_2_matchsrctrgcontext_binding[3];
			TClass tClass = (TClass) result_pattern_ClassExtendsClass_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_ClassExtendsClass_24_2_matchsrctrgcontext_black = pattern_ClassExtendsClass_24_2_matchsrctrgcontext_blackBBBBBBB(
					eTypeAccess, eClassDeclaration, eExtendedClass, tExtendedClass, tClass, sourceMatch, targetMatch);
			if (result_pattern_ClassExtendsClass_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { eTypeAccess, eClassDeclaration, eExtendedClass, tExtendedClass, tClass,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_24_3_solvecsp_bindingFBBBBBBBB(ClassExtendsClass _this,
			TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration, ClassDeclaration eExtendedClass,
			TClass tExtendedClass, TClass tClass, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(eTypeAccess, eClassDeclaration, eExtendedClass,
				tExtendedClass, tClass, sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, eTypeAccess, eClassDeclaration, eExtendedClass, tExtendedClass, tClass,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassExtendsClass_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			ClassExtendsClass _this, TypeAccess eTypeAccess, ClassDeclaration eClassDeclaration,
			ClassDeclaration eExtendedClass, TClass tExtendedClass, TClass tClass, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_ClassExtendsClass_24_3_solvecsp_binding = pattern_ClassExtendsClass_24_3_solvecsp_bindingFBBBBBBBB(
				_this, eTypeAccess, eClassDeclaration, eExtendedClass, tExtendedClass, tClass, sourceMatch,
				targetMatch);
		if (result_pattern_ClassExtendsClass_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ClassExtendsClass_24_3_solvecsp_binding[0];

			Object[] result_pattern_ClassExtendsClass_24_3_solvecsp_black = pattern_ClassExtendsClass_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ClassExtendsClass_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, eTypeAccess, eClassDeclaration, eExtendedClass, tExtendedClass,
						tClass, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassExtendsClass_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassExtendsClass_24_5_matchcorrcontext_blackBFFBBBBB(
			ClassDeclaration eClassDeclaration, ClassDeclaration eExtendedClass, TClass tExtendedClass, TClass tClass,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!tClass.equals(tExtendedClass)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (ClassDeclarationToTClass eExtendedClassToTExtendedClass : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tExtendedClass, ClassDeclarationToTClass.class, "target")) {
						if (eExtendedClass.equals(eExtendedClassToTExtendedClass.getSource())) {
							for (ClassDeclarationToTClass eClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(eClassDeclaration, ClassDeclarationToTClass.class,
											"source")) {
								if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
									if (tClass.equals(eClassDeclarationToTClass.getTarget())) {
										_result.add(new Object[] { eClassDeclaration, eClassDeclarationToTClass,
												eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass,
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
			ClassDeclarationToTClass eClassDeclarationToTClass, ClassDeclarationToTClass eExtendedClassToTExtendedClass,
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

	public static final Object[] pattern_ClassExtendsClass_24_6_createcorrespondence_blackBBBBBB(TypeAccess eTypeAccess,
			ClassDeclaration eClassDeclaration, ClassDeclaration eExtendedClass, TClass tExtendedClass, TClass tClass,
			CCMatch ccMatch) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!tClass.equals(tExtendedClass)) {
				return new Object[] { eTypeAccess, eClassDeclaration, eExtendedClass, tExtendedClass, tClass, ccMatch };
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
			for (AbstractTypeDeclaration __DEC_eTypeAccess_superInterfaces_278174 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
				if (!eClassDeclaration.equals(__DEC_eTypeAccess_superInterfaces_278174)) {
					if (!eExtendedClass.equals(__DEC_eTypeAccess_superInterfaces_278174)) {
						return new Object[] { eTypeAccess, eClassDeclaration, eExtendedClass };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_1B(TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_520787 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_2B(TypeAccess eTypeAccess) {
		for (ArrayType __DEC_eTypeAccess_elementType_429070 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_3B(TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_571096 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_4B(TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_687541 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_5B(TypeAccess eTypeAccess) {
		for (ParameterizedType __DEC_eTypeAccess_type_679068 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ParameterizedType.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_6B(TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_132730 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_7B(TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_227766 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_8BB(
			ClassDeclaration eClassDeclaration, TypeAccess eTypeAccess) {
		if (eClassDeclaration.getSuperInterfaces().contains(eTypeAccess)) {
			return new Object[] { eClassDeclaration, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_9BB(
			ClassDeclaration eExtendedClass, TypeAccess eTypeAccess) {
		if (eExtendedClass.getSuperInterfaces().contains(eTypeAccess)) {
			return new Object[] { eExtendedClass, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_27_1_matchtggpattern_blackBBB(TypeAccess eTypeAccess,
			ClassDeclaration eClassDeclaration, ClassDeclaration eExtendedClass) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (eExtendedClass.equals(eTypeAccess.getType())) {
				if (eTypeAccess.equals(eClassDeclaration.getSuperClass())) {
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
													if (pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_8BB(
															eClassDeclaration, eTypeAccess) == null) {
														if (pattern_ClassExtendsClass_27_1_matchtggpattern_black_nac_9BB(
																eExtendedClass, eTypeAccess) == null) {
															return new Object[] { eTypeAccess, eClassDeclaration,
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

	public static final Object[] pattern_ClassExtendsClass_28_1_matchtggpattern_blackBB(TClass tExtendedClass,
			TClass tClass) {
		if (!tClass.equals(tExtendedClass)) {
			if (tExtendedClass.equals(tClass.getParentClass())) {
				return new Object[] { tExtendedClass, tClass };
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
			ModelgeneratorRuleResult ruleResult, ClassDeclarationToTClass eClassDeclarationToTClass) {
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
			ModelgeneratorRuleResult ruleResult, ClassDeclarationToTClass eExtendedClassToTExtendedClass) {
		if (ruleResult.getCorrObjects().contains(eExtendedClassToTExtendedClass)) {
			return new Object[] { ruleResult, eExtendedClassToTExtendedClass };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TClass tExtendedClass) {
		if (ruleResult.getTargetObjects().contains(tExtendedClass)) {
			return new Object[] { ruleResult, tExtendedClass };
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
						if (tmpEClassDeclarationToTClass instanceof ClassDeclarationToTClass) {
							ClassDeclarationToTClass eClassDeclarationToTClass = (ClassDeclarationToTClass) tmpEClassDeclarationToTClass;
							ClassDeclaration eClassDeclaration = eClassDeclarationToTClass.getSource();
							if (eClassDeclaration != null) {
								TClass tClass = eClassDeclarationToTClass.getTarget();
								if (tClass != null) {
									if (pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											eClassDeclarationToTClass) == null) {
										if (pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												eClassDeclaration) == null) {
											if (pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tClass) == null) {
												for (EObject tmpEExtendedClassToTExtendedClass : eExtendedClassToTExtendedClassList
														.getEntryObjects()) {
													if (tmpEExtendedClassToTExtendedClass instanceof ClassDeclarationToTClass) {
														ClassDeclarationToTClass eExtendedClassToTExtendedClass = (ClassDeclarationToTClass) tmpEExtendedClassToTExtendedClass;
														if (!eClassDeclarationToTClass
																.equals(eExtendedClassToTExtendedClass)) {
															TClass tExtendedClass = eExtendedClassToTExtendedClass
																	.getTarget();
															if (tExtendedClass != null) {
																if (!tClass.equals(tExtendedClass)) {
																	ClassDeclaration eExtendedClass = eExtendedClassToTExtendedClass
																			.getSource();
																	if (eExtendedClass != null) {
																		if (!eClassDeclaration.equals(eExtendedClass)) {
																			if (pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_3BB(
																					ruleResult,
																					eExtendedClassToTExtendedClass) == null) {
																				if (pattern_ClassExtendsClass_29_2_isapplicablecore_black_nac_4BB(
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
																								eExtendedClassToTExtendedClass,
																								tExtendedClass,
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
			ClassDeclarationToTClass eClassDeclarationToTClass, ClassDeclarationToTClass eExtendedClassToTExtendedClass,
			ClassDeclaration eExtendedClass, TClass tExtendedClass, TClass tClass,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eClassDeclaration,
				eClassDeclarationToTClass, eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eClassDeclaration, eClassDeclarationToTClass,
					eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassExtendsClass_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			ClassExtendsClass _this, IsApplicableMatch isApplicableMatch, ClassDeclaration eClassDeclaration,
			ClassDeclarationToTClass eClassDeclarationToTClass, ClassDeclarationToTClass eExtendedClassToTExtendedClass,
			ClassDeclaration eExtendedClass, TClass tExtendedClass, TClass tClass,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ClassExtendsClass_29_3_solveCSP_binding = pattern_ClassExtendsClass_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass,
				eExtendedClass, tExtendedClass, tClass, ruleResult);
		if (result_pattern_ClassExtendsClass_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassExtendsClass_29_3_solveCSP_binding[0];

			Object[] result_pattern_ClassExtendsClass_29_3_solveCSP_black = pattern_ClassExtendsClass_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ClassExtendsClass_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eClassDeclaration, eClassDeclarationToTClass,
						eExtendedClassToTExtendedClass, eExtendedClass, tExtendedClass, tClass, ruleResult };
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
			ClassDeclaration eClassDeclaration, ClassDeclarationToTClass eClassDeclarationToTClass,
			ClassDeclarationToTClass eExtendedClassToTExtendedClass, ClassDeclaration eExtendedClass,
			TClass tExtendedClass, TClass tClass) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
				if (!tClass.equals(tExtendedClass)) {
					return new Object[] { eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass,
							eExtendedClass, tExtendedClass, tClass };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_29_6_perform_blackBBBBBBB(ClassDeclaration eClassDeclaration,
			ClassDeclarationToTClass eClassDeclarationToTClass, ClassDeclarationToTClass eExtendedClassToTExtendedClass,
			ClassDeclaration eExtendedClass, TClass tExtendedClass, TClass tClass,
			ModelgeneratorRuleResult ruleResult) {
		if (!eClassDeclaration.equals(eExtendedClass)) {
			if (!eClassDeclarationToTClass.equals(eExtendedClassToTExtendedClass)) {
				if (!tClass.equals(tExtendedClass)) {
					return new Object[] { eClassDeclaration, eClassDeclarationToTClass, eExtendedClassToTExtendedClass,
							eExtendedClass, tExtendedClass, tClass, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassExtendsClass_29_6_perform_greenFBBBBB(ClassDeclaration eClassDeclaration,
			ClassDeclaration eExtendedClass, TClass tExtendedClass, TClass tClass,
			ModelgeneratorRuleResult ruleResult) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		tClass.setParentClass(tExtendedClass);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		eTypeAccess.setType(eExtendedClass);
		eClassDeclaration.setSuperClass(eTypeAccess);
		ruleResult.getSourceObjects().add(eTypeAccess);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eTypeAccess, eClassDeclaration, eExtendedClass, tExtendedClass, tClass, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ClassExtendsClass_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ClassExtendsClassImpl
