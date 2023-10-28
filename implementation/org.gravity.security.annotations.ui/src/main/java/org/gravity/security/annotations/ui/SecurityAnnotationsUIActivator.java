package org.gravity.security.annotations.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class SecurityAnnotationsUIActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.gravity.security.annotations.check"; //$NON-NLS-1$

	// The shared instance
	private static SecurityAnnotationsUIActivator plugin;
	
	/**
	 * The constructor
	 */
	public SecurityAnnotationsUIActivator() {
		// Nothing to initialize
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

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
	public static SecurityAnnotationsUIActivator getDefault() {
		return plugin;
	}

}
