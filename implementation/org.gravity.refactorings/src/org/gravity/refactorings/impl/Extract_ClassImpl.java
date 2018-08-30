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
		// TODO: Implement Refactoring
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


			TClass tClass = null;
			TPackage tPackage = null;
			TypeGraph tPG = null;
			
			for (TMember tSomeMember : tExtractConfiguration.getTMembers()) {
				TAbstractType tmpTClass = tSomeMember.getDefinedBy();
				if (tmpTClass instanceof TClass) {
					tPG = tClass.getPg();
					if (tPG != null) {
						tPackage = tClass.getPackage();
						if (tPackage != null) {
							tClass = (TClass) tmpTClass;
							break;
						}

					}

				}

			}
			if (tClass == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tExtractConfiguration] = "
						+ tExtractConfiguration + ".");
			}

			TClass tNewClass = createNewTClass(tExtractConfiguration, tPackage, tPG);

			List<TClass> tContainer = new LinkedList<>();
			tContainer.add(tNewClass);
			tContainer.add(tClass);

			// ForEach
			for (Object[] result6_black : Extract_ClassImpl
					.pattern_Extract_Class_1_6_ActivityNode247_blackBF(tExtractConfiguration)) {
				TMember tMember = (TMember) result6_black[1];

				TSignature tSignature = tMember.getSignature();
				if (tSignature != null && !tClass.equals(tNewClass) && tClass.equals(tMember.getDefinedBy())
						&& tClass.getSignature().contains(tSignature)) {
					tMember.setDefinedBy(null);
					tMember.setDefinedBy(tNewClass);
					tNewClass.getSignature().add(tSignature);

				} else {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tMember] = " + tMember
							+ ", " + "[tClass] = " + tClass + ", " + "[tNewClass] = " + tNewClass + ".");
				}

			}
			return tContainer;
		} else {
			return null;
		}

	}

	private TClass createNewTClass(ExtractClassConfiguration tExtractConfiguration, TPackage tPackage, TypeGraph tPG) {
		TClass tNewClass = BasicFactory.eINSTANCE.createTClass();
		tNewClass.setTName(tExtractConfiguration.getTNewClassName());
		tPG.getOwnedTypes().add(tNewClass);
		tPG.getClasses().add(tNewClass);
		tPackage.getOwnedTypes().add(tNewClass);
		tPackage.getClasses().add(tNewClass);
		
		return tNewClass;
	}

	public static final Iterable<Object[]> pattern_Extract_Class_1_6_ActivityNode247_blackBF(
			ExtractClassConfiguration tExtractConfiguration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TMember tMember : tExtractConfiguration.getTMembers()) {
			_result.add(new Object[] { tExtractConfiguration, tMember });
		}
		return _result;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.TExtractClass;
	}
} // Extract_ClassImpl
