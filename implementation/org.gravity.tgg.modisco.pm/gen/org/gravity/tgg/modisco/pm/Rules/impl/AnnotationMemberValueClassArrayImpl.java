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
import org.eclipse.modisco.java.ArrayInitializer;
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

import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueClassArray;
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
 * An implementation of the model object '<em><b>Annotation Member Value Class Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotationMemberValueClassArrayImpl extends AbstractRuleImpl implements AnnotationMemberValueClassArray {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationMemberValueClassArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnnotationMemberValueClassArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TypeLiteral mValue, Type mType,
			BodyDeclaration mOwner) {

		Object[] result1_black = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_0_1_initialbindings_blackBBBBBBBBB(this, match, annotation,
						mAccess, mAnnotationValue, mArray, mValue, mType, mOwner);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[annotation] = " + annotation + ", " + "[mAccess] = " + mAccess
					+ ", " + "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mArray] = " + mArray + ", "
					+ "[mValue] = " + mValue + ", " + "[mType] = " + mType + ", " + "[mOwner] = " + mOwner + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_0_2_SolveCSP_bindingAndBlackFBBBBBBBBB(this, match, annotation,
						mAccess, mAnnotationValue, mArray, mValue, mType, mOwner);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[annotation] = " + annotation + ", " + "[mAccess] = " + mAccess
					+ ", " + "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mArray] = " + mArray + ", "
					+ "[mValue] = " + mValue + ", " + "[mType] = " + mType + ", " + "[mOwner] = " + mOwner + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationMemberValueClassArrayImpl.pattern_AnnotationMemberValueClassArray_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_0_4_collectelementstobetranslated_blackBBBBBBBB(match,
							annotation, mAccess, mAnnotationValue, mArray, mValue, mType, mOwner);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[annotation] = " + annotation + ", " + "[mAccess] = " + mAccess + ", "
						+ "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mArray] = " + mArray + ", "
						+ "[mValue] = " + mValue + ", " + "[mType] = " + mType + ", " + "[mOwner] = " + mOwner + ".");
			}
			AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(match,
							mAccess, mAnnotationValue, mArray, mValue, mType);
			//nothing EMoflonEdge mValue__mAccess____type = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge mAccess__mType____type = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge mType__mAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge mArray__mValue____expressions = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge mAnnotationValue__mArray____value = (EMoflonEdge) result4_green[10];

			Object[] result5_black = AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_0_5_collectcontextelements_blackBBBBBBBB(match, annotation,
							mAccess, mAnnotationValue, mArray, mValue, mType, mOwner);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[annotation] = " + annotation + ", " + "[mAccess] = " + mAccess + ", "
						+ "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mArray] = " + mArray + ", "
						+ "[mValue] = " + mValue + ", " + "[mType] = " + mType + ", " + "[mOwner] = " + mOwner + ".");
			}
			AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_0_5_collectcontextelements_greenBBBBBFF(match, annotation,
							mAnnotationValue, mType, mOwner);
			//nothing EMoflonEdge annotation__mAnnotationValue____values = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge mOwner__annotation____annotations = (EMoflonEdge) result5_green[6];

			// 
			AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_0_6_registerobjectstomatch_expressionBBBBBBBBB(this, match,
							annotation, mAccess, mAnnotationValue, mArray, mValue, mType, mOwner);
			return AnnotationMemberValueClassArrayImpl.pattern_AnnotationMemberValueClassArray_0_7_expressionF();
		} else {
			return AnnotationMemberValueClassArrayImpl.pattern_AnnotationMemberValueClassArray_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Annotation annotation = (Annotation) result1_bindingAndBlack[0];
		TypeAccess mAccess = (TypeAccess) result1_bindingAndBlack[1];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result1_bindingAndBlack[2];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[4];
		ArrayInitializer mArray = (ArrayInitializer) result1_bindingAndBlack[5];
		TypeLiteral mValue = (TypeLiteral) result1_bindingAndBlack[6];
		Type mType = (Type) result1_bindingAndBlack[7];
		AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result1_bindingAndBlack[8];
		BodyDeclaration mOwner = (BodyDeclaration) result1_bindingAndBlack[9];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result1_bindingAndBlack[10];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_1_1_performtransformation_greenBFBFB(tType, mValue,
						tAnnotationValue);
		TClassNode tValue = (TClassNode) result1_green[1];
		LiteralToTNode mValueToTValue = (LiteralToTNode) result1_green[3];

		Object[] result2_black = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_1_2_collecttranslatedelements_blackBBBBB(mAccess, mArray,
						tValue, mValue, mValueToTValue);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mAccess] = " + mAccess + ", "
					+ "[mArray] = " + mArray + ", " + "[tValue] = " + tValue + ", " + "[mValue] = " + mValue + ", "
					+ "[mValueToTValue] = " + mValueToTValue + ".");
		}
		Object[] result2_green = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_1_2_collecttranslatedelements_greenFBBBBB(mAccess, mArray,
						tValue, mValue, mValueToTValue);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(ruleresult,
						annotation, mAccess, mAnnotationValue, mTypeToTType, tType, mArray, tValue, mValue, mType,
						AnnotationMemberValuePairToTAnnotationValue, mOwner, mValueToTValue, tAnnotationValue);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[annotation] = " + annotation + ", " + "[mAccess] = " + mAccess + ", "
					+ "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tType] = " + tType + ", " + "[mArray] = " + mArray + ", " + "[tValue] = " + tValue + ", "
					+ "[mValue] = " + mValue + ", " + "[mType] = " + mType + ", "
					+ "[AnnotationMemberValuePairToTAnnotationValue] = " + AnnotationMemberValuePairToTAnnotationValue
					+ ", " + "[mOwner] = " + mOwner + ", " + "[mValueToTValue] = " + mValueToTValue + ", "
					+ "[tAnnotationValue] = " + tAnnotationValue + ".");
		}
		AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFF(ruleresult,
						mAccess, mAnnotationValue, tType, mArray, tValue, mValue, mType, mValueToTValue,
						tAnnotationValue);
		//nothing EMoflonEdge mValue__mAccess____type = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mAccess__mType____type = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mType__mAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mValueToTValue__mValue____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tValue__tType____tClass = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mArray__mValue____expressions = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mValueToTValue__tValue____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge mAnnotationValue__mArray____value = (EMoflonEdge) result3_green[18];

		// 
		// 
		AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_1_5_registerobjects_expressionBBBBBBBBBBBBBBB(this, ruleresult,
						annotation, mAccess, mAnnotationValue, mTypeToTType, tType, mArray, tValue, mValue, mType,
						AnnotationMemberValuePairToTAnnotationValue, mOwner, mValueToTValue, tAnnotationValue);
		return AnnotationMemberValueClassArrayImpl.pattern_AnnotationMemberValueClassArray_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_2_2_corematch_bindingFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Annotation annotation = (Annotation) result2_binding[0];
		TypeAccess mAccess = (TypeAccess) result2_binding[1];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_binding[2];
		ArrayInitializer mArray = (ArrayInitializer) result2_binding[3];
		TypeLiteral mValue = (TypeLiteral) result2_binding[4];
		Type mType = (Type) result2_binding[5];
		BodyDeclaration mOwner = (BodyDeclaration) result2_binding[6];
		for (Object[] result2_black : AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_2_2_corematch_blackBBBFFBBBFBFB(annotation, mAccess,
						mAnnotationValue, mArray, mValue, mType, mOwner, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[3];
			TAbstractType tType = (TAbstractType) result2_black[4];
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result2_black[8];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_black[10];
			// ForEach 
			for (Object[] result3_black : AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_2_3_findcontext_blackBBBBBBBBBBB(annotation, mAccess,
							mAnnotationValue, mTypeToTType, tType, mArray, mValue, mType,
							AnnotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue)) {
				Object[] result3_green = AnnotationMemberValueClassArrayImpl
						.pattern_AnnotationMemberValueClassArray_2_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFFF(
								annotation, mAccess, mAnnotationValue, mTypeToTType, tType, mArray, mValue, mType,
								AnnotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				//nothing EMoflonEdge mValue__mAccess____type = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mAccess__mType____type = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mType__mAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge annotation__mAnnotationValue____values = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__mAnnotationValue____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mOwner__annotation____annotations = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mArray__mValue____expressions = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge mAnnotationValue__mArray____value = (EMoflonEdge) result3_green[22];

				Object[] result4_bindingAndBlack = AnnotationMemberValueClassArrayImpl
						.pattern_AnnotationMemberValueClassArray_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(this,
								isApplicableMatch, annotation, mAccess, mAnnotationValue, mTypeToTType, tType, mArray,
								mValue, mType, AnnotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[annotation] = " + annotation
							+ ", " + "[mAccess] = " + mAccess + ", " + "[mAnnotationValue] = " + mAnnotationValue + ", "
							+ "[mTypeToTType] = " + mTypeToTType + ", " + "[tType] = " + tType + ", " + "[mArray] = "
							+ mArray + ", " + "[mValue] = " + mValue + ", " + "[mType] = " + mType + ", "
							+ "[AnnotationMemberValuePairToTAnnotationValue] = "
							+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mOwner] = " + mOwner + ", "
							+ "[tAnnotationValue] = " + tAnnotationValue + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationMemberValueClassArrayImpl
						.pattern_AnnotationMemberValueClassArray_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationMemberValueClassArrayImpl
							.pattern_AnnotationMemberValueClassArray_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationMemberValueClassArrayImpl
							.pattern_AnnotationMemberValueClassArray_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationMemberValueClassArrayImpl.pattern_AnnotationMemberValueClassArray_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TypeLiteral mValue, Type mType,
			BodyDeclaration mOwner) {
		match.registerObject("annotation", annotation);
		match.registerObject("mAccess", mAccess);
		match.registerObject("mAnnotationValue", mAnnotationValue);
		match.registerObject("mArray", mArray);
		match.registerObject("mValue", mValue);
		match.registerObject("mType", mType);
		match.registerObject("mOwner", mOwner);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TypeLiteral mValue, Type mType,
			BodyDeclaration mOwner) {// Create CSP
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
			AnnotationMemberValuePair mAnnotationValue, TypeToTAbstractType mTypeToTType, TAbstractType tType,
			ArrayInitializer mArray, TypeLiteral mValue, Type mType,
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue) {// Create CSP
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
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mArray", mArray);
		isApplicableMatch.registerObject("mValue", mValue);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.registerObject("mOwner", mOwner);
		isApplicableMatch.registerObject("tAnnotationValue", tAnnotationValue);
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
			EObject mAnnotationValue, EObject mTypeToTType, EObject tType, EObject mArray, EObject tValue,
			EObject mValue, EObject mType, EObject AnnotationMemberValuePairToTAnnotationValue, EObject mOwner,
			EObject mValueToTValue, EObject tAnnotationValue) {
		ruleresult.registerObject("annotation", annotation);
		ruleresult.registerObject("mAccess", mAccess);
		ruleresult.registerObject("mAnnotationValue", mAnnotationValue);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mArray", mArray);
		ruleresult.registerObject("tValue", tValue);
		ruleresult.registerObject("mValue", mValue);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		ruleresult.registerObject("mOwner", mOwner);
		ruleresult.registerObject("mValueToTValue", mValueToTValue);
		ruleresult.registerObject("tAnnotationValue", tAnnotationValue);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mAccess").eClass()).equals("java.TypeAccess.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mArray").eClass())
						.equals("java.ArrayInitializer.")
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

		Object[] result1_black = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_10_1_initialbindings_blackBBBBB(this, match, tType, tValue,
						tAnnotationValue);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tValue] = " + tValue + ", "
					+ "[tAnnotationValue] = " + tAnnotationValue + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tType, tValue,
						tAnnotationValue);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tValue] = " + tValue + ", "
					+ "[tAnnotationValue] = " + tAnnotationValue + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_10_4_collectelementstobetranslated_blackBBBB(match, tType,
							tValue, tAnnotationValue);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tType] = " + tType + ", " + "[tValue] = " + tValue + ", " + "[tAnnotationValue] = "
						+ tAnnotationValue + ".");
			}
			AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_10_4_collectelementstobetranslated_greenBBBBFF(match,
							tType, tValue, tAnnotationValue);
			//nothing EMoflonEdge tValue__tType____tClass = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result4_green[5];

			Object[] result5_black = AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_10_5_collectcontextelements_blackBBBB(match, tType, tValue,
							tAnnotationValue);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tType] = " + tType + ", " + "[tValue] = " + tValue + ", " + "[tAnnotationValue] = "
						+ tAnnotationValue + ".");
			}
			AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_10_5_collectcontextelements_greenBBB(match, tType,
							tAnnotationValue);

			// 
			AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							tType, tValue, tAnnotationValue);
			return AnnotationMemberValueClassArrayImpl.pattern_AnnotationMemberValueClassArray_10_7_expressionF();
		} else {
			return AnnotationMemberValueClassArrayImpl.pattern_AnnotationMemberValueClassArray_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Annotation annotation = (Annotation) result1_bindingAndBlack[0];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result1_bindingAndBlack[1];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[2];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[3];
		TClassNode tValue = (TClassNode) result1_bindingAndBlack[4];
		Type mType = (Type) result1_bindingAndBlack[5];
		AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result1_bindingAndBlack[6];
		BodyDeclaration mOwner = (BodyDeclaration) result1_bindingAndBlack[7];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_11_1_performtransformation_greenFBFBFBF(mAnnotationValue,
						tValue, mType);
		TypeAccess mAccess = (TypeAccess) result1_green[0];
		ArrayInitializer mArray = (ArrayInitializer) result1_green[2];
		TypeLiteral mValue = (TypeLiteral) result1_green[4];
		LiteralToTNode mValueToTValue = (LiteralToTNode) result1_green[6];

		Object[] result2_black = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_11_2_collecttranslatedelements_blackBBBBB(mAccess, mArray,
						tValue, mValue, mValueToTValue);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mAccess] = " + mAccess + ", "
					+ "[mArray] = " + mArray + ", " + "[tValue] = " + tValue + ", " + "[mValue] = " + mValue + ", "
					+ "[mValueToTValue] = " + mValueToTValue + ".");
		}
		Object[] result2_green = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_11_2_collecttranslatedelements_greenFBBBBB(mAccess, mArray,
						tValue, mValue, mValueToTValue);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(ruleresult,
						annotation, mAccess, mAnnotationValue, mTypeToTType, tType, mArray, tValue, mValue, mType,
						AnnotationMemberValuePairToTAnnotationValue, mOwner, mValueToTValue, tAnnotationValue);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[annotation] = " + annotation + ", " + "[mAccess] = " + mAccess + ", "
					+ "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tType] = " + tType + ", " + "[mArray] = " + mArray + ", " + "[tValue] = " + tValue + ", "
					+ "[mValue] = " + mValue + ", " + "[mType] = " + mType + ", "
					+ "[AnnotationMemberValuePairToTAnnotationValue] = " + AnnotationMemberValuePairToTAnnotationValue
					+ ", " + "[mOwner] = " + mOwner + ", " + "[mValueToTValue] = " + mValueToTValue + ", "
					+ "[tAnnotationValue] = " + tAnnotationValue + ".");
		}
		AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFF(ruleresult,
						mAccess, mAnnotationValue, tType, mArray, tValue, mValue, mType, mValueToTValue,
						tAnnotationValue);
		//nothing EMoflonEdge mValue__mAccess____type = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mAccess__mType____type = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mType__mAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mValueToTValue__mValue____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tValue__tType____tClass = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mArray__mValue____expressions = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mValueToTValue__tValue____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge mAnnotationValue__mArray____value = (EMoflonEdge) result3_green[18];

		// 
		// 
		AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_11_5_registerobjects_expressionBBBBBBBBBBBBBBB(this,
						ruleresult, annotation, mAccess, mAnnotationValue, mTypeToTType, tType, mArray, tValue, mValue,
						mType, AnnotationMemberValuePairToTAnnotationValue, mOwner, mValueToTValue, tAnnotationValue);
		return AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAbstractType tType = (TAbstractType) result2_binding[0];
		TClassNode tValue = (TClassNode) result2_binding[1];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_binding[2];
		for (Object[] result2_black : AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_12_2_corematch_blackFFBBFFBB(tType, tValue, tAnnotationValue,
						match)) {
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			Type mType = (Type) result2_black[4];
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result2_black[5];
			// ForEach 
			for (Object[] result3_black : AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_12_3_findcontext_blackFBBBBBBFB(mAnnotationValue,
							mTypeToTType, tType, tValue, mType, AnnotationMemberValuePairToTAnnotationValue,
							tAnnotationValue)) {
				Annotation annotation = (Annotation) result3_black[0];
				BodyDeclaration mOwner = (BodyDeclaration) result3_black[7];
				Object[] result3_green = AnnotationMemberValueClassArrayImpl
						.pattern_AnnotationMemberValueClassArray_12_3_findcontext_greenBBBBBBBBBFFFFFFFFF(annotation,
								mAnnotationValue, mTypeToTType, tType, tValue, mType,
								AnnotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tValue__tType____tClass = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge annotation__mAnnotationValue____values = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__mAnnotationValue____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mOwner__annotation____annotations = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = AnnotationMemberValueClassArrayImpl
						.pattern_AnnotationMemberValueClassArray_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, annotation, mAnnotationValue, mTypeToTType, tType, tValue, mType,
								AnnotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[annotation] = " + annotation
							+ ", " + "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mTypeToTType] = "
							+ mTypeToTType + ", " + "[tType] = " + tType + ", " + "[tValue] = " + tValue + ", "
							+ "[mType] = " + mType + ", " + "[AnnotationMemberValuePairToTAnnotationValue] = "
							+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mOwner] = " + mOwner + ", "
							+ "[tAnnotationValue] = " + tAnnotationValue + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationMemberValueClassArrayImpl
						.pattern_AnnotationMemberValueClassArray_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationMemberValueClassArrayImpl
							.pattern_AnnotationMemberValueClassArray_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationMemberValueClassArrayImpl
							.pattern_AnnotationMemberValueClassArray_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_12_7_expressionFB(ruleresult);
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
			AnnotationMemberValuePair mAnnotationValue, TypeToTAbstractType mTypeToTType, TAbstractType tType,
			TClassNode tValue, Type mType,
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue) {// Create CSP
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
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("tValue", tValue);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.registerObject("mOwner", mOwner);
		isApplicableMatch.registerObject("tAnnotationValue", tAnnotationValue);
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
			EObject mAnnotationValue, EObject mTypeToTType, EObject tType, EObject mArray, EObject tValue,
			EObject mValue, EObject mType, EObject AnnotationMemberValuePairToTAnnotationValue, EObject mOwner,
			EObject mValueToTValue, EObject tAnnotationValue) {
		ruleresult.registerObject("annotation", annotation);
		ruleresult.registerObject("mAccess", mAccess);
		ruleresult.registerObject("mAnnotationValue", mAnnotationValue);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mArray", mArray);
		ruleresult.registerObject("tValue", tValue);
		ruleresult.registerObject("mValue", mValue);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		ruleresult.registerObject("mOwner", mOwner);
		ruleresult.registerObject("mValueToTValue", mValueToTValue);
		ruleresult.registerObject("tAnnotationValue", tAnnotationValue);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_757(EMoflonEdge _edge_tClass) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_20_2_testcorematchandDECs_blackFFFB(_edge_tClass)) {
			TAbstractType tType = (TAbstractType) result2_black[0];
			TClassNode tValue = (TClassNode) result2_black[1];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_black[2];
			Object[] result2_green = AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tType, tValue, tAnnotationValue)) {
				// 
				if (AnnotationMemberValueClassArrayImpl
						.pattern_AnnotationMemberValueClassArray_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationMemberValueClassArrayImpl
							.pattern_AnnotationMemberValueClassArray_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationMemberValueClassArrayImpl
							.pattern_AnnotationMemberValueClassArray_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberValueClassArrayImpl.pattern_AnnotationMemberValueClassArray_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_778(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_blackFFFFFFFB(_edge_type)) {
			Annotation annotation = (Annotation) result2_black[0];
			TypeAccess mAccess = (TypeAccess) result2_black[1];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_black[2];
			ArrayInitializer mArray = (ArrayInitializer) result2_black[3];
			TypeLiteral mValue = (TypeLiteral) result2_black[4];
			Type mType = (Type) result2_black[5];
			BodyDeclaration mOwner = (BodyDeclaration) result2_black[6];
			Object[] result2_green = AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBB(
							this, match, annotation, mAccess, mAnnotationValue, mArray, mValue, mType, mOwner)) {
				// 
				if (AnnotationMemberValueClassArrayImpl
						.pattern_AnnotationMemberValueClassArray_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationMemberValueClassArrayImpl
							.pattern_AnnotationMemberValueClassArray_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationMemberValueClassArrayImpl
							.pattern_AnnotationMemberValueClassArray_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberValueClassArrayImpl.pattern_AnnotationMemberValueClassArray_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnnotationMemberValueClassArray");
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
		ruleResult.setRule("AnnotationMemberValueClassArray");
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

		Object[] result1_black = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Annotation annotation = (Annotation) result2_bindingAndBlack[0];
		TypeAccess mAccess = (TypeAccess) result2_bindingAndBlack[1];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_bindingAndBlack[2];
		TAbstractType tType = (TAbstractType) result2_bindingAndBlack[3];
		ArrayInitializer mArray = (ArrayInitializer) result2_bindingAndBlack[4];
		TClassNode tValue = (TClassNode) result2_bindingAndBlack[5];
		TypeLiteral mValue = (TypeLiteral) result2_bindingAndBlack[6];
		Type mType = (Type) result2_bindingAndBlack[7];
		BodyDeclaration mOwner = (BodyDeclaration) result2_bindingAndBlack[8];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, annotation,
						mAccess, mAnnotationValue, tType, mArray, tValue, mValue, mType, mOwner, tAnnotationValue,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[annotation] = " + annotation + ", " + "[mAccess] = " + mAccess + ", " + "[mAnnotationValue] = "
					+ mAnnotationValue + ", " + "[tType] = " + tType + ", " + "[mArray] = " + mArray + ", "
					+ "[tValue] = " + tValue + ", " + "[mValue] = " + mValue + ", " + "[mType] = " + mType + ", "
					+ "[mOwner] = " + mOwner + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_24_5_matchcorrcontext_blackBFBBFBBB(mAnnotationValue,
							tType, mType, tAnnotationValue, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[1];
				AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result5_black[4];
				Object[] result5_green = AnnotationMemberValueClassArrayImpl
						.pattern_AnnotationMemberValueClassArray_24_5_matchcorrcontext_greenBBBBF(mTypeToTType,
								AnnotationMemberValuePairToTAnnotationValue, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = AnnotationMemberValueClassArrayImpl
						.pattern_AnnotationMemberValueClassArray_24_6_createcorrespondence_blackBBBBBBBBBBB(annotation,
								mAccess, mAnnotationValue, tType, mArray, tValue, mValue, mType, mOwner,
								tAnnotationValue, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[annotation] = "
							+ annotation + ", " + "[mAccess] = " + mAccess + ", " + "[mAnnotationValue] = "
							+ mAnnotationValue + ", " + "[tType] = " + tType + ", " + "[mArray] = " + mArray + ", "
							+ "[tValue] = " + tValue + ", " + "[mValue] = " + mValue + ", " + "[mType] = " + mType
							+ ", " + "[mOwner] = " + mOwner + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationMemberValueClassArrayImpl
						.pattern_AnnotationMemberValueClassArray_24_6_createcorrespondence_greenBBFB(tValue, mValue,
								ccMatch);
				//nothing LiteralToTNode mValueToTValue = (LiteralToTNode) result6_green[2];

				Object[] result7_black = AnnotationMemberValueClassArrayImpl
						.pattern_AnnotationMemberValueClassArray_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationMemberValueClassArrayImpl
						.pattern_AnnotationMemberValueClassArray_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AnnotationMemberValueClassArrayImpl.pattern_AnnotationMemberValueClassArray_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, TAbstractType tType, ArrayInitializer mArray, TClassNode tValue,
			TypeLiteral mValue, Type mType, BodyDeclaration mOwner, TAnnotationValue tAnnotationValue,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
			ArrayInitializer mArray, TypeLiteral mValue, Type mType, BodyDeclaration mOwner) {// 
		Object[] result1_black = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_blackBBBBBBB(annotation, mAccess,
						mAnnotationValue, mArray, mValue, mType, mOwner);
		if (result1_black != null) {
			return AnnotationMemberValueClassArrayImpl.pattern_AnnotationMemberValueClassArray_27_2_expressionF();
		} else {
			return AnnotationMemberValueClassArrayImpl.pattern_AnnotationMemberValueClassArray_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAbstractType tType, TClassNode tValue, TAnnotationValue tAnnotationValue) {// 
		Object[] result1_black = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_28_1_matchtggpattern_blackBBB(tType, tValue, tAnnotationValue);
		if (result1_black != null) {
			return AnnotationMemberValueClassArrayImpl.pattern_AnnotationMemberValueClassArray_28_2_expressionF();
		} else {
			return AnnotationMemberValueClassArrayImpl.pattern_AnnotationMemberValueClassArray_28_3_expressionF();
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

		Object[] result1_black = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_blackFFFFFFFFFFBB(ruleEntryContainer,
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

			Object[] result3_bindingAndBlack = AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
							isApplicableMatch, annotation, mAnnotationValue, mTypeToTType, tType, mType,
							AnnotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[annotation] = " + annotation + ", "
						+ "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
						+ "[tType] = " + tType + ", " + "[mType] = " + mType + ", "
						+ "[AnnotationMemberValuePairToTAnnotationValue] = "
						+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mOwner] = " + mOwner + ", "
						+ "[tAnnotationValue] = " + tAnnotationValue + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnnotationMemberValueClassArrayImpl
					.pattern_AnnotationMemberValueClassArray_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnnotationMemberValueClassArrayImpl
						.pattern_AnnotationMemberValueClassArray_29_5_checknacs_blackBBBBBBBB(annotation,
								mAnnotationValue, mTypeToTType, tType, mType,
								AnnotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue);
				if (result5_black != null) {

					Object[] result6_black = AnnotationMemberValueClassArrayImpl
							.pattern_AnnotationMemberValueClassArray_29_6_perform_blackBBBBBBBBB(annotation,
									mAnnotationValue, mTypeToTType, tType, mType,
									AnnotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[annotation] = "
								+ annotation + ", " + "[mAnnotationValue] = " + mAnnotationValue + ", "
								+ "[mTypeToTType] = " + mTypeToTType + ", " + "[tType] = " + tType + ", " + "[mType] = "
								+ mType + ", " + "[AnnotationMemberValuePairToTAnnotationValue] = "
								+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mOwner] = " + mOwner + ", "
								+ "[tAnnotationValue] = " + tAnnotationValue + ", " + "[ruleResult] = " + ruleResult
								+ ".");
					}
					AnnotationMemberValueClassArrayImpl
							.pattern_AnnotationMemberValueClassArray_29_6_perform_greenFBBFFFBFBB(mAnnotationValue,
									tType, mType, tAnnotationValue, ruleResult);
					//nothing TypeAccess mAccess = (TypeAccess) result6_green[0];
					//nothing ArrayInitializer mArray = (ArrayInitializer) result6_green[3];
					//nothing TClassNode tValue = (TClassNode) result6_green[4];
					//nothing TypeLiteral mValue = (TypeLiteral) result6_green[5];
					//nothing LiteralToTNode mValueToTValue = (LiteralToTNode) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberValueClassArrayImpl
				.pattern_AnnotationMemberValueClassArray_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, TypeToTAbstractType mTypeToTType, TAbstractType tType,
			Type mType, AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.registerObject("mOwner", mOwner);
		isApplicableMatch.registerObject("tAnnotationValue", tAnnotationValue);
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
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___IS_APPROPRIATE_FWD__MATCH_ANNOTATION_TYPEACCESS_ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_TYPELITERAL_TYPE_BODYDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
					(TypeAccess) arguments.get(2), (AnnotationMemberValuePair) arguments.get(3),
					(ArrayInitializer) arguments.get(4), (TypeLiteral) arguments.get(5), (Type) arguments.get(6),
					(BodyDeclaration) arguments.get(7));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANNOTATION_TYPEACCESS_ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_TYPELITERAL_TYPE_BODYDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
					(TypeAccess) arguments.get(2), (AnnotationMemberValuePair) arguments.get(3),
					(ArrayInitializer) arguments.get(4), (TypeLiteral) arguments.get(5), (Type) arguments.get(6),
					(BodyDeclaration) arguments.get(7));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANNOTATION_TYPEACCESS_ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_TYPELITERAL_TYPE_BODYDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
					(TypeAccess) arguments.get(2), (AnnotationMemberValuePair) arguments.get(3),
					(ArrayInitializer) arguments.get(4), (TypeLiteral) arguments.get(5), (Type) arguments.get(6),
					(BodyDeclaration) arguments.get(7));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ANNOTATION_TYPEACCESS_ANNOTATIONMEMBERVALUEPAIR_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_ARRAYINITIALIZER_TYPELITERAL_TYPE_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE_BODYDECLARATION_TANNOTATIONVALUE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Annotation) arguments.get(1),
					(TypeAccess) arguments.get(2), (AnnotationMemberValuePair) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (TAbstractType) arguments.get(5),
					(ArrayInitializer) arguments.get(6), (TypeLiteral) arguments.get(7), (Type) arguments.get(8),
					(AnnotationMemberValuePairToTAnnotationValue) arguments.get(9), (BodyDeclaration) arguments.get(10),
					(TAnnotationValue) arguments.get(11));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___IS_APPROPRIATE_BWD__MATCH_TABSTRACTTYPE_TCLASSNODE_TANNOTATIONVALUE:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TClassNode) arguments.get(2), (TAnnotationValue) arguments.get(3));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTTYPE_TCLASSNODE_TANNOTATIONVALUE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TClassNode) arguments.get(2), (TAnnotationValue) arguments.get(3));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTTYPE_TCLASSNODE_TANNOTATIONVALUE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TClassNode) arguments.get(2), (TAnnotationValue) arguments.get(3));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TCLASSNODE_TYPE_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE_BODYDECLARATION_TANNOTATIONVALUE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Annotation) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2), (TypeToTAbstractType) arguments.get(3),
					(TAbstractType) arguments.get(4), (TClassNode) arguments.get(5), (Type) arguments.get(6),
					(AnnotationMemberValuePairToTAnnotationValue) arguments.get(7), (BodyDeclaration) arguments.get(8),
					(TAnnotationValue) arguments.get(9));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___IS_APPROPRIATE_BWD_EMOFLON_EDGE_757__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_757((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___IS_APPROPRIATE_FWD_EMOFLON_EDGE_778__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_778((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___IS_APPLICABLE_SOLVE_CSP_CC__ANNOTATION_TYPEACCESS_ANNOTATIONMEMBERVALUEPAIR_TABSTRACTTYPE_ARRAYINITIALIZER_TCLASSNODE_TYPELITERAL_TYPE_BODYDECLARATION_TANNOTATIONVALUE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Annotation) arguments.get(0), (TypeAccess) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2), (TAbstractType) arguments.get(3),
					(ArrayInitializer) arguments.get(4), (TClassNode) arguments.get(5), (TypeLiteral) arguments.get(6),
					(Type) arguments.get(7), (BodyDeclaration) arguments.get(8), (TAnnotationValue) arguments.get(9),
					(Match) arguments.get(10), (Match) arguments.get(11));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___CHECK_DEC_FWD__ANNOTATION_TYPEACCESS_ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_TYPELITERAL_TYPE_BODYDECLARATION:
			return checkDEC_FWD((Annotation) arguments.get(0), (TypeAccess) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2), (ArrayInitializer) arguments.get(3),
					(TypeLiteral) arguments.get(4), (Type) arguments.get(5), (BodyDeclaration) arguments.get(6));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___CHECK_DEC_BWD__TABSTRACTTYPE_TCLASSNODE_TANNOTATIONVALUE:
			return checkDEC_BWD((TAbstractType) arguments.get(0), (TClassNode) arguments.get(1),
					(TAnnotationValue) arguments.get(2));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___GENERATE_MODEL__RULEENTRYCONTAINER_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(AnnotationMemberValuePairToTAnnotationValue) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TYPE_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE_BODYDECLARATION_TANNOTATIONVALUE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Annotation) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2), (TypeToTAbstractType) arguments.get(3),
					(TAbstractType) arguments.get(4), (Type) arguments.get(5),
					(AnnotationMemberValuePairToTAnnotationValue) arguments.get(6), (BodyDeclaration) arguments.get(7),
					(TAnnotationValue) arguments.get(8), (ModelgeneratorRuleResult) arguments.get(9));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_CLASS_ARRAY___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_0_1_initialbindings_blackBBBBBBBBB(
			AnnotationMemberValueClassArray _this, Match match, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TypeLiteral mValue, Type mType,
			BodyDeclaration mOwner) {
		return new Object[] { _this, match, annotation, mAccess, mAnnotationValue, mArray, mValue, mType, mOwner };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_0_2_SolveCSP_bindingFBBBBBBBBB(
			AnnotationMemberValueClassArray _this, Match match, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TypeLiteral mValue, Type mType,
			BodyDeclaration mOwner) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, annotation, mAccess, mAnnotationValue, mArray,
				mValue, mType, mOwner);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, annotation, mAccess, mAnnotationValue, mArray, mValue, mType,
					mOwner };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_0_2_SolveCSP_bindingAndBlackFBBBBBBBBB(
			AnnotationMemberValueClassArray _this, Match match, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TypeLiteral mValue, Type mType,
			BodyDeclaration mOwner) {
		Object[] result_pattern_AnnotationMemberValueClassArray_0_2_SolveCSP_binding = pattern_AnnotationMemberValueClassArray_0_2_SolveCSP_bindingFBBBBBBBBB(
				_this, match, annotation, mAccess, mAnnotationValue, mArray, mValue, mType, mOwner);
		if (result_pattern_AnnotationMemberValueClassArray_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueClassArray_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueClassArray_0_2_SolveCSP_black = pattern_AnnotationMemberValueClassArray_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueClassArray_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, annotation, mAccess, mAnnotationValue, mArray, mValue, mType,
						mOwner };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueClassArray_0_3_CheckCSP_expressionFBB(
			AnnotationMemberValueClassArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_0_4_collectelementstobetranslated_blackBBBBBBBB(
			Match match, Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue,
			ArrayInitializer mArray, TypeLiteral mValue, Type mType, BodyDeclaration mOwner) {
		return new Object[] { match, annotation, mAccess, mAnnotationValue, mArray, mValue, mType, mOwner };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_0_4_collectelementstobetranslated_greenBBBBBBFFFFF(
			Match match, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray,
			TypeLiteral mValue, Type mType) {
		EMoflonEdge mValue__mAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mArray__mValue____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationValue__mArray____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mAccess);
		match.getToBeTranslatedNodes().add(mArray);
		match.getToBeTranslatedNodes().add(mValue);
		String mValue__mAccess____type_name_prime = "type";
		String mAccess__mType____type_name_prime = "type";
		String mType__mAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mArray__mValue____expressions_name_prime = "expressions";
		String mAnnotationValue__mArray____value_name_prime = "value";
		mValue__mAccess____type.setSrc(mValue);
		mValue__mAccess____type.setTrg(mAccess);
		match.getToBeTranslatedEdges().add(mValue__mAccess____type);
		mAccess__mType____type.setSrc(mAccess);
		mAccess__mType____type.setTrg(mType);
		match.getToBeTranslatedEdges().add(mAccess__mType____type);
		mType__mAccess____usagesInTypeAccess.setSrc(mType);
		mType__mAccess____usagesInTypeAccess.setTrg(mAccess);
		match.getToBeTranslatedEdges().add(mType__mAccess____usagesInTypeAccess);
		mArray__mValue____expressions.setSrc(mArray);
		mArray__mValue____expressions.setTrg(mValue);
		match.getToBeTranslatedEdges().add(mArray__mValue____expressions);
		mAnnotationValue__mArray____value.setSrc(mAnnotationValue);
		mAnnotationValue__mArray____value.setTrg(mArray);
		match.getToBeTranslatedEdges().add(mAnnotationValue__mArray____value);
		mValue__mAccess____type.setName(mValue__mAccess____type_name_prime);
		mAccess__mType____type.setName(mAccess__mType____type_name_prime);
		mType__mAccess____usagesInTypeAccess.setName(mType__mAccess____usagesInTypeAccess_name_prime);
		mArray__mValue____expressions.setName(mArray__mValue____expressions_name_prime);
		mAnnotationValue__mArray____value.setName(mAnnotationValue__mArray____value_name_prime);
		return new Object[] { match, mAccess, mAnnotationValue, mArray, mValue, mType, mValue__mAccess____type,
				mAccess__mType____type, mType__mAccess____usagesInTypeAccess, mArray__mValue____expressions,
				mAnnotationValue__mArray____value };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_0_5_collectcontextelements_blackBBBBBBBB(
			Match match, Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue,
			ArrayInitializer mArray, TypeLiteral mValue, Type mType, BodyDeclaration mOwner) {
		return new Object[] { match, annotation, mAccess, mAnnotationValue, mArray, mValue, mType, mOwner };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_0_5_collectcontextelements_greenBBBBBFF(
			Match match, Annotation annotation, AnnotationMemberValuePair mAnnotationValue, Type mType,
			BodyDeclaration mOwner) {
		EMoflonEdge annotation__mAnnotationValue____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOwner__annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(annotation);
		match.getContextNodes().add(mAnnotationValue);
		match.getContextNodes().add(mType);
		match.getContextNodes().add(mOwner);
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
		return new Object[] { match, annotation, mAnnotationValue, mType, mOwner,
				annotation__mAnnotationValue____values, mOwner__annotation____annotations };
	}

	public static final void pattern_AnnotationMemberValueClassArray_0_6_registerobjectstomatch_expressionBBBBBBBBB(
			AnnotationMemberValueClassArray _this, Match match, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TypeLiteral mValue, Type mType,
			BodyDeclaration mOwner) {
		_this.registerObjectsToMatch_FWD(match, annotation, mAccess, mAnnotationValue, mArray, mValue, mType, mOwner);

	}

	public static final boolean pattern_AnnotationMemberValueClassArray_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueClassArray_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_1_1_performtransformation_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("annotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("mAccess");
		EObject _localVariable_2 = isApplicableMatch.getObject("mAnnotationValue");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tType");
		EObject _localVariable_5 = isApplicableMatch.getObject("mArray");
		EObject _localVariable_6 = isApplicableMatch.getObject("mValue");
		EObject _localVariable_7 = isApplicableMatch.getObject("mType");
		EObject _localVariable_8 = isApplicableMatch.getObject("AnnotationMemberValuePairToTAnnotationValue");
		EObject _localVariable_9 = isApplicableMatch.getObject("mOwner");
		EObject _localVariable_10 = isApplicableMatch.getObject("tAnnotationValue");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpMAccess = _localVariable_1;
		EObject tmpMAnnotationValue = _localVariable_2;
		EObject tmpMTypeToTType = _localVariable_3;
		EObject tmpTType = _localVariable_4;
		EObject tmpMArray = _localVariable_5;
		EObject tmpMValue = _localVariable_6;
		EObject tmpMType = _localVariable_7;
		EObject tmpAnnotationMemberValuePairToTAnnotationValue = _localVariable_8;
		EObject tmpMOwner = _localVariable_9;
		EObject tmpTAnnotationValue = _localVariable_10;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpMAccess instanceof TypeAccess) {
				TypeAccess mAccess = (TypeAccess) tmpMAccess;
				if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
					AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
					if (tmpMTypeToTType instanceof TypeToTAbstractType) {
						TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
						if (tmpTType instanceof TAbstractType) {
							TAbstractType tType = (TAbstractType) tmpTType;
							if (tmpMArray instanceof ArrayInitializer) {
								ArrayInitializer mArray = (ArrayInitializer) tmpMArray;
								if (tmpMValue instanceof TypeLiteral) {
									TypeLiteral mValue = (TypeLiteral) tmpMValue;
									if (tmpMType instanceof Type) {
										Type mType = (Type) tmpMType;
										if (tmpAnnotationMemberValuePairToTAnnotationValue instanceof AnnotationMemberValuePairToTAnnotationValue) {
											AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) tmpAnnotationMemberValuePairToTAnnotationValue;
											if (tmpMOwner instanceof BodyDeclaration) {
												BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
												if (tmpTAnnotationValue instanceof TAnnotationValue) {
													TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
													return new Object[] { annotation, mAccess, mAnnotationValue,
															mTypeToTType, tType, mArray, mValue, mType,
															annotationMemberValuePairToTAnnotationValue, mOwner,
															tAnnotationValue, isApplicableMatch };
												}
											}
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

	public static final Object[] pattern_AnnotationMemberValueClassArray_1_1_performtransformation_blackBBBBBBBBBBBFBB(
			Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, ArrayInitializer mArray, TypeLiteral mValue,
			Type mType, AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue, AnnotationMemberValueClassArray _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { annotation, mAccess, mAnnotationValue, mTypeToTType, tType, mArray, mValue, mType,
						annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(
			AnnotationMemberValueClassArray _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationMemberValueClassArray_1_1_performtransformation_binding = pattern_AnnotationMemberValueClassArray_1_1_performtransformation_bindingFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationMemberValueClassArray_1_1_performtransformation_binding != null) {
			Annotation annotation = (Annotation) result_pattern_AnnotationMemberValueClassArray_1_1_performtransformation_binding[0];
			TypeAccess mAccess = (TypeAccess) result_pattern_AnnotationMemberValueClassArray_1_1_performtransformation_binding[1];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberValueClassArray_1_1_performtransformation_binding[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_AnnotationMemberValueClassArray_1_1_performtransformation_binding[3];
			TAbstractType tType = (TAbstractType) result_pattern_AnnotationMemberValueClassArray_1_1_performtransformation_binding[4];
			ArrayInitializer mArray = (ArrayInitializer) result_pattern_AnnotationMemberValueClassArray_1_1_performtransformation_binding[5];
			TypeLiteral mValue = (TypeLiteral) result_pattern_AnnotationMemberValueClassArray_1_1_performtransformation_binding[6];
			Type mType = (Type) result_pattern_AnnotationMemberValueClassArray_1_1_performtransformation_binding[7];
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result_pattern_AnnotationMemberValueClassArray_1_1_performtransformation_binding[8];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberValueClassArray_1_1_performtransformation_binding[9];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberValueClassArray_1_1_performtransformation_binding[10];

			Object[] result_pattern_AnnotationMemberValueClassArray_1_1_performtransformation_black = pattern_AnnotationMemberValueClassArray_1_1_performtransformation_blackBBBBBBBBBBBFBB(
					annotation, mAccess, mAnnotationValue, mTypeToTType, tType, mArray, mValue, mType,
					annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, _this, isApplicableMatch);
			if (result_pattern_AnnotationMemberValueClassArray_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationMemberValueClassArray_1_1_performtransformation_black[11];

				return new Object[] { annotation, mAccess, mAnnotationValue, mTypeToTType, tType, mArray, mValue, mType,
						annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_1_1_performtransformation_greenBFBFB(
			TAbstractType tType, TypeLiteral mValue, TAnnotationValue tAnnotationValue) {
		TClassNode tValue = AnnotationsFactory.eINSTANCE.createTClassNode();
		LiteralToTNode mValueToTValue = PmFactory.eINSTANCE.createLiteralToTNode();
		tValue.setTClass(tType);
		tAnnotationValue.getTValue().add(tValue);
		mValueToTValue.setSource(mValue);
		mValueToTValue.setTarget(tValue);
		return new Object[] { tType, tValue, mValue, mValueToTValue, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_1_2_collecttranslatedelements_blackBBBBB(
			TypeAccess mAccess, ArrayInitializer mArray, TClassNode tValue, TypeLiteral mValue,
			LiteralToTNode mValueToTValue) {
		return new Object[] { mAccess, mArray, tValue, mValue, mValueToTValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_1_2_collecttranslatedelements_greenFBBBBB(
			TypeAccess mAccess, ArrayInitializer mArray, TClassNode tValue, TypeLiteral mValue,
			LiteralToTNode mValueToTValue) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mAccess);
		ruleresult.getTranslatedElements().add(mArray);
		ruleresult.getCreatedElements().add(tValue);
		ruleresult.getTranslatedElements().add(mValue);
		ruleresult.getCreatedLinkElements().add(mValueToTValue);
		return new Object[] { ruleresult, mAccess, mArray, tValue, mValue, mValueToTValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject annotation, EObject mAccess, EObject mAnnotationValue,
			EObject mTypeToTType, EObject tType, EObject mArray, EObject tValue, EObject mValue, EObject mType,
			EObject annotationMemberValuePairToTAnnotationValue, EObject mOwner, EObject mValueToTValue,
			EObject tAnnotationValue) {
		if (!annotation.equals(mAccess)) {
			if (!annotation.equals(mAnnotationValue)) {
				if (!annotation.equals(mTypeToTType)) {
					if (!annotation.equals(tType)) {
						if (!annotation.equals(mArray)) {
							if (!annotation.equals(tValue)) {
								if (!annotation.equals(mValue)) {
									if (!annotation.equals(mType)) {
										if (!annotation.equals(mOwner)) {
											if (!annotation.equals(mValueToTValue)) {
												if (!annotation.equals(tAnnotationValue)) {
													if (!mAccess.equals(mAnnotationValue)) {
														if (!mAccess.equals(mTypeToTType)) {
															if (!mAccess.equals(tType)) {
																if (!mAccess.equals(mArray)) {
																	if (!mAccess.equals(tValue)) {
																		if (!mAccess.equals(mValue)) {
																			if (!mAccess.equals(mType)) {
																				if (!mAccess.equals(mOwner)) {
																					if (!mAccess
																							.equals(mValueToTValue)) {
																						if (!mAccess.equals(
																								tAnnotationValue)) {
																							if (!mAnnotationValue
																									.equals(mTypeToTType)) {
																								if (!mAnnotationValue
																										.equals(tType)) {
																									if (!mAnnotationValue
																											.equals(mArray)) {
																										if (!mAnnotationValue
																												.equals(tValue)) {
																											if (!mAnnotationValue
																													.equals(mValue)) {
																												if (!mAnnotationValue
																														.equals(mType)) {
																													if (!mAnnotationValue
																															.equals(mOwner)) {
																														if (!mAnnotationValue
																																.equals(mValueToTValue)) {
																															if (!mAnnotationValue
																																	.equals(tAnnotationValue)) {
																																if (!mTypeToTType
																																		.equals(tType)) {
																																	if (!mTypeToTType
																																			.equals(tValue)) {
																																		if (!mTypeToTType
																																				.equals(mValue)) {
																																			if (!mTypeToTType
																																					.equals(mValueToTValue)) {
																																				if (!mTypeToTType
																																						.equals(tAnnotationValue)) {
																																					if (!tType
																																							.equals(tValue)) {
																																						if (!mArray
																																								.equals(mTypeToTType)) {
																																							if (!mArray
																																									.equals(tType)) {
																																								if (!mArray
																																										.equals(tValue)) {
																																									if (!mArray
																																											.equals(mValue)) {
																																										if (!mArray
																																												.equals(mType)) {
																																											if (!mArray
																																													.equals(mOwner)) {
																																												if (!mArray
																																														.equals(mValueToTValue)) {
																																													if (!mArray
																																															.equals(tAnnotationValue)) {
																																														if (!mValue
																																																.equals(tType)) {
																																															if (!mValue
																																																	.equals(tValue)) {
																																																if (!mValue
																																																		.equals(mValueToTValue)) {
																																																	if (!mValue
																																																			.equals(tAnnotationValue)) {
																																																		if (!mType
																																																				.equals(mTypeToTType)) {
																																																			if (!mType
																																																					.equals(tType)) {
																																																				if (!mType
																																																						.equals(tValue)) {
																																																					if (!mType
																																																							.equals(mValue)) {
																																																						if (!mType
																																																								.equals(mValueToTValue)) {
																																																							if (!mType
																																																									.equals(tAnnotationValue)) {
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
																																																															.equals(mArray)) {
																																																														if (!annotationMemberValuePairToTAnnotationValue
																																																																.equals(tValue)) {
																																																															if (!annotationMemberValuePairToTAnnotationValue
																																																																	.equals(mValue)) {
																																																																if (!annotationMemberValuePairToTAnnotationValue
																																																																		.equals(mType)) {
																																																																	if (!annotationMemberValuePairToTAnnotationValue
																																																																			.equals(mOwner)) {
																																																																		if (!annotationMemberValuePairToTAnnotationValue
																																																																				.equals(mValueToTValue)) {
																																																																			if (!annotationMemberValuePairToTAnnotationValue
																																																																					.equals(tAnnotationValue)) {
																																																																				if (!mOwner
																																																																						.equals(mTypeToTType)) {
																																																																					if (!mOwner
																																																																							.equals(tType)) {
																																																																						if (!mOwner
																																																																								.equals(tValue)) {
																																																																							if (!mOwner
																																																																									.equals(mValue)) {
																																																																								if (!mOwner
																																																																										.equals(mType)) {
																																																																									if (!mOwner
																																																																											.equals(mValueToTValue)) {
																																																																										if (!mOwner
																																																																												.equals(tAnnotationValue)) {
																																																																											if (!mValueToTValue
																																																																													.equals(tType)) {
																																																																												if (!mValueToTValue
																																																																														.equals(tValue)) {
																																																																													if (!mValueToTValue
																																																																															.equals(tAnnotationValue)) {
																																																																														if (!tAnnotationValue
																																																																																.equals(tType)) {
																																																																															if (!tAnnotationValue
																																																																																	.equals(tValue)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		annotation,
																																																																																		mAccess,
																																																																																		mAnnotationValue,
																																																																																		mTypeToTType,
																																																																																		tType,
																																																																																		mArray,
																																																																																		tValue,
																																																																																		mValue,
																																																																																		mType,
																																																																																		annotationMemberValuePairToTAnnotationValue,
																																																																																		mOwner,
																																																																																		mValueToTValue,
																																																																																		tAnnotationValue };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationMemberValueClassArray_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mAccess, EObject mAnnotationValue, EObject tType, EObject mArray,
			EObject tValue, EObject mValue, EObject mType, EObject mValueToTValue, EObject tAnnotationValue) {
		EMoflonEdge mValue__mAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mValueToTValue__mValue____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tValue__tType____tClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mArray__mValue____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mValueToTValue__tValue____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationValue__tValue____tValue = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationValue__mArray____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationMemberValueClassArray";
		String mValue__mAccess____type_name_prime = "type";
		String mAccess__mType____type_name_prime = "type";
		String mType__mAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mValueToTValue__mValue____source_name_prime = "source";
		String tValue__tType____tClass_name_prime = "tClass";
		String mArray__mValue____expressions_name_prime = "expressions";
		String mValueToTValue__tValue____target_name_prime = "target";
		String tAnnotationValue__tValue____tValue_name_prime = "tValue";
		String mAnnotationValue__mArray____value_name_prime = "value";
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
		mArray__mValue____expressions.setSrc(mArray);
		mArray__mValue____expressions.setTrg(mValue);
		ruleresult.getTranslatedEdges().add(mArray__mValue____expressions);
		mValueToTValue__tValue____target.setSrc(mValueToTValue);
		mValueToTValue__tValue____target.setTrg(tValue);
		ruleresult.getCreatedEdges().add(mValueToTValue__tValue____target);
		tAnnotationValue__tValue____tValue.setSrc(tAnnotationValue);
		tAnnotationValue__tValue____tValue.setTrg(tValue);
		ruleresult.getCreatedEdges().add(tAnnotationValue__tValue____tValue);
		mAnnotationValue__mArray____value.setSrc(mAnnotationValue);
		mAnnotationValue__mArray____value.setTrg(mArray);
		ruleresult.getTranslatedEdges().add(mAnnotationValue__mArray____value);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mValue__mAccess____type.setName(mValue__mAccess____type_name_prime);
		mAccess__mType____type.setName(mAccess__mType____type_name_prime);
		mType__mAccess____usagesInTypeAccess.setName(mType__mAccess____usagesInTypeAccess_name_prime);
		mValueToTValue__mValue____source.setName(mValueToTValue__mValue____source_name_prime);
		tValue__tType____tClass.setName(tValue__tType____tClass_name_prime);
		mArray__mValue____expressions.setName(mArray__mValue____expressions_name_prime);
		mValueToTValue__tValue____target.setName(mValueToTValue__tValue____target_name_prime);
		tAnnotationValue__tValue____tValue.setName(tAnnotationValue__tValue____tValue_name_prime);
		mAnnotationValue__mArray____value.setName(mAnnotationValue__mArray____value_name_prime);
		return new Object[] { ruleresult, mAccess, mAnnotationValue, tType, mArray, tValue, mValue, mType,
				mValueToTValue, tAnnotationValue, mValue__mAccess____type, mAccess__mType____type,
				mType__mAccess____usagesInTypeAccess, mValueToTValue__mValue____source, tValue__tType____tClass,
				mArray__mValue____expressions, mValueToTValue__tValue____target, tAnnotationValue__tValue____tValue,
				mAnnotationValue__mArray____value };
	}

	public static final void pattern_AnnotationMemberValueClassArray_1_5_registerobjects_expressionBBBBBBBBBBBBBBB(
			AnnotationMemberValueClassArray _this, PerformRuleResult ruleresult, EObject annotation, EObject mAccess,
			EObject mAnnotationValue, EObject mTypeToTType, EObject tType, EObject mArray, EObject tValue,
			EObject mValue, EObject mType, EObject annotationMemberValuePairToTAnnotationValue, EObject mOwner,
			EObject mValueToTValue, EObject tAnnotationValue) {
		_this.registerObjects_FWD(ruleresult, annotation, mAccess, mAnnotationValue, mTypeToTType, tType, mArray,
				tValue, mValue, mType, annotationMemberValuePairToTAnnotationValue, mOwner, mValueToTValue,
				tAnnotationValue);

	}

	public static final PerformRuleResult pattern_AnnotationMemberValueClassArray_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_2_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueClassArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationMemberValueClassArray _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationMemberValueClassArray _this) {
		Object[] result_pattern_AnnotationMemberValueClassArray_2_1_preparereturnvalue_binding = pattern_AnnotationMemberValueClassArray_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueClassArray_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationMemberValueClassArray_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueClassArray_2_1_preparereturnvalue_black = pattern_AnnotationMemberValueClassArray_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationMemberValueClassArray_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationMemberValueClassArray_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationMemberValueClassArray";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_2_2_corematch_bindingFFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("annotation");
		EObject _localVariable_1 = match.getObject("mAccess");
		EObject _localVariable_2 = match.getObject("mAnnotationValue");
		EObject _localVariable_3 = match.getObject("mArray");
		EObject _localVariable_4 = match.getObject("mValue");
		EObject _localVariable_5 = match.getObject("mType");
		EObject _localVariable_6 = match.getObject("mOwner");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpMAccess = _localVariable_1;
		EObject tmpMAnnotationValue = _localVariable_2;
		EObject tmpMArray = _localVariable_3;
		EObject tmpMValue = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpMOwner = _localVariable_6;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpMAccess instanceof TypeAccess) {
				TypeAccess mAccess = (TypeAccess) tmpMAccess;
				if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
					AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
					if (tmpMArray instanceof ArrayInitializer) {
						ArrayInitializer mArray = (ArrayInitializer) tmpMArray;
						if (tmpMValue instanceof TypeLiteral) {
							TypeLiteral mValue = (TypeLiteral) tmpMValue;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								if (tmpMOwner instanceof BodyDeclaration) {
									BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
									return new Object[] { annotation, mAccess, mAnnotationValue, mArray, mValue, mType,
											mOwner, match };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueClassArray_2_2_corematch_blackBBBFFBBBFBFB(
			Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue,
			ArrayInitializer mArray, TypeLiteral mValue, Type mType, BodyDeclaration mOwner, Match match) {
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
						_result.add(new Object[] { annotation, mAccess, mAnnotationValue, mTypeToTType, tType, mArray,
								mValue, mType, annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue,
								match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueClassArray_2_3_findcontext_blackBBBBBBBBBBB(
			Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, ArrayInitializer mArray, TypeLiteral mValue,
			Type mType, AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mAccess.equals(mValue.getType())) {
			if (mType.equals(mAccess.getType())) {
				if (tAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getTarget())) {
					if (annotation.getValues().contains(mAnnotationValue)) {
						if (mAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getSource())) {
							if (mOwner.getAnnotations().contains(annotation)) {
								if (tType.equals(mTypeToTType.getTarget())) {
									if (mArray.getExpressions().contains(mValue)) {
										if (mType.equals(mTypeToTType.getSource())) {
											if (mArray.equals(mAnnotationValue.getValue())) {
												_result.add(new Object[] { annotation, mAccess, mAnnotationValue,
														mTypeToTType, tType, mArray, mValue, mType,
														annotationMemberValuePairToTAnnotationValue, mOwner,
														tAnnotationValue });
											}
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

	public static final Object[] pattern_AnnotationMemberValueClassArray_2_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFFF(
			Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, ArrayInitializer mArray, TypeLiteral mValue,
			Type mType, AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue) {
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
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mArray__mValue____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationValue__mArray____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mValue__mAccess____type_name_prime = "type";
		String mAccess__mType____type_name_prime = "type";
		String mType__mAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime = "target";
		String annotation__mAnnotationValue____values_name_prime = "values";
		String annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source_name_prime = "source";
		String mOwner__annotation____annotations_name_prime = "annotations";
		String mTypeToTType__tType____target_name_prime = "target";
		String mArray__mValue____expressions_name_prime = "expressions";
		String mTypeToTType__mType____source_name_prime = "source";
		String mAnnotationValue__mArray____value_name_prime = "value";
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(mAccess);
		isApplicableMatch.getAllContextElements().add(mAnnotationValue);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mArray);
		isApplicableMatch.getAllContextElements().add(mValue);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(annotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.getAllContextElements().add(mOwner);
		isApplicableMatch.getAllContextElements().add(tAnnotationValue);
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
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mArray__mValue____expressions.setSrc(mArray);
		mArray__mValue____expressions.setTrg(mValue);
		isApplicableMatch.getAllContextElements().add(mArray__mValue____expressions);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mAnnotationValue__mArray____value.setSrc(mAnnotationValue);
		mAnnotationValue__mArray____value.setTrg(mArray);
		isApplicableMatch.getAllContextElements().add(mAnnotationValue__mArray____value);
		mValue__mAccess____type.setName(mValue__mAccess____type_name_prime);
		mAccess__mType____type.setName(mAccess__mType____type_name_prime);
		mType__mAccess____usagesInTypeAccess.setName(mType__mAccess____usagesInTypeAccess_name_prime);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setName(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime);
		annotation__mAnnotationValue____values.setName(annotation__mAnnotationValue____values_name_prime);
		annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source
				.setName(annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source_name_prime);
		mOwner__annotation____annotations.setName(mOwner__annotation____annotations_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mArray__mValue____expressions.setName(mArray__mValue____expressions_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mAnnotationValue__mArray____value.setName(mAnnotationValue__mArray____value_name_prime);
		return new Object[] { annotation, mAccess, mAnnotationValue, mTypeToTType, tType, mArray, mValue, mType,
				annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, isApplicableMatch,
				mValue__mAccess____type, mAccess__mType____type, mType__mAccess____usagesInTypeAccess,
				annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target,
				annotation__mAnnotationValue____values,
				annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source,
				mOwner__annotation____annotations, mTypeToTType__tType____target, mArray__mValue____expressions,
				mTypeToTType__mType____source, mAnnotationValue__mArray____value };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_2_4_solveCSP_bindingFBBBBBBBBBBBBB(
			AnnotationMemberValueClassArray _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, ArrayInitializer mArray, TypeLiteral mValue, Type mType,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, annotation, mAccess, mAnnotationValue,
				mTypeToTType, tType, mArray, mValue, mType, annotationMemberValuePairToTAnnotationValue, mOwner,
				tAnnotationValue);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotation, mAccess, mAnnotationValue, mTypeToTType,
					tType, mArray, mValue, mType, annotationMemberValuePairToTAnnotationValue, mOwner,
					tAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(
			AnnotationMemberValueClassArray _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, ArrayInitializer mArray, TypeLiteral mValue, Type mType,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue) {
		Object[] result_pattern_AnnotationMemberValueClassArray_2_4_solveCSP_binding = pattern_AnnotationMemberValueClassArray_2_4_solveCSP_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, annotation, mAccess, mAnnotationValue, mTypeToTType, tType, mArray, mValue,
				mType, annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue);
		if (result_pattern_AnnotationMemberValueClassArray_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueClassArray_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueClassArray_2_4_solveCSP_black = pattern_AnnotationMemberValueClassArray_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueClassArray_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotation, mAccess, mAnnotationValue,
						mTypeToTType, tType, mArray, mValue, mType, annotationMemberValuePairToTAnnotationValue, mOwner,
						tAnnotationValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueClassArray_2_5_checkCSP_expressionFBB(
			AnnotationMemberValueClassArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationMemberValueClassArray";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberValueClassArray_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_10_1_initialbindings_blackBBBBB(
			AnnotationMemberValueClassArray _this, Match match, TAbstractType tType, TClassNode tValue,
			TAnnotationValue tAnnotationValue) {
		return new Object[] { _this, match, tType, tValue, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_10_2_SolveCSP_bindingFBBBBB(
			AnnotationMemberValueClassArray _this, Match match, TAbstractType tType, TClassNode tValue,
			TAnnotationValue tAnnotationValue) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tType, tValue, tAnnotationValue);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tType, tValue, tAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_10_2_SolveCSP_bindingAndBlackFBBBBB(
			AnnotationMemberValueClassArray _this, Match match, TAbstractType tType, TClassNode tValue,
			TAnnotationValue tAnnotationValue) {
		Object[] result_pattern_AnnotationMemberValueClassArray_10_2_SolveCSP_binding = pattern_AnnotationMemberValueClassArray_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tType, tValue, tAnnotationValue);
		if (result_pattern_AnnotationMemberValueClassArray_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueClassArray_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueClassArray_10_2_SolveCSP_black = pattern_AnnotationMemberValueClassArray_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueClassArray_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tType, tValue, tAnnotationValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueClassArray_10_3_CheckCSP_expressionFBB(
			AnnotationMemberValueClassArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TAbstractType tType, TClassNode tValue, TAnnotationValue tAnnotationValue) {
		return new Object[] { match, tType, tValue, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_10_4_collectelementstobetranslated_greenBBBBFF(
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

	public static final Object[] pattern_AnnotationMemberValueClassArray_10_5_collectcontextelements_blackBBBB(
			Match match, TAbstractType tType, TClassNode tValue, TAnnotationValue tAnnotationValue) {
		return new Object[] { match, tType, tValue, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_10_5_collectcontextelements_greenBBB(
			Match match, TAbstractType tType, TAnnotationValue tAnnotationValue) {
		match.getContextNodes().add(tType);
		match.getContextNodes().add(tAnnotationValue);
		return new Object[] { match, tType, tAnnotationValue };
	}

	public static final void pattern_AnnotationMemberValueClassArray_10_6_registerobjectstomatch_expressionBBBBB(
			AnnotationMemberValueClassArray _this, Match match, TAbstractType tType, TClassNode tValue,
			TAnnotationValue tAnnotationValue) {
		_this.registerObjectsToMatch_BWD(match, tType, tValue, tAnnotationValue);

	}

	public static final boolean pattern_AnnotationMemberValueClassArray_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueClassArray_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_11_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("annotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("mAnnotationValue");
		EObject _localVariable_2 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_3 = isApplicableMatch.getObject("tType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tValue");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject _localVariable_6 = isApplicableMatch.getObject("AnnotationMemberValuePairToTAnnotationValue");
		EObject _localVariable_7 = isApplicableMatch.getObject("mOwner");
		EObject _localVariable_8 = isApplicableMatch.getObject("tAnnotationValue");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpMAnnotationValue = _localVariable_1;
		EObject tmpMTypeToTType = _localVariable_2;
		EObject tmpTType = _localVariable_3;
		EObject tmpTValue = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpAnnotationMemberValuePairToTAnnotationValue = _localVariable_6;
		EObject tmpMOwner = _localVariable_7;
		EObject tmpTAnnotationValue = _localVariable_8;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
				AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
				if (tmpMTypeToTType instanceof TypeToTAbstractType) {
					TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
					if (tmpTType instanceof TAbstractType) {
						TAbstractType tType = (TAbstractType) tmpTType;
						if (tmpTValue instanceof TClassNode) {
							TClassNode tValue = (TClassNode) tmpTValue;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								if (tmpAnnotationMemberValuePairToTAnnotationValue instanceof AnnotationMemberValuePairToTAnnotationValue) {
									AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) tmpAnnotationMemberValuePairToTAnnotationValue;
									if (tmpMOwner instanceof BodyDeclaration) {
										BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
										if (tmpTAnnotationValue instanceof TAnnotationValue) {
											TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
											return new Object[] { annotation, mAnnotationValue, mTypeToTType, tType,
													tValue, mType, annotationMemberValuePairToTAnnotationValue, mOwner,
													tAnnotationValue, isApplicableMatch };
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

	public static final Object[] pattern_AnnotationMemberValueClassArray_11_1_performtransformation_blackBBBBBBBBBFBB(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, TClassNode tValue, Type mType,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue, AnnotationMemberValueClassArray _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { annotation, mAnnotationValue, mTypeToTType, tType, tValue, mType,
						annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			AnnotationMemberValueClassArray _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationMemberValueClassArray_11_1_performtransformation_binding = pattern_AnnotationMemberValueClassArray_11_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationMemberValueClassArray_11_1_performtransformation_binding != null) {
			Annotation annotation = (Annotation) result_pattern_AnnotationMemberValueClassArray_11_1_performtransformation_binding[0];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberValueClassArray_11_1_performtransformation_binding[1];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_AnnotationMemberValueClassArray_11_1_performtransformation_binding[2];
			TAbstractType tType = (TAbstractType) result_pattern_AnnotationMemberValueClassArray_11_1_performtransformation_binding[3];
			TClassNode tValue = (TClassNode) result_pattern_AnnotationMemberValueClassArray_11_1_performtransformation_binding[4];
			Type mType = (Type) result_pattern_AnnotationMemberValueClassArray_11_1_performtransformation_binding[5];
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result_pattern_AnnotationMemberValueClassArray_11_1_performtransformation_binding[6];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberValueClassArray_11_1_performtransformation_binding[7];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberValueClassArray_11_1_performtransformation_binding[8];

			Object[] result_pattern_AnnotationMemberValueClassArray_11_1_performtransformation_black = pattern_AnnotationMemberValueClassArray_11_1_performtransformation_blackBBBBBBBBBFBB(
					annotation, mAnnotationValue, mTypeToTType, tType, tValue, mType,
					annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, _this, isApplicableMatch);
			if (result_pattern_AnnotationMemberValueClassArray_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationMemberValueClassArray_11_1_performtransformation_black[9];

				return new Object[] { annotation, mAnnotationValue, mTypeToTType, tType, tValue, mType,
						annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_11_1_performtransformation_greenFBFBFBF(
			AnnotationMemberValuePair mAnnotationValue, TClassNode tValue, Type mType) {
		TypeAccess mAccess = JavaFactory.eINSTANCE.createTypeAccess();
		ArrayInitializer mArray = JavaFactory.eINSTANCE.createArrayInitializer();
		TypeLiteral mValue = JavaFactory.eINSTANCE.createTypeLiteral();
		LiteralToTNode mValueToTValue = PmFactory.eINSTANCE.createLiteralToTNode();
		mAccess.setType(mType);
		mAnnotationValue.setValue(mArray);
		mValue.setType(mAccess);
		mArray.getExpressions().add(mValue);
		mValueToTValue.setSource(mValue);
		mValueToTValue.setTarget(tValue);
		return new Object[] { mAccess, mAnnotationValue, mArray, tValue, mValue, mType, mValueToTValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_11_2_collecttranslatedelements_blackBBBBB(
			TypeAccess mAccess, ArrayInitializer mArray, TClassNode tValue, TypeLiteral mValue,
			LiteralToTNode mValueToTValue) {
		return new Object[] { mAccess, mArray, tValue, mValue, mValueToTValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_11_2_collecttranslatedelements_greenFBBBBB(
			TypeAccess mAccess, ArrayInitializer mArray, TClassNode tValue, TypeLiteral mValue,
			LiteralToTNode mValueToTValue) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mAccess);
		ruleresult.getCreatedElements().add(mArray);
		ruleresult.getTranslatedElements().add(tValue);
		ruleresult.getCreatedElements().add(mValue);
		ruleresult.getCreatedLinkElements().add(mValueToTValue);
		return new Object[] { ruleresult, mAccess, mArray, tValue, mValue, mValueToTValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject annotation, EObject mAccess, EObject mAnnotationValue,
			EObject mTypeToTType, EObject tType, EObject mArray, EObject tValue, EObject mValue, EObject mType,
			EObject annotationMemberValuePairToTAnnotationValue, EObject mOwner, EObject mValueToTValue,
			EObject tAnnotationValue) {
		if (!annotation.equals(mAccess)) {
			if (!annotation.equals(mAnnotationValue)) {
				if (!annotation.equals(mTypeToTType)) {
					if (!annotation.equals(tType)) {
						if (!annotation.equals(mArray)) {
							if (!annotation.equals(tValue)) {
								if (!annotation.equals(mValue)) {
									if (!annotation.equals(mType)) {
										if (!annotation.equals(mOwner)) {
											if (!annotation.equals(mValueToTValue)) {
												if (!annotation.equals(tAnnotationValue)) {
													if (!mAccess.equals(mAnnotationValue)) {
														if (!mAccess.equals(mTypeToTType)) {
															if (!mAccess.equals(tType)) {
																if (!mAccess.equals(mArray)) {
																	if (!mAccess.equals(tValue)) {
																		if (!mAccess.equals(mValue)) {
																			if (!mAccess.equals(mType)) {
																				if (!mAccess.equals(mOwner)) {
																					if (!mAccess
																							.equals(mValueToTValue)) {
																						if (!mAccess.equals(
																								tAnnotationValue)) {
																							if (!mAnnotationValue
																									.equals(mTypeToTType)) {
																								if (!mAnnotationValue
																										.equals(tType)) {
																									if (!mAnnotationValue
																											.equals(mArray)) {
																										if (!mAnnotationValue
																												.equals(tValue)) {
																											if (!mAnnotationValue
																													.equals(mValue)) {
																												if (!mAnnotationValue
																														.equals(mType)) {
																													if (!mAnnotationValue
																															.equals(mOwner)) {
																														if (!mAnnotationValue
																																.equals(mValueToTValue)) {
																															if (!mAnnotationValue
																																	.equals(tAnnotationValue)) {
																																if (!mTypeToTType
																																		.equals(tType)) {
																																	if (!mTypeToTType
																																			.equals(tValue)) {
																																		if (!mTypeToTType
																																				.equals(mValue)) {
																																			if (!mTypeToTType
																																					.equals(mValueToTValue)) {
																																				if (!mTypeToTType
																																						.equals(tAnnotationValue)) {
																																					if (!tType
																																							.equals(tValue)) {
																																						if (!mArray
																																								.equals(mTypeToTType)) {
																																							if (!mArray
																																									.equals(tType)) {
																																								if (!mArray
																																										.equals(tValue)) {
																																									if (!mArray
																																											.equals(mValue)) {
																																										if (!mArray
																																												.equals(mType)) {
																																											if (!mArray
																																													.equals(mOwner)) {
																																												if (!mArray
																																														.equals(mValueToTValue)) {
																																													if (!mArray
																																															.equals(tAnnotationValue)) {
																																														if (!mValue
																																																.equals(tType)) {
																																															if (!mValue
																																																	.equals(tValue)) {
																																																if (!mValue
																																																		.equals(mValueToTValue)) {
																																																	if (!mValue
																																																			.equals(tAnnotationValue)) {
																																																		if (!mType
																																																				.equals(mTypeToTType)) {
																																																			if (!mType
																																																					.equals(tType)) {
																																																				if (!mType
																																																						.equals(tValue)) {
																																																					if (!mType
																																																							.equals(mValue)) {
																																																						if (!mType
																																																								.equals(mValueToTValue)) {
																																																							if (!mType
																																																									.equals(tAnnotationValue)) {
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
																																																															.equals(mArray)) {
																																																														if (!annotationMemberValuePairToTAnnotationValue
																																																																.equals(tValue)) {
																																																															if (!annotationMemberValuePairToTAnnotationValue
																																																																	.equals(mValue)) {
																																																																if (!annotationMemberValuePairToTAnnotationValue
																																																																		.equals(mType)) {
																																																																	if (!annotationMemberValuePairToTAnnotationValue
																																																																			.equals(mOwner)) {
																																																																		if (!annotationMemberValuePairToTAnnotationValue
																																																																				.equals(mValueToTValue)) {
																																																																			if (!annotationMemberValuePairToTAnnotationValue
																																																																					.equals(tAnnotationValue)) {
																																																																				if (!mOwner
																																																																						.equals(mTypeToTType)) {
																																																																					if (!mOwner
																																																																							.equals(tType)) {
																																																																						if (!mOwner
																																																																								.equals(tValue)) {
																																																																							if (!mOwner
																																																																									.equals(mValue)) {
																																																																								if (!mOwner
																																																																										.equals(mType)) {
																																																																									if (!mOwner
																																																																											.equals(mValueToTValue)) {
																																																																										if (!mOwner
																																																																												.equals(tAnnotationValue)) {
																																																																											if (!mValueToTValue
																																																																													.equals(tType)) {
																																																																												if (!mValueToTValue
																																																																														.equals(tValue)) {
																																																																													if (!mValueToTValue
																																																																															.equals(tAnnotationValue)) {
																																																																														if (!tAnnotationValue
																																																																																.equals(tType)) {
																																																																															if (!tAnnotationValue
																																																																																	.equals(tValue)) {
																																																																																return new Object[] {
																																																																																		ruleresult,
																																																																																		annotation,
																																																																																		mAccess,
																																																																																		mAnnotationValue,
																																																																																		mTypeToTType,
																																																																																		tType,
																																																																																		mArray,
																																																																																		tValue,
																																																																																		mValue,
																																																																																		mType,
																																																																																		annotationMemberValuePairToTAnnotationValue,
																																																																																		mOwner,
																																																																																		mValueToTValue,
																																																																																		tAnnotationValue };
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationMemberValueClassArray_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mAccess, EObject mAnnotationValue, EObject tType, EObject mArray,
			EObject tValue, EObject mValue, EObject mType, EObject mValueToTValue, EObject tAnnotationValue) {
		EMoflonEdge mValue__mAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAccess__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mValueToTValue__mValue____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tValue__tType____tClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mArray__mValue____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mValueToTValue__tValue____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationValue__tValue____tValue = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationValue__mArray____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationMemberValueClassArray";
		String mValue__mAccess____type_name_prime = "type";
		String mAccess__mType____type_name_prime = "type";
		String mType__mAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mValueToTValue__mValue____source_name_prime = "source";
		String tValue__tType____tClass_name_prime = "tClass";
		String mArray__mValue____expressions_name_prime = "expressions";
		String mValueToTValue__tValue____target_name_prime = "target";
		String tAnnotationValue__tValue____tValue_name_prime = "tValue";
		String mAnnotationValue__mArray____value_name_prime = "value";
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
		mArray__mValue____expressions.setSrc(mArray);
		mArray__mValue____expressions.setTrg(mValue);
		ruleresult.getCreatedEdges().add(mArray__mValue____expressions);
		mValueToTValue__tValue____target.setSrc(mValueToTValue);
		mValueToTValue__tValue____target.setTrg(tValue);
		ruleresult.getCreatedEdges().add(mValueToTValue__tValue____target);
		tAnnotationValue__tValue____tValue.setSrc(tAnnotationValue);
		tAnnotationValue__tValue____tValue.setTrg(tValue);
		ruleresult.getTranslatedEdges().add(tAnnotationValue__tValue____tValue);
		mAnnotationValue__mArray____value.setSrc(mAnnotationValue);
		mAnnotationValue__mArray____value.setTrg(mArray);
		ruleresult.getCreatedEdges().add(mAnnotationValue__mArray____value);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mValue__mAccess____type.setName(mValue__mAccess____type_name_prime);
		mAccess__mType____type.setName(mAccess__mType____type_name_prime);
		mType__mAccess____usagesInTypeAccess.setName(mType__mAccess____usagesInTypeAccess_name_prime);
		mValueToTValue__mValue____source.setName(mValueToTValue__mValue____source_name_prime);
		tValue__tType____tClass.setName(tValue__tType____tClass_name_prime);
		mArray__mValue____expressions.setName(mArray__mValue____expressions_name_prime);
		mValueToTValue__tValue____target.setName(mValueToTValue__tValue____target_name_prime);
		tAnnotationValue__tValue____tValue.setName(tAnnotationValue__tValue____tValue_name_prime);
		mAnnotationValue__mArray____value.setName(mAnnotationValue__mArray____value_name_prime);
		return new Object[] { ruleresult, mAccess, mAnnotationValue, tType, mArray, tValue, mValue, mType,
				mValueToTValue, tAnnotationValue, mValue__mAccess____type, mAccess__mType____type,
				mType__mAccess____usagesInTypeAccess, mValueToTValue__mValue____source, tValue__tType____tClass,
				mArray__mValue____expressions, mValueToTValue__tValue____target, tAnnotationValue__tValue____tValue,
				mAnnotationValue__mArray____value };
	}

	public static final void pattern_AnnotationMemberValueClassArray_11_5_registerobjects_expressionBBBBBBBBBBBBBBB(
			AnnotationMemberValueClassArray _this, PerformRuleResult ruleresult, EObject annotation, EObject mAccess,
			EObject mAnnotationValue, EObject mTypeToTType, EObject tType, EObject mArray, EObject tValue,
			EObject mValue, EObject mType, EObject annotationMemberValuePairToTAnnotationValue, EObject mOwner,
			EObject mValueToTValue, EObject tAnnotationValue) {
		_this.registerObjects_BWD(ruleresult, annotation, mAccess, mAnnotationValue, mTypeToTType, tType, mArray,
				tValue, mValue, mType, annotationMemberValuePairToTAnnotationValue, mOwner, mValueToTValue,
				tAnnotationValue);

	}

	public static final PerformRuleResult pattern_AnnotationMemberValueClassArray_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_12_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueClassArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationMemberValueClassArray _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationMemberValueClassArray _this) {
		Object[] result_pattern_AnnotationMemberValueClassArray_12_1_preparereturnvalue_binding = pattern_AnnotationMemberValueClassArray_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueClassArray_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationMemberValueClassArray_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueClassArray_12_1_preparereturnvalue_black = pattern_AnnotationMemberValueClassArray_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationMemberValueClassArray_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationMemberValueClassArray_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationMemberValueClassArray";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_12_2_corematch_bindingFFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_AnnotationMemberValueClassArray_12_2_corematch_blackFFBBFFBB(
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
						_result.add(new Object[] { mAnnotationValue, mTypeToTType, tType, tValue, mType,
								annotationMemberValuePairToTAnnotationValue, tAnnotationValue, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueClassArray_12_3_findcontext_blackFBBBBBBFB(
			AnnotationMemberValuePair mAnnotationValue, TypeToTAbstractType mTypeToTType, TAbstractType tType,
			TClassNode tValue, Type mType,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			TAnnotationValue tAnnotationValue) {
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
										_result.add(new Object[] { annotation, mAnnotationValue, mTypeToTType, tType,
												tValue, mType, annotationMemberValuePairToTAnnotationValue, mOwner,
												tAnnotationValue });
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

	public static final Object[] pattern_AnnotationMemberValueClassArray_12_3_findcontext_greenBBBBBBBBBFFFFFFFFF(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, TClassNode tValue, Type mType,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue) {
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
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(tValue);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(annotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.getAllContextElements().add(mOwner);
		isApplicableMatch.getAllContextElements().add(tAnnotationValue);
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
		return new Object[] { annotation, mAnnotationValue, mTypeToTType, tType, tValue, mType,
				annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, isApplicableMatch,
				annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target, tValue__tType____tClass,
				annotation__mAnnotationValue____values,
				annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source,
				mOwner__annotation____annotations, mTypeToTType__tType____target, mTypeToTType__mType____source,
				tAnnotationValue__tValue____tValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_12_4_solveCSP_bindingFBBBBBBBBBBB(
			AnnotationMemberValueClassArray _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, TypeToTAbstractType mTypeToTType, TAbstractType tType,
			TClassNode tValue, Type mType,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, annotation, mAnnotationValue,
				mTypeToTType, tType, tValue, mType, annotationMemberValuePairToTAnnotationValue, mOwner,
				tAnnotationValue);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotation, mAnnotationValue, mTypeToTType, tType,
					tValue, mType, annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			AnnotationMemberValueClassArray _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, TypeToTAbstractType mTypeToTType, TAbstractType tType,
			TClassNode tValue, Type mType,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue) {
		Object[] result_pattern_AnnotationMemberValueClassArray_12_4_solveCSP_binding = pattern_AnnotationMemberValueClassArray_12_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, annotation, mAnnotationValue, mTypeToTType, tType, tValue, mType,
				annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue);
		if (result_pattern_AnnotationMemberValueClassArray_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueClassArray_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueClassArray_12_4_solveCSP_black = pattern_AnnotationMemberValueClassArray_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueClassArray_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotation, mAnnotationValue, mTypeToTType, tType,
						tValue, mType, annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueClassArray_12_5_checkCSP_expressionFBB(
			AnnotationMemberValueClassArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationMemberValueClassArray";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberValueClassArray_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_20_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueClassArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, AnnotationMemberValueClassArray _this) {
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

	public static final Object[] pattern_AnnotationMemberValueClassArray_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationMemberValueClassArray _this) {
		Object[] result_pattern_AnnotationMemberValueClassArray_20_1_preparereturnvalue_binding = pattern_AnnotationMemberValueClassArray_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueClassArray_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationMemberValueClassArray_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueClassArray_20_1_preparereturnvalue_black = pattern_AnnotationMemberValueClassArray_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationMemberValueClassArray_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationMemberValueClassArray_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationMemberValueClassArray_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueClassArray_20_2_testcorematchandDECs_blackFFFB(
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

	public static final Object[] pattern_AnnotationMemberValueClassArray_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationMemberValueClassArray_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			AnnotationMemberValueClassArray _this, Match match, TAbstractType tType, TClassNode tValue,
			TAnnotationValue tAnnotationValue) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tType, tValue, tAnnotationValue);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueClassArray_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationMemberValueClassArray _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationMemberValueClassArray_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueClassArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, AnnotationMemberValueClassArray _this) {
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

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationMemberValueClassArray _this) {
		Object[] result_pattern_AnnotationMemberValueClassArray_21_1_preparereturnvalue_binding = pattern_AnnotationMemberValueClassArray_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueClassArray_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationMemberValueClassArray_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueClassArray_21_1_preparereturnvalue_black = pattern_AnnotationMemberValueClassArray_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationMemberValueClassArray_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationMemberValueClassArray_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationMemberValueClassArray_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_0BBB(
			TypeAccess mAccess, Type mType, BodyDeclaration mOwner) {
		for (AbstractTypeDeclaration __DEC_mAccess_superInterfaces_445529 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mType.equals(__DEC_mAccess_superInterfaces_445529)) {
				if (!mOwner.equals(__DEC_mAccess_superInterfaces_445529)) {
					return new Object[] { mAccess, mType, mOwner };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_1BB(
			TypeAccess mAccess, Annotation annotation) {
		for (Annotation __DEC_mAccess_type_471355 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, Annotation.class, "type")) {
			if (!annotation.equals(__DEC_mAccess_type_471355)) {
				return new Object[] { mAccess, annotation };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_2BB(
			TypeAccess mAccess, Type mType) {
		for (ArrayType __DEC_mAccess_elementType_526875 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ArrayType.class, "elementType")) {
			if (!mType.equals(__DEC_mAccess_elementType_526875)) {
				return new Object[] { mAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess mAccess) {
		for (ClassInstanceCreation __DEC_mAccess_type_975080 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_4BBB(
			TypeAccess mAccess, Type mType, BodyDeclaration mOwner) {
		for (ClassDeclaration __DEC_mAccess_superClass_935573 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ClassDeclaration.class, "superClass")) {
			if (!mType.equals(__DEC_mAccess_superClass_935573)) {
				if (!mOwner.equals(__DEC_mAccess_superClass_935573)) {
					return new Object[] { mAccess, mType, mOwner };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_5BB(
			TypeAccess mAccess, BodyDeclaration mOwner) {
		for (MethodDeclaration __DEC_mAccess_returnType_879128 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, MethodDeclaration.class, "returnType")) {
			if (!mOwner.equals(__DEC_mAccess_returnType_879128)) {
				return new Object[] { mAccess, mOwner };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_6BB(
			TypeAccess mAccess, Type mType) {
		for (ParameterizedType __DEC_mAccess_type_568165 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ParameterizedType.class, "type")) {
			if (!mType.equals(__DEC_mAccess_type_568165)) {
				return new Object[] { mAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_7BB(
			TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue) {
		for (AnnotationMemberValuePair __DEC_mAccess_value_578752 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AnnotationMemberValuePair.class, "value")) {
			if (!mAnnotationValue.equals(__DEC_mAccess_value_578752)) {
				return new Object[] { mAccess, mAnnotationValue };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_8BB(
			TypeLiteral mValue, AnnotationMemberValuePair mAnnotationValue) {
		for (AnnotationMemberValuePair __DEC_mValue_value_631788 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mValue, AnnotationMemberValuePair.class, "value")) {
			if (!mAnnotationValue.equals(__DEC_mValue_value_631788)) {
				return new Object[] { mValue, mAnnotationValue };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_9BB(
			Annotation annotation, TypeAccess mAccess) {
		if (mAccess.equals(annotation.getType())) {
			return new Object[] { annotation, mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_10BB(
			AnnotationMemberValuePair mAnnotationValue, TypeAccess mAccess) {
		if (mAccess.equals(mAnnotationValue.getValue())) {
			return new Object[] { mAnnotationValue, mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_11BB(
			AnnotationMemberValuePair mAnnotationValue, TypeLiteral mValue) {
		if (mValue.equals(mAnnotationValue.getValue())) {
			return new Object[] { mAnnotationValue, mValue };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_blackFFFFFFFB(
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
						if (pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_3B(
								mAccess) == null) {
							if (pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_2BB(mAccess,
									mType) == null) {
								if (pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_6BB(
										mAccess, mType) == null) {
									for (ArrayInitializer mArray : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(mValue, ArrayInitializer.class, "expressions")) {
										for (AnnotationMemberValuePair mAnnotationValue : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(mArray, AnnotationMemberValuePair.class,
														"value")) {
											if (pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_7BB(
													mAccess, mAnnotationValue) == null) {
												if (pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_8BB(
														mValue, mAnnotationValue) == null) {
													if (pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_10BB(
															mAnnotationValue, mAccess) == null) {
														if (pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_11BB(
																mAnnotationValue, mValue) == null) {
															for (Annotation annotation : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(mAnnotationValue,
																			Annotation.class, "values")) {
																if (pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_1BB(
																		mAccess, annotation) == null) {
																	if (pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_9BB(
																			annotation, mAccess) == null) {
																		for (BodyDeclaration mOwner : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(annotation,
																						BodyDeclaration.class,
																						"annotations")) {
																			if (pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_0BBB(
																					mAccess, mType, mOwner) == null) {
																				if (pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_4BBB(
																						mAccess, mType,
																						mOwner) == null) {
																					if (pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_black_nac_5BB(
																							mAccess, mOwner) == null) {
																						_result.add(new Object[] {
																								annotation, mAccess,
																								mAnnotationValue,
																								mArray, mValue, mType,
																								mOwner, _edge_type });
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationMemberValueClassArray_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBB(
			AnnotationMemberValueClassArray _this, Match match, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TypeLiteral mValue, Type mType,
			BodyDeclaration mOwner) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, annotation, mAccess, mAnnotationValue, mArray, mValue,
				mType, mOwner);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueClassArray_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationMemberValueClassArray _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationMemberValueClassArray_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_24_1_prepare_blackB(
			AnnotationMemberValueClassArray _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("annotation");
		EObject _localVariable_1 = sourceMatch.getObject("mAccess");
		EObject _localVariable_2 = sourceMatch.getObject("mAnnotationValue");
		EObject _localVariable_3 = targetMatch.getObject("tType");
		EObject _localVariable_4 = sourceMatch.getObject("mArray");
		EObject _localVariable_5 = targetMatch.getObject("tValue");
		EObject _localVariable_6 = sourceMatch.getObject("mValue");
		EObject _localVariable_7 = sourceMatch.getObject("mType");
		EObject _localVariable_8 = sourceMatch.getObject("mOwner");
		EObject _localVariable_9 = targetMatch.getObject("tAnnotationValue");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpMAccess = _localVariable_1;
		EObject tmpMAnnotationValue = _localVariable_2;
		EObject tmpTType = _localVariable_3;
		EObject tmpMArray = _localVariable_4;
		EObject tmpTValue = _localVariable_5;
		EObject tmpMValue = _localVariable_6;
		EObject tmpMType = _localVariable_7;
		EObject tmpMOwner = _localVariable_8;
		EObject tmpTAnnotationValue = _localVariable_9;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpMAccess instanceof TypeAccess) {
				TypeAccess mAccess = (TypeAccess) tmpMAccess;
				if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
					AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
					if (tmpTType instanceof TAbstractType) {
						TAbstractType tType = (TAbstractType) tmpTType;
						if (tmpMArray instanceof ArrayInitializer) {
							ArrayInitializer mArray = (ArrayInitializer) tmpMArray;
							if (tmpTValue instanceof TClassNode) {
								TClassNode tValue = (TClassNode) tmpTValue;
								if (tmpMValue instanceof TypeLiteral) {
									TypeLiteral mValue = (TypeLiteral) tmpMValue;
									if (tmpMType instanceof Type) {
										Type mType = (Type) tmpMType;
										if (tmpMOwner instanceof BodyDeclaration) {
											BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
											if (tmpTAnnotationValue instanceof TAnnotationValue) {
												TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
												return new Object[] { annotation, mAccess, mAnnotationValue, tType,
														mArray, tValue, mValue, mType, mOwner, tAnnotationValue,
														sourceMatch, targetMatch };
											}
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

	public static final Object[] pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
			Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue, TAbstractType tType,
			ArrayInitializer mArray, TClassNode tValue, TypeLiteral mValue, Type mType, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { annotation, mAccess, mAnnotationValue, tType, mArray, tValue, mValue, mType, mOwner,
					tAnnotationValue, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_binding = pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_binding != null) {
			Annotation annotation = (Annotation) result_pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_binding[0];
			TypeAccess mAccess = (TypeAccess) result_pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_binding[1];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_binding[2];
			TAbstractType tType = (TAbstractType) result_pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_binding[3];
			ArrayInitializer mArray = (ArrayInitializer) result_pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_binding[4];
			TClassNode tValue = (TClassNode) result_pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_binding[5];
			TypeLiteral mValue = (TypeLiteral) result_pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_binding[6];
			Type mType = (Type) result_pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_binding[7];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_binding[8];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_black = pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					annotation, mAccess, mAnnotationValue, tType, mArray, tValue, mValue, mType, mOwner,
					tAnnotationValue, sourceMatch, targetMatch);
			if (result_pattern_AnnotationMemberValueClassArray_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { annotation, mAccess, mAnnotationValue, tType, mArray, tValue, mValue, mType,
						mOwner, tAnnotationValue, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
			AnnotationMemberValueClassArray _this, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, TAbstractType tType, ArrayInitializer mArray, TClassNode tValue,
			TypeLiteral mValue, Type mType, BodyDeclaration mOwner, TAnnotationValue tAnnotationValue,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(annotation, mAccess, mAnnotationValue, tType, mArray,
				tValue, mValue, mType, mOwner, tAnnotationValue, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, annotation, mAccess, mAnnotationValue, tType, mArray, tValue, mValue,
					mType, mOwner, tAnnotationValue, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			AnnotationMemberValueClassArray _this, Annotation annotation, TypeAccess mAccess,
			AnnotationMemberValuePair mAnnotationValue, TAbstractType tType, ArrayInitializer mArray, TClassNode tValue,
			TypeLiteral mValue, Type mType, BodyDeclaration mOwner, TAnnotationValue tAnnotationValue,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationMemberValueClassArray_24_3_solvecsp_binding = pattern_AnnotationMemberValueClassArray_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, annotation, mAccess, mAnnotationValue, tType, mArray, tValue, mValue, mType, mOwner,
				tAnnotationValue, sourceMatch, targetMatch);
		if (result_pattern_AnnotationMemberValueClassArray_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueClassArray_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnnotationMemberValueClassArray_24_3_solvecsp_black = pattern_AnnotationMemberValueClassArray_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueClassArray_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, annotation, mAccess, mAnnotationValue, tType, mArray, tValue, mValue,
						mType, mOwner, tAnnotationValue, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueClassArray_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueClassArray_24_5_matchcorrcontext_blackBFBBFBBB(
			AnnotationMemberValuePair mAnnotationValue, TAbstractType tType, Type mType,
			TAnnotationValue tAnnotationValue, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAnnotationValue, AnnotationMemberValuePairToTAnnotationValue.class,
							"target")) {
				if (mAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getSource())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
						if (mType.equals(mTypeToTType.getSource())) {
							_result.add(new Object[] { mAnnotationValue, mTypeToTType, tType, mType,
									annotationMemberValuePairToTAnnotationValue, tAnnotationValue, sourceMatch,
									targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToTType,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnnotationMemberValueClassArray";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.getAllContextElements().add(annotationMemberValuePairToTAnnotationValue);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTType, annotationMemberValuePairToTAnnotationValue, sourceMatch, targetMatch,
				ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_24_6_createcorrespondence_blackBBBBBBBBBBB(
			Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue, TAbstractType tType,
			ArrayInitializer mArray, TClassNode tValue, TypeLiteral mValue, Type mType, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, CCMatch ccMatch) {
		return new Object[] { annotation, mAccess, mAnnotationValue, tType, mArray, tValue, mValue, mType, mOwner,
				tAnnotationValue, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_24_6_createcorrespondence_greenBBFB(
			TClassNode tValue, TypeLiteral mValue, CCMatch ccMatch) {
		LiteralToTNode mValueToTValue = PmFactory.eINSTANCE.createLiteralToTNode();
		mValueToTValue.setSource(mValue);
		mValueToTValue.setTarget(tValue);
		ccMatch.getCreateCorr().add(mValueToTValue);
		return new Object[] { tValue, mValue, mValueToTValue, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnnotationMemberValueClassArray";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberValueClassArray_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_0BBB(
			TypeAccess mAccess, Type mType, BodyDeclaration mOwner) {
		for (AbstractTypeDeclaration __DEC_mAccess_superInterfaces_807815 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!mType.equals(__DEC_mAccess_superInterfaces_807815)) {
				if (!mOwner.equals(__DEC_mAccess_superInterfaces_807815)) {
					return new Object[] { mAccess, mType, mOwner };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_1BB(
			TypeAccess mAccess, Annotation annotation) {
		for (Annotation __DEC_mAccess_type_969283 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, Annotation.class, "type")) {
			if (!annotation.equals(__DEC_mAccess_type_969283)) {
				return new Object[] { mAccess, annotation };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_2BB(
			TypeAccess mAccess, Type mType) {
		for (ArrayType __DEC_mAccess_elementType_958847 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ArrayType.class, "elementType")) {
			if (!mType.equals(__DEC_mAccess_elementType_958847)) {
				return new Object[] { mAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_3B(
			TypeAccess mAccess) {
		for (ClassInstanceCreation __DEC_mAccess_type_233509 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_4BBB(
			TypeAccess mAccess, Type mType, BodyDeclaration mOwner) {
		for (ClassDeclaration __DEC_mAccess_superClass_759024 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ClassDeclaration.class, "superClass")) {
			if (!mType.equals(__DEC_mAccess_superClass_759024)) {
				if (!mOwner.equals(__DEC_mAccess_superClass_759024)) {
					return new Object[] { mAccess, mType, mOwner };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_5BB(
			TypeAccess mAccess, BodyDeclaration mOwner) {
		for (MethodDeclaration __DEC_mAccess_returnType_121086 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, MethodDeclaration.class, "returnType")) {
			if (!mOwner.equals(__DEC_mAccess_returnType_121086)) {
				return new Object[] { mAccess, mOwner };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_6BB(
			TypeAccess mAccess, Type mType) {
		for (ParameterizedType __DEC_mAccess_type_852615 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, ParameterizedType.class, "type")) {
			if (!mType.equals(__DEC_mAccess_type_852615)) {
				return new Object[] { mAccess, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_7BB(
			TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue) {
		for (AnnotationMemberValuePair __DEC_mAccess_value_472120 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAccess, AnnotationMemberValuePair.class, "value")) {
			if (!mAnnotationValue.equals(__DEC_mAccess_value_472120)) {
				return new Object[] { mAccess, mAnnotationValue };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_8BB(
			TypeLiteral mValue, AnnotationMemberValuePair mAnnotationValue) {
		for (AnnotationMemberValuePair __DEC_mValue_value_39805 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mValue, AnnotationMemberValuePair.class, "value")) {
			if (!mAnnotationValue.equals(__DEC_mValue_value_39805)) {
				return new Object[] { mValue, mAnnotationValue };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_9BB(
			Annotation annotation, TypeAccess mAccess) {
		if (mAccess.equals(annotation.getType())) {
			return new Object[] { annotation, mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_10BB(
			AnnotationMemberValuePair mAnnotationValue, TypeAccess mAccess) {
		if (mAccess.equals(mAnnotationValue.getValue())) {
			return new Object[] { mAnnotationValue, mAccess };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_11BB(
			AnnotationMemberValuePair mAnnotationValue, TypeLiteral mValue) {
		if (mValue.equals(mAnnotationValue.getValue())) {
			return new Object[] { mAnnotationValue, mValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_blackBBBBBBB(
			Annotation annotation, TypeAccess mAccess, AnnotationMemberValuePair mAnnotationValue,
			ArrayInitializer mArray, TypeLiteral mValue, Type mType, BodyDeclaration mOwner) {
		if (mAccess.equals(mValue.getType())) {
			if (mType.equals(mAccess.getType())) {
				if (annotation.getValues().contains(mAnnotationValue)) {
					if (mOwner.getAnnotations().contains(annotation)) {
						if (mArray.getExpressions().contains(mValue)) {
							if (mArray.equals(mAnnotationValue.getValue())) {
								if (pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_0BBB(mAccess,
										mType, mOwner) == null) {
									if (pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_1BB(
											mAccess, annotation) == null) {
										if (pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_2BB(
												mAccess, mType) == null) {
											if (pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_3B(
													mAccess) == null) {
												if (pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_4BBB(
														mAccess, mType, mOwner) == null) {
													if (pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_5BB(
															mAccess, mOwner) == null) {
														if (pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_6BB(
																mAccess, mType) == null) {
															if (pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_7BB(
																	mAccess, mAnnotationValue) == null) {
																if (pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_8BB(
																		mValue, mAnnotationValue) == null) {
																	if (pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_9BB(
																			annotation, mAccess) == null) {
																		if (pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_10BB(
																				mAnnotationValue, mAccess) == null) {
																			if (pattern_AnnotationMemberValueClassArray_27_1_matchtggpattern_black_nac_11BB(
																					mAnnotationValue, mValue) == null) {
																				return new Object[] { annotation,
																						mAccess, mAnnotationValue,
																						mArray, mValue, mType, mOwner };
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_AnnotationMemberValueClassArray_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueClassArray_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_28_1_matchtggpattern_blackBBB(
			TAbstractType tType, TClassNode tValue, TAnnotationValue tAnnotationValue) {
		if (tType.equals(tValue.getTClass())) {
			if (tAnnotationValue.getTValue().contains(tValue)) {
				return new Object[] { tType, tValue, tAnnotationValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueClassArray_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueClassArray_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_29_1_createresult_blackB(
			AnnotationMemberValueClassArray _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Annotation annotation) {
		if (ruleResult.getSourceObjects().contains(annotation)) {
			return new Object[] { ruleResult, annotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, AnnotationMemberValuePair mAnnotationValue) {
		if (ruleResult.getSourceObjects().contains(mAnnotationValue)) {
			return new Object[] { ruleResult, mAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue) {
		if (ruleResult.getCorrObjects().contains(annotationMemberValuePairToTAnnotationValue)) {
			return new Object[] { ruleResult, annotationMemberValuePairToTAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TAnnotationValue tAnnotationValue) {
		if (ruleResult.getTargetObjects().contains(tAnnotationValue)) {
			return new Object[] { ruleResult, tAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, BodyDeclaration mOwner) {
		if (ruleResult.getSourceObjects().contains(mOwner)) {
			return new Object[] { ruleResult, mOwner };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_blackFFFFFFFFFFBB(
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
									if (pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, annotationMemberValuePairToTAnnotationValue) == null) {
										if (pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, mAnnotationValue) == null) {
											if (pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_black_nac_3BB(
													ruleResult, tAnnotationValue) == null) {
												for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
													if (tmpMTypeToTType instanceof TypeToTAbstractType) {
														TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
														Type mType = mTypeToTType.getSource();
														if (mType != null) {
															TAbstractType tType = mTypeToTType.getTarget();
															if (tType != null) {
																if (pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_black_nac_5BB(
																		ruleResult, mTypeToTType) == null) {
																	if (pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_black_nac_6BB(
																			ruleResult, mType) == null) {
																		if (pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_black_nac_7BB(
																				ruleResult, tType) == null) {
																			for (Annotation annotation : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(
																							mAnnotationValue,
																							Annotation.class,
																							"values")) {
																				if (pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_black_nac_0BB(
																						ruleResult,
																						annotation) == null) {
																					for (BodyDeclaration mOwner : org.moflon.core.utilities.eMoflonEMFUtil
																							.getOppositeReferenceTyped(
																									annotation,
																									BodyDeclaration.class,
																									"annotations")) {
																						if (pattern_AnnotationMemberValueClassArray_29_2_isapplicablecore_black_nac_4BB(
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

	public static final Object[] pattern_AnnotationMemberValueClassArray_29_3_solveCSP_bindingFBBBBBBBBBBB(
			AnnotationMemberValueClassArray _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, TypeToTAbstractType mTypeToTType, TAbstractType tType,
			Type mType, AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, annotation, mAnnotationValue,
				mTypeToTType, tType, mType, annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotation, mAnnotationValue, mTypeToTType, tType,
					mType, annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			AnnotationMemberValueClassArray _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, TypeToTAbstractType mTypeToTType, TAbstractType tType,
			Type mType, AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnnotationMemberValueClassArray_29_3_solveCSP_binding = pattern_AnnotationMemberValueClassArray_29_3_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, annotation, mAnnotationValue, mTypeToTType, tType, mType,
				annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, ruleResult);
		if (result_pattern_AnnotationMemberValueClassArray_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueClassArray_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueClassArray_29_3_solveCSP_black = pattern_AnnotationMemberValueClassArray_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueClassArray_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotation, mAnnotationValue, mTypeToTType, tType,
						mType, annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueClassArray_29_4_checkCSP_expressionFBB(
			AnnotationMemberValueClassArray _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_29_5_checknacs_blackBBBBBBBB(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, Type mType,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue) {
		return new Object[] { annotation, mAnnotationValue, mTypeToTType, tType, mType,
				annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_29_6_perform_blackBBBBBBBBB(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, Type mType,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { annotation, mAnnotationValue, mTypeToTType, tType, mType,
				annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, ruleResult };
	}

	public static final Object[] pattern_AnnotationMemberValueClassArray_29_6_perform_greenFBBFFFBFBB(
			AnnotationMemberValuePair mAnnotationValue, TAbstractType tType, Type mType,
			TAnnotationValue tAnnotationValue, ModelgeneratorRuleResult ruleResult) {
		TypeAccess mAccess = JavaFactory.eINSTANCE.createTypeAccess();
		ArrayInitializer mArray = JavaFactory.eINSTANCE.createArrayInitializer();
		TClassNode tValue = AnnotationsFactory.eINSTANCE.createTClassNode();
		TypeLiteral mValue = JavaFactory.eINSTANCE.createTypeLiteral();
		LiteralToTNode mValueToTValue = PmFactory.eINSTANCE.createLiteralToTNode();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		mAccess.setType(mType);
		ruleResult.getSourceObjects().add(mAccess);
		mAnnotationValue.setValue(mArray);
		ruleResult.getSourceObjects().add(mArray);
		tValue.setTClass(tType);
		tAnnotationValue.getTValue().add(tValue);
		ruleResult.getTargetObjects().add(tValue);
		mValue.setType(mAccess);
		mArray.getExpressions().add(mValue);
		ruleResult.getSourceObjects().add(mValue);
		mValueToTValue.setSource(mValue);
		mValueToTValue.setTarget(tValue);
		ruleResult.getCorrObjects().add(mValueToTValue);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mAccess, mAnnotationValue, tType, mArray, tValue, mValue, mType, mValueToTValue,
				tAnnotationValue, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationMemberValueClassArray_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationMemberValueClassArrayImpl
