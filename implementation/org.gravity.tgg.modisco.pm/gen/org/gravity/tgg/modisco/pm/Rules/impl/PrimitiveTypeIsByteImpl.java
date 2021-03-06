/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.PrimitiveTypeByte;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.ModelToTypeGraph;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.PrimitiveTypeIsByte;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Primitive Type Is Byte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PrimitiveTypeIsByteImpl extends AbstractRuleImpl implements PrimitiveTypeIsByte {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeIsByteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getPrimitiveTypeIsByte();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, PrimitiveTypeByte ePrimitiveType, Model eModel) {

		Object[] result1_black = PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_0_1_initialbindings_blackBBBB(this,
				match, ePrimitiveType, eModel);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[ePrimitiveType] = " + ePrimitiveType + ", " + "[eModel] = " + eModel + ".");
		}

		Object[] result2_bindingAndBlack = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, ePrimitiveType, eModel);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[ePrimitiveType] = " + ePrimitiveType + ", " + "[eModel] = " + eModel + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = PrimitiveTypeIsByteImpl
					.pattern_PrimitiveTypeIsByte_0_4_collectelementstobetranslated_blackBBB(match, ePrimitiveType,
							eModel);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[ePrimitiveType] = " + ePrimitiveType + ", " + "[eModel] = " + eModel + ".");
			}
			PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_0_4_collectelementstobetranslated_greenBBBF(match,
					ePrimitiveType, eModel);
			//nothing EMoflonEdge eModel__ePrimitiveType____orphanTypes = (EMoflonEdge) result4_green[3];

			Object[] result5_black = PrimitiveTypeIsByteImpl
					.pattern_PrimitiveTypeIsByte_0_5_collectcontextelements_blackBBB(match, ePrimitiveType, eModel);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[ePrimitiveType] = " + ePrimitiveType + ", " + "[eModel] = " + eModel + ".");
			}
			PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_0_5_collectcontextelements_greenBB(match, eModel);

			// 
			PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_0_6_registerobjectstomatch_expressionBBBB(this, match,
					ePrimitiveType, eModel);
			return PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_0_7_expressionF();
		} else {
			return PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		PrimitiveTypeByte ePrimitiveType = (PrimitiveTypeByte) result1_bindingAndBlack[0];
		ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[2];
		Model eModel = (Model) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_1_1_performtransformation_greenBBFF(ePrimitiveType, typeGraph);
		TypeToTAbstractType typeToTAbstractType = (TypeToTAbstractType) result1_green[2];
		TClass tPrimitiveClass = (TClass) result1_green[3];

		Object[] result2_black = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_1_2_collecttranslatedelements_blackBBB(ePrimitiveType, typeToTAbstractType,
						tPrimitiveClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ePrimitiveType] = "
					+ ePrimitiveType + ", " + "[typeToTAbstractType] = " + typeToTAbstractType + ", "
					+ "[tPrimitiveClass] = " + tPrimitiveClass + ".");
		}
		Object[] result2_green = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_1_2_collecttranslatedelements_greenFBBB(ePrimitiveType,
						typeToTAbstractType, tPrimitiveClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, ePrimitiveType,
						eModelToTypeGraph, typeGraph, typeToTAbstractType, tPrimitiveClass, eModel);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[ePrimitiveType] = " + ePrimitiveType + ", " + "[eModelToTypeGraph] = "
					+ eModelToTypeGraph + ", " + "[typeGraph] = " + typeGraph + ", " + "[typeToTAbstractType] = "
					+ typeToTAbstractType + ", " + "[tPrimitiveClass] = " + tPrimitiveClass + ", " + "[eModel] = "
					+ eModel + ".");
		}
		PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_1_3_bookkeepingforedges_greenBBBBBBFFFFFF(ruleresult,
				ePrimitiveType, typeGraph, typeToTAbstractType, tPrimitiveClass, eModel);
		//nothing EMoflonEdge eModel__ePrimitiveType____orphanTypes = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge typeGraph__tPrimitiveClass____classes = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge typeToTAbstractType__ePrimitiveType____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge typeToTAbstractType__tPrimitiveClass____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge typeGraph__tPrimitiveClass____ownedTypes = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tPrimitiveClass__typeGraph____model = (EMoflonEdge) result3_green[11];

		// 
		// 
		PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				ePrimitiveType, eModelToTypeGraph, typeGraph, typeToTAbstractType, tPrimitiveClass, eModel);
		return PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		PrimitiveTypeByte ePrimitiveType = (PrimitiveTypeByte) result2_binding[0];
		Model eModel = (Model) result2_binding[1];
		for (Object[] result2_black : PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_2_2_corematch_blackBFFBB(ePrimitiveType, eModel, match)) {
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result2_black[1];
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			// ForEach 
			for (Object[] result3_black : PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_2_3_findcontext_blackBBBB(
					ePrimitiveType, eModelToTypeGraph, typeGraph, eModel)) {
				Object[] result3_green = PrimitiveTypeIsByteImpl
						.pattern_PrimitiveTypeIsByte_2_3_findcontext_greenBBBBFFFF(ePrimitiveType, eModelToTypeGraph,
								typeGraph, eModel);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge eModel__ePrimitiveType____orphanTypes = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge eModelToTypeGraph__eModel____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge eModelToTypeGraph__typeGraph____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = PrimitiveTypeIsByteImpl
						.pattern_PrimitiveTypeIsByte_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								ePrimitiveType, eModelToTypeGraph, typeGraph, eModel);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ePrimitiveType] = "
							+ ePrimitiveType + ", " + "[eModelToTypeGraph] = " + eModelToTypeGraph + ", "
							+ "[typeGraph] = " + typeGraph + ", " + "[eModel] = " + eModel + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = PrimitiveTypeIsByteImpl
							.pattern_PrimitiveTypeIsByte_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, PrimitiveTypeByte ePrimitiveType, Model eModel) {
		match.registerObject("ePrimitiveType", ePrimitiveType);
		match.registerObject("eModel", eModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, PrimitiveTypeByte ePrimitiveType, Model eModel) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, PrimitiveTypeByte ePrimitiveType,
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Model eModel) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("ePrimitiveType", ePrimitiveType);
		isApplicableMatch.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("eModel", eModel);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject ePrimitiveType, EObject eModelToTypeGraph,
			EObject typeGraph, EObject typeToTAbstractType, EObject tPrimitiveClass, EObject eModel) {
		ruleresult.registerObject("ePrimitiveType", ePrimitiveType);
		ruleresult.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("typeToTAbstractType", typeToTAbstractType);
		ruleresult.registerObject("tPrimitiveClass", tPrimitiveClass);
		ruleresult.registerObject("eModel", eModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("ePrimitiveType").eClass())
				.equals("java.PrimitiveTypeByte.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph typeGraph, TClass tPrimitiveClass) {

		Object[] result1_black = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_10_1_initialbindings_blackBBBB(this, match, typeGraph, tPrimitiveClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeGraph] = " + typeGraph + ", " + "[tPrimitiveClass] = "
					+ tPrimitiveClass + ".");
		}

		Object[] result2_bindingAndBlack = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, typeGraph,
						tPrimitiveClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeGraph] = " + typeGraph + ", " + "[tPrimitiveClass] = "
					+ tPrimitiveClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = PrimitiveTypeIsByteImpl
					.pattern_PrimitiveTypeIsByte_10_4_collectelementstobetranslated_blackBBB(match, typeGraph,
							tPrimitiveClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tPrimitiveClass] = " + tPrimitiveClass + ".");
			}
			PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_10_4_collectelementstobetranslated_greenBBBFFF(match,
					typeGraph, tPrimitiveClass);
			//nothing EMoflonEdge typeGraph__tPrimitiveClass____classes = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge typeGraph__tPrimitiveClass____ownedTypes = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tPrimitiveClass__typeGraph____model = (EMoflonEdge) result4_green[5];

			Object[] result5_black = PrimitiveTypeIsByteImpl
					.pattern_PrimitiveTypeIsByte_10_5_collectcontextelements_blackBBB(match, typeGraph,
							tPrimitiveClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tPrimitiveClass] = " + tPrimitiveClass + ".");
			}
			PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_10_5_collectcontextelements_greenBB(match, typeGraph);

			// 
			PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_10_6_registerobjectstomatch_expressionBBBB(this, match,
					typeGraph, tPrimitiveClass);
			return PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_10_7_expressionF();
		} else {
			return PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[0];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[1];
		TClass tPrimitiveClass = (TClass) result1_bindingAndBlack[2];
		Model eModel = (Model) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_11_1_performtransformation_greenFFBB(tPrimitiveClass, eModel);
		PrimitiveTypeByte ePrimitiveType = (PrimitiveTypeByte) result1_green[0];
		TypeToTAbstractType typeToTAbstractType = (TypeToTAbstractType) result1_green[1];

		Object[] result2_black = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_11_2_collecttranslatedelements_blackBBB(ePrimitiveType,
						typeToTAbstractType, tPrimitiveClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ePrimitiveType] = "
					+ ePrimitiveType + ", " + "[typeToTAbstractType] = " + typeToTAbstractType + ", "
					+ "[tPrimitiveClass] = " + tPrimitiveClass + ".");
		}
		Object[] result2_green = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_11_2_collecttranslatedelements_greenFBBB(ePrimitiveType,
						typeToTAbstractType, tPrimitiveClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, ePrimitiveType,
						eModelToTypeGraph, typeGraph, typeToTAbstractType, tPrimitiveClass, eModel);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[ePrimitiveType] = " + ePrimitiveType + ", " + "[eModelToTypeGraph] = "
					+ eModelToTypeGraph + ", " + "[typeGraph] = " + typeGraph + ", " + "[typeToTAbstractType] = "
					+ typeToTAbstractType + ", " + "[tPrimitiveClass] = " + tPrimitiveClass + ", " + "[eModel] = "
					+ eModel + ".");
		}
		PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_11_3_bookkeepingforedges_greenBBBBBBFFFFFF(ruleresult,
				ePrimitiveType, typeGraph, typeToTAbstractType, tPrimitiveClass, eModel);
		//nothing EMoflonEdge eModel__ePrimitiveType____orphanTypes = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge typeGraph__tPrimitiveClass____classes = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge typeToTAbstractType__ePrimitiveType____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge typeToTAbstractType__tPrimitiveClass____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge typeGraph__tPrimitiveClass____ownedTypes = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tPrimitiveClass__typeGraph____model = (EMoflonEdge) result3_green[11];

		// 
		// 
		PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				ePrimitiveType, eModelToTypeGraph, typeGraph, typeToTAbstractType, tPrimitiveClass, eModel);
		return PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeGraph typeGraph = (TypeGraph) result2_binding[0];
		TClass tPrimitiveClass = (TClass) result2_binding[1];
		for (Object[] result2_black : PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_12_2_corematch_blackFBBFB(typeGraph, tPrimitiveClass, match)) {
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result2_black[0];
			Model eModel = (Model) result2_black[3];
			// ForEach 
			for (Object[] result3_black : PrimitiveTypeIsByteImpl
					.pattern_PrimitiveTypeIsByte_12_3_findcontext_blackBBBB(eModelToTypeGraph, typeGraph,
							tPrimitiveClass, eModel)) {
				Object[] result3_green = PrimitiveTypeIsByteImpl
						.pattern_PrimitiveTypeIsByte_12_3_findcontext_greenBBBBFFFFFF(eModelToTypeGraph, typeGraph,
								tPrimitiveClass, eModel);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge typeGraph__tPrimitiveClass____classes = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge eModelToTypeGraph__eModel____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge eModelToTypeGraph__typeGraph____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge typeGraph__tPrimitiveClass____ownedTypes = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tPrimitiveClass__typeGraph____model = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = PrimitiveTypeIsByteImpl
						.pattern_PrimitiveTypeIsByte_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eModelToTypeGraph] = "
							+ eModelToTypeGraph + ", " + "[typeGraph] = " + typeGraph + ", " + "[tPrimitiveClass] = "
							+ tPrimitiveClass + ", " + "[eModel] = " + eModel + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = PrimitiveTypeIsByteImpl
							.pattern_PrimitiveTypeIsByte_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph typeGraph, TClass tPrimitiveClass) {
		match.registerObject("typeGraph", typeGraph);
		match.registerObject("tPrimitiveClass", tPrimitiveClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph typeGraph, TClass tPrimitiveClass) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToTypeGraph,
			TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tPrimitiveClass", tPrimitiveClass);
		isApplicableMatch.registerObject("eModel", eModel);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject ePrimitiveType, EObject eModelToTypeGraph,
			EObject typeGraph, EObject typeToTAbstractType, EObject tPrimitiveClass, EObject eModel) {
		ruleresult.registerObject("ePrimitiveType", ePrimitiveType);
		ruleresult.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("typeToTAbstractType", typeToTAbstractType);
		ruleresult.registerObject("tPrimitiveClass", tPrimitiveClass);
		ruleresult.registerObject("eModel", eModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tPrimitiveClass").eClass())
				.equals("basic.TClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_88(EMoflonEdge _edge_classes) {

		Object[] result1_bindingAndBlack = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_20_2_testcorematchandDECs_blackFFB(_edge_classes)) {
			TypeGraph typeGraph = (TypeGraph) result2_black[0];
			TClass tPrimitiveClass = (TClass) result2_black[1];
			Object[] result2_green = PrimitiveTypeIsByteImpl
					.pattern_PrimitiveTypeIsByte_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (PrimitiveTypeIsByteImpl
					.pattern_PrimitiveTypeIsByte_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, typeGraph, tPrimitiveClass)) {
				// 
				if (PrimitiveTypeIsByteImpl
						.pattern_PrimitiveTypeIsByte_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = PrimitiveTypeIsByteImpl
							.pattern_PrimitiveTypeIsByte_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_92(EMoflonEdge _edge_orphanTypes) {

		Object[] result1_bindingAndBlack = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_21_2_testcorematchandDECs_blackFFB(_edge_orphanTypes)) {
			PrimitiveTypeByte ePrimitiveType = (PrimitiveTypeByte) result2_black[0];
			Model eModel = (Model) result2_black[1];
			Object[] result2_green = PrimitiveTypeIsByteImpl
					.pattern_PrimitiveTypeIsByte_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (PrimitiveTypeIsByteImpl
					.pattern_PrimitiveTypeIsByte_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, ePrimitiveType, eModel)) {
				// 
				if (PrimitiveTypeIsByteImpl
						.pattern_PrimitiveTypeIsByte_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = PrimitiveTypeIsByteImpl
							.pattern_PrimitiveTypeIsByte_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("PrimitiveTypeIsByte");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tPrimitiveClass", "tName", "byte", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tPrimitiveClass", "tLib", true, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

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
		ruleResult.setRule("PrimitiveTypeIsByte");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tPrimitiveClass", "tName", "byte", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tPrimitiveClass", "tLib", true, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

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

		Object[] result1_black = PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		PrimitiveTypeByte ePrimitiveType = (PrimitiveTypeByte) result2_bindingAndBlack[0];
		TypeGraph typeGraph = (TypeGraph) result2_bindingAndBlack[1];
		TClass tPrimitiveClass = (TClass) result2_bindingAndBlack[2];
		Model eModel = (Model) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, ePrimitiveType, typeGraph,
						tPrimitiveClass, eModel, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[ePrimitiveType] = " + ePrimitiveType + ", " + "[typeGraph] = " + typeGraph + ", "
					+ "[tPrimitiveClass] = " + tPrimitiveClass + ", " + "[eModel] = " + eModel + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : PrimitiveTypeIsByteImpl
					.pattern_PrimitiveTypeIsByte_24_5_matchcorrcontext_blackFBBBB(typeGraph, eModel, sourceMatch,
							targetMatch)) {
				ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result5_black[0];
				Object[] result5_green = PrimitiveTypeIsByteImpl
						.pattern_PrimitiveTypeIsByte_24_5_matchcorrcontext_greenBBBF(eModelToTypeGraph, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = PrimitiveTypeIsByteImpl
						.pattern_PrimitiveTypeIsByte_24_6_createcorrespondence_blackBBBBB(ePrimitiveType, typeGraph,
								tPrimitiveClass, eModel, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ePrimitiveType] = "
							+ ePrimitiveType + ", " + "[typeGraph] = " + typeGraph + ", " + "[tPrimitiveClass] = "
							+ tPrimitiveClass + ", " + "[eModel] = " + eModel + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_24_6_createcorrespondence_greenBFBB(ePrimitiveType,
						tPrimitiveClass, ccMatch);
				//nothing TypeToTAbstractType typeToTAbstractType = (TypeToTAbstractType) result6_green[1];

				Object[] result7_black = PrimitiveTypeIsByteImpl
						.pattern_PrimitiveTypeIsByte_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(PrimitiveTypeByte ePrimitiveType, TypeGraph typeGraph, TClass tPrimitiveClass,
			Model eModel, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(PrimitiveTypeByte ePrimitiveType, Model eModel) {// 
		Object[] result1_black = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_27_1_matchtggpattern_blackBB(ePrimitiveType, eModel);
		if (result1_black != null) {
			return PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_27_2_expressionF();
		} else {
			return PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph typeGraph, TClass tPrimitiveClass) {// 
		Object[] result1_black = PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_28_1_matchtggpattern_blackBB(typeGraph, tPrimitiveClass);
		if (result1_black != null) {
			PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_28_1_matchtggpattern_greenB(tPrimitiveClass);

			return PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_28_2_expressionF();
		} else {
			return PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph eModelToTypeGraphParameter) {

		Object[] result1_black = PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : PrimitiveTypeIsByteImpl
				.pattern_PrimitiveTypeIsByte_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList eModelToTypeGraphList = (RuleEntryList) result2_black[0];
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result2_black[1];
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			Model eModel = (Model) result2_black[3];

			Object[] result3_bindingAndBlack = PrimitiveTypeIsByteImpl
					.pattern_PrimitiveTypeIsByte_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							eModelToTypeGraph, typeGraph, eModel, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eModelToTypeGraph] = "
						+ eModelToTypeGraph + ", " + "[typeGraph] = " + typeGraph + ", " + "[eModel] = " + eModel + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = PrimitiveTypeIsByteImpl
						.pattern_PrimitiveTypeIsByte_29_5_checknacs_blackBBB(eModelToTypeGraph, typeGraph, eModel);
				if (result5_black != null) {

					Object[] result6_black = PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_29_6_perform_blackBBBB(
							eModelToTypeGraph, typeGraph, eModel, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[eModelToTypeGraph] = " + eModelToTypeGraph + ", " + "[typeGraph] = " + typeGraph
								+ ", " + "[eModel] = " + eModel + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_29_6_perform_greenFBFFBB(typeGraph, eModel,
							ruleResult);
					//nothing PrimitiveTypeByte ePrimitiveType = (PrimitiveTypeByte) result6_green[0];
					//nothing TypeToTAbstractType typeToTAbstractType = (TypeToTAbstractType) result6_green[2];
					//nothing TClass tPrimitiveClass = (TClass) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return PrimitiveTypeIsByteImpl.pattern_PrimitiveTypeIsByte_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToTypeGraph,
			TypeGraph typeGraph, Model eModel, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
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
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___IS_APPROPRIATE_FWD__MATCH_PRIMITIVETYPEBYTE_MODEL:
			return isAppropriate_FWD((Match) arguments.get(0), (PrimitiveTypeByte) arguments.get(1),
					(Model) arguments.get(2));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PRIMITIVETYPEBYTE_MODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (PrimitiveTypeByte) arguments.get(1),
					(Model) arguments.get(2));
			return null;
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PRIMITIVETYPEBYTE_MODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (PrimitiveTypeByte) arguments.get(1),
					(Model) arguments.get(2));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PRIMITIVETYPEBYTE_MODELTOTYPEGRAPH_TYPEGRAPH_MODEL:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (PrimitiveTypeByte) arguments.get(1),
					(ModelToTypeGraph) arguments.get(2), (TypeGraph) arguments.get(3), (Model) arguments.get(4));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TCLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1), (TClass) arguments.get(2));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TCLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TClass) arguments.get(2));
			return null;
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TCLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TClass) arguments.get(2));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELTOTYPEGRAPH_TYPEGRAPH_TCLASS_MODEL:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ModelToTypeGraph) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3), (Model) arguments.get(4));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_88__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_88((EMoflonEdge) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_92__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_92((EMoflonEdge) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___IS_APPLICABLE_SOLVE_CSP_CC__PRIMITIVETYPEBYTE_TYPEGRAPH_TCLASS_MODEL_MATCH_MATCH:
			return isApplicable_solveCsp_CC((PrimitiveTypeByte) arguments.get(0), (TypeGraph) arguments.get(1),
					(TClass) arguments.get(2), (Model) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___CHECK_DEC_FWD__PRIMITIVETYPEBYTE_MODEL:
			return checkDEC_FWD((PrimitiveTypeByte) arguments.get(0), (Model) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___CHECK_DEC_BWD__TYPEGRAPH_TCLASS:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TClass) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELTOTYPEGRAPH_TYPEGRAPH_MODEL_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ModelToTypeGraph) arguments.get(1),
					(TypeGraph) arguments.get(2), (Model) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.PRIMITIVE_TYPE_IS_BYTE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_0_1_initialbindings_blackBBBB(PrimitiveTypeIsByte _this,
			Match match, PrimitiveTypeByte ePrimitiveType, Model eModel) {
		return new Object[] { _this, match, ePrimitiveType, eModel };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_0_2_SolveCSP_bindingFBBBB(PrimitiveTypeIsByte _this,
			Match match, PrimitiveTypeByte ePrimitiveType, Model eModel) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, ePrimitiveType, eModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, ePrimitiveType, eModel };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_0_2_SolveCSP_bindingAndBlackFBBBB(
			PrimitiveTypeIsByte _this, Match match, PrimitiveTypeByte ePrimitiveType, Model eModel) {
		Object[] result_pattern_PrimitiveTypeIsByte_0_2_SolveCSP_binding = pattern_PrimitiveTypeIsByte_0_2_SolveCSP_bindingFBBBB(
				_this, match, ePrimitiveType, eModel);
		if (result_pattern_PrimitiveTypeIsByte_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeIsByte_0_2_SolveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeIsByte_0_2_SolveCSP_black = pattern_PrimitiveTypeIsByte_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeIsByte_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, ePrimitiveType, eModel };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeIsByte_0_3_CheckCSP_expressionFBB(PrimitiveTypeIsByte _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_0_4_collectelementstobetranslated_blackBBB(Match match,
			PrimitiveTypeByte ePrimitiveType, Model eModel) {
		return new Object[] { match, ePrimitiveType, eModel };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_0_4_collectelementstobetranslated_greenBBBF(Match match,
			PrimitiveTypeByte ePrimitiveType, Model eModel) {
		EMoflonEdge eModel__ePrimitiveType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(ePrimitiveType);
		String eModel__ePrimitiveType____orphanTypes_name_prime = "orphanTypes";
		eModel__ePrimitiveType____orphanTypes.setSrc(eModel);
		eModel__ePrimitiveType____orphanTypes.setTrg(ePrimitiveType);
		match.getToBeTranslatedEdges().add(eModel__ePrimitiveType____orphanTypes);
		eModel__ePrimitiveType____orphanTypes.setName(eModel__ePrimitiveType____orphanTypes_name_prime);
		return new Object[] { match, ePrimitiveType, eModel, eModel__ePrimitiveType____orphanTypes };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_0_5_collectcontextelements_blackBBB(Match match,
			PrimitiveTypeByte ePrimitiveType, Model eModel) {
		return new Object[] { match, ePrimitiveType, eModel };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_0_5_collectcontextelements_greenBB(Match match,
			Model eModel) {
		match.getContextNodes().add(eModel);
		return new Object[] { match, eModel };
	}

	public static final void pattern_PrimitiveTypeIsByte_0_6_registerobjectstomatch_expressionBBBB(
			PrimitiveTypeIsByte _this, Match match, PrimitiveTypeByte ePrimitiveType, Model eModel) {
		_this.registerObjectsToMatch_FWD(match, ePrimitiveType, eModel);

	}

	public static final boolean pattern_PrimitiveTypeIsByte_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeIsByte_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("ePrimitiveType");
		EObject _localVariable_1 = isApplicableMatch.getObject("eModelToTypeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_3 = isApplicableMatch.getObject("eModel");
		EObject tmpEPrimitiveType = _localVariable_0;
		EObject tmpEModelToTypeGraph = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpEModel = _localVariable_3;
		if (tmpEPrimitiveType instanceof PrimitiveTypeByte) {
			PrimitiveTypeByte ePrimitiveType = (PrimitiveTypeByte) tmpEPrimitiveType;
			if (tmpEModelToTypeGraph instanceof ModelToTypeGraph) {
				ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) tmpEModelToTypeGraph;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpEModel instanceof Model) {
						Model eModel = (Model) tmpEModel;
						return new Object[] { ePrimitiveType, eModelToTypeGraph, typeGraph, eModel, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_1_1_performtransformation_blackBBBBFBB(
			PrimitiveTypeByte ePrimitiveType, ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Model eModel,
			PrimitiveTypeIsByte _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { ePrimitiveType, eModelToTypeGraph, typeGraph, eModel, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_1_1_performtransformation_bindingAndBlackFFFFFBB(
			PrimitiveTypeIsByte _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PrimitiveTypeIsByte_1_1_performtransformation_binding = pattern_PrimitiveTypeIsByte_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_PrimitiveTypeIsByte_1_1_performtransformation_binding != null) {
			PrimitiveTypeByte ePrimitiveType = (PrimitiveTypeByte) result_pattern_PrimitiveTypeIsByte_1_1_performtransformation_binding[0];
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result_pattern_PrimitiveTypeIsByte_1_1_performtransformation_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_PrimitiveTypeIsByte_1_1_performtransformation_binding[2];
			Model eModel = (Model) result_pattern_PrimitiveTypeIsByte_1_1_performtransformation_binding[3];

			Object[] result_pattern_PrimitiveTypeIsByte_1_1_performtransformation_black = pattern_PrimitiveTypeIsByte_1_1_performtransformation_blackBBBBFBB(
					ePrimitiveType, eModelToTypeGraph, typeGraph, eModel, _this, isApplicableMatch);
			if (result_pattern_PrimitiveTypeIsByte_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_PrimitiveTypeIsByte_1_1_performtransformation_black[4];

				return new Object[] { ePrimitiveType, eModelToTypeGraph, typeGraph, eModel, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_1_1_performtransformation_greenBBFF(
			PrimitiveTypeByte ePrimitiveType, TypeGraph typeGraph) {
		TypeToTAbstractType typeToTAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		TClass tPrimitiveClass = BasicFactory.eINSTANCE.createTClass();
		String tPrimitiveClass_tName_prime = "byte";
		boolean tPrimitiveClass_tLib_prime = Boolean.valueOf(true);
		typeToTAbstractType.setSource(ePrimitiveType);
		typeGraph.getClasses().add(tPrimitiveClass);
		typeToTAbstractType.setTarget(tPrimitiveClass);
		typeGraph.getOwnedTypes().add(tPrimitiveClass);
		tPrimitiveClass.setTName(tPrimitiveClass_tName_prime);
		tPrimitiveClass.setTLib(Boolean.valueOf(tPrimitiveClass_tLib_prime));
		return new Object[] { ePrimitiveType, typeGraph, typeToTAbstractType, tPrimitiveClass };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_1_2_collecttranslatedelements_blackBBB(
			PrimitiveTypeByte ePrimitiveType, TypeToTAbstractType typeToTAbstractType, TClass tPrimitiveClass) {
		return new Object[] { ePrimitiveType, typeToTAbstractType, tPrimitiveClass };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_1_2_collecttranslatedelements_greenFBBB(
			PrimitiveTypeByte ePrimitiveType, TypeToTAbstractType typeToTAbstractType, TClass tPrimitiveClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(ePrimitiveType);
		ruleresult.getCreatedLinkElements().add(typeToTAbstractType);
		ruleresult.getCreatedElements().add(tPrimitiveClass);
		return new Object[] { ruleresult, ePrimitiveType, typeToTAbstractType, tPrimitiveClass };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject ePrimitiveType, EObject eModelToTypeGraph, EObject typeGraph,
			EObject typeToTAbstractType, EObject tPrimitiveClass, EObject eModel) {
		if (!ePrimitiveType.equals(typeGraph)) {
			if (!ePrimitiveType.equals(typeToTAbstractType)) {
				if (!ePrimitiveType.equals(tPrimitiveClass)) {
					if (!eModelToTypeGraph.equals(ePrimitiveType)) {
						if (!eModelToTypeGraph.equals(typeGraph)) {
							if (!eModelToTypeGraph.equals(typeToTAbstractType)) {
								if (!eModelToTypeGraph.equals(tPrimitiveClass)) {
									if (!typeGraph.equals(typeToTAbstractType)) {
										if (!tPrimitiveClass.equals(typeGraph)) {
											if (!tPrimitiveClass.equals(typeToTAbstractType)) {
												if (!eModel.equals(ePrimitiveType)) {
													if (!eModel.equals(eModelToTypeGraph)) {
														if (!eModel.equals(typeGraph)) {
															if (!eModel.equals(typeToTAbstractType)) {
																if (!eModel.equals(tPrimitiveClass)) {
																	return new Object[] { ruleresult, ePrimitiveType,
																			eModelToTypeGraph, typeGraph,
																			typeToTAbstractType, tPrimitiveClass,
																			eModel };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_PrimitiveTypeIsByte_1_3_bookkeepingforedges_greenBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject ePrimitiveType, EObject typeGraph, EObject typeToTAbstractType,
			EObject tPrimitiveClass, EObject eModel) {
		EMoflonEdge eModel__ePrimitiveType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tPrimitiveClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeToTAbstractType__ePrimitiveType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeToTAbstractType__tPrimitiveClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tPrimitiveClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPrimitiveClass__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PrimitiveTypeIsByte";
		String eModel__ePrimitiveType____orphanTypes_name_prime = "orphanTypes";
		String typeGraph__tPrimitiveClass____classes_name_prime = "classes";
		String typeToTAbstractType__ePrimitiveType____source_name_prime = "source";
		String typeToTAbstractType__tPrimitiveClass____target_name_prime = "target";
		String typeGraph__tPrimitiveClass____ownedTypes_name_prime = "ownedTypes";
		String tPrimitiveClass__typeGraph____model_name_prime = "model";
		eModel__ePrimitiveType____orphanTypes.setSrc(eModel);
		eModel__ePrimitiveType____orphanTypes.setTrg(ePrimitiveType);
		ruleresult.getTranslatedEdges().add(eModel__ePrimitiveType____orphanTypes);
		typeGraph__tPrimitiveClass____classes.setSrc(typeGraph);
		typeGraph__tPrimitiveClass____classes.setTrg(tPrimitiveClass);
		ruleresult.getCreatedEdges().add(typeGraph__tPrimitiveClass____classes);
		typeToTAbstractType__ePrimitiveType____source.setSrc(typeToTAbstractType);
		typeToTAbstractType__ePrimitiveType____source.setTrg(ePrimitiveType);
		ruleresult.getCreatedEdges().add(typeToTAbstractType__ePrimitiveType____source);
		typeToTAbstractType__tPrimitiveClass____target.setSrc(typeToTAbstractType);
		typeToTAbstractType__tPrimitiveClass____target.setTrg(tPrimitiveClass);
		ruleresult.getCreatedEdges().add(typeToTAbstractType__tPrimitiveClass____target);
		typeGraph__tPrimitiveClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tPrimitiveClass____ownedTypes.setTrg(tPrimitiveClass);
		ruleresult.getCreatedEdges().add(typeGraph__tPrimitiveClass____ownedTypes);
		tPrimitiveClass__typeGraph____model.setSrc(tPrimitiveClass);
		tPrimitiveClass__typeGraph____model.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tPrimitiveClass__typeGraph____model);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eModel__ePrimitiveType____orphanTypes.setName(eModel__ePrimitiveType____orphanTypes_name_prime);
		typeGraph__tPrimitiveClass____classes.setName(typeGraph__tPrimitiveClass____classes_name_prime);
		typeToTAbstractType__ePrimitiveType____source.setName(typeToTAbstractType__ePrimitiveType____source_name_prime);
		typeToTAbstractType__tPrimitiveClass____target
				.setName(typeToTAbstractType__tPrimitiveClass____target_name_prime);
		typeGraph__tPrimitiveClass____ownedTypes.setName(typeGraph__tPrimitiveClass____ownedTypes_name_prime);
		tPrimitiveClass__typeGraph____model.setName(tPrimitiveClass__typeGraph____model_name_prime);
		return new Object[] { ruleresult, ePrimitiveType, typeGraph, typeToTAbstractType, tPrimitiveClass, eModel,
				eModel__ePrimitiveType____orphanTypes, typeGraph__tPrimitiveClass____classes,
				typeToTAbstractType__ePrimitiveType____source, typeToTAbstractType__tPrimitiveClass____target,
				typeGraph__tPrimitiveClass____ownedTypes, tPrimitiveClass__typeGraph____model };
	}

	public static final void pattern_PrimitiveTypeIsByte_1_5_registerobjects_expressionBBBBBBBB(
			PrimitiveTypeIsByte _this, PerformRuleResult ruleresult, EObject ePrimitiveType, EObject eModelToTypeGraph,
			EObject typeGraph, EObject typeToTAbstractType, EObject tPrimitiveClass, EObject eModel) {
		_this.registerObjects_FWD(ruleresult, ePrimitiveType, eModelToTypeGraph, typeGraph, typeToTAbstractType,
				tPrimitiveClass, eModel);

	}

	public static final PerformRuleResult pattern_PrimitiveTypeIsByte_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_2_1_preparereturnvalue_bindingFB(
			PrimitiveTypeIsByte _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_2_1_preparereturnvalue_blackFBB(EClass eClass,
			PrimitiveTypeIsByte _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_2_1_preparereturnvalue_bindingAndBlackFFB(
			PrimitiveTypeIsByte _this) {
		Object[] result_pattern_PrimitiveTypeIsByte_2_1_preparereturnvalue_binding = pattern_PrimitiveTypeIsByte_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrimitiveTypeIsByte_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_PrimitiveTypeIsByte_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrimitiveTypeIsByte_2_1_preparereturnvalue_black = pattern_PrimitiveTypeIsByte_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_PrimitiveTypeIsByte_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PrimitiveTypeIsByte_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "PrimitiveTypeIsByte";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("ePrimitiveType");
		EObject _localVariable_1 = match.getObject("eModel");
		EObject tmpEPrimitiveType = _localVariable_0;
		EObject tmpEModel = _localVariable_1;
		if (tmpEPrimitiveType instanceof PrimitiveTypeByte) {
			PrimitiveTypeByte ePrimitiveType = (PrimitiveTypeByte) tmpEPrimitiveType;
			if (tmpEModel instanceof Model) {
				Model eModel = (Model) tmpEModel;
				return new Object[] { ePrimitiveType, eModel, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeIsByte_2_2_corematch_blackBFFBB(
			PrimitiveTypeByte ePrimitiveType, Model eModel, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph eModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eModel, ModelToTypeGraph.class, "source")) {
			TypeGraph typeGraph = eModelToTypeGraph.getTarget();
			if (typeGraph != null) {
				_result.add(new Object[] { ePrimitiveType, eModelToTypeGraph, typeGraph, eModel, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeIsByte_2_3_findcontext_blackBBBB(
			PrimitiveTypeByte ePrimitiveType, ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Model eModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (eModel.getOrphanTypes().contains(ePrimitiveType)) {
			if (eModel.equals(eModelToTypeGraph.getSource())) {
				if (typeGraph.equals(eModelToTypeGraph.getTarget())) {
					_result.add(new Object[] { ePrimitiveType, eModelToTypeGraph, typeGraph, eModel });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_2_3_findcontext_greenBBBBFFFF(
			PrimitiveTypeByte ePrimitiveType, ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Model eModel) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eModel__ePrimitiveType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToTypeGraph__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToTypeGraph__typeGraph____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eModel__ePrimitiveType____orphanTypes_name_prime = "orphanTypes";
		String eModelToTypeGraph__eModel____source_name_prime = "source";
		String eModelToTypeGraph__typeGraph____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(ePrimitiveType);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(eModel);
		eModel__ePrimitiveType____orphanTypes.setSrc(eModel);
		eModel__ePrimitiveType____orphanTypes.setTrg(ePrimitiveType);
		isApplicableMatch.getAllContextElements().add(eModel__ePrimitiveType____orphanTypes);
		eModelToTypeGraph__eModel____source.setSrc(eModelToTypeGraph);
		eModelToTypeGraph__eModel____source.setTrg(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph__eModel____source);
		eModelToTypeGraph__typeGraph____target.setSrc(eModelToTypeGraph);
		eModelToTypeGraph__typeGraph____target.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph__typeGraph____target);
		eModel__ePrimitiveType____orphanTypes.setName(eModel__ePrimitiveType____orphanTypes_name_prime);
		eModelToTypeGraph__eModel____source.setName(eModelToTypeGraph__eModel____source_name_prime);
		eModelToTypeGraph__typeGraph____target.setName(eModelToTypeGraph__typeGraph____target_name_prime);
		return new Object[] { ePrimitiveType, eModelToTypeGraph, typeGraph, eModel, isApplicableMatch,
				eModel__ePrimitiveType____orphanTypes, eModelToTypeGraph__eModel____source,
				eModelToTypeGraph__typeGraph____target };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_2_4_solveCSP_bindingFBBBBBB(PrimitiveTypeIsByte _this,
			IsApplicableMatch isApplicableMatch, PrimitiveTypeByte ePrimitiveType, ModelToTypeGraph eModelToTypeGraph,
			TypeGraph typeGraph, Model eModel) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, ePrimitiveType, eModelToTypeGraph,
				typeGraph, eModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ePrimitiveType, eModelToTypeGraph, typeGraph, eModel };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_2_4_solveCSP_bindingAndBlackFBBBBBB(
			PrimitiveTypeIsByte _this, IsApplicableMatch isApplicableMatch, PrimitiveTypeByte ePrimitiveType,
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Model eModel) {
		Object[] result_pattern_PrimitiveTypeIsByte_2_4_solveCSP_binding = pattern_PrimitiveTypeIsByte_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, ePrimitiveType, eModelToTypeGraph, typeGraph, eModel);
		if (result_pattern_PrimitiveTypeIsByte_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeIsByte_2_4_solveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeIsByte_2_4_solveCSP_black = pattern_PrimitiveTypeIsByte_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeIsByte_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ePrimitiveType, eModelToTypeGraph, typeGraph,
						eModel };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeIsByte_2_5_checkCSP_expressionFBB(PrimitiveTypeIsByte _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PrimitiveTypeIsByte";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PrimitiveTypeIsByte_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_10_1_initialbindings_blackBBBB(PrimitiveTypeIsByte _this,
			Match match, TypeGraph typeGraph, TClass tPrimitiveClass) {
		return new Object[] { _this, match, typeGraph, tPrimitiveClass };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_10_2_SolveCSP_bindingFBBBB(PrimitiveTypeIsByte _this,
			Match match, TypeGraph typeGraph, TClass tPrimitiveClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, typeGraph, tPrimitiveClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, typeGraph, tPrimitiveClass };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_10_2_SolveCSP_bindingAndBlackFBBBB(
			PrimitiveTypeIsByte _this, Match match, TypeGraph typeGraph, TClass tPrimitiveClass) {
		Object[] result_pattern_PrimitiveTypeIsByte_10_2_SolveCSP_binding = pattern_PrimitiveTypeIsByte_10_2_SolveCSP_bindingFBBBB(
				_this, match, typeGraph, tPrimitiveClass);
		if (result_pattern_PrimitiveTypeIsByte_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeIsByte_10_2_SolveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeIsByte_10_2_SolveCSP_black = pattern_PrimitiveTypeIsByte_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeIsByte_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, typeGraph, tPrimitiveClass };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeIsByte_10_3_CheckCSP_expressionFBB(PrimitiveTypeIsByte _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_10_4_collectelementstobetranslated_blackBBB(Match match,
			TypeGraph typeGraph, TClass tPrimitiveClass) {
		return new Object[] { match, typeGraph, tPrimitiveClass };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_10_4_collectelementstobetranslated_greenBBBFFF(Match match,
			TypeGraph typeGraph, TClass tPrimitiveClass) {
		EMoflonEdge typeGraph__tPrimitiveClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tPrimitiveClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPrimitiveClass__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tPrimitiveClass);
		String typeGraph__tPrimitiveClass____classes_name_prime = "classes";
		String typeGraph__tPrimitiveClass____ownedTypes_name_prime = "ownedTypes";
		String tPrimitiveClass__typeGraph____model_name_prime = "model";
		typeGraph__tPrimitiveClass____classes.setSrc(typeGraph);
		typeGraph__tPrimitiveClass____classes.setTrg(tPrimitiveClass);
		match.getToBeTranslatedEdges().add(typeGraph__tPrimitiveClass____classes);
		typeGraph__tPrimitiveClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tPrimitiveClass____ownedTypes.setTrg(tPrimitiveClass);
		match.getToBeTranslatedEdges().add(typeGraph__tPrimitiveClass____ownedTypes);
		tPrimitiveClass__typeGraph____model.setSrc(tPrimitiveClass);
		tPrimitiveClass__typeGraph____model.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tPrimitiveClass__typeGraph____model);
		typeGraph__tPrimitiveClass____classes.setName(typeGraph__tPrimitiveClass____classes_name_prime);
		typeGraph__tPrimitiveClass____ownedTypes.setName(typeGraph__tPrimitiveClass____ownedTypes_name_prime);
		tPrimitiveClass__typeGraph____model.setName(tPrimitiveClass__typeGraph____model_name_prime);
		return new Object[] { match, typeGraph, tPrimitiveClass, typeGraph__tPrimitiveClass____classes,
				typeGraph__tPrimitiveClass____ownedTypes, tPrimitiveClass__typeGraph____model };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_10_5_collectcontextelements_blackBBB(Match match,
			TypeGraph typeGraph, TClass tPrimitiveClass) {
		return new Object[] { match, typeGraph, tPrimitiveClass };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_10_5_collectcontextelements_greenBB(Match match,
			TypeGraph typeGraph) {
		match.getContextNodes().add(typeGraph);
		return new Object[] { match, typeGraph };
	}

	public static final void pattern_PrimitiveTypeIsByte_10_6_registerobjectstomatch_expressionBBBB(
			PrimitiveTypeIsByte _this, Match match, TypeGraph typeGraph, TClass tPrimitiveClass) {
		_this.registerObjectsToMatch_BWD(match, typeGraph, tPrimitiveClass);

	}

	public static final boolean pattern_PrimitiveTypeIsByte_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeIsByte_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eModelToTypeGraph");
		EObject _localVariable_1 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("tPrimitiveClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("eModel");
		EObject tmpEModelToTypeGraph = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTPrimitiveClass = _localVariable_2;
		EObject tmpEModel = _localVariable_3;
		if (tmpEModelToTypeGraph instanceof ModelToTypeGraph) {
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) tmpEModelToTypeGraph;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTPrimitiveClass instanceof TClass) {
					TClass tPrimitiveClass = (TClass) tmpTPrimitiveClass;
					if (tmpEModel instanceof Model) {
						Model eModel = (Model) tmpEModel;
						return new Object[] { eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_11_1_performtransformation_blackBBBBFBB(
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel,
			PrimitiveTypeIsByte _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_11_1_performtransformation_bindingAndBlackFFFFFBB(
			PrimitiveTypeIsByte _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PrimitiveTypeIsByte_11_1_performtransformation_binding = pattern_PrimitiveTypeIsByte_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_PrimitiveTypeIsByte_11_1_performtransformation_binding != null) {
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result_pattern_PrimitiveTypeIsByte_11_1_performtransformation_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_PrimitiveTypeIsByte_11_1_performtransformation_binding[1];
			TClass tPrimitiveClass = (TClass) result_pattern_PrimitiveTypeIsByte_11_1_performtransformation_binding[2];
			Model eModel = (Model) result_pattern_PrimitiveTypeIsByte_11_1_performtransformation_binding[3];

			Object[] result_pattern_PrimitiveTypeIsByte_11_1_performtransformation_black = pattern_PrimitiveTypeIsByte_11_1_performtransformation_blackBBBBFBB(
					eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel, _this, isApplicableMatch);
			if (result_pattern_PrimitiveTypeIsByte_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_PrimitiveTypeIsByte_11_1_performtransformation_black[4];

				return new Object[] { eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_11_1_performtransformation_greenFFBB(
			TClass tPrimitiveClass, Model eModel) {
		PrimitiveTypeByte ePrimitiveType = JavaFactory.eINSTANCE.createPrimitiveTypeByte();
		TypeToTAbstractType typeToTAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		eModel.getOrphanTypes().add(ePrimitiveType);
		typeToTAbstractType.setSource(ePrimitiveType);
		typeToTAbstractType.setTarget(tPrimitiveClass);
		return new Object[] { ePrimitiveType, typeToTAbstractType, tPrimitiveClass, eModel };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_11_2_collecttranslatedelements_blackBBB(
			PrimitiveTypeByte ePrimitiveType, TypeToTAbstractType typeToTAbstractType, TClass tPrimitiveClass) {
		return new Object[] { ePrimitiveType, typeToTAbstractType, tPrimitiveClass };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_11_2_collecttranslatedelements_greenFBBB(
			PrimitiveTypeByte ePrimitiveType, TypeToTAbstractType typeToTAbstractType, TClass tPrimitiveClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(ePrimitiveType);
		ruleresult.getCreatedLinkElements().add(typeToTAbstractType);
		ruleresult.getTranslatedElements().add(tPrimitiveClass);
		return new Object[] { ruleresult, ePrimitiveType, typeToTAbstractType, tPrimitiveClass };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject ePrimitiveType, EObject eModelToTypeGraph, EObject typeGraph,
			EObject typeToTAbstractType, EObject tPrimitiveClass, EObject eModel) {
		if (!ePrimitiveType.equals(typeGraph)) {
			if (!ePrimitiveType.equals(typeToTAbstractType)) {
				if (!ePrimitiveType.equals(tPrimitiveClass)) {
					if (!eModelToTypeGraph.equals(ePrimitiveType)) {
						if (!eModelToTypeGraph.equals(typeGraph)) {
							if (!eModelToTypeGraph.equals(typeToTAbstractType)) {
								if (!eModelToTypeGraph.equals(tPrimitiveClass)) {
									if (!typeGraph.equals(typeToTAbstractType)) {
										if (!tPrimitiveClass.equals(typeGraph)) {
											if (!tPrimitiveClass.equals(typeToTAbstractType)) {
												if (!eModel.equals(ePrimitiveType)) {
													if (!eModel.equals(eModelToTypeGraph)) {
														if (!eModel.equals(typeGraph)) {
															if (!eModel.equals(typeToTAbstractType)) {
																if (!eModel.equals(tPrimitiveClass)) {
																	return new Object[] { ruleresult, ePrimitiveType,
																			eModelToTypeGraph, typeGraph,
																			typeToTAbstractType, tPrimitiveClass,
																			eModel };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_PrimitiveTypeIsByte_11_3_bookkeepingforedges_greenBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject ePrimitiveType, EObject typeGraph, EObject typeToTAbstractType,
			EObject tPrimitiveClass, EObject eModel) {
		EMoflonEdge eModel__ePrimitiveType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tPrimitiveClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeToTAbstractType__ePrimitiveType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeToTAbstractType__tPrimitiveClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tPrimitiveClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPrimitiveClass__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "PrimitiveTypeIsByte";
		String eModel__ePrimitiveType____orphanTypes_name_prime = "orphanTypes";
		String typeGraph__tPrimitiveClass____classes_name_prime = "classes";
		String typeToTAbstractType__ePrimitiveType____source_name_prime = "source";
		String typeToTAbstractType__tPrimitiveClass____target_name_prime = "target";
		String typeGraph__tPrimitiveClass____ownedTypes_name_prime = "ownedTypes";
		String tPrimitiveClass__typeGraph____model_name_prime = "model";
		eModel__ePrimitiveType____orphanTypes.setSrc(eModel);
		eModel__ePrimitiveType____orphanTypes.setTrg(ePrimitiveType);
		ruleresult.getCreatedEdges().add(eModel__ePrimitiveType____orphanTypes);
		typeGraph__tPrimitiveClass____classes.setSrc(typeGraph);
		typeGraph__tPrimitiveClass____classes.setTrg(tPrimitiveClass);
		ruleresult.getTranslatedEdges().add(typeGraph__tPrimitiveClass____classes);
		typeToTAbstractType__ePrimitiveType____source.setSrc(typeToTAbstractType);
		typeToTAbstractType__ePrimitiveType____source.setTrg(ePrimitiveType);
		ruleresult.getCreatedEdges().add(typeToTAbstractType__ePrimitiveType____source);
		typeToTAbstractType__tPrimitiveClass____target.setSrc(typeToTAbstractType);
		typeToTAbstractType__tPrimitiveClass____target.setTrg(tPrimitiveClass);
		ruleresult.getCreatedEdges().add(typeToTAbstractType__tPrimitiveClass____target);
		typeGraph__tPrimitiveClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tPrimitiveClass____ownedTypes.setTrg(tPrimitiveClass);
		ruleresult.getTranslatedEdges().add(typeGraph__tPrimitiveClass____ownedTypes);
		tPrimitiveClass__typeGraph____model.setSrc(tPrimitiveClass);
		tPrimitiveClass__typeGraph____model.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tPrimitiveClass__typeGraph____model);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eModel__ePrimitiveType____orphanTypes.setName(eModel__ePrimitiveType____orphanTypes_name_prime);
		typeGraph__tPrimitiveClass____classes.setName(typeGraph__tPrimitiveClass____classes_name_prime);
		typeToTAbstractType__ePrimitiveType____source.setName(typeToTAbstractType__ePrimitiveType____source_name_prime);
		typeToTAbstractType__tPrimitiveClass____target
				.setName(typeToTAbstractType__tPrimitiveClass____target_name_prime);
		typeGraph__tPrimitiveClass____ownedTypes.setName(typeGraph__tPrimitiveClass____ownedTypes_name_prime);
		tPrimitiveClass__typeGraph____model.setName(tPrimitiveClass__typeGraph____model_name_prime);
		return new Object[] { ruleresult, ePrimitiveType, typeGraph, typeToTAbstractType, tPrimitiveClass, eModel,
				eModel__ePrimitiveType____orphanTypes, typeGraph__tPrimitiveClass____classes,
				typeToTAbstractType__ePrimitiveType____source, typeToTAbstractType__tPrimitiveClass____target,
				typeGraph__tPrimitiveClass____ownedTypes, tPrimitiveClass__typeGraph____model };
	}

	public static final void pattern_PrimitiveTypeIsByte_11_5_registerobjects_expressionBBBBBBBB(
			PrimitiveTypeIsByte _this, PerformRuleResult ruleresult, EObject ePrimitiveType, EObject eModelToTypeGraph,
			EObject typeGraph, EObject typeToTAbstractType, EObject tPrimitiveClass, EObject eModel) {
		_this.registerObjects_BWD(ruleresult, ePrimitiveType, eModelToTypeGraph, typeGraph, typeToTAbstractType,
				tPrimitiveClass, eModel);

	}

	public static final PerformRuleResult pattern_PrimitiveTypeIsByte_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_12_1_preparereturnvalue_bindingFB(
			PrimitiveTypeIsByte _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_12_1_preparereturnvalue_blackFBB(EClass eClass,
			PrimitiveTypeIsByte _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_12_1_preparereturnvalue_bindingAndBlackFFB(
			PrimitiveTypeIsByte _this) {
		Object[] result_pattern_PrimitiveTypeIsByte_12_1_preparereturnvalue_binding = pattern_PrimitiveTypeIsByte_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrimitiveTypeIsByte_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_PrimitiveTypeIsByte_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrimitiveTypeIsByte_12_1_preparereturnvalue_black = pattern_PrimitiveTypeIsByte_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_PrimitiveTypeIsByte_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PrimitiveTypeIsByte_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "PrimitiveTypeIsByte";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("typeGraph");
		EObject _localVariable_1 = match.getObject("tPrimitiveClass");
		EObject tmpTypeGraph = _localVariable_0;
		EObject tmpTPrimitiveClass = _localVariable_1;
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			if (tmpTPrimitiveClass instanceof TClass) {
				TClass tPrimitiveClass = (TClass) tmpTPrimitiveClass;
				return new Object[] { typeGraph, tPrimitiveClass, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeIsByte_12_2_corematch_blackFBBFB(TypeGraph typeGraph,
			TClass tPrimitiveClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		String tPrimitiveClass_tName = tPrimitiveClass.getTName();
		if (tPrimitiveClass_tName.equals("byte")) {
			boolean tPrimitiveClass_tLib = tPrimitiveClass.isTLib();
			if (Boolean.valueOf(tPrimitiveClass_tLib).equals(Boolean.valueOf(true))) {
				for (ModelToTypeGraph eModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(typeGraph, ModelToTypeGraph.class, "target")) {
					Model eModel = eModelToTypeGraph.getSource();
					if (eModel != null) {
						_result.add(new Object[] { eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel, match });
					}

				}
			}

		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeIsByte_12_3_findcontext_blackBBBB(
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (typeGraph.getClasses().contains(tPrimitiveClass)) {
			if (eModel.equals(eModelToTypeGraph.getSource())) {
				if (typeGraph.equals(eModelToTypeGraph.getTarget())) {
					if (typeGraph.getOwnedTypes().contains(tPrimitiveClass)) {
						String tPrimitiveClass_tName = tPrimitiveClass.getTName();
						if (tPrimitiveClass_tName.equals("byte")) {
							boolean tPrimitiveClass_tLib = tPrimitiveClass.isTLib();
							if (Boolean.valueOf(tPrimitiveClass_tLib).equals(Boolean.valueOf(true))) {
								_result.add(new Object[] { eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel });
							}

						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_12_3_findcontext_greenBBBBFFFFFF(
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge typeGraph__tPrimitiveClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToTypeGraph__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToTypeGraph__typeGraph____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tPrimitiveClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPrimitiveClass__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String typeGraph__tPrimitiveClass____classes_name_prime = "classes";
		String eModelToTypeGraph__eModel____source_name_prime = "source";
		String eModelToTypeGraph__typeGraph____target_name_prime = "target";
		String typeGraph__tPrimitiveClass____ownedTypes_name_prime = "ownedTypes";
		String tPrimitiveClass__typeGraph____model_name_prime = "model";
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tPrimitiveClass);
		isApplicableMatch.getAllContextElements().add(eModel);
		typeGraph__tPrimitiveClass____classes.setSrc(typeGraph);
		typeGraph__tPrimitiveClass____classes.setTrg(tPrimitiveClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tPrimitiveClass____classes);
		eModelToTypeGraph__eModel____source.setSrc(eModelToTypeGraph);
		eModelToTypeGraph__eModel____source.setTrg(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph__eModel____source);
		eModelToTypeGraph__typeGraph____target.setSrc(eModelToTypeGraph);
		eModelToTypeGraph__typeGraph____target.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph__typeGraph____target);
		typeGraph__tPrimitiveClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tPrimitiveClass____ownedTypes.setTrg(tPrimitiveClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tPrimitiveClass____ownedTypes);
		tPrimitiveClass__typeGraph____model.setSrc(tPrimitiveClass);
		tPrimitiveClass__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tPrimitiveClass__typeGraph____model);
		typeGraph__tPrimitiveClass____classes.setName(typeGraph__tPrimitiveClass____classes_name_prime);
		eModelToTypeGraph__eModel____source.setName(eModelToTypeGraph__eModel____source_name_prime);
		eModelToTypeGraph__typeGraph____target.setName(eModelToTypeGraph__typeGraph____target_name_prime);
		typeGraph__tPrimitiveClass____ownedTypes.setName(typeGraph__tPrimitiveClass____ownedTypes_name_prime);
		tPrimitiveClass__typeGraph____model.setName(tPrimitiveClass__typeGraph____model_name_prime);
		return new Object[] { eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel, isApplicableMatch,
				typeGraph__tPrimitiveClass____classes, eModelToTypeGraph__eModel____source,
				eModelToTypeGraph__typeGraph____target, typeGraph__tPrimitiveClass____ownedTypes,
				tPrimitiveClass__typeGraph____model };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_12_4_solveCSP_bindingFBBBBBB(PrimitiveTypeIsByte _this,
			IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph,
			TClass tPrimitiveClass, Model eModel) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, eModelToTypeGraph, typeGraph,
				tPrimitiveClass, eModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eModelToTypeGraph, typeGraph, tPrimitiveClass,
					eModel };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_12_4_solveCSP_bindingAndBlackFBBBBBB(
			PrimitiveTypeIsByte _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToTypeGraph,
			TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel) {
		Object[] result_pattern_PrimitiveTypeIsByte_12_4_solveCSP_binding = pattern_PrimitiveTypeIsByte_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, eModelToTypeGraph, typeGraph, tPrimitiveClass, eModel);
		if (result_pattern_PrimitiveTypeIsByte_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeIsByte_12_4_solveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeIsByte_12_4_solveCSP_black = pattern_PrimitiveTypeIsByte_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeIsByte_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eModelToTypeGraph, typeGraph, tPrimitiveClass,
						eModel };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeIsByte_12_5_checkCSP_expressionFBB(PrimitiveTypeIsByte _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PrimitiveTypeIsByte";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PrimitiveTypeIsByte_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_20_1_preparereturnvalue_bindingFB(
			PrimitiveTypeIsByte _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			PrimitiveTypeIsByte _this) {
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

	public static final Object[] pattern_PrimitiveTypeIsByte_20_1_preparereturnvalue_bindingAndBlackFFBF(
			PrimitiveTypeIsByte _this) {
		Object[] result_pattern_PrimitiveTypeIsByte_20_1_preparereturnvalue_binding = pattern_PrimitiveTypeIsByte_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrimitiveTypeIsByte_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_PrimitiveTypeIsByte_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrimitiveTypeIsByte_20_1_preparereturnvalue_black = pattern_PrimitiveTypeIsByte_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_PrimitiveTypeIsByte_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PrimitiveTypeIsByte_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_PrimitiveTypeIsByte_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_20_2_testcorematchandDECs_black_nac_0B(
			TClass tPrimitiveClass) {
		for (TPackage __DEC_tPrimitiveClass_classes_163079 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tPrimitiveClass, TPackage.class, "classes")) {
			return new Object[] { tPrimitiveClass };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_20_2_testcorematchandDECs_black_nac_1BB(
			TClass tPrimitiveClass, TypeGraph typeGraph) {
		for (TypeGraph __DEC_tPrimitiveClass_classes_330007 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tPrimitiveClass, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tPrimitiveClass_classes_330007)) {
				return new Object[] { tPrimitiveClass, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_20_2_testcorematchandDECs_black_nac_2B(
			TClass tPrimitiveClass) {
		TPackage __DEC_tPrimitiveClass_ownedTypes_725274 = tPrimitiveClass.getPackage();
		if (__DEC_tPrimitiveClass_ownedTypes_725274 != null) {
			return new Object[] { tPrimitiveClass };
		}

		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_20_2_testcorematchandDECs_black_nac_3B(
			TClass tPrimitiveClass) {
		TAbstractType __DEC_tPrimitiveClass_innerTypes_724161 = tPrimitiveClass.getOuterType();
		if (__DEC_tPrimitiveClass_innerTypes_724161 != null) {
			if (!tPrimitiveClass.equals(__DEC_tPrimitiveClass_innerTypes_724161)) {
				return new Object[] { tPrimitiveClass };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeIsByte_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_classes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTypeGraph = _edge_classes.getSrc();
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			EObject tmpTPrimitiveClass = _edge_classes.getTrg();
			if (tmpTPrimitiveClass instanceof TClass) {
				TClass tPrimitiveClass = (TClass) tmpTPrimitiveClass;
				if (typeGraph.getClasses().contains(tPrimitiveClass)) {
					if (typeGraph.getOwnedTypes().contains(tPrimitiveClass)) {
						String tPrimitiveClass_tName = tPrimitiveClass.getTName();
						if (tPrimitiveClass_tName.equals("byte")) {
							boolean tPrimitiveClass_tLib = tPrimitiveClass.isTLib();
							if (Boolean.valueOf(tPrimitiveClass_tLib).equals(Boolean.valueOf(true))) {
								if (pattern_PrimitiveTypeIsByte_20_2_testcorematchandDECs_black_nac_0B(
										tPrimitiveClass) == null) {
									if (pattern_PrimitiveTypeIsByte_20_2_testcorematchandDECs_black_nac_1BB(
											tPrimitiveClass, typeGraph) == null) {
										if (pattern_PrimitiveTypeIsByte_20_2_testcorematchandDECs_black_nac_2B(
												tPrimitiveClass) == null) {
											if (pattern_PrimitiveTypeIsByte_20_2_testcorematchandDECs_black_nac_3B(
													tPrimitiveClass) == null) {
												_result.add(new Object[] { typeGraph, tPrimitiveClass, _edge_classes });
											}
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

	public static final Object[] pattern_PrimitiveTypeIsByte_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PrimitiveTypeIsByte_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			PrimitiveTypeIsByte _this, Match match, TypeGraph typeGraph, TClass tPrimitiveClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, typeGraph, tPrimitiveClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeIsByte_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			PrimitiveTypeIsByte _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_PrimitiveTypeIsByte_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_21_1_preparereturnvalue_bindingFB(
			PrimitiveTypeIsByte _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			PrimitiveTypeIsByte _this) {
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

	public static final Object[] pattern_PrimitiveTypeIsByte_21_1_preparereturnvalue_bindingAndBlackFFBF(
			PrimitiveTypeIsByte _this) {
		Object[] result_pattern_PrimitiveTypeIsByte_21_1_preparereturnvalue_binding = pattern_PrimitiveTypeIsByte_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PrimitiveTypeIsByte_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_PrimitiveTypeIsByte_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PrimitiveTypeIsByte_21_1_preparereturnvalue_black = pattern_PrimitiveTypeIsByte_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_PrimitiveTypeIsByte_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PrimitiveTypeIsByte_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_PrimitiveTypeIsByte_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeIsByte_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_orphanTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEModel = _edge_orphanTypes.getSrc();
		if (tmpEModel instanceof Model) {
			Model eModel = (Model) tmpEModel;
			EObject tmpEPrimitiveType = _edge_orphanTypes.getTrg();
			if (tmpEPrimitiveType instanceof PrimitiveTypeByte) {
				PrimitiveTypeByte ePrimitiveType = (PrimitiveTypeByte) tmpEPrimitiveType;
				if (eModel.getOrphanTypes().contains(ePrimitiveType)) {
					_result.add(new Object[] { ePrimitiveType, eModel, _edge_orphanTypes });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PrimitiveTypeIsByte_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			PrimitiveTypeIsByte _this, Match match, PrimitiveTypeByte ePrimitiveType, Model eModel) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, ePrimitiveType, eModel);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeIsByte_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			PrimitiveTypeIsByte _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_PrimitiveTypeIsByte_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_24_1_prepare_blackB(PrimitiveTypeIsByte _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("ePrimitiveType");
		EObject _localVariable_1 = targetMatch.getObject("typeGraph");
		EObject _localVariable_2 = targetMatch.getObject("tPrimitiveClass");
		EObject _localVariable_3 = sourceMatch.getObject("eModel");
		EObject tmpEPrimitiveType = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTPrimitiveClass = _localVariable_2;
		EObject tmpEModel = _localVariable_3;
		if (tmpEPrimitiveType instanceof PrimitiveTypeByte) {
			PrimitiveTypeByte ePrimitiveType = (PrimitiveTypeByte) tmpEPrimitiveType;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTPrimitiveClass instanceof TClass) {
					TClass tPrimitiveClass = (TClass) tmpTPrimitiveClass;
					if (tmpEModel instanceof Model) {
						Model eModel = (Model) tmpEModel;
						return new Object[] { ePrimitiveType, typeGraph, tPrimitiveClass, eModel, sourceMatch,
								targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_24_2_matchsrctrgcontext_blackBBBBBB(
			PrimitiveTypeByte ePrimitiveType, TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			String tPrimitiveClass_tName = tPrimitiveClass.getTName();
			if (tPrimitiveClass_tName.equals("byte")) {
				boolean tPrimitiveClass_tLib = tPrimitiveClass.isTLib();
				if (Boolean.valueOf(tPrimitiveClass_tLib).equals(Boolean.valueOf(true))) {
					return new Object[] { ePrimitiveType, typeGraph, tPrimitiveClass, eModel, sourceMatch,
							targetMatch };
				}

			}

		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_PrimitiveTypeIsByte_24_2_matchsrctrgcontext_binding = pattern_PrimitiveTypeIsByte_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_PrimitiveTypeIsByte_24_2_matchsrctrgcontext_binding != null) {
			PrimitiveTypeByte ePrimitiveType = (PrimitiveTypeByte) result_pattern_PrimitiveTypeIsByte_24_2_matchsrctrgcontext_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_PrimitiveTypeIsByte_24_2_matchsrctrgcontext_binding[1];
			TClass tPrimitiveClass = (TClass) result_pattern_PrimitiveTypeIsByte_24_2_matchsrctrgcontext_binding[2];
			Model eModel = (Model) result_pattern_PrimitiveTypeIsByte_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_PrimitiveTypeIsByte_24_2_matchsrctrgcontext_black = pattern_PrimitiveTypeIsByte_24_2_matchsrctrgcontext_blackBBBBBB(
					ePrimitiveType, typeGraph, tPrimitiveClass, eModel, sourceMatch, targetMatch);
			if (result_pattern_PrimitiveTypeIsByte_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { ePrimitiveType, typeGraph, tPrimitiveClass, eModel, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_24_3_solvecsp_bindingFBBBBBBB(PrimitiveTypeIsByte _this,
			PrimitiveTypeByte ePrimitiveType, TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(ePrimitiveType, typeGraph, tPrimitiveClass, eModel,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, ePrimitiveType, typeGraph, tPrimitiveClass, eModel, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			PrimitiveTypeIsByte _this, PrimitiveTypeByte ePrimitiveType, TypeGraph typeGraph, TClass tPrimitiveClass,
			Model eModel, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_PrimitiveTypeIsByte_24_3_solvecsp_binding = pattern_PrimitiveTypeIsByte_24_3_solvecsp_bindingFBBBBBBB(
				_this, ePrimitiveType, typeGraph, tPrimitiveClass, eModel, sourceMatch, targetMatch);
		if (result_pattern_PrimitiveTypeIsByte_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeIsByte_24_3_solvecsp_binding[0];

			Object[] result_pattern_PrimitiveTypeIsByte_24_3_solvecsp_black = pattern_PrimitiveTypeIsByte_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_PrimitiveTypeIsByte_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, ePrimitiveType, typeGraph, tPrimitiveClass, eModel, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeIsByte_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeIsByte_24_5_matchcorrcontext_blackFBBBB(
			TypeGraph typeGraph, Model eModel, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph eModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eModel, ModelToTypeGraph.class, "source")) {
				if (typeGraph.equals(eModelToTypeGraph.getTarget())) {
					_result.add(new Object[] { eModelToTypeGraph, typeGraph, eModel, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_24_5_matchcorrcontext_greenBBBF(
			ModelToTypeGraph eModelToTypeGraph, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "PrimitiveTypeIsByte";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eModelToTypeGraph);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eModelToTypeGraph, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_24_6_createcorrespondence_blackBBBBB(
			PrimitiveTypeByte ePrimitiveType, TypeGraph typeGraph, TClass tPrimitiveClass, Model eModel,
			CCMatch ccMatch) {
		return new Object[] { ePrimitiveType, typeGraph, tPrimitiveClass, eModel, ccMatch };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_24_6_createcorrespondence_greenBFBB(
			PrimitiveTypeByte ePrimitiveType, TClass tPrimitiveClass, CCMatch ccMatch) {
		TypeToTAbstractType typeToTAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		typeToTAbstractType.setSource(ePrimitiveType);
		typeToTAbstractType.setTarget(tPrimitiveClass);
		ccMatch.getCreateCorr().add(typeToTAbstractType);
		return new Object[] { ePrimitiveType, typeToTAbstractType, tPrimitiveClass, ccMatch };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "PrimitiveTypeIsByte";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_PrimitiveTypeIsByte_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_27_1_matchtggpattern_blackBB(
			PrimitiveTypeByte ePrimitiveType, Model eModel) {
		if (eModel.getOrphanTypes().contains(ePrimitiveType)) {
			return new Object[] { ePrimitiveType, eModel };
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeIsByte_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeIsByte_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_28_1_matchtggpattern_black_nac_0B(TClass tPrimitiveClass) {
		for (TPackage __DEC_tPrimitiveClass_classes_853993 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tPrimitiveClass, TPackage.class, "classes")) {
			return new Object[] { tPrimitiveClass };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_28_1_matchtggpattern_black_nac_1BB(TClass tPrimitiveClass,
			TypeGraph typeGraph) {
		for (TypeGraph __DEC_tPrimitiveClass_classes_109173 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tPrimitiveClass, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tPrimitiveClass_classes_109173)) {
				return new Object[] { tPrimitiveClass, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_28_1_matchtggpattern_black_nac_2B(TClass tPrimitiveClass) {
		TPackage __DEC_tPrimitiveClass_ownedTypes_533218 = tPrimitiveClass.getPackage();
		if (__DEC_tPrimitiveClass_ownedTypes_533218 != null) {
			return new Object[] { tPrimitiveClass };
		}

		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_28_1_matchtggpattern_black_nac_3B(TClass tPrimitiveClass) {
		TAbstractType __DEC_tPrimitiveClass_innerTypes_42291 = tPrimitiveClass.getOuterType();
		if (__DEC_tPrimitiveClass_innerTypes_42291 != null) {
			if (!tPrimitiveClass.equals(__DEC_tPrimitiveClass_innerTypes_42291)) {
				return new Object[] { tPrimitiveClass };
			}
		}

		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_28_1_matchtggpattern_blackBB(TypeGraph typeGraph,
			TClass tPrimitiveClass) {
		if (typeGraph.getClasses().contains(tPrimitiveClass)) {
			if (typeGraph.getOwnedTypes().contains(tPrimitiveClass)) {
				if (pattern_PrimitiveTypeIsByte_28_1_matchtggpattern_black_nac_0B(tPrimitiveClass) == null) {
					if (pattern_PrimitiveTypeIsByte_28_1_matchtggpattern_black_nac_1BB(tPrimitiveClass,
							typeGraph) == null) {
						if (pattern_PrimitiveTypeIsByte_28_1_matchtggpattern_black_nac_2B(tPrimitiveClass) == null) {
							if (pattern_PrimitiveTypeIsByte_28_1_matchtggpattern_black_nac_3B(
									tPrimitiveClass) == null) {
								return new Object[] { typeGraph, tPrimitiveClass };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_28_1_matchtggpattern_greenB(TClass tPrimitiveClass) {
		String tPrimitiveClass_tName_prime = "byte";
		boolean tPrimitiveClass_tLib_prime = Boolean.valueOf(true);
		tPrimitiveClass.setTName(tPrimitiveClass_tName_prime);
		tPrimitiveClass.setTLib(Boolean.valueOf(tPrimitiveClass_tLib_prime));
		return new Object[] { tPrimitiveClass };
	}

	public static final boolean pattern_PrimitiveTypeIsByte_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PrimitiveTypeIsByte_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_29_1_createresult_blackB(PrimitiveTypeIsByte _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph eModelToTypeGraph) {
		if (ruleResult.getCorrObjects().contains(eModelToTypeGraph)) {
			return new Object[] { ruleResult, eModelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Model eModel) {
		if (ruleResult.getSourceObjects().contains(eModel)) {
			return new Object[] { ruleResult, eModel };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PrimitiveTypeIsByte_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eModelToTypeGraphList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEModelToTypeGraph : eModelToTypeGraphList.getEntryObjects()) {
				if (tmpEModelToTypeGraph instanceof ModelToTypeGraph) {
					ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) tmpEModelToTypeGraph;
					TypeGraph typeGraph = eModelToTypeGraph.getTarget();
					if (typeGraph != null) {
						Model eModel = eModelToTypeGraph.getSource();
						if (eModel != null) {
							if (pattern_PrimitiveTypeIsByte_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									eModelToTypeGraph) == null) {
								if (pattern_PrimitiveTypeIsByte_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										typeGraph) == null) {
									if (pattern_PrimitiveTypeIsByte_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											eModel) == null) {
										_result.add(new Object[] { eModelToTypeGraphList, eModelToTypeGraph, typeGraph,
												eModel, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_PrimitiveTypeIsByte_29_3_solveCSP_bindingFBBBBBB(PrimitiveTypeIsByte _this,
			IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Model eModel,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eModelToTypeGraph, typeGraph, eModel,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eModelToTypeGraph, typeGraph, eModel, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_29_3_solveCSP_bindingAndBlackFBBBBBB(
			PrimitiveTypeIsByte _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToTypeGraph,
			TypeGraph typeGraph, Model eModel, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_PrimitiveTypeIsByte_29_3_solveCSP_binding = pattern_PrimitiveTypeIsByte_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, eModelToTypeGraph, typeGraph, eModel, ruleResult);
		if (result_pattern_PrimitiveTypeIsByte_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PrimitiveTypeIsByte_29_3_solveCSP_binding[0];

			Object[] result_pattern_PrimitiveTypeIsByte_29_3_solveCSP_black = pattern_PrimitiveTypeIsByte_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_PrimitiveTypeIsByte_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eModelToTypeGraph, typeGraph, eModel, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_PrimitiveTypeIsByte_29_4_checkCSP_expressionFBB(PrimitiveTypeIsByte _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_29_5_checknacs_blackBBB(ModelToTypeGraph eModelToTypeGraph,
			TypeGraph typeGraph, Model eModel) {
		return new Object[] { eModelToTypeGraph, typeGraph, eModel };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_29_6_perform_blackBBBB(ModelToTypeGraph eModelToTypeGraph,
			TypeGraph typeGraph, Model eModel, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { eModelToTypeGraph, typeGraph, eModel, ruleResult };
	}

	public static final Object[] pattern_PrimitiveTypeIsByte_29_6_perform_greenFBFFBB(TypeGraph typeGraph, Model eModel,
			ModelgeneratorRuleResult ruleResult) {
		PrimitiveTypeByte ePrimitiveType = JavaFactory.eINSTANCE.createPrimitiveTypeByte();
		TypeToTAbstractType typeToTAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		TClass tPrimitiveClass = BasicFactory.eINSTANCE.createTClass();
		String tPrimitiveClass_tName_prime = "byte";
		boolean tPrimitiveClass_tLib_prime = Boolean.valueOf(true);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		eModel.getOrphanTypes().add(ePrimitiveType);
		ruleResult.getSourceObjects().add(ePrimitiveType);
		typeToTAbstractType.setSource(ePrimitiveType);
		ruleResult.getCorrObjects().add(typeToTAbstractType);
		typeGraph.getClasses().add(tPrimitiveClass);
		typeToTAbstractType.setTarget(tPrimitiveClass);
		typeGraph.getOwnedTypes().add(tPrimitiveClass);
		ruleResult.getTargetObjects().add(tPrimitiveClass);
		tPrimitiveClass.setTName(tPrimitiveClass_tName_prime);
		tPrimitiveClass.setTLib(Boolean.valueOf(tPrimitiveClass_tLib_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { ePrimitiveType, typeGraph, typeToTAbstractType, tPrimitiveClass, eModel, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_PrimitiveTypeIsByte_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PrimitiveTypeIsByteImpl
