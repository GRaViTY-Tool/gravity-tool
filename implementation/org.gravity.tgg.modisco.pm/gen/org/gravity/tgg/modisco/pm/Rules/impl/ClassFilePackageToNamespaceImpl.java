/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.ClassFile;
import org.eclipse.modisco.java.NamedElement;

import org.gravity.tgg.modisco.pm.ElementToModule;
import org.gravity.tgg.modisco.pm.PackageToTPackage;

import org.gravity.tgg.modisco.pm.Rules.ClassFilePackageToNamespace;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.TModule;
import org.gravity.typegraph.basic.TPackage;

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
 * An implementation of the model object '<em><b>Class File Package To Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ClassFilePackageToNamespaceImpl extends AbstractRuleImpl implements ClassFilePackageToNamespace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassFilePackageToNamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getClassFilePackageToNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.Package p, ClassFile cu) {

		Object[] result1_black = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_0_1_initialbindings_blackBBBB(this, match, p, cu);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[p] = " + p + ", " + "[cu] = " + cu + ".");
		}

		Object[] result2_bindingAndBlack = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, p, cu);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[p] = " + p + ", " + "[cu] = " + cu + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_0_4_collectelementstobetranslated_blackBBB(match, p, cu);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[p] = " + p + ", " + "[cu] = " + cu + ".");
			}
			ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_0_4_collectelementstobetranslated_greenBBBF(match, p, cu);
			//nothing EMoflonEdge cu__p____package = (EMoflonEdge) result4_green[3];

			Object[] result5_black = ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_0_5_collectcontextelements_blackBBB(match, p, cu);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[p] = " + p + ", " + "[cu] = " + cu + ".");
			}
			ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_0_5_collectcontextelements_greenBBB(match, p, cu);

			// 
			ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_0_6_registerobjectstomatch_expressionBBBB(this, match, p, cu);
			return ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_0_7_expressionF();
		} else {
			return ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.modisco.java.Package p = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[0];
		ClassFile cu = (ClassFile) result1_bindingAndBlack[1];
		ElementToModule cu2m = (ElementToModule) result1_bindingAndBlack[2];
		TModule module = (TModule) result1_bindingAndBlack[3];
		TPackage tp = (TPackage) result1_bindingAndBlack[4];
		PackageToTPackage p2p = (PackageToTPackage) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_1_1_performtransformation_greenBB(module,
				tp);

		Object[] result2_green = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, p, cu, cu2m,
						module, tp, p2p);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[p] = " + p + ", " + "[cu] = " + cu + ", " + "[cu2m] = " + cu2m + ", " + "[module] = "
					+ module + ", " + "[tp] = " + tp + ", " + "[p2p] = " + p2p + ".");
		}
		ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_1_3_bookkeepingforedges_greenBBBBBFFF(
				ruleresult, p, cu, module, tp);
		//nothing EMoflonEdge cu__p____package = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge module__tp____namespace = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tp__module____modules = (EMoflonEdge) result3_green[7];

		// 
		// 
		ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, p, cu, cu2m, module, tp, p2p);
		return ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.Package p = (org.eclipse.modisco.java.Package) result2_binding[0];
		ClassFile cu = (ClassFile) result2_binding[1];
		for (Object[] result2_black : ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_2_2_corematch_blackBBFFFFB(p, cu, match)) {
			ElementToModule cu2m = (ElementToModule) result2_black[2];
			TModule module = (TModule) result2_black[3];
			TPackage tp = (TPackage) result2_black[4];
			PackageToTPackage p2p = (PackageToTPackage) result2_black[5];
			// ForEach 
			for (Object[] result3_black : ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_2_3_findcontext_blackBBBBBB(p, cu, cu2m, module, tp, p2p)) {
				Object[] result3_green = ClassFilePackageToNamespaceImpl
						.pattern_ClassFilePackageToNamespace_2_3_findcontext_greenBBBBBBFFFFFF(p, cu, cu2m, module, tp,
								p2p);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge cu2m__cu____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge cu__p____package = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge p2p__tp____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge p2p__p____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge cu2m__module____target = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = ClassFilePackageToNamespaceImpl
						.pattern_ClassFilePackageToNamespace_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, p, cu, cu2m, module, tp, p2p);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p] = " + p + ", " + "[cu] = " + cu
							+ ", " + "[cu2m] = " + cu2m + ", " + "[module] = " + module + ", " + "[tp] = " + tp + ", "
							+ "[p2p] = " + p2p + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = ClassFilePackageToNamespaceImpl
							.pattern_ClassFilePackageToNamespace_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassFilePackageToNamespaceImpl
							.pattern_ClassFilePackageToNamespace_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.modisco.java.Package p, ClassFile cu) {
		match.registerObject("p", p);
		match.registerObject("cu", cu);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.modisco.java.Package p, ClassFile cu) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package p,
			ClassFile cu, ElementToModule cu2m, TModule module, TPackage tp, PackageToTPackage p2p) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("cu", cu);
		isApplicableMatch.registerObject("cu2m", cu2m);
		isApplicableMatch.registerObject("module", module);
		isApplicableMatch.registerObject("tp", tp);
		isApplicableMatch.registerObject("p2p", p2p);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject p, EObject cu, EObject cu2m, EObject module,
			EObject tp, EObject p2p) {
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("cu", cu);
		ruleresult.registerObject("cu2m", cu2m);
		ruleresult.registerObject("module", module);
		ruleresult.registerObject("tp", tp);
		ruleresult.registerObject("p2p", p2p);

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
	public boolean isAppropriate_BWD(Match match, TModule module, TPackage tp) {

		Object[] result1_black = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_10_1_initialbindings_blackBBBB(this, match, module, tp);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[module] = " + module + ", " + "[tp] = " + tp + ".");
		}

		Object[] result2_bindingAndBlack = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, module, tp);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[module] = " + module + ", " + "[tp] = " + tp + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_10_4_collectelementstobetranslated_blackBBB(match, module, tp);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[module] = " + module + ", " + "[tp] = " + tp + ".");
			}
			ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_10_4_collectelementstobetranslated_greenBBBFF(match, module,
							tp);
			//nothing EMoflonEdge module__tp____namespace = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tp__module____modules = (EMoflonEdge) result4_green[4];

			Object[] result5_black = ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_10_5_collectcontextelements_blackBBB(match, module, tp);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[module] = " + module + ", " + "[tp] = " + tp + ".");
			}
			ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_10_5_collectcontextelements_greenBBB(match, module, tp);

			// 
			ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_10_6_registerobjectstomatch_expressionBBBB(this, match, module,
							tp);
			return ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_10_7_expressionF();
		} else {
			return ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.modisco.java.Package p = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[0];
		ClassFile cu = (ClassFile) result1_bindingAndBlack[1];
		ElementToModule cu2m = (ElementToModule) result1_bindingAndBlack[2];
		TModule module = (TModule) result1_bindingAndBlack[3];
		TPackage tp = (TPackage) result1_bindingAndBlack[4];
		PackageToTPackage p2p = (PackageToTPackage) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_11_1_performtransformation_greenBB(p, cu);

		Object[] result2_green = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, p, cu, cu2m,
						module, tp, p2p);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[p] = " + p + ", " + "[cu] = " + cu + ", " + "[cu2m] = " + cu2m + ", " + "[module] = "
					+ module + ", " + "[tp] = " + tp + ", " + "[p2p] = " + p2p + ".");
		}
		ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_11_3_bookkeepingforedges_greenBBBBBFFF(
				ruleresult, p, cu, module, tp);
		//nothing EMoflonEdge cu__p____package = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge module__tp____namespace = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tp__module____modules = (EMoflonEdge) result3_green[7];

		// 
		// 
		ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_11_5_registerobjects_expressionBBBBBBBB(
				this, ruleresult, p, cu, cu2m, module, tp, p2p);
		return ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TModule module = (TModule) result2_binding[0];
		TPackage tp = (TPackage) result2_binding[1];
		for (Object[] result2_black : ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_12_2_corematch_blackFFFBBFB(module, tp, match)) {
			org.eclipse.modisco.java.Package p = (org.eclipse.modisco.java.Package) result2_black[0];
			ClassFile cu = (ClassFile) result2_black[1];
			ElementToModule cu2m = (ElementToModule) result2_black[2];
			PackageToTPackage p2p = (PackageToTPackage) result2_black[5];
			// ForEach 
			for (Object[] result3_black : ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_12_3_findcontext_blackBBBBBB(p, cu, cu2m, module, tp, p2p)) {
				Object[] result3_green = ClassFilePackageToNamespaceImpl
						.pattern_ClassFilePackageToNamespace_12_3_findcontext_greenBBBBBBFFFFFFF(p, cu, cu2m, module,
								tp, p2p);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge cu2m__cu____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge p2p__tp____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge p2p__p____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge module__tp____namespace = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tp__module____modules = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge cu2m__module____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = ClassFilePackageToNamespaceImpl
						.pattern_ClassFilePackageToNamespace_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, p, cu, cu2m, module, tp, p2p);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p] = " + p + ", " + "[cu] = " + cu
							+ ", " + "[cu2m] = " + cu2m + ", " + "[module] = " + module + ", " + "[tp] = " + tp + ", "
							+ "[p2p] = " + p2p + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ClassFilePackageToNamespaceImpl
						.pattern_ClassFilePackageToNamespace_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ClassFilePackageToNamespaceImpl
							.pattern_ClassFilePackageToNamespace_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ClassFilePackageToNamespaceImpl
							.pattern_ClassFilePackageToNamespace_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TModule module, TPackage tp) {
		match.registerObject("module", module);
		match.registerObject("tp", tp);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TModule module, TPackage tp) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package p,
			ClassFile cu, ElementToModule cu2m, TModule module, TPackage tp, PackageToTPackage p2p) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("cu", cu);
		isApplicableMatch.registerObject("cu2m", cu2m);
		isApplicableMatch.registerObject("module", module);
		isApplicableMatch.registerObject("tp", tp);
		isApplicableMatch.registerObject("p2p", p2p);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject p, EObject cu, EObject cu2m, EObject module,
			EObject tp, EObject p2p) {
		ruleresult.registerObject("p", p);
		ruleresult.registerObject("cu", cu);
		ruleresult.registerObject("cu2m", cu2m);
		ruleresult.registerObject("module", module);
		ruleresult.registerObject("tp", tp);
		ruleresult.registerObject("p2p", p2p);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_157(EMoflonEdge _edge_namespace) {

		Object[] result1_bindingAndBlack = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_20_2_testcorematchandDECs_blackFFB(_edge_namespace)) {
			TModule module = (TModule) result2_black[0];
			TPackage tp = (TPackage) result2_black[1];
			Object[] result2_green = ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, module, tp)) {
				// 
				if (ClassFilePackageToNamespaceImpl
						.pattern_ClassFilePackageToNamespace_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ClassFilePackageToNamespaceImpl
							.pattern_ClassFilePackageToNamespace_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassFilePackageToNamespaceImpl
							.pattern_ClassFilePackageToNamespace_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_173(EMoflonEdge _edge_package) {

		Object[] result1_bindingAndBlack = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_21_2_testcorematchandDECs_blackFFB(_edge_package)) {
			org.eclipse.modisco.java.Package p = (org.eclipse.modisco.java.Package) result2_black[0];
			ClassFile cu = (ClassFile) result2_black[1];
			Object[] result2_green = ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, p, cu)) {
				// 
				if (ClassFilePackageToNamespaceImpl
						.pattern_ClassFilePackageToNamespace_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ClassFilePackageToNamespaceImpl
							.pattern_ClassFilePackageToNamespace_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ClassFilePackageToNamespaceImpl
							.pattern_ClassFilePackageToNamespace_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ClassFilePackageToNamespace");
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
		ruleResult.setRule("ClassFilePackageToNamespace");
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

		Object[] result1_black = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.modisco.java.Package p = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[0];
		ClassFile cu = (ClassFile) result2_bindingAndBlack[1];
		TModule module = (TModule) result2_bindingAndBlack[2];
		TPackage tp = (TPackage) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, p, cu, module, tp,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[p] = " + p + ", " + "[cu] = " + cu + ", " + "[module] = " + module + ", " + "[tp] = " + tp
					+ ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_24_5_matchcorrcontext_blackBBFBBFBB(p, cu, module, tp,
							sourceMatch, targetMatch)) {
				ElementToModule cu2m = (ElementToModule) result5_black[2];
				PackageToTPackage p2p = (PackageToTPackage) result5_black[5];
				Object[] result5_green = ClassFilePackageToNamespaceImpl
						.pattern_ClassFilePackageToNamespace_24_5_matchcorrcontext_greenBBBBF(cu2m, p2p, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = ClassFilePackageToNamespaceImpl
						.pattern_ClassFilePackageToNamespace_24_6_createcorrespondence_blackBBBBB(p, cu, module, tp,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[p] = " + p + ", "
							+ "[cu] = " + cu + ", " + "[module] = " + module + ", " + "[tp] = " + tp + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = ClassFilePackageToNamespaceImpl
						.pattern_ClassFilePackageToNamespace_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ClassFilePackageToNamespaceImpl
						.pattern_ClassFilePackageToNamespace_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.modisco.java.Package p, ClassFile cu, TModule module, TPackage tp,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.Package p, ClassFile cu) {// 
		Object[] result1_black = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_27_1_matchtggpattern_blackBB(p, cu);
		if (result1_black != null) {
			return ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_27_2_expressionF();
		} else {
			return ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TModule module, TPackage tp) {// 
		Object[] result1_black = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_28_1_matchtggpattern_blackBB(module, tp);
		if (result1_black != null) {
			return ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_28_2_expressionF();
		} else {
			return ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, PackageToTPackage p2pParameter,
			ElementToModule cu2mParameter) {

		Object[] result1_black = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ClassFilePackageToNamespaceImpl
				.pattern_ClassFilePackageToNamespace_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList p2pList = (RuleEntryList) result2_black[0];
			org.eclipse.modisco.java.Package p = (org.eclipse.modisco.java.Package) result2_black[1];
			PackageToTPackage p2p = (PackageToTPackage) result2_black[2];
			TPackage tp = (TPackage) result2_black[3];
			//nothing RuleEntryList cu2mList = (RuleEntryList) result2_black[4];
			ClassFile cu = (ClassFile) result2_black[5];
			ElementToModule cu2m = (ElementToModule) result2_black[6];
			TModule module = (TModule) result2_black[7];

			Object[] result3_bindingAndBlack = ClassFilePackageToNamespaceImpl
					.pattern_ClassFilePackageToNamespace_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, p, cu, cu2m, module, tp, p2p, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[p] = " + p + ", " + "[cu] = " + cu
						+ ", " + "[cu2m] = " + cu2m + ", " + "[module] = " + module + ", " + "[tp] = " + tp + ", "
						+ "[p2p] = " + p2p + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = ClassFilePackageToNamespaceImpl
						.pattern_ClassFilePackageToNamespace_29_5_checknacs_blackBBBBBB(p, cu, cu2m, module, tp, p2p);
				if (result5_black != null) {

					Object[] result6_black = ClassFilePackageToNamespaceImpl
							.pattern_ClassFilePackageToNamespace_29_6_perform_blackBBBBBBB(p, cu, cu2m, module, tp, p2p,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[p] = " + p + ", " + "[cu] = " + cu
										+ ", " + "[cu2m] = " + cu2m + ", " + "[module] = " + module + ", " + "[tp] = "
										+ tp + ", " + "[p2p] = " + p2p + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_29_6_perform_greenBBBBB(p, cu,
							module, tp, ruleResult);

				} else {
				}

			} else {
			}

		}
		return ClassFilePackageToNamespaceImpl.pattern_ClassFilePackageToNamespace_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package p,
			ClassFile cu, ElementToModule cu2m, TModule module, TPackage tp, PackageToTPackage p2p,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("p", p);
		isApplicableMatch.registerObject("cu", cu);
		isApplicableMatch.registerObject("cu2m", cu2m);
		isApplicableMatch.registerObject("module", module);
		isApplicableMatch.registerObject("tp", tp);
		isApplicableMatch.registerObject("p2p", p2p);
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
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___IS_APPROPRIATE_FWD__MATCH_PACKAGE_CLASSFILE:
			return isAppropriate_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(ClassFile) arguments.get(2));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGE_CLASSFILE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(ClassFile) arguments.get(2));
			return null;
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGE_CLASSFILE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (ClassFile) arguments.get(2));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGE_CLASSFILE_ELEMENTTOMODULE_TMODULE_TPACKAGE_PACKAGETOTPACKAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (ClassFile) arguments.get(2),
					(ElementToModule) arguments.get(3), (TModule) arguments.get(4), (TPackage) arguments.get(5),
					(PackageToTPackage) arguments.get(6));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___IS_APPROPRIATE_BWD__MATCH_TMODULE_TPACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0), (TModule) arguments.get(1), (TPackage) arguments.get(2));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMODULE_TPACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TModule) arguments.get(1),
					(TPackage) arguments.get(2));
			return null;
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMODULE_TPACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TModule) arguments.get(1),
					(TPackage) arguments.get(2));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGE_CLASSFILE_ELEMENTTOMODULE_TMODULE_TPACKAGE_PACKAGETOTPACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (ClassFile) arguments.get(2),
					(ElementToModule) arguments.get(3), (TModule) arguments.get(4), (TPackage) arguments.get(5),
					(PackageToTPackage) arguments.get(6));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_157__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_157((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_173__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_173((EMoflonEdge) arguments.get(0));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___IS_APPLICABLE_SOLVE_CSP_CC__PACKAGE_CLASSFILE_TMODULE_TPACKAGE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.modisco.java.Package) arguments.get(0),
					(ClassFile) arguments.get(1), (TModule) arguments.get(2), (TPackage) arguments.get(3),
					(Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___CHECK_DEC_FWD__PACKAGE_CLASSFILE:
			return checkDEC_FWD((org.eclipse.modisco.java.Package) arguments.get(0), (ClassFile) arguments.get(1));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___CHECK_DEC_BWD__TMODULE_TPACKAGE:
			return checkDEC_BWD((TModule) arguments.get(0), (TPackage) arguments.get(1));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGETOTPACKAGE_ELEMENTTOMODULE:
			return generateModel((RuleEntryContainer) arguments.get(0), (PackageToTPackage) arguments.get(1),
					(ElementToModule) arguments.get(2));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGE_CLASSFILE_ELEMENTTOMODULE_TMODULE_TPACKAGE_PACKAGETOTPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (ClassFile) arguments.get(2),
					(ElementToModule) arguments.get(3), (TModule) arguments.get(4), (TPackage) arguments.get(5),
					(PackageToTPackage) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.CLASS_FILE_PACKAGE_TO_NAMESPACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_0_1_initialbindings_blackBBBB(
			ClassFilePackageToNamespace _this, Match match, org.eclipse.modisco.java.Package p, ClassFile cu) {
		return new Object[] { _this, match, p, cu };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_0_2_SolveCSP_bindingFBBBB(
			ClassFilePackageToNamespace _this, Match match, org.eclipse.modisco.java.Package p, ClassFile cu) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, p, cu);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, p, cu };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_0_2_SolveCSP_bindingAndBlackFBBBB(
			ClassFilePackageToNamespace _this, Match match, org.eclipse.modisco.java.Package p, ClassFile cu) {
		Object[] result_pattern_ClassFilePackageToNamespace_0_2_SolveCSP_binding = pattern_ClassFilePackageToNamespace_0_2_SolveCSP_bindingFBBBB(
				_this, match, p, cu);
		if (result_pattern_ClassFilePackageToNamespace_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassFilePackageToNamespace_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassFilePackageToNamespace_0_2_SolveCSP_black = pattern_ClassFilePackageToNamespace_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassFilePackageToNamespace_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, p, cu };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassFilePackageToNamespace_0_3_CheckCSP_expressionFBB(
			ClassFilePackageToNamespace _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_0_4_collectelementstobetranslated_blackBBB(
			Match match, org.eclipse.modisco.java.Package p, ClassFile cu) {
		return new Object[] { match, p, cu };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_0_4_collectelementstobetranslated_greenBBBF(
			Match match, org.eclipse.modisco.java.Package p, ClassFile cu) {
		EMoflonEdge cu__p____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cu__p____package_name_prime = "package";
		cu__p____package.setSrc(cu);
		cu__p____package.setTrg(p);
		match.getToBeTranslatedEdges().add(cu__p____package);
		cu__p____package.setName(cu__p____package_name_prime);
		return new Object[] { match, p, cu, cu__p____package };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_0_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.modisco.java.Package p, ClassFile cu) {
		return new Object[] { match, p, cu };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_0_5_collectcontextelements_greenBBB(Match match,
			org.eclipse.modisco.java.Package p, ClassFile cu) {
		match.getContextNodes().add(p);
		match.getContextNodes().add(cu);
		return new Object[] { match, p, cu };
	}

	public static final void pattern_ClassFilePackageToNamespace_0_6_registerobjectstomatch_expressionBBBB(
			ClassFilePackageToNamespace _this, Match match, org.eclipse.modisco.java.Package p, ClassFile cu) {
		_this.registerObjectsToMatch_FWD(match, p, cu);

	}

	public static final boolean pattern_ClassFilePackageToNamespace_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassFilePackageToNamespace_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("p");
		EObject _localVariable_1 = isApplicableMatch.getObject("cu");
		EObject _localVariable_2 = isApplicableMatch.getObject("cu2m");
		EObject _localVariable_3 = isApplicableMatch.getObject("module");
		EObject _localVariable_4 = isApplicableMatch.getObject("tp");
		EObject _localVariable_5 = isApplicableMatch.getObject("p2p");
		EObject tmpP = _localVariable_0;
		EObject tmpCu = _localVariable_1;
		EObject tmpCu2m = _localVariable_2;
		EObject tmpModule = _localVariable_3;
		EObject tmpTp = _localVariable_4;
		EObject tmpP2p = _localVariable_5;
		if (tmpP instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package p = (org.eclipse.modisco.java.Package) tmpP;
			if (tmpCu instanceof ClassFile) {
				ClassFile cu = (ClassFile) tmpCu;
				if (tmpCu2m instanceof ElementToModule) {
					ElementToModule cu2m = (ElementToModule) tmpCu2m;
					if (tmpModule instanceof TModule) {
						TModule module = (TModule) tmpModule;
						if (tmpTp instanceof TPackage) {
							TPackage tp = (TPackage) tmpTp;
							if (tmpP2p instanceof PackageToTPackage) {
								PackageToTPackage p2p = (PackageToTPackage) tmpP2p;
								return new Object[] { p, cu, cu2m, module, tp, p2p, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_1_1_performtransformation_blackBBBBBBFBB(
			org.eclipse.modisco.java.Package p, ClassFile cu, ElementToModule cu2m, TModule module, TPackage tp,
			PackageToTPackage p2p, ClassFilePackageToNamespace _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { p, cu, cu2m, module, tp, p2p, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			ClassFilePackageToNamespace _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassFilePackageToNamespace_1_1_performtransformation_binding = pattern_ClassFilePackageToNamespace_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassFilePackageToNamespace_1_1_performtransformation_binding != null) {
			org.eclipse.modisco.java.Package p = (org.eclipse.modisco.java.Package) result_pattern_ClassFilePackageToNamespace_1_1_performtransformation_binding[0];
			ClassFile cu = (ClassFile) result_pattern_ClassFilePackageToNamespace_1_1_performtransformation_binding[1];
			ElementToModule cu2m = (ElementToModule) result_pattern_ClassFilePackageToNamespace_1_1_performtransformation_binding[2];
			TModule module = (TModule) result_pattern_ClassFilePackageToNamespace_1_1_performtransformation_binding[3];
			TPackage tp = (TPackage) result_pattern_ClassFilePackageToNamespace_1_1_performtransformation_binding[4];
			PackageToTPackage p2p = (PackageToTPackage) result_pattern_ClassFilePackageToNamespace_1_1_performtransformation_binding[5];

			Object[] result_pattern_ClassFilePackageToNamespace_1_1_performtransformation_black = pattern_ClassFilePackageToNamespace_1_1_performtransformation_blackBBBBBBFBB(
					p, cu, cu2m, module, tp, p2p, _this, isApplicableMatch);
			if (result_pattern_ClassFilePackageToNamespace_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassFilePackageToNamespace_1_1_performtransformation_black[6];

				return new Object[] { p, cu, cu2m, module, tp, p2p, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_1_1_performtransformation_greenBB(TModule module,
			TPackage tp) {
		module.setNamespace(tp);
		return new Object[] { module, tp };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject p, EObject cu, EObject cu2m, EObject module, EObject tp,
			EObject p2p) {
		if (!p.equals(tp)) {
			if (!p.equals(p2p)) {
				if (!cu.equals(p)) {
					if (!cu.equals(cu2m)) {
						if (!cu.equals(module)) {
							if (!cu.equals(tp)) {
								if (!cu.equals(p2p)) {
									if (!cu2m.equals(p)) {
										if (!cu2m.equals(module)) {
											if (!cu2m.equals(tp)) {
												if (!cu2m.equals(p2p)) {
													if (!module.equals(p)) {
														if (!module.equals(tp)) {
															if (!module.equals(p2p)) {
																if (!p2p.equals(tp)) {
																	return new Object[] { ruleresult, p, cu, cu2m,
																			module, tp, p2p };
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

	public static final Object[] pattern_ClassFilePackageToNamespace_1_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject p, EObject cu, EObject module, EObject tp) {
		EMoflonEdge cu__p____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge module__tp____namespace = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tp__module____modules = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassFilePackageToNamespace";
		String cu__p____package_name_prime = "package";
		String module__tp____namespace_name_prime = "namespace";
		String tp__module____modules_name_prime = "modules";
		cu__p____package.setSrc(cu);
		cu__p____package.setTrg(p);
		ruleresult.getTranslatedEdges().add(cu__p____package);
		module__tp____namespace.setSrc(module);
		module__tp____namespace.setTrg(tp);
		ruleresult.getCreatedEdges().add(module__tp____namespace);
		tp__module____modules.setSrc(tp);
		tp__module____modules.setTrg(module);
		ruleresult.getCreatedEdges().add(tp__module____modules);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		cu__p____package.setName(cu__p____package_name_prime);
		module__tp____namespace.setName(module__tp____namespace_name_prime);
		tp__module____modules.setName(tp__module____modules_name_prime);
		return new Object[] { ruleresult, p, cu, module, tp, cu__p____package, module__tp____namespace,
				tp__module____modules };
	}

	public static final void pattern_ClassFilePackageToNamespace_1_5_registerobjects_expressionBBBBBBBB(
			ClassFilePackageToNamespace _this, PerformRuleResult ruleresult, EObject p, EObject cu, EObject cu2m,
			EObject module, EObject tp, EObject p2p) {
		_this.registerObjects_FWD(ruleresult, p, cu, cu2m, module, tp, p2p);

	}

	public static final PerformRuleResult pattern_ClassFilePackageToNamespace_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_2_1_preparereturnvalue_bindingFB(
			ClassFilePackageToNamespace _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassFilePackageToNamespace _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_2_1_preparereturnvalue_bindingAndBlackFFB(
			ClassFilePackageToNamespace _this) {
		Object[] result_pattern_ClassFilePackageToNamespace_2_1_preparereturnvalue_binding = pattern_ClassFilePackageToNamespace_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassFilePackageToNamespace_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassFilePackageToNamespace_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassFilePackageToNamespace_2_1_preparereturnvalue_black = pattern_ClassFilePackageToNamespace_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassFilePackageToNamespace_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassFilePackageToNamespace_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassFilePackageToNamespace";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("p");
		EObject _localVariable_1 = match.getObject("cu");
		EObject tmpP = _localVariable_0;
		EObject tmpCu = _localVariable_1;
		if (tmpP instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package p = (org.eclipse.modisco.java.Package) tmpP;
			if (tmpCu instanceof ClassFile) {
				ClassFile cu = (ClassFile) tmpCu;
				return new Object[] { p, cu, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassFilePackageToNamespace_2_2_corematch_blackBBFFFFB(
			org.eclipse.modisco.java.Package p, ClassFile cu, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ElementToModule cu2m : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cu,
				ElementToModule.class, "source")) {
			TModule module = cu2m.getTarget();
			if (module != null) {
				for (PackageToTPackage p2p : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(p,
						PackageToTPackage.class, "source")) {
					TPackage tp = p2p.getTarget();
					if (tp != null) {
						_result.add(new Object[] { p, cu, cu2m, module, tp, p2p, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassFilePackageToNamespace_2_3_findcontext_blackBBBBBB(
			org.eclipse.modisco.java.Package p, ClassFile cu, ElementToModule cu2m, TModule module, TPackage tp,
			PackageToTPackage p2p) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (cu.equals(cu2m.getSource())) {
			if (p.equals(cu.getPackage())) {
				if (tp.equals(p2p.getTarget())) {
					if (p.equals(p2p.getSource())) {
						if (module.equals(cu2m.getTarget())) {
							_result.add(new Object[] { p, cu, cu2m, module, tp, p2p });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_2_3_findcontext_greenBBBBBBFFFFFF(
			org.eclipse.modisco.java.Package p, ClassFile cu, ElementToModule cu2m, TModule module, TPackage tp,
			PackageToTPackage p2p) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge cu2m__cu____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cu__p____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__tp____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__p____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cu2m__module____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cu2m__cu____source_name_prime = "source";
		String cu__p____package_name_prime = "package";
		String p2p__tp____target_name_prime = "target";
		String p2p__p____source_name_prime = "source";
		String cu2m__module____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(cu);
		isApplicableMatch.getAllContextElements().add(cu2m);
		isApplicableMatch.getAllContextElements().add(module);
		isApplicableMatch.getAllContextElements().add(tp);
		isApplicableMatch.getAllContextElements().add(p2p);
		cu2m__cu____source.setSrc(cu2m);
		cu2m__cu____source.setTrg(cu);
		isApplicableMatch.getAllContextElements().add(cu2m__cu____source);
		cu__p____package.setSrc(cu);
		cu__p____package.setTrg(p);
		isApplicableMatch.getAllContextElements().add(cu__p____package);
		p2p__tp____target.setSrc(p2p);
		p2p__tp____target.setTrg(tp);
		isApplicableMatch.getAllContextElements().add(p2p__tp____target);
		p2p__p____source.setSrc(p2p);
		p2p__p____source.setTrg(p);
		isApplicableMatch.getAllContextElements().add(p2p__p____source);
		cu2m__module____target.setSrc(cu2m);
		cu2m__module____target.setTrg(module);
		isApplicableMatch.getAllContextElements().add(cu2m__module____target);
		cu2m__cu____source.setName(cu2m__cu____source_name_prime);
		cu__p____package.setName(cu__p____package_name_prime);
		p2p__tp____target.setName(p2p__tp____target_name_prime);
		p2p__p____source.setName(p2p__p____source_name_prime);
		cu2m__module____target.setName(cu2m__module____target_name_prime);
		return new Object[] { p, cu, cu2m, module, tp, p2p, isApplicableMatch, cu2m__cu____source, cu__p____package,
				p2p__tp____target, p2p__p____source, cu2m__module____target };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_2_4_solveCSP_bindingFBBBBBBBB(
			ClassFilePackageToNamespace _this, IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package p,
			ClassFile cu, ElementToModule cu2m, TModule module, TPackage tp, PackageToTPackage p2p) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, p, cu, cu2m, module, tp, p2p);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p, cu, cu2m, module, tp, p2p };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			ClassFilePackageToNamespace _this, IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package p,
			ClassFile cu, ElementToModule cu2m, TModule module, TPackage tp, PackageToTPackage p2p) {
		Object[] result_pattern_ClassFilePackageToNamespace_2_4_solveCSP_binding = pattern_ClassFilePackageToNamespace_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, p, cu, cu2m, module, tp, p2p);
		if (result_pattern_ClassFilePackageToNamespace_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassFilePackageToNamespace_2_4_solveCSP_binding[0];

			Object[] result_pattern_ClassFilePackageToNamespace_2_4_solveCSP_black = pattern_ClassFilePackageToNamespace_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassFilePackageToNamespace_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p, cu, cu2m, module, tp, p2p };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassFilePackageToNamespace_2_5_checkCSP_expressionFBB(
			ClassFilePackageToNamespace _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassFilePackageToNamespace";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassFilePackageToNamespace_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_10_1_initialbindings_blackBBBB(
			ClassFilePackageToNamespace _this, Match match, TModule module, TPackage tp) {
		return new Object[] { _this, match, module, tp };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_10_2_SolveCSP_bindingFBBBB(
			ClassFilePackageToNamespace _this, Match match, TModule module, TPackage tp) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, module, tp);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, module, tp };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_10_2_SolveCSP_bindingAndBlackFBBBB(
			ClassFilePackageToNamespace _this, Match match, TModule module, TPackage tp) {
		Object[] result_pattern_ClassFilePackageToNamespace_10_2_SolveCSP_binding = pattern_ClassFilePackageToNamespace_10_2_SolveCSP_bindingFBBBB(
				_this, match, module, tp);
		if (result_pattern_ClassFilePackageToNamespace_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassFilePackageToNamespace_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ClassFilePackageToNamespace_10_2_SolveCSP_black = pattern_ClassFilePackageToNamespace_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ClassFilePackageToNamespace_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, module, tp };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassFilePackageToNamespace_10_3_CheckCSP_expressionFBB(
			ClassFilePackageToNamespace _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_10_4_collectelementstobetranslated_blackBBB(
			Match match, TModule module, TPackage tp) {
		return new Object[] { match, module, tp };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, TModule module, TPackage tp) {
		EMoflonEdge module__tp____namespace = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tp__module____modules = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String module__tp____namespace_name_prime = "namespace";
		String tp__module____modules_name_prime = "modules";
		module__tp____namespace.setSrc(module);
		module__tp____namespace.setTrg(tp);
		match.getToBeTranslatedEdges().add(module__tp____namespace);
		tp__module____modules.setSrc(tp);
		tp__module____modules.setTrg(module);
		match.getToBeTranslatedEdges().add(tp__module____modules);
		module__tp____namespace.setName(module__tp____namespace_name_prime);
		tp__module____modules.setName(tp__module____modules_name_prime);
		return new Object[] { match, module, tp, module__tp____namespace, tp__module____modules };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_10_5_collectcontextelements_blackBBB(Match match,
			TModule module, TPackage tp) {
		return new Object[] { match, module, tp };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_10_5_collectcontextelements_greenBBB(Match match,
			TModule module, TPackage tp) {
		match.getContextNodes().add(module);
		match.getContextNodes().add(tp);
		return new Object[] { match, module, tp };
	}

	public static final void pattern_ClassFilePackageToNamespace_10_6_registerobjectstomatch_expressionBBBB(
			ClassFilePackageToNamespace _this, Match match, TModule module, TPackage tp) {
		_this.registerObjectsToMatch_BWD(match, module, tp);

	}

	public static final boolean pattern_ClassFilePackageToNamespace_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassFilePackageToNamespace_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("p");
		EObject _localVariable_1 = isApplicableMatch.getObject("cu");
		EObject _localVariable_2 = isApplicableMatch.getObject("cu2m");
		EObject _localVariable_3 = isApplicableMatch.getObject("module");
		EObject _localVariable_4 = isApplicableMatch.getObject("tp");
		EObject _localVariable_5 = isApplicableMatch.getObject("p2p");
		EObject tmpP = _localVariable_0;
		EObject tmpCu = _localVariable_1;
		EObject tmpCu2m = _localVariable_2;
		EObject tmpModule = _localVariable_3;
		EObject tmpTp = _localVariable_4;
		EObject tmpP2p = _localVariable_5;
		if (tmpP instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package p = (org.eclipse.modisco.java.Package) tmpP;
			if (tmpCu instanceof ClassFile) {
				ClassFile cu = (ClassFile) tmpCu;
				if (tmpCu2m instanceof ElementToModule) {
					ElementToModule cu2m = (ElementToModule) tmpCu2m;
					if (tmpModule instanceof TModule) {
						TModule module = (TModule) tmpModule;
						if (tmpTp instanceof TPackage) {
							TPackage tp = (TPackage) tmpTp;
							if (tmpP2p instanceof PackageToTPackage) {
								PackageToTPackage p2p = (PackageToTPackage) tmpP2p;
								return new Object[] { p, cu, cu2m, module, tp, p2p, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_11_1_performtransformation_blackBBBBBBFBB(
			org.eclipse.modisco.java.Package p, ClassFile cu, ElementToModule cu2m, TModule module, TPackage tp,
			PackageToTPackage p2p, ClassFilePackageToNamespace _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { p, cu, cu2m, module, tp, p2p, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			ClassFilePackageToNamespace _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ClassFilePackageToNamespace_11_1_performtransformation_binding = pattern_ClassFilePackageToNamespace_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ClassFilePackageToNamespace_11_1_performtransformation_binding != null) {
			org.eclipse.modisco.java.Package p = (org.eclipse.modisco.java.Package) result_pattern_ClassFilePackageToNamespace_11_1_performtransformation_binding[0];
			ClassFile cu = (ClassFile) result_pattern_ClassFilePackageToNamespace_11_1_performtransformation_binding[1];
			ElementToModule cu2m = (ElementToModule) result_pattern_ClassFilePackageToNamespace_11_1_performtransformation_binding[2];
			TModule module = (TModule) result_pattern_ClassFilePackageToNamespace_11_1_performtransformation_binding[3];
			TPackage tp = (TPackage) result_pattern_ClassFilePackageToNamespace_11_1_performtransformation_binding[4];
			PackageToTPackage p2p = (PackageToTPackage) result_pattern_ClassFilePackageToNamespace_11_1_performtransformation_binding[5];

			Object[] result_pattern_ClassFilePackageToNamespace_11_1_performtransformation_black = pattern_ClassFilePackageToNamespace_11_1_performtransformation_blackBBBBBBFBB(
					p, cu, cu2m, module, tp, p2p, _this, isApplicableMatch);
			if (result_pattern_ClassFilePackageToNamespace_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ClassFilePackageToNamespace_11_1_performtransformation_black[6];

				return new Object[] { p, cu, cu2m, module, tp, p2p, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_11_1_performtransformation_greenBB(
			org.eclipse.modisco.java.Package p, ClassFile cu) {
		cu.setPackage(p);
		return new Object[] { p, cu };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject p, EObject cu, EObject cu2m, EObject module, EObject tp,
			EObject p2p) {
		if (!p.equals(tp)) {
			if (!p.equals(p2p)) {
				if (!cu.equals(p)) {
					if (!cu.equals(cu2m)) {
						if (!cu.equals(module)) {
							if (!cu.equals(tp)) {
								if (!cu.equals(p2p)) {
									if (!cu2m.equals(p)) {
										if (!cu2m.equals(module)) {
											if (!cu2m.equals(tp)) {
												if (!cu2m.equals(p2p)) {
													if (!module.equals(p)) {
														if (!module.equals(tp)) {
															if (!module.equals(p2p)) {
																if (!p2p.equals(tp)) {
																	return new Object[] { ruleresult, p, cu, cu2m,
																			module, tp, p2p };
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

	public static final Object[] pattern_ClassFilePackageToNamespace_11_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject p, EObject cu, EObject module, EObject tp) {
		EMoflonEdge cu__p____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge module__tp____namespace = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tp__module____modules = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ClassFilePackageToNamespace";
		String cu__p____package_name_prime = "package";
		String module__tp____namespace_name_prime = "namespace";
		String tp__module____modules_name_prime = "modules";
		cu__p____package.setSrc(cu);
		cu__p____package.setTrg(p);
		ruleresult.getCreatedEdges().add(cu__p____package);
		module__tp____namespace.setSrc(module);
		module__tp____namespace.setTrg(tp);
		ruleresult.getTranslatedEdges().add(module__tp____namespace);
		tp__module____modules.setSrc(tp);
		tp__module____modules.setTrg(module);
		ruleresult.getTranslatedEdges().add(tp__module____modules);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		cu__p____package.setName(cu__p____package_name_prime);
		module__tp____namespace.setName(module__tp____namespace_name_prime);
		tp__module____modules.setName(tp__module____modules_name_prime);
		return new Object[] { ruleresult, p, cu, module, tp, cu__p____package, module__tp____namespace,
				tp__module____modules };
	}

	public static final void pattern_ClassFilePackageToNamespace_11_5_registerobjects_expressionBBBBBBBB(
			ClassFilePackageToNamespace _this, PerformRuleResult ruleresult, EObject p, EObject cu, EObject cu2m,
			EObject module, EObject tp, EObject p2p) {
		_this.registerObjects_BWD(ruleresult, p, cu, cu2m, module, tp, p2p);

	}

	public static final PerformRuleResult pattern_ClassFilePackageToNamespace_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_12_1_preparereturnvalue_bindingFB(
			ClassFilePackageToNamespace _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_12_1_preparereturnvalue_blackFBB(EClass eClass,
			ClassFilePackageToNamespace _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_12_1_preparereturnvalue_bindingAndBlackFFB(
			ClassFilePackageToNamespace _this) {
		Object[] result_pattern_ClassFilePackageToNamespace_12_1_preparereturnvalue_binding = pattern_ClassFilePackageToNamespace_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassFilePackageToNamespace_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ClassFilePackageToNamespace_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassFilePackageToNamespace_12_1_preparereturnvalue_black = pattern_ClassFilePackageToNamespace_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ClassFilePackageToNamespace_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ClassFilePackageToNamespace_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ClassFilePackageToNamespace";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("module");
		EObject _localVariable_1 = match.getObject("tp");
		EObject tmpModule = _localVariable_0;
		EObject tmpTp = _localVariable_1;
		if (tmpModule instanceof TModule) {
			TModule module = (TModule) tmpModule;
			if (tmpTp instanceof TPackage) {
				TPackage tp = (TPackage) tmpTp;
				return new Object[] { module, tp, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassFilePackageToNamespace_12_2_corematch_blackFFFBBFB(
			TModule module, TPackage tp, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PackageToTPackage p2p : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(tp,
				PackageToTPackage.class, "target")) {
			org.eclipse.modisco.java.Package p = p2p.getSource();
			if (p != null) {
				for (ElementToModule cu2m : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(module,
						ElementToModule.class, "target")) {
					NamedElement tmpCu = cu2m.getSource();
					if (tmpCu instanceof ClassFile) {
						ClassFile cu = (ClassFile) tmpCu;
						_result.add(new Object[] { p, cu, cu2m, module, tp, p2p, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassFilePackageToNamespace_12_3_findcontext_blackBBBBBB(
			org.eclipse.modisco.java.Package p, ClassFile cu, ElementToModule cu2m, TModule module, TPackage tp,
			PackageToTPackage p2p) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (cu.equals(cu2m.getSource())) {
			if (tp.equals(p2p.getTarget())) {
				if (p.equals(p2p.getSource())) {
					if (tp.equals(module.getNamespace())) {
						if (module.equals(cu2m.getTarget())) {
							_result.add(new Object[] { p, cu, cu2m, module, tp, p2p });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_12_3_findcontext_greenBBBBBBFFFFFFF(
			org.eclipse.modisco.java.Package p, ClassFile cu, ElementToModule cu2m, TModule module, TPackage tp,
			PackageToTPackage p2p) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge cu2m__cu____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__tp____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__p____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge module__tp____namespace = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tp__module____modules = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cu2m__module____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cu2m__cu____source_name_prime = "source";
		String p2p__tp____target_name_prime = "target";
		String p2p__p____source_name_prime = "source";
		String module__tp____namespace_name_prime = "namespace";
		String tp__module____modules_name_prime = "modules";
		String cu2m__module____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(p);
		isApplicableMatch.getAllContextElements().add(cu);
		isApplicableMatch.getAllContextElements().add(cu2m);
		isApplicableMatch.getAllContextElements().add(module);
		isApplicableMatch.getAllContextElements().add(tp);
		isApplicableMatch.getAllContextElements().add(p2p);
		cu2m__cu____source.setSrc(cu2m);
		cu2m__cu____source.setTrg(cu);
		isApplicableMatch.getAllContextElements().add(cu2m__cu____source);
		p2p__tp____target.setSrc(p2p);
		p2p__tp____target.setTrg(tp);
		isApplicableMatch.getAllContextElements().add(p2p__tp____target);
		p2p__p____source.setSrc(p2p);
		p2p__p____source.setTrg(p);
		isApplicableMatch.getAllContextElements().add(p2p__p____source);
		module__tp____namespace.setSrc(module);
		module__tp____namespace.setTrg(tp);
		isApplicableMatch.getAllContextElements().add(module__tp____namespace);
		tp__module____modules.setSrc(tp);
		tp__module____modules.setTrg(module);
		isApplicableMatch.getAllContextElements().add(tp__module____modules);
		cu2m__module____target.setSrc(cu2m);
		cu2m__module____target.setTrg(module);
		isApplicableMatch.getAllContextElements().add(cu2m__module____target);
		cu2m__cu____source.setName(cu2m__cu____source_name_prime);
		p2p__tp____target.setName(p2p__tp____target_name_prime);
		p2p__p____source.setName(p2p__p____source_name_prime);
		module__tp____namespace.setName(module__tp____namespace_name_prime);
		tp__module____modules.setName(tp__module____modules_name_prime);
		cu2m__module____target.setName(cu2m__module____target_name_prime);
		return new Object[] { p, cu, cu2m, module, tp, p2p, isApplicableMatch, cu2m__cu____source, p2p__tp____target,
				p2p__p____source, module__tp____namespace, tp__module____modules, cu2m__module____target };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_12_4_solveCSP_bindingFBBBBBBBB(
			ClassFilePackageToNamespace _this, IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package p,
			ClassFile cu, ElementToModule cu2m, TModule module, TPackage tp, PackageToTPackage p2p) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, p, cu, cu2m, module, tp, p2p);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p, cu, cu2m, module, tp, p2p };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			ClassFilePackageToNamespace _this, IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package p,
			ClassFile cu, ElementToModule cu2m, TModule module, TPackage tp, PackageToTPackage p2p) {
		Object[] result_pattern_ClassFilePackageToNamespace_12_4_solveCSP_binding = pattern_ClassFilePackageToNamespace_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, p, cu, cu2m, module, tp, p2p);
		if (result_pattern_ClassFilePackageToNamespace_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassFilePackageToNamespace_12_4_solveCSP_binding[0];

			Object[] result_pattern_ClassFilePackageToNamespace_12_4_solveCSP_black = pattern_ClassFilePackageToNamespace_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ClassFilePackageToNamespace_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p, cu, cu2m, module, tp, p2p };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassFilePackageToNamespace_12_5_checkCSP_expressionFBB(
			ClassFilePackageToNamespace _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ClassFilePackageToNamespace";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassFilePackageToNamespace_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_20_1_preparereturnvalue_bindingFB(
			ClassFilePackageToNamespace _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassFilePackageToNamespace _this) {
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

	public static final Object[] pattern_ClassFilePackageToNamespace_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassFilePackageToNamespace _this) {
		Object[] result_pattern_ClassFilePackageToNamespace_20_1_preparereturnvalue_binding = pattern_ClassFilePackageToNamespace_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassFilePackageToNamespace_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassFilePackageToNamespace_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassFilePackageToNamespace_20_1_preparereturnvalue_black = pattern_ClassFilePackageToNamespace_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassFilePackageToNamespace_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassFilePackageToNamespace_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassFilePackageToNamespace_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ClassFilePackageToNamespace_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_namespace) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpModule = _edge_namespace.getSrc();
		if (tmpModule instanceof TModule) {
			TModule module = (TModule) tmpModule;
			EObject tmpTp = _edge_namespace.getTrg();
			if (tmpTp instanceof TPackage) {
				TPackage tp = (TPackage) tmpTp;
				if (tp.equals(module.getNamespace())) {
					_result.add(new Object[] { module, tp, _edge_namespace });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassFilePackageToNamespace_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ClassFilePackageToNamespace _this, Match match, TModule module, TPackage tp) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, module, tp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassFilePackageToNamespace_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassFilePackageToNamespace _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassFilePackageToNamespace_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_21_1_preparereturnvalue_bindingFB(
			ClassFilePackageToNamespace _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ClassFilePackageToNamespace _this) {
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

	public static final Object[] pattern_ClassFilePackageToNamespace_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ClassFilePackageToNamespace _this) {
		Object[] result_pattern_ClassFilePackageToNamespace_21_1_preparereturnvalue_binding = pattern_ClassFilePackageToNamespace_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ClassFilePackageToNamespace_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ClassFilePackageToNamespace_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ClassFilePackageToNamespace_21_1_preparereturnvalue_black = pattern_ClassFilePackageToNamespace_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ClassFilePackageToNamespace_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ClassFilePackageToNamespace_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ClassFilePackageToNamespace_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ClassFilePackageToNamespace_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_package) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCu = _edge_package.getSrc();
		if (tmpCu instanceof ClassFile) {
			ClassFile cu = (ClassFile) tmpCu;
			EObject tmpP = _edge_package.getTrg();
			if (tmpP instanceof org.eclipse.modisco.java.Package) {
				org.eclipse.modisco.java.Package p = (org.eclipse.modisco.java.Package) tmpP;
				if (p.equals(cu.getPackage())) {
					_result.add(new Object[] { p, cu, _edge_package });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ClassFilePackageToNamespace_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ClassFilePackageToNamespace _this, Match match, org.eclipse.modisco.java.Package p, ClassFile cu) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, p, cu);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ClassFilePackageToNamespace_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ClassFilePackageToNamespace _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ClassFilePackageToNamespace_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_24_1_prepare_blackB(
			ClassFilePackageToNamespace _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("p");
		EObject _localVariable_1 = sourceMatch.getObject("cu");
		EObject _localVariable_2 = targetMatch.getObject("module");
		EObject _localVariable_3 = targetMatch.getObject("tp");
		EObject tmpP = _localVariable_0;
		EObject tmpCu = _localVariable_1;
		EObject tmpModule = _localVariable_2;
		EObject tmpTp = _localVariable_3;
		if (tmpP instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package p = (org.eclipse.modisco.java.Package) tmpP;
			if (tmpCu instanceof ClassFile) {
				ClassFile cu = (ClassFile) tmpCu;
				if (tmpModule instanceof TModule) {
					TModule module = (TModule) tmpModule;
					if (tmpTp instanceof TPackage) {
						TPackage tp = (TPackage) tmpTp;
						return new Object[] { p, cu, module, tp, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_24_2_matchsrctrgcontext_blackBBBBBB(
			org.eclipse.modisco.java.Package p, ClassFile cu, TModule module, TPackage tp, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { p, cu, module, tp, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ClassFilePackageToNamespace_24_2_matchsrctrgcontext_binding = pattern_ClassFilePackageToNamespace_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_ClassFilePackageToNamespace_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.modisco.java.Package p = (org.eclipse.modisco.java.Package) result_pattern_ClassFilePackageToNamespace_24_2_matchsrctrgcontext_binding[0];
			ClassFile cu = (ClassFile) result_pattern_ClassFilePackageToNamespace_24_2_matchsrctrgcontext_binding[1];
			TModule module = (TModule) result_pattern_ClassFilePackageToNamespace_24_2_matchsrctrgcontext_binding[2];
			TPackage tp = (TPackage) result_pattern_ClassFilePackageToNamespace_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_ClassFilePackageToNamespace_24_2_matchsrctrgcontext_black = pattern_ClassFilePackageToNamespace_24_2_matchsrctrgcontext_blackBBBBBB(
					p, cu, module, tp, sourceMatch, targetMatch);
			if (result_pattern_ClassFilePackageToNamespace_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { p, cu, module, tp, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_24_3_solvecsp_bindingFBBBBBBB(
			ClassFilePackageToNamespace _this, org.eclipse.modisco.java.Package p, ClassFile cu, TModule module,
			TPackage tp, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(p, cu, module, tp, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, p, cu, module, tp, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			ClassFilePackageToNamespace _this, org.eclipse.modisco.java.Package p, ClassFile cu, TModule module,
			TPackage tp, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ClassFilePackageToNamespace_24_3_solvecsp_binding = pattern_ClassFilePackageToNamespace_24_3_solvecsp_bindingFBBBBBBB(
				_this, p, cu, module, tp, sourceMatch, targetMatch);
		if (result_pattern_ClassFilePackageToNamespace_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ClassFilePackageToNamespace_24_3_solvecsp_binding[0];

			Object[] result_pattern_ClassFilePackageToNamespace_24_3_solvecsp_black = pattern_ClassFilePackageToNamespace_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ClassFilePackageToNamespace_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, p, cu, module, tp, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassFilePackageToNamespace_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ClassFilePackageToNamespace_24_5_matchcorrcontext_blackBBFBBFBB(
			org.eclipse.modisco.java.Package p, ClassFile cu, TModule module, TPackage tp, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ElementToModule cu2m : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cu,
					ElementToModule.class, "source")) {
				if (module.equals(cu2m.getTarget())) {
					for (PackageToTPackage p2p : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(tp,
							PackageToTPackage.class, "target")) {
						if (p.equals(p2p.getSource())) {
							_result.add(new Object[] { p, cu, cu2m, module, tp, p2p, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_24_5_matchcorrcontext_greenBBBBF(
			ElementToModule cu2m, PackageToTPackage p2p, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ClassFilePackageToNamespace";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(cu2m);
		ccMatch.getAllContextElements().add(p2p);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { cu2m, p2p, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_24_6_createcorrespondence_blackBBBBB(
			org.eclipse.modisco.java.Package p, ClassFile cu, TModule module, TPackage tp, CCMatch ccMatch) {
		return new Object[] { p, cu, module, tp, ccMatch };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ClassFilePackageToNamespace";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ClassFilePackageToNamespace_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_27_1_matchtggpattern_blackBB(
			org.eclipse.modisco.java.Package p, ClassFile cu) {
		if (p.equals(cu.getPackage())) {
			return new Object[] { p, cu };
		}
		return null;
	}

	public static final boolean pattern_ClassFilePackageToNamespace_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassFilePackageToNamespace_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_28_1_matchtggpattern_blackBB(TModule module,
			TPackage tp) {
		if (tp.equals(module.getNamespace())) {
			return new Object[] { module, tp };
		}
		return null;
	}

	public static final boolean pattern_ClassFilePackageToNamespace_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ClassFilePackageToNamespace_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_29_1_createresult_blackB(
			ClassFilePackageToNamespace _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.modisco.java.Package p) {
		if (ruleResult.getSourceObjects().contains(p)) {
			return new Object[] { ruleResult, p };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, PackageToTPackage p2p) {
		if (ruleResult.getCorrObjects().contains(p2p)) {
			return new Object[] { ruleResult, p2p };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TPackage tp) {
		if (ruleResult.getTargetObjects().contains(tp)) {
			return new Object[] { ruleResult, tp };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ClassFile cu) {
		if (ruleResult.getSourceObjects().contains(cu)) {
			return new Object[] { ruleResult, cu };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ElementToModule cu2m) {
		if (ruleResult.getCorrObjects().contains(cu2m)) {
			return new Object[] { ruleResult, cu2m };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TModule module) {
		if (ruleResult.getTargetObjects().contains(module)) {
			return new Object[] { ruleResult, module };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ClassFilePackageToNamespace_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList p2pList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList cu2mList : ruleEntryContainer.getRuleEntryList()) {
				if (!cu2mList.equals(p2pList)) {
					for (EObject tmpP2p : p2pList.getEntryObjects()) {
						if (tmpP2p instanceof PackageToTPackage) {
							PackageToTPackage p2p = (PackageToTPackage) tmpP2p;
							org.eclipse.modisco.java.Package p = p2p.getSource();
							if (p != null) {
								TPackage tp = p2p.getTarget();
								if (tp != null) {
									if (pattern_ClassFilePackageToNamespace_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, p2p) == null) {
										if (pattern_ClassFilePackageToNamespace_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, p) == null) {
											if (pattern_ClassFilePackageToNamespace_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tp) == null) {
												for (EObject tmpCu2m : cu2mList.getEntryObjects()) {
													if (tmpCu2m instanceof ElementToModule) {
														ElementToModule cu2m = (ElementToModule) tmpCu2m;
														NamedElement tmpCu = cu2m.getSource();
														if (tmpCu instanceof ClassFile) {
															ClassFile cu = (ClassFile) tmpCu;
															TModule module = cu2m.getTarget();
															if (module != null) {
																if (pattern_ClassFilePackageToNamespace_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult, cu2m) == null) {
																	if (pattern_ClassFilePackageToNamespace_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, cu) == null) {
																		if (pattern_ClassFilePackageToNamespace_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, module) == null) {
																			_result.add(new Object[] { p2pList, p, p2p,
																					tp, cu2mList, cu, cu2m, module,
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
								}

							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_29_3_solveCSP_bindingFBBBBBBBBB(
			ClassFilePackageToNamespace _this, IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package p,
			ClassFile cu, ElementToModule cu2m, TModule module, TPackage tp, PackageToTPackage p2p,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, p, cu, cu2m, module, tp, p2p,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, p, cu, cu2m, module, tp, p2p, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			ClassFilePackageToNamespace _this, IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package p,
			ClassFile cu, ElementToModule cu2m, TModule module, TPackage tp, PackageToTPackage p2p,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ClassFilePackageToNamespace_29_3_solveCSP_binding = pattern_ClassFilePackageToNamespace_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, p, cu, cu2m, module, tp, p2p, ruleResult);
		if (result_pattern_ClassFilePackageToNamespace_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ClassFilePackageToNamespace_29_3_solveCSP_binding[0];

			Object[] result_pattern_ClassFilePackageToNamespace_29_3_solveCSP_black = pattern_ClassFilePackageToNamespace_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ClassFilePackageToNamespace_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, p, cu, cu2m, module, tp, p2p, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ClassFilePackageToNamespace_29_4_checkCSP_expressionFBB(
			ClassFilePackageToNamespace _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_29_5_checknacs_blackBBBBBB(
			org.eclipse.modisco.java.Package p, ClassFile cu, ElementToModule cu2m, TModule module, TPackage tp,
			PackageToTPackage p2p) {
		return new Object[] { p, cu, cu2m, module, tp, p2p };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_29_6_perform_blackBBBBBBB(
			org.eclipse.modisco.java.Package p, ClassFile cu, ElementToModule cu2m, TModule module, TPackage tp,
			PackageToTPackage p2p, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { p, cu, cu2m, module, tp, p2p, ruleResult };
	}

	public static final Object[] pattern_ClassFilePackageToNamespace_29_6_perform_greenBBBBB(
			org.eclipse.modisco.java.Package p, ClassFile cu, TModule module, TPackage tp,
			ModelgeneratorRuleResult ruleResult) {
		cu.setPackage(p);
		module.setNamespace(tp);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { p, cu, module, tp, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ClassFilePackageToNamespace_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ClassFilePackageToNamespaceImpl
