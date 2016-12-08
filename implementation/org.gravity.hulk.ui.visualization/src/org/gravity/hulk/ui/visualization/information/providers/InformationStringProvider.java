package org.gravity.hulk.ui.visualization.information.providers;

import org.gravity.hulk.antipatterngraph.HAnnotation;

public interface InformationStringProvider {
	
	public String getInformationString(HAnnotation annotation, boolean printHeader, int annotationID);

}
