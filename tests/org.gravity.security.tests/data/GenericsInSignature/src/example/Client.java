package example;

import java.util.ArrayList;

import org.gravity.security.annotations.requirements.Critical;

@Critical(integrity = "method(List):boolean")
public class Client {

	public void call(Supplier s) {
		s.method(new ArrayList<>());
	}
}
