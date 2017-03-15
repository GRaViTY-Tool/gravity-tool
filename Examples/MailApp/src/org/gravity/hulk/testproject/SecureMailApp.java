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
import java.util.List;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

public class SecureMailApp extends MailApp {
	private SecureConnection connection;
	String passphrase = "clientPW";
	
	//---------------------------- Secure Connection-----
	
		private void createSecureConnection(String host, int port){
			connection = new SecureConnection(host, port);
			connect(host, port);
			new Thread( connection ).start();
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

			    
			    KeyManagerFactory kmf = connection.createKeyManagerFactory(passphrase);
			    SSLContext sslContext = SSLContext.getInstance( "TLS" );
			    sslContext.init( kmf.getKeyManagers(),
			                     tmf.getTrustManagers(),
			                     SecureRandomGenerator.getSecureRandom() );
			    
			    connection.setSslContext(sslContext);
			  }
		
		
		private void connect(String host, int port){
		    try {
		        setupServerKeystore();
		        connection.setupClientKeyStore(passphrase);
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
		
		@Override
		public Appointment createAppointment(String title, String location, long date,List<Contact> participants){
			Appointment appointment = new Appointment();
			appointment.setDate(date);
			appointment.setLocation(location);
			appointment.setTitle(title);
			appointment.setParticipants(participants);
			return appointment;
		}

}
