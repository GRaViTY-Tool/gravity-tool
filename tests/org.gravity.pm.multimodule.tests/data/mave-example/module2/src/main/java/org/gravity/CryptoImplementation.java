package org.gravity;

public class CryptoImplementation {

	//&begin[OneTimePad]
	public static byte[] oneTimePad(byte[] input, byte[] key) {
	    if (input.length != key.length) {
	        throw new IllegalArgumentException("Key must match input length");
	    }

	    byte[] output = new byte[input.length];

	    for (int i = 0; i < input.length; i++) {
	        output[i] = (byte) (input[i] ^ key[i]);
	    }

	    return output;
	}
	//&end[OneTimePad]
}
