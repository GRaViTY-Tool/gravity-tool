/**
 */
package org.gravity.tgg.modisco.pm.Rules;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.ClassDeclaration;

import org.gravity.modisco.MGravityModel;

import org.gravity.tgg.modisco.pm.ModelToTypeGraph;
import org.gravity.tgg.modisco.pm.PackageToTPackage;
import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;

import org.moflon.tgg.runtime.AbstractRule;
import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.ModelgeneratorRuleResult;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.TripleMatch;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.tgg.modisco.pm.Rules.RulesPackage#getTypeParameter()
 * @model
 * @generated
 */
public interface TypeParameter extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, ClassDeclaration object, org.eclipse.modisco.java.Package java,
			org.eclipse.modisco.java.TypeParameter typeParameter, MGravityModel model,
			org.eclipse.modisco.java.Package lang);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjectsToMatch_FWD(Match match, ClassDeclaration object, org.eclipse.modisco.java.Package java,
			org.eclipse.modisco.java.TypeParameter typeParameter, MGravityModel model,
			org.eclipse.modisco.java.Package lang);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, ClassDeclaration object, org.eclipse.modisco.java.Package java,
			org.eclipse.modisco.java.TypeParameter typeParameter, MGravityModel model,
			org.eclipse.modisco.java.Package lang);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToPg,
			ClassDeclaration object, TypeGraph pg, org.eclipse.modisco.java.Package java,
			org.eclipse.modisco.java.TypeParameter typeParameter, TypeToTAbstractType objectToObject,
			PackageToTPackage javaToJava, MGravityModel model, TClass tClass, PackageToTPackage langToLang,
			org.eclipse.modisco.java.Package lang, TPackage tPackageJava, TPackage tPackageLang);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject eModelToPg, EObject templateTypeToTClass,
			EObject object, EObject pg, EObject java, EObject typeParameter, EObject objectToObject, EObject javaToJava,
			EObject model, EObject tClass, EObject langToLang, EObject lang, EObject tPackageJava,
			EObject tPackageLang);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkTypes_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_BWD(Match match, TypeGraph pg, TClass tClass, TPackage tPackageJava, TPackage tPackageLang);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjectsToMatch_BWD(Match match, TypeGraph pg, TClass tClass, TPackage tPackageJava,
			TPackage tPackageLang);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph pg, TClass tClass, TPackage tPackageJava,
			TPackage tPackageLang);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_checkCsp_BWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkTypes_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_TypeGraph_3(TypeGraph pg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_61(EMoflonEdge _edge_typeParameters);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_CC(ClassDeclaration object, TypeGraph pg, org.eclipse.modisco.java.Package java,
			org.eclipse.modisco.java.TypeParameter typeParameter, MGravityModel model, TClass tClass,
			org.eclipse.modisco.java.Package lang, TPackage tPackageJava, TPackage tPackageLang, Match sourceMatch,
			Match targetMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_CC(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_FWD(ClassDeclaration object, org.eclipse.modisco.java.Package java,
			org.eclipse.modisco.java.TypeParameter typeParameter, MGravityModel model,
			org.eclipse.modisco.java.Package lang);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_BWD(TypeGraph pg, TClass tClass, TPackage tPackageJava, TPackage tPackageLang);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ModelToTypeGraph eModelToPgParameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToPg,
			ClassDeclaration object, TypeGraph pg, org.eclipse.modisco.java.Package java,
			TypeToTAbstractType objectToObject, PackageToTPackage javaToJava, MGravityModel model, TClass tClass,
			PackageToTPackage langToLang, org.eclipse.modisco.java.Package lang, TPackage tPackageJava,
			TPackage tPackageLang, ModelgeneratorRuleResult ruleResult);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generateModel_checkCsp_BWD(CSP csp);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TypeParameter
