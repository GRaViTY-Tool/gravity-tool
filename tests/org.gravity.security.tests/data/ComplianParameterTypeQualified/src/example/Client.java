package example;

import org.gravity.security.annotations.requirements.Critical;

@Critical(secrecy = {"method1(Other):boolean","method2(other.Other):boolean"})
public class Client {

	public void call(Supplier s) {
		s.method1(new other.Other());
		s.method2(new other.Other());
	}
}
