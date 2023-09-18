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
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.Type;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MGravityModel;

import org.gravity.tgg.modisco.pm.ModelToTypeGraph;
import org.gravity.tgg.modisco.pm.PackageToTPackage;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.RulesPackage;
import org.gravity.tgg.modisco.pm.Rules.TypeParameter;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

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
 * An implementation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypeParameterImpl extends AbstractRuleImpl implements TypeParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTypeParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MGravityModel model,
			org.eclipse.modisco.java.TypeParameter typeParameter, org.eclipse.modisco.java.Package java,
			ClassDeclaration object, org.eclipse.modisco.java.Package lang) {

		Object[] result1_black = TypeParameterImpl.pattern_TypeParameter_0_1_initialbindings_blackBBBBBBB(this, match,
				model, typeParameter, java, object, lang);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[model] = " + model + ", " + "[typeParameter] = " + typeParameter
					+ ", " + "[java] = " + java + ", " + "[object] = " + object + ", " + "[lang] = " + lang + ".");
		}

		Object[] result2_bindingAndBlack = TypeParameterImpl.pattern_TypeParameter_0_2_SolveCSP_bindingAndBlackFBBBBBBB(
				this, match, model, typeParameter, java, object, lang);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[model] = " + model + ", " + "[typeParameter] = " + typeParameter
					+ ", " + "[java] = " + java + ", " + "[object] = " + object + ", " + "[lang] = " + lang + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeParameterImpl.pattern_TypeParameter_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeParameterImpl
					.pattern_TypeParameter_0_4_collectelementstobetranslated_blackBBBBBB(match, model, typeParameter,
							java, object, lang);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[model] = " + model + ", " + "[typeParameter] = " + typeParameter + ", " + "[java] = " + java
						+ ", " + "[object] = " + object + ", " + "[lang] = " + lang + ".");
			}
			TypeParameterImpl.pattern_TypeParameter_0_4_collectelementstobetranslated_greenBBBF(match, model,
					typeParameter);
			//nothing EMoflonEdge model__typeParameter____typeParameters = (EMoflonEdge) result4_green[3];

			Object[] result5_black = TypeParameterImpl.pattern_TypeParameter_0_5_collectcontextelements_blackBBBBBB(
					match, model, typeParameter, java, object, lang);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[model] = " + model + ", " + "[typeParameter] = " + typeParameter + ", " + "[java] = " + java
						+ ", " + "[object] = " + object + ", " + "[lang] = " + lang + ".");
			}
			TypeParameterImpl.pattern_TypeParameter_0_5_collectcontextelements_greenBBBBBFFFFFF(match, model, java,
					object, lang);
			//nothing EMoflonEdge model__java____ownedElements = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge java__model____model = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge java__lang____ownedPackages = (EMoflonEdge) result5_green[7];
			//nothing EMoflonEdge lang__java____package = (EMoflonEdge) result5_green[8];
			//nothing EMoflonEdge lang__object____ownedElements = (EMoflonEdge) result5_green[9];
			//nothing EMoflonEdge object__lang____package = (EMoflonEdge) result5_green[10];

			// 
			TypeParameterImpl.pattern_TypeParameter_0_6_registerobjectstomatch_expressionBBBBBBB(this, match, model,
					typeParameter, java, object, lang);
			return TypeParameterImpl.pattern_TypeParameter_0_7_expressionF();
		} else {
			return TypeParameterImpl.pattern_TypeParameter_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeParameterImpl
				.pattern_TypeParameter_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MGravityModel model = (MGravityModel) result1_bindingAndBlack[0];
		TPackage tPackageLang = (TPackage) result1_bindingAndBlack[1];
		PackageToTPackage javaToJava = (PackageToTPackage) result1_bindingAndBlack[2];
		org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) result1_bindingAndBlack[3];
		TypeToTAbstractType objectToObject = (TypeToTAbstractType) result1_bindingAndBlack[4];
		org.eclipse.modisco.java.Package java = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[5];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[6];
		ClassDeclaration object = (ClassDeclaration) result1_bindingAndBlack[7];
		ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result1_bindingAndBlack[8];
		TClass tClass = (TClass) result1_bindingAndBlack[9];
		org.eclipse.modisco.java.Package lang = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[10];
		PackageToTPackage langToLang = (PackageToTPackage) result1_bindingAndBlack[11];
		TPackage tPackageJava = (TPackage) result1_bindingAndBlack[12];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[13];
		Object[] result1_green = TypeParameterImpl
				.pattern_TypeParameter_1_1_performtransformation_greenBFB(typeParameter, tClass);
		TypeToTAbstractType templateTypeToTClass = (TypeToTAbstractType) result1_green[1];

		Object[] result2_black = TypeParameterImpl
				.pattern_TypeParameter_1_2_collecttranslatedelements_blackBB(typeParameter, templateTypeToTClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[typeParameter] = "
					+ typeParameter + ", " + "[templateTypeToTClass] = " + templateTypeToTClass + ".");
		}
		Object[] result2_green = TypeParameterImpl
				.pattern_TypeParameter_1_2_collecttranslatedelements_greenFBB(typeParameter, templateTypeToTClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeParameterImpl.pattern_TypeParameter_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(
				ruleresult, model, tPackageLang, javaToJava, typeParameter, objectToObject, java, templateTypeToTClass,
				pg, object, eModelToPg, tClass, lang, langToLang, tPackageJava);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[model] = " + model + ", " + "[tPackageLang] = " + tPackageLang + ", " + "[javaToJava] = "
					+ javaToJava + ", " + "[typeParameter] = " + typeParameter + ", " + "[objectToObject] = "
					+ objectToObject + ", " + "[java] = " + java + ", " + "[templateTypeToTClass] = "
					+ templateTypeToTClass + ", " + "[pg] = " + pg + ", " + "[object] = " + object + ", "
					+ "[eModelToPg] = " + eModelToPg + ", " + "[tClass] = " + tClass + ", " + "[lang] = " + lang + ", "
					+ "[langToLang] = " + langToLang + ", " + "[tPackageJava] = " + tPackageJava + ".");
		}
		TypeParameterImpl.pattern_TypeParameter_1_3_bookkeepingforedges_greenBBBBBFFF(ruleresult, model, typeParameter,
				templateTypeToTClass, tClass);
		//nothing EMoflonEdge model__typeParameter____typeParameters = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge templateTypeToTClass__typeParameter____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge templateTypeToTClass__tClass____target = (EMoflonEdge) result3_green[7];

		// 
		// 
		TypeParameterImpl.pattern_TypeParameter_1_5_registerobjects_expressionBBBBBBBBBBBBBBBB(this, ruleresult, model,
				tPackageLang, javaToJava, typeParameter, objectToObject, java, templateTypeToTClass, pg, object,
				eModelToPg, tClass, lang, langToLang, tPackageJava);
		return TypeParameterImpl.pattern_TypeParameter_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = TypeParameterImpl
				.pattern_TypeParameter_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeParameterImpl
				.pattern_TypeParameter_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeParameterImpl.pattern_TypeParameter_2_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MGravityModel model = (MGravityModel) result2_binding[0];
		org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) result2_binding[1];
		org.eclipse.modisco.java.Package java = (org.eclipse.modisco.java.Package) result2_binding[2];
		ClassDeclaration object = (ClassDeclaration) result2_binding[3];
		org.eclipse.modisco.java.Package lang = (org.eclipse.modisco.java.Package) result2_binding[4];
		for (Object[] result2_black : TypeParameterImpl.pattern_TypeParameter_2_2_corematch_blackBFFBFBFBFFBFFB(model,
				typeParameter, java, object, lang, match)) {
			TPackage tPackageLang = (TPackage) result2_black[1];
			PackageToTPackage javaToJava = (PackageToTPackage) result2_black[2];
			TypeToTAbstractType objectToObject = (TypeToTAbstractType) result2_black[4];
			TypeGraph pg = (TypeGraph) result2_black[6];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[8];
			TClass tClass = (TClass) result2_black[9];
			PackageToTPackage langToLang = (PackageToTPackage) result2_black[11];
			TPackage tPackageJava = (TPackage) result2_black[12];
			// ForEach 
			for (Object[] result3_black : TypeParameterImpl.pattern_TypeParameter_2_3_findcontext_blackBBBBBBBBBBBBB(
					model, tPackageLang, javaToJava, typeParameter, objectToObject, java, pg, object, eModelToPg,
					tClass, lang, langToLang, tPackageJava)) {
				Object[] result3_green = TypeParameterImpl
						.pattern_TypeParameter_2_3_findcontext_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(model,
								tPackageLang, javaToJava, typeParameter, objectToObject, java, pg, object, eModelToPg,
								tClass, lang, langToLang, tPackageJava);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[13];
				//nothing EMoflonEdge model__typeParameter____typeParameters = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge model__java____ownedElements = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge java__model____model = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge java__lang____ownedPackages = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge lang__java____package = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge pg__tPackageJava____packages = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge objectToObject__object____source = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge eModelToPg__pg____target = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge objectToObject__tClass____target = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge langToLang__lang____source = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge tPackageLang__tClass____classes = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge tPackageJava__tPackageLang____subpackages = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge tPackageLang__tPackageJava____parent = (EMoflonEdge) result3_green[26];
				//nothing EMoflonEdge javaToJava__java____source = (EMoflonEdge) result3_green[27];
				//nothing EMoflonEdge lang__object____ownedElements = (EMoflonEdge) result3_green[28];
				//nothing EMoflonEdge object__lang____package = (EMoflonEdge) result3_green[29];
				//nothing EMoflonEdge javaToJava__tPackageJava____target = (EMoflonEdge) result3_green[30];
				//nothing EMoflonEdge eModelToPg__model____source = (EMoflonEdge) result3_green[31];
				//nothing EMoflonEdge langToLang__tPackageLang____target = (EMoflonEdge) result3_green[32];

				Object[] result4_bindingAndBlack = TypeParameterImpl
						.pattern_TypeParameter_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBB(this, isApplicableMatch,
								model, tPackageLang, javaToJava, typeParameter, objectToObject, java, pg, object,
								eModelToPg, tClass, lang, langToLang, tPackageJava);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ", "
							+ "[tPackageLang] = " + tPackageLang + ", " + "[javaToJava] = " + javaToJava + ", "
							+ "[typeParameter] = " + typeParameter + ", " + "[objectToObject] = " + objectToObject
							+ ", " + "[java] = " + java + ", " + "[pg] = " + pg + ", " + "[object] = " + object + ", "
							+ "[eModelToPg] = " + eModelToPg + ", " + "[tClass] = " + tClass + ", " + "[lang] = " + lang
							+ ", " + "[langToLang] = " + langToLang + ", " + "[tPackageJava] = " + tPackageJava + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeParameterImpl.pattern_TypeParameter_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeParameterImpl
							.pattern_TypeParameter_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeParameterImpl.pattern_TypeParameter_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return TypeParameterImpl.pattern_TypeParameter_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MGravityModel model,
			org.eclipse.modisco.java.TypeParameter typeParameter, org.eclipse.modisco.java.Package java,
			ClassDeclaration object, org.eclipse.modisco.java.Package lang) {
		match.registerObject("model", model);
		match.registerObject("typeParameter", typeParameter);
		match.registerObject("java", java);
		match.registerObject("object", object);
		match.registerObject("lang", lang);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MGravityModel model,
			org.eclipse.modisco.java.TypeParameter typeParameter, org.eclipse.modisco.java.Package java,
			ClassDeclaration object, org.eclipse.modisco.java.Package lang) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MGravityModel model,
			TPackage tPackageLang, PackageToTPackage javaToJava, org.eclipse.modisco.java.TypeParameter typeParameter,
			TypeToTAbstractType objectToObject, org.eclipse.modisco.java.Package java, TypeGraph pg,
			ClassDeclaration object, ModelToTypeGraph eModelToPg, TClass tClass, org.eclipse.modisco.java.Package lang,
			PackageToTPackage langToLang, TPackage tPackageJava) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("tPackageLang", tPackageLang);
		isApplicableMatch.registerObject("javaToJava", javaToJava);
		isApplicableMatch.registerObject("typeParameter", typeParameter);
		isApplicableMatch.registerObject("objectToObject", objectToObject);
		isApplicableMatch.registerObject("java", java);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("object", object);
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("lang", lang);
		isApplicableMatch.registerObject("langToLang", langToLang);
		isApplicableMatch.registerObject("tPackageJava", tPackageJava);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject model, EObject tPackageLang,
			EObject javaToJava, EObject typeParameter, EObject objectToObject, EObject java,
			EObject templateTypeToTClass, EObject pg, EObject object, EObject eModelToPg, EObject tClass, EObject lang,
			EObject langToLang, EObject tPackageJava) {
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("tPackageLang", tPackageLang);
		ruleresult.registerObject("javaToJava", javaToJava);
		ruleresult.registerObject("typeParameter", typeParameter);
		ruleresult.registerObject("objectToObject", objectToObject);
		ruleresult.registerObject("java", java);
		ruleresult.registerObject("templateTypeToTClass", templateTypeToTClass);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("object", object);
		ruleresult.registerObject("eModelToPg", eModelToPg);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("lang", lang);
		ruleresult.registerObject("langToLang", langToLang);
		ruleresult.registerObject("tPackageJava", tPackageJava);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("typeParameter").eClass())
				.equals("java.TypeParameter.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TPackage tPackageLang, TypeGraph pg, TClass tClass,
			TPackage tPackageJava) {

		Object[] result1_black = TypeParameterImpl.pattern_TypeParameter_10_1_initialbindings_blackBBBBBB(this, match,
				tPackageLang, pg, tClass, tPackageJava);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tPackageLang] = " + tPackageLang + ", " + "[pg] = " + pg + ", "
					+ "[tClass] = " + tClass + ", " + "[tPackageJava] = " + tPackageJava + ".");
		}

		Object[] result2_bindingAndBlack = TypeParameterImpl.pattern_TypeParameter_10_2_SolveCSP_bindingAndBlackFBBBBBB(
				this, match, tPackageLang, pg, tClass, tPackageJava);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tPackageLang] = " + tPackageLang + ", " + "[pg] = " + pg + ", "
					+ "[tClass] = " + tClass + ", " + "[tPackageJava] = " + tPackageJava + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeParameterImpl.pattern_TypeParameter_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeParameterImpl
					.pattern_TypeParameter_10_4_collectelementstobetranslated_blackBBBBB(match, tPackageLang, pg,
							tClass, tPackageJava);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPackageLang] = " + tPackageLang + ", " + "[pg] = " + pg + ", " + "[tClass] = " + tClass
						+ ", " + "[tPackageJava] = " + tPackageJava + ".");
			}

			Object[] result5_black = TypeParameterImpl.pattern_TypeParameter_10_5_collectcontextelements_blackBBBBB(
					match, tPackageLang, pg, tClass, tPackageJava);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPackageLang] = " + tPackageLang + ", " + "[pg] = " + pg + ", " + "[tClass] = " + tClass
						+ ", " + "[tPackageJava] = " + tPackageJava + ".");
			}
			TypeParameterImpl.pattern_TypeParameter_10_5_collectcontextelements_greenBBBBBFFFF(match, tPackageLang, pg,
					tClass, tPackageJava);
			//nothing EMoflonEdge pg__tPackageJava____packages = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge tPackageLang__tClass____classes = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge tPackageJava__tPackageLang____subpackages = (EMoflonEdge) result5_green[7];
			//nothing EMoflonEdge tPackageLang__tPackageJava____parent = (EMoflonEdge) result5_green[8];

			// 
			TypeParameterImpl.pattern_TypeParameter_10_6_registerobjectstomatch_expressionBBBBBB(this, match,
					tPackageLang, pg, tClass, tPackageJava);
			return TypeParameterImpl.pattern_TypeParameter_10_7_expressionF();
		} else {
			return TypeParameterImpl.pattern_TypeParameter_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TPackage tPackageLang, TypeGraph pg, TClass tClass,
			TPackage tPackageJava) {
		match.registerObject("tPackageLang", tPackageLang);
		match.registerObject("pg", pg);
		match.registerObject("tClass", tClass);
		match.registerObject("tPackageJava", tPackageJava);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TPackage tPackageLang, TypeGraph pg, TClass tClass,
			TPackage tPackageJava) {// Create CSP
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
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_TPackage_0(TPackage tPackageLang) {

		Object[] result1_bindingAndBlack = TypeParameterImpl
				.pattern_TypeParameter_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeParameterImpl.pattern_TypeParameter_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeParameterImpl
				.pattern_TypeParameter_17_2_testcorematchandDECs_blackBFFF(tPackageLang)) {
			TypeGraph pg = (TypeGraph) result2_black[1];
			TClass tClass = (TClass) result2_black[2];
			TPackage tPackageJava = (TPackage) result2_black[3];
			Object[] result2_green = TypeParameterImpl
					.pattern_TypeParameter_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeParameterImpl
					.pattern_TypeParameter_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this, match,
							tPackageLang, pg, tClass, tPackageJava)) {
				// 
				if (TypeParameterImpl
						.pattern_TypeParameter_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = TypeParameterImpl
							.pattern_TypeParameter_17_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeParameterImpl.pattern_TypeParameter_17_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeParameterImpl.pattern_TypeParameter_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_63(EMoflonEdge _edge_typeParameters) {

		Object[] result1_bindingAndBlack = TypeParameterImpl
				.pattern_TypeParameter_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeParameterImpl.pattern_TypeParameter_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeParameterImpl
				.pattern_TypeParameter_18_2_testcorematchandDECs_blackFFFFFB(_edge_typeParameters)) {
			MGravityModel model = (MGravityModel) result2_black[0];
			org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) result2_black[1];
			org.eclipse.modisco.java.Package java = (org.eclipse.modisco.java.Package) result2_black[2];
			ClassDeclaration object = (ClassDeclaration) result2_black[3];
			org.eclipse.modisco.java.Package lang = (org.eclipse.modisco.java.Package) result2_black[4];
			Object[] result2_green = TypeParameterImpl
					.pattern_TypeParameter_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeParameterImpl
					.pattern_TypeParameter_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, model, typeParameter, java, object, lang)) {
				// 
				if (TypeParameterImpl
						.pattern_TypeParameter_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = TypeParameterImpl
							.pattern_TypeParameter_18_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeParameterImpl.pattern_TypeParameter_18_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeParameterImpl.pattern_TypeParameter_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TypeParameter");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tPackageLang", "tName", "lang", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("object", "name", "Object", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tClass", "tName", "Object", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tPackageJava", "tName", "java", ComparingOperator.EQUAL)) {
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
		ruleResult.setRule("TypeParameter");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tPackageLang", "tName", "lang", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("object", "name", "Object", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tClass", "tName", "Object", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tPackageJava", "tName", "java", ComparingOperator.EQUAL)) {
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

		Object[] result1_black = TypeParameterImpl.pattern_TypeParameter_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeParameterImpl.pattern_TypeParameter_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = TypeParameterImpl
				.pattern_TypeParameter_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MGravityModel model = (MGravityModel) result2_bindingAndBlack[0];
		TPackage tPackageLang = (TPackage) result2_bindingAndBlack[1];
		org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) result2_bindingAndBlack[2];
		org.eclipse.modisco.java.Package java = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[3];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[4];
		ClassDeclaration object = (ClassDeclaration) result2_bindingAndBlack[5];
		TClass tClass = (TClass) result2_bindingAndBlack[6];
		org.eclipse.modisco.java.Package lang = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[7];
		TPackage tPackageJava = (TPackage) result2_bindingAndBlack[8];

		Object[] result3_bindingAndBlack = TypeParameterImpl
				.pattern_TypeParameter_21_3_solvecsp_bindingAndBlackFBBBBBBBBBBBB(this, model, tPackageLang,
						typeParameter, java, pg, object, tClass, lang, tPackageJava, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[model] = " + model + ", " + "[tPackageLang] = " + tPackageLang + ", " + "[typeParameter] = "
					+ typeParameter + ", " + "[java] = " + java + ", " + "[pg] = " + pg + ", " + "[object] = " + object
					+ ", " + "[tClass] = " + tClass + ", " + "[lang] = " + lang + ", " + "[tPackageJava] = "
					+ tPackageJava + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypeParameterImpl.pattern_TypeParameter_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypeParameterImpl
					.pattern_TypeParameter_21_5_matchcorrcontext_blackBBFFBBBFBBFBBB(model, tPackageLang, java, pg,
							object, tClass, lang, tPackageJava, sourceMatch, targetMatch)) {
				PackageToTPackage javaToJava = (PackageToTPackage) result5_black[2];
				TypeToTAbstractType objectToObject = (TypeToTAbstractType) result5_black[3];
				ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result5_black[7];
				PackageToTPackage langToLang = (PackageToTPackage) result5_black[10];
				Object[] result5_green = TypeParameterImpl.pattern_TypeParameter_21_5_matchcorrcontext_greenBBBBBBF(
						javaToJava, objectToObject, eModelToPg, langToLang, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[6];

				Object[] result6_black = TypeParameterImpl
						.pattern_TypeParameter_21_6_createcorrespondence_blackBBBBBBBBBB(model, tPackageLang,
								typeParameter, java, pg, object, tClass, lang, tPackageJava, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model] = " + model + ", "
							+ "[tPackageLang] = " + tPackageLang + ", " + "[typeParameter] = " + typeParameter + ", "
							+ "[java] = " + java + ", " + "[pg] = " + pg + ", " + "[object] = " + object + ", "
							+ "[tClass] = " + tClass + ", " + "[lang] = " + lang + ", " + "[tPackageJava] = "
							+ tPackageJava + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeParameterImpl.pattern_TypeParameter_21_6_createcorrespondence_greenBFBB(typeParameter, tClass,
						ccMatch);
				//nothing TypeToTAbstractType templateTypeToTClass = (TypeToTAbstractType) result6_green[1];

				Object[] result7_black = TypeParameterImpl
						.pattern_TypeParameter_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeParameterImpl.pattern_TypeParameter_21_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return TypeParameterImpl.pattern_TypeParameter_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MGravityModel model, TPackage tPackageLang,
			org.eclipse.modisco.java.TypeParameter typeParameter, org.eclipse.modisco.java.Package java, TypeGraph pg,
			ClassDeclaration object, TClass tClass, org.eclipse.modisco.java.Package lang, TPackage tPackageJava,
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
	public boolean checkDEC_FWD(MGravityModel model, org.eclipse.modisco.java.TypeParameter typeParameter,
			org.eclipse.modisco.java.Package java, ClassDeclaration object, org.eclipse.modisco.java.Package lang) {// 
		Object[] result1_black = TypeParameterImpl.pattern_TypeParameter_24_1_matchtggpattern_blackBBBBB(model,
				typeParameter, java, object, lang);
		if (result1_black != null) {
			return TypeParameterImpl.pattern_TypeParameter_24_2_expressionF();
		} else {
			return TypeParameterImpl.pattern_TypeParameter_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TPackage tPackageLang, TypeGraph pg, TClass tClass, TPackage tPackageJava) {// 
		Object[] result1_black = TypeParameterImpl.pattern_TypeParameter_25_1_matchtggpattern_blackBBBB(tPackageLang,
				pg, tClass, tPackageJava);
		if (result1_black != null) {
			return TypeParameterImpl.pattern_TypeParameter_25_2_expressionF();
		} else {
			return TypeParameterImpl.pattern_TypeParameter_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType objectToObjectParameter) {

		Object[] result1_black = TypeParameterImpl.pattern_TypeParameter_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeParameterImpl.pattern_TypeParameter_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : TypeParameterImpl
				.pattern_TypeParameter_26_2_isapplicablecore_blackFFFFFFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList objectToObjectList = (RuleEntryList) result2_black[0];
			MGravityModel model = (MGravityModel) result2_black[1];
			org.eclipse.modisco.java.Package java = (org.eclipse.modisco.java.Package) result2_black[2];
			org.eclipse.modisco.java.Package lang = (org.eclipse.modisco.java.Package) result2_black[3];
			ClassDeclaration object = (ClassDeclaration) result2_black[4];
			TypeToTAbstractType objectToObject = (TypeToTAbstractType) result2_black[5];
			TClass tClass = (TClass) result2_black[6];
			TPackage tPackageLang = (TPackage) result2_black[7];
			TPackage tPackageJava = (TPackage) result2_black[8];
			TypeGraph pg = (TypeGraph) result2_black[9];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[10];
			PackageToTPackage javaToJava = (PackageToTPackage) result2_black[11];
			PackageToTPackage langToLang = (PackageToTPackage) result2_black[12];

			Object[] result3_bindingAndBlack = TypeParameterImpl
					.pattern_TypeParameter_26_3_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBB(this, isApplicableMatch, model,
							tPackageLang, javaToJava, objectToObject, java, pg, object, eModelToPg, tClass, lang,
							langToLang, tPackageJava, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ", "
						+ "[tPackageLang] = " + tPackageLang + ", " + "[javaToJava] = " + javaToJava + ", "
						+ "[objectToObject] = " + objectToObject + ", " + "[java] = " + java + ", " + "[pg] = " + pg
						+ ", " + "[object] = " + object + ", " + "[eModelToPg] = " + eModelToPg + ", " + "[tClass] = "
						+ tClass + ", " + "[lang] = " + lang + ", " + "[langToLang] = " + langToLang + ", "
						+ "[tPackageJava] = " + tPackageJava + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypeParameterImpl.pattern_TypeParameter_26_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = TypeParameterImpl.pattern_TypeParameter_26_5_checknacs_blackBBBBBBBBBBBB(model,
						tPackageLang, javaToJava, objectToObject, java, pg, object, eModelToPg, tClass, lang,
						langToLang, tPackageJava);
				if (result5_black != null) {

					Object[] result6_black = TypeParameterImpl.pattern_TypeParameter_26_6_perform_blackBBBBBBBBBBBBB(
							model, tPackageLang, javaToJava, objectToObject, java, pg, object, eModelToPg, tClass, lang,
							langToLang, tPackageJava, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model] = " + model
								+ ", " + "[tPackageLang] = " + tPackageLang + ", " + "[javaToJava] = " + javaToJava
								+ ", " + "[objectToObject] = " + objectToObject + ", " + "[java] = " + java + ", "
								+ "[pg] = " + pg + ", " + "[object] = " + object + ", " + "[eModelToPg] = " + eModelToPg
								+ ", " + "[tClass] = " + tClass + ", " + "[lang] = " + lang + ", " + "[langToLang] = "
								+ langToLang + ", " + "[tPackageJava] = " + tPackageJava + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					TypeParameterImpl.pattern_TypeParameter_26_6_perform_greenBFFBB(model, tClass, ruleResult);
					//nothing org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) result6_green[1];
					//nothing TypeToTAbstractType templateTypeToTClass = (TypeToTAbstractType) result6_green[2];

				} else {
				}

			} else {
			}

		}
		return TypeParameterImpl.pattern_TypeParameter_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MGravityModel model,
			TPackage tPackageLang, PackageToTPackage javaToJava, TypeToTAbstractType objectToObject,
			org.eclipse.modisco.java.Package java, TypeGraph pg, ClassDeclaration object, ModelToTypeGraph eModelToPg,
			TClass tClass, org.eclipse.modisco.java.Package lang, PackageToTPackage langToLang, TPackage tPackageJava,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("tPackageLang", tPackageLang);
		isApplicableMatch.registerObject("javaToJava", javaToJava);
		isApplicableMatch.registerObject("objectToObject", objectToObject);
		isApplicableMatch.registerObject("java", java);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("object", object);
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("lang", lang);
		isApplicableMatch.registerObject("langToLang", langToLang);
		isApplicableMatch.registerObject("tPackageJava", tPackageJava);
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
		case RulesPackage.TYPE_PARAMETER___IS_APPROPRIATE_FWD__MATCH_MGRAVITYMODEL_TYPEPARAMETER_PACKAGE_CLASSDECLARATION_PACKAGE:
			return isAppropriate_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1),
					(org.eclipse.modisco.java.TypeParameter) arguments.get(2),
					(org.eclipse.modisco.java.Package) arguments.get(3), (ClassDeclaration) arguments.get(4),
					(org.eclipse.modisco.java.Package) arguments.get(5));
		case RulesPackage.TYPE_PARAMETER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MGRAVITYMODEL_TYPEPARAMETER_PACKAGE_CLASSDECLARATION_PACKAGE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1),
					(org.eclipse.modisco.java.TypeParameter) arguments.get(2),
					(org.eclipse.modisco.java.Package) arguments.get(3), (ClassDeclaration) arguments.get(4),
					(org.eclipse.modisco.java.Package) arguments.get(5));
			return null;
		case RulesPackage.TYPE_PARAMETER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MGRAVITYMODEL_TYPEPARAMETER_PACKAGE_CLASSDECLARATION_PACKAGE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1),
					(org.eclipse.modisco.java.TypeParameter) arguments.get(2),
					(org.eclipse.modisco.java.Package) arguments.get(3), (ClassDeclaration) arguments.get(4),
					(org.eclipse.modisco.java.Package) arguments.get(5));
		case RulesPackage.TYPE_PARAMETER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MGRAVITYMODEL_TPACKAGE_PACKAGETOTPACKAGE_TYPEPARAMETER_TYPETOTABSTRACTTYPE_PACKAGE_TYPEGRAPH_CLASSDECLARATION_MODELTOTYPEGRAPH_TCLASS_PACKAGE_PACKAGETOTPACKAGE_TPACKAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MGravityModel) arguments.get(1),
					(TPackage) arguments.get(2), (PackageToTPackage) arguments.get(3),
					(org.eclipse.modisco.java.TypeParameter) arguments.get(4), (TypeToTAbstractType) arguments.get(5),
					(org.eclipse.modisco.java.Package) arguments.get(6), (TypeGraph) arguments.get(7),
					(ClassDeclaration) arguments.get(8), (ModelToTypeGraph) arguments.get(9),
					(TClass) arguments.get(10), (org.eclipse.modisco.java.Package) arguments.get(11),
					(PackageToTPackage) arguments.get(12), (TPackage) arguments.get(13));
		case RulesPackage.TYPE_PARAMETER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14));
			return null;
		case RulesPackage.TYPE_PARAMETER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___IS_APPROPRIATE_BWD__MATCH_TPACKAGE_TYPEGRAPH_TCLASS_TPACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3), (TPackage) arguments.get(4));
		case RulesPackage.TYPE_PARAMETER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TPACKAGE_TYPEGRAPH_TCLASS_TPACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3), (TPackage) arguments.get(4));
			return null;
		case RulesPackage.TYPE_PARAMETER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TPACKAGE_TYPEGRAPH_TCLASS_TPACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TPackage) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3), (TPackage) arguments.get(4));
		case RulesPackage.TYPE_PARAMETER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___IS_APPROPRIATE_BWD_TPACKAGE_0__TPACKAGE:
			return isAppropriate_BWD_TPackage_0((TPackage) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_63__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_63((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TYPE_PARAMETER___IS_APPLICABLE_SOLVE_CSP_CC__MGRAVITYMODEL_TPACKAGE_TYPEPARAMETER_PACKAGE_TYPEGRAPH_CLASSDECLARATION_TCLASS_PACKAGE_TPACKAGE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MGravityModel) arguments.get(0), (TPackage) arguments.get(1),
					(org.eclipse.modisco.java.TypeParameter) arguments.get(2),
					(org.eclipse.modisco.java.Package) arguments.get(3), (TypeGraph) arguments.get(4),
					(ClassDeclaration) arguments.get(5), (TClass) arguments.get(6),
					(org.eclipse.modisco.java.Package) arguments.get(7), (TPackage) arguments.get(8),
					(Match) arguments.get(9), (Match) arguments.get(10));
		case RulesPackage.TYPE_PARAMETER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___CHECK_DEC_FWD__MGRAVITYMODEL_TYPEPARAMETER_PACKAGE_CLASSDECLARATION_PACKAGE:
			return checkDEC_FWD((MGravityModel) arguments.get(0),
					(org.eclipse.modisco.java.TypeParameter) arguments.get(1),
					(org.eclipse.modisco.java.Package) arguments.get(2), (ClassDeclaration) arguments.get(3),
					(org.eclipse.modisco.java.Package) arguments.get(4));
		case RulesPackage.TYPE_PARAMETER___CHECK_DEC_BWD__TPACKAGE_TYPEGRAPH_TCLASS_TPACKAGE:
			return checkDEC_BWD((TPackage) arguments.get(0), (TypeGraph) arguments.get(1), (TClass) arguments.get(2),
					(TPackage) arguments.get(3));
		case RulesPackage.TYPE_PARAMETER___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
		case RulesPackage.TYPE_PARAMETER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MGRAVITYMODEL_TPACKAGE_PACKAGETOTPACKAGE_TYPETOTABSTRACTTYPE_PACKAGE_TYPEGRAPH_CLASSDECLARATION_MODELTOTYPEGRAPH_TCLASS_PACKAGE_PACKAGETOTPACKAGE_TPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MGravityModel) arguments.get(1),
					(TPackage) arguments.get(2), (PackageToTPackage) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (org.eclipse.modisco.java.Package) arguments.get(5),
					(TypeGraph) arguments.get(6), (ClassDeclaration) arguments.get(7),
					(ModelToTypeGraph) arguments.get(8), (TClass) arguments.get(9),
					(org.eclipse.modisco.java.Package) arguments.get(10), (PackageToTPackage) arguments.get(11),
					(TPackage) arguments.get(12), (ModelgeneratorRuleResult) arguments.get(13));
		case RulesPackage.TYPE_PARAMETER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypeParameter_0_1_initialbindings_blackBBBBBBB(TypeParameter _this,
			Match match, MGravityModel model, org.eclipse.modisco.java.TypeParameter typeParameter,
			org.eclipse.modisco.java.Package java, ClassDeclaration object, org.eclipse.modisco.java.Package lang) {
		if (!java.equals(lang)) {
			return new Object[] { _this, match, model, typeParameter, java, object, lang };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_0_2_SolveCSP_bindingFBBBBBBB(TypeParameter _this, Match match,
			MGravityModel model, org.eclipse.modisco.java.TypeParameter typeParameter,
			org.eclipse.modisco.java.Package java, ClassDeclaration object, org.eclipse.modisco.java.Package lang) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, model, typeParameter, java, object, lang);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, model, typeParameter, java, object, lang };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeParameter_0_2_SolveCSP_bindingAndBlackFBBBBBBB(TypeParameter _this,
			Match match, MGravityModel model, org.eclipse.modisco.java.TypeParameter typeParameter,
			org.eclipse.modisco.java.Package java, ClassDeclaration object, org.eclipse.modisco.java.Package lang) {
		Object[] result_pattern_TypeParameter_0_2_SolveCSP_binding = pattern_TypeParameter_0_2_SolveCSP_bindingFBBBBBBB(
				_this, match, model, typeParameter, java, object, lang);
		if (result_pattern_TypeParameter_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeParameter_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeParameter_0_2_SolveCSP_black = pattern_TypeParameter_0_2_SolveCSP_blackB(csp);
			if (result_pattern_TypeParameter_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, model, typeParameter, java, object, lang };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter_0_3_CheckCSP_expressionFBB(TypeParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_0_4_collectelementstobetranslated_blackBBBBBB(Match match,
			MGravityModel model, org.eclipse.modisco.java.TypeParameter typeParameter,
			org.eclipse.modisco.java.Package java, ClassDeclaration object, org.eclipse.modisco.java.Package lang) {
		if (!java.equals(lang)) {
			return new Object[] { match, model, typeParameter, java, object, lang };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_0_4_collectelementstobetranslated_greenBBBF(Match match,
			MGravityModel model, org.eclipse.modisco.java.TypeParameter typeParameter) {
		EMoflonEdge model__typeParameter____typeParameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(typeParameter);
		String model__typeParameter____typeParameters_name_prime = "typeParameters";
		model__typeParameter____typeParameters.setSrc(model);
		model__typeParameter____typeParameters.setTrg(typeParameter);
		match.getToBeTranslatedEdges().add(model__typeParameter____typeParameters);
		model__typeParameter____typeParameters.setName(model__typeParameter____typeParameters_name_prime);
		return new Object[] { match, model, typeParameter, model__typeParameter____typeParameters };
	}

	public static final Object[] pattern_TypeParameter_0_5_collectcontextelements_blackBBBBBB(Match match,
			MGravityModel model, org.eclipse.modisco.java.TypeParameter typeParameter,
			org.eclipse.modisco.java.Package java, ClassDeclaration object, org.eclipse.modisco.java.Package lang) {
		if (!java.equals(lang)) {
			return new Object[] { match, model, typeParameter, java, object, lang };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_0_5_collectcontextelements_greenBBBBBFFFFFF(Match match,
			MGravityModel model, org.eclipse.modisco.java.Package java, ClassDeclaration object,
			org.eclipse.modisco.java.Package lang) {
		EMoflonEdge model__java____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge java__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge java__lang____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge lang__java____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge lang__object____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge object__lang____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(model);
		match.getContextNodes().add(java);
		match.getContextNodes().add(object);
		match.getContextNodes().add(lang);
		String model__java____ownedElements_name_prime = "ownedElements";
		String java__model____model_name_prime = "model";
		String java__lang____ownedPackages_name_prime = "ownedPackages";
		String lang__java____package_name_prime = "package";
		String lang__object____ownedElements_name_prime = "ownedElements";
		String object__lang____package_name_prime = "package";
		model__java____ownedElements.setSrc(model);
		model__java____ownedElements.setTrg(java);
		match.getContextEdges().add(model__java____ownedElements);
		java__model____model.setSrc(java);
		java__model____model.setTrg(model);
		match.getContextEdges().add(java__model____model);
		java__lang____ownedPackages.setSrc(java);
		java__lang____ownedPackages.setTrg(lang);
		match.getContextEdges().add(java__lang____ownedPackages);
		lang__java____package.setSrc(lang);
		lang__java____package.setTrg(java);
		match.getContextEdges().add(lang__java____package);
		lang__object____ownedElements.setSrc(lang);
		lang__object____ownedElements.setTrg(object);
		match.getContextEdges().add(lang__object____ownedElements);
		object__lang____package.setSrc(object);
		object__lang____package.setTrg(lang);
		match.getContextEdges().add(object__lang____package);
		model__java____ownedElements.setName(model__java____ownedElements_name_prime);
		java__model____model.setName(java__model____model_name_prime);
		java__lang____ownedPackages.setName(java__lang____ownedPackages_name_prime);
		lang__java____package.setName(lang__java____package_name_prime);
		lang__object____ownedElements.setName(lang__object____ownedElements_name_prime);
		object__lang____package.setName(object__lang____package_name_prime);
		return new Object[] { match, model, java, object, lang, model__java____ownedElements, java__model____model,
				java__lang____ownedPackages, lang__java____package, lang__object____ownedElements,
				object__lang____package };
	}

	public static final void pattern_TypeParameter_0_6_registerobjectstomatch_expressionBBBBBBB(TypeParameter _this,
			Match match, MGravityModel model, org.eclipse.modisco.java.TypeParameter typeParameter,
			org.eclipse.modisco.java.Package java, ClassDeclaration object, org.eclipse.modisco.java.Package lang) {
		_this.registerObjectsToMatch_FWD(match, model, typeParameter, java, object, lang);

	}

	public static final boolean pattern_TypeParameter_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeParameter_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_1_1_performtransformation_bindingFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("model");
		EObject _localVariable_1 = isApplicableMatch.getObject("tPackageLang");
		EObject _localVariable_2 = isApplicableMatch.getObject("javaToJava");
		EObject _localVariable_3 = isApplicableMatch.getObject("typeParameter");
		EObject _localVariable_4 = isApplicableMatch.getObject("objectToObject");
		EObject _localVariable_5 = isApplicableMatch.getObject("java");
		EObject _localVariable_6 = isApplicableMatch.getObject("pg");
		EObject _localVariable_7 = isApplicableMatch.getObject("object");
		EObject _localVariable_8 = isApplicableMatch.getObject("eModelToPg");
		EObject _localVariable_9 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_10 = isApplicableMatch.getObject("lang");
		EObject _localVariable_11 = isApplicableMatch.getObject("langToLang");
		EObject _localVariable_12 = isApplicableMatch.getObject("tPackageJava");
		EObject tmpModel = _localVariable_0;
		EObject tmpTPackageLang = _localVariable_1;
		EObject tmpJavaToJava = _localVariable_2;
		EObject tmpTypeParameter = _localVariable_3;
		EObject tmpObjectToObject = _localVariable_4;
		EObject tmpJava = _localVariable_5;
		EObject tmpPg = _localVariable_6;
		EObject tmpObject = _localVariable_7;
		EObject tmpEModelToPg = _localVariable_8;
		EObject tmpTClass = _localVariable_9;
		EObject tmpLang = _localVariable_10;
		EObject tmpLangToLang = _localVariable_11;
		EObject tmpTPackageJava = _localVariable_12;
		if (tmpModel instanceof MGravityModel) {
			MGravityModel model = (MGravityModel) tmpModel;
			if (tmpTPackageLang instanceof TPackage) {
				TPackage tPackageLang = (TPackage) tmpTPackageLang;
				if (tmpJavaToJava instanceof PackageToTPackage) {
					PackageToTPackage javaToJava = (PackageToTPackage) tmpJavaToJava;
					if (tmpTypeParameter instanceof org.eclipse.modisco.java.TypeParameter) {
						org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) tmpTypeParameter;
						if (tmpObjectToObject instanceof TypeToTAbstractType) {
							TypeToTAbstractType objectToObject = (TypeToTAbstractType) tmpObjectToObject;
							if (tmpJava instanceof org.eclipse.modisco.java.Package) {
								org.eclipse.modisco.java.Package java = (org.eclipse.modisco.java.Package) tmpJava;
								if (tmpPg instanceof TypeGraph) {
									TypeGraph pg = (TypeGraph) tmpPg;
									if (tmpObject instanceof ClassDeclaration) {
										ClassDeclaration object = (ClassDeclaration) tmpObject;
										if (tmpEModelToPg instanceof ModelToTypeGraph) {
											ModelToTypeGraph eModelToPg = (ModelToTypeGraph) tmpEModelToPg;
											if (tmpTClass instanceof TClass) {
												TClass tClass = (TClass) tmpTClass;
												if (tmpLang instanceof org.eclipse.modisco.java.Package) {
													org.eclipse.modisco.java.Package lang = (org.eclipse.modisco.java.Package) tmpLang;
													if (tmpLangToLang instanceof PackageToTPackage) {
														PackageToTPackage langToLang = (PackageToTPackage) tmpLangToLang;
														if (tmpTPackageJava instanceof TPackage) {
															TPackage tPackageJava = (TPackage) tmpTPackageJava;
															return new Object[] { model, tPackageLang, javaToJava,
																	typeParameter, objectToObject, java, pg, object,
																	eModelToPg, tClass, lang, langToLang, tPackageJava,
																	isApplicableMatch };
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeParameter_1_1_performtransformation_blackBBBBBBBBBBBBBFBB(
			MGravityModel model, TPackage tPackageLang, PackageToTPackage javaToJava,
			org.eclipse.modisco.java.TypeParameter typeParameter, TypeToTAbstractType objectToObject,
			org.eclipse.modisco.java.Package java, TypeGraph pg, ClassDeclaration object, ModelToTypeGraph eModelToPg,
			TClass tClass, org.eclipse.modisco.java.Package lang, PackageToTPackage langToLang, TPackage tPackageJava,
			TypeParameter _this, IsApplicableMatch isApplicableMatch) {
		if (!javaToJava.equals(langToLang)) {
			if (!java.equals(lang)) {
				if (!tPackageJava.equals(tPackageLang)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { model, tPackageLang, javaToJava, typeParameter, objectToObject, java,
									pg, object, eModelToPg, tClass, lang, langToLang, tPackageJava, csp, _this,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFBB(
			TypeParameter _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeParameter_1_1_performtransformation_binding = pattern_TypeParameter_1_1_performtransformation_bindingFFFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeParameter_1_1_performtransformation_binding != null) {
			MGravityModel model = (MGravityModel) result_pattern_TypeParameter_1_1_performtransformation_binding[0];
			TPackage tPackageLang = (TPackage) result_pattern_TypeParameter_1_1_performtransformation_binding[1];
			PackageToTPackage javaToJava = (PackageToTPackage) result_pattern_TypeParameter_1_1_performtransformation_binding[2];
			org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) result_pattern_TypeParameter_1_1_performtransformation_binding[3];
			TypeToTAbstractType objectToObject = (TypeToTAbstractType) result_pattern_TypeParameter_1_1_performtransformation_binding[4];
			org.eclipse.modisco.java.Package java = (org.eclipse.modisco.java.Package) result_pattern_TypeParameter_1_1_performtransformation_binding[5];
			TypeGraph pg = (TypeGraph) result_pattern_TypeParameter_1_1_performtransformation_binding[6];
			ClassDeclaration object = (ClassDeclaration) result_pattern_TypeParameter_1_1_performtransformation_binding[7];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result_pattern_TypeParameter_1_1_performtransformation_binding[8];
			TClass tClass = (TClass) result_pattern_TypeParameter_1_1_performtransformation_binding[9];
			org.eclipse.modisco.java.Package lang = (org.eclipse.modisco.java.Package) result_pattern_TypeParameter_1_1_performtransformation_binding[10];
			PackageToTPackage langToLang = (PackageToTPackage) result_pattern_TypeParameter_1_1_performtransformation_binding[11];
			TPackage tPackageJava = (TPackage) result_pattern_TypeParameter_1_1_performtransformation_binding[12];

			Object[] result_pattern_TypeParameter_1_1_performtransformation_black = pattern_TypeParameter_1_1_performtransformation_blackBBBBBBBBBBBBBFBB(
					model, tPackageLang, javaToJava, typeParameter, objectToObject, java, pg, object, eModelToPg,
					tClass, lang, langToLang, tPackageJava, _this, isApplicableMatch);
			if (result_pattern_TypeParameter_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeParameter_1_1_performtransformation_black[13];

				return new Object[] { model, tPackageLang, javaToJava, typeParameter, objectToObject, java, pg, object,
						eModelToPg, tClass, lang, langToLang, tPackageJava, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_1_1_performtransformation_greenBFB(
			org.eclipse.modisco.java.TypeParameter typeParameter, TClass tClass) {
		TypeToTAbstractType templateTypeToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		templateTypeToTClass.setSource(typeParameter);
		templateTypeToTClass.setTarget(tClass);
		return new Object[] { typeParameter, templateTypeToTClass, tClass };
	}

	public static final Object[] pattern_TypeParameter_1_2_collecttranslatedelements_blackBB(
			org.eclipse.modisco.java.TypeParameter typeParameter, TypeToTAbstractType templateTypeToTClass) {
		return new Object[] { typeParameter, templateTypeToTClass };
	}

	public static final Object[] pattern_TypeParameter_1_2_collecttranslatedelements_greenFBB(
			org.eclipse.modisco.java.TypeParameter typeParameter, TypeToTAbstractType templateTypeToTClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(typeParameter);
		ruleresult.getCreatedLinkElements().add(templateTypeToTClass);
		return new Object[] { ruleresult, typeParameter, templateTypeToTClass };
	}

	public static final Object[] pattern_TypeParameter_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject model, EObject tPackageLang, EObject javaToJava,
			EObject typeParameter, EObject objectToObject, EObject java, EObject templateTypeToTClass, EObject pg,
			EObject object, EObject eModelToPg, EObject tClass, EObject lang, EObject langToLang,
			EObject tPackageJava) {
		if (!model.equals(tPackageLang)) {
			if (!model.equals(typeParameter)) {
				if (!model.equals(objectToObject)) {
					if (!model.equals(templateTypeToTClass)) {
						if (!model.equals(pg)) {
							if (!model.equals(object)) {
								if (!model.equals(tClass)) {
									if (!model.equals(tPackageJava)) {
										if (!tPackageLang.equals(typeParameter)) {
											if (!tPackageLang.equals(templateTypeToTClass)) {
												if (!javaToJava.equals(model)) {
													if (!javaToJava.equals(tPackageLang)) {
														if (!javaToJava.equals(typeParameter)) {
															if (!javaToJava.equals(objectToObject)) {
																if (!javaToJava.equals(templateTypeToTClass)) {
																	if (!javaToJava.equals(pg)) {
																		if (!javaToJava.equals(object)) {
																			if (!javaToJava.equals(tClass)) {
																				if (!javaToJava.equals(lang)) {
																					if (!javaToJava
																							.equals(langToLang)) {
																						if (!javaToJava
																								.equals(tPackageJava)) {
																							if (!objectToObject.equals(
																									tPackageLang)) {
																								if (!objectToObject
																										.equals(typeParameter)) {
																									if (!objectToObject
																											.equals(templateTypeToTClass)) {
																										if (!objectToObject
																												.equals(pg)) {
																											if (!objectToObject
																													.equals(tClass)) {
																												if (!objectToObject
																														.equals(tPackageJava)) {
																													if (!java
																															.equals(model)) {
																														if (!java
																																.equals(tPackageLang)) {
																															if (!java
																																	.equals(javaToJava)) {
																																if (!java
																																		.equals(typeParameter)) {
																																	if (!java
																																			.equals(objectToObject)) {
																																		if (!java
																																				.equals(templateTypeToTClass)) {
																																			if (!java
																																					.equals(pg)) {
																																				if (!java
																																						.equals(object)) {
																																					if (!java
																																							.equals(tClass)) {
																																						if (!java
																																								.equals(lang)) {
																																							if (!java
																																									.equals(langToLang)) {
																																								if (!java
																																										.equals(tPackageJava)) {
																																									if (!templateTypeToTClass
																																											.equals(typeParameter)) {
																																										if (!pg.equals(
																																												tPackageLang)) {
																																											if (!pg.equals(
																																													typeParameter)) {
																																												if (!pg.equals(
																																														templateTypeToTClass)) {
																																													if (!pg.equals(
																																															tClass)) {
																																														if (!pg.equals(
																																																tPackageJava)) {
																																															if (!object
																																																	.equals(tPackageLang)) {
																																																if (!object
																																																		.equals(typeParameter)) {
																																																	if (!object
																																																			.equals(objectToObject)) {
																																																		if (!object
																																																				.equals(templateTypeToTClass)) {
																																																			if (!object
																																																					.equals(pg)) {
																																																				if (!object
																																																						.equals(tClass)) {
																																																					if (!object
																																																							.equals(tPackageJava)) {
																																																						if (!eModelToPg
																																																								.equals(model)) {
																																																							if (!eModelToPg
																																																									.equals(tPackageLang)) {
																																																								if (!eModelToPg
																																																										.equals(javaToJava)) {
																																																									if (!eModelToPg
																																																											.equals(typeParameter)) {
																																																										if (!eModelToPg
																																																												.equals(objectToObject)) {
																																																											if (!eModelToPg
																																																													.equals(java)) {
																																																												if (!eModelToPg
																																																														.equals(templateTypeToTClass)) {
																																																													if (!eModelToPg
																																																															.equals(pg)) {
																																																														if (!eModelToPg
																																																																.equals(object)) {
																																																															if (!eModelToPg
																																																																	.equals(tClass)) {
																																																																if (!eModelToPg
																																																																		.equals(lang)) {
																																																																	if (!eModelToPg
																																																																			.equals(langToLang)) {
																																																																		if (!eModelToPg
																																																																				.equals(tPackageJava)) {
																																																																			if (!tClass
																																																																					.equals(tPackageLang)) {
																																																																				if (!tClass
																																																																						.equals(typeParameter)) {
																																																																					if (!tClass
																																																																							.equals(templateTypeToTClass)) {
																																																																						if (!tClass
																																																																								.equals(tPackageJava)) {
																																																																							if (!lang
																																																																									.equals(model)) {
																																																																								if (!lang
																																																																										.equals(tPackageLang)) {
																																																																									if (!lang
																																																																											.equals(typeParameter)) {
																																																																										if (!lang
																																																																												.equals(objectToObject)) {
																																																																											if (!lang
																																																																													.equals(templateTypeToTClass)) {
																																																																												if (!lang
																																																																														.equals(pg)) {
																																																																													if (!lang
																																																																															.equals(object)) {
																																																																														if (!lang
																																																																																.equals(tClass)) {
																																																																															if (!lang
																																																																																	.equals(langToLang)) {
																																																																																if (!lang
																																																																																		.equals(tPackageJava)) {
																																																																																	if (!langToLang
																																																																																			.equals(model)) {
																																																																																		if (!langToLang
																																																																																				.equals(tPackageLang)) {
																																																																																			if (!langToLang
																																																																																					.equals(typeParameter)) {
																																																																																				if (!langToLang
																																																																																						.equals(objectToObject)) {
																																																																																					if (!langToLang
																																																																																							.equals(templateTypeToTClass)) {
																																																																																						if (!langToLang
																																																																																								.equals(pg)) {
																																																																																							if (!langToLang
																																																																																									.equals(object)) {
																																																																																								if (!langToLang
																																																																																										.equals(tClass)) {
																																																																																									if (!langToLang
																																																																																											.equals(tPackageJava)) {
																																																																																										if (!tPackageJava
																																																																																												.equals(tPackageLang)) {
																																																																																											if (!tPackageJava
																																																																																													.equals(typeParameter)) {
																																																																																												if (!tPackageJava
																																																																																														.equals(templateTypeToTClass)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															model,
																																																																																															tPackageLang,
																																																																																															javaToJava,
																																																																																															typeParameter,
																																																																																															objectToObject,
																																																																																															java,
																																																																																															templateTypeToTClass,
																																																																																															pg,
																																																																																															object,
																																																																																															eModelToPg,
																																																																																															tClass,
																																																																																															lang,
																																																																																															langToLang,
																																																																																															tPackageJava };
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeParameter_1_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject model, EObject typeParameter, EObject templateTypeToTClass,
			EObject tClass) {
		EMoflonEdge model__typeParameter____typeParameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge templateTypeToTClass__typeParameter____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge templateTypeToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeParameter";
		String model__typeParameter____typeParameters_name_prime = "typeParameters";
		String templateTypeToTClass__typeParameter____source_name_prime = "source";
		String templateTypeToTClass__tClass____target_name_prime = "target";
		model__typeParameter____typeParameters.setSrc(model);
		model__typeParameter____typeParameters.setTrg(typeParameter);
		ruleresult.getTranslatedEdges().add(model__typeParameter____typeParameters);
		templateTypeToTClass__typeParameter____source.setSrc(templateTypeToTClass);
		templateTypeToTClass__typeParameter____source.setTrg(typeParameter);
		ruleresult.getCreatedEdges().add(templateTypeToTClass__typeParameter____source);
		templateTypeToTClass__tClass____target.setSrc(templateTypeToTClass);
		templateTypeToTClass__tClass____target.setTrg(tClass);
		ruleresult.getCreatedEdges().add(templateTypeToTClass__tClass____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		model__typeParameter____typeParameters.setName(model__typeParameter____typeParameters_name_prime);
		templateTypeToTClass__typeParameter____source.setName(templateTypeToTClass__typeParameter____source_name_prime);
		templateTypeToTClass__tClass____target.setName(templateTypeToTClass__tClass____target_name_prime);
		return new Object[] { ruleresult, model, typeParameter, templateTypeToTClass, tClass,
				model__typeParameter____typeParameters, templateTypeToTClass__typeParameter____source,
				templateTypeToTClass__tClass____target };
	}

	public static final void pattern_TypeParameter_1_5_registerobjects_expressionBBBBBBBBBBBBBBBB(TypeParameter _this,
			PerformRuleResult ruleresult, EObject model, EObject tPackageLang, EObject javaToJava,
			EObject typeParameter, EObject objectToObject, EObject java, EObject templateTypeToTClass, EObject pg,
			EObject object, EObject eModelToPg, EObject tClass, EObject lang, EObject langToLang,
			EObject tPackageJava) {
		_this.registerObjects_FWD(ruleresult, model, tPackageLang, javaToJava, typeParameter, objectToObject, java,
				templateTypeToTClass, pg, object, eModelToPg, tClass, lang, langToLang, tPackageJava);

	}

	public static final PerformRuleResult pattern_TypeParameter_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeParameter_2_1_preparereturnvalue_bindingFB(TypeParameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_2_1_preparereturnvalue_blackFBB(EClass eClass,
			TypeParameter _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_2_1_preparereturnvalue_bindingAndBlackFFB(TypeParameter _this) {
		Object[] result_pattern_TypeParameter_2_1_preparereturnvalue_binding = pattern_TypeParameter_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeParameter_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeParameter_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeParameter_2_1_preparereturnvalue_black = pattern_TypeParameter_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeParameter_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeParameter_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeParameter";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeParameter_2_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("model");
		EObject _localVariable_1 = match.getObject("typeParameter");
		EObject _localVariable_2 = match.getObject("java");
		EObject _localVariable_3 = match.getObject("object");
		EObject _localVariable_4 = match.getObject("lang");
		EObject tmpModel = _localVariable_0;
		EObject tmpTypeParameter = _localVariable_1;
		EObject tmpJava = _localVariable_2;
		EObject tmpObject = _localVariable_3;
		EObject tmpLang = _localVariable_4;
		if (tmpModel instanceof MGravityModel) {
			MGravityModel model = (MGravityModel) tmpModel;
			if (tmpTypeParameter instanceof org.eclipse.modisco.java.TypeParameter) {
				org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) tmpTypeParameter;
				if (tmpJava instanceof org.eclipse.modisco.java.Package) {
					org.eclipse.modisco.java.Package java = (org.eclipse.modisco.java.Package) tmpJava;
					if (tmpObject instanceof ClassDeclaration) {
						ClassDeclaration object = (ClassDeclaration) tmpObject;
						if (tmpLang instanceof org.eclipse.modisco.java.Package) {
							org.eclipse.modisco.java.Package lang = (org.eclipse.modisco.java.Package) tmpLang;
							return new Object[] { model, typeParameter, java, object, lang, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeParameter_2_2_corematch_blackBFFBFBFBFFBFFB(MGravityModel model,
			org.eclipse.modisco.java.TypeParameter typeParameter, org.eclipse.modisco.java.Package java,
			ClassDeclaration object, org.eclipse.modisco.java.Package lang, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!java.equals(lang)) {
			String object_name = object.getName();
			if (object_name.equals("Object")) {
				for (TypeToTAbstractType objectToObject : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(object, TypeToTAbstractType.class, "source")) {
					TAbstractType tmpTClass = objectToObject.getTarget();
					if (tmpTClass instanceof TClass) {
						TClass tClass = (TClass) tmpTClass;
						String tClass_tName = tClass.getTName();
						if (tClass_tName.equals("Object")) {
							for (PackageToTPackage langToLang : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(lang, PackageToTPackage.class, "source")) {
								TPackage tPackageLang = langToLang.getTarget();
								if (tPackageLang != null) {
									String tPackageLang_tName = tPackageLang.getTName();
									if (tPackageLang_tName.equals("lang")) {
										for (PackageToTPackage javaToJava : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(java, PackageToTPackage.class, "source")) {
											if (!javaToJava.equals(langToLang)) {
												TPackage tPackageJava = javaToJava.getTarget();
												if (tPackageJava != null) {
													if (!tPackageJava.equals(tPackageLang)) {
														String tPackageJava_tName = tPackageJava.getTName();
														if (tPackageJava_tName.equals("java")) {
															for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(model,
																			ModelToTypeGraph.class, "source")) {
																TypeGraph pg = eModelToPg.getTarget();
																if (pg != null) {
																	_result.add(new Object[] { model, tPackageLang,
																			javaToJava, typeParameter, objectToObject,
																			java, pg, object, eModelToPg, tClass, lang,
																			langToLang, tPackageJava, match });
																}

															}
														}

													}
												}

											}
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

	public static final Iterable<Object[]> pattern_TypeParameter_2_3_findcontext_blackBBBBBBBBBBBBB(MGravityModel model,
			TPackage tPackageLang, PackageToTPackage javaToJava, org.eclipse.modisco.java.TypeParameter typeParameter,
			TypeToTAbstractType objectToObject, org.eclipse.modisco.java.Package java, TypeGraph pg,
			ClassDeclaration object, ModelToTypeGraph eModelToPg, TClass tClass, org.eclipse.modisco.java.Package lang,
			PackageToTPackage langToLang, TPackage tPackageJava) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!javaToJava.equals(langToLang)) {
			if (!java.equals(lang)) {
				if (!tPackageJava.equals(tPackageLang)) {
					if (model.getTypeParameters().contains(typeParameter)) {
						if (model.getOwnedElements().contains(java)) {
							if (java.getOwnedPackages().contains(lang)) {
								if (pg.getPackages().contains(tPackageJava)) {
									if (object.equals(objectToObject.getSource())) {
										if (pg.equals(eModelToPg.getTarget())) {
											if (tClass.equals(objectToObject.getTarget())) {
												if (lang.equals(langToLang.getSource())) {
													if (tPackageLang.getClasses().contains(tClass)) {
														if (tPackageJava.getSubpackages().contains(tPackageLang)) {
															if (java.equals(javaToJava.getSource())) {
																if (lang.getOwnedElements().contains(object)) {
																	if (tPackageJava.equals(javaToJava.getTarget())) {
																		if (model.equals(eModelToPg.getSource())) {
																			if (tPackageLang
																					.equals(langToLang.getTarget())) {
																				String tPackageLang_tName = tPackageLang
																						.getTName();
																				if (tPackageLang_tName.equals("lang")) {
																					String object_name = object
																							.getName();
																					if (object_name.equals("Object")) {
																						String tClass_tName = tClass
																								.getTName();
																						if (tClass_tName
																								.equals("Object")) {
																							String tPackageJava_tName = tPackageJava
																									.getTName();
																							if (tPackageJava_tName
																									.equals("java")) {
																								_result.add(
																										new Object[] {
																												model,
																												tPackageLang,
																												javaToJava,
																												typeParameter,
																												objectToObject,
																												java,
																												pg,
																												object,
																												eModelToPg,
																												tClass,
																												lang,
																												langToLang,
																												tPackageJava });
																							}

																						}

																					}

																				}

																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeParameter_2_3_findcontext_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
			MGravityModel model, TPackage tPackageLang, PackageToTPackage javaToJava,
			org.eclipse.modisco.java.TypeParameter typeParameter, TypeToTAbstractType objectToObject,
			org.eclipse.modisco.java.Package java, TypeGraph pg, ClassDeclaration object, ModelToTypeGraph eModelToPg,
			TClass tClass, org.eclipse.modisco.java.Package lang, PackageToTPackage langToLang, TPackage tPackageJava) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge model__typeParameter____typeParameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__java____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge java__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge java__lang____ownedPackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge lang__java____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tPackageJava____packages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge objectToObject__object____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge objectToObject__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge langToLang__lang____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackageLang__tClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackageJava__tPackageLang____subpackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackageLang__tPackageJava____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge javaToJava__java____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge lang__object____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge object__lang____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge javaToJava__tPackageJava____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__model____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge langToLang__tPackageLang____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String model__typeParameter____typeParameters_name_prime = "typeParameters";
		String model__java____ownedElements_name_prime = "ownedElements";
		String java__model____model_name_prime = "model";
		String java__lang____ownedPackages_name_prime = "ownedPackages";
		String lang__java____package_name_prime = "package";
		String pg__tPackageJava____packages_name_prime = "packages";
		String objectToObject__object____source_name_prime = "source";
		String eModelToPg__pg____target_name_prime = "target";
		String objectToObject__tClass____target_name_prime = "target";
		String langToLang__lang____source_name_prime = "source";
		String tPackageLang__tClass____classes_name_prime = "classes";
		String tPackageJava__tPackageLang____subpackages_name_prime = "subpackages";
		String tPackageLang__tPackageJava____parent_name_prime = "parent";
		String javaToJava__java____source_name_prime = "source";
		String lang__object____ownedElements_name_prime = "ownedElements";
		String object__lang____package_name_prime = "package";
		String javaToJava__tPackageJava____target_name_prime = "target";
		String eModelToPg__model____source_name_prime = "source";
		String langToLang__tPackageLang____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(tPackageLang);
		isApplicableMatch.getAllContextElements().add(javaToJava);
		isApplicableMatch.getAllContextElements().add(typeParameter);
		isApplicableMatch.getAllContextElements().add(objectToObject);
		isApplicableMatch.getAllContextElements().add(java);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(object);
		isApplicableMatch.getAllContextElements().add(eModelToPg);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(lang);
		isApplicableMatch.getAllContextElements().add(langToLang);
		isApplicableMatch.getAllContextElements().add(tPackageJava);
		model__typeParameter____typeParameters.setSrc(model);
		model__typeParameter____typeParameters.setTrg(typeParameter);
		isApplicableMatch.getAllContextElements().add(model__typeParameter____typeParameters);
		model__java____ownedElements.setSrc(model);
		model__java____ownedElements.setTrg(java);
		isApplicableMatch.getAllContextElements().add(model__java____ownedElements);
		java__model____model.setSrc(java);
		java__model____model.setTrg(model);
		isApplicableMatch.getAllContextElements().add(java__model____model);
		java__lang____ownedPackages.setSrc(java);
		java__lang____ownedPackages.setTrg(lang);
		isApplicableMatch.getAllContextElements().add(java__lang____ownedPackages);
		lang__java____package.setSrc(lang);
		lang__java____package.setTrg(java);
		isApplicableMatch.getAllContextElements().add(lang__java____package);
		pg__tPackageJava____packages.setSrc(pg);
		pg__tPackageJava____packages.setTrg(tPackageJava);
		isApplicableMatch.getAllContextElements().add(pg__tPackageJava____packages);
		objectToObject__object____source.setSrc(objectToObject);
		objectToObject__object____source.setTrg(object);
		isApplicableMatch.getAllContextElements().add(objectToObject__object____source);
		eModelToPg__pg____target.setSrc(eModelToPg);
		eModelToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(eModelToPg__pg____target);
		objectToObject__tClass____target.setSrc(objectToObject);
		objectToObject__tClass____target.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(objectToObject__tClass____target);
		langToLang__lang____source.setSrc(langToLang);
		langToLang__lang____source.setTrg(lang);
		isApplicableMatch.getAllContextElements().add(langToLang__lang____source);
		tPackageLang__tClass____classes.setSrc(tPackageLang);
		tPackageLang__tClass____classes.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(tPackageLang__tClass____classes);
		tPackageJava__tPackageLang____subpackages.setSrc(tPackageJava);
		tPackageJava__tPackageLang____subpackages.setTrg(tPackageLang);
		isApplicableMatch.getAllContextElements().add(tPackageJava__tPackageLang____subpackages);
		tPackageLang__tPackageJava____parent.setSrc(tPackageLang);
		tPackageLang__tPackageJava____parent.setTrg(tPackageJava);
		isApplicableMatch.getAllContextElements().add(tPackageLang__tPackageJava____parent);
		javaToJava__java____source.setSrc(javaToJava);
		javaToJava__java____source.setTrg(java);
		isApplicableMatch.getAllContextElements().add(javaToJava__java____source);
		lang__object____ownedElements.setSrc(lang);
		lang__object____ownedElements.setTrg(object);
		isApplicableMatch.getAllContextElements().add(lang__object____ownedElements);
		object__lang____package.setSrc(object);
		object__lang____package.setTrg(lang);
		isApplicableMatch.getAllContextElements().add(object__lang____package);
		javaToJava__tPackageJava____target.setSrc(javaToJava);
		javaToJava__tPackageJava____target.setTrg(tPackageJava);
		isApplicableMatch.getAllContextElements().add(javaToJava__tPackageJava____target);
		eModelToPg__model____source.setSrc(eModelToPg);
		eModelToPg__model____source.setTrg(model);
		isApplicableMatch.getAllContextElements().add(eModelToPg__model____source);
		langToLang__tPackageLang____target.setSrc(langToLang);
		langToLang__tPackageLang____target.setTrg(tPackageLang);
		isApplicableMatch.getAllContextElements().add(langToLang__tPackageLang____target);
		model__typeParameter____typeParameters.setName(model__typeParameter____typeParameters_name_prime);
		model__java____ownedElements.setName(model__java____ownedElements_name_prime);
		java__model____model.setName(java__model____model_name_prime);
		java__lang____ownedPackages.setName(java__lang____ownedPackages_name_prime);
		lang__java____package.setName(lang__java____package_name_prime);
		pg__tPackageJava____packages.setName(pg__tPackageJava____packages_name_prime);
		objectToObject__object____source.setName(objectToObject__object____source_name_prime);
		eModelToPg__pg____target.setName(eModelToPg__pg____target_name_prime);
		objectToObject__tClass____target.setName(objectToObject__tClass____target_name_prime);
		langToLang__lang____source.setName(langToLang__lang____source_name_prime);
		tPackageLang__tClass____classes.setName(tPackageLang__tClass____classes_name_prime);
		tPackageJava__tPackageLang____subpackages.setName(tPackageJava__tPackageLang____subpackages_name_prime);
		tPackageLang__tPackageJava____parent.setName(tPackageLang__tPackageJava____parent_name_prime);
		javaToJava__java____source.setName(javaToJava__java____source_name_prime);
		lang__object____ownedElements.setName(lang__object____ownedElements_name_prime);
		object__lang____package.setName(object__lang____package_name_prime);
		javaToJava__tPackageJava____target.setName(javaToJava__tPackageJava____target_name_prime);
		eModelToPg__model____source.setName(eModelToPg__model____source_name_prime);
		langToLang__tPackageLang____target.setName(langToLang__tPackageLang____target_name_prime);
		return new Object[] { model, tPackageLang, javaToJava, typeParameter, objectToObject, java, pg, object,
				eModelToPg, tClass, lang, langToLang, tPackageJava, isApplicableMatch,
				model__typeParameter____typeParameters, model__java____ownedElements, java__model____model,
				java__lang____ownedPackages, lang__java____package, pg__tPackageJava____packages,
				objectToObject__object____source, eModelToPg__pg____target, objectToObject__tClass____target,
				langToLang__lang____source, tPackageLang__tClass____classes, tPackageJava__tPackageLang____subpackages,
				tPackageLang__tPackageJava____parent, javaToJava__java____source, lang__object____ownedElements,
				object__lang____package, javaToJava__tPackageJava____target, eModelToPg__model____source,
				langToLang__tPackageLang____target };
	}

	public static final Object[] pattern_TypeParameter_2_4_solveCSP_bindingFBBBBBBBBBBBBBBB(TypeParameter _this,
			IsApplicableMatch isApplicableMatch, MGravityModel model, TPackage tPackageLang,
			PackageToTPackage javaToJava, org.eclipse.modisco.java.TypeParameter typeParameter,
			TypeToTAbstractType objectToObject, org.eclipse.modisco.java.Package java, TypeGraph pg,
			ClassDeclaration object, ModelToTypeGraph eModelToPg, TClass tClass, org.eclipse.modisco.java.Package lang,
			PackageToTPackage langToLang, TPackage tPackageJava) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, model, tPackageLang, javaToJava,
				typeParameter, objectToObject, java, pg, object, eModelToPg, tClass, lang, langToLang, tPackageJava);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, tPackageLang, javaToJava, typeParameter,
					objectToObject, java, pg, object, eModelToPg, tClass, lang, langToLang, tPackageJava };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeParameter_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBB(TypeParameter _this,
			IsApplicableMatch isApplicableMatch, MGravityModel model, TPackage tPackageLang,
			PackageToTPackage javaToJava, org.eclipse.modisco.java.TypeParameter typeParameter,
			TypeToTAbstractType objectToObject, org.eclipse.modisco.java.Package java, TypeGraph pg,
			ClassDeclaration object, ModelToTypeGraph eModelToPg, TClass tClass, org.eclipse.modisco.java.Package lang,
			PackageToTPackage langToLang, TPackage tPackageJava) {
		Object[] result_pattern_TypeParameter_2_4_solveCSP_binding = pattern_TypeParameter_2_4_solveCSP_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, model, tPackageLang, javaToJava, typeParameter, objectToObject, java, pg,
				object, eModelToPg, tClass, lang, langToLang, tPackageJava);
		if (result_pattern_TypeParameter_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeParameter_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypeParameter_2_4_solveCSP_black = pattern_TypeParameter_2_4_solveCSP_blackB(csp);
			if (result_pattern_TypeParameter_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, tPackageLang, javaToJava, typeParameter,
						objectToObject, java, pg, object, eModelToPg, tClass, lang, langToLang, tPackageJava };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter_2_5_checkCSP_expressionFBB(TypeParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeParameter_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeParameter";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeParameter_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeParameter_10_1_initialbindings_blackBBBBBB(TypeParameter _this,
			Match match, TPackage tPackageLang, TypeGraph pg, TClass tClass, TPackage tPackageJava) {
		if (!tPackageJava.equals(tPackageLang)) {
			return new Object[] { _this, match, tPackageLang, pg, tClass, tPackageJava };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_10_2_SolveCSP_bindingFBBBBBB(TypeParameter _this, Match match,
			TPackage tPackageLang, TypeGraph pg, TClass tClass, TPackage tPackageJava) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tPackageLang, pg, tClass, tPackageJava);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tPackageLang, pg, tClass, tPackageJava };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeParameter_10_2_SolveCSP_bindingAndBlackFBBBBBB(TypeParameter _this,
			Match match, TPackage tPackageLang, TypeGraph pg, TClass tClass, TPackage tPackageJava) {
		Object[] result_pattern_TypeParameter_10_2_SolveCSP_binding = pattern_TypeParameter_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, tPackageLang, pg, tClass, tPackageJava);
		if (result_pattern_TypeParameter_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeParameter_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeParameter_10_2_SolveCSP_black = pattern_TypeParameter_10_2_SolveCSP_blackB(csp);
			if (result_pattern_TypeParameter_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tPackageLang, pg, tClass, tPackageJava };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter_10_3_CheckCSP_expressionFBB(TypeParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			TPackage tPackageLang, TypeGraph pg, TClass tClass, TPackage tPackageJava) {
		if (!tPackageJava.equals(tPackageLang)) {
			return new Object[] { match, tPackageLang, pg, tClass, tPackageJava };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_10_5_collectcontextelements_blackBBBBB(Match match,
			TPackage tPackageLang, TypeGraph pg, TClass tClass, TPackage tPackageJava) {
		if (!tPackageJava.equals(tPackageLang)) {
			return new Object[] { match, tPackageLang, pg, tClass, tPackageJava };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_10_5_collectcontextelements_greenBBBBBFFFF(Match match,
			TPackage tPackageLang, TypeGraph pg, TClass tClass, TPackage tPackageJava) {
		EMoflonEdge pg__tPackageJava____packages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackageLang__tClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackageJava__tPackageLang____subpackages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackageLang__tPackageJava____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tPackageLang);
		match.getContextNodes().add(pg);
		match.getContextNodes().add(tClass);
		match.getContextNodes().add(tPackageJava);
		String pg__tPackageJava____packages_name_prime = "packages";
		String tPackageLang__tClass____classes_name_prime = "classes";
		String tPackageJava__tPackageLang____subpackages_name_prime = "subpackages";
		String tPackageLang__tPackageJava____parent_name_prime = "parent";
		pg__tPackageJava____packages.setSrc(pg);
		pg__tPackageJava____packages.setTrg(tPackageJava);
		match.getContextEdges().add(pg__tPackageJava____packages);
		tPackageLang__tClass____classes.setSrc(tPackageLang);
		tPackageLang__tClass____classes.setTrg(tClass);
		match.getContextEdges().add(tPackageLang__tClass____classes);
		tPackageJava__tPackageLang____subpackages.setSrc(tPackageJava);
		tPackageJava__tPackageLang____subpackages.setTrg(tPackageLang);
		match.getContextEdges().add(tPackageJava__tPackageLang____subpackages);
		tPackageLang__tPackageJava____parent.setSrc(tPackageLang);
		tPackageLang__tPackageJava____parent.setTrg(tPackageJava);
		match.getContextEdges().add(tPackageLang__tPackageJava____parent);
		pg__tPackageJava____packages.setName(pg__tPackageJava____packages_name_prime);
		tPackageLang__tClass____classes.setName(tPackageLang__tClass____classes_name_prime);
		tPackageJava__tPackageLang____subpackages.setName(tPackageJava__tPackageLang____subpackages_name_prime);
		tPackageLang__tPackageJava____parent.setName(tPackageLang__tPackageJava____parent_name_prime);
		return new Object[] { match, tPackageLang, pg, tClass, tPackageJava, pg__tPackageJava____packages,
				tPackageLang__tClass____classes, tPackageJava__tPackageLang____subpackages,
				tPackageLang__tPackageJava____parent };
	}

	public static final void pattern_TypeParameter_10_6_registerobjectstomatch_expressionBBBBBB(TypeParameter _this,
			Match match, TPackage tPackageLang, TypeGraph pg, TClass tClass, TPackage tPackageJava) {
		_this.registerObjectsToMatch_BWD(match, tPackageLang, pg, tClass, tPackageJava);

	}

	public static final boolean pattern_TypeParameter_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeParameter_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_17_1_preparereturnvalue_bindingFB(TypeParameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypeParameter _this) {
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

	public static final Object[] pattern_TypeParameter_17_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeParameter _this) {
		Object[] result_pattern_TypeParameter_17_1_preparereturnvalue_binding = pattern_TypeParameter_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeParameter_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeParameter_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeParameter_17_1_preparereturnvalue_black = pattern_TypeParameter_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeParameter_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeParameter_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeParameter_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_TypeParameter_17_2_testcorematchandDECs_blackBFFF(
			TPackage tPackageLang) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		TPackage tPackageJava = tPackageLang.getParent();
		if (tPackageJava != null) {
			if (!tPackageJava.equals(tPackageLang)) {
				String tPackageLang_tName = tPackageLang.getTName();
				if (tPackageLang_tName.equals("lang")) {
					String tPackageJava_tName = tPackageJava.getTName();
					if (tPackageJava_tName.equals("java")) {
						for (TClass tClass : tPackageLang.getClasses()) {
							String tClass_tName = tClass.getTName();
							if (tClass_tName.equals("Object")) {
								for (TypeGraph pg : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(tPackageJava, TypeGraph.class, "packages")) {
									_result.add(new Object[] { tPackageLang, pg, tClass, tPackageJava });
								}
							}

						}
					}

				}

			}
		}

		return _result;
	}

	public static final Object[] pattern_TypeParameter_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeParameter_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			TypeParameter _this, Match match, TPackage tPackageLang, TypeGraph pg, TClass tClass,
			TPackage tPackageJava) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tPackageLang, pg, tClass, tPackageJava);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeParameter_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeParameter _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeParameter_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeParameter_18_1_preparereturnvalue_bindingFB(TypeParameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypeParameter _this) {
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

	public static final Object[] pattern_TypeParameter_18_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeParameter _this) {
		Object[] result_pattern_TypeParameter_18_1_preparereturnvalue_binding = pattern_TypeParameter_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeParameter_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeParameter_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeParameter_18_1_preparereturnvalue_black = pattern_TypeParameter_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeParameter_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeParameter_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeParameter_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TypeParameter_18_2_testcorematchandDECs_black_nac_0BB(
			org.eclipse.modisco.java.TypeParameter typeParameter, MGravityModel model) {
		for (MGravityModel __DEC_typeParameter_typeParameters_870981 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeParameter, MGravityModel.class, "typeParameters")) {
			if (!model.equals(__DEC_typeParameter_typeParameters_870981)) {
				return new Object[] { typeParameter, model };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_18_2_testcorematchandDECs_black_nac_1BB(
			org.eclipse.modisco.java.TypeParameter typeParameter, MGravityModel model) {
		for (Model __DEC_typeParameter_orphanTypes_242305 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeParameter, Model.class, "orphanTypes")) {
			if (!model.equals(__DEC_typeParameter_orphanTypes_242305)) {
				return new Object[] { typeParameter, model };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_18_2_testcorematchandDECs_black_nac_2BB(MGravityModel model,
			org.eclipse.modisco.java.TypeParameter typeParameter) {
		if (model.getOrphanTypes().contains(typeParameter)) {
			return new Object[] { model, typeParameter };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeParameter_18_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_typeParameters) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpModel = _edge_typeParameters.getSrc();
		if (tmpModel instanceof MGravityModel) {
			MGravityModel model = (MGravityModel) tmpModel;
			EObject tmpTypeParameter = _edge_typeParameters.getTrg();
			if (tmpTypeParameter instanceof org.eclipse.modisco.java.TypeParameter) {
				org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) tmpTypeParameter;
				if (model.getTypeParameters().contains(typeParameter)) {
					if (pattern_TypeParameter_18_2_testcorematchandDECs_black_nac_0BB(typeParameter, model) == null) {
						if (pattern_TypeParameter_18_2_testcorematchandDECs_black_nac_1BB(typeParameter,
								model) == null) {
							if (pattern_TypeParameter_18_2_testcorematchandDECs_black_nac_2BB(model,
									typeParameter) == null) {
								for (org.eclipse.modisco.java.Package java : model.getOwnedElements()) {
									for (org.eclipse.modisco.java.Package lang : java.getOwnedPackages()) {
										if (!java.equals(lang)) {
											for (AbstractTypeDeclaration tmpObject : lang.getOwnedElements()) {
												if (tmpObject instanceof ClassDeclaration) {
													ClassDeclaration object = (ClassDeclaration) tmpObject;
													String object_name = object.getName();
													if (object_name.equals("Object")) {
														_result.add(new Object[] { model, typeParameter, java, object,
																lang, _edge_typeParameters });
													}

												}
											}
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

	public static final Object[] pattern_TypeParameter_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeParameter_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			TypeParameter _this, Match match, MGravityModel model, org.eclipse.modisco.java.TypeParameter typeParameter,
			org.eclipse.modisco.java.Package java, ClassDeclaration object, org.eclipse.modisco.java.Package lang) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, model, typeParameter, java, object, lang);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeParameter_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeParameter _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeParameter_18_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeParameter_21_1_prepare_blackB(TypeParameter _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeParameter_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_TypeParameter_21_2_matchsrctrgcontext_bindingFFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("model");
		EObject _localVariable_1 = targetMatch.getObject("tPackageLang");
		EObject _localVariable_2 = sourceMatch.getObject("typeParameter");
		EObject _localVariable_3 = sourceMatch.getObject("java");
		EObject _localVariable_4 = targetMatch.getObject("pg");
		EObject _localVariable_5 = sourceMatch.getObject("object");
		EObject _localVariable_6 = targetMatch.getObject("tClass");
		EObject _localVariable_7 = sourceMatch.getObject("lang");
		EObject _localVariable_8 = targetMatch.getObject("tPackageJava");
		EObject tmpModel = _localVariable_0;
		EObject tmpTPackageLang = _localVariable_1;
		EObject tmpTypeParameter = _localVariable_2;
		EObject tmpJava = _localVariable_3;
		EObject tmpPg = _localVariable_4;
		EObject tmpObject = _localVariable_5;
		EObject tmpTClass = _localVariable_6;
		EObject tmpLang = _localVariable_7;
		EObject tmpTPackageJava = _localVariable_8;
		if (tmpModel instanceof MGravityModel) {
			MGravityModel model = (MGravityModel) tmpModel;
			if (tmpTPackageLang instanceof TPackage) {
				TPackage tPackageLang = (TPackage) tmpTPackageLang;
				if (tmpTypeParameter instanceof org.eclipse.modisco.java.TypeParameter) {
					org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) tmpTypeParameter;
					if (tmpJava instanceof org.eclipse.modisco.java.Package) {
						org.eclipse.modisco.java.Package java = (org.eclipse.modisco.java.Package) tmpJava;
						if (tmpPg instanceof TypeGraph) {
							TypeGraph pg = (TypeGraph) tmpPg;
							if (tmpObject instanceof ClassDeclaration) {
								ClassDeclaration object = (ClassDeclaration) tmpObject;
								if (tmpTClass instanceof TClass) {
									TClass tClass = (TClass) tmpTClass;
									if (tmpLang instanceof org.eclipse.modisco.java.Package) {
										org.eclipse.modisco.java.Package lang = (org.eclipse.modisco.java.Package) tmpLang;
										if (tmpTPackageJava instanceof TPackage) {
											TPackage tPackageJava = (TPackage) tmpTPackageJava;
											return new Object[] { model, tPackageLang, typeParameter, java, pg, object,
													tClass, lang, tPackageJava, sourceMatch, targetMatch };
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

	public static final Object[] pattern_TypeParameter_21_2_matchsrctrgcontext_blackBBBBBBBBBBB(MGravityModel model,
			TPackage tPackageLang, org.eclipse.modisco.java.TypeParameter typeParameter,
			org.eclipse.modisco.java.Package java, TypeGraph pg, ClassDeclaration object, TClass tClass,
			org.eclipse.modisco.java.Package lang, TPackage tPackageJava, Match sourceMatch, Match targetMatch) {
		if (!java.equals(lang)) {
			if (!tPackageJava.equals(tPackageLang)) {
				if (!sourceMatch.equals(targetMatch)) {
					String tPackageLang_tName = tPackageLang.getTName();
					if (tPackageLang_tName.equals("lang")) {
						String object_name = object.getName();
						if (object_name.equals("Object")) {
							String tClass_tName = tClass.getTName();
							if (tClass_tName.equals("Object")) {
								String tPackageJava_tName = tPackageJava.getTName();
								if (tPackageJava_tName.equals("java")) {
									return new Object[] { model, tPackageLang, typeParameter, java, pg, object, tClass,
											lang, tPackageJava, sourceMatch, targetMatch };
								}

							}

						}

					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeParameter_21_2_matchsrctrgcontext_binding = pattern_TypeParameter_21_2_matchsrctrgcontext_bindingFFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_TypeParameter_21_2_matchsrctrgcontext_binding != null) {
			MGravityModel model = (MGravityModel) result_pattern_TypeParameter_21_2_matchsrctrgcontext_binding[0];
			TPackage tPackageLang = (TPackage) result_pattern_TypeParameter_21_2_matchsrctrgcontext_binding[1];
			org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) result_pattern_TypeParameter_21_2_matchsrctrgcontext_binding[2];
			org.eclipse.modisco.java.Package java = (org.eclipse.modisco.java.Package) result_pattern_TypeParameter_21_2_matchsrctrgcontext_binding[3];
			TypeGraph pg = (TypeGraph) result_pattern_TypeParameter_21_2_matchsrctrgcontext_binding[4];
			ClassDeclaration object = (ClassDeclaration) result_pattern_TypeParameter_21_2_matchsrctrgcontext_binding[5];
			TClass tClass = (TClass) result_pattern_TypeParameter_21_2_matchsrctrgcontext_binding[6];
			org.eclipse.modisco.java.Package lang = (org.eclipse.modisco.java.Package) result_pattern_TypeParameter_21_2_matchsrctrgcontext_binding[7];
			TPackage tPackageJava = (TPackage) result_pattern_TypeParameter_21_2_matchsrctrgcontext_binding[8];

			Object[] result_pattern_TypeParameter_21_2_matchsrctrgcontext_black = pattern_TypeParameter_21_2_matchsrctrgcontext_blackBBBBBBBBBBB(
					model, tPackageLang, typeParameter, java, pg, object, tClass, lang, tPackageJava, sourceMatch,
					targetMatch);
			if (result_pattern_TypeParameter_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { model, tPackageLang, typeParameter, java, pg, object, tClass, lang, tPackageJava,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_21_3_solvecsp_bindingFBBBBBBBBBBBB(TypeParameter _this,
			MGravityModel model, TPackage tPackageLang, org.eclipse.modisco.java.TypeParameter typeParameter,
			org.eclipse.modisco.java.Package java, TypeGraph pg, ClassDeclaration object, TClass tClass,
			org.eclipse.modisco.java.Package lang, TPackage tPackageJava, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_9 = _this.isApplicable_solveCsp_CC(model, tPackageLang, typeParameter, java, pg, object,
				tClass, lang, tPackageJava, sourceMatch, targetMatch);
		CSP csp = _localVariable_9;
		if (csp != null) {
			return new Object[] { csp, _this, model, tPackageLang, typeParameter, java, pg, object, tClass, lang,
					tPackageJava, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeParameter_21_3_solvecsp_bindingAndBlackFBBBBBBBBBBBB(TypeParameter _this,
			MGravityModel model, TPackage tPackageLang, org.eclipse.modisco.java.TypeParameter typeParameter,
			org.eclipse.modisco.java.Package java, TypeGraph pg, ClassDeclaration object, TClass tClass,
			org.eclipse.modisco.java.Package lang, TPackage tPackageJava, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeParameter_21_3_solvecsp_binding = pattern_TypeParameter_21_3_solvecsp_bindingFBBBBBBBBBBBB(
				_this, model, tPackageLang, typeParameter, java, pg, object, tClass, lang, tPackageJava, sourceMatch,
				targetMatch);
		if (result_pattern_TypeParameter_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypeParameter_21_3_solvecsp_binding[0];

			Object[] result_pattern_TypeParameter_21_3_solvecsp_black = pattern_TypeParameter_21_3_solvecsp_blackB(csp);
			if (result_pattern_TypeParameter_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, model, tPackageLang, typeParameter, java, pg, object, tClass, lang,
						tPackageJava, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeParameter_21_5_matchcorrcontext_blackBBFFBBBFBBFBBB(
			MGravityModel model, TPackage tPackageLang, org.eclipse.modisco.java.Package java, TypeGraph pg,
			ClassDeclaration object, TClass tClass, org.eclipse.modisco.java.Package lang, TPackage tPackageJava,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!java.equals(lang)) {
			if (!tPackageJava.equals(tPackageLang)) {
				if (!sourceMatch.equals(targetMatch)) {
					String tPackageLang_tName = tPackageLang.getTName();
					if (tPackageLang_tName.equals("lang")) {
						String object_name = object.getName();
						if (object_name.equals("Object")) {
							String tClass_tName = tClass.getTName();
							if (tClass_tName.equals("Object")) {
								String tPackageJava_tName = tPackageJava.getTName();
								if (tPackageJava_tName.equals("java")) {
									for (TypeToTAbstractType objectToObject : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(object, TypeToTAbstractType.class, "source")) {
										if (tClass.equals(objectToObject.getTarget())) {
											for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(pg, ModelToTypeGraph.class, "target")) {
												if (model.equals(eModelToPg.getSource())) {
													for (PackageToTPackage langToLang : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(lang, PackageToTPackage.class,
																	"source")) {
														if (tPackageLang.equals(langToLang.getTarget())) {
															for (PackageToTPackage javaToJava : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(java,
																			PackageToTPackage.class, "source")) {
																if (!javaToJava.equals(langToLang)) {
																	if (tPackageJava.equals(javaToJava.getTarget())) {
																		_result.add(new Object[] { model, tPackageLang,
																				javaToJava, objectToObject, java, pg,
																				object, eModelToPg, tClass, lang,
																				langToLang, tPackageJava, sourceMatch,
																				targetMatch });
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeParameter_21_5_matchcorrcontext_greenBBBBBBF(PackageToTPackage javaToJava,
			TypeToTAbstractType objectToObject, ModelToTypeGraph eModelToPg, PackageToTPackage langToLang,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "TypeParameter";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(javaToJava);
		ccMatch.getAllContextElements().add(objectToObject);
		ccMatch.getAllContextElements().add(eModelToPg);
		ccMatch.getAllContextElements().add(langToLang);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { javaToJava, objectToObject, eModelToPg, langToLang, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_TypeParameter_21_6_createcorrespondence_blackBBBBBBBBBB(MGravityModel model,
			TPackage tPackageLang, org.eclipse.modisco.java.TypeParameter typeParameter,
			org.eclipse.modisco.java.Package java, TypeGraph pg, ClassDeclaration object, TClass tClass,
			org.eclipse.modisco.java.Package lang, TPackage tPackageJava, CCMatch ccMatch) {
		if (!java.equals(lang)) {
			if (!tPackageJava.equals(tPackageLang)) {
				return new Object[] { model, tPackageLang, typeParameter, java, pg, object, tClass, lang, tPackageJava,
						ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_21_6_createcorrespondence_greenBFBB(
			org.eclipse.modisco.java.TypeParameter typeParameter, TClass tClass, CCMatch ccMatch) {
		TypeToTAbstractType templateTypeToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		templateTypeToTClass.setSource(typeParameter);
		templateTypeToTClass.setTarget(tClass);
		ccMatch.getCreateCorr().add(templateTypeToTClass);
		return new Object[] { typeParameter, templateTypeToTClass, tClass, ccMatch };
	}

	public static final Object[] pattern_TypeParameter_21_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_TypeParameter_21_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "TypeParameter";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeParameter_21_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_TypeParameter_24_1_matchtggpattern_black_nac_0BB(
			org.eclipse.modisco.java.TypeParameter typeParameter, MGravityModel model) {
		for (MGravityModel __DEC_typeParameter_typeParameters_295279 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeParameter, MGravityModel.class, "typeParameters")) {
			if (!model.equals(__DEC_typeParameter_typeParameters_295279)) {
				return new Object[] { typeParameter, model };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_24_1_matchtggpattern_black_nac_1BB(
			org.eclipse.modisco.java.TypeParameter typeParameter, MGravityModel model) {
		for (Model __DEC_typeParameter_orphanTypes_822569 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeParameter, Model.class, "orphanTypes")) {
			if (!model.equals(__DEC_typeParameter_orphanTypes_822569)) {
				return new Object[] { typeParameter, model };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_24_1_matchtggpattern_black_nac_2BB(MGravityModel model,
			org.eclipse.modisco.java.TypeParameter typeParameter) {
		if (model.getOrphanTypes().contains(typeParameter)) {
			return new Object[] { model, typeParameter };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_24_1_matchtggpattern_blackBBBBB(MGravityModel model,
			org.eclipse.modisco.java.TypeParameter typeParameter, org.eclipse.modisco.java.Package java,
			ClassDeclaration object, org.eclipse.modisco.java.Package lang) {
		if (!java.equals(lang)) {
			if (model.getTypeParameters().contains(typeParameter)) {
				if (model.getOwnedElements().contains(java)) {
					if (java.getOwnedPackages().contains(lang)) {
						if (lang.getOwnedElements().contains(object)) {
							String object_name = object.getName();
							if (object_name.equals("Object")) {
								if (pattern_TypeParameter_24_1_matchtggpattern_black_nac_0BB(typeParameter,
										model) == null) {
									if (pattern_TypeParameter_24_1_matchtggpattern_black_nac_1BB(typeParameter,
											model) == null) {
										if (pattern_TypeParameter_24_1_matchtggpattern_black_nac_2BB(model,
												typeParameter) == null) {
											return new Object[] { model, typeParameter, java, object, lang };
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

	public static final boolean pattern_TypeParameter_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeParameter_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_25_1_matchtggpattern_blackBBBB(TPackage tPackageLang,
			TypeGraph pg, TClass tClass, TPackage tPackageJava) {
		if (!tPackageJava.equals(tPackageLang)) {
			if (pg.getPackages().contains(tPackageJava)) {
				if (tPackageLang.getClasses().contains(tClass)) {
					if (tPackageJava.getSubpackages().contains(tPackageLang)) {
						String tPackageLang_tName = tPackageLang.getTName();
						if (tPackageLang_tName.equals("lang")) {
							String tClass_tName = tClass.getTName();
							if (tClass_tName.equals("Object")) {
								String tPackageJava_tName = tPackageJava.getTName();
								if (tPackageJava_tName.equals("java")) {
									return new Object[] { tPackageLang, pg, tClass, tPackageJava };
								}

							}

						}

					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeParameter_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_26_1_createresult_blackB(TypeParameter _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeParameter_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_TypeParameter_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MGravityModel model) {
		if (ruleResult.getSourceObjects().contains(model)) {
			return new Object[] { ruleResult, model };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.modisco.java.Package java) {
		if (ruleResult.getSourceObjects().contains(java)) {
			return new Object[] { ruleResult, java };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.modisco.java.Package lang) {
		if (ruleResult.getSourceObjects().contains(lang)) {
			return new Object[] { ruleResult, lang };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_26_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ClassDeclaration object) {
		if (ruleResult.getSourceObjects().contains(object)) {
			return new Object[] { ruleResult, object };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_26_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType objectToObject) {
		if (ruleResult.getCorrObjects().contains(objectToObject)) {
			return new Object[] { ruleResult, objectToObject };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_26_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TClass tClass) {
		if (ruleResult.getTargetObjects().contains(tClass)) {
			return new Object[] { ruleResult, tClass };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_26_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, TPackage tPackageLang) {
		if (ruleResult.getTargetObjects().contains(tPackageLang)) {
			return new Object[] { ruleResult, tPackageLang };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_26_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, TPackage tPackageJava) {
		if (ruleResult.getTargetObjects().contains(tPackageJava)) {
			return new Object[] { ruleResult, tPackageJava };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_26_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_26_2_isapplicablecore_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph eModelToPg) {
		if (ruleResult.getCorrObjects().contains(eModelToPg)) {
			return new Object[] { ruleResult, eModelToPg };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_26_2_isapplicablecore_black_nac_10BB(
			ModelgeneratorRuleResult ruleResult, PackageToTPackage javaToJava) {
		if (ruleResult.getCorrObjects().contains(javaToJava)) {
			return new Object[] { ruleResult, javaToJava };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_26_2_isapplicablecore_black_nac_11BB(
			ModelgeneratorRuleResult ruleResult, PackageToTPackage langToLang) {
		if (ruleResult.getCorrObjects().contains(langToLang)) {
			return new Object[] { ruleResult, langToLang };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeParameter_26_2_isapplicablecore_blackFFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList objectToObjectList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpObjectToObject : objectToObjectList.getEntryObjects()) {
				if (tmpObjectToObject instanceof TypeToTAbstractType) {
					TypeToTAbstractType objectToObject = (TypeToTAbstractType) tmpObjectToObject;
					Type tmpObject = objectToObject.getSource();
					if (tmpObject instanceof ClassDeclaration) {
						ClassDeclaration object = (ClassDeclaration) tmpObject;
						TAbstractType tmpTClass = objectToObject.getTarget();
						if (tmpTClass instanceof TClass) {
							TClass tClass = (TClass) tmpTClass;
							org.eclipse.modisco.java.Package lang = object.getPackage();
							if (lang != null) {
								String object_name = object.getName();
								if (object_name.equals("Object")) {
									String tClass_tName = tClass.getTName();
									if (tClass_tName.equals("Object")) {
										org.eclipse.modisco.java.Package java = lang.getPackage();
										if (java != null) {
											if (!java.equals(lang)) {
												Model tmpModel = java.getModel();
												if (tmpModel instanceof MGravityModel) {
													MGravityModel model = (MGravityModel) tmpModel;
													if (pattern_TypeParameter_26_2_isapplicablecore_black_nac_4BB(
															ruleResult, objectToObject) == null) {
														if (pattern_TypeParameter_26_2_isapplicablecore_black_nac_3BB(
																ruleResult, object) == null) {
															if (pattern_TypeParameter_26_2_isapplicablecore_black_nac_5BB(
																	ruleResult, tClass) == null) {
																if (pattern_TypeParameter_26_2_isapplicablecore_black_nac_2BB(
																		ruleResult, lang) == null) {
																	if (pattern_TypeParameter_26_2_isapplicablecore_black_nac_1BB(
																			ruleResult, java) == null) {
																		if (pattern_TypeParameter_26_2_isapplicablecore_black_nac_0BB(
																				ruleResult, model) == null) {
																			for (TPackage tPackageLang : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(tClass,
																							TPackage.class,
																							"classes")) {
																				TPackage tPackageJava = tPackageLang
																						.getParent();
																				if (tPackageJava != null) {
																					if (!tPackageJava
																							.equals(tPackageLang)) {
																						String tPackageLang_tName = tPackageLang
																								.getTName();
																						if (tPackageLang_tName
																								.equals("lang")) {
																							String tPackageJava_tName = tPackageJava
																									.getTName();
																							if (tPackageJava_tName
																									.equals("java")) {
																								if (pattern_TypeParameter_26_2_isapplicablecore_black_nac_6BB(
																										ruleResult,
																										tPackageLang) == null) {
																									if (pattern_TypeParameter_26_2_isapplicablecore_black_nac_7BB(
																											ruleResult,
																											tPackageJava) == null) {
																										for (PackageToTPackage langToLang : org.moflon.core.utilities.eMoflonEMFUtil
																												.getOppositeReferenceTyped(
																														lang,
																														PackageToTPackage.class,
																														"source")) {
																											if (tPackageLang
																													.equals(langToLang
																															.getTarget())) {
																												if (pattern_TypeParameter_26_2_isapplicablecore_black_nac_11BB(
																														ruleResult,
																														langToLang) == null) {
																													for (PackageToTPackage javaToJava : org.moflon.core.utilities.eMoflonEMFUtil
																															.getOppositeReferenceTyped(
																																	java,
																																	PackageToTPackage.class,
																																	"source")) {
																														if (!javaToJava
																																.equals(langToLang)) {
																															if (tPackageJava
																																	.equals(javaToJava
																																			.getTarget())) {
																																if (pattern_TypeParameter_26_2_isapplicablecore_black_nac_10BB(
																																		ruleResult,
																																		javaToJava) == null) {
																																	for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil
																																			.getOppositeReferenceTyped(
																																					model,
																																					ModelToTypeGraph.class,
																																					"source")) {
																																		TypeGraph pg = eModelToPg
																																				.getTarget();
																																		if (pg != null) {
																																			if (pg.getPackages()
																																					.contains(
																																							tPackageJava)) {
																																				if (pattern_TypeParameter_26_2_isapplicablecore_black_nac_9BB(
																																						ruleResult,
																																						eModelToPg) == null) {
																																					if (pattern_TypeParameter_26_2_isapplicablecore_black_nac_8BB(
																																							ruleResult,
																																							pg) == null) {
																																						_result.add(
																																								new Object[] {
																																										objectToObjectList,
																																										model,
																																										java,
																																										lang,
																																										object,
																																										objectToObject,
																																										tClass,
																																										tPackageLang,
																																										tPackageJava,
																																										pg,
																																										eModelToPg,
																																										javaToJava,
																																										langToLang,
																																										ruleEntryContainer,
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
																				}

																			}
																		}
																	}
																}
															}
														}
													}
												}

											}
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

	public static final Object[] pattern_TypeParameter_26_3_solveCSP_bindingFBBBBBBBBBBBBBBB(TypeParameter _this,
			IsApplicableMatch isApplicableMatch, MGravityModel model, TPackage tPackageLang,
			PackageToTPackage javaToJava, TypeToTAbstractType objectToObject, org.eclipse.modisco.java.Package java,
			TypeGraph pg, ClassDeclaration object, ModelToTypeGraph eModelToPg, TClass tClass,
			org.eclipse.modisco.java.Package lang, PackageToTPackage langToLang, TPackage tPackageJava,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, model, tPackageLang, javaToJava,
				objectToObject, java, pg, object, eModelToPg, tClass, lang, langToLang, tPackageJava, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, tPackageLang, javaToJava, objectToObject, java,
					pg, object, eModelToPg, tClass, lang, langToLang, tPackageJava, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeParameter_26_3_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBB(
			TypeParameter _this, IsApplicableMatch isApplicableMatch, MGravityModel model, TPackage tPackageLang,
			PackageToTPackage javaToJava, TypeToTAbstractType objectToObject, org.eclipse.modisco.java.Package java,
			TypeGraph pg, ClassDeclaration object, ModelToTypeGraph eModelToPg, TClass tClass,
			org.eclipse.modisco.java.Package lang, PackageToTPackage langToLang, TPackage tPackageJava,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypeParameter_26_3_solveCSP_binding = pattern_TypeParameter_26_3_solveCSP_bindingFBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, model, tPackageLang, javaToJava, objectToObject, java, pg, object, eModelToPg,
				tClass, lang, langToLang, tPackageJava, ruleResult);
		if (result_pattern_TypeParameter_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeParameter_26_3_solveCSP_binding[0];

			Object[] result_pattern_TypeParameter_26_3_solveCSP_black = pattern_TypeParameter_26_3_solveCSP_blackB(csp);
			if (result_pattern_TypeParameter_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, tPackageLang, javaToJava, objectToObject,
						java, pg, object, eModelToPg, tClass, lang, langToLang, tPackageJava, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter_26_4_checkCSP_expressionFBB(TypeParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_26_5_checknacs_blackBBBBBBBBBBBB(MGravityModel model,
			TPackage tPackageLang, PackageToTPackage javaToJava, TypeToTAbstractType objectToObject,
			org.eclipse.modisco.java.Package java, TypeGraph pg, ClassDeclaration object, ModelToTypeGraph eModelToPg,
			TClass tClass, org.eclipse.modisco.java.Package lang, PackageToTPackage langToLang, TPackage tPackageJava) {
		if (!javaToJava.equals(langToLang)) {
			if (!java.equals(lang)) {
				if (!tPackageJava.equals(tPackageLang)) {
					String tPackageLang_tName = tPackageLang.getTName();
					if (tPackageLang_tName.equals("lang")) {
						String object_name = object.getName();
						if (object_name.equals("Object")) {
							String tClass_tName = tClass.getTName();
							if (tClass_tName.equals("Object")) {
								String tPackageJava_tName = tPackageJava.getTName();
								if (tPackageJava_tName.equals("java")) {
									return new Object[] { model, tPackageLang, javaToJava, objectToObject, java, pg,
											object, eModelToPg, tClass, lang, langToLang, tPackageJava };
								}

							}

						}

					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_26_6_perform_blackBBBBBBBBBBBBB(MGravityModel model,
			TPackage tPackageLang, PackageToTPackage javaToJava, TypeToTAbstractType objectToObject,
			org.eclipse.modisco.java.Package java, TypeGraph pg, ClassDeclaration object, ModelToTypeGraph eModelToPg,
			TClass tClass, org.eclipse.modisco.java.Package lang, PackageToTPackage langToLang, TPackage tPackageJava,
			ModelgeneratorRuleResult ruleResult) {
		if (!javaToJava.equals(langToLang)) {
			if (!java.equals(lang)) {
				if (!tPackageJava.equals(tPackageLang)) {
					String tPackageLang_tName = tPackageLang.getTName();
					if (tPackageLang_tName.equals("lang")) {
						String object_name = object.getName();
						if (object_name.equals("Object")) {
							String tClass_tName = tClass.getTName();
							if (tClass_tName.equals("Object")) {
								String tPackageJava_tName = tPackageJava.getTName();
								if (tPackageJava_tName.equals("java")) {
									return new Object[] { model, tPackageLang, javaToJava, objectToObject, java, pg,
											object, eModelToPg, tClass, lang, langToLang, tPackageJava, ruleResult };
								}

							}

						}

					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_26_6_perform_greenBFFBB(MGravityModel model, TClass tClass,
			ModelgeneratorRuleResult ruleResult) {
		org.eclipse.modisco.java.TypeParameter typeParameter = JavaFactory.eINSTANCE.createTypeParameter();
		TypeToTAbstractType templateTypeToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		model.getTypeParameters().add(typeParameter);
		ruleResult.getSourceObjects().add(typeParameter);
		templateTypeToTClass.setSource(typeParameter);
		templateTypeToTClass.setTarget(tClass);
		ruleResult.getCorrObjects().add(templateTypeToTClass);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { model, typeParameter, templateTypeToTClass, tClass, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_TypeParameter_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypeParameterImpl
