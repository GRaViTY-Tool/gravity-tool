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
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.Package mSubPackage,
			org.eclipse.modisco.java.Package mParentPackage) {

		Object[] result1_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_0_1_initialbindings_blackBBBB(this, match, mSubPackage, mParentPackage);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mSubPackage] = " + mSubPackage + ", " + "[mParentPackage] = "
					+ mParentPackage + ".");
		}

		Object[] result2_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mSubPackage,
						mParentPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mSubPackage] = " + mSubPackage + ", " + "[mParentPackage] = "
					+ mParentPackage + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_0_4_collectelementstobetranslated_blackBBB(match, mSubPackage,
							mParentPackage);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mSubPackage] = " + mSubPackage + ", " + "[mParentPackage] = " + mParentPackage + ".");
			}
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_0_4_collectelementstobetranslated_greenBBBFF(match,
					mSubPackage, mParentPackage);
			//nothing EMoflonEdge mParentPackage__mSubPackage____ownedPackages = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mSubPackage__mParentPackage____package = (EMoflonEdge) result4_green[4];

			Object[] result5_black = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_0_5_collectcontextelements_blackBBB(match, mSubPackage,
							mParentPackage);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mSubPackage] = " + mSubPackage + ", " + "[mParentPackage] = " + mParentPackage + ".");
			}
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_0_5_collectcontextelements_greenBB(match,
					mParentPackage);

			// 
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_0_6_registerobjectstomatch_expressionBBBB(this,
					match, mSubPackage, mParentPackage);
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
		org.eclipse.modisco.java.Package mSubPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[0];
		TPackage tParentPackage = (TPackage) result1_bindingAndBlack[1];
		org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[2];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[3];
		PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_1_1_performtransformation_greenBBFFBB(mSubPackage, tParentPackage,
						typeGraph, csp);
		PackageToTPackage mPackageToTSub = (PackageToTPackage) result1_green[2];
		TPackage tSubPackage = (TPackage) result1_green[3];

		Object[] result2_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_1_2_collecttranslatedelements_blackBBB(mSubPackage, mPackageToTSub,
						tSubPackage);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mSubPackage] = " + mSubPackage
					+ ", " + "[mPackageToTSub] = " + mPackageToTSub + ", " + "[tSubPackage] = " + tSubPackage + ".");
		}
		Object[] result2_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_1_2_collecttranslatedelements_greenFBBB(mSubPackage, mPackageToTSub,
						tSubPackage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, mSubPackage,
						tParentPackage, mPackageToTSub, tSubPackage, mParentPackage, typeGraph,
						mParentPackageToTParent);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mSubPackage] = " + mSubPackage + ", " + "[tParentPackage] = " + tParentPackage + ", "
					+ "[mPackageToTSub] = " + mPackageToTSub + ", " + "[tSubPackage] = " + tSubPackage + ", "
					+ "[mParentPackage] = " + mParentPackage + ", " + "[typeGraph] = " + typeGraph + ", "
					+ "[mParentPackageToTParent] = " + mParentPackageToTParent + ".");
		}
		SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult,
				mSubPackage, tParentPackage, mPackageToTSub, tSubPackage, mParentPackage, typeGraph);
		//nothing EMoflonEdge mPackageToTSub__mSubPackage____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tSubPackage__typeGraph____model = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mPackageToTSub__tSubPackage____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mParentPackage__mSubPackage____ownedPackages = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mSubPackage__mParentPackage____package = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tParentPackage__tSubPackage____subpackages = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tSubPackage__tParentPackage____parent = (EMoflonEdge) result3_green[13];

		// 
		// 
		SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_1_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, mSubPackage, tParentPackage, mPackageToTSub, tSubPackage, mParentPackage, typeGraph,
				mParentPackageToTParent);
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
		org.eclipse.modisco.java.Package mSubPackage = (org.eclipse.modisco.java.Package) result2_binding[0];
		org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result2_binding[1];
		for (Object[] result2_black : SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_2_2_corematch_blackBFBFB(mSubPackage, mParentPackage, match)) {
			TPackage tParentPackage = (TPackage) result2_black[1];
			PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result2_black[3];
			// ForEach 
			for (Object[] result3_black : SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_2_3_findcontext_blackBBBFB(mSubPackage, tParentPackage,
							mParentPackage, mParentPackageToTParent)) {
				TypeGraph typeGraph = (TypeGraph) result3_black[3];
				Object[] result3_green = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_2_3_findcontext_greenBBBBBFFFFFF(mSubPackage, tParentPackage,
								mParentPackage, typeGraph, mParentPackageToTParent);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge mParentPackage__mSubPackage____ownedPackages = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mSubPackage__mParentPackage____package = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge tParentPackage__typeGraph____model = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mParentPackageToTParent__mParentPackage____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mParentPackageToTParent__tParentPackage____target = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								mSubPackage, tParentPackage, mParentPackage, typeGraph, mParentPackageToTParent);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mSubPackage] = " + mSubPackage
							+ ", " + "[tParentPackage] = " + tParentPackage + ", " + "[mParentPackage] = "
							+ mParentPackage + ", " + "[typeGraph] = " + typeGraph + ", "
							+ "[mParentPackageToTParent] = " + mParentPackageToTParent + ".");
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
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.modisco.java.Package mSubPackage,
			org.eclipse.modisco.java.Package mParentPackage) {
		match.registerObject("mSubPackage", mSubPackage);
		match.registerObject("mParentPackage", mParentPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.modisco.java.Package mSubPackage,
			org.eclipse.modisco.java.Package mParentPackage) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package mSubPackage, TPackage tParentPackage,
			org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph,
			PackageToTPackage mParentPackageToTParent) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mSubPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mSubPackage.name", true, csp);
		var_mSubPackage_name.setValue(mSubPackage.getName());
		var_mSubPackage_name.setType("String");

		// Create unbound variables
		Variable var_tSubPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSubPackage.tName", csp);
		var_tSubPackage_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mSubPackage_name, var_tSubPackage_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mSubPackage", mSubPackage);
		isApplicableMatch.registerObject("tParentPackage", tParentPackage);
		isApplicableMatch.registerObject("mParentPackage", mParentPackage);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("mParentPackageToTParent", mParentPackageToTParent);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mSubPackage, EObject tParentPackage,
			EObject mPackageToTSub, EObject tSubPackage, EObject mParentPackage, EObject typeGraph,
			EObject mParentPackageToTParent) {
		ruleresult.registerObject("mSubPackage", mSubPackage);
		ruleresult.registerObject("tParentPackage", tParentPackage);
		ruleresult.registerObject("mPackageToTSub", mPackageToTSub);
		ruleresult.registerObject("tSubPackage", tSubPackage);
		ruleresult.registerObject("mParentPackage", mParentPackage);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("mParentPackageToTParent", mParentPackageToTParent);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mSubPackage").eClass())
				.equals("java.Package.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TPackage tParentPackage, TPackage tSubPackage, TypeGraph typeGraph) {

		Object[] result1_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_10_1_initialbindings_blackBBBBB(this, match, tParentPackage, tSubPackage,
						typeGraph);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tParentPackage] = " + tParentPackage + ", " + "[tSubPackage] = "
					+ tSubPackage + ", " + "[typeGraph] = " + typeGraph + ".");
		}

		Object[] result2_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tParentPackage,
						tSubPackage, typeGraph);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tParentPackage] = " + tParentPackage + ", " + "[tSubPackage] = "
					+ tSubPackage + ", " + "[typeGraph] = " + typeGraph + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_10_4_collectelementstobetranslated_blackBBBB(match, tParentPackage,
							tSubPackage, typeGraph);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tParentPackage] = " + tParentPackage + ", " + "[tSubPackage] = " + tSubPackage + ", "
						+ "[typeGraph] = " + typeGraph + ".");
			}
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_10_4_collectelementstobetranslated_greenBBBBFFF(
					match, tParentPackage, tSubPackage, typeGraph);
			//nothing EMoflonEdge tSubPackage__typeGraph____model = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tParentPackage__tSubPackage____subpackages = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tSubPackage__tParentPackage____parent = (EMoflonEdge) result4_green[6];

			Object[] result5_black = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_10_5_collectcontextelements_blackBBBB(match, tParentPackage,
							tSubPackage, typeGraph);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tParentPackage] = " + tParentPackage + ", " + "[tSubPackage] = " + tSubPackage + ", "
						+ "[typeGraph] = " + typeGraph + ".");
			}
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_10_5_collectcontextelements_greenBBBF(match,
					tParentPackage, typeGraph);
			//nothing EMoflonEdge tParentPackage__typeGraph____model = (EMoflonEdge) result5_green[3];

			// 
			SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_10_6_registerobjectstomatch_expressionBBBBB(this,
					match, tParentPackage, tSubPackage, typeGraph);
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
		TPackage tParentPackage = (TPackage) result1_bindingAndBlack[0];
		TPackage tSubPackage = (TPackage) result1_bindingAndBlack[1];
		org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[2];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[3];
		PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_11_1_performtransformation_greenFFBBB(tSubPackage, mParentPackage, csp);
		org.eclipse.modisco.java.Package mSubPackage = (org.eclipse.modisco.java.Package) result1_green[0];
		PackageToTPackage mPackageToTSub = (PackageToTPackage) result1_green[1];

		Object[] result2_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_11_2_collecttranslatedelements_blackBBB(mSubPackage, mPackageToTSub,
						tSubPackage);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mSubPackage] = " + mSubPackage
					+ ", " + "[mPackageToTSub] = " + mPackageToTSub + ", " + "[tSubPackage] = " + tSubPackage + ".");
		}
		Object[] result2_green = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_11_2_collecttranslatedelements_greenFBBB(mSubPackage, mPackageToTSub,
						tSubPackage);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, mSubPackage,
						tParentPackage, mPackageToTSub, tSubPackage, mParentPackage, typeGraph,
						mParentPackageToTParent);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mSubPackage] = " + mSubPackage + ", " + "[tParentPackage] = " + tParentPackage + ", "
					+ "[mPackageToTSub] = " + mPackageToTSub + ", " + "[tSubPackage] = " + tSubPackage + ", "
					+ "[mParentPackage] = " + mParentPackage + ", " + "[typeGraph] = " + typeGraph + ", "
					+ "[mParentPackageToTParent] = " + mParentPackageToTParent + ".");
		}
		SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult,
				mSubPackage, tParentPackage, mPackageToTSub, tSubPackage, mParentPackage, typeGraph);
		//nothing EMoflonEdge mPackageToTSub__mSubPackage____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tSubPackage__typeGraph____model = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mPackageToTSub__tSubPackage____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mParentPackage__mSubPackage____ownedPackages = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mSubPackage__mParentPackage____package = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tParentPackage__tSubPackage____subpackages = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tSubPackage__tParentPackage____parent = (EMoflonEdge) result3_green[13];

		// 
		// 
		SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_11_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, mSubPackage, tParentPackage, mPackageToTSub, tSubPackage, mParentPackage, typeGraph,
				mParentPackageToTParent);
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
		TPackage tParentPackage = (TPackage) result2_binding[0];
		TPackage tSubPackage = (TPackage) result2_binding[1];
		TypeGraph typeGraph = (TypeGraph) result2_binding[2];
		for (Object[] result2_black : SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_12_2_corematch_blackBBFBFB(tParentPackage, tSubPackage, typeGraph,
						match)) {
			org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result2_black[2];
			PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result2_black[4];
			// ForEach 
			for (Object[] result3_black : SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_12_3_findcontext_blackBBBBB(tParentPackage, tSubPackage,
							mParentPackage, typeGraph, mParentPackageToTParent)) {
				Object[] result3_green = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_12_3_findcontext_greenBBBBBFFFFFFF(tParentPackage, tSubPackage,
								mParentPackage, typeGraph, mParentPackageToTParent);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge tSubPackage__typeGraph____model = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge tParentPackage__tSubPackage____subpackages = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge tSubPackage__tParentPackage____parent = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tParentPackage__typeGraph____model = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mParentPackageToTParent__mParentPackage____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mParentPackageToTParent__tParentPackage____target = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								tParentPackage, tSubPackage, mParentPackage, typeGraph, mParentPackageToTParent);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tParentPackage] = "
							+ tParentPackage + ", " + "[tSubPackage] = " + tSubPackage + ", " + "[mParentPackage] = "
							+ mParentPackage + ", " + "[typeGraph] = " + typeGraph + ", "
							+ "[mParentPackageToTParent] = " + mParentPackageToTParent + ".");
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
	public void registerObjectsToMatch_BWD(Match match, TPackage tParentPackage, TPackage tSubPackage,
			TypeGraph typeGraph) {
		match.registerObject("tParentPackage", tParentPackage);
		match.registerObject("tSubPackage", tSubPackage);
		match.registerObject("typeGraph", typeGraph);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TPackage tParentPackage, TPackage tSubPackage,
			TypeGraph typeGraph) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TPackage tParentPackage,
			TPackage tSubPackage, org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph,
			PackageToTPackage mParentPackageToTParent) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tSubPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSubPackage.tName", true, csp);
		var_tSubPackage_tName.setValue(tSubPackage.getTName());
		var_tSubPackage_tName.setType("String");

		// Create unbound variables
		Variable var_mSubPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mSubPackage.name", csp);
		var_mSubPackage_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mSubPackage_name, var_tSubPackage_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tParentPackage", tParentPackage);
		isApplicableMatch.registerObject("tSubPackage", tSubPackage);
		isApplicableMatch.registerObject("mParentPackage", mParentPackage);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("mParentPackageToTParent", mParentPackageToTParent);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mSubPackage, EObject tParentPackage,
			EObject mPackageToTSub, EObject tSubPackage, EObject mParentPackage, EObject typeGraph,
			EObject mParentPackageToTParent) {
		ruleresult.registerObject("mSubPackage", mSubPackage);
		ruleresult.registerObject("tParentPackage", tParentPackage);
		ruleresult.registerObject("mPackageToTSub", mPackageToTSub);
		ruleresult.registerObject("tSubPackage", tSubPackage);
		ruleresult.registerObject("mParentPackage", mParentPackage);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("mParentPackageToTParent", mParentPackageToTParent);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tSubPackage").eClass())
				.equals("basic.TPackage.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_250(EMoflonEdge _edge_model) {

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
			TPackage tParentPackage = (TPackage) result2_black[0];
			TPackage tSubPackage = (TPackage) result2_black[1];
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			Object[] result2_green = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tParentPackage, tSubPackage, typeGraph)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_260(EMoflonEdge _edge_ownedPackages) {

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
				.pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_blackFFB(_edge_ownedPackages)) {
			org.eclipse.modisco.java.Package mSubPackage = (org.eclipse.modisco.java.Package) result2_black[0];
			org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result2_black[1];
			Object[] result2_green = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, mSubPackage, mParentPackage)) {
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

		Variable var_tSubPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSubPackage", true, csp);
		var_tSubPackage_tName.setValue(__helper.getValue("tSubPackage", "tName"));
		var_tSubPackage_tName.setType("String");

		Variable var_mSubPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mSubPackage", true, csp);
		var_mSubPackage_name.setValue(__helper.getValue("mSubPackage", "name"));
		var_mSubPackage_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("SubPackageToPGPackage");
		eq0.solve(var_mSubPackage_name, var_tSubPackage_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tSubPackage_tName.setBound(false);
			eq0.solve(var_mSubPackage_name, var_tSubPackage_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tSubPackage", "tName", var_tSubPackage_tName.getValue());
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

		Variable var_tSubPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSubPackage", true, csp);
		var_tSubPackage_tName.setValue(__helper.getValue("tSubPackage", "tName"));
		var_tSubPackage_tName.setType("String");

		Variable var_mSubPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mSubPackage", true, csp);
		var_mSubPackage_name.setValue(__helper.getValue("mSubPackage", "name"));
		var_mSubPackage_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("SubPackageToPGPackage");
		eq0.solve(var_mSubPackage_name, var_tSubPackage_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mSubPackage_name.setBound(false);
			eq0.solve(var_mSubPackage_name, var_tSubPackage_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mSubPackage", "name", var_mSubPackage_name.getValue());
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
		org.eclipse.modisco.java.Package mSubPackage = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[0];
		TPackage tParentPackage = (TPackage) result2_bindingAndBlack[1];
		TPackage tSubPackage = (TPackage) result2_bindingAndBlack[2];
		org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[3];
		TypeGraph typeGraph = (TypeGraph) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, mSubPackage, tParentPackage,
						tSubPackage, mParentPackage, typeGraph, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mSubPackage] = " + mSubPackage + ", " + "[tParentPackage] = " + tParentPackage + ", "
					+ "[tSubPackage] = " + tSubPackage + ", " + "[mParentPackage] = " + mParentPackage + ", "
					+ "[typeGraph] = " + typeGraph + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_24_5_matchcorrcontext_blackBBFBB(tParentPackage, mParentPackage,
							sourceMatch, targetMatch)) {
				PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result5_black[2];
				Object[] result5_green = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_24_5_matchcorrcontext_greenBBBF(mParentPackageToTParent,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_24_6_createcorrespondence_blackBBBBBB(mSubPackage,
								tParentPackage, tSubPackage, mParentPackage, typeGraph, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mSubPackage] = "
							+ mSubPackage + ", " + "[tParentPackage] = " + tParentPackage + ", " + "[tSubPackage] = "
							+ tSubPackage + ", " + "[mParentPackage] = " + mParentPackage + ", " + "[typeGraph] = "
							+ typeGraph + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_24_6_createcorrespondence_greenBFBB(mSubPackage,
						tSubPackage, ccMatch);
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
	public CSP isApplicable_solveCsp_CC(org.eclipse.modisco.java.Package mSubPackage, TPackage tParentPackage,
			TPackage tSubPackage, org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mSubPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mSubPackage.name", true, csp);
		var_mSubPackage_name.setValue(mSubPackage.getName());
		var_mSubPackage_name.setType("String");
		Variable var_tSubPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSubPackage.tName", true, csp);
		var_tSubPackage_tName.setValue(tSubPackage.getTName());
		var_tSubPackage_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mSubPackage_name, var_tSubPackage_tName);
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.Package mSubPackage,
			org.eclipse.modisco.java.Package mParentPackage) {// 
		Object[] result1_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_27_1_matchtggpattern_blackBB(mSubPackage, mParentPackage);
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
	public boolean checkDEC_BWD(TPackage tParentPackage, TPackage tSubPackage, TypeGraph typeGraph) {// 
		Object[] result1_black = SubPackageToPGPackageImpl
				.pattern_SubPackageToPGPackage_28_1_matchtggpattern_blackBBB(tParentPackage, tSubPackage, typeGraph);
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
			TPackage tParentPackage = (TPackage) result2_black[1];
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result2_black[3];
			org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result2_black[4];

			Object[] result3_bindingAndBlack = SubPackageToPGPackageImpl
					.pattern_SubPackageToPGPackage_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
							tParentPackage, mParentPackage, typeGraph, mParentPackageToTParent, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tParentPackage] = " + tParentPackage
						+ ", " + "[mParentPackage] = " + mParentPackage + ", " + "[typeGraph] = " + typeGraph + ", "
						+ "[mParentPackageToTParent] = " + mParentPackageToTParent + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = SubPackageToPGPackageImpl
						.pattern_SubPackageToPGPackage_29_5_checknacs_blackBBBB(tParentPackage, mParentPackage,
								typeGraph, mParentPackageToTParent);
				if (result5_black != null) {

					Object[] result6_black = SubPackageToPGPackageImpl
							.pattern_SubPackageToPGPackage_29_6_perform_blackBBBBB(tParentPackage, mParentPackage,
									typeGraph, mParentPackageToTParent, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tParentPackage] = "
								+ tParentPackage + ", " + "[mParentPackage] = " + mParentPackage + ", "
								+ "[typeGraph] = " + typeGraph + ", " + "[mParentPackageToTParent] = "
								+ mParentPackageToTParent + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					SubPackageToPGPackageImpl.pattern_SubPackageToPGPackage_29_6_perform_greenFBFFBBBB(tParentPackage,
							mParentPackage, typeGraph, ruleResult, csp);
					//nothing org.eclipse.modisco.java.Package mSubPackage = (org.eclipse.modisco.java.Package) result6_green[0];
					//nothing PackageToTPackage mPackageToTSub = (PackageToTPackage) result6_green[2];
					//nothing TPackage tSubPackage = (TPackage) result6_green[3];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TPackage tParentPackage,
			org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph,
			PackageToTPackage mParentPackageToTParent, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mSubPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("mSubPackage.name", csp);
		var_mSubPackage_name.setType("String");
		Variable var_tSubPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tSubPackage.tName", csp);
		var_tSubPackage_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mSubPackage_name, var_tSubPackage_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tParentPackage", tParentPackage);
		isApplicableMatch.registerObject("mParentPackage", mParentPackage);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("mParentPackageToTParent", mParentPackageToTParent);
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
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGE_TPACKAGE_PACKAGE_TYPEGRAPH_PACKAGETOTPACKAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (TPackage) arguments.get(2),
					(org.eclipse.modisco.java.Package) arguments.get(3), (TypeGraph) arguments.get(4),
					(PackageToTPackage) arguments.get(5));
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
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TPACKAGE_TPACKAGE_PACKAGE_TYPEGRAPH_PACKAGETOTPACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TPackage) arguments.get(1),
					(TPackage) arguments.get(2), (org.eclipse.modisco.java.Package) arguments.get(3),
					(TypeGraph) arguments.get(4), (PackageToTPackage) arguments.get(5));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_250__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_250((EMoflonEdge) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_260__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_260((EMoflonEdge) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_SOLVE_CSP_CC__PACKAGE_TPACKAGE_TPACKAGE_PACKAGE_TYPEGRAPH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.modisco.java.Package) arguments.get(0),
					(TPackage) arguments.get(1), (TPackage) arguments.get(2),
					(org.eclipse.modisco.java.Package) arguments.get(3), (TypeGraph) arguments.get(4),
					(Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___CHECK_DEC_FWD__PACKAGE_PACKAGE:
			return checkDEC_FWD((org.eclipse.modisco.java.Package) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___CHECK_DEC_BWD__TPACKAGE_TPACKAGE_TYPEGRAPH:
			return checkDEC_BWD((TPackage) arguments.get(0), (TPackage) arguments.get(1), (TypeGraph) arguments.get(2));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGETOTPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (PackageToTPackage) arguments.get(1));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TPACKAGE_PACKAGE_TYPEGRAPH_PACKAGETOTPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TPackage) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2), (TypeGraph) arguments.get(3),
					(PackageToTPackage) arguments.get(4), (ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.SUB_PACKAGE_TO_PG_PACKAGE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_1_initialbindings_blackBBBB(
			SubPackageToPGPackage _this, Match match, org.eclipse.modisco.java.Package mSubPackage,
			org.eclipse.modisco.java.Package mParentPackage) {
		if (!mParentPackage.equals(mSubPackage)) {
			return new Object[] { _this, match, mSubPackage, mParentPackage };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_2_SolveCSP_bindingFBBBB(SubPackageToPGPackage _this,
			Match match, org.eclipse.modisco.java.Package mSubPackage,
			org.eclipse.modisco.java.Package mParentPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mSubPackage, mParentPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mSubPackage, mParentPackage };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_2_SolveCSP_bindingAndBlackFBBBB(
			SubPackageToPGPackage _this, Match match, org.eclipse.modisco.java.Package mSubPackage,
			org.eclipse.modisco.java.Package mParentPackage) {
		Object[] result_pattern_SubPackageToPGPackage_0_2_SolveCSP_binding = pattern_SubPackageToPGPackage_0_2_SolveCSP_bindingFBBBB(
				_this, match, mSubPackage, mParentPackage);
		if (result_pattern_SubPackageToPGPackage_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_0_2_SolveCSP_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_0_2_SolveCSP_black = pattern_SubPackageToPGPackage_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mSubPackage, mParentPackage };
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
			org.eclipse.modisco.java.Package mSubPackage, org.eclipse.modisco.java.Package mParentPackage) {
		if (!mParentPackage.equals(mSubPackage)) {
			return new Object[] { match, mSubPackage, mParentPackage };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			org.eclipse.modisco.java.Package mSubPackage, org.eclipse.modisco.java.Package mParentPackage) {
		EMoflonEdge mParentPackage__mSubPackage____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSubPackage__mParentPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mSubPackage);
		String mParentPackage__mSubPackage____ownedPackages_name_prime = "ownedPackages";
		String mSubPackage__mParentPackage____package_name_prime = "package";
		mParentPackage__mSubPackage____ownedPackages.setSrc(mParentPackage);
		mParentPackage__mSubPackage____ownedPackages.setTrg(mSubPackage);
		match.getToBeTranslatedEdges().add(mParentPackage__mSubPackage____ownedPackages);
		mSubPackage__mParentPackage____package.setSrc(mSubPackage);
		mSubPackage__mParentPackage____package.setTrg(mParentPackage);
		match.getToBeTranslatedEdges().add(mSubPackage__mParentPackage____package);
		mParentPackage__mSubPackage____ownedPackages.setName(mParentPackage__mSubPackage____ownedPackages_name_prime);
		mSubPackage__mParentPackage____package.setName(mSubPackage__mParentPackage____package_name_prime);
		return new Object[] { match, mSubPackage, mParentPackage, mParentPackage__mSubPackage____ownedPackages,
				mSubPackage__mParentPackage____package };
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.modisco.java.Package mSubPackage, org.eclipse.modisco.java.Package mParentPackage) {
		if (!mParentPackage.equals(mSubPackage)) {
			return new Object[] { match, mSubPackage, mParentPackage };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_0_5_collectcontextelements_greenBB(Match match,
			org.eclipse.modisco.java.Package mParentPackage) {
		match.getContextNodes().add(mParentPackage);
		return new Object[] { match, mParentPackage };
	}

	public static final void pattern_SubPackageToPGPackage_0_6_registerobjectstomatch_expressionBBBB(
			SubPackageToPGPackage _this, Match match, org.eclipse.modisco.java.Package mSubPackage,
			org.eclipse.modisco.java.Package mParentPackage) {
		_this.registerObjectsToMatch_FWD(match, mSubPackage, mParentPackage);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("mSubPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("tParentPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("mParentPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_4 = isApplicableMatch.getObject("mParentPackageToTParent");
		EObject tmpMSubPackage = _localVariable_0;
		EObject tmpTParentPackage = _localVariable_1;
		EObject tmpMParentPackage = _localVariable_2;
		EObject tmpTypeGraph = _localVariable_3;
		EObject tmpMParentPackageToTParent = _localVariable_4;
		if (tmpMSubPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mSubPackage = (org.eclipse.modisco.java.Package) tmpMSubPackage;
			if (tmpTParentPackage instanceof TPackage) {
				TPackage tParentPackage = (TPackage) tmpTParentPackage;
				if (tmpMParentPackage instanceof org.eclipse.modisco.java.Package) {
					org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) tmpMParentPackage;
					if (tmpTypeGraph instanceof TypeGraph) {
						TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
						if (tmpMParentPackageToTParent instanceof PackageToTPackage) {
							PackageToTPackage mParentPackageToTParent = (PackageToTPackage) tmpMParentPackageToTParent;
							return new Object[] { mSubPackage, tParentPackage, mParentPackage, typeGraph,
									mParentPackageToTParent, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_1_performtransformation_blackBBBBBFBB(
			org.eclipse.modisco.java.Package mSubPackage, TPackage tParentPackage,
			org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph,
			PackageToTPackage mParentPackageToTParent, SubPackageToPGPackage _this,
			IsApplicableMatch isApplicableMatch) {
		if (!mParentPackage.equals(mSubPackage)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { mSubPackage, tParentPackage, mParentPackage, typeGraph,
							mParentPackageToTParent, csp, _this, isApplicableMatch };
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
			org.eclipse.modisco.java.Package mSubPackage = (org.eclipse.modisco.java.Package) result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding[0];
			TPackage tParentPackage = (TPackage) result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding[1];
			org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding[2];
			TypeGraph typeGraph = (TypeGraph) result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding[3];
			PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result_pattern_SubPackageToPGPackage_1_1_performtransformation_binding[4];

			Object[] result_pattern_SubPackageToPGPackage_1_1_performtransformation_black = pattern_SubPackageToPGPackage_1_1_performtransformation_blackBBBBBFBB(
					mSubPackage, tParentPackage, mParentPackage, typeGraph, mParentPackageToTParent, _this,
					isApplicableMatch);
			if (result_pattern_SubPackageToPGPackage_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SubPackageToPGPackage_1_1_performtransformation_black[5];

				return new Object[] { mSubPackage, tParentPackage, mParentPackage, typeGraph, mParentPackageToTParent,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_1_performtransformation_greenBBFFBB(
			org.eclipse.modisco.java.Package mSubPackage, TPackage tParentPackage, TypeGraph typeGraph, CSP csp) {
		PackageToTPackage mPackageToTSub = PmFactory.eINSTANCE.createPackageToTPackage();
		TPackage tSubPackage = BasicFactory.eINSTANCE.createTPackage();
		Object _localVariable_0 = csp.getValue("tSubPackage", "tName");
		mPackageToTSub.setSource(mSubPackage);
		tSubPackage.setModel(typeGraph);
		mPackageToTSub.setTarget(tSubPackage);
		tParentPackage.getSubpackages().add(tSubPackage);
		String tSubPackage_tName_prime = (String) _localVariable_0;
		tSubPackage.setTName(tSubPackage_tName_prime);
		return new Object[] { mSubPackage, tParentPackage, mPackageToTSub, tSubPackage, typeGraph, csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_2_collecttranslatedelements_blackBBB(
			org.eclipse.modisco.java.Package mSubPackage, PackageToTPackage mPackageToTSub, TPackage tSubPackage) {
		return new Object[] { mSubPackage, mPackageToTSub, tSubPackage };
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_2_collecttranslatedelements_greenFBBB(
			org.eclipse.modisco.java.Package mSubPackage, PackageToTPackage mPackageToTSub, TPackage tSubPackage) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mSubPackage);
		ruleresult.getCreatedLinkElements().add(mPackageToTSub);
		ruleresult.getCreatedElements().add(tSubPackage);
		return new Object[] { ruleresult, mSubPackage, mPackageToTSub, tSubPackage };
	}

	public static final Object[] pattern_SubPackageToPGPackage_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject mSubPackage, EObject tParentPackage, EObject mPackageToTSub,
			EObject tSubPackage, EObject mParentPackage, EObject typeGraph, EObject mParentPackageToTParent) {
		if (!mSubPackage.equals(tParentPackage)) {
			if (!mSubPackage.equals(tSubPackage)) {
				if (!mSubPackage.equals(typeGraph)) {
					if (!tParentPackage.equals(tSubPackage)) {
						if (!tParentPackage.equals(typeGraph)) {
							if (!mPackageToTSub.equals(mSubPackage)) {
								if (!mPackageToTSub.equals(tParentPackage)) {
									if (!mPackageToTSub.equals(tSubPackage)) {
										if (!mPackageToTSub.equals(mParentPackage)) {
											if (!mPackageToTSub.equals(typeGraph)) {
												if (!mPackageToTSub.equals(mParentPackageToTParent)) {
													if (!tSubPackage.equals(typeGraph)) {
														if (!mParentPackage.equals(mSubPackage)) {
															if (!mParentPackage.equals(tParentPackage)) {
																if (!mParentPackage.equals(tSubPackage)) {
																	if (!mParentPackage.equals(typeGraph)) {
																		if (!mParentPackage
																				.equals(mParentPackageToTParent)) {
																			if (!mParentPackageToTParent
																					.equals(mSubPackage)) {
																				if (!mParentPackageToTParent
																						.equals(tParentPackage)) {
																					if (!mParentPackageToTParent
																							.equals(tSubPackage)) {
																						if (!mParentPackageToTParent
																								.equals(typeGraph)) {
																							return new Object[] {
																									ruleresult,
																									mSubPackage,
																									tParentPackage,
																									mPackageToTSub,
																									tSubPackage,
																									mParentPackage,
																									typeGraph,
																									mParentPackageToTParent };
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
			PerformRuleResult ruleresult, EObject mSubPackage, EObject tParentPackage, EObject mPackageToTSub,
			EObject tSubPackage, EObject mParentPackage, EObject typeGraph) {
		EMoflonEdge mPackageToTSub__mSubPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSubPackage__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTSub__tSubPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackage__mSubPackage____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSubPackage__mParentPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParentPackage__tSubPackage____subpackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSubPackage__tParentPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SubPackageToPGPackage";
		String mPackageToTSub__mSubPackage____source_name_prime = "source";
		String tSubPackage__typeGraph____model_name_prime = "model";
		String mPackageToTSub__tSubPackage____target_name_prime = "target";
		String mParentPackage__mSubPackage____ownedPackages_name_prime = "ownedPackages";
		String mSubPackage__mParentPackage____package_name_prime = "package";
		String tParentPackage__tSubPackage____subpackages_name_prime = "subpackages";
		String tSubPackage__tParentPackage____parent_name_prime = "parent";
		mPackageToTSub__mSubPackage____source.setSrc(mPackageToTSub);
		mPackageToTSub__mSubPackage____source.setTrg(mSubPackage);
		ruleresult.getCreatedEdges().add(mPackageToTSub__mSubPackage____source);
		tSubPackage__typeGraph____model.setSrc(tSubPackage);
		tSubPackage__typeGraph____model.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tSubPackage__typeGraph____model);
		mPackageToTSub__tSubPackage____target.setSrc(mPackageToTSub);
		mPackageToTSub__tSubPackage____target.setTrg(tSubPackage);
		ruleresult.getCreatedEdges().add(mPackageToTSub__tSubPackage____target);
		mParentPackage__mSubPackage____ownedPackages.setSrc(mParentPackage);
		mParentPackage__mSubPackage____ownedPackages.setTrg(mSubPackage);
		ruleresult.getTranslatedEdges().add(mParentPackage__mSubPackage____ownedPackages);
		mSubPackage__mParentPackage____package.setSrc(mSubPackage);
		mSubPackage__mParentPackage____package.setTrg(mParentPackage);
		ruleresult.getTranslatedEdges().add(mSubPackage__mParentPackage____package);
		tParentPackage__tSubPackage____subpackages.setSrc(tParentPackage);
		tParentPackage__tSubPackage____subpackages.setTrg(tSubPackage);
		ruleresult.getCreatedEdges().add(tParentPackage__tSubPackage____subpackages);
		tSubPackage__tParentPackage____parent.setSrc(tSubPackage);
		tSubPackage__tParentPackage____parent.setTrg(tParentPackage);
		ruleresult.getCreatedEdges().add(tSubPackage__tParentPackage____parent);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mPackageToTSub__mSubPackage____source.setName(mPackageToTSub__mSubPackage____source_name_prime);
		tSubPackage__typeGraph____model.setName(tSubPackage__typeGraph____model_name_prime);
		mPackageToTSub__tSubPackage____target.setName(mPackageToTSub__tSubPackage____target_name_prime);
		mParentPackage__mSubPackage____ownedPackages.setName(mParentPackage__mSubPackage____ownedPackages_name_prime);
		mSubPackage__mParentPackage____package.setName(mSubPackage__mParentPackage____package_name_prime);
		tParentPackage__tSubPackage____subpackages.setName(tParentPackage__tSubPackage____subpackages_name_prime);
		tSubPackage__tParentPackage____parent.setName(tSubPackage__tParentPackage____parent_name_prime);
		return new Object[] { ruleresult, mSubPackage, tParentPackage, mPackageToTSub, tSubPackage, mParentPackage,
				typeGraph, mPackageToTSub__mSubPackage____source, tSubPackage__typeGraph____model,
				mPackageToTSub__tSubPackage____target, mParentPackage__mSubPackage____ownedPackages,
				mSubPackage__mParentPackage____package, tParentPackage__tSubPackage____subpackages,
				tSubPackage__tParentPackage____parent };
	}

	public static final void pattern_SubPackageToPGPackage_1_5_registerobjects_expressionBBBBBBBBB(
			SubPackageToPGPackage _this, PerformRuleResult ruleresult, EObject mSubPackage, EObject tParentPackage,
			EObject mPackageToTSub, EObject tSubPackage, EObject mParentPackage, EObject typeGraph,
			EObject mParentPackageToTParent) {
		_this.registerObjects_FWD(ruleresult, mSubPackage, tParentPackage, mPackageToTSub, tSubPackage, mParentPackage,
				typeGraph, mParentPackageToTParent);

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
		EObject _localVariable_0 = match.getObject("mSubPackage");
		EObject _localVariable_1 = match.getObject("mParentPackage");
		EObject tmpMSubPackage = _localVariable_0;
		EObject tmpMParentPackage = _localVariable_1;
		if (tmpMSubPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mSubPackage = (org.eclipse.modisco.java.Package) tmpMSubPackage;
			if (tmpMParentPackage instanceof org.eclipse.modisco.java.Package) {
				org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) tmpMParentPackage;
				return new Object[] { mSubPackage, mParentPackage, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_2_2_corematch_blackBFBFB(
			org.eclipse.modisco.java.Package mSubPackage, org.eclipse.modisco.java.Package mParentPackage,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mParentPackage.equals(mSubPackage)) {
			for (PackageToTPackage mParentPackageToTParent : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mParentPackage, PackageToTPackage.class, "source")) {
				TPackage tParentPackage = mParentPackageToTParent.getTarget();
				if (tParentPackage != null) {
					_result.add(new Object[] { mSubPackage, tParentPackage, mParentPackage, mParentPackageToTParent,
							match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_2_3_findcontext_blackBBBFB(
			org.eclipse.modisco.java.Package mSubPackage, TPackage tParentPackage,
			org.eclipse.modisco.java.Package mParentPackage, PackageToTPackage mParentPackageToTParent) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mParentPackage.equals(mSubPackage)) {
			if (mParentPackage.getOwnedPackages().contains(mSubPackage)) {
				if (mParentPackage.equals(mParentPackageToTParent.getSource())) {
					if (tParentPackage.equals(mParentPackageToTParent.getTarget())) {
						TypeGraph typeGraph = tParentPackage.getModel();
						if (typeGraph != null) {
							_result.add(new Object[] { mSubPackage, tParentPackage, mParentPackage, typeGraph,
									mParentPackageToTParent });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_3_findcontext_greenBBBBBFFFFFF(
			org.eclipse.modisco.java.Package mSubPackage, TPackage tParentPackage,
			org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph,
			PackageToTPackage mParentPackageToTParent) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mParentPackage__mSubPackage____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSubPackage__mParentPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParentPackage__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackageToTParent__mParentPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackageToTParent__tParentPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mParentPackage__mSubPackage____ownedPackages_name_prime = "ownedPackages";
		String mSubPackage__mParentPackage____package_name_prime = "package";
		String tParentPackage__typeGraph____model_name_prime = "model";
		String mParentPackageToTParent__mParentPackage____source_name_prime = "source";
		String mParentPackageToTParent__tParentPackage____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mSubPackage);
		isApplicableMatch.getAllContextElements().add(tParentPackage);
		isApplicableMatch.getAllContextElements().add(mParentPackage);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent);
		mParentPackage__mSubPackage____ownedPackages.setSrc(mParentPackage);
		mParentPackage__mSubPackage____ownedPackages.setTrg(mSubPackage);
		isApplicableMatch.getAllContextElements().add(mParentPackage__mSubPackage____ownedPackages);
		mSubPackage__mParentPackage____package.setSrc(mSubPackage);
		mSubPackage__mParentPackage____package.setTrg(mParentPackage);
		isApplicableMatch.getAllContextElements().add(mSubPackage__mParentPackage____package);
		tParentPackage__typeGraph____model.setSrc(tParentPackage);
		tParentPackage__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tParentPackage__typeGraph____model);
		mParentPackageToTParent__mParentPackage____source.setSrc(mParentPackageToTParent);
		mParentPackageToTParent__mParentPackage____source.setTrg(mParentPackage);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent__mParentPackage____source);
		mParentPackageToTParent__tParentPackage____target.setSrc(mParentPackageToTParent);
		mParentPackageToTParent__tParentPackage____target.setTrg(tParentPackage);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent__tParentPackage____target);
		mParentPackage__mSubPackage____ownedPackages.setName(mParentPackage__mSubPackage____ownedPackages_name_prime);
		mSubPackage__mParentPackage____package.setName(mSubPackage__mParentPackage____package_name_prime);
		tParentPackage__typeGraph____model.setName(tParentPackage__typeGraph____model_name_prime);
		mParentPackageToTParent__mParentPackage____source
				.setName(mParentPackageToTParent__mParentPackage____source_name_prime);
		mParentPackageToTParent__tParentPackage____target
				.setName(mParentPackageToTParent__tParentPackage____target_name_prime);
		return new Object[] { mSubPackage, tParentPackage, mParentPackage, typeGraph, mParentPackageToTParent,
				isApplicableMatch, mParentPackage__mSubPackage____ownedPackages, mSubPackage__mParentPackage____package,
				tParentPackage__typeGraph____model, mParentPackageToTParent__mParentPackage____source,
				mParentPackageToTParent__tParentPackage____target };
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_4_solveCSP_bindingFBBBBBBB(SubPackageToPGPackage _this,
			IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package mSubPackage, TPackage tParentPackage,
			org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph,
			PackageToTPackage mParentPackageToTParent) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mSubPackage, tParentPackage,
				mParentPackage, typeGraph, mParentPackageToTParent);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mSubPackage, tParentPackage, mParentPackage, typeGraph,
					mParentPackageToTParent };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package mSubPackage, TPackage tParentPackage,
			org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph,
			PackageToTPackage mParentPackageToTParent) {
		Object[] result_pattern_SubPackageToPGPackage_2_4_solveCSP_binding = pattern_SubPackageToPGPackage_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, mSubPackage, tParentPackage, mParentPackage, typeGraph,
				mParentPackageToTParent);
		if (result_pattern_SubPackageToPGPackage_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_2_4_solveCSP_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_2_4_solveCSP_black = pattern_SubPackageToPGPackage_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mSubPackage, tParentPackage, mParentPackage,
						typeGraph, mParentPackageToTParent };
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
			SubPackageToPGPackage _this, Match match, TPackage tParentPackage, TPackage tSubPackage,
			TypeGraph typeGraph) {
		if (!tParentPackage.equals(tSubPackage)) {
			return new Object[] { _this, match, tParentPackage, tSubPackage, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_2_SolveCSP_bindingFBBBBB(SubPackageToPGPackage _this,
			Match match, TPackage tParentPackage, TPackage tSubPackage, TypeGraph typeGraph) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tParentPackage, tSubPackage, typeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tParentPackage, tSubPackage, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_2_SolveCSP_bindingAndBlackFBBBBB(
			SubPackageToPGPackage _this, Match match, TPackage tParentPackage, TPackage tSubPackage,
			TypeGraph typeGraph) {
		Object[] result_pattern_SubPackageToPGPackage_10_2_SolveCSP_binding = pattern_SubPackageToPGPackage_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tParentPackage, tSubPackage, typeGraph);
		if (result_pattern_SubPackageToPGPackage_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_10_2_SolveCSP_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_10_2_SolveCSP_black = pattern_SubPackageToPGPackage_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tParentPackage, tSubPackage, typeGraph };
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
			TPackage tParentPackage, TPackage tSubPackage, TypeGraph typeGraph) {
		if (!tParentPackage.equals(tSubPackage)) {
			return new Object[] { match, tParentPackage, tSubPackage, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, TPackage tParentPackage, TPackage tSubPackage, TypeGraph typeGraph) {
		EMoflonEdge tSubPackage__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParentPackage__tSubPackage____subpackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSubPackage__tParentPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSubPackage);
		String tSubPackage__typeGraph____model_name_prime = "model";
		String tParentPackage__tSubPackage____subpackages_name_prime = "subpackages";
		String tSubPackage__tParentPackage____parent_name_prime = "parent";
		tSubPackage__typeGraph____model.setSrc(tSubPackage);
		tSubPackage__typeGraph____model.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tSubPackage__typeGraph____model);
		tParentPackage__tSubPackage____subpackages.setSrc(tParentPackage);
		tParentPackage__tSubPackage____subpackages.setTrg(tSubPackage);
		match.getToBeTranslatedEdges().add(tParentPackage__tSubPackage____subpackages);
		tSubPackage__tParentPackage____parent.setSrc(tSubPackage);
		tSubPackage__tParentPackage____parent.setTrg(tParentPackage);
		match.getToBeTranslatedEdges().add(tSubPackage__tParentPackage____parent);
		tSubPackage__typeGraph____model.setName(tSubPackage__typeGraph____model_name_prime);
		tParentPackage__tSubPackage____subpackages.setName(tParentPackage__tSubPackage____subpackages_name_prime);
		tSubPackage__tParentPackage____parent.setName(tSubPackage__tParentPackage____parent_name_prime);
		return new Object[] { match, tParentPackage, tSubPackage, typeGraph, tSubPackage__typeGraph____model,
				tParentPackage__tSubPackage____subpackages, tSubPackage__tParentPackage____parent };
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_5_collectcontextelements_blackBBBB(Match match,
			TPackage tParentPackage, TPackage tSubPackage, TypeGraph typeGraph) {
		if (!tParentPackage.equals(tSubPackage)) {
			return new Object[] { match, tParentPackage, tSubPackage, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_10_5_collectcontextelements_greenBBBF(Match match,
			TPackage tParentPackage, TypeGraph typeGraph) {
		EMoflonEdge tParentPackage__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tParentPackage);
		match.getContextNodes().add(typeGraph);
		String tParentPackage__typeGraph____model_name_prime = "model";
		tParentPackage__typeGraph____model.setSrc(tParentPackage);
		tParentPackage__typeGraph____model.setTrg(typeGraph);
		match.getContextEdges().add(tParentPackage__typeGraph____model);
		tParentPackage__typeGraph____model.setName(tParentPackage__typeGraph____model_name_prime);
		return new Object[] { match, tParentPackage, typeGraph, tParentPackage__typeGraph____model };
	}

	public static final void pattern_SubPackageToPGPackage_10_6_registerobjectstomatch_expressionBBBBB(
			SubPackageToPGPackage _this, Match match, TPackage tParentPackage, TPackage tSubPackage,
			TypeGraph typeGraph) {
		_this.registerObjectsToMatch_BWD(match, tParentPackage, tSubPackage, typeGraph);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("tParentPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("tSubPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("mParentPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_4 = isApplicableMatch.getObject("mParentPackageToTParent");
		EObject tmpTParentPackage = _localVariable_0;
		EObject tmpTSubPackage = _localVariable_1;
		EObject tmpMParentPackage = _localVariable_2;
		EObject tmpTypeGraph = _localVariable_3;
		EObject tmpMParentPackageToTParent = _localVariable_4;
		if (tmpTParentPackage instanceof TPackage) {
			TPackage tParentPackage = (TPackage) tmpTParentPackage;
			if (tmpTSubPackage instanceof TPackage) {
				TPackage tSubPackage = (TPackage) tmpTSubPackage;
				if (tmpMParentPackage instanceof org.eclipse.modisco.java.Package) {
					org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) tmpMParentPackage;
					if (tmpTypeGraph instanceof TypeGraph) {
						TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
						if (tmpMParentPackageToTParent instanceof PackageToTPackage) {
							PackageToTPackage mParentPackageToTParent = (PackageToTPackage) tmpMParentPackageToTParent;
							return new Object[] { tParentPackage, tSubPackage, mParentPackage, typeGraph,
									mParentPackageToTParent, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_1_performtransformation_blackBBBBBFBB(
			TPackage tParentPackage, TPackage tSubPackage, org.eclipse.modisco.java.Package mParentPackage,
			TypeGraph typeGraph, PackageToTPackage mParentPackageToTParent, SubPackageToPGPackage _this,
			IsApplicableMatch isApplicableMatch) {
		if (!tParentPackage.equals(tSubPackage)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { tParentPackage, tSubPackage, mParentPackage, typeGraph,
							mParentPackageToTParent, csp, _this, isApplicableMatch };
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
			TPackage tParentPackage = (TPackage) result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding[0];
			TPackage tSubPackage = (TPackage) result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding[1];
			org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding[2];
			TypeGraph typeGraph = (TypeGraph) result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding[3];
			PackageToTPackage mParentPackageToTParent = (PackageToTPackage) result_pattern_SubPackageToPGPackage_11_1_performtransformation_binding[4];

			Object[] result_pattern_SubPackageToPGPackage_11_1_performtransformation_black = pattern_SubPackageToPGPackage_11_1_performtransformation_blackBBBBBFBB(
					tParentPackage, tSubPackage, mParentPackage, typeGraph, mParentPackageToTParent, _this,
					isApplicableMatch);
			if (result_pattern_SubPackageToPGPackage_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SubPackageToPGPackage_11_1_performtransformation_black[5];

				return new Object[] { tParentPackage, tSubPackage, mParentPackage, typeGraph, mParentPackageToTParent,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_1_performtransformation_greenFFBBB(
			TPackage tSubPackage, org.eclipse.modisco.java.Package mParentPackage, CSP csp) {
		org.eclipse.modisco.java.Package mSubPackage = JavaFactory.eINSTANCE.createPackage();
		PackageToTPackage mPackageToTSub = PmFactory.eINSTANCE.createPackageToTPackage();
		Object _localVariable_0 = csp.getValue("mSubPackage", "name");
		mParentPackage.getOwnedPackages().add(mSubPackage);
		mPackageToTSub.setSource(mSubPackage);
		mPackageToTSub.setTarget(tSubPackage);
		String mSubPackage_name_prime = (String) _localVariable_0;
		mSubPackage.setName(mSubPackage_name_prime);
		return new Object[] { mSubPackage, mPackageToTSub, tSubPackage, mParentPackage, csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_2_collecttranslatedelements_blackBBB(
			org.eclipse.modisco.java.Package mSubPackage, PackageToTPackage mPackageToTSub, TPackage tSubPackage) {
		return new Object[] { mSubPackage, mPackageToTSub, tSubPackage };
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_2_collecttranslatedelements_greenFBBB(
			org.eclipse.modisco.java.Package mSubPackage, PackageToTPackage mPackageToTSub, TPackage tSubPackage) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mSubPackage);
		ruleresult.getCreatedLinkElements().add(mPackageToTSub);
		ruleresult.getTranslatedElements().add(tSubPackage);
		return new Object[] { ruleresult, mSubPackage, mPackageToTSub, tSubPackage };
	}

	public static final Object[] pattern_SubPackageToPGPackage_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject mSubPackage, EObject tParentPackage, EObject mPackageToTSub,
			EObject tSubPackage, EObject mParentPackage, EObject typeGraph, EObject mParentPackageToTParent) {
		if (!mSubPackage.equals(tParentPackage)) {
			if (!mSubPackage.equals(tSubPackage)) {
				if (!mSubPackage.equals(typeGraph)) {
					if (!tParentPackage.equals(tSubPackage)) {
						if (!tParentPackage.equals(typeGraph)) {
							if (!mPackageToTSub.equals(mSubPackage)) {
								if (!mPackageToTSub.equals(tParentPackage)) {
									if (!mPackageToTSub.equals(tSubPackage)) {
										if (!mPackageToTSub.equals(mParentPackage)) {
											if (!mPackageToTSub.equals(typeGraph)) {
												if (!mPackageToTSub.equals(mParentPackageToTParent)) {
													if (!tSubPackage.equals(typeGraph)) {
														if (!mParentPackage.equals(mSubPackage)) {
															if (!mParentPackage.equals(tParentPackage)) {
																if (!mParentPackage.equals(tSubPackage)) {
																	if (!mParentPackage.equals(typeGraph)) {
																		if (!mParentPackage
																				.equals(mParentPackageToTParent)) {
																			if (!mParentPackageToTParent
																					.equals(mSubPackage)) {
																				if (!mParentPackageToTParent
																						.equals(tParentPackage)) {
																					if (!mParentPackageToTParent
																							.equals(tSubPackage)) {
																						if (!mParentPackageToTParent
																								.equals(typeGraph)) {
																							return new Object[] {
																									ruleresult,
																									mSubPackage,
																									tParentPackage,
																									mPackageToTSub,
																									tSubPackage,
																									mParentPackage,
																									typeGraph,
																									mParentPackageToTParent };
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
			PerformRuleResult ruleresult, EObject mSubPackage, EObject tParentPackage, EObject mPackageToTSub,
			EObject tSubPackage, EObject mParentPackage, EObject typeGraph) {
		EMoflonEdge mPackageToTSub__mSubPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSubPackage__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTSub__tSubPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackage__mSubPackage____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSubPackage__mParentPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParentPackage__tSubPackage____subpackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSubPackage__tParentPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SubPackageToPGPackage";
		String mPackageToTSub__mSubPackage____source_name_prime = "source";
		String tSubPackage__typeGraph____model_name_prime = "model";
		String mPackageToTSub__tSubPackage____target_name_prime = "target";
		String mParentPackage__mSubPackage____ownedPackages_name_prime = "ownedPackages";
		String mSubPackage__mParentPackage____package_name_prime = "package";
		String tParentPackage__tSubPackage____subpackages_name_prime = "subpackages";
		String tSubPackage__tParentPackage____parent_name_prime = "parent";
		mPackageToTSub__mSubPackage____source.setSrc(mPackageToTSub);
		mPackageToTSub__mSubPackage____source.setTrg(mSubPackage);
		ruleresult.getCreatedEdges().add(mPackageToTSub__mSubPackage____source);
		tSubPackage__typeGraph____model.setSrc(tSubPackage);
		tSubPackage__typeGraph____model.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tSubPackage__typeGraph____model);
		mPackageToTSub__tSubPackage____target.setSrc(mPackageToTSub);
		mPackageToTSub__tSubPackage____target.setTrg(tSubPackage);
		ruleresult.getCreatedEdges().add(mPackageToTSub__tSubPackage____target);
		mParentPackage__mSubPackage____ownedPackages.setSrc(mParentPackage);
		mParentPackage__mSubPackage____ownedPackages.setTrg(mSubPackage);
		ruleresult.getCreatedEdges().add(mParentPackage__mSubPackage____ownedPackages);
		mSubPackage__mParentPackage____package.setSrc(mSubPackage);
		mSubPackage__mParentPackage____package.setTrg(mParentPackage);
		ruleresult.getCreatedEdges().add(mSubPackage__mParentPackage____package);
		tParentPackage__tSubPackage____subpackages.setSrc(tParentPackage);
		tParentPackage__tSubPackage____subpackages.setTrg(tSubPackage);
		ruleresult.getTranslatedEdges().add(tParentPackage__tSubPackage____subpackages);
		tSubPackage__tParentPackage____parent.setSrc(tSubPackage);
		tSubPackage__tParentPackage____parent.setTrg(tParentPackage);
		ruleresult.getTranslatedEdges().add(tSubPackage__tParentPackage____parent);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mPackageToTSub__mSubPackage____source.setName(mPackageToTSub__mSubPackage____source_name_prime);
		tSubPackage__typeGraph____model.setName(tSubPackage__typeGraph____model_name_prime);
		mPackageToTSub__tSubPackage____target.setName(mPackageToTSub__tSubPackage____target_name_prime);
		mParentPackage__mSubPackage____ownedPackages.setName(mParentPackage__mSubPackage____ownedPackages_name_prime);
		mSubPackage__mParentPackage____package.setName(mSubPackage__mParentPackage____package_name_prime);
		tParentPackage__tSubPackage____subpackages.setName(tParentPackage__tSubPackage____subpackages_name_prime);
		tSubPackage__tParentPackage____parent.setName(tSubPackage__tParentPackage____parent_name_prime);
		return new Object[] { ruleresult, mSubPackage, tParentPackage, mPackageToTSub, tSubPackage, mParentPackage,
				typeGraph, mPackageToTSub__mSubPackage____source, tSubPackage__typeGraph____model,
				mPackageToTSub__tSubPackage____target, mParentPackage__mSubPackage____ownedPackages,
				mSubPackage__mParentPackage____package, tParentPackage__tSubPackage____subpackages,
				tSubPackage__tParentPackage____parent };
	}

	public static final void pattern_SubPackageToPGPackage_11_5_registerobjects_expressionBBBBBBBBB(
			SubPackageToPGPackage _this, PerformRuleResult ruleresult, EObject mSubPackage, EObject tParentPackage,
			EObject mPackageToTSub, EObject tSubPackage, EObject mParentPackage, EObject typeGraph,
			EObject mParentPackageToTParent) {
		_this.registerObjects_BWD(ruleresult, mSubPackage, tParentPackage, mPackageToTSub, tSubPackage, mParentPackage,
				typeGraph, mParentPackageToTParent);

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
		EObject _localVariable_0 = match.getObject("tParentPackage");
		EObject _localVariable_1 = match.getObject("tSubPackage");
		EObject _localVariable_2 = match.getObject("typeGraph");
		EObject tmpTParentPackage = _localVariable_0;
		EObject tmpTSubPackage = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		if (tmpTParentPackage instanceof TPackage) {
			TPackage tParentPackage = (TPackage) tmpTParentPackage;
			if (tmpTSubPackage instanceof TPackage) {
				TPackage tSubPackage = (TPackage) tmpTSubPackage;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					return new Object[] { tParentPackage, tSubPackage, typeGraph, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_12_2_corematch_blackBBFBFB(
			TPackage tParentPackage, TPackage tSubPackage, TypeGraph typeGraph, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tParentPackage.equals(tSubPackage)) {
			for (PackageToTPackage mParentPackageToTParent : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tParentPackage, PackageToTPackage.class, "target")) {
				org.eclipse.modisco.java.Package mParentPackage = mParentPackageToTParent.getSource();
				if (mParentPackage != null) {
					_result.add(new Object[] { tParentPackage, tSubPackage, mParentPackage, typeGraph,
							mParentPackageToTParent, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_12_3_findcontext_blackBBBBB(
			TPackage tParentPackage, TPackage tSubPackage, org.eclipse.modisco.java.Package mParentPackage,
			TypeGraph typeGraph, PackageToTPackage mParentPackageToTParent) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tParentPackage.equals(tSubPackage)) {
			if (typeGraph.equals(tSubPackage.getModel())) {
				if (tParentPackage.getSubpackages().contains(tSubPackage)) {
					if (typeGraph.equals(tParentPackage.getModel())) {
						if (mParentPackage.equals(mParentPackageToTParent.getSource())) {
							if (tParentPackage.equals(mParentPackageToTParent.getTarget())) {
								_result.add(new Object[] { tParentPackage, tSubPackage, mParentPackage, typeGraph,
										mParentPackageToTParent });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_3_findcontext_greenBBBBBFFFFFFF(
			TPackage tParentPackage, TPackage tSubPackage, org.eclipse.modisco.java.Package mParentPackage,
			TypeGraph typeGraph, PackageToTPackage mParentPackageToTParent) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tSubPackage__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParentPackage__tSubPackage____subpackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSubPackage__tParentPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tParentPackage__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackageToTParent__mParentPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mParentPackageToTParent__tParentPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tSubPackage__typeGraph____model_name_prime = "model";
		String tParentPackage__tSubPackage____subpackages_name_prime = "subpackages";
		String tSubPackage__tParentPackage____parent_name_prime = "parent";
		String tParentPackage__typeGraph____model_name_prime = "model";
		String mParentPackageToTParent__mParentPackage____source_name_prime = "source";
		String mParentPackageToTParent__tParentPackage____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tParentPackage);
		isApplicableMatch.getAllContextElements().add(tSubPackage);
		isApplicableMatch.getAllContextElements().add(mParentPackage);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent);
		tSubPackage__typeGraph____model.setSrc(tSubPackage);
		tSubPackage__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tSubPackage__typeGraph____model);
		tParentPackage__tSubPackage____subpackages.setSrc(tParentPackage);
		tParentPackage__tSubPackage____subpackages.setTrg(tSubPackage);
		isApplicableMatch.getAllContextElements().add(tParentPackage__tSubPackage____subpackages);
		tSubPackage__tParentPackage____parent.setSrc(tSubPackage);
		tSubPackage__tParentPackage____parent.setTrg(tParentPackage);
		isApplicableMatch.getAllContextElements().add(tSubPackage__tParentPackage____parent);
		tParentPackage__typeGraph____model.setSrc(tParentPackage);
		tParentPackage__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tParentPackage__typeGraph____model);
		mParentPackageToTParent__mParentPackage____source.setSrc(mParentPackageToTParent);
		mParentPackageToTParent__mParentPackage____source.setTrg(mParentPackage);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent__mParentPackage____source);
		mParentPackageToTParent__tParentPackage____target.setSrc(mParentPackageToTParent);
		mParentPackageToTParent__tParentPackage____target.setTrg(tParentPackage);
		isApplicableMatch.getAllContextElements().add(mParentPackageToTParent__tParentPackage____target);
		tSubPackage__typeGraph____model.setName(tSubPackage__typeGraph____model_name_prime);
		tParentPackage__tSubPackage____subpackages.setName(tParentPackage__tSubPackage____subpackages_name_prime);
		tSubPackage__tParentPackage____parent.setName(tSubPackage__tParentPackage____parent_name_prime);
		tParentPackage__typeGraph____model.setName(tParentPackage__typeGraph____model_name_prime);
		mParentPackageToTParent__mParentPackage____source
				.setName(mParentPackageToTParent__mParentPackage____source_name_prime);
		mParentPackageToTParent__tParentPackage____target
				.setName(mParentPackageToTParent__tParentPackage____target_name_prime);
		return new Object[] { tParentPackage, tSubPackage, mParentPackage, typeGraph, mParentPackageToTParent,
				isApplicableMatch, tSubPackage__typeGraph____model, tParentPackage__tSubPackage____subpackages,
				tSubPackage__tParentPackage____parent, tParentPackage__typeGraph____model,
				mParentPackageToTParent__mParentPackage____source, mParentPackageToTParent__tParentPackage____target };
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_4_solveCSP_bindingFBBBBBBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch, TPackage tParentPackage,
			TPackage tSubPackage, org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph,
			PackageToTPackage mParentPackageToTParent) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tParentPackage, tSubPackage,
				mParentPackage, typeGraph, mParentPackageToTParent);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tParentPackage, tSubPackage, mParentPackage, typeGraph,
					mParentPackageToTParent };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch, TPackage tParentPackage,
			TPackage tSubPackage, org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph,
			PackageToTPackage mParentPackageToTParent) {
		Object[] result_pattern_SubPackageToPGPackage_12_4_solveCSP_binding = pattern_SubPackageToPGPackage_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tParentPackage, tSubPackage, mParentPackage, typeGraph,
				mParentPackageToTParent);
		if (result_pattern_SubPackageToPGPackage_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_12_4_solveCSP_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_12_4_solveCSP_black = pattern_SubPackageToPGPackage_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tParentPackage, tSubPackage, mParentPackage,
						typeGraph, mParentPackageToTParent };
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

	public static final Object[] pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_black_nac_0BB(
			TPackage tSubPackage, TypeGraph typeGraph) {
		for (TypeGraph __DEC_tSubPackage_packages_375290 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tSubPackage, TypeGraph.class, "packages")) {
			if (!typeGraph.equals(__DEC_tSubPackage_packages_375290)) {
				return new Object[] { tSubPackage, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_black_nac_1BB(
			TypeGraph typeGraph, TPackage tSubPackage) {
		if (typeGraph.getPackages().contains(tSubPackage)) {
			return new Object[] { typeGraph, tSubPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_model) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTSubPackage = _edge_model.getSrc();
		if (tmpTSubPackage instanceof TPackage) {
			TPackage tSubPackage = (TPackage) tmpTSubPackage;
			EObject tmpTypeGraph = _edge_model.getTrg();
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (typeGraph.equals(tSubPackage.getModel())) {
					TPackage tParentPackage = tSubPackage.getParent();
					if (tParentPackage != null) {
						if (!tParentPackage.equals(tSubPackage)) {
							if (typeGraph.equals(tParentPackage.getModel())) {
								if (pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_black_nac_0BB(tSubPackage,
										typeGraph) == null) {
									if (pattern_SubPackageToPGPackage_20_2_testcorematchandDECs_black_nac_1BB(typeGraph,
											tSubPackage) == null) {
										_result.add(
												new Object[] { tParentPackage, tSubPackage, typeGraph, _edge_model });
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
			SubPackageToPGPackage _this, Match match, TPackage tParentPackage, TPackage tSubPackage,
			TypeGraph typeGraph) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tParentPackage, tSubPackage, typeGraph);
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
			org.eclipse.modisco.java.Package mSubPackage) {
		Model __DEC_mSubPackage_model_759821 = mSubPackage.getModel();
		if (__DEC_mSubPackage_model_759821 != null) {
			return new Object[] { mSubPackage };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedPackages) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMParentPackage = _edge_ownedPackages.getSrc();
		if (tmpMParentPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) tmpMParentPackage;
			EObject tmpMSubPackage = _edge_ownedPackages.getTrg();
			if (tmpMSubPackage instanceof org.eclipse.modisco.java.Package) {
				org.eclipse.modisco.java.Package mSubPackage = (org.eclipse.modisco.java.Package) tmpMSubPackage;
				if (!mParentPackage.equals(mSubPackage)) {
					if (mParentPackage.getOwnedPackages().contains(mSubPackage)) {
						if (pattern_SubPackageToPGPackage_21_2_testcorematchandDECs_black_nac_0B(mSubPackage) == null) {
							_result.add(new Object[] { mSubPackage, mParentPackage, _edge_ownedPackages });
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
			SubPackageToPGPackage _this, Match match, org.eclipse.modisco.java.Package mSubPackage,
			org.eclipse.modisco.java.Package mParentPackage) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mSubPackage, mParentPackage);
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

	public static final Object[] pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_bindingFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mSubPackage");
		EObject _localVariable_1 = targetMatch.getObject("tParentPackage");
		EObject _localVariable_2 = targetMatch.getObject("tSubPackage");
		EObject _localVariable_3 = sourceMatch.getObject("mParentPackage");
		EObject _localVariable_4 = targetMatch.getObject("typeGraph");
		EObject tmpMSubPackage = _localVariable_0;
		EObject tmpTParentPackage = _localVariable_1;
		EObject tmpTSubPackage = _localVariable_2;
		EObject tmpMParentPackage = _localVariable_3;
		EObject tmpTypeGraph = _localVariable_4;
		if (tmpMSubPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mSubPackage = (org.eclipse.modisco.java.Package) tmpMSubPackage;
			if (tmpTParentPackage instanceof TPackage) {
				TPackage tParentPackage = (TPackage) tmpTParentPackage;
				if (tmpTSubPackage instanceof TPackage) {
					TPackage tSubPackage = (TPackage) tmpTSubPackage;
					if (tmpMParentPackage instanceof org.eclipse.modisco.java.Package) {
						org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) tmpMParentPackage;
						if (tmpTypeGraph instanceof TypeGraph) {
							TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
							return new Object[] { mSubPackage, tParentPackage, tSubPackage, mParentPackage, typeGraph,
									sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_blackBBBBBBB(
			org.eclipse.modisco.java.Package mSubPackage, TPackage tParentPackage, TPackage tSubPackage,
			org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph, Match sourceMatch,
			Match targetMatch) {
		if (!tParentPackage.equals(tSubPackage)) {
			if (!mParentPackage.equals(mSubPackage)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { mSubPackage, tParentPackage, tSubPackage, mParentPackage, typeGraph,
							sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_binding = pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_bindingFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.modisco.java.Package mSubPackage = (org.eclipse.modisco.java.Package) result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_binding[0];
			TPackage tParentPackage = (TPackage) result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_binding[1];
			TPackage tSubPackage = (TPackage) result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.modisco.java.Package mParentPackage = (org.eclipse.modisco.java.Package) result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_binding[3];
			TypeGraph typeGraph = (TypeGraph) result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_black = pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_blackBBBBBBB(
					mSubPackage, tParentPackage, tSubPackage, mParentPackage, typeGraph, sourceMatch, targetMatch);
			if (result_pattern_SubPackageToPGPackage_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mSubPackage, tParentPackage, tSubPackage, mParentPackage, typeGraph, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_3_solvecsp_bindingFBBBBBBBB(
			SubPackageToPGPackage _this, org.eclipse.modisco.java.Package mSubPackage, TPackage tParentPackage,
			TPackage tSubPackage, org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(mSubPackage, tParentPackage, tSubPackage, mParentPackage,
				typeGraph, sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, mSubPackage, tParentPackage, tSubPackage, mParentPackage, typeGraph,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			SubPackageToPGPackage _this, org.eclipse.modisco.java.Package mSubPackage, TPackage tParentPackage,
			TPackage tSubPackage, org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SubPackageToPGPackage_24_3_solvecsp_binding = pattern_SubPackageToPGPackage_24_3_solvecsp_bindingFBBBBBBBB(
				_this, mSubPackage, tParentPackage, tSubPackage, mParentPackage, typeGraph, sourceMatch, targetMatch);
		if (result_pattern_SubPackageToPGPackage_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_24_3_solvecsp_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_24_3_solvecsp_black = pattern_SubPackageToPGPackage_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mSubPackage, tParentPackage, tSubPackage, mParentPackage, typeGraph,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_SubPackageToPGPackage_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_SubPackageToPGPackage_24_5_matchcorrcontext_blackBBFBB(
			TPackage tParentPackage, org.eclipse.modisco.java.Package mParentPackage, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (PackageToTPackage mParentPackageToTParent : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mParentPackage, PackageToTPackage.class, "source")) {
				if (tParentPackage.equals(mParentPackageToTParent.getTarget())) {
					_result.add(new Object[] { tParentPackage, mParentPackage, mParentPackageToTParent, sourceMatch,
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

	public static final Object[] pattern_SubPackageToPGPackage_24_6_createcorrespondence_blackBBBBBB(
			org.eclipse.modisco.java.Package mSubPackage, TPackage tParentPackage, TPackage tSubPackage,
			org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph, CCMatch ccMatch) {
		if (!tParentPackage.equals(tSubPackage)) {
			if (!mParentPackage.equals(mSubPackage)) {
				return new Object[] { mSubPackage, tParentPackage, tSubPackage, mParentPackage, typeGraph, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_24_6_createcorrespondence_greenBFBB(
			org.eclipse.modisco.java.Package mSubPackage, TPackage tSubPackage, CCMatch ccMatch) {
		PackageToTPackage mPackageToTSub = PmFactory.eINSTANCE.createPackageToTPackage();
		mPackageToTSub.setSource(mSubPackage);
		mPackageToTSub.setTarget(tSubPackage);
		ccMatch.getCreateCorr().add(mPackageToTSub);
		return new Object[] { mSubPackage, mPackageToTSub, tSubPackage, ccMatch };
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
			org.eclipse.modisco.java.Package mSubPackage) {
		Model __DEC_mSubPackage_model_838434 = mSubPackage.getModel();
		if (__DEC_mSubPackage_model_838434 != null) {
			return new Object[] { mSubPackage };
		}

		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_27_1_matchtggpattern_blackBB(
			org.eclipse.modisco.java.Package mSubPackage, org.eclipse.modisco.java.Package mParentPackage) {
		if (!mParentPackage.equals(mSubPackage)) {
			if (mParentPackage.getOwnedPackages().contains(mSubPackage)) {
				if (pattern_SubPackageToPGPackage_27_1_matchtggpattern_black_nac_0B(mSubPackage) == null) {
					return new Object[] { mSubPackage, mParentPackage };
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

	public static final Object[] pattern_SubPackageToPGPackage_28_1_matchtggpattern_black_nac_0BB(TPackage tSubPackage,
			TypeGraph typeGraph) {
		for (TypeGraph __DEC_tSubPackage_packages_254595 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tSubPackage, TypeGraph.class, "packages")) {
			if (!typeGraph.equals(__DEC_tSubPackage_packages_254595)) {
				return new Object[] { tSubPackage, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_28_1_matchtggpattern_black_nac_1BB(TypeGraph typeGraph,
			TPackage tSubPackage) {
		if (typeGraph.getPackages().contains(tSubPackage)) {
			return new Object[] { typeGraph, tSubPackage };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_28_1_matchtggpattern_blackBBB(TPackage tParentPackage,
			TPackage tSubPackage, TypeGraph typeGraph) {
		if (!tParentPackage.equals(tSubPackage)) {
			if (typeGraph.equals(tSubPackage.getModel())) {
				if (tParentPackage.getSubpackages().contains(tSubPackage)) {
					if (typeGraph.equals(tParentPackage.getModel())) {
						if (pattern_SubPackageToPGPackage_28_1_matchtggpattern_black_nac_0BB(tSubPackage,
								typeGraph) == null) {
							if (pattern_SubPackageToPGPackage_28_1_matchtggpattern_black_nac_1BB(typeGraph,
									tSubPackage) == null) {
								return new Object[] { tParentPackage, tSubPackage, typeGraph };
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
			ModelgeneratorRuleResult ruleResult, TPackage tParentPackage) {
		if (ruleResult.getTargetObjects().contains(tParentPackage)) {
			return new Object[] { ruleResult, tParentPackage };
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
					TPackage tParentPackage = mParentPackageToTParent.getTarget();
					if (tParentPackage != null) {
						org.eclipse.modisco.java.Package mParentPackage = mParentPackageToTParent.getSource();
						if (mParentPackage != null) {
							TypeGraph typeGraph = tParentPackage.getModel();
							if (typeGraph != null) {
								if (pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_2BB(ruleResult,
										mParentPackageToTParent) == null) {
									if (pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											tParentPackage) == null) {
										if (pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_3BB(
												ruleResult, mParentPackage) == null) {
											if (pattern_SubPackageToPGPackage_29_2_isapplicablecore_black_nac_1BB(
													ruleResult, typeGraph) == null) {
												_result.add(new Object[] { mParentPackageToTParentList, tParentPackage,
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
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch, TPackage tParentPackage,
			org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph,
			PackageToTPackage mParentPackageToTParent, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tParentPackage, mParentPackage,
				typeGraph, mParentPackageToTParent, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tParentPackage, mParentPackage, typeGraph,
					mParentPackageToTParent, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_3_solveCSP_bindingAndBlackFBBBBBBB(
			SubPackageToPGPackage _this, IsApplicableMatch isApplicableMatch, TPackage tParentPackage,
			org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph,
			PackageToTPackage mParentPackageToTParent, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SubPackageToPGPackage_29_3_solveCSP_binding = pattern_SubPackageToPGPackage_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tParentPackage, mParentPackage, typeGraph, mParentPackageToTParent,
				ruleResult);
		if (result_pattern_SubPackageToPGPackage_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SubPackageToPGPackage_29_3_solveCSP_binding[0];

			Object[] result_pattern_SubPackageToPGPackage_29_3_solveCSP_black = pattern_SubPackageToPGPackage_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_SubPackageToPGPackage_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tParentPackage, mParentPackage, typeGraph,
						mParentPackageToTParent, ruleResult };
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

	public static final Object[] pattern_SubPackageToPGPackage_29_5_checknacs_blackBBBB(TPackage tParentPackage,
			org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph,
			PackageToTPackage mParentPackageToTParent) {
		return new Object[] { tParentPackage, mParentPackage, typeGraph, mParentPackageToTParent };
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_6_perform_blackBBBBB(TPackage tParentPackage,
			org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph,
			PackageToTPackage mParentPackageToTParent, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tParentPackage, mParentPackage, typeGraph, mParentPackageToTParent, ruleResult };
	}

	public static final Object[] pattern_SubPackageToPGPackage_29_6_perform_greenFBFFBBBB(TPackage tParentPackage,
			org.eclipse.modisco.java.Package mParentPackage, TypeGraph typeGraph, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		org.eclipse.modisco.java.Package mSubPackage = JavaFactory.eINSTANCE.createPackage();
		PackageToTPackage mPackageToTSub = PmFactory.eINSTANCE.createPackageToTPackage();
		TPackage tSubPackage = BasicFactory.eINSTANCE.createTPackage();
		Object _localVariable_0 = csp.getValue("mSubPackage", "name");
		Object _localVariable_1 = csp.getValue("tSubPackage", "tName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		mParentPackage.getOwnedPackages().add(mSubPackage);
		ruleResult.getSourceObjects().add(mSubPackage);
		mPackageToTSub.setSource(mSubPackage);
		ruleResult.getCorrObjects().add(mPackageToTSub);
		tSubPackage.setModel(typeGraph);
		mPackageToTSub.setTarget(tSubPackage);
		tParentPackage.getSubpackages().add(tSubPackage);
		ruleResult.getTargetObjects().add(tSubPackage);
		String mSubPackage_name_prime = (String) _localVariable_0;
		String tSubPackage_tName_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		mSubPackage.setName(mSubPackage_name_prime);
		tSubPackage.setTName(tSubPackage_tName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mSubPackage, tParentPackage, mPackageToTSub, tSubPackage, mParentPackage, typeGraph,
				ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_SubPackageToPGPackage_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SubPackageToPGPackageImpl
