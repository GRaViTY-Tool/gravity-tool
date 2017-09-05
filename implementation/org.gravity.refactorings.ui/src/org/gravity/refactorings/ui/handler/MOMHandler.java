package org.gravity.refactorings.ui.handler;

import javax.swing.JOptionPane;

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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.texteditor.ITextEditor;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.refactorings.Move_Method;
import org.gravity.refactorings.RefactoringsFactory;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TypeGraph;

public class MOMHandler extends RefactoringHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		// General decls.
		ITextEditor editor = (ITextEditor) HandlerUtil.getActiveEditor(event);
		ITextSelection sel = (ITextSelection) editor.getSelectionProvider().getSelection();
		ITypeRoot typeRoot = JavaUI.getEditorInputTypeRoot(editor.getEditorInput());
		ICompilationUnit icu = typeRoot.getAdapter(ICompilationUnit.class);
		CompilationUnit cu = parse(icu);
		NodeFinder finder = new NodeFinder(cu, sel.getOffset(), sel.getLength());
		ASTNode node = finder.getCoveringNode();
		Shell shell = editor.getSite().getShell();
		
		String targetClassName = JOptionPane.showInputDialog("Enter target Class Name");
		if(targetClassName == null){
			return null;
		}
		
		// method = MethodDecl
		// childType = TypeDecl   ---> Type of child class (Container of method) ---> change to sourceclassType?
		if (node instanceof MethodDeclaration) {
			MethodDeclaration method = (MethodDeclaration) node;
			ASTNode tmpASTNode1 = method.getParent();
			if (tmpASTNode1 instanceof TypeDeclaration) {
				TypeDeclaration sourceType = (TypeDeclaration) tmpASTNode1;
				WorkspaceJob job = new WorkspaceJob("Move method refactoring") {			// Changed

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

						// Start here
						// ***
						TClass sourceClass = getTClass(sourceType, pg);		// Gets class for child type; rpl with source class
						if (sourceClass != null) {
							TClass targetClass = null;
							for(TClass tClass: pg.getClasses()){
								if(tClass.getTName().toLowerCase().equals(targetClassName.toLowerCase())  && !tClass.isTLib()){
									targetClass = tClass;
									break;
								}
							}
							if(targetClass == null){
								return null;
							}
							
							TClass targetClassCopy = targetClass;
							
							TMethodSignature tSignature = getMethodSignature(pg, method);
							Move_Method momRefactoring = RefactoringsFactory.eINSTANCE.createMove_Method();
							momRefactoring.setPg(pg);

							if (momRefactoring.isApplicable(tSignature, targetClass, sourceClass)) {  // Already changed to new isApplicable
								Display.getDefault().asyncExec(new Runnable() {

									@Override
									public void run() {

											converter.syncProjectBwd(SynchronizationHelper -> {
												momRefactoring.Perform(tSignature, targetClassCopy, sourceClass);		// TYPO in EA model, perfom
												TypeGraph pg = sourceClass.getPg(); //TODO remove
												pg.getClasses(); // TODO remove
											}, monitor);
										JOptionPane.showMessageDialog(null, "Moved Method from " +sourceClass.getTName() + " to " + targetClassName);
											
											
									}

								});
							} else {
								asyncPrintError(shell, "Refactoring not possible",
										"The desired move method refactoring is not possible.");
							}

						} else {
							asyncPrintError(shell, "Refactoring Info", "Class not found in PG.");
						}
						
						//
						// ***
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
