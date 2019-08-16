package org.gravity.hulk.ui.visualization.detection;

import java.util.Map;

import org.gravity.hulk.ui.visualization.util.Flaws;
import org.gravity.typegraph.basic.TAbstractType;

public class DetectionObject {

	private final Flaws type;
	private final Map<TAbstractType, String> detections;
	private final Map<String, Number> thresholds;
	private final String fullInformationString;

	public DetectionObject(Map<TAbstractType, String> detections, Map<String, Number> thresholds, String fullInformationString,
			Flaws type) {
		this.detections = detections;
		this.thresholds = thresholds;
		this.type = type;
		this.fullInformationString = fullInformationString;
	}

	public Flaws getType() {
		return type;
	}

	public Map<TAbstractType, String> getDetections() {
		return detections;
	}

	public Map<String, Number> getThresholds() {
		return thresholds;
	}

	public String getFullInformationString() {
		return fullInformationString;
	}

}
