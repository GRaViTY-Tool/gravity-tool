/**
 * 
 * Flow from an assignment to a method invocation, where the assignment acts as the argument of the invocation.
 *
 */
public class A {

	public static void main(String[] args) {
		int i = 3;
		
		m(i+=2);
	}

	private static void m(int i) {
		System.out.println(i);
	}

}
