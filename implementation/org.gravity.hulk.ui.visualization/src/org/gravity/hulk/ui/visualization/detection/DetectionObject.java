package org.gravity.hulk.ui.visualization.detection;

import java.util.Map;

import org.gravity.hulk.ui.visualization.util.GlobalStrings;

public class DetectionObject {

	final private GlobalStrings type;
	final private Map<String, String> detections;
	final private Map<String, Number> thresholds;
	final private String fullInformationString;
	
	public DetectionObject(Map<String, String> detections, Map<String, Number> thresholds,
			String fullInformationString, GlobalStrings type) {
		this.detections = detections;
		this.thresholds =thresholds;
		this.type = type;
		this.fullInformationString = fullInformationString;
	}
	
	public GlobalStrings getType(){
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
