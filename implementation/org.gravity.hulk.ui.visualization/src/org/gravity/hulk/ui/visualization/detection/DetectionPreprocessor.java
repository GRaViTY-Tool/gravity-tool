package org.gravity.hulk.ui.visualization.detection;

import java.util.List;
import java.util.Map;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.ui.visualization.util.GlobalStrings;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;

public abstract class DetectionPreprocessor {

	protected String createDetectionString(TClass tClass) {
		TPackage tPackage = tClass.getPackage();

		String detectionString = "";

		if (tPackage != null) {
			while (tPackage != null) {
				if (!tPackage.getTName().contains("$"))
					detectionString = tPackage.getTName() + "." + detectionString;
				tPackage = tPackage.getParent();
			}
			detectionString = detectionString.substring(0, detectionString.length() - 1);
			detectionString = detectionString + ":";
		}
		detectionString = detectionString + tClass.getTName();
		return detectionString;
	}

	public abstract Map<GlobalStrings, List<DetectionObject>> preprocessDetections(HAntiPatternGraph apg);
}
