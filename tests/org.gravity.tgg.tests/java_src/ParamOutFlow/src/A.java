/**
 * 
 * Flow from parameter to parameter.
 *
 */
public class A {
	
	public int m(int a) {
		a = m(4);
		return a;
	}
	
	public A n(A a) {
		a = n(new A());
		return a;
	}
	
	public A o(A a) {
		a = new A();
		return a;
	}
}
