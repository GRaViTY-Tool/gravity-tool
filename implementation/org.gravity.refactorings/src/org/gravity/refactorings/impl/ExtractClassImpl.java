/**
 */
package org.gravity.refactorings.impl;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.gravity.refactorings.RefactoringFailedException;
import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.refactorings.configuration.impl.ExtractClassConfiguration;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TConstructorDefinition;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Extract
 * Class</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExtractClassImpl extends RefactoringImpl {

	private static final Logger LOGGER = Logger.getLogger(ExtractClassImpl.class.getName());
	
	/**
	 * Checks if the refactoring is applicable
	 * 
	 * @param tRefactoringConfiguration The refactoring configuration
	 * @return true, iff the refactoring is applicable
	 */
	@Override
	public boolean isApplicable(RefactoringConfiguration tRefactoringConfiguration) {
		if (tRefactoringConfiguration instanceof ExtractClassConfiguration) {
			ExtractClassConfiguration configuration = (ExtractClassConfiguration) tRefactoringConfiguration;

			List<TMember> tMembers = configuration.getTMembers();
			LOGGER.log(Level.INFO, "There is no memebr which should be extracted");
			if (tMembers.isEmpty()) {
				return false;
			}

			if(!checkTypes(configuration)) {
				return false;
			}

			for (TMember tMember : tMembers) {
				if(!checkMember(tMember)) {
					return false;
				}
			}
			return true;

		}
		LOGGER.log(Level.INFO, "Unsupported refactoring configuration");
		return false;

	}

	/**
	 * Checks if the member can be extracted
	 * 
	 * @param tMember The member
	 * @return true, iff the member can be extracted
	 */
	private boolean checkMember(TMember tMember) {
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
			LOGGER.log(Level.ERROR, "Unknown member type: " + tMember);
			return false;
		}
		return true;
	}

	/**
	 * Checks if the owner and the target type allow the refactoring
	 * 
	 * @param configuration The refactoring configuration
	 * @return true, iff the owner allows the refactoring
	 */
	private boolean checkTypes(ExtractClassConfiguration configuration) {
		TAbstractType owner = null;
		for (TMember tMember : configuration.getTMembers()) {
			TAbstractType tmp = tMember.getDefinedBy();
			if (owner == null) {
				owner = tmp;
			}
			if (owner != tmp) {
				LOGGER.log(Level.INFO, "Not all members have the same owner");
				return false;
			}
		}
		if(owner == null || owner.isTLib()) {
			return false;
		}
		
		final String tNewClassName = configuration.getTNewClassName();
		if (owner.getPackage().getOwnedTypes().parallelStream().anyMatch(t -> tNewClassName.equals(t.getTName()))) {
			LOGGER.log(Level.INFO,
					"There is already a type with the name \"" + tNewClassName + "\"");
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @throws RefactoringFailedException 
	 * 
	 * @generated NOT
	 */
	@Override
	public Collection<TClass> perform(RefactoringConfiguration tRefactoringConfiguration) throws RefactoringFailedException {

		if (tRefactoringConfiguration instanceof ExtractClassConfiguration) {
			ExtractClassConfiguration tExtractConfiguration = (ExtractClassConfiguration) tRefactoringConfiguration;

			TClass tClass = null;
			TPackage tPackage = null;
			TypeGraph tPG = null;

			for (TMember tSomeMember : tExtractConfiguration.getTMembers()) {
				TAbstractType tmpTClass = tSomeMember.getDefinedBy();
				if (tmpTClass instanceof TClass) {
					tPG = tmpTClass.getPg();
					if (tPG != null) {
						tPackage = tmpTClass.getPackage();
						if (tPackage != null) {
							tClass = (TClass) tmpTClass;
							break;
						}

					}

				}

			}
			if (tClass == null) {
				throw new RefactoringFailedException("Pattern matching failed." + " Variables: " + "[tExtractConfiguration] = "
						+ tExtractConfiguration + ".");
			}

			TClass tNewClass = createNewTClass(tExtractConfiguration, tPackage, tPG);

			List<TClass> tContainer = new LinkedList<>();
			tContainer.add(tNewClass);
			tContainer.add(tClass);

			// ForEach
			for (TMember tMember : tExtractConfiguration.getTMembers()) {
				TSignature tSignature = tMember.getSignature();
				if (tSignature != null && !tClass.equals(tNewClass) && tClass.equals(tMember.getDefinedBy())
						&& tClass.getSignature().contains(tSignature)) {
					tMember.setDefinedBy(null);
					tMember.setDefinedBy(tNewClass);
					tNewClass.getSignature().add(tSignature);

				} else {
					throw new RefactoringFailedException("Pattern matching failed." + " Variables: " + "[tMember] = " + tMember
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

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.TExtractClass;
	}
} // Extract_ClassImpl
