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
	public boolean isAppropriate_FWD(Match match, AbstractTypeDeclaration type, CompilationUnit compilationUnit) {

		Object[] result1_black = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_0_1_initialbindings_blackBBBB(this, match, type,
						compilationUnit);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[type] = " + type + ", " + "[compilationUnit] = " + compilationUnit + ".");
		}

		Object[] result2_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, type,
						compilationUnit);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[type] = " + type + ", " + "[compilationUnit] = " + compilationUnit + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_0_4_collectelementstobetranslated_blackBBB(match,
							type, compilationUnit);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[type] = " + type + ", " + "[compilationUnit] = " + compilationUnit + ".");
			}
			Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_0_4_collectelementstobetranslated_greenBBBF(match,
							type, compilationUnit);
			//nothing EMoflonEdge compilationUnit__type____types = (EMoflonEdge) result4_green[3];

			Object[] result5_black = Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_0_5_collectcontextelements_blackBBB(match, type,
							compilationUnit);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[type] = " + type + ", " + "[compilationUnit] = " + compilationUnit + ".");
			}
			Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_0_5_collectcontextelements_greenBBB(match, type,
							compilationUnit);

			// 
			Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_0_6_registerobjectstomatch_expressionBBBB(this,
							match, type, compilationUnit);
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
		AbstractTypeDeclaration type = (AbstractTypeDeclaration) result1_bindingAndBlack[0];
		Artifact artifact = (Artifact) result1_bindingAndBlack[1];
		CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) result1_bindingAndBlack[2];
		ASTNode2Element t2c = (ASTNode2Element) result1_bindingAndBlack[3];
		CompilationUnit compilationUnit = (CompilationUnit) result1_bindingAndBlack[4];
		Classifier classifier = (Classifier) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_greenBFB(artifact,
						classifier);
		Manifestation manifestation = (Manifestation) result1_green[1];

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
				.pattern_Manifestation4CompilationUnit2Artifact_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, type,
						artifact, c2a, t2c, manifestation, compilationUnit, classifier);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[type] = " + type + ", " + "[artifact] = " + artifact + ", " + "[c2a] = " + c2a + ", "
					+ "[t2c] = " + t2c + ", " + "[manifestation] = " + manifestation + ", " + "[compilationUnit] = "
					+ compilationUnit + ", " + "[classifier] = " + classifier + ".");
		}
		Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_1_3_bookkeepingforedges_greenBBBBBBFFF(ruleresult, type,
						artifact, manifestation, compilationUnit, classifier);
		//nothing EMoflonEdge artifact__manifestation____manifestation = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge manifestation__classifier____utilizedElement = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge compilationUnit__type____types = (EMoflonEdge) result3_green[8];

		// 
		// 
		Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_1_5_registerobjects_expressionBBBBBBBBB(this,
						ruleresult, type, artifact, c2a, t2c, manifestation, compilationUnit, classifier);
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
		AbstractTypeDeclaration type = (AbstractTypeDeclaration) result2_binding[0];
		CompilationUnit compilationUnit = (CompilationUnit) result2_binding[1];
		for (Object[] result2_black : Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_2_2_corematch_blackBFFFBFB(type, compilationUnit,
						match)) {
			Artifact artifact = (Artifact) result2_black[1];
			CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) result2_black[2];
			ASTNode2Element t2c = (ASTNode2Element) result2_black[3];
			Classifier classifier = (Classifier) result2_black[5];
			// ForEach 
			for (Object[] result3_black : Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_2_3_findcontext_blackBBBBBB(type, artifact, c2a,
							t2c, compilationUnit, classifier)) {
				Object[] result3_green = Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_2_3_findcontext_greenBBBBBBFFFFFF(type,
								artifact, c2a, t2c, compilationUnit, classifier);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge c2a__artifact____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge t2c__type____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge compilationUnit__type____types = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge t2c__classifier____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge c2a__compilationUnit____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, type, artifact, c2a, t2c, compilationUnit, classifier);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[type] = " + type + ", "
							+ "[artifact] = " + artifact + ", " + "[c2a] = " + c2a + ", " + "[t2c] = " + t2c + ", "
							+ "[compilationUnit] = " + compilationUnit + ", " + "[classifier] = " + classifier + ".");
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
	public void registerObjectsToMatch_FWD(Match match, AbstractTypeDeclaration type, CompilationUnit compilationUnit) {
		match.registerObject("type", type);
		match.registerObject("compilationUnit", compilationUnit);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AbstractTypeDeclaration type, CompilationUnit compilationUnit) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, AbstractTypeDeclaration type,
			Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c, CompilationUnit compilationUnit,
			Classifier classifier) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("type", type);
		isApplicableMatch.registerObject("artifact", artifact);
		isApplicableMatch.registerObject("c2a", c2a);
		isApplicableMatch.registerObject("t2c", t2c);
		isApplicableMatch.registerObject("compilationUnit", compilationUnit);
		isApplicableMatch.registerObject("classifier", classifier);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject type, EObject artifact, EObject c2a,
			EObject t2c, EObject manifestation, EObject compilationUnit, EObject classifier) {
		ruleresult.registerObject("type", type);
		ruleresult.registerObject("artifact", artifact);
		ruleresult.registerObject("c2a", c2a);
		ruleresult.registerObject("t2c", t2c);
		ruleresult.registerObject("manifestation", manifestation);
		ruleresult.registerObject("compilationUnit", compilationUnit);
		ruleresult.registerObject("classifier", classifier);

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
	public boolean isAppropriate_BWD(Match match, Artifact artifact, Manifestation manifestation,
			Classifier classifier) {

		Object[] result1_black = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_10_1_initialbindings_blackBBBBB(this, match, artifact,
						manifestation, classifier);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[artifact] = " + artifact + ", " + "[manifestation] = "
					+ manifestation + ", " + "[classifier] = " + classifier + ".");
		}

		Object[] result2_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
						artifact, manifestation, classifier);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[artifact] = " + artifact + ", " + "[manifestation] = "
					+ manifestation + ", " + "[classifier] = " + classifier + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_10_4_collectelementstobetranslated_blackBBBB(match,
							artifact, manifestation, classifier);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[artifact] = " + artifact + ", " + "[manifestation] = " + manifestation + ", "
						+ "[classifier] = " + classifier + ".");
			}
			Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_10_4_collectelementstobetranslated_greenBBBBFF(
							match, artifact, manifestation, classifier);
			//nothing EMoflonEdge artifact__manifestation____manifestation = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge manifestation__classifier____utilizedElement = (EMoflonEdge) result4_green[5];

			Object[] result5_black = Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_10_5_collectcontextelements_blackBBBB(match,
							artifact, manifestation, classifier);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[artifact] = " + artifact + ", " + "[manifestation] = " + manifestation + ", "
						+ "[classifier] = " + classifier + ".");
			}
			Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_10_5_collectcontextelements_greenBBB(match,
							artifact, classifier);

			// 
			Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_10_6_registerobjectstomatch_expressionBBBBB(this,
							match, artifact, manifestation, classifier);
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
		AbstractTypeDeclaration type = (AbstractTypeDeclaration) result1_bindingAndBlack[0];
		Artifact artifact = (Artifact) result1_bindingAndBlack[1];
		CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) result1_bindingAndBlack[2];
		ASTNode2Element t2c = (ASTNode2Element) result1_bindingAndBlack[3];
		Manifestation manifestation = (Manifestation) result1_bindingAndBlack[4];
		CompilationUnit compilationUnit = (CompilationUnit) result1_bindingAndBlack[5];
		Classifier classifier = (Classifier) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_greenBB(type,
						compilationUnit);

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
				.pattern_Manifestation4CompilationUnit2Artifact_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, type,
						artifact, c2a, t2c, manifestation, compilationUnit, classifier);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[type] = " + type + ", " + "[artifact] = " + artifact + ", " + "[c2a] = " + c2a + ", "
					+ "[t2c] = " + t2c + ", " + "[manifestation] = " + manifestation + ", " + "[compilationUnit] = "
					+ compilationUnit + ", " + "[classifier] = " + classifier + ".");
		}
		Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_11_3_bookkeepingforedges_greenBBBBBBFFF(ruleresult,
						type, artifact, manifestation, compilationUnit, classifier);
		//nothing EMoflonEdge artifact__manifestation____manifestation = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge manifestation__classifier____utilizedElement = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge compilationUnit__type____types = (EMoflonEdge) result3_green[8];

		// 
		// 
		Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_11_5_registerobjects_expressionBBBBBBBBB(this,
						ruleresult, type, artifact, c2a, t2c, manifestation, compilationUnit, classifier);
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
		Artifact artifact = (Artifact) result2_binding[0];
		Manifestation manifestation = (Manifestation) result2_binding[1];
		Classifier classifier = (Classifier) result2_binding[2];
		for (Object[] result2_black : Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_12_2_corematch_blackFBFFBFBB(artifact, manifestation,
						classifier, match)) {
			AbstractTypeDeclaration type = (AbstractTypeDeclaration) result2_black[0];
			CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) result2_black[2];
			ASTNode2Element t2c = (ASTNode2Element) result2_black[3];
			CompilationUnit compilationUnit = (CompilationUnit) result2_black[5];
			// ForEach 
			for (Object[] result3_black : Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_12_3_findcontext_blackBBBBBBB(type, artifact, c2a,
							t2c, manifestation, compilationUnit, classifier)) {
				Object[] result3_green = Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_12_3_findcontext_greenBBBBBBBFFFFFFF(type,
								artifact, c2a, t2c, manifestation, compilationUnit, classifier);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge artifact__manifestation____manifestation = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge c2a__artifact____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge t2c__type____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge manifestation__classifier____utilizedElement = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge t2c__classifier____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge c2a__compilationUnit____source = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, type, artifact, c2a, t2c, manifestation, compilationUnit,
								classifier);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[type] = " + type + ", "
							+ "[artifact] = " + artifact + ", " + "[c2a] = " + c2a + ", " + "[t2c] = " + t2c + ", "
							+ "[manifestation] = " + manifestation + ", " + "[compilationUnit] = " + compilationUnit
							+ ", " + "[classifier] = " + classifier + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Artifact artifact, Manifestation manifestation,
			Classifier classifier) {
		match.registerObject("artifact", artifact);
		match.registerObject("manifestation", manifestation);
		match.registerObject("classifier", classifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Artifact artifact, Manifestation manifestation,
			Classifier classifier) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, AbstractTypeDeclaration type,
			Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c, Manifestation manifestation,
			CompilationUnit compilationUnit, Classifier classifier) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("type", type);
		isApplicableMatch.registerObject("artifact", artifact);
		isApplicableMatch.registerObject("c2a", c2a);
		isApplicableMatch.registerObject("t2c", t2c);
		isApplicableMatch.registerObject("manifestation", manifestation);
		isApplicableMatch.registerObject("compilationUnit", compilationUnit);
		isApplicableMatch.registerObject("classifier", classifier);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject type, EObject artifact, EObject c2a,
			EObject t2c, EObject manifestation, EObject compilationUnit, EObject classifier) {
		ruleresult.registerObject("type", type);
		ruleresult.registerObject("artifact", artifact);
		ruleresult.registerObject("c2a", c2a);
		ruleresult.registerObject("t2c", t2c);
		ruleresult.registerObject("manifestation", manifestation);
		ruleresult.registerObject("compilationUnit", compilationUnit);
		ruleresult.registerObject("classifier", classifier);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_118(EMoflonEdge _edge_manifestation) {

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
			Artifact artifact = (Artifact) result2_black[0];
			Manifestation manifestation = (Manifestation) result2_black[1];
			Classifier classifier = (Classifier) result2_black[2];
			Object[] result2_green = Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, artifact, manifestation, classifier)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_130(EMoflonEdge _edge_types) {

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
			AbstractTypeDeclaration type = (AbstractTypeDeclaration) result2_black[0];
			CompilationUnit compilationUnit = (CompilationUnit) result2_black[1];
			Object[] result2_green = Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, type, compilationUnit)) {
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
		AbstractTypeDeclaration type = (AbstractTypeDeclaration) result2_bindingAndBlack[0];
		Artifact artifact = (Artifact) result2_bindingAndBlack[1];
		Manifestation manifestation = (Manifestation) result2_bindingAndBlack[2];
		CompilationUnit compilationUnit = (CompilationUnit) result2_bindingAndBlack[3];
		Classifier classifier = (Classifier) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, type,
						artifact, manifestation, compilationUnit, classifier, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[type] = " + type + ", "
							+ "[artifact] = " + artifact + ", " + "[manifestation] = " + manifestation + ", "
							+ "[compilationUnit] = " + compilationUnit + ", " + "[classifier] = " + classifier + ", "
							+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_24_5_matchcorrcontext_blackBBFFBBBB(type, artifact,
							compilationUnit, classifier, sourceMatch, targetMatch)) {
				CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) result5_black[2];
				ASTNode2Element t2c = (ASTNode2Element) result5_black[3];
				Object[] result5_green = Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_24_5_matchcorrcontext_greenBBBBF(c2a, t2c,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_24_6_createcorrespondence_blackBBBBBB(type,
								artifact, manifestation, compilationUnit, classifier, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[type] = " + type + ", "
							+ "[artifact] = " + artifact + ", " + "[manifestation] = " + manifestation + ", "
							+ "[compilationUnit] = " + compilationUnit + ", " + "[classifier] = " + classifier + ", "
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
	public CSP isApplicable_solveCsp_CC(AbstractTypeDeclaration type, Artifact artifact, Manifestation manifestation,
			CompilationUnit compilationUnit, Classifier classifier, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(AbstractTypeDeclaration type, CompilationUnit compilationUnit) {// 
		Object[] result1_black = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_27_1_matchtggpattern_blackBB(type, compilationUnit);
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
	public boolean checkDEC_BWD(Artifact artifact, Manifestation manifestation, Classifier classifier) {// 
		Object[] result1_black = Manifestation4CompilationUnit2ArtifactImpl
				.pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_blackBBB(artifact, manifestation,
						classifier);
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
			AbstractTypeDeclaration type = (AbstractTypeDeclaration) result2_black[1];
			ASTNode2Element t2c = (ASTNode2Element) result2_black[2];
			Classifier classifier = (Classifier) result2_black[3];
			//nothing RuleEntryList c2aList = (RuleEntryList) result2_black[4];
			Artifact artifact = (Artifact) result2_black[5];
			CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) result2_black[6];
			CompilationUnit compilationUnit = (CompilationUnit) result2_black[7];

			Object[] result3_bindingAndBlack = Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, type, artifact, c2a, t2c, compilationUnit, classifier, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[type] = " + type + ", "
						+ "[artifact] = " + artifact + ", " + "[c2a] = " + c2a + ", " + "[t2c] = " + t2c + ", "
						+ "[compilationUnit] = " + compilationUnit + ", " + "[classifier] = " + classifier + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (Manifestation4CompilationUnit2ArtifactImpl
					.pattern_Manifestation4CompilationUnit2Artifact_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = Manifestation4CompilationUnit2ArtifactImpl
						.pattern_Manifestation4CompilationUnit2Artifact_29_5_checknacs_blackBBBBBB(type, artifact, c2a,
								t2c, compilationUnit, classifier);
				if (result5_black != null) {

					Object[] result6_black = Manifestation4CompilationUnit2ArtifactImpl
							.pattern_Manifestation4CompilationUnit2Artifact_29_6_perform_blackBBBBBBB(type, artifact,
									c2a, t2c, compilationUnit, classifier, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[type] = " + type
								+ ", " + "[artifact] = " + artifact + ", " + "[c2a] = " + c2a + ", " + "[t2c] = " + t2c
								+ ", " + "[compilationUnit] = " + compilationUnit + ", " + "[classifier] = "
								+ classifier + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					Manifestation4CompilationUnit2ArtifactImpl
							.pattern_Manifestation4CompilationUnit2Artifact_29_6_perform_greenBBFBBB(type, artifact,
									compilationUnit, classifier, ruleResult);
					//nothing Manifestation manifestation = (Manifestation) result6_green[2];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, AbstractTypeDeclaration type,
			Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c, CompilationUnit compilationUnit,
			Classifier classifier, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("type", type);
		isApplicableMatch.registerObject("artifact", artifact);
		isApplicableMatch.registerObject("c2a", c2a);
		isApplicableMatch.registerObject("t2c", t2c);
		isApplicableMatch.registerObject("compilationUnit", compilationUnit);
		isApplicableMatch.registerObject("classifier", classifier);
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
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_FWD__MATCH_ABSTRACTTYPEDECLARATION_COMPILATIONUNIT:
			return isAppropriate_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
					(CompilationUnit) arguments.get(2));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ABSTRACTTYPEDECLARATION_COMPILATIONUNIT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
					(CompilationUnit) arguments.get(2));
			return null;
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ABSTRACTTYPEDECLARATION_COMPILATIONUNIT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
					(CompilationUnit) arguments.get(2));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ABSTRACTTYPEDECLARATION_ARTIFACT_COMPILATIONUNIT2ARTIFACT_ASTNODE2ELEMENT_COMPILATIONUNIT_CLASSIFIER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(AbstractTypeDeclaration) arguments.get(1), (Artifact) arguments.get(2),
					(CompilationUnit2Artifact) arguments.get(3), (ASTNode2Element) arguments.get(4),
					(CompilationUnit) arguments.get(5), (Classifier) arguments.get(6));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_BWD__MATCH_ARTIFACT_MANIFESTATION_CLASSIFIER:
			return isAppropriate_BWD((Match) arguments.get(0), (Artifact) arguments.get(1),
					(Manifestation) arguments.get(2), (Classifier) arguments.get(3));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ARTIFACT_MANIFESTATION_CLASSIFIER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Artifact) arguments.get(1),
					(Manifestation) arguments.get(2), (Classifier) arguments.get(3));
			return null;
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ARTIFACT_MANIFESTATION_CLASSIFIER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Artifact) arguments.get(1),
					(Manifestation) arguments.get(2), (Classifier) arguments.get(3));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ABSTRACTTYPEDECLARATION_ARTIFACT_COMPILATIONUNIT2ARTIFACT_ASTNODE2ELEMENT_MANIFESTATION_COMPILATIONUNIT_CLASSIFIER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(AbstractTypeDeclaration) arguments.get(1), (Artifact) arguments.get(2),
					(CompilationUnit2Artifact) arguments.get(3), (ASTNode2Element) arguments.get(4),
					(Manifestation) arguments.get(5), (CompilationUnit) arguments.get(6),
					(Classifier) arguments.get(7));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_118__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_118((EMoflonEdge) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_130__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_130((EMoflonEdge) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_SOLVE_CSP_CC__ABSTRACTTYPEDECLARATION_ARTIFACT_MANIFESTATION_COMPILATIONUNIT_CLASSIFIER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((AbstractTypeDeclaration) arguments.get(0), (Artifact) arguments.get(1),
					(Manifestation) arguments.get(2), (CompilationUnit) arguments.get(3), (Classifier) arguments.get(4),
					(Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___CHECK_DEC_FWD__ABSTRACTTYPEDECLARATION_COMPILATIONUNIT:
			return checkDEC_FWD((AbstractTypeDeclaration) arguments.get(0), (CompilationUnit) arguments.get(1));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___CHECK_DEC_BWD__ARTIFACT_MANIFESTATION_CLASSIFIER:
			return checkDEC_BWD((Artifact) arguments.get(0), (Manifestation) arguments.get(1),
					(Classifier) arguments.get(2));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_COMPILATIONUNIT2ARTIFACT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(CompilationUnit2Artifact) arguments.get(2));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ABSTRACTTYPEDECLARATION_ARTIFACT_COMPILATIONUNIT2ARTIFACT_ASTNODE2ELEMENT_COMPILATIONUNIT_CLASSIFIER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(AbstractTypeDeclaration) arguments.get(1), (Artifact) arguments.get(2),
					(CompilationUnit2Artifact) arguments.get(3), (ASTNode2Element) arguments.get(4),
					(CompilationUnit) arguments.get(5), (Classifier) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.MANIFESTATION4_COMPILATION_UNIT2_ARTIFACT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_0_1_initialbindings_blackBBBB(
			Manifestation4CompilationUnit2Artifact _this, Match match, AbstractTypeDeclaration type,
			CompilationUnit compilationUnit) {
		return new Object[] { _this, match, type, compilationUnit };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_bindingFBBBB(
			Manifestation4CompilationUnit2Artifact _this, Match match, AbstractTypeDeclaration type,
			CompilationUnit compilationUnit) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, type, compilationUnit);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, type, compilationUnit };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_bindingAndBlackFBBBB(
			Manifestation4CompilationUnit2Artifact _this, Match match, AbstractTypeDeclaration type,
			CompilationUnit compilationUnit) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_binding = pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_bindingFBBBB(
				_this, match, type, compilationUnit);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_black = pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, type, compilationUnit };
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
			Match match, AbstractTypeDeclaration type, CompilationUnit compilationUnit) {
		return new Object[] { match, type, compilationUnit };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_0_4_collectelementstobetranslated_greenBBBF(
			Match match, AbstractTypeDeclaration type, CompilationUnit compilationUnit) {
		EMoflonEdge compilationUnit__type____types = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String compilationUnit__type____types_name_prime = "types";
		compilationUnit__type____types.setSrc(compilationUnit);
		compilationUnit__type____types.setTrg(type);
		match.getToBeTranslatedEdges().add(compilationUnit__type____types);
		compilationUnit__type____types.setName(compilationUnit__type____types_name_prime);
		return new Object[] { match, type, compilationUnit, compilationUnit__type____types };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_0_5_collectcontextelements_blackBBB(
			Match match, AbstractTypeDeclaration type, CompilationUnit compilationUnit) {
		return new Object[] { match, type, compilationUnit };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_0_5_collectcontextelements_greenBBB(
			Match match, AbstractTypeDeclaration type, CompilationUnit compilationUnit) {
		match.getContextNodes().add(type);
		match.getContextNodes().add(compilationUnit);
		return new Object[] { match, type, compilationUnit };
	}

	public static final void pattern_Manifestation4CompilationUnit2Artifact_0_6_registerobjectstomatch_expressionBBBB(
			Manifestation4CompilationUnit2Artifact _this, Match match, AbstractTypeDeclaration type,
			CompilationUnit compilationUnit) {
		_this.registerObjectsToMatch_FWD(match, type, compilationUnit);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("type");
		EObject _localVariable_1 = isApplicableMatch.getObject("artifact");
		EObject _localVariable_2 = isApplicableMatch.getObject("c2a");
		EObject _localVariable_3 = isApplicableMatch.getObject("t2c");
		EObject _localVariable_4 = isApplicableMatch.getObject("compilationUnit");
		EObject _localVariable_5 = isApplicableMatch.getObject("classifier");
		EObject tmpType = _localVariable_0;
		EObject tmpArtifact = _localVariable_1;
		EObject tmpC2a = _localVariable_2;
		EObject tmpT2c = _localVariable_3;
		EObject tmpCompilationUnit = _localVariable_4;
		EObject tmpClassifier = _localVariable_5;
		if (tmpType instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration type = (AbstractTypeDeclaration) tmpType;
			if (tmpArtifact instanceof Artifact) {
				Artifact artifact = (Artifact) tmpArtifact;
				if (tmpC2a instanceof CompilationUnit2Artifact) {
					CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) tmpC2a;
					if (tmpT2c instanceof ASTNode2Element) {
						ASTNode2Element t2c = (ASTNode2Element) tmpT2c;
						if (tmpCompilationUnit instanceof CompilationUnit) {
							CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
							if (tmpClassifier instanceof Classifier) {
								Classifier classifier = (Classifier) tmpClassifier;
								return new Object[] { type, artifact, c2a, t2c, compilationUnit, classifier,
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
			AbstractTypeDeclaration type, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			CompilationUnit compilationUnit, Classifier classifier, Manifestation4CompilationUnit2Artifact _this,
			IsApplicableMatch isApplicableMatch) {
		if (!artifact.equals(classifier)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { type, artifact, c2a, t2c, compilationUnit, classifier, csp, _this,
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
			AbstractTypeDeclaration type = (AbstractTypeDeclaration) result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_binding[0];
			Artifact artifact = (Artifact) result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_binding[1];
			CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_binding[2];
			ASTNode2Element t2c = (ASTNode2Element) result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_binding[3];
			CompilationUnit compilationUnit = (CompilationUnit) result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_binding[4];
			Classifier classifier = (Classifier) result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_binding[5];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_black = pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_blackBBBBBBFBB(
					type, artifact, c2a, t2c, compilationUnit, classifier, _this, isApplicableMatch);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_black[6];

				return new Object[] { type, artifact, c2a, t2c, compilationUnit, classifier, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_1_1_performtransformation_greenBFB(
			Artifact artifact, Classifier classifier) {
		Manifestation manifestation = UMLFactory.eINSTANCE.createManifestation();
		artifact.getManifestations().add(manifestation);
		manifestation.setUtilizedElement(classifier);
		return new Object[] { artifact, manifestation, classifier };
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
			PerformRuleResult ruleresult, EObject type, EObject artifact, EObject c2a, EObject t2c,
			EObject manifestation, EObject compilationUnit, EObject classifier) {
		if (!artifact.equals(type)) {
			if (!artifact.equals(c2a)) {
				if (!artifact.equals(t2c)) {
					if (!artifact.equals(manifestation)) {
						if (!artifact.equals(compilationUnit)) {
							if (!artifact.equals(classifier)) {
								if (!c2a.equals(type)) {
									if (!c2a.equals(t2c)) {
										if (!c2a.equals(manifestation)) {
											if (!c2a.equals(compilationUnit)) {
												if (!c2a.equals(classifier)) {
													if (!t2c.equals(type)) {
														if (!manifestation.equals(type)) {
															if (!manifestation.equals(t2c)) {
																if (!compilationUnit.equals(type)) {
																	if (!compilationUnit.equals(t2c)) {
																		if (!compilationUnit.equals(manifestation)) {
																			if (!classifier.equals(type)) {
																				if (!classifier.equals(t2c)) {
																					if (!classifier
																							.equals(manifestation)) {
																						if (!classifier.equals(
																								compilationUnit)) {
																							return new Object[] {
																									ruleresult, type,
																									artifact, c2a, t2c,
																									manifestation,
																									compilationUnit,
																									classifier };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject type, EObject artifact, EObject manifestation,
			EObject compilationUnit, EObject classifier) {
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
		return new Object[] { ruleresult, type, artifact, manifestation, compilationUnit, classifier,
				artifact__manifestation____manifestation, manifestation__classifier____utilizedElement,
				compilationUnit__type____types };
	}

	public static final void pattern_Manifestation4CompilationUnit2Artifact_1_5_registerobjects_expressionBBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, PerformRuleResult ruleresult, EObject type, EObject artifact,
			EObject c2a, EObject t2c, EObject manifestation, EObject compilationUnit, EObject classifier) {
		_this.registerObjects_FWD(ruleresult, type, artifact, c2a, t2c, manifestation, compilationUnit, classifier);

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
		EObject _localVariable_0 = match.getObject("type");
		EObject _localVariable_1 = match.getObject("compilationUnit");
		EObject tmpType = _localVariable_0;
		EObject tmpCompilationUnit = _localVariable_1;
		if (tmpType instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration type = (AbstractTypeDeclaration) tmpType;
			if (tmpCompilationUnit instanceof CompilationUnit) {
				CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
				return new Object[] { type, compilationUnit, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Manifestation4CompilationUnit2Artifact_2_2_corematch_blackBFFFBFB(
			AbstractTypeDeclaration type, CompilationUnit compilationUnit, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element t2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(type,
				ASTNode2Element.class, "source")) {
			Element tmpClassifier = t2c.getTarget();
			if (tmpClassifier instanceof Classifier) {
				Classifier classifier = (Classifier) tmpClassifier;
				for (CompilationUnit2Artifact c2a : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(compilationUnit, CompilationUnit2Artifact.class, "source")) {
					Artifact artifact = c2a.getTarget();
					if (artifact != null) {
						if (!artifact.equals(classifier)) {
							_result.add(new Object[] { type, artifact, c2a, t2c, compilationUnit, classifier, match });
						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Manifestation4CompilationUnit2Artifact_2_3_findcontext_blackBBBBBB(
			AbstractTypeDeclaration type, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			CompilationUnit compilationUnit, Classifier classifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!artifact.equals(classifier)) {
			if (artifact.equals(c2a.getTarget())) {
				if (type.equals(t2c.getSource())) {
					if (compilationUnit.getTypes().contains(type)) {
						if (classifier.equals(t2c.getTarget())) {
							if (compilationUnit.equals(c2a.getSource())) {
								_result.add(new Object[] { type, artifact, c2a, t2c, compilationUnit, classifier });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_2_3_findcontext_greenBBBBBBFFFFFF(
			AbstractTypeDeclaration type, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			CompilationUnit compilationUnit, Classifier classifier) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge c2a__artifact____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__type____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge compilationUnit__type____types = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__classifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2a__compilationUnit____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String c2a__artifact____target_name_prime = "target";
		String t2c__type____source_name_prime = "source";
		String compilationUnit__type____types_name_prime = "types";
		String t2c__classifier____target_name_prime = "target";
		String c2a__compilationUnit____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(type);
		isApplicableMatch.getAllContextElements().add(artifact);
		isApplicableMatch.getAllContextElements().add(c2a);
		isApplicableMatch.getAllContextElements().add(t2c);
		isApplicableMatch.getAllContextElements().add(compilationUnit);
		isApplicableMatch.getAllContextElements().add(classifier);
		c2a__artifact____target.setSrc(c2a);
		c2a__artifact____target.setTrg(artifact);
		isApplicableMatch.getAllContextElements().add(c2a__artifact____target);
		t2c__type____source.setSrc(t2c);
		t2c__type____source.setTrg(type);
		isApplicableMatch.getAllContextElements().add(t2c__type____source);
		compilationUnit__type____types.setSrc(compilationUnit);
		compilationUnit__type____types.setTrg(type);
		isApplicableMatch.getAllContextElements().add(compilationUnit__type____types);
		t2c__classifier____target.setSrc(t2c);
		t2c__classifier____target.setTrg(classifier);
		isApplicableMatch.getAllContextElements().add(t2c__classifier____target);
		c2a__compilationUnit____source.setSrc(c2a);
		c2a__compilationUnit____source.setTrg(compilationUnit);
		isApplicableMatch.getAllContextElements().add(c2a__compilationUnit____source);
		c2a__artifact____target.setName(c2a__artifact____target_name_prime);
		t2c__type____source.setName(t2c__type____source_name_prime);
		compilationUnit__type____types.setName(compilationUnit__type____types_name_prime);
		t2c__classifier____target.setName(t2c__classifier____target_name_prime);
		c2a__compilationUnit____source.setName(c2a__compilationUnit____source_name_prime);
		return new Object[] { type, artifact, c2a, t2c, compilationUnit, classifier, isApplicableMatch,
				c2a__artifact____target, t2c__type____source, compilationUnit__type____types, t2c__classifier____target,
				c2a__compilationUnit____source };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_bindingFBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch,
			AbstractTypeDeclaration type, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			CompilationUnit compilationUnit, Classifier classifier) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, type, artifact, c2a, t2c,
				compilationUnit, classifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, type, artifact, c2a, t2c, compilationUnit,
					classifier };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch,
			AbstractTypeDeclaration type, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			CompilationUnit compilationUnit, Classifier classifier) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_binding = pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, type, artifact, c2a, t2c, compilationUnit, classifier);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_binding[0];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_black = pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, type, artifact, c2a, t2c, compilationUnit,
						classifier };
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
			Manifestation4CompilationUnit2Artifact _this, Match match, Artifact artifact, Manifestation manifestation,
			Classifier classifier) {
		if (!artifact.equals(classifier)) {
			return new Object[] { _this, match, artifact, manifestation, classifier };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_bindingFBBBBB(
			Manifestation4CompilationUnit2Artifact _this, Match match, Artifact artifact, Manifestation manifestation,
			Classifier classifier) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, artifact, manifestation, classifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, artifact, manifestation, classifier };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_bindingAndBlackFBBBBB(
			Manifestation4CompilationUnit2Artifact _this, Match match, Artifact artifact, Manifestation manifestation,
			Classifier classifier) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_binding = pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_bindingFBBBBB(
				_this, match, artifact, manifestation, classifier);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_binding[0];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_black = pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, artifact, manifestation, classifier };
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
			Match match, Artifact artifact, Manifestation manifestation, Classifier classifier) {
		if (!artifact.equals(classifier)) {
			return new Object[] { match, artifact, manifestation, classifier };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Artifact artifact, Manifestation manifestation, Classifier classifier) {
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
		return new Object[] { match, artifact, manifestation, classifier, artifact__manifestation____manifestation,
				manifestation__classifier____utilizedElement };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_10_5_collectcontextelements_blackBBBB(
			Match match, Artifact artifact, Manifestation manifestation, Classifier classifier) {
		if (!artifact.equals(classifier)) {
			return new Object[] { match, artifact, manifestation, classifier };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_10_5_collectcontextelements_greenBBB(
			Match match, Artifact artifact, Classifier classifier) {
		match.getContextNodes().add(artifact);
		match.getContextNodes().add(classifier);
		return new Object[] { match, artifact, classifier };
	}

	public static final void pattern_Manifestation4CompilationUnit2Artifact_10_6_registerobjectstomatch_expressionBBBBB(
			Manifestation4CompilationUnit2Artifact _this, Match match, Artifact artifact, Manifestation manifestation,
			Classifier classifier) {
		_this.registerObjectsToMatch_BWD(match, artifact, manifestation, classifier);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("type");
		EObject _localVariable_1 = isApplicableMatch.getObject("artifact");
		EObject _localVariable_2 = isApplicableMatch.getObject("c2a");
		EObject _localVariable_3 = isApplicableMatch.getObject("t2c");
		EObject _localVariable_4 = isApplicableMatch.getObject("manifestation");
		EObject _localVariable_5 = isApplicableMatch.getObject("compilationUnit");
		EObject _localVariable_6 = isApplicableMatch.getObject("classifier");
		EObject tmpType = _localVariable_0;
		EObject tmpArtifact = _localVariable_1;
		EObject tmpC2a = _localVariable_2;
		EObject tmpT2c = _localVariable_3;
		EObject tmpManifestation = _localVariable_4;
		EObject tmpCompilationUnit = _localVariable_5;
		EObject tmpClassifier = _localVariable_6;
		if (tmpType instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration type = (AbstractTypeDeclaration) tmpType;
			if (tmpArtifact instanceof Artifact) {
				Artifact artifact = (Artifact) tmpArtifact;
				if (tmpC2a instanceof CompilationUnit2Artifact) {
					CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) tmpC2a;
					if (tmpT2c instanceof ASTNode2Element) {
						ASTNode2Element t2c = (ASTNode2Element) tmpT2c;
						if (tmpManifestation instanceof Manifestation) {
							Manifestation manifestation = (Manifestation) tmpManifestation;
							if (tmpCompilationUnit instanceof CompilationUnit) {
								CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
								if (tmpClassifier instanceof Classifier) {
									Classifier classifier = (Classifier) tmpClassifier;
									return new Object[] { type, artifact, c2a, t2c, manifestation, compilationUnit,
											classifier, isApplicableMatch };
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
			AbstractTypeDeclaration type, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			Manifestation manifestation, CompilationUnit compilationUnit, Classifier classifier,
			Manifestation4CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch) {
		if (!artifact.equals(classifier)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { type, artifact, c2a, t2c, manifestation, compilationUnit, classifier, csp,
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
			AbstractTypeDeclaration type = (AbstractTypeDeclaration) result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_binding[0];
			Artifact artifact = (Artifact) result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_binding[1];
			CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_binding[2];
			ASTNode2Element t2c = (ASTNode2Element) result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_binding[3];
			Manifestation manifestation = (Manifestation) result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_binding[4];
			CompilationUnit compilationUnit = (CompilationUnit) result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_binding[5];
			Classifier classifier = (Classifier) result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_binding[6];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_black = pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_blackBBBBBBBFBB(
					type, artifact, c2a, t2c, manifestation, compilationUnit, classifier, _this, isApplicableMatch);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_black[7];

				return new Object[] { type, artifact, c2a, t2c, manifestation, compilationUnit, classifier, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_11_1_performtransformation_greenBB(
			AbstractTypeDeclaration type, CompilationUnit compilationUnit) {
		compilationUnit.getTypes().add(type);
		return new Object[] { type, compilationUnit };
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
			PerformRuleResult ruleresult, EObject type, EObject artifact, EObject c2a, EObject t2c,
			EObject manifestation, EObject compilationUnit, EObject classifier) {
		if (!artifact.equals(type)) {
			if (!artifact.equals(c2a)) {
				if (!artifact.equals(t2c)) {
					if (!artifact.equals(manifestation)) {
						if (!artifact.equals(compilationUnit)) {
							if (!artifact.equals(classifier)) {
								if (!c2a.equals(type)) {
									if (!c2a.equals(t2c)) {
										if (!c2a.equals(manifestation)) {
											if (!c2a.equals(compilationUnit)) {
												if (!c2a.equals(classifier)) {
													if (!t2c.equals(type)) {
														if (!manifestation.equals(type)) {
															if (!manifestation.equals(t2c)) {
																if (!compilationUnit.equals(type)) {
																	if (!compilationUnit.equals(t2c)) {
																		if (!compilationUnit.equals(manifestation)) {
																			if (!classifier.equals(type)) {
																				if (!classifier.equals(t2c)) {
																					if (!classifier
																							.equals(manifestation)) {
																						if (!classifier.equals(
																								compilationUnit)) {
																							return new Object[] {
																									ruleresult, type,
																									artifact, c2a, t2c,
																									manifestation,
																									compilationUnit,
																									classifier };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject type, EObject artifact, EObject manifestation,
			EObject compilationUnit, EObject classifier) {
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
		return new Object[] { ruleresult, type, artifact, manifestation, compilationUnit, classifier,
				artifact__manifestation____manifestation, manifestation__classifier____utilizedElement,
				compilationUnit__type____types };
	}

	public static final void pattern_Manifestation4CompilationUnit2Artifact_11_5_registerobjects_expressionBBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, PerformRuleResult ruleresult, EObject type, EObject artifact,
			EObject c2a, EObject t2c, EObject manifestation, EObject compilationUnit, EObject classifier) {
		_this.registerObjects_BWD(ruleresult, type, artifact, c2a, t2c, manifestation, compilationUnit, classifier);

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
		EObject _localVariable_0 = match.getObject("artifact");
		EObject _localVariable_1 = match.getObject("manifestation");
		EObject _localVariable_2 = match.getObject("classifier");
		EObject tmpArtifact = _localVariable_0;
		EObject tmpManifestation = _localVariable_1;
		EObject tmpClassifier = _localVariable_2;
		if (tmpArtifact instanceof Artifact) {
			Artifact artifact = (Artifact) tmpArtifact;
			if (tmpManifestation instanceof Manifestation) {
				Manifestation manifestation = (Manifestation) tmpManifestation;
				if (tmpClassifier instanceof Classifier) {
					Classifier classifier = (Classifier) tmpClassifier;
					return new Object[] { artifact, manifestation, classifier, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Manifestation4CompilationUnit2Artifact_12_2_corematch_blackFBFFBFBB(
			Artifact artifact, Manifestation manifestation, Classifier classifier, Match match) {
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
							_result.add(new Object[] { type, artifact, c2a, t2c, manifestation, compilationUnit,
									classifier, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Manifestation4CompilationUnit2Artifact_12_3_findcontext_blackBBBBBBB(
			AbstractTypeDeclaration type, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			Manifestation manifestation, CompilationUnit compilationUnit, Classifier classifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!artifact.equals(classifier)) {
			if (artifact.getManifestations().contains(manifestation)) {
				if (artifact.equals(c2a.getTarget())) {
					if (type.equals(t2c.getSource())) {
						if (classifier.equals(manifestation.getUtilizedElement())) {
							if (classifier.equals(t2c.getTarget())) {
								if (compilationUnit.equals(c2a.getSource())) {
									_result.add(new Object[] { type, artifact, c2a, t2c, manifestation, compilationUnit,
											classifier });
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
			AbstractTypeDeclaration type, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			Manifestation manifestation, CompilationUnit compilationUnit, Classifier classifier) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge artifact__manifestation____manifestation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2a__artifact____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__type____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge manifestation__classifier____utilizedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__classifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2a__compilationUnit____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String artifact__manifestation____manifestation_name_prime = "manifestation";
		String c2a__artifact____target_name_prime = "target";
		String t2c__type____source_name_prime = "source";
		String manifestation__classifier____utilizedElement_name_prime = "utilizedElement";
		String t2c__classifier____target_name_prime = "target";
		String c2a__compilationUnit____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(type);
		isApplicableMatch.getAllContextElements().add(artifact);
		isApplicableMatch.getAllContextElements().add(c2a);
		isApplicableMatch.getAllContextElements().add(t2c);
		isApplicableMatch.getAllContextElements().add(manifestation);
		isApplicableMatch.getAllContextElements().add(compilationUnit);
		isApplicableMatch.getAllContextElements().add(classifier);
		artifact__manifestation____manifestation.setSrc(artifact);
		artifact__manifestation____manifestation.setTrg(manifestation);
		isApplicableMatch.getAllContextElements().add(artifact__manifestation____manifestation);
		c2a__artifact____target.setSrc(c2a);
		c2a__artifact____target.setTrg(artifact);
		isApplicableMatch.getAllContextElements().add(c2a__artifact____target);
		t2c__type____source.setSrc(t2c);
		t2c__type____source.setTrg(type);
		isApplicableMatch.getAllContextElements().add(t2c__type____source);
		manifestation__classifier____utilizedElement.setSrc(manifestation);
		manifestation__classifier____utilizedElement.setTrg(classifier);
		isApplicableMatch.getAllContextElements().add(manifestation__classifier____utilizedElement);
		t2c__classifier____target.setSrc(t2c);
		t2c__classifier____target.setTrg(classifier);
		isApplicableMatch.getAllContextElements().add(t2c__classifier____target);
		c2a__compilationUnit____source.setSrc(c2a);
		c2a__compilationUnit____source.setTrg(compilationUnit);
		isApplicableMatch.getAllContextElements().add(c2a__compilationUnit____source);
		artifact__manifestation____manifestation.setName(artifact__manifestation____manifestation_name_prime);
		c2a__artifact____target.setName(c2a__artifact____target_name_prime);
		t2c__type____source.setName(t2c__type____source_name_prime);
		manifestation__classifier____utilizedElement.setName(manifestation__classifier____utilizedElement_name_prime);
		t2c__classifier____target.setName(t2c__classifier____target_name_prime);
		c2a__compilationUnit____source.setName(c2a__compilationUnit____source_name_prime);
		return new Object[] { type, artifact, c2a, t2c, manifestation, compilationUnit, classifier, isApplicableMatch,
				artifact__manifestation____manifestation, c2a__artifact____target, t2c__type____source,
				manifestation__classifier____utilizedElement, t2c__classifier____target,
				c2a__compilationUnit____source };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_bindingFBBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch,
			AbstractTypeDeclaration type, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			Manifestation manifestation, CompilationUnit compilationUnit, Classifier classifier) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, type, artifact, c2a, t2c,
				manifestation, compilationUnit, classifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, type, artifact, c2a, t2c, manifestation,
					compilationUnit, classifier };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch,
			AbstractTypeDeclaration type, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			Manifestation manifestation, CompilationUnit compilationUnit, Classifier classifier) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_binding = pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, type, artifact, c2a, t2c, manifestation, compilationUnit, classifier);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_binding[0];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_black = pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, type, artifact, c2a, t2c, manifestation,
						compilationUnit, classifier };
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
			Manifestation manifestation, Artifact artifact, Classifier classifier) {
		if (!artifact.equals(classifier)) {
			for (NamedElement __DEC_manifestation_client_652789 : manifestation.getClients()) {
				if (!manifestation.equals(__DEC_manifestation_client_652789)) {
					if (!artifact.equals(__DEC_manifestation_client_652789)) {
						if (!classifier.equals(__DEC_manifestation_client_652789)) {
							return new Object[] { manifestation, artifact, classifier };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_1BBB(
			Manifestation manifestation, Artifact artifact, Classifier classifier) {
		if (!artifact.equals(classifier)) {
			for (NamedElement __DEC_manifestation_supplier_461760 : manifestation.getSuppliers()) {
				if (!manifestation.equals(__DEC_manifestation_supplier_461760)) {
					if (!artifact.equals(__DEC_manifestation_supplier_461760)) {
						if (!classifier.equals(__DEC_manifestation_supplier_461760)) {
							return new Object[] { manifestation, artifact, classifier };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_2BB(
			Manifestation manifestation, Artifact artifact) {
		if (manifestation.getClients().contains(artifact)) {
			return new Object[] { manifestation, artifact };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_3BB(
			Manifestation manifestation, Classifier classifier) {
		if (manifestation.getClients().contains(classifier)) {
			return new Object[] { manifestation, classifier };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_4BB(
			Manifestation manifestation, Artifact artifact) {
		if (manifestation.getSuppliers().contains(artifact)) {
			return new Object[] { manifestation, artifact };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_5BB(
			Manifestation manifestation, Classifier classifier) {
		if (manifestation.getSuppliers().contains(classifier)) {
			return new Object[] { manifestation, classifier };
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
							if (pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_2BB(
									manifestation, artifact) == null) {
								if (pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_4BB(
										manifestation, artifact) == null) {
									if (pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_0BBB(
											manifestation, artifact, classifier) == null) {
										if (pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_1BBB(
												manifestation, artifact, classifier) == null) {
											if (pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_3BB(
													manifestation, classifier) == null) {
												if (pattern_Manifestation4CompilationUnit2Artifact_20_2_testcorematchandDECs_black_nac_5BB(
														manifestation, classifier) == null) {
													_result.add(new Object[] { artifact, manifestation, classifier,
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
			Manifestation4CompilationUnit2Artifact _this, Match match, Artifact artifact, Manifestation manifestation,
			Classifier classifier) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, artifact, manifestation, classifier);
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
					_result.add(new Object[] { type, compilationUnit, _edge_types });
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
			Manifestation4CompilationUnit2Artifact _this, Match match, AbstractTypeDeclaration type,
			CompilationUnit compilationUnit) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, type, compilationUnit);
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
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("type");
		EObject _localVariable_1 = targetMatch.getObject("artifact");
		EObject _localVariable_2 = targetMatch.getObject("manifestation");
		EObject _localVariable_3 = sourceMatch.getObject("compilationUnit");
		EObject _localVariable_4 = targetMatch.getObject("classifier");
		EObject tmpType = _localVariable_0;
		EObject tmpArtifact = _localVariable_1;
		EObject tmpManifestation = _localVariable_2;
		EObject tmpCompilationUnit = _localVariable_3;
		EObject tmpClassifier = _localVariable_4;
		if (tmpType instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration type = (AbstractTypeDeclaration) tmpType;
			if (tmpArtifact instanceof Artifact) {
				Artifact artifact = (Artifact) tmpArtifact;
				if (tmpManifestation instanceof Manifestation) {
					Manifestation manifestation = (Manifestation) tmpManifestation;
					if (tmpCompilationUnit instanceof CompilationUnit) {
						CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
						if (tmpClassifier instanceof Classifier) {
							Classifier classifier = (Classifier) tmpClassifier;
							return new Object[] { type, artifact, manifestation, compilationUnit, classifier,
									sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_blackBBBBBBB(
			AbstractTypeDeclaration type, Artifact artifact, Manifestation manifestation,
			CompilationUnit compilationUnit, Classifier classifier, Match sourceMatch, Match targetMatch) {
		if (!artifact.equals(classifier)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { type, artifact, manifestation, compilationUnit, classifier, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding = pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_bindingFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding != null) {
			AbstractTypeDeclaration type = (AbstractTypeDeclaration) result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[0];
			Artifact artifact = (Artifact) result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[1];
			Manifestation manifestation = (Manifestation) result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[2];
			CompilationUnit compilationUnit = (CompilationUnit) result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[3];
			Classifier classifier = (Classifier) result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_black = pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_blackBBBBBBB(
					type, artifact, manifestation, compilationUnit, classifier, sourceMatch, targetMatch);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { type, artifact, manifestation, compilationUnit, classifier, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_bindingFBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, AbstractTypeDeclaration type, Artifact artifact,
			Manifestation manifestation, CompilationUnit compilationUnit, Classifier classifier, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(type, artifact, manifestation, compilationUnit,
				classifier, sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, type, artifact, manifestation, compilationUnit, classifier, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, AbstractTypeDeclaration type, Artifact artifact,
			Manifestation manifestation, CompilationUnit compilationUnit, Classifier classifier, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_binding = pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_bindingFBBBBBBBB(
				_this, type, artifact, manifestation, compilationUnit, classifier, sourceMatch, targetMatch);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_binding[0];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_black = pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, type, artifact, manifestation, compilationUnit, classifier,
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

	public static final Iterable<Object[]> pattern_Manifestation4CompilationUnit2Artifact_24_5_matchcorrcontext_blackBBFFBBBB(
			AbstractTypeDeclaration type, Artifact artifact, CompilationUnit compilationUnit, Classifier classifier,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!artifact.equals(classifier)) {
			if (!sourceMatch.equals(targetMatch)) {
				for (CompilationUnit2Artifact c2a : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(artifact, CompilationUnit2Artifact.class, "target")) {
					if (compilationUnit.equals(c2a.getSource())) {
						for (ASTNode2Element t2c : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(type, ASTNode2Element.class, "source")) {
							if (classifier.equals(t2c.getTarget())) {
								_result.add(new Object[] { type, artifact, c2a, t2c, compilationUnit, classifier,
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
			AbstractTypeDeclaration type, Artifact artifact, Manifestation manifestation,
			CompilationUnit compilationUnit, Classifier classifier, CCMatch ccMatch) {
		if (!artifact.equals(classifier)) {
			return new Object[] { type, artifact, manifestation, compilationUnit, classifier, ccMatch };
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
			AbstractTypeDeclaration type, CompilationUnit compilationUnit) {
		if (compilationUnit.getTypes().contains(type)) {
			return new Object[] { type, compilationUnit };
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
			Manifestation manifestation, Artifact artifact, Classifier classifier) {
		if (!artifact.equals(classifier)) {
			for (NamedElement __DEC_manifestation_client_587458 : manifestation.getClients()) {
				if (!manifestation.equals(__DEC_manifestation_client_587458)) {
					if (!artifact.equals(__DEC_manifestation_client_587458)) {
						if (!classifier.equals(__DEC_manifestation_client_587458)) {
							return new Object[] { manifestation, artifact, classifier };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_1BBB(
			Manifestation manifestation, Artifact artifact, Classifier classifier) {
		if (!artifact.equals(classifier)) {
			for (NamedElement __DEC_manifestation_supplier_234893 : manifestation.getSuppliers()) {
				if (!manifestation.equals(__DEC_manifestation_supplier_234893)) {
					if (!artifact.equals(__DEC_manifestation_supplier_234893)) {
						if (!classifier.equals(__DEC_manifestation_supplier_234893)) {
							return new Object[] { manifestation, artifact, classifier };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_2BB(
			Manifestation manifestation, Artifact artifact) {
		if (manifestation.getClients().contains(artifact)) {
			return new Object[] { manifestation, artifact };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_3BB(
			Manifestation manifestation, Classifier classifier) {
		if (manifestation.getClients().contains(classifier)) {
			return new Object[] { manifestation, classifier };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_4BB(
			Manifestation manifestation, Artifact artifact) {
		if (manifestation.getSuppliers().contains(artifact)) {
			return new Object[] { manifestation, artifact };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_5BB(
			Manifestation manifestation, Classifier classifier) {
		if (manifestation.getSuppliers().contains(classifier)) {
			return new Object[] { manifestation, classifier };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_blackBBB(
			Artifact artifact, Manifestation manifestation, Classifier classifier) {
		if (!artifact.equals(classifier)) {
			if (artifact.getManifestations().contains(manifestation)) {
				if (classifier.equals(manifestation.getUtilizedElement())) {
					if (pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_0BBB(
							manifestation, artifact, classifier) == null) {
						if (pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_1BBB(
								manifestation, artifact, classifier) == null) {
							if (pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_2BB(
									manifestation, artifact) == null) {
								if (pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_3BB(
										manifestation, classifier) == null) {
									if (pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_4BB(
											manifestation, artifact) == null) {
										if (pattern_Manifestation4CompilationUnit2Artifact_28_1_matchtggpattern_black_nac_5BB(
												manifestation, classifier) == null) {
											return new Object[] { artifact, manifestation, classifier };
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
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration type) {
		if (ruleResult.getSourceObjects().contains(type)) {
			return new Object[] { ruleResult, type };
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
			ModelgeneratorRuleResult ruleResult, Classifier classifier) {
		if (ruleResult.getTargetObjects().contains(classifier)) {
			return new Object[] { ruleResult, classifier };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Artifact artifact) {
		if (ruleResult.getTargetObjects().contains(artifact)) {
			return new Object[] { ruleResult, artifact };
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
			ModelgeneratorRuleResult ruleResult, CompilationUnit compilationUnit) {
		if (ruleResult.getSourceObjects().contains(compilationUnit)) {
			return new Object[] { ruleResult, compilationUnit };
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
							ASTNode tmpType = t2c.getSource();
							if (tmpType instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration type = (AbstractTypeDeclaration) tmpType;
								Element tmpClassifier = t2c.getTarget();
								if (tmpClassifier instanceof Classifier) {
									Classifier classifier = (Classifier) tmpClassifier;
									if (pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, t2c) == null) {
										if (pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, type) == null) {
											if (pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, classifier) == null) {
												for (EObject tmpC2a : c2aList.getEntryObjects()) {
													if (tmpC2a instanceof CompilationUnit2Artifact) {
														CompilationUnit2Artifact c2a = (CompilationUnit2Artifact) tmpC2a;
														Artifact artifact = c2a.getTarget();
														if (artifact != null) {
															if (!artifact.equals(classifier)) {
																CompilationUnit compilationUnit = c2a.getSource();
																if (compilationUnit != null) {
																	if (pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, c2a) == null) {
																		if (pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, artifact) == null) {
																			if (pattern_Manifestation4CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult,
																					compilationUnit) == null) {
																				_result.add(new Object[] { t2cList,
																						type, t2c, classifier, c2aList,
																						artifact, c2a, compilationUnit,
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
			Manifestation4CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch,
			AbstractTypeDeclaration type, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			CompilationUnit compilationUnit, Classifier classifier, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, type, artifact, c2a, t2c,
				compilationUnit, classifier, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, type, artifact, c2a, t2c, compilationUnit, classifier,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			Manifestation4CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch,
			AbstractTypeDeclaration type, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			CompilationUnit compilationUnit, Classifier classifier, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_binding = pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, type, artifact, c2a, t2c, compilationUnit, classifier, ruleResult);
		if (result_pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_binding[0];

			Object[] result_pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_black = pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_Manifestation4CompilationUnit2Artifact_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, type, artifact, c2a, t2c, compilationUnit,
						classifier, ruleResult };
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
			AbstractTypeDeclaration type, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			CompilationUnit compilationUnit, Classifier classifier) {
		if (!artifact.equals(classifier)) {
			return new Object[] { type, artifact, c2a, t2c, compilationUnit, classifier };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_6_perform_blackBBBBBBB(
			AbstractTypeDeclaration type, Artifact artifact, CompilationUnit2Artifact c2a, ASTNode2Element t2c,
			CompilationUnit compilationUnit, Classifier classifier, ModelgeneratorRuleResult ruleResult) {
		if (!artifact.equals(classifier)) {
			return new Object[] { type, artifact, c2a, t2c, compilationUnit, classifier, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Manifestation4CompilationUnit2Artifact_29_6_perform_greenBBFBBB(
			AbstractTypeDeclaration type, Artifact artifact, CompilationUnit compilationUnit, Classifier classifier,
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
		return new Object[] { type, artifact, manifestation, compilationUnit, classifier, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_Manifestation4CompilationUnit2Artifact_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //Manifestation4CompilationUnit2ArtifactImpl
