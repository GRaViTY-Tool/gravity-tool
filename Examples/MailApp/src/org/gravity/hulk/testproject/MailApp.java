package org.gravity.hulk.testproject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

public class MailApp {

	private List<Message> inbox= new ArrayList<Message>();
	private List<Message> outbox= new ArrayList<Message>();
	protected List<Contact> contacts= new ArrayList<Contact>();
	private List<Appointment> appointments= new ArrayList<Appointment>();
	
	public static void main(String[] args) {
		MailApp app = new MailApp();
		
		app.addContact("Hans@yahoo.de", "Hans" , "Müller");
		
		while(true){
			app.run();
		}
	}
	
	private void run() {
		send();
	}

	public Contact createContact(String email, String name, String surname){
		Contact contact = new Contact();
				contact.setEmail(email);
				contact.setName(name);
				contact.setSurname(surname);
				return contact;
	}
	
	public void addContact(String email, String name, String surname){
		contacts.add(createContact(email, name, surname));
	}
	
	
	public void addContact(String email, String name, String surname, String location){
		contacts.add(createContact(email, name, surname));
	}
	
	public void writeMessage(String[] email, String title, String text){
		Message message = new Message();
		message.setReceivers(email);
		message.setTitle(title);
		message.setText(text);
		
		outbox.add(message);
	}
	
	public void send(){
		outbox.clear();
	}
	
	public void addAppointment(String title, String location, long date,List<Contact> participants){
		appointments.add(createAppointment(title, location, date, participants));
	}
	public Appointment createAppointment(String title, String location, long date,List<Contact> participants){
		Appointment appointment = new Appointment();
		appointment.setDate(date);
		appointment.setLocation(location);
		appointment.setTitle(title);
		appointment.setParticipants(participants);
		return  appointment;
	}

}
