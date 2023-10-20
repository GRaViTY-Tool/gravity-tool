package example;

import org.gravity.security.annotations.requirements.Secrecy;

public class Supplier {

	@Secrecy
	public boolean method(boolean in) {
		return in;
	}
}
