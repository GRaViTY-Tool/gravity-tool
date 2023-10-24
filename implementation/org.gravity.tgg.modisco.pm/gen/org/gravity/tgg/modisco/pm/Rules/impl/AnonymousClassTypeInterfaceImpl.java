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
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.AnonymousClassDeclarationToTClass;

import org.gravity.tgg.modisco.pm.Rules.AnonymousClassTypeInterface;
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
 * An implementation of the model object '<em><b>Anonymous Class Type Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnonymousClassTypeInterfaceImpl extends AbstractRuleImpl implements AnonymousClassTypeInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousClassTypeInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnonymousClassTypeInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, InterfaceDeclaration mParent, ClassInstanceCreation mCreation,
			AnonymousClassDeclaration mAnonymous, TypeAccess mType) {

		Object[] result1_black = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_0_1_initialbindings_blackBBBBBB(this, match, mParent, mCreation,
						mAnonymous, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mParent] = " + mParent + ", " + "[mCreation] = " + mCreation
					+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, mParent,
						mCreation, mAnonymous, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mParent] = " + mParent + ", " + "[mCreation] = " + mCreation
					+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnonymousClassTypeInterfaceImpl
					.pattern_AnonymousClassTypeInterface_0_4_collectelementstobetranslated_blackBBBBB(match, mParent,
							mCreation, mAnonymous, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mParent] = " + mParent + ", " + "[mCreation] = " + mCreation + ", " + "[mAnonymous] = "
						+ mAnonymous + ", " + "[mType] = " + mType + ".");
			}
			AnonymousClassTypeInterfaceImpl
					.pattern_AnonymousClassTypeInterface_0_4_collectelementstobetranslated_greenBBBBFFF(match, mParent,
							mCreation, mType);
			//nothing EMoflonEdge mCreation__mType____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mType__mParent____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge mParent__mType____usagesInTypeAccess = (EMoflonEdge) result4_green[6];

			Object[] result5_black = AnonymousClassTypeInterfaceImpl
					.pattern_AnonymousClassTypeInterface_0_5_collectcontextelements_blackBBBBB(match, mParent,
							mCreation, mAnonymous, mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mParent] = " + mParent + ", " + "[mCreation] = " + mCreation + ", " + "[mAnonymous] = "
						+ mAnonymous + ", " + "[mType] = " + mType + ".");
			}
			AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_0_5_collectcontextelements_greenBBBBFF(
					match, mParent, mCreation, mAnonymous);
			//nothing EMoflonEdge mAnonymous__mCreation____classInstanceCreation = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result5_green[5];

			// 
			AnonymousClassTypeInterfaceImpl
					.pattern_AnonymousClassTypeInterface_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
							mParent, mCreation, mAnonymous, mType);
			return AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_0_7_expressionF();
		} else {
			return AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		InterfaceDeclaration mParent = (InterfaceDeclaration) result1_bindingAndBlack[0];
		TClass tClass = (TClass) result1_bindingAndBlack[1];
		ClassInstanceCreation mCreation = (ClassInstanceCreation) result1_bindingAndBlack[2];
		TypeToTAbstractType parentToParent = (TypeToTAbstractType) result1_bindingAndBlack[3];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result1_bindingAndBlack[4];
		TInterface tParent = (TInterface) result1_bindingAndBlack[5];
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result1_bindingAndBlack[6];
		TypeAccess mType = (TypeAccess) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_1_1_performtransformation_greenBB(tClass,
				tParent);

		Object[] result2_black = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_1_2_collecttranslatedelements_blackB(mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mType] = " + mType + ".");
		}
		Object[] result2_green = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_1_2_collecttranslatedelements_greenFB(mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_1_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult, mParent, tClass,
						mCreation, parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mParent] = " + mParent + ", " + "[tClass] = " + tClass + ", " + "[mCreation] = "
					+ mCreation + ", " + "[parentToParent] = " + parentToParent + ", " + "[mAnonymous] = " + mAnonymous
					+ ", " + "[tParent] = " + tParent + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ", " + "[mType] = " + mType + ".");
		}
		AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, mParent, tClass, mCreation, tParent, mType);
		//nothing EMoflonEdge mCreation__mType____type = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mType__mParent____type = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mParent__mType____usagesInTypeAccess = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tClass__tParent____implements = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tParent__tClass____implementedBy = (EMoflonEdge) result3_green[10];

		// 
		// 
		AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_1_5_registerobjects_expressionBBBBBBBBBB(
				this, ruleresult, mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass, mType);
		return AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		InterfaceDeclaration mParent = (InterfaceDeclaration) result2_binding[0];
		ClassInstanceCreation mCreation = (ClassInstanceCreation) result2_binding[1];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_binding[2];
		TypeAccess mType = (TypeAccess) result2_binding[3];
		for (Object[] result2_black : AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_2_2_corematch_blackBFBFBFFBB(mParent, mCreation, mAnonymous, mType,
						match)) {
			TClass tClass = (TClass) result2_black[1];
			TypeToTAbstractType parentToParent = (TypeToTAbstractType) result2_black[3];
			TInterface tParent = (TInterface) result2_black[5];
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result2_black[6];
			// ForEach 
			for (Object[] result3_black : AnonymousClassTypeInterfaceImpl
					.pattern_AnonymousClassTypeInterface_2_3_findcontext_blackBBBBBBBB(mParent, tClass, mCreation,
							parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass, mType)) {
				Object[] result3_green = AnonymousClassTypeInterfaceImpl
						.pattern_AnonymousClassTypeInterface_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(mParent, tClass,
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

				Object[] result4_bindingAndBlack = AnonymousClassTypeInterfaceImpl
						.pattern_AnonymousClassTypeInterface_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
								eAnonymousClassDeclarationToTClass, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mParent] = " + mParent + ", "
							+ "[tClass] = " + tClass + ", " + "[mCreation] = " + mCreation + ", "
							+ "[parentToParent] = " + parentToParent + ", " + "[mAnonymous] = " + mAnonymous + ", "
							+ "[tParent] = " + tParent + ", " + "[eAnonymousClassDeclarationToTClass] = "
							+ eAnonymousClassDeclarationToTClass + ", " + "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = AnonymousClassTypeInterfaceImpl
							.pattern_AnonymousClassTypeInterface_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnonymousClassTypeInterfaceImpl
							.pattern_AnonymousClassTypeInterface_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, InterfaceDeclaration mParent, ClassInstanceCreation mCreation,
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
	public CSP isAppropriate_solveCsp_FWD(Match match, InterfaceDeclaration mParent, ClassInstanceCreation mCreation,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, InterfaceDeclaration mParent,
			TClass tClass, ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent,
			AnonymousClassDeclaration mAnonymous, TInterface tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TypeAccess mType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mParent", mParent);
		isApplicableMatch.registerObject("tClass", tClass);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mParent, EObject tClass, EObject mCreation,
			EObject parentToParent, EObject mAnonymous, EObject tParent, EObject eAnonymousClassDeclarationToTClass,
			EObject mType) {
		ruleresult.registerObject("mParent", mParent);
		ruleresult.registerObject("tClass", tClass);
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
	public boolean isAppropriate_BWD(Match match, TClass tClass, TInterface tParent) {

		Object[] result1_black = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_10_1_initialbindings_blackBBBB(this, match, tClass, tParent);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tClass] = " + tClass + ", " + "[tParent] = " + tParent + ".");
		}

		Object[] result2_bindingAndBlack = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tClass, tParent);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tClass] = " + tClass + ", " + "[tParent] = " + tParent + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = AnonymousClassTypeInterfaceImpl
					.pattern_AnonymousClassTypeInterface_10_4_collectelementstobetranslated_blackBBB(match, tClass,
							tParent);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[tParent] = " + tParent + ".");
			}
			AnonymousClassTypeInterfaceImpl
					.pattern_AnonymousClassTypeInterface_10_4_collectelementstobetranslated_greenBBBFF(match, tClass,
							tParent);
			//nothing EMoflonEdge tClass__tParent____implements = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tParent__tClass____implementedBy = (EMoflonEdge) result4_green[4];

			Object[] result5_black = AnonymousClassTypeInterfaceImpl
					.pattern_AnonymousClassTypeInterface_10_5_collectcontextelements_blackBBB(match, tClass, tParent);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[tParent] = " + tParent + ".");
			}
			AnonymousClassTypeInterfaceImpl
					.pattern_AnonymousClassTypeInterface_10_5_collectcontextelements_greenBBB(match, tClass, tParent);

			// 
			AnonymousClassTypeInterfaceImpl
					.pattern_AnonymousClassTypeInterface_10_6_registerobjectstomatch_expressionBBBB(this, match, tClass,
							tParent);
			return AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_10_7_expressionF();
		} else {
			return AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		InterfaceDeclaration mParent = (InterfaceDeclaration) result1_bindingAndBlack[0];
		TClass tClass = (TClass) result1_bindingAndBlack[1];
		ClassInstanceCreation mCreation = (ClassInstanceCreation) result1_bindingAndBlack[2];
		TypeToTAbstractType parentToParent = (TypeToTAbstractType) result1_bindingAndBlack[3];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result1_bindingAndBlack[4];
		TInterface tParent = (TInterface) result1_bindingAndBlack[5];
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_11_1_performtransformation_greenBBF(mParent, mCreation);
		TypeAccess mType = (TypeAccess) result1_green[2];

		Object[] result2_black = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_11_2_collecttranslatedelements_blackB(mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mType] = " + mType + ".");
		}
		Object[] result2_green = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_11_2_collecttranslatedelements_greenFB(mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_11_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult, mParent,
						tClass, mCreation, parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass,
						mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mParent] = " + mParent + ", " + "[tClass] = " + tClass + ", " + "[mCreation] = "
					+ mCreation + ", " + "[parentToParent] = " + parentToParent + ", " + "[mAnonymous] = " + mAnonymous
					+ ", " + "[tParent] = " + tParent + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ", " + "[mType] = " + mType + ".");
		}
		AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, mParent, tClass, mCreation, tParent, mType);
		//nothing EMoflonEdge mCreation__mType____type = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mType__mParent____type = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mParent__mType____usagesInTypeAccess = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tClass__tParent____implements = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tParent__tClass____implementedBy = (EMoflonEdge) result3_green[10];

		// 
		// 
		AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_11_5_registerobjects_expressionBBBBBBBBBB(
				this, ruleresult, mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass, mType);
		return AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tClass = (TClass) result2_binding[0];
		TInterface tParent = (TInterface) result2_binding[1];
		for (Object[] result2_black : AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_12_2_corematch_blackFBFFBFB(tClass, tParent, match)) {
			InterfaceDeclaration mParent = (InterfaceDeclaration) result2_black[0];
			TypeToTAbstractType parentToParent = (TypeToTAbstractType) result2_black[2];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_black[3];
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result2_black[5];
			// ForEach 
			for (Object[] result3_black : AnonymousClassTypeInterfaceImpl
					.pattern_AnonymousClassTypeInterface_12_3_findcontext_blackBBFBBBB(mParent, tClass, parentToParent,
							mAnonymous, tParent, eAnonymousClassDeclarationToTClass)) {
				ClassInstanceCreation mCreation = (ClassInstanceCreation) result3_black[2];
				Object[] result3_green = AnonymousClassTypeInterfaceImpl
						.pattern_AnonymousClassTypeInterface_12_3_findcontext_greenBBBBBBBFFFFFFFFF(mParent, tClass,
								mCreation, parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge parentToParent__tParent____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mAnonymous__mCreation____classInstanceCreation = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tClass__tParent____implements = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tParent__tClass____implementedBy = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge parentToParent__mParent____source = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = AnonymousClassTypeInterfaceImpl
						.pattern_AnonymousClassTypeInterface_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
								eAnonymousClassDeclarationToTClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mParent] = " + mParent + ", "
							+ "[tClass] = " + tClass + ", " + "[mCreation] = " + mCreation + ", "
							+ "[parentToParent] = " + parentToParent + ", " + "[mAnonymous] = " + mAnonymous + ", "
							+ "[tParent] = " + tParent + ", " + "[eAnonymousClassDeclarationToTClass] = "
							+ eAnonymousClassDeclarationToTClass + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnonymousClassTypeInterfaceImpl
						.pattern_AnonymousClassTypeInterface_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnonymousClassTypeInterfaceImpl
							.pattern_AnonymousClassTypeInterface_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnonymousClassTypeInterfaceImpl
							.pattern_AnonymousClassTypeInterface_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tClass, TInterface tParent) {
		match.registerObject("tClass", tClass);
		match.registerObject("tParent", tParent);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tClass, TInterface tParent) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, InterfaceDeclaration mParent,
			TClass tClass, ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent,
			AnonymousClassDeclaration mAnonymous, TInterface tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mParent", mParent);
		isApplicableMatch.registerObject("tClass", tClass);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mParent, EObject tClass, EObject mCreation,
			EObject parentToParent, EObject mAnonymous, EObject tParent, EObject eAnonymousClassDeclarationToTClass,
			EObject mType) {
		ruleresult.registerObject("mParent", mParent);
		ruleresult.registerObject("tClass", tClass);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_37(EMoflonEdge _edge_implements) {

		Object[] result1_bindingAndBlack = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_20_2_testcorematchandDECs_blackFFB(_edge_implements)) {
			TClass tClass = (TClass) result2_black[0];
			TInterface tParent = (TInterface) result2_black[1];
			Object[] result2_green = AnonymousClassTypeInterfaceImpl
					.pattern_AnonymousClassTypeInterface_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnonymousClassTypeInterfaceImpl
					.pattern_AnonymousClassTypeInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tClass, tParent)) {
				// 
				if (AnonymousClassTypeInterfaceImpl
						.pattern_AnonymousClassTypeInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnonymousClassTypeInterfaceImpl
							.pattern_AnonymousClassTypeInterface_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnonymousClassTypeInterfaceImpl
							.pattern_AnonymousClassTypeInterface_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_40(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_blackFFFFB(_edge_type)) {
			InterfaceDeclaration mParent = (InterfaceDeclaration) result2_black[0];
			ClassInstanceCreation mCreation = (ClassInstanceCreation) result2_black[1];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_black[2];
			TypeAccess mType = (TypeAccess) result2_black[3];
			Object[] result2_green = AnonymousClassTypeInterfaceImpl
					.pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnonymousClassTypeInterfaceImpl
					.pattern_AnonymousClassTypeInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, mParent, mCreation, mAnonymous, mType)) {
				// 
				if (AnonymousClassTypeInterfaceImpl
						.pattern_AnonymousClassTypeInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnonymousClassTypeInterfaceImpl
							.pattern_AnonymousClassTypeInterface_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnonymousClassTypeInterfaceImpl
							.pattern_AnonymousClassTypeInterface_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnonymousClassTypeInterface");
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
		ruleResult.setRule("AnonymousClassTypeInterface");
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

		Object[] result1_black = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		InterfaceDeclaration mParent = (InterfaceDeclaration) result2_bindingAndBlack[0];
		TClass tClass = (TClass) result2_bindingAndBlack[1];
		ClassInstanceCreation mCreation = (ClassInstanceCreation) result2_bindingAndBlack[2];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_bindingAndBlack[3];
		TInterface tParent = (TInterface) result2_bindingAndBlack[4];
		TypeAccess mType = (TypeAccess) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, mParent, tClass,
						mCreation, mAnonymous, tParent, mType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mParent] = " + mParent + ", " + "[tClass] = " + tClass + ", " + "[mCreation] = " + mCreation
					+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[tParent] = " + tParent + ", " + "[mType] = "
					+ mType + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnonymousClassTypeInterfaceImpl
					.pattern_AnonymousClassTypeInterface_24_5_matchcorrcontext_blackBBFBBFBB(mParent, tClass,
							mAnonymous, tParent, sourceMatch, targetMatch)) {
				TypeToTAbstractType parentToParent = (TypeToTAbstractType) result5_black[2];
				AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result5_black[5];
				Object[] result5_green = AnonymousClassTypeInterfaceImpl
						.pattern_AnonymousClassTypeInterface_24_5_matchcorrcontext_greenBBBBF(parentToParent,
								eAnonymousClassDeclarationToTClass, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = AnonymousClassTypeInterfaceImpl
						.pattern_AnonymousClassTypeInterface_24_6_createcorrespondence_blackBBBBBBB(mParent, tClass,
								mCreation, mAnonymous, tParent, mType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mParent] = " + mParent
							+ ", " + "[tClass] = " + tClass + ", " + "[mCreation] = " + mCreation + ", "
							+ "[mAnonymous] = " + mAnonymous + ", " + "[tParent] = " + tParent + ", " + "[mType] = "
							+ mType + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = AnonymousClassTypeInterfaceImpl
						.pattern_AnonymousClassTypeInterface_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnonymousClassTypeInterfaceImpl
						.pattern_AnonymousClassTypeInterface_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(InterfaceDeclaration mParent, TClass tClass, ClassInstanceCreation mCreation,
			AnonymousClassDeclaration mAnonymous, TInterface tParent, TypeAccess mType, Match sourceMatch,
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
	public boolean checkDEC_FWD(InterfaceDeclaration mParent, ClassInstanceCreation mCreation,
			AnonymousClassDeclaration mAnonymous, TypeAccess mType) {// 
		Object[] result1_black = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_blackBBBB(mParent, mCreation, mAnonymous,
						mType);
		if (result1_black != null) {
			return AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_27_2_expressionF();
		} else {
			return AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tClass, TInterface tParent) {// 
		Object[] result1_black = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_28_1_matchtggpattern_blackBB(tClass, tParent);
		if (result1_black != null) {
			return AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_28_2_expressionF();
		} else {
			return AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType parentToParentParameter,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClassParameter) {

		Object[] result1_black = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnonymousClassTypeInterfaceImpl
				.pattern_AnonymousClassTypeInterface_29_2_isapplicablecore_blackFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList parentToParentList = (RuleEntryList) result2_black[0];
			InterfaceDeclaration mParent = (InterfaceDeclaration) result2_black[1];
			TypeToTAbstractType parentToParent = (TypeToTAbstractType) result2_black[2];
			TInterface tParent = (TInterface) result2_black[3];
			//nothing RuleEntryList eAnonymousClassDeclarationToTClassList = (RuleEntryList) result2_black[4];
			TClass tClass = (TClass) result2_black[5];
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result2_black[6];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_black[7];
			ClassInstanceCreation mCreation = (ClassInstanceCreation) result2_black[8];

			Object[] result3_bindingAndBlack = AnonymousClassTypeInterfaceImpl
					.pattern_AnonymousClassTypeInterface_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
							isApplicableMatch, mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
							eAnonymousClassDeclarationToTClass, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mParent] = " + mParent + ", "
						+ "[tClass] = " + tClass + ", " + "[mCreation] = " + mCreation + ", " + "[parentToParent] = "
						+ parentToParent + ", " + "[mAnonymous] = " + mAnonymous + ", " + "[tParent] = " + tParent
						+ ", " + "[eAnonymousClassDeclarationToTClass] = " + eAnonymousClassDeclarationToTClass + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = AnonymousClassTypeInterfaceImpl
						.pattern_AnonymousClassTypeInterface_29_5_checknacs_blackBBBBBBB(mParent, tClass, mCreation,
								parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass);
				if (result5_black != null) {

					Object[] result6_black = AnonymousClassTypeInterfaceImpl
							.pattern_AnonymousClassTypeInterface_29_6_perform_blackBBBBBBBB(mParent, tClass, mCreation,
									parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mParent] = "
								+ mParent + ", " + "[tClass] = " + tClass + ", " + "[mCreation] = " + mCreation + ", "
								+ "[parentToParent] = " + parentToParent + ", " + "[mAnonymous] = " + mAnonymous + ", "
								+ "[tParent] = " + tParent + ", " + "[eAnonymousClassDeclarationToTClass] = "
								+ eAnonymousClassDeclarationToTClass + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_29_6_perform_greenBBBBFB(
							mParent, tClass, mCreation, tParent, ruleResult);
					//nothing TypeAccess mType = (TypeAccess) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return AnonymousClassTypeInterfaceImpl.pattern_AnonymousClassTypeInterface_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, InterfaceDeclaration mParent,
			TClass tClass, ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent,
			AnonymousClassDeclaration mAnonymous, TInterface tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mParent", mParent);
		isApplicableMatch.registerObject("tClass", tClass);
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
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___IS_APPROPRIATE_FWD__MATCH_INTERFACEDECLARATION_CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_TYPEACCESS:
			return isAppropriate_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(ClassInstanceCreation) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
					(TypeAccess) arguments.get(4));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_INTERFACEDECLARATION_CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_TYPEACCESS:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(ClassInstanceCreation) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
					(TypeAccess) arguments.get(4));
			return null;
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_INTERFACEDECLARATION_CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_TYPEACCESS:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(ClassInstanceCreation) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
					(TypeAccess) arguments.get(4));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERFACEDECLARATION_TCLASS_CLASSINSTANCECREATION_TYPETOTABSTRACTTYPE_ANONYMOUSCLASSDECLARATION_TINTERFACE_ANONYMOUSCLASSDECLARATIONTOTCLASS_TYPEACCESS:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(InterfaceDeclaration) arguments.get(1), (TClass) arguments.get(2),
					(ClassInstanceCreation) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
					(AnonymousClassDeclaration) arguments.get(5), (TInterface) arguments.get(6),
					(AnonymousClassDeclarationToTClass) arguments.get(7), (TypeAccess) arguments.get(8));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___IS_APPROPRIATE_BWD__MATCH_TCLASS_TINTERFACE:
			return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TInterface) arguments.get(2));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TINTERFACE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TInterface) arguments.get(2));
			return null;
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TINTERFACE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TInterface) arguments.get(2));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERFACEDECLARATION_TCLASS_CLASSINSTANCECREATION_TYPETOTABSTRACTTYPE_ANONYMOUSCLASSDECLARATION_TINTERFACE_ANONYMOUSCLASSDECLARATIONTOTCLASS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(InterfaceDeclaration) arguments.get(1), (TClass) arguments.get(2),
					(ClassInstanceCreation) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
					(AnonymousClassDeclaration) arguments.get(5), (TInterface) arguments.get(6),
					(AnonymousClassDeclarationToTClass) arguments.get(7));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_37__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_37((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_40__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_40((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___IS_APPLICABLE_SOLVE_CSP_CC__INTERFACEDECLARATION_TCLASS_CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_TINTERFACE_TYPEACCESS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((InterfaceDeclaration) arguments.get(0), (TClass) arguments.get(1),
					(ClassInstanceCreation) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3),
					(TInterface) arguments.get(4), (TypeAccess) arguments.get(5), (Match) arguments.get(6),
					(Match) arguments.get(7));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___CHECK_DEC_FWD__INTERFACEDECLARATION_CLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_TYPEACCESS:
			return checkDEC_FWD((InterfaceDeclaration) arguments.get(0), (ClassInstanceCreation) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2), (TypeAccess) arguments.get(3));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___CHECK_DEC_BWD__TCLASS_TINTERFACE:
			return checkDEC_BWD((TClass) arguments.get(0), (TInterface) arguments.get(1));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_ANONYMOUSCLASSDECLARATIONTOTCLASS:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(AnonymousClassDeclarationToTClass) arguments.get(2));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERFACEDECLARATION_TCLASS_CLASSINSTANCECREATION_TYPETOTABSTRACTTYPE_ANONYMOUSCLASSDECLARATION_TINTERFACE_ANONYMOUSCLASSDECLARATIONTOTCLASS_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(InterfaceDeclaration) arguments.get(1), (TClass) arguments.get(2),
					(ClassInstanceCreation) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
					(AnonymousClassDeclaration) arguments.get(5), (TInterface) arguments.get(6),
					(AnonymousClassDeclarationToTClass) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.ANONYMOUS_CLASS_TYPE_INTERFACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_0_1_initialbindings_blackBBBBBB(
			AnonymousClassTypeInterface _this, Match match, InterfaceDeclaration mParent,
			ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous, TypeAccess mType) {
		return new Object[] { _this, match, mParent, mCreation, mAnonymous, mType };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_0_2_SolveCSP_bindingFBBBBBB(
			AnonymousClassTypeInterface _this, Match match, InterfaceDeclaration mParent,
			ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous, TypeAccess mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mParent, mCreation, mAnonymous, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mParent, mCreation, mAnonymous, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			AnonymousClassTypeInterface _this, Match match, InterfaceDeclaration mParent,
			ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous, TypeAccess mType) {
		Object[] result_pattern_AnonymousClassTypeInterface_0_2_SolveCSP_binding = pattern_AnonymousClassTypeInterface_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, mParent, mCreation, mAnonymous, mType);
		if (result_pattern_AnonymousClassTypeInterface_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassTypeInterface_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnonymousClassTypeInterface_0_2_SolveCSP_black = pattern_AnonymousClassTypeInterface_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClassTypeInterface_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mParent, mCreation, mAnonymous, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassTypeInterface_0_3_CheckCSP_expressionFBB(
			AnonymousClassTypeInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, InterfaceDeclaration mParent, ClassInstanceCreation mCreation,
			AnonymousClassDeclaration mAnonymous, TypeAccess mType) {
		return new Object[] { match, mParent, mCreation, mAnonymous, mType };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, InterfaceDeclaration mParent, ClassInstanceCreation mCreation, TypeAccess mType) {
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

	public static final Object[] pattern_AnonymousClassTypeInterface_0_5_collectcontextelements_blackBBBBB(Match match,
			InterfaceDeclaration mParent, ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous,
			TypeAccess mType) {
		return new Object[] { match, mParent, mCreation, mAnonymous, mType };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_0_5_collectcontextelements_greenBBBBFF(Match match,
			InterfaceDeclaration mParent, ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous) {
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

	public static final void pattern_AnonymousClassTypeInterface_0_6_registerobjectstomatch_expressionBBBBBB(
			AnonymousClassTypeInterface _this, Match match, InterfaceDeclaration mParent,
			ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous, TypeAccess mType) {
		_this.registerObjectsToMatch_FWD(match, mParent, mCreation, mAnonymous, mType);

	}

	public static final boolean pattern_AnonymousClassTypeInterface_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClassTypeInterface_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mParent");
		EObject _localVariable_1 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("mCreation");
		EObject _localVariable_3 = isApplicableMatch.getObject("parentToParent");
		EObject _localVariable_4 = isApplicableMatch.getObject("mAnonymous");
		EObject _localVariable_5 = isApplicableMatch.getObject("tParent");
		EObject _localVariable_6 = isApplicableMatch.getObject("eAnonymousClassDeclarationToTClass");
		EObject _localVariable_7 = isApplicableMatch.getObject("mType");
		EObject tmpMParent = _localVariable_0;
		EObject tmpTClass = _localVariable_1;
		EObject tmpMCreation = _localVariable_2;
		EObject tmpParentToParent = _localVariable_3;
		EObject tmpMAnonymous = _localVariable_4;
		EObject tmpTParent = _localVariable_5;
		EObject tmpEAnonymousClassDeclarationToTClass = _localVariable_6;
		EObject tmpMType = _localVariable_7;
		if (tmpMParent instanceof InterfaceDeclaration) {
			InterfaceDeclaration mParent = (InterfaceDeclaration) tmpMParent;
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (tmpMCreation instanceof ClassInstanceCreation) {
					ClassInstanceCreation mCreation = (ClassInstanceCreation) tmpMCreation;
					if (tmpParentToParent instanceof TypeToTAbstractType) {
						TypeToTAbstractType parentToParent = (TypeToTAbstractType) tmpParentToParent;
						if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
							AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
							if (tmpTParent instanceof TInterface) {
								TInterface tParent = (TInterface) tmpTParent;
								if (tmpEAnonymousClassDeclarationToTClass instanceof AnonymousClassDeclarationToTClass) {
									AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) tmpEAnonymousClassDeclarationToTClass;
									if (tmpMType instanceof TypeAccess) {
										TypeAccess mType = (TypeAccess) tmpMType;
										return new Object[] { mParent, tClass, mCreation, parentToParent, mAnonymous,
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

	public static final Object[] pattern_AnonymousClassTypeInterface_1_1_performtransformation_blackBBBBBBBBFBB(
			InterfaceDeclaration mParent, TClass tClass, ClassInstanceCreation mCreation,
			TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous, TInterface tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TypeAccess mType,
			AnonymousClassTypeInterface _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
						eAnonymousClassDeclarationToTClass, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			AnonymousClassTypeInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnonymousClassTypeInterface_1_1_performtransformation_binding = pattern_AnonymousClassTypeInterface_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnonymousClassTypeInterface_1_1_performtransformation_binding != null) {
			InterfaceDeclaration mParent = (InterfaceDeclaration) result_pattern_AnonymousClassTypeInterface_1_1_performtransformation_binding[0];
			TClass tClass = (TClass) result_pattern_AnonymousClassTypeInterface_1_1_performtransformation_binding[1];
			ClassInstanceCreation mCreation = (ClassInstanceCreation) result_pattern_AnonymousClassTypeInterface_1_1_performtransformation_binding[2];
			TypeToTAbstractType parentToParent = (TypeToTAbstractType) result_pattern_AnonymousClassTypeInterface_1_1_performtransformation_binding[3];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_AnonymousClassTypeInterface_1_1_performtransformation_binding[4];
			TInterface tParent = (TInterface) result_pattern_AnonymousClassTypeInterface_1_1_performtransformation_binding[5];
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result_pattern_AnonymousClassTypeInterface_1_1_performtransformation_binding[6];
			TypeAccess mType = (TypeAccess) result_pattern_AnonymousClassTypeInterface_1_1_performtransformation_binding[7];

			Object[] result_pattern_AnonymousClassTypeInterface_1_1_performtransformation_black = pattern_AnonymousClassTypeInterface_1_1_performtransformation_blackBBBBBBBBFBB(
					mParent, tClass, mCreation, parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass,
					mType, _this, isApplicableMatch);
			if (result_pattern_AnonymousClassTypeInterface_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnonymousClassTypeInterface_1_1_performtransformation_black[8];

				return new Object[] { mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
						eAnonymousClassDeclarationToTClass, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_1_1_performtransformation_greenBB(TClass tClass,
			TInterface tParent) {
		tClass.getImplements().add(tParent);
		return new Object[] { tClass, tParent };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_1_2_collecttranslatedelements_blackB(
			TypeAccess mType) {
		return new Object[] { mType };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_1_2_collecttranslatedelements_greenFB(
			TypeAccess mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mType);
		return new Object[] { ruleresult, mType };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mParent, EObject tClass, EObject mCreation, EObject parentToParent,
			EObject mAnonymous, EObject tParent, EObject eAnonymousClassDeclarationToTClass, EObject mType) {
		if (!mParent.equals(tClass)) {
			if (!mParent.equals(parentToParent)) {
				if (!mParent.equals(tParent)) {
					if (!mParent.equals(mType)) {
						if (!tClass.equals(tParent)) {
							if (!mCreation.equals(mParent)) {
								if (!mCreation.equals(tClass)) {
									if (!mCreation.equals(parentToParent)) {
										if (!mCreation.equals(tParent)) {
											if (!mCreation.equals(mType)) {
												if (!parentToParent.equals(tClass)) {
													if (!parentToParent.equals(tParent)) {
														if (!mAnonymous.equals(mParent)) {
															if (!mAnonymous.equals(tClass)) {
																if (!mAnonymous.equals(mCreation)) {
																	if (!mAnonymous.equals(parentToParent)) {
																		if (!mAnonymous.equals(tParent)) {
																			if (!mAnonymous.equals(mType)) {
																				if (!eAnonymousClassDeclarationToTClass
																						.equals(mParent)) {
																					if (!eAnonymousClassDeclarationToTClass
																							.equals(tClass)) {
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
																																mParent,
																																tClass,
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

	public static final Object[] pattern_AnonymousClassTypeInterface_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mParent, EObject tClass, EObject mCreation, EObject tParent,
			EObject mType) {
		EMoflonEdge mCreation__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mParent____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParent__mType____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tParent____implements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParent__tClass____implementedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnonymousClassTypeInterface";
		String mCreation__mType____type_name_prime = "type";
		String mType__mParent____type_name_prime = "type";
		String mParent__mType____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String tClass__tParent____implements_name_prime = "implements";
		String tParent__tClass____implementedBy_name_prime = "implementedBy";
		mCreation__mType____type.setSrc(mCreation);
		mCreation__mType____type.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mCreation__mType____type);
		mType__mParent____type.setSrc(mType);
		mType__mParent____type.setTrg(mParent);
		ruleresult.getTranslatedEdges().add(mType__mParent____type);
		mParent__mType____usagesInTypeAccess.setSrc(mParent);
		mParent__mType____usagesInTypeAccess.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mParent__mType____usagesInTypeAccess);
		tClass__tParent____implements.setSrc(tClass);
		tClass__tParent____implements.setTrg(tParent);
		ruleresult.getCreatedEdges().add(tClass__tParent____implements);
		tParent__tClass____implementedBy.setSrc(tParent);
		tParent__tClass____implementedBy.setTrg(tClass);
		ruleresult.getCreatedEdges().add(tParent__tClass____implementedBy);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mCreation__mType____type.setName(mCreation__mType____type_name_prime);
		mType__mParent____type.setName(mType__mParent____type_name_prime);
		mParent__mType____usagesInTypeAccess.setName(mParent__mType____usagesInTypeAccess_name_prime);
		tClass__tParent____implements.setName(tClass__tParent____implements_name_prime);
		tParent__tClass____implementedBy.setName(tParent__tClass____implementedBy_name_prime);
		return new Object[] { ruleresult, mParent, tClass, mCreation, tParent, mType, mCreation__mType____type,
				mType__mParent____type, mParent__mType____usagesInTypeAccess, tClass__tParent____implements,
				tParent__tClass____implementedBy };
	}

	public static final void pattern_AnonymousClassTypeInterface_1_5_registerobjects_expressionBBBBBBBBBB(
			AnonymousClassTypeInterface _this, PerformRuleResult ruleresult, EObject mParent, EObject tClass,
			EObject mCreation, EObject parentToParent, EObject mAnonymous, EObject tParent,
			EObject eAnonymousClassDeclarationToTClass, EObject mType) {
		_this.registerObjects_FWD(ruleresult, mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass, mType);

	}

	public static final PerformRuleResult pattern_AnonymousClassTypeInterface_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_2_1_preparereturnvalue_bindingFB(
			AnonymousClassTypeInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnonymousClassTypeInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnonymousClassTypeInterface _this) {
		Object[] result_pattern_AnonymousClassTypeInterface_2_1_preparereturnvalue_binding = pattern_AnonymousClassTypeInterface_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClassTypeInterface_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnonymousClassTypeInterface_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClassTypeInterface_2_1_preparereturnvalue_black = pattern_AnonymousClassTypeInterface_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnonymousClassTypeInterface_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnonymousClassTypeInterface_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnonymousClassTypeInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mParent");
		EObject _localVariable_1 = match.getObject("mCreation");
		EObject _localVariable_2 = match.getObject("mAnonymous");
		EObject _localVariable_3 = match.getObject("mType");
		EObject tmpMParent = _localVariable_0;
		EObject tmpMCreation = _localVariable_1;
		EObject tmpMAnonymous = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		if (tmpMParent instanceof InterfaceDeclaration) {
			InterfaceDeclaration mParent = (InterfaceDeclaration) tmpMParent;
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

	public static final Iterable<Object[]> pattern_AnonymousClassTypeInterface_2_2_corematch_blackBFBFBFFBB(
			InterfaceDeclaration mParent, ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous,
			TypeAccess mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAnonymous, AnonymousClassDeclarationToTClass.class, "source")) {
			TClass tClass = eAnonymousClassDeclarationToTClass.getTarget();
			if (tClass != null) {
				for (TypeToTAbstractType parentToParent : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mParent, TypeToTAbstractType.class, "source")) {
					TAbstractType tmpTParent = parentToParent.getTarget();
					if (tmpTParent instanceof TInterface) {
						TInterface tParent = (TInterface) tmpTParent;
						_result.add(new Object[] { mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
								eAnonymousClassDeclarationToTClass, mType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassTypeInterface_2_3_findcontext_blackBBBBBBBB(
			InterfaceDeclaration mParent, TClass tClass, ClassInstanceCreation mCreation,
			TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous, TInterface tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TypeAccess mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mType.equals(mCreation.getType())) {
			if (tParent.equals(parentToParent.getTarget())) {
				if (tClass.equals(eAnonymousClassDeclarationToTClass.getTarget())) {
					if (mCreation.equals(mAnonymous.getClassInstanceCreation())) {
						if (mAnonymous.equals(eAnonymousClassDeclarationToTClass.getSource())) {
							if (mParent.equals(mType.getType())) {
								if (mParent.equals(parentToParent.getSource())) {
									_result.add(new Object[] { mParent, tClass, mCreation, parentToParent, mAnonymous,
											tParent, eAnonymousClassDeclarationToTClass, mType });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(
			InterfaceDeclaration mParent, TClass tClass, ClassInstanceCreation mCreation,
			TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous, TInterface tParent,
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
		isApplicableMatch.getAllContextElements().add(mParent);
		isApplicableMatch.getAllContextElements().add(tClass);
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
		return new Object[] { mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass, mType, isApplicableMatch, mCreation__mType____type,
				parentToParent__tParent____target, eAnonymousClassDeclarationToTClass__tClass____target,
				mAnonymous__mCreation____classInstanceCreation, mCreation__mAnonymous____anonymousClassDeclaration,
				eAnonymousClassDeclarationToTClass__mAnonymous____source, mType__mParent____type,
				mParent__mType____usagesInTypeAccess, parentToParent__mParent____source };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_2_4_solveCSP_bindingFBBBBBBBBBB(
			AnonymousClassTypeInterface _this, IsApplicableMatch isApplicableMatch, InterfaceDeclaration mParent,
			TClass tClass, ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent,
			AnonymousClassDeclaration mAnonymous, TInterface tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TypeAccess mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mParent, tClass, mCreation,
				parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mParent, tClass, mCreation, parentToParent, mAnonymous,
					tParent, eAnonymousClassDeclarationToTClass, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			AnonymousClassTypeInterface _this, IsApplicableMatch isApplicableMatch, InterfaceDeclaration mParent,
			TClass tClass, ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent,
			AnonymousClassDeclaration mAnonymous, TInterface tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, TypeAccess mType) {
		Object[] result_pattern_AnonymousClassTypeInterface_2_4_solveCSP_binding = pattern_AnonymousClassTypeInterface_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass, mType);
		if (result_pattern_AnonymousClassTypeInterface_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassTypeInterface_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClassTypeInterface_2_4_solveCSP_black = pattern_AnonymousClassTypeInterface_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClassTypeInterface_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mParent, tClass, mCreation, parentToParent,
						mAnonymous, tParent, eAnonymousClassDeclarationToTClass, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassTypeInterface_2_5_checkCSP_expressionFBB(
			AnonymousClassTypeInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnonymousClassTypeInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClassTypeInterface_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_10_1_initialbindings_blackBBBB(
			AnonymousClassTypeInterface _this, Match match, TClass tClass, TInterface tParent) {
		return new Object[] { _this, match, tClass, tParent };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_10_2_SolveCSP_bindingFBBBB(
			AnonymousClassTypeInterface _this, Match match, TClass tClass, TInterface tParent) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tClass, tParent);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tClass, tParent };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_10_2_SolveCSP_bindingAndBlackFBBBB(
			AnonymousClassTypeInterface _this, Match match, TClass tClass, TInterface tParent) {
		Object[] result_pattern_AnonymousClassTypeInterface_10_2_SolveCSP_binding = pattern_AnonymousClassTypeInterface_10_2_SolveCSP_bindingFBBBB(
				_this, match, tClass, tParent);
		if (result_pattern_AnonymousClassTypeInterface_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassTypeInterface_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnonymousClassTypeInterface_10_2_SolveCSP_black = pattern_AnonymousClassTypeInterface_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClassTypeInterface_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tClass, tParent };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassTypeInterface_10_3_CheckCSP_expressionFBB(
			AnonymousClassTypeInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_10_4_collectelementstobetranslated_blackBBB(
			Match match, TClass tClass, TInterface tParent) {
		return new Object[] { match, tClass, tParent };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, TClass tClass, TInterface tParent) {
		EMoflonEdge tClass__tParent____implements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParent__tClass____implementedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tClass__tParent____implements_name_prime = "implements";
		String tParent__tClass____implementedBy_name_prime = "implementedBy";
		tClass__tParent____implements.setSrc(tClass);
		tClass__tParent____implements.setTrg(tParent);
		match.getToBeTranslatedEdges().add(tClass__tParent____implements);
		tParent__tClass____implementedBy.setSrc(tParent);
		tParent__tClass____implementedBy.setTrg(tClass);
		match.getToBeTranslatedEdges().add(tParent__tClass____implementedBy);
		tClass__tParent____implements.setName(tClass__tParent____implements_name_prime);
		tParent__tClass____implementedBy.setName(tParent__tClass____implementedBy_name_prime);
		return new Object[] { match, tClass, tParent, tClass__tParent____implements, tParent__tClass____implementedBy };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_10_5_collectcontextelements_blackBBB(Match match,
			TClass tClass, TInterface tParent) {
		return new Object[] { match, tClass, tParent };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_10_5_collectcontextelements_greenBBB(Match match,
			TClass tClass, TInterface tParent) {
		match.getContextNodes().add(tClass);
		match.getContextNodes().add(tParent);
		return new Object[] { match, tClass, tParent };
	}

	public static final void pattern_AnonymousClassTypeInterface_10_6_registerobjectstomatch_expressionBBBB(
			AnonymousClassTypeInterface _this, Match match, TClass tClass, TInterface tParent) {
		_this.registerObjectsToMatch_BWD(match, tClass, tParent);

	}

	public static final boolean pattern_AnonymousClassTypeInterface_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClassTypeInterface_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mParent");
		EObject _localVariable_1 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("mCreation");
		EObject _localVariable_3 = isApplicableMatch.getObject("parentToParent");
		EObject _localVariable_4 = isApplicableMatch.getObject("mAnonymous");
		EObject _localVariable_5 = isApplicableMatch.getObject("tParent");
		EObject _localVariable_6 = isApplicableMatch.getObject("eAnonymousClassDeclarationToTClass");
		EObject tmpMParent = _localVariable_0;
		EObject tmpTClass = _localVariable_1;
		EObject tmpMCreation = _localVariable_2;
		EObject tmpParentToParent = _localVariable_3;
		EObject tmpMAnonymous = _localVariable_4;
		EObject tmpTParent = _localVariable_5;
		EObject tmpEAnonymousClassDeclarationToTClass = _localVariable_6;
		if (tmpMParent instanceof InterfaceDeclaration) {
			InterfaceDeclaration mParent = (InterfaceDeclaration) tmpMParent;
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (tmpMCreation instanceof ClassInstanceCreation) {
					ClassInstanceCreation mCreation = (ClassInstanceCreation) tmpMCreation;
					if (tmpParentToParent instanceof TypeToTAbstractType) {
						TypeToTAbstractType parentToParent = (TypeToTAbstractType) tmpParentToParent;
						if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
							AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
							if (tmpTParent instanceof TInterface) {
								TInterface tParent = (TInterface) tmpTParent;
								if (tmpEAnonymousClassDeclarationToTClass instanceof AnonymousClassDeclarationToTClass) {
									AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) tmpEAnonymousClassDeclarationToTClass;
									return new Object[] { mParent, tClass, mCreation, parentToParent, mAnonymous,
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

	public static final Object[] pattern_AnonymousClassTypeInterface_11_1_performtransformation_blackBBBBBBBFBB(
			InterfaceDeclaration mParent, TClass tClass, ClassInstanceCreation mCreation,
			TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous, TInterface tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, AnonymousClassTypeInterface _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
						eAnonymousClassDeclarationToTClass, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			AnonymousClassTypeInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnonymousClassTypeInterface_11_1_performtransformation_binding = pattern_AnonymousClassTypeInterface_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnonymousClassTypeInterface_11_1_performtransformation_binding != null) {
			InterfaceDeclaration mParent = (InterfaceDeclaration) result_pattern_AnonymousClassTypeInterface_11_1_performtransformation_binding[0];
			TClass tClass = (TClass) result_pattern_AnonymousClassTypeInterface_11_1_performtransformation_binding[1];
			ClassInstanceCreation mCreation = (ClassInstanceCreation) result_pattern_AnonymousClassTypeInterface_11_1_performtransformation_binding[2];
			TypeToTAbstractType parentToParent = (TypeToTAbstractType) result_pattern_AnonymousClassTypeInterface_11_1_performtransformation_binding[3];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_AnonymousClassTypeInterface_11_1_performtransformation_binding[4];
			TInterface tParent = (TInterface) result_pattern_AnonymousClassTypeInterface_11_1_performtransformation_binding[5];
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result_pattern_AnonymousClassTypeInterface_11_1_performtransformation_binding[6];

			Object[] result_pattern_AnonymousClassTypeInterface_11_1_performtransformation_black = pattern_AnonymousClassTypeInterface_11_1_performtransformation_blackBBBBBBBFBB(
					mParent, tClass, mCreation, parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass,
					_this, isApplicableMatch);
			if (result_pattern_AnonymousClassTypeInterface_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnonymousClassTypeInterface_11_1_performtransformation_black[7];

				return new Object[] { mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
						eAnonymousClassDeclarationToTClass, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_11_1_performtransformation_greenBBF(
			InterfaceDeclaration mParent, ClassInstanceCreation mCreation) {
		TypeAccess mType = JavaFactory.eINSTANCE.createTypeAccess();
		mCreation.setType(mType);
		mType.setType(mParent);
		return new Object[] { mParent, mCreation, mType };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_11_2_collecttranslatedelements_blackB(
			TypeAccess mType) {
		return new Object[] { mType };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_11_2_collecttranslatedelements_greenFB(
			TypeAccess mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mType);
		return new Object[] { ruleresult, mType };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_11_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mParent, EObject tClass, EObject mCreation, EObject parentToParent,
			EObject mAnonymous, EObject tParent, EObject eAnonymousClassDeclarationToTClass, EObject mType) {
		if (!mParent.equals(tClass)) {
			if (!mParent.equals(parentToParent)) {
				if (!mParent.equals(tParent)) {
					if (!mParent.equals(mType)) {
						if (!tClass.equals(tParent)) {
							if (!mCreation.equals(mParent)) {
								if (!mCreation.equals(tClass)) {
									if (!mCreation.equals(parentToParent)) {
										if (!mCreation.equals(tParent)) {
											if (!mCreation.equals(mType)) {
												if (!parentToParent.equals(tClass)) {
													if (!parentToParent.equals(tParent)) {
														if (!mAnonymous.equals(mParent)) {
															if (!mAnonymous.equals(tClass)) {
																if (!mAnonymous.equals(mCreation)) {
																	if (!mAnonymous.equals(parentToParent)) {
																		if (!mAnonymous.equals(tParent)) {
																			if (!mAnonymous.equals(mType)) {
																				if (!eAnonymousClassDeclarationToTClass
																						.equals(mParent)) {
																					if (!eAnonymousClassDeclarationToTClass
																							.equals(tClass)) {
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
																																mParent,
																																tClass,
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

	public static final Object[] pattern_AnonymousClassTypeInterface_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mParent, EObject tClass, EObject mCreation, EObject tParent,
			EObject mType) {
		EMoflonEdge mCreation__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mParent____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParent__mType____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tParent____implements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParent__tClass____implementedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnonymousClassTypeInterface";
		String mCreation__mType____type_name_prime = "type";
		String mType__mParent____type_name_prime = "type";
		String mParent__mType____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String tClass__tParent____implements_name_prime = "implements";
		String tParent__tClass____implementedBy_name_prime = "implementedBy";
		mCreation__mType____type.setSrc(mCreation);
		mCreation__mType____type.setTrg(mType);
		ruleresult.getCreatedEdges().add(mCreation__mType____type);
		mType__mParent____type.setSrc(mType);
		mType__mParent____type.setTrg(mParent);
		ruleresult.getCreatedEdges().add(mType__mParent____type);
		mParent__mType____usagesInTypeAccess.setSrc(mParent);
		mParent__mType____usagesInTypeAccess.setTrg(mType);
		ruleresult.getCreatedEdges().add(mParent__mType____usagesInTypeAccess);
		tClass__tParent____implements.setSrc(tClass);
		tClass__tParent____implements.setTrg(tParent);
		ruleresult.getTranslatedEdges().add(tClass__tParent____implements);
		tParent__tClass____implementedBy.setSrc(tParent);
		tParent__tClass____implementedBy.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(tParent__tClass____implementedBy);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mCreation__mType____type.setName(mCreation__mType____type_name_prime);
		mType__mParent____type.setName(mType__mParent____type_name_prime);
		mParent__mType____usagesInTypeAccess.setName(mParent__mType____usagesInTypeAccess_name_prime);
		tClass__tParent____implements.setName(tClass__tParent____implements_name_prime);
		tParent__tClass____implementedBy.setName(tParent__tClass____implementedBy_name_prime);
		return new Object[] { ruleresult, mParent, tClass, mCreation, tParent, mType, mCreation__mType____type,
				mType__mParent____type, mParent__mType____usagesInTypeAccess, tClass__tParent____implements,
				tParent__tClass____implementedBy };
	}

	public static final void pattern_AnonymousClassTypeInterface_11_5_registerobjects_expressionBBBBBBBBBB(
			AnonymousClassTypeInterface _this, PerformRuleResult ruleresult, EObject mParent, EObject tClass,
			EObject mCreation, EObject parentToParent, EObject mAnonymous, EObject tParent,
			EObject eAnonymousClassDeclarationToTClass, EObject mType) {
		_this.registerObjects_BWD(ruleresult, mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass, mType);

	}

	public static final PerformRuleResult pattern_AnonymousClassTypeInterface_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_12_1_preparereturnvalue_bindingFB(
			AnonymousClassTypeInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnonymousClassTypeInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnonymousClassTypeInterface _this) {
		Object[] result_pattern_AnonymousClassTypeInterface_12_1_preparereturnvalue_binding = pattern_AnonymousClassTypeInterface_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClassTypeInterface_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnonymousClassTypeInterface_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClassTypeInterface_12_1_preparereturnvalue_black = pattern_AnonymousClassTypeInterface_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnonymousClassTypeInterface_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnonymousClassTypeInterface_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnonymousClassTypeInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tClass");
		EObject _localVariable_1 = match.getObject("tParent");
		EObject tmpTClass = _localVariable_0;
		EObject tmpTParent = _localVariable_1;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpTParent instanceof TInterface) {
				TInterface tParent = (TInterface) tmpTParent;
				return new Object[] { tClass, tParent, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassTypeInterface_12_2_corematch_blackFBFFBFB(
			TClass tClass, TInterface tParent, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType parentToParent : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tParent, TypeToTAbstractType.class, "target")) {
			Type tmpMParent = parentToParent.getSource();
			if (tmpMParent instanceof InterfaceDeclaration) {
				InterfaceDeclaration mParent = (InterfaceDeclaration) tmpMParent;
				for (AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tClass, AnonymousClassDeclarationToTClass.class, "target")) {
					AnonymousClassDeclaration mAnonymous = eAnonymousClassDeclarationToTClass.getSource();
					if (mAnonymous != null) {
						_result.add(new Object[] { mParent, tClass, parentToParent, mAnonymous, tParent,
								eAnonymousClassDeclarationToTClass, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassTypeInterface_12_3_findcontext_blackBBFBBBB(
			InterfaceDeclaration mParent, TClass tClass, TypeToTAbstractType parentToParent,
			AnonymousClassDeclaration mAnonymous, TInterface tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tParent.equals(parentToParent.getTarget())) {
			if (tClass.equals(eAnonymousClassDeclarationToTClass.getTarget())) {
				if (mAnonymous.equals(eAnonymousClassDeclarationToTClass.getSource())) {
					if (tClass.getImplements().contains(tParent)) {
						if (mParent.equals(parentToParent.getSource())) {
							ClassInstanceCreation mCreation = mAnonymous.getClassInstanceCreation();
							if (mCreation != null) {
								_result.add(new Object[] { mParent, tClass, mCreation, parentToParent, mAnonymous,
										tParent, eAnonymousClassDeclarationToTClass });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_12_3_findcontext_greenBBBBBBBFFFFFFFFF(
			InterfaceDeclaration mParent, TClass tClass, ClassInstanceCreation mCreation,
			TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous, TInterface tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge parentToParent__tParent____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mCreation____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tClass__tParent____implements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParent__tClass____implementedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge parentToParent__mParent____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String parentToParent__tParent____target_name_prime = "target";
		String eAnonymousClassDeclarationToTClass__tClass____target_name_prime = "target";
		String mAnonymous__mCreation____classInstanceCreation_name_prime = "classInstanceCreation";
		String mCreation__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime = "source";
		String tClass__tParent____implements_name_prime = "implements";
		String tParent__tClass____implementedBy_name_prime = "implementedBy";
		String parentToParent__mParent____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mParent);
		isApplicableMatch.getAllContextElements().add(tClass);
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
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(eAnonymousClassDeclarationToTClass__mAnonymous____source);
		tClass__tParent____implements.setSrc(tClass);
		tClass__tParent____implements.setTrg(tParent);
		isApplicableMatch.getAllContextElements().add(tClass__tParent____implements);
		tParent__tClass____implementedBy.setSrc(tParent);
		tParent__tClass____implementedBy.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(tParent__tClass____implementedBy);
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
		eAnonymousClassDeclarationToTClass__mAnonymous____source
				.setName(eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime);
		tClass__tParent____implements.setName(tClass__tParent____implements_name_prime);
		tParent__tClass____implementedBy.setName(tParent__tClass____implementedBy_name_prime);
		parentToParent__mParent____source.setName(parentToParent__mParent____source_name_prime);
		return new Object[] { mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass, isApplicableMatch, parentToParent__tParent____target,
				eAnonymousClassDeclarationToTClass__tClass____target, mAnonymous__mCreation____classInstanceCreation,
				mCreation__mAnonymous____anonymousClassDeclaration,
				eAnonymousClassDeclarationToTClass__mAnonymous____source, tClass__tParent____implements,
				tParent__tClass____implementedBy, parentToParent__mParent____source };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_12_4_solveCSP_bindingFBBBBBBBBB(
			AnonymousClassTypeInterface _this, IsApplicableMatch isApplicableMatch, InterfaceDeclaration mParent,
			TClass tClass, ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent,
			AnonymousClassDeclaration mAnonymous, TInterface tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mParent, tClass, mCreation,
				parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mParent, tClass, mCreation, parentToParent, mAnonymous,
					tParent, eAnonymousClassDeclarationToTClass };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			AnonymousClassTypeInterface _this, IsApplicableMatch isApplicableMatch, InterfaceDeclaration mParent,
			TClass tClass, ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent,
			AnonymousClassDeclaration mAnonymous, TInterface tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {
		Object[] result_pattern_AnonymousClassTypeInterface_12_4_solveCSP_binding = pattern_AnonymousClassTypeInterface_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass);
		if (result_pattern_AnonymousClassTypeInterface_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassTypeInterface_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClassTypeInterface_12_4_solveCSP_black = pattern_AnonymousClassTypeInterface_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClassTypeInterface_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mParent, tClass, mCreation, parentToParent,
						mAnonymous, tParent, eAnonymousClassDeclarationToTClass };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassTypeInterface_12_5_checkCSP_expressionFBB(
			AnonymousClassTypeInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnonymousClassTypeInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClassTypeInterface_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_20_1_preparereturnvalue_bindingFB(
			AnonymousClassTypeInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnonymousClassTypeInterface _this) {
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

	public static final Object[] pattern_AnonymousClassTypeInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnonymousClassTypeInterface _this) {
		Object[] result_pattern_AnonymousClassTypeInterface_20_1_preparereturnvalue_binding = pattern_AnonymousClassTypeInterface_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClassTypeInterface_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnonymousClassTypeInterface_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClassTypeInterface_20_1_preparereturnvalue_black = pattern_AnonymousClassTypeInterface_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnonymousClassTypeInterface_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnonymousClassTypeInterface_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnonymousClassTypeInterface_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnonymousClassTypeInterface_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_implements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTClass = _edge_implements.getSrc();
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			EObject tmpTParent = _edge_implements.getTrg();
			if (tmpTParent instanceof TInterface) {
				TInterface tParent = (TInterface) tmpTParent;
				if (tClass.getImplements().contains(tParent)) {
					_result.add(new Object[] { tClass, tParent, _edge_implements });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnonymousClassTypeInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			AnonymousClassTypeInterface _this, Match match, TClass tClass, TInterface tParent) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tClass, tParent);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnonymousClassTypeInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnonymousClassTypeInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnonymousClassTypeInterface_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_21_1_preparereturnvalue_bindingFB(
			AnonymousClassTypeInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnonymousClassTypeInterface _this) {
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

	public static final Object[] pattern_AnonymousClassTypeInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnonymousClassTypeInterface _this) {
		Object[] result_pattern_AnonymousClassTypeInterface_21_1_preparereturnvalue_binding = pattern_AnonymousClassTypeInterface_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClassTypeInterface_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnonymousClassTypeInterface_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClassTypeInterface_21_1_preparereturnvalue_black = pattern_AnonymousClassTypeInterface_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnonymousClassTypeInterface_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnonymousClassTypeInterface_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnonymousClassTypeInterface_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_0BB(
			TypeAccess mType, InterfaceDeclaration mParent) {
		for (AbstractTypeDeclaration __DEC_mType_superInterfaces_965809 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mParent.equals(__DEC_mType_superInterfaces_965809)) {
				return new Object[] { mType, mParent };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess mType) {
		for (Annotation __DEC_mType_type_722781 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, Annotation.class, "type")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_2B(
			TypeAccess mType) {
		for (AnnotationTypeMemberDeclaration __DEC_mType_type_888243 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess mType) {
		for (ArrayType __DEC_mType_elementType_92474 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, ArrayType.class, "elementType")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_4B(
			TypeAccess mType) {
		for (ClassDeclaration __DEC_mType_superClass_804425 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, ClassDeclaration.class, "superClass")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess mType) {
		for (MethodDeclaration __DEC_mType_returnType_650251 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, MethodDeclaration.class, "returnType")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess mType) {
		for (ParameterizedType __DEC_mType_type_100945 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, ParameterizedType.class, "type")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess mType) {
		for (TypeLiteral __DEC_mType_type_103723 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, TypeLiteral.class, "type")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_8B(
			TypeAccess mType) {
		for (AnnotationMemberValuePair __DEC_mType_value_417772 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_9BB(
			InterfaceDeclaration mParent, TypeAccess mType) {
		if (mParent.getSuperInterfaces().contains(mType)) {
			return new Object[] { mParent, mType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_blackFFFFB(
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
						Type tmpMParent = mType.getType();
						if (tmpMParent instanceof InterfaceDeclaration) {
							InterfaceDeclaration mParent = (InterfaceDeclaration) tmpMParent;
							if (pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_1B(
									mType) == null) {
								if (pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_2B(
										mType) == null) {
									if (pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_3B(
											mType) == null) {
										if (pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_4B(
												mType) == null) {
											if (pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_5B(
													mType) == null) {
												if (pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_6B(
														mType) == null) {
													if (pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_7B(
															mType) == null) {
														if (pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_8B(
																mType) == null) {
															if (pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_0BB(
																	mType, mParent) == null) {
																if (pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_black_nac_9BB(
																		mParent, mType) == null) {
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

		}

		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnonymousClassTypeInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			AnonymousClassTypeInterface _this, Match match, InterfaceDeclaration mParent,
			ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous, TypeAccess mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mParent, mCreation, mAnonymous, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnonymousClassTypeInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnonymousClassTypeInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnonymousClassTypeInterface_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_24_1_prepare_blackB(
			AnonymousClassTypeInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mParent");
		EObject _localVariable_1 = targetMatch.getObject("tClass");
		EObject _localVariable_2 = sourceMatch.getObject("mCreation");
		EObject _localVariable_3 = sourceMatch.getObject("mAnonymous");
		EObject _localVariable_4 = targetMatch.getObject("tParent");
		EObject _localVariable_5 = sourceMatch.getObject("mType");
		EObject tmpMParent = _localVariable_0;
		EObject tmpTClass = _localVariable_1;
		EObject tmpMCreation = _localVariable_2;
		EObject tmpMAnonymous = _localVariable_3;
		EObject tmpTParent = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		if (tmpMParent instanceof InterfaceDeclaration) {
			InterfaceDeclaration mParent = (InterfaceDeclaration) tmpMParent;
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (tmpMCreation instanceof ClassInstanceCreation) {
					ClassInstanceCreation mCreation = (ClassInstanceCreation) tmpMCreation;
					if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
						AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
						if (tmpTParent instanceof TInterface) {
							TInterface tParent = (TInterface) tmpTParent;
							if (tmpMType instanceof TypeAccess) {
								TypeAccess mType = (TypeAccess) tmpMType;
								return new Object[] { mParent, tClass, mCreation, mAnonymous, tParent, mType,
										sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_24_2_matchsrctrgcontext_blackBBBBBBBB(
			InterfaceDeclaration mParent, TClass tClass, ClassInstanceCreation mCreation,
			AnonymousClassDeclaration mAnonymous, TInterface tParent, TypeAccess mType, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { mParent, tClass, mCreation, mAnonymous, tParent, mType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnonymousClassTypeInterface_24_2_matchsrctrgcontext_binding = pattern_AnonymousClassTypeInterface_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_AnonymousClassTypeInterface_24_2_matchsrctrgcontext_binding != null) {
			InterfaceDeclaration mParent = (InterfaceDeclaration) result_pattern_AnonymousClassTypeInterface_24_2_matchsrctrgcontext_binding[0];
			TClass tClass = (TClass) result_pattern_AnonymousClassTypeInterface_24_2_matchsrctrgcontext_binding[1];
			ClassInstanceCreation mCreation = (ClassInstanceCreation) result_pattern_AnonymousClassTypeInterface_24_2_matchsrctrgcontext_binding[2];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_AnonymousClassTypeInterface_24_2_matchsrctrgcontext_binding[3];
			TInterface tParent = (TInterface) result_pattern_AnonymousClassTypeInterface_24_2_matchsrctrgcontext_binding[4];
			TypeAccess mType = (TypeAccess) result_pattern_AnonymousClassTypeInterface_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_AnonymousClassTypeInterface_24_2_matchsrctrgcontext_black = pattern_AnonymousClassTypeInterface_24_2_matchsrctrgcontext_blackBBBBBBBB(
					mParent, tClass, mCreation, mAnonymous, tParent, mType, sourceMatch, targetMatch);
			if (result_pattern_AnonymousClassTypeInterface_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mParent, tClass, mCreation, mAnonymous, tParent, mType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_24_3_solvecsp_bindingFBBBBBBBBB(
			AnonymousClassTypeInterface _this, InterfaceDeclaration mParent, TClass tClass,
			ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous, TInterface tParent, TypeAccess mType,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(mParent, tClass, mCreation, mAnonymous, tParent, mType,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, mParent, tClass, mCreation, mAnonymous, tParent, mType, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			AnonymousClassTypeInterface _this, InterfaceDeclaration mParent, TClass tClass,
			ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous, TInterface tParent, TypeAccess mType,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnonymousClassTypeInterface_24_3_solvecsp_binding = pattern_AnonymousClassTypeInterface_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, mParent, tClass, mCreation, mAnonymous, tParent, mType, sourceMatch, targetMatch);
		if (result_pattern_AnonymousClassTypeInterface_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassTypeInterface_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnonymousClassTypeInterface_24_3_solvecsp_black = pattern_AnonymousClassTypeInterface_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnonymousClassTypeInterface_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mParent, tClass, mCreation, mAnonymous, tParent, mType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassTypeInterface_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassTypeInterface_24_5_matchcorrcontext_blackBBFBBFBB(
			InterfaceDeclaration mParent, TClass tClass, AnonymousClassDeclaration mAnonymous, TInterface tParent,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType parentToParent : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tParent, TypeToTAbstractType.class, "target")) {
				if (mParent.equals(parentToParent.getSource())) {
					for (AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tClass, AnonymousClassDeclarationToTClass.class, "target")) {
						if (mAnonymous.equals(eAnonymousClassDeclarationToTClass.getSource())) {
							_result.add(new Object[] { mParent, tClass, parentToParent, mAnonymous, tParent,
									eAnonymousClassDeclarationToTClass, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType parentToParent, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnonymousClassTypeInterface";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(parentToParent);
		ccMatch.getAllContextElements().add(eAnonymousClassDeclarationToTClass);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { parentToParent, eAnonymousClassDeclarationToTClass, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_24_6_createcorrespondence_blackBBBBBBB(
			InterfaceDeclaration mParent, TClass tClass, ClassInstanceCreation mCreation,
			AnonymousClassDeclaration mAnonymous, TInterface tParent, TypeAccess mType, CCMatch ccMatch) {
		return new Object[] { mParent, tClass, mCreation, mAnonymous, tParent, mType, ccMatch };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnonymousClassTypeInterface";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClassTypeInterface_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_0BB(
			TypeAccess mType, InterfaceDeclaration mParent) {
		for (AbstractTypeDeclaration __DEC_mType_superInterfaces_952064 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mParent.equals(__DEC_mType_superInterfaces_952064)) {
				return new Object[] { mType, mParent };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_1B(
			TypeAccess mType) {
		for (Annotation __DEC_mType_type_705629 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, Annotation.class, "type")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_2B(
			TypeAccess mType) {
		for (AnnotationTypeMemberDeclaration __DEC_mType_type_92584 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_3B(
			TypeAccess mType) {
		for (ArrayType __DEC_mType_elementType_627984 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, ArrayType.class, "elementType")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_4B(
			TypeAccess mType) {
		for (ClassDeclaration __DEC_mType_superClass_488211 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, ClassDeclaration.class, "superClass")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_5B(
			TypeAccess mType) {
		for (MethodDeclaration __DEC_mType_returnType_39644 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, MethodDeclaration.class, "returnType")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_6B(
			TypeAccess mType) {
		for (ParameterizedType __DEC_mType_type_84181 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, ParameterizedType.class, "type")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_7B(
			TypeAccess mType) {
		for (TypeLiteral __DEC_mType_type_669699 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, TypeLiteral.class, "type")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_8B(
			TypeAccess mType) {
		for (AnnotationMemberValuePair __DEC_mType_value_907481 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_9BB(
			InterfaceDeclaration mParent, TypeAccess mType) {
		if (mParent.getSuperInterfaces().contains(mType)) {
			return new Object[] { mParent, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_blackBBBB(
			InterfaceDeclaration mParent, ClassInstanceCreation mCreation, AnonymousClassDeclaration mAnonymous,
			TypeAccess mType) {
		if (mType.equals(mCreation.getType())) {
			if (mCreation.equals(mAnonymous.getClassInstanceCreation())) {
				if (mParent.equals(mType.getType())) {
					if (pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_0BB(mType,
							mParent) == null) {
						if (pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_1B(mType) == null) {
							if (pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_2B(mType) == null) {
								if (pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_3B(
										mType) == null) {
									if (pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_4B(
											mType) == null) {
										if (pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_5B(
												mType) == null) {
											if (pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_6B(
													mType) == null) {
												if (pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_7B(
														mType) == null) {
													if (pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_8B(
															mType) == null) {
														if (pattern_AnonymousClassTypeInterface_27_1_matchtggpattern_black_nac_9BB(
																mParent, mType) == null) {
															return new Object[] { mParent, mCreation, mAnonymous,
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
		return null;
	}

	public static final boolean pattern_AnonymousClassTypeInterface_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClassTypeInterface_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_28_1_matchtggpattern_blackBB(TClass tClass,
			TInterface tParent) {
		if (tClass.getImplements().contains(tParent)) {
			return new Object[] { tClass, tParent };
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassTypeInterface_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClassTypeInterface_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_29_1_createresult_blackB(
			AnonymousClassTypeInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, InterfaceDeclaration mParent) {
		if (ruleResult.getSourceObjects().contains(mParent)) {
			return new Object[] { ruleResult, mParent };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType parentToParent) {
		if (ruleResult.getCorrObjects().contains(parentToParent)) {
			return new Object[] { ruleResult, parentToParent };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TInterface tParent) {
		if (ruleResult.getTargetObjects().contains(tParent)) {
			return new Object[] { ruleResult, tParent };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TClass tClass) {
		if (ruleResult.getTargetObjects().contains(tClass)) {
			return new Object[] { ruleResult, tClass };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {
		if (ruleResult.getCorrObjects().contains(eAnonymousClassDeclarationToTClass)) {
			return new Object[] { ruleResult, eAnonymousClassDeclarationToTClass };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclaration mAnonymous) {
		if (ruleResult.getSourceObjects().contains(mAnonymous)) {
			return new Object[] { ruleResult, mAnonymous };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, ClassInstanceCreation mCreation) {
		if (ruleResult.getSourceObjects().contains(mCreation)) {
			return new Object[] { ruleResult, mCreation };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassTypeInterface_29_2_isapplicablecore_blackFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList parentToParentList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList eAnonymousClassDeclarationToTClassList : ruleEntryContainer.getRuleEntryList()) {
				if (!eAnonymousClassDeclarationToTClassList.equals(parentToParentList)) {
					for (EObject tmpParentToParent : parentToParentList.getEntryObjects()) {
						if (tmpParentToParent instanceof TypeToTAbstractType) {
							TypeToTAbstractType parentToParent = (TypeToTAbstractType) tmpParentToParent;
							Type tmpMParent = parentToParent.getSource();
							if (tmpMParent instanceof InterfaceDeclaration) {
								InterfaceDeclaration mParent = (InterfaceDeclaration) tmpMParent;
								TAbstractType tmpTParent = parentToParent.getTarget();
								if (tmpTParent instanceof TInterface) {
									TInterface tParent = (TInterface) tmpTParent;
									if (pattern_AnonymousClassTypeInterface_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, parentToParent) == null) {
										if (pattern_AnonymousClassTypeInterface_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, mParent) == null) {
											if (pattern_AnonymousClassTypeInterface_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tParent) == null) {
												for (EObject tmpEAnonymousClassDeclarationToTClass : eAnonymousClassDeclarationToTClassList
														.getEntryObjects()) {
													if (tmpEAnonymousClassDeclarationToTClass instanceof AnonymousClassDeclarationToTClass) {
														AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) tmpEAnonymousClassDeclarationToTClass;
														TClass tClass = eAnonymousClassDeclarationToTClass.getTarget();
														if (tClass != null) {
															AnonymousClassDeclaration mAnonymous = eAnonymousClassDeclarationToTClass
																	.getSource();
															if (mAnonymous != null) {
																ClassInstanceCreation mCreation = mAnonymous
																		.getClassInstanceCreation();
																if (mCreation != null) {
																	if (pattern_AnonymousClassTypeInterface_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult,
																			eAnonymousClassDeclarationToTClass) == null) {
																		if (pattern_AnonymousClassTypeInterface_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, tClass) == null) {
																			if (pattern_AnonymousClassTypeInterface_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult, mAnonymous) == null) {
																				if (pattern_AnonymousClassTypeInterface_29_2_isapplicablecore_black_nac_6BB(
																						ruleResult,
																						mCreation) == null) {
																					_result.add(new Object[] {
																							parentToParentList, mParent,
																							parentToParent, tParent,
																							eAnonymousClassDeclarationToTClassList,
																							tClass,
																							eAnonymousClassDeclarationToTClass,
																							mAnonymous, mCreation,
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
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_29_3_solveCSP_bindingFBBBBBBBBBB(
			AnonymousClassTypeInterface _this, IsApplicableMatch isApplicableMatch, InterfaceDeclaration mParent,
			TClass tClass, ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent,
			AnonymousClassDeclaration mAnonymous, TInterface tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mParent, tClass, mCreation,
				parentToParent, mAnonymous, tParent, eAnonymousClassDeclarationToTClass, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mParent, tClass, mCreation, parentToParent, mAnonymous,
					tParent, eAnonymousClassDeclarationToTClass, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			AnonymousClassTypeInterface _this, IsApplicableMatch isApplicableMatch, InterfaceDeclaration mParent,
			TClass tClass, ClassInstanceCreation mCreation, TypeToTAbstractType parentToParent,
			AnonymousClassDeclaration mAnonymous, TInterface tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnonymousClassTypeInterface_29_3_solveCSP_binding = pattern_AnonymousClassTypeInterface_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass, ruleResult);
		if (result_pattern_AnonymousClassTypeInterface_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassTypeInterface_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClassTypeInterface_29_3_solveCSP_black = pattern_AnonymousClassTypeInterface_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClassTypeInterface_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mParent, tClass, mCreation, parentToParent,
						mAnonymous, tParent, eAnonymousClassDeclarationToTClass, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassTypeInterface_29_4_checkCSP_expressionFBB(
			AnonymousClassTypeInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_29_5_checknacs_blackBBBBBBB(
			InterfaceDeclaration mParent, TClass tClass, ClassInstanceCreation mCreation,
			TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous, TInterface tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {
		return new Object[] { mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_29_6_perform_blackBBBBBBBB(
			InterfaceDeclaration mParent, TClass tClass, ClassInstanceCreation mCreation,
			TypeToTAbstractType parentToParent, AnonymousClassDeclaration mAnonymous, TInterface tParent,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mParent, tClass, mCreation, parentToParent, mAnonymous, tParent,
				eAnonymousClassDeclarationToTClass, ruleResult };
	}

	public static final Object[] pattern_AnonymousClassTypeInterface_29_6_perform_greenBBBBFB(
			InterfaceDeclaration mParent, TClass tClass, ClassInstanceCreation mCreation, TInterface tParent,
			ModelgeneratorRuleResult ruleResult) {
		TypeAccess mType = JavaFactory.eINSTANCE.createTypeAccess();
		tClass.getImplements().add(tParent);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		mCreation.setType(mType);
		mType.setType(mParent);
		ruleResult.getSourceObjects().add(mType);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mParent, tClass, mCreation, tParent, mType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_AnonymousClassTypeInterface_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnonymousClassTypeInterfaceImpl
