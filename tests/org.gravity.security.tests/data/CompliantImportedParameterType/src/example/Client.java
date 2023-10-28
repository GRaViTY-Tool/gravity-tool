package example;

import org.gravity.security.annotations.requirements.Critical;

import other.Other;

@Critical(secrecy = "method(Other):boolean")
public class Client {

	public void call(Supplier s) {
		s.method(new Other());
	}
}
