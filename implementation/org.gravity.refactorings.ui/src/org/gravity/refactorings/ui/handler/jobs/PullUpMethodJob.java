package org.gravity.refactorings.ui.handler.jobs;

import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.util.JavaASTUtil;
import org.gravity.refactorings.impl.PullUpMethod;
import org.gravity.refactorings.ui.Messages;
import org.gravity.refactorings.ui.dialogs.RefactoringDialog;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * A job for executing a pull up method refactoring
 *
 * @author speldszus
 *
 */
public final class PullUpMethodJob extends WorkspaceJob {

	private final Shell shell;

	private final TypeDeclaration childType;
	private final MethodDeclaration method;
	private final ICompilationUnit icu;

	public PullUpMethodJob(final MethodDeclaration method, final TypeDeclaration childType, final ICompilationUnit icu, final Shell shell) {
		super(Messages.pullUpUMethod);
		this.childType = childType;
		this.shell = shell;
		this.method = method;
		this.icu = icu;
	}

	@Override
	public IStatus runInWorkspace(final IProgressMonitor monitor) throws CoreException {
		IPGConverter converter;
		try {
			converter = GravityActivator.getDefault().getConverter(this.icu.getJavaProject().getProject());
		} catch (final NoConverterRegisteredException e) {
			return new Status(IStatus.ERROR, GravityActivator.PLUGIN_ID, Messages.installConverter);
		}
		if (!converter.convertProject(monitor)) {
			asyncPrintError(this.shell, Messages.refactoringError, Messages.createPMFailed);

		}
		final TypeGraph pg = converter.getPG();

		final TAbstractType tChild = JavaASTUtil.getType(this.childType, pg);
		if (tChild != null) {
			if(!(tChild instanceof TClass)) {
				asyncPrintError(this.shell, Messages.refactoringNotPossible, Messages.pullUpMethodNotPossible);
			}
			final TClass tParent = ((TClass) tChild).getParentClass();
			final TMethodSignature tSignature = JavaASTUtil.getTMethodSignature(this.method, pg);

			final PullUpMethod refactoring = new PullUpMethod();

			if (refactoring.isApplicable(tSignature, tParent)) {
				Display.getDefault().asyncExec(() -> {
					final Dialog dialog = new RefactoringDialog(PullUpMethodJob.this.shell, Messages.executeRefactoring,
							getPUMMessage(tParent, tSignature));
					final int status = dialog.open();

					if (status == 0) {
						converter.syncProjectBwd(synchronizationHelper -> refactoring.perform(tSignature, tParent),
								monitor);
					}
				});
			} else {
				asyncPrintError(this.shell, Messages.refactoringNotPossible, Messages.pullUpMethodNotPossible);
			}

		} else {
			asyncPrintError(this.shell, Messages.refactoringInfo, Messages.classNotFound);
		}
		return Status.OK_STATUS;
	}

	private void asyncPrintError(final Shell shell, final String title, final String message) {
		Display.getDefault().asyncExec(() -> MessageDialog.openError(shell, title, message));
	}

	static String getPUMMessage(final TClass tParent, final TMethodSignature tSignature) {
		StringBuilder builder = new StringBuilder(200).append(
				"All access dependencies have been checked successfully,\nplease check if all implementations of the method\n\n\t")
				.append(tSignature.getSignatureString());
		builder = builder.append("\n\n").append("in the classes\n\n");
		for (final TClass c : tParent.getChildClasses()) {
			builder = builder.append('\t').append(c.getFullyQualifiedName()).append('\n');
		}
		builder.append("\nhave an equivalent implementation.");
		return builder.toString();
	}

}
