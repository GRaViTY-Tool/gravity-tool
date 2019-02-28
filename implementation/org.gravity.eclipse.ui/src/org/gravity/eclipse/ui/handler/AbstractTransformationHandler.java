package org.gravity.eclipse.ui.handler;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * This abstract handler provides basic functionality for transformations using
 * converters registered at "org.gravity.eclipse.converters"
 * 
 * @author speldszus
 *
 */
public abstract class AbstractTransformationHandler extends AbstractHandler {


	/**
	 * This operation gets the current selection in the workspace for an event
	 * 
	 * @param event The current event
	 * @return The selected objects
	 * @throws ExecutionException Iff the selection cannot be determined
	 */
	protected List<Object> getSelection(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelectionService service = window.getSelectionService();
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
		if (structured == null) {
			throw new ExecutionException("No projects have been selected for discovery!");
		}
		List<Object> selection = Arrays.asList(structured.toArray());
		return selection;
	}
}
