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
	private List<Contact> contacts= new ArrayList<Contact>();
	private List<Appointment> appointments= new ArrayList<Appointment>();
	
	private SecureConnection connection;
	
	//---------------------------- Secure Connection-----
	
	private void createSecureConnection(String host, int port){
		connection = new SecureConnection(host, port);
		connect(host, port);
		new Thread( connection ).start();
	}
	
	private void CreateSecureRandom(){
		SecureRandom secureRandom = new SecureRandom();
	    secureRandom.nextInt();
	    SecureConnection.setSecureRandom(secureRandom);
	}
	
	  private void setupServerKeystore() throws GeneralSecurityException, IOException {
		    KeyStore serverKeyStore = KeyStore.getInstance( "JKS" );
		    serverKeyStore.load( new FileInputStream( "server.public" ), 
		                        "public".toCharArray() );
		    connection.setServerKeyStore(serverKeyStore);
		    
	  }
	  
	  private void setupSSLContext() throws GeneralSecurityException, IOException {
		    TrustManagerFactory tmf = TrustManagerFactory.getInstance( "SunX509" );
		    tmf.init( connection.getServerKeyStore());

		    
		    KeyManagerFactory kmf = connection.createKeyManagerFactory();
		    SSLContext sslContext = SSLContext.getInstance( "TLS" );
		    sslContext.init( kmf.getKeyManagers(),
		                     tmf.getTrustManagers(),
		                     connection.getSecureRandom() );
		    
		    connection.setSslContext(sslContext);
		  }
	
	
	private void connect(String host, int port){
	    try {
	        setupServerKeystore();
	        connection.setupClientKeyStore();
	        setupSSLContext();

	        SSLSocketFactory sf = connection.getSslContext().getSocketFactory();
	        SSLSocket socket = (SSLSocket)sf.createSocket( host, port );

	        InputStream in = socket.getInputStream();
	        OutputStream out = socket.getOutputStream();

	        connection.setDin(new DataInputStream( in ));
	        connection.setDout(new DataOutputStream( out ));
	      } catch( GeneralSecurityException gse ) {
	        gse.printStackTrace();
	      } catch( IOException ie ) {
	        ie.printStackTrace();
	      }
	}
	
	
	
	//----------------------------------------------------
	
	
	
	public static void main(String[] args) {
		MailApp app = new MailApp();
		while(true){
			app.run();
		}
	}
	
	private void run() {
		send();
	}

	public void createContact(String email, String name, String surname){
		Contact contact = new Contact();
				contact.setEmail(email);
				contact.setName(name);
				contact.setSurname(surname);
		contacts.add(contact);
	}
	
	public void createContact(String email, String name, String surname, String location){
		ContactWithPicture contact = new ContactWithPicture();
				contact.setEmail(email);
				contact.setName(name);
				contact.setSurname(surname);
				contact.setLocation(location);
		contacts.add(contact);
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
	
	public void createAppointment(String title, String location, long date,List<Contact> participants){
		Appointment appointment = new Appointment();
		appointment.setDate(date);
		appointment.setLocation(location);
		appointment.setTitle(title);
		appointment.setParticipants(participants);
		appointments.add(appointment);
	}

}
