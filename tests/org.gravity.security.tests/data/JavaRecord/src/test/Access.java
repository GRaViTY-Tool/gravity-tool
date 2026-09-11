package test;

import org.gravity.security.annotations.requirements.Critical;

@Critical(integrity = "secret:String")
public class Access {

	public static void main(String[] args) {
		var object = new ExampleRecord("secret", 0);
		System.out.println(object.secret());
	}
}
