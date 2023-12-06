package example;

import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class Supplier {

	@Integrity@Secrecy
	public boolean method(boolean[] array) {
		return true;
	}
}
