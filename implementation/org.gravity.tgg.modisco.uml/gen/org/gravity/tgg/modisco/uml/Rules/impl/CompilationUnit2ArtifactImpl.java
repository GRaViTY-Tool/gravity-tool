/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.CompilationUnit;
import org.eclipse.modisco.java.Model;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.JavaModel2UMLPackage;

import org.gravity.tgg.modisco.uml.Rules.CompilationUnit2Artifact;
import org.gravity.tgg.modisco.uml.Rules.RulesPackage;

import org.gravity.tgg.modisco.uml.UmlFactory;

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
 * An implementation of the model object '<em><b>Compilation Unit2 Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CompilationUnit2ArtifactImpl extends AbstractRuleImpl implements CompilationUnit2Artifact {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnit2ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getCompilationUnit2Artifact();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Model jm, CompilationUnit compilationUnit) {

		Object[] result1_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_0_1_initialbindings_blackBBBB(this, match, jm, compilationUnit);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[jm] = " + jm + ", " + "[compilationUnit] = " + compilationUnit + ".");
		}

		Object[] result2_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, jm, compilationUnit);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[jm] = " + jm + ", " + "[compilationUnit] = " + compilationUnit + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_0_4_collectelementstobetranslated_blackBBB(match, jm,
							compilationUnit);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jm] = " + jm + ", " + "[compilationUnit] = " + compilationUnit + ".");
			}
			CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_0_4_collectelementstobetranslated_greenBBBF(
					match, jm, compilationUnit);
			//nothing EMoflonEdge jm__compilationUnit____compilationUnits = (EMoflonEdge) result4_green[3];

			Object[] result5_black = CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_0_5_collectcontextelements_blackBBB(match, jm, compilationUnit);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jm] = " + jm + ", " + "[compilationUnit] = " + compilationUnit + ".");
			}
			CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_0_5_collectcontextelements_greenBB(match, jm);

			// 
			CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_0_6_registerobjectstomatch_expressionBBBB(
					this, match, jm, compilationUnit);
			return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_0_7_expressionF();
		} else {
			return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Model jm = (Model) result1_bindingAndBlack[0];
		CompilationUnit compilationUnit = (CompilationUnit) result1_bindingAndBlack[1];
		JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_1_1_performtransformation_greenFBFBB(compilationUnit, um, csp);
		org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a = (org.gravity.tgg.modisco.uml.CompilationUnit2Artifact) result1_green[0];
		Artifact artifact = (Artifact) result1_green[2];

		Object[] result2_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_1_2_collecttranslatedelements_blackBBB(c2a, compilationUnit,
						artifact);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c2a] = " + c2a + ", "
					+ "[compilationUnit] = " + compilationUnit + ", " + "[artifact] = " + artifact + ".");
		}
		Object[] result2_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_1_2_collecttranslatedelements_greenFBBB(c2a, compilationUnit,
						artifact);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, jm, c2a,
						compilationUnit, jm2um, artifact, um);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[jm] = " + jm + ", " + "[c2a] = " + c2a + ", " + "[compilationUnit] = " + compilationUnit
					+ ", " + "[jm2um] = " + jm2um + ", " + "[artifact] = " + artifact + ", " + "[um] = " + um + ".");
		}
		CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_1_3_bookkeepingforedges_greenBBBBBBFFFF(
				ruleresult, jm, c2a, compilationUnit, artifact, um);
		//nothing EMoflonEdge jm__compilationUnit____compilationUnits = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge c2a__artifact____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge c2a__compilationUnit____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge um__artifact____packagedElement = (EMoflonEdge) result3_green[9];

		// 
		// 
		CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, jm, c2a, compilationUnit, jm2um, artifact, um);
		return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Model jm = (Model) result2_binding[0];
		CompilationUnit compilationUnit = (CompilationUnit) result2_binding[1];
		for (Object[] result2_black : CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_2_2_corematch_blackBBFFB(jm, compilationUnit, match)) {
			JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result2_black[2];
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result2_black[3];
			// ForEach 
			for (Object[] result3_black : CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_2_3_findcontext_blackBBBB(jm, compilationUnit, jm2um, um)) {
				Object[] result3_green = CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_2_3_findcontext_greenBBBBFFFF(jm, compilationUnit, jm2um, um);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge jm__compilationUnit____compilationUnits = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge jm2um__jm____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge jm2um__um____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								jm, compilationUnit, jm2um, um);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jm] = " + jm + ", "
							+ "[compilationUnit] = " + compilationUnit + ", " + "[jm2um] = " + jm2um + ", " + "[um] = "
							+ um + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = CompilationUnit2ArtifactImpl
							.pattern_CompilationUnit2Artifact_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Model jm, CompilationUnit compilationUnit) {
		match.registerObject("jm", jm);
		match.registerObject("compilationUnit", compilationUnit);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Model jm, CompilationUnit compilationUnit) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Model jm, CompilationUnit compilationUnit,
			JavaModel2UMLPackage jm2um, org.eclipse.uml2.uml.Model um) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_compilationUnit_name = CSPFactoryHelper.eINSTANCE.createVariable("compilationUnit.name", true,
				csp);
		var_compilationUnit_name.setValue(compilationUnit.getName());
		var_compilationUnit_name.setType("String");
		Variable var_compilationUnit_originalFilePath = CSPFactoryHelper.eINSTANCE
				.createVariable("compilationUnit.originalFilePath", true, csp);
		var_compilationUnit_originalFilePath.setValue(compilationUnit.getOriginalFilePath());
		var_compilationUnit_originalFilePath.setType("String");

		// Create unbound variables
		Variable var_artifact_name = CSPFactoryHelper.eINSTANCE.createVariable("artifact.name", csp);
		var_artifact_name.setType("String");
		Variable var_artifact_fileName = CSPFactoryHelper.eINSTANCE.createVariable("artifact.fileName", csp);
		var_artifact_fileName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_compilationUnit_name, var_artifact_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_compilationUnit_originalFilePath, var_artifact_fileName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jm", jm);
		isApplicableMatch.registerObject("compilationUnit", compilationUnit);
		isApplicableMatch.registerObject("jm2um", jm2um);
		isApplicableMatch.registerObject("um", um);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject jm, EObject c2a, EObject compilationUnit,
			EObject jm2um, EObject artifact, EObject um) {
		ruleresult.registerObject("jm", jm);
		ruleresult.registerObject("c2a", c2a);
		ruleresult.registerObject("compilationUnit", compilationUnit);
		ruleresult.registerObject("jm2um", jm2um);
		ruleresult.registerObject("artifact", artifact);
		ruleresult.registerObject("um", um);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("compilationUnit").eClass())
				.equals("java.CompilationUnit.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Artifact artifact, org.eclipse.uml2.uml.Model um) {

		Object[] result1_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_10_1_initialbindings_blackBBBB(this, match, artifact, um);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[artifact] = " + artifact + ", " + "[um] = " + um + ".");
		}

		Object[] result2_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, artifact, um);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[artifact] = " + artifact + ", " + "[um] = " + um + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_10_4_collectelementstobetranslated_blackBBB(match, artifact, um);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[artifact] = " + artifact + ", " + "[um] = " + um + ".");
			}
			CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_10_4_collectelementstobetranslated_greenBBBF(match, artifact, um);
			//nothing EMoflonEdge um__artifact____packagedElement = (EMoflonEdge) result4_green[3];

			Object[] result5_black = CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_10_5_collectcontextelements_blackBBB(match, artifact, um);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[artifact] = " + artifact + ", " + "[um] = " + um + ".");
			}
			CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_10_5_collectcontextelements_greenBB(match,
					um);

			// 
			CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_10_6_registerobjectstomatch_expressionBBBB(
					this, match, artifact, um);
			return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_10_7_expressionF();
		} else {
			return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Model jm = (Model) result1_bindingAndBlack[0];
		JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result1_bindingAndBlack[1];
		Artifact artifact = (Artifact) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_11_1_performtransformation_greenBFFBB(jm, artifact, csp);
		org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a = (org.gravity.tgg.modisco.uml.CompilationUnit2Artifact) result1_green[1];
		CompilationUnit compilationUnit = (CompilationUnit) result1_green[2];

		Object[] result2_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_11_2_collecttranslatedelements_blackBBB(c2a, compilationUnit,
						artifact);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c2a] = " + c2a + ", "
					+ "[compilationUnit] = " + compilationUnit + ", " + "[artifact] = " + artifact + ".");
		}
		Object[] result2_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_11_2_collecttranslatedelements_greenFBBB(c2a, compilationUnit,
						artifact);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, jm, c2a,
						compilationUnit, jm2um, artifact, um);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[jm] = " + jm + ", " + "[c2a] = " + c2a + ", " + "[compilationUnit] = " + compilationUnit
					+ ", " + "[jm2um] = " + jm2um + ", " + "[artifact] = " + artifact + ", " + "[um] = " + um + ".");
		}
		CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_11_3_bookkeepingforedges_greenBBBBBBFFFF(
				ruleresult, jm, c2a, compilationUnit, artifact, um);
		//nothing EMoflonEdge jm__compilationUnit____compilationUnits = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge c2a__artifact____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge c2a__compilationUnit____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge um__artifact____packagedElement = (EMoflonEdge) result3_green[9];

		// 
		// 
		CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_11_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, jm, c2a, compilationUnit, jm2um, artifact, um);
		return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Artifact artifact = (Artifact) result2_binding[0];
		org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result2_binding[1];
		for (Object[] result2_black : CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_12_2_corematch_blackFFBBB(artifact, um, match)) {
			Model jm = (Model) result2_black[0];
			JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result2_black[1];
			// ForEach 
			for (Object[] result3_black : CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_12_3_findcontext_blackBBBB(jm, jm2um, artifact, um)) {
				Object[] result3_green = CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_12_3_findcontext_greenBBBBFFFF(jm, jm2um, artifact, um);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge jm2um__jm____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge jm2um__um____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge um__artifact____packagedElement = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								jm, jm2um, artifact, um);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jm] = " + jm + ", " + "[jm2um] = "
							+ jm2um + ", " + "[artifact] = " + artifact + ", " + "[um] = " + um + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = CompilationUnit2ArtifactImpl
							.pattern_CompilationUnit2Artifact_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Artifact artifact, org.eclipse.uml2.uml.Model um) {
		match.registerObject("artifact", artifact);
		match.registerObject("um", um);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Artifact artifact, org.eclipse.uml2.uml.Model um) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Model jm, JavaModel2UMLPackage jm2um,
			Artifact artifact, org.eclipse.uml2.uml.Model um) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_artifact_name = CSPFactoryHelper.eINSTANCE.createVariable("artifact.name", true, csp);
		var_artifact_name.setValue(artifact.getName());
		var_artifact_name.setType("String");
		Variable var_artifact_fileName = CSPFactoryHelper.eINSTANCE.createVariable("artifact.fileName", true, csp);
		var_artifact_fileName.setValue(artifact.getFileName());
		var_artifact_fileName.setType("String");

		// Create unbound variables
		Variable var_compilationUnit_name = CSPFactoryHelper.eINSTANCE.createVariable("compilationUnit.name", csp);
		var_compilationUnit_name.setType("String");
		Variable var_compilationUnit_originalFilePath = CSPFactoryHelper.eINSTANCE
				.createVariable("compilationUnit.originalFilePath", csp);
		var_compilationUnit_originalFilePath.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_compilationUnit_name, var_artifact_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_compilationUnit_originalFilePath, var_artifact_fileName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jm", jm);
		isApplicableMatch.registerObject("jm2um", jm2um);
		isApplicableMatch.registerObject("artifact", artifact);
		isApplicableMatch.registerObject("um", um);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject jm, EObject c2a, EObject compilationUnit,
			EObject jm2um, EObject artifact, EObject um) {
		ruleresult.registerObject("jm", jm);
		ruleresult.registerObject("c2a", c2a);
		ruleresult.registerObject("compilationUnit", compilationUnit);
		ruleresult.registerObject("jm2um", jm2um);
		ruleresult.registerObject("artifact", artifact);
		ruleresult.registerObject("um", um);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("artifact").eClass()).equals("uml.Artifact.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_114(EMoflonEdge _edge_packagedElement) {

		Object[] result1_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_20_2_testcorematchandDECs_blackFFB(_edge_packagedElement)) {
			Artifact artifact = (Artifact) result2_black[0];
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result2_black[1];
			Object[] result2_green = CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, artifact, um)) {
				// 
				if (CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = CompilationUnit2ArtifactImpl
							.pattern_CompilationUnit2Artifact_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_122(EMoflonEdge _edge_compilationUnits) {

		Object[] result1_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_21_2_testcorematchandDECs_blackFFB(_edge_compilationUnits)) {
			Model jm = (Model) result2_black[0];
			CompilationUnit compilationUnit = (CompilationUnit) result2_black[1];
			Object[] result2_green = CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, jm, compilationUnit)) {
				// 
				if (CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = CompilationUnit2ArtifactImpl
							.pattern_CompilationUnit2Artifact_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("CompilationUnit2Artifact");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("um", "name", "source references", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_compilationUnit_originalFilePath = CSPFactoryHelper.eINSTANCE.createVariable("compilationUnit",
				true, csp);
		var_compilationUnit_originalFilePath.setValue(__helper.getValue("compilationUnit", "originalFilePath"));
		var_compilationUnit_originalFilePath.setType("String");

		Variable var_artifact_fileName = CSPFactoryHelper.eINSTANCE.createVariable("artifact", true, csp);
		var_artifact_fileName.setValue(__helper.getValue("artifact", "fileName"));
		var_artifact_fileName.setType("String");

		Variable var_compilationUnit_name = CSPFactoryHelper.eINSTANCE.createVariable("compilationUnit", true, csp);
		var_compilationUnit_name.setValue(__helper.getValue("compilationUnit", "name"));
		var_compilationUnit_name.setType("String");

		Variable var_artifact_name = CSPFactoryHelper.eINSTANCE.createVariable("artifact", true, csp);
		var_artifact_name.setValue(__helper.getValue("artifact", "name"));
		var_artifact_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("CompilationUnit2Artifact");
		eq0.solve(var_compilationUnit_name, var_artifact_name);

		eq1.setRuleName("CompilationUnit2Artifact");
		eq1.solve(var_compilationUnit_originalFilePath, var_artifact_fileName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_artifact_name.setBound(false);
			var_artifact_fileName.setBound(false);
			eq0.solve(var_compilationUnit_name, var_artifact_name);
			eq1.solve(var_compilationUnit_originalFilePath, var_artifact_fileName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("artifact", "name", var_artifact_name.getValue());
				__helper.setValue("artifact", "fileName", var_artifact_fileName.getValue());
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
		ruleResult.setRule("CompilationUnit2Artifact");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("um", "name", "source references", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_compilationUnit_originalFilePath = CSPFactoryHelper.eINSTANCE.createVariable("compilationUnit",
				true, csp);
		var_compilationUnit_originalFilePath.setValue(__helper.getValue("compilationUnit", "originalFilePath"));
		var_compilationUnit_originalFilePath.setType("String");

		Variable var_artifact_fileName = CSPFactoryHelper.eINSTANCE.createVariable("artifact", true, csp);
		var_artifact_fileName.setValue(__helper.getValue("artifact", "fileName"));
		var_artifact_fileName.setType("String");

		Variable var_compilationUnit_name = CSPFactoryHelper.eINSTANCE.createVariable("compilationUnit", true, csp);
		var_compilationUnit_name.setValue(__helper.getValue("compilationUnit", "name"));
		var_compilationUnit_name.setType("String");

		Variable var_artifact_name = CSPFactoryHelper.eINSTANCE.createVariable("artifact", true, csp);
		var_artifact_name.setValue(__helper.getValue("artifact", "name"));
		var_artifact_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("CompilationUnit2Artifact");
		eq0.solve(var_compilationUnit_name, var_artifact_name);

		eq1.setRuleName("CompilationUnit2Artifact");
		eq1.solve(var_compilationUnit_originalFilePath, var_artifact_fileName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_compilationUnit_name.setBound(false);
			var_compilationUnit_originalFilePath.setBound(false);
			eq0.solve(var_compilationUnit_name, var_artifact_name);
			eq1.solve(var_compilationUnit_originalFilePath, var_artifact_fileName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("compilationUnit", "name", var_compilationUnit_name.getValue());
				__helper.setValue("compilationUnit", "originalFilePath",
						var_compilationUnit_originalFilePath.getValue());
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

		Object[] result1_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Model jm = (Model) result2_bindingAndBlack[0];
		CompilationUnit compilationUnit = (CompilationUnit) result2_bindingAndBlack[1];
		Artifact artifact = (Artifact) result2_bindingAndBlack[2];
		org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, jm, compilationUnit,
						artifact, um, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[jm] = " + jm + ", " + "[compilationUnit] = " + compilationUnit + ", " + "[artifact] = "
					+ artifact + ", " + "[um] = " + um + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_24_5_matchcorrcontext_blackBFBBB(jm, um, sourceMatch,
							targetMatch)) {
				JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result5_black[1];
				Object[] result5_green = CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_24_5_matchcorrcontext_greenBBBF(jm2um, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_24_6_createcorrespondence_blackBBBBB(jm, compilationUnit,
								artifact, um, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[jm] = " + jm + ", "
							+ "[compilationUnit] = " + compilationUnit + ", " + "[artifact] = " + artifact + ", "
							+ "[um] = " + um + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_24_6_createcorrespondence_greenFBBB(
						compilationUnit, artifact, ccMatch);
				//nothing org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a = (org.gravity.tgg.modisco.uml.CompilationUnit2Artifact) result6_green[0];

				Object[] result7_black = CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Model jm, CompilationUnit compilationUnit, Artifact artifact,
			org.eclipse.uml2.uml.Model um, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_compilationUnit_name = CSPFactoryHelper.eINSTANCE.createVariable("compilationUnit.name", true,
				csp);
		var_compilationUnit_name.setValue(compilationUnit.getName());
		var_compilationUnit_name.setType("String");
		Variable var_artifact_name = CSPFactoryHelper.eINSTANCE.createVariable("artifact.name", true, csp);
		var_artifact_name.setValue(artifact.getName());
		var_artifact_name.setType("String");
		Variable var_compilationUnit_originalFilePath = CSPFactoryHelper.eINSTANCE
				.createVariable("compilationUnit.originalFilePath", true, csp);
		var_compilationUnit_originalFilePath.setValue(compilationUnit.getOriginalFilePath());
		var_compilationUnit_originalFilePath.setType("String");
		Variable var_artifact_fileName = CSPFactoryHelper.eINSTANCE.createVariable("artifact.fileName", true, csp);
		var_artifact_fileName.setValue(artifact.getFileName());
		var_artifact_fileName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_compilationUnit_name, var_artifact_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_compilationUnit_originalFilePath, var_artifact_fileName);
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
	public boolean checkDEC_FWD(Model jm, CompilationUnit compilationUnit) {// 
		Object[] result1_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_27_1_matchtggpattern_blackBB(jm, compilationUnit);
		if (result1_black != null) {
			return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_27_2_expressionF();
		} else {
			return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Artifact artifact, org.eclipse.uml2.uml.Model um) {// 
		Object[] result1_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_28_1_matchtggpattern_blackBB(artifact, um);
		if (result1_black != null) {
			return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_28_2_expressionF();
		} else {
			return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			JavaModel2UMLPackage jm2umParameter) {

		Object[] result1_black = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : CompilationUnit2ArtifactImpl
				.pattern_CompilationUnit2Artifact_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList jm2umList = (RuleEntryList) result2_black[0];
			Model jm = (Model) result2_black[1];
			JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result2_black[2];
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result2_black[3];

			Object[] result3_bindingAndBlack = CompilationUnit2ArtifactImpl
					.pattern_CompilationUnit2Artifact_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, jm,
							jm2um, um, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jm] = " + jm + ", " + "[jm2um] = "
						+ jm2um + ", " + "[um] = " + um + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = CompilationUnit2ArtifactImpl
						.pattern_CompilationUnit2Artifact_29_5_checknacs_blackBBB(jm, jm2um, um);
				if (result5_black != null) {

					Object[] result6_black = CompilationUnit2ArtifactImpl
							.pattern_CompilationUnit2Artifact_29_6_perform_blackBBBB(jm, jm2um, um, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[jm] = " + jm + ", " + "[jm2um] = "
										+ jm2um + ", " + "[um] = " + um + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_29_6_perform_greenBFFFBBB(jm, um,
							ruleResult, csp);
					//nothing org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a = (org.gravity.tgg.modisco.uml.CompilationUnit2Artifact) result6_green[1];
					//nothing CompilationUnit compilationUnit = (CompilationUnit) result6_green[2];
					//nothing Artifact artifact = (Artifact) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return CompilationUnit2ArtifactImpl.pattern_CompilationUnit2Artifact_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Model jm, JavaModel2UMLPackage jm2um,
			org.eclipse.uml2.uml.Model um, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_compilationUnit_name = CSPFactoryHelper.eINSTANCE.createVariable("compilationUnit.name", csp);
		var_compilationUnit_name.setType("String");
		Variable var_artifact_name = CSPFactoryHelper.eINSTANCE.createVariable("artifact.name", csp);
		var_artifact_name.setType("String");
		Variable var_compilationUnit_originalFilePath = CSPFactoryHelper.eINSTANCE
				.createVariable("compilationUnit.originalFilePath", csp);
		var_compilationUnit_originalFilePath.setType("String");
		Variable var_artifact_fileName = CSPFactoryHelper.eINSTANCE.createVariable("artifact.fileName", csp);
		var_artifact_fileName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_compilationUnit_name, var_artifact_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_compilationUnit_originalFilePath, var_artifact_fileName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jm", jm);
		isApplicableMatch.registerObject("jm2um", jm2um);
		isApplicableMatch.registerObject("um", um);
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
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_FWD__MATCH_MODEL_COMPILATIONUNIT:
			return isAppropriate_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(CompilationUnit) arguments.get(2));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL_COMPILATIONUNIT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(CompilationUnit) arguments.get(2));
			return null;
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL_COMPILATIONUNIT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(CompilationUnit) arguments.get(2));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL_COMPILATIONUNIT_JAVAMODEL2UMLPACKAGE_MODEL:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(CompilationUnit) arguments.get(2), (JavaModel2UMLPackage) arguments.get(3),
					(org.eclipse.uml2.uml.Model) arguments.get(4));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_BWD__MATCH_ARTIFACT_MODEL:
			return isAppropriate_BWD((Match) arguments.get(0), (Artifact) arguments.get(1),
					(org.eclipse.uml2.uml.Model) arguments.get(2));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ARTIFACT_MODEL:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Artifact) arguments.get(1),
					(org.eclipse.uml2.uml.Model) arguments.get(2));
			return null;
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ARTIFACT_MODEL:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Artifact) arguments.get(1),
					(org.eclipse.uml2.uml.Model) arguments.get(2));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_JAVAMODEL2UMLPACKAGE_ARTIFACT_MODEL:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(JavaModel2UMLPackage) arguments.get(2), (Artifact) arguments.get(3),
					(org.eclipse.uml2.uml.Model) arguments.get(4));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_114__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_114((EMoflonEdge) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_122__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_122((EMoflonEdge) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_SOLVE_CSP_CC__MODEL_COMPILATIONUNIT_ARTIFACT_MODEL_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Model) arguments.get(0), (CompilationUnit) arguments.get(1),
					(Artifact) arguments.get(2), (org.eclipse.uml2.uml.Model) arguments.get(3),
					(Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___CHECK_DEC_FWD__MODEL_COMPILATIONUNIT:
			return checkDEC_FWD((Model) arguments.get(0), (CompilationUnit) arguments.get(1));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___CHECK_DEC_BWD__ARTIFACT_MODEL:
			return checkDEC_BWD((Artifact) arguments.get(0), (org.eclipse.uml2.uml.Model) arguments.get(1));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___GENERATE_MODEL__RULEENTRYCONTAINER_JAVAMODEL2UMLPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (JavaModel2UMLPackage) arguments.get(1));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_JAVAMODEL2UMLPACKAGE_MODEL_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(JavaModel2UMLPackage) arguments.get(2), (org.eclipse.uml2.uml.Model) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.COMPILATION_UNIT2_ARTIFACT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_CompilationUnit2Artifact_0_1_initialbindings_blackBBBB(
			CompilationUnit2Artifact _this, Match match, Model jm, CompilationUnit compilationUnit) {
		return new Object[] { _this, match, jm, compilationUnit };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_0_2_SolveCSP_bindingFBBBB(
			CompilationUnit2Artifact _this, Match match, Model jm, CompilationUnit compilationUnit) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jm, compilationUnit);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jm, compilationUnit };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_0_2_SolveCSP_bindingAndBlackFBBBB(
			CompilationUnit2Artifact _this, Match match, Model jm, CompilationUnit compilationUnit) {
		Object[] result_pattern_CompilationUnit2Artifact_0_2_SolveCSP_binding = pattern_CompilationUnit2Artifact_0_2_SolveCSP_bindingFBBBB(
				_this, match, jm, compilationUnit);
		if (result_pattern_CompilationUnit2Artifact_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnit2Artifact_0_2_SolveCSP_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_0_2_SolveCSP_black = pattern_CompilationUnit2Artifact_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnit2Artifact_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, jm, compilationUnit };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit2Artifact_0_3_CheckCSP_expressionFBB(
			CompilationUnit2Artifact _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_0_4_collectelementstobetranslated_blackBBB(
			Match match, Model jm, CompilationUnit compilationUnit) {
		return new Object[] { match, jm, compilationUnit };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_0_4_collectelementstobetranslated_greenBBBF(
			Match match, Model jm, CompilationUnit compilationUnit) {
		EMoflonEdge jm__compilationUnit____compilationUnits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(compilationUnit);
		String jm__compilationUnit____compilationUnits_name_prime = "compilationUnits";
		jm__compilationUnit____compilationUnits.setSrc(jm);
		jm__compilationUnit____compilationUnits.setTrg(compilationUnit);
		match.getToBeTranslatedEdges().add(jm__compilationUnit____compilationUnits);
		jm__compilationUnit____compilationUnits.setName(jm__compilationUnit____compilationUnits_name_prime);
		return new Object[] { match, jm, compilationUnit, jm__compilationUnit____compilationUnits };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_0_5_collectcontextelements_blackBBB(Match match,
			Model jm, CompilationUnit compilationUnit) {
		return new Object[] { match, jm, compilationUnit };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_0_5_collectcontextelements_greenBB(Match match,
			Model jm) {
		match.getContextNodes().add(jm);
		return new Object[] { match, jm };
	}

	public static final void pattern_CompilationUnit2Artifact_0_6_registerobjectstomatch_expressionBBBB(
			CompilationUnit2Artifact _this, Match match, Model jm, CompilationUnit compilationUnit) {
		_this.registerObjectsToMatch_FWD(match, jm, compilationUnit);

	}

	public static final boolean pattern_CompilationUnit2Artifact_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_CompilationUnit2Artifact_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jm");
		EObject _localVariable_1 = isApplicableMatch.getObject("compilationUnit");
		EObject _localVariable_2 = isApplicableMatch.getObject("jm2um");
		EObject _localVariable_3 = isApplicableMatch.getObject("um");
		EObject tmpJm = _localVariable_0;
		EObject tmpCompilationUnit = _localVariable_1;
		EObject tmpJm2um = _localVariable_2;
		EObject tmpUm = _localVariable_3;
		if (tmpJm instanceof Model) {
			Model jm = (Model) tmpJm;
			if (tmpCompilationUnit instanceof CompilationUnit) {
				CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
				if (tmpJm2um instanceof JavaModel2UMLPackage) {
					JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) tmpJm2um;
					if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
						org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
						return new Object[] { jm, compilationUnit, jm2um, um, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_1_1_performtransformation_blackBBBBFBB(Model jm,
			CompilationUnit compilationUnit, JavaModel2UMLPackage jm2um, org.eclipse.uml2.uml.Model um,
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jm, compilationUnit, jm2um, um, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_1_1_performtransformation_bindingAndBlackFFFFFBB(
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_CompilationUnit2Artifact_1_1_performtransformation_binding = pattern_CompilationUnit2Artifact_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_CompilationUnit2Artifact_1_1_performtransformation_binding != null) {
			Model jm = (Model) result_pattern_CompilationUnit2Artifact_1_1_performtransformation_binding[0];
			CompilationUnit compilationUnit = (CompilationUnit) result_pattern_CompilationUnit2Artifact_1_1_performtransformation_binding[1];
			JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result_pattern_CompilationUnit2Artifact_1_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result_pattern_CompilationUnit2Artifact_1_1_performtransformation_binding[3];

			Object[] result_pattern_CompilationUnit2Artifact_1_1_performtransformation_black = pattern_CompilationUnit2Artifact_1_1_performtransformation_blackBBBBFBB(
					jm, compilationUnit, jm2um, um, _this, isApplicableMatch);
			if (result_pattern_CompilationUnit2Artifact_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_CompilationUnit2Artifact_1_1_performtransformation_black[4];

				return new Object[] { jm, compilationUnit, jm2um, um, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_1_1_performtransformation_greenFBFBB(
			CompilationUnit compilationUnit, org.eclipse.uml2.uml.Model um, CSP csp) {
		org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a = UmlFactory.eINSTANCE
				.createCompilationUnit2Artifact();
		Artifact artifact = UMLFactory.eINSTANCE.createArtifact();
		Object _localVariable_0 = csp.getValue("artifact", "name");
		Object _localVariable_1 = csp.getValue("artifact", "fileName");
		c2a.setSource(compilationUnit);
		c2a.setTarget(artifact);
		um.getPackagedElements().add(artifact);
		String artifact_name_prime = (String) _localVariable_0;
		String artifact_fileName_prime = (String) _localVariable_1;
		artifact.setName(artifact_name_prime);
		artifact.setFileName(artifact_fileName_prime);
		return new Object[] { c2a, compilationUnit, artifact, um, csp };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_1_2_collecttranslatedelements_blackBBB(
			org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a, CompilationUnit compilationUnit,
			Artifact artifact) {
		return new Object[] { c2a, compilationUnit, artifact };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_1_2_collecttranslatedelements_greenFBBB(
			org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a, CompilationUnit compilationUnit,
			Artifact artifact) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(c2a);
		ruleresult.getTranslatedElements().add(compilationUnit);
		ruleresult.getCreatedElements().add(artifact);
		return new Object[] { ruleresult, c2a, compilationUnit, artifact };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject jm, EObject c2a, EObject compilationUnit, EObject jm2um,
			EObject artifact, EObject um) {
		if (!jm.equals(jm2um)) {
			if (!jm.equals(um)) {
				if (!c2a.equals(jm)) {
					if (!c2a.equals(compilationUnit)) {
						if (!c2a.equals(jm2um)) {
							if (!c2a.equals(um)) {
								if (!compilationUnit.equals(jm)) {
									if (!compilationUnit.equals(jm2um)) {
										if (!compilationUnit.equals(um)) {
											if (!jm2um.equals(um)) {
												if (!artifact.equals(jm)) {
													if (!artifact.equals(c2a)) {
														if (!artifact.equals(compilationUnit)) {
															if (!artifact.equals(jm2um)) {
																if (!artifact.equals(um)) {
																	return new Object[] { ruleresult, jm, c2a,
																			compilationUnit, jm2um, artifact, um };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_CompilationUnit2Artifact_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject jm, EObject c2a, EObject compilationUnit, EObject artifact,
			EObject um) {
		EMoflonEdge jm__compilationUnit____compilationUnits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2a__artifact____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2a__compilationUnit____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge um__artifact____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "CompilationUnit2Artifact";
		String jm__compilationUnit____compilationUnits_name_prime = "compilationUnits";
		String c2a__artifact____target_name_prime = "target";
		String c2a__compilationUnit____source_name_prime = "source";
		String um__artifact____packagedElement_name_prime = "packagedElement";
		jm__compilationUnit____compilationUnits.setSrc(jm);
		jm__compilationUnit____compilationUnits.setTrg(compilationUnit);
		ruleresult.getTranslatedEdges().add(jm__compilationUnit____compilationUnits);
		c2a__artifact____target.setSrc(c2a);
		c2a__artifact____target.setTrg(artifact);
		ruleresult.getCreatedEdges().add(c2a__artifact____target);
		c2a__compilationUnit____source.setSrc(c2a);
		c2a__compilationUnit____source.setTrg(compilationUnit);
		ruleresult.getCreatedEdges().add(c2a__compilationUnit____source);
		um__artifact____packagedElement.setSrc(um);
		um__artifact____packagedElement.setTrg(artifact);
		ruleresult.getCreatedEdges().add(um__artifact____packagedElement);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jm__compilationUnit____compilationUnits.setName(jm__compilationUnit____compilationUnits_name_prime);
		c2a__artifact____target.setName(c2a__artifact____target_name_prime);
		c2a__compilationUnit____source.setName(c2a__compilationUnit____source_name_prime);
		um__artifact____packagedElement.setName(um__artifact____packagedElement_name_prime);
		return new Object[] { ruleresult, jm, c2a, compilationUnit, artifact, um,
				jm__compilationUnit____compilationUnits, c2a__artifact____target, c2a__compilationUnit____source,
				um__artifact____packagedElement };
	}

	public static final void pattern_CompilationUnit2Artifact_1_5_registerobjects_expressionBBBBBBBB(
			CompilationUnit2Artifact _this, PerformRuleResult ruleresult, EObject jm, EObject c2a,
			EObject compilationUnit, EObject jm2um, EObject artifact, EObject um) {
		_this.registerObjects_FWD(ruleresult, jm, c2a, compilationUnit, jm2um, artifact, um);

	}

	public static final PerformRuleResult pattern_CompilationUnit2Artifact_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_bindingFB(
			CompilationUnit2Artifact _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_blackFBB(EClass eClass,
			CompilationUnit2Artifact _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_bindingAndBlackFFB(
			CompilationUnit2Artifact _this) {
		Object[] result_pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_binding = pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_black = pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "CompilationUnit2Artifact";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("jm");
		EObject _localVariable_1 = match.getObject("compilationUnit");
		EObject tmpJm = _localVariable_0;
		EObject tmpCompilationUnit = _localVariable_1;
		if (tmpJm instanceof Model) {
			Model jm = (Model) tmpJm;
			if (tmpCompilationUnit instanceof CompilationUnit) {
				CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
				return new Object[] { jm, compilationUnit, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CompilationUnit2Artifact_2_2_corematch_blackBBFFB(Model jm,
			CompilationUnit compilationUnit, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (JavaModel2UMLPackage jm2um : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jm,
				JavaModel2UMLPackage.class, "source")) {
			org.eclipse.uml2.uml.Package tmpUm = jm2um.getTarget();
			if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
				org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
				String um_name = um.getName();
				if (um_name.equals("source references")) {
					_result.add(new Object[] { jm, compilationUnit, jm2um, um, match });
				}

			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_CompilationUnit2Artifact_2_3_findcontext_blackBBBB(Model jm,
			CompilationUnit compilationUnit, JavaModel2UMLPackage jm2um, org.eclipse.uml2.uml.Model um) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jm.getCompilationUnits().contains(compilationUnit)) {
			if (jm.equals(jm2um.getSource())) {
				if (um.equals(jm2um.getTarget())) {
					String um_name = um.getName();
					if (um_name.equals("source references")) {
						_result.add(new Object[] { jm, compilationUnit, jm2um, um });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_3_findcontext_greenBBBBFFFF(Model jm,
			CompilationUnit compilationUnit, JavaModel2UMLPackage jm2um, org.eclipse.uml2.uml.Model um) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge jm__compilationUnit____compilationUnits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um__jm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um__um____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String jm__compilationUnit____compilationUnits_name_prime = "compilationUnits";
		String jm2um__jm____source_name_prime = "source";
		String jm2um__um____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(jm);
		isApplicableMatch.getAllContextElements().add(compilationUnit);
		isApplicableMatch.getAllContextElements().add(jm2um);
		isApplicableMatch.getAllContextElements().add(um);
		jm__compilationUnit____compilationUnits.setSrc(jm);
		jm__compilationUnit____compilationUnits.setTrg(compilationUnit);
		isApplicableMatch.getAllContextElements().add(jm__compilationUnit____compilationUnits);
		jm2um__jm____source.setSrc(jm2um);
		jm2um__jm____source.setTrg(jm);
		isApplicableMatch.getAllContextElements().add(jm2um__jm____source);
		jm2um__um____target.setSrc(jm2um);
		jm2um__um____target.setTrg(um);
		isApplicableMatch.getAllContextElements().add(jm2um__um____target);
		jm__compilationUnit____compilationUnits.setName(jm__compilationUnit____compilationUnits_name_prime);
		jm2um__jm____source.setName(jm2um__jm____source_name_prime);
		jm2um__um____target.setName(jm2um__um____target_name_prime);
		return new Object[] { jm, compilationUnit, jm2um, um, isApplicableMatch,
				jm__compilationUnit____compilationUnits, jm2um__jm____source, jm2um__um____target };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_4_solveCSP_bindingFBBBBBB(
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, Model jm,
			CompilationUnit compilationUnit, JavaModel2UMLPackage jm2um, org.eclipse.uml2.uml.Model um) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, jm, compilationUnit, jm2um, um);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jm, compilationUnit, jm2um, um };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_4_solveCSP_bindingAndBlackFBBBBBB(
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, Model jm,
			CompilationUnit compilationUnit, JavaModel2UMLPackage jm2um, org.eclipse.uml2.uml.Model um) {
		Object[] result_pattern_CompilationUnit2Artifact_2_4_solveCSP_binding = pattern_CompilationUnit2Artifact_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, jm, compilationUnit, jm2um, um);
		if (result_pattern_CompilationUnit2Artifact_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnit2Artifact_2_4_solveCSP_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_2_4_solveCSP_black = pattern_CompilationUnit2Artifact_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnit2Artifact_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jm, compilationUnit, jm2um, um };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit2Artifact_2_5_checkCSP_expressionFBB(
			CompilationUnit2Artifact _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "CompilationUnit2Artifact";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_CompilationUnit2Artifact_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_10_1_initialbindings_blackBBBB(
			CompilationUnit2Artifact _this, Match match, Artifact artifact, org.eclipse.uml2.uml.Model um) {
		return new Object[] { _this, match, artifact, um };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_10_2_SolveCSP_bindingFBBBB(
			CompilationUnit2Artifact _this, Match match, Artifact artifact, org.eclipse.uml2.uml.Model um) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, artifact, um);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, artifact, um };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_10_2_SolveCSP_bindingAndBlackFBBBB(
			CompilationUnit2Artifact _this, Match match, Artifact artifact, org.eclipse.uml2.uml.Model um) {
		Object[] result_pattern_CompilationUnit2Artifact_10_2_SolveCSP_binding = pattern_CompilationUnit2Artifact_10_2_SolveCSP_bindingFBBBB(
				_this, match, artifact, um);
		if (result_pattern_CompilationUnit2Artifact_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnit2Artifact_10_2_SolveCSP_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_10_2_SolveCSP_black = pattern_CompilationUnit2Artifact_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnit2Artifact_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, artifact, um };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit2Artifact_10_3_CheckCSP_expressionFBB(
			CompilationUnit2Artifact _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_10_4_collectelementstobetranslated_blackBBB(
			Match match, Artifact artifact, org.eclipse.uml2.uml.Model um) {
		return new Object[] { match, artifact, um };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_10_4_collectelementstobetranslated_greenBBBF(
			Match match, Artifact artifact, org.eclipse.uml2.uml.Model um) {
		EMoflonEdge um__artifact____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(artifact);
		String um__artifact____packagedElement_name_prime = "packagedElement";
		um__artifact____packagedElement.setSrc(um);
		um__artifact____packagedElement.setTrg(artifact);
		match.getToBeTranslatedEdges().add(um__artifact____packagedElement);
		um__artifact____packagedElement.setName(um__artifact____packagedElement_name_prime);
		return new Object[] { match, artifact, um, um__artifact____packagedElement };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_10_5_collectcontextelements_blackBBB(Match match,
			Artifact artifact, org.eclipse.uml2.uml.Model um) {
		return new Object[] { match, artifact, um };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_10_5_collectcontextelements_greenBB(Match match,
			org.eclipse.uml2.uml.Model um) {
		match.getContextNodes().add(um);
		return new Object[] { match, um };
	}

	public static final void pattern_CompilationUnit2Artifact_10_6_registerobjectstomatch_expressionBBBB(
			CompilationUnit2Artifact _this, Match match, Artifact artifact, org.eclipse.uml2.uml.Model um) {
		_this.registerObjectsToMatch_BWD(match, artifact, um);

	}

	public static final boolean pattern_CompilationUnit2Artifact_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_CompilationUnit2Artifact_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jm");
		EObject _localVariable_1 = isApplicableMatch.getObject("jm2um");
		EObject _localVariable_2 = isApplicableMatch.getObject("artifact");
		EObject _localVariable_3 = isApplicableMatch.getObject("um");
		EObject tmpJm = _localVariable_0;
		EObject tmpJm2um = _localVariable_1;
		EObject tmpArtifact = _localVariable_2;
		EObject tmpUm = _localVariable_3;
		if (tmpJm instanceof Model) {
			Model jm = (Model) tmpJm;
			if (tmpJm2um instanceof JavaModel2UMLPackage) {
				JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) tmpJm2um;
				if (tmpArtifact instanceof Artifact) {
					Artifact artifact = (Artifact) tmpArtifact;
					if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
						org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
						return new Object[] { jm, jm2um, artifact, um, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_11_1_performtransformation_blackBBBBFBB(Model jm,
			JavaModel2UMLPackage jm2um, Artifact artifact, org.eclipse.uml2.uml.Model um,
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jm, jm2um, artifact, um, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_11_1_performtransformation_bindingAndBlackFFFFFBB(
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_CompilationUnit2Artifact_11_1_performtransformation_binding = pattern_CompilationUnit2Artifact_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_CompilationUnit2Artifact_11_1_performtransformation_binding != null) {
			Model jm = (Model) result_pattern_CompilationUnit2Artifact_11_1_performtransformation_binding[0];
			JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result_pattern_CompilationUnit2Artifact_11_1_performtransformation_binding[1];
			Artifact artifact = (Artifact) result_pattern_CompilationUnit2Artifact_11_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result_pattern_CompilationUnit2Artifact_11_1_performtransformation_binding[3];

			Object[] result_pattern_CompilationUnit2Artifact_11_1_performtransformation_black = pattern_CompilationUnit2Artifact_11_1_performtransformation_blackBBBBFBB(
					jm, jm2um, artifact, um, _this, isApplicableMatch);
			if (result_pattern_CompilationUnit2Artifact_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_CompilationUnit2Artifact_11_1_performtransformation_black[4];

				return new Object[] { jm, jm2um, artifact, um, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_11_1_performtransformation_greenBFFBB(Model jm,
			Artifact artifact, CSP csp) {
		org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a = UmlFactory.eINSTANCE
				.createCompilationUnit2Artifact();
		CompilationUnit compilationUnit = JavaFactory.eINSTANCE.createCompilationUnit();
		Object _localVariable_0 = csp.getValue("compilationUnit", "name");
		Object _localVariable_1 = csp.getValue("compilationUnit", "originalFilePath");
		c2a.setTarget(artifact);
		jm.getCompilationUnits().add(compilationUnit);
		c2a.setSource(compilationUnit);
		String compilationUnit_name_prime = (String) _localVariable_0;
		String compilationUnit_originalFilePath_prime = (String) _localVariable_1;
		compilationUnit.setName(compilationUnit_name_prime);
		compilationUnit.setOriginalFilePath(compilationUnit_originalFilePath_prime);
		return new Object[] { jm, c2a, compilationUnit, artifact, csp };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_11_2_collecttranslatedelements_blackBBB(
			org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a, CompilationUnit compilationUnit,
			Artifact artifact) {
		return new Object[] { c2a, compilationUnit, artifact };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_11_2_collecttranslatedelements_greenFBBB(
			org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a, CompilationUnit compilationUnit,
			Artifact artifact) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(c2a);
		ruleresult.getCreatedElements().add(compilationUnit);
		ruleresult.getTranslatedElements().add(artifact);
		return new Object[] { ruleresult, c2a, compilationUnit, artifact };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject jm, EObject c2a, EObject compilationUnit, EObject jm2um,
			EObject artifact, EObject um) {
		if (!jm.equals(jm2um)) {
			if (!jm.equals(um)) {
				if (!c2a.equals(jm)) {
					if (!c2a.equals(compilationUnit)) {
						if (!c2a.equals(jm2um)) {
							if (!c2a.equals(um)) {
								if (!compilationUnit.equals(jm)) {
									if (!compilationUnit.equals(jm2um)) {
										if (!compilationUnit.equals(um)) {
											if (!jm2um.equals(um)) {
												if (!artifact.equals(jm)) {
													if (!artifact.equals(c2a)) {
														if (!artifact.equals(compilationUnit)) {
															if (!artifact.equals(jm2um)) {
																if (!artifact.equals(um)) {
																	return new Object[] { ruleresult, jm, c2a,
																			compilationUnit, jm2um, artifact, um };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_CompilationUnit2Artifact_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject jm, EObject c2a, EObject compilationUnit, EObject artifact,
			EObject um) {
		EMoflonEdge jm__compilationUnit____compilationUnits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2a__artifact____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2a__compilationUnit____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge um__artifact____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "CompilationUnit2Artifact";
		String jm__compilationUnit____compilationUnits_name_prime = "compilationUnits";
		String c2a__artifact____target_name_prime = "target";
		String c2a__compilationUnit____source_name_prime = "source";
		String um__artifact____packagedElement_name_prime = "packagedElement";
		jm__compilationUnit____compilationUnits.setSrc(jm);
		jm__compilationUnit____compilationUnits.setTrg(compilationUnit);
		ruleresult.getCreatedEdges().add(jm__compilationUnit____compilationUnits);
		c2a__artifact____target.setSrc(c2a);
		c2a__artifact____target.setTrg(artifact);
		ruleresult.getCreatedEdges().add(c2a__artifact____target);
		c2a__compilationUnit____source.setSrc(c2a);
		c2a__compilationUnit____source.setTrg(compilationUnit);
		ruleresult.getCreatedEdges().add(c2a__compilationUnit____source);
		um__artifact____packagedElement.setSrc(um);
		um__artifact____packagedElement.setTrg(artifact);
		ruleresult.getTranslatedEdges().add(um__artifact____packagedElement);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jm__compilationUnit____compilationUnits.setName(jm__compilationUnit____compilationUnits_name_prime);
		c2a__artifact____target.setName(c2a__artifact____target_name_prime);
		c2a__compilationUnit____source.setName(c2a__compilationUnit____source_name_prime);
		um__artifact____packagedElement.setName(um__artifact____packagedElement_name_prime);
		return new Object[] { ruleresult, jm, c2a, compilationUnit, artifact, um,
				jm__compilationUnit____compilationUnits, c2a__artifact____target, c2a__compilationUnit____source,
				um__artifact____packagedElement };
	}

	public static final void pattern_CompilationUnit2Artifact_11_5_registerobjects_expressionBBBBBBBB(
			CompilationUnit2Artifact _this, PerformRuleResult ruleresult, EObject jm, EObject c2a,
			EObject compilationUnit, EObject jm2um, EObject artifact, EObject um) {
		_this.registerObjects_BWD(ruleresult, jm, c2a, compilationUnit, jm2um, artifact, um);

	}

	public static final PerformRuleResult pattern_CompilationUnit2Artifact_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_bindingFB(
			CompilationUnit2Artifact _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_blackFBB(EClass eClass,
			CompilationUnit2Artifact _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_bindingAndBlackFFB(
			CompilationUnit2Artifact _this) {
		Object[] result_pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_binding = pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_black = pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "CompilationUnit2Artifact";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("artifact");
		EObject _localVariable_1 = match.getObject("um");
		EObject tmpArtifact = _localVariable_0;
		EObject tmpUm = _localVariable_1;
		if (tmpArtifact instanceof Artifact) {
			Artifact artifact = (Artifact) tmpArtifact;
			if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
				org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
				return new Object[] { artifact, um, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CompilationUnit2Artifact_12_2_corematch_blackFFBBB(Artifact artifact,
			org.eclipse.uml2.uml.Model um, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		String um_name = um.getName();
		if (um_name.equals("source references")) {
			for (JavaModel2UMLPackage jm2um : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(um,
					JavaModel2UMLPackage.class, "target")) {
				Model jm = jm2um.getSource();
				if (jm != null) {
					_result.add(new Object[] { jm, jm2um, artifact, um, match });
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_CompilationUnit2Artifact_12_3_findcontext_blackBBBB(Model jm,
			JavaModel2UMLPackage jm2um, Artifact artifact, org.eclipse.uml2.uml.Model um) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jm.equals(jm2um.getSource())) {
			if (um.equals(jm2um.getTarget())) {
				if (um.getPackagedElements().contains(artifact)) {
					String um_name = um.getName();
					if (um_name.equals("source references")) {
						_result.add(new Object[] { jm, jm2um, artifact, um });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_3_findcontext_greenBBBBFFFF(Model jm,
			JavaModel2UMLPackage jm2um, Artifact artifact, org.eclipse.uml2.uml.Model um) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge jm2um__jm____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um__um____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge um__artifact____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String jm2um__jm____source_name_prime = "source";
		String jm2um__um____target_name_prime = "target";
		String um__artifact____packagedElement_name_prime = "packagedElement";
		isApplicableMatch.getAllContextElements().add(jm);
		isApplicableMatch.getAllContextElements().add(jm2um);
		isApplicableMatch.getAllContextElements().add(artifact);
		isApplicableMatch.getAllContextElements().add(um);
		jm2um__jm____source.setSrc(jm2um);
		jm2um__jm____source.setTrg(jm);
		isApplicableMatch.getAllContextElements().add(jm2um__jm____source);
		jm2um__um____target.setSrc(jm2um);
		jm2um__um____target.setTrg(um);
		isApplicableMatch.getAllContextElements().add(jm2um__um____target);
		um__artifact____packagedElement.setSrc(um);
		um__artifact____packagedElement.setTrg(artifact);
		isApplicableMatch.getAllContextElements().add(um__artifact____packagedElement);
		jm2um__jm____source.setName(jm2um__jm____source_name_prime);
		jm2um__um____target.setName(jm2um__um____target_name_prime);
		um__artifact____packagedElement.setName(um__artifact____packagedElement_name_prime);
		return new Object[] { jm, jm2um, artifact, um, isApplicableMatch, jm2um__jm____source, jm2um__um____target,
				um__artifact____packagedElement };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_4_solveCSP_bindingFBBBBBB(
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, Model jm, JavaModel2UMLPackage jm2um,
			Artifact artifact, org.eclipse.uml2.uml.Model um) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, jm, jm2um, artifact, um);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jm, jm2um, artifact, um };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_4_solveCSP_bindingAndBlackFBBBBBB(
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, Model jm, JavaModel2UMLPackage jm2um,
			Artifact artifact, org.eclipse.uml2.uml.Model um) {
		Object[] result_pattern_CompilationUnit2Artifact_12_4_solveCSP_binding = pattern_CompilationUnit2Artifact_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, jm, jm2um, artifact, um);
		if (result_pattern_CompilationUnit2Artifact_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnit2Artifact_12_4_solveCSP_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_12_4_solveCSP_black = pattern_CompilationUnit2Artifact_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnit2Artifact_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jm, jm2um, artifact, um };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit2Artifact_12_5_checkCSP_expressionFBB(
			CompilationUnit2Artifact _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "CompilationUnit2Artifact";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_CompilationUnit2Artifact_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_bindingFB(
			CompilationUnit2Artifact _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			CompilationUnit2Artifact _this) {
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

	public static final Object[] pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_bindingAndBlackFFBF(
			CompilationUnit2Artifact _this) {
		Object[] result_pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_binding = pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_black = pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_CompilationUnit2Artifact_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_packagedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUm = _edge_packagedElement.getSrc();
		if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
			EObject tmpArtifact = _edge_packagedElement.getTrg();
			if (tmpArtifact instanceof Artifact) {
				Artifact artifact = (Artifact) tmpArtifact;
				if (um.getPackagedElements().contains(artifact)) {
					String um_name = um.getName();
					if (um_name.equals("source references")) {
						_result.add(new Object[] { artifact, um, _edge_packagedElement });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CompilationUnit2Artifact_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			CompilationUnit2Artifact _this, Match match, Artifact artifact, org.eclipse.uml2.uml.Model um) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, artifact, um);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CompilationUnit2Artifact_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			CompilationUnit2Artifact _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_CompilationUnit2Artifact_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_bindingFB(
			CompilationUnit2Artifact _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			CompilationUnit2Artifact _this) {
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

	public static final Object[] pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_bindingAndBlackFFBF(
			CompilationUnit2Artifact _this) {
		Object[] result_pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_binding = pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_black = pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_CompilationUnit2Artifact_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_compilationUnits) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJm = _edge_compilationUnits.getSrc();
		if (tmpJm instanceof Model) {
			Model jm = (Model) tmpJm;
			EObject tmpCompilationUnit = _edge_compilationUnits.getTrg();
			if (tmpCompilationUnit instanceof CompilationUnit) {
				CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
				if (jm.getCompilationUnits().contains(compilationUnit)) {
					_result.add(new Object[] { jm, compilationUnit, _edge_compilationUnits });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_CompilationUnit2Artifact_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			CompilationUnit2Artifact _this, Match match, Model jm, CompilationUnit compilationUnit) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jm, compilationUnit);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_CompilationUnit2Artifact_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			CompilationUnit2Artifact _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_CompilationUnit2Artifact_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_1_prepare_blackB(CompilationUnit2Artifact _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("jm");
		EObject _localVariable_1 = sourceMatch.getObject("compilationUnit");
		EObject _localVariable_2 = targetMatch.getObject("artifact");
		EObject _localVariable_3 = targetMatch.getObject("um");
		EObject tmpJm = _localVariable_0;
		EObject tmpCompilationUnit = _localVariable_1;
		EObject tmpArtifact = _localVariable_2;
		EObject tmpUm = _localVariable_3;
		if (tmpJm instanceof Model) {
			Model jm = (Model) tmpJm;
			if (tmpCompilationUnit instanceof CompilationUnit) {
				CompilationUnit compilationUnit = (CompilationUnit) tmpCompilationUnit;
				if (tmpArtifact instanceof Artifact) {
					Artifact artifact = (Artifact) tmpArtifact;
					if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
						org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
						return new Object[] { jm, compilationUnit, artifact, um, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_blackBBBBBB(Model jm,
			CompilationUnit compilationUnit, Artifact artifact, org.eclipse.uml2.uml.Model um, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			String um_name = um.getName();
			if (um_name.equals("source references")) {
				return new Object[] { jm, compilationUnit, artifact, um, sourceMatch, targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding = pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding != null) {
			Model jm = (Model) result_pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[0];
			CompilationUnit compilationUnit = (CompilationUnit) result_pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[1];
			Artifact artifact = (Artifact) result_pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) result_pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_black = pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_blackBBBBBB(
					jm, compilationUnit, artifact, um, sourceMatch, targetMatch);
			if (result_pattern_CompilationUnit2Artifact_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { jm, compilationUnit, artifact, um, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_3_solvecsp_bindingFBBBBBBB(
			CompilationUnit2Artifact _this, Model jm, CompilationUnit compilationUnit, Artifact artifact,
			org.eclipse.uml2.uml.Model um, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(jm, compilationUnit, artifact, um, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, jm, compilationUnit, artifact, um, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			CompilationUnit2Artifact _this, Model jm, CompilationUnit compilationUnit, Artifact artifact,
			org.eclipse.uml2.uml.Model um, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_CompilationUnit2Artifact_24_3_solvecsp_binding = pattern_CompilationUnit2Artifact_24_3_solvecsp_bindingFBBBBBBB(
				_this, jm, compilationUnit, artifact, um, sourceMatch, targetMatch);
		if (result_pattern_CompilationUnit2Artifact_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnit2Artifact_24_3_solvecsp_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_24_3_solvecsp_black = pattern_CompilationUnit2Artifact_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_CompilationUnit2Artifact_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, jm, compilationUnit, artifact, um, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit2Artifact_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_CompilationUnit2Artifact_24_5_matchcorrcontext_blackBFBBB(Model jm,
			org.eclipse.uml2.uml.Model um, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			String um_name = um.getName();
			if (um_name.equals("source references")) {
				for (JavaModel2UMLPackage jm2um : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jm,
						JavaModel2UMLPackage.class, "source")) {
					if (um.equals(jm2um.getTarget())) {
						_result.add(new Object[] { jm, jm2um, um, sourceMatch, targetMatch });
					}
				}
			}

		}
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_5_matchcorrcontext_greenBBBF(
			JavaModel2UMLPackage jm2um, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "CompilationUnit2Artifact";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(jm2um);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { jm2um, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_6_createcorrespondence_blackBBBBB(Model jm,
			CompilationUnit compilationUnit, Artifact artifact, org.eclipse.uml2.uml.Model um, CCMatch ccMatch) {
		return new Object[] { jm, compilationUnit, artifact, um, ccMatch };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_6_createcorrespondence_greenFBBB(
			CompilationUnit compilationUnit, Artifact artifact, CCMatch ccMatch) {
		org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a = UmlFactory.eINSTANCE
				.createCompilationUnit2Artifact();
		c2a.setTarget(artifact);
		c2a.setSource(compilationUnit);
		ccMatch.getCreateCorr().add(c2a);
		return new Object[] { c2a, compilationUnit, artifact, ccMatch };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "CompilationUnit2Artifact";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_CompilationUnit2Artifact_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_27_1_matchtggpattern_blackBB(Model jm,
			CompilationUnit compilationUnit) {
		if (jm.getCompilationUnits().contains(compilationUnit)) {
			return new Object[] { jm, compilationUnit };
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit2Artifact_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_CompilationUnit2Artifact_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_28_1_matchtggpattern_blackBB(Artifact artifact,
			org.eclipse.uml2.uml.Model um) {
		if (um.getPackagedElements().contains(artifact)) {
			String um_name = um.getName();
			if (um_name.equals("source references")) {
				return new Object[] { artifact, um };
			}

		}
		return null;
	}

	public static final boolean pattern_CompilationUnit2Artifact_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_CompilationUnit2Artifact_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_1_createresult_blackB(
			CompilationUnit2Artifact _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Model jm) {
		if (ruleResult.getSourceObjects().contains(jm)) {
			return new Object[] { ruleResult, jm };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, JavaModel2UMLPackage jm2um) {
		if (ruleResult.getCorrObjects().contains(jm2um)) {
			return new Object[] { ruleResult, jm2um };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Model um) {
		if (ruleResult.getTargetObjects().contains(um)) {
			return new Object[] { ruleResult, um };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_CompilationUnit2Artifact_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList jm2umList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpJm2um : jm2umList.getEntryObjects()) {
				if (tmpJm2um instanceof JavaModel2UMLPackage) {
					JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) tmpJm2um;
					Model jm = jm2um.getSource();
					if (jm != null) {
						org.eclipse.uml2.uml.Package tmpUm = jm2um.getTarget();
						if (tmpUm instanceof org.eclipse.uml2.uml.Model) {
							org.eclipse.uml2.uml.Model um = (org.eclipse.uml2.uml.Model) tmpUm;
							String um_name = um.getName();
							if (um_name.equals("source references")) {
								if (pattern_CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										jm2um) == null) {
									if (pattern_CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											jm) == null) {
										if (pattern_CompilationUnit2Artifact_29_2_isapplicablecore_black_nac_2BB(
												ruleResult, um) == null) {
											_result.add(new Object[] { jm2umList, jm, jm2um, um, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_3_solveCSP_bindingFBBBBBB(
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, Model jm, JavaModel2UMLPackage jm2um,
			org.eclipse.uml2.uml.Model um, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, jm, jm2um, um, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jm, jm2um, um, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_3_solveCSP_bindingAndBlackFBBBBBB(
			CompilationUnit2Artifact _this, IsApplicableMatch isApplicableMatch, Model jm, JavaModel2UMLPackage jm2um,
			org.eclipse.uml2.uml.Model um, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_CompilationUnit2Artifact_29_3_solveCSP_binding = pattern_CompilationUnit2Artifact_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, jm, jm2um, um, ruleResult);
		if (result_pattern_CompilationUnit2Artifact_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_CompilationUnit2Artifact_29_3_solveCSP_binding[0];

			Object[] result_pattern_CompilationUnit2Artifact_29_3_solveCSP_black = pattern_CompilationUnit2Artifact_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_CompilationUnit2Artifact_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jm, jm2um, um, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_CompilationUnit2Artifact_29_4_checkCSP_expressionFBB(
			CompilationUnit2Artifact _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_5_checknacs_blackBBB(Model jm,
			JavaModel2UMLPackage jm2um, org.eclipse.uml2.uml.Model um) {
		String um_name = um.getName();
		if (um_name.equals("source references")) {
			return new Object[] { jm, jm2um, um };
		}

		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_6_perform_blackBBBB(Model jm,
			JavaModel2UMLPackage jm2um, org.eclipse.uml2.uml.Model um, ModelgeneratorRuleResult ruleResult) {
		String um_name = um.getName();
		if (um_name.equals("source references")) {
			return new Object[] { jm, jm2um, um, ruleResult };
		}

		return null;
	}

	public static final Object[] pattern_CompilationUnit2Artifact_29_6_perform_greenBFFFBBB(Model jm,
			org.eclipse.uml2.uml.Model um, ModelgeneratorRuleResult ruleResult, CSP csp) {
		org.gravity.tgg.modisco.uml.CompilationUnit2Artifact c2a = UmlFactory.eINSTANCE
				.createCompilationUnit2Artifact();
		CompilationUnit compilationUnit = JavaFactory.eINSTANCE.createCompilationUnit();
		Artifact artifact = UMLFactory.eINSTANCE.createArtifact();
		Object _localVariable_0 = csp.getValue("compilationUnit", "name");
		Object _localVariable_1 = csp.getValue("compilationUnit", "originalFilePath");
		Object _localVariable_2 = csp.getValue("artifact", "name");
		Object _localVariable_3 = csp.getValue("artifact", "fileName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(c2a);
		jm.getCompilationUnits().add(compilationUnit);
		c2a.setSource(compilationUnit);
		ruleResult.getSourceObjects().add(compilationUnit);
		c2a.setTarget(artifact);
		um.getPackagedElements().add(artifact);
		ruleResult.getTargetObjects().add(artifact);
		String compilationUnit_name_prime = (String) _localVariable_0;
		String compilationUnit_originalFilePath_prime = (String) _localVariable_1;
		String artifact_name_prime = (String) _localVariable_2;
		String artifact_fileName_prime = (String) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		compilationUnit.setName(compilationUnit_name_prime);
		compilationUnit.setOriginalFilePath(compilationUnit_originalFilePath_prime);
		artifact.setName(artifact_name_prime);
		artifact.setFileName(artifact_fileName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { jm, c2a, compilationUnit, artifact, um, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_CompilationUnit2Artifact_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CompilationUnit2ArtifactImpl
