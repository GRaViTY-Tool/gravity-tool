package example;

import org.gravity.security.annotations.requirements.Secrecy;

public class Supplier {

	@Secrecy
	public boolean method1(other.Other in) {
		return in != null;
	}
	
	@Secrecy
	public boolean method2(other.Other in) {
		return in != null;
	}
}
