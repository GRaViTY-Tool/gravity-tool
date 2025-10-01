/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.StringLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.AnnotationMemberValuePairToTAnnotationValue;
import org.gravity.tgg.modisco.pm.LiteralToTNode;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueStringArray;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotationValue;
import org.gravity.typegraph.basic.annotations.TTextNode;

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
 * An implementation of the model object '<em><b>Annotation Member Value String Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotationMemberValueStringArrayImpl extends AbstractRuleImpl implements AnnotationMemberValueStringArray {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationMemberValueStringArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnnotationMemberValueStringArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray,
			StringLiteral mValue) {

		Object[] result1_black = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_0_1_initialbindings_blackBBBBB(this, match, mAnnotationValue,
						mArray, mValue);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mArray] = "
					+ mArray + ", " + "[mValue] = " + mValue + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
						mAnnotationValue, mArray, mValue);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mArray] = "
					+ mArray + ", " + "[mValue] = " + mValue + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_0_4_collectelementstobetranslated_blackBBBB(match,
							mAnnotationValue, mArray, mValue);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mArray] = " + mArray + ", "
						+ "[mValue] = " + mValue + ".");
			}
			AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_0_4_collectelementstobetranslated_greenBBBF(match, mArray,
							mValue);
			//nothing EMoflonEdge mArray__mValue____expressions = (EMoflonEdge) result4_green[3];

			Object[] result5_black = AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_0_5_collectcontextelements_blackBBBB(match,
							mAnnotationValue, mArray, mValue);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mArray] = " + mArray + ", "
						+ "[mValue] = " + mValue + ".");
			}
			AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_0_5_collectcontextelements_greenBBBF(match,
							mAnnotationValue, mArray);
			//nothing EMoflonEdge mAnnotationValue__mArray____value = (EMoflonEdge) result5_green[3];

			// 
			AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_0_6_registerobjectstomatch_expressionBBBBB(this, match,
							mAnnotationValue, mArray, mValue);
			return AnnotationMemberValueStringArrayImpl.pattern_AnnotationMemberValueStringArray_0_7_expressionF();
		} else {
			return AnnotationMemberValueStringArrayImpl.pattern_AnnotationMemberValueStringArray_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result1_bindingAndBlack[0];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result1_bindingAndBlack[1];
		ArrayInitializer mArray = (ArrayInitializer) result1_bindingAndBlack[2];
		StringLiteral mValue = (StringLiteral) result1_bindingAndBlack[3];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_1_1_performtransformation_greenFFBBB(mValue, tAnnotationValue,
						csp);
		LiteralToTNode mTypeToTType = (LiteralToTNode) result1_green[0];
		TTextNode tValue = (TTextNode) result1_green[1];

		Object[] result2_black = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_1_2_collecttranslatedelements_blackBBB(mTypeToTType, tValue,
						mValue);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = " + mTypeToTType
					+ ", " + "[tValue] = " + tValue + ", " + "[mValue] = " + mValue + ".");
		}
		Object[] result2_green = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_1_2_collecttranslatedelements_greenFBBB(mTypeToTType, tValue,
						mValue);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult,
						AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mTypeToTType, mArray, tValue,
						mValue, tAnnotationValue);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[AnnotationMemberValuePairToTAnnotationValue] = "
					+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mAnnotationValue] = " + mAnnotationValue
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mArray] = " + mArray + ", " + "[tValue] = "
					+ tValue + ", " + "[mValue] = " + mValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ".");
		}
		AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult,
						mTypeToTType, mArray, tValue, mValue, tAnnotationValue);
		//nothing EMoflonEdge mArray__mValue____expressions = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mTypeToTType__mValue____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mTypeToTType__tValue____target = (EMoflonEdge) result3_green[9];

		// 
		// 
		AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
						AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mTypeToTType, mArray, tValue,
						mValue, tAnnotationValue);
		return AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_binding[0];
		ArrayInitializer mArray = (ArrayInitializer) result2_binding[1];
		StringLiteral mValue = (StringLiteral) result2_binding[2];
		for (Object[] result2_black : AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_2_2_corematch_blackFBBBFB(mAnnotationValue, mArray, mValue,
						match)) {
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result2_black[0];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_black[4];
			// ForEach 
			for (Object[] result3_black : AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_2_3_findcontext_blackBBBBB(
							AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, mValue,
							tAnnotationValue)) {
				Object[] result3_green = AnnotationMemberValueStringArrayImpl
						.pattern_AnnotationMemberValueStringArray_2_3_findcontext_greenBBBBBFFFFF(
								AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, mValue,
								tAnnotationValue);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__mAnnotationValue____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mArray__mValue____expressions = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mAnnotationValue__mArray____value = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = AnnotationMemberValueStringArrayImpl
						.pattern_AnnotationMemberValueStringArray_2_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue,
								mArray, mValue, tAnnotationValue);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[AnnotationMemberValuePairToTAnnotationValue] = "
							+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mAnnotationValue] = "
							+ mAnnotationValue + ", " + "[mArray] = " + mArray + ", " + "[mValue] = " + mValue + ", "
							+ "[tAnnotationValue] = " + tAnnotationValue + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationMemberValueStringArrayImpl
						.pattern_AnnotationMemberValueStringArray_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationMemberValueStringArrayImpl
							.pattern_AnnotationMemberValueStringArray_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationMemberValueStringArrayImpl
							.pattern_AnnotationMemberValueStringArray_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AnnotationMemberValuePair mAnnotationValue,
			ArrayInitializer mArray, StringLiteral mValue) {
		match.registerObject("mAnnotationValue", mAnnotationValue);
		match.registerObject("mArray", mArray);
		match.registerObject("mValue", mValue);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AnnotationMemberValuePair mAnnotationValue,
			ArrayInitializer mArray, StringLiteral mValue) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, StringLiteral mValue,
			TAnnotationValue tAnnotationValue) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mValue_escapedValue = CSPFactoryHelper.eINSTANCE.createVariable("mValue.escapedValue", true, csp);
		var_mValue_escapedValue.setValue(mValue.getEscapedValue());
		var_mValue_escapedValue.setType("String");

		// Create unbound variables
		Variable var_tValue_tText = CSPFactoryHelper.eINSTANCE.createVariable("tValue.tText", csp);
		var_tValue_tText.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mValue_escapedValue, var_tValue_tText);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.registerObject("mAnnotationValue", mAnnotationValue);
		isApplicableMatch.registerObject("mArray", mArray);
		isApplicableMatch.registerObject("mValue", mValue);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject AnnotationMemberValuePairToTAnnotationValue,
			EObject mAnnotationValue, EObject mTypeToTType, EObject mArray, EObject tValue, EObject mValue,
			EObject tAnnotationValue) {
		ruleresult.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		ruleresult.registerObject("mAnnotationValue", mAnnotationValue);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mArray", mArray);
		ruleresult.registerObject("tValue", tValue);
		ruleresult.registerObject("mValue", mValue);
		ruleresult.registerObject("tAnnotationValue", tAnnotationValue);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mValue").eClass())
				.equals("java.StringLiteral.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TTextNode tValue, TAnnotationValue tAnnotationValue) {

		Object[] result1_black = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_10_1_initialbindings_blackBBBB(this, match, tValue,
						tAnnotationValue);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tValue] = " + tValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tValue,
						tAnnotationValue);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tValue] = " + tValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_10_4_collectelementstobetranslated_blackBBB(match, tValue,
							tAnnotationValue);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tValue] = " + tValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ".");
			}
			AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_10_4_collectelementstobetranslated_greenBBBF(match,
							tValue, tAnnotationValue);
			//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result4_green[3];

			Object[] result5_black = AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_10_5_collectcontextelements_blackBBB(match, tValue,
							tAnnotationValue);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tValue] = " + tValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ".");
			}
			AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_10_5_collectcontextelements_greenBB(match,
							tAnnotationValue);

			// 
			AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_10_6_registerobjectstomatch_expressionBBBB(this, match,
							tValue, tAnnotationValue);
			return AnnotationMemberValueStringArrayImpl.pattern_AnnotationMemberValueStringArray_10_7_expressionF();
		} else {
			return AnnotationMemberValueStringArrayImpl.pattern_AnnotationMemberValueStringArray_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_11_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result1_bindingAndBlack[0];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result1_bindingAndBlack[1];
		ArrayInitializer mArray = (ArrayInitializer) result1_bindingAndBlack[2];
		TTextNode tValue = (TTextNode) result1_bindingAndBlack[3];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_11_1_performtransformation_greenFBBFB(mArray, tValue, csp);
		LiteralToTNode mTypeToTType = (LiteralToTNode) result1_green[0];
		StringLiteral mValue = (StringLiteral) result1_green[3];

		Object[] result2_black = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_11_2_collecttranslatedelements_blackBBB(mTypeToTType, tValue,
						mValue);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = " + mTypeToTType
					+ ", " + "[tValue] = " + tValue + ", " + "[mValue] = " + mValue + ".");
		}
		Object[] result2_green = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_11_2_collecttranslatedelements_greenFBBB(mTypeToTType, tValue,
						mValue);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult,
						AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mTypeToTType, mArray, tValue,
						mValue, tAnnotationValue);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[AnnotationMemberValuePairToTAnnotationValue] = "
					+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mAnnotationValue] = " + mAnnotationValue
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mArray] = " + mArray + ", " + "[tValue] = "
					+ tValue + ", " + "[mValue] = " + mValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ".");
		}
		AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult,
						mTypeToTType, mArray, tValue, mValue, tAnnotationValue);
		//nothing EMoflonEdge mArray__mValue____expressions = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mTypeToTType__mValue____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mTypeToTType__tValue____target = (EMoflonEdge) result3_green[9];

		// 
		// 
		AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_11_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
						AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mTypeToTType, mArray, tValue,
						mValue, tAnnotationValue);
		return AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TTextNode tValue = (TTextNode) result2_binding[0];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_binding[1];
		for (Object[] result2_black : AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_12_2_corematch_blackFFBBB(tValue, tAnnotationValue, match)) {
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result2_black[0];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_black[1];
			// ForEach 
			for (Object[] result3_black : AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_12_3_findcontext_blackBBFBB(
							AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, tValue, tAnnotationValue)) {
				ArrayInitializer mArray = (ArrayInitializer) result3_black[2];
				Object[] result3_green = AnnotationMemberValueStringArrayImpl
						.pattern_AnnotationMemberValueStringArray_12_3_findcontext_greenBBBBBFFFFF(
								AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, tValue,
								tAnnotationValue);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__mAnnotationValue____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mAnnotationValue__mArray____value = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = AnnotationMemberValueStringArrayImpl
						.pattern_AnnotationMemberValueStringArray_12_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue,
								mArray, tValue, tAnnotationValue);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", "
							+ "[AnnotationMemberValuePairToTAnnotationValue] = "
							+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mAnnotationValue] = "
							+ mAnnotationValue + ", " + "[mArray] = " + mArray + ", " + "[tValue] = " + tValue + ", "
							+ "[tAnnotationValue] = " + tAnnotationValue + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationMemberValueStringArrayImpl
						.pattern_AnnotationMemberValueStringArray_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationMemberValueStringArrayImpl
							.pattern_AnnotationMemberValueStringArray_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationMemberValueStringArrayImpl
							.pattern_AnnotationMemberValueStringArray_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TTextNode tValue, TAnnotationValue tAnnotationValue) {
		match.registerObject("tValue", tValue);
		match.registerObject("tAnnotationValue", tAnnotationValue);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TTextNode tValue, TAnnotationValue tAnnotationValue) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TTextNode tValue,
			TAnnotationValue tAnnotationValue) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tValue_tText = CSPFactoryHelper.eINSTANCE.createVariable("tValue.tText", true, csp);
		var_tValue_tText.setValue(tValue.getTText());
		var_tValue_tText.setType("String");

		// Create unbound variables
		Variable var_mValue_escapedValue = CSPFactoryHelper.eINSTANCE.createVariable("mValue.escapedValue", csp);
		var_mValue_escapedValue.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mValue_escapedValue, var_tValue_tText);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.registerObject("mAnnotationValue", mAnnotationValue);
		isApplicableMatch.registerObject("mArray", mArray);
		isApplicableMatch.registerObject("tValue", tValue);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject AnnotationMemberValuePairToTAnnotationValue,
			EObject mAnnotationValue, EObject mTypeToTType, EObject mArray, EObject tValue, EObject mValue,
			EObject tAnnotationValue) {
		ruleresult.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		ruleresult.registerObject("mAnnotationValue", mAnnotationValue);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mArray", mArray);
		ruleresult.registerObject("tValue", tValue);
		ruleresult.registerObject("mValue", mValue);
		ruleresult.registerObject("tAnnotationValue", tAnnotationValue);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tValue").eClass())
				.equals("basic.annotations.TTextNode.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_100(EMoflonEdge _edge_tValue) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_20_2_testcorematchandDECs_blackFFB(_edge_tValue)) {
			TTextNode tValue = (TTextNode) result2_black[0];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_black[1];
			Object[] result2_green = AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tValue, tAnnotationValue)) {
				// 
				if (AnnotationMemberValueStringArrayImpl
						.pattern_AnnotationMemberValueStringArray_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationMemberValueStringArrayImpl
							.pattern_AnnotationMemberValueStringArray_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationMemberValueStringArrayImpl
							.pattern_AnnotationMemberValueStringArray_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_106(EMoflonEdge _edge_expressions) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_21_2_testcorematchandDECs_blackFFFB(_edge_expressions)) {
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_black[0];
			ArrayInitializer mArray = (ArrayInitializer) result2_black[1];
			StringLiteral mValue = (StringLiteral) result2_black[2];
			Object[] result2_green = AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, mAnnotationValue, mArray, mValue)) {
				// 
				if (AnnotationMemberValueStringArrayImpl
						.pattern_AnnotationMemberValueStringArray_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationMemberValueStringArrayImpl
							.pattern_AnnotationMemberValueStringArray_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationMemberValueStringArrayImpl
							.pattern_AnnotationMemberValueStringArray_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnnotationMemberValueStringArray");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tValue_tText = CSPFactoryHelper.eINSTANCE.createVariable("tValue", true, csp);
		var_tValue_tText.setValue(__helper.getValue("tValue", "tText"));
		var_tValue_tText.setType("String");

		Variable var_mValue_escapedValue = CSPFactoryHelper.eINSTANCE.createVariable("mValue", true, csp);
		var_mValue_escapedValue.setValue(__helper.getValue("mValue", "escapedValue"));
		var_mValue_escapedValue.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("AnnotationMemberValueStringArray");
		eq0.solve(var_mValue_escapedValue, var_tValue_tText);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tValue_tText.setBound(false);
			eq0.solve(var_mValue_escapedValue, var_tValue_tText);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tValue", "tText", var_tValue_tText.getValue());
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
		ruleResult.setRule("AnnotationMemberValueStringArray");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tValue_tText = CSPFactoryHelper.eINSTANCE.createVariable("tValue", true, csp);
		var_tValue_tText.setValue(__helper.getValue("tValue", "tText"));
		var_tValue_tText.setType("String");

		Variable var_mValue_escapedValue = CSPFactoryHelper.eINSTANCE.createVariable("mValue", true, csp);
		var_mValue_escapedValue.setValue(__helper.getValue("mValue", "escapedValue"));
		var_mValue_escapedValue.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("AnnotationMemberValueStringArray");
		eq0.solve(var_mValue_escapedValue, var_tValue_tText);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mValue_escapedValue.setBound(false);
			eq0.solve(var_mValue_escapedValue, var_tValue_tText);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mValue", "escapedValue", var_mValue_escapedValue.getValue());
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

		Object[] result1_black = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_bindingAndBlack[0];
		ArrayInitializer mArray = (ArrayInitializer) result2_bindingAndBlack[1];
		TTextNode tValue = (TTextNode) result2_bindingAndBlack[2];
		StringLiteral mValue = (StringLiteral) result2_bindingAndBlack[3];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, mAnnotationValue,
						mArray, tValue, mValue, tAnnotationValue, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mAnnotationValue] = " + mAnnotationValue + ", " + "[mArray] = " + mArray + ", " + "[tValue] = "
					+ tValue + ", " + "[mValue] = " + mValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_24_5_matchcorrcontext_blackFBBBB(mAnnotationValue,
							tAnnotationValue, sourceMatch, targetMatch)) {
				AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result5_black[0];
				Object[] result5_green = AnnotationMemberValueStringArrayImpl
						.pattern_AnnotationMemberValueStringArray_24_5_matchcorrcontext_greenBBBF(
								AnnotationMemberValuePairToTAnnotationValue, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = AnnotationMemberValueStringArrayImpl
						.pattern_AnnotationMemberValueStringArray_24_6_createcorrespondence_blackBBBBBB(
								mAnnotationValue, mArray, tValue, mValue, tAnnotationValue, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mAnnotationValue] = "
							+ mAnnotationValue + ", " + "[mArray] = " + mArray + ", " + "[tValue] = " + tValue + ", "
							+ "[mValue] = " + mValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationMemberValueStringArrayImpl
						.pattern_AnnotationMemberValueStringArray_24_6_createcorrespondence_greenFBBB(tValue, mValue,
								ccMatch);
				//nothing LiteralToTNode mTypeToTType = (LiteralToTNode) result6_green[0];

				Object[] result7_black = AnnotationMemberValueStringArrayImpl
						.pattern_AnnotationMemberValueStringArray_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationMemberValueStringArrayImpl
						.pattern_AnnotationMemberValueStringArray_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AnnotationMemberValueStringArrayImpl.pattern_AnnotationMemberValueStringArray_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray,
			TTextNode tValue, StringLiteral mValue, TAnnotationValue tAnnotationValue, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mValue_escapedValue = CSPFactoryHelper.eINSTANCE.createVariable("mValue.escapedValue", true, csp);
		var_mValue_escapedValue.setValue(mValue.getEscapedValue());
		var_mValue_escapedValue.setType("String");
		Variable var_tValue_tText = CSPFactoryHelper.eINSTANCE.createVariable("tValue.tText", true, csp);
		var_tValue_tText.setValue(tValue.getTText());
		var_tValue_tText.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mValue_escapedValue, var_tValue_tText);
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
	public boolean checkDEC_FWD(AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray,
			StringLiteral mValue) {// 
		Object[] result1_black = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_27_1_matchtggpattern_blackBBB(mAnnotationValue, mArray,
						mValue);
		if (result1_black != null) {
			return AnnotationMemberValueStringArrayImpl.pattern_AnnotationMemberValueStringArray_27_2_expressionF();
		} else {
			return AnnotationMemberValueStringArrayImpl.pattern_AnnotationMemberValueStringArray_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TTextNode tValue, TAnnotationValue tAnnotationValue) {// 
		Object[] result1_black = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_28_1_matchtggpattern_blackBB(tValue, tAnnotationValue);
		if (result1_black != null) {
			return AnnotationMemberValueStringArrayImpl.pattern_AnnotationMemberValueStringArray_28_2_expressionF();
		} else {
			return AnnotationMemberValueStringArrayImpl.pattern_AnnotationMemberValueStringArray_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValueParameter) {

		Object[] result1_black = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList AnnotationMemberValuePairToTAnnotationValueList = (RuleEntryList) result2_black[0];
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result2_black[1];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_black[2];
			ArrayInitializer mArray = (ArrayInitializer) result2_black[3];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_black[4];

			Object[] result3_bindingAndBlack = AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_29_3_solveCSP_bindingAndBlackFBBBBBBB(this,
							isApplicableMatch, AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray,
							tAnnotationValue, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", "
						+ "[AnnotationMemberValuePairToTAnnotationValue] = "
						+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mAnnotationValue] = "
						+ mAnnotationValue + ", " + "[mArray] = " + mArray + ", " + "[tAnnotationValue] = "
						+ tAnnotationValue + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnnotationMemberValueStringArrayImpl
					.pattern_AnnotationMemberValueStringArray_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnnotationMemberValueStringArrayImpl
						.pattern_AnnotationMemberValueStringArray_29_5_checknacs_blackBBBB(
								AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray,
								tAnnotationValue);
				if (result5_black != null) {

					Object[] result6_black = AnnotationMemberValueStringArrayImpl
							.pattern_AnnotationMemberValueStringArray_29_6_perform_blackBBBBB(
									AnnotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray,
									tAnnotationValue, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[AnnotationMemberValuePairToTAnnotationValue] = "
								+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mAnnotationValue] = "
								+ mAnnotationValue + ", " + "[mArray] = " + mArray + ", " + "[tAnnotationValue] = "
								+ tAnnotationValue + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					AnnotationMemberValueStringArrayImpl
							.pattern_AnnotationMemberValueStringArray_29_6_perform_greenFBFFBBB(mArray,
									tAnnotationValue, ruleResult, csp);
					//nothing LiteralToTNode mTypeToTType = (LiteralToTNode) result6_green[0];
					//nothing TTextNode tValue = (TTextNode) result6_green[2];
					//nothing StringLiteral mValue = (StringLiteral) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberValueStringArrayImpl
				.pattern_AnnotationMemberValueStringArray_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TAnnotationValue tAnnotationValue,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mValue_escapedValue = CSPFactoryHelper.eINSTANCE.createVariable("mValue.escapedValue", csp);
		var_mValue_escapedValue.setType("String");
		Variable var_tValue_tText = CSPFactoryHelper.eINSTANCE.createVariable("tValue.tText", csp);
		var_tValue_tText.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mValue_escapedValue, var_tValue_tText);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.registerObject("mAnnotationValue", mAnnotationValue);
		isApplicableMatch.registerObject("mArray", mArray);
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
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___IS_APPROPRIATE_FWD__MATCH_ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_STRINGLITERAL:
				return isAppropriate_FWD((Match) arguments.get(0), (AnnotationMemberValuePair) arguments.get(1),
						(ArrayInitializer) arguments.get(2), (StringLiteral) arguments.get(3));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_STRINGLITERAL:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (AnnotationMemberValuePair) arguments.get(1),
						(ArrayInitializer) arguments.get(2), (StringLiteral) arguments.get(3));
				return null;
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_STRINGLITERAL:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
						(AnnotationMemberValuePair) arguments.get(1), (ArrayInitializer) arguments.get(2),
						(StringLiteral) arguments.get(3));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE_ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_STRINGLITERAL_TANNOTATIONVALUE:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
						(AnnotationMemberValuePairToTAnnotationValue) arguments.get(1),
						(AnnotationMemberValuePair) arguments.get(2), (ArrayInitializer) arguments.get(3),
						(StringLiteral) arguments.get(4), (TAnnotationValue) arguments.get(5));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
				return null;
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___IS_APPROPRIATE_BWD__MATCH_TTEXTNODE_TANNOTATIONVALUE:
				return isAppropriate_BWD((Match) arguments.get(0), (TTextNode) arguments.get(1),
						(TAnnotationValue) arguments.get(2));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TTEXTNODE_TANNOTATIONVALUE:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TTextNode) arguments.get(1),
						(TAnnotationValue) arguments.get(2));
				return null;
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TTEXTNODE_TANNOTATIONVALUE:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TTextNode) arguments.get(1),
						(TAnnotationValue) arguments.get(2));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE_ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_TTEXTNODE_TANNOTATIONVALUE:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(AnnotationMemberValuePairToTAnnotationValue) arguments.get(1),
						(AnnotationMemberValuePair) arguments.get(2), (ArrayInitializer) arguments.get(3),
						(TTextNode) arguments.get(4), (TAnnotationValue) arguments.get(5));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
				return null;
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___IS_APPROPRIATE_BWD_EMOFLON_EDGE_100__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_100((EMoflonEdge) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___IS_APPROPRIATE_FWD_EMOFLON_EDGE_106__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_106((EMoflonEdge) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___IS_APPLICABLE_SOLVE_CSP_CC__ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_TTEXTNODE_STRINGLITERAL_TANNOTATIONVALUE_MATCH_MATCH:
				return isApplicable_solveCsp_CC((AnnotationMemberValuePair) arguments.get(0),
						(ArrayInitializer) arguments.get(1), (TTextNode) arguments.get(2),
						(StringLiteral) arguments.get(3), (TAnnotationValue) arguments.get(4), (Match) arguments.get(5),
						(Match) arguments.get(6));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___CHECK_DEC_FWD__ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_STRINGLITERAL:
				return checkDEC_FWD((AnnotationMemberValuePair) arguments.get(0), (ArrayInitializer) arguments.get(1),
						(StringLiteral) arguments.get(2));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___CHECK_DEC_BWD__TTEXTNODE_TANNOTATIONVALUE:
				return checkDEC_BWD((TTextNode) arguments.get(0), (TAnnotationValue) arguments.get(1));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___GENERATE_MODEL__RULEENTRYCONTAINER_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE:
				return generateModel((RuleEntryContainer) arguments.get(0),
						(AnnotationMemberValuePairToTAnnotationValue) arguments.get(1));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE_ANNOTATIONMEMBERVALUEPAIR_ARRAYINITIALIZER_TANNOTATIONVALUE_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(AnnotationMemberValuePairToTAnnotationValue) arguments.get(1),
						(AnnotationMemberValuePair) arguments.get(2), (ArrayInitializer) arguments.get(3),
						(TAnnotationValue) arguments.get(4), (ModelgeneratorRuleResult) arguments.get(5));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_STRING_ARRAY___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_0_1_initialbindings_blackBBBBB(
			AnnotationMemberValueStringArray _this, Match match, AnnotationMemberValuePair mAnnotationValue,
			ArrayInitializer mArray, StringLiteral mValue) {
		return new Object[] { _this, match, mAnnotationValue, mArray, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_0_2_SolveCSP_bindingFBBBBB(
			AnnotationMemberValueStringArray _this, Match match, AnnotationMemberValuePair mAnnotationValue,
			ArrayInitializer mArray, StringLiteral mValue) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mAnnotationValue, mArray, mValue);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mAnnotationValue, mArray, mValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_0_2_SolveCSP_bindingAndBlackFBBBBB(
			AnnotationMemberValueStringArray _this, Match match, AnnotationMemberValuePair mAnnotationValue,
			ArrayInitializer mArray, StringLiteral mValue) {
		Object[] result_pattern_AnnotationMemberValueStringArray_0_2_SolveCSP_binding = pattern_AnnotationMemberValueStringArray_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mAnnotationValue, mArray, mValue);
		if (result_pattern_AnnotationMemberValueStringArray_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueStringArray_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueStringArray_0_2_SolveCSP_black = pattern_AnnotationMemberValueStringArray_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueStringArray_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mAnnotationValue, mArray, mValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueStringArray_0_3_CheckCSP_expressionFBB(
			AnnotationMemberValueStringArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_0_4_collectelementstobetranslated_blackBBBB(
			Match match, AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, StringLiteral mValue) {
		return new Object[] { match, mAnnotationValue, mArray, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_0_4_collectelementstobetranslated_greenBBBF(
			Match match, ArrayInitializer mArray, StringLiteral mValue) {
		EMoflonEdge mArray__mValue____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mValue);
		String mArray__mValue____expressions_name_prime = "expressions";
		mArray__mValue____expressions.setSrc(mArray);
		mArray__mValue____expressions.setTrg(mValue);
		match.getToBeTranslatedEdges().add(mArray__mValue____expressions);
		mArray__mValue____expressions.setName(mArray__mValue____expressions_name_prime);
		return new Object[] { match, mArray, mValue, mArray__mValue____expressions };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_0_5_collectcontextelements_blackBBBB(
			Match match, AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, StringLiteral mValue) {
		return new Object[] { match, mAnnotationValue, mArray, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_0_5_collectcontextelements_greenBBBF(
			Match match, AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray) {
		EMoflonEdge mAnnotationValue__mArray____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mAnnotationValue);
		match.getContextNodes().add(mArray);
		String mAnnotationValue__mArray____value_name_prime = "value";
		mAnnotationValue__mArray____value.setSrc(mAnnotationValue);
		mAnnotationValue__mArray____value.setTrg(mArray);
		match.getContextEdges().add(mAnnotationValue__mArray____value);
		mAnnotationValue__mArray____value.setName(mAnnotationValue__mArray____value_name_prime);
		return new Object[] { match, mAnnotationValue, mArray, mAnnotationValue__mArray____value };
	}

	public static final void pattern_AnnotationMemberValueStringArray_0_6_registerobjectstomatch_expressionBBBBB(
			AnnotationMemberValueStringArray _this, Match match, AnnotationMemberValuePair mAnnotationValue,
			ArrayInitializer mArray, StringLiteral mValue) {
		_this.registerObjectsToMatch_FWD(match, mAnnotationValue, mArray, mValue);

	}

	public static final boolean pattern_AnnotationMemberValueStringArray_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueStringArray_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("AnnotationMemberValuePairToTAnnotationValue");
		EObject _localVariable_1 = isApplicableMatch.getObject("mAnnotationValue");
		EObject _localVariable_2 = isApplicableMatch.getObject("mArray");
		EObject _localVariable_3 = isApplicableMatch.getObject("mValue");
		EObject _localVariable_4 = isApplicableMatch.getObject("tAnnotationValue");
		EObject tmpAnnotationMemberValuePairToTAnnotationValue = _localVariable_0;
		EObject tmpMAnnotationValue = _localVariable_1;
		EObject tmpMArray = _localVariable_2;
		EObject tmpMValue = _localVariable_3;
		EObject tmpTAnnotationValue = _localVariable_4;
		if (tmpAnnotationMemberValuePairToTAnnotationValue instanceof AnnotationMemberValuePairToTAnnotationValue) {
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) tmpAnnotationMemberValuePairToTAnnotationValue;
			if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
				AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
				if (tmpMArray instanceof ArrayInitializer) {
					ArrayInitializer mArray = (ArrayInitializer) tmpMArray;
					if (tmpMValue instanceof StringLiteral) {
						StringLiteral mValue = (StringLiteral) tmpMValue;
						if (tmpTAnnotationValue instanceof TAnnotationValue) {
							TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
							return new Object[] { annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray,
									mValue, tAnnotationValue, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_1_1_performtransformation_blackBBBBBFBB(
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, StringLiteral mValue,
			TAnnotationValue tAnnotationValue, AnnotationMemberValueStringArray _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, mValue,
						tAnnotationValue, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			AnnotationMemberValueStringArray _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationMemberValueStringArray_1_1_performtransformation_binding = pattern_AnnotationMemberValueStringArray_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationMemberValueStringArray_1_1_performtransformation_binding != null) {
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result_pattern_AnnotationMemberValueStringArray_1_1_performtransformation_binding[0];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberValueStringArray_1_1_performtransformation_binding[1];
			ArrayInitializer mArray = (ArrayInitializer) result_pattern_AnnotationMemberValueStringArray_1_1_performtransformation_binding[2];
			StringLiteral mValue = (StringLiteral) result_pattern_AnnotationMemberValueStringArray_1_1_performtransformation_binding[3];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberValueStringArray_1_1_performtransformation_binding[4];

			Object[] result_pattern_AnnotationMemberValueStringArray_1_1_performtransformation_black = pattern_AnnotationMemberValueStringArray_1_1_performtransformation_blackBBBBBFBB(
					annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, mValue, tAnnotationValue,
					_this, isApplicableMatch);
			if (result_pattern_AnnotationMemberValueStringArray_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationMemberValueStringArray_1_1_performtransformation_black[5];

				return new Object[] { annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, mValue,
						tAnnotationValue, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_1_1_performtransformation_greenFFBBB(
			StringLiteral mValue, TAnnotationValue tAnnotationValue, CSP csp) {
		LiteralToTNode mTypeToTType = PmFactory.eINSTANCE.createLiteralToTNode();
		TTextNode tValue = AnnotationsFactory.eINSTANCE.createTTextNode();
		Object _localVariable_0 = csp.getValue("tValue", "tText");
		mTypeToTType.setSource(mValue);
		tAnnotationValue.getTValue().add(tValue);
		mTypeToTType.setTarget(tValue);
		String tValue_tText_prime = (String) _localVariable_0;
		tValue.setTText(tValue_tText_prime);
		return new Object[] { mTypeToTType, tValue, mValue, tAnnotationValue, csp };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_1_2_collecttranslatedelements_blackBBB(
			LiteralToTNode mTypeToTType, TTextNode tValue, StringLiteral mValue) {
		return new Object[] { mTypeToTType, tValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_1_2_collecttranslatedelements_greenFBBB(
			LiteralToTNode mTypeToTType, TTextNode tValue, StringLiteral mValue) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getCreatedElements().add(tValue);
		ruleresult.getTranslatedElements().add(mValue);
		return new Object[] { ruleresult, mTypeToTType, tValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject annotationMemberValuePairToTAnnotationValue, EObject mAnnotationValue,
			EObject mTypeToTType, EObject mArray, EObject tValue, EObject mValue, EObject tAnnotationValue) {
		if (!annotationMemberValuePairToTAnnotationValue.equals(mAnnotationValue)) {
			if (!annotationMemberValuePairToTAnnotationValue.equals(mTypeToTType)) {
				if (!annotationMemberValuePairToTAnnotationValue.equals(mArray)) {
					if (!annotationMemberValuePairToTAnnotationValue.equals(tValue)) {
						if (!annotationMemberValuePairToTAnnotationValue.equals(mValue)) {
							if (!annotationMemberValuePairToTAnnotationValue.equals(tAnnotationValue)) {
								if (!mAnnotationValue.equals(mTypeToTType)) {
									if (!mAnnotationValue.equals(mArray)) {
										if (!mAnnotationValue.equals(tValue)) {
											if (!mAnnotationValue.equals(mValue)) {
												if (!mAnnotationValue.equals(tAnnotationValue)) {
													if (!mTypeToTType.equals(tValue)) {
														if (!mTypeToTType.equals(mValue)) {
															if (!mTypeToTType.equals(tAnnotationValue)) {
																if (!mArray.equals(mTypeToTType)) {
																	if (!mArray.equals(tValue)) {
																		if (!mArray.equals(mValue)) {
																			if (!mArray.equals(tAnnotationValue)) {
																				if (!mValue.equals(tValue)) {
																					if (!mValue
																							.equals(tAnnotationValue)) {
																						if (!tAnnotationValue
																								.equals(tValue)) {
																							return new Object[] {
																									ruleresult,
																									annotationMemberValuePairToTAnnotationValue,
																									mAnnotationValue,
																									mTypeToTType,
																									mArray, tValue,
																									mValue,
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
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject mArray, EObject tValue, EObject mValue,
			EObject tAnnotationValue) {
		EMoflonEdge mArray__mValue____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mValue____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationValue__tValue____tValue = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tValue____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationMemberValueStringArray";
		String mArray__mValue____expressions_name_prime = "expressions";
		String mTypeToTType__mValue____source_name_prime = "source";
		String tAnnotationValue__tValue____tValue_name_prime = "tValue";
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
		mTypeToTType__tValue____target.setSrc(mTypeToTType);
		mTypeToTType__tValue____target.setTrg(tValue);
		ruleresult.getCreatedEdges().add(mTypeToTType__tValue____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mArray__mValue____expressions.setName(mArray__mValue____expressions_name_prime);
		mTypeToTType__mValue____source.setName(mTypeToTType__mValue____source_name_prime);
		tAnnotationValue__tValue____tValue.setName(tAnnotationValue__tValue____tValue_name_prime);
		mTypeToTType__tValue____target.setName(mTypeToTType__tValue____target_name_prime);
		return new Object[] { ruleresult, mTypeToTType, mArray, tValue, mValue, tAnnotationValue,
				mArray__mValue____expressions, mTypeToTType__mValue____source, tAnnotationValue__tValue____tValue,
				mTypeToTType__tValue____target };
	}

	public static final void pattern_AnnotationMemberValueStringArray_1_5_registerobjects_expressionBBBBBBBBB(
			AnnotationMemberValueStringArray _this, PerformRuleResult ruleresult,
			EObject annotationMemberValuePairToTAnnotationValue, EObject mAnnotationValue, EObject mTypeToTType,
			EObject mArray, EObject tValue, EObject mValue, EObject tAnnotationValue) {
		_this.registerObjects_FWD(ruleresult, annotationMemberValuePairToTAnnotationValue, mAnnotationValue,
				mTypeToTType, mArray, tValue, mValue, tAnnotationValue);

	}

	public static final PerformRuleResult pattern_AnnotationMemberValueStringArray_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_2_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueStringArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationMemberValueStringArray _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationMemberValueStringArray _this) {
		Object[] result_pattern_AnnotationMemberValueStringArray_2_1_preparereturnvalue_binding = pattern_AnnotationMemberValueStringArray_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueStringArray_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationMemberValueStringArray_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueStringArray_2_1_preparereturnvalue_black = pattern_AnnotationMemberValueStringArray_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationMemberValueStringArray_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationMemberValueStringArray_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationMemberValueStringArray";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mAnnotationValue");
		EObject _localVariable_1 = match.getObject("mArray");
		EObject _localVariable_2 = match.getObject("mValue");
		EObject tmpMAnnotationValue = _localVariable_0;
		EObject tmpMArray = _localVariable_1;
		EObject tmpMValue = _localVariable_2;
		if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
			if (tmpMArray instanceof ArrayInitializer) {
				ArrayInitializer mArray = (ArrayInitializer) tmpMArray;
				if (tmpMValue instanceof StringLiteral) {
					StringLiteral mValue = (StringLiteral) tmpMValue;
					return new Object[] { mAnnotationValue, mArray, mValue, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueStringArray_2_2_corematch_blackFBBBFB(
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, StringLiteral mValue, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue.class,
						"source")) {
			TAnnotationValue tAnnotationValue = annotationMemberValuePairToTAnnotationValue.getTarget();
			if (tAnnotationValue != null) {
				_result.add(new Object[] { annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray,
						mValue, tAnnotationValue, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueStringArray_2_3_findcontext_blackBBBBB(
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, StringLiteral mValue,
			TAnnotationValue tAnnotationValue) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getSource())) {
			if (tAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getTarget())) {
				if (mArray.getExpressions().contains(mValue)) {
					if (mArray.equals(mAnnotationValue.getValue())) {
						_result.add(new Object[] { annotationMemberValuePairToTAnnotationValue, mAnnotationValue,
								mArray, mValue, tAnnotationValue });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_2_3_findcontext_greenBBBBBFFFFF(
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, StringLiteral mValue,
			TAnnotationValue tAnnotationValue) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mArray__mValue____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationValue__mArray____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source_name_prime = "source";
		String annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime = "target";
		String mArray__mValue____expressions_name_prime = "expressions";
		String mAnnotationValue__mArray____value_name_prime = "value";
		isApplicableMatch.getAllContextElements().add(annotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.getAllContextElements().add(mAnnotationValue);
		isApplicableMatch.getAllContextElements().add(mArray);
		isApplicableMatch.getAllContextElements().add(mValue);
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
		mArray__mValue____expressions.setSrc(mArray);
		mArray__mValue____expressions.setTrg(mValue);
		isApplicableMatch.getAllContextElements().add(mArray__mValue____expressions);
		mAnnotationValue__mArray____value.setSrc(mAnnotationValue);
		mAnnotationValue__mArray____value.setTrg(mArray);
		isApplicableMatch.getAllContextElements().add(mAnnotationValue__mArray____value);
		annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source
				.setName(annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source_name_prime);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setName(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime);
		mArray__mValue____expressions.setName(mArray__mValue____expressions_name_prime);
		mAnnotationValue__mArray____value.setName(mAnnotationValue__mArray____value_name_prime);
		return new Object[] { annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, mValue,
				tAnnotationValue, isApplicableMatch,
				annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source,
				annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target, mArray__mValue____expressions,
				mAnnotationValue__mArray____value };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_2_4_solveCSP_bindingFBBBBBBB(
			AnnotationMemberValueStringArray _this, IsApplicableMatch isApplicableMatch,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, StringLiteral mValue,
			TAnnotationValue tAnnotationValue) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch,
				annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, mValue, tAnnotationValue);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotationMemberValuePairToTAnnotationValue,
					mAnnotationValue, mArray, mValue, tAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			AnnotationMemberValueStringArray _this, IsApplicableMatch isApplicableMatch,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, StringLiteral mValue,
			TAnnotationValue tAnnotationValue) {
		Object[] result_pattern_AnnotationMemberValueStringArray_2_4_solveCSP_binding = pattern_AnnotationMemberValueStringArray_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, mValue,
				tAnnotationValue);
		if (result_pattern_AnnotationMemberValueStringArray_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueStringArray_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueStringArray_2_4_solveCSP_black = pattern_AnnotationMemberValueStringArray_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueStringArray_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotationMemberValuePairToTAnnotationValue,
						mAnnotationValue, mArray, mValue, tAnnotationValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueStringArray_2_5_checkCSP_expressionFBB(
			AnnotationMemberValueStringArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationMemberValueStringArray";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberValueStringArray_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_10_1_initialbindings_blackBBBB(
			AnnotationMemberValueStringArray _this, Match match, TTextNode tValue, TAnnotationValue tAnnotationValue) {
		return new Object[] { _this, match, tValue, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_10_2_SolveCSP_bindingFBBBB(
			AnnotationMemberValueStringArray _this, Match match, TTextNode tValue, TAnnotationValue tAnnotationValue) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tValue, tAnnotationValue);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tValue, tAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_10_2_SolveCSP_bindingAndBlackFBBBB(
			AnnotationMemberValueStringArray _this, Match match, TTextNode tValue, TAnnotationValue tAnnotationValue) {
		Object[] result_pattern_AnnotationMemberValueStringArray_10_2_SolveCSP_binding = pattern_AnnotationMemberValueStringArray_10_2_SolveCSP_bindingFBBBB(
				_this, match, tValue, tAnnotationValue);
		if (result_pattern_AnnotationMemberValueStringArray_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueStringArray_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueStringArray_10_2_SolveCSP_black = pattern_AnnotationMemberValueStringArray_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueStringArray_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tValue, tAnnotationValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueStringArray_10_3_CheckCSP_expressionFBB(
			AnnotationMemberValueStringArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_10_4_collectelementstobetranslated_blackBBB(
			Match match, TTextNode tValue, TAnnotationValue tAnnotationValue) {
		return new Object[] { match, tValue, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_10_4_collectelementstobetranslated_greenBBBF(
			Match match, TTextNode tValue, TAnnotationValue tAnnotationValue) {
		EMoflonEdge tAnnotationValue__tValue____tValue = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tValue);
		String tAnnotationValue__tValue____tValue_name_prime = "tValue";
		tAnnotationValue__tValue____tValue.setSrc(tAnnotationValue);
		tAnnotationValue__tValue____tValue.setTrg(tValue);
		match.getToBeTranslatedEdges().add(tAnnotationValue__tValue____tValue);
		tAnnotationValue__tValue____tValue.setName(tAnnotationValue__tValue____tValue_name_prime);
		return new Object[] { match, tValue, tAnnotationValue, tAnnotationValue__tValue____tValue };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_10_5_collectcontextelements_blackBBB(
			Match match, TTextNode tValue, TAnnotationValue tAnnotationValue) {
		return new Object[] { match, tValue, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_10_5_collectcontextelements_greenBB(
			Match match, TAnnotationValue tAnnotationValue) {
		match.getContextNodes().add(tAnnotationValue);
		return new Object[] { match, tAnnotationValue };
	}

	public static final void pattern_AnnotationMemberValueStringArray_10_6_registerobjectstomatch_expressionBBBB(
			AnnotationMemberValueStringArray _this, Match match, TTextNode tValue, TAnnotationValue tAnnotationValue) {
		_this.registerObjectsToMatch_BWD(match, tValue, tAnnotationValue);

	}

	public static final boolean pattern_AnnotationMemberValueStringArray_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueStringArray_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("AnnotationMemberValuePairToTAnnotationValue");
		EObject _localVariable_1 = isApplicableMatch.getObject("mAnnotationValue");
		EObject _localVariable_2 = isApplicableMatch.getObject("mArray");
		EObject _localVariable_3 = isApplicableMatch.getObject("tValue");
		EObject _localVariable_4 = isApplicableMatch.getObject("tAnnotationValue");
		EObject tmpAnnotationMemberValuePairToTAnnotationValue = _localVariable_0;
		EObject tmpMAnnotationValue = _localVariable_1;
		EObject tmpMArray = _localVariable_2;
		EObject tmpTValue = _localVariable_3;
		EObject tmpTAnnotationValue = _localVariable_4;
		if (tmpAnnotationMemberValuePairToTAnnotationValue instanceof AnnotationMemberValuePairToTAnnotationValue) {
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) tmpAnnotationMemberValuePairToTAnnotationValue;
			if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
				AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
				if (tmpMArray instanceof ArrayInitializer) {
					ArrayInitializer mArray = (ArrayInitializer) tmpMArray;
					if (tmpTValue instanceof TTextNode) {
						TTextNode tValue = (TTextNode) tmpTValue;
						if (tmpTAnnotationValue instanceof TAnnotationValue) {
							TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
							return new Object[] { annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray,
									tValue, tAnnotationValue, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_11_1_performtransformation_blackBBBBBFBB(
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TTextNode tValue,
			TAnnotationValue tAnnotationValue, AnnotationMemberValueStringArray _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, tValue,
						tAnnotationValue, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			AnnotationMemberValueStringArray _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationMemberValueStringArray_11_1_performtransformation_binding = pattern_AnnotationMemberValueStringArray_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationMemberValueStringArray_11_1_performtransformation_binding != null) {
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result_pattern_AnnotationMemberValueStringArray_11_1_performtransformation_binding[0];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberValueStringArray_11_1_performtransformation_binding[1];
			ArrayInitializer mArray = (ArrayInitializer) result_pattern_AnnotationMemberValueStringArray_11_1_performtransformation_binding[2];
			TTextNode tValue = (TTextNode) result_pattern_AnnotationMemberValueStringArray_11_1_performtransformation_binding[3];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberValueStringArray_11_1_performtransformation_binding[4];

			Object[] result_pattern_AnnotationMemberValueStringArray_11_1_performtransformation_black = pattern_AnnotationMemberValueStringArray_11_1_performtransformation_blackBBBBBFBB(
					annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, tValue, tAnnotationValue,
					_this, isApplicableMatch);
			if (result_pattern_AnnotationMemberValueStringArray_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationMemberValueStringArray_11_1_performtransformation_black[5];

				return new Object[] { annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, tValue,
						tAnnotationValue, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_11_1_performtransformation_greenFBBFB(
			ArrayInitializer mArray, TTextNode tValue, CSP csp) {
		LiteralToTNode mTypeToTType = PmFactory.eINSTANCE.createLiteralToTNode();
		StringLiteral mValue = JavaFactory.eINSTANCE.createStringLiteral();
		Object _localVariable_0 = csp.getValue("mValue", "escapedValue");
		mTypeToTType.setTarget(tValue);
		mArray.getExpressions().add(mValue);
		mTypeToTType.setSource(mValue);
		String mValue_escapedValue_prime = (String) _localVariable_0;
		mValue.setEscapedValue(mValue_escapedValue_prime);
		return new Object[] { mTypeToTType, mArray, tValue, mValue, csp };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_11_2_collecttranslatedelements_blackBBB(
			LiteralToTNode mTypeToTType, TTextNode tValue, StringLiteral mValue) {
		return new Object[] { mTypeToTType, tValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_11_2_collecttranslatedelements_greenFBBB(
			LiteralToTNode mTypeToTType, TTextNode tValue, StringLiteral mValue) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getTranslatedElements().add(tValue);
		ruleresult.getCreatedElements().add(mValue);
		return new Object[] { ruleresult, mTypeToTType, tValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject annotationMemberValuePairToTAnnotationValue, EObject mAnnotationValue,
			EObject mTypeToTType, EObject mArray, EObject tValue, EObject mValue, EObject tAnnotationValue) {
		if (!annotationMemberValuePairToTAnnotationValue.equals(mAnnotationValue)) {
			if (!annotationMemberValuePairToTAnnotationValue.equals(mTypeToTType)) {
				if (!annotationMemberValuePairToTAnnotationValue.equals(mArray)) {
					if (!annotationMemberValuePairToTAnnotationValue.equals(tValue)) {
						if (!annotationMemberValuePairToTAnnotationValue.equals(mValue)) {
							if (!annotationMemberValuePairToTAnnotationValue.equals(tAnnotationValue)) {
								if (!mAnnotationValue.equals(mTypeToTType)) {
									if (!mAnnotationValue.equals(mArray)) {
										if (!mAnnotationValue.equals(tValue)) {
											if (!mAnnotationValue.equals(mValue)) {
												if (!mAnnotationValue.equals(tAnnotationValue)) {
													if (!mTypeToTType.equals(tValue)) {
														if (!mTypeToTType.equals(mValue)) {
															if (!mTypeToTType.equals(tAnnotationValue)) {
																if (!mArray.equals(mTypeToTType)) {
																	if (!mArray.equals(tValue)) {
																		if (!mArray.equals(mValue)) {
																			if (!mArray.equals(tAnnotationValue)) {
																				if (!mValue.equals(tValue)) {
																					if (!mValue
																							.equals(tAnnotationValue)) {
																						if (!tAnnotationValue
																								.equals(tValue)) {
																							return new Object[] {
																									ruleresult,
																									annotationMemberValuePairToTAnnotationValue,
																									mAnnotationValue,
																									mTypeToTType,
																									mArray, tValue,
																									mValue,
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
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject mArray, EObject tValue, EObject mValue,
			EObject tAnnotationValue) {
		EMoflonEdge mArray__mValue____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mValue____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationValue__tValue____tValue = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tValue____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationMemberValueStringArray";
		String mArray__mValue____expressions_name_prime = "expressions";
		String mTypeToTType__mValue____source_name_prime = "source";
		String tAnnotationValue__tValue____tValue_name_prime = "tValue";
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
		mTypeToTType__tValue____target.setSrc(mTypeToTType);
		mTypeToTType__tValue____target.setTrg(tValue);
		ruleresult.getCreatedEdges().add(mTypeToTType__tValue____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mArray__mValue____expressions.setName(mArray__mValue____expressions_name_prime);
		mTypeToTType__mValue____source.setName(mTypeToTType__mValue____source_name_prime);
		tAnnotationValue__tValue____tValue.setName(tAnnotationValue__tValue____tValue_name_prime);
		mTypeToTType__tValue____target.setName(mTypeToTType__tValue____target_name_prime);
		return new Object[] { ruleresult, mTypeToTType, mArray, tValue, mValue, tAnnotationValue,
				mArray__mValue____expressions, mTypeToTType__mValue____source, tAnnotationValue__tValue____tValue,
				mTypeToTType__tValue____target };
	}

	public static final void pattern_AnnotationMemberValueStringArray_11_5_registerobjects_expressionBBBBBBBBB(
			AnnotationMemberValueStringArray _this, PerformRuleResult ruleresult,
			EObject annotationMemberValuePairToTAnnotationValue, EObject mAnnotationValue, EObject mTypeToTType,
			EObject mArray, EObject tValue, EObject mValue, EObject tAnnotationValue) {
		_this.registerObjects_BWD(ruleresult, annotationMemberValuePairToTAnnotationValue, mAnnotationValue,
				mTypeToTType, mArray, tValue, mValue, tAnnotationValue);

	}

	public static final PerformRuleResult pattern_AnnotationMemberValueStringArray_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_12_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueStringArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_12_1_preparereturnvalue_blackFBB(
			EClass eClass, AnnotationMemberValueStringArray _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationMemberValueStringArray _this) {
		Object[] result_pattern_AnnotationMemberValueStringArray_12_1_preparereturnvalue_binding = pattern_AnnotationMemberValueStringArray_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueStringArray_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationMemberValueStringArray_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueStringArray_12_1_preparereturnvalue_black = pattern_AnnotationMemberValueStringArray_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationMemberValueStringArray_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationMemberValueStringArray_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationMemberValueStringArray";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tValue");
		EObject _localVariable_1 = match.getObject("tAnnotationValue");
		EObject tmpTValue = _localVariable_0;
		EObject tmpTAnnotationValue = _localVariable_1;
		if (tmpTValue instanceof TTextNode) {
			TTextNode tValue = (TTextNode) tmpTValue;
			if (tmpTAnnotationValue instanceof TAnnotationValue) {
				TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
				return new Object[] { tValue, tAnnotationValue, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueStringArray_12_2_corematch_blackFFBBB(
			TTextNode tValue, TAnnotationValue tAnnotationValue, Match match) {
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

	public static final Iterable<Object[]> pattern_AnnotationMemberValueStringArray_12_3_findcontext_blackBBFBB(
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, TTextNode tValue, TAnnotationValue tAnnotationValue) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getSource())) {
			if (tAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getTarget())) {
				if (tAnnotationValue.getTValue().contains(tValue)) {
					Expression tmpMArray = mAnnotationValue.getValue();
					if (tmpMArray instanceof ArrayInitializer) {
						ArrayInitializer mArray = (ArrayInitializer) tmpMArray;
						_result.add(new Object[] { annotationMemberValuePairToTAnnotationValue, mAnnotationValue,
								mArray, tValue, tAnnotationValue });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_12_3_findcontext_greenBBBBBFFFFF(
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TTextNode tValue,
			TAnnotationValue tAnnotationValue) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tAnnotationValue__tValue____tValue = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationValue__mArray____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source_name_prime = "source";
		String annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime = "target";
		String tAnnotationValue__tValue____tValue_name_prime = "tValue";
		String mAnnotationValue__mArray____value_name_prime = "value";
		isApplicableMatch.getAllContextElements().add(annotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.getAllContextElements().add(mAnnotationValue);
		isApplicableMatch.getAllContextElements().add(mArray);
		isApplicableMatch.getAllContextElements().add(tValue);
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
		tAnnotationValue__tValue____tValue.setSrc(tAnnotationValue);
		tAnnotationValue__tValue____tValue.setTrg(tValue);
		isApplicableMatch.getAllContextElements().add(tAnnotationValue__tValue____tValue);
		mAnnotationValue__mArray____value.setSrc(mAnnotationValue);
		mAnnotationValue__mArray____value.setTrg(mArray);
		isApplicableMatch.getAllContextElements().add(mAnnotationValue__mArray____value);
		annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source
				.setName(annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source_name_prime);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setName(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime);
		tAnnotationValue__tValue____tValue.setName(tAnnotationValue__tValue____tValue_name_prime);
		mAnnotationValue__mArray____value.setName(mAnnotationValue__mArray____value_name_prime);
		return new Object[] { annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, tValue,
				tAnnotationValue, isApplicableMatch,
				annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source,
				annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target,
				tAnnotationValue__tValue____tValue, mAnnotationValue__mArray____value };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_12_4_solveCSP_bindingFBBBBBBB(
			AnnotationMemberValueStringArray _this, IsApplicableMatch isApplicableMatch,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TTextNode tValue,
			TAnnotationValue tAnnotationValue) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch,
				annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, tValue, tAnnotationValue);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotationMemberValuePairToTAnnotationValue,
					mAnnotationValue, mArray, tValue, tAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			AnnotationMemberValueStringArray _this, IsApplicableMatch isApplicableMatch,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TTextNode tValue,
			TAnnotationValue tAnnotationValue) {
		Object[] result_pattern_AnnotationMemberValueStringArray_12_4_solveCSP_binding = pattern_AnnotationMemberValueStringArray_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, tValue,
				tAnnotationValue);
		if (result_pattern_AnnotationMemberValueStringArray_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueStringArray_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueStringArray_12_4_solveCSP_black = pattern_AnnotationMemberValueStringArray_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueStringArray_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotationMemberValuePairToTAnnotationValue,
						mAnnotationValue, mArray, tValue, tAnnotationValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueStringArray_12_5_checkCSP_expressionFBB(
			AnnotationMemberValueStringArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationMemberValueStringArray";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberValueStringArray_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_20_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueStringArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, AnnotationMemberValueStringArray _this) {
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

	public static final Object[] pattern_AnnotationMemberValueStringArray_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationMemberValueStringArray _this) {
		Object[] result_pattern_AnnotationMemberValueStringArray_20_1_preparereturnvalue_binding = pattern_AnnotationMemberValueStringArray_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueStringArray_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationMemberValueStringArray_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueStringArray_20_1_preparereturnvalue_black = pattern_AnnotationMemberValueStringArray_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationMemberValueStringArray_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationMemberValueStringArray_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationMemberValueStringArray_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueStringArray_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_tValue) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTAnnotationValue = _edge_tValue.getSrc();
		if (tmpTAnnotationValue instanceof TAnnotationValue) {
			TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
			EObject tmpTValue = _edge_tValue.getTrg();
			if (tmpTValue instanceof TTextNode) {
				TTextNode tValue = (TTextNode) tmpTValue;
				if (tAnnotationValue.getTValue().contains(tValue)) {
					_result.add(new Object[] { tValue, tAnnotationValue, _edge_tValue });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationMemberValueStringArray_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			AnnotationMemberValueStringArray _this, Match match, TTextNode tValue, TAnnotationValue tAnnotationValue) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tValue, tAnnotationValue);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueStringArray_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationMemberValueStringArray _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationMemberValueStringArray_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_21_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueStringArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, AnnotationMemberValueStringArray _this) {
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

	public static final Object[] pattern_AnnotationMemberValueStringArray_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationMemberValueStringArray _this) {
		Object[] result_pattern_AnnotationMemberValueStringArray_21_1_preparereturnvalue_binding = pattern_AnnotationMemberValueStringArray_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueStringArray_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationMemberValueStringArray_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueStringArray_21_1_preparereturnvalue_black = pattern_AnnotationMemberValueStringArray_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationMemberValueStringArray_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationMemberValueStringArray_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationMemberValueStringArray_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_21_2_testcorematchandDECs_black_nac_0BB(
			StringLiteral mValue, AnnotationMemberValuePair mAnnotationValue) {
		for (AnnotationMemberValuePair __DEC_mValue_value_938949 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mValue, AnnotationMemberValuePair.class, "value")) {
			if (!mAnnotationValue.equals(__DEC_mValue_value_938949)) {
				return new Object[] { mValue, mAnnotationValue };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_21_2_testcorematchandDECs_black_nac_1BB(
			AnnotationMemberValuePair mAnnotationValue, StringLiteral mValue) {
		if (mValue.equals(mAnnotationValue.getValue())) {
			return new Object[] { mAnnotationValue, mValue };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueStringArray_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_expressions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMArray = _edge_expressions.getSrc();
		if (tmpMArray instanceof ArrayInitializer) {
			ArrayInitializer mArray = (ArrayInitializer) tmpMArray;
			EObject tmpMValue = _edge_expressions.getTrg();
			if (tmpMValue instanceof StringLiteral) {
				StringLiteral mValue = (StringLiteral) tmpMValue;
				if (mArray.getExpressions().contains(mValue)) {
					for (AnnotationMemberValuePair mAnnotationValue : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mArray, AnnotationMemberValuePair.class, "value")) {
						if (pattern_AnnotationMemberValueStringArray_21_2_testcorematchandDECs_black_nac_0BB(mValue,
								mAnnotationValue) == null) {
							if (pattern_AnnotationMemberValueStringArray_21_2_testcorematchandDECs_black_nac_1BB(
									mAnnotationValue, mValue) == null) {
								_result.add(new Object[] { mAnnotationValue, mArray, mValue, _edge_expressions });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationMemberValueStringArray_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			AnnotationMemberValueStringArray _this, Match match, AnnotationMemberValuePair mAnnotationValue,
			ArrayInitializer mArray, StringLiteral mValue) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mAnnotationValue, mArray, mValue);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueStringArray_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationMemberValueStringArray _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationMemberValueStringArray_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_24_1_prepare_blackB(
			AnnotationMemberValueStringArray _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_24_2_matchsrctrgcontext_bindingFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mAnnotationValue");
		EObject _localVariable_1 = sourceMatch.getObject("mArray");
		EObject _localVariable_2 = targetMatch.getObject("tValue");
		EObject _localVariable_3 = sourceMatch.getObject("mValue");
		EObject _localVariable_4 = targetMatch.getObject("tAnnotationValue");
		EObject tmpMAnnotationValue = _localVariable_0;
		EObject tmpMArray = _localVariable_1;
		EObject tmpTValue = _localVariable_2;
		EObject tmpMValue = _localVariable_3;
		EObject tmpTAnnotationValue = _localVariable_4;
		if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
			if (tmpMArray instanceof ArrayInitializer) {
				ArrayInitializer mArray = (ArrayInitializer) tmpMArray;
				if (tmpTValue instanceof TTextNode) {
					TTextNode tValue = (TTextNode) tmpTValue;
					if (tmpMValue instanceof StringLiteral) {
						StringLiteral mValue = (StringLiteral) tmpMValue;
						if (tmpTAnnotationValue instanceof TAnnotationValue) {
							TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
							return new Object[] { mAnnotationValue, mArray, tValue, mValue, tAnnotationValue,
									sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_24_2_matchsrctrgcontext_blackBBBBBBB(
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TTextNode tValue, StringLiteral mValue,
			TAnnotationValue tAnnotationValue, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { mAnnotationValue, mArray, tValue, mValue, tAnnotationValue, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationMemberValueStringArray_24_2_matchsrctrgcontext_binding = pattern_AnnotationMemberValueStringArray_24_2_matchsrctrgcontext_bindingFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_AnnotationMemberValueStringArray_24_2_matchsrctrgcontext_binding != null) {
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberValueStringArray_24_2_matchsrctrgcontext_binding[0];
			ArrayInitializer mArray = (ArrayInitializer) result_pattern_AnnotationMemberValueStringArray_24_2_matchsrctrgcontext_binding[1];
			TTextNode tValue = (TTextNode) result_pattern_AnnotationMemberValueStringArray_24_2_matchsrctrgcontext_binding[2];
			StringLiteral mValue = (StringLiteral) result_pattern_AnnotationMemberValueStringArray_24_2_matchsrctrgcontext_binding[3];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberValueStringArray_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_AnnotationMemberValueStringArray_24_2_matchsrctrgcontext_black = pattern_AnnotationMemberValueStringArray_24_2_matchsrctrgcontext_blackBBBBBBB(
					mAnnotationValue, mArray, tValue, mValue, tAnnotationValue, sourceMatch, targetMatch);
			if (result_pattern_AnnotationMemberValueStringArray_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mAnnotationValue, mArray, tValue, mValue, tAnnotationValue, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_24_3_solvecsp_bindingFBBBBBBBB(
			AnnotationMemberValueStringArray _this, AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray,
			TTextNode tValue, StringLiteral mValue, TAnnotationValue tAnnotationValue, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(mAnnotationValue, mArray, tValue, mValue,
				tAnnotationValue, sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, mAnnotationValue, mArray, tValue, mValue, tAnnotationValue, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			AnnotationMemberValueStringArray _this, AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray,
			TTextNode tValue, StringLiteral mValue, TAnnotationValue tAnnotationValue, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_AnnotationMemberValueStringArray_24_3_solvecsp_binding = pattern_AnnotationMemberValueStringArray_24_3_solvecsp_bindingFBBBBBBBB(
				_this, mAnnotationValue, mArray, tValue, mValue, tAnnotationValue, sourceMatch, targetMatch);
		if (result_pattern_AnnotationMemberValueStringArray_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueStringArray_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnnotationMemberValueStringArray_24_3_solvecsp_black = pattern_AnnotationMemberValueStringArray_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueStringArray_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mAnnotationValue, mArray, tValue, mValue, tAnnotationValue,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueStringArray_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueStringArray_24_5_matchcorrcontext_blackFBBBB(
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

	public static final Object[] pattern_AnnotationMemberValueStringArray_24_5_matchcorrcontext_greenBBBF(
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnnotationMemberValueStringArray";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(annotationMemberValuePairToTAnnotationValue);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { annotationMemberValuePairToTAnnotationValue, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_24_6_createcorrespondence_blackBBBBBB(
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TTextNode tValue, StringLiteral mValue,
			TAnnotationValue tAnnotationValue, CCMatch ccMatch) {
		return new Object[] { mAnnotationValue, mArray, tValue, mValue, tAnnotationValue, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_24_6_createcorrespondence_greenFBBB(
			TTextNode tValue, StringLiteral mValue, CCMatch ccMatch) {
		LiteralToTNode mTypeToTType = PmFactory.eINSTANCE.createLiteralToTNode();
		mTypeToTType.setSource(mValue);
		mTypeToTType.setTarget(tValue);
		ccMatch.getCreateCorr().add(mTypeToTType);
		return new Object[] { mTypeToTType, tValue, mValue, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnnotationMemberValueStringArray";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberValueStringArray_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_27_1_matchtggpattern_black_nac_0BB(
			StringLiteral mValue, AnnotationMemberValuePair mAnnotationValue) {
		for (AnnotationMemberValuePair __DEC_mValue_value_996226 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mValue, AnnotationMemberValuePair.class, "value")) {
			if (!mAnnotationValue.equals(__DEC_mValue_value_996226)) {
				return new Object[] { mValue, mAnnotationValue };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_27_1_matchtggpattern_black_nac_1BB(
			AnnotationMemberValuePair mAnnotationValue, StringLiteral mValue) {
		if (mValue.equals(mAnnotationValue.getValue())) {
			return new Object[] { mAnnotationValue, mValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_27_1_matchtggpattern_blackBBB(
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, StringLiteral mValue) {
		if (mArray.getExpressions().contains(mValue)) {
			if (mArray.equals(mAnnotationValue.getValue())) {
				if (pattern_AnnotationMemberValueStringArray_27_1_matchtggpattern_black_nac_0BB(mValue,
						mAnnotationValue) == null) {
					if (pattern_AnnotationMemberValueStringArray_27_1_matchtggpattern_black_nac_1BB(mAnnotationValue,
							mValue) == null) {
						return new Object[] { mAnnotationValue, mArray, mValue };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueStringArray_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueStringArray_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_28_1_matchtggpattern_blackBB(TTextNode tValue,
			TAnnotationValue tAnnotationValue) {
		if (tAnnotationValue.getTValue().contains(tValue)) {
			return new Object[] { tValue, tAnnotationValue };
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueStringArray_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueStringArray_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_29_1_createresult_blackB(
			AnnotationMemberValueStringArray _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue) {
		if (ruleResult.getCorrObjects().contains(annotationMemberValuePairToTAnnotationValue)) {
			return new Object[] { ruleResult, annotationMemberValuePairToTAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, AnnotationMemberValuePair mAnnotationValue) {
		if (ruleResult.getSourceObjects().contains(mAnnotationValue)) {
			return new Object[] { ruleResult, mAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ArrayInitializer mArray) {
		if (ruleResult.getSourceObjects().contains(mArray)) {
			return new Object[] { ruleResult, mArray };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TAnnotationValue tAnnotationValue) {
		if (ruleResult.getTargetObjects().contains(tAnnotationValue)) {
			return new Object[] { ruleResult, tAnnotationValue };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueStringArray_29_2_isapplicablecore_blackFFFFFBB(
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
							Expression tmpMArray = mAnnotationValue.getValue();
							if (tmpMArray instanceof ArrayInitializer) {
								ArrayInitializer mArray = (ArrayInitializer) tmpMArray;
								if (pattern_AnnotationMemberValueStringArray_29_2_isapplicablecore_black_nac_0BB(
										ruleResult, annotationMemberValuePairToTAnnotationValue) == null) {
									if (pattern_AnnotationMemberValueStringArray_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, mAnnotationValue) == null) {
										if (pattern_AnnotationMemberValueStringArray_29_2_isapplicablecore_black_nac_3BB(
												ruleResult, tAnnotationValue) == null) {
											if (pattern_AnnotationMemberValueStringArray_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, mArray) == null) {
												_result.add(new Object[] {
														annotationMemberValuePairToTAnnotationValueList,
														annotationMemberValuePairToTAnnotationValue, mAnnotationValue,
														mArray, tAnnotationValue, ruleEntryContainer, ruleResult });
											}
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

	public static final Object[] pattern_AnnotationMemberValueStringArray_29_3_solveCSP_bindingFBBBBBBB(
			AnnotationMemberValueStringArray _this, IsApplicableMatch isApplicableMatch,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TAnnotationValue tAnnotationValue,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch,
				annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, tAnnotationValue, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotationMemberValuePairToTAnnotationValue,
					mAnnotationValue, mArray, tAnnotationValue, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_29_3_solveCSP_bindingAndBlackFBBBBBBB(
			AnnotationMemberValueStringArray _this, IsApplicableMatch isApplicableMatch,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TAnnotationValue tAnnotationValue,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnnotationMemberValueStringArray_29_3_solveCSP_binding = pattern_AnnotationMemberValueStringArray_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray,
				tAnnotationValue, ruleResult);
		if (result_pattern_AnnotationMemberValueStringArray_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueStringArray_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueStringArray_29_3_solveCSP_black = pattern_AnnotationMemberValueStringArray_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueStringArray_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotationMemberValuePairToTAnnotationValue,
						mAnnotationValue, mArray, tAnnotationValue, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueStringArray_29_4_checkCSP_expressionFBB(
			AnnotationMemberValueStringArray _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_29_5_checknacs_blackBBBB(
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TAnnotationValue tAnnotationValue) {
		return new Object[] { annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_29_6_perform_blackBBBBB(
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			AnnotationMemberValuePair mAnnotationValue, ArrayInitializer mArray, TAnnotationValue tAnnotationValue,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { annotationMemberValuePairToTAnnotationValue, mAnnotationValue, mArray, tAnnotationValue,
				ruleResult };
	}

	public static final Object[] pattern_AnnotationMemberValueStringArray_29_6_perform_greenFBFFBBB(
			ArrayInitializer mArray, TAnnotationValue tAnnotationValue, ModelgeneratorRuleResult ruleResult, CSP csp) {
		LiteralToTNode mTypeToTType = PmFactory.eINSTANCE.createLiteralToTNode();
		TTextNode tValue = AnnotationsFactory.eINSTANCE.createTTextNode();
		StringLiteral mValue = JavaFactory.eINSTANCE.createStringLiteral();
		Object _localVariable_0 = csp.getValue("tValue", "tText");
		Object _localVariable_1 = csp.getValue("mValue", "escapedValue");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mTypeToTType);
		tAnnotationValue.getTValue().add(tValue);
		mTypeToTType.setTarget(tValue);
		ruleResult.getTargetObjects().add(tValue);
		mArray.getExpressions().add(mValue);
		mTypeToTType.setSource(mValue);
		ruleResult.getSourceObjects().add(mValue);
		String tValue_tText_prime = (String) _localVariable_0;
		String mValue_escapedValue_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		tValue.setTText(tValue_tText_prime);
		mValue.setEscapedValue(mValue_escapedValue_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mTypeToTType, mArray, tValue, mValue, tAnnotationValue, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationMemberValueStringArray_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationMemberValueStringArrayImpl
