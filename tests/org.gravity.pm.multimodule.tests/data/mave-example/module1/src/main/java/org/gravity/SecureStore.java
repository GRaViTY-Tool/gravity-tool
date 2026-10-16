package org.gravity;

import org.apache.logging.log4j.Logger;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;

//&begin[Secure_Storage]
public class SecureStore {

	private static final Logger LOGGER = LogManager.getLogger(SecureStore.class);

	private final byte[] secret;
	private final byte[] otp; //&line[OneTimePad]
	private List<Long> allowed;

	public SecureStore(byte[] secret, long[] allowed) {
		//&begin[OneTimePad]
		new SecureRandom().nextBytes(otp = new byte[secret.length]);
		this.secret = CryptoImplementation.oneTimePad(secret, otp);
		//&end[OneTimePad]
		
		LOGGER.debug("Stored the encrypted secret: "+ this.secret);
		this.allowed = (List<Long>) Arrays.stream(allowed).boxed().collect(Collectors.toList());
	}
	
	public String readSecret(long id) {
		if(allowed.contains(id)) {
			LOGGER.debug("Access by "+id+" granted."); //&line[Logging]
			return new String(CryptoImplementation.oneTimePad(secret, otp)); //&line[OneTimePad]
		}
		LOGGER.error("Illegal access by "+id+" prevented."); //&line[Logging]
		throw new SecurityException("Not in allowed list.");
	}
}
//&end[Secure_Storage]