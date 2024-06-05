package test;

import org.gravity.security.annotations.requirements.Critical;

@Critical(secrecy = "method2(String):String")
public class Supplier {

	public static String method1(String s) {
		return s;
	}
	
	public static String method2(String s) {
		return s;
	}
}
