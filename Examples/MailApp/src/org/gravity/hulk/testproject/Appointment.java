package org.gravity.hulk.testproject;

import java.util.List;

public class Appointment {

	private long date;
	private String location;
	private String title;
	private  List<Contact> participants;
	
	public long getDate() {
		return date;
	}
	public void setDate(long date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Contact> getParticipants() {
		return participants;
	}
	public void setParticipants(List<Contact> participants) {
		this.participants = participants;
	}
}
