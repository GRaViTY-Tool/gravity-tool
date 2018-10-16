package org.gravity.eclipse.ui.handler;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;

public abstract class TransformationHandler extends AbstractHandler {

	private static final Logger LOGGER = Logger.getLogger(TransformationHandler.class);

	@Override
	public boolean isEnabled() {
		try {
			return GravityActivator.getDefault().getSelectedConverterFactory().supportsBWDSync();
		} catch (NoConverterRegisteredException | CoreException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
			return false;
		}
	}

	@Override
	public boolean isHandled() {
		try {
			return GravityActivator.getDefault().getSelectedConverterFactory().supportsBWDSync();
		} catch (NoConverterRegisteredException | CoreException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
			return false;
		}
	}
	
	/**
	 * This operation gets the current selection in the workspace for an event
	 * 
	 * @param event The current event
	 * @return The selected objects
	 * @throws ExecutionException Iff the selcetion cannot be determined
	 */
	List<Object> getSelection(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelectionService service = window.getSelectionService();
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
		if(structured == null) {
			throw new ExecutionException("No projects have been selected for discovery!");
		}
		List<Object> selection = Arrays.asList(structured.toArray());
		return selection;
	}
}
