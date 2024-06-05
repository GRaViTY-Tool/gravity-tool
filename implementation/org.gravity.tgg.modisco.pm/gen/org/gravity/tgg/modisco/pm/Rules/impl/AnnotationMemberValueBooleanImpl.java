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
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.BooleanLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.AnnotationMemberValuePairToTAnnotationValue;
import org.gravity.tgg.modisco.pm.LiteralToTNode;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.AnnotationMemberValueBoolean;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotationValue;
import org.gravity.typegraph.basic.annotations.TBoolNode;

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
 * An implementation of the model object '<em><b>Annotation Member Value Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotationMemberValueBooleanImpl extends AbstractRuleImpl implements AnnotationMemberValueBoolean {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationMemberValueBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnnotationMemberValueBoolean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Annotation annotation, AnnotationMemberValuePair mAnnotationValue,
			BodyDeclaration mOwner, BooleanLiteral mValue) {

		Object[] result1_black = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_0_1_initialbindings_blackBBBBBB(this, match, annotation,
						mAnnotationValue, mOwner, mValue);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[annotation] = " + annotation + ", " + "[mAnnotationValue] = "
					+ mAnnotationValue + ", " + "[mOwner] = " + mOwner + ", " + "[mValue] = " + mValue + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, annotation,
						mAnnotationValue, mOwner, mValue);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[annotation] = " + annotation + ", " + "[mAnnotationValue] = "
					+ mAnnotationValue + ", " + "[mOwner] = " + mOwner + ", " + "[mValue] = " + mValue + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_0_4_collectelementstobetranslated_blackBBBBB(match,
							annotation, mAnnotationValue, mOwner, mValue);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[annotation] = " + annotation + ", " + "[mAnnotationValue] = " + mAnnotationValue + ", "
						+ "[mOwner] = " + mOwner + ", " + "[mValue] = " + mValue + ".");
			}
			AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_0_4_collectelementstobetranslated_greenBBBF(match,
							mAnnotationValue, mValue);
			//nothing EMoflonEdge mAnnotationValue__mValue____value = (EMoflonEdge) result4_green[3];

			Object[] result5_black = AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_0_5_collectcontextelements_blackBBBBB(match, annotation,
							mAnnotationValue, mOwner, mValue);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[annotation] = " + annotation + ", " + "[mAnnotationValue] = " + mAnnotationValue + ", "
						+ "[mOwner] = " + mOwner + ", " + "[mValue] = " + mValue + ".");
			}
			AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_0_5_collectcontextelements_greenBBBBFF(match, annotation,
							mAnnotationValue, mOwner);
			//nothing EMoflonEdge mOwner__annotation____annotations = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge annotation__mAnnotationValue____values = (EMoflonEdge) result5_green[5];

			// 
			AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
							annotation, mAnnotationValue, mOwner, mValue);
			return AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_0_7_expressionF();
		} else {
			return AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Annotation annotation = (Annotation) result1_bindingAndBlack[0];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result1_bindingAndBlack[1];
		AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result1_bindingAndBlack[2];
		BodyDeclaration mOwner = (BodyDeclaration) result1_bindingAndBlack[3];
		BooleanLiteral mValue = (BooleanLiteral) result1_bindingAndBlack[4];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_1_1_performtransformation_greenFFBBB(mValue, tAnnotationValue,
						csp);
		TBoolNode tValue = (TBoolNode) result1_green[0];
		LiteralToTNode mValueToTValue = (LiteralToTNode) result1_green[1];

		Object[] result2_black = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_1_2_collecttranslatedelements_blackBBB(tValue, mValueToTValue,
						mValue);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tValue] = " + tValue + ", "
					+ "[mValueToTValue] = " + mValueToTValue + ", " + "[mValue] = " + mValue + ".");
		}
		Object[] result2_green = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_1_2_collecttranslatedelements_greenFBBB(tValue, mValueToTValue,
						mValue);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_1_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult, annotation,
						mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue, tValue, mOwner, mValueToTValue,
						mValue, tAnnotationValue);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[annotation] = " + annotation + ", " + "[mAnnotationValue] = " + mAnnotationValue + ", "
					+ "[AnnotationMemberValuePairToTAnnotationValue] = " + AnnotationMemberValuePairToTAnnotationValue
					+ ", " + "[tValue] = " + tValue + ", " + "[mOwner] = " + mOwner + ", " + "[mValueToTValue] = "
					+ mValueToTValue + ", " + "[mValue] = " + mValue + ", " + "[tAnnotationValue] = " + tAnnotationValue
					+ ".");
		}
		AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_1_3_bookkeepingforedges_greenBBBBBBFFFF(
				ruleresult, mAnnotationValue, tValue, mValueToTValue, mValue, tAnnotationValue);
		//nothing EMoflonEdge mValueToTValue__mValue____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mAnnotationValue__mValue____value = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mValueToTValue__tValue____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result3_green[9];

		// 
		// 
		AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_1_5_registerobjects_expressionBBBBBBBBBB(
				this, ruleresult, annotation, mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue, tValue,
				mOwner, mValueToTValue, mValue, tAnnotationValue);
		return AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Annotation annotation = (Annotation) result2_binding[0];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_binding[1];
		BodyDeclaration mOwner = (BodyDeclaration) result2_binding[2];
		BooleanLiteral mValue = (BooleanLiteral) result2_binding[3];
		for (Object[] result2_black : AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_2_2_corematch_blackBBFBBFB(annotation, mAnnotationValue, mOwner,
						mValue, match)) {
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result2_black[2];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_black[5];
			// ForEach 
			for (Object[] result3_black : AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_2_3_findcontext_blackBBBBBB(annotation, mAnnotationValue,
							AnnotationMemberValuePairToTAnnotationValue, mOwner, mValue, tAnnotationValue)) {
				Object[] result3_green = AnnotationMemberValueBooleanImpl
						.pattern_AnnotationMemberValueBoolean_2_3_findcontext_greenBBBBBBFFFFFF(annotation,
								mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue, mOwner, mValue,
								tAnnotationValue);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__mAnnotationValue____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mAnnotationValue__mValue____value = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mOwner__annotation____annotations = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge annotation__mAnnotationValue____values = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = AnnotationMemberValueBooleanImpl
						.pattern_AnnotationMemberValueBoolean_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, annotation, mAnnotationValue,
								AnnotationMemberValuePairToTAnnotationValue, mOwner, mValue, tAnnotationValue);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[annotation] = " + annotation
							+ ", " + "[mAnnotationValue] = " + mAnnotationValue + ", "
							+ "[AnnotationMemberValuePairToTAnnotationValue] = "
							+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mOwner] = " + mOwner + ", "
							+ "[mValue] = " + mValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationMemberValueBooleanImpl
						.pattern_AnnotationMemberValueBoolean_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationMemberValueBooleanImpl
							.pattern_AnnotationMemberValueBoolean_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationMemberValueBooleanImpl
							.pattern_AnnotationMemberValueBoolean_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, BooleanLiteral mValue) {
		match.registerObject("annotation", annotation);
		match.registerObject("mAnnotationValue", mAnnotationValue);
		match.registerObject("mOwner", mOwner);
		match.registerObject("mValue", mValue);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, BooleanLiteral mValue) {// Create CSP
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
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, BooleanLiteral mValue, TAnnotationValue tAnnotationValue) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mValue_value = CSPFactoryHelper.eINSTANCE.createVariable("mValue.value", true, csp);
		var_mValue_value.setValue(mValue.isValue());
		var_mValue_value.setType("Boolean");

		// Create unbound variables
		Variable var_tValue_value = CSPFactoryHelper.eINSTANCE.createVariable("tValue.value", csp);
		var_tValue_value.setType("Boolean");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mValue_value, var_tValue_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("annotation", annotation);
		isApplicableMatch.registerObject("mAnnotationValue", mAnnotationValue);
		isApplicableMatch.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.registerObject("mOwner", mOwner);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject annotation, EObject mAnnotationValue,
			EObject AnnotationMemberValuePairToTAnnotationValue, EObject tValue, EObject mOwner, EObject mValueToTValue,
			EObject mValue, EObject tAnnotationValue) {
		ruleresult.registerObject("annotation", annotation);
		ruleresult.registerObject("mAnnotationValue", mAnnotationValue);
		ruleresult.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		ruleresult.registerObject("tValue", tValue);
		ruleresult.registerObject("mOwner", mOwner);
		ruleresult.registerObject("mValueToTValue", mValueToTValue);
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
				.equals("java.BooleanLiteral.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TBoolNode tValue, TAnnotationValue tAnnotationValue) {

		Object[] result1_black = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_10_1_initialbindings_blackBBBB(this, match, tValue,
						tAnnotationValue);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tValue] = " + tValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tValue,
						tAnnotationValue);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tValue] = " + tValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_10_4_collectelementstobetranslated_blackBBB(match, tValue,
							tAnnotationValue);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tValue] = " + tValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ".");
			}
			AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_10_4_collectelementstobetranslated_greenBBBF(match, tValue,
							tAnnotationValue);
			//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result4_green[3];

			Object[] result5_black = AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_10_5_collectcontextelements_blackBBB(match, tValue,
							tAnnotationValue);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tValue] = " + tValue + ", " + "[tAnnotationValue] = " + tAnnotationValue + ".");
			}
			AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_10_5_collectcontextelements_greenBB(match, tAnnotationValue);

			// 
			AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_10_6_registerobjectstomatch_expressionBBBB(this, match,
							tValue, tAnnotationValue);
			return AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_10_7_expressionF();
		} else {
			return AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Annotation annotation = (Annotation) result1_bindingAndBlack[0];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result1_bindingAndBlack[1];
		AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result1_bindingAndBlack[2];
		TBoolNode tValue = (TBoolNode) result1_bindingAndBlack[3];
		BodyDeclaration mOwner = (BodyDeclaration) result1_bindingAndBlack[4];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_11_1_performtransformation_greenBBFFB(mAnnotationValue, tValue,
						csp);
		LiteralToTNode mValueToTValue = (LiteralToTNode) result1_green[2];
		BooleanLiteral mValue = (BooleanLiteral) result1_green[3];

		Object[] result2_black = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_11_2_collecttranslatedelements_blackBBB(tValue, mValueToTValue,
						mValue);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tValue] = " + tValue + ", "
					+ "[mValueToTValue] = " + mValueToTValue + ", " + "[mValue] = " + mValue + ".");
		}
		Object[] result2_green = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_11_2_collecttranslatedelements_greenFBBB(tValue, mValueToTValue,
						mValue);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_11_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult, annotation,
						mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue, tValue, mOwner, mValueToTValue,
						mValue, tAnnotationValue);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[annotation] = " + annotation + ", " + "[mAnnotationValue] = " + mAnnotationValue + ", "
					+ "[AnnotationMemberValuePairToTAnnotationValue] = " + AnnotationMemberValuePairToTAnnotationValue
					+ ", " + "[tValue] = " + tValue + ", " + "[mOwner] = " + mOwner + ", " + "[mValueToTValue] = "
					+ mValueToTValue + ", " + "[mValue] = " + mValue + ", " + "[tAnnotationValue] = " + tAnnotationValue
					+ ".");
		}
		AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_11_3_bookkeepingforedges_greenBBBBBBFFFF(
				ruleresult, mAnnotationValue, tValue, mValueToTValue, mValue, tAnnotationValue);
		//nothing EMoflonEdge mValueToTValue__mValue____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mAnnotationValue__mValue____value = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mValueToTValue__tValue____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result3_green[9];

		// 
		// 
		AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_11_5_registerobjects_expressionBBBBBBBBBB(
				this, ruleresult, annotation, mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue, tValue,
				mOwner, mValueToTValue, mValue, tAnnotationValue);
		return AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TBoolNode tValue = (TBoolNode) result2_binding[0];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_binding[1];
		for (Object[] result2_black : AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_12_2_corematch_blackFFBBB(tValue, tAnnotationValue, match)) {
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_black[0];
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result2_black[1];
			// ForEach 
			for (Object[] result3_black : AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_12_3_findcontext_blackFBBBFB(mAnnotationValue,
							AnnotationMemberValuePairToTAnnotationValue, tValue, tAnnotationValue)) {
				Annotation annotation = (Annotation) result3_black[0];
				BodyDeclaration mOwner = (BodyDeclaration) result3_black[4];
				Object[] result3_green = AnnotationMemberValueBooleanImpl
						.pattern_AnnotationMemberValueBoolean_12_3_findcontext_greenBBBBBBFFFFFF(annotation,
								mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue, tValue, mOwner,
								tAnnotationValue);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__mAnnotationValue____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge AnnotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mOwner__annotation____annotations = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge annotation__mAnnotationValue____values = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tAnnotationValue__tValue____tValue = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = AnnotationMemberValueBooleanImpl
						.pattern_AnnotationMemberValueBoolean_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, annotation, mAnnotationValue,
								AnnotationMemberValuePairToTAnnotationValue, tValue, mOwner, tAnnotationValue);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[annotation] = " + annotation
							+ ", " + "[mAnnotationValue] = " + mAnnotationValue + ", "
							+ "[AnnotationMemberValuePairToTAnnotationValue] = "
							+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[tValue] = " + tValue + ", "
							+ "[mOwner] = " + mOwner + ", " + "[tAnnotationValue] = " + tAnnotationValue + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationMemberValueBooleanImpl
						.pattern_AnnotationMemberValueBoolean_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationMemberValueBooleanImpl
							.pattern_AnnotationMemberValueBoolean_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationMemberValueBooleanImpl
							.pattern_AnnotationMemberValueBoolean_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TBoolNode tValue, TAnnotationValue tAnnotationValue) {
		match.registerObject("tValue", tValue);
		match.registerObject("tAnnotationValue", tAnnotationValue);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TBoolNode tValue, TAnnotationValue tAnnotationValue) {// Create CSP
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
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue, TBoolNode tValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tValue_value = CSPFactoryHelper.eINSTANCE.createVariable("tValue.value", true, csp);
		var_tValue_value.setValue(tValue.isValue());
		var_tValue_value.setType("Boolean");

		// Create unbound variables
		Variable var_mValue_value = CSPFactoryHelper.eINSTANCE.createVariable("mValue.value", csp);
		var_mValue_value.setType("Boolean");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mValue_value, var_tValue_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("annotation", annotation);
		isApplicableMatch.registerObject("mAnnotationValue", mAnnotationValue);
		isApplicableMatch.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject annotation, EObject mAnnotationValue,
			EObject AnnotationMemberValuePairToTAnnotationValue, EObject tValue, EObject mOwner, EObject mValueToTValue,
			EObject mValue, EObject tAnnotationValue) {
		ruleresult.registerObject("annotation", annotation);
		ruleresult.registerObject("mAnnotationValue", mAnnotationValue);
		ruleresult.registerObject("AnnotationMemberValuePairToTAnnotationValue",
				AnnotationMemberValuePairToTAnnotationValue);
		ruleresult.registerObject("tValue", tValue);
		ruleresult.registerObject("mOwner", mOwner);
		ruleresult.registerObject("mValueToTValue", mValueToTValue);
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
				.equals("basic.annotations.TBoolNode.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_1014(EMoflonEdge _edge_tValue) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_20_2_testcorematchandDECs_blackFFB(_edge_tValue)) {
			TBoolNode tValue = (TBoolNode) result2_black[0];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_black[1];
			Object[] result2_green = AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tValue, tAnnotationValue)) {
				// 
				if (AnnotationMemberValueBooleanImpl
						.pattern_AnnotationMemberValueBoolean_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationMemberValueBooleanImpl
							.pattern_AnnotationMemberValueBoolean_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationMemberValueBooleanImpl
							.pattern_AnnotationMemberValueBoolean_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1112(EMoflonEdge _edge_value) {

		Object[] result1_bindingAndBlack = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_21_2_testcorematchandDECs_blackFFFFB(_edge_value)) {
			Annotation annotation = (Annotation) result2_black[0];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_black[1];
			BodyDeclaration mOwner = (BodyDeclaration) result2_black[2];
			BooleanLiteral mValue = (BooleanLiteral) result2_black[3];
			Object[] result2_green = AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, annotation, mAnnotationValue, mOwner, mValue)) {
				// 
				if (AnnotationMemberValueBooleanImpl
						.pattern_AnnotationMemberValueBoolean_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationMemberValueBooleanImpl
							.pattern_AnnotationMemberValueBoolean_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationMemberValueBooleanImpl
							.pattern_AnnotationMemberValueBoolean_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnnotationMemberValueBoolean");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tValue_value = CSPFactoryHelper.eINSTANCE.createVariable("tValue", true, csp);
		var_tValue_value.setValue(__helper.getValue("tValue", "value"));
		var_tValue_value.setType("boolean");

		Variable var_mValue_value = CSPFactoryHelper.eINSTANCE.createVariable("mValue", true, csp);
		var_mValue_value.setValue(__helper.getValue("mValue", "value"));
		var_mValue_value.setType("boolean");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("AnnotationMemberValueBoolean");
		eq0.solve(var_mValue_value, var_tValue_value);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tValue_value.setBound(false);
			eq0.solve(var_mValue_value, var_tValue_value);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tValue", "value", var_tValue_value.getValue());
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
		ruleResult.setRule("AnnotationMemberValueBoolean");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tValue_value = CSPFactoryHelper.eINSTANCE.createVariable("tValue", true, csp);
		var_tValue_value.setValue(__helper.getValue("tValue", "value"));
		var_tValue_value.setType("boolean");

		Variable var_mValue_value = CSPFactoryHelper.eINSTANCE.createVariable("mValue", true, csp);
		var_mValue_value.setValue(__helper.getValue("mValue", "value"));
		var_mValue_value.setType("boolean");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("AnnotationMemberValueBoolean");
		eq0.solve(var_mValue_value, var_tValue_value);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mValue_value.setBound(false);
			eq0.solve(var_mValue_value, var_tValue_value);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mValue", "value", var_mValue_value.getValue());
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

		Object[] result1_black = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Annotation annotation = (Annotation) result2_bindingAndBlack[0];
		AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_bindingAndBlack[1];
		TBoolNode tValue = (TBoolNode) result2_bindingAndBlack[2];
		BodyDeclaration mOwner = (BodyDeclaration) result2_bindingAndBlack[3];
		BooleanLiteral mValue = (BooleanLiteral) result2_bindingAndBlack[4];
		TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, annotation,
						mAnnotationValue, tValue, mOwner, mValue, tAnnotationValue, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[annotation] = " + annotation + ", " + "[mAnnotationValue] = " + mAnnotationValue + ", "
					+ "[tValue] = " + tValue + ", " + "[mOwner] = " + mOwner + ", " + "[mValue] = " + mValue + ", "
					+ "[tAnnotationValue] = " + tAnnotationValue + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_24_5_matchcorrcontext_blackBFBBB(mAnnotationValue,
							tAnnotationValue, sourceMatch, targetMatch)) {
				AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result5_black[1];
				Object[] result5_green = AnnotationMemberValueBooleanImpl
						.pattern_AnnotationMemberValueBoolean_24_5_matchcorrcontext_greenBBBF(
								AnnotationMemberValuePairToTAnnotationValue, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = AnnotationMemberValueBooleanImpl
						.pattern_AnnotationMemberValueBoolean_24_6_createcorrespondence_blackBBBBBBB(annotation,
								mAnnotationValue, tValue, mOwner, mValue, tAnnotationValue, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[annotation] = "
							+ annotation + ", " + "[mAnnotationValue] = " + mAnnotationValue + ", " + "[tValue] = "
							+ tValue + ", " + "[mOwner] = " + mOwner + ", " + "[mValue] = " + mValue + ", "
							+ "[tAnnotationValue] = " + tAnnotationValue + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationMemberValueBooleanImpl
						.pattern_AnnotationMemberValueBoolean_24_6_createcorrespondence_greenBFBB(tValue, mValue,
								ccMatch);
				//nothing LiteralToTNode mValueToTValue = (LiteralToTNode) result6_green[1];

				Object[] result7_black = AnnotationMemberValueBooleanImpl
						.pattern_AnnotationMemberValueBoolean_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationMemberValueBooleanImpl
						.pattern_AnnotationMemberValueBoolean_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Annotation annotation, AnnotationMemberValuePair mAnnotationValue,
			TBoolNode tValue, BodyDeclaration mOwner, BooleanLiteral mValue, TAnnotationValue tAnnotationValue,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mValue_value = CSPFactoryHelper.eINSTANCE.createVariable("mValue.value", true, csp);
		var_mValue_value.setValue(mValue.isValue());
		var_mValue_value.setType("Boolean");
		Variable var_tValue_value = CSPFactoryHelper.eINSTANCE.createVariable("tValue.value", true, csp);
		var_tValue_value.setValue(tValue.isValue());
		var_tValue_value.setType("Boolean");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mValue_value, var_tValue_value);
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
			BodyDeclaration mOwner, BooleanLiteral mValue) {// 
		Object[] result1_black = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_27_1_matchtggpattern_blackBBBB(annotation, mAnnotationValue,
						mOwner, mValue);
		if (result1_black != null) {
			return AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_27_2_expressionF();
		} else {
			return AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TBoolNode tValue, TAnnotationValue tAnnotationValue) {// 
		Object[] result1_black = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_28_1_matchtggpattern_blackBB(tValue, tAnnotationValue);
		if (result1_black != null) {
			return AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_28_2_expressionF();
		} else {
			return AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValueParameter) {

		Object[] result1_black = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnnotationMemberValueBooleanImpl
				.pattern_AnnotationMemberValueBoolean_29_2_isapplicablecore_blackFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList AnnotationMemberValuePairToTAnnotationValueList = (RuleEntryList) result2_black[0];
			Annotation annotation = (Annotation) result2_black[1];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result2_black[2];
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result2_black[3];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result2_black[4];
			BodyDeclaration mOwner = (BodyDeclaration) result2_black[5];

			Object[] result3_bindingAndBlack = AnnotationMemberValueBooleanImpl
					.pattern_AnnotationMemberValueBoolean_29_3_solveCSP_bindingAndBlackFBBBBBBBB(this,
							isApplicableMatch, annotation, mAnnotationValue,
							AnnotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[annotation] = " + annotation + ", "
						+ "[mAnnotationValue] = " + mAnnotationValue + ", "
						+ "[AnnotationMemberValuePairToTAnnotationValue] = "
						+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mOwner] = " + mOwner + ", "
						+ "[tAnnotationValue] = " + tAnnotationValue + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = AnnotationMemberValueBooleanImpl
						.pattern_AnnotationMemberValueBoolean_29_5_checknacs_blackBBBBB(annotation, mAnnotationValue,
								AnnotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue);
				if (result5_black != null) {

					Object[] result6_black = AnnotationMemberValueBooleanImpl
							.pattern_AnnotationMemberValueBoolean_29_6_perform_blackBBBBBB(annotation, mAnnotationValue,
									AnnotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[annotation] = "
								+ annotation + ", " + "[mAnnotationValue] = " + mAnnotationValue + ", "
								+ "[AnnotationMemberValuePairToTAnnotationValue] = "
								+ AnnotationMemberValuePairToTAnnotationValue + ", " + "[mOwner] = " + mOwner + ", "
								+ "[tAnnotationValue] = " + tAnnotationValue + ", " + "[ruleResult] = " + ruleResult
								+ ".");
					}
					AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_29_6_perform_greenBFFFBBB(
							mAnnotationValue, tAnnotationValue, ruleResult, csp);
					//nothing TBoolNode tValue = (TBoolNode) result6_green[1];
					//nothing LiteralToTNode mValueToTValue = (LiteralToTNode) result6_green[2];
					//nothing BooleanLiteral mValue = (BooleanLiteral) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return AnnotationMemberValueBooleanImpl.pattern_AnnotationMemberValueBoolean_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue AnnotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mValue_value = CSPFactoryHelper.eINSTANCE.createVariable("mValue.value", csp);
		var_mValue_value.setType("Boolean");
		Variable var_tValue_value = CSPFactoryHelper.eINSTANCE.createVariable("tValue.value", csp);
		var_tValue_value.setType("Boolean");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mValue_value, var_tValue_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("annotation", annotation);
		isApplicableMatch.registerObject("mAnnotationValue", mAnnotationValue);
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
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___IS_APPROPRIATE_FWD__MATCH_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_BODYDECLARATION_BOOLEANLITERAL:
				return isAppropriate_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
						(AnnotationMemberValuePair) arguments.get(2), (BodyDeclaration) arguments.get(3),
						(BooleanLiteral) arguments.get(4));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_BODYDECLARATION_BOOLEANLITERAL:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
						(AnnotationMemberValuePair) arguments.get(2), (BodyDeclaration) arguments.get(3),
						(BooleanLiteral) arguments.get(4));
				return null;
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_BODYDECLARATION_BOOLEANLITERAL:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
						(AnnotationMemberValuePair) arguments.get(2), (BodyDeclaration) arguments.get(3),
						(BooleanLiteral) arguments.get(4));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE_BODYDECLARATION_BOOLEANLITERAL_TANNOTATIONVALUE:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Annotation) arguments.get(1),
						(AnnotationMemberValuePair) arguments.get(2),
						(AnnotationMemberValuePairToTAnnotationValue) arguments.get(3),
						(BodyDeclaration) arguments.get(4), (BooleanLiteral) arguments.get(5),
						(TAnnotationValue) arguments.get(6));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8));
				return null;
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___IS_APPROPRIATE_BWD__MATCH_TBOOLNODE_TANNOTATIONVALUE:
				return isAppropriate_BWD((Match) arguments.get(0), (TBoolNode) arguments.get(1),
						(TAnnotationValue) arguments.get(2));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TBOOLNODE_TANNOTATIONVALUE:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TBoolNode) arguments.get(1),
						(TAnnotationValue) arguments.get(2));
				return null;
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TBOOLNODE_TANNOTATIONVALUE:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TBoolNode) arguments.get(1),
						(TAnnotationValue) arguments.get(2));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE_TBOOLNODE_BODYDECLARATION_TANNOTATIONVALUE:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Annotation) arguments.get(1),
						(AnnotationMemberValuePair) arguments.get(2),
						(AnnotationMemberValuePairToTAnnotationValue) arguments.get(3), (TBoolNode) arguments.get(4),
						(BodyDeclaration) arguments.get(5), (TAnnotationValue) arguments.get(6));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8));
				return null;
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1014__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_1014((EMoflonEdge) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1112__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_1112((EMoflonEdge) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___IS_APPLICABLE_SOLVE_CSP_CC__ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_TBOOLNODE_BODYDECLARATION_BOOLEANLITERAL_TANNOTATIONVALUE_MATCH_MATCH:
				return isApplicable_solveCsp_CC((Annotation) arguments.get(0),
						(AnnotationMemberValuePair) arguments.get(1), (TBoolNode) arguments.get(2),
						(BodyDeclaration) arguments.get(3), (BooleanLiteral) arguments.get(4),
						(TAnnotationValue) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___CHECK_DEC_FWD__ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_BODYDECLARATION_BOOLEANLITERAL:
				return checkDEC_FWD((Annotation) arguments.get(0), (AnnotationMemberValuePair) arguments.get(1),
						(BodyDeclaration) arguments.get(2), (BooleanLiteral) arguments.get(3));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___CHECK_DEC_BWD__TBOOLNODE_TANNOTATIONVALUE:
				return checkDEC_BWD((TBoolNode) arguments.get(0), (TAnnotationValue) arguments.get(1));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___GENERATE_MODEL__RULEENTRYCONTAINER_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE:
				return generateModel((RuleEntryContainer) arguments.get(0),
						(AnnotationMemberValuePairToTAnnotationValue) arguments.get(1));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_ANNOTATIONMEMBERVALUEPAIRTOTANNOTATIONVALUE_BODYDECLARATION_TANNOTATIONVALUE_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Annotation) arguments.get(1),
						(AnnotationMemberValuePair) arguments.get(2),
						(AnnotationMemberValuePairToTAnnotationValue) arguments.get(3),
						(BodyDeclaration) arguments.get(4), (TAnnotationValue) arguments.get(5),
						(ModelgeneratorRuleResult) arguments.get(6));
			case RulesPackage.ANNOTATION_MEMBER_VALUE_BOOLEAN___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_0_1_initialbindings_blackBBBBBB(
			AnnotationMemberValueBoolean _this, Match match, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, BooleanLiteral mValue) {
		return new Object[] { _this, match, annotation, mAnnotationValue, mOwner, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_0_2_SolveCSP_bindingFBBBBBB(
			AnnotationMemberValueBoolean _this, Match match, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, BooleanLiteral mValue) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, annotation, mAnnotationValue, mOwner, mValue);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, annotation, mAnnotationValue, mOwner, mValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			AnnotationMemberValueBoolean _this, Match match, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, BooleanLiteral mValue) {
		Object[] result_pattern_AnnotationMemberValueBoolean_0_2_SolveCSP_binding = pattern_AnnotationMemberValueBoolean_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, annotation, mAnnotationValue, mOwner, mValue);
		if (result_pattern_AnnotationMemberValueBoolean_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueBoolean_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueBoolean_0_2_SolveCSP_black = pattern_AnnotationMemberValueBoolean_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueBoolean_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, annotation, mAnnotationValue, mOwner, mValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueBoolean_0_3_CheckCSP_expressionFBB(
			AnnotationMemberValueBoolean _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, Annotation annotation, AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner,
			BooleanLiteral mValue) {
		return new Object[] { match, annotation, mAnnotationValue, mOwner, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_0_4_collectelementstobetranslated_greenBBBF(
			Match match, AnnotationMemberValuePair mAnnotationValue, BooleanLiteral mValue) {
		EMoflonEdge mAnnotationValue__mValue____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mValue);
		String mAnnotationValue__mValue____value_name_prime = "value";
		mAnnotationValue__mValue____value.setSrc(mAnnotationValue);
		mAnnotationValue__mValue____value.setTrg(mValue);
		match.getToBeTranslatedEdges().add(mAnnotationValue__mValue____value);
		mAnnotationValue__mValue____value.setName(mAnnotationValue__mValue____value_name_prime);
		return new Object[] { match, mAnnotationValue, mValue, mAnnotationValue__mValue____value };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_0_5_collectcontextelements_blackBBBBB(Match match,
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner,
			BooleanLiteral mValue) {
		return new Object[] { match, annotation, mAnnotationValue, mOwner, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_0_5_collectcontextelements_greenBBBBFF(
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

	public static final void pattern_AnnotationMemberValueBoolean_0_6_registerobjectstomatch_expressionBBBBBB(
			AnnotationMemberValueBoolean _this, Match match, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, BooleanLiteral mValue) {
		_this.registerObjectsToMatch_FWD(match, annotation, mAnnotationValue, mOwner, mValue);

	}

	public static final boolean pattern_AnnotationMemberValueBoolean_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueBoolean_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("annotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("mAnnotationValue");
		EObject _localVariable_2 = isApplicableMatch.getObject("AnnotationMemberValuePairToTAnnotationValue");
		EObject _localVariable_3 = isApplicableMatch.getObject("mOwner");
		EObject _localVariable_4 = isApplicableMatch.getObject("mValue");
		EObject _localVariable_5 = isApplicableMatch.getObject("tAnnotationValue");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpMAnnotationValue = _localVariable_1;
		EObject tmpAnnotationMemberValuePairToTAnnotationValue = _localVariable_2;
		EObject tmpMOwner = _localVariable_3;
		EObject tmpMValue = _localVariable_4;
		EObject tmpTAnnotationValue = _localVariable_5;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
				AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
				if (tmpAnnotationMemberValuePairToTAnnotationValue instanceof AnnotationMemberValuePairToTAnnotationValue) {
					AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) tmpAnnotationMemberValuePairToTAnnotationValue;
					if (tmpMOwner instanceof BodyDeclaration) {
						BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
						if (tmpMValue instanceof BooleanLiteral) {
							BooleanLiteral mValue = (BooleanLiteral) tmpMValue;
							if (tmpTAnnotationValue instanceof TAnnotationValue) {
								TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
								return new Object[] { annotation, mAnnotationValue,
										annotationMemberValuePairToTAnnotationValue, mOwner, mValue, tAnnotationValue,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_1_1_performtransformation_blackBBBBBBFBB(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, BooleanLiteral mValue, TAnnotationValue tAnnotationValue,
			AnnotationMemberValueBoolean _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue, mOwner,
						mValue, tAnnotationValue, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			AnnotationMemberValueBoolean _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationMemberValueBoolean_1_1_performtransformation_binding = pattern_AnnotationMemberValueBoolean_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationMemberValueBoolean_1_1_performtransformation_binding != null) {
			Annotation annotation = (Annotation) result_pattern_AnnotationMemberValueBoolean_1_1_performtransformation_binding[0];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberValueBoolean_1_1_performtransformation_binding[1];
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result_pattern_AnnotationMemberValueBoolean_1_1_performtransformation_binding[2];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberValueBoolean_1_1_performtransformation_binding[3];
			BooleanLiteral mValue = (BooleanLiteral) result_pattern_AnnotationMemberValueBoolean_1_1_performtransformation_binding[4];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberValueBoolean_1_1_performtransformation_binding[5];

			Object[] result_pattern_AnnotationMemberValueBoolean_1_1_performtransformation_black = pattern_AnnotationMemberValueBoolean_1_1_performtransformation_blackBBBBBBFBB(
					annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue, mOwner, mValue,
					tAnnotationValue, _this, isApplicableMatch);
			if (result_pattern_AnnotationMemberValueBoolean_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationMemberValueBoolean_1_1_performtransformation_black[6];

				return new Object[] { annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue, mOwner,
						mValue, tAnnotationValue, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_1_1_performtransformation_greenFFBBB(
			BooleanLiteral mValue, TAnnotationValue tAnnotationValue, CSP csp) {
		TBoolNode tValue = AnnotationsFactory.eINSTANCE.createTBoolNode();
		LiteralToTNode mValueToTValue = PmFactory.eINSTANCE.createLiteralToTNode();
		Object _localVariable_0 = csp.getValue("tValue", "value");
		tAnnotationValue.getTValue().add(tValue);
		mValueToTValue.setSource(mValue);
		mValueToTValue.setTarget(tValue);
		boolean tValue_value_prime = (boolean) _localVariable_0;
		tValue.setValue(Boolean.valueOf(tValue_value_prime));
		return new Object[] { tValue, mValueToTValue, mValue, tAnnotationValue, csp };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_1_2_collecttranslatedelements_blackBBB(
			TBoolNode tValue, LiteralToTNode mValueToTValue, BooleanLiteral mValue) {
		return new Object[] { tValue, mValueToTValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_1_2_collecttranslatedelements_greenFBBB(
			TBoolNode tValue, LiteralToTNode mValueToTValue, BooleanLiteral mValue) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tValue);
		ruleresult.getCreatedLinkElements().add(mValueToTValue);
		ruleresult.getTranslatedElements().add(mValue);
		return new Object[] { ruleresult, tValue, mValueToTValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject annotation, EObject mAnnotationValue,
			EObject annotationMemberValuePairToTAnnotationValue, EObject tValue, EObject mOwner, EObject mValueToTValue,
			EObject mValue, EObject tAnnotationValue) {
		if (!annotation.equals(mAnnotationValue)) {
			if (!annotation.equals(tValue)) {
				if (!annotation.equals(mOwner)) {
					if (!annotation.equals(mValueToTValue)) {
						if (!annotation.equals(mValue)) {
							if (!annotation.equals(tAnnotationValue)) {
								if (!mAnnotationValue.equals(tValue)) {
									if (!mAnnotationValue.equals(mOwner)) {
										if (!mAnnotationValue.equals(mValueToTValue)) {
											if (!mAnnotationValue.equals(mValue)) {
												if (!mAnnotationValue.equals(tAnnotationValue)) {
													if (!annotationMemberValuePairToTAnnotationValue
															.equals(annotation)) {
														if (!annotationMemberValuePairToTAnnotationValue
																.equals(mAnnotationValue)) {
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
																				if (!mOwner.equals(tValue)) {
																					if (!mOwner
																							.equals(mValueToTValue)) {
																						if (!mOwner.equals(mValue)) {
																							if (!mOwner.equals(
																									tAnnotationValue)) {
																								if (!mValueToTValue
																										.equals(tValue)) {
																									if (!mValueToTValue
																											.equals(tAnnotationValue)) {
																										if (!mValue
																												.equals(tValue)) {
																											if (!mValue
																													.equals(mValueToTValue)) {
																												if (!mValue
																														.equals(tAnnotationValue)) {
																													if (!tAnnotationValue
																															.equals(tValue)) {
																														return new Object[] {
																																ruleresult,
																																annotation,
																																mAnnotationValue,
																																annotationMemberValuePairToTAnnotationValue,
																																tValue,
																																mOwner,
																																mValueToTValue,
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
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mAnnotationValue, EObject tValue, EObject mValueToTValue,
			EObject mValue, EObject tAnnotationValue) {
		EMoflonEdge mValueToTValue__mValue____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationValue__mValue____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mValueToTValue__tValue____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationValue__tValue____tValue = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationMemberValueBoolean";
		String mValueToTValue__mValue____source_name_prime = "source";
		String mAnnotationValue__mValue____value_name_prime = "value";
		String mValueToTValue__tValue____target_name_prime = "target";
		String tAnnotationValue__tValue____tValue_name_prime = "tValue";
		mValueToTValue__mValue____source.setSrc(mValueToTValue);
		mValueToTValue__mValue____source.setTrg(mValue);
		ruleresult.getCreatedEdges().add(mValueToTValue__mValue____source);
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
		mValueToTValue__mValue____source.setName(mValueToTValue__mValue____source_name_prime);
		mAnnotationValue__mValue____value.setName(mAnnotationValue__mValue____value_name_prime);
		mValueToTValue__tValue____target.setName(mValueToTValue__tValue____target_name_prime);
		tAnnotationValue__tValue____tValue.setName(tAnnotationValue__tValue____tValue_name_prime);
		return new Object[] { ruleresult, mAnnotationValue, tValue, mValueToTValue, mValue, tAnnotationValue,
				mValueToTValue__mValue____source, mAnnotationValue__mValue____value, mValueToTValue__tValue____target,
				tAnnotationValue__tValue____tValue };
	}

	public static final void pattern_AnnotationMemberValueBoolean_1_5_registerobjects_expressionBBBBBBBBBB(
			AnnotationMemberValueBoolean _this, PerformRuleResult ruleresult, EObject annotation,
			EObject mAnnotationValue, EObject annotationMemberValuePairToTAnnotationValue, EObject tValue,
			EObject mOwner, EObject mValueToTValue, EObject mValue, EObject tAnnotationValue) {
		_this.registerObjects_FWD(ruleresult, annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue,
				tValue, mOwner, mValueToTValue, mValue, tAnnotationValue);

	}

	public static final PerformRuleResult pattern_AnnotationMemberValueBoolean_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_2_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueBoolean _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationMemberValueBoolean _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationMemberValueBoolean _this) {
		Object[] result_pattern_AnnotationMemberValueBoolean_2_1_preparereturnvalue_binding = pattern_AnnotationMemberValueBoolean_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueBoolean_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationMemberValueBoolean_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueBoolean_2_1_preparereturnvalue_black = pattern_AnnotationMemberValueBoolean_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationMemberValueBoolean_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationMemberValueBoolean_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationMemberValueBoolean";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("annotation");
		EObject _localVariable_1 = match.getObject("mAnnotationValue");
		EObject _localVariable_2 = match.getObject("mOwner");
		EObject _localVariable_3 = match.getObject("mValue");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpMAnnotationValue = _localVariable_1;
		EObject tmpMOwner = _localVariable_2;
		EObject tmpMValue = _localVariable_3;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
				AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
				if (tmpMOwner instanceof BodyDeclaration) {
					BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
					if (tmpMValue instanceof BooleanLiteral) {
						BooleanLiteral mValue = (BooleanLiteral) tmpMValue;
						return new Object[] { annotation, mAnnotationValue, mOwner, mValue, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueBoolean_2_2_corematch_blackBBFBBFB(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner,
			BooleanLiteral mValue, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue.class,
						"source")) {
			TAnnotationValue tAnnotationValue = annotationMemberValuePairToTAnnotationValue.getTarget();
			if (tAnnotationValue != null) {
				_result.add(new Object[] { annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue,
						mOwner, mValue, tAnnotationValue, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueBoolean_2_3_findcontext_blackBBBBBB(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, BooleanLiteral mValue, TAnnotationValue tAnnotationValue) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getSource())) {
			if (tAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getTarget())) {
				if (mValue.equals(mAnnotationValue.getValue())) {
					if (mOwner.getAnnotations().contains(annotation)) {
						if (annotation.getValues().contains(mAnnotationValue)) {
							_result.add(new Object[] { annotation, mAnnotationValue,
									annotationMemberValuePairToTAnnotationValue, mOwner, mValue, tAnnotationValue });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_2_3_findcontext_greenBBBBBBFFFFFF(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, BooleanLiteral mValue, TAnnotationValue tAnnotationValue) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mAnnotationValue__mValue____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mOwner__annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__mAnnotationValue____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source_name_prime = "source";
		String annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime = "target";
		String mAnnotationValue__mValue____value_name_prime = "value";
		String mOwner__annotation____annotations_name_prime = "annotations";
		String annotation__mAnnotationValue____values_name_prime = "values";
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(mAnnotationValue);
		isApplicableMatch.getAllContextElements().add(annotationMemberValuePairToTAnnotationValue);
		isApplicableMatch.getAllContextElements().add(mOwner);
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
		mAnnotationValue__mValue____value.setSrc(mAnnotationValue);
		mAnnotationValue__mValue____value.setTrg(mValue);
		isApplicableMatch.getAllContextElements().add(mAnnotationValue__mValue____value);
		mOwner__annotation____annotations.setSrc(mOwner);
		mOwner__annotation____annotations.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(mOwner__annotation____annotations);
		annotation__mAnnotationValue____values.setSrc(annotation);
		annotation__mAnnotationValue____values.setTrg(mAnnotationValue);
		isApplicableMatch.getAllContextElements().add(annotation__mAnnotationValue____values);
		annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source
				.setName(annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source_name_prime);
		annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target
				.setName(annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target_name_prime);
		mAnnotationValue__mValue____value.setName(mAnnotationValue__mValue____value_name_prime);
		mOwner__annotation____annotations.setName(mOwner__annotation____annotations_name_prime);
		annotation__mAnnotationValue____values.setName(annotation__mAnnotationValue____values_name_prime);
		return new Object[] { annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue, mOwner, mValue,
				tAnnotationValue, isApplicableMatch,
				annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source,
				annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target,
				mAnnotationValue__mValue____value, mOwner__annotation____annotations,
				annotation__mAnnotationValue____values };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_2_4_solveCSP_bindingFBBBBBBBB(
			AnnotationMemberValueBoolean _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, BooleanLiteral mValue, TAnnotationValue tAnnotationValue) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, annotation, mAnnotationValue,
				annotationMemberValuePairToTAnnotationValue, mOwner, mValue, tAnnotationValue);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotation, mAnnotationValue,
					annotationMemberValuePairToTAnnotationValue, mOwner, mValue, tAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			AnnotationMemberValueBoolean _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, BooleanLiteral mValue, TAnnotationValue tAnnotationValue) {
		Object[] result_pattern_AnnotationMemberValueBoolean_2_4_solveCSP_binding = pattern_AnnotationMemberValueBoolean_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue,
				mOwner, mValue, tAnnotationValue);
		if (result_pattern_AnnotationMemberValueBoolean_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueBoolean_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueBoolean_2_4_solveCSP_black = pattern_AnnotationMemberValueBoolean_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueBoolean_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotation, mAnnotationValue,
						annotationMemberValuePairToTAnnotationValue, mOwner, mValue, tAnnotationValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueBoolean_2_5_checkCSP_expressionFBB(
			AnnotationMemberValueBoolean _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationMemberValueBoolean";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberValueBoolean_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_10_1_initialbindings_blackBBBB(
			AnnotationMemberValueBoolean _this, Match match, TBoolNode tValue, TAnnotationValue tAnnotationValue) {
		return new Object[] { _this, match, tValue, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_10_2_SolveCSP_bindingFBBBB(
			AnnotationMemberValueBoolean _this, Match match, TBoolNode tValue, TAnnotationValue tAnnotationValue) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tValue, tAnnotationValue);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tValue, tAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_10_2_SolveCSP_bindingAndBlackFBBBB(
			AnnotationMemberValueBoolean _this, Match match, TBoolNode tValue, TAnnotationValue tAnnotationValue) {
		Object[] result_pattern_AnnotationMemberValueBoolean_10_2_SolveCSP_binding = pattern_AnnotationMemberValueBoolean_10_2_SolveCSP_bindingFBBBB(
				_this, match, tValue, tAnnotationValue);
		if (result_pattern_AnnotationMemberValueBoolean_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueBoolean_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueBoolean_10_2_SolveCSP_black = pattern_AnnotationMemberValueBoolean_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueBoolean_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tValue, tAnnotationValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueBoolean_10_3_CheckCSP_expressionFBB(
			AnnotationMemberValueBoolean _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_10_4_collectelementstobetranslated_blackBBB(
			Match match, TBoolNode tValue, TAnnotationValue tAnnotationValue) {
		return new Object[] { match, tValue, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_10_4_collectelementstobetranslated_greenBBBF(
			Match match, TBoolNode tValue, TAnnotationValue tAnnotationValue) {
		EMoflonEdge tAnnotationValue__tValue____tValue = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tValue);
		String tAnnotationValue__tValue____tValue_name_prime = "tValue";
		tAnnotationValue__tValue____tValue.setSrc(tAnnotationValue);
		tAnnotationValue__tValue____tValue.setTrg(tValue);
		match.getToBeTranslatedEdges().add(tAnnotationValue__tValue____tValue);
		tAnnotationValue__tValue____tValue.setName(tAnnotationValue__tValue____tValue_name_prime);
		return new Object[] { match, tValue, tAnnotationValue, tAnnotationValue__tValue____tValue };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_10_5_collectcontextelements_blackBBB(Match match,
			TBoolNode tValue, TAnnotationValue tAnnotationValue) {
		return new Object[] { match, tValue, tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_10_5_collectcontextelements_greenBB(Match match,
			TAnnotationValue tAnnotationValue) {
		match.getContextNodes().add(tAnnotationValue);
		return new Object[] { match, tAnnotationValue };
	}

	public static final void pattern_AnnotationMemberValueBoolean_10_6_registerobjectstomatch_expressionBBBB(
			AnnotationMemberValueBoolean _this, Match match, TBoolNode tValue, TAnnotationValue tAnnotationValue) {
		_this.registerObjectsToMatch_BWD(match, tValue, tAnnotationValue);

	}

	public static final boolean pattern_AnnotationMemberValueBoolean_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueBoolean_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("annotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("mAnnotationValue");
		EObject _localVariable_2 = isApplicableMatch.getObject("AnnotationMemberValuePairToTAnnotationValue");
		EObject _localVariable_3 = isApplicableMatch.getObject("tValue");
		EObject _localVariable_4 = isApplicableMatch.getObject("mOwner");
		EObject _localVariable_5 = isApplicableMatch.getObject("tAnnotationValue");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpMAnnotationValue = _localVariable_1;
		EObject tmpAnnotationMemberValuePairToTAnnotationValue = _localVariable_2;
		EObject tmpTValue = _localVariable_3;
		EObject tmpMOwner = _localVariable_4;
		EObject tmpTAnnotationValue = _localVariable_5;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
				AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
				if (tmpAnnotationMemberValuePairToTAnnotationValue instanceof AnnotationMemberValuePairToTAnnotationValue) {
					AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) tmpAnnotationMemberValuePairToTAnnotationValue;
					if (tmpTValue instanceof TBoolNode) {
						TBoolNode tValue = (TBoolNode) tmpTValue;
						if (tmpMOwner instanceof BodyDeclaration) {
							BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
							if (tmpTAnnotationValue instanceof TAnnotationValue) {
								TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
								return new Object[] { annotation, mAnnotationValue,
										annotationMemberValuePairToTAnnotationValue, tValue, mOwner, tAnnotationValue,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_11_1_performtransformation_blackBBBBBBFBB(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue, TBoolNode tValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue, AnnotationMemberValueBoolean _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue, tValue,
						mOwner, tAnnotationValue, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			AnnotationMemberValueBoolean _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationMemberValueBoolean_11_1_performtransformation_binding = pattern_AnnotationMemberValueBoolean_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationMemberValueBoolean_11_1_performtransformation_binding != null) {
			Annotation annotation = (Annotation) result_pattern_AnnotationMemberValueBoolean_11_1_performtransformation_binding[0];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberValueBoolean_11_1_performtransformation_binding[1];
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue = (AnnotationMemberValuePairToTAnnotationValue) result_pattern_AnnotationMemberValueBoolean_11_1_performtransformation_binding[2];
			TBoolNode tValue = (TBoolNode) result_pattern_AnnotationMemberValueBoolean_11_1_performtransformation_binding[3];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberValueBoolean_11_1_performtransformation_binding[4];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberValueBoolean_11_1_performtransformation_binding[5];

			Object[] result_pattern_AnnotationMemberValueBoolean_11_1_performtransformation_black = pattern_AnnotationMemberValueBoolean_11_1_performtransformation_blackBBBBBBFBB(
					annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue, tValue, mOwner,
					tAnnotationValue, _this, isApplicableMatch);
			if (result_pattern_AnnotationMemberValueBoolean_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationMemberValueBoolean_11_1_performtransformation_black[6];

				return new Object[] { annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue, tValue,
						mOwner, tAnnotationValue, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_11_1_performtransformation_greenBBFFB(
			AnnotationMemberValuePair mAnnotationValue, TBoolNode tValue, CSP csp) {
		LiteralToTNode mValueToTValue = PmFactory.eINSTANCE.createLiteralToTNode();
		BooleanLiteral mValue = JavaFactory.eINSTANCE.createBooleanLiteral();
		Object _localVariable_0 = csp.getValue("mValue", "value");
		mValueToTValue.setTarget(tValue);
		mValueToTValue.setSource(mValue);
		mAnnotationValue.setValue(mValue);
		boolean mValue_value_prime = (boolean) _localVariable_0;
		mValue.setValue(Boolean.valueOf(mValue_value_prime));
		return new Object[] { mAnnotationValue, tValue, mValueToTValue, mValue, csp };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_11_2_collecttranslatedelements_blackBBB(
			TBoolNode tValue, LiteralToTNode mValueToTValue, BooleanLiteral mValue) {
		return new Object[] { tValue, mValueToTValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_11_2_collecttranslatedelements_greenFBBB(
			TBoolNode tValue, LiteralToTNode mValueToTValue, BooleanLiteral mValue) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tValue);
		ruleresult.getCreatedLinkElements().add(mValueToTValue);
		ruleresult.getCreatedElements().add(mValue);
		return new Object[] { ruleresult, tValue, mValueToTValue, mValue };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_11_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject annotation, EObject mAnnotationValue,
			EObject annotationMemberValuePairToTAnnotationValue, EObject tValue, EObject mOwner, EObject mValueToTValue,
			EObject mValue, EObject tAnnotationValue) {
		if (!annotation.equals(mAnnotationValue)) {
			if (!annotation.equals(tValue)) {
				if (!annotation.equals(mOwner)) {
					if (!annotation.equals(mValueToTValue)) {
						if (!annotation.equals(mValue)) {
							if (!annotation.equals(tAnnotationValue)) {
								if (!mAnnotationValue.equals(tValue)) {
									if (!mAnnotationValue.equals(mOwner)) {
										if (!mAnnotationValue.equals(mValueToTValue)) {
											if (!mAnnotationValue.equals(mValue)) {
												if (!mAnnotationValue.equals(tAnnotationValue)) {
													if (!annotationMemberValuePairToTAnnotationValue
															.equals(annotation)) {
														if (!annotationMemberValuePairToTAnnotationValue
																.equals(mAnnotationValue)) {
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
																				if (!mOwner.equals(tValue)) {
																					if (!mOwner
																							.equals(mValueToTValue)) {
																						if (!mOwner.equals(mValue)) {
																							if (!mOwner.equals(
																									tAnnotationValue)) {
																								if (!mValueToTValue
																										.equals(tValue)) {
																									if (!mValueToTValue
																											.equals(tAnnotationValue)) {
																										if (!mValue
																												.equals(tValue)) {
																											if (!mValue
																													.equals(mValueToTValue)) {
																												if (!mValue
																														.equals(tAnnotationValue)) {
																													if (!tAnnotationValue
																															.equals(tValue)) {
																														return new Object[] {
																																ruleresult,
																																annotation,
																																mAnnotationValue,
																																annotationMemberValuePairToTAnnotationValue,
																																tValue,
																																mOwner,
																																mValueToTValue,
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
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject mAnnotationValue, EObject tValue, EObject mValueToTValue,
			EObject mValue, EObject tAnnotationValue) {
		EMoflonEdge mValueToTValue__mValue____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationValue__mValue____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mValueToTValue__tValue____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotationValue__tValue____tValue = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationMemberValueBoolean";
		String mValueToTValue__mValue____source_name_prime = "source";
		String mAnnotationValue__mValue____value_name_prime = "value";
		String mValueToTValue__tValue____target_name_prime = "target";
		String tAnnotationValue__tValue____tValue_name_prime = "tValue";
		mValueToTValue__mValue____source.setSrc(mValueToTValue);
		mValueToTValue__mValue____source.setTrg(mValue);
		ruleresult.getCreatedEdges().add(mValueToTValue__mValue____source);
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
		mValueToTValue__mValue____source.setName(mValueToTValue__mValue____source_name_prime);
		mAnnotationValue__mValue____value.setName(mAnnotationValue__mValue____value_name_prime);
		mValueToTValue__tValue____target.setName(mValueToTValue__tValue____target_name_prime);
		tAnnotationValue__tValue____tValue.setName(tAnnotationValue__tValue____tValue_name_prime);
		return new Object[] { ruleresult, mAnnotationValue, tValue, mValueToTValue, mValue, tAnnotationValue,
				mValueToTValue__mValue____source, mAnnotationValue__mValue____value, mValueToTValue__tValue____target,
				tAnnotationValue__tValue____tValue };
	}

	public static final void pattern_AnnotationMemberValueBoolean_11_5_registerobjects_expressionBBBBBBBBBB(
			AnnotationMemberValueBoolean _this, PerformRuleResult ruleresult, EObject annotation,
			EObject mAnnotationValue, EObject annotationMemberValuePairToTAnnotationValue, EObject tValue,
			EObject mOwner, EObject mValueToTValue, EObject mValue, EObject tAnnotationValue) {
		_this.registerObjects_BWD(ruleresult, annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue,
				tValue, mOwner, mValueToTValue, mValue, tAnnotationValue);

	}

	public static final PerformRuleResult pattern_AnnotationMemberValueBoolean_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_12_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueBoolean _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationMemberValueBoolean _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationMemberValueBoolean _this) {
		Object[] result_pattern_AnnotationMemberValueBoolean_12_1_preparereturnvalue_binding = pattern_AnnotationMemberValueBoolean_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueBoolean_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationMemberValueBoolean_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueBoolean_12_1_preparereturnvalue_black = pattern_AnnotationMemberValueBoolean_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationMemberValueBoolean_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationMemberValueBoolean_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationMemberValueBoolean";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tValue");
		EObject _localVariable_1 = match.getObject("tAnnotationValue");
		EObject tmpTValue = _localVariable_0;
		EObject tmpTAnnotationValue = _localVariable_1;
		if (tmpTValue instanceof TBoolNode) {
			TBoolNode tValue = (TBoolNode) tmpTValue;
			if (tmpTAnnotationValue instanceof TAnnotationValue) {
				TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
				return new Object[] { tValue, tAnnotationValue, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueBoolean_12_2_corematch_blackFFBBB(
			TBoolNode tValue, TAnnotationValue tAnnotationValue, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnnotationValue, AnnotationMemberValuePairToTAnnotationValue.class,
						"target")) {
			AnnotationMemberValuePair mAnnotationValue = annotationMemberValuePairToTAnnotationValue.getSource();
			if (mAnnotationValue != null) {
				_result.add(new Object[] { mAnnotationValue, annotationMemberValuePairToTAnnotationValue, tValue,
						tAnnotationValue, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueBoolean_12_3_findcontext_blackFBBBFB(
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue, TBoolNode tValue,
			TAnnotationValue tAnnotationValue) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getSource())) {
			if (tAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getTarget())) {
				if (tAnnotationValue.getTValue().contains(tValue)) {
					for (Annotation annotation : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mAnnotationValue, Annotation.class, "values")) {
						for (BodyDeclaration mOwner : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(annotation, BodyDeclaration.class, "annotations")) {
							_result.add(new Object[] { annotation, mAnnotationValue,
									annotationMemberValuePairToTAnnotationValue, tValue, mOwner, tAnnotationValue });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_12_3_findcontext_greenBBBBBBFFFFFF(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue, TBoolNode tValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue) {
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
		isApplicableMatch.getAllContextElements().add(mAnnotationValue);
		isApplicableMatch.getAllContextElements().add(annotationMemberValuePairToTAnnotationValue);
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
		return new Object[] { annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue, tValue, mOwner,
				tAnnotationValue, isApplicableMatch,
				annotationMemberValuePairToTAnnotationValue__mAnnotationValue____source,
				annotationMemberValuePairToTAnnotationValue__tAnnotationValue____target,
				mOwner__annotation____annotations, annotation__mAnnotationValue____values,
				tAnnotationValue__tValue____tValue };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_12_4_solveCSP_bindingFBBBBBBBB(
			AnnotationMemberValueBoolean _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue, TBoolNode tValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, annotation, mAnnotationValue,
				annotationMemberValuePairToTAnnotationValue, tValue, mOwner, tAnnotationValue);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotation, mAnnotationValue,
					annotationMemberValuePairToTAnnotationValue, tValue, mOwner, tAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			AnnotationMemberValueBoolean _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue, TBoolNode tValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue) {
		Object[] result_pattern_AnnotationMemberValueBoolean_12_4_solveCSP_binding = pattern_AnnotationMemberValueBoolean_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue,
				tValue, mOwner, tAnnotationValue);
		if (result_pattern_AnnotationMemberValueBoolean_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueBoolean_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueBoolean_12_4_solveCSP_black = pattern_AnnotationMemberValueBoolean_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueBoolean_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotation, mAnnotationValue,
						annotationMemberValuePairToTAnnotationValue, tValue, mOwner, tAnnotationValue };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueBoolean_12_5_checkCSP_expressionFBB(
			AnnotationMemberValueBoolean _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationMemberValueBoolean";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberValueBoolean_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_20_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueBoolean _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationMemberValueBoolean _this) {
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

	public static final Object[] pattern_AnnotationMemberValueBoolean_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationMemberValueBoolean _this) {
		Object[] result_pattern_AnnotationMemberValueBoolean_20_1_preparereturnvalue_binding = pattern_AnnotationMemberValueBoolean_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueBoolean_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationMemberValueBoolean_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueBoolean_20_1_preparereturnvalue_black = pattern_AnnotationMemberValueBoolean_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationMemberValueBoolean_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationMemberValueBoolean_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationMemberValueBoolean_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueBoolean_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_tValue) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTAnnotationValue = _edge_tValue.getSrc();
		if (tmpTAnnotationValue instanceof TAnnotationValue) {
			TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
			EObject tmpTValue = _edge_tValue.getTrg();
			if (tmpTValue instanceof TBoolNode) {
				TBoolNode tValue = (TBoolNode) tmpTValue;
				if (tAnnotationValue.getTValue().contains(tValue)) {
					_result.add(new Object[] { tValue, tAnnotationValue, _edge_tValue });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationMemberValueBoolean_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			AnnotationMemberValueBoolean _this, Match match, TBoolNode tValue, TAnnotationValue tAnnotationValue) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tValue, tAnnotationValue);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueBoolean_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationMemberValueBoolean _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationMemberValueBoolean_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_21_1_preparereturnvalue_bindingFB(
			AnnotationMemberValueBoolean _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationMemberValueBoolean _this) {
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

	public static final Object[] pattern_AnnotationMemberValueBoolean_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationMemberValueBoolean _this) {
		Object[] result_pattern_AnnotationMemberValueBoolean_21_1_preparereturnvalue_binding = pattern_AnnotationMemberValueBoolean_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationMemberValueBoolean_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationMemberValueBoolean_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationMemberValueBoolean_21_1_preparereturnvalue_black = pattern_AnnotationMemberValueBoolean_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationMemberValueBoolean_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationMemberValueBoolean_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationMemberValueBoolean_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueBoolean_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_value) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMAnnotationValue = _edge_value.getSrc();
		if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
			EObject tmpMValue = _edge_value.getTrg();
			if (tmpMValue instanceof BooleanLiteral) {
				BooleanLiteral mValue = (BooleanLiteral) tmpMValue;
				if (mValue.equals(mAnnotationValue.getValue())) {
					for (Annotation annotation : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mAnnotationValue, Annotation.class, "values")) {
						for (BodyDeclaration mOwner : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(annotation, BodyDeclaration.class, "annotations")) {
							_result.add(new Object[] { annotation, mAnnotationValue, mOwner, mValue, _edge_value });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationMemberValueBoolean_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			AnnotationMemberValueBoolean _this, Match match, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner, BooleanLiteral mValue) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, annotation, mAnnotationValue, mOwner, mValue);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueBoolean_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationMemberValueBoolean _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationMemberValueBoolean_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_24_1_prepare_blackB(
			AnnotationMemberValueBoolean _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("annotation");
		EObject _localVariable_1 = sourceMatch.getObject("mAnnotationValue");
		EObject _localVariable_2 = targetMatch.getObject("tValue");
		EObject _localVariable_3 = sourceMatch.getObject("mOwner");
		EObject _localVariable_4 = sourceMatch.getObject("mValue");
		EObject _localVariable_5 = targetMatch.getObject("tAnnotationValue");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpMAnnotationValue = _localVariable_1;
		EObject tmpTValue = _localVariable_2;
		EObject tmpMOwner = _localVariable_3;
		EObject tmpMValue = _localVariable_4;
		EObject tmpTAnnotationValue = _localVariable_5;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpMAnnotationValue instanceof AnnotationMemberValuePair) {
				AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) tmpMAnnotationValue;
				if (tmpTValue instanceof TBoolNode) {
					TBoolNode tValue = (TBoolNode) tmpTValue;
					if (tmpMOwner instanceof BodyDeclaration) {
						BodyDeclaration mOwner = (BodyDeclaration) tmpMOwner;
						if (tmpMValue instanceof BooleanLiteral) {
							BooleanLiteral mValue = (BooleanLiteral) tmpMValue;
							if (tmpTAnnotationValue instanceof TAnnotationValue) {
								TAnnotationValue tAnnotationValue = (TAnnotationValue) tmpTAnnotationValue;
								return new Object[] { annotation, mAnnotationValue, tValue, mOwner, mValue,
										tAnnotationValue, sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_24_2_matchsrctrgcontext_blackBBBBBBBB(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue, TBoolNode tValue, BodyDeclaration mOwner,
			BooleanLiteral mValue, TAnnotationValue tAnnotationValue, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { annotation, mAnnotationValue, tValue, mOwner, mValue, tAnnotationValue, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationMemberValueBoolean_24_2_matchsrctrgcontext_binding = pattern_AnnotationMemberValueBoolean_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_AnnotationMemberValueBoolean_24_2_matchsrctrgcontext_binding != null) {
			Annotation annotation = (Annotation) result_pattern_AnnotationMemberValueBoolean_24_2_matchsrctrgcontext_binding[0];
			AnnotationMemberValuePair mAnnotationValue = (AnnotationMemberValuePair) result_pattern_AnnotationMemberValueBoolean_24_2_matchsrctrgcontext_binding[1];
			TBoolNode tValue = (TBoolNode) result_pattern_AnnotationMemberValueBoolean_24_2_matchsrctrgcontext_binding[2];
			BodyDeclaration mOwner = (BodyDeclaration) result_pattern_AnnotationMemberValueBoolean_24_2_matchsrctrgcontext_binding[3];
			BooleanLiteral mValue = (BooleanLiteral) result_pattern_AnnotationMemberValueBoolean_24_2_matchsrctrgcontext_binding[4];
			TAnnotationValue tAnnotationValue = (TAnnotationValue) result_pattern_AnnotationMemberValueBoolean_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_AnnotationMemberValueBoolean_24_2_matchsrctrgcontext_black = pattern_AnnotationMemberValueBoolean_24_2_matchsrctrgcontext_blackBBBBBBBB(
					annotation, mAnnotationValue, tValue, mOwner, mValue, tAnnotationValue, sourceMatch, targetMatch);
			if (result_pattern_AnnotationMemberValueBoolean_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { annotation, mAnnotationValue, tValue, mOwner, mValue, tAnnotationValue,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_24_3_solvecsp_bindingFBBBBBBBBB(
			AnnotationMemberValueBoolean _this, Annotation annotation, AnnotationMemberValuePair mAnnotationValue,
			TBoolNode tValue, BodyDeclaration mOwner, BooleanLiteral mValue, TAnnotationValue tAnnotationValue,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(annotation, mAnnotationValue, tValue, mOwner, mValue,
				tAnnotationValue, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, annotation, mAnnotationValue, tValue, mOwner, mValue, tAnnotationValue,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			AnnotationMemberValueBoolean _this, Annotation annotation, AnnotationMemberValuePair mAnnotationValue,
			TBoolNode tValue, BodyDeclaration mOwner, BooleanLiteral mValue, TAnnotationValue tAnnotationValue,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationMemberValueBoolean_24_3_solvecsp_binding = pattern_AnnotationMemberValueBoolean_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, annotation, mAnnotationValue, tValue, mOwner, mValue, tAnnotationValue, sourceMatch,
				targetMatch);
		if (result_pattern_AnnotationMemberValueBoolean_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueBoolean_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnnotationMemberValueBoolean_24_3_solvecsp_black = pattern_AnnotationMemberValueBoolean_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueBoolean_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, annotation, mAnnotationValue, tValue, mOwner, mValue,
						tAnnotationValue, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueBoolean_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueBoolean_24_5_matchcorrcontext_blackBFBBB(
			AnnotationMemberValuePair mAnnotationValue, TAnnotationValue tAnnotationValue, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mAnnotationValue, AnnotationMemberValuePairToTAnnotationValue.class,
							"source")) {
				if (tAnnotationValue.equals(annotationMemberValuePairToTAnnotationValue.getTarget())) {
					_result.add(new Object[] { mAnnotationValue, annotationMemberValuePairToTAnnotationValue,
							tAnnotationValue, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_24_5_matchcorrcontext_greenBBBF(
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnnotationMemberValueBoolean";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(annotationMemberValuePairToTAnnotationValue);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { annotationMemberValuePairToTAnnotationValue, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_24_6_createcorrespondence_blackBBBBBBB(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue, TBoolNode tValue, BodyDeclaration mOwner,
			BooleanLiteral mValue, TAnnotationValue tAnnotationValue, CCMatch ccMatch) {
		return new Object[] { annotation, mAnnotationValue, tValue, mOwner, mValue, tAnnotationValue, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_24_6_createcorrespondence_greenBFBB(
			TBoolNode tValue, BooleanLiteral mValue, CCMatch ccMatch) {
		LiteralToTNode mValueToTValue = PmFactory.eINSTANCE.createLiteralToTNode();
		mValueToTValue.setSource(mValue);
		mValueToTValue.setTarget(tValue);
		ccMatch.getCreateCorr().add(mValueToTValue);
		return new Object[] { tValue, mValueToTValue, mValue, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnnotationMemberValueBoolean";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationMemberValueBoolean_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_27_1_matchtggpattern_blackBBBB(
			Annotation annotation, AnnotationMemberValuePair mAnnotationValue, BodyDeclaration mOwner,
			BooleanLiteral mValue) {
		if (mValue.equals(mAnnotationValue.getValue())) {
			if (mOwner.getAnnotations().contains(annotation)) {
				if (annotation.getValues().contains(mAnnotationValue)) {
					return new Object[] { annotation, mAnnotationValue, mOwner, mValue };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueBoolean_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueBoolean_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_28_1_matchtggpattern_blackBB(TBoolNode tValue,
			TAnnotationValue tAnnotationValue) {
		if (tAnnotationValue.getTValue().contains(tValue)) {
			return new Object[] { tValue, tAnnotationValue };
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueBoolean_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationMemberValueBoolean_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_29_1_createresult_blackB(
			AnnotationMemberValueBoolean _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Annotation annotation) {
		if (ruleResult.getSourceObjects().contains(annotation)) {
			return new Object[] { ruleResult, annotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, AnnotationMemberValuePair mAnnotationValue) {
		if (ruleResult.getSourceObjects().contains(mAnnotationValue)) {
			return new Object[] { ruleResult, mAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue) {
		if (ruleResult.getCorrObjects().contains(annotationMemberValuePairToTAnnotationValue)) {
			return new Object[] { ruleResult, annotationMemberValuePairToTAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TAnnotationValue tAnnotationValue) {
		if (ruleResult.getTargetObjects().contains(tAnnotationValue)) {
			return new Object[] { ruleResult, tAnnotationValue };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, BodyDeclaration mOwner) {
		if (ruleResult.getSourceObjects().contains(mOwner)) {
			return new Object[] { ruleResult, mOwner };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationMemberValueBoolean_29_2_isapplicablecore_blackFFFFFFBB(
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
							if (pattern_AnnotationMemberValueBoolean_29_2_isapplicablecore_black_nac_2BB(ruleResult,
									annotationMemberValuePairToTAnnotationValue) == null) {
								if (pattern_AnnotationMemberValueBoolean_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										mAnnotationValue) == null) {
									if (pattern_AnnotationMemberValueBoolean_29_2_isapplicablecore_black_nac_3BB(
											ruleResult, tAnnotationValue) == null) {
										for (Annotation annotation : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(mAnnotationValue, Annotation.class,
														"values")) {
											if (pattern_AnnotationMemberValueBoolean_29_2_isapplicablecore_black_nac_0BB(
													ruleResult, annotation) == null) {
												for (BodyDeclaration mOwner : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(annotation, BodyDeclaration.class,
																"annotations")) {
													if (pattern_AnnotationMemberValueBoolean_29_2_isapplicablecore_black_nac_4BB(
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

	public static final Object[] pattern_AnnotationMemberValueBoolean_29_3_solveCSP_bindingFBBBBBBBB(
			AnnotationMemberValueBoolean _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, annotation, mAnnotationValue,
				annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotation, mAnnotationValue,
					annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_29_3_solveCSP_bindingAndBlackFBBBBBBBB(
			AnnotationMemberValueBoolean _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnnotationMemberValueBoolean_29_3_solveCSP_binding = pattern_AnnotationMemberValueBoolean_29_3_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue,
				mOwner, tAnnotationValue, ruleResult);
		if (result_pattern_AnnotationMemberValueBoolean_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationMemberValueBoolean_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnnotationMemberValueBoolean_29_3_solveCSP_black = pattern_AnnotationMemberValueBoolean_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationMemberValueBoolean_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotation, mAnnotationValue,
						annotationMemberValuePairToTAnnotationValue, mOwner, tAnnotationValue, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationMemberValueBoolean_29_4_checkCSP_expressionFBB(
			AnnotationMemberValueBoolean _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_29_5_checknacs_blackBBBBB(Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue) {
		return new Object[] { annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue, mOwner,
				tAnnotationValue };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_29_6_perform_blackBBBBBB(Annotation annotation,
			AnnotationMemberValuePair mAnnotationValue,
			AnnotationMemberValuePairToTAnnotationValue annotationMemberValuePairToTAnnotationValue,
			BodyDeclaration mOwner, TAnnotationValue tAnnotationValue, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { annotation, mAnnotationValue, annotationMemberValuePairToTAnnotationValue, mOwner,
				tAnnotationValue, ruleResult };
	}

	public static final Object[] pattern_AnnotationMemberValueBoolean_29_6_perform_greenBFFFBBB(
			AnnotationMemberValuePair mAnnotationValue, TAnnotationValue tAnnotationValue,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		TBoolNode tValue = AnnotationsFactory.eINSTANCE.createTBoolNode();
		LiteralToTNode mValueToTValue = PmFactory.eINSTANCE.createLiteralToTNode();
		BooleanLiteral mValue = JavaFactory.eINSTANCE.createBooleanLiteral();
		Object _localVariable_0 = csp.getValue("tValue", "value");
		Object _localVariable_1 = csp.getValue("mValue", "value");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		tAnnotationValue.getTValue().add(tValue);
		ruleResult.getTargetObjects().add(tValue);
		mValueToTValue.setTarget(tValue);
		ruleResult.getCorrObjects().add(mValueToTValue);
		mValueToTValue.setSource(mValue);
		mAnnotationValue.setValue(mValue);
		ruleResult.getSourceObjects().add(mValue);
		boolean tValue_value_prime = (boolean) _localVariable_0;
		boolean mValue_value_prime = (boolean) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		tValue.setValue(Boolean.valueOf(tValue_value_prime));
		mValue.setValue(Boolean.valueOf(mValue_value_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mAnnotationValue, tValue, mValueToTValue, mValue, tAnnotationValue, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationMemberValueBoolean_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationMemberValueBooleanImpl
