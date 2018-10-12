package org.gravity.eclipse.ui.handler;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.ui.exceptions.UnsupportedSelectionException;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * A handler for triggering the synchronization of changes on the pm into the source code
 * 
 * @author speldszus
 *
 */
public class JavaSyncBwdHandler extends AbstractHandler {

	protected static final Logger LOGGER = Logger.getLogger(JavaSyncBwdHandler.class);

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ISelectionService service = window.getSelectionService();
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
		List<Object> selection = Arrays.asList(structured.toArray());

		Job job = new Job("Sync PG") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				for (Object entry : selection) {
					if (entry instanceof IJavaProject) {
						IJavaProject iJavaProject = (IJavaProject) entry;
						IPGConverter converter;
						try {
							converter = GravityActivator.getDefault().getConverter(iJavaProject.getProject());
						} catch (NoConverterRegisteredException | CoreException e) {
							return new Status(Status.ERROR, GravityActivator.PLUGIN_ID, "Please install a converter and restart the task.");
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
					}  else {
						UnsupportedSelectionException exception = new UnsupportedSelectionException(entry.getClass());
						LOGGER.log(Level.ERROR, exception.getMessage(), exception);
						return new Status(Status.ERROR, GravityActivator.PLUGIN_ID, exception.getMessage(), exception);
					}
				}
				return Status.OK_STATUS;
			}
		};
		job.setUser(true);
		job.schedule();

		return null;
	}

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

}
