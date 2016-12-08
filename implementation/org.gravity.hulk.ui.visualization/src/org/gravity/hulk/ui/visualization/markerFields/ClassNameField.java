package org.gravity.hulk.ui.visualization.markerFields;

import org.eclipse.ui.views.markers.MarkerField;
import org.eclipse.ui.views.markers.MarkerItem;

public class ClassNameField extends MarkerField {

	@Override
	public String getValue(MarkerItem item) {
		return item.getMarker().getAttribute("org.gravity.hulk.ui.visualization.className","-").toString();
	}

}
