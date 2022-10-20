/**
 */
package org.gravity.tgg.modisco.uml.Rules;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.Type;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Usage;

import org.gravity.modisco.MClass;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage;

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
 * A representation of the model object '<em><b>Type Dependency2 Usage Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gravity.tgg.modisco.uml.Rules.RulesPackage#getTypeDependency2UsageDependency()
 * @model
 * @generated
 */
public interface TypeDependency2UsageDependency extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.Package mPackage, MClass mSrcType, Type mTrgType);

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
	void registerObjectsToMatch_FWD(Match match, org.eclipse.modisco.java.Package mPackage, MClass mSrcType,
			Type mTrgType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.modisco.java.Package mPackage, MClass mSrcType,
			Type mTrgType);

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
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package mPackage,
			ASTNode2Element trg2Trg, org.eclipse.uml2.uml.Package uPackage, JavaPackage2UmlPackage p2p,
			ASTNode2Element src2Src, Classifier uTrgType, MClass mSrcType, org.eclipse.uml2.uml.Class uSrcType,
			Type mTrgType);

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
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject mPackage, EObject uUsage, EObject trg2Trg,
			EObject uPackage, EObject p2p, EObject src2Src, EObject uTrgType, EObject mSrcType, EObject uSrcType,
			EObject mTrgType);

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
	boolean isAppropriate_BWD(Match match, Usage uUsage, org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType);

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
	void registerObjectsToMatch_BWD(Match match, Usage uUsage, org.eclipse.uml2.uml.Package uPackage,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, Usage uUsage, org.eclipse.uml2.uml.Package uPackage,
			Classifier uTrgType, org.eclipse.uml2.uml.Class uSrcType);

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
	CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package mPackage,
			Usage uUsage, ASTNode2Element trg2Trg, org.eclipse.uml2.uml.Package uPackage, JavaPackage2UmlPackage p2p,
			ASTNode2Element src2Src, Classifier uTrgType, MClass mSrcType, org.eclipse.uml2.uml.Class uSrcType,
			Type mTrgType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_BWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjects_BWD(PerformRuleResult ruleresult, EObject mPackage, EObject uUsage, EObject trg2Trg,
			EObject uPackage, EObject p2p, EObject src2Src, EObject uTrgType, EObject mSrcType, EObject uSrcType,
			EObject mTrgType);

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
	EObjectContainer isAppropriate_BWD_EMoflonEdge_133(EMoflonEdge _edge_packagedElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_142(EMoflonEdge _edge_dependencies);

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
	CSP isApplicable_solveCsp_CC(org.eclipse.modisco.java.Package mPackage, Usage uUsage,
			org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType, MClass mSrcType,
			org.eclipse.uml2.uml.Class uSrcType, Type mTrgType, Match sourceMatch, Match targetMatch);

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
	boolean checkDEC_FWD(org.eclipse.modisco.java.Package mPackage, MClass mSrcType, Type mTrgType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_BWD(Usage uUsage, org.eclipse.uml2.uml.Package uPackage, Classifier uTrgType,
			org.eclipse.uml2.uml.Class uSrcType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element src2SrcParameter,
			ASTNode2Element trg2TrgParameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package mPackage,
			ASTNode2Element trg2Trg, org.eclipse.uml2.uml.Package uPackage, JavaPackage2UmlPackage p2p,
			ASTNode2Element src2Src, Classifier uTrgType, MClass mSrcType, org.eclipse.uml2.uml.Class uSrcType,
			Type mTrgType, ModelgeneratorRuleResult ruleResult);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generateModel_checkCsp_BWD(CSP csp);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // TypeDependency2UsageDependency
