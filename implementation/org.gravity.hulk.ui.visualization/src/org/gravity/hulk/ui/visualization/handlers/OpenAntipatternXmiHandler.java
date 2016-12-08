package org.gravity.hulk.ui.visualization.handlers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gravity.eclipse.selection.SelectionHelper;
import org.gravity.hulk.HAntiPatternDetection;
import org.gravity.hulk.HulkActivator;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.ui.visualization.detection.SpaghettiCodePreprocessor;
import org.gravity.hulk.ui.visualization.detection.SwissArmyKnifePreprocessor;
import org.gravity.hulk.ui.visualization.detection.TheBlobPreprocessor;
import org.gravity.hulk.ui.visualization.information.providers.InformationViewContentProvider;
import org.gravity.hulk.ui.visualization.listener.DetectionLinkListener;
import org.gravity.hulk.ui.visualization.markerManager.AntipatternMarkerManager;

public class OpenAntipatternXmiHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		ISelectionService service = window.getSelectionService();
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
		List<Object> workspace_selection = Arrays.asList(structured.toArray());

		try {
			for(Object object : SelectionHelper.getJavaProjects(workspace_selection)){
				if (object instanceof IJavaProject) {
					IProject project = ((IJavaProject) object).getProject();
					openProject(project);
				}
			}
		} catch (Exception e) {
			MessageBox failure = new MessageBox(window.getShell(), SWT.ICON_INFORMATION | SWT.OK);
			failure.setText("Visualisation not possible");
			failure.setMessage("You must scan the project for Antipatterns before you can visualize it!");
			failure.open();
			return false;
		}
		MessageBox success = new MessageBox(window.getShell(), SWT.ICON_INFORMATION | SWT.OK);
		success.setText("Visualisation loaded");
		success.setMessage("Visualisation was successfully loaded!");
		success.open();

		return true;
	}

	private void openProject(IProject project) throws IOException, Exception {
		IFolder src = project.getFolder(HulkActivator.HULK_FOLDER_NAME);
		IFile antiPatternXmi = src.getFile(HulkActivator.ANTI_PATTERN_PG_XMI_NAME);
		URI uri = URI.createFileURI(antiPatternXmi.getLocation().toString());
		Resource antiPatternResource = new ResourceSetImpl().getResource(uri, true);
		antiPatternResource.load(Collections.EMPTY_MAP);
		EList<EObject> contents = antiPatternResource.getContents();
		EObject eObject = contents.get(0);
		HAntiPatternGraph apg;
		if (eObject instanceof HAntiPatternGraph) {
			apg = (HAntiPatternGraph) eObject;	
		}
		else if (eObject instanceof HAntiPatternDetection) {
			apg = ((HAntiPatternDetection) eObject).getApg();				
		}
		else {
			throw new Exception();
		}
		
		InformationViewContentProvider.setAPG(apg);
		DetectionLinkListener.setProject(project);
		AntipatternMarkerManager theBlobManager = new AntipatternMarkerManager(apg,
				new TheBlobPreprocessor(), project);
		AntipatternMarkerManager swissArmyKnifeManager = new AntipatternMarkerManager(apg,
				new SwissArmyKnifePreprocessor(), project);
		AntipatternMarkerManager spaghettiCodeManager = new AntipatternMarkerManager(apg,
				new SpaghettiCodePreprocessor(), project);
		theBlobManager.setMarkers();
		swissArmyKnifeManager.setMarkers();
		spaghettiCodeManager.setMarkers();
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
