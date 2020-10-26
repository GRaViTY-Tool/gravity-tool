package org.gravity.tgg.modisco.pm;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.gravity.eclipse.converter.IPGConverter;
import org.gravity.modisco.GravityMoDiscoModelPatcher;
import org.osgi.framework.BundleContext;

public class MoDiscoTGGActivator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.gravity.tgg.modisco.pm"; //$NON-NLS-1$

	// The extension points
	public static final String PROCESS_PG_FWD = "org.gravity.tgg.modisco.pm.ProcessingPgFwd";
	public static final String PROCESS_PG_BWD = "org.gravity.tgg.modisco.pm.ProcessingPgBwd";
	public static final String PROCESS_MODISCO_BWD = "org.gravity.tgg.modisco.pm.ProcessingModiscoBwd";

	// The shared instance
	private static MoDiscoTGGActivator plugin;

	private GravityMoDiscoModelPatcher patcher;

	private final Set<MoDiscoTGGConverter> converters = new HashSet<>();

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		final IConfigurationElement[] configurationElements = Platform.getExtensionRegistry()
				.getConfigurationElementsFor("org.gravity.modisco.patcher"); //$NON-NLS-1$
		if (configurationElements.length > 0) {
			setSelectedPatcher(
					(GravityMoDiscoModelPatcher) configurationElements[0].createExecutableExtension("class")); //$NON-NLS-1$
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.
	 * BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		final IProgressMonitor monitor = new NullProgressMonitor();
		for (final MoDiscoTGGConverter converter : this.converters) {
			converter.save(monitor);
			converter.discard();
		}
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static MoDiscoTGGActivator getDefault() {
		return plugin;
	}

	public void setSelectedPatcher(GravityMoDiscoModelPatcher patcher) {
		this.patcher = patcher;
	}

	public GravityMoDiscoModelPatcher getSelectedPatcher() {
		return this.patcher;
	}

	/**
	 * Returns a stream for the given Entry
	 *
	 * @param location The location of the entry within this plugin
	 * @return The stream
	 * @throws IOException If the entry doesn't exist inside this plugin
	 */
	public static InputStream getEntryAsStream(String location) throws IOException {
		URL entry = plugin.getBundle().getEntry(location);
		if (entry == null) {
			throw new IOException("File not found within plugin \"" + PLUGIN_ID + "\": " + location);
		}
		return entry.openStream();
	}

	public void addConverter(MoDiscoTGGConverter converter) {
		this.converters.add(converter);
	}
}
