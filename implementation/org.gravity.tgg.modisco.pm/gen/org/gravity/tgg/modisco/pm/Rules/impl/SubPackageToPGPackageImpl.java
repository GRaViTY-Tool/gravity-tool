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

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.PackageToTPackage;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.RulesPackage;
import org.gravity.tgg.modisco.pm.Rules.SubPackageToPGPackage;

import org.gravity.typegraph.basic.BasicFactory;
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
 * An implementation of the model object '<em><b>Sub Package To PG Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SubPackageToPGPackageImpl extends AbstractRuleImpl implements SubPackageToPGPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubPackageToPGPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSubPackageToPGPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.Package mParentPackage,
			org.eclipse.modisco.java.Package mPackage) {

		Object[] result1_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_0_1_initialbindings_blackBBBB(this, match, mParentPackage, mPackage);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mParentPackage] = " + mParentPackage + ", " + "[mPackage] = " + mPackage + ".");
		}

		Object[] result2_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mParentPackage, mPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mParentPackage] = " + mParentPackage + ", " + "[mPackage] = " + mPackage + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_0_4_collectelementstobetranslated_blackBBB(match, mParentPackage,
							mPackage);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mParentPackage] = " + mParentPackage + ", " + "[mPackage] = " + mPackage + ".");
			}
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_0_4_collectelementstobetranslated_greenBBBFF(match,
					mParentPackage, mPackage);
			//nothing EMoflonEdge mPackage__mParentPackage____package = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mParentPackage__mPackage____ownedPackages = (EMoflonEdge) result4_green[4];

			Object[] result5_black = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_0_5_collectcontextelements_blackBBB(match, mParentPackage, mPackage);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mParentPackage] = " + mParentPackage + ", " + "[mPackage] = " + mPackage + ".");
			}
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_0_5_collectcontextelements_greenBB(match,
					mParentPackage);

			// 
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_0_6_registerobjectstomatch_expressionBBBB(this,
					match, mParentPackage, mPackage);
			return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_0_7_expressionF();
		} else {
			return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TPackage tParent = (TPackage) result1_bindingAndBlack[0];
		PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result1_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[2];
		org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[3];
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_1_1_performtransformation_greenFBBFBB(tParent, typeGraph, mPackage, csp);
		TPackage tSub = (TPackage) result1_green[0];
		PackageToTPackage mPackageToTSub = (PackageToTPackage) result1_green[3];

		Object[] result2_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_1_2_collecttranslatedelements_blackBBB(tSub, mPackageToTSub, mPackage);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSub] = " + tSub + ", "
					+ "[mPackageToTSub] = " + mPackageToTSub + ", " + "[mPackage] = " + mPackage + ".");
		}
		Object[] result2_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_1_2_collecttranslatedelements_greenFBBB(tSub, mPackageToTSub, mPackage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, tSub, tParent,
						mParentPackageToTParent, typeGraph, mParentPackage, mPackageToTSub, mPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tSub] = " + tSub + ", " + "[tParent] = " + tParent + ", "
					+ "[mParentPackageToTParent] = " + mParentPackageToTParent + ", " + "[typeGraph] = " + typeGraph
					+ ", " + "[mParentPackage] = " + mParentPackage + ", " + "[mPackageToTSub] = " + mPackageToTSub
					+ ", " + "[mPackage] = " + mPackage + ".");
		}
		SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult,
				tSub, tParent, typeGraph, mParentPackage, mPackageToTSub, mPackage);
		//nothing EMoflonEdge tSub__typeGraph____model = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mPackageToTSub__tSub____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tParent__tSub____subpackages = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tSub__tParent____parent = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mPackage__mParentPackage____package = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mParentPackage__mPackage____ownedPackages = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mPackageToTSub__mPackage____source = (EMoflonEdge) result3_green[13];

		// 
		// 
		SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_1_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, tSub, tParent, mParentPackageToTParent, typeGraph, mParentPackage, mPackageToTSub,
				mPackage);
		return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result2_binding[0];
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_binding[1];
		for (Object[] result2_black : SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_2_2_corematch_blackFFBBB(mParentPackage, mPackage, match)) {
			TPackage tParent = (TPackage) result2_black[0];
			PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result2_black[1];
			// ForEach 
			for (Object[] result3_black : SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_2_3_findcontext_blackBBFBB(tParent, mParentPackageToTParent,
							mParentPackage, mPackage)) {
				TypeGraph typeGraph = (TypeGraph) result3_black[2];
				Object[] result3_green = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_2_3_findcontext_greenBBBBBFFFFFF(tParent,
								mParentPackageToTParent, typeGraph, mParentPackage, mPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge tParent__typeGraph____model = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mParentPackageToTParent__tParent____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mParentPackageToTParent__mParentPackage____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mPackage__mParentPackage____package = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mParentPackage__mPackage____ownedPackages = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								tParent, mParentPackageToTParent, typeGraph, mParentPackage, mPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tParent] = " + tParent + ", "
							+ "[mParentPackageToTParent] = " + mParentPackageToTParent + ", " + "[typeGraph] = "
							+ typeGraph + ", " + "[mParentPackage] = " + mParentPackage + ", " + "[mPackage] = "
							+ mPackage + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SubPackageToPGPackageImpl
							.pattern_SubPackageToPGPackage_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.modisco.java.Package mParentPackage,
			org.eclipse.modisco.java.Package mPackage) {
		match.registerObject("mParentPackage", mParentPackage);
		match.registerObject("mPackage", mPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.modisco.java.Package mParentPackage,
			org.eclipse.modisco.java.Package mPackage) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TPackage tParent,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage, org.eclipse.modisco.java.Package mPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage.name", true, csp);
		var_mPackage_name.setValue(mPackage.getName());
		var_mPackage_name.setType("String");

		// Create unbound variables
		Variable var_tSub_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSub.tName", csp);
		var_tSub_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mPackage_name, var_tSub_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tParent", tParent);
		isApplicableMatch.registerObject("mParentPackageToTParent", mParentPackageToTParent);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("mParentPackage", mParentPackage);
		isApplicableMatch.registerObject("mPackage", mPackage);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tSub, EObject tParent,
			EObject mParentPackageToTParent, EObject typeGraph, EObject mParentPackage, EObject mPackageToTSub,
			EObject mPackage) {
		ruleresult.registerObject("tSub", tSub);
		ruleresult.registerObject("tParent", tParent);
		ruleresult.registerObject("mParentPackageToTParent", mParentPackageToTParent);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("mParentPackage", mParentPackage);
		ruleresult.registerObject("mPackageToTSub", mPackageToTSub);
		ruleresult.registerObject("mPackage", mPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mPackage").eClass()).equals("java.Package.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TPackage tSub, TPackage tParent, TypeGraph typeGraph) {

		Object[] result1_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_10_1_initialbindings_blackBBBBB(this, match, tSub, tParent, typeGraph);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSub] = " + tSub + ", " + "[tParent] = " + tParent + ", "
					+ "[typeGraph] = " + typeGraph + ".");
		}

		Object[] result2_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tSub, tParent,
						typeGraph);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSub] = " + tSub + ", " + "[tParent] = " + tParent + ", "
					+ "[typeGraph] = " + typeGraph + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_10_4_collectelementstobetranslated_blackBBBB(match, tSub, tParent,
							typeGraph);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tSub] = " + tSub
								+ ", " + "[tParent] = " + tParent + ", " + "[typeGraph] = " + typeGraph + ".");
			}
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_10_4_collectelementstobetranslated_greenBBBBFFF(
					match, tSub, tParent, typeGraph);
			//nothing EMoflonEdge tSub__typeGraph____model = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tParent__tSub____subpackages = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tSub__tParent____parent = (EMoflonEdge) result4_green[6];

			Object[] result5_black = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_10_5_collectcontextelements_blackBBBB(match, tSub, tParent,
							typeGraph);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tSub] = " + tSub
								+ ", " + "[tParent] = " + tParent + ", " + "[typeGraph] = " + typeGraph + ".");
			}
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_10_5_collectcontextelements_greenBBBF(match,
					tParent, typeGraph);
			//nothing EMoflonEdge tParent__typeGraph____model = (EMoflonEdge) result5_green[3];

			// 
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_10_6_registerobjectstomatch_expressionBBBBB(this,
					match, tSub, tParent, typeGraph);
			return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_10_7_expressionF();
		} else {
			return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_11_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TPackage tSub = (TPackage) result1_bindingAndBlack[0];
		TPackage tParent = (TPackage) result1_bindingAndBlack[1];
		PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result1_bindingAndBlack[2];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[3];
		org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_11_1_performtransformation_greenBBFFB(tSub, mParentPackage, csp);
		PackageToTPackage mPackageToTSub = (PackageToTPackage) result1_green[2];
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result1_green[3];

		Object[] result2_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_11_2_collecttranslatedelements_blackBBB(tSub, mPackageToTSub, mPackage);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSub] = " + tSub + ", "
					+ "[mPackageToTSub] = " + mPackageToTSub + ", " + "[mPackage] = " + mPackage + ".");
		}
		Object[] result2_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_11_2_collecttranslatedelements_greenFBBB(tSub, mPackageToTSub, mPackage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, tSub, tParent,
						mParentPackageToTParent, typeGraph, mParentPackage, mPackageToTSub, mPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tSub] = " + tSub + ", " + "[tParent] = " + tParent + ", "
					+ "[mParentPackageToTParent] = " + mParentPackageToTParent + ", " + "[typeGraph] = " + typeGraph
					+ ", " + "[mParentPackage] = " + mParentPackage + ", " + "[mPackageToTSub] = " + mPackageToTSub
					+ ", " + "[mPackage] = " + mPackage + ".");
		}
		SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult,
				tSub, tParent, typeGraph, mParentPackage, mPackageToTSub, mPackage);
		//nothing EMoflonEdge tSub__typeGraph____model = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mPackageToTSub__tSub____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tParent__tSub____subpackages = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tSub__tParent____parent = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mPackage__mParentPackage____package = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mParentPackage__mPackage____ownedPackages = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mPackageToTSub__mPackage____source = (EMoflonEdge) result3_green[13];

		// 
		// 
		SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_11_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, tSub, tParent, mParentPackageToTParent, typeGraph, mParentPackage, mPackageToTSub,
				mPackage);
		return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TPackage tSub = (TPackage) result2_binding[0];
		TPackage tParent = (TPackage) result2_binding[1];
		TypeGraph typeGraph = (TypeGraph) result2_binding[2];
		for (Object[] result2_black : SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_12_2_corematch_blackBBFBFB(tSub, tParent, typeGraph, match)) {
			PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result2_black[2];
			org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result2_black[4];
			// ForEach 
			for (Object[] result3_black : SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_12_3_findcontext_blackBBBBB(tSub, tParent, mParentPackageToTParent,
							typeGraph, mParentPackage)) {
				Object[] result3_green = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_12_3_findcontext_greenBBBBBFFFFFFF(tSub, tParent,
								mParentPackageToTParent, typeGraph, mParentPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge tSub__typeGraph____model = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge tParent__typeGraph____model = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mParentPackageToTParent__tParent____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mParentPackageToTParent__mParentPackage____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tParent__tSub____subpackages = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tSub__tParent____parent = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								tSub, tParent, mParentPackageToTParent, typeGraph, mParentPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tSub] = " + tSub + ", "
							+ "[tParent] = " + tParent + ", " + "[mParentPackageToTParent] = " + mParentPackageToTParent
							+ ", " + "[typeGraph] = " + typeGraph + ", " + "[mParentPackage] = " + mParentPackage
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SubPackageToPGPackageImpl
							.pattern_SubPackageToPGPackage_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TPackage tSub, TPackage tParent, TypeGraph typeGraph) {
		match.registerObject("tSub", tSub);
		match.registerObject("tParent", tParent);
		match.registerObject("typeGraph", typeGraph);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TPackage tSub, TPackage tParent, TypeGraph typeGraph) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TPackage tSub, TPackage tParent,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tSub_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSub.tName", true, csp);
		var_tSub_tName.setValue(tSub.getTName());
		var_tSub_tName.setType("String");

		// Create unbound variables
		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage.name", csp);
		var_mPackage_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mPackage_name, var_tSub_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tSub", tSub);
		isApplicableMatch.registerObject("tParent", tParent);
		isApplicableMatch.registerObject("mParentPackageToTParent", mParentPackageToTParent);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("mParentPackage", mParentPackage);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tSub, EObject tParent,
			EObject mParentPackageToTParent, EObject typeGraph, EObject mParentPackage, EObject mPackageToTSub,
			EObject mPackage) {
		ruleresult.registerObject("tSub", tSub);
		ruleresult.registerObject("tParent", tParent);
		ruleresult.registerObject("mParentPackageToTParent", mParentPackageToTParent);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("mParentPackage", mParentPackage);
		ruleresult.registerObject("mPackageToTSub", mPackageToTSub);
		ruleresult.registerObject("mPackage", mPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tSub").eClass()).equals("basic.TPackage.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_9(EMoflonEdge _edge_model) {

		Object[] result1_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_blackFFFB(_edge_model)) {
			TPackage tSub = (TPackage) result2_black[0];
			TPackage tParent = (TPackage) result2_black[1];
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			Object[] result2_green = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tSub, tParent, typeGraph)) {
				// 
				if (SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = SubPackageToPGPackageImpl
							.pattern_SubPackageToPGPackage_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_9(EMoflonEdge _edge_package) {

		Object[] result1_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_blackFFB(_edge_package)) {
			org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result2_black[0];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[1];
			Object[] result2_green = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, mParentPackage, mPackage)) {
				// 
				if (SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = SubPackageToPGPackageImpl
							.pattern_SubPackageToPGPackage_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SubPackageToPGPackage");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage", true, csp);
		var_mPackage_name.setValue(__helper.getValue("mPackage", "name"));
		var_mPackage_name.setType("String");

		Variable var_tSub_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSub", true, csp);
		var_tSub_tName.setValue(__helper.getValue("tSub", "tName"));
		var_tSub_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("SubPackageToPGPackage");
		eq0.solve(var_mPackage_name, var_tSub_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tSub_tName.setBound(false);
			eq0.solve(var_mPackage_name, var_tSub_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tSub", "tName", var_tSub_tName.getValue());
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
		ruleResult.setRule("SubPackageToPGPackage");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage", true, csp);
		var_mPackage_name.setValue(__helper.getValue("mPackage", "name"));
		var_mPackage_name.setType("String");

		Variable var_tSub_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSub", true, csp);
		var_tSub_tName.setValue(__helper.getValue("tSub", "tName"));
		var_tSub_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("SubPackageToPGPackage");
		eq0.solve(var_mPackage_name, var_tSub_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mPackage_name.setBound(false);
			eq0.solve(var_mPackage_name, var_tSub_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mPackage", "name", var_mPackage_name.getValue());
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

		Object[] result1_black = SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TPackage tSub = (TPackage) result2_bindingAndBlack[0];
		TPackage tParent = (TPackage) result2_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result2_bindingAndBlack[2];
		org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[3];
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, tSub, tParent, typeGraph,
						mParentPackage, mPackage, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tSub] = " + tSub + ", " + "[tParent] = " + tParent + ", " + "[typeGraph] = " + typeGraph + ", "
					+ "[mParentPackage] = " + mParentPackage + ", " + "[mPackage] = " + mPackage + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_24_5_matchcorrcontext_blackBFBBB(tParent, mParentPackage,
							sourceMatch, targetMatch)) {
				PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result5_black[1];
				Object[] result5_green = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_24_5_matchcorrcontext_greenBBBF(mParentPackageToTParent,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_24_6_createcorrespondence_blackBBBBBB(tSub, tParent, typeGraph,
								mParentPackage, mPackage, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSub] = " + tSub + ", "
							+ "[tParent] = " + tParent + ", " + "[typeGraph] = " + typeGraph + ", "
							+ "[mParentPackage] = " + mParentPackage + ", " + "[mPackage] = " + mPackage + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_24_6_createcorrespondence_greenBFBB(tSub,
						mPackage, ccMatch);
				//nothing PackageToTPackage mPackageToTSub = (PackageToTPackage) result6_green[1];

				Object[] result7_black = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TPackage tSub, TPackage tParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage, org.eclipse.modisco.java.Package mPackage,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage.name", true, csp);
		var_mPackage_name.setValue(mPackage.getName());
		var_mPackage_name.setType("String");
		Variable var_tSub_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSub.tName", true, csp);
		var_tSub_tName.setValue(tSub.getTName());
		var_tSub_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mPackage_name, var_tSub_tName);
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.Package mParentPackage,
			org.eclipse.modisco.java.Package mPackage) {// 
		Object[] result1_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_27_1_matchtggpattern_blackBB(mParentPackage, mPackage);
		if (result1_black != null) {
			return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_27_2_expressionF();
		} else {
			return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TPackage tSub, TPackage tParent, TypeGraph typeGraph) {// 
		Object[] result1_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_28_1_matchtggpattern_blackBBB(tSub, tParent, typeGraph);
		if (result1_black != null) {
			return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_28_2_expressionF();
		} else {
			return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			PackageToTPackage mParentPackageToTParentParameter) {

		Object[] result1_black = SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mParentPackageToTParentList = (RuleEntryList) result2_black[0];
			TPackage tParent = (TPackage) result2_black[1];
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result2_black[3];
			org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result2_black[4];

			Object[] result3_bindingAndBlack = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
							tParent, mParentPackageToTParent, typeGraph, mParentPackage, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tParent] = " + tParent + ", "
						+ "[mParentPackageToTParent] = " + mParentPackageToTParent + ", " + "[typeGraph] = " + typeGraph
						+ ", " + "[mParentPackage] = " + mParentPackage + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_29_5_checknacs_blackBBBB(tParent, mParentPackageToTParent,
								typeGraph, mParentPackage);
				if (result5_black != null) {

					Object[] result6_black = SubPackageToPGPackageImpl
							.pattern_SubPackageToPGPackage_29_6_perform_blackBBBBB(tParent, mParentPackageToTParent,
									typeGraph, mParentPackage, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tParent] = "
								+ tParent + ", " + "[mParentPackageToTParent] = " + mParentPackageToTParent + ", "
								+ "[typeGraph] = " + typeGraph + ", " + "[mParentPackage] = " + mParentPackage + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_29_6_perform_greenFBBBFFBB(tParent,
							typeGraph, mParentPackage, ruleResult, csp);
					//nothing TPackage tSub = (TPackage) result6_green[0];
					//nothing PackageToTPackage mPackageToTSub = (PackageToTPackage) result6_green[4];
					//nothing org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TPackage tParent,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mPackage.name", csp);
		var_mPackage_name.setType("String");
		Variable var_tSub_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSub.tName", csp);
		var_tSub_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mPackage_name, var_tSub_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tParent", tParent);
		isApplicableMatch.registerObject("mParentPackageToTParent", mParentPackageToTParent);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("mParentPackage", mParentPackage);
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
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_FWD__MATCH_PACKAGE_PACKAGE:
			return isAppropriate_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGE_PACKAGE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2));
			return null;
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGE_PACKAGE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TPACKAGE_PACKAGETOTPACKAGE_TYPEGRAPH_PACKAGE_PACKAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TPackage) arguments.get(1),
					(PackageToTPackage) arguments.get(2), (TypeGraph) arguments.get(3),
					(org.eclipse.modisco.java.Package) arguments.get(4),
					(org.eclipse.modisco.java.Package) arguments.get(5));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_BWD__MATCH_TPACKAGE_TPACKAGE_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (TPackage) arguments.get(1), (TPackage) arguments.get(2),
					(TypeGraph) arguments.get(3));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPACKAGE_TPACKAGE_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TPackage) arguments.get(2), (TypeGraph) arguments.get(3));
			return null;
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPACKAGE_TPACKAGE_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TPackage) arguments.get(2), (TypeGraph) arguments.get(3));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TPACKAGE_TPACKAGE_PACKAGETOTPACKAGE_TYPEGRAPH_PACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TPackage) arguments.get(1),
					(TPackage) arguments.get(2), (PackageToTPackage) arguments.get(3), (TypeGraph) arguments.get(4),
					(org.eclipse.modisco.java.Package) arguments.get(5));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_9((EMoflonEdge) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_9__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_9((EMoflonEdge) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_SOLVE_CSP_CC__TPACKAGE_TPACKAGE_TYPEGRAPH_PACKAGE_PACKAGE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TPackage) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (org.eclipse.modisco.java.Package) arguments.get(3),
					(org.eclipse.modisco.java.Package) arguments.get(4), (Match) arguments.get(5),
					(Match) arguments.get(6));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___CHECK_DEC_FWD__PACKAGE_PACKAGE:
			return checkDEC_FWD((org.eclipse.modisco.java.Package) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___CHECK_DEC_BWD__TPACKAGE_TPACKAGE_TYPEGRAPH:
			return checkDEC_BWD((TPackage) arguments.get(0), (TPackage) arguments.get(1), (TypeGraph) arguments.get(2));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGETOTPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (PackageToTPackage) arguments.get(1));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TPACKAGE_PACKAGETOTPACKAGE_TYPEGRAPH_PACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TPackage) arguments.get(1),
					(PackageToTPackage) arguments.get(2), (TypeGraph) arguments.get(3),
					(org.eclipse.modisco.java.Package) arguments.get(4), (ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_1_initialbindings_blackBBBB(
			SubPackageToPGPackage _this, Match match, org.eclipse.modisco.java.Package mParentPackage,
			org.eclipse.modisco.java.Package mPackage) {
		if (!mPackage.equals(mParentPackage)) {
			return new Object[] { _this, match, mParentPackage, mPackage };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_2_SolveCSP_bindingFBBBB(SubPackageToPGPackage _this,
			Match match, org.eclipse.modisco.java.Package mParentPackage, org.eclipse.modisco.java.Package mPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mParentPackage, mPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mParentPackage, mPackage };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_2_SolveCSP_bindingAndBlackFBBBB(
			SubPackageToPGPackage _this, Match match, org.eclipse.modisco.java.Package mParentPackage,
			org.eclipse.modisco.java.Package mPackage) {
		Object[] result_pattern_SubPackageToPGPackage_0_2_SolveCSP_binding = pattern_SubPackageToPGPackage_0_2_SolveCSP_bindingFBBBB(
				_this, match, mParentPackage, mPackage);
		if (result_pattern_SubPackageToPGPackage_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_0_2_SolveCSP_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_0_2_SolveCSP_black = pattern_SubPackageToPGPackage_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mParentPackage, mPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_SubPackageToPGPackage_0_3_CheckCSP_expressionFBB(SubPackageToPGPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_4_collectelementstobetranslated_blackBBB(Match match,
			org.eclipse.modisco.java.Package mParentPackage, org.eclipse.modisco.java.Package mPackage) {
		if (!mPackage.equals(mParentPackage)) {
			return new Object[] { match, mParentPackage, mPackage };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			org.eclipse.modisco.java.Package mParentPackage, org.eclipse.modisco.java.Package mPackage) {
		EMoflonEdge mPackage__mParentPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackage__mPackage____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mPackage);
		String mPackage__mParentPackage____package_name_prime = "package";
		String mParentPackage__mPackage____ownedPackages_name_prime = "ownedPackages";
		mPackage__mParentPackage____package.setSrc(mPackage);
		mPackage__mParentPackage____package.setTrg(mParentPackage);
		match.getToBeTranslatedEdges().add(mPackage__mParentPackage____package);
		mParentPackage__mPackage____ownedPackages.setSrc(mParentPackage);
		mParentPackage__mPackage____ownedPackages.setTrg(mPackage);
		match.getToBeTranslatedEdges().add(mParentPackage__mPackage____ownedPackages);
		mPackage__mParentPackage____package.setName(mPackage__mParentPackage____package_name_prime);
		mParentPackage__mPackage____ownedPackages.setName(mParentPackage__mPackage____ownedPackages_name_prime);
		return new Object[] { match, mParentPackage, mPackage, mPackage__mParentPackage____package,
				mParentPackage__mPackage____ownedPackages };
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.modisco.java.Package mParentPackage, org.eclipse.modisco.java.Package mPackage) {
		if (!mPackage.equals(mParentPackage)) {
			return new Object[] { match, mParentPackage, mPackage };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_5_collectcontextelements_greenBB(Match match,
			org.eclipse.modisco.java.Package mParentPackage) {
		match.getContextNodes().add(mParentPackage);
		return new Object[] { match, mParentPackage };
	}

	public static final void pattern_SubPackageToPGPackage_0_6_registerobjectstomatch_expressionBBBB(
			SubPackageToPGPackage _this, Match match, org.eclipse.modisco.java.Package mParentPackage,
			org.eclipse.modisco.java.Package mPackage) {
		_this.registerObjectsToMatch_FWD(match, mParentPackage, mPackage);

	}

	public static final boolean pattern_SubPackageToPGPackage_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SubPackageToPGPackage_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tParent");
		EObject _localVariable_1 = isApplicableMatch.getObject("mParentPackageToTParent");
		EObject _localVariable_2 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_3 = isApplicableMatch.getObject("mParentPackage");
		EObject _localVariable_4 = isApplicableMatch.getObject("mPackage");
		EObject tmpTParent = _localVariable_0;
		EObject tmpMParentPackageToTParent = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpMParentPackage = _localVariable_3;
		EObject tmpMPackage = _localVariable_4;
		if (tmpTParent instanceof TPackage) {
			TPackage tParent = (TPackage) tmpTParent;
			if (tmpMParentPackageToTParent instanceof PackageToTPackage) {
				PackageToTPackage mParentPackageToTParent = (PackageToTPackage) tmpMParentPackageToTParent;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpMParentPackage instanceof org.eclipse.modisco.java.Package) {
						org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) tmpMParentPackage;
						if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
							org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
							return new Object[] { tParent, mParentPackageToTParent, typeGraph, mParentPackage, mPackage,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_1_performtransformation_blackBBBBBFBB(TPackage tParent,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage, org.eclipse.modisco.java.Package mPackage,
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch) {
		if (!mPackage.equals(mParentPackage)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { tParent, mParentPackageToTParent, typeGraph, mParentPackage, mPackage, csp,
							_this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding = pattern_SubPackageToPGPackage_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding != null) {
			TPackage tParent = (TPackage) result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding[0];
			PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding[2];
			org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding[3];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding[4];

			Object[] result_pattern_SubPackageToPGPackage_1_1_performtransformation_black = pattern_SubPackageToPGPackage_1_1_performtransformation_blackBBBBBFBB(
					tParent, mParentPackageToTParent, typeGraph, mParentPackage, mPackage, _this, isApplicableMatch);
			if (result_pattern_SubPackageToPGPackage_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SubPackageToPGPackage_1_1_performtransformation_black[5];

				return new Object[] { tParent, mParentPackageToTParent, typeGraph, mParentPackage, mPackage, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_1_performtransformation_greenFBBFBB(TPackage tParent,
			TypeGraph typeGraph, org.eclipse.modisco.java.Package mPackage, CSP csp) {
		TPackage tSub = BasicFactory.eINSTANCE.createTPackage();
		PackageToTPackage mPackageToTSub = PmFactory.eINSTANCE.createPackageToTPackage();
		Object _localVariable_0 = csp.getValue("tSub", "tName");
		tSub.setModel(typeGraph);
		tParent.getSubpackages().add(tSub);
		mPackageToTSub.setTarget(tSub);
		mPackageToTSub.setSource(mPackage);
		String tSub_tName_prime = (String) _localVariable_0;
		tSub.setTName(tSub_tName_prime);
		return new Object[] { tSub, tParent, typeGraph, mPackageToTSub, mPackage, csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_2_collecttranslatedelements_blackBBB(TPackage tSub,
			PackageToTPackage mPackageToTSub, org.eclipse.modisco.java.Package mPackage) {
		return new Object[] { tSub, mPackageToTSub, mPackage };
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_2_collecttranslatedelements_greenFBBB(TPackage tSub,
			PackageToTPackage mPackageToTSub, org.eclipse.modisco.java.Package mPackage) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tSub);
		ruleresult.getCreatedLinkElements().add(mPackageToTSub);
		ruleresult.getTranslatedElements().add(mPackage);
		return new Object[] { ruleresult, tSub, mPackageToTSub, mPackage };
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject tSub, EObject tParent, EObject mParentPackageToTParent,
			EObject typeGraph, EObject mParentPackage, EObject mPackageToTSub, EObject mPackage) {
		if (!tSub.equals(typeGraph)) {
			if (!tParent.equals(tSub)) {
				if (!tParent.equals(typeGraph)) {
					if (!mParentPackageToTParent.equals(tSub)) {
						if (!mParentPackageToTParent.equals(tParent)) {
							if (!mParentPackageToTParent.equals(typeGraph)) {
								if (!mParentPackage.equals(tSub)) {
									if (!mParentPackage.equals(tParent)) {
										if (!mParentPackage.equals(mParentPackageToTParent)) {
											if (!mParentPackage.equals(typeGraph)) {
												if (!mPackageToTSub.equals(tSub)) {
													if (!mPackageToTSub.equals(tParent)) {
														if (!mPackageToTSub.equals(mParentPackageToTParent)) {
															if (!mPackageToTSub.equals(typeGraph)) {
																if (!mPackageToTSub.equals(mParentPackage)) {
																	if (!mPackage.equals(tSub)) {
																		if (!mPackage.equals(tParent)) {
																			if (!mPackage
																					.equals(mParentPackageToTParent)) {
																				if (!mPackage.equals(typeGraph)) {
																					if (!mPackage
																							.equals(mParentPackage)) {
																						if (!mPackage.equals(
																								mPackageToTSub)) {
																							return new Object[] {
																									ruleresult, tSub,
																									tParent,
																									mParentPackageToTParent,
																									typeGraph,
																									mParentPackage,
																									mPackageToTSub,
																									mPackage };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SubPackageToPGPackage_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject tSub, EObject tParent, EObject typeGraph, EObject mParentPackage,
			EObject mPackageToTSub, EObject mPackage) {
		EMoflonEdge tSub__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTSub__tSub____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParent__tSub____subpackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSub__tParent____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mParentPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackage__mPackage____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTSub__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SubPackageToPGPackage";
		String tSub__typeGraph____model_name_prime = "model";
		String mPackageToTSub__tSub____target_name_prime = "target";
		String tParent__tSub____subpackages_name_prime = "subpackages";
		String tSub__tParent____parent_name_prime = "parent";
		String mPackage__mParentPackage____package_name_prime = "package";
		String mParentPackage__mPackage____ownedPackages_name_prime = "ownedPackages";
		String mPackageToTSub__mPackage____source_name_prime = "source";
		tSub__typeGraph____model.setSrc(tSub);
		tSub__typeGraph____model.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tSub__typeGraph____model);
		mPackageToTSub__tSub____target.setSrc(mPackageToTSub);
		mPackageToTSub__tSub____target.setTrg(tSub);
		ruleresult.getCreatedEdges().add(mPackageToTSub__tSub____target);
		tParent__tSub____subpackages.setSrc(tParent);
		tParent__tSub____subpackages.setTrg(tSub);
		ruleresult.getCreatedEdges().add(tParent__tSub____subpackages);
		tSub__tParent____parent.setSrc(tSub);
		tSub__tParent____parent.setTrg(tParent);
		ruleresult.getCreatedEdges().add(tSub__tParent____parent);
		mPackage__mParentPackage____package.setSrc(mPackage);
		mPackage__mParentPackage____package.setTrg(mParentPackage);
		ruleresult.getTranslatedEdges().add(mPackage__mParentPackage____package);
		mParentPackage__mPackage____ownedPackages.setSrc(mParentPackage);
		mParentPackage__mPackage____ownedPackages.setTrg(mPackage);
		ruleresult.getTranslatedEdges().add(mParentPackage__mPackage____ownedPackages);
		mPackageToTSub__mPackage____source.setSrc(mPackageToTSub);
		mPackageToTSub__mPackage____source.setTrg(mPackage);
		ruleresult.getCreatedEdges().add(mPackageToTSub__mPackage____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tSub__typeGraph____model.setName(tSub__typeGraph____model_name_prime);
		mPackageToTSub__tSub____target.setName(mPackageToTSub__tSub____target_name_prime);
		tParent__tSub____subpackages.setName(tParent__tSub____subpackages_name_prime);
		tSub__tParent____parent.setName(tSub__tParent____parent_name_prime);
		mPackage__mParentPackage____package.setName(mPackage__mParentPackage____package_name_prime);
		mParentPackage__mPackage____ownedPackages.setName(mParentPackage__mPackage____ownedPackages_name_prime);
		mPackageToTSub__mPackage____source.setName(mPackageToTSub__mPackage____source_name_prime);
		return new Object[] { ruleresult, tSub, tParent, typeGraph, mParentPackage, mPackageToTSub, mPackage,
				tSub__typeGraph____model, mPackageToTSub__tSub____target, tParent__tSub____subpackages,
				tSub__tParent____parent, mPackage__mParentPackage____package, mParentPackage__mPackage____ownedPackages,
				mPackageToTSub__mPackage____source };
	}

	public static final void pattern_SubPackageToPGPackage_1_5_registerobjects_expressionBBBBBBBBB(
			SubPackageToPGPackage _this, PerformRuleResult ruleresult, EObject tSub, EObject tParent,
			EObject mParentPackageToTParent, EObject typeGraph, EObject mParentPackage, EObject mPackageToTSub,
			EObject mPackage) {
		_this.registerObjects_FWD(ruleresult, tSub, tParent, mParentPackageToTParent, typeGraph, mParentPackage,
				mPackageToTSub, mPackage);

	}

	public static final PerformRuleResult pattern_SubPackageToPGPackage_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_1_preparereturnvalue_bindingFB(
			SubPackageToPGPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_1_preparereturnvalue_blackFBB(EClass eClass,
			SubPackageToPGPackage _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_1_preparereturnvalue_bindingAndBlackFFB(
			SubPackageToPGPackage _this) {
		Object[] result_pattern_SubPackageToPGPackage_2_1_preparereturnvalue_binding = pattern_SubPackageToPGPackage_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SubPackageToPGPackage_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SubPackageToPGPackage_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_2_1_preparereturnvalue_black = pattern_SubPackageToPGPackage_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SubPackageToPGPackage_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SubPackageToPGPackage_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SubPackageToPGPackage";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mParentPackage");
		EObject _localVariable_1 = match.getObject("mPackage");
		EObject tmpMParentPackage = _localVariable_0;
		EObject tmpMPackage = _localVariable_1;
		if (tmpMParentPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) tmpMParentPackage;
			if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
				org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
				return new Object[] { mParentPackage, mPackage, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_2_2_corematch_blackFFBBB(
			org.eclipse.modisco.java.Package mParentPackage, org.eclipse.modisco.java.Package mPackage, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mPackage.equals(mParentPackage)) {
			for (PackageToTPackage mParentPackageToTParent : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mParentPackage, PackageToTPackage.class, "source")) {
				TPackage tParent = mParentPackageToTParent.getTarget();
				if (tParent != null) {
					_result.add(new Object[] { tParent, mParentPackageToTParent, mParentPackage, mPackage, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_2_3_findcontext_blackBBFBB(TPackage tParent,
			PackageToTPackage mParentPackageToTParent, org.eclipse.modisco.java.Package mParentPackage,
			org.eclipse.modisco.java.Package mPackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mPackage.equals(mParentPackage)) {
			if (tParent.equals(mParentPackageToTParent.getTarget())) {
				if (mParentPackage.equals(mParentPackageToTParent.getSource())) {
					if (mParentPackage.equals(mPackage.getPackage())) {
						TypeGraph typeGraph = tParent.getModel();
						if (typeGraph != null) {
							_result.add(new Object[] { tParent, mParentPackageToTParent, typeGraph, mParentPackage,
									mPackage });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_3_findcontext_greenBBBBBFFFFFF(TPackage tParent,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage, org.eclipse.modisco.java.Package mPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tParent__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackageToTParent__tParent____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackageToTParent__mParentPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mParentPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackage__mPackage____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tParent__typeGraph____model_name_prime = "model";
		String mParentPackageToTParent__tParent____target_name_prime = "target";
		String mParentPackageToTParent__mParentPackage____source_name_prime = "source";
		String mPackage__mParentPackage____package_name_prime = "package";
		String mParentPackage__mPackage____ownedPackages_name_prime = "ownedPackages";
		isApplicableMatch.getAllContextElements().add(tParent);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(mParentPackage);
		isApplicableMatch.getAllContextElements().add(mPackage);
		tParent__typeGraph____model.setSrc(tParent);
		tParent__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tParent__typeGraph____model);
		mParentPackageToTParent__tParent____target.setSrc(mParentPackageToTParent);
		mParentPackageToTParent__tParent____target.setTrg(tParent);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent__tParent____target);
		mParentPackageToTParent__mParentPackage____source.setSrc(mParentPackageToTParent);
		mParentPackageToTParent__mParentPackage____source.setTrg(mParentPackage);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent__mParentPackage____source);
		mPackage__mParentPackage____package.setSrc(mPackage);
		mPackage__mParentPackage____package.setTrg(mParentPackage);
		isApplicableMatch.getAllContextElements().add(mPackage__mParentPackage____package);
		mParentPackage__mPackage____ownedPackages.setSrc(mParentPackage);
		mParentPackage__mPackage____ownedPackages.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mParentPackage__mPackage____ownedPackages);
		tParent__typeGraph____model.setName(tParent__typeGraph____model_name_prime);
		mParentPackageToTParent__tParent____target.setName(mParentPackageToTParent__tParent____target_name_prime);
		mParentPackageToTParent__mParentPackage____source
				.setName(mParentPackageToTParent__mParentPackage____source_name_prime);
		mPackage__mParentPackage____package.setName(mPackage__mParentPackage____package_name_prime);
		mParentPackage__mPackage____ownedPackages.setName(mParentPackage__mPackage____ownedPackages_name_prime);
		return new Object[] { tParent, mParentPackageToTParent, typeGraph, mParentPackage, mPackage, isApplicableMatch,
				tParent__typeGraph____model, mParentPackageToTParent__tParent____target,
				mParentPackageToTParent__mParentPackage____source, mPackage__mParentPackage____package,
				mParentPackage__mPackage____ownedPackages };
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_4_solveCSP_bindingFBBBBBBB(SubPackageToPGPackage _this,
			IsApplicableMatch isApplicableMatch, TPackage tParent, PackageToTPackage mParentPackageToTParent,
			TypeGraph typeGraph, org.eclipse.modisco.java.Package mParentPackage,
			org.eclipse.modisco.java.Package mPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tParent, mParentPackageToTParent,
				typeGraph, mParentPackage, mPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tParent, mParentPackageToTParent, typeGraph,
					mParentPackage, mPackage };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch, TPackage tParent,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage, org.eclipse.modisco.java.Package mPackage) {
		Object[] result_pattern_SubPackageToPGPackage_2_4_solveCSP_binding = pattern_SubPackageToPGPackage_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tParent, mParentPackageToTParent, typeGraph, mParentPackage, mPackage);
		if (result_pattern_SubPackageToPGPackage_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_2_4_solveCSP_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_2_4_solveCSP_black = pattern_SubPackageToPGPackage_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tParent, mParentPackageToTParent, typeGraph,
						mParentPackage, mPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_SubPackageToPGPackage_2_5_checkCSP_expressionFBB(SubPackageToPGPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SubPackageToPGPackage";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SubPackageToPGPackage_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_1_initialbindings_blackBBBBB(
			SubPackageToPGPackage _this, Match match, TPackage tSub, TPackage tParent, TypeGraph typeGraph) {
		if (!tParent.equals(tSub)) {
			return new Object[] { _this, match, tSub, tParent, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_2_SolveCSP_bindingFBBBBB(SubPackageToPGPackage _this,
			Match match, TPackage tSub, TPackage tParent, TypeGraph typeGraph) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tSub, tParent, typeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tSub, tParent, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_2_SolveCSP_bindingAndBlackFBBBBB(
			SubPackageToPGPackage _this, Match match, TPackage tSub, TPackage tParent, TypeGraph typeGraph) {
		Object[] result_pattern_SubPackageToPGPackage_10_2_SolveCSP_binding = pattern_SubPackageToPGPackage_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tSub, tParent, typeGraph);
		if (result_pattern_SubPackageToPGPackage_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_10_2_SolveCSP_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_10_2_SolveCSP_black = pattern_SubPackageToPGPackage_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tSub, tParent, typeGraph };
			}
		}
		return null;
	}

	public static final boolean pattern_SubPackageToPGPackage_10_3_CheckCSP_expressionFBB(SubPackageToPGPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TPackage tSub, TPackage tParent, TypeGraph typeGraph) {
		if (!tParent.equals(tSub)) {
			return new Object[] { match, tSub, tParent, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, TPackage tSub, TPackage tParent, TypeGraph typeGraph) {
		EMoflonEdge tSub__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParent__tSub____subpackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSub__tParent____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSub);
		String tSub__typeGraph____model_name_prime = "model";
		String tParent__tSub____subpackages_name_prime = "subpackages";
		String tSub__tParent____parent_name_prime = "parent";
		tSub__typeGraph____model.setSrc(tSub);
		tSub__typeGraph____model.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tSub__typeGraph____model);
		tParent__tSub____subpackages.setSrc(tParent);
		tParent__tSub____subpackages.setTrg(tSub);
		match.getToBeTranslatedEdges().add(tParent__tSub____subpackages);
		tSub__tParent____parent.setSrc(tSub);
		tSub__tParent____parent.setTrg(tParent);
		match.getToBeTranslatedEdges().add(tSub__tParent____parent);
		tSub__typeGraph____model.setName(tSub__typeGraph____model_name_prime);
		tParent__tSub____subpackages.setName(tParent__tSub____subpackages_name_prime);
		tSub__tParent____parent.setName(tSub__tParent____parent_name_prime);
		return new Object[] { match, tSub, tParent, typeGraph, tSub__typeGraph____model, tParent__tSub____subpackages,
				tSub__tParent____parent };
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_5_collectcontextelements_blackBBBB(Match match,
			TPackage tSub, TPackage tParent, TypeGraph typeGraph) {
		if (!tParent.equals(tSub)) {
			return new Object[] { match, tSub, tParent, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_5_collectcontextelements_greenBBBF(Match match,
			TPackage tParent, TypeGraph typeGraph) {
		EMoflonEdge tParent__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tParent);
		match.getContextNodes().add(typeGraph);
		String tParent__typeGraph____model_name_prime = "model";
		tParent__typeGraph____model.setSrc(tParent);
		tParent__typeGraph____model.setTrg(typeGraph);
		match.getContextEdges().add(tParent__typeGraph____model);
		tParent__typeGraph____model.setName(tParent__typeGraph____model_name_prime);
		return new Object[] { match, tParent, typeGraph, tParent__typeGraph____model };
	}

	public static final void pattern_SubPackageToPGPackage_10_6_registerobjectstomatch_expressionBBBBB(
			SubPackageToPGPackage _this, Match match, TPackage tSub, TPackage tParent, TypeGraph typeGraph) {
		_this.registerObjectsToMatch_BWD(match, tSub, tParent, typeGraph);

	}

	public static final boolean pattern_SubPackageToPGPackage_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SubPackageToPGPackage_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tSub");
		EObject _localVariable_1 = isApplicableMatch.getObject("tParent");
		EObject _localVariable_2 = isApplicableMatch.getObject("mParentPackageToTParent");
		EObject _localVariable_3 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_4 = isApplicableMatch.getObject("mParentPackage");
		EObject tmpTSub = _localVariable_0;
		EObject tmpTParent = _localVariable_1;
		EObject tmpMParentPackageToTParent = _localVariable_2;
		EObject tmpTypeGraph = _localVariable_3;
		EObject tmpMParentPackage = _localVariable_4;
		if (tmpTSub instanceof TPackage) {
			TPackage tSub = (TPackage) tmpTSub;
			if (tmpTParent instanceof TPackage) {
				TPackage tParent = (TPackage) tmpTParent;
				if (tmpMParentPackageToTParent instanceof PackageToTPackage) {
					PackageToTPackage mParentPackageToTParent = (PackageToTPackage) tmpMParentPackageToTParent;
					if (tmpTypeGraph instanceof TypeGraph) {
						TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
						if (tmpMParentPackage instanceof org.eclipse.modisco.java.Package) {
							org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) tmpMParentPackage;
							return new Object[] { tSub, tParent, mParentPackageToTParent, typeGraph, mParentPackage,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_1_performtransformation_blackBBBBBFBB(TPackage tSub,
			TPackage tParent, PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage, SubPackageToPGPackage _this,
			IsApplicableMatch isApplicableMatch) {
		if (!tParent.equals(tSub)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { tSub, tParent, mParentPackageToTParent, typeGraph, mParentPackage, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding = pattern_SubPackageToPGPackage_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding != null) {
			TPackage tSub = (TPackage) result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding[0];
			TPackage tParent = (TPackage) result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding[1];
			PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding[2];
			TypeGraph typeGraph = (TypeGraph) result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding[3];
			org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding[4];

			Object[] result_pattern_SubPackageToPGPackage_11_1_performtransformation_black = pattern_SubPackageToPGPackage_11_1_performtransformation_blackBBBBBFBB(
					tSub, tParent, mParentPackageToTParent, typeGraph, mParentPackage, _this, isApplicableMatch);
			if (result_pattern_SubPackageToPGPackage_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SubPackageToPGPackage_11_1_performtransformation_black[5];

				return new Object[] { tSub, tParent, mParentPackageToTParent, typeGraph, mParentPackage, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_1_performtransformation_greenBBFFB(TPackage tSub,
			org.eclipse.modisco.java.Package mParentPackage, CSP csp) {
		PackageToTPackage mPackageToTSub = PmFactory.eINSTANCE.createPackageToTPackage();
		org.eclipse.modisco.java.Package mPackage = JavaFactory.eINSTANCE.createPackage();
		Object _localVariable_0 = csp.getValue("mPackage", "name");
		mPackageToTSub.setTarget(tSub);
		mPackage.setPackage(mParentPackage);
		mPackageToTSub.setSource(mPackage);
		String mPackage_name_prime = (String) _localVariable_0;
		mPackage.setName(mPackage_name_prime);
		return new Object[] { tSub, mParentPackage, mPackageToTSub, mPackage, csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_2_collecttranslatedelements_blackBBB(TPackage tSub,
			PackageToTPackage mPackageToTSub, org.eclipse.modisco.java.Package mPackage) {
		return new Object[] { tSub, mPackageToTSub, mPackage };
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_2_collecttranslatedelements_greenFBBB(TPackage tSub,
			PackageToTPackage mPackageToTSub, org.eclipse.modisco.java.Package mPackage) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tSub);
		ruleresult.getCreatedLinkElements().add(mPackageToTSub);
		ruleresult.getCreatedElements().add(mPackage);
		return new Object[] { ruleresult, tSub, mPackageToTSub, mPackage };
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject tSub, EObject tParent, EObject mParentPackageToTParent,
			EObject typeGraph, EObject mParentPackage, EObject mPackageToTSub, EObject mPackage) {
		if (!tSub.equals(typeGraph)) {
			if (!tParent.equals(tSub)) {
				if (!tParent.equals(typeGraph)) {
					if (!mParentPackageToTParent.equals(tSub)) {
						if (!mParentPackageToTParent.equals(tParent)) {
							if (!mParentPackageToTParent.equals(typeGraph)) {
								if (!mParentPackage.equals(tSub)) {
									if (!mParentPackage.equals(tParent)) {
										if (!mParentPackage.equals(mParentPackageToTParent)) {
											if (!mParentPackage.equals(typeGraph)) {
												if (!mPackageToTSub.equals(tSub)) {
													if (!mPackageToTSub.equals(tParent)) {
														if (!mPackageToTSub.equals(mParentPackageToTParent)) {
															if (!mPackageToTSub.equals(typeGraph)) {
																if (!mPackageToTSub.equals(mParentPackage)) {
																	if (!mPackage.equals(tSub)) {
																		if (!mPackage.equals(tParent)) {
																			if (!mPackage
																					.equals(mParentPackageToTParent)) {
																				if (!mPackage.equals(typeGraph)) {
																					if (!mPackage
																							.equals(mParentPackage)) {
																						if (!mPackage.equals(
																								mPackageToTSub)) {
																							return new Object[] {
																									ruleresult, tSub,
																									tParent,
																									mParentPackageToTParent,
																									typeGraph,
																									mParentPackage,
																									mPackageToTSub,
																									mPackage };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SubPackageToPGPackage_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject tSub, EObject tParent, EObject typeGraph, EObject mParentPackage,
			EObject mPackageToTSub, EObject mPackage) {
		EMoflonEdge tSub__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTSub__tSub____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParent__tSub____subpackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSub__tParent____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mParentPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackage__mPackage____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTSub__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SubPackageToPGPackage";
		String tSub__typeGraph____model_name_prime = "model";
		String mPackageToTSub__tSub____target_name_prime = "target";
		String tParent__tSub____subpackages_name_prime = "subpackages";
		String tSub__tParent____parent_name_prime = "parent";
		String mPackage__mParentPackage____package_name_prime = "package";
		String mParentPackage__mPackage____ownedPackages_name_prime = "ownedPackages";
		String mPackageToTSub__mPackage____source_name_prime = "source";
		tSub__typeGraph____model.setSrc(tSub);
		tSub__typeGraph____model.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tSub__typeGraph____model);
		mPackageToTSub__tSub____target.setSrc(mPackageToTSub);
		mPackageToTSub__tSub____target.setTrg(tSub);
		ruleresult.getCreatedEdges().add(mPackageToTSub__tSub____target);
		tParent__tSub____subpackages.setSrc(tParent);
		tParent__tSub____subpackages.setTrg(tSub);
		ruleresult.getTranslatedEdges().add(tParent__tSub____subpackages);
		tSub__tParent____parent.setSrc(tSub);
		tSub__tParent____parent.setTrg(tParent);
		ruleresult.getTranslatedEdges().add(tSub__tParent____parent);
		mPackage__mParentPackage____package.setSrc(mPackage);
		mPackage__mParentPackage____package.setTrg(mParentPackage);
		ruleresult.getCreatedEdges().add(mPackage__mParentPackage____package);
		mParentPackage__mPackage____ownedPackages.setSrc(mParentPackage);
		mParentPackage__mPackage____ownedPackages.setTrg(mPackage);
		ruleresult.getCreatedEdges().add(mParentPackage__mPackage____ownedPackages);
		mPackageToTSub__mPackage____source.setSrc(mPackageToTSub);
		mPackageToTSub__mPackage____source.setTrg(mPackage);
		ruleresult.getCreatedEdges().add(mPackageToTSub__mPackage____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tSub__typeGraph____model.setName(tSub__typeGraph____model_name_prime);
		mPackageToTSub__tSub____target.setName(mPackageToTSub__tSub____target_name_prime);
		tParent__tSub____subpackages.setName(tParent__tSub____subpackages_name_prime);
		tSub__tParent____parent.setName(tSub__tParent____parent_name_prime);
		mPackage__mParentPackage____package.setName(mPackage__mParentPackage____package_name_prime);
		mParentPackage__mPackage____ownedPackages.setName(mParentPackage__mPackage____ownedPackages_name_prime);
		mPackageToTSub__mPackage____source.setName(mPackageToTSub__mPackage____source_name_prime);
		return new Object[] { ruleresult, tSub, tParent, typeGraph, mParentPackage, mPackageToTSub, mPackage,
				tSub__typeGraph____model, mPackageToTSub__tSub____target, tParent__tSub____subpackages,
				tSub__tParent____parent, mPackage__mParentPackage____package, mParentPackage__mPackage____ownedPackages,
				mPackageToTSub__mPackage____source };
	}

	public static final void pattern_SubPackageToPGPackage_11_5_registerobjects_expressionBBBBBBBBB(
			SubPackageToPGPackage _this, PerformRuleResult ruleresult, EObject tSub, EObject tParent,
			EObject mParentPackageToTParent, EObject typeGraph, EObject mParentPackage, EObject mPackageToTSub,
			EObject mPackage) {
		_this.registerObjects_BWD(ruleresult, tSub, tParent, mParentPackageToTParent, typeGraph, mParentPackage,
				mPackageToTSub, mPackage);

	}

	public static final PerformRuleResult pattern_SubPackageToPGPackage_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_1_preparereturnvalue_bindingFB(
			SubPackageToPGPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_1_preparereturnvalue_blackFBB(EClass eClass,
			SubPackageToPGPackage _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_1_preparereturnvalue_bindingAndBlackFFB(
			SubPackageToPGPackage _this) {
		Object[] result_pattern_SubPackageToPGPackage_12_1_preparereturnvalue_binding = pattern_SubPackageToPGPackage_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SubPackageToPGPackage_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SubPackageToPGPackage_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_12_1_preparereturnvalue_black = pattern_SubPackageToPGPackage_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SubPackageToPGPackage_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SubPackageToPGPackage_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SubPackageToPGPackage";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tSub");
		EObject _localVariable_1 = match.getObject("tParent");
		EObject _localVariable_2 = match.getObject("typeGraph");
		EObject tmpTSub = _localVariable_0;
		EObject tmpTParent = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		if (tmpTSub instanceof TPackage) {
			TPackage tSub = (TPackage) tmpTSub;
			if (tmpTParent instanceof TPackage) {
				TPackage tParent = (TPackage) tmpTParent;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					return new Object[] { tSub, tParent, typeGraph, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_12_2_corematch_blackBBFBFB(TPackage tSub,
			TPackage tParent, TypeGraph typeGraph, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tParent.equals(tSub)) {
			for (PackageToTPackage mParentPackageToTParent : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tParent, PackageToTPackage.class, "target")) {
				org.eclipse.modisco.java.Package mParentPackage = mParentPackageToTParent.getSource();
				if (mParentPackage != null) {
					_result.add(
							new Object[] { tSub, tParent, mParentPackageToTParent, typeGraph, mParentPackage, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_12_3_findcontext_blackBBBBB(TPackage tSub,
			TPackage tParent, PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tParent.equals(tSub)) {
			if (typeGraph.equals(tSub.getModel())) {
				if (typeGraph.equals(tParent.getModel())) {
					if (tParent.equals(mParentPackageToTParent.getTarget())) {
						if (mParentPackage.equals(mParentPackageToTParent.getSource())) {
							if (tParent.getSubpackages().contains(tSub)) {
								_result.add(new Object[] { tSub, tParent, mParentPackageToTParent, typeGraph,
										mParentPackage });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_3_findcontext_greenBBBBBFFFFFFF(TPackage tSub,
			TPackage tParent, PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tSub__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParent__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackageToTParent__tParent____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackageToTParent__mParentPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParent__tSub____subpackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSub__tParent____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tSub__typeGraph____model_name_prime = "model";
		String tParent__typeGraph____model_name_prime = "model";
		String mParentPackageToTParent__tParent____target_name_prime = "target";
		String mParentPackageToTParent__mParentPackage____source_name_prime = "source";
		String tParent__tSub____subpackages_name_prime = "subpackages";
		String tSub__tParent____parent_name_prime = "parent";
		isApplicableMatch.getAllContextElements().add(tSub);
		isApplicableMatch.getAllContextElements().add(tParent);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(mParentPackage);
		tSub__typeGraph____model.setSrc(tSub);
		tSub__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tSub__typeGraph____model);
		tParent__typeGraph____model.setSrc(tParent);
		tParent__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tParent__typeGraph____model);
		mParentPackageToTParent__tParent____target.setSrc(mParentPackageToTParent);
		mParentPackageToTParent__tParent____target.setTrg(tParent);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent__tParent____target);
		mParentPackageToTParent__mParentPackage____source.setSrc(mParentPackageToTParent);
		mParentPackageToTParent__mParentPackage____source.setTrg(mParentPackage);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent__mParentPackage____source);
		tParent__tSub____subpackages.setSrc(tParent);
		tParent__tSub____subpackages.setTrg(tSub);
		isApplicableMatch.getAllContextElements().add(tParent__tSub____subpackages);
		tSub__tParent____parent.setSrc(tSub);
		tSub__tParent____parent.setTrg(tParent);
		isApplicableMatch.getAllContextElements().add(tSub__tParent____parent);
		tSub__typeGraph____model.setName(tSub__typeGraph____model_name_prime);
		tParent__typeGraph____model.setName(tParent__typeGraph____model_name_prime);
		mParentPackageToTParent__tParent____target.setName(mParentPackageToTParent__tParent____target_name_prime);
		mParentPackageToTParent__mParentPackage____source
				.setName(mParentPackageToTParent__mParentPackage____source_name_prime);
		tParent__tSub____subpackages.setName(tParent__tSub____subpackages_name_prime);
		tSub__tParent____parent.setName(tSub__tParent____parent_name_prime);
		return new Object[] { tSub, tParent, mParentPackageToTParent, typeGraph, mParentPackage, isApplicableMatch,
				tSub__typeGraph____model, tParent__typeGraph____model, mParentPackageToTParent__tParent____target,
				mParentPackageToTParent__mParentPackage____source, tParent__tSub____subpackages,
				tSub__tParent____parent };
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_4_solveCSP_bindingFBBBBBBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch, TPackage tSub, TPackage tParent,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tSub, tParent,
				mParentPackageToTParent, typeGraph, mParentPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tSub, tParent, mParentPackageToTParent, typeGraph,
					mParentPackage };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch, TPackage tSub, TPackage tParent,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage) {
		Object[] result_pattern_SubPackageToPGPackage_12_4_solveCSP_binding = pattern_SubPackageToPGPackage_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tSub, tParent, mParentPackageToTParent, typeGraph, mParentPackage);
		if (result_pattern_SubPackageToPGPackage_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_12_4_solveCSP_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_12_4_solveCSP_black = pattern_SubPackageToPGPackage_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tSub, tParent, mParentPackageToTParent, typeGraph,
						mParentPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_SubPackageToPGPackage_12_5_checkCSP_expressionFBB(SubPackageToPGPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SubPackageToPGPackage";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SubPackageToPGPackage_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_20_1_preparereturnvalue_bindingFB(
			SubPackageToPGPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SubPackageToPGPackage _this) {
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

	public static final Object[] pattern_SubPackageToPGPackage_20_1_preparereturnvalue_bindingAndBlackFFBF(
			SubPackageToPGPackage _this) {
		Object[] result_pattern_SubPackageToPGPackage_20_1_preparereturnvalue_binding = pattern_SubPackageToPGPackage_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SubPackageToPGPackage_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SubPackageToPGPackage_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_20_1_preparereturnvalue_black = pattern_SubPackageToPGPackage_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SubPackageToPGPackage_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SubPackageToPGPackage_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SubPackageToPGPackage_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_black_nac_0BB(TPackage tSub,
			TypeGraph typeGraph) {
		for (TypeGraph __DEC_tSub_packages_915054 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tSub, TypeGraph.class, "packages")) {
			if (!typeGraph.equals(__DEC_tSub_packages_915054)) {
				return new Object[] { tSub, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_black_nac_1BB(
			TypeGraph typeGraph, TPackage tSub) {
		if (typeGraph.getPackages().contains(tSub)) {
			return new Object[] { typeGraph, tSub };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_model) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTSub = _edge_model.getSrc();
		if (tmpTSub instanceof TPackage) {
			TPackage tSub = (TPackage) tmpTSub;
			EObject tmpTypeGraph = _edge_model.getTrg();
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (typeGraph.equals(tSub.getModel())) {
					TPackage tParent = tSub.getParent();
					if (tParent != null) {
						if (!tParent.equals(tSub)) {
							if (typeGraph.equals(tParent.getModel())) {
								if (pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_black_nac_0BB(tSub,
										typeGraph) == null) {
									if (pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_black_nac_1BB(typeGraph,
											tSub) == null) {
										_result.add(new Object[] { tSub, tParent, typeGraph, _edge_model });
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

	public static final Object[] pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SubPackageToPGPackage_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			SubPackageToPGPackage _this, Match match, TPackage tSub, TPackage tParent, TypeGraph typeGraph) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tSub, tParent, typeGraph);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SubPackageToPGPackage_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SubPackageToPGPackage _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SubPackageToPGPackage_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_21_1_preparereturnvalue_bindingFB(
			SubPackageToPGPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SubPackageToPGPackage _this) {
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

	public static final Object[] pattern_SubPackageToPGPackage_21_1_preparereturnvalue_bindingAndBlackFFBF(
			SubPackageToPGPackage _this) {
		Object[] result_pattern_SubPackageToPGPackage_21_1_preparereturnvalue_binding = pattern_SubPackageToPGPackage_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SubPackageToPGPackage_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SubPackageToPGPackage_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_21_1_preparereturnvalue_black = pattern_SubPackageToPGPackage_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SubPackageToPGPackage_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SubPackageToPGPackage_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SubPackageToPGPackage_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_black_nac_0B(
			org.eclipse.modisco.java.Package mPackage) {
		Model __DEC_mPackage_model_259137 = mPackage.getModel();
		if (__DEC_mPackage_model_259137 != null) {
			return new Object[] { mPackage };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_package) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMPackage = _edge_package.getSrc();
		if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
			EObject tmpMParentPackage = _edge_package.getTrg();
			if (tmpMParentPackage instanceof org.eclipse.modisco.java.Package) {
				org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) tmpMParentPackage;
				if (!mPackage.equals(mParentPackage)) {
					if (mParentPackage.equals(mPackage.getPackage())) {
						if (pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_black_nac_0B(mPackage) == null) {
							_result.add(new Object[] { mParentPackage, mPackage, _edge_package });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SubPackageToPGPackage_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			SubPackageToPGPackage _this, Match match, org.eclipse.modisco.java.Package mParentPackage,
			org.eclipse.modisco.java.Package mPackage) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mParentPackage, mPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SubPackageToPGPackage_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SubPackageToPGPackage _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SubPackageToPGPackage_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_1_prepare_blackB(SubPackageToPGPackage _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_bindingFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tSub");
		EObject _localVariable_1 = targetMatch.getObject("tParent");
		EObject _localVariable_2 = targetMatch.getObject("typeGraph");
		EObject _localVariable_3 = sourceMatch.getObject("mParentPackage");
		EObject _localVariable_4 = sourceMatch.getObject("mPackage");
		EObject tmpTSub = _localVariable_0;
		EObject tmpTParent = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpMParentPackage = _localVariable_3;
		EObject tmpMPackage = _localVariable_4;
		if (tmpTSub instanceof TPackage) {
			TPackage tSub = (TPackage) tmpTSub;
			if (tmpTParent instanceof TPackage) {
				TPackage tParent = (TPackage) tmpTParent;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpMParentPackage instanceof org.eclipse.modisco.java.Package) {
						org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) tmpMParentPackage;
						if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
							org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
							return new Object[] { tSub, tParent, typeGraph, mParentPackage, mPackage, targetMatch,
									sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_blackBBBBBBB(TPackage tSub,
			TPackage tParent, TypeGraph typeGraph, org.eclipse.modisco.java.Package mParentPackage,
			org.eclipse.modisco.java.Package mPackage, Match sourceMatch, Match targetMatch) {
		if (!tParent.equals(tSub)) {
			if (!mPackage.equals(mParentPackage)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { tSub, tParent, typeGraph, mParentPackage, mPackage, sourceMatch,
							targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_binding = pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_bindingFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_binding != null) {
			TPackage tSub = (TPackage) result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_binding[0];
			TPackage tParent = (TPackage) result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_binding[3];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_black = pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_blackBBBBBBB(
					tSub, tParent, typeGraph, mParentPackage, mPackage, sourceMatch, targetMatch);
			if (result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tSub, tParent, typeGraph, mParentPackage, mPackage, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_3_solvecsp_bindingFBBBBBBBB(
			SubPackageToPGPackage _this, TPackage tSub, TPackage tParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage, org.eclipse.modisco.java.Package mPackage,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(tSub, tParent, typeGraph, mParentPackage, mPackage,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, tSub, tParent, typeGraph, mParentPackage, mPackage, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			SubPackageToPGPackage _this, TPackage tSub, TPackage tParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage, org.eclipse.modisco.java.Package mPackage,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SubPackageToPGPackage_24_3_solvecsp_binding = pattern_SubPackageToPGPackage_24_3_solvecsp_bindingFBBBBBBBB(
				_this, tSub, tParent, typeGraph, mParentPackage, mPackage, sourceMatch, targetMatch);
		if (result_pattern_SubPackageToPGPackage_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_24_3_solvecsp_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_24_3_solvecsp_black = pattern_SubPackageToPGPackage_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tSub, tParent, typeGraph, mParentPackage, mPackage, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_SubPackageToPGPackage_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_24_5_matchcorrcontext_blackBFBBB(
			TPackage tParent, org.eclipse.modisco.java.Package mParentPackage, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (PackageToTPackage mParentPackageToTParent : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tParent, PackageToTPackage.class, "target")) {
				if (mParentPackage.equals(mParentPackageToTParent.getSource())) {
					_result.add(new Object[] { tParent, mParentPackageToTParent, mParentPackage, sourceMatch,
							targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_5_matchcorrcontext_greenBBBF(
			PackageToTPackage mParentPackageToTParent, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "SubPackageToPGPackage";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mParentPackageToTParent);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mParentPackageToTParent, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_6_createcorrespondence_blackBBBBBB(TPackage tSub,
			TPackage tParent, TypeGraph typeGraph, org.eclipse.modisco.java.Package mParentPackage,
			org.eclipse.modisco.java.Package mPackage, CCMatch ccMatch) {
		if (!tParent.equals(tSub)) {
			if (!mPackage.equals(mParentPackage)) {
				return new Object[] { tSub, tParent, typeGraph, mParentPackage, mPackage, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_6_createcorrespondence_greenBFBB(TPackage tSub,
			org.eclipse.modisco.java.Package mPackage, CCMatch ccMatch) {
		PackageToTPackage mPackageToTSub = PmFactory.eINSTANCE.createPackageToTPackage();
		mPackageToTSub.setTarget(tSub);
		mPackageToTSub.setSource(mPackage);
		ccMatch.getCreateCorr().add(mPackageToTSub);
		return new Object[] { tSub, mPackageToTSub, mPackage, ccMatch };
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "SubPackageToPGPackage";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_SubPackageToPGPackage_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_27_1_matchtggpattern_black_nac_0B(
			org.eclipse.modisco.java.Package mPackage) {
		Model __DEC_mPackage_model_529832 = mPackage.getModel();
		if (__DEC_mPackage_model_529832 != null) {
			return new Object[] { mPackage };
		}

		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_27_1_matchtggpattern_blackBB(
			org.eclipse.modisco.java.Package mParentPackage, org.eclipse.modisco.java.Package mPackage) {
		if (!mPackage.equals(mParentPackage)) {
			if (mParentPackage.equals(mPackage.getPackage())) {
				if (pattern_SubPackageToPGPackage_27_1_matchtggpattern_black_nac_0B(mPackage) == null) {
					return new Object[] { mParentPackage, mPackage };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_SubPackageToPGPackage_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SubPackageToPGPackage_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_28_1_matchtggpattern_black_nac_0BB(TPackage tSub,
			TypeGraph typeGraph) {
		for (TypeGraph __DEC_tSub_packages_773328 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tSub, TypeGraph.class, "packages")) {
			if (!typeGraph.equals(__DEC_tSub_packages_773328)) {
				return new Object[] { tSub, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_28_1_matchtggpattern_black_nac_1BB(TypeGraph typeGraph,
			TPackage tSub) {
		if (typeGraph.getPackages().contains(tSub)) {
			return new Object[] { typeGraph, tSub };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_28_1_matchtggpattern_blackBBB(TPackage tSub,
			TPackage tParent, TypeGraph typeGraph) {
		if (!tParent.equals(tSub)) {
			if (typeGraph.equals(tSub.getModel())) {
				if (typeGraph.equals(tParent.getModel())) {
					if (tParent.getSubpackages().contains(tSub)) {
						if (pattern_SubPackageToPGPackage_28_1_matchtggpattern_black_nac_0BB(tSub, typeGraph) == null) {
							if (pattern_SubPackageToPGPackage_28_1_matchtggpattern_black_nac_1BB(typeGraph,
									tSub) == null) {
								return new Object[] { tSub, tParent, typeGraph };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_SubPackageToPGPackage_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SubPackageToPGPackage_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_1_createresult_blackB(SubPackageToPGPackage _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TPackage tParent) {
		if (ruleResult.getTargetObjects().contains(tParent)) {
			return new Object[] { ruleResult, tParent };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, PackageToTPackage mParentPackageToTParent) {
		if (ruleResult.getCorrObjects().contains(mParentPackageToTParent)) {
			return new Object[] { ruleResult, mParentPackageToTParent };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.modisco.java.Package mParentPackage) {
		if (ruleResult.getSourceObjects().contains(mParentPackage)) {
			return new Object[] { ruleResult, mParentPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_29_2_isapplicablecore_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mParentPackageToTParentList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMParentPackageToTParent : mParentPackageToTParentList.getEntryObjects()) {
				if (tmpMParentPackageToTParent instanceof PackageToTPackage) {
					PackageToTPackage mParentPackageToTParent = (PackageToTPackage) tmpMParentPackageToTParent;
					TPackage tParent = mParentPackageToTParent.getTarget();
					if (tParent != null) {
						org.eclipse.modisco.java.Package mParentPackage = mParentPackageToTParent.getSource();
						if (mParentPackage != null) {
							TypeGraph typeGraph = tParent.getModel();
							if (typeGraph != null) {
								if (pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_2BB(ruleResult,
										mParentPackageToTParent) == null) {
									if (pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											tParent) == null) {
										if (pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_3BB(
												ruleResult, mParentPackage) == null) {
											if (pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_1BB(
													ruleResult, typeGraph) == null) {
												_result.add(new Object[] { mParentPackageToTParentList, tParent,
														typeGraph, mParentPackageToTParent, mParentPackage,
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
		}
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_3_solveCSP_bindingFBBBBBBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch, TPackage tParent,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tParent, mParentPackageToTParent,
				typeGraph, mParentPackage, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tParent, mParentPackageToTParent, typeGraph,
					mParentPackage, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_3_solveCSP_bindingAndBlackFBBBBBBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch, TPackage tParent,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SubPackageToPGPackage_29_3_solveCSP_binding = pattern_SubPackageToPGPackage_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tParent, mParentPackageToTParent, typeGraph, mParentPackage, ruleResult);
		if (result_pattern_SubPackageToPGPackage_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_29_3_solveCSP_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_29_3_solveCSP_black = pattern_SubPackageToPGPackage_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tParent, mParentPackageToTParent, typeGraph,
						mParentPackage, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_SubPackageToPGPackage_29_4_checkCSP_expressionFBB(SubPackageToPGPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_5_checknacs_blackBBBB(TPackage tParent,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage) {
		return new Object[] { tParent, mParentPackageToTParent, typeGraph, mParentPackage };
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_6_perform_blackBBBBB(TPackage tParent,
			PackageToTPackage mParentPackageToTParent, TypeGraph typeGraph,
			org.eclipse.modisco.java.Package mParentPackage, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tParent, mParentPackageToTParent, typeGraph, mParentPackage, ruleResult };
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_6_perform_greenFBBBFFBB(TPackage tParent,
			TypeGraph typeGraph, org.eclipse.modisco.java.Package mParentPackage, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		TPackage tSub = BasicFactory.eINSTANCE.createTPackage();
		PackageToTPackage mPackageToTSub = PmFactory.eINSTANCE.createPackageToTPackage();
		org.eclipse.modisco.java.Package mPackage = JavaFactory.eINSTANCE.createPackage();
		Object _localVariable_0 = csp.getValue("tSub", "tName");
		Object _localVariable_1 = csp.getValue("mPackage", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		tSub.setModel(typeGraph);
		tParent.getSubpackages().add(tSub);
		ruleResult.getTargetObjects().add(tSub);
		mPackageToTSub.setTarget(tSub);
		ruleResult.getCorrObjects().add(mPackageToTSub);
		mPackage.setPackage(mParentPackage);
		mPackageToTSub.setSource(mPackage);
		ruleResult.getSourceObjects().add(mPackage);
		String tSub_tName_prime = (String) _localVariable_0;
		String mPackage_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		tSub.setTName(tSub_tName_prime);
		mPackage.setName(mPackage_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tSub, tParent, typeGraph, mParentPackage, mPackageToTSub, mPackage, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_SubPackageToPGPackage_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SubPackageToPGPackageImpl
