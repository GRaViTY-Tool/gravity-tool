package org.gravity.eclipse.ui.handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class UISelectionHelper {

	private UISelectionHelper() {
		// This class only defines static helpers
	}

	/**
	 * This operation gets the current selection in the workspace for an event
	 *
	 * @param event The current event
	 * @return The selected objects
	 * @throws ExecutionException Iff the selection cannot be determined
	 */
	public static List<Object> getSelection(final ExecutionEvent event) throws ExecutionException {
		final var structured = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		if (structured == null) {
			throw new ExecutionException("No projects have been selected for discovery!");
		}
		return Arrays.asList(structured.toArray());
	}

	/**
	 * Returns the projects belonging to the current selection
	 *
	 * @return the projects belonging to the current selection
	 */
	public static Collection<IProject> getSelectedProjects() {
		final var window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		final var selection = (IStructuredSelection) window.getSelectionService().getSelection();
		final var projects = new ArrayList<IProject>(selection.size());
		for (final var selected : selection) {
			if ((selected instanceof final IAdaptable adaptable)) {
				projects.add(adaptable.getAdapter(IProject.class));
			}

		}
		return projects;
	}

	/**
	 * Returns all Java projects in the current selection
	 *
	 * @param event An execution event
	 * @return the selected project
	 * @throws ExecutionException
	 */
	public static Set<IJavaProject> getJavaProjects(final ExecutionEvent event) throws ExecutionException {
		final var window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		final var service = window.getSelectionService();
		final var structured = (IStructuredSelection) service.getSelection();
		final List<Object> workspaceSelection = Arrays.asList(structured.toArray());
		return org.gravity.eclipse.selection.SelectionHelper.getJavaProjects(workspaceSelection);
	}
}
