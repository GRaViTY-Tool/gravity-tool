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
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.AnnotationMemberValuePairToTAnnotationValue;
import org.gravity.tgg.modisco.pm.LiteralToTNode;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueClass;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;

import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotationValue;
import org.gravity.typegraph.basic.annotations.TClassNode;

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
 * An implementation of the model object '<em><b>Annotation Member Value Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotationMemberValueClassImpl extends AbstractRuleImpl implements AnnotationMemberValueClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationMemberValueClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnnotationMemberValueClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, TypeLiteral mValue, Type mType) {

		Object[] result1_black = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_0_1_initialbindings_blackBBBBBBBB(this, match, annotation, mAccess,
						mAnnotationValue, mOwner, mValue, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[annotation] = " + annotation + ", " + "[mAccess] = " + mAccess
					+ ", " + "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mOwner] = " + mOwner + ", "
					+ "[mValue] = " + mValue + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_0_2_SolveCSP_bindingAndBlackFBBBBBBBB(this, match, annotation,
						mAccess, mAnnotationValue, mOwner, mValue, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[annotation] = " + annotation + ", " + "[mAccess] = " + mAccess
					+ ", " + "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mOwner] = " + mOwner + ", "
					+ "[mValue] = " + mValue + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationMemberValueClassImpl
					.pattern_AnnotationMemberValueClass_0_4_collectelementstobetranslated_blackBBBBBBB(match,
							annotation, mAccess, mAnnotationValue, mOwner, mValue, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[annotation] = " + annotation + ", " + "[mAccess] = " + mAccess + ", "
						+ "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mOwner] = " + mOwner + ", "
						+ "[mValue] = " + mValue + ", " + "[mType] = " + mType + ".");
			}
			AnnotationMemberValueClassImpl
					.pattern_AnnotationMemberValueClass_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, mAccess,
							mAnnotationValue, mValue, mType);
			//nothing EMoflonEdge mValue__mAccess____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge mAccess__mType____type = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge mType__mAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge mAnnotationValue__mValue____value = (EMoflonEdge) result4_green[8];

			Object[] result5_black = AnnotationMemberValueClassImpl
					.pattern_AnnotationMemberValueClass_0_5_collectcontextelements_blackBBBBBBB(match, annotation,
							mAccess, mAnnotationValue, mOwner, mValue, mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[annotation] = " + annotation + ", " + "[mAccess] = " + mAccess + ", "
						+ "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mOwner] = " + mOwner + ", "
						+ "[mValue] = " + mValue + ", " + "[mType] = " + mType + ".");
			}
			AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_0_5_collectcontextelements_greenBBBBBFF(
					match, annotation, mAnnotationValue, mOwner, mType);
			//nothing EMoflonEdge annotation__mAnnotationValue____values = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge mOwner__annotation____annotations = (EMoflonEdge) result5_green[6];

			// 
			AnnotationMemberValueClassImpl
					.pattern_AnnotationMemberValueClass_0_6_registerobjectstomatch_expressionBBBBBBBB(this, match,
							annotation, mAccess, mAnnotationValue, mOwner, mValue, mType);
			return AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_0_7_expressionF();
		} else {
			return AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Annotation annotation = (Annotation) result1_bindingAndBlack[0];
		TypeAccess mAccess = (TypeAccess) result1_bindingAndBlack[1];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result1_bindingAndBlack[2];
		AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result1_bindingAndBlack[3];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[4];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[5];
		BodyDeclaration mOwner = (BodyDeclaration) result1_bindingAndBlack[6];
		TypeLiteral mValue = (TypeLiteral) result1_bindingAndBlack[7];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result1_bindingAndBlack[8];
		Type mType = (Type) result1_bindingAndBlack[9];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_1_1_performtransformation_greenBFFBB(tType, mValue,
						tAnnotationValue);
		TClassNode tValue = (TClassNode) result1_green[1];
		LiteralToTNode mValueToTValue = (LiteralToTNode) result1_green[2];

		Object[] result2_black = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_1_2_collecttranslatedelements_blackBBBB(mAccess, tValue,
						mValueToTValue, mValue);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mAccess] = " + mAccess + ", "
					+ "[tValue] = " + tValue + ", " + "[mValueToTValue] = " + mValueToTValue + ", " + "[mValue] = "
					+ mValue + ".");
		}
		Object[] result2_green = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_1_2_collecttranslatedelements_greenFBBBB(mAccess, tValue,
						mValueToTValue, mValue);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, annotation,
						mAccess, mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue, mTypeToTType, tType,
						tValue, mOwner, mValueToTValue, mValue, tAnnotationValue, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[annotation] = " + annotation + ", " + "[mAccess] = " + mAccess + ", "
					+ "[mAnnotationValue] = " + mAnnotationValue + ", "
					+ "[AnnotationMemberValuePairToTAnnotationValue] = " + AnnotationMemberValuePairToTAnnotationValue
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tType] = " + tType + ", " + "[tValue] = "
					+ tValue + ", " + "[mOwner] = " + mOwner + ", " + "[mValueToTValue] = " + mValueToTValue + ", "
					+ "[mValue] = " + mValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", " + "[mType] = "
					+ mType + ".");
		}
		AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, mAccess,
						mAnnotationValue, tType, tValue, mValueToTValue, mValue, tAnnotationValue, mType);
		//nothing EMoflonEdge mValue__mAccess____type = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mAccess__mType____type = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mType__mAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mValueToTValue__mValue____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tValue__tType____tClass = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mAnnotationValue__mValue____value = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mValueToTValue__tValue____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result3_green[16];

		// 
		// 
		AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
				this, ruleresult, annotation, mAccess, mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue,
				mTypeToTType, tType, tValue, mOwner, mValueToTValue, mValue, tAnnotationValue, mType);
		return AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_2_2_corematch_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Annotation annotation = (Annotation) result2_binding[0];
		TypeAccess mAccess = (TypeAccess) result2_binding[1];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_binding[2];
		BodyDeclaration mOwner = (BodyDeclaration) result2_binding[3];
		TypeLiteral mValue = (TypeLiteral) result2_binding[4];
		Type mType = (Type) result2_binding[5];
		for (Object[] result2_black : AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_2_2_corematch_blackBBBFFFBBFBB(annotation, mAccess,
						mAnnotationValue, mOwner, mValue, mType, match)) {
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result2_black[3];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[4];
			TAbstractType tType = (TAbstractType) result2_black[5];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_black[8];
			// ForEach 
			for (Object[] result3_black : AnnotationMemberValueClassImpl
					.pattern_AnnotationMemberValueClass_2_3_findcontext_blackBBBBBBBBBB(annotation, mAccess,
							mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, mOwner,
							mValue, tAnnotationValue, mType)) {
				Object[] result3_green = AnnotationMemberValueClassImpl
						.pattern_AnnotationMemberValueClass_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFF(annotation,
								mAccess, mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue, mTypeToTType,
								tType, mOwner, mValue, tAnnotationValue, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge mValue__mAccess____type = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mAccess__mType____type = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mType__mAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge annotation__mAnnotationValue____values = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__mAnnotationValue____source = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mOwner__annotation____annotations = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mAnnotationValue__mValue____value = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[20];

				Object[] result4_bindingAndBlack = AnnotationMemberValueClassImpl
						.pattern_AnnotationMemberValueClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
								isApplicableMatch, annotation, mAccess, mAnnotationValue,
								AnnotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, mOwner, mValue,
								tAnnotationValue, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[annotation] = " + annotation
							+ ", " + "[mAccess] = " + mAccess + ", " + "[mAnnotationValue] = " + mAnnotationValue + ", "
							+ "[AnnotationMemberValuePairToTAnnotationValue] = "
							+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[tType] = " + tType + ", " + "[mOwner] = " + mOwner + ", " + "[mValue] = "
							+ mValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", " + "[mType] = " + mType
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = AnnotationMemberValueClassImpl
							.pattern_AnnotationMemberValueClass_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, TypeLiteral mValue, Type mType) {
		match.registerObject("annotation", annotation);
		match.registerObject("mAccess", mAccess);
		match.registerObject("mAnnotationValue", mAnnotationValue);
		match.registerObject("mOwner", mOwner);
		match.registerObject("mValue", mValue);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, TypeLiteral mValue, Type mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, BodyDeclaration mOwner, TypeLiteral mValue,
			TAnnotationValue tAnnotationValue, Type mType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("annotation", annotation);
		isApplicableMatch.registerObject("mAccess", mAccess);
		isApplicableMatch.registerObject("mAnnotationValue", mAnnotationValue);
		isApplicableMatch.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mOwner", mOwner);
		isApplicableMatch.registerObject("mValue", mValue);
		isApplicableMatch.registerObject("tAnnotationValue", tAnnotationValue);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject annotation, EObject mAccess,
			EObject mAnnotationValue, EObject AnnotationMemberValuePairToTAnnotationValue, EObject mTypeToTType,
			EObject tType, EObject tValue, EObject mOwner, EObject mValueToTValue, EObject mValue,
			EObject tAnnotationValue, EObject mType) {
		ruleresult.registerObject("annotation", annotation);
		ruleresult.registerObject("mAccess", mAccess);
		ruleresult.registerObject("mAnnotationValue", mAnnotationValue);
		ruleresult.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("tValue", tValue);
		ruleresult.registerObject("mOwner", mOwner);
		ruleresult.registerObject("mValueToTValue", mValueToTValue);
		ruleresult.registerObject("mValue", mValue);
		ruleresult.registerObject("tAnnotationValue", tAnnotationValue);
		ruleresult.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mAccess").eClass()).equals("java.TypeAccess.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mValue").eClass())
						.equals("java.TypeLiteral.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TAbstractType tType, TClassNode tValue,
			TAnnotationValue tAnnotationValue) {

		Object[] result1_black = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_10_1_initialbindings_blackBBBBB(this, match, tType, tValue,
						tAnnotationValue);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tValue] = " + tValue + ", "
					+ "[tAnnotationValue] = " + tAnnotationValue + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tType, tValue,
						tAnnotationValue);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tValue] = " + tValue + ", "
					+ "[tAnnotationValue] = " + tAnnotationValue + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationMemberValueClassImpl
					.pattern_AnnotationMemberValueClass_10_4_collectelementstobetranslated_blackBBBB(match, tType,
							tValue, tAnnotationValue);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tType] = " + tType + ", " + "[tValue] = " + tValue + ", " + "[tAnnotationValue] = "
						+ tAnnotationValue + ".");
			}
			AnnotationMemberValueClassImpl
					.pattern_AnnotationMemberValueClass_10_4_collectelementstobetranslated_greenBBBBFF(match, tType,
							tValue, tAnnotationValue);
			//nothing EMoflonEdge tValue__tType____tClass = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result4_green[5];

			Object[] result5_black = AnnotationMemberValueClassImpl
					.pattern_AnnotationMemberValueClass_10_5_collectcontextelements_blackBBBB(match, tType, tValue,
							tAnnotationValue);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tType] = " + tType + ", " + "[tValue] = " + tValue + ", " + "[tAnnotationValue] = "
						+ tAnnotationValue + ".");
			}
			AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_10_5_collectcontextelements_greenBBB(
					match, tType, tAnnotationValue);

			// 
			AnnotationMemberValueClassImpl
					.pattern_AnnotationMemberValueClass_10_6_registerobjectstomatch_expressionBBBBB(this, match, tType,
							tValue, tAnnotationValue);
			return AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_10_7_expressionF();
		} else {
			return AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Annotation annotation = (Annotation) result1_bindingAndBlack[0];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result1_bindingAndBlack[1];
		AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result1_bindingAndBlack[2];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[4];
		TClassNode tValue = (TClassNode) result1_bindingAndBlack[5];
		BodyDeclaration mOwner = (BodyDeclaration) result1_bindingAndBlack[6];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result1_bindingAndBlack[7];
		Type mType = (Type) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_11_1_performtransformation_greenFBBFFB(mAnnotationValue, tValue,
						mType);
		TypeAccess mAccess = (TypeAccess) result1_green[0];
		LiteralToTNode mValueToTValue = (LiteralToTNode) result1_green[3];
		TypeLiteral mValue = (TypeLiteral) result1_green[4];

		Object[] result2_black = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_11_2_collecttranslatedelements_blackBBBB(mAccess, tValue,
						mValueToTValue, mValue);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mAccess] = " + mAccess + ", "
					+ "[tValue] = " + tValue + ", " + "[mValueToTValue] = " + mValueToTValue + ", " + "[mValue] = "
					+ mValue + ".");
		}
		Object[] result2_green = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_11_2_collecttranslatedelements_greenFBBBB(mAccess, tValue,
						mValueToTValue, mValue);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, annotation,
						mAccess, mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue, mTypeToTType, tType,
						tValue, mOwner, mValueToTValue, mValue, tAnnotationValue, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[annotation] = " + annotation + ", " + "[mAccess] = " + mAccess + ", "
					+ "[mAnnotationValue] = " + mAnnotationValue + ", "
					+ "[AnnotationMemberValuePairToTAnnotationValue] = " + AnnotationMemberValuePairToTAnnotationValue
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tType] = " + tType + ", " + "[tValue] = "
					+ tValue + ", " + "[mOwner] = " + mOwner + ", " + "[mValueToTValue] = " + mValueToTValue + ", "
					+ "[mValue] = " + mValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", " + "[mType] = "
					+ mType + ".");
		}
		AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(ruleresult, mAccess,
						mAnnotationValue, tType, tValue, mValueToTValue, mValue, tAnnotationValue, mType);
		//nothing EMoflonEdge mValue__mAccess____type = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mAccess__mType____type = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mType__mAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mValueToTValue__mValue____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tValue__tType____tClass = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mAnnotationValue__mValue____value = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mValueToTValue__tValue____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result3_green[16];

		// 
		// 
		AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
				this, ruleresult, annotation, mAccess, mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue,
				mTypeToTType, tType, tValue, mOwner, mValueToTValue, mValue, tAnnotationValue, mType);
		return AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAbstractType tType = (TAbstractType) result2_binding[0];
		TClassNode tValue = (TClassNode) result2_binding[1];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_binding[2];
		for (Object[] result2_black : AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_12_2_corematch_blackFFFBBBFB(tType, tValue, tAnnotationValue,
						match)) {
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_black[0];
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result2_black[1];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[2];
			Type mType = (Type) result2_black[6];
			// ForEach 
			for (Object[] result3_black : AnnotationMemberValueClassImpl
					.pattern_AnnotationMemberValueClass_12_3_findcontext_blackFBBBBBFBB(mAnnotationValue,
							AnnotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, tValue, tAnnotationValue,
							mType)) {
				Annotation annotation = (Annotation) result3_black[0];
				BodyDeclaration mOwner = (BodyDeclaration) result3_black[6];
				Object[] result3_green = AnnotationMemberValueClassImpl
						.pattern_AnnotationMemberValueClass_12_3_findcontext_greenBBBBBBBBBFFFFFFFFF(annotation,
								mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue, mTypeToTType, tType,
								tValue, mOwner, tAnnotationValue, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tValue__tType____tClass = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge annotation__mAnnotationValue____values = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__mAnnotationValue____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mOwner__annotation____annotations = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = AnnotationMemberValueClassImpl
						.pattern_AnnotationMemberValueClass_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, annotation, mAnnotationValue,
								AnnotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, tValue, mOwner,
								tAnnotationValue, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[annotation] = " + annotation
							+ ", " + "[mAnnotationValue] = " + mAnnotationValue + ", "
							+ "[AnnotationMemberValuePairToTAnnotationValue] = "
							+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[tType] = " + tType + ", " + "[tValue] = " + tValue + ", " + "[mOwner] = "
							+ mOwner + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", " + "[mType] = " + mType
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = AnnotationMemberValueClassImpl
							.pattern_AnnotationMemberValueClass_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAbstractType tType, TClassNode tValue,
			TAnnotationValue tAnnotationValue) {
		match.registerObject("tType", tType);
		match.registerObject("tValue", tValue);
		match.registerObject("tAnnotationValue", tAnnotationValue);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAbstractType tType, TClassNode tValue,
			TAnnotationValue tAnnotationValue) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, TClassNode tValue, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, Type mType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("annotation", annotation);
		isApplicableMatch.registerObject("mAnnotationValue", mAnnotationValue);
		isApplicableMatch.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("tValue", tValue);
		isApplicableMatch.registerObject("mOwner", mOwner);
		isApplicableMatch.registerObject("tAnnotationValue", tAnnotationValue);
		isApplicableMatch.registerObject("mType", mType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject annotation, EObject mAccess,
			EObject mAnnotationValue, EObject AnnotationMemberValuePairToTAnnotationValue, EObject mTypeToTType,
			EObject tType, EObject tValue, EObject mOwner, EObject mValueToTValue, EObject mValue,
			EObject tAnnotationValue, EObject mType) {
		ruleresult.registerObject("annotation", annotation);
		ruleresult.registerObject("mAccess", mAccess);
		ruleresult.registerObject("mAnnotationValue", mAnnotationValue);
		ruleresult.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("tValue", tValue);
		ruleresult.registerObject("mOwner", mOwner);
		ruleresult.registerObject("mValueToTValue", mValueToTValue);
		ruleresult.registerObject("mValue", mValue);
		ruleresult.registerObject("tAnnotationValue", tAnnotationValue);
		ruleresult.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tValue").eClass())
				.equals("basic.annotations.TClassNode.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_45(EMoflonEdge _edge_tClass) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_20_2_testcorematchandDECs_blackFFFB(_edge_tClass)) {
			TAbstractType tType = (TAbstractType) result2_black[0];
			TClassNode tValue = (TClassNode) result2_black[1];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_black[2];
			Object[] result2_green = AnnotationMemberValueClassImpl
					.pattern_AnnotationMemberValueClass_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationMemberValueClassImpl
					.pattern_AnnotationMemberValueClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tType, tValue, tAnnotationValue)) {
				// 
				if (AnnotationMemberValueClassImpl
						.pattern_AnnotationMemberValueClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationMemberValueClassImpl
							.pattern_AnnotationMemberValueClass_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationMemberValueClassImpl
							.pattern_AnnotationMemberValueClass_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_45(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_blackFFFFFFB(_edge_type)) {
			Annotation annotation = (Annotation) result2_black[0];
			TypeAccess mAccess = (TypeAccess) result2_black[1];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_black[2];
			BodyDeclaration mOwner = (BodyDeclaration) result2_black[3];
			TypeLiteral mValue = (TypeLiteral) result2_black[4];
			Type mType = (Type) result2_black[5];
			Object[] result2_green = AnnotationMemberValueClassImpl
					.pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationMemberValueClassImpl
					.pattern_AnnotationMemberValueClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
							this, match, annotation, mAccess, mAnnotationValue, mOwner, mValue, mType)) {
				// 
				if (AnnotationMemberValueClassImpl
						.pattern_AnnotationMemberValueClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationMemberValueClassImpl
							.pattern_AnnotationMemberValueClass_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationMemberValueClassImpl
							.pattern_AnnotationMemberValueClass_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnnotationMemberValueClass");
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
		ruleResult.setRule("AnnotationMemberValueClass");
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

		Object[] result1_black = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Annotation annotation = (Annotation) result2_bindingAndBlack[0];
		TypeAccess mAccess = (TypeAccess) result2_bindingAndBlack[1];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_bindingAndBlack[2];
		TAbstractType tType = (TAbstractType) result2_bindingAndBlack[3];
		TClassNode tValue = (TClassNode) result2_bindingAndBlack[4];
		BodyDeclaration mOwner = (BodyDeclaration) result2_bindingAndBlack[5];
		TypeLiteral mValue = (TypeLiteral) result2_bindingAndBlack[6];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_bindingAndBlack[7];
		Type mType = (Type) result2_bindingAndBlack[8];

		Object[] result3_bindingAndBlack = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBB(this, annotation,
						mAccess, mAnnotationValue, tType, tValue, mOwner, mValue, tAnnotationValue, mType, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[annotation] = " + annotation + ", " + "[mAccess] = " + mAccess + ", " + "[mAnnotationValue] = "
					+ mAnnotationValue + ", " + "[tType] = " + tType + ", " + "[tValue] = " + tValue + ", "
					+ "[mOwner] = " + mOwner + ", " + "[mValue] = " + mValue + ", " + "[tAnnotationValue] = "
					+ tAnnotationValue + ", " + "[mType] = " + mType + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnnotationMemberValueClassImpl
					.pattern_AnnotationMemberValueClass_24_5_matchcorrcontext_blackBFFBBBBB(mAnnotationValue, tType,
							tAnnotationValue, mType, sourceMatch, targetMatch)) {
				AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result5_black[1];
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[2];
				Object[] result5_green = AnnotationMemberValueClassImpl
						.pattern_AnnotationMemberValueClass_24_5_matchcorrcontext_greenBBBBF(
								AnnotationMemberValuePairToTAnnotationValue, mTypeToTType, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = AnnotationMemberValueClassImpl
						.pattern_AnnotationMemberValueClass_24_6_createcorrespondence_blackBBBBBBBBBB(annotation,
								mAccess, mAnnotationValue, tType, tValue, mOwner, mValue, tAnnotationValue, mType,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[annotation] = "
							+ annotation + ", " + "[mAccess] = " + mAccess + ", " + "[mAnnotationValue] = "
							+ mAnnotationValue + ", " + "[tType] = " + tType + ", " + "[tValue] = " + tValue + ", "
							+ "[mOwner] = " + mOwner + ", " + "[mValue] = " + mValue + ", " + "[tAnnotationValue] = "
							+ tAnnotationValue + ", " + "[mType] = " + mType + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_24_6_createcorrespondence_greenBFBB(
						tValue, mValue, ccMatch);
				//nothing LiteralToTNode mValueToTValue = (LiteralToTNode) result6_green[1];

				Object[] result7_black = AnnotationMemberValueClassImpl
						.pattern_AnnotationMemberValueClass_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationMemberValueClassImpl
						.pattern_AnnotationMemberValueClass_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, TAbstractType tType, TClassNode tValue, BodyDeclaration mOwner,
			TypeLiteral mValue, TAnnotationValue tAnnotationValue, Type mType, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue,
			BodyDeclaration mOwner, TypeLiteral mValue, Type mType) {// 
		Object[] result1_black = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_27_1_matchtggpattern_blackBBBBBB(annotation, mAccess,
						mAnnotationValue, mOwner, mValue, mType);
		if (result1_black != null) {
			return AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_27_2_expressionF();
		} else {
			return AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAbstractType tType, TClassNode tValue, TAnnotationValue tAnnotationValue) {// 
		Object[] result1_black = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_28_1_matchtggpattern_blackBBB(tType, tValue, tAnnotationValue);
		if (result1_black != null) {
			return AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_28_2_expressionF();
		} else {
			return AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValueParameter,
			TypeToTAbstractType mTypeToTTypeParameter) {

		Object[] result1_black = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberValueClassImpl
				.pattern_AnnotationMemberValueClass_29_2_isapplicablecore_blackFFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList AnnotationMemberValuePairToTAnnotationValueList = (RuleEntryList) result2_black[0];
			Annotation annotation = (Annotation) result2_black[1];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_black[2];
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result2_black[3];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_black[4];
			BodyDeclaration mOwner = (BodyDeclaration) result2_black[5];
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[6];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[7];
			Type mType = (Type) result2_black[8];
			TAbstractType tType = (TAbstractType) result2_black[9];

			Object[] result3_bindingAndBlack = AnnotationMemberValueClassImpl
					.pattern_AnnotationMemberValueClass_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
							isApplicableMatch, annotation, mAnnotationValue,
							AnnotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, mOwner, tAnnotationValue,
							mType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[annotation] = " + annotation + ", "
						+ "[mAnnotationValue] = " + mAnnotationValue + ", "
						+ "[AnnotationMemberValuePairToTAnnotationValue] = "
						+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
						+ "[tType] = " + tType + ", " + "[mOwner] = " + mOwner + ", " + "[tAnnotationValue] = "
						+ tAnnotationValue + ", " + "[mType] = " + mType + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = AnnotationMemberValueClassImpl
						.pattern_AnnotationMemberValueClass_29_5_checknacs_blackBBBBBBBB(annotation, mAnnotationValue,
								AnnotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, mOwner,
								tAnnotationValue, mType);
				if (result5_black != null) {

					Object[] result6_black = AnnotationMemberValueClassImpl
							.pattern_AnnotationMemberValueClass_29_6_perform_blackBBBBBBBBB(annotation,
									mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue, mTypeToTType, tType,
									mOwner, tAnnotationValue, mType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[annotation] = "
								+ annotation + ", " + "[mAnnotationValue] = " + mAnnotationValue + ", "
								+ "[AnnotationMemberValuePairToTAnnotationValue] = "
								+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mTypeToTType] = "
								+ mTypeToTType + ", " + "[tType] = " + tType + ", " + "[mOwner] = " + mOwner + ", "
								+ "[tAnnotationValue] = " + tAnnotationValue + ", " + "[mType] = " + mType + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_29_6_perform_greenFBBFFFBBB(
							mAnnotationValue, tType, tAnnotationValue, mType, ruleResult);
					//nothing TypeAccess mAccess = (TypeAccess) result6_green[0];
					//nothing TClassNode tValue = (TClassNode) result6_green[3];
					//nothing LiteralToTNode mValueToTValue = (LiteralToTNode) result6_green[4];
					//nothing TypeLiteral mValue = (TypeLiteral) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberValueClassImpl.pattern_AnnotationMemberValueClass_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, Type mType, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("annotation", annotation);
		isApplicableMatch.registerObject("mAnnotationValue", mAnnotationValue);
		isApplicableMatch.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mOwner", mOwner);
		isApplicableMatch.registerObject("tAnnotationValue", tAnnotationValue);
		isApplicableMatch.registerObject("mType", mType);
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
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___IS_APPROPRIATE_FWD__MATCH_ANNOTATION_TYPEACCESS_ANNOTATIONMEMBERVALUEPAIR_BODYDECLARATION_TYPELITERAL_TYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
					(TypeAccess) arguments.get(2), (AnnotationMemberValuePair) arguments.get(3),
					(BodyDeclaration) arguments.get(4), (TypeLiteral) arguments.get(5), (Type) arguments.get(6));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANNOTATION_TYPEACCESS_ANNOTATIONMEMBERVALUEPAIR_BODYDECLARATION_TYPELITERAL_TYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
					(TypeAccess) arguments.get(2), (AnnotationMemberValuePair) arguments.get(3),
					(BodyDeclaration) arguments.get(4), (TypeLiteral) arguments.get(5), (Type) arguments.get(6));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANNOTATION_TYPEACCESS_ANNOTATIONMEMBERVALUEPAIR_BODYDECLARATION_TYPELITERAL_TYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
					(TypeAccess) arguments.get(2), (AnnotationMemberValuePair) arguments.get(3),
					(BodyDeclaration) arguments.get(4), (TypeLiteral) arguments.get(5), (Type) arguments.get(6));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ANNOTATION_TYPEACCESS_ANNOTATIONMEMBERVALUEPAIR_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_BODYDECLARATION_TYPELITERAL_TANNOTATIONVALUE_TYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Annotation) arguments.get(1),
					(TypeAccess) arguments.get(2), (AnnotationMemberValuePair) arguments.get(3),
					(AnnotationMemberValuePairToTAnnotationValue) arguments.get(4),
					(TypeToTAbstractType) arguments.get(5), (TAbstractType) arguments.get(6),
					(BodyDeclaration) arguments.get(7), (TypeLiteral) arguments.get(8),
					(TAnnotationValue) arguments.get(9), (Type) arguments.get(10));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___IS_APPROPRIATE_BWD__MATCH_TABSTRACTTYPE_TCLASSNODE_TANNOTATIONVALUE:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TClassNode) arguments.get(2), (TAnnotationValue) arguments.get(3));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTTYPE_TCLASSNODE_TANNOTATIONVALUE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TClassNode) arguments.get(2), (TAnnotationValue) arguments.get(3));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTTYPE_TCLASSNODE_TANNOTATIONVALUE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TClassNode) arguments.get(2), (TAnnotationValue) arguments.get(3));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TCLASSNODE_BODYDECLARATION_TANNOTATIONVALUE_TYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Annotation) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2),
					(AnnotationMemberValuePairToTAnnotationValue) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (TAbstractType) arguments.get(5),
					(TClassNode) arguments.get(6), (BodyDeclaration) arguments.get(7),
					(TAnnotationValue) arguments.get(8), (Type) arguments.get(9));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_45__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_45((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_45__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_45((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__ANNOTATION_TYPEACCESS_ANNOTATIONMEMBERVALUEPAIR_TABSTRACTTYPE_TCLASSNODE_BODYDECLARATION_TYPELITERAL_TANNOTATIONVALUE_TYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Annotation) arguments.get(0), (TypeAccess) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2), (TAbstractType) arguments.get(3),
					(TClassNode) arguments.get(4), (BodyDeclaration) arguments.get(5), (TypeLiteral) arguments.get(6),
					(TAnnotationValue) arguments.get(7), (Type) arguments.get(8), (Match) arguments.get(9),
					(Match) arguments.get(10));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___CHECK_DEC_FWD__ANNOTATION_TYPEACCESS_ANNOTATIONMEMBERVALUEPAIR_BODYDECLARATION_TYPELITERAL_TYPE:
			return checkDEC_FWD((Annotation) arguments.get(0), (TypeAccess) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2), (BodyDeclaration) arguments.get(3),
					(TypeLiteral) arguments.get(4), (Type) arguments.get(5));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___CHECK_DEC_BWD__TABSTRACTTYPE_TCLASSNODE_TANNOTATIONVALUE:
			return checkDEC_BWD((TAbstractType) arguments.get(0), (TClassNode) arguments.get(1),
					(TAnnotationValue) arguments.get(2));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(AnnotationMemberValuePairToTAnnotationValue) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_BODYDECLARATION_TANNOTATIONVALUE_TYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Annotation) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2),
					(AnnotationMemberValuePairToTAnnotationValue) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (TAbstractType) arguments.get(5),
					(BodyDeclaration) arguments.get(6), (TAnnotationValue) arguments.get(7), (Type) arguments.get(8),
					(ModelgeneratorRuleResult) arguments.get(9));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnnotationMemberValueClass_0_1_initialbindings_blackBBBBBBBB(
			AnnotationMemberValueClass _this, Match match, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, TypeLiteral mValue, Type mType) {
		return new Object[] { _this, match, annotation, mAccess, mAnnotationValue, mOwner, mValue, mType };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_0_2_SolveCSP_bindingFBBBBBBBB(
			AnnotationMemberValueClass _this, Match match, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, TypeLiteral mValue, Type mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, annotation, mAccess, mAnnotationValue, mOwner,
				mValue, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, annotation, mAccess, mAnnotationValue, mOwner, mValue, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_0_2_SolveCSP_bindingAndBlackFBBBBBBBB(
			AnnotationMemberValueClass _this, Match match, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, TypeLiteral mValue, Type mType) {
		Object[] result_pattern_AnnotationMemberValueClass_0_2_SolveCSP_binding = pattern_AnnotationMemberValueClass_0_2_SolveCSP_bindingFBBBBBBBB(
				_this, match, annotation, mAccess, mAnnotationValue, mOwner, mValue, mType);
		if (result_pattern_AnnotationMemberValueClass_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueClass_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueClass_0_2_SolveCSP_black = pattern_AnnotationMemberValueClass_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueClass_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, annotation, mAccess, mAnnotationValue, mOwner, mValue, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueClass_0_3_CheckCSP_expressionFBB(
			AnnotationMemberValueClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_0_4_collectelementstobetranslated_blackBBBBBBB(
			Match match, Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue,
			BodyDeclaration mOwner, TypeLiteral mValue, Type mType) {
		return new Object[] { match, annotation, mAccess, mAnnotationValue, mOwner, mValue, mType };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_0_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue, TypeLiteral mValue,
			Type mType) {
		EMoflonEdge mValue__mAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationValue__mValue____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mAccess);
		match.getToBeTranslatedNodes().add(mValue);
		String mValue__mAccess____type_name_prime = "type";
		String mAccess__mType____type_name_prime = "type";
		String mType__mAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mAnnotationValue__mValue____value_name_prime = "value";
		mValue__mAccess____type.setSrc(mValue);
		mValue__mAccess____type.setTrg(mAccess);
		match.getToBeTranslatedEdges().add(mValue__mAccess____type);
		mAccess__mType____type.setSrc(mAccess);
		mAccess__mType____type.setTrg(mType);
		match.getToBeTranslatedEdges().add(mAccess__mType____type);
		mType__mAccess____usagesInTypeAccess.setSrc(mType);
		mType__mAccess____usagesInTypeAccess.setTrg(mAccess);
		match.getToBeTranslatedEdges().add(mType__mAccess____usagesInTypeAccess);
		mAnnotationValue__mValue____value.setSrc(mAnnotationValue);
		mAnnotationValue__mValue____value.setTrg(mValue);
		match.getToBeTranslatedEdges().add(mAnnotationValue__mValue____value);
		mValue__mAccess____type.setName(mValue__mAccess____type_name_prime);
		mAccess__mType____type.setName(mAccess__mType____type_name_prime);
		mType__mAccess____usagesInTypeAccess.setName(mType__mAccess____usagesInTypeAccess_name_prime);
		mAnnotationValue__mValue____value.setName(mAnnotationValue__mValue____value_name_prime);
		return new Object[] { match, mAccess, mAnnotationValue, mValue, mType, mValue__mAccess____type,
				mAccess__mType____type, mType__mAccess____usagesInTypeAccess, mAnnotationValue__mValue____value };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_0_5_collectcontextelements_blackBBBBBBB(Match match,
			Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue,
			BodyDeclaration mOwner, TypeLiteral mValue, Type mType) {
		return new Object[] { match, annotation, mAccess, mAnnotationValue, mOwner, mValue, mType };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_0_5_collectcontextelements_greenBBBBBFF(Match match,
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, Type mType) {
		EMoflonEdge annotation__mAnnotationValue____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOwner__annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(annotation);
		match.getContextNodes().add(mAnnotationValue);
		match.getContextNodes().add(mOwner);
		match.getContextNodes().add(mType);
		String annotation__mAnnotationValue____values_name_prime = "values";
		String mOwner__annotation____annotations_name_prime = "annotations";
		annotation__mAnnotationValue____values.setSrc(annotation);
		annotation__mAnnotationValue____values.setTrg(mAnnotationValue);
		match.getContextEdges().add(annotation__mAnnotationValue____values);
		mOwner__annotation____annotations.setSrc(mOwner);
		mOwner__annotation____annotations.setTrg(annotation);
		match.getContextEdges().add(mOwner__annotation____annotations);
		annotation__mAnnotationValue____values.setName(annotation__mAnnotationValue____values_name_prime);
		mOwner__annotation____annotations.setName(mOwner__annotation____annotations_name_prime);
		return new Object[] { match, annotation, mAnnotationValue, mOwner, mType,
				annotation__mAnnotationValue____values, mOwner__annotation____annotations };
	}

	public static final void pattern_AnnotationMemberValueClass_0_6_registerobjectstomatch_expressionBBBBBBBB(
			AnnotationMemberValueClass _this, Match match, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, TypeLiteral mValue, Type mType) {
		_this.registerObjectsToMatch_FWD(match, annotation, mAccess, mAnnotationValue, mOwner, mValue, mType);

	}

	public static final boolean pattern_AnnotationMemberValueClass_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueClass_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_1_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("annotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("mAccess");
		EObject _localVariable_2 = isApplicableMatch.getObject("mAnnotationValue");
		EObject _localVariable_3 = isApplicableMatch.getObject("AnnotationMemberValuePairToTAnnotationValue");
		EObject _localVariable_4 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_5 = isApplicableMatch.getObject("tType");
		EObject _localVariable_6 = isApplicableMatch.getObject("mOwner");
		EObject _localVariable_7 = isApplicableMatch.getObject("mValue");
		EObject _localVariable_8 = isApplicableMatch.getObject("tAnnotationValue");
		EObject _localVariable_9 = isApplicableMatch.getObject("mType");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpMAccess = _localVariable_1;
		EObject tmpMAnnotationValue = _localVariable_2;
		EObject tmpAnnotationMemberValuePairToTAnnotationValue = _localVariable_3;
		EObject tmpMTypeToTType = _localVariable_4;
		EObject tmpTType = _localVariable_5;
		EObject tmpMOwner = _localVariable_6;
		EObject tmpMValue = _localVariable_7;
		EObject tmpTAnnotationValue = _localVariable_8;
		EObject tmpMType = _localVariable_9;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpMAccess instanceof TypeAccess) {
				TypeAccess mAccess = (TypeAccess) tmpMAccess;
				if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
					AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
					if (tmpAnnotationMemberValuePairToTAnnotationValue instanceof AnnotationMemberValuePairToTAnnotationValue) {
						AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) tmpAnnotationMemberValuePairToTAnnotationValue;
						if (tmpMTypeToTType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
							if (tmpTType instanceof TAbstractType) {
								TAbstractType tType = (TAbstractType) tmpTType;
								if (tmpMOwner instanceof BodyDeclaration) {
									BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
									if (tmpMValue instanceof TypeLiteral) {
										TypeLiteral mValue = (TypeLiteral) tmpMValue;
										if (tmpTAnnotationValue instanceof TAnnotationValue) {
											TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
											if (tmpMType instanceof Type) {
												Type mType = (Type) tmpMType;
												return new Object[] { annotation, mAccess, mAnnotationValue,
														annotationMemberValuePairToTAnnotationValue, mTypeToTType,
														tType, mOwner, mValue, tAnnotationValue, mType,
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
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_1_1_performtransformation_blackBBBBBBBBBBFBB(
			Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, BodyDeclaration mOwner, TypeLiteral mValue,
			TAnnotationValue tAnnotationValue, Type mType, AnnotationMemberValueClass _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { annotation, mAccess, mAnnotationValue,
						annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, mOwner, mValue,
						tAnnotationValue, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			AnnotationMemberValueClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationMemberValueClass_1_1_performtransformation_binding = pattern_AnnotationMemberValueClass_1_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationMemberValueClass_1_1_performtransformation_binding != null) {
			Annotation annotation = (Annotation) result_pattern_AnnotationMemberValueClass_1_1_performtransformation_binding[0];
			TypeAccess mAccess = (TypeAccess) result_pattern_AnnotationMemberValueClass_1_1_performtransformation_binding[1];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberValueClass_1_1_performtransformation_binding[2];
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result_pattern_AnnotationMemberValueClass_1_1_performtransformation_binding[3];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_AnnotationMemberValueClass_1_1_performtransformation_binding[4];
			TAbstractType tType = (TAbstractType) result_pattern_AnnotationMemberValueClass_1_1_performtransformation_binding[5];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberValueClass_1_1_performtransformation_binding[6];
			TypeLiteral mValue = (TypeLiteral) result_pattern_AnnotationMemberValueClass_1_1_performtransformation_binding[7];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberValueClass_1_1_performtransformation_binding[8];
			Type mType = (Type) result_pattern_AnnotationMemberValueClass_1_1_performtransformation_binding[9];

			Object[] result_pattern_AnnotationMemberValueClass_1_1_performtransformation_black = pattern_AnnotationMemberValueClass_1_1_performtransformation_blackBBBBBBBBBBFBB(
					annotation, mAccess, mAnnotationValue, annotationMemberValuePairToTAnnotationValue, mTypeToTType,
					tType, mOwner, mValue, tAnnotationValue, mType, _this, isApplicableMatch);
			if (result_pattern_AnnotationMemberValueClass_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationMemberValueClass_1_1_performtransformation_black[10];

				return new Object[] { annotation, mAccess, mAnnotationValue,
						annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, mOwner, mValue,
						tAnnotationValue, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_1_1_performtransformation_greenBFFBB(
			TAbstractType tType, TypeLiteral mValue, TAnnotationValue tAnnotationValue) {
		TClassNode tValue = AnnotationsFactory.eINSTANCE.createTClassNode();
		LiteralToTNode mValueToTValue = PmFactory.eINSTANCE.createLiteralToTNode();
		tValue.setTClass(tType);
		tAnnotationValue.getTValue().add(tValue);
		mValueToTValue.setSource(mValue);
		mValueToTValue.setTarget(tValue);
		return new Object[] { tType, tValue, mValueToTValue, mValue, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_1_2_collecttranslatedelements_blackBBBB(
			TypeAccess mAccess, TClassNode tValue, LiteralToTNode mValueToTValue, TypeLiteral mValue) {
		return new Object[] { mAccess, tValue, mValueToTValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_1_2_collecttranslatedelements_greenFBBBB(
			TypeAccess mAccess, TClassNode tValue, LiteralToTNode mValueToTValue, TypeLiteral mValue) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mAccess);
		ruleresult.getCreatedElements().add(tValue);
		ruleresult.getCreatedLinkElements().add(mValueToTValue);
		ruleresult.getTranslatedElements().add(mValue);
		return new Object[] { ruleresult, mAccess, tValue, mValueToTValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject annotation, EObject mAccess, EObject mAnnotationValue,
			EObject annotationMemberValuePairToTAnnotationValue, EObject mTypeToTType, EObject tType, EObject tValue,
			EObject mOwner, EObject mValueToTValue, EObject mValue, EObject tAnnotationValue, EObject mType) {
		if (!annotation.equals(mAccess)) {
			if (!annotation.equals(mAnnotationValue)) {
				if (!annotation.equals(mTypeToTType)) {
					if (!annotation.equals(tType)) {
						if (!annotation.equals(tValue)) {
							if (!annotation.equals(mOwner)) {
								if (!annotation.equals(mValueToTValue)) {
									if (!annotation.equals(mValue)) {
										if (!annotation.equals(tAnnotationValue)) {
											if (!annotation.equals(mType)) {
												if (!mAccess.equals(mAnnotationValue)) {
													if (!mAccess.equals(mTypeToTType)) {
														if (!mAccess.equals(tType)) {
															if (!mAccess.equals(tValue)) {
																if (!mAccess.equals(mOwner)) {
																	if (!mAccess.equals(mValueToTValue)) {
																		if (!mAccess.equals(mValue)) {
																			if (!mAccess.equals(tAnnotationValue)) {
																				if (!mAccess.equals(mType)) {
																					if (!mAnnotationValue
																							.equals(mTypeToTType)) {
																						if (!mAnnotationValue
																								.equals(tType)) {
																							if (!mAnnotationValue
																									.equals(tValue)) {
																								if (!mAnnotationValue
																										.equals(mOwner)) {
																									if (!mAnnotationValue
																											.equals(mValueToTValue)) {
																										if (!mAnnotationValue
																												.equals(mValue)) {
																											if (!mAnnotationValue
																													.equals(tAnnotationValue)) {
																												if (!mAnnotationValue
																														.equals(mType)) {
																													if (!annotationMemberValuePairToTAnnotationValue
																															.equals(annotation)) {
																														if (!annotationMemberValuePairToTAnnotationValue
																																.equals(mAccess)) {
																															if (!annotationMemberValuePairToTAnnotationValue
																																	.equals(mAnnotationValue)) {
																																if (!annotationMemberValuePairToTAnnotationValue
																																		.equals(mTypeToTType)) {
																																	if (!annotationMemberValuePairToTAnnotationValue
																																			.equals(tType)) {
																																		if (!annotationMemberValuePairToTAnnotationValue
																																				.equals(tValue)) {
																																			if (!annotationMemberValuePairToTAnnotationValue
																																					.equals(mOwner)) {
																																				if (!annotationMemberValuePairToTAnnotationValue
																																						.equals(mValueToTValue)) {
																																					if (!annotationMemberValuePairToTAnnotationValue
																																							.equals(mValue)) {
																																						if (!annotationMemberValuePairToTAnnotationValue
																																								.equals(tAnnotationValue)) {
																																							if (!annotationMemberValuePairToTAnnotationValue
																																									.equals(mType)) {
																																								if (!mTypeToTType
																																										.equals(tType)) {
																																									if (!mTypeToTType
																																											.equals(tValue)) {
																																										if (!mTypeToTType
																																												.equals(mValueToTValue)) {
																																											if (!mTypeToTType
																																													.equals(mValue)) {
																																												if (!mTypeToTType
																																														.equals(tAnnotationValue)) {
																																													if (!tType
																																															.equals(tValue)) {
																																														if (!mOwner
																																																.equals(mTypeToTType)) {
																																															if (!mOwner
																																																	.equals(tType)) {
																																																if (!mOwner
																																																		.equals(tValue)) {
																																																	if (!mOwner
																																																			.equals(mValueToTValue)) {
																																																		if (!mOwner
																																																				.equals(mValue)) {
																																																			if (!mOwner
																																																					.equals(tAnnotationValue)) {
																																																				if (!mOwner
																																																						.equals(mType)) {
																																																					if (!mValueToTValue
																																																							.equals(tType)) {
																																																						if (!mValueToTValue
																																																								.equals(tValue)) {
																																																							if (!mValueToTValue
																																																									.equals(tAnnotationValue)) {
																																																								if (!mValue
																																																										.equals(tType)) {
																																																									if (!mValue
																																																											.equals(tValue)) {
																																																										if (!mValue
																																																												.equals(mValueToTValue)) {
																																																											if (!mValue
																																																													.equals(tAnnotationValue)) {
																																																												if (!tAnnotationValue
																																																														.equals(tType)) {
																																																													if (!tAnnotationValue
																																																															.equals(tValue)) {
																																																														if (!mType
																																																																.equals(mTypeToTType)) {
																																																															if (!mType
																																																																	.equals(tType)) {
																																																																if (!mType
																																																																		.equals(tValue)) {
																																																																	if (!mType
																																																																			.equals(mValueToTValue)) {
																																																																		if (!mType
																																																																				.equals(mValue)) {
																																																																			if (!mType
																																																																					.equals(tAnnotationValue)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						annotation,
																																																																						mAccess,
																																																																						mAnnotationValue,
																																																																						annotationMemberValuePairToTAnnotationValue,
																																																																						mTypeToTType,
																																																																						tType,
																																																																						tValue,
																																																																						mOwner,
																																																																						mValueToTValue,
																																																																						mValue,
																																																																						tAnnotationValue,
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
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationMemberValueClass_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject mAccess, EObject mAnnotationValue, EObject tType, EObject tValue,
			EObject mValueToTValue, EObject mValue, EObject tAnnotationValue, EObject mType) {
		EMoflonEdge mValue__mAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mValueToTValue__mValue____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tValue__tType____tClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationValue__mValue____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mValueToTValue__tValue____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationValue__tValue____tValue = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationMemberValueClass";
		String mValue__mAccess____type_name_prime = "type";
		String mAccess__mType____type_name_prime = "type";
		String mType__mAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mValueToTValue__mValue____source_name_prime = "source";
		String tValue__tType____tClass_name_prime = "tClass";
		String mAnnotationValue__mValue____value_name_prime = "value";
		String mValueToTValue__tValue____target_name_prime = "target";
		String tAnnotationValue__tValue____tValue_name_prime = "tValue";
		mValue__mAccess____type.setSrc(mValue);
		mValue__mAccess____type.setTrg(mAccess);
		ruleresult.getTranslatedEdges().add(mValue__mAccess____type);
		mAccess__mType____type.setSrc(mAccess);
		mAccess__mType____type.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mAccess__mType____type);
		mType__mAccess____usagesInTypeAccess.setSrc(mType);
		mType__mAccess____usagesInTypeAccess.setTrg(mAccess);
		ruleresult.getTranslatedEdges().add(mType__mAccess____usagesInTypeAccess);
		mValueToTValue__mValue____source.setSrc(mValueToTValue);
		mValueToTValue__mValue____source.setTrg(mValue);
		ruleresult.getCreatedEdges().add(mValueToTValue__mValue____source);
		tValue__tType____tClass.setSrc(tValue);
		tValue__tType____tClass.setTrg(tType);
		ruleresult.getCreatedEdges().add(tValue__tType____tClass);
		mAnnotationValue__mValue____value.setSrc(mAnnotationValue);
		mAnnotationValue__mValue____value.setTrg(mValue);
		ruleresult.getTranslatedEdges().add(mAnnotationValue__mValue____value);
		mValueToTValue__tValue____target.setSrc(mValueToTValue);
		mValueToTValue__tValue____target.setTrg(tValue);
		ruleresult.getCreatedEdges().add(mValueToTValue__tValue____target);
		tAnnotationValue__tValue____tValue.setSrc(tAnnotationValue);
		tAnnotationValue__tValue____tValue.setTrg(tValue);
		ruleresult.getCreatedEdges().add(tAnnotationValue__tValue____tValue);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mValue__mAccess____type.setName(mValue__mAccess____type_name_prime);
		mAccess__mType____type.setName(mAccess__mType____type_name_prime);
		mType__mAccess____usagesInTypeAccess.setName(mType__mAccess____usagesInTypeAccess_name_prime);
		mValueToTValue__mValue____source.setName(mValueToTValue__mValue____source_name_prime);
		tValue__tType____tClass.setName(tValue__tType____tClass_name_prime);
		mAnnotationValue__mValue____value.setName(mAnnotationValue__mValue____value_name_prime);
		mValueToTValue__tValue____target.setName(mValueToTValue__tValue____target_name_prime);
		tAnnotationValue__tValue____tValue.setName(tAnnotationValue__tValue____tValue_name_prime);
		return new Object[] { ruleresult, mAccess, mAnnotationValue, tType, tValue, mValueToTValue, mValue,
				tAnnotationValue, mType, mValue__mAccess____type, mAccess__mType____type,
				mType__mAccess____usagesInTypeAccess, mValueToTValue__mValue____source, tValue__tType____tClass,
				mAnnotationValue__mValue____value, mValueToTValue__tValue____target,
				tAnnotationValue__tValue____tValue };
	}

	public static final void pattern_AnnotationMemberValueClass_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			AnnotationMemberValueClass _this, PerformRuleResult ruleresult, EObject annotation, EObject mAccess,
			EObject mAnnotationValue, EObject annotationMemberValuePairToTAnnotationValue, EObject mTypeToTType,
			EObject tType, EObject tValue, EObject mOwner, EObject mValueToTValue, EObject mValue,
			EObject tAnnotationValue, EObject mType) {
		_this.registerObjects_FWD(ruleresult, annotation, mAccess, mAnnotationValue,
				annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, tValue, mOwner, mValueToTValue,
				mValue, tAnnotationValue, mType);

	}

	public static final PerformRuleResult pattern_AnnotationMemberValueClass_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_2_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationMemberValueClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationMemberValueClass _this) {
		Object[] result_pattern_AnnotationMemberValueClass_2_1_preparereturnvalue_binding = pattern_AnnotationMemberValueClass_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueClass_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationMemberValueClass_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueClass_2_1_preparereturnvalue_black = pattern_AnnotationMemberValueClass_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationMemberValueClass_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationMemberValueClass_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationMemberValueClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_2_2_corematch_bindingFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("annotation");
		EObject _localVariable_1 = match.getObject("mAccess");
		EObject _localVariable_2 = match.getObject("mAnnotationValue");
		EObject _localVariable_3 = match.getObject("mOwner");
		EObject _localVariable_4 = match.getObject("mValue");
		EObject _localVariable_5 = match.getObject("mType");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpMAccess = _localVariable_1;
		EObject tmpMAnnotationValue = _localVariable_2;
		EObject tmpMOwner = _localVariable_3;
		EObject tmpMValue = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpMAccess instanceof TypeAccess) {
				TypeAccess mAccess = (TypeAccess) tmpMAccess;
				if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
					AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
					if (tmpMOwner instanceof BodyDeclaration) {
						BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
						if (tmpMValue instanceof TypeLiteral) {
							TypeLiteral mValue = (TypeLiteral) tmpMValue;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								return new Object[] { annotation, mAccess, mAnnotationValue, mOwner, mValue, mType,
										match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueClass_2_2_corematch_blackBBBFFFBBFBB(
			Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue,
			BodyDeclaration mOwner, TypeLiteral mValue, Type mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue.class,
						"source")) {
			TAnnotationValue tAnnotationValue = annotationMemberValuePairToTAnnotationValue.getTarget();
			if (tAnnotationValue != null) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
					TAbstractType tType = mTypeToTType.getTarget();
					if (tType != null) {
						_result.add(new Object[] { annotation, mAccess, mAnnotationValue,
								annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, mOwner, mValue,
								tAnnotationValue, mType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueClass_2_3_findcontext_blackBBBBBBBBBB(
			Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, BodyDeclaration mOwner, TypeLiteral mValue,
			TAnnotationValue tAnnotationValue, Type mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mAccess.equals(mValue.getType())) {
			if (mType.equals(mAccess.getType())) {
				if (tAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getTarget())) {
					if (annotation.getValues().contains(mAnnotationValue)) {
						if (mAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getSource())) {
							if (mOwner.getAnnotations().contains(annotation)) {
								if (mValue.equals(mAnnotationValue.getValue())) {
									if (tType.equals(mTypeToTType.getTarget())) {
										if (mType.equals(mTypeToTType.getSource())) {
											_result.add(new Object[] { annotation, mAccess, mAnnotationValue,
													annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType,
													mOwner, mValue, tAnnotationValue, mType });
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

	public static final Object[] pattern_AnnotationMemberValueClass_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFF(
			Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, BodyDeclaration mOwner, TypeLiteral mValue,
			TAnnotationValue tAnnotationValue, Type mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mValue__mAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge annotation__mAnnotationValue____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mOwner__annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationValue__mValue____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mValue__mAccess____type_name_prime = "type";
		String mAccess__mType____type_name_prime = "type";
		String mType__mAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime = "target";
		String annotation__mAnnotationValue____values_name_prime = "values";
		String annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source_name_prime = "source";
		String mOwner__annotation____annotations_name_prime = "annotations";
		String mAnnotationValue__mValue____value_name_prime = "value";
		String mTypeToTType__tType____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(mAccess);
		isApplicableMatch.getAllContextElements().add(mAnnotationValue);
		isApplicableMatch.getAllContextElements().add(annotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mOwner);
		isApplicableMatch.getAllContextElements().add(mValue);
		isApplicableMatch.getAllContextElements().add(tAnnotationValue);
		isApplicableMatch.getAllContextElements().add(mType);
		mValue__mAccess____type.setSrc(mValue);
		mValue__mAccess____type.setTrg(mAccess);
		isApplicableMatch.getAllContextElements().add(mValue__mAccess____type);
		mAccess__mType____type.setSrc(mAccess);
		mAccess__mType____type.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mAccess__mType____type);
		mType__mAccess____usagesInTypeAccess.setSrc(mType);
		mType__mAccess____usagesInTypeAccess.setTrg(mAccess);
		isApplicableMatch.getAllContextElements().add(mType__mAccess____usagesInTypeAccess);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setSrc(annotationMemberValuePairToTAnnotationValue);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target.setTrg(tAnnotationValue);
		isApplicableMatch.getAllContextElements()
				.add(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target);
		annotation__mAnnotationValue____values.setSrc(annotation);
		annotation__mAnnotationValue____values.setTrg(mAnnotationValue);
		isApplicableMatch.getAllContextElements().add(annotation__mAnnotationValue____values);
		annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source
				.setSrc(annotationMemberValuePairToTAnnotationValue);
		annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source.setTrg(mAnnotationValue);
		isApplicableMatch.getAllContextElements()
				.add(annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source);
		mOwner__annotation____annotations.setSrc(mOwner);
		mOwner__annotation____annotations.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(mOwner__annotation____annotations);
		mAnnotationValue__mValue____value.setSrc(mAnnotationValue);
		mAnnotationValue__mValue____value.setTrg(mValue);
		isApplicableMatch.getAllContextElements().add(mAnnotationValue__mValue____value);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mValue__mAccess____type.setName(mValue__mAccess____type_name_prime);
		mAccess__mType____type.setName(mAccess__mType____type_name_prime);
		mType__mAccess____usagesInTypeAccess.setName(mType__mAccess____usagesInTypeAccess_name_prime);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setName(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime);
		annotation__mAnnotationValue____values.setName(annotation__mAnnotationValue____values_name_prime);
		annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source
				.setName(annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source_name_prime);
		mOwner__annotation____annotations.setName(mOwner__annotation____annotations_name_prime);
		mAnnotationValue__mValue____value.setName(mAnnotationValue__mValue____value_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		return new Object[] { annotation, mAccess, mAnnotationValue, annotationMemberValuePairToTAnnotationValue,
				mTypeToTType, tType, mOwner, mValue, tAnnotationValue, mType, isApplicableMatch,
				mValue__mAccess____type, mAccess__mType____type, mType__mAccess____usagesInTypeAccess,
				annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target,
				annotation__mAnnotationValue____values,
				annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source,
				mOwner__annotation____annotations, mAnnotationValue__mValue____value, mTypeToTType__tType____target,
				mTypeToTType__mType____source };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_2_4_solveCSP_bindingFBBBBBBBBBBBB(
			AnnotationMemberValueClass _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, BodyDeclaration mOwner, TypeLiteral mValue,
			TAnnotationValue tAnnotationValue, Type mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, annotation, mAccess, mAnnotationValue,
				annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, mOwner, mValue, tAnnotationValue,
				mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotation, mAccess, mAnnotationValue,
					annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, mOwner, mValue, tAnnotationValue,
					mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			AnnotationMemberValueClass _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, BodyDeclaration mOwner, TypeLiteral mValue,
			TAnnotationValue tAnnotationValue, Type mType) {
		Object[] result_pattern_AnnotationMemberValueClass_2_4_solveCSP_binding = pattern_AnnotationMemberValueClass_2_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, annotation, mAccess, mAnnotationValue,
				annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, mOwner, mValue, tAnnotationValue,
				mType);
		if (result_pattern_AnnotationMemberValueClass_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueClass_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueClass_2_4_solveCSP_black = pattern_AnnotationMemberValueClass_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueClass_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotation, mAccess, mAnnotationValue,
						annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, mOwner, mValue,
						tAnnotationValue, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueClass_2_5_checkCSP_expressionFBB(
			AnnotationMemberValueClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationMemberValueClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberValueClass_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_10_1_initialbindings_blackBBBBB(
			AnnotationMemberValueClass _this, Match match, TAbstractType tType, TClassNode tValue,
			TAnnotationValue tAnnotationValue) {
		return new Object[] { _this, match, tType, tValue, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_10_2_SolveCSP_bindingFBBBBB(
			AnnotationMemberValueClass _this, Match match, TAbstractType tType, TClassNode tValue,
			TAnnotationValue tAnnotationValue) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tType, tValue, tAnnotationValue);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tType, tValue, tAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_10_2_SolveCSP_bindingAndBlackFBBBBB(
			AnnotationMemberValueClass _this, Match match, TAbstractType tType, TClassNode tValue,
			TAnnotationValue tAnnotationValue) {
		Object[] result_pattern_AnnotationMemberValueClass_10_2_SolveCSP_binding = pattern_AnnotationMemberValueClass_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tType, tValue, tAnnotationValue);
		if (result_pattern_AnnotationMemberValueClass_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueClass_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueClass_10_2_SolveCSP_black = pattern_AnnotationMemberValueClass_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueClass_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tType, tValue, tAnnotationValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueClass_10_3_CheckCSP_expressionFBB(
			AnnotationMemberValueClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TAbstractType tType, TClassNode tValue, TAnnotationValue tAnnotationValue) {
		return new Object[] { match, tType, tValue, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, TAbstractType tType, TClassNode tValue, TAnnotationValue tAnnotationValue) {
		EMoflonEdge tValue__tType____tClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationValue__tValue____tValue = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tValue);
		String tValue__tType____tClass_name_prime = "tClass";
		String tAnnotationValue__tValue____tValue_name_prime = "tValue";
		tValue__tType____tClass.setSrc(tValue);
		tValue__tType____tClass.setTrg(tType);
		match.getToBeTranslatedEdges().add(tValue__tType____tClass);
		tAnnotationValue__tValue____tValue.setSrc(tAnnotationValue);
		tAnnotationValue__tValue____tValue.setTrg(tValue);
		match.getToBeTranslatedEdges().add(tAnnotationValue__tValue____tValue);
		tValue__tType____tClass.setName(tValue__tType____tClass_name_prime);
		tAnnotationValue__tValue____tValue.setName(tAnnotationValue__tValue____tValue_name_prime);
		return new Object[] { match, tType, tValue, tAnnotationValue, tValue__tType____tClass,
				tAnnotationValue__tValue____tValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_10_5_collectcontextelements_blackBBBB(Match match,
			TAbstractType tType, TClassNode tValue, TAnnotationValue tAnnotationValue) {
		return new Object[] { match, tType, tValue, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_10_5_collectcontextelements_greenBBB(Match match,
			TAbstractType tType, TAnnotationValue tAnnotationValue) {
		match.getContextNodes().add(tType);
		match.getContextNodes().add(tAnnotationValue);
		return new Object[] { match, tType, tAnnotationValue };
	}

	public static final void pattern_AnnotationMemberValueClass_10_6_registerobjectstomatch_expressionBBBBB(
			AnnotationMemberValueClass _this, Match match, TAbstractType tType, TClassNode tValue,
			TAnnotationValue tAnnotationValue) {
		_this.registerObjectsToMatch_BWD(match, tType, tValue, tAnnotationValue);

	}

	public static final boolean pattern_AnnotationMemberValueClass_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueClass_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_11_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("annotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("mAnnotationValue");
		EObject _localVariable_2 = isApplicableMatch.getObject("AnnotationMemberValuePairToTAnnotationValue");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tType");
		EObject _localVariable_5 = isApplicableMatch.getObject("tValue");
		EObject _localVariable_6 = isApplicableMatch.getObject("mOwner");
		EObject _localVariable_7 = isApplicableMatch.getObject("tAnnotationValue");
		EObject _localVariable_8 = isApplicableMatch.getObject("mType");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpMAnnotationValue = _localVariable_1;
		EObject tmpAnnotationMemberValuePairToTAnnotationValue = _localVariable_2;
		EObject tmpMTypeToTType = _localVariable_3;
		EObject tmpTType = _localVariable_4;
		EObject tmpTValue = _localVariable_5;
		EObject tmpMOwner = _localVariable_6;
		EObject tmpTAnnotationValue = _localVariable_7;
		EObject tmpMType = _localVariable_8;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
				AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
				if (tmpAnnotationMemberValuePairToTAnnotationValue instanceof AnnotationMemberValuePairToTAnnotationValue) {
					AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) tmpAnnotationMemberValuePairToTAnnotationValue;
					if (tmpMTypeToTType instanceof TypeToTAbstractType) {
						TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
						if (tmpTType instanceof TAbstractType) {
							TAbstractType tType = (TAbstractType) tmpTType;
							if (tmpTValue instanceof TClassNode) {
								TClassNode tValue = (TClassNode) tmpTValue;
								if (tmpMOwner instanceof BodyDeclaration) {
									BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
									if (tmpTAnnotationValue instanceof TAnnotationValue) {
										TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
										if (tmpMType instanceof Type) {
											Type mType = (Type) tmpMType;
											return new Object[] { annotation, mAnnotationValue,
													annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType,
													tValue, mOwner, tAnnotationValue, mType, isApplicableMatch };
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

	public static final Object[] pattern_AnnotationMemberValueClass_11_1_performtransformation_blackBBBBBBBBBFBB(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, TClassNode tValue, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, Type mType, AnnotationMemberValueClass _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue,
						mTypeToTType, tType, tValue, mOwner, tAnnotationValue, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			AnnotationMemberValueClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationMemberValueClass_11_1_performtransformation_binding = pattern_AnnotationMemberValueClass_11_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationMemberValueClass_11_1_performtransformation_binding != null) {
			Annotation annotation = (Annotation) result_pattern_AnnotationMemberValueClass_11_1_performtransformation_binding[0];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberValueClass_11_1_performtransformation_binding[1];
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result_pattern_AnnotationMemberValueClass_11_1_performtransformation_binding[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_AnnotationMemberValueClass_11_1_performtransformation_binding[3];
			TAbstractType tType = (TAbstractType) result_pattern_AnnotationMemberValueClass_11_1_performtransformation_binding[4];
			TClassNode tValue = (TClassNode) result_pattern_AnnotationMemberValueClass_11_1_performtransformation_binding[5];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberValueClass_11_1_performtransformation_binding[6];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberValueClass_11_1_performtransformation_binding[7];
			Type mType = (Type) result_pattern_AnnotationMemberValueClass_11_1_performtransformation_binding[8];

			Object[] result_pattern_AnnotationMemberValueClass_11_1_performtransformation_black = pattern_AnnotationMemberValueClass_11_1_performtransformation_blackBBBBBBBBBFBB(
					annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType,
					tValue, mOwner, tAnnotationValue, mType, _this, isApplicableMatch);
			if (result_pattern_AnnotationMemberValueClass_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationMemberValueClass_11_1_performtransformation_black[9];

				return new Object[] { annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue,
						mTypeToTType, tType, tValue, mOwner, tAnnotationValue, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_11_1_performtransformation_greenFBBFFB(
			AnnotationMemberValuePair mAnnotationValue, TClassNode tValue, Type mType) {
		TypeAccess mAccess = JavaFactory.eINSTANCE.createTypeAccess();
		LiteralToTNode mValueToTValue = PmFactory.eINSTANCE.createLiteralToTNode();
		TypeLiteral mValue = JavaFactory.eINSTANCE.createTypeLiteral();
		mAccess.setType(mType);
		mValueToTValue.setTarget(tValue);
		mValue.setType(mAccess);
		mValueToTValue.setSource(mValue);
		mAnnotationValue.setValue(mValue);
		return new Object[] { mAccess, mAnnotationValue, tValue, mValueToTValue, mValue, mType };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_11_2_collecttranslatedelements_blackBBBB(
			TypeAccess mAccess, TClassNode tValue, LiteralToTNode mValueToTValue, TypeLiteral mValue) {
		return new Object[] { mAccess, tValue, mValueToTValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_11_2_collecttranslatedelements_greenFBBBB(
			TypeAccess mAccess, TClassNode tValue, LiteralToTNode mValueToTValue, TypeLiteral mValue) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mAccess);
		ruleresult.getTranslatedElements().add(tValue);
		ruleresult.getCreatedLinkElements().add(mValueToTValue);
		ruleresult.getCreatedElements().add(mValue);
		return new Object[] { ruleresult, mAccess, tValue, mValueToTValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject annotation, EObject mAccess, EObject mAnnotationValue,
			EObject annotationMemberValuePairToTAnnotationValue, EObject mTypeToTType, EObject tType, EObject tValue,
			EObject mOwner, EObject mValueToTValue, EObject mValue, EObject tAnnotationValue, EObject mType) {
		if (!annotation.equals(mAccess)) {
			if (!annotation.equals(mAnnotationValue)) {
				if (!annotation.equals(mTypeToTType)) {
					if (!annotation.equals(tType)) {
						if (!annotation.equals(tValue)) {
							if (!annotation.equals(mOwner)) {
								if (!annotation.equals(mValueToTValue)) {
									if (!annotation.equals(mValue)) {
										if (!annotation.equals(tAnnotationValue)) {
											if (!annotation.equals(mType)) {
												if (!mAccess.equals(mAnnotationValue)) {
													if (!mAccess.equals(mTypeToTType)) {
														if (!mAccess.equals(tType)) {
															if (!mAccess.equals(tValue)) {
																if (!mAccess.equals(mOwner)) {
																	if (!mAccess.equals(mValueToTValue)) {
																		if (!mAccess.equals(mValue)) {
																			if (!mAccess.equals(tAnnotationValue)) {
																				if (!mAccess.equals(mType)) {
																					if (!mAnnotationValue
																							.equals(mTypeToTType)) {
																						if (!mAnnotationValue
																								.equals(tType)) {
																							if (!mAnnotationValue
																									.equals(tValue)) {
																								if (!mAnnotationValue
																										.equals(mOwner)) {
																									if (!mAnnotationValue
																											.equals(mValueToTValue)) {
																										if (!mAnnotationValue
																												.equals(mValue)) {
																											if (!mAnnotationValue
																													.equals(tAnnotationValue)) {
																												if (!mAnnotationValue
																														.equals(mType)) {
																													if (!annotationMemberValuePairToTAnnotationValue
																															.equals(annotation)) {
																														if (!annotationMemberValuePairToTAnnotationValue
																																.equals(mAccess)) {
																															if (!annotationMemberValuePairToTAnnotationValue
																																	.equals(mAnnotationValue)) {
																																if (!annotationMemberValuePairToTAnnotationValue
																																		.equals(mTypeToTType)) {
																																	if (!annotationMemberValuePairToTAnnotationValue
																																			.equals(tType)) {
																																		if (!annotationMemberValuePairToTAnnotationValue
																																				.equals(tValue)) {
																																			if (!annotationMemberValuePairToTAnnotationValue
																																					.equals(mOwner)) {
																																				if (!annotationMemberValuePairToTAnnotationValue
																																						.equals(mValueToTValue)) {
																																					if (!annotationMemberValuePairToTAnnotationValue
																																							.equals(mValue)) {
																																						if (!annotationMemberValuePairToTAnnotationValue
																																								.equals(tAnnotationValue)) {
																																							if (!annotationMemberValuePairToTAnnotationValue
																																									.equals(mType)) {
																																								if (!mTypeToTType
																																										.equals(tType)) {
																																									if (!mTypeToTType
																																											.equals(tValue)) {
																																										if (!mTypeToTType
																																												.equals(mValueToTValue)) {
																																											if (!mTypeToTType
																																													.equals(mValue)) {
																																												if (!mTypeToTType
																																														.equals(tAnnotationValue)) {
																																													if (!tType
																																															.equals(tValue)) {
																																														if (!mOwner
																																																.equals(mTypeToTType)) {
																																															if (!mOwner
																																																	.equals(tType)) {
																																																if (!mOwner
																																																		.equals(tValue)) {
																																																	if (!mOwner
																																																			.equals(mValueToTValue)) {
																																																		if (!mOwner
																																																				.equals(mValue)) {
																																																			if (!mOwner
																																																					.equals(tAnnotationValue)) {
																																																				if (!mOwner
																																																						.equals(mType)) {
																																																					if (!mValueToTValue
																																																							.equals(tType)) {
																																																						if (!mValueToTValue
																																																								.equals(tValue)) {
																																																							if (!mValueToTValue
																																																									.equals(tAnnotationValue)) {
																																																								if (!mValue
																																																										.equals(tType)) {
																																																									if (!mValue
																																																											.equals(tValue)) {
																																																										if (!mValue
																																																												.equals(mValueToTValue)) {
																																																											if (!mValue
																																																													.equals(tAnnotationValue)) {
																																																												if (!tAnnotationValue
																																																														.equals(tType)) {
																																																													if (!tAnnotationValue
																																																															.equals(tValue)) {
																																																														if (!mType
																																																																.equals(mTypeToTType)) {
																																																															if (!mType
																																																																	.equals(tType)) {
																																																																if (!mType
																																																																		.equals(tValue)) {
																																																																	if (!mType
																																																																			.equals(mValueToTValue)) {
																																																																		if (!mType
																																																																				.equals(mValue)) {
																																																																			if (!mType
																																																																					.equals(tAnnotationValue)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						annotation,
																																																																						mAccess,
																																																																						mAnnotationValue,
																																																																						annotationMemberValuePairToTAnnotationValue,
																																																																						mTypeToTType,
																																																																						tType,
																																																																						tValue,
																																																																						mOwner,
																																																																						mValueToTValue,
																																																																						mValue,
																																																																						tAnnotationValue,
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
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationMemberValueClass_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject mAccess, EObject mAnnotationValue, EObject tType, EObject tValue,
			EObject mValueToTValue, EObject mValue, EObject tAnnotationValue, EObject mType) {
		EMoflonEdge mValue__mAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mValueToTValue__mValue____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tValue__tType____tClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationValue__mValue____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mValueToTValue__tValue____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationValue__tValue____tValue = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationMemberValueClass";
		String mValue__mAccess____type_name_prime = "type";
		String mAccess__mType____type_name_prime = "type";
		String mType__mAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mValueToTValue__mValue____source_name_prime = "source";
		String tValue__tType____tClass_name_prime = "tClass";
		String mAnnotationValue__mValue____value_name_prime = "value";
		String mValueToTValue__tValue____target_name_prime = "target";
		String tAnnotationValue__tValue____tValue_name_prime = "tValue";
		mValue__mAccess____type.setSrc(mValue);
		mValue__mAccess____type.setTrg(mAccess);
		ruleresult.getCreatedEdges().add(mValue__mAccess____type);
		mAccess__mType____type.setSrc(mAccess);
		mAccess__mType____type.setTrg(mType);
		ruleresult.getCreatedEdges().add(mAccess__mType____type);
		mType__mAccess____usagesInTypeAccess.setSrc(mType);
		mType__mAccess____usagesInTypeAccess.setTrg(mAccess);
		ruleresult.getCreatedEdges().add(mType__mAccess____usagesInTypeAccess);
		mValueToTValue__mValue____source.setSrc(mValueToTValue);
		mValueToTValue__mValue____source.setTrg(mValue);
		ruleresult.getCreatedEdges().add(mValueToTValue__mValue____source);
		tValue__tType____tClass.setSrc(tValue);
		tValue__tType____tClass.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tValue__tType____tClass);
		mAnnotationValue__mValue____value.setSrc(mAnnotationValue);
		mAnnotationValue__mValue____value.setTrg(mValue);
		ruleresult.getCreatedEdges().add(mAnnotationValue__mValue____value);
		mValueToTValue__tValue____target.setSrc(mValueToTValue);
		mValueToTValue__tValue____target.setTrg(tValue);
		ruleresult.getCreatedEdges().add(mValueToTValue__tValue____target);
		tAnnotationValue__tValue____tValue.setSrc(tAnnotationValue);
		tAnnotationValue__tValue____tValue.setTrg(tValue);
		ruleresult.getTranslatedEdges().add(tAnnotationValue__tValue____tValue);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mValue__mAccess____type.setName(mValue__mAccess____type_name_prime);
		mAccess__mType____type.setName(mAccess__mType____type_name_prime);
		mType__mAccess____usagesInTypeAccess.setName(mType__mAccess____usagesInTypeAccess_name_prime);
		mValueToTValue__mValue____source.setName(mValueToTValue__mValue____source_name_prime);
		tValue__tType____tClass.setName(tValue__tType____tClass_name_prime);
		mAnnotationValue__mValue____value.setName(mAnnotationValue__mValue____value_name_prime);
		mValueToTValue__tValue____target.setName(mValueToTValue__tValue____target_name_prime);
		tAnnotationValue__tValue____tValue.setName(tAnnotationValue__tValue____tValue_name_prime);
		return new Object[] { ruleresult, mAccess, mAnnotationValue, tType, tValue, mValueToTValue, mValue,
				tAnnotationValue, mType, mValue__mAccess____type, mAccess__mType____type,
				mType__mAccess____usagesInTypeAccess, mValueToTValue__mValue____source, tValue__tType____tClass,
				mAnnotationValue__mValue____value, mValueToTValue__tValue____target,
				tAnnotationValue__tValue____tValue };
	}

	public static final void pattern_AnnotationMemberValueClass_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			AnnotationMemberValueClass _this, PerformRuleResult ruleresult, EObject annotation, EObject mAccess,
			EObject mAnnotationValue, EObject annotationMemberValuePairToTAnnotationValue, EObject mTypeToTType,
			EObject tType, EObject tValue, EObject mOwner, EObject mValueToTValue, EObject mValue,
			EObject tAnnotationValue, EObject mType) {
		_this.registerObjects_BWD(ruleresult, annotation, mAccess, mAnnotationValue,
				annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, tValue, mOwner, mValueToTValue,
				mValue, tAnnotationValue, mType);

	}

	public static final PerformRuleResult pattern_AnnotationMemberValueClass_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_12_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationMemberValueClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationMemberValueClass _this) {
		Object[] result_pattern_AnnotationMemberValueClass_12_1_preparereturnvalue_binding = pattern_AnnotationMemberValueClass_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueClass_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationMemberValueClass_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueClass_12_1_preparereturnvalue_black = pattern_AnnotationMemberValueClass_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationMemberValueClass_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationMemberValueClass_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationMemberValueClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tType");
		EObject _localVariable_1 = match.getObject("tValue");
		EObject _localVariable_2 = match.getObject("tAnnotationValue");
		EObject tmpTType = _localVariable_0;
		EObject tmpTValue = _localVariable_1;
		EObject tmpTAnnotationValue = _localVariable_2;
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			if (tmpTValue instanceof TClassNode) {
				TClassNode tValue = (TClassNode) tmpTValue;
				if (tmpTAnnotationValue instanceof TAnnotationValue) {
					TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
					return new Object[] { tType, tValue, tAnnotationValue, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueClass_12_2_corematch_blackFFFBBBFB(
			TAbstractType tType, TClassNode tValue, TAnnotationValue tAnnotationValue, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnnotationValue, AnnotationMemberValuePairToTAnnotationValue.class,
						"target")) {
			AnnotationMemberValuePair mAnnotationValue = annotationMemberValuePairToTAnnotationValue.getSource();
			if (mAnnotationValue != null) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
					Type mType = mTypeToTType.getSource();
					if (mType != null) {
						_result.add(new Object[] { mAnnotationValue, annotationMemberValuePairToTAnnotationValue,
								mTypeToTType, tType, tValue, tAnnotationValue, mType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueClass_12_3_findcontext_blackFBBBBBFBB(
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, TClassNode tValue, TAnnotationValue tAnnotationValue,
			Type mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getTarget())) {
			if (tType.equals(tValue.getTClass())) {
				if (mAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getSource())) {
					if (tType.equals(mTypeToTType.getTarget())) {
						if (mType.equals(mTypeToTType.getSource())) {
							if (tAnnotationValue.getTValue().contains(tValue)) {
								for (Annotation annotation : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(mAnnotationValue, Annotation.class, "values")) {
									for (BodyDeclaration mOwner : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(annotation, BodyDeclaration.class,
													"annotations")) {
										_result.add(new Object[] { annotation, mAnnotationValue,
												annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType,
												tValue, mOwner, tAnnotationValue, mType });
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

	public static final Object[] pattern_AnnotationMemberValueClass_12_3_findcontext_greenBBBBBBBBBFFFFFFFFF(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, TClassNode tValue, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, Type mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tValue__tType____tClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__mAnnotationValue____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mOwner__annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationValue__tValue____tValue = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime = "target";
		String tValue__tType____tClass_name_prime = "tClass";
		String annotation__mAnnotationValue____values_name_prime = "values";
		String annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source_name_prime = "source";
		String mOwner__annotation____annotations_name_prime = "annotations";
		String mTypeToTType__tType____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		String tAnnotationValue__tValue____tValue_name_prime = "tValue";
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(mAnnotationValue);
		isApplicableMatch.getAllContextElements().add(annotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(tValue);
		isApplicableMatch.getAllContextElements().add(mOwner);
		isApplicableMatch.getAllContextElements().add(tAnnotationValue);
		isApplicableMatch.getAllContextElements().add(mType);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setSrc(annotationMemberValuePairToTAnnotationValue);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target.setTrg(tAnnotationValue);
		isApplicableMatch.getAllContextElements()
				.add(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target);
		tValue__tType____tClass.setSrc(tValue);
		tValue__tType____tClass.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tValue__tType____tClass);
		annotation__mAnnotationValue____values.setSrc(annotation);
		annotation__mAnnotationValue____values.setTrg(mAnnotationValue);
		isApplicableMatch.getAllContextElements().add(annotation__mAnnotationValue____values);
		annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source
				.setSrc(annotationMemberValuePairToTAnnotationValue);
		annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source.setTrg(mAnnotationValue);
		isApplicableMatch.getAllContextElements()
				.add(annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source);
		mOwner__annotation____annotations.setSrc(mOwner);
		mOwner__annotation____annotations.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(mOwner__annotation____annotations);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		tAnnotationValue__tValue____tValue.setSrc(tAnnotationValue);
		tAnnotationValue__tValue____tValue.setTrg(tValue);
		isApplicableMatch.getAllContextElements().add(tAnnotationValue__tValue____tValue);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setName(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime);
		tValue__tType____tClass.setName(tValue__tType____tClass_name_prime);
		annotation__mAnnotationValue____values.setName(annotation__mAnnotationValue____values_name_prime);
		annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source
				.setName(annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source_name_prime);
		mOwner__annotation____annotations.setName(mOwner__annotation____annotations_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		tAnnotationValue__tValue____tValue.setName(tAnnotationValue__tValue____tValue_name_prime);
		return new Object[] { annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue, mTypeToTType,
				tType, tValue, mOwner, tAnnotationValue, mType, isApplicableMatch,
				annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target, tValue__tType____tClass,
				annotation__mAnnotationValue____values,
				annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source,
				mOwner__annotation____annotations, mTypeToTType__tType____target, mTypeToTType__mType____source,
				tAnnotationValue__tValue____tValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_12_4_solveCSP_bindingFBBBBBBBBBBB(
			AnnotationMemberValueClass _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, TClassNode tValue, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, Type mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, annotation, mAnnotationValue,
				annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, tValue, mOwner, tAnnotationValue,
				mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotation, mAnnotationValue,
					annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, tValue, mOwner, tAnnotationValue,
					mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			AnnotationMemberValueClass _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, TClassNode tValue, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, Type mType) {
		Object[] result_pattern_AnnotationMemberValueClass_12_4_solveCSP_binding = pattern_AnnotationMemberValueClass_12_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue,
				mTypeToTType, tType, tValue, mOwner, tAnnotationValue, mType);
		if (result_pattern_AnnotationMemberValueClass_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueClass_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueClass_12_4_solveCSP_black = pattern_AnnotationMemberValueClass_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueClass_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotation, mAnnotationValue,
						annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, tValue, mOwner,
						tAnnotationValue, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueClass_12_5_checkCSP_expressionFBB(
			AnnotationMemberValueClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationMemberValueClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberValueClass_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_20_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationMemberValueClass _this) {
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

	public static final Object[] pattern_AnnotationMemberValueClass_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationMemberValueClass _this) {
		Object[] result_pattern_AnnotationMemberValueClass_20_1_preparereturnvalue_binding = pattern_AnnotationMemberValueClass_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueClass_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationMemberValueClass_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueClass_20_1_preparereturnvalue_black = pattern_AnnotationMemberValueClass_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationMemberValueClass_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationMemberValueClass_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationMemberValueClass_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueClass_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTValue = _edge_tClass.getSrc();
		if (tmpTValue instanceof TClassNode) {
			TClassNode tValue = (TClassNode) tmpTValue;
			EObject tmpTType = _edge_tClass.getTrg();
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tType.equals(tValue.getTClass())) {
					for (TAnnotationValue tAnnotationValue : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tValue, TAnnotationValue.class, "tValue")) {
						_result.add(new Object[] { tType, tValue, tAnnotationValue, _edge_tClass });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationMemberValueClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			AnnotationMemberValueClass _this, Match match, TAbstractType tType, TClassNode tValue,
			TAnnotationValue tAnnotationValue) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tType, tValue, tAnnotationValue);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationMemberValueClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationMemberValueClass_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_21_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationMemberValueClass _this) {
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

	public static final Object[] pattern_AnnotationMemberValueClass_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationMemberValueClass _this) {
		Object[] result_pattern_AnnotationMemberValueClass_21_1_preparereturnvalue_binding = pattern_AnnotationMemberValueClass_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueClass_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationMemberValueClass_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueClass_21_1_preparereturnvalue_black = pattern_AnnotationMemberValueClass_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationMemberValueClass_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationMemberValueClass_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationMemberValueClass_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_0BBB(
			TypeAccess mAccess, BodyDeclaration mOwner, Type mType) {
		for (AbstractTypeDeclaration __DEC_mAccess_superInterfaces_595907 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mOwner.equals(__DEC_mAccess_superInterfaces_595907)) {
				if (!mType.equals(__DEC_mAccess_superInterfaces_595907)) {
					return new Object[] { mAccess, mOwner, mType };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_1BB(
			TypeAccess mAccess, Annotation annotation) {
		for (Annotation __DEC_mAccess_type_491278 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, Annotation.class, "type")) {
			if (!annotation.equals(__DEC_mAccess_type_491278)) {
				return new Object[] { mAccess, annotation };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_2BB(
			TypeAccess mAccess, BodyDeclaration mOwner) {
		for (AnnotationTypeMemberDeclaration __DEC_mAccess_type_667967 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AnnotationTypeMemberDeclaration.class, "type")) {
			if (!mOwner.equals(__DEC_mAccess_type_667967)) {
				return new Object[] { mAccess, mOwner };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_3BB(
			TypeAccess mAccess, Type mType) {
		for (ArrayType __DEC_mAccess_elementType_52169 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ArrayType.class, "elementType")) {
			if (!mType.equals(__DEC_mAccess_elementType_52169)) {
				return new Object[] { mAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_4B(
			TypeAccess mAccess) {
		for (ClassInstanceCreation __DEC_mAccess_type_514644 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_5BBB(
			TypeAccess mAccess, BodyDeclaration mOwner, Type mType) {
		for (ClassDeclaration __DEC_mAccess_superClass_191996 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ClassDeclaration.class, "superClass")) {
			if (!mOwner.equals(__DEC_mAccess_superClass_191996)) {
				if (!mType.equals(__DEC_mAccess_superClass_191996)) {
					return new Object[] { mAccess, mOwner, mType };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_6BB(
			TypeAccess mAccess, BodyDeclaration mOwner) {
		for (MethodDeclaration __DEC_mAccess_returnType_694437 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, MethodDeclaration.class, "returnType")) {
			if (!mOwner.equals(__DEC_mAccess_returnType_694437)) {
				return new Object[] { mAccess, mOwner };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_7BB(
			TypeAccess mAccess, Type mType) {
		for (ParameterizedType __DEC_mAccess_type_707023 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ParameterizedType.class, "type")) {
			if (!mType.equals(__DEC_mAccess_type_707023)) {
				return new Object[] { mAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_8BB(
			TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue) {
		for (AnnotationMemberValuePair __DEC_mAccess_value_789713 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AnnotationMemberValuePair.class, "value")) {
			if (!mAnnotationValue.equals(__DEC_mAccess_value_789713)) {
				return new Object[] { mAccess, mAnnotationValue };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_9BB(
			Annotation annotation, TypeAccess mAccess) {
		if (mAccess.equals(annotation.getType())) {
			return new Object[] { annotation, mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_10BB(
			AnnotationMemberValuePair mAnnotationValue, TypeAccess mAccess) {
		if (mAccess.equals(mAnnotationValue.getValue())) {
			return new Object[] { mAnnotationValue, mAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_blackFFFFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMValue = _edge_type.getSrc();
		if (tmpMValue instanceof TypeLiteral) {
			TypeLiteral mValue = (TypeLiteral) tmpMValue;
			EObject tmpMAccess = _edge_type.getTrg();
			if (tmpMAccess instanceof TypeAccess) {
				TypeAccess mAccess = (TypeAccess) tmpMAccess;
				if (mAccess.equals(mValue.getType())) {
					Type mType = mAccess.getType();
					if (mType != null) {
						if (pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_4B(
								mAccess) == null) {
							if (pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_3BB(mAccess,
									mType) == null) {
								if (pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_7BB(mAccess,
										mType) == null) {
									for (AnnotationMemberValuePair mAnnotationValue : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(mValue, AnnotationMemberValuePair.class,
													"value")) {
										if (pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_8BB(
												mAccess, mAnnotationValue) == null) {
											if (pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_10BB(
													mAnnotationValue, mAccess) == null) {
												for (Annotation annotation : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(mAnnotationValue, Annotation.class,
																"values")) {
													if (pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_1BB(
															mAccess, annotation) == null) {
														if (pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_9BB(
																annotation, mAccess) == null) {
															for (BodyDeclaration mOwner : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(annotation,
																			BodyDeclaration.class, "annotations")) {
																if (pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_0BBB(
																		mAccess, mOwner, mType) == null) {
																	if (pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_2BB(
																			mAccess, mOwner) == null) {
																		if (pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_5BBB(
																				mAccess, mOwner, mType) == null) {
																			if (pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_black_nac_6BB(
																					mAccess, mOwner) == null) {
																				_result.add(new Object[] { annotation,
																						mAccess, mAnnotationValue,
																						mOwner, mValue, mType,
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
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationMemberValueClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
			AnnotationMemberValueClass _this, Match match, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, TypeLiteral mValue, Type mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, annotation, mAccess, mAnnotationValue, mOwner, mValue,
				mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationMemberValueClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationMemberValueClass_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_24_1_prepare_blackB(
			AnnotationMemberValueClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_bindingFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("annotation");
		EObject _localVariable_1 = sourceMatch.getObject("mAccess");
		EObject _localVariable_2 = sourceMatch.getObject("mAnnotationValue");
		EObject _localVariable_3 = targetMatch.getObject("tType");
		EObject _localVariable_4 = targetMatch.getObject("tValue");
		EObject _localVariable_5 = sourceMatch.getObject("mOwner");
		EObject _localVariable_6 = sourceMatch.getObject("mValue");
		EObject _localVariable_7 = targetMatch.getObject("tAnnotationValue");
		EObject _localVariable_8 = sourceMatch.getObject("mType");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpMAccess = _localVariable_1;
		EObject tmpMAnnotationValue = _localVariable_2;
		EObject tmpTType = _localVariable_3;
		EObject tmpTValue = _localVariable_4;
		EObject tmpMOwner = _localVariable_5;
		EObject tmpMValue = _localVariable_6;
		EObject tmpTAnnotationValue = _localVariable_7;
		EObject tmpMType = _localVariable_8;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpMAccess instanceof TypeAccess) {
				TypeAccess mAccess = (TypeAccess) tmpMAccess;
				if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
					AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
					if (tmpTType instanceof TAbstractType) {
						TAbstractType tType = (TAbstractType) tmpTType;
						if (tmpTValue instanceof TClassNode) {
							TClassNode tValue = (TClassNode) tmpTValue;
							if (tmpMOwner instanceof BodyDeclaration) {
								BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
								if (tmpMValue instanceof TypeLiteral) {
									TypeLiteral mValue = (TypeLiteral) tmpMValue;
									if (tmpTAnnotationValue instanceof TAnnotationValue) {
										TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
										if (tmpMType instanceof Type) {
											Type mType = (Type) tmpMType;
											return new Object[] { annotation, mAccess, mAnnotationValue, tType, tValue,
													mOwner, mValue, tAnnotationValue, mType, sourceMatch, targetMatch };
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

	public static final Object[] pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_blackBBBBBBBBBBB(
			Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue, TAbstractType tType,
			TClassNode tValue, BodyDeclaration mOwner, TypeLiteral mValue, TAnnotationValue tAnnotationValue,
			Type mType, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { annotation, mAccess, mAnnotationValue, tType, tValue, mOwner, mValue,
					tAnnotationValue, mType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_binding = pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_bindingFFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_binding != null) {
			Annotation annotation = (Annotation) result_pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_binding[0];
			TypeAccess mAccess = (TypeAccess) result_pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_binding[1];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_binding[2];
			TAbstractType tType = (TAbstractType) result_pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_binding[3];
			TClassNode tValue = (TClassNode) result_pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_binding[4];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_binding[5];
			TypeLiteral mValue = (TypeLiteral) result_pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_binding[6];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_binding[7];
			Type mType = (Type) result_pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_binding[8];

			Object[] result_pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_black = pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_blackBBBBBBBBBBB(
					annotation, mAccess, mAnnotationValue, tType, tValue, mOwner, mValue, tAnnotationValue, mType,
					sourceMatch, targetMatch);
			if (result_pattern_AnnotationMemberValueClass_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { annotation, mAccess, mAnnotationValue, tType, tValue, mOwner, mValue,
						tAnnotationValue, mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_24_3_solvecsp_bindingFBBBBBBBBBBBB(
			AnnotationMemberValueClass _this, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, TAbstractType tType, TClassNode tValue, BodyDeclaration mOwner,
			TypeLiteral mValue, TAnnotationValue tAnnotationValue, Type mType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_9 = _this.isApplicable_solveCsp_CC(annotation, mAccess, mAnnotationValue, tType, tValue,
				mOwner, mValue, tAnnotationValue, mType, sourceMatch, targetMatch);
		CSP csp = _localVariable_9;
		if (csp != null) {
			return new Object[] { csp, _this, annotation, mAccess, mAnnotationValue, tType, tValue, mOwner, mValue,
					tAnnotationValue, mType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBB(
			AnnotationMemberValueClass _this, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, TAbstractType tType, TClassNode tValue, BodyDeclaration mOwner,
			TypeLiteral mValue, TAnnotationValue tAnnotationValue, Type mType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationMemberValueClass_24_3_solvecsp_binding = pattern_AnnotationMemberValueClass_24_3_solvecsp_bindingFBBBBBBBBBBBB(
				_this, annotation, mAccess, mAnnotationValue, tType, tValue, mOwner, mValue, tAnnotationValue, mType,
				sourceMatch, targetMatch);
		if (result_pattern_AnnotationMemberValueClass_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueClass_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnnotationMemberValueClass_24_3_solvecsp_black = pattern_AnnotationMemberValueClass_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueClass_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, annotation, mAccess, mAnnotationValue, tType, tValue, mOwner, mValue,
						tAnnotationValue, mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueClass_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueClass_24_5_matchcorrcontext_blackBFFBBBBB(
			AnnotationMemberValuePair mAnnotationValue, TAbstractType tType, TAnnotationValue tAnnotationValue,
			Type mType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAnnotationValue, AnnotationMemberValuePairToTAnnotationValue.class,
							"target")) {
				if (mAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getSource())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
						if (mType.equals(mTypeToTType.getSource())) {
							_result.add(new Object[] { mAnnotationValue, annotationMemberValuePairToTAnnotationValue,
									mTypeToTType, tType, tAnnotationValue, mType, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_24_5_matchcorrcontext_greenBBBBF(
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnnotationMemberValueClass";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(annotationMemberValuePairToTAnnotationValue);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { annotationMemberValuePairToTAnnotationValue, mTypeToTType, sourceMatch, targetMatch,
				ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_24_6_createcorrespondence_blackBBBBBBBBBB(
			Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue, TAbstractType tType,
			TClassNode tValue, BodyDeclaration mOwner, TypeLiteral mValue, TAnnotationValue tAnnotationValue,
			Type mType, CCMatch ccMatch) {
		return new Object[] { annotation, mAccess, mAnnotationValue, tType, tValue, mOwner, mValue, tAnnotationValue,
				mType, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_24_6_createcorrespondence_greenBFBB(
			TClassNode tValue, TypeLiteral mValue, CCMatch ccMatch) {
		LiteralToTNode mValueToTValue = PmFactory.eINSTANCE.createLiteralToTNode();
		mValueToTValue.setSource(mValue);
		mValueToTValue.setTarget(tValue);
		ccMatch.getCreateCorr().add(mValueToTValue);
		return new Object[] { tValue, mValueToTValue, mValue, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnnotationMemberValueClass";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberValueClass_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_0BBB(
			TypeAccess mAccess, BodyDeclaration mOwner, Type mType) {
		for (AbstractTypeDeclaration __DEC_mAccess_superInterfaces_272446 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mOwner.equals(__DEC_mAccess_superInterfaces_272446)) {
				if (!mType.equals(__DEC_mAccess_superInterfaces_272446)) {
					return new Object[] { mAccess, mOwner, mType };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_1BB(
			TypeAccess mAccess, Annotation annotation) {
		for (Annotation __DEC_mAccess_type_846209 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, Annotation.class, "type")) {
			if (!annotation.equals(__DEC_mAccess_type_846209)) {
				return new Object[] { mAccess, annotation };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_2BB(
			TypeAccess mAccess, BodyDeclaration mOwner) {
		for (AnnotationTypeMemberDeclaration __DEC_mAccess_type_426852 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AnnotationTypeMemberDeclaration.class, "type")) {
			if (!mOwner.equals(__DEC_mAccess_type_426852)) {
				return new Object[] { mAccess, mOwner };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_3BB(
			TypeAccess mAccess, Type mType) {
		for (ArrayType __DEC_mAccess_elementType_953451 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ArrayType.class, "elementType")) {
			if (!mType.equals(__DEC_mAccess_elementType_953451)) {
				return new Object[] { mAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_4B(
			TypeAccess mAccess) {
		for (ClassInstanceCreation __DEC_mAccess_type_146994 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_5BBB(
			TypeAccess mAccess, BodyDeclaration mOwner, Type mType) {
		for (ClassDeclaration __DEC_mAccess_superClass_644588 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ClassDeclaration.class, "superClass")) {
			if (!mOwner.equals(__DEC_mAccess_superClass_644588)) {
				if (!mType.equals(__DEC_mAccess_superClass_644588)) {
					return new Object[] { mAccess, mOwner, mType };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_6BB(
			TypeAccess mAccess, BodyDeclaration mOwner) {
		for (MethodDeclaration __DEC_mAccess_returnType_859723 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, MethodDeclaration.class, "returnType")) {
			if (!mOwner.equals(__DEC_mAccess_returnType_859723)) {
				return new Object[] { mAccess, mOwner };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_7BB(
			TypeAccess mAccess, Type mType) {
		for (ParameterizedType __DEC_mAccess_type_859123 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ParameterizedType.class, "type")) {
			if (!mType.equals(__DEC_mAccess_type_859123)) {
				return new Object[] { mAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_8BB(
			TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue) {
		for (AnnotationMemberValuePair __DEC_mAccess_value_10274 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AnnotationMemberValuePair.class, "value")) {
			if (!mAnnotationValue.equals(__DEC_mAccess_value_10274)) {
				return new Object[] { mAccess, mAnnotationValue };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_9BB(
			Annotation annotation, TypeAccess mAccess) {
		if (mAccess.equals(annotation.getType())) {
			return new Object[] { annotation, mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_10BB(
			AnnotationMemberValuePair mAnnotationValue, TypeAccess mAccess) {
		if (mAccess.equals(mAnnotationValue.getValue())) {
			return new Object[] { mAnnotationValue, mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_27_1_matchtggpattern_blackBBBBBB(
			Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue,
			BodyDeclaration mOwner, TypeLiteral mValue, Type mType) {
		if (mAccess.equals(mValue.getType())) {
			if (mType.equals(mAccess.getType())) {
				if (annotation.getValues().contains(mAnnotationValue)) {
					if (mOwner.getAnnotations().contains(annotation)) {
						if (mValue.equals(mAnnotationValue.getValue())) {
							if (pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_0BBB(mAccess, mOwner,
									mType) == null) {
								if (pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_1BB(mAccess,
										annotation) == null) {
									if (pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_2BB(mAccess,
											mOwner) == null) {
										if (pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_3BB(
												mAccess, mType) == null) {
											if (pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_4B(
													mAccess) == null) {
												if (pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_5BBB(
														mAccess, mOwner, mType) == null) {
													if (pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_6BB(
															mAccess, mOwner) == null) {
														if (pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_7BB(
																mAccess, mType) == null) {
															if (pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_8BB(
																	mAccess, mAnnotationValue) == null) {
																if (pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_9BB(
																		annotation, mAccess) == null) {
																	if (pattern_AnnotationMemberValueClass_27_1_matchtggpattern_black_nac_10BB(
																			mAnnotationValue, mAccess) == null) {
																		return new Object[] { annotation, mAccess,
																				mAnnotationValue, mOwner, mValue,
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
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueClass_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueClass_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_28_1_matchtggpattern_blackBBB(TAbstractType tType,
			TClassNode tValue, TAnnotationValue tAnnotationValue) {
		if (tType.equals(tValue.getTClass())) {
			if (tAnnotationValue.getTValue().contains(tValue)) {
				return new Object[] { tType, tValue, tAnnotationValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueClass_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueClass_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_29_1_createresult_blackB(
			AnnotationMemberValueClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Annotation annotation) {
		if (ruleResult.getSourceObjects().contains(annotation)) {
			return new Object[] { ruleResult, annotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, AnnotationMemberValuePair mAnnotationValue) {
		if (ruleResult.getSourceObjects().contains(mAnnotationValue)) {
			return new Object[] { ruleResult, mAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue) {
		if (ruleResult.getCorrObjects().contains(annotationMemberValuePairToTAnnotationValue)) {
			return new Object[] { ruleResult, annotationMemberValuePairToTAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TAnnotationValue tAnnotationValue) {
		if (ruleResult.getTargetObjects().contains(tAnnotationValue)) {
			return new Object[] { ruleResult, tAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, BodyDeclaration mOwner) {
		if (ruleResult.getSourceObjects().contains(mOwner)) {
			return new Object[] { ruleResult, mOwner };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueClass_29_2_isapplicablecore_blackFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList annotationMemberValuePairToTAnnotationValueList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
				if (!annotationMemberValuePairToTAnnotationValueList.equals(mTypeToTTypeList)) {
					for (EObject tmpAnnotationMemberValuePairToTAnnotationValue : annotationMemberValuePairToTAnnotationValueList
							.getEntryObjects()) {
						if (tmpAnnotationMemberValuePairToTAnnotationValue instanceof AnnotationMemberValuePairToTAnnotationValue) {
							AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) tmpAnnotationMemberValuePairToTAnnotationValue;
							AnnotationMemberValuePair mAnnotationValue = annotationMemberValuePairToTAnnotationValue
									.getSource();
							if (mAnnotationValue != null) {
								TAnnotationValue tAnnotationValue = annotationMemberValuePairToTAnnotationValue
										.getTarget();
								if (tAnnotationValue != null) {
									if (pattern_AnnotationMemberValueClass_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, annotationMemberValuePairToTAnnotationValue) == null) {
										if (pattern_AnnotationMemberValueClass_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, mAnnotationValue) == null) {
											if (pattern_AnnotationMemberValueClass_29_2_isapplicablecore_black_nac_3BB(
													ruleResult, tAnnotationValue) == null) {
												for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
													if (tmpMTypeToTType instanceof TypeToTAbstractType) {
														TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
														Type mType = mTypeToTType.getSource();
														if (mType != null) {
															TAbstractType tType = mTypeToTType.getTarget();
															if (tType != null) {
																if (pattern_AnnotationMemberValueClass_29_2_isapplicablecore_black_nac_5BB(
																		ruleResult, mTypeToTType) == null) {
																	if (pattern_AnnotationMemberValueClass_29_2_isapplicablecore_black_nac_6BB(
																			ruleResult, mType) == null) {
																		if (pattern_AnnotationMemberValueClass_29_2_isapplicablecore_black_nac_7BB(
																				ruleResult, tType) == null) {
																			for (Annotation annotation : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(
																							mAnnotationValue,
																							Annotation.class,
																							"values")) {
																				if (pattern_AnnotationMemberValueClass_29_2_isapplicablecore_black_nac_0BB(
																						ruleResult,
																						annotation) == null) {
																					for (BodyDeclaration mOwner : org.moflon.core.utilities.eMoflonEMFUtil
																							.getOppositeReferenceTyped(
																									annotation,
																									BodyDeclaration.class,
																									"annotations")) {
																						if (pattern_AnnotationMemberValueClass_29_2_isapplicablecore_black_nac_4BB(
																								ruleResult,
																								mOwner) == null) {
																							_result.add(new Object[] {
																									annotationMemberValuePairToTAnnotationValueList,
																									annotation,
																									mAnnotationValue,
																									annotationMemberValuePairToTAnnotationValue,
																									tAnnotationValue,
																									mOwner,
																									mTypeToTTypeList,
																									mTypeToTType, mType,
																									tType,
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
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_29_3_solveCSP_bindingFBBBBBBBBBBB(
			AnnotationMemberValueClass _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, Type mType, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, annotation, mAnnotationValue,
				annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, mOwner, tAnnotationValue, mType,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotation, mAnnotationValue,
					annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, mOwner, tAnnotationValue, mType,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			AnnotationMemberValueClass _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, Type mType, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnnotationMemberValueClass_29_3_solveCSP_binding = pattern_AnnotationMemberValueClass_29_3_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue,
				mTypeToTType, tType, mOwner, tAnnotationValue, mType, ruleResult);
		if (result_pattern_AnnotationMemberValueClass_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueClass_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueClass_29_3_solveCSP_black = pattern_AnnotationMemberValueClass_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueClass_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotation, mAnnotationValue,
						annotationMemberValuePairToTAnnotationValue, mTypeToTType, tType, mOwner, tAnnotationValue,
						mType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueClass_29_4_checkCSP_expressionFBB(
			AnnotationMemberValueClass _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClass_29_5_checknacs_blackBBBBBBBB(Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, Type mType) {
		return new Object[] { annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue, mTypeToTType,
				tType, mOwner, tAnnotationValue, mType };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_29_6_perform_blackBBBBBBBBB(Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, Type mType, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue, mTypeToTType,
				tType, mOwner, tAnnotationValue, mType, ruleResult };
	}

	public static final Object[] pattern_AnnotationMemberValueClass_29_6_perform_greenFBBFFFBBB(
			AnnotationMemberValuePair mAnnotationValue, TAbstractType tType, TAnnotationValue tAnnotationValue,
			Type mType, ModelgeneratorRuleResult ruleResult) {
		TypeAccess mAccess = JavaFactory.eINSTANCE.createTypeAccess();
		TClassNode tValue = AnnotationsFactory.eINSTANCE.createTClassNode();
		LiteralToTNode mValueToTValue = PmFactory.eINSTANCE.createLiteralToTNode();
		TypeLiteral mValue = JavaFactory.eINSTANCE.createTypeLiteral();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		mAccess.setType(mType);
		ruleResult.getSourceObjects().add(mAccess);
		tValue.setTClass(tType);
		tAnnotationValue.getTValue().add(tValue);
		ruleResult.getTargetObjects().add(tValue);
		mValueToTValue.setTarget(tValue);
		ruleResult.getCorrObjects().add(mValueToTValue);
		mValue.setType(mAccess);
		mValueToTValue.setSource(mValue);
		mAnnotationValue.setValue(mValue);
		ruleResult.getSourceObjects().add(mValue);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mAccess, mAnnotationValue, tType, tValue, mValueToTValue, mValue, tAnnotationValue, mType,
				ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationMemberValueClass_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationMemberValueClassImpl
