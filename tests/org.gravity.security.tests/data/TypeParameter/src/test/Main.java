package test;

import org.gravity.security.annotations.requirements.Critical;

@Critical(secrecy ="fwd2(Object):Object", integrity ="fwd1(Object):Object")
public class Main {

	public static void main(String[] args) {
		ParameterizedClass object = new ParameterizedClass();
		object.fwd1("Hello World");
		object.fwd2("Hello World");
		
		var child = new Child();
		child.fwd1("Hello World");
	}

}
