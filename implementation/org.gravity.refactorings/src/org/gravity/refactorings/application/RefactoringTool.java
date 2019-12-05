package org.gravity.refactorings.application;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gravity.refactorings.Changes;
import org.gravity.refactorings.Refactoring;
import org.gravity.refactorings.RefactoringFailedException;
import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.impl.CreateSuperClassConfiguration;
import org.gravity.refactorings.configuration.impl.ExtractSuperClassConfiguration;
import org.gravity.refactorings.configuration.impl.MoveMethodConfiguration;
import org.gravity.refactorings.configuration.impl.PullUpFieldConfiguration;
import org.gravity.refactorings.configuration.impl.PullUpMethodConfiguration;
import org.gravity.refactorings.impl.CreateSuperclass;
import org.gravity.refactorings.impl.ExtractSuperclass;
import org.gravity.refactorings.impl.MoveMethod;
import org.gravity.refactorings.impl.PullUpField;
import org.gravity.refactorings.impl.PullUpMethod;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * This class provides the functionality to execute refactorings on a duplicate
 * of a program model and to re-execute them later on the real instance
 *
 * @author speldszus
 *
 */
public class RefactoringTool {

	private static final Logger LOGGER = Logger.getLogger(RefactoringTool.class);

	private TypeGraph toolPg;

	private PullUpMethod pumRefactoring;
	private PullUpField pufRefactoring;
	private MoveMethod momRefactoring;
	private CreateSuperclass cscRefactoring;
	private ExtractSuperclass escRefactoring;

	private final List<RefactoringConfiguration> bookkeeping;
	private final Set<String> changes;

	private void initRefactorings() {
		this.pumRefactoring = new PullUpMethod();
		this.pufRefactoring = new PullUpField();
		this.momRefactoring = new MoveMethod();
		this.cscRefactoring = new CreateSuperclass();
		this.escRefactoring = new ExtractSuperclass();
	}

	/**
	 * Creates a new instance of the refactoring application tool. Optionally a copy
	 * of the program model can be created for testing refactoring result before
	 * applying them to the real program model.
	 *
	 * @param pg The program model which should be refactored
	 * @param copy If a copy should be created
	 */
	public RefactoringTool(final TypeGraph pg, final boolean copy) {
		if (copy) {
			this.toolPg = EcoreUtil.copy(pg);
		} else {
			this.toolPg = pg;
		}
		initRefactorings();
		this.bookkeeping = new LinkedList<>();
		this.changes = new HashSet<>();
	}

	/**
	 * Executes the tested refactorings on the given program model
	 *
	 * @param pg The program model on which the refactorings should be executed
	 * @return The changes of the refactoring execution
	 */
	public Changes executePlannedRefactorings(final TypeGraph pg) {
		final Changes changeContainer = new Changes();
		final Consumer<EObject> changes = SynchronizationHelper -> {
			final RefactoringTool tool = new RefactoringTool(pg, false);
			tool.applyBookkeeping(this.bookkeeping);
			changeContainer.addChangedClassfiles(tool.getChanges());
		};
		changeContainer.setChanges(changes);
		return changeContainer;
	}

	/**
	 * Returns a list of all refactorings successfully applied to the program model
	 *
	 * @return the configurations of the applied refactorings
	 */
	public List<RefactoringConfiguration> getBookkeeping() {
		return this.bookkeeping;
	}

	public boolean applyRefactoring(final RefactoringConfiguration configuration) throws RefactoringFailedException {
		Refactoring refactoring;
		if (configuration instanceof PullUpMethodConfiguration) {
			refactoring = this.pumRefactoring;
		} else if (configuration instanceof PullUpFieldConfiguration) {
			refactoring = this.pufRefactoring;
		} else if (configuration instanceof CreateSuperClassConfiguration) {
			refactoring = this.cscRefactoring;
		} else if (configuration instanceof ExtractSuperClassConfiguration) {
			refactoring = this.escRefactoring;
		} else if (configuration instanceof MoveMethodConfiguration) {
			refactoring = this.momRefactoring;
		} else {
			throw new RefactoringFailedException("Unknown Refactoring Kind");
		}
		final boolean pumIsApplicable = refactoring.isApplicable(configuration);
		if (pumIsApplicable) {
			this.bookkeeping.add(configuration);
			for (final TClass tClass : refactoring.perform(configuration)) { //TODO: Make use of the cloned pm
				final String classNameString = tClass.getFullyQualifiedName() + ".java";
				if (!this.changes.contains(classNameString)) {
					this.changes.add(classNameString);
				}
			}
		}
		return pumIsApplicable;
	}

	/**
	 * Applies all stored refactoring to the program model
	 *
	 * @param bookkeeping The refactoring configurations
	 * @return true, if all refactorings have been applied successfully
	 */
	public boolean applyBookkeeping(final List<RefactoringConfiguration> bookkeeping) {
		boolean success = true;
		for (final RefactoringConfiguration r : bookkeeping) {
			try {
				success &= applyRefactoring(r);
			} catch (final RefactoringFailedException e) {
				LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
				return false;
			}
			if (!success) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Get all changes performed by this instance
	 *
	 * @return The changes
	 */
	public Set<String> getChanges() {
		return this.changes;
	}
}
