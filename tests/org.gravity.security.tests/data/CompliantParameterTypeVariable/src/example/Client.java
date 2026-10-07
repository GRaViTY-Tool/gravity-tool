package example;

import java.util.ArrayList;

import org.gravity.security.annotations.requirements.Critical;

@Critical(secrecy = {"method1(List):boolean", "method2(List<List<String>>):boolean"})
public class Client {

	public void call(Supplier s) {
		s.method1(new ArrayList<>());
		s.method2(new ArrayList<>());
	}
}
