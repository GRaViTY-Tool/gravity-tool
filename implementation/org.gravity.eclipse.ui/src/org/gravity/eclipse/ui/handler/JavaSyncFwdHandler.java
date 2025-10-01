package org.gravity.eclipse.ui.handler;

import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.Messages;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.converter.IPGConverterFactory;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.ui.exceptions.UnsupportedSelectionException;

/**
 * A handler for triggering the synchronization of changes on the source code
 * into the pm
 *
 * @author speldszus
 *
 */
public class JavaSyncFwdHandler extends AbstractTransformationHandler {

	private static final Logger LOGGER = Logger.getLogger(JavaSyncFwdHandler.class);

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final List<?> selection = UISelectionHelper.getSelection(event);

		final Job job = new PGSyncFwdJob(selection);
		job.setUser(true);
		job.schedule();

		return null;

	}

	@Override
	public boolean isEnabled() {
		return this.isEnabled(IPGConverterFactory::supportsFWDSync);
	}

	@Override
	public boolean isHandled() {
		return this.isEnabled();
	}

	/**
	 * An implementation of java.lang.Job for synchronizing changes on java projects
	 * to the according PGs from a selection in an eclipse workspace
	 *
	 * @author speldszus
	 *
	 */
	private static final class PGSyncFwdJob extends Job {
		private final List<?> selection;

		private PGSyncFwdJob(final List<?> selection) {
			super("GRaViTY Sync Program Model");
			this.selection = selection;
		}

		@Override
		protected IStatus run(final IProgressMonitor monitor) {
			for (final Object entry : this.selection) {
				if (entry instanceof final IJavaProject iJavaProject) {
					IPGConverter converter;
					try {
						converter = GravityActivator.getDefault().getConverter(iJavaProject.getProject());
					} catch (NoConverterRegisteredException | CoreException e) {
						return new Status(IStatus.ERROR, GravityActivator.PLUGIN_ID,
								"Please install a converter and restart the task.");
					}
					if (!converter.syncProjectFwd(monitor)) {
						return new Status(IStatus.ERROR, GravityActivator.PLUGIN_ID,
								"No program model has been created");
					}
				} else if (entry instanceof IPackageFragment) {
					return new Status(IStatus.ERROR, GravityActivator.PLUGIN_ID,
							Messages.unhandledPackageFagment + entry);
				} else {
					final var exception = new UnsupportedSelectionException(entry.getClass());
					LOGGER.log(Level.ERROR, exception.getMessage());
					return new Status(IStatus.ERROR, GravityActivator.PLUGIN_ID, exception.getMessage(), exception);
				}
			}
			return Status.OK_STATUS;
		}
	}

}
