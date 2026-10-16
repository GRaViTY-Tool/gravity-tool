package org.gravity;

public class Main {

	public static void main(String[] args) {
		SecureStore manager = new SecureStore("the secret value".getBytes(), new long[] {0});
		
		System.out.println(manager.readSecret(0));
		System.out.println(manager.readSecret(1));
	}

}
