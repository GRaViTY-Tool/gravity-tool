/**
 * 
 * Order-sensitive flow of multiple parameters into the same node.
 *
 */
public class B {
	
	// Secrecy
	int e = 2;

	public int m(int a, int b) {
		System.out.println("DO");
		return n(a, b + e) + e;
	}
	
	public int n(int c, int d) {
		System.out.println(d);
		return c / d;
	}
}
