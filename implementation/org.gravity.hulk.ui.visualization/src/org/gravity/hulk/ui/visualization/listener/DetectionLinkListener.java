package org.gravity.hulk.ui.visualization.listener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.gravity.hulk.ui.visualization.util.AstUtil;

public class DetectionLinkListener implements Listener {
	
	Map<String,IFile> fileMap = new HashMap<String, IFile>();

	private static IProject project;


	public DetectionLinkListener() {
	}

	public static void setProject(IProject project) {
		DetectionLinkListener.project = project;
	}

	@Override
	public void handleEvent(Event event) {
		String tempString[] = event.text.split(":");
		tempString[0] = tempString[0].replace(".", "/");
		String iClassString = tempString[0] + "/" + tempString[1] + ".java";

		IFolder src = project.getFolder("src");
		IFile iClass;
		
		if(fileMap.containsKey(iClassString))
			iClass = fileMap.get(iClassString);
		else{
			iClass = (IFile) src.findMember(iClassString);
			if(iClass!=null){
				fileMap.put(iClassString,iClass);
			}
			else{
				IFolder iFolder = src.getFolder(tempString[0]);
				List<IFile> resultList = new ArrayList<IFile>();
				AstUtil.findFileWithTypeDeclaration(iFolder, tempString[1].trim(),
						resultList);
				iClass=resultList.get(0);
				fileMap.put(iClassString, iClass);			}
		}

		IEditorInput iEditorInput = new FileEditorInput(iClass);

		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();

		IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(iClass.getName());

		try {
			page.openEditor(iEditorInput, desc.getId());
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
