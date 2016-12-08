package org.gravity.tgg.modisco;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.gravity.modisco.GravityMoDiscoModelPatcher;
import org.osgi.framework.BundleContext;

public class MoDiscoTGGActivator extends Plugin {
	
	// The plug-in ID
	public static final String PLUGIN_ID = "org.gravity.tgg.modisco.ui"; //$NON-NLS-1$

		// The shared instance
	private static MoDiscoTGGActivator plugin;

	private GravityMoDiscoModelPatcher patcher;
	
	public MoDiscoTGGActivator() {
		// TODO Auto-generated constructor stub
	}

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
		IConfigurationElement[] configuration_elements = extension_registry
				.getConfigurationElementsFor("org.gravity.modisco.patcher"); //$NON-NLS-1$
		if (configuration_elements.length > 0) {
			setSelectedPatcher((GravityMoDiscoModelPatcher) configuration_elements[0].createExecutableExtension("class")); //$NON-NLS-1$
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
	
}
