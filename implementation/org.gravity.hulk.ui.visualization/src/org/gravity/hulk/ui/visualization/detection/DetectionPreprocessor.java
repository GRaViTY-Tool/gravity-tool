package org.gravity.hulk.ui.visualization.detection;

import java.util.List;
import java.util.Map;

import org.gravity.hulk.antipatterngraph.HAntiPatternGraph;
import org.gravity.hulk.ui.visualization.util.Flaws;

public abstract class DetectionPreprocessor {
	public abstract Map<Flaws, List<DetectionObject>> preprocessDetections(HAntiPatternGraph apg);
}
