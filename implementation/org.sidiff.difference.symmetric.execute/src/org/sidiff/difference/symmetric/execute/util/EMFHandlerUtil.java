package org.sidiff.difference.symmetric.execute.util;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class EMFHandlerUtil {

	public static Resource getSelection(ExecutionEvent event, int indexOfselection) {
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);

		if (currentSelection instanceof IStructuredSelection) {
			if (((IStructuredSelection) currentSelection).toArray().length > indexOfselection) {
				Object selected = ((IStructuredSelection) currentSelection).toArray()[indexOfselection];
				
				if ((selected != null) && (selected instanceof IResource)) {
					ResourceSet rss = new ResourceSetImpl();
					URI uri = getURI((IResource) selected);
					return rss.getResource(uri, true);
				}	
			}
		}

		return null;
	}
	
	public static URI getURI(IResource workbenchResource) {

		String projectName = workbenchResource.getProject().getName();
		String filePath = workbenchResource.getProjectRelativePath().toOSString();
		String platformPath = projectName + "/" + filePath;

		return URI.createPlatformResourceURI(platformPath, true);
	}
}
