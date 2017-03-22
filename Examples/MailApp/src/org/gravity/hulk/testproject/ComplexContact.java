package org.gravity.hulk.testproject;

public class ComplexContact extends Contact {

	private String[] name;

	public String getName() {
		String fullname = "";
		for(String part: name){
			fullname+=part+' ';
		}
		return fullname;
	}

	public void setName(String name) {
		this.name = name.split(" ");
	}
}
