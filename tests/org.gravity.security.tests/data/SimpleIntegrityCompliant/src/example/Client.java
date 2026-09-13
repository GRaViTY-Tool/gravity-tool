package example;

import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Integrity;

@Critical(integrity = "method(boolean):boolean")
public class Client {

	public void call(Supplier s) {
		s.method(false);
	}
}
