package example;

import org.gravity.security.annotations.requirements.Critical;

import example.OuterSupplier.InnerSupplier;

@Critical(secrecy = "method()")
public class OuterClient {

	class InnerClient {
		public void call() {
			OuterSupplier.method();
			InnerSupplier.method();
		}
	}
}
