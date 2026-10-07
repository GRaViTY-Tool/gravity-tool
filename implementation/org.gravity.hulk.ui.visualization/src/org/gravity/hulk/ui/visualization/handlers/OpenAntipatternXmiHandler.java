package org.gravity.hulk.ui.visualization.handlers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gravity.eclipse.selection.SelectionHelper;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.hulk.HulkActivator;
import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.impl.HAntiPatternDetection;
import org.gravity.hulk.ui.visualization.detection.SpaghettiCodePreprocessor;
import org.gravity.hulk.ui.visualization.detection.SwissArmyKnifePreprocessor;
import org.gravity.hulk.ui.visualization.detection.preprocessNACCMetric;
import org.gravity.hulk.ui.visualization.information.providers.InformationViewContentProvider;
import org.gravity.hulk.ui.visualization.marker.AntipatternMarkerManager;

public class OpenAntipatternXmiHandler extends AbstractHandler {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(OpenAntipatternXmiHandler.class);

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final var window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		final var service = window.getSelectionService();
		final var structured = (IStructuredSelection) service.getSelection();
		final List<Object> workspaceSelection = Arrays.asList(structured.toArray());

		try {
			for (final IJavaProject project : SelectionHelper.getJavaProjects(workspaceSelection)) {
				this.openProject(project.getProject());
			}
		} catch (final IOException e) {
			final var failure = new MessageBox(window.getShell(), SWT.ICON_INFORMATION | SWT.OK);
			failure.setText("Visualisation not possible");
			failure.setMessage("You must scan the project for Antipatterns before you can visualize it!");
			failure.open();
			return false;
		}
		final var success = new MessageBox(window.getShell(), SWT.ICON_INFORMATION | SWT.OK);
		success.setText("Visualisation loaded");
		success.setMessage("Visualisation was successfully loaded!");
		success.open();

		return true;
	}

	private void openProject(final IProject project) throws IOException {
		final var src = EclipseProjectUtil.getGravityFolder(project, new NullProgressMonitor());
		final var antiPatternXmi = src.getFile(HulkActivator.ANTI_PATTERN_XMI_NAME);
		final var uri = URI.createFileURI(antiPatternXmi.getLocation().toString());
		final var antiPatternResource = new ResourceSetImpl().getResource(uri, true);
		antiPatternResource.load(Collections.emptyMap());
		final var contents = antiPatternResource.getContents();
		final var eObject = contents.get(0);
		HAntiPatternGraph apg;
		if (eObject instanceof HAntiPatternGraph) {
			apg = (HAntiPatternGraph) eObject;
		} else if (eObject instanceof HAntiPatternDetection) {
			apg = ((HAntiPatternDetection) eObject).getApg();
		} else {
			throw new IllegalStateException(
					"The root of the antipattern graph has an unexpected type: " + eObject.eClass().getName());
		}

		InformationViewContentProvider.setAPG(apg);

		final var javaProject = JavaProjectUtil.getJavaProject(project);
		if (javaProject == null) {
			LOGGER.error("Not a Java project: " + project.getName());
			return;
		}

		final var theBlobManager = new AntipatternMarkerManager(apg, new preprocessNACCMetric(),
				javaProject);
		final var swissArmyKnifeManager = new AntipatternMarkerManager(apg,
				new SwissArmyKnifePreprocessor(), javaProject);
		final var spaghettiCodeManager = new AntipatternMarkerManager(apg,
				new SpaghettiCodePreprocessor(), javaProject);
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
