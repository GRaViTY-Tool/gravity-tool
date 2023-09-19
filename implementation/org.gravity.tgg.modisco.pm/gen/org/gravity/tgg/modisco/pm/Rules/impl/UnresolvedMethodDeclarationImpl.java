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
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.ModelToTypeGraph;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.RulesPackage;
import org.gravity.tgg.modisco.pm.Rules.UnresolvedMethodDeclaration;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TModule;
import org.gravity.typegraph.basic.TSignature;
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
 * An implementation of the model object '<em><b>Unresolved Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnresolvedMethodDeclarationImpl extends AbstractRuleImpl implements UnresolvedMethodDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedMethodDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUnresolvedMethodDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Model mModel,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {

		Object[] result1_black = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_0_1_initialbindings_blackBBBB(this, match, mModel, mMethod);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModel] = " + mModel + ", " + "[mMethod] = " + mMethod + ".");
		}

		Object[] result2_bindingAndBlack = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mModel, mMethod);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModel] = " + mModel + ", " + "[mMethod] = " + mMethod + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_0_4_collectelementstobetranslated_blackBBB(match, mModel,
							mMethod);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModel] = " + mModel + ", " + "[mMethod] = " + mMethod + ".");
			}
			UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_0_4_collectelementstobetranslated_greenBBBF(match, mModel,
							mMethod);
			//nothing EMoflonEdge mModel__mMethod____unresolvedItems = (EMoflonEdge) result4_green[3];

			Object[] result5_black = UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_0_5_collectcontextelements_blackBBB(match, mModel, mMethod);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModel] = " + mModel + ", " + "[mMethod] = " + mMethod + ".");
			}
			UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_0_5_collectcontextelements_greenBB(match, mModel);

			// 
			UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_0_6_registerobjectstomatch_expressionBBBB(this, match, mModel,
							mMethod);
			return UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_0_7_expressionF();
		} else {
			return UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Model mModel = (Model) result1_bindingAndBlack[0];
		TypeGraph tModel = (TypeGraph) result1_bindingAndBlack[1];
		ModelToTypeGraph model2pm = (ModelToTypeGraph) result1_bindingAndBlack[2];
		org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod = (org.eclipse.modisco.java.UnresolvedMethodDeclaration) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_1_1_performtransformation_greenFFFBFBB(tModel, mMethod, csp);
		TMethodSignature tMethodSignature = (TMethodSignature) result1_green[0];
		MDefinitionToTMember unresolved2Definiton = (MDefinitionToTMember) result1_green[1];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result1_green[2];
		TMethod tMethodName = (TMethod) result1_green[4];

		Object[] result2_black = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_1_2_collecttranslatedelements_blackBBBBB(tMethodSignature,
						unresolved2Definiton, tMethodDefinition, tMethodName, mMethod);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tMethodSignature] = "
					+ tMethodSignature + ", " + "[unresolved2Definiton] = " + unresolved2Definiton + ", "
					+ "[tMethodDefinition] = " + tMethodDefinition + ", " + "[tMethodName] = " + tMethodName + ", "
					+ "[mMethod] = " + mMethod + ".");
		}
		Object[] result2_green = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_1_2_collecttranslatedelements_greenFBBBBB(tMethodSignature,
						unresolved2Definiton, tMethodDefinition, tMethodName, mMethod);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_1_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult,
						tMethodSignature, unresolved2Definiton, mModel, tMethodDefinition, tModel, tMethodName,
						model2pm, mMethod);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tMethodSignature] = " + tMethodSignature + ", " + "[unresolved2Definiton] = "
					+ unresolved2Definiton + ", " + "[mModel] = " + mModel + ", " + "[tMethodDefinition] = "
					+ tMethodDefinition + ", " + "[tModel] = " + tModel + ", " + "[tMethodName] = " + tMethodName + ", "
					+ "[model2pm] = " + model2pm + ", " + "[mMethod] = " + mMethod + ".");
		}
		UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFF(ruleresult,
						tMethodSignature, unresolved2Definiton, mModel, tMethodDefinition, tModel, tMethodName,
						mMethod);
		//nothing EMoflonEdge tMethodSignature__tMethodDefinition____definitions = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tMethodDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mModel__mMethod____unresolvedItems = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge unresolved2Definiton__tMethodDefinition____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tModel__tMethodName____methods = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tMethodName__tModel____model = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tMethodName__tMethodSignature____signatures = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tMethodSignature__tMethodName____method = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge unresolved2Definiton__mMethod____source = (EMoflonEdge) result3_green[16];

		// 
		// 
		UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_1_5_registerobjects_expressionBBBBBBBBBB(
				this, ruleresult, tMethodSignature, unresolved2Definiton, mModel, tMethodDefinition, tModel,
				tMethodName, model2pm, mMethod);
		return UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Model mModel = (Model) result2_binding[0];
		org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod = (org.eclipse.modisco.java.UnresolvedMethodDeclaration) result2_binding[1];
		for (Object[] result2_black : UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_2_2_corematch_blackBFFBB(mModel, mMethod, match)) {
			TypeGraph tModel = (TypeGraph) result2_black[1];
			ModelToTypeGraph model2pm = (ModelToTypeGraph) result2_black[2];
			// ForEach 
			for (Object[] result3_black : UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_2_3_findcontext_blackBBBB(mModel, tModel, model2pm, mMethod)) {
				Object[] result3_green = UnresolvedMethodDeclarationImpl
						.pattern_UnresolvedMethodDeclaration_2_3_findcontext_greenBBBBFFFF(mModel, tModel, model2pm,
								mMethod);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge mModel__mMethod____unresolvedItems = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge model2pm__mModel____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge model2pm__tModel____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = UnresolvedMethodDeclarationImpl
						.pattern_UnresolvedMethodDeclaration_2_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, mModel, tModel, model2pm, mMethod);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mModel] = " + mModel + ", "
							+ "[tModel] = " + tModel + ", " + "[model2pm] = " + model2pm + ", " + "[mMethod] = "
							+ mMethod + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = UnresolvedMethodDeclarationImpl
							.pattern_UnresolvedMethodDeclaration_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					UnresolvedMethodDeclarationImpl
							.pattern_UnresolvedMethodDeclaration_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Model mModel,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		match.registerObject("mModel", mModel);
		match.registerObject("mMethod", mMethod);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Model mModel,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Model mModel, TypeGraph tModel,
			ModelToTypeGraph model2pm, org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mMethod_name = CSPFactoryHelper.eINSTANCE.createVariable("mMethod.name", true, csp);
		var_mMethod_name.setValue(mMethod.getName());
		var_mMethod_name.setType("String");

		// Create unbound variables
		Variable var_tMethodName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tMethodName.tName", csp);
		var_tMethodName_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mMethod_name, var_tMethodName_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("tModel", tModel);
		isApplicableMatch.registerObject("model2pm", model2pm);
		isApplicableMatch.registerObject("mMethod", mMethod);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tMethodSignature,
			EObject unresolved2Definiton, EObject mModel, EObject tMethodDefinition, EObject tModel,
			EObject tMethodName, EObject model2pm, EObject mMethod) {
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("unresolved2Definiton", unresolved2Definiton);
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("tMethodDefinition", tMethodDefinition);
		ruleresult.registerObject("tModel", tModel);
		ruleresult.registerObject("tMethodName", tMethodName);
		ruleresult.registerObject("model2pm", model2pm);
		ruleresult.registerObject("mMethod", mMethod);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mMethod").eClass())
				.equals("java.UnresolvedMethodDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TMethodSignature tMethodSignature,
			TMethodDefinition tMethodDefinition, TypeGraph tModel, TMethod tMethodName) {

		Object[] result1_black = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_10_1_initialbindings_blackBBBBBB(this, match, tMethodSignature,
						tMethodDefinition, tModel, tMethodName);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
					+ "[tMethodDefinition] = " + tMethodDefinition + ", " + "[tModel] = " + tModel + ", "
					+ "[tMethodName] = " + tMethodName + ".");
		}

		Object[] result2_bindingAndBlack = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, tMethodSignature,
						tMethodDefinition, tModel, tMethodName);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMethodSignature] = " + tMethodSignature + ", "
					+ "[tMethodDefinition] = " + tMethodDefinition + ", " + "[tModel] = " + tModel + ", "
					+ "[tMethodName] = " + tMethodName + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_10_4_collectelementstobetranslated_blackBBBBB(match,
							tMethodSignature, tMethodDefinition, tModel, tMethodName);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tMethodSignature] = " + tMethodSignature + ", " + "[tMethodDefinition] = "
						+ tMethodDefinition + ", " + "[tModel] = " + tModel + ", " + "[tMethodName] = " + tMethodName
						+ ".");
			}
			UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_10_4_collectelementstobetranslated_greenBBBBBFFFFFF(match,
							tMethodSignature, tMethodDefinition, tModel, tMethodName);
			//nothing EMoflonEdge tMethodSignature__tMethodDefinition____definitions = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tMethodDefinition__tMethodSignature____signature = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tModel__tMethodName____methods = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tMethodName__tModel____model = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tMethodName__tMethodSignature____signatures = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge tMethodSignature__tMethodName____method = (EMoflonEdge) result4_green[10];

			Object[] result5_black = UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_10_5_collectcontextelements_blackBBBBB(match, tMethodSignature,
							tMethodDefinition, tModel, tMethodName);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tMethodSignature] = " + tMethodSignature + ", " + "[tMethodDefinition] = "
						+ tMethodDefinition + ", " + "[tModel] = " + tModel + ", " + "[tMethodName] = " + tMethodName
						+ ".");
			}
			UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_10_5_collectcontextelements_greenBB(match, tModel);

			// 
			UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_10_6_registerobjectstomatch_expressionBBBBBB(this, match,
							tMethodSignature, tMethodDefinition, tModel, tMethodName);
			return UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_10_7_expressionF();
		} else {
			return UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TMethodSignature tMethodSignature = (TMethodSignature) result1_bindingAndBlack[0];
		Model mModel = (Model) result1_bindingAndBlack[1];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result1_bindingAndBlack[2];
		TypeGraph tModel = (TypeGraph) result1_bindingAndBlack[3];
		TMethod tMethodName = (TMethod) result1_bindingAndBlack[4];
		ModelToTypeGraph model2pm = (ModelToTypeGraph) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_11_1_performtransformation_greenFBBFB(mModel, tMethodDefinition,
						csp);
		MDefinitionToTMember unresolved2Definiton = (MDefinitionToTMember) result1_green[0];
		org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod = (org.eclipse.modisco.java.UnresolvedMethodDeclaration) result1_green[3];

		Object[] result2_black = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_11_2_collecttranslatedelements_blackBBBBB(tMethodSignature,
						unresolved2Definiton, tMethodDefinition, tMethodName, mMethod);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tMethodSignature] = "
					+ tMethodSignature + ", " + "[unresolved2Definiton] = " + unresolved2Definiton + ", "
					+ "[tMethodDefinition] = " + tMethodDefinition + ", " + "[tMethodName] = " + tMethodName + ", "
					+ "[mMethod] = " + mMethod + ".");
		}
		Object[] result2_green = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_11_2_collecttranslatedelements_greenFBBBBB(tMethodSignature,
						unresolved2Definiton, tMethodDefinition, tMethodName, mMethod);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_11_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult,
						tMethodSignature, unresolved2Definiton, mModel, tMethodDefinition, tModel, tMethodName,
						model2pm, mMethod);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tMethodSignature] = " + tMethodSignature + ", " + "[unresolved2Definiton] = "
					+ unresolved2Definiton + ", " + "[mModel] = " + mModel + ", " + "[tMethodDefinition] = "
					+ tMethodDefinition + ", " + "[tModel] = " + tModel + ", " + "[tMethodName] = " + tMethodName + ", "
					+ "[model2pm] = " + model2pm + ", " + "[mMethod] = " + mMethod + ".");
		}
		UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFF(ruleresult,
						tMethodSignature, unresolved2Definiton, mModel, tMethodDefinition, tModel, tMethodName,
						mMethod);
		//nothing EMoflonEdge tMethodSignature__tMethodDefinition____definitions = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tMethodDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mModel__mMethod____unresolvedItems = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge unresolved2Definiton__tMethodDefinition____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tModel__tMethodName____methods = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tMethodName__tModel____model = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tMethodName__tMethodSignature____signatures = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tMethodSignature__tMethodName____method = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge unresolved2Definiton__mMethod____source = (EMoflonEdge) result3_green[16];

		// 
		// 
		UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_11_5_registerobjects_expressionBBBBBBBBBB(
				this, ruleresult, tMethodSignature, unresolved2Definiton, mModel, tMethodDefinition, tModel,
				tMethodName, model2pm, mMethod);
		return UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMethodSignature tMethodSignature = (TMethodSignature) result2_binding[0];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_binding[1];
		TypeGraph tModel = (TypeGraph) result2_binding[2];
		TMethod tMethodName = (TMethod) result2_binding[3];
		for (Object[] result2_black : UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_12_2_corematch_blackBFBBBFB(tMethodSignature, tMethodDefinition,
						tModel, tMethodName, match)) {
			Model mModel = (Model) result2_black[1];
			ModelToTypeGraph model2pm = (ModelToTypeGraph) result2_black[5];
			// ForEach 
			for (Object[] result3_black : UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_12_3_findcontext_blackBBBBBB(tMethodSignature, mModel,
							tMethodDefinition, tModel, tMethodName, model2pm)) {
				Object[] result3_green = UnresolvedMethodDeclarationImpl
						.pattern_UnresolvedMethodDeclaration_12_3_findcontext_greenBBBBBBFFFFFFFFF(tMethodSignature,
								mModel, tMethodDefinition, tModel, tMethodName, model2pm);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge tMethodSignature__tMethodDefinition____definitions = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge tMethodDefinition__tMethodSignature____signature = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tModel__tMethodName____methods = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tMethodName__tModel____model = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tMethodName__tMethodSignature____signatures = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tMethodSignature__tMethodName____method = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge model2pm__mModel____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge model2pm__tModel____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = UnresolvedMethodDeclarationImpl
						.pattern_UnresolvedMethodDeclaration_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, tMethodSignature, mModel, tMethodDefinition, tModel, tMethodName,
								model2pm);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tMethodSignature] = "
							+ tMethodSignature + ", " + "[mModel] = " + mModel + ", " + "[tMethodDefinition] = "
							+ tMethodDefinition + ", " + "[tModel] = " + tModel + ", " + "[tMethodName] = "
							+ tMethodName + ", " + "[model2pm] = " + model2pm + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (UnresolvedMethodDeclarationImpl
						.pattern_UnresolvedMethodDeclaration_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = UnresolvedMethodDeclarationImpl
							.pattern_UnresolvedMethodDeclaration_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					UnresolvedMethodDeclarationImpl
							.pattern_UnresolvedMethodDeclaration_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMethodSignature tMethodSignature,
			TMethodDefinition tMethodDefinition, TypeGraph tModel, TMethod tMethodName) {
		match.registerObject("tMethodSignature", tMethodSignature);
		match.registerObject("tMethodDefinition", tMethodDefinition);
		match.registerObject("tModel", tModel);
		match.registerObject("tMethodName", tMethodName);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMethodSignature tMethodSignature,
			TMethodDefinition tMethodDefinition, TypeGraph tModel, TMethod tMethodName) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TMethodSignature tMethodSignature,
			Model mModel, TMethodDefinition tMethodDefinition, TypeGraph tModel, TMethod tMethodName,
			ModelToTypeGraph model2pm) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tMethodName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tMethodName.tName", true, csp);
		var_tMethodName_tName.setValue(tMethodName.getTName());
		var_tMethodName_tName.setType("String");

		// Create unbound variables
		Variable var_mMethod_name = CSPFactoryHelper.eINSTANCE.createVariable("mMethod.name", csp);
		var_mMethod_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mMethod_name, var_tMethodName_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tMethodSignature", tMethodSignature);
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("tMethodDefinition", tMethodDefinition);
		isApplicableMatch.registerObject("tModel", tModel);
		isApplicableMatch.registerObject("tMethodName", tMethodName);
		isApplicableMatch.registerObject("model2pm", model2pm);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tMethodSignature,
			EObject unresolved2Definiton, EObject mModel, EObject tMethodDefinition, EObject tModel,
			EObject tMethodName, EObject model2pm, EObject mMethod) {
		ruleresult.registerObject("tMethodSignature", tMethodSignature);
		ruleresult.registerObject("unresolved2Definiton", unresolved2Definiton);
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("tMethodDefinition", tMethodDefinition);
		ruleresult.registerObject("tModel", tModel);
		ruleresult.registerObject("tMethodName", tMethodName);
		ruleresult.registerObject("model2pm", model2pm);
		ruleresult.registerObject("mMethod", mMethod);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tMethodSignature").eClass())
						.equals("basic.TMethodSignature.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tMethodDefinition").eClass())
						.equals("basic.TMethodDefinition.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tMethodName").eClass())
						.equals("basic.TMethod.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_103(EMoflonEdge _edge_definitions) {

		Object[] result1_bindingAndBlack = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_20_2_testcorematchandDECs_blackFFFFB(_edge_definitions)) {
			TMethodSignature tMethodSignature = (TMethodSignature) result2_black[0];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_black[1];
			TypeGraph tModel = (TypeGraph) result2_black[2];
			TMethod tMethodName = (TMethod) result2_black[3];
			Object[] result2_green = UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, tMethodSignature, tMethodDefinition, tModel, tMethodName)) {
				// 
				if (UnresolvedMethodDeclarationImpl
						.pattern_UnresolvedMethodDeclaration_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = UnresolvedMethodDeclarationImpl
							.pattern_UnresolvedMethodDeclaration_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					UnresolvedMethodDeclarationImpl
							.pattern_UnresolvedMethodDeclaration_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_109(EMoflonEdge _edge_unresolvedItems) {

		Object[] result1_bindingAndBlack = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_21_2_testcorematchandDECs_blackFFB(_edge_unresolvedItems)) {
			Model mModel = (Model) result2_black[0];
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod = (org.eclipse.modisco.java.UnresolvedMethodDeclaration) result2_black[1];
			Object[] result2_green = UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, mModel, mMethod)) {
				// 
				if (UnresolvedMethodDeclarationImpl
						.pattern_UnresolvedMethodDeclaration_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = UnresolvedMethodDeclarationImpl
							.pattern_UnresolvedMethodDeclaration_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					UnresolvedMethodDeclarationImpl
							.pattern_UnresolvedMethodDeclaration_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("UnresolvedMethodDeclaration");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mMethod_name = CSPFactoryHelper.eINSTANCE.createVariable("mMethod", true, csp);
		var_mMethod_name.setValue(__helper.getValue("mMethod", "name"));
		var_mMethod_name.setType("String");

		Variable var_tMethodName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tMethodName", true, csp);
		var_tMethodName_tName.setValue(__helper.getValue("tMethodName", "tName"));
		var_tMethodName_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("UnresolvedMethodDeclaration");
		eq0.solve(var_mMethod_name, var_tMethodName_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tMethodName_tName.setBound(false);
			eq0.solve(var_mMethod_name, var_tMethodName_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tMethodName", "tName", var_tMethodName_tName.getValue());
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
		ruleResult.setRule("UnresolvedMethodDeclaration");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mMethod_name = CSPFactoryHelper.eINSTANCE.createVariable("mMethod", true, csp);
		var_mMethod_name.setValue(__helper.getValue("mMethod", "name"));
		var_mMethod_name.setType("String");

		Variable var_tMethodName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tMethodName", true, csp);
		var_tMethodName_tName.setValue(__helper.getValue("tMethodName", "tName"));
		var_tMethodName_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("UnresolvedMethodDeclaration");
		eq0.solve(var_mMethod_name, var_tMethodName_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mMethod_name.setBound(false);
			eq0.solve(var_mMethod_name, var_tMethodName_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mMethod", "name", var_mMethod_name.getValue());
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

		Object[] result1_black = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TMethodSignature tMethodSignature = (TMethodSignature) result2_bindingAndBlack[0];
		Model mModel = (Model) result2_bindingAndBlack[1];
		TMethodDefinition tMethodDefinition = (TMethodDefinition) result2_bindingAndBlack[2];
		TypeGraph tModel = (TypeGraph) result2_bindingAndBlack[3];
		TMethod tMethodName = (TMethod) result2_bindingAndBlack[4];
		org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod = (org.eclipse.modisco.java.UnresolvedMethodDeclaration) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tMethodSignature,
						mModel, tMethodDefinition, tModel, tMethodName, mMethod, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tMethodSignature] = " + tMethodSignature + ", " + "[mModel] = " + mModel + ", "
					+ "[tMethodDefinition] = " + tMethodDefinition + ", " + "[tModel] = " + tModel + ", "
					+ "[tMethodName] = " + tMethodName + ", " + "[mMethod] = " + mMethod + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_24_5_matchcorrcontext_blackBBFBB(mModel, tModel, sourceMatch,
							targetMatch)) {
				ModelToTypeGraph model2pm = (ModelToTypeGraph) result5_black[2];
				Object[] result5_green = UnresolvedMethodDeclarationImpl
						.pattern_UnresolvedMethodDeclaration_24_5_matchcorrcontext_greenBBBF(model2pm, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = UnresolvedMethodDeclarationImpl
						.pattern_UnresolvedMethodDeclaration_24_6_createcorrespondence_blackBBBBBBB(tMethodSignature,
								mModel, tMethodDefinition, tModel, tMethodName, mMethod, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tMethodSignature] = "
							+ tMethodSignature + ", " + "[mModel] = " + mModel + ", " + "[tMethodDefinition] = "
							+ tMethodDefinition + ", " + "[tModel] = " + tModel + ", " + "[tMethodName] = "
							+ tMethodName + ", " + "[mMethod] = " + mMethod + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_24_6_createcorrespondence_greenFBBB(
						tMethodDefinition, mMethod, ccMatch);
				//nothing MDefinitionToTMember unresolved2Definiton = (MDefinitionToTMember) result6_green[0];

				Object[] result7_black = UnresolvedMethodDeclarationImpl
						.pattern_UnresolvedMethodDeclaration_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				UnresolvedMethodDeclarationImpl
						.pattern_UnresolvedMethodDeclaration_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TMethodSignature tMethodSignature, Model mModel,
			TMethodDefinition tMethodDefinition, TypeGraph tModel, TMethod tMethodName,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mMethod_name = CSPFactoryHelper.eINSTANCE.createVariable("mMethod.name", true, csp);
		var_mMethod_name.setValue(mMethod.getName());
		var_mMethod_name.setType("String");
		Variable var_tMethodName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tMethodName.tName", true, csp);
		var_tMethodName_tName.setValue(tMethodName.getTName());
		var_tMethodName_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mMethod_name, var_tMethodName_tName);
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
	public boolean checkDEC_FWD(Model mModel, org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {// 
		Object[] result1_black = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_27_1_matchtggpattern_blackBB(mModel, mMethod);
		if (result1_black != null) {
			return UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_27_2_expressionF();
		} else {
			return UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMethodSignature tMethodSignature, TMethodDefinition tMethodDefinition,
			TypeGraph tModel, TMethod tMethodName) {// 
		Object[] result1_black = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_28_1_matchtggpattern_blackBBBB(tMethodSignature, tMethodDefinition,
						tModel, tMethodName);
		if (result1_black != null) {
			return UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_28_2_expressionF();
		} else {
			return UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph model2pmParameter) {

		Object[] result1_black = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : UnresolvedMethodDeclarationImpl
				.pattern_UnresolvedMethodDeclaration_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList model2pmList = (RuleEntryList) result2_black[0];
			Model mModel = (Model) result2_black[1];
			ModelToTypeGraph model2pm = (ModelToTypeGraph) result2_black[2];
			TypeGraph tModel = (TypeGraph) result2_black[3];

			Object[] result3_bindingAndBlack = UnresolvedMethodDeclarationImpl
					.pattern_UnresolvedMethodDeclaration_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							mModel, tModel, model2pm, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mModel] = " + mModel + ", "
						+ "[tModel] = " + tModel + ", " + "[model2pm] = " + model2pm + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = UnresolvedMethodDeclarationImpl
						.pattern_UnresolvedMethodDeclaration_29_5_checknacs_blackBBB(mModel, tModel, model2pm);
				if (result5_black != null) {

					Object[] result6_black = UnresolvedMethodDeclarationImpl
							.pattern_UnresolvedMethodDeclaration_29_6_perform_blackBBBB(mModel, tModel, model2pm,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mModel] = " + mModel
								+ ", " + "[tModel] = " + tModel + ", " + "[model2pm] = " + model2pm + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_29_6_perform_greenFFBFBFFBB(
							mModel, tModel, ruleResult, csp);
					//nothing TMethodSignature tMethodSignature = (TMethodSignature) result6_green[0];
					//nothing MDefinitionToTMember unresolved2Definiton = (MDefinitionToTMember) result6_green[1];
					//nothing TMethodDefinition tMethodDefinition = (TMethodDefinition) result6_green[3];
					//nothing TMethod tMethodName = (TMethod) result6_green[5];
					//nothing org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod = (org.eclipse.modisco.java.UnresolvedMethodDeclaration) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return UnresolvedMethodDeclarationImpl.pattern_UnresolvedMethodDeclaration_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Model mModel, TypeGraph tModel,
			ModelToTypeGraph model2pm, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mMethod_name = CSPFactoryHelper.eINSTANCE.createVariable("mMethod.name", csp);
		var_mMethod_name.setType("String");
		Variable var_tMethodName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tMethodName.tName", csp);
		var_tMethodName_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mMethod_name, var_tMethodName_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("tModel", tModel);
		isApplicableMatch.registerObject("model2pm", model2pm);
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
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___IS_APPROPRIATE_FWD__MATCH_MODEL_UNRESOLVEDMETHODDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(org.eclipse.modisco.java.UnresolvedMethodDeclaration) arguments.get(2));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL_UNRESOLVEDMETHODDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(org.eclipse.modisco.java.UnresolvedMethodDeclaration) arguments.get(2));
			return null;
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL_UNRESOLVEDMETHODDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(org.eclipse.modisco.java.UnresolvedMethodDeclaration) arguments.get(2));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL_TYPEGRAPH_MODELTOTYPEGRAPH_UNRESOLVEDMETHODDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(TypeGraph) arguments.get(2), (ModelToTypeGraph) arguments.get(3),
					(org.eclipse.modisco.java.UnresolvedMethodDeclaration) arguments.get(4));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___IS_APPROPRIATE_BWD__MATCH_TMETHODSIGNATURE_TMETHODDEFINITION_TYPEGRAPH_TMETHOD:
			return isAppropriate_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (TypeGraph) arguments.get(3), (TMethod) arguments.get(4));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODSIGNATURE_TMETHODDEFINITION_TYPEGRAPH_TMETHOD:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (TypeGraph) arguments.get(3), (TMethod) arguments.get(4));
			return null;
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODSIGNATURE_TMETHODDEFINITION_TYPEGRAPH_TMETHOD:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (TypeGraph) arguments.get(3), (TMethod) arguments.get(4));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMETHODSIGNATURE_MODEL_TMETHODDEFINITION_TYPEGRAPH_TMETHOD_MODELTOTYPEGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TMethodSignature) arguments.get(1),
					(Model) arguments.get(2), (TMethodDefinition) arguments.get(3), (TypeGraph) arguments.get(4),
					(TMethod) arguments.get(5), (ModelToTypeGraph) arguments.get(6));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_103__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_103((EMoflonEdge) arguments.get(0));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_109__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_109((EMoflonEdge) arguments.get(0));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___IS_APPLICABLE_SOLVE_CSP_CC__TMETHODSIGNATURE_MODEL_TMETHODDEFINITION_TYPEGRAPH_TMETHOD_UNRESOLVEDMETHODDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TMethodSignature) arguments.get(0), (Model) arguments.get(1),
					(TMethodDefinition) arguments.get(2), (TypeGraph) arguments.get(3), (TMethod) arguments.get(4),
					(org.eclipse.modisco.java.UnresolvedMethodDeclaration) arguments.get(5), (Match) arguments.get(6),
					(Match) arguments.get(7));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___CHECK_DEC_FWD__MODEL_UNRESOLVEDMETHODDECLARATION:
			return checkDEC_FWD((Model) arguments.get(0),
					(org.eclipse.modisco.java.UnresolvedMethodDeclaration) arguments.get(1));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___CHECK_DEC_BWD__TMETHODSIGNATURE_TMETHODDEFINITION_TYPEGRAPH_TMETHOD:
			return checkDEC_BWD((TMethodSignature) arguments.get(0), (TMethodDefinition) arguments.get(1),
					(TypeGraph) arguments.get(2), (TMethod) arguments.get(3));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_TYPEGRAPH_MODELTOTYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(TypeGraph) arguments.get(2), (ModelToTypeGraph) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.UNRESOLVED_METHOD_DECLARATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_0_1_initialbindings_blackBBBB(
			UnresolvedMethodDeclaration _this, Match match, Model mModel,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		return new Object[] { _this, match, mModel, mMethod };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_0_2_SolveCSP_bindingFBBBB(
			UnresolvedMethodDeclaration _this, Match match, Model mModel,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mModel, mMethod);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mModel, mMethod };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_0_2_SolveCSP_bindingAndBlackFBBBB(
			UnresolvedMethodDeclaration _this, Match match, Model mModel,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		Object[] result_pattern_UnresolvedMethodDeclaration_0_2_SolveCSP_binding = pattern_UnresolvedMethodDeclaration_0_2_SolveCSP_bindingFBBBB(
				_this, match, mModel, mMethod);
		if (result_pattern_UnresolvedMethodDeclaration_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedMethodDeclaration_0_2_SolveCSP_binding[0];

			Object[] result_pattern_UnresolvedMethodDeclaration_0_2_SolveCSP_black = pattern_UnresolvedMethodDeclaration_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedMethodDeclaration_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mModel, mMethod };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedMethodDeclaration_0_3_CheckCSP_expressionFBB(
			UnresolvedMethodDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_0_4_collectelementstobetranslated_blackBBB(
			Match match, Model mModel, org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		return new Object[] { match, mModel, mMethod };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_0_4_collectelementstobetranslated_greenBBBF(
			Match match, Model mModel, org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		EMoflonEdge mModel__mMethod____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mMethod);
		String mModel__mMethod____unresolvedItems_name_prime = "unresolvedItems";
		mModel__mMethod____unresolvedItems.setSrc(mModel);
		mModel__mMethod____unresolvedItems.setTrg(mMethod);
		match.getToBeTranslatedEdges().add(mModel__mMethod____unresolvedItems);
		mModel__mMethod____unresolvedItems.setName(mModel__mMethod____unresolvedItems_name_prime);
		return new Object[] { match, mModel, mMethod, mModel__mMethod____unresolvedItems };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_0_5_collectcontextelements_blackBBB(Match match,
			Model mModel, org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		return new Object[] { match, mModel, mMethod };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_0_5_collectcontextelements_greenBB(Match match,
			Model mModel) {
		match.getContextNodes().add(mModel);
		return new Object[] { match, mModel };
	}

	public static final void pattern_UnresolvedMethodDeclaration_0_6_registerobjectstomatch_expressionBBBB(
			UnresolvedMethodDeclaration _this, Match match, Model mModel,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		_this.registerObjectsToMatch_FWD(match, mModel, mMethod);

	}

	public static final boolean pattern_UnresolvedMethodDeclaration_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UnresolvedMethodDeclaration_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mModel");
		EObject _localVariable_1 = isApplicableMatch.getObject("tModel");
		EObject _localVariable_2 = isApplicableMatch.getObject("model2pm");
		EObject _localVariable_3 = isApplicableMatch.getObject("mMethod");
		EObject tmpMModel = _localVariable_0;
		EObject tmpTModel = _localVariable_1;
		EObject tmpModel2pm = _localVariable_2;
		EObject tmpMMethod = _localVariable_3;
		if (tmpMModel instanceof Model) {
			Model mModel = (Model) tmpMModel;
			if (tmpTModel instanceof TypeGraph) {
				TypeGraph tModel = (TypeGraph) tmpTModel;
				if (tmpModel2pm instanceof ModelToTypeGraph) {
					ModelToTypeGraph model2pm = (ModelToTypeGraph) tmpModel2pm;
					if (tmpMMethod instanceof org.eclipse.modisco.java.UnresolvedMethodDeclaration) {
						org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod = (org.eclipse.modisco.java.UnresolvedMethodDeclaration) tmpMMethod;
						return new Object[] { mModel, tModel, model2pm, mMethod, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_1_1_performtransformation_blackBBBBFBB(
			Model mModel, TypeGraph tModel, ModelToTypeGraph model2pm,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod, UnresolvedMethodDeclaration _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mModel, tModel, model2pm, mMethod, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_1_1_performtransformation_bindingAndBlackFFFFFBB(
			UnresolvedMethodDeclaration _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UnresolvedMethodDeclaration_1_1_performtransformation_binding = pattern_UnresolvedMethodDeclaration_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_UnresolvedMethodDeclaration_1_1_performtransformation_binding != null) {
			Model mModel = (Model) result_pattern_UnresolvedMethodDeclaration_1_1_performtransformation_binding[0];
			TypeGraph tModel = (TypeGraph) result_pattern_UnresolvedMethodDeclaration_1_1_performtransformation_binding[1];
			ModelToTypeGraph model2pm = (ModelToTypeGraph) result_pattern_UnresolvedMethodDeclaration_1_1_performtransformation_binding[2];
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod = (org.eclipse.modisco.java.UnresolvedMethodDeclaration) result_pattern_UnresolvedMethodDeclaration_1_1_performtransformation_binding[3];

			Object[] result_pattern_UnresolvedMethodDeclaration_1_1_performtransformation_black = pattern_UnresolvedMethodDeclaration_1_1_performtransformation_blackBBBBFBB(
					mModel, tModel, model2pm, mMethod, _this, isApplicableMatch);
			if (result_pattern_UnresolvedMethodDeclaration_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_UnresolvedMethodDeclaration_1_1_performtransformation_black[4];

				return new Object[] { mModel, tModel, model2pm, mMethod, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_1_1_performtransformation_greenFFFBFBB(
			TypeGraph tModel, org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod, CSP csp) {
		TMethodSignature tMethodSignature = BasicFactory.eINSTANCE.createTMethodSignature();
		MDefinitionToTMember unresolved2Definiton = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TMethodDefinition tMethodDefinition = BasicFactory.eINSTANCE.createTMethodDefinition();
		TMethod tMethodName = BasicFactory.eINSTANCE.createTMethod();
		Object _localVariable_0 = csp.getValue("tMethodName", "tName");
		unresolved2Definiton.setSource(mMethod);
		tMethodSignature.getDefinitions().add(tMethodDefinition);
		unresolved2Definiton.setTarget(tMethodDefinition);
		tModel.getMethods().add(tMethodName);
		tMethodName.getSignatures().add(tMethodSignature);
		String tMethodName_tName_prime = (String) _localVariable_0;
		tMethodName.setTName(tMethodName_tName_prime);
		return new Object[] { tMethodSignature, unresolved2Definiton, tMethodDefinition, tModel, tMethodName, mMethod,
				csp };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_1_2_collecttranslatedelements_blackBBBBB(
			TMethodSignature tMethodSignature, MDefinitionToTMember unresolved2Definiton,
			TMethodDefinition tMethodDefinition, TMethod tMethodName,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		return new Object[] { tMethodSignature, unresolved2Definiton, tMethodDefinition, tMethodName, mMethod };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_1_2_collecttranslatedelements_greenFBBBBB(
			TMethodSignature tMethodSignature, MDefinitionToTMember unresolved2Definiton,
			TMethodDefinition tMethodDefinition, TMethod tMethodName,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tMethodSignature);
		ruleresult.getCreatedLinkElements().add(unresolved2Definiton);
		ruleresult.getCreatedElements().add(tMethodDefinition);
		ruleresult.getCreatedElements().add(tMethodName);
		ruleresult.getTranslatedElements().add(mMethod);
		return new Object[] { ruleresult, tMethodSignature, unresolved2Definiton, tMethodDefinition, tMethodName,
				mMethod };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tMethodSignature, EObject unresolved2Definiton, EObject mModel,
			EObject tMethodDefinition, EObject tModel, EObject tMethodName, EObject model2pm, EObject mMethod) {
		if (!tMethodSignature.equals(unresolved2Definiton)) {
			if (!tMethodSignature.equals(tModel)) {
				if (!mModel.equals(tMethodSignature)) {
					if (!mModel.equals(unresolved2Definiton)) {
						if (!mModel.equals(tMethodDefinition)) {
							if (!mModel.equals(tModel)) {
								if (!mModel.equals(tMethodName)) {
									if (!mModel.equals(model2pm)) {
										if (!tMethodDefinition.equals(tMethodSignature)) {
											if (!tMethodDefinition.equals(unresolved2Definiton)) {
												if (!tMethodDefinition.equals(tModel)) {
													if (!tMethodDefinition.equals(tMethodName)) {
														if (!tModel.equals(unresolved2Definiton)) {
															if (!tMethodName.equals(tMethodSignature)) {
																if (!tMethodName.equals(unresolved2Definiton)) {
																	if (!tMethodName.equals(tModel)) {
																		if (!model2pm.equals(tMethodSignature)) {
																			if (!model2pm
																					.equals(unresolved2Definiton)) {
																				if (!model2pm
																						.equals(tMethodDefinition)) {
																					if (!model2pm.equals(tModel)) {
																						if (!model2pm
																								.equals(tMethodName)) {
																							if (!mMethod.equals(
																									tMethodSignature)) {
																								if (!mMethod.equals(
																										unresolved2Definiton)) {
																									if (!mMethod.equals(
																											mModel)) {
																										if (!mMethod
																												.equals(tMethodDefinition)) {
																											if (!mMethod
																													.equals(tModel)) {
																												if (!mMethod
																														.equals(tMethodName)) {
																													if (!mMethod
																															.equals(model2pm)) {
																														return new Object[] {
																																ruleresult,
																																tMethodSignature,
																																unresolved2Definiton,
																																mModel,
																																tMethodDefinition,
																																tModel,
																																tMethodName,
																																model2pm,
																																mMethod };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UnresolvedMethodDeclaration_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tMethodSignature, EObject unresolved2Definiton, EObject mModel,
			EObject tMethodDefinition, EObject tModel, EObject tMethodName, EObject mMethod) {
		EMoflonEdge tMethodSignature__tMethodDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tMethodSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mMethod____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge unresolved2Definiton__tMethodDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tModel__tMethodName____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodName__tModel____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodName__tMethodSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tMethodName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge unresolved2Definiton__mMethod____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UnresolvedMethodDeclaration";
		String tMethodSignature__tMethodDefinition____definitions_name_prime = "definitions";
		String tMethodDefinition__tMethodSignature____signature_name_prime = "signature";
		String mModel__mMethod____unresolvedItems_name_prime = "unresolvedItems";
		String unresolved2Definiton__tMethodDefinition____target_name_prime = "target";
		String tModel__tMethodName____methods_name_prime = "methods";
		String tMethodName__tModel____model_name_prime = "model";
		String tMethodName__tMethodSignature____signatures_name_prime = "signatures";
		String tMethodSignature__tMethodName____method_name_prime = "method";
		String unresolved2Definiton__mMethod____source_name_prime = "source";
		tMethodSignature__tMethodDefinition____definitions.setSrc(tMethodSignature);
		tMethodSignature__tMethodDefinition____definitions.setTrg(tMethodDefinition);
		ruleresult.getCreatedEdges().add(tMethodSignature__tMethodDefinition____definitions);
		tMethodDefinition__tMethodSignature____signature.setSrc(tMethodDefinition);
		tMethodDefinition__tMethodSignature____signature.setTrg(tMethodSignature);
		ruleresult.getCreatedEdges().add(tMethodDefinition__tMethodSignature____signature);
		mModel__mMethod____unresolvedItems.setSrc(mModel);
		mModel__mMethod____unresolvedItems.setTrg(mMethod);
		ruleresult.getTranslatedEdges().add(mModel__mMethod____unresolvedItems);
		unresolved2Definiton__tMethodDefinition____target.setSrc(unresolved2Definiton);
		unresolved2Definiton__tMethodDefinition____target.setTrg(tMethodDefinition);
		ruleresult.getCreatedEdges().add(unresolved2Definiton__tMethodDefinition____target);
		tModel__tMethodName____methods.setSrc(tModel);
		tModel__tMethodName____methods.setTrg(tMethodName);
		ruleresult.getCreatedEdges().add(tModel__tMethodName____methods);
		tMethodName__tModel____model.setSrc(tMethodName);
		tMethodName__tModel____model.setTrg(tModel);
		ruleresult.getCreatedEdges().add(tMethodName__tModel____model);
		tMethodName__tMethodSignature____signatures.setSrc(tMethodName);
		tMethodName__tMethodSignature____signatures.setTrg(tMethodSignature);
		ruleresult.getCreatedEdges().add(tMethodName__tMethodSignature____signatures);
		tMethodSignature__tMethodName____method.setSrc(tMethodSignature);
		tMethodSignature__tMethodName____method.setTrg(tMethodName);
		ruleresult.getCreatedEdges().add(tMethodSignature__tMethodName____method);
		unresolved2Definiton__mMethod____source.setSrc(unresolved2Definiton);
		unresolved2Definiton__mMethod____source.setTrg(mMethod);
		ruleresult.getCreatedEdges().add(unresolved2Definiton__mMethod____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMethodSignature__tMethodDefinition____definitions
				.setName(tMethodSignature__tMethodDefinition____definitions_name_prime);
		tMethodDefinition__tMethodSignature____signature
				.setName(tMethodDefinition__tMethodSignature____signature_name_prime);
		mModel__mMethod____unresolvedItems.setName(mModel__mMethod____unresolvedItems_name_prime);
		unresolved2Definiton__tMethodDefinition____target
				.setName(unresolved2Definiton__tMethodDefinition____target_name_prime);
		tModel__tMethodName____methods.setName(tModel__tMethodName____methods_name_prime);
		tMethodName__tModel____model.setName(tMethodName__tModel____model_name_prime);
		tMethodName__tMethodSignature____signatures.setName(tMethodName__tMethodSignature____signatures_name_prime);
		tMethodSignature__tMethodName____method.setName(tMethodSignature__tMethodName____method_name_prime);
		unresolved2Definiton__mMethod____source.setName(unresolved2Definiton__mMethod____source_name_prime);
		return new Object[] { ruleresult, tMethodSignature, unresolved2Definiton, mModel, tMethodDefinition, tModel,
				tMethodName, mMethod, tMethodSignature__tMethodDefinition____definitions,
				tMethodDefinition__tMethodSignature____signature, mModel__mMethod____unresolvedItems,
				unresolved2Definiton__tMethodDefinition____target, tModel__tMethodName____methods,
				tMethodName__tModel____model, tMethodName__tMethodSignature____signatures,
				tMethodSignature__tMethodName____method, unresolved2Definiton__mMethod____source };
	}

	public static final void pattern_UnresolvedMethodDeclaration_1_5_registerobjects_expressionBBBBBBBBBB(
			UnresolvedMethodDeclaration _this, PerformRuleResult ruleresult, EObject tMethodSignature,
			EObject unresolved2Definiton, EObject mModel, EObject tMethodDefinition, EObject tModel,
			EObject tMethodName, EObject model2pm, EObject mMethod) {
		_this.registerObjects_FWD(ruleresult, tMethodSignature, unresolved2Definiton, mModel, tMethodDefinition, tModel,
				tMethodName, model2pm, mMethod);

	}

	public static final PerformRuleResult pattern_UnresolvedMethodDeclaration_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_2_1_preparereturnvalue_bindingFB(
			UnresolvedMethodDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_2_1_preparereturnvalue_blackFBB(EClass eClass,
			UnresolvedMethodDeclaration _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_2_1_preparereturnvalue_bindingAndBlackFFB(
			UnresolvedMethodDeclaration _this) {
		Object[] result_pattern_UnresolvedMethodDeclaration_2_1_preparereturnvalue_binding = pattern_UnresolvedMethodDeclaration_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_UnresolvedMethodDeclaration_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_UnresolvedMethodDeclaration_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_UnresolvedMethodDeclaration_2_1_preparereturnvalue_black = pattern_UnresolvedMethodDeclaration_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_UnresolvedMethodDeclaration_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UnresolvedMethodDeclaration_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "UnresolvedMethodDeclaration";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mModel");
		EObject _localVariable_1 = match.getObject("mMethod");
		EObject tmpMModel = _localVariable_0;
		EObject tmpMMethod = _localVariable_1;
		if (tmpMModel instanceof Model) {
			Model mModel = (Model) tmpMModel;
			if (tmpMMethod instanceof org.eclipse.modisco.java.UnresolvedMethodDeclaration) {
				org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod = (org.eclipse.modisco.java.UnresolvedMethodDeclaration) tmpMMethod;
				return new Object[] { mModel, mMethod, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedMethodDeclaration_2_2_corematch_blackBFFBB(Model mModel,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph model2pm : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(mModel,
				ModelToTypeGraph.class, "source")) {
			TypeGraph tModel = model2pm.getTarget();
			if (tModel != null) {
				_result.add(new Object[] { mModel, tModel, model2pm, mMethod, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UnresolvedMethodDeclaration_2_3_findcontext_blackBBBB(Model mModel,
			TypeGraph tModel, ModelToTypeGraph model2pm, org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mModel.getUnresolvedItems().contains(mMethod)) {
			if (mModel.equals(model2pm.getSource())) {
				if (tModel.equals(model2pm.getTarget())) {
					_result.add(new Object[] { mModel, tModel, model2pm, mMethod });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_2_3_findcontext_greenBBBBFFFF(Model mModel,
			TypeGraph tModel, ModelToTypeGraph model2pm, org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mModel__mMethod____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model2pm__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model2pm__tModel____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mModel__mMethod____unresolvedItems_name_prime = "unresolvedItems";
		String model2pm__mModel____source_name_prime = "source";
		String model2pm__tModel____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mModel);
		isApplicableMatch.getAllContextElements().add(tModel);
		isApplicableMatch.getAllContextElements().add(model2pm);
		isApplicableMatch.getAllContextElements().add(mMethod);
		mModel__mMethod____unresolvedItems.setSrc(mModel);
		mModel__mMethod____unresolvedItems.setTrg(mMethod);
		isApplicableMatch.getAllContextElements().add(mModel__mMethod____unresolvedItems);
		model2pm__mModel____source.setSrc(model2pm);
		model2pm__mModel____source.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(model2pm__mModel____source);
		model2pm__tModel____target.setSrc(model2pm);
		model2pm__tModel____target.setTrg(tModel);
		isApplicableMatch.getAllContextElements().add(model2pm__tModel____target);
		mModel__mMethod____unresolvedItems.setName(mModel__mMethod____unresolvedItems_name_prime);
		model2pm__mModel____source.setName(model2pm__mModel____source_name_prime);
		model2pm__tModel____target.setName(model2pm__tModel____target_name_prime);
		return new Object[] { mModel, tModel, model2pm, mMethod, isApplicableMatch, mModel__mMethod____unresolvedItems,
				model2pm__mModel____source, model2pm__tModel____target };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_2_4_solveCSP_bindingFBBBBBB(
			UnresolvedMethodDeclaration _this, IsApplicableMatch isApplicableMatch, Model mModel, TypeGraph tModel,
			ModelToTypeGraph model2pm, org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mModel, tModel, model2pm, mMethod);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mModel, tModel, model2pm, mMethod };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_2_4_solveCSP_bindingAndBlackFBBBBBB(
			UnresolvedMethodDeclaration _this, IsApplicableMatch isApplicableMatch, Model mModel, TypeGraph tModel,
			ModelToTypeGraph model2pm, org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		Object[] result_pattern_UnresolvedMethodDeclaration_2_4_solveCSP_binding = pattern_UnresolvedMethodDeclaration_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mModel, tModel, model2pm, mMethod);
		if (result_pattern_UnresolvedMethodDeclaration_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedMethodDeclaration_2_4_solveCSP_binding[0];

			Object[] result_pattern_UnresolvedMethodDeclaration_2_4_solveCSP_black = pattern_UnresolvedMethodDeclaration_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedMethodDeclaration_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mModel, tModel, model2pm, mMethod };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedMethodDeclaration_2_5_checkCSP_expressionFBB(
			UnresolvedMethodDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UnresolvedMethodDeclaration";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UnresolvedMethodDeclaration_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_10_1_initialbindings_blackBBBBBB(
			UnresolvedMethodDeclaration _this, Match match, TMethodSignature tMethodSignature,
			TMethodDefinition tMethodDefinition, TypeGraph tModel, TMethod tMethodName) {
		return new Object[] { _this, match, tMethodSignature, tMethodDefinition, tModel, tMethodName };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_10_2_SolveCSP_bindingFBBBBBB(
			UnresolvedMethodDeclaration _this, Match match, TMethodSignature tMethodSignature,
			TMethodDefinition tMethodDefinition, TypeGraph tModel, TMethod tMethodName) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tMethodSignature, tMethodDefinition, tModel,
				tMethodName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMethodSignature, tMethodDefinition, tModel, tMethodName };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			UnresolvedMethodDeclaration _this, Match match, TMethodSignature tMethodSignature,
			TMethodDefinition tMethodDefinition, TypeGraph tModel, TMethod tMethodName) {
		Object[] result_pattern_UnresolvedMethodDeclaration_10_2_SolveCSP_binding = pattern_UnresolvedMethodDeclaration_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, tMethodSignature, tMethodDefinition, tModel, tMethodName);
		if (result_pattern_UnresolvedMethodDeclaration_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedMethodDeclaration_10_2_SolveCSP_binding[0];

			Object[] result_pattern_UnresolvedMethodDeclaration_10_2_SolveCSP_black = pattern_UnresolvedMethodDeclaration_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedMethodDeclaration_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tMethodSignature, tMethodDefinition, tModel, tMethodName };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedMethodDeclaration_10_3_CheckCSP_expressionFBB(
			UnresolvedMethodDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_10_4_collectelementstobetranslated_blackBBBBB(
			Match match, TMethodSignature tMethodSignature, TMethodDefinition tMethodDefinition, TypeGraph tModel,
			TMethod tMethodName) {
		return new Object[] { match, tMethodSignature, tMethodDefinition, tModel, tMethodName };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_10_4_collectelementstobetranslated_greenBBBBBFFFFFF(
			Match match, TMethodSignature tMethodSignature, TMethodDefinition tMethodDefinition, TypeGraph tModel,
			TMethod tMethodName) {
		EMoflonEdge tMethodSignature__tMethodDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tMethodSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tModel__tMethodName____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodName__tModel____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodName__tMethodSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tMethodName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tMethodSignature);
		match.getToBeTranslatedNodes().add(tMethodDefinition);
		match.getToBeTranslatedNodes().add(tMethodName);
		String tMethodSignature__tMethodDefinition____definitions_name_prime = "definitions";
		String tMethodDefinition__tMethodSignature____signature_name_prime = "signature";
		String tModel__tMethodName____methods_name_prime = "methods";
		String tMethodName__tModel____model_name_prime = "model";
		String tMethodName__tMethodSignature____signatures_name_prime = "signatures";
		String tMethodSignature__tMethodName____method_name_prime = "method";
		tMethodSignature__tMethodDefinition____definitions.setSrc(tMethodSignature);
		tMethodSignature__tMethodDefinition____definitions.setTrg(tMethodDefinition);
		match.getToBeTranslatedEdges().add(tMethodSignature__tMethodDefinition____definitions);
		tMethodDefinition__tMethodSignature____signature.setSrc(tMethodDefinition);
		tMethodDefinition__tMethodSignature____signature.setTrg(tMethodSignature);
		match.getToBeTranslatedEdges().add(tMethodDefinition__tMethodSignature____signature);
		tModel__tMethodName____methods.setSrc(tModel);
		tModel__tMethodName____methods.setTrg(tMethodName);
		match.getToBeTranslatedEdges().add(tModel__tMethodName____methods);
		tMethodName__tModel____model.setSrc(tMethodName);
		tMethodName__tModel____model.setTrg(tModel);
		match.getToBeTranslatedEdges().add(tMethodName__tModel____model);
		tMethodName__tMethodSignature____signatures.setSrc(tMethodName);
		tMethodName__tMethodSignature____signatures.setTrg(tMethodSignature);
		match.getToBeTranslatedEdges().add(tMethodName__tMethodSignature____signatures);
		tMethodSignature__tMethodName____method.setSrc(tMethodSignature);
		tMethodSignature__tMethodName____method.setTrg(tMethodName);
		match.getToBeTranslatedEdges().add(tMethodSignature__tMethodName____method);
		tMethodSignature__tMethodDefinition____definitions
				.setName(tMethodSignature__tMethodDefinition____definitions_name_prime);
		tMethodDefinition__tMethodSignature____signature
				.setName(tMethodDefinition__tMethodSignature____signature_name_prime);
		tModel__tMethodName____methods.setName(tModel__tMethodName____methods_name_prime);
		tMethodName__tModel____model.setName(tMethodName__tModel____model_name_prime);
		tMethodName__tMethodSignature____signatures.setName(tMethodName__tMethodSignature____signatures_name_prime);
		tMethodSignature__tMethodName____method.setName(tMethodSignature__tMethodName____method_name_prime);
		return new Object[] { match, tMethodSignature, tMethodDefinition, tModel, tMethodName,
				tMethodSignature__tMethodDefinition____definitions, tMethodDefinition__tMethodSignature____signature,
				tModel__tMethodName____methods, tMethodName__tModel____model,
				tMethodName__tMethodSignature____signatures, tMethodSignature__tMethodName____method };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_10_5_collectcontextelements_blackBBBBB(Match match,
			TMethodSignature tMethodSignature, TMethodDefinition tMethodDefinition, TypeGraph tModel,
			TMethod tMethodName) {
		return new Object[] { match, tMethodSignature, tMethodDefinition, tModel, tMethodName };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_10_5_collectcontextelements_greenBB(Match match,
			TypeGraph tModel) {
		match.getContextNodes().add(tModel);
		return new Object[] { match, tModel };
	}

	public static final void pattern_UnresolvedMethodDeclaration_10_6_registerobjectstomatch_expressionBBBBBB(
			UnresolvedMethodDeclaration _this, Match match, TMethodSignature tMethodSignature,
			TMethodDefinition tMethodDefinition, TypeGraph tModel, TMethod tMethodName) {
		_this.registerObjectsToMatch_BWD(match, tMethodSignature, tMethodDefinition, tModel, tMethodName);

	}

	public static final boolean pattern_UnresolvedMethodDeclaration_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UnresolvedMethodDeclaration_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tMethodSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mModel");
		EObject _localVariable_2 = isApplicableMatch.getObject("tMethodDefinition");
		EObject _localVariable_3 = isApplicableMatch.getObject("tModel");
		EObject _localVariable_4 = isApplicableMatch.getObject("tMethodName");
		EObject _localVariable_5 = isApplicableMatch.getObject("model2pm");
		EObject tmpTMethodSignature = _localVariable_0;
		EObject tmpMModel = _localVariable_1;
		EObject tmpTMethodDefinition = _localVariable_2;
		EObject tmpTModel = _localVariable_3;
		EObject tmpTMethodName = _localVariable_4;
		EObject tmpModel2pm = _localVariable_5;
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			if (tmpMModel instanceof Model) {
				Model mModel = (Model) tmpMModel;
				if (tmpTMethodDefinition instanceof TMethodDefinition) {
					TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
					if (tmpTModel instanceof TypeGraph) {
						TypeGraph tModel = (TypeGraph) tmpTModel;
						if (tmpTMethodName instanceof TMethod) {
							TMethod tMethodName = (TMethod) tmpTMethodName;
							if (tmpModel2pm instanceof ModelToTypeGraph) {
								ModelToTypeGraph model2pm = (ModelToTypeGraph) tmpModel2pm;
								return new Object[] { tMethodSignature, mModel, tMethodDefinition, tModel, tMethodName,
										model2pm, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_11_1_performtransformation_blackBBBBBBFBB(
			TMethodSignature tMethodSignature, Model mModel, TMethodDefinition tMethodDefinition, TypeGraph tModel,
			TMethod tMethodName, ModelToTypeGraph model2pm, UnresolvedMethodDeclaration _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tMethodSignature, mModel, tMethodDefinition, tModel, tMethodName, model2pm, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			UnresolvedMethodDeclaration _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UnresolvedMethodDeclaration_11_1_performtransformation_binding = pattern_UnresolvedMethodDeclaration_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_UnresolvedMethodDeclaration_11_1_performtransformation_binding != null) {
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_UnresolvedMethodDeclaration_11_1_performtransformation_binding[0];
			Model mModel = (Model) result_pattern_UnresolvedMethodDeclaration_11_1_performtransformation_binding[1];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result_pattern_UnresolvedMethodDeclaration_11_1_performtransformation_binding[2];
			TypeGraph tModel = (TypeGraph) result_pattern_UnresolvedMethodDeclaration_11_1_performtransformation_binding[3];
			TMethod tMethodName = (TMethod) result_pattern_UnresolvedMethodDeclaration_11_1_performtransformation_binding[4];
			ModelToTypeGraph model2pm = (ModelToTypeGraph) result_pattern_UnresolvedMethodDeclaration_11_1_performtransformation_binding[5];

			Object[] result_pattern_UnresolvedMethodDeclaration_11_1_performtransformation_black = pattern_UnresolvedMethodDeclaration_11_1_performtransformation_blackBBBBBBFBB(
					tMethodSignature, mModel, tMethodDefinition, tModel, tMethodName, model2pm, _this,
					isApplicableMatch);
			if (result_pattern_UnresolvedMethodDeclaration_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_UnresolvedMethodDeclaration_11_1_performtransformation_black[6];

				return new Object[] { tMethodSignature, mModel, tMethodDefinition, tModel, tMethodName, model2pm, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_11_1_performtransformation_greenFBBFB(Model mModel,
			TMethodDefinition tMethodDefinition, CSP csp) {
		MDefinitionToTMember unresolved2Definiton = PmFactory.eINSTANCE.createMDefinitionToTMember();
		org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod = JavaFactory.eINSTANCE
				.createUnresolvedMethodDeclaration();
		Object _localVariable_0 = csp.getValue("mMethod", "name");
		unresolved2Definiton.setTarget(tMethodDefinition);
		mModel.getUnresolvedItems().add(mMethod);
		unresolved2Definiton.setSource(mMethod);
		String mMethod_name_prime = (String) _localVariable_0;
		mMethod.setName(mMethod_name_prime);
		return new Object[] { unresolved2Definiton, mModel, tMethodDefinition, mMethod, csp };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_11_2_collecttranslatedelements_blackBBBBB(
			TMethodSignature tMethodSignature, MDefinitionToTMember unresolved2Definiton,
			TMethodDefinition tMethodDefinition, TMethod tMethodName,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		return new Object[] { tMethodSignature, unresolved2Definiton, tMethodDefinition, tMethodName, mMethod };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_11_2_collecttranslatedelements_greenFBBBBB(
			TMethodSignature tMethodSignature, MDefinitionToTMember unresolved2Definiton,
			TMethodDefinition tMethodDefinition, TMethod tMethodName,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tMethodSignature);
		ruleresult.getCreatedLinkElements().add(unresolved2Definiton);
		ruleresult.getTranslatedElements().add(tMethodDefinition);
		ruleresult.getTranslatedElements().add(tMethodName);
		ruleresult.getCreatedElements().add(mMethod);
		return new Object[] { ruleresult, tMethodSignature, unresolved2Definiton, tMethodDefinition, tMethodName,
				mMethod };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_11_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tMethodSignature, EObject unresolved2Definiton, EObject mModel,
			EObject tMethodDefinition, EObject tModel, EObject tMethodName, EObject model2pm, EObject mMethod) {
		if (!tMethodSignature.equals(unresolved2Definiton)) {
			if (!tMethodSignature.equals(tModel)) {
				if (!mModel.equals(tMethodSignature)) {
					if (!mModel.equals(unresolved2Definiton)) {
						if (!mModel.equals(tMethodDefinition)) {
							if (!mModel.equals(tModel)) {
								if (!mModel.equals(tMethodName)) {
									if (!mModel.equals(model2pm)) {
										if (!tMethodDefinition.equals(tMethodSignature)) {
											if (!tMethodDefinition.equals(unresolved2Definiton)) {
												if (!tMethodDefinition.equals(tModel)) {
													if (!tMethodDefinition.equals(tMethodName)) {
														if (!tModel.equals(unresolved2Definiton)) {
															if (!tMethodName.equals(tMethodSignature)) {
																if (!tMethodName.equals(unresolved2Definiton)) {
																	if (!tMethodName.equals(tModel)) {
																		if (!model2pm.equals(tMethodSignature)) {
																			if (!model2pm
																					.equals(unresolved2Definiton)) {
																				if (!model2pm
																						.equals(tMethodDefinition)) {
																					if (!model2pm.equals(tModel)) {
																						if (!model2pm
																								.equals(tMethodName)) {
																							if (!mMethod.equals(
																									tMethodSignature)) {
																								if (!mMethod.equals(
																										unresolved2Definiton)) {
																									if (!mMethod.equals(
																											mModel)) {
																										if (!mMethod
																												.equals(tMethodDefinition)) {
																											if (!mMethod
																													.equals(tModel)) {
																												if (!mMethod
																														.equals(tMethodName)) {
																													if (!mMethod
																															.equals(model2pm)) {
																														return new Object[] {
																																ruleresult,
																																tMethodSignature,
																																unresolved2Definiton,
																																mModel,
																																tMethodDefinition,
																																tModel,
																																tMethodName,
																																model2pm,
																																mMethod };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UnresolvedMethodDeclaration_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tMethodSignature, EObject unresolved2Definiton, EObject mModel,
			EObject tMethodDefinition, EObject tModel, EObject tMethodName, EObject mMethod) {
		EMoflonEdge tMethodSignature__tMethodDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tMethodSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mMethod____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge unresolved2Definiton__tMethodDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tModel__tMethodName____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodName__tModel____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodName__tMethodSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tMethodName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge unresolved2Definiton__mMethod____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UnresolvedMethodDeclaration";
		String tMethodSignature__tMethodDefinition____definitions_name_prime = "definitions";
		String tMethodDefinition__tMethodSignature____signature_name_prime = "signature";
		String mModel__mMethod____unresolvedItems_name_prime = "unresolvedItems";
		String unresolved2Definiton__tMethodDefinition____target_name_prime = "target";
		String tModel__tMethodName____methods_name_prime = "methods";
		String tMethodName__tModel____model_name_prime = "model";
		String tMethodName__tMethodSignature____signatures_name_prime = "signatures";
		String tMethodSignature__tMethodName____method_name_prime = "method";
		String unresolved2Definiton__mMethod____source_name_prime = "source";
		tMethodSignature__tMethodDefinition____definitions.setSrc(tMethodSignature);
		tMethodSignature__tMethodDefinition____definitions.setTrg(tMethodDefinition);
		ruleresult.getTranslatedEdges().add(tMethodSignature__tMethodDefinition____definitions);
		tMethodDefinition__tMethodSignature____signature.setSrc(tMethodDefinition);
		tMethodDefinition__tMethodSignature____signature.setTrg(tMethodSignature);
		ruleresult.getTranslatedEdges().add(tMethodDefinition__tMethodSignature____signature);
		mModel__mMethod____unresolvedItems.setSrc(mModel);
		mModel__mMethod____unresolvedItems.setTrg(mMethod);
		ruleresult.getCreatedEdges().add(mModel__mMethod____unresolvedItems);
		unresolved2Definiton__tMethodDefinition____target.setSrc(unresolved2Definiton);
		unresolved2Definiton__tMethodDefinition____target.setTrg(tMethodDefinition);
		ruleresult.getCreatedEdges().add(unresolved2Definiton__tMethodDefinition____target);
		tModel__tMethodName____methods.setSrc(tModel);
		tModel__tMethodName____methods.setTrg(tMethodName);
		ruleresult.getTranslatedEdges().add(tModel__tMethodName____methods);
		tMethodName__tModel____model.setSrc(tMethodName);
		tMethodName__tModel____model.setTrg(tModel);
		ruleresult.getTranslatedEdges().add(tMethodName__tModel____model);
		tMethodName__tMethodSignature____signatures.setSrc(tMethodName);
		tMethodName__tMethodSignature____signatures.setTrg(tMethodSignature);
		ruleresult.getTranslatedEdges().add(tMethodName__tMethodSignature____signatures);
		tMethodSignature__tMethodName____method.setSrc(tMethodSignature);
		tMethodSignature__tMethodName____method.setTrg(tMethodName);
		ruleresult.getTranslatedEdges().add(tMethodSignature__tMethodName____method);
		unresolved2Definiton__mMethod____source.setSrc(unresolved2Definiton);
		unresolved2Definiton__mMethod____source.setTrg(mMethod);
		ruleresult.getCreatedEdges().add(unresolved2Definiton__mMethod____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMethodSignature__tMethodDefinition____definitions
				.setName(tMethodSignature__tMethodDefinition____definitions_name_prime);
		tMethodDefinition__tMethodSignature____signature
				.setName(tMethodDefinition__tMethodSignature____signature_name_prime);
		mModel__mMethod____unresolvedItems.setName(mModel__mMethod____unresolvedItems_name_prime);
		unresolved2Definiton__tMethodDefinition____target
				.setName(unresolved2Definiton__tMethodDefinition____target_name_prime);
		tModel__tMethodName____methods.setName(tModel__tMethodName____methods_name_prime);
		tMethodName__tModel____model.setName(tMethodName__tModel____model_name_prime);
		tMethodName__tMethodSignature____signatures.setName(tMethodName__tMethodSignature____signatures_name_prime);
		tMethodSignature__tMethodName____method.setName(tMethodSignature__tMethodName____method_name_prime);
		unresolved2Definiton__mMethod____source.setName(unresolved2Definiton__mMethod____source_name_prime);
		return new Object[] { ruleresult, tMethodSignature, unresolved2Definiton, mModel, tMethodDefinition, tModel,
				tMethodName, mMethod, tMethodSignature__tMethodDefinition____definitions,
				tMethodDefinition__tMethodSignature____signature, mModel__mMethod____unresolvedItems,
				unresolved2Definiton__tMethodDefinition____target, tModel__tMethodName____methods,
				tMethodName__tModel____model, tMethodName__tMethodSignature____signatures,
				tMethodSignature__tMethodName____method, unresolved2Definiton__mMethod____source };
	}

	public static final void pattern_UnresolvedMethodDeclaration_11_5_registerobjects_expressionBBBBBBBBBB(
			UnresolvedMethodDeclaration _this, PerformRuleResult ruleresult, EObject tMethodSignature,
			EObject unresolved2Definiton, EObject mModel, EObject tMethodDefinition, EObject tModel,
			EObject tMethodName, EObject model2pm, EObject mMethod) {
		_this.registerObjects_BWD(ruleresult, tMethodSignature, unresolved2Definiton, mModel, tMethodDefinition, tModel,
				tMethodName, model2pm, mMethod);

	}

	public static final PerformRuleResult pattern_UnresolvedMethodDeclaration_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_12_1_preparereturnvalue_bindingFB(
			UnresolvedMethodDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_12_1_preparereturnvalue_blackFBB(EClass eClass,
			UnresolvedMethodDeclaration _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_12_1_preparereturnvalue_bindingAndBlackFFB(
			UnresolvedMethodDeclaration _this) {
		Object[] result_pattern_UnresolvedMethodDeclaration_12_1_preparereturnvalue_binding = pattern_UnresolvedMethodDeclaration_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_UnresolvedMethodDeclaration_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_UnresolvedMethodDeclaration_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_UnresolvedMethodDeclaration_12_1_preparereturnvalue_black = pattern_UnresolvedMethodDeclaration_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_UnresolvedMethodDeclaration_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UnresolvedMethodDeclaration_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "UnresolvedMethodDeclaration";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tMethodSignature");
		EObject _localVariable_1 = match.getObject("tMethodDefinition");
		EObject _localVariable_2 = match.getObject("tModel");
		EObject _localVariable_3 = match.getObject("tMethodName");
		EObject tmpTMethodSignature = _localVariable_0;
		EObject tmpTMethodDefinition = _localVariable_1;
		EObject tmpTModel = _localVariable_2;
		EObject tmpTMethodName = _localVariable_3;
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			if (tmpTMethodDefinition instanceof TMethodDefinition) {
				TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
				if (tmpTModel instanceof TypeGraph) {
					TypeGraph tModel = (TypeGraph) tmpTModel;
					if (tmpTMethodName instanceof TMethod) {
						TMethod tMethodName = (TMethod) tmpTMethodName;
						return new Object[] { tMethodSignature, tMethodDefinition, tModel, tMethodName, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedMethodDeclaration_12_2_corematch_blackBFBBBFB(
			TMethodSignature tMethodSignature, TMethodDefinition tMethodDefinition, TypeGraph tModel,
			TMethod tMethodName, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph model2pm : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(tModel,
				ModelToTypeGraph.class, "target")) {
			Model mModel = model2pm.getSource();
			if (mModel != null) {
				_result.add(new Object[] { tMethodSignature, mModel, tMethodDefinition, tModel, tMethodName, model2pm,
						match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UnresolvedMethodDeclaration_12_3_findcontext_blackBBBBBB(
			TMethodSignature tMethodSignature, Model mModel, TMethodDefinition tMethodDefinition, TypeGraph tModel,
			TMethod tMethodName, ModelToTypeGraph model2pm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
			if (tModel.getMethods().contains(tMethodName)) {
				if (tMethodName.getSignatures().contains(tMethodSignature)) {
					if (mModel.equals(model2pm.getSource())) {
						if (tModel.equals(model2pm.getTarget())) {
							_result.add(new Object[] { tMethodSignature, mModel, tMethodDefinition, tModel, tMethodName,
									model2pm });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_12_3_findcontext_greenBBBBBBFFFFFFFFF(
			TMethodSignature tMethodSignature, Model mModel, TMethodDefinition tMethodDefinition, TypeGraph tModel,
			TMethod tMethodName, ModelToTypeGraph model2pm) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tMethodSignature__tMethodDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodDefinition__tMethodSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tModel__tMethodName____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodName__tModel____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodName__tMethodSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMethodSignature__tMethodName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model2pm__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model2pm__tModel____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tMethodSignature__tMethodDefinition____definitions_name_prime = "definitions";
		String tMethodDefinition__tMethodSignature____signature_name_prime = "signature";
		String tModel__tMethodName____methods_name_prime = "methods";
		String tMethodName__tModel____model_name_prime = "model";
		String tMethodName__tMethodSignature____signatures_name_prime = "signatures";
		String tMethodSignature__tMethodName____method_name_prime = "method";
		String model2pm__mModel____source_name_prime = "source";
		String model2pm__tModel____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(mModel);
		isApplicableMatch.getAllContextElements().add(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(tModel);
		isApplicableMatch.getAllContextElements().add(tMethodName);
		isApplicableMatch.getAllContextElements().add(model2pm);
		tMethodSignature__tMethodDefinition____definitions.setSrc(tMethodSignature);
		tMethodSignature__tMethodDefinition____definitions.setTrg(tMethodDefinition);
		isApplicableMatch.getAllContextElements().add(tMethodSignature__tMethodDefinition____definitions);
		tMethodDefinition__tMethodSignature____signature.setSrc(tMethodDefinition);
		tMethodDefinition__tMethodSignature____signature.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(tMethodDefinition__tMethodSignature____signature);
		tModel__tMethodName____methods.setSrc(tModel);
		tModel__tMethodName____methods.setTrg(tMethodName);
		isApplicableMatch.getAllContextElements().add(tModel__tMethodName____methods);
		tMethodName__tModel____model.setSrc(tMethodName);
		tMethodName__tModel____model.setTrg(tModel);
		isApplicableMatch.getAllContextElements().add(tMethodName__tModel____model);
		tMethodName__tMethodSignature____signatures.setSrc(tMethodName);
		tMethodName__tMethodSignature____signatures.setTrg(tMethodSignature);
		isApplicableMatch.getAllContextElements().add(tMethodName__tMethodSignature____signatures);
		tMethodSignature__tMethodName____method.setSrc(tMethodSignature);
		tMethodSignature__tMethodName____method.setTrg(tMethodName);
		isApplicableMatch.getAllContextElements().add(tMethodSignature__tMethodName____method);
		model2pm__mModel____source.setSrc(model2pm);
		model2pm__mModel____source.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(model2pm__mModel____source);
		model2pm__tModel____target.setSrc(model2pm);
		model2pm__tModel____target.setTrg(tModel);
		isApplicableMatch.getAllContextElements().add(model2pm__tModel____target);
		tMethodSignature__tMethodDefinition____definitions
				.setName(tMethodSignature__tMethodDefinition____definitions_name_prime);
		tMethodDefinition__tMethodSignature____signature
				.setName(tMethodDefinition__tMethodSignature____signature_name_prime);
		tModel__tMethodName____methods.setName(tModel__tMethodName____methods_name_prime);
		tMethodName__tModel____model.setName(tMethodName__tModel____model_name_prime);
		tMethodName__tMethodSignature____signatures.setName(tMethodName__tMethodSignature____signatures_name_prime);
		tMethodSignature__tMethodName____method.setName(tMethodSignature__tMethodName____method_name_prime);
		model2pm__mModel____source.setName(model2pm__mModel____source_name_prime);
		model2pm__tModel____target.setName(model2pm__tModel____target_name_prime);
		return new Object[] { tMethodSignature, mModel, tMethodDefinition, tModel, tMethodName, model2pm,
				isApplicableMatch, tMethodSignature__tMethodDefinition____definitions,
				tMethodDefinition__tMethodSignature____signature, tModel__tMethodName____methods,
				tMethodName__tModel____model, tMethodName__tMethodSignature____signatures,
				tMethodSignature__tMethodName____method, model2pm__mModel____source, model2pm__tModel____target };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_12_4_solveCSP_bindingFBBBBBBBB(
			UnresolvedMethodDeclaration _this, IsApplicableMatch isApplicableMatch, TMethodSignature tMethodSignature,
			Model mModel, TMethodDefinition tMethodDefinition, TypeGraph tModel, TMethod tMethodName,
			ModelToTypeGraph model2pm) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tMethodSignature, mModel,
				tMethodDefinition, tModel, tMethodName, model2pm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tMethodSignature, mModel, tMethodDefinition, tModel,
					tMethodName, model2pm };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			UnresolvedMethodDeclaration _this, IsApplicableMatch isApplicableMatch, TMethodSignature tMethodSignature,
			Model mModel, TMethodDefinition tMethodDefinition, TypeGraph tModel, TMethod tMethodName,
			ModelToTypeGraph model2pm) {
		Object[] result_pattern_UnresolvedMethodDeclaration_12_4_solveCSP_binding = pattern_UnresolvedMethodDeclaration_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, tMethodSignature, mModel, tMethodDefinition, tModel, tMethodName, model2pm);
		if (result_pattern_UnresolvedMethodDeclaration_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedMethodDeclaration_12_4_solveCSP_binding[0];

			Object[] result_pattern_UnresolvedMethodDeclaration_12_4_solveCSP_black = pattern_UnresolvedMethodDeclaration_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedMethodDeclaration_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tMethodSignature, mModel, tMethodDefinition,
						tModel, tMethodName, model2pm };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedMethodDeclaration_12_5_checkCSP_expressionFBB(
			UnresolvedMethodDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UnresolvedMethodDeclaration";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UnresolvedMethodDeclaration_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_20_1_preparereturnvalue_bindingFB(
			UnresolvedMethodDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			UnresolvedMethodDeclaration _this) {
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

	public static final Object[] pattern_UnresolvedMethodDeclaration_20_1_preparereturnvalue_bindingAndBlackFFBF(
			UnresolvedMethodDeclaration _this) {
		Object[] result_pattern_UnresolvedMethodDeclaration_20_1_preparereturnvalue_binding = pattern_UnresolvedMethodDeclaration_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_UnresolvedMethodDeclaration_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_UnresolvedMethodDeclaration_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_UnresolvedMethodDeclaration_20_1_preparereturnvalue_black = pattern_UnresolvedMethodDeclaration_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_UnresolvedMethodDeclaration_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UnresolvedMethodDeclaration_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_UnresolvedMethodDeclaration_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_20_2_testcorematchandDECs_black_nac_0BB(
			TMethodSignature tMethodSignature, TMethod tMethodName) {
		TMethod __DEC_tMethodSignature_method_456206 = tMethodSignature.getMethod();
		if (__DEC_tMethodSignature_method_456206 != null) {
			if (!tMethodName.equals(__DEC_tMethodSignature_method_456206)) {
				return new Object[] { tMethodSignature, tMethodName };
			}
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_20_2_testcorematchandDECs_black_nac_1B(
			TMethodSignature tMethodSignature) {
		TAbstractType __DEC_tMethodSignature_returnType_25134 = tMethodSignature.getReturnType();
		if (__DEC_tMethodSignature_returnType_25134 != null) {
			return new Object[] { tMethodSignature };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_20_2_testcorematchandDECs_black_nac_2BB(
			TMethodDefinition tMethodDefinition, TMethodSignature tMethodSignature) {
		TSignature __DEC_tMethodDefinition_signature_703160 = tMethodDefinition.getSignature();
		if (__DEC_tMethodDefinition_signature_703160 != null) {
			if (!tMethodSignature.equals(__DEC_tMethodDefinition_signature_703160)) {
				return new Object[] { tMethodDefinition, tMethodSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_20_2_testcorematchandDECs_black_nac_3B(
			TMethodDefinition tMethodDefinition) {
		TAbstractType __DEC_tMethodDefinition_returnType_743703 = tMethodDefinition.getReturnType();
		if (__DEC_tMethodDefinition_returnType_743703 != null) {
			return new Object[] { tMethodDefinition };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_20_2_testcorematchandDECs_black_nac_4B(
			TMethodDefinition tMethodDefinition) {
		TModule __DEC_tMethodDefinition_contains_203946 = tMethodDefinition.getModule();
		if (__DEC_tMethodDefinition_contains_203946 != null) {
			return new Object[] { tMethodDefinition };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_20_2_testcorematchandDECs_black_nac_5BB(
			TMethod tMethodName, TypeGraph tModel) {
		TypeGraph __DEC_tMethodName_model_853652 = tMethodName.getModel();
		if (__DEC_tMethodName_model_853652 != null) {
			if (!tModel.equals(__DEC_tMethodName_model_853652)) {
				return new Object[] { tMethodName, tModel };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedMethodDeclaration_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_definitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMethodSignature = _edge_definitions.getSrc();
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			EObject tmpTMethodDefinition = _edge_definitions.getTrg();
			if (tmpTMethodDefinition instanceof TMethodDefinition) {
				TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
				if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
					TMethod tMethodName = tMethodSignature.getMethod();
					if (tMethodName != null) {
						TypeGraph tModel = tMethodName.getModel();
						if (tModel != null) {
							if (pattern_UnresolvedMethodDeclaration_20_2_testcorematchandDECs_black_nac_1B(
									tMethodSignature) == null) {
								if (pattern_UnresolvedMethodDeclaration_20_2_testcorematchandDECs_black_nac_2BB(
										tMethodDefinition, tMethodSignature) == null) {
									if (pattern_UnresolvedMethodDeclaration_20_2_testcorematchandDECs_black_nac_3B(
											tMethodDefinition) == null) {
										if (pattern_UnresolvedMethodDeclaration_20_2_testcorematchandDECs_black_nac_4B(
												tMethodDefinition) == null) {
											if (pattern_UnresolvedMethodDeclaration_20_2_testcorematchandDECs_black_nac_0BB(
													tMethodSignature, tMethodName) == null) {
												if (pattern_UnresolvedMethodDeclaration_20_2_testcorematchandDECs_black_nac_5BB(
														tMethodName, tModel) == null) {
													_result.add(new Object[] { tMethodSignature, tMethodDefinition,
															tModel, tMethodName, _edge_definitions });
												}
											}
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

	public static final Object[] pattern_UnresolvedMethodDeclaration_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UnresolvedMethodDeclaration_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			UnresolvedMethodDeclaration _this, Match match, TMethodSignature tMethodSignature,
			TMethodDefinition tMethodDefinition, TypeGraph tModel, TMethod tMethodName) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tMethodSignature, tMethodDefinition, tModel,
				tMethodName);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UnresolvedMethodDeclaration_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			UnresolvedMethodDeclaration _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_UnresolvedMethodDeclaration_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_21_1_preparereturnvalue_bindingFB(
			UnresolvedMethodDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			UnresolvedMethodDeclaration _this) {
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

	public static final Object[] pattern_UnresolvedMethodDeclaration_21_1_preparereturnvalue_bindingAndBlackFFBF(
			UnresolvedMethodDeclaration _this) {
		Object[] result_pattern_UnresolvedMethodDeclaration_21_1_preparereturnvalue_binding = pattern_UnresolvedMethodDeclaration_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_UnresolvedMethodDeclaration_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_UnresolvedMethodDeclaration_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_UnresolvedMethodDeclaration_21_1_preparereturnvalue_black = pattern_UnresolvedMethodDeclaration_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_UnresolvedMethodDeclaration_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UnresolvedMethodDeclaration_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_UnresolvedMethodDeclaration_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_21_2_testcorematchandDECs_black_nac_0B(
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		AbstractTypeDeclaration __DEC_mMethod_abstractTypeDeclaration_399355 = mMethod.getAbstractTypeDeclaration();
		if (__DEC_mMethod_abstractTypeDeclaration_399355 != null) {
			return new Object[] { mMethod };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_21_2_testcorematchandDECs_black_nac_1B(
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		AnonymousClassDeclaration __DEC_mMethod_anonymousClassDeclarationOwner_438571 = mMethod
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mMethod_anonymousClassDeclarationOwner_438571 != null) {
			return new Object[] { mMethod };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_21_2_testcorematchandDECs_black_nac_2B(
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		TypeAccess __DEC_mMethod_returnType_414189 = mMethod.getReturnType();
		if (__DEC_mMethod_returnType_414189 != null) {
			return new Object[] { mMethod };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedMethodDeclaration_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_unresolvedItems) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMModel = _edge_unresolvedItems.getSrc();
		if (tmpMModel instanceof Model) {
			Model mModel = (Model) tmpMModel;
			EObject tmpMMethod = _edge_unresolvedItems.getTrg();
			if (tmpMMethod instanceof org.eclipse.modisco.java.UnresolvedMethodDeclaration) {
				org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod = (org.eclipse.modisco.java.UnresolvedMethodDeclaration) tmpMMethod;
				if (mModel.getUnresolvedItems().contains(mMethod)) {
					if (pattern_UnresolvedMethodDeclaration_21_2_testcorematchandDECs_black_nac_0B(mMethod) == null) {
						if (pattern_UnresolvedMethodDeclaration_21_2_testcorematchandDECs_black_nac_1B(
								mMethod) == null) {
							if (pattern_UnresolvedMethodDeclaration_21_2_testcorematchandDECs_black_nac_2B(
									mMethod) == null) {
								_result.add(new Object[] { mModel, mMethod, _edge_unresolvedItems });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UnresolvedMethodDeclaration_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			UnresolvedMethodDeclaration _this, Match match, Model mModel,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mModel, mMethod);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UnresolvedMethodDeclaration_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			UnresolvedMethodDeclaration _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_UnresolvedMethodDeclaration_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_24_1_prepare_blackB(
			UnresolvedMethodDeclaration _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tMethodSignature");
		EObject _localVariable_1 = sourceMatch.getObject("mModel");
		EObject _localVariable_2 = targetMatch.getObject("tMethodDefinition");
		EObject _localVariable_3 = targetMatch.getObject("tModel");
		EObject _localVariable_4 = targetMatch.getObject("tMethodName");
		EObject _localVariable_5 = sourceMatch.getObject("mMethod");
		EObject tmpTMethodSignature = _localVariable_0;
		EObject tmpMModel = _localVariable_1;
		EObject tmpTMethodDefinition = _localVariable_2;
		EObject tmpTModel = _localVariable_3;
		EObject tmpTMethodName = _localVariable_4;
		EObject tmpMMethod = _localVariable_5;
		if (tmpTMethodSignature instanceof TMethodSignature) {
			TMethodSignature tMethodSignature = (TMethodSignature) tmpTMethodSignature;
			if (tmpMModel instanceof Model) {
				Model mModel = (Model) tmpMModel;
				if (tmpTMethodDefinition instanceof TMethodDefinition) {
					TMethodDefinition tMethodDefinition = (TMethodDefinition) tmpTMethodDefinition;
					if (tmpTModel instanceof TypeGraph) {
						TypeGraph tModel = (TypeGraph) tmpTModel;
						if (tmpTMethodName instanceof TMethod) {
							TMethod tMethodName = (TMethod) tmpTMethodName;
							if (tmpMMethod instanceof org.eclipse.modisco.java.UnresolvedMethodDeclaration) {
								org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod = (org.eclipse.modisco.java.UnresolvedMethodDeclaration) tmpMMethod;
								return new Object[] { tMethodSignature, mModel, tMethodDefinition, tModel, tMethodName,
										mMethod, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_24_2_matchsrctrgcontext_blackBBBBBBBB(
			TMethodSignature tMethodSignature, Model mModel, TMethodDefinition tMethodDefinition, TypeGraph tModel,
			TMethod tMethodName, org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tMethodSignature, mModel, tMethodDefinition, tModel, tMethodName, mMethod,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_UnresolvedMethodDeclaration_24_2_matchsrctrgcontext_binding = pattern_UnresolvedMethodDeclaration_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_UnresolvedMethodDeclaration_24_2_matchsrctrgcontext_binding != null) {
			TMethodSignature tMethodSignature = (TMethodSignature) result_pattern_UnresolvedMethodDeclaration_24_2_matchsrctrgcontext_binding[0];
			Model mModel = (Model) result_pattern_UnresolvedMethodDeclaration_24_2_matchsrctrgcontext_binding[1];
			TMethodDefinition tMethodDefinition = (TMethodDefinition) result_pattern_UnresolvedMethodDeclaration_24_2_matchsrctrgcontext_binding[2];
			TypeGraph tModel = (TypeGraph) result_pattern_UnresolvedMethodDeclaration_24_2_matchsrctrgcontext_binding[3];
			TMethod tMethodName = (TMethod) result_pattern_UnresolvedMethodDeclaration_24_2_matchsrctrgcontext_binding[4];
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod = (org.eclipse.modisco.java.UnresolvedMethodDeclaration) result_pattern_UnresolvedMethodDeclaration_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_UnresolvedMethodDeclaration_24_2_matchsrctrgcontext_black = pattern_UnresolvedMethodDeclaration_24_2_matchsrctrgcontext_blackBBBBBBBB(
					tMethodSignature, mModel, tMethodDefinition, tModel, tMethodName, mMethod, sourceMatch,
					targetMatch);
			if (result_pattern_UnresolvedMethodDeclaration_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tMethodSignature, mModel, tMethodDefinition, tModel, tMethodName, mMethod,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_24_3_solvecsp_bindingFBBBBBBBBB(
			UnresolvedMethodDeclaration _this, TMethodSignature tMethodSignature, Model mModel,
			TMethodDefinition tMethodDefinition, TypeGraph tModel, TMethod tMethodName,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tMethodSignature, mModel, tMethodDefinition, tModel,
				tMethodName, mMethod, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tMethodSignature, mModel, tMethodDefinition, tModel, tMethodName, mMethod,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			UnresolvedMethodDeclaration _this, TMethodSignature tMethodSignature, Model mModel,
			TMethodDefinition tMethodDefinition, TypeGraph tModel, TMethod tMethodName,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_UnresolvedMethodDeclaration_24_3_solvecsp_binding = pattern_UnresolvedMethodDeclaration_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, tMethodSignature, mModel, tMethodDefinition, tModel, tMethodName, mMethod, sourceMatch,
				targetMatch);
		if (result_pattern_UnresolvedMethodDeclaration_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedMethodDeclaration_24_3_solvecsp_binding[0];

			Object[] result_pattern_UnresolvedMethodDeclaration_24_3_solvecsp_black = pattern_UnresolvedMethodDeclaration_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_UnresolvedMethodDeclaration_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tMethodSignature, mModel, tMethodDefinition, tModel, tMethodName,
						mMethod, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedMethodDeclaration_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_UnresolvedMethodDeclaration_24_5_matchcorrcontext_blackBBFBB(
			Model mModel, TypeGraph tModel, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph model2pm : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(mModel,
					ModelToTypeGraph.class, "source")) {
				if (tModel.equals(model2pm.getTarget())) {
					_result.add(new Object[] { mModel, tModel, model2pm, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_24_5_matchcorrcontext_greenBBBF(
			ModelToTypeGraph model2pm, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "UnresolvedMethodDeclaration";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(model2pm);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { model2pm, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_24_6_createcorrespondence_blackBBBBBBB(
			TMethodSignature tMethodSignature, Model mModel, TMethodDefinition tMethodDefinition, TypeGraph tModel,
			TMethod tMethodName, org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod, CCMatch ccMatch) {
		return new Object[] { tMethodSignature, mModel, tMethodDefinition, tModel, tMethodName, mMethod, ccMatch };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_24_6_createcorrespondence_greenFBBB(
			TMethodDefinition tMethodDefinition, org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod,
			CCMatch ccMatch) {
		MDefinitionToTMember unresolved2Definiton = PmFactory.eINSTANCE.createMDefinitionToTMember();
		unresolved2Definiton.setTarget(tMethodDefinition);
		unresolved2Definiton.setSource(mMethod);
		ccMatch.getCreateCorr().add(unresolved2Definiton);
		return new Object[] { unresolved2Definiton, tMethodDefinition, mMethod, ccMatch };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "UnresolvedMethodDeclaration";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_UnresolvedMethodDeclaration_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_27_1_matchtggpattern_black_nac_0B(
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		AbstractTypeDeclaration __DEC_mMethod_abstractTypeDeclaration_743149 = mMethod.getAbstractTypeDeclaration();
		if (__DEC_mMethod_abstractTypeDeclaration_743149 != null) {
			return new Object[] { mMethod };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_27_1_matchtggpattern_black_nac_1B(
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		AnonymousClassDeclaration __DEC_mMethod_anonymousClassDeclarationOwner_829177 = mMethod
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mMethod_anonymousClassDeclarationOwner_829177 != null) {
			return new Object[] { mMethod };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_27_1_matchtggpattern_black_nac_2B(
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		TypeAccess __DEC_mMethod_returnType_542831 = mMethod.getReturnType();
		if (__DEC_mMethod_returnType_542831 != null) {
			return new Object[] { mMethod };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_27_1_matchtggpattern_blackBB(Model mModel,
			org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod) {
		if (mModel.getUnresolvedItems().contains(mMethod)) {
			if (pattern_UnresolvedMethodDeclaration_27_1_matchtggpattern_black_nac_0B(mMethod) == null) {
				if (pattern_UnresolvedMethodDeclaration_27_1_matchtggpattern_black_nac_1B(mMethod) == null) {
					if (pattern_UnresolvedMethodDeclaration_27_1_matchtggpattern_black_nac_2B(mMethod) == null) {
						return new Object[] { mModel, mMethod };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedMethodDeclaration_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UnresolvedMethodDeclaration_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_28_1_matchtggpattern_black_nac_0BB(
			TMethodSignature tMethodSignature, TMethod tMethodName) {
		TMethod __DEC_tMethodSignature_method_487501 = tMethodSignature.getMethod();
		if (__DEC_tMethodSignature_method_487501 != null) {
			if (!tMethodName.equals(__DEC_tMethodSignature_method_487501)) {
				return new Object[] { tMethodSignature, tMethodName };
			}
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_28_1_matchtggpattern_black_nac_1B(
			TMethodSignature tMethodSignature) {
		TAbstractType __DEC_tMethodSignature_returnType_177015 = tMethodSignature.getReturnType();
		if (__DEC_tMethodSignature_returnType_177015 != null) {
			return new Object[] { tMethodSignature };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_28_1_matchtggpattern_black_nac_2BB(
			TMethodDefinition tMethodDefinition, TMethodSignature tMethodSignature) {
		TSignature __DEC_tMethodDefinition_signature_689100 = tMethodDefinition.getSignature();
		if (__DEC_tMethodDefinition_signature_689100 != null) {
			if (!tMethodSignature.equals(__DEC_tMethodDefinition_signature_689100)) {
				return new Object[] { tMethodDefinition, tMethodSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_28_1_matchtggpattern_black_nac_3B(
			TMethodDefinition tMethodDefinition) {
		TAbstractType __DEC_tMethodDefinition_returnType_288267 = tMethodDefinition.getReturnType();
		if (__DEC_tMethodDefinition_returnType_288267 != null) {
			return new Object[] { tMethodDefinition };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_28_1_matchtggpattern_black_nac_4B(
			TMethodDefinition tMethodDefinition) {
		TModule __DEC_tMethodDefinition_contains_830053 = tMethodDefinition.getModule();
		if (__DEC_tMethodDefinition_contains_830053 != null) {
			return new Object[] { tMethodDefinition };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_28_1_matchtggpattern_black_nac_5BB(
			TMethod tMethodName, TypeGraph tModel) {
		TypeGraph __DEC_tMethodName_model_586278 = tMethodName.getModel();
		if (__DEC_tMethodName_model_586278 != null) {
			if (!tModel.equals(__DEC_tMethodName_model_586278)) {
				return new Object[] { tMethodName, tModel };
			}
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_28_1_matchtggpattern_blackBBBB(
			TMethodSignature tMethodSignature, TMethodDefinition tMethodDefinition, TypeGraph tModel,
			TMethod tMethodName) {
		if (tMethodSignature.getDefinitions().contains(tMethodDefinition)) {
			if (tModel.getMethods().contains(tMethodName)) {
				if (tMethodName.getSignatures().contains(tMethodSignature)) {
					if (pattern_UnresolvedMethodDeclaration_28_1_matchtggpattern_black_nac_0BB(tMethodSignature,
							tMethodName) == null) {
						if (pattern_UnresolvedMethodDeclaration_28_1_matchtggpattern_black_nac_1B(
								tMethodSignature) == null) {
							if (pattern_UnresolvedMethodDeclaration_28_1_matchtggpattern_black_nac_2BB(
									tMethodDefinition, tMethodSignature) == null) {
								if (pattern_UnresolvedMethodDeclaration_28_1_matchtggpattern_black_nac_3B(
										tMethodDefinition) == null) {
									if (pattern_UnresolvedMethodDeclaration_28_1_matchtggpattern_black_nac_4B(
											tMethodDefinition) == null) {
										if (pattern_UnresolvedMethodDeclaration_28_1_matchtggpattern_black_nac_5BB(
												tMethodName, tModel) == null) {
											return new Object[] { tMethodSignature, tMethodDefinition, tModel,
													tMethodName };
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

	public static final boolean pattern_UnresolvedMethodDeclaration_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UnresolvedMethodDeclaration_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_29_1_createresult_blackB(
			UnresolvedMethodDeclaration _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Model mModel) {
		if (ruleResult.getSourceObjects().contains(mModel)) {
			return new Object[] { ruleResult, mModel };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph model2pm) {
		if (ruleResult.getCorrObjects().contains(model2pm)) {
			return new Object[] { ruleResult, model2pm };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph tModel) {
		if (ruleResult.getTargetObjects().contains(tModel)) {
			return new Object[] { ruleResult, tModel };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedMethodDeclaration_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList model2pmList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpModel2pm : model2pmList.getEntryObjects()) {
				if (tmpModel2pm instanceof ModelToTypeGraph) {
					ModelToTypeGraph model2pm = (ModelToTypeGraph) tmpModel2pm;
					Model mModel = model2pm.getSource();
					if (mModel != null) {
						TypeGraph tModel = model2pm.getTarget();
						if (tModel != null) {
							if (pattern_UnresolvedMethodDeclaration_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									model2pm) == null) {
								if (pattern_UnresolvedMethodDeclaration_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										mModel) == null) {
									if (pattern_UnresolvedMethodDeclaration_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, tModel) == null) {
										_result.add(new Object[] { model2pmList, mModel, model2pm, tModel,
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

	public static final Object[] pattern_UnresolvedMethodDeclaration_29_3_solveCSP_bindingFBBBBBB(
			UnresolvedMethodDeclaration _this, IsApplicableMatch isApplicableMatch, Model mModel, TypeGraph tModel,
			ModelToTypeGraph model2pm, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mModel, tModel, model2pm,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mModel, tModel, model2pm, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_29_3_solveCSP_bindingAndBlackFBBBBBB(
			UnresolvedMethodDeclaration _this, IsApplicableMatch isApplicableMatch, Model mModel, TypeGraph tModel,
			ModelToTypeGraph model2pm, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_UnresolvedMethodDeclaration_29_3_solveCSP_binding = pattern_UnresolvedMethodDeclaration_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mModel, tModel, model2pm, ruleResult);
		if (result_pattern_UnresolvedMethodDeclaration_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedMethodDeclaration_29_3_solveCSP_binding[0];

			Object[] result_pattern_UnresolvedMethodDeclaration_29_3_solveCSP_black = pattern_UnresolvedMethodDeclaration_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedMethodDeclaration_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mModel, tModel, model2pm, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedMethodDeclaration_29_4_checkCSP_expressionFBB(
			UnresolvedMethodDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_29_5_checknacs_blackBBB(Model mModel,
			TypeGraph tModel, ModelToTypeGraph model2pm) {
		return new Object[] { mModel, tModel, model2pm };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_29_6_perform_blackBBBB(Model mModel,
			TypeGraph tModel, ModelToTypeGraph model2pm, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mModel, tModel, model2pm, ruleResult };
	}

	public static final Object[] pattern_UnresolvedMethodDeclaration_29_6_perform_greenFFBFBFFBB(Model mModel,
			TypeGraph tModel, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TMethodSignature tMethodSignature = BasicFactory.eINSTANCE.createTMethodSignature();
		MDefinitionToTMember unresolved2Definiton = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TMethodDefinition tMethodDefinition = BasicFactory.eINSTANCE.createTMethodDefinition();
		TMethod tMethodName = BasicFactory.eINSTANCE.createTMethod();
		org.eclipse.modisco.java.UnresolvedMethodDeclaration mMethod = JavaFactory.eINSTANCE
				.createUnresolvedMethodDeclaration();
		Object _localVariable_0 = csp.getValue("tMethodName", "tName");
		Object _localVariable_1 = csp.getValue("mMethod", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(tMethodSignature);
		ruleResult.getCorrObjects().add(unresolved2Definiton);
		tMethodSignature.getDefinitions().add(tMethodDefinition);
		unresolved2Definiton.setTarget(tMethodDefinition);
		ruleResult.getTargetObjects().add(tMethodDefinition);
		tModel.getMethods().add(tMethodName);
		tMethodName.getSignatures().add(tMethodSignature);
		ruleResult.getTargetObjects().add(tMethodName);
		mModel.getUnresolvedItems().add(mMethod);
		unresolved2Definiton.setSource(mMethod);
		ruleResult.getSourceObjects().add(mMethod);
		String tMethodName_tName_prime = (String) _localVariable_0;
		String mMethod_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		tMethodName.setTName(tMethodName_tName_prime);
		mMethod.setName(mMethod_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tMethodSignature, unresolved2Definiton, mModel, tMethodDefinition, tModel, tMethodName,
				mMethod, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_UnresolvedMethodDeclaration_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UnresolvedMethodDeclarationImpl
