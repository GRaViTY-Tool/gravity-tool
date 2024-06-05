package org.gravity.eclipse.ui.handler;

import java.util.List;
import java.util.function.Consumer;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.converter.IPGConverterFactory;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.ui.exceptions.UnsupportedSelectionException;
import org.gravity.typegraph.basic.BasicFactory;

/**
 * A handler for triggering the synchronization of changes on the pm into the
 * source code
 *
 * @author speldszus
 *
 */
public class JavaSyncBwdHandler extends AbstractTransformationHandler {

	protected static final Logger LOGGER = Logger.getLogger(JavaSyncBwdHandler.class);

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final List<?> selection = SelectionHelper.getSelection(event);

		final Job job = new SyncPGJob(selection);
		job.setUser(true);
		job.schedule();

		return null;
	}

	@Override
	public boolean isEnabled() {
		return this.isEnabled(IPGConverterFactory::supportsBWDSync);
	}

	@Override
	public boolean isHandled() {
		return this.isEnabled();
	}

	/**
	 * An implementation of java.lang.Job for synchronizing changes on a PG to the
	 * according java projects from a selection in an eclipse workspace
	 *
	 * @author speldszus
	 *
	 */
	private static final class SyncPGJob extends Job {
		private final List<?> selection;

		private SyncPGJob(final List<?> selection) {
			super("GRAViTY Sync PG");
			this.selection = selection;
		}

		@Override
		protected IStatus run(final IProgressMonitor monitor) {
			for (final Object entry : this.selection) {
				if (!(entry instanceof final IJavaProject iJavaProject)) {
					final var exception = new UnsupportedSelectionException(entry.getClass());
					LOGGER.log(Level.ERROR, exception.getMessage(), exception);
					return new Status(IStatus.ERROR, GravityActivator.PLUGIN_ID, exception.getMessage(), exception);
				}
				IPGConverter converter;
				try {
					converter = GravityActivator.getDefault().getConverter(iJavaProject.getProject());
				} catch (NoConverterRegisteredException | CoreException e) {
					return new Status(IStatus.ERROR, GravityActivator.PLUGIN_ID,
							"Please install a converter and restart the task.");
				}
				final Consumer<EObject> consumer = IPGConverter -> {
					final var pg = converter.getPG();
					final var createTPackage = BasicFactory.eINSTANCE.createTPackage();
					createTPackage.setTName("NEW");
					createTPackage.setModel(pg);
					pg.getPackages().add(createTPackage);
				};
				if (!converter.syncProjectBwd(consumer, monitor)) {
					return new Status(IStatus.ERROR, GravityActivator.PLUGIN_ID, "No PG has been created");
				}
			}
			return Status.OK_STATUS;
		}
	}

}
