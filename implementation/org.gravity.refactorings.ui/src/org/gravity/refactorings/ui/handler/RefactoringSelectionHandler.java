package org.gravity.refactorings.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.NodeFinder;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
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
import org.gravity.refactorings.impl.Pull_Up_MethodImpl;
import org.gravity.refactorings.ui.dialogs.RefactoringDialog;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TypeGraph;

public class RefactoringSelectionHandler extends AbstractHandler {

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

							Pull_Up_MethodImpl refactoring = new Pull_Up_MethodImpl();
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
												refactoring.perform(tSignature, tParent);
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

	String getPUMMessage(TClass tParent, TMethodSignature tSignature) {
		StringBuilder builder = new StringBuilder(
				"All access dependencies have been checked successfully,\nplease check if all implementations of the method\n\n\t");
		builder.append(tSignature.getMethod().getTName());
		builder.append('(');
		TParameter param = tSignature.getParamList().getFirst();
		while (param != null) {
			builder.append(param.getType().getTName());
			param = param.getNext();
			if (param != null) {
				builder.append(", ");
			}
		}
		builder.append(")\n\n");
		builder.append("in the classes\n\n");
		for (TClass c : tParent.getChildClasses()) {
			builder.append('\t');
			builder.append(getFullyQualifiedName(c));
			builder.append('\n');
		}
		builder.append("\nhave an equivalent implementation.");
		return builder.toString();
	}

	private static String getFullyQualifiedName(TClass c) {
		StringBuilder builder = new StringBuilder(c.getTName());
		TPackage p = c.getPackage();
		while (p != null) {
			builder.insert(0, '.');
			builder.insert(0, p.getTName());
			p = p.getParent();
		}
		return builder.toString();
	}

	TClass getTClass(TypeDeclaration type, TypeGraph pg) {
		TClass tChild = null;

		ASTNode tmpASTNode2 = type.getParent();
		if (tmpASTNode2 instanceof CompilationUnit) {
			CompilationUnit childcu = (CompilationUnit) tmpASTNode2;

			PackageDeclaration childPackage = childcu.getPackage();

			String[] names = childPackage.getName().getFullyQualifiedName().split("\\."); //$NON-NLS-1$
			EList<TPackage> packages = pg.getPackages();
			TPackage next = null;
			for (int i = 0; i < names.length; i++) {
				next = null;
				for (TPackage p : packages) {
					if (p.getTName().equals(names[i])) {
						next = p;
						break;
					}
				}
				if (next == null) {

				} else {
					packages = next.getSubpackage();
				}
			}

			for (TClass c : next.getClasses()) {
				if (c.getTName().equals(type.getName().toString())) {
					tChild = c;
					break;
				}
			}
		}
		return tChild;
	}

	TMethodSignature getMethodSignature(TypeGraph pg, MethodDeclaration method) {
		TMethod tMethod = null;
		for (TMethod m : pg.getMethods()) {
			if (m.getTName().equals(method.getName().toString())) {
				tMethod = m;
				break;
			}
		}

		if (tMethod == null) {
			return null;
		}

		for (TMethodSignature s : tMethod.getSignatures()) {
			if (method.parameters().size() != s.getParamList().getEntries().size()) {
				continue;
			}
			boolean success = true;
			TParameter tParam = s.getParamList().getFirst();
			for (Object p : method.parameters()) {
				if (p instanceof SingleVariableDeclaration) {
					SingleVariableDeclaration var = (SingleVariableDeclaration) p;
					Type vt = var.getType();
					if (vt.toString().equals(tParam.getType().getTName())) {
						tParam = tParam.getNext();
					} else {
						success = false;
						break;
					}
				}
			}
			if (success) {
				return s;
			}
		}

		return null;
	}

	private static CompilationUnit parse(ICompilationUnit icu) {
		final ASTParser parser = ASTParser.newParser(AST.JLS9);
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		parser.setSource(icu);
		// parser.setResolveBindings(true); // we need bindings later on
		return (CompilationUnit) parser.createAST(null);
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

}
