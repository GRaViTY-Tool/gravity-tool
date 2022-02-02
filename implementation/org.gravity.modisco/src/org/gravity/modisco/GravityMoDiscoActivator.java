package org.gravity.modisco;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.modisco.discovery.GravityModiscoProjectDiscoverer;

/**
 * The activator of the GRaViTY MoDisco plugin
 *
 * @author speldszus
 *
 */
public class GravityMoDiscoActivator extends Plugin {

	/**
	 * The pugin id
	 */
	public static final String PLUGIN_ID = "org.gravity.modisco";

	/**
	 * The id of the fwd processing extension point
	 */
	public static final String PROCESS_MODISCO_FWD = "org.gravity.modisco.ProcessingModiscoFwd";

	/**
	 * The name of the modisco model file
	 */
	public static final String FILE_NAME = "modisco.xmi";

	private static final Logger LOGGER = Logger.getLogger(GravityMoDiscoActivator.class);

	private static final Map<IJavaProject, GravityModiscoProjectDiscoverer> discoverers = new HashMap<>();

	public static IGravityModiscoProjectDiscoverer getDiscoverer(final IJavaProject project, final boolean load) {
		final var discoverer = discoverers.computeIfAbsent(project, key-> {
			try {
				return new GravityModiscoProjectDiscoverer(key, load);
			} catch (final IOException e) {
				LOGGER.error(e);
			}
			return null;
		});
		discoverer.setLoad(load);
		return discoverer;
	}
}
