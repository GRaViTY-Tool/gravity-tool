package org.gravity.hulk.ui.visualization.information.providers;

import org.gravity.hulk.antipatterngraph.HAnnotation;
import org.gravity.hulk.ui.visualization.util.Flaws;

public interface InformationStringProvider {
	
	public String getInformationString(HAnnotation annotation, boolean printHeader, Flaws flaw);

}
