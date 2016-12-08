package org.gravity.hulk.ui.visualization.views;

import org.gravity.hulk.ui.visualization.information.providers.SwissArmyKnifeContentProvider;

public class SwissArmyKnifInformationView extends InformationView {

	public static final String ID = "org.gravity.hulk.ui.visualization.views.SwissArmyKnifeInformationView";

	public SwissArmyKnifInformationView() {
		this.informationProvider = new SwissArmyKnifeContentProvider();
	}

}
