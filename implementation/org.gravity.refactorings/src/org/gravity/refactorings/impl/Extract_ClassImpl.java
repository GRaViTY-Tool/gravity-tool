/**
 */
package org.gravity.refactorings.impl;

import java.lang.Iterable;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.refactorings.configuration.impl.ExtractClassConfiguration;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.TConstructorDefinition;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMethodDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Extract
 * Class</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Extract_ClassImpl extends RefactoringImpl {
	
	@Override
	public Collection<TClass> perform(RefactoringConfiguration configuration) {
		//TODO: Implement Refactoring
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isApplicable(RefactoringConfiguration tRefactoringConfiguration) {
		// [user code injected with eMoflon]

		if (tRefactoringConfiguration instanceof ExtractClassConfiguration) {
			ExtractClassConfiguration configuration = (ExtractClassConfiguration) tRefactoringConfiguration;

			List<TMember> tMembers = configuration.getTMembers();
			if (tMembers.size() == 0) {
				return false;
			}
			TPackage tPackage = tMembers.get(0).getDefinedBy().getPackage();
			for (TAbstractType type : tPackage.getOwnedTypes()) {
				if (type.getTName().equals(configuration.getTNewClassName())) {
					return false;
				}
			}

			for (TMember tMember : tMembers) {
				if (tMember instanceof TMethodDefinition) {
					TMethodDefinition mDef = (TMethodDefinition) tMember;
					if (mDef instanceof TConstructorDefinition) {
						return false;
					}
					if (mDef.getOverriding() != null || mDef.getOverriddenBy().size() > 0) {
						return false;
					}
				} else if (tMember instanceof TFieldDefinition) {
					TFieldDefinition fDef = (TFieldDefinition) tMember;
					if (fDef.getHiding() != null || fDef.getHiddenBy().size() > 0) {
						return false;
					}
				} else {
					System.err.println("Extract_Class: Unknown member type: " + tMember);
					return false;
				}
			}
			return true;

		}
		return false;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List<TClass> Perform(RefactoringConfiguration tRefactoringConfiguration) {

		if (tRefactoringConfiguration instanceof ExtractClassConfiguration) {
			ExtractClassConfiguration tExtractConfiguration = (ExtractClassConfiguration) tRefactoringConfiguration;

			Object[] result3_black = Extract_ClassImpl
					.pattern_Extract_Class_1_3_ActivityNode245_blackBFFFF(tExtractConfiguration);
			if (result3_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tExtractConfiguration] = "
						+ tExtractConfiguration + ".");
			}
			// nothing TMember tSomeMember = (TMember) result3_black[1];
			TClass tClass = (TClass) result3_black[2];
			TPackage tPackage = (TPackage) result3_black[3];
			TypeGraph tPG = (TypeGraph) result3_black[4];

			Object[] result4_black = Extract_ClassImpl.pattern_Extract_Class_1_4_ActivityNode246_blackBB(tPG, tPackage);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tPG] = " + tPG + ", "
						+ "[tPackage] = " + tPackage + ".");
			}
			Object[] result4_green = Extract_ClassImpl.pattern_Extract_Class_1_4_ActivityNode246_greenBBFB(tPG,
					tPackage, tExtractConfiguration);
			TClass tNewClass = (TClass) result4_green[2];

			if (tClass.equals(tNewClass)) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tNewClass] = " + tNewClass
						+ ", " + "[tClass] = " + tClass + ".");
			}
			
			List<TClass> tContainer = new LinkedList<>();
			tContainer.add(tNewClass);
			tContainer.add(tClass);
			

			// ForEach
			for (Object[] result6_black : Extract_ClassImpl
					.pattern_Extract_Class_1_6_ActivityNode247_blackBF(tExtractConfiguration)) {
				TMember tMember = (TMember) result6_black[1];

				Object[] result7_bindingAndBlack = Extract_ClassImpl
						.pattern_Extract_Class_1_7_ActivityNode248_bindingAndBlackFBBB(tMember, tClass, tNewClass);
				if (result7_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tMember] = " + tMember
							+ ", " + "[tClass] = " + tClass + ", " + "[tNewClass] = " + tNewClass + ".");
				}
				TSignature tSignature = (TSignature) result7_bindingAndBlack[0];
				Extract_ClassImpl.pattern_Extract_Class_1_7_ActivityNode248_redBB(tMember, tClass);

				Extract_ClassImpl.pattern_Extract_Class_1_7_ActivityNode248_greenBBB(tSignature, tMember, tNewClass);

			}
			return tContainer;
		} else {
			return null;
		}

	}

	public static final Object[] pattern_Extract_Class_1_3_ActivityNode245_blackBFFFF(
			ExtractClassConfiguration tExtractConfiguration) {
		for (TMember tSomeMember : tExtractConfiguration.getTMembers()) {
			TAbstractType tmpTClass = tSomeMember.getDefinedBy();
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				TypeGraph tPG = tClass.getPg();
				if (tPG != null) {
					TPackage tPackage = tClass.getPackage();
					if (tPackage != null) {
						return new Object[] { tExtractConfiguration, tSomeMember, tClass, tPackage, tPG };
					}

				}

			}

		}
		return null;
	}

	public static final Object[] pattern_Extract_Class_1_4_ActivityNode246_blackBB(TypeGraph tPG, TPackage tPackage) {
		return new Object[] { tPG, tPackage };
	}

	public static final Object[] pattern_Extract_Class_1_4_ActivityNode246_greenBBFB(TypeGraph tPG, TPackage tPackage,
			ExtractClassConfiguration tExtractConfiguration) {
		TClass tNewClass = BasicFactory.eINSTANCE.createTClass();
		tPG.getOwnedTypes().add(tNewClass);
		tPG.getClasses().add(tNewClass);
		tPackage.getOwnedTypes().add(tNewClass);
		tPackage.getClasses().add(tNewClass);
		String tExtractConfiguration_tNewClassName = tExtractConfiguration.getTNewClassName();
		String tNewClass_tName_prime = tExtractConfiguration_tNewClassName;
		tNewClass.setTName(tNewClass_tName_prime);
		return new Object[] { tPG, tPackage, tNewClass, tExtractConfiguration };

	}

	public static final Iterable<Object[]> pattern_Extract_Class_1_6_ActivityNode247_blackBF(
			ExtractClassConfiguration tExtractConfiguration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMember tMember : tExtractConfiguration.getTMembers()) {
			_result.add(new Object[] { tExtractConfiguration, tMember });
		}
		return _result;
	}

	public static final Object[] pattern_Extract_Class_1_7_ActivityNode248_bindingFB(TMember tMember) {
		TSignature _localVariable_0 = tMember.getSignature();
		TSignature tSignature = _localVariable_0;
		if (tSignature != null) {
			return new Object[] { tSignature, tMember };
		}
		return null;
	}

	public static final Object[] pattern_Extract_Class_1_7_ActivityNode248_blackBBBB(TSignature tSignature,
			TMember tMember, TClass tClass, TClass tNewClass) {
		if (!tClass.equals(tNewClass)) {
			if (tClass.equals(tMember.getDefinedBy())) {
				if (tClass.getSignature().contains(tSignature)) {
					return new Object[] { tSignature, tMember, tClass, tNewClass };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Extract_Class_1_7_ActivityNode248_bindingAndBlackFBBB(TMember tMember,
			TClass tClass, TClass tNewClass) {
		Object[] result_pattern_Extract_Class_1_7_ActivityNode248_binding = pattern_Extract_Class_1_7_ActivityNode248_bindingFB(
				tMember);
		if (result_pattern_Extract_Class_1_7_ActivityNode248_binding != null) {
			TSignature tSignature = (TSignature) result_pattern_Extract_Class_1_7_ActivityNode248_binding[0];

			Object[] result_pattern_Extract_Class_1_7_ActivityNode248_black = pattern_Extract_Class_1_7_ActivityNode248_blackBBBB(
					tSignature, tMember, tClass, tNewClass);
			if (result_pattern_Extract_Class_1_7_ActivityNode248_black != null) {

				return new Object[] { tSignature, tMember, tClass, tNewClass };
			}
		}
		return null;
	}

	public static final Object[] pattern_Extract_Class_1_7_ActivityNode248_redBB(TMember tMember, TClass tClass) {
		tMember.setDefinedBy(null);
		return new Object[] { tMember, tClass };
	}

	public static final Object[] pattern_Extract_Class_1_7_ActivityNode248_greenBBB(TSignature tSignature,
			TMember tMember, TClass tNewClass) {
		tMember.setDefinedBy(tNewClass);
		tNewClass.getSignature().add(tSignature);
		return new Object[] { tSignature, tMember, tNewClass };
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.TExtractClass;
	}
} // Extract_ClassImpl
