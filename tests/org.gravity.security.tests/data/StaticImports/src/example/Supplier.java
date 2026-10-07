package example;

import java.util.*;

import org.gravity.security.annotations.requirements.Secrecy;

public class Supplier {

	@Secrecy
	public static List<String> method()  {
		return null;
	}
}
