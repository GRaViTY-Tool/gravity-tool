package example;

import org.gravity.security.annotations.requirements.Integrity;

public class Supplier {

	@Integrity
	public boolean method(boolean in) {
		return in;
	}
}
