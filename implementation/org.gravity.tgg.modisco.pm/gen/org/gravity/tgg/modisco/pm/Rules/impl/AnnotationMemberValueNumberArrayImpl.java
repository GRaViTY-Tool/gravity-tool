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
import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.NumberLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.AnnotationMemberValuePairToTAnnotationValue;
import org.gravity.tgg.modisco.pm.LiteralToTNode;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueNumberArray;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotationValue;
import org.gravity.typegraph.basic.annotations.TNumberNode;

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
 * An implementation of the model object '<em><b>Annotation Member Value Number Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotationMemberValueNumberArrayImpl extends AbstractRuleImpl implements AnnotationMemberValueNumberArray {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationMemberValueNumberArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnnotationMemberValueNumberArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Annotation annotation, AnnotationMemberValuePair mAnnotationValue,
			ArrayInitializer mArray, BodyDeclaration mOwner, NumberLiteral mValue) {

		Object[] result1_black = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_0_1_initialbindings_blackBBBBBBB(this, match, annotation,
						mAnnotationValue, mArray, mOwner, mValue);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[annotation] = " + annotation + ", " + "[mAnnotationValue] = "
					+ mAnnotationValue + ", " + "[mArray] = " + mArray + ", " + "[mOwner] = " + mOwner + ", "
					+ "[mValue] = " + mValue + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, annotation,
						mAnnotationValue, mArray, mOwner, mValue);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[annotation] = " + annotation + ", " + "[mAnnotationValue] = "
					+ mAnnotationValue + ", " + "[mArray] = " + mArray + ", " + "[mOwner] = " + mOwner + ", "
					+ "[mValue] = " + mValue + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_0_4_collectelementstobetranslated_blackBBBBBB(match,
							annotation, mAnnotationValue, mArray, mOwner, mValue);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[annotation] = " + annotation + ", " + "[mAnnotationValue] = " + mAnnotationValue + ", "
						+ "[mArray] = " + mArray + ", " + "[mOwner] = " + mOwner + ", " + "[mValue] = " + mValue + ".");
			}
			AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_0_4_collectelementstobetranslated_greenBBBBFF(match,
							mAnnotationValue, mArray, mValue);
			//nothing EMoflonEdge mArray__mValue____expressions = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mAnnotationValue__mArray____value = (EMoflonEdge) result4_green[5];

			Object[] result5_black = AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_0_5_collectcontextelements_blackBBBBBB(match, annotation,
							mAnnotationValue, mArray, mOwner, mValue);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[annotation] = " + annotation + ", " + "[mAnnotationValue] = " + mAnnotationValue + ", "
						+ "[mArray] = " + mArray + ", " + "[mOwner] = " + mOwner + ", " + "[mValue] = " + mValue + ".");
			}
			AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_0_5_collectcontextelements_greenBBBBFF(match, annotation,
							mAnnotationValue, mOwner);
			//nothing EMoflonEdge mOwner__annotation____annotations = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge annotation__mAnnotationValue____values = (EMoflonEdge) result5_green[5];

			// 
			AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_0_6_registerobjectstomatch_expressionBBBBBBB(this, match,
							annotation, mAnnotationValue, mArray, mOwner, mValue);
			return AnnotationMemberValueNumberArrayImpl.pattern_AnnotationMemberValueNumberArray_0_7_expressionF();
		} else {
			return AnnotationMemberValueNumberArrayImpl.pattern_AnnotationMemberValueNumberArray_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Annotation annotation = (Annotation) result1_bindingAndBlack[0];
		AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result1_bindingAndBlack[1];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result1_bindingAndBlack[2];
		ArrayInitializer mArray = (ArrayInitializer) result1_bindingAndBlack[3];
		BodyDeclaration mOwner = (BodyDeclaration) result1_bindingAndBlack[4];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result1_bindingAndBlack[5];
		NumberLiteral mValue = (NumberLiteral) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_greenFFBBB(tAnnotationValue, mValue,
						csp);
		LiteralToTNode mTypeToTType = (LiteralToTNode) result1_green[0];
		TNumberNode tValue = (TNumberNode) result1_green[1];

		Object[] result2_black = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_1_2_collecttranslatedelements_blackBBBB(mTypeToTType, mArray,
						tValue, mValue);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = " + mTypeToTType
					+ ", " + "[mArray] = " + mArray + ", " + "[tValue] = " + tValue + ", " + "[mValue] = " + mValue
					+ ".");
		}
		Object[] result2_green = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_1_2_collecttranslatedelements_greenFBBBB(mTypeToTType, mArray,
						tValue, mValue);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						annotation, AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mTypeToTType, mArray,
						tValue, mOwner, tAnnotationValue, mValue);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[annotation] = " + annotation + ", " + "[AnnotationMemberValuePairToTAnnotationValue] = "
					+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mAnnotationValue] = " + mAnnotationValue
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mArray] = " + mArray + ", " + "[tValue] = "
					+ tValue + ", " + "[mOwner] = " + mOwner + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", "
					+ "[mValue] = " + mValue + ".");
		}
		AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_1_3_bookkeepingforedges_greenBBBBBBBFFFFF(ruleresult,
						mAnnotationValue, mTypeToTType, mArray, tValue, tAnnotationValue, mValue);
		//nothing EMoflonEdge mArray__mValue____expressions = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mTypeToTType__mValue____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mAnnotationValue__mArray____value = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mTypeToTType__tValue____target = (EMoflonEdge) result3_green[11];

		// 
		// 
		AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
						annotation, AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mTypeToTType, mArray,
						tValue, mOwner, tAnnotationValue, mValue);
		return AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Annotation annotation = (Annotation) result2_binding[0];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_binding[1];
		ArrayInitializer mArray = (ArrayInitializer) result2_binding[2];
		BodyDeclaration mOwner = (BodyDeclaration) result2_binding[3];
		NumberLiteral mValue = (NumberLiteral) result2_binding[4];
		for (Object[] result2_black : AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_2_2_corematch_blackBFBBBFBB(annotation, mAnnotationValue,
						mArray, mOwner, mValue, match)) {
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result2_black[1];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_black[5];
			// ForEach 
			for (Object[] result3_black : AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_2_3_findcontext_blackBBBBBBB(annotation,
							AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, mOwner,
							tAnnotationValue, mValue)) {
				Object[] result3_green = AnnotationMemberValueNumberArrayImpl
						.pattern_AnnotationMemberValueNumberArray_2_3_findcontext_greenBBBBBBBFFFFFFF(annotation,
								AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, mOwner,
								tAnnotationValue, mValue);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__mAnnotationValue____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mOwner__annotation____annotations = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mArray__mValue____expressions = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge annotation__mAnnotationValue____values = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mAnnotationValue__mArray____value = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = AnnotationMemberValueNumberArrayImpl
						.pattern_AnnotationMemberValueNumberArray_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, annotation, AnnotationMemberValuePairToTAnnotationValue,
								mAnnotationValue, mArray, mOwner, tAnnotationValue, mValue);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[annotation] = " + annotation
							+ ", " + "[AnnotationMemberValuePairToTAnnotationValue] = "
							+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mAnnotationValue] = "
							+ mAnnotationValue + ", " + "[mArray] = " + mArray + ", " + "[mOwner] = " + mOwner + ", "
							+ "[tAnnotationValue] = " + tAnnotationValue + ", " + "[mValue] = " + mValue + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationMemberValueNumberArrayImpl
						.pattern_AnnotationMemberValueNumberArray_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationMemberValueNumberArrayImpl
							.pattern_AnnotationMemberValueNumberArray_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationMemberValueNumberArrayImpl
							.pattern_AnnotationMemberValueNumberArray_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, BodyDeclaration mOwner,
			NumberLiteral mValue) {
		match.registerObject("annotation", annotation);
		match.registerObject("mAnnotationValue", mAnnotationValue);
		match.registerObject("mArray", mArray);
		match.registerObject("mOwner", mOwner);
		match.registerObject("mValue", mValue);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, BodyDeclaration mOwner,
			NumberLiteral mValue) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, NumberLiteral mValue) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mValue_tokenValue = CSPFactoryHelper.eINSTANCE.createVariable("mValue.tokenValue", true, csp);
		var_mValue_tokenValue.setValue(mValue.getTokenValue());
		var_mValue_tokenValue.setType("String");

		// Create unbound variables
		Variable var_tValue_tNumber = CSPFactoryHelper.eINSTANCE.createVariable("tValue.tNumber", csp);
		var_tValue_tNumber.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mValue_tokenValue, var_tValue_tNumber);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("annotation", annotation);
		isApplicableMatch.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.registerObject("mAnnotationValue", mAnnotationValue);
		isApplicableMatch.registerObject("mArray", mArray);
		isApplicableMatch.registerObject("mOwner", mOwner);
		isApplicableMatch.registerObject("tAnnotationValue", tAnnotationValue);
		isApplicableMatch.registerObject("mValue", mValue);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject annotation,
			EObject AnnotationMemberValuePairToTAnnotationValue, EObject mAnnotationValue, EObject mTypeToTType,
			EObject mArray, EObject tValue, EObject mOwner, EObject tAnnotationValue, EObject mValue) {
		ruleresult.registerObject("annotation", annotation);
		ruleresult.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		ruleresult.registerObject("mAnnotationValue", mAnnotationValue);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mArray", mArray);
		ruleresult.registerObject("tValue", tValue);
		ruleresult.registerObject("mOwner", mOwner);
		ruleresult.registerObject("tAnnotationValue", tAnnotationValue);
		ruleresult.registerObject("mValue", mValue);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mArray").eClass())
						.equals("java.ArrayInitializer.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mValue").eClass())
						.equals("java.NumberLiteral.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TNumberNode tValue, TAnnotationValue tAnnotationValue) {

		Object[] result1_black = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_10_1_initialbindings_blackBBBB(this, match, tValue,
						tAnnotationValue);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tValue] = " + tValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tValue,
						tAnnotationValue);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tValue] = " + tValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_10_4_collectelementstobetranslated_blackBBB(match, tValue,
							tAnnotationValue);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tValue] = " + tValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ".");
			}
			AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_10_4_collectelementstobetranslated_greenBBBF(match,
							tValue, tAnnotationValue);
			//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result4_green[3];

			Object[] result5_black = AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_10_5_collectcontextelements_blackBBB(match, tValue,
							tAnnotationValue);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tValue] = " + tValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ".");
			}
			AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_10_5_collectcontextelements_greenBB(match,
							tAnnotationValue);

			// 
			AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_10_6_registerobjectstomatch_expressionBBBB(this, match,
							tValue, tAnnotationValue);
			return AnnotationMemberValueNumberArrayImpl.pattern_AnnotationMemberValueNumberArray_10_7_expressionF();
		} else {
			return AnnotationMemberValueNumberArrayImpl.pattern_AnnotationMemberValueNumberArray_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Annotation annotation = (Annotation) result1_bindingAndBlack[0];
		AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result1_bindingAndBlack[1];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result1_bindingAndBlack[2];
		TNumberNode tValue = (TNumberNode) result1_bindingAndBlack[3];
		BodyDeclaration mOwner = (BodyDeclaration) result1_bindingAndBlack[4];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_greenBFFBFB(mAnnotationValue,
						tValue, csp);
		LiteralToTNode mTypeToTType = (LiteralToTNode) result1_green[1];
		ArrayInitializer mArray = (ArrayInitializer) result1_green[2];
		NumberLiteral mValue = (NumberLiteral) result1_green[4];

		Object[] result2_black = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_11_2_collecttranslatedelements_blackBBBB(mTypeToTType, mArray,
						tValue, mValue);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = " + mTypeToTType
					+ ", " + "[mArray] = " + mArray + ", " + "[tValue] = " + tValue + ", " + "[mValue] = " + mValue
					+ ".");
		}
		Object[] result2_green = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_11_2_collecttranslatedelements_greenFBBBB(mTypeToTType,
						mArray, tValue, mValue);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						annotation, AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mTypeToTType, mArray,
						tValue, mOwner, tAnnotationValue, mValue);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[annotation] = " + annotation + ", " + "[AnnotationMemberValuePairToTAnnotationValue] = "
					+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mAnnotationValue] = " + mAnnotationValue
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mArray] = " + mArray + ", " + "[tValue] = "
					+ tValue + ", " + "[mOwner] = " + mOwner + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", "
					+ "[mValue] = " + mValue + ".");
		}
		AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_11_3_bookkeepingforedges_greenBBBBBBBFFFFF(ruleresult,
						mAnnotationValue, mTypeToTType, mArray, tValue, tAnnotationValue, mValue);
		//nothing EMoflonEdge mArray__mValue____expressions = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mTypeToTType__mValue____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mAnnotationValue__mArray____value = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mTypeToTType__tValue____target = (EMoflonEdge) result3_green[11];

		// 
		// 
		AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
						annotation, AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mTypeToTType, mArray,
						tValue, mOwner, tAnnotationValue, mValue);
		return AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TNumberNode tValue = (TNumberNode) result2_binding[0];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_binding[1];
		for (Object[] result2_black : AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_12_2_corematch_blackFFBBB(tValue, tAnnotationValue, match)) {
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result2_black[0];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_black[1];
			// ForEach 
			for (Object[] result3_black : AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_12_3_findcontext_blackFBBBFB(
							AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, tValue, tAnnotationValue)) {
				Annotation annotation = (Annotation) result3_black[0];
				BodyDeclaration mOwner = (BodyDeclaration) result3_black[4];
				Object[] result3_green = AnnotationMemberValueNumberArrayImpl
						.pattern_AnnotationMemberValueNumberArray_12_3_findcontext_greenBBBBBBFFFFFF(annotation,
								AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, tValue, mOwner,
								tAnnotationValue);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__mAnnotationValue____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mOwner__annotation____annotations = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge annotation__mAnnotationValue____values = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = AnnotationMemberValueNumberArrayImpl
						.pattern_AnnotationMemberValueNumberArray_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, annotation, AnnotationMemberValuePairToTAnnotationValue,
								mAnnotationValue, tValue, mOwner, tAnnotationValue);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[annotation] = " + annotation
							+ ", " + "[AnnotationMemberValuePairToTAnnotationValue] = "
							+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mAnnotationValue] = "
							+ mAnnotationValue + ", " + "[tValue] = " + tValue + ", " + "[mOwner] = " + mOwner + ", "
							+ "[tAnnotationValue] = " + tAnnotationValue + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationMemberValueNumberArrayImpl
						.pattern_AnnotationMemberValueNumberArray_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationMemberValueNumberArrayImpl
							.pattern_AnnotationMemberValueNumberArray_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationMemberValueNumberArrayImpl
							.pattern_AnnotationMemberValueNumberArray_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TNumberNode tValue, TAnnotationValue tAnnotationValue) {
		match.registerObject("tValue", tValue);
		match.registerObject("tAnnotationValue", tAnnotationValue);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TNumberNode tValue, TAnnotationValue tAnnotationValue) {// Create CSP
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
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, TNumberNode tValue, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tValue_tNumber = CSPFactoryHelper.eINSTANCE.createVariable("tValue.tNumber", true, csp);
		var_tValue_tNumber.setValue(tValue.getTNumber());
		var_tValue_tNumber.setType("String");

		// Create unbound variables
		Variable var_mValue_tokenValue = CSPFactoryHelper.eINSTANCE.createVariable("mValue.tokenValue", csp);
		var_mValue_tokenValue.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mValue_tokenValue, var_tValue_tNumber);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("annotation", annotation);
		isApplicableMatch.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.registerObject("mAnnotationValue", mAnnotationValue);
		isApplicableMatch.registerObject("tValue", tValue);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject annotation,
			EObject AnnotationMemberValuePairToTAnnotationValue, EObject mAnnotationValue, EObject mTypeToTType,
			EObject mArray, EObject tValue, EObject mOwner, EObject tAnnotationValue, EObject mValue) {
		ruleresult.registerObject("annotation", annotation);
		ruleresult.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		ruleresult.registerObject("mAnnotationValue", mAnnotationValue);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mArray", mArray);
		ruleresult.registerObject("tValue", tValue);
		ruleresult.registerObject("mOwner", mOwner);
		ruleresult.registerObject("tAnnotationValue", tAnnotationValue);
		ruleresult.registerObject("mValue", mValue);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tValue").eClass())
				.equals("basic.annotations.TNumberNode.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_92(EMoflonEdge _edge_tValue) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_20_2_testcorematchandDECs_blackFFB(_edge_tValue)) {
			TNumberNode tValue = (TNumberNode) result2_black[0];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_black[1];
			Object[] result2_green = AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tValue, tAnnotationValue)) {
				// 
				if (AnnotationMemberValueNumberArrayImpl
						.pattern_AnnotationMemberValueNumberArray_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationMemberValueNumberArrayImpl
							.pattern_AnnotationMemberValueNumberArray_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationMemberValueNumberArrayImpl
							.pattern_AnnotationMemberValueNumberArray_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_96(EMoflonEdge _edge_expressions) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_21_2_testcorematchandDECs_blackFFFFFB(_edge_expressions)) {
			Annotation annotation = (Annotation) result2_black[0];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_black[1];
			ArrayInitializer mArray = (ArrayInitializer) result2_black[2];
			BodyDeclaration mOwner = (BodyDeclaration) result2_black[3];
			NumberLiteral mValue = (NumberLiteral) result2_black[4];
			Object[] result2_green = AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, annotation, mAnnotationValue, mArray, mOwner, mValue)) {
				// 
				if (AnnotationMemberValueNumberArrayImpl
						.pattern_AnnotationMemberValueNumberArray_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationMemberValueNumberArrayImpl
							.pattern_AnnotationMemberValueNumberArray_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationMemberValueNumberArrayImpl
							.pattern_AnnotationMemberValueNumberArray_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnnotationMemberValueNumberArray");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tValue_tNumber = CSPFactoryHelper.eINSTANCE.createVariable("tValue", true, csp);
		var_tValue_tNumber.setValue(__helper.getValue("tValue", "tNumber"));
		var_tValue_tNumber.setType("String");

		Variable var_mValue_tokenValue = CSPFactoryHelper.eINSTANCE.createVariable("mValue", true, csp);
		var_mValue_tokenValue.setValue(__helper.getValue("mValue", "tokenValue"));
		var_mValue_tokenValue.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("AnnotationMemberValueNumberArray");
		eq0.solve(var_mValue_tokenValue, var_tValue_tNumber);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tValue_tNumber.setBound(false);
			eq0.solve(var_mValue_tokenValue, var_tValue_tNumber);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tValue", "tNumber", var_tValue_tNumber.getValue());
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
		ruleResult.setRule("AnnotationMemberValueNumberArray");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tValue_tNumber = CSPFactoryHelper.eINSTANCE.createVariable("tValue", true, csp);
		var_tValue_tNumber.setValue(__helper.getValue("tValue", "tNumber"));
		var_tValue_tNumber.setType("String");

		Variable var_mValue_tokenValue = CSPFactoryHelper.eINSTANCE.createVariable("mValue", true, csp);
		var_mValue_tokenValue.setValue(__helper.getValue("mValue", "tokenValue"));
		var_mValue_tokenValue.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("AnnotationMemberValueNumberArray");
		eq0.solve(var_mValue_tokenValue, var_tValue_tNumber);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mValue_tokenValue.setBound(false);
			eq0.solve(var_mValue_tokenValue, var_tValue_tNumber);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mValue", "tokenValue", var_mValue_tokenValue.getValue());
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

		Object[] result1_black = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Annotation annotation = (Annotation) result2_bindingAndBlack[0];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_bindingAndBlack[1];
		ArrayInitializer mArray = (ArrayInitializer) result2_bindingAndBlack[2];
		TNumberNode tValue = (TNumberNode) result2_bindingAndBlack[3];
		BodyDeclaration mOwner = (BodyDeclaration) result2_bindingAndBlack[4];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_bindingAndBlack[5];
		NumberLiteral mValue = (NumberLiteral) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, annotation,
						mAnnotationValue, mArray, tValue, mOwner, tAnnotationValue, mValue, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[annotation] = " + annotation + ", " + "[mAnnotationValue] = " + mAnnotationValue + ", "
					+ "[mArray] = " + mArray + ", " + "[tValue] = " + tValue + ", " + "[mOwner] = " + mOwner + ", "
					+ "[tAnnotationValue] = " + tAnnotationValue + ", " + "[mValue] = " + mValue + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_24_5_matchcorrcontext_blackFBBBB(mAnnotationValue,
							tAnnotationValue, sourceMatch, targetMatch)) {
				AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result5_black[0];
				Object[] result5_green = AnnotationMemberValueNumberArrayImpl
						.pattern_AnnotationMemberValueNumberArray_24_5_matchcorrcontext_greenBBBF(
								AnnotationMemberValuePairToTAnnotationValue, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = AnnotationMemberValueNumberArrayImpl
						.pattern_AnnotationMemberValueNumberArray_24_6_createcorrespondence_blackBBBBBBBB(annotation,
								mAnnotationValue, mArray, tValue, mOwner, tAnnotationValue, mValue, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[annotation] = "
							+ annotation + ", " + "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mArray] = "
							+ mArray + ", " + "[tValue] = " + tValue + ", " + "[mOwner] = " + mOwner + ", "
							+ "[tAnnotationValue] = " + tAnnotationValue + ", " + "[mValue] = " + mValue + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationMemberValueNumberArrayImpl
						.pattern_AnnotationMemberValueNumberArray_24_6_createcorrespondence_greenFBBB(tValue, mValue,
								ccMatch);
				//nothing LiteralToTNode mTypeToTType = (LiteralToTNode) result6_green[0];

				Object[] result7_black = AnnotationMemberValueNumberArrayImpl
						.pattern_AnnotationMemberValueNumberArray_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationMemberValueNumberArrayImpl
						.pattern_AnnotationMemberValueNumberArray_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AnnotationMemberValueNumberArrayImpl.pattern_AnnotationMemberValueNumberArray_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Annotation annotation, AnnotationMemberValuePair mAnnotationValue,
			ArrayInitializer mArray, TNumberNode tValue, BodyDeclaration mOwner, TAnnotationValue tAnnotationValue,
			NumberLiteral mValue, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mValue_tokenValue = CSPFactoryHelper.eINSTANCE.createVariable("mValue.tokenValue", true, csp);
		var_mValue_tokenValue.setValue(mValue.getTokenValue());
		var_mValue_tokenValue.setType("String");
		Variable var_tValue_tNumber = CSPFactoryHelper.eINSTANCE.createVariable("tValue.tNumber", true, csp);
		var_tValue_tNumber.setValue(tValue.getTNumber());
		var_tValue_tNumber.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mValue_tokenValue, var_tValue_tNumber);
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
	public boolean checkDEC_FWD(Annotation annotation, AnnotationMemberValuePair mAnnotationValue,
			ArrayInitializer mArray, BodyDeclaration mOwner, NumberLiteral mValue) {// 
		Object[] result1_black = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_27_1_matchtggpattern_blackBBBBB(annotation, mAnnotationValue,
						mArray, mOwner, mValue);
		if (result1_black != null) {
			return AnnotationMemberValueNumberArrayImpl.pattern_AnnotationMemberValueNumberArray_27_2_expressionF();
		} else {
			return AnnotationMemberValueNumberArrayImpl.pattern_AnnotationMemberValueNumberArray_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TNumberNode tValue, TAnnotationValue tAnnotationValue) {// 
		Object[] result1_black = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_28_1_matchtggpattern_blackBB(tValue, tAnnotationValue);
		if (result1_black != null) {
			return AnnotationMemberValueNumberArrayImpl.pattern_AnnotationMemberValueNumberArray_28_2_expressionF();
		} else {
			return AnnotationMemberValueNumberArrayImpl.pattern_AnnotationMemberValueNumberArray_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValueParameter) {

		Object[] result1_black = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_29_2_isapplicablecore_blackFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList AnnotationMemberValuePairToTAnnotationValueList = (RuleEntryList) result2_black[0];
			Annotation annotation = (Annotation) result2_black[1];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_black[2];
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result2_black[3];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_black[4];
			BodyDeclaration mOwner = (BodyDeclaration) result2_black[5];

			Object[] result3_bindingAndBlack = AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_29_3_solveCSP_bindingAndBlackFBBBBBBBB(this,
							isApplicableMatch, annotation, AnnotationMemberValuePairToTAnnotationValue,
							mAnnotationValue, mOwner, tAnnotationValue, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[annotation] = " + annotation + ", "
						+ "[AnnotationMemberValuePairToTAnnotationValue] = "
						+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mAnnotationValue] = "
						+ mAnnotationValue + ", " + "[mOwner] = " + mOwner + ", " + "[tAnnotationValue] = "
						+ tAnnotationValue + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnnotationMemberValueNumberArrayImpl
					.pattern_AnnotationMemberValueNumberArray_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnnotationMemberValueNumberArrayImpl
						.pattern_AnnotationMemberValueNumberArray_29_5_checknacs_blackBBBBB(annotation,
								AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mOwner,
								tAnnotationValue);
				if (result5_black != null) {

					Object[] result6_black = AnnotationMemberValueNumberArrayImpl
							.pattern_AnnotationMemberValueNumberArray_29_6_perform_blackBBBBBB(annotation,
									AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mOwner,
									tAnnotationValue, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[annotation] = "
								+ annotation + ", " + "[AnnotationMemberValuePairToTAnnotationValue] = "
								+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mAnnotationValue] = "
								+ mAnnotationValue + ", " + "[mOwner] = " + mOwner + ", " + "[tAnnotationValue] = "
								+ tAnnotationValue + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					AnnotationMemberValueNumberArrayImpl
							.pattern_AnnotationMemberValueNumberArray_29_6_perform_greenBFFFBFBB(mAnnotationValue,
									tAnnotationValue, ruleResult, csp);
					//nothing LiteralToTNode mTypeToTType = (LiteralToTNode) result6_green[1];
					//nothing ArrayInitializer mArray = (ArrayInitializer) result6_green[2];
					//nothing TNumberNode tValue = (TNumberNode) result6_green[3];
					//nothing NumberLiteral mValue = (NumberLiteral) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberValueNumberArrayImpl
				.pattern_AnnotationMemberValueNumberArray_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, TAnnotationValue tAnnotationValue,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mValue_tokenValue = CSPFactoryHelper.eINSTANCE.createVariable("mValue.tokenValue", csp);
		var_mValue_tokenValue.setType("String");
		Variable var_tValue_tNumber = CSPFactoryHelper.eINSTANCE.createVariable("tValue.tNumber", csp);
		var_tValue_tNumber.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mValue_tokenValue, var_tValue_tNumber);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("annotation", annotation);
		isApplicableMatch.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.registerObject("mAnnotationValue", mAnnotationValue);
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
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___IS_APPROPRIATE_FWD__MATCH_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_BODYDECLARATION_NUMBERLITERAL:
			return isAppropriate_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2), (ArrayInitializer) arguments.get(3),
					(BodyDeclaration) arguments.get(4), (NumberLiteral) arguments.get(5));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_BODYDECLARATION_NUMBERLITERAL:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2), (ArrayInitializer) arguments.get(3),
					(BodyDeclaration) arguments.get(4), (NumberLiteral) arguments.get(5));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_BODYDECLARATION_NUMBERLITERAL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2), (ArrayInitializer) arguments.get(3),
					(BodyDeclaration) arguments.get(4), (NumberLiteral) arguments.get(5));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ANNOTATION_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE_ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_BODYDECLARATION_TANNOTATIONVALUE_NUMBERLITERAL:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Annotation) arguments.get(1),
					(AnnotationMemberValuePairToTAnnotationValue) arguments.get(2),
					(AnnotationMemberValuePair) arguments.get(3), (ArrayInitializer) arguments.get(4),
					(BodyDeclaration) arguments.get(5), (TAnnotationValue) arguments.get(6),
					(NumberLiteral) arguments.get(7));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___IS_APPROPRIATE_BWD__MATCH_TNUMBERNODE_TANNOTATIONVALUE:
			return isAppropriate_BWD((Match) arguments.get(0), (TNumberNode) arguments.get(1),
					(TAnnotationValue) arguments.get(2));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TNUMBERNODE_TANNOTATIONVALUE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TNumberNode) arguments.get(1),
					(TAnnotationValue) arguments.get(2));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TNUMBERNODE_TANNOTATIONVALUE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TNumberNode) arguments.get(1),
					(TAnnotationValue) arguments.get(2));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANNOTATION_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE_ANNOTATIONMEMBERVALUEPAIR_TNUMBERNODE_BODYDECLARATION_TANNOTATIONVALUE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Annotation) arguments.get(1),
					(AnnotationMemberValuePairToTAnnotationValue) arguments.get(2),
					(AnnotationMemberValuePair) arguments.get(3), (TNumberNode) arguments.get(4),
					(BodyDeclaration) arguments.get(5), (TAnnotationValue) arguments.get(6));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___IS_APPROPRIATE_BWD_EMOFLON_EDGE_92__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_92((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___IS_APPROPRIATE_FWD_EMOFLON_EDGE_96__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_96((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___IS_APPLICABLE_SOLVE_CSP_CC__ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_TNUMBERNODE_BODYDECLARATION_TANNOTATIONVALUE_NUMBERLITERAL_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Annotation) arguments.get(0), (AnnotationMemberValuePair) arguments.get(1),
					(ArrayInitializer) arguments.get(2), (TNumberNode) arguments.get(3),
					(BodyDeclaration) arguments.get(4), (TAnnotationValue) arguments.get(5),
					(NumberLiteral) arguments.get(6), (Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___CHECK_DEC_FWD__ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_BODYDECLARATION_NUMBERLITERAL:
			return checkDEC_FWD((Annotation) arguments.get(0), (AnnotationMemberValuePair) arguments.get(1),
					(ArrayInitializer) arguments.get(2), (BodyDeclaration) arguments.get(3),
					(NumberLiteral) arguments.get(4));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___CHECK_DEC_BWD__TNUMBERNODE_TANNOTATIONVALUE:
			return checkDEC_BWD((TNumberNode) arguments.get(0), (TAnnotationValue) arguments.get(1));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___GENERATE_MODEL__RULEENTRYCONTAINER_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(AnnotationMemberValuePairToTAnnotationValue) arguments.get(1));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANNOTATION_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE_ANNOTATIONMEMBERVALUEPAIR_BODYDECLARATION_TANNOTATIONVALUE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Annotation) arguments.get(1),
					(AnnotationMemberValuePairToTAnnotationValue) arguments.get(2),
					(AnnotationMemberValuePair) arguments.get(3), (BodyDeclaration) arguments.get(4),
					(TAnnotationValue) arguments.get(5), (ModelgeneratorRuleResult) arguments.get(6));
		case RulesPackage.ANNOTATION_MEMBER_VALUE_NUMBER_ARRAY___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_0_1_initialbindings_blackBBBBBBB(
			AnnotationMemberValueNumberArray _this, Match match, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, BodyDeclaration mOwner,
			NumberLiteral mValue) {
		return new Object[] { _this, match, annotation, mAnnotationValue, mArray, mOwner, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_0_2_SolveCSP_bindingFBBBBBBB(
			AnnotationMemberValueNumberArray _this, Match match, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, BodyDeclaration mOwner,
			NumberLiteral mValue) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, annotation, mAnnotationValue, mArray, mOwner,
				mValue);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, annotation, mAnnotationValue, mArray, mOwner, mValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			AnnotationMemberValueNumberArray _this, Match match, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, BodyDeclaration mOwner,
			NumberLiteral mValue) {
		Object[] result_pattern_AnnotationMemberValueNumberArray_0_2_SolveCSP_binding = pattern_AnnotationMemberValueNumberArray_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, annotation, mAnnotationValue, mArray, mOwner, mValue);
		if (result_pattern_AnnotationMemberValueNumberArray_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueNumberArray_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueNumberArray_0_2_SolveCSP_black = pattern_AnnotationMemberValueNumberArray_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueNumberArray_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, annotation, mAnnotationValue, mArray, mOwner, mValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_0_3_CheckCSP_expressionFBB(
			AnnotationMemberValueNumberArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_0_4_collectelementstobetranslated_blackBBBBBB(
			Match match, Annotation annotation, AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray,
			BodyDeclaration mOwner, NumberLiteral mValue) {
		return new Object[] { match, annotation, mAnnotationValue, mArray, mOwner, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, NumberLiteral mValue) {
		EMoflonEdge mArray__mValue____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationValue__mArray____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mArray);
		match.getToBeTranslatedNodes().add(mValue);
		String mArray__mValue____expressions_name_prime = "expressions";
		String mAnnotationValue__mArray____value_name_prime = "value";
		mArray__mValue____expressions.setSrc(mArray);
		mArray__mValue____expressions.setTrg(mValue);
		match.getToBeTranslatedEdges().add(mArray__mValue____expressions);
		mAnnotationValue__mArray____value.setSrc(mAnnotationValue);
		mAnnotationValue__mArray____value.setTrg(mArray);
		match.getToBeTranslatedEdges().add(mAnnotationValue__mArray____value);
		mArray__mValue____expressions.setName(mArray__mValue____expressions_name_prime);
		mAnnotationValue__mArray____value.setName(mAnnotationValue__mArray____value_name_prime);
		return new Object[] { match, mAnnotationValue, mArray, mValue, mArray__mValue____expressions,
				mAnnotationValue__mArray____value };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_0_5_collectcontextelements_blackBBBBBB(
			Match match, Annotation annotation, AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray,
			BodyDeclaration mOwner, NumberLiteral mValue) {
		return new Object[] { match, annotation, mAnnotationValue, mArray, mOwner, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_0_5_collectcontextelements_greenBBBBFF(
			Match match, Annotation annotation, AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner) {
		EMoflonEdge mOwner__annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__mAnnotationValue____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(annotation);
		match.getContextNodes().add(mAnnotationValue);
		match.getContextNodes().add(mOwner);
		String mOwner__annotation____annotations_name_prime = "annotations";
		String annotation__mAnnotationValue____values_name_prime = "values";
		mOwner__annotation____annotations.setSrc(mOwner);
		mOwner__annotation____annotations.setTrg(annotation);
		match.getContextEdges().add(mOwner__annotation____annotations);
		annotation__mAnnotationValue____values.setSrc(annotation);
		annotation__mAnnotationValue____values.setTrg(mAnnotationValue);
		match.getContextEdges().add(annotation__mAnnotationValue____values);
		mOwner__annotation____annotations.setName(mOwner__annotation____annotations_name_prime);
		annotation__mAnnotationValue____values.setName(annotation__mAnnotationValue____values_name_prime);
		return new Object[] { match, annotation, mAnnotationValue, mOwner, mOwner__annotation____annotations,
				annotation__mAnnotationValue____values };
	}

	public static final void pattern_AnnotationMemberValueNumberArray_0_6_registerobjectstomatch_expressionBBBBBBB(
			AnnotationMemberValueNumberArray _this, Match match, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, BodyDeclaration mOwner,
			NumberLiteral mValue) {
		_this.registerObjectsToMatch_FWD(match, annotation, mAnnotationValue, mArray, mOwner, mValue);

	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("annotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("AnnotationMemberValuePairToTAnnotationValue");
		EObject _localVariable_2 = isApplicableMatch.getObject("mAnnotationValue");
		EObject _localVariable_3 = isApplicableMatch.getObject("mArray");
		EObject _localVariable_4 = isApplicableMatch.getObject("mOwner");
		EObject _localVariable_5 = isApplicableMatch.getObject("tAnnotationValue");
		EObject _localVariable_6 = isApplicableMatch.getObject("mValue");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpAnnotationMemberValuePairToTAnnotationValue = _localVariable_1;
		EObject tmpMAnnotationValue = _localVariable_2;
		EObject tmpMArray = _localVariable_3;
		EObject tmpMOwner = _localVariable_4;
		EObject tmpTAnnotationValue = _localVariable_5;
		EObject tmpMValue = _localVariable_6;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpAnnotationMemberValuePairToTAnnotationValue instanceof AnnotationMemberValuePairToTAnnotationValue) {
				AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) tmpAnnotationMemberValuePairToTAnnotationValue;
				if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
					AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
					if (tmpMArray instanceof ArrayInitializer) {
						ArrayInitializer mArray = (ArrayInitializer) tmpMArray;
						if (tmpMOwner instanceof BodyDeclaration) {
							BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
							if (tmpTAnnotationValue instanceof TAnnotationValue) {
								TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
								if (tmpMValue instanceof NumberLiteral) {
									NumberLiteral mValue = (NumberLiteral) tmpMValue;
									return new Object[] { annotation, annotationMemberValuePairToTAnnotationValue,
											mAnnotationValue, mArray, mOwner, tAnnotationValue, mValue,
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

	public static final Object[] pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_blackBBBBBBBFBB(
			Annotation annotation,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, NumberLiteral mValue, AnnotationMemberValueNumberArray _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { annotation, annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray,
						mOwner, tAnnotationValue, mValue, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			AnnotationMemberValueNumberArray _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_binding = pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_binding != null) {
			Annotation annotation = (Annotation) result_pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_binding[0];
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result_pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_binding[1];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_binding[2];
			ArrayInitializer mArray = (ArrayInitializer) result_pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_binding[3];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_binding[4];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_binding[5];
			NumberLiteral mValue = (NumberLiteral) result_pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_binding[6];

			Object[] result_pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_black = pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_blackBBBBBBBFBB(
					annotation, annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, mOwner,
					tAnnotationValue, mValue, _this, isApplicableMatch);
			if (result_pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_black[7];

				return new Object[] { annotation, annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray,
						mOwner, tAnnotationValue, mValue, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_1_1_performtransformation_greenFFBBB(
			TAnnotationValue tAnnotationValue, NumberLiteral mValue, CSP csp) {
		LiteralToTNode mTypeToTType = PmFactory.eINSTANCE.createLiteralToTNode();
		TNumberNode tValue = AnnotationsFactory.eINSTANCE.createTNumberNode();
		Object _localVariable_0 = csp.getValue("tValue", "tNumber");
		mTypeToTType.setSource(mValue);
		tAnnotationValue.getTValue().add(tValue);
		mTypeToTType.setTarget(tValue);
		String tValue_tNumber_prime = (String) _localVariable_0;
		tValue.setTNumber(tValue_tNumber_prime);
		return new Object[] { mTypeToTType, tValue, tAnnotationValue, mValue, csp };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_1_2_collecttranslatedelements_blackBBBB(
			LiteralToTNode mTypeToTType, ArrayInitializer mArray, TNumberNode tValue, NumberLiteral mValue) {
		return new Object[] { mTypeToTType, mArray, tValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_1_2_collecttranslatedelements_greenFBBBB(
			LiteralToTNode mTypeToTType, ArrayInitializer mArray, TNumberNode tValue, NumberLiteral mValue) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getTranslatedElements().add(mArray);
		ruleresult.getCreatedElements().add(tValue);
		ruleresult.getTranslatedElements().add(mValue);
		return new Object[] { ruleresult, mTypeToTType, mArray, tValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject annotation, EObject annotationMemberValuePairToTAnnotationValue,
			EObject mAnnotationValue, EObject mTypeToTType, EObject mArray, EObject tValue, EObject mOwner,
			EObject tAnnotationValue, EObject mValue) {
		if (!annotation.equals(mAnnotationValue)) {
			if (!annotation.equals(mTypeToTType)) {
				if (!annotation.equals(mArray)) {
					if (!annotation.equals(tValue)) {
						if (!annotation.equals(mOwner)) {
							if (!annotation.equals(tAnnotationValue)) {
								if (!annotation.equals(mValue)) {
									if (!annotationMemberValuePairToTAnnotationValue.equals(annotation)) {
										if (!annotationMemberValuePairToTAnnotationValue.equals(mAnnotationValue)) {
											if (!annotationMemberValuePairToTAnnotationValue.equals(mTypeToTType)) {
												if (!annotationMemberValuePairToTAnnotationValue.equals(mArray)) {
													if (!annotationMemberValuePairToTAnnotationValue.equals(tValue)) {
														if (!annotationMemberValuePairToTAnnotationValue
																.equals(mOwner)) {
															if (!annotationMemberValuePairToTAnnotationValue
																	.equals(tAnnotationValue)) {
																if (!annotationMemberValuePairToTAnnotationValue
																		.equals(mValue)) {
																	if (!mAnnotationValue.equals(mTypeToTType)) {
																		if (!mAnnotationValue.equals(mArray)) {
																			if (!mAnnotationValue.equals(tValue)) {
																				if (!mAnnotationValue.equals(mOwner)) {
																					if (!mAnnotationValue
																							.equals(tAnnotationValue)) {
																						if (!mAnnotationValue
																								.equals(mValue)) {
																							if (!mTypeToTType
																									.equals(tValue)) {
																								if (!mTypeToTType
																										.equals(tAnnotationValue)) {
																									if (!mTypeToTType
																											.equals(mValue)) {
																										if (!mArray
																												.equals(mTypeToTType)) {
																											if (!mArray
																													.equals(tValue)) {
																												if (!mArray
																														.equals(mOwner)) {
																													if (!mArray
																															.equals(tAnnotationValue)) {
																														if (!mArray
																																.equals(mValue)) {
																															if (!mOwner
																																	.equals(mTypeToTType)) {
																																if (!mOwner
																																		.equals(tValue)) {
																																	if (!mOwner
																																			.equals(tAnnotationValue)) {
																																		if (!mOwner
																																				.equals(mValue)) {
																																			if (!tAnnotationValue
																																					.equals(tValue)) {
																																				if (!mValue
																																						.equals(tValue)) {
																																					if (!mValue
																																							.equals(tAnnotationValue)) {
																																						return new Object[] {
																																								ruleresult,
																																								annotation,
																																								annotationMemberValuePairToTAnnotationValue,
																																								mAnnotationValue,
																																								mTypeToTType,
																																								mArray,
																																								tValue,
																																								mOwner,
																																								tAnnotationValue,
																																								mValue };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationMemberValueNumberArray_1_3_bookkeepingforedges_greenBBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mAnnotationValue, EObject mTypeToTType, EObject mArray,
			EObject tValue, EObject tAnnotationValue, EObject mValue) {
		EMoflonEdge mArray__mValue____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mValue____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationValue__tValue____tValue = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationValue__mArray____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tValue____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationMemberValueNumberArray";
		String mArray__mValue____expressions_name_prime = "expressions";
		String mTypeToTType__mValue____source_name_prime = "source";
		String tAnnotationValue__tValue____tValue_name_prime = "tValue";
		String mAnnotationValue__mArray____value_name_prime = "value";
		String mTypeToTType__tValue____target_name_prime = "target";
		mArray__mValue____expressions.setSrc(mArray);
		mArray__mValue____expressions.setTrg(mValue);
		ruleresult.getTranslatedEdges().add(mArray__mValue____expressions);
		mTypeToTType__mValue____source.setSrc(mTypeToTType);
		mTypeToTType__mValue____source.setTrg(mValue);
		ruleresult.getCreatedEdges().add(mTypeToTType__mValue____source);
		tAnnotationValue__tValue____tValue.setSrc(tAnnotationValue);
		tAnnotationValue__tValue____tValue.setTrg(tValue);
		ruleresult.getCreatedEdges().add(tAnnotationValue__tValue____tValue);
		mAnnotationValue__mArray____value.setSrc(mAnnotationValue);
		mAnnotationValue__mArray____value.setTrg(mArray);
		ruleresult.getTranslatedEdges().add(mAnnotationValue__mArray____value);
		mTypeToTType__tValue____target.setSrc(mTypeToTType);
		mTypeToTType__tValue____target.setTrg(tValue);
		ruleresult.getCreatedEdges().add(mTypeToTType__tValue____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mArray__mValue____expressions.setName(mArray__mValue____expressions_name_prime);
		mTypeToTType__mValue____source.setName(mTypeToTType__mValue____source_name_prime);
		tAnnotationValue__tValue____tValue.setName(tAnnotationValue__tValue____tValue_name_prime);
		mAnnotationValue__mArray____value.setName(mAnnotationValue__mArray____value_name_prime);
		mTypeToTType__tValue____target.setName(mTypeToTType__tValue____target_name_prime);
		return new Object[] { ruleresult, mAnnotationValue, mTypeToTType, mArray, tValue, tAnnotationValue, mValue,
				mArray__mValue____expressions, mTypeToTType__mValue____source, tAnnotationValue__tValue____tValue,
				mAnnotationValue__mArray____value, mTypeToTType__tValue____target };
	}

	public static final void pattern_AnnotationMemberValueNumberArray_1_5_registerobjects_expressionBBBBBBBBBBB(
			AnnotationMemberValueNumberArray _this, PerformRuleResult ruleresult, EObject annotation,
			EObject annotationMemberValuePairToTAnnotationValue, EObject mAnnotationValue, EObject mTypeToTType,
			EObject mArray, EObject tValue, EObject mOwner, EObject tAnnotationValue, EObject mValue) {
		_this.registerObjects_FWD(ruleresult, annotation, annotationMemberValuePairToTAnnotationValue, mAnnotationValue,
				mTypeToTType, mArray, tValue, mOwner, tAnnotationValue, mValue);

	}

	public static final PerformRuleResult pattern_AnnotationMemberValueNumberArray_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_2_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueNumberArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationMemberValueNumberArray _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationMemberValueNumberArray _this) {
		Object[] result_pattern_AnnotationMemberValueNumberArray_2_1_preparereturnvalue_binding = pattern_AnnotationMemberValueNumberArray_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueNumberArray_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationMemberValueNumberArray_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueNumberArray_2_1_preparereturnvalue_black = pattern_AnnotationMemberValueNumberArray_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationMemberValueNumberArray_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationMemberValueNumberArray_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationMemberValueNumberArray";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("annotation");
		EObject _localVariable_1 = match.getObject("mAnnotationValue");
		EObject _localVariable_2 = match.getObject("mArray");
		EObject _localVariable_3 = match.getObject("mOwner");
		EObject _localVariable_4 = match.getObject("mValue");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpMAnnotationValue = _localVariable_1;
		EObject tmpMArray = _localVariable_2;
		EObject tmpMOwner = _localVariable_3;
		EObject tmpMValue = _localVariable_4;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
				AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
				if (tmpMArray instanceof ArrayInitializer) {
					ArrayInitializer mArray = (ArrayInitializer) tmpMArray;
					if (tmpMOwner instanceof BodyDeclaration) {
						BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
						if (tmpMValue instanceof NumberLiteral) {
							NumberLiteral mValue = (NumberLiteral) tmpMValue;
							return new Object[] { annotation, mAnnotationValue, mArray, mOwner, mValue, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueNumberArray_2_2_corematch_blackBFBBBFBB(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray,
			BodyDeclaration mOwner, NumberLiteral mValue, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue.class,
						"source")) {
			TAnnotationValue tAnnotationValue = annotationMemberValuePairToTAnnotationValue.getTarget();
			if (tAnnotationValue != null) {
				_result.add(new Object[] { annotation, annotationMemberValuePairToTAnnotationValue, mAnnotationValue,
						mArray, mOwner, tAnnotationValue, mValue, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueNumberArray_2_3_findcontext_blackBBBBBBB(
			Annotation annotation,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, NumberLiteral mValue) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getSource())) {
			if (tAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getTarget())) {
				if (mOwner.getAnnotations().contains(annotation)) {
					if (mArray.getExpressions().contains(mValue)) {
						if (annotation.getValues().contains(mAnnotationValue)) {
							if (mArray.equals(mAnnotationValue.getValue())) {
								_result.add(new Object[] { annotation, annotationMemberValuePairToTAnnotationValue,
										mAnnotationValue, mArray, mOwner, tAnnotationValue, mValue });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_2_3_findcontext_greenBBBBBBBFFFFFFF(
			Annotation annotation,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, NumberLiteral mValue) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mOwner__annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mArray__mValue____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__mAnnotationValue____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationValue__mArray____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source_name_prime = "source";
		String annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime = "target";
		String mOwner__annotation____annotations_name_prime = "annotations";
		String mArray__mValue____expressions_name_prime = "expressions";
		String annotation__mAnnotationValue____values_name_prime = "values";
		String mAnnotationValue__mArray____value_name_prime = "value";
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(annotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.getAllContextElements().add(mAnnotationValue);
		isApplicableMatch.getAllContextElements().add(mArray);
		isApplicableMatch.getAllContextElements().add(mOwner);
		isApplicableMatch.getAllContextElements().add(tAnnotationValue);
		isApplicableMatch.getAllContextElements().add(mValue);
		annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source
				.setSrc(annotationMemberValuePairToTAnnotationValue);
		annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source.setTrg(mAnnotationValue);
		isApplicableMatch.getAllContextElements()
				.add(annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setSrc(annotationMemberValuePairToTAnnotationValue);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target.setTrg(tAnnotationValue);
		isApplicableMatch.getAllContextElements()
				.add(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target);
		mOwner__annotation____annotations.setSrc(mOwner);
		mOwner__annotation____annotations.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(mOwner__annotation____annotations);
		mArray__mValue____expressions.setSrc(mArray);
		mArray__mValue____expressions.setTrg(mValue);
		isApplicableMatch.getAllContextElements().add(mArray__mValue____expressions);
		annotation__mAnnotationValue____values.setSrc(annotation);
		annotation__mAnnotationValue____values.setTrg(mAnnotationValue);
		isApplicableMatch.getAllContextElements().add(annotation__mAnnotationValue____values);
		mAnnotationValue__mArray____value.setSrc(mAnnotationValue);
		mAnnotationValue__mArray____value.setTrg(mArray);
		isApplicableMatch.getAllContextElements().add(mAnnotationValue__mArray____value);
		annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source
				.setName(annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source_name_prime);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setName(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime);
		mOwner__annotation____annotations.setName(mOwner__annotation____annotations_name_prime);
		mArray__mValue____expressions.setName(mArray__mValue____expressions_name_prime);
		annotation__mAnnotationValue____values.setName(annotation__mAnnotationValue____values_name_prime);
		mAnnotationValue__mArray____value.setName(mAnnotationValue__mArray____value_name_prime);
		return new Object[] { annotation, annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, mOwner,
				tAnnotationValue, mValue, isApplicableMatch,
				annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source,
				annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target,
				mOwner__annotation____annotations, mArray__mValue____expressions,
				annotation__mAnnotationValue____values, mAnnotationValue__mArray____value };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_2_4_solveCSP_bindingFBBBBBBBBB(
			AnnotationMemberValueNumberArray _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, NumberLiteral mValue) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, annotation,
				annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, mOwner, tAnnotationValue,
				mValue);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotation,
					annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, mOwner, tAnnotationValue,
					mValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			AnnotationMemberValueNumberArray _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, NumberLiteral mValue) {
		Object[] result_pattern_AnnotationMemberValueNumberArray_2_4_solveCSP_binding = pattern_AnnotationMemberValueNumberArray_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, annotation, annotationMemberValuePairToTAnnotationValue, mAnnotationValue,
				mArray, mOwner, tAnnotationValue, mValue);
		if (result_pattern_AnnotationMemberValueNumberArray_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueNumberArray_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueNumberArray_2_4_solveCSP_black = pattern_AnnotationMemberValueNumberArray_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueNumberArray_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotation,
						annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, mOwner, tAnnotationValue,
						mValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_2_5_checkCSP_expressionFBB(
			AnnotationMemberValueNumberArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationMemberValueNumberArray";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberValueNumberArray_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_10_1_initialbindings_blackBBBB(
			AnnotationMemberValueNumberArray _this, Match match, TNumberNode tValue,
			TAnnotationValue tAnnotationValue) {
		return new Object[] { _this, match, tValue, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_10_2_SolveCSP_bindingFBBBB(
			AnnotationMemberValueNumberArray _this, Match match, TNumberNode tValue,
			TAnnotationValue tAnnotationValue) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tValue, tAnnotationValue);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tValue, tAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_10_2_SolveCSP_bindingAndBlackFBBBB(
			AnnotationMemberValueNumberArray _this, Match match, TNumberNode tValue,
			TAnnotationValue tAnnotationValue) {
		Object[] result_pattern_AnnotationMemberValueNumberArray_10_2_SolveCSP_binding = pattern_AnnotationMemberValueNumberArray_10_2_SolveCSP_bindingFBBBB(
				_this, match, tValue, tAnnotationValue);
		if (result_pattern_AnnotationMemberValueNumberArray_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueNumberArray_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueNumberArray_10_2_SolveCSP_black = pattern_AnnotationMemberValueNumberArray_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueNumberArray_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tValue, tAnnotationValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_10_3_CheckCSP_expressionFBB(
			AnnotationMemberValueNumberArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_10_4_collectelementstobetranslated_blackBBB(
			Match match, TNumberNode tValue, TAnnotationValue tAnnotationValue) {
		return new Object[] { match, tValue, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_10_4_collectelementstobetranslated_greenBBBF(
			Match match, TNumberNode tValue, TAnnotationValue tAnnotationValue) {
		EMoflonEdge tAnnotationValue__tValue____tValue = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tValue);
		String tAnnotationValue__tValue____tValue_name_prime = "tValue";
		tAnnotationValue__tValue____tValue.setSrc(tAnnotationValue);
		tAnnotationValue__tValue____tValue.setTrg(tValue);
		match.getToBeTranslatedEdges().add(tAnnotationValue__tValue____tValue);
		tAnnotationValue__tValue____tValue.setName(tAnnotationValue__tValue____tValue_name_prime);
		return new Object[] { match, tValue, tAnnotationValue, tAnnotationValue__tValue____tValue };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_10_5_collectcontextelements_blackBBB(
			Match match, TNumberNode tValue, TAnnotationValue tAnnotationValue) {
		return new Object[] { match, tValue, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_10_5_collectcontextelements_greenBB(
			Match match, TAnnotationValue tAnnotationValue) {
		match.getContextNodes().add(tAnnotationValue);
		return new Object[] { match, tAnnotationValue };
	}

	public static final void pattern_AnnotationMemberValueNumberArray_10_6_registerobjectstomatch_expressionBBBB(
			AnnotationMemberValueNumberArray _this, Match match, TNumberNode tValue,
			TAnnotationValue tAnnotationValue) {
		_this.registerObjectsToMatch_BWD(match, tValue, tAnnotationValue);

	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("annotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("AnnotationMemberValuePairToTAnnotationValue");
		EObject _localVariable_2 = isApplicableMatch.getObject("mAnnotationValue");
		EObject _localVariable_3 = isApplicableMatch.getObject("tValue");
		EObject _localVariable_4 = isApplicableMatch.getObject("mOwner");
		EObject _localVariable_5 = isApplicableMatch.getObject("tAnnotationValue");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpAnnotationMemberValuePairToTAnnotationValue = _localVariable_1;
		EObject tmpMAnnotationValue = _localVariable_2;
		EObject tmpTValue = _localVariable_3;
		EObject tmpMOwner = _localVariable_4;
		EObject tmpTAnnotationValue = _localVariable_5;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpAnnotationMemberValuePairToTAnnotationValue instanceof AnnotationMemberValuePairToTAnnotationValue) {
				AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) tmpAnnotationMemberValuePairToTAnnotationValue;
				if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
					AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
					if (tmpTValue instanceof TNumberNode) {
						TNumberNode tValue = (TNumberNode) tmpTValue;
						if (tmpMOwner instanceof BodyDeclaration) {
							BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
							if (tmpTAnnotationValue instanceof TAnnotationValue) {
								TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
								return new Object[] { annotation, annotationMemberValuePairToTAnnotationValue,
										mAnnotationValue, tValue, mOwner, tAnnotationValue, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_blackBBBBBBFBB(
			Annotation annotation,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, TNumberNode tValue, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue, AnnotationMemberValueNumberArray _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { annotation, annotationMemberValuePairToTAnnotationValue, mAnnotationValue, tValue,
						mOwner, tAnnotationValue, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			AnnotationMemberValueNumberArray _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_binding = pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_binding != null) {
			Annotation annotation = (Annotation) result_pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_binding[0];
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result_pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_binding[1];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_binding[2];
			TNumberNode tValue = (TNumberNode) result_pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_binding[3];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_binding[4];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_binding[5];

			Object[] result_pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_black = pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_blackBBBBBBFBB(
					annotation, annotationMemberValuePairToTAnnotationValue, mAnnotationValue, tValue, mOwner,
					tAnnotationValue, _this, isApplicableMatch);
			if (result_pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_black[6];

				return new Object[] { annotation, annotationMemberValuePairToTAnnotationValue, mAnnotationValue, tValue,
						mOwner, tAnnotationValue, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_11_1_performtransformation_greenBFFBFB(
			AnnotationMemberValuePair mAnnotationValue, TNumberNode tValue, CSP csp) {
		LiteralToTNode mTypeToTType = PmFactory.eINSTANCE.createLiteralToTNode();
		ArrayInitializer mArray = JavaFactory.eINSTANCE.createArrayInitializer();
		NumberLiteral mValue = JavaFactory.eINSTANCE.createNumberLiteral();
		Object _localVariable_0 = csp.getValue("mValue", "tokenValue");
		mTypeToTType.setTarget(tValue);
		mAnnotationValue.setValue(mArray);
		mArray.getExpressions().add(mValue);
		mTypeToTType.setSource(mValue);
		String mValue_tokenValue_prime = (String) _localVariable_0;
		mValue.setTokenValue(mValue_tokenValue_prime);
		return new Object[] { mAnnotationValue, mTypeToTType, mArray, tValue, mValue, csp };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_11_2_collecttranslatedelements_blackBBBB(
			LiteralToTNode mTypeToTType, ArrayInitializer mArray, TNumberNode tValue, NumberLiteral mValue) {
		return new Object[] { mTypeToTType, mArray, tValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_11_2_collecttranslatedelements_greenFBBBB(
			LiteralToTNode mTypeToTType, ArrayInitializer mArray, TNumberNode tValue, NumberLiteral mValue) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getCreatedElements().add(mArray);
		ruleresult.getTranslatedElements().add(tValue);
		ruleresult.getCreatedElements().add(mValue);
		return new Object[] { ruleresult, mTypeToTType, mArray, tValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject annotation, EObject annotationMemberValuePairToTAnnotationValue,
			EObject mAnnotationValue, EObject mTypeToTType, EObject mArray, EObject tValue, EObject mOwner,
			EObject tAnnotationValue, EObject mValue) {
		if (!annotation.equals(mAnnotationValue)) {
			if (!annotation.equals(mTypeToTType)) {
				if (!annotation.equals(mArray)) {
					if (!annotation.equals(tValue)) {
						if (!annotation.equals(mOwner)) {
							if (!annotation.equals(tAnnotationValue)) {
								if (!annotation.equals(mValue)) {
									if (!annotationMemberValuePairToTAnnotationValue.equals(annotation)) {
										if (!annotationMemberValuePairToTAnnotationValue.equals(mAnnotationValue)) {
											if (!annotationMemberValuePairToTAnnotationValue.equals(mTypeToTType)) {
												if (!annotationMemberValuePairToTAnnotationValue.equals(mArray)) {
													if (!annotationMemberValuePairToTAnnotationValue.equals(tValue)) {
														if (!annotationMemberValuePairToTAnnotationValue
																.equals(mOwner)) {
															if (!annotationMemberValuePairToTAnnotationValue
																	.equals(tAnnotationValue)) {
																if (!annotationMemberValuePairToTAnnotationValue
																		.equals(mValue)) {
																	if (!mAnnotationValue.equals(mTypeToTType)) {
																		if (!mAnnotationValue.equals(mArray)) {
																			if (!mAnnotationValue.equals(tValue)) {
																				if (!mAnnotationValue.equals(mOwner)) {
																					if (!mAnnotationValue
																							.equals(tAnnotationValue)) {
																						if (!mAnnotationValue
																								.equals(mValue)) {
																							if (!mTypeToTType
																									.equals(tValue)) {
																								if (!mTypeToTType
																										.equals(tAnnotationValue)) {
																									if (!mTypeToTType
																											.equals(mValue)) {
																										if (!mArray
																												.equals(mTypeToTType)) {
																											if (!mArray
																													.equals(tValue)) {
																												if (!mArray
																														.equals(mOwner)) {
																													if (!mArray
																															.equals(tAnnotationValue)) {
																														if (!mArray
																																.equals(mValue)) {
																															if (!mOwner
																																	.equals(mTypeToTType)) {
																																if (!mOwner
																																		.equals(tValue)) {
																																	if (!mOwner
																																			.equals(tAnnotationValue)) {
																																		if (!mOwner
																																				.equals(mValue)) {
																																			if (!tAnnotationValue
																																					.equals(tValue)) {
																																				if (!mValue
																																						.equals(tValue)) {
																																					if (!mValue
																																							.equals(tAnnotationValue)) {
																																						return new Object[] {
																																								ruleresult,
																																								annotation,
																																								annotationMemberValuePairToTAnnotationValue,
																																								mAnnotationValue,
																																								mTypeToTType,
																																								mArray,
																																								tValue,
																																								mOwner,
																																								tAnnotationValue,
																																								mValue };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationMemberValueNumberArray_11_3_bookkeepingforedges_greenBBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mAnnotationValue, EObject mTypeToTType, EObject mArray,
			EObject tValue, EObject tAnnotationValue, EObject mValue) {
		EMoflonEdge mArray__mValue____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mValue____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationValue__tValue____tValue = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationValue__mArray____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tValue____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationMemberValueNumberArray";
		String mArray__mValue____expressions_name_prime = "expressions";
		String mTypeToTType__mValue____source_name_prime = "source";
		String tAnnotationValue__tValue____tValue_name_prime = "tValue";
		String mAnnotationValue__mArray____value_name_prime = "value";
		String mTypeToTType__tValue____target_name_prime = "target";
		mArray__mValue____expressions.setSrc(mArray);
		mArray__mValue____expressions.setTrg(mValue);
		ruleresult.getCreatedEdges().add(mArray__mValue____expressions);
		mTypeToTType__mValue____source.setSrc(mTypeToTType);
		mTypeToTType__mValue____source.setTrg(mValue);
		ruleresult.getCreatedEdges().add(mTypeToTType__mValue____source);
		tAnnotationValue__tValue____tValue.setSrc(tAnnotationValue);
		tAnnotationValue__tValue____tValue.setTrg(tValue);
		ruleresult.getTranslatedEdges().add(tAnnotationValue__tValue____tValue);
		mAnnotationValue__mArray____value.setSrc(mAnnotationValue);
		mAnnotationValue__mArray____value.setTrg(mArray);
		ruleresult.getCreatedEdges().add(mAnnotationValue__mArray____value);
		mTypeToTType__tValue____target.setSrc(mTypeToTType);
		mTypeToTType__tValue____target.setTrg(tValue);
		ruleresult.getCreatedEdges().add(mTypeToTType__tValue____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mArray__mValue____expressions.setName(mArray__mValue____expressions_name_prime);
		mTypeToTType__mValue____source.setName(mTypeToTType__mValue____source_name_prime);
		tAnnotationValue__tValue____tValue.setName(tAnnotationValue__tValue____tValue_name_prime);
		mAnnotationValue__mArray____value.setName(mAnnotationValue__mArray____value_name_prime);
		mTypeToTType__tValue____target.setName(mTypeToTType__tValue____target_name_prime);
		return new Object[] { ruleresult, mAnnotationValue, mTypeToTType, mArray, tValue, tAnnotationValue, mValue,
				mArray__mValue____expressions, mTypeToTType__mValue____source, tAnnotationValue__tValue____tValue,
				mAnnotationValue__mArray____value, mTypeToTType__tValue____target };
	}

	public static final void pattern_AnnotationMemberValueNumberArray_11_5_registerobjects_expressionBBBBBBBBBBB(
			AnnotationMemberValueNumberArray _this, PerformRuleResult ruleresult, EObject annotation,
			EObject annotationMemberValuePairToTAnnotationValue, EObject mAnnotationValue, EObject mTypeToTType,
			EObject mArray, EObject tValue, EObject mOwner, EObject tAnnotationValue, EObject mValue) {
		_this.registerObjects_BWD(ruleresult, annotation, annotationMemberValuePairToTAnnotationValue, mAnnotationValue,
				mTypeToTType, mArray, tValue, mOwner, tAnnotationValue, mValue);

	}

	public static final PerformRuleResult pattern_AnnotationMemberValueNumberArray_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_12_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueNumberArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_12_1_preparereturnvalue_blackFBB(
			EClass eClass, AnnotationMemberValueNumberArray _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationMemberValueNumberArray _this) {
		Object[] result_pattern_AnnotationMemberValueNumberArray_12_1_preparereturnvalue_binding = pattern_AnnotationMemberValueNumberArray_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueNumberArray_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationMemberValueNumberArray_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueNumberArray_12_1_preparereturnvalue_black = pattern_AnnotationMemberValueNumberArray_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationMemberValueNumberArray_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationMemberValueNumberArray_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationMemberValueNumberArray";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tValue");
		EObject _localVariable_1 = match.getObject("tAnnotationValue");
		EObject tmpTValue = _localVariable_0;
		EObject tmpTAnnotationValue = _localVariable_1;
		if (tmpTValue instanceof TNumberNode) {
			TNumberNode tValue = (TNumberNode) tmpTValue;
			if (tmpTAnnotationValue instanceof TAnnotationValue) {
				TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
				return new Object[] { tValue, tAnnotationValue, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueNumberArray_12_2_corematch_blackFFBBB(
			TNumberNode tValue, TAnnotationValue tAnnotationValue, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnnotationValue, AnnotationMemberValuePairToTAnnotationValue.class,
						"target")) {
			AnnotationMemberValuePair mAnnotationValue = annotationMemberValuePairToTAnnotationValue.getSource();
			if (mAnnotationValue != null) {
				_result.add(new Object[] { annotationMemberValuePairToTAnnotationValue, mAnnotationValue, tValue,
						tAnnotationValue, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueNumberArray_12_3_findcontext_blackFBBBFB(
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, TNumberNode tValue, TAnnotationValue tAnnotationValue) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getSource())) {
			if (tAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getTarget())) {
				if (tAnnotationValue.getTValue().contains(tValue)) {
					for (Annotation annotation : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mAnnotationValue, Annotation.class, "values")) {
						for (BodyDeclaration mOwner : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(annotation, BodyDeclaration.class, "annotations")) {
							_result.add(new Object[] { annotation, annotationMemberValuePairToTAnnotationValue,
									mAnnotationValue, tValue, mOwner, tAnnotationValue });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_12_3_findcontext_greenBBBBBBFFFFFF(
			Annotation annotation,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, TNumberNode tValue, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mOwner__annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__mAnnotationValue____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationValue__tValue____tValue = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source_name_prime = "source";
		String annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime = "target";
		String mOwner__annotation____annotations_name_prime = "annotations";
		String annotation__mAnnotationValue____values_name_prime = "values";
		String tAnnotationValue__tValue____tValue_name_prime = "tValue";
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(annotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.getAllContextElements().add(mAnnotationValue);
		isApplicableMatch.getAllContextElements().add(tValue);
		isApplicableMatch.getAllContextElements().add(mOwner);
		isApplicableMatch.getAllContextElements().add(tAnnotationValue);
		annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source
				.setSrc(annotationMemberValuePairToTAnnotationValue);
		annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source.setTrg(mAnnotationValue);
		isApplicableMatch.getAllContextElements()
				.add(annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setSrc(annotationMemberValuePairToTAnnotationValue);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target.setTrg(tAnnotationValue);
		isApplicableMatch.getAllContextElements()
				.add(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target);
		mOwner__annotation____annotations.setSrc(mOwner);
		mOwner__annotation____annotations.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(mOwner__annotation____annotations);
		annotation__mAnnotationValue____values.setSrc(annotation);
		annotation__mAnnotationValue____values.setTrg(mAnnotationValue);
		isApplicableMatch.getAllContextElements().add(annotation__mAnnotationValue____values);
		tAnnotationValue__tValue____tValue.setSrc(tAnnotationValue);
		tAnnotationValue__tValue____tValue.setTrg(tValue);
		isApplicableMatch.getAllContextElements().add(tAnnotationValue__tValue____tValue);
		annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source
				.setName(annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source_name_prime);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setName(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime);
		mOwner__annotation____annotations.setName(mOwner__annotation____annotations_name_prime);
		annotation__mAnnotationValue____values.setName(annotation__mAnnotationValue____values_name_prime);
		tAnnotationValue__tValue____tValue.setName(tAnnotationValue__tValue____tValue_name_prime);
		return new Object[] { annotation, annotationMemberValuePairToTAnnotationValue, mAnnotationValue, tValue, mOwner,
				tAnnotationValue, isApplicableMatch,
				annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source,
				annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target,
				mOwner__annotation____annotations, annotation__mAnnotationValue____values,
				tAnnotationValue__tValue____tValue };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_12_4_solveCSP_bindingFBBBBBBBB(
			AnnotationMemberValueNumberArray _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, TNumberNode tValue, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, annotation,
				annotationMemberValuePairToTAnnotationValue, mAnnotationValue, tValue, mOwner, tAnnotationValue);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotation,
					annotationMemberValuePairToTAnnotationValue, mAnnotationValue, tValue, mOwner, tAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			AnnotationMemberValueNumberArray _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, TNumberNode tValue, BodyDeclaration mOwner,
			TAnnotationValue tAnnotationValue) {
		Object[] result_pattern_AnnotationMemberValueNumberArray_12_4_solveCSP_binding = pattern_AnnotationMemberValueNumberArray_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, annotation, annotationMemberValuePairToTAnnotationValue, mAnnotationValue,
				tValue, mOwner, tAnnotationValue);
		if (result_pattern_AnnotationMemberValueNumberArray_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueNumberArray_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueNumberArray_12_4_solveCSP_black = pattern_AnnotationMemberValueNumberArray_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueNumberArray_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotation,
						annotationMemberValuePairToTAnnotationValue, mAnnotationValue, tValue, mOwner,
						tAnnotationValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_12_5_checkCSP_expressionFBB(
			AnnotationMemberValueNumberArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationMemberValueNumberArray";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberValueNumberArray_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_20_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueNumberArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, AnnotationMemberValueNumberArray _this) {
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

	public static final Object[] pattern_AnnotationMemberValueNumberArray_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationMemberValueNumberArray _this) {
		Object[] result_pattern_AnnotationMemberValueNumberArray_20_1_preparereturnvalue_binding = pattern_AnnotationMemberValueNumberArray_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueNumberArray_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationMemberValueNumberArray_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueNumberArray_20_1_preparereturnvalue_black = pattern_AnnotationMemberValueNumberArray_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationMemberValueNumberArray_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationMemberValueNumberArray_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationMemberValueNumberArray_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueNumberArray_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_tValue) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTAnnotationValue = _edge_tValue.getSrc();
		if (tmpTAnnotationValue instanceof TAnnotationValue) {
			TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
			EObject tmpTValue = _edge_tValue.getTrg();
			if (tmpTValue instanceof TNumberNode) {
				TNumberNode tValue = (TNumberNode) tmpTValue;
				if (tAnnotationValue.getTValue().contains(tValue)) {
					_result.add(new Object[] { tValue, tAnnotationValue, _edge_tValue });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			AnnotationMemberValueNumberArray _this, Match match, TNumberNode tValue,
			TAnnotationValue tAnnotationValue) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tValue, tAnnotationValue);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationMemberValueNumberArray _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationMemberValueNumberArray_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_21_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueNumberArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, AnnotationMemberValueNumberArray _this) {
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

	public static final Object[] pattern_AnnotationMemberValueNumberArray_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationMemberValueNumberArray _this) {
		Object[] result_pattern_AnnotationMemberValueNumberArray_21_1_preparereturnvalue_binding = pattern_AnnotationMemberValueNumberArray_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueNumberArray_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationMemberValueNumberArray_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueNumberArray_21_1_preparereturnvalue_black = pattern_AnnotationMemberValueNumberArray_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationMemberValueNumberArray_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationMemberValueNumberArray_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationMemberValueNumberArray_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_21_2_testcorematchandDECs_black_nac_0BB(
			NumberLiteral mValue, AnnotationMemberValuePair mAnnotationValue) {
		for (AnnotationMemberValuePair __DEC_mValue_value_743016 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mValue, AnnotationMemberValuePair.class, "value")) {
			if (!mAnnotationValue.equals(__DEC_mValue_value_743016)) {
				return new Object[] { mValue, mAnnotationValue };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_21_2_testcorematchandDECs_black_nac_1BB(
			AnnotationMemberValuePair mAnnotationValue, NumberLiteral mValue) {
		if (mValue.equals(mAnnotationValue.getValue())) {
			return new Object[] { mAnnotationValue, mValue };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueNumberArray_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_expressions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMArray = _edge_expressions.getSrc();
		if (tmpMArray instanceof ArrayInitializer) {
			ArrayInitializer mArray = (ArrayInitializer) tmpMArray;
			EObject tmpMValue = _edge_expressions.getTrg();
			if (tmpMValue instanceof NumberLiteral) {
				NumberLiteral mValue = (NumberLiteral) tmpMValue;
				if (mArray.getExpressions().contains(mValue)) {
					for (AnnotationMemberValuePair mAnnotationValue : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mArray, AnnotationMemberValuePair.class, "value")) {
						if (pattern_AnnotationMemberValueNumberArray_21_2_testcorematchandDECs_black_nac_0BB(mValue,
								mAnnotationValue) == null) {
							if (pattern_AnnotationMemberValueNumberArray_21_2_testcorematchandDECs_black_nac_1BB(
									mAnnotationValue, mValue) == null) {
								for (Annotation annotation : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(mAnnotationValue, Annotation.class, "values")) {
									for (BodyDeclaration mOwner : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(annotation, BodyDeclaration.class,
													"annotations")) {
										_result.add(new Object[] { annotation, mAnnotationValue, mArray, mOwner, mValue,
												_edge_expressions });
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

	public static final Object[] pattern_AnnotationMemberValueNumberArray_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			AnnotationMemberValueNumberArray _this, Match match, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, BodyDeclaration mOwner,
			NumberLiteral mValue) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, annotation, mAnnotationValue, mArray, mOwner, mValue);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationMemberValueNumberArray _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationMemberValueNumberArray_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_24_1_prepare_blackB(
			AnnotationMemberValueNumberArray _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("annotation");
		EObject _localVariable_1 = sourceMatch.getObject("mAnnotationValue");
		EObject _localVariable_2 = sourceMatch.getObject("mArray");
		EObject _localVariable_3 = targetMatch.getObject("tValue");
		EObject _localVariable_4 = sourceMatch.getObject("mOwner");
		EObject _localVariable_5 = targetMatch.getObject("tAnnotationValue");
		EObject _localVariable_6 = sourceMatch.getObject("mValue");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpMAnnotationValue = _localVariable_1;
		EObject tmpMArray = _localVariable_2;
		EObject tmpTValue = _localVariable_3;
		EObject tmpMOwner = _localVariable_4;
		EObject tmpTAnnotationValue = _localVariable_5;
		EObject tmpMValue = _localVariable_6;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
				AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
				if (tmpMArray instanceof ArrayInitializer) {
					ArrayInitializer mArray = (ArrayInitializer) tmpMArray;
					if (tmpTValue instanceof TNumberNode) {
						TNumberNode tValue = (TNumberNode) tmpTValue;
						if (tmpMOwner instanceof BodyDeclaration) {
							BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
							if (tmpTAnnotationValue instanceof TAnnotationValue) {
								TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
								if (tmpMValue instanceof NumberLiteral) {
									NumberLiteral mValue = (NumberLiteral) tmpMValue;
									return new Object[] { annotation, mAnnotationValue, mArray, tValue, mOwner,
											tAnnotationValue, mValue, sourceMatch, targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray,
			TNumberNode tValue, BodyDeclaration mOwner, TAnnotationValue tAnnotationValue, NumberLiteral mValue,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { annotation, mAnnotationValue, mArray, tValue, mOwner, tAnnotationValue, mValue,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationMemberValueNumberArray_24_2_matchsrctrgcontext_binding = pattern_AnnotationMemberValueNumberArray_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_AnnotationMemberValueNumberArray_24_2_matchsrctrgcontext_binding != null) {
			Annotation annotation = (Annotation) result_pattern_AnnotationMemberValueNumberArray_24_2_matchsrctrgcontext_binding[0];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberValueNumberArray_24_2_matchsrctrgcontext_binding[1];
			ArrayInitializer mArray = (ArrayInitializer) result_pattern_AnnotationMemberValueNumberArray_24_2_matchsrctrgcontext_binding[2];
			TNumberNode tValue = (TNumberNode) result_pattern_AnnotationMemberValueNumberArray_24_2_matchsrctrgcontext_binding[3];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberValueNumberArray_24_2_matchsrctrgcontext_binding[4];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberValueNumberArray_24_2_matchsrctrgcontext_binding[5];
			NumberLiteral mValue = (NumberLiteral) result_pattern_AnnotationMemberValueNumberArray_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_AnnotationMemberValueNumberArray_24_2_matchsrctrgcontext_black = pattern_AnnotationMemberValueNumberArray_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					annotation, mAnnotationValue, mArray, tValue, mOwner, tAnnotationValue, mValue, sourceMatch,
					targetMatch);
			if (result_pattern_AnnotationMemberValueNumberArray_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { annotation, mAnnotationValue, mArray, tValue, mOwner, tAnnotationValue, mValue,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_24_3_solvecsp_bindingFBBBBBBBBBB(
			AnnotationMemberValueNumberArray _this, Annotation annotation, AnnotationMemberValuePair mAnnotationValue,
			ArrayInitializer mArray, TNumberNode tValue, BodyDeclaration mOwner, TAnnotationValue tAnnotationValue,
			NumberLiteral mValue, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(annotation, mAnnotationValue, mArray, tValue, mOwner,
				tAnnotationValue, mValue, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, annotation, mAnnotationValue, mArray, tValue, mOwner, tAnnotationValue,
					mValue, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			AnnotationMemberValueNumberArray _this, Annotation annotation, AnnotationMemberValuePair mAnnotationValue,
			ArrayInitializer mArray, TNumberNode tValue, BodyDeclaration mOwner, TAnnotationValue tAnnotationValue,
			NumberLiteral mValue, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationMemberValueNumberArray_24_3_solvecsp_binding = pattern_AnnotationMemberValueNumberArray_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, annotation, mAnnotationValue, mArray, tValue, mOwner, tAnnotationValue, mValue, sourceMatch,
				targetMatch);
		if (result_pattern_AnnotationMemberValueNumberArray_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueNumberArray_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnnotationMemberValueNumberArray_24_3_solvecsp_black = pattern_AnnotationMemberValueNumberArray_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueNumberArray_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, annotation, mAnnotationValue, mArray, tValue, mOwner,
						tAnnotationValue, mValue, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueNumberArray_24_5_matchcorrcontext_blackFBBBB(
			AnnotationMemberValuePair mAnnotationValue, TAnnotationValue tAnnotationValue, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue.class,
							"source")) {
				if (tAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getTarget())) {
					_result.add(new Object[] { annotationMemberValuePairToTAnnotationValue, mAnnotationValue,
							tAnnotationValue, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_24_5_matchcorrcontext_greenBBBF(
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnnotationMemberValueNumberArray";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(annotationMemberValuePairToTAnnotationValue);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { annotationMemberValuePairToTAnnotationValue, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_24_6_createcorrespondence_blackBBBBBBBB(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray,
			TNumberNode tValue, BodyDeclaration mOwner, TAnnotationValue tAnnotationValue, NumberLiteral mValue,
			CCMatch ccMatch) {
		return new Object[] { annotation, mAnnotationValue, mArray, tValue, mOwner, tAnnotationValue, mValue, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_24_6_createcorrespondence_greenFBBB(
			TNumberNode tValue, NumberLiteral mValue, CCMatch ccMatch) {
		LiteralToTNode mTypeToTType = PmFactory.eINSTANCE.createLiteralToTNode();
		mTypeToTType.setSource(mValue);
		mTypeToTType.setTarget(tValue);
		ccMatch.getCreateCorr().add(mTypeToTType);
		return new Object[] { mTypeToTType, tValue, mValue, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnnotationMemberValueNumberArray";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberValueNumberArray_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_27_1_matchtggpattern_black_nac_0BB(
			NumberLiteral mValue, AnnotationMemberValuePair mAnnotationValue) {
		for (AnnotationMemberValuePair __DEC_mValue_value_399481 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mValue, AnnotationMemberValuePair.class, "value")) {
			if (!mAnnotationValue.equals(__DEC_mValue_value_399481)) {
				return new Object[] { mValue, mAnnotationValue };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_27_1_matchtggpattern_black_nac_1BB(
			AnnotationMemberValuePair mAnnotationValue, NumberLiteral mValue) {
		if (mValue.equals(mAnnotationValue.getValue())) {
			return new Object[] { mAnnotationValue, mValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_27_1_matchtggpattern_blackBBBBB(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray,
			BodyDeclaration mOwner, NumberLiteral mValue) {
		if (mOwner.getAnnotations().contains(annotation)) {
			if (mArray.getExpressions().contains(mValue)) {
				if (annotation.getValues().contains(mAnnotationValue)) {
					if (mArray.equals(mAnnotationValue.getValue())) {
						if (pattern_AnnotationMemberValueNumberArray_27_1_matchtggpattern_black_nac_0BB(mValue,
								mAnnotationValue) == null) {
							if (pattern_AnnotationMemberValueNumberArray_27_1_matchtggpattern_black_nac_1BB(
									mAnnotationValue, mValue) == null) {
								return new Object[] { annotation, mAnnotationValue, mArray, mOwner, mValue };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_28_1_matchtggpattern_blackBB(
			TNumberNode tValue, TAnnotationValue tAnnotationValue) {
		if (tAnnotationValue.getTValue().contains(tValue)) {
			return new Object[] { tValue, tAnnotationValue };
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_29_1_createresult_blackB(
			AnnotationMemberValueNumberArray _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Annotation annotation) {
		if (ruleResult.getSourceObjects().contains(annotation)) {
			return new Object[] { ruleResult, annotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, AnnotationMemberValuePair mAnnotationValue) {
		if (ruleResult.getSourceObjects().contains(mAnnotationValue)) {
			return new Object[] { ruleResult, mAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue) {
		if (ruleResult.getCorrObjects().contains(annotationMemberValuePairToTAnnotationValue)) {
			return new Object[] { ruleResult, annotationMemberValuePairToTAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TAnnotationValue tAnnotationValue) {
		if (ruleResult.getTargetObjects().contains(tAnnotationValue)) {
			return new Object[] { ruleResult, tAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, BodyDeclaration mOwner) {
		if (ruleResult.getSourceObjects().contains(mOwner)) {
			return new Object[] { ruleResult, mOwner };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueNumberArray_29_2_isapplicablecore_blackFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList annotationMemberValuePairToTAnnotationValueList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpAnnotationMemberValuePairToTAnnotationValue : annotationMemberValuePairToTAnnotationValueList
					.getEntryObjects()) {
				if (tmpAnnotationMemberValuePairToTAnnotationValue instanceof AnnotationMemberValuePairToTAnnotationValue) {
					AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) tmpAnnotationMemberValuePairToTAnnotationValue;
					AnnotationMemberValuePair mAnnotationValue = annotationMemberValuePairToTAnnotationValue
							.getSource();
					if (mAnnotationValue != null) {
						TAnnotationValue tAnnotationValue = annotationMemberValuePairToTAnnotationValue.getTarget();
						if (tAnnotationValue != null) {
							if (pattern_AnnotationMemberValueNumberArray_29_2_isapplicablecore_black_nac_2BB(ruleResult,
									annotationMemberValuePairToTAnnotationValue) == null) {
								if (pattern_AnnotationMemberValueNumberArray_29_2_isapplicablecore_black_nac_1BB(
										ruleResult, mAnnotationValue) == null) {
									if (pattern_AnnotationMemberValueNumberArray_29_2_isapplicablecore_black_nac_3BB(
											ruleResult, tAnnotationValue) == null) {
										for (Annotation annotation : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(mAnnotationValue, Annotation.class,
														"values")) {
											if (pattern_AnnotationMemberValueNumberArray_29_2_isapplicablecore_black_nac_0BB(
													ruleResult, annotation) == null) {
												for (BodyDeclaration mOwner : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(annotation, BodyDeclaration.class,
																"annotations")) {
													if (pattern_AnnotationMemberValueNumberArray_29_2_isapplicablecore_black_nac_4BB(
															ruleResult, mOwner) == null) {
														_result.add(new Object[] {
																annotationMemberValuePairToTAnnotationValueList,
																annotation, mAnnotationValue,
																annotationMemberValuePairToTAnnotationValue,
																tAnnotationValue, mOwner, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_29_3_solveCSP_bindingFBBBBBBBB(
			AnnotationMemberValueNumberArray _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, TAnnotationValue tAnnotationValue,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, annotation,
				annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mOwner, tAnnotationValue, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotation,
					annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mOwner, tAnnotationValue,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_29_3_solveCSP_bindingAndBlackFBBBBBBBB(
			AnnotationMemberValueNumberArray _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, TAnnotationValue tAnnotationValue,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnnotationMemberValueNumberArray_29_3_solveCSP_binding = pattern_AnnotationMemberValueNumberArray_29_3_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, annotation, annotationMemberValuePairToTAnnotationValue, mAnnotationValue,
				mOwner, tAnnotationValue, ruleResult);
		if (result_pattern_AnnotationMemberValueNumberArray_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueNumberArray_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueNumberArray_29_3_solveCSP_black = pattern_AnnotationMemberValueNumberArray_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueNumberArray_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotation,
						annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mOwner, tAnnotationValue,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueNumberArray_29_4_checkCSP_expressionFBB(
			AnnotationMemberValueNumberArray _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_29_5_checknacs_blackBBBBB(
			Annotation annotation,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, TAnnotationValue tAnnotationValue) {
		return new Object[] { annotation, annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mOwner,
				tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_29_6_perform_blackBBBBBB(
			Annotation annotation,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, TAnnotationValue tAnnotationValue,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { annotation, annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mOwner,
				tAnnotationValue, ruleResult };
	}

	public static final Object[] pattern_AnnotationMemberValueNumberArray_29_6_perform_greenBFFFBFBB(
			AnnotationMemberValuePair mAnnotationValue, TAnnotationValue tAnnotationValue,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		LiteralToTNode mTypeToTType = PmFactory.eINSTANCE.createLiteralToTNode();
		ArrayInitializer mArray = JavaFactory.eINSTANCE.createArrayInitializer();
		TNumberNode tValue = AnnotationsFactory.eINSTANCE.createTNumberNode();
		NumberLiteral mValue = JavaFactory.eINSTANCE.createNumberLiteral();
		Object _localVariable_0 = csp.getValue("tValue", "tNumber");
		Object _localVariable_1 = csp.getValue("mValue", "tokenValue");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mTypeToTType);
		mAnnotationValue.setValue(mArray);
		ruleResult.getSourceObjects().add(mArray);
		tAnnotationValue.getTValue().add(tValue);
		mTypeToTType.setTarget(tValue);
		ruleResult.getTargetObjects().add(tValue);
		mArray.getExpressions().add(mValue);
		mTypeToTType.setSource(mValue);
		ruleResult.getSourceObjects().add(mValue);
		String tValue_tNumber_prime = (String) _localVariable_0;
		String mValue_tokenValue_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		tValue.setTNumber(tValue_tNumber_prime);
		mValue.setTokenValue(mValue_tokenValue_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mAnnotationValue, mTypeToTType, mArray, tValue, tAnnotationValue, mValue, ruleResult,
				csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationMemberValueNumberArray_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationMemberValueNumberArrayImpl
