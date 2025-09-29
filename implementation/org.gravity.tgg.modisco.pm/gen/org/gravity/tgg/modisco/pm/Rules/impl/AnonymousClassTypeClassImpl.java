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
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.AnonymousClassDeclarationToTClass;

import org.gravity.tgg.modisco.pm.Rules.AnonymousClassTypeClass;
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
 * An implementation of the model object '<em><b>Anonymous Class Type Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnonymousClassTypeClassImpl extends AbstractRuleImpl implements AnonymousClassTypeClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousClassTypeClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnonymousClassTypeClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Type mParent, ClassInstanceCreation mCreation,
			AnonymousClassDeclaration mAnonymous, TypeAccess mType) {

		Object[] result1_black = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_0_1_initialbindings_blackBBBBBB(this, match, mParent, mCreation,
						mAnonymous, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mParent] = " + mParent + ", " + "[mCreation] = " + mCreation
					+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, mParent, mCreation,
						mAnonymous, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mParent] = " + mParent + ", " + "[mCreation] = " + mCreation
					+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnonymousClassTypeClassImpl
					.pattern_AnonymousClassTypeClass_0_4_collectelementstobetranslated_blackBBBBB(match, mParent,
							mCreation, mAnonymous, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mParent] = " + mParent + ", " + "[mCreation] = " + mCreation + ", " + "[mAnonymous] = "
						+ mAnonymous + ", " + "[mType] = " + mType + ".");
			}
			AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_0_4_collectelementstobetranslated_greenBBBBFFF(
					match, mParent, mCreation, mType);
			//nothing EMoflonEdge mCreation__mType____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mType__mParent____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge mParent__mType____usagesInTypeAccess = (EMoflonEdge) result4_green[6];

			Object[] result5_black = AnonymousClassTypeClassImpl
					.pattern_AnonymousClassTypeClass_0_5_collectcontextelements_blackBBBBB(match, mParent, mCreation,
							mAnonymous, mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mParent] = " + mParent + ", " + "[mCreation] = " + mCreation + ", " + "[mAnonymous] = "
						+ mAnonymous + ", " + "[mType] = " + mType + ".");
			}
			AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_0_5_collectcontextelements_greenBBBBFF(match,
					mParent, mCreation, mAnonymous);
			//nothing EMoflonEdge mAnonymous__mCreation____classInstanceCreation = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result5_green[5];

			// 
			AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_0_6_registerobjectstomatch_expressionBBBBBB(
					this, match, mParent, mCreation, mAnonymous, mType);
			return AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_0_7_expressionF();
		} else {
			return AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TClass tClass = (TClass) result1_bindingAndBlack[0];
		Type mParent = (Type) result1_bindingAndBlack[1];
		ClassInstanceCreation mCreation = (ClassInstanceCreation) result1_bindingAndBlack[2];
		TypeToTAbstractType parentToParent = (TypeToTAbstractType) result1_bindingAndBlack[3];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result1_bindingAndBlack[4];
		TClass tParent = (TClass) result1_bindingAndBlack[5];
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result1_bindingAndBlack[6];
		TypeAccess mType = (TypeAccess) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_1_1_performtransformation_greenBB(tClass, tParent);

		Object[] result2_black = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_1_2_collecttranslatedelements_blackB(mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mType] = " + mType + ".");
		}
		Object[] result2_green = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_1_2_collecttranslatedelements_greenFB(mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_1_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult, tClass, mParent,
						mCreation, parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tClass] = " + tClass + ", " + "[mParent] = " + mParent + ", " + "[mCreation] = "
					+ mCreation + ", " + "[parentToParent] = " + parentToParent + ", " + "[mAnonymous] = " + mAnonymous
					+ ", " + "[tParent] = " + tParent + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ", " + "[mType] = " + mType + ".");
		}
		AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				tClass, mParent, mCreation, tParent, mType);
		//nothing EMoflonEdge mCreation__mType____type = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tClass__tParent____parentClasses = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tParent__tClass____childClasses = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mType__mParent____type = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mParent__mType____usagesInTypeAccess = (EMoflonEdge) result3_green[10];

		// 
		// 
		AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_1_5_registerobjects_expressionBBBBBBBBBB(this,
				ruleresult, tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass, mType);
		return AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Type mParent = (Type) result2_binding[0];
		ClassInstanceCreation mCreation = (ClassInstanceCreation) result2_binding[1];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_binding[2];
		TypeAccess mType = (TypeAccess) result2_binding[3];
		for (Object[] result2_black : AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_2_2_corematch_blackFBBFBFFBB(mParent, mCreation, mAnonymous, mType,
						match)) {
			TClass tClass = (TClass) result2_black[0];
			TypeToTAbstractType parentToParent = (TypeToTAbstractType) result2_black[3];
			TClass tParent = (TClass) result2_black[5];
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result2_black[6];
			// ForEach 
			for (Object[] result3_black : AnonymousClassTypeClassImpl
					.pattern_AnonymousClassTypeClass_2_3_findcontext_blackBBBBBBBB(tClass, mParent, mCreation,
							parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass, mType)) {
				Object[] result3_green = AnonymousClassTypeClassImpl
						.pattern_AnonymousClassTypeClass_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(tClass, mParent,
								mCreation, parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass,
								mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge mCreation__mType____type = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge parentToParent__tParent____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mAnonymous__mCreation____classInstanceCreation = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mType__mParent____type = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mParent__mType____usagesInTypeAccess = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge parentToParent__mParent____source = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = AnonymousClassTypeClassImpl
						.pattern_AnonymousClassTypeClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
								eAnonymousClassDeclarationToTClass, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tClass] = " + tClass + ", "
							+ "[mParent] = " + mParent + ", " + "[mCreation] = " + mCreation + ", "
							+ "[parentToParent] = " + parentToParent + ", " + "[mAnonymous] = " + mAnonymous + ", "
							+ "[tParent] = " + tParent + ", " + "[eAnonymousClassDeclarationToTClass] = "
							+ eAnonymousClassDeclarationToTClass + ", " + "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnonymousClassTypeClassImpl
							.pattern_AnonymousClassTypeClass_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Type mParent, ClassInstanceCreation mCreation,
			AnonymousClassDeclaration mAnonymous, TypeAccess mType) {
		match.registerObject("mParent", mParent);
		match.registerObject("mCreation", mCreation);
		match.registerObject("mAnonymous", mAnonymous);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Type mParent, ClassInstanceCreation mCreation,
			AnonymousClassDeclaration mAnonymous, TypeAccess mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TClass tClass, Type mParent,
			ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous,
			TClass tParent, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TypeAccess mType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("mParent", mParent);
		isApplicableMatch.registerObject("mCreation", mCreation);
		isApplicableMatch.registerObject("parentToParent", parentToParent);
		isApplicableMatch.registerObject("mAnonymous", mAnonymous);
		isApplicableMatch.registerObject("tParent", tParent);
		isApplicableMatch.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		isApplicableMatch.registerObject("mType", mType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tClass, EObject mParent, EObject mCreation,
			EObject parentToParent, EObject mAnonymous, EObject tParent, EObject eAnonymousClassDeclarationToTClass,
			EObject mType) {
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("mParent", mParent);
		ruleresult.registerObject("mCreation", mCreation);
		ruleresult.registerObject("parentToParent", parentToParent);
		ruleresult.registerObject("mAnonymous", mAnonymous);
		ruleresult.registerObject("tParent", tParent);
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mType").eClass()).equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TClass tClass, TClass tParent) {

		Object[] result1_black = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_10_1_initialbindings_blackBBBB(this, match, tClass, tParent);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tClass] = " + tClass + ", " + "[tParent] = " + tParent + ".");
		}

		Object[] result2_bindingAndBlack = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tClass, tParent);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tClass] = " + tClass + ", " + "[tParent] = " + tParent + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnonymousClassTypeClassImpl
					.pattern_AnonymousClassTypeClass_10_4_collectelementstobetranslated_blackBBB(match, tClass,
							tParent);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[tParent] = " + tParent + ".");
			}
			AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_10_4_collectelementstobetranslated_greenBBBFF(
					match, tClass, tParent);
			//nothing EMoflonEdge tClass__tParent____parentClasses = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tParent__tClass____childClasses = (EMoflonEdge) result4_green[4];

			Object[] result5_black = AnonymousClassTypeClassImpl
					.pattern_AnonymousClassTypeClass_10_5_collectcontextelements_blackBBB(match, tClass, tParent);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[tParent] = " + tParent + ".");
			}
			AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_10_5_collectcontextelements_greenBBB(match,
					tClass, tParent);

			// 
			AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_10_6_registerobjectstomatch_expressionBBBB(this,
					match, tClass, tParent);
			return AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_10_7_expressionF();
		} else {
			return AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TClass tClass = (TClass) result1_bindingAndBlack[0];
		Type mParent = (Type) result1_bindingAndBlack[1];
		ClassInstanceCreation mCreation = (ClassInstanceCreation) result1_bindingAndBlack[2];
		TypeToTAbstractType parentToParent = (TypeToTAbstractType) result1_bindingAndBlack[3];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result1_bindingAndBlack[4];
		TClass tParent = (TClass) result1_bindingAndBlack[5];
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_11_1_performtransformation_greenBBF(mParent, mCreation);
		TypeAccess mType = (TypeAccess) result1_green[2];

		Object[] result2_black = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_11_2_collecttranslatedelements_blackB(mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mType] = " + mType + ".");
		}
		Object[] result2_green = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_11_2_collecttranslatedelements_greenFB(mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_11_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult, tClass, mParent,
						mCreation, parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tClass] = " + tClass + ", " + "[mParent] = " + mParent + ", " + "[mCreation] = "
					+ mCreation + ", " + "[parentToParent] = " + parentToParent + ", " + "[mAnonymous] = " + mAnonymous
					+ ", " + "[tParent] = " + tParent + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ", " + "[mType] = " + mType + ".");
		}
		AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, tClass, mParent, mCreation, tParent, mType);
		//nothing EMoflonEdge mCreation__mType____type = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tClass__tParent____parentClasses = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tParent__tClass____childClasses = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mType__mParent____type = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mParent__mType____usagesInTypeAccess = (EMoflonEdge) result3_green[10];

		// 
		// 
		AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_11_5_registerobjects_expressionBBBBBBBBBB(this,
				ruleresult, tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass, mType);
		return AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tClass = (TClass) result2_binding[0];
		TClass tParent = (TClass) result2_binding[1];
		for (Object[] result2_black : AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_12_2_corematch_blackBFFFBFB(tClass, tParent, match)) {
			Type mParent = (Type) result2_black[1];
			TypeToTAbstractType parentToParent = (TypeToTAbstractType) result2_black[2];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_black[3];
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result2_black[5];
			// ForEach 
			for (Object[] result3_black : AnonymousClassTypeClassImpl
					.pattern_AnonymousClassTypeClass_12_3_findcontext_blackBBFBBBB(tClass, mParent, parentToParent,
							mAnonymous, tParent, eAnonymousClassDeclarationToTClass)) {
				ClassInstanceCreation mCreation = (ClassInstanceCreation) result3_black[2];
				Object[] result3_green = AnonymousClassTypeClassImpl
						.pattern_AnonymousClassTypeClass_12_3_findcontext_greenBBBBBBBFFFFFFFFF(tClass, mParent,
								mCreation, parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge parentToParent__tParent____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mAnonymous__mCreation____classInstanceCreation = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tClass__tParent____parentClasses = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tParent__tClass____childClasses = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge parentToParent__mParent____source = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = AnonymousClassTypeClassImpl
						.pattern_AnonymousClassTypeClass_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
								eAnonymousClassDeclarationToTClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tClass] = " + tClass + ", "
							+ "[mParent] = " + mParent + ", " + "[mCreation] = " + mCreation + ", "
							+ "[parentToParent] = " + parentToParent + ", " + "[mAnonymous] = " + mAnonymous + ", "
							+ "[tParent] = " + tParent + ", " + "[eAnonymousClassDeclarationToTClass] = "
							+ eAnonymousClassDeclarationToTClass + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = AnonymousClassTypeClassImpl
							.pattern_AnonymousClassTypeClass_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tClass, TClass tParent) {
		match.registerObject("tClass", tClass);
		match.registerObject("tParent", tParent);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tClass, TClass tParent) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TClass tClass, Type mParent,
			ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous,
			TClass tParent, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("mParent", mParent);
		isApplicableMatch.registerObject("mCreation", mCreation);
		isApplicableMatch.registerObject("parentToParent", parentToParent);
		isApplicableMatch.registerObject("mAnonymous", mAnonymous);
		isApplicableMatch.registerObject("tParent", tParent);
		isApplicableMatch.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tClass, EObject mParent, EObject mCreation,
			EObject parentToParent, EObject mAnonymous, EObject tParent, EObject eAnonymousClassDeclarationToTClass,
			EObject mType) {
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("mParent", mParent);
		ruleresult.registerObject("mCreation", mCreation);
		ruleresult.registerObject("parentToParent", parentToParent);
		ruleresult.registerObject("mAnonymous", mAnonymous);
		ruleresult.registerObject("tParent", tParent);
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("mType", mType);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_67(EMoflonEdge _edge_parentClasses) {

		Object[] result1_bindingAndBlack = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_20_2_testcorematchandDECs_blackFFB(_edge_parentClasses)) {
			TClass tClass = (TClass) result2_black[0];
			TClass tParent = (TClass) result2_black[1];
			Object[] result2_green = AnonymousClassTypeClassImpl
					.pattern_AnonymousClassTypeClass_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnonymousClassTypeClassImpl
					.pattern_AnonymousClassTypeClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tClass, tParent)) {
				// 
				if (AnonymousClassTypeClassImpl
						.pattern_AnonymousClassTypeClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnonymousClassTypeClassImpl
							.pattern_AnonymousClassTypeClass_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_72(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_blackFFFFB(_edge_type)) {
			Type mParent = (Type) result2_black[0];
			ClassInstanceCreation mCreation = (ClassInstanceCreation) result2_black[1];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_black[2];
			TypeAccess mType = (TypeAccess) result2_black[3];
			Object[] result2_green = AnonymousClassTypeClassImpl
					.pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnonymousClassTypeClassImpl
					.pattern_AnonymousClassTypeClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, mParent, mCreation, mAnonymous, mType)) {
				// 
				if (AnonymousClassTypeClassImpl
						.pattern_AnonymousClassTypeClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnonymousClassTypeClassImpl
							.pattern_AnonymousClassTypeClass_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnonymousClassTypeClass");
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
		ruleResult.setRule("AnonymousClassTypeClass");
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

		Object[] result1_black = AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TClass tClass = (TClass) result2_bindingAndBlack[0];
		Type mParent = (Type) result2_bindingAndBlack[1];
		ClassInstanceCreation mCreation = (ClassInstanceCreation) result2_bindingAndBlack[2];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_bindingAndBlack[3];
		TClass tParent = (TClass) result2_bindingAndBlack[4];
		TypeAccess mType = (TypeAccess) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tClass, mParent,
						mCreation, mAnonymous, tParent, mType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ", " + "[mParent] = " + mParent + ", " + "[mCreation] = " + mCreation
					+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[tParent] = " + tParent + ", " + "[mType] = "
					+ mType + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnonymousClassTypeClassImpl
					.pattern_AnonymousClassTypeClass_24_5_matchcorrcontext_blackBBFBBFBB(tClass, mParent, mAnonymous,
							tParent, sourceMatch, targetMatch)) {
				TypeToTAbstractType parentToParent = (TypeToTAbstractType) result5_black[2];
				AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result5_black[5];
				Object[] result5_green = AnonymousClassTypeClassImpl
						.pattern_AnonymousClassTypeClass_24_5_matchcorrcontext_greenBBBBF(parentToParent,
								eAnonymousClassDeclarationToTClass, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = AnonymousClassTypeClassImpl
						.pattern_AnonymousClassTypeClass_24_6_createcorrespondence_blackBBBBBBB(tClass, mParent,
								mCreation, mAnonymous, tParent, mType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass
							+ ", " + "[mParent] = " + mParent + ", " + "[mCreation] = " + mCreation + ", "
							+ "[mAnonymous] = " + mAnonymous + ", " + "[tParent] = " + tParent + ", " + "[mType] = "
							+ mType + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = AnonymousClassTypeClassImpl
						.pattern_AnonymousClassTypeClass_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TClass tClass, Type mParent, ClassInstanceCreation mCreation,
			AnonymousClassDeclaration mAnonymous, TClass tParent, TypeAccess mType, Match sourceMatch,
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
	public boolean checkDEC_FWD(Type mParent, ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous,
			TypeAccess mType) {// 
		Object[] result1_black = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_27_1_matchtggpattern_blackBBBB(mParent, mCreation, mAnonymous, mType);
		if (result1_black != null) {
			return AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_27_2_expressionF();
		} else {
			return AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tClass, TClass tParent) {// 
		Object[] result1_black = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_28_1_matchtggpattern_blackBB(tClass, tParent);
		if (result1_black != null) {
			return AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_28_2_expressionF();
		} else {
			return AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClassParameter,
			TypeToTAbstractType parentToParentParameter) {

		Object[] result1_black = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnonymousClassTypeClassImpl
				.pattern_AnonymousClassTypeClass_29_2_isapplicablecore_blackFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList eAnonymousClassDeclarationToTClassList = (RuleEntryList) result2_black[0];
			TClass tClass = (TClass) result2_black[1];
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result2_black[2];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_black[3];
			ClassInstanceCreation mCreation = (ClassInstanceCreation) result2_black[4];
			//nothing RuleEntryList parentToParentList = (RuleEntryList) result2_black[5];
			Type mParent = (Type) result2_black[6];
			TypeToTAbstractType parentToParent = (TypeToTAbstractType) result2_black[7];
			TClass tParent = (TClass) result2_black[8];

			Object[] result3_bindingAndBlack = AnonymousClassTypeClassImpl
					.pattern_AnonymousClassTypeClass_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
							eAnonymousClassDeclarationToTClass, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tClass] = " + tClass + ", "
						+ "[mParent] = " + mParent + ", " + "[mCreation] = " + mCreation + ", " + "[parentToParent] = "
						+ parentToParent + ", " + "[mAnonymous] = " + mAnonymous + ", " + "[tParent] = " + tParent
						+ ", " + "[eAnonymousClassDeclarationToTClass] = " + eAnonymousClassDeclarationToTClass + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnonymousClassTypeClassImpl
						.pattern_AnonymousClassTypeClass_29_5_checknacs_blackBBBBBBB(tClass, mParent, mCreation,
								parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass);
				if (result5_black != null) {

					Object[] result6_black = AnonymousClassTypeClassImpl
							.pattern_AnonymousClassTypeClass_29_6_perform_blackBBBBBBBB(tClass, mParent, mCreation,
									parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass
								+ ", " + "[mParent] = " + mParent + ", " + "[mCreation] = " + mCreation + ", "
								+ "[parentToParent] = " + parentToParent + ", " + "[mAnonymous] = " + mAnonymous + ", "
								+ "[tParent] = " + tParent + ", " + "[eAnonymousClassDeclarationToTClass] = "
								+ eAnonymousClassDeclarationToTClass + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_29_6_perform_greenBBBBFB(tClass,
							mParent, mCreation, tParent, ruleResult);
					//nothing TypeAccess mType = (TypeAccess) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return AnonymousClassTypeClassImpl.pattern_AnonymousClassTypeClass_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TClass tClass, Type mParent,
			ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous,
			TClass tParent, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
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
		isApplicableMatch.registerObject("mParent", mParent);
		isApplicableMatch.registerObject("mCreation", mCreation);
		isApplicableMatch.registerObject("parentToParent", parentToParent);
		isApplicableMatch.registerObject("mAnonymous", mAnonymous);
		isApplicableMatch.registerObject("tParent", tParent);
		isApplicableMatch.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
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
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___IS_APPROPRIATE_FWD__MATCH_TYPE_CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_TYPEACCESS:
				return isAppropriate_FWD((Match) arguments.get(0), (Type) arguments.get(1),
						(ClassInstanceCreation) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
						(TypeAccess) arguments.get(4));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPE_CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_TYPEACCESS:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (Type) arguments.get(1),
						(ClassInstanceCreation) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
						(TypeAccess) arguments.get(4));
				return null;
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPE_CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_TYPEACCESS:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Type) arguments.get(1),
						(ClassInstanceCreation) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
						(TypeAccess) arguments.get(4));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TCLASS_TYPE_CLASSINSTANCECREATION_TYPETOTABSTRACTTYPE_ANONYMOUSCLASSDECLARATION_TCLASS_ANONYMOUSCLASSDECLARATIONTOTCLASS_TYPEACCESS:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
						(Type) arguments.get(2), (ClassInstanceCreation) arguments.get(3),
						(TypeToTAbstractType) arguments.get(4), (AnonymousClassDeclaration) arguments.get(5),
						(TClass) arguments.get(6), (AnonymousClassDeclarationToTClass) arguments.get(7),
						(TypeAccess) arguments.get(8));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8));
				return null;
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___IS_APPROPRIATE_BWD__MATCH_TCLASS_TCLASS:
				return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
						(TClass) arguments.get(2));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TCLASS:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
						(TClass) arguments.get(2));
				return null;
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TCLASS:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
						(TClass) arguments.get(2));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCLASS_TYPE_CLASSINSTANCECREATION_TYPETOTABSTRACTTYPE_ANONYMOUSCLASSDECLARATION_TCLASS_ANONYMOUSCLASSDECLARATIONTOTCLASS:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
						(Type) arguments.get(2), (ClassInstanceCreation) arguments.get(3),
						(TypeToTAbstractType) arguments.get(4), (AnonymousClassDeclaration) arguments.get(5),
						(TClass) arguments.get(6), (AnonymousClassDeclarationToTClass) arguments.get(7));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8));
				return null;
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_67__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_67((EMoflonEdge) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_72__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_72((EMoflonEdge) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__TCLASS_TYPE_CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_TCLASS_TYPEACCESS_MATCH_MATCH:
				return isApplicable_solveCsp_CC((TClass) arguments.get(0), (Type) arguments.get(1),
						(ClassInstanceCreation) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
						(TClass) arguments.get(4), (TypeAccess) arguments.get(5), (Match) arguments.get(6),
						(Match) arguments.get(7));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___CHECK_DEC_FWD__TYPE_CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_TYPEACCESS:
				return checkDEC_FWD((Type) arguments.get(0), (ClassInstanceCreation) arguments.get(1),
						(AnonymousClassDeclaration) arguments.get(2), (TypeAccess) arguments.get(3));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___CHECK_DEC_BWD__TCLASS_TCLASS:
				return checkDEC_BWD((TClass) arguments.get(0), (TClass) arguments.get(1));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER_ANONYMOUSCLASSDECLARATIONTOTCLASS_TYPETOTABSTRACTTYPE:
				return generateModel((RuleEntryContainer) arguments.get(0),
						(AnonymousClassDeclarationToTClass) arguments.get(1), (TypeToTAbstractType) arguments.get(2));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCLASS_TYPE_CLASSINSTANCECREATION_TYPETOTABSTRACTTYPE_ANONYMOUSCLASSDECLARATION_TCLASS_ANONYMOUSCLASSDECLARATIONTOTCLASS_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
						(Type) arguments.get(2), (ClassInstanceCreation) arguments.get(3),
						(TypeToTAbstractType) arguments.get(4), (AnonymousClassDeclaration) arguments.get(5),
						(TClass) arguments.get(6), (AnonymousClassDeclarationToTClass) arguments.get(7),
						(ModelgeneratorRuleResult) arguments.get(8));
			case RulesPackage.ANONYMOUS_CLASS_TYPE_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnonymousClassTypeClass_0_1_initialbindings_blackBBBBBB(
			AnonymousClassTypeClass _this, Match match, Type mParent, ClassInstanceCreation mCreation,
			AnonymousClassDeclaration mAnonymous, TypeAccess mType) {
		return new Object[] { _this, match, mParent, mCreation, mAnonymous, mType };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_0_2_SolveCSP_bindingFBBBBBB(
			AnonymousClassTypeClass _this, Match match, Type mParent, ClassInstanceCreation mCreation,
			AnonymousClassDeclaration mAnonymous, TypeAccess mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mParent, mCreation, mAnonymous, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mParent, mCreation, mAnonymous, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			AnonymousClassTypeClass _this, Match match, Type mParent, ClassInstanceCreation mCreation,
			AnonymousClassDeclaration mAnonymous, TypeAccess mType) {
		Object[] result_pattern_AnonymousClassTypeClass_0_2_SolveCSP_binding = pattern_AnonymousClassTypeClass_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, mParent, mCreation, mAnonymous, mType);
		if (result_pattern_AnonymousClassTypeClass_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassTypeClass_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnonymousClassTypeClass_0_2_SolveCSP_black = pattern_AnonymousClassTypeClass_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClassTypeClass_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mParent, mCreation, mAnonymous, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassTypeClass_0_3_CheckCSP_expressionFBB(
			AnonymousClassTypeClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, Type mParent, ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous,
			TypeAccess mType) {
		return new Object[] { match, mParent, mCreation, mAnonymous, mType };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, Type mParent, ClassInstanceCreation mCreation, TypeAccess mType) {
		EMoflonEdge mCreation__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mParent____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParent__mType____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mType);
		String mCreation__mType____type_name_prime = "type";
		String mType__mParent____type_name_prime = "type";
		String mParent__mType____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		mCreation__mType____type.setSrc(mCreation);
		mCreation__mType____type.setTrg(mType);
		match.getToBeTranslatedEdges().add(mCreation__mType____type);
		mType__mParent____type.setSrc(mType);
		mType__mParent____type.setTrg(mParent);
		match.getToBeTranslatedEdges().add(mType__mParent____type);
		mParent__mType____usagesInTypeAccess.setSrc(mParent);
		mParent__mType____usagesInTypeAccess.setTrg(mType);
		match.getToBeTranslatedEdges().add(mParent__mType____usagesInTypeAccess);
		mCreation__mType____type.setName(mCreation__mType____type_name_prime);
		mType__mParent____type.setName(mType__mParent____type_name_prime);
		mParent__mType____usagesInTypeAccess.setName(mParent__mType____usagesInTypeAccess_name_prime);
		return new Object[] { match, mParent, mCreation, mType, mCreation__mType____type, mType__mParent____type,
				mParent__mType____usagesInTypeAccess };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_0_5_collectcontextelements_blackBBBBB(Match match,
			Type mParent, ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous, TypeAccess mType) {
		return new Object[] { match, mParent, mCreation, mAnonymous, mType };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_0_5_collectcontextelements_greenBBBBFF(Match match,
			Type mParent, ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous) {
		EMoflonEdge mAnonymous__mCreation____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mParent);
		match.getContextNodes().add(mCreation);
		match.getContextNodes().add(mAnonymous);
		String mAnonymous__mCreation____classInstanceCreation_name_prime = "classInstanceCreation";
		String mCreation__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		mAnonymous__mCreation____classInstanceCreation.setSrc(mAnonymous);
		mAnonymous__mCreation____classInstanceCreation.setTrg(mCreation);
		match.getContextEdges().add(mAnonymous__mCreation____classInstanceCreation);
		mCreation__mAnonymous____anonymousClassDeclaration.setSrc(mCreation);
		mCreation__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		match.getContextEdges().add(mCreation__mAnonymous____anonymousClassDeclaration);
		mAnonymous__mCreation____classInstanceCreation
				.setName(mAnonymous__mCreation____classInstanceCreation_name_prime);
		mCreation__mAnonymous____anonymousClassDeclaration
				.setName(mCreation__mAnonymous____anonymousClassDeclaration_name_prime);
		return new Object[] { match, mParent, mCreation, mAnonymous, mAnonymous__mCreation____classInstanceCreation,
				mCreation__mAnonymous____anonymousClassDeclaration };
	}

	public static final void pattern_AnonymousClassTypeClass_0_6_registerobjectstomatch_expressionBBBBBB(
			AnonymousClassTypeClass _this, Match match, Type mParent, ClassInstanceCreation mCreation,
			AnonymousClassDeclaration mAnonymous, TypeAccess mType) {
		_this.registerObjectsToMatch_FWD(match, mParent, mCreation, mAnonymous, mType);

	}

	public static final boolean pattern_AnonymousClassTypeClass_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClassTypeClass_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("mParent");
		EObject _localVariable_2 = isApplicableMatch.getObject("mCreation");
		EObject _localVariable_3 = isApplicableMatch.getObject("parentToParent");
		EObject _localVariable_4 = isApplicableMatch.getObject("mAnonymous");
		EObject _localVariable_5 = isApplicableMatch.getObject("tParent");
		EObject _localVariable_6 = isApplicableMatch.getObject("eAnonymousClassDeclarationToTClass");
		EObject _localVariable_7 = isApplicableMatch.getObject("mType");
		EObject tmpTClass = _localVariable_0;
		EObject tmpMParent = _localVariable_1;
		EObject tmpMCreation = _localVariable_2;
		EObject tmpParentToParent = _localVariable_3;
		EObject tmpMAnonymous = _localVariable_4;
		EObject tmpTParent = _localVariable_5;
		EObject tmpEAnonymousClassDeclarationToTClass = _localVariable_6;
		EObject tmpMType = _localVariable_7;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpMParent instanceof Type) {
				Type mParent = (Type) tmpMParent;
				if (tmpMCreation instanceof ClassInstanceCreation) {
					ClassInstanceCreation mCreation = (ClassInstanceCreation) tmpMCreation;
					if (tmpParentToParent instanceof TypeToTAbstractType) {
						TypeToTAbstractType parentToParent = (TypeToTAbstractType) tmpParentToParent;
						if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
							AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
							if (tmpTParent instanceof TClass) {
								TClass tParent = (TClass) tmpTParent;
								if (tmpEAnonymousClassDeclarationToTClass instanceof AnonymousClassDeclarationToTClass) {
									AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) tmpEAnonymousClassDeclarationToTClass;
									if (tmpMType instanceof TypeAccess) {
										TypeAccess mType = (TypeAccess) tmpMType;
										return new Object[] { tClass, mParent, mCreation, parentToParent, mAnonymous,
												tParent, eAnonymousClassDeclarationToTClass, mType, isApplicableMatch };
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

	public static final Object[] pattern_AnonymousClassTypeClass_1_1_performtransformation_blackBBBBBBBBFBB(
			TClass tClass, Type mParent, ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent,
			AnonymousClassDeclaration mAnonymous, TClass tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TypeAccess mType,
			AnonymousClassTypeClass _this, IsApplicableMatch isApplicableMatch) {
		if (!tClass.equals(tParent)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
							eAnonymousClassDeclarationToTClass, mType, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			AnonymousClassTypeClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnonymousClassTypeClass_1_1_performtransformation_binding = pattern_AnonymousClassTypeClass_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnonymousClassTypeClass_1_1_performtransformation_binding != null) {
			TClass tClass = (TClass) result_pattern_AnonymousClassTypeClass_1_1_performtransformation_binding[0];
			Type mParent = (Type) result_pattern_AnonymousClassTypeClass_1_1_performtransformation_binding[1];
			ClassInstanceCreation mCreation = (ClassInstanceCreation) result_pattern_AnonymousClassTypeClass_1_1_performtransformation_binding[2];
			TypeToTAbstractType parentToParent = (TypeToTAbstractType) result_pattern_AnonymousClassTypeClass_1_1_performtransformation_binding[3];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_AnonymousClassTypeClass_1_1_performtransformation_binding[4];
			TClass tParent = (TClass) result_pattern_AnonymousClassTypeClass_1_1_performtransformation_binding[5];
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result_pattern_AnonymousClassTypeClass_1_1_performtransformation_binding[6];
			TypeAccess mType = (TypeAccess) result_pattern_AnonymousClassTypeClass_1_1_performtransformation_binding[7];

			Object[] result_pattern_AnonymousClassTypeClass_1_1_performtransformation_black = pattern_AnonymousClassTypeClass_1_1_performtransformation_blackBBBBBBBBFBB(
					tClass, mParent, mCreation, parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass,
					mType, _this, isApplicableMatch);
			if (result_pattern_AnonymousClassTypeClass_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnonymousClassTypeClass_1_1_performtransformation_black[8];

				return new Object[] { tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
						eAnonymousClassDeclarationToTClass, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_1_1_performtransformation_greenBB(TClass tClass,
			TClass tParent) {
		tClass.getParentClasses().add(tParent);
		return new Object[] { tClass, tParent };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_1_2_collecttranslatedelements_blackB(
			TypeAccess mType) {
		return new Object[] { mType };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_1_2_collecttranslatedelements_greenFB(
			TypeAccess mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mType);
		return new Object[] { ruleresult, mType };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tClass, EObject mParent, EObject mCreation, EObject parentToParent,
			EObject mAnonymous, EObject tParent, EObject eAnonymousClassDeclarationToTClass, EObject mType) {
		if (!tClass.equals(tParent)) {
			if (!mParent.equals(tClass)) {
				if (!mParent.equals(parentToParent)) {
					if (!mParent.equals(tParent)) {
						if (!mParent.equals(mType)) {
							if (!mCreation.equals(tClass)) {
								if (!mCreation.equals(mParent)) {
									if (!mCreation.equals(parentToParent)) {
										if (!mCreation.equals(tParent)) {
											if (!mCreation.equals(mType)) {
												if (!parentToParent.equals(tClass)) {
													if (!parentToParent.equals(tParent)) {
														if (!mAnonymous.equals(tClass)) {
															if (!mAnonymous.equals(mParent)) {
																if (!mAnonymous.equals(mCreation)) {
																	if (!mAnonymous.equals(parentToParent)) {
																		if (!mAnonymous.equals(tParent)) {
																			if (!mAnonymous.equals(mType)) {
																				if (!eAnonymousClassDeclarationToTClass
																						.equals(tClass)) {
																					if (!eAnonymousClassDeclarationToTClass
																							.equals(mParent)) {
																						if (!eAnonymousClassDeclarationToTClass
																								.equals(mCreation)) {
																							if (!eAnonymousClassDeclarationToTClass
																									.equals(parentToParent)) {
																								if (!eAnonymousClassDeclarationToTClass
																										.equals(mAnonymous)) {
																									if (!eAnonymousClassDeclarationToTClass
																											.equals(tParent)) {
																										if (!eAnonymousClassDeclarationToTClass
																												.equals(mType)) {
																											if (!mType
																													.equals(tClass)) {
																												if (!mType
																														.equals(parentToParent)) {
																													if (!mType
																															.equals(tParent)) {
																														return new Object[] {
																																ruleresult,
																																tClass,
																																mParent,
																																mCreation,
																																parentToParent,
																																mAnonymous,
																																tParent,
																																eAnonymousClassDeclarationToTClass,
																																mType };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnonymousClassTypeClass_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tClass, EObject mParent, EObject mCreation, EObject tParent,
			EObject mType) {
		EMoflonEdge mCreation__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tParent____parentClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParent__tClass____childClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mParent____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParent__mType____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnonymousClassTypeClass";
		String mCreation__mType____type_name_prime = "type";
		String tClass__tParent____parentClasses_name_prime = "parentClasses";
		String tParent__tClass____childClasses_name_prime = "childClasses";
		String mType__mParent____type_name_prime = "type";
		String mParent__mType____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		mCreation__mType____type.setSrc(mCreation);
		mCreation__mType____type.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mCreation__mType____type);
		tClass__tParent____parentClasses.setSrc(tClass);
		tClass__tParent____parentClasses.setTrg(tParent);
		ruleresult.getCreatedEdges().add(tClass__tParent____parentClasses);
		tParent__tClass____childClasses.setSrc(tParent);
		tParent__tClass____childClasses.setTrg(tClass);
		ruleresult.getCreatedEdges().add(tParent__tClass____childClasses);
		mType__mParent____type.setSrc(mType);
		mType__mParent____type.setTrg(mParent);
		ruleresult.getTranslatedEdges().add(mType__mParent____type);
		mParent__mType____usagesInTypeAccess.setSrc(mParent);
		mParent__mType____usagesInTypeAccess.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mParent__mType____usagesInTypeAccess);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mCreation__mType____type.setName(mCreation__mType____type_name_prime);
		tClass__tParent____parentClasses.setName(tClass__tParent____parentClasses_name_prime);
		tParent__tClass____childClasses.setName(tParent__tClass____childClasses_name_prime);
		mType__mParent____type.setName(mType__mParent____type_name_prime);
		mParent__mType____usagesInTypeAccess.setName(mParent__mType____usagesInTypeAccess_name_prime);
		return new Object[] { ruleresult, tClass, mParent, mCreation, tParent, mType, mCreation__mType____type,
				tClass__tParent____parentClasses, tParent__tClass____childClasses, mType__mParent____type,
				mParent__mType____usagesInTypeAccess };
	}

	public static final void pattern_AnonymousClassTypeClass_1_5_registerobjects_expressionBBBBBBBBBB(
			AnonymousClassTypeClass _this, PerformRuleResult ruleresult, EObject tClass, EObject mParent,
			EObject mCreation, EObject parentToParent, EObject mAnonymous, EObject tParent,
			EObject eAnonymousClassDeclarationToTClass, EObject mType) {
		_this.registerObjects_FWD(ruleresult, tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass, mType);

	}

	public static final PerformRuleResult pattern_AnonymousClassTypeClass_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_2_1_preparereturnvalue_bindingFB(
			AnonymousClassTypeClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnonymousClassTypeClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnonymousClassTypeClass _this) {
		Object[] result_pattern_AnonymousClassTypeClass_2_1_preparereturnvalue_binding = pattern_AnonymousClassTypeClass_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClassTypeClass_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnonymousClassTypeClass_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClassTypeClass_2_1_preparereturnvalue_black = pattern_AnonymousClassTypeClass_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnonymousClassTypeClass_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnonymousClassTypeClass_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnonymousClassTypeClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mParent");
		EObject _localVariable_1 = match.getObject("mCreation");
		EObject _localVariable_2 = match.getObject("mAnonymous");
		EObject _localVariable_3 = match.getObject("mType");
		EObject tmpMParent = _localVariable_0;
		EObject tmpMCreation = _localVariable_1;
		EObject tmpMAnonymous = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		if (tmpMParent instanceof Type) {
			Type mParent = (Type) tmpMParent;
			if (tmpMCreation instanceof ClassInstanceCreation) {
				ClassInstanceCreation mCreation = (ClassInstanceCreation) tmpMCreation;
				if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
					AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
					if (tmpMType instanceof TypeAccess) {
						TypeAccess mType = (TypeAccess) tmpMType;
						return new Object[] { mParent, mCreation, mAnonymous, mType, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassTypeClass_2_2_corematch_blackFBBFBFFBB(Type mParent,
			ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous, TypeAccess mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAnonymous, AnonymousClassDeclarationToTClass.class, "source")) {
			TClass tClass = eAnonymousClassDeclarationToTClass.getTarget();
			if (tClass != null) {
				for (TypeToTAbstractType parentToParent : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mParent, TypeToTAbstractType.class, "source")) {
					TAbstractType tmpTParent = parentToParent.getTarget();
					if (tmpTParent instanceof TClass) {
						TClass tParent = (TClass) tmpTParent;
						if (!tClass.equals(tParent)) {
							_result.add(new Object[] { tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
									eAnonymousClassDeclarationToTClass, mType, match });
						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassTypeClass_2_3_findcontext_blackBBBBBBBB(TClass tClass,
			Type mParent, ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent,
			AnonymousClassDeclaration mAnonymous, TClass tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TypeAccess mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tClass.equals(tParent)) {
			if (mType.equals(mCreation.getType())) {
				if (tParent.equals(parentToParent.getTarget())) {
					if (tClass.equals(eAnonymousClassDeclarationToTClass.getTarget())) {
						if (mCreation.equals(mAnonymous.getClassInstanceCreation())) {
							if (mAnonymous.equals(eAnonymousClassDeclarationToTClass.getSource())) {
								if (mParent.equals(mType.getType())) {
									if (mParent.equals(parentToParent.getSource())) {
										_result.add(new Object[] { tClass, mParent, mCreation, parentToParent,
												mAnonymous, tParent, eAnonymousClassDeclarationToTClass, mType });
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

	public static final Object[] pattern_AnonymousClassTypeClass_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(TClass tClass,
			Type mParent, ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent,
			AnonymousClassDeclaration mAnonymous, TClass tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TypeAccess mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mCreation__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge parentToParent__tParent____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mCreation____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mType__mParent____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParent__mType____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge parentToParent__mParent____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mCreation__mType____type_name_prime = "type";
		String parentToParent__tParent____target_name_prime = "target";
		String eAnonymousClassDeclarationToTClass__tClass____target_name_prime = "target";
		String mAnonymous__mCreation____classInstanceCreation_name_prime = "classInstanceCreation";
		String mCreation__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime = "source";
		String mType__mParent____type_name_prime = "type";
		String mParent__mType____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String parentToParent__mParent____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(mParent);
		isApplicableMatch.getAllContextElements().add(mCreation);
		isApplicableMatch.getAllContextElements().add(parentToParent);
		isApplicableMatch.getAllContextElements().add(mAnonymous);
		isApplicableMatch.getAllContextElements().add(tParent);
		isApplicableMatch.getAllContextElements().add(eAnonymousClassDeclarationToTClass);
		isApplicableMatch.getAllContextElements().add(mType);
		mCreation__mType____type.setSrc(mCreation);
		mCreation__mType____type.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mCreation__mType____type);
		parentToParent__tParent____target.setSrc(parentToParent);
		parentToParent__tParent____target.setTrg(tParent);
		isApplicableMatch.getAllContextElements().add(parentToParent__tParent____target);
		eAnonymousClassDeclarationToTClass__tClass____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(eAnonymousClassDeclarationToTClass__tClass____target);
		mAnonymous__mCreation____classInstanceCreation.setSrc(mAnonymous);
		mAnonymous__mCreation____classInstanceCreation.setTrg(mCreation);
		isApplicableMatch.getAllContextElements().add(mAnonymous__mCreation____classInstanceCreation);
		mCreation__mAnonymous____anonymousClassDeclaration.setSrc(mCreation);
		mCreation__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mCreation__mAnonymous____anonymousClassDeclaration);
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(eAnonymousClassDeclarationToTClass__mAnonymous____source);
		mType__mParent____type.setSrc(mType);
		mType__mParent____type.setTrg(mParent);
		isApplicableMatch.getAllContextElements().add(mType__mParent____type);
		mParent__mType____usagesInTypeAccess.setSrc(mParent);
		mParent__mType____usagesInTypeAccess.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mParent__mType____usagesInTypeAccess);
		parentToParent__mParent____source.setSrc(parentToParent);
		parentToParent__mParent____source.setTrg(mParent);
		isApplicableMatch.getAllContextElements().add(parentToParent__mParent____source);
		mCreation__mType____type.setName(mCreation__mType____type_name_prime);
		parentToParent__tParent____target.setName(parentToParent__tParent____target_name_prime);
		eAnonymousClassDeclarationToTClass__tClass____target
				.setName(eAnonymousClassDeclarationToTClass__tClass____target_name_prime);
		mAnonymous__mCreation____classInstanceCreation
				.setName(mAnonymous__mCreation____classInstanceCreation_name_prime);
		mCreation__mAnonymous____anonymousClassDeclaration
				.setName(mCreation__mAnonymous____anonymousClassDeclaration_name_prime);
		eAnonymousClassDeclarationToTClass__mAnonymous____source
				.setName(eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime);
		mType__mParent____type.setName(mType__mParent____type_name_prime);
		mParent__mType____usagesInTypeAccess.setName(mParent__mType____usagesInTypeAccess_name_prime);
		parentToParent__mParent____source.setName(parentToParent__mParent____source_name_prime);
		return new Object[] { tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass, mType, isApplicableMatch, mCreation__mType____type,
				parentToParent__tParent____target, eAnonymousClassDeclarationToTClass__tClass____target,
				mAnonymous__mCreation____classInstanceCreation, mCreation__mAnonymous____anonymousClassDeclaration,
				eAnonymousClassDeclarationToTClass__mAnonymous____source, mType__mParent____type,
				mParent__mType____usagesInTypeAccess, parentToParent__mParent____source };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_2_4_solveCSP_bindingFBBBBBBBBBB(
			AnonymousClassTypeClass _this, IsApplicableMatch isApplicableMatch, TClass tClass, Type mParent,
			ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous,
			TClass tParent, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TypeAccess mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tClass, mParent, mCreation,
				parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass, mParent, mCreation, parentToParent, mAnonymous,
					tParent, eAnonymousClassDeclarationToTClass, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			AnonymousClassTypeClass _this, IsApplicableMatch isApplicableMatch, TClass tClass, Type mParent,
			ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous,
			TClass tParent, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TypeAccess mType) {
		Object[] result_pattern_AnonymousClassTypeClass_2_4_solveCSP_binding = pattern_AnonymousClassTypeClass_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass, mType);
		if (result_pattern_AnonymousClassTypeClass_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassTypeClass_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClassTypeClass_2_4_solveCSP_black = pattern_AnonymousClassTypeClass_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClassTypeClass_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass, mParent, mCreation, parentToParent,
						mAnonymous, tParent, eAnonymousClassDeclarationToTClass, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassTypeClass_2_5_checkCSP_expressionFBB(
			AnonymousClassTypeClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnonymousClassTypeClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClassTypeClass_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_10_1_initialbindings_blackBBBB(
			AnonymousClassTypeClass _this, Match match, TClass tClass, TClass tParent) {
		if (!tClass.equals(tParent)) {
			return new Object[] { _this, match, tClass, tParent };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_10_2_SolveCSP_bindingFBBBB(
			AnonymousClassTypeClass _this, Match match, TClass tClass, TClass tParent) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tClass, tParent);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tClass, tParent };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_10_2_SolveCSP_bindingAndBlackFBBBB(
			AnonymousClassTypeClass _this, Match match, TClass tClass, TClass tParent) {
		Object[] result_pattern_AnonymousClassTypeClass_10_2_SolveCSP_binding = pattern_AnonymousClassTypeClass_10_2_SolveCSP_bindingFBBBB(
				_this, match, tClass, tParent);
		if (result_pattern_AnonymousClassTypeClass_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassTypeClass_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnonymousClassTypeClass_10_2_SolveCSP_black = pattern_AnonymousClassTypeClass_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClassTypeClass_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tClass, tParent };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassTypeClass_10_3_CheckCSP_expressionFBB(
			AnonymousClassTypeClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_10_4_collectelementstobetranslated_blackBBB(
			Match match, TClass tClass, TClass tParent) {
		if (!tClass.equals(tParent)) {
			return new Object[] { match, tClass, tParent };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, TClass tClass, TClass tParent) {
		EMoflonEdge tClass__tParent____parentClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParent__tClass____childClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tClass__tParent____parentClasses_name_prime = "parentClasses";
		String tParent__tClass____childClasses_name_prime = "childClasses";
		tClass__tParent____parentClasses.setSrc(tClass);
		tClass__tParent____parentClasses.setTrg(tParent);
		match.getToBeTranslatedEdges().add(tClass__tParent____parentClasses);
		tParent__tClass____childClasses.setSrc(tParent);
		tParent__tClass____childClasses.setTrg(tClass);
		match.getToBeTranslatedEdges().add(tParent__tClass____childClasses);
		tClass__tParent____parentClasses.setName(tClass__tParent____parentClasses_name_prime);
		tParent__tClass____childClasses.setName(tParent__tClass____childClasses_name_prime);
		return new Object[] { match, tClass, tParent, tClass__tParent____parentClasses,
				tParent__tClass____childClasses };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_10_5_collectcontextelements_blackBBB(Match match,
			TClass tClass, TClass tParent) {
		if (!tClass.equals(tParent)) {
			return new Object[] { match, tClass, tParent };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_10_5_collectcontextelements_greenBBB(Match match,
			TClass tClass, TClass tParent) {
		match.getContextNodes().add(tClass);
		match.getContextNodes().add(tParent);
		return new Object[] { match, tClass, tParent };
	}

	public static final void pattern_AnonymousClassTypeClass_10_6_registerobjectstomatch_expressionBBBB(
			AnonymousClassTypeClass _this, Match match, TClass tClass, TClass tParent) {
		_this.registerObjectsToMatch_BWD(match, tClass, tParent);

	}

	public static final boolean pattern_AnonymousClassTypeClass_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClassTypeClass_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("mParent");
		EObject _localVariable_2 = isApplicableMatch.getObject("mCreation");
		EObject _localVariable_3 = isApplicableMatch.getObject("parentToParent");
		EObject _localVariable_4 = isApplicableMatch.getObject("mAnonymous");
		EObject _localVariable_5 = isApplicableMatch.getObject("tParent");
		EObject _localVariable_6 = isApplicableMatch.getObject("eAnonymousClassDeclarationToTClass");
		EObject tmpTClass = _localVariable_0;
		EObject tmpMParent = _localVariable_1;
		EObject tmpMCreation = _localVariable_2;
		EObject tmpParentToParent = _localVariable_3;
		EObject tmpMAnonymous = _localVariable_4;
		EObject tmpTParent = _localVariable_5;
		EObject tmpEAnonymousClassDeclarationToTClass = _localVariable_6;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpMParent instanceof Type) {
				Type mParent = (Type) tmpMParent;
				if (tmpMCreation instanceof ClassInstanceCreation) {
					ClassInstanceCreation mCreation = (ClassInstanceCreation) tmpMCreation;
					if (tmpParentToParent instanceof TypeToTAbstractType) {
						TypeToTAbstractType parentToParent = (TypeToTAbstractType) tmpParentToParent;
						if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
							AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
							if (tmpTParent instanceof TClass) {
								TClass tParent = (TClass) tmpTParent;
								if (tmpEAnonymousClassDeclarationToTClass instanceof AnonymousClassDeclarationToTClass) {
									AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) tmpEAnonymousClassDeclarationToTClass;
									return new Object[] { tClass, mParent, mCreation, parentToParent, mAnonymous,
											tParent, eAnonymousClassDeclarationToTClass, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_11_1_performtransformation_blackBBBBBBBFBB(
			TClass tClass, Type mParent, ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent,
			AnonymousClassDeclaration mAnonymous, TClass tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, AnonymousClassTypeClass _this,
			IsApplicableMatch isApplicableMatch) {
		if (!tClass.equals(tParent)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
							eAnonymousClassDeclarationToTClass, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			AnonymousClassTypeClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnonymousClassTypeClass_11_1_performtransformation_binding = pattern_AnonymousClassTypeClass_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnonymousClassTypeClass_11_1_performtransformation_binding != null) {
			TClass tClass = (TClass) result_pattern_AnonymousClassTypeClass_11_1_performtransformation_binding[0];
			Type mParent = (Type) result_pattern_AnonymousClassTypeClass_11_1_performtransformation_binding[1];
			ClassInstanceCreation mCreation = (ClassInstanceCreation) result_pattern_AnonymousClassTypeClass_11_1_performtransformation_binding[2];
			TypeToTAbstractType parentToParent = (TypeToTAbstractType) result_pattern_AnonymousClassTypeClass_11_1_performtransformation_binding[3];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_AnonymousClassTypeClass_11_1_performtransformation_binding[4];
			TClass tParent = (TClass) result_pattern_AnonymousClassTypeClass_11_1_performtransformation_binding[5];
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result_pattern_AnonymousClassTypeClass_11_1_performtransformation_binding[6];

			Object[] result_pattern_AnonymousClassTypeClass_11_1_performtransformation_black = pattern_AnonymousClassTypeClass_11_1_performtransformation_blackBBBBBBBFBB(
					tClass, mParent, mCreation, parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass,
					_this, isApplicableMatch);
			if (result_pattern_AnonymousClassTypeClass_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnonymousClassTypeClass_11_1_performtransformation_black[7];

				return new Object[] { tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
						eAnonymousClassDeclarationToTClass, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_11_1_performtransformation_greenBBF(Type mParent,
			ClassInstanceCreation mCreation) {
		TypeAccess mType = JavaFactory.eINSTANCE.createTypeAccess();
		mCreation.setType(mType);
		mType.setType(mParent);
		return new Object[] { mParent, mCreation, mType };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_11_2_collecttranslatedelements_blackB(
			TypeAccess mType) {
		return new Object[] { mType };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_11_2_collecttranslatedelements_greenFB(
			TypeAccess mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mType);
		return new Object[] { ruleresult, mType };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_11_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tClass, EObject mParent, EObject mCreation, EObject parentToParent,
			EObject mAnonymous, EObject tParent, EObject eAnonymousClassDeclarationToTClass, EObject mType) {
		if (!tClass.equals(tParent)) {
			if (!mParent.equals(tClass)) {
				if (!mParent.equals(parentToParent)) {
					if (!mParent.equals(tParent)) {
						if (!mParent.equals(mType)) {
							if (!mCreation.equals(tClass)) {
								if (!mCreation.equals(mParent)) {
									if (!mCreation.equals(parentToParent)) {
										if (!mCreation.equals(tParent)) {
											if (!mCreation.equals(mType)) {
												if (!parentToParent.equals(tClass)) {
													if (!parentToParent.equals(tParent)) {
														if (!mAnonymous.equals(tClass)) {
															if (!mAnonymous.equals(mParent)) {
																if (!mAnonymous.equals(mCreation)) {
																	if (!mAnonymous.equals(parentToParent)) {
																		if (!mAnonymous.equals(tParent)) {
																			if (!mAnonymous.equals(mType)) {
																				if (!eAnonymousClassDeclarationToTClass
																						.equals(tClass)) {
																					if (!eAnonymousClassDeclarationToTClass
																							.equals(mParent)) {
																						if (!eAnonymousClassDeclarationToTClass
																								.equals(mCreation)) {
																							if (!eAnonymousClassDeclarationToTClass
																									.equals(parentToParent)) {
																								if (!eAnonymousClassDeclarationToTClass
																										.equals(mAnonymous)) {
																									if (!eAnonymousClassDeclarationToTClass
																											.equals(tParent)) {
																										if (!eAnonymousClassDeclarationToTClass
																												.equals(mType)) {
																											if (!mType
																													.equals(tClass)) {
																												if (!mType
																														.equals(parentToParent)) {
																													if (!mType
																															.equals(tParent)) {
																														return new Object[] {
																																ruleresult,
																																tClass,
																																mParent,
																																mCreation,
																																parentToParent,
																																mAnonymous,
																																tParent,
																																eAnonymousClassDeclarationToTClass,
																																mType };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnonymousClassTypeClass_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tClass, EObject mParent, EObject mCreation, EObject tParent,
			EObject mType) {
		EMoflonEdge mCreation__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tParent____parentClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParent__tClass____childClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mParent____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParent__mType____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnonymousClassTypeClass";
		String mCreation__mType____type_name_prime = "type";
		String tClass__tParent____parentClasses_name_prime = "parentClasses";
		String tParent__tClass____childClasses_name_prime = "childClasses";
		String mType__mParent____type_name_prime = "type";
		String mParent__mType____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		mCreation__mType____type.setSrc(mCreation);
		mCreation__mType____type.setTrg(mType);
		ruleresult.getCreatedEdges().add(mCreation__mType____type);
		tClass__tParent____parentClasses.setSrc(tClass);
		tClass__tParent____parentClasses.setTrg(tParent);
		ruleresult.getTranslatedEdges().add(tClass__tParent____parentClasses);
		tParent__tClass____childClasses.setSrc(tParent);
		tParent__tClass____childClasses.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(tParent__tClass____childClasses);
		mType__mParent____type.setSrc(mType);
		mType__mParent____type.setTrg(mParent);
		ruleresult.getCreatedEdges().add(mType__mParent____type);
		mParent__mType____usagesInTypeAccess.setSrc(mParent);
		mParent__mType____usagesInTypeAccess.setTrg(mType);
		ruleresult.getCreatedEdges().add(mParent__mType____usagesInTypeAccess);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mCreation__mType____type.setName(mCreation__mType____type_name_prime);
		tClass__tParent____parentClasses.setName(tClass__tParent____parentClasses_name_prime);
		tParent__tClass____childClasses.setName(tParent__tClass____childClasses_name_prime);
		mType__mParent____type.setName(mType__mParent____type_name_prime);
		mParent__mType____usagesInTypeAccess.setName(mParent__mType____usagesInTypeAccess_name_prime);
		return new Object[] { ruleresult, tClass, mParent, mCreation, tParent, mType, mCreation__mType____type,
				tClass__tParent____parentClasses, tParent__tClass____childClasses, mType__mParent____type,
				mParent__mType____usagesInTypeAccess };
	}

	public static final void pattern_AnonymousClassTypeClass_11_5_registerobjects_expressionBBBBBBBBBB(
			AnonymousClassTypeClass _this, PerformRuleResult ruleresult, EObject tClass, EObject mParent,
			EObject mCreation, EObject parentToParent, EObject mAnonymous, EObject tParent,
			EObject eAnonymousClassDeclarationToTClass, EObject mType) {
		_this.registerObjects_BWD(ruleresult, tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass, mType);

	}

	public static final PerformRuleResult pattern_AnonymousClassTypeClass_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_12_1_preparereturnvalue_bindingFB(
			AnonymousClassTypeClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnonymousClassTypeClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnonymousClassTypeClass _this) {
		Object[] result_pattern_AnonymousClassTypeClass_12_1_preparereturnvalue_binding = pattern_AnonymousClassTypeClass_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClassTypeClass_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnonymousClassTypeClass_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClassTypeClass_12_1_preparereturnvalue_black = pattern_AnonymousClassTypeClass_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnonymousClassTypeClass_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnonymousClassTypeClass_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnonymousClassTypeClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tClass");
		EObject _localVariable_1 = match.getObject("tParent");
		EObject tmpTClass = _localVariable_0;
		EObject tmpTParent = _localVariable_1;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpTParent instanceof TClass) {
				TClass tParent = (TClass) tmpTParent;
				return new Object[] { tClass, tParent, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassTypeClass_12_2_corematch_blackBFFFBFB(TClass tClass,
			TClass tParent, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tClass.equals(tParent)) {
			for (TypeToTAbstractType parentToParent : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tParent, TypeToTAbstractType.class, "target")) {
				Type mParent = parentToParent.getSource();
				if (mParent != null) {
					for (AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tClass, AnonymousClassDeclarationToTClass.class, "target")) {
						AnonymousClassDeclaration mAnonymous = eAnonymousClassDeclarationToTClass.getSource();
						if (mAnonymous != null) {
							_result.add(new Object[] { tClass, mParent, parentToParent, mAnonymous, tParent,
									eAnonymousClassDeclarationToTClass, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassTypeClass_12_3_findcontext_blackBBFBBBB(TClass tClass,
			Type mParent, TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous, TClass tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tClass.equals(tParent)) {
			if (tParent.equals(parentToParent.getTarget())) {
				if (tClass.equals(eAnonymousClassDeclarationToTClass.getTarget())) {
					if (tClass.getParentClasses().contains(tParent)) {
						if (mAnonymous.equals(eAnonymousClassDeclarationToTClass.getSource())) {
							if (mParent.equals(parentToParent.getSource())) {
								ClassInstanceCreation mCreation = mAnonymous.getClassInstanceCreation();
								if (mCreation != null) {
									_result.add(new Object[] { tClass, mParent, mCreation, parentToParent, mAnonymous,
											tParent, eAnonymousClassDeclarationToTClass });
								}

							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_12_3_findcontext_greenBBBBBBBFFFFFFFFF(TClass tClass,
			Type mParent, ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent,
			AnonymousClassDeclaration mAnonymous, TClass tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge parentToParent__tParent____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mCreation____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tParent____parentClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParent__tClass____childClasses = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge parentToParent__mParent____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String parentToParent__tParent____target_name_prime = "target";
		String eAnonymousClassDeclarationToTClass__tClass____target_name_prime = "target";
		String mAnonymous__mCreation____classInstanceCreation_name_prime = "classInstanceCreation";
		String mCreation__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String tClass__tParent____parentClasses_name_prime = "parentClasses";
		String tParent__tClass____childClasses_name_prime = "childClasses";
		String eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime = "source";
		String parentToParent__mParent____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(mParent);
		isApplicableMatch.getAllContextElements().add(mCreation);
		isApplicableMatch.getAllContextElements().add(parentToParent);
		isApplicableMatch.getAllContextElements().add(mAnonymous);
		isApplicableMatch.getAllContextElements().add(tParent);
		isApplicableMatch.getAllContextElements().add(eAnonymousClassDeclarationToTClass);
		parentToParent__tParent____target.setSrc(parentToParent);
		parentToParent__tParent____target.setTrg(tParent);
		isApplicableMatch.getAllContextElements().add(parentToParent__tParent____target);
		eAnonymousClassDeclarationToTClass__tClass____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(eAnonymousClassDeclarationToTClass__tClass____target);
		mAnonymous__mCreation____classInstanceCreation.setSrc(mAnonymous);
		mAnonymous__mCreation____classInstanceCreation.setTrg(mCreation);
		isApplicableMatch.getAllContextElements().add(mAnonymous__mCreation____classInstanceCreation);
		mCreation__mAnonymous____anonymousClassDeclaration.setSrc(mCreation);
		mCreation__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mCreation__mAnonymous____anonymousClassDeclaration);
		tClass__tParent____parentClasses.setSrc(tClass);
		tClass__tParent____parentClasses.setTrg(tParent);
		isApplicableMatch.getAllContextElements().add(tClass__tParent____parentClasses);
		tParent__tClass____childClasses.setSrc(tParent);
		tParent__tClass____childClasses.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(tParent__tClass____childClasses);
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(eAnonymousClassDeclarationToTClass__mAnonymous____source);
		parentToParent__mParent____source.setSrc(parentToParent);
		parentToParent__mParent____source.setTrg(mParent);
		isApplicableMatch.getAllContextElements().add(parentToParent__mParent____source);
		parentToParent__tParent____target.setName(parentToParent__tParent____target_name_prime);
		eAnonymousClassDeclarationToTClass__tClass____target
				.setName(eAnonymousClassDeclarationToTClass__tClass____target_name_prime);
		mAnonymous__mCreation____classInstanceCreation
				.setName(mAnonymous__mCreation____classInstanceCreation_name_prime);
		mCreation__mAnonymous____anonymousClassDeclaration
				.setName(mCreation__mAnonymous____anonymousClassDeclaration_name_prime);
		tClass__tParent____parentClasses.setName(tClass__tParent____parentClasses_name_prime);
		tParent__tClass____childClasses.setName(tParent__tClass____childClasses_name_prime);
		eAnonymousClassDeclarationToTClass__mAnonymous____source
				.setName(eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime);
		parentToParent__mParent____source.setName(parentToParent__mParent____source_name_prime);
		return new Object[] { tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass, isApplicableMatch, parentToParent__tParent____target,
				eAnonymousClassDeclarationToTClass__tClass____target, mAnonymous__mCreation____classInstanceCreation,
				mCreation__mAnonymous____anonymousClassDeclaration, tClass__tParent____parentClasses,
				tParent__tClass____childClasses, eAnonymousClassDeclarationToTClass__mAnonymous____source,
				parentToParent__mParent____source };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_12_4_solveCSP_bindingFBBBBBBBBB(
			AnonymousClassTypeClass _this, IsApplicableMatch isApplicableMatch, TClass tClass, Type mParent,
			ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous,
			TClass tParent, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tClass, mParent, mCreation,
				parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass, mParent, mCreation, parentToParent, mAnonymous,
					tParent, eAnonymousClassDeclarationToTClass };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			AnonymousClassTypeClass _this, IsApplicableMatch isApplicableMatch, TClass tClass, Type mParent,
			ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous,
			TClass tParent, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {
		Object[] result_pattern_AnonymousClassTypeClass_12_4_solveCSP_binding = pattern_AnonymousClassTypeClass_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass);
		if (result_pattern_AnonymousClassTypeClass_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassTypeClass_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClassTypeClass_12_4_solveCSP_black = pattern_AnonymousClassTypeClass_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClassTypeClass_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass, mParent, mCreation, parentToParent,
						mAnonymous, tParent, eAnonymousClassDeclarationToTClass };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassTypeClass_12_5_checkCSP_expressionFBB(
			AnonymousClassTypeClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnonymousClassTypeClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClassTypeClass_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_20_1_preparereturnvalue_bindingFB(
			AnonymousClassTypeClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnonymousClassTypeClass _this) {
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

	public static final Object[] pattern_AnonymousClassTypeClass_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnonymousClassTypeClass _this) {
		Object[] result_pattern_AnonymousClassTypeClass_20_1_preparereturnvalue_binding = pattern_AnonymousClassTypeClass_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClassTypeClass_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnonymousClassTypeClass_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClassTypeClass_20_1_preparereturnvalue_black = pattern_AnonymousClassTypeClass_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnonymousClassTypeClass_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnonymousClassTypeClass_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnonymousClassTypeClass_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnonymousClassTypeClass_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_parentClasses) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTClass = _edge_parentClasses.getSrc();
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			EObject tmpTParent = _edge_parentClasses.getTrg();
			if (tmpTParent instanceof TClass) {
				TClass tParent = (TClass) tmpTParent;
				if (!tClass.equals(tParent)) {
					if (tClass.getParentClasses().contains(tParent)) {
						_result.add(new Object[] { tClass, tParent, _edge_parentClasses });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnonymousClassTypeClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			AnonymousClassTypeClass _this, Match match, TClass tClass, TClass tParent) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tClass, tParent);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnonymousClassTypeClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnonymousClassTypeClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnonymousClassTypeClass_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_21_1_preparereturnvalue_bindingFB(
			AnonymousClassTypeClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnonymousClassTypeClass _this) {
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

	public static final Object[] pattern_AnonymousClassTypeClass_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnonymousClassTypeClass _this) {
		Object[] result_pattern_AnonymousClassTypeClass_21_1_preparereturnvalue_binding = pattern_AnonymousClassTypeClass_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClassTypeClass_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnonymousClassTypeClass_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClassTypeClass_21_1_preparereturnvalue_black = pattern_AnonymousClassTypeClass_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnonymousClassTypeClass_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnonymousClassTypeClass_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnonymousClassTypeClass_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_0BB(
			TypeAccess mType, Type mParent) {
		for (AbstractTypeDeclaration __DEC_mType_superInterfaces_966538 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mParent.equals(__DEC_mType_superInterfaces_966538)) {
				return new Object[] { mType, mParent };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess mType) {
		for (Annotation __DEC_mType_type_510143 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, Annotation.class, "type")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_2B(
			TypeAccess mType) {
		for (AnnotationTypeMemberDeclaration __DEC_mType_type_531697 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_3BB(
			TypeAccess mType, Type mParent) {
		for (ArrayType __DEC_mType_elementType_95734 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, ArrayType.class, "elementType")) {
			if (!mParent.equals(__DEC_mType_elementType_95734)) {
				return new Object[] { mType, mParent };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_4BB(
			TypeAccess mType, Type mParent) {
		for (ClassDeclaration __DEC_mType_superClass_845308 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, ClassDeclaration.class, "superClass")) {
			if (!mParent.equals(__DEC_mType_superClass_845308)) {
				return new Object[] { mType, mParent };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess mType) {
		for (MethodDeclaration __DEC_mType_returnType_619344 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, MethodDeclaration.class, "returnType")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_6BB(
			TypeAccess mType, Type mParent) {
		for (ParameterizedType __DEC_mType_type_750060 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, ParameterizedType.class, "type")) {
			if (!mParent.equals(__DEC_mType_type_750060)) {
				return new Object[] { mType, mParent };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess mType) {
		for (TypeLiteral __DEC_mType_type_253251 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, TypeLiteral.class, "type")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_8B(
			TypeAccess mType) {
		for (AnnotationMemberValuePair __DEC_mType_value_870513 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMCreation = _edge_type.getSrc();
		if (tmpMCreation instanceof ClassInstanceCreation) {
			ClassInstanceCreation mCreation = (ClassInstanceCreation) tmpMCreation;
			EObject tmpMType = _edge_type.getTrg();
			if (tmpMType instanceof TypeAccess) {
				TypeAccess mType = (TypeAccess) tmpMType;
				if (mType.equals(mCreation.getType())) {
					AnonymousClassDeclaration mAnonymous = mCreation.getAnonymousClassDeclaration();
					if (mAnonymous != null) {
						Type mParent = mType.getType();
						if (mParent != null) {
							if (pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_1B(mType) == null) {
								if (pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_2B(
										mType) == null) {
									if (pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_5B(
											mType) == null) {
										if (pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_7B(
												mType) == null) {
											if (pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_8B(
													mType) == null) {
												if (pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_0BB(
														mType, mParent) == null) {
													if (pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_3BB(
															mType, mParent) == null) {
														if (pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_4BB(
																mType, mParent) == null) {
															if (pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_black_nac_6BB(
																	mType, mParent) == null) {
																_result.add(new Object[] { mParent, mCreation,
																		mAnonymous, mType, _edge_type });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnonymousClassTypeClass_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnonymousClassTypeClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			AnonymousClassTypeClass _this, Match match, Type mParent, ClassInstanceCreation mCreation,
			AnonymousClassDeclaration mAnonymous, TypeAccess mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mParent, mCreation, mAnonymous, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnonymousClassTypeClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnonymousClassTypeClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnonymousClassTypeClass_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_24_1_prepare_blackB(AnonymousClassTypeClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tClass");
		EObject _localVariable_1 = sourceMatch.getObject("mParent");
		EObject _localVariable_2 = sourceMatch.getObject("mCreation");
		EObject _localVariable_3 = sourceMatch.getObject("mAnonymous");
		EObject _localVariable_4 = targetMatch.getObject("tParent");
		EObject _localVariable_5 = sourceMatch.getObject("mType");
		EObject tmpTClass = _localVariable_0;
		EObject tmpMParent = _localVariable_1;
		EObject tmpMCreation = _localVariable_2;
		EObject tmpMAnonymous = _localVariable_3;
		EObject tmpTParent = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpMParent instanceof Type) {
				Type mParent = (Type) tmpMParent;
				if (tmpMCreation instanceof ClassInstanceCreation) {
					ClassInstanceCreation mCreation = (ClassInstanceCreation) tmpMCreation;
					if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
						AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
						if (tmpTParent instanceof TClass) {
							TClass tParent = (TClass) tmpTParent;
							if (tmpMType instanceof TypeAccess) {
								TypeAccess mType = (TypeAccess) tmpMType;
								return new Object[] { tClass, mParent, mCreation, mAnonymous, tParent, mType,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_24_2_matchsrctrgcontext_blackBBBBBBBB(TClass tClass,
			Type mParent, ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous, TClass tParent,
			TypeAccess mType, Match sourceMatch, Match targetMatch) {
		if (!tClass.equals(tParent)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { tClass, mParent, mCreation, mAnonymous, tParent, mType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnonymousClassTypeClass_24_2_matchsrctrgcontext_binding = pattern_AnonymousClassTypeClass_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_AnonymousClassTypeClass_24_2_matchsrctrgcontext_binding != null) {
			TClass tClass = (TClass) result_pattern_AnonymousClassTypeClass_24_2_matchsrctrgcontext_binding[0];
			Type mParent = (Type) result_pattern_AnonymousClassTypeClass_24_2_matchsrctrgcontext_binding[1];
			ClassInstanceCreation mCreation = (ClassInstanceCreation) result_pattern_AnonymousClassTypeClass_24_2_matchsrctrgcontext_binding[2];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_AnonymousClassTypeClass_24_2_matchsrctrgcontext_binding[3];
			TClass tParent = (TClass) result_pattern_AnonymousClassTypeClass_24_2_matchsrctrgcontext_binding[4];
			TypeAccess mType = (TypeAccess) result_pattern_AnonymousClassTypeClass_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_AnonymousClassTypeClass_24_2_matchsrctrgcontext_black = pattern_AnonymousClassTypeClass_24_2_matchsrctrgcontext_blackBBBBBBBB(
					tClass, mParent, mCreation, mAnonymous, tParent, mType, sourceMatch, targetMatch);
			if (result_pattern_AnonymousClassTypeClass_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tClass, mParent, mCreation, mAnonymous, tParent, mType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_24_3_solvecsp_bindingFBBBBBBBBB(
			AnonymousClassTypeClass _this, TClass tClass, Type mParent, ClassInstanceCreation mCreation,
			AnonymousClassDeclaration mAnonymous, TClass tParent, TypeAccess mType, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tClass, mParent, mCreation, mAnonymous, tParent, mType,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tClass, mParent, mCreation, mAnonymous, tParent, mType, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			AnonymousClassTypeClass _this, TClass tClass, Type mParent, ClassInstanceCreation mCreation,
			AnonymousClassDeclaration mAnonymous, TClass tParent, TypeAccess mType, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_AnonymousClassTypeClass_24_3_solvecsp_binding = pattern_AnonymousClassTypeClass_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, tClass, mParent, mCreation, mAnonymous, tParent, mType, sourceMatch, targetMatch);
		if (result_pattern_AnonymousClassTypeClass_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassTypeClass_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnonymousClassTypeClass_24_3_solvecsp_black = pattern_AnonymousClassTypeClass_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnonymousClassTypeClass_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tClass, mParent, mCreation, mAnonymous, tParent, mType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassTypeClass_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassTypeClass_24_5_matchcorrcontext_blackBBFBBFBB(
			TClass tClass, Type mParent, AnonymousClassDeclaration mAnonymous, TClass tParent, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tClass.equals(tParent)) {
			if (!sourceMatch.equals(targetMatch)) {
				for (TypeToTAbstractType parentToParent : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tParent, TypeToTAbstractType.class, "target")) {
					if (mParent.equals(parentToParent.getSource())) {
						for (AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tClass, AnonymousClassDeclarationToTClass.class, "target")) {
							if (mAnonymous.equals(eAnonymousClassDeclarationToTClass.getSource())) {
								_result.add(new Object[] { tClass, mParent, parentToParent, mAnonymous, tParent,
										eAnonymousClassDeclarationToTClass, sourceMatch, targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType parentToParent, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnonymousClassTypeClass";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(parentToParent);
		ccMatch.getAllContextElements().add(eAnonymousClassDeclarationToTClass);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { parentToParent, eAnonymousClassDeclarationToTClass, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_24_6_createcorrespondence_blackBBBBBBB(TClass tClass,
			Type mParent, ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous, TClass tParent,
			TypeAccess mType, CCMatch ccMatch) {
		if (!tClass.equals(tParent)) {
			return new Object[] { tClass, mParent, mCreation, mAnonymous, tParent, mType, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnonymousClassTypeClass";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClassTypeClass_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_0BB(TypeAccess mType,
			Type mParent) {
		for (AbstractTypeDeclaration __DEC_mType_superInterfaces_670360 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mParent.equals(__DEC_mType_superInterfaces_670360)) {
				return new Object[] { mType, mParent };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_1B(TypeAccess mType) {
		for (Annotation __DEC_mType_type_459248 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, Annotation.class, "type")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_2B(TypeAccess mType) {
		for (AnnotationTypeMemberDeclaration __DEC_mType_type_356062 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_3BB(TypeAccess mType,
			Type mParent) {
		for (ArrayType __DEC_mType_elementType_124812 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, ArrayType.class, "elementType")) {
			if (!mParent.equals(__DEC_mType_elementType_124812)) {
				return new Object[] { mType, mParent };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_4BB(TypeAccess mType,
			Type mParent) {
		for (ClassDeclaration __DEC_mType_superClass_341754 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, ClassDeclaration.class, "superClass")) {
			if (!mParent.equals(__DEC_mType_superClass_341754)) {
				return new Object[] { mType, mParent };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_5B(TypeAccess mType) {
		for (MethodDeclaration __DEC_mType_returnType_707804 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, MethodDeclaration.class, "returnType")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_6BB(TypeAccess mType,
			Type mParent) {
		for (ParameterizedType __DEC_mType_type_668551 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, ParameterizedType.class, "type")) {
			if (!mParent.equals(__DEC_mType_type_668551)) {
				return new Object[] { mType, mParent };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_7B(TypeAccess mType) {
		for (TypeLiteral __DEC_mType_type_400910 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, TypeLiteral.class, "type")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_8B(TypeAccess mType) {
		for (AnnotationMemberValuePair __DEC_mType_value_843030 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_27_1_matchtggpattern_blackBBBB(Type mParent,
			ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous, TypeAccess mType) {
		if (mType.equals(mCreation.getType())) {
			if (mCreation.equals(mAnonymous.getClassInstanceCreation())) {
				if (mParent.equals(mType.getType())) {
					if (pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_0BB(mType, mParent) == null) {
						if (pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_1B(mType) == null) {
							if (pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_2B(mType) == null) {
								if (pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_3BB(mType,
										mParent) == null) {
									if (pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_4BB(mType,
											mParent) == null) {
										if (pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_5B(
												mType) == null) {
											if (pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_6BB(
													mType, mParent) == null) {
												if (pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_7B(
														mType) == null) {
													if (pattern_AnonymousClassTypeClass_27_1_matchtggpattern_black_nac_8B(
															mType) == null) {
														return new Object[] { mParent, mCreation, mAnonymous, mType };
													}
												}
											}
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

	public static final boolean pattern_AnonymousClassTypeClass_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClassTypeClass_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_28_1_matchtggpattern_blackBB(TClass tClass,
			TClass tParent) {
		if (!tClass.equals(tParent)) {
			if (tClass.getParentClasses().contains(tParent)) {
				return new Object[] { tClass, tParent };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassTypeClass_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClassTypeClass_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_29_1_createresult_blackB(
			AnonymousClassTypeClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TClass tClass) {
		if (ruleResult.getTargetObjects().contains(tClass)) {
			return new Object[] { ruleResult, tClass };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {
		if (ruleResult.getCorrObjects().contains(eAnonymousClassDeclarationToTClass)) {
			return new Object[] { ruleResult, eAnonymousClassDeclarationToTClass };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclaration mAnonymous) {
		if (ruleResult.getSourceObjects().contains(mAnonymous)) {
			return new Object[] { ruleResult, mAnonymous };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ClassInstanceCreation mCreation) {
		if (ruleResult.getSourceObjects().contains(mCreation)) {
			return new Object[] { ruleResult, mCreation };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Type mParent) {
		if (ruleResult.getSourceObjects().contains(mParent)) {
			return new Object[] { ruleResult, mParent };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType parentToParent) {
		if (ruleResult.getCorrObjects().contains(parentToParent)) {
			return new Object[] { ruleResult, parentToParent };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, TClass tParent) {
		if (ruleResult.getTargetObjects().contains(tParent)) {
			return new Object[] { ruleResult, tParent };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassTypeClass_29_2_isapplicablecore_blackFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eAnonymousClassDeclarationToTClassList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList parentToParentList : ruleEntryContainer.getRuleEntryList()) {
				if (!eAnonymousClassDeclarationToTClassList.equals(parentToParentList)) {
					for (EObject tmpEAnonymousClassDeclarationToTClass : eAnonymousClassDeclarationToTClassList
							.getEntryObjects()) {
						if (tmpEAnonymousClassDeclarationToTClass instanceof AnonymousClassDeclarationToTClass) {
							AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) tmpEAnonymousClassDeclarationToTClass;
							TClass tClass = eAnonymousClassDeclarationToTClass.getTarget();
							if (tClass != null) {
								AnonymousClassDeclaration mAnonymous = eAnonymousClassDeclarationToTClass.getSource();
								if (mAnonymous != null) {
									ClassInstanceCreation mCreation = mAnonymous.getClassInstanceCreation();
									if (mCreation != null) {
										if (pattern_AnonymousClassTypeClass_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, eAnonymousClassDeclarationToTClass) == null) {
											if (pattern_AnonymousClassTypeClass_29_2_isapplicablecore_black_nac_0BB(
													ruleResult, tClass) == null) {
												if (pattern_AnonymousClassTypeClass_29_2_isapplicablecore_black_nac_2BB(
														ruleResult, mAnonymous) == null) {
													if (pattern_AnonymousClassTypeClass_29_2_isapplicablecore_black_nac_3BB(
															ruleResult, mCreation) == null) {
														for (EObject tmpParentToParent : parentToParentList
																.getEntryObjects()) {
															if (tmpParentToParent instanceof TypeToTAbstractType) {
																TypeToTAbstractType parentToParent = (TypeToTAbstractType) tmpParentToParent;
																Type mParent = parentToParent.getSource();
																if (mParent != null) {
																	TAbstractType tmpTParent = parentToParent
																			.getTarget();
																	if (tmpTParent instanceof TClass) {
																		TClass tParent = (TClass) tmpTParent;
																		if (!tClass.equals(tParent)) {
																			if (pattern_AnonymousClassTypeClass_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult,
																					parentToParent) == null) {
																				if (pattern_AnonymousClassTypeClass_29_2_isapplicablecore_black_nac_4BB(
																						ruleResult, mParent) == null) {
																					if (pattern_AnonymousClassTypeClass_29_2_isapplicablecore_black_nac_6BB(
																							ruleResult,
																							tParent) == null) {
																						_result.add(new Object[] {
																								eAnonymousClassDeclarationToTClassList,
																								tClass,
																								eAnonymousClassDeclarationToTClass,
																								mAnonymous, mCreation,
																								parentToParentList,
																								mParent, parentToParent,
																								tParent,
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

	public static final Object[] pattern_AnonymousClassTypeClass_29_3_solveCSP_bindingFBBBBBBBBBB(
			AnonymousClassTypeClass _this, IsApplicableMatch isApplicableMatch, TClass tClass, Type mParent,
			ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous,
			TClass tParent, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tClass, mParent, mCreation,
				parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass, mParent, mCreation, parentToParent, mAnonymous,
					tParent, eAnonymousClassDeclarationToTClass, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassTypeClass_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			AnonymousClassTypeClass _this, IsApplicableMatch isApplicableMatch, TClass tClass, Type mParent,
			ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous,
			TClass tParent, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnonymousClassTypeClass_29_3_solveCSP_binding = pattern_AnonymousClassTypeClass_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass, ruleResult);
		if (result_pattern_AnonymousClassTypeClass_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassTypeClass_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClassTypeClass_29_3_solveCSP_black = pattern_AnonymousClassTypeClass_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClassTypeClass_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass, mParent, mCreation, parentToParent,
						mAnonymous, tParent, eAnonymousClassDeclarationToTClass, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassTypeClass_29_4_checkCSP_expressionFBB(
			AnonymousClassTypeClass _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_29_5_checknacs_blackBBBBBBB(TClass tClass,
			Type mParent, ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent,
			AnonymousClassDeclaration mAnonymous, TClass tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {
		if (!tClass.equals(tParent)) {
			return new Object[] { tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
					eAnonymousClassDeclarationToTClass };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_29_6_perform_blackBBBBBBBB(TClass tClass, Type mParent,
			ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous,
			TClass tParent, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			ModelgeneratorRuleResult ruleResult) {
		if (!tClass.equals(tParent)) {
			return new Object[] { tClass, mParent, mCreation, parentToParent, mAnonymous, tParent,
					eAnonymousClassDeclarationToTClass, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeClass_29_6_perform_greenBBBBFB(TClass tClass, Type mParent,
			ClassInstanceCreation mCreation, TClass tParent, ModelgeneratorRuleResult ruleResult) {
		TypeAccess mType = JavaFactory.eINSTANCE.createTypeAccess();
		tClass.getParentClasses().add(tParent);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		mCreation.setType(mType);
		mType.setType(mParent);
		ruleResult.getSourceObjects().add(mType);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tClass, mParent, mCreation, tParent, mType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_AnonymousClassTypeClass_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnonymousClassTypeClassImpl
