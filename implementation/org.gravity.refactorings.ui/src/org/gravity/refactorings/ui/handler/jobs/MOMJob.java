package org.gravity.refactorings.ui.handler.jobs;

import javax.swing.JOptionPane;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.util.JavaASTUtil;
import org.gravity.refactorings.RefactoringFailedException;
import org.gravity.refactorings.impl.MoveMethod;
import org.gravity.refactorings.ui.Messages;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TypeGraph;

public final class MOMJob extends WorkspaceJob {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(MOMJob.class);

	private final ICompilationUnit icu;
	private final String targetClassName;
	private final MethodDeclaration method;
	private final TypeDeclaration sourceType;
	private final Shell shell;

	public MOMJob(final ICompilationUnit icu, final String targetClassName, final MethodDeclaration method,
			final TypeDeclaration sourceType, final Shell shell) {
		super(Messages.moveMethod);
		this.icu = icu;
		this.targetClassName = targetClassName;
		this.method = method;
		this.sourceType = sourceType;
		this.shell = shell;
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

		// Gets class for child type; rpl with source class
		final TAbstractType sourceClass = JavaASTUtil.getType(this.sourceType, pg);
		if (sourceClass != null) {
			final TClass targetClass = pg.getClass(this.targetClassName);
			if (targetClass == null) {
				return null;
			}

			final TMethodSignature tSignature = JavaASTUtil.getTMethodSignature(this.method, pg);
			final MoveMethod momRefactoring = new MoveMethod();

			if (sourceClass instanceof TClass
					&& momRefactoring.isApplicable(tSignature, targetClass, (TClass) sourceClass)) { // Already changed
																										// to new
				// isApplicable
				Display.getDefault().asyncExec(() -> {

					converter.syncProjectBwd(synchronizationHelper -> {
						try {
							momRefactoring.perform(tSignature, targetClass, (TClass) sourceClass);
						} catch (final RefactoringFailedException e) {
							LOGGER.error(e.getMessage(), e);
						}
					}, monitor);
					JOptionPane.showMessageDialog(null,
							NLS.bind(Messages.moveMethodFromTo, sourceClass.getTName(), MOMJob.this.targetClassName));
				});
			} else {
				asyncPrintError(this.shell, Messages.refactoringNotPossible, Messages.moveMethodNotPossible);
			}

		} else {
			asyncPrintError(this.shell, Messages.refactoringInfo, Messages.classNotFound);
		}
		return Status.OK_STATUS;
	}

	private void asyncPrintError(final Shell shell, final String title, final String message) {
		Display.getDefault().asyncExec(() -> MessageDialog.openError(shell, title, message));
	}
}
