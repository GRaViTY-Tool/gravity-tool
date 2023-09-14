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
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.Model;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MAbstractMethodDefinition;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.PackageToTPackage;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.InterfaceInPackage;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TInterface;
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
 * An implementation of the model object '<em><b>Interface In Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InterfaceInPackageImpl extends AbstractRuleImpl implements InterfaceInPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceInPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getInterfaceInPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.Package mPackage,
			InterfaceDeclaration mType) {

		Object[] result1_black = InterfaceInPackageImpl.pattern_InterfaceInPackage_0_1_initialbindings_blackBBBB(this,
				match, mPackage, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mPackage, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InterfaceInPackageImpl.pattern_InterfaceInPackage_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InterfaceInPackageImpl
					.pattern_InterfaceInPackage_0_4_collectelementstobetranslated_blackBBB(match, mPackage, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
			}
			InterfaceInPackageImpl.pattern_InterfaceInPackage_0_4_collectelementstobetranslated_greenBBBFF(match,
					mPackage, mType);
			//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result4_green[4];

			Object[] result5_black = InterfaceInPackageImpl
					.pattern_InterfaceInPackage_0_5_collectcontextelements_blackBBB(match, mPackage, mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
			}
			InterfaceInPackageImpl.pattern_InterfaceInPackage_0_5_collectcontextelements_greenBB(match, mPackage);

			// 
			InterfaceInPackageImpl.pattern_InterfaceInPackage_0_6_registerobjectstomatch_expressionBBBB(this, match,
					mPackage, mType);
			return InterfaceInPackageImpl.pattern_InterfaceInPackage_0_7_expressionF();
		} else {
			return InterfaceInPackageImpl.pattern_InterfaceInPackage_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		PackageToTPackage mPackageToTPackage = (PackageToTPackage) result1_bindingAndBlack[0];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[1];
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[3];
		InterfaceDeclaration mType = (InterfaceDeclaration) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_1_1_performtransformation_greenFBFBFBB(tPackage, pg, mType, csp);
		ASTNodeToTAnnotatable annotatable2Annotatable = (ASTNodeToTAnnotatable) result1_green[0];
		TInterface tType = (TInterface) result1_green[2];
		TypeToTAbstractType type2Type = (TypeToTAbstractType) result1_green[4];

		Object[] result2_black = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_1_2_collecttranslatedelements_blackBBBB(annotatable2Annotatable, tType,
						type2Type, mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[annotatable2Annotatable] = "
					+ annotatable2Annotatable + ", " + "[tType] = " + tType + ", " + "[type2Type] = " + type2Type + ", "
					+ "[mType] = " + mType + ".");
		}
		Object[] result2_green = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_1_2_collecttranslatedelements_greenFBBBB(annotatable2Annotatable, tType,
						type2Type, mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_1_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult, mPackageToTPackage,
						annotatable2Annotatable, tPackage, tType, mPackage, pg, type2Type, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ", " + "[annotatable2Annotatable] = "
					+ annotatable2Annotatable + ", " + "[tPackage] = " + tPackage + ", " + "[tType] = " + tType + ", "
					+ "[mPackage] = " + mPackage + ", " + "[pg] = " + pg + ", " + "[type2Type] = " + type2Type + ", "
					+ "[mType] = " + mType + ".");
		}
		InterfaceInPackageImpl.pattern_InterfaceInPackage_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFFF(ruleresult,
				annotatable2Annotatable, tPackage, tType, mPackage, pg, type2Type, mType);
		//nothing EMoflonEdge pg__tType____allTypes = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge pg__tType____interfaces = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge type2Type__mType____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge annotatable2Annotatable__tType____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tPackage__tType____interfaces = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tPackage__tType____allTypes = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge annotatable2Annotatable__mType____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge type2Type__tType____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[19];

		// 
		// 
		InterfaceInPackageImpl.pattern_InterfaceInPackage_1_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult,
				mPackageToTPackage, annotatable2Annotatable, tPackage, tType, mPackage, pg, type2Type, mType);
		return InterfaceInPackageImpl.pattern_InterfaceInPackage_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InterfaceInPackageImpl.pattern_InterfaceInPackage_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_binding[0];
		InterfaceDeclaration mType = (InterfaceDeclaration) result2_binding[1];
		for (Object[] result2_black : InterfaceInPackageImpl
				.pattern_InterfaceInPackage_2_2_corematch_blackFFBBB(mPackage, mType, match)) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[0];
			TPackage tPackage = (TPackage) result2_black[1];
			// ForEach 
			for (Object[] result3_black : InterfaceInPackageImpl.pattern_InterfaceInPackage_2_3_findcontext_blackBBBFB(
					mPackageToTPackage, tPackage, mPackage, mType)) {
				TypeGraph pg = (TypeGraph) result3_black[3];
				Object[] result3_green = InterfaceInPackageImpl
						.pattern_InterfaceInPackage_2_3_findcontext_greenBBBBBFFFFFF(mPackageToTPackage, tPackage,
								mPackage, pg, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge tPackage__pg____model = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mPackageToTPackage__mPackage____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = InterfaceInPackageImpl
						.pattern_InterfaceInPackage_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								mPackageToTPackage, tPackage, mPackage, pg, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackageToTPackage] = "
							+ mPackageToTPackage + ", " + "[tPackage] = " + tPackage + ", " + "[mPackage] = " + mPackage
							+ ", " + "[pg] = " + pg + ", " + "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InterfaceInPackageImpl.pattern_InterfaceInPackage_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InterfaceInPackageImpl
							.pattern_InterfaceInPackage_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InterfaceInPackageImpl.pattern_InterfaceInPackage_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return InterfaceInPackageImpl.pattern_InterfaceInPackage_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.modisco.java.Package mPackage,
			InterfaceDeclaration mType) {
		match.registerObject("mPackage", mPackage);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.modisco.java.Package mPackage,
			InterfaceDeclaration mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TPackage tPackage, org.eclipse.modisco.java.Package mPackage, TypeGraph pg, InterfaceDeclaration mType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType.proxy", true, csp);
		var_mType_proxy.setValue(mType.isProxy());
		var_mType_proxy.setType("Boolean");
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");

		// Create unbound variables
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", csp);
		var_tType_tLib.setType("Boolean");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", csp);
		var_tType_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_proxy, var_tType_tLib);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_mType_name, var_tType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackageToTPackage", mPackageToTPackage);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("pg", pg);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mPackageToTPackage,
			EObject annotatable2Annotatable, EObject tPackage, EObject tType, EObject mPackage, EObject pg,
			EObject type2Type, EObject mType) {
		ruleresult.registerObject("mPackageToTPackage", mPackageToTPackage);
		ruleresult.registerObject("annotatable2Annotatable", annotatable2Annotatable);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("type2Type", type2Type);
		ruleresult.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mType").eClass())
				.equals("java.InterfaceDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TPackage tPackage, TInterface tType, TypeGraph pg) {

		Object[] result1_black = InterfaceInPackageImpl.pattern_InterfaceInPackage_10_1_initialbindings_blackBBBBB(this,
				match, tPackage, tType, pg);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tPackage] = " + tPackage + ", " + "[tType] = " + tType + ", "
					+ "[pg] = " + pg + ".");
		}

		Object[] result2_bindingAndBlack = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tPackage, tType, pg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tPackage] = " + tPackage + ", " + "[tType] = " + tType + ", "
					+ "[pg] = " + pg + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InterfaceInPackageImpl.pattern_InterfaceInPackage_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InterfaceInPackageImpl
					.pattern_InterfaceInPackage_10_4_collectelementstobetranslated_blackBBBB(match, tPackage, tType,
							pg);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPackage] = " + tPackage + ", " + "[tType] = " + tType + ", " + "[pg] = " + pg + ".");
			}
			InterfaceInPackageImpl.pattern_InterfaceInPackage_10_4_collectelementstobetranslated_greenBBBBFFFFFF(match,
					tPackage, tType, pg);
			//nothing EMoflonEdge pg__tType____allTypes = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge pg__tType____interfaces = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tPackage__tType____interfaces = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tPackage__tType____allTypes = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result4_green[9];

			Object[] result5_black = InterfaceInPackageImpl
					.pattern_InterfaceInPackage_10_5_collectcontextelements_blackBBBB(match, tPackage, tType, pg);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPackage] = " + tPackage + ", " + "[tType] = " + tType + ", " + "[pg] = " + pg + ".");
			}
			InterfaceInPackageImpl.pattern_InterfaceInPackage_10_5_collectcontextelements_greenBBBF(match, tPackage,
					pg);
			//nothing EMoflonEdge tPackage__pg____model = (EMoflonEdge) result5_green[3];

			// 
			InterfaceInPackageImpl.pattern_InterfaceInPackage_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tPackage, tType, pg);
			return InterfaceInPackageImpl.pattern_InterfaceInPackage_10_7_expressionF();
		} else {
			return InterfaceInPackageImpl.pattern_InterfaceInPackage_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_11_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		PackageToTPackage mPackageToTPackage = (PackageToTPackage) result1_bindingAndBlack[0];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[1];
		TInterface tType = (TInterface) result1_bindingAndBlack[2];
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[3];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_11_1_performtransformation_greenFBBFFB(tType, mPackage, csp);
		ASTNodeToTAnnotatable annotatable2Annotatable = (ASTNodeToTAnnotatable) result1_green[0];
		TypeToTAbstractType type2Type = (TypeToTAbstractType) result1_green[3];
		InterfaceDeclaration mType = (InterfaceDeclaration) result1_green[4];

		Object[] result2_black = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_11_2_collecttranslatedelements_blackBBBB(annotatable2Annotatable, tType,
						type2Type, mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[annotatable2Annotatable] = "
					+ annotatable2Annotatable + ", " + "[tType] = " + tType + ", " + "[type2Type] = " + type2Type + ", "
					+ "[mType] = " + mType + ".");
		}
		Object[] result2_green = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_11_2_collecttranslatedelements_greenFBBBB(annotatable2Annotatable, tType,
						type2Type, mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_11_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult, mPackageToTPackage,
						annotatable2Annotatable, tPackage, tType, mPackage, pg, type2Type, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ", " + "[annotatable2Annotatable] = "
					+ annotatable2Annotatable + ", " + "[tPackage] = " + tPackage + ", " + "[tType] = " + tType + ", "
					+ "[mPackage] = " + mPackage + ", " + "[pg] = " + pg + ", " + "[type2Type] = " + type2Type + ", "
					+ "[mType] = " + mType + ".");
		}
		InterfaceInPackageImpl.pattern_InterfaceInPackage_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFFF(ruleresult,
				annotatable2Annotatable, tPackage, tType, mPackage, pg, type2Type, mType);
		//nothing EMoflonEdge pg__tType____allTypes = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge pg__tType____interfaces = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge type2Type__mType____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge annotatable2Annotatable__tType____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tPackage__tType____interfaces = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tPackage__tType____allTypes = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge annotatable2Annotatable__mType____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge type2Type__tType____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[19];

		// 
		// 
		InterfaceInPackageImpl.pattern_InterfaceInPackage_11_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult,
				mPackageToTPackage, annotatable2Annotatable, tPackage, tType, mPackage, pg, type2Type, mType);
		return InterfaceInPackageImpl.pattern_InterfaceInPackage_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InterfaceInPackageImpl.pattern_InterfaceInPackage_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TPackage tPackage = (TPackage) result2_binding[0];
		TInterface tType = (TInterface) result2_binding[1];
		TypeGraph pg = (TypeGraph) result2_binding[2];
		for (Object[] result2_black : InterfaceInPackageImpl
				.pattern_InterfaceInPackage_12_2_corematch_blackFBBFBB(tPackage, tType, pg, match)) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[0];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[3];
			// ForEach 
			for (Object[] result3_black : InterfaceInPackageImpl.pattern_InterfaceInPackage_12_3_findcontext_blackBBBBB(
					mPackageToTPackage, tPackage, tType, mPackage, pg)) {
				Object[] result3_green = InterfaceInPackageImpl
						.pattern_InterfaceInPackage_12_3_findcontext_greenBBBBBFFFFFFFFFF(mPackageToTPackage, tPackage,
								tType, mPackage, pg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge pg__tType____allTypes = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge pg__tType____interfaces = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tPackage__pg____model = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mPackageToTPackage__mPackage____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tPackage__tType____interfaces = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tPackage__tType____allTypes = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = InterfaceInPackageImpl
						.pattern_InterfaceInPackage_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								mPackageToTPackage, tPackage, tType, mPackage, pg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackageToTPackage] = "
							+ mPackageToTPackage + ", " + "[tPackage] = " + tPackage + ", " + "[tType] = " + tType
							+ ", " + "[mPackage] = " + mPackage + ", " + "[pg] = " + pg + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InterfaceInPackageImpl.pattern_InterfaceInPackage_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InterfaceInPackageImpl
							.pattern_InterfaceInPackage_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InterfaceInPackageImpl.pattern_InterfaceInPackage_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return InterfaceInPackageImpl.pattern_InterfaceInPackage_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TPackage tPackage, TInterface tType, TypeGraph pg) {
		match.registerObject("tPackage", tPackage);
		match.registerObject("tType", tType);
		match.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TPackage tPackage, TInterface tType, TypeGraph pg) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TPackage tPackage, TInterface tType, org.eclipse.modisco.java.Package mPackage, TypeGraph pg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", true, csp);
		var_tType_tLib.setValue(tType.isTLib());
		var_tType_tLib.setType("Boolean");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");

		// Create unbound variables
		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType.proxy", csp);
		var_mType_proxy.setType("Boolean");
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", csp);
		var_mType_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_proxy, var_tType_tLib);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_mType_name, var_tType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackageToTPackage", mPackageToTPackage);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("pg", pg);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mPackageToTPackage,
			EObject annotatable2Annotatable, EObject tPackage, EObject tType, EObject mPackage, EObject pg,
			EObject type2Type, EObject mType) {
		ruleresult.registerObject("mPackageToTPackage", mPackageToTPackage);
		ruleresult.registerObject("annotatable2Annotatable", annotatable2Annotatable);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("type2Type", type2Type);
		ruleresult.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tType").eClass()).equals("basic.TInterface.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_11(EMoflonEdge _edge_allTypes) {

		Object[] result1_bindingAndBlack = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InterfaceInPackageImpl.pattern_InterfaceInPackage_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InterfaceInPackageImpl
				.pattern_InterfaceInPackage_20_2_testcorematchandDECs_blackFFFB(_edge_allTypes)) {
			TPackage tPackage = (TPackage) result2_black[0];
			TInterface tType = (TInterface) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[2];
			Object[] result2_green = InterfaceInPackageImpl
					.pattern_InterfaceInPackage_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InterfaceInPackageImpl
					.pattern_InterfaceInPackage_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tPackage, tType, pg)) {
				// 
				if (InterfaceInPackageImpl
						.pattern_InterfaceInPackage_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InterfaceInPackageImpl
							.pattern_InterfaceInPackage_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InterfaceInPackageImpl.pattern_InterfaceInPackage_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InterfaceInPackageImpl.pattern_InterfaceInPackage_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_11(EMoflonEdge _edge_ownedElements) {

		Object[] result1_bindingAndBlack = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InterfaceInPackageImpl.pattern_InterfaceInPackage_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InterfaceInPackageImpl
				.pattern_InterfaceInPackage_21_2_testcorematchandDECs_blackFFB(_edge_ownedElements)) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[0];
			InterfaceDeclaration mType = (InterfaceDeclaration) result2_black[1];
			Object[] result2_green = InterfaceInPackageImpl
					.pattern_InterfaceInPackage_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InterfaceInPackageImpl
					.pattern_InterfaceInPackage_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, mPackage, mType)) {
				// 
				if (InterfaceInPackageImpl
						.pattern_InterfaceInPackage_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InterfaceInPackageImpl
							.pattern_InterfaceInPackage_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InterfaceInPackageImpl.pattern_InterfaceInPackage_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InterfaceInPackageImpl.pattern_InterfaceInPackage_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("InterfaceInPackage");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tLib.setValue(__helper.getValue("tType", "tLib"));
		var_tType_tLib.setType("boolean");

		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_proxy.setValue(__helper.getValue("mType", "proxy"));
		var_mType_proxy.setType("boolean");

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("InterfaceInPackage");
		eq0.solve(var_mType_proxy, var_tType_tLib);

		eq1.setRuleName("InterfaceInPackage");
		eq1.solve(var_mType_name, var_tType_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tType_tLib.setBound(false);
			var_tType_tName.setBound(false);
			eq0.solve(var_mType_proxy, var_tType_tLib);
			eq1.solve(var_mType_name, var_tType_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tType", "tLib", var_tType_tLib.getValue());
				__helper.setValue("tType", "tName", var_tType_tName.getValue());
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
		ruleResult.setRule("InterfaceInPackage");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tLib.setValue(__helper.getValue("tType", "tLib"));
		var_tType_tLib.setType("boolean");

		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_proxy.setValue(__helper.getValue("mType", "proxy"));
		var_mType_proxy.setType("boolean");

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("InterfaceInPackage");
		eq0.solve(var_mType_proxy, var_tType_tLib);

		eq1.setRuleName("InterfaceInPackage");
		eq1.solve(var_mType_name, var_tType_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mType_proxy.setBound(false);
			var_mType_name.setBound(false);
			eq0.solve(var_mType_proxy, var_tType_tLib);
			eq1.solve(var_mType_name, var_tType_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mType", "proxy", var_mType_proxy.getValue());
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

		Object[] result1_black = InterfaceInPackageImpl.pattern_InterfaceInPackage_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InterfaceInPackageImpl.pattern_InterfaceInPackage_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TPackage tPackage = (TPackage) result2_bindingAndBlack[0];
		TInterface tType = (TInterface) result2_bindingAndBlack[1];
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[3];
		InterfaceDeclaration mType = (InterfaceDeclaration) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, tPackage, tType, mPackage, pg,
						mType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tPackage] = " + tPackage + ", " + "[tType] = " + tType + ", " + "[mPackage] = " + mPackage
					+ ", " + "[pg] = " + pg + ", " + "[mType] = " + mType + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (InterfaceInPackageImpl.pattern_InterfaceInPackage_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : InterfaceInPackageImpl
					.pattern_InterfaceInPackage_24_5_matchcorrcontext_blackFBBBB(tPackage, mPackage, sourceMatch,
							targetMatch)) {
				PackageToTPackage mPackageToTPackage = (PackageToTPackage) result5_black[0];
				Object[] result5_green = InterfaceInPackageImpl
						.pattern_InterfaceInPackage_24_5_matchcorrcontext_greenBBBF(mPackageToTPackage, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = InterfaceInPackageImpl
						.pattern_InterfaceInPackage_24_6_createcorrespondence_blackBBBBBB(tPackage, tType, mPackage, pg,
								mType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tPackage] = " + tPackage
							+ ", " + "[tType] = " + tType + ", " + "[mPackage] = " + mPackage + ", " + "[pg] = " + pg
							+ ", " + "[mType] = " + mType + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InterfaceInPackageImpl.pattern_InterfaceInPackage_24_6_createcorrespondence_greenFBFBB(tType, mType,
						ccMatch);
				//nothing ASTNodeToTAnnotatable annotatable2Annotatable = (ASTNodeToTAnnotatable) result6_green[0];
				//nothing TypeToTAbstractType type2Type = (TypeToTAbstractType) result6_green[2];

				Object[] result7_black = InterfaceInPackageImpl
						.pattern_InterfaceInPackage_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InterfaceInPackageImpl.pattern_InterfaceInPackage_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return InterfaceInPackageImpl.pattern_InterfaceInPackage_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TPackage tPackage, TInterface tType, org.eclipse.modisco.java.Package mPackage,
			TypeGraph pg, InterfaceDeclaration mType, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType.proxy", true, csp);
		var_mType_proxy.setValue(mType.isProxy());
		var_mType_proxy.setType("Boolean");
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", true, csp);
		var_tType_tLib.setValue(tType.isTLib());
		var_tType_tLib.setType("Boolean");
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_proxy, var_tType_tLib);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_mType_name, var_tType_tName);
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.Package mPackage, InterfaceDeclaration mType) {// 
		Object[] result1_black = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_27_1_matchtggpattern_blackBB(mPackage, mType);
		if (result1_black != null) {
			return InterfaceInPackageImpl.pattern_InterfaceInPackage_27_2_expressionF();
		} else {
			return InterfaceInPackageImpl.pattern_InterfaceInPackage_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TPackage tPackage, TInterface tType, TypeGraph pg) {// 
		Object[] result1_black = InterfaceInPackageImpl
				.pattern_InterfaceInPackage_28_1_matchtggpattern_blackBBB(tPackage, tType, pg);
		if (result1_black != null) {
			return InterfaceInPackageImpl.pattern_InterfaceInPackage_28_2_expressionF();
		} else {
			return InterfaceInPackageImpl.pattern_InterfaceInPackage_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			PackageToTPackage mPackageToTPackageParameter) {

		Object[] result1_black = InterfaceInPackageImpl.pattern_InterfaceInPackage_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InterfaceInPackageImpl.pattern_InterfaceInPackage_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : InterfaceInPackageImpl
				.pattern_InterfaceInPackage_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mPackageToTPackageList = (RuleEntryList) result2_black[0];
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[1];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[2];
			TPackage tPackage = (TPackage) result2_black[3];
			TypeGraph pg = (TypeGraph) result2_black[4];

			Object[] result3_bindingAndBlack = InterfaceInPackageImpl
					.pattern_InterfaceInPackage_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
							mPackageToTPackage, tPackage, mPackage, pg, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackageToTPackage] = "
						+ mPackageToTPackage + ", " + "[tPackage] = " + tPackage + ", " + "[mPackage] = " + mPackage
						+ ", " + "[pg] = " + pg + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (InterfaceInPackageImpl.pattern_InterfaceInPackage_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = InterfaceInPackageImpl.pattern_InterfaceInPackage_29_5_checknacs_blackBBBB(
						mPackageToTPackage, tPackage, mPackage, pg);
				if (result5_black != null) {

					Object[] result6_black = InterfaceInPackageImpl.pattern_InterfaceInPackage_29_6_perform_blackBBBBB(
							mPackageToTPackage, tPackage, mPackage, pg, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[mPackageToTPackage] = " + mPackageToTPackage + ", " + "[tPackage] = " + tPackage
								+ ", " + "[mPackage] = " + mPackage + ", " + "[pg] = " + pg + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					InterfaceInPackageImpl.pattern_InterfaceInPackage_29_6_perform_greenFBFBBFFBB(tPackage, mPackage,
							pg, ruleResult, csp);
					//nothing ASTNodeToTAnnotatable annotatable2Annotatable = (ASTNodeToTAnnotatable) result6_green[0];
					//nothing TInterface tType = (TInterface) result6_green[2];
					//nothing TypeToTAbstractType type2Type = (TypeToTAbstractType) result6_green[5];
					//nothing InterfaceDeclaration mType = (InterfaceDeclaration) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return InterfaceInPackageImpl.pattern_InterfaceInPackage_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TPackage tPackage, org.eclipse.modisco.java.Package mPackage, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType.proxy", csp);
		var_mType_proxy.setType("Boolean");
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", csp);
		var_tType_tLib.setType("Boolean");
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", csp);
		var_mType_name.setType("String");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", csp);
		var_tType_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_proxy, var_tType_tLib);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_mType_name, var_tType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackageToTPackage", mPackageToTPackage);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("mPackage", mPackage);
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
		case RulesPackage.INTERFACE_IN_PACKAGE___IS_APPROPRIATE_FWD__MATCH_PACKAGE_INTERFACEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2));
		case RulesPackage.INTERFACE_IN_PACKAGE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERFACE_IN_PACKAGE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_IN_PACKAGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGE_INTERFACEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2));
			return null;
		case RulesPackage.INTERFACE_IN_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGE_INTERFACEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (InterfaceDeclaration) arguments.get(2));
		case RulesPackage.INTERFACE_IN_PACKAGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_IN_PACKAGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_TPACKAGE_PACKAGE_TYPEGRAPH_INTERFACEDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (PackageToTPackage) arguments.get(1),
					(TPackage) arguments.get(2), (org.eclipse.modisco.java.Package) arguments.get(3),
					(TypeGraph) arguments.get(4), (InterfaceDeclaration) arguments.get(5));
		case RulesPackage.INTERFACE_IN_PACKAGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_IN_PACKAGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.INTERFACE_IN_PACKAGE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_IN_PACKAGE___IS_APPROPRIATE_BWD__MATCH_TPACKAGE_TINTERFACE_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TInterface) arguments.get(2), (TypeGraph) arguments.get(3));
		case RulesPackage.INTERFACE_IN_PACKAGE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERFACE_IN_PACKAGE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_IN_PACKAGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPACKAGE_TINTERFACE_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TInterface) arguments.get(2), (TypeGraph) arguments.get(3));
			return null;
		case RulesPackage.INTERFACE_IN_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPACKAGE_TINTERFACE_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TInterface) arguments.get(2), (TypeGraph) arguments.get(3));
		case RulesPackage.INTERFACE_IN_PACKAGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_IN_PACKAGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_TPACKAGE_TINTERFACE_PACKAGE_TYPEGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (PackageToTPackage) arguments.get(1),
					(TPackage) arguments.get(2), (TInterface) arguments.get(3),
					(org.eclipse.modisco.java.Package) arguments.get(4), (TypeGraph) arguments.get(5));
		case RulesPackage.INTERFACE_IN_PACKAGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_IN_PACKAGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.INTERFACE_IN_PACKAGE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_IN_PACKAGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_11((EMoflonEdge) arguments.get(0));
		case RulesPackage.INTERFACE_IN_PACKAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_11__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_11((EMoflonEdge) arguments.get(0));
		case RulesPackage.INTERFACE_IN_PACKAGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERFACE_IN_PACKAGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERFACE_IN_PACKAGE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.INTERFACE_IN_PACKAGE___IS_APPLICABLE_SOLVE_CSP_CC__TPACKAGE_TINTERFACE_PACKAGE_TYPEGRAPH_INTERFACEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TPackage) arguments.get(0), (TInterface) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2), (TypeGraph) arguments.get(3),
					(InterfaceDeclaration) arguments.get(4), (Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.INTERFACE_IN_PACKAGE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_IN_PACKAGE___CHECK_DEC_FWD__PACKAGE_INTERFACEDECLARATION:
			return checkDEC_FWD((org.eclipse.modisco.java.Package) arguments.get(0),
					(InterfaceDeclaration) arguments.get(1));
		case RulesPackage.INTERFACE_IN_PACKAGE___CHECK_DEC_BWD__TPACKAGE_TINTERFACE_TYPEGRAPH:
			return checkDEC_BWD((TPackage) arguments.get(0), (TInterface) arguments.get(1),
					(TypeGraph) arguments.get(2));
		case RulesPackage.INTERFACE_IN_PACKAGE___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGETOTPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (PackageToTPackage) arguments.get(1));
		case RulesPackage.INTERFACE_IN_PACKAGE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_TPACKAGE_PACKAGE_TYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(PackageToTPackage) arguments.get(1), (TPackage) arguments.get(2),
					(org.eclipse.modisco.java.Package) arguments.get(3), (TypeGraph) arguments.get(4),
					(ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.INTERFACE_IN_PACKAGE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_InterfaceInPackage_0_1_initialbindings_blackBBBB(InterfaceInPackage _this,
			Match match, org.eclipse.modisco.java.Package mPackage, InterfaceDeclaration mType) {
		return new Object[] { _this, match, mPackage, mType };
	}

	public static final Object[] pattern_InterfaceInPackage_0_2_SolveCSP_bindingFBBBB(InterfaceInPackage _this,
			Match match, org.eclipse.modisco.java.Package mPackage, InterfaceDeclaration mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mPackage, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mPackage, mType };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceInPackage_0_2_SolveCSP_bindingAndBlackFBBBB(InterfaceInPackage _this,
			Match match, org.eclipse.modisco.java.Package mPackage, InterfaceDeclaration mType) {
		Object[] result_pattern_InterfaceInPackage_0_2_SolveCSP_binding = pattern_InterfaceInPackage_0_2_SolveCSP_bindingFBBBB(
				_this, match, mPackage, mType);
		if (result_pattern_InterfaceInPackage_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceInPackage_0_2_SolveCSP_binding[0];

			Object[] result_pattern_InterfaceInPackage_0_2_SolveCSP_black = pattern_InterfaceInPackage_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InterfaceInPackage_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mPackage, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceInPackage_0_3_CheckCSP_expressionFBB(InterfaceInPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_0_4_collectelementstobetranslated_blackBBB(Match match,
			org.eclipse.modisco.java.Package mPackage, InterfaceDeclaration mType) {
		return new Object[] { match, mPackage, mType };
	}

	public static final Object[] pattern_InterfaceInPackage_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			org.eclipse.modisco.java.Package mPackage, InterfaceDeclaration mType) {
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mType);
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		match.getToBeTranslatedEdges().add(mPackage__mType____ownedElements);
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		match.getToBeTranslatedEdges().add(mType__mPackage____package);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		return new Object[] { match, mPackage, mType, mPackage__mType____ownedElements, mType__mPackage____package };
	}

	public static final Object[] pattern_InterfaceInPackage_0_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.modisco.java.Package mPackage, InterfaceDeclaration mType) {
		return new Object[] { match, mPackage, mType };
	}

	public static final Object[] pattern_InterfaceInPackage_0_5_collectcontextelements_greenBB(Match match,
			org.eclipse.modisco.java.Package mPackage) {
		match.getContextNodes().add(mPackage);
		return new Object[] { match, mPackage };
	}

	public static final void pattern_InterfaceInPackage_0_6_registerobjectstomatch_expressionBBBB(
			InterfaceInPackage _this, Match match, org.eclipse.modisco.java.Package mPackage,
			InterfaceDeclaration mType) {
		_this.registerObjectsToMatch_FWD(match, mPackage, mType);

	}

	public static final boolean pattern_InterfaceInPackage_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceInPackage_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mPackageToTPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("pg");
		EObject _localVariable_4 = isApplicableMatch.getObject("mType");
		EObject tmpMPackageToTPackage = _localVariable_0;
		EObject tmpTPackage = _localVariable_1;
		EObject tmpMPackage = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		if (tmpMPackageToTPackage instanceof PackageToTPackage) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) tmpMPackageToTPackage;
			if (tmpTPackage instanceof TPackage) {
				TPackage tPackage = (TPackage) tmpTPackage;
				if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
					org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpMType instanceof InterfaceDeclaration) {
							InterfaceDeclaration mType = (InterfaceDeclaration) tmpMType;
							return new Object[] { mPackageToTPackage, tPackage, mPackage, pg, mType,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_1_1_performtransformation_blackBBBBBFBB(
			PackageToTPackage mPackageToTPackage, TPackage tPackage, org.eclipse.modisco.java.Package mPackage,
			TypeGraph pg, InterfaceDeclaration mType, InterfaceInPackage _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mPackageToTPackage, tPackage, mPackage, pg, mType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			InterfaceInPackage _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InterfaceInPackage_1_1_performtransformation_binding = pattern_InterfaceInPackage_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_InterfaceInPackage_1_1_performtransformation_binding != null) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result_pattern_InterfaceInPackage_1_1_performtransformation_binding[0];
			TPackage tPackage = (TPackage) result_pattern_InterfaceInPackage_1_1_performtransformation_binding[1];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_InterfaceInPackage_1_1_performtransformation_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_InterfaceInPackage_1_1_performtransformation_binding[3];
			InterfaceDeclaration mType = (InterfaceDeclaration) result_pattern_InterfaceInPackage_1_1_performtransformation_binding[4];

			Object[] result_pattern_InterfaceInPackage_1_1_performtransformation_black = pattern_InterfaceInPackage_1_1_performtransformation_blackBBBBBFBB(
					mPackageToTPackage, tPackage, mPackage, pg, mType, _this, isApplicableMatch);
			if (result_pattern_InterfaceInPackage_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InterfaceInPackage_1_1_performtransformation_black[5];

				return new Object[] { mPackageToTPackage, tPackage, mPackage, pg, mType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_1_1_performtransformation_greenFBFBFBB(TPackage tPackage,
			TypeGraph pg, InterfaceDeclaration mType, CSP csp) {
		ASTNodeToTAnnotatable annotatable2Annotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TInterface tType = BasicFactory.eINSTANCE.createTInterface();
		TypeToTAbstractType type2Type = PmFactory.eINSTANCE.createTypeToTAbstractType();
		Object _localVariable_0 = csp.getValue("tType", "tLib");
		Object _localVariable_1 = csp.getValue("tType", "tName");
		annotatable2Annotatable.setSource(mType);
		pg.getAllTypes().add(tType);
		pg.getInterfaces().add(tType);
		annotatable2Annotatable.setTarget(tType);
		tPackage.getInterfaces().add(tType);
		tPackage.getAllTypes().add(tType);
		type2Type.setSource(mType);
		type2Type.setTarget(tType);
		boolean tType_tLib_prime = (boolean) _localVariable_0;
		String tType_tName_prime = (String) _localVariable_1;
		tType.setTLib(Boolean.valueOf(tType_tLib_prime));
		tType.setTName(tType_tName_prime);
		return new Object[] { annotatable2Annotatable, tPackage, tType, pg, type2Type, mType, csp };
	}

	public static final Object[] pattern_InterfaceInPackage_1_2_collecttranslatedelements_blackBBBB(
			ASTNodeToTAnnotatable annotatable2Annotatable, TInterface tType, TypeToTAbstractType type2Type,
			InterfaceDeclaration mType) {
		return new Object[] { annotatable2Annotatable, tType, type2Type, mType };
	}

	public static final Object[] pattern_InterfaceInPackage_1_2_collecttranslatedelements_greenFBBBB(
			ASTNodeToTAnnotatable annotatable2Annotatable, TInterface tType, TypeToTAbstractType type2Type,
			InterfaceDeclaration mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(annotatable2Annotatable);
		ruleresult.getCreatedElements().add(tType);
		ruleresult.getCreatedLinkElements().add(type2Type);
		ruleresult.getTranslatedElements().add(mType);
		return new Object[] { ruleresult, annotatable2Annotatable, tType, type2Type, mType };
	}

	public static final Object[] pattern_InterfaceInPackage_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject annotatable2Annotatable, EObject tPackage,
			EObject tType, EObject mPackage, EObject pg, EObject type2Type, EObject mType) {
		if (!mPackageToTPackage.equals(tPackage)) {
			if (!mPackageToTPackage.equals(tType)) {
				if (!mPackageToTPackage.equals(pg)) {
					if (!mPackageToTPackage.equals(type2Type)) {
						if (!mPackageToTPackage.equals(mType)) {
							if (!annotatable2Annotatable.equals(mPackageToTPackage)) {
								if (!annotatable2Annotatable.equals(tPackage)) {
									if (!annotatable2Annotatable.equals(tType)) {
										if (!annotatable2Annotatable.equals(mPackage)) {
											if (!annotatable2Annotatable.equals(pg)) {
												if (!annotatable2Annotatable.equals(type2Type)) {
													if (!annotatable2Annotatable.equals(mType)) {
														if (!tPackage.equals(tType)) {
															if (!tPackage.equals(type2Type)) {
																if (!tType.equals(type2Type)) {
																	if (!mPackage.equals(mPackageToTPackage)) {
																		if (!mPackage.equals(tPackage)) {
																			if (!mPackage.equals(tType)) {
																				if (!mPackage.equals(pg)) {
																					if (!mPackage.equals(type2Type)) {
																						if (!mPackage.equals(mType)) {
																							if (!pg.equals(tPackage)) {
																								if (!pg.equals(tType)) {
																									if (!pg.equals(
																											type2Type)) {
																										if (!mType
																												.equals(tPackage)) {
																											if (!mType
																													.equals(tType)) {
																												if (!mType
																														.equals(pg)) {
																													if (!mType
																															.equals(type2Type)) {
																														return new Object[] {
																																ruleresult,
																																mPackageToTPackage,
																																annotatable2Annotatable,
																																tPackage,
																																tType,
																																mPackage,
																																pg,
																																type2Type,
																																mType };
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

	public static final Object[] pattern_InterfaceInPackage_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject annotatable2Annotatable, EObject tPackage, EObject tType,
			EObject mPackage, EObject pg, EObject type2Type, EObject mType) {
		EMoflonEdge pg__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____interfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type2Type__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotatable2Annotatable__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____interfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotatable2Annotatable__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type2Type__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InterfaceInPackage";
		String pg__tType____allTypes_name_prime = "allTypes";
		String tType__pg____model_name_prime = "model";
		String pg__tType____interfaces_name_prime = "interfaces";
		String type2Type__mType____source_name_prime = "source";
		String annotatable2Annotatable__tType____target_name_prime = "target";
		String tPackage__tType____interfaces_name_prime = "interfaces";
		String tPackage__tType____allTypes_name_prime = "allTypes";
		String tType__tPackage____package_name_prime = "package";
		String annotatable2Annotatable__mType____source_name_prime = "source";
		String type2Type__tType____target_name_prime = "target";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		pg__tType____allTypes.setSrc(pg);
		pg__tType____allTypes.setTrg(tType);
		ruleresult.getCreatedEdges().add(pg__tType____allTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		ruleresult.getCreatedEdges().add(tType__pg____model);
		pg__tType____interfaces.setSrc(pg);
		pg__tType____interfaces.setTrg(tType);
		ruleresult.getCreatedEdges().add(pg__tType____interfaces);
		type2Type__mType____source.setSrc(type2Type);
		type2Type__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(type2Type__mType____source);
		annotatable2Annotatable__tType____target.setSrc(annotatable2Annotatable);
		annotatable2Annotatable__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(annotatable2Annotatable__tType____target);
		tPackage__tType____interfaces.setSrc(tPackage);
		tPackage__tType____interfaces.setTrg(tType);
		ruleresult.getCreatedEdges().add(tPackage__tType____interfaces);
		tPackage__tType____allTypes.setSrc(tPackage);
		tPackage__tType____allTypes.setTrg(tType);
		ruleresult.getCreatedEdges().add(tPackage__tType____allTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		ruleresult.getCreatedEdges().add(tType__tPackage____package);
		annotatable2Annotatable__mType____source.setSrc(annotatable2Annotatable);
		annotatable2Annotatable__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(annotatable2Annotatable__mType____source);
		type2Type__tType____target.setSrc(type2Type);
		type2Type__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(type2Type__tType____target);
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mPackage__mType____ownedElements);
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		ruleresult.getTranslatedEdges().add(mType__mPackage____package);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		pg__tType____allTypes.setName(pg__tType____allTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		pg__tType____interfaces.setName(pg__tType____interfaces_name_prime);
		type2Type__mType____source.setName(type2Type__mType____source_name_prime);
		annotatable2Annotatable__tType____target.setName(annotatable2Annotatable__tType____target_name_prime);
		tPackage__tType____interfaces.setName(tPackage__tType____interfaces_name_prime);
		tPackage__tType____allTypes.setName(tPackage__tType____allTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		annotatable2Annotatable__mType____source.setName(annotatable2Annotatable__mType____source_name_prime);
		type2Type__tType____target.setName(type2Type__tType____target_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		return new Object[] { ruleresult, annotatable2Annotatable, tPackage, tType, mPackage, pg, type2Type, mType,
				pg__tType____allTypes, tType__pg____model, pg__tType____interfaces, type2Type__mType____source,
				annotatable2Annotatable__tType____target, tPackage__tType____interfaces, tPackage__tType____allTypes,
				tType__tPackage____package, annotatable2Annotatable__mType____source, type2Type__tType____target,
				mPackage__mType____ownedElements, mType__mPackage____package };
	}

	public static final void pattern_InterfaceInPackage_1_5_registerobjects_expressionBBBBBBBBBB(
			InterfaceInPackage _this, PerformRuleResult ruleresult, EObject mPackageToTPackage,
			EObject annotatable2Annotatable, EObject tPackage, EObject tType, EObject mPackage, EObject pg,
			EObject type2Type, EObject mType) {
		_this.registerObjects_FWD(ruleresult, mPackageToTPackage, annotatable2Annotatable, tPackage, tType, mPackage,
				pg, type2Type, mType);

	}

	public static final PerformRuleResult pattern_InterfaceInPackage_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_2_1_preparereturnvalue_bindingFB(InterfaceInPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_2_1_preparereturnvalue_blackFBB(EClass eClass,
			InterfaceInPackage _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_2_1_preparereturnvalue_bindingAndBlackFFB(
			InterfaceInPackage _this) {
		Object[] result_pattern_InterfaceInPackage_2_1_preparereturnvalue_binding = pattern_InterfaceInPackage_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceInPackage_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InterfaceInPackage_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceInPackage_2_1_preparereturnvalue_black = pattern_InterfaceInPackage_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InterfaceInPackage_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InterfaceInPackage_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InterfaceInPackage";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InterfaceInPackage_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mPackage");
		EObject _localVariable_1 = match.getObject("mType");
		EObject tmpMPackage = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
			if (tmpMType instanceof InterfaceDeclaration) {
				InterfaceDeclaration mType = (InterfaceDeclaration) tmpMType;
				return new Object[] { mPackage, mType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceInPackage_2_2_corematch_blackFFBBB(
			org.eclipse.modisco.java.Package mPackage, InterfaceDeclaration mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mPackage, PackageToTPackage.class, "source")) {
			TPackage tPackage = mPackageToTPackage.getTarget();
			if (tPackage != null) {
				_result.add(new Object[] { mPackageToTPackage, tPackage, mPackage, mType, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceInPackage_2_3_findcontext_blackBBBFB(
			PackageToTPackage mPackageToTPackage, TPackage tPackage, org.eclipse.modisco.java.Package mPackage,
			InterfaceDeclaration mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mPackage.equals(mPackageToTPackage.getSource())) {
			if (mPackage.getOwnedElements().contains(mType)) {
				if (tPackage.equals(mPackageToTPackage.getTarget())) {
					TypeGraph pg = tPackage.getModel();
					if (pg != null) {
						_result.add(new Object[] { mPackageToTPackage, tPackage, mPackage, pg, mType });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_2_3_findcontext_greenBBBBBFFFFFF(
			PackageToTPackage mPackageToTPackage, TPackage tPackage, org.eclipse.modisco.java.Package mPackage,
			TypeGraph pg, InterfaceDeclaration mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tPackage__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__tPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tPackage__pg____model_name_prime = "model";
		String mPackageToTPackage__mPackage____source_name_prime = "source";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		String mPackageToTPackage__tPackage____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(mType);
		tPackage__pg____model.setSrc(tPackage);
		tPackage__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tPackage__pg____model);
		mPackageToTPackage__mPackage____source.setSrc(mPackageToTPackage);
		mPackageToTPackage__mPackage____source.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__mPackage____source);
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mPackage__mType____ownedElements);
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mType__mPackage____package);
		mPackageToTPackage__tPackage____target.setSrc(mPackageToTPackage);
		mPackageToTPackage__tPackage____target.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__tPackage____target);
		tPackage__pg____model.setName(tPackage__pg____model_name_prime);
		mPackageToTPackage__mPackage____source.setName(mPackageToTPackage__mPackage____source_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		mPackageToTPackage__tPackage____target.setName(mPackageToTPackage__tPackage____target_name_prime);
		return new Object[] { mPackageToTPackage, tPackage, mPackage, pg, mType, isApplicableMatch,
				tPackage__pg____model, mPackageToTPackage__mPackage____source, mPackage__mType____ownedElements,
				mType__mPackage____package, mPackageToTPackage__tPackage____target };
	}

	public static final Object[] pattern_InterfaceInPackage_2_4_solveCSP_bindingFBBBBBBB(InterfaceInPackage _this,
			IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage, TPackage tPackage,
			org.eclipse.modisco.java.Package mPackage, TypeGraph pg, InterfaceDeclaration mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mPackageToTPackage, tPackage,
				mPackage, pg, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg, mType };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceInPackage_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			InterfaceInPackage _this, IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TPackage tPackage, org.eclipse.modisco.java.Package mPackage, TypeGraph pg, InterfaceDeclaration mType) {
		Object[] result_pattern_InterfaceInPackage_2_4_solveCSP_binding = pattern_InterfaceInPackage_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg, mType);
		if (result_pattern_InterfaceInPackage_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceInPackage_2_4_solveCSP_binding[0];

			Object[] result_pattern_InterfaceInPackage_2_4_solveCSP_black = pattern_InterfaceInPackage_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceInPackage_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg,
						mType };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceInPackage_2_5_checkCSP_expressionFBB(InterfaceInPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InterfaceInPackage_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InterfaceInPackage";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InterfaceInPackage_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_10_1_initialbindings_blackBBBBB(InterfaceInPackage _this,
			Match match, TPackage tPackage, TInterface tType, TypeGraph pg) {
		return new Object[] { _this, match, tPackage, tType, pg };
	}

	public static final Object[] pattern_InterfaceInPackage_10_2_SolveCSP_bindingFBBBBB(InterfaceInPackage _this,
			Match match, TPackage tPackage, TInterface tType, TypeGraph pg) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tPackage, tType, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tPackage, tType, pg };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceInPackage_10_2_SolveCSP_bindingAndBlackFBBBBB(
			InterfaceInPackage _this, Match match, TPackage tPackage, TInterface tType, TypeGraph pg) {
		Object[] result_pattern_InterfaceInPackage_10_2_SolveCSP_binding = pattern_InterfaceInPackage_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tPackage, tType, pg);
		if (result_pattern_InterfaceInPackage_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceInPackage_10_2_SolveCSP_binding[0];

			Object[] result_pattern_InterfaceInPackage_10_2_SolveCSP_black = pattern_InterfaceInPackage_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InterfaceInPackage_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tPackage, tType, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceInPackage_10_3_CheckCSP_expressionFBB(InterfaceInPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TPackage tPackage, TInterface tType, TypeGraph pg) {
		return new Object[] { match, tPackage, tType, pg };
	}

	public static final Object[] pattern_InterfaceInPackage_10_4_collectelementstobetranslated_greenBBBBFFFFFF(
			Match match, TPackage tPackage, TInterface tType, TypeGraph pg) {
		EMoflonEdge pg__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____interfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____interfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tType);
		String pg__tType____allTypes_name_prime = "allTypes";
		String tType__pg____model_name_prime = "model";
		String pg__tType____interfaces_name_prime = "interfaces";
		String tPackage__tType____interfaces_name_prime = "interfaces";
		String tPackage__tType____allTypes_name_prime = "allTypes";
		String tType__tPackage____package_name_prime = "package";
		pg__tType____allTypes.setSrc(pg);
		pg__tType____allTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____allTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		match.getToBeTranslatedEdges().add(tType__pg____model);
		pg__tType____interfaces.setSrc(pg);
		pg__tType____interfaces.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____interfaces);
		tPackage__tType____interfaces.setSrc(tPackage);
		tPackage__tType____interfaces.setTrg(tType);
		match.getToBeTranslatedEdges().add(tPackage__tType____interfaces);
		tPackage__tType____allTypes.setSrc(tPackage);
		tPackage__tType____allTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(tPackage__tType____allTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		match.getToBeTranslatedEdges().add(tType__tPackage____package);
		pg__tType____allTypes.setName(pg__tType____allTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		pg__tType____interfaces.setName(pg__tType____interfaces_name_prime);
		tPackage__tType____interfaces.setName(tPackage__tType____interfaces_name_prime);
		tPackage__tType____allTypes.setName(tPackage__tType____allTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		return new Object[] { match, tPackage, tType, pg, pg__tType____allTypes, tType__pg____model,
				pg__tType____interfaces, tPackage__tType____interfaces, tPackage__tType____allTypes,
				tType__tPackage____package };
	}

	public static final Object[] pattern_InterfaceInPackage_10_5_collectcontextelements_blackBBBB(Match match,
			TPackage tPackage, TInterface tType, TypeGraph pg) {
		return new Object[] { match, tPackage, tType, pg };
	}

	public static final Object[] pattern_InterfaceInPackage_10_5_collectcontextelements_greenBBBF(Match match,
			TPackage tPackage, TypeGraph pg) {
		EMoflonEdge tPackage__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tPackage);
		match.getContextNodes().add(pg);
		String tPackage__pg____model_name_prime = "model";
		tPackage__pg____model.setSrc(tPackage);
		tPackage__pg____model.setTrg(pg);
		match.getContextEdges().add(tPackage__pg____model);
		tPackage__pg____model.setName(tPackage__pg____model_name_prime);
		return new Object[] { match, tPackage, pg, tPackage__pg____model };
	}

	public static final void pattern_InterfaceInPackage_10_6_registerobjectstomatch_expressionBBBBB(
			InterfaceInPackage _this, Match match, TPackage tPackage, TInterface tType, TypeGraph pg) {
		_this.registerObjectsToMatch_BWD(match, tPackage, tType, pg);

	}

	public static final boolean pattern_InterfaceInPackage_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceInPackage_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mPackageToTPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("tType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_4 = isApplicableMatch.getObject("pg");
		EObject tmpMPackageToTPackage = _localVariable_0;
		EObject tmpTPackage = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpMPackage = _localVariable_3;
		EObject tmpPg = _localVariable_4;
		if (tmpMPackageToTPackage instanceof PackageToTPackage) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) tmpMPackageToTPackage;
			if (tmpTPackage instanceof TPackage) {
				TPackage tPackage = (TPackage) tmpTPackage;
				if (tmpTType instanceof TInterface) {
					TInterface tType = (TInterface) tmpTType;
					if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
						org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
						if (tmpPg instanceof TypeGraph) {
							TypeGraph pg = (TypeGraph) tmpPg;
							return new Object[] { mPackageToTPackage, tPackage, tType, mPackage, pg,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_11_1_performtransformation_blackBBBBBFBB(
			PackageToTPackage mPackageToTPackage, TPackage tPackage, TInterface tType,
			org.eclipse.modisco.java.Package mPackage, TypeGraph pg, InterfaceInPackage _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mPackageToTPackage, tPackage, tType, mPackage, pg, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			InterfaceInPackage _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InterfaceInPackage_11_1_performtransformation_binding = pattern_InterfaceInPackage_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_InterfaceInPackage_11_1_performtransformation_binding != null) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result_pattern_InterfaceInPackage_11_1_performtransformation_binding[0];
			TPackage tPackage = (TPackage) result_pattern_InterfaceInPackage_11_1_performtransformation_binding[1];
			TInterface tType = (TInterface) result_pattern_InterfaceInPackage_11_1_performtransformation_binding[2];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_InterfaceInPackage_11_1_performtransformation_binding[3];
			TypeGraph pg = (TypeGraph) result_pattern_InterfaceInPackage_11_1_performtransformation_binding[4];

			Object[] result_pattern_InterfaceInPackage_11_1_performtransformation_black = pattern_InterfaceInPackage_11_1_performtransformation_blackBBBBBFBB(
					mPackageToTPackage, tPackage, tType, mPackage, pg, _this, isApplicableMatch);
			if (result_pattern_InterfaceInPackage_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InterfaceInPackage_11_1_performtransformation_black[5];

				return new Object[] { mPackageToTPackage, tPackage, tType, mPackage, pg, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_11_1_performtransformation_greenFBBFFB(TInterface tType,
			org.eclipse.modisco.java.Package mPackage, CSP csp) {
		ASTNodeToTAnnotatable annotatable2Annotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType type2Type = PmFactory.eINSTANCE.createTypeToTAbstractType();
		InterfaceDeclaration mType = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		Object _localVariable_0 = csp.getValue("mType", "proxy");
		Object _localVariable_1 = csp.getValue("mType", "name");
		annotatable2Annotatable.setTarget(tType);
		type2Type.setTarget(tType);
		type2Type.setSource(mType);
		annotatable2Annotatable.setSource(mType);
		mPackage.getOwnedElements().add(mType);
		boolean mType_proxy_prime = (boolean) _localVariable_0;
		String mType_name_prime = (String) _localVariable_1;
		mType.setProxy(Boolean.valueOf(mType_proxy_prime));
		mType.setName(mType_name_prime);
		return new Object[] { annotatable2Annotatable, tType, mPackage, type2Type, mType, csp };
	}

	public static final Object[] pattern_InterfaceInPackage_11_2_collecttranslatedelements_blackBBBB(
			ASTNodeToTAnnotatable annotatable2Annotatable, TInterface tType, TypeToTAbstractType type2Type,
			InterfaceDeclaration mType) {
		return new Object[] { annotatable2Annotatable, tType, type2Type, mType };
	}

	public static final Object[] pattern_InterfaceInPackage_11_2_collecttranslatedelements_greenFBBBB(
			ASTNodeToTAnnotatable annotatable2Annotatable, TInterface tType, TypeToTAbstractType type2Type,
			InterfaceDeclaration mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(annotatable2Annotatable);
		ruleresult.getTranslatedElements().add(tType);
		ruleresult.getCreatedLinkElements().add(type2Type);
		ruleresult.getCreatedElements().add(mType);
		return new Object[] { ruleresult, annotatable2Annotatable, tType, type2Type, mType };
	}

	public static final Object[] pattern_InterfaceInPackage_11_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject annotatable2Annotatable, EObject tPackage,
			EObject tType, EObject mPackage, EObject pg, EObject type2Type, EObject mType) {
		if (!mPackageToTPackage.equals(tPackage)) {
			if (!mPackageToTPackage.equals(tType)) {
				if (!mPackageToTPackage.equals(pg)) {
					if (!mPackageToTPackage.equals(type2Type)) {
						if (!mPackageToTPackage.equals(mType)) {
							if (!annotatable2Annotatable.equals(mPackageToTPackage)) {
								if (!annotatable2Annotatable.equals(tPackage)) {
									if (!annotatable2Annotatable.equals(tType)) {
										if (!annotatable2Annotatable.equals(mPackage)) {
											if (!annotatable2Annotatable.equals(pg)) {
												if (!annotatable2Annotatable.equals(type2Type)) {
													if (!annotatable2Annotatable.equals(mType)) {
														if (!tPackage.equals(tType)) {
															if (!tPackage.equals(type2Type)) {
																if (!tType.equals(type2Type)) {
																	if (!mPackage.equals(mPackageToTPackage)) {
																		if (!mPackage.equals(tPackage)) {
																			if (!mPackage.equals(tType)) {
																				if (!mPackage.equals(pg)) {
																					if (!mPackage.equals(type2Type)) {
																						if (!mPackage.equals(mType)) {
																							if (!pg.equals(tPackage)) {
																								if (!pg.equals(tType)) {
																									if (!pg.equals(
																											type2Type)) {
																										if (!mType
																												.equals(tPackage)) {
																											if (!mType
																													.equals(tType)) {
																												if (!mType
																														.equals(pg)) {
																													if (!mType
																															.equals(type2Type)) {
																														return new Object[] {
																																ruleresult,
																																mPackageToTPackage,
																																annotatable2Annotatable,
																																tPackage,
																																tType,
																																mPackage,
																																pg,
																																type2Type,
																																mType };
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

	public static final Object[] pattern_InterfaceInPackage_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject annotatable2Annotatable, EObject tPackage, EObject tType,
			EObject mPackage, EObject pg, EObject type2Type, EObject mType) {
		EMoflonEdge pg__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____interfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type2Type__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotatable2Annotatable__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____interfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotatable2Annotatable__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type2Type__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InterfaceInPackage";
		String pg__tType____allTypes_name_prime = "allTypes";
		String tType__pg____model_name_prime = "model";
		String pg__tType____interfaces_name_prime = "interfaces";
		String type2Type__mType____source_name_prime = "source";
		String annotatable2Annotatable__tType____target_name_prime = "target";
		String tPackage__tType____interfaces_name_prime = "interfaces";
		String tPackage__tType____allTypes_name_prime = "allTypes";
		String tType__tPackage____package_name_prime = "package";
		String annotatable2Annotatable__mType____source_name_prime = "source";
		String type2Type__tType____target_name_prime = "target";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		pg__tType____allTypes.setSrc(pg);
		pg__tType____allTypes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(pg__tType____allTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tType__pg____model);
		pg__tType____interfaces.setSrc(pg);
		pg__tType____interfaces.setTrg(tType);
		ruleresult.getTranslatedEdges().add(pg__tType____interfaces);
		type2Type__mType____source.setSrc(type2Type);
		type2Type__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(type2Type__mType____source);
		annotatable2Annotatable__tType____target.setSrc(annotatable2Annotatable);
		annotatable2Annotatable__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(annotatable2Annotatable__tType____target);
		tPackage__tType____interfaces.setSrc(tPackage);
		tPackage__tType____interfaces.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tPackage__tType____interfaces);
		tPackage__tType____allTypes.setSrc(tPackage);
		tPackage__tType____allTypes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tPackage__tType____allTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		ruleresult.getTranslatedEdges().add(tType__tPackage____package);
		annotatable2Annotatable__mType____source.setSrc(annotatable2Annotatable);
		annotatable2Annotatable__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(annotatable2Annotatable__mType____source);
		type2Type__tType____target.setSrc(type2Type);
		type2Type__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(type2Type__tType____target);
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		ruleresult.getCreatedEdges().add(mPackage__mType____ownedElements);
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		ruleresult.getCreatedEdges().add(mType__mPackage____package);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		pg__tType____allTypes.setName(pg__tType____allTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		pg__tType____interfaces.setName(pg__tType____interfaces_name_prime);
		type2Type__mType____source.setName(type2Type__mType____source_name_prime);
		annotatable2Annotatable__tType____target.setName(annotatable2Annotatable__tType____target_name_prime);
		tPackage__tType____interfaces.setName(tPackage__tType____interfaces_name_prime);
		tPackage__tType____allTypes.setName(tPackage__tType____allTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		annotatable2Annotatable__mType____source.setName(annotatable2Annotatable__mType____source_name_prime);
		type2Type__tType____target.setName(type2Type__tType____target_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		return new Object[] { ruleresult, annotatable2Annotatable, tPackage, tType, mPackage, pg, type2Type, mType,
				pg__tType____allTypes, tType__pg____model, pg__tType____interfaces, type2Type__mType____source,
				annotatable2Annotatable__tType____target, tPackage__tType____interfaces, tPackage__tType____allTypes,
				tType__tPackage____package, annotatable2Annotatable__mType____source, type2Type__tType____target,
				mPackage__mType____ownedElements, mType__mPackage____package };
	}

	public static final void pattern_InterfaceInPackage_11_5_registerobjects_expressionBBBBBBBBBB(
			InterfaceInPackage _this, PerformRuleResult ruleresult, EObject mPackageToTPackage,
			EObject annotatable2Annotatable, EObject tPackage, EObject tType, EObject mPackage, EObject pg,
			EObject type2Type, EObject mType) {
		_this.registerObjects_BWD(ruleresult, mPackageToTPackage, annotatable2Annotatable, tPackage, tType, mPackage,
				pg, type2Type, mType);

	}

	public static final PerformRuleResult pattern_InterfaceInPackage_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_12_1_preparereturnvalue_bindingFB(
			InterfaceInPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_12_1_preparereturnvalue_blackFBB(EClass eClass,
			InterfaceInPackage _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_12_1_preparereturnvalue_bindingAndBlackFFB(
			InterfaceInPackage _this) {
		Object[] result_pattern_InterfaceInPackage_12_1_preparereturnvalue_binding = pattern_InterfaceInPackage_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceInPackage_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InterfaceInPackage_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceInPackage_12_1_preparereturnvalue_black = pattern_InterfaceInPackage_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InterfaceInPackage_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InterfaceInPackage_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InterfaceInPackage";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InterfaceInPackage_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tPackage");
		EObject _localVariable_1 = match.getObject("tType");
		EObject _localVariable_2 = match.getObject("pg");
		EObject tmpTPackage = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			if (tmpTType instanceof TInterface) {
				TInterface tType = (TInterface) tmpTType;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					return new Object[] { tPackage, tType, pg, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceInPackage_12_2_corematch_blackFBBFBB(TPackage tPackage,
			TInterface tType, TypeGraph pg, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tPackage, PackageToTPackage.class, "target")) {
			org.eclipse.modisco.java.Package mPackage = mPackageToTPackage.getSource();
			if (mPackage != null) {
				_result.add(new Object[] { mPackageToTPackage, tPackage, tType, mPackage, pg, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceInPackage_12_3_findcontext_blackBBBBB(
			PackageToTPackage mPackageToTPackage, TPackage tPackage, TInterface tType,
			org.eclipse.modisco.java.Package mPackage, TypeGraph pg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pg.getAllTypes().contains(tType)) {
			if (pg.getInterfaces().contains(tType)) {
				if (pg.equals(tPackage.getModel())) {
					if (mPackage.equals(mPackageToTPackage.getSource())) {
						if (tPackage.getInterfaces().contains(tType)) {
							if (tPackage.getAllTypes().contains(tType)) {
								if (tPackage.equals(mPackageToTPackage.getTarget())) {
									_result.add(new Object[] { mPackageToTPackage, tPackage, tType, mPackage, pg });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_12_3_findcontext_greenBBBBBFFFFFFFFFF(
			PackageToTPackage mPackageToTPackage, TPackage tPackage, TInterface tType,
			org.eclipse.modisco.java.Package mPackage, TypeGraph pg) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pg__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____interfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____interfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__tPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pg__tType____allTypes_name_prime = "allTypes";
		String tType__pg____model_name_prime = "model";
		String pg__tType____interfaces_name_prime = "interfaces";
		String tPackage__pg____model_name_prime = "model";
		String mPackageToTPackage__mPackage____source_name_prime = "source";
		String tPackage__tType____interfaces_name_prime = "interfaces";
		String tPackage__tType____allTypes_name_prime = "allTypes";
		String tType__tPackage____package_name_prime = "package";
		String mPackageToTPackage__tPackage____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(pg);
		pg__tType____allTypes.setSrc(pg);
		pg__tType____allTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____allTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tType__pg____model);
		pg__tType____interfaces.setSrc(pg);
		pg__tType____interfaces.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____interfaces);
		tPackage__pg____model.setSrc(tPackage);
		tPackage__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tPackage__pg____model);
		mPackageToTPackage__mPackage____source.setSrc(mPackageToTPackage);
		mPackageToTPackage__mPackage____source.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__mPackage____source);
		tPackage__tType____interfaces.setSrc(tPackage);
		tPackage__tType____interfaces.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tPackage__tType____interfaces);
		tPackage__tType____allTypes.setSrc(tPackage);
		tPackage__tType____allTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tPackage__tType____allTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(tType__tPackage____package);
		mPackageToTPackage__tPackage____target.setSrc(mPackageToTPackage);
		mPackageToTPackage__tPackage____target.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__tPackage____target);
		pg__tType____allTypes.setName(pg__tType____allTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		pg__tType____interfaces.setName(pg__tType____interfaces_name_prime);
		tPackage__pg____model.setName(tPackage__pg____model_name_prime);
		mPackageToTPackage__mPackage____source.setName(mPackageToTPackage__mPackage____source_name_prime);
		tPackage__tType____interfaces.setName(tPackage__tType____interfaces_name_prime);
		tPackage__tType____allTypes.setName(tPackage__tType____allTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		mPackageToTPackage__tPackage____target.setName(mPackageToTPackage__tPackage____target_name_prime);
		return new Object[] { mPackageToTPackage, tPackage, tType, mPackage, pg, isApplicableMatch,
				pg__tType____allTypes, tType__pg____model, pg__tType____interfaces, tPackage__pg____model,
				mPackageToTPackage__mPackage____source, tPackage__tType____interfaces, tPackage__tType____allTypes,
				tType__tPackage____package, mPackageToTPackage__tPackage____target };
	}

	public static final Object[] pattern_InterfaceInPackage_12_4_solveCSP_bindingFBBBBBBB(InterfaceInPackage _this,
			IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage, TPackage tPackage,
			TInterface tType, org.eclipse.modisco.java.Package mPackage, TypeGraph pg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mPackageToTPackage, tPackage, tType,
				mPackage, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tPackage, tType, mPackage, pg };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceInPackage_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			InterfaceInPackage _this, IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TPackage tPackage, TInterface tType, org.eclipse.modisco.java.Package mPackage, TypeGraph pg) {
		Object[] result_pattern_InterfaceInPackage_12_4_solveCSP_binding = pattern_InterfaceInPackage_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, mPackageToTPackage, tPackage, tType, mPackage, pg);
		if (result_pattern_InterfaceInPackage_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceInPackage_12_4_solveCSP_binding[0];

			Object[] result_pattern_InterfaceInPackage_12_4_solveCSP_black = pattern_InterfaceInPackage_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceInPackage_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tPackage, tType, mPackage,
						pg };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceInPackage_12_5_checkCSP_expressionFBB(InterfaceInPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InterfaceInPackage_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InterfaceInPackage";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InterfaceInPackage_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_20_1_preparereturnvalue_bindingFB(
			InterfaceInPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			InterfaceInPackage _this) {
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

	public static final Object[] pattern_InterfaceInPackage_20_1_preparereturnvalue_bindingAndBlackFFBF(
			InterfaceInPackage _this) {
		Object[] result_pattern_InterfaceInPackage_20_1_preparereturnvalue_binding = pattern_InterfaceInPackage_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceInPackage_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InterfaceInPackage_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceInPackage_20_1_preparereturnvalue_black = pattern_InterfaceInPackage_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InterfaceInPackage_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InterfaceInPackage_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InterfaceInPackage_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_InterfaceInPackage_20_2_testcorematchandDECs_black_nac_0BB(TInterface tType,
			TPackage tPackage) {
		for (TPackage __DEC_tType_interfaces_698985 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TPackage.class, "interfaces")) {
			if (!tPackage.equals(__DEC_tType_interfaces_698985)) {
				return new Object[] { tType, tPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_20_2_testcorematchandDECs_black_nac_1BB(TInterface tType,
			TypeGraph pg) {
		for (TypeGraph __DEC_tType_interfaces_419721 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "interfaces")) {
			if (!pg.equals(__DEC_tType_interfaces_419721)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_20_2_testcorematchandDECs_black_nac_2BB(TInterface tType,
			TPackage tPackage) {
		TPackage __DEC_tType_allTypes_650020 = tType.getPackage();
		if (__DEC_tType_allTypes_650020 != null) {
			if (!tPackage.equals(__DEC_tType_allTypes_650020)) {
				return new Object[] { tType, tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_20_2_testcorematchandDECs_black_nac_3B(TInterface tType) {
		TAbstractType __DEC_tType_innerTypes_899363 = tType.getOuterType();
		if (__DEC_tType_innerTypes_899363 != null) {
			if (!tType.equals(__DEC_tType_innerTypes_899363)) {
				return new Object[] { tType };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceInPackage_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_allTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPg = _edge_allTypes.getSrc();
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			EObject tmpTType = _edge_allTypes.getTrg();
			if (tmpTType instanceof TInterface) {
				TInterface tType = (TInterface) tmpTType;
				if (pg.getAllTypes().contains(tType)) {
					if (pg.getInterfaces().contains(tType)) {
						TPackage tPackage = tType.getPackage();
						if (tPackage != null) {
							if (pg.equals(tPackage.getModel())) {
								if (tPackage.getInterfaces().contains(tType)) {
									if (pattern_InterfaceInPackage_20_2_testcorematchandDECs_black_nac_1BB(tType,
											pg) == null) {
										if (pattern_InterfaceInPackage_20_2_testcorematchandDECs_black_nac_3B(
												tType) == null) {
											if (pattern_InterfaceInPackage_20_2_testcorematchandDECs_black_nac_0BB(
													tType, tPackage) == null) {
												if (pattern_InterfaceInPackage_20_2_testcorematchandDECs_black_nac_2BB(
														tType, tPackage) == null) {
													_result.add(new Object[] { tPackage, tType, pg, _edge_allTypes });
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

	public static final Object[] pattern_InterfaceInPackage_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InterfaceInPackage_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			InterfaceInPackage _this, Match match, TPackage tPackage, TInterface tType, TypeGraph pg) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tPackage, tType, pg);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InterfaceInPackage_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InterfaceInPackage _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InterfaceInPackage_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_21_1_preparereturnvalue_bindingFB(
			InterfaceInPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			InterfaceInPackage _this) {
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

	public static final Object[] pattern_InterfaceInPackage_21_1_preparereturnvalue_bindingAndBlackFFBF(
			InterfaceInPackage _this) {
		Object[] result_pattern_InterfaceInPackage_21_1_preparereturnvalue_binding = pattern_InterfaceInPackage_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceInPackage_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InterfaceInPackage_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceInPackage_21_1_preparereturnvalue_black = pattern_InterfaceInPackage_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InterfaceInPackage_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InterfaceInPackage_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InterfaceInPackage_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_InterfaceInPackage_21_2_testcorematchandDECs_black_nac_0B(
			InterfaceDeclaration mType) {
		AbstractTypeDeclaration __DEC_mType_abstractTypeDeclaration_156474 = mType.getAbstractTypeDeclaration();
		if (__DEC_mType_abstractTypeDeclaration_156474 != null) {
			if (!mType.equals(__DEC_mType_abstractTypeDeclaration_156474)) {
				return new Object[] { mType };
			}
		}

		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_21_2_testcorematchandDECs_black_nac_1B(
			InterfaceDeclaration mType) {
		AnonymousClassDeclaration __DEC_mType_anonymousClassDeclarationOwner_102118 = mType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mType_anonymousClassDeclarationOwner_102118 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_21_2_testcorematchandDECs_black_nac_2B(
			InterfaceDeclaration mType) {
		for (Model __DEC_mType_orphanTypes_938714 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, Model.class, "orphanTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_21_2_testcorematchandDECs_black_nac_3B(
			InterfaceDeclaration mType) {
		for (MAbstractMethodDefinition __DEC_mType_mInnerTypes_113112 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceInPackage_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMPackage = _edge_ownedElements.getSrc();
		if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
			EObject tmpMType = _edge_ownedElements.getTrg();
			if (tmpMType instanceof InterfaceDeclaration) {
				InterfaceDeclaration mType = (InterfaceDeclaration) tmpMType;
				if (mPackage.getOwnedElements().contains(mType)) {
					if (pattern_InterfaceInPackage_21_2_testcorematchandDECs_black_nac_0B(mType) == null) {
						if (pattern_InterfaceInPackage_21_2_testcorematchandDECs_black_nac_1B(mType) == null) {
							if (pattern_InterfaceInPackage_21_2_testcorematchandDECs_black_nac_2B(mType) == null) {
								if (pattern_InterfaceInPackage_21_2_testcorematchandDECs_black_nac_3B(mType) == null) {
									_result.add(new Object[] { mPackage, mType, _edge_ownedElements });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InterfaceInPackage_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			InterfaceInPackage _this, Match match, org.eclipse.modisco.java.Package mPackage,
			InterfaceDeclaration mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mPackage, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InterfaceInPackage_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InterfaceInPackage _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InterfaceInPackage_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_24_1_prepare_blackB(InterfaceInPackage _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InterfaceInPackage_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_InterfaceInPackage_24_2_matchsrctrgcontext_bindingFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tPackage");
		EObject _localVariable_1 = targetMatch.getObject("tType");
		EObject _localVariable_2 = sourceMatch.getObject("mPackage");
		EObject _localVariable_3 = targetMatch.getObject("pg");
		EObject _localVariable_4 = sourceMatch.getObject("mType");
		EObject tmpTPackage = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpMPackage = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			if (tmpTType instanceof TInterface) {
				TInterface tType = (TInterface) tmpTType;
				if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
					org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpMType instanceof InterfaceDeclaration) {
							InterfaceDeclaration mType = (InterfaceDeclaration) tmpMType;
							return new Object[] { tPackage, tType, mPackage, pg, mType, targetMatch, sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_24_2_matchsrctrgcontext_blackBBBBBBB(TPackage tPackage,
			TInterface tType, org.eclipse.modisco.java.Package mPackage, TypeGraph pg, InterfaceDeclaration mType,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tPackage, tType, mPackage, pg, mType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InterfaceInPackage_24_2_matchsrctrgcontext_binding = pattern_InterfaceInPackage_24_2_matchsrctrgcontext_bindingFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_InterfaceInPackage_24_2_matchsrctrgcontext_binding != null) {
			TPackage tPackage = (TPackage) result_pattern_InterfaceInPackage_24_2_matchsrctrgcontext_binding[0];
			TInterface tType = (TInterface) result_pattern_InterfaceInPackage_24_2_matchsrctrgcontext_binding[1];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_InterfaceInPackage_24_2_matchsrctrgcontext_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_InterfaceInPackage_24_2_matchsrctrgcontext_binding[3];
			InterfaceDeclaration mType = (InterfaceDeclaration) result_pattern_InterfaceInPackage_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_InterfaceInPackage_24_2_matchsrctrgcontext_black = pattern_InterfaceInPackage_24_2_matchsrctrgcontext_blackBBBBBBB(
					tPackage, tType, mPackage, pg, mType, sourceMatch, targetMatch);
			if (result_pattern_InterfaceInPackage_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tPackage, tType, mPackage, pg, mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_24_3_solvecsp_bindingFBBBBBBBB(InterfaceInPackage _this,
			TPackage tPackage, TInterface tType, org.eclipse.modisco.java.Package mPackage, TypeGraph pg,
			InterfaceDeclaration mType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(tPackage, tType, mPackage, pg, mType, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, tPackage, tType, mPackage, pg, mType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceInPackage_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			InterfaceInPackage _this, TPackage tPackage, TInterface tType, org.eclipse.modisco.java.Package mPackage,
			TypeGraph pg, InterfaceDeclaration mType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InterfaceInPackage_24_3_solvecsp_binding = pattern_InterfaceInPackage_24_3_solvecsp_bindingFBBBBBBBB(
				_this, tPackage, tType, mPackage, pg, mType, sourceMatch, targetMatch);
		if (result_pattern_InterfaceInPackage_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceInPackage_24_3_solvecsp_binding[0];

			Object[] result_pattern_InterfaceInPackage_24_3_solvecsp_black = pattern_InterfaceInPackage_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_InterfaceInPackage_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tPackage, tType, mPackage, pg, mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceInPackage_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceInPackage_24_5_matchcorrcontext_blackFBBBB(
			TPackage tPackage, org.eclipse.modisco.java.Package mPackage, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mPackage, PackageToTPackage.class, "source")) {
				if (tPackage.equals(mPackageToTPackage.getTarget())) {
					_result.add(new Object[] { mPackageToTPackage, tPackage, mPackage, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_24_5_matchcorrcontext_greenBBBF(
			PackageToTPackage mPackageToTPackage, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "InterfaceInPackage";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mPackageToTPackage);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mPackageToTPackage, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_InterfaceInPackage_24_6_createcorrespondence_blackBBBBBB(TPackage tPackage,
			TInterface tType, org.eclipse.modisco.java.Package mPackage, TypeGraph pg, InterfaceDeclaration mType,
			CCMatch ccMatch) {
		return new Object[] { tPackage, tType, mPackage, pg, mType, ccMatch };
	}

	public static final Object[] pattern_InterfaceInPackage_24_6_createcorrespondence_greenFBFBB(TInterface tType,
			InterfaceDeclaration mType, CCMatch ccMatch) {
		ASTNodeToTAnnotatable annotatable2Annotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType type2Type = PmFactory.eINSTANCE.createTypeToTAbstractType();
		annotatable2Annotatable.setTarget(tType);
		annotatable2Annotatable.setSource(mType);
		ccMatch.getCreateCorr().add(annotatable2Annotatable);
		type2Type.setSource(mType);
		type2Type.setTarget(tType);
		ccMatch.getCreateCorr().add(type2Type);
		return new Object[] { annotatable2Annotatable, tType, type2Type, mType, ccMatch };
	}

	public static final Object[] pattern_InterfaceInPackage_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_InterfaceInPackage_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "InterfaceInPackage";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_InterfaceInPackage_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_27_1_matchtggpattern_black_nac_0B(
			InterfaceDeclaration mType) {
		AbstractTypeDeclaration __DEC_mType_abstractTypeDeclaration_47511 = mType.getAbstractTypeDeclaration();
		if (__DEC_mType_abstractTypeDeclaration_47511 != null) {
			if (!mType.equals(__DEC_mType_abstractTypeDeclaration_47511)) {
				return new Object[] { mType };
			}
		}

		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_27_1_matchtggpattern_black_nac_1B(
			InterfaceDeclaration mType) {
		AnonymousClassDeclaration __DEC_mType_anonymousClassDeclarationOwner_750661 = mType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mType_anonymousClassDeclarationOwner_750661 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_27_1_matchtggpattern_black_nac_2B(
			InterfaceDeclaration mType) {
		for (Model __DEC_mType_orphanTypes_570595 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, Model.class, "orphanTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_27_1_matchtggpattern_black_nac_3B(
			InterfaceDeclaration mType) {
		for (MAbstractMethodDefinition __DEC_mType_mInnerTypes_477403 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_27_1_matchtggpattern_blackBB(
			org.eclipse.modisco.java.Package mPackage, InterfaceDeclaration mType) {
		if (mPackage.getOwnedElements().contains(mType)) {
			if (pattern_InterfaceInPackage_27_1_matchtggpattern_black_nac_0B(mType) == null) {
				if (pattern_InterfaceInPackage_27_1_matchtggpattern_black_nac_1B(mType) == null) {
					if (pattern_InterfaceInPackage_27_1_matchtggpattern_black_nac_2B(mType) == null) {
						if (pattern_InterfaceInPackage_27_1_matchtggpattern_black_nac_3B(mType) == null) {
							return new Object[] { mPackage, mType };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceInPackage_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceInPackage_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_28_1_matchtggpattern_black_nac_0BB(TInterface tType,
			TPackage tPackage) {
		for (TPackage __DEC_tType_interfaces_294571 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TPackage.class, "interfaces")) {
			if (!tPackage.equals(__DEC_tType_interfaces_294571)) {
				return new Object[] { tType, tPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_28_1_matchtggpattern_black_nac_1BB(TInterface tType,
			TypeGraph pg) {
		for (TypeGraph __DEC_tType_interfaces_359240 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "interfaces")) {
			if (!pg.equals(__DEC_tType_interfaces_359240)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_28_1_matchtggpattern_black_nac_2BB(TInterface tType,
			TPackage tPackage) {
		TPackage __DEC_tType_allTypes_129904 = tType.getPackage();
		if (__DEC_tType_allTypes_129904 != null) {
			if (!tPackage.equals(__DEC_tType_allTypes_129904)) {
				return new Object[] { tType, tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_28_1_matchtggpattern_black_nac_3B(TInterface tType) {
		TAbstractType __DEC_tType_innerTypes_932003 = tType.getOuterType();
		if (__DEC_tType_innerTypes_932003 != null) {
			if (!tType.equals(__DEC_tType_innerTypes_932003)) {
				return new Object[] { tType };
			}
		}

		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_28_1_matchtggpattern_blackBBB(TPackage tPackage,
			TInterface tType, TypeGraph pg) {
		if (pg.getAllTypes().contains(tType)) {
			if (pg.getInterfaces().contains(tType)) {
				if (pg.equals(tPackage.getModel())) {
					if (tPackage.getInterfaces().contains(tType)) {
						if (tPackage.getAllTypes().contains(tType)) {
							if (pattern_InterfaceInPackage_28_1_matchtggpattern_black_nac_0BB(tType,
									tPackage) == null) {
								if (pattern_InterfaceInPackage_28_1_matchtggpattern_black_nac_1BB(tType, pg) == null) {
									if (pattern_InterfaceInPackage_28_1_matchtggpattern_black_nac_2BB(tType,
											tPackage) == null) {
										if (pattern_InterfaceInPackage_28_1_matchtggpattern_black_nac_3B(
												tType) == null) {
											return new Object[] { tPackage, tType, pg };
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

	public static final boolean pattern_InterfaceInPackage_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceInPackage_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_29_1_createresult_blackB(InterfaceInPackage _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InterfaceInPackage_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_InterfaceInPackage_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, PackageToTPackage mPackageToTPackage) {
		if (ruleResult.getCorrObjects().contains(mPackageToTPackage)) {
			return new Object[] { ruleResult, mPackageToTPackage };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.modisco.java.Package mPackage) {
		if (ruleResult.getSourceObjects().contains(mPackage)) {
			return new Object[] { ruleResult, mPackage };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TPackage tPackage) {
		if (ruleResult.getTargetObjects().contains(tPackage)) {
			return new Object[] { ruleResult, tPackage };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceInPackage_29_2_isapplicablecore_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mPackageToTPackageList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMPackageToTPackage : mPackageToTPackageList.getEntryObjects()) {
				if (tmpMPackageToTPackage instanceof PackageToTPackage) {
					PackageToTPackage mPackageToTPackage = (PackageToTPackage) tmpMPackageToTPackage;
					org.eclipse.modisco.java.Package mPackage = mPackageToTPackage.getSource();
					if (mPackage != null) {
						TPackage tPackage = mPackageToTPackage.getTarget();
						if (tPackage != null) {
							TypeGraph pg = tPackage.getModel();
							if (pg != null) {
								if (pattern_InterfaceInPackage_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										mPackageToTPackage) == null) {
									if (pattern_InterfaceInPackage_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mPackage) == null) {
										if (pattern_InterfaceInPackage_29_2_isapplicablecore_black_nac_2BB(ruleResult,
												tPackage) == null) {
											if (pattern_InterfaceInPackage_29_2_isapplicablecore_black_nac_3BB(
													ruleResult, pg) == null) {
												_result.add(new Object[] { mPackageToTPackageList, mPackageToTPackage,
														mPackage, tPackage, pg, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_InterfaceInPackage_29_3_solveCSP_bindingFBBBBBBB(InterfaceInPackage _this,
			IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage, TPackage tPackage,
			org.eclipse.modisco.java.Package mPackage, TypeGraph pg, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mPackageToTPackage, tPackage,
				mPackage, pg, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceInPackage_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceInPackage_29_3_solveCSP_bindingAndBlackFBBBBBBB(
			InterfaceInPackage _this, IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TPackage tPackage, org.eclipse.modisco.java.Package mPackage, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_InterfaceInPackage_29_3_solveCSP_binding = pattern_InterfaceInPackage_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg, ruleResult);
		if (result_pattern_InterfaceInPackage_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceInPackage_29_3_solveCSP_binding[0];

			Object[] result_pattern_InterfaceInPackage_29_3_solveCSP_black = pattern_InterfaceInPackage_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceInPackage_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceInPackage_29_4_checkCSP_expressionFBB(InterfaceInPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceInPackage_29_5_checknacs_blackBBBB(
			PackageToTPackage mPackageToTPackage, TPackage tPackage, org.eclipse.modisco.java.Package mPackage,
			TypeGraph pg) {
		return new Object[] { mPackageToTPackage, tPackage, mPackage, pg };
	}

	public static final Object[] pattern_InterfaceInPackage_29_6_perform_blackBBBBB(
			PackageToTPackage mPackageToTPackage, TPackage tPackage, org.eclipse.modisco.java.Package mPackage,
			TypeGraph pg, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mPackageToTPackage, tPackage, mPackage, pg, ruleResult };
	}

	public static final Object[] pattern_InterfaceInPackage_29_6_perform_greenFBFBBFFBB(TPackage tPackage,
			org.eclipse.modisco.java.Package mPackage, TypeGraph pg, ModelgeneratorRuleResult ruleResult, CSP csp) {
		ASTNodeToTAnnotatable annotatable2Annotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TInterface tType = BasicFactory.eINSTANCE.createTInterface();
		TypeToTAbstractType type2Type = PmFactory.eINSTANCE.createTypeToTAbstractType();
		InterfaceDeclaration mType = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		Object _localVariable_0 = csp.getValue("tType", "tLib");
		Object _localVariable_1 = csp.getValue("tType", "tName");
		Object _localVariable_2 = csp.getValue("mType", "proxy");
		Object _localVariable_3 = csp.getValue("mType", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(annotatable2Annotatable);
		pg.getAllTypes().add(tType);
		pg.getInterfaces().add(tType);
		annotatable2Annotatable.setTarget(tType);
		tPackage.getInterfaces().add(tType);
		tPackage.getAllTypes().add(tType);
		ruleResult.getTargetObjects().add(tType);
		type2Type.setTarget(tType);
		ruleResult.getCorrObjects().add(type2Type);
		type2Type.setSource(mType);
		annotatable2Annotatable.setSource(mType);
		mPackage.getOwnedElements().add(mType);
		ruleResult.getSourceObjects().add(mType);
		boolean tType_tLib_prime = (boolean) _localVariable_0;
		String tType_tName_prime = (String) _localVariable_1;
		boolean mType_proxy_prime = (boolean) _localVariable_2;
		String mType_name_prime = (String) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		tType.setTLib(Boolean.valueOf(tType_tLib_prime));
		tType.setTName(tType_tName_prime);
		mType.setProxy(Boolean.valueOf(mType_proxy_prime));
		mType.setName(mType_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { annotatable2Annotatable, tPackage, tType, mPackage, pg, type2Type, mType, ruleResult,
				csp };
	}

	public static final ModelgeneratorRuleResult pattern_InterfaceInPackage_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InterfaceInPackageImpl
