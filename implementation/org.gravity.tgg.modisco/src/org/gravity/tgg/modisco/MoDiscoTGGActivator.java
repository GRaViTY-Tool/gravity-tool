package org.gravity.tgg.modisco;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.gravity.modisco.GravityMoDiscoModelPatcher;
import org.osgi.framework.BundleContext;

public class MoDiscoTGGActivator extends Plugin {
	
	// The plug-in ID
	public static final String PLUGIN_ID = "org.gravity.tgg.modisco"; //$NON-NLS-1$
	
	// The extension points
	public static final String PROCESS_PG_FWD = "org.gravity.tgg.modisco.ProcessingPgFwd";
	public static final String PROCESS_PG_BWD = "org.gravity.tgg.modisco.ProcessingPgBwd";
	public static final String PROCESS_MODISCO_BWD = "org.gravity.tgg.modisco.ProcessingModiscoBwd";

	// The shared instance
	private static MoDiscoTGGActivator plugin;

	private GravityMoDiscoModelPatcher patcher;
	
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
		
		IExtensionRegistry extension_registry = Platform.getExtensionRegistry();
		IConfigurationElement[] configurationElements = extension_registry
				.getConfigurationElementsFor("org.gravity.modisco.patcher"); //$NON-NLS-1$
		if (configurationElements.length > 0) {
			setSelectedPatcher((GravityMoDiscoModelPatcher) configurationElements[0].createExecutableExtension("class")); //$NON-NLS-1$
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
	 * @param entry The location of the entry within this plugin
	 * @return The stream 
	 * @throws IOException If the entry doesn't exist inside this plugin
	 */
	public static InputStream getEntryAsStream(String entry) throws IOException {
		return plugin.getBundle().getEntry(entry).openStream();
	}
	
}
