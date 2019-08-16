package org.gravity.hulk.ui.visualization.listener;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.gravity.eclipse.util.JavaProjectUtil;

public class DetectionLinkListener implements Listener {

	private static final Logger LOGGER = Logger.getLogger(DetectionLinkListener.class);

	Map<String, IFile> fileMap = new HashMap<String, IFile>();

	@Override
	public void handleEvent(Event event) {
		String tempString[] = event.text.split(":");
		tempString[0] = tempString[0].replace(".", "/");
		String iClassString = tempString[0] + "/" + tempString[1] + ".java";

		IJavaProject project = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		Object selectedObject = window.getSelectionService().getSelection(IPageLayout.ID_PROJECT_EXPLORER);
		if (selectedObject instanceof IStructuredSelection) {
			selectedObject = ((IStructuredSelection) selectedObject).getFirstElement();
		}
		if (selectedObject instanceof IAdaptable) {
			IResource res = (IResource) ((IAdaptable) selectedObject).getAdapter(IResource.class);
			project = JavaProjectUtil.convertToJavaProject(res.getProject());
		}
		if(project == null) {
			LOGGER.error("Cound't determin current active project");
			return;
		}
		
		IFile file;
		if (fileMap.containsKey(iClassString))
			file = fileMap.get(iClassString);
		else {
			try {
				file = (IFile) project.findType(iClassString).getResource();
				fileMap.put(iClassString, file);
			} catch (JavaModelException e) {
				LOGGER.error(e.getMessage(), e);
				return;
			}
		}

		IEditorInput iEditorInput = new FileEditorInput(file);
		IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());

		try {
			window.getActivePage().openEditor(iEditorInput, desc.getId());
		} catch (PartInitException e) {
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
		}
	}

}
