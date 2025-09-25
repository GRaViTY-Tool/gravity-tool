package example;

import org.gravity.security.annotations.requirements.Critical;

@Critical(secrecy = { "method1(Other):boolean", "method2(other.Other):boolean", "field:other.Other" })
public class Client {

	public void call(Supplier s) {
		other.Other o = new other.Other();
		s.method1(o);
		s.method2(o);
		System.out.println(s.field);
	}
}
