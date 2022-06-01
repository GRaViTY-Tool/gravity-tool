/**
 * 
 * Simple flow from a method's return value to a field.
 *
 */
public class A {
	
	int a = m();
	
	public int m() {
		return 5;
	}
}
