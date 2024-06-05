package test;

import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

@Critical(secrecy = "secrecyCritical(String):void", integrity = "integrityCritical(String):void")
public class Supplier {
	
	@Secrecy
	public static void secrecyAnnoation(String value) {
		System.out.println(value);
	}

	public static void secrecyCritical(String value) {
		
	}
	
	@Integrity
	public static void integrityAnnotation(String value) {
		
	}
	
	public static void integrityCritical(String value) {
		
	}
}
