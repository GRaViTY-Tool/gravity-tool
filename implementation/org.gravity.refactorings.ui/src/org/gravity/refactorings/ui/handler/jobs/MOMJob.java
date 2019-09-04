package org.gravity.refactorings.ui.handler.jobs;

import javax.swing.JOptionPane;

import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.util.JavaASTUtil;
import org.gravity.refactorings.impl.MoveMethod;
import org.gravity.refactorings.ui.Messages;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TypeGraph;

public final class MOMJob extends WorkspaceJob {
	private final ICompilationUnit icu;
	private final String targetClassName;
	private final MethodDeclaration method;
	private final TypeDeclaration sourceType;
	private final Shell shell;

	public MOMJob(ICompilationUnit icu, String targetClassName, MethodDeclaration method,
			TypeDeclaration sourceType, Shell shell) {
		super(Messages.moveMethod);
		this.icu = icu;
		this.targetClassName = targetClassName;
		this.method = method;
		this.sourceType = sourceType;
		this.shell = shell;
	}

	@Override
	public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
		IPGConverter converter;
		try {
			converter = GravityActivator.getDefault().getConverter(icu.getJavaProject().getProject());
		} catch (NoConverterRegisteredException e) {
			return new Status(Status.ERROR, GravityActivator.PLUGIN_ID, Messages.installConverter);
		}
		if (!converter.convertProject(icu.getJavaProject(), monitor)) {
			asyncPrintError(shell, Messages.refactoringError, Messages.createPMFailed);

		}
		TypeGraph pg = converter.getPG();

		// Gets class for child type; rpl with source class
		TClass sourceClass = JavaASTUtil.getTClass(sourceType, pg);
		if (sourceClass != null) {
			final TClass targetClass = pg.getClass(targetClassName);
			if (targetClass == null) {
				return null;
			}

			TMethodSignature tSignature = JavaASTUtil.getTMethodSignature(method, pg);
			MoveMethod momRefactoring = new MoveMethod();

			if (momRefactoring.isApplicable(tSignature, targetClass, sourceClass)) { // Already changed to new
																						// isApplicable
				Display.getDefault().asyncExec(new Runnable() {

					@Override
					public void run() {

						converter.syncProjectBwd(SynchronizationHelper -> {
							momRefactoring.perform(tSignature, targetClass, sourceClass);
						}, monitor);
						JOptionPane.showMessageDialog(null,
								Messages.bind(Messages.moveMethodFromTo, sourceClass.getTName(), targetClassName));
					}

				});
			} else {
				asyncPrintError(shell, Messages.refactoringNotPossible, Messages.moveMethodNotPossible);
			}

		} else {
			asyncPrintError(shell, Messages.refactoringInfo, Messages.classNotFound);
		}
		return Status.OK_STATUS;
	}

	private void asyncPrintError(Shell shell, String title, String message) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageDialog.openError(shell, title, message);
			}
		});
	}
}
