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
	
	public ComplexContact createContact(String email, String name, String surname){
		ComplexContact contact = new ComplexContact();
		contact.setEmail(email);
		contact.setName(name);
		contact.setSurname(surname);
		return new ComplexContact();
	}
}
