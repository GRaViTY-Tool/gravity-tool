package org.gravity.hulk.ui.visualization.handlers.views;

import org.apache.log4j.Logger;
import org.gravity.hulk.ui.visualization.views.AntiPatternMarkerView;

public class AntiPatternMarkersViewHandler extends AbstractShowViewHandler {

	private static final Logger LOGGER = Logger.getLogger( AntiPatternMarkersViewHandler.class);
	
	@Override
	String getID() {
		return AntiPatternMarkerView.ID;
	}

	@Override
	Logger getLogger() {
		return LOGGER;
	}
}
