package org.gravity.hulk.ui.visualization.views;

import org.gravity.hulk.ui.visualization.information.providers.SpaghettiCodeContentProvider;

public class SpaghettiCodeInformationView extends InformationView {

	public static final String ID = "org.gravity.hulk.ui.visualization.views.SpaghettiCodeInformationView";
	
	public  SpaghettiCodeInformationView() {
		this.informationProvider = new SpaghettiCodeContentProvider();
	}

}
