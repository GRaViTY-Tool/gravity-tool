/**
 * 
 * Multiple flows resulting in a single effective flow from the method's parameter to its return value.
 *
 */
public class A {
	
	public int m(int a) {
		if (a >= 100) {
			return 100;
		}
		int b = a + 2;
		return m(b);
	}
	
}
