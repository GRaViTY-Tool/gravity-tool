package org.gravity.refactorings.ui.handler;

import javax.swing.JOptionPane;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.WorkspaceJob;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.texteditor.ITextEditor;
import org.gravity.refactorings.ui.Messages;
import org.gravity.refactorings.ui.handler.jobs.MOMJob;

/**
 * 
 * A Handler for move method refactorings
 * 
 * @author speldszus
 *
 */
public class MOMHandler extends RefactoringHandler {

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

		String targetClassName = JOptionPane.showInputDialog(Messages.enterTargetClass);
		if (targetClassName != null && node instanceof MethodDeclaration) {
			// method = MethodDecl
			// childType = TypeDecl ---> Type of child class (Container of method) --->
			// change to sourceclassType?
			MethodDeclaration method = (MethodDeclaration) node;
			ASTNode tmpASTNode1 = method.getParent();
			if (tmpASTNode1 instanceof TypeDeclaration) {
				TypeDeclaration sourceType = (TypeDeclaration) tmpASTNode1;
				WorkspaceJob job = new MOMJob(icu, targetClassName, method, sourceType, shell);
				job.setUser(false);
				job.schedule();

			} else {
				MessageDialog.openError(shell, Messages.refactoringInfo, Messages.internalError);
			}
		} else {
			MessageDialog.openWarning(shell, Messages.refactoringInfo, Messages.selectMethod);
		}

		return null;
	}

}
