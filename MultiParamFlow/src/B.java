/**
 * 
 * Order-sensitive flow of multiple parameters into the same node.
 *
 */
public class B {
	
	// Secrecy
	int f = 2;

	public int x(int a, int b) {
		System.out.println("DO");
		return n(a, b + f) + f;
	}
	
	public void m(int a, int b) {
		n(a, b);
	}
	
	public int n(int c, int d) {
		System.out.println(d);
		return c / d;
	}
}
