package example;

import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class OuterSupplier {

	@Secrecy@Integrity
	public static void method() {
		
	}
	
	public class InnerSupplier {
		public static void method() {
			
		}
	}
}
