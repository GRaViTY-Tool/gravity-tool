package example;

import org.gravity.security.annotations.requirements.Critical;

@Critical(secrecy = { "field:String" }, integrity = { "field:String" })
public class Client {

	public void method(Supplier s) {
		System.out.println(s.field);
	}
}
