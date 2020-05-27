package org.gravity.tgg.uml.ui;


import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.jobs.Job;
import org.gravity.eclipse.ui.GravityUiActivator;
import org.gravity.eclipse.ui.handler.AbstractTransformationHandler;

/**
 * A handler for triggering the initial creation of a new UML models for the selected projects
 * 
 * @author speldszus
 *
 */
public class UmlCodeGenHandler extends AbstractTransformationHandler {

	static final Logger LOGGER = Logger.getLogger(UmlCodeGenHandler.class);

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		List<?> selection = GravityUiActivator.getSelection(event);

		Job job = new UmlCodeGenJob(selection);
		job.setUser(true);
		job.schedule();

		return null;
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
