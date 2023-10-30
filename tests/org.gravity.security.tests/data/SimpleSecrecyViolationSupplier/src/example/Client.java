package example;

import org.gravity.security.annotations.requirements.Critical;

@Critical(secrecy = "method(boolean):boolean")
public class Client {

	public void call(Supplier s) {
		s.method(false);
	}
}
