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
	public boolean isAppropriate_FWD(Match match, MClass mType, Model mModel) {

		Object[] result1_black = TypesOrphanedImpl.pattern_TypesOrphaned_0_1_initialbindings_blackBBBB(this, match,
				mType, mModel);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mType] = " + mType + ", " + "[mModel] = " + mModel + ".");
		}

		Object[] result2_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mType, mModel);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mType] = " + mType + ", " + "[mModel] = " + mModel + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypesOrphanedImpl.pattern_TypesOrphaned_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypesOrphanedImpl
					.pattern_TypesOrphaned_0_4_collectelementstobetranslated_blackBBB(match, mType, mModel);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mType] = " + mType + ", " + "[mModel] = " + mModel + ".");
			}
			TypesOrphanedImpl.pattern_TypesOrphaned_0_4_collectelementstobetranslated_greenBBBF(match, mType, mModel);
			//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result4_green[3];

			Object[] result5_black = TypesOrphanedImpl.pattern_TypesOrphaned_0_5_collectcontextelements_blackBBB(match,
					mType, mModel);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mType] = " + mType + ", " + "[mModel] = " + mModel + ".");
			}
			TypesOrphanedImpl.pattern_TypesOrphaned_0_5_collectcontextelements_greenBB(match, mModel);

			// 
			TypesOrphanedImpl.pattern_TypesOrphaned_0_6_registerobjectstomatch_expressionBBBB(this, match, mType,
					mModel);
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
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[0];
		MClass mType = (MClass) result1_bindingAndBlack[1];
		Model mModel = (Model) result1_bindingAndBlack[2];
		ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = TypesOrphanedImpl.pattern_TypesOrphaned_1_1_performtransformation_greenBFFBFB(pg,
				mType, csp);
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_green[1];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[2];
		TClass tType = (TClass) result1_green[4];

		Object[] result2_black = TypesOrphanedImpl.pattern_TypesOrphaned_1_2_collecttranslatedelements_blackBBBB(
				mTypeToTType, mBodyToTAnnotation, mType, tType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = " + mTypeToTType
					+ ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mType] = " + mType + ", "
					+ "[tType] = " + tType + ".");
		}
		Object[] result2_green = TypesOrphanedImpl.pattern_TypesOrphaned_1_2_collecttranslatedelements_greenFBBBB(
				mTypeToTType, mBodyToTAnnotation, mType, tType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypesOrphanedImpl.pattern_TypesOrphaned_1_3_bookkeepingforedges_blackBBBBBBBB(
				ruleresult, pg, mTypeToTType, mBodyToTAnnotation, mType, mModel, tType, mModelToTypeGraph);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[pg] = " + pg
							+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mBodyToTAnnotation] = "
							+ mBodyToTAnnotation + ", " + "[mType] = " + mType + ", " + "[mModel] = " + mModel + ", "
							+ "[tType] = " + tType + ", " + "[mModelToTypeGraph] = " + mModelToTypeGraph + ".");
		}
		TypesOrphanedImpl.pattern_TypesOrphaned_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult, pg,
				mTypeToTType, mBodyToTAnnotation, mType, mModel, tType);
		//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mBodyToTAnnotation__mType____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mBodyToTAnnotation__tType____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[13];

		// 
		// 
		TypesOrphanedImpl.pattern_TypesOrphaned_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, pg,
				mTypeToTType, mBodyToTAnnotation, mType, mModel, tType, mModelToTypeGraph);
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
		MClass mType = (MClass) result2_binding[0];
		Model mModel = (Model) result2_binding[1];
		for (Object[] result2_black : TypesOrphanedImpl.pattern_TypesOrphaned_2_2_corematch_blackFBBFB(mType, mModel,
				match)) {
			TypeGraph pg = (TypeGraph) result2_black[0];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[3];
			// ForEach 
			for (Object[] result3_black : TypesOrphanedImpl.pattern_TypesOrphaned_2_3_findcontext_blackBBBB(pg, mType,
					mModel, mModelToTypeGraph)) {
				Object[] result3_green = TypesOrphanedImpl.pattern_TypesOrphaned_2_3_findcontext_greenBBBBFFFF(pg,
						mType, mModel, mModelToTypeGraph);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mModelToTypeGraph__pg____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mModelToTypeGraph__mModel____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = TypesOrphanedImpl
						.pattern_TypesOrphaned_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, pg, mType,
								mModel, mModelToTypeGraph);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pg] = " + pg + ", " + "[mType] = "
							+ mType + ", " + "[mModel] = " + mModel + ", " + "[mModelToTypeGraph] = "
							+ mModelToTypeGraph + ".");
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
	public void registerObjectsToMatch_FWD(Match match, MClass mType, Model mModel) {
		match.registerObject("mType", mType);
		match.registerObject("mModel", mModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MClass mType, Model mModel) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeGraph pg, MClass mType, Model mModel,
			ModelToTypeGraph mModelToTypeGraph) {// Create CSP
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
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject pg, EObject mTypeToTType,
			EObject mBodyToTAnnotation, EObject mType, EObject mModel, EObject tType, EObject mModelToTypeGraph) {
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mModelToTypeGraph", mModelToTypeGraph);

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
			//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result4_green[4];

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
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[0];
		Model mModel = (Model) result1_bindingAndBlack[1];
		TClass tType = (TClass) result1_bindingAndBlack[2];
		ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = TypesOrphanedImpl.pattern_TypesOrphaned_11_1_performtransformation_greenFFFBBB(mModel,
				tType, csp);
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_green[0];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[1];
		MClass mType = (MClass) result1_green[2];

		Object[] result2_black = TypesOrphanedImpl.pattern_TypesOrphaned_11_2_collecttranslatedelements_blackBBBB(
				mTypeToTType, mBodyToTAnnotation, mType, tType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = " + mTypeToTType
					+ ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mType] = " + mType + ", "
					+ "[tType] = " + tType + ".");
		}
		Object[] result2_green = TypesOrphanedImpl.pattern_TypesOrphaned_11_2_collecttranslatedelements_greenFBBBB(
				mTypeToTType, mBodyToTAnnotation, mType, tType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypesOrphanedImpl.pattern_TypesOrphaned_11_3_bookkeepingforedges_blackBBBBBBBB(
				ruleresult, pg, mTypeToTType, mBodyToTAnnotation, mType, mModel, tType, mModelToTypeGraph);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[pg] = " + pg
							+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mBodyToTAnnotation] = "
							+ mBodyToTAnnotation + ", " + "[mType] = " + mType + ", " + "[mModel] = " + mModel + ", "
							+ "[tType] = " + tType + ", " + "[mModelToTypeGraph] = " + mModelToTypeGraph + ".");
		}
		TypesOrphanedImpl.pattern_TypesOrphaned_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult, pg,
				mTypeToTType, mBodyToTAnnotation, mType, mModel, tType);
		//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mBodyToTAnnotation__mType____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mBodyToTAnnotation__tType____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[13];

		// 
		// 
		TypesOrphanedImpl.pattern_TypesOrphaned_11_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, pg,
				mTypeToTType, mBodyToTAnnotation, mType, mModel, tType, mModelToTypeGraph);
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
		for (Object[] result2_black : TypesOrphanedImpl.pattern_TypesOrphaned_12_2_corematch_blackBFBFB(pg, tType,
				match)) {
			Model mModel = (Model) result2_black[1];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[3];
			// ForEach 
			for (Object[] result3_black : TypesOrphanedImpl.pattern_TypesOrphaned_12_3_findcontext_blackBBBB(pg, mModel,
					tType, mModelToTypeGraph)) {
				Object[] result3_green = TypesOrphanedImpl.pattern_TypesOrphaned_12_3_findcontext_greenBBBBFFFFF(pg,
						mModel, tType, mModelToTypeGraph);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mModelToTypeGraph__pg____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mModelToTypeGraph__mModel____source = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = TypesOrphanedImpl
						.pattern_TypesOrphaned_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, pg, mModel,
								tType, mModelToTypeGraph);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pg] = " + pg + ", "
							+ "[mModel] = " + mModel + ", " + "[tType] = " + tType + ", " + "[mModelToTypeGraph] = "
							+ mModelToTypeGraph + ".");
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph pg, Model mModel, TClass tType,
			ModelToTypeGraph mModelToTypeGraph) {// Create CSP
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
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject pg, EObject mTypeToTType,
			EObject mBodyToTAnnotation, EObject mType, EObject mModel, EObject tType, EObject mModelToTypeGraph) {
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mModelToTypeGraph", mModelToTypeGraph);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_0(EMoflonEdge _edge_ownedTypes) {

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_0(EMoflonEdge _edge_orphanTypes) {

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
			MClass mType = (MClass) result2_black[0];
			Model mModel = (Model) result2_black[1];
			Object[] result2_green = TypesOrphanedImpl
					.pattern_TypesOrphaned_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypesOrphanedImpl.pattern_TypesOrphaned_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
					this, match, mType, mModel)) {
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

		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_proxy.setValue(__helper.getValue("mType", "proxy"));
		var_mType_proxy.setType("boolean");

		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tLib.setValue(__helper.getValue("tType", "tLib"));
		var_tType_tLib.setType("boolean");

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

		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_proxy.setValue(__helper.getValue("mType", "proxy"));
		var_mType_proxy.setType("boolean");

		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tLib.setValue(__helper.getValue("tType", "tLib"));
		var_tType_tLib.setType("boolean");

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
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[0];
		MClass mType = (MClass) result2_bindingAndBlack[1];
		Model mModel = (Model) result2_bindingAndBlack[2];
		TClass tType = (TClass) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, pg, mType, mModel, tType,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[pg] = " + pg + ", " + "[mType] = " + mType + ", " + "[mModel] = " + mModel + ", " + "[tType] = "
					+ tType + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypesOrphanedImpl.pattern_TypesOrphaned_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypesOrphanedImpl.pattern_TypesOrphaned_24_5_matchcorrcontext_blackBBFBB(pg,
					mModel, sourceMatch, targetMatch)) {
				ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result5_black[2];
				Object[] result5_green = TypesOrphanedImpl.pattern_TypesOrphaned_24_5_matchcorrcontext_greenBBBF(
						mModelToTypeGraph, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = TypesOrphanedImpl
						.pattern_TypesOrphaned_24_6_createcorrespondence_blackBBBBB(pg, mType, mModel, tType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pg] = " + pg + ", "
							+ "[mType] = " + mType + ", " + "[mModel] = " + mModel + ", " + "[tType] = " + tType + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				TypesOrphanedImpl.pattern_TypesOrphaned_24_6_createcorrespondence_greenFFBBB(mType, tType, ccMatch);
				//nothing TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result6_green[0];
				//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[1];

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
	public CSP isApplicable_solveCsp_CC(TypeGraph pg, MClass mType, Model mModel, TClass tType, Match sourceMatch,
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
	public boolean checkDEC_FWD(MClass mType, Model mModel) {// 
		Object[] result1_black = TypesOrphanedImpl.pattern_TypesOrphaned_27_1_matchtggpattern_blackBB(mType, mModel);
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
			TypeGraph pg = (TypeGraph) result2_black[1];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[2];
			Model mModel = (Model) result2_black[3];

			Object[] result3_bindingAndBlack = TypesOrphanedImpl
					.pattern_TypesOrphaned_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, pg, mModel,
							mModelToTypeGraph, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pg] = " + pg + ", " + "[mModel] = "
						+ mModel + ", " + "[mModelToTypeGraph] = " + mModelToTypeGraph + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypesOrphanedImpl.pattern_TypesOrphaned_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = TypesOrphanedImpl.pattern_TypesOrphaned_29_5_checknacs_blackBBB(pg, mModel,
						mModelToTypeGraph);
				if (result5_black != null) {

					Object[] result6_black = TypesOrphanedImpl.pattern_TypesOrphaned_29_6_perform_blackBBBB(pg, mModel,
							mModelToTypeGraph, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pg] = " + pg + ", "
								+ "[mModel] = " + mModel + ", " + "[mModelToTypeGraph] = " + mModelToTypeGraph + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					TypesOrphanedImpl.pattern_TypesOrphaned_29_6_perform_greenBFFFBFBB(pg, mModel, ruleResult, csp);
					//nothing TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result6_green[1];
					//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[2];
					//nothing MClass mType = (MClass) result6_green[3];
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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph pg, Model mModel,
			ModelToTypeGraph mModelToTypeGraph, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
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
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_FWD__MATCH_MCLASS_MODEL:
			return isAppropriate_FWD((Match) arguments.get(0), (MClass) arguments.get(1), (Model) arguments.get(2));
		case RulesPackage.TYPES_ORPHANED___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MCLASS_MODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MClass) arguments.get(1), (Model) arguments.get(2));
			return null;
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MCLASS_MODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MClass) arguments.get(1),
					(Model) arguments.get(2));
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPEGRAPH_MCLASS_MODEL_MODELTOTYPEGRAPH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(MClass) arguments.get(2), (Model) arguments.get(3), (ModelToTypeGraph) arguments.get(4));
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
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_MODEL_TCLASS_MODELTOTYPEGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(Model) arguments.get(2), (TClass) arguments.get(3), (ModelToTypeGraph) arguments.get(4));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.TYPES_ORPHANED___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_0((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_0((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_SOLVE_CSP_CC__TYPEGRAPH_MCLASS_MODEL_TCLASS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TypeGraph) arguments.get(0), (MClass) arguments.get(1),
					(Model) arguments.get(2), (TClass) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___CHECK_DEC_FWD__MCLASS_MODEL:
			return checkDEC_FWD((MClass) arguments.get(0), (Model) arguments.get(1));
		case RulesPackage.TYPES_ORPHANED___CHECK_DEC_BWD__TYPEGRAPH_TCLASS:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TClass) arguments.get(1));
		case RulesPackage.TYPES_ORPHANED___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.TYPES_ORPHANED___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_MODEL_MODELTOTYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(Model) arguments.get(2), (ModelToTypeGraph) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.TYPES_ORPHANED___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypesOrphaned_0_1_initialbindings_blackBBBB(TypesOrphaned _this, Match match,
			MClass mType, Model mModel) {
		return new Object[] { _this, match, mType, mModel };
	}

	public static final Object[] pattern_TypesOrphaned_0_2_SolveCSP_bindingFBBBB(TypesOrphaned _this, Match match,
			MClass mType, Model mModel) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mType, mModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mType, mModel };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesOrphaned_0_2_SolveCSP_bindingAndBlackFBBBB(TypesOrphaned _this,
			Match match, MClass mType, Model mModel) {
		Object[] result_pattern_TypesOrphaned_0_2_SolveCSP_binding = pattern_TypesOrphaned_0_2_SolveCSP_bindingFBBBB(
				_this, match, mType, mModel);
		if (result_pattern_TypesOrphaned_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesOrphaned_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypesOrphaned_0_2_SolveCSP_black = pattern_TypesOrphaned_0_2_SolveCSP_blackB(csp);
			if (result_pattern_TypesOrphaned_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mType, mModel };
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
			MClass mType, Model mModel) {
		return new Object[] { match, mType, mModel };
	}

	public static final Object[] pattern_TypesOrphaned_0_4_collectelementstobetranslated_greenBBBF(Match match,
			MClass mType, Model mModel) {
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mType);
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		match.getToBeTranslatedEdges().add(mModel__mType____orphanTypes);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		return new Object[] { match, mType, mModel, mModel__mType____orphanTypes };
	}

	public static final Object[] pattern_TypesOrphaned_0_5_collectcontextelements_blackBBB(Match match, MClass mType,
			Model mModel) {
		return new Object[] { match, mType, mModel };
	}

	public static final Object[] pattern_TypesOrphaned_0_5_collectcontextelements_greenBB(Match match, Model mModel) {
		match.getContextNodes().add(mModel);
		return new Object[] { match, mModel };
	}

	public static final void pattern_TypesOrphaned_0_6_registerobjectstomatch_expressionBBBB(TypesOrphaned _this,
			Match match, MClass mType, Model mModel) {
		_this.registerObjectsToMatch_FWD(match, mType, mModel);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("pg");
		EObject _localVariable_1 = isApplicableMatch.getObject("mType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mModel");
		EObject _localVariable_3 = isApplicableMatch.getObject("mModelToTypeGraph");
		EObject tmpPg = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		EObject tmpMModel = _localVariable_2;
		EObject tmpMModelToTypeGraph = _localVariable_3;
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			if (tmpMType instanceof MClass) {
				MClass mType = (MClass) tmpMType;
				if (tmpMModel instanceof Model) {
					Model mModel = (Model) tmpMModel;
					if (tmpMModelToTypeGraph instanceof ModelToTypeGraph) {
						ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) tmpMModelToTypeGraph;
						return new Object[] { pg, mType, mModel, mModelToTypeGraph, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_1_1_performtransformation_blackBBBBFBB(TypeGraph pg,
			MClass mType, Model mModel, ModelToTypeGraph mModelToTypeGraph, TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { pg, mType, mModel, mModelToTypeGraph, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_1_1_performtransformation_bindingAndBlackFFFFFBB(
			TypesOrphaned _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypesOrphaned_1_1_performtransformation_binding = pattern_TypesOrphaned_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_TypesOrphaned_1_1_performtransformation_binding != null) {
			TypeGraph pg = (TypeGraph) result_pattern_TypesOrphaned_1_1_performtransformation_binding[0];
			MClass mType = (MClass) result_pattern_TypesOrphaned_1_1_performtransformation_binding[1];
			Model mModel = (Model) result_pattern_TypesOrphaned_1_1_performtransformation_binding[2];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result_pattern_TypesOrphaned_1_1_performtransformation_binding[3];

			Object[] result_pattern_TypesOrphaned_1_1_performtransformation_black = pattern_TypesOrphaned_1_1_performtransformation_blackBBBBFBB(
					pg, mType, mModel, mModelToTypeGraph, _this, isApplicableMatch);
			if (result_pattern_TypesOrphaned_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypesOrphaned_1_1_performtransformation_black[4];

				return new Object[] { pg, mType, mModel, mModelToTypeGraph, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_1_1_performtransformation_greenBFFBFB(TypeGraph pg, MClass mType,
			CSP csp) {
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TClass tType = BasicFactory.eINSTANCE.createTClass();
		Object _localVariable_0 = csp.getValue("tType", "tLib");
		mTypeToTType.setSource(mType);
		mBodyToTAnnotation.setSource(mType);
		pg.getOwnedTypes().add(tType);
		mBodyToTAnnotation.setTarget(tType);
		mTypeToTType.setTarget(tType);
		boolean tType_tLib_prime = (boolean) _localVariable_0;
		tType.setTLib(Boolean.valueOf(tType_tLib_prime));
		return new Object[] { pg, mTypeToTType, mBodyToTAnnotation, mType, tType, csp };
	}

	public static final Object[] pattern_TypesOrphaned_1_2_collecttranslatedelements_blackBBBB(
			TypeToTAbstractType mTypeToTType, ASTNodeToTAnnotatable mBodyToTAnnotation, MClass mType, TClass tType) {
		return new Object[] { mTypeToTType, mBodyToTAnnotation, mType, tType };
	}

	public static final Object[] pattern_TypesOrphaned_1_2_collecttranslatedelements_greenFBBBB(
			TypeToTAbstractType mTypeToTType, ASTNodeToTAnnotatable mBodyToTAnnotation, MClass mType, TClass tType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getTranslatedElements().add(mType);
		ruleresult.getCreatedElements().add(tType);
		return new Object[] { ruleresult, mTypeToTType, mBodyToTAnnotation, mType, tType };
	}

	public static final Object[] pattern_TypesOrphaned_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject pg, EObject mTypeToTType, EObject mBodyToTAnnotation, EObject mType,
			EObject mModel, EObject tType, EObject mModelToTypeGraph) {
		if (!pg.equals(tType)) {
			if (!mTypeToTType.equals(pg)) {
				if (!mTypeToTType.equals(tType)) {
					if (!mBodyToTAnnotation.equals(pg)) {
						if (!mBodyToTAnnotation.equals(mTypeToTType)) {
							if (!mBodyToTAnnotation.equals(mType)) {
								if (!mBodyToTAnnotation.equals(mModel)) {
									if (!mBodyToTAnnotation.equals(tType)) {
										if (!mBodyToTAnnotation.equals(mModelToTypeGraph)) {
											if (!mType.equals(pg)) {
												if (!mType.equals(mTypeToTType)) {
													if (!mType.equals(tType)) {
														if (!mModel.equals(pg)) {
															if (!mModel.equals(mTypeToTType)) {
																if (!mModel.equals(mType)) {
																	if (!mModel.equals(tType)) {
																		if (!mModel.equals(mModelToTypeGraph)) {
																			if (!mModelToTypeGraph.equals(pg)) {
																				if (!mModelToTypeGraph
																						.equals(mTypeToTType)) {
																					if (!mModelToTypeGraph
																							.equals(mType)) {
																						if (!mModelToTypeGraph
																								.equals(tType)) {
																							return new Object[] {
																									ruleresult, pg,
																									mTypeToTType,
																									mBodyToTAnnotation,
																									mType, mModel,
																									tType,
																									mModelToTypeGraph };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject pg, EObject mTypeToTType, EObject mBodyToTAnnotation, EObject mType,
			EObject mModel, EObject tType) {
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypesOrphaned";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____model_name_prime = "model";
		String mTypeToTType__mType____source_name_prime = "source";
		String mBodyToTAnnotation__mType____source_name_prime = "source";
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		String mBodyToTAnnotation__tType____target_name_prime = "target";
		String mTypeToTType__tType____target_name_prime = "target";
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		ruleresult.getCreatedEdges().add(pg__tType____ownedTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		ruleresult.getCreatedEdges().add(tType__pg____model);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mTypeToTType__mType____source);
		mBodyToTAnnotation__mType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mType____source);
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mModel__mType____orphanTypes);
		mBodyToTAnnotation__tType____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tType____target);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mTypeToTType__tType____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mBodyToTAnnotation__mType____source.setName(mBodyToTAnnotation__mType____source_name_prime);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		mBodyToTAnnotation__tType____target.setName(mBodyToTAnnotation__tType____target_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		return new Object[] { ruleresult, pg, mTypeToTType, mBodyToTAnnotation, mType, mModel, tType,
				pg__tType____ownedTypes, tType__pg____model, mTypeToTType__mType____source,
				mBodyToTAnnotation__mType____source, mModel__mType____orphanTypes, mBodyToTAnnotation__tType____target,
				mTypeToTType__tType____target };
	}

	public static final void pattern_TypesOrphaned_1_5_registerobjects_expressionBBBBBBBBB(TypesOrphaned _this,
			PerformRuleResult ruleresult, EObject pg, EObject mTypeToTType, EObject mBodyToTAnnotation, EObject mType,
			EObject mModel, EObject tType, EObject mModelToTypeGraph) {
		_this.registerObjects_FWD(ruleresult, pg, mTypeToTType, mBodyToTAnnotation, mType, mModel, tType,
				mModelToTypeGraph);

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
		EObject _localVariable_0 = match.getObject("mType");
		EObject _localVariable_1 = match.getObject("mModel");
		EObject tmpMType = _localVariable_0;
		EObject tmpMModel = _localVariable_1;
		if (tmpMType instanceof MClass) {
			MClass mType = (MClass) tmpMType;
			if (tmpMModel instanceof Model) {
				Model mModel = (Model) tmpMModel;
				return new Object[] { mType, mModel, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_2_2_corematch_blackFBBFB(MClass mType, Model mModel,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mModel, ModelToTypeGraph.class, "source")) {
			TypeGraph pg = mModelToTypeGraph.getTarget();
			if (pg != null) {
				_result.add(new Object[] { pg, mType, mModel, mModelToTypeGraph, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_2_3_findcontext_blackBBBB(TypeGraph pg, MClass mType,
			Model mModel, ModelToTypeGraph mModelToTypeGraph) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mModel.getOrphanTypes().contains(mType)) {
			if (pg.equals(mModelToTypeGraph.getTarget())) {
				if (mModel.equals(mModelToTypeGraph.getSource())) {
					_result.add(new Object[] { pg, mType, mModel, mModelToTypeGraph });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_2_3_findcontext_greenBBBBFFFF(TypeGraph pg, MClass mType,
			Model mModel, ModelToTypeGraph mModelToTypeGraph) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		String mModelToTypeGraph__pg____target_name_prime = "target";
		String mModelToTypeGraph__mModel____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mModel);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph);
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mModel__mType____orphanTypes);
		mModelToTypeGraph__pg____target.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__pg____target);
		mModelToTypeGraph__mModel____source.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__mModel____source.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__mModel____source);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		mModelToTypeGraph__pg____target.setName(mModelToTypeGraph__pg____target_name_prime);
		mModelToTypeGraph__mModel____source.setName(mModelToTypeGraph__mModel____source_name_prime);
		return new Object[] { pg, mType, mModel, mModelToTypeGraph, isApplicableMatch, mModel__mType____orphanTypes,
				mModelToTypeGraph__pg____target, mModelToTypeGraph__mModel____source };
	}

	public static final Object[] pattern_TypesOrphaned_2_4_solveCSP_bindingFBBBBBB(TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch, TypeGraph pg, MClass mType, Model mModel,
			ModelToTypeGraph mModelToTypeGraph) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, pg, mType, mModel, mModelToTypeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pg, mType, mModel, mModelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesOrphaned_2_4_solveCSP_bindingAndBlackFBBBBBB(TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch, TypeGraph pg, MClass mType, Model mModel,
			ModelToTypeGraph mModelToTypeGraph) {
		Object[] result_pattern_TypesOrphaned_2_4_solveCSP_binding = pattern_TypesOrphaned_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, pg, mType, mModel, mModelToTypeGraph);
		if (result_pattern_TypesOrphaned_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesOrphaned_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypesOrphaned_2_4_solveCSP_black = pattern_TypesOrphaned_2_4_solveCSP_blackB(csp);
			if (result_pattern_TypesOrphaned_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pg, mType, mModel, mModelToTypeGraph };
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
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tType);
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____model_name_prime = "model";
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____ownedTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		match.getToBeTranslatedEdges().add(tType__pg____model);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		return new Object[] { match, pg, tType, pg__tType____ownedTypes, tType__pg____model };
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
		EObject _localVariable_0 = isApplicableMatch.getObject("pg");
		EObject _localVariable_1 = isApplicableMatch.getObject("mModel");
		EObject _localVariable_2 = isApplicableMatch.getObject("tType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mModelToTypeGraph");
		EObject tmpPg = _localVariable_0;
		EObject tmpMModel = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpMModelToTypeGraph = _localVariable_3;
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			if (tmpMModel instanceof Model) {
				Model mModel = (Model) tmpMModel;
				if (tmpTType instanceof TClass) {
					TClass tType = (TClass) tmpTType;
					if (tmpMModelToTypeGraph instanceof ModelToTypeGraph) {
						ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) tmpMModelToTypeGraph;
						return new Object[] { pg, mModel, tType, mModelToTypeGraph, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_11_1_performtransformation_blackBBBBFBB(TypeGraph pg,
			Model mModel, TClass tType, ModelToTypeGraph mModelToTypeGraph, TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { pg, mModel, tType, mModelToTypeGraph, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_11_1_performtransformation_bindingAndBlackFFFFFBB(
			TypesOrphaned _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypesOrphaned_11_1_performtransformation_binding = pattern_TypesOrphaned_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_TypesOrphaned_11_1_performtransformation_binding != null) {
			TypeGraph pg = (TypeGraph) result_pattern_TypesOrphaned_11_1_performtransformation_binding[0];
			Model mModel = (Model) result_pattern_TypesOrphaned_11_1_performtransformation_binding[1];
			TClass tType = (TClass) result_pattern_TypesOrphaned_11_1_performtransformation_binding[2];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result_pattern_TypesOrphaned_11_1_performtransformation_binding[3];

			Object[] result_pattern_TypesOrphaned_11_1_performtransformation_black = pattern_TypesOrphaned_11_1_performtransformation_blackBBBBFBB(
					pg, mModel, tType, mModelToTypeGraph, _this, isApplicableMatch);
			if (result_pattern_TypesOrphaned_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypesOrphaned_11_1_performtransformation_black[4];

				return new Object[] { pg, mModel, tType, mModelToTypeGraph, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_11_1_performtransformation_greenFFFBBB(Model mModel,
			TClass tType, CSP csp) {
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MClass mType = ModiscoFactory.eINSTANCE.createMClass();
		Object _localVariable_0 = csp.getValue("mType", "proxy");
		mTypeToTType.setTarget(tType);
		mBodyToTAnnotation.setTarget(tType);
		mTypeToTType.setSource(mType);
		mBodyToTAnnotation.setSource(mType);
		mModel.getOrphanTypes().add(mType);
		boolean mType_proxy_prime = (boolean) _localVariable_0;
		mType.setProxy(Boolean.valueOf(mType_proxy_prime));
		return new Object[] { mTypeToTType, mBodyToTAnnotation, mType, mModel, tType, csp };
	}

	public static final Object[] pattern_TypesOrphaned_11_2_collecttranslatedelements_blackBBBB(
			TypeToTAbstractType mTypeToTType, ASTNodeToTAnnotatable mBodyToTAnnotation, MClass mType, TClass tType) {
		return new Object[] { mTypeToTType, mBodyToTAnnotation, mType, tType };
	}

	public static final Object[] pattern_TypesOrphaned_11_2_collecttranslatedelements_greenFBBBB(
			TypeToTAbstractType mTypeToTType, ASTNodeToTAnnotatable mBodyToTAnnotation, MClass mType, TClass tType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedElements().add(mType);
		ruleresult.getTranslatedElements().add(tType);
		return new Object[] { ruleresult, mTypeToTType, mBodyToTAnnotation, mType, tType };
	}

	public static final Object[] pattern_TypesOrphaned_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject pg, EObject mTypeToTType, EObject mBodyToTAnnotation, EObject mType,
			EObject mModel, EObject tType, EObject mModelToTypeGraph) {
		if (!pg.equals(tType)) {
			if (!mTypeToTType.equals(pg)) {
				if (!mTypeToTType.equals(tType)) {
					if (!mBodyToTAnnotation.equals(pg)) {
						if (!mBodyToTAnnotation.equals(mTypeToTType)) {
							if (!mBodyToTAnnotation.equals(mType)) {
								if (!mBodyToTAnnotation.equals(mModel)) {
									if (!mBodyToTAnnotation.equals(tType)) {
										if (!mBodyToTAnnotation.equals(mModelToTypeGraph)) {
											if (!mType.equals(pg)) {
												if (!mType.equals(mTypeToTType)) {
													if (!mType.equals(tType)) {
														if (!mModel.equals(pg)) {
															if (!mModel.equals(mTypeToTType)) {
																if (!mModel.equals(mType)) {
																	if (!mModel.equals(tType)) {
																		if (!mModel.equals(mModelToTypeGraph)) {
																			if (!mModelToTypeGraph.equals(pg)) {
																				if (!mModelToTypeGraph
																						.equals(mTypeToTType)) {
																					if (!mModelToTypeGraph
																							.equals(mType)) {
																						if (!mModelToTypeGraph
																								.equals(tType)) {
																							return new Object[] {
																									ruleresult, pg,
																									mTypeToTType,
																									mBodyToTAnnotation,
																									mType, mModel,
																									tType,
																									mModelToTypeGraph };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject pg, EObject mTypeToTType, EObject mBodyToTAnnotation, EObject mType,
			EObject mModel, EObject tType) {
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypesOrphaned";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____model_name_prime = "model";
		String mTypeToTType__mType____source_name_prime = "source";
		String mBodyToTAnnotation__mType____source_name_prime = "source";
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		String mBodyToTAnnotation__tType____target_name_prime = "target";
		String mTypeToTType__tType____target_name_prime = "target";
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(pg__tType____ownedTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tType__pg____model);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mTypeToTType__mType____source);
		mBodyToTAnnotation__mType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mType____source);
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		ruleresult.getCreatedEdges().add(mModel__mType____orphanTypes);
		mBodyToTAnnotation__tType____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tType____target);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mTypeToTType__tType____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mBodyToTAnnotation__mType____source.setName(mBodyToTAnnotation__mType____source_name_prime);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		mBodyToTAnnotation__tType____target.setName(mBodyToTAnnotation__tType____target_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		return new Object[] { ruleresult, pg, mTypeToTType, mBodyToTAnnotation, mType, mModel, tType,
				pg__tType____ownedTypes, tType__pg____model, mTypeToTType__mType____source,
				mBodyToTAnnotation__mType____source, mModel__mType____orphanTypes, mBodyToTAnnotation__tType____target,
				mTypeToTType__tType____target };
	}

	public static final void pattern_TypesOrphaned_11_5_registerobjects_expressionBBBBBBBBB(TypesOrphaned _this,
			PerformRuleResult ruleresult, EObject pg, EObject mTypeToTType, EObject mBodyToTAnnotation, EObject mType,
			EObject mModel, EObject tType, EObject mModelToTypeGraph) {
		_this.registerObjects_BWD(ruleresult, pg, mTypeToTType, mBodyToTAnnotation, mType, mModel, tType,
				mModelToTypeGraph);

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

	public static final Iterable<Object[]> pattern_TypesOrphaned_12_2_corematch_blackBFBFB(TypeGraph pg, TClass tType,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pg,
				ModelToTypeGraph.class, "target")) {
			Model mModel = mModelToTypeGraph.getSource();
			if (mModel != null) {
				_result.add(new Object[] { pg, mModel, tType, mModelToTypeGraph, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_12_3_findcontext_blackBBBB(TypeGraph pg, Model mModel,
			TClass tType, ModelToTypeGraph mModelToTypeGraph) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pg.getOwnedTypes().contains(tType)) {
			if (pg.equals(mModelToTypeGraph.getTarget())) {
				if (mModel.equals(mModelToTypeGraph.getSource())) {
					_result.add(new Object[] { pg, mModel, tType, mModelToTypeGraph });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_12_3_findcontext_greenBBBBFFFFF(TypeGraph pg, Model mModel,
			TClass tType, ModelToTypeGraph mModelToTypeGraph) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____model_name_prime = "model";
		String mModelToTypeGraph__pg____target_name_prime = "target";
		String mModelToTypeGraph__mModel____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(mModel);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____ownedTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tType__pg____model);
		mModelToTypeGraph__pg____target.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__pg____target);
		mModelToTypeGraph__mModel____source.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__mModel____source.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__mModel____source);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		mModelToTypeGraph__pg____target.setName(mModelToTypeGraph__pg____target_name_prime);
		mModelToTypeGraph__mModel____source.setName(mModelToTypeGraph__mModel____source_name_prime);
		return new Object[] { pg, mModel, tType, mModelToTypeGraph, isApplicableMatch, pg__tType____ownedTypes,
				tType__pg____model, mModelToTypeGraph__pg____target, mModelToTypeGraph__mModel____source };
	}

	public static final Object[] pattern_TypesOrphaned_12_4_solveCSP_bindingFBBBBBB(TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch, TypeGraph pg, Model mModel, TClass tType,
			ModelToTypeGraph mModelToTypeGraph) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, pg, mModel, tType, mModelToTypeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pg, mModel, tType, mModelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesOrphaned_12_4_solveCSP_bindingAndBlackFBBBBBB(TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch, TypeGraph pg, Model mModel, TClass tType,
			ModelToTypeGraph mModelToTypeGraph) {
		Object[] result_pattern_TypesOrphaned_12_4_solveCSP_binding = pattern_TypesOrphaned_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, pg, mModel, tType, mModelToTypeGraph);
		if (result_pattern_TypesOrphaned_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesOrphaned_12_4_solveCSP_binding[0];

			Object[] result_pattern_TypesOrphaned_12_4_solveCSP_black = pattern_TypesOrphaned_12_4_solveCSP_blackB(csp);
			if (result_pattern_TypesOrphaned_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pg, mModel, tType, mModelToTypeGraph };
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
		for (TPackage __DEC_tType_classes_983541 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TPackage.class, "classes")) {
			return new Object[] { tType };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_20_2_testcorematchandDECs_black_nac_1BB(TClass tType,
			TypeGraph pg) {
		for (TypeGraph __DEC_tType_classes_850104 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tType_classes_850104)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_20_2_testcorematchandDECs_black_nac_2B(TClass tType) {
		TPackage __DEC_tType_ownedTypes_917252 = tType.getPackage();
		if (__DEC_tType_ownedTypes_917252 != null) {
			return new Object[] { tType };
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_20_2_testcorematchandDECs_black_nac_3B(TClass tType) {
		TAbstractType __DEC_tType_innerTypes_646791 = tType.getOuterType();
		if (__DEC_tType_innerTypes_646791 != null) {
			if (!tType.equals(__DEC_tType_innerTypes_646791)) {
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
		AbstractTypeDeclaration __DEC_mType_abstractTypeDeclaration_940053 = mType.getAbstractTypeDeclaration();
		if (__DEC_mType_abstractTypeDeclaration_940053 != null) {
			if (!mType.equals(__DEC_mType_abstractTypeDeclaration_940053)) {
				return new Object[] { mType };
			}
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_21_2_testcorematchandDECs_black_nac_1B(MClass mType) {
		AnonymousClassDeclaration __DEC_mType_anonymousClassDeclarationOwner_959104 = mType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mType_anonymousClassDeclarationOwner_959104 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_21_2_testcorematchandDECs_black_nac_2B(MClass mType) {
		org.eclipse.modisco.java.Package __DEC_mType_ownedElements_59358 = mType.getPackage();
		if (__DEC_mType_ownedElements_59358 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_21_2_testcorematchandDECs_black_nac_3B(MClass mType) {
		for (MAbstractMethodDefinition __DEC_mType_mInnerTypes_144076 : org.moflon.core.utilities.eMoflonEMFUtil
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
									_result.add(new Object[] { mType, mModel, _edge_orphanTypes });
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
			TypesOrphaned _this, Match match, MClass mType, Model mModel) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mType, mModel);
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

	public static final Object[] pattern_TypesOrphaned_24_2_matchsrctrgcontext_bindingFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("pg");
		EObject _localVariable_1 = sourceMatch.getObject("mType");
		EObject _localVariable_2 = sourceMatch.getObject("mModel");
		EObject _localVariable_3 = targetMatch.getObject("tType");
		EObject tmpPg = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		EObject tmpMModel = _localVariable_2;
		EObject tmpTType = _localVariable_3;
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			if (tmpMType instanceof MClass) {
				MClass mType = (MClass) tmpMType;
				if (tmpMModel instanceof Model) {
					Model mModel = (Model) tmpMModel;
					if (tmpTType instanceof TClass) {
						TClass tType = (TClass) tmpTType;
						return new Object[] { pg, mType, mModel, tType, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_24_2_matchsrctrgcontext_blackBBBBBB(TypeGraph pg, MClass mType,
			Model mModel, TClass tType, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { pg, mType, mModel, tType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding = pattern_TypesOrphaned_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding != null) {
			TypeGraph pg = (TypeGraph) result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding[0];
			MClass mType = (MClass) result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding[1];
			Model mModel = (Model) result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding[2];
			TClass tType = (TClass) result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_black = pattern_TypesOrphaned_24_2_matchsrctrgcontext_blackBBBBBB(
					pg, mType, mModel, tType, sourceMatch, targetMatch);
			if (result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { pg, mType, mModel, tType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_24_3_solvecsp_bindingFBBBBBBB(TypesOrphaned _this, TypeGraph pg,
			MClass mType, Model mModel, TClass tType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(pg, mType, mModel, tType, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, pg, mType, mModel, tType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesOrphaned_24_3_solvecsp_bindingAndBlackFBBBBBBB(TypesOrphaned _this,
			TypeGraph pg, MClass mType, Model mModel, TClass tType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypesOrphaned_24_3_solvecsp_binding = pattern_TypesOrphaned_24_3_solvecsp_bindingFBBBBBBB(
				_this, pg, mType, mModel, tType, sourceMatch, targetMatch);
		if (result_pattern_TypesOrphaned_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypesOrphaned_24_3_solvecsp_binding[0];

			Object[] result_pattern_TypesOrphaned_24_3_solvecsp_black = pattern_TypesOrphaned_24_3_solvecsp_blackB(csp);
			if (result_pattern_TypesOrphaned_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, pg, mType, mModel, tType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_24_5_matchcorrcontext_blackBBFBB(TypeGraph pg,
			Model mModel, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pg, ModelToTypeGraph.class, "target")) {
				if (mModel.equals(mModelToTypeGraph.getSource())) {
					_result.add(new Object[] { pg, mModel, mModelToTypeGraph, sourceMatch, targetMatch });
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

	public static final Object[] pattern_TypesOrphaned_24_6_createcorrespondence_blackBBBBB(TypeGraph pg, MClass mType,
			Model mModel, TClass tType, CCMatch ccMatch) {
		return new Object[] { pg, mType, mModel, tType, ccMatch };
	}

	public static final Object[] pattern_TypesOrphaned_24_6_createcorrespondence_greenFFBBB(MClass mType, TClass tType,
			CCMatch ccMatch) {
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		mTypeToTType.setSource(mType);
		mTypeToTType.setTarget(tType);
		ccMatch.getCreateCorr().add(mTypeToTType);
		mBodyToTAnnotation.setSource(mType);
		mBodyToTAnnotation.setTarget(tType);
		ccMatch.getCreateCorr().add(mBodyToTAnnotation);
		return new Object[] { mTypeToTType, mBodyToTAnnotation, mType, tType, ccMatch };
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
		AbstractTypeDeclaration __DEC_mType_abstractTypeDeclaration_617191 = mType.getAbstractTypeDeclaration();
		if (__DEC_mType_abstractTypeDeclaration_617191 != null) {
			if (!mType.equals(__DEC_mType_abstractTypeDeclaration_617191)) {
				return new Object[] { mType };
			}
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_27_1_matchtggpattern_black_nac_1B(MClass mType) {
		AnonymousClassDeclaration __DEC_mType_anonymousClassDeclarationOwner_681534 = mType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mType_anonymousClassDeclarationOwner_681534 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_27_1_matchtggpattern_black_nac_2B(MClass mType) {
		org.eclipse.modisco.java.Package __DEC_mType_ownedElements_30334 = mType.getPackage();
		if (__DEC_mType_ownedElements_30334 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_27_1_matchtggpattern_black_nac_3B(MClass mType) {
		for (MAbstractMethodDefinition __DEC_mType_mInnerTypes_29841 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_27_1_matchtggpattern_blackBB(MClass mType, Model mModel) {
		if (mModel.getOrphanTypes().contains(mType)) {
			if (pattern_TypesOrphaned_27_1_matchtggpattern_black_nac_0B(mType) == null) {
				if (pattern_TypesOrphaned_27_1_matchtggpattern_black_nac_1B(mType) == null) {
					if (pattern_TypesOrphaned_27_1_matchtggpattern_black_nac_2B(mType) == null) {
						if (pattern_TypesOrphaned_27_1_matchtggpattern_black_nac_3B(mType) == null) {
							return new Object[] { mType, mModel };
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
		for (TPackage __DEC_tType_classes_399936 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TPackage.class, "classes")) {
			return new Object[] { tType };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_28_1_matchtggpattern_black_nac_1BB(TClass tType, TypeGraph pg) {
		for (TypeGraph __DEC_tType_classes_305961 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tType_classes_305961)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_28_1_matchtggpattern_black_nac_2B(TClass tType) {
		TPackage __DEC_tType_ownedTypes_821845 = tType.getPackage();
		if (__DEC_tType_ownedTypes_821845 != null) {
			return new Object[] { tType };
		}

		return null;
	}

	public static final Object[] pattern_TypesOrphaned_28_1_matchtggpattern_black_nac_3B(TClass tType) {
		TAbstractType __DEC_tType_innerTypes_625413 = tType.getOuterType();
		if (__DEC_tType_innerTypes_625413 != null) {
			if (!tType.equals(__DEC_tType_innerTypes_625413)) {
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
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
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
			ModelgeneratorRuleResult ruleResult, Model mModel) {
		if (ruleResult.getSourceObjects().contains(mModel)) {
			return new Object[] { ruleResult, mModel };
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
					TypeGraph pg = mModelToTypeGraph.getTarget();
					if (pg != null) {
						Model mModel = mModelToTypeGraph.getSource();
						if (mModel != null) {
							if (pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									mModelToTypeGraph) == null) {
								if (pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_0BB(ruleResult, pg) == null) {
									if (pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											mModel) == null) {
										_result.add(new Object[] { mModelToTypeGraphList, pg, mModelToTypeGraph, mModel,
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
			IsApplicableMatch isApplicableMatch, TypeGraph pg, Model mModel, ModelToTypeGraph mModelToTypeGraph,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, pg, mModel, mModelToTypeGraph,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pg, mModel, mModelToTypeGraph, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesOrphaned_29_3_solveCSP_bindingAndBlackFBBBBBB(TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch, TypeGraph pg, Model mModel, ModelToTypeGraph mModelToTypeGraph,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypesOrphaned_29_3_solveCSP_binding = pattern_TypesOrphaned_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, pg, mModel, mModelToTypeGraph, ruleResult);
		if (result_pattern_TypesOrphaned_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesOrphaned_29_3_solveCSP_binding[0];

			Object[] result_pattern_TypesOrphaned_29_3_solveCSP_black = pattern_TypesOrphaned_29_3_solveCSP_blackB(csp);
			if (result_pattern_TypesOrphaned_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pg, mModel, mModelToTypeGraph, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_29_4_checkCSP_expressionFBB(TypesOrphaned _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_29_5_checknacs_blackBBB(TypeGraph pg, Model mModel,
			ModelToTypeGraph mModelToTypeGraph) {
		return new Object[] { pg, mModel, mModelToTypeGraph };
	}

	public static final Object[] pattern_TypesOrphaned_29_6_perform_blackBBBB(TypeGraph pg, Model mModel,
			ModelToTypeGraph mModelToTypeGraph, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { pg, mModel, mModelToTypeGraph, ruleResult };
	}

	public static final Object[] pattern_TypesOrphaned_29_6_perform_greenBFFFBFBB(TypeGraph pg, Model mModel,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MClass mType = ModiscoFactory.eINSTANCE.createMClass();
		TClass tType = BasicFactory.eINSTANCE.createTClass();
		Object _localVariable_0 = csp.getValue("mType", "proxy");
		Object _localVariable_1 = csp.getValue("tType", "tLib");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mTypeToTType);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		mTypeToTType.setSource(mType);
		mBodyToTAnnotation.setSource(mType);
		mModel.getOrphanTypes().add(mType);
		ruleResult.getSourceObjects().add(mType);
		pg.getOwnedTypes().add(tType);
		mBodyToTAnnotation.setTarget(tType);
		mTypeToTType.setTarget(tType);
		ruleResult.getTargetObjects().add(tType);
		boolean mType_proxy_prime = (boolean) _localVariable_0;
		boolean tType_tLib_prime = (boolean) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		mType.setProxy(Boolean.valueOf(mType_proxy_prime));
		tType.setTLib(Boolean.valueOf(tType_tLib_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { pg, mTypeToTType, mBodyToTAnnotation, mType, mModel, tType, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_TypesOrphaned_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypesOrphanedImpl
