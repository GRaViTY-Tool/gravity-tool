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
import org.eclipse.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.Model;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MAbstractMethodDefinition;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.PackageToTPackage;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.AnnotationTypeInPackage;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotationType;

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
 * An implementation of the model object '<em><b>Annotation Type In Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotationTypeInPackageImpl extends AbstractRuleImpl implements AnnotationTypeInPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeInPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnnotationTypeInPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.Package mPackage,
			AnnotationTypeDeclaration mType) {

		Object[] result1_black = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_0_1_initialbindings_blackBBBB(this, match, mPackage, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mPackage, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationTypeInPackageImpl
					.pattern_AnnotationTypeInPackage_0_4_collectelementstobetranslated_blackBBB(match, mPackage, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
			}
			AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_0_4_collectelementstobetranslated_greenBBBFF(
					match, mPackage, mType);
			//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result4_green[4];

			Object[] result5_black = AnnotationTypeInPackageImpl
					.pattern_AnnotationTypeInPackage_0_5_collectcontextelements_blackBBB(match, mPackage, mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
			}
			AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_0_5_collectcontextelements_greenBB(match,
					mPackage);

			// 
			AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_0_6_registerobjectstomatch_expressionBBBB(this,
					match, mPackage, mType);
			return AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_0_7_expressionF();
		} else {
			return AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		PackageToTPackage mPackageToTPackage = (PackageToTPackage) result1_bindingAndBlack[0];
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[1];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[3];
		AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_1_1_performtransformation_greenFFBBFBB(tPackage, pg, mType, csp);
		ASTNodeToTAnnotatable annotatable2Annotatable = (ASTNodeToTAnnotatable) result1_green[0];
		TAnnotationType tType = (TAnnotationType) result1_green[1];
		TypeToTAbstractType type2Type = (TypeToTAbstractType) result1_green[4];

		Object[] result2_black = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_1_2_collecttranslatedelements_blackBBBB(annotatable2Annotatable, tType,
						type2Type, mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[annotatable2Annotatable] = "
					+ annotatable2Annotatable + ", " + "[tType] = " + tType + ", " + "[type2Type] = " + type2Type + ", "
					+ "[mType] = " + mType + ".");
		}
		Object[] result2_green = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_1_2_collecttranslatedelements_greenFBBBB(annotatable2Annotatable,
						tType, type2Type, mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_1_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult, mPackageToTPackage,
						annotatable2Annotatable, tType, mPackage, tPackage, pg, type2Type, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ", " + "[annotatable2Annotatable] = "
					+ annotatable2Annotatable + ", " + "[tType] = " + tType + ", " + "[mPackage] = " + mPackage + ", "
					+ "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ", " + "[type2Type] = " + type2Type + ", "
					+ "[mType] = " + mType + ".");
		}
		AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFF(
				ruleresult, annotatable2Annotatable, tType, mPackage, tPackage, pg, type2Type, mType);
		//nothing EMoflonEdge pg__tType____allTypes = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge type2Type__mType____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge annotatable2Annotatable__tType____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge pg__tType____annotationTypes = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tPackage__tType____allTypes = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge annotatable2Annotatable__mType____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge type2Type__tType____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[18];

		// 
		// 
		AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_1_5_registerobjects_expressionBBBBBBBBBB(this,
				ruleresult, mPackageToTPackage, annotatable2Annotatable, tType, mPackage, tPackage, pg, type2Type,
				mType);
		return AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_binding[0];
		AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result2_binding[1];
		for (Object[] result2_black : AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_2_2_corematch_blackFBFBB(mPackage, mType, match)) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[0];
			TPackage tPackage = (TPackage) result2_black[2];
			// ForEach 
			for (Object[] result3_black : AnnotationTypeInPackageImpl
					.pattern_AnnotationTypeInPackage_2_3_findcontext_blackBBBFB(mPackageToTPackage, mPackage, tPackage,
							mType)) {
				TypeGraph pg = (TypeGraph) result3_black[3];
				Object[] result3_green = AnnotationTypeInPackageImpl
						.pattern_AnnotationTypeInPackage_2_3_findcontext_greenBBBBBFFFFFF(mPackageToTPackage, mPackage,
								tPackage, pg, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge tPackage__pg____model = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mPackageToTPackage__mPackage____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = AnnotationTypeInPackageImpl
						.pattern_AnnotationTypeInPackage_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								mPackageToTPackage, mPackage, tPackage, pg, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackageToTPackage] = "
							+ mPackageToTPackage + ", " + "[mPackage] = " + mPackage + ", " + "[tPackage] = " + tPackage
							+ ", " + "[pg] = " + pg + ", " + "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationTypeInPackageImpl
							.pattern_AnnotationTypeInPackage_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.modisco.java.Package mPackage,
			AnnotationTypeDeclaration mType) {
		match.registerObject("mPackage", mPackage);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.modisco.java.Package mPackage,
			AnnotationTypeDeclaration mType) {// Create CSP
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
			org.eclipse.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			AnnotationTypeDeclaration mType) {// Create CSP
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
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("tPackage", tPackage);
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
			EObject annotatable2Annotatable, EObject tType, EObject mPackage, EObject tPackage, EObject pg,
			EObject type2Type, EObject mType) {
		ruleresult.registerObject("mPackageToTPackage", mPackageToTPackage);
		ruleresult.registerObject("annotatable2Annotatable", annotatable2Annotatable);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("tPackage", tPackage);
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
				.equals("java.AnnotationTypeDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {

		Object[] result1_black = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_10_1_initialbindings_blackBBBBB(this, match, tType, tPackage, pg);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tPackage] = " + tPackage + ", "
					+ "[pg] = " + pg + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tType, tPackage, pg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tPackage] = " + tPackage + ", "
					+ "[pg] = " + pg + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationTypeInPackageImpl
					.pattern_AnnotationTypeInPackage_10_4_collectelementstobetranslated_blackBBBB(match, tType,
							tPackage, pg);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tType] = " + tType + ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ".");
			}
			AnnotationTypeInPackageImpl
					.pattern_AnnotationTypeInPackage_10_4_collectelementstobetranslated_greenBBBBFFFFF(match, tType,
							tPackage, pg);
			//nothing EMoflonEdge pg__tType____allTypes = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge pg__tType____annotationTypes = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tPackage__tType____allTypes = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result4_green[8];

			Object[] result5_black = AnnotationTypeInPackageImpl
					.pattern_AnnotationTypeInPackage_10_5_collectcontextelements_blackBBBB(match, tType, tPackage, pg);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tType] = " + tType + ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ".");
			}
			AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_10_5_collectcontextelements_greenBBBF(match,
					tPackage, pg);
			//nothing EMoflonEdge tPackage__pg____model = (EMoflonEdge) result5_green[3];

			// 
			AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_10_6_registerobjectstomatch_expressionBBBBB(
					this, match, tType, tPackage, pg);
			return AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_10_7_expressionF();
		} else {
			return AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_11_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		PackageToTPackage mPackageToTPackage = (PackageToTPackage) result1_bindingAndBlack[0];
		TAnnotationType tType = (TAnnotationType) result1_bindingAndBlack[1];
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[2];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[3];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_11_1_performtransformation_greenFBBFFB(tType, mPackage, csp);
		ASTNodeToTAnnotatable annotatable2Annotatable = (ASTNodeToTAnnotatable) result1_green[0];
		TypeToTAbstractType type2Type = (TypeToTAbstractType) result1_green[3];
		AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result1_green[4];

		Object[] result2_black = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_11_2_collecttranslatedelements_blackBBBB(annotatable2Annotatable,
						tType, type2Type, mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[annotatable2Annotatable] = "
					+ annotatable2Annotatable + ", " + "[tType] = " + tType + ", " + "[type2Type] = " + type2Type + ", "
					+ "[mType] = " + mType + ".");
		}
		Object[] result2_green = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_11_2_collecttranslatedelements_greenFBBBB(annotatable2Annotatable,
						tType, type2Type, mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_11_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult, mPackageToTPackage,
						annotatable2Annotatable, tType, mPackage, tPackage, pg, type2Type, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mPackageToTPackage] = " + mPackageToTPackage + ", " + "[annotatable2Annotatable] = "
					+ annotatable2Annotatable + ", " + "[tType] = " + tType + ", " + "[mPackage] = " + mPackage + ", "
					+ "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ", " + "[type2Type] = " + type2Type + ", "
					+ "[mType] = " + mType + ".");
		}
		AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFF(
				ruleresult, annotatable2Annotatable, tType, mPackage, tPackage, pg, type2Type, mType);
		//nothing EMoflonEdge pg__tType____allTypes = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge type2Type__mType____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge annotatable2Annotatable__tType____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge pg__tType____annotationTypes = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tPackage__tType____allTypes = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge annotatable2Annotatable__mType____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge type2Type__tType____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[18];

		// 
		// 
		AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_11_5_registerobjects_expressionBBBBBBBBBB(this,
				ruleresult, mPackageToTPackage, annotatable2Annotatable, tType, mPackage, tPackage, pg, type2Type,
				mType);
		return AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAnnotationType tType = (TAnnotationType) result2_binding[0];
		TPackage tPackage = (TPackage) result2_binding[1];
		TypeGraph pg = (TypeGraph) result2_binding[2];
		for (Object[] result2_black : AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_12_2_corematch_blackFBFBBB(tType, tPackage, pg, match)) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[0];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[2];
			// ForEach 
			for (Object[] result3_black : AnnotationTypeInPackageImpl
					.pattern_AnnotationTypeInPackage_12_3_findcontext_blackBBBBB(mPackageToTPackage, tType, mPackage,
							tPackage, pg)) {
				Object[] result3_green = AnnotationTypeInPackageImpl
						.pattern_AnnotationTypeInPackage_12_3_findcontext_greenBBBBBFFFFFFFFF(mPackageToTPackage, tType,
								mPackage, tPackage, pg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge pg__tType____allTypes = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge tPackage__pg____model = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mPackageToTPackage__mPackage____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge pg__tType____annotationTypes = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tPackage__tType____allTypes = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mPackageToTPackage__tPackage____target = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = AnnotationTypeInPackageImpl
						.pattern_AnnotationTypeInPackage_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								mPackageToTPackage, tType, mPackage, tPackage, pg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackageToTPackage] = "
							+ mPackageToTPackage + ", " + "[tType] = " + tType + ", " + "[mPackage] = " + mPackage
							+ ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = AnnotationTypeInPackageImpl
							.pattern_AnnotationTypeInPackage_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		match.registerObject("tType", tType);
		match.registerObject("tPackage", tPackage);
		match.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {// Create CSP
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
			TAnnotationType tType, org.eclipse.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg) {// Create CSP
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
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("tPackage", tPackage);
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
			EObject annotatable2Annotatable, EObject tType, EObject mPackage, EObject tPackage, EObject pg,
			EObject type2Type, EObject mType) {
		ruleresult.registerObject("mPackageToTPackage", mPackageToTPackage);
		ruleresult.registerObject("annotatable2Annotatable", annotatable2Annotatable);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("tPackage", tPackage);
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
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tType").eClass())
				.equals("basic.annotations.TAnnotationType.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_63(EMoflonEdge _edge_allTypes) {

		Object[] result1_bindingAndBlack = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_20_2_testcorematchandDECs_blackFFFB(_edge_allTypes)) {
			TAnnotationType tType = (TAnnotationType) result2_black[0];
			TPackage tPackage = (TPackage) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[2];
			Object[] result2_green = AnnotationTypeInPackageImpl
					.pattern_AnnotationTypeInPackage_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationTypeInPackageImpl
					.pattern_AnnotationTypeInPackage_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tType, tPackage, pg)) {
				// 
				if (AnnotationTypeInPackageImpl
						.pattern_AnnotationTypeInPackage_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationTypeInPackageImpl
							.pattern_AnnotationTypeInPackage_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_68(EMoflonEdge _edge_ownedElements) {

		Object[] result1_bindingAndBlack = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_21_2_testcorematchandDECs_blackFFB(_edge_ownedElements)) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[0];
			AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result2_black[1];
			Object[] result2_green = AnnotationTypeInPackageImpl
					.pattern_AnnotationTypeInPackage_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationTypeInPackageImpl
					.pattern_AnnotationTypeInPackage_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, mPackage, mType)) {
				// 
				if (AnnotationTypeInPackageImpl
						.pattern_AnnotationTypeInPackage_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationTypeInPackageImpl
							.pattern_AnnotationTypeInPackage_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnnotationTypeInPackage");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tLib.setValue(__helper.getValue("tType", "tLib"));
		var_tType_tLib.setType("boolean");

		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_proxy.setValue(__helper.getValue("mType", "proxy"));
		var_mType_proxy.setType("boolean");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("AnnotationTypeInPackage");
		eq0.solve(var_mType_name, var_tType_tName);

		eq1.setRuleName("AnnotationTypeInPackage");
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
		ruleResult.setRule("AnnotationTypeInPackage");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tLib.setValue(__helper.getValue("tType", "tLib"));
		var_tType_tLib.setType("boolean");

		Variable var_mType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_proxy.setValue(__helper.getValue("mType", "proxy"));
		var_mType_proxy.setType("boolean");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("AnnotationTypeInPackage");
		eq0.solve(var_mType_name, var_tType_tName);

		eq1.setRuleName("AnnotationTypeInPackage");
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

		Object[] result1_black = AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TAnnotationType tType = (TAnnotationType) result2_bindingAndBlack[0];
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[1];
		TPackage tPackage = (TPackage) result2_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[3];
		AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, tType, mPackage, tPackage,
						pg, mType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tType] = " + tType + ", " + "[mPackage] = " + mPackage + ", " + "[tPackage] = " + tPackage
					+ ", " + "[pg] = " + pg + ", " + "[mType] = " + mType + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnnotationTypeInPackageImpl
					.pattern_AnnotationTypeInPackage_24_5_matchcorrcontext_blackFBBBB(mPackage, tPackage, sourceMatch,
							targetMatch)) {
				PackageToTPackage mPackageToTPackage = (PackageToTPackage) result5_black[0];
				Object[] result5_green = AnnotationTypeInPackageImpl
						.pattern_AnnotationTypeInPackage_24_5_matchcorrcontext_greenBBBF(mPackageToTPackage,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = AnnotationTypeInPackageImpl
						.pattern_AnnotationTypeInPackage_24_6_createcorrespondence_blackBBBBBB(tType, mPackage,
								tPackage, pg, mType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tType] = " + tType + ", "
							+ "[mPackage] = " + mPackage + ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg
							+ ", " + "[mType] = " + mType + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_24_6_createcorrespondence_greenFBFBB(tType,
						mType, ccMatch);
				//nothing ASTNodeToTAnnotatable annotatable2Annotatable = (ASTNodeToTAnnotatable) result6_green[0];
				//nothing TypeToTAbstractType type2Type = (TypeToTAbstractType) result6_green[2];

				Object[] result7_black = AnnotationTypeInPackageImpl
						.pattern_AnnotationTypeInPackage_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TAnnotationType tType, org.eclipse.modisco.java.Package mPackage,
			TPackage tPackage, TypeGraph pg, AnnotationTypeDeclaration mType, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.Package mPackage, AnnotationTypeDeclaration mType) {// 
		Object[] result1_black = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_27_1_matchtggpattern_blackBB(mPackage, mType);
		if (result1_black != null) {
			return AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_27_2_expressionF();
		} else {
			return AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAnnotationType tType, TPackage tPackage, TypeGraph pg) {// 
		Object[] result1_black = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_28_1_matchtggpattern_blackBBB(tType, tPackage, pg);
		if (result1_black != null) {
			return AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_28_2_expressionF();
		} else {
			return AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			PackageToTPackage mPackageToTPackageParameter) {

		Object[] result1_black = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnnotationTypeInPackageImpl
				.pattern_AnnotationTypeInPackage_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mPackageToTPackageList = (RuleEntryList) result2_black[0];
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result2_black[1];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[2];
			TPackage tPackage = (TPackage) result2_black[3];
			TypeGraph pg = (TypeGraph) result2_black[4];

			Object[] result3_bindingAndBlack = AnnotationTypeInPackageImpl
					.pattern_AnnotationTypeInPackage_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
							mPackageToTPackage, mPackage, tPackage, pg, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackageToTPackage] = "
						+ mPackageToTPackage + ", " + "[mPackage] = " + mPackage + ", " + "[tPackage] = " + tPackage
						+ ", " + "[pg] = " + pg + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnnotationTypeInPackageImpl
						.pattern_AnnotationTypeInPackage_29_5_checknacs_blackBBBB(mPackageToTPackage, mPackage,
								tPackage, pg);
				if (result5_black != null) {

					Object[] result6_black = AnnotationTypeInPackageImpl
							.pattern_AnnotationTypeInPackage_29_6_perform_blackBBBBB(mPackageToTPackage, mPackage,
									tPackage, pg, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[mPackageToTPackage] = " + mPackageToTPackage + ", " + "[mPackage] = " + mPackage
								+ ", " + "[tPackage] = " + tPackage + ", " + "[pg] = " + pg + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_29_6_perform_greenFFBBBFFBB(mPackage,
							tPackage, pg, ruleResult, csp);
					//nothing ASTNodeToTAnnotatable annotatable2Annotatable = (ASTNodeToTAnnotatable) result6_green[0];
					//nothing TAnnotationType tType = (TAnnotationType) result6_green[1];
					//nothing TypeToTAbstractType type2Type = (TypeToTAbstractType) result6_green[5];
					//nothing AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeInPackageImpl.pattern_AnnotationTypeInPackage_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			org.eclipse.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
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
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("tPackage", tPackage);
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
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___IS_APPROPRIATE_FWD__MATCH_PACKAGE_ANNOTATIONTYPEDECLARATION:
				return isAppropriate_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
						(AnnotationTypeDeclaration) arguments.get(2));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGE_ANNOTATIONTYPEDECLARATION:
				registerObjectsToMatch_FWD((Match) arguments.get(0),
						(org.eclipse.modisco.java.Package) arguments.get(1),
						(AnnotationTypeDeclaration) arguments.get(2));
				return null;
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGE_ANNOTATIONTYPEDECLARATION:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
						(org.eclipse.modisco.java.Package) arguments.get(1),
						(AnnotationTypeDeclaration) arguments.get(2));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_PACKAGE_TPACKAGE_TYPEGRAPH_ANNOTATIONTYPEDECLARATION:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
						(PackageToTPackage) arguments.get(1), (org.eclipse.modisco.java.Package) arguments.get(2),
						(TPackage) arguments.get(3), (TypeGraph) arguments.get(4),
						(AnnotationTypeDeclaration) arguments.get(5));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8));
				return null;
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___IS_APPROPRIATE_BWD__MATCH_TANNOTATIONTYPE_TPACKAGE_TYPEGRAPH:
				return isAppropriate_BWD((Match) arguments.get(0), (TAnnotationType) arguments.get(1),
						(TPackage) arguments.get(2), (TypeGraph) arguments.get(3));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TANNOTATIONTYPE_TPACKAGE_TYPEGRAPH:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TAnnotationType) arguments.get(1),
						(TPackage) arguments.get(2), (TypeGraph) arguments.get(3));
				return null;
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TANNOTATIONTYPE_TPACKAGE_TYPEGRAPH:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAnnotationType) arguments.get(1),
						(TPackage) arguments.get(2), (TypeGraph) arguments.get(3));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_TANNOTATIONTYPE_PACKAGE_TPACKAGE_TYPEGRAPH:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(PackageToTPackage) arguments.get(1), (TAnnotationType) arguments.get(2),
						(org.eclipse.modisco.java.Package) arguments.get(3), (TPackage) arguments.get(4),
						(TypeGraph) arguments.get(5));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8));
				return null;
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_63__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_63((EMoflonEdge) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_68__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_68((EMoflonEdge) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___IS_APPLICABLE_SOLVE_CSP_CC__TANNOTATIONTYPE_PACKAGE_TPACKAGE_TYPEGRAPH_ANNOTATIONTYPEDECLARATION_MATCH_MATCH:
				return isApplicable_solveCsp_CC((TAnnotationType) arguments.get(0),
						(org.eclipse.modisco.java.Package) arguments.get(1), (TPackage) arguments.get(2),
						(TypeGraph) arguments.get(3), (AnnotationTypeDeclaration) arguments.get(4),
						(Match) arguments.get(5), (Match) arguments.get(6));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___CHECK_DEC_FWD__PACKAGE_ANNOTATIONTYPEDECLARATION:
				return checkDEC_FWD((org.eclipse.modisco.java.Package) arguments.get(0),
						(AnnotationTypeDeclaration) arguments.get(1));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___CHECK_DEC_BWD__TANNOTATIONTYPE_TPACKAGE_TYPEGRAPH:
				return checkDEC_BWD((TAnnotationType) arguments.get(0), (TPackage) arguments.get(1),
						(TypeGraph) arguments.get(2));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___GENERATE_MODEL__RULEENTRYCONTAINER_PACKAGETOTPACKAGE:
				return generateModel((RuleEntryContainer) arguments.get(0), (PackageToTPackage) arguments.get(1));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGETOTPACKAGE_PACKAGE_TPACKAGE_TYPEGRAPH_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(PackageToTPackage) arguments.get(1), (org.eclipse.modisco.java.Package) arguments.get(2),
						(TPackage) arguments.get(3), (TypeGraph) arguments.get(4),
						(ModelgeneratorRuleResult) arguments.get(5));
			case RulesPackage.ANNOTATION_TYPE_IN_PACKAGE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnnotationTypeInPackage_0_1_initialbindings_blackBBBB(
			AnnotationTypeInPackage _this, Match match, org.eclipse.modisco.java.Package mPackage,
			AnnotationTypeDeclaration mType) {
		return new Object[] { _this, match, mPackage, mType };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_0_2_SolveCSP_bindingFBBBB(
			AnnotationTypeInPackage _this, Match match, org.eclipse.modisco.java.Package mPackage,
			AnnotationTypeDeclaration mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mPackage, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mPackage, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_0_2_SolveCSP_bindingAndBlackFBBBB(
			AnnotationTypeInPackage _this, Match match, org.eclipse.modisco.java.Package mPackage,
			AnnotationTypeDeclaration mType) {
		Object[] result_pattern_AnnotationTypeInPackage_0_2_SolveCSP_binding = pattern_AnnotationTypeInPackage_0_2_SolveCSP_bindingFBBBB(
				_this, match, mPackage, mType);
		if (result_pattern_AnnotationTypeInPackage_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeInPackage_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeInPackage_0_2_SolveCSP_black = pattern_AnnotationTypeInPackage_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeInPackage_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mPackage, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeInPackage_0_3_CheckCSP_expressionFBB(
			AnnotationTypeInPackage _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_0_4_collectelementstobetranslated_blackBBB(Match match,
			org.eclipse.modisco.java.Package mPackage, AnnotationTypeDeclaration mType) {
		return new Object[] { match, mPackage, mType };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, org.eclipse.modisco.java.Package mPackage, AnnotationTypeDeclaration mType) {
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

	public static final Object[] pattern_AnnotationTypeInPackage_0_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.modisco.java.Package mPackage, AnnotationTypeDeclaration mType) {
		return new Object[] { match, mPackage, mType };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_0_5_collectcontextelements_greenBB(Match match,
			org.eclipse.modisco.java.Package mPackage) {
		match.getContextNodes().add(mPackage);
		return new Object[] { match, mPackage };
	}

	public static final void pattern_AnnotationTypeInPackage_0_6_registerobjectstomatch_expressionBBBB(
			AnnotationTypeInPackage _this, Match match, org.eclipse.modisco.java.Package mPackage,
			AnnotationTypeDeclaration mType) {
		_this.registerObjectsToMatch_FWD(match, mPackage, mType);

	}

	public static final boolean pattern_AnnotationTypeInPackage_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeInPackage_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mPackageToTPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("pg");
		EObject _localVariable_4 = isApplicableMatch.getObject("mType");
		EObject tmpMPackageToTPackage = _localVariable_0;
		EObject tmpMPackage = _localVariable_1;
		EObject tmpTPackage = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		if (tmpMPackageToTPackage instanceof PackageToTPackage) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) tmpMPackageToTPackage;
			if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
				org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
				if (tmpTPackage instanceof TPackage) {
					TPackage tPackage = (TPackage) tmpTPackage;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpMType instanceof AnnotationTypeDeclaration) {
							AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) tmpMType;
							return new Object[] { mPackageToTPackage, mPackage, tPackage, pg, mType,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_1_1_performtransformation_blackBBBBBFBB(
			PackageToTPackage mPackageToTPackage, org.eclipse.modisco.java.Package mPackage, TPackage tPackage,
			TypeGraph pg, AnnotationTypeDeclaration mType, AnnotationTypeInPackage _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mPackageToTPackage, mPackage, tPackage, pg, mType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			AnnotationTypeInPackage _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationTypeInPackage_1_1_performtransformation_binding = pattern_AnnotationTypeInPackage_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationTypeInPackage_1_1_performtransformation_binding != null) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result_pattern_AnnotationTypeInPackage_1_1_performtransformation_binding[0];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_AnnotationTypeInPackage_1_1_performtransformation_binding[1];
			TPackage tPackage = (TPackage) result_pattern_AnnotationTypeInPackage_1_1_performtransformation_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_AnnotationTypeInPackage_1_1_performtransformation_binding[3];
			AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeInPackage_1_1_performtransformation_binding[4];

			Object[] result_pattern_AnnotationTypeInPackage_1_1_performtransformation_black = pattern_AnnotationTypeInPackage_1_1_performtransformation_blackBBBBBFBB(
					mPackageToTPackage, mPackage, tPackage, pg, mType, _this, isApplicableMatch);
			if (result_pattern_AnnotationTypeInPackage_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationTypeInPackage_1_1_performtransformation_black[5];

				return new Object[] { mPackageToTPackage, mPackage, tPackage, pg, mType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_1_1_performtransformation_greenFFBBFBB(
			TPackage tPackage, TypeGraph pg, AnnotationTypeDeclaration mType, CSP csp) {
		ASTNodeToTAnnotatable annotatable2Annotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TAnnotationType tType = AnnotationsFactory.eINSTANCE.createTAnnotationType();
		TypeToTAbstractType type2Type = PmFactory.eINSTANCE.createTypeToTAbstractType();
		Object _localVariable_0 = csp.getValue("tType", "tName");
		Object _localVariable_1 = csp.getValue("tType", "tLib");
		annotatable2Annotatable.setSource(mType);
		pg.getAllTypes().add(tType);
		annotatable2Annotatable.setTarget(tType);
		pg.getAnnotationTypes().add(tType);
		tPackage.getAllTypes().add(tType);
		type2Type.setSource(mType);
		type2Type.setTarget(tType);
		String tType_tName_prime = (String) _localVariable_0;
		boolean tType_tLib_prime = (boolean) _localVariable_1;
		tType.setTName(tType_tName_prime);
		tType.setTLib(Boolean.valueOf(tType_tLib_prime));
		return new Object[] { annotatable2Annotatable, tType, tPackage, pg, type2Type, mType, csp };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_1_2_collecttranslatedelements_blackBBBB(
			ASTNodeToTAnnotatable annotatable2Annotatable, TAnnotationType tType, TypeToTAbstractType type2Type,
			AnnotationTypeDeclaration mType) {
		return new Object[] { annotatable2Annotatable, tType, type2Type, mType };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_1_2_collecttranslatedelements_greenFBBBB(
			ASTNodeToTAnnotatable annotatable2Annotatable, TAnnotationType tType, TypeToTAbstractType type2Type,
			AnnotationTypeDeclaration mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(annotatable2Annotatable);
		ruleresult.getCreatedElements().add(tType);
		ruleresult.getCreatedLinkElements().add(type2Type);
		ruleresult.getTranslatedElements().add(mType);
		return new Object[] { ruleresult, annotatable2Annotatable, tType, type2Type, mType };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject annotatable2Annotatable, EObject tType,
			EObject mPackage, EObject tPackage, EObject pg, EObject type2Type, EObject mType) {
		if (!mPackageToTPackage.equals(tType)) {
			if (!mPackageToTPackage.equals(tPackage)) {
				if (!mPackageToTPackage.equals(pg)) {
					if (!mPackageToTPackage.equals(type2Type)) {
						if (!mPackageToTPackage.equals(mType)) {
							if (!annotatable2Annotatable.equals(mPackageToTPackage)) {
								if (!annotatable2Annotatable.equals(tType)) {
									if (!annotatable2Annotatable.equals(mPackage)) {
										if (!annotatable2Annotatable.equals(tPackage)) {
											if (!annotatable2Annotatable.equals(pg)) {
												if (!annotatable2Annotatable.equals(type2Type)) {
													if (!annotatable2Annotatable.equals(mType)) {
														if (!tType.equals(type2Type)) {
															if (!mPackage.equals(mPackageToTPackage)) {
																if (!mPackage.equals(tType)) {
																	if (!mPackage.equals(tPackage)) {
																		if (!mPackage.equals(pg)) {
																			if (!mPackage.equals(type2Type)) {
																				if (!mPackage.equals(mType)) {
																					if (!tPackage.equals(tType)) {
																						if (!tPackage
																								.equals(type2Type)) {
																							if (!pg.equals(tType)) {
																								if (!pg.equals(
																										tPackage)) {
																									if (!pg.equals(
																											type2Type)) {
																										if (!mType
																												.equals(tType)) {
																											if (!mType
																													.equals(tPackage)) {
																												if (!mType
																														.equals(pg)) {
																													if (!mType
																															.equals(type2Type)) {
																														return new Object[] {
																																ruleresult,
																																mPackageToTPackage,
																																annotatable2Annotatable,
																																tType,
																																mPackage,
																																tPackage,
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

	public static final Object[] pattern_AnnotationTypeInPackage_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject annotatable2Annotatable, EObject tType, EObject mPackage,
			EObject tPackage, EObject pg, EObject type2Type, EObject mType) {
		EMoflonEdge pg__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type2Type__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotatable2Annotatable__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____annotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotatable2Annotatable__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type2Type__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeInPackage";
		String pg__tType____allTypes_name_prime = "allTypes";
		String tType__pg____model_name_prime = "model";
		String type2Type__mType____source_name_prime = "source";
		String annotatable2Annotatable__tType____target_name_prime = "target";
		String pg__tType____annotationTypes_name_prime = "annotationTypes";
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
		type2Type__mType____source.setSrc(type2Type);
		type2Type__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(type2Type__mType____source);
		annotatable2Annotatable__tType____target.setSrc(annotatable2Annotatable);
		annotatable2Annotatable__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(annotatable2Annotatable__tType____target);
		pg__tType____annotationTypes.setSrc(pg);
		pg__tType____annotationTypes.setTrg(tType);
		ruleresult.getCreatedEdges().add(pg__tType____annotationTypes);
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
		type2Type__mType____source.setName(type2Type__mType____source_name_prime);
		annotatable2Annotatable__tType____target.setName(annotatable2Annotatable__tType____target_name_prime);
		pg__tType____annotationTypes.setName(pg__tType____annotationTypes_name_prime);
		tPackage__tType____allTypes.setName(tPackage__tType____allTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		annotatable2Annotatable__mType____source.setName(annotatable2Annotatable__mType____source_name_prime);
		type2Type__tType____target.setName(type2Type__tType____target_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		return new Object[] { ruleresult, annotatable2Annotatable, tType, mPackage, tPackage, pg, type2Type, mType,
				pg__tType____allTypes, tType__pg____model, type2Type__mType____source,
				annotatable2Annotatable__tType____target, pg__tType____annotationTypes, tPackage__tType____allTypes,
				tType__tPackage____package, annotatable2Annotatable__mType____source, type2Type__tType____target,
				mPackage__mType____ownedElements, mType__mPackage____package };
	}

	public static final void pattern_AnnotationTypeInPackage_1_5_registerobjects_expressionBBBBBBBBBB(
			AnnotationTypeInPackage _this, PerformRuleResult ruleresult, EObject mPackageToTPackage,
			EObject annotatable2Annotatable, EObject tType, EObject mPackage, EObject tPackage, EObject pg,
			EObject type2Type, EObject mType) {
		_this.registerObjects_FWD(ruleresult, mPackageToTPackage, annotatable2Annotatable, tType, mPackage, tPackage,
				pg, type2Type, mType);

	}

	public static final PerformRuleResult pattern_AnnotationTypeInPackage_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_2_1_preparereturnvalue_bindingFB(
			AnnotationTypeInPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationTypeInPackage _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationTypeInPackage _this) {
		Object[] result_pattern_AnnotationTypeInPackage_2_1_preparereturnvalue_binding = pattern_AnnotationTypeInPackage_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeInPackage_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationTypeInPackage_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeInPackage_2_1_preparereturnvalue_black = pattern_AnnotationTypeInPackage_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationTypeInPackage_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationTypeInPackage_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationTypeInPackage";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mPackage");
		EObject _localVariable_1 = match.getObject("mType");
		EObject tmpMPackage = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
			if (tmpMType instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) tmpMType;
				return new Object[] { mPackage, mType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeInPackage_2_2_corematch_blackFBFBB(
			org.eclipse.modisco.java.Package mPackage, AnnotationTypeDeclaration mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mPackage, PackageToTPackage.class, "source")) {
			TPackage tPackage = mPackageToTPackage.getTarget();
			if (tPackage != null) {
				_result.add(new Object[] { mPackageToTPackage, mPackage, tPackage, mType, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeInPackage_2_3_findcontext_blackBBBFB(
			PackageToTPackage mPackageToTPackage, org.eclipse.modisco.java.Package mPackage, TPackage tPackage,
			AnnotationTypeDeclaration mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mPackage.equals(mPackageToTPackage.getSource())) {
			if (mPackage.getOwnedElements().contains(mType)) {
				if (tPackage.equals(mPackageToTPackage.getTarget())) {
					TypeGraph pg = tPackage.getModel();
					if (pg != null) {
						_result.add(new Object[] { mPackageToTPackage, mPackage, tPackage, pg, mType });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_2_3_findcontext_greenBBBBBFFFFFF(
			PackageToTPackage mPackageToTPackage, org.eclipse.modisco.java.Package mPackage, TPackage tPackage,
			TypeGraph pg, AnnotationTypeDeclaration mType) {
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
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(tPackage);
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
		return new Object[] { mPackageToTPackage, mPackage, tPackage, pg, mType, isApplicableMatch,
				tPackage__pg____model, mPackageToTPackage__mPackage____source, mPackage__mType____ownedElements,
				mType__mPackage____package, mPackageToTPackage__tPackage____target };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_2_4_solveCSP_bindingFBBBBBBB(
			AnnotationTypeInPackage _this, IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			org.eclipse.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			AnnotationTypeDeclaration mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mPackageToTPackage, mPackage,
				tPackage, pg, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, mPackage, tPackage, pg, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			AnnotationTypeInPackage _this, IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			org.eclipse.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			AnnotationTypeDeclaration mType) {
		Object[] result_pattern_AnnotationTypeInPackage_2_4_solveCSP_binding = pattern_AnnotationTypeInPackage_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, mPackageToTPackage, mPackage, tPackage, pg, mType);
		if (result_pattern_AnnotationTypeInPackage_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeInPackage_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeInPackage_2_4_solveCSP_black = pattern_AnnotationTypeInPackage_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeInPackage_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, mPackage, tPackage, pg,
						mType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeInPackage_2_5_checkCSP_expressionFBB(
			AnnotationTypeInPackage _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationTypeInPackage";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeInPackage_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_10_1_initialbindings_blackBBBBB(
			AnnotationTypeInPackage _this, Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		return new Object[] { _this, match, tType, tPackage, pg };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_10_2_SolveCSP_bindingFBBBBB(
			AnnotationTypeInPackage _this, Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tType, tPackage, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tType, tPackage, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_10_2_SolveCSP_bindingAndBlackFBBBBB(
			AnnotationTypeInPackage _this, Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		Object[] result_pattern_AnnotationTypeInPackage_10_2_SolveCSP_binding = pattern_AnnotationTypeInPackage_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tType, tPackage, pg);
		if (result_pattern_AnnotationTypeInPackage_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeInPackage_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeInPackage_10_2_SolveCSP_black = pattern_AnnotationTypeInPackage_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeInPackage_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tType, tPackage, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeInPackage_10_3_CheckCSP_expressionFBB(
			AnnotationTypeInPackage _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		return new Object[] { match, tType, tPackage, pg };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_10_4_collectelementstobetranslated_greenBBBBFFFFF(
			Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		EMoflonEdge pg__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____annotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tType);
		String pg__tType____allTypes_name_prime = "allTypes";
		String tType__pg____model_name_prime = "model";
		String pg__tType____annotationTypes_name_prime = "annotationTypes";
		String tPackage__tType____allTypes_name_prime = "allTypes";
		String tType__tPackage____package_name_prime = "package";
		pg__tType____allTypes.setSrc(pg);
		pg__tType____allTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____allTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		match.getToBeTranslatedEdges().add(tType__pg____model);
		pg__tType____annotationTypes.setSrc(pg);
		pg__tType____annotationTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____annotationTypes);
		tPackage__tType____allTypes.setSrc(tPackage);
		tPackage__tType____allTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(tPackage__tType____allTypes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		match.getToBeTranslatedEdges().add(tType__tPackage____package);
		pg__tType____allTypes.setName(pg__tType____allTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		pg__tType____annotationTypes.setName(pg__tType____annotationTypes_name_prime);
		tPackage__tType____allTypes.setName(tPackage__tType____allTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		return new Object[] { match, tType, tPackage, pg, pg__tType____allTypes, tType__pg____model,
				pg__tType____annotationTypes, tPackage__tType____allTypes, tType__tPackage____package };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_10_5_collectcontextelements_blackBBBB(Match match,
			TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		return new Object[] { match, tType, tPackage, pg };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_10_5_collectcontextelements_greenBBBF(Match match,
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

	public static final void pattern_AnnotationTypeInPackage_10_6_registerobjectstomatch_expressionBBBBB(
			AnnotationTypeInPackage _this, Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		_this.registerObjectsToMatch_BWD(match, tType, tPackage, pg);

	}

	public static final boolean pattern_AnnotationTypeInPackage_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeInPackage_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mPackageToTPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("tType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_4 = isApplicableMatch.getObject("pg");
		EObject tmpMPackageToTPackage = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpMPackage = _localVariable_2;
		EObject tmpTPackage = _localVariable_3;
		EObject tmpPg = _localVariable_4;
		if (tmpMPackageToTPackage instanceof PackageToTPackage) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) tmpMPackageToTPackage;
			if (tmpTType instanceof TAnnotationType) {
				TAnnotationType tType = (TAnnotationType) tmpTType;
				if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
					org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
					if (tmpTPackage instanceof TPackage) {
						TPackage tPackage = (TPackage) tmpTPackage;
						if (tmpPg instanceof TypeGraph) {
							TypeGraph pg = (TypeGraph) tmpPg;
							return new Object[] { mPackageToTPackage, tType, mPackage, tPackage, pg,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_11_1_performtransformation_blackBBBBBFBB(
			PackageToTPackage mPackageToTPackage, TAnnotationType tType, org.eclipse.modisco.java.Package mPackage,
			TPackage tPackage, TypeGraph pg, AnnotationTypeInPackage _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mPackageToTPackage, tType, mPackage, tPackage, pg, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			AnnotationTypeInPackage _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationTypeInPackage_11_1_performtransformation_binding = pattern_AnnotationTypeInPackage_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationTypeInPackage_11_1_performtransformation_binding != null) {
			PackageToTPackage mPackageToTPackage = (PackageToTPackage) result_pattern_AnnotationTypeInPackage_11_1_performtransformation_binding[0];
			TAnnotationType tType = (TAnnotationType) result_pattern_AnnotationTypeInPackage_11_1_performtransformation_binding[1];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_AnnotationTypeInPackage_11_1_performtransformation_binding[2];
			TPackage tPackage = (TPackage) result_pattern_AnnotationTypeInPackage_11_1_performtransformation_binding[3];
			TypeGraph pg = (TypeGraph) result_pattern_AnnotationTypeInPackage_11_1_performtransformation_binding[4];

			Object[] result_pattern_AnnotationTypeInPackage_11_1_performtransformation_black = pattern_AnnotationTypeInPackage_11_1_performtransformation_blackBBBBBFBB(
					mPackageToTPackage, tType, mPackage, tPackage, pg, _this, isApplicableMatch);
			if (result_pattern_AnnotationTypeInPackage_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationTypeInPackage_11_1_performtransformation_black[5];

				return new Object[] { mPackageToTPackage, tType, mPackage, tPackage, pg, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_11_1_performtransformation_greenFBBFFB(
			TAnnotationType tType, org.eclipse.modisco.java.Package mPackage, CSP csp) {
		ASTNodeToTAnnotatable annotatable2Annotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType type2Type = PmFactory.eINSTANCE.createTypeToTAbstractType();
		AnnotationTypeDeclaration mType = JavaFactory.eINSTANCE.createAnnotationTypeDeclaration();
		Object _localVariable_0 = csp.getValue("mType", "name");
		Object _localVariable_1 = csp.getValue("mType", "proxy");
		annotatable2Annotatable.setTarget(tType);
		type2Type.setTarget(tType);
		type2Type.setSource(mType);
		annotatable2Annotatable.setSource(mType);
		mPackage.getOwnedElements().add(mType);
		String mType_name_prime = (String) _localVariable_0;
		boolean mType_proxy_prime = (boolean) _localVariable_1;
		mType.setName(mType_name_prime);
		mType.setProxy(Boolean.valueOf(mType_proxy_prime));
		return new Object[] { annotatable2Annotatable, tType, mPackage, type2Type, mType, csp };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_11_2_collecttranslatedelements_blackBBBB(
			ASTNodeToTAnnotatable annotatable2Annotatable, TAnnotationType tType, TypeToTAbstractType type2Type,
			AnnotationTypeDeclaration mType) {
		return new Object[] { annotatable2Annotatable, tType, type2Type, mType };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_11_2_collecttranslatedelements_greenFBBBB(
			ASTNodeToTAnnotatable annotatable2Annotatable, TAnnotationType tType, TypeToTAbstractType type2Type,
			AnnotationTypeDeclaration mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(annotatable2Annotatable);
		ruleresult.getTranslatedElements().add(tType);
		ruleresult.getCreatedLinkElements().add(type2Type);
		ruleresult.getCreatedElements().add(mType);
		return new Object[] { ruleresult, annotatable2Annotatable, tType, type2Type, mType };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_11_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mPackageToTPackage, EObject annotatable2Annotatable, EObject tType,
			EObject mPackage, EObject tPackage, EObject pg, EObject type2Type, EObject mType) {
		if (!mPackageToTPackage.equals(tType)) {
			if (!mPackageToTPackage.equals(tPackage)) {
				if (!mPackageToTPackage.equals(pg)) {
					if (!mPackageToTPackage.equals(type2Type)) {
						if (!mPackageToTPackage.equals(mType)) {
							if (!annotatable2Annotatable.equals(mPackageToTPackage)) {
								if (!annotatable2Annotatable.equals(tType)) {
									if (!annotatable2Annotatable.equals(mPackage)) {
										if (!annotatable2Annotatable.equals(tPackage)) {
											if (!annotatable2Annotatable.equals(pg)) {
												if (!annotatable2Annotatable.equals(type2Type)) {
													if (!annotatable2Annotatable.equals(mType)) {
														if (!tType.equals(type2Type)) {
															if (!mPackage.equals(mPackageToTPackage)) {
																if (!mPackage.equals(tType)) {
																	if (!mPackage.equals(tPackage)) {
																		if (!mPackage.equals(pg)) {
																			if (!mPackage.equals(type2Type)) {
																				if (!mPackage.equals(mType)) {
																					if (!tPackage.equals(tType)) {
																						if (!tPackage
																								.equals(type2Type)) {
																							if (!pg.equals(tType)) {
																								if (!pg.equals(
																										tPackage)) {
																									if (!pg.equals(
																											type2Type)) {
																										if (!mType
																												.equals(tType)) {
																											if (!mType
																													.equals(tPackage)) {
																												if (!mType
																														.equals(pg)) {
																													if (!mType
																															.equals(type2Type)) {
																														return new Object[] {
																																ruleresult,
																																mPackageToTPackage,
																																annotatable2Annotatable,
																																tType,
																																mPackage,
																																tPackage,
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

	public static final Object[] pattern_AnnotationTypeInPackage_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject annotatable2Annotatable, EObject tType, EObject mPackage,
			EObject tPackage, EObject pg, EObject type2Type, EObject mType) {
		EMoflonEdge pg__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type2Type__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotatable2Annotatable__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____annotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotatable2Annotatable__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type2Type__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeInPackage";
		String pg__tType____allTypes_name_prime = "allTypes";
		String tType__pg____model_name_prime = "model";
		String type2Type__mType____source_name_prime = "source";
		String annotatable2Annotatable__tType____target_name_prime = "target";
		String pg__tType____annotationTypes_name_prime = "annotationTypes";
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
		type2Type__mType____source.setSrc(type2Type);
		type2Type__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(type2Type__mType____source);
		annotatable2Annotatable__tType____target.setSrc(annotatable2Annotatable);
		annotatable2Annotatable__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(annotatable2Annotatable__tType____target);
		pg__tType____annotationTypes.setSrc(pg);
		pg__tType____annotationTypes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(pg__tType____annotationTypes);
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
		type2Type__mType____source.setName(type2Type__mType____source_name_prime);
		annotatable2Annotatable__tType____target.setName(annotatable2Annotatable__tType____target_name_prime);
		pg__tType____annotationTypes.setName(pg__tType____annotationTypes_name_prime);
		tPackage__tType____allTypes.setName(tPackage__tType____allTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		annotatable2Annotatable__mType____source.setName(annotatable2Annotatable__mType____source_name_prime);
		type2Type__tType____target.setName(type2Type__tType____target_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		return new Object[] { ruleresult, annotatable2Annotatable, tType, mPackage, tPackage, pg, type2Type, mType,
				pg__tType____allTypes, tType__pg____model, type2Type__mType____source,
				annotatable2Annotatable__tType____target, pg__tType____annotationTypes, tPackage__tType____allTypes,
				tType__tPackage____package, annotatable2Annotatable__mType____source, type2Type__tType____target,
				mPackage__mType____ownedElements, mType__mPackage____package };
	}

	public static final void pattern_AnnotationTypeInPackage_11_5_registerobjects_expressionBBBBBBBBBB(
			AnnotationTypeInPackage _this, PerformRuleResult ruleresult, EObject mPackageToTPackage,
			EObject annotatable2Annotatable, EObject tType, EObject mPackage, EObject tPackage, EObject pg,
			EObject type2Type, EObject mType) {
		_this.registerObjects_BWD(ruleresult, mPackageToTPackage, annotatable2Annotatable, tType, mPackage, tPackage,
				pg, type2Type, mType);

	}

	public static final PerformRuleResult pattern_AnnotationTypeInPackage_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_12_1_preparereturnvalue_bindingFB(
			AnnotationTypeInPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationTypeInPackage _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationTypeInPackage _this) {
		Object[] result_pattern_AnnotationTypeInPackage_12_1_preparereturnvalue_binding = pattern_AnnotationTypeInPackage_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeInPackage_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationTypeInPackage_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeInPackage_12_1_preparereturnvalue_black = pattern_AnnotationTypeInPackage_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationTypeInPackage_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationTypeInPackage_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationTypeInPackage";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tType");
		EObject _localVariable_1 = match.getObject("tPackage");
		EObject _localVariable_2 = match.getObject("pg");
		EObject tmpTType = _localVariable_0;
		EObject tmpTPackage = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		if (tmpTType instanceof TAnnotationType) {
			TAnnotationType tType = (TAnnotationType) tmpTType;
			if (tmpTPackage instanceof TPackage) {
				TPackage tPackage = (TPackage) tmpTPackage;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					return new Object[] { tType, tPackage, pg, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeInPackage_12_2_corematch_blackFBFBBB(
			TAnnotationType tType, TPackage tPackage, TypeGraph pg, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tPackage, PackageToTPackage.class, "target")) {
			org.eclipse.modisco.java.Package mPackage = mPackageToTPackage.getSource();
			if (mPackage != null) {
				_result.add(new Object[] { mPackageToTPackage, tType, mPackage, tPackage, pg, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeInPackage_12_3_findcontext_blackBBBBB(
			PackageToTPackage mPackageToTPackage, TAnnotationType tType, org.eclipse.modisco.java.Package mPackage,
			TPackage tPackage, TypeGraph pg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pg.getAllTypes().contains(tType)) {
			if (pg.equals(tPackage.getModel())) {
				if (mPackage.equals(mPackageToTPackage.getSource())) {
					if (pg.getAnnotationTypes().contains(tType)) {
						if (tPackage.getAllTypes().contains(tType)) {
							if (tPackage.equals(mPackageToTPackage.getTarget())) {
								_result.add(new Object[] { mPackageToTPackage, tType, mPackage, tPackage, pg });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_12_3_findcontext_greenBBBBBFFFFFFFFF(
			PackageToTPackage mPackageToTPackage, TAnnotationType tType, org.eclipse.modisco.java.Package mPackage,
			TPackage tPackage, TypeGraph pg) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pg__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____annotationTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackageToTPackage__tPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pg__tType____allTypes_name_prime = "allTypes";
		String tType__pg____model_name_prime = "model";
		String tPackage__pg____model_name_prime = "model";
		String mPackageToTPackage__mPackage____source_name_prime = "source";
		String pg__tType____annotationTypes_name_prime = "annotationTypes";
		String tPackage__tType____allTypes_name_prime = "allTypes";
		String tType__tPackage____package_name_prime = "package";
		String mPackageToTPackage__tPackage____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(pg);
		pg__tType____allTypes.setSrc(pg);
		pg__tType____allTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____allTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tType__pg____model);
		tPackage__pg____model.setSrc(tPackage);
		tPackage__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tPackage__pg____model);
		mPackageToTPackage__mPackage____source.setSrc(mPackageToTPackage);
		mPackageToTPackage__mPackage____source.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mPackageToTPackage__mPackage____source);
		pg__tType____annotationTypes.setSrc(pg);
		pg__tType____annotationTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____annotationTypes);
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
		tPackage__pg____model.setName(tPackage__pg____model_name_prime);
		mPackageToTPackage__mPackage____source.setName(mPackageToTPackage__mPackage____source_name_prime);
		pg__tType____annotationTypes.setName(pg__tType____annotationTypes_name_prime);
		tPackage__tType____allTypes.setName(tPackage__tType____allTypes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		mPackageToTPackage__tPackage____target.setName(mPackageToTPackage__tPackage____target_name_prime);
		return new Object[] { mPackageToTPackage, tType, mPackage, tPackage, pg, isApplicableMatch,
				pg__tType____allTypes, tType__pg____model, tPackage__pg____model,
				mPackageToTPackage__mPackage____source, pg__tType____annotationTypes, tPackage__tType____allTypes,
				tType__tPackage____package, mPackageToTPackage__tPackage____target };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_12_4_solveCSP_bindingFBBBBBBB(
			AnnotationTypeInPackage _this, IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TAnnotationType tType, org.eclipse.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mPackageToTPackage, tType, mPackage,
				tPackage, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tType, mPackage, tPackage, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			AnnotationTypeInPackage _this, IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			TAnnotationType tType, org.eclipse.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg) {
		Object[] result_pattern_AnnotationTypeInPackage_12_4_solveCSP_binding = pattern_AnnotationTypeInPackage_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, mPackageToTPackage, tType, mPackage, tPackage, pg);
		if (result_pattern_AnnotationTypeInPackage_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeInPackage_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeInPackage_12_4_solveCSP_black = pattern_AnnotationTypeInPackage_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeInPackage_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, tType, mPackage, tPackage,
						pg };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeInPackage_12_5_checkCSP_expressionFBB(
			AnnotationTypeInPackage _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationTypeInPackage";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeInPackage_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_20_1_preparereturnvalue_bindingFB(
			AnnotationTypeInPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationTypeInPackage _this) {
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

	public static final Object[] pattern_AnnotationTypeInPackage_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationTypeInPackage _this) {
		Object[] result_pattern_AnnotationTypeInPackage_20_1_preparereturnvalue_binding = pattern_AnnotationTypeInPackage_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeInPackage_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationTypeInPackage_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeInPackage_20_1_preparereturnvalue_black = pattern_AnnotationTypeInPackage_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationTypeInPackage_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationTypeInPackage_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationTypeInPackage_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_20_2_testcorematchandDECs_black_nac_0BB(
			TAnnotationType tType, TypeGraph pg) {
		for (TypeGraph __DEC_tType_annotationTypes_573620 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "annotationTypes")) {
			if (!pg.equals(__DEC_tType_annotationTypes_573620)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_20_2_testcorematchandDECs_black_nac_1B(
			TAnnotationType tType) {
		TAbstractType __DEC_tType_innerTypes_675463 = tType.getOuterType();
		if (__DEC_tType_innerTypes_675463 != null) {
			if (!tType.equals(__DEC_tType_innerTypes_675463)) {
				return new Object[] { tType };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_20_2_testcorematchandDECs_black_nac_2BB(
			TAnnotationType tType, TPackage tPackage) {
		TPackage __DEC_tType_allTypes_738276 = tType.getPackage();
		if (__DEC_tType_allTypes_738276 != null) {
			if (!tPackage.equals(__DEC_tType_allTypes_738276)) {
				return new Object[] { tType, tPackage };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeInPackage_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_allTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPg = _edge_allTypes.getSrc();
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			EObject tmpTType = _edge_allTypes.getTrg();
			if (tmpTType instanceof TAnnotationType) {
				TAnnotationType tType = (TAnnotationType) tmpTType;
				if (pg.getAllTypes().contains(tType)) {
					if (pg.getAnnotationTypes().contains(tType)) {
						TPackage tPackage = tType.getPackage();
						if (tPackage != null) {
							if (pg.equals(tPackage.getModel())) {
								if (pattern_AnnotationTypeInPackage_20_2_testcorematchandDECs_black_nac_0BB(tType,
										pg) == null) {
									if (pattern_AnnotationTypeInPackage_20_2_testcorematchandDECs_black_nac_1B(
											tType) == null) {
										if (pattern_AnnotationTypeInPackage_20_2_testcorematchandDECs_black_nac_2BB(
												tType, tPackage) == null) {
											_result.add(new Object[] { tType, tPackage, pg, _edge_allTypes });
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

	public static final Object[] pattern_AnnotationTypeInPackage_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationTypeInPackage_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			AnnotationTypeInPackage _this, Match match, TAnnotationType tType, TPackage tPackage, TypeGraph pg) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tType, tPackage, pg);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeInPackage_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationTypeInPackage _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationTypeInPackage_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_21_1_preparereturnvalue_bindingFB(
			AnnotationTypeInPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationTypeInPackage _this) {
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

	public static final Object[] pattern_AnnotationTypeInPackage_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationTypeInPackage _this) {
		Object[] result_pattern_AnnotationTypeInPackage_21_1_preparereturnvalue_binding = pattern_AnnotationTypeInPackage_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeInPackage_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationTypeInPackage_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeInPackage_21_1_preparereturnvalue_black = pattern_AnnotationTypeInPackage_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationTypeInPackage_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationTypeInPackage_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationTypeInPackage_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_21_2_testcorematchandDECs_black_nac_0B(
			AnnotationTypeDeclaration mType) {
		AbstractTypeDeclaration __DEC_mType_abstractTypeDeclaration_874296 = mType.getAbstractTypeDeclaration();
		if (__DEC_mType_abstractTypeDeclaration_874296 != null) {
			if (!mType.equals(__DEC_mType_abstractTypeDeclaration_874296)) {
				return new Object[] { mType };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_21_2_testcorematchandDECs_black_nac_1B(
			AnnotationTypeDeclaration mType) {
		AnonymousClassDeclaration __DEC_mType_anonymousClassDeclarationOwner_42372 = mType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mType_anonymousClassDeclarationOwner_42372 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_21_2_testcorematchandDECs_black_nac_2B(
			AnnotationTypeDeclaration mType) {
		for (Model __DEC_mType_orphanTypes_441885 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, Model.class, "orphanTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_21_2_testcorematchandDECs_black_nac_3B(
			AnnotationTypeDeclaration mType) {
		for (MAbstractMethodDefinition __DEC_mType_mInnerTypes_663739 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeInPackage_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedElements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMPackage = _edge_ownedElements.getSrc();
		if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
			EObject tmpMType = _edge_ownedElements.getTrg();
			if (tmpMType instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) tmpMType;
				if (mPackage.getOwnedElements().contains(mType)) {
					if (pattern_AnnotationTypeInPackage_21_2_testcorematchandDECs_black_nac_0B(mType) == null) {
						if (pattern_AnnotationTypeInPackage_21_2_testcorematchandDECs_black_nac_1B(mType) == null) {
							if (pattern_AnnotationTypeInPackage_21_2_testcorematchandDECs_black_nac_2B(mType) == null) {
								if (pattern_AnnotationTypeInPackage_21_2_testcorematchandDECs_black_nac_3B(
										mType) == null) {
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

	public static final Object[] pattern_AnnotationTypeInPackage_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationTypeInPackage_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			AnnotationTypeInPackage _this, Match match, org.eclipse.modisco.java.Package mPackage,
			AnnotationTypeDeclaration mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mPackage, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeInPackage_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationTypeInPackage _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationTypeInPackage_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_24_1_prepare_blackB(AnnotationTypeInPackage _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_24_2_matchsrctrgcontext_bindingFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tType");
		EObject _localVariable_1 = sourceMatch.getObject("mPackage");
		EObject _localVariable_2 = targetMatch.getObject("tPackage");
		EObject _localVariable_3 = targetMatch.getObject("pg");
		EObject _localVariable_4 = sourceMatch.getObject("mType");
		EObject tmpTType = _localVariable_0;
		EObject tmpMPackage = _localVariable_1;
		EObject tmpTPackage = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		if (tmpTType instanceof TAnnotationType) {
			TAnnotationType tType = (TAnnotationType) tmpTType;
			if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
				org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
				if (tmpTPackage instanceof TPackage) {
					TPackage tPackage = (TPackage) tmpTPackage;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpMType instanceof AnnotationTypeDeclaration) {
							AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) tmpMType;
							return new Object[] { tType, mPackage, tPackage, pg, mType, targetMatch, sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_24_2_matchsrctrgcontext_blackBBBBBBB(
			TAnnotationType tType, org.eclipse.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			AnnotationTypeDeclaration mType, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tType, mPackage, tPackage, pg, mType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationTypeInPackage_24_2_matchsrctrgcontext_binding = pattern_AnnotationTypeInPackage_24_2_matchsrctrgcontext_bindingFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_AnnotationTypeInPackage_24_2_matchsrctrgcontext_binding != null) {
			TAnnotationType tType = (TAnnotationType) result_pattern_AnnotationTypeInPackage_24_2_matchsrctrgcontext_binding[0];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_AnnotationTypeInPackage_24_2_matchsrctrgcontext_binding[1];
			TPackage tPackage = (TPackage) result_pattern_AnnotationTypeInPackage_24_2_matchsrctrgcontext_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_AnnotationTypeInPackage_24_2_matchsrctrgcontext_binding[3];
			AnnotationTypeDeclaration mType = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeInPackage_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_AnnotationTypeInPackage_24_2_matchsrctrgcontext_black = pattern_AnnotationTypeInPackage_24_2_matchsrctrgcontext_blackBBBBBBB(
					tType, mPackage, tPackage, pg, mType, sourceMatch, targetMatch);
			if (result_pattern_AnnotationTypeInPackage_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tType, mPackage, tPackage, pg, mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_24_3_solvecsp_bindingFBBBBBBBB(
			AnnotationTypeInPackage _this, TAnnotationType tType, org.eclipse.modisco.java.Package mPackage,
			TPackage tPackage, TypeGraph pg, AnnotationTypeDeclaration mType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(tType, mPackage, tPackage, pg, mType, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, tType, mPackage, tPackage, pg, mType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			AnnotationTypeInPackage _this, TAnnotationType tType, org.eclipse.modisco.java.Package mPackage,
			TPackage tPackage, TypeGraph pg, AnnotationTypeDeclaration mType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationTypeInPackage_24_3_solvecsp_binding = pattern_AnnotationTypeInPackage_24_3_solvecsp_bindingFBBBBBBBB(
				_this, tType, mPackage, tPackage, pg, mType, sourceMatch, targetMatch);
		if (result_pattern_AnnotationTypeInPackage_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeInPackage_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnnotationTypeInPackage_24_3_solvecsp_black = pattern_AnnotationTypeInPackage_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnnotationTypeInPackage_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tType, mPackage, tPackage, pg, mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeInPackage_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeInPackage_24_5_matchcorrcontext_blackFBBBB(
			org.eclipse.modisco.java.Package mPackage, TPackage tPackage, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (PackageToTPackage mPackageToTPackage : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mPackage, PackageToTPackage.class, "source")) {
				if (tPackage.equals(mPackageToTPackage.getTarget())) {
					_result.add(new Object[] { mPackageToTPackage, mPackage, tPackage, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_24_5_matchcorrcontext_greenBBBF(
			PackageToTPackage mPackageToTPackage, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnnotationTypeInPackage";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mPackageToTPackage);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mPackageToTPackage, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_24_6_createcorrespondence_blackBBBBBB(
			TAnnotationType tType, org.eclipse.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			AnnotationTypeDeclaration mType, CCMatch ccMatch) {
		return new Object[] { tType, mPackage, tPackage, pg, mType, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_24_6_createcorrespondence_greenFBFBB(
			TAnnotationType tType, AnnotationTypeDeclaration mType, CCMatch ccMatch) {
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

	public static final Object[] pattern_AnnotationTypeInPackage_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnnotationTypeInPackage";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeInPackage_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_27_1_matchtggpattern_black_nac_0B(
			AnnotationTypeDeclaration mType) {
		AbstractTypeDeclaration __DEC_mType_abstractTypeDeclaration_247787 = mType.getAbstractTypeDeclaration();
		if (__DEC_mType_abstractTypeDeclaration_247787 != null) {
			if (!mType.equals(__DEC_mType_abstractTypeDeclaration_247787)) {
				return new Object[] { mType };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_27_1_matchtggpattern_black_nac_1B(
			AnnotationTypeDeclaration mType) {
		AnonymousClassDeclaration __DEC_mType_anonymousClassDeclarationOwner_253943 = mType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mType_anonymousClassDeclarationOwner_253943 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_27_1_matchtggpattern_black_nac_2B(
			AnnotationTypeDeclaration mType) {
		for (Model __DEC_mType_orphanTypes_105205 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, Model.class, "orphanTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_27_1_matchtggpattern_black_nac_3B(
			AnnotationTypeDeclaration mType) {
		for (MAbstractMethodDefinition __DEC_mType_mInnerTypes_467932 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_27_1_matchtggpattern_blackBB(
			org.eclipse.modisco.java.Package mPackage, AnnotationTypeDeclaration mType) {
		if (mPackage.getOwnedElements().contains(mType)) {
			if (pattern_AnnotationTypeInPackage_27_1_matchtggpattern_black_nac_0B(mType) == null) {
				if (pattern_AnnotationTypeInPackage_27_1_matchtggpattern_black_nac_1B(mType) == null) {
					if (pattern_AnnotationTypeInPackage_27_1_matchtggpattern_black_nac_2B(mType) == null) {
						if (pattern_AnnotationTypeInPackage_27_1_matchtggpattern_black_nac_3B(mType) == null) {
							return new Object[] { mPackage, mType };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeInPackage_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeInPackage_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_28_1_matchtggpattern_black_nac_0BB(
			TAnnotationType tType, TypeGraph pg) {
		for (TypeGraph __DEC_tType_annotationTypes_963011 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "annotationTypes")) {
			if (!pg.equals(__DEC_tType_annotationTypes_963011)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_28_1_matchtggpattern_black_nac_1B(
			TAnnotationType tType) {
		TAbstractType __DEC_tType_innerTypes_718431 = tType.getOuterType();
		if (__DEC_tType_innerTypes_718431 != null) {
			if (!tType.equals(__DEC_tType_innerTypes_718431)) {
				return new Object[] { tType };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_28_1_matchtggpattern_black_nac_2BB(
			TAnnotationType tType, TPackage tPackage) {
		TPackage __DEC_tType_allTypes_747488 = tType.getPackage();
		if (__DEC_tType_allTypes_747488 != null) {
			if (!tPackage.equals(__DEC_tType_allTypes_747488)) {
				return new Object[] { tType, tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_28_1_matchtggpattern_blackBBB(TAnnotationType tType,
			TPackage tPackage, TypeGraph pg) {
		if (pg.getAllTypes().contains(tType)) {
			if (pg.equals(tPackage.getModel())) {
				if (pg.getAnnotationTypes().contains(tType)) {
					if (tPackage.getAllTypes().contains(tType)) {
						if (pattern_AnnotationTypeInPackage_28_1_matchtggpattern_black_nac_0BB(tType, pg) == null) {
							if (pattern_AnnotationTypeInPackage_28_1_matchtggpattern_black_nac_1B(tType) == null) {
								if (pattern_AnnotationTypeInPackage_28_1_matchtggpattern_black_nac_2BB(tType,
										tPackage) == null) {
									return new Object[] { tType, tPackage, pg };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeInPackage_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeInPackage_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_29_1_createresult_blackB(
			AnnotationTypeInPackage _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, PackageToTPackage mPackageToTPackage) {
		if (ruleResult.getCorrObjects().contains(mPackageToTPackage)) {
			return new Object[] { ruleResult, mPackageToTPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.modisco.java.Package mPackage) {
		if (ruleResult.getSourceObjects().contains(mPackage)) {
			return new Object[] { ruleResult, mPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TPackage tPackage) {
		if (ruleResult.getTargetObjects().contains(tPackage)) {
			return new Object[] { ruleResult, tPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeInPackage_29_2_isapplicablecore_blackFFFFFBB(
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
								if (pattern_AnnotationTypeInPackage_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										mPackageToTPackage) == null) {
									if (pattern_AnnotationTypeInPackage_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mPackage) == null) {
										if (pattern_AnnotationTypeInPackage_29_2_isapplicablecore_black_nac_2BB(
												ruleResult, tPackage) == null) {
											if (pattern_AnnotationTypeInPackage_29_2_isapplicablecore_black_nac_3BB(
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

	public static final Object[] pattern_AnnotationTypeInPackage_29_3_solveCSP_bindingFBBBBBBB(
			AnnotationTypeInPackage _this, IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			org.eclipse.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mPackageToTPackage, mPackage,
				tPackage, pg, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, mPackage, tPackage, pg,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_29_3_solveCSP_bindingAndBlackFBBBBBBB(
			AnnotationTypeInPackage _this, IsApplicableMatch isApplicableMatch, PackageToTPackage mPackageToTPackage,
			org.eclipse.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnnotationTypeInPackage_29_3_solveCSP_binding = pattern_AnnotationTypeInPackage_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, mPackageToTPackage, mPackage, tPackage, pg, ruleResult);
		if (result_pattern_AnnotationTypeInPackage_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeInPackage_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeInPackage_29_3_solveCSP_black = pattern_AnnotationTypeInPackage_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeInPackage_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackageToTPackage, mPackage, tPackage, pg,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeInPackage_29_4_checkCSP_expressionFBB(
			AnnotationTypeInPackage _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeInPackage_29_5_checknacs_blackBBBB(
			PackageToTPackage mPackageToTPackage, org.eclipse.modisco.java.Package mPackage, TPackage tPackage,
			TypeGraph pg) {
		return new Object[] { mPackageToTPackage, mPackage, tPackage, pg };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_29_6_perform_blackBBBBB(
			PackageToTPackage mPackageToTPackage, org.eclipse.modisco.java.Package mPackage, TPackage tPackage,
			TypeGraph pg, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mPackageToTPackage, mPackage, tPackage, pg, ruleResult };
	}

	public static final Object[] pattern_AnnotationTypeInPackage_29_6_perform_greenFFBBBFFBB(
			org.eclipse.modisco.java.Package mPackage, TPackage tPackage, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		ASTNodeToTAnnotatable annotatable2Annotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TAnnotationType tType = AnnotationsFactory.eINSTANCE.createTAnnotationType();
		TypeToTAbstractType type2Type = PmFactory.eINSTANCE.createTypeToTAbstractType();
		AnnotationTypeDeclaration mType = JavaFactory.eINSTANCE.createAnnotationTypeDeclaration();
		Object _localVariable_0 = csp.getValue("tType", "tName");
		Object _localVariable_1 = csp.getValue("tType", "tLib");
		Object _localVariable_2 = csp.getValue("mType", "name");
		Object _localVariable_3 = csp.getValue("mType", "proxy");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(annotatable2Annotatable);
		pg.getAllTypes().add(tType);
		annotatable2Annotatable.setTarget(tType);
		pg.getAnnotationTypes().add(tType);
		tPackage.getAllTypes().add(tType);
		ruleResult.getTargetObjects().add(tType);
		type2Type.setTarget(tType);
		ruleResult.getCorrObjects().add(type2Type);
		type2Type.setSource(mType);
		annotatable2Annotatable.setSource(mType);
		mPackage.getOwnedElements().add(mType);
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
		return new Object[] { annotatable2Annotatable, tType, mPackage, tPackage, pg, type2Type, mType, ruleResult,
				csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationTypeInPackage_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationTypeInPackageImpl
