package org.gravity.refactorings.ui.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.NodeFinder;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.texteditor.ITextEditor;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.refactorings.RefactoringFailedException;
import org.gravity.refactorings.impl.PullUpMethodImpl;
import org.gravity.refactorings.ui.dialogs.RefactoringDialog;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TypeGraph;

public class RefactoringSelectionHandler extends RefactoringHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ITextEditor editor = (ITextEditor) HandlerUtil.getActiveEditor(event);
		ITextSelection sel = (ITextSelection) editor.getSelectionProvider().getSelection();
		ITypeRoot typeRoot = JavaUI.getEditorInputTypeRoot(editor.getEditorInput());
		ICompilationUnit icu = typeRoot.getAdapter(ICompilationUnit.class);
		CompilationUnit cu = parse(icu);
		NodeFinder finder = new NodeFinder(cu, sel.getOffset(), sel.getLength());
		ASTNode node = finder.getCoveringNode();

		Shell shell = editor.getSite().getShell();
		if (node instanceof MethodDeclaration) {
			MethodDeclaration method = (MethodDeclaration) node;
			ASTNode tmpASTNode1 = method.getParent();
			if (tmpASTNode1 instanceof TypeDeclaration) {
				TypeDeclaration childType = (TypeDeclaration) tmpASTNode1;
				WorkspaceJob job = new WorkspaceJob("PullUp method refactoring") {

					@Override
					public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
						IPGConverter converter;
						try {
							converter = GravityActivator.getDefault()
									.getConverter(icu.getJavaProject().getProject());
						} catch (NoConverterRegisteredException e) {
							return new Status(Status.ERROR, GravityActivator.PLUGIN_ID, "Please install a converter and restart the task.");
						}
						if (!converter.convertProject(icu.getJavaProject(), monitor)) {
							asyncPrintError(shell, "Refactoring Error", "Creating an PG from the sourcecode failed");

						}
						TypeGraph pg = converter.getPG();

						TClass tChild = getTClass(childType, pg);
						if (tChild != null) {
							TClass tParent = tChild.getParentClass();
							TMethodSignature tSignature = getMethodSignature(pg, method);

							PullUpMethodImpl refactoring = new PullUpMethodImpl();
							refactoring.setPg(pg);

							if (refactoring.isApplicable(tSignature, tParent)) {
								Display.getDefault().asyncExec(new Runnable() {

									@Override
									public void run() {
										Dialog dialog = new RefactoringDialog(shell, "Execute Refactoring",
												getPUMMessage(tParent, tSignature));
										int status = dialog.open();

										if (status == 0) {
											converter.syncProjectBwd(SynchronizationHelper -> {
												try {
													refactoring.perform(tSignature, tParent);
												} catch (RefactoringFailedException e) {
													asyncPrintError(shell, "Refactoring not possible",
															"The desired pull up method refactoring failed unexpectedly.");
												}
											}, monitor);
										}
									}

								});
							} else {
								asyncPrintError(shell, "Refactoring not possible",
										"The desired pull up method refactoring is not possible.");
							}

						} else {
							asyncPrintError(shell, "Refactoring Info", "Class not found in PG.");
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

				};
				job.setUser(false);
				job.schedule();

			} else {
				MessageDialog.openError(shell, "Refactoring Info", "Some internal error occured.");
			}
		} else {
			MessageDialog.openWarning(shell, "Refactoring Info", "Please select a method");
		}
		return null;
	}

}
