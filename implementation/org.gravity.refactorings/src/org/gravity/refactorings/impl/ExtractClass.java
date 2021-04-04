/**
 */
package org.gravity.refactorings.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.osgi.util.NLS;
import org.gravity.refactorings.Refactoring;
import org.gravity.refactorings.RefactoringFailedException;
import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.TRefactoringID;
import org.gravity.refactorings.configuration.impl.ExtractClassConfiguration;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TConstructor;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Extract
 * Class</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExtractClass implements Refactoring {

	private static final Logger LOGGER = Logger.getLogger(ExtractClass.class.getName());

	/**
	 * Checks if the refactoring is applicable
	 *
	 * @param tRefactoringConfiguration The refactoring configuration
	 * @return true, iff the refactoring is applicable
	 */
	@Override
	public boolean isApplicable(final RefactoringConfiguration tRefactoringConfiguration) {
		if (tRefactoringConfiguration instanceof ExtractClassConfiguration) {
			final ExtractClassConfiguration configuration = (ExtractClassConfiguration) tRefactoringConfiguration;

			final Collection<TMember> tMembers = configuration.getTMembers();
			LOGGER.log(Level.INFO, "There is no memebr which should be extracted");
			if (tMembers.isEmpty()) {
				return false;
			}

			if (!checkTypes(configuration)) {
				return false;
			}

			for (final TMember tMember : tMembers) {
				if (!checkMember(tMember)) {
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
	private boolean checkMember(final TMember tMember) {
		if (tMember instanceof TMethodDefinition) {
			final TMethodDefinition mDef = (TMethodDefinition) tMember;
			if (TConstructor.isConstructor(mDef)) {
				return false;
			}
			if ((mDef.getOverriding() != null) || !mDef.getOverriddenBy().isEmpty()) {
				return false;
			}
		} else if (tMember instanceof TFieldDefinition) {
			final TFieldDefinition fDef = (TFieldDefinition) tMember;
			if ((fDef.getHiding() != null) || !fDef.getHiddenBy().isEmpty()) {
				return false;
			}
		} else {
			LOGGER.error(NLS.bind("Unknown member type: {0}", tMember));
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
	private boolean checkTypes(final ExtractClassConfiguration configuration) {
		TAbstractType owner = null;
		for (final TMember tMember : configuration.getTMembers()) {
			final TAbstractType tmp = tMember.getDefinedBy();
			if (owner == null) {
				owner = tmp;
			}
			if (owner != tmp) {
				if (LOGGER.isInfoEnabled()) {
					LOGGER.info("Not all members have the same owner");
				}
				return false;
			}
		}
		if ((owner == null) || owner.isTLib()) {
			return false;
		}

		final String tNewClassName = configuration.getTNewClassName();
		if (owner.getPackage().getOwnedTypes().parallelStream().anyMatch(t -> tNewClassName.equals(t.getTName()))) {
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info(NLS.bind("There is already a type with the name \"{0}\"", tNewClassName));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @throws RefactoringFailedException
	 *
	 * @generated NOT
	 */
	@Override
	public Collection<TClass> perform(final RefactoringConfiguration tRefactoringConfiguration)
			throws RefactoringFailedException {

		if (tRefactoringConfiguration instanceof ExtractClassConfiguration) {
			final ExtractClassConfiguration tExtractConfiguration = (ExtractClassConfiguration) tRefactoringConfiguration;

			TClass tClass = null;
			TPackage tPackage = null;
			TypeGraph tPG = null;

			for (final TMember tSomeMember : tExtractConfiguration.getTMembers()) {
				final TAbstractType tmpTClass = tSomeMember.getDefinedBy();
				if (tmpTClass instanceof TClass) {
					tPG = tmpTClass.getModel();
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
				throw new RefactoringFailedException("Pattern matching failed." + " Variables: "
						+ "[tExtractConfiguration] = " + tExtractConfiguration + ".");
			}

			final TClass tNewClass = createNewTClass(tExtractConfiguration, tPackage, tPG);

			final List<TClass> tContainer = new LinkedList<>();
			tContainer.add(tNewClass);
			tContainer.add(tClass);

			// ForEach
			for (final TMember tMember : tExtractConfiguration.getTMembers()) {
				final TSignature tSignature = tMember.getSignature();
				if ((tSignature != null) && !tClass.equals(tNewClass) && tClass.equals(tMember.getDefinedBy())
						&& tClass.getSignature().contains(tSignature)) {
					tMember.setDefinedBy(null);
					tMember.setDefinedBy(tNewClass);
					tNewClass.getSignature().add(tSignature);

				} else {
					throw new RefactoringFailedException("Pattern matching failed." + " Variables: " + "[tMember] = "
							+ tMember + ", " + "[tClass] = " + tClass + ", " + "[tNewClass] = " + tNewClass + ".");
				}

			}
			return tContainer;
		} else {
			return Collections.emptySet();
		}

	}

	private TClass createNewTClass(final ExtractClassConfiguration tExtractConfiguration, final TPackage tPackage, final TypeGraph tPG) {
		final TClass tNewClass = BasicFactory.eINSTANCE.createTClass();
		tNewClass.setTName(tExtractConfiguration.getTNewClassName());
		tPG.getOwnedTypes().add(tNewClass);
		tPG.getClasses().add(tNewClass);
		tPackage.getOwnedTypes().add(tNewClass);
		tPackage.getClasses().add(tNewClass);

		return tNewClass;
	}

	@Override
	public TRefactoringID getRefactoringID() {
		return TRefactoringID.EXTRACT_CLASS;
	}
} // Extract_ClassImpl
