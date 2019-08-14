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
import org.gravity.refactorings.RefactoringFailedException;
import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.impl.CreateSuperClassConfiguration;
import org.gravity.refactorings.configuration.impl.ExtractSuperClassConfiguration;
import org.gravity.refactorings.configuration.impl.PullUpFieldConfiguration;
import org.gravity.refactorings.configuration.impl.PullUpMethodConfiguration;
import org.gravity.refactorings.impl.CreateSuperclassImpl;
import org.gravity.refactorings.impl.ExtractSuperclassImpl;
import org.gravity.refactorings.impl.MoveMethodImpl;
import org.gravity.refactorings.impl.PullUpFieldImpl;
import org.gravity.refactorings.impl.PullUpMethodImpl;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TSignature;
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
	 * Applies the PUM refactoring to the program model
	 * 
	 * @param refactoring The refactoring configuration
	 * @return true, if the refactoring is possible and has been applied
	 * @throws RefactoringFailedException if the refactoing failed unexpectedly
	 */
	public boolean applyPullUpMethod(PullUpMethodConfiguration refactoring) throws RefactoringFailedException {
		TClass parent = refactoring.getTargetClass();
		if (parent == null) {
			return false;
		}

		TMethodSignature sig = refactoring.getSignature();
		if (sig == null) {
			return false;
		}

		boolean pumIsApplicable = this.pumRefactoring.isApplicable(sig, parent);
		if (pumIsApplicable) {
			this.bookkeeping.add(refactoring);
			for (TClass tClass : this.pumRefactoring.perform(sig, parent)) {
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
	 * Applies the pull-up field refactoring to the program model
	 * 
	 * @param refactoring The refactoring configuration
	 * @return true, if the refactoring is possible and has been applied
	 * @throws RefactoringFailedException if the refactoring failed unexpectedly
	 */
	public boolean applyPullupField(PullUpFieldConfiguration refactoring) throws RefactoringFailedException {
		TClass parent = refactoring.getTargetClass();
		if (parent == null) {
			return false;
		}

		TFieldSignature sig = refactoring.getSignature();

		boolean pumIsApplicable = this.pufRefactoring.isApplicable(sig, parent);
		if (pumIsApplicable) {
			this.bookkeeping.add(refactoring);

			// Perform refactoring and record changed classes
			for (TClass tClass : this.pufRefactoring.perform(sig, parent)) {
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
	 * Applies the create superclass refactoring to the program model
	 * 
	 * @param refactoring The refactoring configuration
	 * @return true, if the refactoring is possible and has been applied
	 */
	public boolean applyCreateSuperclass(CreateSuperClassConfiguration refactoring) throws RefactoringFailedException {
		List<TClass> tClasses = refactoring.getChildren();

		TClass newParent = refactoring.getNewParent();

		boolean cscIsApplicable = this.cscRefactoring.isApplicable(tClasses, newParent);
		if (cscIsApplicable) {
			this.bookkeeping.add(refactoring);
			for (TClass tClass : this.cscRefactoring.perform(tClasses, newParent)) {
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

		return cscIsApplicable;
	}

	/**
	 * Applies the extract superclass refactoring to the program model
	 * 
	 * @param refactoring The refactoring configuration
	 * @return true, if the refactoring is possible and has been applied
	 */
	public boolean applyExtractSuperclassRefactoring(ExtractSuperClassConfiguration refactoring)
			throws RefactoringFailedException {
		List<TClass> tClasses = refactoring.getChildren();

		TClass newParent = refactoring.getNewParent();

		List<TSignature> tSignatures = refactoring.getSignatures();

		// check if Refactoring is applicable and perform it
		boolean escIsApplicable = this.escRefactoring.isApplicable(tClasses, newParent, tSignatures);
		if (escIsApplicable) {
			this.bookkeeping.add(refactoring);
			for (TClass tClass : this.escRefactoring.perform(tClasses, newParent, tSignatures)) {
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

		return escIsApplicable;
	}

	/**
	 * Returns a list of all refactorings successfully applied to the program model
	 * 
	 * @return the configurations of the applied refactorings
	 */
	public List<RefactoringConfiguration> getBookkeeping() {
		return this.bookkeeping;
	}

	public boolean applyRefactoring(RefactoringConfiguration r) throws RefactoringFailedException {
		if (r instanceof PullUpMethodConfiguration) {
			return applyPullUpMethod((PullUpMethodConfiguration) r);
		} else if (r instanceof PullUpFieldConfiguration) {
			return applyPullupField((PullUpFieldConfiguration) r);
		} else if (r instanceof CreateSuperClassConfiguration) {
			return applyCreateSuperclass((CreateSuperClassConfiguration) r);
		} else if (r instanceof ExtractSuperClassConfiguration) {
			return applyExtractSuperclassRefactoring((ExtractSuperClassConfiguration) r);
		} else {
			throw new RefactoringFailedException("Unknown Refactoring Kind");
		}
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
