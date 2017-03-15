package org.gravity.hulk.testproject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.HashSet;
import java.util.Set;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;

public class SecureConnection implements Runnable{


	public static SecureRandom getSecureRandom(){
		 return SecureRandomGenerator.getSecureRandom();
	}
	
	
	private DataInputStream din;
	private DataOutputStream dout;
	private KeyStore clientKeyStore;
	private KeyStore serverKeyStore;
	private SSLContext sslContext;
	private Set postings = new HashSet();
	private String host;
	private int port;
	
	public SecureConnection(String host, int port){
		this.host = host;
		this.port = port;
	}
	
	public void setupClientKeyStore(String passphrase) throws GeneralSecurityException, IOException{
		clientKeyStore = KeyStore.getInstance( "JKS" );
	    clientKeyStore.load( new FileInputStream( "client.private" ),
	    		passphrase.toCharArray() );
	}
	
	public DataInputStream getDin() {
		return din;
	}
	public void setDin(DataInputStream din) {
		this.din = din;
	}
	public DataOutputStream getDout() {
		return dout;
	}
	public void setDout(DataOutputStream dout) {
		this.dout = dout;
	}
	public KeyStore getClientKeyStore() {
		return clientKeyStore;
	}
	public void setClientKeyStore(KeyStore clientKeyStore) {
		this.clientKeyStore = clientKeyStore;
	}
	public KeyStore getServerKeyStore() {
		return serverKeyStore;
	}
	public void setServerKeyStore(KeyStore serverKeyStore) {
		this.serverKeyStore = serverKeyStore;
	}
	public SSLContext getSslContext() {
		return sslContext;
	}
	public void setSslContext(SSLContext sslContext) {
		this.sslContext = sslContext;
	}
	public Set getPostings() {
		return postings;
	}
	public void setPostings(Set postings) {
		this.postings = postings;
	}
	  public void run() {
		    while (true) {
		        //read din
		      }
		  }
	public KeyManagerFactory createKeyManagerFactory(String passphrase) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
		KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
	    kmf.init( getClientKeyStore(), passphrase.toCharArray() );
	    return kmf;
	}


	  

}
