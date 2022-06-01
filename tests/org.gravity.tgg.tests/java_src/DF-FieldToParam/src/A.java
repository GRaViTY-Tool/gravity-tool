/**
 * 
 * Simple flow from a field to a method parameter.
 *
 */
public class A {

	int a = 0;
	
	public int m(int b) {
		return 5;
	}
	
	public void n() {
		m(a);
	}
}
