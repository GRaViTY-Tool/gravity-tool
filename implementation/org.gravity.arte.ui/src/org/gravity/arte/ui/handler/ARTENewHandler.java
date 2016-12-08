package org.gravity.arte.ui.handler;

import java.util.HashSet;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gravity.arte.ui.wizards.ARTETestFileWizard;

public class ARTENewHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelectionService service = window.getSelectionService();
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();

		HashSet<IJavaProject> java_projects = new HashSet<>();

		// Search all JavaProjects in selection
		for (Object entry : structured.toArray()) {
			if (entry instanceof IJavaProject) {
				java_projects.add((IJavaProject) entry);
			} else if (entry instanceof IResource) {
				IProject project = ((IResource) entry).getProject();
				try {
					if (project.hasNature(JavaCore.NATURE_ID)) {
						java_projects.add(JavaCore.create(project));
					} else {
						System.err.println("No Java Project: " + project); //$NON-NLS-1$
					}
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.err.println("We have something else: " + entry.getClass()); //$NON-NLS-1$
			}
		}

		// Handle all found JavaProjects
		for (IJavaProject java_project : java_projects) {
			WizardDialog dialog = new WizardDialog(null, new ARTETestFileWizard(java_project));
			dialog.open();
		}
		return null;
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
