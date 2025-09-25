package test;

import org.gravity.security.annotations.requirements.Secrecy;

public class ParameterizedClass {

	@Secrecy
	public <T> T fwd1(T object) {
		return object;
	}

	@Secrecy
	public <T> T fwd2(T object) {
		return object;
	}
}
