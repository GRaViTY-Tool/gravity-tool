/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.CompilationUnit;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.CompilationUnit2Artifact;

import org.gravity.tgg.modisco.uml.Rules.Manifestation4CompilationUnit2Artifact;
import org.gravity.tgg.modisco.uml.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Manifestation4 Compilation Unit2 Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Manifestation4CompilationUnit2ArtifactImpl extends AbstractRuleImpl
		implements Manifestation4CompilationUnit2Artifact {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Manifestation4CompilationUnit2ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getManifestation4CompilationUnit2Artifact();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, CompilationUnit compilationUnit, AbstractTypeDeclaration type) {

		Object[] result1_black = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_0_1_initialbindings_blackBBBB(this, match,
						compilationUnit, type);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[compilationUnit] = " + compilationUnit + ", " + "[type] = " + type + ".");
		}

		Object[] result2_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_bindingAndBlackFBBBB(this, match,
						compilationUnit, type);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[compilationUnit] = " + compilationUnit + ", " + "[type] = " + type + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_0_4_collectelementstobetranslated_blackBBB(match,
							compilationUnit, type);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[compilationUnit] = " + compilationUnit + ", " + "[type] = " + type + ".");
			}
			Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_0_4_collectelementstobetranslated_greenBBBF(match,
							compilationUnit, type);
			//nothing EMoflonEdge compilationUnit__type____types = (EMoflonEdge) result4_green[3];

			Object[] result5_black = Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_0_5_collectcontextelements_blackBBB(match,
							compilationUnit, type);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[compilationUnit] = " + compilationUnit + ", " + "[type] = " + type + ".");
			}
			Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_0_5_collectcontextelements_greenBBB(match,
							compilationUnit, type);

			// 
			Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_0_6_registerobjectstomatch_expressionBBBB(this,
							match, compilationUnit, type);
			return Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_0_7_expressionF();
		} else {
			return Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Classifier classifier = (Classifier) result1_bindingAndBlack[0];
		CompilationUnit compilationUnit = (CompilationUnit) result1_bindingAndBlack[1];
		Artifact artifact = (Artifact) result1_bindingAndBlack[2];
		CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) result1_bindingAndBlack[3];
		ASTNode2Element t2c = (ASTNode2Element) result1_bindingAndBlack[4];
		AbstractTypeDeclaration type = (AbstractTypeDeclaration) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_greenBBF(classifier,
						artifact);
		Manifestation manifestation = (Manifestation) result1_green[2];

		Object[] result2_black = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_1_2_collecttranslatedelements_blackB(manifestation);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[manifestation] = " + manifestation + ".");
		}
		Object[] result2_green = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_1_2_collecttranslatedelements_greenFB(manifestation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult,
						classifier, compilationUnit, artifact, c2a, t2c, manifestation, type);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[classifier] = " + classifier + ", " + "[compilationUnit] = " + compilationUnit + ", "
					+ "[artifact] = " + artifact + ", " + "[c2a] = " + c2a + ", " + "[t2c] = " + t2c + ", "
					+ "[manifestation] = " + manifestation + ", " + "[type] = " + type + ".");
		}
		Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_1_3_bookkeepingforedges_greenBBBBBBFFF(ruleresult,
						classifier, compilationUnit, artifact, manifestation, type);
		//nothing EMoflonEdge artifact__manifestation____manifestation = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge manifestation__classifier____utilizedElement = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge compilationUnit__type____types = (EMoflonEdge) result3_green[8];

		// 
		// 
		Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_1_5_registerobjects_expressionBBBBBBBBB(this,
						ruleresult, classifier, compilationUnit, artifact, c2a, t2c, manifestation, type);
		return Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		CompilationUnit compilationUnit = (CompilationUnit) result2_binding[0];
		AbstractTypeDeclaration type = (AbstractTypeDeclaration) result2_binding[1];
		for (Object[] result2_black : Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_2_2_corematch_blackFBFFFBB(compilationUnit, type,
						match)) {
			Classifier classifier = (Classifier) result2_black[0];
			Artifact artifact = (Artifact) result2_black[2];
			CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) result2_black[3];
			ASTNode2Element t2c = (ASTNode2Element) result2_black[4];
			// ForEach 
			for (Object[] result3_black : Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_2_3_findcontext_blackBBBBBB(classifier,
							compilationUnit, artifact, c2a, t2c, type)) {
				Object[] result3_green = Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_2_3_findcontext_greenBBBBBBFFFFFF(classifier,
								compilationUnit, artifact, c2a, t2c, type);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge c2a__artifact____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge c2a__compilationUnit____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge compilationUnit__type____types = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge t2c__classifier____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge t2c__type____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, classifier, compilationUnit, artifact, c2a, t2c, type);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[classifier] = " + classifier
							+ ", " + "[compilationUnit] = " + compilationUnit + ", " + "[artifact] = " + artifact + ", "
							+ "[c2a] = " + c2a + ", " + "[t2c] = " + t2c + ", " + "[type] = " + type + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = Manifestation4CompilationUnit2ArtifactImpl
							.pattern_Manifestation4CompilationUnit2Artifact_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					Manifestation4CompilationUnit2ArtifactImpl
							.pattern_Manifestation4CompilationUnit2Artifact_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, CompilationUnit compilationUnit, AbstractTypeDeclaration type) {
		match.registerObject("compilationUnit", compilationUnit);
		match.registerObject("type", type);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, CompilationUnit compilationUnit, AbstractTypeDeclaration type) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Classifier classifier,
			CompilationUnit compilationUnit, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			AbstractTypeDeclaration type) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("classifier", classifier);
		isApplicableMatch.registerObject("compilationUnit", compilationUnit);
		isApplicableMatch.registerObject("artifact", artifact);
		isApplicableMatch.registerObject("c2a", c2a);
		isApplicableMatch.registerObject("t2c", t2c);
		isApplicableMatch.registerObject("type", type);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject classifier, EObject compilationUnit,
			EObject artifact, EObject c2a, EObject t2c, EObject manifestation, EObject type) {
		ruleresult.registerObject("classifier", classifier);
		ruleresult.registerObject("compilationUnit", compilationUnit);
		ruleresult.registerObject("artifact", artifact);
		ruleresult.registerObject("c2a", c2a);
		ruleresult.registerObject("t2c", t2c);
		ruleresult.registerObject("manifestation", manifestation);
		ruleresult.registerObject("type", type);

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
	public boolean isAppropriate_BWD(Match match, Classifier classifier, Artifact artifact,
			Manifestation manifestation) {

		Object[] result1_black = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_10_1_initialbindings_blackBBBBB(this, match, classifier,
						artifact, manifestation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[classifier] = " + classifier + ", " + "[artifact] = " + artifact
					+ ", " + "[manifestation] = " + manifestation + ".");
		}

		Object[] result2_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
						classifier, artifact, manifestation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[classifier] = " + classifier + ", " + "[artifact] = " + artifact
					+ ", " + "[manifestation] = " + manifestation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_10_4_collectelementstobetranslated_blackBBBB(match,
							classifier, artifact, manifestation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[classifier] = " + classifier + ", " + "[artifact] = " + artifact + ", "
						+ "[manifestation] = " + manifestation + ".");
			}
			Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_10_4_collectelementstobetranslated_greenBBBBFF(
							match, classifier, artifact, manifestation);
			//nothing EMoflonEdge artifact__manifestation____manifestation = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge manifestation__classifier____utilizedElement = (EMoflonEdge) result4_green[5];

			Object[] result5_black = Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_10_5_collectcontextelements_blackBBBB(match,
							classifier, artifact, manifestation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[classifier] = " + classifier + ", " + "[artifact] = " + artifact + ", "
						+ "[manifestation] = " + manifestation + ".");
			}
			Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_10_5_collectcontextelements_greenBBB(match,
							classifier, artifact);

			// 
			Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_10_6_registerobjectstomatch_expressionBBBBB(this,
							match, classifier, artifact, manifestation);
			return Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_10_7_expressionF();
		} else {
			return Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Classifier classifier = (Classifier) result1_bindingAndBlack[0];
		CompilationUnit compilationUnit = (CompilationUnit) result1_bindingAndBlack[1];
		Artifact artifact = (Artifact) result1_bindingAndBlack[2];
		CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) result1_bindingAndBlack[3];
		ASTNode2Element t2c = (ASTNode2Element) result1_bindingAndBlack[4];
		Manifestation manifestation = (Manifestation) result1_bindingAndBlack[5];
		AbstractTypeDeclaration type = (AbstractTypeDeclaration) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_greenBB(compilationUnit,
						type);

		Object[] result2_black = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_11_2_collecttranslatedelements_blackB(manifestation);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[manifestation] = " + manifestation + ".");
		}
		Object[] result2_green = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_11_2_collecttranslatedelements_greenFB(manifestation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult,
						classifier, compilationUnit, artifact, c2a, t2c, manifestation, type);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[classifier] = " + classifier + ", " + "[compilationUnit] = " + compilationUnit + ", "
					+ "[artifact] = " + artifact + ", " + "[c2a] = " + c2a + ", " + "[t2c] = " + t2c + ", "
					+ "[manifestation] = " + manifestation + ", " + "[type] = " + type + ".");
		}
		Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_11_3_bookkeepingforedges_greenBBBBBBFFF(ruleresult,
						classifier, compilationUnit, artifact, manifestation, type);
		//nothing EMoflonEdge artifact__manifestation____manifestation = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge manifestation__classifier____utilizedElement = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge compilationUnit__type____types = (EMoflonEdge) result3_green[8];

		// 
		// 
		Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_11_5_registerobjects_expressionBBBBBBBBB(this,
						ruleresult, classifier, compilationUnit, artifact, c2a, t2c, manifestation, type);
		return Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Classifier classifier = (Classifier) result2_binding[0];
		Artifact artifact = (Artifact) result2_binding[1];
		Manifestation manifestation = (Manifestation) result2_binding[2];
		for (Object[] result2_black : Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_12_2_corematch_blackBFBFFBFB(classifier, artifact,
						manifestation, match)) {
			CompilationUnit compilationUnit = (CompilationUnit) result2_black[1];
			CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) result2_black[3];
			ASTNode2Element t2c = (ASTNode2Element) result2_black[4];
			AbstractTypeDeclaration type = (AbstractTypeDeclaration) result2_black[6];
			// ForEach 
			for (Object[] result3_black : Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_12_3_findcontext_blackBBBBBBB(classifier,
							compilationUnit, artifact, c2a, t2c, manifestation, type)) {
				Object[] result3_green = Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_12_3_findcontext_greenBBBBBBBFFFFFFF(classifier,
								compilationUnit, artifact, c2a, t2c, manifestation, type);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge c2a__artifact____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge artifact__manifestation____manifestation = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge manifestation__classifier____utilizedElement = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge c2a__compilationUnit____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge t2c__classifier____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge t2c__type____source = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, classifier, compilationUnit, artifact, c2a, t2c, manifestation,
								type);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[classifier] = " + classifier
							+ ", " + "[compilationUnit] = " + compilationUnit + ", " + "[artifact] = " + artifact + ", "
							+ "[c2a] = " + c2a + ", " + "[t2c] = " + t2c + ", " + "[manifestation] = " + manifestation
							+ ", " + "[type] = " + type + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = Manifestation4CompilationUnit2ArtifactImpl
							.pattern_Manifestation4CompilationUnit2Artifact_12_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					Manifestation4CompilationUnit2ArtifactImpl
							.pattern_Manifestation4CompilationUnit2Artifact_12_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Classifier classifier, Artifact artifact,
			Manifestation manifestation) {
		match.registerObject("classifier", classifier);
		match.registerObject("artifact", artifact);
		match.registerObject("manifestation", manifestation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Classifier classifier, Artifact artifact,
			Manifestation manifestation) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Classifier classifier,
			CompilationUnit compilationUnit, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			Manifestation manifestation, AbstractTypeDeclaration type) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("classifier", classifier);
		isApplicableMatch.registerObject("compilationUnit", compilationUnit);
		isApplicableMatch.registerObject("artifact", artifact);
		isApplicableMatch.registerObject("c2a", c2a);
		isApplicableMatch.registerObject("t2c", t2c);
		isApplicableMatch.registerObject("manifestation", manifestation);
		isApplicableMatch.registerObject("type", type);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject classifier, EObject compilationUnit,
			EObject artifact, EObject c2a, EObject t2c, EObject manifestation, EObject type) {
		ruleresult.registerObject("classifier", classifier);
		ruleresult.registerObject("compilationUnit", compilationUnit);
		ruleresult.registerObject("artifact", artifact);
		ruleresult.registerObject("c2a", c2a);
		ruleresult.registerObject("t2c", t2c);
		ruleresult.registerObject("manifestation", manifestation);
		ruleresult.registerObject("type", type);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("manifestation").eClass())
				.equals("uml.Manifestation.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_44(EMoflonEdge _edge_manifestation) {

		Object[] result1_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_blackFFFB(
						_edge_manifestation)) {
			Classifier classifier = (Classifier) result2_black[0];
			Artifact artifact = (Artifact) result2_black[1];
			Manifestation manifestation = (Manifestation) result2_black[2];
			Object[] result2_green = Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, classifier, artifact, manifestation)) {
				// 
				if (Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = Manifestation4CompilationUnit2ArtifactImpl
							.pattern_Manifestation4CompilationUnit2Artifact_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					Manifestation4CompilationUnit2ArtifactImpl
							.pattern_Manifestation4CompilationUnit2Artifact_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_53(EMoflonEdge _edge_types) {

		Object[] result1_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_21_2_testcorematchandDECs_blackFFB(_edge_types)) {
			CompilationUnit compilationUnit = (CompilationUnit) result2_black[0];
			AbstractTypeDeclaration type = (AbstractTypeDeclaration) result2_black[1];
			Object[] result2_green = Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, compilationUnit, type)) {
				// 
				if (Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = Manifestation4CompilationUnit2ArtifactImpl
							.pattern_Manifestation4CompilationUnit2Artifact_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					Manifestation4CompilationUnit2ArtifactImpl
							.pattern_Manifestation4CompilationUnit2Artifact_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Manifestation4CompilationUnit2Artifact");
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
		ruleResult.setRule("Manifestation4CompilationUnit2Artifact");
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

		Object[] result1_black = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Classifier classifier = (Classifier) result2_bindingAndBlack[0];
		CompilationUnit compilationUnit = (CompilationUnit) result2_bindingAndBlack[1];
		Artifact artifact = (Artifact) result2_bindingAndBlack[2];
		Manifestation manifestation = (Manifestation) result2_bindingAndBlack[3];
		AbstractTypeDeclaration type = (AbstractTypeDeclaration) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, classifier,
						compilationUnit, artifact, manifestation, type, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[classifier] = " + classifier + ", " + "[compilationUnit] = " + compilationUnit + ", "
					+ "[artifact] = " + artifact + ", " + "[manifestation] = " + manifestation + ", " + "[type] = "
					+ type + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_24_5_matchcorrcontext_blackBBBFFBBB(classifier,
							compilationUnit, artifact, type, sourceMatch, targetMatch)) {
				CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) result5_black[3];
				ASTNode2Element t2c = (ASTNode2Element) result5_black[4];
				Object[] result5_green = Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_24_5_matchcorrcontext_greenBBBBF(c2a, t2c,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_24_6_createcorrespondence_blackBBBBBB(
								classifier, compilationUnit, artifact, manifestation, type, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[classifier] = "
							+ classifier + ", " + "[compilationUnit] = " + compilationUnit + ", " + "[artifact] = "
							+ artifact + ", " + "[manifestation] = " + manifestation + ", " + "[type] = " + type + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_24_7_addtoreturnedresult_blackBB(result,
								ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_24_7_addtoreturnedresult_greenBB(result,
								ccMatch);

			}

		} else {
		}
		return Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Classifier classifier, CompilationUnit compilationUnit, Artifact artifact,
			Manifestation manifestation, AbstractTypeDeclaration type, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(CompilationUnit compilationUnit, AbstractTypeDeclaration type) {// 
		Object[] result1_black = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_27_1_matchtggpattern_blackBB(compilationUnit, type);
		if (result1_black != null) {
			return Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_27_2_expressionF();
		} else {
			return Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Classifier classifier, Artifact artifact, Manifestation manifestation) {// 
		Object[] result1_black = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_blackBBB(classifier, artifact,
						manifestation);
		if (result1_black != null) {
			return Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_28_2_expressionF();
		} else {
			return Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element t2cParameter,
			CompilationUnit2Artifact c2aParameter) {

		Object[] result1_black = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_blackFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList t2cList = (RuleEntryList) result2_black[0];
			Classifier classifier = (Classifier) result2_black[1];
			ASTNode2Element t2c = (ASTNode2Element) result2_black[2];
			AbstractTypeDeclaration type = (AbstractTypeDeclaration) result2_black[3];
			//nothing RuleEntryList c2aList = (RuleEntryList) result2_black[4];
			CompilationUnit compilationUnit = (CompilationUnit) result2_black[5];
			CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) result2_black[6];
			Artifact artifact = (Artifact) result2_black[7];

			Object[] result3_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, classifier, compilationUnit, artifact, c2a, t2c, type, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[classifier] = " + classifier + ", "
						+ "[compilationUnit] = " + compilationUnit + ", " + "[artifact] = " + artifact + ", "
						+ "[c2a] = " + c2a + ", " + "[t2c] = " + t2c + ", " + "[type] = " + type + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_29_5_checknacs_blackBBBBBB(classifier,
								compilationUnit, artifact, c2a, t2c, type);
				if (result5_black != null) {

					Object[] result6_black = Manifestation4CompilationUnit2ArtifactImpl
							.pattern_Manifestation4CompilationUnit2Artifact_29_6_perform_blackBBBBBBB(classifier,
									compilationUnit, artifact, c2a, t2c, type, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[classifier] = "
								+ classifier + ", " + "[compilationUnit] = " + compilationUnit + ", " + "[artifact] = "
								+ artifact + ", " + "[c2a] = " + c2a + ", " + "[t2c] = " + t2c + ", " + "[type] = "
								+ type + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					Manifestation4CompilationUnit2ArtifactImpl
							.pattern_Manifestation4CompilationUnit2Artifact_29_6_perform_greenBBBFBB(classifier,
									compilationUnit, artifact, type, ruleResult);
					//nothing Manifestation manifestation = (Manifestation) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Classifier classifier,
			CompilationUnit compilationUnit, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			AbstractTypeDeclaration type, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("classifier", classifier);
		isApplicableMatch.registerObject("compilationUnit", compilationUnit);
		isApplicableMatch.registerObject("artifact", artifact);
		isApplicableMatch.registerObject("c2a", c2a);
		isApplicableMatch.registerObject("t2c", t2c);
		isApplicableMatch.registerObject("type", type);
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
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_FWD__MATCH_COMPILATIONUNIT_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (CompilationUnit) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_COMPILATIONUNIT_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (CompilationUnit) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
			return null;
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_COMPILATIONUNIT_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (CompilationUnit) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASSIFIER_COMPILATIONUNIT_ARTIFACT_COMPILATIONUNIT2ARTIFACT_ASTNODE2ELEMENT_ABSTRACTTYPEDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Classifier) arguments.get(1),
					(CompilationUnit) arguments.get(2), (Artifact) arguments.get(3),
					(CompilationUnit2Artifact) arguments.get(4), (ASTNode2Element) arguments.get(5),
					(AbstractTypeDeclaration) arguments.get(6));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_BWD__MATCH_CLASSIFIER_ARTIFACT_MANIFESTATION:
			return isAppropriate_BWD((Match) arguments.get(0), (Classifier) arguments.get(1),
					(Artifact) arguments.get(2), (Manifestation) arguments.get(3));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CLASSIFIER_ARTIFACT_MANIFESTATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Classifier) arguments.get(1),
					(Artifact) arguments.get(2), (Manifestation) arguments.get(3));
			return null;
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CLASSIFIER_ARTIFACT_MANIFESTATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Classifier) arguments.get(1),
					(Artifact) arguments.get(2), (Manifestation) arguments.get(3));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSIFIER_COMPILATIONUNIT_ARTIFACT_COMPILATIONUNIT2ARTIFACT_ASTNODE2ELEMENT_MANIFESTATION_ABSTRACTTYPEDECLARATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Classifier) arguments.get(1),
					(CompilationUnit) arguments.get(2), (Artifact) arguments.get(3),
					(CompilationUnit2Artifact) arguments.get(4), (ASTNode2Element) arguments.get(5),
					(Manifestation) arguments.get(6), (AbstractTypeDeclaration) arguments.get(7));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_44__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_44((EMoflonEdge) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_53__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_53((EMoflonEdge) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_SOLVE_CSP_CC__CLASSIFIER_COMPILATIONUNIT_ARTIFACT_MANIFESTATION_ABSTRACTTYPEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Classifier) arguments.get(0), (CompilationUnit) arguments.get(1),
					(Artifact) arguments.get(2), (Manifestation) arguments.get(3),
					(AbstractTypeDeclaration) arguments.get(4), (Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___CHECK_DEC_FWD__COMPILATIONUNIT_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((CompilationUnit) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___CHECK_DEC_BWD__CLASSIFIER_ARTIFACT_MANIFESTATION:
			return checkDEC_BWD((Classifier) arguments.get(0), (Artifact) arguments.get(1),
					(Manifestation) arguments.get(2));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_COMPILATIONUNIT2ARTIFACT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(CompilationUnit2Artifact) arguments.get(2));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSIFIER_COMPILATIONUNIT_ARTIFACT_COMPILATIONUNIT2ARTIFACT_ASTNODE2ELEMENT_ABSTRACTTYPEDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Classifier) arguments.get(1),
					(CompilationUnit) arguments.get(2), (Artifact) arguments.get(3),
					(CompilationUnit2Artifact) arguments.get(4), (ASTNode2Element) arguments.get(5),
					(AbstractTypeDeclaration) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_0_1_initialbindings_blackBBBB(
			Manifestation4CompilationUnit2Artifact _this, Match match, CompilationUnit compilationUnit,
			AbstractTypeDeclaration type) {
		return new Object[] { _this, match, compilationUnit, type };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_bindingFBBBB(
			Manifestation4CompilationUnit2Artifact _this, Match match, CompilationUnit compilationUnit,
			AbstractTypeDeclaration type) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, compilationUnit, type);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, compilationUnit, type };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_bindingAndBlackFBBBB(
			Manifestation4CompilationUnit2Artifact _this, Match match, CompilationUnit compilationUnit,
			AbstractTypeDeclaration type) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_binding = pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_bindingFBBBB(
				_this, match, compilationUnit, type);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_black = pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, compilationUnit, type };
			}
		}
		return null;
	}

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_0_3_CheckCSP_expressionFBB(
			Manifestation4CompilationUnit2Artifact _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_0_4_collectelementstobetranslated_blackBBB(
			Match match, CompilationUnit compilationUnit, AbstractTypeDeclaration type) {
		return new Object[] { match, compilationUnit, type };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_0_4_collectelementstobetranslated_greenBBBF(
			Match match, CompilationUnit compilationUnit, AbstractTypeDeclaration type) {
		EMoflonEdge compilationUnit__type____types = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String compilationUnit__type____types_name_prime = "types";
		compilationUnit__type____types.setSrc(compilationUnit);
		compilationUnit__type____types.setTrg(type);
		match.getToBeTranslatedEdges().add(compilationUnit__type____types);
		compilationUnit__type____types.setName(compilationUnit__type____types_name_prime);
		return new Object[] { match, compilationUnit, type, compilationUnit__type____types };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_0_5_collectcontextelements_blackBBB(
			Match match, CompilationUnit compilationUnit, AbstractTypeDeclaration type) {
		return new Object[] { match, compilationUnit, type };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_0_5_collectcontextelements_greenBBB(
			Match match, CompilationUnit compilationUnit, AbstractTypeDeclaration type) {
		match.getContextNodes().add(compilationUnit);
		match.getContextNodes().add(type);
		return new Object[] { match, compilationUnit, type };
	}

	public static final void pattern_Manifestation4CompilationUnit2Artifact_0_6_registerobjectstomatch_expressionBBBB(
			Manifestation4CompilationUnit2Artifact _this, Match match, CompilationUnit compilationUnit,
			AbstractTypeDeclaration type) {
		_this.registerObjectsToMatch_FWD(match, compilationUnit, type);

	}

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("classifier");
		EObject _localVariable_1 = isApplicableMatch.getObject("compilationUnit");
		EObject _localVariable_2 = isApplicableMatch.getObject("artifact");
		EObject _localVariable_3 = isApplicableMatch.getObject("c2a");
		EObject _localVariable_4 = isApplicableMatch.getObject("t2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("type");
		EObject tmpClassifier = _localVariable_0;
		EObject tmpCompilationUnit = _localVariable_1;
		EObject tmpArtifact = _localVariable_2;
		EObject tmpC2a = _localVariable_3;
		EObject tmpT2c = _localVariable_4;
		EObject tmpType = _localVariable_5;
		if (tmpClassifier instanceof Classifier) {
			Classifier classifier = (Classifier) tmpClassifier;
			if (tmpCompilationUnit instanceof CompilationUnit) {
				CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
				if (tmpArtifact instanceof Artifact) {
					Artifact artifact = (Artifact) tmpArtifact;
					if (tmpC2a instanceof CompilationUnit2Artifact) {
						CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) tmpC2a;
						if (tmpT2c instanceof ASTNode2Element) {
							ASTNode2Element t2c = (ASTNode2Element) tmpT2c;
							if (tmpType instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration type = (AbstractTypeDeclaration) tmpType;
								return new Object[] { classifier, compilationUnit, artifact, c2a, t2c, type,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_blackBBBBBBFBB(
			Classifier classifier, CompilationUnit compilationUnit, Artifact artifact, CompilationUnit2Artifact c2a,
			ASTNode2Element t2c, AbstractTypeDeclaration type, Manifestation4CompilationUnit2Artifact _this,
			IsApplicableMatch isApplicableMatch) {
		if (!artifact.equals(classifier)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { classifier, compilationUnit, artifact, c2a, t2c, type, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			Manifestation4CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_binding = pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_binding != null) {
			Classifier classifier = (Classifier) result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_binding[0];
			CompilationUnit compilationUnit = (CompilationUnit) result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_binding[1];
			Artifact artifact = (Artifact) result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_binding[2];
			CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_binding[3];
			ASTNode2Element t2c = (ASTNode2Element) result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_binding[4];
			AbstractTypeDeclaration type = (AbstractTypeDeclaration) result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_binding[5];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_black = pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_blackBBBBBBFBB(
					classifier, compilationUnit, artifact, c2a, t2c, type, _this, isApplicableMatch);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_black[6];

				return new Object[] { classifier, compilationUnit, artifact, c2a, t2c, type, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_greenBBF(
			Classifier classifier, Artifact artifact) {
		Manifestation manifestation = UMLFactory.eINSTANCE.createManifestation();
		artifact.getManifestations().add(manifestation);
		manifestation.setUtilizedElement(classifier);
		return new Object[] { classifier, artifact, manifestation };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_1_2_collecttranslatedelements_blackB(
			Manifestation manifestation) {
		return new Object[] { manifestation };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_1_2_collecttranslatedelements_greenFB(
			Manifestation manifestation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(manifestation);
		return new Object[] { ruleresult, manifestation };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject classifier, EObject compilationUnit, EObject artifact, EObject c2a,
			EObject t2c, EObject manifestation, EObject type) {
		if (!classifier.equals(compilationUnit)) {
			if (!classifier.equals(t2c)) {
				if (!classifier.equals(manifestation)) {
					if (!classifier.equals(type)) {
						if (!compilationUnit.equals(t2c)) {
							if (!compilationUnit.equals(manifestation)) {
								if (!compilationUnit.equals(type)) {
									if (!artifact.equals(classifier)) {
										if (!artifact.equals(compilationUnit)) {
											if (!artifact.equals(c2a)) {
												if (!artifact.equals(t2c)) {
													if (!artifact.equals(manifestation)) {
														if (!artifact.equals(type)) {
															if (!c2a.equals(classifier)) {
																if (!c2a.equals(compilationUnit)) {
																	if (!c2a.equals(t2c)) {
																		if (!c2a.equals(manifestation)) {
																			if (!c2a.equals(type)) {
																				if (!t2c.equals(type)) {
																					if (!manifestation.equals(t2c)) {
																						if (!manifestation
																								.equals(type)) {
																							return new Object[] {
																									ruleresult,
																									classifier,
																									compilationUnit,
																									artifact, c2a, t2c,
																									manifestation,
																									type };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_1_3_bookkeepingforedges_greenBBBBBBFFF(
			PerformRuleResult ruleresult, EObject classifier, EObject compilationUnit, EObject artifact,
			EObject manifestation, EObject type) {
		EMoflonEdge artifact__manifestation____manifestation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge manifestation__classifier____utilizedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge compilationUnit__type____types = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Manifestation4CompilationUnit2Artifact";
		String artifact__manifestation____manifestation_name_prime = "manifestation";
		String manifestation__classifier____utilizedElement_name_prime = "utilizedElement";
		String compilationUnit__type____types_name_prime = "types";
		artifact__manifestation____manifestation.setSrc(artifact);
		artifact__manifestation____manifestation.setTrg(manifestation);
		ruleresult.getCreatedEdges().add(artifact__manifestation____manifestation);
		manifestation__classifier____utilizedElement.setSrc(manifestation);
		manifestation__classifier____utilizedElement.setTrg(classifier);
		ruleresult.getCreatedEdges().add(manifestation__classifier____utilizedElement);
		compilationUnit__type____types.setSrc(compilationUnit);
		compilationUnit__type____types.setTrg(type);
		ruleresult.getTranslatedEdges().add(compilationUnit__type____types);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		artifact__manifestation____manifestation.setName(artifact__manifestation____manifestation_name_prime);
		manifestation__classifier____utilizedElement.setName(manifestation__classifier____utilizedElement_name_prime);
		compilationUnit__type____types.setName(compilationUnit__type____types_name_prime);
		return new Object[] { ruleresult, classifier, compilationUnit, artifact, manifestation, type,
				artifact__manifestation____manifestation, manifestation__classifier____utilizedElement,
				compilationUnit__type____types };
	}

	public static final void pattern_Manifestation4CompilationUnit2Artifact_1_5_registerobjects_expressionBBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, PerformRuleResult ruleresult, EObject classifier,
			EObject compilationUnit, EObject artifact, EObject c2a, EObject t2c, EObject manifestation, EObject type) {
		_this.registerObjects_FWD(ruleresult, classifier, compilationUnit, artifact, c2a, t2c, manifestation, type);

	}

	public static final PerformRuleResult pattern_Manifestation4CompilationUnit2Artifact_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_2_1_preparereturnvalue_bindingFB(
			Manifestation4CompilationUnit2Artifact _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_2_1_preparereturnvalue_blackFBB(
			EClass eClass, Manifestation4CompilationUnit2Artifact _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_2_1_preparereturnvalue_bindingAndBlackFFB(
			Manifestation4CompilationUnit2Artifact _this) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_2_1_preparereturnvalue_binding = pattern_Manifestation4CompilationUnit2Artifact_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Manifestation4CompilationUnit2Artifact_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_2_1_preparereturnvalue_black = pattern_Manifestation4CompilationUnit2Artifact_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Manifestation4CompilationUnit2Artifact_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "Manifestation4CompilationUnit2Artifact";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("compilationUnit");
		EObject _localVariable_1 = match.getObject("type");
		EObject tmpCompilationUnit = _localVariable_0;
		EObject tmpType = _localVariable_1;
		if (tmpCompilationUnit instanceof CompilationUnit) {
			CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
			if (tmpType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration type = (AbstractTypeDeclaration) tmpType;
				return new Object[] { compilationUnit, type, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Manifestation4CompilationUnit2Artifact_2_2_corematch_blackFBFFFBB(
			CompilationUnit compilationUnit, AbstractTypeDeclaration type, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (CompilationUnit2Artifact c2a : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(compilationUnit, CompilationUnit2Artifact.class, "source")) {
			Artifact artifact = c2a.getTarget();
			if (artifact != null) {
				for (ASTNode2Element t2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(type,
						ASTNode2Element.class, "source")) {
					Element tmpClassifier = t2c.getTarget();
					if (tmpClassifier instanceof Classifier) {
						Classifier classifier = (Classifier) tmpClassifier;
						if (!artifact.equals(classifier)) {
							_result.add(new Object[] { classifier, compilationUnit, artifact, c2a, t2c, type, match });
						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Manifestation4CompilationUnit2Artifact_2_3_findcontext_blackBBBBBB(
			Classifier classifier, CompilationUnit compilationUnit, Artifact artifact, CompilationUnit2Artifact c2a,
			ASTNode2Element t2c, AbstractTypeDeclaration type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!artifact.equals(classifier)) {
			if (artifact.equals(c2a.getTarget())) {
				if (compilationUnit.equals(c2a.getSource())) {
					if (compilationUnit.getTypes().contains(type)) {
						if (classifier.equals(t2c.getTarget())) {
							if (type.equals(t2c.getSource())) {
								_result.add(new Object[] { classifier, compilationUnit, artifact, c2a, t2c, type });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_2_3_findcontext_greenBBBBBBFFFFFF(
			Classifier classifier, CompilationUnit compilationUnit, Artifact artifact, CompilationUnit2Artifact c2a,
			ASTNode2Element t2c, AbstractTypeDeclaration type) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c2a__artifact____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2a__compilationUnit____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge compilationUnit__type____types = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__classifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__type____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c2a__artifact____target_name_prime = "target";
		String c2a__compilationUnit____source_name_prime = "source";
		String compilationUnit__type____types_name_prime = "types";
		String t2c__classifier____target_name_prime = "target";
		String t2c__type____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(classifier);
		isApplicableMatch.getAllContextElements().add(compilationUnit);
		isApplicableMatch.getAllContextElements().add(artifact);
		isApplicableMatch.getAllContextElements().add(c2a);
		isApplicableMatch.getAllContextElements().add(t2c);
		isApplicableMatch.getAllContextElements().add(type);
		c2a__artifact____target.setSrc(c2a);
		c2a__artifact____target.setTrg(artifact);
		isApplicableMatch.getAllContextElements().add(c2a__artifact____target);
		c2a__compilationUnit____source.setSrc(c2a);
		c2a__compilationUnit____source.setTrg(compilationUnit);
		isApplicableMatch.getAllContextElements().add(c2a__compilationUnit____source);
		compilationUnit__type____types.setSrc(compilationUnit);
		compilationUnit__type____types.setTrg(type);
		isApplicableMatch.getAllContextElements().add(compilationUnit__type____types);
		t2c__classifier____target.setSrc(t2c);
		t2c__classifier____target.setTrg(classifier);
		isApplicableMatch.getAllContextElements().add(t2c__classifier____target);
		t2c__type____source.setSrc(t2c);
		t2c__type____source.setTrg(type);
		isApplicableMatch.getAllContextElements().add(t2c__type____source);
		c2a__artifact____target.setName(c2a__artifact____target_name_prime);
		c2a__compilationUnit____source.setName(c2a__compilationUnit____source_name_prime);
		compilationUnit__type____types.setName(compilationUnit__type____types_name_prime);
		t2c__classifier____target.setName(t2c__classifier____target_name_prime);
		t2c__type____source.setName(t2c__type____source_name_prime);
		return new Object[] { classifier, compilationUnit, artifact, c2a, t2c, type, isApplicableMatch,
				c2a__artifact____target, c2a__compilationUnit____source, compilationUnit__type____types,
				t2c__classifier____target, t2c__type____source };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_bindingFBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, Classifier classifier,
			CompilationUnit compilationUnit, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			AbstractTypeDeclaration type) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, classifier, compilationUnit, artifact,
				c2a, t2c, type);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, classifier, compilationUnit, artifact, c2a, t2c,
					type };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, Classifier classifier,
			CompilationUnit compilationUnit, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			AbstractTypeDeclaration type) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_binding = pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, classifier, compilationUnit, artifact, c2a, t2c, type);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_binding[0];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_black = pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, classifier, compilationUnit, artifact, c2a, t2c,
						type };
			}
		}
		return null;
	}

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_2_5_checkCSP_expressionFBB(
			Manifestation4CompilationUnit2Artifact _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Manifestation4CompilationUnit2Artifact";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Manifestation4CompilationUnit2Artifact_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_10_1_initialbindings_blackBBBBB(
			Manifestation4CompilationUnit2Artifact _this, Match match, Classifier classifier, Artifact artifact,
			Manifestation manifestation) {
		if (!artifact.equals(classifier)) {
			return new Object[] { _this, match, classifier, artifact, manifestation };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_bindingFBBBBB(
			Manifestation4CompilationUnit2Artifact _this, Match match, Classifier classifier, Artifact artifact,
			Manifestation manifestation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, classifier, artifact, manifestation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, classifier, artifact, manifestation };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_bindingAndBlackFBBBBB(
			Manifestation4CompilationUnit2Artifact _this, Match match, Classifier classifier, Artifact artifact,
			Manifestation manifestation) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_binding = pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_bindingFBBBBB(
				_this, match, classifier, artifact, manifestation);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_binding[0];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_black = pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, classifier, artifact, manifestation };
			}
		}
		return null;
	}

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_10_3_CheckCSP_expressionFBB(
			Manifestation4CompilationUnit2Artifact _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_10_4_collectelementstobetranslated_blackBBBB(
			Match match, Classifier classifier, Artifact artifact, Manifestation manifestation) {
		if (!artifact.equals(classifier)) {
			return new Object[] { match, classifier, artifact, manifestation };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Classifier classifier, Artifact artifact, Manifestation manifestation) {
		EMoflonEdge artifact__manifestation____manifestation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge manifestation__classifier____utilizedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(manifestation);
		String artifact__manifestation____manifestation_name_prime = "manifestation";
		String manifestation__classifier____utilizedElement_name_prime = "utilizedElement";
		artifact__manifestation____manifestation.setSrc(artifact);
		artifact__manifestation____manifestation.setTrg(manifestation);
		match.getToBeTranslatedEdges().add(artifact__manifestation____manifestation);
		manifestation__classifier____utilizedElement.setSrc(manifestation);
		manifestation__classifier____utilizedElement.setTrg(classifier);
		match.getToBeTranslatedEdges().add(manifestation__classifier____utilizedElement);
		artifact__manifestation____manifestation.setName(artifact__manifestation____manifestation_name_prime);
		manifestation__classifier____utilizedElement.setName(manifestation__classifier____utilizedElement_name_prime);
		return new Object[] { match, classifier, artifact, manifestation, artifact__manifestation____manifestation,
				manifestation__classifier____utilizedElement };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_10_5_collectcontextelements_blackBBBB(
			Match match, Classifier classifier, Artifact artifact, Manifestation manifestation) {
		if (!artifact.equals(classifier)) {
			return new Object[] { match, classifier, artifact, manifestation };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_10_5_collectcontextelements_greenBBB(
			Match match, Classifier classifier, Artifact artifact) {
		match.getContextNodes().add(classifier);
		match.getContextNodes().add(artifact);
		return new Object[] { match, classifier, artifact };
	}

	public static final void pattern_Manifestation4CompilationUnit2Artifact_10_6_registerobjectstomatch_expressionBBBBB(
			Manifestation4CompilationUnit2Artifact _this, Match match, Classifier classifier, Artifact artifact,
			Manifestation manifestation) {
		_this.registerObjectsToMatch_BWD(match, classifier, artifact, manifestation);

	}

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("classifier");
		EObject _localVariable_1 = isApplicableMatch.getObject("compilationUnit");
		EObject _localVariable_2 = isApplicableMatch.getObject("artifact");
		EObject _localVariable_3 = isApplicableMatch.getObject("c2a");
		EObject _localVariable_4 = isApplicableMatch.getObject("t2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("manifestation");
		EObject _localVariable_6 = isApplicableMatch.getObject("type");
		EObject tmpClassifier = _localVariable_0;
		EObject tmpCompilationUnit = _localVariable_1;
		EObject tmpArtifact = _localVariable_2;
		EObject tmpC2a = _localVariable_3;
		EObject tmpT2c = _localVariable_4;
		EObject tmpManifestation = _localVariable_5;
		EObject tmpType = _localVariable_6;
		if (tmpClassifier instanceof Classifier) {
			Classifier classifier = (Classifier) tmpClassifier;
			if (tmpCompilationUnit instanceof CompilationUnit) {
				CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
				if (tmpArtifact instanceof Artifact) {
					Artifact artifact = (Artifact) tmpArtifact;
					if (tmpC2a instanceof CompilationUnit2Artifact) {
						CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) tmpC2a;
						if (tmpT2c instanceof ASTNode2Element) {
							ASTNode2Element t2c = (ASTNode2Element) tmpT2c;
							if (tmpManifestation instanceof Manifestation) {
								Manifestation manifestation = (Manifestation) tmpManifestation;
								if (tmpType instanceof AbstractTypeDeclaration) {
									AbstractTypeDeclaration type = (AbstractTypeDeclaration) tmpType;
									return new Object[] { classifier, compilationUnit, artifact, c2a, t2c,
											manifestation, type, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_blackBBBBBBBFBB(
			Classifier classifier, CompilationUnit compilationUnit, Artifact artifact, CompilationUnit2Artifact c2a,
			ASTNode2Element t2c, Manifestation manifestation, AbstractTypeDeclaration type,
			Manifestation4CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch) {
		if (!artifact.equals(classifier)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { classifier, compilationUnit, artifact, c2a, t2c, manifestation, type, csp,
							_this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			Manifestation4CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_binding = pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_binding != null) {
			Classifier classifier = (Classifier) result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_binding[0];
			CompilationUnit compilationUnit = (CompilationUnit) result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_binding[1];
			Artifact artifact = (Artifact) result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_binding[2];
			CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_binding[3];
			ASTNode2Element t2c = (ASTNode2Element) result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_binding[4];
			Manifestation manifestation = (Manifestation) result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_binding[5];
			AbstractTypeDeclaration type = (AbstractTypeDeclaration) result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_binding[6];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_black = pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_blackBBBBBBBFBB(
					classifier, compilationUnit, artifact, c2a, t2c, manifestation, type, _this, isApplicableMatch);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_black[7];

				return new Object[] { classifier, compilationUnit, artifact, c2a, t2c, manifestation, type, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_greenBB(
			CompilationUnit compilationUnit, AbstractTypeDeclaration type) {
		compilationUnit.getTypes().add(type);
		return new Object[] { compilationUnit, type };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_11_2_collecttranslatedelements_blackB(
			Manifestation manifestation) {
		return new Object[] { manifestation };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_11_2_collecttranslatedelements_greenFB(
			Manifestation manifestation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(manifestation);
		return new Object[] { ruleresult, manifestation };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject classifier, EObject compilationUnit, EObject artifact, EObject c2a,
			EObject t2c, EObject manifestation, EObject type) {
		if (!classifier.equals(compilationUnit)) {
			if (!classifier.equals(t2c)) {
				if (!classifier.equals(manifestation)) {
					if (!classifier.equals(type)) {
						if (!compilationUnit.equals(t2c)) {
							if (!compilationUnit.equals(manifestation)) {
								if (!compilationUnit.equals(type)) {
									if (!artifact.equals(classifier)) {
										if (!artifact.equals(compilationUnit)) {
											if (!artifact.equals(c2a)) {
												if (!artifact.equals(t2c)) {
													if (!artifact.equals(manifestation)) {
														if (!artifact.equals(type)) {
															if (!c2a.equals(classifier)) {
																if (!c2a.equals(compilationUnit)) {
																	if (!c2a.equals(t2c)) {
																		if (!c2a.equals(manifestation)) {
																			if (!c2a.equals(type)) {
																				if (!t2c.equals(type)) {
																					if (!manifestation.equals(t2c)) {
																						if (!manifestation
																								.equals(type)) {
																							return new Object[] {
																									ruleresult,
																									classifier,
																									compilationUnit,
																									artifact, c2a, t2c,
																									manifestation,
																									type };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_11_3_bookkeepingforedges_greenBBBBBBFFF(
			PerformRuleResult ruleresult, EObject classifier, EObject compilationUnit, EObject artifact,
			EObject manifestation, EObject type) {
		EMoflonEdge artifact__manifestation____manifestation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge manifestation__classifier____utilizedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge compilationUnit__type____types = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Manifestation4CompilationUnit2Artifact";
		String artifact__manifestation____manifestation_name_prime = "manifestation";
		String manifestation__classifier____utilizedElement_name_prime = "utilizedElement";
		String compilationUnit__type____types_name_prime = "types";
		artifact__manifestation____manifestation.setSrc(artifact);
		artifact__manifestation____manifestation.setTrg(manifestation);
		ruleresult.getTranslatedEdges().add(artifact__manifestation____manifestation);
		manifestation__classifier____utilizedElement.setSrc(manifestation);
		manifestation__classifier____utilizedElement.setTrg(classifier);
		ruleresult.getTranslatedEdges().add(manifestation__classifier____utilizedElement);
		compilationUnit__type____types.setSrc(compilationUnit);
		compilationUnit__type____types.setTrg(type);
		ruleresult.getCreatedEdges().add(compilationUnit__type____types);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		artifact__manifestation____manifestation.setName(artifact__manifestation____manifestation_name_prime);
		manifestation__classifier____utilizedElement.setName(manifestation__classifier____utilizedElement_name_prime);
		compilationUnit__type____types.setName(compilationUnit__type____types_name_prime);
		return new Object[] { ruleresult, classifier, compilationUnit, artifact, manifestation, type,
				artifact__manifestation____manifestation, manifestation__classifier____utilizedElement,
				compilationUnit__type____types };
	}

	public static final void pattern_Manifestation4CompilationUnit2Artifact_11_5_registerobjects_expressionBBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, PerformRuleResult ruleresult, EObject classifier,
			EObject compilationUnit, EObject artifact, EObject c2a, EObject t2c, EObject manifestation, EObject type) {
		_this.registerObjects_BWD(ruleresult, classifier, compilationUnit, artifact, c2a, t2c, manifestation, type);

	}

	public static final PerformRuleResult pattern_Manifestation4CompilationUnit2Artifact_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_12_1_preparereturnvalue_bindingFB(
			Manifestation4CompilationUnit2Artifact _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_12_1_preparereturnvalue_blackFBB(
			EClass eClass, Manifestation4CompilationUnit2Artifact _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_12_1_preparereturnvalue_bindingAndBlackFFB(
			Manifestation4CompilationUnit2Artifact _this) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_12_1_preparereturnvalue_binding = pattern_Manifestation4CompilationUnit2Artifact_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Manifestation4CompilationUnit2Artifact_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_12_1_preparereturnvalue_black = pattern_Manifestation4CompilationUnit2Artifact_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Manifestation4CompilationUnit2Artifact_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "Manifestation4CompilationUnit2Artifact";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_12_2_corematch_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("classifier");
		EObject _localVariable_1 = match.getObject("artifact");
		EObject _localVariable_2 = match.getObject("manifestation");
		EObject tmpClassifier = _localVariable_0;
		EObject tmpArtifact = _localVariable_1;
		EObject tmpManifestation = _localVariable_2;
		if (tmpClassifier instanceof Classifier) {
			Classifier classifier = (Classifier) tmpClassifier;
			if (tmpArtifact instanceof Artifact) {
				Artifact artifact = (Artifact) tmpArtifact;
				if (tmpManifestation instanceof Manifestation) {
					Manifestation manifestation = (Manifestation) tmpManifestation;
					return new Object[] { classifier, artifact, manifestation, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Manifestation4CompilationUnit2Artifact_12_2_corematch_blackBFBFFBFB(
			Classifier classifier, Artifact artifact, Manifestation manifestation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!artifact.equals(classifier)) {
			for (CompilationUnit2Artifact c2a : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(artifact, CompilationUnit2Artifact.class, "target")) {
				CompilationUnit compilationUnit = c2a.getSource();
				if (compilationUnit != null) {
					for (ASTNode2Element t2c : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(classifier, ASTNode2Element.class, "target")) {
						ASTNode tmpType = t2c.getSource();
						if (tmpType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration type = (AbstractTypeDeclaration) tmpType;
							_result.add(new Object[] { classifier, compilationUnit, artifact, c2a, t2c, manifestation,
									type, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Manifestation4CompilationUnit2Artifact_12_3_findcontext_blackBBBBBBB(
			Classifier classifier, CompilationUnit compilationUnit, Artifact artifact, CompilationUnit2Artifact c2a,
			ASTNode2Element t2c, Manifestation manifestation, AbstractTypeDeclaration type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!artifact.equals(classifier)) {
			if (artifact.equals(c2a.getTarget())) {
				if (artifact.getManifestations().contains(manifestation)) {
					if (classifier.equals(manifestation.getUtilizedElement())) {
						if (compilationUnit.equals(c2a.getSource())) {
							if (classifier.equals(t2c.getTarget())) {
								if (type.equals(t2c.getSource())) {
									_result.add(new Object[] { classifier, compilationUnit, artifact, c2a, t2c,
											manifestation, type });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_12_3_findcontext_greenBBBBBBBFFFFFFF(
			Classifier classifier, CompilationUnit compilationUnit, Artifact artifact, CompilationUnit2Artifact c2a,
			ASTNode2Element t2c, Manifestation manifestation, AbstractTypeDeclaration type) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c2a__artifact____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge artifact__manifestation____manifestation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge manifestation__classifier____utilizedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2a__compilationUnit____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__classifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__type____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c2a__artifact____target_name_prime = "target";
		String artifact__manifestation____manifestation_name_prime = "manifestation";
		String manifestation__classifier____utilizedElement_name_prime = "utilizedElement";
		String c2a__compilationUnit____source_name_prime = "source";
		String t2c__classifier____target_name_prime = "target";
		String t2c__type____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(classifier);
		isApplicableMatch.getAllContextElements().add(compilationUnit);
		isApplicableMatch.getAllContextElements().add(artifact);
		isApplicableMatch.getAllContextElements().add(c2a);
		isApplicableMatch.getAllContextElements().add(t2c);
		isApplicableMatch.getAllContextElements().add(manifestation);
		isApplicableMatch.getAllContextElements().add(type);
		c2a__artifact____target.setSrc(c2a);
		c2a__artifact____target.setTrg(artifact);
		isApplicableMatch.getAllContextElements().add(c2a__artifact____target);
		artifact__manifestation____manifestation.setSrc(artifact);
		artifact__manifestation____manifestation.setTrg(manifestation);
		isApplicableMatch.getAllContextElements().add(artifact__manifestation____manifestation);
		manifestation__classifier____utilizedElement.setSrc(manifestation);
		manifestation__classifier____utilizedElement.setTrg(classifier);
		isApplicableMatch.getAllContextElements().add(manifestation__classifier____utilizedElement);
		c2a__compilationUnit____source.setSrc(c2a);
		c2a__compilationUnit____source.setTrg(compilationUnit);
		isApplicableMatch.getAllContextElements().add(c2a__compilationUnit____source);
		t2c__classifier____target.setSrc(t2c);
		t2c__classifier____target.setTrg(classifier);
		isApplicableMatch.getAllContextElements().add(t2c__classifier____target);
		t2c__type____source.setSrc(t2c);
		t2c__type____source.setTrg(type);
		isApplicableMatch.getAllContextElements().add(t2c__type____source);
		c2a__artifact____target.setName(c2a__artifact____target_name_prime);
		artifact__manifestation____manifestation.setName(artifact__manifestation____manifestation_name_prime);
		manifestation__classifier____utilizedElement.setName(manifestation__classifier____utilizedElement_name_prime);
		c2a__compilationUnit____source.setName(c2a__compilationUnit____source_name_prime);
		t2c__classifier____target.setName(t2c__classifier____target_name_prime);
		t2c__type____source.setName(t2c__type____source_name_prime);
		return new Object[] { classifier, compilationUnit, artifact, c2a, t2c, manifestation, type, isApplicableMatch,
				c2a__artifact____target, artifact__manifestation____manifestation,
				manifestation__classifier____utilizedElement, c2a__compilationUnit____source, t2c__classifier____target,
				t2c__type____source };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_bindingFBBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, Classifier classifier,
			CompilationUnit compilationUnit, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			Manifestation manifestation, AbstractTypeDeclaration type) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, classifier, compilationUnit, artifact,
				c2a, t2c, manifestation, type);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, classifier, compilationUnit, artifact, c2a, t2c,
					manifestation, type };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, Classifier classifier,
			CompilationUnit compilationUnit, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			Manifestation manifestation, AbstractTypeDeclaration type) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_binding = pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, classifier, compilationUnit, artifact, c2a, t2c, manifestation, type);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_binding[0];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_black = pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, classifier, compilationUnit, artifact, c2a, t2c,
						manifestation, type };
			}
		}
		return null;
	}

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_12_5_checkCSP_expressionFBB(
			Manifestation4CompilationUnit2Artifact _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Manifestation4CompilationUnit2Artifact";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Manifestation4CompilationUnit2Artifact_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_1_preparereturnvalue_bindingFB(
			Manifestation4CompilationUnit2Artifact _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, Manifestation4CompilationUnit2Artifact _this) {
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

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_1_preparereturnvalue_bindingAndBlackFFBF(
			Manifestation4CompilationUnit2Artifact _this) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_20_1_preparereturnvalue_binding = pattern_Manifestation4CompilationUnit2Artifact_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Manifestation4CompilationUnit2Artifact_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_20_1_preparereturnvalue_black = pattern_Manifestation4CompilationUnit2Artifact_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Manifestation4CompilationUnit2Artifact_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Manifestation4CompilationUnit2Artifact_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_0BBB(
			Manifestation manifestation, Classifier classifier, Artifact artifact) {
		if (!artifact.equals(classifier)) {
			for (NamedElement __DEC_manifestation_client_283379 : manifestation.getClients()) {
				if (!manifestation.equals(__DEC_manifestation_client_283379)) {
					if (!classifier.equals(__DEC_manifestation_client_283379)) {
						if (!artifact.equals(__DEC_manifestation_client_283379)) {
							return new Object[] { manifestation, classifier, artifact };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_1BBB(
			Manifestation manifestation, Classifier classifier, Artifact artifact) {
		if (!artifact.equals(classifier)) {
			for (NamedElement __DEC_manifestation_supplier_135057 : manifestation.getSuppliers()) {
				if (!manifestation.equals(__DEC_manifestation_supplier_135057)) {
					if (!classifier.equals(__DEC_manifestation_supplier_135057)) {
						if (!artifact.equals(__DEC_manifestation_supplier_135057)) {
							return new Object[] { manifestation, classifier, artifact };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_2BB(
			Manifestation manifestation, Classifier classifier) {
		if (manifestation.getClients().contains(classifier)) {
			return new Object[] { manifestation, classifier };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_3BB(
			Manifestation manifestation, Artifact artifact) {
		if (manifestation.getClients().contains(artifact)) {
			return new Object[] { manifestation, artifact };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_4BB(
			Manifestation manifestation, Classifier classifier) {
		if (manifestation.getSuppliers().contains(classifier)) {
			return new Object[] { manifestation, classifier };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_5BB(
			Manifestation manifestation, Artifact artifact) {
		if (manifestation.getSuppliers().contains(artifact)) {
			return new Object[] { manifestation, artifact };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_manifestation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpArtifact = _edge_manifestation.getSrc();
		if (tmpArtifact instanceof Artifact) {
			Artifact artifact = (Artifact) tmpArtifact;
			EObject tmpManifestation = _edge_manifestation.getTrg();
			if (tmpManifestation instanceof Manifestation) {
				Manifestation manifestation = (Manifestation) tmpManifestation;
				if (artifact.getManifestations().contains(manifestation)) {
					PackageableElement tmpClassifier = manifestation.getUtilizedElement();
					if (tmpClassifier instanceof Classifier) {
						Classifier classifier = (Classifier) tmpClassifier;
						if (!artifact.equals(classifier)) {
							if (pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_3BB(
									manifestation, artifact) == null) {
								if (pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_5BB(
										manifestation, artifact) == null) {
									if (pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_0BBB(
											manifestation, classifier, artifact) == null) {
										if (pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_1BBB(
												manifestation, classifier, artifact) == null) {
											if (pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_2BB(
													manifestation, classifier) == null) {
												if (pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_4BB(
														manifestation, classifier) == null) {
													_result.add(new Object[] { classifier, artifact, manifestation,
															_edge_manifestation });
												}
											}
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

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			Manifestation4CompilationUnit2Artifact _this, Match match, Classifier classifier, Artifact artifact,
			Manifestation manifestation) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, classifier, artifact, manifestation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Manifestation4CompilationUnit2Artifact _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Manifestation4CompilationUnit2Artifact_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_21_1_preparereturnvalue_bindingFB(
			Manifestation4CompilationUnit2Artifact _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, Manifestation4CompilationUnit2Artifact _this) {
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

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_21_1_preparereturnvalue_bindingAndBlackFFBF(
			Manifestation4CompilationUnit2Artifact _this) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_21_1_preparereturnvalue_binding = pattern_Manifestation4CompilationUnit2Artifact_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Manifestation4CompilationUnit2Artifact_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_21_1_preparereturnvalue_black = pattern_Manifestation4CompilationUnit2Artifact_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Manifestation4CompilationUnit2Artifact_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Manifestation4CompilationUnit2Artifact_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_Manifestation4CompilationUnit2Artifact_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_types) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCompilationUnit = _edge_types.getSrc();
		if (tmpCompilationUnit instanceof CompilationUnit) {
			CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
			EObject tmpType = _edge_types.getTrg();
			if (tmpType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration type = (AbstractTypeDeclaration) tmpType;
				if (compilationUnit.getTypes().contains(type)) {
					_result.add(new Object[] { compilationUnit, type, _edge_types });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			Manifestation4CompilationUnit2Artifact _this, Match match, CompilationUnit compilationUnit,
			AbstractTypeDeclaration type) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, compilationUnit, type);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Manifestation4CompilationUnit2Artifact _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Manifestation4CompilationUnit2Artifact_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_24_1_prepare_blackB(
			Manifestation4CompilationUnit2Artifact _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_bindingFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("classifier");
		EObject _localVariable_1 = sourceMatch.getObject("compilationUnit");
		EObject _localVariable_2 = targetMatch.getObject("artifact");
		EObject _localVariable_3 = targetMatch.getObject("manifestation");
		EObject _localVariable_4 = sourceMatch.getObject("type");
		EObject tmpClassifier = _localVariable_0;
		EObject tmpCompilationUnit = _localVariable_1;
		EObject tmpArtifact = _localVariable_2;
		EObject tmpManifestation = _localVariable_3;
		EObject tmpType = _localVariable_4;
		if (tmpClassifier instanceof Classifier) {
			Classifier classifier = (Classifier) tmpClassifier;
			if (tmpCompilationUnit instanceof CompilationUnit) {
				CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
				if (tmpArtifact instanceof Artifact) {
					Artifact artifact = (Artifact) tmpArtifact;
					if (tmpManifestation instanceof Manifestation) {
						Manifestation manifestation = (Manifestation) tmpManifestation;
						if (tmpType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration type = (AbstractTypeDeclaration) tmpType;
							return new Object[] { classifier, compilationUnit, artifact, manifestation, type,
									targetMatch, sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_blackBBBBBBB(
			Classifier classifier, CompilationUnit compilationUnit, Artifact artifact, Manifestation manifestation,
			AbstractTypeDeclaration type, Match sourceMatch, Match targetMatch) {
		if (!artifact.equals(classifier)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { classifier, compilationUnit, artifact, manifestation, type, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding = pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_bindingFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding != null) {
			Classifier classifier = (Classifier) result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[0];
			CompilationUnit compilationUnit = (CompilationUnit) result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[1];
			Artifact artifact = (Artifact) result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[2];
			Manifestation manifestation = (Manifestation) result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[3];
			AbstractTypeDeclaration type = (AbstractTypeDeclaration) result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_black = pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_blackBBBBBBB(
					classifier, compilationUnit, artifact, manifestation, type, sourceMatch, targetMatch);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { classifier, compilationUnit, artifact, manifestation, type, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_bindingFBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, Classifier classifier, CompilationUnit compilationUnit,
			Artifact artifact, Manifestation manifestation, AbstractTypeDeclaration type, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(classifier, compilationUnit, artifact, manifestation,
				type, sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, classifier, compilationUnit, artifact, manifestation, type, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, Classifier classifier, CompilationUnit compilationUnit,
			Artifact artifact, Manifestation manifestation, AbstractTypeDeclaration type, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_binding = pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_bindingFBBBBBBBB(
				_this, classifier, compilationUnit, artifact, manifestation, type, sourceMatch, targetMatch);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_binding[0];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_black = pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, classifier, compilationUnit, artifact, manifestation, type,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_Manifestation4CompilationUnit2Artifact_24_5_matchcorrcontext_blackBBBFFBBB(
			Classifier classifier, CompilationUnit compilationUnit, Artifact artifact, AbstractTypeDeclaration type,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!artifact.equals(classifier)) {
			if (!sourceMatch.equals(targetMatch)) {
				for (CompilationUnit2Artifact c2a : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(artifact, CompilationUnit2Artifact.class, "target")) {
					if (compilationUnit.equals(c2a.getSource())) {
						for (ASTNode2Element t2c : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(classifier, ASTNode2Element.class, "target")) {
							if (type.equals(t2c.getSource())) {
								_result.add(new Object[] { classifier, compilationUnit, artifact, c2a, t2c, type,
										sourceMatch, targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_24_5_matchcorrcontext_greenBBBBF(
			CompilationUnit2Artifact c2a, ASTNode2Element t2c, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "Manifestation4CompilationUnit2Artifact";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(c2a);
		ccMatch.getAllContextElements().add(t2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { c2a, t2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_24_6_createcorrespondence_blackBBBBBB(
			Classifier classifier, CompilationUnit compilationUnit, Artifact artifact, Manifestation manifestation,
			AbstractTypeDeclaration type, CCMatch ccMatch) {
		if (!artifact.equals(classifier)) {
			return new Object[] { classifier, compilationUnit, artifact, manifestation, type, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "Manifestation4CompilationUnit2Artifact";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_Manifestation4CompilationUnit2Artifact_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_27_1_matchtggpattern_blackBB(
			CompilationUnit compilationUnit, AbstractTypeDeclaration type) {
		if (compilationUnit.getTypes().contains(type)) {
			return new Object[] { compilationUnit, type };
		}
		return null;
	}

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_0BBB(
			Manifestation manifestation, Classifier classifier, Artifact artifact) {
		if (!artifact.equals(classifier)) {
			for (NamedElement __DEC_manifestation_client_484980 : manifestation.getClients()) {
				if (!manifestation.equals(__DEC_manifestation_client_484980)) {
					if (!classifier.equals(__DEC_manifestation_client_484980)) {
						if (!artifact.equals(__DEC_manifestation_client_484980)) {
							return new Object[] { manifestation, classifier, artifact };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_1BBB(
			Manifestation manifestation, Classifier classifier, Artifact artifact) {
		if (!artifact.equals(classifier)) {
			for (NamedElement __DEC_manifestation_supplier_500540 : manifestation.getSuppliers()) {
				if (!manifestation.equals(__DEC_manifestation_supplier_500540)) {
					if (!classifier.equals(__DEC_manifestation_supplier_500540)) {
						if (!artifact.equals(__DEC_manifestation_supplier_500540)) {
							return new Object[] { manifestation, classifier, artifact };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_2BB(
			Manifestation manifestation, Classifier classifier) {
		if (manifestation.getClients().contains(classifier)) {
			return new Object[] { manifestation, classifier };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_3BB(
			Manifestation manifestation, Artifact artifact) {
		if (manifestation.getClients().contains(artifact)) {
			return new Object[] { manifestation, artifact };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_4BB(
			Manifestation manifestation, Classifier classifier) {
		if (manifestation.getSuppliers().contains(classifier)) {
			return new Object[] { manifestation, classifier };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_5BB(
			Manifestation manifestation, Artifact artifact) {
		if (manifestation.getSuppliers().contains(artifact)) {
			return new Object[] { manifestation, artifact };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_blackBBB(
			Classifier classifier, Artifact artifact, Manifestation manifestation) {
		if (!artifact.equals(classifier)) {
			if (artifact.getManifestations().contains(manifestation)) {
				if (classifier.equals(manifestation.getUtilizedElement())) {
					if (pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_0BBB(
							manifestation, classifier, artifact) == null) {
						if (pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_1BBB(
								manifestation, classifier, artifact) == null) {
							if (pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_2BB(
									manifestation, classifier) == null) {
								if (pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_3BB(
										manifestation, artifact) == null) {
									if (pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_4BB(
											manifestation, classifier) == null) {
										if (pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_5BB(
												manifestation, artifact) == null) {
											return new Object[] { classifier, artifact, manifestation };
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

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_1_createresult_blackB(
			Manifestation4CompilationUnit2Artifact _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Classifier classifier) {
		if (ruleResult.getTargetObjects().contains(classifier)) {
			return new Object[] { ruleResult, classifier };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element t2c) {
		if (ruleResult.getCorrObjects().contains(t2c)) {
			return new Object[] { ruleResult, t2c };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration type) {
		if (ruleResult.getSourceObjects().contains(type)) {
			return new Object[] { ruleResult, type };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, CompilationUnit compilationUnit) {
		if (ruleResult.getSourceObjects().contains(compilationUnit)) {
			return new Object[] { ruleResult, compilationUnit };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, CompilationUnit2Artifact c2a) {
		if (ruleResult.getCorrObjects().contains(c2a)) {
			return new Object[] { ruleResult, c2a };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Artifact artifact) {
		if (ruleResult.getTargetObjects().contains(artifact)) {
			return new Object[] { ruleResult, artifact };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList t2cList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList c2aList : ruleEntryContainer.getRuleEntryList()) {
				if (!c2aList.equals(t2cList)) {
					for (EObject tmpT2c : t2cList.getEntryObjects()) {
						if (tmpT2c instanceof ASTNode2Element) {
							ASTNode2Element t2c = (ASTNode2Element) tmpT2c;
							Element tmpClassifier = t2c.getTarget();
							if (tmpClassifier instanceof Classifier) {
								Classifier classifier = (Classifier) tmpClassifier;
								ASTNode tmpType = t2c.getSource();
								if (tmpType instanceof AbstractTypeDeclaration) {
									AbstractTypeDeclaration type = (AbstractTypeDeclaration) tmpType;
									if (pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, t2c) == null) {
										if (pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, classifier) == null) {
											if (pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, type) == null) {
												for (EObject tmpC2a : c2aList.getEntryObjects()) {
													if (tmpC2a instanceof CompilationUnit2Artifact) {
														CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) tmpC2a;
														CompilationUnit compilationUnit = c2a.getSource();
														if (compilationUnit != null) {
															Artifact artifact = c2a.getTarget();
															if (artifact != null) {
																if (!artifact.equals(classifier)) {
																	if (pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, c2a) == null) {
																		if (pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, compilationUnit) == null) {
																			if (pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult, artifact) == null) {
																				_result.add(new Object[] { t2cList,
																						classifier, t2c, type, c2aList,
																						compilationUnit, c2a, artifact,
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
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_bindingFBBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, Classifier classifier,
			CompilationUnit compilationUnit, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			AbstractTypeDeclaration type, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, classifier, compilationUnit,
				artifact, c2a, t2c, type, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, classifier, compilationUnit, artifact, c2a, t2c, type,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, Classifier classifier,
			CompilationUnit compilationUnit, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			AbstractTypeDeclaration type, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_binding = pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, classifier, compilationUnit, artifact, c2a, t2c, type, ruleResult);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_binding[0];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_black = pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, classifier, compilationUnit, artifact, c2a, t2c,
						type, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_Manifestation4CompilationUnit2Artifact_29_4_checkCSP_expressionFBB(
			Manifestation4CompilationUnit2Artifact _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_5_checknacs_blackBBBBBB(
			Classifier classifier, CompilationUnit compilationUnit, Artifact artifact, CompilationUnit2Artifact c2a,
			ASTNode2Element t2c, AbstractTypeDeclaration type) {
		if (!artifact.equals(classifier)) {
			return new Object[] { classifier, compilationUnit, artifact, c2a, t2c, type };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_6_perform_blackBBBBBBB(
			Classifier classifier, CompilationUnit compilationUnit, Artifact artifact, CompilationUnit2Artifact c2a,
			ASTNode2Element t2c, AbstractTypeDeclaration type, ModelgeneratorRuleResult ruleResult) {
		if (!artifact.equals(classifier)) {
			return new Object[] { classifier, compilationUnit, artifact, c2a, t2c, type, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_6_perform_greenBBBFBB(
			Classifier classifier, CompilationUnit compilationUnit, Artifact artifact, AbstractTypeDeclaration type,
			ModelgeneratorRuleResult ruleResult) {
		Manifestation manifestation = UMLFactory.eINSTANCE.createManifestation();
		compilationUnit.getTypes().add(type);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		artifact.getManifestations().add(manifestation);
		manifestation.setUtilizedElement(classifier);
		ruleResult.getTargetObjects().add(manifestation);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { classifier, compilationUnit, artifact, manifestation, type, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_Manifestation4CompilationUnit2Artifact_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Manifestation4CompilationUnit2ArtifactImpl
