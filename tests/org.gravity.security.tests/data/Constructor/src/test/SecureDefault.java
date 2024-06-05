package test;

import org.gravity.security.annotations.requirements.Critical;

@Critical(secrecy = "SecureDefault()")
public class SecureDefault {
	// Only the default constructor is available
}
