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
import org.eclipse.modisco.java.ClassFile;
import org.eclipse.modisco.java.NamedElement;
import org.eclipse.modisco.java.Type;

import org.gravity.tgg.modisco.pm.ElementToModule;

import org.gravity.tgg.modisco.pm.Rules.RulesPackage;
import org.gravity.tgg.modisco.pm.Rules.TypeInClassFileToModule;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TModule;

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
 * An implementation of the model object '<em><b>Type In Class File To Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypeInClassFileToModuleImpl extends AbstractRuleImpl implements TypeInClassFileToModule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeInClassFileToModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTypeInClassFileToModule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ClassFile cu, AbstractTypeDeclaration mType) {

		Object[] result1_black = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_0_1_initialbindings_blackBBBB(this, match, cu, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cu] = " + cu + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, cu, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cu] = " + cu + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeInClassFileToModuleImpl
					.pattern_TypeInClassFileToModule_0_4_collectelementstobetranslated_blackBBB(match, cu, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cu] = " + cu + ", " + "[mType] = " + mType + ".");
			}
			TypeInClassFileToModuleImpl
					.pattern_TypeInClassFileToModule_0_4_collectelementstobetranslated_greenBBBF(match, cu, mType);
			//nothing EMoflonEdge mType__cu____originalClassFile = (EMoflonEdge) result4_green[3];

			Object[] result5_black = TypeInClassFileToModuleImpl
					.pattern_TypeInClassFileToModule_0_5_collectcontextelements_blackBBB(match, cu, mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cu] = " + cu + ", " + "[mType] = " + mType + ".");
			}
			TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_0_5_collectcontextelements_greenBBB(match, cu,
					mType);

			// 
			TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_0_6_registerobjectstomatch_expressionBBBB(this,
					match, cu, mType);
			return TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_0_7_expressionF();
		} else {
			return TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ClassFile cu = (ClassFile) result1_bindingAndBlack[0];
		ElementToModule cu2m = (ElementToModule) result1_bindingAndBlack[1];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[2];
		TModule module = (TModule) result1_bindingAndBlack[3];
		TypeToTAbstractType type = (TypeToTAbstractType) result1_bindingAndBlack[4];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_1_1_performtransformation_greenBB(tType, module);

		Object[] result2_green = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, cu, cu2m, tType,
						module, type, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[cu] = " + cu + ", " + "[cu2m] = " + cu2m + ", " + "[tType] = " + tType + ", "
					+ "[module] = " + module + ", " + "[type] = " + type + ", " + "[mType] = " + mType + ".");
		}
		TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_1_3_bookkeepingforedges_greenBBBBBFFF(ruleresult,
				cu, tType, module, mType);
		//nothing EMoflonEdge mType__cu____originalClassFile = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge tType__module____module = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge module__tType____contains = (EMoflonEdge) result3_green[7];

		// 
		// 
		TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, cu, cu2m, tType, module, type, mType);
		return TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ClassFile cu = (ClassFile) result2_binding[0];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_binding[1];
		for (Object[] result2_black : TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_2_2_corematch_blackBFFFFBB(cu, mType, match)) {
			ElementToModule cu2m = (ElementToModule) result2_black[1];
			TAbstractType tType = (TAbstractType) result2_black[2];
			TModule module = (TModule) result2_black[3];
			TypeToTAbstractType type = (TypeToTAbstractType) result2_black[4];
			// ForEach 
			for (Object[] result3_black : TypeInClassFileToModuleImpl
					.pattern_TypeInClassFileToModule_2_3_findcontext_blackBBBBBB(cu, cu2m, tType, module, type,
							mType)) {
				Object[] result3_green = TypeInClassFileToModuleImpl
						.pattern_TypeInClassFileToModule_2_3_findcontext_greenBBBBBBFFFFFF(cu, cu2m, tType, module,
								type, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge type__tType____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge cu2m__cu____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge type__mType____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mType__cu____originalClassFile = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge cu2m__module____target = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = TypeInClassFileToModuleImpl
						.pattern_TypeInClassFileToModule_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								cu, cu2m, tType, module, type, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[cu] = " + cu + ", " + "[cu2m] = "
							+ cu2m + ", " + "[tType] = " + tType + ", " + "[module] = " + module + ", " + "[type] = "
							+ type + ", " + "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeInClassFileToModuleImpl
							.pattern_TypeInClassFileToModule_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ClassFile cu, AbstractTypeDeclaration mType) {
		match.registerObject("cu", cu);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ClassFile cu, AbstractTypeDeclaration mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ClassFile cu, ElementToModule cu2m,
			TAbstractType tType, TModule module, TypeToTAbstractType type, AbstractTypeDeclaration mType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("cu", cu);
		isApplicableMatch.registerObject("cu2m", cu2m);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("module", module);
		isApplicableMatch.registerObject("type", type);
		isApplicableMatch.registerObject("mType", mType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject cu, EObject cu2m, EObject tType,
			EObject module, EObject type, EObject mType) {
		ruleresult.registerObject("cu", cu);
		ruleresult.registerObject("cu2m", cu2m);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("module", module);
		ruleresult.registerObject("type", type);
		ruleresult.registerObject("mType", mType);

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
	public boolean isAppropriate_BWD(Match match, TAbstractType tType, TModule module) {

		Object[] result1_black = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_10_1_initialbindings_blackBBBB(this, match, tType, module);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[module] = " + module + ".");
		}

		Object[] result2_bindingAndBlack = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tType, module);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[module] = " + module + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeInClassFileToModuleImpl
					.pattern_TypeInClassFileToModule_10_4_collectelementstobetranslated_blackBBB(match, tType, module);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tType] = " + tType + ", " + "[module] = " + module + ".");
			}
			TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_10_4_collectelementstobetranslated_greenBBBFF(
					match, tType, module);
			//nothing EMoflonEdge tType__module____module = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge module__tType____contains = (EMoflonEdge) result4_green[4];

			Object[] result5_black = TypeInClassFileToModuleImpl
					.pattern_TypeInClassFileToModule_10_5_collectcontextelements_blackBBB(match, tType, module);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tType] = " + tType + ", " + "[module] = " + module + ".");
			}
			TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_10_5_collectcontextelements_greenBBB(match,
					tType, module);

			// 
			TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_10_6_registerobjectstomatch_expressionBBBB(this,
					match, tType, module);
			return TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_10_7_expressionF();
		} else {
			return TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ClassFile cu = (ClassFile) result1_bindingAndBlack[0];
		ElementToModule cu2m = (ElementToModule) result1_bindingAndBlack[1];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[2];
		TModule module = (TModule) result1_bindingAndBlack[3];
		TypeToTAbstractType type = (TypeToTAbstractType) result1_bindingAndBlack[4];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_11_1_performtransformation_greenBB(cu, mType);

		Object[] result2_green = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, cu, cu2m, tType,
						module, type, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[cu] = " + cu + ", " + "[cu2m] = " + cu2m + ", " + "[tType] = " + tType + ", "
					+ "[module] = " + module + ", " + "[type] = " + type + ", " + "[mType] = " + mType + ".");
		}
		TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_11_3_bookkeepingforedges_greenBBBBBFFF(ruleresult,
				cu, tType, module, mType);
		//nothing EMoflonEdge mType__cu____originalClassFile = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge tType__module____module = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge module__tType____contains = (EMoflonEdge) result3_green[7];

		// 
		// 
		TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_11_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, cu, cu2m, tType, module, type, mType);
		return TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAbstractType tType = (TAbstractType) result2_binding[0];
		TModule module = (TModule) result2_binding[1];
		for (Object[] result2_black : TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_12_2_corematch_blackFFBBFFB(tType, module, match)) {
			ClassFile cu = (ClassFile) result2_black[0];
			ElementToModule cu2m = (ElementToModule) result2_black[1];
			TypeToTAbstractType type = (TypeToTAbstractType) result2_black[4];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[5];
			// ForEach 
			for (Object[] result3_black : TypeInClassFileToModuleImpl
					.pattern_TypeInClassFileToModule_12_3_findcontext_blackBBBBBB(cu, cu2m, tType, module, type,
							mType)) {
				Object[] result3_green = TypeInClassFileToModuleImpl
						.pattern_TypeInClassFileToModule_12_3_findcontext_greenBBBBBBFFFFFFF(cu, cu2m, tType, module,
								type, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge type__tType____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge cu2m__cu____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge type__mType____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge cu2m__module____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tType__module____module = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge module__tType____contains = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = TypeInClassFileToModuleImpl
						.pattern_TypeInClassFileToModule_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								cu, cu2m, tType, module, type, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[cu] = " + cu + ", " + "[cu2m] = "
							+ cu2m + ", " + "[tType] = " + tType + ", " + "[module] = " + module + ", " + "[type] = "
							+ type + ", " + "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = TypeInClassFileToModuleImpl
							.pattern_TypeInClassFileToModule_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAbstractType tType, TModule module) {
		match.registerObject("tType", tType);
		match.registerObject("module", module);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAbstractType tType, TModule module) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassFile cu, ElementToModule cu2m,
			TAbstractType tType, TModule module, TypeToTAbstractType type, AbstractTypeDeclaration mType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("cu", cu);
		isApplicableMatch.registerObject("cu2m", cu2m);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("module", module);
		isApplicableMatch.registerObject("type", type);
		isApplicableMatch.registerObject("mType", mType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject cu, EObject cu2m, EObject tType,
			EObject module, EObject type, EObject mType) {
		ruleresult.registerObject("cu", cu);
		ruleresult.registerObject("cu2m", cu2m);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("module", module);
		ruleresult.registerObject("type", type);
		ruleresult.registerObject("mType", mType);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_58(EMoflonEdge _edge_module) {

		Object[] result1_bindingAndBlack = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_20_2_testcorematchandDECs_blackFFB(_edge_module)) {
			TAbstractType tType = (TAbstractType) result2_black[0];
			TModule module = (TModule) result2_black[1];
			Object[] result2_green = TypeInClassFileToModuleImpl
					.pattern_TypeInClassFileToModule_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeInClassFileToModuleImpl
					.pattern_TypeInClassFileToModule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tType, module)) {
				// 
				if (TypeInClassFileToModuleImpl
						.pattern_TypeInClassFileToModule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeInClassFileToModuleImpl
							.pattern_TypeInClassFileToModule_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_62(EMoflonEdge _edge_originalClassFile) {

		Object[] result1_bindingAndBlack = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_21_2_testcorematchandDECs_blackFFB(_edge_originalClassFile)) {
			ClassFile cu = (ClassFile) result2_black[0];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[1];
			Object[] result2_green = TypeInClassFileToModuleImpl
					.pattern_TypeInClassFileToModule_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeInClassFileToModuleImpl
					.pattern_TypeInClassFileToModule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, cu, mType)) {
				// 
				if (TypeInClassFileToModuleImpl
						.pattern_TypeInClassFileToModule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeInClassFileToModuleImpl
							.pattern_TypeInClassFileToModule_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TypeInClassFileToModule");
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
		ruleResult.setRule("TypeInClassFileToModule");
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

		Object[] result1_black = TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		ClassFile cu = (ClassFile) result2_bindingAndBlack[0];
		TAbstractType tType = (TAbstractType) result2_bindingAndBlack[1];
		TModule module = (TModule) result2_bindingAndBlack[2];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, cu, tType, module, mType,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[cu] = " + cu + ", " + "[tType] = " + tType + ", " + "[module] = " + module + ", " + "[mType] = "
					+ mType + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypeInClassFileToModuleImpl
					.pattern_TypeInClassFileToModule_24_5_matchcorrcontext_blackBFBBFBBB(cu, tType, module, mType,
							sourceMatch, targetMatch)) {
				ElementToModule cu2m = (ElementToModule) result5_black[1];
				TypeToTAbstractType type = (TypeToTAbstractType) result5_black[4];
				Object[] result5_green = TypeInClassFileToModuleImpl
						.pattern_TypeInClassFileToModule_24_5_matchcorrcontext_greenBBBBF(cu2m, type, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = TypeInClassFileToModuleImpl
						.pattern_TypeInClassFileToModule_24_6_createcorrespondence_blackBBBBB(cu, tType, module, mType,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cu] = " + cu + ", "
							+ "[tType] = " + tType + ", " + "[module] = " + module + ", " + "[mType] = " + mType + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = TypeInClassFileToModuleImpl
						.pattern_TypeInClassFileToModule_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(ClassFile cu, TAbstractType tType, TModule module,
			AbstractTypeDeclaration mType, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(ClassFile cu, AbstractTypeDeclaration mType) {// 
		Object[] result1_black = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_27_1_matchtggpattern_blackBB(cu, mType);
		if (result1_black != null) {
			return TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_27_2_expressionF();
		} else {
			return TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAbstractType tType, TModule module) {// 
		Object[] result1_black = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_28_1_matchtggpattern_blackBB(tType, module);
		if (result1_black != null) {
			return TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_28_2_expressionF();
		} else {
			return TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ElementToModule cu2mParameter,
			TypeToTAbstractType typeParameter) {

		Object[] result1_black = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : TypeInClassFileToModuleImpl
				.pattern_TypeInClassFileToModule_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList cu2mList = (RuleEntryList) result2_black[0];
			ClassFile cu = (ClassFile) result2_black[1];
			ElementToModule cu2m = (ElementToModule) result2_black[2];
			TModule module = (TModule) result2_black[3];
			//nothing RuleEntryList typeList = (RuleEntryList) result2_black[4];
			TAbstractType tType = (TAbstractType) result2_black[5];
			TypeToTAbstractType type = (TypeToTAbstractType) result2_black[6];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[7];

			Object[] result3_bindingAndBlack = TypeInClassFileToModuleImpl
					.pattern_TypeInClassFileToModule_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							cu, cu2m, tType, module, type, mType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[cu] = " + cu + ", " + "[cu2m] = "
						+ cu2m + ", " + "[tType] = " + tType + ", " + "[module] = " + module + ", " + "[type] = " + type
						+ ", " + "[mType] = " + mType + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = TypeInClassFileToModuleImpl
						.pattern_TypeInClassFileToModule_29_5_checknacs_blackBBBBBB(cu, cu2m, tType, module, type,
								mType);
				if (result5_black != null) {

					Object[] result6_black = TypeInClassFileToModuleImpl
							.pattern_TypeInClassFileToModule_29_6_perform_blackBBBBBBB(cu, cu2m, tType, module, type,
									mType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cu] = " + cu + ", "
								+ "[cu2m] = " + cu2m + ", " + "[tType] = " + tType + ", " + "[module] = " + module
								+ ", " + "[type] = " + type + ", " + "[mType] = " + mType + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_29_6_perform_greenBBBBB(cu, tType,
							module, mType, ruleResult);

				} else {
				}

			} else {
			}

		}
		return TypeInClassFileToModuleImpl.pattern_TypeInClassFileToModule_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ClassFile cu, ElementToModule cu2m,
			TAbstractType tType, TModule module, TypeToTAbstractType type, AbstractTypeDeclaration mType,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("cu", cu);
		isApplicableMatch.registerObject("cu2m", cu2m);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("module", module);
		isApplicableMatch.registerObject("type", type);
		isApplicableMatch.registerObject("mType", mType);
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
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___IS_APPROPRIATE_FWD__MATCH_CLASSFILE_ABSTRACTTYPEDECLARATION:
				return isAppropriate_FWD((Match) arguments.get(0), (ClassFile) arguments.get(1),
						(AbstractTypeDeclaration) arguments.get(2));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CLASSFILE_ABSTRACTTYPEDECLARATION:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (ClassFile) arguments.get(1),
						(AbstractTypeDeclaration) arguments.get(2));
				return null;
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CLASSFILE_ABSTRACTTYPEDECLARATION:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ClassFile) arguments.get(1),
						(AbstractTypeDeclaration) arguments.get(2));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASSFILE_ELEMENTTOMODULE_TABSTRACTTYPE_TMODULE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ClassFile) arguments.get(1),
						(ElementToModule) arguments.get(2), (TAbstractType) arguments.get(3),
						(TModule) arguments.get(4), (TypeToTAbstractType) arguments.get(5),
						(AbstractTypeDeclaration) arguments.get(6));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6));
				return null;
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___IS_APPROPRIATE_BWD__MATCH_TABSTRACTTYPE_TMODULE:
				return isAppropriate_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
						(TModule) arguments.get(2));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTTYPE_TMODULE:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
						(TModule) arguments.get(2));
				return null;
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTTYPE_TMODULE:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
						(TModule) arguments.get(2));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSFILE_ELEMENTTOMODULE_TABSTRACTTYPE_TMODULE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassFile) arguments.get(1),
						(ElementToModule) arguments.get(2), (TAbstractType) arguments.get(3),
						(TModule) arguments.get(4), (TypeToTAbstractType) arguments.get(5),
						(AbstractTypeDeclaration) arguments.get(6));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6));
				return null;
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_58__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_58((EMoflonEdge) arguments.get(0));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_62__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_62((EMoflonEdge) arguments.get(0));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___IS_APPLICABLE_SOLVE_CSP_CC__CLASSFILE_TABSTRACTTYPE_TMODULE_ABSTRACTTYPEDECLARATION_MATCH_MATCH:
				return isApplicable_solveCsp_CC((ClassFile) arguments.get(0), (TAbstractType) arguments.get(1),
						(TModule) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3),
						(Match) arguments.get(4), (Match) arguments.get(5));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___CHECK_DEC_FWD__CLASSFILE_ABSTRACTTYPEDECLARATION:
				return checkDEC_FWD((ClassFile) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___CHECK_DEC_BWD__TABSTRACTTYPE_TMODULE:
				return checkDEC_BWD((TAbstractType) arguments.get(0), (TModule) arguments.get(1));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___GENERATE_MODEL__RULEENTRYCONTAINER_ELEMENTTOMODULE_TYPETOTABSTRACTTYPE:
				return generateModel((RuleEntryContainer) arguments.get(0), (ElementToModule) arguments.get(1),
						(TypeToTAbstractType) arguments.get(2));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSFILE_ELEMENTTOMODULE_TABSTRACTTYPE_TMODULE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ClassFile) arguments.get(1),
						(ElementToModule) arguments.get(2), (TAbstractType) arguments.get(3),
						(TModule) arguments.get(4), (TypeToTAbstractType) arguments.get(5),
						(AbstractTypeDeclaration) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
			case RulesPackage.TYPE_IN_CLASS_FILE_TO_MODULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypeInClassFileToModule_0_1_initialbindings_blackBBBB(
			TypeInClassFileToModule _this, Match match, ClassFile cu, AbstractTypeDeclaration mType) {
		return new Object[] { _this, match, cu, mType };
	}

	public static final Object[] pattern_TypeInClassFileToModule_0_2_SolveCSP_bindingFBBBB(
			TypeInClassFileToModule _this, Match match, ClassFile cu, AbstractTypeDeclaration mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, cu, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, cu, mType };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeInClassFileToModule_0_2_SolveCSP_bindingAndBlackFBBBB(
			TypeInClassFileToModule _this, Match match, ClassFile cu, AbstractTypeDeclaration mType) {
		Object[] result_pattern_TypeInClassFileToModule_0_2_SolveCSP_binding = pattern_TypeInClassFileToModule_0_2_SolveCSP_bindingFBBBB(
				_this, match, cu, mType);
		if (result_pattern_TypeInClassFileToModule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeInClassFileToModule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeInClassFileToModule_0_2_SolveCSP_black = pattern_TypeInClassFileToModule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeInClassFileToModule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, cu, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeInClassFileToModule_0_3_CheckCSP_expressionFBB(
			TypeInClassFileToModule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_0_4_collectelementstobetranslated_blackBBB(Match match,
			ClassFile cu, AbstractTypeDeclaration mType) {
		return new Object[] { match, cu, mType };
	}

	public static final Object[] pattern_TypeInClassFileToModule_0_4_collectelementstobetranslated_greenBBBF(
			Match match, ClassFile cu, AbstractTypeDeclaration mType) {
		EMoflonEdge mType__cu____originalClassFile = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mType__cu____originalClassFile_name_prime = "originalClassFile";
		mType__cu____originalClassFile.setSrc(mType);
		mType__cu____originalClassFile.setTrg(cu);
		match.getToBeTranslatedEdges().add(mType__cu____originalClassFile);
		mType__cu____originalClassFile.setName(mType__cu____originalClassFile_name_prime);
		return new Object[] { match, cu, mType, mType__cu____originalClassFile };
	}

	public static final Object[] pattern_TypeInClassFileToModule_0_5_collectcontextelements_blackBBB(Match match,
			ClassFile cu, AbstractTypeDeclaration mType) {
		return new Object[] { match, cu, mType };
	}

	public static final Object[] pattern_TypeInClassFileToModule_0_5_collectcontextelements_greenBBB(Match match,
			ClassFile cu, AbstractTypeDeclaration mType) {
		match.getContextNodes().add(cu);
		match.getContextNodes().add(mType);
		return new Object[] { match, cu, mType };
	}

	public static final void pattern_TypeInClassFileToModule_0_6_registerobjectstomatch_expressionBBBB(
			TypeInClassFileToModule _this, Match match, ClassFile cu, AbstractTypeDeclaration mType) {
		_this.registerObjectsToMatch_FWD(match, cu, mType);

	}

	public static final boolean pattern_TypeInClassFileToModule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeInClassFileToModule_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("cu");
		EObject _localVariable_1 = isApplicableMatch.getObject("cu2m");
		EObject _localVariable_2 = isApplicableMatch.getObject("tType");
		EObject _localVariable_3 = isApplicableMatch.getObject("module");
		EObject _localVariable_4 = isApplicableMatch.getObject("type");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject tmpCu = _localVariable_0;
		EObject tmpCu2m = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpModule = _localVariable_3;
		EObject tmpType = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		if (tmpCu instanceof ClassFile) {
			ClassFile cu = (ClassFile) tmpCu;
			if (tmpCu2m instanceof ElementToModule) {
				ElementToModule cu2m = (ElementToModule) tmpCu2m;
				if (tmpTType instanceof TAbstractType) {
					TAbstractType tType = (TAbstractType) tmpTType;
					if (tmpModule instanceof TModule) {
						TModule module = (TModule) tmpModule;
						if (tmpType instanceof TypeToTAbstractType) {
							TypeToTAbstractType type = (TypeToTAbstractType) tmpType;
							if (tmpMType instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
								return new Object[] { cu, cu2m, tType, module, type, mType, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_1_1_performtransformation_blackBBBBBBFBB(ClassFile cu,
			ElementToModule cu2m, TAbstractType tType, TModule module, TypeToTAbstractType type,
			AbstractTypeDeclaration mType, TypeInClassFileToModule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { cu, cu2m, tType, module, type, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			TypeInClassFileToModule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeInClassFileToModule_1_1_performtransformation_binding = pattern_TypeInClassFileToModule_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeInClassFileToModule_1_1_performtransformation_binding != null) {
			ClassFile cu = (ClassFile) result_pattern_TypeInClassFileToModule_1_1_performtransformation_binding[0];
			ElementToModule cu2m = (ElementToModule) result_pattern_TypeInClassFileToModule_1_1_performtransformation_binding[1];
			TAbstractType tType = (TAbstractType) result_pattern_TypeInClassFileToModule_1_1_performtransformation_binding[2];
			TModule module = (TModule) result_pattern_TypeInClassFileToModule_1_1_performtransformation_binding[3];
			TypeToTAbstractType type = (TypeToTAbstractType) result_pattern_TypeInClassFileToModule_1_1_performtransformation_binding[4];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_TypeInClassFileToModule_1_1_performtransformation_binding[5];

			Object[] result_pattern_TypeInClassFileToModule_1_1_performtransformation_black = pattern_TypeInClassFileToModule_1_1_performtransformation_blackBBBBBBFBB(
					cu, cu2m, tType, module, type, mType, _this, isApplicableMatch);
			if (result_pattern_TypeInClassFileToModule_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeInClassFileToModule_1_1_performtransformation_black[6];

				return new Object[] { cu, cu2m, tType, module, type, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_1_1_performtransformation_greenBB(TAbstractType tType,
			TModule module) {
		tType.setModule(module);
		return new Object[] { tType, module };
	}

	public static final Object[] pattern_TypeInClassFileToModule_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_TypeInClassFileToModule_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject cu, EObject cu2m, EObject tType, EObject module, EObject type,
			EObject mType) {
		if (!cu.equals(cu2m)) {
			if (!cu.equals(tType)) {
				if (!cu.equals(module)) {
					if (!cu.equals(type)) {
						if (!cu.equals(mType)) {
							if (!cu2m.equals(tType)) {
								if (!cu2m.equals(module)) {
									if (!cu2m.equals(type)) {
										if (!cu2m.equals(mType)) {
											if (!tType.equals(type)) {
												if (!module.equals(tType)) {
													if (!module.equals(type)) {
														if (!mType.equals(tType)) {
															if (!mType.equals(module)) {
																if (!mType.equals(type)) {
																	return new Object[] { ruleresult, cu, cu2m, tType,
																			module, type, mType };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeInClassFileToModule_1_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject cu, EObject tType, EObject module, EObject mType) {
		EMoflonEdge mType__cu____originalClassFile = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__module____module = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge module__tType____contains = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeInClassFileToModule";
		String mType__cu____originalClassFile_name_prime = "originalClassFile";
		String tType__module____module_name_prime = "module";
		String module__tType____contains_name_prime = "contains";
		mType__cu____originalClassFile.setSrc(mType);
		mType__cu____originalClassFile.setTrg(cu);
		ruleresult.getTranslatedEdges().add(mType__cu____originalClassFile);
		tType__module____module.setSrc(tType);
		tType__module____module.setTrg(module);
		ruleresult.getCreatedEdges().add(tType__module____module);
		module__tType____contains.setSrc(module);
		module__tType____contains.setTrg(tType);
		ruleresult.getCreatedEdges().add(module__tType____contains);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mType__cu____originalClassFile.setName(mType__cu____originalClassFile_name_prime);
		tType__module____module.setName(tType__module____module_name_prime);
		module__tType____contains.setName(module__tType____contains_name_prime);
		return new Object[] { ruleresult, cu, tType, module, mType, mType__cu____originalClassFile,
				tType__module____module, module__tType____contains };
	}

	public static final void pattern_TypeInClassFileToModule_1_5_registerobjects_expressionBBBBBBBB(
			TypeInClassFileToModule _this, PerformRuleResult ruleresult, EObject cu, EObject cu2m, EObject tType,
			EObject module, EObject type, EObject mType) {
		_this.registerObjects_FWD(ruleresult, cu, cu2m, tType, module, type, mType);

	}

	public static final PerformRuleResult pattern_TypeInClassFileToModule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_2_1_preparereturnvalue_bindingFB(
			TypeInClassFileToModule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_2_1_preparereturnvalue_blackFBB(EClass eClass,
			TypeInClassFileToModule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_2_1_preparereturnvalue_bindingAndBlackFFB(
			TypeInClassFileToModule _this) {
		Object[] result_pattern_TypeInClassFileToModule_2_1_preparereturnvalue_binding = pattern_TypeInClassFileToModule_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeInClassFileToModule_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeInClassFileToModule_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeInClassFileToModule_2_1_preparereturnvalue_black = pattern_TypeInClassFileToModule_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeInClassFileToModule_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeInClassFileToModule_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeInClassFileToModule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeInClassFileToModule_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("cu");
		EObject _localVariable_1 = match.getObject("mType");
		EObject tmpCu = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		if (tmpCu instanceof ClassFile) {
			ClassFile cu = (ClassFile) tmpCu;
			if (tmpMType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
				return new Object[] { cu, mType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeInClassFileToModule_2_2_corematch_blackBFFFFBB(ClassFile cu,
			AbstractTypeDeclaration mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ElementToModule cu2m : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cu,
				ElementToModule.class, "source")) {
			TModule module = cu2m.getTarget();
			if (module != null) {
				for (TypeToTAbstractType type : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
					TAbstractType tType = type.getTarget();
					if (tType != null) {
						_result.add(new Object[] { cu, cu2m, tType, module, type, mType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeInClassFileToModule_2_3_findcontext_blackBBBBBB(ClassFile cu,
			ElementToModule cu2m, TAbstractType tType, TModule module, TypeToTAbstractType type,
			AbstractTypeDeclaration mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tType.equals(type.getTarget())) {
			if (cu.equals(cu2m.getSource())) {
				if (mType.equals(type.getSource())) {
					if (cu.equals(mType.getOriginalClassFile())) {
						if (module.equals(cu2m.getTarget())) {
							_result.add(new Object[] { cu, cu2m, tType, module, type, mType });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_2_3_findcontext_greenBBBBBBFFFFFF(ClassFile cu,
			ElementToModule cu2m, TAbstractType tType, TModule module, TypeToTAbstractType type,
			AbstractTypeDeclaration mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge type__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cu2m__cu____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__cu____originalClassFile = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cu2m__module____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String type__tType____target_name_prime = "target";
		String cu2m__cu____source_name_prime = "source";
		String type__mType____source_name_prime = "source";
		String mType__cu____originalClassFile_name_prime = "originalClassFile";
		String cu2m__module____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(cu);
		isApplicableMatch.getAllContextElements().add(cu2m);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(module);
		isApplicableMatch.getAllContextElements().add(type);
		isApplicableMatch.getAllContextElements().add(mType);
		type__tType____target.setSrc(type);
		type__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(type__tType____target);
		cu2m__cu____source.setSrc(cu2m);
		cu2m__cu____source.setTrg(cu);
		isApplicableMatch.getAllContextElements().add(cu2m__cu____source);
		type__mType____source.setSrc(type);
		type__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(type__mType____source);
		mType__cu____originalClassFile.setSrc(mType);
		mType__cu____originalClassFile.setTrg(cu);
		isApplicableMatch.getAllContextElements().add(mType__cu____originalClassFile);
		cu2m__module____target.setSrc(cu2m);
		cu2m__module____target.setTrg(module);
		isApplicableMatch.getAllContextElements().add(cu2m__module____target);
		type__tType____target.setName(type__tType____target_name_prime);
		cu2m__cu____source.setName(cu2m__cu____source_name_prime);
		type__mType____source.setName(type__mType____source_name_prime);
		mType__cu____originalClassFile.setName(mType__cu____originalClassFile_name_prime);
		cu2m__module____target.setName(cu2m__module____target_name_prime);
		return new Object[] { cu, cu2m, tType, module, type, mType, isApplicableMatch, type__tType____target,
				cu2m__cu____source, type__mType____source, mType__cu____originalClassFile, cu2m__module____target };
	}

	public static final Object[] pattern_TypeInClassFileToModule_2_4_solveCSP_bindingFBBBBBBBB(
			TypeInClassFileToModule _this, IsApplicableMatch isApplicableMatch, ClassFile cu, ElementToModule cu2m,
			TAbstractType tType, TModule module, TypeToTAbstractType type, AbstractTypeDeclaration mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, cu, cu2m, tType, module, type, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, cu, cu2m, tType, module, type, mType };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeInClassFileToModule_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			TypeInClassFileToModule _this, IsApplicableMatch isApplicableMatch, ClassFile cu, ElementToModule cu2m,
			TAbstractType tType, TModule module, TypeToTAbstractType type, AbstractTypeDeclaration mType) {
		Object[] result_pattern_TypeInClassFileToModule_2_4_solveCSP_binding = pattern_TypeInClassFileToModule_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, cu, cu2m, tType, module, type, mType);
		if (result_pattern_TypeInClassFileToModule_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeInClassFileToModule_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypeInClassFileToModule_2_4_solveCSP_black = pattern_TypeInClassFileToModule_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeInClassFileToModule_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, cu, cu2m, tType, module, type, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeInClassFileToModule_2_5_checkCSP_expressionFBB(
			TypeInClassFileToModule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeInClassFileToModule_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeInClassFileToModule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeInClassFileToModule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_10_1_initialbindings_blackBBBB(
			TypeInClassFileToModule _this, Match match, TAbstractType tType, TModule module) {
		return new Object[] { _this, match, tType, module };
	}

	public static final Object[] pattern_TypeInClassFileToModule_10_2_SolveCSP_bindingFBBBB(
			TypeInClassFileToModule _this, Match match, TAbstractType tType, TModule module) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tType, module);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tType, module };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeInClassFileToModule_10_2_SolveCSP_bindingAndBlackFBBBB(
			TypeInClassFileToModule _this, Match match, TAbstractType tType, TModule module) {
		Object[] result_pattern_TypeInClassFileToModule_10_2_SolveCSP_binding = pattern_TypeInClassFileToModule_10_2_SolveCSP_bindingFBBBB(
				_this, match, tType, module);
		if (result_pattern_TypeInClassFileToModule_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeInClassFileToModule_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeInClassFileToModule_10_2_SolveCSP_black = pattern_TypeInClassFileToModule_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeInClassFileToModule_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tType, module };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeInClassFileToModule_10_3_CheckCSP_expressionFBB(
			TypeInClassFileToModule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_10_4_collectelementstobetranslated_blackBBB(
			Match match, TAbstractType tType, TModule module) {
		return new Object[] { match, tType, module };
	}

	public static final Object[] pattern_TypeInClassFileToModule_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, TAbstractType tType, TModule module) {
		EMoflonEdge tType__module____module = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge module__tType____contains = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tType__module____module_name_prime = "module";
		String module__tType____contains_name_prime = "contains";
		tType__module____module.setSrc(tType);
		tType__module____module.setTrg(module);
		match.getToBeTranslatedEdges().add(tType__module____module);
		module__tType____contains.setSrc(module);
		module__tType____contains.setTrg(tType);
		match.getToBeTranslatedEdges().add(module__tType____contains);
		tType__module____module.setName(tType__module____module_name_prime);
		module__tType____contains.setName(module__tType____contains_name_prime);
		return new Object[] { match, tType, module, tType__module____module, module__tType____contains };
	}

	public static final Object[] pattern_TypeInClassFileToModule_10_5_collectcontextelements_blackBBB(Match match,
			TAbstractType tType, TModule module) {
		return new Object[] { match, tType, module };
	}

	public static final Object[] pattern_TypeInClassFileToModule_10_5_collectcontextelements_greenBBB(Match match,
			TAbstractType tType, TModule module) {
		match.getContextNodes().add(tType);
		match.getContextNodes().add(module);
		return new Object[] { match, tType, module };
	}

	public static final void pattern_TypeInClassFileToModule_10_6_registerobjectstomatch_expressionBBBB(
			TypeInClassFileToModule _this, Match match, TAbstractType tType, TModule module) {
		_this.registerObjectsToMatch_BWD(match, tType, module);

	}

	public static final boolean pattern_TypeInClassFileToModule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeInClassFileToModule_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("cu");
		EObject _localVariable_1 = isApplicableMatch.getObject("cu2m");
		EObject _localVariable_2 = isApplicableMatch.getObject("tType");
		EObject _localVariable_3 = isApplicableMatch.getObject("module");
		EObject _localVariable_4 = isApplicableMatch.getObject("type");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject tmpCu = _localVariable_0;
		EObject tmpCu2m = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpModule = _localVariable_3;
		EObject tmpType = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		if (tmpCu instanceof ClassFile) {
			ClassFile cu = (ClassFile) tmpCu;
			if (tmpCu2m instanceof ElementToModule) {
				ElementToModule cu2m = (ElementToModule) tmpCu2m;
				if (tmpTType instanceof TAbstractType) {
					TAbstractType tType = (TAbstractType) tmpTType;
					if (tmpModule instanceof TModule) {
						TModule module = (TModule) tmpModule;
						if (tmpType instanceof TypeToTAbstractType) {
							TypeToTAbstractType type = (TypeToTAbstractType) tmpType;
							if (tmpMType instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
								return new Object[] { cu, cu2m, tType, module, type, mType, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_11_1_performtransformation_blackBBBBBBFBB(ClassFile cu,
			ElementToModule cu2m, TAbstractType tType, TModule module, TypeToTAbstractType type,
			AbstractTypeDeclaration mType, TypeInClassFileToModule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { cu, cu2m, tType, module, type, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			TypeInClassFileToModule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeInClassFileToModule_11_1_performtransformation_binding = pattern_TypeInClassFileToModule_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeInClassFileToModule_11_1_performtransformation_binding != null) {
			ClassFile cu = (ClassFile) result_pattern_TypeInClassFileToModule_11_1_performtransformation_binding[0];
			ElementToModule cu2m = (ElementToModule) result_pattern_TypeInClassFileToModule_11_1_performtransformation_binding[1];
			TAbstractType tType = (TAbstractType) result_pattern_TypeInClassFileToModule_11_1_performtransformation_binding[2];
			TModule module = (TModule) result_pattern_TypeInClassFileToModule_11_1_performtransformation_binding[3];
			TypeToTAbstractType type = (TypeToTAbstractType) result_pattern_TypeInClassFileToModule_11_1_performtransformation_binding[4];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_TypeInClassFileToModule_11_1_performtransformation_binding[5];

			Object[] result_pattern_TypeInClassFileToModule_11_1_performtransformation_black = pattern_TypeInClassFileToModule_11_1_performtransformation_blackBBBBBBFBB(
					cu, cu2m, tType, module, type, mType, _this, isApplicableMatch);
			if (result_pattern_TypeInClassFileToModule_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeInClassFileToModule_11_1_performtransformation_black[6];

				return new Object[] { cu, cu2m, tType, module, type, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_11_1_performtransformation_greenBB(ClassFile cu,
			AbstractTypeDeclaration mType) {
		mType.setOriginalClassFile(cu);
		return new Object[] { cu, mType };
	}

	public static final Object[] pattern_TypeInClassFileToModule_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_TypeInClassFileToModule_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject cu, EObject cu2m, EObject tType, EObject module, EObject type,
			EObject mType) {
		if (!cu.equals(cu2m)) {
			if (!cu.equals(tType)) {
				if (!cu.equals(module)) {
					if (!cu.equals(type)) {
						if (!cu.equals(mType)) {
							if (!cu2m.equals(tType)) {
								if (!cu2m.equals(module)) {
									if (!cu2m.equals(type)) {
										if (!cu2m.equals(mType)) {
											if (!tType.equals(type)) {
												if (!module.equals(tType)) {
													if (!module.equals(type)) {
														if (!mType.equals(tType)) {
															if (!mType.equals(module)) {
																if (!mType.equals(type)) {
																	return new Object[] { ruleresult, cu, cu2m, tType,
																			module, type, mType };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeInClassFileToModule_11_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject cu, EObject tType, EObject module, EObject mType) {
		EMoflonEdge mType__cu____originalClassFile = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__module____module = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge module__tType____contains = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeInClassFileToModule";
		String mType__cu____originalClassFile_name_prime = "originalClassFile";
		String tType__module____module_name_prime = "module";
		String module__tType____contains_name_prime = "contains";
		mType__cu____originalClassFile.setSrc(mType);
		mType__cu____originalClassFile.setTrg(cu);
		ruleresult.getCreatedEdges().add(mType__cu____originalClassFile);
		tType__module____module.setSrc(tType);
		tType__module____module.setTrg(module);
		ruleresult.getTranslatedEdges().add(tType__module____module);
		module__tType____contains.setSrc(module);
		module__tType____contains.setTrg(tType);
		ruleresult.getTranslatedEdges().add(module__tType____contains);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mType__cu____originalClassFile.setName(mType__cu____originalClassFile_name_prime);
		tType__module____module.setName(tType__module____module_name_prime);
		module__tType____contains.setName(module__tType____contains_name_prime);
		return new Object[] { ruleresult, cu, tType, module, mType, mType__cu____originalClassFile,
				tType__module____module, module__tType____contains };
	}

	public static final void pattern_TypeInClassFileToModule_11_5_registerobjects_expressionBBBBBBBB(
			TypeInClassFileToModule _this, PerformRuleResult ruleresult, EObject cu, EObject cu2m, EObject tType,
			EObject module, EObject type, EObject mType) {
		_this.registerObjects_BWD(ruleresult, cu, cu2m, tType, module, type, mType);

	}

	public static final PerformRuleResult pattern_TypeInClassFileToModule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_12_1_preparereturnvalue_bindingFB(
			TypeInClassFileToModule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_12_1_preparereturnvalue_blackFBB(EClass eClass,
			TypeInClassFileToModule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_12_1_preparereturnvalue_bindingAndBlackFFB(
			TypeInClassFileToModule _this) {
		Object[] result_pattern_TypeInClassFileToModule_12_1_preparereturnvalue_binding = pattern_TypeInClassFileToModule_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeInClassFileToModule_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeInClassFileToModule_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeInClassFileToModule_12_1_preparereturnvalue_black = pattern_TypeInClassFileToModule_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeInClassFileToModule_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeInClassFileToModule_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeInClassFileToModule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeInClassFileToModule_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tType");
		EObject _localVariable_1 = match.getObject("module");
		EObject tmpTType = _localVariable_0;
		EObject tmpModule = _localVariable_1;
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			if (tmpModule instanceof TModule) {
				TModule module = (TModule) tmpModule;
				return new Object[] { tType, module, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeInClassFileToModule_12_2_corematch_blackFFBBFFB(
			TAbstractType tType, TModule module, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType type : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(tType,
				TypeToTAbstractType.class, "target")) {
			Type tmpMType = type.getSource();
			if (tmpMType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
				for (ElementToModule cu2m : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(module,
						ElementToModule.class, "target")) {
					NamedElement tmpCu = cu2m.getSource();
					if (tmpCu instanceof ClassFile) {
						ClassFile cu = (ClassFile) tmpCu;
						_result.add(new Object[] { cu, cu2m, tType, module, type, mType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeInClassFileToModule_12_3_findcontext_blackBBBBBB(ClassFile cu,
			ElementToModule cu2m, TAbstractType tType, TModule module, TypeToTAbstractType type,
			AbstractTypeDeclaration mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tType.equals(type.getTarget())) {
			if (cu.equals(cu2m.getSource())) {
				if (mType.equals(type.getSource())) {
					if (module.equals(cu2m.getTarget())) {
						if (module.equals(tType.getModule())) {
							_result.add(new Object[] { cu, cu2m, tType, module, type, mType });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_12_3_findcontext_greenBBBBBBFFFFFFF(ClassFile cu,
			ElementToModule cu2m, TAbstractType tType, TModule module, TypeToTAbstractType type,
			AbstractTypeDeclaration mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge type__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cu2m__cu____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cu2m__module____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__module____module = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge module__tType____contains = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String type__tType____target_name_prime = "target";
		String cu2m__cu____source_name_prime = "source";
		String type__mType____source_name_prime = "source";
		String cu2m__module____target_name_prime = "target";
		String tType__module____module_name_prime = "module";
		String module__tType____contains_name_prime = "contains";
		isApplicableMatch.getAllContextElements().add(cu);
		isApplicableMatch.getAllContextElements().add(cu2m);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(module);
		isApplicableMatch.getAllContextElements().add(type);
		isApplicableMatch.getAllContextElements().add(mType);
		type__tType____target.setSrc(type);
		type__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(type__tType____target);
		cu2m__cu____source.setSrc(cu2m);
		cu2m__cu____source.setTrg(cu);
		isApplicableMatch.getAllContextElements().add(cu2m__cu____source);
		type__mType____source.setSrc(type);
		type__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(type__mType____source);
		cu2m__module____target.setSrc(cu2m);
		cu2m__module____target.setTrg(module);
		isApplicableMatch.getAllContextElements().add(cu2m__module____target);
		tType__module____module.setSrc(tType);
		tType__module____module.setTrg(module);
		isApplicableMatch.getAllContextElements().add(tType__module____module);
		module__tType____contains.setSrc(module);
		module__tType____contains.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(module__tType____contains);
		type__tType____target.setName(type__tType____target_name_prime);
		cu2m__cu____source.setName(cu2m__cu____source_name_prime);
		type__mType____source.setName(type__mType____source_name_prime);
		cu2m__module____target.setName(cu2m__module____target_name_prime);
		tType__module____module.setName(tType__module____module_name_prime);
		module__tType____contains.setName(module__tType____contains_name_prime);
		return new Object[] { cu, cu2m, tType, module, type, mType, isApplicableMatch, type__tType____target,
				cu2m__cu____source, type__mType____source, cu2m__module____target, tType__module____module,
				module__tType____contains };
	}

	public static final Object[] pattern_TypeInClassFileToModule_12_4_solveCSP_bindingFBBBBBBBB(
			TypeInClassFileToModule _this, IsApplicableMatch isApplicableMatch, ClassFile cu, ElementToModule cu2m,
			TAbstractType tType, TModule module, TypeToTAbstractType type, AbstractTypeDeclaration mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, cu, cu2m, tType, module, type, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, cu, cu2m, tType, module, type, mType };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeInClassFileToModule_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			TypeInClassFileToModule _this, IsApplicableMatch isApplicableMatch, ClassFile cu, ElementToModule cu2m,
			TAbstractType tType, TModule module, TypeToTAbstractType type, AbstractTypeDeclaration mType) {
		Object[] result_pattern_TypeInClassFileToModule_12_4_solveCSP_binding = pattern_TypeInClassFileToModule_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, cu, cu2m, tType, module, type, mType);
		if (result_pattern_TypeInClassFileToModule_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeInClassFileToModule_12_4_solveCSP_binding[0];

			Object[] result_pattern_TypeInClassFileToModule_12_4_solveCSP_black = pattern_TypeInClassFileToModule_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeInClassFileToModule_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, cu, cu2m, tType, module, type, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeInClassFileToModule_12_5_checkCSP_expressionFBB(
			TypeInClassFileToModule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeInClassFileToModule_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeInClassFileToModule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeInClassFileToModule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_20_1_preparereturnvalue_bindingFB(
			TypeInClassFileToModule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypeInClassFileToModule _this) {
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

	public static final Object[] pattern_TypeInClassFileToModule_20_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeInClassFileToModule _this) {
		Object[] result_pattern_TypeInClassFileToModule_20_1_preparereturnvalue_binding = pattern_TypeInClassFileToModule_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeInClassFileToModule_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeInClassFileToModule_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeInClassFileToModule_20_1_preparereturnvalue_black = pattern_TypeInClassFileToModule_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeInClassFileToModule_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeInClassFileToModule_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeInClassFileToModule_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_TypeInClassFileToModule_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_module) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTType = _edge_module.getSrc();
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			EObject tmpModule = _edge_module.getTrg();
			if (tmpModule instanceof TModule) {
				TModule module = (TModule) tmpModule;
				if (module.equals(tType.getModule())) {
					_result.add(new Object[] { tType, module, _edge_module });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeInClassFileToModule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			TypeInClassFileToModule _this, Match match, TAbstractType tType, TModule module) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tType, module);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeInClassFileToModule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeInClassFileToModule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeInClassFileToModule_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_21_1_preparereturnvalue_bindingFB(
			TypeInClassFileToModule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypeInClassFileToModule _this) {
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

	public static final Object[] pattern_TypeInClassFileToModule_21_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeInClassFileToModule _this) {
		Object[] result_pattern_TypeInClassFileToModule_21_1_preparereturnvalue_binding = pattern_TypeInClassFileToModule_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeInClassFileToModule_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeInClassFileToModule_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeInClassFileToModule_21_1_preparereturnvalue_black = pattern_TypeInClassFileToModule_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeInClassFileToModule_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeInClassFileToModule_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeInClassFileToModule_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_TypeInClassFileToModule_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_originalClassFile) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMType = _edge_originalClassFile.getSrc();
		if (tmpMType instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
			EObject tmpCu = _edge_originalClassFile.getTrg();
			if (tmpCu instanceof ClassFile) {
				ClassFile cu = (ClassFile) tmpCu;
				if (cu.equals(mType.getOriginalClassFile())) {
					_result.add(new Object[] { cu, mType, _edge_originalClassFile });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeInClassFileToModule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			TypeInClassFileToModule _this, Match match, ClassFile cu, AbstractTypeDeclaration mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, cu, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeInClassFileToModule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeInClassFileToModule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeInClassFileToModule_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_24_1_prepare_blackB(TypeInClassFileToModule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeInClassFileToModule_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_TypeInClassFileToModule_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("cu");
		EObject _localVariable_1 = targetMatch.getObject("tType");
		EObject _localVariable_2 = targetMatch.getObject("module");
		EObject _localVariable_3 = sourceMatch.getObject("mType");
		EObject tmpCu = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpModule = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		if (tmpCu instanceof ClassFile) {
			ClassFile cu = (ClassFile) tmpCu;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tmpModule instanceof TModule) {
					TModule module = (TModule) tmpModule;
					if (tmpMType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
						return new Object[] { cu, tType, module, mType, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_24_2_matchsrctrgcontext_blackBBBBBB(ClassFile cu,
			TAbstractType tType, TModule module, AbstractTypeDeclaration mType, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { cu, tType, module, mType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeInClassFileToModule_24_2_matchsrctrgcontext_binding = pattern_TypeInClassFileToModule_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_TypeInClassFileToModule_24_2_matchsrctrgcontext_binding != null) {
			ClassFile cu = (ClassFile) result_pattern_TypeInClassFileToModule_24_2_matchsrctrgcontext_binding[0];
			TAbstractType tType = (TAbstractType) result_pattern_TypeInClassFileToModule_24_2_matchsrctrgcontext_binding[1];
			TModule module = (TModule) result_pattern_TypeInClassFileToModule_24_2_matchsrctrgcontext_binding[2];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_TypeInClassFileToModule_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_TypeInClassFileToModule_24_2_matchsrctrgcontext_black = pattern_TypeInClassFileToModule_24_2_matchsrctrgcontext_blackBBBBBB(
					cu, tType, module, mType, sourceMatch, targetMatch);
			if (result_pattern_TypeInClassFileToModule_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { cu, tType, module, mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_24_3_solvecsp_bindingFBBBBBBB(
			TypeInClassFileToModule _this, ClassFile cu, TAbstractType tType, TModule module,
			AbstractTypeDeclaration mType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(cu, tType, module, mType, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, cu, tType, module, mType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeInClassFileToModule_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			TypeInClassFileToModule _this, ClassFile cu, TAbstractType tType, TModule module,
			AbstractTypeDeclaration mType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeInClassFileToModule_24_3_solvecsp_binding = pattern_TypeInClassFileToModule_24_3_solvecsp_bindingFBBBBBBB(
				_this, cu, tType, module, mType, sourceMatch, targetMatch);
		if (result_pattern_TypeInClassFileToModule_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypeInClassFileToModule_24_3_solvecsp_binding[0];

			Object[] result_pattern_TypeInClassFileToModule_24_3_solvecsp_black = pattern_TypeInClassFileToModule_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_TypeInClassFileToModule_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, cu, tType, module, mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeInClassFileToModule_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeInClassFileToModule_24_5_matchcorrcontext_blackBFBBFBBB(
			ClassFile cu, TAbstractType tType, TModule module, AbstractTypeDeclaration mType, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType type : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(tType,
					TypeToTAbstractType.class, "target")) {
				if (mType.equals(type.getSource())) {
					for (ElementToModule cu2m : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cu,
							ElementToModule.class, "source")) {
						if (module.equals(cu2m.getTarget())) {
							_result.add(
									new Object[] { cu, cu2m, tType, module, type, mType, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_24_5_matchcorrcontext_greenBBBBF(ElementToModule cu2m,
			TypeToTAbstractType type, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "TypeInClassFileToModule";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(cu2m);
		ccMatch.getAllContextElements().add(type);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { cu2m, type, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_TypeInClassFileToModule_24_6_createcorrespondence_blackBBBBB(ClassFile cu,
			TAbstractType tType, TModule module, AbstractTypeDeclaration mType, CCMatch ccMatch) {
		return new Object[] { cu, tType, module, mType, ccMatch };
	}

	public static final Object[] pattern_TypeInClassFileToModule_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_TypeInClassFileToModule_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "TypeInClassFileToModule";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeInClassFileToModule_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_27_1_matchtggpattern_blackBB(ClassFile cu,
			AbstractTypeDeclaration mType) {
		if (cu.equals(mType.getOriginalClassFile())) {
			return new Object[] { cu, mType };
		}
		return null;
	}

	public static final boolean pattern_TypeInClassFileToModule_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeInClassFileToModule_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_28_1_matchtggpattern_blackBB(TAbstractType tType,
			TModule module) {
		if (module.equals(tType.getModule())) {
			return new Object[] { tType, module };
		}
		return null;
	}

	public static final boolean pattern_TypeInClassFileToModule_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeInClassFileToModule_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_29_1_createresult_blackB(
			TypeInClassFileToModule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeInClassFileToModule_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_TypeInClassFileToModule_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ClassFile cu) {
		if (ruleResult.getSourceObjects().contains(cu)) {
			return new Object[] { ruleResult, cu };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ElementToModule cu2m) {
		if (ruleResult.getCorrObjects().contains(cu2m)) {
			return new Object[] { ruleResult, cu2m };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TModule module) {
		if (ruleResult.getTargetObjects().contains(module)) {
			return new Object[] { ruleResult, module };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType type) {
		if (ruleResult.getCorrObjects().contains(type)) {
			return new Object[] { ruleResult, type };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeInClassFileToModule_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList cu2mList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList typeList : ruleEntryContainer.getRuleEntryList()) {
				if (!cu2mList.equals(typeList)) {
					for (EObject tmpCu2m : cu2mList.getEntryObjects()) {
						if (tmpCu2m instanceof ElementToModule) {
							ElementToModule cu2m = (ElementToModule) tmpCu2m;
							NamedElement tmpCu = cu2m.getSource();
							if (tmpCu instanceof ClassFile) {
								ClassFile cu = (ClassFile) tmpCu;
								TModule module = cu2m.getTarget();
								if (module != null) {
									if (pattern_TypeInClassFileToModule_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											cu2m) == null) {
										if (pattern_TypeInClassFileToModule_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, cu) == null) {
											if (pattern_TypeInClassFileToModule_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, module) == null) {
												for (EObject tmpType : typeList.getEntryObjects()) {
													if (tmpType instanceof TypeToTAbstractType) {
														TypeToTAbstractType type = (TypeToTAbstractType) tmpType;
														TAbstractType tType = type.getTarget();
														if (tType != null) {
															Type tmpMType = type.getSource();
															if (tmpMType instanceof AbstractTypeDeclaration) {
																AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
																if (pattern_TypeInClassFileToModule_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult, type) == null) {
																	if (pattern_TypeInClassFileToModule_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, tType) == null) {
																		if (pattern_TypeInClassFileToModule_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, mType) == null) {
																			_result.add(new Object[] { cu2mList, cu,
																					cu2m, module, typeList, tType, type,
																					mType, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_29_3_solveCSP_bindingFBBBBBBBBB(
			TypeInClassFileToModule _this, IsApplicableMatch isApplicableMatch, ClassFile cu, ElementToModule cu2m,
			TAbstractType tType, TModule module, TypeToTAbstractType type, AbstractTypeDeclaration mType,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, cu, cu2m, tType, module, type, mType,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, cu, cu2m, tType, module, type, mType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeInClassFileToModule_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeInClassFileToModule_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeInClassFileToModule _this, IsApplicableMatch isApplicableMatch, ClassFile cu, ElementToModule cu2m,
			TAbstractType tType, TModule module, TypeToTAbstractType type, AbstractTypeDeclaration mType,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypeInClassFileToModule_29_3_solveCSP_binding = pattern_TypeInClassFileToModule_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, cu, cu2m, tType, module, type, mType, ruleResult);
		if (result_pattern_TypeInClassFileToModule_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeInClassFileToModule_29_3_solveCSP_binding[0];

			Object[] result_pattern_TypeInClassFileToModule_29_3_solveCSP_black = pattern_TypeInClassFileToModule_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_TypeInClassFileToModule_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, cu, cu2m, tType, module, type, mType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeInClassFileToModule_29_4_checkCSP_expressionFBB(
			TypeInClassFileToModule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeInClassFileToModule_29_5_checknacs_blackBBBBBB(ClassFile cu,
			ElementToModule cu2m, TAbstractType tType, TModule module, TypeToTAbstractType type,
			AbstractTypeDeclaration mType) {
		return new Object[] { cu, cu2m, tType, module, type, mType };
	}

	public static final Object[] pattern_TypeInClassFileToModule_29_6_perform_blackBBBBBBB(ClassFile cu,
			ElementToModule cu2m, TAbstractType tType, TModule module, TypeToTAbstractType type,
			AbstractTypeDeclaration mType, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { cu, cu2m, tType, module, type, mType, ruleResult };
	}

	public static final Object[] pattern_TypeInClassFileToModule_29_6_perform_greenBBBBB(ClassFile cu,
			TAbstractType tType, TModule module, AbstractTypeDeclaration mType, ModelgeneratorRuleResult ruleResult) {
		mType.setOriginalClassFile(cu);
		tType.setModule(module);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { cu, tType, module, mType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_TypeInClassFileToModule_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypeInClassFileToModuleImpl
