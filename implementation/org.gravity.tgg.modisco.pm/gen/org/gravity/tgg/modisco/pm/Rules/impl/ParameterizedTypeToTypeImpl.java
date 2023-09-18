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

import org.gravity.tgg.modisco.pm.Rules.ParameterizedTypeToType;
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
 * An implementation of the model object '<em><b>Parameterized Type To Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParameterizedTypeToTypeImpl extends AbstractRuleImpl implements ParameterizedTypeToType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedTypeToTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParameterizedTypeToType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Model model, TypeAccess eTypeAccess, AbstractTypeDeclaration eType,
			ParameterizedType eParameterizedType) {

		Object[] result1_black = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_0_1_initialbindings_blackBBBBBB(this, match, model, eTypeAccess, eType,
						eParameterizedType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[model] = " + model + ", " + "[eTypeAccess] = " + eTypeAccess
					+ ", " + "[eType] = " + eType + ", " + "[eParameterizedType] = " + eParameterizedType + ".");
		}

		Object[] result2_bindingAndBlack = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, model, eTypeAccess,
						eType, eParameterizedType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[model] = " + model + ", " + "[eTypeAccess] = " + eTypeAccess
					+ ", " + "[eType] = " + eType + ", " + "[eParameterizedType] = " + eParameterizedType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ParameterizedTypeToTypeImpl
					.pattern_ParameterizedTypeToType_0_4_collectelementstobetranslated_blackBBBBB(match, model,
							eTypeAccess, eType, eParameterizedType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[model] = " + model + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = " + eType
						+ ", " + "[eParameterizedType] = " + eParameterizedType + ".");
			}
			ParameterizedTypeToTypeImpl
					.pattern_ParameterizedTypeToType_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, model,
							eTypeAccess, eType, eParameterizedType);
			//nothing EMoflonEdge model__eParameterizedType____orphanTypes = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge eParameterizedType__eTypeAccess____type = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[8];

			Object[] result5_black = ParameterizedTypeToTypeImpl
					.pattern_ParameterizedTypeToType_0_5_collectcontextelements_blackBBBBB(match, model, eTypeAccess,
							eType, eParameterizedType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[model] = " + model + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = " + eType
						+ ", " + "[eParameterizedType] = " + eParameterizedType + ".");
			}
			ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_0_5_collectcontextelements_greenBBB(match,
					model, eType);

			// 
			ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_0_6_registerobjectstomatch_expressionBBBBBB(
					this, match, model, eTypeAccess, eType, eParameterizedType);
			return ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_0_7_expressionF();
		} else {
			return ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Model model = (Model) result1_bindingAndBlack[0];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[1];
		TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result1_bindingAndBlack[2];
		TypeAccess eTypeAccess = (TypeAccess) result1_bindingAndBlack[3];
		AbstractTypeDeclaration eType = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		ParameterizedType eParameterizedType = (ParameterizedType) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_1_1_performtransformation_greenBFB(tAbstractType, eParameterizedType);
		TypeToTAbstractType eParameterizedTypeToTAbstractType = (TypeToTAbstractType) result1_green[1];

		Object[] result2_black = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_1_2_collecttranslatedelements_blackBBB(eTypeAccess,
						eParameterizedTypeToTAbstractType, eParameterizedType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eTypeAccess] = " + eTypeAccess
					+ ", " + "[eParameterizedTypeToTAbstractType] = " + eParameterizedTypeToTAbstractType + ", "
					+ "[eParameterizedType] = " + eParameterizedType + ".");
		}
		Object[] result2_green = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_1_2_collecttranslatedelements_greenFBBB(eTypeAccess,
						eParameterizedTypeToTAbstractType, eParameterizedType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, model, tAbstractType,
						eTypeToTAbstractType, eTypeAccess, eType, eParameterizedTypeToTAbstractType,
						eParameterizedType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[model] = " + model + ", " + "[tAbstractType] = " + tAbstractType + ", "
					+ "[eTypeToTAbstractType] = " + eTypeToTAbstractType + ", " + "[eTypeAccess] = " + eTypeAccess
					+ ", " + "[eType] = " + eType + ", " + "[eParameterizedTypeToTAbstractType] = "
					+ eParameterizedTypeToTAbstractType + ", " + "[eParameterizedType] = " + eParameterizedType + ".");
		}
		ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
				ruleresult, model, tAbstractType, eTypeAccess, eType, eParameterizedTypeToTAbstractType,
				eParameterizedType);
		//nothing EMoflonEdge model__eParameterizedType____orphanTypes = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge eParameterizedTypeToTAbstractType__tAbstractType____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge eParameterizedType__eTypeAccess____type = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eParameterizedTypeToTAbstractType__eParameterizedType____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[12];

		// 
		// 
		ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_1_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, model, tAbstractType, eTypeToTAbstractType, eTypeAccess, eType,
				eParameterizedTypeToTAbstractType, eParameterizedType);
		return ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Model model = (Model) result2_binding[0];
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[1];
		AbstractTypeDeclaration eType = (AbstractTypeDeclaration) result2_binding[2];
		ParameterizedType eParameterizedType = (ParameterizedType) result2_binding[3];
		for (Object[] result2_black : ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_2_2_corematch_blackBFFBBBB(model, eTypeAccess, eType,
						eParameterizedType, match)) {
			TAbstractType tAbstractType = (TAbstractType) result2_black[1];
			TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result2_black[2];
			// ForEach 
			for (Object[] result3_black : ParameterizedTypeToTypeImpl
					.pattern_ParameterizedTypeToType_2_3_findcontext_blackBBBBBB(model, tAbstractType,
							eTypeToTAbstractType, eTypeAccess, eType, eParameterizedType)) {
				Object[] result3_green = ParameterizedTypeToTypeImpl
						.pattern_ParameterizedTypeToType_2_3_findcontext_greenBBBBBBFFFFFFF(model, tAbstractType,
								eTypeToTAbstractType, eTypeAccess, eType, eParameterizedType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge model__eParameterizedType____orphanTypes = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge eTypeToTAbstractType__eType____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eParameterizedType__eTypeAccess____type = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eTypeToTAbstractType__tAbstractType____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = ParameterizedTypeToTypeImpl
						.pattern_ParameterizedTypeToType_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								model, tAbstractType, eTypeToTAbstractType, eTypeAccess, eType, eParameterizedType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ", "
							+ "[tAbstractType] = " + tAbstractType + ", " + "[eTypeToTAbstractType] = "
							+ eTypeToTAbstractType + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = "
							+ eType + ", " + "[eParameterizedType] = " + eParameterizedType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ParameterizedTypeToTypeImpl
							.pattern_ParameterizedTypeToType_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Model model, TypeAccess eTypeAccess,
			AbstractTypeDeclaration eType, ParameterizedType eParameterizedType) {
		match.registerObject("model", model);
		match.registerObject("eTypeAccess", eTypeAccess);
		match.registerObject("eType", eType);
		match.registerObject("eParameterizedType", eParameterizedType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Model model, TypeAccess eTypeAccess,
			AbstractTypeDeclaration eType, ParameterizedType eParameterizedType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Model model, TAbstractType tAbstractType,
			TypeToTAbstractType eTypeToTAbstractType, TypeAccess eTypeAccess, AbstractTypeDeclaration eType,
			ParameterizedType eParameterizedType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("eTypeToTAbstractType", eTypeToTAbstractType);
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("eParameterizedType", eParameterizedType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject model, EObject tAbstractType,
			EObject eTypeToTAbstractType, EObject eTypeAccess, EObject eType, EObject eParameterizedTypeToTAbstractType,
			EObject eParameterizedType) {
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("eTypeToTAbstractType", eTypeToTAbstractType);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("eType", eType);
		ruleresult.registerObject("eParameterizedTypeToTAbstractType", eParameterizedTypeToTAbstractType);
		ruleresult.registerObject("eParameterizedType", eParameterizedType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eTypeAccess").eClass())
						.equals("java.TypeAccess.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eParameterizedType").eClass())
						.equals("java.ParameterizedType.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TAbstractType tAbstractType) {

		Object[] result1_black = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_10_1_initialbindings_blackBBB(this, match, tAbstractType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType + ".");
		}

		Object[] result2_bindingAndBlack = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_10_2_SolveCSP_bindingAndBlackFBBB(this, match, tAbstractType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ParameterizedTypeToTypeImpl
					.pattern_ParameterizedTypeToType_10_4_collectelementstobetranslated_blackBB(match, tAbstractType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAbstractType] = " + tAbstractType + ".");
			}

			Object[] result5_black = ParameterizedTypeToTypeImpl
					.pattern_ParameterizedTypeToType_10_5_collectcontextelements_blackBB(match, tAbstractType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAbstractType] = " + tAbstractType + ".");
			}
			ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_10_5_collectcontextelements_greenBB(match,
					tAbstractType);

			// 
			ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_10_6_registerobjectstomatch_expressionBBB(this,
					match, tAbstractType);
			return ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_10_7_expressionF();
		} else {
			return ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_10_8_expressionF();
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
	public void registerObjectsToMatch_BWD(Match match, TAbstractType tAbstractType) {
		match.registerObject("tAbstractType", tAbstractType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAbstractType tAbstractType) {// Create CSP
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
	public EObjectContainer isAppropriate_BWD_TAbstractType_1(TAbstractType tAbstractType) {

		Object[] result1_bindingAndBlack = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_17_2_testcorematchandDECs_blackB(tAbstractType)) {
			Object[] result2_green = ParameterizedTypeToTypeImpl
					.pattern_ParameterizedTypeToType_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ParameterizedTypeToTypeImpl
					.pattern_ParameterizedTypeToType_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, tAbstractType)) {
				// 
				if (ParameterizedTypeToTypeImpl
						.pattern_ParameterizedTypeToType_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ParameterizedTypeToTypeImpl
							.pattern_ParameterizedTypeToType_17_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_17_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_256(EMoflonEdge _edge_orphanTypes) {

		Object[] result1_bindingAndBlack = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_blackFFFFB(_edge_orphanTypes)) {
			Model model = (Model) result2_black[0];
			TypeAccess eTypeAccess = (TypeAccess) result2_black[1];
			AbstractTypeDeclaration eType = (AbstractTypeDeclaration) result2_black[2];
			ParameterizedType eParameterizedType = (ParameterizedType) result2_black[3];
			Object[] result2_green = ParameterizedTypeToTypeImpl
					.pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ParameterizedTypeToTypeImpl
					.pattern_ParameterizedTypeToType_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, model, eTypeAccess, eType, eParameterizedType)) {
				// 
				if (ParameterizedTypeToTypeImpl
						.pattern_ParameterizedTypeToType_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ParameterizedTypeToTypeImpl
							.pattern_ParameterizedTypeToType_18_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_18_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ParameterizedTypeToType");
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
		ruleResult.setRule("ParameterizedTypeToType");
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

		Object[] result1_black = ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_21_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Model model = (Model) result2_bindingAndBlack[0];
		TAbstractType tAbstractType = (TAbstractType) result2_bindingAndBlack[1];
		TypeAccess eTypeAccess = (TypeAccess) result2_bindingAndBlack[2];
		AbstractTypeDeclaration eType = (AbstractTypeDeclaration) result2_bindingAndBlack[3];
		ParameterizedType eParameterizedType = (ParameterizedType) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_21_3_solvecsp_bindingAndBlackFBBBBBBBB(this, model, tAbstractType,
						eTypeAccess, eType, eParameterizedType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[model] = " + model + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[eTypeAccess] = "
					+ eTypeAccess + ", " + "[eType] = " + eType + ", " + "[eParameterizedType] = " + eParameterizedType
					+ ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ParameterizedTypeToTypeImpl
					.pattern_ParameterizedTypeToType_21_5_matchcorrcontext_blackBFBBB(tAbstractType, eType, sourceMatch,
							targetMatch)) {
				TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result5_black[1];
				Object[] result5_green = ParameterizedTypeToTypeImpl
						.pattern_ParameterizedTypeToType_21_5_matchcorrcontext_greenBBBF(eTypeToTAbstractType,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = ParameterizedTypeToTypeImpl
						.pattern_ParameterizedTypeToType_21_6_createcorrespondence_blackBBBBBB(model, tAbstractType,
								eTypeAccess, eType, eParameterizedType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model] = " + model + ", "
							+ "[tAbstractType] = " + tAbstractType + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
							+ "[eType] = " + eType + ", " + "[eParameterizedType] = " + eParameterizedType + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_21_6_createcorrespondence_greenBFBB(
						tAbstractType, eParameterizedType, ccMatch);
				//nothing TypeToTAbstractType eParameterizedTypeToTAbstractType = (TypeToTAbstractType) result6_green[1];

				Object[] result7_black = ParameterizedTypeToTypeImpl
						.pattern_ParameterizedTypeToType_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_21_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Model model, TAbstractType tAbstractType, TypeAccess eTypeAccess,
			AbstractTypeDeclaration eType, ParameterizedType eParameterizedType, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Model model, TypeAccess eTypeAccess, AbstractTypeDeclaration eType,
			ParameterizedType eParameterizedType) {// 
		Object[] result1_black = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_24_1_matchtggpattern_blackBBBB(model, eTypeAccess, eType,
						eParameterizedType);
		if (result1_black != null) {
			return ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_24_2_expressionF();
		} else {
			return ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAbstractType tAbstractType) {// 
		Object[] result1_black = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_25_1_matchtggpattern_blackB(tAbstractType);
		if (result1_black != null) {
			return ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_25_2_expressionF();
		} else {
			return ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, Model modelParameter,
			TypeToTAbstractType eTypeToTAbstractTypeParameter) {

		Object[] result1_black = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ParameterizedTypeToTypeImpl
				.pattern_ParameterizedTypeToType_26_2_isapplicablecore_blackFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList modelList = (RuleEntryList) result2_black[0];
			Model model = (Model) result2_black[1];
			//nothing RuleEntryList eTypeToTAbstractTypeList = (RuleEntryList) result2_black[2];
			TAbstractType tAbstractType = (TAbstractType) result2_black[3];
			TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result2_black[4];
			AbstractTypeDeclaration eType = (AbstractTypeDeclaration) result2_black[5];

			Object[] result3_bindingAndBlack = ParameterizedTypeToTypeImpl
					.pattern_ParameterizedTypeToType_26_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
							model, tAbstractType, eTypeToTAbstractType, eType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ", "
						+ "[tAbstractType] = " + tAbstractType + ", " + "[eTypeToTAbstractType] = "
						+ eTypeToTAbstractType + ", " + "[eType] = " + eType + ", " + "[ruleResult] = " + ruleResult
						+ ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_26_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ParameterizedTypeToTypeImpl
						.pattern_ParameterizedTypeToType_26_5_checknacs_blackBBBB(model, tAbstractType,
								eTypeToTAbstractType, eType);
				if (result5_black != null) {

					Object[] result6_black = ParameterizedTypeToTypeImpl
							.pattern_ParameterizedTypeToType_26_6_perform_blackBBBBB(model, tAbstractType,
									eTypeToTAbstractType, eType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model] = " + model
								+ ", " + "[tAbstractType] = " + tAbstractType + ", " + "[eTypeToTAbstractType] = "
								+ eTypeToTAbstractType + ", " + "[eType] = " + eType + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_26_6_perform_greenBBFBFFB(model,
							tAbstractType, eType, ruleResult);
					//nothing TypeAccess eTypeAccess = (TypeAccess) result6_green[2];
					//nothing TypeToTAbstractType eParameterizedTypeToTAbstractType = (TypeToTAbstractType) result6_green[4];
					//nothing ParameterizedType eParameterizedType = (ParameterizedType) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return ParameterizedTypeToTypeImpl.pattern_ParameterizedTypeToType_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Model model, TAbstractType tAbstractType,
			TypeToTAbstractType eTypeToTAbstractType, AbstractTypeDeclaration eType,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("eTypeToTAbstractType", eTypeToTAbstractType);
		isApplicableMatch.registerObject("eType", eType);
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
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___IS_APPROPRIATE_FWD__MATCH_MODEL_TYPEACCESS_ABSTRACTTYPEDECLARATION_PARAMETERIZEDTYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (Model) arguments.get(1), (TypeAccess) arguments.get(2),
					(AbstractTypeDeclaration) arguments.get(3), (ParameterizedType) arguments.get(4));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL_TYPEACCESS_ABSTRACTTYPEDECLARATION_PARAMETERIZEDTYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(TypeAccess) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3),
					(ParameterizedType) arguments.get(4));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL_TYPEACCESS_ABSTRACTTYPEDECLARATION_PARAMETERIZEDTYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(TypeAccess) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3),
					(ParameterizedType) arguments.get(4));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_TYPEACCESS_ABSTRACTTYPEDECLARATION_PARAMETERIZEDTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(TAbstractType) arguments.get(2), (TypeToTAbstractType) arguments.get(3),
					(TypeAccess) arguments.get(4), (AbstractTypeDeclaration) arguments.get(5),
					(ParameterizedType) arguments.get(6));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___IS_APPROPRIATE_BWD__MATCH_TABSTRACTTYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTTYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTTYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___IS_APPROPRIATE_BWD_TABSTRACT_TYPE_1__TABSTRACTTYPE:
			return isAppropriate_BWD_TAbstractType_1((TAbstractType) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_256__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_256((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__MODEL_TABSTRACTTYPE_TYPEACCESS_ABSTRACTTYPEDECLARATION_PARAMETERIZEDTYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Model) arguments.get(0), (TAbstractType) arguments.get(1),
					(TypeAccess) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3),
					(ParameterizedType) arguments.get(4), (Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___CHECK_DEC_FWD__MODEL_TYPEACCESS_ABSTRACTTYPEDECLARATION_PARAMETERIZEDTYPE:
			return checkDEC_FWD((Model) arguments.get(0), (TypeAccess) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (ParameterizedType) arguments.get(3));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___CHECK_DEC_BWD__TABSTRACTTYPE:
			return checkDEC_BWD((TAbstractType) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_MODEL_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (Model) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(TAbstractType) arguments.get(2), (TypeToTAbstractType) arguments.get(3),
					(AbstractTypeDeclaration) arguments.get(4), (ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.PARAMETERIZED_TYPE_TO_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParameterizedTypeToType_0_1_initialbindings_blackBBBBBB(
			ParameterizedTypeToType _this, Match match, Model model, TypeAccess eTypeAccess,
			AbstractTypeDeclaration eType, ParameterizedType eParameterizedType) {
		return new Object[] { _this, match, model, eTypeAccess, eType, eParameterizedType };
	}

	public static final Object[] pattern_ParameterizedTypeToType_0_2_SolveCSP_bindingFBBBBBB(
			ParameterizedTypeToType _this, Match match, Model model, TypeAccess eTypeAccess,
			AbstractTypeDeclaration eType, ParameterizedType eParameterizedType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, model, eTypeAccess, eType, eParameterizedType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, model, eTypeAccess, eType, eParameterizedType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToType_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			ParameterizedTypeToType _this, Match match, Model model, TypeAccess eTypeAccess,
			AbstractTypeDeclaration eType, ParameterizedType eParameterizedType) {
		Object[] result_pattern_ParameterizedTypeToType_0_2_SolveCSP_binding = pattern_ParameterizedTypeToType_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, model, eTypeAccess, eType, eParameterizedType);
		if (result_pattern_ParameterizedTypeToType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ParameterizedTypeToType_0_2_SolveCSP_black = pattern_ParameterizedTypeToType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, model, eTypeAccess, eType, eParameterizedType };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToType_0_3_CheckCSP_expressionFBB(
			ParameterizedTypeToType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, Model model, TypeAccess eTypeAccess, AbstractTypeDeclaration eType,
			ParameterizedType eParameterizedType) {
		return new Object[] { match, model, eTypeAccess, eType, eParameterizedType };
	}

	public static final Object[] pattern_ParameterizedTypeToType_0_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, Model model, TypeAccess eTypeAccess, AbstractTypeDeclaration eType,
			ParameterizedType eParameterizedType) {
		EMoflonEdge model__eParameterizedType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterizedType__eTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eTypeAccess);
		match.getToBeTranslatedNodes().add(eParameterizedType);
		String model__eParameterizedType____orphanTypes_name_prime = "orphanTypes";
		String eParameterizedType__eTypeAccess____type_name_prime = "type";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		model__eParameterizedType____orphanTypes.setSrc(model);
		model__eParameterizedType____orphanTypes.setTrg(eParameterizedType);
		match.getToBeTranslatedEdges().add(model__eParameterizedType____orphanTypes);
		eParameterizedType__eTypeAccess____type.setSrc(eParameterizedType);
		eParameterizedType__eTypeAccess____type.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eParameterizedType__eTypeAccess____type);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		match.getToBeTranslatedEdges().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eType__eTypeAccess____usagesInTypeAccess);
		model__eParameterizedType____orphanTypes.setName(model__eParameterizedType____orphanTypes_name_prime);
		eParameterizedType__eTypeAccess____type.setName(eParameterizedType__eTypeAccess____type_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { match, model, eTypeAccess, eType, eParameterizedType,
				model__eParameterizedType____orphanTypes, eParameterizedType__eTypeAccess____type,
				eTypeAccess__eType____type, eType__eTypeAccess____usagesInTypeAccess };
	}

	public static final Object[] pattern_ParameterizedTypeToType_0_5_collectcontextelements_blackBBBBB(Match match,
			Model model, TypeAccess eTypeAccess, AbstractTypeDeclaration eType, ParameterizedType eParameterizedType) {
		return new Object[] { match, model, eTypeAccess, eType, eParameterizedType };
	}

	public static final Object[] pattern_ParameterizedTypeToType_0_5_collectcontextelements_greenBBB(Match match,
			Model model, AbstractTypeDeclaration eType) {
		match.getContextNodes().add(model);
		match.getContextNodes().add(eType);
		return new Object[] { match, model, eType };
	}

	public static final void pattern_ParameterizedTypeToType_0_6_registerobjectstomatch_expressionBBBBBB(
			ParameterizedTypeToType _this, Match match, Model model, TypeAccess eTypeAccess,
			AbstractTypeDeclaration eType, ParameterizedType eParameterizedType) {
		_this.registerObjectsToMatch_FWD(match, model, eTypeAccess, eType, eParameterizedType);

	}

	public static final boolean pattern_ParameterizedTypeToType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToType_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("model");
		EObject _localVariable_1 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_2 = isApplicableMatch.getObject("eTypeToTAbstractType");
		EObject _localVariable_3 = isApplicableMatch.getObject("eTypeAccess");
		EObject _localVariable_4 = isApplicableMatch.getObject("eType");
		EObject _localVariable_5 = isApplicableMatch.getObject("eParameterizedType");
		EObject tmpModel = _localVariable_0;
		EObject tmpTAbstractType = _localVariable_1;
		EObject tmpETypeToTAbstractType = _localVariable_2;
		EObject tmpETypeAccess = _localVariable_3;
		EObject tmpEType = _localVariable_4;
		EObject tmpEParameterizedType = _localVariable_5;
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			if (tmpTAbstractType instanceof TAbstractType) {
				TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
				if (tmpETypeToTAbstractType instanceof TypeToTAbstractType) {
					TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) tmpETypeToTAbstractType;
					if (tmpETypeAccess instanceof TypeAccess) {
						TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
						if (tmpEType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration eType = (AbstractTypeDeclaration) tmpEType;
							if (tmpEParameterizedType instanceof ParameterizedType) {
								ParameterizedType eParameterizedType = (ParameterizedType) tmpEParameterizedType;
								return new Object[] { model, tAbstractType, eTypeToTAbstractType, eTypeAccess, eType,
										eParameterizedType, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_1_1_performtransformation_blackBBBBBBFBB(Model model,
			TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType, TypeAccess eTypeAccess,
			AbstractTypeDeclaration eType, ParameterizedType eParameterizedType, ParameterizedTypeToType _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { model, tAbstractType, eTypeToTAbstractType, eTypeAccess, eType,
						eParameterizedType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			ParameterizedTypeToType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterizedTypeToType_1_1_performtransformation_binding = pattern_ParameterizedTypeToType_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ParameterizedTypeToType_1_1_performtransformation_binding != null) {
			Model model = (Model) result_pattern_ParameterizedTypeToType_1_1_performtransformation_binding[0];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_ParameterizedTypeToType_1_1_performtransformation_binding[1];
			TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result_pattern_ParameterizedTypeToType_1_1_performtransformation_binding[2];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ParameterizedTypeToType_1_1_performtransformation_binding[3];
			AbstractTypeDeclaration eType = (AbstractTypeDeclaration) result_pattern_ParameterizedTypeToType_1_1_performtransformation_binding[4];
			ParameterizedType eParameterizedType = (ParameterizedType) result_pattern_ParameterizedTypeToType_1_1_performtransformation_binding[5];

			Object[] result_pattern_ParameterizedTypeToType_1_1_performtransformation_black = pattern_ParameterizedTypeToType_1_1_performtransformation_blackBBBBBBFBB(
					model, tAbstractType, eTypeToTAbstractType, eTypeAccess, eType, eParameterizedType, _this,
					isApplicableMatch);
			if (result_pattern_ParameterizedTypeToType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ParameterizedTypeToType_1_1_performtransformation_black[6];

				return new Object[] { model, tAbstractType, eTypeToTAbstractType, eTypeAccess, eType,
						eParameterizedType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_1_1_performtransformation_greenBFB(
			TAbstractType tAbstractType, ParameterizedType eParameterizedType) {
		TypeToTAbstractType eParameterizedTypeToTAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		eParameterizedTypeToTAbstractType.setTarget(tAbstractType);
		eParameterizedTypeToTAbstractType.setSource(eParameterizedType);
		return new Object[] { tAbstractType, eParameterizedTypeToTAbstractType, eParameterizedType };
	}

	public static final Object[] pattern_ParameterizedTypeToType_1_2_collecttranslatedelements_blackBBB(
			TypeAccess eTypeAccess, TypeToTAbstractType eParameterizedTypeToTAbstractType,
			ParameterizedType eParameterizedType) {
		return new Object[] { eTypeAccess, eParameterizedTypeToTAbstractType, eParameterizedType };
	}

	public static final Object[] pattern_ParameterizedTypeToType_1_2_collecttranslatedelements_greenFBBB(
			TypeAccess eTypeAccess, TypeToTAbstractType eParameterizedTypeToTAbstractType,
			ParameterizedType eParameterizedType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(eTypeAccess);
		ruleresult.getCreatedLinkElements().add(eParameterizedTypeToTAbstractType);
		ruleresult.getTranslatedElements().add(eParameterizedType);
		return new Object[] { ruleresult, eTypeAccess, eParameterizedTypeToTAbstractType, eParameterizedType };
	}

	public static final Object[] pattern_ParameterizedTypeToType_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject model, EObject tAbstractType, EObject eTypeToTAbstractType,
			EObject eTypeAccess, EObject eType, EObject eParameterizedTypeToTAbstractType, EObject eParameterizedType) {
		if (!model.equals(tAbstractType)) {
			if (!eTypeToTAbstractType.equals(model)) {
				if (!eTypeToTAbstractType.equals(tAbstractType)) {
					if (!eTypeAccess.equals(model)) {
						if (!eTypeAccess.equals(tAbstractType)) {
							if (!eTypeAccess.equals(eTypeToTAbstractType)) {
								if (!eType.equals(model)) {
									if (!eType.equals(tAbstractType)) {
										if (!eType.equals(eTypeToTAbstractType)) {
											if (!eType.equals(eTypeAccess)) {
												if (!eParameterizedTypeToTAbstractType.equals(model)) {
													if (!eParameterizedTypeToTAbstractType.equals(tAbstractType)) {
														if (!eParameterizedTypeToTAbstractType
																.equals(eTypeToTAbstractType)) {
															if (!eParameterizedTypeToTAbstractType
																	.equals(eTypeAccess)) {
																if (!eParameterizedTypeToTAbstractType.equals(eType)) {
																	if (!eParameterizedType.equals(model)) {
																		if (!eParameterizedType.equals(tAbstractType)) {
																			if (!eParameterizedType
																					.equals(eTypeToTAbstractType)) {
																				if (!eParameterizedType
																						.equals(eTypeAccess)) {
																					if (!eParameterizedType
																							.equals(eType)) {
																						if (!eParameterizedType.equals(
																								eParameterizedTypeToTAbstractType)) {
																							return new Object[] {
																									ruleresult, model,
																									tAbstractType,
																									eTypeToTAbstractType,
																									eTypeAccess, eType,
																									eParameterizedTypeToTAbstractType,
																									eParameterizedType };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterizedTypeToType_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject model, EObject tAbstractType, EObject eTypeAccess, EObject eType,
			EObject eParameterizedTypeToTAbstractType, EObject eParameterizedType) {
		EMoflonEdge model__eParameterizedType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterizedTypeToTAbstractType__tAbstractType____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eParameterizedType__eTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterizedTypeToTAbstractType__eParameterizedType____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterizedTypeToType";
		String model__eParameterizedType____orphanTypes_name_prime = "orphanTypes";
		String eParameterizedTypeToTAbstractType__tAbstractType____target_name_prime = "target";
		String eParameterizedType__eTypeAccess____type_name_prime = "type";
		String eParameterizedTypeToTAbstractType__eParameterizedType____source_name_prime = "source";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		model__eParameterizedType____orphanTypes.setSrc(model);
		model__eParameterizedType____orphanTypes.setTrg(eParameterizedType);
		ruleresult.getTranslatedEdges().add(model__eParameterizedType____orphanTypes);
		eParameterizedTypeToTAbstractType__tAbstractType____target.setSrc(eParameterizedTypeToTAbstractType);
		eParameterizedTypeToTAbstractType__tAbstractType____target.setTrg(tAbstractType);
		ruleresult.getCreatedEdges().add(eParameterizedTypeToTAbstractType__tAbstractType____target);
		eParameterizedType__eTypeAccess____type.setSrc(eParameterizedType);
		eParameterizedType__eTypeAccess____type.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eParameterizedType__eTypeAccess____type);
		eParameterizedTypeToTAbstractType__eParameterizedType____source.setSrc(eParameterizedTypeToTAbstractType);
		eParameterizedTypeToTAbstractType__eParameterizedType____source.setTrg(eParameterizedType);
		ruleresult.getCreatedEdges().add(eParameterizedTypeToTAbstractType__eParameterizedType____source);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		ruleresult.getTranslatedEdges().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eType__eTypeAccess____usagesInTypeAccess);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		model__eParameterizedType____orphanTypes.setName(model__eParameterizedType____orphanTypes_name_prime);
		eParameterizedTypeToTAbstractType__tAbstractType____target
				.setName(eParameterizedTypeToTAbstractType__tAbstractType____target_name_prime);
		eParameterizedType__eTypeAccess____type.setName(eParameterizedType__eTypeAccess____type_name_prime);
		eParameterizedTypeToTAbstractType__eParameterizedType____source
				.setName(eParameterizedTypeToTAbstractType__eParameterizedType____source_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { ruleresult, model, tAbstractType, eTypeAccess, eType, eParameterizedTypeToTAbstractType,
				eParameterizedType, model__eParameterizedType____orphanTypes,
				eParameterizedTypeToTAbstractType__tAbstractType____target, eParameterizedType__eTypeAccess____type,
				eParameterizedTypeToTAbstractType__eParameterizedType____source, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess };
	}

	public static final void pattern_ParameterizedTypeToType_1_5_registerobjects_expressionBBBBBBBBB(
			ParameterizedTypeToType _this, PerformRuleResult ruleresult, EObject model, EObject tAbstractType,
			EObject eTypeToTAbstractType, EObject eTypeAccess, EObject eType, EObject eParameterizedTypeToTAbstractType,
			EObject eParameterizedType) {
		_this.registerObjects_FWD(ruleresult, model, tAbstractType, eTypeToTAbstractType, eTypeAccess, eType,
				eParameterizedTypeToTAbstractType, eParameterizedType);

	}

	public static final PerformRuleResult pattern_ParameterizedTypeToType_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_2_1_preparereturnvalue_bindingFB(
			ParameterizedTypeToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ParameterizedTypeToType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_2_1_preparereturnvalue_bindingAndBlackFFB(
			ParameterizedTypeToType _this) {
		Object[] result_pattern_ParameterizedTypeToType_2_1_preparereturnvalue_binding = pattern_ParameterizedTypeToType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedTypeToType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterizedTypeToType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedTypeToType_2_1_preparereturnvalue_black = pattern_ParameterizedTypeToType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterizedTypeToType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterizedTypeToType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ParameterizedTypeToType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterizedTypeToType_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("model");
		EObject _localVariable_1 = match.getObject("eTypeAccess");
		EObject _localVariable_2 = match.getObject("eType");
		EObject _localVariable_3 = match.getObject("eParameterizedType");
		EObject tmpModel = _localVariable_0;
		EObject tmpETypeAccess = _localVariable_1;
		EObject tmpEType = _localVariable_2;
		EObject tmpEParameterizedType = _localVariable_3;
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			if (tmpETypeAccess instanceof TypeAccess) {
				TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
				if (tmpEType instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration eType = (AbstractTypeDeclaration) tmpEType;
					if (tmpEParameterizedType instanceof ParameterizedType) {
						ParameterizedType eParameterizedType = (ParameterizedType) tmpEParameterizedType;
						return new Object[] { model, eTypeAccess, eType, eParameterizedType, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToType_2_2_corematch_blackBFFBBBB(Model model,
			TypeAccess eTypeAccess, AbstractTypeDeclaration eType, ParameterizedType eParameterizedType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType eTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eType, TypeToTAbstractType.class, "source")) {
			TAbstractType tAbstractType = eTypeToTAbstractType.getTarget();
			if (tAbstractType != null) {
				_result.add(new Object[] { model, tAbstractType, eTypeToTAbstractType, eTypeAccess, eType,
						eParameterizedType, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToType_2_3_findcontext_blackBBBBBB(Model model,
			TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType, TypeAccess eTypeAccess,
			AbstractTypeDeclaration eType, ParameterizedType eParameterizedType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (model.getOrphanTypes().contains(eParameterizedType)) {
			if (eType.equals(eTypeToTAbstractType.getSource())) {
				if (eTypeAccess.equals(eParameterizedType.getType())) {
					if (eType.equals(eTypeAccess.getType())) {
						if (tAbstractType.equals(eTypeToTAbstractType.getTarget())) {
							_result.add(new Object[] { model, tAbstractType, eTypeToTAbstractType, eTypeAccess, eType,
									eParameterizedType });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_2_3_findcontext_greenBBBBBBFFFFFFF(Model model,
			TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType, TypeAccess eTypeAccess,
			AbstractTypeDeclaration eType, ParameterizedType eParameterizedType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge model__eParameterizedType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeToTAbstractType__eType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterizedType__eTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeToTAbstractType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String model__eParameterizedType____orphanTypes_name_prime = "orphanTypes";
		String eTypeToTAbstractType__eType____source_name_prime = "source";
		String eParameterizedType__eTypeAccess____type_name_prime = "type";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eTypeToTAbstractType__tAbstractType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(eTypeToTAbstractType);
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eType);
		isApplicableMatch.getAllContextElements().add(eParameterizedType);
		model__eParameterizedType____orphanTypes.setSrc(model);
		model__eParameterizedType____orphanTypes.setTrg(eParameterizedType);
		isApplicableMatch.getAllContextElements().add(model__eParameterizedType____orphanTypes);
		eTypeToTAbstractType__eType____source.setSrc(eTypeToTAbstractType);
		eTypeToTAbstractType__eType____source.setTrg(eType);
		isApplicableMatch.getAllContextElements().add(eTypeToTAbstractType__eType____source);
		eParameterizedType__eTypeAccess____type.setSrc(eParameterizedType);
		eParameterizedType__eTypeAccess____type.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eParameterizedType__eTypeAccess____type);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		isApplicableMatch.getAllContextElements().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eType__eTypeAccess____usagesInTypeAccess);
		eTypeToTAbstractType__tAbstractType____target.setSrc(eTypeToTAbstractType);
		eTypeToTAbstractType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(eTypeToTAbstractType__tAbstractType____target);
		model__eParameterizedType____orphanTypes.setName(model__eParameterizedType____orphanTypes_name_prime);
		eTypeToTAbstractType__eType____source.setName(eTypeToTAbstractType__eType____source_name_prime);
		eParameterizedType__eTypeAccess____type.setName(eParameterizedType__eTypeAccess____type_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		eTypeToTAbstractType__tAbstractType____target.setName(eTypeToTAbstractType__tAbstractType____target_name_prime);
		return new Object[] { model, tAbstractType, eTypeToTAbstractType, eTypeAccess, eType, eParameterizedType,
				isApplicableMatch, model__eParameterizedType____orphanTypes, eTypeToTAbstractType__eType____source,
				eParameterizedType__eTypeAccess____type, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess, eTypeToTAbstractType__tAbstractType____target };
	}

	public static final Object[] pattern_ParameterizedTypeToType_2_4_solveCSP_bindingFBBBBBBBB(
			ParameterizedTypeToType _this, IsApplicableMatch isApplicableMatch, Model model,
			TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType, TypeAccess eTypeAccess,
			AbstractTypeDeclaration eType, ParameterizedType eParameterizedType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, model, tAbstractType,
				eTypeToTAbstractType, eTypeAccess, eType, eParameterizedType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, tAbstractType, eTypeToTAbstractType,
					eTypeAccess, eType, eParameterizedType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToType_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			ParameterizedTypeToType _this, IsApplicableMatch isApplicableMatch, Model model,
			TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType, TypeAccess eTypeAccess,
			AbstractTypeDeclaration eType, ParameterizedType eParameterizedType) {
		Object[] result_pattern_ParameterizedTypeToType_2_4_solveCSP_binding = pattern_ParameterizedTypeToType_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, model, tAbstractType, eTypeToTAbstractType, eTypeAccess, eType,
				eParameterizedType);
		if (result_pattern_ParameterizedTypeToType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToType_2_4_solveCSP_binding[0];

			Object[] result_pattern_ParameterizedTypeToType_2_4_solveCSP_black = pattern_ParameterizedTypeToType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, tAbstractType, eTypeToTAbstractType,
						eTypeAccess, eType, eParameterizedType };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToType_2_5_checkCSP_expressionFBB(
			ParameterizedTypeToType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterizedTypeToType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterizedTypeToType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterizedTypeToType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_10_1_initialbindings_blackBBB(
			ParameterizedTypeToType _this, Match match, TAbstractType tAbstractType) {
		return new Object[] { _this, match, tAbstractType };
	}

	public static final Object[] pattern_ParameterizedTypeToType_10_2_SolveCSP_bindingFBBB(
			ParameterizedTypeToType _this, Match match, TAbstractType tAbstractType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAbstractType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToType_10_2_SolveCSP_bindingAndBlackFBBB(
			ParameterizedTypeToType _this, Match match, TAbstractType tAbstractType) {
		Object[] result_pattern_ParameterizedTypeToType_10_2_SolveCSP_binding = pattern_ParameterizedTypeToType_10_2_SolveCSP_bindingFBBB(
				_this, match, tAbstractType);
		if (result_pattern_ParameterizedTypeToType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ParameterizedTypeToType_10_2_SolveCSP_black = pattern_ParameterizedTypeToType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAbstractType };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToType_10_3_CheckCSP_expressionFBB(
			ParameterizedTypeToType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_10_4_collectelementstobetranslated_blackBB(Match match,
			TAbstractType tAbstractType) {
		return new Object[] { match, tAbstractType };
	}

	public static final Object[] pattern_ParameterizedTypeToType_10_5_collectcontextelements_blackBB(Match match,
			TAbstractType tAbstractType) {
		return new Object[] { match, tAbstractType };
	}

	public static final Object[] pattern_ParameterizedTypeToType_10_5_collectcontextelements_greenBB(Match match,
			TAbstractType tAbstractType) {
		match.getContextNodes().add(tAbstractType);
		return new Object[] { match, tAbstractType };
	}

	public static final void pattern_ParameterizedTypeToType_10_6_registerobjectstomatch_expressionBBB(
			ParameterizedTypeToType _this, Match match, TAbstractType tAbstractType) {
		_this.registerObjectsToMatch_BWD(match, tAbstractType);

	}

	public static final boolean pattern_ParameterizedTypeToType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToType_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_17_1_preparereturnvalue_bindingFB(
			ParameterizedTypeToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ParameterizedTypeToType _this) {
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

	public static final Object[] pattern_ParameterizedTypeToType_17_1_preparereturnvalue_bindingAndBlackFFBF(
			ParameterizedTypeToType _this) {
		Object[] result_pattern_ParameterizedTypeToType_17_1_preparereturnvalue_binding = pattern_ParameterizedTypeToType_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedTypeToType_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterizedTypeToType_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedTypeToType_17_1_preparereturnvalue_black = pattern_ParameterizedTypeToType_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ParameterizedTypeToType_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterizedTypeToType_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ParameterizedTypeToType_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToType_17_2_testcorematchandDECs_blackB(
			TAbstractType tAbstractType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { tAbstractType });
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterizedTypeToType_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			ParameterizedTypeToType _this, Match match, TAbstractType tAbstractType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAbstractType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToType_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ParameterizedTypeToType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ParameterizedTypeToType_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_18_1_preparereturnvalue_bindingFB(
			ParameterizedTypeToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ParameterizedTypeToType _this) {
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

	public static final Object[] pattern_ParameterizedTypeToType_18_1_preparereturnvalue_bindingAndBlackFFBF(
			ParameterizedTypeToType _this) {
		Object[] result_pattern_ParameterizedTypeToType_18_1_preparereturnvalue_binding = pattern_ParameterizedTypeToType_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedTypeToType_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterizedTypeToType_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedTypeToType_18_1_preparereturnvalue_black = pattern_ParameterizedTypeToType_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ParameterizedTypeToType_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterizedTypeToType_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ParameterizedTypeToType_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_0BB(
			TypeAccess eTypeAccess, AbstractTypeDeclaration eType) {
		for (AbstractTypeDeclaration __DEC_eTypeAccess_superInterfaces_161098 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!eType.equals(__DEC_eTypeAccess_superInterfaces_161098)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_1B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_864377 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_2B(
			TypeAccess eTypeAccess) {
		for (AnnotationTypeMemberDeclaration __DEC_eTypeAccess_type_572672 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_3B(
			TypeAccess eTypeAccess) {
		for (ArrayType __DEC_eTypeAccess_elementType_62123 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_4B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_576285 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_5BB(
			TypeAccess eTypeAccess, AbstractTypeDeclaration eType) {
		for (ClassDeclaration __DEC_eTypeAccess_superClass_955012 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!eType.equals(__DEC_eTypeAccess_superClass_955012)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_6B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_975706 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_268638 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_8B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_144178 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_9BB(
			AbstractTypeDeclaration eType, TypeAccess eTypeAccess) {
		if (eType.getSuperInterfaces().contains(eTypeAccess)) {
			return new Object[] { eType, eTypeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_orphanTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpModel = _edge_orphanTypes.getSrc();
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			EObject tmpEParameterizedType = _edge_orphanTypes.getTrg();
			if (tmpEParameterizedType instanceof ParameterizedType) {
				ParameterizedType eParameterizedType = (ParameterizedType) tmpEParameterizedType;
				if (model.getOrphanTypes().contains(eParameterizedType)) {
					TypeAccess eTypeAccess = eParameterizedType.getType();
					if (eTypeAccess != null) {
						Type tmpEType = eTypeAccess.getType();
						if (tmpEType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration eType = (AbstractTypeDeclaration) tmpEType;
							if (pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_1B(
									eTypeAccess) == null) {
								if (pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_2B(
										eTypeAccess) == null) {
									if (pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_3B(
											eTypeAccess) == null) {
										if (pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_4B(
												eTypeAccess) == null) {
											if (pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_6B(
													eTypeAccess) == null) {
												if (pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_7B(
														eTypeAccess) == null) {
													if (pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_8B(
															eTypeAccess) == null) {
														if (pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_0BB(
																eTypeAccess, eType) == null) {
															if (pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_5BB(
																	eTypeAccess, eType) == null) {
																if (pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_black_nac_9BB(
																		eType, eTypeAccess) == null) {
																	_result.add(new Object[] { model, eTypeAccess,
																			eType, eParameterizedType,
																			_edge_orphanTypes });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterizedTypeToType_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterizedTypeToType_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			ParameterizedTypeToType _this, Match match, Model model, TypeAccess eTypeAccess,
			AbstractTypeDeclaration eType, ParameterizedType eParameterizedType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, model, eTypeAccess, eType, eParameterizedType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToType_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ParameterizedTypeToType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ParameterizedTypeToType_18_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_21_1_prepare_blackB(ParameterizedTypeToType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParameterizedTypeToType_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ParameterizedTypeToType_21_2_matchsrctrgcontext_bindingFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("model");
		EObject _localVariable_1 = targetMatch.getObject("tAbstractType");
		EObject _localVariable_2 = sourceMatch.getObject("eTypeAccess");
		EObject _localVariable_3 = sourceMatch.getObject("eType");
		EObject _localVariable_4 = sourceMatch.getObject("eParameterizedType");
		EObject tmpModel = _localVariable_0;
		EObject tmpTAbstractType = _localVariable_1;
		EObject tmpETypeAccess = _localVariable_2;
		EObject tmpEType = _localVariable_3;
		EObject tmpEParameterizedType = _localVariable_4;
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			if (tmpTAbstractType instanceof TAbstractType) {
				TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
				if (tmpETypeAccess instanceof TypeAccess) {
					TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
					if (tmpEType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration eType = (AbstractTypeDeclaration) tmpEType;
						if (tmpEParameterizedType instanceof ParameterizedType) {
							ParameterizedType eParameterizedType = (ParameterizedType) tmpEParameterizedType;
							return new Object[] { model, tAbstractType, eTypeAccess, eType, eParameterizedType,
									sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_21_2_matchsrctrgcontext_blackBBBBBBB(Model model,
			TAbstractType tAbstractType, TypeAccess eTypeAccess, AbstractTypeDeclaration eType,
			ParameterizedType eParameterizedType, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { model, tAbstractType, eTypeAccess, eType, eParameterizedType, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_21_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ParameterizedTypeToType_21_2_matchsrctrgcontext_binding = pattern_ParameterizedTypeToType_21_2_matchsrctrgcontext_bindingFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_ParameterizedTypeToType_21_2_matchsrctrgcontext_binding != null) {
			Model model = (Model) result_pattern_ParameterizedTypeToType_21_2_matchsrctrgcontext_binding[0];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_ParameterizedTypeToType_21_2_matchsrctrgcontext_binding[1];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ParameterizedTypeToType_21_2_matchsrctrgcontext_binding[2];
			AbstractTypeDeclaration eType = (AbstractTypeDeclaration) result_pattern_ParameterizedTypeToType_21_2_matchsrctrgcontext_binding[3];
			ParameterizedType eParameterizedType = (ParameterizedType) result_pattern_ParameterizedTypeToType_21_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_ParameterizedTypeToType_21_2_matchsrctrgcontext_black = pattern_ParameterizedTypeToType_21_2_matchsrctrgcontext_blackBBBBBBB(
					model, tAbstractType, eTypeAccess, eType, eParameterizedType, sourceMatch, targetMatch);
			if (result_pattern_ParameterizedTypeToType_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { model, tAbstractType, eTypeAccess, eType, eParameterizedType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_21_3_solvecsp_bindingFBBBBBBBB(
			ParameterizedTypeToType _this, Model model, TAbstractType tAbstractType, TypeAccess eTypeAccess,
			AbstractTypeDeclaration eType, ParameterizedType eParameterizedType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(model, tAbstractType, eTypeAccess, eType,
				eParameterizedType, sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, model, tAbstractType, eTypeAccess, eType, eParameterizedType, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToType_21_3_solvecsp_bindingAndBlackFBBBBBBBB(
			ParameterizedTypeToType _this, Model model, TAbstractType tAbstractType, TypeAccess eTypeAccess,
			AbstractTypeDeclaration eType, ParameterizedType eParameterizedType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ParameterizedTypeToType_21_3_solvecsp_binding = pattern_ParameterizedTypeToType_21_3_solvecsp_bindingFBBBBBBBB(
				_this, model, tAbstractType, eTypeAccess, eType, eParameterizedType, sourceMatch, targetMatch);
		if (result_pattern_ParameterizedTypeToType_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToType_21_3_solvecsp_binding[0];

			Object[] result_pattern_ParameterizedTypeToType_21_3_solvecsp_black = pattern_ParameterizedTypeToType_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToType_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, model, tAbstractType, eTypeAccess, eType, eParameterizedType,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToType_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToType_21_5_matchcorrcontext_blackBFBBB(
			TAbstractType tAbstractType, AbstractTypeDeclaration eType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType eTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eType, TypeToTAbstractType.class, "source")) {
				if (tAbstractType.equals(eTypeToTAbstractType.getTarget())) {
					_result.add(new Object[] { tAbstractType, eTypeToTAbstractType, eType, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_21_5_matchcorrcontext_greenBBBF(
			TypeToTAbstractType eTypeToTAbstractType, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ParameterizedTypeToType";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eTypeToTAbstractType);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eTypeToTAbstractType, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ParameterizedTypeToType_21_6_createcorrespondence_blackBBBBBB(Model model,
			TAbstractType tAbstractType, TypeAccess eTypeAccess, AbstractTypeDeclaration eType,
			ParameterizedType eParameterizedType, CCMatch ccMatch) {
		return new Object[] { model, tAbstractType, eTypeAccess, eType, eParameterizedType, ccMatch };
	}

	public static final Object[] pattern_ParameterizedTypeToType_21_6_createcorrespondence_greenBFBB(
			TAbstractType tAbstractType, ParameterizedType eParameterizedType, CCMatch ccMatch) {
		TypeToTAbstractType eParameterizedTypeToTAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		eParameterizedTypeToTAbstractType.setTarget(tAbstractType);
		eParameterizedTypeToTAbstractType.setSource(eParameterizedType);
		ccMatch.getCreateCorr().add(eParameterizedTypeToTAbstractType);
		return new Object[] { tAbstractType, eParameterizedTypeToTAbstractType, eParameterizedType, ccMatch };
	}

	public static final Object[] pattern_ParameterizedTypeToType_21_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ParameterizedTypeToType_21_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ParameterizedTypeToType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterizedTypeToType_21_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_0BB(
			TypeAccess eTypeAccess, AbstractTypeDeclaration eType) {
		for (AbstractTypeDeclaration __DEC_eTypeAccess_superInterfaces_6162 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!eType.equals(__DEC_eTypeAccess_superInterfaces_6162)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_1B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_649065 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_2B(
			TypeAccess eTypeAccess) {
		for (AnnotationTypeMemberDeclaration __DEC_eTypeAccess_type_237051 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationTypeMemberDeclaration.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_3B(
			TypeAccess eTypeAccess) {
		for (ArrayType __DEC_eTypeAccess_elementType_691756 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_4B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_334686 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_5BB(
			TypeAccess eTypeAccess, AbstractTypeDeclaration eType) {
		for (ClassDeclaration __DEC_eTypeAccess_superClass_519259 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!eType.equals(__DEC_eTypeAccess_superClass_519259)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_6B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_544810 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_238833 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_8B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_858350 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_9BB(
			AbstractTypeDeclaration eType, TypeAccess eTypeAccess) {
		if (eType.getSuperInterfaces().contains(eTypeAccess)) {
			return new Object[] { eType, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_24_1_matchtggpattern_blackBBBB(Model model,
			TypeAccess eTypeAccess, AbstractTypeDeclaration eType, ParameterizedType eParameterizedType) {
		if (model.getOrphanTypes().contains(eParameterizedType)) {
			if (eTypeAccess.equals(eParameterizedType.getType())) {
				if (eType.equals(eTypeAccess.getType())) {
					if (pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_0BB(eTypeAccess,
							eType) == null) {
						if (pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_1B(eTypeAccess) == null) {
							if (pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_2B(
									eTypeAccess) == null) {
								if (pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_3B(
										eTypeAccess) == null) {
									if (pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_4B(
											eTypeAccess) == null) {
										if (pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_5BB(
												eTypeAccess, eType) == null) {
											if (pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_6B(
													eTypeAccess) == null) {
												if (pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_7B(
														eTypeAccess) == null) {
													if (pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_8B(
															eTypeAccess) == null) {
														if (pattern_ParameterizedTypeToType_24_1_matchtggpattern_black_nac_9BB(
																eType, eTypeAccess) == null) {
															return new Object[] { model, eTypeAccess, eType,
																	eParameterizedType };
														}
													}
												}
											}
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

	public static final boolean pattern_ParameterizedTypeToType_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToType_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_25_1_matchtggpattern_blackB(
			TAbstractType tAbstractType) {
		return new Object[] { tAbstractType };
	}

	public static final boolean pattern_ParameterizedTypeToType_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToType_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_26_1_createresult_blackB(
			ParameterizedTypeToType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParameterizedTypeToType_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ParameterizedTypeToType_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Model model) {
		if (ruleResult.getSourceObjects().contains(model)) {
			return new Object[] { ruleResult, model };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tAbstractType) {
		if (ruleResult.getTargetObjects().contains(tAbstractType)) {
			return new Object[] { ruleResult, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eTypeToTAbstractType) {
		if (ruleResult.getCorrObjects().contains(eTypeToTAbstractType)) {
			return new Object[] { ruleResult, eTypeToTAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_26_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration eType) {
		if (ruleResult.getSourceObjects().contains(eType)) {
			return new Object[] { ruleResult, eType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToType_26_2_isapplicablecore_blackFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList modelList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList eTypeToTAbstractTypeList : ruleEntryContainer.getRuleEntryList()) {
				if (!eTypeToTAbstractTypeList.equals(modelList)) {
					for (EObject tmpModel : modelList.getEntryObjects()) {
						if (tmpModel instanceof Model) {
							Model model = (Model) tmpModel;
							if (pattern_ParameterizedTypeToType_26_2_isapplicablecore_black_nac_0BB(ruleResult,
									model) == null) {
								for (EObject tmpETypeToTAbstractType : eTypeToTAbstractTypeList.getEntryObjects()) {
									if (tmpETypeToTAbstractType instanceof TypeToTAbstractType) {
										TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) tmpETypeToTAbstractType;
										TAbstractType tAbstractType = eTypeToTAbstractType.getTarget();
										if (tAbstractType != null) {
											Type tmpEType = eTypeToTAbstractType.getSource();
											if (tmpEType instanceof AbstractTypeDeclaration) {
												AbstractTypeDeclaration eType = (AbstractTypeDeclaration) tmpEType;
												if (pattern_ParameterizedTypeToType_26_2_isapplicablecore_black_nac_2BB(
														ruleResult, eTypeToTAbstractType) == null) {
													if (pattern_ParameterizedTypeToType_26_2_isapplicablecore_black_nac_1BB(
															ruleResult, tAbstractType) == null) {
														if (pattern_ParameterizedTypeToType_26_2_isapplicablecore_black_nac_3BB(
																ruleResult, eType) == null) {
															_result.add(new Object[] { modelList, model,
																	eTypeToTAbstractTypeList, tAbstractType,
																	eTypeToTAbstractType, eType, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_26_3_solveCSP_bindingFBBBBBBB(
			ParameterizedTypeToType _this, IsApplicableMatch isApplicableMatch, Model model,
			TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType, AbstractTypeDeclaration eType,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, model, tAbstractType,
				eTypeToTAbstractType, eType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, tAbstractType, eTypeToTAbstractType, eType,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToType_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToType_26_3_solveCSP_bindingAndBlackFBBBBBBB(
			ParameterizedTypeToType _this, IsApplicableMatch isApplicableMatch, Model model,
			TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType, AbstractTypeDeclaration eType,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ParameterizedTypeToType_26_3_solveCSP_binding = pattern_ParameterizedTypeToType_26_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, model, tAbstractType, eTypeToTAbstractType, eType, ruleResult);
		if (result_pattern_ParameterizedTypeToType_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToType_26_3_solveCSP_binding[0];

			Object[] result_pattern_ParameterizedTypeToType_26_3_solveCSP_black = pattern_ParameterizedTypeToType_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToType_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, tAbstractType, eTypeToTAbstractType, eType,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToType_26_4_checkCSP_expressionFBB(
			ParameterizedTypeToType _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToType_26_5_checknacs_blackBBBB(Model model,
			TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType, AbstractTypeDeclaration eType) {
		return new Object[] { model, tAbstractType, eTypeToTAbstractType, eType };
	}

	public static final Object[] pattern_ParameterizedTypeToType_26_6_perform_blackBBBBB(Model model,
			TAbstractType tAbstractType, TypeToTAbstractType eTypeToTAbstractType, AbstractTypeDeclaration eType,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { model, tAbstractType, eTypeToTAbstractType, eType, ruleResult };
	}

	public static final Object[] pattern_ParameterizedTypeToType_26_6_perform_greenBBFBFFB(Model model,
			TAbstractType tAbstractType, AbstractTypeDeclaration eType, ModelgeneratorRuleResult ruleResult) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		TypeToTAbstractType eParameterizedTypeToTAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ParameterizedType eParameterizedType = JavaFactory.eINSTANCE.createParameterizedType();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		eTypeAccess.setType(eType);
		ruleResult.getSourceObjects().add(eTypeAccess);
		eParameterizedTypeToTAbstractType.setTarget(tAbstractType);
		ruleResult.getCorrObjects().add(eParameterizedTypeToTAbstractType);
		model.getOrphanTypes().add(eParameterizedType);
		eParameterizedType.setType(eTypeAccess);
		eParameterizedTypeToTAbstractType.setSource(eParameterizedType);
		ruleResult.getSourceObjects().add(eParameterizedType);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { model, tAbstractType, eTypeAccess, eType, eParameterizedTypeToTAbstractType,
				eParameterizedType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ParameterizedTypeToType_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParameterizedTypeToTypeImpl
