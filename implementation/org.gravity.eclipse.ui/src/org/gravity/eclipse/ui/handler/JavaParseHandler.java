package org.gravity.eclipse.ui.handler;

import java.util.List;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.jobs.Job;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.ui.GravityUiActivator;
import org.gravity.eclipse.ui.PGCreatorJob;

/**
 * A handler for triggering the initial creation of a new pms for the selected projects
 * 
 * @author speldszus
 *
 */
public class JavaParseHandler extends AbstractTransformationHandler {

	static final Logger LOGGER = Logger.getLogger(JavaParseHandler.class.getName());

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		List<?> selection = GravityUiActivator.getSelection(event);

		Job job = new PGCreatorJob(selection);
		job.setUser(true);
		job.schedule();

		return null;
	}
	
	@Override
	public boolean isEnabled() {
		try {
			return GravityActivator.getDefault().getSelectedConverterFactory().supportsFWDTrafo();
		} catch (NoConverterRegisteredException | CoreException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
			return false;
		}
		catch(Exception e) {
			LOGGER.log(Level.ERROR, e);
			return false;
		}
	}

	@Override
	public boolean isHandled() {
		try {
			return GravityActivator.getDefault().getSelectedConverterFactory().supportsFWDTrafo();
		} catch (NoConverterRegisteredException | CoreException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
			return false;
		}
		catch(Exception e) {
			LOGGER.log(Level.ERROR, e);
			return false;
		}
	}
}
