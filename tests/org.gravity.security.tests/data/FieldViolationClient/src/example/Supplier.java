package example;

import org.gravity.security.annotations.requirements.Critical;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

@Critical(secrecy = { "field:String", "field2:String" }, integrity = { "field:String", "field2:String" })
public class Supplier {

	@Secrecy
	@Integrity
	public String field;

	public String field2;
}
