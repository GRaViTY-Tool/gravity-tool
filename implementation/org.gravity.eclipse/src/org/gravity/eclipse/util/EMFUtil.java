/**
 *
 */
package org.gravity.eclipse.util;

import java.io.File;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;

/**
 * Helpers for dealing with EMF Resources
 *
 * @author speldszus
 *
 */
public final class EMFUtil {

	private static final Logger LOGGER = Logger.getLogger(EMFUtil.class);

	private EMFUtil() {
		// As this class only has static methods we don't want instances
	}

	/**
	 * Efficiently deletes all Objects from the resource
	 *
	 * @param objects  The EObjects which should be deleted
	 * @param resource The containing resource
	 */
	public static void deleteAll(final Collection<EObject> objects, final Resource resource) {
		final var usages = UsageCrossReferencer.findAll(objects, resource);
		for (final EObject eObject : objects) {
			if ((eObject != null) && !usages.containsKey(eObject)) {
				EcoreUtil.delete(eObject);
			}
		}
		for (final Entry<EObject, Collection<Setting>> entry : usages.entrySet()) {
			final var eObject = entry.getKey();
			for (final EStructuralFeature.Setting setting : entry.getValue()) {
				if (setting.getEStructuralFeature().isChangeable()) {
					EcoreUtil.remove(setting, eObject);
				}
			}
			EcoreUtil.remove(eObject);
		}
	}

	/**
	 * Creates a platform resource URI
	 *
	 * @param file A file in the workspace
	 * @return The uri
	 */
	public static URI getPlatformResourceURI(final IFile file) {
		final var workspaceRelativeFile = new File(new File(file.getProject().getName()),
				file.getProjectRelativePath().toString());
		return URI.createPlatformResourceURI(workspaceRelativeFile.toString(), true);
	}

	/**
	 * Creates a new resource set and clones the given resource into it.
	 *
	 * @param resource The resource to be cloned
	 * @return the cloned resource
	 * @throws IOException If the resource cannot be cloned
	 */
	public static Resource cloneResourceIntoNewResourceSet(final Resource resource) throws IOException {
		final var set = new ResourceSetImpl();
		set.getPackageRegistry().putAll(resource.getResourceSet().getPackageRegistry());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap()
		.putAll(resource.getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap());
		final var newResource = set.createResource(resource.getURI());
		try (final var in = new PipedInputStream()) {
			try (final var out = new PipedOutputStream(in)) {

				final Runnable rout = () -> {
					try {
						resource.save(out, Collections.emptyMap());
					} catch (final IOException e) {
						LOGGER.error(e);
					}
				};
				final Runnable rin = () -> {
					try {
						newResource.load(in, Collections.emptyMap());
					} catch (final IOException e) {
						LOGGER.error(e);
					}
				};
				final var threadOut = new Thread(rout);
				final var threadIn = new Thread(rin);
				threadOut.start();
				threadIn.start();
				threadOut.join();
				threadIn.join();
			}
		} catch (final InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new IOException(e);
		}
		return newResource;
	}
}
