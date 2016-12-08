package org.gravity.hulk.ui.visualization.views;

import org.gravity.hulk.ui.visualization.information.providers.TheBlobContentProvider;

public class TheBlobInformationView extends InformationView {

	public static final String ID = "org.gravity.hulk.ui.visualization.views.TheBlobInformationView";
	
	public TheBlobInformationView() {
		this.informationProvider = new TheBlobContentProvider();
	}
}
