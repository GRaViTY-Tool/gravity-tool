package org.gravity.hulk.ui.visualization.handlers.views;

import org.apache.log4j.Logger;

import org.gravity.hulk.ui.visualization.views.TheBlobInformationView;

public class TheBlobInformationHandler extends AbstractShowViewHandler {

	private static final Logger LOGGER = Logger.getLogger( TheBlobInformationHandler.class.getName() );

	@Override
	String getID() {
		return TheBlobInformationView.ID;
	}

	@Override
	Logger getLogger() {
		return LOGGER;
	}
}
