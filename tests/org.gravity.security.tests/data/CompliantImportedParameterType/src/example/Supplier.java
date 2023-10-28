package example;

import org.gravity.security.annotations.requirements.Secrecy;

import other.Other;

public class Supplier {

	@Secrecy
	public boolean method(Other in) {
		return in != null;
	}
}
