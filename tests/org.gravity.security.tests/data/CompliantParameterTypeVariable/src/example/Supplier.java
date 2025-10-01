package example;

import java.util.List;

import org.gravity.security.annotations.requirements.Secrecy;

public class Supplier {

	@Secrecy
	public boolean method1(List<String> in) {
		return in != null;
	}
	
	@Secrecy
	public boolean method2(List<List<String>> in) {
		return in != null;
	}
}
