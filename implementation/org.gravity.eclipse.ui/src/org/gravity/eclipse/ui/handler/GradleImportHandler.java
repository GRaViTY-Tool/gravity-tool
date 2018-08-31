package org.gravity.eclipse.ui.handler;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.gravity.eclipse.importer.GradleImport;
import org.gravity.eclipse.importer.NoGradleRootFolderException;

/**
 * A handler for importing gradle projects as single eclipse project into the workspace
 * 
 * @author speldszus
 *
 */
public class GradleImportHandler extends AbstractHandler {
	
	private static final Logger LOGGER = Logger.getLogger(GradleImportHandler.class);

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbench workbench = PlatformUI.getWorkbench();
		FileDialog dialog = new FileDialog(workbench.getActiveWorkbenchWindow().getShell());
		dialog.setFilterExtensions(new String[] { "*.gradle" });
		String result = dialog.open();
		
		File parentFile = new File(result).getParentFile();

		try {
			NullProgressMonitor monitor = new NullProgressMonitor();
			IJavaProject project = new GradleImport(parentFile).importGradleProject(monitor);
			if(project != null) {
				project.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
			}
		} catch (CoreException e) {
			LOGGER.log(Level.WARN, e);
		} catch (IOException | InterruptedException  e) {
			LOGGER.log(Level.ERROR, e);
			MessageDialog.openError(workbench.getActiveWorkbenchWindow().getShell(), "Import of gradle project failed", "The import of the gradle project at \""+parentFile.getPath()+"\" failed.");
		}
		catch(NoGradleRootFolderException e) {
			LOGGER.log(Level.ERROR, e);
			MessageDialog.openError(workbench.getActiveWorkbenchWindow().getShell(), "Import of gradle project failed", "The import of the gradle project at \""+parentFile.getPath()+"\" failed. The root of the gradle project couldn't be found!");
		}
		return null;
	}

}
