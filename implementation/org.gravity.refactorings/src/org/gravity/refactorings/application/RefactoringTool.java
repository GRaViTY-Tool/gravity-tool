package org.gravity.refactorings.application;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gravity.refactorings.Changes;
import org.gravity.refactorings.configuration.RefactoringConfiguration;
import org.gravity.refactorings.configuration.impl.CreateSuperClassConfiguration;
import org.gravity.refactorings.configuration.impl.ExtractSuperClassConfiguration;
import org.gravity.refactorings.configuration.impl.PullUpFieldConfiguration;
import org.gravity.refactorings.configuration.impl.PullUpMethodConfiguration;
import org.gravity.refactorings.impl.Create_SuperclassImpl;
import org.gravity.refactorings.impl.Extract_SuperclassImpl;
import org.gravity.refactorings.impl.Move_MethodImpl;
import org.gravity.refactorings.impl.Pull_Up_FieldImpl;
import org.gravity.refactorings.impl.Pull_Up_MethodImpl;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TypeGraph;

public class RefactoringTool {

	private TypeGraph tool_pg;
	
	private Pull_Up_MethodImpl pumRefactoring;
	private Pull_Up_FieldImpl pufRefactoring;
	private Move_MethodImpl momRefactoring;
	private Create_SuperclassImpl cscRefactoring;
	private Extract_SuperclassImpl escRefactoring;
	

	private List<RefactoringConfiguration> bookkeeping;
	private Set<String> changes;

	
	private void initRefactorings(){
		this.pumRefactoring = new Pull_Up_MethodImpl();
		this.pumRefactoring.setPg(this.tool_pg);
		
		this.pufRefactoring = new Pull_Up_FieldImpl();
		this.pufRefactoring.setPg(this.tool_pg);
		
		this.momRefactoring = new Move_MethodImpl();
		this.momRefactoring.setPg(this.tool_pg);
		
		this.cscRefactoring = new Create_SuperclassImpl();
		this.cscRefactoring.setPg(this.tool_pg);
		
		this.escRefactoring = new Extract_SuperclassImpl();
		this.escRefactoring.setPg(this.tool_pg);	
	}
	
	public RefactoringTool(TypeGraph pg, boolean copy) {
		if (copy) {
			this.tool_pg = EcoreUtil.copy(pg);
		} else {
			this.tool_pg = pg;
		}
		initRefactorings();
		this.bookkeeping = new LinkedList<>();
		this.changes = new HashSet<>();
	}

	public Changes executePlannedRefactorings(TypeGraph pg) {
		Changes change_container = new Changes();
		Consumer<EObject> changes = SynchronizationHelper -> {
			RefactoringTool tool = new RefactoringTool(pg, false);
			tool.applyBookkeeping(this.bookkeeping);
			change_container.addChanged_classfiles(tool.getChanges());
		};
		change_container.setChanges(changes);
		return change_container;
	}

	public boolean applyPullUpMethod(PullUpMethodConfiguration refactoring) {
		TClass parent = refactoring.getTargetClass();
		if (parent == null) {
			return false;
		}

		TMethodSignature sig = refactoring.getSignature();
		if (sig == null) {
			return false;
		}

		boolean pum_isApplicable = this.pumRefactoring.isApplicable(sig, parent);
		if (pum_isApplicable) {
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
		return pum_isApplicable;
	}

	public boolean applyPullupField(PullUpFieldConfiguration refactoring) {
		TClass parent = refactoring.getTargetClass();
		if (parent == null) {
			return false;
		}

		TFieldSignature sig = refactoring.getSignature();

		boolean pum_isApplicable = this.pufRefactoring.isApplicable(sig, parent);
		if (pum_isApplicable) {
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
		return pum_isApplicable;
	}

	public boolean applyCreateSuperclass(CreateSuperClassConfiguration refactoring) {
		List<TClass> tClasses = refactoring.getChildren();

		TClass new_parent = refactoring.getNewParent();
		
		boolean csc_isApplicable = this.cscRefactoring.isApplicable(tClasses, new_parent);
		if (csc_isApplicable) {
			this.bookkeeping.add(refactoring);
			for (TClass tClass : this.cscRefactoring.perform(tClasses, new_parent)) {
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

		return csc_isApplicable;
	}

	public boolean applyExtractSuperclassRefactoring(ExtractSuperClassConfiguration refactoring) {
		List<TClass> tClasses = refactoring.getChildren();

		TClass new_parent = refactoring.getNewParent();

		List<TSignature> tSignatures = refactoring.getSignatures();

		// check if Refactoring is applicable and perform it
		boolean esc_isApplicable = this.escRefactoring.isApplicable(tClasses, new_parent, tSignatures);
		if (esc_isApplicable) {
			this.bookkeeping.add(refactoring);
			for (TClass tClass : this.escRefactoring.perform(tClasses, new_parent, tSignatures)) {
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

		return esc_isApplicable;
	}
	
	public  List<RefactoringConfiguration> getBookkeeping() {
		return this.bookkeeping;
	}

	public boolean applyRefactoring(RefactoringConfiguration r) {
		if (r instanceof PullUpMethodConfiguration) {
			return applyPullUpMethod((PullUpMethodConfiguration) r);
		} else if (r instanceof PullUpFieldConfiguration) {
			return applyPullupField((PullUpFieldConfiguration) r);
		} else if (r instanceof CreateSuperClassConfiguration) {
			return applyCreateSuperclass((CreateSuperClassConfiguration) r);
		} else if (r instanceof ExtractSuperClassConfiguration) {
			return applyExtractSuperclassRefactoring((ExtractSuperClassConfiguration) r);
		} else {
			throw new RuntimeException("Unknown Refactoring Kind");
		}
	}

	public boolean applyBookkeeping(List<RefactoringConfiguration> bookkeeping) {
		boolean success = true;
		for (RefactoringConfiguration r : bookkeeping) {
			success &= applyRefactoring(r);
			if (!success) {
				return false;
			}
		}
		return true;
	}

	public Set<String> getChanges() {
		return this.changes;
	}
}
