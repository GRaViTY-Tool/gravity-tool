package org.gravity.hulk.testproject;

public class MultiNameContact extends Contact {

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
	
	public MultiNameContact createContact(String email, String name, String surname){
		MultiNameContact contact = new MultiNameContact();
		contact.setEmail(email);
		contact.setName(name);
		contact.setSurname(surname);
		return new MultiNameContact();
	}
}
