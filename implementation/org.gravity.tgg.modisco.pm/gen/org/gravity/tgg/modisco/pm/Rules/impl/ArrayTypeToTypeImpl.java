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
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.ArrayTypeToType;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;

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
 * An implementation of the model object '<em><b>Array Type To Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ArrayTypeToTypeImpl extends AbstractRuleImpl implements ArrayTypeToType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayTypeToTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getArrayTypeToType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Model model, Type eType, ArrayType eArrayType,
			TypeAccess eTypeAccess) {

		Object[] result1_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_0_1_initialbindings_blackBBBBBB(this,
				match, model, eType, eArrayType, eTypeAccess);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[model] = " + model + ", " + "[eType] = " + eType + ", "
					+ "[eArrayType] = " + eArrayType + ", " + "[eTypeAccess] = " + eTypeAccess + ".");
		}

		Object[] result2_bindingAndBlack = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, model, eType, eArrayType,
						eTypeAccess);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[model] = " + model + ", " + "[eType] = " + eType + ", "
					+ "[eArrayType] = " + eArrayType + ", " + "[eTypeAccess] = " + eTypeAccess + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ArrayTypeToTypeImpl.pattern_ArrayTypeToType_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ArrayTypeToTypeImpl
					.pattern_ArrayTypeToType_0_4_collectelementstobetranslated_blackBBBBB(match, model, eType,
							eArrayType, eTypeAccess);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[model] = " + model + ", " + "[eType] = " + eType + ", " + "[eArrayType] = " + eArrayType
						+ ", " + "[eTypeAccess] = " + eTypeAccess + ".");
			}
			ArrayTypeToTypeImpl.pattern_ArrayTypeToType_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, model,
					eType, eArrayType, eTypeAccess);
			//nothing EMoflonEdge eArrayType__eTypeAccess____elementType = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge model__eArrayType____orphanTypes = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[8];

			Object[] result5_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_0_5_collectcontextelements_blackBBBBB(
					match, model, eType, eArrayType, eTypeAccess);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[model] = " + model + ", " + "[eType] = " + eType + ", " + "[eArrayType] = " + eArrayType
						+ ", " + "[eTypeAccess] = " + eTypeAccess + ".");
			}
			ArrayTypeToTypeImpl.pattern_ArrayTypeToType_0_5_collectcontextelements_greenBBB(match, model, eType);

			// 
			ArrayTypeToTypeImpl.pattern_ArrayTypeToType_0_6_registerobjectstomatch_expressionBBBBBB(this, match, model,
					eType, eArrayType, eTypeAccess);
			return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_0_7_expressionF();
		} else {
			return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Model model = (Model) result1_bindingAndBlack[0];
		Type eType = (Type) result1_bindingAndBlack[1];
		ArrayType eArrayType = (ArrayType) result1_bindingAndBlack[2];
		TAbstractType tArrayClass = (TAbstractType) result1_bindingAndBlack[3];
		TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) result1_bindingAndBlack[4];
		TypeAccess eTypeAccess = (TypeAccess) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_1_1_performtransformation_greenBBF(eArrayType, tArrayClass);
		TypeToTAbstractType arrayTypeToTArrayClass = (TypeToTAbstractType) result1_green[2];

		Object[] result2_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_1_2_collecttranslatedelements_blackBBB(
				eArrayType, eTypeAccess, arrayTypeToTArrayClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eArrayType] = " + eArrayType
					+ ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[arrayTypeToTArrayClass] = "
					+ arrayTypeToTArrayClass + ".");
		}
		Object[] result2_green = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_1_2_collecttranslatedelements_greenFBBB(
				eArrayType, eTypeAccess, arrayTypeToTArrayClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_1_3_bookkeepingforedges_blackBBBBBBBB(
				ruleresult, model, eType, eArrayType, tArrayClass, eTypeToTArrayClass, eTypeAccess,
				arrayTypeToTArrayClass);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[model] = " + model + ", " + "[eType] = " + eType + ", " + "[eArrayType] = " + eArrayType
					+ ", " + "[tArrayClass] = " + tArrayClass + ", " + "[eTypeToTArrayClass] = " + eTypeToTArrayClass
					+ ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[arrayTypeToTArrayClass] = "
					+ arrayTypeToTArrayClass + ".");
		}
		ArrayTypeToTypeImpl.pattern_ArrayTypeToType_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(ruleresult, model, eType,
				eArrayType, tArrayClass, eTypeAccess, arrayTypeToTArrayClass);
		//nothing EMoflonEdge eArrayType__eTypeAccess____elementType = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge model__eArrayType____orphanTypes = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge arrayTypeToTArrayClass__tArrayClass____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge arrayTypeToTArrayClass__eArrayType____source = (EMoflonEdge) result3_green[12];

		// 
		// 
		ArrayTypeToTypeImpl.pattern_ArrayTypeToType_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, model,
				eType, eArrayType, tArrayClass, eTypeToTArrayClass, eTypeAccess, arrayTypeToTArrayClass);
		return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Model model = (Model) result2_binding[0];
		Type eType = (Type) result2_binding[1];
		ArrayType eArrayType = (ArrayType) result2_binding[2];
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[3];
		for (Object[] result2_black : ArrayTypeToTypeImpl.pattern_ArrayTypeToType_2_2_corematch_blackBBBFFBB(model,
				eType, eArrayType, eTypeAccess, match)) {
			TAbstractType tArrayClass = (TAbstractType) result2_black[3];
			TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) result2_black[4];
			// ForEach 
			for (Object[] result3_black : ArrayTypeToTypeImpl.pattern_ArrayTypeToType_2_3_findcontext_blackBBBBBB(model,
					eType, eArrayType, tArrayClass, eTypeToTArrayClass, eTypeAccess)) {
				Object[] result3_green = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_2_3_findcontext_greenBBBBBBFFFFFFF(
						model, eType, eArrayType, tArrayClass, eTypeToTArrayClass, eTypeAccess);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge eArrayType__eTypeAccess____elementType = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge eTypeToTArrayClass__tArrayClass____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eTypeToTArrayClass__eType____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge model__eArrayType____orphanTypes = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = ArrayTypeToTypeImpl
						.pattern_ArrayTypeToType_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, model,
								eType, eArrayType, tArrayClass, eTypeToTArrayClass, eTypeAccess);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ", "
							+ "[eType] = " + eType + ", " + "[eArrayType] = " + eArrayType + ", " + "[tArrayClass] = "
							+ tArrayClass + ", " + "[eTypeToTArrayClass] = " + eTypeToTArrayClass + ", "
							+ "[eTypeAccess] = " + eTypeAccess + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ArrayTypeToTypeImpl.pattern_ArrayTypeToType_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ArrayTypeToTypeImpl
							.pattern_ArrayTypeToType_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ArrayTypeToTypeImpl.pattern_ArrayTypeToType_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Model model, Type eType, ArrayType eArrayType,
			TypeAccess eTypeAccess) {
		match.registerObject("model", model);
		match.registerObject("eType", eType);
		match.registerObject("eArrayType", eArrayType);
		match.registerObject("eTypeAccess", eTypeAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Model model, Type eType, ArrayType eArrayType,
			TypeAccess eTypeAccess) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Model model, Type eType,
			ArrayType eArrayType, TAbstractType tArrayClass, TypeToTAbstractType eTypeToTArrayClass,
			TypeAccess eTypeAccess) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("eArrayType", eArrayType);
		isApplicableMatch.registerObject("tArrayClass", tArrayClass);
		isApplicableMatch.registerObject("eTypeToTArrayClass", eTypeToTArrayClass);
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject model, EObject eType, EObject eArrayType,
			EObject tArrayClass, EObject eTypeToTArrayClass, EObject eTypeAccess, EObject arrayTypeToTArrayClass) {
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("eType", eType);
		ruleresult.registerObject("eArrayType", eArrayType);
		ruleresult.registerObject("tArrayClass", tArrayClass);
		ruleresult.registerObject("eTypeToTArrayClass", eTypeToTArrayClass);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("arrayTypeToTArrayClass", arrayTypeToTArrayClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eArrayType").eClass())
						.equals("java.ArrayType.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eTypeAccess").eClass())
						.equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TAbstractType tArrayClass) {

		Object[] result1_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_10_1_initialbindings_blackBBB(this, match,
				tArrayClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tArrayClass] = " + tArrayClass + ".");
		}

		Object[] result2_bindingAndBlack = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_10_2_SolveCSP_bindingAndBlackFBBB(this, match, tArrayClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tArrayClass] = " + tArrayClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ArrayTypeToTypeImpl.pattern_ArrayTypeToType_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ArrayTypeToTypeImpl
					.pattern_ArrayTypeToType_10_4_collectelementstobetranslated_blackBB(match, tArrayClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tArrayClass] = " + tArrayClass + ".");
			}

			Object[] result5_black = ArrayTypeToTypeImpl
					.pattern_ArrayTypeToType_10_5_collectcontextelements_blackBB(match, tArrayClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tArrayClass] = " + tArrayClass + ".");
			}
			ArrayTypeToTypeImpl.pattern_ArrayTypeToType_10_5_collectcontextelements_greenBB(match, tArrayClass);

			// 
			ArrayTypeToTypeImpl.pattern_ArrayTypeToType_10_6_registerobjectstomatch_expressionBBB(this, match,
					tArrayClass);
			return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_10_7_expressionF();
		} else {
			return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAbstractType tArrayClass) {
		match.registerObject("tArrayClass", tArrayClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAbstractType tArrayClass) {// Create CSP
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
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_TAbstractType_1(TAbstractType tArrayClass) {

		Object[] result1_bindingAndBlack = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_17_2_testcorematchandDECs_blackB(tArrayClass)) {
			Object[] result2_green = ArrayTypeToTypeImpl
					.pattern_ArrayTypeToType_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ArrayTypeToTypeImpl
					.pattern_ArrayTypeToType_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this, match,
							tArrayClass)) {
				// 
				if (ArrayTypeToTypeImpl
						.pattern_ArrayTypeToType_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = ArrayTypeToTypeImpl
							.pattern_ArrayTypeToType_17_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ArrayTypeToTypeImpl.pattern_ArrayTypeToType_17_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_91(EMoflonEdge _edge_elementType) {

		Object[] result1_bindingAndBlack = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_18_2_testcorematchandDECs_blackFFFFB(_edge_elementType)) {
			Model model = (Model) result2_black[0];
			Type eType = (Type) result2_black[1];
			ArrayType eArrayType = (ArrayType) result2_black[2];
			TypeAccess eTypeAccess = (TypeAccess) result2_black[3];
			Object[] result2_green = ArrayTypeToTypeImpl
					.pattern_ArrayTypeToType_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ArrayTypeToTypeImpl
					.pattern_ArrayTypeToType_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, model, eType, eArrayType, eTypeAccess)) {
				// 
				if (ArrayTypeToTypeImpl
						.pattern_ArrayTypeToType_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = ArrayTypeToTypeImpl
							.pattern_ArrayTypeToType_18_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ArrayTypeToTypeImpl.pattern_ArrayTypeToType_18_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ArrayTypeToType");
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
		ruleResult.setRule("ArrayTypeToType");
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

		Object[] result1_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_21_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Model model = (Model) result2_bindingAndBlack[0];
		Type eType = (Type) result2_bindingAndBlack[1];
		ArrayType eArrayType = (ArrayType) result2_bindingAndBlack[2];
		TAbstractType tArrayClass = (TAbstractType) result2_bindingAndBlack[3];
		TypeAccess eTypeAccess = (TypeAccess) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_21_3_solvecsp_bindingAndBlackFBBBBBBBB(this, model, eType, eArrayType,
						tArrayClass, eTypeAccess, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[model] = " + model + ", " + "[eType] = " + eType + ", " + "[eArrayType] = " + eArrayType + ", "
					+ "[tArrayClass] = " + tArrayClass + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ArrayTypeToTypeImpl.pattern_ArrayTypeToType_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ArrayTypeToTypeImpl.pattern_ArrayTypeToType_21_5_matchcorrcontext_blackBBFBB(
					eType, tArrayClass, sourceMatch, targetMatch)) {
				TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) result5_black[2];
				Object[] result5_green = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_21_5_matchcorrcontext_greenBBBF(
						eTypeToTArrayClass, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = ArrayTypeToTypeImpl
						.pattern_ArrayTypeToType_21_6_createcorrespondence_blackBBBBBB(model, eType, eArrayType,
								tArrayClass, eTypeAccess, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model] = " + model + ", "
							+ "[eType] = " + eType + ", " + "[eArrayType] = " + eArrayType + ", " + "[tArrayClass] = "
							+ tArrayClass + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				ArrayTypeToTypeImpl.pattern_ArrayTypeToType_21_6_createcorrespondence_greenBBFB(eArrayType, tArrayClass,
						ccMatch);
				//nothing TypeToTAbstractType arrayTypeToTArrayClass = (TypeToTAbstractType) result6_green[2];

				Object[] result7_black = ArrayTypeToTypeImpl
						.pattern_ArrayTypeToType_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ArrayTypeToTypeImpl.pattern_ArrayTypeToType_21_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Model model, Type eType, ArrayType eArrayType, TAbstractType tArrayClass,
			TypeAccess eTypeAccess, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Model model, Type eType, ArrayType eArrayType, TypeAccess eTypeAccess) {// 
		Object[] result1_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_24_1_matchtggpattern_blackBBBB(model,
				eType, eArrayType, eTypeAccess);
		if (result1_black != null) {
			return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_24_2_expressionF();
		} else {
			return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAbstractType tArrayClass) {// 
		Object[] result1_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_25_1_matchtggpattern_blackB(tArrayClass);
		if (result1_black != null) {
			return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_25_2_expressionF();
		} else {
			return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, Model modelParameter,
			TypeToTAbstractType eTypeToTArrayClassParameter) {

		Object[] result1_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ArrayTypeToTypeImpl
				.pattern_ArrayTypeToType_26_2_isapplicablecore_blackFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList modelList = (RuleEntryList) result2_black[0];
			Model model = (Model) result2_black[1];
			//nothing RuleEntryList eTypeToTArrayClassList = (RuleEntryList) result2_black[2];
			Type eType = (Type) result2_black[3];
			TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) result2_black[4];
			TAbstractType tArrayClass = (TAbstractType) result2_black[5];

			Object[] result3_bindingAndBlack = ArrayTypeToTypeImpl
					.pattern_ArrayTypeToType_26_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, model,
							eType, tArrayClass, eTypeToTArrayClass, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ", "
						+ "[eType] = " + eType + ", " + "[tArrayClass] = " + tArrayClass + ", "
						+ "[eTypeToTArrayClass] = " + eTypeToTArrayClass + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ArrayTypeToTypeImpl.pattern_ArrayTypeToType_26_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_26_5_checknacs_blackBBBB(model,
						eType, tArrayClass, eTypeToTArrayClass);
				if (result5_black != null) {

					Object[] result6_black = ArrayTypeToTypeImpl.pattern_ArrayTypeToType_26_6_perform_blackBBBBB(model,
							eType, tArrayClass, eTypeToTArrayClass, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model] = " + model
								+ ", " + "[eType] = " + eType + ", " + "[tArrayClass] = " + tArrayClass + ", "
								+ "[eTypeToTArrayClass] = " + eTypeToTArrayClass + ", " + "[ruleResult] = " + ruleResult
								+ ".");
					}
					ArrayTypeToTypeImpl.pattern_ArrayTypeToType_26_6_perform_greenBBFBFFB(model, eType, tArrayClass,
							ruleResult);
					//nothing ArrayType eArrayType = (ArrayType) result6_green[2];
					//nothing TypeAccess eTypeAccess = (TypeAccess) result6_green[4];
					//nothing TypeToTAbstractType arrayTypeToTArrayClass = (TypeToTAbstractType) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return ArrayTypeToTypeImpl.pattern_ArrayTypeToType_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Model model, Type eType,
			TAbstractType tArrayClass, TypeToTAbstractType eTypeToTArrayClass, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("tArrayClass", tArrayClass);
		isApplicableMatch.registerObject("eTypeToTArrayClass", eTypeToTArrayClass);
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
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPROPRIATE_FWD__MATCH_MODEL_TYPE_ARRAYTYPE_TYPEACCESS:
			return isAppropriate_FWD((Match) arguments.get(0), (Model) arguments.get(1), (Type) arguments.get(2),
					(ArrayType) arguments.get(3), (TypeAccess) arguments.get(4));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL_TYPE_ARRAYTYPE_TYPEACCESS:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Model) arguments.get(1), (Type) arguments.get(2),
					(ArrayType) arguments.get(3), (TypeAccess) arguments.get(4));
			return null;
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL_TYPE_ARRAYTYPE_TYPEACCESS:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(Type) arguments.get(2), (ArrayType) arguments.get(3), (TypeAccess) arguments.get(4));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL_TYPE_ARRAYTYPE_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_TYPEACCESS:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(Type) arguments.get(2), (ArrayType) arguments.get(3), (TAbstractType) arguments.get(4),
					(TypeToTAbstractType) arguments.get(5), (TypeAccess) arguments.get(6));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.ARRAY_TYPE_TO_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPROPRIATE_BWD__MATCH_TABSTRACTTYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTTYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1));
			return null;
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTTYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPROPRIATE_BWD_TABSTRACT_TYPE_1__TABSTRACTTYPE:
			return isAppropriate_BWD_TAbstractType_1((TAbstractType) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_91__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_91((EMoflonEdge) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__MODEL_TYPE_ARRAYTYPE_TABSTRACTTYPE_TYPEACCESS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Model) arguments.get(0), (Type) arguments.get(1),
					(ArrayType) arguments.get(2), (TAbstractType) arguments.get(3), (TypeAccess) arguments.get(4),
					(Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___CHECK_DEC_FWD__MODEL_TYPE_ARRAYTYPE_TYPEACCESS:
			return checkDEC_FWD((Model) arguments.get(0), (Type) arguments.get(1), (ArrayType) arguments.get(2),
					(TypeAccess) arguments.get(3));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___CHECK_DEC_BWD__TABSTRACTTYPE:
			return checkDEC_BWD((TAbstractType) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_MODEL_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (Model) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_TYPE_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(Type) arguments.get(2), (TAbstractType) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
					(ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.ARRAY_TYPE_TO_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ArrayTypeToType_0_1_initialbindings_blackBBBBBB(ArrayTypeToType _this,
			Match match, Model model, Type eType, ArrayType eArrayType, TypeAccess eTypeAccess) {
		if (!eArrayType.equals(eType)) {
			return new Object[] { _this, match, model, eType, eArrayType, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_0_2_SolveCSP_bindingFBBBBBB(ArrayTypeToType _this, Match match,
			Model model, Type eType, ArrayType eArrayType, TypeAccess eTypeAccess) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, model, eType, eArrayType, eTypeAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, model, eType, eArrayType, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToType_0_2_SolveCSP_bindingAndBlackFBBBBBB(ArrayTypeToType _this,
			Match match, Model model, Type eType, ArrayType eArrayType, TypeAccess eTypeAccess) {
		Object[] result_pattern_ArrayTypeToType_0_2_SolveCSP_binding = pattern_ArrayTypeToType_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, model, eType, eArrayType, eTypeAccess);
		if (result_pattern_ArrayTypeToType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ArrayTypeToType_0_2_SolveCSP_black = pattern_ArrayTypeToType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ArrayTypeToType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, model, eType, eArrayType, eTypeAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToType_0_3_CheckCSP_expressionFBB(ArrayTypeToType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Model model, Type eType, ArrayType eArrayType, TypeAccess eTypeAccess) {
		if (!eArrayType.equals(eType)) {
			return new Object[] { match, model, eType, eArrayType, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_0_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			Model model, Type eType, ArrayType eArrayType, TypeAccess eTypeAccess) {
		EMoflonEdge eArrayType__eTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__eArrayType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eArrayType);
		match.getToBeTranslatedNodes().add(eTypeAccess);
		String eArrayType__eTypeAccess____elementType_name_prime = "elementType";
		String model__eArrayType____orphanTypes_name_prime = "orphanTypes";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		eArrayType__eTypeAccess____elementType.setSrc(eArrayType);
		eArrayType__eTypeAccess____elementType.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eArrayType__eTypeAccess____elementType);
		model__eArrayType____orphanTypes.setSrc(model);
		model__eArrayType____orphanTypes.setTrg(eArrayType);
		match.getToBeTranslatedEdges().add(model__eArrayType____orphanTypes);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		match.getToBeTranslatedEdges().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eType__eTypeAccess____usagesInTypeAccess);
		eArrayType__eTypeAccess____elementType.setName(eArrayType__eTypeAccess____elementType_name_prime);
		model__eArrayType____orphanTypes.setName(model__eArrayType____orphanTypes_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { match, model, eType, eArrayType, eTypeAccess, eArrayType__eTypeAccess____elementType,
				model__eArrayType____orphanTypes, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess };
	}

	public static final Object[] pattern_ArrayTypeToType_0_5_collectcontextelements_blackBBBBB(Match match, Model model,
			Type eType, ArrayType eArrayType, TypeAccess eTypeAccess) {
		if (!eArrayType.equals(eType)) {
			return new Object[] { match, model, eType, eArrayType, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_0_5_collectcontextelements_greenBBB(Match match, Model model,
			Type eType) {
		match.getContextNodes().add(model);
		match.getContextNodes().add(eType);
		return new Object[] { match, model, eType };
	}

	public static final void pattern_ArrayTypeToType_0_6_registerobjectstomatch_expressionBBBBBB(ArrayTypeToType _this,
			Match match, Model model, Type eType, ArrayType eArrayType, TypeAccess eTypeAccess) {
		_this.registerObjectsToMatch_FWD(match, model, eType, eArrayType, eTypeAccess);

	}

	public static final boolean pattern_ArrayTypeToType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToType_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("model");
		EObject _localVariable_1 = isApplicableMatch.getObject("eType");
		EObject _localVariable_2 = isApplicableMatch.getObject("eArrayType");
		EObject _localVariable_3 = isApplicableMatch.getObject("tArrayClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("eTypeToTArrayClass");
		EObject _localVariable_5 = isApplicableMatch.getObject("eTypeAccess");
		EObject tmpModel = _localVariable_0;
		EObject tmpEType = _localVariable_1;
		EObject tmpEArrayType = _localVariable_2;
		EObject tmpTArrayClass = _localVariable_3;
		EObject tmpETypeToTArrayClass = _localVariable_4;
		EObject tmpETypeAccess = _localVariable_5;
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			if (tmpEType instanceof Type) {
				Type eType = (Type) tmpEType;
				if (tmpEArrayType instanceof ArrayType) {
					ArrayType eArrayType = (ArrayType) tmpEArrayType;
					if (tmpTArrayClass instanceof TAbstractType) {
						TAbstractType tArrayClass = (TAbstractType) tmpTArrayClass;
						if (tmpETypeToTArrayClass instanceof TypeToTAbstractType) {
							TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) tmpETypeToTArrayClass;
							if (tmpETypeAccess instanceof TypeAccess) {
								TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
								return new Object[] { model, eType, eArrayType, tArrayClass, eTypeToTArrayClass,
										eTypeAccess, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_1_1_performtransformation_blackBBBBBBFBB(Model model,
			Type eType, ArrayType eArrayType, TAbstractType tArrayClass, TypeToTAbstractType eTypeToTArrayClass,
			TypeAccess eTypeAccess, ArrayTypeToType _this, IsApplicableMatch isApplicableMatch) {
		if (!eArrayType.equals(eType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { model, eType, eArrayType, tArrayClass, eTypeToTArrayClass, eTypeAccess, csp,
							_this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			ArrayTypeToType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ArrayTypeToType_1_1_performtransformation_binding = pattern_ArrayTypeToType_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ArrayTypeToType_1_1_performtransformation_binding != null) {
			Model model = (Model) result_pattern_ArrayTypeToType_1_1_performtransformation_binding[0];
			Type eType = (Type) result_pattern_ArrayTypeToType_1_1_performtransformation_binding[1];
			ArrayType eArrayType = (ArrayType) result_pattern_ArrayTypeToType_1_1_performtransformation_binding[2];
			TAbstractType tArrayClass = (TAbstractType) result_pattern_ArrayTypeToType_1_1_performtransformation_binding[3];
			TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) result_pattern_ArrayTypeToType_1_1_performtransformation_binding[4];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ArrayTypeToType_1_1_performtransformation_binding[5];

			Object[] result_pattern_ArrayTypeToType_1_1_performtransformation_black = pattern_ArrayTypeToType_1_1_performtransformation_blackBBBBBBFBB(
					model, eType, eArrayType, tArrayClass, eTypeToTArrayClass, eTypeAccess, _this, isApplicableMatch);
			if (result_pattern_ArrayTypeToType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ArrayTypeToType_1_1_performtransformation_black[6];

				return new Object[] { model, eType, eArrayType, tArrayClass, eTypeToTArrayClass, eTypeAccess, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_1_1_performtransformation_greenBBF(ArrayType eArrayType,
			TAbstractType tArrayClass) {
		TypeToTAbstractType arrayTypeToTArrayClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		arrayTypeToTArrayClass.setTarget(tArrayClass);
		arrayTypeToTArrayClass.setSource(eArrayType);
		return new Object[] { eArrayType, tArrayClass, arrayTypeToTArrayClass };
	}

	public static final Object[] pattern_ArrayTypeToType_1_2_collecttranslatedelements_blackBBB(ArrayType eArrayType,
			TypeAccess eTypeAccess, TypeToTAbstractType arrayTypeToTArrayClass) {
		return new Object[] { eArrayType, eTypeAccess, arrayTypeToTArrayClass };
	}

	public static final Object[] pattern_ArrayTypeToType_1_2_collecttranslatedelements_greenFBBB(ArrayType eArrayType,
			TypeAccess eTypeAccess, TypeToTAbstractType arrayTypeToTArrayClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(eArrayType);
		ruleresult.getTranslatedElements().add(eTypeAccess);
		ruleresult.getCreatedLinkElements().add(arrayTypeToTArrayClass);
		return new Object[] { ruleresult, eArrayType, eTypeAccess, arrayTypeToTArrayClass };
	}

	public static final Object[] pattern_ArrayTypeToType_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject model, EObject eType, EObject eArrayType, EObject tArrayClass,
			EObject eTypeToTArrayClass, EObject eTypeAccess, EObject arrayTypeToTArrayClass) {
		if (!model.equals(tArrayClass)) {
			if (!eType.equals(model)) {
				if (!eType.equals(tArrayClass)) {
					if (!eType.equals(eTypeToTArrayClass)) {
						if (!eType.equals(eTypeAccess)) {
							if (!eArrayType.equals(model)) {
								if (!eArrayType.equals(eType)) {
									if (!eArrayType.equals(tArrayClass)) {
										if (!eArrayType.equals(eTypeToTArrayClass)) {
											if (!eArrayType.equals(eTypeAccess)) {
												if (!eTypeToTArrayClass.equals(model)) {
													if (!eTypeToTArrayClass.equals(tArrayClass)) {
														if (!eTypeAccess.equals(model)) {
															if (!eTypeAccess.equals(tArrayClass)) {
																if (!eTypeAccess.equals(eTypeToTArrayClass)) {
																	if (!arrayTypeToTArrayClass.equals(model)) {
																		if (!arrayTypeToTArrayClass.equals(eType)) {
																			if (!arrayTypeToTArrayClass
																					.equals(eArrayType)) {
																				if (!arrayTypeToTArrayClass
																						.equals(tArrayClass)) {
																					if (!arrayTypeToTArrayClass.equals(
																							eTypeToTArrayClass)) {
																						if (!arrayTypeToTArrayClass
																								.equals(eTypeAccess)) {
																							return new Object[] {
																									ruleresult, model,
																									eType, eArrayType,
																									tArrayClass,
																									eTypeToTArrayClass,
																									eTypeAccess,
																									arrayTypeToTArrayClass };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ArrayTypeToType_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject model, EObject eType, EObject eArrayType, EObject tArrayClass,
			EObject eTypeAccess, EObject arrayTypeToTArrayClass) {
		EMoflonEdge eArrayType__eTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__eArrayType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge arrayTypeToTArrayClass__tArrayClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge arrayTypeToTArrayClass__eArrayType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ArrayTypeToType";
		String eArrayType__eTypeAccess____elementType_name_prime = "elementType";
		String model__eArrayType____orphanTypes_name_prime = "orphanTypes";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String arrayTypeToTArrayClass__tArrayClass____target_name_prime = "target";
		String arrayTypeToTArrayClass__eArrayType____source_name_prime = "source";
		eArrayType__eTypeAccess____elementType.setSrc(eArrayType);
		eArrayType__eTypeAccess____elementType.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eArrayType__eTypeAccess____elementType);
		model__eArrayType____orphanTypes.setSrc(model);
		model__eArrayType____orphanTypes.setTrg(eArrayType);
		ruleresult.getTranslatedEdges().add(model__eArrayType____orphanTypes);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		ruleresult.getTranslatedEdges().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eType__eTypeAccess____usagesInTypeAccess);
		arrayTypeToTArrayClass__tArrayClass____target.setSrc(arrayTypeToTArrayClass);
		arrayTypeToTArrayClass__tArrayClass____target.setTrg(tArrayClass);
		ruleresult.getCreatedEdges().add(arrayTypeToTArrayClass__tArrayClass____target);
		arrayTypeToTArrayClass__eArrayType____source.setSrc(arrayTypeToTArrayClass);
		arrayTypeToTArrayClass__eArrayType____source.setTrg(eArrayType);
		ruleresult.getCreatedEdges().add(arrayTypeToTArrayClass__eArrayType____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eArrayType__eTypeAccess____elementType.setName(eArrayType__eTypeAccess____elementType_name_prime);
		model__eArrayType____orphanTypes.setName(model__eArrayType____orphanTypes_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		arrayTypeToTArrayClass__tArrayClass____target.setName(arrayTypeToTArrayClass__tArrayClass____target_name_prime);
		arrayTypeToTArrayClass__eArrayType____source.setName(arrayTypeToTArrayClass__eArrayType____source_name_prime);
		return new Object[] { ruleresult, model, eType, eArrayType, tArrayClass, eTypeAccess, arrayTypeToTArrayClass,
				eArrayType__eTypeAccess____elementType, model__eArrayType____orphanTypes, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess, arrayTypeToTArrayClass__tArrayClass____target,
				arrayTypeToTArrayClass__eArrayType____source };
	}

	public static final void pattern_ArrayTypeToType_1_5_registerobjects_expressionBBBBBBBBB(ArrayTypeToType _this,
			PerformRuleResult ruleresult, EObject model, EObject eType, EObject eArrayType, EObject tArrayClass,
			EObject eTypeToTArrayClass, EObject eTypeAccess, EObject arrayTypeToTArrayClass) {
		_this.registerObjects_FWD(ruleresult, model, eType, eArrayType, tArrayClass, eTypeToTArrayClass, eTypeAccess,
				arrayTypeToTArrayClass);

	}

	public static final PerformRuleResult pattern_ArrayTypeToType_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_2_1_preparereturnvalue_bindingFB(ArrayTypeToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ArrayTypeToType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_2_1_preparereturnvalue_bindingAndBlackFFB(
			ArrayTypeToType _this) {
		Object[] result_pattern_ArrayTypeToType_2_1_preparereturnvalue_binding = pattern_ArrayTypeToType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ArrayTypeToType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ArrayTypeToType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ArrayTypeToType_2_1_preparereturnvalue_black = pattern_ArrayTypeToType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ArrayTypeToType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ArrayTypeToType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ArrayTypeToType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ArrayTypeToType_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("model");
		EObject _localVariable_1 = match.getObject("eType");
		EObject _localVariable_2 = match.getObject("eArrayType");
		EObject _localVariable_3 = match.getObject("eTypeAccess");
		EObject tmpModel = _localVariable_0;
		EObject tmpEType = _localVariable_1;
		EObject tmpEArrayType = _localVariable_2;
		EObject tmpETypeAccess = _localVariable_3;
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			if (tmpEType instanceof Type) {
				Type eType = (Type) tmpEType;
				if (tmpEArrayType instanceof ArrayType) {
					ArrayType eArrayType = (ArrayType) tmpEArrayType;
					if (tmpETypeAccess instanceof TypeAccess) {
						TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
						return new Object[] { model, eType, eArrayType, eTypeAccess, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToType_2_2_corematch_blackBBBFFBB(Model model, Type eType,
			ArrayType eArrayType, TypeAccess eTypeAccess, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eArrayType.equals(eType)) {
			for (TypeToTAbstractType eTypeToTArrayClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eType, TypeToTAbstractType.class, "source")) {
				TAbstractType tArrayClass = eTypeToTArrayClass.getTarget();
				if (tArrayClass != null) {
					_result.add(new Object[] { model, eType, eArrayType, tArrayClass, eTypeToTArrayClass, eTypeAccess,
							match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToType_2_3_findcontext_blackBBBBBB(Model model, Type eType,
			ArrayType eArrayType, TAbstractType tArrayClass, TypeToTAbstractType eTypeToTArrayClass,
			TypeAccess eTypeAccess) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eArrayType.equals(eType)) {
			if (eTypeAccess.equals(eArrayType.getElementType())) {
				if (tArrayClass.equals(eTypeToTArrayClass.getTarget())) {
					if (eType.equals(eTypeToTArrayClass.getSource())) {
						if (model.getOrphanTypes().contains(eArrayType)) {
							if (eType.equals(eTypeAccess.getType())) {
								_result.add(new Object[] { model, eType, eArrayType, tArrayClass, eTypeToTArrayClass,
										eTypeAccess });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_2_3_findcontext_greenBBBBBBFFFFFFF(Model model, Type eType,
			ArrayType eArrayType, TAbstractType tArrayClass, TypeToTAbstractType eTypeToTArrayClass,
			TypeAccess eTypeAccess) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eArrayType__eTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeToTArrayClass__tArrayClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeToTArrayClass__eType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__eArrayType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eArrayType__eTypeAccess____elementType_name_prime = "elementType";
		String eTypeToTArrayClass__tArrayClass____target_name_prime = "target";
		String eTypeToTArrayClass__eType____source_name_prime = "source";
		String model__eArrayType____orphanTypes_name_prime = "orphanTypes";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(eType);
		isApplicableMatch.getAllContextElements().add(eArrayType);
		isApplicableMatch.getAllContextElements().add(tArrayClass);
		isApplicableMatch.getAllContextElements().add(eTypeToTArrayClass);
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		eArrayType__eTypeAccess____elementType.setSrc(eArrayType);
		eArrayType__eTypeAccess____elementType.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eArrayType__eTypeAccess____elementType);
		eTypeToTArrayClass__tArrayClass____target.setSrc(eTypeToTArrayClass);
		eTypeToTArrayClass__tArrayClass____target.setTrg(tArrayClass);
		isApplicableMatch.getAllContextElements().add(eTypeToTArrayClass__tArrayClass____target);
		eTypeToTArrayClass__eType____source.setSrc(eTypeToTArrayClass);
		eTypeToTArrayClass__eType____source.setTrg(eType);
		isApplicableMatch.getAllContextElements().add(eTypeToTArrayClass__eType____source);
		model__eArrayType____orphanTypes.setSrc(model);
		model__eArrayType____orphanTypes.setTrg(eArrayType);
		isApplicableMatch.getAllContextElements().add(model__eArrayType____orphanTypes);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		isApplicableMatch.getAllContextElements().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eType__eTypeAccess____usagesInTypeAccess);
		eArrayType__eTypeAccess____elementType.setName(eArrayType__eTypeAccess____elementType_name_prime);
		eTypeToTArrayClass__tArrayClass____target.setName(eTypeToTArrayClass__tArrayClass____target_name_prime);
		eTypeToTArrayClass__eType____source.setName(eTypeToTArrayClass__eType____source_name_prime);
		model__eArrayType____orphanTypes.setName(model__eArrayType____orphanTypes_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { model, eType, eArrayType, tArrayClass, eTypeToTArrayClass, eTypeAccess, isApplicableMatch,
				eArrayType__eTypeAccess____elementType, eTypeToTArrayClass__tArrayClass____target,
				eTypeToTArrayClass__eType____source, model__eArrayType____orphanTypes, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess };
	}

	public static final Object[] pattern_ArrayTypeToType_2_4_solveCSP_bindingFBBBBBBBB(ArrayTypeToType _this,
			IsApplicableMatch isApplicableMatch, Model model, Type eType, ArrayType eArrayType,
			TAbstractType tArrayClass, TypeToTAbstractType eTypeToTArrayClass, TypeAccess eTypeAccess) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, model, eType, eArrayType, tArrayClass,
				eTypeToTArrayClass, eTypeAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, eType, eArrayType, tArrayClass,
					eTypeToTArrayClass, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToType_2_4_solveCSP_bindingAndBlackFBBBBBBBB(ArrayTypeToType _this,
			IsApplicableMatch isApplicableMatch, Model model, Type eType, ArrayType eArrayType,
			TAbstractType tArrayClass, TypeToTAbstractType eTypeToTArrayClass, TypeAccess eTypeAccess) {
		Object[] result_pattern_ArrayTypeToType_2_4_solveCSP_binding = pattern_ArrayTypeToType_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, model, eType, eArrayType, tArrayClass, eTypeToTArrayClass, eTypeAccess);
		if (result_pattern_ArrayTypeToType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToType_2_4_solveCSP_binding[0];

			Object[] result_pattern_ArrayTypeToType_2_4_solveCSP_black = pattern_ArrayTypeToType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ArrayTypeToType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, eType, eArrayType, tArrayClass,
						eTypeToTArrayClass, eTypeAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToType_2_5_checkCSP_expressionFBB(ArrayTypeToType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ArrayTypeToType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ArrayTypeToType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ArrayTypeToType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_10_1_initialbindings_blackBBB(ArrayTypeToType _this,
			Match match, TAbstractType tArrayClass) {
		return new Object[] { _this, match, tArrayClass };
	}

	public static final Object[] pattern_ArrayTypeToType_10_2_SolveCSP_bindingFBBB(ArrayTypeToType _this, Match match,
			TAbstractType tArrayClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tArrayClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tArrayClass };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToType_10_2_SolveCSP_bindingAndBlackFBBB(ArrayTypeToType _this,
			Match match, TAbstractType tArrayClass) {
		Object[] result_pattern_ArrayTypeToType_10_2_SolveCSP_binding = pattern_ArrayTypeToType_10_2_SolveCSP_bindingFBBB(
				_this, match, tArrayClass);
		if (result_pattern_ArrayTypeToType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ArrayTypeToType_10_2_SolveCSP_black = pattern_ArrayTypeToType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ArrayTypeToType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tArrayClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToType_10_3_CheckCSP_expressionFBB(ArrayTypeToType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_10_4_collectelementstobetranslated_blackBB(Match match,
			TAbstractType tArrayClass) {
		return new Object[] { match, tArrayClass };
	}

	public static final Object[] pattern_ArrayTypeToType_10_5_collectcontextelements_blackBB(Match match,
			TAbstractType tArrayClass) {
		return new Object[] { match, tArrayClass };
	}

	public static final Object[] pattern_ArrayTypeToType_10_5_collectcontextelements_greenBB(Match match,
			TAbstractType tArrayClass) {
		match.getContextNodes().add(tArrayClass);
		return new Object[] { match, tArrayClass };
	}

	public static final void pattern_ArrayTypeToType_10_6_registerobjectstomatch_expressionBBB(ArrayTypeToType _this,
			Match match, TAbstractType tArrayClass) {
		_this.registerObjectsToMatch_BWD(match, tArrayClass);

	}

	public static final boolean pattern_ArrayTypeToType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToType_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_17_1_preparereturnvalue_bindingFB(ArrayTypeToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ArrayTypeToType _this) {
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

	public static final Object[] pattern_ArrayTypeToType_17_1_preparereturnvalue_bindingAndBlackFFBF(
			ArrayTypeToType _this) {
		Object[] result_pattern_ArrayTypeToType_17_1_preparereturnvalue_binding = pattern_ArrayTypeToType_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ArrayTypeToType_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ArrayTypeToType_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ArrayTypeToType_17_1_preparereturnvalue_black = pattern_ArrayTypeToType_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ArrayTypeToType_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ArrayTypeToType_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ArrayTypeToType_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToType_17_2_testcorematchandDECs_blackB(
			TAbstractType tArrayClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { tArrayClass });
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ArrayTypeToType_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			ArrayTypeToType _this, Match match, TAbstractType tArrayClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tArrayClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToType_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ArrayTypeToType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ArrayTypeToType_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_18_1_preparereturnvalue_bindingFB(ArrayTypeToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ArrayTypeToType _this) {
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

	public static final Object[] pattern_ArrayTypeToType_18_1_preparereturnvalue_bindingAndBlackFFBF(
			ArrayTypeToType _this) {
		Object[] result_pattern_ArrayTypeToType_18_1_preparereturnvalue_binding = pattern_ArrayTypeToType_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ArrayTypeToType_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ArrayTypeToType_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ArrayTypeToType_18_1_preparereturnvalue_black = pattern_ArrayTypeToType_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ArrayTypeToType_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ArrayTypeToType_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ArrayTypeToType_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_0BB(TypeAccess eTypeAccess,
			Type eType) {
		for (AbstractTypeDeclaration __DEC_eTypeAccess_superInterfaces_141059 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!eType.equals(__DEC_eTypeAccess_superInterfaces_141059)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_1B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_358819 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_2B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_697080 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_3BB(TypeAccess eTypeAccess,
			Type eType) {
		for (ClassDeclaration __DEC_eTypeAccess_superClass_58566 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!eType.equals(__DEC_eTypeAccess_superClass_58566)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_4B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_777594 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_5BB(TypeAccess eTypeAccess,
			Type eType) {
		for (ParameterizedType __DEC_eTypeAccess_type_611283 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ParameterizedType.class, "type")) {
			if (!eType.equals(__DEC_eTypeAccess_type_611283)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_6B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_427093 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_370905 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToType_18_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_elementType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEArrayType = _edge_elementType.getSrc();
		if (tmpEArrayType instanceof ArrayType) {
			ArrayType eArrayType = (ArrayType) tmpEArrayType;
			EObject tmpETypeAccess = _edge_elementType.getTrg();
			if (tmpETypeAccess instanceof TypeAccess) {
				TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
				if (eTypeAccess.equals(eArrayType.getElementType())) {
					Type eType = eTypeAccess.getType();
					if (eType != null) {
						if (!eArrayType.equals(eType)) {
							if (pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_1B(eTypeAccess) == null) {
								if (pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_2B(
										eTypeAccess) == null) {
									if (pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_4B(
											eTypeAccess) == null) {
										if (pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_6B(
												eTypeAccess) == null) {
											if (pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_7B(
													eTypeAccess) == null) {
												if (pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_0BB(
														eTypeAccess, eType) == null) {
													if (pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_3BB(
															eTypeAccess, eType) == null) {
														if (pattern_ArrayTypeToType_18_2_testcorematchandDECs_black_nac_5BB(
																eTypeAccess, eType) == null) {
															for (Model model : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(eArrayType, Model.class,
																			"orphanTypes")) {
																_result.add(new Object[] { model, eType, eArrayType,
																		eTypeAccess, _edge_elementType });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ArrayTypeToType_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ArrayTypeToType_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			ArrayTypeToType _this, Match match, Model model, Type eType, ArrayType eArrayType, TypeAccess eTypeAccess) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, model, eType, eArrayType, eTypeAccess);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToType_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ArrayTypeToType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ArrayTypeToType_18_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_21_1_prepare_blackB(ArrayTypeToType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ArrayTypeToType_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ArrayTypeToType_21_2_matchsrctrgcontext_bindingFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("model");
		EObject _localVariable_1 = sourceMatch.getObject("eType");
		EObject _localVariable_2 = sourceMatch.getObject("eArrayType");
		EObject _localVariable_3 = targetMatch.getObject("tArrayClass");
		EObject _localVariable_4 = sourceMatch.getObject("eTypeAccess");
		EObject tmpModel = _localVariable_0;
		EObject tmpEType = _localVariable_1;
		EObject tmpEArrayType = _localVariable_2;
		EObject tmpTArrayClass = _localVariable_3;
		EObject tmpETypeAccess = _localVariable_4;
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			if (tmpEType instanceof Type) {
				Type eType = (Type) tmpEType;
				if (tmpEArrayType instanceof ArrayType) {
					ArrayType eArrayType = (ArrayType) tmpEArrayType;
					if (tmpTArrayClass instanceof TAbstractType) {
						TAbstractType tArrayClass = (TAbstractType) tmpTArrayClass;
						if (tmpETypeAccess instanceof TypeAccess) {
							TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
							return new Object[] { model, eType, eArrayType, tArrayClass, eTypeAccess, sourceMatch,
									targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_21_2_matchsrctrgcontext_blackBBBBBBB(Model model, Type eType,
			ArrayType eArrayType, TAbstractType tArrayClass, TypeAccess eTypeAccess, Match sourceMatch,
			Match targetMatch) {
		if (!eArrayType.equals(eType)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { model, eType, eArrayType, tArrayClass, eTypeAccess, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_21_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_binding = pattern_ArrayTypeToType_21_2_matchsrctrgcontext_bindingFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_binding != null) {
			Model model = (Model) result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_binding[0];
			Type eType = (Type) result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_binding[1];
			ArrayType eArrayType = (ArrayType) result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_binding[2];
			TAbstractType tArrayClass = (TAbstractType) result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_binding[3];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_black = pattern_ArrayTypeToType_21_2_matchsrctrgcontext_blackBBBBBBB(
					model, eType, eArrayType, tArrayClass, eTypeAccess, sourceMatch, targetMatch);
			if (result_pattern_ArrayTypeToType_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { model, eType, eArrayType, tArrayClass, eTypeAccess, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_21_3_solvecsp_bindingFBBBBBBBB(ArrayTypeToType _this,
			Model model, Type eType, ArrayType eArrayType, TAbstractType tArrayClass, TypeAccess eTypeAccess,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(model, eType, eArrayType, tArrayClass, eTypeAccess,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, model, eType, eArrayType, tArrayClass, eTypeAccess, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToType_21_3_solvecsp_bindingAndBlackFBBBBBBBB(ArrayTypeToType _this,
			Model model, Type eType, ArrayType eArrayType, TAbstractType tArrayClass, TypeAccess eTypeAccess,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ArrayTypeToType_21_3_solvecsp_binding = pattern_ArrayTypeToType_21_3_solvecsp_bindingFBBBBBBBB(
				_this, model, eType, eArrayType, tArrayClass, eTypeAccess, sourceMatch, targetMatch);
		if (result_pattern_ArrayTypeToType_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToType_21_3_solvecsp_binding[0];

			Object[] result_pattern_ArrayTypeToType_21_3_solvecsp_black = pattern_ArrayTypeToType_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_ArrayTypeToType_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, model, eType, eArrayType, tArrayClass, eTypeAccess, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToType_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToType_21_5_matchcorrcontext_blackBBFBB(Type eType,
			TAbstractType tArrayClass, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType eTypeToTArrayClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tArrayClass, TypeToTAbstractType.class, "target")) {
				if (eType.equals(eTypeToTArrayClass.getSource())) {
					_result.add(new Object[] { eType, tArrayClass, eTypeToTArrayClass, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_21_5_matchcorrcontext_greenBBBF(
			TypeToTAbstractType eTypeToTArrayClass, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ArrayTypeToType";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eTypeToTArrayClass);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eTypeToTArrayClass, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ArrayTypeToType_21_6_createcorrespondence_blackBBBBBB(Model model, Type eType,
			ArrayType eArrayType, TAbstractType tArrayClass, TypeAccess eTypeAccess, CCMatch ccMatch) {
		if (!eArrayType.equals(eType)) {
			return new Object[] { model, eType, eArrayType, tArrayClass, eTypeAccess, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_21_6_createcorrespondence_greenBBFB(ArrayType eArrayType,
			TAbstractType tArrayClass, CCMatch ccMatch) {
		TypeToTAbstractType arrayTypeToTArrayClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		arrayTypeToTArrayClass.setTarget(tArrayClass);
		arrayTypeToTArrayClass.setSource(eArrayType);
		ccMatch.getCreateCorr().add(arrayTypeToTArrayClass);
		return new Object[] { eArrayType, tArrayClass, arrayTypeToTArrayClass, ccMatch };
	}

	public static final Object[] pattern_ArrayTypeToType_21_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ArrayTypeToType_21_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ArrayTypeToType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ArrayTypeToType_21_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_0BB(TypeAccess eTypeAccess,
			Type eType) {
		for (AbstractTypeDeclaration __DEC_eTypeAccess_superInterfaces_667597 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!eType.equals(__DEC_eTypeAccess_superInterfaces_667597)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_1B(TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_227174 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_2B(TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_255001 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_3BB(TypeAccess eTypeAccess,
			Type eType) {
		for (ClassDeclaration __DEC_eTypeAccess_superClass_814082 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!eType.equals(__DEC_eTypeAccess_superClass_814082)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_4B(TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_994116 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_5BB(TypeAccess eTypeAccess,
			Type eType) {
		for (ParameterizedType __DEC_eTypeAccess_type_498731 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ParameterizedType.class, "type")) {
			if (!eType.equals(__DEC_eTypeAccess_type_498731)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_6B(TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_310726 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_7B(TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_589322 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_24_1_matchtggpattern_blackBBBB(Model model, Type eType,
			ArrayType eArrayType, TypeAccess eTypeAccess) {
		if (!eArrayType.equals(eType)) {
			if (eTypeAccess.equals(eArrayType.getElementType())) {
				if (model.getOrphanTypes().contains(eArrayType)) {
					if (eType.equals(eTypeAccess.getType())) {
						if (pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_0BB(eTypeAccess, eType) == null) {
							if (pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_1B(eTypeAccess) == null) {
								if (pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_2B(eTypeAccess) == null) {
									if (pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_3BB(eTypeAccess,
											eType) == null) {
										if (pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_4B(
												eTypeAccess) == null) {
											if (pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_5BB(eTypeAccess,
													eType) == null) {
												if (pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_6B(
														eTypeAccess) == null) {
													if (pattern_ArrayTypeToType_24_1_matchtggpattern_black_nac_7B(
															eTypeAccess) == null) {
														return new Object[] { model, eType, eArrayType, eTypeAccess };
													}
												}
											}
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

	public static final boolean pattern_ArrayTypeToType_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToType_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_25_1_matchtggpattern_blackB(TAbstractType tArrayClass) {
		return new Object[] { tArrayClass };
	}

	public static final boolean pattern_ArrayTypeToType_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToType_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_26_1_createresult_blackB(ArrayTypeToType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ArrayTypeToType_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Model model) {
		if (ruleResult.getSourceObjects().contains(model)) {
			return new Object[] { ruleResult, model };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Type eType) {
		if (ruleResult.getSourceObjects().contains(eType)) {
			return new Object[] { ruleResult, eType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eTypeToTArrayClass) {
		if (ruleResult.getCorrObjects().contains(eTypeToTArrayClass)) {
			return new Object[] { ruleResult, eTypeToTArrayClass };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tArrayClass) {
		if (ruleResult.getTargetObjects().contains(tArrayClass)) {
			return new Object[] { ruleResult, tArrayClass };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToType_26_2_isapplicablecore_blackFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList modelList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList eTypeToTArrayClassList : ruleEntryContainer.getRuleEntryList()) {
				if (!eTypeToTArrayClassList.equals(modelList)) {
					for (EObject tmpModel : modelList.getEntryObjects()) {
						if (tmpModel instanceof Model) {
							Model model = (Model) tmpModel;
							if (pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_0BB(ruleResult,
									model) == null) {
								for (EObject tmpETypeToTArrayClass : eTypeToTArrayClassList.getEntryObjects()) {
									if (tmpETypeToTArrayClass instanceof TypeToTAbstractType) {
										TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) tmpETypeToTArrayClass;
										Type eType = eTypeToTArrayClass.getSource();
										if (eType != null) {
											TAbstractType tArrayClass = eTypeToTArrayClass.getTarget();
											if (tArrayClass != null) {
												if (pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_2BB(
														ruleResult, eTypeToTArrayClass) == null) {
													if (pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_1BB(
															ruleResult, eType) == null) {
														if (pattern_ArrayTypeToType_26_2_isapplicablecore_black_nac_3BB(
																ruleResult, tArrayClass) == null) {
															_result.add(new Object[] { modelList, model,
																	eTypeToTArrayClassList, eType, eTypeToTArrayClass,
																	tArrayClass, ruleEntryContainer, ruleResult });
														}
													}
												}
											}

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

	public static final Object[] pattern_ArrayTypeToType_26_3_solveCSP_bindingFBBBBBBB(ArrayTypeToType _this,
			IsApplicableMatch isApplicableMatch, Model model, Type eType, TAbstractType tArrayClass,
			TypeToTAbstractType eTypeToTArrayClass, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, model, eType, tArrayClass,
				eTypeToTArrayClass, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, eType, tArrayClass, eTypeToTArrayClass,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToType_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToType_26_3_solveCSP_bindingAndBlackFBBBBBBB(ArrayTypeToType _this,
			IsApplicableMatch isApplicableMatch, Model model, Type eType, TAbstractType tArrayClass,
			TypeToTAbstractType eTypeToTArrayClass, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ArrayTypeToType_26_3_solveCSP_binding = pattern_ArrayTypeToType_26_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, model, eType, tArrayClass, eTypeToTArrayClass, ruleResult);
		if (result_pattern_ArrayTypeToType_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToType_26_3_solveCSP_binding[0];

			Object[] result_pattern_ArrayTypeToType_26_3_solveCSP_black = pattern_ArrayTypeToType_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_ArrayTypeToType_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, eType, tArrayClass, eTypeToTArrayClass,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToType_26_4_checkCSP_expressionFBB(ArrayTypeToType _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToType_26_5_checknacs_blackBBBB(Model model, Type eType,
			TAbstractType tArrayClass, TypeToTAbstractType eTypeToTArrayClass) {
		return new Object[] { model, eType, tArrayClass, eTypeToTArrayClass };
	}

	public static final Object[] pattern_ArrayTypeToType_26_6_perform_blackBBBBB(Model model, Type eType,
			TAbstractType tArrayClass, TypeToTAbstractType eTypeToTArrayClass, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { model, eType, tArrayClass, eTypeToTArrayClass, ruleResult };
	}

	public static final Object[] pattern_ArrayTypeToType_26_6_perform_greenBBFBFFB(Model model, Type eType,
			TAbstractType tArrayClass, ModelgeneratorRuleResult ruleResult) {
		ArrayType eArrayType = JavaFactory.eINSTANCE.createArrayType();
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		TypeToTAbstractType arrayTypeToTArrayClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		model.getOrphanTypes().add(eArrayType);
		ruleResult.getSourceObjects().add(eArrayType);
		eArrayType.setElementType(eTypeAccess);
		eTypeAccess.setType(eType);
		ruleResult.getSourceObjects().add(eTypeAccess);
		arrayTypeToTArrayClass.setTarget(tArrayClass);
		arrayTypeToTArrayClass.setSource(eArrayType);
		ruleResult.getCorrObjects().add(arrayTypeToTArrayClass);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { model, eType, eArrayType, tArrayClass, eTypeAccess, arrayTypeToTArrayClass, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ArrayTypeToType_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ArrayTypeToTypeImpl
