package org.gravity.eclipse.ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The activator class controls the plug-in life cycle
 */
public class GravityUiActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.gravity.eclipse.ui"; //$NON-NLS-1$

	/**
	 * Gets the current active shell
	 *
	 * @return the shell
	 */
	public static Shell getShell() {
		var display = Display.getCurrent();
		// may be null if outside the UI thread
		if (display == null) {
			display = Display.getDefault();
		}
		return display.getActiveShell();
	}
}
