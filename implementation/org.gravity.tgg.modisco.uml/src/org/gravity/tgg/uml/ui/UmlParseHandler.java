package org.gravity.tgg.uml.ui;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.gravity.eclipse.ui.GravityUiActivator;
import org.gravity.eclipse.ui.handler.AbstractTransformationHandler;
import org.gravity.eclipse.ui.handler.UISelectionHelper;

/**
 * A handler for triggering the initial creation of a new UML models for the
 * selected projects
 *
 * @author speldszus
 *
 */
public class UmlParseHandler extends AbstractTransformationHandler {

	static final Logger LOGGER = Logger.getLogger(UmlParseHandler.class);

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final List<?> selection = UISelectionHelper.getSelection(event);

		final var addUmlSec = MessageDialog.openQuestion(GravityUiActivator.getShell(), "UMLsec",
				"Should the UMLsec profile be added to the project?");
		final Job job = new UmlCreatorJob(selection, addUmlSec);
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
