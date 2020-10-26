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
import org.gravity.tgg.modisco.pm.InterfaceDeclarationToTInterface;
import org.gravity.tgg.modisco.pm.PackageToTPackage;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.Interface;
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
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl extends AbstractRuleImpl implements Interface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.Package mPackage,
			InterfaceDeclaration mType) {

		Object[] result1_black = InterfaceImpl.pattern_Interface_0_1_initialbindings_blackBBBB(this, match, mPackage,
				mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = InterfaceImpl.pattern_Interface_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, mPackage, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InterfaceImpl.pattern_Interface_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InterfaceImpl.pattern_Interface_0_4_collectelementstobetranslated_blackBBB(match,
					mPackage, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
			}
			InterfaceImpl.pattern_Interface_0_4_collectelementstobetranslated_greenBBBFF(match, mPackage, mType);
			//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result4_green[4];

			Object[] result5_black = InterfaceImpl.pattern_Interface_0_5_collectcontextelements_blackBBB(match,
					mPackage, mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
			}
			InterfaceImpl.pattern_Interface_0_5_collectcontextelements_greenBB(match, mPackage);

			// 
			InterfaceImpl.pattern_Interface_0_6_registerobjectstomatch_expressionBBBB(this, match, mPackage, mType);
			return InterfaceImpl.pattern_Interface_0_7_expressionF();
		} else {
			return InterfaceImpl.pattern_Interface_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InterfaceImpl
				.pattern_Interface_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
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
		Object[] result1_green = InterfaceImpl.pattern_Interface_1_1_performtransformation_greenBFFBFFBB(tPackage, pg,
				mType, csp);
		TInterface tType = (TInterface) result1_green[1];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_green[2];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[4];
		InterfaceDeclarationToTInterface mInterfaceDeclarationtoTInterface = (InterfaceDeclarationToTInterface) result1_green[5];

		Object[] result2_black = InterfaceImpl.pattern_Interface_1_2_collecttranslatedelements_blackBBBBB(tType,
				mTypeToTType, mBodyToTAnnotation, mInterfaceDeclarationtoTInterface, mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tType] = " + tType + ", "
					+ "[mTypeToTType] = " + mTypeToTType + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", "
					+ "[mInterfaceDeclarationtoTInterface] = " + mInterfaceDeclarationtoTInterface + ", " + "[mType] = "
					+ mType + ".");
		}
		Object[] result2_green = InterfaceImpl.pattern_Interface_1_2_collecttranslatedelements_greenFBBBBB(tType,
				mTypeToTType, mBodyToTAnnotation, mInterfaceDeclarationtoTInterface, mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InterfaceImpl.pattern_Interface_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
				mPackageToTPackage, tPackage, tType, mPackage, mTypeToTType, pg, mBodyToTAnnotation,
				mInterfaceDeclarationtoTInterface, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ", " + "[tPackage] = " + tPackage + ", "
					+ "[tType] = " + tType + ", " + "[mPackage] = " + mPackage + ", " + "[mTypeToTType] = "
					+ mTypeToTType + ", " + "[pg] = " + pg + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation
					+ ", " + "[mInterfaceDeclarationtoTInterface] = " + mInterfaceDeclarationtoTInterface + ", "
					+ "[mType] = " + mType + ".");
		}
		InterfaceImpl.pattern_Interface_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFFF(ruleresult, tPackage,
				tType, mPackage, mTypeToTType, pg, mBodyToTAnnotation, mInterfaceDeclarationtoTInterface, mType);
		//nothing EMoflonEdge mBodyToTAnnotation__tType____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge pg__tType____interfaces = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mBodyToTAnnotation__mType____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tPackage__tType____interfaces = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tType__pg____pg = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge mInterfaceDeclarationtoTInterface__mType____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge mInterfaceDeclarationtoTInterface__tType____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[22];

		// 
		// 
		InterfaceImpl.pattern_Interface_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, mPackageToTPackage,
				tPackage, tType, mPackage, mTypeToTType, pg, mBodyToTAnnotation, mInterfaceDeclarationtoTInterface,
				mType);
		return InterfaceImpl.pattern_Interface_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = InterfaceImpl
				.pattern_Interface_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InterfaceImpl.pattern_Interface_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InterfaceImpl.pattern_Interface_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_binding[0];
		InterfaceDeclaration mType = (InterfaceDeclaration) result2_binding[1];
		for (Object[] result2_black : InterfaceImpl.pattern_Interface_2_2_corematch_blackFFBBB(mPackage, mType,
				match)) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[0];
			TPackage tPackage = (TPackage) result2_black[1];
			// ForEach 
			for (Object[] result3_black : InterfaceImpl.pattern_Interface_2_3_findcontext_blackBBBFB(mPackageToTPackage,
					tPackage, mPackage, mType)) {
				TypeGraph pg = (TypeGraph) result3_black[3];
				Object[] result3_green = InterfaceImpl.pattern_Interface_2_3_findcontext_greenBBBBBFFFFFF(
						mPackageToTPackage, tPackage, mPackage, pg, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge tPackage__pg____typeGraph = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mPackageToTPackage__mPackage____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = InterfaceImpl.pattern_Interface_2_4_solveCSP_bindingAndBlackFBBBBBBB(
						this, isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackageToTPackage] = "
							+ mPackageToTPackage + ", " + "[tPackage] = " + tPackage + ", " + "[mPackage] = " + mPackage
							+ ", " + "[pg] = " + pg + ", " + "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InterfaceImpl.pattern_Interface_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InterfaceImpl
							.pattern_Interface_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InterfaceImpl.pattern_Interface_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InterfaceImpl.pattern_Interface_2_7_expressionFB(ruleresult);
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
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");
		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType.proxy", true, csp);
		var_mType_proxy.setValue(mType.isProxy());
		var_mType_proxy.setType("Boolean");

		// Create unbound variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", csp);
		var_tType_tName.setType("String");
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", csp);
		var_tType_tLib.setType("Boolean");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_name, var_tType_tName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_mType_proxy, var_tType_tLib);

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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject tPackage,
			EObject tType, EObject mPackage, EObject mTypeToTType, EObject pg, EObject mBodyToTAnnotation,
			EObject mInterfaceDeclarationtoTInterface, EObject mType) {
		ruleresult.registerObject("mPackageToTPackage", mPackageToTPackage);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mInterfaceDeclarationtoTInterface", mInterfaceDeclarationtoTInterface);
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

		Object[] result1_black = InterfaceImpl.pattern_Interface_10_1_initialbindings_blackBBBBB(this, match, tPackage,
				tType, pg);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tPackage] = " + tPackage + ", " + "[tType] = " + tType + ", "
					+ "[pg] = " + pg + ".");
		}

		Object[] result2_bindingAndBlack = InterfaceImpl.pattern_Interface_10_2_SolveCSP_bindingAndBlackFBBBBB(this,
				match, tPackage, tType, pg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tPackage] = " + tPackage + ", " + "[tType] = " + tType + ", "
					+ "[pg] = " + pg + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InterfaceImpl.pattern_Interface_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InterfaceImpl.pattern_Interface_10_4_collectelementstobetranslated_blackBBBB(match,
					tPackage, tType, pg);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPackage] = " + tPackage + ", " + "[tType] = " + tType + ", " + "[pg] = " + pg + ".");
			}
			InterfaceImpl.pattern_Interface_10_4_collectelementstobetranslated_greenBBBBFFFFFF(match, tPackage, tType,
					pg);
			//nothing EMoflonEdge pg__tType____interfaces = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tPackage__tType____interfaces = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tType__pg____pg = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result4_green[9];

			Object[] result5_black = InterfaceImpl.pattern_Interface_10_5_collectcontextelements_blackBBBB(match,
					tPackage, tType, pg);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPackage] = " + tPackage + ", " + "[tType] = " + tType + ", " + "[pg] = " + pg + ".");
			}
			InterfaceImpl.pattern_Interface_10_5_collectcontextelements_greenBBBF(match, tPackage, pg);
			//nothing EMoflonEdge tPackage__pg____typeGraph = (EMoflonEdge) result5_green[3];

			// 
			InterfaceImpl.pattern_Interface_10_6_registerobjectstomatch_expressionBBBBB(this, match, tPackage, tType,
					pg);
			return InterfaceImpl.pattern_Interface_10_7_expressionF();
		} else {
			return InterfaceImpl.pattern_Interface_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InterfaceImpl
				.pattern_Interface_11_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
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
		Object[] result1_green = InterfaceImpl.pattern_Interface_11_1_performtransformation_greenBBFFFFB(tType,
				mPackage, csp);
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_green[2];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[3];
		InterfaceDeclarationToTInterface mInterfaceDeclarationtoTInterface = (InterfaceDeclarationToTInterface) result1_green[4];
		InterfaceDeclaration mType = (InterfaceDeclaration) result1_green[5];

		Object[] result2_black = InterfaceImpl.pattern_Interface_11_2_collecttranslatedelements_blackBBBBB(tType,
				mTypeToTType, mBodyToTAnnotation, mInterfaceDeclarationtoTInterface, mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tType] = " + tType + ", "
					+ "[mTypeToTType] = " + mTypeToTType + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", "
					+ "[mInterfaceDeclarationtoTInterface] = " + mInterfaceDeclarationtoTInterface + ", " + "[mType] = "
					+ mType + ".");
		}
		Object[] result2_green = InterfaceImpl.pattern_Interface_11_2_collecttranslatedelements_greenFBBBBB(tType,
				mTypeToTType, mBodyToTAnnotation, mInterfaceDeclarationtoTInterface, mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InterfaceImpl.pattern_Interface_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
				mPackageToTPackage, tPackage, tType, mPackage, mTypeToTType, pg, mBodyToTAnnotation,
				mInterfaceDeclarationtoTInterface, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ", " + "[tPackage] = " + tPackage + ", "
					+ "[tType] = " + tType + ", " + "[mPackage] = " + mPackage + ", " + "[mTypeToTType] = "
					+ mTypeToTType + ", " + "[pg] = " + pg + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation
					+ ", " + "[mInterfaceDeclarationtoTInterface] = " + mInterfaceDeclarationtoTInterface + ", "
					+ "[mType] = " + mType + ".");
		}
		InterfaceImpl.pattern_Interface_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFFF(ruleresult, tPackage,
				tType, mPackage, mTypeToTType, pg, mBodyToTAnnotation, mInterfaceDeclarationtoTInterface, mType);
		//nothing EMoflonEdge mBodyToTAnnotation__tType____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge pg__tType____interfaces = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mBodyToTAnnotation__mType____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tPackage__tType____interfaces = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tType__pg____pg = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge mInterfaceDeclarationtoTInterface__mType____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge mInterfaceDeclarationtoTInterface__tType____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[22];

		// 
		// 
		InterfaceImpl.pattern_Interface_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, mPackageToTPackage,
				tPackage, tType, mPackage, mTypeToTType, pg, mBodyToTAnnotation, mInterfaceDeclarationtoTInterface,
				mType);
		return InterfaceImpl.pattern_Interface_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = InterfaceImpl
				.pattern_Interface_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InterfaceImpl.pattern_Interface_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InterfaceImpl.pattern_Interface_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TPackage tPackage = (TPackage) result2_binding[0];
		TInterface tType = (TInterface) result2_binding[1];
		TypeGraph pg = (TypeGraph) result2_binding[2];
		for (Object[] result2_black : InterfaceImpl.pattern_Interface_12_2_corematch_blackFBBFBB(tPackage, tType, pg,
				match)) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[0];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[3];
			// ForEach 
			for (Object[] result3_black : InterfaceImpl
					.pattern_Interface_12_3_findcontext_blackBBBBB(mPackageToTPackage, tPackage, tType, mPackage, pg)) {
				Object[] result3_green = InterfaceImpl.pattern_Interface_12_3_findcontext_greenBBBBBFFFFFFFFFF(
						mPackageToTPackage, tPackage, tType, mPackage, pg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge pg__tType____interfaces = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge tPackage__tType____interfaces = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tType__pg____pg = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tPackage__tType____ownedTypes = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tPackage__pg____typeGraph = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mPackageToTPackage__mPackage____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = InterfaceImpl
						.pattern_Interface_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								mPackageToTPackage, tPackage, tType, mPackage, pg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackageToTPackage] = "
							+ mPackageToTPackage + ", " + "[tPackage] = " + tPackage + ", " + "[tType] = " + tType
							+ ", " + "[mPackage] = " + mPackage + ", " + "[pg] = " + pg + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InterfaceImpl.pattern_Interface_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InterfaceImpl
							.pattern_Interface_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InterfaceImpl.pattern_Interface_12_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InterfaceImpl.pattern_Interface_12_7_expressionFB(ruleresult);
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
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", true, csp);
		var_tType_tLib.setValue(tType.isTLib());
		var_tType_tLib.setType("Boolean");

		// Create unbound variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", csp);
		var_mType_name.setType("String");
		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType.proxy", csp);
		var_mType_proxy.setType("Boolean");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_name, var_tType_tName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_mType_proxy, var_tType_tLib);

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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject tPackage,
			EObject tType, EObject mPackage, EObject mTypeToTType, EObject pg, EObject mBodyToTAnnotation,
			EObject mInterfaceDeclarationtoTInterface, EObject mType) {
		ruleresult.registerObject("mPackageToTPackage", mPackageToTPackage);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mInterfaceDeclarationtoTInterface", mInterfaceDeclarationtoTInterface);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_166(EMoflonEdge _edge_interfaces) {

		Object[] result1_bindingAndBlack = InterfaceImpl
				.pattern_Interface_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InterfaceImpl.pattern_Interface_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InterfaceImpl
				.pattern_Interface_20_2_testcorematchandDECs_blackFFFB(_edge_interfaces)) {
			TPackage tPackage = (TPackage) result2_black[0];
			TInterface tType = (TInterface) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[2];
			Object[] result2_green = InterfaceImpl.pattern_Interface_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InterfaceImpl.pattern_Interface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
					match, tPackage, tType, pg)) {
				// 
				if (InterfaceImpl.pattern_Interface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = InterfaceImpl.pattern_Interface_20_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InterfaceImpl.pattern_Interface_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InterfaceImpl.pattern_Interface_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_171(EMoflonEdge _edge_ownedElements) {

		Object[] result1_bindingAndBlack = InterfaceImpl
				.pattern_Interface_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InterfaceImpl.pattern_Interface_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InterfaceImpl
				.pattern_Interface_21_2_testcorematchandDECs_blackFFB(_edge_ownedElements)) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[0];
			InterfaceDeclaration mType = (InterfaceDeclaration) result2_black[1];
			Object[] result2_green = InterfaceImpl.pattern_Interface_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InterfaceImpl.pattern_Interface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, mPackage, mType)) {
				// 
				if (InterfaceImpl.pattern_Interface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = InterfaceImpl.pattern_Interface_21_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InterfaceImpl.pattern_Interface_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InterfaceImpl.pattern_Interface_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Interface");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_proxy.setValue(__helper.getValue("mType", "proxy"));
		var_mType_proxy.setType("boolean");

		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tLib.setValue(__helper.getValue("tType", "tLib"));
		var_tType_tLib.setType("boolean");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("Interface");
		eq0.solve(var_mType_name, var_tType_tName);

		eq1.setRuleName("Interface");
		eq1.solve(var_mType_proxy, var_tType_tLib);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tType_tName.setBound(false);
			var_tType_tLib.setBound(false);
			eq0.solve(var_mType_name, var_tType_tName);
			eq1.solve(var_mType_proxy, var_tType_tLib);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tType", "tName", var_tType_tName.getValue());
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
		ruleResult.setRule("Interface");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_proxy.setValue(__helper.getValue("mType", "proxy"));
		var_mType_proxy.setType("boolean");

		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tLib.setValue(__helper.getValue("tType", "tLib"));
		var_tType_tLib.setType("boolean");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("Interface");
		eq0.solve(var_mType_name, var_tType_tName);

		eq1.setRuleName("Interface");
		eq1.solve(var_mType_proxy, var_tType_tLib);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mType_name.setBound(false);
			var_mType_proxy.setBound(false);
			eq0.solve(var_mType_name, var_tType_tName);
			eq1.solve(var_mType_proxy, var_tType_tLib);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mType", "name", var_mType_name.getValue());
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

		Object[] result1_black = InterfaceImpl.pattern_Interface_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InterfaceImpl.pattern_Interface_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = InterfaceImpl
				.pattern_Interface_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TPackage tPackage = (TPackage) result2_bindingAndBlack[0];
		TInterface tType = (TInterface) result2_bindingAndBlack[1];
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[3];
		InterfaceDeclaration mType = (InterfaceDeclaration) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = InterfaceImpl.pattern_Interface_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this,
				tPackage, tType, mPackage, pg, mType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tPackage] = " + tPackage + ", " + "[tType] = " + tType + ", " + "[mPackage] = " + mPackage
					+ ", " + "[pg] = " + pg + ", " + "[mType] = " + mType + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (InterfaceImpl.pattern_Interface_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : InterfaceImpl.pattern_Interface_24_5_matchcorrcontext_blackFBBBB(tPackage,
					mPackage, sourceMatch, targetMatch)) {
				PackageToTPackage mPackageToTPackage = (PackageToTPackage) result5_black[0];
				Object[] result5_green = InterfaceImpl.pattern_Interface_24_5_matchcorrcontext_greenBBBF(
						mPackageToTPackage, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = InterfaceImpl.pattern_Interface_24_6_createcorrespondence_blackBBBBBB(tPackage,
						tType, mPackage, pg, mType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tPackage] = " + tPackage
							+ ", " + "[tType] = " + tType + ", " + "[mPackage] = " + mPackage + ", " + "[pg] = " + pg
							+ ", " + "[mType] = " + mType + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InterfaceImpl.pattern_Interface_24_6_createcorrespondence_greenBFFFBB(tType, mType, ccMatch);
				//nothing TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result6_green[1];
				//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[2];
				//nothing InterfaceDeclarationToTInterface mInterfaceDeclarationtoTInterface = (InterfaceDeclarationToTInterface) result6_green[3];

				Object[] result7_black = InterfaceImpl.pattern_Interface_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InterfaceImpl.pattern_Interface_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return InterfaceImpl.pattern_Interface_24_8_expressionFB(result);
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
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");
		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType.proxy", true, csp);
		var_mType_proxy.setValue(mType.isProxy());
		var_mType_proxy.setType("Boolean");
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", true, csp);
		var_tType_tLib.setValue(tType.isTLib());
		var_tType_tLib.setType("Boolean");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_name, var_tType_tName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_mType_proxy, var_tType_tLib);
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
		Object[] result1_black = InterfaceImpl.pattern_Interface_27_1_matchtggpattern_blackBB(mPackage, mType);
		if (result1_black != null) {
			return InterfaceImpl.pattern_Interface_27_2_expressionF();
		} else {
			return InterfaceImpl.pattern_Interface_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TPackage tPackage, TInterface tType, TypeGraph pg) {// 
		Object[] result1_black = InterfaceImpl.pattern_Interface_28_1_matchtggpattern_blackBBB(tPackage, tType, pg);
		if (result1_black != null) {
			return InterfaceImpl.pattern_Interface_28_2_expressionF();
		} else {
			return InterfaceImpl.pattern_Interface_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			PackageToTPackage mPackageToTPackageParameter) {

		Object[] result1_black = InterfaceImpl.pattern_Interface_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InterfaceImpl.pattern_Interface_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : InterfaceImpl
				.pattern_Interface_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mPackageToTPackageList = (RuleEntryList) result2_black[0];
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[1];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[2];
			TPackage tPackage = (TPackage) result2_black[3];
			TypeGraph pg = (TypeGraph) result2_black[4];

			Object[] result3_bindingAndBlack = InterfaceImpl.pattern_Interface_29_3_solveCSP_bindingAndBlackFBBBBBBB(
					this, isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackageToTPackage] = "
						+ mPackageToTPackage + ", " + "[tPackage] = " + tPackage + ", " + "[mPackage] = " + mPackage
						+ ", " + "[pg] = " + pg + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (InterfaceImpl.pattern_Interface_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = InterfaceImpl.pattern_Interface_29_5_checknacs_blackBBBB(mPackageToTPackage,
						tPackage, mPackage, pg);
				if (result5_black != null) {

					Object[] result6_black = InterfaceImpl.pattern_Interface_29_6_perform_blackBBBBB(mPackageToTPackage,
							tPackage, mPackage, pg, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[mPackageToTPackage] = " + mPackageToTPackage + ", " + "[tPackage] = " + tPackage
								+ ", " + "[mPackage] = " + mPackage + ", " + "[pg] = " + pg + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					InterfaceImpl.pattern_Interface_29_6_perform_greenBFBFBFFFBB(tPackage, mPackage, pg, ruleResult,
							csp);
					//nothing TInterface tType = (TInterface) result6_green[1];
					//nothing TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result6_green[3];
					//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[5];
					//nothing InterfaceDeclarationToTInterface mInterfaceDeclarationtoTInterface = (InterfaceDeclarationToTInterface) result6_green[6];
					//nothing InterfaceDeclaration mType = (InterfaceDeclaration) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return InterfaceImpl.pattern_Interface_29_7_expressionFB(ruleResult);
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
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", csp);
		var_mType_name.setType("String");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", csp);
		var_tType_tName.setType("String");
		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType.proxy", csp);
		var_mType_proxy.setType("Boolean");
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", csp);
		var_tType_tLib.setType("Boolean");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_name, var_tType_tName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_mType_proxy, var_tType_tLib);

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
		case RulesPackage.INTERFACE___IS_APPROPRIATE_FWD__MATCH_PACKAGE_INTERFACEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2));
		case RulesPackage.INTERFACE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERFACE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGE_INTERFACEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2));
			return null;
		case RulesPackage.INTERFACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGE_INTERFACEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (InterfaceDeclaration) arguments.get(2));
		case RulesPackage.INTERFACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_TPACKAGE_PACKAGE_TYPEGRAPH_INTERFACEDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (PackageToTPackage) arguments.get(1),
					(TPackage) arguments.get(2), (org.eclipse.modisco.java.Package) arguments.get(3),
					(TypeGraph) arguments.get(4), (InterfaceDeclaration) arguments.get(5));
		case RulesPackage.INTERFACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.INTERFACE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE___IS_APPROPRIATE_BWD__MATCH_TPACKAGE_TINTERFACE_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TInterface) arguments.get(2), (TypeGraph) arguments.get(3));
		case RulesPackage.INTERFACE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERFACE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPACKAGE_TINTERFACE_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TInterface) arguments.get(2), (TypeGraph) arguments.get(3));
			return null;
		case RulesPackage.INTERFACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPACKAGE_TINTERFACE_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TInterface) arguments.get(2), (TypeGraph) arguments.get(3));
		case RulesPackage.INTERFACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_TPACKAGE_TINTERFACE_PACKAGE_TYPEGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (PackageToTPackage) arguments.get(1),
					(TPackage) arguments.get(2), (TInterface) arguments.get(3),
					(org.eclipse.modisco.java.Package) arguments.get(4), (TypeGraph) arguments.get(5));
		case RulesPackage.INTERFACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.INTERFACE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_166__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_166((EMoflonEdge) arguments.get(0));
		case RulesPackage.INTERFACE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_171__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_171((EMoflonEdge) arguments.get(0));
		case RulesPackage.INTERFACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERFACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERFACE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.INTERFACE___IS_APPLICABLE_SOLVE_CSP_CC__TPACKAGE_TINTERFACE_PACKAGE_TYPEGRAPH_INTERFACEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TPackage) arguments.get(0), (TInterface) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2), (TypeGraph) arguments.get(3),
					(InterfaceDeclaration) arguments.get(4), (Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.INTERFACE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.INTERFACE___CHECK_DEC_FWD__PACKAGE_INTERFACEDECLARATION:
			return checkDEC_FWD((org.eclipse.modisco.java.Package) arguments.get(0),
					(InterfaceDeclaration) arguments.get(1));
		case RulesPackage.INTERFACE___CHECK_DEC_BWD__TPACKAGE_TINTERFACE_TYPEGRAPH:
			return checkDEC_BWD((TPackage) arguments.get(0), (TInterface) arguments.get(1),
					(TypeGraph) arguments.get(2));
		case RulesPackage.INTERFACE___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGETOTPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (PackageToTPackage) arguments.get(1));
		case RulesPackage.INTERFACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_TPACKAGE_PACKAGE_TYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(PackageToTPackage) arguments.get(1), (TPackage) arguments.get(2),
					(org.eclipse.modisco.java.Package) arguments.get(3), (TypeGraph) arguments.get(4),
					(ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.INTERFACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Interface_0_1_initialbindings_blackBBBB(Interface _this, Match match,
			org.eclipse.modisco.java.Package mPackage, InterfaceDeclaration mType) {
		return new Object[] { _this, match, mPackage, mType };
	}

	public static final Object[] pattern_Interface_0_2_SolveCSP_bindingFBBBB(Interface _this, Match match,
			org.eclipse.modisco.java.Package mPackage, InterfaceDeclaration mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mPackage, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mPackage, mType };
		}
		return null;
	}

	public static final Object[] pattern_Interface_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Interface_0_2_SolveCSP_bindingAndBlackFBBBB(Interface _this, Match match,
			org.eclipse.modisco.java.Package mPackage, InterfaceDeclaration mType) {
		Object[] result_pattern_Interface_0_2_SolveCSP_binding = pattern_Interface_0_2_SolveCSP_bindingFBBBB(_this,
				match, mPackage, mType);
		if (result_pattern_Interface_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Interface_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Interface_0_2_SolveCSP_black = pattern_Interface_0_2_SolveCSP_blackB(csp);
			if (result_pattern_Interface_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mPackage, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_Interface_0_3_CheckCSP_expressionFBB(Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Interface_0_4_collectelementstobetranslated_blackBBB(Match match,
			org.eclipse.modisco.java.Package mPackage, InterfaceDeclaration mType) {
		return new Object[] { match, mPackage, mType };
	}

	public static final Object[] pattern_Interface_0_4_collectelementstobetranslated_greenBBBFF(Match match,
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

	public static final Object[] pattern_Interface_0_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.modisco.java.Package mPackage, InterfaceDeclaration mType) {
		return new Object[] { match, mPackage, mType };
	}

	public static final Object[] pattern_Interface_0_5_collectcontextelements_greenBB(Match match,
			org.eclipse.modisco.java.Package mPackage) {
		match.getContextNodes().add(mPackage);
		return new Object[] { match, mPackage };
	}

	public static final void pattern_Interface_0_6_registerobjectstomatch_expressionBBBB(Interface _this, Match match,
			org.eclipse.modisco.java.Package mPackage, InterfaceDeclaration mType) {
		_this.registerObjectsToMatch_FWD(match, mPackage, mType);

	}

	public static final boolean pattern_Interface_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Interface_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Interface_1_1_performtransformation_bindingFFFFFB(
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

	public static final Object[] pattern_Interface_1_1_performtransformation_blackBBBBBFBB(
			PackageToTPackage mPackageToTPackage, TPackage tPackage, org.eclipse.modisco.java.Package mPackage,
			TypeGraph pg, InterfaceDeclaration mType, Interface _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mPackageToTPackage, tPackage, mPackage, pg, mType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Interface_1_1_performtransformation_bindingAndBlackFFFFFFBB(Interface _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Interface_1_1_performtransformation_binding = pattern_Interface_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_Interface_1_1_performtransformation_binding != null) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result_pattern_Interface_1_1_performtransformation_binding[0];
			TPackage tPackage = (TPackage) result_pattern_Interface_1_1_performtransformation_binding[1];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_Interface_1_1_performtransformation_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_Interface_1_1_performtransformation_binding[3];
			InterfaceDeclaration mType = (InterfaceDeclaration) result_pattern_Interface_1_1_performtransformation_binding[4];

			Object[] result_pattern_Interface_1_1_performtransformation_black = pattern_Interface_1_1_performtransformation_blackBBBBBFBB(
					mPackageToTPackage, tPackage, mPackage, pg, mType, _this, isApplicableMatch);
			if (result_pattern_Interface_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Interface_1_1_performtransformation_black[5];

				return new Object[] { mPackageToTPackage, tPackage, mPackage, pg, mType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Interface_1_1_performtransformation_greenBFFBFFBB(TPackage tPackage,
			TypeGraph pg, InterfaceDeclaration mType, CSP csp) {
		TInterface tType = BasicFactory.eINSTANCE.createTInterface();
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		InterfaceDeclarationToTInterface mInterfaceDeclarationtoTInterface = PmFactory.eINSTANCE
				.createInterfaceDeclarationToTInterface();
		Object _localVariable_0 = csp.getValue("tType", "tName");
		Object _localVariable_1 = csp.getValue("tType", "tLib");
		pg.getInterfaces().add(tType);
		tPackage.getInterfaces().add(tType);
		pg.getOwnedTypes().add(tType);
		tPackage.getOwnedTypes().add(tType);
		mTypeToTType.setTarget(tType);
		mTypeToTType.setSource(mType);
		mBodyToTAnnotation.setTarget(tType);
		mBodyToTAnnotation.setSource(mType);
		mInterfaceDeclarationtoTInterface.setSource(mType);
		mInterfaceDeclarationtoTInterface.setTarget(tType);
		String tType_tName_prime = (String) _localVariable_0;
		boolean tType_tLib_prime = (boolean) _localVariable_1;
		tType.setTName(tType_tName_prime);
		tType.setTLib(Boolean.valueOf(tType_tLib_prime));
		return new Object[] { tPackage, tType, mTypeToTType, pg, mBodyToTAnnotation, mInterfaceDeclarationtoTInterface,
				mType, csp };
	}

	public static final Object[] pattern_Interface_1_2_collecttranslatedelements_blackBBBBB(TInterface tType,
			TypeToTAbstractType mTypeToTType, ASTNodeToTAnnotatable mBodyToTAnnotation,
			InterfaceDeclarationToTInterface mInterfaceDeclarationtoTInterface, InterfaceDeclaration mType) {
		return new Object[] { tType, mTypeToTType, mBodyToTAnnotation, mInterfaceDeclarationtoTInterface, mType };
	}

	public static final Object[] pattern_Interface_1_2_collecttranslatedelements_greenFBBBBB(TInterface tType,
			TypeToTAbstractType mTypeToTType, ASTNodeToTAnnotatable mBodyToTAnnotation,
			InterfaceDeclarationToTInterface mInterfaceDeclarationtoTInterface, InterfaceDeclaration mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tType);
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedLinkElements().add(mInterfaceDeclarationtoTInterface);
		ruleresult.getTranslatedElements().add(mType);
		return new Object[] { ruleresult, tType, mTypeToTType, mBodyToTAnnotation, mInterfaceDeclarationtoTInterface,
				mType };
	}

	public static final Object[] pattern_Interface_1_3_bookkeepingforedges_blackBBBBBBBBBB(PerformRuleResult ruleresult,
			EObject mPackageToTPackage, EObject tPackage, EObject tType, EObject mPackage, EObject mTypeToTType,
			EObject pg, EObject mBodyToTAnnotation, EObject mInterfaceDeclarationtoTInterface, EObject mType) {
		if (!mPackageToTPackage.equals(tPackage)) {
			if (!mPackageToTPackage.equals(tType)) {
				if (!mPackageToTPackage.equals(mTypeToTType)) {
					if (!mPackageToTPackage.equals(pg)) {
						if (!mPackageToTPackage.equals(mType)) {
							if (!tPackage.equals(tType)) {
								if (!mPackage.equals(mPackageToTPackage)) {
									if (!mPackage.equals(tPackage)) {
										if (!mPackage.equals(tType)) {
											if (!mPackage.equals(mTypeToTType)) {
												if (!mPackage.equals(pg)) {
													if (!mPackage.equals(mType)) {
														if (!mTypeToTType.equals(tPackage)) {
															if (!mTypeToTType.equals(tType)) {
																if (!mTypeToTType.equals(pg)) {
																	if (!pg.equals(tPackage)) {
																		if (!pg.equals(tType)) {
																			if (!mBodyToTAnnotation
																					.equals(mPackageToTPackage)) {
																				if (!mBodyToTAnnotation
																						.equals(tPackage)) {
																					if (!mBodyToTAnnotation
																							.equals(tType)) {
																						if (!mBodyToTAnnotation
																								.equals(mPackage)) {
																							if (!mBodyToTAnnotation
																									.equals(mTypeToTType)) {
																								if (!mBodyToTAnnotation
																										.equals(pg)) {
																									if (!mBodyToTAnnotation
																											.equals(mInterfaceDeclarationtoTInterface)) {
																										if (!mBodyToTAnnotation
																												.equals(mType)) {
																											if (!mInterfaceDeclarationtoTInterface
																													.equals(mPackageToTPackage)) {
																												if (!mInterfaceDeclarationtoTInterface
																														.equals(tPackage)) {
																													if (!mInterfaceDeclarationtoTInterface
																															.equals(tType)) {
																														if (!mInterfaceDeclarationtoTInterface
																																.equals(mPackage)) {
																															if (!mInterfaceDeclarationtoTInterface
																																	.equals(mTypeToTType)) {
																																if (!mInterfaceDeclarationtoTInterface
																																		.equals(pg)) {
																																	if (!mInterfaceDeclarationtoTInterface
																																			.equals(mType)) {
																																		if (!mType
																																				.equals(tPackage)) {
																																			if (!mType
																																					.equals(tType)) {
																																				if (!mType
																																						.equals(mTypeToTType)) {
																																					if (!mType
																																							.equals(pg)) {
																																						return new Object[] {
																																								ruleresult,
																																								mPackageToTPackage,
																																								tPackage,
																																								tType,
																																								mPackage,
																																								mTypeToTType,
																																								pg,
																																								mBodyToTAnnotation,
																																								mInterfaceDeclarationtoTInterface,
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

	public static final Object[] pattern_Interface_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tPackage, EObject tType, EObject mPackage, EObject mTypeToTType,
			EObject pg, EObject mBodyToTAnnotation, EObject mInterfaceDeclarationtoTInterface, EObject mType) {
		EMoflonEdge mBodyToTAnnotation__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____interfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____interfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mInterfaceDeclarationtoTInterface__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mInterfaceDeclarationtoTInterface__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Interface";
		String mBodyToTAnnotation__tType____target_name_prime = "target";
		String pg__tType____interfaces_name_prime = "interfaces";
		String mBodyToTAnnotation__mType____source_name_prime = "source";
		String tPackage__tType____interfaces_name_prime = "interfaces";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tPackage____package_name_prime = "package";
		String mInterfaceDeclarationtoTInterface__mType____source_name_prime = "source";
		String mInterfaceDeclarationtoTInterface__tType____target_name_prime = "target";
		String mTypeToTType__tType____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		mBodyToTAnnotation__tType____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tType____target);
		pg__tType____interfaces.setSrc(pg);
		pg__tType____interfaces.setTrg(tType);
		ruleresult.getCreatedEdges().add(pg__tType____interfaces);
		mBodyToTAnnotation__mType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mType____source);
		tPackage__tType____interfaces.setSrc(tPackage);
		tPackage__tType____interfaces.setTrg(tType);
		ruleresult.getCreatedEdges().add(tPackage__tType____interfaces);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		ruleresult.getCreatedEdges().add(pg__tType____ownedTypes);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		ruleresult.getCreatedEdges().add(tType__pg____pg);
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mPackage__mType____ownedElements);
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		ruleresult.getTranslatedEdges().add(mType__mPackage____package);
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		ruleresult.getCreatedEdges().add(tPackage__tType____ownedTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		ruleresult.getCreatedEdges().add(tType__tPackage____package);
		mInterfaceDeclarationtoTInterface__mType____source.setSrc(mInterfaceDeclarationtoTInterface);
		mInterfaceDeclarationtoTInterface__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mInterfaceDeclarationtoTInterface__mType____source);
		mInterfaceDeclarationtoTInterface__tType____target.setSrc(mInterfaceDeclarationtoTInterface);
		mInterfaceDeclarationtoTInterface__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mInterfaceDeclarationtoTInterface__tType____target);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mTypeToTType__tType____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mTypeToTType__mType____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mBodyToTAnnotation__tType____target.setName(mBodyToTAnnotation__tType____target_name_prime);
		pg__tType____interfaces.setName(pg__tType____interfaces_name_prime);
		mBodyToTAnnotation__mType____source.setName(mBodyToTAnnotation__mType____source_name_prime);
		tPackage__tType____interfaces.setName(tPackage__tType____interfaces_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		mInterfaceDeclarationtoTInterface__mType____source
				.setName(mInterfaceDeclarationtoTInterface__mType____source_name_prime);
		mInterfaceDeclarationtoTInterface__tType____target
				.setName(mInterfaceDeclarationtoTInterface__tType____target_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		return new Object[] { ruleresult, tPackage, tType, mPackage, mTypeToTType, pg, mBodyToTAnnotation,
				mInterfaceDeclarationtoTInterface, mType, mBodyToTAnnotation__tType____target, pg__tType____interfaces,
				mBodyToTAnnotation__mType____source, tPackage__tType____interfaces, pg__tType____ownedTypes,
				tType__pg____pg, mPackage__mType____ownedElements, mType__mPackage____package,
				tPackage__tType____ownedTypes, tType__tPackage____package,
				mInterfaceDeclarationtoTInterface__mType____source, mInterfaceDeclarationtoTInterface__tType____target,
				mTypeToTType__tType____target, mTypeToTType__mType____source };
	}

	public static final void pattern_Interface_1_5_registerobjects_expressionBBBBBBBBBBB(Interface _this,
			PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject tPackage, EObject tType, EObject mPackage,
			EObject mTypeToTType, EObject pg, EObject mBodyToTAnnotation, EObject mInterfaceDeclarationtoTInterface,
			EObject mType) {
		_this.registerObjects_FWD(ruleresult, mPackageToTPackage, tPackage, tType, mPackage, mTypeToTType, pg,
				mBodyToTAnnotation, mInterfaceDeclarationtoTInterface, mType);

	}

	public static final PerformRuleResult pattern_Interface_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Interface_2_1_preparereturnvalue_bindingFB(Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Interface_2_1_preparereturnvalue_blackFBB(EClass eClass, Interface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Interface_2_1_preparereturnvalue_bindingAndBlackFFB(Interface _this) {
		Object[] result_pattern_Interface_2_1_preparereturnvalue_binding = pattern_Interface_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Interface_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Interface_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Interface_2_1_preparereturnvalue_black = pattern_Interface_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Interface_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Interface_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Interface_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "Interface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Interface_2_2_corematch_bindingFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_Interface_2_2_corematch_blackFFBBB(
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

	public static final Iterable<Object[]> pattern_Interface_2_3_findcontext_blackBBBFB(
			PackageToTPackage mPackageToTPackage, TPackage tPackage, org.eclipse.modisco.java.Package mPackage,
			InterfaceDeclaration mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mPackage.getOwnedElements().contains(mType)) {
			if (mPackage.equals(mPackageToTPackage.getSource())) {
				if (tPackage.equals(mPackageToTPackage.getTarget())) {
					TypeGraph pg = tPackage.getTypeGraph();
					if (pg != null) {
						_result.add(new Object[] { mPackageToTPackage, tPackage, mPackage, pg, mType });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Interface_2_3_findcontext_greenBBBBBFFFFFF(
			PackageToTPackage mPackageToTPackage, TPackage tPackage, org.eclipse.modisco.java.Package mPackage,
			TypeGraph pg, InterfaceDeclaration mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__pg____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__tPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		String tPackage__pg____typeGraph_name_prime = "typeGraph";
		String mPackageToTPackage__mPackage____source_name_prime = "source";
		String mPackageToTPackage__tPackage____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(mType);
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mPackage__mType____ownedElements);
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mType__mPackage____package);
		tPackage__pg____typeGraph.setSrc(tPackage);
		tPackage__pg____typeGraph.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tPackage__pg____typeGraph);
		mPackageToTPackage__mPackage____source.setSrc(mPackageToTPackage);
		mPackageToTPackage__mPackage____source.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__mPackage____source);
		mPackageToTPackage__tPackage____target.setSrc(mPackageToTPackage);
		mPackageToTPackage__tPackage____target.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__tPackage____target);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		tPackage__pg____typeGraph.setName(tPackage__pg____typeGraph_name_prime);
		mPackageToTPackage__mPackage____source.setName(mPackageToTPackage__mPackage____source_name_prime);
		mPackageToTPackage__tPackage____target.setName(mPackageToTPackage__tPackage____target_name_prime);
		return new Object[] { mPackageToTPackage, tPackage, mPackage, pg, mType, isApplicableMatch,
				mPackage__mType____ownedElements, mType__mPackage____package, tPackage__pg____typeGraph,
				mPackageToTPackage__mPackage____source, mPackageToTPackage__tPackage____target };
	}

	public static final Object[] pattern_Interface_2_4_solveCSP_bindingFBBBBBBB(Interface _this,
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

	public static final Object[] pattern_Interface_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Interface_2_4_solveCSP_bindingAndBlackFBBBBBBB(Interface _this,
			IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage, TPackage tPackage,
			org.eclipse.modisco.java.Package mPackage, TypeGraph pg, InterfaceDeclaration mType) {
		Object[] result_pattern_Interface_2_4_solveCSP_binding = pattern_Interface_2_4_solveCSP_bindingFBBBBBBB(_this,
				isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg, mType);
		if (result_pattern_Interface_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Interface_2_4_solveCSP_binding[0];

			Object[] result_pattern_Interface_2_4_solveCSP_black = pattern_Interface_2_4_solveCSP_blackB(csp);
			if (result_pattern_Interface_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg,
						mType };
			}
		}
		return null;
	}

	public static final boolean pattern_Interface_2_5_checkCSP_expressionFBB(Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Interface_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Interface_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Interface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Interface_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Interface_10_1_initialbindings_blackBBBBB(Interface _this, Match match,
			TPackage tPackage, TInterface tType, TypeGraph pg) {
		return new Object[] { _this, match, tPackage, tType, pg };
	}

	public static final Object[] pattern_Interface_10_2_SolveCSP_bindingFBBBBB(Interface _this, Match match,
			TPackage tPackage, TInterface tType, TypeGraph pg) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tPackage, tType, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tPackage, tType, pg };
		}
		return null;
	}

	public static final Object[] pattern_Interface_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Interface_10_2_SolveCSP_bindingAndBlackFBBBBB(Interface _this, Match match,
			TPackage tPackage, TInterface tType, TypeGraph pg) {
		Object[] result_pattern_Interface_10_2_SolveCSP_binding = pattern_Interface_10_2_SolveCSP_bindingFBBBBB(_this,
				match, tPackage, tType, pg);
		if (result_pattern_Interface_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Interface_10_2_SolveCSP_binding[0];

			Object[] result_pattern_Interface_10_2_SolveCSP_black = pattern_Interface_10_2_SolveCSP_blackB(csp);
			if (result_pattern_Interface_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tPackage, tType, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_Interface_10_3_CheckCSP_expressionFBB(Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Interface_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TPackage tPackage, TInterface tType, TypeGraph pg) {
		return new Object[] { match, tPackage, tType, pg };
	}

	public static final Object[] pattern_Interface_10_4_collectelementstobetranslated_greenBBBBFFFFFF(Match match,
			TPackage tPackage, TInterface tType, TypeGraph pg) {
		EMoflonEdge pg__tType____interfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____interfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tType);
		String pg__tType____interfaces_name_prime = "interfaces";
		String tPackage__tType____interfaces_name_prime = "interfaces";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tPackage____package_name_prime = "package";
		pg__tType____interfaces.setSrc(pg);
		pg__tType____interfaces.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____interfaces);
		tPackage__tType____interfaces.setSrc(tPackage);
		tPackage__tType____interfaces.setTrg(tType);
		match.getToBeTranslatedEdges().add(tPackage__tType____interfaces);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____ownedTypes);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		match.getToBeTranslatedEdges().add(tType__pg____pg);
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(tPackage__tType____ownedTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		match.getToBeTranslatedEdges().add(tType__tPackage____package);
		pg__tType____interfaces.setName(pg__tType____interfaces_name_prime);
		tPackage__tType____interfaces.setName(tPackage__tType____interfaces_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		return new Object[] { match, tPackage, tType, pg, pg__tType____interfaces, tPackage__tType____interfaces,
				pg__tType____ownedTypes, tType__pg____pg, tPackage__tType____ownedTypes, tType__tPackage____package };
	}

	public static final Object[] pattern_Interface_10_5_collectcontextelements_blackBBBB(Match match, TPackage tPackage,
			TInterface tType, TypeGraph pg) {
		return new Object[] { match, tPackage, tType, pg };
	}

	public static final Object[] pattern_Interface_10_5_collectcontextelements_greenBBBF(Match match, TPackage tPackage,
			TypeGraph pg) {
		EMoflonEdge tPackage__pg____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tPackage);
		match.getContextNodes().add(pg);
		String tPackage__pg____typeGraph_name_prime = "typeGraph";
		tPackage__pg____typeGraph.setSrc(tPackage);
		tPackage__pg____typeGraph.setTrg(pg);
		match.getContextEdges().add(tPackage__pg____typeGraph);
		tPackage__pg____typeGraph.setName(tPackage__pg____typeGraph_name_prime);
		return new Object[] { match, tPackage, pg, tPackage__pg____typeGraph };
	}

	public static final void pattern_Interface_10_6_registerobjectstomatch_expressionBBBBB(Interface _this, Match match,
			TPackage tPackage, TInterface tType, TypeGraph pg) {
		_this.registerObjectsToMatch_BWD(match, tPackage, tType, pg);

	}

	public static final boolean pattern_Interface_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Interface_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Interface_11_1_performtransformation_bindingFFFFFB(
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

	public static final Object[] pattern_Interface_11_1_performtransformation_blackBBBBBFBB(
			PackageToTPackage mPackageToTPackage, TPackage tPackage, TInterface tType,
			org.eclipse.modisco.java.Package mPackage, TypeGraph pg, Interface _this,
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

	public static final Object[] pattern_Interface_11_1_performtransformation_bindingAndBlackFFFFFFBB(Interface _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Interface_11_1_performtransformation_binding = pattern_Interface_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_Interface_11_1_performtransformation_binding != null) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result_pattern_Interface_11_1_performtransformation_binding[0];
			TPackage tPackage = (TPackage) result_pattern_Interface_11_1_performtransformation_binding[1];
			TInterface tType = (TInterface) result_pattern_Interface_11_1_performtransformation_binding[2];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_Interface_11_1_performtransformation_binding[3];
			TypeGraph pg = (TypeGraph) result_pattern_Interface_11_1_performtransformation_binding[4];

			Object[] result_pattern_Interface_11_1_performtransformation_black = pattern_Interface_11_1_performtransformation_blackBBBBBFBB(
					mPackageToTPackage, tPackage, tType, mPackage, pg, _this, isApplicableMatch);
			if (result_pattern_Interface_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Interface_11_1_performtransformation_black[5];

				return new Object[] { mPackageToTPackage, tPackage, tType, mPackage, pg, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Interface_11_1_performtransformation_greenBBFFFFB(TInterface tType,
			org.eclipse.modisco.java.Package mPackage, CSP csp) {
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		InterfaceDeclarationToTInterface mInterfaceDeclarationtoTInterface = PmFactory.eINSTANCE
				.createInterfaceDeclarationToTInterface();
		InterfaceDeclaration mType = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		Object _localVariable_0 = csp.getValue("mType", "name");
		Object _localVariable_1 = csp.getValue("mType", "proxy");
		mTypeToTType.setTarget(tType);
		mBodyToTAnnotation.setTarget(tType);
		mInterfaceDeclarationtoTInterface.setTarget(tType);
		mBodyToTAnnotation.setSource(mType);
		mPackage.getOwnedElements().add(mType);
		mInterfaceDeclarationtoTInterface.setSource(mType);
		mTypeToTType.setSource(mType);
		String mType_name_prime = (String) _localVariable_0;
		boolean mType_proxy_prime = (boolean) _localVariable_1;
		mType.setName(mType_name_prime);
		mType.setProxy(Boolean.valueOf(mType_proxy_prime));
		return new Object[] { tType, mPackage, mTypeToTType, mBodyToTAnnotation, mInterfaceDeclarationtoTInterface,
				mType, csp };
	}

	public static final Object[] pattern_Interface_11_2_collecttranslatedelements_blackBBBBB(TInterface tType,
			TypeToTAbstractType mTypeToTType, ASTNodeToTAnnotatable mBodyToTAnnotation,
			InterfaceDeclarationToTInterface mInterfaceDeclarationtoTInterface, InterfaceDeclaration mType) {
		return new Object[] { tType, mTypeToTType, mBodyToTAnnotation, mInterfaceDeclarationtoTInterface, mType };
	}

	public static final Object[] pattern_Interface_11_2_collecttranslatedelements_greenFBBBBB(TInterface tType,
			TypeToTAbstractType mTypeToTType, ASTNodeToTAnnotatable mBodyToTAnnotation,
			InterfaceDeclarationToTInterface mInterfaceDeclarationtoTInterface, InterfaceDeclaration mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tType);
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedLinkElements().add(mInterfaceDeclarationtoTInterface);
		ruleresult.getCreatedElements().add(mType);
		return new Object[] { ruleresult, tType, mTypeToTType, mBodyToTAnnotation, mInterfaceDeclarationtoTInterface,
				mType };
	}

	public static final Object[] pattern_Interface_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject tPackage, EObject tType, EObject mPackage,
			EObject mTypeToTType, EObject pg, EObject mBodyToTAnnotation, EObject mInterfaceDeclarationtoTInterface,
			EObject mType) {
		if (!mPackageToTPackage.equals(tPackage)) {
			if (!mPackageToTPackage.equals(tType)) {
				if (!mPackageToTPackage.equals(mTypeToTType)) {
					if (!mPackageToTPackage.equals(pg)) {
						if (!mPackageToTPackage.equals(mType)) {
							if (!tPackage.equals(tType)) {
								if (!mPackage.equals(mPackageToTPackage)) {
									if (!mPackage.equals(tPackage)) {
										if (!mPackage.equals(tType)) {
											if (!mPackage.equals(mTypeToTType)) {
												if (!mPackage.equals(pg)) {
													if (!mPackage.equals(mType)) {
														if (!mTypeToTType.equals(tPackage)) {
															if (!mTypeToTType.equals(tType)) {
																if (!mTypeToTType.equals(pg)) {
																	if (!pg.equals(tPackage)) {
																		if (!pg.equals(tType)) {
																			if (!mBodyToTAnnotation
																					.equals(mPackageToTPackage)) {
																				if (!mBodyToTAnnotation
																						.equals(tPackage)) {
																					if (!mBodyToTAnnotation
																							.equals(tType)) {
																						if (!mBodyToTAnnotation
																								.equals(mPackage)) {
																							if (!mBodyToTAnnotation
																									.equals(mTypeToTType)) {
																								if (!mBodyToTAnnotation
																										.equals(pg)) {
																									if (!mBodyToTAnnotation
																											.equals(mInterfaceDeclarationtoTInterface)) {
																										if (!mBodyToTAnnotation
																												.equals(mType)) {
																											if (!mInterfaceDeclarationtoTInterface
																													.equals(mPackageToTPackage)) {
																												if (!mInterfaceDeclarationtoTInterface
																														.equals(tPackage)) {
																													if (!mInterfaceDeclarationtoTInterface
																															.equals(tType)) {
																														if (!mInterfaceDeclarationtoTInterface
																																.equals(mPackage)) {
																															if (!mInterfaceDeclarationtoTInterface
																																	.equals(mTypeToTType)) {
																																if (!mInterfaceDeclarationtoTInterface
																																		.equals(pg)) {
																																	if (!mInterfaceDeclarationtoTInterface
																																			.equals(mType)) {
																																		if (!mType
																																				.equals(tPackage)) {
																																			if (!mType
																																					.equals(tType)) {
																																				if (!mType
																																						.equals(mTypeToTType)) {
																																					if (!mType
																																							.equals(pg)) {
																																						return new Object[] {
																																								ruleresult,
																																								mPackageToTPackage,
																																								tPackage,
																																								tType,
																																								mPackage,
																																								mTypeToTType,
																																								pg,
																																								mBodyToTAnnotation,
																																								mInterfaceDeclarationtoTInterface,
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

	public static final Object[] pattern_Interface_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tPackage, EObject tType, EObject mPackage, EObject mTypeToTType,
			EObject pg, EObject mBodyToTAnnotation, EObject mInterfaceDeclarationtoTInterface, EObject mType) {
		EMoflonEdge mBodyToTAnnotation__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____interfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____interfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mInterfaceDeclarationtoTInterface__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mInterfaceDeclarationtoTInterface__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Interface";
		String mBodyToTAnnotation__tType____target_name_prime = "target";
		String pg__tType____interfaces_name_prime = "interfaces";
		String mBodyToTAnnotation__mType____source_name_prime = "source";
		String tPackage__tType____interfaces_name_prime = "interfaces";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String mType__mPackage____package_name_prime = "package";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tPackage____package_name_prime = "package";
		String mInterfaceDeclarationtoTInterface__mType____source_name_prime = "source";
		String mInterfaceDeclarationtoTInterface__tType____target_name_prime = "target";
		String mTypeToTType__tType____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		mBodyToTAnnotation__tType____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tType____target);
		pg__tType____interfaces.setSrc(pg);
		pg__tType____interfaces.setTrg(tType);
		ruleresult.getTranslatedEdges().add(pg__tType____interfaces);
		mBodyToTAnnotation__mType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mType____source);
		tPackage__tType____interfaces.setSrc(tPackage);
		tPackage__tType____interfaces.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tPackage__tType____interfaces);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(pg__tType____ownedTypes);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tType__pg____pg);
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		ruleresult.getCreatedEdges().add(mPackage__mType____ownedElements);
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		ruleresult.getCreatedEdges().add(mType__mPackage____package);
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tPackage__tType____ownedTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		ruleresult.getTranslatedEdges().add(tType__tPackage____package);
		mInterfaceDeclarationtoTInterface__mType____source.setSrc(mInterfaceDeclarationtoTInterface);
		mInterfaceDeclarationtoTInterface__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mInterfaceDeclarationtoTInterface__mType____source);
		mInterfaceDeclarationtoTInterface__tType____target.setSrc(mInterfaceDeclarationtoTInterface);
		mInterfaceDeclarationtoTInterface__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mInterfaceDeclarationtoTInterface__tType____target);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mTypeToTType__tType____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mTypeToTType__mType____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mBodyToTAnnotation__tType____target.setName(mBodyToTAnnotation__tType____target_name_prime);
		pg__tType____interfaces.setName(pg__tType____interfaces_name_prime);
		mBodyToTAnnotation__mType____source.setName(mBodyToTAnnotation__mType____source_name_prime);
		tPackage__tType____interfaces.setName(tPackage__tType____interfaces_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		mInterfaceDeclarationtoTInterface__mType____source
				.setName(mInterfaceDeclarationtoTInterface__mType____source_name_prime);
		mInterfaceDeclarationtoTInterface__tType____target
				.setName(mInterfaceDeclarationtoTInterface__tType____target_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		return new Object[] { ruleresult, tPackage, tType, mPackage, mTypeToTType, pg, mBodyToTAnnotation,
				mInterfaceDeclarationtoTInterface, mType, mBodyToTAnnotation__tType____target, pg__tType____interfaces,
				mBodyToTAnnotation__mType____source, tPackage__tType____interfaces, pg__tType____ownedTypes,
				tType__pg____pg, mPackage__mType____ownedElements, mType__mPackage____package,
				tPackage__tType____ownedTypes, tType__tPackage____package,
				mInterfaceDeclarationtoTInterface__mType____source, mInterfaceDeclarationtoTInterface__tType____target,
				mTypeToTType__tType____target, mTypeToTType__mType____source };
	}

	public static final void pattern_Interface_11_5_registerobjects_expressionBBBBBBBBBBB(Interface _this,
			PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject tPackage, EObject tType, EObject mPackage,
			EObject mTypeToTType, EObject pg, EObject mBodyToTAnnotation, EObject mInterfaceDeclarationtoTInterface,
			EObject mType) {
		_this.registerObjects_BWD(ruleresult, mPackageToTPackage, tPackage, tType, mPackage, mTypeToTType, pg,
				mBodyToTAnnotation, mInterfaceDeclarationtoTInterface, mType);

	}

	public static final PerformRuleResult pattern_Interface_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Interface_12_1_preparereturnvalue_bindingFB(Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Interface_12_1_preparereturnvalue_blackFBB(EClass eClass, Interface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Interface_12_1_preparereturnvalue_bindingAndBlackFFB(Interface _this) {
		Object[] result_pattern_Interface_12_1_preparereturnvalue_binding = pattern_Interface_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Interface_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Interface_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Interface_12_1_preparereturnvalue_black = pattern_Interface_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Interface_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Interface_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Interface_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "Interface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Interface_12_2_corematch_bindingFFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_Interface_12_2_corematch_blackFBBFBB(TPackage tPackage,
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

	public static final Iterable<Object[]> pattern_Interface_12_3_findcontext_blackBBBBB(
			PackageToTPackage mPackageToTPackage, TPackage tPackage, TInterface tType,
			org.eclipse.modisco.java.Package mPackage, TypeGraph pg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pg.getInterfaces().contains(tType)) {
			if (tPackage.getInterfaces().contains(tType)) {
				if (pg.getOwnedTypes().contains(tType)) {
					if (tPackage.getOwnedTypes().contains(tType)) {
						if (pg.equals(tPackage.getTypeGraph())) {
							if (mPackage.equals(mPackageToTPackage.getSource())) {
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

	public static final Object[] pattern_Interface_12_3_findcontext_greenBBBBBFFFFFFFFFF(
			PackageToTPackage mPackageToTPackage, TPackage tPackage, TInterface tType,
			org.eclipse.modisco.java.Package mPackage, TypeGraph pg) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pg__tType____interfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____interfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__pg____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__tPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pg__tType____interfaces_name_prime = "interfaces";
		String tPackage__tType____interfaces_name_prime = "interfaces";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____pg_name_prime = "pg";
		String tPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tPackage____package_name_prime = "package";
		String tPackage__pg____typeGraph_name_prime = "typeGraph";
		String mPackageToTPackage__mPackage____source_name_prime = "source";
		String mPackageToTPackage__tPackage____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(pg);
		pg__tType____interfaces.setSrc(pg);
		pg__tType____interfaces.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____interfaces);
		tPackage__tType____interfaces.setSrc(tPackage);
		tPackage__tType____interfaces.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tPackage__tType____interfaces);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____ownedTypes);
		tType__pg____pg.setSrc(tType);
		tType__pg____pg.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tType__pg____pg);
		tPackage__tType____ownedTypes.setSrc(tPackage);
		tPackage__tType____ownedTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tPackage__tType____ownedTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(tType__tPackage____package);
		tPackage__pg____typeGraph.setSrc(tPackage);
		tPackage__pg____typeGraph.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tPackage__pg____typeGraph);
		mPackageToTPackage__mPackage____source.setSrc(mPackageToTPackage);
		mPackageToTPackage__mPackage____source.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__mPackage____source);
		mPackageToTPackage__tPackage____target.setSrc(mPackageToTPackage);
		mPackageToTPackage__tPackage____target.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__tPackage____target);
		pg__tType____interfaces.setName(pg__tType____interfaces_name_prime);
		tPackage__tType____interfaces.setName(tPackage__tType____interfaces_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____pg.setName(tType__pg____pg_name_prime);
		tPackage__tType____ownedTypes.setName(tPackage__tType____ownedTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		tPackage__pg____typeGraph.setName(tPackage__pg____typeGraph_name_prime);
		mPackageToTPackage__mPackage____source.setName(mPackageToTPackage__mPackage____source_name_prime);
		mPackageToTPackage__tPackage____target.setName(mPackageToTPackage__tPackage____target_name_prime);
		return new Object[] { mPackageToTPackage, tPackage, tType, mPackage, pg, isApplicableMatch,
				pg__tType____interfaces, tPackage__tType____interfaces, pg__tType____ownedTypes, tType__pg____pg,
				tPackage__tType____ownedTypes, tType__tPackage____package, tPackage__pg____typeGraph,
				mPackageToTPackage__mPackage____source, mPackageToTPackage__tPackage____target };
	}

	public static final Object[] pattern_Interface_12_4_solveCSP_bindingFBBBBBBB(Interface _this,
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

	public static final Object[] pattern_Interface_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Interface_12_4_solveCSP_bindingAndBlackFBBBBBBB(Interface _this,
			IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage, TPackage tPackage,
			TInterface tType, org.eclipse.modisco.java.Package mPackage, TypeGraph pg) {
		Object[] result_pattern_Interface_12_4_solveCSP_binding = pattern_Interface_12_4_solveCSP_bindingFBBBBBBB(_this,
				isApplicableMatch, mPackageToTPackage, tPackage, tType, mPackage, pg);
		if (result_pattern_Interface_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Interface_12_4_solveCSP_binding[0];

			Object[] result_pattern_Interface_12_4_solveCSP_black = pattern_Interface_12_4_solveCSP_blackB(csp);
			if (result_pattern_Interface_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tPackage, tType, mPackage,
						pg };
			}
		}
		return null;
	}

	public static final boolean pattern_Interface_12_5_checkCSP_expressionFBB(Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Interface_12_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Interface_12_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Interface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Interface_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Interface_20_1_preparereturnvalue_bindingFB(Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Interface_20_1_preparereturnvalue_blackFBBF(EClass __eClass, Interface _this) {
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

	public static final Object[] pattern_Interface_20_1_preparereturnvalue_bindingAndBlackFFBF(Interface _this) {
		Object[] result_pattern_Interface_20_1_preparereturnvalue_binding = pattern_Interface_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Interface_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Interface_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Interface_20_1_preparereturnvalue_black = pattern_Interface_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Interface_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Interface_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Interface_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Interface_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Interface_20_2_testcorematchandDECs_black_nac_0BB(TInterface tType,
			TPackage tPackage) {
		for (TPackage __DEC_tType_interfaces_499888 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TPackage.class, "interfaces")) {
			if (!tPackage.equals(__DEC_tType_interfaces_499888)) {
				return new Object[] { tType, tPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_Interface_20_2_testcorematchandDECs_black_nac_1BB(TInterface tType,
			TypeGraph pg) {
		for (TypeGraph __DEC_tType_interfaces_207655 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "interfaces")) {
			if (!pg.equals(__DEC_tType_interfaces_207655)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_Interface_20_2_testcorematchandDECs_black_nac_2BB(TInterface tType,
			TPackage tPackage) {
		TPackage __DEC_tType_ownedTypes_443085 = tType.getPackage();
		if (__DEC_tType_ownedTypes_443085 != null) {
			if (!tPackage.equals(__DEC_tType_ownedTypes_443085)) {
				return new Object[] { tType, tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_Interface_20_2_testcorematchandDECs_black_nac_3B(TInterface tType) {
		TAbstractType __DEC_tType_innerTypes_730607 = tType.getOuterType();
		if (__DEC_tType_innerTypes_730607 != null) {
			if (!tType.equals(__DEC_tType_innerTypes_730607)) {
				return new Object[] { tType };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_Interface_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_interfaces) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPg = _edge_interfaces.getSrc();
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			EObject tmpTType = _edge_interfaces.getTrg();
			if (tmpTType instanceof TInterface) {
				TInterface tType = (TInterface) tmpTType;
				if (pg.getInterfaces().contains(tType)) {
					if (pg.getOwnedTypes().contains(tType)) {
						TPackage tPackage = tType.getPackage();
						if (tPackage != null) {
							if (tPackage.getInterfaces().contains(tType)) {
								if (pg.equals(tPackage.getTypeGraph())) {
									if (pattern_Interface_20_2_testcorematchandDECs_black_nac_1BB(tType, pg) == null) {
										if (pattern_Interface_20_2_testcorematchandDECs_black_nac_3B(tType) == null) {
											if (pattern_Interface_20_2_testcorematchandDECs_black_nac_0BB(tType,
													tPackage) == null) {
												if (pattern_Interface_20_2_testcorematchandDECs_black_nac_2BB(tType,
														tPackage) == null) {
													_result.add(new Object[] { tPackage, tType, pg, _edge_interfaces });
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

	public static final Object[] pattern_Interface_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Interface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			Interface _this, Match match, TPackage tPackage, TInterface tType, TypeGraph pg) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tPackage, tType, pg);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Interface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Interface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Interface_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Interface_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Interface_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Interface_21_1_preparereturnvalue_bindingFB(Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Interface_21_1_preparereturnvalue_blackFBBF(EClass __eClass, Interface _this) {
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

	public static final Object[] pattern_Interface_21_1_preparereturnvalue_bindingAndBlackFFBF(Interface _this) {
		Object[] result_pattern_Interface_21_1_preparereturnvalue_binding = pattern_Interface_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Interface_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Interface_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Interface_21_1_preparereturnvalue_black = pattern_Interface_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Interface_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Interface_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Interface_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Interface_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Interface_21_2_testcorematchandDECs_black_nac_0B(InterfaceDeclaration mType) {
		AbstractTypeDeclaration __DEC_mType_abstractTypeDeclaration_122245 = mType.getAbstractTypeDeclaration();
		if (__DEC_mType_abstractTypeDeclaration_122245 != null) {
			if (!mType.equals(__DEC_mType_abstractTypeDeclaration_122245)) {
				return new Object[] { mType };
			}
		}

		return null;
	}

	public static final Object[] pattern_Interface_21_2_testcorematchandDECs_black_nac_1B(InterfaceDeclaration mType) {
		AnonymousClassDeclaration __DEC_mType_anonymousClassDeclarationOwner_492650 = mType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mType_anonymousClassDeclarationOwner_492650 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_Interface_21_2_testcorematchandDECs_black_nac_2B(InterfaceDeclaration mType) {
		for (Model __DEC_mType_orphanTypes_719412 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, Model.class, "orphanTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_Interface_21_2_testcorematchandDECs_black_nac_3B(InterfaceDeclaration mType) {
		for (MAbstractMethodDefinition __DEC_mType_mInnerTypes_462114 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Interface_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMPackage = _edge_ownedElements.getSrc();
		if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
			EObject tmpMType = _edge_ownedElements.getTrg();
			if (tmpMType instanceof InterfaceDeclaration) {
				InterfaceDeclaration mType = (InterfaceDeclaration) tmpMType;
				if (mPackage.getOwnedElements().contains(mType)) {
					if (pattern_Interface_21_2_testcorematchandDECs_black_nac_0B(mType) == null) {
						if (pattern_Interface_21_2_testcorematchandDECs_black_nac_1B(mType) == null) {
							if (pattern_Interface_21_2_testcorematchandDECs_black_nac_2B(mType) == null) {
								if (pattern_Interface_21_2_testcorematchandDECs_black_nac_3B(mType) == null) {
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

	public static final Object[] pattern_Interface_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Interface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			Interface _this, Match match, org.eclipse.modisco.java.Package mPackage, InterfaceDeclaration mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mPackage, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Interface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Interface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Interface_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Interface_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Interface_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Interface_24_1_prepare_blackB(Interface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Interface_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_Interface_24_2_matchsrctrgcontext_bindingFFFFFBB(Match targetMatch,
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

	public static final Object[] pattern_Interface_24_2_matchsrctrgcontext_blackBBBBBBB(TPackage tPackage,
			TInterface tType, org.eclipse.modisco.java.Package mPackage, TypeGraph pg, InterfaceDeclaration mType,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tPackage, tType, mPackage, pg, mType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Interface_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_Interface_24_2_matchsrctrgcontext_binding = pattern_Interface_24_2_matchsrctrgcontext_bindingFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_Interface_24_2_matchsrctrgcontext_binding != null) {
			TPackage tPackage = (TPackage) result_pattern_Interface_24_2_matchsrctrgcontext_binding[0];
			TInterface tType = (TInterface) result_pattern_Interface_24_2_matchsrctrgcontext_binding[1];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_Interface_24_2_matchsrctrgcontext_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_Interface_24_2_matchsrctrgcontext_binding[3];
			InterfaceDeclaration mType = (InterfaceDeclaration) result_pattern_Interface_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_Interface_24_2_matchsrctrgcontext_black = pattern_Interface_24_2_matchsrctrgcontext_blackBBBBBBB(
					tPackage, tType, mPackage, pg, mType, sourceMatch, targetMatch);
			if (result_pattern_Interface_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tPackage, tType, mPackage, pg, mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Interface_24_3_solvecsp_bindingFBBBBBBBB(Interface _this, TPackage tPackage,
			TInterface tType, org.eclipse.modisco.java.Package mPackage, TypeGraph pg, InterfaceDeclaration mType,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(tPackage, tType, mPackage, pg, mType, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, tPackage, tType, mPackage, pg, mType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Interface_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Interface_24_3_solvecsp_bindingAndBlackFBBBBBBBB(Interface _this,
			TPackage tPackage, TInterface tType, org.eclipse.modisco.java.Package mPackage, TypeGraph pg,
			InterfaceDeclaration mType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_Interface_24_3_solvecsp_binding = pattern_Interface_24_3_solvecsp_bindingFBBBBBBBB(
				_this, tPackage, tType, mPackage, pg, mType, sourceMatch, targetMatch);
		if (result_pattern_Interface_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_Interface_24_3_solvecsp_binding[0];

			Object[] result_pattern_Interface_24_3_solvecsp_black = pattern_Interface_24_3_solvecsp_blackB(csp);
			if (result_pattern_Interface_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tPackage, tType, mPackage, pg, mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_Interface_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_Interface_24_5_matchcorrcontext_blackFBBBB(TPackage tPackage,
			org.eclipse.modisco.java.Package mPackage, Match sourceMatch, Match targetMatch) {
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

	public static final Object[] pattern_Interface_24_5_matchcorrcontext_greenBBBF(PackageToTPackage mPackageToTPackage,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "Interface";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mPackageToTPackage);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mPackageToTPackage, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_Interface_24_6_createcorrespondence_blackBBBBBB(TPackage tPackage,
			TInterface tType, org.eclipse.modisco.java.Package mPackage, TypeGraph pg, InterfaceDeclaration mType,
			CCMatch ccMatch) {
		return new Object[] { tPackage, tType, mPackage, pg, mType, ccMatch };
	}

	public static final Object[] pattern_Interface_24_6_createcorrespondence_greenBFFFBB(TInterface tType,
			InterfaceDeclaration mType, CCMatch ccMatch) {
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		InterfaceDeclarationToTInterface mInterfaceDeclarationtoTInterface = PmFactory.eINSTANCE
				.createInterfaceDeclarationToTInterface();
		mTypeToTType.setTarget(tType);
		mTypeToTType.setSource(mType);
		ccMatch.getCreateCorr().add(mTypeToTType);
		mBodyToTAnnotation.setTarget(tType);
		mBodyToTAnnotation.setSource(mType);
		ccMatch.getCreateCorr().add(mBodyToTAnnotation);
		mInterfaceDeclarationtoTInterface.setSource(mType);
		mInterfaceDeclarationtoTInterface.setTarget(tType);
		ccMatch.getCreateCorr().add(mInterfaceDeclarationtoTInterface);
		return new Object[] { tType, mTypeToTType, mBodyToTAnnotation, mInterfaceDeclarationtoTInterface, mType,
				ccMatch };
	}

	public static final Object[] pattern_Interface_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_Interface_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "Interface";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_Interface_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Interface_27_1_matchtggpattern_black_nac_0B(InterfaceDeclaration mType) {
		AbstractTypeDeclaration __DEC_mType_abstractTypeDeclaration_893745 = mType.getAbstractTypeDeclaration();
		if (__DEC_mType_abstractTypeDeclaration_893745 != null) {
			if (!mType.equals(__DEC_mType_abstractTypeDeclaration_893745)) {
				return new Object[] { mType };
			}
		}

		return null;
	}

	public static final Object[] pattern_Interface_27_1_matchtggpattern_black_nac_1B(InterfaceDeclaration mType) {
		AnonymousClassDeclaration __DEC_mType_anonymousClassDeclarationOwner_238421 = mType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mType_anonymousClassDeclarationOwner_238421 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_Interface_27_1_matchtggpattern_black_nac_2B(InterfaceDeclaration mType) {
		for (Model __DEC_mType_orphanTypes_351357 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, Model.class, "orphanTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_Interface_27_1_matchtggpattern_black_nac_3B(InterfaceDeclaration mType) {
		for (MAbstractMethodDefinition __DEC_mType_mInnerTypes_66616 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_Interface_27_1_matchtggpattern_blackBB(
			org.eclipse.modisco.java.Package mPackage, InterfaceDeclaration mType) {
		if (mPackage.getOwnedElements().contains(mType)) {
			if (pattern_Interface_27_1_matchtggpattern_black_nac_0B(mType) == null) {
				if (pattern_Interface_27_1_matchtggpattern_black_nac_1B(mType) == null) {
					if (pattern_Interface_27_1_matchtggpattern_black_nac_2B(mType) == null) {
						if (pattern_Interface_27_1_matchtggpattern_black_nac_3B(mType) == null) {
							return new Object[] { mPackage, mType };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_Interface_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Interface_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Interface_28_1_matchtggpattern_black_nac_0BB(TInterface tType,
			TPackage tPackage) {
		for (TPackage __DEC_tType_interfaces_587109 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TPackage.class, "interfaces")) {
			if (!tPackage.equals(__DEC_tType_interfaces_587109)) {
				return new Object[] { tType, tPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_Interface_28_1_matchtggpattern_black_nac_1BB(TInterface tType, TypeGraph pg) {
		for (TypeGraph __DEC_tType_interfaces_956399 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "interfaces")) {
			if (!pg.equals(__DEC_tType_interfaces_956399)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_Interface_28_1_matchtggpattern_black_nac_2BB(TInterface tType,
			TPackage tPackage) {
		TPackage __DEC_tType_ownedTypes_479366 = tType.getPackage();
		if (__DEC_tType_ownedTypes_479366 != null) {
			if (!tPackage.equals(__DEC_tType_ownedTypes_479366)) {
				return new Object[] { tType, tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_Interface_28_1_matchtggpattern_black_nac_3B(TInterface tType) {
		TAbstractType __DEC_tType_innerTypes_661931 = tType.getOuterType();
		if (__DEC_tType_innerTypes_661931 != null) {
			if (!tType.equals(__DEC_tType_innerTypes_661931)) {
				return new Object[] { tType };
			}
		}

		return null;
	}

	public static final Object[] pattern_Interface_28_1_matchtggpattern_blackBBB(TPackage tPackage, TInterface tType,
			TypeGraph pg) {
		if (pg.getInterfaces().contains(tType)) {
			if (tPackage.getInterfaces().contains(tType)) {
				if (pg.getOwnedTypes().contains(tType)) {
					if (tPackage.getOwnedTypes().contains(tType)) {
						if (pg.equals(tPackage.getTypeGraph())) {
							if (pattern_Interface_28_1_matchtggpattern_black_nac_0BB(tType, tPackage) == null) {
								if (pattern_Interface_28_1_matchtggpattern_black_nac_1BB(tType, pg) == null) {
									if (pattern_Interface_28_1_matchtggpattern_black_nac_2BB(tType, tPackage) == null) {
										if (pattern_Interface_28_1_matchtggpattern_black_nac_3B(tType) == null) {
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

	public static final boolean pattern_Interface_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Interface_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Interface_29_1_createresult_blackB(Interface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Interface_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_Interface_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, PackageToTPackage mPackageToTPackage) {
		if (ruleResult.getCorrObjects().contains(mPackageToTPackage)) {
			return new Object[] { ruleResult, mPackageToTPackage };
		}
		return null;
	}

	public static final Object[] pattern_Interface_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.modisco.java.Package mPackage) {
		if (ruleResult.getSourceObjects().contains(mPackage)) {
			return new Object[] { ruleResult, mPackage };
		}
		return null;
	}

	public static final Object[] pattern_Interface_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TPackage tPackage) {
		if (ruleResult.getTargetObjects().contains(tPackage)) {
			return new Object[] { ruleResult, tPackage };
		}
		return null;
	}

	public static final Object[] pattern_Interface_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Interface_29_2_isapplicablecore_blackFFFFFBB(
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
							TypeGraph pg = tPackage.getTypeGraph();
							if (pg != null) {
								if (pattern_Interface_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										mPackageToTPackage) == null) {
									if (pattern_Interface_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mPackage) == null) {
										if (pattern_Interface_29_2_isapplicablecore_black_nac_2BB(ruleResult,
												tPackage) == null) {
											if (pattern_Interface_29_2_isapplicablecore_black_nac_3BB(ruleResult,
													pg) == null) {
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

	public static final Object[] pattern_Interface_29_3_solveCSP_bindingFBBBBBBB(Interface _this,
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

	public static final Object[] pattern_Interface_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Interface_29_3_solveCSP_bindingAndBlackFBBBBBBB(Interface _this,
			IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage, TPackage tPackage,
			org.eclipse.modisco.java.Package mPackage, TypeGraph pg, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_Interface_29_3_solveCSP_binding = pattern_Interface_29_3_solveCSP_bindingFBBBBBBB(_this,
				isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg, ruleResult);
		if (result_pattern_Interface_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Interface_29_3_solveCSP_binding[0];

			Object[] result_pattern_Interface_29_3_solveCSP_black = pattern_Interface_29_3_solveCSP_blackB(csp);
			if (result_pattern_Interface_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tPackage, mPackage, pg,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_Interface_29_4_checkCSP_expressionFBB(Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Interface_29_5_checknacs_blackBBBB(PackageToTPackage mPackageToTPackage,
			TPackage tPackage, org.eclipse.modisco.java.Package mPackage, TypeGraph pg) {
		return new Object[] { mPackageToTPackage, tPackage, mPackage, pg };
	}

	public static final Object[] pattern_Interface_29_6_perform_blackBBBBB(PackageToTPackage mPackageToTPackage,
			TPackage tPackage, org.eclipse.modisco.java.Package mPackage, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mPackageToTPackage, tPackage, mPackage, pg, ruleResult };
	}

	public static final Object[] pattern_Interface_29_6_perform_greenBFBFBFFFBB(TPackage tPackage,
			org.eclipse.modisco.java.Package mPackage, TypeGraph pg, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TInterface tType = BasicFactory.eINSTANCE.createTInterface();
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		InterfaceDeclarationToTInterface mInterfaceDeclarationtoTInterface = PmFactory.eINSTANCE
				.createInterfaceDeclarationToTInterface();
		InterfaceDeclaration mType = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		Object _localVariable_0 = csp.getValue("tType", "tName");
		Object _localVariable_1 = csp.getValue("tType", "tLib");
		Object _localVariable_2 = csp.getValue("mType", "name");
		Object _localVariable_3 = csp.getValue("mType", "proxy");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		pg.getInterfaces().add(tType);
		tPackage.getInterfaces().add(tType);
		pg.getOwnedTypes().add(tType);
		tPackage.getOwnedTypes().add(tType);
		ruleResult.getTargetObjects().add(tType);
		mTypeToTType.setTarget(tType);
		ruleResult.getCorrObjects().add(mTypeToTType);
		mBodyToTAnnotation.setTarget(tType);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		mInterfaceDeclarationtoTInterface.setTarget(tType);
		ruleResult.getCorrObjects().add(mInterfaceDeclarationtoTInterface);
		mBodyToTAnnotation.setSource(mType);
		mPackage.getOwnedElements().add(mType);
		mInterfaceDeclarationtoTInterface.setSource(mType);
		mTypeToTType.setSource(mType);
		ruleResult.getSourceObjects().add(mType);
		String tType_tName_prime = (String) _localVariable_0;
		boolean tType_tLib_prime = (boolean) _localVariable_1;
		String mType_name_prime = (String) _localVariable_2;
		boolean mType_proxy_prime = (boolean) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		tType.setTName(tType_tName_prime);
		tType.setTLib(Boolean.valueOf(tType_tLib_prime));
		mType.setName(mType_name_prime);
		mType.setProxy(Boolean.valueOf(mType_proxy_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tPackage, tType, mPackage, mTypeToTType, pg, mBodyToTAnnotation,
				mInterfaceDeclarationtoTInterface, mType, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_Interface_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InterfaceImpl
