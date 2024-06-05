package example;

import org.gravity.security.annotations.requirements.Secrecy;

public class Supplier<T> {

	@Secrecy
	public boolean method(T in) {
		return in != null;
	}
	
	@Secrecy
	public <V extends Supplier<T>> boolean method(V in) {
		return true;
	}
}
