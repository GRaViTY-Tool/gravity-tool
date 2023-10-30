package example;

import org.gravity.security.annotations.requirements.Secrecy;

public class Supplier {

	@Secrecy
	public void method(boolean b, int i, long l, float f, double d, byte by, char c, short s) {
		
	}
}
