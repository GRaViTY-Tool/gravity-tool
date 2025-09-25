package example;

import org.gravity.security.annotations.requirements.Critical;

@Critical(secrecy = { "field:String", "field2:String" }, integrity = { "field:String", "field2:String" })
public class Client {

	public void method(Supplier s) {
		System.out.println(s.field);
		System.out.println(s.field2);
	}
}
