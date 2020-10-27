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

import org.gravity.tgg.modisco.pm.ModelToTypeGraph;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.ParameterizedTypeToClass;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TypeGraph;

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
 * An implementation of the model object '<em><b>Parameterized Type To Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParameterizedTypeToClassImpl extends AbstractRuleImpl implements ParameterizedTypeToClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedTypeToClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParameterizedTypeToClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, TypeAccess eTypeAccess, Type eType, Model eModel,
			ParameterizedType eParameterizedType) {

		Object[] result1_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_0_1_initialbindings_blackBBBBBB(this, match, eTypeAccess, eType,
						eModel, eParameterizedType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = " + eType
					+ ", " + "[eModel] = " + eModel + ", " + "[eParameterizedType] = " + eParameterizedType + ".");
		}

		Object[] result2_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, eTypeAccess, eType,
						eModel, eParameterizedType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = " + eType
					+ ", " + "[eModel] = " + eModel + ", " + "[eParameterizedType] = " + eParameterizedType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_0_4_collectelementstobetranslated_blackBBBBB(match, eTypeAccess,
							eType, eModel, eParameterizedType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = " + eType + ", " + "[eModel] = " + eModel
						+ ", " + "[eParameterizedType] = " + eParameterizedType + ".");
			}
			ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_0_4_collectelementstobetranslated_greenBBBBBFFFF(match,
							eTypeAccess, eType, eModel, eParameterizedType);
			//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge eModel__eParameterizedType____orphanTypes = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge eParameterizedType__eTypeAccess____type = (EMoflonEdge) result4_green[8];

			Object[] result5_black = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_0_5_collectcontextelements_blackBBBBB(match, eTypeAccess, eType,
							eModel, eParameterizedType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = " + eType + ", " + "[eModel] = " + eModel
						+ ", " + "[eParameterizedType] = " + eParameterizedType + ".");
			}
			ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_0_5_collectcontextelements_greenBBB(match,
					eType, eModel);

			// 
			ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_0_6_registerobjectstomatch_expressionBBBBBB(
					this, match, eTypeAccess, eType, eModel, eParameterizedType);
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_0_7_expressionF();
		} else {
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[1];
		TypeAccess eTypeAccess = (TypeAccess) result1_bindingAndBlack[2];
		ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result1_bindingAndBlack[3];
		Type eType = (Type) result1_bindingAndBlack[4];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[5];
		Model eModel = (Model) result1_bindingAndBlack[6];
		ParameterizedType eParameterizedType = (ParameterizedType) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_1_1_performtransformation_greenFBB(tAbstractType, eParameterizedType);
		TypeToTAbstractType eParameterizedTypeToTAbstractType = (TypeToTAbstractType) result1_green[0];

		Object[] result2_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_1_2_collecttranslatedelements_blackBBB(
						eParameterizedTypeToTAbstractType, eTypeAccess, eParameterizedType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: "
					+ "[eParameterizedTypeToTAbstractType] = " + eParameterizedTypeToTAbstractType + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eParameterizedType] = " + eParameterizedType + ".");
		}
		Object[] result2_green = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_1_2_collecttranslatedelements_greenFBBB(
						eParameterizedTypeToTAbstractType, eTypeAccess, eParameterizedType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						eTypeToTAbstractType, eParameterizedTypeToTAbstractType, tAbstractType, eTypeAccess, eModelToPg,
						eType, pg, eModel, eParameterizedType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eTypeToTAbstractType] = " + eTypeToTAbstractType + ", "
					+ "[eParameterizedTypeToTAbstractType] = " + eParameterizedTypeToTAbstractType + ", "
					+ "[tAbstractType] = " + tAbstractType + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
					+ "[eModelToPg] = " + eModelToPg + ", " + "[eType] = " + eType + ", " + "[pg] = " + pg + ", "
					+ "[eModel] = " + eModel + ", " + "[eParameterizedType] = " + eParameterizedType + ".");
		}
		ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
				ruleresult, eParameterizedTypeToTAbstractType, tAbstractType, eTypeAccess, eType, eModel,
				eParameterizedType);
		//nothing EMoflonEdge eParameterizedTypeToTAbstractType__tAbstractType____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eModel__eParameterizedType____orphanTypes = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge eParameterizedTypeToTAbstractType__eParameterizedType____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge eParameterizedType__eTypeAccess____type = (EMoflonEdge) result3_green[12];

		// 
		// 
		ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, eTypeToTAbstractType, eParameterizedTypeToTAbstractType, tAbstractType, eTypeAccess,
				eModelToPg, eType, pg, eModel, eParameterizedType);
		return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[0];
		Type eType = (Type) result2_binding[1];
		Model eModel = (Model) result2_binding[2];
		ParameterizedType eParameterizedType = (ParameterizedType) result2_binding[3];
		for (Object[] result2_black : ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_2_2_corematch_blackFFBFBFBBB(eTypeAccess, eType, eModel,
						eParameterizedType, match)) {
			TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result2_black[0];
			TAbstractType tAbstractType = (TAbstractType) result2_black[1];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[3];
			TypeGraph pg = (TypeGraph) result2_black[5];
			// ForEach 
			for (Object[] result3_black : ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_2_3_findcontext_blackBBBBBBBB(eTypeToTAbstractType, tAbstractType,
							eTypeAccess, eModelToPg, eType, pg, eModel, eParameterizedType)) {
				Object[] result3_green = ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(eTypeToTAbstractType,
								tAbstractType, eTypeAccess, eModelToPg, eType, pg, eModel, eParameterizedType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eTypeToTAbstractType__tAbstractType____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eTypeToTAbstractType__eType____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge pg__tAbstractType____ownedTypes = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tAbstractType__pg____pg = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge eModelToPg__eModel____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge eModel__eParameterizedType____orphanTypes = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge eModelToPg__pg____target = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge eParameterizedType__eTypeAccess____type = (EMoflonEdge) result3_green[18];

				Object[] result4_bindingAndBlack = ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, eTypeToTAbstractType, tAbstractType, eTypeAccess, eModelToPg, eType,
								pg, eModel, eParameterizedType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eTypeToTAbstractType] = "
							+ eTypeToTAbstractType + ", " + "[tAbstractType] = " + tAbstractType + ", "
							+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eModelToPg] = " + eModelToPg + ", "
							+ "[eType] = " + eType + ", " + "[pg] = " + pg + ", " + "[eModel] = " + eModel + ", "
							+ "[eParameterizedType] = " + eParameterizedType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = ParameterizedTypeToClassImpl
							.pattern_ParameterizedTypeToClass_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, TypeAccess eTypeAccess, Type eType, Model eModel,
			ParameterizedType eParameterizedType) {
		match.registerObject("eTypeAccess", eTypeAccess);
		match.registerObject("eType", eType);
		match.registerObject("eModel", eModel);
		match.registerObject("eParameterizedType", eParameterizedType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, TypeAccess eTypeAccess, Type eType, Model eModel,
			ParameterizedType eParameterizedType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType eTypeToTAbstractType,
			TAbstractType tAbstractType, TypeAccess eTypeAccess, ModelToTypeGraph eModelToPg, Type eType, TypeGraph pg,
			Model eModel, ParameterizedType eParameterizedType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eTypeToTAbstractType", eTypeToTAbstractType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("eModel", eModel);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eTypeToTAbstractType,
			EObject eParameterizedTypeToTAbstractType, EObject tAbstractType, EObject eTypeAccess, EObject eModelToPg,
			EObject eType, EObject pg, EObject eModel, EObject eParameterizedType) {
		ruleresult.registerObject("eTypeToTAbstractType", eTypeToTAbstractType);
		ruleresult.registerObject("eParameterizedTypeToTAbstractType", eParameterizedTypeToTAbstractType);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("eModelToPg", eModelToPg);
		ruleresult.registerObject("eType", eType);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("eModel", eModel);
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
	public boolean isAppropriate_BWD(Match match, TAbstractType tAbstractType, TypeGraph pg) {

		Object[] result1_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_10_1_initialbindings_blackBBBB(this, match, tAbstractType, pg);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[pg] = " + pg + ".");
		}

		Object[] result2_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tAbstractType, pg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[pg] = " + pg + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_10_4_collectelementstobetranslated_blackBBB(match, tAbstractType,
							pg);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAbstractType] = " + tAbstractType + ", " + "[pg] = " + pg + ".");
			}

			Object[] result5_black = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_10_5_collectcontextelements_blackBBB(match, tAbstractType, pg);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAbstractType] = " + tAbstractType + ", " + "[pg] = " + pg + ".");
			}
			ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_10_5_collectcontextelements_greenBBBFF(match,
					tAbstractType, pg);
			//nothing EMoflonEdge pg__tAbstractType____ownedTypes = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge tAbstractType__pg____pg = (EMoflonEdge) result5_green[4];

			// 
			ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_10_6_registerobjectstomatch_expressionBBBB(
					this, match, tAbstractType, pg);
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_10_7_expressionF();
		} else {
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_10_8_expressionF();
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
	public void registerObjectsToMatch_BWD(Match match, TAbstractType tAbstractType, TypeGraph pg) {
		match.registerObject("tAbstractType", tAbstractType);
		match.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAbstractType tAbstractType, TypeGraph pg) {// Create CSP
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
	public EObjectContainer isAppropriate_BWD_TAbstractType_0(TAbstractType tAbstractType) {

		Object[] result1_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_17_2_testcorematchandDECs_blackBF(tAbstractType)) {
			TypeGraph pg = (TypeGraph) result2_black[1];
			Object[] result2_green = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tAbstractType, pg)) {
				// 
				if (ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ParameterizedTypeToClassImpl
							.pattern_ParameterizedTypeToClass_17_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_17_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_72(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_blackFFFFB(_edge_type)) {
			TypeAccess eTypeAccess = (TypeAccess) result2_black[0];
			Type eType = (Type) result2_black[1];
			Model eModel = (Model) result2_black[2];
			ParameterizedType eParameterizedType = (ParameterizedType) result2_black[3];
			Object[] result2_green = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, eTypeAccess, eType, eModel, eParameterizedType)) {
				// 
				if (ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ParameterizedTypeToClassImpl
							.pattern_ParameterizedTypeToClass_18_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_18_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ParameterizedTypeToClass");
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
		ruleResult.setRule("ParameterizedTypeToClass");
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

		Object[] result1_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TAbstractType tAbstractType = (TAbstractType) result2_bindingAndBlack[0];
		TypeAccess eTypeAccess = (TypeAccess) result2_bindingAndBlack[1];
		Type eType = (Type) result2_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[3];
		Model eModel = (Model) result2_bindingAndBlack[4];
		ParameterizedType eParameterizedType = (ParameterizedType) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tAbstractType,
						eTypeAccess, eType, pg, eModel, eParameterizedType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tAbstractType] = " + tAbstractType + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
					+ "[eType] = " + eType + ", " + "[pg] = " + pg + ", " + "[eModel] = " + eModel + ", "
					+ "[eParameterizedType] = " + eParameterizedType + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_21_5_matchcorrcontext_blackFBFBBBBB(tAbstractType, eType, pg,
							eModel, sourceMatch, targetMatch)) {
				TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result5_black[0];
				ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result5_black[2];
				Object[] result5_green = ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_21_5_matchcorrcontext_greenBBBBF(eTypeToTAbstractType,
								eModelToPg, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_21_6_createcorrespondence_blackBBBBBBB(tAbstractType,
								eTypeAccess, eType, pg, eModel, eParameterizedType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAbstractType] = "
							+ tAbstractType + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eType] = " + eType
							+ ", " + "[pg] = " + pg + ", " + "[eModel] = " + eModel + ", " + "[eParameterizedType] = "
							+ eParameterizedType + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_21_6_createcorrespondence_greenFBBB(
						tAbstractType, eParameterizedType, ccMatch);
				//nothing TypeToTAbstractType eParameterizedTypeToTAbstractType = (TypeToTAbstractType) result6_green[0];

				Object[] result7_black = ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_21_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TAbstractType tAbstractType, TypeAccess eTypeAccess, Type eType, TypeGraph pg,
			Model eModel, ParameterizedType eParameterizedType, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(TypeAccess eTypeAccess, Type eType, Model eModel,
			ParameterizedType eParameterizedType) {// 
		Object[] result1_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_24_1_matchtggpattern_blackBBBB(eTypeAccess, eType, eModel,
						eParameterizedType);
		if (result1_black != null) {
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_24_2_expressionF();
		} else {
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAbstractType tAbstractType, TypeGraph pg) {// 
		Object[] result1_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_25_1_matchtggpattern_blackBB(tAbstractType, pg);
		if (result1_black != null) {
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_25_2_expressionF();
		} else {
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType eTypeToTAbstractTypeParameter) {

		Object[] result1_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_26_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList eTypeToTAbstractTypeList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result2_black[1];
			TAbstractType tAbstractType = (TAbstractType) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[4];
			Model eModel = (Model) result2_black[5];
			Type eType = (Type) result2_black[6];

			Object[] result3_bindingAndBlack = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_26_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							eTypeToTAbstractType, tAbstractType, eModelToPg, eType, pg, eModel, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eTypeToTAbstractType] = "
						+ eTypeToTAbstractType + ", " + "[tAbstractType] = " + tAbstractType + ", " + "[eModelToPg] = "
						+ eModelToPg + ", " + "[eType] = " + eType + ", " + "[pg] = " + pg + ", " + "[eModel] = "
						+ eModel + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_26_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_26_5_checknacs_blackBBBBBB(eTypeToTAbstractType,
								tAbstractType, eModelToPg, eType, pg, eModel);
				if (result5_black != null) {

					Object[] result6_black = ParameterizedTypeToClassImpl
							.pattern_ParameterizedTypeToClass_26_6_perform_blackBBBBBBB(eTypeToTAbstractType,
									tAbstractType, eModelToPg, eType, pg, eModel, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[eTypeToTAbstractType] = " + eTypeToTAbstractType + ", " + "[tAbstractType] = "
								+ tAbstractType + ", " + "[eModelToPg] = " + eModelToPg + ", " + "[eType] = " + eType
								+ ", " + "[pg] = " + pg + ", " + "[eModel] = " + eModel + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_26_6_perform_greenFBFBBFB(
							tAbstractType, eType, eModel, ruleResult);
					//nothing TypeToTAbstractType eParameterizedTypeToTAbstractType = (TypeToTAbstractType) result6_green[0];
					//nothing TypeAccess eTypeAccess = (TypeAccess) result6_green[2];
					//nothing ParameterizedType eParameterizedType = (ParameterizedType) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType eTypeToTAbstractType,
			TAbstractType tAbstractType, ModelToTypeGraph eModelToPg, Type eType, TypeGraph pg, Model eModel,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eTypeToTAbstractType", eTypeToTAbstractType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("eModel", eModel);
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
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_FWD__MATCH_TYPEACCESS_TYPE_MODEL_PARAMETERIZEDTYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1), (Type) arguments.get(2),
					(Model) arguments.get(3), (ParameterizedType) arguments.get(4));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPEACCESS_TYPE_MODEL_PARAMETERIZEDTYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1), (Type) arguments.get(2),
					(Model) arguments.get(3), (ParameterizedType) arguments.get(4));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPEACCESS_TYPE_MODEL_PARAMETERIZEDTYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(Type) arguments.get(2), (Model) arguments.get(3), (ParameterizedType) arguments.get(4));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TYPEACCESS_MODELTOTYPEGRAPH_TYPE_TYPEGRAPH_MODEL_PARAMETERIZEDTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TAbstractType) arguments.get(2),
					(TypeAccess) arguments.get(3), (ModelToTypeGraph) arguments.get(4), (Type) arguments.get(5),
					(TypeGraph) arguments.get(6), (Model) arguments.get(7), (ParameterizedType) arguments.get(8));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_BWD__MATCH_TABSTRACTTYPE_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TypeGraph) arguments.get(2));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTTYPE_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TypeGraph) arguments.get(2));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTTYPE_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TypeGraph) arguments.get(2));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_BWD_TABSTRACT_TYPE_0__TABSTRACTTYPE:
			return isAppropriate_BWD_TAbstractType_0((TAbstractType) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_72__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_72((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__TABSTRACTTYPE_TYPEACCESS_TYPE_TYPEGRAPH_MODEL_PARAMETERIZEDTYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TAbstractType) arguments.get(0), (TypeAccess) arguments.get(1),
					(Type) arguments.get(2), (TypeGraph) arguments.get(3), (Model) arguments.get(4),
					(ParameterizedType) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___CHECK_DEC_FWD__TYPEACCESS_TYPE_MODEL_PARAMETERIZEDTYPE:
			return checkDEC_FWD((TypeAccess) arguments.get(0), (Type) arguments.get(1), (Model) arguments.get(2),
					(ParameterizedType) arguments.get(3));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___CHECK_DEC_BWD__TABSTRACTTYPE_TYPEGRAPH:
			return checkDEC_BWD((TAbstractType) arguments.get(0), (TypeGraph) arguments.get(1));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_MODELTOTYPEGRAPH_TYPE_TYPEGRAPH_MODEL_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TAbstractType) arguments.get(2),
					(ModelToTypeGraph) arguments.get(3), (Type) arguments.get(4), (TypeGraph) arguments.get(5),
					(Model) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_1_initialbindings_blackBBBBBB(
			ParameterizedTypeToClass _this, Match match, TypeAccess eTypeAccess, Type eType, Model eModel,
			ParameterizedType eParameterizedType) {
		if (!eParameterizedType.equals(eType)) {
			return new Object[] { _this, match, eTypeAccess, eType, eModel, eParameterizedType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_2_SolveCSP_bindingFBBBBBB(
			ParameterizedTypeToClass _this, Match match, TypeAccess eTypeAccess, Type eType, Model eModel,
			ParameterizedType eParameterizedType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eTypeAccess, eType, eModel, eParameterizedType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eTypeAccess, eType, eModel, eParameterizedType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			ParameterizedTypeToClass _this, Match match, TypeAccess eTypeAccess, Type eType, Model eModel,
			ParameterizedType eParameterizedType) {
		Object[] result_pattern_ParameterizedTypeToClass_0_2_SolveCSP_binding = pattern_ParameterizedTypeToClass_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, eTypeAccess, eType, eModel, eParameterizedType);
		if (result_pattern_ParameterizedTypeToClass_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToClass_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_0_2_SolveCSP_black = pattern_ParameterizedTypeToClass_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToClass_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eTypeAccess, eType, eModel, eParameterizedType };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_0_3_CheckCSP_expressionFBB(
			ParameterizedTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, TypeAccess eTypeAccess, Type eType, Model eModel, ParameterizedType eParameterizedType) {
		if (!eParameterizedType.equals(eType)) {
			return new Object[] { match, eTypeAccess, eType, eModel, eParameterizedType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, TypeAccess eTypeAccess, Type eType, Model eModel, ParameterizedType eParameterizedType) {
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModel__eParameterizedType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterizedType__eTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eTypeAccess);
		match.getToBeTranslatedNodes().add(eParameterizedType);
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eModel__eParameterizedType____orphanTypes_name_prime = "orphanTypes";
		String eParameterizedType__eTypeAccess____type_name_prime = "type";
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		match.getToBeTranslatedEdges().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eType__eTypeAccess____usagesInTypeAccess);
		eModel__eParameterizedType____orphanTypes.setSrc(eModel);
		eModel__eParameterizedType____orphanTypes.setTrg(eParameterizedType);
		match.getToBeTranslatedEdges().add(eModel__eParameterizedType____orphanTypes);
		eParameterizedType__eTypeAccess____type.setSrc(eParameterizedType);
		eParameterizedType__eTypeAccess____type.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eParameterizedType__eTypeAccess____type);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		eModel__eParameterizedType____orphanTypes.setName(eModel__eParameterizedType____orphanTypes_name_prime);
		eParameterizedType__eTypeAccess____type.setName(eParameterizedType__eTypeAccess____type_name_prime);
		return new Object[] { match, eTypeAccess, eType, eModel, eParameterizedType, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess, eModel__eParameterizedType____orphanTypes,
				eParameterizedType__eTypeAccess____type };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_5_collectcontextelements_blackBBBBB(Match match,
			TypeAccess eTypeAccess, Type eType, Model eModel, ParameterizedType eParameterizedType) {
		if (!eParameterizedType.equals(eType)) {
			return new Object[] { match, eTypeAccess, eType, eModel, eParameterizedType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_5_collectcontextelements_greenBBB(Match match,
			Type eType, Model eModel) {
		match.getContextNodes().add(eType);
		match.getContextNodes().add(eModel);
		return new Object[] { match, eType, eModel };
	}

	public static final void pattern_ParameterizedTypeToClass_0_6_registerobjectstomatch_expressionBBBBBB(
			ParameterizedTypeToClass _this, Match match, TypeAccess eTypeAccess, Type eType, Model eModel,
			ParameterizedType eParameterizedType) {
		_this.registerObjectsToMatch_FWD(match, eTypeAccess, eType, eModel, eParameterizedType);

	}

	public static final boolean pattern_ParameterizedTypeToClass_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToClass_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eTypeToTAbstractType");
		EObject _localVariable_1 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_2 = isApplicableMatch.getObject("eTypeAccess");
		EObject _localVariable_3 = isApplicableMatch.getObject("eModelToPg");
		EObject _localVariable_4 = isApplicableMatch.getObject("eType");
		EObject _localVariable_5 = isApplicableMatch.getObject("pg");
		EObject _localVariable_6 = isApplicableMatch.getObject("eModel");
		EObject _localVariable_7 = isApplicableMatch.getObject("eParameterizedType");
		EObject tmpETypeToTAbstractType = _localVariable_0;
		EObject tmpTAbstractType = _localVariable_1;
		EObject tmpETypeAccess = _localVariable_2;
		EObject tmpEModelToPg = _localVariable_3;
		EObject tmpEType = _localVariable_4;
		EObject tmpPg = _localVariable_5;
		EObject tmpEModel = _localVariable_6;
		EObject tmpEParameterizedType = _localVariable_7;
		if (tmpETypeToTAbstractType instanceof TypeToTAbstractType) {
			TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) tmpETypeToTAbstractType;
			if (tmpTAbstractType instanceof TAbstractType) {
				TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
				if (tmpETypeAccess instanceof TypeAccess) {
					TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
					if (tmpEModelToPg instanceof ModelToTypeGraph) {
						ModelToTypeGraph eModelToPg = (ModelToTypeGraph) tmpEModelToPg;
						if (tmpEType instanceof Type) {
							Type eType = (Type) tmpEType;
							if (tmpPg instanceof TypeGraph) {
								TypeGraph pg = (TypeGraph) tmpPg;
								if (tmpEModel instanceof Model) {
									Model eModel = (Model) tmpEModel;
									if (tmpEParameterizedType instanceof ParameterizedType) {
										ParameterizedType eParameterizedType = (ParameterizedType) tmpEParameterizedType;
										return new Object[] { eTypeToTAbstractType, tAbstractType, eTypeAccess,
												eModelToPg, eType, pg, eModel, eParameterizedType, isApplicableMatch };
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

	public static final Object[] pattern_ParameterizedTypeToClass_1_1_performtransformation_blackBBBBBBBBFBB(
			TypeToTAbstractType eTypeToTAbstractType, TAbstractType tAbstractType, TypeAccess eTypeAccess,
			ModelToTypeGraph eModelToPg, Type eType, TypeGraph pg, Model eModel, ParameterizedType eParameterizedType,
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch) {
		if (!eParameterizedType.equals(eType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { eTypeToTAbstractType, tAbstractType, eTypeAccess, eModelToPg, eType, pg,
							eModel, eParameterizedType, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding = pattern_ParameterizedTypeToClass_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding != null) {
			TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[0];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[1];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[2];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[3];
			Type eType = (Type) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[4];
			TypeGraph pg = (TypeGraph) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[5];
			Model eModel = (Model) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[6];
			ParameterizedType eParameterizedType = (ParameterizedType) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[7];

			Object[] result_pattern_ParameterizedTypeToClass_1_1_performtransformation_black = pattern_ParameterizedTypeToClass_1_1_performtransformation_blackBBBBBBBBFBB(
					eTypeToTAbstractType, tAbstractType, eTypeAccess, eModelToPg, eType, pg, eModel, eParameterizedType,
					_this, isApplicableMatch);
			if (result_pattern_ParameterizedTypeToClass_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_black[8];

				return new Object[] { eTypeToTAbstractType, tAbstractType, eTypeAccess, eModelToPg, eType, pg, eModel,
						eParameterizedType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_1_performtransformation_greenFBB(
			TAbstractType tAbstractType, ParameterizedType eParameterizedType) {
		TypeToTAbstractType eParameterizedTypeToTAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		eParameterizedTypeToTAbstractType.setTarget(tAbstractType);
		eParameterizedTypeToTAbstractType.setSource(eParameterizedType);
		return new Object[] { eParameterizedTypeToTAbstractType, tAbstractType, eParameterizedType };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_2_collecttranslatedelements_blackBBB(
			TypeToTAbstractType eParameterizedTypeToTAbstractType, TypeAccess eTypeAccess,
			ParameterizedType eParameterizedType) {
		return new Object[] { eParameterizedTypeToTAbstractType, eTypeAccess, eParameterizedType };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_2_collecttranslatedelements_greenFBBB(
			TypeToTAbstractType eParameterizedTypeToTAbstractType, TypeAccess eTypeAccess,
			ParameterizedType eParameterizedType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(eParameterizedTypeToTAbstractType);
		ruleresult.getTranslatedElements().add(eTypeAccess);
		ruleresult.getTranslatedElements().add(eParameterizedType);
		return new Object[] { ruleresult, eParameterizedTypeToTAbstractType, eTypeAccess, eParameterizedType };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eTypeToTAbstractType, EObject eParameterizedTypeToTAbstractType,
			EObject tAbstractType, EObject eTypeAccess, EObject eModelToPg, EObject eType, EObject pg, EObject eModel,
			EObject eParameterizedType) {
		if (!eTypeToTAbstractType.equals(tAbstractType)) {
			if (!eTypeToTAbstractType.equals(pg)) {
				if (!eParameterizedTypeToTAbstractType.equals(eTypeToTAbstractType)) {
					if (!eParameterizedTypeToTAbstractType.equals(tAbstractType)) {
						if (!eParameterizedTypeToTAbstractType.equals(eTypeAccess)) {
							if (!eParameterizedTypeToTAbstractType.equals(eType)) {
								if (!eParameterizedTypeToTAbstractType.equals(pg)) {
									if (!eTypeAccess.equals(eTypeToTAbstractType)) {
										if (!eTypeAccess.equals(tAbstractType)) {
											if (!eTypeAccess.equals(pg)) {
												if (!eModelToPg.equals(eTypeToTAbstractType)) {
													if (!eModelToPg.equals(eParameterizedTypeToTAbstractType)) {
														if (!eModelToPg.equals(tAbstractType)) {
															if (!eModelToPg.equals(eTypeAccess)) {
																if (!eModelToPg.equals(eType)) {
																	if (!eModelToPg.equals(pg)) {
																		if (!eModelToPg.equals(eParameterizedType)) {
																			if (!eType.equals(eTypeToTAbstractType)) {
																				if (!eType.equals(tAbstractType)) {
																					if (!eType.equals(eTypeAccess)) {
																						if (!eType.equals(pg)) {
																							if (!pg.equals(
																									tAbstractType)) {
																								if (!eModel.equals(
																										eTypeToTAbstractType)) {
																									if (!eModel.equals(
																											eParameterizedTypeToTAbstractType)) {
																										if (!eModel
																												.equals(tAbstractType)) {
																											if (!eModel
																													.equals(eTypeAccess)) {
																												if (!eModel
																														.equals(eModelToPg)) {
																													if (!eModel
																															.equals(eType)) {
																														if (!eModel
																																.equals(pg)) {
																															if (!eModel
																																	.equals(eParameterizedType)) {
																																if (!eParameterizedType
																																		.equals(eTypeToTAbstractType)) {
																																	if (!eParameterizedType
																																			.equals(eParameterizedTypeToTAbstractType)) {
																																		if (!eParameterizedType
																																				.equals(tAbstractType)) {
																																			if (!eParameterizedType
																																					.equals(eTypeAccess)) {
																																				if (!eParameterizedType
																																						.equals(eType)) {
																																					if (!eParameterizedType
																																							.equals(pg)) {
																																						return new Object[] {
																																								ruleresult,
																																								eTypeToTAbstractType,
																																								eParameterizedTypeToTAbstractType,
																																								tAbstractType,
																																								eTypeAccess,
																																								eModelToPg,
																																								eType,
																																								pg,
																																								eModel,
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
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterizedTypeToClass_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject eParameterizedTypeToTAbstractType, EObject tAbstractType,
			EObject eTypeAccess, EObject eType, EObject eModel, EObject eParameterizedType) {
		EMoflonEdge eParameterizedTypeToTAbstractType__tAbstractType____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModel__eParameterizedType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterizedTypeToTAbstractType__eParameterizedType____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eParameterizedType__eTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterizedTypeToClass";
		String eParameterizedTypeToTAbstractType__tAbstractType____target_name_prime = "target";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eModel__eParameterizedType____orphanTypes_name_prime = "orphanTypes";
		String eParameterizedTypeToTAbstractType__eParameterizedType____source_name_prime = "source";
		String eParameterizedType__eTypeAccess____type_name_prime = "type";
		eParameterizedTypeToTAbstractType__tAbstractType____target.setSrc(eParameterizedTypeToTAbstractType);
		eParameterizedTypeToTAbstractType__tAbstractType____target.setTrg(tAbstractType);
		ruleresult.getCreatedEdges().add(eParameterizedTypeToTAbstractType__tAbstractType____target);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		ruleresult.getTranslatedEdges().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eType__eTypeAccess____usagesInTypeAccess);
		eModel__eParameterizedType____orphanTypes.setSrc(eModel);
		eModel__eParameterizedType____orphanTypes.setTrg(eParameterizedType);
		ruleresult.getTranslatedEdges().add(eModel__eParameterizedType____orphanTypes);
		eParameterizedTypeToTAbstractType__eParameterizedType____source.setSrc(eParameterizedTypeToTAbstractType);
		eParameterizedTypeToTAbstractType__eParameterizedType____source.setTrg(eParameterizedType);
		ruleresult.getCreatedEdges().add(eParameterizedTypeToTAbstractType__eParameterizedType____source);
		eParameterizedType__eTypeAccess____type.setSrc(eParameterizedType);
		eParameterizedType__eTypeAccess____type.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eParameterizedType__eTypeAccess____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eParameterizedTypeToTAbstractType__tAbstractType____target
				.setName(eParameterizedTypeToTAbstractType__tAbstractType____target_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		eModel__eParameterizedType____orphanTypes.setName(eModel__eParameterizedType____orphanTypes_name_prime);
		eParameterizedTypeToTAbstractType__eParameterizedType____source
				.setName(eParameterizedTypeToTAbstractType__eParameterizedType____source_name_prime);
		eParameterizedType__eTypeAccess____type.setName(eParameterizedType__eTypeAccess____type_name_prime);
		return new Object[] { ruleresult, eParameterizedTypeToTAbstractType, tAbstractType, eTypeAccess, eType, eModel,
				eParameterizedType, eParameterizedTypeToTAbstractType__tAbstractType____target,
				eTypeAccess__eType____type, eType__eTypeAccess____usagesInTypeAccess,
				eModel__eParameterizedType____orphanTypes,
				eParameterizedTypeToTAbstractType__eParameterizedType____source,
				eParameterizedType__eTypeAccess____type };
	}

	public static final void pattern_ParameterizedTypeToClass_1_5_registerobjects_expressionBBBBBBBBBBB(
			ParameterizedTypeToClass _this, PerformRuleResult ruleresult, EObject eTypeToTAbstractType,
			EObject eParameterizedTypeToTAbstractType, EObject tAbstractType, EObject eTypeAccess, EObject eModelToPg,
			EObject eType, EObject pg, EObject eModel, EObject eParameterizedType) {
		_this.registerObjects_FWD(ruleresult, eTypeToTAbstractType, eParameterizedTypeToTAbstractType, tAbstractType,
				eTypeAccess, eModelToPg, eType, pg, eModel, eParameterizedType);

	}

	public static final PerformRuleResult pattern_ParameterizedTypeToClass_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_bindingFB(
			ParameterizedTypeToClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ParameterizedTypeToClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_bindingAndBlackFFB(
			ParameterizedTypeToClass _this) {
		Object[] result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_binding = pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_black = pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ParameterizedTypeToClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eTypeAccess");
		EObject _localVariable_1 = match.getObject("eType");
		EObject _localVariable_2 = match.getObject("eModel");
		EObject _localVariable_3 = match.getObject("eParameterizedType");
		EObject tmpETypeAccess = _localVariable_0;
		EObject tmpEType = _localVariable_1;
		EObject tmpEModel = _localVariable_2;
		EObject tmpEParameterizedType = _localVariable_3;
		if (tmpETypeAccess instanceof TypeAccess) {
			TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
			if (tmpEType instanceof Type) {
				Type eType = (Type) tmpEType;
				if (tmpEModel instanceof Model) {
					Model eModel = (Model) tmpEModel;
					if (tmpEParameterizedType instanceof ParameterizedType) {
						ParameterizedType eParameterizedType = (ParameterizedType) tmpEParameterizedType;
						return new Object[] { eTypeAccess, eType, eModel, eParameterizedType, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToClass_2_2_corematch_blackFFBFBFBBB(
			TypeAccess eTypeAccess, Type eType, Model eModel, ParameterizedType eParameterizedType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eParameterizedType.equals(eType)) {
			for (TypeToTAbstractType eTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eType, TypeToTAbstractType.class, "source")) {
				TAbstractType tAbstractType = eTypeToTAbstractType.getTarget();
				if (tAbstractType != null) {
					for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(eModel, ModelToTypeGraph.class, "source")) {
						TypeGraph pg = eModelToPg.getTarget();
						if (pg != null) {
							_result.add(new Object[] { eTypeToTAbstractType, tAbstractType, eTypeAccess, eModelToPg,
									eType, pg, eModel, eParameterizedType, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToClass_2_3_findcontext_blackBBBBBBBB(
			TypeToTAbstractType eTypeToTAbstractType, TAbstractType tAbstractType, TypeAccess eTypeAccess,
			ModelToTypeGraph eModelToPg, Type eType, TypeGraph pg, Model eModel, ParameterizedType eParameterizedType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eParameterizedType.equals(eType)) {
			if (eType.equals(eTypeAccess.getType())) {
				if (tAbstractType.equals(eTypeToTAbstractType.getTarget())) {
					if (eType.equals(eTypeToTAbstractType.getSource())) {
						if (pg.getOwnedTypes().contains(tAbstractType)) {
							if (eModel.equals(eModelToPg.getSource())) {
								if (eModel.getOrphanTypes().contains(eParameterizedType)) {
									if (pg.equals(eModelToPg.getTarget())) {
										if (eTypeAccess.equals(eParameterizedType.getType())) {
											_result.add(new Object[] { eTypeToTAbstractType, tAbstractType, eTypeAccess,
													eModelToPg, eType, pg, eModel, eParameterizedType });
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

	public static final Object[] pattern_ParameterizedTypeToClass_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(
			TypeToTAbstractType eTypeToTAbstractType, TAbstractType tAbstractType, TypeAccess eTypeAccess,
			ModelToTypeGraph eModelToPg, Type eType, TypeGraph pg, Model eModel, ParameterizedType eParameterizedType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeToTAbstractType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeToTAbstractType__eType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAbstractType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAbstractType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModel__eParameterizedType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterizedType__eTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eTypeToTAbstractType__tAbstractType____target_name_prime = "target";
		String eTypeToTAbstractType__eType____source_name_prime = "source";
		String pg__tAbstractType____ownedTypes_name_prime = "ownedTypes";
		String tAbstractType__pg____pg_name_prime = "pg";
		String eModelToPg__eModel____source_name_prime = "source";
		String eModel__eParameterizedType____orphanTypes_name_prime = "orphanTypes";
		String eModelToPg__pg____target_name_prime = "target";
		String eParameterizedType__eTypeAccess____type_name_prime = "type";
		isApplicableMatch.getAllContextElements().add(eTypeToTAbstractType);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eModelToPg);
		isApplicableMatch.getAllContextElements().add(eType);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(eModel);
		isApplicableMatch.getAllContextElements().add(eParameterizedType);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		isApplicableMatch.getAllContextElements().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eType__eTypeAccess____usagesInTypeAccess);
		eTypeToTAbstractType__tAbstractType____target.setSrc(eTypeToTAbstractType);
		eTypeToTAbstractType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(eTypeToTAbstractType__tAbstractType____target);
		eTypeToTAbstractType__eType____source.setSrc(eTypeToTAbstractType);
		eTypeToTAbstractType__eType____source.setTrg(eType);
		isApplicableMatch.getAllContextElements().add(eTypeToTAbstractType__eType____source);
		pg__tAbstractType____ownedTypes.setSrc(pg);
		pg__tAbstractType____ownedTypes.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(pg__tAbstractType____ownedTypes);
		tAbstractType__pg____pg.setSrc(tAbstractType);
		tAbstractType__pg____pg.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tAbstractType__pg____pg);
		eModelToPg__eModel____source.setSrc(eModelToPg);
		eModelToPg__eModel____source.setTrg(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToPg__eModel____source);
		eModel__eParameterizedType____orphanTypes.setSrc(eModel);
		eModel__eParameterizedType____orphanTypes.setTrg(eParameterizedType);
		isApplicableMatch.getAllContextElements().add(eModel__eParameterizedType____orphanTypes);
		eModelToPg__pg____target.setSrc(eModelToPg);
		eModelToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(eModelToPg__pg____target);
		eParameterizedType__eTypeAccess____type.setSrc(eParameterizedType);
		eParameterizedType__eTypeAccess____type.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eParameterizedType__eTypeAccess____type);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		eTypeToTAbstractType__tAbstractType____target.setName(eTypeToTAbstractType__tAbstractType____target_name_prime);
		eTypeToTAbstractType__eType____source.setName(eTypeToTAbstractType__eType____source_name_prime);
		pg__tAbstractType____ownedTypes.setName(pg__tAbstractType____ownedTypes_name_prime);
		tAbstractType__pg____pg.setName(tAbstractType__pg____pg_name_prime);
		eModelToPg__eModel____source.setName(eModelToPg__eModel____source_name_prime);
		eModel__eParameterizedType____orphanTypes.setName(eModel__eParameterizedType____orphanTypes_name_prime);
		eModelToPg__pg____target.setName(eModelToPg__pg____target_name_prime);
		eParameterizedType__eTypeAccess____type.setName(eParameterizedType__eTypeAccess____type_name_prime);
		return new Object[] { eTypeToTAbstractType, tAbstractType, eTypeAccess, eModelToPg, eType, pg, eModel,
				eParameterizedType, isApplicableMatch, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess, eTypeToTAbstractType__tAbstractType____target,
				eTypeToTAbstractType__eType____source, pg__tAbstractType____ownedTypes, tAbstractType__pg____pg,
				eModelToPg__eModel____source, eModel__eParameterizedType____orphanTypes, eModelToPg__pg____target,
				eParameterizedType__eTypeAccess____type };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_4_solveCSP_bindingFBBBBBBBBBB(
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eTypeToTAbstractType, TAbstractType tAbstractType, TypeAccess eTypeAccess,
			ModelToTypeGraph eModelToPg, Type eType, TypeGraph pg, Model eModel, ParameterizedType eParameterizedType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eTypeToTAbstractType, tAbstractType,
				eTypeAccess, eModelToPg, eType, pg, eModel, eParameterizedType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eTypeToTAbstractType, tAbstractType, eTypeAccess,
					eModelToPg, eType, pg, eModel, eParameterizedType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eTypeToTAbstractType, TAbstractType tAbstractType, TypeAccess eTypeAccess,
			ModelToTypeGraph eModelToPg, Type eType, TypeGraph pg, Model eModel, ParameterizedType eParameterizedType) {
		Object[] result_pattern_ParameterizedTypeToClass_2_4_solveCSP_binding = pattern_ParameterizedTypeToClass_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, eTypeToTAbstractType, tAbstractType, eTypeAccess, eModelToPg, eType, pg,
				eModel, eParameterizedType);
		if (result_pattern_ParameterizedTypeToClass_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToClass_2_4_solveCSP_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_2_4_solveCSP_black = pattern_ParameterizedTypeToClass_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToClass_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eTypeToTAbstractType, tAbstractType, eTypeAccess,
						eModelToPg, eType, pg, eModel, eParameterizedType };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_2_5_checkCSP_expressionFBB(
			ParameterizedTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterizedTypeToClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterizedTypeToClass_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_1_initialbindings_blackBBBB(
			ParameterizedTypeToClass _this, Match match, TAbstractType tAbstractType, TypeGraph pg) {
		return new Object[] { _this, match, tAbstractType, pg };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_2_SolveCSP_bindingFBBBB(
			ParameterizedTypeToClass _this, Match match, TAbstractType tAbstractType, TypeGraph pg) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAbstractType, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAbstractType, pg };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_2_SolveCSP_bindingAndBlackFBBBB(
			ParameterizedTypeToClass _this, Match match, TAbstractType tAbstractType, TypeGraph pg) {
		Object[] result_pattern_ParameterizedTypeToClass_10_2_SolveCSP_binding = pattern_ParameterizedTypeToClass_10_2_SolveCSP_bindingFBBBB(
				_this, match, tAbstractType, pg);
		if (result_pattern_ParameterizedTypeToClass_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToClass_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_10_2_SolveCSP_black = pattern_ParameterizedTypeToClass_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToClass_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAbstractType, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_10_3_CheckCSP_expressionFBB(
			ParameterizedTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_4_collectelementstobetranslated_blackBBB(
			Match match, TAbstractType tAbstractType, TypeGraph pg) {
		return new Object[] { match, tAbstractType, pg };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_5_collectcontextelements_blackBBB(Match match,
			TAbstractType tAbstractType, TypeGraph pg) {
		return new Object[] { match, tAbstractType, pg };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_5_collectcontextelements_greenBBBFF(Match match,
			TAbstractType tAbstractType, TypeGraph pg) {
		EMoflonEdge pg__tAbstractType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAbstractType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tAbstractType);
		match.getContextNodes().add(pg);
		String pg__tAbstractType____ownedTypes_name_prime = "ownedTypes";
		String tAbstractType__pg____pg_name_prime = "pg";
		pg__tAbstractType____ownedTypes.setSrc(pg);
		pg__tAbstractType____ownedTypes.setTrg(tAbstractType);
		match.getContextEdges().add(pg__tAbstractType____ownedTypes);
		tAbstractType__pg____pg.setSrc(tAbstractType);
		tAbstractType__pg____pg.setTrg(pg);
		match.getContextEdges().add(tAbstractType__pg____pg);
		pg__tAbstractType____ownedTypes.setName(pg__tAbstractType____ownedTypes_name_prime);
		tAbstractType__pg____pg.setName(tAbstractType__pg____pg_name_prime);
		return new Object[] { match, tAbstractType, pg, pg__tAbstractType____ownedTypes, tAbstractType__pg____pg };
	}

	public static final void pattern_ParameterizedTypeToClass_10_6_registerobjectstomatch_expressionBBBB(
			ParameterizedTypeToClass _this, Match match, TAbstractType tAbstractType, TypeGraph pg) {
		_this.registerObjectsToMatch_BWD(match, tAbstractType, pg);

	}

	public static final boolean pattern_ParameterizedTypeToClass_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToClass_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_bindingFB(
			ParameterizedTypeToClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ParameterizedTypeToClass _this) {
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

	public static final Object[] pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_bindingAndBlackFFBF(
			ParameterizedTypeToClass _this) {
		Object[] result_pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_binding = pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_black = pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToClass_17_2_testcorematchandDECs_blackBF(
			TAbstractType tAbstractType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		TypeGraph pg = tAbstractType.getPg();
		if (pg != null) {
			_result.add(new Object[] { tAbstractType, pg });
		}

		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterizedTypeToClass_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ParameterizedTypeToClass _this, Match match, TAbstractType tAbstractType, TypeGraph pg) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAbstractType, pg);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToClass_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ParameterizedTypeToClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ParameterizedTypeToClass_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_bindingFB(
			ParameterizedTypeToClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ParameterizedTypeToClass _this) {
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

	public static final Object[] pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_bindingAndBlackFFBF(
			ParameterizedTypeToClass _this) {
		Object[] result_pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_binding = pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_black = pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_0BB(
			TypeAccess eTypeAccess, Type eType) {
		for (AbstractTypeDeclaration __DEC_eTypeAccess_superInterfaces_33143 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!eType.equals(__DEC_eTypeAccess_superInterfaces_33143)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_1B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_960891 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_2BB(
			TypeAccess eTypeAccess, Type eType) {
		for (ArrayType __DEC_eTypeAccess_elementType_585341 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			if (!eType.equals(__DEC_eTypeAccess_elementType_585341)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_3B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_523268 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_4BB(
			TypeAccess eTypeAccess, Type eType) {
		for (ClassDeclaration __DEC_eTypeAccess_superClass_68034 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!eType.equals(__DEC_eTypeAccess_superClass_68034)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_5B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_706852 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_6B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_185145 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_110184 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpETypeAccess = _edge_type.getSrc();
		if (tmpETypeAccess instanceof TypeAccess) {
			TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
			EObject tmpEType = _edge_type.getTrg();
			if (tmpEType instanceof Type) {
				Type eType = (Type) tmpEType;
				if (eType.equals(eTypeAccess.getType())) {
					if (pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_1B(eTypeAccess) == null) {
						if (pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_3B(
								eTypeAccess) == null) {
							if (pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_5B(
									eTypeAccess) == null) {
								if (pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_6B(
										eTypeAccess) == null) {
									if (pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_7B(
											eTypeAccess) == null) {
										if (pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_0BB(
												eTypeAccess, eType) == null) {
											if (pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_2BB(
													eTypeAccess, eType) == null) {
												if (pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_4BB(
														eTypeAccess, eType) == null) {
													for (ParameterizedType eParameterizedType : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(eTypeAccess,
																	ParameterizedType.class, "type")) {
														if (!eParameterizedType.equals(eType)) {
															for (Model eModel : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(eParameterizedType,
																			Model.class, "orphanTypes")) {
																_result.add(new Object[] { eTypeAccess, eType, eModel,
																		eParameterizedType, _edge_type });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterizedTypeToClass_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			ParameterizedTypeToClass _this, Match match, TypeAccess eTypeAccess, Type eType, Model eModel,
			ParameterizedType eParameterizedType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eTypeAccess, eType, eModel, eParameterizedType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToClass_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ParameterizedTypeToClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ParameterizedTypeToClass_18_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_1_prepare_blackB(ParameterizedTypeToClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tAbstractType");
		EObject _localVariable_1 = sourceMatch.getObject("eTypeAccess");
		EObject _localVariable_2 = sourceMatch.getObject("eType");
		EObject _localVariable_3 = targetMatch.getObject("pg");
		EObject _localVariable_4 = sourceMatch.getObject("eModel");
		EObject _localVariable_5 = sourceMatch.getObject("eParameterizedType");
		EObject tmpTAbstractType = _localVariable_0;
		EObject tmpETypeAccess = _localVariable_1;
		EObject tmpEType = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpEModel = _localVariable_4;
		EObject tmpEParameterizedType = _localVariable_5;
		if (tmpTAbstractType instanceof TAbstractType) {
			TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
			if (tmpETypeAccess instanceof TypeAccess) {
				TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
				if (tmpEType instanceof Type) {
					Type eType = (Type) tmpEType;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpEModel instanceof Model) {
							Model eModel = (Model) tmpEModel;
							if (tmpEParameterizedType instanceof ParameterizedType) {
								ParameterizedType eParameterizedType = (ParameterizedType) tmpEParameterizedType;
								return new Object[] { tAbstractType, eTypeAccess, eType, pg, eModel, eParameterizedType,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_blackBBBBBBBB(
			TAbstractType tAbstractType, TypeAccess eTypeAccess, Type eType, TypeGraph pg, Model eModel,
			ParameterizedType eParameterizedType, Match sourceMatch, Match targetMatch) {
		if (!eParameterizedType.equals(eType)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { tAbstractType, eTypeAccess, eType, pg, eModel, eParameterizedType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_binding = pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_binding != null) {
			TAbstractType tAbstractType = (TAbstractType) result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_binding[0];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_binding[1];
			Type eType = (Type) result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_binding[3];
			Model eModel = (Model) result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_binding[4];
			ParameterizedType eParameterizedType = (ParameterizedType) result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_black = pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_blackBBBBBBBB(
					tAbstractType, eTypeAccess, eType, pg, eModel, eParameterizedType, sourceMatch, targetMatch);
			if (result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { tAbstractType, eTypeAccess, eType, pg, eModel, eParameterizedType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_3_solvecsp_bindingFBBBBBBBBB(
			ParameterizedTypeToClass _this, TAbstractType tAbstractType, TypeAccess eTypeAccess, Type eType,
			TypeGraph pg, Model eModel, ParameterizedType eParameterizedType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tAbstractType, eTypeAccess, eType, pg, eModel,
				eParameterizedType, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tAbstractType, eTypeAccess, eType, pg, eModel, eParameterizedType,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			ParameterizedTypeToClass _this, TAbstractType tAbstractType, TypeAccess eTypeAccess, Type eType,
			TypeGraph pg, Model eModel, ParameterizedType eParameterizedType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ParameterizedTypeToClass_21_3_solvecsp_binding = pattern_ParameterizedTypeToClass_21_3_solvecsp_bindingFBBBBBBBBB(
				_this, tAbstractType, eTypeAccess, eType, pg, eModel, eParameterizedType, sourceMatch, targetMatch);
		if (result_pattern_ParameterizedTypeToClass_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToClass_21_3_solvecsp_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_21_3_solvecsp_black = pattern_ParameterizedTypeToClass_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToClass_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tAbstractType, eTypeAccess, eType, pg, eModel, eParameterizedType,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToClass_21_5_matchcorrcontext_blackFBFBBBBB(
			TAbstractType tAbstractType, Type eType, TypeGraph pg, Model eModel, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType eTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tAbstractType, TypeToTAbstractType.class, "target")) {
				if (eType.equals(eTypeToTAbstractType.getSource())) {
					for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(eModel, ModelToTypeGraph.class, "source")) {
						if (pg.equals(eModelToPg.getTarget())) {
							_result.add(new Object[] { eTypeToTAbstractType, tAbstractType, eModelToPg, eType, pg,
									eModel, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType eTypeToTAbstractType, ModelToTypeGraph eModelToPg, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ParameterizedTypeToClass";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eTypeToTAbstractType);
		ccMatch.getAllContextElements().add(eModelToPg);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eTypeToTAbstractType, eModelToPg, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_6_createcorrespondence_blackBBBBBBB(
			TAbstractType tAbstractType, TypeAccess eTypeAccess, Type eType, TypeGraph pg, Model eModel,
			ParameterizedType eParameterizedType, CCMatch ccMatch) {
		if (!eParameterizedType.equals(eType)) {
			return new Object[] { tAbstractType, eTypeAccess, eType, pg, eModel, eParameterizedType, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_6_createcorrespondence_greenFBBB(
			TAbstractType tAbstractType, ParameterizedType eParameterizedType, CCMatch ccMatch) {
		TypeToTAbstractType eParameterizedTypeToTAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		eParameterizedTypeToTAbstractType.setTarget(tAbstractType);
		eParameterizedTypeToTAbstractType.setSource(eParameterizedType);
		ccMatch.getCreateCorr().add(eParameterizedTypeToTAbstractType);
		return new Object[] { eParameterizedTypeToTAbstractType, tAbstractType, eParameterizedType, ccMatch };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ParameterizedTypeToClass";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterizedTypeToClass_21_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_0BB(
			TypeAccess eTypeAccess, Type eType) {
		for (AbstractTypeDeclaration __DEC_eTypeAccess_superInterfaces_598336 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!eType.equals(__DEC_eTypeAccess_superInterfaces_598336)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_1B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_114260 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_2BB(
			TypeAccess eTypeAccess, Type eType) {
		for (ArrayType __DEC_eTypeAccess_elementType_409797 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			if (!eType.equals(__DEC_eTypeAccess_elementType_409797)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_3B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_676065 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_4BB(
			TypeAccess eTypeAccess, Type eType) {
		for (ClassDeclaration __DEC_eTypeAccess_superClass_250442 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!eType.equals(__DEC_eTypeAccess_superClass_250442)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_5B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_613680 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_6B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_792191 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_315450 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_blackBBBB(TypeAccess eTypeAccess,
			Type eType, Model eModel, ParameterizedType eParameterizedType) {
		if (!eParameterizedType.equals(eType)) {
			if (eType.equals(eTypeAccess.getType())) {
				if (eModel.getOrphanTypes().contains(eParameterizedType)) {
					if (eTypeAccess.equals(eParameterizedType.getType())) {
						if (pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_0BB(eTypeAccess,
								eType) == null) {
							if (pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_1B(
									eTypeAccess) == null) {
								if (pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_2BB(eTypeAccess,
										eType) == null) {
									if (pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_3B(
											eTypeAccess) == null) {
										if (pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_4BB(
												eTypeAccess, eType) == null) {
											if (pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_5B(
													eTypeAccess) == null) {
												if (pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_6B(
														eTypeAccess) == null) {
													if (pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_7B(
															eTypeAccess) == null) {
														return new Object[] { eTypeAccess, eType, eModel,
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
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToClass_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_25_1_matchtggpattern_blackBB(
			TAbstractType tAbstractType, TypeGraph pg) {
		if (pg.getOwnedTypes().contains(tAbstractType)) {
			return new Object[] { tAbstractType, pg };
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToClass_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_1_createresult_blackB(
			ParameterizedTypeToClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eTypeToTAbstractType) {
		if (ruleResult.getCorrObjects().contains(eTypeToTAbstractType)) {
			return new Object[] { ruleResult, eTypeToTAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tAbstractType) {
		if (ruleResult.getTargetObjects().contains(tAbstractType)) {
			return new Object[] { ruleResult, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph eModelToPg) {
		if (ruleResult.getCorrObjects().contains(eModelToPg)) {
			return new Object[] { ruleResult, eModelToPg };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Model eModel) {
		if (ruleResult.getSourceObjects().contains(eModel)) {
			return new Object[] { ruleResult, eModel };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Type eType) {
		if (ruleResult.getSourceObjects().contains(eType)) {
			return new Object[] { ruleResult, eType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToClass_26_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eTypeToTAbstractTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpETypeToTAbstractType : eTypeToTAbstractTypeList.getEntryObjects()) {
				if (tmpETypeToTAbstractType instanceof TypeToTAbstractType) {
					TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) tmpETypeToTAbstractType;
					TAbstractType tAbstractType = eTypeToTAbstractType.getTarget();
					if (tAbstractType != null) {
						Type eType = eTypeToTAbstractType.getSource();
						if (eType != null) {
							TypeGraph pg = tAbstractType.getPg();
							if (pg != null) {
								if (pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_0BB(ruleResult,
										eTypeToTAbstractType) == null) {
									if (pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_1BB(ruleResult,
											tAbstractType) == null) {
										if (pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_5BB(
												ruleResult, eType) == null) {
											if (pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_2BB(
													ruleResult, pg) == null) {
												for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(pg, ModelToTypeGraph.class,
																"target")) {
													Model eModel = eModelToPg.getSource();
													if (eModel != null) {
														if (pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_3BB(
																ruleResult, eModelToPg) == null) {
															if (pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_4BB(
																	ruleResult, eModel) == null) {
																_result.add(new Object[] { eTypeToTAbstractTypeList,
																		eTypeToTAbstractType, tAbstractType, pg,
																		eModelToPg, eModel, eType, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_3_solveCSP_bindingFBBBBBBBBB(
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eTypeToTAbstractType, TAbstractType tAbstractType, ModelToTypeGraph eModelToPg,
			Type eType, TypeGraph pg, Model eModel, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eTypeToTAbstractType, tAbstractType,
				eModelToPg, eType, pg, eModel, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eTypeToTAbstractType, tAbstractType, eModelToPg, eType,
					pg, eModel, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch,
			TypeToTAbstractType eTypeToTAbstractType, TAbstractType tAbstractType, ModelToTypeGraph eModelToPg,
			Type eType, TypeGraph pg, Model eModel, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ParameterizedTypeToClass_26_3_solveCSP_binding = pattern_ParameterizedTypeToClass_26_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, eTypeToTAbstractType, tAbstractType, eModelToPg, eType, pg, eModel,
				ruleResult);
		if (result_pattern_ParameterizedTypeToClass_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToClass_26_3_solveCSP_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_26_3_solveCSP_black = pattern_ParameterizedTypeToClass_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToClass_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eTypeToTAbstractType, tAbstractType, eModelToPg,
						eType, pg, eModel, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_26_4_checkCSP_expressionFBB(
			ParameterizedTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_5_checknacs_blackBBBBBB(
			TypeToTAbstractType eTypeToTAbstractType, TAbstractType tAbstractType, ModelToTypeGraph eModelToPg,
			Type eType, TypeGraph pg, Model eModel) {
		return new Object[] { eTypeToTAbstractType, tAbstractType, eModelToPg, eType, pg, eModel };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_6_perform_blackBBBBBBB(
			TypeToTAbstractType eTypeToTAbstractType, TAbstractType tAbstractType, ModelToTypeGraph eModelToPg,
			Type eType, TypeGraph pg, Model eModel, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { eTypeToTAbstractType, tAbstractType, eModelToPg, eType, pg, eModel, ruleResult };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_6_perform_greenFBFBBFB(TAbstractType tAbstractType,
			Type eType, Model eModel, ModelgeneratorRuleResult ruleResult) {
		TypeToTAbstractType eParameterizedTypeToTAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		ParameterizedType eParameterizedType = JavaFactory.eINSTANCE.createParameterizedType();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		eParameterizedTypeToTAbstractType.setTarget(tAbstractType);
		ruleResult.getCorrObjects().add(eParameterizedTypeToTAbstractType);
		eTypeAccess.setType(eType);
		ruleResult.getSourceObjects().add(eTypeAccess);
		eModel.getOrphanTypes().add(eParameterizedType);
		eParameterizedTypeToTAbstractType.setSource(eParameterizedType);
		eParameterizedType.setType(eTypeAccess);
		ruleResult.getSourceObjects().add(eParameterizedType);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eParameterizedTypeToTAbstractType, tAbstractType, eTypeAccess, eType, eModel,
				eParameterizedType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ParameterizedTypeToClass_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParameterizedTypeToClassImpl
