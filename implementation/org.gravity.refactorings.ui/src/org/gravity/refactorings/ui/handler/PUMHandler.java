package org.gravity.refactorings.ui.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.NodeFinder;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.texteditor.ITextEditor;
import org.gravity.refactorings.ui.Messages;
import org.gravity.refactorings.ui.handler.jobs.PullUpMethodJob;

/**
 * A handler for applying pull-up method refactorings
 *
 * @author speldszus
 *
 */
public class PUMHandler extends RefactoringHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final ITextEditor editor = (ITextEditor) HandlerUtil.getActiveEditor(event);
		final ITextSelection sel = (ITextSelection) editor.getSelectionProvider().getSelection();
		final ITypeRoot typeRoot = JavaUI.getEditorInputTypeRoot(editor.getEditorInput());
		final ICompilationUnit icu = typeRoot.getAdapter(ICompilationUnit.class);
		final CompilationUnit cu = parse(icu);
		final NodeFinder finder = new NodeFinder(cu, sel.getOffset(), sel.getLength());
		ASTNode node = finder.getCoveringNode();

		final Shell shell = editor.getSite().getShell();
		if(node instanceof SimpleName) {
			node = ((SimpleName) node).getParent();
		}
		if (node instanceof MethodDeclaration) {
			final MethodDeclaration method = (MethodDeclaration) node;
			final ASTNode tmpASTNode1 = method.getParent();
			if (tmpASTNode1 instanceof TypeDeclaration) {
				final TypeDeclaration childType = (TypeDeclaration) tmpASTNode1;
				final WorkspaceJob job = new PullUpMethodJob(method, childType, icu, shell);
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
