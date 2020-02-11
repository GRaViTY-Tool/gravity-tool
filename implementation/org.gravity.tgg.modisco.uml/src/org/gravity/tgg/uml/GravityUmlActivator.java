/**
 * 
 */
package org.gravity.tgg.uml;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The activator of this plugin
 * 
 * @author speldszus
 *
 */
public class GravityUmlActivator extends AbstractUIPlugin {

	/**
	 * The plugin ID of this plugin
	 */
	public static final String PLUGIN_ID = "org.gravity.tgg.modisco.uml";
	
	private static TransformationFactory FACTORY = null;
	
	public static TransformationFactory getTransformationFactory() {
		if(FACTORY == null) {
			FACTORY = new TransformationFactory();
		}
		return FACTORY;
	}

}
