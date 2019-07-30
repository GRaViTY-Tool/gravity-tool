package org.gravity.hulk.ui.visualization.views;

import org.eclipse.ui.views.markers.MarkerSupportView;

/**
 * A view showing Anti-pattern markers
 * 
 * This view is registered at the extension point "org.eclipse.ui.views"
 * 
 * @author speldszus
 *
 */
public class AntiPatternMarkerView extends MarkerSupportView {

	public static final String CONTENT_GENERATOR_ID = "org.gravity.hulk.ui.visualization.markerContentGenerator";
	
	/**
	 * The ID under which the view is registered at the extension point "org.eclipse.ui.views"
	 */
	public static final String VIEW_ID = "org.gravity.hulk.ui.visualization.views.AntiPatternMarkersView";
	
	/**
	 * Creates a new view
	 */
	public AntiPatternMarkerView() {
		super(CONTENT_GENERATOR_ID);
	}

}
