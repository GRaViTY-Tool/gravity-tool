package org.gravity.hulk.ui.visualization.detection;

import java.util.Map;

import org.gravity.hulk.ui.visualization.util.Flaws;

public class DetectionObject {

	private final Flaws type;
	private final Map<String, String> detections;
	private final Map<String, Number> thresholds;
	private final String fullInformationString;
	
	public DetectionObject(Map<String, String> detections, Map<String, Number> thresholds,
			String fullInformationString, Flaws type) {
		this.detections = detections;
		this.thresholds =thresholds;
		this.type = type;
		this.fullInformationString = fullInformationString;
	}
	
	public Flaws getType(){
		return type;
	}
	
	public Map<String, String> getDetections(){
		return detections;
	}
	
	public Map<String, Number> getThresholds(){
		return thresholds;
	}
	
	public String getFullInformationString(){
		return fullInformationString;
	}
	
	
}
