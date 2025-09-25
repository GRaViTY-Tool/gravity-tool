package example;

import org.gravity.security.annotations.requirements.Critical;

@Critical(secrecy = {"method(Object):boolean","method(Supplier):boolean"})
public class Client {

	public void call(Supplier<Boolean> s) {
		s.method(false);
		s.method(s);
	}
}
