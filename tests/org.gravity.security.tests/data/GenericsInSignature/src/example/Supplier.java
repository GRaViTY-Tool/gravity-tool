package example;

import java.util.List;

import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class Supplier {

	@Integrity@Secrecy
	public boolean method(List<List<String>> list) {
		return true;
	}
}
