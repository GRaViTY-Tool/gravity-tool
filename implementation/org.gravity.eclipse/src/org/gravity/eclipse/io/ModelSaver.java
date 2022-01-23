package org.gravity.eclipse.io;

import java.io.File;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
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
	 * @param model The model
	 * @param file  An eclipse file
	 * @return true, iff the model has been saved successfully
	 */
	public static boolean saveModel(final EObject model, final IFile file) {
		if (model == null) {
			return false;
		}
		return saveModel(getOrCreateResourceSet(model), model, file);
	}

	public static boolean saveModel(final EObject model, final URI uri) {
		if (model == null) {
			return false;
		}

		return saveModel(getOrCreateResourceSet(model), model, uri);
	}

	private static ResourceSet getOrCreateResourceSet(final EObject model) {
		ResourceSet set;
		final var resource = model.eResource();
		if (resource != null) {
			set = resource.getResourceSet();
		} else {
			set = new ResourceSetImpl();
		}
		return set;
	}

	public static boolean saveModel(final ResourceSet set, final EObject model, final IFile file) {
		if (model == null) {
			return false;
		}
		return saveModel(set, model, getPlatformResourceURI(file));
	}

	public static boolean saveModel(final ResourceSet set, final EObject model, final URI uri) {
		if (model == null) {
			return false;
		}

		final var string = uri.toString();

		var resource = model.eResource();
		if (string.endsWith(".bin")) {
			resource = addToBinaryResource(set, model, uri);
		} else if(resource == null) {
			resource = set.createResource(uri);
			resource.getContents().add(model);
		}
		else {
			resource.setURI(uri);
		}

		final Map<Object, Object> saveOptions = new HashMap<>();
		if (string.endsWith(".zip")) {
			saveOptions.put(Resource.OPTION_ZIP, true);
		}

		try {
			resource.save(Collections.emptyMap());
		} catch (final IOException e) {
			LOGGER.error(e);
			return false;
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
	public static boolean saveModelUsingPipedStream(final Resource resource, final IFile file,
			final IProgressMonitor monitor) {
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

	/**
	 * Calculates a platform/resource our for the given file
	 *
	 * @param file A file of a project in the workspace
	 * @return A platform/resource uri
	 */
	public static URI getPlatformResourceURI(final IFile file) {
		return URI.createPlatformResourceURI(
				new File(new File(file.getProject().getName()), file.getProjectRelativePath().toString()).toString(),
				true);
	}

	private static Resource addToBinaryResource(final ResourceSet set, final EObject model, final URI uri) {
		// Backup old resource
		final var resource = model.eResource();

		// Add model to new binary resource
		final Resource binary = new BinaryResourceImpl(uri);
		set.getResources().add(binary);
		binary.getContents().add(model);

		// Remove old resource from resource set
		set.getResources().remove(resource);

		return binary;
	}

}
