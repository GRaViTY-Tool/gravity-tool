/**
 * 
 */
package org.gravity.hulk.ui.visualization.handlers.views;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * An abstract handler for loading information views
 * 
 * @author speldszus
 *
 */
public abstract class AbstractShowViewHandler extends AbstractHandler {

	/**
	 * A getter for the id of the view
	 * 
	 * @return The id
	 */
	abstract String getID();

	/**
	 * A getter for the concrete Logger of the implementation
	 * 
	 * @return The logger
	 */
	abstract Logger getLogger();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		if (window == null)
			return null;

		IWorkbenchPage page = window.getActivePage();
		if (page == null)
			return null;

		try {
			page.showView(getID());
		} catch (PartInitException e) {
			getLogger().log(Level.ERROR, "Failed to open the " + getID() + " view");
		}

		return true;
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
