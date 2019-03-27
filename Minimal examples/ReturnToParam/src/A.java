/**
 * 
 * Simple flow from a return value to a method parameter.
 *
 */
public class A {
	
	public int m() {
		return 5;
	}
	
	public int n(int a) {
		return 7;
	}
	
	public void p() {
		n(m());
	}
}
