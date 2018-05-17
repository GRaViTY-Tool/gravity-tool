package org.gravity.metrics.sourcemeter;

public enum SourcemeterMetricKeys {

	LCOM5(18, "lcom"), CBO(22, "cbo");
	
	private int row;
	private String name;
	
	SourcemeterMetricKeys(int value, String name) {
		this.row = value;
		this.name = name;
	}

	public int getRow() {
		return row;
	}
	
	public String getName(){
		return name;
	}
	
	@Override
	public String toString() {
		return getName();		
	}
	
}
