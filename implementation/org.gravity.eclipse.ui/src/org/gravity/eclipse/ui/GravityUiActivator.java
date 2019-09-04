package org.gravity.eclipse.ui;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The activator class controls the plug-in life cycle
 */
public class GravityUiActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.gravity.eclipse.ui"; //$NON-NLS-1$

	/**
	 * This operation gets the current selection in the workspace for an event
	 * 
	 * @param event The current event
	 * @return The selected objects
	 * @throws ExecutionException Iff the selection cannot be determined
	 */
	public static List<Object> getSelection(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelectionService service = window.getSelectionService();
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
		if (structured == null) {
			throw new ExecutionException("No projects have been selected for discovery!");
		}
		return Arrays.asList(structured.toArray());
	}

	/**
	 * Gets the current active shell
	 * 
	 * @return the shell
	 */
	public static Shell getShell() {
		Display display = Display.getCurrent();
		// may be null if outside the UI thread
		if (display == null)
			display = Display.getDefault();
		return display.getActiveShell();
	}
}
