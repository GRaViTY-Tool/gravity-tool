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
import org.eclipse.modisco.java.AnnotationTypeDeclaration;
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

import org.gravity.tgg.modisco.pm.AnnotationToTAnnotation;

import org.gravity.tgg.modisco.pm.Rules.AnnotationTypeAccessOnAnnotation;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;

import org.gravity.typegraph.basic.annotations.TAnnotation;
import org.gravity.typegraph.basic.annotations.TAnnotationType;

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
 * An implementation of the model object '<em><b>Annotation Type Access On Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotationTypeAccessOnAnnotationImpl extends AbstractRuleImpl implements AnnotationTypeAccessOnAnnotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeAccessOnAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnnotationTypeAccessOnAnnotation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation) {

		Object[] result1_black = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_0_1_initialbindings_blackBBBBBB(this, match, mAccess,
						mAnnotationType, mOwner, mAnnotation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mAccess] = " + mAccess + ", " + "[mAnnotationType] = "
					+ mAnnotationType + ", " + "[mOwner] = " + mOwner + ", " + "[mAnnotation] = " + mAnnotation + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, mAccess,
						mAnnotationType, mOwner, mAnnotation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mAccess] = " + mAccess + ", " + "[mAnnotationType] = "
					+ mAnnotationType + ", " + "[mOwner] = " + mOwner + ", " + "[mAnnotation] = " + mAnnotation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_0_4_collectelementstobetranslated_blackBBBBB(match,
							mAccess, mAnnotationType, mOwner, mAnnotation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mAccess] = " + mAccess + ", " + "[mAnnotationType] = " + mAnnotationType + ", "
						+ "[mOwner] = " + mOwner + ", " + "[mAnnotation] = " + mAnnotation + ".");
			}
			AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_0_4_collectelementstobetranslated_greenBBBBFFF(match,
							mAccess, mAnnotationType, mAnnotation);
			//nothing EMoflonEdge mAccess__mAnnotationType____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mAnnotationType__mAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge mAnnotation__mAccess____type = (EMoflonEdge) result4_green[6];

			Object[] result5_black = AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_0_5_collectcontextelements_blackBBBBB(match, mAccess,
							mAnnotationType, mOwner, mAnnotation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mAccess] = " + mAccess + ", " + "[mAnnotationType] = " + mAnnotationType + ", "
						+ "[mOwner] = " + mOwner + ", " + "[mAnnotation] = " + mAnnotation + ".");
			}
			AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_0_5_collectcontextelements_greenBBBBF(match,
							mAnnotationType, mOwner, mAnnotation);
			//nothing EMoflonEdge mOwner__mAnnotation____value = (EMoflonEdge) result5_green[4];

			// 
			AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
							mAccess, mAnnotationType, mOwner, mAnnotation);
			return AnnotationTypeAccessOnAnnotationImpl.pattern_AnnotationTypeAccessOnAnnotation_0_7_expressionF();
		} else {
			return AnnotationTypeAccessOnAnnotationImpl.pattern_AnnotationTypeAccessOnAnnotation_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TAnnotation tAnnotation = (TAnnotation) result1_bindingAndBlack[0];
		TypeAccess mAccess = (TypeAccess) result1_bindingAndBlack[1];
		AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result1_bindingAndBlack[2];
		AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result1_bindingAndBlack[3];
		TypeToTAbstractType AnnotationTypeToTAnnotationType = (TypeToTAbstractType) result1_bindingAndBlack[4];
		AnnotationMemberValuePair mOwner = (AnnotationMemberValuePair) result1_bindingAndBlack[5];
		Annotation mAnnotation = (Annotation) result1_bindingAndBlack[6];
		TAnnotationType tAnnotationType = (TAnnotationType) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		AnnotationTypeAccessOnAnnotationImpl.pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_greenBB(
				tAnnotation, tAnnotationType);

		Object[] result2_black = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_1_2_collecttranslatedelements_blackB(mAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mAccess] = " + mAccess + ".");
		}
		Object[] result2_green = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_1_2_collecttranslatedelements_greenFB(mAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_1_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult,
						tAnnotation, mAccess, mAnnotationType, AnnotationToTAnnotation, AnnotationTypeToTAnnotationType,
						mOwner, mAnnotation, tAnnotationType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[mAccess] = " + mAccess + ", "
					+ "[mAnnotationType] = " + mAnnotationType + ", " + "[AnnotationToTAnnotation] = "
					+ AnnotationToTAnnotation + ", " + "[AnnotationTypeToTAnnotationType] = "
					+ AnnotationTypeToTAnnotationType + ", " + "[mOwner] = " + mOwner + ", " + "[mAnnotation] = "
					+ mAnnotation + ", " + "[tAnnotationType] = " + tAnnotationType + ".");
		}
		AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
						tAnnotation, mAccess, mAnnotationType, mAnnotation, tAnnotationType);
		//nothing EMoflonEdge mAccess__mAnnotationType____type = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mAnnotationType__mAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mAnnotation__mAccess____type = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tAnnotationType__tAnnotation____annotations = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tAnnotation__tAnnotationType____type = (EMoflonEdge) result3_green[10];

		// 
		// 
		AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_1_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult,
						tAnnotation, mAccess, mAnnotationType, AnnotationToTAnnotation, AnnotationTypeToTAnnotationType,
						mOwner, mAnnotation, tAnnotationType);
		return AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeAccess mAccess = (TypeAccess) result2_binding[0];
		AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result2_binding[1];
		AnnotationMemberValuePair mOwner = (AnnotationMemberValuePair) result2_binding[2];
		Annotation mAnnotation = (Annotation) result2_binding[3];
		for (Object[] result2_black : AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_2_2_corematch_blackFBBFFBBFB(mAccess, mAnnotationType, mOwner,
						mAnnotation, match)) {
			TAnnotation tAnnotation = (TAnnotation) result2_black[0];
			AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result2_black[3];
			TypeToTAbstractType AnnotationTypeToTAnnotationType = (TypeToTAbstractType) result2_black[4];
			TAnnotationType tAnnotationType = (TAnnotationType) result2_black[7];
			// ForEach 
			for (Object[] result3_black : AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_2_3_findcontext_blackBBBBBBBB(tAnnotation, mAccess,
							mAnnotationType, AnnotationToTAnnotation, AnnotationTypeToTAnnotationType, mOwner,
							mAnnotation, tAnnotationType)) {
				Object[] result3_green = AnnotationTypeAccessOnAnnotationImpl
						.pattern_AnnotationTypeAccessOnAnnotation_2_3_findcontext_greenBBBBBBBBFFFFFFFFF(tAnnotation,
								mAccess, mAnnotationType, AnnotationToTAnnotation, AnnotationTypeToTAnnotationType,
								mOwner, mAnnotation, tAnnotationType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge mAccess__mAnnotationType____type = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mAnnotationType__mAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge AnnotationToTAnnotation__mAnnotation____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mOwner__mAnnotation____value = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge AnnotationToTAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge AnnotationTypeToTAnnotationType__tAnnotationType____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mAnnotation__mAccess____type = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge AnnotationTypeToTAnnotationType__mAnnotationType____source = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = AnnotationTypeAccessOnAnnotationImpl
						.pattern_AnnotationTypeAccessOnAnnotation_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, tAnnotation, mAccess, mAnnotationType, AnnotationToTAnnotation,
								AnnotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tAnnotation] = " + tAnnotation
							+ ", " + "[mAccess] = " + mAccess + ", " + "[mAnnotationType] = " + mAnnotationType + ", "
							+ "[AnnotationToTAnnotation] = " + AnnotationToTAnnotation + ", "
							+ "[AnnotationTypeToTAnnotationType] = " + AnnotationTypeToTAnnotationType + ", "
							+ "[mOwner] = " + mOwner + ", " + "[mAnnotation] = " + mAnnotation + ", "
							+ "[tAnnotationType] = " + tAnnotationType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationTypeAccessOnAnnotationImpl
						.pattern_AnnotationTypeAccessOnAnnotation_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationTypeAccessOnAnnotationImpl
							.pattern_AnnotationTypeAccessOnAnnotation_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationTypeAccessOnAnnotationImpl
							.pattern_AnnotationTypeAccessOnAnnotation_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation) {
		match.registerObject("mAccess", mAccess);
		match.registerObject("mAnnotationType", mAnnotationType);
		match.registerObject("mOwner", mOwner);
		match.registerObject("mAnnotation", mAnnotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TAnnotation tAnnotation,
			TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType,
			AnnotationToTAnnotation AnnotationToTAnnotation, TypeToTAbstractType AnnotationTypeToTAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation, TAnnotationType tAnnotationType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mAccess", mAccess);
		isApplicableMatch.registerObject("mAnnotationType", mAnnotationType);
		isApplicableMatch.registerObject("AnnotationToTAnnotation", AnnotationToTAnnotation);
		isApplicableMatch.registerObject("AnnotationTypeToTAnnotationType", AnnotationTypeToTAnnotationType);
		isApplicableMatch.registerObject("mOwner", mOwner);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("tAnnotationType", tAnnotationType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tAnnotation, EObject mAccess,
			EObject mAnnotationType, EObject AnnotationToTAnnotation, EObject AnnotationTypeToTAnnotationType,
			EObject mOwner, EObject mAnnotation, EObject tAnnotationType) {
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("mAccess", mAccess);
		ruleresult.registerObject("mAnnotationType", mAnnotationType);
		ruleresult.registerObject("AnnotationToTAnnotation", AnnotationToTAnnotation);
		ruleresult.registerObject("AnnotationTypeToTAnnotationType", AnnotationTypeToTAnnotationType);
		ruleresult.registerObject("mOwner", mOwner);
		ruleresult.registerObject("mAnnotation", mAnnotation);
		ruleresult.registerObject("tAnnotationType", tAnnotationType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mAccess").eClass())
				.equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TAnnotation tAnnotation, TAnnotationType tAnnotationType) {

		Object[] result1_black = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_10_1_initialbindings_blackBBBB(this, match, tAnnotation,
						tAnnotationType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tAnnotationType] = "
					+ tAnnotationType + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tAnnotation,
						tAnnotationType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tAnnotationType] = "
					+ tAnnotationType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_10_4_collectelementstobetranslated_blackBBB(match,
							tAnnotation, tAnnotationType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnnotation] = " + tAnnotation + ", " + "[tAnnotationType] = " + tAnnotationType + ".");
			}
			AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_10_4_collectelementstobetranslated_greenBBBFF(match,
							tAnnotation, tAnnotationType);
			//nothing EMoflonEdge tAnnotationType__tAnnotation____annotations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tAnnotation__tAnnotationType____type = (EMoflonEdge) result4_green[4];

			Object[] result5_black = AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_10_5_collectcontextelements_blackBBB(match, tAnnotation,
							tAnnotationType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnnotation] = " + tAnnotation + ", " + "[tAnnotationType] = " + tAnnotationType + ".");
			}
			AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_10_5_collectcontextelements_greenBBB(match, tAnnotation,
							tAnnotationType);

			// 
			AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_10_6_registerobjectstomatch_expressionBBBB(this, match,
							tAnnotation, tAnnotationType);
			return AnnotationTypeAccessOnAnnotationImpl.pattern_AnnotationTypeAccessOnAnnotation_10_7_expressionF();
		} else {
			return AnnotationTypeAccessOnAnnotationImpl.pattern_AnnotationTypeAccessOnAnnotation_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TAnnotation tAnnotation = (TAnnotation) result1_bindingAndBlack[0];
		AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result1_bindingAndBlack[1];
		AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result1_bindingAndBlack[2];
		TypeToTAbstractType AnnotationTypeToTAnnotationType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		AnnotationMemberValuePair mOwner = (AnnotationMemberValuePair) result1_bindingAndBlack[4];
		Annotation mAnnotation = (Annotation) result1_bindingAndBlack[5];
		TAnnotationType tAnnotationType = (TAnnotationType) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_greenFBB(mAnnotationType,
						mAnnotation);
		TypeAccess mAccess = (TypeAccess) result1_green[0];

		Object[] result2_black = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_11_2_collecttranslatedelements_blackB(mAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mAccess] = " + mAccess + ".");
		}
		Object[] result2_green = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_11_2_collecttranslatedelements_greenFB(mAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_11_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult,
						tAnnotation, mAccess, mAnnotationType, AnnotationToTAnnotation, AnnotationTypeToTAnnotationType,
						mOwner, mAnnotation, tAnnotationType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[mAccess] = " + mAccess + ", "
					+ "[mAnnotationType] = " + mAnnotationType + ", " + "[AnnotationToTAnnotation] = "
					+ AnnotationToTAnnotation + ", " + "[AnnotationTypeToTAnnotationType] = "
					+ AnnotationTypeToTAnnotationType + ", " + "[mOwner] = " + mOwner + ", " + "[mAnnotation] = "
					+ mAnnotation + ", " + "[tAnnotationType] = " + tAnnotationType + ".");
		}
		AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
						tAnnotation, mAccess, mAnnotationType, mAnnotation, tAnnotationType);
		//nothing EMoflonEdge mAccess__mAnnotationType____type = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mAnnotationType__mAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mAnnotation__mAccess____type = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tAnnotationType__tAnnotation____annotations = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tAnnotation__tAnnotationType____type = (EMoflonEdge) result3_green[10];

		// 
		// 
		AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_11_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult,
						tAnnotation, mAccess, mAnnotationType, AnnotationToTAnnotation, AnnotationTypeToTAnnotationType,
						mOwner, mAnnotation, tAnnotationType);
		return AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAnnotation tAnnotation = (TAnnotation) result2_binding[0];
		TAnnotationType tAnnotationType = (TAnnotationType) result2_binding[1];
		for (Object[] result2_black : AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_12_2_corematch_blackBFFFFBB(tAnnotation, tAnnotationType,
						match)) {
			AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result2_black[1];
			AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result2_black[2];
			TypeToTAbstractType AnnotationTypeToTAnnotationType = (TypeToTAbstractType) result2_black[3];
			Annotation mAnnotation = (Annotation) result2_black[4];
			// ForEach 
			for (Object[] result3_black : AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_12_3_findcontext_blackBBBBFBB(tAnnotation,
							mAnnotationType, AnnotationToTAnnotation, AnnotationTypeToTAnnotationType, mAnnotation,
							tAnnotationType)) {
				AnnotationMemberValuePair mOwner = (AnnotationMemberValuePair) result3_black[4];
				Object[] result3_green = AnnotationTypeAccessOnAnnotationImpl
						.pattern_AnnotationTypeAccessOnAnnotation_12_3_findcontext_greenBBBBBBBFFFFFFFF(tAnnotation,
								mAnnotationType, AnnotationToTAnnotation, AnnotationTypeToTAnnotationType, mOwner,
								mAnnotation, tAnnotationType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge AnnotationToTAnnotation__mAnnotation____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mOwner__mAnnotation____value = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge AnnotationToTAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge AnnotationTypeToTAnnotationType__tAnnotationType____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tAnnotationType__tAnnotation____annotations = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tAnnotation__tAnnotationType____type = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge AnnotationTypeToTAnnotationType__mAnnotationType____source = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = AnnotationTypeAccessOnAnnotationImpl
						.pattern_AnnotationTypeAccessOnAnnotation_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, tAnnotation, mAnnotationType, AnnotationToTAnnotation,
								AnnotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tAnnotation] = " + tAnnotation
							+ ", " + "[mAnnotationType] = " + mAnnotationType + ", " + "[AnnotationToTAnnotation] = "
							+ AnnotationToTAnnotation + ", " + "[AnnotationTypeToTAnnotationType] = "
							+ AnnotationTypeToTAnnotationType + ", " + "[mOwner] = " + mOwner + ", "
							+ "[mAnnotation] = " + mAnnotation + ", " + "[tAnnotationType] = " + tAnnotationType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationTypeAccessOnAnnotationImpl
						.pattern_AnnotationTypeAccessOnAnnotation_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationTypeAccessOnAnnotationImpl
							.pattern_AnnotationTypeAccessOnAnnotation_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationTypeAccessOnAnnotationImpl
							.pattern_AnnotationTypeAccessOnAnnotation_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAnnotation tAnnotation, TAnnotationType tAnnotationType) {
		match.registerObject("tAnnotation", tAnnotation);
		match.registerObject("tAnnotationType", tAnnotationType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAnnotation tAnnotation, TAnnotationType tAnnotationType) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAnnotation tAnnotation,
			AnnotationTypeDeclaration mAnnotationType, AnnotationToTAnnotation AnnotationToTAnnotation,
			TypeToTAbstractType AnnotationTypeToTAnnotationType, AnnotationMemberValuePair mOwner,
			Annotation mAnnotation, TAnnotationType tAnnotationType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mAnnotationType", mAnnotationType);
		isApplicableMatch.registerObject("AnnotationToTAnnotation", AnnotationToTAnnotation);
		isApplicableMatch.registerObject("AnnotationTypeToTAnnotationType", AnnotationTypeToTAnnotationType);
		isApplicableMatch.registerObject("mOwner", mOwner);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("tAnnotationType", tAnnotationType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tAnnotation, EObject mAccess,
			EObject mAnnotationType, EObject AnnotationToTAnnotation, EObject AnnotationTypeToTAnnotationType,
			EObject mOwner, EObject mAnnotation, EObject tAnnotationType) {
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("mAccess", mAccess);
		ruleresult.registerObject("mAnnotationType", mAnnotationType);
		ruleresult.registerObject("AnnotationToTAnnotation", AnnotationToTAnnotation);
		ruleresult.registerObject("AnnotationTypeToTAnnotationType", AnnotationTypeToTAnnotationType);
		ruleresult.registerObject("mOwner", mOwner);
		ruleresult.registerObject("mAnnotation", mAnnotation);
		ruleresult.registerObject("tAnnotationType", tAnnotationType);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_41(EMoflonEdge _edge_annotations) {

		Object[] result1_bindingAndBlack = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_20_2_testcorematchandDECs_blackFFB(_edge_annotations)) {
			TAnnotation tAnnotation = (TAnnotation) result2_black[0];
			TAnnotationType tAnnotationType = (TAnnotationType) result2_black[1];
			Object[] result2_green = AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tAnnotation, tAnnotationType)) {
				// 
				if (AnnotationTypeAccessOnAnnotationImpl
						.pattern_AnnotationTypeAccessOnAnnotation_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationTypeAccessOnAnnotationImpl
							.pattern_AnnotationTypeAccessOnAnnotation_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationTypeAccessOnAnnotationImpl
							.pattern_AnnotationTypeAccessOnAnnotation_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_42(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_blackFFFFB(_edge_type)) {
			TypeAccess mAccess = (TypeAccess) result2_black[0];
			AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result2_black[1];
			AnnotationMemberValuePair mOwner = (AnnotationMemberValuePair) result2_black[2];
			Annotation mAnnotation = (Annotation) result2_black[3];
			Object[] result2_green = AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, mAccess, mAnnotationType, mOwner, mAnnotation)) {
				// 
				if (AnnotationTypeAccessOnAnnotationImpl
						.pattern_AnnotationTypeAccessOnAnnotation_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationTypeAccessOnAnnotationImpl
							.pattern_AnnotationTypeAccessOnAnnotation_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationTypeAccessOnAnnotationImpl
							.pattern_AnnotationTypeAccessOnAnnotation_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnnotationTypeAccessOnAnnotation");
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
		ruleResult.setRule("AnnotationTypeAccessOnAnnotation");
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

		Object[] result1_black = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TAnnotation tAnnotation = (TAnnotation) result2_bindingAndBlack[0];
		TypeAccess mAccess = (TypeAccess) result2_bindingAndBlack[1];
		AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result2_bindingAndBlack[2];
		AnnotationMemberValuePair mOwner = (AnnotationMemberValuePair) result2_bindingAndBlack[3];
		Annotation mAnnotation = (Annotation) result2_bindingAndBlack[4];
		TAnnotationType tAnnotationType = (TAnnotationType) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tAnnotation,
						mAccess, mAnnotationType, mOwner, mAnnotation, tAnnotationType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tAnnotation] = " + tAnnotation + ", " + "[mAccess] = " + mAccess + ", " + "[mAnnotationType] = "
					+ mAnnotationType + ", " + "[mOwner] = " + mOwner + ", " + "[mAnnotation] = " + mAnnotation + ", "
					+ "[tAnnotationType] = " + tAnnotationType + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_24_5_matchcorrcontext_blackBBFFBBBB(tAnnotation,
							mAnnotationType, mAnnotation, tAnnotationType, sourceMatch, targetMatch)) {
				AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result5_black[2];
				TypeToTAbstractType AnnotationTypeToTAnnotationType = (TypeToTAbstractType) result5_black[3];
				Object[] result5_green = AnnotationTypeAccessOnAnnotationImpl
						.pattern_AnnotationTypeAccessOnAnnotation_24_5_matchcorrcontext_greenBBBBF(
								AnnotationToTAnnotation, AnnotationTypeToTAnnotationType, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = AnnotationTypeAccessOnAnnotationImpl
						.pattern_AnnotationTypeAccessOnAnnotation_24_6_createcorrespondence_blackBBBBBBB(tAnnotation,
								mAccess, mAnnotationType, mOwner, mAnnotation, tAnnotationType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnnotation] = "
							+ tAnnotation + ", " + "[mAccess] = " + mAccess + ", " + "[mAnnotationType] = "
							+ mAnnotationType + ", " + "[mOwner] = " + mOwner + ", " + "[mAnnotation] = " + mAnnotation
							+ ", " + "[tAnnotationType] = " + tAnnotationType + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = AnnotationTypeAccessOnAnnotationImpl
						.pattern_AnnotationTypeAccessOnAnnotation_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationTypeAccessOnAnnotationImpl
						.pattern_AnnotationTypeAccessOnAnnotation_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AnnotationTypeAccessOnAnnotationImpl.pattern_AnnotationTypeAccessOnAnnotation_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TAnnotation tAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType, AnnotationMemberValuePair mOwner, Annotation mAnnotation,
			TAnnotationType tAnnotationType, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation) {// 
		Object[] result1_black = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_blackBBBB(mAccess, mAnnotationType,
						mOwner, mAnnotation);
		if (result1_black != null) {
			return AnnotationTypeAccessOnAnnotationImpl.pattern_AnnotationTypeAccessOnAnnotation_27_2_expressionF();
		} else {
			return AnnotationTypeAccessOnAnnotationImpl.pattern_AnnotationTypeAccessOnAnnotation_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAnnotation tAnnotation, TAnnotationType tAnnotationType) {// 
		Object[] result1_black = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_28_1_matchtggpattern_blackBB(tAnnotation, tAnnotationType);
		if (result1_black != null) {
			return AnnotationTypeAccessOnAnnotationImpl.pattern_AnnotationTypeAccessOnAnnotation_28_2_expressionF();
		} else {
			return AnnotationTypeAccessOnAnnotationImpl.pattern_AnnotationTypeAccessOnAnnotation_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			AnnotationToTAnnotation AnnotationToTAnnotationParameter,
			TypeToTAbstractType AnnotationTypeToTAnnotationTypeParameter) {

		Object[] result1_black = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_29_2_isapplicablecore_blackFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList AnnotationToTAnnotationList = (RuleEntryList) result2_black[0];
			TAnnotation tAnnotation = (TAnnotation) result2_black[1];
			AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result2_black[2];
			Annotation mAnnotation = (Annotation) result2_black[3];
			AnnotationMemberValuePair mOwner = (AnnotationMemberValuePair) result2_black[4];
			//nothing RuleEntryList AnnotationTypeToTAnnotationTypeList = (RuleEntryList) result2_black[5];
			AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result2_black[6];
			TypeToTAbstractType AnnotationTypeToTAnnotationType = (TypeToTAbstractType) result2_black[7];
			TAnnotationType tAnnotationType = (TAnnotationType) result2_black[8];

			Object[] result3_bindingAndBlack = AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
							isApplicableMatch, tAnnotation, mAnnotationType, AnnotationToTAnnotation,
							AnnotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tAnnotation] = " + tAnnotation + ", "
						+ "[mAnnotationType] = " + mAnnotationType + ", " + "[AnnotationToTAnnotation] = "
						+ AnnotationToTAnnotation + ", " + "[AnnotationTypeToTAnnotationType] = "
						+ AnnotationTypeToTAnnotationType + ", " + "[mOwner] = " + mOwner + ", " + "[mAnnotation] = "
						+ mAnnotation + ", " + "[tAnnotationType] = " + tAnnotationType + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnnotationTypeAccessOnAnnotationImpl
					.pattern_AnnotationTypeAccessOnAnnotation_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnnotationTypeAccessOnAnnotationImpl
						.pattern_AnnotationTypeAccessOnAnnotation_29_5_checknacs_blackBBBBBBB(tAnnotation,
								mAnnotationType, AnnotationToTAnnotation, AnnotationTypeToTAnnotationType, mOwner,
								mAnnotation, tAnnotationType);
				if (result5_black != null) {

					Object[] result6_black = AnnotationTypeAccessOnAnnotationImpl
							.pattern_AnnotationTypeAccessOnAnnotation_29_6_perform_blackBBBBBBBB(tAnnotation,
									mAnnotationType, AnnotationToTAnnotation, AnnotationTypeToTAnnotationType, mOwner,
									mAnnotation, tAnnotationType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnnotation] = "
								+ tAnnotation + ", " + "[mAnnotationType] = " + mAnnotationType + ", "
								+ "[AnnotationToTAnnotation] = " + AnnotationToTAnnotation + ", "
								+ "[AnnotationTypeToTAnnotationType] = " + AnnotationTypeToTAnnotationType + ", "
								+ "[mOwner] = " + mOwner + ", " + "[mAnnotation] = " + mAnnotation + ", "
								+ "[tAnnotationType] = " + tAnnotationType + ", " + "[ruleResult] = " + ruleResult
								+ ".");
					}
					AnnotationTypeAccessOnAnnotationImpl
							.pattern_AnnotationTypeAccessOnAnnotation_29_6_perform_greenBFBBBB(tAnnotation,
									mAnnotationType, mAnnotation, tAnnotationType, ruleResult);
					//nothing TypeAccess mAccess = (TypeAccess) result6_green[1];

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeAccessOnAnnotationImpl
				.pattern_AnnotationTypeAccessOnAnnotation_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAnnotation tAnnotation,
			AnnotationTypeDeclaration mAnnotationType, AnnotationToTAnnotation AnnotationToTAnnotation,
			TypeToTAbstractType AnnotationTypeToTAnnotationType, AnnotationMemberValuePair mOwner,
			Annotation mAnnotation, TAnnotationType tAnnotationType, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mAnnotationType", mAnnotationType);
		isApplicableMatch.registerObject("AnnotationToTAnnotation", AnnotationToTAnnotation);
		isApplicableMatch.registerObject("AnnotationTypeToTAnnotationType", AnnotationTypeToTAnnotationType);
		isApplicableMatch.registerObject("mOwner", mOwner);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("tAnnotationType", tAnnotationType);
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
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___IS_APPROPRIATE_FWD__MATCH_TYPEACCESS_ANNOTATIONTYPEDECLARATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION:
			return isAppropriate_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (AnnotationMemberValuePair) arguments.get(3),
					(Annotation) arguments.get(4));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPEACCESS_ANNOTATIONTYPEDECLARATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (AnnotationMemberValuePair) arguments.get(3),
					(Annotation) arguments.get(4));
			return null;
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPEACCESS_ANNOTATIONTYPEDECLARATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (AnnotationMemberValuePair) arguments.get(3),
					(Annotation) arguments.get(4));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TANNOTATION_TYPEACCESS_ANNOTATIONTYPEDECLARATION_ANNOTATIONTOTANNOTATION_TYPETOTABSTRACTTYPE_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_TANNOTATIONTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TAnnotation) arguments.get(1),
					(TypeAccess) arguments.get(2), (AnnotationTypeDeclaration) arguments.get(3),
					(AnnotationToTAnnotation) arguments.get(4), (TypeToTAbstractType) arguments.get(5),
					(AnnotationMemberValuePair) arguments.get(6), (Annotation) arguments.get(7),
					(TAnnotationType) arguments.get(8));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___IS_APPROPRIATE_BWD__MATCH_TANNOTATION_TANNOTATIONTYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (TAnnotation) arguments.get(1),
					(TAnnotationType) arguments.get(2));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TANNOTATION_TANNOTATIONTYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAnnotation) arguments.get(1),
					(TAnnotationType) arguments.get(2));
			return null;
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TANNOTATION_TANNOTATIONTYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAnnotation) arguments.get(1),
					(TAnnotationType) arguments.get(2));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TANNOTATION_ANNOTATIONTYPEDECLARATION_ANNOTATIONTOTANNOTATION_TYPETOTABSTRACTTYPE_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_TANNOTATIONTYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAnnotation) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (AnnotationToTAnnotation) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (AnnotationMemberValuePair) arguments.get(5),
					(Annotation) arguments.get(6), (TAnnotationType) arguments.get(7));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_41__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_41((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_42__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_42((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___IS_APPLICABLE_SOLVE_CSP_CC__TANNOTATION_TYPEACCESS_ANNOTATIONTYPEDECLARATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_TANNOTATIONTYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TAnnotation) arguments.get(0), (TypeAccess) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (AnnotationMemberValuePair) arguments.get(3),
					(Annotation) arguments.get(4), (TAnnotationType) arguments.get(5), (Match) arguments.get(6),
					(Match) arguments.get(7));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___CHECK_DEC_FWD__TYPEACCESS_ANNOTATIONTYPEDECLARATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION:
			return checkDEC_FWD((TypeAccess) arguments.get(0), (AnnotationTypeDeclaration) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2), (Annotation) arguments.get(3));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___CHECK_DEC_BWD__TANNOTATION_TANNOTATIONTYPE:
			return checkDEC_BWD((TAnnotation) arguments.get(0), (TAnnotationType) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___GENERATE_MODEL__RULEENTRYCONTAINER_ANNOTATIONTOTANNOTATION_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (AnnotationToTAnnotation) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TANNOTATION_ANNOTATIONTYPEDECLARATION_ANNOTATIONTOTANNOTATION_TYPETOTABSTRACTTYPE_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION_TANNOTATIONTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAnnotation) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (AnnotationToTAnnotation) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (AnnotationMemberValuePair) arguments.get(5),
					(Annotation) arguments.get(6), (TAnnotationType) arguments.get(7),
					(ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.ANNOTATION_TYPE_ACCESS_ON_ANNOTATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_0_1_initialbindings_blackBBBBBB(
			AnnotationTypeAccessOnAnnotation _this, Match match, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType, AnnotationMemberValuePair mOwner, Annotation mAnnotation) {
		return new Object[] { _this, match, mAccess, mAnnotationType, mOwner, mAnnotation };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_0_2_SolveCSP_bindingFBBBBBB(
			AnnotationTypeAccessOnAnnotation _this, Match match, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType, AnnotationMemberValuePair mOwner, Annotation mAnnotation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mAccess, mAnnotationType, mOwner, mAnnotation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mAccess, mAnnotationType, mOwner, mAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			AnnotationTypeAccessOnAnnotation _this, Match match, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType, AnnotationMemberValuePair mOwner, Annotation mAnnotation) {
		Object[] result_pattern_AnnotationTypeAccessOnAnnotation_0_2_SolveCSP_binding = pattern_AnnotationTypeAccessOnAnnotation_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, mAccess, mAnnotationType, mOwner, mAnnotation);
		if (result_pattern_AnnotationTypeAccessOnAnnotation_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeAccessOnAnnotation_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeAccessOnAnnotation_0_2_SolveCSP_black = pattern_AnnotationTypeAccessOnAnnotation_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeAccessOnAnnotation_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mAccess, mAnnotationType, mOwner, mAnnotation };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_0_3_CheckCSP_expressionFBB(
			AnnotationTypeAccessOnAnnotation _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation) {
		return new Object[] { match, mAccess, mAnnotationType, mOwner, mAnnotation };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType, Annotation mAnnotation) {
		EMoflonEdge mAccess__mAnnotationType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationType__mAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__mAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mAccess);
		String mAccess__mAnnotationType____type_name_prime = "type";
		String mAnnotationType__mAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mAnnotation__mAccess____type_name_prime = "type";
		mAccess__mAnnotationType____type.setSrc(mAccess);
		mAccess__mAnnotationType____type.setTrg(mAnnotationType);
		match.getToBeTranslatedEdges().add(mAccess__mAnnotationType____type);
		mAnnotationType__mAccess____usagesInTypeAccess.setSrc(mAnnotationType);
		mAnnotationType__mAccess____usagesInTypeAccess.setTrg(mAccess);
		match.getToBeTranslatedEdges().add(mAnnotationType__mAccess____usagesInTypeAccess);
		mAnnotation__mAccess____type.setSrc(mAnnotation);
		mAnnotation__mAccess____type.setTrg(mAccess);
		match.getToBeTranslatedEdges().add(mAnnotation__mAccess____type);
		mAccess__mAnnotationType____type.setName(mAccess__mAnnotationType____type_name_prime);
		mAnnotationType__mAccess____usagesInTypeAccess
				.setName(mAnnotationType__mAccess____usagesInTypeAccess_name_prime);
		mAnnotation__mAccess____type.setName(mAnnotation__mAccess____type_name_prime);
		return new Object[] { match, mAccess, mAnnotationType, mAnnotation, mAccess__mAnnotationType____type,
				mAnnotationType__mAccess____usagesInTypeAccess, mAnnotation__mAccess____type };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_0_5_collectcontextelements_blackBBBBB(
			Match match, TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation) {
		return new Object[] { match, mAccess, mAnnotationType, mOwner, mAnnotation };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_0_5_collectcontextelements_greenBBBBF(
			Match match, AnnotationTypeDeclaration mAnnotationType, AnnotationMemberValuePair mOwner,
			Annotation mAnnotation) {
		EMoflonEdge mOwner__mAnnotation____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mAnnotationType);
		match.getContextNodes().add(mOwner);
		match.getContextNodes().add(mAnnotation);
		String mOwner__mAnnotation____value_name_prime = "value";
		mOwner__mAnnotation____value.setSrc(mOwner);
		mOwner__mAnnotation____value.setTrg(mAnnotation);
		match.getContextEdges().add(mOwner__mAnnotation____value);
		mOwner__mAnnotation____value.setName(mOwner__mAnnotation____value_name_prime);
		return new Object[] { match, mAnnotationType, mOwner, mAnnotation, mOwner__mAnnotation____value };
	}

	public static final void pattern_AnnotationTypeAccessOnAnnotation_0_6_registerobjectstomatch_expressionBBBBBB(
			AnnotationTypeAccessOnAnnotation _this, Match match, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType, AnnotationMemberValuePair mOwner, Annotation mAnnotation) {
		_this.registerObjectsToMatch_FWD(match, mAccess, mAnnotationType, mOwner, mAnnotation);

	}

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("mAccess");
		EObject _localVariable_2 = isApplicableMatch.getObject("mAnnotationType");
		EObject _localVariable_3 = isApplicableMatch.getObject("AnnotationToTAnnotation");
		EObject _localVariable_4 = isApplicableMatch.getObject("AnnotationTypeToTAnnotationType");
		EObject _localVariable_5 = isApplicableMatch.getObject("mOwner");
		EObject _localVariable_6 = isApplicableMatch.getObject("mAnnotation");
		EObject _localVariable_7 = isApplicableMatch.getObject("tAnnotationType");
		EObject tmpTAnnotation = _localVariable_0;
		EObject tmpMAccess = _localVariable_1;
		EObject tmpMAnnotationType = _localVariable_2;
		EObject tmpAnnotationToTAnnotation = _localVariable_3;
		EObject tmpAnnotationTypeToTAnnotationType = _localVariable_4;
		EObject tmpMOwner = _localVariable_5;
		EObject tmpMAnnotation = _localVariable_6;
		EObject tmpTAnnotationType = _localVariable_7;
		if (tmpTAnnotation instanceof TAnnotation) {
			TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
			if (tmpMAccess instanceof TypeAccess) {
				TypeAccess mAccess = (TypeAccess) tmpMAccess;
				if (tmpMAnnotationType instanceof AnnotationTypeDeclaration) {
					AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) tmpMAnnotationType;
					if (tmpAnnotationToTAnnotation instanceof AnnotationToTAnnotation) {
						AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) tmpAnnotationToTAnnotation;
						if (tmpAnnotationTypeToTAnnotationType instanceof TypeToTAbstractType) {
							TypeToTAbstractType annotationTypeToTAnnotationType = (TypeToTAbstractType) tmpAnnotationTypeToTAnnotationType;
							if (tmpMOwner instanceof AnnotationMemberValuePair) {
								AnnotationMemberValuePair mOwner = (AnnotationMemberValuePair) tmpMOwner;
								if (tmpMAnnotation instanceof Annotation) {
									Annotation mAnnotation = (Annotation) tmpMAnnotation;
									if (tmpTAnnotationType instanceof TAnnotationType) {
										TAnnotationType tAnnotationType = (TAnnotationType) tmpTAnnotationType;
										return new Object[] { tAnnotation, mAccess, mAnnotationType,
												annotationToTAnnotation, annotationTypeToTAnnotationType, mOwner,
												mAnnotation, tAnnotationType, isApplicableMatch };
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

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_blackBBBBBBBBFBB(
			TAnnotation tAnnotation, TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType,
			AnnotationToTAnnotation annotationToTAnnotation, TypeToTAbstractType annotationTypeToTAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation, TAnnotationType tAnnotationType,
			AnnotationTypeAccessOnAnnotation _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tAnnotation, mAccess, mAnnotationType, annotationToTAnnotation,
						annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			AnnotationTypeAccessOnAnnotation _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_binding = pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_binding != null) {
			TAnnotation tAnnotation = (TAnnotation) result_pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_binding[0];
			TypeAccess mAccess = (TypeAccess) result_pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_binding[1];
			AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_binding[2];
			AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result_pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_binding[3];
			TypeToTAbstractType annotationTypeToTAnnotationType = (TypeToTAbstractType) result_pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_binding[4];
			AnnotationMemberValuePair mOwner = (AnnotationMemberValuePair) result_pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_binding[5];
			Annotation mAnnotation = (Annotation) result_pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_binding[6];
			TAnnotationType tAnnotationType = (TAnnotationType) result_pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_binding[7];

			Object[] result_pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_black = pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_blackBBBBBBBBFBB(
					tAnnotation, mAccess, mAnnotationType, annotationToTAnnotation, annotationTypeToTAnnotationType,
					mOwner, mAnnotation, tAnnotationType, _this, isApplicableMatch);
			if (result_pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_black[8];

				return new Object[] { tAnnotation, mAccess, mAnnotationType, annotationToTAnnotation,
						annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_1_1_performtransformation_greenBB(
			TAnnotation tAnnotation, TAnnotationType tAnnotationType) {
		tAnnotationType.getAnnotations().add(tAnnotation);
		return new Object[] { tAnnotation, tAnnotationType };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_1_2_collecttranslatedelements_blackB(
			TypeAccess mAccess) {
		return new Object[] { mAccess };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_1_2_collecttranslatedelements_greenFB(
			TypeAccess mAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mAccess);
		return new Object[] { ruleresult, mAccess };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tAnnotation, EObject mAccess, EObject mAnnotationType,
			EObject annotationToTAnnotation, EObject annotationTypeToTAnnotationType, EObject mOwner,
			EObject mAnnotation, EObject tAnnotationType) {
		if (!tAnnotation.equals(tAnnotationType)) {
			if (!mAccess.equals(tAnnotation)) {
				if (!mAccess.equals(mAnnotationType)) {
					if (!mAccess.equals(mOwner)) {
						if (!mAccess.equals(mAnnotation)) {
							if (!mAccess.equals(tAnnotationType)) {
								if (!mAnnotationType.equals(tAnnotation)) {
									if (!mAnnotationType.equals(mOwner)) {
										if (!mAnnotationType.equals(tAnnotationType)) {
											if (!annotationToTAnnotation.equals(tAnnotation)) {
												if (!annotationToTAnnotation.equals(mAccess)) {
													if (!annotationToTAnnotation.equals(mAnnotationType)) {
														if (!annotationToTAnnotation
																.equals(annotationTypeToTAnnotationType)) {
															if (!annotationToTAnnotation.equals(mOwner)) {
																if (!annotationToTAnnotation.equals(mAnnotation)) {
																	if (!annotationToTAnnotation
																			.equals(tAnnotationType)) {
																		if (!annotationTypeToTAnnotationType
																				.equals(tAnnotation)) {
																			if (!annotationTypeToTAnnotationType
																					.equals(mAccess)) {
																				if (!annotationTypeToTAnnotationType
																						.equals(mAnnotationType)) {
																					if (!annotationTypeToTAnnotationType
																							.equals(mOwner)) {
																						if (!annotationTypeToTAnnotationType
																								.equals(mAnnotation)) {
																							if (!annotationTypeToTAnnotationType
																									.equals(tAnnotationType)) {
																								if (!mOwner.equals(
																										tAnnotation)) {
																									if (!mOwner.equals(
																											tAnnotationType)) {
																										if (!mAnnotation
																												.equals(tAnnotation)) {
																											if (!mAnnotation
																													.equals(mAnnotationType)) {
																												if (!mAnnotation
																														.equals(mOwner)) {
																													if (!mAnnotation
																															.equals(tAnnotationType)) {
																														return new Object[] {
																																ruleresult,
																																tAnnotation,
																																mAccess,
																																mAnnotationType,
																																annotationToTAnnotation,
																																annotationTypeToTAnnotationType,
																																mOwner,
																																mAnnotation,
																																tAnnotationType };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tAnnotation, EObject mAccess, EObject mAnnotationType,
			EObject mAnnotation, EObject tAnnotationType) {
		EMoflonEdge mAccess__mAnnotationType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationType__mAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__mAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationType__tAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotationType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeAccessOnAnnotation";
		String mAccess__mAnnotationType____type_name_prime = "type";
		String mAnnotationType__mAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mAnnotation__mAccess____type_name_prime = "type";
		String tAnnotationType__tAnnotation____annotations_name_prime = "annotations";
		String tAnnotation__tAnnotationType____type_name_prime = "type";
		mAccess__mAnnotationType____type.setSrc(mAccess);
		mAccess__mAnnotationType____type.setTrg(mAnnotationType);
		ruleresult.getTranslatedEdges().add(mAccess__mAnnotationType____type);
		mAnnotationType__mAccess____usagesInTypeAccess.setSrc(mAnnotationType);
		mAnnotationType__mAccess____usagesInTypeAccess.setTrg(mAccess);
		ruleresult.getTranslatedEdges().add(mAnnotationType__mAccess____usagesInTypeAccess);
		mAnnotation__mAccess____type.setSrc(mAnnotation);
		mAnnotation__mAccess____type.setTrg(mAccess);
		ruleresult.getTranslatedEdges().add(mAnnotation__mAccess____type);
		tAnnotationType__tAnnotation____annotations.setSrc(tAnnotationType);
		tAnnotationType__tAnnotation____annotations.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(tAnnotationType__tAnnotation____annotations);
		tAnnotation__tAnnotationType____type.setSrc(tAnnotation);
		tAnnotation__tAnnotationType____type.setTrg(tAnnotationType);
		ruleresult.getCreatedEdges().add(tAnnotation__tAnnotationType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mAccess__mAnnotationType____type.setName(mAccess__mAnnotationType____type_name_prime);
		mAnnotationType__mAccess____usagesInTypeAccess
				.setName(mAnnotationType__mAccess____usagesInTypeAccess_name_prime);
		mAnnotation__mAccess____type.setName(mAnnotation__mAccess____type_name_prime);
		tAnnotationType__tAnnotation____annotations.setName(tAnnotationType__tAnnotation____annotations_name_prime);
		tAnnotation__tAnnotationType____type.setName(tAnnotation__tAnnotationType____type_name_prime);
		return new Object[] { ruleresult, tAnnotation, mAccess, mAnnotationType, mAnnotation, tAnnotationType,
				mAccess__mAnnotationType____type, mAnnotationType__mAccess____usagesInTypeAccess,
				mAnnotation__mAccess____type, tAnnotationType__tAnnotation____annotations,
				tAnnotation__tAnnotationType____type };
	}

	public static final void pattern_AnnotationTypeAccessOnAnnotation_1_5_registerobjects_expressionBBBBBBBBBB(
			AnnotationTypeAccessOnAnnotation _this, PerformRuleResult ruleresult, EObject tAnnotation, EObject mAccess,
			EObject mAnnotationType, EObject annotationToTAnnotation, EObject annotationTypeToTAnnotationType,
			EObject mOwner, EObject mAnnotation, EObject tAnnotationType) {
		_this.registerObjects_FWD(ruleresult, tAnnotation, mAccess, mAnnotationType, annotationToTAnnotation,
				annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType);

	}

	public static final PerformRuleResult pattern_AnnotationTypeAccessOnAnnotation_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_2_1_preparereturnvalue_bindingFB(
			AnnotationTypeAccessOnAnnotation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationTypeAccessOnAnnotation _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationTypeAccessOnAnnotation _this) {
		Object[] result_pattern_AnnotationTypeAccessOnAnnotation_2_1_preparereturnvalue_binding = pattern_AnnotationTypeAccessOnAnnotation_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeAccessOnAnnotation_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationTypeAccessOnAnnotation_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeAccessOnAnnotation_2_1_preparereturnvalue_black = pattern_AnnotationTypeAccessOnAnnotation_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationTypeAccessOnAnnotation_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationTypeAccessOnAnnotation_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationTypeAccessOnAnnotation";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mAccess");
		EObject _localVariable_1 = match.getObject("mAnnotationType");
		EObject _localVariable_2 = match.getObject("mOwner");
		EObject _localVariable_3 = match.getObject("mAnnotation");
		EObject tmpMAccess = _localVariable_0;
		EObject tmpMAnnotationType = _localVariable_1;
		EObject tmpMOwner = _localVariable_2;
		EObject tmpMAnnotation = _localVariable_3;
		if (tmpMAccess instanceof TypeAccess) {
			TypeAccess mAccess = (TypeAccess) tmpMAccess;
			if (tmpMAnnotationType instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) tmpMAnnotationType;
				if (tmpMOwner instanceof AnnotationMemberValuePair) {
					AnnotationMemberValuePair mOwner = (AnnotationMemberValuePair) tmpMOwner;
					if (tmpMAnnotation instanceof Annotation) {
						Annotation mAnnotation = (Annotation) tmpMAnnotation;
						return new Object[] { mAccess, mAnnotationType, mOwner, mAnnotation, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeAccessOnAnnotation_2_2_corematch_blackFBBFFBBFB(
			TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType, AnnotationMemberValuePair mOwner,
			Annotation mAnnotation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnnotationToTAnnotation annotationToTAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAnnotation, AnnotationToTAnnotation.class, "source")) {
			TAnnotation tAnnotation = annotationToTAnnotation.getTarget();
			if (tAnnotation != null) {
				for (TypeToTAbstractType annotationTypeToTAnnotationType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mAnnotationType, TypeToTAbstractType.class, "source")) {
					TAbstractType tmpTAnnotationType = annotationTypeToTAnnotationType.getTarget();
					if (tmpTAnnotationType instanceof TAnnotationType) {
						TAnnotationType tAnnotationType = (TAnnotationType) tmpTAnnotationType;
						_result.add(new Object[] { tAnnotation, mAccess, mAnnotationType, annotationToTAnnotation,
								annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeAccessOnAnnotation_2_3_findcontext_blackBBBBBBBB(
			TAnnotation tAnnotation, TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType,
			AnnotationToTAnnotation annotationToTAnnotation, TypeToTAbstractType annotationTypeToTAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation, TAnnotationType tAnnotationType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mAnnotationType.equals(mAccess.getType())) {
			if (mAnnotation.equals(annotationToTAnnotation.getSource())) {
				if (mAnnotation.equals(mOwner.getValue())) {
					if (tAnnotation.equals(annotationToTAnnotation.getTarget())) {
						if (tAnnotationType.equals(annotationTypeToTAnnotationType.getTarget())) {
							if (mAccess.equals(mAnnotation.getType())) {
								if (mAnnotationType.equals(annotationTypeToTAnnotationType.getSource())) {
									_result.add(new Object[] { tAnnotation, mAccess, mAnnotationType,
											annotationToTAnnotation, annotationTypeToTAnnotationType, mOwner,
											mAnnotation, tAnnotationType });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_2_3_findcontext_greenBBBBBBBBFFFFFFFFF(
			TAnnotation tAnnotation, TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType,
			AnnotationToTAnnotation annotationToTAnnotation, TypeToTAbstractType annotationTypeToTAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation, TAnnotationType tAnnotationType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mAccess__mAnnotationType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationType__mAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationToTAnnotation__mAnnotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOwner__mAnnotation____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationToTAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationTypeToTAnnotationType__tAnnotationType____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mAnnotation__mAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationTypeToTAnnotationType__mAnnotationType____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String mAccess__mAnnotationType____type_name_prime = "type";
		String mAnnotationType__mAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String annotationToTAnnotation__mAnnotation____source_name_prime = "source";
		String mOwner__mAnnotation____value_name_prime = "value";
		String annotationToTAnnotation__tAnnotation____target_name_prime = "target";
		String annotationTypeToTAnnotationType__tAnnotationType____target_name_prime = "target";
		String mAnnotation__mAccess____type_name_prime = "type";
		String annotationTypeToTAnnotationType__mAnnotationType____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mAccess);
		isApplicableMatch.getAllContextElements().add(mAnnotationType);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationTypeToTAnnotationType);
		isApplicableMatch.getAllContextElements().add(mOwner);
		isApplicableMatch.getAllContextElements().add(mAnnotation);
		isApplicableMatch.getAllContextElements().add(tAnnotationType);
		mAccess__mAnnotationType____type.setSrc(mAccess);
		mAccess__mAnnotationType____type.setTrg(mAnnotationType);
		isApplicableMatch.getAllContextElements().add(mAccess__mAnnotationType____type);
		mAnnotationType__mAccess____usagesInTypeAccess.setSrc(mAnnotationType);
		mAnnotationType__mAccess____usagesInTypeAccess.setTrg(mAccess);
		isApplicableMatch.getAllContextElements().add(mAnnotationType__mAccess____usagesInTypeAccess);
		annotationToTAnnotation__mAnnotation____source.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__mAnnotation____source.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation__mAnnotation____source);
		mOwner__mAnnotation____value.setSrc(mOwner);
		mOwner__mAnnotation____value.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mOwner__mAnnotation____value);
		annotationToTAnnotation__tAnnotation____target.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation__tAnnotation____target);
		annotationTypeToTAnnotationType__tAnnotationType____target.setSrc(annotationTypeToTAnnotationType);
		annotationTypeToTAnnotationType__tAnnotationType____target.setTrg(tAnnotationType);
		isApplicableMatch.getAllContextElements().add(annotationTypeToTAnnotationType__tAnnotationType____target);
		mAnnotation__mAccess____type.setSrc(mAnnotation);
		mAnnotation__mAccess____type.setTrg(mAccess);
		isApplicableMatch.getAllContextElements().add(mAnnotation__mAccess____type);
		annotationTypeToTAnnotationType__mAnnotationType____source.setSrc(annotationTypeToTAnnotationType);
		annotationTypeToTAnnotationType__mAnnotationType____source.setTrg(mAnnotationType);
		isApplicableMatch.getAllContextElements().add(annotationTypeToTAnnotationType__mAnnotationType____source);
		mAccess__mAnnotationType____type.setName(mAccess__mAnnotationType____type_name_prime);
		mAnnotationType__mAccess____usagesInTypeAccess
				.setName(mAnnotationType__mAccess____usagesInTypeAccess_name_prime);
		annotationToTAnnotation__mAnnotation____source
				.setName(annotationToTAnnotation__mAnnotation____source_name_prime);
		mOwner__mAnnotation____value.setName(mOwner__mAnnotation____value_name_prime);
		annotationToTAnnotation__tAnnotation____target
				.setName(annotationToTAnnotation__tAnnotation____target_name_prime);
		annotationTypeToTAnnotationType__tAnnotationType____target
				.setName(annotationTypeToTAnnotationType__tAnnotationType____target_name_prime);
		mAnnotation__mAccess____type.setName(mAnnotation__mAccess____type_name_prime);
		annotationTypeToTAnnotationType__mAnnotationType____source
				.setName(annotationTypeToTAnnotationType__mAnnotationType____source_name_prime);
		return new Object[] { tAnnotation, mAccess, mAnnotationType, annotationToTAnnotation,
				annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType, isApplicableMatch,
				mAccess__mAnnotationType____type, mAnnotationType__mAccess____usagesInTypeAccess,
				annotationToTAnnotation__mAnnotation____source, mOwner__mAnnotation____value,
				annotationToTAnnotation__tAnnotation____target,
				annotationTypeToTAnnotationType__tAnnotationType____target, mAnnotation__mAccess____type,
				annotationTypeToTAnnotationType__mAnnotationType____source };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_2_4_solveCSP_bindingFBBBBBBBBBB(
			AnnotationTypeAccessOnAnnotation _this, IsApplicableMatch isApplicableMatch, TAnnotation tAnnotation,
			TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType,
			AnnotationToTAnnotation annotationToTAnnotation, TypeToTAbstractType annotationTypeToTAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation, TAnnotationType tAnnotationType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tAnnotation, mAccess, mAnnotationType,
				annotationToTAnnotation, annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAnnotation, mAccess, mAnnotationType,
					annotationToTAnnotation, annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			AnnotationTypeAccessOnAnnotation _this, IsApplicableMatch isApplicableMatch, TAnnotation tAnnotation,
			TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType,
			AnnotationToTAnnotation annotationToTAnnotation, TypeToTAbstractType annotationTypeToTAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation, TAnnotationType tAnnotationType) {
		Object[] result_pattern_AnnotationTypeAccessOnAnnotation_2_4_solveCSP_binding = pattern_AnnotationTypeAccessOnAnnotation_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, tAnnotation, mAccess, mAnnotationType, annotationToTAnnotation,
				annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType);
		if (result_pattern_AnnotationTypeAccessOnAnnotation_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeAccessOnAnnotation_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeAccessOnAnnotation_2_4_solveCSP_black = pattern_AnnotationTypeAccessOnAnnotation_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeAccessOnAnnotation_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAnnotation, mAccess, mAnnotationType,
						annotationToTAnnotation, annotationTypeToTAnnotationType, mOwner, mAnnotation,
						tAnnotationType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_2_5_checkCSP_expressionFBB(
			AnnotationTypeAccessOnAnnotation _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationTypeAccessOnAnnotation";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeAccessOnAnnotation_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_10_1_initialbindings_blackBBBB(
			AnnotationTypeAccessOnAnnotation _this, Match match, TAnnotation tAnnotation,
			TAnnotationType tAnnotationType) {
		return new Object[] { _this, match, tAnnotation, tAnnotationType };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_10_2_SolveCSP_bindingFBBBB(
			AnnotationTypeAccessOnAnnotation _this, Match match, TAnnotation tAnnotation,
			TAnnotationType tAnnotationType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAnnotation, tAnnotationType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAnnotation, tAnnotationType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_10_2_SolveCSP_bindingAndBlackFBBBB(
			AnnotationTypeAccessOnAnnotation _this, Match match, TAnnotation tAnnotation,
			TAnnotationType tAnnotationType) {
		Object[] result_pattern_AnnotationTypeAccessOnAnnotation_10_2_SolveCSP_binding = pattern_AnnotationTypeAccessOnAnnotation_10_2_SolveCSP_bindingFBBBB(
				_this, match, tAnnotation, tAnnotationType);
		if (result_pattern_AnnotationTypeAccessOnAnnotation_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeAccessOnAnnotation_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeAccessOnAnnotation_10_2_SolveCSP_black = pattern_AnnotationTypeAccessOnAnnotation_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeAccessOnAnnotation_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAnnotation, tAnnotationType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_10_3_CheckCSP_expressionFBB(
			AnnotationTypeAccessOnAnnotation _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_10_4_collectelementstobetranslated_blackBBB(
			Match match, TAnnotation tAnnotation, TAnnotationType tAnnotationType) {
		return new Object[] { match, tAnnotation, tAnnotationType };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, TAnnotation tAnnotation, TAnnotationType tAnnotationType) {
		EMoflonEdge tAnnotationType__tAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotationType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tAnnotationType__tAnnotation____annotations_name_prime = "annotations";
		String tAnnotation__tAnnotationType____type_name_prime = "type";
		tAnnotationType__tAnnotation____annotations.setSrc(tAnnotationType);
		tAnnotationType__tAnnotation____annotations.setTrg(tAnnotation);
		match.getToBeTranslatedEdges().add(tAnnotationType__tAnnotation____annotations);
		tAnnotation__tAnnotationType____type.setSrc(tAnnotation);
		tAnnotation__tAnnotationType____type.setTrg(tAnnotationType);
		match.getToBeTranslatedEdges().add(tAnnotation__tAnnotationType____type);
		tAnnotationType__tAnnotation____annotations.setName(tAnnotationType__tAnnotation____annotations_name_prime);
		tAnnotation__tAnnotationType____type.setName(tAnnotation__tAnnotationType____type_name_prime);
		return new Object[] { match, tAnnotation, tAnnotationType, tAnnotationType__tAnnotation____annotations,
				tAnnotation__tAnnotationType____type };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_10_5_collectcontextelements_blackBBB(
			Match match, TAnnotation tAnnotation, TAnnotationType tAnnotationType) {
		return new Object[] { match, tAnnotation, tAnnotationType };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_10_5_collectcontextelements_greenBBB(
			Match match, TAnnotation tAnnotation, TAnnotationType tAnnotationType) {
		match.getContextNodes().add(tAnnotation);
		match.getContextNodes().add(tAnnotationType);
		return new Object[] { match, tAnnotation, tAnnotationType };
	}

	public static final void pattern_AnnotationTypeAccessOnAnnotation_10_6_registerobjectstomatch_expressionBBBB(
			AnnotationTypeAccessOnAnnotation _this, Match match, TAnnotation tAnnotation,
			TAnnotationType tAnnotationType) {
		_this.registerObjectsToMatch_BWD(match, tAnnotation, tAnnotationType);

	}

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("mAnnotationType");
		EObject _localVariable_2 = isApplicableMatch.getObject("AnnotationToTAnnotation");
		EObject _localVariable_3 = isApplicableMatch.getObject("AnnotationTypeToTAnnotationType");
		EObject _localVariable_4 = isApplicableMatch.getObject("mOwner");
		EObject _localVariable_5 = isApplicableMatch.getObject("mAnnotation");
		EObject _localVariable_6 = isApplicableMatch.getObject("tAnnotationType");
		EObject tmpTAnnotation = _localVariable_0;
		EObject tmpMAnnotationType = _localVariable_1;
		EObject tmpAnnotationToTAnnotation = _localVariable_2;
		EObject tmpAnnotationTypeToTAnnotationType = _localVariable_3;
		EObject tmpMOwner = _localVariable_4;
		EObject tmpMAnnotation = _localVariable_5;
		EObject tmpTAnnotationType = _localVariable_6;
		if (tmpTAnnotation instanceof TAnnotation) {
			TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
			if (tmpMAnnotationType instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) tmpMAnnotationType;
				if (tmpAnnotationToTAnnotation instanceof AnnotationToTAnnotation) {
					AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) tmpAnnotationToTAnnotation;
					if (tmpAnnotationTypeToTAnnotationType instanceof TypeToTAbstractType) {
						TypeToTAbstractType annotationTypeToTAnnotationType = (TypeToTAbstractType) tmpAnnotationTypeToTAnnotationType;
						if (tmpMOwner instanceof AnnotationMemberValuePair) {
							AnnotationMemberValuePair mOwner = (AnnotationMemberValuePair) tmpMOwner;
							if (tmpMAnnotation instanceof Annotation) {
								Annotation mAnnotation = (Annotation) tmpMAnnotation;
								if (tmpTAnnotationType instanceof TAnnotationType) {
									TAnnotationType tAnnotationType = (TAnnotationType) tmpTAnnotationType;
									return new Object[] { tAnnotation, mAnnotationType, annotationToTAnnotation,
											annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType,
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

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_blackBBBBBBBFBB(
			TAnnotation tAnnotation, AnnotationTypeDeclaration mAnnotationType,
			AnnotationToTAnnotation annotationToTAnnotation, TypeToTAbstractType annotationTypeToTAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation, TAnnotationType tAnnotationType,
			AnnotationTypeAccessOnAnnotation _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tAnnotation, mAnnotationType, annotationToTAnnotation,
						annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			AnnotationTypeAccessOnAnnotation _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_binding = pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_binding != null) {
			TAnnotation tAnnotation = (TAnnotation) result_pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_binding[0];
			AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_binding[1];
			AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) result_pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_binding[2];
			TypeToTAbstractType annotationTypeToTAnnotationType = (TypeToTAbstractType) result_pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_binding[3];
			AnnotationMemberValuePair mOwner = (AnnotationMemberValuePair) result_pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_binding[4];
			Annotation mAnnotation = (Annotation) result_pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_binding[5];
			TAnnotationType tAnnotationType = (TAnnotationType) result_pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_binding[6];

			Object[] result_pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_black = pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_blackBBBBBBBFBB(
					tAnnotation, mAnnotationType, annotationToTAnnotation, annotationTypeToTAnnotationType, mOwner,
					mAnnotation, tAnnotationType, _this, isApplicableMatch);
			if (result_pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_black[7];

				return new Object[] { tAnnotation, mAnnotationType, annotationToTAnnotation,
						annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_11_1_performtransformation_greenFBB(
			AnnotationTypeDeclaration mAnnotationType, Annotation mAnnotation) {
		TypeAccess mAccess = JavaFactory.eINSTANCE.createTypeAccess();
		mAccess.setType(mAnnotationType);
		mAnnotation.setType(mAccess);
		return new Object[] { mAccess, mAnnotationType, mAnnotation };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_11_2_collecttranslatedelements_blackB(
			TypeAccess mAccess) {
		return new Object[] { mAccess };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_11_2_collecttranslatedelements_greenFB(
			TypeAccess mAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mAccess);
		return new Object[] { ruleresult, mAccess };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_11_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tAnnotation, EObject mAccess, EObject mAnnotationType,
			EObject annotationToTAnnotation, EObject annotationTypeToTAnnotationType, EObject mOwner,
			EObject mAnnotation, EObject tAnnotationType) {
		if (!tAnnotation.equals(tAnnotationType)) {
			if (!mAccess.equals(tAnnotation)) {
				if (!mAccess.equals(mAnnotationType)) {
					if (!mAccess.equals(mOwner)) {
						if (!mAccess.equals(mAnnotation)) {
							if (!mAccess.equals(tAnnotationType)) {
								if (!mAnnotationType.equals(tAnnotation)) {
									if (!mAnnotationType.equals(mOwner)) {
										if (!mAnnotationType.equals(tAnnotationType)) {
											if (!annotationToTAnnotation.equals(tAnnotation)) {
												if (!annotationToTAnnotation.equals(mAccess)) {
													if (!annotationToTAnnotation.equals(mAnnotationType)) {
														if (!annotationToTAnnotation
																.equals(annotationTypeToTAnnotationType)) {
															if (!annotationToTAnnotation.equals(mOwner)) {
																if (!annotationToTAnnotation.equals(mAnnotation)) {
																	if (!annotationToTAnnotation
																			.equals(tAnnotationType)) {
																		if (!annotationTypeToTAnnotationType
																				.equals(tAnnotation)) {
																			if (!annotationTypeToTAnnotationType
																					.equals(mAccess)) {
																				if (!annotationTypeToTAnnotationType
																						.equals(mAnnotationType)) {
																					if (!annotationTypeToTAnnotationType
																							.equals(mOwner)) {
																						if (!annotationTypeToTAnnotationType
																								.equals(mAnnotation)) {
																							if (!annotationTypeToTAnnotationType
																									.equals(tAnnotationType)) {
																								if (!mOwner.equals(
																										tAnnotation)) {
																									if (!mOwner.equals(
																											tAnnotationType)) {
																										if (!mAnnotation
																												.equals(tAnnotation)) {
																											if (!mAnnotation
																													.equals(mAnnotationType)) {
																												if (!mAnnotation
																														.equals(mOwner)) {
																													if (!mAnnotation
																															.equals(tAnnotationType)) {
																														return new Object[] {
																																ruleresult,
																																tAnnotation,
																																mAccess,
																																mAnnotationType,
																																annotationToTAnnotation,
																																annotationTypeToTAnnotationType,
																																mOwner,
																																mAnnotation,
																																tAnnotationType };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tAnnotation, EObject mAccess, EObject mAnnotationType,
			EObject mAnnotation, EObject tAnnotationType) {
		EMoflonEdge mAccess__mAnnotationType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationType__mAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__mAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationType__tAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotationType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeAccessOnAnnotation";
		String mAccess__mAnnotationType____type_name_prime = "type";
		String mAnnotationType__mAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mAnnotation__mAccess____type_name_prime = "type";
		String tAnnotationType__tAnnotation____annotations_name_prime = "annotations";
		String tAnnotation__tAnnotationType____type_name_prime = "type";
		mAccess__mAnnotationType____type.setSrc(mAccess);
		mAccess__mAnnotationType____type.setTrg(mAnnotationType);
		ruleresult.getCreatedEdges().add(mAccess__mAnnotationType____type);
		mAnnotationType__mAccess____usagesInTypeAccess.setSrc(mAnnotationType);
		mAnnotationType__mAccess____usagesInTypeAccess.setTrg(mAccess);
		ruleresult.getCreatedEdges().add(mAnnotationType__mAccess____usagesInTypeAccess);
		mAnnotation__mAccess____type.setSrc(mAnnotation);
		mAnnotation__mAccess____type.setTrg(mAccess);
		ruleresult.getCreatedEdges().add(mAnnotation__mAccess____type);
		tAnnotationType__tAnnotation____annotations.setSrc(tAnnotationType);
		tAnnotationType__tAnnotation____annotations.setTrg(tAnnotation);
		ruleresult.getTranslatedEdges().add(tAnnotationType__tAnnotation____annotations);
		tAnnotation__tAnnotationType____type.setSrc(tAnnotation);
		tAnnotation__tAnnotationType____type.setTrg(tAnnotationType);
		ruleresult.getTranslatedEdges().add(tAnnotation__tAnnotationType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mAccess__mAnnotationType____type.setName(mAccess__mAnnotationType____type_name_prime);
		mAnnotationType__mAccess____usagesInTypeAccess
				.setName(mAnnotationType__mAccess____usagesInTypeAccess_name_prime);
		mAnnotation__mAccess____type.setName(mAnnotation__mAccess____type_name_prime);
		tAnnotationType__tAnnotation____annotations.setName(tAnnotationType__tAnnotation____annotations_name_prime);
		tAnnotation__tAnnotationType____type.setName(tAnnotation__tAnnotationType____type_name_prime);
		return new Object[] { ruleresult, tAnnotation, mAccess, mAnnotationType, mAnnotation, tAnnotationType,
				mAccess__mAnnotationType____type, mAnnotationType__mAccess____usagesInTypeAccess,
				mAnnotation__mAccess____type, tAnnotationType__tAnnotation____annotations,
				tAnnotation__tAnnotationType____type };
	}

	public static final void pattern_AnnotationTypeAccessOnAnnotation_11_5_registerobjects_expressionBBBBBBBBBB(
			AnnotationTypeAccessOnAnnotation _this, PerformRuleResult ruleresult, EObject tAnnotation, EObject mAccess,
			EObject mAnnotationType, EObject annotationToTAnnotation, EObject annotationTypeToTAnnotationType,
			EObject mOwner, EObject mAnnotation, EObject tAnnotationType) {
		_this.registerObjects_BWD(ruleresult, tAnnotation, mAccess, mAnnotationType, annotationToTAnnotation,
				annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType);

	}

	public static final PerformRuleResult pattern_AnnotationTypeAccessOnAnnotation_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_12_1_preparereturnvalue_bindingFB(
			AnnotationTypeAccessOnAnnotation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_12_1_preparereturnvalue_blackFBB(
			EClass eClass, AnnotationTypeAccessOnAnnotation _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationTypeAccessOnAnnotation _this) {
		Object[] result_pattern_AnnotationTypeAccessOnAnnotation_12_1_preparereturnvalue_binding = pattern_AnnotationTypeAccessOnAnnotation_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeAccessOnAnnotation_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationTypeAccessOnAnnotation_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeAccessOnAnnotation_12_1_preparereturnvalue_black = pattern_AnnotationTypeAccessOnAnnotation_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationTypeAccessOnAnnotation_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationTypeAccessOnAnnotation_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationTypeAccessOnAnnotation";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAnnotation");
		EObject _localVariable_1 = match.getObject("tAnnotationType");
		EObject tmpTAnnotation = _localVariable_0;
		EObject tmpTAnnotationType = _localVariable_1;
		if (tmpTAnnotation instanceof TAnnotation) {
			TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
			if (tmpTAnnotationType instanceof TAnnotationType) {
				TAnnotationType tAnnotationType = (TAnnotationType) tmpTAnnotationType;
				return new Object[] { tAnnotation, tAnnotationType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeAccessOnAnnotation_12_2_corematch_blackBFFFFBB(
			TAnnotation tAnnotation, TAnnotationType tAnnotationType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnnotationToTAnnotation annotationToTAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnnotation, AnnotationToTAnnotation.class, "target")) {
			Annotation mAnnotation = annotationToTAnnotation.getSource();
			if (mAnnotation != null) {
				for (TypeToTAbstractType annotationTypeToTAnnotationType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tAnnotationType, TypeToTAbstractType.class, "target")) {
					Type tmpMAnnotationType = annotationTypeToTAnnotationType.getSource();
					if (tmpMAnnotationType instanceof AnnotationTypeDeclaration) {
						AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) tmpMAnnotationType;
						_result.add(new Object[] { tAnnotation, mAnnotationType, annotationToTAnnotation,
								annotationTypeToTAnnotationType, mAnnotation, tAnnotationType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeAccessOnAnnotation_12_3_findcontext_blackBBBBFBB(
			TAnnotation tAnnotation, AnnotationTypeDeclaration mAnnotationType,
			AnnotationToTAnnotation annotationToTAnnotation, TypeToTAbstractType annotationTypeToTAnnotationType,
			Annotation mAnnotation, TAnnotationType tAnnotationType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mAnnotation.equals(annotationToTAnnotation.getSource())) {
			if (tAnnotation.equals(annotationToTAnnotation.getTarget())) {
				if (tAnnotationType.equals(annotationTypeToTAnnotationType.getTarget())) {
					if (tAnnotationType.getAnnotations().contains(tAnnotation)) {
						if (mAnnotationType.equals(annotationTypeToTAnnotationType.getSource())) {
							for (AnnotationMemberValuePair mOwner : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mAnnotation, AnnotationMemberValuePair.class, "value")) {
								_result.add(new Object[] { tAnnotation, mAnnotationType, annotationToTAnnotation,
										annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_12_3_findcontext_greenBBBBBBBFFFFFFFF(
			TAnnotation tAnnotation, AnnotationTypeDeclaration mAnnotationType,
			AnnotationToTAnnotation annotationToTAnnotation, TypeToTAbstractType annotationTypeToTAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation, TAnnotationType tAnnotationType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge annotationToTAnnotation__mAnnotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOwner__mAnnotation____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationToTAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationTypeToTAnnotationType__tAnnotationType____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tAnnotationType__tAnnotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotationType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationTypeToTAnnotationType__mAnnotationType____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String annotationToTAnnotation__mAnnotation____source_name_prime = "source";
		String mOwner__mAnnotation____value_name_prime = "value";
		String annotationToTAnnotation__tAnnotation____target_name_prime = "target";
		String annotationTypeToTAnnotationType__tAnnotationType____target_name_prime = "target";
		String tAnnotationType__tAnnotation____annotations_name_prime = "annotations";
		String tAnnotation__tAnnotationType____type_name_prime = "type";
		String annotationTypeToTAnnotationType__mAnnotationType____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotationType);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationTypeToTAnnotationType);
		isApplicableMatch.getAllContextElements().add(mOwner);
		isApplicableMatch.getAllContextElements().add(mAnnotation);
		isApplicableMatch.getAllContextElements().add(tAnnotationType);
		annotationToTAnnotation__mAnnotation____source.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__mAnnotation____source.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation__mAnnotation____source);
		mOwner__mAnnotation____value.setSrc(mOwner);
		mOwner__mAnnotation____value.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mOwner__mAnnotation____value);
		annotationToTAnnotation__tAnnotation____target.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(annotationToTAnnotation__tAnnotation____target);
		annotationTypeToTAnnotationType__tAnnotationType____target.setSrc(annotationTypeToTAnnotationType);
		annotationTypeToTAnnotationType__tAnnotationType____target.setTrg(tAnnotationType);
		isApplicableMatch.getAllContextElements().add(annotationTypeToTAnnotationType__tAnnotationType____target);
		tAnnotationType__tAnnotation____annotations.setSrc(tAnnotationType);
		tAnnotationType__tAnnotation____annotations.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tAnnotationType__tAnnotation____annotations);
		tAnnotation__tAnnotationType____type.setSrc(tAnnotation);
		tAnnotation__tAnnotationType____type.setTrg(tAnnotationType);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tAnnotationType____type);
		annotationTypeToTAnnotationType__mAnnotationType____source.setSrc(annotationTypeToTAnnotationType);
		annotationTypeToTAnnotationType__mAnnotationType____source.setTrg(mAnnotationType);
		isApplicableMatch.getAllContextElements().add(annotationTypeToTAnnotationType__mAnnotationType____source);
		annotationToTAnnotation__mAnnotation____source
				.setName(annotationToTAnnotation__mAnnotation____source_name_prime);
		mOwner__mAnnotation____value.setName(mOwner__mAnnotation____value_name_prime);
		annotationToTAnnotation__tAnnotation____target
				.setName(annotationToTAnnotation__tAnnotation____target_name_prime);
		annotationTypeToTAnnotationType__tAnnotationType____target
				.setName(annotationTypeToTAnnotationType__tAnnotationType____target_name_prime);
		tAnnotationType__tAnnotation____annotations.setName(tAnnotationType__tAnnotation____annotations_name_prime);
		tAnnotation__tAnnotationType____type.setName(tAnnotation__tAnnotationType____type_name_prime);
		annotationTypeToTAnnotationType__mAnnotationType____source
				.setName(annotationTypeToTAnnotationType__mAnnotationType____source_name_prime);
		return new Object[] { tAnnotation, mAnnotationType, annotationToTAnnotation, annotationTypeToTAnnotationType,
				mOwner, mAnnotation, tAnnotationType, isApplicableMatch, annotationToTAnnotation__mAnnotation____source,
				mOwner__mAnnotation____value, annotationToTAnnotation__tAnnotation____target,
				annotationTypeToTAnnotationType__tAnnotationType____target, tAnnotationType__tAnnotation____annotations,
				tAnnotation__tAnnotationType____type, annotationTypeToTAnnotationType__mAnnotationType____source };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_12_4_solveCSP_bindingFBBBBBBBBB(
			AnnotationTypeAccessOnAnnotation _this, IsApplicableMatch isApplicableMatch, TAnnotation tAnnotation,
			AnnotationTypeDeclaration mAnnotationType, AnnotationToTAnnotation annotationToTAnnotation,
			TypeToTAbstractType annotationTypeToTAnnotationType, AnnotationMemberValuePair mOwner,
			Annotation mAnnotation, TAnnotationType tAnnotationType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tAnnotation, mAnnotationType,
				annotationToTAnnotation, annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAnnotation, mAnnotationType, annotationToTAnnotation,
					annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			AnnotationTypeAccessOnAnnotation _this, IsApplicableMatch isApplicableMatch, TAnnotation tAnnotation,
			AnnotationTypeDeclaration mAnnotationType, AnnotationToTAnnotation annotationToTAnnotation,
			TypeToTAbstractType annotationTypeToTAnnotationType, AnnotationMemberValuePair mOwner,
			Annotation mAnnotation, TAnnotationType tAnnotationType) {
		Object[] result_pattern_AnnotationTypeAccessOnAnnotation_12_4_solveCSP_binding = pattern_AnnotationTypeAccessOnAnnotation_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tAnnotation, mAnnotationType, annotationToTAnnotation,
				annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType);
		if (result_pattern_AnnotationTypeAccessOnAnnotation_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeAccessOnAnnotation_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeAccessOnAnnotation_12_4_solveCSP_black = pattern_AnnotationTypeAccessOnAnnotation_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeAccessOnAnnotation_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAnnotation, mAnnotationType,
						annotationToTAnnotation, annotationTypeToTAnnotationType, mOwner, mAnnotation,
						tAnnotationType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_12_5_checkCSP_expressionFBB(
			AnnotationTypeAccessOnAnnotation _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationTypeAccessOnAnnotation";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeAccessOnAnnotation_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_20_1_preparereturnvalue_bindingFB(
			AnnotationTypeAccessOnAnnotation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, AnnotationTypeAccessOnAnnotation _this) {
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

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationTypeAccessOnAnnotation _this) {
		Object[] result_pattern_AnnotationTypeAccessOnAnnotation_20_1_preparereturnvalue_binding = pattern_AnnotationTypeAccessOnAnnotation_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeAccessOnAnnotation_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationTypeAccessOnAnnotation_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeAccessOnAnnotation_20_1_preparereturnvalue_black = pattern_AnnotationTypeAccessOnAnnotation_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationTypeAccessOnAnnotation_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationTypeAccessOnAnnotation_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationTypeAccessOnAnnotation_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeAccessOnAnnotation_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_annotations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTAnnotationType = _edge_annotations.getSrc();
		if (tmpTAnnotationType instanceof TAnnotationType) {
			TAnnotationType tAnnotationType = (TAnnotationType) tmpTAnnotationType;
			EObject tmpTAnnotation = _edge_annotations.getTrg();
			if (tmpTAnnotation instanceof TAnnotation) {
				TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
				if (tAnnotationType.getAnnotations().contains(tAnnotation)) {
					_result.add(new Object[] { tAnnotation, tAnnotationType, _edge_annotations });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			AnnotationTypeAccessOnAnnotation _this, Match match, TAnnotation tAnnotation,
			TAnnotationType tAnnotationType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAnnotation, tAnnotationType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationTypeAccessOnAnnotation _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationTypeAccessOnAnnotation_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_1_preparereturnvalue_bindingFB(
			AnnotationTypeAccessOnAnnotation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, AnnotationTypeAccessOnAnnotation _this) {
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

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationTypeAccessOnAnnotation _this) {
		Object[] result_pattern_AnnotationTypeAccessOnAnnotation_21_1_preparereturnvalue_binding = pattern_AnnotationTypeAccessOnAnnotation_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeAccessOnAnnotation_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationTypeAccessOnAnnotation_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeAccessOnAnnotation_21_1_preparereturnvalue_black = pattern_AnnotationTypeAccessOnAnnotation_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationTypeAccessOnAnnotation_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationTypeAccessOnAnnotation_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationTypeAccessOnAnnotation_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_0BB(
			TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType) {
		for (AbstractTypeDeclaration __DEC_mAccess_superInterfaces_875972 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mAnnotationType.equals(__DEC_mAccess_superInterfaces_875972)) {
				return new Object[] { mAccess, mAnnotationType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess mAccess) {
		for (AnnotationTypeMemberDeclaration __DEC_mAccess_type_461242 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_2B(
			TypeAccess mAccess) {
		for (ArrayType __DEC_mAccess_elementType_716446 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ArrayType.class, "elementType")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess mAccess) {
		for (ClassInstanceCreation __DEC_mAccess_type_804121 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_4B(
			TypeAccess mAccess) {
		for (ClassDeclaration __DEC_mAccess_superClass_896701 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ClassDeclaration.class, "superClass")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess mAccess) {
		for (MethodDeclaration __DEC_mAccess_returnType_877675 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess mAccess) {
		for (ParameterizedType __DEC_mAccess_type_335666 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ParameterizedType.class, "type")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess mAccess) {
		for (TypeLiteral __DEC_mAccess_type_245913 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, TypeLiteral.class, "type")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_8BB(
			TypeAccess mAccess, AnnotationMemberValuePair mOwner) {
		for (AnnotationMemberValuePair __DEC_mAccess_value_879860 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AnnotationMemberValuePair.class, "value")) {
			if (!mOwner.equals(__DEC_mAccess_value_879860)) {
				return new Object[] { mAccess, mOwner };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_9BB(
			AnnotationTypeDeclaration mAnnotationType, TypeAccess mAccess) {
		if (mAnnotationType.getSuperInterfaces().contains(mAccess)) {
			return new Object[] { mAnnotationType, mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_10BB(
			AnnotationMemberValuePair mOwner, TypeAccess mAccess) {
		if (mAccess.equals(mOwner.getValue())) {
			return new Object[] { mOwner, mAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMAccess = _edge_type.getSrc();
		if (tmpMAccess instanceof TypeAccess) {
			TypeAccess mAccess = (TypeAccess) tmpMAccess;
			EObject tmpMAnnotationType = _edge_type.getTrg();
			if (tmpMAnnotationType instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) tmpMAnnotationType;
				if (mAnnotationType.equals(mAccess.getType())) {
					if (pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_1B(
							mAccess) == null) {
						if (pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_2B(
								mAccess) == null) {
							if (pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_3B(
									mAccess) == null) {
								if (pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_4B(
										mAccess) == null) {
									if (pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_5B(
											mAccess) == null) {
										if (pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_6B(
												mAccess) == null) {
											if (pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_7B(
													mAccess) == null) {
												if (pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_0BB(
														mAccess, mAnnotationType) == null) {
													if (pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_9BB(
															mAnnotationType, mAccess) == null) {
														for (Annotation mAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(mAccess, Annotation.class,
																		"type")) {
															for (AnnotationMemberValuePair mOwner : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(mAnnotation,
																			AnnotationMemberValuePair.class, "value")) {
																if (pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_8BB(
																		mAccess, mOwner) == null) {
																	if (pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_black_nac_10BB(
																			mOwner, mAccess) == null) {
																		_result.add(new Object[] { mAccess,
																				mAnnotationType, mOwner, mAnnotation,
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

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			AnnotationTypeAccessOnAnnotation _this, Match match, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType, AnnotationMemberValuePair mOwner, Annotation mAnnotation) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mAccess, mAnnotationType, mOwner, mAnnotation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationTypeAccessOnAnnotation _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationTypeAccessOnAnnotation_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_24_1_prepare_blackB(
			AnnotationTypeAccessOnAnnotation _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tAnnotation");
		EObject _localVariable_1 = sourceMatch.getObject("mAccess");
		EObject _localVariable_2 = sourceMatch.getObject("mAnnotationType");
		EObject _localVariable_3 = sourceMatch.getObject("mOwner");
		EObject _localVariable_4 = sourceMatch.getObject("mAnnotation");
		EObject _localVariable_5 = targetMatch.getObject("tAnnotationType");
		EObject tmpTAnnotation = _localVariable_0;
		EObject tmpMAccess = _localVariable_1;
		EObject tmpMAnnotationType = _localVariable_2;
		EObject tmpMOwner = _localVariable_3;
		EObject tmpMAnnotation = _localVariable_4;
		EObject tmpTAnnotationType = _localVariable_5;
		if (tmpTAnnotation instanceof TAnnotation) {
			TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
			if (tmpMAccess instanceof TypeAccess) {
				TypeAccess mAccess = (TypeAccess) tmpMAccess;
				if (tmpMAnnotationType instanceof AnnotationTypeDeclaration) {
					AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) tmpMAnnotationType;
					if (tmpMOwner instanceof AnnotationMemberValuePair) {
						AnnotationMemberValuePair mOwner = (AnnotationMemberValuePair) tmpMOwner;
						if (tmpMAnnotation instanceof Annotation) {
							Annotation mAnnotation = (Annotation) tmpMAnnotation;
							if (tmpTAnnotationType instanceof TAnnotationType) {
								TAnnotationType tAnnotationType = (TAnnotationType) tmpTAnnotationType;
								return new Object[] { tAnnotation, mAccess, mAnnotationType, mOwner, mAnnotation,
										tAnnotationType, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_24_2_matchsrctrgcontext_blackBBBBBBBB(
			TAnnotation tAnnotation, TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation, TAnnotationType tAnnotationType,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tAnnotation, mAccess, mAnnotationType, mOwner, mAnnotation, tAnnotationType,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationTypeAccessOnAnnotation_24_2_matchsrctrgcontext_binding = pattern_AnnotationTypeAccessOnAnnotation_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_AnnotationTypeAccessOnAnnotation_24_2_matchsrctrgcontext_binding != null) {
			TAnnotation tAnnotation = (TAnnotation) result_pattern_AnnotationTypeAccessOnAnnotation_24_2_matchsrctrgcontext_binding[0];
			TypeAccess mAccess = (TypeAccess) result_pattern_AnnotationTypeAccessOnAnnotation_24_2_matchsrctrgcontext_binding[1];
			AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeAccessOnAnnotation_24_2_matchsrctrgcontext_binding[2];
			AnnotationMemberValuePair mOwner = (AnnotationMemberValuePair) result_pattern_AnnotationTypeAccessOnAnnotation_24_2_matchsrctrgcontext_binding[3];
			Annotation mAnnotation = (Annotation) result_pattern_AnnotationTypeAccessOnAnnotation_24_2_matchsrctrgcontext_binding[4];
			TAnnotationType tAnnotationType = (TAnnotationType) result_pattern_AnnotationTypeAccessOnAnnotation_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_AnnotationTypeAccessOnAnnotation_24_2_matchsrctrgcontext_black = pattern_AnnotationTypeAccessOnAnnotation_24_2_matchsrctrgcontext_blackBBBBBBBB(
					tAnnotation, mAccess, mAnnotationType, mOwner, mAnnotation, tAnnotationType, sourceMatch,
					targetMatch);
			if (result_pattern_AnnotationTypeAccessOnAnnotation_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tAnnotation, mAccess, mAnnotationType, mOwner, mAnnotation, tAnnotationType,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_24_3_solvecsp_bindingFBBBBBBBBB(
			AnnotationTypeAccessOnAnnotation _this, TAnnotation tAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType, AnnotationMemberValuePair mOwner, Annotation mAnnotation,
			TAnnotationType tAnnotationType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tAnnotation, mAccess, mAnnotationType, mOwner,
				mAnnotation, tAnnotationType, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tAnnotation, mAccess, mAnnotationType, mOwner, mAnnotation,
					tAnnotationType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			AnnotationTypeAccessOnAnnotation _this, TAnnotation tAnnotation, TypeAccess mAccess,
			AnnotationTypeDeclaration mAnnotationType, AnnotationMemberValuePair mOwner, Annotation mAnnotation,
			TAnnotationType tAnnotationType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationTypeAccessOnAnnotation_24_3_solvecsp_binding = pattern_AnnotationTypeAccessOnAnnotation_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, tAnnotation, mAccess, mAnnotationType, mOwner, mAnnotation, tAnnotationType, sourceMatch,
				targetMatch);
		if (result_pattern_AnnotationTypeAccessOnAnnotation_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeAccessOnAnnotation_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnnotationTypeAccessOnAnnotation_24_3_solvecsp_black = pattern_AnnotationTypeAccessOnAnnotation_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnnotationTypeAccessOnAnnotation_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tAnnotation, mAccess, mAnnotationType, mOwner, mAnnotation,
						tAnnotationType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeAccessOnAnnotation_24_5_matchcorrcontext_blackBBFFBBBB(
			TAnnotation tAnnotation, AnnotationTypeDeclaration mAnnotationType, Annotation mAnnotation,
			TAnnotationType tAnnotationType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (AnnotationToTAnnotation annotationToTAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mAnnotation, AnnotationToTAnnotation.class, "source")) {
				if (tAnnotation.equals(annotationToTAnnotation.getTarget())) {
					for (TypeToTAbstractType annotationTypeToTAnnotationType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tAnnotationType, TypeToTAbstractType.class, "target")) {
						if (mAnnotationType.equals(annotationTypeToTAnnotationType.getSource())) {
							_result.add(new Object[] { tAnnotation, mAnnotationType, annotationToTAnnotation,
									annotationTypeToTAnnotationType, mAnnotation, tAnnotationType, sourceMatch,
									targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_24_5_matchcorrcontext_greenBBBBF(
			AnnotationToTAnnotation annotationToTAnnotation, TypeToTAbstractType annotationTypeToTAnnotationType,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnnotationTypeAccessOnAnnotation";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(annotationToTAnnotation);
		ccMatch.getAllContextElements().add(annotationTypeToTAnnotationType);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { annotationToTAnnotation, annotationTypeToTAnnotationType, sourceMatch, targetMatch,
				ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_24_6_createcorrespondence_blackBBBBBBB(
			TAnnotation tAnnotation, TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation, TAnnotationType tAnnotationType,
			CCMatch ccMatch) {
		return new Object[] { tAnnotation, mAccess, mAnnotationType, mOwner, mAnnotation, tAnnotationType, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnnotationTypeAccessOnAnnotation";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeAccessOnAnnotation_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_0BB(
			TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType) {
		for (AbstractTypeDeclaration __DEC_mAccess_superInterfaces_326187 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mAnnotationType.equals(__DEC_mAccess_superInterfaces_326187)) {
				return new Object[] { mAccess, mAnnotationType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_1B(
			TypeAccess mAccess) {
		for (AnnotationTypeMemberDeclaration __DEC_mAccess_type_377271 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_2B(
			TypeAccess mAccess) {
		for (ArrayType __DEC_mAccess_elementType_265985 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ArrayType.class, "elementType")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_3B(
			TypeAccess mAccess) {
		for (ClassInstanceCreation __DEC_mAccess_type_453276 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_4B(
			TypeAccess mAccess) {
		for (ClassDeclaration __DEC_mAccess_superClass_651269 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ClassDeclaration.class, "superClass")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_5B(
			TypeAccess mAccess) {
		for (MethodDeclaration __DEC_mAccess_returnType_421973 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_6B(
			TypeAccess mAccess) {
		for (ParameterizedType __DEC_mAccess_type_888332 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ParameterizedType.class, "type")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_7B(
			TypeAccess mAccess) {
		for (TypeLiteral __DEC_mAccess_type_79897 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, TypeLiteral.class, "type")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_8BB(
			TypeAccess mAccess, AnnotationMemberValuePair mOwner) {
		for (AnnotationMemberValuePair __DEC_mAccess_value_155829 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AnnotationMemberValuePair.class, "value")) {
			if (!mOwner.equals(__DEC_mAccess_value_155829)) {
				return new Object[] { mAccess, mOwner };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_9BB(
			AnnotationTypeDeclaration mAnnotationType, TypeAccess mAccess) {
		if (mAnnotationType.getSuperInterfaces().contains(mAccess)) {
			return new Object[] { mAnnotationType, mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_10BB(
			AnnotationMemberValuePair mOwner, TypeAccess mAccess) {
		if (mAccess.equals(mOwner.getValue())) {
			return new Object[] { mOwner, mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_blackBBBB(
			TypeAccess mAccess, AnnotationTypeDeclaration mAnnotationType, AnnotationMemberValuePair mOwner,
			Annotation mAnnotation) {
		if (mAnnotationType.equals(mAccess.getType())) {
			if (mAnnotation.equals(mOwner.getValue())) {
				if (mAccess.equals(mAnnotation.getType())) {
					if (pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_0BB(mAccess,
							mAnnotationType) == null) {
						if (pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_1B(
								mAccess) == null) {
							if (pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_2B(
									mAccess) == null) {
								if (pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_3B(
										mAccess) == null) {
									if (pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_4B(
											mAccess) == null) {
										if (pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_5B(
												mAccess) == null) {
											if (pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_6B(
													mAccess) == null) {
												if (pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_7B(
														mAccess) == null) {
													if (pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_8BB(
															mAccess, mOwner) == null) {
														if (pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_9BB(
																mAnnotationType, mAccess) == null) {
															if (pattern_AnnotationTypeAccessOnAnnotation_27_1_matchtggpattern_black_nac_10BB(
																	mOwner, mAccess) == null) {
																return new Object[] { mAccess, mAnnotationType, mOwner,
																		mAnnotation };
															}
														}
													}
												}
											}
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

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_28_1_matchtggpattern_blackBB(
			TAnnotation tAnnotation, TAnnotationType tAnnotationType) {
		if (tAnnotationType.getAnnotations().contains(tAnnotation)) {
			return new Object[] { tAnnotation, tAnnotationType };
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_29_1_createresult_blackB(
			AnnotationTypeAccessOnAnnotation _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TAnnotation tAnnotation) {
		if (ruleResult.getTargetObjects().contains(tAnnotation)) {
			return new Object[] { ruleResult, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, AnnotationToTAnnotation annotationToTAnnotation) {
		if (ruleResult.getCorrObjects().contains(annotationToTAnnotation)) {
			return new Object[] { ruleResult, annotationToTAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Annotation mAnnotation) {
		if (ruleResult.getSourceObjects().contains(mAnnotation)) {
			return new Object[] { ruleResult, mAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AnnotationMemberValuePair mOwner) {
		if (ruleResult.getSourceObjects().contains(mOwner)) {
			return new Object[] { ruleResult, mOwner };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, AnnotationTypeDeclaration mAnnotationType) {
		if (ruleResult.getSourceObjects().contains(mAnnotationType)) {
			return new Object[] { ruleResult, mAnnotationType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType annotationTypeToTAnnotationType) {
		if (ruleResult.getCorrObjects().contains(annotationTypeToTAnnotationType)) {
			return new Object[] { ruleResult, annotationTypeToTAnnotationType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, TAnnotationType tAnnotationType) {
		if (ruleResult.getTargetObjects().contains(tAnnotationType)) {
			return new Object[] { ruleResult, tAnnotationType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeAccessOnAnnotation_29_2_isapplicablecore_blackFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList annotationToTAnnotationList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList annotationTypeToTAnnotationTypeList : ruleEntryContainer.getRuleEntryList()) {
				if (!annotationToTAnnotationList.equals(annotationTypeToTAnnotationTypeList)) {
					for (EObject tmpAnnotationToTAnnotation : annotationToTAnnotationList.getEntryObjects()) {
						if (tmpAnnotationToTAnnotation instanceof AnnotationToTAnnotation) {
							AnnotationToTAnnotation annotationToTAnnotation = (AnnotationToTAnnotation) tmpAnnotationToTAnnotation;
							TAnnotation tAnnotation = annotationToTAnnotation.getTarget();
							if (tAnnotation != null) {
								Annotation mAnnotation = annotationToTAnnotation.getSource();
								if (mAnnotation != null) {
									if (pattern_AnnotationTypeAccessOnAnnotation_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, annotationToTAnnotation) == null) {
										if (pattern_AnnotationTypeAccessOnAnnotation_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, tAnnotation) == null) {
											if (pattern_AnnotationTypeAccessOnAnnotation_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, mAnnotation) == null) {
												for (EObject tmpAnnotationTypeToTAnnotationType : annotationTypeToTAnnotationTypeList
														.getEntryObjects()) {
													if (tmpAnnotationTypeToTAnnotationType instanceof TypeToTAbstractType) {
														TypeToTAbstractType annotationTypeToTAnnotationType = (TypeToTAbstractType) tmpAnnotationTypeToTAnnotationType;
														Type tmpMAnnotationType = annotationTypeToTAnnotationType
																.getSource();
														if (tmpMAnnotationType instanceof AnnotationTypeDeclaration) {
															AnnotationTypeDeclaration mAnnotationType = (AnnotationTypeDeclaration) tmpMAnnotationType;
															TAbstractType tmpTAnnotationType = annotationTypeToTAnnotationType
																	.getTarget();
															if (tmpTAnnotationType instanceof TAnnotationType) {
																TAnnotationType tAnnotationType = (TAnnotationType) tmpTAnnotationType;
																if (pattern_AnnotationTypeAccessOnAnnotation_29_2_isapplicablecore_black_nac_5BB(
																		ruleResult,
																		annotationTypeToTAnnotationType) == null) {
																	if (pattern_AnnotationTypeAccessOnAnnotation_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, mAnnotationType) == null) {
																		if (pattern_AnnotationTypeAccessOnAnnotation_29_2_isapplicablecore_black_nac_6BB(
																				ruleResult, tAnnotationType) == null) {
																			for (AnnotationMemberValuePair mOwner : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(
																							mAnnotation,
																							AnnotationMemberValuePair.class,
																							"value")) {
																				if (pattern_AnnotationTypeAccessOnAnnotation_29_2_isapplicablecore_black_nac_3BB(
																						ruleResult, mOwner) == null) {
																					_result.add(new Object[] {
																							annotationToTAnnotationList,
																							tAnnotation,
																							annotationToTAnnotation,
																							mAnnotation, mOwner,
																							annotationTypeToTAnnotationTypeList,
																							mAnnotationType,
																							annotationTypeToTAnnotationType,
																							tAnnotationType,
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

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_29_3_solveCSP_bindingFBBBBBBBBBB(
			AnnotationTypeAccessOnAnnotation _this, IsApplicableMatch isApplicableMatch, TAnnotation tAnnotation,
			AnnotationTypeDeclaration mAnnotationType, AnnotationToTAnnotation annotationToTAnnotation,
			TypeToTAbstractType annotationTypeToTAnnotationType, AnnotationMemberValuePair mOwner,
			Annotation mAnnotation, TAnnotationType tAnnotationType, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tAnnotation, mAnnotationType,
				annotationToTAnnotation, annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAnnotation, mAnnotationType, annotationToTAnnotation,
					annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			AnnotationTypeAccessOnAnnotation _this, IsApplicableMatch isApplicableMatch, TAnnotation tAnnotation,
			AnnotationTypeDeclaration mAnnotationType, AnnotationToTAnnotation annotationToTAnnotation,
			TypeToTAbstractType annotationTypeToTAnnotationType, AnnotationMemberValuePair mOwner,
			Annotation mAnnotation, TAnnotationType tAnnotationType, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnnotationTypeAccessOnAnnotation_29_3_solveCSP_binding = pattern_AnnotationTypeAccessOnAnnotation_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, tAnnotation, mAnnotationType, annotationToTAnnotation,
				annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType, ruleResult);
		if (result_pattern_AnnotationTypeAccessOnAnnotation_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeAccessOnAnnotation_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeAccessOnAnnotation_29_3_solveCSP_black = pattern_AnnotationTypeAccessOnAnnotation_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeAccessOnAnnotation_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAnnotation, mAnnotationType,
						annotationToTAnnotation, annotationTypeToTAnnotationType, mOwner, mAnnotation, tAnnotationType,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeAccessOnAnnotation_29_4_checkCSP_expressionFBB(
			AnnotationTypeAccessOnAnnotation _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_29_5_checknacs_blackBBBBBBB(
			TAnnotation tAnnotation, AnnotationTypeDeclaration mAnnotationType,
			AnnotationToTAnnotation annotationToTAnnotation, TypeToTAbstractType annotationTypeToTAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation, TAnnotationType tAnnotationType) {
		return new Object[] { tAnnotation, mAnnotationType, annotationToTAnnotation, annotationTypeToTAnnotationType,
				mOwner, mAnnotation, tAnnotationType };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_29_6_perform_blackBBBBBBBB(
			TAnnotation tAnnotation, AnnotationTypeDeclaration mAnnotationType,
			AnnotationToTAnnotation annotationToTAnnotation, TypeToTAbstractType annotationTypeToTAnnotationType,
			AnnotationMemberValuePair mOwner, Annotation mAnnotation, TAnnotationType tAnnotationType,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tAnnotation, mAnnotationType, annotationToTAnnotation, annotationTypeToTAnnotationType,
				mOwner, mAnnotation, tAnnotationType, ruleResult };
	}

	public static final Object[] pattern_AnnotationTypeAccessOnAnnotation_29_6_perform_greenBFBBBB(
			TAnnotation tAnnotation, AnnotationTypeDeclaration mAnnotationType, Annotation mAnnotation,
			TAnnotationType tAnnotationType, ModelgeneratorRuleResult ruleResult) {
		TypeAccess mAccess = JavaFactory.eINSTANCE.createTypeAccess();
		tAnnotationType.getAnnotations().add(tAnnotation);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		mAccess.setType(mAnnotationType);
		mAnnotation.setType(mAccess);
		ruleResult.getSourceObjects().add(mAccess);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tAnnotation, mAccess, mAnnotationType, mAnnotation, tAnnotationType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationTypeAccessOnAnnotation_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationTypeAccessOnAnnotationImpl
