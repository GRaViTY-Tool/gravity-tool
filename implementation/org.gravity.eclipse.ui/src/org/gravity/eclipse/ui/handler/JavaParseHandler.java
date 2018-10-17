package org.gravity.eclipse.ui.handler;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.io.ModelSaver;
import org.gravity.eclipse.ui.exceptions.UnsupportedSelectionException;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * A handler for triggering the initial creation of a new pms for the selected projects
 * 
 * @author speldszus
 *
 */
public class JavaParseHandler extends AbstractTransformationHandler {

	private static final Logger LOGGER = Logger.getLogger(JavaParseHandler.class.getName());

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		List<Object> selection = getSelection(event);

		Job job = new PGCreatorJob(selection);
		job.setUser(true);
		job.schedule();

		return null;
	}
	
	@Override
	public boolean isEnabled() {
		try {
			return GravityActivator.getDefault().getSelectedConverterFactory().supportsFWDSync();
		} catch (NoConverterRegisteredException | CoreException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
			return false;
		}
	}

	@Override
	public boolean isHandled() {
		try {
			return GravityActivator.getDefault().getSelectedConverterFactory().supportsFWDSync();
		} catch (NoConverterRegisteredException | CoreException e) {
			LOGGER.log(Level.ERROR, e.getMessage(), e);
			return false;
		}
	}

	/**
	 * An implementation of java.lang.Job for creating a PG from  a selection in an eclipse workspace
	 * 
	 * @author speldszus
	 *
	 */
	private final class PGCreatorJob extends Job {
			private final List<Object> selection;
	
			private PGCreatorJob(List<Object> selection) {
				super("GRaViTY Create PG");
				this.selection = selection;
			}
	
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				ArrayList<String> fails = new ArrayList<>();
				for (Object entry : selection) {
					if (monitor.isCanceled()) {
						return Status.CANCEL_STATUS;
					}
					if (entry instanceof IJavaProject) {
						IJavaProject iJavaProject = (IJavaProject) entry;
						if (!process(iJavaProject, monitor)) {
							fails.add(iJavaProject.getProject().getName());
						}
					} else {
						UnsupportedSelectionException exception = new UnsupportedSelectionException(entry.getClass());
						LOGGER.log(Level.ERROR, exception.getMessage());
						return new Status(Status.ERROR, GravityActivator.PLUGIN_ID, exception.getMessage(), exception);
					}
				}
				return fails.size() == 0 ? Status.OK_STATUS
						: new Status(Status.ERROR, GravityActivator.PLUGIN_ID,
								"Creating PG failed on the follwoing Java projects: " + fails.toString());
			}
	
			private boolean process(IJavaProject iJavaProject, IProgressMonitor monitor) {
				IProject iProject = iJavaProject.getProject();
	
				GravityActivator gravityActivator = GravityActivator.getDefault();
				IPGConverter converter;
				try {
					converter = gravityActivator.getNewConverter(iProject);
				} catch (CoreException | NoConverterRegisteredException e) {
					LOGGER.log(Level.ERROR, e.getMessage(), e);
					return false;
				}
	
				boolean success = converter.convertProject(iJavaProject, monitor);
	//				gravityActivator.discardConverter(iProject);
				if (!success) {
					LOGGER.log(Level.ERROR, "No PG has been created for " + iProject.getName());
					return false;
				}
				TypeGraph pg = converter.getPG();
				IFolder folder = iProject.getFolder("gravity");
				if (!folder.exists()) {
					try {
						folder.create(true, true, monitor);
					} catch (CoreException e) {
						LOGGER.log(Level.ERROR, "Couldn't create output location: " + folder.getLocation().toString());
					}
				}
				IFile file = folder.getFile(iProject.getName() + ".xmi");
				URI out = URI.createFileURI(file.getLocation().toString());
				Resource original = pg.eResource();
				original.setURI(out);
				ModelSaver.saveModel(pg, file, monitor);
				return true;
			}
		}
}
