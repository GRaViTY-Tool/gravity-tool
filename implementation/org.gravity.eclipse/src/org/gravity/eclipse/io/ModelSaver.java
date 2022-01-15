package org.gravity.eclipse.io;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.file.Files;
import java.util.Collections;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * This class provides the functionality to save a model into an eclipse file
 *
 * @author speldszus
 *
 */
public final class ModelSaver {

	private static final Logger LOGGER = Logger.getLogger(ModelSaver.class);

	private ModelSaver() {
		// This class shouldn't be instantiated
	}

	/**
	 * Save a emf model into an eclipse file
	 *
	 * @param model   The model
	 * @param file    An eclipse file
	 * @param monitor A progress monitor
	 * @return true, iff the model has been saved successfully
	 */
	public static boolean saveModel(final EObject model, final IFile file, final IProgressMonitor monitor) {
		if (model == null) {
			return false;
		}
		final var uri = URI.createPlatformResourceURI(new File(new File(file.getProject().getName()),file.getProjectRelativePath().toString()).toString(), true);
		var resource = model.eResource();
		if (resource == null) {
			resource = new ResourceSetImpl().createResource(uri);
			resource.getContents().add(model);
		}
		else {
			resource.setURI(uri);
		}
		return saveModel(resource, file, monitor);
	}

	/**
	 * Save a emf model into an eclipse file
	 *
	 * @param resource The resource containing the model
	 * @param file     An eclipse file
	 * @param monitor  A progress monitor
	 * @return true, iff the model has been saved successfully
	 */
	public static boolean saveModel(final Resource resource, final IFile file, final IProgressMonitor monitor) {
		if (resource == null) {
			return false;
		}
		final var location = file.getLocation();
		if(location == null) {
			return false;
		}
		final var javaFile = location.toFile();
		final var parentFile = javaFile.getParentFile();
		if (!parentFile.exists() && !parentFile.mkdirs()) {
			LOGGER.warn("Couldn't create parent directory of: " + javaFile.toString());
			return false;
		}
		try (var out = Files.newOutputStream(javaFile.toPath())) {
			resource.save(out, Collections.emptyMap());
			file.refreshLocal(IResource.DEPTH_ONE, monitor);
		} catch (final IOException e) {
			LOGGER.error(e.getMessage(), e);
			return false;
		} catch (final CoreException e) {
			LOGGER.warn(e.getMessage(), e);
		}
		return true;
	}

	/**
	 * Save a emf model into an eclipse file
	 *
	 * @param resource The resource containing the model
	 * @param file     An eclipse file
	 * @param monitor  A progress monitor
	 * @return true, iff the model has been saved successfully
	 */
	public static boolean saveModelUsingPipedStream(final Resource resource, final IFile file, final IProgressMonitor monitor) {
		if (resource == null) {
			return false;
		}

		try (var in = new PipedInputStream(); var out = new PipedOutputStream(in);) {

			final Runnable rout = () -> {
				try {
					resource.save(out, Collections.emptyMap());
				} catch (final IOException e) {
					LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
				}
			};
			final Runnable rin = () -> {
				try {
					if (file.exists()) {
						file.setContents(in, true, false, monitor);
					} else {
						final var parent = file.getParent();
						if (!parent.exists()) {
							final var folder = parent.getProject().getFolder(parent.getProjectRelativePath());
							folder.create(true, true, monitor);
						}
						file.create(in, true, monitor);
					}
				} catch (final CoreException e) {
					LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
				}
			};
			final var threadOut = new Thread(rout);
			final var threadIn = new Thread(rin);
			threadIn.start();
			threadOut.start();
			threadIn.join();
			threadOut.join();
		} catch (final InterruptedException e) {
			LOGGER.error(e.getMessage(), e);
			Thread.currentThread().interrupt();
			return false;
		} catch (final IOException e) {
			LOGGER.error(e.getMessage(), e);
			return false;
		}
		return true;
	}

}
