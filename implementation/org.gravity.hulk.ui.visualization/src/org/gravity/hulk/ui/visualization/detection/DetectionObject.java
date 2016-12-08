package org.gravity.hulk.ui.visualization.detection;

import java.util.HashMap;
import java.util.Map;

public class DetectionObject {

	private String type;
	private Map<String, String> detections;
	private Map<String, String> thresholds;
	private String fullInformationString;
	
	public DetectionObject() {
		detections = new HashMap<String, String>();
		thresholds = new HashMap<String, String>();
		type = null;
		fullInformationString = null;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public void setDetections(Map<String, String> detections){
		this.detections.clear();
		this.detections.putAll(detections);
	}
	
	public void setThresholds(Map<String, String> thresholds){
		this.thresholds.clear();
		this.thresholds.putAll(thresholds);
	}
	
	public void setFullInformationString(String fullInformationString){
		this.fullInformationString = fullInformationString;
	}
	
	public String getType(){
		return type;
	}
	
	public Map<String, String> getDetections(){
		return detections;
	}
	
	public Map<String, String> getThresholds(){
		return thresholds;
	}
	
	public String getFullInformationString(){
		return fullInformationString;
	}
	
	
}
