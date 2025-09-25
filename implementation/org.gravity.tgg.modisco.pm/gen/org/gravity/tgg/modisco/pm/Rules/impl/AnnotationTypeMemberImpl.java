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
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.modisco.java.AnnotationTypeMemberDeclaration;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.AnnotationTypeMember;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TModule;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TypeGraph;

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
 * An implementation of the model object '<em><b>Annotation Type Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotationTypeMemberImpl extends AbstractRuleImpl implements AnnotationTypeMember {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnnotationTypeMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Type mType, AnnotationTypeMemberDeclaration mMember,
			AnnotationTypeDeclaration mAnnotation, TypeAccess access) {

		Object[] result1_black = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_1_initialbindings_blackBBBBBB(
				this, match, mType, mMember, mAnnotation, access);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mType] = " + mType + ", " + "[mMember] = " + mMember + ", "
					+ "[mAnnotation] = " + mAnnotation + ", " + "[access] = " + access + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, mType, mMember,
						mAnnotation, access);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mType] = " + mType + ", " + "[mMember] = " + mMember + ", "
					+ "[mAnnotation] = " + mAnnotation + ", " + "[access] = " + access + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_0_4_collectelementstobetranslated_blackBBBBB(match, mType, mMember,
							mAnnotation, access);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mType] = " + mType + ", " + "[mMember] = " + mMember + ", " + "[mAnnotation] = "
						+ mAnnotation + ", " + "[access] = " + access + ".");
			}
			AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_4_collectelementstobetranslated_greenBBBBBFFFFF(
					match, mType, mMember, mAnnotation, access);
			//nothing EMoflonEdge mMember__access____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge mAnnotation__mMember____bodyDeclarations = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge access__mType____type = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge mType__access____usagesInTypeAccess = (EMoflonEdge) result4_green[9];

			Object[] result5_black = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_0_5_collectcontextelements_blackBBBBB(match, mType, mMember,
							mAnnotation, access);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mType] = " + mType + ", " + "[mMember] = " + mMember + ", " + "[mAnnotation] = "
						+ mAnnotation + ", " + "[access] = " + access + ".");
			}
			AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_5_collectcontextelements_greenBBB(match, mType,
					mAnnotation);

			// 
			AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_6_registerobjectstomatch_expressionBBBBBB(this,
					match, mType, mMember, mAnnotation, access);
			return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_7_expressionF();
		} else {
			return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TypeGraph pm = (TypeGraph) result1_bindingAndBlack[1];
		TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result1_bindingAndBlack[2];
		Type mType = (Type) result1_bindingAndBlack[3];
		TAnnotationType tAnnotation = (TAnnotationType) result1_bindingAndBlack[4];
		AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result1_bindingAndBlack[5];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[6];
		AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result1_bindingAndBlack[7];
		TypeAccess access = (TypeAccess) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_1_1_performtransformation_greenFBFFFBBBFB(pm, tAnnotation, mMember, tType,
						csp);
		TFieldSignature tSignature = (TFieldSignature) result1_green[0];
		MDefinitionToTMember memberToMember = (MDefinitionToTMember) result1_green[2];
		TFieldDefinition tMember = (TFieldDefinition) result1_green[3];
		TField tName = (TField) result1_green[4];
		ASTNodeToTAnnotatable anntotatableToTannotatable = (ASTNodeToTAnnotatable) result1_green[8];

		Object[] result2_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_1_2_collecttranslatedelements_blackBBBBBBB(tSignature, memberToMember,
						tMember, tName, mMember, anntotatableToTannotatable, access);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = " + tSignature
					+ ", " + "[memberToMember] = " + memberToMember + ", " + "[tMember] = " + tMember + ", "
					+ "[tName] = " + tName + ", " + "[mMember] = " + mMember + ", " + "[anntotatableToTannotatable] = "
					+ anntotatableToTannotatable + ", " + "[access] = " + access + ".");
		}
		Object[] result2_green = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_1_2_collecttranslatedelements_greenFBBBBBBB(tSignature, memberToMember,
						tMember, tName, mMember, anntotatableToTannotatable, access);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(ruleresult, tSignature,
						mTypeToType, pm, memberToMember, tMember, mAnnotationToAnnotation, mType, tName, tAnnotation,
						mMember, tType, mAnnotation, anntotatableToTannotatable, access);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tSignature] = " + tSignature + ", " + "[mTypeToType] = " + mTypeToType + ", " + "[pm] = "
					+ pm + ", " + "[memberToMember] = " + memberToMember + ", " + "[tMember] = " + tMember + ", "
					+ "[mAnnotationToAnnotation] = " + mAnnotationToAnnotation + ", " + "[mType] = " + mType + ", "
					+ "[tName] = " + tName + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[mMember] = " + mMember
					+ ", " + "[tType] = " + tType + ", " + "[mAnnotation] = " + mAnnotation + ", "
					+ "[anntotatableToTannotatable] = " + anntotatableToTannotatable + ", " + "[access] = " + access
					+ ".");
		}
		AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(ruleresult,
						tSignature, pm, memberToMember, tMember, mType, tName, tAnnotation, mMember, tType, mAnnotation,
						anntotatableToTannotatable, access);
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tName__pm____model = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge pm__tName____fields = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tAnnotation__tSignature____signature = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tSignature__tType____type = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge memberToMember__tMember____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tSignature__tMember____definitions = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tMember__tSignature____signature = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge memberToMember__mMember____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge mMember__access____type = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge mAnnotation__mMember____bodyDeclarations = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge anntotatableToTannotatable__tMember____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge anntotatableToTannotatable__mMember____source = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge access__mType____type = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge mType__access____usagesInTypeAccess = (EMoflonEdge) result3_green[31];

		// 
		// 
		AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_1_5_registerobjects_expressionBBBBBBBBBBBBBBBB(this,
				ruleresult, tSignature, mTypeToType, pm, memberToMember, tMember, mAnnotationToAnnotation, mType, tName,
				tAnnotation, mMember, tType, mAnnotation, anntotatableToTannotatable, access);
		return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Type mType = (Type) result2_binding[0];
		AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result2_binding[1];
		AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result2_binding[2];
		TypeAccess access = (TypeAccess) result2_binding[3];
		for (Object[] result2_black : AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_2_2_corematch_blackFFBFBFBBB(mType, mMember, mAnnotation, access,
						match)) {
			TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result2_black[0];
			TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result2_black[1];
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[3];
			TAbstractType tType = (TAbstractType) result2_black[5];
			// ForEach 
			for (Object[] result3_black : AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_2_3_findcontext_blackBFBBBBBBB(mTypeToType, mAnnotationToAnnotation,
							mType, tAnnotation, mMember, tType, mAnnotation, access)) {
				TypeGraph pm = (TypeGraph) result3_black[1];
				Object[] result3_green = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(mTypeToType, pm,
								mAnnotationToAnnotation, mType, tAnnotation, mMember, tType, mAnnotation, access);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge tAnnotation__pm____model = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge pm__tAnnotation____allTypes = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeToType__mType____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mAnnotationToAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mTypeToType__tType____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mMember__access____type = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mAnnotation__mMember____bodyDeclarations = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mAnnotationToAnnotation__mAnnotation____source = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge access__mType____type = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mType__access____usagesInTypeAccess = (EMoflonEdge) result3_green[20];

				Object[] result4_bindingAndBlack = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch,
								mTypeToType, pm, mAnnotationToAnnotation, mType, tAnnotation, mMember, tType,
								mAnnotation, access);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToType] = " + mTypeToType
							+ ", " + "[pm] = " + pm + ", " + "[mAnnotationToAnnotation] = " + mAnnotationToAnnotation
							+ ", " + "[mType] = " + mType + ", " + "[tAnnotation] = " + tAnnotation + ", "
							+ "[mMember] = " + mMember + ", " + "[tType] = " + tType + ", " + "[mAnnotation] = "
							+ mAnnotation + ", " + "[access] = " + access + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationTypeMemberImpl
							.pattern_AnnotationTypeMember_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Type mType, AnnotationTypeMemberDeclaration mMember,
			AnnotationTypeDeclaration mAnnotation, TypeAccess access) {
		match.registerObject("mType", mType);
		match.registerObject("mMember", mMember);
		match.registerObject("mAnnotation", mAnnotation);
		match.registerObject("access", access);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Type mType, AnnotationTypeMemberDeclaration mMember,
			AnnotationTypeDeclaration mAnnotation, TypeAccess access) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToType,
			TypeGraph pm, TypeToTAbstractType mAnnotationToAnnotation, Type mType, TAnnotationType tAnnotation,
			AnnotationTypeMemberDeclaration mMember, TAbstractType tType, AnnotationTypeDeclaration mAnnotation,
			TypeAccess access) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mMember_name = CSPFactoryHelper.eINSTANCE.createVariable("mMember.name", true, csp);
		var_mMember_name.setValue(mMember.getName());
		var_mMember_name.setType("String");

		// Create unbound variables
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", csp);
		var_tName_tName.setType("String");
		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.upperBound", csp);
		var_tSignature_upperBound.setType("int");

		// Create constraints
		Eq eq = new Eq();
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(upperBound);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mMember_name, var_tName_tName);
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mMember_name, var_tSignature_upperBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToType", mTypeToType);
		isApplicableMatch.registerObject("pm", pm);
		isApplicableMatch.registerObject("mAnnotationToAnnotation", mAnnotationToAnnotation);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("access", access);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToType, EObject pm,
			EObject memberToMember, EObject tMember, EObject mAnnotationToAnnotation, EObject mType, EObject tName,
			EObject tAnnotation, EObject mMember, EObject tType, EObject mAnnotation,
			EObject anntotatableToTannotatable, EObject access) {
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mTypeToType", mTypeToType);
		ruleresult.registerObject("pm", pm);
		ruleresult.registerObject("memberToMember", memberToMember);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("mAnnotationToAnnotation", mAnnotationToAnnotation);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mAnnotation", mAnnotation);
		ruleresult.registerObject("anntotatableToTannotatable", anntotatableToTannotatable);
		ruleresult.registerObject("access", access);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mMember").eClass())
						.equals("java.AnnotationTypeMemberDeclaration.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("access").eClass()).equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TFieldSignature tSignature, TypeGraph pm, TFieldDefinition tMember,
			TField tName, TAnnotationType tAnnotation, TAbstractType tType) {

		Object[] result1_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_10_1_initialbindings_blackBBBBBBBB(this, match, tSignature, pm, tMember,
						tName, tAnnotation, tType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[pm] = " + pm + ", "
					+ "[tMember] = " + tMember + ", " + "[tName] = " + tName + ", " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[tType] = " + tType + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_10_2_SolveCSP_bindingAndBlackFBBBBBBBB(this, match, tSignature, pm,
						tMember, tName, tAnnotation, tType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[pm] = " + pm + ", "
					+ "[tMember] = " + tMember + ", " + "[tName] = " + tName + ", " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[tType] = " + tType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_10_4_collectelementstobetranslated_blackBBBBBBB(match, tSignature, pm,
							tMember, tName, tAnnotation, tType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSignature] = " + tSignature + ", " + "[pm] = " + pm + ", " + "[tMember] = " + tMember
						+ ", " + "[tName] = " + tName + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tType] = "
						+ tType + ".");
			}
			AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_10_4_collectelementstobetranslated_greenBBBBBBBFFFFFFFFFF(match,
							tSignature, pm, tMember, tName, tAnnotation, tType);
			//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tName__pm____model = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge pm__tName____fields = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge tAnnotation__tSignature____signature = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge tSignature__tType____type = (EMoflonEdge) result4_green[12];
			//nothing EMoflonEdge tSignature__tMember____definitions = (EMoflonEdge) result4_green[13];
			//nothing EMoflonEdge tMember__tSignature____signature = (EMoflonEdge) result4_green[14];
			//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result4_green[15];
			//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result4_green[16];

			Object[] result5_black = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_10_5_collectcontextelements_blackBBBBBBB(match, tSignature, pm,
							tMember, tName, tAnnotation, tType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSignature] = " + tSignature + ", " + "[pm] = " + pm + ", " + "[tMember] = " + tMember
						+ ", " + "[tName] = " + tName + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tType] = "
						+ tType + ".");
			}
			AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_10_5_collectcontextelements_greenBBBBFF(match, pm,
					tAnnotation, tType);
			//nothing EMoflonEdge tAnnotation__pm____model = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge pm__tAnnotation____allTypes = (EMoflonEdge) result5_green[5];

			// 
			AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_10_6_registerobjectstomatch_expressionBBBBBBBB(this,
					match, tSignature, pm, tMember, tName, tAnnotation, tType);
			return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_10_7_expressionF();
		} else {
			return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TFieldSignature tSignature = (TFieldSignature) result1_bindingAndBlack[0];
		TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TypeGraph pm = (TypeGraph) result1_bindingAndBlack[2];
		TFieldDefinition tMember = (TFieldDefinition) result1_bindingAndBlack[3];
		TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result1_bindingAndBlack[4];
		Type mType = (Type) result1_bindingAndBlack[5];
		TField tName = (TField) result1_bindingAndBlack[6];
		TAnnotationType tAnnotation = (TAnnotationType) result1_bindingAndBlack[7];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[8];
		AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_11_1_performtransformation_greenFBBFBFFB(tMember, mType, mAnnotation,
						csp);
		MDefinitionToTMember memberToMember = (MDefinitionToTMember) result1_green[0];
		AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result1_green[3];
		ASTNodeToTAnnotatable anntotatableToTannotatable = (ASTNodeToTAnnotatable) result1_green[5];
		TypeAccess access = (TypeAccess) result1_green[6];

		Object[] result2_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_11_2_collecttranslatedelements_blackBBBBBBB(tSignature, memberToMember,
						tMember, tName, mMember, anntotatableToTannotatable, access);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = " + tSignature
					+ ", " + "[memberToMember] = " + memberToMember + ", " + "[tMember] = " + tMember + ", "
					+ "[tName] = " + tName + ", " + "[mMember] = " + mMember + ", " + "[anntotatableToTannotatable] = "
					+ anntotatableToTannotatable + ", " + "[access] = " + access + ".");
		}
		Object[] result2_green = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_11_2_collecttranslatedelements_greenFBBBBBBB(tSignature, memberToMember,
						tMember, tName, mMember, anntotatableToTannotatable, access);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(ruleresult, tSignature,
						mTypeToType, pm, memberToMember, tMember, mAnnotationToAnnotation, mType, tName, tAnnotation,
						mMember, tType, mAnnotation, anntotatableToTannotatable, access);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tSignature] = " + tSignature + ", " + "[mTypeToType] = " + mTypeToType + ", " + "[pm] = "
					+ pm + ", " + "[memberToMember] = " + memberToMember + ", " + "[tMember] = " + tMember + ", "
					+ "[mAnnotationToAnnotation] = " + mAnnotationToAnnotation + ", " + "[mType] = " + mType + ", "
					+ "[tName] = " + tName + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[mMember] = " + mMember
					+ ", " + "[tType] = " + tType + ", " + "[mAnnotation] = " + mAnnotation + ", "
					+ "[anntotatableToTannotatable] = " + anntotatableToTannotatable + ", " + "[access] = " + access
					+ ".");
		}
		AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(ruleresult,
						tSignature, pm, memberToMember, tMember, mType, tName, tAnnotation, mMember, tType, mAnnotation,
						anntotatableToTannotatable, access);
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tName__pm____model = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge pm__tName____fields = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tAnnotation__tSignature____signature = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tSignature__tType____type = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge memberToMember__tMember____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tSignature__tMember____definitions = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tMember__tSignature____signature = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge memberToMember__mMember____source = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge mMember__access____type = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge mAnnotation__mMember____bodyDeclarations = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge anntotatableToTannotatable__tMember____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge anntotatableToTannotatable__mMember____source = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge access__mType____type = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge mType__access____usagesInTypeAccess = (EMoflonEdge) result3_green[31];

		// 
		// 
		AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_11_5_registerobjects_expressionBBBBBBBBBBBBBBBB(this,
				ruleresult, tSignature, mTypeToType, pm, memberToMember, tMember, mAnnotationToAnnotation, mType, tName,
				tAnnotation, mMember, tType, mAnnotation, anntotatableToTannotatable, access);
		return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_12_2_corematch_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TFieldSignature tSignature = (TFieldSignature) result2_binding[0];
		TypeGraph pm = (TypeGraph) result2_binding[1];
		TFieldDefinition tMember = (TFieldDefinition) result2_binding[2];
		TField tName = (TField) result2_binding[3];
		TAnnotationType tAnnotation = (TAnnotationType) result2_binding[4];
		TAbstractType tType = (TAbstractType) result2_binding[5];
		for (Object[] result2_black : AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_12_2_corematch_blackBFBBFFBBBFB(tSignature, pm, tMember, tName,
						tAnnotation, tType, match)) {
			TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result2_black[1];
			TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result2_black[4];
			Type mType = (Type) result2_black[5];
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result2_black[9];
			// ForEach 
			for (Object[] result3_black : AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_12_3_findcontext_blackBBBBBBBBBB(tSignature, mTypeToType, pm, tMember,
							mAnnotationToAnnotation, mType, tName, tAnnotation, tType, mAnnotation)) {
				Object[] result3_green = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFFFF(tSignature,
								mTypeToType, pm, tMember, mAnnotationToAnnotation, mType, tName, tAnnotation, tType,
								mAnnotation);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tName__pm____model = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge pm__tName____fields = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tAnnotation__pm____model = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge pm__tAnnotation____allTypes = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mTypeToType__mType____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tAnnotation__tSignature____signature = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mAnnotationToAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tSignature__tType____type = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge tSignature__tMember____definitions = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge tMember__tSignature____signature = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge mTypeToType__tType____target = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge mAnnotationToAnnotation__mAnnotation____source = (EMoflonEdge) result3_green[26];

				Object[] result4_bindingAndBlack = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
								isApplicableMatch, tSignature, mTypeToType, pm, tMember, mAnnotationToAnnotation, mType,
								tName, tAnnotation, tType, mAnnotation);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tSignature] = " + tSignature
							+ ", " + "[mTypeToType] = " + mTypeToType + ", " + "[pm] = " + pm + ", " + "[tMember] = "
							+ tMember + ", " + "[mAnnotationToAnnotation] = " + mAnnotationToAnnotation + ", "
							+ "[mType] = " + mType + ", " + "[tName] = " + tName + ", " + "[tAnnotation] = "
							+ tAnnotation + ", " + "[tType] = " + tType + ", " + "[mAnnotation] = " + mAnnotation
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationTypeMemberImpl
							.pattern_AnnotationTypeMember_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TFieldSignature tSignature, TypeGraph pm,
			TFieldDefinition tMember, TField tName, TAnnotationType tAnnotation, TAbstractType tType) {
		match.registerObject("tSignature", tSignature);
		match.registerObject("pm", pm);
		match.registerObject("tMember", tMember);
		match.registerObject("tName", tName);
		match.registerObject("tAnnotation", tAnnotation);
		match.registerObject("tType", tType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TFieldSignature tSignature, TypeGraph pm,
			TFieldDefinition tMember, TField tName, TAnnotationType tAnnotation, TAbstractType tType) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TFieldSignature tSignature,
			TypeToTAbstractType mTypeToType, TypeGraph pm, TFieldDefinition tMember,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TField tName, TAnnotationType tAnnotation,
			TAbstractType tType, AnnotationTypeDeclaration mAnnotation) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", true, csp);
		var_tName_tName.setValue(tName.getTName());
		var_tName_tName.setType("String");
		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.upperBound", true,
				csp);
		var_tSignature_upperBound.setValue(tSignature.getUpperBound());
		var_tSignature_upperBound.setType("int");

		// Create unbound variables
		Variable var_mMember_name = CSPFactoryHelper.eINSTANCE.createVariable("mMember.name", csp);
		var_mMember_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(upperBound);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mMember_name, var_tName_tName);
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mMember_name, var_tSignature_upperBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mTypeToType", mTypeToType);
		isApplicableMatch.registerObject("pm", pm);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("mAnnotationToAnnotation", mAnnotationToAnnotation);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToType, EObject pm,
			EObject memberToMember, EObject tMember, EObject mAnnotationToAnnotation, EObject mType, EObject tName,
			EObject tAnnotation, EObject mMember, EObject tType, EObject mAnnotation,
			EObject anntotatableToTannotatable, EObject access) {
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mTypeToType", mTypeToType);
		ruleresult.registerObject("pm", pm);
		ruleresult.registerObject("memberToMember", memberToMember);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("mAnnotationToAnnotation", mAnnotationToAnnotation);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mAnnotation", mAnnotation);
		ruleresult.registerObject("anntotatableToTannotatable", anntotatableToTannotatable);
		ruleresult.registerObject("access", access);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tSignature").eClass())
						.equals("basic.TFieldSignature.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tMember").eClass())
						.equals("basic.TFieldDefinition.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tName").eClass()).equals("basic.TField.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_56(EMoflonEdge _edge_signatures) {

		Object[] result1_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_20_2_testcorematchandDECs_blackFFFFFFB(_edge_signatures)) {
			TFieldSignature tSignature = (TFieldSignature) result2_black[0];
			TypeGraph pm = (TypeGraph) result2_black[1];
			TFieldDefinition tMember = (TFieldDefinition) result2_black[2];
			TField tName = (TField) result2_black[3];
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[4];
			TAbstractType tType = (TAbstractType) result2_black[5];
			Object[] result2_green = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
							this, match, tSignature, pm, tMember, tName, tAnnotation, tType)) {
				// 
				if (AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationTypeMemberImpl
							.pattern_AnnotationTypeMember_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_58(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_21_2_testcorematchandDECs_blackFFFFB(_edge_type)) {
			Type mType = (Type) result2_black[0];
			AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result2_black[1];
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result2_black[2];
			TypeAccess access = (TypeAccess) result2_black[3];
			Object[] result2_green = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, mType, mMember, mAnnotation, access)) {
				// 
				if (AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationTypeMemberImpl
							.pattern_AnnotationTypeMember_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnnotationTypeMember");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tSignature", "lowerBound", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_mMember_name = CSPFactoryHelper.eINSTANCE.createVariable("mMember", true, csp);
		var_mMember_name.setValue(__helper.getValue("mMember", "name"));
		var_mMember_name.setType("String");

		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName", true, csp);
		var_tName_tName.setValue(__helper.getValue("tName", "tName"));
		var_tName_tName.setType("String");

		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature", true, csp);
		var_tSignature_upperBound.setValue(__helper.getValue("tSignature", "upperBound"));
		var_tSignature_upperBound.setType("int");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		UpperBound upperBound1 = new UpperBound();
		csp.getConstraints().add(upperBound1);

		eq0.setRuleName("AnnotationTypeMember");
		eq0.solve(var_mMember_name, var_tName_tName);

		upperBound1.setRuleName("AnnotationTypeMember");
		upperBound1.solve(var_mMember_name, var_tSignature_upperBound);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tName_tName.setBound(false);
			var_tSignature_upperBound.setBound(false);
			eq0.solve(var_mMember_name, var_tName_tName);
			upperBound1.solve(var_mMember_name, var_tSignature_upperBound);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tName", "tName", var_tName_tName.getValue());
				__helper.setValue("tSignature", "upperBound", var_tSignature_upperBound.getValue());
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
		ruleResult.setRule("AnnotationTypeMember");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tSignature", "lowerBound", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_mMember_name = CSPFactoryHelper.eINSTANCE.createVariable("mMember", true, csp);
		var_mMember_name.setValue(__helper.getValue("mMember", "name"));
		var_mMember_name.setType("String");

		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName", true, csp);
		var_tName_tName.setValue(__helper.getValue("tName", "tName"));
		var_tName_tName.setType("String");

		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature", true, csp);
		var_tSignature_upperBound.setValue(__helper.getValue("tSignature", "upperBound"));
		var_tSignature_upperBound.setType("int");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		UpperBound upperBound1 = new UpperBound();
		csp.getConstraints().add(upperBound1);

		eq0.setRuleName("AnnotationTypeMember");
		eq0.solve(var_mMember_name, var_tName_tName);

		upperBound1.setRuleName("AnnotationTypeMember");
		upperBound1.solve(var_mMember_name, var_tSignature_upperBound);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mMember_name.setBound(false);
			var_mMember_name.setBound(false);
			eq0.solve(var_mMember_name, var_tName_tName);
			upperBound1.solve(var_mMember_name, var_tSignature_upperBound);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mMember", "name", var_mMember_name.getValue());
				__helper.setValue("mMember", "name", var_mMember_name.getValue());
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

		Object[] result1_black = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TFieldSignature tSignature = (TFieldSignature) result2_bindingAndBlack[0];
		TypeGraph pm = (TypeGraph) result2_bindingAndBlack[1];
		TFieldDefinition tMember = (TFieldDefinition) result2_bindingAndBlack[2];
		Type mType = (Type) result2_bindingAndBlack[3];
		TField tName = (TField) result2_bindingAndBlack[4];
		TAnnotationType tAnnotation = (TAnnotationType) result2_bindingAndBlack[5];
		AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result2_bindingAndBlack[6];
		TAbstractType tType = (TAbstractType) result2_bindingAndBlack[7];
		AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result2_bindingAndBlack[8];
		TypeAccess access = (TypeAccess) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, tSignature, pm, tMember,
						mType, tName, tAnnotation, mMember, tType, mAnnotation, access, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tSignature] = " + tSignature + ", " + "[pm] = " + pm + ", " + "[tMember] = " + tMember + ", "
					+ "[mType] = " + mType + ", " + "[tName] = " + tName + ", " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[mMember] = " + mMember + ", " + "[tType] = " + tType + ", " + "[mAnnotation] = "
					+ mAnnotation + ", " + "[access] = " + access + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_24_5_matchcorrcontext_blackFFBBBBBB(mType, tAnnotation, tType,
							mAnnotation, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result5_black[0];
				TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result5_black[1];
				Object[] result5_green = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_24_5_matchcorrcontext_greenBBBBF(mTypeToType,
								mAnnotationToAnnotation, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_24_6_createcorrespondence_blackBBBBBBBBBBB(tSignature, pm,
								tMember, mType, tName, tAnnotation, mMember, tType, mAnnotation, access, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = "
							+ tSignature + ", " + "[pm] = " + pm + ", " + "[tMember] = " + tMember + ", " + "[mType] = "
							+ mType + ", " + "[tName] = " + tName + ", " + "[tAnnotation] = " + tAnnotation + ", "
							+ "[mMember] = " + mMember + ", " + "[tType] = " + tType + ", " + "[mAnnotation] = "
							+ mAnnotation + ", " + "[access] = " + access + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_24_6_createcorrespondence_greenFBBFB(tMember,
						mMember, ccMatch);
				//nothing MDefinitionToTMember memberToMember = (MDefinitionToTMember) result6_green[0];
				//nothing ASTNodeToTAnnotatable anntotatableToTannotatable = (ASTNodeToTAnnotatable) result6_green[3];

				Object[] result7_black = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TFieldSignature tSignature, TypeGraph pm, TFieldDefinition tMember, Type mType,
			TField tName, TAnnotationType tAnnotation, AnnotationTypeMemberDeclaration mMember, TAbstractType tType,
			AnnotationTypeDeclaration mAnnotation, TypeAccess access, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mMember_name = CSPFactoryHelper.eINSTANCE.createVariable("mMember.name", true, csp);
		var_mMember_name.setValue(mMember.getName());
		var_mMember_name.setType("String");
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", true, csp);
		var_tName_tName.setValue(tName.getTName());
		var_tName_tName.setType("String");
		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.upperBound", true,
				csp);
		var_tSignature_upperBound.setValue(tSignature.getUpperBound());
		var_tSignature_upperBound.setType("int");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(upperBound);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mMember_name, var_tName_tName);
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mMember_name, var_tSignature_upperBound);
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
	public boolean checkDEC_FWD(Type mType, AnnotationTypeMemberDeclaration mMember,
			AnnotationTypeDeclaration mAnnotation, TypeAccess access) {// 
		Object[] result1_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_27_1_matchtggpattern_blackBBBB(mType, mMember, mAnnotation, access);
		if (result1_black != null) {
			return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_27_2_expressionF();
		} else {
			return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TFieldSignature tSignature, TypeGraph pm, TFieldDefinition tMember, TField tName,
			TAnnotationType tAnnotation, TAbstractType tType) {// 
		Object[] result1_black = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_28_1_matchtggpattern_blackBBBBBB(
				tSignature, pm, tMember, tName, tAnnotation, tType);
		if (result1_black != null) {
			AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_28_1_matchtggpattern_greenB(tSignature);

			return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_28_2_expressionF();
		} else {
			return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mTypeToTypeParameter, TypeToTAbstractType mAnnotationToAnnotationParameter) {

		Object[] result1_black = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_29_2_isapplicablecore_blackFFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mTypeToTypeList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result2_black[1];
			Type mType = (Type) result2_black[2];
			TAbstractType tType = (TAbstractType) result2_black[3];
			//nothing RuleEntryList mAnnotationToAnnotationList = (RuleEntryList) result2_black[4];
			TypeGraph pm = (TypeGraph) result2_black[5];
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[6];
			TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result2_black[7];
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result2_black[8];

			Object[] result3_bindingAndBlack = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							mTypeToType, pm, mAnnotationToAnnotation, mType, tAnnotation, tType, mAnnotation,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToType] = " + mTypeToType + ", "
						+ "[pm] = " + pm + ", " + "[mAnnotationToAnnotation] = " + mAnnotationToAnnotation + ", "
						+ "[mType] = " + mType + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tType] = " + tType
						+ ", " + "[mAnnotation] = " + mAnnotation + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_29_5_checknacs_blackBBBBBBB(mTypeToType, pm,
								mAnnotationToAnnotation, mType, tAnnotation, tType, mAnnotation);
				if (result5_black != null) {

					Object[] result6_black = AnnotationTypeMemberImpl
							.pattern_AnnotationTypeMember_29_6_perform_blackBBBBBBBB(mTypeToType, pm,
									mAnnotationToAnnotation, mType, tAnnotation, tType, mAnnotation, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToType] = "
								+ mTypeToType + ", " + "[pm] = " + pm + ", " + "[mAnnotationToAnnotation] = "
								+ mAnnotationToAnnotation + ", " + "[mType] = " + mType + ", " + "[tAnnotation] = "
								+ tAnnotation + ", " + "[tType] = " + tType + ", " + "[mAnnotation] = " + mAnnotation
								+ ", " + "[ruleResult] = " + ruleResult + ".");
					}
					AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_29_6_perform_greenFBFFBFBFBBFFBB(pm, mType,
							tAnnotation, tType, mAnnotation, ruleResult, csp);
					//nothing TFieldSignature tSignature = (TFieldSignature) result6_green[0];
					//nothing MDefinitionToTMember memberToMember = (MDefinitionToTMember) result6_green[2];
					//nothing TFieldDefinition tMember = (TFieldDefinition) result6_green[3];
					//nothing TField tName = (TField) result6_green[5];
					//nothing AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result6_green[7];
					//nothing ASTNodeToTAnnotatable anntotatableToTannotatable = (ASTNodeToTAnnotatable) result6_green[10];
					//nothing TypeAccess access = (TypeAccess) result6_green[11];

				} else {
				}

			} else {
			}

		}
		return AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToType,
			TypeGraph pm, TypeToTAbstractType mAnnotationToAnnotation, Type mType, TAnnotationType tAnnotation,
			TAbstractType tType, AnnotationTypeDeclaration mAnnotation, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mMember_name = CSPFactoryHelper.eINSTANCE.createVariable("mMember.name", csp);
		var_mMember_name.setType("String");
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", csp);
		var_tName_tName.setType("String");
		Variable var_tSignature_upperBound = CSPFactoryHelper.eINSTANCE.createVariable("tSignature.upperBound", csp);
		var_tSignature_upperBound.setType("int");

		// Create constraints
		Eq eq = new Eq();
		UpperBound upperBound = new UpperBound();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(upperBound);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mMember_name, var_tName_tName);
		upperBound.setRuleName("NoRuleName");
		upperBound.solve(var_mMember_name, var_tSignature_upperBound);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToType", mTypeToType);
		isApplicableMatch.registerObject("pm", pm);
		isApplicableMatch.registerObject("mAnnotationToAnnotation", mAnnotationToAnnotation);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
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
			case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_FWD__MATCH_TYPE_ANNOTATIONTYPEMEMBERDECLARATION_ANNOTATIONTYPEDECLARATION_TYPEACCESS:
				return isAppropriate_FWD((Match) arguments.get(0), (Type) arguments.get(1),
						(AnnotationTypeMemberDeclaration) arguments.get(2),
						(AnnotationTypeDeclaration) arguments.get(3), (TypeAccess) arguments.get(4));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPE_ANNOTATIONTYPEMEMBERDECLARATION_ANNOTATIONTYPEDECLARATION_TYPEACCESS:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (Type) arguments.get(1),
						(AnnotationTypeMemberDeclaration) arguments.get(2),
						(AnnotationTypeDeclaration) arguments.get(3), (TypeAccess) arguments.get(4));
				return null;
			case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPE_ANNOTATIONTYPEMEMBERDECLARATION_ANNOTATIONTYPEDECLARATION_TYPEACCESS:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Type) arguments.get(1),
						(AnnotationTypeMemberDeclaration) arguments.get(2),
						(AnnotationTypeDeclaration) arguments.get(3), (TypeAccess) arguments.get(4));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TYPEGRAPH_TYPETOTABSTRACTTYPE_TYPE_TANNOTATIONTYPE_ANNOTATIONTYPEMEMBERDECLARATION_TABSTRACTTYPE_ANNOTATIONTYPEDECLARATION_TYPEACCESS:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
						(TypeToTAbstractType) arguments.get(1), (TypeGraph) arguments.get(2),
						(TypeToTAbstractType) arguments.get(3), (Type) arguments.get(4),
						(TAnnotationType) arguments.get(5), (AnnotationTypeMemberDeclaration) arguments.get(6),
						(TAbstractType) arguments.get(7), (AnnotationTypeDeclaration) arguments.get(8),
						(TypeAccess) arguments.get(9));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
						(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
						(EObject) arguments.get(14));
				return null;
			case RulesPackage.ANNOTATION_TYPE_MEMBER___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_BWD__MATCH_TFIELDSIGNATURE_TYPEGRAPH_TFIELDDEFINITION_TFIELD_TANNOTATIONTYPE_TABSTRACTTYPE:
				return isAppropriate_BWD((Match) arguments.get(0), (TFieldSignature) arguments.get(1),
						(TypeGraph) arguments.get(2), (TFieldDefinition) arguments.get(3), (TField) arguments.get(4),
						(TAnnotationType) arguments.get(5), (TAbstractType) arguments.get(6));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TFIELDSIGNATURE_TYPEGRAPH_TFIELDDEFINITION_TFIELD_TANNOTATIONTYPE_TABSTRACTTYPE:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TFieldSignature) arguments.get(1),
						(TypeGraph) arguments.get(2), (TFieldDefinition) arguments.get(3), (TField) arguments.get(4),
						(TAnnotationType) arguments.get(5), (TAbstractType) arguments.get(6));
				return null;
			case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TFIELDSIGNATURE_TYPEGRAPH_TFIELDDEFINITION_TFIELD_TANNOTATIONTYPE_TABSTRACTTYPE:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TFieldSignature) arguments.get(1),
						(TypeGraph) arguments.get(2), (TFieldDefinition) arguments.get(3), (TField) arguments.get(4),
						(TAnnotationType) arguments.get(5), (TAbstractType) arguments.get(6));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TFIELDSIGNATURE_TYPETOTABSTRACTTYPE_TYPEGRAPH_TFIELDDEFINITION_TYPETOTABSTRACTTYPE_TYPE_TFIELD_TANNOTATIONTYPE_TABSTRACTTYPE_ANNOTATIONTYPEDECLARATION:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(TFieldSignature) arguments.get(1), (TypeToTAbstractType) arguments.get(2),
						(TypeGraph) arguments.get(3), (TFieldDefinition) arguments.get(4),
						(TypeToTAbstractType) arguments.get(5), (Type) arguments.get(6), (TField) arguments.get(7),
						(TAnnotationType) arguments.get(8), (TAbstractType) arguments.get(9),
						(AnnotationTypeDeclaration) arguments.get(10));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
						(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
						(EObject) arguments.get(14));
				return null;
			case RulesPackage.ANNOTATION_TYPE_MEMBER___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_56__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_56((EMoflonEdge) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_58__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_58((EMoflonEdge) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_SOLVE_CSP_CC__TFIELDSIGNATURE_TYPEGRAPH_TFIELDDEFINITION_TYPE_TFIELD_TANNOTATIONTYPE_ANNOTATIONTYPEMEMBERDECLARATION_TABSTRACTTYPE_ANNOTATIONTYPEDECLARATION_TYPEACCESS_MATCH_MATCH:
				return isApplicable_solveCsp_CC((TFieldSignature) arguments.get(0), (TypeGraph) arguments.get(1),
						(TFieldDefinition) arguments.get(2), (Type) arguments.get(3), (TField) arguments.get(4),
						(TAnnotationType) arguments.get(5), (AnnotationTypeMemberDeclaration) arguments.get(6),
						(TAbstractType) arguments.get(7), (AnnotationTypeDeclaration) arguments.get(8),
						(TypeAccess) arguments.get(9), (Match) arguments.get(10), (Match) arguments.get(11));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___CHECK_DEC_FWD__TYPE_ANNOTATIONTYPEMEMBERDECLARATION_ANNOTATIONTYPEDECLARATION_TYPEACCESS:
				return checkDEC_FWD((Type) arguments.get(0), (AnnotationTypeMemberDeclaration) arguments.get(1),
						(AnnotationTypeDeclaration) arguments.get(2), (TypeAccess) arguments.get(3));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___CHECK_DEC_BWD__TFIELDSIGNATURE_TYPEGRAPH_TFIELDDEFINITION_TFIELD_TANNOTATIONTYPE_TABSTRACTTYPE:
				return checkDEC_BWD((TFieldSignature) arguments.get(0), (TypeGraph) arguments.get(1),
						(TFieldDefinition) arguments.get(2), (TField) arguments.get(3),
						(TAnnotationType) arguments.get(4), (TAbstractType) arguments.get(5));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_TYPETOTABSTRACTTYPE:
				return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
						(TypeToTAbstractType) arguments.get(2));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TYPEGRAPH_TYPETOTABSTRACTTYPE_TYPE_TANNOTATIONTYPE_TABSTRACTTYPE_ANNOTATIONTYPEDECLARATION_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(TypeToTAbstractType) arguments.get(1), (TypeGraph) arguments.get(2),
						(TypeToTAbstractType) arguments.get(3), (Type) arguments.get(4),
						(TAnnotationType) arguments.get(5), (TAbstractType) arguments.get(6),
						(AnnotationTypeDeclaration) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
			case RulesPackage.ANNOTATION_TYPE_MEMBER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnnotationTypeMember_0_1_initialbindings_blackBBBBBB(
			AnnotationTypeMember _this, Match match, Type mType, AnnotationTypeMemberDeclaration mMember,
			AnnotationTypeDeclaration mAnnotation, TypeAccess access) {
		if (!mAnnotation.equals(mType)) {
			return new Object[] { _this, match, mType, mMember, mAnnotation, access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_0_2_SolveCSP_bindingFBBBBBB(AnnotationTypeMember _this,
			Match match, Type mType, AnnotationTypeMemberDeclaration mMember, AnnotationTypeDeclaration mAnnotation,
			TypeAccess access) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mType, mMember, mAnnotation, access);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mType, mMember, mAnnotation, access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			AnnotationTypeMember _this, Match match, Type mType, AnnotationTypeMemberDeclaration mMember,
			AnnotationTypeDeclaration mAnnotation, TypeAccess access) {
		Object[] result_pattern_AnnotationTypeMember_0_2_SolveCSP_binding = pattern_AnnotationTypeMember_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, mType, mMember, mAnnotation, access);
		if (result_pattern_AnnotationTypeMember_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeMember_0_2_SolveCSP_black = pattern_AnnotationTypeMember_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mType, mMember, mAnnotation, access };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeMember_0_3_CheckCSP_expressionFBB(AnnotationTypeMember _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Type mType, AnnotationTypeMemberDeclaration mMember, AnnotationTypeDeclaration mAnnotation,
			TypeAccess access) {
		if (!mAnnotation.equals(mType)) {
			return new Object[] { match, mType, mMember, mAnnotation, access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_0_4_collectelementstobetranslated_greenBBBBBFFFFF(
			Match match, Type mType, AnnotationTypeMemberDeclaration mMember, AnnotationTypeDeclaration mAnnotation,
			TypeAccess access) {
		EMoflonEdge mMember__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mMember);
		match.getToBeTranslatedNodes().add(access);
		String mMember__access____type_name_prime = "type";
		String mAnnotation__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__mAnnotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String access__mType____type_name_prime = "type";
		String mType__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		mMember__access____type.setSrc(mMember);
		mMember__access____type.setTrg(access);
		match.getToBeTranslatedEdges().add(mMember__access____type);
		mAnnotation__mMember____bodyDeclarations.setSrc(mAnnotation);
		mAnnotation__mMember____bodyDeclarations.setTrg(mMember);
		match.getToBeTranslatedEdges().add(mAnnotation__mMember____bodyDeclarations);
		mMember__mAnnotation____abstractTypeDeclaration.setSrc(mMember);
		mMember__mAnnotation____abstractTypeDeclaration.setTrg(mAnnotation);
		match.getToBeTranslatedEdges().add(mMember__mAnnotation____abstractTypeDeclaration);
		access__mType____type.setSrc(access);
		access__mType____type.setTrg(mType);
		match.getToBeTranslatedEdges().add(access__mType____type);
		mType__access____usagesInTypeAccess.setSrc(mType);
		mType__access____usagesInTypeAccess.setTrg(access);
		match.getToBeTranslatedEdges().add(mType__access____usagesInTypeAccess);
		mMember__access____type.setName(mMember__access____type_name_prime);
		mAnnotation__mMember____bodyDeclarations.setName(mAnnotation__mMember____bodyDeclarations_name_prime);
		mMember__mAnnotation____abstractTypeDeclaration
				.setName(mMember__mAnnotation____abstractTypeDeclaration_name_prime);
		access__mType____type.setName(access__mType____type_name_prime);
		mType__access____usagesInTypeAccess.setName(mType__access____usagesInTypeAccess_name_prime);
		return new Object[] { match, mType, mMember, mAnnotation, access, mMember__access____type,
				mAnnotation__mMember____bodyDeclarations, mMember__mAnnotation____abstractTypeDeclaration,
				access__mType____type, mType__access____usagesInTypeAccess };
	}

	public static final Object[] pattern_AnnotationTypeMember_0_5_collectcontextelements_blackBBBBB(Match match,
			Type mType, AnnotationTypeMemberDeclaration mMember, AnnotationTypeDeclaration mAnnotation,
			TypeAccess access) {
		if (!mAnnotation.equals(mType)) {
			return new Object[] { match, mType, mMember, mAnnotation, access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_0_5_collectcontextelements_greenBBB(Match match,
			Type mType, AnnotationTypeDeclaration mAnnotation) {
		match.getContextNodes().add(mType);
		match.getContextNodes().add(mAnnotation);
		return new Object[] { match, mType, mAnnotation };
	}

	public static final void pattern_AnnotationTypeMember_0_6_registerobjectstomatch_expressionBBBBBB(
			AnnotationTypeMember _this, Match match, Type mType, AnnotationTypeMemberDeclaration mMember,
			AnnotationTypeDeclaration mAnnotation, TypeAccess access) {
		_this.registerObjectsToMatch_FWD(match, mType, mMember, mAnnotation, access);

	}

	public static final boolean pattern_AnnotationTypeMember_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeMember_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_1_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTypeToType");
		EObject _localVariable_1 = isApplicableMatch.getObject("pm");
		EObject _localVariable_2 = isApplicableMatch.getObject("mAnnotationToAnnotation");
		EObject _localVariable_3 = isApplicableMatch.getObject("mType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_5 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_6 = isApplicableMatch.getObject("tType");
		EObject _localVariable_7 = isApplicableMatch.getObject("mAnnotation");
		EObject _localVariable_8 = isApplicableMatch.getObject("access");
		EObject tmpMTypeToType = _localVariable_0;
		EObject tmpPm = _localVariable_1;
		EObject tmpMAnnotationToAnnotation = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		EObject tmpTAnnotation = _localVariable_4;
		EObject tmpMMember = _localVariable_5;
		EObject tmpTType = _localVariable_6;
		EObject tmpMAnnotation = _localVariable_7;
		EObject tmpAccess = _localVariable_8;
		if (tmpMTypeToType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mTypeToType = (TypeToTAbstractType) tmpMTypeToType;
			if (tmpPm instanceof TypeGraph) {
				TypeGraph pm = (TypeGraph) tmpPm;
				if (tmpMAnnotationToAnnotation instanceof TypeToTAbstractType) {
					TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) tmpMAnnotationToAnnotation;
					if (tmpMType instanceof Type) {
						Type mType = (Type) tmpMType;
						if (tmpTAnnotation instanceof TAnnotationType) {
							TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
							if (tmpMMember instanceof AnnotationTypeMemberDeclaration) {
								AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) tmpMMember;
								if (tmpTType instanceof TAbstractType) {
									TAbstractType tType = (TAbstractType) tmpTType;
									if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
										AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
										if (tmpAccess instanceof TypeAccess) {
											TypeAccess access = (TypeAccess) tmpAccess;
											return new Object[] { mTypeToType, pm, mAnnotationToAnnotation, mType,
													tAnnotation, mMember, tType, mAnnotation, access,
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

	public static final Object[] pattern_AnnotationTypeMember_1_1_performtransformation_blackBBBBBBBBBFBB(
			TypeToTAbstractType mTypeToType, TypeGraph pm, TypeToTAbstractType mAnnotationToAnnotation, Type mType,
			TAnnotationType tAnnotation, AnnotationTypeMemberDeclaration mMember, TAbstractType tType,
			AnnotationTypeDeclaration mAnnotation, TypeAccess access, AnnotationTypeMember _this,
			IsApplicableMatch isApplicableMatch) {
		if (!mAnnotationToAnnotation.equals(mTypeToType)) {
			if (!tAnnotation.equals(tType)) {
				if (!mAnnotation.equals(mType)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { mTypeToType, pm, mAnnotationToAnnotation, mType, tAnnotation, mMember,
									tType, mAnnotation, access, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationTypeMember_1_1_performtransformation_binding = pattern_AnnotationTypeMember_1_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationTypeMember_1_1_performtransformation_binding != null) {
			TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[0];
			TypeGraph pm = (TypeGraph) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[1];
			TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[2];
			Type mType = (Type) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[3];
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[4];
			AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[5];
			TAbstractType tType = (TAbstractType) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[6];
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[7];
			TypeAccess access = (TypeAccess) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[8];

			Object[] result_pattern_AnnotationTypeMember_1_1_performtransformation_black = pattern_AnnotationTypeMember_1_1_performtransformation_blackBBBBBBBBBFBB(
					mTypeToType, pm, mAnnotationToAnnotation, mType, tAnnotation, mMember, tType, mAnnotation, access,
					_this, isApplicableMatch);
			if (result_pattern_AnnotationTypeMember_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationTypeMember_1_1_performtransformation_black[9];

				return new Object[] { mTypeToType, pm, mAnnotationToAnnotation, mType, tAnnotation, mMember, tType,
						mAnnotation, access, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_1_1_performtransformation_greenFBFFFBBBFB(TypeGraph pm,
			TAnnotationType tAnnotation, AnnotationTypeMemberDeclaration mMember, TAbstractType tType, CSP csp) {
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		MDefinitionToTMember memberToMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TFieldDefinition tMember = BasicFactory.eINSTANCE.createTFieldDefinition();
		TField tName = BasicFactory.eINSTANCE.createTField();
		ASTNodeToTAnnotatable anntotatableToTannotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tSignature", "upperBound");
		Object _localVariable_1 = csp.getValue("tName", "tName");
		tAnnotation.getSignature().add(tSignature);
		tSignature.setType(tType);
		memberToMember.setSource(mMember);
		memberToMember.setTarget(tMember);
		tSignature.getDefinitions().add(tMember);
		tAnnotation.getDefines().add(tMember);
		tName.getSignatures().add(tSignature);
		tName.setModel(pm);
		anntotatableToTannotatable.setTarget(tMember);
		anntotatableToTannotatable.setSource(mMember);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		int tSignature_upperBound_prime = (int) _localVariable_0;
		String tName_tName_prime = (String) _localVariable_1;
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		tName.setTName(tName_tName_prime);
		return new Object[] { tSignature, pm, memberToMember, tMember, tName, tAnnotation, mMember, tType,
				anntotatableToTannotatable, csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_1_2_collecttranslatedelements_blackBBBBBBB(
			TFieldSignature tSignature, MDefinitionToTMember memberToMember, TFieldDefinition tMember, TField tName,
			AnnotationTypeMemberDeclaration mMember, ASTNodeToTAnnotatable anntotatableToTannotatable,
			TypeAccess access) {
		return new Object[] { tSignature, memberToMember, tMember, tName, mMember, anntotatableToTannotatable, access };
	}

	public static final Object[] pattern_AnnotationTypeMember_1_2_collecttranslatedelements_greenFBBBBBBB(
			TFieldSignature tSignature, MDefinitionToTMember memberToMember, TFieldDefinition tMember, TField tName,
			AnnotationTypeMemberDeclaration mMember, ASTNodeToTAnnotatable anntotatableToTannotatable,
			TypeAccess access) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(memberToMember);
		ruleresult.getCreatedElements().add(tMember);
		ruleresult.getCreatedElements().add(tName);
		ruleresult.getTranslatedElements().add(mMember);
		ruleresult.getCreatedLinkElements().add(anntotatableToTannotatable);
		ruleresult.getTranslatedElements().add(access);
		return new Object[] { ruleresult, tSignature, memberToMember, tMember, tName, mMember,
				anntotatableToTannotatable, access };
	}

	public static final Object[] pattern_AnnotationTypeMember_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToType, EObject pm, EObject memberToMember,
			EObject tMember, EObject mAnnotationToAnnotation, EObject mType, EObject tName, EObject tAnnotation,
			EObject mMember, EObject tType, EObject mAnnotation, EObject anntotatableToTannotatable, EObject access) {
		if (!tSignature.equals(tType)) {
			if (!mTypeToType.equals(tSignature)) {
				if (!mTypeToType.equals(pm)) {
					if (!mTypeToType.equals(memberToMember)) {
						if (!mTypeToType.equals(tMember)) {
							if (!mTypeToType.equals(tName)) {
								if (!mTypeToType.equals(tAnnotation)) {
									if (!mTypeToType.equals(tType)) {
										if (!pm.equals(tSignature)) {
											if (!pm.equals(tMember)) {
												if (!pm.equals(tName)) {
													if (!pm.equals(tAnnotation)) {
														if (!pm.equals(tType)) {
															if (!memberToMember.equals(tSignature)) {
																if (!memberToMember.equals(pm)) {
																	if (!memberToMember.equals(tMember)) {
																		if (!memberToMember.equals(tName)) {
																			if (!memberToMember.equals(tAnnotation)) {
																				if (!memberToMember.equals(tType)) {
																					if (!tMember.equals(tSignature)) {
																						if (!tMember.equals(tName)) {
																							if (!tMember
																									.equals(tType)) {
																								if (!mAnnotationToAnnotation
																										.equals(tSignature)) {
																									if (!mAnnotationToAnnotation
																											.equals(mTypeToType)) {
																										if (!mAnnotationToAnnotation
																												.equals(pm)) {
																											if (!mAnnotationToAnnotation
																													.equals(memberToMember)) {
																												if (!mAnnotationToAnnotation
																														.equals(tMember)) {
																													if (!mAnnotationToAnnotation
																															.equals(mType)) {
																														if (!mAnnotationToAnnotation
																																.equals(tName)) {
																															if (!mAnnotationToAnnotation
																																	.equals(tAnnotation)) {
																																if (!mAnnotationToAnnotation
																																		.equals(mMember)) {
																																	if (!mAnnotationToAnnotation
																																			.equals(tType)) {
																																		if (!mType
																																				.equals(tSignature)) {
																																			if (!mType
																																					.equals(mTypeToType)) {
																																				if (!mType
																																						.equals(pm)) {
																																					if (!mType
																																							.equals(memberToMember)) {
																																						if (!mType
																																								.equals(tMember)) {
																																							if (!mType
																																									.equals(tName)) {
																																								if (!mType
																																										.equals(tAnnotation)) {
																																									if (!mType
																																											.equals(tType)) {
																																										if (!tName
																																												.equals(tSignature)) {
																																											if (!tName
																																													.equals(tType)) {
																																												if (!tAnnotation
																																														.equals(tSignature)) {
																																													if (!tAnnotation
																																															.equals(tMember)) {
																																														if (!tAnnotation
																																																.equals(tName)) {
																																															if (!tAnnotation
																																																	.equals(tType)) {
																																																if (!mMember
																																																		.equals(tSignature)) {
																																																	if (!mMember
																																																			.equals(mTypeToType)) {
																																																		if (!mMember
																																																				.equals(pm)) {
																																																			if (!mMember
																																																					.equals(memberToMember)) {
																																																				if (!mMember
																																																						.equals(tMember)) {
																																																					if (!mMember
																																																							.equals(mType)) {
																																																						if (!mMember
																																																								.equals(tName)) {
																																																							if (!mMember
																																																									.equals(tAnnotation)) {
																																																								if (!mMember
																																																										.equals(tType)) {
																																																									if (!mAnnotation
																																																											.equals(tSignature)) {
																																																										if (!mAnnotation
																																																												.equals(mTypeToType)) {
																																																											if (!mAnnotation
																																																													.equals(pm)) {
																																																												if (!mAnnotation
																																																														.equals(memberToMember)) {
																																																													if (!mAnnotation
																																																															.equals(tMember)) {
																																																														if (!mAnnotation
																																																																.equals(mAnnotationToAnnotation)) {
																																																															if (!mAnnotation
																																																																	.equals(mType)) {
																																																																if (!mAnnotation
																																																																		.equals(tName)) {
																																																																	if (!mAnnotation
																																																																			.equals(tAnnotation)) {
																																																																		if (!mAnnotation
																																																																				.equals(mMember)) {
																																																																			if (!mAnnotation
																																																																					.equals(tType)) {
																																																																				if (!anntotatableToTannotatable
																																																																						.equals(tSignature)) {
																																																																					if (!anntotatableToTannotatable
																																																																							.equals(mTypeToType)) {
																																																																						if (!anntotatableToTannotatable
																																																																								.equals(pm)) {
																																																																							if (!anntotatableToTannotatable
																																																																									.equals(memberToMember)) {
																																																																								if (!anntotatableToTannotatable
																																																																										.equals(tMember)) {
																																																																									if (!anntotatableToTannotatable
																																																																											.equals(mAnnotationToAnnotation)) {
																																																																										if (!anntotatableToTannotatable
																																																																												.equals(mType)) {
																																																																											if (!anntotatableToTannotatable
																																																																													.equals(tName)) {
																																																																												if (!anntotatableToTannotatable
																																																																														.equals(tAnnotation)) {
																																																																													if (!anntotatableToTannotatable
																																																																															.equals(mMember)) {
																																																																														if (!anntotatableToTannotatable
																																																																																.equals(tType)) {
																																																																															if (!anntotatableToTannotatable
																																																																																	.equals(mAnnotation)) {
																																																																																if (!access
																																																																																		.equals(tSignature)) {
																																																																																	if (!access
																																																																																			.equals(mTypeToType)) {
																																																																																		if (!access
																																																																																				.equals(pm)) {
																																																																																			if (!access
																																																																																					.equals(memberToMember)) {
																																																																																				if (!access
																																																																																						.equals(tMember)) {
																																																																																					if (!access
																																																																																							.equals(mAnnotationToAnnotation)) {
																																																																																						if (!access
																																																																																								.equals(mType)) {
																																																																																							if (!access
																																																																																									.equals(tName)) {
																																																																																								if (!access
																																																																																										.equals(tAnnotation)) {
																																																																																									if (!access
																																																																																											.equals(mMember)) {
																																																																																										if (!access
																																																																																												.equals(tType)) {
																																																																																											if (!access
																																																																																													.equals(mAnnotation)) {
																																																																																												if (!access
																																																																																														.equals(anntotatableToTannotatable)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															tSignature,
																																																																																															mTypeToType,
																																																																																															pm,
																																																																																															memberToMember,
																																																																																															tMember,
																																																																																															mAnnotationToAnnotation,
																																																																																															mType,
																																																																																															tName,
																																																																																															tAnnotation,
																																																																																															mMember,
																																																																																															tType,
																																																																																															mAnnotation,
																																																																																															anntotatableToTannotatable,
																																																																																															access };
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeMember_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tSignature, EObject pm, EObject memberToMember, EObject tMember,
			EObject mType, EObject tName, EObject tAnnotation, EObject mMember, EObject tType, EObject mAnnotation,
			EObject anntotatableToTannotatable, EObject access) {
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge memberToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tMember____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge memberToMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge anntotatableToTannotatable__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge anntotatableToTannotatable__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeMember";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____field_name_prime = "field";
		String tName__pm____model_name_prime = "model";
		String pm__tName____fields_name_prime = "fields";
		String tAnnotation__tSignature____signature_name_prime = "signature";
		String tSignature__tType____type_name_prime = "type";
		String memberToMember__tMember____target_name_prime = "target";
		String tSignature__tMember____definitions_name_prime = "definitions";
		String tMember__tSignature____signature_name_prime = "signature";
		String memberToMember__mMember____source_name_prime = "source";
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		String mMember__access____type_name_prime = "type";
		String mAnnotation__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__mAnnotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String anntotatableToTannotatable__tMember____target_name_prime = "target";
		String anntotatableToTannotatable__mMember____source_name_prime = "source";
		String access__mType____type_name_prime = "type";
		String mType__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		ruleresult.getCreatedEdges().add(tSignature__tName____field);
		tName__pm____model.setSrc(tName);
		tName__pm____model.setTrg(pm);
		ruleresult.getCreatedEdges().add(tName__pm____model);
		pm__tName____fields.setSrc(pm);
		pm__tName____fields.setTrg(tName);
		ruleresult.getCreatedEdges().add(pm__tName____fields);
		tAnnotation__tSignature____signature.setSrc(tAnnotation);
		tAnnotation__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tAnnotation__tSignature____signature);
		tSignature__tType____type.setSrc(tSignature);
		tSignature__tType____type.setTrg(tType);
		ruleresult.getCreatedEdges().add(tSignature__tType____type);
		memberToMember__tMember____target.setSrc(memberToMember);
		memberToMember__tMember____target.setTrg(tMember);
		ruleresult.getCreatedEdges().add(memberToMember__tMember____target);
		tSignature__tMember____definitions.setSrc(tSignature);
		tSignature__tMember____definitions.setTrg(tMember);
		ruleresult.getCreatedEdges().add(tSignature__tMember____definitions);
		tMember__tSignature____signature.setSrc(tMember);
		tMember__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tMember__tSignature____signature);
		memberToMember__mMember____source.setSrc(memberToMember);
		memberToMember__mMember____source.setTrg(mMember);
		ruleresult.getCreatedEdges().add(memberToMember__mMember____source);
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		ruleresult.getCreatedEdges().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(tMember__tAnnotation____definedBy);
		mMember__access____type.setSrc(mMember);
		mMember__access____type.setTrg(access);
		ruleresult.getTranslatedEdges().add(mMember__access____type);
		mAnnotation__mMember____bodyDeclarations.setSrc(mAnnotation);
		mAnnotation__mMember____bodyDeclarations.setTrg(mMember);
		ruleresult.getTranslatedEdges().add(mAnnotation__mMember____bodyDeclarations);
		mMember__mAnnotation____abstractTypeDeclaration.setSrc(mMember);
		mMember__mAnnotation____abstractTypeDeclaration.setTrg(mAnnotation);
		ruleresult.getTranslatedEdges().add(mMember__mAnnotation____abstractTypeDeclaration);
		anntotatableToTannotatable__tMember____target.setSrc(anntotatableToTannotatable);
		anntotatableToTannotatable__tMember____target.setTrg(tMember);
		ruleresult.getCreatedEdges().add(anntotatableToTannotatable__tMember____target);
		anntotatableToTannotatable__mMember____source.setSrc(anntotatableToTannotatable);
		anntotatableToTannotatable__mMember____source.setTrg(mMember);
		ruleresult.getCreatedEdges().add(anntotatableToTannotatable__mMember____source);
		access__mType____type.setSrc(access);
		access__mType____type.setTrg(mType);
		ruleresult.getTranslatedEdges().add(access__mType____type);
		mType__access____usagesInTypeAccess.setSrc(mType);
		mType__access____usagesInTypeAccess.setTrg(access);
		ruleresult.getTranslatedEdges().add(mType__access____usagesInTypeAccess);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__pm____model.setName(tName__pm____model_name_prime);
		pm__tName____fields.setName(pm__tName____fields_name_prime);
		tAnnotation__tSignature____signature.setName(tAnnotation__tSignature____signature_name_prime);
		tSignature__tType____type.setName(tSignature__tType____type_name_prime);
		memberToMember__tMember____target.setName(memberToMember__tMember____target_name_prime);
		tSignature__tMember____definitions.setName(tSignature__tMember____definitions_name_prime);
		tMember__tSignature____signature.setName(tMember__tSignature____signature_name_prime);
		memberToMember__mMember____source.setName(memberToMember__mMember____source_name_prime);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		mMember__access____type.setName(mMember__access____type_name_prime);
		mAnnotation__mMember____bodyDeclarations.setName(mAnnotation__mMember____bodyDeclarations_name_prime);
		mMember__mAnnotation____abstractTypeDeclaration
				.setName(mMember__mAnnotation____abstractTypeDeclaration_name_prime);
		anntotatableToTannotatable__tMember____target.setName(anntotatableToTannotatable__tMember____target_name_prime);
		anntotatableToTannotatable__mMember____source.setName(anntotatableToTannotatable__mMember____source_name_prime);
		access__mType____type.setName(access__mType____type_name_prime);
		mType__access____usagesInTypeAccess.setName(mType__access____usagesInTypeAccess_name_prime);
		return new Object[] { ruleresult, tSignature, pm, memberToMember, tMember, mType, tName, tAnnotation, mMember,
				tType, mAnnotation, anntotatableToTannotatable, access, tName__tSignature____signatures,
				tSignature__tName____field, tName__pm____model, pm__tName____fields,
				tAnnotation__tSignature____signature, tSignature__tType____type, memberToMember__tMember____target,
				tSignature__tMember____definitions, tMember__tSignature____signature, memberToMember__mMember____source,
				tAnnotation__tMember____defines, tMember__tAnnotation____definedBy, mMember__access____type,
				mAnnotation__mMember____bodyDeclarations, mMember__mAnnotation____abstractTypeDeclaration,
				anntotatableToTannotatable__tMember____target, anntotatableToTannotatable__mMember____source,
				access__mType____type, mType__access____usagesInTypeAccess };
	}

	public static final void pattern_AnnotationTypeMember_1_5_registerobjects_expressionBBBBBBBBBBBBBBBB(
			AnnotationTypeMember _this, PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToType,
			EObject pm, EObject memberToMember, EObject tMember, EObject mAnnotationToAnnotation, EObject mType,
			EObject tName, EObject tAnnotation, EObject mMember, EObject tType, EObject mAnnotation,
			EObject anntotatableToTannotatable, EObject access) {
		_this.registerObjects_FWD(ruleresult, tSignature, mTypeToType, pm, memberToMember, tMember,
				mAnnotationToAnnotation, mType, tName, tAnnotation, mMember, tType, mAnnotation,
				anntotatableToTannotatable, access);

	}

	public static final PerformRuleResult pattern_AnnotationTypeMember_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_2_1_preparereturnvalue_bindingFB(
			AnnotationTypeMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationTypeMember _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationTypeMember _this) {
		Object[] result_pattern_AnnotationTypeMember_2_1_preparereturnvalue_binding = pattern_AnnotationTypeMember_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeMember_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationTypeMember_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeMember_2_1_preparereturnvalue_black = pattern_AnnotationTypeMember_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationTypeMember_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationTypeMember_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationTypeMember";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationTypeMember_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mType");
		EObject _localVariable_1 = match.getObject("mMember");
		EObject _localVariable_2 = match.getObject("mAnnotation");
		EObject _localVariable_3 = match.getObject("access");
		EObject tmpMType = _localVariable_0;
		EObject tmpMMember = _localVariable_1;
		EObject tmpMAnnotation = _localVariable_2;
		EObject tmpAccess = _localVariable_3;
		if (tmpMType instanceof Type) {
			Type mType = (Type) tmpMType;
			if (tmpMMember instanceof AnnotationTypeMemberDeclaration) {
				AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) tmpMMember;
				if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
					AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
					if (tmpAccess instanceof TypeAccess) {
						TypeAccess access = (TypeAccess) tmpAccess;
						return new Object[] { mType, mMember, mAnnotation, access, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_2_2_corematch_blackFFBFBFBBB(Type mType,
			AnnotationTypeMemberDeclaration mMember, AnnotationTypeDeclaration mAnnotation, TypeAccess access,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mAnnotation.equals(mType)) {
			for (TypeToTAbstractType mTypeToType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
				TAbstractType tType = mTypeToType.getTarget();
				if (tType != null) {
					for (TypeToTAbstractType mAnnotationToAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mAnnotation, TypeToTAbstractType.class, "source")) {
						if (!mAnnotationToAnnotation.equals(mTypeToType)) {
							TAbstractType tmpTAnnotation = mAnnotationToAnnotation.getTarget();
							if (tmpTAnnotation instanceof TAnnotationType) {
								TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
								if (!tAnnotation.equals(tType)) {
									_result.add(new Object[] { mTypeToType, mAnnotationToAnnotation, mType, tAnnotation,
											mMember, tType, mAnnotation, access, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_2_3_findcontext_blackBFBBBBBBB(
			TypeToTAbstractType mTypeToType, TypeToTAbstractType mAnnotationToAnnotation, Type mType,
			TAnnotationType tAnnotation, AnnotationTypeMemberDeclaration mMember, TAbstractType tType,
			AnnotationTypeDeclaration mAnnotation, TypeAccess access) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mAnnotationToAnnotation.equals(mTypeToType)) {
			if (!tAnnotation.equals(tType)) {
				if (!mAnnotation.equals(mType)) {
					if (mType.equals(mTypeToType.getSource())) {
						if (tAnnotation.equals(mAnnotationToAnnotation.getTarget())) {
							if (tType.equals(mTypeToType.getTarget())) {
								if (access.equals(mMember.getType())) {
									if (mAnnotation.getBodyDeclarations().contains(mMember)) {
										if (mAnnotation.equals(mAnnotationToAnnotation.getSource())) {
											if (mType.equals(access.getType())) {
												TypeGraph pm = tAnnotation.getModel();
												if (pm != null) {
													_result.add(new Object[] { mTypeToType, pm, mAnnotationToAnnotation,
															mType, tAnnotation, mMember, tType, mAnnotation, access });
												}

											}
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

	public static final Object[] pattern_AnnotationTypeMember_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(
			TypeToTAbstractType mTypeToType, TypeGraph pm, TypeToTAbstractType mAnnotationToAnnotation, Type mType,
			TAnnotationType tAnnotation, AnnotationTypeMemberDeclaration mMember, TAbstractType tType,
			AnnotationTypeDeclaration mAnnotation, TypeAccess access) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tAnnotation__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tAnnotation____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationToAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationToAnnotation__mAnnotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tAnnotation__pm____model_name_prime = "model";
		String pm__tAnnotation____allTypes_name_prime = "allTypes";
		String mTypeToType__mType____source_name_prime = "source";
		String mAnnotationToAnnotation__tAnnotation____target_name_prime = "target";
		String mTypeToType__tType____target_name_prime = "target";
		String mMember__access____type_name_prime = "type";
		String mAnnotation__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__mAnnotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mAnnotationToAnnotation__mAnnotation____source_name_prime = "source";
		String access__mType____type_name_prime = "type";
		String mType__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		isApplicableMatch.getAllContextElements().add(mTypeToType);
		isApplicableMatch.getAllContextElements().add(pm);
		isApplicableMatch.getAllContextElements().add(mAnnotationToAnnotation);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mAnnotation);
		isApplicableMatch.getAllContextElements().add(access);
		tAnnotation__pm____model.setSrc(tAnnotation);
		tAnnotation__pm____model.setTrg(pm);
		isApplicableMatch.getAllContextElements().add(tAnnotation__pm____model);
		pm__tAnnotation____allTypes.setSrc(pm);
		pm__tAnnotation____allTypes.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(pm__tAnnotation____allTypes);
		mTypeToType__mType____source.setSrc(mTypeToType);
		mTypeToType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToType__mType____source);
		mAnnotationToAnnotation__tAnnotation____target.setSrc(mAnnotationToAnnotation);
		mAnnotationToAnnotation__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotationToAnnotation__tAnnotation____target);
		mTypeToType__tType____target.setSrc(mTypeToType);
		mTypeToType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToType__tType____target);
		mMember__access____type.setSrc(mMember);
		mMember__access____type.setTrg(access);
		isApplicableMatch.getAllContextElements().add(mMember__access____type);
		mAnnotation__mMember____bodyDeclarations.setSrc(mAnnotation);
		mAnnotation__mMember____bodyDeclarations.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mAnnotation__mMember____bodyDeclarations);
		mMember__mAnnotation____abstractTypeDeclaration.setSrc(mMember);
		mMember__mAnnotation____abstractTypeDeclaration.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mMember__mAnnotation____abstractTypeDeclaration);
		mAnnotationToAnnotation__mAnnotation____source.setSrc(mAnnotationToAnnotation);
		mAnnotationToAnnotation__mAnnotation____source.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotationToAnnotation__mAnnotation____source);
		access__mType____type.setSrc(access);
		access__mType____type.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(access__mType____type);
		mType__access____usagesInTypeAccess.setSrc(mType);
		mType__access____usagesInTypeAccess.setTrg(access);
		isApplicableMatch.getAllContextElements().add(mType__access____usagesInTypeAccess);
		tAnnotation__pm____model.setName(tAnnotation__pm____model_name_prime);
		pm__tAnnotation____allTypes.setName(pm__tAnnotation____allTypes_name_prime);
		mTypeToType__mType____source.setName(mTypeToType__mType____source_name_prime);
		mAnnotationToAnnotation__tAnnotation____target
				.setName(mAnnotationToAnnotation__tAnnotation____target_name_prime);
		mTypeToType__tType____target.setName(mTypeToType__tType____target_name_prime);
		mMember__access____type.setName(mMember__access____type_name_prime);
		mAnnotation__mMember____bodyDeclarations.setName(mAnnotation__mMember____bodyDeclarations_name_prime);
		mMember__mAnnotation____abstractTypeDeclaration
				.setName(mMember__mAnnotation____abstractTypeDeclaration_name_prime);
		mAnnotationToAnnotation__mAnnotation____source
				.setName(mAnnotationToAnnotation__mAnnotation____source_name_prime);
		access__mType____type.setName(access__mType____type_name_prime);
		mType__access____usagesInTypeAccess.setName(mType__access____usagesInTypeAccess_name_prime);
		return new Object[] { mTypeToType, pm, mAnnotationToAnnotation, mType, tAnnotation, mMember, tType, mAnnotation,
				access, isApplicableMatch, tAnnotation__pm____model, pm__tAnnotation____allTypes,
				mTypeToType__mType____source, mAnnotationToAnnotation__tAnnotation____target,
				mTypeToType__tType____target, mMember__access____type, mAnnotation__mMember____bodyDeclarations,
				mMember__mAnnotation____abstractTypeDeclaration, mAnnotationToAnnotation__mAnnotation____source,
				access__mType____type, mType__access____usagesInTypeAccess };
	}

	public static final Object[] pattern_AnnotationTypeMember_2_4_solveCSP_bindingFBBBBBBBBBBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToType,
			TypeGraph pm, TypeToTAbstractType mAnnotationToAnnotation, Type mType, TAnnotationType tAnnotation,
			AnnotationTypeMemberDeclaration mMember, TAbstractType tType, AnnotationTypeDeclaration mAnnotation,
			TypeAccess access) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mTypeToType, pm,
				mAnnotationToAnnotation, mType, tAnnotation, mMember, tType, mAnnotation, access);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToType, pm, mAnnotationToAnnotation, mType,
					tAnnotation, mMember, tType, mAnnotation, access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToType,
			TypeGraph pm, TypeToTAbstractType mAnnotationToAnnotation, Type mType, TAnnotationType tAnnotation,
			AnnotationTypeMemberDeclaration mMember, TAbstractType tType, AnnotationTypeDeclaration mAnnotation,
			TypeAccess access) {
		Object[] result_pattern_AnnotationTypeMember_2_4_solveCSP_binding = pattern_AnnotationTypeMember_2_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, mTypeToType, pm, mAnnotationToAnnotation, mType, tAnnotation, mMember, tType,
				mAnnotation, access);
		if (result_pattern_AnnotationTypeMember_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeMember_2_4_solveCSP_black = pattern_AnnotationTypeMember_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToType, pm, mAnnotationToAnnotation, mType,
						tAnnotation, mMember, tType, mAnnotation, access };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeMember_2_5_checkCSP_expressionFBB(AnnotationTypeMember _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationTypeMember_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationTypeMember";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeMember_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_10_1_initialbindings_blackBBBBBBBB(
			AnnotationTypeMember _this, Match match, TFieldSignature tSignature, TypeGraph pm, TFieldDefinition tMember,
			TField tName, TAnnotationType tAnnotation, TAbstractType tType) {
		if (!tAnnotation.equals(tType)) {
			return new Object[] { _this, match, tSignature, pm, tMember, tName, tAnnotation, tType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_10_2_SolveCSP_bindingFBBBBBBBB(AnnotationTypeMember _this,
			Match match, TFieldSignature tSignature, TypeGraph pm, TFieldDefinition tMember, TField tName,
			TAnnotationType tAnnotation, TAbstractType tType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tSignature, pm, tMember, tName, tAnnotation,
				tType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tSignature, pm, tMember, tName, tAnnotation, tType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_10_2_SolveCSP_bindingAndBlackFBBBBBBBB(
			AnnotationTypeMember _this, Match match, TFieldSignature tSignature, TypeGraph pm, TFieldDefinition tMember,
			TField tName, TAnnotationType tAnnotation, TAbstractType tType) {
		Object[] result_pattern_AnnotationTypeMember_10_2_SolveCSP_binding = pattern_AnnotationTypeMember_10_2_SolveCSP_bindingFBBBBBBBB(
				_this, match, tSignature, pm, tMember, tName, tAnnotation, tType);
		if (result_pattern_AnnotationTypeMember_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeMember_10_2_SolveCSP_black = pattern_AnnotationTypeMember_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tSignature, pm, tMember, tName, tAnnotation, tType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeMember_10_3_CheckCSP_expressionFBB(AnnotationTypeMember _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_10_4_collectelementstobetranslated_blackBBBBBBB(
			Match match, TFieldSignature tSignature, TypeGraph pm, TFieldDefinition tMember, TField tName,
			TAnnotationType tAnnotation, TAbstractType tType) {
		if (!tAnnotation.equals(tType)) {
			return new Object[] { match, tSignature, pm, tMember, tName, tAnnotation, tType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_10_4_collectelementstobetranslated_greenBBBBBBBFFFFFFFFFF(
			Match match, TFieldSignature tSignature, TypeGraph pm, TFieldDefinition tMember, TField tName,
			TAnnotationType tAnnotation, TAbstractType tType) {
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tMember____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSignature);
		match.getToBeTranslatedNodes().add(tMember);
		match.getToBeTranslatedNodes().add(tName);
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____field_name_prime = "field";
		String tName__pm____model_name_prime = "model";
		String pm__tName____fields_name_prime = "fields";
		String tAnnotation__tSignature____signature_name_prime = "signature";
		String tSignature__tType____type_name_prime = "type";
		String tSignature__tMember____definitions_name_prime = "definitions";
		String tMember__tSignature____signature_name_prime = "signature";
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		match.getToBeTranslatedEdges().add(tSignature__tName____field);
		tName__pm____model.setSrc(tName);
		tName__pm____model.setTrg(pm);
		match.getToBeTranslatedEdges().add(tName__pm____model);
		pm__tName____fields.setSrc(pm);
		pm__tName____fields.setTrg(tName);
		match.getToBeTranslatedEdges().add(pm__tName____fields);
		tAnnotation__tSignature____signature.setSrc(tAnnotation);
		tAnnotation__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tAnnotation__tSignature____signature);
		tSignature__tType____type.setSrc(tSignature);
		tSignature__tType____type.setTrg(tType);
		match.getToBeTranslatedEdges().add(tSignature__tType____type);
		tSignature__tMember____definitions.setSrc(tSignature);
		tSignature__tMember____definitions.setTrg(tMember);
		match.getToBeTranslatedEdges().add(tSignature__tMember____definitions);
		tMember__tSignature____signature.setSrc(tMember);
		tMember__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tMember__tSignature____signature);
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		match.getToBeTranslatedEdges().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		match.getToBeTranslatedEdges().add(tMember__tAnnotation____definedBy);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__pm____model.setName(tName__pm____model_name_prime);
		pm__tName____fields.setName(pm__tName____fields_name_prime);
		tAnnotation__tSignature____signature.setName(tAnnotation__tSignature____signature_name_prime);
		tSignature__tType____type.setName(tSignature__tType____type_name_prime);
		tSignature__tMember____definitions.setName(tSignature__tMember____definitions_name_prime);
		tMember__tSignature____signature.setName(tMember__tSignature____signature_name_prime);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		return new Object[] { match, tSignature, pm, tMember, tName, tAnnotation, tType,
				tName__tSignature____signatures, tSignature__tName____field, tName__pm____model, pm__tName____fields,
				tAnnotation__tSignature____signature, tSignature__tType____type, tSignature__tMember____definitions,
				tMember__tSignature____signature, tAnnotation__tMember____defines, tMember__tAnnotation____definedBy };
	}

	public static final Object[] pattern_AnnotationTypeMember_10_5_collectcontextelements_blackBBBBBBB(Match match,
			TFieldSignature tSignature, TypeGraph pm, TFieldDefinition tMember, TField tName,
			TAnnotationType tAnnotation, TAbstractType tType) {
		if (!tAnnotation.equals(tType)) {
			return new Object[] { match, tSignature, pm, tMember, tName, tAnnotation, tType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_10_5_collectcontextelements_greenBBBBFF(Match match,
			TypeGraph pm, TAnnotationType tAnnotation, TAbstractType tType) {
		EMoflonEdge tAnnotation__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tAnnotation____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(pm);
		match.getContextNodes().add(tAnnotation);
		match.getContextNodes().add(tType);
		String tAnnotation__pm____model_name_prime = "model";
		String pm__tAnnotation____allTypes_name_prime = "allTypes";
		tAnnotation__pm____model.setSrc(tAnnotation);
		tAnnotation__pm____model.setTrg(pm);
		match.getContextEdges().add(tAnnotation__pm____model);
		pm__tAnnotation____allTypes.setSrc(pm);
		pm__tAnnotation____allTypes.setTrg(tAnnotation);
		match.getContextEdges().add(pm__tAnnotation____allTypes);
		tAnnotation__pm____model.setName(tAnnotation__pm____model_name_prime);
		pm__tAnnotation____allTypes.setName(pm__tAnnotation____allTypes_name_prime);
		return new Object[] { match, pm, tAnnotation, tType, tAnnotation__pm____model, pm__tAnnotation____allTypes };
	}

	public static final void pattern_AnnotationTypeMember_10_6_registerobjectstomatch_expressionBBBBBBBB(
			AnnotationTypeMember _this, Match match, TFieldSignature tSignature, TypeGraph pm, TFieldDefinition tMember,
			TField tName, TAnnotationType tAnnotation, TAbstractType tType) {
		_this.registerObjectsToMatch_BWD(match, tSignature, pm, tMember, tName, tAnnotation, tType);

	}

	public static final boolean pattern_AnnotationTypeMember_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeMember_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_11_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mTypeToType");
		EObject _localVariable_2 = isApplicableMatch.getObject("pm");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_4 = isApplicableMatch.getObject("mAnnotationToAnnotation");
		EObject _localVariable_5 = isApplicableMatch.getObject("mType");
		EObject _localVariable_6 = isApplicableMatch.getObject("tName");
		EObject _localVariable_7 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_8 = isApplicableMatch.getObject("tType");
		EObject _localVariable_9 = isApplicableMatch.getObject("mAnnotation");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpMTypeToType = _localVariable_1;
		EObject tmpPm = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		EObject tmpMAnnotationToAnnotation = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		EObject tmpTName = _localVariable_6;
		EObject tmpTAnnotation = _localVariable_7;
		EObject tmpTType = _localVariable_8;
		EObject tmpMAnnotation = _localVariable_9;
		if (tmpTSignature instanceof TFieldSignature) {
			TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
			if (tmpMTypeToType instanceof TypeToTAbstractType) {
				TypeToTAbstractType mTypeToType = (TypeToTAbstractType) tmpMTypeToType;
				if (tmpPm instanceof TypeGraph) {
					TypeGraph pm = (TypeGraph) tmpPm;
					if (tmpTMember instanceof TFieldDefinition) {
						TFieldDefinition tMember = (TFieldDefinition) tmpTMember;
						if (tmpMAnnotationToAnnotation instanceof TypeToTAbstractType) {
							TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) tmpMAnnotationToAnnotation;
							if (tmpMType instanceof Type) {
								Type mType = (Type) tmpMType;
								if (tmpTName instanceof TField) {
									TField tName = (TField) tmpTName;
									if (tmpTAnnotation instanceof TAnnotationType) {
										TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
										if (tmpTType instanceof TAbstractType) {
											TAbstractType tType = (TAbstractType) tmpTType;
											if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
												AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
												return new Object[] { tSignature, mTypeToType, pm, tMember,
														mAnnotationToAnnotation, mType, tName, tAnnotation, tType,
														mAnnotation, isApplicableMatch };
											}
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

	public static final Object[] pattern_AnnotationTypeMember_11_1_performtransformation_blackBBBBBBBBBBFBB(
			TFieldSignature tSignature, TypeToTAbstractType mTypeToType, TypeGraph pm, TFieldDefinition tMember,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TField tName, TAnnotationType tAnnotation,
			TAbstractType tType, AnnotationTypeDeclaration mAnnotation, AnnotationTypeMember _this,
			IsApplicableMatch isApplicableMatch) {
		if (!mAnnotationToAnnotation.equals(mTypeToType)) {
			if (!tAnnotation.equals(tType)) {
				if (!mAnnotation.equals(mType)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { tSignature, mTypeToType, pm, tMember, mAnnotationToAnnotation, mType,
									tName, tAnnotation, tType, mAnnotation, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationTypeMember_11_1_performtransformation_binding = pattern_AnnotationTypeMember_11_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationTypeMember_11_1_performtransformation_binding != null) {
			TFieldSignature tSignature = (TFieldSignature) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[0];
			TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[1];
			TypeGraph pm = (TypeGraph) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[2];
			TFieldDefinition tMember = (TFieldDefinition) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[3];
			TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[4];
			Type mType = (Type) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[5];
			TField tName = (TField) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[6];
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[7];
			TAbstractType tType = (TAbstractType) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[8];
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[9];

			Object[] result_pattern_AnnotationTypeMember_11_1_performtransformation_black = pattern_AnnotationTypeMember_11_1_performtransformation_blackBBBBBBBBBBFBB(
					tSignature, mTypeToType, pm, tMember, mAnnotationToAnnotation, mType, tName, tAnnotation, tType,
					mAnnotation, _this, isApplicableMatch);
			if (result_pattern_AnnotationTypeMember_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationTypeMember_11_1_performtransformation_black[10];

				return new Object[] { tSignature, mTypeToType, pm, tMember, mAnnotationToAnnotation, mType, tName,
						tAnnotation, tType, mAnnotation, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_11_1_performtransformation_greenFBBFBFFB(
			TFieldDefinition tMember, Type mType, AnnotationTypeDeclaration mAnnotation, CSP csp) {
		MDefinitionToTMember memberToMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		AnnotationTypeMemberDeclaration mMember = JavaFactory.eINSTANCE.createAnnotationTypeMemberDeclaration();
		ASTNodeToTAnnotatable anntotatableToTannotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeAccess access = JavaFactory.eINSTANCE.createTypeAccess();
		Object _localVariable_0 = csp.getValue("mMember", "name");
		memberToMember.setTarget(tMember);
		memberToMember.setSource(mMember);
		mAnnotation.getBodyDeclarations().add(mMember);
		anntotatableToTannotatable.setTarget(tMember);
		anntotatableToTannotatable.setSource(mMember);
		mMember.setType(access);
		access.setType(mType);
		String mMember_name_prime = (String) _localVariable_0;
		mMember.setName(mMember_name_prime);
		return new Object[] { memberToMember, tMember, mType, mMember, mAnnotation, anntotatableToTannotatable, access,
				csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_11_2_collecttranslatedelements_blackBBBBBBB(
			TFieldSignature tSignature, MDefinitionToTMember memberToMember, TFieldDefinition tMember, TField tName,
			AnnotationTypeMemberDeclaration mMember, ASTNodeToTAnnotatable anntotatableToTannotatable,
			TypeAccess access) {
		return new Object[] { tSignature, memberToMember, tMember, tName, mMember, anntotatableToTannotatable, access };
	}

	public static final Object[] pattern_AnnotationTypeMember_11_2_collecttranslatedelements_greenFBBBBBBB(
			TFieldSignature tSignature, MDefinitionToTMember memberToMember, TFieldDefinition tMember, TField tName,
			AnnotationTypeMemberDeclaration mMember, ASTNodeToTAnnotatable anntotatableToTannotatable,
			TypeAccess access) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(memberToMember);
		ruleresult.getTranslatedElements().add(tMember);
		ruleresult.getTranslatedElements().add(tName);
		ruleresult.getCreatedElements().add(mMember);
		ruleresult.getCreatedLinkElements().add(anntotatableToTannotatable);
		ruleresult.getCreatedElements().add(access);
		return new Object[] { ruleresult, tSignature, memberToMember, tMember, tName, mMember,
				anntotatableToTannotatable, access };
	}

	public static final Object[] pattern_AnnotationTypeMember_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToType, EObject pm, EObject memberToMember,
			EObject tMember, EObject mAnnotationToAnnotation, EObject mType, EObject tName, EObject tAnnotation,
			EObject mMember, EObject tType, EObject mAnnotation, EObject anntotatableToTannotatable, EObject access) {
		if (!tSignature.equals(tType)) {
			if (!mTypeToType.equals(tSignature)) {
				if (!mTypeToType.equals(pm)) {
					if (!mTypeToType.equals(memberToMember)) {
						if (!mTypeToType.equals(tMember)) {
							if (!mTypeToType.equals(tName)) {
								if (!mTypeToType.equals(tAnnotation)) {
									if (!mTypeToType.equals(tType)) {
										if (!pm.equals(tSignature)) {
											if (!pm.equals(tMember)) {
												if (!pm.equals(tName)) {
													if (!pm.equals(tAnnotation)) {
														if (!pm.equals(tType)) {
															if (!memberToMember.equals(tSignature)) {
																if (!memberToMember.equals(pm)) {
																	if (!memberToMember.equals(tMember)) {
																		if (!memberToMember.equals(tName)) {
																			if (!memberToMember.equals(tAnnotation)) {
																				if (!memberToMember.equals(tType)) {
																					if (!tMember.equals(tSignature)) {
																						if (!tMember.equals(tName)) {
																							if (!tMember
																									.equals(tType)) {
																								if (!mAnnotationToAnnotation
																										.equals(tSignature)) {
																									if (!mAnnotationToAnnotation
																											.equals(mTypeToType)) {
																										if (!mAnnotationToAnnotation
																												.equals(pm)) {
																											if (!mAnnotationToAnnotation
																													.equals(memberToMember)) {
																												if (!mAnnotationToAnnotation
																														.equals(tMember)) {
																													if (!mAnnotationToAnnotation
																															.equals(mType)) {
																														if (!mAnnotationToAnnotation
																																.equals(tName)) {
																															if (!mAnnotationToAnnotation
																																	.equals(tAnnotation)) {
																																if (!mAnnotationToAnnotation
																																		.equals(mMember)) {
																																	if (!mAnnotationToAnnotation
																																			.equals(tType)) {
																																		if (!mType
																																				.equals(tSignature)) {
																																			if (!mType
																																					.equals(mTypeToType)) {
																																				if (!mType
																																						.equals(pm)) {
																																					if (!mType
																																							.equals(memberToMember)) {
																																						if (!mType
																																								.equals(tMember)) {
																																							if (!mType
																																									.equals(tName)) {
																																								if (!mType
																																										.equals(tAnnotation)) {
																																									if (!mType
																																											.equals(tType)) {
																																										if (!tName
																																												.equals(tSignature)) {
																																											if (!tName
																																													.equals(tType)) {
																																												if (!tAnnotation
																																														.equals(tSignature)) {
																																													if (!tAnnotation
																																															.equals(tMember)) {
																																														if (!tAnnotation
																																																.equals(tName)) {
																																															if (!tAnnotation
																																																	.equals(tType)) {
																																																if (!mMember
																																																		.equals(tSignature)) {
																																																	if (!mMember
																																																			.equals(mTypeToType)) {
																																																		if (!mMember
																																																				.equals(pm)) {
																																																			if (!mMember
																																																					.equals(memberToMember)) {
																																																				if (!mMember
																																																						.equals(tMember)) {
																																																					if (!mMember
																																																							.equals(mType)) {
																																																						if (!mMember
																																																								.equals(tName)) {
																																																							if (!mMember
																																																									.equals(tAnnotation)) {
																																																								if (!mMember
																																																										.equals(tType)) {
																																																									if (!mAnnotation
																																																											.equals(tSignature)) {
																																																										if (!mAnnotation
																																																												.equals(mTypeToType)) {
																																																											if (!mAnnotation
																																																													.equals(pm)) {
																																																												if (!mAnnotation
																																																														.equals(memberToMember)) {
																																																													if (!mAnnotation
																																																															.equals(tMember)) {
																																																														if (!mAnnotation
																																																																.equals(mAnnotationToAnnotation)) {
																																																															if (!mAnnotation
																																																																	.equals(mType)) {
																																																																if (!mAnnotation
																																																																		.equals(tName)) {
																																																																	if (!mAnnotation
																																																																			.equals(tAnnotation)) {
																																																																		if (!mAnnotation
																																																																				.equals(mMember)) {
																																																																			if (!mAnnotation
																																																																					.equals(tType)) {
																																																																				if (!anntotatableToTannotatable
																																																																						.equals(tSignature)) {
																																																																					if (!anntotatableToTannotatable
																																																																							.equals(mTypeToType)) {
																																																																						if (!anntotatableToTannotatable
																																																																								.equals(pm)) {
																																																																							if (!anntotatableToTannotatable
																																																																									.equals(memberToMember)) {
																																																																								if (!anntotatableToTannotatable
																																																																										.equals(tMember)) {
																																																																									if (!anntotatableToTannotatable
																																																																											.equals(mAnnotationToAnnotation)) {
																																																																										if (!anntotatableToTannotatable
																																																																												.equals(mType)) {
																																																																											if (!anntotatableToTannotatable
																																																																													.equals(tName)) {
																																																																												if (!anntotatableToTannotatable
																																																																														.equals(tAnnotation)) {
																																																																													if (!anntotatableToTannotatable
																																																																															.equals(mMember)) {
																																																																														if (!anntotatableToTannotatable
																																																																																.equals(tType)) {
																																																																															if (!anntotatableToTannotatable
																																																																																	.equals(mAnnotation)) {
																																																																																if (!access
																																																																																		.equals(tSignature)) {
																																																																																	if (!access
																																																																																			.equals(mTypeToType)) {
																																																																																		if (!access
																																																																																				.equals(pm)) {
																																																																																			if (!access
																																																																																					.equals(memberToMember)) {
																																																																																				if (!access
																																																																																						.equals(tMember)) {
																																																																																					if (!access
																																																																																							.equals(mAnnotationToAnnotation)) {
																																																																																						if (!access
																																																																																								.equals(mType)) {
																																																																																							if (!access
																																																																																									.equals(tName)) {
																																																																																								if (!access
																																																																																										.equals(tAnnotation)) {
																																																																																									if (!access
																																																																																											.equals(mMember)) {
																																																																																										if (!access
																																																																																												.equals(tType)) {
																																																																																											if (!access
																																																																																													.equals(mAnnotation)) {
																																																																																												if (!access
																																																																																														.equals(anntotatableToTannotatable)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															tSignature,
																																																																																															mTypeToType,
																																																																																															pm,
																																																																																															memberToMember,
																																																																																															tMember,
																																																																																															mAnnotationToAnnotation,
																																																																																															mType,
																																																																																															tName,
																																																																																															tAnnotation,
																																																																																															mMember,
																																																																																															tType,
																																																																																															mAnnotation,
																																																																																															anntotatableToTannotatable,
																																																																																															access };
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeMember_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tSignature, EObject pm, EObject memberToMember, EObject tMember,
			EObject mType, EObject tName, EObject tAnnotation, EObject mMember, EObject tType, EObject mAnnotation,
			EObject anntotatableToTannotatable, EObject access) {
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge memberToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tMember____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge memberToMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge anntotatableToTannotatable__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge anntotatableToTannotatable__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeMember";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____field_name_prime = "field";
		String tName__pm____model_name_prime = "model";
		String pm__tName____fields_name_prime = "fields";
		String tAnnotation__tSignature____signature_name_prime = "signature";
		String tSignature__tType____type_name_prime = "type";
		String memberToMember__tMember____target_name_prime = "target";
		String tSignature__tMember____definitions_name_prime = "definitions";
		String tMember__tSignature____signature_name_prime = "signature";
		String memberToMember__mMember____source_name_prime = "source";
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		String mMember__access____type_name_prime = "type";
		String mAnnotation__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__mAnnotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String anntotatableToTannotatable__tMember____target_name_prime = "target";
		String anntotatableToTannotatable__mMember____source_name_prime = "source";
		String access__mType____type_name_prime = "type";
		String mType__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		ruleresult.getTranslatedEdges().add(tSignature__tName____field);
		tName__pm____model.setSrc(tName);
		tName__pm____model.setTrg(pm);
		ruleresult.getTranslatedEdges().add(tName__pm____model);
		pm__tName____fields.setSrc(pm);
		pm__tName____fields.setTrg(tName);
		ruleresult.getTranslatedEdges().add(pm__tName____fields);
		tAnnotation__tSignature____signature.setSrc(tAnnotation);
		tAnnotation__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tAnnotation__tSignature____signature);
		tSignature__tType____type.setSrc(tSignature);
		tSignature__tType____type.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tSignature__tType____type);
		memberToMember__tMember____target.setSrc(memberToMember);
		memberToMember__tMember____target.setTrg(tMember);
		ruleresult.getCreatedEdges().add(memberToMember__tMember____target);
		tSignature__tMember____definitions.setSrc(tSignature);
		tSignature__tMember____definitions.setTrg(tMember);
		ruleresult.getTranslatedEdges().add(tSignature__tMember____definitions);
		tMember__tSignature____signature.setSrc(tMember);
		tMember__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tMember__tSignature____signature);
		memberToMember__mMember____source.setSrc(memberToMember);
		memberToMember__mMember____source.setTrg(mMember);
		ruleresult.getCreatedEdges().add(memberToMember__mMember____source);
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		ruleresult.getTranslatedEdges().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		ruleresult.getTranslatedEdges().add(tMember__tAnnotation____definedBy);
		mMember__access____type.setSrc(mMember);
		mMember__access____type.setTrg(access);
		ruleresult.getCreatedEdges().add(mMember__access____type);
		mAnnotation__mMember____bodyDeclarations.setSrc(mAnnotation);
		mAnnotation__mMember____bodyDeclarations.setTrg(mMember);
		ruleresult.getCreatedEdges().add(mAnnotation__mMember____bodyDeclarations);
		mMember__mAnnotation____abstractTypeDeclaration.setSrc(mMember);
		mMember__mAnnotation____abstractTypeDeclaration.setTrg(mAnnotation);
		ruleresult.getCreatedEdges().add(mMember__mAnnotation____abstractTypeDeclaration);
		anntotatableToTannotatable__tMember____target.setSrc(anntotatableToTannotatable);
		anntotatableToTannotatable__tMember____target.setTrg(tMember);
		ruleresult.getCreatedEdges().add(anntotatableToTannotatable__tMember____target);
		anntotatableToTannotatable__mMember____source.setSrc(anntotatableToTannotatable);
		anntotatableToTannotatable__mMember____source.setTrg(mMember);
		ruleresult.getCreatedEdges().add(anntotatableToTannotatable__mMember____source);
		access__mType____type.setSrc(access);
		access__mType____type.setTrg(mType);
		ruleresult.getCreatedEdges().add(access__mType____type);
		mType__access____usagesInTypeAccess.setSrc(mType);
		mType__access____usagesInTypeAccess.setTrg(access);
		ruleresult.getCreatedEdges().add(mType__access____usagesInTypeAccess);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__pm____model.setName(tName__pm____model_name_prime);
		pm__tName____fields.setName(pm__tName____fields_name_prime);
		tAnnotation__tSignature____signature.setName(tAnnotation__tSignature____signature_name_prime);
		tSignature__tType____type.setName(tSignature__tType____type_name_prime);
		memberToMember__tMember____target.setName(memberToMember__tMember____target_name_prime);
		tSignature__tMember____definitions.setName(tSignature__tMember____definitions_name_prime);
		tMember__tSignature____signature.setName(tMember__tSignature____signature_name_prime);
		memberToMember__mMember____source.setName(memberToMember__mMember____source_name_prime);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		mMember__access____type.setName(mMember__access____type_name_prime);
		mAnnotation__mMember____bodyDeclarations.setName(mAnnotation__mMember____bodyDeclarations_name_prime);
		mMember__mAnnotation____abstractTypeDeclaration
				.setName(mMember__mAnnotation____abstractTypeDeclaration_name_prime);
		anntotatableToTannotatable__tMember____target.setName(anntotatableToTannotatable__tMember____target_name_prime);
		anntotatableToTannotatable__mMember____source.setName(anntotatableToTannotatable__mMember____source_name_prime);
		access__mType____type.setName(access__mType____type_name_prime);
		mType__access____usagesInTypeAccess.setName(mType__access____usagesInTypeAccess_name_prime);
		return new Object[] { ruleresult, tSignature, pm, memberToMember, tMember, mType, tName, tAnnotation, mMember,
				tType, mAnnotation, anntotatableToTannotatable, access, tName__tSignature____signatures,
				tSignature__tName____field, tName__pm____model, pm__tName____fields,
				tAnnotation__tSignature____signature, tSignature__tType____type, memberToMember__tMember____target,
				tSignature__tMember____definitions, tMember__tSignature____signature, memberToMember__mMember____source,
				tAnnotation__tMember____defines, tMember__tAnnotation____definedBy, mMember__access____type,
				mAnnotation__mMember____bodyDeclarations, mMember__mAnnotation____abstractTypeDeclaration,
				anntotatableToTannotatable__tMember____target, anntotatableToTannotatable__mMember____source,
				access__mType____type, mType__access____usagesInTypeAccess };
	}

	public static final void pattern_AnnotationTypeMember_11_5_registerobjects_expressionBBBBBBBBBBBBBBBB(
			AnnotationTypeMember _this, PerformRuleResult ruleresult, EObject tSignature, EObject mTypeToType,
			EObject pm, EObject memberToMember, EObject tMember, EObject mAnnotationToAnnotation, EObject mType,
			EObject tName, EObject tAnnotation, EObject mMember, EObject tType, EObject mAnnotation,
			EObject anntotatableToTannotatable, EObject access) {
		_this.registerObjects_BWD(ruleresult, tSignature, mTypeToType, pm, memberToMember, tMember,
				mAnnotationToAnnotation, mType, tName, tAnnotation, mMember, tType, mAnnotation,
				anntotatableToTannotatable, access);

	}

	public static final PerformRuleResult pattern_AnnotationTypeMember_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_12_1_preparereturnvalue_bindingFB(
			AnnotationTypeMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationTypeMember _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationTypeMember _this) {
		Object[] result_pattern_AnnotationTypeMember_12_1_preparereturnvalue_binding = pattern_AnnotationTypeMember_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeMember_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationTypeMember_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeMember_12_1_preparereturnvalue_black = pattern_AnnotationTypeMember_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationTypeMember_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationTypeMember_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationTypeMember";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationTypeMember_12_2_corematch_bindingFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tSignature");
		EObject _localVariable_1 = match.getObject("pm");
		EObject _localVariable_2 = match.getObject("tMember");
		EObject _localVariable_3 = match.getObject("tName");
		EObject _localVariable_4 = match.getObject("tAnnotation");
		EObject _localVariable_5 = match.getObject("tType");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpPm = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		EObject tmpTName = _localVariable_3;
		EObject tmpTAnnotation = _localVariable_4;
		EObject tmpTType = _localVariable_5;
		if (tmpTSignature instanceof TFieldSignature) {
			TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
			if (tmpPm instanceof TypeGraph) {
				TypeGraph pm = (TypeGraph) tmpPm;
				if (tmpTMember instanceof TFieldDefinition) {
					TFieldDefinition tMember = (TFieldDefinition) tmpTMember;
					if (tmpTName instanceof TField) {
						TField tName = (TField) tmpTName;
						if (tmpTAnnotation instanceof TAnnotationType) {
							TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
							if (tmpTType instanceof TAbstractType) {
								TAbstractType tType = (TAbstractType) tmpTType;
								return new Object[] { tSignature, pm, tMember, tName, tAnnotation, tType, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_12_2_corematch_blackBFBBFFBBBFB(
			TFieldSignature tSignature, TypeGraph pm, TFieldDefinition tMember, TField tName,
			TAnnotationType tAnnotation, TAbstractType tType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnnotation.equals(tType)) {
			int tSignature_lowerBound = tSignature.getLowerBound();
			if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
				for (TypeToTAbstractType mAnnotationToAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tAnnotation, TypeToTAbstractType.class, "target")) {
					Type tmpMAnnotation = mAnnotationToAnnotation.getSource();
					if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
						AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
						for (TypeToTAbstractType mTypeToType : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
							if (!mAnnotationToAnnotation.equals(mTypeToType)) {
								Type mType = mTypeToType.getSource();
								if (mType != null) {
									if (!mAnnotation.equals(mType)) {
										_result.add(new Object[] { tSignature, mTypeToType, pm, tMember,
												mAnnotationToAnnotation, mType, tName, tAnnotation, tType, mAnnotation,
												match });
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

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_12_3_findcontext_blackBBBBBBBBBB(
			TFieldSignature tSignature, TypeToTAbstractType mTypeToType, TypeGraph pm, TFieldDefinition tMember,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TField tName, TAnnotationType tAnnotation,
			TAbstractType tType, AnnotationTypeDeclaration mAnnotation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!mAnnotationToAnnotation.equals(mTypeToType)) {
			if (!tAnnotation.equals(tType)) {
				if (!mAnnotation.equals(mType)) {
					if (tName.getSignatures().contains(tSignature)) {
						if (pm.equals(tName.getModel())) {
							if (pm.equals(tAnnotation.getModel())) {
								if (mType.equals(mTypeToType.getSource())) {
									if (tAnnotation.getSignature().contains(tSignature)) {
										if (tAnnotation.equals(mAnnotationToAnnotation.getTarget())) {
											if (tType.equals(tSignature.getType())) {
												if (tSignature.getDefinitions().contains(tMember)) {
													if (tType.equals(mTypeToType.getTarget())) {
														if (tAnnotation.getDefines().contains(tMember)) {
															if (mAnnotation
																	.equals(mAnnotationToAnnotation.getSource())) {
																int tSignature_lowerBound = tSignature.getLowerBound();
																if (Integer.valueOf(tSignature_lowerBound)
																		.equals(Integer.valueOf(0))) {
																	_result.add(new Object[] { tSignature, mTypeToType,
																			pm, tMember, mAnnotationToAnnotation, mType,
																			tName, tAnnotation, tType, mAnnotation });
																}

															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeMember_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFFFF(
			TFieldSignature tSignature, TypeToTAbstractType mTypeToType, TypeGraph pm, TFieldDefinition tMember,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TField tName, TAnnotationType tAnnotation,
			TAbstractType tType, AnnotationTypeDeclaration mAnnotation) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tAnnotation____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationToAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tMember____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationToAnnotation__mAnnotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____field_name_prime = "field";
		String tName__pm____model_name_prime = "model";
		String pm__tName____fields_name_prime = "fields";
		String tAnnotation__pm____model_name_prime = "model";
		String pm__tAnnotation____allTypes_name_prime = "allTypes";
		String mTypeToType__mType____source_name_prime = "source";
		String tAnnotation__tSignature____signature_name_prime = "signature";
		String mAnnotationToAnnotation__tAnnotation____target_name_prime = "target";
		String tSignature__tType____type_name_prime = "type";
		String tSignature__tMember____definitions_name_prime = "definitions";
		String tMember__tSignature____signature_name_prime = "signature";
		String mTypeToType__tType____target_name_prime = "target";
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		String mAnnotationToAnnotation__mAnnotation____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(mTypeToType);
		isApplicableMatch.getAllContextElements().add(pm);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(mAnnotationToAnnotation);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mAnnotation);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tName__tSignature____signatures);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(tSignature__tName____field);
		tName__pm____model.setSrc(tName);
		tName__pm____model.setTrg(pm);
		isApplicableMatch.getAllContextElements().add(tName__pm____model);
		pm__tName____fields.setSrc(pm);
		pm__tName____fields.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(pm__tName____fields);
		tAnnotation__pm____model.setSrc(tAnnotation);
		tAnnotation__pm____model.setTrg(pm);
		isApplicableMatch.getAllContextElements().add(tAnnotation__pm____model);
		pm__tAnnotation____allTypes.setSrc(pm);
		pm__tAnnotation____allTypes.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(pm__tAnnotation____allTypes);
		mTypeToType__mType____source.setSrc(mTypeToType);
		mTypeToType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToType__mType____source);
		tAnnotation__tSignature____signature.setSrc(tAnnotation);
		tAnnotation__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tSignature____signature);
		mAnnotationToAnnotation__tAnnotation____target.setSrc(mAnnotationToAnnotation);
		mAnnotationToAnnotation__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotationToAnnotation__tAnnotation____target);
		tSignature__tType____type.setSrc(tSignature);
		tSignature__tType____type.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tSignature__tType____type);
		tSignature__tMember____definitions.setSrc(tSignature);
		tSignature__tMember____definitions.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tSignature__tMember____definitions);
		tMember__tSignature____signature.setSrc(tMember);
		tMember__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tMember__tSignature____signature);
		mTypeToType__tType____target.setSrc(mTypeToType);
		mTypeToType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToType__tType____target);
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tMember__tAnnotation____definedBy);
		mAnnotationToAnnotation__mAnnotation____source.setSrc(mAnnotationToAnnotation);
		mAnnotationToAnnotation__mAnnotation____source.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotationToAnnotation__mAnnotation____source);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__pm____model.setName(tName__pm____model_name_prime);
		pm__tName____fields.setName(pm__tName____fields_name_prime);
		tAnnotation__pm____model.setName(tAnnotation__pm____model_name_prime);
		pm__tAnnotation____allTypes.setName(pm__tAnnotation____allTypes_name_prime);
		mTypeToType__mType____source.setName(mTypeToType__mType____source_name_prime);
		tAnnotation__tSignature____signature.setName(tAnnotation__tSignature____signature_name_prime);
		mAnnotationToAnnotation__tAnnotation____target
				.setName(mAnnotationToAnnotation__tAnnotation____target_name_prime);
		tSignature__tType____type.setName(tSignature__tType____type_name_prime);
		tSignature__tMember____definitions.setName(tSignature__tMember____definitions_name_prime);
		tMember__tSignature____signature.setName(tMember__tSignature____signature_name_prime);
		mTypeToType__tType____target.setName(mTypeToType__tType____target_name_prime);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		mAnnotationToAnnotation__mAnnotation____source
				.setName(mAnnotationToAnnotation__mAnnotation____source_name_prime);
		return new Object[] { tSignature, mTypeToType, pm, tMember, mAnnotationToAnnotation, mType, tName, tAnnotation,
				tType, mAnnotation, isApplicableMatch, tName__tSignature____signatures, tSignature__tName____field,
				tName__pm____model, pm__tName____fields, tAnnotation__pm____model, pm__tAnnotation____allTypes,
				mTypeToType__mType____source, tAnnotation__tSignature____signature,
				mAnnotationToAnnotation__tAnnotation____target, tSignature__tType____type,
				tSignature__tMember____definitions, tMember__tSignature____signature, mTypeToType__tType____target,
				tAnnotation__tMember____defines, tMember__tAnnotation____definedBy,
				mAnnotationToAnnotation__mAnnotation____source };
	}

	public static final Object[] pattern_AnnotationTypeMember_12_4_solveCSP_bindingFBBBBBBBBBBBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TFieldSignature tSignature,
			TypeToTAbstractType mTypeToType, TypeGraph pm, TFieldDefinition tMember,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TField tName, TAnnotationType tAnnotation,
			TAbstractType tType, AnnotationTypeDeclaration mAnnotation) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tSignature, mTypeToType, pm, tMember,
				mAnnotationToAnnotation, mType, tName, tAnnotation, tType, mAnnotation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tSignature, mTypeToType, pm, tMember,
					mAnnotationToAnnotation, mType, tName, tAnnotation, tType, mAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TFieldSignature tSignature,
			TypeToTAbstractType mTypeToType, TypeGraph pm, TFieldDefinition tMember,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TField tName, TAnnotationType tAnnotation,
			TAbstractType tType, AnnotationTypeDeclaration mAnnotation) {
		Object[] result_pattern_AnnotationTypeMember_12_4_solveCSP_binding = pattern_AnnotationTypeMember_12_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, tSignature, mTypeToType, pm, tMember, mAnnotationToAnnotation, mType, tName,
				tAnnotation, tType, mAnnotation);
		if (result_pattern_AnnotationTypeMember_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeMember_12_4_solveCSP_black = pattern_AnnotationTypeMember_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tSignature, mTypeToType, pm, tMember,
						mAnnotationToAnnotation, mType, tName, tAnnotation, tType, mAnnotation };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeMember_12_5_checkCSP_expressionFBB(AnnotationTypeMember _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationTypeMember_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationTypeMember";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeMember_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_1_preparereturnvalue_bindingFB(
			AnnotationTypeMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationTypeMember _this) {
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

	public static final Object[] pattern_AnnotationTypeMember_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationTypeMember _this) {
		Object[] result_pattern_AnnotationTypeMember_20_1_preparereturnvalue_binding = pattern_AnnotationTypeMember_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeMember_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationTypeMember_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeMember_20_1_preparereturnvalue_black = pattern_AnnotationTypeMember_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationTypeMember_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationTypeMember_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationTypeMember_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_0BB(
			TFieldSignature tSignature, TField tName) {
		TField __DEC_tSignature_field_26928 = tSignature.getField();
		if (__DEC_tSignature_field_26928 != null) {
			if (!tName.equals(__DEC_tSignature_field_26928)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_1BB(
			TFieldDefinition tMember, TFieldSignature tSignature) {
		TSignature __DEC_tMember_signature_714687 = tMember.getSignature();
		if (__DEC_tMember_signature_714687 != null) {
			if (!tSignature.equals(__DEC_tMember_signature_714687)) {
				return new Object[] { tMember, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_2B(
			TFieldDefinition tMember) {
		TModule __DEC_tMember_contains_265171 = tMember.getModule();
		if (__DEC_tMember_contains_265171 != null) {
			return new Object[] { tMember };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_3BB(
			TFieldDefinition tMember, TFieldSignature tSignature) {
		TSignature __DEC_tMember_definitions_581760 = tMember.getSignature();
		if (__DEC_tMember_definitions_581760 != null) {
			if (!tSignature.equals(__DEC_tMember_definitions_581760)) {
				return new Object[] { tMember, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_4BB(TField tName,
			TypeGraph pm) {
		TypeGraph __DEC_tName_fields_950863 = tName.getModel();
		if (__DEC_tName_fields_950863 != null) {
			if (!pm.equals(__DEC_tName_fields_950863)) {
				return new Object[] { tName, pm };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_20_2_testcorematchandDECs_blackFFFFFFB(
			EMoflonEdge _edge_signatures) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTName = _edge_signatures.getSrc();
		if (tmpTName instanceof TField) {
			TField tName = (TField) tmpTName;
			EObject tmpTSignature = _edge_signatures.getTrg();
			if (tmpTSignature instanceof TFieldSignature) {
				TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
				if (tName.getSignatures().contains(tSignature)) {
					TypeGraph pm = tName.getModel();
					if (pm != null) {
						TAbstractType tType = tSignature.getType();
						if (tType != null) {
							int tSignature_lowerBound = tSignature.getLowerBound();
							if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
								if (pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_0BB(tSignature,
										tName) == null) {
									if (pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_4BB(tName,
											pm) == null) {
										for (TMember tmpTMember : tSignature.getDefinitions()) {
											if (tmpTMember instanceof TFieldDefinition) {
												TFieldDefinition tMember = (TFieldDefinition) tmpTMember;
												TAbstractType tmpTAnnotation = tMember.getDefinedBy();
												if (tmpTAnnotation instanceof TAnnotationType) {
													TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
													if (!tAnnotation.equals(tType)) {
														if (pm.equals(tAnnotation.getModel())) {
															if (tAnnotation.getSignature().contains(tSignature)) {
																if (pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_1BB(
																		tMember, tSignature) == null) {
																	if (pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_2B(
																			tMember) == null) {
																		if (pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_3BB(
																				tMember, tSignature) == null) {
																			_result.add(new Object[] { tSignature, pm,
																					tMember, tName, tAnnotation, tType,
																					_edge_signatures });
																		}
																	}
																}
															}
														}
													}
												}

											}
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

	public static final Object[] pattern_AnnotationTypeMember_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationTypeMember_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
			AnnotationTypeMember _this, Match match, TFieldSignature tSignature, TypeGraph pm, TFieldDefinition tMember,
			TField tName, TAnnotationType tAnnotation, TAbstractType tType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tSignature, pm, tMember, tName, tAnnotation, tType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeMember_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationTypeMember _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationTypeMember_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_1_preparereturnvalue_bindingFB(
			AnnotationTypeMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationTypeMember _this) {
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

	public static final Object[] pattern_AnnotationTypeMember_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationTypeMember _this) {
		Object[] result_pattern_AnnotationTypeMember_21_1_preparereturnvalue_binding = pattern_AnnotationTypeMember_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationTypeMember_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationTypeMember_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationTypeMember_21_1_preparereturnvalue_black = pattern_AnnotationTypeMember_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationTypeMember_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationTypeMember_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationTypeMember_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_0BBB(
			AnnotationTypeMemberDeclaration mMember, Type mType, AnnotationTypeDeclaration mAnnotation) {
		if (!mAnnotation.equals(mType)) {
			AbstractTypeDeclaration __DEC_mMember_abstractTypeDeclaration_195295 = mMember.getAbstractTypeDeclaration();
			if (__DEC_mMember_abstractTypeDeclaration_195295 != null) {
				if (!mType.equals(__DEC_mMember_abstractTypeDeclaration_195295)) {
					if (!mAnnotation.equals(__DEC_mMember_abstractTypeDeclaration_195295)) {
						return new Object[] { mMember, mType, mAnnotation };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_1B(
			AnnotationTypeMemberDeclaration mMember) {
		AnonymousClassDeclaration __DEC_mMember_anonymousClassDeclarationOwner_32648 = mMember
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mMember_anonymousClassDeclarationOwner_32648 != null) {
			return new Object[] { mMember };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_2BBB(
			TypeAccess access, Type mType, AnnotationTypeDeclaration mAnnotation) {
		if (!mAnnotation.equals(mType)) {
			for (AbstractTypeDeclaration __DEC_access_superInterfaces_636465 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(access, AbstractTypeDeclaration.class, "superInterfaces")) {
				if (!mType.equals(__DEC_access_superInterfaces_636465)) {
					if (!mAnnotation.equals(__DEC_access_superInterfaces_636465)) {
						return new Object[] { access, mType, mAnnotation };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess access) {
		for (Annotation __DEC_access_type_958182 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, Annotation.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_4BB(TypeAccess access,
			Type mType) {
		for (ArrayType __DEC_access_elementType_206727 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ArrayType.class, "elementType")) {
			if (!mType.equals(__DEC_access_elementType_206727)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess access) {
		for (ClassInstanceCreation __DEC_access_type_939466 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ClassInstanceCreation.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_6BB(TypeAccess access,
			Type mType) {
		for (ClassDeclaration __DEC_access_superClass_527481 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ClassDeclaration.class, "superClass")) {
			if (!mType.equals(__DEC_access_superClass_527481)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess access) {
		for (MethodDeclaration __DEC_access_returnType_846957 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, MethodDeclaration.class, "returnType")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_8BB(TypeAccess access,
			Type mType) {
		for (ParameterizedType __DEC_access_type_115937 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ParameterizedType.class, "type")) {
			if (!mType.equals(__DEC_access_type_115937)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_9B(
			TypeAccess access) {
		for (TypeLiteral __DEC_access_type_68578 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, TypeLiteral.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_10B(
			TypeAccess access) {
		for (AnnotationMemberValuePair __DEC_access_value_110057 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_11BB(
			AnnotationTypeDeclaration mAnnotation, TypeAccess access) {
		if (mAnnotation.getSuperInterfaces().contains(access)) {
			return new Object[] { mAnnotation, access };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMMember = _edge_type.getSrc();
		if (tmpMMember instanceof AnnotationTypeMemberDeclaration) {
			AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) tmpMMember;
			EObject tmpAccess = _edge_type.getTrg();
			if (tmpAccess instanceof TypeAccess) {
				TypeAccess access = (TypeAccess) tmpAccess;
				if (access.equals(mMember.getType())) {
					AbstractTypeDeclaration tmpMAnnotation = mMember.getAbstractTypeDeclaration();
					if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
						AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
						Type mType = access.getType();
						if (mType != null) {
							if (!mAnnotation.equals(mType)) {
								if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_1B(
										mMember) == null) {
									if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_3B(
											access) == null) {
										if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_5B(
												access) == null) {
											if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_7B(
													access) == null) {
												if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_9B(
														access) == null) {
													if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_10B(
															access) == null) {
														if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_11BB(
																mAnnotation, access) == null) {
															if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_0BBB(
																	mMember, mType, mAnnotation) == null) {
																if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_2BBB(
																		access, mType, mAnnotation) == null) {
																	if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_4BB(
																			access, mType) == null) {
																		if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_6BB(
																				access, mType) == null) {
																			if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_8BB(
																					access, mType) == null) {
																				_result.add(new Object[] { mType,
																						mMember, mAnnotation, access,
																						_edge_type });
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationTypeMember_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			AnnotationTypeMember _this, Match match, Type mType, AnnotationTypeMemberDeclaration mMember,
			AnnotationTypeDeclaration mAnnotation, TypeAccess access) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mType, mMember, mAnnotation, access);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeMember_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationTypeMember _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationTypeMember_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_24_1_prepare_blackB(AnnotationTypeMember _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationTypeMember_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tSignature");
		EObject _localVariable_1 = targetMatch.getObject("pm");
		EObject _localVariable_2 = targetMatch.getObject("tMember");
		EObject _localVariable_3 = sourceMatch.getObject("mType");
		EObject _localVariable_4 = targetMatch.getObject("tName");
		EObject _localVariable_5 = targetMatch.getObject("tAnnotation");
		EObject _localVariable_6 = sourceMatch.getObject("mMember");
		EObject _localVariable_7 = targetMatch.getObject("tType");
		EObject _localVariable_8 = sourceMatch.getObject("mAnnotation");
		EObject _localVariable_9 = sourceMatch.getObject("access");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpPm = _localVariable_1;
		EObject tmpTMember = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		EObject tmpTName = _localVariable_4;
		EObject tmpTAnnotation = _localVariable_5;
		EObject tmpMMember = _localVariable_6;
		EObject tmpTType = _localVariable_7;
		EObject tmpMAnnotation = _localVariable_8;
		EObject tmpAccess = _localVariable_9;
		if (tmpTSignature instanceof TFieldSignature) {
			TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
			if (tmpPm instanceof TypeGraph) {
				TypeGraph pm = (TypeGraph) tmpPm;
				if (tmpTMember instanceof TFieldDefinition) {
					TFieldDefinition tMember = (TFieldDefinition) tmpTMember;
					if (tmpMType instanceof Type) {
						Type mType = (Type) tmpMType;
						if (tmpTName instanceof TField) {
							TField tName = (TField) tmpTName;
							if (tmpTAnnotation instanceof TAnnotationType) {
								TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
								if (tmpMMember instanceof AnnotationTypeMemberDeclaration) {
									AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) tmpMMember;
									if (tmpTType instanceof TAbstractType) {
										TAbstractType tType = (TAbstractType) tmpTType;
										if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
											AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
											if (tmpAccess instanceof TypeAccess) {
												TypeAccess access = (TypeAccess) tmpAccess;
												return new Object[] { tSignature, pm, tMember, mType, tName,
														tAnnotation, mMember, tType, mAnnotation, access, targetMatch,
														sourceMatch };
											}
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

	public static final Object[] pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
			TFieldSignature tSignature, TypeGraph pm, TFieldDefinition tMember, Type mType, TField tName,
			TAnnotationType tAnnotation, AnnotationTypeMemberDeclaration mMember, TAbstractType tType,
			AnnotationTypeDeclaration mAnnotation, TypeAccess access, Match sourceMatch, Match targetMatch) {
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!sourceMatch.equals(targetMatch)) {
					int tSignature_lowerBound = tSignature.getLowerBound();
					if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
						return new Object[] { tSignature, pm, tMember, mType, tName, tAnnotation, mMember, tType,
								mAnnotation, access, sourceMatch, targetMatch };
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding = pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_bindingFFFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding != null) {
			TFieldSignature tSignature = (TFieldSignature) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[0];
			TypeGraph pm = (TypeGraph) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[1];
			TFieldDefinition tMember = (TFieldDefinition) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[2];
			Type mType = (Type) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[3];
			TField tName = (TField) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[4];
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[5];
			AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[6];
			TAbstractType tType = (TAbstractType) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[7];
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[8];
			TypeAccess access = (TypeAccess) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_black = pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					tSignature, pm, tMember, mType, tName, tAnnotation, mMember, tType, mAnnotation, access,
					sourceMatch, targetMatch);
			if (result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tSignature, pm, tMember, mType, tName, tAnnotation, mMember, tType, mAnnotation,
						access, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
			AnnotationTypeMember _this, TFieldSignature tSignature, TypeGraph pm, TFieldDefinition tMember, Type mType,
			TField tName, TAnnotationType tAnnotation, AnnotationTypeMemberDeclaration mMember, TAbstractType tType,
			AnnotationTypeDeclaration mAnnotation, TypeAccess access, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(tSignature, pm, tMember, mType, tName, tAnnotation,
				mMember, tType, mAnnotation, access, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, tSignature, pm, tMember, mType, tName, tAnnotation, mMember, tType,
					mAnnotation, access, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			AnnotationTypeMember _this, TFieldSignature tSignature, TypeGraph pm, TFieldDefinition tMember, Type mType,
			TField tName, TAnnotationType tAnnotation, AnnotationTypeMemberDeclaration mMember, TAbstractType tType,
			AnnotationTypeDeclaration mAnnotation, TypeAccess access, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationTypeMember_24_3_solvecsp_binding = pattern_AnnotationTypeMember_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, tSignature, pm, tMember, mType, tName, tAnnotation, mMember, tType, mAnnotation, access,
				sourceMatch, targetMatch);
		if (result_pattern_AnnotationTypeMember_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnnotationTypeMember_24_3_solvecsp_black = pattern_AnnotationTypeMember_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tSignature, pm, tMember, mType, tName, tAnnotation, mMember, tType,
						mAnnotation, access, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeMember_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_24_5_matchcorrcontext_blackFFBBBBBB(Type mType,
			TAnnotationType tAnnotation, TAbstractType tType, AnnotationTypeDeclaration mAnnotation, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (TypeToTAbstractType mTypeToType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
						if (tType.equals(mTypeToType.getTarget())) {
							for (TypeToTAbstractType mAnnotationToAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(tAnnotation, TypeToTAbstractType.class, "target")) {
								if (!mAnnotationToAnnotation.equals(mTypeToType)) {
									if (mAnnotation.equals(mAnnotationToAnnotation.getSource())) {
										_result.add(new Object[] { mTypeToType, mAnnotationToAnnotation, mType,
												tAnnotation, tType, mAnnotation, sourceMatch, targetMatch });
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

	public static final Object[] pattern_AnnotationTypeMember_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToType, TypeToTAbstractType mAnnotationToAnnotation, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnnotationTypeMember";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToType);
		ccMatch.getAllContextElements().add(mAnnotationToAnnotation);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToType, mAnnotationToAnnotation, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeMember_24_6_createcorrespondence_blackBBBBBBBBBBB(
			TFieldSignature tSignature, TypeGraph pm, TFieldDefinition tMember, Type mType, TField tName,
			TAnnotationType tAnnotation, AnnotationTypeMemberDeclaration mMember, TAbstractType tType,
			AnnotationTypeDeclaration mAnnotation, TypeAccess access, CCMatch ccMatch) {
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				return new Object[] { tSignature, pm, tMember, mType, tName, tAnnotation, mMember, tType, mAnnotation,
						access, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_24_6_createcorrespondence_greenFBBFB(
			TFieldDefinition tMember, AnnotationTypeMemberDeclaration mMember, CCMatch ccMatch) {
		MDefinitionToTMember memberToMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		ASTNodeToTAnnotatable anntotatableToTannotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		memberToMember.setTarget(tMember);
		memberToMember.setSource(mMember);
		ccMatch.getCreateCorr().add(memberToMember);
		anntotatableToTannotatable.setTarget(tMember);
		anntotatableToTannotatable.setSource(mMember);
		ccMatch.getCreateCorr().add(anntotatableToTannotatable);
		return new Object[] { memberToMember, tMember, mMember, anntotatableToTannotatable, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeMember_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnnotationTypeMember_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnnotationTypeMember";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationTypeMember_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_0BBB(
			AnnotationTypeMemberDeclaration mMember, Type mType, AnnotationTypeDeclaration mAnnotation) {
		if (!mAnnotation.equals(mType)) {
			AbstractTypeDeclaration __DEC_mMember_abstractTypeDeclaration_453640 = mMember.getAbstractTypeDeclaration();
			if (__DEC_mMember_abstractTypeDeclaration_453640 != null) {
				if (!mType.equals(__DEC_mMember_abstractTypeDeclaration_453640)) {
					if (!mAnnotation.equals(__DEC_mMember_abstractTypeDeclaration_453640)) {
						return new Object[] { mMember, mType, mAnnotation };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_1B(
			AnnotationTypeMemberDeclaration mMember) {
		AnonymousClassDeclaration __DEC_mMember_anonymousClassDeclarationOwner_275176 = mMember
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mMember_anonymousClassDeclarationOwner_275176 != null) {
			return new Object[] { mMember };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_2BBB(TypeAccess access,
			Type mType, AnnotationTypeDeclaration mAnnotation) {
		if (!mAnnotation.equals(mType)) {
			for (AbstractTypeDeclaration __DEC_access_superInterfaces_28016 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(access, AbstractTypeDeclaration.class, "superInterfaces")) {
				if (!mType.equals(__DEC_access_superInterfaces_28016)) {
					if (!mAnnotation.equals(__DEC_access_superInterfaces_28016)) {
						return new Object[] { access, mType, mAnnotation };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_3B(TypeAccess access) {
		for (Annotation __DEC_access_type_347485 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, Annotation.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_4BB(TypeAccess access,
			Type mType) {
		for (ArrayType __DEC_access_elementType_204061 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ArrayType.class, "elementType")) {
			if (!mType.equals(__DEC_access_elementType_204061)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_5B(TypeAccess access) {
		for (ClassInstanceCreation __DEC_access_type_108921 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ClassInstanceCreation.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_6BB(TypeAccess access,
			Type mType) {
		for (ClassDeclaration __DEC_access_superClass_689330 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ClassDeclaration.class, "superClass")) {
			if (!mType.equals(__DEC_access_superClass_689330)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_7B(TypeAccess access) {
		for (MethodDeclaration __DEC_access_returnType_154340 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, MethodDeclaration.class, "returnType")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_8BB(TypeAccess access,
			Type mType) {
		for (ParameterizedType __DEC_access_type_202270 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ParameterizedType.class, "type")) {
			if (!mType.equals(__DEC_access_type_202270)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_9B(TypeAccess access) {
		for (TypeLiteral __DEC_access_type_764951 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, TypeLiteral.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_10B(TypeAccess access) {
		for (AnnotationMemberValuePair __DEC_access_value_953634 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_11BB(
			AnnotationTypeDeclaration mAnnotation, TypeAccess access) {
		if (mAnnotation.getSuperInterfaces().contains(access)) {
			return new Object[] { mAnnotation, access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_blackBBBB(Type mType,
			AnnotationTypeMemberDeclaration mMember, AnnotationTypeDeclaration mAnnotation, TypeAccess access) {
		if (!mAnnotation.equals(mType)) {
			if (access.equals(mMember.getType())) {
				if (mAnnotation.getBodyDeclarations().contains(mMember)) {
					if (mType.equals(access.getType())) {
						if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_0BBB(mMember, mType,
								mAnnotation) == null) {
							if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_1B(mMember) == null) {
								if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_2BBB(access, mType,
										mAnnotation) == null) {
									if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_3B(
											access) == null) {
										if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_4BB(access,
												mType) == null) {
											if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_5B(
													access) == null) {
												if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_6BB(
														access, mType) == null) {
													if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_7B(
															access) == null) {
														if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_8BB(
																access, mType) == null) {
															if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_9B(
																	access) == null) {
																if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_10B(
																		access) == null) {
																	if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_11BB(
																			mAnnotation, access) == null) {
																		return new Object[] { mType, mMember,
																				mAnnotation, access };
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_AnnotationTypeMember_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeMember_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_0BB(
			TFieldSignature tSignature, TField tName) {
		TField __DEC_tSignature_field_30707 = tSignature.getField();
		if (__DEC_tSignature_field_30707 != null) {
			if (!tName.equals(__DEC_tSignature_field_30707)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_1BB(
			TFieldDefinition tMember, TFieldSignature tSignature) {
		TSignature __DEC_tMember_signature_666302 = tMember.getSignature();
		if (__DEC_tMember_signature_666302 != null) {
			if (!tSignature.equals(__DEC_tMember_signature_666302)) {
				return new Object[] { tMember, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_2B(
			TFieldDefinition tMember) {
		TModule __DEC_tMember_contains_64011 = tMember.getModule();
		if (__DEC_tMember_contains_64011 != null) {
			return new Object[] { tMember };
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_3BB(
			TFieldDefinition tMember, TFieldSignature tSignature) {
		TSignature __DEC_tMember_definitions_903355 = tMember.getSignature();
		if (__DEC_tMember_definitions_903355 != null) {
			if (!tSignature.equals(__DEC_tMember_definitions_903355)) {
				return new Object[] { tMember, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_4BB(TField tName,
			TypeGraph pm) {
		TypeGraph __DEC_tName_fields_437227 = tName.getModel();
		if (__DEC_tName_fields_437227 != null) {
			if (!pm.equals(__DEC_tName_fields_437227)) {
				return new Object[] { tName, pm };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_28_1_matchtggpattern_blackBBBBBB(
			TFieldSignature tSignature, TypeGraph pm, TFieldDefinition tMember, TField tName,
			TAnnotationType tAnnotation, TAbstractType tType) {
		if (!tAnnotation.equals(tType)) {
			if (tName.getSignatures().contains(tSignature)) {
				if (pm.equals(tName.getModel())) {
					if (pm.equals(tAnnotation.getModel())) {
						if (tAnnotation.getSignature().contains(tSignature)) {
							if (tType.equals(tSignature.getType())) {
								if (tSignature.getDefinitions().contains(tMember)) {
									if (tAnnotation.getDefines().contains(tMember)) {
										if (pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_0BB(tSignature,
												tName) == null) {
											if (pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_1BB(tMember,
													tSignature) == null) {
												if (pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_2B(
														tMember) == null) {
													if (pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_3BB(
															tMember, tSignature) == null) {
														if (pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_4BB(
																tName, pm) == null) {
															return new Object[] { tSignature, pm, tMember, tName,
																	tAnnotation, tType };
														}
													}
												}
											}
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

	public static final Object[] pattern_AnnotationTypeMember_28_1_matchtggpattern_greenB(TFieldSignature tSignature) {
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		return new Object[] { tSignature };
	}

	public static final boolean pattern_AnnotationTypeMember_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationTypeMember_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_1_createresult_blackB(AnnotationTypeMember _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationTypeMember_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToType) {
		if (ruleResult.getCorrObjects().contains(mTypeToType)) {
			return new Object[] { ruleResult, mTypeToType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pm) {
		if (ruleResult.getTargetObjects().contains(pm)) {
			return new Object[] { ruleResult, pm };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TAnnotationType tAnnotation) {
		if (ruleResult.getTargetObjects().contains(tAnnotation)) {
			return new Object[] { ruleResult, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mAnnotationToAnnotation) {
		if (ruleResult.getCorrObjects().contains(mAnnotationToAnnotation)) {
			return new Object[] { ruleResult, mAnnotationToAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, AnnotationTypeDeclaration mAnnotation) {
		if (ruleResult.getSourceObjects().contains(mAnnotation)) {
			return new Object[] { ruleResult, mAnnotation };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_29_2_isapplicablecore_blackFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mTypeToTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mAnnotationToAnnotationList : ruleEntryContainer.getRuleEntryList()) {
				if (!mAnnotationToAnnotationList.equals(mTypeToTypeList)) {
					for (EObject tmpMTypeToType : mTypeToTypeList.getEntryObjects()) {
						if (tmpMTypeToType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mTypeToType = (TypeToTAbstractType) tmpMTypeToType;
							Type mType = mTypeToType.getSource();
							if (mType != null) {
								TAbstractType tType = mTypeToType.getTarget();
								if (tType != null) {
									if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											mTypeToType) == null) {
										if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_1BB(ruleResult,
												mType) == null) {
											if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tType) == null) {
												for (EObject tmpMAnnotationToAnnotation : mAnnotationToAnnotationList
														.getEntryObjects()) {
													if (tmpMAnnotationToAnnotation instanceof TypeToTAbstractType) {
														TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) tmpMAnnotationToAnnotation;
														if (!mAnnotationToAnnotation.equals(mTypeToType)) {
															TAbstractType tmpTAnnotation = mAnnotationToAnnotation
																	.getTarget();
															if (tmpTAnnotation instanceof TAnnotationType) {
																TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
																if (!tAnnotation.equals(tType)) {
																	Type tmpMAnnotation = mAnnotationToAnnotation
																			.getSource();
																	if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
																		AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
																		if (!mAnnotation.equals(mType)) {
																			TypeGraph pm = tAnnotation.getModel();
																			if (pm != null) {
																				if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_5BB(
																						ruleResult,
																						mAnnotationToAnnotation) == null) {
																					if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_4BB(
																							ruleResult,
																							tAnnotation) == null) {
																						if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_6BB(
																								ruleResult,
																								mAnnotation) == null) {
																							if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_3BB(
																									ruleResult,
																									pm) == null) {
																								_result.add(
																										new Object[] {
																												mTypeToTypeList,
																												mTypeToType,
																												mType,
																												tType,
																												mAnnotationToAnnotationList,
																												pm,
																												tAnnotation,
																												mAnnotationToAnnotation,
																												mAnnotation,
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
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_3_solveCSP_bindingFBBBBBBBBBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToType,
			TypeGraph pm, TypeToTAbstractType mAnnotationToAnnotation, Type mType, TAnnotationType tAnnotation,
			TAbstractType tType, AnnotationTypeDeclaration mAnnotation, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mTypeToType, pm,
				mAnnotationToAnnotation, mType, tAnnotation, tType, mAnnotation, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToType, pm, mAnnotationToAnnotation, mType,
					tAnnotation, tType, mAnnotation, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToType,
			TypeGraph pm, TypeToTAbstractType mAnnotationToAnnotation, Type mType, TAnnotationType tAnnotation,
			TAbstractType tType, AnnotationTypeDeclaration mAnnotation, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnnotationTypeMember_29_3_solveCSP_binding = pattern_AnnotationTypeMember_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mTypeToType, pm, mAnnotationToAnnotation, mType, tAnnotation, tType,
				mAnnotation, ruleResult);
		if (result_pattern_AnnotationTypeMember_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeMember_29_3_solveCSP_black = pattern_AnnotationTypeMember_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToType, pm, mAnnotationToAnnotation, mType,
						tAnnotation, tType, mAnnotation, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeMember_29_4_checkCSP_expressionFBB(AnnotationTypeMember _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_5_checknacs_blackBBBBBBB(
			TypeToTAbstractType mTypeToType, TypeGraph pm, TypeToTAbstractType mAnnotationToAnnotation, Type mType,
			TAnnotationType tAnnotation, TAbstractType tType, AnnotationTypeDeclaration mAnnotation) {
		if (!mAnnotationToAnnotation.equals(mTypeToType)) {
			if (!tAnnotation.equals(tType)) {
				if (!mAnnotation.equals(mType)) {
					return new Object[] { mTypeToType, pm, mAnnotationToAnnotation, mType, tAnnotation, tType,
							mAnnotation };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_6_perform_blackBBBBBBBB(
			TypeToTAbstractType mTypeToType, TypeGraph pm, TypeToTAbstractType mAnnotationToAnnotation, Type mType,
			TAnnotationType tAnnotation, TAbstractType tType, AnnotationTypeDeclaration mAnnotation,
			ModelgeneratorRuleResult ruleResult) {
		if (!mAnnotationToAnnotation.equals(mTypeToType)) {
			if (!tAnnotation.equals(tType)) {
				if (!mAnnotation.equals(mType)) {
					return new Object[] { mTypeToType, pm, mAnnotationToAnnotation, mType, tAnnotation, tType,
							mAnnotation, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_6_perform_greenFBFFBFBFBBFFBB(TypeGraph pm, Type mType,
			TAnnotationType tAnnotation, TAbstractType tType, AnnotationTypeDeclaration mAnnotation,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		MDefinitionToTMember memberToMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TFieldDefinition tMember = BasicFactory.eINSTANCE.createTFieldDefinition();
		TField tName = BasicFactory.eINSTANCE.createTField();
		AnnotationTypeMemberDeclaration mMember = JavaFactory.eINSTANCE.createAnnotationTypeMemberDeclaration();
		ASTNodeToTAnnotatable anntotatableToTannotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeAccess access = JavaFactory.eINSTANCE.createTypeAccess();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tSignature", "upperBound");
		Object _localVariable_1 = csp.getValue("tName", "tName");
		Object _localVariable_2 = csp.getValue("mMember", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_3 = ruleResult.getIncrementedPerformCount();
		tAnnotation.getSignature().add(tSignature);
		tSignature.setType(tType);
		ruleResult.getTargetObjects().add(tSignature);
		ruleResult.getCorrObjects().add(memberToMember);
		memberToMember.setTarget(tMember);
		tSignature.getDefinitions().add(tMember);
		tAnnotation.getDefines().add(tMember);
		ruleResult.getTargetObjects().add(tMember);
		tName.getSignatures().add(tSignature);
		tName.setModel(pm);
		ruleResult.getTargetObjects().add(tName);
		memberToMember.setSource(mMember);
		mAnnotation.getBodyDeclarations().add(mMember);
		ruleResult.getSourceObjects().add(mMember);
		anntotatableToTannotatable.setTarget(tMember);
		anntotatableToTannotatable.setSource(mMember);
		ruleResult.getCorrObjects().add(anntotatableToTannotatable);
		mMember.setType(access);
		access.setType(mType);
		ruleResult.getSourceObjects().add(access);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		int tSignature_upperBound_prime = (int) _localVariable_0;
		String tName_tName_prime = (String) _localVariable_1;
		String mMember_name_prime = (String) _localVariable_2;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_3);
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		tName.setTName(tName_tName_prime);
		mMember.setName(mMember_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tSignature, pm, memberToMember, tMember, mType, tName, tAnnotation, mMember, tType,
				mAnnotation, anntotatableToTannotatable, access, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationTypeMember_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationTypeMemberImpl
