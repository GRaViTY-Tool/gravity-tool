package org.gravity.eclipse.ui.handler;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.gravity.eclipse.importer.GradleImport;

public class GradleImportHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbench workbench = PlatformUI.getWorkbench();
		FileDialog dialog = new FileDialog(workbench.getActiveWorkbenchWindow().getShell());
		dialog.setFilterExtensions(new String[] { "*.gradle" });
		String result = dialog.open();

		//		String currentUsersHomeDir = System.getProperty("user.home");
//		String gradleHome = currentUsersHomeDir + File.separator + ".gradle";
//		String androidHome = currentUsersHomeDir + File.separator + "Android/Sdk";
		
		File parentFile = new File(result).getParentFile();
//		int i = 1;
//		String name = parentFile.getName();
//		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
//		while(root.getProject(name).exists()){
//			name += i++;
//		}
		try {
			NullProgressMonitor monitor = new NullProgressMonitor();
			IJavaProject project = new GradleImport(parentFile).importGradleProject(monitor);
			if(project != null) {
				project.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return null;
	}

}
