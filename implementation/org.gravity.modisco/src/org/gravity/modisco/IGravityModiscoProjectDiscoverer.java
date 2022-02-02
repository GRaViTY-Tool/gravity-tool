package org.gravity.modisco;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;

public interface IGravityModiscoProjectDiscoverer {

	/**
	 * Loads the MoDisco model if possible
	 *
	 * @return the model or <code>null</code>
	 * @throws IOException If there is an error at loading an existing model file
	 */
	MGravityModel loadModel() throws IOException;

	/**
	 * A getter for the discoverer's EMF resource set
	 *
	 * @return the reosource set
	 */
	ResourceSet getResourceSet();

	/**
	 * Discovers a java project
	 *
	 * @param monitor A progress monitor
	 * @return The discovered MoDisco model with GRaViTY extensions
	 * @throws DiscoveryException If the discovery fails
	 */
	MGravityModel discoverModel(final IProgressMonitor monitor) throws DiscoveryException;

	/**
	 * Discovers a java project taking additional libs into account
	 *
	 * @param libs    The locations of the additional libs
	 * @param monitor A progress monitor
	 * @return The discovered MoDisco model with GRaViTY extensions
	 * @throws DiscoveryException If the discovery fails
	 */
	MGravityModel discoverModel(final Collection<IPath> libs, final IProgressMonitor monitor) throws DiscoveryException;

}
