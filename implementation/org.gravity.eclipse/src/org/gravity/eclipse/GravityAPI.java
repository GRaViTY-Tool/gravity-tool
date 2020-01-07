/**
 *
 */
package org.gravity.eclipse;

import java.io.IOException;
import java.util.Collections;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.typegraph.basic.TypeGraph;

/**
 * A simple class for generating program models from Java projects
 *
 * @author speldszus
 *
 */
public class GravityAPI {

	/**
	 * The Logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(GravityAPI.class);

	private GravityAPI() {
		// This class shouldn't be instantiated
	}

	/**
	 * Discovers the Java project and creates a program model
	 *
	 * @param project A Java project
	 * @param monitor A progress monitor
	 * @return The program model
	 * @throws TransformationFailedException If the program model cannot be created
	 */
	public static TypeGraph createProgramModel(final IJavaProject project, final IProgressMonitor monitor)
			throws TransformationFailedException {
		return createProgramModel(project, false, monitor);
	}

	/**
	 * Discovers the Java project and creates a program model
	 *
	 * @param project A Java project
	 * @param monitor A progress monitor
	 * @param force   I the creation of a new model instance should be enforced
	 * @return The program model
	 * @throws TransformationFailedException If the program model cannot be created
	 */
	public static TypeGraph createProgramModel(final IJavaProject project, final boolean force, final IProgressMonitor monitor)
			throws TransformationFailedException {
		if (!force) {
			try {
				loadProgramModel(project, monitor);
			} catch (final IOException e) {
				LOGGER.log(Level.ERROR, e);
			}
		}
		final IProject iproject = project.getProject();
		IPGConverter converter;
		try {
			converter = GravityActivator.getDefault().getNewConverter(iproject);
		} catch (CoreException | NoConverterRegisteredException e) {
			throw new TransformationFailedException(e);
		}

		final boolean success = converter.convertProject(Collections.emptySet(), monitor);
		if (!success || converter.getPG() == null) {
			throw new TransformationFailedException(
					Messages.createPMFailed + project.getProject().getName());
		}
		return converter.getPG();
	}

	/**
	 * Tries to load an existing program model from the project
	 *
	 * @param javaProject The Java project
	 * @param monitor     A progress monitor
	 * @return The loaded program model
	 * @throws IOException If the model couldn't be loaded
	 */
	private static TypeGraph loadProgramModel(final IJavaProject javaProject, final IProgressMonitor monitor) throws IOException {
		try {
			final IFolder folder = EclipseProjectUtil.getGravityFolder(javaProject.getProject(), monitor);
			final IFile file = folder.getFile(javaProject.getProject().getName() + '.'+GravityActivator.FILE_EXTENSION_XMI);
			if (file.exists() && isUptoDate(file)) {
				return loadProgramModel(file);
			}
		} catch (final CoreException e) {
			throw new IOException(Messages.couldntLoadModel, e);
		}
		throw new IOException(Messages.couldntLoadModel);
	}

	/**
	 * Checks if the time stamp of the file is not older than the time stamp of all
	 * Java files
	 *
	 * @param file The file
	 * @return true, if the file is up to date
	 */
	private static boolean isUptoDate(final IFile file) {
		final long timestamp = file.getLocalTimeStamp();
		final UptodateVisitor visitor = new UptodateVisitor(timestamp);
		try {
			file.getProject().accept(visitor);
		} catch (final CoreException e) {
			LOGGER.log(Level.ERROR, e);
			return false;
		}
		return visitor.isUptoDate();
	}

	/**
	 * Tries to load an existing program model from the given file
	 *
	 * @param file The file
	 * @return The loaded program model
	 * @throws IOException If the model couldn't be loaded
	 */
	private static TypeGraph loadProgramModel(final IFile file) throws IOException, CoreException {
		final Resource resource = new ResourceSetImpl()
				.createResource(URI.createURI(file.getProjectRelativePath().toString()));
		resource.load(file.getContents(), Collections.emptyMap());
		final EList<EObject> contents = resource.getContents();
		if (contents.size() == 1) {
			final EObject object = contents.get(0);
			if (object instanceof TypeGraph) {
				return (TypeGraph) object;
			}
		}
		throw new IOException(Messages.couldntLoadModel);
	}

	/**
	 * A visitor for visiting all Java files and checking if their time stamp is older than the given one.
	 *
	 * @author speldszus
	 *
	 */
	private static final class UptodateVisitor implements IResourceVisitor {
		private final long timestamp;

		private boolean upToDate = true;

		/**
		 * Creates a new visitor
		 *
		 * @param timestamp The time stamp to check against
		 */
		private UptodateVisitor(final long timestamp) {
			this.timestamp = timestamp;
		}

		@Override
		public boolean visit(final IResource resource) throws CoreException {
			if (!this.upToDate) {
				return false;
			}
			if (resource.getType() != IResource.FILE) {
				return true;
			}
			if(GravityActivator.FILE_EXTENSION_JAVA.equals(((IFile) resource).getFileExtension())) {
				final long fileTimestamp = resource.getLocalTimeStamp();
				if(this.timestamp < fileTimestamp) {
					this.upToDate = false;
				}
			}
			return true;
		}

		/**
		 * The result of the check
		 *
		 * @return true, if no Java file is newer than the time stamp
		 */
		public boolean isUptoDate() {
			return this.upToDate;
		}
	}

}
