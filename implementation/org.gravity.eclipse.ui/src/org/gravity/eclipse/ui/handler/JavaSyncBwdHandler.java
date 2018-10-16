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
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.ui.exceptions.UnsupportedSelectionException;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * A handler for triggering the synchronization of changes on the pm into the
 * source code
 * 
 * @author speldszus
 *
 */
public class JavaSyncBwdHandler extends TransformationHandler {

	protected static final Logger LOGGER = Logger.getLogger(JavaSyncBwdHandler.class);

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		List<Object> selection = getSelection(event);

		Job job = new SyncPGJob(selection);
		job.setUser(true);
		job.schedule();

		return null;
	}

	/**
	 * An implementation of java.lang.Job for synchronizing changes on a PG to the
	 * according java projects from a selection in an eclipse workspace
	 * 
	 * @author speldszus
	 *
	 */
	private final class SyncPGJob extends Job {
		private final List<Object> selection;

		private SyncPGJob(List<Object> selection) {
			super("GRAViTY Sync PG");
			this.selection = selection;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			for (Object entry : selection) {
				if (entry instanceof IJavaProject) {
					IJavaProject iJavaProject = (IJavaProject) entry;
					IPGConverter converter;
					try {
						converter = GravityActivator.getDefault().getConverter(iJavaProject.getProject());
					} catch (NoConverterRegisteredException | CoreException e) {
						return new Status(Status.ERROR, GravityActivator.PLUGIN_ID,
								"Please install a converter and restart the task.");
					}
					Consumer<EObject> consumer = IPGConverter -> {
						TypeGraph pg = converter.getPG();
						TPackage createTPackage = BasicFactory.eINSTANCE.createTPackage();
						createTPackage.setTName("NEW");
						createTPackage.setPg(pg);
						pg.getPackages().add(createTPackage);
					};
					if (!converter.syncProjectBwd(consumer, monitor)) {
						return new Status(Status.ERROR, GravityActivator.PLUGIN_ID, "No PG has been created");
					}
				} else {
					UnsupportedSelectionException exception = new UnsupportedSelectionException(entry.getClass());
					LOGGER.log(Level.ERROR, exception.getMessage(), exception);
					return new Status(Status.ERROR, GravityActivator.PLUGIN_ID, exception.getMessage(), exception);
				}
			}
			return Status.OK_STATUS;
		}
	}

}
