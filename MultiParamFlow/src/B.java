/**
 * 
 * Order-sensitive flow of multiple parameters into the same node.
 *
 */
public class B {

	public void m(int a, int b) {
		n(a, b);
	}
	
	public int n(int c, int d) {
		return c / d;
	}
}
