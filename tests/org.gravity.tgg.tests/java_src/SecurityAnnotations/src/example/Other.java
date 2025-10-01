package example;

import org.gravity.security.annotations.Tainted;
import org.gravity.security.annotations.access.Api;

public class Other {

	@Tainted
	private String s;

	@Api
	public void other() {

	}
}
