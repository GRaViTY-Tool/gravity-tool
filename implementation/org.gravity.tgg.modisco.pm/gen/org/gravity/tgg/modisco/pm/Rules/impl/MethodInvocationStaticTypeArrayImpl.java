/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MMethodInvocation;

import org.gravity.tgg.modisco.pm.AbstractMethodInvocationToTAccess;

import org.gravity.tgg.modisco.pm.Rules.MethodInvocationStaticTypeArray;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TAccess;
import org.gravity.typegraph.basic.TCall;

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
 * An implementation of the model object '<em><b>Method Invocation Static Type Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MethodInvocationStaticTypeArrayImpl extends AbstractRuleImpl implements MethodInvocationStaticTypeArray {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodInvocationStaticTypeArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getMethodInvocationStaticTypeArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Type arrayType, MMethodInvocation invocation,
			MAbstractMethodDefinition method, ArrayType mStaticType, TypeAccess typeAccess) {

		Object[] result1_black = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_0_1_initialbindings_blackBBBBBBB(this, match, arrayType,
						invocation, method, mStaticType, typeAccess);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[arrayType] = " + arrayType + ", " + "[invocation] = " + invocation
					+ ", " + "[method] = " + method + ", " + "[mStaticType] = " + mStaticType + ", " + "[typeAccess] = "
					+ typeAccess + ".");
		}

		Object[] result2_bindingAndBlack = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_0_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, arrayType,
						invocation, method, mStaticType, typeAccess);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[arrayType] = " + arrayType + ", " + "[invocation] = " + invocation
					+ ", " + "[method] = " + method + ", " + "[mStaticType] = " + mStaticType + ", " + "[typeAccess] = "
					+ typeAccess + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodInvocationStaticTypeArrayImpl.pattern_MethodInvocationStaticTypeArray_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_0_4_collectelementstobetranslated_blackBBBBBB(match,
							arrayType, invocation, method, mStaticType, typeAccess);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[arrayType] = " + arrayType + ", " + "[invocation] = " + invocation + ", " + "[method] = "
						+ method + ", " + "[mStaticType] = " + mStaticType + ", " + "[typeAccess] = " + typeAccess
						+ ".");
			}
			MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_0_4_collectelementstobetranslated_greenBBBF(match,
							invocation, mStaticType);
			//nothing EMoflonEdge invocation__mStaticType____mStaticType = (EMoflonEdge) result4_green[3];

			Object[] result5_black = MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_0_5_collectcontextelements_blackBBBBBB(match, arrayType,
							invocation, method, mStaticType, typeAccess);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[arrayType] = " + arrayType + ", " + "[invocation] = " + invocation + ", " + "[method] = "
						+ method + ", " + "[mStaticType] = " + mStaticType + ", " + "[typeAccess] = " + typeAccess
						+ ".");
			}
			MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_0_5_collectcontextelements_greenBBBBBBFFFFF(match,
							arrayType, invocation, method, mStaticType, typeAccess);
			//nothing EMoflonEdge invocation__method____method = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge method__invocation____usages = (EMoflonEdge) result5_green[7];
			//nothing EMoflonEdge mStaticType__typeAccess____elementType = (EMoflonEdge) result5_green[8];
			//nothing EMoflonEdge typeAccess__arrayType____type = (EMoflonEdge) result5_green[9];
			//nothing EMoflonEdge arrayType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result5_green[10];

			// 
			MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_0_6_registerobjectstomatch_expressionBBBBBBB(this, match,
							arrayType, invocation, method, mStaticType, typeAccess);
			return MethodInvocationStaticTypeArrayImpl.pattern_MethodInvocationStaticTypeArray_0_7_expressionF();
		} else {
			return MethodInvocationStaticTypeArrayImpl.pattern_MethodInvocationStaticTypeArray_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Type arrayType = (Type) result1_bindingAndBlack[0];
		MMethodInvocation invocation = (MMethodInvocation) result1_bindingAndBlack[1];
		TAbstractType tStaticType = (TAbstractType) result1_bindingAndBlack[2];
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result1_bindingAndBlack[3];
		TCall tAccess = (TCall) result1_bindingAndBlack[4];
		ArrayType mStaticType = (ArrayType) result1_bindingAndBlack[5];
		TypeAccess typeAccess = (TypeAccess) result1_bindingAndBlack[6];
		TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) result1_bindingAndBlack[7];
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_greenBB(tStaticType, tAccess);

		Object[] result2_green = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, arrayType,
						invocation, tStaticType, method, tAccess, mStaticType, typeAccess, mStaticTypeTotStaticType,
						invocationToTAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[arrayType] = " + arrayType + ", " + "[invocation] = " + invocation + ", "
					+ "[tStaticType] = " + tStaticType + ", " + "[method] = " + method + ", " + "[tAccess] = " + tAccess
					+ ", " + "[mStaticType] = " + mStaticType + ", " + "[typeAccess] = " + typeAccess + ", "
					+ "[mStaticTypeTotStaticType] = " + mStaticTypeTotStaticType + ", " + "[invocationToTAccess] = "
					+ invocationToTAccess + ".");
		}
		MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_1_3_bookkeepingforedges_greenBBBBBFF(ruleresult, invocation,
						tStaticType, tAccess, mStaticType);
		//nothing EMoflonEdge invocation__mStaticType____mStaticType = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge tAccess__tStaticType____staticType = (EMoflonEdge) result3_green[6];

		// 
		// 
		MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
						arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
						mStaticTypeTotStaticType, invocationToTAccess);
		return MethodInvocationStaticTypeArrayImpl.pattern_MethodInvocationStaticTypeArray_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Type arrayType = (Type) result2_binding[0];
		MMethodInvocation invocation = (MMethodInvocation) result2_binding[1];
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_binding[2];
		ArrayType mStaticType = (ArrayType) result2_binding[3];
		TypeAccess typeAccess = (TypeAccess) result2_binding[4];
		for (Object[] result2_black : MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_2_2_corematch_blackBBFBFBBFFB(arrayType, invocation, method,
						mStaticType, typeAccess, match)) {
			TAbstractType tStaticType = (TAbstractType) result2_black[2];
			TCall tAccess = (TCall) result2_black[4];
			TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) result2_black[7];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result2_black[8];
			// ForEach 
			for (Object[] result3_black : MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_2_3_findcontext_blackBBBBBBBBB(arrayType, invocation,
							tStaticType, method, tAccess, mStaticType, typeAccess, mStaticTypeTotStaticType,
							invocationToTAccess)) {
				Object[] result3_green = MethodInvocationStaticTypeArrayImpl
						.pattern_MethodInvocationStaticTypeArray_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFF(arrayType,
								invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
								mStaticTypeTotStaticType, invocationToTAccess);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge invocation__mStaticType____mStaticType = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mStaticTypeTotStaticType__tStaticType____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge invocation__method____method = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge method__invocation____usages = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mStaticType__typeAccess____elementType = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge typeAccess__arrayType____type = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge arrayType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mStaticTypeTotStaticType__arrayType____source = (EMoflonEdge) result3_green[19];

				Object[] result4_bindingAndBlack = MethodInvocationStaticTypeArrayImpl
						.pattern_MethodInvocationStaticTypeArray_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, arrayType, invocation, tStaticType, method, tAccess, mStaticType,
								typeAccess, mStaticTypeTotStaticType, invocationToTAccess);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[arrayType] = " + arrayType + ", "
							+ "[invocation] = " + invocation + ", " + "[tStaticType] = " + tStaticType + ", "
							+ "[method] = " + method + ", " + "[tAccess] = " + tAccess + ", " + "[mStaticType] = "
							+ mStaticType + ", " + "[typeAccess] = " + typeAccess + ", "
							+ "[mStaticTypeTotStaticType] = " + mStaticTypeTotStaticType + ", "
							+ "[invocationToTAccess] = " + invocationToTAccess + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodInvocationStaticTypeArrayImpl
						.pattern_MethodInvocationStaticTypeArray_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodInvocationStaticTypeArrayImpl
							.pattern_MethodInvocationStaticTypeArray_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodInvocationStaticTypeArrayImpl
							.pattern_MethodInvocationStaticTypeArray_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MethodInvocationStaticTypeArrayImpl.pattern_MethodInvocationStaticTypeArray_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Type arrayType, MMethodInvocation invocation,
			MAbstractMethodDefinition method, ArrayType mStaticType, TypeAccess typeAccess) {
		match.registerObject("arrayType", arrayType);
		match.registerObject("invocation", invocation);
		match.registerObject("method", method);
		match.registerObject("mStaticType", mStaticType);
		match.registerObject("typeAccess", typeAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Type arrayType, MMethodInvocation invocation,
			MAbstractMethodDefinition method, ArrayType mStaticType, TypeAccess typeAccess) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Type arrayType,
			MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method, TCall tAccess,
			ArrayType mStaticType, TypeAccess typeAccess, TypeToTAbstractType mStaticTypeTotStaticType,
			AbstractMethodInvocationToTAccess invocationToTAccess) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("arrayType", arrayType);
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("tStaticType", tStaticType);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("mStaticType", mStaticType);
		isApplicableMatch.registerObject("typeAccess", typeAccess);
		isApplicableMatch.registerObject("mStaticTypeTotStaticType", mStaticTypeTotStaticType);
		isApplicableMatch.registerObject("invocationToTAccess", invocationToTAccess);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject arrayType, EObject invocation,
			EObject tStaticType, EObject method, EObject tAccess, EObject mStaticType, EObject typeAccess,
			EObject mStaticTypeTotStaticType, EObject invocationToTAccess) {
		ruleresult.registerObject("arrayType", arrayType);
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("tStaticType", tStaticType);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("mStaticType", mStaticType);
		ruleresult.registerObject("typeAccess", typeAccess);
		ruleresult.registerObject("mStaticTypeTotStaticType", mStaticTypeTotStaticType);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TAbstractType tStaticType, TCall tAccess) {

		Object[] result1_black = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_10_1_initialbindings_blackBBBB(this, match, tStaticType,
						tAccess);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tStaticType] = " + tStaticType + ", " + "[tAccess] = " + tAccess + ".");
		}

		Object[] result2_bindingAndBlack = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tStaticType,
						tAccess);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tStaticType] = " + tStaticType + ", " + "[tAccess] = " + tAccess + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_10_4_collectelementstobetranslated_blackBBB(match,
							tStaticType, tAccess);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tStaticType] = " + tStaticType + ", " + "[tAccess] = " + tAccess + ".");
			}
			MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_10_4_collectelementstobetranslated_greenBBBF(match,
							tStaticType, tAccess);
			//nothing EMoflonEdge tAccess__tStaticType____staticType = (EMoflonEdge) result4_green[3];

			Object[] result5_black = MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_10_5_collectcontextelements_blackBBB(match, tStaticType,
							tAccess);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tStaticType] = " + tStaticType + ", " + "[tAccess] = " + tAccess + ".");
			}
			MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_10_5_collectcontextelements_greenBBB(match, tStaticType,
							tAccess);

			// 
			MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_10_6_registerobjectstomatch_expressionBBBB(this, match,
							tStaticType, tAccess);
			return MethodInvocationStaticTypeArrayImpl.pattern_MethodInvocationStaticTypeArray_10_7_expressionF();
		} else {
			return MethodInvocationStaticTypeArrayImpl.pattern_MethodInvocationStaticTypeArray_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Type arrayType = (Type) result1_bindingAndBlack[0];
		MMethodInvocation invocation = (MMethodInvocation) result1_bindingAndBlack[1];
		TAbstractType tStaticType = (TAbstractType) result1_bindingAndBlack[2];
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result1_bindingAndBlack[3];
		TCall tAccess = (TCall) result1_bindingAndBlack[4];
		ArrayType mStaticType = (ArrayType) result1_bindingAndBlack[5];
		TypeAccess typeAccess = (TypeAccess) result1_bindingAndBlack[6];
		TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) result1_bindingAndBlack[7];
		AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_greenBB(invocation, mStaticType);

		Object[] result2_green = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, arrayType,
						invocation, tStaticType, method, tAccess, mStaticType, typeAccess, mStaticTypeTotStaticType,
						invocationToTAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[arrayType] = " + arrayType + ", " + "[invocation] = " + invocation + ", "
					+ "[tStaticType] = " + tStaticType + ", " + "[method] = " + method + ", " + "[tAccess] = " + tAccess
					+ ", " + "[mStaticType] = " + mStaticType + ", " + "[typeAccess] = " + typeAccess + ", "
					+ "[mStaticTypeTotStaticType] = " + mStaticTypeTotStaticType + ", " + "[invocationToTAccess] = "
					+ invocationToTAccess + ".");
		}
		MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_11_3_bookkeepingforedges_greenBBBBBFF(ruleresult, invocation,
						tStaticType, tAccess, mStaticType);
		//nothing EMoflonEdge invocation__mStaticType____mStaticType = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge tAccess__tStaticType____staticType = (EMoflonEdge) result3_green[6];

		// 
		// 
		MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
						arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
						mStaticTypeTotStaticType, invocationToTAccess);
		return MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAbstractType tStaticType = (TAbstractType) result2_binding[0];
		TCall tAccess = (TCall) result2_binding[1];
		for (Object[] result2_black : MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_12_2_corematch_blackFFBBFFB(tStaticType, tAccess, match)) {
			Type arrayType = (Type) result2_black[0];
			MMethodInvocation invocation = (MMethodInvocation) result2_black[1];
			TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) result2_black[4];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result2_black[5];
			// ForEach 
			for (Object[] result3_black : MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_12_3_findcontext_blackBBBFBFFBB(arrayType, invocation,
							tStaticType, tAccess, mStaticTypeTotStaticType, invocationToTAccess)) {
				MAbstractMethodDefinition method = (MAbstractMethodDefinition) result3_black[3];
				ArrayType mStaticType = (ArrayType) result3_black[5];
				TypeAccess typeAccess = (TypeAccess) result3_black[6];
				Object[] result3_green = MethodInvocationStaticTypeArrayImpl
						.pattern_MethodInvocationStaticTypeArray_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFF(arrayType,
								invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
								mStaticTypeTotStaticType, invocationToTAccess);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge invocationToTAccess__invocation____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mStaticTypeTotStaticType__tStaticType____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge invocationToTAccess__tAccess____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge invocation__method____method = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge method__invocation____usages = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mStaticType__typeAccess____elementType = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge typeAccess__arrayType____type = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge arrayType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mStaticTypeTotStaticType__arrayType____source = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge tAccess__tStaticType____staticType = (EMoflonEdge) result3_green[19];

				Object[] result4_bindingAndBlack = MethodInvocationStaticTypeArrayImpl
						.pattern_MethodInvocationStaticTypeArray_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, arrayType, invocation, tStaticType, method, tAccess, mStaticType,
								typeAccess, mStaticTypeTotStaticType, invocationToTAccess);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[arrayType] = " + arrayType + ", "
							+ "[invocation] = " + invocation + ", " + "[tStaticType] = " + tStaticType + ", "
							+ "[method] = " + method + ", " + "[tAccess] = " + tAccess + ", " + "[mStaticType] = "
							+ mStaticType + ", " + "[typeAccess] = " + typeAccess + ", "
							+ "[mStaticTypeTotStaticType] = " + mStaticTypeTotStaticType + ", "
							+ "[invocationToTAccess] = " + invocationToTAccess + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (MethodInvocationStaticTypeArrayImpl
						.pattern_MethodInvocationStaticTypeArray_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = MethodInvocationStaticTypeArrayImpl
							.pattern_MethodInvocationStaticTypeArray_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					MethodInvocationStaticTypeArrayImpl
							.pattern_MethodInvocationStaticTypeArray_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAbstractType tStaticType, TCall tAccess) {
		match.registerObject("tStaticType", tStaticType);
		match.registerObject("tAccess", tAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAbstractType tStaticType, TCall tAccess) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Type arrayType,
			MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method, TCall tAccess,
			ArrayType mStaticType, TypeAccess typeAccess, TypeToTAbstractType mStaticTypeTotStaticType,
			AbstractMethodInvocationToTAccess invocationToTAccess) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("arrayType", arrayType);
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("tStaticType", tStaticType);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("mStaticType", mStaticType);
		isApplicableMatch.registerObject("typeAccess", typeAccess);
		isApplicableMatch.registerObject("mStaticTypeTotStaticType", mStaticTypeTotStaticType);
		isApplicableMatch.registerObject("invocationToTAccess", invocationToTAccess);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject arrayType, EObject invocation,
			EObject tStaticType, EObject method, EObject tAccess, EObject mStaticType, EObject typeAccess,
			EObject mStaticTypeTotStaticType, EObject invocationToTAccess) {
		ruleresult.registerObject("arrayType", arrayType);
		ruleresult.registerObject("invocation", invocation);
		ruleresult.registerObject("tStaticType", tStaticType);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("tAccess", tAccess);
		ruleresult.registerObject("mStaticType", mStaticType);
		ruleresult.registerObject("typeAccess", typeAccess);
		ruleresult.registerObject("mStaticTypeTotStaticType", mStaticTypeTotStaticType);
		ruleresult.registerObject("invocationToTAccess", invocationToTAccess);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_2(EMoflonEdge _edge_staticType) {

		Object[] result1_bindingAndBlack = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_20_2_testcorematchandDECs_blackFFB(_edge_staticType)) {
			TAbstractType tStaticType = (TAbstractType) result2_black[0];
			TCall tAccess = (TCall) result2_black[1];
			Object[] result2_green = MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tStaticType, tAccess)) {
				// 
				if (MethodInvocationStaticTypeArrayImpl
						.pattern_MethodInvocationStaticTypeArray_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodInvocationStaticTypeArrayImpl
							.pattern_MethodInvocationStaticTypeArray_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodInvocationStaticTypeArrayImpl
							.pattern_MethodInvocationStaticTypeArray_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodInvocationStaticTypeArrayImpl.pattern_MethodInvocationStaticTypeArray_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_2(EMoflonEdge _edge_mStaticType) {

		Object[] result1_bindingAndBlack = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_21_2_testcorematchandDECs_blackFFFFFB(_edge_mStaticType)) {
			Type arrayType = (Type) result2_black[0];
			MMethodInvocation invocation = (MMethodInvocation) result2_black[1];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_black[2];
			ArrayType mStaticType = (ArrayType) result2_black[3];
			TypeAccess typeAccess = (TypeAccess) result2_black[4];
			Object[] result2_green = MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, arrayType, invocation, method, mStaticType, typeAccess)) {
				// 
				if (MethodInvocationStaticTypeArrayImpl
						.pattern_MethodInvocationStaticTypeArray_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = MethodInvocationStaticTypeArrayImpl
							.pattern_MethodInvocationStaticTypeArray_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					MethodInvocationStaticTypeArrayImpl
							.pattern_MethodInvocationStaticTypeArray_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return MethodInvocationStaticTypeArrayImpl.pattern_MethodInvocationStaticTypeArray_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("MethodInvocationStaticTypeArray");
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
		ruleResult.setRule("MethodInvocationStaticTypeArray");
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

		Object[] result1_black = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Type arrayType = (Type) result2_bindingAndBlack[0];
		MMethodInvocation invocation = (MMethodInvocation) result2_bindingAndBlack[1];
		TAbstractType tStaticType = (TAbstractType) result2_bindingAndBlack[2];
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_bindingAndBlack[3];
		TCall tAccess = (TCall) result2_bindingAndBlack[4];
		ArrayType mStaticType = (ArrayType) result2_bindingAndBlack[5];
		TypeAccess typeAccess = (TypeAccess) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, arrayType,
						invocation, tStaticType, method, tAccess, mStaticType, typeAccess, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[arrayType] = " + arrayType + ", " + "[invocation] = " + invocation + ", " + "[tStaticType] = "
					+ tStaticType + ", " + "[method] = " + method + ", " + "[tAccess] = " + tAccess + ", "
					+ "[mStaticType] = " + mStaticType + ", " + "[typeAccess] = " + typeAccess + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_24_5_matchcorrcontext_blackBBBBFFBB(arrayType, invocation,
							tStaticType, tAccess, sourceMatch, targetMatch)) {
				TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) result5_black[4];
				AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result5_black[5];
				Object[] result5_green = MethodInvocationStaticTypeArrayImpl
						.pattern_MethodInvocationStaticTypeArray_24_5_matchcorrcontext_greenBBBBF(
								mStaticTypeTotStaticType, invocationToTAccess, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = MethodInvocationStaticTypeArrayImpl
						.pattern_MethodInvocationStaticTypeArray_24_6_createcorrespondence_blackBBBBBBBB(arrayType,
								invocation, tStaticType, method, tAccess, mStaticType, typeAccess, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[arrayType] = "
							+ arrayType + ", " + "[invocation] = " + invocation + ", " + "[tStaticType] = "
							+ tStaticType + ", " + "[method] = " + method + ", " + "[tAccess] = " + tAccess + ", "
							+ "[mStaticType] = " + mStaticType + ", " + "[typeAccess] = " + typeAccess + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = MethodInvocationStaticTypeArrayImpl
						.pattern_MethodInvocationStaticTypeArray_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				MethodInvocationStaticTypeArrayImpl
						.pattern_MethodInvocationStaticTypeArray_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return MethodInvocationStaticTypeArrayImpl.pattern_MethodInvocationStaticTypeArray_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Type arrayType, MMethodInvocation invocation, TAbstractType tStaticType,
			MAbstractMethodDefinition method, TCall tAccess, ArrayType mStaticType, TypeAccess typeAccess,
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
	public boolean checkDEC_FWD(Type arrayType, MMethodInvocation invocation, MAbstractMethodDefinition method,
			ArrayType mStaticType, TypeAccess typeAccess) {// 
		Object[] result1_black = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_27_1_matchtggpattern_blackBBBBB(arrayType, invocation, method,
						mStaticType, typeAccess);
		if (result1_black != null) {
			return MethodInvocationStaticTypeArrayImpl.pattern_MethodInvocationStaticTypeArray_27_2_expressionF();
		} else {
			return MethodInvocationStaticTypeArrayImpl.pattern_MethodInvocationStaticTypeArray_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAbstractType tStaticType, TCall tAccess) {// 
		Object[] result1_black = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_28_1_matchtggpattern_blackBB(tStaticType, tAccess);
		if (result1_black != null) {
			return MethodInvocationStaticTypeArrayImpl.pattern_MethodInvocationStaticTypeArray_28_2_expressionF();
		} else {
			return MethodInvocationStaticTypeArrayImpl.pattern_MethodInvocationStaticTypeArray_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mStaticTypeTotStaticTypeParameter,
			AbstractMethodInvocationToTAccess invocationToTAccessParameter) {

		Object[] result1_black = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_blackFFFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mStaticTypeTotStaticTypeList = (RuleEntryList) result2_black[0];
			Type arrayType = (Type) result2_black[1];
			TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) result2_black[2];
			TAbstractType tStaticType = (TAbstractType) result2_black[3];
			TypeAccess typeAccess = (TypeAccess) result2_black[4];
			ArrayType mStaticType = (ArrayType) result2_black[5];
			//nothing RuleEntryList invocationToTAccessList = (RuleEntryList) result2_black[6];
			MMethodInvocation invocation = (MMethodInvocation) result2_black[7];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_black[8];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result2_black[9];
			TCall tAccess = (TCall) result2_black[10];

			Object[] result3_bindingAndBlack = MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
							isApplicableMatch, arrayType, invocation, tStaticType, method, tAccess, mStaticType,
							typeAccess, mStaticTypeTotStaticType, invocationToTAccess, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[arrayType] = " + arrayType + ", "
						+ "[invocation] = " + invocation + ", " + "[tStaticType] = " + tStaticType + ", "
						+ "[method] = " + method + ", " + "[tAccess] = " + tAccess + ", " + "[mStaticType] = "
						+ mStaticType + ", " + "[typeAccess] = " + typeAccess + ", " + "[mStaticTypeTotStaticType] = "
						+ mStaticTypeTotStaticType + ", " + "[invocationToTAccess] = " + invocationToTAccess + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (MethodInvocationStaticTypeArrayImpl
					.pattern_MethodInvocationStaticTypeArray_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = MethodInvocationStaticTypeArrayImpl
						.pattern_MethodInvocationStaticTypeArray_29_5_checknacs_blackBBBBBBBBB(arrayType, invocation,
								tStaticType, method, tAccess, mStaticType, typeAccess, mStaticTypeTotStaticType,
								invocationToTAccess);
				if (result5_black != null) {

					Object[] result6_black = MethodInvocationStaticTypeArrayImpl
							.pattern_MethodInvocationStaticTypeArray_29_6_perform_blackBBBBBBBBBB(arrayType, invocation,
									tStaticType, method, tAccess, mStaticType, typeAccess, mStaticTypeTotStaticType,
									invocationToTAccess, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[arrayType] = "
								+ arrayType + ", " + "[invocation] = " + invocation + ", " + "[tStaticType] = "
								+ tStaticType + ", " + "[method] = " + method + ", " + "[tAccess] = " + tAccess + ", "
								+ "[mStaticType] = " + mStaticType + ", " + "[typeAccess] = " + typeAccess + ", "
								+ "[mStaticTypeTotStaticType] = " + mStaticTypeTotStaticType + ", "
								+ "[invocationToTAccess] = " + invocationToTAccess + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					MethodInvocationStaticTypeArrayImpl.pattern_MethodInvocationStaticTypeArray_29_6_perform_greenBBBBB(
							invocation, tStaticType, tAccess, mStaticType, ruleResult);

				} else {
				}

			} else {
			}

		}
		return MethodInvocationStaticTypeArrayImpl
				.pattern_MethodInvocationStaticTypeArray_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Type arrayType,
			MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method, TCall tAccess,
			ArrayType mStaticType, TypeAccess typeAccess, TypeToTAbstractType mStaticTypeTotStaticType,
			AbstractMethodInvocationToTAccess invocationToTAccess, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("arrayType", arrayType);
		isApplicableMatch.registerObject("invocation", invocation);
		isApplicableMatch.registerObject("tStaticType", tStaticType);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("tAccess", tAccess);
		isApplicableMatch.registerObject("mStaticType", mStaticType);
		isApplicableMatch.registerObject("typeAccess", typeAccess);
		isApplicableMatch.registerObject("mStaticTypeTotStaticType", mStaticTypeTotStaticType);
		isApplicableMatch.registerObject("invocationToTAccess", invocationToTAccess);
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
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___IS_APPROPRIATE_FWD__MATCH_TYPE_MMETHODINVOCATION_MABSTRACTMETHODDEFINITION_ARRAYTYPE_TYPEACCESS:
			return isAppropriate_FWD((Match) arguments.get(0), (Type) arguments.get(1),
					(MMethodInvocation) arguments.get(2), (MAbstractMethodDefinition) arguments.get(3),
					(ArrayType) arguments.get(4), (TypeAccess) arguments.get(5));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPE_MMETHODINVOCATION_MABSTRACTMETHODDEFINITION_ARRAYTYPE_TYPEACCESS:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Type) arguments.get(1),
					(MMethodInvocation) arguments.get(2), (MAbstractMethodDefinition) arguments.get(3),
					(ArrayType) arguments.get(4), (TypeAccess) arguments.get(5));
			return null;
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPE_MMETHODINVOCATION_MABSTRACTMETHODDEFINITION_ARRAYTYPE_TYPEACCESS:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Type) arguments.get(1),
					(MMethodInvocation) arguments.get(2), (MAbstractMethodDefinition) arguments.get(3),
					(ArrayType) arguments.get(4), (TypeAccess) arguments.get(5));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPE_MMETHODINVOCATION_TABSTRACTTYPE_MABSTRACTMETHODDEFINITION_TCALL_ARRAYTYPE_TYPEACCESS_TYPETOTABSTRACTTYPE_ABSTRACTMETHODINVOCATIONTOTACCESS:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Type) arguments.get(1),
					(MMethodInvocation) arguments.get(2), (TAbstractType) arguments.get(3),
					(MAbstractMethodDefinition) arguments.get(4), (TCall) arguments.get(5),
					(ArrayType) arguments.get(6), (TypeAccess) arguments.get(7), (TypeToTAbstractType) arguments.get(8),
					(AbstractMethodInvocationToTAccess) arguments.get(9));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___IS_APPROPRIATE_BWD__MATCH_TABSTRACTTYPE_TCALL:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TCall) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTTYPE_TCALL:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TCall) arguments.get(2));
			return null;
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTTYPE_TCALL:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TCall) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPE_MMETHODINVOCATION_TABSTRACTTYPE_MABSTRACTMETHODDEFINITION_TCALL_ARRAYTYPE_TYPEACCESS_TYPETOTABSTRACTTYPE_ABSTRACTMETHODINVOCATIONTOTACCESS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Type) arguments.get(1),
					(MMethodInvocation) arguments.get(2), (TAbstractType) arguments.get(3),
					(MAbstractMethodDefinition) arguments.get(4), (TCall) arguments.get(5),
					(ArrayType) arguments.get(6), (TypeAccess) arguments.get(7), (TypeToTAbstractType) arguments.get(8),
					(AbstractMethodInvocationToTAccess) arguments.get(9));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_2((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_2((EMoflonEdge) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___IS_APPLICABLE_SOLVE_CSP_CC__TYPE_MMETHODINVOCATION_TABSTRACTTYPE_MABSTRACTMETHODDEFINITION_TCALL_ARRAYTYPE_TYPEACCESS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Type) arguments.get(0), (MMethodInvocation) arguments.get(1),
					(TAbstractType) arguments.get(2), (MAbstractMethodDefinition) arguments.get(3),
					(TCall) arguments.get(4), (ArrayType) arguments.get(5), (TypeAccess) arguments.get(6),
					(Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___CHECK_DEC_FWD__TYPE_MMETHODINVOCATION_MABSTRACTMETHODDEFINITION_ARRAYTYPE_TYPEACCESS:
			return checkDEC_FWD((Type) arguments.get(0), (MMethodInvocation) arguments.get(1),
					(MAbstractMethodDefinition) arguments.get(2), (ArrayType) arguments.get(3),
					(TypeAccess) arguments.get(4));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___CHECK_DEC_BWD__TABSTRACTTYPE_TCALL:
			return checkDEC_BWD((TAbstractType) arguments.get(0), (TCall) arguments.get(1));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_ABSTRACTMETHODINVOCATIONTOTACCESS:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(AbstractMethodInvocationToTAccess) arguments.get(2));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPE_MMETHODINVOCATION_TABSTRACTTYPE_MABSTRACTMETHODDEFINITION_TCALL_ARRAYTYPE_TYPEACCESS_TYPETOTABSTRACTTYPE_ABSTRACTMETHODINVOCATIONTOTACCESS_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Type) arguments.get(1),
					(MMethodInvocation) arguments.get(2), (TAbstractType) arguments.get(3),
					(MAbstractMethodDefinition) arguments.get(4), (TCall) arguments.get(5),
					(ArrayType) arguments.get(6), (TypeAccess) arguments.get(7), (TypeToTAbstractType) arguments.get(8),
					(AbstractMethodInvocationToTAccess) arguments.get(9), (ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.METHOD_INVOCATION_STATIC_TYPE_ARRAY___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_0_1_initialbindings_blackBBBBBBB(
			MethodInvocationStaticTypeArray _this, Match match, Type arrayType, MMethodInvocation invocation,
			MAbstractMethodDefinition method, ArrayType mStaticType, TypeAccess typeAccess) {
		if (!arrayType.equals(mStaticType)) {
			return new Object[] { _this, match, arrayType, invocation, method, mStaticType, typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_0_2_SolveCSP_bindingFBBBBBBB(
			MethodInvocationStaticTypeArray _this, Match match, Type arrayType, MMethodInvocation invocation,
			MAbstractMethodDefinition method, ArrayType mStaticType, TypeAccess typeAccess) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, arrayType, invocation, method, mStaticType,
				typeAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, arrayType, invocation, method, mStaticType, typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
			MethodInvocationStaticTypeArray _this, Match match, Type arrayType, MMethodInvocation invocation,
			MAbstractMethodDefinition method, ArrayType mStaticType, TypeAccess typeAccess) {
		Object[] result_pattern_MethodInvocationStaticTypeArray_0_2_SolveCSP_binding = pattern_MethodInvocationStaticTypeArray_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, arrayType, invocation, method, mStaticType, typeAccess);
		if (result_pattern_MethodInvocationStaticTypeArray_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationStaticTypeArray_0_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodInvocationStaticTypeArray_0_2_SolveCSP_black = pattern_MethodInvocationStaticTypeArray_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationStaticTypeArray_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, arrayType, invocation, method, mStaticType, typeAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_0_3_CheckCSP_expressionFBB(
			MethodInvocationStaticTypeArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_0_4_collectelementstobetranslated_blackBBBBBB(
			Match match, Type arrayType, MMethodInvocation invocation, MAbstractMethodDefinition method,
			ArrayType mStaticType, TypeAccess typeAccess) {
		if (!arrayType.equals(mStaticType)) {
			return new Object[] { match, arrayType, invocation, method, mStaticType, typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_0_4_collectelementstobetranslated_greenBBBF(
			Match match, MMethodInvocation invocation, ArrayType mStaticType) {
		EMoflonEdge invocation__mStaticType____mStaticType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String invocation__mStaticType____mStaticType_name_prime = "mStaticType";
		invocation__mStaticType____mStaticType.setSrc(invocation);
		invocation__mStaticType____mStaticType.setTrg(mStaticType);
		match.getToBeTranslatedEdges().add(invocation__mStaticType____mStaticType);
		invocation__mStaticType____mStaticType.setName(invocation__mStaticType____mStaticType_name_prime);
		return new Object[] { match, invocation, mStaticType, invocation__mStaticType____mStaticType };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_0_5_collectcontextelements_blackBBBBBB(
			Match match, Type arrayType, MMethodInvocation invocation, MAbstractMethodDefinition method,
			ArrayType mStaticType, TypeAccess typeAccess) {
		if (!arrayType.equals(mStaticType)) {
			return new Object[] { match, arrayType, invocation, method, mStaticType, typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_0_5_collectcontextelements_greenBBBBBBFFFFF(
			Match match, Type arrayType, MMethodInvocation invocation, MAbstractMethodDefinition method,
			ArrayType mStaticType, TypeAccess typeAccess) {
		EMoflonEdge invocation__method____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mStaticType__typeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__arrayType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge arrayType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(arrayType);
		match.getContextNodes().add(invocation);
		match.getContextNodes().add(method);
		match.getContextNodes().add(mStaticType);
		match.getContextNodes().add(typeAccess);
		String invocation__method____method_name_prime = "method";
		String method__invocation____usages_name_prime = "usages";
		String mStaticType__typeAccess____elementType_name_prime = "elementType";
		String typeAccess__arrayType____type_name_prime = "type";
		String arrayType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		invocation__method____method.setSrc(invocation);
		invocation__method____method.setTrg(method);
		match.getContextEdges().add(invocation__method____method);
		method__invocation____usages.setSrc(method);
		method__invocation____usages.setTrg(invocation);
		match.getContextEdges().add(method__invocation____usages);
		mStaticType__typeAccess____elementType.setSrc(mStaticType);
		mStaticType__typeAccess____elementType.setTrg(typeAccess);
		match.getContextEdges().add(mStaticType__typeAccess____elementType);
		typeAccess__arrayType____type.setSrc(typeAccess);
		typeAccess__arrayType____type.setTrg(arrayType);
		match.getContextEdges().add(typeAccess__arrayType____type);
		arrayType__typeAccess____usagesInTypeAccess.setSrc(arrayType);
		arrayType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		match.getContextEdges().add(arrayType__typeAccess____usagesInTypeAccess);
		invocation__method____method.setName(invocation__method____method_name_prime);
		method__invocation____usages.setName(method__invocation____usages_name_prime);
		mStaticType__typeAccess____elementType.setName(mStaticType__typeAccess____elementType_name_prime);
		typeAccess__arrayType____type.setName(typeAccess__arrayType____type_name_prime);
		arrayType__typeAccess____usagesInTypeAccess.setName(arrayType__typeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { match, arrayType, invocation, method, mStaticType, typeAccess,
				invocation__method____method, method__invocation____usages, mStaticType__typeAccess____elementType,
				typeAccess__arrayType____type, arrayType__typeAccess____usagesInTypeAccess };
	}

	public static final void pattern_MethodInvocationStaticTypeArray_0_6_registerobjectstomatch_expressionBBBBBBB(
			MethodInvocationStaticTypeArray _this, Match match, Type arrayType, MMethodInvocation invocation,
			MAbstractMethodDefinition method, ArrayType mStaticType, TypeAccess typeAccess) {
		_this.registerObjectsToMatch_FWD(match, arrayType, invocation, method, mStaticType, typeAccess);

	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("arrayType");
		EObject _localVariable_1 = isApplicableMatch.getObject("invocation");
		EObject _localVariable_2 = isApplicableMatch.getObject("tStaticType");
		EObject _localVariable_3 = isApplicableMatch.getObject("method");
		EObject _localVariable_4 = isApplicableMatch.getObject("tAccess");
		EObject _localVariable_5 = isApplicableMatch.getObject("mStaticType");
		EObject _localVariable_6 = isApplicableMatch.getObject("typeAccess");
		EObject _localVariable_7 = isApplicableMatch.getObject("mStaticTypeTotStaticType");
		EObject _localVariable_8 = isApplicableMatch.getObject("invocationToTAccess");
		EObject tmpArrayType = _localVariable_0;
		EObject tmpInvocation = _localVariable_1;
		EObject tmpTStaticType = _localVariable_2;
		EObject tmpMethod = _localVariable_3;
		EObject tmpTAccess = _localVariable_4;
		EObject tmpMStaticType = _localVariable_5;
		EObject tmpTypeAccess = _localVariable_6;
		EObject tmpMStaticTypeTotStaticType = _localVariable_7;
		EObject tmpInvocationToTAccess = _localVariable_8;
		if (tmpArrayType instanceof Type) {
			Type arrayType = (Type) tmpArrayType;
			if (tmpInvocation instanceof MMethodInvocation) {
				MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
				if (tmpTStaticType instanceof TAbstractType) {
					TAbstractType tStaticType = (TAbstractType) tmpTStaticType;
					if (tmpMethod instanceof MAbstractMethodDefinition) {
						MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
						if (tmpTAccess instanceof TCall) {
							TCall tAccess = (TCall) tmpTAccess;
							if (tmpMStaticType instanceof ArrayType) {
								ArrayType mStaticType = (ArrayType) tmpMStaticType;
								if (tmpTypeAccess instanceof TypeAccess) {
									TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
									if (tmpMStaticTypeTotStaticType instanceof TypeToTAbstractType) {
										TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) tmpMStaticTypeTotStaticType;
										if (tmpInvocationToTAccess instanceof AbstractMethodInvocationToTAccess) {
											AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) tmpInvocationToTAccess;
											return new Object[] { arrayType, invocation, tStaticType, method, tAccess,
													mStaticType, typeAccess, mStaticTypeTotStaticType,
													invocationToTAccess, isApplicableMatch };
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

	public static final Object[] pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_blackBBBBBBBBBFBB(
			Type arrayType, MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method,
			TCall tAccess, ArrayType mStaticType, TypeAccess typeAccess, TypeToTAbstractType mStaticTypeTotStaticType,
			AbstractMethodInvocationToTAccess invocationToTAccess, MethodInvocationStaticTypeArray _this,
			IsApplicableMatch isApplicableMatch) {
		if (!arrayType.equals(mStaticType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
							mStaticTypeTotStaticType, invocationToTAccess, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			MethodInvocationStaticTypeArray _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_binding = pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_binding != null) {
			Type arrayType = (Type) result_pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_binding[0];
			MMethodInvocation invocation = (MMethodInvocation) result_pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_binding[1];
			TAbstractType tStaticType = (TAbstractType) result_pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_binding[2];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_binding[3];
			TCall tAccess = (TCall) result_pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_binding[4];
			ArrayType mStaticType = (ArrayType) result_pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_binding[5];
			TypeAccess typeAccess = (TypeAccess) result_pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_binding[6];
			TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) result_pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_binding[7];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result_pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_binding[8];

			Object[] result_pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_black = pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_blackBBBBBBBBBFBB(
					arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
					mStaticTypeTotStaticType, invocationToTAccess, _this, isApplicableMatch);
			if (result_pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_black[9];

				return new Object[] { arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
						mStaticTypeTotStaticType, invocationToTAccess, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_1_1_performtransformation_greenBB(
			TAbstractType tStaticType, TCall tAccess) {
		tAccess.setStaticType(tStaticType);
		return new Object[] { tStaticType, tAccess };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject arrayType, EObject invocation, EObject tStaticType, EObject method,
			EObject tAccess, EObject mStaticType, EObject typeAccess, EObject mStaticTypeTotStaticType,
			EObject invocationToTAccess) {
		if (!arrayType.equals(invocation)) {
			if (!arrayType.equals(tStaticType)) {
				if (!arrayType.equals(method)) {
					if (!arrayType.equals(tAccess)) {
						if (!arrayType.equals(mStaticType)) {
							if (!arrayType.equals(typeAccess)) {
								if (!arrayType.equals(mStaticTypeTotStaticType)) {
									if (!arrayType.equals(invocationToTAccess)) {
										if (!invocation.equals(tStaticType)) {
											if (!invocation.equals(method)) {
												if (!invocation.equals(tAccess)) {
													if (!invocation.equals(mStaticType)) {
														if (!invocation.equals(typeAccess)) {
															if (!invocation.equals(mStaticTypeTotStaticType)) {
																if (!invocation.equals(invocationToTAccess)) {
																	if (!tStaticType.equals(typeAccess)) {
																		if (!method.equals(tStaticType)) {
																			if (!method.equals(tAccess)) {
																				if (!method.equals(typeAccess)) {
																					if (!tAccess.equals(tStaticType)) {
																						if (!tAccess
																								.equals(typeAccess)) {
																							if (!mStaticType.equals(
																									tStaticType)) {
																								if (!mStaticType.equals(
																										method)) {
																									if (!mStaticType
																											.equals(tAccess)) {
																										if (!mStaticType
																												.equals(typeAccess)) {
																											if (!mStaticType
																													.equals(mStaticTypeTotStaticType)) {
																												if (!mStaticTypeTotStaticType
																														.equals(tStaticType)) {
																													if (!mStaticTypeTotStaticType
																															.equals(method)) {
																														if (!mStaticTypeTotStaticType
																																.equals(tAccess)) {
																															if (!mStaticTypeTotStaticType
																																	.equals(typeAccess)) {
																																if (!invocationToTAccess
																																		.equals(tStaticType)) {
																																	if (!invocationToTAccess
																																			.equals(method)) {
																																		if (!invocationToTAccess
																																				.equals(tAccess)) {
																																			if (!invocationToTAccess
																																					.equals(mStaticType)) {
																																				if (!invocationToTAccess
																																						.equals(typeAccess)) {
																																					if (!invocationToTAccess
																																							.equals(mStaticTypeTotStaticType)) {
																																						return new Object[] {
																																								ruleresult,
																																								arrayType,
																																								invocation,
																																								tStaticType,
																																								method,
																																								tAccess,
																																								mStaticType,
																																								typeAccess,
																																								mStaticTypeTotStaticType,
																																								invocationToTAccess };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodInvocationStaticTypeArray_1_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject invocation, EObject tStaticType, EObject tAccess,
			EObject mStaticType) {
		EMoflonEdge invocation__mStaticType____mStaticType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tStaticType____staticType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodInvocationStaticTypeArray";
		String invocation__mStaticType____mStaticType_name_prime = "mStaticType";
		String tAccess__tStaticType____staticType_name_prime = "staticType";
		invocation__mStaticType____mStaticType.setSrc(invocation);
		invocation__mStaticType____mStaticType.setTrg(mStaticType);
		ruleresult.getTranslatedEdges().add(invocation__mStaticType____mStaticType);
		tAccess__tStaticType____staticType.setSrc(tAccess);
		tAccess__tStaticType____staticType.setTrg(tStaticType);
		ruleresult.getCreatedEdges().add(tAccess__tStaticType____staticType);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		invocation__mStaticType____mStaticType.setName(invocation__mStaticType____mStaticType_name_prime);
		tAccess__tStaticType____staticType.setName(tAccess__tStaticType____staticType_name_prime);
		return new Object[] { ruleresult, invocation, tStaticType, tAccess, mStaticType,
				invocation__mStaticType____mStaticType, tAccess__tStaticType____staticType };
	}

	public static final void pattern_MethodInvocationStaticTypeArray_1_5_registerobjects_expressionBBBBBBBBBBB(
			MethodInvocationStaticTypeArray _this, PerformRuleResult ruleresult, EObject arrayType, EObject invocation,
			EObject tStaticType, EObject method, EObject tAccess, EObject mStaticType, EObject typeAccess,
			EObject mStaticTypeTotStaticType, EObject invocationToTAccess) {
		_this.registerObjects_FWD(ruleresult, arrayType, invocation, tStaticType, method, tAccess, mStaticType,
				typeAccess, mStaticTypeTotStaticType, invocationToTAccess);

	}

	public static final PerformRuleResult pattern_MethodInvocationStaticTypeArray_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_2_1_preparereturnvalue_bindingFB(
			MethodInvocationStaticTypeArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_2_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodInvocationStaticTypeArray _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_2_1_preparereturnvalue_bindingAndBlackFFB(
			MethodInvocationStaticTypeArray _this) {
		Object[] result_pattern_MethodInvocationStaticTypeArray_2_1_preparereturnvalue_binding = pattern_MethodInvocationStaticTypeArray_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationStaticTypeArray_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodInvocationStaticTypeArray_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationStaticTypeArray_2_1_preparereturnvalue_black = pattern_MethodInvocationStaticTypeArray_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodInvocationStaticTypeArray_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodInvocationStaticTypeArray_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodInvocationStaticTypeArray";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("arrayType");
		EObject _localVariable_1 = match.getObject("invocation");
		EObject _localVariable_2 = match.getObject("method");
		EObject _localVariable_3 = match.getObject("mStaticType");
		EObject _localVariable_4 = match.getObject("typeAccess");
		EObject tmpArrayType = _localVariable_0;
		EObject tmpInvocation = _localVariable_1;
		EObject tmpMethod = _localVariable_2;
		EObject tmpMStaticType = _localVariable_3;
		EObject tmpTypeAccess = _localVariable_4;
		if (tmpArrayType instanceof Type) {
			Type arrayType = (Type) tmpArrayType;
			if (tmpInvocation instanceof MMethodInvocation) {
				MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
				if (tmpMethod instanceof MAbstractMethodDefinition) {
					MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
					if (tmpMStaticType instanceof ArrayType) {
						ArrayType mStaticType = (ArrayType) tmpMStaticType;
						if (tmpTypeAccess instanceof TypeAccess) {
							TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
							return new Object[] { arrayType, invocation, method, mStaticType, typeAccess, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationStaticTypeArray_2_2_corematch_blackBBFBFBBFFB(
			Type arrayType, MMethodInvocation invocation, MAbstractMethodDefinition method, ArrayType mStaticType,
			TypeAccess typeAccess, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!arrayType.equals(mStaticType)) {
			for (AbstractMethodInvocationToTAccess invocationToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(invocation, AbstractMethodInvocationToTAccess.class, "source")) {
				TAccess tmpTAccess = invocationToTAccess.getTarget();
				if (tmpTAccess instanceof TCall) {
					TCall tAccess = (TCall) tmpTAccess;
					for (TypeToTAbstractType mStaticTypeTotStaticType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(arrayType, TypeToTAbstractType.class, "source")) {
						TAbstractType tStaticType = mStaticTypeTotStaticType.getTarget();
						if (tStaticType != null) {
							_result.add(new Object[] { arrayType, invocation, tStaticType, method, tAccess, mStaticType,
									typeAccess, mStaticTypeTotStaticType, invocationToTAccess, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationStaticTypeArray_2_3_findcontext_blackBBBBBBBBB(
			Type arrayType, MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method,
			TCall tAccess, ArrayType mStaticType, TypeAccess typeAccess, TypeToTAbstractType mStaticTypeTotStaticType,
			AbstractMethodInvocationToTAccess invocationToTAccess) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!arrayType.equals(mStaticType)) {
			if (mStaticType.equals(invocation.getMStaticType())) {
				if (invocation.equals(invocationToTAccess.getSource())) {
					if (tStaticType.equals(mStaticTypeTotStaticType.getTarget())) {
						if (tAccess.equals(invocationToTAccess.getTarget())) {
							if (method.equals(invocation.getMethod())) {
								if (typeAccess.equals(mStaticType.getElementType())) {
									if (arrayType.equals(typeAccess.getType())) {
										if (arrayType.equals(mStaticTypeTotStaticType.getSource())) {
											_result.add(new Object[] { arrayType, invocation, tStaticType, method,
													tAccess, mStaticType, typeAccess, mStaticTypeTotStaticType,
													invocationToTAccess });
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

	public static final Object[] pattern_MethodInvocationStaticTypeArray_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFF(
			Type arrayType, MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method,
			TCall tAccess, ArrayType mStaticType, TypeAccess typeAccess, TypeToTAbstractType mStaticTypeTotStaticType,
			AbstractMethodInvocationToTAccess invocationToTAccess) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge invocation__mStaticType____mStaticType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mStaticTypeTotStaticType__tStaticType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocation__method____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mStaticType__typeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__arrayType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge arrayType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mStaticTypeTotStaticType__arrayType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String invocation__mStaticType____mStaticType_name_prime = "mStaticType";
		String invocationToTAccess__invocation____source_name_prime = "source";
		String mStaticTypeTotStaticType__tStaticType____target_name_prime = "target";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		String invocation__method____method_name_prime = "method";
		String method__invocation____usages_name_prime = "usages";
		String mStaticType__typeAccess____elementType_name_prime = "elementType";
		String typeAccess__arrayType____type_name_prime = "type";
		String arrayType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mStaticTypeTotStaticType__arrayType____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(arrayType);
		isApplicableMatch.getAllContextElements().add(invocation);
		isApplicableMatch.getAllContextElements().add(tStaticType);
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(mStaticType);
		isApplicableMatch.getAllContextElements().add(typeAccess);
		isApplicableMatch.getAllContextElements().add(mStaticTypeTotStaticType);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess);
		invocation__mStaticType____mStaticType.setSrc(invocation);
		invocation__mStaticType____mStaticType.setTrg(mStaticType);
		isApplicableMatch.getAllContextElements().add(invocation__mStaticType____mStaticType);
		invocationToTAccess__invocation____source.setSrc(invocationToTAccess);
		invocationToTAccess__invocation____source.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__invocation____source);
		mStaticTypeTotStaticType__tStaticType____target.setSrc(mStaticTypeTotStaticType);
		mStaticTypeTotStaticType__tStaticType____target.setTrg(tStaticType);
		isApplicableMatch.getAllContextElements().add(mStaticTypeTotStaticType__tStaticType____target);
		invocationToTAccess__tAccess____target.setSrc(invocationToTAccess);
		invocationToTAccess__tAccess____target.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__tAccess____target);
		invocation__method____method.setSrc(invocation);
		invocation__method____method.setTrg(method);
		isApplicableMatch.getAllContextElements().add(invocation__method____method);
		method__invocation____usages.setSrc(method);
		method__invocation____usages.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(method__invocation____usages);
		mStaticType__typeAccess____elementType.setSrc(mStaticType);
		mStaticType__typeAccess____elementType.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(mStaticType__typeAccess____elementType);
		typeAccess__arrayType____type.setSrc(typeAccess);
		typeAccess__arrayType____type.setTrg(arrayType);
		isApplicableMatch.getAllContextElements().add(typeAccess__arrayType____type);
		arrayType__typeAccess____usagesInTypeAccess.setSrc(arrayType);
		arrayType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(arrayType__typeAccess____usagesInTypeAccess);
		mStaticTypeTotStaticType__arrayType____source.setSrc(mStaticTypeTotStaticType);
		mStaticTypeTotStaticType__arrayType____source.setTrg(arrayType);
		isApplicableMatch.getAllContextElements().add(mStaticTypeTotStaticType__arrayType____source);
		invocation__mStaticType____mStaticType.setName(invocation__mStaticType____mStaticType_name_prime);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		mStaticTypeTotStaticType__tStaticType____target
				.setName(mStaticTypeTotStaticType__tStaticType____target_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		invocation__method____method.setName(invocation__method____method_name_prime);
		method__invocation____usages.setName(method__invocation____usages_name_prime);
		mStaticType__typeAccess____elementType.setName(mStaticType__typeAccess____elementType_name_prime);
		typeAccess__arrayType____type.setName(typeAccess__arrayType____type_name_prime);
		arrayType__typeAccess____usagesInTypeAccess.setName(arrayType__typeAccess____usagesInTypeAccess_name_prime);
		mStaticTypeTotStaticType__arrayType____source.setName(mStaticTypeTotStaticType__arrayType____source_name_prime);
		return new Object[] { arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
				mStaticTypeTotStaticType, invocationToTAccess, isApplicableMatch,
				invocation__mStaticType____mStaticType, invocationToTAccess__invocation____source,
				mStaticTypeTotStaticType__tStaticType____target, invocationToTAccess__tAccess____target,
				invocation__method____method, method__invocation____usages, mStaticType__typeAccess____elementType,
				typeAccess__arrayType____type, arrayType__typeAccess____usagesInTypeAccess,
				mStaticTypeTotStaticType__arrayType____source };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_2_4_solveCSP_bindingFBBBBBBBBBBB(
			MethodInvocationStaticTypeArray _this, IsApplicableMatch isApplicableMatch, Type arrayType,
			MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method, TCall tAccess,
			ArrayType mStaticType, TypeAccess typeAccess, TypeToTAbstractType mStaticTypeTotStaticType,
			AbstractMethodInvocationToTAccess invocationToTAccess) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, arrayType, invocation, tStaticType,
				method, tAccess, mStaticType, typeAccess, mStaticTypeTotStaticType, invocationToTAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, arrayType, invocation, tStaticType, method, tAccess,
					mStaticType, typeAccess, mStaticTypeTotStaticType, invocationToTAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			MethodInvocationStaticTypeArray _this, IsApplicableMatch isApplicableMatch, Type arrayType,
			MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method, TCall tAccess,
			ArrayType mStaticType, TypeAccess typeAccess, TypeToTAbstractType mStaticTypeTotStaticType,
			AbstractMethodInvocationToTAccess invocationToTAccess) {
		Object[] result_pattern_MethodInvocationStaticTypeArray_2_4_solveCSP_binding = pattern_MethodInvocationStaticTypeArray_2_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
				mStaticTypeTotStaticType, invocationToTAccess);
		if (result_pattern_MethodInvocationStaticTypeArray_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationStaticTypeArray_2_4_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationStaticTypeArray_2_4_solveCSP_black = pattern_MethodInvocationStaticTypeArray_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationStaticTypeArray_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, arrayType, invocation, tStaticType, method,
						tAccess, mStaticType, typeAccess, mStaticTypeTotStaticType, invocationToTAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_2_5_checkCSP_expressionFBB(
			MethodInvocationStaticTypeArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodInvocationStaticTypeArray";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationStaticTypeArray_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_10_1_initialbindings_blackBBBB(
			MethodInvocationStaticTypeArray _this, Match match, TAbstractType tStaticType, TCall tAccess) {
		return new Object[] { _this, match, tStaticType, tAccess };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_10_2_SolveCSP_bindingFBBBB(
			MethodInvocationStaticTypeArray _this, Match match, TAbstractType tStaticType, TCall tAccess) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tStaticType, tAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tStaticType, tAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_10_2_SolveCSP_bindingAndBlackFBBBB(
			MethodInvocationStaticTypeArray _this, Match match, TAbstractType tStaticType, TCall tAccess) {
		Object[] result_pattern_MethodInvocationStaticTypeArray_10_2_SolveCSP_binding = pattern_MethodInvocationStaticTypeArray_10_2_SolveCSP_bindingFBBBB(
				_this, match, tStaticType, tAccess);
		if (result_pattern_MethodInvocationStaticTypeArray_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationStaticTypeArray_10_2_SolveCSP_binding[0];

			Object[] result_pattern_MethodInvocationStaticTypeArray_10_2_SolveCSP_black = pattern_MethodInvocationStaticTypeArray_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationStaticTypeArray_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tStaticType, tAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_10_3_CheckCSP_expressionFBB(
			MethodInvocationStaticTypeArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_10_4_collectelementstobetranslated_blackBBB(
			Match match, TAbstractType tStaticType, TCall tAccess) {
		return new Object[] { match, tStaticType, tAccess };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_10_4_collectelementstobetranslated_greenBBBF(
			Match match, TAbstractType tStaticType, TCall tAccess) {
		EMoflonEdge tAccess__tStaticType____staticType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tAccess__tStaticType____staticType_name_prime = "staticType";
		tAccess__tStaticType____staticType.setSrc(tAccess);
		tAccess__tStaticType____staticType.setTrg(tStaticType);
		match.getToBeTranslatedEdges().add(tAccess__tStaticType____staticType);
		tAccess__tStaticType____staticType.setName(tAccess__tStaticType____staticType_name_prime);
		return new Object[] { match, tStaticType, tAccess, tAccess__tStaticType____staticType };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_10_5_collectcontextelements_blackBBB(
			Match match, TAbstractType tStaticType, TCall tAccess) {
		return new Object[] { match, tStaticType, tAccess };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_10_5_collectcontextelements_greenBBB(
			Match match, TAbstractType tStaticType, TCall tAccess) {
		match.getContextNodes().add(tStaticType);
		match.getContextNodes().add(tAccess);
		return new Object[] { match, tStaticType, tAccess };
	}

	public static final void pattern_MethodInvocationStaticTypeArray_10_6_registerobjectstomatch_expressionBBBB(
			MethodInvocationStaticTypeArray _this, Match match, TAbstractType tStaticType, TCall tAccess) {
		_this.registerObjectsToMatch_BWD(match, tStaticType, tAccess);

	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("arrayType");
		EObject _localVariable_1 = isApplicableMatch.getObject("invocation");
		EObject _localVariable_2 = isApplicableMatch.getObject("tStaticType");
		EObject _localVariable_3 = isApplicableMatch.getObject("method");
		EObject _localVariable_4 = isApplicableMatch.getObject("tAccess");
		EObject _localVariable_5 = isApplicableMatch.getObject("mStaticType");
		EObject _localVariable_6 = isApplicableMatch.getObject("typeAccess");
		EObject _localVariable_7 = isApplicableMatch.getObject("mStaticTypeTotStaticType");
		EObject _localVariable_8 = isApplicableMatch.getObject("invocationToTAccess");
		EObject tmpArrayType = _localVariable_0;
		EObject tmpInvocation = _localVariable_1;
		EObject tmpTStaticType = _localVariable_2;
		EObject tmpMethod = _localVariable_3;
		EObject tmpTAccess = _localVariable_4;
		EObject tmpMStaticType = _localVariable_5;
		EObject tmpTypeAccess = _localVariable_6;
		EObject tmpMStaticTypeTotStaticType = _localVariable_7;
		EObject tmpInvocationToTAccess = _localVariable_8;
		if (tmpArrayType instanceof Type) {
			Type arrayType = (Type) tmpArrayType;
			if (tmpInvocation instanceof MMethodInvocation) {
				MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
				if (tmpTStaticType instanceof TAbstractType) {
					TAbstractType tStaticType = (TAbstractType) tmpTStaticType;
					if (tmpMethod instanceof MAbstractMethodDefinition) {
						MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
						if (tmpTAccess instanceof TCall) {
							TCall tAccess = (TCall) tmpTAccess;
							if (tmpMStaticType instanceof ArrayType) {
								ArrayType mStaticType = (ArrayType) tmpMStaticType;
								if (tmpTypeAccess instanceof TypeAccess) {
									TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
									if (tmpMStaticTypeTotStaticType instanceof TypeToTAbstractType) {
										TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) tmpMStaticTypeTotStaticType;
										if (tmpInvocationToTAccess instanceof AbstractMethodInvocationToTAccess) {
											AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) tmpInvocationToTAccess;
											return new Object[] { arrayType, invocation, tStaticType, method, tAccess,
													mStaticType, typeAccess, mStaticTypeTotStaticType,
													invocationToTAccess, isApplicableMatch };
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

	public static final Object[] pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_blackBBBBBBBBBFBB(
			Type arrayType, MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method,
			TCall tAccess, ArrayType mStaticType, TypeAccess typeAccess, TypeToTAbstractType mStaticTypeTotStaticType,
			AbstractMethodInvocationToTAccess invocationToTAccess, MethodInvocationStaticTypeArray _this,
			IsApplicableMatch isApplicableMatch) {
		if (!arrayType.equals(mStaticType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
							mStaticTypeTotStaticType, invocationToTAccess, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			MethodInvocationStaticTypeArray _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_binding = pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_binding != null) {
			Type arrayType = (Type) result_pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_binding[0];
			MMethodInvocation invocation = (MMethodInvocation) result_pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_binding[1];
			TAbstractType tStaticType = (TAbstractType) result_pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_binding[2];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_binding[3];
			TCall tAccess = (TCall) result_pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_binding[4];
			ArrayType mStaticType = (ArrayType) result_pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_binding[5];
			TypeAccess typeAccess = (TypeAccess) result_pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_binding[6];
			TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) result_pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_binding[7];
			AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) result_pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_binding[8];

			Object[] result_pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_black = pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_blackBBBBBBBBBFBB(
					arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
					mStaticTypeTotStaticType, invocationToTAccess, _this, isApplicableMatch);
			if (result_pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_black[9];

				return new Object[] { arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
						mStaticTypeTotStaticType, invocationToTAccess, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_11_1_performtransformation_greenBB(
			MMethodInvocation invocation, ArrayType mStaticType) {
		invocation.setMStaticType(mStaticType);
		return new Object[] { invocation, mStaticType };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject arrayType, EObject invocation, EObject tStaticType, EObject method,
			EObject tAccess, EObject mStaticType, EObject typeAccess, EObject mStaticTypeTotStaticType,
			EObject invocationToTAccess) {
		if (!arrayType.equals(invocation)) {
			if (!arrayType.equals(tStaticType)) {
				if (!arrayType.equals(method)) {
					if (!arrayType.equals(tAccess)) {
						if (!arrayType.equals(mStaticType)) {
							if (!arrayType.equals(typeAccess)) {
								if (!arrayType.equals(mStaticTypeTotStaticType)) {
									if (!arrayType.equals(invocationToTAccess)) {
										if (!invocation.equals(tStaticType)) {
											if (!invocation.equals(method)) {
												if (!invocation.equals(tAccess)) {
													if (!invocation.equals(mStaticType)) {
														if (!invocation.equals(typeAccess)) {
															if (!invocation.equals(mStaticTypeTotStaticType)) {
																if (!invocation.equals(invocationToTAccess)) {
																	if (!tStaticType.equals(typeAccess)) {
																		if (!method.equals(tStaticType)) {
																			if (!method.equals(tAccess)) {
																				if (!method.equals(typeAccess)) {
																					if (!tAccess.equals(tStaticType)) {
																						if (!tAccess
																								.equals(typeAccess)) {
																							if (!mStaticType.equals(
																									tStaticType)) {
																								if (!mStaticType.equals(
																										method)) {
																									if (!mStaticType
																											.equals(tAccess)) {
																										if (!mStaticType
																												.equals(typeAccess)) {
																											if (!mStaticType
																													.equals(mStaticTypeTotStaticType)) {
																												if (!mStaticTypeTotStaticType
																														.equals(tStaticType)) {
																													if (!mStaticTypeTotStaticType
																															.equals(method)) {
																														if (!mStaticTypeTotStaticType
																																.equals(tAccess)) {
																															if (!mStaticTypeTotStaticType
																																	.equals(typeAccess)) {
																																if (!invocationToTAccess
																																		.equals(tStaticType)) {
																																	if (!invocationToTAccess
																																			.equals(method)) {
																																		if (!invocationToTAccess
																																				.equals(tAccess)) {
																																			if (!invocationToTAccess
																																					.equals(mStaticType)) {
																																				if (!invocationToTAccess
																																						.equals(typeAccess)) {
																																					if (!invocationToTAccess
																																							.equals(mStaticTypeTotStaticType)) {
																																						return new Object[] {
																																								ruleresult,
																																								arrayType,
																																								invocation,
																																								tStaticType,
																																								method,
																																								tAccess,
																																								mStaticType,
																																								typeAccess,
																																								mStaticTypeTotStaticType,
																																								invocationToTAccess };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_MethodInvocationStaticTypeArray_11_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject invocation, EObject tStaticType, EObject tAccess,
			EObject mStaticType) {
		EMoflonEdge invocation__mStaticType____mStaticType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tStaticType____staticType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "MethodInvocationStaticTypeArray";
		String invocation__mStaticType____mStaticType_name_prime = "mStaticType";
		String tAccess__tStaticType____staticType_name_prime = "staticType";
		invocation__mStaticType____mStaticType.setSrc(invocation);
		invocation__mStaticType____mStaticType.setTrg(mStaticType);
		ruleresult.getCreatedEdges().add(invocation__mStaticType____mStaticType);
		tAccess__tStaticType____staticType.setSrc(tAccess);
		tAccess__tStaticType____staticType.setTrg(tStaticType);
		ruleresult.getTranslatedEdges().add(tAccess__tStaticType____staticType);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		invocation__mStaticType____mStaticType.setName(invocation__mStaticType____mStaticType_name_prime);
		tAccess__tStaticType____staticType.setName(tAccess__tStaticType____staticType_name_prime);
		return new Object[] { ruleresult, invocation, tStaticType, tAccess, mStaticType,
				invocation__mStaticType____mStaticType, tAccess__tStaticType____staticType };
	}

	public static final void pattern_MethodInvocationStaticTypeArray_11_5_registerobjects_expressionBBBBBBBBBBB(
			MethodInvocationStaticTypeArray _this, PerformRuleResult ruleresult, EObject arrayType, EObject invocation,
			EObject tStaticType, EObject method, EObject tAccess, EObject mStaticType, EObject typeAccess,
			EObject mStaticTypeTotStaticType, EObject invocationToTAccess) {
		_this.registerObjects_BWD(ruleresult, arrayType, invocation, tStaticType, method, tAccess, mStaticType,
				typeAccess, mStaticTypeTotStaticType, invocationToTAccess);

	}

	public static final PerformRuleResult pattern_MethodInvocationStaticTypeArray_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_12_1_preparereturnvalue_bindingFB(
			MethodInvocationStaticTypeArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_12_1_preparereturnvalue_blackFBB(EClass eClass,
			MethodInvocationStaticTypeArray _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_12_1_preparereturnvalue_bindingAndBlackFFB(
			MethodInvocationStaticTypeArray _this) {
		Object[] result_pattern_MethodInvocationStaticTypeArray_12_1_preparereturnvalue_binding = pattern_MethodInvocationStaticTypeArray_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationStaticTypeArray_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_MethodInvocationStaticTypeArray_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationStaticTypeArray_12_1_preparereturnvalue_black = pattern_MethodInvocationStaticTypeArray_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_MethodInvocationStaticTypeArray_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_MethodInvocationStaticTypeArray_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "MethodInvocationStaticTypeArray";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tStaticType");
		EObject _localVariable_1 = match.getObject("tAccess");
		EObject tmpTStaticType = _localVariable_0;
		EObject tmpTAccess = _localVariable_1;
		if (tmpTStaticType instanceof TAbstractType) {
			TAbstractType tStaticType = (TAbstractType) tmpTStaticType;
			if (tmpTAccess instanceof TCall) {
				TCall tAccess = (TCall) tmpTAccess;
				return new Object[] { tStaticType, tAccess, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationStaticTypeArray_12_2_corematch_blackFFBBFFB(
			TAbstractType tStaticType, TCall tAccess, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mStaticTypeTotStaticType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tStaticType, TypeToTAbstractType.class, "target")) {
			Type arrayType = mStaticTypeTotStaticType.getSource();
			if (arrayType != null) {
				for (AbstractMethodInvocationToTAccess invocationToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tAccess, AbstractMethodInvocationToTAccess.class, "target")) {
					AbstractMethodInvocation tmpInvocation = invocationToTAccess.getSource();
					if (tmpInvocation instanceof MMethodInvocation) {
						MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
						_result.add(new Object[] { arrayType, invocation, tStaticType, tAccess,
								mStaticTypeTotStaticType, invocationToTAccess, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationStaticTypeArray_12_3_findcontext_blackBBBFBFFBB(
			Type arrayType, MMethodInvocation invocation, TAbstractType tStaticType, TCall tAccess,
			TypeToTAbstractType mStaticTypeTotStaticType, AbstractMethodInvocationToTAccess invocationToTAccess) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (invocation.equals(invocationToTAccess.getSource())) {
			if (tStaticType.equals(mStaticTypeTotStaticType.getTarget())) {
				if (tAccess.equals(invocationToTAccess.getTarget())) {
					if (arrayType.equals(mStaticTypeTotStaticType.getSource())) {
						if (tStaticType.equals(tAccess.getStaticType())) {
							AbstractMethodDeclaration tmpMethod = invocation.getMethod();
							if (tmpMethod instanceof MAbstractMethodDefinition) {
								MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
								for (TypeAccess typeAccess : arrayType.getUsagesInTypeAccess()) {
									for (ArrayType mStaticType : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(typeAccess, ArrayType.class, "elementType")) {
										if (!arrayType.equals(mStaticType)) {
											_result.add(new Object[] { arrayType, invocation, tStaticType, method,
													tAccess, mStaticType, typeAccess, mStaticTypeTotStaticType,
													invocationToTAccess });
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

	public static final Object[] pattern_MethodInvocationStaticTypeArray_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFF(
			Type arrayType, MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method,
			TCall tAccess, ArrayType mStaticType, TypeAccess typeAccess, TypeToTAbstractType mStaticTypeTotStaticType,
			AbstractMethodInvocationToTAccess invocationToTAccess) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge invocationToTAccess__invocation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mStaticTypeTotStaticType__tStaticType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocationToTAccess__tAccess____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge invocation__method____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__invocation____usages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mStaticType__typeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__arrayType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge arrayType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mStaticTypeTotStaticType__arrayType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAccess__tStaticType____staticType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String invocationToTAccess__invocation____source_name_prime = "source";
		String mStaticTypeTotStaticType__tStaticType____target_name_prime = "target";
		String invocationToTAccess__tAccess____target_name_prime = "target";
		String invocation__method____method_name_prime = "method";
		String method__invocation____usages_name_prime = "usages";
		String mStaticType__typeAccess____elementType_name_prime = "elementType";
		String typeAccess__arrayType____type_name_prime = "type";
		String arrayType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String mStaticTypeTotStaticType__arrayType____source_name_prime = "source";
		String tAccess__tStaticType____staticType_name_prime = "staticType";
		isApplicableMatch.getAllContextElements().add(arrayType);
		isApplicableMatch.getAllContextElements().add(invocation);
		isApplicableMatch.getAllContextElements().add(tStaticType);
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(tAccess);
		isApplicableMatch.getAllContextElements().add(mStaticType);
		isApplicableMatch.getAllContextElements().add(typeAccess);
		isApplicableMatch.getAllContextElements().add(mStaticTypeTotStaticType);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess);
		invocationToTAccess__invocation____source.setSrc(invocationToTAccess);
		invocationToTAccess__invocation____source.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__invocation____source);
		mStaticTypeTotStaticType__tStaticType____target.setSrc(mStaticTypeTotStaticType);
		mStaticTypeTotStaticType__tStaticType____target.setTrg(tStaticType);
		isApplicableMatch.getAllContextElements().add(mStaticTypeTotStaticType__tStaticType____target);
		invocationToTAccess__tAccess____target.setSrc(invocationToTAccess);
		invocationToTAccess__tAccess____target.setTrg(tAccess);
		isApplicableMatch.getAllContextElements().add(invocationToTAccess__tAccess____target);
		invocation__method____method.setSrc(invocation);
		invocation__method____method.setTrg(method);
		isApplicableMatch.getAllContextElements().add(invocation__method____method);
		method__invocation____usages.setSrc(method);
		method__invocation____usages.setTrg(invocation);
		isApplicableMatch.getAllContextElements().add(method__invocation____usages);
		mStaticType__typeAccess____elementType.setSrc(mStaticType);
		mStaticType__typeAccess____elementType.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(mStaticType__typeAccess____elementType);
		typeAccess__arrayType____type.setSrc(typeAccess);
		typeAccess__arrayType____type.setTrg(arrayType);
		isApplicableMatch.getAllContextElements().add(typeAccess__arrayType____type);
		arrayType__typeAccess____usagesInTypeAccess.setSrc(arrayType);
		arrayType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(arrayType__typeAccess____usagesInTypeAccess);
		mStaticTypeTotStaticType__arrayType____source.setSrc(mStaticTypeTotStaticType);
		mStaticTypeTotStaticType__arrayType____source.setTrg(arrayType);
		isApplicableMatch.getAllContextElements().add(mStaticTypeTotStaticType__arrayType____source);
		tAccess__tStaticType____staticType.setSrc(tAccess);
		tAccess__tStaticType____staticType.setTrg(tStaticType);
		isApplicableMatch.getAllContextElements().add(tAccess__tStaticType____staticType);
		invocationToTAccess__invocation____source.setName(invocationToTAccess__invocation____source_name_prime);
		mStaticTypeTotStaticType__tStaticType____target
				.setName(mStaticTypeTotStaticType__tStaticType____target_name_prime);
		invocationToTAccess__tAccess____target.setName(invocationToTAccess__tAccess____target_name_prime);
		invocation__method____method.setName(invocation__method____method_name_prime);
		method__invocation____usages.setName(method__invocation____usages_name_prime);
		mStaticType__typeAccess____elementType.setName(mStaticType__typeAccess____elementType_name_prime);
		typeAccess__arrayType____type.setName(typeAccess__arrayType____type_name_prime);
		arrayType__typeAccess____usagesInTypeAccess.setName(arrayType__typeAccess____usagesInTypeAccess_name_prime);
		mStaticTypeTotStaticType__arrayType____source.setName(mStaticTypeTotStaticType__arrayType____source_name_prime);
		tAccess__tStaticType____staticType.setName(tAccess__tStaticType____staticType_name_prime);
		return new Object[] { arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
				mStaticTypeTotStaticType, invocationToTAccess, isApplicableMatch,
				invocationToTAccess__invocation____source, mStaticTypeTotStaticType__tStaticType____target,
				invocationToTAccess__tAccess____target, invocation__method____method, method__invocation____usages,
				mStaticType__typeAccess____elementType, typeAccess__arrayType____type,
				arrayType__typeAccess____usagesInTypeAccess, mStaticTypeTotStaticType__arrayType____source,
				tAccess__tStaticType____staticType };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_12_4_solveCSP_bindingFBBBBBBBBBBB(
			MethodInvocationStaticTypeArray _this, IsApplicableMatch isApplicableMatch, Type arrayType,
			MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method, TCall tAccess,
			ArrayType mStaticType, TypeAccess typeAccess, TypeToTAbstractType mStaticTypeTotStaticType,
			AbstractMethodInvocationToTAccess invocationToTAccess) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, arrayType, invocation, tStaticType,
				method, tAccess, mStaticType, typeAccess, mStaticTypeTotStaticType, invocationToTAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, arrayType, invocation, tStaticType, method, tAccess,
					mStaticType, typeAccess, mStaticTypeTotStaticType, invocationToTAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			MethodInvocationStaticTypeArray _this, IsApplicableMatch isApplicableMatch, Type arrayType,
			MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method, TCall tAccess,
			ArrayType mStaticType, TypeAccess typeAccess, TypeToTAbstractType mStaticTypeTotStaticType,
			AbstractMethodInvocationToTAccess invocationToTAccess) {
		Object[] result_pattern_MethodInvocationStaticTypeArray_12_4_solveCSP_binding = pattern_MethodInvocationStaticTypeArray_12_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
				mStaticTypeTotStaticType, invocationToTAccess);
		if (result_pattern_MethodInvocationStaticTypeArray_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationStaticTypeArray_12_4_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationStaticTypeArray_12_4_solveCSP_black = pattern_MethodInvocationStaticTypeArray_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationStaticTypeArray_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, arrayType, invocation, tStaticType, method,
						tAccess, mStaticType, typeAccess, mStaticTypeTotStaticType, invocationToTAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_12_5_checkCSP_expressionFBB(
			MethodInvocationStaticTypeArray _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "MethodInvocationStaticTypeArray";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationStaticTypeArray_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_20_1_preparereturnvalue_bindingFB(
			MethodInvocationStaticTypeArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, MethodInvocationStaticTypeArray _this) {
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

	public static final Object[] pattern_MethodInvocationStaticTypeArray_20_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodInvocationStaticTypeArray _this) {
		Object[] result_pattern_MethodInvocationStaticTypeArray_20_1_preparereturnvalue_binding = pattern_MethodInvocationStaticTypeArray_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationStaticTypeArray_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodInvocationStaticTypeArray_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationStaticTypeArray_20_1_preparereturnvalue_black = pattern_MethodInvocationStaticTypeArray_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodInvocationStaticTypeArray_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodInvocationStaticTypeArray_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodInvocationStaticTypeArray_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodInvocationStaticTypeArray_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_staticType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTAccess = _edge_staticType.getSrc();
		if (tmpTAccess instanceof TCall) {
			TCall tAccess = (TCall) tmpTAccess;
			EObject tmpTStaticType = _edge_staticType.getTrg();
			if (tmpTStaticType instanceof TAbstractType) {
				TAbstractType tStaticType = (TAbstractType) tmpTStaticType;
				if (tStaticType.equals(tAccess.getStaticType())) {
					_result.add(new Object[] { tStaticType, tAccess, _edge_staticType });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			MethodInvocationStaticTypeArray _this, Match match, TAbstractType tStaticType, TCall tAccess) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tStaticType, tAccess);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodInvocationStaticTypeArray _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodInvocationStaticTypeArray_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_21_1_preparereturnvalue_bindingFB(
			MethodInvocationStaticTypeArray _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, MethodInvocationStaticTypeArray _this) {
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

	public static final Object[] pattern_MethodInvocationStaticTypeArray_21_1_preparereturnvalue_bindingAndBlackFFBF(
			MethodInvocationStaticTypeArray _this) {
		Object[] result_pattern_MethodInvocationStaticTypeArray_21_1_preparereturnvalue_binding = pattern_MethodInvocationStaticTypeArray_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_MethodInvocationStaticTypeArray_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_MethodInvocationStaticTypeArray_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_MethodInvocationStaticTypeArray_21_1_preparereturnvalue_black = pattern_MethodInvocationStaticTypeArray_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_MethodInvocationStaticTypeArray_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_MethodInvocationStaticTypeArray_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_MethodInvocationStaticTypeArray_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_MethodInvocationStaticTypeArray_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_mStaticType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpInvocation = _edge_mStaticType.getSrc();
		if (tmpInvocation instanceof MMethodInvocation) {
			MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
			EObject tmpMStaticType = _edge_mStaticType.getTrg();
			if (tmpMStaticType instanceof ArrayType) {
				ArrayType mStaticType = (ArrayType) tmpMStaticType;
				if (mStaticType.equals(invocation.getMStaticType())) {
					AbstractMethodDeclaration tmpMethod = invocation.getMethod();
					if (tmpMethod instanceof MAbstractMethodDefinition) {
						MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
						TypeAccess typeAccess = mStaticType.getElementType();
						if (typeAccess != null) {
							Type arrayType = typeAccess.getType();
							if (arrayType != null) {
								if (!arrayType.equals(mStaticType)) {
									_result.add(new Object[] { arrayType, invocation, method, mStaticType, typeAccess,
											_edge_mStaticType });
								}
							}

						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			MethodInvocationStaticTypeArray _this, Match match, Type arrayType, MMethodInvocation invocation,
			MAbstractMethodDefinition method, ArrayType mStaticType, TypeAccess typeAccess) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, arrayType, invocation, method, mStaticType,
				typeAccess);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			MethodInvocationStaticTypeArray _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_MethodInvocationStaticTypeArray_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_24_1_prepare_blackB(
			MethodInvocationStaticTypeArray _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("arrayType");
		EObject _localVariable_1 = sourceMatch.getObject("invocation");
		EObject _localVariable_2 = targetMatch.getObject("tStaticType");
		EObject _localVariable_3 = sourceMatch.getObject("method");
		EObject _localVariable_4 = targetMatch.getObject("tAccess");
		EObject _localVariable_5 = sourceMatch.getObject("mStaticType");
		EObject _localVariable_6 = sourceMatch.getObject("typeAccess");
		EObject tmpArrayType = _localVariable_0;
		EObject tmpInvocation = _localVariable_1;
		EObject tmpTStaticType = _localVariable_2;
		EObject tmpMethod = _localVariable_3;
		EObject tmpTAccess = _localVariable_4;
		EObject tmpMStaticType = _localVariable_5;
		EObject tmpTypeAccess = _localVariable_6;
		if (tmpArrayType instanceof Type) {
			Type arrayType = (Type) tmpArrayType;
			if (tmpInvocation instanceof MMethodInvocation) {
				MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
				if (tmpTStaticType instanceof TAbstractType) {
					TAbstractType tStaticType = (TAbstractType) tmpTStaticType;
					if (tmpMethod instanceof MAbstractMethodDefinition) {
						MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
						if (tmpTAccess instanceof TCall) {
							TCall tAccess = (TCall) tmpTAccess;
							if (tmpMStaticType instanceof ArrayType) {
								ArrayType mStaticType = (ArrayType) tmpMStaticType;
								if (tmpTypeAccess instanceof TypeAccess) {
									TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
									return new Object[] { arrayType, invocation, tStaticType, method, tAccess,
											mStaticType, typeAccess, sourceMatch, targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			Type arrayType, MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method,
			TCall tAccess, ArrayType mStaticType, TypeAccess typeAccess, Match sourceMatch, Match targetMatch) {
		if (!arrayType.equals(mStaticType)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodInvocationStaticTypeArray_24_2_matchsrctrgcontext_binding = pattern_MethodInvocationStaticTypeArray_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_MethodInvocationStaticTypeArray_24_2_matchsrctrgcontext_binding != null) {
			Type arrayType = (Type) result_pattern_MethodInvocationStaticTypeArray_24_2_matchsrctrgcontext_binding[0];
			MMethodInvocation invocation = (MMethodInvocation) result_pattern_MethodInvocationStaticTypeArray_24_2_matchsrctrgcontext_binding[1];
			TAbstractType tStaticType = (TAbstractType) result_pattern_MethodInvocationStaticTypeArray_24_2_matchsrctrgcontext_binding[2];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_MethodInvocationStaticTypeArray_24_2_matchsrctrgcontext_binding[3];
			TCall tAccess = (TCall) result_pattern_MethodInvocationStaticTypeArray_24_2_matchsrctrgcontext_binding[4];
			ArrayType mStaticType = (ArrayType) result_pattern_MethodInvocationStaticTypeArray_24_2_matchsrctrgcontext_binding[5];
			TypeAccess typeAccess = (TypeAccess) result_pattern_MethodInvocationStaticTypeArray_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_MethodInvocationStaticTypeArray_24_2_matchsrctrgcontext_black = pattern_MethodInvocationStaticTypeArray_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess, sourceMatch,
					targetMatch);
			if (result_pattern_MethodInvocationStaticTypeArray_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_24_3_solvecsp_bindingFBBBBBBBBBB(
			MethodInvocationStaticTypeArray _this, Type arrayType, MMethodInvocation invocation,
			TAbstractType tStaticType, MAbstractMethodDefinition method, TCall tAccess, ArrayType mStaticType,
			TypeAccess typeAccess, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(arrayType, invocation, tStaticType, method, tAccess,
				mStaticType, typeAccess, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, arrayType, invocation, tStaticType, method, tAccess, mStaticType,
					typeAccess, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			MethodInvocationStaticTypeArray _this, Type arrayType, MMethodInvocation invocation,
			TAbstractType tStaticType, MAbstractMethodDefinition method, TCall tAccess, ArrayType mStaticType,
			TypeAccess typeAccess, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_MethodInvocationStaticTypeArray_24_3_solvecsp_binding = pattern_MethodInvocationStaticTypeArray_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess, sourceMatch,
				targetMatch);
		if (result_pattern_MethodInvocationStaticTypeArray_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationStaticTypeArray_24_3_solvecsp_binding[0];

			Object[] result_pattern_MethodInvocationStaticTypeArray_24_3_solvecsp_black = pattern_MethodInvocationStaticTypeArray_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_MethodInvocationStaticTypeArray_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, arrayType, invocation, tStaticType, method, tAccess, mStaticType,
						typeAccess, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationStaticTypeArray_24_5_matchcorrcontext_blackBBBBFFBB(
			Type arrayType, MMethodInvocation invocation, TAbstractType tStaticType, TCall tAccess, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (AbstractMethodInvocationToTAccess invocationToTAccess : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(invocation, AbstractMethodInvocationToTAccess.class, "source")) {
				if (tAccess.equals(invocationToTAccess.getTarget())) {
					for (TypeToTAbstractType mStaticTypeTotStaticType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tStaticType, TypeToTAbstractType.class, "target")) {
						if (arrayType.equals(mStaticTypeTotStaticType.getSource())) {
							_result.add(new Object[] { arrayType, invocation, tStaticType, tAccess,
									mStaticTypeTotStaticType, invocationToTAccess, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mStaticTypeTotStaticType, AbstractMethodInvocationToTAccess invocationToTAccess,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "MethodInvocationStaticTypeArray";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mStaticTypeTotStaticType);
		ccMatch.getAllContextElements().add(invocationToTAccess);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mStaticTypeTotStaticType, invocationToTAccess, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_24_6_createcorrespondence_blackBBBBBBBB(
			Type arrayType, MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method,
			TCall tAccess, ArrayType mStaticType, TypeAccess typeAccess, CCMatch ccMatch) {
		if (!arrayType.equals(mStaticType)) {
			return new Object[] { arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
					ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "MethodInvocationStaticTypeArray";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_MethodInvocationStaticTypeArray_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_27_1_matchtggpattern_blackBBBBB(Type arrayType,
			MMethodInvocation invocation, MAbstractMethodDefinition method, ArrayType mStaticType,
			TypeAccess typeAccess) {
		if (!arrayType.equals(mStaticType)) {
			if (mStaticType.equals(invocation.getMStaticType())) {
				if (method.equals(invocation.getMethod())) {
					if (typeAccess.equals(mStaticType.getElementType())) {
						if (arrayType.equals(typeAccess.getType())) {
							return new Object[] { arrayType, invocation, method, mStaticType, typeAccess };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_28_1_matchtggpattern_blackBB(
			TAbstractType tStaticType, TCall tAccess) {
		if (tStaticType.equals(tAccess.getStaticType())) {
			return new Object[] { tStaticType, tAccess };
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_29_1_createresult_blackB(
			MethodInvocationStaticTypeArray _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Type arrayType) {
		if (ruleResult.getSourceObjects().contains(arrayType)) {
			return new Object[] { ruleResult, arrayType };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mStaticTypeTotStaticType) {
		if (ruleResult.getCorrObjects().contains(mStaticTypeTotStaticType)) {
			return new Object[] { ruleResult, mStaticTypeTotStaticType };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tStaticType) {
		if (ruleResult.getTargetObjects().contains(tStaticType)) {
			return new Object[] { ruleResult, tStaticType };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeAccess typeAccess) {
		if (ruleResult.getSourceObjects().contains(typeAccess)) {
			return new Object[] { ruleResult, typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ArrayType mStaticType) {
		if (ruleResult.getSourceObjects().contains(mStaticType)) {
			return new Object[] { ruleResult, mStaticType };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MMethodInvocation invocation) {
		if (ruleResult.getSourceObjects().contains(invocation)) {
			return new Object[] { ruleResult, invocation };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, MAbstractMethodDefinition method) {
		if (ruleResult.getSourceObjects().contains(method)) {
			return new Object[] { ruleResult, method };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, AbstractMethodInvocationToTAccess invocationToTAccess) {
		if (ruleResult.getCorrObjects().contains(invocationToTAccess)) {
			return new Object[] { ruleResult, invocationToTAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, TCall tAccess) {
		if (ruleResult.getTargetObjects().contains(tAccess)) {
			return new Object[] { ruleResult, tAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_blackFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mStaticTypeTotStaticTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList invocationToTAccessList : ruleEntryContainer.getRuleEntryList()) {
				if (!invocationToTAccessList.equals(mStaticTypeTotStaticTypeList)) {
					for (EObject tmpMStaticTypeTotStaticType : mStaticTypeTotStaticTypeList.getEntryObjects()) {
						if (tmpMStaticTypeTotStaticType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mStaticTypeTotStaticType = (TypeToTAbstractType) tmpMStaticTypeTotStaticType;
							Type arrayType = mStaticTypeTotStaticType.getSource();
							if (arrayType != null) {
								TAbstractType tStaticType = mStaticTypeTotStaticType.getTarget();
								if (tStaticType != null) {
									if (pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, mStaticTypeTotStaticType) == null) {
										if (pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, arrayType) == null) {
											if (pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tStaticType) == null) {
												for (EObject tmpInvocationToTAccess : invocationToTAccessList
														.getEntryObjects()) {
													if (tmpInvocationToTAccess instanceof AbstractMethodInvocationToTAccess) {
														AbstractMethodInvocationToTAccess invocationToTAccess = (AbstractMethodInvocationToTAccess) tmpInvocationToTAccess;
														AbstractMethodInvocation tmpInvocation = invocationToTAccess
																.getSource();
														if (tmpInvocation instanceof MMethodInvocation) {
															MMethodInvocation invocation = (MMethodInvocation) tmpInvocation;
															TAccess tmpTAccess = invocationToTAccess.getTarget();
															if (tmpTAccess instanceof TCall) {
																TCall tAccess = (TCall) tmpTAccess;
																AbstractMethodDeclaration tmpMethod = invocation
																		.getMethod();
																if (tmpMethod instanceof MAbstractMethodDefinition) {
																	MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
																	if (pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_7BB(
																			ruleResult, invocationToTAccess) == null) {
																		if (pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, invocation) == null) {
																			if (pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_8BB(
																					ruleResult, tAccess) == null) {
																				if (pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_6BB(
																						ruleResult, method) == null) {
																					for (TypeAccess typeAccess : arrayType
																							.getUsagesInTypeAccess()) {
																						if (pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_3BB(
																								ruleResult,
																								typeAccess) == null) {
																							for (ArrayType mStaticType : org.moflon.core.utilities.eMoflonEMFUtil
																									.getOppositeReferenceTyped(
																											typeAccess,
																											ArrayType.class,
																											"elementType")) {
																								if (!arrayType.equals(
																										mStaticType)) {
																									if (pattern_MethodInvocationStaticTypeArray_29_2_isapplicablecore_black_nac_4BB(
																											ruleResult,
																											mStaticType) == null) {
																										_result.add(
																												new Object[] {
																														mStaticTypeTotStaticTypeList,
																														arrayType,
																														mStaticTypeTotStaticType,
																														tStaticType,
																														typeAccess,
																														mStaticType,
																														invocationToTAccessList,
																														invocation,
																														method,
																														invocationToTAccess,
																														tAccess,
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
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_29_3_solveCSP_bindingFBBBBBBBBBBBB(
			MethodInvocationStaticTypeArray _this, IsApplicableMatch isApplicableMatch, Type arrayType,
			MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method, TCall tAccess,
			ArrayType mStaticType, TypeAccess typeAccess, TypeToTAbstractType mStaticTypeTotStaticType,
			AbstractMethodInvocationToTAccess invocationToTAccess, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, arrayType, invocation, tStaticType,
				method, tAccess, mStaticType, typeAccess, mStaticTypeTotStaticType, invocationToTAccess, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, arrayType, invocation, tStaticType, method, tAccess,
					mStaticType, typeAccess, mStaticTypeTotStaticType, invocationToTAccess, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			MethodInvocationStaticTypeArray _this, IsApplicableMatch isApplicableMatch, Type arrayType,
			MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method, TCall tAccess,
			ArrayType mStaticType, TypeAccess typeAccess, TypeToTAbstractType mStaticTypeTotStaticType,
			AbstractMethodInvocationToTAccess invocationToTAccess, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_MethodInvocationStaticTypeArray_29_3_solveCSP_binding = pattern_MethodInvocationStaticTypeArray_29_3_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
				mStaticTypeTotStaticType, invocationToTAccess, ruleResult);
		if (result_pattern_MethodInvocationStaticTypeArray_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_MethodInvocationStaticTypeArray_29_3_solveCSP_binding[0];

			Object[] result_pattern_MethodInvocationStaticTypeArray_29_3_solveCSP_black = pattern_MethodInvocationStaticTypeArray_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_MethodInvocationStaticTypeArray_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, arrayType, invocation, tStaticType, method,
						tAccess, mStaticType, typeAccess, mStaticTypeTotStaticType, invocationToTAccess, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_MethodInvocationStaticTypeArray_29_4_checkCSP_expressionFBB(
			MethodInvocationStaticTypeArray _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_29_5_checknacs_blackBBBBBBBBB(Type arrayType,
			MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method, TCall tAccess,
			ArrayType mStaticType, TypeAccess typeAccess, TypeToTAbstractType mStaticTypeTotStaticType,
			AbstractMethodInvocationToTAccess invocationToTAccess) {
		if (!arrayType.equals(mStaticType)) {
			return new Object[] { arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
					mStaticTypeTotStaticType, invocationToTAccess };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_29_6_perform_blackBBBBBBBBBB(Type arrayType,
			MMethodInvocation invocation, TAbstractType tStaticType, MAbstractMethodDefinition method, TCall tAccess,
			ArrayType mStaticType, TypeAccess typeAccess, TypeToTAbstractType mStaticTypeTotStaticType,
			AbstractMethodInvocationToTAccess invocationToTAccess, ModelgeneratorRuleResult ruleResult) {
		if (!arrayType.equals(mStaticType)) {
			return new Object[] { arrayType, invocation, tStaticType, method, tAccess, mStaticType, typeAccess,
					mStaticTypeTotStaticType, invocationToTAccess, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_MethodInvocationStaticTypeArray_29_6_perform_greenBBBBB(
			MMethodInvocation invocation, TAbstractType tStaticType, TCall tAccess, ArrayType mStaticType,
			ModelgeneratorRuleResult ruleResult) {
		invocation.setMStaticType(mStaticType);
		tAccess.setStaticType(tStaticType);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { invocation, tStaticType, tAccess, mStaticType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_MethodInvocationStaticTypeArray_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //MethodInvocationStaticTypeArrayImpl
