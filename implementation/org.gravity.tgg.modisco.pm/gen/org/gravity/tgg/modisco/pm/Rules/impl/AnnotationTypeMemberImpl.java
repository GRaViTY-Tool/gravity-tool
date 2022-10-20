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
	public boolean isAppropriate_FWD(Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation,
			AnnotationTypeMemberDeclaration mMember, Type mType) {

		Object[] result1_black = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_1_initialbindings_blackBBBBBB(
				this, match, access, mAnnotation, mMember, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[access] = " + access + ", " + "[mAnnotation] = " + mAnnotation
					+ ", " + "[mMember] = " + mMember + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, access, mAnnotation,
						mMember, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[access] = " + access + ", " + "[mAnnotation] = " + mAnnotation
					+ ", " + "[mMember] = " + mMember + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_0_4_collectelementstobetranslated_blackBBBBB(match, access,
							mAnnotation, mMember, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[access] = " + access + ", " + "[mAnnotation] = " + mAnnotation + ", " + "[mMember] = "
						+ mMember + ", " + "[mType] = " + mType + ".");
			}
			AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_4_collectelementstobetranslated_greenBBBBBFFFFF(
					match, access, mAnnotation, mMember, mType);
			//nothing EMoflonEdge mMember__access____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge mAnnotation__mMember____bodyDeclarations = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge access__mType____type = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge mType__access____usagesInTypeAccess = (EMoflonEdge) result4_green[9];

			Object[] result5_black = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_0_5_collectcontextelements_blackBBBBB(match, access, mAnnotation,
							mMember, mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[access] = " + access + ", " + "[mAnnotation] = " + mAnnotation + ", " + "[mMember] = "
						+ mMember + ", " + "[mType] = " + mType + ".");
			}
			AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_5_collectcontextelements_greenBBB(match,
					mAnnotation, mType);

			// 
			AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_0_6_registerobjectstomatch_expressionBBBBBB(this,
					match, access, mAnnotation, mMember, mType);
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
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[0];
		TAnnotationType tAnnotation = (TAnnotationType) result1_bindingAndBlack[1];
		TypeAccess access = (TypeAccess) result1_bindingAndBlack[2];
		TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result1_bindingAndBlack[4];
		AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result1_bindingAndBlack[5];
		TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result1_bindingAndBlack[6];
		Type mType = (Type) result1_bindingAndBlack[7];
		TypeGraph pm = (TypeGraph) result1_bindingAndBlack[8];
		CSP csp = (CSP) result1_bindingAndBlack[9];
		Object[] result1_green = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_1_1_performtransformation_greenBBFFFFBBFB(tType, tAnnotation, mMember, pm,
						csp);
		TFieldSignature tSignature = (TFieldSignature) result1_green[2];
		TFieldDefinition tMember = (TFieldDefinition) result1_green[3];
		MDefinitionToTMember memberToMember = (MDefinitionToTMember) result1_green[4];
		TField tName = (TField) result1_green[5];
		ASTNodeToTAnnotatable anntotatableToTannotatable = (ASTNodeToTAnnotatable) result1_green[8];

		Object[] result2_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_1_2_collecttranslatedelements_blackBBBBBBB(access, tSignature, tMember,
						memberToMember, tName, mMember, anntotatableToTannotatable);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[access] = " + access + ", "
					+ "[tSignature] = " + tSignature + ", " + "[tMember] = " + tMember + ", " + "[memberToMember] = "
					+ memberToMember + ", " + "[tName] = " + tName + ", " + "[mMember] = " + mMember + ", "
					+ "[anntotatableToTannotatable] = " + anntotatableToTannotatable + ".");
		}
		Object[] result2_green = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_1_2_collecttranslatedelements_greenFBBBBBBB(access, tSignature, tMember,
						memberToMember, tName, mMember, anntotatableToTannotatable);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(ruleresult, tType,
						tAnnotation, access, mTypeToType, tSignature, tMember, memberToMember, tName, mAnnotation,
						mMember, mAnnotationToAnnotation, mType, pm, anntotatableToTannotatable);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tType] = " + tType + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[access] = "
					+ access + ", " + "[mTypeToType] = " + mTypeToType + ", " + "[tSignature] = " + tSignature + ", "
					+ "[tMember] = " + tMember + ", " + "[memberToMember] = " + memberToMember + ", " + "[tName] = "
					+ tName + ", " + "[mAnnotation] = " + mAnnotation + ", " + "[mMember] = " + mMember + ", "
					+ "[mAnnotationToAnnotation] = " + mAnnotationToAnnotation + ", " + "[mType] = " + mType + ", "
					+ "[pm] = " + pm + ", " + "[anntotatableToTannotatable] = " + anntotatableToTannotatable + ".");
		}
		AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(ruleresult,
						tType, tAnnotation, access, tSignature, tMember, memberToMember, tName, mAnnotation, mMember,
						mType, pm, anntotatableToTannotatable);
		//nothing EMoflonEdge tSignature__tMember____definitions = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tMember__tSignature____signature = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tSignature__tType____type = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge memberToMember__tMember____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tName__pm____model = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge pm__tName____fields = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge mMember__access____type = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge memberToMember__mMember____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge mAnnotation__mMember____bodyDeclarations = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge anntotatableToTannotatable__mMember____source = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge anntotatableToTannotatable__tMember____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge tAnnotation__tSignature____signature = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge access__mType____type = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge mType__access____usagesInTypeAccess = (EMoflonEdge) result3_green[31];

		// 
		// 
		AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_1_5_registerobjects_expressionBBBBBBBBBBBBBBBB(this,
				ruleresult, tType, tAnnotation, access, mTypeToType, tSignature, tMember, memberToMember, tName,
				mAnnotation, mMember, mAnnotationToAnnotation, mType, pm, anntotatableToTannotatable);
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
		TypeAccess access = (TypeAccess) result2_binding[0];
		AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result2_binding[1];
		AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result2_binding[2];
		Type mType = (Type) result2_binding[3];
		for (Object[] result2_black : AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_2_2_corematch_blackFFBFBBFBB(access, mAnnotation, mMember, mType,
						match)) {
			TAbstractType tType = (TAbstractType) result2_black[0];
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[1];
			TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result2_black[3];
			TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result2_black[6];
			// ForEach 
			for (Object[] result3_black : AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_2_3_findcontext_blackBBBBBBBBF(tType, tAnnotation, access,
							mTypeToType, mAnnotation, mMember, mAnnotationToAnnotation, mType)) {
				TypeGraph pm = (TypeGraph) result3_black[8];
				Object[] result3_green = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFF(tType, tAnnotation,
								access, mTypeToType, mAnnotation, mMember, mAnnotationToAnnotation, mType, pm);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge tAnnotation__pm____model = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge pm__tAnnotation____ownedTypes = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeToType__tType____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mMember__access____type = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mTypeToType__mType____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mAnnotationToAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mAnnotation__mMember____bodyDeclarations = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mAnnotationToAnnotation__mAnnotation____source = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge access__mType____type = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mType__access____usagesInTypeAccess = (EMoflonEdge) result3_green[20];

				Object[] result4_bindingAndBlack = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this, isApplicableMatch,
								tType, tAnnotation, access, mTypeToType, mAnnotation, mMember, mAnnotationToAnnotation,
								mType, pm);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tType] = " + tType + ", "
							+ "[tAnnotation] = " + tAnnotation + ", " + "[access] = " + access + ", "
							+ "[mTypeToType] = " + mTypeToType + ", " + "[mAnnotation] = " + mAnnotation + ", "
							+ "[mMember] = " + mMember + ", " + "[mAnnotationToAnnotation] = " + mAnnotationToAnnotation
							+ ", " + "[mType] = " + mType + ", " + "[pm] = " + pm + ".");
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
	public void registerObjectsToMatch_FWD(Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation,
			AnnotationTypeMemberDeclaration mMember, Type mType) {
		match.registerObject("access", access);
		match.registerObject("mAnnotation", mAnnotation);
		match.registerObject("mMember", mMember);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation,
			AnnotationTypeMemberDeclaration mMember, Type mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TAnnotationType tAnnotation, TypeAccess access, TypeToTAbstractType mTypeToType,
			AnnotationTypeDeclaration mAnnotation, AnnotationTypeMemberDeclaration mMember,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TypeGraph pm) {// Create CSP
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
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("access", access);
		isApplicableMatch.registerObject("mTypeToType", mTypeToType);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mAnnotationToAnnotation", mAnnotationToAnnotation);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("pm", pm);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tType, EObject tAnnotation, EObject access,
			EObject mTypeToType, EObject tSignature, EObject tMember, EObject memberToMember, EObject tName,
			EObject mAnnotation, EObject mMember, EObject mAnnotationToAnnotation, EObject mType, EObject pm,
			EObject anntotatableToTannotatable) {
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("access", access);
		ruleresult.registerObject("mTypeToType", mTypeToType);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("memberToMember", memberToMember);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mAnnotation", mAnnotation);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("mAnnotationToAnnotation", mAnnotationToAnnotation);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("pm", pm);
		ruleresult.registerObject("anntotatableToTannotatable", anntotatableToTannotatable);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("access").eClass()).equals("java.TypeAccess.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mMember").eClass())
						.equals("java.AnnotationTypeMemberDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TAbstractType tType, TAnnotationType tAnnotation,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName, TypeGraph pm) {

		Object[] result1_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_10_1_initialbindings_blackBBBBBBBB(this, match, tType, tAnnotation,
						tSignature, tMember, tName, pm);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[tSignature] = " + tSignature + ", " + "[tMember] = " + tMember + ", " + "[tName] = "
					+ tName + ", " + "[pm] = " + pm + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_10_2_SolveCSP_bindingAndBlackFBBBBBBBB(this, match, tType, tAnnotation,
						tSignature, tMember, tName, pm);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[tSignature] = " + tSignature + ", " + "[tMember] = " + tMember + ", " + "[tName] = "
					+ tName + ", " + "[pm] = " + pm + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_10_4_collectelementstobetranslated_blackBBBBBBB(match, tType,
							tAnnotation, tSignature, tMember, tName, pm);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tType] = " + tType
								+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tSignature] = " + tSignature + ", "
								+ "[tMember] = " + tMember + ", " + "[tName] = " + tName + ", " + "[pm] = " + pm + ".");
			}
			AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_10_4_collectelementstobetranslated_greenBBBBBBBFFFFFFFFFF(match,
							tType, tAnnotation, tSignature, tMember, tName, pm);
			//nothing EMoflonEdge tSignature__tMember____definitions = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tMember__tSignature____signature = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tSignature__tType____type = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge tName__pm____model = (EMoflonEdge) result4_green[12];
			//nothing EMoflonEdge pm__tName____fields = (EMoflonEdge) result4_green[13];
			//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result4_green[14];
			//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result4_green[15];
			//nothing EMoflonEdge tAnnotation__tSignature____signature = (EMoflonEdge) result4_green[16];

			Object[] result5_black = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_10_5_collectcontextelements_blackBBBBBBB(match, tType, tAnnotation,
							tSignature, tMember, tName, pm);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[tType] = " + tType
								+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tSignature] = " + tSignature + ", "
								+ "[tMember] = " + tMember + ", " + "[tName] = " + tName + ", " + "[pm] = " + pm + ".");
			}
			AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_10_5_collectcontextelements_greenBBBBFF(match, tType,
					tAnnotation, pm);
			//nothing EMoflonEdge tAnnotation__pm____model = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge pm__tAnnotation____ownedTypes = (EMoflonEdge) result5_green[5];

			// 
			AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_10_6_registerobjectstomatch_expressionBBBBBBBB(this,
					match, tType, tAnnotation, tSignature, tMember, tName, pm);
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
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[0];
		TAnnotationType tAnnotation = (TAnnotationType) result1_bindingAndBlack[1];
		TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result1_bindingAndBlack[2];
		TFieldSignature tSignature = (TFieldSignature) result1_bindingAndBlack[3];
		TFieldDefinition tMember = (TFieldDefinition) result1_bindingAndBlack[4];
		TField tName = (TField) result1_bindingAndBlack[5];
		AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result1_bindingAndBlack[6];
		TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result1_bindingAndBlack[7];
		Type mType = (Type) result1_bindingAndBlack[8];
		TypeGraph pm = (TypeGraph) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_11_1_performtransformation_greenFBFBFBFB(tMember, mAnnotation, mType,
						csp);
		TypeAccess access = (TypeAccess) result1_green[0];
		MDefinitionToTMember memberToMember = (MDefinitionToTMember) result1_green[2];
		AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result1_green[4];
		ASTNodeToTAnnotatable anntotatableToTannotatable = (ASTNodeToTAnnotatable) result1_green[6];

		Object[] result2_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_11_2_collecttranslatedelements_blackBBBBBBB(access, tSignature, tMember,
						memberToMember, tName, mMember, anntotatableToTannotatable);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[access] = " + access + ", "
					+ "[tSignature] = " + tSignature + ", " + "[tMember] = " + tMember + ", " + "[memberToMember] = "
					+ memberToMember + ", " + "[tName] = " + tName + ", " + "[mMember] = " + mMember + ", "
					+ "[anntotatableToTannotatable] = " + anntotatableToTannotatable + ".");
		}
		Object[] result2_green = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_11_2_collecttranslatedelements_greenFBBBBBBB(access, tSignature, tMember,
						memberToMember, tName, mMember, anntotatableToTannotatable);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(ruleresult, tType,
						tAnnotation, access, mTypeToType, tSignature, tMember, memberToMember, tName, mAnnotation,
						mMember, mAnnotationToAnnotation, mType, pm, anntotatableToTannotatable);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tType] = " + tType + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[access] = "
					+ access + ", " + "[mTypeToType] = " + mTypeToType + ", " + "[tSignature] = " + tSignature + ", "
					+ "[tMember] = " + tMember + ", " + "[memberToMember] = " + memberToMember + ", " + "[tName] = "
					+ tName + ", " + "[mAnnotation] = " + mAnnotation + ", " + "[mMember] = " + mMember + ", "
					+ "[mAnnotationToAnnotation] = " + mAnnotationToAnnotation + ", " + "[mType] = " + mType + ", "
					+ "[pm] = " + pm + ", " + "[anntotatableToTannotatable] = " + anntotatableToTannotatable + ".");
		}
		AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(ruleresult,
						tType, tAnnotation, access, tSignature, tMember, memberToMember, tName, mAnnotation, mMember,
						mType, pm, anntotatableToTannotatable);
		//nothing EMoflonEdge tSignature__tMember____definitions = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tMember__tSignature____signature = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tSignature__tType____type = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge memberToMember__tMember____target = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tName__pm____model = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge pm__tName____fields = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge mMember__access____type = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge memberToMember__mMember____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge mAnnotation__mMember____bodyDeclarations = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge anntotatableToTannotatable__mMember____source = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge anntotatableToTannotatable__tMember____target = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge tAnnotation__tSignature____signature = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge access__mType____type = (EMoflonEdge) result3_green[30];
		//nothing EMoflonEdge mType__access____usagesInTypeAccess = (EMoflonEdge) result3_green[31];

		// 
		// 
		AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_11_5_registerobjects_expressionBBBBBBBBBBBBBBBB(this,
				ruleresult, tType, tAnnotation, access, mTypeToType, tSignature, tMember, memberToMember, tName,
				mAnnotation, mMember, mAnnotationToAnnotation, mType, pm, anntotatableToTannotatable);
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
		TAbstractType tType = (TAbstractType) result2_binding[0];
		TAnnotationType tAnnotation = (TAnnotationType) result2_binding[1];
		TFieldSignature tSignature = (TFieldSignature) result2_binding[2];
		TFieldDefinition tMember = (TFieldDefinition) result2_binding[3];
		TField tName = (TField) result2_binding[4];
		TypeGraph pm = (TypeGraph) result2_binding[5];
		for (Object[] result2_black : AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_12_2_corematch_blackBBFBBBFFFBB(tType, tAnnotation, tSignature, tMember,
						tName, pm, match)) {
			TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result2_black[2];
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result2_black[6];
			TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result2_black[7];
			Type mType = (Type) result2_black[8];
			// ForEach 
			for (Object[] result3_black : AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_12_3_findcontext_blackBBBBBBBBBB(tType, tAnnotation, mTypeToType,
							tSignature, tMember, tName, mAnnotation, mAnnotationToAnnotation, mType, pm)) {
				Object[] result3_green = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFFFF(tType,
								tAnnotation, mTypeToType, tSignature, tMember, tName, mAnnotation,
								mAnnotationToAnnotation, mType, pm);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge tAnnotation__pm____model = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge pm__tAnnotation____ownedTypes = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mTypeToType__tType____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tSignature__tMember____definitions = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tMember__tSignature____signature = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tSignature__tType____type = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tAnnotation__tMember____defines = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tMember__tAnnotation____definedBy = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge tName__pm____model = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge pm__tName____fields = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge mTypeToType__mType____source = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge mAnnotationToAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge tAnnotation__tSignature____signature = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge mAnnotationToAnnotation__mAnnotation____source = (EMoflonEdge) result3_green[26];

				Object[] result4_bindingAndBlack = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
								isApplicableMatch, tType, tAnnotation, mTypeToType, tSignature, tMember, tName,
								mAnnotation, mAnnotationToAnnotation, mType, pm);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tType] = " + tType + ", "
							+ "[tAnnotation] = " + tAnnotation + ", " + "[mTypeToType] = " + mTypeToType + ", "
							+ "[tSignature] = " + tSignature + ", " + "[tMember] = " + tMember + ", " + "[tName] = "
							+ tName + ", " + "[mAnnotation] = " + mAnnotation + ", " + "[mAnnotationToAnnotation] = "
							+ mAnnotationToAnnotation + ", " + "[mType] = " + mType + ", " + "[pm] = " + pm + ".");
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
	public void registerObjectsToMatch_BWD(Match match, TAbstractType tType, TAnnotationType tAnnotation,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName, TypeGraph pm) {
		match.registerObject("tType", tType);
		match.registerObject("tAnnotation", tAnnotation);
		match.registerObject("tSignature", tSignature);
		match.registerObject("tMember", tMember);
		match.registerObject("tName", tName);
		match.registerObject("pm", pm);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAbstractType tType, TAnnotationType tAnnotation,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName, TypeGraph pm) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToType, TFieldSignature tSignature,
			TFieldDefinition tMember, TField tName, AnnotationTypeDeclaration mAnnotation,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TypeGraph pm) {// Create CSP
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
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mTypeToType", mTypeToType);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("mAnnotationToAnnotation", mAnnotationToAnnotation);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("pm", pm);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tType, EObject tAnnotation, EObject access,
			EObject mTypeToType, EObject tSignature, EObject tMember, EObject memberToMember, EObject tName,
			EObject mAnnotation, EObject mMember, EObject mAnnotationToAnnotation, EObject mType, EObject pm,
			EObject anntotatableToTannotatable) {
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("access", access);
		ruleresult.registerObject("mTypeToType", mTypeToType);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("memberToMember", memberToMember);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mAnnotation", mAnnotation);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("mAnnotationToAnnotation", mAnnotationToAnnotation);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("pm", pm);
		ruleresult.registerObject("anntotatableToTannotatable", anntotatableToTannotatable);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_20(EMoflonEdge _edge_definitions) {

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
				.pattern_AnnotationTypeMember_20_2_testcorematchandDECs_blackFFFFFFB(_edge_definitions)) {
			TAbstractType tType = (TAbstractType) result2_black[0];
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[1];
			TFieldSignature tSignature = (TFieldSignature) result2_black[2];
			TFieldDefinition tMember = (TFieldDefinition) result2_black[3];
			TField tName = (TField) result2_black[4];
			TypeGraph pm = (TypeGraph) result2_black[5];
			Object[] result2_green = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
							this, match, tType, tAnnotation, tSignature, tMember, tName, pm)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_22(EMoflonEdge _edge_type) {

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
			TypeAccess access = (TypeAccess) result2_black[0];
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result2_black[1];
			AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result2_black[2];
			Type mType = (Type) result2_black[3];
			Object[] result2_green = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, access, mAnnotation, mMember, mType)) {
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
		TAbstractType tType = (TAbstractType) result2_bindingAndBlack[0];
		TAnnotationType tAnnotation = (TAnnotationType) result2_bindingAndBlack[1];
		TypeAccess access = (TypeAccess) result2_bindingAndBlack[2];
		TFieldSignature tSignature = (TFieldSignature) result2_bindingAndBlack[3];
		TFieldDefinition tMember = (TFieldDefinition) result2_bindingAndBlack[4];
		TField tName = (TField) result2_bindingAndBlack[5];
		AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result2_bindingAndBlack[6];
		AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result2_bindingAndBlack[7];
		Type mType = (Type) result2_bindingAndBlack[8];
		TypeGraph pm = (TypeGraph) result2_bindingAndBlack[9];

		Object[] result3_bindingAndBlack = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(this, tType, tAnnotation,
						access, tSignature, tMember, tName, mAnnotation, mMember, mType, pm, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tType] = " + tType + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[access] = " + access
					+ ", " + "[tSignature] = " + tSignature + ", " + "[tMember] = " + tMember + ", " + "[tName] = "
					+ tName + ", " + "[mAnnotation] = " + mAnnotation + ", " + "[mMember] = " + mMember + ", "
					+ "[mType] = " + mType + ", " + "[pm] = " + pm + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_24_5_matchcorrcontext_blackBBFBFBBB(tType, tAnnotation, mAnnotation,
							mType, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result5_black[2];
				TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result5_black[4];
				Object[] result5_green = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_24_5_matchcorrcontext_greenBBBBF(mTypeToType,
								mAnnotationToAnnotation, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_24_6_createcorrespondence_blackBBBBBBBBBBB(tType, tAnnotation,
								access, tSignature, tMember, tName, mAnnotation, mMember, mType, pm, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tType] = " + tType + ", "
							+ "[tAnnotation] = " + tAnnotation + ", " + "[access] = " + access + ", "
							+ "[tSignature] = " + tSignature + ", " + "[tMember] = " + tMember + ", " + "[tName] = "
							+ tName + ", " + "[mAnnotation] = " + mAnnotation + ", " + "[mMember] = " + mMember + ", "
							+ "[mType] = " + mType + ", " + "[pm] = " + pm + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_24_6_createcorrespondence_greenBFBFB(tMember,
						mMember, ccMatch);
				//nothing MDefinitionToTMember memberToMember = (MDefinitionToTMember) result6_green[1];
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
	public CSP isApplicable_solveCsp_CC(TAbstractType tType, TAnnotationType tAnnotation, TypeAccess access,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName, AnnotationTypeDeclaration mAnnotation,
			AnnotationTypeMemberDeclaration mMember, Type mType, TypeGraph pm, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(TypeAccess access, AnnotationTypeDeclaration mAnnotation,
			AnnotationTypeMemberDeclaration mMember, Type mType) {// 
		Object[] result1_black = AnnotationTypeMemberImpl
				.pattern_AnnotationTypeMember_27_1_matchtggpattern_blackBBBB(access, mAnnotation, mMember, mType);
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
	public boolean checkDEC_BWD(TAbstractType tType, TAnnotationType tAnnotation, TFieldSignature tSignature,
			TFieldDefinition tMember, TField tName, TypeGraph pm) {// 
		Object[] result1_black = AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_28_1_matchtggpattern_blackBBBBBB(
				tType, tAnnotation, tSignature, tMember, tName, pm);
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
			TAbstractType tType = (TAbstractType) result2_black[1];
			TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result2_black[2];
			Type mType = (Type) result2_black[3];
			//nothing RuleEntryList mAnnotationToAnnotationList = (RuleEntryList) result2_black[4];
			TAnnotationType tAnnotation = (TAnnotationType) result2_black[5];
			TypeGraph pm = (TypeGraph) result2_black[6];
			TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result2_black[7];
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result2_black[8];

			Object[] result3_bindingAndBlack = AnnotationTypeMemberImpl
					.pattern_AnnotationTypeMember_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							tType, tAnnotation, mTypeToType, mAnnotation, mAnnotationToAnnotation, mType, pm,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tType] = " + tType + ", "
						+ "[tAnnotation] = " + tAnnotation + ", " + "[mTypeToType] = " + mTypeToType + ", "
						+ "[mAnnotation] = " + mAnnotation + ", " + "[mAnnotationToAnnotation] = "
						+ mAnnotationToAnnotation + ", " + "[mType] = " + mType + ", " + "[pm] = " + pm + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnnotationTypeMemberImpl
						.pattern_AnnotationTypeMember_29_5_checknacs_blackBBBBBBB(tType, tAnnotation, mTypeToType,
								mAnnotation, mAnnotationToAnnotation, mType, pm);
				if (result5_black != null) {

					Object[] result6_black = AnnotationTypeMemberImpl
							.pattern_AnnotationTypeMember_29_6_perform_blackBBBBBBBB(tType, tAnnotation, mTypeToType,
									mAnnotation, mAnnotationToAnnotation, mType, pm, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tType] = " + tType
								+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[mTypeToType] = " + mTypeToType
								+ ", " + "[mAnnotation] = " + mAnnotation + ", " + "[mAnnotationToAnnotation] = "
								+ mAnnotationToAnnotation + ", " + "[mType] = " + mType + ", " + "[pm] = " + pm + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					AnnotationTypeMemberImpl.pattern_AnnotationTypeMember_29_6_perform_greenBBFFFFFBFBBFBB(tType,
							tAnnotation, mAnnotation, mType, pm, ruleResult, csp);
					//nothing TypeAccess access = (TypeAccess) result6_green[2];
					//nothing TFieldSignature tSignature = (TFieldSignature) result6_green[3];
					//nothing TFieldDefinition tMember = (TFieldDefinition) result6_green[4];
					//nothing MDefinitionToTMember memberToMember = (MDefinitionToTMember) result6_green[5];
					//nothing TField tName = (TField) result6_green[6];
					//nothing AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result6_green[8];
					//nothing ASTNodeToTAnnotatable anntotatableToTannotatable = (ASTNodeToTAnnotatable) result6_green[11];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToType, AnnotationTypeDeclaration mAnnotation,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TypeGraph pm,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("mTypeToType", mTypeToType);
		isApplicableMatch.registerObject("mAnnotation", mAnnotation);
		isApplicableMatch.registerObject("mAnnotationToAnnotation", mAnnotationToAnnotation);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("pm", pm);
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
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_FWD__MATCH_TYPEACCESS_ANNOTATIONTYPEDECLARATION_ANNOTATIONTYPEMEMBERDECLARATION_TYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (AnnotationTypeMemberDeclaration) arguments.get(3),
					(Type) arguments.get(4));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPEACCESS_ANNOTATIONTYPEDECLARATION_ANNOTATIONTYPEMEMBERDECLARATION_TYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (AnnotationTypeMemberDeclaration) arguments.get(3),
					(Type) arguments.get(4));
			return null;
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPEACCESS_ANNOTATIONTYPEDECLARATION_ANNOTATIONTYPEMEMBERDECLARATION_TYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(AnnotationTypeDeclaration) arguments.get(2), (AnnotationTypeMemberDeclaration) arguments.get(3),
					(Type) arguments.get(4));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TABSTRACTTYPE_TANNOTATIONTYPE_TYPEACCESS_TYPETOTABSTRACTTYPE_ANNOTATIONTYPEDECLARATION_ANNOTATIONTYPEMEMBERDECLARATION_TYPETOTABSTRACTTYPE_TYPE_TYPEGRAPH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TAbstractType) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TypeAccess) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (AnnotationTypeDeclaration) arguments.get(5),
					(AnnotationTypeMemberDeclaration) arguments.get(6), (TypeToTAbstractType) arguments.get(7),
					(Type) arguments.get(8), (TypeGraph) arguments.get(9));
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
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_BWD__MATCH_TABSTRACTTYPE_TANNOTATIONTYPE_TFIELDSIGNATURE_TFIELDDEFINITION_TFIELD_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TFieldSignature) arguments.get(3),
					(TFieldDefinition) arguments.get(4), (TField) arguments.get(5), (TypeGraph) arguments.get(6));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABSTRACTTYPE_TANNOTATIONTYPE_TFIELDSIGNATURE_TFIELDDEFINITION_TFIELD_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TFieldSignature) arguments.get(3),
					(TFieldDefinition) arguments.get(4), (TField) arguments.get(5), (TypeGraph) arguments.get(6));
			return null;
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABSTRACTTYPE_TANNOTATIONTYPE_TFIELDSIGNATURE_TFIELDDEFINITION_TFIELD_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAbstractType) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TFieldSignature) arguments.get(3),
					(TFieldDefinition) arguments.get(4), (TField) arguments.get(5), (TypeGraph) arguments.get(6));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TABSTRACTTYPE_TANNOTATIONTYPE_TYPETOTABSTRACTTYPE_TFIELDSIGNATURE_TFIELDDEFINITION_TFIELD_ANNOTATIONTYPEDECLARATION_TYPETOTABSTRACTTYPE_TYPE_TYPEGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAbstractType) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TypeToTAbstractType) arguments.get(3),
					(TFieldSignature) arguments.get(4), (TFieldDefinition) arguments.get(5), (TField) arguments.get(6),
					(AnnotationTypeDeclaration) arguments.get(7), (TypeToTAbstractType) arguments.get(8),
					(Type) arguments.get(9), (TypeGraph) arguments.get(10));
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
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_20__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_20((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_22__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_22((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_SOLVE_CSP_CC__TABSTRACTTYPE_TANNOTATIONTYPE_TYPEACCESS_TFIELDSIGNATURE_TFIELDDEFINITION_TFIELD_ANNOTATIONTYPEDECLARATION_ANNOTATIONTYPEMEMBERDECLARATION_TYPE_TYPEGRAPH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TAbstractType) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TypeAccess) arguments.get(2), (TFieldSignature) arguments.get(3),
					(TFieldDefinition) arguments.get(4), (TField) arguments.get(5),
					(AnnotationTypeDeclaration) arguments.get(6), (AnnotationTypeMemberDeclaration) arguments.get(7),
					(Type) arguments.get(8), (TypeGraph) arguments.get(9), (Match) arguments.get(10),
					(Match) arguments.get(11));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___CHECK_DEC_FWD__TYPEACCESS_ANNOTATIONTYPEDECLARATION_ANNOTATIONTYPEMEMBERDECLARATION_TYPE:
			return checkDEC_FWD((TypeAccess) arguments.get(0), (AnnotationTypeDeclaration) arguments.get(1),
					(AnnotationTypeMemberDeclaration) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___CHECK_DEC_BWD__TABSTRACTTYPE_TANNOTATIONTYPE_TFIELDSIGNATURE_TFIELDDEFINITION_TFIELD_TYPEGRAPH:
			return checkDEC_BWD((TAbstractType) arguments.get(0), (TAnnotationType) arguments.get(1),
					(TFieldSignature) arguments.get(2), (TFieldDefinition) arguments.get(3), (TField) arguments.get(4),
					(TypeGraph) arguments.get(5));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TABSTRACTTYPE_TANNOTATIONTYPE_TYPETOTABSTRACTTYPE_ANNOTATIONTYPEDECLARATION_TYPETOTABSTRACTTYPE_TYPE_TYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAbstractType) arguments.get(1),
					(TAnnotationType) arguments.get(2), (TypeToTAbstractType) arguments.get(3),
					(AnnotationTypeDeclaration) arguments.get(4), (TypeToTAbstractType) arguments.get(5),
					(Type) arguments.get(6), (TypeGraph) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.ANNOTATION_TYPE_MEMBER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnnotationTypeMember_0_1_initialbindings_blackBBBBBB(
			AnnotationTypeMember _this, Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation,
			AnnotationTypeMemberDeclaration mMember, Type mType) {
		if (!mAnnotation.equals(mType)) {
			return new Object[] { _this, match, access, mAnnotation, mMember, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_0_2_SolveCSP_bindingFBBBBBB(AnnotationTypeMember _this,
			Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation,
			AnnotationTypeMemberDeclaration mMember, Type mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, access, mAnnotation, mMember, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, access, mAnnotation, mMember, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			AnnotationTypeMember _this, Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation,
			AnnotationTypeMemberDeclaration mMember, Type mType) {
		Object[] result_pattern_AnnotationTypeMember_0_2_SolveCSP_binding = pattern_AnnotationTypeMember_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, access, mAnnotation, mMember, mType);
		if (result_pattern_AnnotationTypeMember_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeMember_0_2_SolveCSP_black = pattern_AnnotationTypeMember_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, access, mAnnotation, mMember, mType };
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
			TypeAccess access, AnnotationTypeDeclaration mAnnotation, AnnotationTypeMemberDeclaration mMember,
			Type mType) {
		if (!mAnnotation.equals(mType)) {
			return new Object[] { match, access, mAnnotation, mMember, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_0_4_collectelementstobetranslated_greenBBBBBFFFFF(
			Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation,
			AnnotationTypeMemberDeclaration mMember, Type mType) {
		EMoflonEdge mMember__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(access);
		match.getToBeTranslatedNodes().add(mMember);
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
		return new Object[] { match, access, mAnnotation, mMember, mType, mMember__access____type,
				mAnnotation__mMember____bodyDeclarations, mMember__mAnnotation____abstractTypeDeclaration,
				access__mType____type, mType__access____usagesInTypeAccess };
	}

	public static final Object[] pattern_AnnotationTypeMember_0_5_collectcontextelements_blackBBBBB(Match match,
			TypeAccess access, AnnotationTypeDeclaration mAnnotation, AnnotationTypeMemberDeclaration mMember,
			Type mType) {
		if (!mAnnotation.equals(mType)) {
			return new Object[] { match, access, mAnnotation, mMember, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_0_5_collectcontextelements_greenBBB(Match match,
			AnnotationTypeDeclaration mAnnotation, Type mType) {
		match.getContextNodes().add(mAnnotation);
		match.getContextNodes().add(mType);
		return new Object[] { match, mAnnotation, mType };
	}

	public static final void pattern_AnnotationTypeMember_0_6_registerobjectstomatch_expressionBBBBBB(
			AnnotationTypeMember _this, Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation,
			AnnotationTypeMemberDeclaration mMember, Type mType) {
		_this.registerObjectsToMatch_FWD(match, access, mAnnotation, mMember, mType);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("tType");
		EObject _localVariable_1 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_2 = isApplicableMatch.getObject("access");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeToType");
		EObject _localVariable_4 = isApplicableMatch.getObject("mAnnotation");
		EObject _localVariable_5 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_6 = isApplicableMatch.getObject("mAnnotationToAnnotation");
		EObject _localVariable_7 = isApplicableMatch.getObject("mType");
		EObject _localVariable_8 = isApplicableMatch.getObject("pm");
		EObject tmpTType = _localVariable_0;
		EObject tmpTAnnotation = _localVariable_1;
		EObject tmpAccess = _localVariable_2;
		EObject tmpMTypeToType = _localVariable_3;
		EObject tmpMAnnotation = _localVariable_4;
		EObject tmpMMember = _localVariable_5;
		EObject tmpMAnnotationToAnnotation = _localVariable_6;
		EObject tmpMType = _localVariable_7;
		EObject tmpPm = _localVariable_8;
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			if (tmpTAnnotation instanceof TAnnotationType) {
				TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
				if (tmpAccess instanceof TypeAccess) {
					TypeAccess access = (TypeAccess) tmpAccess;
					if (tmpMTypeToType instanceof TypeToTAbstractType) {
						TypeToTAbstractType mTypeToType = (TypeToTAbstractType) tmpMTypeToType;
						if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
							AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
							if (tmpMMember instanceof AnnotationTypeMemberDeclaration) {
								AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) tmpMMember;
								if (tmpMAnnotationToAnnotation instanceof TypeToTAbstractType) {
									TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) tmpMAnnotationToAnnotation;
									if (tmpMType instanceof Type) {
										Type mType = (Type) tmpMType;
										if (tmpPm instanceof TypeGraph) {
											TypeGraph pm = (TypeGraph) tmpPm;
											return new Object[] { tType, tAnnotation, access, mTypeToType, mAnnotation,
													mMember, mAnnotationToAnnotation, mType, pm, isApplicableMatch };
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
			TAbstractType tType, TAnnotationType tAnnotation, TypeAccess access, TypeToTAbstractType mTypeToType,
			AnnotationTypeDeclaration mAnnotation, AnnotationTypeMemberDeclaration mMember,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TypeGraph pm, AnnotationTypeMember _this,
			IsApplicableMatch isApplicableMatch) {
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!mAnnotationToAnnotation.equals(mTypeToType)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { tType, tAnnotation, access, mTypeToType, mAnnotation, mMember,
									mAnnotationToAnnotation, mType, pm, csp, _this, isApplicableMatch };
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
			TAbstractType tType = (TAbstractType) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[0];
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[1];
			TypeAccess access = (TypeAccess) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[2];
			TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[3];
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[4];
			AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[5];
			TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[6];
			Type mType = (Type) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[7];
			TypeGraph pm = (TypeGraph) result_pattern_AnnotationTypeMember_1_1_performtransformation_binding[8];

			Object[] result_pattern_AnnotationTypeMember_1_1_performtransformation_black = pattern_AnnotationTypeMember_1_1_performtransformation_blackBBBBBBBBBFBB(
					tType, tAnnotation, access, mTypeToType, mAnnotation, mMember, mAnnotationToAnnotation, mType, pm,
					_this, isApplicableMatch);
			if (result_pattern_AnnotationTypeMember_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationTypeMember_1_1_performtransformation_black[9];

				return new Object[] { tType, tAnnotation, access, mTypeToType, mAnnotation, mMember,
						mAnnotationToAnnotation, mType, pm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_1_1_performtransformation_greenBBFFFFBBFB(
			TAbstractType tType, TAnnotationType tAnnotation, AnnotationTypeMemberDeclaration mMember, TypeGraph pm,
			CSP csp) {
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		TFieldDefinition tMember = BasicFactory.eINSTANCE.createTFieldDefinition();
		MDefinitionToTMember memberToMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TField tName = BasicFactory.eINSTANCE.createTField();
		ASTNodeToTAnnotatable anntotatableToTannotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tSignature", "upperBound");
		Object _localVariable_1 = csp.getValue("tName", "tName");
		tSignature.setType(tType);
		tAnnotation.getSignature().add(tSignature);
		tSignature.getDefinitions().add(tMember);
		tAnnotation.getDefines().add(tMember);
		memberToMember.setTarget(tMember);
		memberToMember.setSource(mMember);
		tName.setModel(pm);
		tName.getSignatures().add(tSignature);
		anntotatableToTannotatable.setSource(mMember);
		anntotatableToTannotatable.setTarget(tMember);
		tSignature.setLowerBound(Integer.valueOf(tSignature_lowerBound_prime));
		int tSignature_upperBound_prime = (int) _localVariable_0;
		String tName_tName_prime = (String) _localVariable_1;
		tSignature.setUpperBound(Integer.valueOf(tSignature_upperBound_prime));
		tName.setTName(tName_tName_prime);
		return new Object[] { tType, tAnnotation, tSignature, tMember, memberToMember, tName, mMember, pm,
				anntotatableToTannotatable, csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_1_2_collecttranslatedelements_blackBBBBBBB(
			TypeAccess access, TFieldSignature tSignature, TFieldDefinition tMember,
			MDefinitionToTMember memberToMember, TField tName, AnnotationTypeMemberDeclaration mMember,
			ASTNodeToTAnnotatable anntotatableToTannotatable) {
		return new Object[] { access, tSignature, tMember, memberToMember, tName, mMember, anntotatableToTannotatable };
	}

	public static final Object[] pattern_AnnotationTypeMember_1_2_collecttranslatedelements_greenFBBBBBBB(
			TypeAccess access, TFieldSignature tSignature, TFieldDefinition tMember,
			MDefinitionToTMember memberToMember, TField tName, AnnotationTypeMemberDeclaration mMember,
			ASTNodeToTAnnotatable anntotatableToTannotatable) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(access);
		ruleresult.getCreatedElements().add(tSignature);
		ruleresult.getCreatedElements().add(tMember);
		ruleresult.getCreatedLinkElements().add(memberToMember);
		ruleresult.getCreatedElements().add(tName);
		ruleresult.getTranslatedElements().add(mMember);
		ruleresult.getCreatedLinkElements().add(anntotatableToTannotatable);
		return new Object[] { ruleresult, access, tSignature, tMember, memberToMember, tName, mMember,
				anntotatableToTannotatable };
	}

	public static final Object[] pattern_AnnotationTypeMember_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tType, EObject tAnnotation, EObject access, EObject mTypeToType,
			EObject tSignature, EObject tMember, EObject memberToMember, EObject tName, EObject mAnnotation,
			EObject mMember, EObject mAnnotationToAnnotation, EObject mType, EObject pm,
			EObject anntotatableToTannotatable) {
		if (!tAnnotation.equals(tType)) {
			if (!tAnnotation.equals(tSignature)) {
				if (!tAnnotation.equals(tMember)) {
					if (!tAnnotation.equals(tName)) {
						if (!access.equals(tType)) {
							if (!access.equals(tAnnotation)) {
								if (!access.equals(mTypeToType)) {
									if (!access.equals(tSignature)) {
										if (!access.equals(tMember)) {
											if (!access.equals(memberToMember)) {
												if (!access.equals(tName)) {
													if (!access.equals(mAnnotation)) {
														if (!access.equals(mMember)) {
															if (!access.equals(mAnnotationToAnnotation)) {
																if (!access.equals(mType)) {
																	if (!access.equals(pm)) {
																		if (!access
																				.equals(anntotatableToTannotatable)) {
																			if (!mTypeToType.equals(tType)) {
																				if (!mTypeToType.equals(tAnnotation)) {
																					if (!mTypeToType
																							.equals(tSignature)) {
																						if (!mTypeToType
																								.equals(tMember)) {
																							if (!mTypeToType.equals(
																									memberToMember)) {
																								if (!mTypeToType.equals(
																										tName)) {
																									if (!mTypeToType
																											.equals(pm)) {
																										if (!tSignature
																												.equals(tType)) {
																											if (!tMember
																													.equals(tType)) {
																												if (!tMember
																														.equals(tSignature)) {
																													if (!tMember
																															.equals(tName)) {
																														if (!memberToMember
																																.equals(tType)) {
																															if (!memberToMember
																																	.equals(tAnnotation)) {
																																if (!memberToMember
																																		.equals(tSignature)) {
																																	if (!memberToMember
																																			.equals(tMember)) {
																																		if (!memberToMember
																																				.equals(tName)) {
																																			if (!memberToMember
																																					.equals(pm)) {
																																				if (!tName
																																						.equals(tType)) {
																																					if (!tName
																																							.equals(tSignature)) {
																																						if (!mAnnotation
																																								.equals(tType)) {
																																							if (!mAnnotation
																																									.equals(tAnnotation)) {
																																								if (!mAnnotation
																																										.equals(mTypeToType)) {
																																									if (!mAnnotation
																																											.equals(tSignature)) {
																																										if (!mAnnotation
																																												.equals(tMember)) {
																																											if (!mAnnotation
																																													.equals(memberToMember)) {
																																												if (!mAnnotation
																																														.equals(tName)) {
																																													if (!mAnnotation
																																															.equals(mMember)) {
																																														if (!mAnnotation
																																																.equals(mAnnotationToAnnotation)) {
																																															if (!mAnnotation
																																																	.equals(mType)) {
																																																if (!mAnnotation
																																																		.equals(pm)) {
																																																	if (!mMember
																																																			.equals(tType)) {
																																																		if (!mMember
																																																				.equals(tAnnotation)) {
																																																			if (!mMember
																																																					.equals(mTypeToType)) {
																																																				if (!mMember
																																																						.equals(tSignature)) {
																																																					if (!mMember
																																																							.equals(tMember)) {
																																																						if (!mMember
																																																								.equals(memberToMember)) {
																																																							if (!mMember
																																																									.equals(tName)) {
																																																								if (!mMember
																																																										.equals(mType)) {
																																																									if (!mMember
																																																											.equals(pm)) {
																																																										if (!mAnnotationToAnnotation
																																																												.equals(tType)) {
																																																											if (!mAnnotationToAnnotation
																																																													.equals(tAnnotation)) {
																																																												if (!mAnnotationToAnnotation
																																																														.equals(mTypeToType)) {
																																																													if (!mAnnotationToAnnotation
																																																															.equals(tSignature)) {
																																																														if (!mAnnotationToAnnotation
																																																																.equals(tMember)) {
																																																															if (!mAnnotationToAnnotation
																																																																	.equals(memberToMember)) {
																																																																if (!mAnnotationToAnnotation
																																																																		.equals(tName)) {
																																																																	if (!mAnnotationToAnnotation
																																																																			.equals(mMember)) {
																																																																		if (!mAnnotationToAnnotation
																																																																				.equals(mType)) {
																																																																			if (!mAnnotationToAnnotation
																																																																					.equals(pm)) {
																																																																				if (!mType
																																																																						.equals(tType)) {
																																																																					if (!mType
																																																																							.equals(tAnnotation)) {
																																																																						if (!mType
																																																																								.equals(mTypeToType)) {
																																																																							if (!mType
																																																																									.equals(tSignature)) {
																																																																								if (!mType
																																																																										.equals(tMember)) {
																																																																									if (!mType
																																																																											.equals(memberToMember)) {
																																																																										if (!mType
																																																																												.equals(tName)) {
																																																																											if (!mType
																																																																													.equals(pm)) {
																																																																												if (!pm.equals(
																																																																														tType)) {
																																																																													if (!pm.equals(
																																																																															tAnnotation)) {
																																																																														if (!pm.equals(
																																																																																tSignature)) {
																																																																															if (!pm.equals(
																																																																																	tMember)) {
																																																																																if (!pm.equals(
																																																																																		tName)) {
																																																																																	if (!anntotatableToTannotatable
																																																																																			.equals(tType)) {
																																																																																		if (!anntotatableToTannotatable
																																																																																				.equals(tAnnotation)) {
																																																																																			if (!anntotatableToTannotatable
																																																																																					.equals(mTypeToType)) {
																																																																																				if (!anntotatableToTannotatable
																																																																																						.equals(tSignature)) {
																																																																																					if (!anntotatableToTannotatable
																																																																																							.equals(tMember)) {
																																																																																						if (!anntotatableToTannotatable
																																																																																								.equals(memberToMember)) {
																																																																																							if (!anntotatableToTannotatable
																																																																																									.equals(tName)) {
																																																																																								if (!anntotatableToTannotatable
																																																																																										.equals(mAnnotation)) {
																																																																																									if (!anntotatableToTannotatable
																																																																																											.equals(mMember)) {
																																																																																										if (!anntotatableToTannotatable
																																																																																												.equals(mAnnotationToAnnotation)) {
																																																																																											if (!anntotatableToTannotatable
																																																																																													.equals(mType)) {
																																																																																												if (!anntotatableToTannotatable
																																																																																														.equals(pm)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															tType,
																																																																																															tAnnotation,
																																																																																															access,
																																																																																															mTypeToType,
																																																																																															tSignature,
																																																																																															tMember,
																																																																																															memberToMember,
																																																																																															tName,
																																																																																															mAnnotation,
																																																																																															mMember,
																																																																																															mAnnotationToAnnotation,
																																																																																															mType,
																																																																																															pm,
																																																																																															anntotatableToTannotatable };
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject tType, EObject tAnnotation, EObject access, EObject tSignature,
			EObject tMember, EObject memberToMember, EObject tName, EObject mAnnotation, EObject mMember, EObject mType,
			EObject pm, EObject anntotatableToTannotatable) {
		EMoflonEdge tSignature__tMember____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge memberToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge memberToMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge anntotatableToTannotatable__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge anntotatableToTannotatable__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeMember";
		String tSignature__tMember____definitions_name_prime = "definitions";
		String tMember__tSignature____signature_name_prime = "signature";
		String tSignature__tType____type_name_prime = "type";
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		String memberToMember__tMember____target_name_prime = "target";
		String tName__pm____model_name_prime = "model";
		String pm__tName____fields_name_prime = "fields";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____field_name_prime = "field";
		String mMember__access____type_name_prime = "type";
		String memberToMember__mMember____source_name_prime = "source";
		String mAnnotation__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__mAnnotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String anntotatableToTannotatable__mMember____source_name_prime = "source";
		String anntotatableToTannotatable__tMember____target_name_prime = "target";
		String tAnnotation__tSignature____signature_name_prime = "signature";
		String access__mType____type_name_prime = "type";
		String mType__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		tSignature__tMember____definitions.setSrc(tSignature);
		tSignature__tMember____definitions.setTrg(tMember);
		ruleresult.getCreatedEdges().add(tSignature__tMember____definitions);
		tMember__tSignature____signature.setSrc(tMember);
		tMember__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tMember__tSignature____signature);
		tSignature__tType____type.setSrc(tSignature);
		tSignature__tType____type.setTrg(tType);
		ruleresult.getCreatedEdges().add(tSignature__tType____type);
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		ruleresult.getCreatedEdges().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(tMember__tAnnotation____definedBy);
		memberToMember__tMember____target.setSrc(memberToMember);
		memberToMember__tMember____target.setTrg(tMember);
		ruleresult.getCreatedEdges().add(memberToMember__tMember____target);
		tName__pm____model.setSrc(tName);
		tName__pm____model.setTrg(pm);
		ruleresult.getCreatedEdges().add(tName__pm____model);
		pm__tName____fields.setSrc(pm);
		pm__tName____fields.setTrg(tName);
		ruleresult.getCreatedEdges().add(pm__tName____fields);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		ruleresult.getCreatedEdges().add(tSignature__tName____field);
		mMember__access____type.setSrc(mMember);
		mMember__access____type.setTrg(access);
		ruleresult.getTranslatedEdges().add(mMember__access____type);
		memberToMember__mMember____source.setSrc(memberToMember);
		memberToMember__mMember____source.setTrg(mMember);
		ruleresult.getCreatedEdges().add(memberToMember__mMember____source);
		mAnnotation__mMember____bodyDeclarations.setSrc(mAnnotation);
		mAnnotation__mMember____bodyDeclarations.setTrg(mMember);
		ruleresult.getTranslatedEdges().add(mAnnotation__mMember____bodyDeclarations);
		mMember__mAnnotation____abstractTypeDeclaration.setSrc(mMember);
		mMember__mAnnotation____abstractTypeDeclaration.setTrg(mAnnotation);
		ruleresult.getTranslatedEdges().add(mMember__mAnnotation____abstractTypeDeclaration);
		anntotatableToTannotatable__mMember____source.setSrc(anntotatableToTannotatable);
		anntotatableToTannotatable__mMember____source.setTrg(mMember);
		ruleresult.getCreatedEdges().add(anntotatableToTannotatable__mMember____source);
		anntotatableToTannotatable__tMember____target.setSrc(anntotatableToTannotatable);
		anntotatableToTannotatable__tMember____target.setTrg(tMember);
		ruleresult.getCreatedEdges().add(anntotatableToTannotatable__tMember____target);
		tAnnotation__tSignature____signature.setSrc(tAnnotation);
		tAnnotation__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tAnnotation__tSignature____signature);
		access__mType____type.setSrc(access);
		access__mType____type.setTrg(mType);
		ruleresult.getTranslatedEdges().add(access__mType____type);
		mType__access____usagesInTypeAccess.setSrc(mType);
		mType__access____usagesInTypeAccess.setTrg(access);
		ruleresult.getTranslatedEdges().add(mType__access____usagesInTypeAccess);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tSignature__tMember____definitions.setName(tSignature__tMember____definitions_name_prime);
		tMember__tSignature____signature.setName(tMember__tSignature____signature_name_prime);
		tSignature__tType____type.setName(tSignature__tType____type_name_prime);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		memberToMember__tMember____target.setName(memberToMember__tMember____target_name_prime);
		tName__pm____model.setName(tName__pm____model_name_prime);
		pm__tName____fields.setName(pm__tName____fields_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		mMember__access____type.setName(mMember__access____type_name_prime);
		memberToMember__mMember____source.setName(memberToMember__mMember____source_name_prime);
		mAnnotation__mMember____bodyDeclarations.setName(mAnnotation__mMember____bodyDeclarations_name_prime);
		mMember__mAnnotation____abstractTypeDeclaration
				.setName(mMember__mAnnotation____abstractTypeDeclaration_name_prime);
		anntotatableToTannotatable__mMember____source.setName(anntotatableToTannotatable__mMember____source_name_prime);
		anntotatableToTannotatable__tMember____target.setName(anntotatableToTannotatable__tMember____target_name_prime);
		tAnnotation__tSignature____signature.setName(tAnnotation__tSignature____signature_name_prime);
		access__mType____type.setName(access__mType____type_name_prime);
		mType__access____usagesInTypeAccess.setName(mType__access____usagesInTypeAccess_name_prime);
		return new Object[] { ruleresult, tType, tAnnotation, access, tSignature, tMember, memberToMember, tName,
				mAnnotation, mMember, mType, pm, anntotatableToTannotatable, tSignature__tMember____definitions,
				tMember__tSignature____signature, tSignature__tType____type, tAnnotation__tMember____defines,
				tMember__tAnnotation____definedBy, memberToMember__tMember____target, tName__pm____model,
				pm__tName____fields, tName__tSignature____signatures, tSignature__tName____field,
				mMember__access____type, memberToMember__mMember____source, mAnnotation__mMember____bodyDeclarations,
				mMember__mAnnotation____abstractTypeDeclaration, anntotatableToTannotatable__mMember____source,
				anntotatableToTannotatable__tMember____target, tAnnotation__tSignature____signature,
				access__mType____type, mType__access____usagesInTypeAccess };
	}

	public static final void pattern_AnnotationTypeMember_1_5_registerobjects_expressionBBBBBBBBBBBBBBBB(
			AnnotationTypeMember _this, PerformRuleResult ruleresult, EObject tType, EObject tAnnotation,
			EObject access, EObject mTypeToType, EObject tSignature, EObject tMember, EObject memberToMember,
			EObject tName, EObject mAnnotation, EObject mMember, EObject mAnnotationToAnnotation, EObject mType,
			EObject pm, EObject anntotatableToTannotatable) {
		_this.registerObjects_FWD(ruleresult, tType, tAnnotation, access, mTypeToType, tSignature, tMember,
				memberToMember, tName, mAnnotation, mMember, mAnnotationToAnnotation, mType, pm,
				anntotatableToTannotatable);

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
		EObject _localVariable_0 = match.getObject("access");
		EObject _localVariable_1 = match.getObject("mAnnotation");
		EObject _localVariable_2 = match.getObject("mMember");
		EObject _localVariable_3 = match.getObject("mType");
		EObject tmpAccess = _localVariable_0;
		EObject tmpMAnnotation = _localVariable_1;
		EObject tmpMMember = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		if (tmpAccess instanceof TypeAccess) {
			TypeAccess access = (TypeAccess) tmpAccess;
			if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
				if (tmpMMember instanceof AnnotationTypeMemberDeclaration) {
					AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) tmpMMember;
					if (tmpMType instanceof Type) {
						Type mType = (Type) tmpMType;
						return new Object[] { access, mAnnotation, mMember, mType, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_2_2_corematch_blackFFBFBBFBB(TypeAccess access,
			AnnotationTypeDeclaration mAnnotation, AnnotationTypeMemberDeclaration mMember, Type mType, Match match) {
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
									_result.add(new Object[] { tType, tAnnotation, access, mTypeToType, mAnnotation,
											mMember, mAnnotationToAnnotation, mType, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_2_3_findcontext_blackBBBBBBBBF(
			TAbstractType tType, TAnnotationType tAnnotation, TypeAccess access, TypeToTAbstractType mTypeToType,
			AnnotationTypeDeclaration mAnnotation, AnnotationTypeMemberDeclaration mMember,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!mAnnotationToAnnotation.equals(mTypeToType)) {
					if (tType.equals(mTypeToType.getTarget())) {
						if (access.equals(mMember.getType())) {
							if (mType.equals(mTypeToType.getSource())) {
								if (tAnnotation.equals(mAnnotationToAnnotation.getTarget())) {
									if (mAnnotation.getBodyDeclarations().contains(mMember)) {
										if (mAnnotation.equals(mAnnotationToAnnotation.getSource())) {
											if (mType.equals(access.getType())) {
												TypeGraph pm = tAnnotation.getModel();
												if (pm != null) {
													_result.add(new Object[] { tType, tAnnotation, access, mTypeToType,
															mAnnotation, mMember, mAnnotationToAnnotation, mType, pm });
												}

											}
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
			TAbstractType tType, TAnnotationType tAnnotation, TypeAccess access, TypeToTAbstractType mTypeToType,
			AnnotationTypeDeclaration mAnnotation, AnnotationTypeMemberDeclaration mMember,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TypeGraph pm) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tAnnotation__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tAnnotation____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationToAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationToAnnotation__mAnnotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tAnnotation__pm____model_name_prime = "model";
		String pm__tAnnotation____ownedTypes_name_prime = "ownedTypes";
		String mTypeToType__tType____target_name_prime = "target";
		String mMember__access____type_name_prime = "type";
		String mTypeToType__mType____source_name_prime = "source";
		String mAnnotationToAnnotation__tAnnotation____target_name_prime = "target";
		String mAnnotation__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__mAnnotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mAnnotationToAnnotation__mAnnotation____source_name_prime = "source";
		String access__mType____type_name_prime = "type";
		String mType__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(access);
		isApplicableMatch.getAllContextElements().add(mTypeToType);
		isApplicableMatch.getAllContextElements().add(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(mAnnotationToAnnotation);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(pm);
		tAnnotation__pm____model.setSrc(tAnnotation);
		tAnnotation__pm____model.setTrg(pm);
		isApplicableMatch.getAllContextElements().add(tAnnotation__pm____model);
		pm__tAnnotation____ownedTypes.setSrc(pm);
		pm__tAnnotation____ownedTypes.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(pm__tAnnotation____ownedTypes);
		mTypeToType__tType____target.setSrc(mTypeToType);
		mTypeToType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToType__tType____target);
		mMember__access____type.setSrc(mMember);
		mMember__access____type.setTrg(access);
		isApplicableMatch.getAllContextElements().add(mMember__access____type);
		mTypeToType__mType____source.setSrc(mTypeToType);
		mTypeToType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToType__mType____source);
		mAnnotationToAnnotation__tAnnotation____target.setSrc(mAnnotationToAnnotation);
		mAnnotationToAnnotation__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotationToAnnotation__tAnnotation____target);
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
		pm__tAnnotation____ownedTypes.setName(pm__tAnnotation____ownedTypes_name_prime);
		mTypeToType__tType____target.setName(mTypeToType__tType____target_name_prime);
		mMember__access____type.setName(mMember__access____type_name_prime);
		mTypeToType__mType____source.setName(mTypeToType__mType____source_name_prime);
		mAnnotationToAnnotation__tAnnotation____target
				.setName(mAnnotationToAnnotation__tAnnotation____target_name_prime);
		mAnnotation__mMember____bodyDeclarations.setName(mAnnotation__mMember____bodyDeclarations_name_prime);
		mMember__mAnnotation____abstractTypeDeclaration
				.setName(mMember__mAnnotation____abstractTypeDeclaration_name_prime);
		mAnnotationToAnnotation__mAnnotation____source
				.setName(mAnnotationToAnnotation__mAnnotation____source_name_prime);
		access__mType____type.setName(access__mType____type_name_prime);
		mType__access____usagesInTypeAccess.setName(mType__access____usagesInTypeAccess_name_prime);
		return new Object[] { tType, tAnnotation, access, mTypeToType, mAnnotation, mMember, mAnnotationToAnnotation,
				mType, pm, isApplicableMatch, tAnnotation__pm____model, pm__tAnnotation____ownedTypes,
				mTypeToType__tType____target, mMember__access____type, mTypeToType__mType____source,
				mAnnotationToAnnotation__tAnnotation____target, mAnnotation__mMember____bodyDeclarations,
				mMember__mAnnotation____abstractTypeDeclaration, mAnnotationToAnnotation__mAnnotation____source,
				access__mType____type, mType__access____usagesInTypeAccess };
	}

	public static final Object[] pattern_AnnotationTypeMember_2_4_solveCSP_bindingFBBBBBBBBBBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TAnnotationType tAnnotation, TypeAccess access, TypeToTAbstractType mTypeToType,
			AnnotationTypeDeclaration mAnnotation, AnnotationTypeMemberDeclaration mMember,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TypeGraph pm) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tType, tAnnotation, access,
				mTypeToType, mAnnotation, mMember, mAnnotationToAnnotation, mType, pm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tType, tAnnotation, access, mTypeToType, mAnnotation,
					mMember, mAnnotationToAnnotation, mType, pm };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TAnnotationType tAnnotation, TypeAccess access, TypeToTAbstractType mTypeToType,
			AnnotationTypeDeclaration mAnnotation, AnnotationTypeMemberDeclaration mMember,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TypeGraph pm) {
		Object[] result_pattern_AnnotationTypeMember_2_4_solveCSP_binding = pattern_AnnotationTypeMember_2_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, tType, tAnnotation, access, mTypeToType, mAnnotation, mMember,
				mAnnotationToAnnotation, mType, pm);
		if (result_pattern_AnnotationTypeMember_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeMember_2_4_solveCSP_black = pattern_AnnotationTypeMember_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tType, tAnnotation, access, mTypeToType,
						mAnnotation, mMember, mAnnotationToAnnotation, mType, pm };
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
			AnnotationTypeMember _this, Match match, TAbstractType tType, TAnnotationType tAnnotation,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName, TypeGraph pm) {
		if (!tAnnotation.equals(tType)) {
			return new Object[] { _this, match, tType, tAnnotation, tSignature, tMember, tName, pm };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_10_2_SolveCSP_bindingFBBBBBBBB(AnnotationTypeMember _this,
			Match match, TAbstractType tType, TAnnotationType tAnnotation, TFieldSignature tSignature,
			TFieldDefinition tMember, TField tName, TypeGraph pm) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tType, tAnnotation, tSignature, tMember, tName,
				pm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tType, tAnnotation, tSignature, tMember, tName, pm };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_10_2_SolveCSP_bindingAndBlackFBBBBBBBB(
			AnnotationTypeMember _this, Match match, TAbstractType tType, TAnnotationType tAnnotation,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName, TypeGraph pm) {
		Object[] result_pattern_AnnotationTypeMember_10_2_SolveCSP_binding = pattern_AnnotationTypeMember_10_2_SolveCSP_bindingFBBBBBBBB(
				_this, match, tType, tAnnotation, tSignature, tMember, tName, pm);
		if (result_pattern_AnnotationTypeMember_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeMember_10_2_SolveCSP_black = pattern_AnnotationTypeMember_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tType, tAnnotation, tSignature, tMember, tName, pm };
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
			Match match, TAbstractType tType, TAnnotationType tAnnotation, TFieldSignature tSignature,
			TFieldDefinition tMember, TField tName, TypeGraph pm) {
		if (!tAnnotation.equals(tType)) {
			return new Object[] { match, tType, tAnnotation, tSignature, tMember, tName, pm };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_10_4_collectelementstobetranslated_greenBBBBBBBFFFFFFFFFF(
			Match match, TAbstractType tType, TAnnotationType tAnnotation, TFieldSignature tSignature,
			TFieldDefinition tMember, TField tName, TypeGraph pm) {
		EMoflonEdge tSignature__tMember____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSignature);
		match.getToBeTranslatedNodes().add(tMember);
		match.getToBeTranslatedNodes().add(tName);
		String tSignature__tMember____definitions_name_prime = "definitions";
		String tMember__tSignature____signature_name_prime = "signature";
		String tSignature__tType____type_name_prime = "type";
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		String tName__pm____model_name_prime = "model";
		String pm__tName____fields_name_prime = "fields";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____field_name_prime = "field";
		String tAnnotation__tSignature____signature_name_prime = "signature";
		tSignature__tMember____definitions.setSrc(tSignature);
		tSignature__tMember____definitions.setTrg(tMember);
		match.getToBeTranslatedEdges().add(tSignature__tMember____definitions);
		tMember__tSignature____signature.setSrc(tMember);
		tMember__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tMember__tSignature____signature);
		tSignature__tType____type.setSrc(tSignature);
		tSignature__tType____type.setTrg(tType);
		match.getToBeTranslatedEdges().add(tSignature__tType____type);
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		match.getToBeTranslatedEdges().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		match.getToBeTranslatedEdges().add(tMember__tAnnotation____definedBy);
		tName__pm____model.setSrc(tName);
		tName__pm____model.setTrg(pm);
		match.getToBeTranslatedEdges().add(tName__pm____model);
		pm__tName____fields.setSrc(pm);
		pm__tName____fields.setTrg(tName);
		match.getToBeTranslatedEdges().add(pm__tName____fields);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		match.getToBeTranslatedEdges().add(tSignature__tName____field);
		tAnnotation__tSignature____signature.setSrc(tAnnotation);
		tAnnotation__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tAnnotation__tSignature____signature);
		tSignature__tMember____definitions.setName(tSignature__tMember____definitions_name_prime);
		tMember__tSignature____signature.setName(tMember__tSignature____signature_name_prime);
		tSignature__tType____type.setName(tSignature__tType____type_name_prime);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		tName__pm____model.setName(tName__pm____model_name_prime);
		pm__tName____fields.setName(pm__tName____fields_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tAnnotation__tSignature____signature.setName(tAnnotation__tSignature____signature_name_prime);
		return new Object[] { match, tType, tAnnotation, tSignature, tMember, tName, pm,
				tSignature__tMember____definitions, tMember__tSignature____signature, tSignature__tType____type,
				tAnnotation__tMember____defines, tMember__tAnnotation____definedBy, tName__pm____model,
				pm__tName____fields, tName__tSignature____signatures, tSignature__tName____field,
				tAnnotation__tSignature____signature };
	}

	public static final Object[] pattern_AnnotationTypeMember_10_5_collectcontextelements_blackBBBBBBB(Match match,
			TAbstractType tType, TAnnotationType tAnnotation, TFieldSignature tSignature, TFieldDefinition tMember,
			TField tName, TypeGraph pm) {
		if (!tAnnotation.equals(tType)) {
			return new Object[] { match, tType, tAnnotation, tSignature, tMember, tName, pm };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_10_5_collectcontextelements_greenBBBBFF(Match match,
			TAbstractType tType, TAnnotationType tAnnotation, TypeGraph pm) {
		EMoflonEdge tAnnotation__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tAnnotation____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tType);
		match.getContextNodes().add(tAnnotation);
		match.getContextNodes().add(pm);
		String tAnnotation__pm____model_name_prime = "model";
		String pm__tAnnotation____ownedTypes_name_prime = "ownedTypes";
		tAnnotation__pm____model.setSrc(tAnnotation);
		tAnnotation__pm____model.setTrg(pm);
		match.getContextEdges().add(tAnnotation__pm____model);
		pm__tAnnotation____ownedTypes.setSrc(pm);
		pm__tAnnotation____ownedTypes.setTrg(tAnnotation);
		match.getContextEdges().add(pm__tAnnotation____ownedTypes);
		tAnnotation__pm____model.setName(tAnnotation__pm____model_name_prime);
		pm__tAnnotation____ownedTypes.setName(pm__tAnnotation____ownedTypes_name_prime);
		return new Object[] { match, tType, tAnnotation, pm, tAnnotation__pm____model, pm__tAnnotation____ownedTypes };
	}

	public static final void pattern_AnnotationTypeMember_10_6_registerobjectstomatch_expressionBBBBBBBB(
			AnnotationTypeMember _this, Match match, TAbstractType tType, TAnnotationType tAnnotation,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName, TypeGraph pm) {
		_this.registerObjectsToMatch_BWD(match, tType, tAnnotation, tSignature, tMember, tName, pm);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("tType");
		EObject _localVariable_1 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_2 = isApplicableMatch.getObject("mTypeToType");
		EObject _localVariable_3 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_4 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_5 = isApplicableMatch.getObject("tName");
		EObject _localVariable_6 = isApplicableMatch.getObject("mAnnotation");
		EObject _localVariable_7 = isApplicableMatch.getObject("mAnnotationToAnnotation");
		EObject _localVariable_8 = isApplicableMatch.getObject("mType");
		EObject _localVariable_9 = isApplicableMatch.getObject("pm");
		EObject tmpTType = _localVariable_0;
		EObject tmpTAnnotation = _localVariable_1;
		EObject tmpMTypeToType = _localVariable_2;
		EObject tmpTSignature = _localVariable_3;
		EObject tmpTMember = _localVariable_4;
		EObject tmpTName = _localVariable_5;
		EObject tmpMAnnotation = _localVariable_6;
		EObject tmpMAnnotationToAnnotation = _localVariable_7;
		EObject tmpMType = _localVariable_8;
		EObject tmpPm = _localVariable_9;
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			if (tmpTAnnotation instanceof TAnnotationType) {
				TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
				if (tmpMTypeToType instanceof TypeToTAbstractType) {
					TypeToTAbstractType mTypeToType = (TypeToTAbstractType) tmpMTypeToType;
					if (tmpTSignature instanceof TFieldSignature) {
						TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
						if (tmpTMember instanceof TFieldDefinition) {
							TFieldDefinition tMember = (TFieldDefinition) tmpTMember;
							if (tmpTName instanceof TField) {
								TField tName = (TField) tmpTName;
								if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
									AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
									if (tmpMAnnotationToAnnotation instanceof TypeToTAbstractType) {
										TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) tmpMAnnotationToAnnotation;
										if (tmpMType instanceof Type) {
											Type mType = (Type) tmpMType;
											if (tmpPm instanceof TypeGraph) {
												TypeGraph pm = (TypeGraph) tmpPm;
												return new Object[] { tType, tAnnotation, mTypeToType, tSignature,
														tMember, tName, mAnnotation, mAnnotationToAnnotation, mType, pm,
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
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_11_1_performtransformation_blackBBBBBBBBBBFBB(
			TAbstractType tType, TAnnotationType tAnnotation, TypeToTAbstractType mTypeToType,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName, AnnotationTypeDeclaration mAnnotation,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TypeGraph pm, AnnotationTypeMember _this,
			IsApplicableMatch isApplicableMatch) {
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!mAnnotationToAnnotation.equals(mTypeToType)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { tType, tAnnotation, mTypeToType, tSignature, tMember, tName,
									mAnnotation, mAnnotationToAnnotation, mType, pm, csp, _this, isApplicableMatch };
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
			TAbstractType tType = (TAbstractType) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[0];
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[1];
			TypeToTAbstractType mTypeToType = (TypeToTAbstractType) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[2];
			TFieldSignature tSignature = (TFieldSignature) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[3];
			TFieldDefinition tMember = (TFieldDefinition) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[4];
			TField tName = (TField) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[5];
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[6];
			TypeToTAbstractType mAnnotationToAnnotation = (TypeToTAbstractType) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[7];
			Type mType = (Type) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[8];
			TypeGraph pm = (TypeGraph) result_pattern_AnnotationTypeMember_11_1_performtransformation_binding[9];

			Object[] result_pattern_AnnotationTypeMember_11_1_performtransformation_black = pattern_AnnotationTypeMember_11_1_performtransformation_blackBBBBBBBBBBFBB(
					tType, tAnnotation, mTypeToType, tSignature, tMember, tName, mAnnotation, mAnnotationToAnnotation,
					mType, pm, _this, isApplicableMatch);
			if (result_pattern_AnnotationTypeMember_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationTypeMember_11_1_performtransformation_black[10];

				return new Object[] { tType, tAnnotation, mTypeToType, tSignature, tMember, tName, mAnnotation,
						mAnnotationToAnnotation, mType, pm, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_11_1_performtransformation_greenFBFBFBFB(
			TFieldDefinition tMember, AnnotationTypeDeclaration mAnnotation, Type mType, CSP csp) {
		TypeAccess access = JavaFactory.eINSTANCE.createTypeAccess();
		MDefinitionToTMember memberToMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		AnnotationTypeMemberDeclaration mMember = JavaFactory.eINSTANCE.createAnnotationTypeMemberDeclaration();
		ASTNodeToTAnnotatable anntotatableToTannotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		Object _localVariable_0 = csp.getValue("mMember", "name");
		access.setType(mType);
		memberToMember.setTarget(tMember);
		mMember.setType(access);
		memberToMember.setSource(mMember);
		mAnnotation.getBodyDeclarations().add(mMember);
		anntotatableToTannotatable.setSource(mMember);
		anntotatableToTannotatable.setTarget(tMember);
		String mMember_name_prime = (String) _localVariable_0;
		mMember.setName(mMember_name_prime);
		return new Object[] { access, tMember, memberToMember, mAnnotation, mMember, mType, anntotatableToTannotatable,
				csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_11_2_collecttranslatedelements_blackBBBBBBB(
			TypeAccess access, TFieldSignature tSignature, TFieldDefinition tMember,
			MDefinitionToTMember memberToMember, TField tName, AnnotationTypeMemberDeclaration mMember,
			ASTNodeToTAnnotatable anntotatableToTannotatable) {
		return new Object[] { access, tSignature, tMember, memberToMember, tName, mMember, anntotatableToTannotatable };
	}

	public static final Object[] pattern_AnnotationTypeMember_11_2_collecttranslatedelements_greenFBBBBBBB(
			TypeAccess access, TFieldSignature tSignature, TFieldDefinition tMember,
			MDefinitionToTMember memberToMember, TField tName, AnnotationTypeMemberDeclaration mMember,
			ASTNodeToTAnnotatable anntotatableToTannotatable) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(access);
		ruleresult.getTranslatedElements().add(tSignature);
		ruleresult.getTranslatedElements().add(tMember);
		ruleresult.getCreatedLinkElements().add(memberToMember);
		ruleresult.getTranslatedElements().add(tName);
		ruleresult.getCreatedElements().add(mMember);
		ruleresult.getCreatedLinkElements().add(anntotatableToTannotatable);
		return new Object[] { ruleresult, access, tSignature, tMember, memberToMember, tName, mMember,
				anntotatableToTannotatable };
	}

	public static final Object[] pattern_AnnotationTypeMember_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tType, EObject tAnnotation, EObject access, EObject mTypeToType,
			EObject tSignature, EObject tMember, EObject memberToMember, EObject tName, EObject mAnnotation,
			EObject mMember, EObject mAnnotationToAnnotation, EObject mType, EObject pm,
			EObject anntotatableToTannotatable) {
		if (!tAnnotation.equals(tType)) {
			if (!tAnnotation.equals(tSignature)) {
				if (!tAnnotation.equals(tMember)) {
					if (!tAnnotation.equals(tName)) {
						if (!access.equals(tType)) {
							if (!access.equals(tAnnotation)) {
								if (!access.equals(mTypeToType)) {
									if (!access.equals(tSignature)) {
										if (!access.equals(tMember)) {
											if (!access.equals(memberToMember)) {
												if (!access.equals(tName)) {
													if (!access.equals(mAnnotation)) {
														if (!access.equals(mMember)) {
															if (!access.equals(mAnnotationToAnnotation)) {
																if (!access.equals(mType)) {
																	if (!access.equals(pm)) {
																		if (!access
																				.equals(anntotatableToTannotatable)) {
																			if (!mTypeToType.equals(tType)) {
																				if (!mTypeToType.equals(tAnnotation)) {
																					if (!mTypeToType
																							.equals(tSignature)) {
																						if (!mTypeToType
																								.equals(tMember)) {
																							if (!mTypeToType.equals(
																									memberToMember)) {
																								if (!mTypeToType.equals(
																										tName)) {
																									if (!mTypeToType
																											.equals(pm)) {
																										if (!tSignature
																												.equals(tType)) {
																											if (!tMember
																													.equals(tType)) {
																												if (!tMember
																														.equals(tSignature)) {
																													if (!tMember
																															.equals(tName)) {
																														if (!memberToMember
																																.equals(tType)) {
																															if (!memberToMember
																																	.equals(tAnnotation)) {
																																if (!memberToMember
																																		.equals(tSignature)) {
																																	if (!memberToMember
																																			.equals(tMember)) {
																																		if (!memberToMember
																																				.equals(tName)) {
																																			if (!memberToMember
																																					.equals(pm)) {
																																				if (!tName
																																						.equals(tType)) {
																																					if (!tName
																																							.equals(tSignature)) {
																																						if (!mAnnotation
																																								.equals(tType)) {
																																							if (!mAnnotation
																																									.equals(tAnnotation)) {
																																								if (!mAnnotation
																																										.equals(mTypeToType)) {
																																									if (!mAnnotation
																																											.equals(tSignature)) {
																																										if (!mAnnotation
																																												.equals(tMember)) {
																																											if (!mAnnotation
																																													.equals(memberToMember)) {
																																												if (!mAnnotation
																																														.equals(tName)) {
																																													if (!mAnnotation
																																															.equals(mMember)) {
																																														if (!mAnnotation
																																																.equals(mAnnotationToAnnotation)) {
																																															if (!mAnnotation
																																																	.equals(mType)) {
																																																if (!mAnnotation
																																																		.equals(pm)) {
																																																	if (!mMember
																																																			.equals(tType)) {
																																																		if (!mMember
																																																				.equals(tAnnotation)) {
																																																			if (!mMember
																																																					.equals(mTypeToType)) {
																																																				if (!mMember
																																																						.equals(tSignature)) {
																																																					if (!mMember
																																																							.equals(tMember)) {
																																																						if (!mMember
																																																								.equals(memberToMember)) {
																																																							if (!mMember
																																																									.equals(tName)) {
																																																								if (!mMember
																																																										.equals(mType)) {
																																																									if (!mMember
																																																											.equals(pm)) {
																																																										if (!mAnnotationToAnnotation
																																																												.equals(tType)) {
																																																											if (!mAnnotationToAnnotation
																																																													.equals(tAnnotation)) {
																																																												if (!mAnnotationToAnnotation
																																																														.equals(mTypeToType)) {
																																																													if (!mAnnotationToAnnotation
																																																															.equals(tSignature)) {
																																																														if (!mAnnotationToAnnotation
																																																																.equals(tMember)) {
																																																															if (!mAnnotationToAnnotation
																																																																	.equals(memberToMember)) {
																																																																if (!mAnnotationToAnnotation
																																																																		.equals(tName)) {
																																																																	if (!mAnnotationToAnnotation
																																																																			.equals(mMember)) {
																																																																		if (!mAnnotationToAnnotation
																																																																				.equals(mType)) {
																																																																			if (!mAnnotationToAnnotation
																																																																					.equals(pm)) {
																																																																				if (!mType
																																																																						.equals(tType)) {
																																																																					if (!mType
																																																																							.equals(tAnnotation)) {
																																																																						if (!mType
																																																																								.equals(mTypeToType)) {
																																																																							if (!mType
																																																																									.equals(tSignature)) {
																																																																								if (!mType
																																																																										.equals(tMember)) {
																																																																									if (!mType
																																																																											.equals(memberToMember)) {
																																																																										if (!mType
																																																																												.equals(tName)) {
																																																																											if (!mType
																																																																													.equals(pm)) {
																																																																												if (!pm.equals(
																																																																														tType)) {
																																																																													if (!pm.equals(
																																																																															tAnnotation)) {
																																																																														if (!pm.equals(
																																																																																tSignature)) {
																																																																															if (!pm.equals(
																																																																																	tMember)) {
																																																																																if (!pm.equals(
																																																																																		tName)) {
																																																																																	if (!anntotatableToTannotatable
																																																																																			.equals(tType)) {
																																																																																		if (!anntotatableToTannotatable
																																																																																				.equals(tAnnotation)) {
																																																																																			if (!anntotatableToTannotatable
																																																																																					.equals(mTypeToType)) {
																																																																																				if (!anntotatableToTannotatable
																																																																																						.equals(tSignature)) {
																																																																																					if (!anntotatableToTannotatable
																																																																																							.equals(tMember)) {
																																																																																						if (!anntotatableToTannotatable
																																																																																								.equals(memberToMember)) {
																																																																																							if (!anntotatableToTannotatable
																																																																																									.equals(tName)) {
																																																																																								if (!anntotatableToTannotatable
																																																																																										.equals(mAnnotation)) {
																																																																																									if (!anntotatableToTannotatable
																																																																																											.equals(mMember)) {
																																																																																										if (!anntotatableToTannotatable
																																																																																												.equals(mAnnotationToAnnotation)) {
																																																																																											if (!anntotatableToTannotatable
																																																																																													.equals(mType)) {
																																																																																												if (!anntotatableToTannotatable
																																																																																														.equals(pm)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															tType,
																																																																																															tAnnotation,
																																																																																															access,
																																																																																															mTypeToType,
																																																																																															tSignature,
																																																																																															tMember,
																																																																																															memberToMember,
																																																																																															tName,
																																																																																															mAnnotation,
																																																																																															mMember,
																																																																																															mAnnotationToAnnotation,
																																																																																															mType,
																																																																																															pm,
																																																																																															anntotatableToTannotatable };
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject tType, EObject tAnnotation, EObject access, EObject tSignature,
			EObject tMember, EObject memberToMember, EObject tName, EObject mAnnotation, EObject mMember, EObject mType,
			EObject pm, EObject anntotatableToTannotatable) {
		EMoflonEdge tSignature__tMember____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge memberToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge memberToMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotation__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAnnotation____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge anntotatableToTannotatable__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge anntotatableToTannotatable__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__mType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationTypeMember";
		String tSignature__tMember____definitions_name_prime = "definitions";
		String tMember__tSignature____signature_name_prime = "signature";
		String tSignature__tType____type_name_prime = "type";
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		String memberToMember__tMember____target_name_prime = "target";
		String tName__pm____model_name_prime = "model";
		String pm__tName____fields_name_prime = "fields";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____field_name_prime = "field";
		String mMember__access____type_name_prime = "type";
		String memberToMember__mMember____source_name_prime = "source";
		String mAnnotation__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__mAnnotation____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String anntotatableToTannotatable__mMember____source_name_prime = "source";
		String anntotatableToTannotatable__tMember____target_name_prime = "target";
		String tAnnotation__tSignature____signature_name_prime = "signature";
		String access__mType____type_name_prime = "type";
		String mType__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		tSignature__tMember____definitions.setSrc(tSignature);
		tSignature__tMember____definitions.setTrg(tMember);
		ruleresult.getTranslatedEdges().add(tSignature__tMember____definitions);
		tMember__tSignature____signature.setSrc(tMember);
		tMember__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tMember__tSignature____signature);
		tSignature__tType____type.setSrc(tSignature);
		tSignature__tType____type.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tSignature__tType____type);
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		ruleresult.getTranslatedEdges().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		ruleresult.getTranslatedEdges().add(tMember__tAnnotation____definedBy);
		memberToMember__tMember____target.setSrc(memberToMember);
		memberToMember__tMember____target.setTrg(tMember);
		ruleresult.getCreatedEdges().add(memberToMember__tMember____target);
		tName__pm____model.setSrc(tName);
		tName__pm____model.setTrg(pm);
		ruleresult.getTranslatedEdges().add(tName__pm____model);
		pm__tName____fields.setSrc(pm);
		pm__tName____fields.setTrg(tName);
		ruleresult.getTranslatedEdges().add(pm__tName____fields);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tName__tSignature____signatures);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		ruleresult.getTranslatedEdges().add(tSignature__tName____field);
		mMember__access____type.setSrc(mMember);
		mMember__access____type.setTrg(access);
		ruleresult.getCreatedEdges().add(mMember__access____type);
		memberToMember__mMember____source.setSrc(memberToMember);
		memberToMember__mMember____source.setTrg(mMember);
		ruleresult.getCreatedEdges().add(memberToMember__mMember____source);
		mAnnotation__mMember____bodyDeclarations.setSrc(mAnnotation);
		mAnnotation__mMember____bodyDeclarations.setTrg(mMember);
		ruleresult.getCreatedEdges().add(mAnnotation__mMember____bodyDeclarations);
		mMember__mAnnotation____abstractTypeDeclaration.setSrc(mMember);
		mMember__mAnnotation____abstractTypeDeclaration.setTrg(mAnnotation);
		ruleresult.getCreatedEdges().add(mMember__mAnnotation____abstractTypeDeclaration);
		anntotatableToTannotatable__mMember____source.setSrc(anntotatableToTannotatable);
		anntotatableToTannotatable__mMember____source.setTrg(mMember);
		ruleresult.getCreatedEdges().add(anntotatableToTannotatable__mMember____source);
		anntotatableToTannotatable__tMember____target.setSrc(anntotatableToTannotatable);
		anntotatableToTannotatable__tMember____target.setTrg(tMember);
		ruleresult.getCreatedEdges().add(anntotatableToTannotatable__tMember____target);
		tAnnotation__tSignature____signature.setSrc(tAnnotation);
		tAnnotation__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tAnnotation__tSignature____signature);
		access__mType____type.setSrc(access);
		access__mType____type.setTrg(mType);
		ruleresult.getCreatedEdges().add(access__mType____type);
		mType__access____usagesInTypeAccess.setSrc(mType);
		mType__access____usagesInTypeAccess.setTrg(access);
		ruleresult.getCreatedEdges().add(mType__access____usagesInTypeAccess);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tSignature__tMember____definitions.setName(tSignature__tMember____definitions_name_prime);
		tMember__tSignature____signature.setName(tMember__tSignature____signature_name_prime);
		tSignature__tType____type.setName(tSignature__tType____type_name_prime);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		memberToMember__tMember____target.setName(memberToMember__tMember____target_name_prime);
		tName__pm____model.setName(tName__pm____model_name_prime);
		pm__tName____fields.setName(pm__tName____fields_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		mMember__access____type.setName(mMember__access____type_name_prime);
		memberToMember__mMember____source.setName(memberToMember__mMember____source_name_prime);
		mAnnotation__mMember____bodyDeclarations.setName(mAnnotation__mMember____bodyDeclarations_name_prime);
		mMember__mAnnotation____abstractTypeDeclaration
				.setName(mMember__mAnnotation____abstractTypeDeclaration_name_prime);
		anntotatableToTannotatable__mMember____source.setName(anntotatableToTannotatable__mMember____source_name_prime);
		anntotatableToTannotatable__tMember____target.setName(anntotatableToTannotatable__tMember____target_name_prime);
		tAnnotation__tSignature____signature.setName(tAnnotation__tSignature____signature_name_prime);
		access__mType____type.setName(access__mType____type_name_prime);
		mType__access____usagesInTypeAccess.setName(mType__access____usagesInTypeAccess_name_prime);
		return new Object[] { ruleresult, tType, tAnnotation, access, tSignature, tMember, memberToMember, tName,
				mAnnotation, mMember, mType, pm, anntotatableToTannotatable, tSignature__tMember____definitions,
				tMember__tSignature____signature, tSignature__tType____type, tAnnotation__tMember____defines,
				tMember__tAnnotation____definedBy, memberToMember__tMember____target, tName__pm____model,
				pm__tName____fields, tName__tSignature____signatures, tSignature__tName____field,
				mMember__access____type, memberToMember__mMember____source, mAnnotation__mMember____bodyDeclarations,
				mMember__mAnnotation____abstractTypeDeclaration, anntotatableToTannotatable__mMember____source,
				anntotatableToTannotatable__tMember____target, tAnnotation__tSignature____signature,
				access__mType____type, mType__access____usagesInTypeAccess };
	}

	public static final void pattern_AnnotationTypeMember_11_5_registerobjects_expressionBBBBBBBBBBBBBBBB(
			AnnotationTypeMember _this, PerformRuleResult ruleresult, EObject tType, EObject tAnnotation,
			EObject access, EObject mTypeToType, EObject tSignature, EObject tMember, EObject memberToMember,
			EObject tName, EObject mAnnotation, EObject mMember, EObject mAnnotationToAnnotation, EObject mType,
			EObject pm, EObject anntotatableToTannotatable) {
		_this.registerObjects_BWD(ruleresult, tType, tAnnotation, access, mTypeToType, tSignature, tMember,
				memberToMember, tName, mAnnotation, mMember, mAnnotationToAnnotation, mType, pm,
				anntotatableToTannotatable);

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
		EObject _localVariable_0 = match.getObject("tType");
		EObject _localVariable_1 = match.getObject("tAnnotation");
		EObject _localVariable_2 = match.getObject("tSignature");
		EObject _localVariable_3 = match.getObject("tMember");
		EObject _localVariable_4 = match.getObject("tName");
		EObject _localVariable_5 = match.getObject("pm");
		EObject tmpTType = _localVariable_0;
		EObject tmpTAnnotation = _localVariable_1;
		EObject tmpTSignature = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		EObject tmpTName = _localVariable_4;
		EObject tmpPm = _localVariable_5;
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			if (tmpTAnnotation instanceof TAnnotationType) {
				TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
				if (tmpTSignature instanceof TFieldSignature) {
					TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
					if (tmpTMember instanceof TFieldDefinition) {
						TFieldDefinition tMember = (TFieldDefinition) tmpTMember;
						if (tmpTName instanceof TField) {
							TField tName = (TField) tmpTName;
							if (tmpPm instanceof TypeGraph) {
								TypeGraph pm = (TypeGraph) tmpPm;
								return new Object[] { tType, tAnnotation, tSignature, tMember, tName, pm, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_12_2_corematch_blackBBFBBBFFFBB(
			TAbstractType tType, TAnnotationType tAnnotation, TFieldSignature tSignature, TFieldDefinition tMember,
			TField tName, TypeGraph pm, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnnotation.equals(tType)) {
			int tSignature_lowerBound = tSignature.getLowerBound();
			if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
				for (TypeToTAbstractType mTypeToType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
					Type mType = mTypeToType.getSource();
					if (mType != null) {
						for (TypeToTAbstractType mAnnotationToAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tAnnotation, TypeToTAbstractType.class, "target")) {
							if (!mAnnotationToAnnotation.equals(mTypeToType)) {
								Type tmpMAnnotation = mAnnotationToAnnotation.getSource();
								if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
									AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
									if (!mAnnotation.equals(mType)) {
										_result.add(new Object[] { tType, tAnnotation, mTypeToType, tSignature, tMember,
												tName, mAnnotation, mAnnotationToAnnotation, mType, pm, match });
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
			TAbstractType tType, TAnnotationType tAnnotation, TypeToTAbstractType mTypeToType,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName, AnnotationTypeDeclaration mAnnotation,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TypeGraph pm) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!mAnnotationToAnnotation.equals(mTypeToType)) {
					if (pm.equals(tAnnotation.getModel())) {
						if (tType.equals(mTypeToType.getTarget())) {
							if (tSignature.getDefinitions().contains(tMember)) {
								if (tType.equals(tSignature.getType())) {
									if (tAnnotation.getDefines().contains(tMember)) {
										if (pm.equals(tName.getModel())) {
											if (tName.getSignatures().contains(tSignature)) {
												if (mType.equals(mTypeToType.getSource())) {
													if (tAnnotation.equals(mAnnotationToAnnotation.getTarget())) {
														if (tAnnotation.getSignature().contains(tSignature)) {
															if (mAnnotation
																	.equals(mAnnotationToAnnotation.getSource())) {
																int tSignature_lowerBound = tSignature.getLowerBound();
																if (Integer.valueOf(tSignature_lowerBound)
																		.equals(Integer.valueOf(0))) {
																	_result.add(new Object[] { tType, tAnnotation,
																			mTypeToType, tSignature, tMember, tName,
																			mAnnotation, mAnnotationToAnnotation, mType,
																			pm });
																}

															}
														}
													}
												}
											}
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
			TAbstractType tType, TAnnotationType tAnnotation, TypeToTAbstractType mTypeToType,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName, AnnotationTypeDeclaration mAnnotation,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TypeGraph pm) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tAnnotation__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tAnnotation____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tMember____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tAnnotation____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__pm____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pm__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationToAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotationToAnnotation__mAnnotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tAnnotation__pm____model_name_prime = "model";
		String pm__tAnnotation____ownedTypes_name_prime = "ownedTypes";
		String mTypeToType__tType____target_name_prime = "target";
		String tSignature__tMember____definitions_name_prime = "definitions";
		String tMember__tSignature____signature_name_prime = "signature";
		String tSignature__tType____type_name_prime = "type";
		String tAnnotation__tMember____defines_name_prime = "defines";
		String tMember__tAnnotation____definedBy_name_prime = "definedBy";
		String tName__pm____model_name_prime = "model";
		String pm__tName____fields_name_prime = "fields";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tName____field_name_prime = "field";
		String mTypeToType__mType____source_name_prime = "source";
		String mAnnotationToAnnotation__tAnnotation____target_name_prime = "target";
		String tAnnotation__tSignature____signature_name_prime = "signature";
		String mAnnotationToAnnotation__mAnnotation____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mTypeToType);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotationToAnnotation);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(pm);
		tAnnotation__pm____model.setSrc(tAnnotation);
		tAnnotation__pm____model.setTrg(pm);
		isApplicableMatch.getAllContextElements().add(tAnnotation__pm____model);
		pm__tAnnotation____ownedTypes.setSrc(pm);
		pm__tAnnotation____ownedTypes.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(pm__tAnnotation____ownedTypes);
		mTypeToType__tType____target.setSrc(mTypeToType);
		mTypeToType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToType__tType____target);
		tSignature__tMember____definitions.setSrc(tSignature);
		tSignature__tMember____definitions.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tSignature__tMember____definitions);
		tMember__tSignature____signature.setSrc(tMember);
		tMember__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tMember__tSignature____signature);
		tSignature__tType____type.setSrc(tSignature);
		tSignature__tType____type.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tSignature__tType____type);
		tAnnotation__tMember____defines.setSrc(tAnnotation);
		tAnnotation__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tMember____defines);
		tMember__tAnnotation____definedBy.setSrc(tMember);
		tMember__tAnnotation____definedBy.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tMember__tAnnotation____definedBy);
		tName__pm____model.setSrc(tName);
		tName__pm____model.setTrg(pm);
		isApplicableMatch.getAllContextElements().add(tName__pm____model);
		pm__tName____fields.setSrc(pm);
		pm__tName____fields.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(pm__tName____fields);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tName__tSignature____signatures);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(tSignature__tName____field);
		mTypeToType__mType____source.setSrc(mTypeToType);
		mTypeToType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToType__mType____source);
		mAnnotationToAnnotation__tAnnotation____target.setSrc(mAnnotationToAnnotation);
		mAnnotationToAnnotation__tAnnotation____target.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotationToAnnotation__tAnnotation____target);
		tAnnotation__tSignature____signature.setSrc(tAnnotation);
		tAnnotation__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tSignature____signature);
		mAnnotationToAnnotation__mAnnotation____source.setSrc(mAnnotationToAnnotation);
		mAnnotationToAnnotation__mAnnotation____source.setTrg(mAnnotation);
		isApplicableMatch.getAllContextElements().add(mAnnotationToAnnotation__mAnnotation____source);
		tAnnotation__pm____model.setName(tAnnotation__pm____model_name_prime);
		pm__tAnnotation____ownedTypes.setName(pm__tAnnotation____ownedTypes_name_prime);
		mTypeToType__tType____target.setName(mTypeToType__tType____target_name_prime);
		tSignature__tMember____definitions.setName(tSignature__tMember____definitions_name_prime);
		tMember__tSignature____signature.setName(tMember__tSignature____signature_name_prime);
		tSignature__tType____type.setName(tSignature__tType____type_name_prime);
		tAnnotation__tMember____defines.setName(tAnnotation__tMember____defines_name_prime);
		tMember__tAnnotation____definedBy.setName(tMember__tAnnotation____definedBy_name_prime);
		tName__pm____model.setName(tName__pm____model_name_prime);
		pm__tName____fields.setName(pm__tName____fields_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		mTypeToType__mType____source.setName(mTypeToType__mType____source_name_prime);
		mAnnotationToAnnotation__tAnnotation____target
				.setName(mAnnotationToAnnotation__tAnnotation____target_name_prime);
		tAnnotation__tSignature____signature.setName(tAnnotation__tSignature____signature_name_prime);
		mAnnotationToAnnotation__mAnnotation____source
				.setName(mAnnotationToAnnotation__mAnnotation____source_name_prime);
		return new Object[] { tType, tAnnotation, mTypeToType, tSignature, tMember, tName, mAnnotation,
				mAnnotationToAnnotation, mType, pm, isApplicableMatch, tAnnotation__pm____model,
				pm__tAnnotation____ownedTypes, mTypeToType__tType____target, tSignature__tMember____definitions,
				tMember__tSignature____signature, tSignature__tType____type, tAnnotation__tMember____defines,
				tMember__tAnnotation____definedBy, tName__pm____model, pm__tName____fields,
				tName__tSignature____signatures, tSignature__tName____field, mTypeToType__mType____source,
				mAnnotationToAnnotation__tAnnotation____target, tAnnotation__tSignature____signature,
				mAnnotationToAnnotation__mAnnotation____source };
	}

	public static final Object[] pattern_AnnotationTypeMember_12_4_solveCSP_bindingFBBBBBBBBBBBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToType, TFieldSignature tSignature,
			TFieldDefinition tMember, TField tName, AnnotationTypeDeclaration mAnnotation,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TypeGraph pm) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tType, tAnnotation, mTypeToType,
				tSignature, tMember, tName, mAnnotation, mAnnotationToAnnotation, mType, pm);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tType, tAnnotation, mTypeToType, tSignature, tMember,
					tName, mAnnotation, mAnnotationToAnnotation, mType, pm };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToType, TFieldSignature tSignature,
			TFieldDefinition tMember, TField tName, AnnotationTypeDeclaration mAnnotation,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TypeGraph pm) {
		Object[] result_pattern_AnnotationTypeMember_12_4_solveCSP_binding = pattern_AnnotationTypeMember_12_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, tType, tAnnotation, mTypeToType, tSignature, tMember, tName, mAnnotation,
				mAnnotationToAnnotation, mType, pm);
		if (result_pattern_AnnotationTypeMember_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeMember_12_4_solveCSP_black = pattern_AnnotationTypeMember_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tType, tAnnotation, mTypeToType, tSignature,
						tMember, tName, mAnnotation, mAnnotationToAnnotation, mType, pm };
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
		TField __DEC_tSignature_field_858087 = tSignature.getField();
		if (__DEC_tSignature_field_858087 != null) {
			if (!tName.equals(__DEC_tSignature_field_858087)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_1BB(
			TFieldDefinition tMember, TFieldSignature tSignature) {
		TSignature __DEC_tMember_signature_901087 = tMember.getSignature();
		if (__DEC_tMember_signature_901087 != null) {
			if (!tSignature.equals(__DEC_tMember_signature_901087)) {
				return new Object[] { tMember, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_2BB(TField tName,
			TypeGraph pm) {
		TypeGraph __DEC_tName_fields_630589 = tName.getModel();
		if (__DEC_tName_fields_630589 != null) {
			if (!pm.equals(__DEC_tName_fields_630589)) {
				return new Object[] { tName, pm };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_20_2_testcorematchandDECs_blackFFFFFFB(
			EMoflonEdge _edge_definitions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTSignature = _edge_definitions.getSrc();
		if (tmpTSignature instanceof TFieldSignature) {
			TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
			EObject tmpTMember = _edge_definitions.getTrg();
			if (tmpTMember instanceof TFieldDefinition) {
				TFieldDefinition tMember = (TFieldDefinition) tmpTMember;
				if (tSignature.getDefinitions().contains(tMember)) {
					TAbstractType tType = tSignature.getType();
					if (tType != null) {
						TField tName = tSignature.getField();
						if (tName != null) {
							int tSignature_lowerBound = tSignature.getLowerBound();
							if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
								TAbstractType tmpTAnnotation = tMember.getDefinedBy();
								if (tmpTAnnotation instanceof TAnnotationType) {
									TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
									if (!tAnnotation.equals(tType)) {
										if (tAnnotation.getSignature().contains(tSignature)) {
											TypeGraph pm = tName.getModel();
											if (pm != null) {
												if (pm.equals(tAnnotation.getModel())) {
													if (pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_1BB(
															tMember, tSignature) == null) {
														if (pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_0BB(
																tSignature, tName) == null) {
															if (pattern_AnnotationTypeMember_20_2_testcorematchandDECs_black_nac_2BB(
																	tName, pm) == null) {
																_result.add(new Object[] { tType, tAnnotation,
																		tSignature, tMember, tName, pm,
																		_edge_definitions });
															}
														}
													}
												}
											}

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
			AnnotationTypeMember _this, Match match, TAbstractType tType, TAnnotationType tAnnotation,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName, TypeGraph pm) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tType, tAnnotation, tSignature, tMember, tName, pm);
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
			TypeAccess access, AnnotationTypeDeclaration mAnnotation, Type mType) {
		if (!mAnnotation.equals(mType)) {
			for (AbstractTypeDeclaration __DEC_access_superInterfaces_131903 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(access, AbstractTypeDeclaration.class, "superInterfaces")) {
				if (!mAnnotation.equals(__DEC_access_superInterfaces_131903)) {
					if (!mType.equals(__DEC_access_superInterfaces_131903)) {
						return new Object[] { access, mAnnotation, mType };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess access) {
		for (Annotation __DEC_access_type_459601 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, Annotation.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_2BB(TypeAccess access,
			Type mType) {
		for (ArrayType __DEC_access_elementType_604344 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ArrayType.class, "elementType")) {
			if (!mType.equals(__DEC_access_elementType_604344)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess access) {
		for (ClassInstanceCreation __DEC_access_type_11928 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ClassInstanceCreation.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_4BB(TypeAccess access,
			Type mType) {
		for (ClassDeclaration __DEC_access_superClass_786861 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ClassDeclaration.class, "superClass")) {
			if (!mType.equals(__DEC_access_superClass_786861)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess access) {
		for (MethodDeclaration __DEC_access_returnType_911602 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, MethodDeclaration.class, "returnType")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_6BB(TypeAccess access,
			Type mType) {
		for (ParameterizedType __DEC_access_type_418496 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ParameterizedType.class, "type")) {
			if (!mType.equals(__DEC_access_type_418496)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess access) {
		for (TypeLiteral __DEC_access_type_30971 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, TypeLiteral.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_8B(
			TypeAccess access) {
		for (AnnotationMemberValuePair __DEC_access_value_288648 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_9BBB(
			AnnotationTypeMemberDeclaration mMember, AnnotationTypeDeclaration mAnnotation, Type mType) {
		if (!mAnnotation.equals(mType)) {
			AbstractTypeDeclaration __DEC_mMember_abstractTypeDeclaration_516858 = mMember.getAbstractTypeDeclaration();
			if (__DEC_mMember_abstractTypeDeclaration_516858 != null) {
				if (!mAnnotation.equals(__DEC_mMember_abstractTypeDeclaration_516858)) {
					if (!mType.equals(__DEC_mMember_abstractTypeDeclaration_516858)) {
						return new Object[] { mMember, mAnnotation, mType };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_10B(
			AnnotationTypeMemberDeclaration mMember) {
		AnonymousClassDeclaration __DEC_mMember_anonymousClassDeclarationOwner_370488 = mMember
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mMember_anonymousClassDeclarationOwner_370488 != null) {
			return new Object[] { mMember };
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
								if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_10B(
										mMember) == null) {
									if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_1B(
											access) == null) {
										if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_3B(
												access) == null) {
											if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_5B(
													access) == null) {
												if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_7B(
														access) == null) {
													if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_8B(
															access) == null) {
														if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_11BB(
																mAnnotation, access) == null) {
															if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_0BBB(
																	access, mAnnotation, mType) == null) {
																if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_2BB(
																		access, mType) == null) {
																	if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_4BB(
																			access, mType) == null) {
																		if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_6BB(
																				access, mType) == null) {
																			if (pattern_AnnotationTypeMember_21_2_testcorematchandDECs_black_nac_9BBB(
																					mMember, mAnnotation,
																					mType) == null) {
																				_result.add(new Object[] { access,
																						mAnnotation, mMember, mType,
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
			AnnotationTypeMember _this, Match match, TypeAccess access, AnnotationTypeDeclaration mAnnotation,
			AnnotationTypeMemberDeclaration mMember, Type mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, access, mAnnotation, mMember, mType);
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
		EObject _localVariable_0 = targetMatch.getObject("tType");
		EObject _localVariable_1 = targetMatch.getObject("tAnnotation");
		EObject _localVariable_2 = sourceMatch.getObject("access");
		EObject _localVariable_3 = targetMatch.getObject("tSignature");
		EObject _localVariable_4 = targetMatch.getObject("tMember");
		EObject _localVariable_5 = targetMatch.getObject("tName");
		EObject _localVariable_6 = sourceMatch.getObject("mAnnotation");
		EObject _localVariable_7 = sourceMatch.getObject("mMember");
		EObject _localVariable_8 = sourceMatch.getObject("mType");
		EObject _localVariable_9 = targetMatch.getObject("pm");
		EObject tmpTType = _localVariable_0;
		EObject tmpTAnnotation = _localVariable_1;
		EObject tmpAccess = _localVariable_2;
		EObject tmpTSignature = _localVariable_3;
		EObject tmpTMember = _localVariable_4;
		EObject tmpTName = _localVariable_5;
		EObject tmpMAnnotation = _localVariable_6;
		EObject tmpMMember = _localVariable_7;
		EObject tmpMType = _localVariable_8;
		EObject tmpPm = _localVariable_9;
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			if (tmpTAnnotation instanceof TAnnotationType) {
				TAnnotationType tAnnotation = (TAnnotationType) tmpTAnnotation;
				if (tmpAccess instanceof TypeAccess) {
					TypeAccess access = (TypeAccess) tmpAccess;
					if (tmpTSignature instanceof TFieldSignature) {
						TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
						if (tmpTMember instanceof TFieldDefinition) {
							TFieldDefinition tMember = (TFieldDefinition) tmpTMember;
							if (tmpTName instanceof TField) {
								TField tName = (TField) tmpTName;
								if (tmpMAnnotation instanceof AnnotationTypeDeclaration) {
									AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) tmpMAnnotation;
									if (tmpMMember instanceof AnnotationTypeMemberDeclaration) {
										AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) tmpMMember;
										if (tmpMType instanceof Type) {
											Type mType = (Type) tmpMType;
											if (tmpPm instanceof TypeGraph) {
												TypeGraph pm = (TypeGraph) tmpPm;
												return new Object[] { tType, tAnnotation, access, tSignature, tMember,
														tName, mAnnotation, mMember, mType, pm, targetMatch,
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
			TAbstractType tType, TAnnotationType tAnnotation, TypeAccess access, TFieldSignature tSignature,
			TFieldDefinition tMember, TField tName, AnnotationTypeDeclaration mAnnotation,
			AnnotationTypeMemberDeclaration mMember, Type mType, TypeGraph pm, Match sourceMatch, Match targetMatch) {
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!sourceMatch.equals(targetMatch)) {
					int tSignature_lowerBound = tSignature.getLowerBound();
					if (Integer.valueOf(tSignature_lowerBound).equals(Integer.valueOf(0))) {
						return new Object[] { tType, tAnnotation, access, tSignature, tMember, tName, mAnnotation,
								mMember, mType, pm, sourceMatch, targetMatch };
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
			TAbstractType tType = (TAbstractType) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[0];
			TAnnotationType tAnnotation = (TAnnotationType) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[1];
			TypeAccess access = (TypeAccess) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[2];
			TFieldSignature tSignature = (TFieldSignature) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[3];
			TFieldDefinition tMember = (TFieldDefinition) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[4];
			TField tName = (TField) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[5];
			AnnotationTypeDeclaration mAnnotation = (AnnotationTypeDeclaration) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[6];
			AnnotationTypeMemberDeclaration mMember = (AnnotationTypeMemberDeclaration) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[7];
			Type mType = (Type) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[8];
			TypeGraph pm = (TypeGraph) result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_binding[9];

			Object[] result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_black = pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_blackBBBBBBBBBBBB(
					tType, tAnnotation, access, tSignature, tMember, tName, mAnnotation, mMember, mType, pm,
					sourceMatch, targetMatch);
			if (result_pattern_AnnotationTypeMember_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tType, tAnnotation, access, tSignature, tMember, tName, mAnnotation, mMember,
						mType, pm, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
			AnnotationTypeMember _this, TAbstractType tType, TAnnotationType tAnnotation, TypeAccess access,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName, AnnotationTypeDeclaration mAnnotation,
			AnnotationTypeMemberDeclaration mMember, Type mType, TypeGraph pm, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_10 = _this.isApplicable_solveCsp_CC(tType, tAnnotation, access, tSignature, tMember, tName,
				mAnnotation, mMember, mType, pm, sourceMatch, targetMatch);
		CSP csp = _localVariable_10;
		if (csp != null) {
			return new Object[] { csp, _this, tType, tAnnotation, access, tSignature, tMember, tName, mAnnotation,
					mMember, mType, pm, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBB(
			AnnotationTypeMember _this, TAbstractType tType, TAnnotationType tAnnotation, TypeAccess access,
			TFieldSignature tSignature, TFieldDefinition tMember, TField tName, AnnotationTypeDeclaration mAnnotation,
			AnnotationTypeMemberDeclaration mMember, Type mType, TypeGraph pm, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationTypeMember_24_3_solvecsp_binding = pattern_AnnotationTypeMember_24_3_solvecsp_bindingFBBBBBBBBBBBBB(
				_this, tType, tAnnotation, access, tSignature, tMember, tName, mAnnotation, mMember, mType, pm,
				sourceMatch, targetMatch);
		if (result_pattern_AnnotationTypeMember_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnnotationTypeMember_24_3_solvecsp_black = pattern_AnnotationTypeMember_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tType, tAnnotation, access, tSignature, tMember, tName, mAnnotation,
						mMember, mType, pm, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationTypeMember_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationTypeMember_24_5_matchcorrcontext_blackBBFBFBBB(
			TAbstractType tType, TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation, Type mType,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (TypeToTAbstractType mTypeToType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
						if (mType.equals(mTypeToType.getSource())) {
							for (TypeToTAbstractType mAnnotationToAnnotation : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(tAnnotation, TypeToTAbstractType.class, "target")) {
								if (!mAnnotationToAnnotation.equals(mTypeToType)) {
									if (mAnnotation.equals(mAnnotationToAnnotation.getSource())) {
										_result.add(new Object[] { tType, tAnnotation, mTypeToType, mAnnotation,
												mAnnotationToAnnotation, mType, sourceMatch, targetMatch });
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
			TAbstractType tType, TAnnotationType tAnnotation, TypeAccess access, TFieldSignature tSignature,
			TFieldDefinition tMember, TField tName, AnnotationTypeDeclaration mAnnotation,
			AnnotationTypeMemberDeclaration mMember, Type mType, TypeGraph pm, CCMatch ccMatch) {
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				return new Object[] { tType, tAnnotation, access, tSignature, tMember, tName, mAnnotation, mMember,
						mType, pm, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_24_6_createcorrespondence_greenBFBFB(
			TFieldDefinition tMember, AnnotationTypeMemberDeclaration mMember, CCMatch ccMatch) {
		MDefinitionToTMember memberToMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		ASTNodeToTAnnotatable anntotatableToTannotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		memberToMember.setTarget(tMember);
		memberToMember.setSource(mMember);
		ccMatch.getCreateCorr().add(memberToMember);
		anntotatableToTannotatable.setSource(mMember);
		anntotatableToTannotatable.setTarget(tMember);
		ccMatch.getCreateCorr().add(anntotatableToTannotatable);
		return new Object[] { tMember, memberToMember, mMember, anntotatableToTannotatable, ccMatch };
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

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_0BBB(TypeAccess access,
			AnnotationTypeDeclaration mAnnotation, Type mType) {
		if (!mAnnotation.equals(mType)) {
			for (AbstractTypeDeclaration __DEC_access_superInterfaces_507016 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(access, AbstractTypeDeclaration.class, "superInterfaces")) {
				if (!mAnnotation.equals(__DEC_access_superInterfaces_507016)) {
					if (!mType.equals(__DEC_access_superInterfaces_507016)) {
						return new Object[] { access, mAnnotation, mType };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_1B(TypeAccess access) {
		for (Annotation __DEC_access_type_881318 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, Annotation.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_2BB(TypeAccess access,
			Type mType) {
		for (ArrayType __DEC_access_elementType_322787 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ArrayType.class, "elementType")) {
			if (!mType.equals(__DEC_access_elementType_322787)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_3B(TypeAccess access) {
		for (ClassInstanceCreation __DEC_access_type_58758 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ClassInstanceCreation.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_4BB(TypeAccess access,
			Type mType) {
		for (ClassDeclaration __DEC_access_superClass_111133 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ClassDeclaration.class, "superClass")) {
			if (!mType.equals(__DEC_access_superClass_111133)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_5B(TypeAccess access) {
		for (MethodDeclaration __DEC_access_returnType_708011 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, MethodDeclaration.class, "returnType")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_6BB(TypeAccess access,
			Type mType) {
		for (ParameterizedType __DEC_access_type_370938 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ParameterizedType.class, "type")) {
			if (!mType.equals(__DEC_access_type_370938)) {
				return new Object[] { access, mType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_7B(TypeAccess access) {
		for (TypeLiteral __DEC_access_type_184306 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, TypeLiteral.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_8B(TypeAccess access) {
		for (AnnotationMemberValuePair __DEC_access_value_855203 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_9BBB(
			AnnotationTypeMemberDeclaration mMember, AnnotationTypeDeclaration mAnnotation, Type mType) {
		if (!mAnnotation.equals(mType)) {
			AbstractTypeDeclaration __DEC_mMember_abstractTypeDeclaration_401656 = mMember.getAbstractTypeDeclaration();
			if (__DEC_mMember_abstractTypeDeclaration_401656 != null) {
				if (!mAnnotation.equals(__DEC_mMember_abstractTypeDeclaration_401656)) {
					if (!mType.equals(__DEC_mMember_abstractTypeDeclaration_401656)) {
						return new Object[] { mMember, mAnnotation, mType };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_10B(
			AnnotationTypeMemberDeclaration mMember) {
		AnonymousClassDeclaration __DEC_mMember_anonymousClassDeclarationOwner_11391 = mMember
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mMember_anonymousClassDeclarationOwner_11391 != null) {
			return new Object[] { mMember };
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

	public static final Object[] pattern_AnnotationTypeMember_27_1_matchtggpattern_blackBBBB(TypeAccess access,
			AnnotationTypeDeclaration mAnnotation, AnnotationTypeMemberDeclaration mMember, Type mType) {
		if (!mAnnotation.equals(mType)) {
			if (access.equals(mMember.getType())) {
				if (mAnnotation.getBodyDeclarations().contains(mMember)) {
					if (mType.equals(access.getType())) {
						if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_0BBB(access, mAnnotation,
								mType) == null) {
							if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_1B(access) == null) {
								if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_2BB(access,
										mType) == null) {
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
														if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_8B(
																access) == null) {
															if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_9BBB(
																	mMember, mAnnotation, mType) == null) {
																if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_10B(
																		mMember) == null) {
																	if (pattern_AnnotationTypeMember_27_1_matchtggpattern_black_nac_11BB(
																			mAnnotation, access) == null) {
																		return new Object[] { access, mAnnotation,
																				mMember, mType };
																	}
																}
															}
														}
													}
												}
											}
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
		TField __DEC_tSignature_field_685644 = tSignature.getField();
		if (__DEC_tSignature_field_685644 != null) {
			if (!tName.equals(__DEC_tSignature_field_685644)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_1BB(
			TFieldDefinition tMember, TFieldSignature tSignature) {
		TSignature __DEC_tMember_signature_547216 = tMember.getSignature();
		if (__DEC_tMember_signature_547216 != null) {
			if (!tSignature.equals(__DEC_tMember_signature_547216)) {
				return new Object[] { tMember, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_2BB(TField tName,
			TypeGraph pm) {
		TypeGraph __DEC_tName_fields_911505 = tName.getModel();
		if (__DEC_tName_fields_911505 != null) {
			if (!pm.equals(__DEC_tName_fields_911505)) {
				return new Object[] { tName, pm };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_28_1_matchtggpattern_blackBBBBBB(TAbstractType tType,
			TAnnotationType tAnnotation, TFieldSignature tSignature, TFieldDefinition tMember, TField tName,
			TypeGraph pm) {
		if (!tAnnotation.equals(tType)) {
			if (pm.equals(tAnnotation.getModel())) {
				if (tSignature.getDefinitions().contains(tMember)) {
					if (tType.equals(tSignature.getType())) {
						if (tAnnotation.getDefines().contains(tMember)) {
							if (pm.equals(tName.getModel())) {
								if (tName.getSignatures().contains(tSignature)) {
									if (tAnnotation.getSignature().contains(tSignature)) {
										if (pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_0BB(tSignature,
												tName) == null) {
											if (pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_1BB(tMember,
													tSignature) == null) {
												if (pattern_AnnotationTypeMember_28_1_matchtggpattern_black_nac_2BB(
														tName, pm) == null) {
													return new Object[] { tType, tAnnotation, tSignature, tMember,
															tName, pm };
												}
											}
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
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToType) {
		if (ruleResult.getCorrObjects().contains(mTypeToType)) {
			return new Object[] { ruleResult, mTypeToType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Type mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TAnnotationType tAnnotation) {
		if (ruleResult.getTargetObjects().contains(tAnnotation)) {
			return new Object[] { ruleResult, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pm) {
		if (ruleResult.getTargetObjects().contains(pm)) {
			return new Object[] { ruleResult, pm };
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
							TAbstractType tType = mTypeToType.getTarget();
							if (tType != null) {
								Type mType = mTypeToType.getSource();
								if (mType != null) {
									if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mTypeToType) == null) {
										if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												tType) == null) {
											if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, mType) == null) {
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
																					if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_3BB(
																							ruleResult,
																							tAnnotation) == null) {
																						if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_6BB(
																								ruleResult,
																								mAnnotation) == null) {
																							if (pattern_AnnotationTypeMember_29_2_isapplicablecore_black_nac_4BB(
																									ruleResult,
																									pm) == null) {
																								_result.add(
																										new Object[] {
																												mTypeToTypeList,
																												tType,
																												mTypeToType,
																												mType,
																												mAnnotationToAnnotationList,
																												tAnnotation,
																												pm,
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
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToType, AnnotationTypeDeclaration mAnnotation,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TypeGraph pm,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tType, tAnnotation, mTypeToType,
				mAnnotation, mAnnotationToAnnotation, mType, pm, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tType, tAnnotation, mTypeToType, mAnnotation,
					mAnnotationToAnnotation, mType, pm, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationTypeMember_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			AnnotationTypeMember _this, IsApplicableMatch isApplicableMatch, TAbstractType tType,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToType, AnnotationTypeDeclaration mAnnotation,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TypeGraph pm,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnnotationTypeMember_29_3_solveCSP_binding = pattern_AnnotationTypeMember_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, tType, tAnnotation, mTypeToType, mAnnotation, mAnnotationToAnnotation, mType,
				pm, ruleResult);
		if (result_pattern_AnnotationTypeMember_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationTypeMember_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnnotationTypeMember_29_3_solveCSP_black = pattern_AnnotationTypeMember_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationTypeMember_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tType, tAnnotation, mTypeToType, mAnnotation,
						mAnnotationToAnnotation, mType, pm, ruleResult };
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

	public static final Object[] pattern_AnnotationTypeMember_29_5_checknacs_blackBBBBBBB(TAbstractType tType,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToType, AnnotationTypeDeclaration mAnnotation,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TypeGraph pm) {
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!mAnnotationToAnnotation.equals(mTypeToType)) {
					return new Object[] { tType, tAnnotation, mTypeToType, mAnnotation, mAnnotationToAnnotation, mType,
							pm };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_6_perform_blackBBBBBBBB(TAbstractType tType,
			TAnnotationType tAnnotation, TypeToTAbstractType mTypeToType, AnnotationTypeDeclaration mAnnotation,
			TypeToTAbstractType mAnnotationToAnnotation, Type mType, TypeGraph pm,
			ModelgeneratorRuleResult ruleResult) {
		if (!tAnnotation.equals(tType)) {
			if (!mAnnotation.equals(mType)) {
				if (!mAnnotationToAnnotation.equals(mTypeToType)) {
					return new Object[] { tType, tAnnotation, mTypeToType, mAnnotation, mAnnotationToAnnotation, mType,
							pm, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationTypeMember_29_6_perform_greenBBFFFFFBFBBFBB(TAbstractType tType,
			TAnnotationType tAnnotation, AnnotationTypeDeclaration mAnnotation, Type mType, TypeGraph pm,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		TypeAccess access = JavaFactory.eINSTANCE.createTypeAccess();
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		TFieldDefinition tMember = BasicFactory.eINSTANCE.createTFieldDefinition();
		MDefinitionToTMember memberToMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TField tName = BasicFactory.eINSTANCE.createTField();
		AnnotationTypeMemberDeclaration mMember = JavaFactory.eINSTANCE.createAnnotationTypeMemberDeclaration();
		ASTNodeToTAnnotatable anntotatableToTannotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		int tSignature_lowerBound_prime = Integer.valueOf(0);
		Object _localVariable_0 = csp.getValue("tSignature", "upperBound");
		Object _localVariable_1 = csp.getValue("tName", "tName");
		Object _localVariable_2 = csp.getValue("mMember", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_3 = ruleResult.getIncrementedPerformCount();
		access.setType(mType);
		ruleResult.getSourceObjects().add(access);
		tSignature.setType(tType);
		tAnnotation.getSignature().add(tSignature);
		ruleResult.getTargetObjects().add(tSignature);
		tSignature.getDefinitions().add(tMember);
		tAnnotation.getDefines().add(tMember);
		ruleResult.getTargetObjects().add(tMember);
		memberToMember.setTarget(tMember);
		ruleResult.getCorrObjects().add(memberToMember);
		tName.setModel(pm);
		tName.getSignatures().add(tSignature);
		ruleResult.getTargetObjects().add(tName);
		mMember.setType(access);
		memberToMember.setSource(mMember);
		mAnnotation.getBodyDeclarations().add(mMember);
		ruleResult.getSourceObjects().add(mMember);
		anntotatableToTannotatable.setSource(mMember);
		anntotatableToTannotatable.setTarget(tMember);
		ruleResult.getCorrObjects().add(anntotatableToTannotatable);
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
		return new Object[] { tType, tAnnotation, access, tSignature, tMember, memberToMember, tName, mAnnotation,
				mMember, mType, pm, anntotatableToTannotatable, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationTypeMember_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationTypeMemberImpl
