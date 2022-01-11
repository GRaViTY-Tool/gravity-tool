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
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MSignature;

import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.MSignatureToTSignature;

import org.gravity.tgg.modisco.pm.Rules.LinkDefinitionToType;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TSignature;

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
 * An implementation of the model object '<em><b>Link Definition To Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LinkDefinitionToTypeImpl extends AbstractRuleImpl implements LinkDefinitionToType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkDefinitionToTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLinkDefinitionToType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AbstractTypeDeclaration mType, MDefinition mDefinition,
			MSignature mSignature) {

		Object[] result1_black = LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_0_1_initialbindings_blackBBBBB(
				this, match, mType, mDefinition, mSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mType] = " + mType + ", " + "[mDefinition] = " + mDefinition
					+ ", " + "[mSignature] = " + mSignature + ".");
		}

		Object[] result2_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mType, mDefinition,
						mSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mType] = " + mType + ", " + "[mDefinition] = " + mDefinition
					+ ", " + "[mSignature] = " + mSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_0_4_collectelementstobetranslated_blackBBBB(match, mType, mDefinition,
							mSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mType] = " + mType + ", " + "[mDefinition] = " + mDefinition + ", " + "[mSignature] = "
						+ mSignature + ".");
			}
			LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_0_4_collectelementstobetranslated_greenBBBFF(match,
					mType, mDefinition);
			//nothing EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mDefinition__mType____abstractTypeDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_0_5_collectcontextelements_blackBBBB(match, mType, mDefinition,
							mSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mType] = " + mType + ", " + "[mDefinition] = " + mDefinition + ", " + "[mSignature] = "
						+ mSignature + ".");
			}
			LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_0_5_collectcontextelements_greenBBBBFF(match, mType,
					mDefinition, mSignature);
			//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result5_green[5];

			// 
			LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, mType, mDefinition, mSignature);
			return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_0_7_expressionF();
		} else {
			return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_bindingAndBlack[0];
		TSignature tSignature = (TSignature) result1_bindingAndBlack[1];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[2];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		TMember tDefinition = (TMember) result1_bindingAndBlack[5];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[6];
		MSignature mSignature = (MSignature) result1_bindingAndBlack[7];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_1_1_performtransformation_greenBBB(tSignature, tType,
				tDefinition);

		Object[] result2_green = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, mDefinitionToTMember,
						tSignature, tType, mTypeToTType, mType, tDefinition, mDefinition, mSignature,
						mSignatureToTSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[tSignature] = " + tSignature
					+ ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mType] = "
					+ mType + ", " + "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mSignature] = " + mSignature + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature
					+ ".");
		}
		LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				tSignature, tType, mType, tDefinition, mDefinition);
		//nothing EMoflonEdge tType__tDefinition____defines = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tDefinition__tType____definedBy = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tType__tSignature____signature = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mDefinition__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[10];

		// 
		// 
		LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition, mDefinition,
				mSignature, mSignatureToTSignature);
		return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_binding[0];
		MDefinition mDefinition = (MDefinition) result2_binding[1];
		MSignature mSignature = (MSignature) result2_binding[2];
		for (Object[] result2_black : LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_2_2_corematch_blackFFFFBFBBFB(mType, mDefinition, mSignature, match)) {
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[0];
			TSignature tSignature = (TSignature) result2_black[1];
			TAbstractType tType = (TAbstractType) result2_black[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[3];
			TMember tDefinition = (TMember) result2_black[5];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[8];
			// ForEach 
			for (Object[] result3_black : LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_2_3_findcontext_blackBBBBBBBBB(mDefinitionToTMember, tSignature,
							tType, mTypeToTType, mType, tDefinition, mDefinition, mSignature, mSignatureToTSignature)) {
				Object[] result3_green = LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFF(mDefinitionToTMember,
								tSignature, tType, mTypeToTType, mType, tDefinition, mDefinition, mSignature,
								mSignatureToTSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mDefinition__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[21];

				Object[] result4_bindingAndBlack = LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch,
								mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition, mDefinition,
								mSignature, mSignatureToTSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mDefinitionToTMember] = "
							+ mDefinitionToTMember + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType
							+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mType] = " + mType + ", "
							+ "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[mSignature] = " + mSignature + ", " + "[mSignatureToTSignature] = "
							+ mSignatureToTSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = LinkDefinitionToTypeImpl
							.pattern_LinkDefinitionToType_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AbstractTypeDeclaration mType, MDefinition mDefinition,
			MSignature mSignature) {
		match.registerObject("mType", mType);
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AbstractTypeDeclaration mType, MDefinition mDefinition,
			MSignature mSignature) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature, TAbstractType tType, TypeToTAbstractType mTypeToTType, AbstractTypeDeclaration mType,
			TMember tDefinition, MDefinition mDefinition, MSignature mSignature,
			MSignatureToTSignature mSignatureToTSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mDefinitionToTMember, EObject tSignature,
			EObject tType, EObject mTypeToTType, EObject mType, EObject tDefinition, EObject mDefinition,
			EObject mSignature, EObject mSignatureToTSignature) {
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);

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
	public boolean isAppropriate_BWD(Match match, TSignature tSignature, TAbstractType tType, TMember tDefinition) {

		Object[] result1_black = LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_10_1_initialbindings_blackBBBBB(
				this, match, tSignature, tType, tDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", "
					+ "[tDefinition] = " + tDefinition + ".");
		}

		Object[] result2_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tSignature, tType,
						tDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", "
					+ "[tDefinition] = " + tDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_10_4_collectelementstobetranslated_blackBBBB(match, tSignature, tType,
							tDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", " + "[tDefinition] = "
						+ tDefinition + ".");
			}
			LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_10_4_collectelementstobetranslated_greenBBBBFFF(match,
					tSignature, tType, tDefinition);
			//nothing EMoflonEdge tType__tDefinition____defines = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tDefinition__tType____definedBy = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tType__tSignature____signature = (EMoflonEdge) result4_green[6];

			Object[] result5_black = LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_10_5_collectcontextelements_blackBBBB(match, tSignature, tType,
							tDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", " + "[tDefinition] = "
						+ tDefinition + ".");
			}
			LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_10_5_collectcontextelements_greenBBBBFF(match,
					tSignature, tType, tDefinition);
			//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result5_green[5];

			// 
			LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_10_6_registerobjectstomatch_expressionBBBBB(this,
					match, tSignature, tType, tDefinition);
			return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_10_7_expressionF();
		} else {
			return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_bindingAndBlack[0];
		TSignature tSignature = (TSignature) result1_bindingAndBlack[1];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[2];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		TMember tDefinition = (TMember) result1_bindingAndBlack[5];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[6];
		MSignature mSignature = (MSignature) result1_bindingAndBlack[7];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_11_1_performtransformation_greenBB(mType, mDefinition);

		Object[] result2_green = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, mDefinitionToTMember,
						tSignature, tType, mTypeToTType, mType, tDefinition, mDefinition, mSignature,
						mSignatureToTSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[tSignature] = " + tSignature
					+ ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mType] = "
					+ mType + ", " + "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mSignature] = " + mSignature + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature
					+ ".");
		}
		LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				tSignature, tType, mType, tDefinition, mDefinition);
		//nothing EMoflonEdge tType__tDefinition____defines = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tDefinition__tType____definedBy = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tType__tSignature____signature = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mDefinition__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[10];

		// 
		// 
		LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition, mDefinition,
				mSignature, mSignatureToTSignature);
		return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TSignature tSignature = (TSignature) result2_binding[0];
		TAbstractType tType = (TAbstractType) result2_binding[1];
		TMember tDefinition = (TMember) result2_binding[2];
		for (Object[] result2_black : LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_12_2_corematch_blackFBBFFBFFFB(tSignature, tType, tDefinition, match)) {
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[3];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[4];
			MDefinition mDefinition = (MDefinition) result2_black[6];
			MSignature mSignature = (MSignature) result2_black[7];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[8];
			// ForEach 
			for (Object[] result3_black : LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_12_3_findcontext_blackBBBBBBBBB(mDefinitionToTMember, tSignature,
							tType, mTypeToTType, mType, tDefinition, mDefinition, mSignature, mSignatureToTSignature)) {
				Object[] result3_green = LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFFF(
								mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition, mDefinition,
								mSignature, mSignatureToTSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge tType__tDefinition____defines = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tDefinition__tType____definedBy = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tType__tSignature____signature = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[22];

				Object[] result4_bindingAndBlack = LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch,
								mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition, mDefinition,
								mSignature, mSignatureToTSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mDefinitionToTMember] = "
							+ mDefinitionToTMember + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType
							+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mType] = " + mType + ", "
							+ "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[mSignature] = " + mSignature + ", " + "[mSignatureToTSignature] = "
							+ mSignatureToTSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = LinkDefinitionToTypeImpl
							.pattern_LinkDefinitionToType_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TSignature tSignature, TAbstractType tType,
			TMember tDefinition) {
		match.registerObject("tSignature", tSignature);
		match.registerObject("tType", tType);
		match.registerObject("tDefinition", tDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TSignature tSignature, TAbstractType tType,
			TMember tDefinition) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature, TAbstractType tType, TypeToTAbstractType mTypeToTType, AbstractTypeDeclaration mType,
			TMember tDefinition, MDefinition mDefinition, MSignature mSignature,
			MSignatureToTSignature mSignatureToTSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mDefinitionToTMember, EObject tSignature,
			EObject tType, EObject mTypeToTType, EObject mType, EObject tDefinition, EObject mDefinition,
			EObject mSignature, EObject mSignatureToTSignature) {
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_51(EMoflonEdge _edge_defines) {

		Object[] result1_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_20_2_testcorematchandDECs_blackFFFB(_edge_defines)) {
			TSignature tSignature = (TSignature) result2_black[0];
			TAbstractType tType = (TAbstractType) result2_black[1];
			TMember tDefinition = (TMember) result2_black[2];
			Object[] result2_green = LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tSignature, tType, tDefinition)) {
				// 
				if (LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = LinkDefinitionToTypeImpl
							.pattern_LinkDefinitionToType_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_53(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_21_2_testcorematchandDECs_blackFFFB(_edge_bodyDeclarations)) {
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[0];
			MDefinition mDefinition = (MDefinition) result2_black[1];
			MSignature mSignature = (MSignature) result2_black[2];
			Object[] result2_green = LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, mType, mDefinition, mSignature)) {
				// 
				if (LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = LinkDefinitionToTypeImpl
							.pattern_LinkDefinitionToType_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("LinkDefinitionToType");
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
		ruleResult.setRule("LinkDefinitionToType");
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

		Object[] result1_black = LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TSignature tSignature = (TSignature) result2_bindingAndBlack[0];
		TAbstractType tType = (TAbstractType) result2_bindingAndBlack[1];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_bindingAndBlack[2];
		TMember tDefinition = (TMember) result2_bindingAndBlack[3];
		MDefinition mDefinition = (MDefinition) result2_bindingAndBlack[4];
		MSignature mSignature = (MSignature) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tSignature, tType, mType,
						tDefinition, mDefinition, mSignature, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", " + "[mType] = " + mType + ", "
					+ "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mSignature] = " + mSignature + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_24_5_matchcorrcontext_blackFBBFBBBBFBB(tSignature, tType, mType,
							tDefinition, mDefinition, mSignature, sourceMatch, targetMatch)) {
				MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result5_black[0];
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[3];
				MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result5_black[8];
				Object[] result5_green = LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_24_5_matchcorrcontext_greenBBBBBF(mDefinitionToTMember,
								mTypeToTType, mSignatureToTSignature, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[5];

				Object[] result6_black = LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_24_6_createcorrespondence_blackBBBBBBB(tSignature, tType, mType,
								tDefinition, mDefinition, mSignature, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = "
							+ tSignature + ", " + "[tType] = " + tType + ", " + "[mType] = " + mType + ", "
							+ "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[mSignature] = " + mSignature + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TSignature tSignature, TAbstractType tType, AbstractTypeDeclaration mType,
			TMember tDefinition, MDefinition mDefinition, MSignature mSignature, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(AbstractTypeDeclaration mType, MDefinition mDefinition, MSignature mSignature) {// 
		Object[] result1_black = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_27_1_matchtggpattern_blackBBB(mType, mDefinition, mSignature);
		if (result1_black != null) {
			return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_27_2_expressionF();
		} else {
			return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TSignature tSignature, TAbstractType tType, TMember tDefinition) {// 
		Object[] result1_black = LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_28_1_matchtggpattern_blackBBB(tSignature, tType, tDefinition);
		if (result1_black != null) {
			return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_28_2_expressionF();
		} else {
			return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember mDefinitionToTMemberParameter, TypeToTAbstractType mTypeToTTypeParameter) {

		Object[] result1_black = LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : LinkDefinitionToTypeImpl
				.pattern_LinkDefinitionToType_29_2_isapplicablecore_blackFFFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mDefinitionToTMemberList = (RuleEntryList) result2_black[0];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[1];
			MDefinition mDefinition = (MDefinition) result2_black[2];
			MSignature mSignature = (MSignature) result2_black[3];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[4];
			TSignature tSignature = (TSignature) result2_black[5];
			TMember tDefinition = (TMember) result2_black[6];
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[7];
			TAbstractType tType = (TAbstractType) result2_black[8];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[9];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[10];

			Object[] result3_bindingAndBlack = LinkDefinitionToTypeImpl
					.pattern_LinkDefinitionToType_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
							mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition, mDefinition,
							mSignature, mSignatureToTSignature, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mDefinitionToTMember] = "
						+ mDefinitionToTMember + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType
						+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mType] = " + mType + ", "
						+ "[tDefinition] = " + tDefinition + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[mSignature] = " + mSignature + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = LinkDefinitionToTypeImpl
						.pattern_LinkDefinitionToType_29_5_checknacs_blackBBBBBBBBB(mDefinitionToTMember, tSignature,
								tType, mTypeToTType, mType, tDefinition, mDefinition, mSignature,
								mSignatureToTSignature);
				if (result5_black != null) {

					Object[] result6_black = LinkDefinitionToTypeImpl
							.pattern_LinkDefinitionToType_29_6_perform_blackBBBBBBBBBB(mDefinitionToTMember, tSignature,
									tType, mTypeToTType, mType, tDefinition, mDefinition, mSignature,
									mSignatureToTSignature, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[tSignature] = "
								+ tSignature + ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType
								+ ", " + "[mType] = " + mType + ", " + "[tDefinition] = " + tDefinition + ", "
								+ "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ", "
								+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_29_6_perform_greenBBBBBB(tSignature, tType,
							mType, tDefinition, mDefinition, ruleResult);

				} else {
				}

			} else {
			}

		}
		return LinkDefinitionToTypeImpl.pattern_LinkDefinitionToType_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			MDefinitionToTMember mDefinitionToTMember, TSignature tSignature, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, AbstractTypeDeclaration mType, TMember tDefinition,
			MDefinition mDefinition, MSignature mSignature, MSignatureToTSignature mSignatureToTSignature,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
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
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPROPRIATE_FWD__MATCH_ABSTRACTTYPEDECLARATION_MDEFINITION_MSIGNATURE:
			return isAppropriate_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2), (MSignature) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ABSTRACTTYPEDECLARATION_MDEFINITION_MSIGNATURE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2), (MSignature) arguments.get(3));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ABSTRACTTYPEDECLARATION_MDEFINITION_MSIGNATURE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2), (MSignature) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_TSIGNATURE_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TMEMBER_MDEFINITION_MSIGNATURE_MSIGNATURETOTSIGNATURE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (TSignature) arguments.get(2),
					(TAbstractType) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
					(AbstractTypeDeclaration) arguments.get(5), (TMember) arguments.get(6),
					(MDefinition) arguments.get(7), (MSignature) arguments.get(8),
					(MSignatureToTSignature) arguments.get(9));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPROPRIATE_BWD__MATCH_TSIGNATURE_TABSTRACTTYPE_TMEMBER:
			return isAppropriate_BWD((Match) arguments.get(0), (TSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TMember) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TSIGNATURE_TABSTRACTTYPE_TMEMBER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TMember) arguments.get(3));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TSIGNATURE_TABSTRACTTYPE_TMEMBER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TSignature) arguments.get(1),
					(TAbstractType) arguments.get(2), (TMember) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_TSIGNATURE_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TMEMBER_MDEFINITION_MSIGNATURE_MSIGNATURETOTSIGNATURE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (TSignature) arguments.get(2),
					(TAbstractType) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
					(AbstractTypeDeclaration) arguments.get(5), (TMember) arguments.get(6),
					(MDefinition) arguments.get(7), (MSignature) arguments.get(8),
					(MSignatureToTSignature) arguments.get(9));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_51__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_51((EMoflonEdge) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_53__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_53((EMoflonEdge) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__TSIGNATURE_TABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TMEMBER_MDEFINITION_MSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TSignature) arguments.get(0), (TAbstractType) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (TMember) arguments.get(3),
					(MDefinition) arguments.get(4), (MSignature) arguments.get(5), (Match) arguments.get(6),
					(Match) arguments.get(7));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___CHECK_DEC_FWD__ABSTRACTTYPEDECLARATION_MDEFINITION_MSIGNATURE:
			return checkDEC_FWD((AbstractTypeDeclaration) arguments.get(0), (MDefinition) arguments.get(1),
					(MSignature) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___CHECK_DEC_BWD__TSIGNATURE_TABSTRACTTYPE_TMEMBER:
			return checkDEC_BWD((TSignature) arguments.get(0), (TAbstractType) arguments.get(1),
					(TMember) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_TSIGNATURE_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TMEMBER_MDEFINITION_MSIGNATURE_MSIGNATURETOTSIGNATURE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (TSignature) arguments.get(2),
					(TAbstractType) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
					(AbstractTypeDeclaration) arguments.get(5), (TMember) arguments.get(6),
					(MDefinition) arguments.get(7), (MSignature) arguments.get(8),
					(MSignatureToTSignature) arguments.get(9), (ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.LINK_DEFINITION_TO_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_LinkDefinitionToType_0_1_initialbindings_blackBBBBB(LinkDefinitionToType _this,
			Match match, AbstractTypeDeclaration mType, MDefinition mDefinition, MSignature mSignature) {
		return new Object[] { _this, match, mType, mDefinition, mSignature };
	}

	public static final Object[] pattern_LinkDefinitionToType_0_2_SolveCSP_bindingFBBBBB(LinkDefinitionToType _this,
			Match match, AbstractTypeDeclaration mType, MDefinition mDefinition, MSignature mSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mType, mDefinition, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mType, mDefinition, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToType_0_2_SolveCSP_bindingAndBlackFBBBBB(
			LinkDefinitionToType _this, Match match, AbstractTypeDeclaration mType, MDefinition mDefinition,
			MSignature mSignature) {
		Object[] result_pattern_LinkDefinitionToType_0_2_SolveCSP_binding = pattern_LinkDefinitionToType_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mType, mDefinition, mSignature);
		if (result_pattern_LinkDefinitionToType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToType_0_2_SolveCSP_black = pattern_LinkDefinitionToType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mType, mDefinition, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToType_0_3_CheckCSP_expressionFBB(LinkDefinitionToType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_0_4_collectelementstobetranslated_blackBBBB(Match match,
			AbstractTypeDeclaration mType, MDefinition mDefinition, MSignature mSignature) {
		return new Object[] { match, mType, mDefinition, mSignature };
	}

	public static final Object[] pattern_LinkDefinitionToType_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			AbstractTypeDeclaration mType, MDefinition mDefinition) {
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		match.getToBeTranslatedEdges().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mType____abstractTypeDeclaration.setTrg(mType);
		match.getToBeTranslatedEdges().add(mDefinition__mType____abstractTypeDeclaration);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____abstractTypeDeclaration.setName(mDefinition__mType____abstractTypeDeclaration_name_prime);
		return new Object[] { match, mType, mDefinition, mType__mDefinition____bodyDeclarations,
				mDefinition__mType____abstractTypeDeclaration };
	}

	public static final Object[] pattern_LinkDefinitionToType_0_5_collectcontextelements_blackBBBB(Match match,
			AbstractTypeDeclaration mType, MDefinition mDefinition, MSignature mSignature) {
		return new Object[] { match, mType, mDefinition, mSignature };
	}

	public static final Object[] pattern_LinkDefinitionToType_0_5_collectcontextelements_greenBBBBFF(Match match,
			AbstractTypeDeclaration mType, MDefinition mDefinition, MSignature mSignature) {
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mType);
		match.getContextNodes().add(mDefinition);
		match.getContextNodes().add(mSignature);
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		match.getContextEdges().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		match.getContextEdges().add(mDefinition__mSignature____mSignature);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		return new Object[] { match, mType, mDefinition, mSignature, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature };
	}

	public static final void pattern_LinkDefinitionToType_0_6_registerobjectstomatch_expressionBBBBB(
			LinkDefinitionToType _this, Match match, AbstractTypeDeclaration mType, MDefinition mDefinition,
			MSignature mSignature) {
		_this.registerObjectsToMatch_FWD(match, mType, mDefinition, mSignature);

	}

	public static final boolean pattern_LinkDefinitionToType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToType_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_1_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mDefinitionToTMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("tType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_4 = isApplicableMatch.getObject("mType");
		EObject _localVariable_5 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_6 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_7 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_8 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject tmpMDefinitionToTMember = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpMTypeToTType = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		EObject tmpTDefinition = _localVariable_5;
		EObject tmpMDefinition = _localVariable_6;
		EObject tmpMSignature = _localVariable_7;
		EObject tmpMSignatureToTSignature = _localVariable_8;
		if (tmpMDefinitionToTMember instanceof MDefinitionToTMember) {
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) tmpMDefinitionToTMember;
			if (tmpTSignature instanceof TSignature) {
				TSignature tSignature = (TSignature) tmpTSignature;
				if (tmpTType instanceof TAbstractType) {
					TAbstractType tType = (TAbstractType) tmpTType;
					if (tmpMTypeToTType instanceof TypeToTAbstractType) {
						TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
						if (tmpMType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
							if (tmpTDefinition instanceof TMember) {
								TMember tDefinition = (TMember) tmpTDefinition;
								if (tmpMDefinition instanceof MDefinition) {
									MDefinition mDefinition = (MDefinition) tmpMDefinition;
									if (tmpMSignature instanceof MSignature) {
										MSignature mSignature = (MSignature) tmpMSignature;
										if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
											MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
											return new Object[] { mDefinitionToTMember, tSignature, tType, mTypeToTType,
													mType, tDefinition, mDefinition, mSignature, mSignatureToTSignature,
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
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_1_1_performtransformation_blackBBBBBBBBBFBB(
			MDefinitionToTMember mDefinitionToTMember, TSignature tSignature, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, AbstractTypeDeclaration mType, TMember tDefinition,
			MDefinition mDefinition, MSignature mSignature, MSignatureToTSignature mSignatureToTSignature,
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition,
						mDefinition, mSignature, mSignatureToTSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LinkDefinitionToType_1_1_performtransformation_binding = pattern_LinkDefinitionToType_1_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LinkDefinitionToType_1_1_performtransformation_binding != null) {
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[0];
			TSignature tSignature = (TSignature) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[1];
			TAbstractType tType = (TAbstractType) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[3];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[4];
			TMember tDefinition = (TMember) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[5];
			MDefinition mDefinition = (MDefinition) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[6];
			MSignature mSignature = (MSignature) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[7];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_LinkDefinitionToType_1_1_performtransformation_binding[8];

			Object[] result_pattern_LinkDefinitionToType_1_1_performtransformation_black = pattern_LinkDefinitionToType_1_1_performtransformation_blackBBBBBBBBBFBB(
					mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition, mDefinition, mSignature,
					mSignatureToTSignature, _this, isApplicableMatch);
			if (result_pattern_LinkDefinitionToType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LinkDefinitionToType_1_1_performtransformation_black[9];

				return new Object[] { mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition,
						mDefinition, mSignature, mSignatureToTSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_1_1_performtransformation_greenBBB(TSignature tSignature,
			TAbstractType tType, TMember tDefinition) {
		tType.getDefines().add(tDefinition);
		tType.getSignature().add(tSignature);
		return new Object[] { tSignature, tType, tDefinition };
	}

	public static final Object[] pattern_LinkDefinitionToType_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToType_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mDefinitionToTMember, EObject tSignature, EObject tType,
			EObject mTypeToTType, EObject mType, EObject tDefinition, EObject mDefinition, EObject mSignature,
			EObject mSignatureToTSignature) {
		if (!mDefinitionToTMember.equals(tSignature)) {
			if (!mDefinitionToTMember.equals(tType)) {
				if (!mDefinitionToTMember.equals(mTypeToTType)) {
					if (!mDefinitionToTMember.equals(mType)) {
						if (!mDefinitionToTMember.equals(tDefinition)) {
							if (!mDefinitionToTMember.equals(mSignature)) {
								if (!mDefinitionToTMember.equals(mSignatureToTSignature)) {
									if (!tSignature.equals(tType)) {
										if (!mTypeToTType.equals(tSignature)) {
											if (!mTypeToTType.equals(tType)) {
												if (!mTypeToTType.equals(tDefinition)) {
													if (!mType.equals(tSignature)) {
														if (!mType.equals(tType)) {
															if (!mType.equals(mTypeToTType)) {
																if (!mType.equals(tDefinition)) {
																	if (!tDefinition.equals(tSignature)) {
																		if (!tDefinition.equals(tType)) {
																			if (!mDefinition
																					.equals(mDefinitionToTMember)) {
																				if (!mDefinition.equals(tSignature)) {
																					if (!mDefinition.equals(tType)) {
																						if (!mDefinition
																								.equals(mTypeToTType)) {
																							if (!mDefinition
																									.equals(mType)) {
																								if (!mDefinition.equals(
																										tDefinition)) {
																									if (!mDefinition
																											.equals(mSignature)) {
																										if (!mDefinition
																												.equals(mSignatureToTSignature)) {
																											if (!mSignature
																													.equals(tSignature)) {
																												if (!mSignature
																														.equals(tType)) {
																													if (!mSignature
																															.equals(mTypeToTType)) {
																														if (!mSignature
																																.equals(mType)) {
																															if (!mSignature
																																	.equals(tDefinition)) {
																																if (!mSignature
																																		.equals(mSignatureToTSignature)) {
																																	if (!mSignatureToTSignature
																																			.equals(tSignature)) {
																																		if (!mSignatureToTSignature
																																				.equals(tType)) {
																																			if (!mSignatureToTSignature
																																					.equals(mTypeToTType)) {
																																				if (!mSignatureToTSignature
																																						.equals(mType)) {
																																					if (!mSignatureToTSignature
																																							.equals(tDefinition)) {
																																						return new Object[] {
																																								ruleresult,
																																								mDefinitionToTMember,
																																								tSignature,
																																								tType,
																																								mTypeToTType,
																																								mType,
																																								tDefinition,
																																								mDefinition,
																																								mSignature,
																																								mSignatureToTSignature };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_LinkDefinitionToType_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tSignature, EObject tType, EObject mType, EObject tDefinition,
			EObject mDefinition) {
		EMoflonEdge tType__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LinkDefinitionToType";
		String tType__tDefinition____defines_name_prime = "defines";
		String tDefinition__tType____definedBy_name_prime = "definedBy";
		String tType__tSignature____signature_name_prime = "signature";
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		tType__tDefinition____defines.setSrc(tType);
		tType__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tType__tDefinition____defines);
		tDefinition__tType____definedBy.setSrc(tDefinition);
		tDefinition__tType____definedBy.setTrg(tType);
		ruleresult.getCreatedEdges().add(tDefinition__tType____definedBy);
		tType__tSignature____signature.setSrc(tType);
		tType__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tType__tSignature____signature);
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mType____abstractTypeDeclaration.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mDefinition__mType____abstractTypeDeclaration);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tType__tDefinition____defines.setName(tType__tDefinition____defines_name_prime);
		tDefinition__tType____definedBy.setName(tDefinition__tType____definedBy_name_prime);
		tType__tSignature____signature.setName(tType__tSignature____signature_name_prime);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____abstractTypeDeclaration.setName(mDefinition__mType____abstractTypeDeclaration_name_prime);
		return new Object[] { ruleresult, tSignature, tType, mType, tDefinition, mDefinition,
				tType__tDefinition____defines, tDefinition__tType____definedBy, tType__tSignature____signature,
				mType__mDefinition____bodyDeclarations, mDefinition__mType____abstractTypeDeclaration };
	}

	public static final void pattern_LinkDefinitionToType_1_5_registerobjects_expressionBBBBBBBBBBB(
			LinkDefinitionToType _this, PerformRuleResult ruleresult, EObject mDefinitionToTMember, EObject tSignature,
			EObject tType, EObject mTypeToTType, EObject mType, EObject tDefinition, EObject mDefinition,
			EObject mSignature, EObject mSignatureToTSignature) {
		_this.registerObjects_FWD(ruleresult, mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition,
				mDefinition, mSignature, mSignatureToTSignature);

	}

	public static final PerformRuleResult pattern_LinkDefinitionToType_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_2_1_preparereturnvalue_bindingFB(
			LinkDefinitionToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			LinkDefinitionToType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_2_1_preparereturnvalue_bindingAndBlackFFB(
			LinkDefinitionToType _this) {
		Object[] result_pattern_LinkDefinitionToType_2_1_preparereturnvalue_binding = pattern_LinkDefinitionToType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LinkDefinitionToType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToType_2_1_preparereturnvalue_black = pattern_LinkDefinitionToType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LinkDefinitionToType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LinkDefinitionToType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "LinkDefinitionToType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToType_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mType");
		EObject _localVariable_1 = match.getObject("mDefinition");
		EObject _localVariable_2 = match.getObject("mSignature");
		EObject tmpMType = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		EObject tmpMSignature = _localVariable_2;
		if (tmpMType instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				if (tmpMSignature instanceof MSignature) {
					MSignature mSignature = (MSignature) tmpMSignature;
					return new Object[] { mType, mDefinition, mSignature, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToType_2_2_corematch_blackFFFFBFBBFB(
			AbstractTypeDeclaration mType, MDefinition mDefinition, MSignature mSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
			TAbstractType tType = mTypeToTType.getTarget();
			if (tType != null) {
				for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
					TMember tDefinition = mDefinitionToTMember.getTarget();
					if (tDefinition != null) {
						for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
							TSignature tSignature = mSignatureToTSignature.getTarget();
							if (tSignature != null) {
								_result.add(new Object[] { mDefinitionToTMember, tSignature, tType, mTypeToTType, mType,
										tDefinition, mDefinition, mSignature, mSignatureToTSignature, match });
							}

						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToType_2_3_findcontext_blackBBBBBBBBB(
			MDefinitionToTMember mDefinitionToTMember, TSignature tSignature, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, AbstractTypeDeclaration mType, TMember tDefinition,
			MDefinition mDefinition, MSignature mSignature, MSignatureToTSignature mSignatureToTSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mType.equals(mTypeToTType.getSource())) {
			if (tType.equals(mTypeToTType.getTarget())) {
				if (mSignature.getMDefinitions().contains(mDefinition)) {
					if (mDefinition.equals(mDefinitionToTMember.getSource())) {
						if (tDefinition.equals(mDefinitionToTMember.getTarget())) {
							if (mSignature.equals(mSignatureToTSignature.getSource())) {
								if (mType.getBodyDeclarations().contains(mDefinition)) {
									if (tSignature.getDefinitions().contains(tDefinition)) {
										if (tSignature.equals(mSignatureToTSignature.getTarget())) {
											_result.add(new Object[] { mDefinitionToTMember, tSignature, tType,
													mTypeToTType, mType, tDefinition, mDefinition, mSignature,
													mSignatureToTSignature });
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

	public static final Object[] pattern_LinkDefinitionToType_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFF(
			MDefinitionToTMember mDefinitionToTMember, TSignature tSignature, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, AbstractTypeDeclaration mType, TMember tDefinition,
			MDefinition mDefinition, MSignature mSignature, MSignatureToTSignature mSignatureToTSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mTypeToTType__mType____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition__mSignature____mSignature);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__mDefinition____source);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__tDefinition____target);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mType____abstractTypeDeclaration.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mDefinition__mType____abstractTypeDeclaration);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature__tDefinition____definitions);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tSignature____signature);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSignature____target);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____abstractTypeDeclaration.setName(mDefinition__mType____abstractTypeDeclaration_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		return new Object[] { mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition, mDefinition,
				mSignature, mSignatureToTSignature, isApplicableMatch, mTypeToTType__mType____source,
				mTypeToTType__tType____target, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature, mDefinitionToTMember__mDefinition____source,
				mDefinitionToTMember__tDefinition____target, mSignatureToTSignature__mSignature____source,
				mType__mDefinition____bodyDeclarations, mDefinition__mType____abstractTypeDeclaration,
				tSignature__tDefinition____definitions, tDefinition__tSignature____signature,
				mSignatureToTSignature__tSignature____target };
	}

	public static final Object[] pattern_LinkDefinitionToType_2_4_solveCSP_bindingFBBBBBBBBBBB(
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature, TAbstractType tType, TypeToTAbstractType mTypeToTType, AbstractTypeDeclaration mType,
			TMember tDefinition, MDefinition mDefinition, MSignature mSignature,
			MSignatureToTSignature mSignatureToTSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mDefinitionToTMember, tSignature,
				tType, mTypeToTType, mType, tDefinition, mDefinition, mSignature, mSignatureToTSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinitionToTMember, tSignature, tType, mTypeToTType,
					mType, tDefinition, mDefinition, mSignature, mSignatureToTSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToType_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature, TAbstractType tType, TypeToTAbstractType mTypeToTType, AbstractTypeDeclaration mType,
			TMember tDefinition, MDefinition mDefinition, MSignature mSignature,
			MSignatureToTSignature mSignatureToTSignature) {
		Object[] result_pattern_LinkDefinitionToType_2_4_solveCSP_binding = pattern_LinkDefinitionToType_2_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition,
				mDefinition, mSignature, mSignatureToTSignature);
		if (result_pattern_LinkDefinitionToType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToType_2_4_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToType_2_4_solveCSP_black = pattern_LinkDefinitionToType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinitionToTMember, tSignature, tType,
						mTypeToTType, mType, tDefinition, mDefinition, mSignature, mSignatureToTSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToType_2_5_checkCSP_expressionFBB(LinkDefinitionToType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LinkDefinitionToType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LinkDefinitionToType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkDefinitionToType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_10_1_initialbindings_blackBBBBB(
			LinkDefinitionToType _this, Match match, TSignature tSignature, TAbstractType tType, TMember tDefinition) {
		return new Object[] { _this, match, tSignature, tType, tDefinition };
	}

	public static final Object[] pattern_LinkDefinitionToType_10_2_SolveCSP_bindingFBBBBB(LinkDefinitionToType _this,
			Match match, TSignature tSignature, TAbstractType tType, TMember tDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tSignature, tType, tDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tSignature, tType, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToType_10_2_SolveCSP_bindingAndBlackFBBBBB(
			LinkDefinitionToType _this, Match match, TSignature tSignature, TAbstractType tType, TMember tDefinition) {
		Object[] result_pattern_LinkDefinitionToType_10_2_SolveCSP_binding = pattern_LinkDefinitionToType_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tSignature, tType, tDefinition);
		if (result_pattern_LinkDefinitionToType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToType_10_2_SolveCSP_black = pattern_LinkDefinitionToType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tSignature, tType, tDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToType_10_3_CheckCSP_expressionFBB(LinkDefinitionToType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TSignature tSignature, TAbstractType tType, TMember tDefinition) {
		return new Object[] { match, tSignature, tType, tDefinition };
	}

	public static final Object[] pattern_LinkDefinitionToType_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, TSignature tSignature, TAbstractType tType, TMember tDefinition) {
		EMoflonEdge tType__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tType__tDefinition____defines_name_prime = "defines";
		String tDefinition__tType____definedBy_name_prime = "definedBy";
		String tType__tSignature____signature_name_prime = "signature";
		tType__tDefinition____defines.setSrc(tType);
		tType__tDefinition____defines.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tType__tDefinition____defines);
		tDefinition__tType____definedBy.setSrc(tDefinition);
		tDefinition__tType____definedBy.setTrg(tType);
		match.getToBeTranslatedEdges().add(tDefinition__tType____definedBy);
		tType__tSignature____signature.setSrc(tType);
		tType__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tType__tSignature____signature);
		tType__tDefinition____defines.setName(tType__tDefinition____defines_name_prime);
		tDefinition__tType____definedBy.setName(tDefinition__tType____definedBy_name_prime);
		tType__tSignature____signature.setName(tType__tSignature____signature_name_prime);
		return new Object[] { match, tSignature, tType, tDefinition, tType__tDefinition____defines,
				tDefinition__tType____definedBy, tType__tSignature____signature };
	}

	public static final Object[] pattern_LinkDefinitionToType_10_5_collectcontextelements_blackBBBB(Match match,
			TSignature tSignature, TAbstractType tType, TMember tDefinition) {
		return new Object[] { match, tSignature, tType, tDefinition };
	}

	public static final Object[] pattern_LinkDefinitionToType_10_5_collectcontextelements_greenBBBBFF(Match match,
			TSignature tSignature, TAbstractType tType, TMember tDefinition) {
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tSignature);
		match.getContextNodes().add(tType);
		match.getContextNodes().add(tDefinition);
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tSignature____signature_name_prime = "signature";
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		match.getContextEdges().add(tSignature__tDefinition____definitions);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		match.getContextEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		return new Object[] { match, tSignature, tType, tDefinition, tSignature__tDefinition____definitions,
				tDefinition__tSignature____signature };
	}

	public static final void pattern_LinkDefinitionToType_10_6_registerobjectstomatch_expressionBBBBB(
			LinkDefinitionToType _this, Match match, TSignature tSignature, TAbstractType tType, TMember tDefinition) {
		_this.registerObjectsToMatch_BWD(match, tSignature, tType, tDefinition);

	}

	public static final boolean pattern_LinkDefinitionToType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToType_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_11_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mDefinitionToTMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("tType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_4 = isApplicableMatch.getObject("mType");
		EObject _localVariable_5 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_6 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_7 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_8 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject tmpMDefinitionToTMember = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpMTypeToTType = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		EObject tmpTDefinition = _localVariable_5;
		EObject tmpMDefinition = _localVariable_6;
		EObject tmpMSignature = _localVariable_7;
		EObject tmpMSignatureToTSignature = _localVariable_8;
		if (tmpMDefinitionToTMember instanceof MDefinitionToTMember) {
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) tmpMDefinitionToTMember;
			if (tmpTSignature instanceof TSignature) {
				TSignature tSignature = (TSignature) tmpTSignature;
				if (tmpTType instanceof TAbstractType) {
					TAbstractType tType = (TAbstractType) tmpTType;
					if (tmpMTypeToTType instanceof TypeToTAbstractType) {
						TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
						if (tmpMType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
							if (tmpTDefinition instanceof TMember) {
								TMember tDefinition = (TMember) tmpTDefinition;
								if (tmpMDefinition instanceof MDefinition) {
									MDefinition mDefinition = (MDefinition) tmpMDefinition;
									if (tmpMSignature instanceof MSignature) {
										MSignature mSignature = (MSignature) tmpMSignature;
										if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
											MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
											return new Object[] { mDefinitionToTMember, tSignature, tType, mTypeToTType,
													mType, tDefinition, mDefinition, mSignature, mSignatureToTSignature,
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
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_11_1_performtransformation_blackBBBBBBBBBFBB(
			MDefinitionToTMember mDefinitionToTMember, TSignature tSignature, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, AbstractTypeDeclaration mType, TMember tDefinition,
			MDefinition mDefinition, MSignature mSignature, MSignatureToTSignature mSignatureToTSignature,
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition,
						mDefinition, mSignature, mSignatureToTSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LinkDefinitionToType_11_1_performtransformation_binding = pattern_LinkDefinitionToType_11_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LinkDefinitionToType_11_1_performtransformation_binding != null) {
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[0];
			TSignature tSignature = (TSignature) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[1];
			TAbstractType tType = (TAbstractType) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[3];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[4];
			TMember tDefinition = (TMember) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[5];
			MDefinition mDefinition = (MDefinition) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[6];
			MSignature mSignature = (MSignature) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[7];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_LinkDefinitionToType_11_1_performtransformation_binding[8];

			Object[] result_pattern_LinkDefinitionToType_11_1_performtransformation_black = pattern_LinkDefinitionToType_11_1_performtransformation_blackBBBBBBBBBFBB(
					mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition, mDefinition, mSignature,
					mSignatureToTSignature, _this, isApplicableMatch);
			if (result_pattern_LinkDefinitionToType_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LinkDefinitionToType_11_1_performtransformation_black[9];

				return new Object[] { mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition,
						mDefinition, mSignature, mSignatureToTSignature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_11_1_performtransformation_greenBB(
			AbstractTypeDeclaration mType, MDefinition mDefinition) {
		mType.getBodyDeclarations().add(mDefinition);
		return new Object[] { mType, mDefinition };
	}

	public static final Object[] pattern_LinkDefinitionToType_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToType_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mDefinitionToTMember, EObject tSignature, EObject tType,
			EObject mTypeToTType, EObject mType, EObject tDefinition, EObject mDefinition, EObject mSignature,
			EObject mSignatureToTSignature) {
		if (!mDefinitionToTMember.equals(tSignature)) {
			if (!mDefinitionToTMember.equals(tType)) {
				if (!mDefinitionToTMember.equals(mTypeToTType)) {
					if (!mDefinitionToTMember.equals(mType)) {
						if (!mDefinitionToTMember.equals(tDefinition)) {
							if (!mDefinitionToTMember.equals(mSignature)) {
								if (!mDefinitionToTMember.equals(mSignatureToTSignature)) {
									if (!tSignature.equals(tType)) {
										if (!mTypeToTType.equals(tSignature)) {
											if (!mTypeToTType.equals(tType)) {
												if (!mTypeToTType.equals(tDefinition)) {
													if (!mType.equals(tSignature)) {
														if (!mType.equals(tType)) {
															if (!mType.equals(mTypeToTType)) {
																if (!mType.equals(tDefinition)) {
																	if (!tDefinition.equals(tSignature)) {
																		if (!tDefinition.equals(tType)) {
																			if (!mDefinition
																					.equals(mDefinitionToTMember)) {
																				if (!mDefinition.equals(tSignature)) {
																					if (!mDefinition.equals(tType)) {
																						if (!mDefinition
																								.equals(mTypeToTType)) {
																							if (!mDefinition
																									.equals(mType)) {
																								if (!mDefinition.equals(
																										tDefinition)) {
																									if (!mDefinition
																											.equals(mSignature)) {
																										if (!mDefinition
																												.equals(mSignatureToTSignature)) {
																											if (!mSignature
																													.equals(tSignature)) {
																												if (!mSignature
																														.equals(tType)) {
																													if (!mSignature
																															.equals(mTypeToTType)) {
																														if (!mSignature
																																.equals(mType)) {
																															if (!mSignature
																																	.equals(tDefinition)) {
																																if (!mSignature
																																		.equals(mSignatureToTSignature)) {
																																	if (!mSignatureToTSignature
																																			.equals(tSignature)) {
																																		if (!mSignatureToTSignature
																																				.equals(tType)) {
																																			if (!mSignatureToTSignature
																																					.equals(mTypeToTType)) {
																																				if (!mSignatureToTSignature
																																						.equals(mType)) {
																																					if (!mSignatureToTSignature
																																							.equals(tDefinition)) {
																																						return new Object[] {
																																								ruleresult,
																																								mDefinitionToTMember,
																																								tSignature,
																																								tType,
																																								mTypeToTType,
																																								mType,
																																								tDefinition,
																																								mDefinition,
																																								mSignature,
																																								mSignatureToTSignature };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_LinkDefinitionToType_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tSignature, EObject tType, EObject mType, EObject tDefinition,
			EObject mDefinition) {
		EMoflonEdge tType__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LinkDefinitionToType";
		String tType__tDefinition____defines_name_prime = "defines";
		String tDefinition__tType____definedBy_name_prime = "definedBy";
		String tType__tSignature____signature_name_prime = "signature";
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		tType__tDefinition____defines.setSrc(tType);
		tType__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tType__tDefinition____defines);
		tDefinition__tType____definedBy.setSrc(tDefinition);
		tDefinition__tType____definedBy.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tDefinition__tType____definedBy);
		tType__tSignature____signature.setSrc(tType);
		tType__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tType__tSignature____signature);
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mType____abstractTypeDeclaration.setTrg(mType);
		ruleresult.getCreatedEdges().add(mDefinition__mType____abstractTypeDeclaration);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tType__tDefinition____defines.setName(tType__tDefinition____defines_name_prime);
		tDefinition__tType____definedBy.setName(tDefinition__tType____definedBy_name_prime);
		tType__tSignature____signature.setName(tType__tSignature____signature_name_prime);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____abstractTypeDeclaration.setName(mDefinition__mType____abstractTypeDeclaration_name_prime);
		return new Object[] { ruleresult, tSignature, tType, mType, tDefinition, mDefinition,
				tType__tDefinition____defines, tDefinition__tType____definedBy, tType__tSignature____signature,
				mType__mDefinition____bodyDeclarations, mDefinition__mType____abstractTypeDeclaration };
	}

	public static final void pattern_LinkDefinitionToType_11_5_registerobjects_expressionBBBBBBBBBBB(
			LinkDefinitionToType _this, PerformRuleResult ruleresult, EObject mDefinitionToTMember, EObject tSignature,
			EObject tType, EObject mTypeToTType, EObject mType, EObject tDefinition, EObject mDefinition,
			EObject mSignature, EObject mSignatureToTSignature) {
		_this.registerObjects_BWD(ruleresult, mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition,
				mDefinition, mSignature, mSignatureToTSignature);

	}

	public static final PerformRuleResult pattern_LinkDefinitionToType_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_12_1_preparereturnvalue_bindingFB(
			LinkDefinitionToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_12_1_preparereturnvalue_blackFBB(EClass eClass,
			LinkDefinitionToType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_12_1_preparereturnvalue_bindingAndBlackFFB(
			LinkDefinitionToType _this) {
		Object[] result_pattern_LinkDefinitionToType_12_1_preparereturnvalue_binding = pattern_LinkDefinitionToType_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToType_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LinkDefinitionToType_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToType_12_1_preparereturnvalue_black = pattern_LinkDefinitionToType_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LinkDefinitionToType_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LinkDefinitionToType_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "LinkDefinitionToType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToType_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tSignature");
		EObject _localVariable_1 = match.getObject("tType");
		EObject _localVariable_2 = match.getObject("tDefinition");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpTDefinition = _localVariable_2;
		if (tmpTSignature instanceof TSignature) {
			TSignature tSignature = (TSignature) tmpTSignature;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tmpTDefinition instanceof TMember) {
					TMember tDefinition = (TMember) tmpTDefinition;
					return new Object[] { tSignature, tType, tDefinition, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToType_12_2_corematch_blackFBBFFBFFFB(
			TSignature tSignature, TAbstractType tType, TMember tDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
			Type tmpMType = mTypeToTType.getSource();
			if (tmpMType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
				for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tDefinition, MDefinitionToTMember.class, "target")) {
					BodyDeclaration tmpMDefinition = mDefinitionToTMember.getSource();
					if (tmpMDefinition instanceof MDefinition) {
						MDefinition mDefinition = (MDefinition) tmpMDefinition;
						for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tSignature, MSignatureToTSignature.class, "target")) {
							MSignature mSignature = mSignatureToTSignature.getSource();
							if (mSignature != null) {
								_result.add(new Object[] { mDefinitionToTMember, tSignature, tType, mTypeToTType, mType,
										tDefinition, mDefinition, mSignature, mSignatureToTSignature, match });
							}

						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToType_12_3_findcontext_blackBBBBBBBBB(
			MDefinitionToTMember mDefinitionToTMember, TSignature tSignature, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, AbstractTypeDeclaration mType, TMember tDefinition,
			MDefinition mDefinition, MSignature mSignature, MSignatureToTSignature mSignatureToTSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tType.getDefines().contains(tDefinition)) {
			if (mType.equals(mTypeToTType.getSource())) {
				if (tType.getSignature().contains(tSignature)) {
					if (tType.equals(mTypeToTType.getTarget())) {
						if (mSignature.getMDefinitions().contains(mDefinition)) {
							if (mDefinition.equals(mDefinitionToTMember.getSource())) {
								if (tDefinition.equals(mDefinitionToTMember.getTarget())) {
									if (mSignature.equals(mSignatureToTSignature.getSource())) {
										if (tSignature.getDefinitions().contains(tDefinition)) {
											if (tSignature.equals(mSignatureToTSignature.getTarget())) {
												_result.add(new Object[] { mDefinitionToTMember, tSignature, tType,
														mTypeToTType, mType, tDefinition, mDefinition, mSignature,
														mSignatureToTSignature });
											}
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

	public static final Object[] pattern_LinkDefinitionToType_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFFF(
			MDefinitionToTMember mDefinitionToTMember, TSignature tSignature, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, AbstractTypeDeclaration mType, TMember tDefinition,
			MDefinition mDefinition, MSignature mSignature, MSignatureToTSignature mSignatureToTSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tType__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tType__tDefinition____defines_name_prime = "defines";
		String tDefinition__tType____definedBy_name_prime = "definedBy";
		String mTypeToTType__mType____source_name_prime = "source";
		String tType__tSignature____signature_name_prime = "signature";
		String mTypeToTType__tType____target_name_prime = "target";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		tType__tDefinition____defines.setSrc(tType);
		tType__tDefinition____defines.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tType__tDefinition____defines);
		tDefinition__tType____definedBy.setSrc(tDefinition);
		tDefinition__tType____definedBy.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tDefinition__tType____definedBy);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		tType__tSignature____signature.setSrc(tType);
		tType__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tType__tSignature____signature);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition__mSignature____mSignature);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__mDefinition____source);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__tDefinition____target);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature__tDefinition____definitions);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tSignature____signature);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSignature____target);
		tType__tDefinition____defines.setName(tType__tDefinition____defines_name_prime);
		tDefinition__tType____definedBy.setName(tDefinition__tType____definedBy_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		tType__tSignature____signature.setName(tType__tSignature____signature_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		return new Object[] { mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition, mDefinition,
				mSignature, mSignatureToTSignature, isApplicableMatch, tType__tDefinition____defines,
				tDefinition__tType____definedBy, mTypeToTType__mType____source, tType__tSignature____signature,
				mTypeToTType__tType____target, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature, mDefinitionToTMember__mDefinition____source,
				mDefinitionToTMember__tDefinition____target, mSignatureToTSignature__mSignature____source,
				tSignature__tDefinition____definitions, tDefinition__tSignature____signature,
				mSignatureToTSignature__tSignature____target };
	}

	public static final Object[] pattern_LinkDefinitionToType_12_4_solveCSP_bindingFBBBBBBBBBBB(
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature, TAbstractType tType, TypeToTAbstractType mTypeToTType, AbstractTypeDeclaration mType,
			TMember tDefinition, MDefinition mDefinition, MSignature mSignature,
			MSignatureToTSignature mSignatureToTSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mDefinitionToTMember, tSignature,
				tType, mTypeToTType, mType, tDefinition, mDefinition, mSignature, mSignatureToTSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinitionToTMember, tSignature, tType, mTypeToTType,
					mType, tDefinition, mDefinition, mSignature, mSignatureToTSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToType_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature, TAbstractType tType, TypeToTAbstractType mTypeToTType, AbstractTypeDeclaration mType,
			TMember tDefinition, MDefinition mDefinition, MSignature mSignature,
			MSignatureToTSignature mSignatureToTSignature) {
		Object[] result_pattern_LinkDefinitionToType_12_4_solveCSP_binding = pattern_LinkDefinitionToType_12_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition,
				mDefinition, mSignature, mSignatureToTSignature);
		if (result_pattern_LinkDefinitionToType_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToType_12_4_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToType_12_4_solveCSP_black = pattern_LinkDefinitionToType_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToType_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinitionToTMember, tSignature, tType,
						mTypeToTType, mType, tDefinition, mDefinition, mSignature, mSignatureToTSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToType_12_5_checkCSP_expressionFBB(LinkDefinitionToType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LinkDefinitionToType_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LinkDefinitionToType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkDefinitionToType_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_20_1_preparereturnvalue_bindingFB(
			LinkDefinitionToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			LinkDefinitionToType _this) {
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

	public static final Object[] pattern_LinkDefinitionToType_20_1_preparereturnvalue_bindingAndBlackFFBF(
			LinkDefinitionToType _this) {
		Object[] result_pattern_LinkDefinitionToType_20_1_preparereturnvalue_binding = pattern_LinkDefinitionToType_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToType_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LinkDefinitionToType_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToType_20_1_preparereturnvalue_black = pattern_LinkDefinitionToType_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LinkDefinitionToType_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LinkDefinitionToType_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LinkDefinitionToType_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToType_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_defines) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTType = _edge_defines.getSrc();
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			EObject tmpTDefinition = _edge_defines.getTrg();
			if (tmpTDefinition instanceof TMember) {
				TMember tDefinition = (TMember) tmpTDefinition;
				if (tType.getDefines().contains(tDefinition)) {
					TSignature tSignature = tDefinition.getSignature();
					if (tSignature != null) {
						if (tType.getSignature().contains(tSignature)) {
							_result.add(new Object[] { tSignature, tType, tDefinition, _edge_defines });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LinkDefinitionToType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			LinkDefinitionToType _this, Match match, TSignature tSignature, TAbstractType tType, TMember tDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tSignature, tType, tDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LinkDefinitionToType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LinkDefinitionToType_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_21_1_preparereturnvalue_bindingFB(
			LinkDefinitionToType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			LinkDefinitionToType _this) {
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

	public static final Object[] pattern_LinkDefinitionToType_21_1_preparereturnvalue_bindingAndBlackFFBF(
			LinkDefinitionToType _this) {
		Object[] result_pattern_LinkDefinitionToType_21_1_preparereturnvalue_binding = pattern_LinkDefinitionToType_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToType_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LinkDefinitionToType_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToType_21_1_preparereturnvalue_black = pattern_LinkDefinitionToType_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LinkDefinitionToType_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LinkDefinitionToType_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LinkDefinitionToType_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToType_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMType = _edge_bodyDeclarations.getSrc();
		if (tmpMType instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
			EObject tmpMDefinition = _edge_bodyDeclarations.getTrg();
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				if (mType.getBodyDeclarations().contains(mDefinition)) {
					MSignature mSignature = mDefinition.getMSignature();
					if (mSignature != null) {
						_result.add(new Object[] { mType, mDefinition, mSignature, _edge_bodyDeclarations });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LinkDefinitionToType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			LinkDefinitionToType _this, Match match, AbstractTypeDeclaration mType, MDefinition mDefinition,
			MSignature mSignature) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mType, mDefinition, mSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LinkDefinitionToType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LinkDefinitionToType_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_24_1_prepare_blackB(LinkDefinitionToType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LinkDefinitionToType_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tSignature");
		EObject _localVariable_1 = targetMatch.getObject("tType");
		EObject _localVariable_2 = sourceMatch.getObject("mType");
		EObject _localVariable_3 = targetMatch.getObject("tDefinition");
		EObject _localVariable_4 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_5 = sourceMatch.getObject("mSignature");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpMType = _localVariable_2;
		EObject tmpTDefinition = _localVariable_3;
		EObject tmpMDefinition = _localVariable_4;
		EObject tmpMSignature = _localVariable_5;
		if (tmpTSignature instanceof TSignature) {
			TSignature tSignature = (TSignature) tmpTSignature;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tmpMType instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
					if (tmpTDefinition instanceof TMember) {
						TMember tDefinition = (TMember) tmpTDefinition;
						if (tmpMDefinition instanceof MDefinition) {
							MDefinition mDefinition = (MDefinition) tmpMDefinition;
							if (tmpMSignature instanceof MSignature) {
								MSignature mSignature = (MSignature) tmpMSignature;
								return new Object[] { tSignature, tType, mType, tDefinition, mDefinition, mSignature,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_blackBBBBBBBB(
			TSignature tSignature, TAbstractType tType, AbstractTypeDeclaration mType, TMember tDefinition,
			MDefinition mDefinition, MSignature mSignature, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tSignature, tType, mType, tDefinition, mDefinition, mSignature, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_binding = pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_binding != null) {
			TSignature tSignature = (TSignature) result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_binding[0];
			TAbstractType tType = (TAbstractType) result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_binding[1];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_binding[2];
			TMember tDefinition = (TMember) result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_binding[3];
			MDefinition mDefinition = (MDefinition) result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_binding[4];
			MSignature mSignature = (MSignature) result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_black = pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_blackBBBBBBBB(
					tSignature, tType, mType, tDefinition, mDefinition, mSignature, sourceMatch, targetMatch);
			if (result_pattern_LinkDefinitionToType_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tSignature, tType, mType, tDefinition, mDefinition, mSignature, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_24_3_solvecsp_bindingFBBBBBBBBB(
			LinkDefinitionToType _this, TSignature tSignature, TAbstractType tType, AbstractTypeDeclaration mType,
			TMember tDefinition, MDefinition mDefinition, MSignature mSignature, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tSignature, tType, mType, tDefinition, mDefinition,
				mSignature, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tSignature, tType, mType, tDefinition, mDefinition, mSignature,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToType_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			LinkDefinitionToType _this, TSignature tSignature, TAbstractType tType, AbstractTypeDeclaration mType,
			TMember tDefinition, MDefinition mDefinition, MSignature mSignature, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_LinkDefinitionToType_24_3_solvecsp_binding = pattern_LinkDefinitionToType_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, tSignature, tType, mType, tDefinition, mDefinition, mSignature, sourceMatch, targetMatch);
		if (result_pattern_LinkDefinitionToType_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToType_24_3_solvecsp_binding[0];

			Object[] result_pattern_LinkDefinitionToType_24_3_solvecsp_black = pattern_LinkDefinitionToType_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_LinkDefinitionToType_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tSignature, tType, mType, tDefinition, mDefinition, mSignature,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToType_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToType_24_5_matchcorrcontext_blackFBBFBBBBFBB(
			TSignature tSignature, TAbstractType tType, AbstractTypeDeclaration mType, TMember tDefinition,
			MDefinition mDefinition, MSignature mSignature, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
				if (tType.equals(mTypeToTType.getTarget())) {
					for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
						if (tDefinition.equals(mDefinitionToTMember.getTarget())) {
							for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
								if (tSignature.equals(mSignatureToTSignature.getTarget())) {
									_result.add(new Object[] { mDefinitionToTMember, tSignature, tType, mTypeToTType,
											mType, tDefinition, mDefinition, mSignature, mSignatureToTSignature,
											sourceMatch, targetMatch });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_24_5_matchcorrcontext_greenBBBBBF(
			MDefinitionToTMember mDefinitionToTMember, TypeToTAbstractType mTypeToTType,
			MSignatureToTSignature mSignatureToTSignature, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "LinkDefinitionToType";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mDefinitionToTMember);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.getAllContextElements().add(mSignatureToTSignature);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mDefinitionToTMember, mTypeToTType, mSignatureToTSignature, sourceMatch, targetMatch,
				ccMatch };
	}

	public static final Object[] pattern_LinkDefinitionToType_24_6_createcorrespondence_blackBBBBBBB(
			TSignature tSignature, TAbstractType tType, AbstractTypeDeclaration mType, TMember tDefinition,
			MDefinition mDefinition, MSignature mSignature, CCMatch ccMatch) {
		return new Object[] { tSignature, tType, mType, tDefinition, mDefinition, mSignature, ccMatch };
	}

	public static final Object[] pattern_LinkDefinitionToType_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_LinkDefinitionToType_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "LinkDefinitionToType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkDefinitionToType_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_27_1_matchtggpattern_blackBBB(
			AbstractTypeDeclaration mType, MDefinition mDefinition, MSignature mSignature) {
		if (mSignature.getMDefinitions().contains(mDefinition)) {
			if (mType.getBodyDeclarations().contains(mDefinition)) {
				return new Object[] { mType, mDefinition, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToType_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToType_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_28_1_matchtggpattern_blackBBB(TSignature tSignature,
			TAbstractType tType, TMember tDefinition) {
		if (tType.getDefines().contains(tDefinition)) {
			if (tType.getSignature().contains(tSignature)) {
				if (tSignature.getDefinitions().contains(tDefinition)) {
					return new Object[] { tSignature, tType, tDefinition };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToType_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToType_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_1_createresult_blackB(LinkDefinitionToType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LinkDefinitionToType_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mDefinitionToTMember) {
		if (ruleResult.getCorrObjects().contains(mDefinitionToTMember)) {
			return new Object[] { ruleResult, mDefinitionToTMember };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mSignatureToTSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTSignature)) {
			return new Object[] { ruleResult, mSignatureToTSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TSignature tSignature) {
		if (ruleResult.getTargetObjects().contains(tSignature)) {
			return new Object[] { ruleResult, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TMember tDefinition) {
		if (ruleResult.getTargetObjects().contains(tDefinition)) {
			return new Object[] { ruleResult, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToType_29_2_isapplicablecore_blackFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mDefinitionToTMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
				if (!mDefinitionToTMemberList.equals(mTypeToTTypeList)) {
					for (EObject tmpMDefinitionToTMember : mDefinitionToTMemberList.getEntryObjects()) {
						if (tmpMDefinitionToTMember instanceof MDefinitionToTMember) {
							MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) tmpMDefinitionToTMember;
							BodyDeclaration tmpMDefinition = mDefinitionToTMember.getSource();
							if (tmpMDefinition instanceof MDefinition) {
								MDefinition mDefinition = (MDefinition) tmpMDefinition;
								TMember tDefinition = mDefinitionToTMember.getTarget();
								if (tDefinition != null) {
									MSignature mSignature = mDefinition.getMSignature();
									if (mSignature != null) {
										TSignature tSignature = tDefinition.getSignature();
										if (tSignature != null) {
											if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_0BB(
													ruleResult, mDefinitionToTMember) == null) {
												if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_1BB(
														ruleResult, mDefinition) == null) {
													if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_5BB(
															ruleResult, tDefinition) == null) {
														if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_2BB(
																ruleResult, mSignature) == null) {
															if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_4BB(
																	ruleResult, tSignature) == null) {
																for (EObject tmpMTypeToTType : mTypeToTTypeList
																		.getEntryObjects()) {
																	if (tmpMTypeToTType instanceof TypeToTAbstractType) {
																		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
																		TAbstractType tType = mTypeToTType.getTarget();
																		if (tType != null) {
																			Type tmpMType = mTypeToTType.getSource();
																			if (tmpMType instanceof AbstractTypeDeclaration) {
																				AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
																				if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_7BB(
																						ruleResult,
																						mTypeToTType) == null) {
																					if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_6BB(
																							ruleResult,
																							tType) == null) {
																						if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_8BB(
																								ruleResult,
																								mType) == null) {
																							for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
																									.getOppositeReferenceTyped(
																											mSignature,
																											MSignatureToTSignature.class,
																											"source")) {
																								if (tSignature.equals(
																										mSignatureToTSignature
																												.getTarget())) {
																									if (pattern_LinkDefinitionToType_29_2_isapplicablecore_black_nac_3BB(
																											ruleResult,
																											mSignatureToTSignature) == null) {
																										_result.add(
																												new Object[] {
																														mDefinitionToTMemberList,
																														mDefinitionToTMember,
																														mDefinition,
																														mSignature,
																														mSignatureToTSignature,
																														tSignature,
																														tDefinition,
																														mTypeToTTypeList,
																														tType,
																														mTypeToTType,
																														mType,
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
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_3_solveCSP_bindingFBBBBBBBBBBBB(
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature, TAbstractType tType, TypeToTAbstractType mTypeToTType, AbstractTypeDeclaration mType,
			TMember tDefinition, MDefinition mDefinition, MSignature mSignature,
			MSignatureToTSignature mSignatureToTSignature, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mDefinitionToTMember, tSignature,
				tType, mTypeToTType, mType, tDefinition, mDefinition, mSignature, mSignatureToTSignature, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinitionToTMember, tSignature, tType, mTypeToTType,
					mType, tDefinition, mDefinition, mSignature, mSignatureToTSignature, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToType_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			LinkDefinitionToType _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature, TAbstractType tType, TypeToTAbstractType mTypeToTType, AbstractTypeDeclaration mType,
			TMember tDefinition, MDefinition mDefinition, MSignature mSignature,
			MSignatureToTSignature mSignatureToTSignature, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_LinkDefinitionToType_29_3_solveCSP_binding = pattern_LinkDefinitionToType_29_3_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition,
				mDefinition, mSignature, mSignatureToTSignature, ruleResult);
		if (result_pattern_LinkDefinitionToType_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToType_29_3_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToType_29_3_solveCSP_black = pattern_LinkDefinitionToType_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToType_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinitionToTMember, tSignature, tType,
						mTypeToTType, mType, tDefinition, mDefinition, mSignature, mSignatureToTSignature, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToType_29_4_checkCSP_expressionFBB(LinkDefinitionToType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToType_29_5_checknacs_blackBBBBBBBBB(
			MDefinitionToTMember mDefinitionToTMember, TSignature tSignature, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, AbstractTypeDeclaration mType, TMember tDefinition,
			MDefinition mDefinition, MSignature mSignature, MSignatureToTSignature mSignatureToTSignature) {
		return new Object[] { mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition, mDefinition,
				mSignature, mSignatureToTSignature };
	}

	public static final Object[] pattern_LinkDefinitionToType_29_6_perform_blackBBBBBBBBBB(
			MDefinitionToTMember mDefinitionToTMember, TSignature tSignature, TAbstractType tType,
			TypeToTAbstractType mTypeToTType, AbstractTypeDeclaration mType, TMember tDefinition,
			MDefinition mDefinition, MSignature mSignature, MSignatureToTSignature mSignatureToTSignature,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mDefinitionToTMember, tSignature, tType, mTypeToTType, mType, tDefinition, mDefinition,
				mSignature, mSignatureToTSignature, ruleResult };
	}

	public static final Object[] pattern_LinkDefinitionToType_29_6_perform_greenBBBBBB(TSignature tSignature,
			TAbstractType tType, AbstractTypeDeclaration mType, TMember tDefinition, MDefinition mDefinition,
			ModelgeneratorRuleResult ruleResult) {
		tType.getDefines().add(tDefinition);
		tType.getSignature().add(tSignature);
		mType.getBodyDeclarations().add(mDefinition);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tSignature, tType, mType, tDefinition, mDefinition, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_LinkDefinitionToType_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LinkDefinitionToTypeImpl
