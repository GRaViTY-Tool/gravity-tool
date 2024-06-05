package test;

import org.gravity.security.annotations.requirements.Critical;

@Critical(secrecy =  {"Default()","Public()"})
public class Main {
	
	public static void main(String[] args) {
		new Default(); // the class Default is not on a sufficient security level
		new Public(); // the class Public is not on a sufficient security level
		new Secure();
		new SecureDefault();
	}
}
