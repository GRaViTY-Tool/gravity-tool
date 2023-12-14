package test;

import org.gravity.security.annotations.requirements.Critical;

@Critical(secrecy = { "test.Supplier.method1(java.lang.String):java.lang.String",
		"test.Supplier.method2(java.lang.String):java.lang.String" })
public class Main {

	public static void main(String[] args) {
		Supplier.method1("");
		Supplier.method2("");
	}
}
