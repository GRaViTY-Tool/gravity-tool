package org.gravity.hulk.ui.visualization.handlers.views;

import org.apache.log4j.Logger;

import org.gravity.hulk.ui.visualization.views.SpaghettiCodeInformationView;

public class SpaghettiCodeInformationHandler extends AbstractShowViewHandler {
	
	private static final Logger LOGGER = Logger.getLogger( SpaghettiCodeInformationHandler.class.getName() );

	@Override 
	String getID() {
		return SpaghettiCodeInformationView.ID;
	}

	@Override
	Logger getLogger() {
		return LOGGER;
	}
}
