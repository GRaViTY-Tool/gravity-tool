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
import org.gravity.refactorings.impl.CreateSuperclassImpl;
import org.gravity.refactorings.impl.ExtractSuperclassImpl;
import org.gravity.refactorings.impl.MoveMethodImpl;
import org.gravity.refactorings.impl.PullUpFieldImpl;
import org.gravity.refactorings.impl.PullUpMethodImpl;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;
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

	private PullUpMethodImpl pumRefactoring;
	private PullUpFieldImpl pufRefactoring;
	private MoveMethodImpl momRefactoring;
	private CreateSuperclassImpl cscRefactoring;
	private ExtractSuperclassImpl escRefactoring;

	private List<RefactoringConfiguration> bookkeeping;
	private Set<String> changes;

	private void initRefactorings() {
		this.pumRefactoring = new PullUpMethodImpl(this.toolPg);
		this.pufRefactoring = new PullUpFieldImpl(this.toolPg);
		this.momRefactoring = new MoveMethodImpl(this.toolPg);
		this.cscRefactoring = new CreateSuperclassImpl(this.toolPg);
		this.escRefactoring = new ExtractSuperclassImpl(this.toolPg);
	}

	/**
	 * Creates a new instance of the refactoring application tool. Optionally a copy
	 * of the program model can be created for testing refactoring result before
	 * applying them to the real program model.
	 * 
	 * @param pg The program model which should be refactored
	 * @param copy If a copy should be created
	 */
	public RefactoringTool(TypeGraph pg, boolean copy) {
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
	public Changes executePlannedRefactorings(TypeGraph pg) {
		Changes changeContainer = new Changes();
		Consumer<EObject> changes = SynchronizationHelper -> {
			RefactoringTool tool = new RefactoringTool(pg, false);
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

	public boolean applyRefactoring(RefactoringConfiguration configuration) throws RefactoringFailedException {
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
		boolean pumIsApplicable = refactoring.isApplicable(configuration);
		if (pumIsApplicable) {
			this.bookkeeping.add(configuration);
			for (TClass tClass : refactoring.perform(configuration)) {
				String classname = tClass.getTName() + ".java"; //$NON-NLS-1$
				TPackage p = tClass.getPackage();
				while (p != null) {
					classname = p.getTName() + "." + classname; //$NON-NLS-1$
					p = p.getParent();
				}
				if (!this.changes.contains(classname)) {
					this.changes.add(classname);
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
	public boolean applyBookkeeping(List<RefactoringConfiguration> bookkeeping) {
		boolean success = true;
		for (RefactoringConfiguration r : bookkeeping) {
			try {
				success &= applyRefactoring(r);
			} catch (RefactoringFailedException e) {
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
