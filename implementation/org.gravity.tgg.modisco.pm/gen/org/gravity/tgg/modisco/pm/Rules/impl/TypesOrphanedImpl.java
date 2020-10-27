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
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.Model;

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MClass;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.ModelToTypeGraph;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.RulesPackage;
import org.gravity.tgg.modisco.pm.Rules.TypesOrphaned;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;
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
 * An implementation of the model object '<em><b>Types Orphaned</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypesOrphanedImpl extends AbstractRuleImpl implements TypesOrphaned {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypesOrphanedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTypesOrphaned();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Model mModel, MClass mType) {

		Object[] result1_black = TypesOrphanedImpl.pattern_TypesOrphaned_0_1_initialbindings_blackBBBB(this, match,
				mModel, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModel] = " + mModel + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mModel, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModel] = " + mModel + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypesOrphanedImpl.pattern_TypesOrphaned_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypesOrphanedImpl
					.pattern_TypesOrphaned_0_4_collectelementstobetranslated_blackBBB(match, mModel, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModel] = " + mModel + ", " + "[mType] = " + mType + ".");
			}
			TypesOrphanedImpl.pattern_TypesOrphaned_0_4_collectelementstobetranslated_greenBBBF(match, mModel, mType);
			//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result4_green[3];

			Object[] result5_black = TypesOrphanedImpl.pattern_TypesOrphaned_0_5_collectcontextelements_blackBBB(match,
					mModel, mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModel] = " + mModel + ", " + "[mType] = " + mType + ".");
			}
			TypesOrphanedImpl.pattern_TypesOrphaned_0_5_collectcontextelements_greenBB(match, mModel);

			// 
			TypesOrphanedImpl.pattern_TypesOrphaned_0_6_registerobjectstomatch_expressionBBBB(this, match, mModel,
					mType);
			return TypesOrphanedImpl.pattern_TypesOrphaned_0_7_expressionF();
		} else {
			return TypesOrphanedImpl.pattern_TypesOrphaned_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Model mModel = (Model) result1_bindingAndBlack[0];
		ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[1];
		MClass mType = (MClass) result1_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = TypesOrphanedImpl.pattern_TypesOrphaned_1_1_performtransformation_greenFBBFFB(mType,
				pg, csp);
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_green[0];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[3];
		TClass tType = (TClass) result1_green[4];

		Object[] result2_black = TypesOrphanedImpl.pattern_TypesOrphaned_1_2_collecttranslatedelements_blackBBBB(
				mTypeToTType, mType, mBodyToTAnnotation, tType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = " + mTypeToTType
					+ ", " + "[mType] = " + mType + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", "
					+ "[tType] = " + tType + ".");
		}
		Object[] result2_green = TypesOrphanedImpl.pattern_TypesOrphaned_1_2_collecttranslatedelements_greenFBBBB(
				mTypeToTType, mType, mBodyToTAnnotation, tType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypesOrphanedImpl.pattern_TypesOrphaned_1_3_bookkeepingforedges_blackBBBBBBBB(
				ruleresult, mModel, mTypeToTType, mModelToTypeGraph, mType, pg, mBodyToTAnnotation, tType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mModel] = " + mModel + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[mModelToTypeGraph] = " + mModelToTypeGraph + ", " + "[mType] = " + mType + ", " + "[pg] = " + pg
					+ ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[tType] = " + tType + ".");
		}
		TypesOrphanedImpl.pattern_TypesOrphaned_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult, mModel,
				mTypeToTType, mType, pg, mBodyToTAnnotation, tType);
		//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mBodyToTAnnotation__mType____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mBodyToTAnnotation__tType____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tType__pg____pg = (EMoflonEdge) result3_green[13];

		// 
		// 
		TypesOrphanedImpl.pattern_TypesOrphaned_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, mModel,
				mTypeToTType, mModelToTypeGraph, mType, pg, mBodyToTAnnotation, tType);
		return TypesOrphanedImpl.pattern_TypesOrphaned_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypesOrphanedImpl
				.pattern_TypesOrphaned_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypesOrphanedImpl.pattern_TypesOrphaned_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Model mModel = (Model) result2_binding[0];
		MClass mType = (MClass) result2_binding[1];
		for (Object[] result2_black : TypesOrphanedImpl.pattern_TypesOrphaned_2_2_corematch_blackBFBFB(mModel, mType,
				match)) {
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[3];
			// ForEach 
			for (Object[] result3_black : TypesOrphanedImpl.pattern_TypesOrphaned_2_3_findcontext_blackBBBB(mModel,
					mModelToTypeGraph, mType, pg)) {
				Object[] result3_green = TypesOrphanedImpl.pattern_TypesOrphaned_2_3_findcontext_greenBBBBFFFF(mModel,
						mModelToTypeGraph, mType, pg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mModelToTypeGraph__mModel____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mModelToTypeGraph__pg____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = TypesOrphanedImpl
						.pattern_TypesOrphaned_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, mModel,
								mModelToTypeGraph, mType, pg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mModel] = " + mModel + ", "
							+ "[mModelToTypeGraph] = " + mModelToTypeGraph + ", " + "[mType] = " + mType + ", "
							+ "[pg] = " + pg + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypesOrphanedImpl.pattern_TypesOrphaned_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypesOrphanedImpl
							.pattern_TypesOrphaned_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypesOrphanedImpl.pattern_TypesOrphaned_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return TypesOrphanedImpl.pattern_TypesOrphaned_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Model mModel, MClass mType) {
		match.registerObject("mModel", mModel);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Model mModel, MClass mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Model mModel,
			ModelToTypeGraph mModelToTypeGraph, MClass mType, TypeGraph pg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType.proxy", true, csp);
		var_mType_proxy.setValue(mType.isProxy());
		var_mType_proxy.setType("Boolean");

		// Create unbound variables
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", csp);
		var_tType_tLib.setType("Boolean");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_proxy, var_tType_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("pg", pg);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mModel, EObject mTypeToTType,
			EObject mModelToTypeGraph, EObject mType, EObject pg, EObject mBodyToTAnnotation, EObject tType) {
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mModelToTypeGraph", mModelToTypeGraph);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("tType", tType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mType").eClass()).equals("modisco.MClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph pg, TClass tType) {

		Object[] result1_black = TypesOrphanedImpl.pattern_TypesOrphaned_10_1_initialbindings_blackBBBB(this, match, pg,
				tType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pg] = " + pg + ", " + "[tType] = " + tType + ".");
		}

		Object[] result2_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, pg, tType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pg] = " + pg + ", " + "[tType] = " + tType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypesOrphanedImpl.pattern_TypesOrphaned_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypesOrphanedImpl
					.pattern_TypesOrphaned_10_4_collectelementstobetranslated_blackBBB(match, pg, tType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pg] = " + pg + ", " + "[tType] = " + tType + ".");
			}
			TypesOrphanedImpl.pattern_TypesOrphaned_10_4_collectelementstobetranslated_greenBBBFF(match, pg, tType);
			//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tType__pg____pg = (EMoflonEdge) result4_green[4];

			Object[] result5_black = TypesOrphanedImpl.pattern_TypesOrphaned_10_5_collectcontextelements_blackBBB(match,
					pg, tType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pg] = " + pg + ", " + "[tType] = " + tType + ".");
			}
			TypesOrphanedImpl.pattern_TypesOrphaned_10_5_collectcontextelements_greenBB(match, pg);

			// 
			TypesOrphanedImpl.pattern_TypesOrphaned_10_6_registerobjectstomatch_expressionBBBB(this, match, pg, tType);
			return TypesOrphanedImpl.pattern_TypesOrphaned_10_7_expressionF();
		} else {
			return TypesOrphanedImpl.pattern_TypesOrphaned_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Model mModel = (Model) result1_bindingAndBlack[0];
		ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[1];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[2];
		TClass tType = (TClass) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = TypesOrphanedImpl.pattern_TypesOrphaned_11_1_performtransformation_greenBFFFBB(mModel,
				tType, csp);
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_green[1];
		MClass mType = (MClass) result1_green[2];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[3];

		Object[] result2_black = TypesOrphanedImpl.pattern_TypesOrphaned_11_2_collecttranslatedelements_blackBBBB(
				mTypeToTType, mType, mBodyToTAnnotation, tType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = " + mTypeToTType
					+ ", " + "[mType] = " + mType + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", "
					+ "[tType] = " + tType + ".");
		}
		Object[] result2_green = TypesOrphanedImpl.pattern_TypesOrphaned_11_2_collecttranslatedelements_greenFBBBB(
				mTypeToTType, mType, mBodyToTAnnotation, tType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypesOrphanedImpl.pattern_TypesOrphaned_11_3_bookkeepingforedges_blackBBBBBBBB(
				ruleresult, mModel, mTypeToTType, mModelToTypeGraph, mType, pg, mBodyToTAnnotation, tType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mModel] = " + mModel + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[mModelToTypeGraph] = " + mModelToTypeGraph + ", " + "[mType] = " + mType + ", " + "[pg] = " + pg
					+ ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[tType] = " + tType + ".");
		}
		TypesOrphanedImpl.pattern_TypesOrphaned_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult, mModel,
				mTypeToTType, mType, pg, mBodyToTAnnotation, tType);
		//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mBodyToTAnnotation__mType____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mBodyToTAnnotation__tType____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tType__pg____pg = (EMoflonEdge) result3_green[13];

		// 
		// 
		TypesOrphanedImpl.pattern_TypesOrphaned_11_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, mModel,
				mTypeToTType, mModelToTypeGraph, mType, pg, mBodyToTAnnotation, tType);
		return TypesOrphanedImpl.pattern_TypesOrphaned_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypesOrphanedImpl
				.pattern_TypesOrphaned_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypesOrphanedImpl.pattern_TypesOrphaned_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeGraph pg = (TypeGraph) result2_binding[0];
		TClass tType = (TClass) result2_binding[1];
		for (Object[] result2_black : TypesOrphanedImpl.pattern_TypesOrphaned_12_2_corematch_blackFFBBB(pg, tType,
				match)) {
			Model mModel = (Model) result2_black[0];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[1];
			// ForEach 
			for (Object[] result3_black : TypesOrphanedImpl.pattern_TypesOrphaned_12_3_findcontext_blackBBBB(mModel,
					mModelToTypeGraph, pg, tType)) {
				Object[] result3_green = TypesOrphanedImpl.pattern_TypesOrphaned_12_3_findcontext_greenBBBBFFFFF(mModel,
						mModelToTypeGraph, pg, tType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge mModelToTypeGraph__mModel____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mModelToTypeGraph__pg____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge tType__pg____pg = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = TypesOrphanedImpl
						.pattern_TypesOrphaned_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, mModel,
								mModelToTypeGraph, pg, tType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mModel] = " + mModel + ", "
							+ "[mModelToTypeGraph] = " + mModelToTypeGraph + ", " + "[pg] = " + pg + ", " + "[tType] = "
							+ tType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypesOrphanedImpl.pattern_TypesOrphaned_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypesOrphanedImpl
							.pattern_TypesOrphaned_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypesOrphanedImpl.pattern_TypesOrphaned_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return TypesOrphanedImpl.pattern_TypesOrphaned_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph pg, TClass tType) {
		match.registerObject("pg", pg);
		match.registerObject("tType", tType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph pg, TClass tType) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Model mModel,
			ModelToTypeGraph mModelToTypeGraph, TypeGraph pg, TClass tType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", true, csp);
		var_tType_tLib.setValue(tType.isTLib());
		var_tType_tLib.setType("Boolean");

		// Create unbound variables
		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType.proxy", csp);
		var_mType_proxy.setType("Boolean");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_proxy, var_tType_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("tType", tType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mModel, EObject mTypeToTType,
			EObject mModelToTypeGraph, EObject mType, EObject pg, EObject mBodyToTAnnotation, EObject tType) {
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mModelToTypeGraph", mModelToTypeGraph);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("tType", tType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tType").eClass()).equals("basic.TClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_147(EMoflonEdge _edge_ownedTypes) {

		Object[] result1_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypesOrphanedImpl.pattern_TypesOrphaned_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypesOrphanedImpl
				.pattern_TypesOrphaned_20_2_testcorematchandDECs_blackFFB(_edge_ownedTypes)) {
			TypeGraph pg = (TypeGraph) result2_black[0];
			TClass tType = (TClass) result2_black[1];
			Object[] result2_green = TypesOrphanedImpl
					.pattern_TypesOrphaned_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypesOrphanedImpl.pattern_TypesOrphaned_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
					this, match, pg, tType)) {
				// 
				if (TypesOrphanedImpl
						.pattern_TypesOrphaned_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = TypesOrphanedImpl
							.pattern_TypesOrphaned_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypesOrphanedImpl.pattern_TypesOrphaned_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypesOrphanedImpl.pattern_TypesOrphaned_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_151(EMoflonEdge _edge_orphanTypes) {

		Object[] result1_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypesOrphanedImpl.pattern_TypesOrphaned_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypesOrphanedImpl
				.pattern_TypesOrphaned_21_2_testcorematchandDECs_blackFFB(_edge_orphanTypes)) {
			Model mModel = (Model) result2_black[0];
			MClass mType = (MClass) result2_black[1];
			Object[] result2_green = TypesOrphanedImpl
					.pattern_TypesOrphaned_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypesOrphanedImpl.pattern_TypesOrphaned_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
					this, match, mModel, mType)) {
				// 
				if (TypesOrphanedImpl
						.pattern_TypesOrphaned_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = TypesOrphanedImpl
							.pattern_TypesOrphaned_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypesOrphanedImpl.pattern_TypesOrphaned_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypesOrphanedImpl.pattern_TypesOrphaned_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TypesOrphaned");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tLib.setValue(__helper.getValue("tType", "tLib"));
		var_tType_tLib.setType("boolean");

		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_proxy.setValue(__helper.getValue("mType", "proxy"));
		var_mType_proxy.setType("boolean");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("TypesOrphaned");
		eq0.solve(var_mType_proxy, var_tType_tLib);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tType_tLib.setBound(false);
			eq0.solve(var_mType_proxy, var_tType_tLib);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tType", "tLib", var_tType_tLib.getValue());
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
		ruleResult.setRule("TypesOrphaned");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tLib.setValue(__helper.getValue("tType", "tLib"));
		var_tType_tLib.setType("boolean");

		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_proxy.setValue(__helper.getValue("mType", "proxy"));
		var_mType_proxy.setType("boolean");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("TypesOrphaned");
		eq0.solve(var_mType_proxy, var_tType_tLib);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mType_proxy.setBound(false);
			eq0.solve(var_mType_proxy, var_tType_tLib);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mType", "proxy", var_mType_proxy.getValue());
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

		Object[] result1_black = TypesOrphanedImpl.pattern_TypesOrphaned_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypesOrphanedImpl.pattern_TypesOrphaned_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Model mModel = (Model) result2_bindingAndBlack[0];
		MClass mType = (MClass) result2_bindingAndBlack[1];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[2];
		TClass tType = (TClass) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, mModel, mType, pg, tType,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mModel] = " + mModel + ", " + "[mType] = " + mType + ", " + "[pg] = " + pg + ", " + "[tType] = "
					+ tType + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypesOrphanedImpl.pattern_TypesOrphaned_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypesOrphanedImpl
					.pattern_TypesOrphaned_24_5_matchcorrcontext_blackBFBBB(mModel, pg, sourceMatch, targetMatch)) {
				ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result5_black[1];
				Object[] result5_green = TypesOrphanedImpl.pattern_TypesOrphaned_24_5_matchcorrcontext_greenBBBF(
						mModelToTypeGraph, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = TypesOrphanedImpl
						.pattern_TypesOrphaned_24_6_createcorrespondence_blackBBBBB(mModel, mType, pg, tType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mModel] = " + mModel
							+ ", " + "[mType] = " + mType + ", " + "[pg] = " + pg + ", " + "[tType] = " + tType + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				TypesOrphanedImpl.pattern_TypesOrphaned_24_6_createcorrespondence_greenFBFBB(mType, tType, ccMatch);
				//nothing TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result6_green[0];
				//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[2];

				Object[] result7_black = TypesOrphanedImpl
						.pattern_TypesOrphaned_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypesOrphanedImpl.pattern_TypesOrphaned_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return TypesOrphanedImpl.pattern_TypesOrphaned_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Model mModel, MClass mType, TypeGraph pg, TClass tType, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType.proxy", true, csp);
		var_mType_proxy.setValue(mType.isProxy());
		var_mType_proxy.setType("Boolean");
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", true, csp);
		var_tType_tLib.setValue(tType.isTLib());
		var_tType_tLib.setType("Boolean");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_proxy, var_tType_tLib);
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
	public boolean checkDEC_FWD(Model mModel, MClass mType) {// 
		Object[] result1_black = TypesOrphanedImpl.pattern_TypesOrphaned_27_1_matchtggpattern_blackBB(mModel, mType);
		if (result1_black != null) {
			return TypesOrphanedImpl.pattern_TypesOrphaned_27_2_expressionF();
		} else {
			return TypesOrphanedImpl.pattern_TypesOrphaned_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph pg, TClass tType) {// 
		Object[] result1_black = TypesOrphanedImpl.pattern_TypesOrphaned_28_1_matchtggpattern_blackBB(pg, tType);
		if (result1_black != null) {
			return TypesOrphanedImpl.pattern_TypesOrphaned_28_2_expressionF();
		} else {
			return TypesOrphanedImpl.pattern_TypesOrphaned_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph mModelToTypeGraphParameter) {

		Object[] result1_black = TypesOrphanedImpl.pattern_TypesOrphaned_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypesOrphanedImpl.pattern_TypesOrphaned_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : TypesOrphanedImpl
				.pattern_TypesOrphaned_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mModelToTypeGraphList = (RuleEntryList) result2_black[0];
			Model mModel = (Model) result2_black[1];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];

			Object[] result3_bindingAndBlack = TypesOrphanedImpl
					.pattern_TypesOrphaned_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, mModel,
							mModelToTypeGraph, pg, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mModel] = " + mModel + ", "
						+ "[mModelToTypeGraph] = " + mModelToTypeGraph + ", " + "[pg] = " + pg + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypesOrphanedImpl.pattern_TypesOrphaned_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = TypesOrphanedImpl.pattern_TypesOrphaned_29_5_checknacs_blackBBB(mModel,
						mModelToTypeGraph, pg);
				if (result5_black != null) {

					Object[] result6_black = TypesOrphanedImpl.pattern_TypesOrphaned_29_6_perform_blackBBBB(mModel,
							mModelToTypeGraph, pg, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mModel] = " + mModel
								+ ", " + "[mModelToTypeGraph] = " + mModelToTypeGraph + ", " + "[pg] = " + pg + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					TypesOrphanedImpl.pattern_TypesOrphaned_29_6_perform_greenBFFBFFBB(mModel, pg, ruleResult, csp);
					//nothing TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result6_green[1];
					//nothing MClass mType = (MClass) result6_green[2];
					//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[4];
					//nothing TClass tType = (TClass) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return TypesOrphanedImpl.pattern_TypesOrphaned_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Model mModel,
			ModelToTypeGraph mModelToTypeGraph, TypeGraph pg, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType.proxy", csp);
		var_mType_proxy.setType("Boolean");
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", csp);
		var_tType_tLib.setType("Boolean");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_proxy, var_tType_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
		isApplicableMatch.registerObject("pg", pg);
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
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_FWD__MATCH_MODEL_MCLASS:
			return isAppropriate_FWD((Match) arguments.get(0), (Model) arguments.get(1), (MClass) arguments.get(2));
		case RulesPackage.TYPES_ORPHANED___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL_MCLASS:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Model) arguments.get(1), (MClass) arguments.get(2));
			return null;
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL_MCLASS:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(MClass) arguments.get(2));
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL_MODELTOTYPEGRAPH_MCLASS_TYPEGRAPH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(ModelToTypeGraph) arguments.get(2), (MClass) arguments.get(3), (TypeGraph) arguments.get(4));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.TYPES_ORPHANED___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TCLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1), (TClass) arguments.get(2));
		case RulesPackage.TYPES_ORPHANED___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TCLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TClass) arguments.get(2));
			return null;
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TCLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TClass) arguments.get(2));
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_MODELTOTYPEGRAPH_TYPEGRAPH_TCLASS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(ModelToTypeGraph) arguments.get(2), (TypeGraph) arguments.get(3), (TClass) arguments.get(4));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.TYPES_ORPHANED___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_BWD_EMOFLON_EDGE_147__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_147((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_FWD_EMOFLON_EDGE_151__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_151((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_SOLVE_CSP_CC__MODEL_MCLASS_TYPEGRAPH_TCLASS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Model) arguments.get(0), (MClass) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___CHECK_DEC_FWD__MODEL_MCLASS:
			return checkDEC_FWD((Model) arguments.get(0), (MClass) arguments.get(1));
		case RulesPackage.TYPES_ORPHANED___CHECK_DEC_BWD__TYPEGRAPH_TCLASS:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TClass) arguments.get(1));
		case RulesPackage.TYPES_ORPHANED___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.TYPES_ORPHANED___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_MODELTOTYPEGRAPH_TYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(ModelToTypeGraph) arguments.get(2), (TypeGraph) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.TYPES_ORPHANED___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypesOrphaned_0_1_initialbindings_blackBBBB(TypesOrphaned _this, Match match,
			Model mModel, MClass mType) {
		return new Object[] { _this, match, mModel, mType };
	}

	public static final Object[] pattern_TypesOrphaned_0_2_SolveCSP_bindingFBBBB(TypesOrphaned _this, Match match,
			Model mModel, MClass mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mModel, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mModel, mType };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesOrphaned_0_2_SolveCSP_bindingAndBlackFBBBB(TypesOrphaned _this,
			Match match, Model mModel, MClass mType) {
		Object[] result_pattern_TypesOrphaned_0_2_SolveCSP_binding = pattern_TypesOrphaned_0_2_SolveCSP_bindingFBBBB(
				_this, match, mModel, mType);
		if (result_pattern_TypesOrphaned_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesOrphaned_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypesOrphaned_0_2_SolveCSP_black = pattern_TypesOrphaned_0_2_SolveCSP_blackB(csp);
			if (result_pattern_TypesOrphaned_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mModel, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_0_3_CheckCSP_expressionFBB(TypesOrphaned _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_0_4_collectelementstobetranslated_blackBBB(Match match,
			Model mModel, MClass mType) {
		return new Object[] { match, mModel, mType };
	}

	public static final Object[] pattern_TypesOrphaned_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Model mModel, MClass mType) {
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mType);
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		match.getToBeTranslatedEdges().add(mModel__mType____orphanTypes);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		return new Object[] { match, mModel, mType, mModel__mType____orphanTypes };
	}

	public static final Object[] pattern_TypesOrphaned_0_5_collectcontextelements_blackBBB(Match match, Model mModel,
			MClass mType) {
		return new Object[] { match, mModel, mType };
	}

	public static final Object[] pattern_TypesOrphaned_0_5_collectcontextelements_greenBB(Match match, Model mModel) {
		match.getContextNodes().add(mModel);
		return new Object[] { match, mModel };
	}

	public static final void pattern_TypesOrphaned_0_6_registerobjectstomatch_expressionBBBB(TypesOrphaned _this,
			Match match, Model mModel, MClass mType) {
		_this.registerObjectsToMatch_FWD(match, mModel, mType);

	}

	public static final boolean pattern_TypesOrphaned_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypesOrphaned_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mModel");
		EObject _localVariable_1 = isApplicableMatch.getObject("mModelToTypeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("mType");
		EObject _localVariable_3 = isApplicableMatch.getObject("pg");
		EObject tmpMModel = _localVariable_0;
		EObject tmpMModelToTypeGraph = _localVariable_1;
		EObject tmpMType = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		if (tmpMModel instanceof Model) {
			Model mModel = (Model) tmpMModel;
			if (tmpMModelToTypeGraph instanceof ModelToTypeGraph) {
				ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) tmpMModelToTypeGraph;
				if (tmpMType instanceof MClass) {
					MClass mType = (MClass) tmpMType;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						return new Object[] { mModel, mModelToTypeGraph, mType, pg, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_1_1_performtransformation_blackBBBBFBB(Model mModel,
			ModelToTypeGraph mModelToTypeGraph, MClass mType, TypeGraph pg, TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mModel, mModelToTypeGraph, mType, pg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_1_1_performtransformation_bindingAndBlackFFFFFBB(
			TypesOrphaned _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypesOrphaned_1_1_performtransformation_binding = pattern_TypesOrphaned_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_TypesOrphaned_1_1_performtransformation_binding != null) {
			Model mModel = (Model) result_pattern_TypesOrphaned_1_1_performtransformation_binding[0];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result_pattern_TypesOrphaned_1_1_performtransformation_binding[1];
			MClass mType = (MClass) result_pattern_TypesOrphaned_1_1_performtransformation_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_TypesOrphaned_1_1_performtransformation_binding[3];

			Object[] result_pattern_TypesOrphaned_1_1_performtransformation_black = pattern_TypesOrphaned_1_1_performtransformation_blackBBBBFBB(
					mModel, mModelToTypeGraph, mType, pg, _this, isApplicableMatch);
			if (result_pattern_TypesOrphaned_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypesOrphaned_1_1_performtransformation_black[4];

				return new Object[] { mModel, mModelToTypeGraph, mType, pg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_1_1_performtransformation_greenFBBFFB(MClass mType, TypeGraph pg,
			CSP csp) {
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TClass tType = BasicFactory.eINSTANCE.createTClass();
		Object _localVariable_0 = csp.getValue("tType", "tLib");
		mTypeToTType.setSource(mType);
		mBodyToTAnnotation.setSource(mType);
		mBodyToTAnnotation.setTarget(tType);
		mTypeToTType.setTarget(tType);
		pg.getOwnedTypes().add(tType);
		boolean tType_tLib_prime = (boolean) _localVariable_0;
		tType.setTLib(Boolean.valueOf(tType_tLib_prime));
		return new Object[] { mTypeToTType, mType, pg, mBodyToTAnnotation, tType, csp };
	}

	public static final Object[] pattern_TypesOrphaned_1_2_collecttranslatedelements_blackBBBB(
			TypeToTAbstractType mTypeToTType, MClass mType, ASTNodeToTAnnotatable mBodyToTAnnotation, TClass tType) {
		return new Object[] { mTypeToTType, mType, mBodyToTAnnotation, tType };
	}

	public static final Object[] pattern_TypesOrphaned_1_2_collecttranslatedelements_greenFBBBB(
			TypeToTAbstractType mTypeToTType, MClass mType, ASTNodeToTAnnotatable mBodyToTAnnotation, TClass tType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getTranslatedElements().add(mType);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedElements().add(tType);
		return new Object[] { ruleresult, mTypeToTType, mType, mBodyToTAnnotation, tType };
	}

	public static final Object[] pattern_TypesOrphaned_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject mModel, EObject mTypeToTType, EObject mModelToTypeGraph,
			EObject mType, EObject pg, EObject mBodyToTAnnotation, EObject tType) {
		if (!mModel.equals(mTypeToTType)) {
			if (!mModel.equals(mModelToTypeGraph)) {
				if (!mModel.equals(mType)) {
					if (!mModel.equals(pg)) {
						if (!mModel.equals(tType)) {
							if (!mTypeToTType.equals(pg)) {
								if (!mTypeToTType.equals(tType)) {
									if (!mModelToTypeGraph.equals(mTypeToTType)) {
										if (!mModelToTypeGraph.equals(mType)) {
											if (!mModelToTypeGraph.equals(pg)) {
												if (!mModelToTypeGraph.equals(tType)) {
													if (!mType.equals(mTypeToTType)) {
														if (!mType.equals(pg)) {
															if (!mType.equals(tType)) {
																if (!pg.equals(tType)) {
																	if (!mBodyToTAnnotation.equals(mModel)) {
																		if (!mBodyToTAnnotation.equals(mTypeToTType)) {
																			if (!mBodyToTAnnotation
																					.equals(mModelToTypeGraph)) {
																				if (!mBodyToTAnnotation.equals(mType)) {
																					if (!mBodyToTAnnotation
																							.equals(pg)) {
																						if (!mBodyToTAnnotation
																								.equals(tType)) {
																							return new Object[] {
																									ruleresult, mModel,
																									mTypeToTType,
																									mModelToTypeGraph,
																									mType, pg,
																									mBodyToTAnnotation,
																									tType };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypesOrphaned_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject mModel, EObject mTypeToTType, EObject mType, EObject pg,
			EObject mBodyToTAnnotation, EObject tType) {
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypesOrphaned";
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		String mTypeToTType__mType____source_name_prime = "source";
		String mBodyToTAnnotation__mType____source_name_prime = "source";
		String mBodyToTAnnotation__tType____target_name_prime = "target";
		String mTypeToTType__tType____target_name_prime = "target";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mModel__mType____orphanTypes);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mTypeToTType__mType____source);
		mBodyToTAnnotation__mType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mType____source);
		mBodyToTAnnotation__tType____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tType____target);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mTypeToTType__tType____target);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		ruleresult.getCreatedEdges().add(pg__tType____ownedTypes);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		ruleresult.getCreatedEdges().add(tType__pg____pg);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mBodyToTAnnotation__mType____source.setName(mBodyToTAnnotation__mType____source_name_prime);
		mBodyToTAnnotation__tType____target.setName(mBodyToTAnnotation__tType____target_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		return new Object[] { ruleresult, mModel, mTypeToTType, mType, pg, mBodyToTAnnotation, tType,
				mModel__mType____orphanTypes, mTypeToTType__mType____source, mBodyToTAnnotation__mType____source,
				mBodyToTAnnotation__tType____target, mTypeToTType__tType____target, pg__tType____ownedTypes,
				tType__pg____pg };
	}

	public static final void pattern_TypesOrphaned_1_5_registerobjects_expressionBBBBBBBBB(TypesOrphaned _this,
			PerformRuleResult ruleresult, EObject mModel, EObject mTypeToTType, EObject mModelToTypeGraph,
			EObject mType, EObject pg, EObject mBodyToTAnnotation, EObject tType) {
		_this.registerObjects_FWD(ruleresult, mModel, mTypeToTType, mModelToTypeGraph, mType, pg, mBodyToTAnnotation,
				tType);

	}

	public static final PerformRuleResult pattern_TypesOrphaned_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_2_1_preparereturnvalue_bindingFB(TypesOrphaned _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_2_1_preparereturnvalue_blackFBB(EClass eClass,
			TypesOrphaned _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_2_1_preparereturnvalue_bindingAndBlackFFB(TypesOrphaned _this) {
		Object[] result_pattern_TypesOrphaned_2_1_preparereturnvalue_binding = pattern_TypesOrphaned_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypesOrphaned_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypesOrphaned_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypesOrphaned_2_1_preparereturnvalue_black = pattern_TypesOrphaned_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypesOrphaned_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypesOrphaned_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypesOrphaned";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypesOrphaned_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mModel");
		EObject _localVariable_1 = match.getObject("mType");
		EObject tmpMModel = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		if (tmpMModel instanceof Model) {
			Model mModel = (Model) tmpMModel;
			if (tmpMType instanceof MClass) {
				MClass mType = (MClass) tmpMType;
				return new Object[] { mModel, mType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_2_2_corematch_blackBFBFB(Model mModel, MClass mType,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mModel, ModelToTypeGraph.class, "source")) {
			TypeGraph pg = mModelToTypeGraph.getTarget();
			if (pg != null) {
				_result.add(new Object[] { mModel, mModelToTypeGraph, mType, pg, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_2_3_findcontext_blackBBBB(Model mModel,
			ModelToTypeGraph mModelToTypeGraph, MClass mType, TypeGraph pg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mModel.getOrphanTypes().contains(mType)) {
			if (mModel.equals(mModelToTypeGraph.getSource())) {
				if (pg.equals(mModelToTypeGraph.getTarget())) {
					_result.add(new Object[] { mModel, mModelToTypeGraph, mType, pg });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_2_3_findcontext_greenBBBBFFFF(Model mModel,
			ModelToTypeGraph mModelToTypeGraph, MClass mType, TypeGraph pg) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		String mModelToTypeGraph__mModel____source_name_prime = "source";
		String mModelToTypeGraph__pg____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mModel);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(pg);
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mModel__mType____orphanTypes);
		mModelToTypeGraph__mModel____source.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__mModel____source.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__mModel____source);
		mModelToTypeGraph__pg____target.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__pg____target);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		mModelToTypeGraph__mModel____source.setName(mModelToTypeGraph__mModel____source_name_prime);
		mModelToTypeGraph__pg____target.setName(mModelToTypeGraph__pg____target_name_prime);
		return new Object[] { mModel, mModelToTypeGraph, mType, pg, isApplicableMatch, mModel__mType____orphanTypes,
				mModelToTypeGraph__mModel____source, mModelToTypeGraph__pg____target };
	}

	public static final Object[] pattern_TypesOrphaned_2_4_solveCSP_bindingFBBBBBB(TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch, Model mModel, ModelToTypeGraph mModelToTypeGraph, MClass mType,
			TypeGraph pg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mModel, mModelToTypeGraph, mType, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mModel, mModelToTypeGraph, mType, pg };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesOrphaned_2_4_solveCSP_bindingAndBlackFBBBBBB(TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch, Model mModel, ModelToTypeGraph mModelToTypeGraph, MClass mType,
			TypeGraph pg) {
		Object[] result_pattern_TypesOrphaned_2_4_solveCSP_binding = pattern_TypesOrphaned_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mModel, mModelToTypeGraph, mType, pg);
		if (result_pattern_TypesOrphaned_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesOrphaned_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypesOrphaned_2_4_solveCSP_black = pattern_TypesOrphaned_2_4_solveCSP_blackB(csp);
			if (result_pattern_TypesOrphaned_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mModel, mModelToTypeGraph, mType, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_2_5_checkCSP_expressionFBB(TypesOrphaned _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypesOrphaned_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypesOrphaned";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypesOrphaned_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_10_1_initialbindings_blackBBBB(TypesOrphaned _this, Match match,
			TypeGraph pg, TClass tType) {
		return new Object[] { _this, match, pg, tType };
	}

	public static final Object[] pattern_TypesOrphaned_10_2_SolveCSP_bindingFBBBB(TypesOrphaned _this, Match match,
			TypeGraph pg, TClass tType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, pg, tType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pg, tType };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesOrphaned_10_2_SolveCSP_bindingAndBlackFBBBB(TypesOrphaned _this,
			Match match, TypeGraph pg, TClass tType) {
		Object[] result_pattern_TypesOrphaned_10_2_SolveCSP_binding = pattern_TypesOrphaned_10_2_SolveCSP_bindingFBBBB(
				_this, match, pg, tType);
		if (result_pattern_TypesOrphaned_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesOrphaned_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TypesOrphaned_10_2_SolveCSP_black = pattern_TypesOrphaned_10_2_SolveCSP_blackB(csp);
			if (result_pattern_TypesOrphaned_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, pg, tType };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_10_3_CheckCSP_expressionFBB(TypesOrphaned _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_10_4_collectelementstobetranslated_blackBBB(Match match,
			TypeGraph pg, TClass tType) {
		return new Object[] { match, pg, tType };
	}

	public static final Object[] pattern_TypesOrphaned_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TypeGraph pg, TClass tType) {
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tType);
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____ownedTypes);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		match.getToBeTranslatedEdges().add(tType__pg____pg);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		return new Object[] { match, pg, tType, pg__tType____ownedTypes, tType__pg____pg };
	}

	public static final Object[] pattern_TypesOrphaned_10_5_collectcontextelements_blackBBB(Match match, TypeGraph pg,
			TClass tType) {
		return new Object[] { match, pg, tType };
	}

	public static final Object[] pattern_TypesOrphaned_10_5_collectcontextelements_greenBB(Match match, TypeGraph pg) {
		match.getContextNodes().add(pg);
		return new Object[] { match, pg };
	}

	public static final void pattern_TypesOrphaned_10_6_registerobjectstomatch_expressionBBBB(TypesOrphaned _this,
			Match match, TypeGraph pg, TClass tType) {
		_this.registerObjectsToMatch_BWD(match, pg, tType);

	}

	public static final boolean pattern_TypesOrphaned_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypesOrphaned_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mModel");
		EObject _localVariable_1 = isApplicableMatch.getObject("mModelToTypeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("pg");
		EObject _localVariable_3 = isApplicableMatch.getObject("tType");
		EObject tmpMModel = _localVariable_0;
		EObject tmpMModelToTypeGraph = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		EObject tmpTType = _localVariable_3;
		if (tmpMModel instanceof Model) {
			Model mModel = (Model) tmpMModel;
			if (tmpMModelToTypeGraph instanceof ModelToTypeGraph) {
				ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) tmpMModelToTypeGraph;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					if (tmpTType instanceof TClass) {
						TClass tType = (TClass) tmpTType;
						return new Object[] { mModel, mModelToTypeGraph, pg, tType, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_11_1_performtransformation_blackBBBBFBB(Model mModel,
			ModelToTypeGraph mModelToTypeGraph, TypeGraph pg, TClass tType, TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mModel, mModelToTypeGraph, pg, tType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_11_1_performtransformation_bindingAndBlackFFFFFBB(
			TypesOrphaned _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypesOrphaned_11_1_performtransformation_binding = pattern_TypesOrphaned_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_TypesOrphaned_11_1_performtransformation_binding != null) {
			Model mModel = (Model) result_pattern_TypesOrphaned_11_1_performtransformation_binding[0];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result_pattern_TypesOrphaned_11_1_performtransformation_binding[1];
			TypeGraph pg = (TypeGraph) result_pattern_TypesOrphaned_11_1_performtransformation_binding[2];
			TClass tType = (TClass) result_pattern_TypesOrphaned_11_1_performtransformation_binding[3];

			Object[] result_pattern_TypesOrphaned_11_1_performtransformation_black = pattern_TypesOrphaned_11_1_performtransformation_blackBBBBFBB(
					mModel, mModelToTypeGraph, pg, tType, _this, isApplicableMatch);
			if (result_pattern_TypesOrphaned_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypesOrphaned_11_1_performtransformation_black[4];

				return new Object[] { mModel, mModelToTypeGraph, pg, tType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_11_1_performtransformation_greenBFFFBB(Model mModel,
			TClass tType, CSP csp) {
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		MClass mType = ModiscoFactory.eINSTANCE.createMClass();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		Object _localVariable_0 = csp.getValue("mType", "proxy");
		mTypeToTType.setTarget(tType);
		mModel.getOrphanTypes().add(mType);
		mTypeToTType.setSource(mType);
		mBodyToTAnnotation.setSource(mType);
		mBodyToTAnnotation.setTarget(tType);
		boolean mType_proxy_prime = (boolean) _localVariable_0;
		mType.setProxy(Boolean.valueOf(mType_proxy_prime));
		return new Object[] { mModel, mTypeToTType, mType, mBodyToTAnnotation, tType, csp };
	}

	public static final Object[] pattern_TypesOrphaned_11_2_collecttranslatedelements_blackBBBB(
			TypeToTAbstractType mTypeToTType, MClass mType, ASTNodeToTAnnotatable mBodyToTAnnotation, TClass tType) {
		return new Object[] { mTypeToTType, mType, mBodyToTAnnotation, tType };
	}

	public static final Object[] pattern_TypesOrphaned_11_2_collecttranslatedelements_greenFBBBB(
			TypeToTAbstractType mTypeToTType, MClass mType, ASTNodeToTAnnotatable mBodyToTAnnotation, TClass tType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getCreatedElements().add(mType);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getTranslatedElements().add(tType);
		return new Object[] { ruleresult, mTypeToTType, mType, mBodyToTAnnotation, tType };
	}

	public static final Object[] pattern_TypesOrphaned_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject mModel, EObject mTypeToTType, EObject mModelToTypeGraph,
			EObject mType, EObject pg, EObject mBodyToTAnnotation, EObject tType) {
		if (!mModel.equals(mTypeToTType)) {
			if (!mModel.equals(mModelToTypeGraph)) {
				if (!mModel.equals(mType)) {
					if (!mModel.equals(pg)) {
						if (!mModel.equals(tType)) {
							if (!mTypeToTType.equals(pg)) {
								if (!mTypeToTType.equals(tType)) {
									if (!mModelToTypeGraph.equals(mTypeToTType)) {
										if (!mModelToTypeGraph.equals(mType)) {
											if (!mModelToTypeGraph.equals(pg)) {
												if (!mModelToTypeGraph.equals(tType)) {
													if (!mType.equals(mTypeToTType)) {
														if (!mType.equals(pg)) {
															if (!mType.equals(tType)) {
																if (!pg.equals(tType)) {
																	if (!mBodyToTAnnotation.equals(mModel)) {
																		if (!mBodyToTAnnotation.equals(mTypeToTType)) {
																			if (!mBodyToTAnnotation
																					.equals(mModelToTypeGraph)) {
																				if (!mBodyToTAnnotation.equals(mType)) {
																					if (!mBodyToTAnnotation
																							.equals(pg)) {
																						if (!mBodyToTAnnotation
																								.equals(tType)) {
																							return new Object[] {
																									ruleresult, mModel,
																									mTypeToTType,
																									mModelToTypeGraph,
																									mType, pg,
																									mBodyToTAnnotation,
																									tType };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypesOrphaned_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject mModel, EObject mTypeToTType, EObject mType, EObject pg,
			EObject mBodyToTAnnotation, EObject tType) {
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypesOrphaned";
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		String mTypeToTType__mType____source_name_prime = "source";
		String mBodyToTAnnotation__mType____source_name_prime = "source";
		String mBodyToTAnnotation__tType____target_name_prime = "target";
		String mTypeToTType__tType____target_name_prime = "target";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		ruleresult.getCreatedEdges().add(mModel__mType____orphanTypes);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mTypeToTType__mType____source);
		mBodyToTAnnotation__mType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mType____source);
		mBodyToTAnnotation__tType____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tType____target);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mTypeToTType__tType____target);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(pg__tType____ownedTypes);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tType__pg____pg);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mBodyToTAnnotation__mType____source.setName(mBodyToTAnnotation__mType____source_name_prime);
		mBodyToTAnnotation__tType____target.setName(mBodyToTAnnotation__tType____target_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		return new Object[] { ruleresult, mModel, mTypeToTType, mType, pg, mBodyToTAnnotation, tType,
				mModel__mType____orphanTypes, mTypeToTType__mType____source, mBodyToTAnnotation__mType____source,
				mBodyToTAnnotation__tType____target, mTypeToTType__tType____target, pg__tType____ownedTypes,
				tType__pg____pg };
	}

	public static final void pattern_TypesOrphaned_11_5_registerobjects_expressionBBBBBBBBB(TypesOrphaned _this,
			PerformRuleResult ruleresult, EObject mModel, EObject mTypeToTType, EObject mModelToTypeGraph,
			EObject mType, EObject pg, EObject mBodyToTAnnotation, EObject tType) {
		_this.registerObjects_BWD(ruleresult, mModel, mTypeToTType, mModelToTypeGraph, mType, pg, mBodyToTAnnotation,
				tType);

	}

	public static final PerformRuleResult pattern_TypesOrphaned_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_12_1_preparereturnvalue_bindingFB(TypesOrphaned _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_12_1_preparereturnvalue_blackFBB(EClass eClass,
			TypesOrphaned _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_12_1_preparereturnvalue_bindingAndBlackFFB(TypesOrphaned _this) {
		Object[] result_pattern_TypesOrphaned_12_1_preparereturnvalue_binding = pattern_TypesOrphaned_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypesOrphaned_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypesOrphaned_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypesOrphaned_12_1_preparereturnvalue_black = pattern_TypesOrphaned_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypesOrphaned_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypesOrphaned_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypesOrphaned";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypesOrphaned_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("pg");
		EObject _localVariable_1 = match.getObject("tType");
		EObject tmpPg = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			if (tmpTType instanceof TClass) {
				TClass tType = (TClass) tmpTType;
				return new Object[] { pg, tType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_12_2_corematch_blackFFBBB(TypeGraph pg, TClass tType,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pg,
				ModelToTypeGraph.class, "target")) {
			Model mModel = mModelToTypeGraph.getSource();
			if (mModel != null) {
				_result.add(new Object[] { mModel, mModelToTypeGraph, pg, tType, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_12_3_findcontext_blackBBBB(Model mModel,
			ModelToTypeGraph mModelToTypeGraph, TypeGraph pg, TClass tType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mModel.equals(mModelToTypeGraph.getSource())) {
			if (pg.equals(mModelToTypeGraph.getTarget())) {
				if (pg.getOwnedTypes().contains(tType)) {
					_result.add(new Object[] { mModel, mModelToTypeGraph, pg, tType });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_12_3_findcontext_greenBBBBFFFFF(Model mModel,
			ModelToTypeGraph mModelToTypeGraph, TypeGraph pg, TClass tType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mModelToTypeGraph__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mModelToTypeGraph__mModel____source_name_prime = "source";
		String mModelToTypeGraph__pg____target_name_prime = "target";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		isApplicableMatch.getAllContextElements().add(mModel);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(tType);
		mModelToTypeGraph__mModel____source.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__mModel____source.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__mModel____source);
		mModelToTypeGraph__pg____target.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__pg____target);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____ownedTypes);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tType__pg____pg);
		mModelToTypeGraph__mModel____source.setName(mModelToTypeGraph__mModel____source_name_prime);
		mModelToTypeGraph__pg____target.setName(mModelToTypeGraph__pg____target_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		return new Object[] { mModel, mModelToTypeGraph, pg, tType, isApplicableMatch,
				mModelToTypeGraph__mModel____source, mModelToTypeGraph__pg____target, pg__tType____ownedTypes,
				tType__pg____pg };
	}

	public static final Object[] pattern_TypesOrphaned_12_4_solveCSP_bindingFBBBBBB(TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch, Model mModel, ModelToTypeGraph mModelToTypeGraph, TypeGraph pg,
			TClass tType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mModel, mModelToTypeGraph, pg, tType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mModel, mModelToTypeGraph, pg, tType };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesOrphaned_12_4_solveCSP_bindingAndBlackFBBBBBB(TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch, Model mModel, ModelToTypeGraph mModelToTypeGraph, TypeGraph pg,
			TClass tType) {
		Object[] result_pattern_TypesOrphaned_12_4_solveCSP_binding = pattern_TypesOrphaned_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mModel, mModelToTypeGraph, pg, tType);
		if (result_pattern_TypesOrphaned_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesOrphaned_12_4_solveCSP_binding[0];

			Object[] result_pattern_TypesOrphaned_12_4_solveCSP_black = pattern_TypesOrphaned_12_4_solveCSP_blackB(csp);
			if (result_pattern_TypesOrphaned_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mModel, mModelToTypeGraph, pg, tType };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_12_5_checkCSP_expressionFBB(TypesOrphaned _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypesOrphaned_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypesOrphaned";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypesOrphaned_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_20_1_preparereturnvalue_bindingFB(TypesOrphaned _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypesOrphaned _this) {
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

	public static final Object[] pattern_TypesOrphaned_20_1_preparereturnvalue_bindingAndBlackFFBF(
			TypesOrphaned _this) {
		Object[] result_pattern_TypesOrphaned_20_1_preparereturnvalue_binding = pattern_TypesOrphaned_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypesOrphaned_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypesOrphaned_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypesOrphaned_20_1_preparereturnvalue_black = pattern_TypesOrphaned_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypesOrphaned_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypesOrphaned_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypesOrphaned_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TypesOrphaned_20_2_testcorematchandDECs_black_nac_0B(TClass tType) {
		for (TPackage __DEC_tType_classes_112382 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TPackage.class, "classes")) {
			return new Object[] { tType };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_20_2_testcorematchandDECs_black_nac_1BB(TClass tType,
			TypeGraph pg) {
		for (TypeGraph __DEC_tType_classes_63643 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tType_classes_63643)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_20_2_testcorematchandDECs_black_nac_2B(TClass tType) {
		TPackage __DEC_tType_ownedTypes_916338 = tType.getPackage();
		if (__DEC_tType_ownedTypes_916338 != null) {
			return new Object[] { tType };
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_20_2_testcorematchandDECs_black_nac_3B(TClass tType) {
		TAbstractType __DEC_tType_innerTypes_25060 = tType.getOuterType();
		if (__DEC_tType_innerTypes_25060 != null) {
			if (!tType.equals(__DEC_tType_innerTypes_25060)) {
				return new Object[] { tType };
			}
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_20_2_testcorematchandDECs_black_nac_4BB(TypeGraph pg,
			TClass tType) {
		if (pg.getClasses().contains(tType)) {
			return new Object[] { pg, tType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPg = _edge_ownedTypes.getSrc();
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			EObject tmpTType = _edge_ownedTypes.getTrg();
			if (tmpTType instanceof TClass) {
				TClass tType = (TClass) tmpTType;
				if (pg.getOwnedTypes().contains(tType)) {
					if (pattern_TypesOrphaned_20_2_testcorematchandDECs_black_nac_0B(tType) == null) {
						if (pattern_TypesOrphaned_20_2_testcorematchandDECs_black_nac_1BB(tType, pg) == null) {
							if (pattern_TypesOrphaned_20_2_testcorematchandDECs_black_nac_2B(tType) == null) {
								if (pattern_TypesOrphaned_20_2_testcorematchandDECs_black_nac_3B(tType) == null) {
									if (pattern_TypesOrphaned_20_2_testcorematchandDECs_black_nac_4BB(pg,
											tType) == null) {
										_result.add(new Object[] { pg, tType, _edge_ownedTypes });
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

	public static final Object[] pattern_TypesOrphaned_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypesOrphaned_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			TypesOrphaned _this, Match match, TypeGraph pg, TClass tType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pg, tType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypesOrphaned_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypesOrphaned _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypesOrphaned_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_21_1_preparereturnvalue_bindingFB(TypesOrphaned _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypesOrphaned _this) {
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

	public static final Object[] pattern_TypesOrphaned_21_1_preparereturnvalue_bindingAndBlackFFBF(
			TypesOrphaned _this) {
		Object[] result_pattern_TypesOrphaned_21_1_preparereturnvalue_binding = pattern_TypesOrphaned_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypesOrphaned_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypesOrphaned_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypesOrphaned_21_1_preparereturnvalue_black = pattern_TypesOrphaned_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypesOrphaned_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypesOrphaned_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypesOrphaned_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TypesOrphaned_21_2_testcorematchandDECs_black_nac_0B(MClass mType) {
		AbstractTypeDeclaration __DEC_mType_abstractTypeDeclaration_470072 = mType.getAbstractTypeDeclaration();
		if (__DEC_mType_abstractTypeDeclaration_470072 != null) {
			if (!mType.equals(__DEC_mType_abstractTypeDeclaration_470072)) {
				return new Object[] { mType };
			}
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_21_2_testcorematchandDECs_black_nac_1B(MClass mType) {
		AnonymousClassDeclaration __DEC_mType_anonymousClassDeclarationOwner_829002 = mType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mType_anonymousClassDeclarationOwner_829002 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_21_2_testcorematchandDECs_black_nac_2B(MClass mType) {
		org.eclipse.modisco.java.Package __DEC_mType_ownedElements_534251 = mType.getPackage();
		if (__DEC_mType_ownedElements_534251 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_21_2_testcorematchandDECs_black_nac_3B(MClass mType) {
		for (MAbstractMethodDefinition __DEC_mType_mInnerTypes_106863 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_orphanTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMModel = _edge_orphanTypes.getSrc();
		if (tmpMModel instanceof Model) {
			Model mModel = (Model) tmpMModel;
			EObject tmpMType = _edge_orphanTypes.getTrg();
			if (tmpMType instanceof MClass) {
				MClass mType = (MClass) tmpMType;
				if (mModel.getOrphanTypes().contains(mType)) {
					if (pattern_TypesOrphaned_21_2_testcorematchandDECs_black_nac_0B(mType) == null) {
						if (pattern_TypesOrphaned_21_2_testcorematchandDECs_black_nac_1B(mType) == null) {
							if (pattern_TypesOrphaned_21_2_testcorematchandDECs_black_nac_2B(mType) == null) {
								if (pattern_TypesOrphaned_21_2_testcorematchandDECs_black_nac_3B(mType) == null) {
									_result.add(new Object[] { mModel, mType, _edge_orphanTypes });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypesOrphaned_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			TypesOrphaned _this, Match match, Model mModel, MClass mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mModel, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypesOrphaned_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypesOrphaned _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypesOrphaned_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_24_1_prepare_blackB(TypesOrphaned _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypesOrphaned_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_TypesOrphaned_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mModel");
		EObject _localVariable_1 = sourceMatch.getObject("mType");
		EObject _localVariable_2 = targetMatch.getObject("pg");
		EObject _localVariable_3 = targetMatch.getObject("tType");
		EObject tmpMModel = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		EObject tmpTType = _localVariable_3;
		if (tmpMModel instanceof Model) {
			Model mModel = (Model) tmpMModel;
			if (tmpMType instanceof MClass) {
				MClass mType = (MClass) tmpMType;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					if (tmpTType instanceof TClass) {
						TClass tType = (TClass) tmpTType;
						return new Object[] { mModel, mType, pg, tType, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_24_2_matchsrctrgcontext_blackBBBBBB(Model mModel, MClass mType,
			TypeGraph pg, TClass tType, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { mModel, mType, pg, tType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding = pattern_TypesOrphaned_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding != null) {
			Model mModel = (Model) result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding[0];
			MClass mType = (MClass) result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding[1];
			TypeGraph pg = (TypeGraph) result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding[2];
			TClass tType = (TClass) result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_black = pattern_TypesOrphaned_24_2_matchsrctrgcontext_blackBBBBBB(
					mModel, mType, pg, tType, sourceMatch, targetMatch);
			if (result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mModel, mType, pg, tType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_24_3_solvecsp_bindingFBBBBBBB(TypesOrphaned _this, Model mModel,
			MClass mType, TypeGraph pg, TClass tType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(mModel, mType, pg, tType, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, mModel, mType, pg, tType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesOrphaned_24_3_solvecsp_bindingAndBlackFBBBBBBB(TypesOrphaned _this,
			Model mModel, MClass mType, TypeGraph pg, TClass tType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypesOrphaned_24_3_solvecsp_binding = pattern_TypesOrphaned_24_3_solvecsp_bindingFBBBBBBB(
				_this, mModel, mType, pg, tType, sourceMatch, targetMatch);
		if (result_pattern_TypesOrphaned_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypesOrphaned_24_3_solvecsp_binding[0];

			Object[] result_pattern_TypesOrphaned_24_3_solvecsp_black = pattern_TypesOrphaned_24_3_solvecsp_blackB(csp);
			if (result_pattern_TypesOrphaned_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mModel, mType, pg, tType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_24_5_matchcorrcontext_blackBFBBB(Model mModel,
			TypeGraph pg, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mModel, ModelToTypeGraph.class, "source")) {
				if (pg.equals(mModelToTypeGraph.getTarget())) {
					_result.add(new Object[] { mModel, mModelToTypeGraph, pg, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_24_5_matchcorrcontext_greenBBBF(
			ModelToTypeGraph mModelToTypeGraph, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "TypesOrphaned";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mModelToTypeGraph);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mModelToTypeGraph, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_TypesOrphaned_24_6_createcorrespondence_blackBBBBB(Model mModel, MClass mType,
			TypeGraph pg, TClass tType, CCMatch ccMatch) {
		return new Object[] { mModel, mType, pg, tType, ccMatch };
	}

	public static final Object[] pattern_TypesOrphaned_24_6_createcorrespondence_greenFBFBB(MClass mType, TClass tType,
			CCMatch ccMatch) {
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		mTypeToTType.setSource(mType);
		mTypeToTType.setTarget(tType);
		ccMatch.getCreateCorr().add(mTypeToTType);
		mBodyToTAnnotation.setSource(mType);
		mBodyToTAnnotation.setTarget(tType);
		ccMatch.getCreateCorr().add(mBodyToTAnnotation);
		return new Object[] { mTypeToTType, mType, mBodyToTAnnotation, tType, ccMatch };
	}

	public static final Object[] pattern_TypesOrphaned_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_TypesOrphaned_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "TypesOrphaned";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_TypesOrphaned_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_27_1_matchtggpattern_black_nac_0B(MClass mType) {
		AbstractTypeDeclaration __DEC_mType_abstractTypeDeclaration_952667 = mType.getAbstractTypeDeclaration();
		if (__DEC_mType_abstractTypeDeclaration_952667 != null) {
			if (!mType.equals(__DEC_mType_abstractTypeDeclaration_952667)) {
				return new Object[] { mType };
			}
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_27_1_matchtggpattern_black_nac_1B(MClass mType) {
		AnonymousClassDeclaration __DEC_mType_anonymousClassDeclarationOwner_86518 = mType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mType_anonymousClassDeclarationOwner_86518 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_27_1_matchtggpattern_black_nac_2B(MClass mType) {
		org.eclipse.modisco.java.Package __DEC_mType_ownedElements_482991 = mType.getPackage();
		if (__DEC_mType_ownedElements_482991 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_27_1_matchtggpattern_black_nac_3B(MClass mType) {
		for (MAbstractMethodDefinition __DEC_mType_mInnerTypes_88311 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_27_1_matchtggpattern_blackBB(Model mModel, MClass mType) {
		if (mModel.getOrphanTypes().contains(mType)) {
			if (pattern_TypesOrphaned_27_1_matchtggpattern_black_nac_0B(mType) == null) {
				if (pattern_TypesOrphaned_27_1_matchtggpattern_black_nac_1B(mType) == null) {
					if (pattern_TypesOrphaned_27_1_matchtggpattern_black_nac_2B(mType) == null) {
						if (pattern_TypesOrphaned_27_1_matchtggpattern_black_nac_3B(mType) == null) {
							return new Object[] { mModel, mType };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypesOrphaned_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_28_1_matchtggpattern_black_nac_0B(TClass tType) {
		for (TPackage __DEC_tType_classes_262651 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TPackage.class, "classes")) {
			return new Object[] { tType };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_28_1_matchtggpattern_black_nac_1BB(TClass tType, TypeGraph pg) {
		for (TypeGraph __DEC_tType_classes_383706 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tType_classes_383706)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_28_1_matchtggpattern_black_nac_2B(TClass tType) {
		TPackage __DEC_tType_ownedTypes_378780 = tType.getPackage();
		if (__DEC_tType_ownedTypes_378780 != null) {
			return new Object[] { tType };
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_28_1_matchtggpattern_black_nac_3B(TClass tType) {
		TAbstractType __DEC_tType_innerTypes_960396 = tType.getOuterType();
		if (__DEC_tType_innerTypes_960396 != null) {
			if (!tType.equals(__DEC_tType_innerTypes_960396)) {
				return new Object[] { tType };
			}
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_28_1_matchtggpattern_black_nac_4BB(TypeGraph pg, TClass tType) {
		if (pg.getClasses().contains(tType)) {
			return new Object[] { pg, tType };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_28_1_matchtggpattern_blackBB(TypeGraph pg, TClass tType) {
		if (pg.getOwnedTypes().contains(tType)) {
			if (pattern_TypesOrphaned_28_1_matchtggpattern_black_nac_0B(tType) == null) {
				if (pattern_TypesOrphaned_28_1_matchtggpattern_black_nac_1BB(tType, pg) == null) {
					if (pattern_TypesOrphaned_28_1_matchtggpattern_black_nac_2B(tType) == null) {
						if (pattern_TypesOrphaned_28_1_matchtggpattern_black_nac_3B(tType) == null) {
							if (pattern_TypesOrphaned_28_1_matchtggpattern_black_nac_4BB(pg, tType) == null) {
								return new Object[] { pg, tType };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypesOrphaned_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_29_1_createresult_blackB(TypesOrphaned _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypesOrphaned_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Model mModel) {
		if (ruleResult.getSourceObjects().contains(mModel)) {
			return new Object[] { ruleResult, mModel };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph mModelToTypeGraph) {
		if (ruleResult.getCorrObjects().contains(mModelToTypeGraph)) {
			return new Object[] { ruleResult, mModelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mModelToTypeGraphList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMModelToTypeGraph : mModelToTypeGraphList.getEntryObjects()) {
				if (tmpMModelToTypeGraph instanceof ModelToTypeGraph) {
					ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) tmpMModelToTypeGraph;
					Model mModel = mModelToTypeGraph.getSource();
					if (mModel != null) {
						TypeGraph pg = mModelToTypeGraph.getTarget();
						if (pg != null) {
							if (pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									mModelToTypeGraph) == null) {
								if (pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										mModel) == null) {
									if (pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											pg) == null) {
										_result.add(new Object[] { mModelToTypeGraphList, mModel, mModelToTypeGraph, pg,
												ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_TypesOrphaned_29_3_solveCSP_bindingFBBBBBB(TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch, Model mModel, ModelToTypeGraph mModelToTypeGraph, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mModel, mModelToTypeGraph, pg,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mModel, mModelToTypeGraph, pg, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesOrphaned_29_3_solveCSP_bindingAndBlackFBBBBBB(TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch, Model mModel, ModelToTypeGraph mModelToTypeGraph, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypesOrphaned_29_3_solveCSP_binding = pattern_TypesOrphaned_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mModel, mModelToTypeGraph, pg, ruleResult);
		if (result_pattern_TypesOrphaned_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesOrphaned_29_3_solveCSP_binding[0];

			Object[] result_pattern_TypesOrphaned_29_3_solveCSP_black = pattern_TypesOrphaned_29_3_solveCSP_blackB(csp);
			if (result_pattern_TypesOrphaned_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mModel, mModelToTypeGraph, pg, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_29_4_checkCSP_expressionFBB(TypesOrphaned _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_29_5_checknacs_blackBBB(Model mModel,
			ModelToTypeGraph mModelToTypeGraph, TypeGraph pg) {
		return new Object[] { mModel, mModelToTypeGraph, pg };
	}

	public static final Object[] pattern_TypesOrphaned_29_6_perform_blackBBBB(Model mModel,
			ModelToTypeGraph mModelToTypeGraph, TypeGraph pg, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mModel, mModelToTypeGraph, pg, ruleResult };
	}

	public static final Object[] pattern_TypesOrphaned_29_6_perform_greenBFFBFFBB(Model mModel, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		MClass mType = ModiscoFactory.eINSTANCE.createMClass();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TClass tType = BasicFactory.eINSTANCE.createTClass();
		Object _localVariable_0 = csp.getValue("mType", "proxy");
		Object _localVariable_1 = csp.getValue("tType", "tLib");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mTypeToTType);
		mModel.getOrphanTypes().add(mType);
		mTypeToTType.setSource(mType);
		ruleResult.getSourceObjects().add(mType);
		mBodyToTAnnotation.setSource(mType);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		mBodyToTAnnotation.setTarget(tType);
		mTypeToTType.setTarget(tType);
		pg.getOwnedTypes().add(tType);
		ruleResult.getTargetObjects().add(tType);
		boolean mType_proxy_prime = (boolean) _localVariable_0;
		boolean tType_tLib_prime = (boolean) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		mType.setProxy(Boolean.valueOf(mType_proxy_prime));
		tType.setTLib(Boolean.valueOf(tType_tLib_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mModel, mTypeToTType, mType, pg, mBodyToTAnnotation, tType, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_TypesOrphaned_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypesOrphanedImpl