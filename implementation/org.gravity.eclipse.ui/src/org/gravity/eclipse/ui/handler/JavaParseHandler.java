package org.gravity.eclipse.ui.handler;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.jobs.Job;
import org.gravity.eclipse.converter.IPGConverterFactory;
import org.gravity.eclipse.ui.PMCreatorJob;

/**
 * A handler for triggering the initial creation of a new pms for the selected
 * projects
 *
 * @author speldszus
 *
 */
public class JavaParseHandler extends AbstractTransformationHandler {

	static final Logger LOGGER = Logger.getLogger(JavaParseHandler.class.getName());

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final List<?> selection = SelectionHelper.getSelection(event);

		final Job job = new PMCreatorJob(selection);
		job.setUser(true);
		job.schedule();

		return null;
	}

	@Override
	public boolean isEnabled() {
		return this.isEnabled(IPGConverterFactory::supportsFWDTrafo);
	}

	@Override
	public boolean isHandled() {
		return this.isEnabled();
	}
}
