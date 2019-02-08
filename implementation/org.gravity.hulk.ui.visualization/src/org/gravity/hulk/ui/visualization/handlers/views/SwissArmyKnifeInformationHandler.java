package org.gravity.hulk.ui.visualization.handlers.views;

import org.apache.log4j.Logger;
import org.gravity.hulk.ui.visualization.views.SwissArmyKnifInformationView;

public class SwissArmyKnifeInformationHandler extends AbstractShowViewHandler {

	private static final Logger LOGGER = Logger.getLogger( SwissArmyKnifeInformationHandler.class.getName() );

	@Override
	String getID() {
		return SwissArmyKnifInformationView.ID;
	}

	@Override
	Logger getLogger() {
		return LOGGER;
	}

	
}
