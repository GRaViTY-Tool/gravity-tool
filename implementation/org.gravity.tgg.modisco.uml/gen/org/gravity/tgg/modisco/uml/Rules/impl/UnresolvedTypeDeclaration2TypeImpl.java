/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.Modifier;
import org.eclipse.modisco.java.UnresolvedTypeDeclaration;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.JavaModel2UMLPackage;

import org.gravity.tgg.modisco.uml.Rules.RulesPackage;
import org.gravity.tgg.modisco.uml.Rules.UnresolvedTypeDeclaration2Type;

import org.gravity.tgg.modisco.uml.UmlFactory;

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
import org.gravity.tgg.modisco.uml.csp.constraints.*;
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
 * An implementation of the model object '<em><b>Unresolved Type Declaration2 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnresolvedTypeDeclaration2TypeImpl extends AbstractRuleImpl implements UnresolvedTypeDeclaration2Type {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedTypeDeclaration2TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUnresolvedTypeDeclaration2Type();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, UnresolvedTypeDeclaration mType, Model model) {

		Object[] result1_black = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_0_1_initialbindings_blackBBBB(this, match, mType, model);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mType] = " + mType + ", " + "[model] = " + model + ".");
		}

		Object[] result2_bindingAndBlack = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mType, model);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mType] = " + mType + ", " + "[model] = " + model + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_0_4_collectelementstobetranslated_blackBBB(match, mType,
							model);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mType] = " + mType + ", " + "[model] = " + model + ".");
			}
			UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_0_4_collectelementstobetranslated_greenBBBF(match, mType,
							model);
			//nothing EMoflonEdge model__mType____unresolvedItems = (EMoflonEdge) result4_green[3];

			Object[] result5_black = UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_0_5_collectcontextelements_blackBBB(match, mType, model);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mType] = " + mType + ", " + "[model] = " + model + ".");
			}
			UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_0_5_collectcontextelements_greenBB(match, model);

			// 
			UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_0_6_registerobjectstomatch_expressionBBBB(this, match,
							mType, model);
			return UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_0_7_expressionF();
		} else {
			return UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		UnresolvedTypeDeclaration mType = (UnresolvedTypeDeclaration) result1_bindingAndBlack[0];
		JavaModel2UMLPackage m2m = (JavaModel2UMLPackage) result1_bindingAndBlack[1];
		Model model = (Model) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Model externals = (org.eclipse.uml2.uml.Model) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_1_1_performtransformation_greenFBFBB(mType, externals, csp);
		org.eclipse.uml2.uml.Class uClass = (org.eclipse.uml2.uml.Class) result1_green[0];
		ASTNode2Element u2c = (ASTNode2Element) result1_green[2];

		Object[] result2_black = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_1_2_collecttranslatedelements_blackBBB(uClass, mType, u2c);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[uClass] = " + uClass + ", "
					+ "[mType] = " + mType + ", " + "[u2c] = " + u2c + ".");
		}
		Object[] result2_green = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_1_2_collecttranslatedelements_greenFBBB(uClass, mType, u2c);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, uClass, mType,
						u2c, m2m, model, externals);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[uClass] = " + uClass + ", " + "[mType] = " + mType + ", " + "[u2c] = " + u2c + ", "
					+ "[m2m] = " + m2m + ", " + "[model] = " + model + ", " + "[externals] = " + externals + ".");
		}
		UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, uClass,
						mType, u2c, model, externals);
		//nothing EMoflonEdge uClass__externals____package = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge externals__uClass____ownedType = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge u2c__mType____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge u2c__uClass____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge model__mType____unresolvedItems = (EMoflonEdge) result3_green[10];

		// 
		// 
		UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, uClass,
						mType, u2c, m2m, model, externals);
		return UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		UnresolvedTypeDeclaration mType = (UnresolvedTypeDeclaration) result2_binding[0];
		Model model = (Model) result2_binding[1];
		for (Object[] result2_black : UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_2_2_corematch_blackBFBFB(mType, model, match)) {
			JavaModel2UMLPackage m2m = (JavaModel2UMLPackage) result2_black[1];
			org.eclipse.uml2.uml.Model externals = (org.eclipse.uml2.uml.Model) result2_black[3];
			// ForEach 
			for (Object[] result3_black : UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_2_3_findcontext_blackBBBB(mType, m2m, model, externals)) {
				Object[] result3_green = UnresolvedTypeDeclaration2TypeImpl
						.pattern_UnresolvedTypeDeclaration2Type_2_3_findcontext_greenBBBBFFFF(mType, m2m, model,
								externals);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge model__mType____unresolvedItems = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge m2m__model____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge m2m__externals____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = UnresolvedTypeDeclaration2TypeImpl
						.pattern_UnresolvedTypeDeclaration2Type_2_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, mType, m2m, model, externals);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mType] = " + mType + ", "
							+ "[m2m] = " + m2m + ", " + "[model] = " + model + ", " + "[externals] = " + externals
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (UnresolvedTypeDeclaration2TypeImpl
						.pattern_UnresolvedTypeDeclaration2Type_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = UnresolvedTypeDeclaration2TypeImpl
							.pattern_UnresolvedTypeDeclaration2Type_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					UnresolvedTypeDeclaration2TypeImpl
							.pattern_UnresolvedTypeDeclaration2Type_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, UnresolvedTypeDeclaration mType, Model model) {
		match.registerObject("mType", mType);
		match.registerObject("model", model);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, UnresolvedTypeDeclaration mType, Model model) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, UnresolvedTypeDeclaration mType,
			JavaModel2UMLPackage m2m, Model model, org.eclipse.uml2.uml.Model externals) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");

		// Create unbound variables
		Variable var_uClass_name = CSPFactoryHelper.eINSTANCE.createVariable("uClass.name", csp);
		var_uClass_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_name, var_uClass_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("m2m", m2m);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("externals", externals);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject uClass, EObject mType, EObject u2c,
			EObject m2m, EObject model, EObject externals) {
		ruleresult.registerObject("uClass", uClass);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("u2c", u2c);
		ruleresult.registerObject("m2m", m2m);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("externals", externals);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mType").eClass())
				.equals("java.UnresolvedTypeDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Class uClass,
			org.eclipse.uml2.uml.Model externals) {

		Object[] result1_black = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_10_1_initialbindings_blackBBBB(this, match, uClass, externals);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[uClass] = " + uClass + ", " + "[externals] = " + externals + ".");
		}

		Object[] result2_bindingAndBlack = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, uClass,
						externals);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[uClass] = " + uClass + ", " + "[externals] = " + externals + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_10_4_collectelementstobetranslated_blackBBB(match, uClass,
							externals);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[uClass] = " + uClass + ", " + "[externals] = " + externals + ".");
			}
			UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_10_4_collectelementstobetranslated_greenBBBFF(match, uClass,
							externals);
			//nothing EMoflonEdge uClass__externals____package = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge externals__uClass____ownedType = (EMoflonEdge) result4_green[4];

			Object[] result5_black = UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_10_5_collectcontextelements_blackBBB(match, uClass,
							externals);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[uClass] = " + uClass + ", " + "[externals] = " + externals + ".");
			}
			UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_10_5_collectcontextelements_greenBB(match, externals);

			// 
			UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_10_6_registerobjectstomatch_expressionBBBB(this, match,
							uClass, externals);
			return UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_10_7_expressionF();
		} else {
			return UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Class uClass = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[0];
		JavaModel2UMLPackage m2m = (JavaModel2UMLPackage) result1_bindingAndBlack[1];
		Model model = (Model) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Model externals = (org.eclipse.uml2.uml.Model) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_11_1_performtransformation_greenBFFBB(uClass, model, csp);
		UnresolvedTypeDeclaration mType = (UnresolvedTypeDeclaration) result1_green[1];
		ASTNode2Element u2c = (ASTNode2Element) result1_green[2];

		Object[] result2_black = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_11_2_collecttranslatedelements_blackBBB(uClass, mType, u2c);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[uClass] = " + uClass + ", "
					+ "[mType] = " + mType + ", " + "[u2c] = " + u2c + ".");
		}
		Object[] result2_green = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_11_2_collecttranslatedelements_greenFBBB(uClass, mType, u2c);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, uClass, mType,
						u2c, m2m, model, externals);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[uClass] = " + uClass + ", " + "[mType] = " + mType + ", " + "[u2c] = " + u2c + ", "
					+ "[m2m] = " + m2m + ", " + "[model] = " + model + ", " + "[externals] = " + externals + ".");
		}
		UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, uClass,
						mType, u2c, model, externals);
		//nothing EMoflonEdge uClass__externals____package = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge externals__uClass____ownedType = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge u2c__mType____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge u2c__uClass____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge model__mType____unresolvedItems = (EMoflonEdge) result3_green[10];

		// 
		// 
		UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
						uClass, mType, u2c, m2m, model, externals);
		return UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Class uClass = (org.eclipse.uml2.uml.Class) result2_binding[0];
		org.eclipse.uml2.uml.Model externals = (org.eclipse.uml2.uml.Model) result2_binding[1];
		for (Object[] result2_black : UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_12_2_corematch_blackBFFBB(uClass, externals, match)) {
			JavaModel2UMLPackage m2m = (JavaModel2UMLPackage) result2_black[1];
			Model model = (Model) result2_black[2];
			// ForEach 
			for (Object[] result3_black : UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_12_3_findcontext_blackBBBB(uClass, m2m, model, externals)) {
				Object[] result3_green = UnresolvedTypeDeclaration2TypeImpl
						.pattern_UnresolvedTypeDeclaration2Type_12_3_findcontext_greenBBBBFFFFF(uClass, m2m, model,
								externals);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge uClass__externals____package = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge externals__uClass____ownedType = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge m2m__model____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge m2m__externals____target = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = UnresolvedTypeDeclaration2TypeImpl
						.pattern_UnresolvedTypeDeclaration2Type_12_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, uClass, m2m, model, externals);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[uClass] = " + uClass + ", "
							+ "[m2m] = " + m2m + ", " + "[model] = " + model + ", " + "[externals] = " + externals
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (UnresolvedTypeDeclaration2TypeImpl
						.pattern_UnresolvedTypeDeclaration2Type_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = UnresolvedTypeDeclaration2TypeImpl
							.pattern_UnresolvedTypeDeclaration2Type_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					UnresolvedTypeDeclaration2TypeImpl
							.pattern_UnresolvedTypeDeclaration2Type_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Class uClass,
			org.eclipse.uml2.uml.Model externals) {
		match.registerObject("uClass", uClass);
		match.registerObject("externals", externals);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Class uClass,
			org.eclipse.uml2.uml.Model externals) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class uClass,
			JavaModel2UMLPackage m2m, Model model, org.eclipse.uml2.uml.Model externals) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_uClass_name = CSPFactoryHelper.eINSTANCE.createVariable("uClass.name", true, csp);
		var_uClass_name.setValue(uClass.getName());
		var_uClass_name.setType("String");

		// Create unbound variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", csp);
		var_mType_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_name, var_uClass_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("uClass", uClass);
		isApplicableMatch.registerObject("m2m", m2m);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("externals", externals);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject uClass, EObject mType, EObject u2c,
			EObject m2m, EObject model, EObject externals) {
		ruleresult.registerObject("uClass", uClass);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("u2c", u2c);
		ruleresult.registerObject("m2m", m2m);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("externals", externals);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("uClass").eClass()).equals("uml.Class.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_5(EMoflonEdge _edge_package) {

		Object[] result1_bindingAndBlack = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_20_2_testcorematchandDECs_blackFFB(_edge_package)) {
			org.eclipse.uml2.uml.Class uClass = (org.eclipse.uml2.uml.Class) result2_black[0];
			org.eclipse.uml2.uml.Model externals = (org.eclipse.uml2.uml.Model) result2_black[1];
			Object[] result2_green = UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, uClass, externals)) {
				// 
				if (UnresolvedTypeDeclaration2TypeImpl
						.pattern_UnresolvedTypeDeclaration2Type_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = UnresolvedTypeDeclaration2TypeImpl
							.pattern_UnresolvedTypeDeclaration2Type_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					UnresolvedTypeDeclaration2TypeImpl
							.pattern_UnresolvedTypeDeclaration2Type_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_7(EMoflonEdge _edge_unresolvedItems) {

		Object[] result1_bindingAndBlack = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_21_2_testcorematchandDECs_blackFFB(_edge_unresolvedItems)) {
			UnresolvedTypeDeclaration mType = (UnresolvedTypeDeclaration) result2_black[0];
			Model model = (Model) result2_black[1];
			Object[] result2_green = UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, mType, model)) {
				// 
				if (UnresolvedTypeDeclaration2TypeImpl
						.pattern_UnresolvedTypeDeclaration2Type_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = UnresolvedTypeDeclaration2TypeImpl
							.pattern_UnresolvedTypeDeclaration2Type_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					UnresolvedTypeDeclaration2TypeImpl
							.pattern_UnresolvedTypeDeclaration2Type_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("UnresolvedTypeDeclaration2Type");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("externals", "name", "externals", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_uClass_name = CSPFactoryHelper.eINSTANCE.createVariable("uClass", true, csp);
		var_uClass_name.setValue(__helper.getValue("uClass", "name"));
		var_uClass_name.setType("String");

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("UnresolvedTypeDeclaration2Type");
		eq0.solve(var_mType_name, var_uClass_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_uClass_name.setBound(false);
			eq0.solve(var_mType_name, var_uClass_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("uClass", "name", var_uClass_name.getValue());
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
		ruleResult.setRule("UnresolvedTypeDeclaration2Type");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("externals", "name", "externals", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_uClass_name = CSPFactoryHelper.eINSTANCE.createVariable("uClass", true, csp);
		var_uClass_name.setValue(__helper.getValue("uClass", "name"));
		var_uClass_name.setType("String");

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("UnresolvedTypeDeclaration2Type");
		eq0.solve(var_mType_name, var_uClass_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mType_name.setBound(false);
			eq0.solve(var_mType_name, var_uClass_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mType", "name", var_mType_name.getValue());
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

		Object[] result1_black = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.uml2.uml.Class uClass = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[0];
		UnresolvedTypeDeclaration mType = (UnresolvedTypeDeclaration) result2_bindingAndBlack[1];
		Model model = (Model) result2_bindingAndBlack[2];
		org.eclipse.uml2.uml.Model externals = (org.eclipse.uml2.uml.Model) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, uClass, mType,
						model, externals, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[uClass] = " + uClass + ", " + "[mType] = " + mType + ", " + "[model] = " + model + ", "
					+ "[externals] = " + externals + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_24_5_matchcorrcontext_blackFBBBB(model, externals,
							sourceMatch, targetMatch)) {
				JavaModel2UMLPackage m2m = (JavaModel2UMLPackage) result5_black[0];
				Object[] result5_green = UnresolvedTypeDeclaration2TypeImpl
						.pattern_UnresolvedTypeDeclaration2Type_24_5_matchcorrcontext_greenBBBF(m2m, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = UnresolvedTypeDeclaration2TypeImpl
						.pattern_UnresolvedTypeDeclaration2Type_24_6_createcorrespondence_blackBBBBB(uClass, mType,
								model, externals, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[uClass] = " + uClass
							+ ", " + "[mType] = " + mType + ", " + "[model] = " + model + ", " + "[externals] = "
							+ externals + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				UnresolvedTypeDeclaration2TypeImpl
						.pattern_UnresolvedTypeDeclaration2Type_24_6_createcorrespondence_greenBBFB(uClass, mType,
								ccMatch);
				//nothing ASTNode2Element u2c = (ASTNode2Element) result6_green[2];

				Object[] result7_black = UnresolvedTypeDeclaration2TypeImpl
						.pattern_UnresolvedTypeDeclaration2Type_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				UnresolvedTypeDeclaration2TypeImpl
						.pattern_UnresolvedTypeDeclaration2Type_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Class uClass, UnresolvedTypeDeclaration mType, Model model,
			org.eclipse.uml2.uml.Model externals, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");
		Variable var_uClass_name = CSPFactoryHelper.eINSTANCE.createVariable("uClass.name", true, csp);
		var_uClass_name.setValue(uClass.getName());
		var_uClass_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_name, var_uClass_name);
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
	public boolean checkDEC_FWD(UnresolvedTypeDeclaration mType, Model model) {// 
		Object[] result1_black = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_27_1_matchtggpattern_blackBB(mType, model);
		if (result1_black != null) {
			return UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_27_2_expressionF();
		} else {
			return UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Class uClass, org.eclipse.uml2.uml.Model externals) {// 
		Object[] result1_black = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_28_1_matchtggpattern_blackBB(uClass, externals);
		if (result1_black != null) {
			return UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_28_2_expressionF();
		} else {
			return UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			JavaModel2UMLPackage m2mParameter) {

		Object[] result1_black = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : UnresolvedTypeDeclaration2TypeImpl
				.pattern_UnresolvedTypeDeclaration2Type_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList m2mList = (RuleEntryList) result2_black[0];
			JavaModel2UMLPackage m2m = (JavaModel2UMLPackage) result2_black[1];
			Model model = (Model) result2_black[2];
			org.eclipse.uml2.uml.Model externals = (org.eclipse.uml2.uml.Model) result2_black[3];

			Object[] result3_bindingAndBlack = UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_29_3_solveCSP_bindingAndBlackFBBBBBB(this,
							isApplicableMatch, m2m, model, externals, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[m2m] = " + m2m + ", " + "[model] = "
						+ model + ", " + "[externals] = " + externals + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (UnresolvedTypeDeclaration2TypeImpl
					.pattern_UnresolvedTypeDeclaration2Type_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = UnresolvedTypeDeclaration2TypeImpl
						.pattern_UnresolvedTypeDeclaration2Type_29_5_checknacs_blackBBB(m2m, model, externals);
				if (result5_black != null) {

					Object[] result6_black = UnresolvedTypeDeclaration2TypeImpl
							.pattern_UnresolvedTypeDeclaration2Type_29_6_perform_blackBBBB(m2m, model, externals,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m2m] = " + m2m + ", "
								+ "[model] = " + model + ", " + "[externals] = " + externals + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_29_6_perform_greenFFFBBBB(
							model, externals, ruleResult, csp);
					//nothing org.eclipse.uml2.uml.Class uClass = (org.eclipse.uml2.uml.Class) result6_green[0];
					//nothing UnresolvedTypeDeclaration mType = (UnresolvedTypeDeclaration) result6_green[1];
					//nothing ASTNode2Element u2c = (ASTNode2Element) result6_green[2];

				} else {
				}

			} else {
			}

		}
		return UnresolvedTypeDeclaration2TypeImpl.pattern_UnresolvedTypeDeclaration2Type_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage m2m, Model model,
			org.eclipse.uml2.uml.Model externals, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", csp);
		var_mType_name.setType("String");
		Variable var_uClass_name = CSPFactoryHelper.eINSTANCE.createVariable("uClass.name", csp);
		var_uClass_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_name, var_uClass_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("m2m", m2m);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("externals", externals);
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
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___IS_APPROPRIATE_FWD__MATCH_UNRESOLVEDTYPEDECLARATION_MODEL:
			return isAppropriate_FWD((Match) arguments.get(0), (UnresolvedTypeDeclaration) arguments.get(1),
					(Model) arguments.get(2));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_UNRESOLVEDTYPEDECLARATION_MODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (UnresolvedTypeDeclaration) arguments.get(1),
					(Model) arguments.get(2));
			return null;
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_UNRESOLVEDTYPEDECLARATION_MODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (UnresolvedTypeDeclaration) arguments.get(1),
					(Model) arguments.get(2));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_UNRESOLVEDTYPEDECLARATION_JAVAMODEL2UMLPACKAGE_MODEL_MODEL:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(UnresolvedTypeDeclaration) arguments.get(1), (JavaModel2UMLPackage) arguments.get(2),
					(Model) arguments.get(3), (org.eclipse.uml2.uml.Model) arguments.get(4));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___IS_APPROPRIATE_BWD__MATCH_CLASS_MODEL:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Model) arguments.get(2));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CLASS_MODEL:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Model) arguments.get(2));
			return null;
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CLASS_MODEL:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Model) arguments.get(2));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_JAVAMODEL2UMLPACKAGE_MODEL_MODEL:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (JavaModel2UMLPackage) arguments.get(2),
					(Model) arguments.get(3), (org.eclipse.uml2.uml.Model) arguments.get(4));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_5((EMoflonEdge) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_7((EMoflonEdge) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__CLASS_UNRESOLVEDTYPEDECLARATION_MODEL_MODEL_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.uml2.uml.Class) arguments.get(0),
					(UnresolvedTypeDeclaration) arguments.get(1), (Model) arguments.get(2),
					(org.eclipse.uml2.uml.Model) arguments.get(3), (Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___CHECK_DEC_FWD__UNRESOLVEDTYPEDECLARATION_MODEL:
			return checkDEC_FWD((UnresolvedTypeDeclaration) arguments.get(0), (Model) arguments.get(1));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___CHECK_DEC_BWD__CLASS_MODEL:
			return checkDEC_BWD((org.eclipse.uml2.uml.Class) arguments.get(0),
					(org.eclipse.uml2.uml.Model) arguments.get(1));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_JAVAMODEL2UMLPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (JavaModel2UMLPackage) arguments.get(1));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAMODEL2UMLPACKAGE_MODEL_MODEL_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(JavaModel2UMLPackage) arguments.get(1), (Model) arguments.get(2),
					(org.eclipse.uml2.uml.Model) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION2_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_0_1_initialbindings_blackBBBB(
			UnresolvedTypeDeclaration2Type _this, Match match, UnresolvedTypeDeclaration mType, Model model) {
		return new Object[] { _this, match, mType, model };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_0_2_SolveCSP_bindingFBBBB(
			UnresolvedTypeDeclaration2Type _this, Match match, UnresolvedTypeDeclaration mType, Model model) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mType, model);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mType, model };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_0_2_SolveCSP_bindingAndBlackFBBBB(
			UnresolvedTypeDeclaration2Type _this, Match match, UnresolvedTypeDeclaration mType, Model model) {
		Object[] result_pattern_UnresolvedTypeDeclaration2Type_0_2_SolveCSP_binding = pattern_UnresolvedTypeDeclaration2Type_0_2_SolveCSP_bindingFBBBB(
				_this, match, mType, model);
		if (result_pattern_UnresolvedTypeDeclaration2Type_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration2Type_0_2_SolveCSP_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration2Type_0_2_SolveCSP_black = pattern_UnresolvedTypeDeclaration2Type_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedTypeDeclaration2Type_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mType, model };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_0_3_CheckCSP_expressionFBB(
			UnresolvedTypeDeclaration2Type _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_0_4_collectelementstobetranslated_blackBBB(
			Match match, UnresolvedTypeDeclaration mType, Model model) {
		return new Object[] { match, mType, model };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_0_4_collectelementstobetranslated_greenBBBF(
			Match match, UnresolvedTypeDeclaration mType, Model model) {
		EMoflonEdge model__mType____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mType);
		String model__mType____unresolvedItems_name_prime = "unresolvedItems";
		model__mType____unresolvedItems.setSrc(model);
		model__mType____unresolvedItems.setTrg(mType);
		match.getToBeTranslatedEdges().add(model__mType____unresolvedItems);
		model__mType____unresolvedItems.setName(model__mType____unresolvedItems_name_prime);
		return new Object[] { match, mType, model, model__mType____unresolvedItems };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_0_5_collectcontextelements_blackBBB(Match match,
			UnresolvedTypeDeclaration mType, Model model) {
		return new Object[] { match, mType, model };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_0_5_collectcontextelements_greenBB(Match match,
			Model model) {
		match.getContextNodes().add(model);
		return new Object[] { match, model };
	}

	public static final void pattern_UnresolvedTypeDeclaration2Type_0_6_registerobjectstomatch_expressionBBBB(
			UnresolvedTypeDeclaration2Type _this, Match match, UnresolvedTypeDeclaration mType, Model model) {
		_this.registerObjectsToMatch_FWD(match, mType, model);

	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mType");
		EObject _localVariable_1 = isApplicableMatch.getObject("m2m");
		EObject _localVariable_2 = isApplicableMatch.getObject("model");
		EObject _localVariable_3 = isApplicableMatch.getObject("externals");
		EObject tmpMType = _localVariable_0;
		EObject tmpM2m = _localVariable_1;
		EObject tmpModel = _localVariable_2;
		EObject tmpExternals = _localVariable_3;
		if (tmpMType instanceof UnresolvedTypeDeclaration) {
			UnresolvedTypeDeclaration mType = (UnresolvedTypeDeclaration) tmpMType;
			if (tmpM2m instanceof JavaModel2UMLPackage) {
				JavaModel2UMLPackage m2m = (JavaModel2UMLPackage) tmpM2m;
				if (tmpModel instanceof Model) {
					Model model = (Model) tmpModel;
					if (tmpExternals instanceof org.eclipse.uml2.uml.Model) {
						org.eclipse.uml2.uml.Model externals = (org.eclipse.uml2.uml.Model) tmpExternals;
						return new Object[] { mType, m2m, model, externals, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_1_1_performtransformation_blackBBBBFBB(
			UnresolvedTypeDeclaration mType, JavaModel2UMLPackage m2m, Model model,
			org.eclipse.uml2.uml.Model externals, UnresolvedTypeDeclaration2Type _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mType, m2m, model, externals, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_1_1_performtransformation_bindingAndBlackFFFFFBB(
			UnresolvedTypeDeclaration2Type _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UnresolvedTypeDeclaration2Type_1_1_performtransformation_binding = pattern_UnresolvedTypeDeclaration2Type_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_UnresolvedTypeDeclaration2Type_1_1_performtransformation_binding != null) {
			UnresolvedTypeDeclaration mType = (UnresolvedTypeDeclaration) result_pattern_UnresolvedTypeDeclaration2Type_1_1_performtransformation_binding[0];
			JavaModel2UMLPackage m2m = (JavaModel2UMLPackage) result_pattern_UnresolvedTypeDeclaration2Type_1_1_performtransformation_binding[1];
			Model model = (Model) result_pattern_UnresolvedTypeDeclaration2Type_1_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Model externals = (org.eclipse.uml2.uml.Model) result_pattern_UnresolvedTypeDeclaration2Type_1_1_performtransformation_binding[3];

			Object[] result_pattern_UnresolvedTypeDeclaration2Type_1_1_performtransformation_black = pattern_UnresolvedTypeDeclaration2Type_1_1_performtransformation_blackBBBBFBB(
					mType, m2m, model, externals, _this, isApplicableMatch);
			if (result_pattern_UnresolvedTypeDeclaration2Type_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration2Type_1_1_performtransformation_black[4];

				return new Object[] { mType, m2m, model, externals, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_1_1_performtransformation_greenFBFBB(
			UnresolvedTypeDeclaration mType, org.eclipse.uml2.uml.Model externals, CSP csp) {
		org.eclipse.uml2.uml.Class uClass = UMLFactory.eINSTANCE.createClass();
		ASTNode2Element u2c = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("uClass", "name");
		uClass.setPackage(externals);
		u2c.setSource(mType);
		u2c.setTarget(uClass);
		String uClass_name_prime = (String) _localVariable_0;
		uClass.setName(uClass_name_prime);
		return new Object[] { uClass, mType, u2c, externals, csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_1_2_collecttranslatedelements_blackBBB(
			org.eclipse.uml2.uml.Class uClass, UnresolvedTypeDeclaration mType, ASTNode2Element u2c) {
		return new Object[] { uClass, mType, u2c };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_1_2_collecttranslatedelements_greenFBBB(
			org.eclipse.uml2.uml.Class uClass, UnresolvedTypeDeclaration mType, ASTNode2Element u2c) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(uClass);
		ruleresult.getTranslatedElements().add(mType);
		ruleresult.getCreatedLinkElements().add(u2c);
		return new Object[] { ruleresult, uClass, mType, u2c };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject uClass, EObject mType, EObject u2c, EObject m2m, EObject model,
			EObject externals) {
		if (!mType.equals(uClass)) {
			if (!mType.equals(u2c)) {
				if (!mType.equals(model)) {
					if (!u2c.equals(uClass)) {
						if (!m2m.equals(uClass)) {
							if (!m2m.equals(mType)) {
								if (!m2m.equals(u2c)) {
									if (!m2m.equals(model)) {
										if (!model.equals(uClass)) {
											if (!model.equals(u2c)) {
												if (!externals.equals(uClass)) {
													if (!externals.equals(mType)) {
														if (!externals.equals(u2c)) {
															if (!externals.equals(m2m)) {
																if (!externals.equals(model)) {
																	return new Object[] { ruleresult, uClass, mType,
																			u2c, m2m, model, externals };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject uClass, EObject mType, EObject u2c, EObject model,
			EObject externals) {
		EMoflonEdge uClass__externals____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge externals__uClass____ownedType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge u2c__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge u2c__uClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__mType____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UnresolvedTypeDeclaration2Type";
		String uClass__externals____package_name_prime = "package";
		String externals__uClass____ownedType_name_prime = "ownedType";
		String u2c__mType____source_name_prime = "source";
		String u2c__uClass____target_name_prime = "target";
		String model__mType____unresolvedItems_name_prime = "unresolvedItems";
		uClass__externals____package.setSrc(uClass);
		uClass__externals____package.setTrg(externals);
		ruleresult.getCreatedEdges().add(uClass__externals____package);
		externals__uClass____ownedType.setSrc(externals);
		externals__uClass____ownedType.setTrg(uClass);
		ruleresult.getCreatedEdges().add(externals__uClass____ownedType);
		u2c__mType____source.setSrc(u2c);
		u2c__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(u2c__mType____source);
		u2c__uClass____target.setSrc(u2c);
		u2c__uClass____target.setTrg(uClass);
		ruleresult.getCreatedEdges().add(u2c__uClass____target);
		model__mType____unresolvedItems.setSrc(model);
		model__mType____unresolvedItems.setTrg(mType);
		ruleresult.getTranslatedEdges().add(model__mType____unresolvedItems);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		uClass__externals____package.setName(uClass__externals____package_name_prime);
		externals__uClass____ownedType.setName(externals__uClass____ownedType_name_prime);
		u2c__mType____source.setName(u2c__mType____source_name_prime);
		u2c__uClass____target.setName(u2c__uClass____target_name_prime);
		model__mType____unresolvedItems.setName(model__mType____unresolvedItems_name_prime);
		return new Object[] { ruleresult, uClass, mType, u2c, model, externals, uClass__externals____package,
				externals__uClass____ownedType, u2c__mType____source, u2c__uClass____target,
				model__mType____unresolvedItems };
	}

	public static final void pattern_UnresolvedTypeDeclaration2Type_1_5_registerobjects_expressionBBBBBBBB(
			UnresolvedTypeDeclaration2Type _this, PerformRuleResult ruleresult, EObject uClass, EObject mType,
			EObject u2c, EObject m2m, EObject model, EObject externals) {
		_this.registerObjects_FWD(ruleresult, uClass, mType, u2c, m2m, model, externals);

	}

	public static final PerformRuleResult pattern_UnresolvedTypeDeclaration2Type_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_2_1_preparereturnvalue_bindingFB(
			UnresolvedTypeDeclaration2Type _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_2_1_preparereturnvalue_blackFBB(EClass eClass,
			UnresolvedTypeDeclaration2Type _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_2_1_preparereturnvalue_bindingAndBlackFFB(
			UnresolvedTypeDeclaration2Type _this) {
		Object[] result_pattern_UnresolvedTypeDeclaration2Type_2_1_preparereturnvalue_binding = pattern_UnresolvedTypeDeclaration2Type_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_UnresolvedTypeDeclaration2Type_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_UnresolvedTypeDeclaration2Type_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration2Type_2_1_preparereturnvalue_black = pattern_UnresolvedTypeDeclaration2Type_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_UnresolvedTypeDeclaration2Type_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UnresolvedTypeDeclaration2Type_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "UnresolvedTypeDeclaration2Type";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mType");
		EObject _localVariable_1 = match.getObject("model");
		EObject tmpMType = _localVariable_0;
		EObject tmpModel = _localVariable_1;
		if (tmpMType instanceof UnresolvedTypeDeclaration) {
			UnresolvedTypeDeclaration mType = (UnresolvedTypeDeclaration) tmpMType;
			if (tmpModel instanceof Model) {
				Model model = (Model) tmpModel;
				return new Object[] { mType, model, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration2Type_2_2_corematch_blackBFBFB(
			UnresolvedTypeDeclaration mType, Model model, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (JavaModel2UMLPackage m2m : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(model,
				JavaModel2UMLPackage.class, "source")) {
			org.eclipse.uml2.uml.Package tmpExternals = m2m.getTarget();
			if (tmpExternals instanceof org.eclipse.uml2.uml.Model) {
				org.eclipse.uml2.uml.Model externals = (org.eclipse.uml2.uml.Model) tmpExternals;
				String externals_name = externals.getName();
				if (externals_name.equals("externals")) {
					_result.add(new Object[] { mType, m2m, model, externals, match });
				}

			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration2Type_2_3_findcontext_blackBBBB(
			UnresolvedTypeDeclaration mType, JavaModel2UMLPackage m2m, Model model,
			org.eclipse.uml2.uml.Model externals) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (model.getUnresolvedItems().contains(mType)) {
			if (model.equals(m2m.getSource())) {
				if (externals.equals(m2m.getTarget())) {
					String externals_name = externals.getName();
					if (externals_name.equals("externals")) {
						_result.add(new Object[] { mType, m2m, model, externals });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_2_3_findcontext_greenBBBBFFFF(
			UnresolvedTypeDeclaration mType, JavaModel2UMLPackage m2m, Model model,
			org.eclipse.uml2.uml.Model externals) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge model__mType____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2m__model____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2m__externals____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String model__mType____unresolvedItems_name_prime = "unresolvedItems";
		String m2m__model____source_name_prime = "source";
		String m2m__externals____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(m2m);
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(externals);
		model__mType____unresolvedItems.setSrc(model);
		model__mType____unresolvedItems.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(model__mType____unresolvedItems);
		m2m__model____source.setSrc(m2m);
		m2m__model____source.setTrg(model);
		isApplicableMatch.getAllContextElements().add(m2m__model____source);
		m2m__externals____target.setSrc(m2m);
		m2m__externals____target.setTrg(externals);
		isApplicableMatch.getAllContextElements().add(m2m__externals____target);
		model__mType____unresolvedItems.setName(model__mType____unresolvedItems_name_prime);
		m2m__model____source.setName(m2m__model____source_name_prime);
		m2m__externals____target.setName(m2m__externals____target_name_prime);
		return new Object[] { mType, m2m, model, externals, isApplicableMatch, model__mType____unresolvedItems,
				m2m__model____source, m2m__externals____target };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_2_4_solveCSP_bindingFBBBBBB(
			UnresolvedTypeDeclaration2Type _this, IsApplicableMatch isApplicableMatch, UnresolvedTypeDeclaration mType,
			JavaModel2UMLPackage m2m, Model model, org.eclipse.uml2.uml.Model externals) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mType, m2m, model, externals);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mType, m2m, model, externals };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_2_4_solveCSP_bindingAndBlackFBBBBBB(
			UnresolvedTypeDeclaration2Type _this, IsApplicableMatch isApplicableMatch, UnresolvedTypeDeclaration mType,
			JavaModel2UMLPackage m2m, Model model, org.eclipse.uml2.uml.Model externals) {
		Object[] result_pattern_UnresolvedTypeDeclaration2Type_2_4_solveCSP_binding = pattern_UnresolvedTypeDeclaration2Type_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mType, m2m, model, externals);
		if (result_pattern_UnresolvedTypeDeclaration2Type_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration2Type_2_4_solveCSP_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration2Type_2_4_solveCSP_black = pattern_UnresolvedTypeDeclaration2Type_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedTypeDeclaration2Type_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mType, m2m, model, externals };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_2_5_checkCSP_expressionFBB(
			UnresolvedTypeDeclaration2Type _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UnresolvedTypeDeclaration2Type";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UnresolvedTypeDeclaration2Type_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_10_1_initialbindings_blackBBBB(
			UnresolvedTypeDeclaration2Type _this, Match match, org.eclipse.uml2.uml.Class uClass,
			org.eclipse.uml2.uml.Model externals) {
		return new Object[] { _this, match, uClass, externals };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_10_2_SolveCSP_bindingFBBBB(
			UnresolvedTypeDeclaration2Type _this, Match match, org.eclipse.uml2.uml.Class uClass,
			org.eclipse.uml2.uml.Model externals) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, uClass, externals);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, uClass, externals };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_10_2_SolveCSP_bindingAndBlackFBBBB(
			UnresolvedTypeDeclaration2Type _this, Match match, org.eclipse.uml2.uml.Class uClass,
			org.eclipse.uml2.uml.Model externals) {
		Object[] result_pattern_UnresolvedTypeDeclaration2Type_10_2_SolveCSP_binding = pattern_UnresolvedTypeDeclaration2Type_10_2_SolveCSP_bindingFBBBB(
				_this, match, uClass, externals);
		if (result_pattern_UnresolvedTypeDeclaration2Type_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration2Type_10_2_SolveCSP_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration2Type_10_2_SolveCSP_black = pattern_UnresolvedTypeDeclaration2Type_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedTypeDeclaration2Type_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, uClass, externals };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_10_3_CheckCSP_expressionFBB(
			UnresolvedTypeDeclaration2Type _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_10_4_collectelementstobetranslated_blackBBB(
			Match match, org.eclipse.uml2.uml.Class uClass, org.eclipse.uml2.uml.Model externals) {
		return new Object[] { match, uClass, externals };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, org.eclipse.uml2.uml.Class uClass, org.eclipse.uml2.uml.Model externals) {
		EMoflonEdge uClass__externals____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge externals__uClass____ownedType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(uClass);
		String uClass__externals____package_name_prime = "package";
		String externals__uClass____ownedType_name_prime = "ownedType";
		uClass__externals____package.setSrc(uClass);
		uClass__externals____package.setTrg(externals);
		match.getToBeTranslatedEdges().add(uClass__externals____package);
		externals__uClass____ownedType.setSrc(externals);
		externals__uClass____ownedType.setTrg(uClass);
		match.getToBeTranslatedEdges().add(externals__uClass____ownedType);
		uClass__externals____package.setName(uClass__externals____package_name_prime);
		externals__uClass____ownedType.setName(externals__uClass____ownedType_name_prime);
		return new Object[] { match, uClass, externals, uClass__externals____package, externals__uClass____ownedType };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_10_5_collectcontextelements_blackBBB(
			Match match, org.eclipse.uml2.uml.Class uClass, org.eclipse.uml2.uml.Model externals) {
		return new Object[] { match, uClass, externals };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_10_5_collectcontextelements_greenBB(Match match,
			org.eclipse.uml2.uml.Model externals) {
		match.getContextNodes().add(externals);
		return new Object[] { match, externals };
	}

	public static final void pattern_UnresolvedTypeDeclaration2Type_10_6_registerobjectstomatch_expressionBBBB(
			UnresolvedTypeDeclaration2Type _this, Match match, org.eclipse.uml2.uml.Class uClass,
			org.eclipse.uml2.uml.Model externals) {
		_this.registerObjectsToMatch_BWD(match, uClass, externals);

	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("uClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("m2m");
		EObject _localVariable_2 = isApplicableMatch.getObject("model");
		EObject _localVariable_3 = isApplicableMatch.getObject("externals");
		EObject tmpUClass = _localVariable_0;
		EObject tmpM2m = _localVariable_1;
		EObject tmpModel = _localVariable_2;
		EObject tmpExternals = _localVariable_3;
		if (tmpUClass instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uClass = (org.eclipse.uml2.uml.Class) tmpUClass;
			if (tmpM2m instanceof JavaModel2UMLPackage) {
				JavaModel2UMLPackage m2m = (JavaModel2UMLPackage) tmpM2m;
				if (tmpModel instanceof Model) {
					Model model = (Model) tmpModel;
					if (tmpExternals instanceof org.eclipse.uml2.uml.Model) {
						org.eclipse.uml2.uml.Model externals = (org.eclipse.uml2.uml.Model) tmpExternals;
						return new Object[] { uClass, m2m, model, externals, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_11_1_performtransformation_blackBBBBFBB(
			org.eclipse.uml2.uml.Class uClass, JavaModel2UMLPackage m2m, Model model,
			org.eclipse.uml2.uml.Model externals, UnresolvedTypeDeclaration2Type _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { uClass, m2m, model, externals, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_11_1_performtransformation_bindingAndBlackFFFFFBB(
			UnresolvedTypeDeclaration2Type _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UnresolvedTypeDeclaration2Type_11_1_performtransformation_binding = pattern_UnresolvedTypeDeclaration2Type_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_UnresolvedTypeDeclaration2Type_11_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Class uClass = (org.eclipse.uml2.uml.Class) result_pattern_UnresolvedTypeDeclaration2Type_11_1_performtransformation_binding[0];
			JavaModel2UMLPackage m2m = (JavaModel2UMLPackage) result_pattern_UnresolvedTypeDeclaration2Type_11_1_performtransformation_binding[1];
			Model model = (Model) result_pattern_UnresolvedTypeDeclaration2Type_11_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Model externals = (org.eclipse.uml2.uml.Model) result_pattern_UnresolvedTypeDeclaration2Type_11_1_performtransformation_binding[3];

			Object[] result_pattern_UnresolvedTypeDeclaration2Type_11_1_performtransformation_black = pattern_UnresolvedTypeDeclaration2Type_11_1_performtransformation_blackBBBBFBB(
					uClass, m2m, model, externals, _this, isApplicableMatch);
			if (result_pattern_UnresolvedTypeDeclaration2Type_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration2Type_11_1_performtransformation_black[4];

				return new Object[] { uClass, m2m, model, externals, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_11_1_performtransformation_greenBFFBB(
			org.eclipse.uml2.uml.Class uClass, Model model, CSP csp) {
		UnresolvedTypeDeclaration mType = JavaFactory.eINSTANCE.createUnresolvedTypeDeclaration();
		ASTNode2Element u2c = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("mType", "name");
		model.getUnresolvedItems().add(mType);
		u2c.setSource(mType);
		u2c.setTarget(uClass);
		String mType_name_prime = (String) _localVariable_0;
		mType.setName(mType_name_prime);
		return new Object[] { uClass, mType, u2c, model, csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_11_2_collecttranslatedelements_blackBBB(
			org.eclipse.uml2.uml.Class uClass, UnresolvedTypeDeclaration mType, ASTNode2Element u2c) {
		return new Object[] { uClass, mType, u2c };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_11_2_collecttranslatedelements_greenFBBB(
			org.eclipse.uml2.uml.Class uClass, UnresolvedTypeDeclaration mType, ASTNode2Element u2c) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(uClass);
		ruleresult.getCreatedElements().add(mType);
		ruleresult.getCreatedLinkElements().add(u2c);
		return new Object[] { ruleresult, uClass, mType, u2c };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject uClass, EObject mType, EObject u2c, EObject m2m, EObject model,
			EObject externals) {
		if (!mType.equals(uClass)) {
			if (!mType.equals(u2c)) {
				if (!mType.equals(model)) {
					if (!u2c.equals(uClass)) {
						if (!m2m.equals(uClass)) {
							if (!m2m.equals(mType)) {
								if (!m2m.equals(u2c)) {
									if (!m2m.equals(model)) {
										if (!model.equals(uClass)) {
											if (!model.equals(u2c)) {
												if (!externals.equals(uClass)) {
													if (!externals.equals(mType)) {
														if (!externals.equals(u2c)) {
															if (!externals.equals(m2m)) {
																if (!externals.equals(model)) {
																	return new Object[] { ruleresult, uClass, mType,
																			u2c, m2m, model, externals };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject uClass, EObject mType, EObject u2c, EObject model,
			EObject externals) {
		EMoflonEdge uClass__externals____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge externals__uClass____ownedType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge u2c__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge u2c__uClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__mType____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UnresolvedTypeDeclaration2Type";
		String uClass__externals____package_name_prime = "package";
		String externals__uClass____ownedType_name_prime = "ownedType";
		String u2c__mType____source_name_prime = "source";
		String u2c__uClass____target_name_prime = "target";
		String model__mType____unresolvedItems_name_prime = "unresolvedItems";
		uClass__externals____package.setSrc(uClass);
		uClass__externals____package.setTrg(externals);
		ruleresult.getTranslatedEdges().add(uClass__externals____package);
		externals__uClass____ownedType.setSrc(externals);
		externals__uClass____ownedType.setTrg(uClass);
		ruleresult.getTranslatedEdges().add(externals__uClass____ownedType);
		u2c__mType____source.setSrc(u2c);
		u2c__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(u2c__mType____source);
		u2c__uClass____target.setSrc(u2c);
		u2c__uClass____target.setTrg(uClass);
		ruleresult.getCreatedEdges().add(u2c__uClass____target);
		model__mType____unresolvedItems.setSrc(model);
		model__mType____unresolvedItems.setTrg(mType);
		ruleresult.getCreatedEdges().add(model__mType____unresolvedItems);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		uClass__externals____package.setName(uClass__externals____package_name_prime);
		externals__uClass____ownedType.setName(externals__uClass____ownedType_name_prime);
		u2c__mType____source.setName(u2c__mType____source_name_prime);
		u2c__uClass____target.setName(u2c__uClass____target_name_prime);
		model__mType____unresolvedItems.setName(model__mType____unresolvedItems_name_prime);
		return new Object[] { ruleresult, uClass, mType, u2c, model, externals, uClass__externals____package,
				externals__uClass____ownedType, u2c__mType____source, u2c__uClass____target,
				model__mType____unresolvedItems };
	}

	public static final void pattern_UnresolvedTypeDeclaration2Type_11_5_registerobjects_expressionBBBBBBBB(
			UnresolvedTypeDeclaration2Type _this, PerformRuleResult ruleresult, EObject uClass, EObject mType,
			EObject u2c, EObject m2m, EObject model, EObject externals) {
		_this.registerObjects_BWD(ruleresult, uClass, mType, u2c, m2m, model, externals);

	}

	public static final PerformRuleResult pattern_UnresolvedTypeDeclaration2Type_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_12_1_preparereturnvalue_bindingFB(
			UnresolvedTypeDeclaration2Type _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_12_1_preparereturnvalue_blackFBB(EClass eClass,
			UnresolvedTypeDeclaration2Type _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_12_1_preparereturnvalue_bindingAndBlackFFB(
			UnresolvedTypeDeclaration2Type _this) {
		Object[] result_pattern_UnresolvedTypeDeclaration2Type_12_1_preparereturnvalue_binding = pattern_UnresolvedTypeDeclaration2Type_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_UnresolvedTypeDeclaration2Type_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_UnresolvedTypeDeclaration2Type_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration2Type_12_1_preparereturnvalue_black = pattern_UnresolvedTypeDeclaration2Type_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_UnresolvedTypeDeclaration2Type_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UnresolvedTypeDeclaration2Type_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "UnresolvedTypeDeclaration2Type";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("uClass");
		EObject _localVariable_1 = match.getObject("externals");
		EObject tmpUClass = _localVariable_0;
		EObject tmpExternals = _localVariable_1;
		if (tmpUClass instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uClass = (org.eclipse.uml2.uml.Class) tmpUClass;
			if (tmpExternals instanceof org.eclipse.uml2.uml.Model) {
				org.eclipse.uml2.uml.Model externals = (org.eclipse.uml2.uml.Model) tmpExternals;
				return new Object[] { uClass, externals, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration2Type_12_2_corematch_blackBFFBB(
			org.eclipse.uml2.uml.Class uClass, org.eclipse.uml2.uml.Model externals, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		String externals_name = externals.getName();
		if (externals_name.equals("externals")) {
			for (JavaModel2UMLPackage m2m : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(externals, JavaModel2UMLPackage.class, "target")) {
				Model model = m2m.getSource();
				if (model != null) {
					_result.add(new Object[] { uClass, m2m, model, externals, match });
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration2Type_12_3_findcontext_blackBBBB(
			org.eclipse.uml2.uml.Class uClass, JavaModel2UMLPackage m2m, Model model,
			org.eclipse.uml2.uml.Model externals) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (externals.equals(uClass.getPackage())) {
			if (model.equals(m2m.getSource())) {
				if (externals.equals(m2m.getTarget())) {
					String externals_name = externals.getName();
					if (externals_name.equals("externals")) {
						_result.add(new Object[] { uClass, m2m, model, externals });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_12_3_findcontext_greenBBBBFFFFF(
			org.eclipse.uml2.uml.Class uClass, JavaModel2UMLPackage m2m, Model model,
			org.eclipse.uml2.uml.Model externals) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge uClass__externals____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge externals__uClass____ownedType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2m__model____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2m__externals____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String uClass__externals____package_name_prime = "package";
		String externals__uClass____ownedType_name_prime = "ownedType";
		String m2m__model____source_name_prime = "source";
		String m2m__externals____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(uClass);
		isApplicableMatch.getAllContextElements().add(m2m);
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(externals);
		uClass__externals____package.setSrc(uClass);
		uClass__externals____package.setTrg(externals);
		isApplicableMatch.getAllContextElements().add(uClass__externals____package);
		externals__uClass____ownedType.setSrc(externals);
		externals__uClass____ownedType.setTrg(uClass);
		isApplicableMatch.getAllContextElements().add(externals__uClass____ownedType);
		m2m__model____source.setSrc(m2m);
		m2m__model____source.setTrg(model);
		isApplicableMatch.getAllContextElements().add(m2m__model____source);
		m2m__externals____target.setSrc(m2m);
		m2m__externals____target.setTrg(externals);
		isApplicableMatch.getAllContextElements().add(m2m__externals____target);
		uClass__externals____package.setName(uClass__externals____package_name_prime);
		externals__uClass____ownedType.setName(externals__uClass____ownedType_name_prime);
		m2m__model____source.setName(m2m__model____source_name_prime);
		m2m__externals____target.setName(m2m__externals____target_name_prime);
		return new Object[] { uClass, m2m, model, externals, isApplicableMatch, uClass__externals____package,
				externals__uClass____ownedType, m2m__model____source, m2m__externals____target };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_12_4_solveCSP_bindingFBBBBBB(
			UnresolvedTypeDeclaration2Type _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Class uClass, JavaModel2UMLPackage m2m, Model model,
			org.eclipse.uml2.uml.Model externals) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, uClass, m2m, model, externals);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, uClass, m2m, model, externals };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_12_4_solveCSP_bindingAndBlackFBBBBBB(
			UnresolvedTypeDeclaration2Type _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Class uClass, JavaModel2UMLPackage m2m, Model model,
			org.eclipse.uml2.uml.Model externals) {
		Object[] result_pattern_UnresolvedTypeDeclaration2Type_12_4_solveCSP_binding = pattern_UnresolvedTypeDeclaration2Type_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, uClass, m2m, model, externals);
		if (result_pattern_UnresolvedTypeDeclaration2Type_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration2Type_12_4_solveCSP_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration2Type_12_4_solveCSP_black = pattern_UnresolvedTypeDeclaration2Type_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedTypeDeclaration2Type_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, uClass, m2m, model, externals };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_12_5_checkCSP_expressionFBB(
			UnresolvedTypeDeclaration2Type _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UnresolvedTypeDeclaration2Type";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UnresolvedTypeDeclaration2Type_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_20_1_preparereturnvalue_bindingFB(
			UnresolvedTypeDeclaration2Type _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, UnresolvedTypeDeclaration2Type _this) {
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

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_20_1_preparereturnvalue_bindingAndBlackFFBF(
			UnresolvedTypeDeclaration2Type _this) {
		Object[] result_pattern_UnresolvedTypeDeclaration2Type_20_1_preparereturnvalue_binding = pattern_UnresolvedTypeDeclaration2Type_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_UnresolvedTypeDeclaration2Type_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_UnresolvedTypeDeclaration2Type_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration2Type_20_1_preparereturnvalue_black = pattern_UnresolvedTypeDeclaration2Type_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_UnresolvedTypeDeclaration2Type_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UnresolvedTypeDeclaration2Type_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_UnresolvedTypeDeclaration2Type_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration2Type_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_package) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUClass = _edge_package.getSrc();
		if (tmpUClass instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uClass = (org.eclipse.uml2.uml.Class) tmpUClass;
			EObject tmpExternals = _edge_package.getTrg();
			if (tmpExternals instanceof org.eclipse.uml2.uml.Model) {
				org.eclipse.uml2.uml.Model externals = (org.eclipse.uml2.uml.Model) tmpExternals;
				if (externals.equals(uClass.getPackage())) {
					String externals_name = externals.getName();
					if (externals_name.equals("externals")) {
						_result.add(new Object[] { uClass, externals, _edge_package });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			UnresolvedTypeDeclaration2Type _this, Match match, org.eclipse.uml2.uml.Class uClass,
			org.eclipse.uml2.uml.Model externals) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, uClass, externals);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			UnresolvedTypeDeclaration2Type _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_UnresolvedTypeDeclaration2Type_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_21_1_preparereturnvalue_bindingFB(
			UnresolvedTypeDeclaration2Type _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, UnresolvedTypeDeclaration2Type _this) {
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

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_21_1_preparereturnvalue_bindingAndBlackFFBF(
			UnresolvedTypeDeclaration2Type _this) {
		Object[] result_pattern_UnresolvedTypeDeclaration2Type_21_1_preparereturnvalue_binding = pattern_UnresolvedTypeDeclaration2Type_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_UnresolvedTypeDeclaration2Type_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_UnresolvedTypeDeclaration2Type_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration2Type_21_1_preparereturnvalue_black = pattern_UnresolvedTypeDeclaration2Type_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_UnresolvedTypeDeclaration2Type_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UnresolvedTypeDeclaration2Type_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_UnresolvedTypeDeclaration2Type_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_21_2_testcorematchandDECs_black_nac_0B(
			UnresolvedTypeDeclaration mType) {
		Modifier __DEC_mType_modifier_732340 = mType.getModifier();
		if (__DEC_mType_modifier_732340 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration2Type_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_unresolvedItems) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpModel = _edge_unresolvedItems.getSrc();
		if (tmpModel instanceof Model) {
			Model model = (Model) tmpModel;
			EObject tmpMType = _edge_unresolvedItems.getTrg();
			if (tmpMType instanceof UnresolvedTypeDeclaration) {
				UnresolvedTypeDeclaration mType = (UnresolvedTypeDeclaration) tmpMType;
				if (model.getUnresolvedItems().contains(mType)) {
					if (pattern_UnresolvedTypeDeclaration2Type_21_2_testcorematchandDECs_black_nac_0B(mType) == null) {
						_result.add(new Object[] { mType, model, _edge_unresolvedItems });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			UnresolvedTypeDeclaration2Type _this, Match match, UnresolvedTypeDeclaration mType, Model model) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mType, model);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			UnresolvedTypeDeclaration2Type _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_UnresolvedTypeDeclaration2Type_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_24_1_prepare_blackB(
			UnresolvedTypeDeclaration2Type _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("uClass");
		EObject _localVariable_1 = sourceMatch.getObject("mType");
		EObject _localVariable_2 = sourceMatch.getObject("model");
		EObject _localVariable_3 = targetMatch.getObject("externals");
		EObject tmpUClass = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		EObject tmpModel = _localVariable_2;
		EObject tmpExternals = _localVariable_3;
		if (tmpUClass instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uClass = (org.eclipse.uml2.uml.Class) tmpUClass;
			if (tmpMType instanceof UnresolvedTypeDeclaration) {
				UnresolvedTypeDeclaration mType = (UnresolvedTypeDeclaration) tmpMType;
				if (tmpModel instanceof Model) {
					Model model = (Model) tmpModel;
					if (tmpExternals instanceof org.eclipse.uml2.uml.Model) {
						org.eclipse.uml2.uml.Model externals = (org.eclipse.uml2.uml.Model) tmpExternals;
						return new Object[] { uClass, mType, model, externals, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_24_2_matchsrctrgcontext_blackBBBBBB(
			org.eclipse.uml2.uml.Class uClass, UnresolvedTypeDeclaration mType, Model model,
			org.eclipse.uml2.uml.Model externals, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			String externals_name = externals.getName();
			if (externals_name.equals("externals")) {
				return new Object[] { uClass, mType, model, externals, sourceMatch, targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_UnresolvedTypeDeclaration2Type_24_2_matchsrctrgcontext_binding = pattern_UnresolvedTypeDeclaration2Type_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_UnresolvedTypeDeclaration2Type_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.uml2.uml.Class uClass = (org.eclipse.uml2.uml.Class) result_pattern_UnresolvedTypeDeclaration2Type_24_2_matchsrctrgcontext_binding[0];
			UnresolvedTypeDeclaration mType = (UnresolvedTypeDeclaration) result_pattern_UnresolvedTypeDeclaration2Type_24_2_matchsrctrgcontext_binding[1];
			Model model = (Model) result_pattern_UnresolvedTypeDeclaration2Type_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.uml2.uml.Model externals = (org.eclipse.uml2.uml.Model) result_pattern_UnresolvedTypeDeclaration2Type_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_UnresolvedTypeDeclaration2Type_24_2_matchsrctrgcontext_black = pattern_UnresolvedTypeDeclaration2Type_24_2_matchsrctrgcontext_blackBBBBBB(
					uClass, mType, model, externals, sourceMatch, targetMatch);
			if (result_pattern_UnresolvedTypeDeclaration2Type_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { uClass, mType, model, externals, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_24_3_solvecsp_bindingFBBBBBBB(
			UnresolvedTypeDeclaration2Type _this, org.eclipse.uml2.uml.Class uClass, UnresolvedTypeDeclaration mType,
			Model model, org.eclipse.uml2.uml.Model externals, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(uClass, mType, model, externals, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, uClass, mType, model, externals, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			UnresolvedTypeDeclaration2Type _this, org.eclipse.uml2.uml.Class uClass, UnresolvedTypeDeclaration mType,
			Model model, org.eclipse.uml2.uml.Model externals, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_UnresolvedTypeDeclaration2Type_24_3_solvecsp_binding = pattern_UnresolvedTypeDeclaration2Type_24_3_solvecsp_bindingFBBBBBBB(
				_this, uClass, mType, model, externals, sourceMatch, targetMatch);
		if (result_pattern_UnresolvedTypeDeclaration2Type_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration2Type_24_3_solvecsp_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration2Type_24_3_solvecsp_black = pattern_UnresolvedTypeDeclaration2Type_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_UnresolvedTypeDeclaration2Type_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, uClass, mType, model, externals, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration2Type_24_5_matchcorrcontext_blackFBBBB(
			Model model, org.eclipse.uml2.uml.Model externals, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			String externals_name = externals.getName();
			if (externals_name.equals("externals")) {
				for (JavaModel2UMLPackage m2m : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(model, JavaModel2UMLPackage.class, "source")) {
					if (externals.equals(m2m.getTarget())) {
						_result.add(new Object[] { m2m, model, externals, sourceMatch, targetMatch });
					}
				}
			}

		}
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_24_5_matchcorrcontext_greenBBBF(
			JavaModel2UMLPackage m2m, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "UnresolvedTypeDeclaration2Type";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(m2m);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { m2m, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_24_6_createcorrespondence_blackBBBBB(
			org.eclipse.uml2.uml.Class uClass, UnresolvedTypeDeclaration mType, Model model,
			org.eclipse.uml2.uml.Model externals, CCMatch ccMatch) {
		return new Object[] { uClass, mType, model, externals, ccMatch };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_24_6_createcorrespondence_greenBBFB(
			org.eclipse.uml2.uml.Class uClass, UnresolvedTypeDeclaration mType, CCMatch ccMatch) {
		ASTNode2Element u2c = UmlFactory.eINSTANCE.createASTNode2Element();
		u2c.setSource(mType);
		u2c.setTarget(uClass);
		ccMatch.getCreateCorr().add(u2c);
		return new Object[] { uClass, mType, u2c, ccMatch };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "UnresolvedTypeDeclaration2Type";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_UnresolvedTypeDeclaration2Type_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_27_1_matchtggpattern_black_nac_0B(
			UnresolvedTypeDeclaration mType) {
		Modifier __DEC_mType_modifier_615127 = mType.getModifier();
		if (__DEC_mType_modifier_615127 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_27_1_matchtggpattern_blackBB(
			UnresolvedTypeDeclaration mType, Model model) {
		if (model.getUnresolvedItems().contains(mType)) {
			if (pattern_UnresolvedTypeDeclaration2Type_27_1_matchtggpattern_black_nac_0B(mType) == null) {
				return new Object[] { mType, model };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_28_1_matchtggpattern_blackBB(
			org.eclipse.uml2.uml.Class uClass, org.eclipse.uml2.uml.Model externals) {
		if (externals.equals(uClass.getPackage())) {
			String externals_name = externals.getName();
			if (externals_name.equals("externals")) {
				return new Object[] { uClass, externals };
			}

		}
		return null;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_29_1_createresult_blackB(
			UnresolvedTypeDeclaration2Type _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, JavaModel2UMLPackage m2m) {
		if (ruleResult.getCorrObjects().contains(m2m)) {
			return new Object[] { ruleResult, m2m };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Model model) {
		if (ruleResult.getSourceObjects().contains(model)) {
			return new Object[] { ruleResult, model };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Model externals) {
		if (ruleResult.getTargetObjects().contains(externals)) {
			return new Object[] { ruleResult, externals };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration2Type_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList m2mList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpM2m : m2mList.getEntryObjects()) {
				if (tmpM2m instanceof JavaModel2UMLPackage) {
					JavaModel2UMLPackage m2m = (JavaModel2UMLPackage) tmpM2m;
					Model model = m2m.getSource();
					if (model != null) {
						org.eclipse.uml2.uml.Package tmpExternals = m2m.getTarget();
						if (tmpExternals instanceof org.eclipse.uml2.uml.Model) {
							org.eclipse.uml2.uml.Model externals = (org.eclipse.uml2.uml.Model) tmpExternals;
							String externals_name = externals.getName();
							if (externals_name.equals("externals")) {
								if (pattern_UnresolvedTypeDeclaration2Type_29_2_isapplicablecore_black_nac_0BB(
										ruleResult, m2m) == null) {
									if (pattern_UnresolvedTypeDeclaration2Type_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, model) == null) {
										if (pattern_UnresolvedTypeDeclaration2Type_29_2_isapplicablecore_black_nac_2BB(
												ruleResult, externals) == null) {
											_result.add(new Object[] { m2mList, m2m, model, externals,
													ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_29_3_solveCSP_bindingFBBBBBB(
			UnresolvedTypeDeclaration2Type _this, IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage m2m,
			Model model, org.eclipse.uml2.uml.Model externals, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, m2m, model, externals, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, m2m, model, externals, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_29_3_solveCSP_bindingAndBlackFBBBBBB(
			UnresolvedTypeDeclaration2Type _this, IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage m2m,
			Model model, org.eclipse.uml2.uml.Model externals, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_UnresolvedTypeDeclaration2Type_29_3_solveCSP_binding = pattern_UnresolvedTypeDeclaration2Type_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, m2m, model, externals, ruleResult);
		if (result_pattern_UnresolvedTypeDeclaration2Type_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration2Type_29_3_solveCSP_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration2Type_29_3_solveCSP_black = pattern_UnresolvedTypeDeclaration2Type_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedTypeDeclaration2Type_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, m2m, model, externals, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration2Type_29_4_checkCSP_expressionFBB(
			UnresolvedTypeDeclaration2Type _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_29_5_checknacs_blackBBB(
			JavaModel2UMLPackage m2m, Model model, org.eclipse.uml2.uml.Model externals) {
		String externals_name = externals.getName();
		if (externals_name.equals("externals")) {
			return new Object[] { m2m, model, externals };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_29_6_perform_blackBBBB(JavaModel2UMLPackage m2m,
			Model model, org.eclipse.uml2.uml.Model externals, ModelgeneratorRuleResult ruleResult) {
		String externals_name = externals.getName();
		if (externals_name.equals("externals")) {
			return new Object[] { m2m, model, externals, ruleResult };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration2Type_29_6_perform_greenFFFBBBB(Model model,
			org.eclipse.uml2.uml.Model externals, ModelgeneratorRuleResult ruleResult, CSP csp) {
		org.eclipse.uml2.uml.Class uClass = UMLFactory.eINSTANCE.createClass();
		UnresolvedTypeDeclaration mType = JavaFactory.eINSTANCE.createUnresolvedTypeDeclaration();
		ASTNode2Element u2c = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("uClass", "name");
		Object _localVariable_1 = csp.getValue("mType", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		uClass.setPackage(externals);
		ruleResult.getTargetObjects().add(uClass);
		model.getUnresolvedItems().add(mType);
		ruleResult.getSourceObjects().add(mType);
		u2c.setSource(mType);
		u2c.setTarget(uClass);
		ruleResult.getCorrObjects().add(u2c);
		String uClass_name_prime = (String) _localVariable_0;
		String mType_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		uClass.setName(uClass_name_prime);
		mType.setName(mType_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { uClass, mType, u2c, model, externals, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_UnresolvedTypeDeclaration2Type_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UnresolvedTypeDeclaration2TypeImpl
