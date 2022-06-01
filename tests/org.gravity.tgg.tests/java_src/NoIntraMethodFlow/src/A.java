/**
 * 
 * An example without intra-procedural data flow.
 *
 */
public class A {
	
	public static void main(String[] args) {
		System.out.println(new A().m());
	}
	
	public int m() {
		return 5;
	}
}
